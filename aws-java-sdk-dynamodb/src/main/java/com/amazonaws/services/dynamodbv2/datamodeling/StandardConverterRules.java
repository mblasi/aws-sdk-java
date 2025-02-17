/*
 * Copyright 2016-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.datamodeling;

import static com.amazonaws.services.dynamodbv2.datamodeling.StandardAttributeTypes.AttributeType.B;
import static com.amazonaws.services.dynamodbv2.datamodeling.StandardAttributeTypes.AttributeType.BOOL;
import static com.amazonaws.services.dynamodbv2.datamodeling.StandardAttributeTypes.AttributeType.BS;
import static com.amazonaws.services.dynamodbv2.datamodeling.StandardAttributeTypes.AttributeType.L;
import static com.amazonaws.services.dynamodbv2.datamodeling.StandardAttributeTypes.AttributeType.M;
import static com.amazonaws.services.dynamodbv2.datamodeling.StandardAttributeTypes.AttributeType.N;
import static com.amazonaws.services.dynamodbv2.datamodeling.StandardAttributeTypes.AttributeType.NULL;
import static com.amazonaws.services.dynamodbv2.datamodeling.StandardAttributeTypes.AttributeType.NS;
import static com.amazonaws.services.dynamodbv2.datamodeling.StandardAttributeTypes.AttributeType.S;
import static com.amazonaws.services.dynamodbv2.datamodeling.StandardAttributeTypes.AttributeType.SS;
import static com.amazonaws.services.dynamodbv2.datamodeling.StandardTypeConverters.Scalar.BOOLEAN;
import static com.amazonaws.services.dynamodbv2.datamodeling.StandardTypeConverters.Scalar.BYTE_BUFFER;
import static com.amazonaws.services.dynamodbv2.datamodeling.StandardTypeConverters.Scalar.DEFAULT;
import static com.amazonaws.services.dynamodbv2.datamodeling.StandardTypeConverters.Scalar.STRING;
import static com.amazonaws.services.dynamodbv2.datamodeling.StandardTypeConverters.Vector.LIST;
import static com.amazonaws.services.dynamodbv2.datamodeling.StandardTypeConverters.Vector.MAP;
import static com.amazonaws.services.dynamodbv2.datamodeling.StandardTypeConverters.Vector.SET;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperFieldModel.DynamoDBAttributeType;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperFieldModel.Properties;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperFieldModel.Reflect;
import com.amazonaws.services.dynamodbv2.datamodeling.StandardAttributeTypes.AttributeType;
import com.amazonaws.services.dynamodbv2.datamodeling.StandardBeanProperties.Bean;
import com.amazonaws.services.dynamodbv2.datamodeling.StandardParameterTypes.ParamType;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Pre-defined strategies for mapping between Java types and DynamoDB types.
 */
@SdkInternalApi
final class StandardConverterRules {

    private static final Log LOG = LogFactory.getLog(StandardConverterRules.class);

    /**
     * Creates a new set of conversion rules based on the configuration.
     */
    static final <V> RuleFactory<V> of(final DynamoDBMapperConfig config, final S3Link.Factory s3Links, final DynamoDBMapperModelFactory.Factory models) {
        final Rules<V> factory = new Rules<V>(StandardTypeConverters.factory().override()
            .with(String.class, S3Link.class, s3Links)
            .build());
        if (config.getConversionSchema() == ConversionSchemas.V1) {
            factory.with(factory.new NativeBool(true));
            factory.with(factory.new SimpleScalar(S));
            factory.with(factory.new SimpleScalar(N));
            factory.with(factory.new SimpleScalar(B));
            factory.with(factory.new SimpleScalarSet(SS));
            factory.with(factory.new SimpleScalarSet(NS));
            factory.with(factory.new SimpleScalarSet(BS));
            factory.with(factory.new ObjectStringSet());
        } else if (config.getConversionSchema() == ConversionSchemas.V2) {
            factory.with(factory.new NativeBool(false));
            factory.with(factory.new SimpleScalar(S));
            factory.with(factory.new SimpleScalar(N));
            factory.with(factory.new SimpleScalar(B));
            factory.with(factory.new NativeBoolSet());
            factory.with(factory.new SimpleScalarSet(SS));
            factory.with(factory.new SimpleScalarSet(NS));
            factory.with(factory.new SimpleScalarSet(BS));
            factory.with(factory.new ObjectSet());
            factory.with(factory.new ObjectList());
            factory.with(factory.new ObjectMap());
            factory.with(factory.new DocumentObjectMap(config, models));
        } else {
            factory.with(factory.new NativeBool(true));
            factory.with(factory.new SimpleScalar(S));
            factory.with(factory.new SimpleScalar(N));
            factory.with(factory.new SimpleScalar(B));
            factory.with(factory.new SimpleScalarSet(SS));
            factory.with(factory.new SimpleScalarSet(NS));
            factory.with(factory.new SimpleScalarSet(BS));
            factory.with(factory.new ObjectStringSet());
            factory.with(factory.new ObjectList());
            factory.with(factory.new ObjectMap());
            factory.with(factory.new DocumentObjectMap(config, models));
        }
        return factory;
    }

    /**
     * Groups the conversion rules to be evaluated.
     */
    private static final class Rules<V> implements RuleFactory<V> {
        private final Set<Rule<V>> rules = new LinkedHashSet<Rule<V>>();
        private final DynamoDBTypeConverterFactory scalars;

        /**
         * Constructs a new conversion evaluator with the specified scalar
         * type-converter factory.
         */
        private Rules(final DynamoDBTypeConverterFactory scalars) {
            this.scalars = scalars;
        }

        /**
         * Adds a conversion rule.
         */
        private Rules<V> with(final Rule<?> rule) {
            this.rules.add((Rule<V>)rule);
            return this;
        }

        /**
         * Returns the first conversion rule matching the specified type;
         * scalar attribute type may be specified to override the standard
         * source conversion, otherwise, it should be left as null.
         */
        private Rule<V> getRule(final ParamType<V> type, final Properties<?,V> props) {
            if (props.typeConverter() != null) {
                return new CustomTypeConverted(props);
            }
            for (final Rule<V> rule : rules) {
                if (rule.isAssignableFrom(type, props)) {
                    return rule;
                }
            }
            return new NotSupported();
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public Rule<V> getRule(final Bean<?,V> bean) {
            return getRule(bean.type(), bean);
        }

        /**
         * Custom type-converted conversion.
         */
        private final class CustomTypeConverted implements Rule<V> {
            private final DynamoDBTypeConverter<V,V> target;
            private final ParamType<V> sourceType;
            private final Rule<V> rule;
            private CustomTypeConverted(final Properties<?,V> props) {
                this.target = props.<V>typeConverter();
                this.sourceType = StandardParameterTypes.of(target);
                this.rule = getRule(sourceType, new Properties.Buildable(props).withTypeConverter(null));
            }
            @Override
            public boolean isAssignableFrom(final ParamType<?> type, final Properties<?,?> props) {
                return true;
            }
            @Override
            public DynamoDBTypeConverter<AttributeValue,V> newConverter(final ParamType<V> type) {
                final DynamoDBTypeConverter<AttributeValue,V> source = rule.newConverter(sourceType);
                return StandardTypeConverters.join(source, target);
            }
            @Override
            public DynamoDBAttributeType getAttributeType() {
                return rule.getAttributeType();
            }
        }

        /**
         * Native boolean conversion.
         */
        private final class NativeBool implements Rule<V> {
            private final boolean onlyIfOverride;
            private NativeBool(final boolean onlyIfOverride) {
                this.onlyIfOverride = onlyIfOverride;
            }
            @Override
            public boolean isAssignableFrom(final ParamType<?> type, final Properties<?,?> props) {
                if (props.attributeType() == null) {
                    return !onlyIfOverride && SET.is(type.type()) == false && BOOLEAN.is(type.type());
                }
                return props.attributeType() == getAttributeType();
            }
            @Override
            public DynamoDBTypeConverter<AttributeValue,V> newConverter(final ParamType<V> type) {
                return BOOL.join(BOOLEAN.join(type.type()));
            }
            @Override
            public DynamoDBAttributeType getAttributeType() {
                return BOOL.attributeType();
            }
        }

        /**
         * Scalar conversions.
         */
        private final class SimpleScalar implements Rule<V> {
            private final AttributeType attribute;
            private final Class<V> sourceType;
            private SimpleScalar(final AttributeType attribute) {
                this.sourceType = (attribute == B ? BYTE_BUFFER : STRING).<V>type();
                this.attribute = attribute;
            }
            @Override
            public boolean isAssignableFrom(final ParamType<?> type, final Properties<?,?> props) {
                if (props.attributeType() == null) {
                    return SET.is(type.type()) == false && type.scalar().is(attribute.scalarAttributeType());
                }
                return props.attributeType() == getAttributeType();
            }
            @Override
            public DynamoDBTypeConverter<AttributeValue,V> newConverter(final ParamType<V> type) {
                final DynamoDBTypeConverter<?,V> target = scalars.getConverter(sourceType, type.type());
                return attribute.join(target);
            }
            @Override
            public DynamoDBAttributeType getAttributeType() {
                return attribute.attributeType();
            }
        }

        /**
         * Scalar set conversions.
         */
        private final class SimpleScalarSet implements Rule<Collection<V>> {
            private final AttributeType attribute;
            private final Class<V> sourceType;
            private SimpleScalarSet(final AttributeType attribute) {
                this.sourceType = (attribute == BS ? BYTE_BUFFER : STRING).<V>type();
                this.attribute = attribute;
            }
            @Override
            public boolean isAssignableFrom(final ParamType<?> type, final Properties<?,?> props) {
                if (props.attributeType() == null) {
                    return SET.is(type.type()) && type.param(0).scalar().is(attribute.scalarAttributeType());
                }
                return props.attributeType() == getAttributeType();
            }
            @Override
            public DynamoDBTypeConverter<AttributeValue,Collection<V>> newConverter(final ParamType<Collection<V>> type) {
                final DynamoDBTypeConverter<?,V> target = scalars.getConverter(sourceType, type.<V>param(0).type());
                return attribute.join(SET.join(target));
            }
            @Override
            public DynamoDBAttributeType getAttributeType() {
                return attribute.attributeType();
            }
        }

        /**
         * V1 Object set conversions.
         */
        private final class ObjectStringSet implements Rule<Collection<V>> {
            @Override
            public boolean isAssignableFrom(final ParamType<?> type, final Properties<?,?> props) {
                if (props.attributeType() == null) {
                    return SET.is(type.type());
                }
                return false;
            }
            @Override
            public DynamoDBTypeConverter<AttributeValue,Collection<V>> newConverter(final ParamType<Collection<V>> type) {
                LOG.warn("Marshaling a set of non-String objects to a DynamoDB StringSet. " +
                    "You won't be able to read these objects back out of DynamoDB unless " +
                    "you REALLY know what you're doing: it's probably a bug. If you DO know " +
                    "what you're doing feel to ignore this warning, but consider using a " +
                    "custom @DynamoDBTypeConverted/DynamoDBTypeConverter for this instead.");
                return SS.join(SET.join(STRING.join(DEFAULT.<V>type())));
            }
            @Override
            public DynamoDBAttributeType getAttributeType() {
                return SS.attributeType();
            }
        }

        /**
         * Native bool {@link Set} conversions.
         */
        private final class NativeBoolSet implements Rule<Collection<V>> {
            @Override
            public boolean isAssignableFrom(final ParamType<?> type, final Properties<?,?> props) {
                if (props.attributeType() == null) {
                    return SET.is(type.type()) && BOOLEAN.is(type.param(0).type());
                }
                return false;
            }
            @Override
            public DynamoDBTypeConverter<AttributeValue,Collection<V>> newConverter(final ParamType<Collection<V>> type) {
                return StandardTypeConverters.join(new DynamoDBTypeConverter<AttributeValue,List<AttributeValue>>() {
                    public final AttributeValue convert(final List<AttributeValue> o) {
                        return L.convert(o);
                    }
                    public final List<AttributeValue> unconvert(final AttributeValue o) {
                        if (o.getL() == null && o.getNS() != null) {
                            return LIST.convert(o.getNS(), BOOL.join(BOOLEAN.join(String.class)));
                        }
                        return (List<AttributeValue>)L.unconvert(o);
                    }
                }, SET.join(NULL.join(BOOL.join(BOOLEAN.join(type.<V>param(0).type())))));
            }
            @Override
            public DynamoDBAttributeType getAttributeType() {
                return L.attributeType();
            }
        }

        /**
         * Any {@link List} conversions.
         */
        private final class ObjectSet implements Rule<Collection<V>> {
            @Override
            public boolean isAssignableFrom(final ParamType<?> type, final Properties<?,?> props) {
                if (props.attributeType() == null) {
                    return SET.is(type.type()) && type.param(0) != null;
                }
                return false;
            }
            @Override
            public DynamoDBTypeConverter<AttributeValue,Collection<V>> newConverter(final ParamType<Collection<V>> type) {
                final Rule<V> rule = getRule(type.<V>param(0), Properties.Immutable.<V,V>empty());
                final DynamoDBTypeConverter<AttributeValue,V> target = NULL.join(rule.newConverter(type.<V>param(0)));
                return L.join(SET.join(target));
            }
            @Override
            public DynamoDBAttributeType getAttributeType() {
                return L.attributeType();
            }
        }

        /**
         * Any {@link List} conversions.
         */
        private final class ObjectList implements Rule<List<V>> {
            @Override
            public boolean isAssignableFrom(final ParamType<?> type, final Properties<?,?> props) {
                if (props.attributeType() == null) {
                    return LIST.is(type.type()) && type.param(0) != null;
                }
                return false;
            }
            @Override
            public DynamoDBTypeConverter<AttributeValue,List<V>> newConverter(final ParamType<List<V>> type) {
                final Rule<V> rule = getRule(type.<V>param(0), Properties.Immutable.<V,V>empty());
                final DynamoDBTypeConverter<AttributeValue,V> target = NULL.join(rule.newConverter(type.<V>param(0)));
                return L.join(LIST.join(target));
            }
            @Override
            public DynamoDBAttributeType getAttributeType() {
                return L.attributeType();
            }
        }

        /**
         * Any {@link Map} conversions.
         */
        private final class ObjectMap implements Rule<Map<String,V>> {
            @Override
            public boolean isAssignableFrom(final ParamType<?> type, final Properties<?,?> props) {
                if (props.attributeType() == null) {
                    return MAP.is(type.type()) && type.param(1) != null && STRING.is(type.param(0).type());
                }
                return false;
            }
            @Override
            public DynamoDBTypeConverter<AttributeValue,Map<String,V>> newConverter(final ParamType<Map<String,V>> type) {
                final Rule<V> rule = getRule(type.<V>param(1), Properties.Immutable.<V,V>empty());
                final DynamoDBTypeConverter<AttributeValue,V> target = NULL.join(rule.newConverter(type.<V>param(1)));
                return M.join(MAP.<String,AttributeValue,V>join(target));
            }
            @Override
            public DynamoDBAttributeType getAttributeType() {
                return M.attributeType();
            }
        }

        /**
         * All {@link DynamoDBDocument} conversions.
         */
        private final class DocumentObjectMap implements Rule<V> {
            private final DynamoDBMapperModelFactory.Factory models;
            private final DynamoDBMapperConfig config;
            private DocumentObjectMap(final DynamoDBMapperConfig config, final DynamoDBMapperModelFactory.Factory models) {
                this.models = models;
                this.config = config;
            }
            @Override
            public boolean isAssignableFrom(final ParamType<?> type, final Properties<?,?> props) {
                if (props.attributeType() == null) {
                    return StandardBeanProperties.of(type.type()).annotations().document() != null;
                }
                return props.attributeType() == getAttributeType();
            }
            @Override
            public DynamoDBTypeConverter<AttributeValue,V> newConverter(final ParamType<V> type) {
                return M.join(new DynamoDBTypeConverter<Map<String,AttributeValue>,V>() {
                    public final Map<String,AttributeValue> convert(final V o) {
                        return models.getModelFactory(config).getTableModel(type.type()).convert(o);
                    }
                    public final V unconvert(final Map<String,AttributeValue> o) {
                        return models.getModelFactory(config).getTableModel(type.type()).unconvert(o);
                    }
                });
            }
            @Override
            public DynamoDBAttributeType getAttributeType() {
                return M.attributeType();
            }
        }

        /**
         * Default conversion when no match could be determined.
         */
        private final class NotSupported implements Rule<V> {
            @Override
            public boolean isAssignableFrom(final ParamType<?> type, final Properties<?,?> props) {
                return false;
            }
            @Override
            public DynamoDBTypeConverter<AttributeValue,V> newConverter(final ParamType<V> type) {
                return new DynamoDBTypeConverter<AttributeValue,V>() {
                    public final AttributeValue convert(final V o) {
                        throw new DynamoDBMappingException("type " + type + " is not supported" +
                            "; requires @DynamoDBDocument or @DynamoDBTypeConverted");
                    }
                    public final V unconvert(final AttributeValue o) {
                        throw new DynamoDBMappingException("type " + type + " is not supported" +
                            "; requires @DynamoDBDocument or @DynamoDBTypeConverted");
                    }
                };
            }
            @Override
            public DynamoDBAttributeType getAttributeType() {
                return NULL.attributeType();
            }
        }
    }

    /**
     * Attribute value conversion.
     */
    static interface Rule<V> {
        boolean isAssignableFrom(ParamType<?> type, Properties<?,?> props);
        DynamoDBTypeConverter<AttributeValue,V> newConverter(ParamType<V> type);
        DynamoDBAttributeType getAttributeType();
    }

    /**
     * Attribute value conversion factory.
     */
    static interface RuleFactory<V> {
        Rule<V> getRule(Bean<?,V> bean);
    }

}

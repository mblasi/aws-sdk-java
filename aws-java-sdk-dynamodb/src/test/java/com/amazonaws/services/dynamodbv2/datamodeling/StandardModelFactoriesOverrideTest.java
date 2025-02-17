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

import com.amazonaws.services.dynamodbv2.model.AttributeValue;

import java.lang.reflect.Method;

public class StandardModelFactoriesOverrideTest extends StandardModelFactoriesV2Test {

    private final DynamoDBMapperConfig config = new DynamoDBMapperConfig.Builder()
        .withConversionSchema(ConversionSchemas.v2Builder("V2Override").build())
        .build();

    private final DynamoDBMapperModelFactory.Factory factory = StandardModelFactories.of(S3Link.Factory.of(null));
    private final DynamoDBMapperModelFactory models = factory.getModelFactory(config);

    @Override
    protected <T> AttributeValue convert(Class<T> clazz, Method getter, Object value) {
        final StandardAnnotationMaps.FieldMap<T,Object> map = StandardAnnotationMaps.of(clazz, getter);
        return models.getTableModel(clazz).field(map.attributeName()).convert(value);
    }

}

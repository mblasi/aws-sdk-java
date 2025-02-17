/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;

/**
 * <p>
 * The <code>MetricDatum</code> data type encapsulates the information sent with
 * <a>PutMetricData</a> to either create a new metric or add new values to be
 * aggregated into an existing metric.
 * </p>
 */
public class MetricDatum implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the metric.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * A list of dimensions associated with the metric. Note, when using the
     * Dimensions value in a query, you need to append .member.N to it (e.g.,
     * Dimensions.member.N).
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Dimension> dimensions;
    /**
     * <p>
     * The time stamp used for the metric in ISO 8601 Universal Coordinated Time
     * (UTC) format. If not specified, the default value is set to the time the
     * metric data was received.
     * </p>
     */
    private java.util.Date timestamp;
    /**
     * <p>
     * The value for the metric.
     * </p>
     * <important>
     * <p>
     * Although the <code>Value</code> parameter accepts numbers of type
     * <code>Double</code>, Amazon CloudWatch rejects values that are either too
     * small or too large. Values must be in the range of 8.515920e-109 to
     * 1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base 2). In addition, special
     * values (e.g., NaN, +Infinity, -Infinity) are not supported.
     * </p>
     * </important>
     */
    private Double value;
    /**
     * <p>
     * A set of statistical values describing the metric.
     * </p>
     */
    private StatisticSet statisticValues;
    /**
     * <p>
     * The unit of the metric.
     * </p>
     */
    private String unit;

    /**
     * <p>
     * The name of the metric.
     * </p>
     * 
     * @param metricName
     *        The name of the metric.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the metric.
     * </p>
     * 
     * @return The name of the metric.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The name of the metric.
     * </p>
     * 
     * @param metricName
     *        The name of the metric.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public MetricDatum withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * A list of dimensions associated with the metric. Note, when using the
     * Dimensions value in a query, you need to append .member.N to it (e.g.,
     * Dimensions.member.N).
     * </p>
     * 
     * @return A list of dimensions associated with the metric. Note, when using
     *         the Dimensions value in a query, you need to append .member.N to
     *         it (e.g., Dimensions.member.N).
     */

    public java.util.List<Dimension> getDimensions() {
        if (dimensions == null) {
            dimensions = new com.amazonaws.internal.SdkInternalList<Dimension>();
        }
        return dimensions;
    }

    /**
     * <p>
     * A list of dimensions associated with the metric. Note, when using the
     * Dimensions value in a query, you need to append .member.N to it (e.g.,
     * Dimensions.member.N).
     * </p>
     * 
     * @param dimensions
     *        A list of dimensions associated with the metric. Note, when using
     *        the Dimensions value in a query, you need to append .member.N to
     *        it (e.g., Dimensions.member.N).
     */

    public void setDimensions(java.util.Collection<Dimension> dimensions) {
        if (dimensions == null) {
            this.dimensions = null;
            return;
        }

        this.dimensions = new com.amazonaws.internal.SdkInternalList<Dimension>(
                dimensions);
    }

    /**
     * <p>
     * A list of dimensions associated with the metric. Note, when using the
     * Dimensions value in a query, you need to append .member.N to it (e.g.,
     * Dimensions.member.N).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setDimensions(java.util.Collection)} or
     * {@link #withDimensions(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param dimensions
     *        A list of dimensions associated with the metric. Note, when using
     *        the Dimensions value in a query, you need to append .member.N to
     *        it (e.g., Dimensions.member.N).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public MetricDatum withDimensions(Dimension... dimensions) {
        if (this.dimensions == null) {
            setDimensions(new com.amazonaws.internal.SdkInternalList<Dimension>(
                    dimensions.length));
        }
        for (Dimension ele : dimensions) {
            this.dimensions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of dimensions associated with the metric. Note, when using the
     * Dimensions value in a query, you need to append .member.N to it (e.g.,
     * Dimensions.member.N).
     * </p>
     * 
     * @param dimensions
     *        A list of dimensions associated with the metric. Note, when using
     *        the Dimensions value in a query, you need to append .member.N to
     *        it (e.g., Dimensions.member.N).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public MetricDatum withDimensions(java.util.Collection<Dimension> dimensions) {
        setDimensions(dimensions);
        return this;
    }

    /**
     * <p>
     * The time stamp used for the metric in ISO 8601 Universal Coordinated Time
     * (UTC) format. If not specified, the default value is set to the time the
     * metric data was received.
     * </p>
     * 
     * @param timestamp
     *        The time stamp used for the metric in ISO 8601 Universal
     *        Coordinated Time (UTC) format. If not specified, the default value
     *        is set to the time the metric data was received.
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The time stamp used for the metric in ISO 8601 Universal Coordinated Time
     * (UTC) format. If not specified, the default value is set to the time the
     * metric data was received.
     * </p>
     * 
     * @return The time stamp used for the metric in ISO 8601 Universal
     *         Coordinated Time (UTC) format. If not specified, the default
     *         value is set to the time the metric data was received.
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The time stamp used for the metric in ISO 8601 Universal Coordinated Time
     * (UTC) format. If not specified, the default value is set to the time the
     * metric data was received.
     * </p>
     * 
     * @param timestamp
     *        The time stamp used for the metric in ISO 8601 Universal
     *        Coordinated Time (UTC) format. If not specified, the default value
     *        is set to the time the metric data was received.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public MetricDatum withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * The value for the metric.
     * </p>
     * <important>
     * <p>
     * Although the <code>Value</code> parameter accepts numbers of type
     * <code>Double</code>, Amazon CloudWatch rejects values that are either too
     * small or too large. Values must be in the range of 8.515920e-109 to
     * 1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base 2). In addition, special
     * values (e.g., NaN, +Infinity, -Infinity) are not supported.
     * </p>
     * </important>
     * 
     * @param value
     *        The value for the metric.</p> <important>
     *        <p>
     *        Although the <code>Value</code> parameter accepts numbers of type
     *        <code>Double</code>, Amazon CloudWatch rejects values that are
     *        either too small or too large. Values must be in the range of
     *        8.515920e-109 to 1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base
     *        2). In addition, special values (e.g., NaN, +Infinity, -Infinity)
     *        are not supported.
     *        </p>
     */

    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * <p>
     * The value for the metric.
     * </p>
     * <important>
     * <p>
     * Although the <code>Value</code> parameter accepts numbers of type
     * <code>Double</code>, Amazon CloudWatch rejects values that are either too
     * small or too large. Values must be in the range of 8.515920e-109 to
     * 1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base 2). In addition, special
     * values (e.g., NaN, +Infinity, -Infinity) are not supported.
     * </p>
     * </important>
     * 
     * @return The value for the metric.</p> <important>
     *         <p>
     *         Although the <code>Value</code> parameter accepts numbers of type
     *         <code>Double</code>, Amazon CloudWatch rejects values that are
     *         either too small or too large. Values must be in the range of
     *         8.515920e-109 to 1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base
     *         2). In addition, special values (e.g., NaN, +Infinity, -Infinity)
     *         are not supported.
     *         </p>
     */

    public Double getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value for the metric.
     * </p>
     * <important>
     * <p>
     * Although the <code>Value</code> parameter accepts numbers of type
     * <code>Double</code>, Amazon CloudWatch rejects values that are either too
     * small or too large. Values must be in the range of 8.515920e-109 to
     * 1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base 2). In addition, special
     * values (e.g., NaN, +Infinity, -Infinity) are not supported.
     * </p>
     * </important>
     * 
     * @param value
     *        The value for the metric.</p> <important>
     *        <p>
     *        Although the <code>Value</code> parameter accepts numbers of type
     *        <code>Double</code>, Amazon CloudWatch rejects values that are
     *        either too small or too large. Values must be in the range of
     *        8.515920e-109 to 1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base
     *        2). In addition, special values (e.g., NaN, +Infinity, -Infinity)
     *        are not supported.
     *        </p>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public MetricDatum withValue(Double value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * A set of statistical values describing the metric.
     * </p>
     * 
     * @param statisticValues
     *        A set of statistical values describing the metric.
     */

    public void setStatisticValues(StatisticSet statisticValues) {
        this.statisticValues = statisticValues;
    }

    /**
     * <p>
     * A set of statistical values describing the metric.
     * </p>
     * 
     * @return A set of statistical values describing the metric.
     */

    public StatisticSet getStatisticValues() {
        return this.statisticValues;
    }

    /**
     * <p>
     * A set of statistical values describing the metric.
     * </p>
     * 
     * @param statisticValues
     *        A set of statistical values describing the metric.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public MetricDatum withStatisticValues(StatisticSet statisticValues) {
        setStatisticValues(statisticValues);
        return this;
    }

    /**
     * <p>
     * The unit of the metric.
     * </p>
     * 
     * @param unit
     *        The unit of the metric.
     * @see StandardUnit
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit of the metric.
     * </p>
     * 
     * @return The unit of the metric.
     * @see StandardUnit
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * The unit of the metric.
     * </p>
     * 
     * @param unit
     *        The unit of the metric.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see StandardUnit
     */

    public MetricDatum withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * The unit of the metric.
     * </p>
     * 
     * @param unit
     *        The unit of the metric.
     * @see StandardUnit
     */

    public void setUnit(StandardUnit unit) {
        this.unit = unit.toString();
    }

    /**
     * <p>
     * The unit of the metric.
     * </p>
     * 
     * @param unit
     *        The unit of the metric.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see StandardUnit
     */

    public MetricDatum withUnit(StandardUnit unit) {
        setUnit(unit);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMetricName() != null)
            sb.append("MetricName: " + getMetricName() + ",");
        if (getDimensions() != null)
            sb.append("Dimensions: " + getDimensions() + ",");
        if (getTimestamp() != null)
            sb.append("Timestamp: " + getTimestamp() + ",");
        if (getValue() != null)
            sb.append("Value: " + getValue() + ",");
        if (getStatisticValues() != null)
            sb.append("StatisticValues: " + getStatisticValues() + ",");
        if (getUnit() != null)
            sb.append("Unit: " + getUnit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricDatum == false)
            return false;
        MetricDatum other = (MetricDatum) obj;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null
                && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null
                && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null
                && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null
                && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getStatisticValues() == null
                ^ this.getStatisticValues() == null)
            return false;
        if (other.getStatisticValues() != null
                && other.getStatisticValues().equals(this.getStatisticValues()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null
                && other.getUnit().equals(this.getUnit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode
                + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        hashCode = prime * hashCode
                + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode
                + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime
                * hashCode
                + ((getStatisticValues() == null) ? 0 : getStatisticValues()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getUnit() == null) ? 0 : getUnit().hashCode());
        return hashCode;
    }

    @Override
    public MetricDatum clone() {
        try {
            return (MetricDatum) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

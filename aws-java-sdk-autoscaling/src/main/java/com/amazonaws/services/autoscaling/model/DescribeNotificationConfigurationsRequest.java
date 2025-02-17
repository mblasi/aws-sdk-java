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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Contains the parameters for DescribeNotificationConfigurations.
 * </p>
 */
public class DescribeNotificationConfigurationsRequest extends
        com.amazonaws.AmazonWebServiceRequest implements Serializable,
        Cloneable {

    /**
     * <p>
     * The name of the group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> autoScalingGroupNames;
    /**
     * <p>
     * The token for the next set of items to return. (You received this token
     * from a previous call.)
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of items to return with this call.
     * </p>
     */
    private Integer maxRecords;

    /**
     * <p>
     * The name of the group.
     * </p>
     * 
     * @return The name of the group.
     */

    public java.util.List<String> getAutoScalingGroupNames() {
        if (autoScalingGroupNames == null) {
            autoScalingGroupNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return autoScalingGroupNames;
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     * 
     * @param autoScalingGroupNames
     *        The name of the group.
     */

    public void setAutoScalingGroupNames(
            java.util.Collection<String> autoScalingGroupNames) {
        if (autoScalingGroupNames == null) {
            this.autoScalingGroupNames = null;
            return;
        }

        this.autoScalingGroupNames = new com.amazonaws.internal.SdkInternalList<String>(
                autoScalingGroupNames);
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setAutoScalingGroupNames(java.util.Collection)} or
     * {@link #withAutoScalingGroupNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param autoScalingGroupNames
     *        The name of the group.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeNotificationConfigurationsRequest withAutoScalingGroupNames(
            String... autoScalingGroupNames) {
        if (this.autoScalingGroupNames == null) {
            setAutoScalingGroupNames(new com.amazonaws.internal.SdkInternalList<String>(
                    autoScalingGroupNames.length));
        }
        for (String ele : autoScalingGroupNames) {
            this.autoScalingGroupNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     * 
     * @param autoScalingGroupNames
     *        The name of the group.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeNotificationConfigurationsRequest withAutoScalingGroupNames(
            java.util.Collection<String> autoScalingGroupNames) {
        setAutoScalingGroupNames(autoScalingGroupNames);
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token
     * from a previous call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You received this
     *        token from a previous call.)
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token
     * from a previous call.)
     * </p>
     * 
     * @return The token for the next set of items to return. (You received this
     *         token from a previous call.)
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token
     * from a previous call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You received this
     *        token from a previous call.)
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeNotificationConfigurationsRequest withNextToken(
            String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return with this call.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of items to return with this call.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of items to return with this call.
     * </p>
     * 
     * @return The maximum number of items to return with this call.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * The maximum number of items to return with this call.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of items to return with this call.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeNotificationConfigurationsRequest withMaxRecords(
            Integer maxRecords) {
        setMaxRecords(maxRecords);
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
        if (getAutoScalingGroupNames() != null)
            sb.append("AutoScalingGroupNames: " + getAutoScalingGroupNames()
                    + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: " + getMaxRecords());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeNotificationConfigurationsRequest == false)
            return false;
        DescribeNotificationConfigurationsRequest other = (DescribeNotificationConfigurationsRequest) obj;
        if (other.getAutoScalingGroupNames() == null
                ^ this.getAutoScalingGroupNames() == null)
            return false;
        if (other.getAutoScalingGroupNames() != null
                && other.getAutoScalingGroupNames().equals(
                        this.getAutoScalingGroupNames()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null
                && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAutoScalingGroupNames() == null) ? 0
                        : getAutoScalingGroupNames().hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        return hashCode;
    }

    @Override
    public DescribeNotificationConfigurationsRequest clone() {
        return (DescribeNotificationConfigurationsRequest) super.clone();
    }
}

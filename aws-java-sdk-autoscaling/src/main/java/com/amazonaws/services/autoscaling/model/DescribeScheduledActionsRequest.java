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
 * Contains the parameters for DescribeScheduledActions.
 * </p>
 */
public class DescribeScheduledActionsRequest extends
        com.amazonaws.AmazonWebServiceRequest implements Serializable,
        Cloneable {

    /**
     * <p>
     * The name of the group.
     * </p>
     */
    private String autoScalingGroupName;
    /**
     * <p>
     * Describes one or more scheduled actions. If you omit this parameter, all
     * scheduled actions are described. If you specify an unknown scheduled
     * action, it is ignored with no error.
     * </p>
     * <p>
     * You can describe up to a maximum of 50 instances with a single call. If
     * there are more items to return, the call returns a token. To get the next
     * set of items, repeat the call with the returned token.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> scheduledActionNames;
    /**
     * <p>
     * The earliest scheduled start time to return. If scheduled action names
     * are provided, this parameter is ignored.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The latest scheduled start time to return. If scheduled action names are
     * provided, this parameter is ignored.
     * </p>
     */
    private java.util.Date endTime;
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
     * @param autoScalingGroupName
     *        The name of the group.
     */

    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     * 
     * @return The name of the group.
     */

    public String getAutoScalingGroupName() {
        return this.autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the group.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeScheduledActionsRequest withAutoScalingGroupName(
            String autoScalingGroupName) {
        setAutoScalingGroupName(autoScalingGroupName);
        return this;
    }

    /**
     * <p>
     * Describes one or more scheduled actions. If you omit this parameter, all
     * scheduled actions are described. If you specify an unknown scheduled
     * action, it is ignored with no error.
     * </p>
     * <p>
     * You can describe up to a maximum of 50 instances with a single call. If
     * there are more items to return, the call returns a token. To get the next
     * set of items, repeat the call with the returned token.
     * </p>
     * 
     * @return Describes one or more scheduled actions. If you omit this
     *         parameter, all scheduled actions are described. If you specify an
     *         unknown scheduled action, it is ignored with no error.</p>
     *         <p>
     *         You can describe up to a maximum of 50 instances with a single
     *         call. If there are more items to return, the call returns a
     *         token. To get the next set of items, repeat the call with the
     *         returned token.
     */

    public java.util.List<String> getScheduledActionNames() {
        if (scheduledActionNames == null) {
            scheduledActionNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return scheduledActionNames;
    }

    /**
     * <p>
     * Describes one or more scheduled actions. If you omit this parameter, all
     * scheduled actions are described. If you specify an unknown scheduled
     * action, it is ignored with no error.
     * </p>
     * <p>
     * You can describe up to a maximum of 50 instances with a single call. If
     * there are more items to return, the call returns a token. To get the next
     * set of items, repeat the call with the returned token.
     * </p>
     * 
     * @param scheduledActionNames
     *        Describes one or more scheduled actions. If you omit this
     *        parameter, all scheduled actions are described. If you specify an
     *        unknown scheduled action, it is ignored with no error.</p>
     *        <p>
     *        You can describe up to a maximum of 50 instances with a single
     *        call. If there are more items to return, the call returns a token.
     *        To get the next set of items, repeat the call with the returned
     *        token.
     */

    public void setScheduledActionNames(
            java.util.Collection<String> scheduledActionNames) {
        if (scheduledActionNames == null) {
            this.scheduledActionNames = null;
            return;
        }

        this.scheduledActionNames = new com.amazonaws.internal.SdkInternalList<String>(
                scheduledActionNames);
    }

    /**
     * <p>
     * Describes one or more scheduled actions. If you omit this parameter, all
     * scheduled actions are described. If you specify an unknown scheduled
     * action, it is ignored with no error.
     * </p>
     * <p>
     * You can describe up to a maximum of 50 instances with a single call. If
     * there are more items to return, the call returns a token. To get the next
     * set of items, repeat the call with the returned token.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setScheduledActionNames(java.util.Collection)} or
     * {@link #withScheduledActionNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param scheduledActionNames
     *        Describes one or more scheduled actions. If you omit this
     *        parameter, all scheduled actions are described. If you specify an
     *        unknown scheduled action, it is ignored with no error.</p>
     *        <p>
     *        You can describe up to a maximum of 50 instances with a single
     *        call. If there are more items to return, the call returns a token.
     *        To get the next set of items, repeat the call with the returned
     *        token.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeScheduledActionsRequest withScheduledActionNames(
            String... scheduledActionNames) {
        if (this.scheduledActionNames == null) {
            setScheduledActionNames(new com.amazonaws.internal.SdkInternalList<String>(
                    scheduledActionNames.length));
        }
        for (String ele : scheduledActionNames) {
            this.scheduledActionNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Describes one or more scheduled actions. If you omit this parameter, all
     * scheduled actions are described. If you specify an unknown scheduled
     * action, it is ignored with no error.
     * </p>
     * <p>
     * You can describe up to a maximum of 50 instances with a single call. If
     * there are more items to return, the call returns a token. To get the next
     * set of items, repeat the call with the returned token.
     * </p>
     * 
     * @param scheduledActionNames
     *        Describes one or more scheduled actions. If you omit this
     *        parameter, all scheduled actions are described. If you specify an
     *        unknown scheduled action, it is ignored with no error.</p>
     *        <p>
     *        You can describe up to a maximum of 50 instances with a single
     *        call. If there are more items to return, the call returns a token.
     *        To get the next set of items, repeat the call with the returned
     *        token.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeScheduledActionsRequest withScheduledActionNames(
            java.util.Collection<String> scheduledActionNames) {
        setScheduledActionNames(scheduledActionNames);
        return this;
    }

    /**
     * <p>
     * The earliest scheduled start time to return. If scheduled action names
     * are provided, this parameter is ignored.
     * </p>
     * 
     * @param startTime
     *        The earliest scheduled start time to return. If scheduled action
     *        names are provided, this parameter is ignored.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The earliest scheduled start time to return. If scheduled action names
     * are provided, this parameter is ignored.
     * </p>
     * 
     * @return The earliest scheduled start time to return. If scheduled action
     *         names are provided, this parameter is ignored.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The earliest scheduled start time to return. If scheduled action names
     * are provided, this parameter is ignored.
     * </p>
     * 
     * @param startTime
     *        The earliest scheduled start time to return. If scheduled action
     *        names are provided, this parameter is ignored.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeScheduledActionsRequest withStartTime(
            java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The latest scheduled start time to return. If scheduled action names are
     * provided, this parameter is ignored.
     * </p>
     * 
     * @param endTime
     *        The latest scheduled start time to return. If scheduled action
     *        names are provided, this parameter is ignored.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The latest scheduled start time to return. If scheduled action names are
     * provided, this parameter is ignored.
     * </p>
     * 
     * @return The latest scheduled start time to return. If scheduled action
     *         names are provided, this parameter is ignored.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The latest scheduled start time to return. If scheduled action names are
     * provided, this parameter is ignored.
     * </p>
     * 
     * @param endTime
     *        The latest scheduled start time to return. If scheduled action
     *        names are provided, this parameter is ignored.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeScheduledActionsRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
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

    public DescribeScheduledActionsRequest withNextToken(String nextToken) {
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

    public DescribeScheduledActionsRequest withMaxRecords(Integer maxRecords) {
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
        if (getAutoScalingGroupName() != null)
            sb.append("AutoScalingGroupName: " + getAutoScalingGroupName()
                    + ",");
        if (getScheduledActionNames() != null)
            sb.append("ScheduledActionNames: " + getScheduledActionNames()
                    + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("EndTime: " + getEndTime() + ",");
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

        if (obj instanceof DescribeScheduledActionsRequest == false)
            return false;
        DescribeScheduledActionsRequest other = (DescribeScheduledActionsRequest) obj;
        if (other.getAutoScalingGroupName() == null
                ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null
                && other.getAutoScalingGroupName().equals(
                        this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getScheduledActionNames() == null
                ^ this.getScheduledActionNames() == null)
            return false;
        if (other.getScheduledActionNames() != null
                && other.getScheduledActionNames().equals(
                        this.getScheduledActionNames()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null
                && other.getEndTime().equals(this.getEndTime()) == false)
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
                + ((getAutoScalingGroupName() == null) ? 0
                        : getAutoScalingGroupName().hashCode());
        hashCode = prime
                * hashCode
                + ((getScheduledActionNames() == null) ? 0
                        : getScheduledActionNames().hashCode());
        hashCode = prime * hashCode
                + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode
                + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        return hashCode;
    }

    @Override
    public DescribeScheduledActionsRequest clone() {
        return (DescribeScheduledActionsRequest) super.clone();
    }
}

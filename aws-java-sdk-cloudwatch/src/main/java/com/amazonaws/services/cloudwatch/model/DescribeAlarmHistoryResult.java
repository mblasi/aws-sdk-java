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
 * The output for <a>DescribeAlarmHistory</a>.
 * </p>
 */
public class DescribeAlarmHistoryResult extends
        com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata>
        implements Serializable, Cloneable {

    /**
     * <p>
     * A list of alarm histories in JSON format.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AlarmHistoryItem> alarmHistoryItems;
    /**
     * <p>
     * A string that marks the start of the next batch of returned results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of alarm histories in JSON format.
     * </p>
     * 
     * @return A list of alarm histories in JSON format.
     */

    public java.util.List<AlarmHistoryItem> getAlarmHistoryItems() {
        if (alarmHistoryItems == null) {
            alarmHistoryItems = new com.amazonaws.internal.SdkInternalList<AlarmHistoryItem>();
        }
        return alarmHistoryItems;
    }

    /**
     * <p>
     * A list of alarm histories in JSON format.
     * </p>
     * 
     * @param alarmHistoryItems
     *        A list of alarm histories in JSON format.
     */

    public void setAlarmHistoryItems(
            java.util.Collection<AlarmHistoryItem> alarmHistoryItems) {
        if (alarmHistoryItems == null) {
            this.alarmHistoryItems = null;
            return;
        }

        this.alarmHistoryItems = new com.amazonaws.internal.SdkInternalList<AlarmHistoryItem>(
                alarmHistoryItems);
    }

    /**
     * <p>
     * A list of alarm histories in JSON format.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setAlarmHistoryItems(java.util.Collection)} or
     * {@link #withAlarmHistoryItems(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param alarmHistoryItems
     *        A list of alarm histories in JSON format.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeAlarmHistoryResult withAlarmHistoryItems(
            AlarmHistoryItem... alarmHistoryItems) {
        if (this.alarmHistoryItems == null) {
            setAlarmHistoryItems(new com.amazonaws.internal.SdkInternalList<AlarmHistoryItem>(
                    alarmHistoryItems.length));
        }
        for (AlarmHistoryItem ele : alarmHistoryItems) {
            this.alarmHistoryItems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of alarm histories in JSON format.
     * </p>
     * 
     * @param alarmHistoryItems
     *        A list of alarm histories in JSON format.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeAlarmHistoryResult withAlarmHistoryItems(
            java.util.Collection<AlarmHistoryItem> alarmHistoryItems) {
        setAlarmHistoryItems(alarmHistoryItems);
        return this;
    }

    /**
     * <p>
     * A string that marks the start of the next batch of returned results.
     * </p>
     * 
     * @param nextToken
     *        A string that marks the start of the next batch of returned
     *        results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A string that marks the start of the next batch of returned results.
     * </p>
     * 
     * @return A string that marks the start of the next batch of returned
     *         results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A string that marks the start of the next batch of returned results.
     * </p>
     * 
     * @param nextToken
     *        A string that marks the start of the next batch of returned
     *        results.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeAlarmHistoryResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getAlarmHistoryItems() != null)
            sb.append("AlarmHistoryItems: " + getAlarmHistoryItems() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAlarmHistoryResult == false)
            return false;
        DescribeAlarmHistoryResult other = (DescribeAlarmHistoryResult) obj;
        if (other.getAlarmHistoryItems() == null
                ^ this.getAlarmHistoryItems() == null)
            return false;
        if (other.getAlarmHistoryItems() != null
                && other.getAlarmHistoryItems().equals(
                        this.getAlarmHistoryItems()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAlarmHistoryItems() == null) ? 0
                        : getAlarmHistoryItems().hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAlarmHistoryResult clone() {
        try {
            return (DescribeAlarmHistoryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

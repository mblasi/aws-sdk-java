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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the usage data of a usage plan.
 * </p>
 * <div class="remarks"/> <div class="seeAlso"> <a href=
 * "http://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-api-usage-plans.html"
 * >Create and Use Usage Plans</a>, <a href=
 * "http://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-create-usage-plans-with-console.html#api-gateway-usage-plan-manage-usage"
 * >Manage Usage in a Usage Plan</a> </div>
 */
public class GetUsageResult extends
        com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata>
        implements Serializable, Cloneable {

    /**
     * <p>
     * The plan Id associated with this usage data.
     * </p>
     */
    private String usagePlanId;
    /**
     * <p>
     * The starting date of the usage data.
     * </p>
     */
    private String startDate;
    /**
     * <p>
     * The ending date of the usage data.
     * </p>
     */
    private String endDate;

    private String position;
    /**
     * <p>
     * The usage data, as daily logs of used and remaining quotas, over the
     * specified time interval indexed over the API keys in a usage plan. For
     * example,
     * <code>{..., "values" : { "{api_key}" : [ [0, 100], [10, 90], [100, 10]]}</code>
     * , where <code>{api_key}</code> stands for an API key value and the daily
     * log entry is of the format <code>[used quota, remaining quota]</code>.
     * </p>
     */
    private java.util.Map<String, java.util.List<java.util.List<Long>>> items;

    /**
     * <p>
     * The plan Id associated with this usage data.
     * </p>
     * 
     * @param usagePlanId
     *        The plan Id associated with this usage data.
     */

    public void setUsagePlanId(String usagePlanId) {
        this.usagePlanId = usagePlanId;
    }

    /**
     * <p>
     * The plan Id associated with this usage data.
     * </p>
     * 
     * @return The plan Id associated with this usage data.
     */

    public String getUsagePlanId() {
        return this.usagePlanId;
    }

    /**
     * <p>
     * The plan Id associated with this usage data.
     * </p>
     * 
     * @param usagePlanId
     *        The plan Id associated with this usage data.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetUsageResult withUsagePlanId(String usagePlanId) {
        setUsagePlanId(usagePlanId);
        return this;
    }

    /**
     * <p>
     * The starting date of the usage data.
     * </p>
     * 
     * @param startDate
     *        The starting date of the usage data.
     */

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * <p>
     * The starting date of the usage data.
     * </p>
     * 
     * @return The starting date of the usage data.
     */

    public String getStartDate() {
        return this.startDate;
    }

    /**
     * <p>
     * The starting date of the usage data.
     * </p>
     * 
     * @param startDate
     *        The starting date of the usage data.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetUsageResult withStartDate(String startDate) {
        setStartDate(startDate);
        return this;
    }

    /**
     * <p>
     * The ending date of the usage data.
     * </p>
     * 
     * @param endDate
     *        The ending date of the usage data.
     */

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * <p>
     * The ending date of the usage data.
     * </p>
     * 
     * @return The ending date of the usage data.
     */

    public String getEndDate() {
        return this.endDate;
    }

    /**
     * <p>
     * The ending date of the usage data.
     * </p>
     * 
     * @param endDate
     *        The ending date of the usage data.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetUsageResult withEndDate(String endDate) {
        setEndDate(endDate);
        return this;
    }

    /**
     * @param position
     */

    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * @return
     */

    public String getPosition() {
        return this.position;
    }

    /**
     * @param position
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetUsageResult withPosition(String position) {
        setPosition(position);
        return this;
    }

    /**
     * <p>
     * The usage data, as daily logs of used and remaining quotas, over the
     * specified time interval indexed over the API keys in a usage plan. For
     * example,
     * <code>{..., "values" : { "{api_key}" : [ [0, 100], [10, 90], [100, 10]]}</code>
     * , where <code>{api_key}</code> stands for an API key value and the daily
     * log entry is of the format <code>[used quota, remaining quota]</code>.
     * </p>
     * 
     * @return The usage data, as daily logs of used and remaining quotas, over
     *         the specified time interval indexed over the API keys in a usage
     *         plan. For example,
     *         <code>{..., "values" : { "{api_key}" : [ [0, 100], [10, 90], [100, 10]]}</code>
     *         , where <code>{api_key}</code> stands for an API key value and
     *         the daily log entry is of the format
     *         <code>[used quota, remaining quota]</code>.
     */

    public java.util.Map<String, java.util.List<java.util.List<Long>>> getItems() {
        return items;
    }

    /**
     * <p>
     * The usage data, as daily logs of used and remaining quotas, over the
     * specified time interval indexed over the API keys in a usage plan. For
     * example,
     * <code>{..., "values" : { "{api_key}" : [ [0, 100], [10, 90], [100, 10]]}</code>
     * , where <code>{api_key}</code> stands for an API key value and the daily
     * log entry is of the format <code>[used quota, remaining quota]</code>.
     * </p>
     * 
     * @param items
     *        The usage data, as daily logs of used and remaining quotas, over
     *        the specified time interval indexed over the API keys in a usage
     *        plan. For example,
     *        <code>{..., "values" : { "{api_key}" : [ [0, 100], [10, 90], [100, 10]]}</code>
     *        , where <code>{api_key}</code> stands for an API key value and the
     *        daily log entry is of the format
     *        <code>[used quota, remaining quota]</code>.
     */

    public void setItems(
            java.util.Map<String, java.util.List<java.util.List<Long>>> items) {
        this.items = items;
    }

    /**
     * <p>
     * The usage data, as daily logs of used and remaining quotas, over the
     * specified time interval indexed over the API keys in a usage plan. For
     * example,
     * <code>{..., "values" : { "{api_key}" : [ [0, 100], [10, 90], [100, 10]]}</code>
     * , where <code>{api_key}</code> stands for an API key value and the daily
     * log entry is of the format <code>[used quota, remaining quota]</code>.
     * </p>
     * 
     * @param items
     *        The usage data, as daily logs of used and remaining quotas, over
     *        the specified time interval indexed over the API keys in a usage
     *        plan. For example,
     *        <code>{..., "values" : { "{api_key}" : [ [0, 100], [10, 90], [100, 10]]}</code>
     *        , where <code>{api_key}</code> stands for an API key value and the
     *        daily log entry is of the format
     *        <code>[used quota, remaining quota]</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetUsageResult withItems(
            java.util.Map<String, java.util.List<java.util.List<Long>>> items) {
        setItems(items);
        return this;
    }

    public GetUsageResult addItemsEntry(String key,
            java.util.List<java.util.List<Long>> value) {
        if (null == this.items) {
            this.items = new java.util.HashMap<String, java.util.List<java.util.List<Long>>>();
        }
        if (this.items.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys ("
                    + key.toString() + ") are provided.");
        this.items.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Items. &lt;p> Returns a reference to
     * this object so that method calls can be chained together.
     */

    public GetUsageResult clearItemsEntries() {
        this.items = null;
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
        if (getUsagePlanId() != null)
            sb.append("UsagePlanId: " + getUsagePlanId() + ",");
        if (getStartDate() != null)
            sb.append("StartDate: " + getStartDate() + ",");
        if (getEndDate() != null)
            sb.append("EndDate: " + getEndDate() + ",");
        if (getPosition() != null)
            sb.append("Position: " + getPosition() + ",");
        if (getItems() != null)
            sb.append("Items: " + getItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetUsageResult == false)
            return false;
        GetUsageResult other = (GetUsageResult) obj;
        if (other.getUsagePlanId() == null ^ this.getUsagePlanId() == null)
            return false;
        if (other.getUsagePlanId() != null
                && other.getUsagePlanId().equals(this.getUsagePlanId()) == false)
            return false;
        if (other.getStartDate() == null ^ this.getStartDate() == null)
            return false;
        if (other.getStartDate() != null
                && other.getStartDate().equals(this.getStartDate()) == false)
            return false;
        if (other.getEndDate() == null ^ this.getEndDate() == null)
            return false;
        if (other.getEndDate() != null
                && other.getEndDate().equals(this.getEndDate()) == false)
            return false;
        if (other.getPosition() == null ^ this.getPosition() == null)
            return false;
        if (other.getPosition() != null
                && other.getPosition().equals(this.getPosition()) == false)
            return false;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null
                && other.getItems().equals(this.getItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getUsagePlanId() == null) ? 0 : getUsagePlanId().hashCode());
        hashCode = prime * hashCode
                + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        hashCode = prime * hashCode
                + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        hashCode = prime * hashCode
                + ((getPosition() == null) ? 0 : getPosition().hashCode());
        hashCode = prime * hashCode
                + ((getItems() == null) ? 0 : getItems().hashCode());
        return hashCode;
    }

    @Override
    public GetUsageResult clone() {
        try {
            return (GetUsageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

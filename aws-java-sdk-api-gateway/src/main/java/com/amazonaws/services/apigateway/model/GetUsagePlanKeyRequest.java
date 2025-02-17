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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The GET request to get a usage plan key of a given key identifier.
 * </p>
 */
public class GetUsagePlanKeyRequest extends
        com.amazonaws.AmazonWebServiceRequest implements Serializable,
        Cloneable {

    /**
     * <p>
     * The Id of the <a>UsagePlan</a> resource representing the usage plan
     * containing the to-be-retrieved <a>UsagePlanKey</a> resource representing
     * a plan customer.
     * </p>
     */
    private String usagePlanId;
    /**
     * <p>
     * The key Id of the to-be-retrieved <a>UsagePlanKey</a> resource
     * representing a plan customer.
     * </p>
     */
    private String keyId;

    /**
     * <p>
     * The Id of the <a>UsagePlan</a> resource representing the usage plan
     * containing the to-be-retrieved <a>UsagePlanKey</a> resource representing
     * a plan customer.
     * </p>
     * 
     * @param usagePlanId
     *        The Id of the <a>UsagePlan</a> resource representing the usage
     *        plan containing the to-be-retrieved <a>UsagePlanKey</a> resource
     *        representing a plan customer.
     */

    public void setUsagePlanId(String usagePlanId) {
        this.usagePlanId = usagePlanId;
    }

    /**
     * <p>
     * The Id of the <a>UsagePlan</a> resource representing the usage plan
     * containing the to-be-retrieved <a>UsagePlanKey</a> resource representing
     * a plan customer.
     * </p>
     * 
     * @return The Id of the <a>UsagePlan</a> resource representing the usage
     *         plan containing the to-be-retrieved <a>UsagePlanKey</a> resource
     *         representing a plan customer.
     */

    public String getUsagePlanId() {
        return this.usagePlanId;
    }

    /**
     * <p>
     * The Id of the <a>UsagePlan</a> resource representing the usage plan
     * containing the to-be-retrieved <a>UsagePlanKey</a> resource representing
     * a plan customer.
     * </p>
     * 
     * @param usagePlanId
     *        The Id of the <a>UsagePlan</a> resource representing the usage
     *        plan containing the to-be-retrieved <a>UsagePlanKey</a> resource
     *        representing a plan customer.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetUsagePlanKeyRequest withUsagePlanId(String usagePlanId) {
        setUsagePlanId(usagePlanId);
        return this;
    }

    /**
     * <p>
     * The key Id of the to-be-retrieved <a>UsagePlanKey</a> resource
     * representing a plan customer.
     * </p>
     * 
     * @param keyId
     *        The key Id of the to-be-retrieved <a>UsagePlanKey</a> resource
     *        representing a plan customer.
     */

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The key Id of the to-be-retrieved <a>UsagePlanKey</a> resource
     * representing a plan customer.
     * </p>
     * 
     * @return The key Id of the to-be-retrieved <a>UsagePlanKey</a> resource
     *         representing a plan customer.
     */

    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * The key Id of the to-be-retrieved <a>UsagePlanKey</a> resource
     * representing a plan customer.
     * </p>
     * 
     * @param keyId
     *        The key Id of the to-be-retrieved <a>UsagePlanKey</a> resource
     *        representing a plan customer.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetUsagePlanKeyRequest withKeyId(String keyId) {
        setKeyId(keyId);
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
        if (getKeyId() != null)
            sb.append("KeyId: " + getKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetUsagePlanKeyRequest == false)
            return false;
        GetUsagePlanKeyRequest other = (GetUsagePlanKeyRequest) obj;
        if (other.getUsagePlanId() == null ^ this.getUsagePlanId() == null)
            return false;
        if (other.getUsagePlanId() != null
                && other.getUsagePlanId().equals(this.getUsagePlanId()) == false)
            return false;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null
                && other.getKeyId().equals(this.getKeyId()) == false)
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
                + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        return hashCode;
    }

    @Override
    public GetUsagePlanKeyRequest clone() {
        return (GetUsagePlanKeyRequest) super.clone();
    }
}

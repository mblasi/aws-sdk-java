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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the requested sending authorization policies.
 * </p>
 */
public class GetIdentityPoliciesResult extends
        com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata>
        implements Serializable, Cloneable {

    /**
     * <p>
     * A map of policy names to policies.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> policies;

    /**
     * <p>
     * A map of policy names to policies.
     * </p>
     * 
     * @return A map of policy names to policies.
     */

    public java.util.Map<String, String> getPolicies() {
        if (policies == null) {
            policies = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return policies;
    }

    /**
     * <p>
     * A map of policy names to policies.
     * </p>
     * 
     * @param policies
     *        A map of policy names to policies.
     */

    public void setPolicies(java.util.Map<String, String> policies) {
        this.policies = policies == null ? null
                : new com.amazonaws.internal.SdkInternalMap<String, String>(
                        policies);
    }

    /**
     * <p>
     * A map of policy names to policies.
     * </p>
     * 
     * @param policies
     *        A map of policy names to policies.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetIdentityPoliciesResult withPolicies(
            java.util.Map<String, String> policies) {
        setPolicies(policies);
        return this;
    }

    public GetIdentityPoliciesResult addPoliciesEntry(String key, String value) {
        if (null == this.policies) {
            this.policies = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.policies.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys ("
                    + key.toString() + ") are provided.");
        this.policies.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Policies. &lt;p> Returns a reference
     * to this object so that method calls can be chained together.
     */

    public GetIdentityPoliciesResult clearPoliciesEntries() {
        this.policies = null;
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
        if (getPolicies() != null)
            sb.append("Policies: " + getPolicies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetIdentityPoliciesResult == false)
            return false;
        GetIdentityPoliciesResult other = (GetIdentityPoliciesResult) obj;
        if (other.getPolicies() == null ^ this.getPolicies() == null)
            return false;
        if (other.getPolicies() != null
                && other.getPolicies().equals(this.getPolicies()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPolicies() == null) ? 0 : getPolicies().hashCode());
        return hashCode;
    }

    @Override
    public GetIdentityPoliciesResult clone() {
        try {
            return (GetIdentityPoliciesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

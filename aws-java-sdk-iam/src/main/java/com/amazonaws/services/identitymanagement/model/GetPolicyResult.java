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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the response to a successful <a>GetPolicy</a> request.
 * </p>
 */
public class GetPolicyResult extends
        com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata>
        implements Serializable, Cloneable {

    /**
     * <p>
     * A structure containing details about the policy.
     * </p>
     */
    private Policy policy;

    /**
     * <p>
     * A structure containing details about the policy.
     * </p>
     * 
     * @param policy
     *        A structure containing details about the policy.
     */

    public void setPolicy(Policy policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * A structure containing details about the policy.
     * </p>
     * 
     * @return A structure containing details about the policy.
     */

    public Policy getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * A structure containing details about the policy.
     * </p>
     * 
     * @param policy
     *        A structure containing details about the policy.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetPolicyResult withPolicy(Policy policy) {
        setPolicy(policy);
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
        if (getPolicy() != null)
            sb.append("Policy: " + getPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPolicyResult == false)
            return false;
        GetPolicyResult other = (GetPolicyResult) obj;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null
                && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        return hashCode;
    }

    @Override
    public GetPolicyResult clone() {
        try {
            return (GetPolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

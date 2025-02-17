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
package com.amazonaws.services.cognitosync.model;

import java.io.Serializable;

/**
 * The response to a successful DescribeIdentityUsage request.
 */
public class DescribeIdentityUsageResult extends
        com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata>
        implements Serializable, Cloneable {

    /** Usage information for the identity. */
    private IdentityUsage identityUsage;

    /**
     * Usage information for the identity.
     * 
     * @param identityUsage
     *        Usage information for the identity.
     */

    public void setIdentityUsage(IdentityUsage identityUsage) {
        this.identityUsage = identityUsage;
    }

    /**
     * Usage information for the identity.
     * 
     * @return Usage information for the identity.
     */

    public IdentityUsage getIdentityUsage() {
        return this.identityUsage;
    }

    /**
     * Usage information for the identity.
     * 
     * @param identityUsage
     *        Usage information for the identity.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeIdentityUsageResult withIdentityUsage(
            IdentityUsage identityUsage) {
        setIdentityUsage(identityUsage);
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
        if (getIdentityUsage() != null)
            sb.append("IdentityUsage: " + getIdentityUsage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeIdentityUsageResult == false)
            return false;
        DescribeIdentityUsageResult other = (DescribeIdentityUsageResult) obj;
        if (other.getIdentityUsage() == null ^ this.getIdentityUsage() == null)
            return false;
        if (other.getIdentityUsage() != null
                && other.getIdentityUsage().equals(this.getIdentityUsage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getIdentityUsage() == null) ? 0 : getIdentityUsage()
                        .hashCode());
        return hashCode;
    }

    @Override
    public DescribeIdentityUsageResult clone() {
        try {
            return (DescribeIdentityUsageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

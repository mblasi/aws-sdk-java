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
package com.amazonaws.services.elasticfilesystem.model;

import java.io.Serializable;

/**
 * 
 */
public class DescribeMountTargetSecurityGroupsResult extends
        com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata>
        implements Serializable, Cloneable {

    /**
     * <p>
     * Array of security groups.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> securityGroups;

    /**
     * <p>
     * Array of security groups.
     * </p>
     * 
     * @return Array of security groups.
     */

    public java.util.List<String> getSecurityGroups() {
        if (securityGroups == null) {
            securityGroups = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return securityGroups;
    }

    /**
     * <p>
     * Array of security groups.
     * </p>
     * 
     * @param securityGroups
     *        Array of security groups.
     */

    public void setSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        this.securityGroups = new com.amazonaws.internal.SdkInternalList<String>(
                securityGroups);
    }

    /**
     * <p>
     * Array of security groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSecurityGroups(java.util.Collection)} or
     * {@link #withSecurityGroups(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param securityGroups
     *        Array of security groups.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeMountTargetSecurityGroupsResult withSecurityGroups(
            String... securityGroups) {
        if (this.securityGroups == null) {
            setSecurityGroups(new com.amazonaws.internal.SdkInternalList<String>(
                    securityGroups.length));
        }
        for (String ele : securityGroups) {
            this.securityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Array of security groups.
     * </p>
     * 
     * @param securityGroups
     *        Array of security groups.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeMountTargetSecurityGroupsResult withSecurityGroups(
            java.util.Collection<String> securityGroups) {
        setSecurityGroups(securityGroups);
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
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: " + getSecurityGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeMountTargetSecurityGroupsResult == false)
            return false;
        DescribeMountTargetSecurityGroupsResult other = (DescribeMountTargetSecurityGroupsResult) obj;
        if (other.getSecurityGroups() == null
                ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null
                && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getSecurityGroups() == null) ? 0 : getSecurityGroups()
                        .hashCode());
        return hashCode;
    }

    @Override
    public DescribeMountTargetSecurityGroupsResult clone() {
        try {
            return (DescribeMountTargetSecurityGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

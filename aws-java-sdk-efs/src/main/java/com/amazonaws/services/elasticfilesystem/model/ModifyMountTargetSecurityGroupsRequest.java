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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 */
public class ModifyMountTargetSecurityGroupsRequest extends
        com.amazonaws.AmazonWebServiceRequest implements Serializable,
        Cloneable {

    /**
     * <p>
     * ID of the mount target whose security groups you want to modify.
     * </p>
     */
    private String mountTargetId;
    /**
     * <p>
     * Array of up to five VPC security group IDs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> securityGroups;

    /**
     * <p>
     * ID of the mount target whose security groups you want to modify.
     * </p>
     * 
     * @param mountTargetId
     *        ID of the mount target whose security groups you want to modify.
     */

    public void setMountTargetId(String mountTargetId) {
        this.mountTargetId = mountTargetId;
    }

    /**
     * <p>
     * ID of the mount target whose security groups you want to modify.
     * </p>
     * 
     * @return ID of the mount target whose security groups you want to modify.
     */

    public String getMountTargetId() {
        return this.mountTargetId;
    }

    /**
     * <p>
     * ID of the mount target whose security groups you want to modify.
     * </p>
     * 
     * @param mountTargetId
     *        ID of the mount target whose security groups you want to modify.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyMountTargetSecurityGroupsRequest withMountTargetId(
            String mountTargetId) {
        setMountTargetId(mountTargetId);
        return this;
    }

    /**
     * <p>
     * Array of up to five VPC security group IDs.
     * </p>
     * 
     * @return Array of up to five VPC security group IDs.
     */

    public java.util.List<String> getSecurityGroups() {
        if (securityGroups == null) {
            securityGroups = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return securityGroups;
    }

    /**
     * <p>
     * Array of up to five VPC security group IDs.
     * </p>
     * 
     * @param securityGroups
     *        Array of up to five VPC security group IDs.
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
     * Array of up to five VPC security group IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSecurityGroups(java.util.Collection)} or
     * {@link #withSecurityGroups(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param securityGroups
     *        Array of up to five VPC security group IDs.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyMountTargetSecurityGroupsRequest withSecurityGroups(
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
     * Array of up to five VPC security group IDs.
     * </p>
     * 
     * @param securityGroups
     *        Array of up to five VPC security group IDs.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyMountTargetSecurityGroupsRequest withSecurityGroups(
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
        if (getMountTargetId() != null)
            sb.append("MountTargetId: " + getMountTargetId() + ",");
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

        if (obj instanceof ModifyMountTargetSecurityGroupsRequest == false)
            return false;
        ModifyMountTargetSecurityGroupsRequest other = (ModifyMountTargetSecurityGroupsRequest) obj;
        if (other.getMountTargetId() == null ^ this.getMountTargetId() == null)
            return false;
        if (other.getMountTargetId() != null
                && other.getMountTargetId().equals(this.getMountTargetId()) == false)
            return false;
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
                + ((getMountTargetId() == null) ? 0 : getMountTargetId()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getSecurityGroups() == null) ? 0 : getSecurityGroups()
                        .hashCode());
        return hashCode;
    }

    @Override
    public ModifyMountTargetSecurityGroupsRequest clone() {
        return (ModifyMountTargetSecurityGroupsRequest) super.clone();
    }
}

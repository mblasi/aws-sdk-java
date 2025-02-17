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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 */
public class ModifyDBSubnetGroupRequest extends
        com.amazonaws.AmazonWebServiceRequest implements Serializable,
        Cloneable {

    /**
     * <p>
     * The name for the DB subnet group. This value is stored as a lowercase
     * string.
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters,
     * periods, underscores, spaces, or hyphens. Must not be default.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     */
    private String dBSubnetGroupName;
    /**
     * <p>
     * The description for the DB subnet group.
     * </p>
     */
    private String dBSubnetGroupDescription;
    /**
     * <p>
     * The EC2 subnet IDs for the DB subnet group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> subnetIds;

    /**
     * <p>
     * The name for the DB subnet group. This value is stored as a lowercase
     * string.
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters,
     * periods, underscores, spaces, or hyphens. Must not be default.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     * 
     * @param dBSubnetGroupName
     *        The name for the DB subnet group. This value is stored as a
     *        lowercase string.</p>
     *        <p>
     *        Constraints: Must contain no more than 255 alphanumeric
     *        characters, periods, underscores, spaces, or hyphens. Must not be
     *        default.
     *        </p>
     *        <p>
     *        Example: <code>mySubnetgroup</code>
     */

    public void setDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
    }

    /**
     * <p>
     * The name for the DB subnet group. This value is stored as a lowercase
     * string.
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters,
     * periods, underscores, spaces, or hyphens. Must not be default.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     * 
     * @return The name for the DB subnet group. This value is stored as a
     *         lowercase string.</p>
     *         <p>
     *         Constraints: Must contain no more than 255 alphanumeric
     *         characters, periods, underscores, spaces, or hyphens. Must not be
     *         default.
     *         </p>
     *         <p>
     *         Example: <code>mySubnetgroup</code>
     */

    public String getDBSubnetGroupName() {
        return this.dBSubnetGroupName;
    }

    /**
     * <p>
     * The name for the DB subnet group. This value is stored as a lowercase
     * string.
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters,
     * periods, underscores, spaces, or hyphens. Must not be default.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     * 
     * @param dBSubnetGroupName
     *        The name for the DB subnet group. This value is stored as a
     *        lowercase string.</p>
     *        <p>
     *        Constraints: Must contain no more than 255 alphanumeric
     *        characters, periods, underscores, spaces, or hyphens. Must not be
     *        default.
     *        </p>
     *        <p>
     *        Example: <code>mySubnetgroup</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyDBSubnetGroupRequest withDBSubnetGroupName(
            String dBSubnetGroupName) {
        setDBSubnetGroupName(dBSubnetGroupName);
        return this;
    }

    /**
     * <p>
     * The description for the DB subnet group.
     * </p>
     * 
     * @param dBSubnetGroupDescription
     *        The description for the DB subnet group.
     */

    public void setDBSubnetGroupDescription(String dBSubnetGroupDescription) {
        this.dBSubnetGroupDescription = dBSubnetGroupDescription;
    }

    /**
     * <p>
     * The description for the DB subnet group.
     * </p>
     * 
     * @return The description for the DB subnet group.
     */

    public String getDBSubnetGroupDescription() {
        return this.dBSubnetGroupDescription;
    }

    /**
     * <p>
     * The description for the DB subnet group.
     * </p>
     * 
     * @param dBSubnetGroupDescription
     *        The description for the DB subnet group.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyDBSubnetGroupRequest withDBSubnetGroupDescription(
            String dBSubnetGroupDescription) {
        setDBSubnetGroupDescription(dBSubnetGroupDescription);
        return this;
    }

    /**
     * <p>
     * The EC2 subnet IDs for the DB subnet group.
     * </p>
     * 
     * @return The EC2 subnet IDs for the DB subnet group.
     */

    public java.util.List<String> getSubnetIds() {
        if (subnetIds == null) {
            subnetIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return subnetIds;
    }

    /**
     * <p>
     * The EC2 subnet IDs for the DB subnet group.
     * </p>
     * 
     * @param subnetIds
     *        The EC2 subnet IDs for the DB subnet group.
     */

    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new com.amazonaws.internal.SdkInternalList<String>(
                subnetIds);
    }

    /**
     * <p>
     * The EC2 subnet IDs for the DB subnet group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSubnetIds(java.util.Collection)} or
     * {@link #withSubnetIds(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param subnetIds
     *        The EC2 subnet IDs for the DB subnet group.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyDBSubnetGroupRequest withSubnetIds(String... subnetIds) {
        if (this.subnetIds == null) {
            setSubnetIds(new com.amazonaws.internal.SdkInternalList<String>(
                    subnetIds.length));
        }
        for (String ele : subnetIds) {
            this.subnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The EC2 subnet IDs for the DB subnet group.
     * </p>
     * 
     * @param subnetIds
     *        The EC2 subnet IDs for the DB subnet group.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyDBSubnetGroupRequest withSubnetIds(
            java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
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
        if (getDBSubnetGroupName() != null)
            sb.append("DBSubnetGroupName: " + getDBSubnetGroupName() + ",");
        if (getDBSubnetGroupDescription() != null)
            sb.append("DBSubnetGroupDescription: "
                    + getDBSubnetGroupDescription() + ",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: " + getSubnetIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyDBSubnetGroupRequest == false)
            return false;
        ModifyDBSubnetGroupRequest other = (ModifyDBSubnetGroupRequest) obj;
        if (other.getDBSubnetGroupName() == null
                ^ this.getDBSubnetGroupName() == null)
            return false;
        if (other.getDBSubnetGroupName() != null
                && other.getDBSubnetGroupName().equals(
                        this.getDBSubnetGroupName()) == false)
            return false;
        if (other.getDBSubnetGroupDescription() == null
                ^ this.getDBSubnetGroupDescription() == null)
            return false;
        if (other.getDBSubnetGroupDescription() != null
                && other.getDBSubnetGroupDescription().equals(
                        this.getDBSubnetGroupDescription()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null
                && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDBSubnetGroupName() == null) ? 0
                        : getDBSubnetGroupName().hashCode());
        hashCode = prime
                * hashCode
                + ((getDBSubnetGroupDescription() == null) ? 0
                        : getDBSubnetGroupDescription().hashCode());
        hashCode = prime * hashCode
                + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        return hashCode;
    }

    @Override
    public ModifyDBSubnetGroupRequest clone() {
        return (ModifyDBSubnetGroupRequest) super.clone();
    }
}

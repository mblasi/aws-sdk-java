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
package com.amazonaws.services.glacier.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the Amazon Glacier response to your request.
 * </p>
 */
public class DescribeVaultResult extends
        com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata>
        implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the vault.
     * </p>
     */
    private String vaultARN;
    /**
     * <p>
     * The name of the vault.
     * </p>
     */
    private String vaultName;
    /**
     * <p>
     * The UTC date when the vault was created. A string representation of ISO
     * 8601 date format, for example, "2012-03-20T17:03:43.221Z".
     * </p>
     */
    private String creationDate;
    /**
     * <p>
     * The UTC date when Amazon Glacier completed the last vault inventory. A
     * string representation of ISO 8601 date format, for example,
     * "2012-03-20T17:03:43.221Z".
     * </p>
     */
    private String lastInventoryDate;
    /**
     * <p>
     * The number of archives in the vault as of the last inventory date. This
     * field will return <code>null</code> if an inventory has not yet run on
     * the vault, for example, if you just created the vault.
     * </p>
     */
    private Long numberOfArchives;
    /**
     * <p>
     * Total size, in bytes, of the archives in the vault as of the last
     * inventory date. This field will return null if an inventory has not yet
     * run on the vault, for example, if you just created the vault.
     * </p>
     */
    private Long sizeInBytes;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the vault.
     * </p>
     * 
     * @param vaultARN
     *        The Amazon Resource Name (ARN) of the vault.
     */

    public void setVaultARN(String vaultARN) {
        this.vaultARN = vaultARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the vault.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the vault.
     */

    public String getVaultARN() {
        return this.vaultARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the vault.
     * </p>
     * 
     * @param vaultARN
     *        The Amazon Resource Name (ARN) of the vault.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeVaultResult withVaultARN(String vaultARN) {
        setVaultARN(vaultARN);
        return this;
    }

    /**
     * <p>
     * The name of the vault.
     * </p>
     * 
     * @param vaultName
     *        The name of the vault.
     */

    public void setVaultName(String vaultName) {
        this.vaultName = vaultName;
    }

    /**
     * <p>
     * The name of the vault.
     * </p>
     * 
     * @return The name of the vault.
     */

    public String getVaultName() {
        return this.vaultName;
    }

    /**
     * <p>
     * The name of the vault.
     * </p>
     * 
     * @param vaultName
     *        The name of the vault.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeVaultResult withVaultName(String vaultName) {
        setVaultName(vaultName);
        return this;
    }

    /**
     * <p>
     * The UTC date when the vault was created. A string representation of ISO
     * 8601 date format, for example, "2012-03-20T17:03:43.221Z".
     * </p>
     * 
     * @param creationDate
     *        The UTC date when the vault was created. A string representation
     *        of ISO 8601 date format, for example, "2012-03-20T17:03:43.221Z".
     */

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The UTC date when the vault was created. A string representation of ISO
     * 8601 date format, for example, "2012-03-20T17:03:43.221Z".
     * </p>
     * 
     * @return The UTC date when the vault was created. A string representation
     *         of ISO 8601 date format, for example, "2012-03-20T17:03:43.221Z".
     */

    public String getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The UTC date when the vault was created. A string representation of ISO
     * 8601 date format, for example, "2012-03-20T17:03:43.221Z".
     * </p>
     * 
     * @param creationDate
     *        The UTC date when the vault was created. A string representation
     *        of ISO 8601 date format, for example, "2012-03-20T17:03:43.221Z".
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeVaultResult withCreationDate(String creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The UTC date when Amazon Glacier completed the last vault inventory. A
     * string representation of ISO 8601 date format, for example,
     * "2012-03-20T17:03:43.221Z".
     * </p>
     * 
     * @param lastInventoryDate
     *        The UTC date when Amazon Glacier completed the last vault
     *        inventory. A string representation of ISO 8601 date format, for
     *        example, "2012-03-20T17:03:43.221Z".
     */

    public void setLastInventoryDate(String lastInventoryDate) {
        this.lastInventoryDate = lastInventoryDate;
    }

    /**
     * <p>
     * The UTC date when Amazon Glacier completed the last vault inventory. A
     * string representation of ISO 8601 date format, for example,
     * "2012-03-20T17:03:43.221Z".
     * </p>
     * 
     * @return The UTC date when Amazon Glacier completed the last vault
     *         inventory. A string representation of ISO 8601 date format, for
     *         example, "2012-03-20T17:03:43.221Z".
     */

    public String getLastInventoryDate() {
        return this.lastInventoryDate;
    }

    /**
     * <p>
     * The UTC date when Amazon Glacier completed the last vault inventory. A
     * string representation of ISO 8601 date format, for example,
     * "2012-03-20T17:03:43.221Z".
     * </p>
     * 
     * @param lastInventoryDate
     *        The UTC date when Amazon Glacier completed the last vault
     *        inventory. A string representation of ISO 8601 date format, for
     *        example, "2012-03-20T17:03:43.221Z".
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeVaultResult withLastInventoryDate(String lastInventoryDate) {
        setLastInventoryDate(lastInventoryDate);
        return this;
    }

    /**
     * <p>
     * The number of archives in the vault as of the last inventory date. This
     * field will return <code>null</code> if an inventory has not yet run on
     * the vault, for example, if you just created the vault.
     * </p>
     * 
     * @param numberOfArchives
     *        The number of archives in the vault as of the last inventory date.
     *        This field will return <code>null</code> if an inventory has not
     *        yet run on the vault, for example, if you just created the vault.
     */

    public void setNumberOfArchives(Long numberOfArchives) {
        this.numberOfArchives = numberOfArchives;
    }

    /**
     * <p>
     * The number of archives in the vault as of the last inventory date. This
     * field will return <code>null</code> if an inventory has not yet run on
     * the vault, for example, if you just created the vault.
     * </p>
     * 
     * @return The number of archives in the vault as of the last inventory
     *         date. This field will return <code>null</code> if an inventory
     *         has not yet run on the vault, for example, if you just created
     *         the vault.
     */

    public Long getNumberOfArchives() {
        return this.numberOfArchives;
    }

    /**
     * <p>
     * The number of archives in the vault as of the last inventory date. This
     * field will return <code>null</code> if an inventory has not yet run on
     * the vault, for example, if you just created the vault.
     * </p>
     * 
     * @param numberOfArchives
     *        The number of archives in the vault as of the last inventory date.
     *        This field will return <code>null</code> if an inventory has not
     *        yet run on the vault, for example, if you just created the vault.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeVaultResult withNumberOfArchives(Long numberOfArchives) {
        setNumberOfArchives(numberOfArchives);
        return this;
    }

    /**
     * <p>
     * Total size, in bytes, of the archives in the vault as of the last
     * inventory date. This field will return null if an inventory has not yet
     * run on the vault, for example, if you just created the vault.
     * </p>
     * 
     * @param sizeInBytes
     *        Total size, in bytes, of the archives in the vault as of the last
     *        inventory date. This field will return null if an inventory has
     *        not yet run on the vault, for example, if you just created the
     *        vault.
     */

    public void setSizeInBytes(Long sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
    }

    /**
     * <p>
     * Total size, in bytes, of the archives in the vault as of the last
     * inventory date. This field will return null if an inventory has not yet
     * run on the vault, for example, if you just created the vault.
     * </p>
     * 
     * @return Total size, in bytes, of the archives in the vault as of the last
     *         inventory date. This field will return null if an inventory has
     *         not yet run on the vault, for example, if you just created the
     *         vault.
     */

    public Long getSizeInBytes() {
        return this.sizeInBytes;
    }

    /**
     * <p>
     * Total size, in bytes, of the archives in the vault as of the last
     * inventory date. This field will return null if an inventory has not yet
     * run on the vault, for example, if you just created the vault.
     * </p>
     * 
     * @param sizeInBytes
     *        Total size, in bytes, of the archives in the vault as of the last
     *        inventory date. This field will return null if an inventory has
     *        not yet run on the vault, for example, if you just created the
     *        vault.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeVaultResult withSizeInBytes(Long sizeInBytes) {
        setSizeInBytes(sizeInBytes);
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
        if (getVaultARN() != null)
            sb.append("VaultARN: " + getVaultARN() + ",");
        if (getVaultName() != null)
            sb.append("VaultName: " + getVaultName() + ",");
        if (getCreationDate() != null)
            sb.append("CreationDate: " + getCreationDate() + ",");
        if (getLastInventoryDate() != null)
            sb.append("LastInventoryDate: " + getLastInventoryDate() + ",");
        if (getNumberOfArchives() != null)
            sb.append("NumberOfArchives: " + getNumberOfArchives() + ",");
        if (getSizeInBytes() != null)
            sb.append("SizeInBytes: " + getSizeInBytes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeVaultResult == false)
            return false;
        DescribeVaultResult other = (DescribeVaultResult) obj;
        if (other.getVaultARN() == null ^ this.getVaultARN() == null)
            return false;
        if (other.getVaultARN() != null
                && other.getVaultARN().equals(this.getVaultARN()) == false)
            return false;
        if (other.getVaultName() == null ^ this.getVaultName() == null)
            return false;
        if (other.getVaultName() != null
                && other.getVaultName().equals(this.getVaultName()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getLastInventoryDate() == null
                ^ this.getLastInventoryDate() == null)
            return false;
        if (other.getLastInventoryDate() != null
                && other.getLastInventoryDate().equals(
                        this.getLastInventoryDate()) == false)
            return false;
        if (other.getNumberOfArchives() == null
                ^ this.getNumberOfArchives() == null)
            return false;
        if (other.getNumberOfArchives() != null
                && other.getNumberOfArchives().equals(
                        this.getNumberOfArchives()) == false)
            return false;
        if (other.getSizeInBytes() == null ^ this.getSizeInBytes() == null)
            return false;
        if (other.getSizeInBytes() != null
                && other.getSizeInBytes().equals(this.getSizeInBytes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVaultARN() == null) ? 0 : getVaultARN().hashCode());
        hashCode = prime * hashCode
                + ((getVaultName() == null) ? 0 : getVaultName().hashCode());
        hashCode = prime
                * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getLastInventoryDate() == null) ? 0
                        : getLastInventoryDate().hashCode());
        hashCode = prime
                * hashCode
                + ((getNumberOfArchives() == null) ? 0 : getNumberOfArchives()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getSizeInBytes() == null) ? 0 : getSizeInBytes().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVaultResult clone() {
        try {
            return (DescribeVaultResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

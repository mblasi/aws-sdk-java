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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The result of the <code>CreateSnapshotCopyGrant</code> action.
 * </p>
 */
public class CreateSnapshotCopyGrantRequest extends
        com.amazonaws.AmazonWebServiceRequest implements Serializable,
        Cloneable {

    /**
     * <p>
     * The name of the snapshot copy grant. This name must be unique in the
     * region for the AWS account.
     * </p>
     * <p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>Must contain from 1 to 63 alphanumeric characters or hyphens.</li>
     * <li>Alphabetic characters must be lowercase.</li>
     * <li>First character must be a letter.</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     * <li>Must be unique for all clusters within an AWS account.</li>
     * </ul>
     * </p>
     */
    private String snapshotCopyGrantName;
    /**
     * <p>
     * The unique identifier of the customer master key (CMK) to which to grant
     * Amazon Redshift permission. If no key is specified, the default key is
     * used.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * A list of tag instances.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The name of the snapshot copy grant. This name must be unique in the
     * region for the AWS account.
     * </p>
     * <p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>Must contain from 1 to 63 alphanumeric characters or hyphens.</li>
     * <li>Alphabetic characters must be lowercase.</li>
     * <li>First character must be a letter.</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     * <li>Must be unique for all clusters within an AWS account.</li>
     * </ul>
     * </p>
     * 
     * @param snapshotCopyGrantName
     *        The name of the snapshot copy grant. This name must be unique in
     *        the region for the AWS account.</p>
     *        <p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>Must contain from 1 to 63 alphanumeric characters or hyphens.</li>
     *        <li>Alphabetic characters must be lowercase.</li>
     *        <li>First character must be a letter.</li>
     *        <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     *        <li>Must be unique for all clusters within an AWS account.</li>
     *        </ul>
     */

    public void setSnapshotCopyGrantName(String snapshotCopyGrantName) {
        this.snapshotCopyGrantName = snapshotCopyGrantName;
    }

    /**
     * <p>
     * The name of the snapshot copy grant. This name must be unique in the
     * region for the AWS account.
     * </p>
     * <p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>Must contain from 1 to 63 alphanumeric characters or hyphens.</li>
     * <li>Alphabetic characters must be lowercase.</li>
     * <li>First character must be a letter.</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     * <li>Must be unique for all clusters within an AWS account.</li>
     * </ul>
     * </p>
     * 
     * @return The name of the snapshot copy grant. This name must be unique in
     *         the region for the AWS account.</p>
     *         <p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>Must contain from 1 to 63 alphanumeric characters or hyphens.
     *         </li>
     *         <li>Alphabetic characters must be lowercase.</li>
     *         <li>First character must be a letter.</li>
     *         <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     *         <li>Must be unique for all clusters within an AWS account.</li>
     *         </ul>
     */

    public String getSnapshotCopyGrantName() {
        return this.snapshotCopyGrantName;
    }

    /**
     * <p>
     * The name of the snapshot copy grant. This name must be unique in the
     * region for the AWS account.
     * </p>
     * <p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>Must contain from 1 to 63 alphanumeric characters or hyphens.</li>
     * <li>Alphabetic characters must be lowercase.</li>
     * <li>First character must be a letter.</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     * <li>Must be unique for all clusters within an AWS account.</li>
     * </ul>
     * </p>
     * 
     * @param snapshotCopyGrantName
     *        The name of the snapshot copy grant. This name must be unique in
     *        the region for the AWS account.</p>
     *        <p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>Must contain from 1 to 63 alphanumeric characters or hyphens.</li>
     *        <li>Alphabetic characters must be lowercase.</li>
     *        <li>First character must be a letter.</li>
     *        <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     *        <li>Must be unique for all clusters within an AWS account.</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateSnapshotCopyGrantRequest withSnapshotCopyGrantName(
            String snapshotCopyGrantName) {
        setSnapshotCopyGrantName(snapshotCopyGrantName);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the customer master key (CMK) to which to grant
     * Amazon Redshift permission. If no key is specified, the default key is
     * used.
     * </p>
     * 
     * @param kmsKeyId
     *        The unique identifier of the customer master key (CMK) to which to
     *        grant Amazon Redshift permission. If no key is specified, the
     *        default key is used.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The unique identifier of the customer master key (CMK) to which to grant
     * Amazon Redshift permission. If no key is specified, the default key is
     * used.
     * </p>
     * 
     * @return The unique identifier of the customer master key (CMK) to which
     *         to grant Amazon Redshift permission. If no key is specified, the
     *         default key is used.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The unique identifier of the customer master key (CMK) to which to grant
     * Amazon Redshift permission. If no key is specified, the default key is
     * used.
     * </p>
     * 
     * @param kmsKeyId
     *        The unique identifier of the customer master key (CMK) to which to
     *        grant Amazon Redshift permission. If no key is specified, the
     *        default key is used.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateSnapshotCopyGrantRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * A list of tag instances.
     * </p>
     * 
     * @return A list of tag instances.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * A list of tag instances.
     * </p>
     * 
     * @param tags
     *        A list of tag instances.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tag instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTags(java.util.Collection)} or
     * {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tag instances.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateSnapshotCopyGrantRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tag instances.
     * </p>
     * 
     * @param tags
     *        A list of tag instances.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateSnapshotCopyGrantRequest withTags(
            java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getSnapshotCopyGrantName() != null)
            sb.append("SnapshotCopyGrantName: " + getSnapshotCopyGrantName()
                    + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSnapshotCopyGrantRequest == false)
            return false;
        CreateSnapshotCopyGrantRequest other = (CreateSnapshotCopyGrantRequest) obj;
        if (other.getSnapshotCopyGrantName() == null
                ^ this.getSnapshotCopyGrantName() == null)
            return false;
        if (other.getSnapshotCopyGrantName() != null
                && other.getSnapshotCopyGrantName().equals(
                        this.getSnapshotCopyGrantName()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null
                && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null
                && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getSnapshotCopyGrantName() == null) ? 0
                        : getSnapshotCopyGrantName().hashCode());
        hashCode = prime * hashCode
                + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateSnapshotCopyGrantRequest clone() {
        return (CreateSnapshotCopyGrantRequest) super.clone();
    }
}

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
 * </p>
 */
public class RevokeSnapshotAccessRequest extends
        com.amazonaws.AmazonWebServiceRequest implements Serializable,
        Cloneable {

    /**
     * <p>
     * The identifier of the snapshot that the account can no longer access.
     * </p>
     */
    private String snapshotIdentifier;
    /**
     * <p>
     * The identifier of the cluster the snapshot was created from. This
     * parameter is required if your IAM user has a policy containing a snapshot
     * resource element that specifies anything other than * for the cluster
     * name.
     * </p>
     */
    private String snapshotClusterIdentifier;
    /**
     * <p>
     * The identifier of the AWS customer account that can no longer restore the
     * specified snapshot.
     * </p>
     */
    private String accountWithRestoreAccess;

    /**
     * <p>
     * The identifier of the snapshot that the account can no longer access.
     * </p>
     * 
     * @param snapshotIdentifier
     *        The identifier of the snapshot that the account can no longer
     *        access.
     */

    public void setSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the snapshot that the account can no longer access.
     * </p>
     * 
     * @return The identifier of the snapshot that the account can no longer
     *         access.
     */

    public String getSnapshotIdentifier() {
        return this.snapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the snapshot that the account can no longer access.
     * </p>
     * 
     * @param snapshotIdentifier
     *        The identifier of the snapshot that the account can no longer
     *        access.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public RevokeSnapshotAccessRequest withSnapshotIdentifier(
            String snapshotIdentifier) {
        setSnapshotIdentifier(snapshotIdentifier);
        return this;
    }

    /**
     * <p>
     * The identifier of the cluster the snapshot was created from. This
     * parameter is required if your IAM user has a policy containing a snapshot
     * resource element that specifies anything other than * for the cluster
     * name.
     * </p>
     * 
     * @param snapshotClusterIdentifier
     *        The identifier of the cluster the snapshot was created from. This
     *        parameter is required if your IAM user has a policy containing a
     *        snapshot resource element that specifies anything other than * for
     *        the cluster name.
     */

    public void setSnapshotClusterIdentifier(String snapshotClusterIdentifier) {
        this.snapshotClusterIdentifier = snapshotClusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the cluster the snapshot was created from. This
     * parameter is required if your IAM user has a policy containing a snapshot
     * resource element that specifies anything other than * for the cluster
     * name.
     * </p>
     * 
     * @return The identifier of the cluster the snapshot was created from. This
     *         parameter is required if your IAM user has a policy containing a
     *         snapshot resource element that specifies anything other than *
     *         for the cluster name.
     */

    public String getSnapshotClusterIdentifier() {
        return this.snapshotClusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the cluster the snapshot was created from. This
     * parameter is required if your IAM user has a policy containing a snapshot
     * resource element that specifies anything other than * for the cluster
     * name.
     * </p>
     * 
     * @param snapshotClusterIdentifier
     *        The identifier of the cluster the snapshot was created from. This
     *        parameter is required if your IAM user has a policy containing a
     *        snapshot resource element that specifies anything other than * for
     *        the cluster name.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public RevokeSnapshotAccessRequest withSnapshotClusterIdentifier(
            String snapshotClusterIdentifier) {
        setSnapshotClusterIdentifier(snapshotClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The identifier of the AWS customer account that can no longer restore the
     * specified snapshot.
     * </p>
     * 
     * @param accountWithRestoreAccess
     *        The identifier of the AWS customer account that can no longer
     *        restore the specified snapshot.
     */

    public void setAccountWithRestoreAccess(String accountWithRestoreAccess) {
        this.accountWithRestoreAccess = accountWithRestoreAccess;
    }

    /**
     * <p>
     * The identifier of the AWS customer account that can no longer restore the
     * specified snapshot.
     * </p>
     * 
     * @return The identifier of the AWS customer account that can no longer
     *         restore the specified snapshot.
     */

    public String getAccountWithRestoreAccess() {
        return this.accountWithRestoreAccess;
    }

    /**
     * <p>
     * The identifier of the AWS customer account that can no longer restore the
     * specified snapshot.
     * </p>
     * 
     * @param accountWithRestoreAccess
     *        The identifier of the AWS customer account that can no longer
     *        restore the specified snapshot.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public RevokeSnapshotAccessRequest withAccountWithRestoreAccess(
            String accountWithRestoreAccess) {
        setAccountWithRestoreAccess(accountWithRestoreAccess);
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
        if (getSnapshotIdentifier() != null)
            sb.append("SnapshotIdentifier: " + getSnapshotIdentifier() + ",");
        if (getSnapshotClusterIdentifier() != null)
            sb.append("SnapshotClusterIdentifier: "
                    + getSnapshotClusterIdentifier() + ",");
        if (getAccountWithRestoreAccess() != null)
            sb.append("AccountWithRestoreAccess: "
                    + getAccountWithRestoreAccess());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RevokeSnapshotAccessRequest == false)
            return false;
        RevokeSnapshotAccessRequest other = (RevokeSnapshotAccessRequest) obj;
        if (other.getSnapshotIdentifier() == null
                ^ this.getSnapshotIdentifier() == null)
            return false;
        if (other.getSnapshotIdentifier() != null
                && other.getSnapshotIdentifier().equals(
                        this.getSnapshotIdentifier()) == false)
            return false;
        if (other.getSnapshotClusterIdentifier() == null
                ^ this.getSnapshotClusterIdentifier() == null)
            return false;
        if (other.getSnapshotClusterIdentifier() != null
                && other.getSnapshotClusterIdentifier().equals(
                        this.getSnapshotClusterIdentifier()) == false)
            return false;
        if (other.getAccountWithRestoreAccess() == null
                ^ this.getAccountWithRestoreAccess() == null)
            return false;
        if (other.getAccountWithRestoreAccess() != null
                && other.getAccountWithRestoreAccess().equals(
                        this.getAccountWithRestoreAccess()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getSnapshotIdentifier() == null) ? 0
                        : getSnapshotIdentifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getSnapshotClusterIdentifier() == null) ? 0
                        : getSnapshotClusterIdentifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getAccountWithRestoreAccess() == null) ? 0
                        : getAccountWithRestoreAccess().hashCode());
        return hashCode;
    }

    @Override
    public RevokeSnapshotAccessRequest clone() {
        return (RevokeSnapshotAccessRequest) super.clone();
    }
}

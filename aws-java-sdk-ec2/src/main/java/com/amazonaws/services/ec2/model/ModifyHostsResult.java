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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceResult;

/**
 * <p>
 * Contains the output of ModifyHosts.
 * </p>
 */
public class ModifyHostsResult extends
        com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata>
        implements Serializable, Cloneable {

    /**
     * <p>
     * The IDs of the Dedicated Hosts that were successfully modified.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> successful;
    /**
     * <p>
     * The IDs of the Dedicated Hosts that could not be modified. Check whether
     * the setting you requested can be used.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<UnsuccessfulItem> unsuccessful;

    /**
     * <p>
     * The IDs of the Dedicated Hosts that were successfully modified.
     * </p>
     * 
     * @return The IDs of the Dedicated Hosts that were successfully modified.
     */

    public java.util.List<String> getSuccessful() {
        if (successful == null) {
            successful = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return successful;
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts that were successfully modified.
     * </p>
     * 
     * @param successful
     *        The IDs of the Dedicated Hosts that were successfully modified.
     */

    public void setSuccessful(java.util.Collection<String> successful) {
        if (successful == null) {
            this.successful = null;
            return;
        }

        this.successful = new com.amazonaws.internal.SdkInternalList<String>(
                successful);
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts that were successfully modified.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSuccessful(java.util.Collection)} or
     * {@link #withSuccessful(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param successful
     *        The IDs of the Dedicated Hosts that were successfully modified.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyHostsResult withSuccessful(String... successful) {
        if (this.successful == null) {
            setSuccessful(new com.amazonaws.internal.SdkInternalList<String>(
                    successful.length));
        }
        for (String ele : successful) {
            this.successful.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts that were successfully modified.
     * </p>
     * 
     * @param successful
     *        The IDs of the Dedicated Hosts that were successfully modified.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyHostsResult withSuccessful(
            java.util.Collection<String> successful) {
        setSuccessful(successful);
        return this;
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts that could not be modified. Check whether
     * the setting you requested can be used.
     * </p>
     * 
     * @return The IDs of the Dedicated Hosts that could not be modified. Check
     *         whether the setting you requested can be used.
     */

    public java.util.List<UnsuccessfulItem> getUnsuccessful() {
        if (unsuccessful == null) {
            unsuccessful = new com.amazonaws.internal.SdkInternalList<UnsuccessfulItem>();
        }
        return unsuccessful;
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts that could not be modified. Check whether
     * the setting you requested can be used.
     * </p>
     * 
     * @param unsuccessful
     *        The IDs of the Dedicated Hosts that could not be modified. Check
     *        whether the setting you requested can be used.
     */

    public void setUnsuccessful(
            java.util.Collection<UnsuccessfulItem> unsuccessful) {
        if (unsuccessful == null) {
            this.unsuccessful = null;
            return;
        }

        this.unsuccessful = new com.amazonaws.internal.SdkInternalList<UnsuccessfulItem>(
                unsuccessful);
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts that could not be modified. Check whether
     * the setting you requested can be used.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setUnsuccessful(java.util.Collection)} or
     * {@link #withUnsuccessful(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param unsuccessful
     *        The IDs of the Dedicated Hosts that could not be modified. Check
     *        whether the setting you requested can be used.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyHostsResult withUnsuccessful(UnsuccessfulItem... unsuccessful) {
        if (this.unsuccessful == null) {
            setUnsuccessful(new com.amazonaws.internal.SdkInternalList<UnsuccessfulItem>(
                    unsuccessful.length));
        }
        for (UnsuccessfulItem ele : unsuccessful) {
            this.unsuccessful.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts that could not be modified. Check whether
     * the setting you requested can be used.
     * </p>
     * 
     * @param unsuccessful
     *        The IDs of the Dedicated Hosts that could not be modified. Check
     *        whether the setting you requested can be used.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyHostsResult withUnsuccessful(
            java.util.Collection<UnsuccessfulItem> unsuccessful) {
        setUnsuccessful(unsuccessful);
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
        if (getSuccessful() != null)
            sb.append("Successful: " + getSuccessful() + ",");
        if (getUnsuccessful() != null)
            sb.append("Unsuccessful: " + getUnsuccessful());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyHostsResult == false)
            return false;
        ModifyHostsResult other = (ModifyHostsResult) obj;
        if (other.getSuccessful() == null ^ this.getSuccessful() == null)
            return false;
        if (other.getSuccessful() != null
                && other.getSuccessful().equals(this.getSuccessful()) == false)
            return false;
        if (other.getUnsuccessful() == null ^ this.getUnsuccessful() == null)
            return false;
        if (other.getUnsuccessful() != null
                && other.getUnsuccessful().equals(this.getUnsuccessful()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSuccessful() == null) ? 0 : getSuccessful().hashCode());
        hashCode = prime
                * hashCode
                + ((getUnsuccessful() == null) ? 0 : getUnsuccessful()
                        .hashCode());
        return hashCode;
    }

    @Override
    public ModifyHostsResult clone() {
        try {
            return (ModifyHostsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

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
 * Contains the output of UnmonitorInstances.
 * </p>
 */
public class UnmonitorInstancesResult extends
        com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata>
        implements Serializable, Cloneable {

    /**
     * <p>
     * Monitoring information for one or more instances.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InstanceMonitoring> instanceMonitorings;

    /**
     * <p>
     * Monitoring information for one or more instances.
     * </p>
     * 
     * @return Monitoring information for one or more instances.
     */

    public java.util.List<InstanceMonitoring> getInstanceMonitorings() {
        if (instanceMonitorings == null) {
            instanceMonitorings = new com.amazonaws.internal.SdkInternalList<InstanceMonitoring>();
        }
        return instanceMonitorings;
    }

    /**
     * <p>
     * Monitoring information for one or more instances.
     * </p>
     * 
     * @param instanceMonitorings
     *        Monitoring information for one or more instances.
     */

    public void setInstanceMonitorings(
            java.util.Collection<InstanceMonitoring> instanceMonitorings) {
        if (instanceMonitorings == null) {
            this.instanceMonitorings = null;
            return;
        }

        this.instanceMonitorings = new com.amazonaws.internal.SdkInternalList<InstanceMonitoring>(
                instanceMonitorings);
    }

    /**
     * <p>
     * Monitoring information for one or more instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setInstanceMonitorings(java.util.Collection)} or
     * {@link #withInstanceMonitorings(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param instanceMonitorings
     *        Monitoring information for one or more instances.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UnmonitorInstancesResult withInstanceMonitorings(
            InstanceMonitoring... instanceMonitorings) {
        if (this.instanceMonitorings == null) {
            setInstanceMonitorings(new com.amazonaws.internal.SdkInternalList<InstanceMonitoring>(
                    instanceMonitorings.length));
        }
        for (InstanceMonitoring ele : instanceMonitorings) {
            this.instanceMonitorings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Monitoring information for one or more instances.
     * </p>
     * 
     * @param instanceMonitorings
     *        Monitoring information for one or more instances.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UnmonitorInstancesResult withInstanceMonitorings(
            java.util.Collection<InstanceMonitoring> instanceMonitorings) {
        setInstanceMonitorings(instanceMonitorings);
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
        if (getInstanceMonitorings() != null)
            sb.append("InstanceMonitorings: " + getInstanceMonitorings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UnmonitorInstancesResult == false)
            return false;
        UnmonitorInstancesResult other = (UnmonitorInstancesResult) obj;
        if (other.getInstanceMonitorings() == null
                ^ this.getInstanceMonitorings() == null)
            return false;
        if (other.getInstanceMonitorings() != null
                && other.getInstanceMonitorings().equals(
                        this.getInstanceMonitorings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getInstanceMonitorings() == null) ? 0
                        : getInstanceMonitorings().hashCode());
        return hashCode;
    }

    @Override
    public UnmonitorInstancesResult clone() {
        try {
            return (UnmonitorInstancesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

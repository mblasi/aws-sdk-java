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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DeregisterVolumeRequest extends
        com.amazonaws.AmazonWebServiceRequest implements Serializable,
        Cloneable {

    /**
     * <p>
     * The AWS OpsWorks volume ID, which is the GUID that AWS OpsWorks assigned
     * to the instance when you registered the volume with the stack, not the
     * Amazon EC2 volume ID.
     * </p>
     */
    private String volumeId;

    /**
     * <p>
     * The AWS OpsWorks volume ID, which is the GUID that AWS OpsWorks assigned
     * to the instance when you registered the volume with the stack, not the
     * Amazon EC2 volume ID.
     * </p>
     * 
     * @param volumeId
     *        The AWS OpsWorks volume ID, which is the GUID that AWS OpsWorks
     *        assigned to the instance when you registered the volume with the
     *        stack, not the Amazon EC2 volume ID.
     */

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    /**
     * <p>
     * The AWS OpsWorks volume ID, which is the GUID that AWS OpsWorks assigned
     * to the instance when you registered the volume with the stack, not the
     * Amazon EC2 volume ID.
     * </p>
     * 
     * @return The AWS OpsWorks volume ID, which is the GUID that AWS OpsWorks
     *         assigned to the instance when you registered the volume with the
     *         stack, not the Amazon EC2 volume ID.
     */

    public String getVolumeId() {
        return this.volumeId;
    }

    /**
     * <p>
     * The AWS OpsWorks volume ID, which is the GUID that AWS OpsWorks assigned
     * to the instance when you registered the volume with the stack, not the
     * Amazon EC2 volume ID.
     * </p>
     * 
     * @param volumeId
     *        The AWS OpsWorks volume ID, which is the GUID that AWS OpsWorks
     *        assigned to the instance when you registered the volume with the
     *        stack, not the Amazon EC2 volume ID.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeregisterVolumeRequest withVolumeId(String volumeId) {
        setVolumeId(volumeId);
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
        if (getVolumeId() != null)
            sb.append("VolumeId: " + getVolumeId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeregisterVolumeRequest == false)
            return false;
        DeregisterVolumeRequest other = (DeregisterVolumeRequest) obj;
        if (other.getVolumeId() == null ^ this.getVolumeId() == null)
            return false;
        if (other.getVolumeId() != null
                && other.getVolumeId().equals(this.getVolumeId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode());
        return hashCode;
    }

    @Override
    public DeregisterVolumeRequest clone() {
        return (DeregisterVolumeRequest) super.clone();
    }
}

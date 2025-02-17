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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;

/**
 * 
 */
public class CreateCachediSCSIVolumeResult extends
        com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata>
        implements Serializable, Cloneable {

    private String volumeARN;

    private String targetARN;

    /**
     * @param volumeARN
     */

    public void setVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
    }

    /**
     * @return
     */

    public String getVolumeARN() {
        return this.volumeARN;
    }

    /**
     * @param volumeARN
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateCachediSCSIVolumeResult withVolumeARN(String volumeARN) {
        setVolumeARN(volumeARN);
        return this;
    }

    /**
     * @param targetARN
     */

    public void setTargetARN(String targetARN) {
        this.targetARN = targetARN;
    }

    /**
     * @return
     */

    public String getTargetARN() {
        return this.targetARN;
    }

    /**
     * @param targetARN
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateCachediSCSIVolumeResult withTargetARN(String targetARN) {
        setTargetARN(targetARN);
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
        if (getVolumeARN() != null)
            sb.append("VolumeARN: " + getVolumeARN() + ",");
        if (getTargetARN() != null)
            sb.append("TargetARN: " + getTargetARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCachediSCSIVolumeResult == false)
            return false;
        CreateCachediSCSIVolumeResult other = (CreateCachediSCSIVolumeResult) obj;
        if (other.getVolumeARN() == null ^ this.getVolumeARN() == null)
            return false;
        if (other.getVolumeARN() != null
                && other.getVolumeARN().equals(this.getVolumeARN()) == false)
            return false;
        if (other.getTargetARN() == null ^ this.getTargetARN() == null)
            return false;
        if (other.getTargetARN() != null
                && other.getTargetARN().equals(this.getTargetARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVolumeARN() == null) ? 0 : getVolumeARN().hashCode());
        hashCode = prime * hashCode
                + ((getTargetARN() == null) ? 0 : getTargetARN().hashCode());
        return hashCode;
    }

    @Override
    public CreateCachediSCSIVolumeResult clone() {
        try {
            return (CreateCachediSCSIVolumeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

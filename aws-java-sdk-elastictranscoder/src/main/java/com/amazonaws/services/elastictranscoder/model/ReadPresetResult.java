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
package com.amazonaws.services.elastictranscoder.model;

import java.io.Serializable;

/**
 * <p>
 * The <code>ReadPresetResponse</code> structure.
 * </p>
 */
public class ReadPresetResult extends
        com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata>
        implements Serializable, Cloneable {

    /**
     * <p>
     * A section of the response body that provides information about the
     * preset.
     * </p>
     */
    private Preset preset;

    /**
     * <p>
     * A section of the response body that provides information about the
     * preset.
     * </p>
     * 
     * @param preset
     *        A section of the response body that provides information about the
     *        preset.
     */

    public void setPreset(Preset preset) {
        this.preset = preset;
    }

    /**
     * <p>
     * A section of the response body that provides information about the
     * preset.
     * </p>
     * 
     * @return A section of the response body that provides information about
     *         the preset.
     */

    public Preset getPreset() {
        return this.preset;
    }

    /**
     * <p>
     * A section of the response body that provides information about the
     * preset.
     * </p>
     * 
     * @param preset
     *        A section of the response body that provides information about the
     *        preset.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ReadPresetResult withPreset(Preset preset) {
        setPreset(preset);
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
        if (getPreset() != null)
            sb.append("Preset: " + getPreset());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReadPresetResult == false)
            return false;
        ReadPresetResult other = (ReadPresetResult) obj;
        if (other.getPreset() == null ^ this.getPreset() == null)
            return false;
        if (other.getPreset() != null
                && other.getPreset().equals(this.getPreset()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPreset() == null) ? 0 : getPreset().hashCode());
        return hashCode;
    }

    @Override
    public ReadPresetResult clone() {
        try {
            return (ReadPresetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

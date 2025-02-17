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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the returned data in response to a request action.
 * </p>
 */
public class UpdateFleetPortSettingsResult extends
        com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata>
        implements Serializable, Cloneable {

    /**
     * <p>
     * Unique identifier for the updated fleet.
     * </p>
     */
    private String fleetId;

    /**
     * <p>
     * Unique identifier for the updated fleet.
     * </p>
     * 
     * @param fleetId
     *        Unique identifier for the updated fleet.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * Unique identifier for the updated fleet.
     * </p>
     * 
     * @return Unique identifier for the updated fleet.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * Unique identifier for the updated fleet.
     * </p>
     * 
     * @param fleetId
     *        Unique identifier for the updated fleet.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateFleetPortSettingsResult withFleetId(String fleetId) {
        setFleetId(fleetId);
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
        if (getFleetId() != null)
            sb.append("FleetId: " + getFleetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFleetPortSettingsResult == false)
            return false;
        UpdateFleetPortSettingsResult other = (UpdateFleetPortSettingsResult) obj;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null
                && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFleetPortSettingsResult clone() {
        try {
            return (UpdateFleetPortSettingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

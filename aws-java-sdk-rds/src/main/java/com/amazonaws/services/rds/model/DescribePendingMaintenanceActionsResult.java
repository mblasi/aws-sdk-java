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

/**
 * <p>
 * Data returned from the <b>DescribePendingMaintenanceActions</b> action.
 * </p>
 */
public class DescribePendingMaintenanceActionsResult extends
        com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata>
        implements Serializable, Cloneable {

    /**
     * <p>
     * A list of the pending maintenance actions for the resource.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ResourcePendingMaintenanceActions> pendingMaintenanceActions;
    /**
     * <p>
     * An optional pagination token provided by a previous
     * <code>DescribePendingMaintenanceActions</code> request. If this parameter
     * is specified, the response includes only records beyond the marker, up to
     * a number of records specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * A list of the pending maintenance actions for the resource.
     * </p>
     * 
     * @return A list of the pending maintenance actions for the resource.
     */

    public java.util.List<ResourcePendingMaintenanceActions> getPendingMaintenanceActions() {
        if (pendingMaintenanceActions == null) {
            pendingMaintenanceActions = new com.amazonaws.internal.SdkInternalList<ResourcePendingMaintenanceActions>();
        }
        return pendingMaintenanceActions;
    }

    /**
     * <p>
     * A list of the pending maintenance actions for the resource.
     * </p>
     * 
     * @param pendingMaintenanceActions
     *        A list of the pending maintenance actions for the resource.
     */

    public void setPendingMaintenanceActions(
            java.util.Collection<ResourcePendingMaintenanceActions> pendingMaintenanceActions) {
        if (pendingMaintenanceActions == null) {
            this.pendingMaintenanceActions = null;
            return;
        }

        this.pendingMaintenanceActions = new com.amazonaws.internal.SdkInternalList<ResourcePendingMaintenanceActions>(
                pendingMaintenanceActions);
    }

    /**
     * <p>
     * A list of the pending maintenance actions for the resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setPendingMaintenanceActions(java.util.Collection)} or
     * {@link #withPendingMaintenanceActions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param pendingMaintenanceActions
     *        A list of the pending maintenance actions for the resource.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribePendingMaintenanceActionsResult withPendingMaintenanceActions(
            ResourcePendingMaintenanceActions... pendingMaintenanceActions) {
        if (this.pendingMaintenanceActions == null) {
            setPendingMaintenanceActions(new com.amazonaws.internal.SdkInternalList<ResourcePendingMaintenanceActions>(
                    pendingMaintenanceActions.length));
        }
        for (ResourcePendingMaintenanceActions ele : pendingMaintenanceActions) {
            this.pendingMaintenanceActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the pending maintenance actions for the resource.
     * </p>
     * 
     * @param pendingMaintenanceActions
     *        A list of the pending maintenance actions for the resource.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribePendingMaintenanceActionsResult withPendingMaintenanceActions(
            java.util.Collection<ResourcePendingMaintenanceActions> pendingMaintenanceActions) {
        setPendingMaintenanceActions(pendingMaintenanceActions);
        return this;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous
     * <code>DescribePendingMaintenanceActions</code> request. If this parameter
     * is specified, the response includes only records beyond the marker, up to
     * a number of records specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous
     *        <code>DescribePendingMaintenanceActions</code> request. If this
     *        parameter is specified, the response includes only records beyond
     *        the marker, up to a number of records specified by
     *        <code>MaxRecords</code>.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous
     * <code>DescribePendingMaintenanceActions</code> request. If this parameter
     * is specified, the response includes only records beyond the marker, up to
     * a number of records specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @return An optional pagination token provided by a previous
     *         <code>DescribePendingMaintenanceActions</code> request. If this
     *         parameter is specified, the response includes only records beyond
     *         the marker, up to a number of records specified by
     *         <code>MaxRecords</code>.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous
     * <code>DescribePendingMaintenanceActions</code> request. If this parameter
     * is specified, the response includes only records beyond the marker, up to
     * a number of records specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous
     *        <code>DescribePendingMaintenanceActions</code> request. If this
     *        parameter is specified, the response includes only records beyond
     *        the marker, up to a number of records specified by
     *        <code>MaxRecords</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribePendingMaintenanceActionsResult withMarker(String marker) {
        setMarker(marker);
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
        if (getPendingMaintenanceActions() != null)
            sb.append("PendingMaintenanceActions: "
                    + getPendingMaintenanceActions() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePendingMaintenanceActionsResult == false)
            return false;
        DescribePendingMaintenanceActionsResult other = (DescribePendingMaintenanceActionsResult) obj;
        if (other.getPendingMaintenanceActions() == null
                ^ this.getPendingMaintenanceActions() == null)
            return false;
        if (other.getPendingMaintenanceActions() != null
                && other.getPendingMaintenanceActions().equals(
                        this.getPendingMaintenanceActions()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null
                && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getPendingMaintenanceActions() == null) ? 0
                        : getPendingMaintenanceActions().hashCode());
        hashCode = prime * hashCode
                + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribePendingMaintenanceActionsResult clone() {
        try {
            return (DescribePendingMaintenanceActionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

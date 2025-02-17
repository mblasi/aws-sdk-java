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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of EnterStandby.
 * </p>
 */
public class EnterStandbyResult extends
        com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata>
        implements Serializable, Cloneable {

    /**
     * <p>
     * The activities related to moving instances into <code>Standby</code>
     * mode.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Activity> activities;

    /**
     * <p>
     * The activities related to moving instances into <code>Standby</code>
     * mode.
     * </p>
     * 
     * @return The activities related to moving instances into
     *         <code>Standby</code> mode.
     */

    public java.util.List<Activity> getActivities() {
        if (activities == null) {
            activities = new com.amazonaws.internal.SdkInternalList<Activity>();
        }
        return activities;
    }

    /**
     * <p>
     * The activities related to moving instances into <code>Standby</code>
     * mode.
     * </p>
     * 
     * @param activities
     *        The activities related to moving instances into
     *        <code>Standby</code> mode.
     */

    public void setActivities(java.util.Collection<Activity> activities) {
        if (activities == null) {
            this.activities = null;
            return;
        }

        this.activities = new com.amazonaws.internal.SdkInternalList<Activity>(
                activities);
    }

    /**
     * <p>
     * The activities related to moving instances into <code>Standby</code>
     * mode.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setActivities(java.util.Collection)} or
     * {@link #withActivities(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param activities
     *        The activities related to moving instances into
     *        <code>Standby</code> mode.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public EnterStandbyResult withActivities(Activity... activities) {
        if (this.activities == null) {
            setActivities(new com.amazonaws.internal.SdkInternalList<Activity>(
                    activities.length));
        }
        for (Activity ele : activities) {
            this.activities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The activities related to moving instances into <code>Standby</code>
     * mode.
     * </p>
     * 
     * @param activities
     *        The activities related to moving instances into
     *        <code>Standby</code> mode.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public EnterStandbyResult withActivities(
            java.util.Collection<Activity> activities) {
        setActivities(activities);
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
        if (getActivities() != null)
            sb.append("Activities: " + getActivities());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnterStandbyResult == false)
            return false;
        EnterStandbyResult other = (EnterStandbyResult) obj;
        if (other.getActivities() == null ^ this.getActivities() == null)
            return false;
        if (other.getActivities() != null
                && other.getActivities().equals(this.getActivities()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getActivities() == null) ? 0 : getActivities().hashCode());
        return hashCode;
    }

    @Override
    public EnterStandbyResult clone() {
        try {
            return (EnterStandbyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

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
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Describes the inputs for DeleteAlarms.
 * </p>
 */
public class DeleteAlarmsRequest extends com.amazonaws.AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * A list of alarms to be deleted.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> alarmNames;

    /**
     * <p>
     * A list of alarms to be deleted.
     * </p>
     * 
     * @return A list of alarms to be deleted.
     */

    public java.util.List<String> getAlarmNames() {
        if (alarmNames == null) {
            alarmNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return alarmNames;
    }

    /**
     * <p>
     * A list of alarms to be deleted.
     * </p>
     * 
     * @param alarmNames
     *        A list of alarms to be deleted.
     */

    public void setAlarmNames(java.util.Collection<String> alarmNames) {
        if (alarmNames == null) {
            this.alarmNames = null;
            return;
        }

        this.alarmNames = new com.amazonaws.internal.SdkInternalList<String>(
                alarmNames);
    }

    /**
     * <p>
     * A list of alarms to be deleted.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setAlarmNames(java.util.Collection)} or
     * {@link #withAlarmNames(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param alarmNames
     *        A list of alarms to be deleted.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeleteAlarmsRequest withAlarmNames(String... alarmNames) {
        if (this.alarmNames == null) {
            setAlarmNames(new com.amazonaws.internal.SdkInternalList<String>(
                    alarmNames.length));
        }
        for (String ele : alarmNames) {
            this.alarmNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of alarms to be deleted.
     * </p>
     * 
     * @param alarmNames
     *        A list of alarms to be deleted.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeleteAlarmsRequest withAlarmNames(
            java.util.Collection<String> alarmNames) {
        setAlarmNames(alarmNames);
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
        if (getAlarmNames() != null)
            sb.append("AlarmNames: " + getAlarmNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAlarmsRequest == false)
            return false;
        DeleteAlarmsRequest other = (DeleteAlarmsRequest) obj;
        if (other.getAlarmNames() == null ^ this.getAlarmNames() == null)
            return false;
        if (other.getAlarmNames() != null
                && other.getAlarmNames().equals(this.getAlarmNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAlarmNames() == null) ? 0 : getAlarmNames().hashCode());
        return hashCode;
    }

    @Override
    public DeleteAlarmsRequest clone() {
        return (DeleteAlarmsRequest) super.clone();
    }
}

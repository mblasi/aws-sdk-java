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
public class AssignInstanceRequest extends
        com.amazonaws.AmazonWebServiceRequest implements Serializable,
        Cloneable {

    /**
     * <p>
     * The instance ID.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The layer ID, which must correspond to a custom layer. You cannot assign
     * a registered instance to a built-in layer.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> layerIds;

    /**
     * <p>
     * The instance ID.
     * </p>
     * 
     * @param instanceId
     *        The instance ID.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The instance ID.
     * </p>
     * 
     * @return The instance ID.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The instance ID.
     * </p>
     * 
     * @param instanceId
     *        The instance ID.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public AssignInstanceRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The layer ID, which must correspond to a custom layer. You cannot assign
     * a registered instance to a built-in layer.
     * </p>
     * 
     * @return The layer ID, which must correspond to a custom layer. You cannot
     *         assign a registered instance to a built-in layer.
     */

    public java.util.List<String> getLayerIds() {
        if (layerIds == null) {
            layerIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return layerIds;
    }

    /**
     * <p>
     * The layer ID, which must correspond to a custom layer. You cannot assign
     * a registered instance to a built-in layer.
     * </p>
     * 
     * @param layerIds
     *        The layer ID, which must correspond to a custom layer. You cannot
     *        assign a registered instance to a built-in layer.
     */

    public void setLayerIds(java.util.Collection<String> layerIds) {
        if (layerIds == null) {
            this.layerIds = null;
            return;
        }

        this.layerIds = new com.amazonaws.internal.SdkInternalList<String>(
                layerIds);
    }

    /**
     * <p>
     * The layer ID, which must correspond to a custom layer. You cannot assign
     * a registered instance to a built-in layer.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setLayerIds(java.util.Collection)} or
     * {@link #withLayerIds(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param layerIds
     *        The layer ID, which must correspond to a custom layer. You cannot
     *        assign a registered instance to a built-in layer.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public AssignInstanceRequest withLayerIds(String... layerIds) {
        if (this.layerIds == null) {
            setLayerIds(new com.amazonaws.internal.SdkInternalList<String>(
                    layerIds.length));
        }
        for (String ele : layerIds) {
            this.layerIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The layer ID, which must correspond to a custom layer. You cannot assign
     * a registered instance to a built-in layer.
     * </p>
     * 
     * @param layerIds
     *        The layer ID, which must correspond to a custom layer. You cannot
     *        assign a registered instance to a built-in layer.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public AssignInstanceRequest withLayerIds(
            java.util.Collection<String> layerIds) {
        setLayerIds(layerIds);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getLayerIds() != null)
            sb.append("LayerIds: " + getLayerIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssignInstanceRequest == false)
            return false;
        AssignInstanceRequest other = (AssignInstanceRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getLayerIds() == null ^ this.getLayerIds() == null)
            return false;
        if (other.getLayerIds() != null
                && other.getLayerIds().equals(this.getLayerIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getLayerIds() == null) ? 0 : getLayerIds().hashCode());
        return hashCode;
    }

    @Override
    public AssignInstanceRequest clone() {
        return (AssignInstanceRequest) super.clone();
    }
}

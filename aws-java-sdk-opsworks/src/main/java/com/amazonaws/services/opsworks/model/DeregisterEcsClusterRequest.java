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
public class DeregisterEcsClusterRequest extends
        com.amazonaws.AmazonWebServiceRequest implements Serializable,
        Cloneable {

    /**
     * <p>
     * The cluster's ARN.
     * </p>
     */
    private String ecsClusterArn;

    /**
     * <p>
     * The cluster's ARN.
     * </p>
     * 
     * @param ecsClusterArn
     *        The cluster's ARN.
     */

    public void setEcsClusterArn(String ecsClusterArn) {
        this.ecsClusterArn = ecsClusterArn;
    }

    /**
     * <p>
     * The cluster's ARN.
     * </p>
     * 
     * @return The cluster's ARN.
     */

    public String getEcsClusterArn() {
        return this.ecsClusterArn;
    }

    /**
     * <p>
     * The cluster's ARN.
     * </p>
     * 
     * @param ecsClusterArn
     *        The cluster's ARN.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeregisterEcsClusterRequest withEcsClusterArn(String ecsClusterArn) {
        setEcsClusterArn(ecsClusterArn);
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
        if (getEcsClusterArn() != null)
            sb.append("EcsClusterArn: " + getEcsClusterArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeregisterEcsClusterRequest == false)
            return false;
        DeregisterEcsClusterRequest other = (DeregisterEcsClusterRequest) obj;
        if (other.getEcsClusterArn() == null ^ this.getEcsClusterArn() == null)
            return false;
        if (other.getEcsClusterArn() != null
                && other.getEcsClusterArn().equals(this.getEcsClusterArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getEcsClusterArn() == null) ? 0 : getEcsClusterArn()
                        .hashCode());
        return hashCode;
    }

    @Override
    public DeregisterEcsClusterRequest clone() {
        return (DeregisterEcsClusterRequest) super.clone();
    }
}

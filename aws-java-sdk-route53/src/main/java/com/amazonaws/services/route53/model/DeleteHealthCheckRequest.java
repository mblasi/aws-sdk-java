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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * This action deletes a health check. Send a <code>DELETE</code> request to the
 * <code>/2013-04-01/DeleteHealthCheckRequest</code> resource.
 * </p>
 */
public class DeleteHealthCheckRequest extends
        com.amazonaws.AmazonWebServiceRequest implements Serializable,
        Cloneable {

    private String healthCheckId;

    /**
     * @param healthCheckId
     */

    public void setHealthCheckId(String healthCheckId) {
        this.healthCheckId = healthCheckId;
    }

    /**
     * @return
     */

    public String getHealthCheckId() {
        return this.healthCheckId;
    }

    /**
     * @param healthCheckId
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeleteHealthCheckRequest withHealthCheckId(String healthCheckId) {
        setHealthCheckId(healthCheckId);
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
        if (getHealthCheckId() != null)
            sb.append("HealthCheckId: " + getHealthCheckId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteHealthCheckRequest == false)
            return false;
        DeleteHealthCheckRequest other = (DeleteHealthCheckRequest) obj;
        if (other.getHealthCheckId() == null ^ this.getHealthCheckId() == null)
            return false;
        if (other.getHealthCheckId() != null
                && other.getHealthCheckId().equals(this.getHealthCheckId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getHealthCheckId() == null) ? 0 : getHealthCheckId()
                        .hashCode());
        return hashCode;
    }

    @Override
    public DeleteHealthCheckRequest clone() {
        return (DeleteHealthCheckRequest) super.clone();
    }
}

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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Requests Amazon API Gateway to get information about one or more <a>Stage</a>
 * resources.
 * </p>
 */
public class GetStagesRequest extends com.amazonaws.AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The stages' API identifiers.
     * </p>
     */
    private String restApiId;
    /**
     * <p>
     * The stages' deployment identifiers.
     * </p>
     */
    private String deploymentId;

    /**
     * <p>
     * The stages' API identifiers.
     * </p>
     * 
     * @param restApiId
     *        The stages' API identifiers.
     */

    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * The stages' API identifiers.
     * </p>
     * 
     * @return The stages' API identifiers.
     */

    public String getRestApiId() {
        return this.restApiId;
    }

    /**
     * <p>
     * The stages' API identifiers.
     * </p>
     * 
     * @param restApiId
     *        The stages' API identifiers.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetStagesRequest withRestApiId(String restApiId) {
        setRestApiId(restApiId);
        return this;
    }

    /**
     * <p>
     * The stages' deployment identifiers.
     * </p>
     * 
     * @param deploymentId
     *        The stages' deployment identifiers.
     */

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * The stages' deployment identifiers.
     * </p>
     * 
     * @return The stages' deployment identifiers.
     */

    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * <p>
     * The stages' deployment identifiers.
     * </p>
     * 
     * @param deploymentId
     *        The stages' deployment identifiers.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetStagesRequest withDeploymentId(String deploymentId) {
        setDeploymentId(deploymentId);
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
        if (getRestApiId() != null)
            sb.append("RestApiId: " + getRestApiId() + ",");
        if (getDeploymentId() != null)
            sb.append("DeploymentId: " + getDeploymentId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetStagesRequest == false)
            return false;
        GetStagesRequest other = (GetStagesRequest) obj;
        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null
                && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null
                && other.getDeploymentId().equals(this.getDeploymentId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime
                * hashCode
                + ((getDeploymentId() == null) ? 0 : getDeploymentId()
                        .hashCode());
        return hashCode;
    }

    @Override
    public GetStagesRequest clone() {
        return (GetStagesRequest) super.clone();
    }
}

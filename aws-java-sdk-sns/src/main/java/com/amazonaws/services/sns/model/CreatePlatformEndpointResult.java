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
package com.amazonaws.services.sns.model;

import java.io.Serializable;

/**
 * <p>
 * Response from CreateEndpoint action.
 * </p>
 */
public class CreatePlatformEndpointResult extends
        com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata>
        implements Serializable, Cloneable {

    /**
     * <p>
     * EndpointArn returned from CreateEndpoint action.
     * </p>
     */
    private String endpointArn;

    /**
     * <p>
     * EndpointArn returned from CreateEndpoint action.
     * </p>
     * 
     * @param endpointArn
     *        EndpointArn returned from CreateEndpoint action.
     */

    public void setEndpointArn(String endpointArn) {
        this.endpointArn = endpointArn;
    }

    /**
     * <p>
     * EndpointArn returned from CreateEndpoint action.
     * </p>
     * 
     * @return EndpointArn returned from CreateEndpoint action.
     */

    public String getEndpointArn() {
        return this.endpointArn;
    }

    /**
     * <p>
     * EndpointArn returned from CreateEndpoint action.
     * </p>
     * 
     * @param endpointArn
     *        EndpointArn returned from CreateEndpoint action.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreatePlatformEndpointResult withEndpointArn(String endpointArn) {
        setEndpointArn(endpointArn);
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
        if (getEndpointArn() != null)
            sb.append("EndpointArn: " + getEndpointArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePlatformEndpointResult == false)
            return false;
        CreatePlatformEndpointResult other = (CreatePlatformEndpointResult) obj;
        if (other.getEndpointArn() == null ^ this.getEndpointArn() == null)
            return false;
        if (other.getEndpointArn() != null
                && other.getEndpointArn().equals(this.getEndpointArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getEndpointArn() == null) ? 0 : getEndpointArn().hashCode());
        return hashCode;
    }

    @Override
    public CreatePlatformEndpointResult clone() {
        try {
            return (CreatePlatformEndpointResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

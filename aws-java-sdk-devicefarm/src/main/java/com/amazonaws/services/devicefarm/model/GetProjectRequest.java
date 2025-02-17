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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents a request to the get project operation.
 * </p>
 */
public class GetProjectRequest extends com.amazonaws.AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The project's ARN.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The project's ARN.
     * </p>
     * 
     * @param arn
     *        The project's ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The project's ARN.
     * </p>
     * 
     * @return The project's ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The project's ARN.
     * </p>
     * 
     * @param arn
     *        The project's ARN.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetProjectRequest withArn(String arn) {
        setArn(arn);
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
        if (getArn() != null)
            sb.append("Arn: " + getArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetProjectRequest == false)
            return false;
        GetProjectRequest other = (GetProjectRequest) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null
                && other.getArn().equals(this.getArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getArn() == null) ? 0 : getArn().hashCode());
        return hashCode;
    }

    @Override
    public GetProjectRequest clone() {
        return (GetProjectRequest) super.clone();
    }
}

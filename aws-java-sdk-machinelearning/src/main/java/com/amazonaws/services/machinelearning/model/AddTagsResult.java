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
package com.amazonaws.services.machinelearning.model;

import java.io.Serializable;

/**
 * <p>
 * Amazon ML returns the following elements.
 * </p>
 */
public class AddTagsResult extends
        com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata>
        implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the ML object that was tagged.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The type of the ML object that was tagged.
     * </p>
     */
    private String resourceType;

    /**
     * <p>
     * The ID of the ML object that was tagged.
     * </p>
     * 
     * @param resourceId
     *        The ID of the ML object that was tagged.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the ML object that was tagged.
     * </p>
     * 
     * @return The ID of the ML object that was tagged.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The ID of the ML object that was tagged.
     * </p>
     * 
     * @param resourceId
     *        The ID of the ML object that was tagged.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public AddTagsResult withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The type of the ML object that was tagged.
     * </p>
     * 
     * @param resourceType
     *        The type of the ML object that was tagged.
     * @see TaggableResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of the ML object that was tagged.
     * </p>
     * 
     * @return The type of the ML object that was tagged.
     * @see TaggableResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of the ML object that was tagged.
     * </p>
     * 
     * @param resourceType
     *        The type of the ML object that was tagged.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see TaggableResourceType
     */

    public AddTagsResult withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of the ML object that was tagged.
     * </p>
     * 
     * @param resourceType
     *        The type of the ML object that was tagged.
     * @see TaggableResourceType
     */

    public void setResourceType(TaggableResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * <p>
     * The type of the ML object that was tagged.
     * </p>
     * 
     * @param resourceType
     *        The type of the ML object that was tagged.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see TaggableResourceType
     */

    public AddTagsResult withResourceType(TaggableResourceType resourceType) {
        setResourceType(resourceType);
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
        if (getResourceId() != null)
            sb.append("ResourceId: " + getResourceId() + ",");
        if (getResourceType() != null)
            sb.append("ResourceType: " + getResourceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddTagsResult == false)
            return false;
        AddTagsResult other = (AddTagsResult) obj;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null
                && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime
                * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType()
                        .hashCode());
        return hashCode;
    }

    @Override
    public AddTagsResult clone() {
        try {
            return (AddTagsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * The request to remove tags from a CloudFront resource.
 */
public class UntagResourceRequest extends com.amazonaws.AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /** An ARN of a CloudFront resource. */
    private String resource;
    /** A complex type that contains zero or more Tag key elements. */
    private TagKeys tagKeys;

    /**
     * An ARN of a CloudFront resource.
     * 
     * @param resource
     *        An ARN of a CloudFront resource.
     */

    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * An ARN of a CloudFront resource.
     * 
     * @return An ARN of a CloudFront resource.
     */

    public String getResource() {
        return this.resource;
    }

    /**
     * An ARN of a CloudFront resource.
     * 
     * @param resource
     *        An ARN of a CloudFront resource.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UntagResourceRequest withResource(String resource) {
        setResource(resource);
        return this;
    }

    /**
     * A complex type that contains zero or more Tag key elements.
     * 
     * @param tagKeys
     *        A complex type that contains zero or more Tag key elements.
     */

    public void setTagKeys(TagKeys tagKeys) {
        this.tagKeys = tagKeys;
    }

    /**
     * A complex type that contains zero or more Tag key elements.
     * 
     * @return A complex type that contains zero or more Tag key elements.
     */

    public TagKeys getTagKeys() {
        return this.tagKeys;
    }

    /**
     * A complex type that contains zero or more Tag key elements.
     * 
     * @param tagKeys
     *        A complex type that contains zero or more Tag key elements.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UntagResourceRequest withTagKeys(TagKeys tagKeys) {
        setTagKeys(tagKeys);
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
        if (getResource() != null)
            sb.append("Resource: " + getResource() + ",");
        if (getTagKeys() != null)
            sb.append("TagKeys: " + getTagKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UntagResourceRequest == false)
            return false;
        UntagResourceRequest other = (UntagResourceRequest) obj;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null
                && other.getResource().equals(this.getResource()) == false)
            return false;
        if (other.getTagKeys() == null ^ this.getTagKeys() == null)
            return false;
        if (other.getTagKeys() != null
                && other.getTagKeys().equals(this.getTagKeys()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode
                + ((getTagKeys() == null) ? 0 : getTagKeys().hashCode());
        return hashCode;
    }

    @Override
    public UntagResourceRequest clone() {
        return (UntagResourceRequest) super.clone();
    }
}

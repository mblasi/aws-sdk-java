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
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of ModifyTargetGroupAttributes.
 * </p>
 */
public class ModifyTargetGroupAttributesResult extends
        com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata>
        implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the attributes.
     * </p>
     */
    private java.util.List<TargetGroupAttribute> attributes;

    /**
     * <p>
     * Information about the attributes.
     * </p>
     * 
     * @return Information about the attributes.
     */

    public java.util.List<TargetGroupAttribute> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * Information about the attributes.
     * </p>
     * 
     * @param attributes
     *        Information about the attributes.
     */

    public void setAttributes(
            java.util.Collection<TargetGroupAttribute> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }

        this.attributes = new java.util.ArrayList<TargetGroupAttribute>(
                attributes);
    }

    /**
     * <p>
     * Information about the attributes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setAttributes(java.util.Collection)} or
     * {@link #withAttributes(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param attributes
     *        Information about the attributes.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyTargetGroupAttributesResult withAttributes(
            TargetGroupAttribute... attributes) {
        if (this.attributes == null) {
            setAttributes(new java.util.ArrayList<TargetGroupAttribute>(
                    attributes.length));
        }
        for (TargetGroupAttribute ele : attributes) {
            this.attributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the attributes.
     * </p>
     * 
     * @param attributes
     *        Information about the attributes.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyTargetGroupAttributesResult withAttributes(
            java.util.Collection<TargetGroupAttribute> attributes) {
        setAttributes(attributes);
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
        if (getAttributes() != null)
            sb.append("Attributes: " + getAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyTargetGroupAttributesResult == false)
            return false;
        ModifyTargetGroupAttributesResult other = (ModifyTargetGroupAttributesResult) obj;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null
                && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public ModifyTargetGroupAttributesResult clone() {
        try {
            return (ModifyTargetGroupAttributesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

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
 * Represents the output of a <code>DeleteMLModel</code> operation.
 * </p>
 * <p>
 * You can use the <code>GetMLModel</code> operation and check the value of the
 * <code>Status</code> parameter to see whether an <code>MLModel</code> is
 * marked as <code>DELETED</code>.
 * </p>
 */
public class DeleteMLModelResult extends
        com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata>
        implements Serializable, Cloneable {

    /**
     * <p>
     * A user-supplied ID that uniquely identifies the <code>MLModel</code>.
     * This value should be identical to the value of the <code>MLModelID</code>
     * in the request.
     * </p>
     */
    private String mLModelId;

    /**
     * <p>
     * A user-supplied ID that uniquely identifies the <code>MLModel</code>.
     * This value should be identical to the value of the <code>MLModelID</code>
     * in the request.
     * </p>
     * 
     * @param mLModelId
     *        A user-supplied ID that uniquely identifies the
     *        <code>MLModel</code>. This value should be identical to the value
     *        of the <code>MLModelID</code> in the request.
     */

    public void setMLModelId(String mLModelId) {
        this.mLModelId = mLModelId;
    }

    /**
     * <p>
     * A user-supplied ID that uniquely identifies the <code>MLModel</code>.
     * This value should be identical to the value of the <code>MLModelID</code>
     * in the request.
     * </p>
     * 
     * @return A user-supplied ID that uniquely identifies the
     *         <code>MLModel</code>. This value should be identical to the value
     *         of the <code>MLModelID</code> in the request.
     */

    public String getMLModelId() {
        return this.mLModelId;
    }

    /**
     * <p>
     * A user-supplied ID that uniquely identifies the <code>MLModel</code>.
     * This value should be identical to the value of the <code>MLModelID</code>
     * in the request.
     * </p>
     * 
     * @param mLModelId
     *        A user-supplied ID that uniquely identifies the
     *        <code>MLModel</code>. This value should be identical to the value
     *        of the <code>MLModelID</code> in the request.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeleteMLModelResult withMLModelId(String mLModelId) {
        setMLModelId(mLModelId);
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
        if (getMLModelId() != null)
            sb.append("MLModelId: " + getMLModelId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteMLModelResult == false)
            return false;
        DeleteMLModelResult other = (DeleteMLModelResult) obj;
        if (other.getMLModelId() == null ^ this.getMLModelId() == null)
            return false;
        if (other.getMLModelId() != null
                && other.getMLModelId().equals(this.getMLModelId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMLModelId() == null) ? 0 : getMLModelId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteMLModelResult clone() {
        try {
            return (DeleteMLModelResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

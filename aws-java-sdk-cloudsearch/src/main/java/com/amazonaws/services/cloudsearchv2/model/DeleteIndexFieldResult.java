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
package com.amazonaws.services.cloudsearchv2.model;

import java.io.Serializable;

/**
 * <p>
 * The result of a <code><a>DeleteIndexField</a></code> request.
 * </p>
 */
public class DeleteIndexFieldResult extends
        com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata>
        implements Serializable, Cloneable {

    /**
     * <p>
     * The status of the index field being deleted.
     * </p>
     */
    private IndexFieldStatus indexField;

    /**
     * <p>
     * The status of the index field being deleted.
     * </p>
     * 
     * @param indexField
     *        The status of the index field being deleted.
     */

    public void setIndexField(IndexFieldStatus indexField) {
        this.indexField = indexField;
    }

    /**
     * <p>
     * The status of the index field being deleted.
     * </p>
     * 
     * @return The status of the index field being deleted.
     */

    public IndexFieldStatus getIndexField() {
        return this.indexField;
    }

    /**
     * <p>
     * The status of the index field being deleted.
     * </p>
     * 
     * @param indexField
     *        The status of the index field being deleted.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeleteIndexFieldResult withIndexField(IndexFieldStatus indexField) {
        setIndexField(indexField);
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
        if (getIndexField() != null)
            sb.append("IndexField: " + getIndexField());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteIndexFieldResult == false)
            return false;
        DeleteIndexFieldResult other = (DeleteIndexFieldResult) obj;
        if (other.getIndexField() == null ^ this.getIndexField() == null)
            return false;
        if (other.getIndexField() != null
                && other.getIndexField().equals(this.getIndexField()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getIndexField() == null) ? 0 : getIndexField().hashCode());
        return hashCode;
    }

    @Override
    public DeleteIndexFieldResult clone() {
        try {
            return (DeleteIndexFieldResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

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
package com.amazonaws.services.inspector.model;

import java.io.Serializable;

/**
 * 
 */
public class AddAttributesToFindingsResult extends
        com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata>
        implements Serializable, Cloneable {

    /**
     * <p>
     * Attribute details that cannot be described. An error code is provided for
     * each failed item.
     * </p>
     */
    private java.util.Map<String, FailedItemDetails> failedItems;

    /**
     * <p>
     * Attribute details that cannot be described. An error code is provided for
     * each failed item.
     * </p>
     * 
     * @return Attribute details that cannot be described. An error code is
     *         provided for each failed item.
     */

    public java.util.Map<String, FailedItemDetails> getFailedItems() {
        return failedItems;
    }

    /**
     * <p>
     * Attribute details that cannot be described. An error code is provided for
     * each failed item.
     * </p>
     * 
     * @param failedItems
     *        Attribute details that cannot be described. An error code is
     *        provided for each failed item.
     */

    public void setFailedItems(
            java.util.Map<String, FailedItemDetails> failedItems) {
        this.failedItems = failedItems;
    }

    /**
     * <p>
     * Attribute details that cannot be described. An error code is provided for
     * each failed item.
     * </p>
     * 
     * @param failedItems
     *        Attribute details that cannot be described. An error code is
     *        provided for each failed item.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public AddAttributesToFindingsResult withFailedItems(
            java.util.Map<String, FailedItemDetails> failedItems) {
        setFailedItems(failedItems);
        return this;
    }

    public AddAttributesToFindingsResult addFailedItemsEntry(String key,
            FailedItemDetails value) {
        if (null == this.failedItems) {
            this.failedItems = new java.util.HashMap<String, FailedItemDetails>();
        }
        if (this.failedItems.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys ("
                    + key.toString() + ") are provided.");
        this.failedItems.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into FailedItems. &lt;p> Returns a
     * reference to this object so that method calls can be chained together.
     */

    public AddAttributesToFindingsResult clearFailedItemsEntries() {
        this.failedItems = null;
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
        if (getFailedItems() != null)
            sb.append("FailedItems: " + getFailedItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddAttributesToFindingsResult == false)
            return false;
        AddAttributesToFindingsResult other = (AddAttributesToFindingsResult) obj;
        if (other.getFailedItems() == null ^ this.getFailedItems() == null)
            return false;
        if (other.getFailedItems() != null
                && other.getFailedItems().equals(this.getFailedItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getFailedItems() == null) ? 0 : getFailedItems().hashCode());
        return hashCode;
    }

    @Override
    public AddAttributesToFindingsResult clone() {
        try {
            return (AddAttributesToFindingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

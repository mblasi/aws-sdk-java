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
package com.amazonaws.services.kms.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DeleteAliasRequest extends com.amazonaws.AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The alias to be deleted. The name must start with the word "alias"
     * followed by a forward slash (alias/). Aliases that begin with "alias/AWS"
     * are reserved.
     * </p>
     */
    private String aliasName;

    /**
     * <p>
     * The alias to be deleted. The name must start with the word "alias"
     * followed by a forward slash (alias/). Aliases that begin with "alias/AWS"
     * are reserved.
     * </p>
     * 
     * @param aliasName
     *        The alias to be deleted. The name must start with the word "alias"
     *        followed by a forward slash (alias/). Aliases that begin with
     *        "alias/AWS" are reserved.
     */

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    /**
     * <p>
     * The alias to be deleted. The name must start with the word "alias"
     * followed by a forward slash (alias/). Aliases that begin with "alias/AWS"
     * are reserved.
     * </p>
     * 
     * @return The alias to be deleted. The name must start with the word
     *         "alias" followed by a forward slash (alias/). Aliases that begin
     *         with "alias/AWS" are reserved.
     */

    public String getAliasName() {
        return this.aliasName;
    }

    /**
     * <p>
     * The alias to be deleted. The name must start with the word "alias"
     * followed by a forward slash (alias/). Aliases that begin with "alias/AWS"
     * are reserved.
     * </p>
     * 
     * @param aliasName
     *        The alias to be deleted. The name must start with the word "alias"
     *        followed by a forward slash (alias/). Aliases that begin with
     *        "alias/AWS" are reserved.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeleteAliasRequest withAliasName(String aliasName) {
        setAliasName(aliasName);
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
        if (getAliasName() != null)
            sb.append("AliasName: " + getAliasName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAliasRequest == false)
            return false;
        DeleteAliasRequest other = (DeleteAliasRequest) obj;
        if (other.getAliasName() == null ^ this.getAliasName() == null)
            return false;
        if (other.getAliasName() != null
                && other.getAliasName().equals(this.getAliasName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAliasName() == null) ? 0 : getAliasName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteAliasRequest clone() {
        return (DeleteAliasRequest) super.clone();
    }
}

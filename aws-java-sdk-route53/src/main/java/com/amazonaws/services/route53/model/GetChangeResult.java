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
package com.amazonaws.services.route53.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that contains the <code>ChangeInfo</code> element.
 * </p>
 */
public class GetChangeResult extends
        com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata>
        implements Serializable, Cloneable {

    /**
     * <p>
     * A complex type that contains information about the specified change
     * batch.
     * </p>
     */
    private ChangeInfo changeInfo;

    /**
     * <p>
     * A complex type that contains information about the specified change
     * batch.
     * </p>
     * 
     * @param changeInfo
     *        A complex type that contains information about the specified
     *        change batch.
     */

    public void setChangeInfo(ChangeInfo changeInfo) {
        this.changeInfo = changeInfo;
    }

    /**
     * <p>
     * A complex type that contains information about the specified change
     * batch.
     * </p>
     * 
     * @return A complex type that contains information about the specified
     *         change batch.
     */

    public ChangeInfo getChangeInfo() {
        return this.changeInfo;
    }

    /**
     * <p>
     * A complex type that contains information about the specified change
     * batch.
     * </p>
     * 
     * @param changeInfo
     *        A complex type that contains information about the specified
     *        change batch.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetChangeResult withChangeInfo(ChangeInfo changeInfo) {
        setChangeInfo(changeInfo);
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
        if (getChangeInfo() != null)
            sb.append("ChangeInfo: " + getChangeInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetChangeResult == false)
            return false;
        GetChangeResult other = (GetChangeResult) obj;
        if (other.getChangeInfo() == null ^ this.getChangeInfo() == null)
            return false;
        if (other.getChangeInfo() != null
                && other.getChangeInfo().equals(this.getChangeInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getChangeInfo() == null) ? 0 : getChangeInfo().hashCode());
        return hashCode;
    }

    @Override
    public GetChangeResult clone() {
        try {
            return (GetChangeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

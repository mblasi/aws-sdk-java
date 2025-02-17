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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the response to list user pools.
 * </p>
 */
public class ListUserPoolsResult extends
        com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata>
        implements Serializable, Cloneable {

    /**
     * <p>
     * The user pools from the response to list users.
     * </p>
     */
    private java.util.List<UserPoolDescriptionType> userPools;
    /**
     * <p>
     * An identifier that was returned from the previous call to this operation,
     * which can be used to return the next set of items in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The user pools from the response to list users.
     * </p>
     * 
     * @return The user pools from the response to list users.
     */

    public java.util.List<UserPoolDescriptionType> getUserPools() {
        return userPools;
    }

    /**
     * <p>
     * The user pools from the response to list users.
     * </p>
     * 
     * @param userPools
     *        The user pools from the response to list users.
     */

    public void setUserPools(
            java.util.Collection<UserPoolDescriptionType> userPools) {
        if (userPools == null) {
            this.userPools = null;
            return;
        }

        this.userPools = new java.util.ArrayList<UserPoolDescriptionType>(
                userPools);
    }

    /**
     * <p>
     * The user pools from the response to list users.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setUserPools(java.util.Collection)} or
     * {@link #withUserPools(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param userPools
     *        The user pools from the response to list users.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListUserPoolsResult withUserPools(
            UserPoolDescriptionType... userPools) {
        if (this.userPools == null) {
            setUserPools(new java.util.ArrayList<UserPoolDescriptionType>(
                    userPools.length));
        }
        for (UserPoolDescriptionType ele : userPools) {
            this.userPools.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The user pools from the response to list users.
     * </p>
     * 
     * @param userPools
     *        The user pools from the response to list users.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListUserPoolsResult withUserPools(
            java.util.Collection<UserPoolDescriptionType> userPools) {
        setUserPools(userPools);
        return this;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation,
     * which can be used to return the next set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier that was returned from the previous call to this
     *        operation, which can be used to return the next set of items in
     *        the list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation,
     * which can be used to return the next set of items in the list.
     * </p>
     * 
     * @return An identifier that was returned from the previous call to this
     *         operation, which can be used to return the next set of items in
     *         the list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation,
     * which can be used to return the next set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier that was returned from the previous call to this
     *        operation, which can be used to return the next set of items in
     *        the list.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListUserPoolsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getUserPools() != null)
            sb.append("UserPools: " + getUserPools() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListUserPoolsResult == false)
            return false;
        ListUserPoolsResult other = (ListUserPoolsResult) obj;
        if (other.getUserPools() == null ^ this.getUserPools() == null)
            return false;
        if (other.getUserPools() != null
                && other.getUserPools().equals(this.getUserPools()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getUserPools() == null) ? 0 : getUserPools().hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListUserPoolsResult clone() {
        try {
            return (ListUserPoolsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the request to list the user pool clients.
 * </p>
 */
public class ListUserPoolClientsRequest extends
        com.amazonaws.AmazonWebServiceRequest implements Serializable,
        Cloneable {

    /**
     * <p>
     * The user pool ID for the user pool where you want to list user pool
     * clients.
     * </p>
     */
    private String userPoolId;
    /**
     * <p>
     * The maximum number of results you want the request to return when listing
     * the user pool clients.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * An identifier that was returned from the previous call to this operation,
     * which can be used to return the next set of items in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The user pool ID for the user pool where you want to list user pool
     * clients.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID for the user pool where you want to list user
     *        pool clients.
     */

    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool where you want to list user pool
     * clients.
     * </p>
     * 
     * @return The user pool ID for the user pool where you want to list user
     *         pool clients.
     */

    public String getUserPoolId() {
        return this.userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool where you want to list user pool
     * clients.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID for the user pool where you want to list user
     *        pool clients.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListUserPoolClientsRequest withUserPoolId(String userPoolId) {
        setUserPoolId(userPoolId);
        return this;
    }

    /**
     * <p>
     * The maximum number of results you want the request to return when listing
     * the user pool clients.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results you want the request to return when
     *        listing the user pool clients.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results you want the request to return when listing
     * the user pool clients.
     * </p>
     * 
     * @return The maximum number of results you want the request to return when
     *         listing the user pool clients.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results you want the request to return when listing
     * the user pool clients.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results you want the request to return when
     *        listing the user pool clients.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListUserPoolClientsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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

    public ListUserPoolClientsRequest withNextToken(String nextToken) {
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
        if (getUserPoolId() != null)
            sb.append("UserPoolId: " + getUserPoolId() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
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

        if (obj instanceof ListUserPoolClientsRequest == false)
            return false;
        ListUserPoolClientsRequest other = (ListUserPoolClientsRequest) obj;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null
                && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
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
                + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode
                + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListUserPoolClientsRequest clone() {
        return (ListUserPoolClientsRequest) super.clone();
    }
}

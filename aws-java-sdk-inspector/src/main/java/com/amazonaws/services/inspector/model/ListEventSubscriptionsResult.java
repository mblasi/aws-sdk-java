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
public class ListEventSubscriptionsResult extends
        com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata>
        implements Serializable, Cloneable {

    /**
     * <p>
     * Details of the returned event subscriptions.
     * </p>
     */
    private java.util.List<Subscription> subscriptions;
    /**
     * <p>
     * When a response is generated, if there is more data to be listed, this
     * parameter is present in the response and contains the value to use for
     * the <b>nextToken</b> parameter in a subsequent pagination request. If
     * there is no more data to be listed, this parameter is set to null.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Details of the returned event subscriptions.
     * </p>
     * 
     * @return Details of the returned event subscriptions.
     */

    public java.util.List<Subscription> getSubscriptions() {
        return subscriptions;
    }

    /**
     * <p>
     * Details of the returned event subscriptions.
     * </p>
     * 
     * @param subscriptions
     *        Details of the returned event subscriptions.
     */

    public void setSubscriptions(
            java.util.Collection<Subscription> subscriptions) {
        if (subscriptions == null) {
            this.subscriptions = null;
            return;
        }

        this.subscriptions = new java.util.ArrayList<Subscription>(
                subscriptions);
    }

    /**
     * <p>
     * Details of the returned event subscriptions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSubscriptions(java.util.Collection)} or
     * {@link #withSubscriptions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param subscriptions
     *        Details of the returned event subscriptions.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListEventSubscriptionsResult withSubscriptions(
            Subscription... subscriptions) {
        if (this.subscriptions == null) {
            setSubscriptions(new java.util.ArrayList<Subscription>(
                    subscriptions.length));
        }
        for (Subscription ele : subscriptions) {
            this.subscriptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details of the returned event subscriptions.
     * </p>
     * 
     * @param subscriptions
     *        Details of the returned event subscriptions.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListEventSubscriptionsResult withSubscriptions(
            java.util.Collection<Subscription> subscriptions) {
        setSubscriptions(subscriptions);
        return this;
    }

    /**
     * <p>
     * When a response is generated, if there is more data to be listed, this
     * parameter is present in the response and contains the value to use for
     * the <b>nextToken</b> parameter in a subsequent pagination request. If
     * there is no more data to be listed, this parameter is set to null.
     * </p>
     * 
     * @param nextToken
     *        When a response is generated, if there is more data to be listed,
     *        this parameter is present in the response and contains the value
     *        to use for the <b>nextToken</b> parameter in a subsequent
     *        pagination request. If there is no more data to be listed, this
     *        parameter is set to null.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When a response is generated, if there is more data to be listed, this
     * parameter is present in the response and contains the value to use for
     * the <b>nextToken</b> parameter in a subsequent pagination request. If
     * there is no more data to be listed, this parameter is set to null.
     * </p>
     * 
     * @return When a response is generated, if there is more data to be listed,
     *         this parameter is present in the response and contains the value
     *         to use for the <b>nextToken</b> parameter in a subsequent
     *         pagination request. If there is no more data to be listed, this
     *         parameter is set to null.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When a response is generated, if there is more data to be listed, this
     * parameter is present in the response and contains the value to use for
     * the <b>nextToken</b> parameter in a subsequent pagination request. If
     * there is no more data to be listed, this parameter is set to null.
     * </p>
     * 
     * @param nextToken
     *        When a response is generated, if there is more data to be listed,
     *        this parameter is present in the response and contains the value
     *        to use for the <b>nextToken</b> parameter in a subsequent
     *        pagination request. If there is no more data to be listed, this
     *        parameter is set to null.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListEventSubscriptionsResult withNextToken(String nextToken) {
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
        if (getSubscriptions() != null)
            sb.append("Subscriptions: " + getSubscriptions() + ",");
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

        if (obj instanceof ListEventSubscriptionsResult == false)
            return false;
        ListEventSubscriptionsResult other = (ListEventSubscriptionsResult) obj;
        if (other.getSubscriptions() == null ^ this.getSubscriptions() == null)
            return false;
        if (other.getSubscriptions() != null
                && other.getSubscriptions().equals(this.getSubscriptions()) == false)
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

        hashCode = prime
                * hashCode
                + ((getSubscriptions() == null) ? 0 : getSubscriptions()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListEventSubscriptionsResult clone() {
        try {
            return (ListEventSubscriptionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

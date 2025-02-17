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
package com.amazonaws.services.applicationautoscaling.model;

import java.io.Serializable;

/**
 * 
 */
public class DescribeScalableTargetsResult extends
        com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata>
        implements Serializable, Cloneable {

    /**
     * <p>
     * The list of scalable targets that matches the request parameters.
     * </p>
     */
    private java.util.List<ScalableTarget> scalableTargets;
    /**
     * <p>
     * The <code>NextToken</code> value to include in a future
     * <code>DescribeScalableTargets</code> request. When the results of a
     * <code>DescribeScalableTargets</code> request exceed
     * <code>MaxResults</code>, this value can be used to retrieve the next page
     * of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of scalable targets that matches the request parameters.
     * </p>
     * 
     * @return The list of scalable targets that matches the request parameters.
     */

    public java.util.List<ScalableTarget> getScalableTargets() {
        return scalableTargets;
    }

    /**
     * <p>
     * The list of scalable targets that matches the request parameters.
     * </p>
     * 
     * @param scalableTargets
     *        The list of scalable targets that matches the request parameters.
     */

    public void setScalableTargets(
            java.util.Collection<ScalableTarget> scalableTargets) {
        if (scalableTargets == null) {
            this.scalableTargets = null;
            return;
        }

        this.scalableTargets = new java.util.ArrayList<ScalableTarget>(
                scalableTargets);
    }

    /**
     * <p>
     * The list of scalable targets that matches the request parameters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setScalableTargets(java.util.Collection)} or
     * {@link #withScalableTargets(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param scalableTargets
     *        The list of scalable targets that matches the request parameters.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeScalableTargetsResult withScalableTargets(
            ScalableTarget... scalableTargets) {
        if (this.scalableTargets == null) {
            setScalableTargets(new java.util.ArrayList<ScalableTarget>(
                    scalableTargets.length));
        }
        for (ScalableTarget ele : scalableTargets) {
            this.scalableTargets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of scalable targets that matches the request parameters.
     * </p>
     * 
     * @param scalableTargets
     *        The list of scalable targets that matches the request parameters.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeScalableTargetsResult withScalableTargets(
            java.util.Collection<ScalableTarget> scalableTargets) {
        setScalableTargets(scalableTargets);
        return this;
    }

    /**
     * <p>
     * The <code>NextToken</code> value to include in a future
     * <code>DescribeScalableTargets</code> request. When the results of a
     * <code>DescribeScalableTargets</code> request exceed
     * <code>MaxResults</code>, this value can be used to retrieve the next page
     * of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>NextToken</code> value to include in a future
     *        <code>DescribeScalableTargets</code> request. When the results of
     *        a <code>DescribeScalableTargets</code> request exceed
     *        <code>MaxResults</code>, this value can be used to retrieve the
     *        next page of results. This value is <code>null</code> when there
     *        are no more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>NextToken</code> value to include in a future
     * <code>DescribeScalableTargets</code> request. When the results of a
     * <code>DescribeScalableTargets</code> request exceed
     * <code>MaxResults</code>, this value can be used to retrieve the next page
     * of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @return The <code>NextToken</code> value to include in a future
     *         <code>DescribeScalableTargets</code> request. When the results of
     *         a <code>DescribeScalableTargets</code> request exceed
     *         <code>MaxResults</code>, this value can be used to retrieve the
     *         next page of results. This value is <code>null</code> when there
     *         are no more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>NextToken</code> value to include in a future
     * <code>DescribeScalableTargets</code> request. When the results of a
     * <code>DescribeScalableTargets</code> request exceed
     * <code>MaxResults</code>, this value can be used to retrieve the next page
     * of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>NextToken</code> value to include in a future
     *        <code>DescribeScalableTargets</code> request. When the results of
     *        a <code>DescribeScalableTargets</code> request exceed
     *        <code>MaxResults</code>, this value can be used to retrieve the
     *        next page of results. This value is <code>null</code> when there
     *        are no more results to return.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeScalableTargetsResult withNextToken(String nextToken) {
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
        if (getScalableTargets() != null)
            sb.append("ScalableTargets: " + getScalableTargets() + ",");
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

        if (obj instanceof DescribeScalableTargetsResult == false)
            return false;
        DescribeScalableTargetsResult other = (DescribeScalableTargetsResult) obj;
        if (other.getScalableTargets() == null
                ^ this.getScalableTargets() == null)
            return false;
        if (other.getScalableTargets() != null
                && other.getScalableTargets().equals(this.getScalableTargets()) == false)
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
                + ((getScalableTargets() == null) ? 0 : getScalableTargets()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeScalableTargetsResult clone() {
        try {
            return (DescribeScalableTargetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the result of a list jobs request.
 * </p>
 */
public class ListJobsResult extends
        com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata>
        implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the jobs.
     * </p>
     */
    private java.util.List<Job> jobs;
    /**
     * <p>
     * If the number of items that are returned is significantly large, this is
     * an identifier that is also returned, which can be used in a subsequent
     * call to this operation to return the next set of items in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the jobs.
     * </p>
     * 
     * @return Information about the jobs.
     */

    public java.util.List<Job> getJobs() {
        return jobs;
    }

    /**
     * <p>
     * Information about the jobs.
     * </p>
     * 
     * @param jobs
     *        Information about the jobs.
     */

    public void setJobs(java.util.Collection<Job> jobs) {
        if (jobs == null) {
            this.jobs = null;
            return;
        }

        this.jobs = new java.util.ArrayList<Job>(jobs);
    }

    /**
     * <p>
     * Information about the jobs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setJobs(java.util.Collection)} or
     * {@link #withJobs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param jobs
     *        Information about the jobs.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListJobsResult withJobs(Job... jobs) {
        if (this.jobs == null) {
            setJobs(new java.util.ArrayList<Job>(jobs.length));
        }
        for (Job ele : jobs) {
            this.jobs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the jobs.
     * </p>
     * 
     * @param jobs
     *        Information about the jobs.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListJobsResult withJobs(java.util.Collection<Job> jobs) {
        setJobs(jobs);
        return this;
    }

    /**
     * <p>
     * If the number of items that are returned is significantly large, this is
     * an identifier that is also returned, which can be used in a subsequent
     * call to this operation to return the next set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        If the number of items that are returned is significantly large,
     *        this is an identifier that is also returned, which can be used in
     *        a subsequent call to this operation to return the next set of
     *        items in the list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the number of items that are returned is significantly large, this is
     * an identifier that is also returned, which can be used in a subsequent
     * call to this operation to return the next set of items in the list.
     * </p>
     * 
     * @return If the number of items that are returned is significantly large,
     *         this is an identifier that is also returned, which can be used in
     *         a subsequent call to this operation to return the next set of
     *         items in the list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the number of items that are returned is significantly large, this is
     * an identifier that is also returned, which can be used in a subsequent
     * call to this operation to return the next set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        If the number of items that are returned is significantly large,
     *        this is an identifier that is also returned, which can be used in
     *        a subsequent call to this operation to return the next set of
     *        items in the list.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListJobsResult withNextToken(String nextToken) {
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
        if (getJobs() != null)
            sb.append("Jobs: " + getJobs() + ",");
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

        if (obj instanceof ListJobsResult == false)
            return false;
        ListJobsResult other = (ListJobsResult) obj;
        if (other.getJobs() == null ^ this.getJobs() == null)
            return false;
        if (other.getJobs() != null
                && other.getJobs().equals(this.getJobs()) == false)
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
                + ((getJobs() == null) ? 0 : getJobs().hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListJobsResult clone() {
        try {
            return (ListJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

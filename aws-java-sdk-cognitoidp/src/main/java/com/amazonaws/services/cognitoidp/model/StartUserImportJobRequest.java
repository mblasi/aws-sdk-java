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
 * Represents the request to start the user import job.
 * </p>
 */
public class StartUserImportJobRequest extends
        com.amazonaws.AmazonWebServiceRequest implements Serializable,
        Cloneable {

    /**
     * <p>
     * The user pool ID for the user pool that the users are being imported
     * into.
     * </p>
     */
    private String userPoolId;
    /**
     * <p>
     * The job ID for the user import job.
     * </p>
     */
    private String jobId;

    /**
     * <p>
     * The user pool ID for the user pool that the users are being imported
     * into.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID for the user pool that the users are being
     *        imported into.
     */

    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool that the users are being imported
     * into.
     * </p>
     * 
     * @return The user pool ID for the user pool that the users are being
     *         imported into.
     */

    public String getUserPoolId() {
        return this.userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool that the users are being imported
     * into.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID for the user pool that the users are being
     *        imported into.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public StartUserImportJobRequest withUserPoolId(String userPoolId) {
        setUserPoolId(userPoolId);
        return this;
    }

    /**
     * <p>
     * The job ID for the user import job.
     * </p>
     * 
     * @param jobId
     *        The job ID for the user import job.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The job ID for the user import job.
     * </p>
     * 
     * @return The job ID for the user import job.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The job ID for the user import job.
     * </p>
     * 
     * @param jobId
     *        The job ID for the user import job.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public StartUserImportJobRequest withJobId(String jobId) {
        setJobId(jobId);
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
        if (getJobId() != null)
            sb.append("JobId: " + getJobId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartUserImportJobRequest == false)
            return false;
        StartUserImportJobRequest other = (StartUserImportJobRequest) obj;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null
                && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null
                && other.getJobId().equals(this.getJobId()) == false)
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
                + ((getJobId() == null) ? 0 : getJobId().hashCode());
        return hashCode;
    }

    @Override
    public StartUserImportJobRequest clone() {
        return (StartUserImportJobRequest) super.clone();
    }
}

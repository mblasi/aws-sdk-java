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
package com.amazonaws.services.sns.model;

import java.io.Serializable;

/**
 * <p>
 * Response for ListPlatformApplications action.
 * </p>
 */
public class ListPlatformApplicationsResult extends
        com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata>
        implements Serializable, Cloneable {

    /**
     * <p>
     * Platform applications returned when calling ListPlatformApplications
     * action.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PlatformApplication> platformApplications;
    /**
     * <p>
     * NextToken string is returned when calling ListPlatformApplications action
     * if additional records are available after the first page results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Platform applications returned when calling ListPlatformApplications
     * action.
     * </p>
     * 
     * @return Platform applications returned when calling
     *         ListPlatformApplications action.
     */

    public java.util.List<PlatformApplication> getPlatformApplications() {
        if (platformApplications == null) {
            platformApplications = new com.amazonaws.internal.SdkInternalList<PlatformApplication>();
        }
        return platformApplications;
    }

    /**
     * <p>
     * Platform applications returned when calling ListPlatformApplications
     * action.
     * </p>
     * 
     * @param platformApplications
     *        Platform applications returned when calling
     *        ListPlatformApplications action.
     */

    public void setPlatformApplications(
            java.util.Collection<PlatformApplication> platformApplications) {
        if (platformApplications == null) {
            this.platformApplications = null;
            return;
        }

        this.platformApplications = new com.amazonaws.internal.SdkInternalList<PlatformApplication>(
                platformApplications);
    }

    /**
     * <p>
     * Platform applications returned when calling ListPlatformApplications
     * action.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setPlatformApplications(java.util.Collection)} or
     * {@link #withPlatformApplications(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param platformApplications
     *        Platform applications returned when calling
     *        ListPlatformApplications action.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListPlatformApplicationsResult withPlatformApplications(
            PlatformApplication... platformApplications) {
        if (this.platformApplications == null) {
            setPlatformApplications(new com.amazonaws.internal.SdkInternalList<PlatformApplication>(
                    platformApplications.length));
        }
        for (PlatformApplication ele : platformApplications) {
            this.platformApplications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Platform applications returned when calling ListPlatformApplications
     * action.
     * </p>
     * 
     * @param platformApplications
     *        Platform applications returned when calling
     *        ListPlatformApplications action.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListPlatformApplicationsResult withPlatformApplications(
            java.util.Collection<PlatformApplication> platformApplications) {
        setPlatformApplications(platformApplications);
        return this;
    }

    /**
     * <p>
     * NextToken string is returned when calling ListPlatformApplications action
     * if additional records are available after the first page results.
     * </p>
     * 
     * @param nextToken
     *        NextToken string is returned when calling ListPlatformApplications
     *        action if additional records are available after the first page
     *        results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * NextToken string is returned when calling ListPlatformApplications action
     * if additional records are available after the first page results.
     * </p>
     * 
     * @return NextToken string is returned when calling
     *         ListPlatformApplications action if additional records are
     *         available after the first page results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * NextToken string is returned when calling ListPlatformApplications action
     * if additional records are available after the first page results.
     * </p>
     * 
     * @param nextToken
     *        NextToken string is returned when calling ListPlatformApplications
     *        action if additional records are available after the first page
     *        results.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListPlatformApplicationsResult withNextToken(String nextToken) {
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
        if (getPlatformApplications() != null)
            sb.append("PlatformApplications: " + getPlatformApplications()
                    + ",");
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

        if (obj instanceof ListPlatformApplicationsResult == false)
            return false;
        ListPlatformApplicationsResult other = (ListPlatformApplicationsResult) obj;
        if (other.getPlatformApplications() == null
                ^ this.getPlatformApplications() == null)
            return false;
        if (other.getPlatformApplications() != null
                && other.getPlatformApplications().equals(
                        this.getPlatformApplications()) == false)
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
                + ((getPlatformApplications() == null) ? 0
                        : getPlatformApplications().hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPlatformApplicationsResult clone() {
        try {
            return (ListPlatformApplicationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

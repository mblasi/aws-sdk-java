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
package com.amazonaws.services.applicationdiscovery.model;

import java.io.Serializable;

/**
 * 
 */
public class DescribeExportConfigurationsResult extends
        com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata>
        implements Serializable, Cloneable {

    /**
     * <p>
     * Returns export details. When the status is complete, the response
     * includes a URL for an Amazon S3 bucket where you can view the data in a
     * CSV file.
     * </p>
     */
    private java.util.List<ExportInfo> exportsInfo;
    /**
     * <p>
     * A token to get the next set of results. For example, if you specified 100
     * IDs for <code>DescribeConfigurationsRequest$configurationIds</code> but
     * set <code>DescribeExportConfigurationsRequest$maxResults</code> to 10,
     * you will get results in a set of 10. Use the token in the query to get
     * the next set of 10.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Returns export details. When the status is complete, the response
     * includes a URL for an Amazon S3 bucket where you can view the data in a
     * CSV file.
     * </p>
     * 
     * @return Returns export details. When the status is complete, the response
     *         includes a URL for an Amazon S3 bucket where you can view the
     *         data in a CSV file.
     */

    public java.util.List<ExportInfo> getExportsInfo() {
        return exportsInfo;
    }

    /**
     * <p>
     * Returns export details. When the status is complete, the response
     * includes a URL for an Amazon S3 bucket where you can view the data in a
     * CSV file.
     * </p>
     * 
     * @param exportsInfo
     *        Returns export details. When the status is complete, the response
     *        includes a URL for an Amazon S3 bucket where you can view the data
     *        in a CSV file.
     */

    public void setExportsInfo(java.util.Collection<ExportInfo> exportsInfo) {
        if (exportsInfo == null) {
            this.exportsInfo = null;
            return;
        }

        this.exportsInfo = new java.util.ArrayList<ExportInfo>(exportsInfo);
    }

    /**
     * <p>
     * Returns export details. When the status is complete, the response
     * includes a URL for an Amazon S3 bucket where you can view the data in a
     * CSV file.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setExportsInfo(java.util.Collection)} or
     * {@link #withExportsInfo(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param exportsInfo
     *        Returns export details. When the status is complete, the response
     *        includes a URL for an Amazon S3 bucket where you can view the data
     *        in a CSV file.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeExportConfigurationsResult withExportsInfo(
            ExportInfo... exportsInfo) {
        if (this.exportsInfo == null) {
            setExportsInfo(new java.util.ArrayList<ExportInfo>(
                    exportsInfo.length));
        }
        for (ExportInfo ele : exportsInfo) {
            this.exportsInfo.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns export details. When the status is complete, the response
     * includes a URL for an Amazon S3 bucket where you can view the data in a
     * CSV file.
     * </p>
     * 
     * @param exportsInfo
     *        Returns export details. When the status is complete, the response
     *        includes a URL for an Amazon S3 bucket where you can view the data
     *        in a CSV file.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeExportConfigurationsResult withExportsInfo(
            java.util.Collection<ExportInfo> exportsInfo) {
        setExportsInfo(exportsInfo);
        return this;
    }

    /**
     * <p>
     * A token to get the next set of results. For example, if you specified 100
     * IDs for <code>DescribeConfigurationsRequest$configurationIds</code> but
     * set <code>DescribeExportConfigurationsRequest$maxResults</code> to 10,
     * you will get results in a set of 10. Use the token in the query to get
     * the next set of 10.
     * </p>
     * 
     * @param nextToken
     *        A token to get the next set of results. For example, if you
     *        specified 100 IDs for
     *        <code>DescribeConfigurationsRequest$configurationIds</code> but
     *        set <code>DescribeExportConfigurationsRequest$maxResults</code> to
     *        10, you will get results in a set of 10. Use the token in the
     *        query to get the next set of 10.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to get the next set of results. For example, if you specified 100
     * IDs for <code>DescribeConfigurationsRequest$configurationIds</code> but
     * set <code>DescribeExportConfigurationsRequest$maxResults</code> to 10,
     * you will get results in a set of 10. Use the token in the query to get
     * the next set of 10.
     * </p>
     * 
     * @return A token to get the next set of results. For example, if you
     *         specified 100 IDs for
     *         <code>DescribeConfigurationsRequest$configurationIds</code> but
     *         set <code>DescribeExportConfigurationsRequest$maxResults</code>
     *         to 10, you will get results in a set of 10. Use the token in the
     *         query to get the next set of 10.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to get the next set of results. For example, if you specified 100
     * IDs for <code>DescribeConfigurationsRequest$configurationIds</code> but
     * set <code>DescribeExportConfigurationsRequest$maxResults</code> to 10,
     * you will get results in a set of 10. Use the token in the query to get
     * the next set of 10.
     * </p>
     * 
     * @param nextToken
     *        A token to get the next set of results. For example, if you
     *        specified 100 IDs for
     *        <code>DescribeConfigurationsRequest$configurationIds</code> but
     *        set <code>DescribeExportConfigurationsRequest$maxResults</code> to
     *        10, you will get results in a set of 10. Use the token in the
     *        query to get the next set of 10.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeExportConfigurationsResult withNextToken(String nextToken) {
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
        if (getExportsInfo() != null)
            sb.append("ExportsInfo: " + getExportsInfo() + ",");
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

        if (obj instanceof DescribeExportConfigurationsResult == false)
            return false;
        DescribeExportConfigurationsResult other = (DescribeExportConfigurationsResult) obj;
        if (other.getExportsInfo() == null ^ this.getExportsInfo() == null)
            return false;
        if (other.getExportsInfo() != null
                && other.getExportsInfo().equals(this.getExportsInfo()) == false)
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
                + ((getExportsInfo() == null) ? 0 : getExportsInfo().hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeExportConfigurationsResult clone() {
        try {
            return (DescribeExportConfigurationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class ListTaskDefinitionFamiliesRequest extends
        com.amazonaws.AmazonWebServiceRequest implements Serializable,
        Cloneable {

    /**
     * <p>
     * The <code>familyPrefix</code> is a string that is used to filter the
     * results of <code>ListTaskDefinitionFamilies</code>. If you specify a
     * <code>familyPrefix</code>, only task definition family names that begin
     * with the <code>familyPrefix</code> string are returned.
     * </p>
     */
    private String familyPrefix;
    /**
     * <p>
     * The task definition family status with which to filter the
     * <code>ListTaskDefinitionFamilies</code> results. By default, both
     * <code>ACTIVE</code> and <code>INACTIVE</code> task definition families
     * are listed. If this parameter is set to <code>ACTIVE</code>, only task
     * definition families that have an <code>ACTIVE</code> task definition
     * revision are returned. If this parameter is set to <code>INACTIVE</code>,
     * only task definition families that do not have any <code>ACTIVE</code>
     * task definition revisions are returned. If you paginate the resulting
     * output, be sure to keep the <code>status</code> value constant in each
     * subsequent request.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated
     * <code>ListTaskDefinitionFamilies</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of
     * that parameter. Pagination continues from the end of the previous results
     * that returned the <code>nextToken</code> value. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to
     * retrieve the next items in a list and not for other programmatic
     * purposes.
     * </p>
     * </note>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of task definition family results returned by
     * <code>ListTaskDefinitionFamilies</code> in paginated output. When this
     * parameter is used, <code>ListTaskDefinitions</code> only returns
     * <code>maxResults</code> results in a single page along with a
     * <code>nextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another
     * <code>ListTaskDefinitionFamilies</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If
     * this parameter is not used, then <code>ListTaskDefinitionFamilies</code>
     * returns up to 100 results and a <code>nextToken</code> value if
     * applicable.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The <code>familyPrefix</code> is a string that is used to filter the
     * results of <code>ListTaskDefinitionFamilies</code>. If you specify a
     * <code>familyPrefix</code>, only task definition family names that begin
     * with the <code>familyPrefix</code> string are returned.
     * </p>
     * 
     * @param familyPrefix
     *        The <code>familyPrefix</code> is a string that is used to filter
     *        the results of <code>ListTaskDefinitionFamilies</code>. If you
     *        specify a <code>familyPrefix</code>, only task definition family
     *        names that begin with the <code>familyPrefix</code> string are
     *        returned.
     */

    public void setFamilyPrefix(String familyPrefix) {
        this.familyPrefix = familyPrefix;
    }

    /**
     * <p>
     * The <code>familyPrefix</code> is a string that is used to filter the
     * results of <code>ListTaskDefinitionFamilies</code>. If you specify a
     * <code>familyPrefix</code>, only task definition family names that begin
     * with the <code>familyPrefix</code> string are returned.
     * </p>
     * 
     * @return The <code>familyPrefix</code> is a string that is used to filter
     *         the results of <code>ListTaskDefinitionFamilies</code>. If you
     *         specify a <code>familyPrefix</code>, only task definition family
     *         names that begin with the <code>familyPrefix</code> string are
     *         returned.
     */

    public String getFamilyPrefix() {
        return this.familyPrefix;
    }

    /**
     * <p>
     * The <code>familyPrefix</code> is a string that is used to filter the
     * results of <code>ListTaskDefinitionFamilies</code>. If you specify a
     * <code>familyPrefix</code>, only task definition family names that begin
     * with the <code>familyPrefix</code> string are returned.
     * </p>
     * 
     * @param familyPrefix
     *        The <code>familyPrefix</code> is a string that is used to filter
     *        the results of <code>ListTaskDefinitionFamilies</code>. If you
     *        specify a <code>familyPrefix</code>, only task definition family
     *        names that begin with the <code>familyPrefix</code> string are
     *        returned.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListTaskDefinitionFamiliesRequest withFamilyPrefix(
            String familyPrefix) {
        setFamilyPrefix(familyPrefix);
        return this;
    }

    /**
     * <p>
     * The task definition family status with which to filter the
     * <code>ListTaskDefinitionFamilies</code> results. By default, both
     * <code>ACTIVE</code> and <code>INACTIVE</code> task definition families
     * are listed. If this parameter is set to <code>ACTIVE</code>, only task
     * definition families that have an <code>ACTIVE</code> task definition
     * revision are returned. If this parameter is set to <code>INACTIVE</code>,
     * only task definition families that do not have any <code>ACTIVE</code>
     * task definition revisions are returned. If you paginate the resulting
     * output, be sure to keep the <code>status</code> value constant in each
     * subsequent request.
     * </p>
     * 
     * @param status
     *        The task definition family status with which to filter the
     *        <code>ListTaskDefinitionFamilies</code> results. By default, both
     *        <code>ACTIVE</code> and <code>INACTIVE</code> task definition
     *        families are listed. If this parameter is set to
     *        <code>ACTIVE</code>, only task definition families that have an
     *        <code>ACTIVE</code> task definition revision are returned. If this
     *        parameter is set to <code>INACTIVE</code>, only task definition
     *        families that do not have any <code>ACTIVE</code> task definition
     *        revisions are returned. If you paginate the resulting output, be
     *        sure to keep the <code>status</code> value constant in each
     *        subsequent request.
     * @see TaskDefinitionFamilyStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The task definition family status with which to filter the
     * <code>ListTaskDefinitionFamilies</code> results. By default, both
     * <code>ACTIVE</code> and <code>INACTIVE</code> task definition families
     * are listed. If this parameter is set to <code>ACTIVE</code>, only task
     * definition families that have an <code>ACTIVE</code> task definition
     * revision are returned. If this parameter is set to <code>INACTIVE</code>,
     * only task definition families that do not have any <code>ACTIVE</code>
     * task definition revisions are returned. If you paginate the resulting
     * output, be sure to keep the <code>status</code> value constant in each
     * subsequent request.
     * </p>
     * 
     * @return The task definition family status with which to filter the
     *         <code>ListTaskDefinitionFamilies</code> results. By default, both
     *         <code>ACTIVE</code> and <code>INACTIVE</code> task definition
     *         families are listed. If this parameter is set to
     *         <code>ACTIVE</code>, only task definition families that have an
     *         <code>ACTIVE</code> task definition revision are returned. If
     *         this parameter is set to <code>INACTIVE</code>, only task
     *         definition families that do not have any <code>ACTIVE</code> task
     *         definition revisions are returned. If you paginate the resulting
     *         output, be sure to keep the <code>status</code> value constant in
     *         each subsequent request.
     * @see TaskDefinitionFamilyStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The task definition family status with which to filter the
     * <code>ListTaskDefinitionFamilies</code> results. By default, both
     * <code>ACTIVE</code> and <code>INACTIVE</code> task definition families
     * are listed. If this parameter is set to <code>ACTIVE</code>, only task
     * definition families that have an <code>ACTIVE</code> task definition
     * revision are returned. If this parameter is set to <code>INACTIVE</code>,
     * only task definition families that do not have any <code>ACTIVE</code>
     * task definition revisions are returned. If you paginate the resulting
     * output, be sure to keep the <code>status</code> value constant in each
     * subsequent request.
     * </p>
     * 
     * @param status
     *        The task definition family status with which to filter the
     *        <code>ListTaskDefinitionFamilies</code> results. By default, both
     *        <code>ACTIVE</code> and <code>INACTIVE</code> task definition
     *        families are listed. If this parameter is set to
     *        <code>ACTIVE</code>, only task definition families that have an
     *        <code>ACTIVE</code> task definition revision are returned. If this
     *        parameter is set to <code>INACTIVE</code>, only task definition
     *        families that do not have any <code>ACTIVE</code> task definition
     *        revisions are returned. If you paginate the resulting output, be
     *        sure to keep the <code>status</code> value constant in each
     *        subsequent request.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see TaskDefinitionFamilyStatus
     */

    public ListTaskDefinitionFamiliesRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The task definition family status with which to filter the
     * <code>ListTaskDefinitionFamilies</code> results. By default, both
     * <code>ACTIVE</code> and <code>INACTIVE</code> task definition families
     * are listed. If this parameter is set to <code>ACTIVE</code>, only task
     * definition families that have an <code>ACTIVE</code> task definition
     * revision are returned. If this parameter is set to <code>INACTIVE</code>,
     * only task definition families that do not have any <code>ACTIVE</code>
     * task definition revisions are returned. If you paginate the resulting
     * output, be sure to keep the <code>status</code> value constant in each
     * subsequent request.
     * </p>
     * 
     * @param status
     *        The task definition family status with which to filter the
     *        <code>ListTaskDefinitionFamilies</code> results. By default, both
     *        <code>ACTIVE</code> and <code>INACTIVE</code> task definition
     *        families are listed. If this parameter is set to
     *        <code>ACTIVE</code>, only task definition families that have an
     *        <code>ACTIVE</code> task definition revision are returned. If this
     *        parameter is set to <code>INACTIVE</code>, only task definition
     *        families that do not have any <code>ACTIVE</code> task definition
     *        revisions are returned. If you paginate the resulting output, be
     *        sure to keep the <code>status</code> value constant in each
     *        subsequent request.
     * @see TaskDefinitionFamilyStatus
     */

    public void setStatus(TaskDefinitionFamilyStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The task definition family status with which to filter the
     * <code>ListTaskDefinitionFamilies</code> results. By default, both
     * <code>ACTIVE</code> and <code>INACTIVE</code> task definition families
     * are listed. If this parameter is set to <code>ACTIVE</code>, only task
     * definition families that have an <code>ACTIVE</code> task definition
     * revision are returned. If this parameter is set to <code>INACTIVE</code>,
     * only task definition families that do not have any <code>ACTIVE</code>
     * task definition revisions are returned. If you paginate the resulting
     * output, be sure to keep the <code>status</code> value constant in each
     * subsequent request.
     * </p>
     * 
     * @param status
     *        The task definition family status with which to filter the
     *        <code>ListTaskDefinitionFamilies</code> results. By default, both
     *        <code>ACTIVE</code> and <code>INACTIVE</code> task definition
     *        families are listed. If this parameter is set to
     *        <code>ACTIVE</code>, only task definition families that have an
     *        <code>ACTIVE</code> task definition revision are returned. If this
     *        parameter is set to <code>INACTIVE</code>, only task definition
     *        families that do not have any <code>ACTIVE</code> task definition
     *        revisions are returned. If you paginate the resulting output, be
     *        sure to keep the <code>status</code> value constant in each
     *        subsequent request.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see TaskDefinitionFamilyStatus
     */

    public ListTaskDefinitionFamiliesRequest withStatus(
            TaskDefinitionFamilyStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated
     * <code>ListTaskDefinitionFamilies</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of
     * that parameter. Pagination continues from the end of the previous results
     * that returned the <code>nextToken</code> value. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to
     * retrieve the next items in a list and not for other programmatic
     * purposes.
     * </p>
     * </note>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous
     *        paginated <code>ListTaskDefinitionFamilies</code> request where
     *        <code>maxResults</code> was used and the results exceeded the
     *        value of that parameter. Pagination continues from the end of the
     *        previous results that returned the <code>nextToken</code> value.
     *        This value is <code>null</code> when there are no more results to
     *        return.</p> <note>
     *        <p>
     *        This token should be treated as an opaque identifier that is only
     *        used to retrieve the next items in a list and not for other
     *        programmatic purposes.
     *        </p>
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated
     * <code>ListTaskDefinitionFamilies</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of
     * that parameter. Pagination continues from the end of the previous results
     * that returned the <code>nextToken</code> value. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to
     * retrieve the next items in a list and not for other programmatic
     * purposes.
     * </p>
     * </note>
     * 
     * @return The <code>nextToken</code> value returned from a previous
     *         paginated <code>ListTaskDefinitionFamilies</code> request where
     *         <code>maxResults</code> was used and the results exceeded the
     *         value of that parameter. Pagination continues from the end of the
     *         previous results that returned the <code>nextToken</code> value.
     *         This value is <code>null</code> when there are no more results to
     *         return.</p> <note>
     *         <p>
     *         This token should be treated as an opaque identifier that is only
     *         used to retrieve the next items in a list and not for other
     *         programmatic purposes.
     *         </p>
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated
     * <code>ListTaskDefinitionFamilies</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of
     * that parameter. Pagination continues from the end of the previous results
     * that returned the <code>nextToken</code> value. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to
     * retrieve the next items in a list and not for other programmatic
     * purposes.
     * </p>
     * </note>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous
     *        paginated <code>ListTaskDefinitionFamilies</code> request where
     *        <code>maxResults</code> was used and the results exceeded the
     *        value of that parameter. Pagination continues from the end of the
     *        previous results that returned the <code>nextToken</code> value.
     *        This value is <code>null</code> when there are no more results to
     *        return.</p> <note>
     *        <p>
     *        This token should be treated as an opaque identifier that is only
     *        used to retrieve the next items in a list and not for other
     *        programmatic purposes.
     *        </p>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListTaskDefinitionFamiliesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of task definition family results returned by
     * <code>ListTaskDefinitionFamilies</code> in paginated output. When this
     * parameter is used, <code>ListTaskDefinitions</code> only returns
     * <code>maxResults</code> results in a single page along with a
     * <code>nextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another
     * <code>ListTaskDefinitionFamilies</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If
     * this parameter is not used, then <code>ListTaskDefinitionFamilies</code>
     * returns up to 100 results and a <code>nextToken</code> value if
     * applicable.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of task definition family results returned by
     *        <code>ListTaskDefinitionFamilies</code> in paginated output. When
     *        this parameter is used, <code>ListTaskDefinitions</code> only
     *        returns <code>maxResults</code> results in a single page along
     *        with a <code>nextToken</code> response element. The remaining
     *        results of the initial request can be seen by sending another
     *        <code>ListTaskDefinitionFamilies</code> request with the returned
     *        <code>nextToken</code> value. This value can be between 1 and 100.
     *        If this parameter is not used, then
     *        <code>ListTaskDefinitionFamilies</code> returns up to 100 results
     *        and a <code>nextToken</code> value if applicable.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of task definition family results returned by
     * <code>ListTaskDefinitionFamilies</code> in paginated output. When this
     * parameter is used, <code>ListTaskDefinitions</code> only returns
     * <code>maxResults</code> results in a single page along with a
     * <code>nextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another
     * <code>ListTaskDefinitionFamilies</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If
     * this parameter is not used, then <code>ListTaskDefinitionFamilies</code>
     * returns up to 100 results and a <code>nextToken</code> value if
     * applicable.
     * </p>
     * 
     * @return The maximum number of task definition family results returned by
     *         <code>ListTaskDefinitionFamilies</code> in paginated output. When
     *         this parameter is used, <code>ListTaskDefinitions</code> only
     *         returns <code>maxResults</code> results in a single page along
     *         with a <code>nextToken</code> response element. The remaining
     *         results of the initial request can be seen by sending another
     *         <code>ListTaskDefinitionFamilies</code> request with the returned
     *         <code>nextToken</code> value. This value can be between 1 and
     *         100. If this parameter is not used, then
     *         <code>ListTaskDefinitionFamilies</code> returns up to 100 results
     *         and a <code>nextToken</code> value if applicable.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of task definition family results returned by
     * <code>ListTaskDefinitionFamilies</code> in paginated output. When this
     * parameter is used, <code>ListTaskDefinitions</code> only returns
     * <code>maxResults</code> results in a single page along with a
     * <code>nextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another
     * <code>ListTaskDefinitionFamilies</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If
     * this parameter is not used, then <code>ListTaskDefinitionFamilies</code>
     * returns up to 100 results and a <code>nextToken</code> value if
     * applicable.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of task definition family results returned by
     *        <code>ListTaskDefinitionFamilies</code> in paginated output. When
     *        this parameter is used, <code>ListTaskDefinitions</code> only
     *        returns <code>maxResults</code> results in a single page along
     *        with a <code>nextToken</code> response element. The remaining
     *        results of the initial request can be seen by sending another
     *        <code>ListTaskDefinitionFamilies</code> request with the returned
     *        <code>nextToken</code> value. This value can be between 1 and 100.
     *        If this parameter is not used, then
     *        <code>ListTaskDefinitionFamilies</code> returns up to 100 results
     *        and a <code>nextToken</code> value if applicable.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListTaskDefinitionFamiliesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getFamilyPrefix() != null)
            sb.append("FamilyPrefix: " + getFamilyPrefix() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTaskDefinitionFamiliesRequest == false)
            return false;
        ListTaskDefinitionFamiliesRequest other = (ListTaskDefinitionFamiliesRequest) obj;
        if (other.getFamilyPrefix() == null ^ this.getFamilyPrefix() == null)
            return false;
        if (other.getFamilyPrefix() != null
                && other.getFamilyPrefix().equals(this.getFamilyPrefix()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null
                && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getFamilyPrefix() == null) ? 0 : getFamilyPrefix()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListTaskDefinitionFamiliesRequest clone() {
        return (ListTaskDefinitionFamiliesRequest) super.clone();
    }
}

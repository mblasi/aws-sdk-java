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
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class ListWorkflowTypesRequest extends
        com.amazonaws.AmazonWebServiceRequest implements Serializable,
        Cloneable {

    /**
     * <p>
     * The name of the domain in which the workflow types have been registered.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * If specified, lists the workflow type with this name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Specifies the registration status of the workflow types to list.
     * </p>
     */
    private String registrationStatus;
    /**
     * <p>
     * If a <code>NextPageToken</code> was returned by a previous call, there
     * are more results available. To retrieve the next page of results, make
     * the call again using the returned token in <code>nextPageToken</code>.
     * Keep all other arguments unchanged.
     * </p>
     * <p>
     * The configured <code>maximumPageSize</code> determines how many results
     * can be returned in a single call.
     * </p>
     */
    private String nextPageToken;
    /**
     * <p>
     * The maximum number of results that will be returned per call.
     * <code>nextPageToken</code> can be used to obtain futher pages of results.
     * The default is 1000, which is the maximum allowed page size. You can,
     * however, specify a page size <i>smaller</i> than the maximum.
     * </p>
     * <p>
     * This is an upper limit only; the actual number of results returned per
     * call may be fewer than the specified maximum.
     * </p>
     */
    private Integer maximumPageSize;
    /**
     * <p>
     * When set to <code>true</code>, returns the results in reverse order. By
     * default the results are returned in ascending alphabetical order of the
     * <code>name</code> of the workflow types.
     * </p>
     */
    private Boolean reverseOrder;

    /**
     * <p>
     * The name of the domain in which the workflow types have been registered.
     * </p>
     * 
     * @param domain
     *        The name of the domain in which the workflow types have been
     *        registered.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The name of the domain in which the workflow types have been registered.
     * </p>
     * 
     * @return The name of the domain in which the workflow types have been
     *         registered.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The name of the domain in which the workflow types have been registered.
     * </p>
     * 
     * @param domain
     *        The name of the domain in which the workflow types have been
     *        registered.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListWorkflowTypesRequest withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * If specified, lists the workflow type with this name.
     * </p>
     * 
     * @param name
     *        If specified, lists the workflow type with this name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * If specified, lists the workflow type with this name.
     * </p>
     * 
     * @return If specified, lists the workflow type with this name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * If specified, lists the workflow type with this name.
     * </p>
     * 
     * @param name
     *        If specified, lists the workflow type with this name.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListWorkflowTypesRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies the registration status of the workflow types to list.
     * </p>
     * 
     * @param registrationStatus
     *        Specifies the registration status of the workflow types to list.
     * @see RegistrationStatus
     */

    public void setRegistrationStatus(String registrationStatus) {
        this.registrationStatus = registrationStatus;
    }

    /**
     * <p>
     * Specifies the registration status of the workflow types to list.
     * </p>
     * 
     * @return Specifies the registration status of the workflow types to list.
     * @see RegistrationStatus
     */

    public String getRegistrationStatus() {
        return this.registrationStatus;
    }

    /**
     * <p>
     * Specifies the registration status of the workflow types to list.
     * </p>
     * 
     * @param registrationStatus
     *        Specifies the registration status of the workflow types to list.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see RegistrationStatus
     */

    public ListWorkflowTypesRequest withRegistrationStatus(
            String registrationStatus) {
        setRegistrationStatus(registrationStatus);
        return this;
    }

    /**
     * <p>
     * Specifies the registration status of the workflow types to list.
     * </p>
     * 
     * @param registrationStatus
     *        Specifies the registration status of the workflow types to list.
     * @see RegistrationStatus
     */

    public void setRegistrationStatus(RegistrationStatus registrationStatus) {
        this.registrationStatus = registrationStatus.toString();
    }

    /**
     * <p>
     * Specifies the registration status of the workflow types to list.
     * </p>
     * 
     * @param registrationStatus
     *        Specifies the registration status of the workflow types to list.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see RegistrationStatus
     */

    public ListWorkflowTypesRequest withRegistrationStatus(
            RegistrationStatus registrationStatus) {
        setRegistrationStatus(registrationStatus);
        return this;
    }

    /**
     * <p>
     * If a <code>NextPageToken</code> was returned by a previous call, there
     * are more results available. To retrieve the next page of results, make
     * the call again using the returned token in <code>nextPageToken</code>.
     * Keep all other arguments unchanged.
     * </p>
     * <p>
     * The configured <code>maximumPageSize</code> determines how many results
     * can be returned in a single call.
     * </p>
     * 
     * @param nextPageToken
     *        If a <code>NextPageToken</code> was returned by a previous call,
     *        there are more results available. To retrieve the next page of
     *        results, make the call again using the returned token in
     *        <code>nextPageToken</code>. Keep all other arguments
     *        unchanged.</p>
     *        <p>
     *        The configured <code>maximumPageSize</code> determines how many
     *        results can be returned in a single call.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * If a <code>NextPageToken</code> was returned by a previous call, there
     * are more results available. To retrieve the next page of results, make
     * the call again using the returned token in <code>nextPageToken</code>.
     * Keep all other arguments unchanged.
     * </p>
     * <p>
     * The configured <code>maximumPageSize</code> determines how many results
     * can be returned in a single call.
     * </p>
     * 
     * @return If a <code>NextPageToken</code> was returned by a previous call,
     *         there are more results available. To retrieve the next page of
     *         results, make the call again using the returned token in
     *         <code>nextPageToken</code>. Keep all other arguments
     *         unchanged.</p>
     *         <p>
     *         The configured <code>maximumPageSize</code> determines how many
     *         results can be returned in a single call.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * If a <code>NextPageToken</code> was returned by a previous call, there
     * are more results available. To retrieve the next page of results, make
     * the call again using the returned token in <code>nextPageToken</code>.
     * Keep all other arguments unchanged.
     * </p>
     * <p>
     * The configured <code>maximumPageSize</code> determines how many results
     * can be returned in a single call.
     * </p>
     * 
     * @param nextPageToken
     *        If a <code>NextPageToken</code> was returned by a previous call,
     *        there are more results available. To retrieve the next page of
     *        results, make the call again using the returned token in
     *        <code>nextPageToken</code>. Keep all other arguments
     *        unchanged.</p>
     *        <p>
     *        The configured <code>maximumPageSize</code> determines how many
     *        results can be returned in a single call.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListWorkflowTypesRequest withNextPageToken(String nextPageToken) {
        setNextPageToken(nextPageToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results that will be returned per call.
     * <code>nextPageToken</code> can be used to obtain futher pages of results.
     * The default is 1000, which is the maximum allowed page size. You can,
     * however, specify a page size <i>smaller</i> than the maximum.
     * </p>
     * <p>
     * This is an upper limit only; the actual number of results returned per
     * call may be fewer than the specified maximum.
     * </p>
     * 
     * @param maximumPageSize
     *        The maximum number of results that will be returned per call.
     *        <code>nextPageToken</code> can be used to obtain futher pages of
     *        results. The default is 1000, which is the maximum allowed page
     *        size. You can, however, specify a page size <i>smaller</i> than
     *        the maximum.</p>
     *        <p>
     *        This is an upper limit only; the actual number of results returned
     *        per call may be fewer than the specified maximum.
     */

    public void setMaximumPageSize(Integer maximumPageSize) {
        this.maximumPageSize = maximumPageSize;
    }

    /**
     * <p>
     * The maximum number of results that will be returned per call.
     * <code>nextPageToken</code> can be used to obtain futher pages of results.
     * The default is 1000, which is the maximum allowed page size. You can,
     * however, specify a page size <i>smaller</i> than the maximum.
     * </p>
     * <p>
     * This is an upper limit only; the actual number of results returned per
     * call may be fewer than the specified maximum.
     * </p>
     * 
     * @return The maximum number of results that will be returned per call.
     *         <code>nextPageToken</code> can be used to obtain futher pages of
     *         results. The default is 1000, which is the maximum allowed page
     *         size. You can, however, specify a page size <i>smaller</i> than
     *         the maximum.</p>
     *         <p>
     *         This is an upper limit only; the actual number of results
     *         returned per call may be fewer than the specified maximum.
     */

    public Integer getMaximumPageSize() {
        return this.maximumPageSize;
    }

    /**
     * <p>
     * The maximum number of results that will be returned per call.
     * <code>nextPageToken</code> can be used to obtain futher pages of results.
     * The default is 1000, which is the maximum allowed page size. You can,
     * however, specify a page size <i>smaller</i> than the maximum.
     * </p>
     * <p>
     * This is an upper limit only; the actual number of results returned per
     * call may be fewer than the specified maximum.
     * </p>
     * 
     * @param maximumPageSize
     *        The maximum number of results that will be returned per call.
     *        <code>nextPageToken</code> can be used to obtain futher pages of
     *        results. The default is 1000, which is the maximum allowed page
     *        size. You can, however, specify a page size <i>smaller</i> than
     *        the maximum.</p>
     *        <p>
     *        This is an upper limit only; the actual number of results returned
     *        per call may be fewer than the specified maximum.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListWorkflowTypesRequest withMaximumPageSize(Integer maximumPageSize) {
        setMaximumPageSize(maximumPageSize);
        return this;
    }

    /**
     * <p>
     * When set to <code>true</code>, returns the results in reverse order. By
     * default the results are returned in ascending alphabetical order of the
     * <code>name</code> of the workflow types.
     * </p>
     * 
     * @param reverseOrder
     *        When set to <code>true</code>, returns the results in reverse
     *        order. By default the results are returned in ascending
     *        alphabetical order of the <code>name</code> of the workflow types.
     */

    public void setReverseOrder(Boolean reverseOrder) {
        this.reverseOrder = reverseOrder;
    }

    /**
     * <p>
     * When set to <code>true</code>, returns the results in reverse order. By
     * default the results are returned in ascending alphabetical order of the
     * <code>name</code> of the workflow types.
     * </p>
     * 
     * @return When set to <code>true</code>, returns the results in reverse
     *         order. By default the results are returned in ascending
     *         alphabetical order of the <code>name</code> of the workflow
     *         types.
     */

    public Boolean getReverseOrder() {
        return this.reverseOrder;
    }

    /**
     * <p>
     * When set to <code>true</code>, returns the results in reverse order. By
     * default the results are returned in ascending alphabetical order of the
     * <code>name</code> of the workflow types.
     * </p>
     * 
     * @param reverseOrder
     *        When set to <code>true</code>, returns the results in reverse
     *        order. By default the results are returned in ascending
     *        alphabetical order of the <code>name</code> of the workflow types.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListWorkflowTypesRequest withReverseOrder(Boolean reverseOrder) {
        setReverseOrder(reverseOrder);
        return this;
    }

    /**
     * <p>
     * When set to <code>true</code>, returns the results in reverse order. By
     * default the results are returned in ascending alphabetical order of the
     * <code>name</code> of the workflow types.
     * </p>
     * 
     * @return When set to <code>true</code>, returns the results in reverse
     *         order. By default the results are returned in ascending
     *         alphabetical order of the <code>name</code> of the workflow
     *         types.
     */

    public Boolean isReverseOrder() {
        return this.reverseOrder;
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
        if (getDomain() != null)
            sb.append("Domain: " + getDomain() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getRegistrationStatus() != null)
            sb.append("RegistrationStatus: " + getRegistrationStatus() + ",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: " + getNextPageToken() + ",");
        if (getMaximumPageSize() != null)
            sb.append("MaximumPageSize: " + getMaximumPageSize() + ",");
        if (getReverseOrder() != null)
            sb.append("ReverseOrder: " + getReverseOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListWorkflowTypesRequest == false)
            return false;
        ListWorkflowTypesRequest other = (ListWorkflowTypesRequest) obj;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null
                && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null
                && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRegistrationStatus() == null
                ^ this.getRegistrationStatus() == null)
            return false;
        if (other.getRegistrationStatus() != null
                && other.getRegistrationStatus().equals(
                        this.getRegistrationStatus()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null
                && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        if (other.getMaximumPageSize() == null
                ^ this.getMaximumPageSize() == null)
            return false;
        if (other.getMaximumPageSize() != null
                && other.getMaximumPageSize().equals(this.getMaximumPageSize()) == false)
            return false;
        if (other.getReverseOrder() == null ^ this.getReverseOrder() == null)
            return false;
        if (other.getReverseOrder() != null
                && other.getReverseOrder().equals(this.getReverseOrder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode
                + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime
                * hashCode
                + ((getRegistrationStatus() == null) ? 0
                        : getRegistrationStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getNextPageToken() == null) ? 0 : getNextPageToken()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getMaximumPageSize() == null) ? 0 : getMaximumPageSize()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getReverseOrder() == null) ? 0 : getReverseOrder()
                        .hashCode());
        return hashCode;
    }

    @Override
    public ListWorkflowTypesRequest clone() {
        return (ListWorkflowTypesRequest) super.clone();
    }
}

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
public class PollForDecisionTaskRequest extends
        com.amazonaws.AmazonWebServiceRequest implements Serializable,
        Cloneable {

    /**
     * <p>
     * The name of the domain containing the task lists to poll.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * Specifies the task list to poll for decision tasks.
     * </p>
     * <p>
     * The specified string must not start or end with whitespace. It must not
     * contain a <code>:</code> (colon), <code>/</code> (slash), <code>|</code>
     * (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     * \u009f). Also, it must not contain the literal string quotarnquot.
     * </p>
     */
    private TaskList taskList;
    /**
     * <p>
     * Identity of the decider making the request, which is recorded in the
     * DecisionTaskStarted event in the workflow history. This enables
     * diagnostic tracing when problems arise. The form of this identity is user
     * defined.
     * </p>
     */
    private String identity;
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
     * <note>The <code>nextPageToken</code> returned by this action cannot be
     * used with <a>GetWorkflowExecutionHistory</a> to get the next page. You
     * must call <a>PollForDecisionTask</a> again (with the
     * <code>nextPageToken</code>) to retrieve the next page of history records.
     * Calling <a>PollForDecisionTask</a> with a <code>nextPageToken</code> will
     * not return a new decision task.</note>.
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
     * When set to <code>true</code>, returns the events in reverse order. By
     * default the results are returned in ascending order of the
     * <code>eventTimestamp</code> of the events.
     * </p>
     */
    private Boolean reverseOrder;

    /**
     * <p>
     * The name of the domain containing the task lists to poll.
     * </p>
     * 
     * @param domain
     *        The name of the domain containing the task lists to poll.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The name of the domain containing the task lists to poll.
     * </p>
     * 
     * @return The name of the domain containing the task lists to poll.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The name of the domain containing the task lists to poll.
     * </p>
     * 
     * @param domain
     *        The name of the domain containing the task lists to poll.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PollForDecisionTaskRequest withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * Specifies the task list to poll for decision tasks.
     * </p>
     * <p>
     * The specified string must not start or end with whitespace. It must not
     * contain a <code>:</code> (colon), <code>/</code> (slash), <code>|</code>
     * (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     * \u009f). Also, it must not contain the literal string quotarnquot.
     * </p>
     * 
     * @param taskList
     *        Specifies the task list to poll for decision tasks.</p>
     *        <p>
     *        The specified string must not start or end with whitespace. It
     *        must not contain a <code>:</code> (colon), <code>/</code> (slash),
     *        <code>|</code> (vertical bar), or any control characters
     *        (\u0000-\u001f | \u007f - \u009f). Also, it must not contain the
     *        literal string quotarnquot.
     */

    public void setTaskList(TaskList taskList) {
        this.taskList = taskList;
    }

    /**
     * <p>
     * Specifies the task list to poll for decision tasks.
     * </p>
     * <p>
     * The specified string must not start or end with whitespace. It must not
     * contain a <code>:</code> (colon), <code>/</code> (slash), <code>|</code>
     * (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     * \u009f). Also, it must not contain the literal string quotarnquot.
     * </p>
     * 
     * @return Specifies the task list to poll for decision tasks.</p>
     *         <p>
     *         The specified string must not start or end with whitespace. It
     *         must not contain a <code>:</code> (colon), <code>/</code>
     *         (slash), <code>|</code> (vertical bar), or any control characters
     *         (\u0000-\u001f | \u007f - \u009f). Also, it must not contain the
     *         literal string quotarnquot.
     */

    public TaskList getTaskList() {
        return this.taskList;
    }

    /**
     * <p>
     * Specifies the task list to poll for decision tasks.
     * </p>
     * <p>
     * The specified string must not start or end with whitespace. It must not
     * contain a <code>:</code> (colon), <code>/</code> (slash), <code>|</code>
     * (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     * \u009f). Also, it must not contain the literal string quotarnquot.
     * </p>
     * 
     * @param taskList
     *        Specifies the task list to poll for decision tasks.</p>
     *        <p>
     *        The specified string must not start or end with whitespace. It
     *        must not contain a <code>:</code> (colon), <code>/</code> (slash),
     *        <code>|</code> (vertical bar), or any control characters
     *        (\u0000-\u001f | \u007f - \u009f). Also, it must not contain the
     *        literal string quotarnquot.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PollForDecisionTaskRequest withTaskList(TaskList taskList) {
        setTaskList(taskList);
        return this;
    }

    /**
     * <p>
     * Identity of the decider making the request, which is recorded in the
     * DecisionTaskStarted event in the workflow history. This enables
     * diagnostic tracing when problems arise. The form of this identity is user
     * defined.
     * </p>
     * 
     * @param identity
     *        Identity of the decider making the request, which is recorded in
     *        the DecisionTaskStarted event in the workflow history. This
     *        enables diagnostic tracing when problems arise. The form of this
     *        identity is user defined.
     */

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    /**
     * <p>
     * Identity of the decider making the request, which is recorded in the
     * DecisionTaskStarted event in the workflow history. This enables
     * diagnostic tracing when problems arise. The form of this identity is user
     * defined.
     * </p>
     * 
     * @return Identity of the decider making the request, which is recorded in
     *         the DecisionTaskStarted event in the workflow history. This
     *         enables diagnostic tracing when problems arise. The form of this
     *         identity is user defined.
     */

    public String getIdentity() {
        return this.identity;
    }

    /**
     * <p>
     * Identity of the decider making the request, which is recorded in the
     * DecisionTaskStarted event in the workflow history. This enables
     * diagnostic tracing when problems arise. The form of this identity is user
     * defined.
     * </p>
     * 
     * @param identity
     *        Identity of the decider making the request, which is recorded in
     *        the DecisionTaskStarted event in the workflow history. This
     *        enables diagnostic tracing when problems arise. The form of this
     *        identity is user defined.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PollForDecisionTaskRequest withIdentity(String identity) {
        setIdentity(identity);
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
     * <note>The <code>nextPageToken</code> returned by this action cannot be
     * used with <a>GetWorkflowExecutionHistory</a> to get the next page. You
     * must call <a>PollForDecisionTask</a> again (with the
     * <code>nextPageToken</code>) to retrieve the next page of history records.
     * Calling <a>PollForDecisionTask</a> with a <code>nextPageToken</code> will
     * not return a new decision task.</note>.
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
     *        </p>
     *        <note>The <code>nextPageToken</code> returned by this action
     *        cannot be used with <a>GetWorkflowExecutionHistory</a> to get the
     *        next page. You must call <a>PollForDecisionTask</a> again (with
     *        the <code>nextPageToken</code>) to retrieve the next page of
     *        history records. Calling <a>PollForDecisionTask</a> with a
     *        <code>nextPageToken</code> will not return a new decision task.
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
     * <note>The <code>nextPageToken</code> returned by this action cannot be
     * used with <a>GetWorkflowExecutionHistory</a> to get the next page. You
     * must call <a>PollForDecisionTask</a> again (with the
     * <code>nextPageToken</code>) to retrieve the next page of history records.
     * Calling <a>PollForDecisionTask</a> with a <code>nextPageToken</code> will
     * not return a new decision task.</note>.
     * 
     * @return If a <code>NextPageToken</code> was returned by a previous call,
     *         there are more results available. To retrieve the next page of
     *         results, make the call again using the returned token in
     *         <code>nextPageToken</code>. Keep all other arguments
     *         unchanged.</p>
     *         <p>
     *         The configured <code>maximumPageSize</code> determines how many
     *         results can be returned in a single call.
     *         </p>
     *         <note>The <code>nextPageToken</code> returned by this action
     *         cannot be used with <a>GetWorkflowExecutionHistory</a> to get the
     *         next page. You must call <a>PollForDecisionTask</a> again (with
     *         the <code>nextPageToken</code>) to retrieve the next page of
     *         history records. Calling <a>PollForDecisionTask</a> with a
     *         <code>nextPageToken</code> will not return a new decision task.
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
     * <note>The <code>nextPageToken</code> returned by this action cannot be
     * used with <a>GetWorkflowExecutionHistory</a> to get the next page. You
     * must call <a>PollForDecisionTask</a> again (with the
     * <code>nextPageToken</code>) to retrieve the next page of history records.
     * Calling <a>PollForDecisionTask</a> with a <code>nextPageToken</code> will
     * not return a new decision task.</note>.
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
     *        </p>
     *        <note>The <code>nextPageToken</code> returned by this action
     *        cannot be used with <a>GetWorkflowExecutionHistory</a> to get the
     *        next page. You must call <a>PollForDecisionTask</a> again (with
     *        the <code>nextPageToken</code>) to retrieve the next page of
     *        history records. Calling <a>PollForDecisionTask</a> with a
     *        <code>nextPageToken</code> will not return a new decision task.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PollForDecisionTaskRequest withNextPageToken(String nextPageToken) {
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

    public PollForDecisionTaskRequest withMaximumPageSize(
            Integer maximumPageSize) {
        setMaximumPageSize(maximumPageSize);
        return this;
    }

    /**
     * <p>
     * When set to <code>true</code>, returns the events in reverse order. By
     * default the results are returned in ascending order of the
     * <code>eventTimestamp</code> of the events.
     * </p>
     * 
     * @param reverseOrder
     *        When set to <code>true</code>, returns the events in reverse
     *        order. By default the results are returned in ascending order of
     *        the <code>eventTimestamp</code> of the events.
     */

    public void setReverseOrder(Boolean reverseOrder) {
        this.reverseOrder = reverseOrder;
    }

    /**
     * <p>
     * When set to <code>true</code>, returns the events in reverse order. By
     * default the results are returned in ascending order of the
     * <code>eventTimestamp</code> of the events.
     * </p>
     * 
     * @return When set to <code>true</code>, returns the events in reverse
     *         order. By default the results are returned in ascending order of
     *         the <code>eventTimestamp</code> of the events.
     */

    public Boolean getReverseOrder() {
        return this.reverseOrder;
    }

    /**
     * <p>
     * When set to <code>true</code>, returns the events in reverse order. By
     * default the results are returned in ascending order of the
     * <code>eventTimestamp</code> of the events.
     * </p>
     * 
     * @param reverseOrder
     *        When set to <code>true</code>, returns the events in reverse
     *        order. By default the results are returned in ascending order of
     *        the <code>eventTimestamp</code> of the events.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PollForDecisionTaskRequest withReverseOrder(Boolean reverseOrder) {
        setReverseOrder(reverseOrder);
        return this;
    }

    /**
     * <p>
     * When set to <code>true</code>, returns the events in reverse order. By
     * default the results are returned in ascending order of the
     * <code>eventTimestamp</code> of the events.
     * </p>
     * 
     * @return When set to <code>true</code>, returns the events in reverse
     *         order. By default the results are returned in ascending order of
     *         the <code>eventTimestamp</code> of the events.
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
        if (getTaskList() != null)
            sb.append("TaskList: " + getTaskList() + ",");
        if (getIdentity() != null)
            sb.append("Identity: " + getIdentity() + ",");
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

        if (obj instanceof PollForDecisionTaskRequest == false)
            return false;
        PollForDecisionTaskRequest other = (PollForDecisionTaskRequest) obj;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null
                && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getTaskList() == null ^ this.getTaskList() == null)
            return false;
        if (other.getTaskList() != null
                && other.getTaskList().equals(this.getTaskList()) == false)
            return false;
        if (other.getIdentity() == null ^ this.getIdentity() == null)
            return false;
        if (other.getIdentity() != null
                && other.getIdentity().equals(this.getIdentity()) == false)
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
                + ((getTaskList() == null) ? 0 : getTaskList().hashCode());
        hashCode = prime * hashCode
                + ((getIdentity() == null) ? 0 : getIdentity().hashCode());
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
    public PollForDecisionTaskRequest clone() {
        return (PollForDecisionTaskRequest) super.clone();
    }
}

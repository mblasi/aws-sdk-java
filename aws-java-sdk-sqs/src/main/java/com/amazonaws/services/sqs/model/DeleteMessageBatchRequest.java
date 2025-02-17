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
package com.amazonaws.services.sqs.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 */
public class DeleteMessageBatchRequest extends
        com.amazonaws.AmazonWebServiceRequest implements Serializable,
        Cloneable {

    /**
     * <p>
     * The URL of the Amazon SQS queue to take action on.
     * </p>
     * <p>
     * Queue URLs are case-sensitive.
     * </p>
     */
    private String queueUrl;
    /**
     * <p>
     * A list of receipt handles for the messages to be deleted.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DeleteMessageBatchRequestEntry> entries;

    /**
     * Default constructor for DeleteMessageBatchRequest object. Callers should
     * use the setter or fluent setter (with...) methods to initialize the
     * object after creating it.
     */
    public DeleteMessageBatchRequest() {
    }

    /**
     * Constructs a new DeleteMessageBatchRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     * 
     * @param queueUrl
     *        The URL of the Amazon SQS queue to take action on.</p>
     *        <p>
     *        Queue URLs are case-sensitive.
     */
    public DeleteMessageBatchRequest(String queueUrl) {
        setQueueUrl(queueUrl);
    }

    /**
     * Constructs a new DeleteMessageBatchRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     * 
     * @param queueUrl
     *        The URL of the Amazon SQS queue to take action on.</p>
     *        <p>
     *        Queue URLs are case-sensitive.
     * @param entries
     *        A list of receipt handles for the messages to be deleted.
     */
    public DeleteMessageBatchRequest(String queueUrl,
            java.util.List<DeleteMessageBatchRequestEntry> entries) {
        setQueueUrl(queueUrl);
        setEntries(entries);
    }

    /**
     * <p>
     * The URL of the Amazon SQS queue to take action on.
     * </p>
     * <p>
     * Queue URLs are case-sensitive.
     * </p>
     * 
     * @param queueUrl
     *        The URL of the Amazon SQS queue to take action on.</p>
     *        <p>
     *        Queue URLs are case-sensitive.
     */

    public void setQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
    }

    /**
     * <p>
     * The URL of the Amazon SQS queue to take action on.
     * </p>
     * <p>
     * Queue URLs are case-sensitive.
     * </p>
     * 
     * @return The URL of the Amazon SQS queue to take action on.</p>
     *         <p>
     *         Queue URLs are case-sensitive.
     */

    public String getQueueUrl() {
        return this.queueUrl;
    }

    /**
     * <p>
     * The URL of the Amazon SQS queue to take action on.
     * </p>
     * <p>
     * Queue URLs are case-sensitive.
     * </p>
     * 
     * @param queueUrl
     *        The URL of the Amazon SQS queue to take action on.</p>
     *        <p>
     *        Queue URLs are case-sensitive.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeleteMessageBatchRequest withQueueUrl(String queueUrl) {
        setQueueUrl(queueUrl);
        return this;
    }

    /**
     * <p>
     * A list of receipt handles for the messages to be deleted.
     * </p>
     * 
     * @return A list of receipt handles for the messages to be deleted.
     */

    public java.util.List<DeleteMessageBatchRequestEntry> getEntries() {
        if (entries == null) {
            entries = new com.amazonaws.internal.SdkInternalList<DeleteMessageBatchRequestEntry>();
        }
        return entries;
    }

    /**
     * <p>
     * A list of receipt handles for the messages to be deleted.
     * </p>
     * 
     * @param entries
     *        A list of receipt handles for the messages to be deleted.
     */

    public void setEntries(
            java.util.Collection<DeleteMessageBatchRequestEntry> entries) {
        if (entries == null) {
            this.entries = null;
            return;
        }

        this.entries = new com.amazonaws.internal.SdkInternalList<DeleteMessageBatchRequestEntry>(
                entries);
    }

    /**
     * <p>
     * A list of receipt handles for the messages to be deleted.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setEntries(java.util.Collection)} or
     * {@link #withEntries(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param entries
     *        A list of receipt handles for the messages to be deleted.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeleteMessageBatchRequest withEntries(
            DeleteMessageBatchRequestEntry... entries) {
        if (this.entries == null) {
            setEntries(new com.amazonaws.internal.SdkInternalList<DeleteMessageBatchRequestEntry>(
                    entries.length));
        }
        for (DeleteMessageBatchRequestEntry ele : entries) {
            this.entries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of receipt handles for the messages to be deleted.
     * </p>
     * 
     * @param entries
     *        A list of receipt handles for the messages to be deleted.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeleteMessageBatchRequest withEntries(
            java.util.Collection<DeleteMessageBatchRequestEntry> entries) {
        setEntries(entries);
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
        if (getQueueUrl() != null)
            sb.append("QueueUrl: " + getQueueUrl() + ",");
        if (getEntries() != null)
            sb.append("Entries: " + getEntries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteMessageBatchRequest == false)
            return false;
        DeleteMessageBatchRequest other = (DeleteMessageBatchRequest) obj;
        if (other.getQueueUrl() == null ^ this.getQueueUrl() == null)
            return false;
        if (other.getQueueUrl() != null
                && other.getQueueUrl().equals(this.getQueueUrl()) == false)
            return false;
        if (other.getEntries() == null ^ this.getEntries() == null)
            return false;
        if (other.getEntries() != null
                && other.getEntries().equals(this.getEntries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getQueueUrl() == null) ? 0 : getQueueUrl().hashCode());
        hashCode = prime * hashCode
                + ((getEntries() == null) ? 0 : getEntries().hashCode());
        return hashCode;
    }

    @Override
    public DeleteMessageBatchRequest clone() {
        return (DeleteMessageBatchRequest) super.clone();
    }
}

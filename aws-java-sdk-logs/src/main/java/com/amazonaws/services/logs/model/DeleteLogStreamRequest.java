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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DeleteLogStreamRequest extends
        com.amazonaws.AmazonWebServiceRequest implements Serializable,
        Cloneable {

    /**
     * <p>
     * The name of the log group under which the log stream to delete belongs.
     * </p>
     */
    private String logGroupName;
    /**
     * <p>
     * The name of the log stream to delete.
     * </p>
     */
    private String logStreamName;

    /**
     * Default constructor for DeleteLogStreamRequest object. Callers should use
     * the setter or fluent setter (with...) methods to initialize the object
     * after creating it.
     */
    public DeleteLogStreamRequest() {
    }

    /**
     * Constructs a new DeleteLogStreamRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     * 
     * @param logGroupName
     *        The name of the log group under which the log stream to delete
     *        belongs.
     * @param logStreamName
     *        The name of the log stream to delete.
     */
    public DeleteLogStreamRequest(String logGroupName, String logStreamName) {
        setLogGroupName(logGroupName);
        setLogStreamName(logStreamName);
    }

    /**
     * <p>
     * The name of the log group under which the log stream to delete belongs.
     * </p>
     * 
     * @param logGroupName
     *        The name of the log group under which the log stream to delete
     *        belongs.
     */

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The name of the log group under which the log stream to delete belongs.
     * </p>
     * 
     * @return The name of the log group under which the log stream to delete
     *         belongs.
     */

    public String getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * <p>
     * The name of the log group under which the log stream to delete belongs.
     * </p>
     * 
     * @param logGroupName
     *        The name of the log group under which the log stream to delete
     *        belongs.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeleteLogStreamRequest withLogGroupName(String logGroupName) {
        setLogGroupName(logGroupName);
        return this;
    }

    /**
     * <p>
     * The name of the log stream to delete.
     * </p>
     * 
     * @param logStreamName
     *        The name of the log stream to delete.
     */

    public void setLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
    }

    /**
     * <p>
     * The name of the log stream to delete.
     * </p>
     * 
     * @return The name of the log stream to delete.
     */

    public String getLogStreamName() {
        return this.logStreamName;
    }

    /**
     * <p>
     * The name of the log stream to delete.
     * </p>
     * 
     * @param logStreamName
     *        The name of the log stream to delete.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeleteLogStreamRequest withLogStreamName(String logStreamName) {
        setLogStreamName(logStreamName);
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
        if (getLogGroupName() != null)
            sb.append("LogGroupName: " + getLogGroupName() + ",");
        if (getLogStreamName() != null)
            sb.append("LogStreamName: " + getLogStreamName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteLogStreamRequest == false)
            return false;
        DeleteLogStreamRequest other = (DeleteLogStreamRequest) obj;
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null
                && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        if (other.getLogStreamName() == null ^ this.getLogStreamName() == null)
            return false;
        if (other.getLogStreamName() != null
                && other.getLogStreamName().equals(this.getLogStreamName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getLogGroupName() == null) ? 0 : getLogGroupName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getLogStreamName() == null) ? 0 : getLogStreamName()
                        .hashCode());
        return hashCode;
    }

    @Override
    public DeleteLogStreamRequest clone() {
        return (DeleteLogStreamRequest) super.clone();
    }
}

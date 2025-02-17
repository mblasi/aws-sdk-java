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

/**
 * 
 */
public class DescribeTasksResult extends
        com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata>
        implements Serializable, Cloneable {

    /**
     * <p>
     * The list of tasks.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Task> tasks;
    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Failure> failures;

    /**
     * <p>
     * The list of tasks.
     * </p>
     * 
     * @return The list of tasks.
     */

    public java.util.List<Task> getTasks() {
        if (tasks == null) {
            tasks = new com.amazonaws.internal.SdkInternalList<Task>();
        }
        return tasks;
    }

    /**
     * <p>
     * The list of tasks.
     * </p>
     * 
     * @param tasks
     *        The list of tasks.
     */

    public void setTasks(java.util.Collection<Task> tasks) {
        if (tasks == null) {
            this.tasks = null;
            return;
        }

        this.tasks = new com.amazonaws.internal.SdkInternalList<Task>(tasks);
    }

    /**
     * <p>
     * The list of tasks.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTasks(java.util.Collection)} or
     * {@link #withTasks(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tasks
     *        The list of tasks.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeTasksResult withTasks(Task... tasks) {
        if (this.tasks == null) {
            setTasks(new com.amazonaws.internal.SdkInternalList<Task>(
                    tasks.length));
        }
        for (Task ele : tasks) {
            this.tasks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of tasks.
     * </p>
     * 
     * @param tasks
     *        The list of tasks.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeTasksResult withTasks(java.util.Collection<Task> tasks) {
        setTasks(tasks);
        return this;
    }

    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     * 
     * @return Any failures associated with the call.
     */

    public java.util.List<Failure> getFailures() {
        if (failures == null) {
            failures = new com.amazonaws.internal.SdkInternalList<Failure>();
        }
        return failures;
    }

    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     * 
     * @param failures
     *        Any failures associated with the call.
     */

    public void setFailures(java.util.Collection<Failure> failures) {
        if (failures == null) {
            this.failures = null;
            return;
        }

        this.failures = new com.amazonaws.internal.SdkInternalList<Failure>(
                failures);
    }

    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setFailures(java.util.Collection)} or
     * {@link #withFailures(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param failures
     *        Any failures associated with the call.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeTasksResult withFailures(Failure... failures) {
        if (this.failures == null) {
            setFailures(new com.amazonaws.internal.SdkInternalList<Failure>(
                    failures.length));
        }
        for (Failure ele : failures) {
            this.failures.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     * 
     * @param failures
     *        Any failures associated with the call.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeTasksResult withFailures(
            java.util.Collection<Failure> failures) {
        setFailures(failures);
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
        if (getTasks() != null)
            sb.append("Tasks: " + getTasks() + ",");
        if (getFailures() != null)
            sb.append("Failures: " + getFailures());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTasksResult == false)
            return false;
        DescribeTasksResult other = (DescribeTasksResult) obj;
        if (other.getTasks() == null ^ this.getTasks() == null)
            return false;
        if (other.getTasks() != null
                && other.getTasks().equals(this.getTasks()) == false)
            return false;
        if (other.getFailures() == null ^ this.getFailures() == null)
            return false;
        if (other.getFailures() != null
                && other.getFailures().equals(this.getFailures()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTasks() == null) ? 0 : getTasks().hashCode());
        hashCode = prime * hashCode
                + ((getFailures() == null) ? 0 : getFailures().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTasksResult clone() {
        try {
            return (DescribeTasksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

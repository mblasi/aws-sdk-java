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
public class DescribeTaskDefinitionRequest extends
        com.amazonaws.AmazonWebServiceRequest implements Serializable,
        Cloneable {

    /**
     * <p>
     * The <code>family</code> for the latest <code>ACTIVE</code> revision,
     * <code>family</code> and <code>revision</code> (
     * <code>family:revision</code>) for a specific revision in the family, or
     * full Amazon Resource Name (ARN) of the task definition to describe.
     * </p>
     */
    private String taskDefinition;

    /**
     * <p>
     * The <code>family</code> for the latest <code>ACTIVE</code> revision,
     * <code>family</code> and <code>revision</code> (
     * <code>family:revision</code>) for a specific revision in the family, or
     * full Amazon Resource Name (ARN) of the task definition to describe.
     * </p>
     * 
     * @param taskDefinition
     *        The <code>family</code> for the latest <code>ACTIVE</code>
     *        revision, <code>family</code> and <code>revision</code> (
     *        <code>family:revision</code>) for a specific revision in the
     *        family, or full Amazon Resource Name (ARN) of the task definition
     *        to describe.
     */

    public void setTaskDefinition(String taskDefinition) {
        this.taskDefinition = taskDefinition;
    }

    /**
     * <p>
     * The <code>family</code> for the latest <code>ACTIVE</code> revision,
     * <code>family</code> and <code>revision</code> (
     * <code>family:revision</code>) for a specific revision in the family, or
     * full Amazon Resource Name (ARN) of the task definition to describe.
     * </p>
     * 
     * @return The <code>family</code> for the latest <code>ACTIVE</code>
     *         revision, <code>family</code> and <code>revision</code> (
     *         <code>family:revision</code>) for a specific revision in the
     *         family, or full Amazon Resource Name (ARN) of the task definition
     *         to describe.
     */

    public String getTaskDefinition() {
        return this.taskDefinition;
    }

    /**
     * <p>
     * The <code>family</code> for the latest <code>ACTIVE</code> revision,
     * <code>family</code> and <code>revision</code> (
     * <code>family:revision</code>) for a specific revision in the family, or
     * full Amazon Resource Name (ARN) of the task definition to describe.
     * </p>
     * 
     * @param taskDefinition
     *        The <code>family</code> for the latest <code>ACTIVE</code>
     *        revision, <code>family</code> and <code>revision</code> (
     *        <code>family:revision</code>) for a specific revision in the
     *        family, or full Amazon Resource Name (ARN) of the task definition
     *        to describe.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeTaskDefinitionRequest withTaskDefinition(
            String taskDefinition) {
        setTaskDefinition(taskDefinition);
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
        if (getTaskDefinition() != null)
            sb.append("TaskDefinition: " + getTaskDefinition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTaskDefinitionRequest == false)
            return false;
        DescribeTaskDefinitionRequest other = (DescribeTaskDefinitionRequest) obj;
        if (other.getTaskDefinition() == null
                ^ this.getTaskDefinition() == null)
            return false;
        if (other.getTaskDefinition() != null
                && other.getTaskDefinition().equals(this.getTaskDefinition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getTaskDefinition() == null) ? 0 : getTaskDefinition()
                        .hashCode());
        return hashCode;
    }

    @Override
    public DescribeTaskDefinitionRequest clone() {
        return (DescribeTaskDefinitionRequest) super.clone();
    }
}

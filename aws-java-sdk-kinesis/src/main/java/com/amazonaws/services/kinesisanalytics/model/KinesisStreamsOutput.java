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
package com.amazonaws.services.kinesisanalytics.model;

import java.io.Serializable;

/**
 * <p>
 * When configuring application output, identifies a Amazon Kinesis stream as
 * the destination. You provide the stream Amazon Resource Name (ARN) and also
 * an IAM role ARN that Amazon Kinesis Analytics can use to write to the stream
 * on your behalf.
 * </p>
 */
public class KinesisStreamsOutput implements Serializable, Cloneable {

    /**
     * <p>
     * ARN of the destination Amazon Kinesis stream to write to.
     * </p>
     */
    private String resourceARN;
    /**
     * <p>
     * ARN of the IAM role that Amazon Kinesis Analytics can assume to write to
     * the destination stream on your behalf. You need to grant the necessary
     * permissions to this role.
     * </p>
     */
    private String roleARN;

    /**
     * <p>
     * ARN of the destination Amazon Kinesis stream to write to.
     * </p>
     * 
     * @param resourceARN
     *        ARN of the destination Amazon Kinesis stream to write to.
     */

    public void setResourceARN(String resourceARN) {
        this.resourceARN = resourceARN;
    }

    /**
     * <p>
     * ARN of the destination Amazon Kinesis stream to write to.
     * </p>
     * 
     * @return ARN of the destination Amazon Kinesis stream to write to.
     */

    public String getResourceARN() {
        return this.resourceARN;
    }

    /**
     * <p>
     * ARN of the destination Amazon Kinesis stream to write to.
     * </p>
     * 
     * @param resourceARN
     *        ARN of the destination Amazon Kinesis stream to write to.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public KinesisStreamsOutput withResourceARN(String resourceARN) {
        setResourceARN(resourceARN);
        return this;
    }

    /**
     * <p>
     * ARN of the IAM role that Amazon Kinesis Analytics can assume to write to
     * the destination stream on your behalf. You need to grant the necessary
     * permissions to this role.
     * </p>
     * 
     * @param roleARN
     *        ARN of the IAM role that Amazon Kinesis Analytics can assume to
     *        write to the destination stream on your behalf. You need to grant
     *        the necessary permissions to this role.
     */

    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * ARN of the IAM role that Amazon Kinesis Analytics can assume to write to
     * the destination stream on your behalf. You need to grant the necessary
     * permissions to this role.
     * </p>
     * 
     * @return ARN of the IAM role that Amazon Kinesis Analytics can assume to
     *         write to the destination stream on your behalf. You need to grant
     *         the necessary permissions to this role.
     */

    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * <p>
     * ARN of the IAM role that Amazon Kinesis Analytics can assume to write to
     * the destination stream on your behalf. You need to grant the necessary
     * permissions to this role.
     * </p>
     * 
     * @param roleARN
     *        ARN of the IAM role that Amazon Kinesis Analytics can assume to
     *        write to the destination stream on your behalf. You need to grant
     *        the necessary permissions to this role.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public KinesisStreamsOutput withRoleARN(String roleARN) {
        setRoleARN(roleARN);
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
        if (getResourceARN() != null)
            sb.append("ResourceARN: " + getResourceARN() + ",");
        if (getRoleARN() != null)
            sb.append("RoleARN: " + getRoleARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KinesisStreamsOutput == false)
            return false;
        KinesisStreamsOutput other = (KinesisStreamsOutput) obj;
        if (other.getResourceARN() == null ^ this.getResourceARN() == null)
            return false;
        if (other.getResourceARN() != null
                && other.getResourceARN().equals(this.getResourceARN()) == false)
            return false;
        if (other.getRoleARN() == null ^ this.getRoleARN() == null)
            return false;
        if (other.getRoleARN() != null
                && other.getRoleARN().equals(this.getRoleARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getResourceARN() == null) ? 0 : getResourceARN().hashCode());
        hashCode = prime * hashCode
                + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        return hashCode;
    }

    @Override
    public KinesisStreamsOutput clone() {
        try {
            return (KinesisStreamsOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

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
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Contains the parameters for DescribeTargetHealth.
 * </p>
 */
public class DescribeTargetHealthRequest extends
        com.amazonaws.AmazonWebServiceRequest implements Serializable,
        Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target group.
     * </p>
     */
    private String targetGroupArn;
    /**
     * <p>
     * The targets.
     * </p>
     */
    private java.util.List<TargetDescription> targets;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target group.
     * </p>
     * 
     * @param targetGroupArn
     *        The Amazon Resource Name (ARN) of the target group.
     */

    public void setTargetGroupArn(String targetGroupArn) {
        this.targetGroupArn = targetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target group.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the target group.
     */

    public String getTargetGroupArn() {
        return this.targetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target group.
     * </p>
     * 
     * @param targetGroupArn
     *        The Amazon Resource Name (ARN) of the target group.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeTargetHealthRequest withTargetGroupArn(String targetGroupArn) {
        setTargetGroupArn(targetGroupArn);
        return this;
    }

    /**
     * <p>
     * The targets.
     * </p>
     * 
     * @return The targets.
     */

    public java.util.List<TargetDescription> getTargets() {
        return targets;
    }

    /**
     * <p>
     * The targets.
     * </p>
     * 
     * @param targets
     *        The targets.
     */

    public void setTargets(java.util.Collection<TargetDescription> targets) {
        if (targets == null) {
            this.targets = null;
            return;
        }

        this.targets = new java.util.ArrayList<TargetDescription>(targets);
    }

    /**
     * <p>
     * The targets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTargets(java.util.Collection)} or
     * {@link #withTargets(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param targets
     *        The targets.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeTargetHealthRequest withTargets(TargetDescription... targets) {
        if (this.targets == null) {
            setTargets(new java.util.ArrayList<TargetDescription>(
                    targets.length));
        }
        for (TargetDescription ele : targets) {
            this.targets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The targets.
     * </p>
     * 
     * @param targets
     *        The targets.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeTargetHealthRequest withTargets(
            java.util.Collection<TargetDescription> targets) {
        setTargets(targets);
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
        if (getTargetGroupArn() != null)
            sb.append("TargetGroupArn: " + getTargetGroupArn() + ",");
        if (getTargets() != null)
            sb.append("Targets: " + getTargets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTargetHealthRequest == false)
            return false;
        DescribeTargetHealthRequest other = (DescribeTargetHealthRequest) obj;
        if (other.getTargetGroupArn() == null
                ^ this.getTargetGroupArn() == null)
            return false;
        if (other.getTargetGroupArn() != null
                && other.getTargetGroupArn().equals(this.getTargetGroupArn()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null
                && other.getTargets().equals(this.getTargets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getTargetGroupArn() == null) ? 0 : getTargetGroupArn()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getTargets() == null) ? 0 : getTargets().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTargetHealthRequest clone() {
        return (DescribeTargetHealthRequest) super.clone();
    }
}

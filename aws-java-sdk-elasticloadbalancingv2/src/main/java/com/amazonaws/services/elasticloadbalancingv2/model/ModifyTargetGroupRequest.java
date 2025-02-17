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
 * Contains the parameters for ModifyTargetGroup.
 * </p>
 */
public class ModifyTargetGroupRequest extends
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
     * The protocol to use to connect with the target.
     * </p>
     */
    private String healthCheckProtocol;
    /**
     * <p>
     * The port to use to connect with the target.
     * </p>
     */
    private String healthCheckPort;
    /**
     * <p>
     * The ping path that is the destination for the health check request.
     * </p>
     */
    private String healthCheckPath;
    /**
     * <p>
     * The approximate amount of time, in seconds, between health checks of an
     * individual target.
     * </p>
     */
    private Integer healthCheckIntervalSeconds;
    /**
     * <p>
     * The amount of time, in seconds, during which no response means a failed
     * health check.
     * </p>
     */
    private Integer healthCheckTimeoutSeconds;
    /**
     * <p>
     * The number of consecutive health checks successes required before
     * considering an unhealthy target healthy.
     * </p>
     */
    private Integer healthyThresholdCount;
    /**
     * <p>
     * The number of consecutive health check failures required before
     * considering the target unhealthy.
     * </p>
     */
    private Integer unhealthyThresholdCount;
    /**
     * <p>
     * The HTTP codes to use when checking for a successful response from a
     * target.
     * </p>
     */
    private Matcher matcher;

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

    public ModifyTargetGroupRequest withTargetGroupArn(String targetGroupArn) {
        setTargetGroupArn(targetGroupArn);
        return this;
    }

    /**
     * <p>
     * The protocol to use to connect with the target.
     * </p>
     * 
     * @param healthCheckProtocol
     *        The protocol to use to connect with the target.
     * @see ProtocolEnum
     */

    public void setHealthCheckProtocol(String healthCheckProtocol) {
        this.healthCheckProtocol = healthCheckProtocol;
    }

    /**
     * <p>
     * The protocol to use to connect with the target.
     * </p>
     * 
     * @return The protocol to use to connect with the target.
     * @see ProtocolEnum
     */

    public String getHealthCheckProtocol() {
        return this.healthCheckProtocol;
    }

    /**
     * <p>
     * The protocol to use to connect with the target.
     * </p>
     * 
     * @param healthCheckProtocol
     *        The protocol to use to connect with the target.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ProtocolEnum
     */

    public ModifyTargetGroupRequest withHealthCheckProtocol(
            String healthCheckProtocol) {
        setHealthCheckProtocol(healthCheckProtocol);
        return this;
    }

    /**
     * <p>
     * The protocol to use to connect with the target.
     * </p>
     * 
     * @param healthCheckProtocol
     *        The protocol to use to connect with the target.
     * @see ProtocolEnum
     */

    public void setHealthCheckProtocol(ProtocolEnum healthCheckProtocol) {
        this.healthCheckProtocol = healthCheckProtocol.toString();
    }

    /**
     * <p>
     * The protocol to use to connect with the target.
     * </p>
     * 
     * @param healthCheckProtocol
     *        The protocol to use to connect with the target.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ProtocolEnum
     */

    public ModifyTargetGroupRequest withHealthCheckProtocol(
            ProtocolEnum healthCheckProtocol) {
        setHealthCheckProtocol(healthCheckProtocol);
        return this;
    }

    /**
     * <p>
     * The port to use to connect with the target.
     * </p>
     * 
     * @param healthCheckPort
     *        The port to use to connect with the target.
     */

    public void setHealthCheckPort(String healthCheckPort) {
        this.healthCheckPort = healthCheckPort;
    }

    /**
     * <p>
     * The port to use to connect with the target.
     * </p>
     * 
     * @return The port to use to connect with the target.
     */

    public String getHealthCheckPort() {
        return this.healthCheckPort;
    }

    /**
     * <p>
     * The port to use to connect with the target.
     * </p>
     * 
     * @param healthCheckPort
     *        The port to use to connect with the target.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyTargetGroupRequest withHealthCheckPort(String healthCheckPort) {
        setHealthCheckPort(healthCheckPort);
        return this;
    }

    /**
     * <p>
     * The ping path that is the destination for the health check request.
     * </p>
     * 
     * @param healthCheckPath
     *        The ping path that is the destination for the health check
     *        request.
     */

    public void setHealthCheckPath(String healthCheckPath) {
        this.healthCheckPath = healthCheckPath;
    }

    /**
     * <p>
     * The ping path that is the destination for the health check request.
     * </p>
     * 
     * @return The ping path that is the destination for the health check
     *         request.
     */

    public String getHealthCheckPath() {
        return this.healthCheckPath;
    }

    /**
     * <p>
     * The ping path that is the destination for the health check request.
     * </p>
     * 
     * @param healthCheckPath
     *        The ping path that is the destination for the health check
     *        request.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyTargetGroupRequest withHealthCheckPath(String healthCheckPath) {
        setHealthCheckPath(healthCheckPath);
        return this;
    }

    /**
     * <p>
     * The approximate amount of time, in seconds, between health checks of an
     * individual target.
     * </p>
     * 
     * @param healthCheckIntervalSeconds
     *        The approximate amount of time, in seconds, between health checks
     *        of an individual target.
     */

    public void setHealthCheckIntervalSeconds(Integer healthCheckIntervalSeconds) {
        this.healthCheckIntervalSeconds = healthCheckIntervalSeconds;
    }

    /**
     * <p>
     * The approximate amount of time, in seconds, between health checks of an
     * individual target.
     * </p>
     * 
     * @return The approximate amount of time, in seconds, between health checks
     *         of an individual target.
     */

    public Integer getHealthCheckIntervalSeconds() {
        return this.healthCheckIntervalSeconds;
    }

    /**
     * <p>
     * The approximate amount of time, in seconds, between health checks of an
     * individual target.
     * </p>
     * 
     * @param healthCheckIntervalSeconds
     *        The approximate amount of time, in seconds, between health checks
     *        of an individual target.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyTargetGroupRequest withHealthCheckIntervalSeconds(
            Integer healthCheckIntervalSeconds) {
        setHealthCheckIntervalSeconds(healthCheckIntervalSeconds);
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, during which no response means a failed
     * health check.
     * </p>
     * 
     * @param healthCheckTimeoutSeconds
     *        The amount of time, in seconds, during which no response means a
     *        failed health check.
     */

    public void setHealthCheckTimeoutSeconds(Integer healthCheckTimeoutSeconds) {
        this.healthCheckTimeoutSeconds = healthCheckTimeoutSeconds;
    }

    /**
     * <p>
     * The amount of time, in seconds, during which no response means a failed
     * health check.
     * </p>
     * 
     * @return The amount of time, in seconds, during which no response means a
     *         failed health check.
     */

    public Integer getHealthCheckTimeoutSeconds() {
        return this.healthCheckTimeoutSeconds;
    }

    /**
     * <p>
     * The amount of time, in seconds, during which no response means a failed
     * health check.
     * </p>
     * 
     * @param healthCheckTimeoutSeconds
     *        The amount of time, in seconds, during which no response means a
     *        failed health check.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyTargetGroupRequest withHealthCheckTimeoutSeconds(
            Integer healthCheckTimeoutSeconds) {
        setHealthCheckTimeoutSeconds(healthCheckTimeoutSeconds);
        return this;
    }

    /**
     * <p>
     * The number of consecutive health checks successes required before
     * considering an unhealthy target healthy.
     * </p>
     * 
     * @param healthyThresholdCount
     *        The number of consecutive health checks successes required before
     *        considering an unhealthy target healthy.
     */

    public void setHealthyThresholdCount(Integer healthyThresholdCount) {
        this.healthyThresholdCount = healthyThresholdCount;
    }

    /**
     * <p>
     * The number of consecutive health checks successes required before
     * considering an unhealthy target healthy.
     * </p>
     * 
     * @return The number of consecutive health checks successes required before
     *         considering an unhealthy target healthy.
     */

    public Integer getHealthyThresholdCount() {
        return this.healthyThresholdCount;
    }

    /**
     * <p>
     * The number of consecutive health checks successes required before
     * considering an unhealthy target healthy.
     * </p>
     * 
     * @param healthyThresholdCount
     *        The number of consecutive health checks successes required before
     *        considering an unhealthy target healthy.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyTargetGroupRequest withHealthyThresholdCount(
            Integer healthyThresholdCount) {
        setHealthyThresholdCount(healthyThresholdCount);
        return this;
    }

    /**
     * <p>
     * The number of consecutive health check failures required before
     * considering the target unhealthy.
     * </p>
     * 
     * @param unhealthyThresholdCount
     *        The number of consecutive health check failures required before
     *        considering the target unhealthy.
     */

    public void setUnhealthyThresholdCount(Integer unhealthyThresholdCount) {
        this.unhealthyThresholdCount = unhealthyThresholdCount;
    }

    /**
     * <p>
     * The number of consecutive health check failures required before
     * considering the target unhealthy.
     * </p>
     * 
     * @return The number of consecutive health check failures required before
     *         considering the target unhealthy.
     */

    public Integer getUnhealthyThresholdCount() {
        return this.unhealthyThresholdCount;
    }

    /**
     * <p>
     * The number of consecutive health check failures required before
     * considering the target unhealthy.
     * </p>
     * 
     * @param unhealthyThresholdCount
     *        The number of consecutive health check failures required before
     *        considering the target unhealthy.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyTargetGroupRequest withUnhealthyThresholdCount(
            Integer unhealthyThresholdCount) {
        setUnhealthyThresholdCount(unhealthyThresholdCount);
        return this;
    }

    /**
     * <p>
     * The HTTP codes to use when checking for a successful response from a
     * target.
     * </p>
     * 
     * @param matcher
     *        The HTTP codes to use when checking for a successful response from
     *        a target.
     */

    public void setMatcher(Matcher matcher) {
        this.matcher = matcher;
    }

    /**
     * <p>
     * The HTTP codes to use when checking for a successful response from a
     * target.
     * </p>
     * 
     * @return The HTTP codes to use when checking for a successful response
     *         from a target.
     */

    public Matcher getMatcher() {
        return this.matcher;
    }

    /**
     * <p>
     * The HTTP codes to use when checking for a successful response from a
     * target.
     * </p>
     * 
     * @param matcher
     *        The HTTP codes to use when checking for a successful response from
     *        a target.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyTargetGroupRequest withMatcher(Matcher matcher) {
        setMatcher(matcher);
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
        if (getHealthCheckProtocol() != null)
            sb.append("HealthCheckProtocol: " + getHealthCheckProtocol() + ",");
        if (getHealthCheckPort() != null)
            sb.append("HealthCheckPort: " + getHealthCheckPort() + ",");
        if (getHealthCheckPath() != null)
            sb.append("HealthCheckPath: " + getHealthCheckPath() + ",");
        if (getHealthCheckIntervalSeconds() != null)
            sb.append("HealthCheckIntervalSeconds: "
                    + getHealthCheckIntervalSeconds() + ",");
        if (getHealthCheckTimeoutSeconds() != null)
            sb.append("HealthCheckTimeoutSeconds: "
                    + getHealthCheckTimeoutSeconds() + ",");
        if (getHealthyThresholdCount() != null)
            sb.append("HealthyThresholdCount: " + getHealthyThresholdCount()
                    + ",");
        if (getUnhealthyThresholdCount() != null)
            sb.append("UnhealthyThresholdCount: "
                    + getUnhealthyThresholdCount() + ",");
        if (getMatcher() != null)
            sb.append("Matcher: " + getMatcher());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyTargetGroupRequest == false)
            return false;
        ModifyTargetGroupRequest other = (ModifyTargetGroupRequest) obj;
        if (other.getTargetGroupArn() == null
                ^ this.getTargetGroupArn() == null)
            return false;
        if (other.getTargetGroupArn() != null
                && other.getTargetGroupArn().equals(this.getTargetGroupArn()) == false)
            return false;
        if (other.getHealthCheckProtocol() == null
                ^ this.getHealthCheckProtocol() == null)
            return false;
        if (other.getHealthCheckProtocol() != null
                && other.getHealthCheckProtocol().equals(
                        this.getHealthCheckProtocol()) == false)
            return false;
        if (other.getHealthCheckPort() == null
                ^ this.getHealthCheckPort() == null)
            return false;
        if (other.getHealthCheckPort() != null
                && other.getHealthCheckPort().equals(this.getHealthCheckPort()) == false)
            return false;
        if (other.getHealthCheckPath() == null
                ^ this.getHealthCheckPath() == null)
            return false;
        if (other.getHealthCheckPath() != null
                && other.getHealthCheckPath().equals(this.getHealthCheckPath()) == false)
            return false;
        if (other.getHealthCheckIntervalSeconds() == null
                ^ this.getHealthCheckIntervalSeconds() == null)
            return false;
        if (other.getHealthCheckIntervalSeconds() != null
                && other.getHealthCheckIntervalSeconds().equals(
                        this.getHealthCheckIntervalSeconds()) == false)
            return false;
        if (other.getHealthCheckTimeoutSeconds() == null
                ^ this.getHealthCheckTimeoutSeconds() == null)
            return false;
        if (other.getHealthCheckTimeoutSeconds() != null
                && other.getHealthCheckTimeoutSeconds().equals(
                        this.getHealthCheckTimeoutSeconds()) == false)
            return false;
        if (other.getHealthyThresholdCount() == null
                ^ this.getHealthyThresholdCount() == null)
            return false;
        if (other.getHealthyThresholdCount() != null
                && other.getHealthyThresholdCount().equals(
                        this.getHealthyThresholdCount()) == false)
            return false;
        if (other.getUnhealthyThresholdCount() == null
                ^ this.getUnhealthyThresholdCount() == null)
            return false;
        if (other.getUnhealthyThresholdCount() != null
                && other.getUnhealthyThresholdCount().equals(
                        this.getUnhealthyThresholdCount()) == false)
            return false;
        if (other.getMatcher() == null ^ this.getMatcher() == null)
            return false;
        if (other.getMatcher() != null
                && other.getMatcher().equals(this.getMatcher()) == false)
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
        hashCode = prime
                * hashCode
                + ((getHealthCheckProtocol() == null) ? 0
                        : getHealthCheckProtocol().hashCode());
        hashCode = prime
                * hashCode
                + ((getHealthCheckPort() == null) ? 0 : getHealthCheckPort()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getHealthCheckPath() == null) ? 0 : getHealthCheckPath()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getHealthCheckIntervalSeconds() == null) ? 0
                        : getHealthCheckIntervalSeconds().hashCode());
        hashCode = prime
                * hashCode
                + ((getHealthCheckTimeoutSeconds() == null) ? 0
                        : getHealthCheckTimeoutSeconds().hashCode());
        hashCode = prime
                * hashCode
                + ((getHealthyThresholdCount() == null) ? 0
                        : getHealthyThresholdCount().hashCode());
        hashCode = prime
                * hashCode
                + ((getUnhealthyThresholdCount() == null) ? 0
                        : getUnhealthyThresholdCount().hashCode());
        hashCode = prime * hashCode
                + ((getMatcher() == null) ? 0 : getMatcher().hashCode());
        return hashCode;
    }

    @Override
    public ModifyTargetGroupRequest clone() {
        return (ModifyTargetGroupRequest) super.clone();
    }
}

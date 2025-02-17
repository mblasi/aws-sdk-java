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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a <i>ResetCacheParameterGroup</i> action.
 * </p>
 */
public class ResetCacheParameterGroupRequest extends
        com.amazonaws.AmazonWebServiceRequest implements Serializable,
        Cloneable {

    /**
     * <p>
     * The name of the cache parameter group to reset.
     * </p>
     */
    private String cacheParameterGroupName;
    /**
     * <p>
     * If <i>true</i>, all parameters in the cache parameter group will be reset
     * to their default values. If <i>false</i>, only the parameters listed by
     * <i>ParameterNameValues</i> are reset to their default values.
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     */
    private Boolean resetAllParameters;
    /**
     * <p>
     * An array of parameter names to reset to their default values. If
     * <i>ResetAllParameters</i> is <i>false</i>, you must specify the name of
     * at least one parameter to reset.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ParameterNameValue> parameterNameValues;

    /**
     * Default constructor for ResetCacheParameterGroupRequest object. Callers
     * should use the setter or fluent setter (with...) methods to initialize
     * the object after creating it.
     */
    public ResetCacheParameterGroupRequest() {
    }

    /**
     * Constructs a new ResetCacheParameterGroupRequest object. Callers should
     * use the setter or fluent setter (with...) methods to initialize any
     * additional object members.
     * 
     * @param cacheParameterGroupName
     *        The name of the cache parameter group to reset.
     * @param parameterNameValues
     *        An array of parameter names to reset to their default values. If
     *        <i>ResetAllParameters</i> is <i>false</i>, you must specify the
     *        name of at least one parameter to reset.
     */
    public ResetCacheParameterGroupRequest(String cacheParameterGroupName,
            java.util.List<ParameterNameValue> parameterNameValues) {
        setCacheParameterGroupName(cacheParameterGroupName);
        setParameterNameValues(parameterNameValues);
    }

    /**
     * <p>
     * The name of the cache parameter group to reset.
     * </p>
     * 
     * @param cacheParameterGroupName
     *        The name of the cache parameter group to reset.
     */

    public void setCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
    }

    /**
     * <p>
     * The name of the cache parameter group to reset.
     * </p>
     * 
     * @return The name of the cache parameter group to reset.
     */

    public String getCacheParameterGroupName() {
        return this.cacheParameterGroupName;
    }

    /**
     * <p>
     * The name of the cache parameter group to reset.
     * </p>
     * 
     * @param cacheParameterGroupName
     *        The name of the cache parameter group to reset.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ResetCacheParameterGroupRequest withCacheParameterGroupName(
            String cacheParameterGroupName) {
        setCacheParameterGroupName(cacheParameterGroupName);
        return this;
    }

    /**
     * <p>
     * If <i>true</i>, all parameters in the cache parameter group will be reset
     * to their default values. If <i>false</i>, only the parameters listed by
     * <i>ParameterNameValues</i> are reset to their default values.
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @param resetAllParameters
     *        If <i>true</i>, all parameters in the cache parameter group will
     *        be reset to their default values. If <i>false</i>, only the
     *        parameters listed by <i>ParameterNameValues</i> are reset to their
     *        default values.</p>
     *        <p>
     *        Valid values: <code>true</code> | <code>false</code>
     */

    public void setResetAllParameters(Boolean resetAllParameters) {
        this.resetAllParameters = resetAllParameters;
    }

    /**
     * <p>
     * If <i>true</i>, all parameters in the cache parameter group will be reset
     * to their default values. If <i>false</i>, only the parameters listed by
     * <i>ParameterNameValues</i> are reset to their default values.
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @return If <i>true</i>, all parameters in the cache parameter group will
     *         be reset to their default values. If <i>false</i>, only the
     *         parameters listed by <i>ParameterNameValues</i> are reset to
     *         their default values.</p>
     *         <p>
     *         Valid values: <code>true</code> | <code>false</code>
     */

    public Boolean getResetAllParameters() {
        return this.resetAllParameters;
    }

    /**
     * <p>
     * If <i>true</i>, all parameters in the cache parameter group will be reset
     * to their default values. If <i>false</i>, only the parameters listed by
     * <i>ParameterNameValues</i> are reset to their default values.
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @param resetAllParameters
     *        If <i>true</i>, all parameters in the cache parameter group will
     *        be reset to their default values. If <i>false</i>, only the
     *        parameters listed by <i>ParameterNameValues</i> are reset to their
     *        default values.</p>
     *        <p>
     *        Valid values: <code>true</code> | <code>false</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ResetCacheParameterGroupRequest withResetAllParameters(
            Boolean resetAllParameters) {
        setResetAllParameters(resetAllParameters);
        return this;
    }

    /**
     * <p>
     * If <i>true</i>, all parameters in the cache parameter group will be reset
     * to their default values. If <i>false</i>, only the parameters listed by
     * <i>ParameterNameValues</i> are reset to their default values.
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @return If <i>true</i>, all parameters in the cache parameter group will
     *         be reset to their default values. If <i>false</i>, only the
     *         parameters listed by <i>ParameterNameValues</i> are reset to
     *         their default values.</p>
     *         <p>
     *         Valid values: <code>true</code> | <code>false</code>
     */

    public Boolean isResetAllParameters() {
        return this.resetAllParameters;
    }

    /**
     * <p>
     * An array of parameter names to reset to their default values. If
     * <i>ResetAllParameters</i> is <i>false</i>, you must specify the name of
     * at least one parameter to reset.
     * </p>
     * 
     * @return An array of parameter names to reset to their default values. If
     *         <i>ResetAllParameters</i> is <i>false</i>, you must specify the
     *         name of at least one parameter to reset.
     */

    public java.util.List<ParameterNameValue> getParameterNameValues() {
        if (parameterNameValues == null) {
            parameterNameValues = new com.amazonaws.internal.SdkInternalList<ParameterNameValue>();
        }
        return parameterNameValues;
    }

    /**
     * <p>
     * An array of parameter names to reset to their default values. If
     * <i>ResetAllParameters</i> is <i>false</i>, you must specify the name of
     * at least one parameter to reset.
     * </p>
     * 
     * @param parameterNameValues
     *        An array of parameter names to reset to their default values. If
     *        <i>ResetAllParameters</i> is <i>false</i>, you must specify the
     *        name of at least one parameter to reset.
     */

    public void setParameterNameValues(
            java.util.Collection<ParameterNameValue> parameterNameValues) {
        if (parameterNameValues == null) {
            this.parameterNameValues = null;
            return;
        }

        this.parameterNameValues = new com.amazonaws.internal.SdkInternalList<ParameterNameValue>(
                parameterNameValues);
    }

    /**
     * <p>
     * An array of parameter names to reset to their default values. If
     * <i>ResetAllParameters</i> is <i>false</i>, you must specify the name of
     * at least one parameter to reset.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setParameterNameValues(java.util.Collection)} or
     * {@link #withParameterNameValues(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param parameterNameValues
     *        An array of parameter names to reset to their default values. If
     *        <i>ResetAllParameters</i> is <i>false</i>, you must specify the
     *        name of at least one parameter to reset.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ResetCacheParameterGroupRequest withParameterNameValues(
            ParameterNameValue... parameterNameValues) {
        if (this.parameterNameValues == null) {
            setParameterNameValues(new com.amazonaws.internal.SdkInternalList<ParameterNameValue>(
                    parameterNameValues.length));
        }
        for (ParameterNameValue ele : parameterNameValues) {
            this.parameterNameValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of parameter names to reset to their default values. If
     * <i>ResetAllParameters</i> is <i>false</i>, you must specify the name of
     * at least one parameter to reset.
     * </p>
     * 
     * @param parameterNameValues
     *        An array of parameter names to reset to their default values. If
     *        <i>ResetAllParameters</i> is <i>false</i>, you must specify the
     *        name of at least one parameter to reset.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ResetCacheParameterGroupRequest withParameterNameValues(
            java.util.Collection<ParameterNameValue> parameterNameValues) {
        setParameterNameValues(parameterNameValues);
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
        if (getCacheParameterGroupName() != null)
            sb.append("CacheParameterGroupName: "
                    + getCacheParameterGroupName() + ",");
        if (getResetAllParameters() != null)
            sb.append("ResetAllParameters: " + getResetAllParameters() + ",");
        if (getParameterNameValues() != null)
            sb.append("ParameterNameValues: " + getParameterNameValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResetCacheParameterGroupRequest == false)
            return false;
        ResetCacheParameterGroupRequest other = (ResetCacheParameterGroupRequest) obj;
        if (other.getCacheParameterGroupName() == null
                ^ this.getCacheParameterGroupName() == null)
            return false;
        if (other.getCacheParameterGroupName() != null
                && other.getCacheParameterGroupName().equals(
                        this.getCacheParameterGroupName()) == false)
            return false;
        if (other.getResetAllParameters() == null
                ^ this.getResetAllParameters() == null)
            return false;
        if (other.getResetAllParameters() != null
                && other.getResetAllParameters().equals(
                        this.getResetAllParameters()) == false)
            return false;
        if (other.getParameterNameValues() == null
                ^ this.getParameterNameValues() == null)
            return false;
        if (other.getParameterNameValues() != null
                && other.getParameterNameValues().equals(
                        this.getParameterNameValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCacheParameterGroupName() == null) ? 0
                        : getCacheParameterGroupName().hashCode());
        hashCode = prime
                * hashCode
                + ((getResetAllParameters() == null) ? 0
                        : getResetAllParameters().hashCode());
        hashCode = prime
                * hashCode
                + ((getParameterNameValues() == null) ? 0
                        : getParameterNameValues().hashCode());
        return hashCode;
    }

    @Override
    public ResetCacheParameterGroupRequest clone() {
        return (ResetCacheParameterGroupRequest) super.clone();
    }
}

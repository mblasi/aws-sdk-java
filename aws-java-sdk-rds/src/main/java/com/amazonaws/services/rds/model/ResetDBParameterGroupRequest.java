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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 */
public class ResetDBParameterGroupRequest extends
        com.amazonaws.AmazonWebServiceRequest implements Serializable,
        Cloneable {

    /**
     * <p>
     * The name of the DB parameter group.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     */
    private String dBParameterGroupName;
    /**
     * <p>
     * Specifies whether (<code>true</code>) or not (<code>false</code>) to
     * reset all parameters in the DB parameter group to default values.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     */
    private Boolean resetAllParameters;
    /**
     * <p>
     * An array of parameter names, values, and the apply method for the
     * parameter update. At least one parameter name, value, and apply method
     * must be supplied; subsequent arguments are optional. A maximum of 20
     * parameters can be modified in a single request.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Valid Values (for Apply method): <code>immediate</code> |
     * <code>pending-reboot</code>
     * </p>
     * <p>
     * You can use the immediate value with dynamic parameters only. You can use
     * the <code>pending-reboot</code> value for both dynamic and static
     * parameters, and changes are applied when DB instance reboots.
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Valid Values (for Apply method): <code>immediate</code> |
     * <code>pending-reboot</code>
     * </p>
     * <p>
     * You can use the immediate value with dynamic parameters only. You can use
     * the <code>pending-reboot</code> value for both dynamic and static
     * parameters, and changes are applied when DB instance reboots.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Valid Values (for Apply method): <code>pending-reboot</code>
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Parameter> parameters;

    /**
     * Default constructor for ResetDBParameterGroupRequest object. Callers
     * should use the setter or fluent setter (with...) methods to initialize
     * the object after creating it.
     */
    public ResetDBParameterGroupRequest() {
    }

    /**
     * Constructs a new ResetDBParameterGroupRequest object. Callers should use
     * the setter or fluent setter (with...) methods to initialize any
     * additional object members.
     * 
     * @param dBParameterGroupName
     *        The name of the DB parameter group.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 255 alphanumeric characters
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens
     *        </p>
     *        </li>
     */
    public ResetDBParameterGroupRequest(String dBParameterGroupName) {
        setDBParameterGroupName(dBParameterGroupName);
    }

    /**
     * <p>
     * The name of the DB parameter group.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBParameterGroupName
     *        The name of the DB parameter group.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 255 alphanumeric characters
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens
     *        </p>
     *        </li>
     */

    public void setDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB parameter group.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the DB parameter group.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be 1 to 255 alphanumeric characters
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot end with a hyphen or contain two consecutive hyphens
     *         </p>
     *         </li>
     */

    public String getDBParameterGroupName() {
        return this.dBParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB parameter group.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBParameterGroupName
     *        The name of the DB parameter group.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 255 alphanumeric characters
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ResetDBParameterGroupRequest withDBParameterGroupName(
            String dBParameterGroupName) {
        setDBParameterGroupName(dBParameterGroupName);
        return this;
    }

    /**
     * <p>
     * Specifies whether (<code>true</code>) or not (<code>false</code>) to
     * reset all parameters in the DB parameter group to default values.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @param resetAllParameters
     *        Specifies whether (<code>true</code>) or not (<code>false</code>)
     *        to reset all parameters in the DB parameter group to default
     *        values. </p>
     *        <p>
     *        Default: <code>true</code>
     */

    public void setResetAllParameters(Boolean resetAllParameters) {
        this.resetAllParameters = resetAllParameters;
    }

    /**
     * <p>
     * Specifies whether (<code>true</code>) or not (<code>false</code>) to
     * reset all parameters in the DB parameter group to default values.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @return Specifies whether (<code>true</code>) or not (<code>false</code>)
     *         to reset all parameters in the DB parameter group to default
     *         values. </p>
     *         <p>
     *         Default: <code>true</code>
     */

    public Boolean getResetAllParameters() {
        return this.resetAllParameters;
    }

    /**
     * <p>
     * Specifies whether (<code>true</code>) or not (<code>false</code>) to
     * reset all parameters in the DB parameter group to default values.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @param resetAllParameters
     *        Specifies whether (<code>true</code>) or not (<code>false</code>)
     *        to reset all parameters in the DB parameter group to default
     *        values. </p>
     *        <p>
     *        Default: <code>true</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ResetDBParameterGroupRequest withResetAllParameters(
            Boolean resetAllParameters) {
        setResetAllParameters(resetAllParameters);
        return this;
    }

    /**
     * <p>
     * Specifies whether (<code>true</code>) or not (<code>false</code>) to
     * reset all parameters in the DB parameter group to default values.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @return Specifies whether (<code>true</code>) or not (<code>false</code>)
     *         to reset all parameters in the DB parameter group to default
     *         values. </p>
     *         <p>
     *         Default: <code>true</code>
     */

    public Boolean isResetAllParameters() {
        return this.resetAllParameters;
    }

    /**
     * <p>
     * An array of parameter names, values, and the apply method for the
     * parameter update. At least one parameter name, value, and apply method
     * must be supplied; subsequent arguments are optional. A maximum of 20
     * parameters can be modified in a single request.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Valid Values (for Apply method): <code>immediate</code> |
     * <code>pending-reboot</code>
     * </p>
     * <p>
     * You can use the immediate value with dynamic parameters only. You can use
     * the <code>pending-reboot</code> value for both dynamic and static
     * parameters, and changes are applied when DB instance reboots.
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Valid Values (for Apply method): <code>immediate</code> |
     * <code>pending-reboot</code>
     * </p>
     * <p>
     * You can use the immediate value with dynamic parameters only. You can use
     * the <code>pending-reboot</code> value for both dynamic and static
     * parameters, and changes are applied when DB instance reboots.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Valid Values (for Apply method): <code>pending-reboot</code>
     * </p>
     * 
     * @return An array of parameter names, values, and the apply method for the
     *         parameter update. At least one parameter name, value, and apply
     *         method must be supplied; subsequent arguments are optional. A
     *         maximum of 20 parameters can be modified in a single request.</p>
     *         <p>
     *         <b>MySQL</b>
     *         </p>
     *         <p>
     *         Valid Values (for Apply method): <code>immediate</code> |
     *         <code>pending-reboot</code>
     *         </p>
     *         <p>
     *         You can use the immediate value with dynamic parameters only. You
     *         can use the <code>pending-reboot</code> value for both dynamic
     *         and static parameters, and changes are applied when DB instance
     *         reboots.
     *         </p>
     *         <p>
     *         <b>MariaDB</b>
     *         </p>
     *         <p>
     *         Valid Values (for Apply method): <code>immediate</code> |
     *         <code>pending-reboot</code>
     *         </p>
     *         <p>
     *         You can use the immediate value with dynamic parameters only. You
     *         can use the <code>pending-reboot</code> value for both dynamic
     *         and static parameters, and changes are applied when DB instance
     *         reboots.
     *         </p>
     *         <p>
     *         <b>Oracle</b>
     *         </p>
     *         <p>
     *         Valid Values (for Apply method): <code>pending-reboot</code>
     */

    public java.util.List<Parameter> getParameters() {
        if (parameters == null) {
            parameters = new com.amazonaws.internal.SdkInternalList<Parameter>();
        }
        return parameters;
    }

    /**
     * <p>
     * An array of parameter names, values, and the apply method for the
     * parameter update. At least one parameter name, value, and apply method
     * must be supplied; subsequent arguments are optional. A maximum of 20
     * parameters can be modified in a single request.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Valid Values (for Apply method): <code>immediate</code> |
     * <code>pending-reboot</code>
     * </p>
     * <p>
     * You can use the immediate value with dynamic parameters only. You can use
     * the <code>pending-reboot</code> value for both dynamic and static
     * parameters, and changes are applied when DB instance reboots.
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Valid Values (for Apply method): <code>immediate</code> |
     * <code>pending-reboot</code>
     * </p>
     * <p>
     * You can use the immediate value with dynamic parameters only. You can use
     * the <code>pending-reboot</code> value for both dynamic and static
     * parameters, and changes are applied when DB instance reboots.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Valid Values (for Apply method): <code>pending-reboot</code>
     * </p>
     * 
     * @param parameters
     *        An array of parameter names, values, and the apply method for the
     *        parameter update. At least one parameter name, value, and apply
     *        method must be supplied; subsequent arguments are optional. A
     *        maximum of 20 parameters can be modified in a single request.</p>
     *        <p>
     *        <b>MySQL</b>
     *        </p>
     *        <p>
     *        Valid Values (for Apply method): <code>immediate</code> |
     *        <code>pending-reboot</code>
     *        </p>
     *        <p>
     *        You can use the immediate value with dynamic parameters only. You
     *        can use the <code>pending-reboot</code> value for both dynamic and
     *        static parameters, and changes are applied when DB instance
     *        reboots.
     *        </p>
     *        <p>
     *        <b>MariaDB</b>
     *        </p>
     *        <p>
     *        Valid Values (for Apply method): <code>immediate</code> |
     *        <code>pending-reboot</code>
     *        </p>
     *        <p>
     *        You can use the immediate value with dynamic parameters only. You
     *        can use the <code>pending-reboot</code> value for both dynamic and
     *        static parameters, and changes are applied when DB instance
     *        reboots.
     *        </p>
     *        <p>
     *        <b>Oracle</b>
     *        </p>
     *        <p>
     *        Valid Values (for Apply method): <code>pending-reboot</code>
     */

    public void setParameters(java.util.Collection<Parameter> parameters) {
        if (parameters == null) {
            this.parameters = null;
            return;
        }

        this.parameters = new com.amazonaws.internal.SdkInternalList<Parameter>(
                parameters);
    }

    /**
     * <p>
     * An array of parameter names, values, and the apply method for the
     * parameter update. At least one parameter name, value, and apply method
     * must be supplied; subsequent arguments are optional. A maximum of 20
     * parameters can be modified in a single request.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Valid Values (for Apply method): <code>immediate</code> |
     * <code>pending-reboot</code>
     * </p>
     * <p>
     * You can use the immediate value with dynamic parameters only. You can use
     * the <code>pending-reboot</code> value for both dynamic and static
     * parameters, and changes are applied when DB instance reboots.
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Valid Values (for Apply method): <code>immediate</code> |
     * <code>pending-reboot</code>
     * </p>
     * <p>
     * You can use the immediate value with dynamic parameters only. You can use
     * the <code>pending-reboot</code> value for both dynamic and static
     * parameters, and changes are applied when DB instance reboots.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Valid Values (for Apply method): <code>pending-reboot</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setParameters(java.util.Collection)} or
     * {@link #withParameters(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param parameters
     *        An array of parameter names, values, and the apply method for the
     *        parameter update. At least one parameter name, value, and apply
     *        method must be supplied; subsequent arguments are optional. A
     *        maximum of 20 parameters can be modified in a single request.</p>
     *        <p>
     *        <b>MySQL</b>
     *        </p>
     *        <p>
     *        Valid Values (for Apply method): <code>immediate</code> |
     *        <code>pending-reboot</code>
     *        </p>
     *        <p>
     *        You can use the immediate value with dynamic parameters only. You
     *        can use the <code>pending-reboot</code> value for both dynamic and
     *        static parameters, and changes are applied when DB instance
     *        reboots.
     *        </p>
     *        <p>
     *        <b>MariaDB</b>
     *        </p>
     *        <p>
     *        Valid Values (for Apply method): <code>immediate</code> |
     *        <code>pending-reboot</code>
     *        </p>
     *        <p>
     *        You can use the immediate value with dynamic parameters only. You
     *        can use the <code>pending-reboot</code> value for both dynamic and
     *        static parameters, and changes are applied when DB instance
     *        reboots.
     *        </p>
     *        <p>
     *        <b>Oracle</b>
     *        </p>
     *        <p>
     *        Valid Values (for Apply method): <code>pending-reboot</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ResetDBParameterGroupRequest withParameters(Parameter... parameters) {
        if (this.parameters == null) {
            setParameters(new com.amazonaws.internal.SdkInternalList<Parameter>(
                    parameters.length));
        }
        for (Parameter ele : parameters) {
            this.parameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of parameter names, values, and the apply method for the
     * parameter update. At least one parameter name, value, and apply method
     * must be supplied; subsequent arguments are optional. A maximum of 20
     * parameters can be modified in a single request.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Valid Values (for Apply method): <code>immediate</code> |
     * <code>pending-reboot</code>
     * </p>
     * <p>
     * You can use the immediate value with dynamic parameters only. You can use
     * the <code>pending-reboot</code> value for both dynamic and static
     * parameters, and changes are applied when DB instance reboots.
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Valid Values (for Apply method): <code>immediate</code> |
     * <code>pending-reboot</code>
     * </p>
     * <p>
     * You can use the immediate value with dynamic parameters only. You can use
     * the <code>pending-reboot</code> value for both dynamic and static
     * parameters, and changes are applied when DB instance reboots.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Valid Values (for Apply method): <code>pending-reboot</code>
     * </p>
     * 
     * @param parameters
     *        An array of parameter names, values, and the apply method for the
     *        parameter update. At least one parameter name, value, and apply
     *        method must be supplied; subsequent arguments are optional. A
     *        maximum of 20 parameters can be modified in a single request.</p>
     *        <p>
     *        <b>MySQL</b>
     *        </p>
     *        <p>
     *        Valid Values (for Apply method): <code>immediate</code> |
     *        <code>pending-reboot</code>
     *        </p>
     *        <p>
     *        You can use the immediate value with dynamic parameters only. You
     *        can use the <code>pending-reboot</code> value for both dynamic and
     *        static parameters, and changes are applied when DB instance
     *        reboots.
     *        </p>
     *        <p>
     *        <b>MariaDB</b>
     *        </p>
     *        <p>
     *        Valid Values (for Apply method): <code>immediate</code> |
     *        <code>pending-reboot</code>
     *        </p>
     *        <p>
     *        You can use the immediate value with dynamic parameters only. You
     *        can use the <code>pending-reboot</code> value for both dynamic and
     *        static parameters, and changes are applied when DB instance
     *        reboots.
     *        </p>
     *        <p>
     *        <b>Oracle</b>
     *        </p>
     *        <p>
     *        Valid Values (for Apply method): <code>pending-reboot</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ResetDBParameterGroupRequest withParameters(
            java.util.Collection<Parameter> parameters) {
        setParameters(parameters);
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
        if (getDBParameterGroupName() != null)
            sb.append("DBParameterGroupName: " + getDBParameterGroupName()
                    + ",");
        if (getResetAllParameters() != null)
            sb.append("ResetAllParameters: " + getResetAllParameters() + ",");
        if (getParameters() != null)
            sb.append("Parameters: " + getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResetDBParameterGroupRequest == false)
            return false;
        ResetDBParameterGroupRequest other = (ResetDBParameterGroupRequest) obj;
        if (other.getDBParameterGroupName() == null
                ^ this.getDBParameterGroupName() == null)
            return false;
        if (other.getDBParameterGroupName() != null
                && other.getDBParameterGroupName().equals(
                        this.getDBParameterGroupName()) == false)
            return false;
        if (other.getResetAllParameters() == null
                ^ this.getResetAllParameters() == null)
            return false;
        if (other.getResetAllParameters() != null
                && other.getResetAllParameters().equals(
                        this.getResetAllParameters()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null
                && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDBParameterGroupName() == null) ? 0
                        : getDBParameterGroupName().hashCode());
        hashCode = prime
                * hashCode
                + ((getResetAllParameters() == null) ? 0
                        : getResetAllParameters().hashCode());
        hashCode = prime * hashCode
                + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public ResetDBParameterGroupRequest clone() {
        return (ResetDBParameterGroupRequest) super.clone();
    }
}

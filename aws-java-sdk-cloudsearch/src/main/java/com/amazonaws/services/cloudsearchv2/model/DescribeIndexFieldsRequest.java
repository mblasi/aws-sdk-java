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
package com.amazonaws.services.cloudsearchv2.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Container for the parameters to the <code><a>DescribeIndexFields</a></code>
 * operation. Specifies the name of the domain you want to describe. To restrict
 * the response to particular index fields, specify the names of the index
 * fields you want to describe. To show the active configuration and exclude any
 * pending changes, set the <code>Deployed</code> option to <code>true</code>.
 * </p>
 */
public class DescribeIndexFieldsRequest extends
        com.amazonaws.AmazonWebServiceRequest implements Serializable,
        Cloneable {

    /**
     * <p>
     * The name of the domain you want to describe.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * A list of the index fields you want to describe. If not specified,
     * information is returned for all configured index fields.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> fieldNames;
    /**
     * <p>
     * Whether to display the deployed configuration (<code>true</code>) or
     * include any pending changes (<code>false</code>). Defaults to
     * <code>false</code>.
     * </p>
     */
    private Boolean deployed;

    /**
     * <p>
     * The name of the domain you want to describe.
     * </p>
     * 
     * @param domainName
     *        The name of the domain you want to describe.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the domain you want to describe.
     * </p>
     * 
     * @return The name of the domain you want to describe.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The name of the domain you want to describe.
     * </p>
     * 
     * @param domainName
     *        The name of the domain you want to describe.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeIndexFieldsRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * A list of the index fields you want to describe. If not specified,
     * information is returned for all configured index fields.
     * </p>
     * 
     * @return A list of the index fields you want to describe. If not
     *         specified, information is returned for all configured index
     *         fields.
     */

    public java.util.List<String> getFieldNames() {
        if (fieldNames == null) {
            fieldNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return fieldNames;
    }

    /**
     * <p>
     * A list of the index fields you want to describe. If not specified,
     * information is returned for all configured index fields.
     * </p>
     * 
     * @param fieldNames
     *        A list of the index fields you want to describe. If not specified,
     *        information is returned for all configured index fields.
     */

    public void setFieldNames(java.util.Collection<String> fieldNames) {
        if (fieldNames == null) {
            this.fieldNames = null;
            return;
        }

        this.fieldNames = new com.amazonaws.internal.SdkInternalList<String>(
                fieldNames);
    }

    /**
     * <p>
     * A list of the index fields you want to describe. If not specified,
     * information is returned for all configured index fields.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setFieldNames(java.util.Collection)} or
     * {@link #withFieldNames(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param fieldNames
     *        A list of the index fields you want to describe. If not specified,
     *        information is returned for all configured index fields.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeIndexFieldsRequest withFieldNames(String... fieldNames) {
        if (this.fieldNames == null) {
            setFieldNames(new com.amazonaws.internal.SdkInternalList<String>(
                    fieldNames.length));
        }
        for (String ele : fieldNames) {
            this.fieldNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the index fields you want to describe. If not specified,
     * information is returned for all configured index fields.
     * </p>
     * 
     * @param fieldNames
     *        A list of the index fields you want to describe. If not specified,
     *        information is returned for all configured index fields.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeIndexFieldsRequest withFieldNames(
            java.util.Collection<String> fieldNames) {
        setFieldNames(fieldNames);
        return this;
    }

    /**
     * <p>
     * Whether to display the deployed configuration (<code>true</code>) or
     * include any pending changes (<code>false</code>). Defaults to
     * <code>false</code>.
     * </p>
     * 
     * @param deployed
     *        Whether to display the deployed configuration (<code>true</code>)
     *        or include any pending changes (<code>false</code>). Defaults to
     *        <code>false</code>.
     */

    public void setDeployed(Boolean deployed) {
        this.deployed = deployed;
    }

    /**
     * <p>
     * Whether to display the deployed configuration (<code>true</code>) or
     * include any pending changes (<code>false</code>). Defaults to
     * <code>false</code>.
     * </p>
     * 
     * @return Whether to display the deployed configuration (<code>true</code>)
     *         or include any pending changes (<code>false</code>). Defaults to
     *         <code>false</code>.
     */

    public Boolean getDeployed() {
        return this.deployed;
    }

    /**
     * <p>
     * Whether to display the deployed configuration (<code>true</code>) or
     * include any pending changes (<code>false</code>). Defaults to
     * <code>false</code>.
     * </p>
     * 
     * @param deployed
     *        Whether to display the deployed configuration (<code>true</code>)
     *        or include any pending changes (<code>false</code>). Defaults to
     *        <code>false</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeIndexFieldsRequest withDeployed(Boolean deployed) {
        setDeployed(deployed);
        return this;
    }

    /**
     * <p>
     * Whether to display the deployed configuration (<code>true</code>) or
     * include any pending changes (<code>false</code>). Defaults to
     * <code>false</code>.
     * </p>
     * 
     * @return Whether to display the deployed configuration (<code>true</code>)
     *         or include any pending changes (<code>false</code>). Defaults to
     *         <code>false</code>.
     */

    public Boolean isDeployed() {
        return this.deployed;
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
        if (getDomainName() != null)
            sb.append("DomainName: " + getDomainName() + ",");
        if (getFieldNames() != null)
            sb.append("FieldNames: " + getFieldNames() + ",");
        if (getDeployed() != null)
            sb.append("Deployed: " + getDeployed());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeIndexFieldsRequest == false)
            return false;
        DescribeIndexFieldsRequest other = (DescribeIndexFieldsRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getFieldNames() == null ^ this.getFieldNames() == null)
            return false;
        if (other.getFieldNames() != null
                && other.getFieldNames().equals(this.getFieldNames()) == false)
            return false;
        if (other.getDeployed() == null ^ this.getDeployed() == null)
            return false;
        if (other.getDeployed() != null
                && other.getDeployed().equals(this.getDeployed()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode
                + ((getFieldNames() == null) ? 0 : getFieldNames().hashCode());
        hashCode = prime * hashCode
                + ((getDeployed() == null) ? 0 : getDeployed().hashCode());
        return hashCode;
    }

    @Override
    public DescribeIndexFieldsRequest clone() {
        return (DescribeIndexFieldsRequest) super.clone();
    }
}

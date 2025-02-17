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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;

/**
 * <p>
 * Contains a list of AWS Lambda function configurations (see
 * <a>FunctionConfiguration</a>.
 * </p>
 */
public class ListFunctionsResult extends
        com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata>
        implements Serializable, Cloneable {

    /**
     * <p>
     * A string, present if there are more functions.
     * </p>
     */
    private String nextMarker;
    /**
     * <p>
     * A list of Lambda functions.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<FunctionConfiguration> functions;

    /**
     * <p>
     * A string, present if there are more functions.
     * </p>
     * 
     * @param nextMarker
     *        A string, present if there are more functions.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * A string, present if there are more functions.
     * </p>
     * 
     * @return A string, present if there are more functions.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * A string, present if there are more functions.
     * </p>
     * 
     * @param nextMarker
     *        A string, present if there are more functions.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListFunctionsResult withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
        return this;
    }

    /**
     * <p>
     * A list of Lambda functions.
     * </p>
     * 
     * @return A list of Lambda functions.
     */

    public java.util.List<FunctionConfiguration> getFunctions() {
        if (functions == null) {
            functions = new com.amazonaws.internal.SdkInternalList<FunctionConfiguration>();
        }
        return functions;
    }

    /**
     * <p>
     * A list of Lambda functions.
     * </p>
     * 
     * @param functions
     *        A list of Lambda functions.
     */

    public void setFunctions(
            java.util.Collection<FunctionConfiguration> functions) {
        if (functions == null) {
            this.functions = null;
            return;
        }

        this.functions = new com.amazonaws.internal.SdkInternalList<FunctionConfiguration>(
                functions);
    }

    /**
     * <p>
     * A list of Lambda functions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setFunctions(java.util.Collection)} or
     * {@link #withFunctions(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param functions
     *        A list of Lambda functions.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListFunctionsResult withFunctions(FunctionConfiguration... functions) {
        if (this.functions == null) {
            setFunctions(new com.amazonaws.internal.SdkInternalList<FunctionConfiguration>(
                    functions.length));
        }
        for (FunctionConfiguration ele : functions) {
            this.functions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of Lambda functions.
     * </p>
     * 
     * @param functions
     *        A list of Lambda functions.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListFunctionsResult withFunctions(
            java.util.Collection<FunctionConfiguration> functions) {
        setFunctions(functions);
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
        if (getNextMarker() != null)
            sb.append("NextMarker: " + getNextMarker() + ",");
        if (getFunctions() != null)
            sb.append("Functions: " + getFunctions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListFunctionsResult == false)
            return false;
        ListFunctionsResult other = (ListFunctionsResult) obj;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null
                && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        if (other.getFunctions() == null ^ this.getFunctions() == null)
            return false;
        if (other.getFunctions() != null
                && other.getFunctions().equals(this.getFunctions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        hashCode = prime * hashCode
                + ((getFunctions() == null) ? 0 : getFunctions().hashCode());
        return hashCode;
    }

    @Override
    public ListFunctionsResult clone() {
        try {
            return (ListFunctionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 */
public class GetFunctionConfigurationRequest extends
        com.amazonaws.AmazonWebServiceRequest implements Serializable,
        Cloneable {

    /**
     * <p>
     * The name of the Lambda function for which you want to retrieve the
     * configuration information.
     * </p>
     * <p>
     * You can specify a function name (for example, <code>Thumbnail</code>) or
     * you can specify Amazon Resource Name (ARN) of the function (for example,
     * <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS
     * Lambda also allows you to specify a partial ARN (for example,
     * <code>account-id:Thumbnail</code>). Note that the length constraint
     * applies only to the ARN. If you specify only the function name, it is
     * limited to 64 character in length.
     * </p>
     */
    private String functionName;
    /**
     * <p>
     * Using this optional parameter you can specify a function version or an
     * alias name. If you specify function version, the API uses qualified
     * function ARN and returns information about the specific function version.
     * If you specify an alias name, the API uses the alias ARN and returns
     * information about the function version to which the alias points.
     * </p>
     * <p>
     * If you don't specify this parameter, the API uses unqualified function
     * ARN, and returns information about the <code>$LATEST</code> function
     * version.
     * </p>
     */
    private String qualifier;

    /**
     * <p>
     * The name of the Lambda function for which you want to retrieve the
     * configuration information.
     * </p>
     * <p>
     * You can specify a function name (for example, <code>Thumbnail</code>) or
     * you can specify Amazon Resource Name (ARN) of the function (for example,
     * <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS
     * Lambda also allows you to specify a partial ARN (for example,
     * <code>account-id:Thumbnail</code>). Note that the length constraint
     * applies only to the ARN. If you specify only the function name, it is
     * limited to 64 character in length.
     * </p>
     * 
     * @param functionName
     *        The name of the Lambda function for which you want to retrieve the
     *        configuration information.</p>
     *        <p>
     *        You can specify a function name (for example,
     *        <code>Thumbnail</code>) or you can specify Amazon Resource Name
     *        (ARN) of the function (for example,
     *        <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>
     *        ). AWS Lambda also allows you to specify a partial ARN (for
     *        example, <code>account-id:Thumbnail</code>). Note that the length
     *        constraint applies only to the ARN. If you specify only the
     *        function name, it is limited to 64 character in length.
     */

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * <p>
     * The name of the Lambda function for which you want to retrieve the
     * configuration information.
     * </p>
     * <p>
     * You can specify a function name (for example, <code>Thumbnail</code>) or
     * you can specify Amazon Resource Name (ARN) of the function (for example,
     * <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS
     * Lambda also allows you to specify a partial ARN (for example,
     * <code>account-id:Thumbnail</code>). Note that the length constraint
     * applies only to the ARN. If you specify only the function name, it is
     * limited to 64 character in length.
     * </p>
     * 
     * @return The name of the Lambda function for which you want to retrieve
     *         the configuration information.</p>
     *         <p>
     *         You can specify a function name (for example,
     *         <code>Thumbnail</code>) or you can specify Amazon Resource Name
     *         (ARN) of the function (for example,
     *         <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>
     *         ). AWS Lambda also allows you to specify a partial ARN (for
     *         example, <code>account-id:Thumbnail</code>). Note that the length
     *         constraint applies only to the ARN. If you specify only the
     *         function name, it is limited to 64 character in length.
     */

    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * <p>
     * The name of the Lambda function for which you want to retrieve the
     * configuration information.
     * </p>
     * <p>
     * You can specify a function name (for example, <code>Thumbnail</code>) or
     * you can specify Amazon Resource Name (ARN) of the function (for example,
     * <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS
     * Lambda also allows you to specify a partial ARN (for example,
     * <code>account-id:Thumbnail</code>). Note that the length constraint
     * applies only to the ARN. If you specify only the function name, it is
     * limited to 64 character in length.
     * </p>
     * 
     * @param functionName
     *        The name of the Lambda function for which you want to retrieve the
     *        configuration information.</p>
     *        <p>
     *        You can specify a function name (for example,
     *        <code>Thumbnail</code>) or you can specify Amazon Resource Name
     *        (ARN) of the function (for example,
     *        <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>
     *        ). AWS Lambda also allows you to specify a partial ARN (for
     *        example, <code>account-id:Thumbnail</code>). Note that the length
     *        constraint applies only to the ARN. If you specify only the
     *        function name, it is limited to 64 character in length.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetFunctionConfigurationRequest withFunctionName(String functionName) {
        setFunctionName(functionName);
        return this;
    }

    /**
     * <p>
     * Using this optional parameter you can specify a function version or an
     * alias name. If you specify function version, the API uses qualified
     * function ARN and returns information about the specific function version.
     * If you specify an alias name, the API uses the alias ARN and returns
     * information about the function version to which the alias points.
     * </p>
     * <p>
     * If you don't specify this parameter, the API uses unqualified function
     * ARN, and returns information about the <code>$LATEST</code> function
     * version.
     * </p>
     * 
     * @param qualifier
     *        Using this optional parameter you can specify a function version
     *        or an alias name. If you specify function version, the API uses
     *        qualified function ARN and returns information about the specific
     *        function version. If you specify an alias name, the API uses the
     *        alias ARN and returns information about the function version to
     *        which the alias points.</p>
     *        <p>
     *        If you don't specify this parameter, the API uses unqualified
     *        function ARN, and returns information about the
     *        <code>$LATEST</code> function version.
     */

    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    /**
     * <p>
     * Using this optional parameter you can specify a function version or an
     * alias name. If you specify function version, the API uses qualified
     * function ARN and returns information about the specific function version.
     * If you specify an alias name, the API uses the alias ARN and returns
     * information about the function version to which the alias points.
     * </p>
     * <p>
     * If you don't specify this parameter, the API uses unqualified function
     * ARN, and returns information about the <code>$LATEST</code> function
     * version.
     * </p>
     * 
     * @return Using this optional parameter you can specify a function version
     *         or an alias name. If you specify function version, the API uses
     *         qualified function ARN and returns information about the specific
     *         function version. If you specify an alias name, the API uses the
     *         alias ARN and returns information about the function version to
     *         which the alias points.</p>
     *         <p>
     *         If you don't specify this parameter, the API uses unqualified
     *         function ARN, and returns information about the
     *         <code>$LATEST</code> function version.
     */

    public String getQualifier() {
        return this.qualifier;
    }

    /**
     * <p>
     * Using this optional parameter you can specify a function version or an
     * alias name. If you specify function version, the API uses qualified
     * function ARN and returns information about the specific function version.
     * If you specify an alias name, the API uses the alias ARN and returns
     * information about the function version to which the alias points.
     * </p>
     * <p>
     * If you don't specify this parameter, the API uses unqualified function
     * ARN, and returns information about the <code>$LATEST</code> function
     * version.
     * </p>
     * 
     * @param qualifier
     *        Using this optional parameter you can specify a function version
     *        or an alias name. If you specify function version, the API uses
     *        qualified function ARN and returns information about the specific
     *        function version. If you specify an alias name, the API uses the
     *        alias ARN and returns information about the function version to
     *        which the alias points.</p>
     *        <p>
     *        If you don't specify this parameter, the API uses unqualified
     *        function ARN, and returns information about the
     *        <code>$LATEST</code> function version.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetFunctionConfigurationRequest withQualifier(String qualifier) {
        setQualifier(qualifier);
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
        if (getFunctionName() != null)
            sb.append("FunctionName: " + getFunctionName() + ",");
        if (getQualifier() != null)
            sb.append("Qualifier: " + getQualifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFunctionConfigurationRequest == false)
            return false;
        GetFunctionConfigurationRequest other = (GetFunctionConfigurationRequest) obj;
        if (other.getFunctionName() == null ^ this.getFunctionName() == null)
            return false;
        if (other.getFunctionName() != null
                && other.getFunctionName().equals(this.getFunctionName()) == false)
            return false;
        if (other.getQualifier() == null ^ this.getQualifier() == null)
            return false;
        if (other.getQualifier() != null
                && other.getQualifier().equals(this.getQualifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getFunctionName() == null) ? 0 : getFunctionName()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getQualifier() == null) ? 0 : getQualifier().hashCode());
        return hashCode;
    }

    @Override
    public GetFunctionConfigurationRequest clone() {
        return (GetFunctionConfigurationRequest) super.clone();
    }
}

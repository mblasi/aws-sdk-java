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
 * A complex type that describes function metadata.
 * </p>
 */
public class PublishVersionResult extends
        com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata>
        implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the function.
     * </p>
     */
    private String functionName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) assigned to the function.
     * </p>
     */
    private String functionArn;
    /**
     * <p>
     * The runtime environment for the Lambda function.
     * </p>
     * <p>
     * To use the Node.js runtime v4.3, set the value to "nodejs4.3". To use
     * earlier runtime (v0.10.42), set the value to "nodejs".
     * </p>
     */
    private String runtime;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that Lambda assumes when
     * it executes your function to access any other Amazon Web Services (AWS)
     * resources.
     * </p>
     */
    private String role;
    /**
     * <p>
     * The function Lambda calls to begin executing your function.
     * </p>
     */
    private String handler;
    /**
     * <p>
     * The size, in bytes, of the function .zip file you uploaded.
     * </p>
     */
    private Long codeSize;
    /**
     * <p>
     * The user-provided description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The function execution time at which Lambda should terminate the
     * function. Because the execution time has cost implications, we recommend
     * you set this value based on your expected execution time. The default is
     * 3 seconds.
     * </p>
     */
    private Integer timeout;
    /**
     * <p>
     * The memory size, in MB, you configured for the function. Must be a
     * multiple of 64 MB.
     * </p>
     */
    private Integer memorySize;
    /**
     * <p>
     * The time stamp of the last time you updated the function.
     * </p>
     */
    private String lastModified;
    /**
     * <p>
     * It is the SHA256 hash of your function deployment package.
     * </p>
     */
    private String codeSha256;
    /**
     * <p>
     * The version of the Lambda function.
     * </p>
     */
    private String version;
    /**
     * <p>
     * VPC configuration associated with your Lambda function.
     * </p>
     */
    private VpcConfigResponse vpcConfig;

    /**
     * <p>
     * The name of the function.
     * </p>
     * 
     * @param functionName
     *        The name of the function.
     */

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * <p>
     * The name of the function.
     * </p>
     * 
     * @return The name of the function.
     */

    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * <p>
     * The name of the function.
     * </p>
     * 
     * @param functionName
     *        The name of the function.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PublishVersionResult withFunctionName(String functionName) {
        setFunctionName(functionName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) assigned to the function.
     * </p>
     * 
     * @param functionArn
     *        The Amazon Resource Name (ARN) assigned to the function.
     */

    public void setFunctionArn(String functionArn) {
        this.functionArn = functionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) assigned to the function.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) assigned to the function.
     */

    public String getFunctionArn() {
        return this.functionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) assigned to the function.
     * </p>
     * 
     * @param functionArn
     *        The Amazon Resource Name (ARN) assigned to the function.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PublishVersionResult withFunctionArn(String functionArn) {
        setFunctionArn(functionArn);
        return this;
    }

    /**
     * <p>
     * The runtime environment for the Lambda function.
     * </p>
     * <p>
     * To use the Node.js runtime v4.3, set the value to "nodejs4.3". To use
     * earlier runtime (v0.10.42), set the value to "nodejs".
     * </p>
     * 
     * @param runtime
     *        The runtime environment for the Lambda function.</p>
     *        <p>
     *        To use the Node.js runtime v4.3, set the value to "nodejs4.3". To
     *        use earlier runtime (v0.10.42), set the value to "nodejs".
     * @see Runtime
     */

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    /**
     * <p>
     * The runtime environment for the Lambda function.
     * </p>
     * <p>
     * To use the Node.js runtime v4.3, set the value to "nodejs4.3". To use
     * earlier runtime (v0.10.42), set the value to "nodejs".
     * </p>
     * 
     * @return The runtime environment for the Lambda function.</p>
     *         <p>
     *         To use the Node.js runtime v4.3, set the value to "nodejs4.3". To
     *         use earlier runtime (v0.10.42), set the value to "nodejs".
     * @see Runtime
     */

    public String getRuntime() {
        return this.runtime;
    }

    /**
     * <p>
     * The runtime environment for the Lambda function.
     * </p>
     * <p>
     * To use the Node.js runtime v4.3, set the value to "nodejs4.3". To use
     * earlier runtime (v0.10.42), set the value to "nodejs".
     * </p>
     * 
     * @param runtime
     *        The runtime environment for the Lambda function.</p>
     *        <p>
     *        To use the Node.js runtime v4.3, set the value to "nodejs4.3". To
     *        use earlier runtime (v0.10.42), set the value to "nodejs".
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see Runtime
     */

    public PublishVersionResult withRuntime(String runtime) {
        setRuntime(runtime);
        return this;
    }

    /**
     * <p>
     * The runtime environment for the Lambda function.
     * </p>
     * <p>
     * To use the Node.js runtime v4.3, set the value to "nodejs4.3". To use
     * earlier runtime (v0.10.42), set the value to "nodejs".
     * </p>
     * 
     * @param runtime
     *        The runtime environment for the Lambda function.</p>
     *        <p>
     *        To use the Node.js runtime v4.3, set the value to "nodejs4.3". To
     *        use earlier runtime (v0.10.42), set the value to "nodejs".
     * @see Runtime
     */

    public void setRuntime(Runtime runtime) {
        this.runtime = runtime.toString();
    }

    /**
     * <p>
     * The runtime environment for the Lambda function.
     * </p>
     * <p>
     * To use the Node.js runtime v4.3, set the value to "nodejs4.3". To use
     * earlier runtime (v0.10.42), set the value to "nodejs".
     * </p>
     * 
     * @param runtime
     *        The runtime environment for the Lambda function.</p>
     *        <p>
     *        To use the Node.js runtime v4.3, set the value to "nodejs4.3". To
     *        use earlier runtime (v0.10.42), set the value to "nodejs".
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see Runtime
     */

    public PublishVersionResult withRuntime(Runtime runtime) {
        setRuntime(runtime);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that Lambda assumes when
     * it executes your function to access any other Amazon Web Services (AWS)
     * resources.
     * </p>
     * 
     * @param role
     *        The Amazon Resource Name (ARN) of the IAM role that Lambda assumes
     *        when it executes your function to access any other Amazon Web
     *        Services (AWS) resources.
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that Lambda assumes when
     * it executes your function to access any other Amazon Web Services (AWS)
     * resources.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role that Lambda
     *         assumes when it executes your function to access any other Amazon
     *         Web Services (AWS) resources.
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that Lambda assumes when
     * it executes your function to access any other Amazon Web Services (AWS)
     * resources.
     * </p>
     * 
     * @param role
     *        The Amazon Resource Name (ARN) of the IAM role that Lambda assumes
     *        when it executes your function to access any other Amazon Web
     *        Services (AWS) resources.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PublishVersionResult withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * The function Lambda calls to begin executing your function.
     * </p>
     * 
     * @param handler
     *        The function Lambda calls to begin executing your function.
     */

    public void setHandler(String handler) {
        this.handler = handler;
    }

    /**
     * <p>
     * The function Lambda calls to begin executing your function.
     * </p>
     * 
     * @return The function Lambda calls to begin executing your function.
     */

    public String getHandler() {
        return this.handler;
    }

    /**
     * <p>
     * The function Lambda calls to begin executing your function.
     * </p>
     * 
     * @param handler
     *        The function Lambda calls to begin executing your function.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PublishVersionResult withHandler(String handler) {
        setHandler(handler);
        return this;
    }

    /**
     * <p>
     * The size, in bytes, of the function .zip file you uploaded.
     * </p>
     * 
     * @param codeSize
     *        The size, in bytes, of the function .zip file you uploaded.
     */

    public void setCodeSize(Long codeSize) {
        this.codeSize = codeSize;
    }

    /**
     * <p>
     * The size, in bytes, of the function .zip file you uploaded.
     * </p>
     * 
     * @return The size, in bytes, of the function .zip file you uploaded.
     */

    public Long getCodeSize() {
        return this.codeSize;
    }

    /**
     * <p>
     * The size, in bytes, of the function .zip file you uploaded.
     * </p>
     * 
     * @param codeSize
     *        The size, in bytes, of the function .zip file you uploaded.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PublishVersionResult withCodeSize(Long codeSize) {
        setCodeSize(codeSize);
        return this;
    }

    /**
     * <p>
     * The user-provided description.
     * </p>
     * 
     * @param description
     *        The user-provided description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The user-provided description.
     * </p>
     * 
     * @return The user-provided description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The user-provided description.
     * </p>
     * 
     * @param description
     *        The user-provided description.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PublishVersionResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The function execution time at which Lambda should terminate the
     * function. Because the execution time has cost implications, we recommend
     * you set this value based on your expected execution time. The default is
     * 3 seconds.
     * </p>
     * 
     * @param timeout
     *        The function execution time at which Lambda should terminate the
     *        function. Because the execution time has cost implications, we
     *        recommend you set this value based on your expected execution
     *        time. The default is 3 seconds.
     */

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    /**
     * <p>
     * The function execution time at which Lambda should terminate the
     * function. Because the execution time has cost implications, we recommend
     * you set this value based on your expected execution time. The default is
     * 3 seconds.
     * </p>
     * 
     * @return The function execution time at which Lambda should terminate the
     *         function. Because the execution time has cost implications, we
     *         recommend you set this value based on your expected execution
     *         time. The default is 3 seconds.
     */

    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * <p>
     * The function execution time at which Lambda should terminate the
     * function. Because the execution time has cost implications, we recommend
     * you set this value based on your expected execution time. The default is
     * 3 seconds.
     * </p>
     * 
     * @param timeout
     *        The function execution time at which Lambda should terminate the
     *        function. Because the execution time has cost implications, we
     *        recommend you set this value based on your expected execution
     *        time. The default is 3 seconds.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PublishVersionResult withTimeout(Integer timeout) {
        setTimeout(timeout);
        return this;
    }

    /**
     * <p>
     * The memory size, in MB, you configured for the function. Must be a
     * multiple of 64 MB.
     * </p>
     * 
     * @param memorySize
     *        The memory size, in MB, you configured for the function. Must be a
     *        multiple of 64 MB.
     */

    public void setMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
    }

    /**
     * <p>
     * The memory size, in MB, you configured for the function. Must be a
     * multiple of 64 MB.
     * </p>
     * 
     * @return The memory size, in MB, you configured for the function. Must be
     *         a multiple of 64 MB.
     */

    public Integer getMemorySize() {
        return this.memorySize;
    }

    /**
     * <p>
     * The memory size, in MB, you configured for the function. Must be a
     * multiple of 64 MB.
     * </p>
     * 
     * @param memorySize
     *        The memory size, in MB, you configured for the function. Must be a
     *        multiple of 64 MB.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PublishVersionResult withMemorySize(Integer memorySize) {
        setMemorySize(memorySize);
        return this;
    }

    /**
     * <p>
     * The time stamp of the last time you updated the function.
     * </p>
     * 
     * @param lastModified
     *        The time stamp of the last time you updated the function.
     */

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * <p>
     * The time stamp of the last time you updated the function.
     * </p>
     * 
     * @return The time stamp of the last time you updated the function.
     */

    public String getLastModified() {
        return this.lastModified;
    }

    /**
     * <p>
     * The time stamp of the last time you updated the function.
     * </p>
     * 
     * @param lastModified
     *        The time stamp of the last time you updated the function.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PublishVersionResult withLastModified(String lastModified) {
        setLastModified(lastModified);
        return this;
    }

    /**
     * <p>
     * It is the SHA256 hash of your function deployment package.
     * </p>
     * 
     * @param codeSha256
     *        It is the SHA256 hash of your function deployment package.
     */

    public void setCodeSha256(String codeSha256) {
        this.codeSha256 = codeSha256;
    }

    /**
     * <p>
     * It is the SHA256 hash of your function deployment package.
     * </p>
     * 
     * @return It is the SHA256 hash of your function deployment package.
     */

    public String getCodeSha256() {
        return this.codeSha256;
    }

    /**
     * <p>
     * It is the SHA256 hash of your function deployment package.
     * </p>
     * 
     * @param codeSha256
     *        It is the SHA256 hash of your function deployment package.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PublishVersionResult withCodeSha256(String codeSha256) {
        setCodeSha256(codeSha256);
        return this;
    }

    /**
     * <p>
     * The version of the Lambda function.
     * </p>
     * 
     * @param version
     *        The version of the Lambda function.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the Lambda function.
     * </p>
     * 
     * @return The version of the Lambda function.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the Lambda function.
     * </p>
     * 
     * @param version
     *        The version of the Lambda function.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PublishVersionResult withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * VPC configuration associated with your Lambda function.
     * </p>
     * 
     * @param vpcConfig
     *        VPC configuration associated with your Lambda function.
     */

    public void setVpcConfig(VpcConfigResponse vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * <p>
     * VPC configuration associated with your Lambda function.
     * </p>
     * 
     * @return VPC configuration associated with your Lambda function.
     */

    public VpcConfigResponse getVpcConfig() {
        return this.vpcConfig;
    }

    /**
     * <p>
     * VPC configuration associated with your Lambda function.
     * </p>
     * 
     * @param vpcConfig
     *        VPC configuration associated with your Lambda function.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PublishVersionResult withVpcConfig(VpcConfigResponse vpcConfig) {
        setVpcConfig(vpcConfig);
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
        if (getFunctionArn() != null)
            sb.append("FunctionArn: " + getFunctionArn() + ",");
        if (getRuntime() != null)
            sb.append("Runtime: " + getRuntime() + ",");
        if (getRole() != null)
            sb.append("Role: " + getRole() + ",");
        if (getHandler() != null)
            sb.append("Handler: " + getHandler() + ",");
        if (getCodeSize() != null)
            sb.append("CodeSize: " + getCodeSize() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getTimeout() != null)
            sb.append("Timeout: " + getTimeout() + ",");
        if (getMemorySize() != null)
            sb.append("MemorySize: " + getMemorySize() + ",");
        if (getLastModified() != null)
            sb.append("LastModified: " + getLastModified() + ",");
        if (getCodeSha256() != null)
            sb.append("CodeSha256: " + getCodeSha256() + ",");
        if (getVersion() != null)
            sb.append("Version: " + getVersion() + ",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: " + getVpcConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PublishVersionResult == false)
            return false;
        PublishVersionResult other = (PublishVersionResult) obj;
        if (other.getFunctionName() == null ^ this.getFunctionName() == null)
            return false;
        if (other.getFunctionName() != null
                && other.getFunctionName().equals(this.getFunctionName()) == false)
            return false;
        if (other.getFunctionArn() == null ^ this.getFunctionArn() == null)
            return false;
        if (other.getFunctionArn() != null
                && other.getFunctionArn().equals(this.getFunctionArn()) == false)
            return false;
        if (other.getRuntime() == null ^ this.getRuntime() == null)
            return false;
        if (other.getRuntime() != null
                && other.getRuntime().equals(this.getRuntime()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null
                && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getHandler() == null ^ this.getHandler() == null)
            return false;
        if (other.getHandler() != null
                && other.getHandler().equals(this.getHandler()) == false)
            return false;
        if (other.getCodeSize() == null ^ this.getCodeSize() == null)
            return false;
        if (other.getCodeSize() != null
                && other.getCodeSize().equals(this.getCodeSize()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTimeout() == null ^ this.getTimeout() == null)
            return false;
        if (other.getTimeout() != null
                && other.getTimeout().equals(this.getTimeout()) == false)
            return false;
        if (other.getMemorySize() == null ^ this.getMemorySize() == null)
            return false;
        if (other.getMemorySize() != null
                && other.getMemorySize().equals(this.getMemorySize()) == false)
            return false;
        if (other.getLastModified() == null ^ this.getLastModified() == null)
            return false;
        if (other.getLastModified() != null
                && other.getLastModified().equals(this.getLastModified()) == false)
            return false;
        if (other.getCodeSha256() == null ^ this.getCodeSha256() == null)
            return false;
        if (other.getCodeSha256() != null
                && other.getCodeSha256().equals(this.getCodeSha256()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null
                && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null
                && other.getVpcConfig().equals(this.getVpcConfig()) == false)
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
        hashCode = prime
                * hashCode
                + ((getFunctionArn() == null) ? 0 : getFunctionArn().hashCode());
        hashCode = prime * hashCode
                + ((getRuntime() == null) ? 0 : getRuntime().hashCode());
        hashCode = prime * hashCode
                + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode
                + ((getHandler() == null) ? 0 : getHandler().hashCode());
        hashCode = prime * hashCode
                + ((getCodeSize() == null) ? 0 : getCodeSize().hashCode());
        hashCode = prime
                * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getTimeout() == null) ? 0 : getTimeout().hashCode());
        hashCode = prime * hashCode
                + ((getMemorySize() == null) ? 0 : getMemorySize().hashCode());
        hashCode = prime
                * hashCode
                + ((getLastModified() == null) ? 0 : getLastModified()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getCodeSha256() == null) ? 0 : getCodeSha256().hashCode());
        hashCode = prime * hashCode
                + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode
                + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        return hashCode;
    }

    @Override
    public PublishVersionResult clone() {
        try {
            return (PublishVersionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

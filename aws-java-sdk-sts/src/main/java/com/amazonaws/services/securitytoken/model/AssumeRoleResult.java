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
package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the response to a successful <a>AssumeRole</a> request, including
 * temporary AWS credentials that can be used to make AWS requests.
 * </p>
 */
public class AssumeRoleResult extends
        com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata>
        implements Serializable, Cloneable {

    /**
     * <p>
     * The temporary security credentials, which include an access key ID, a
     * secret access key, and a security (or session) token.
     * </p>
     * <p>
     * <b>Note:</b> The size of the security token that STS APIs return is not
     * fixed. We strongly recommend that you make no assumptions about the
     * maximum size. As of this writing, the typical size is less than 4096
     * bytes, but that can vary. Also, future updates to AWS might require
     * larger sizes.
     * </p>
     */
    private Credentials credentials;
    /**
     * <p>
     * The Amazon Resource Name (ARN) and the assumed role ID, which are
     * identifiers that you can use to refer to the resulting temporary security
     * credentials. For example, you can reference these credentials as a
     * principal in a resource-based policy by using the ARN or assumed role ID.
     * The ARN and ID include the <code>RoleSessionName</code> that you
     * specified when you called <code>AssumeRole</code>.
     * </p>
     */
    private AssumedRoleUser assumedRoleUser;
    /**
     * <p>
     * A percentage value that indicates the size of the policy in packed form.
     * The service rejects any policy with a packed size greater than 100
     * percent, which means the policy exceeded the allowed space.
     * </p>
     */
    private Integer packedPolicySize;

    /**
     * <p>
     * The temporary security credentials, which include an access key ID, a
     * secret access key, and a security (or session) token.
     * </p>
     * <p>
     * <b>Note:</b> The size of the security token that STS APIs return is not
     * fixed. We strongly recommend that you make no assumptions about the
     * maximum size. As of this writing, the typical size is less than 4096
     * bytes, but that can vary. Also, future updates to AWS might require
     * larger sizes.
     * </p>
     * 
     * @param credentials
     *        The temporary security credentials, which include an access key
     *        ID, a secret access key, and a security (or session) token.</p>
     *        <p>
     *        <b>Note:</b> The size of the security token that STS APIs return
     *        is not fixed. We strongly recommend that you make no assumptions
     *        about the maximum size. As of this writing, the typical size is
     *        less than 4096 bytes, but that can vary. Also, future updates to
     *        AWS might require larger sizes.
     */

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    /**
     * <p>
     * The temporary security credentials, which include an access key ID, a
     * secret access key, and a security (or session) token.
     * </p>
     * <p>
     * <b>Note:</b> The size of the security token that STS APIs return is not
     * fixed. We strongly recommend that you make no assumptions about the
     * maximum size. As of this writing, the typical size is less than 4096
     * bytes, but that can vary. Also, future updates to AWS might require
     * larger sizes.
     * </p>
     * 
     * @return The temporary security credentials, which include an access key
     *         ID, a secret access key, and a security (or session) token.</p>
     *         <p>
     *         <b>Note:</b> The size of the security token that STS APIs return
     *         is not fixed. We strongly recommend that you make no assumptions
     *         about the maximum size. As of this writing, the typical size is
     *         less than 4096 bytes, but that can vary. Also, future updates to
     *         AWS might require larger sizes.
     */

    public Credentials getCredentials() {
        return this.credentials;
    }

    /**
     * <p>
     * The temporary security credentials, which include an access key ID, a
     * secret access key, and a security (or session) token.
     * </p>
     * <p>
     * <b>Note:</b> The size of the security token that STS APIs return is not
     * fixed. We strongly recommend that you make no assumptions about the
     * maximum size. As of this writing, the typical size is less than 4096
     * bytes, but that can vary. Also, future updates to AWS might require
     * larger sizes.
     * </p>
     * 
     * @param credentials
     *        The temporary security credentials, which include an access key
     *        ID, a secret access key, and a security (or session) token.</p>
     *        <p>
     *        <b>Note:</b> The size of the security token that STS APIs return
     *        is not fixed. We strongly recommend that you make no assumptions
     *        about the maximum size. As of this writing, the typical size is
     *        less than 4096 bytes, but that can vary. Also, future updates to
     *        AWS might require larger sizes.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public AssumeRoleResult withCredentials(Credentials credentials) {
        setCredentials(credentials);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) and the assumed role ID, which are
     * identifiers that you can use to refer to the resulting temporary security
     * credentials. For example, you can reference these credentials as a
     * principal in a resource-based policy by using the ARN or assumed role ID.
     * The ARN and ID include the <code>RoleSessionName</code> that you
     * specified when you called <code>AssumeRole</code>.
     * </p>
     * 
     * @param assumedRoleUser
     *        The Amazon Resource Name (ARN) and the assumed role ID, which are
     *        identifiers that you can use to refer to the resulting temporary
     *        security credentials. For example, you can reference these
     *        credentials as a principal in a resource-based policy by using the
     *        ARN or assumed role ID. The ARN and ID include the
     *        <code>RoleSessionName</code> that you specified when you called
     *        <code>AssumeRole</code>.
     */

    public void setAssumedRoleUser(AssumedRoleUser assumedRoleUser) {
        this.assumedRoleUser = assumedRoleUser;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) and the assumed role ID, which are
     * identifiers that you can use to refer to the resulting temporary security
     * credentials. For example, you can reference these credentials as a
     * principal in a resource-based policy by using the ARN or assumed role ID.
     * The ARN and ID include the <code>RoleSessionName</code> that you
     * specified when you called <code>AssumeRole</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) and the assumed role ID, which are
     *         identifiers that you can use to refer to the resulting temporary
     *         security credentials. For example, you can reference these
     *         credentials as a principal in a resource-based policy by using
     *         the ARN or assumed role ID. The ARN and ID include the
     *         <code>RoleSessionName</code> that you specified when you called
     *         <code>AssumeRole</code>.
     */

    public AssumedRoleUser getAssumedRoleUser() {
        return this.assumedRoleUser;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) and the assumed role ID, which are
     * identifiers that you can use to refer to the resulting temporary security
     * credentials. For example, you can reference these credentials as a
     * principal in a resource-based policy by using the ARN or assumed role ID.
     * The ARN and ID include the <code>RoleSessionName</code> that you
     * specified when you called <code>AssumeRole</code>.
     * </p>
     * 
     * @param assumedRoleUser
     *        The Amazon Resource Name (ARN) and the assumed role ID, which are
     *        identifiers that you can use to refer to the resulting temporary
     *        security credentials. For example, you can reference these
     *        credentials as a principal in a resource-based policy by using the
     *        ARN or assumed role ID. The ARN and ID include the
     *        <code>RoleSessionName</code> that you specified when you called
     *        <code>AssumeRole</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public AssumeRoleResult withAssumedRoleUser(AssumedRoleUser assumedRoleUser) {
        setAssumedRoleUser(assumedRoleUser);
        return this;
    }

    /**
     * <p>
     * A percentage value that indicates the size of the policy in packed form.
     * The service rejects any policy with a packed size greater than 100
     * percent, which means the policy exceeded the allowed space.
     * </p>
     * 
     * @param packedPolicySize
     *        A percentage value that indicates the size of the policy in packed
     *        form. The service rejects any policy with a packed size greater
     *        than 100 percent, which means the policy exceeded the allowed
     *        space.
     */

    public void setPackedPolicySize(Integer packedPolicySize) {
        this.packedPolicySize = packedPolicySize;
    }

    /**
     * <p>
     * A percentage value that indicates the size of the policy in packed form.
     * The service rejects any policy with a packed size greater than 100
     * percent, which means the policy exceeded the allowed space.
     * </p>
     * 
     * @return A percentage value that indicates the size of the policy in
     *         packed form. The service rejects any policy with a packed size
     *         greater than 100 percent, which means the policy exceeded the
     *         allowed space.
     */

    public Integer getPackedPolicySize() {
        return this.packedPolicySize;
    }

    /**
     * <p>
     * A percentage value that indicates the size of the policy in packed form.
     * The service rejects any policy with a packed size greater than 100
     * percent, which means the policy exceeded the allowed space.
     * </p>
     * 
     * @param packedPolicySize
     *        A percentage value that indicates the size of the policy in packed
     *        form. The service rejects any policy with a packed size greater
     *        than 100 percent, which means the policy exceeded the allowed
     *        space.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public AssumeRoleResult withPackedPolicySize(Integer packedPolicySize) {
        setPackedPolicySize(packedPolicySize);
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
        if (getCredentials() != null)
            sb.append("Credentials: " + getCredentials() + ",");
        if (getAssumedRoleUser() != null)
            sb.append("AssumedRoleUser: " + getAssumedRoleUser() + ",");
        if (getPackedPolicySize() != null)
            sb.append("PackedPolicySize: " + getPackedPolicySize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssumeRoleResult == false)
            return false;
        AssumeRoleResult other = (AssumeRoleResult) obj;
        if (other.getCredentials() == null ^ this.getCredentials() == null)
            return false;
        if (other.getCredentials() != null
                && other.getCredentials().equals(this.getCredentials()) == false)
            return false;
        if (other.getAssumedRoleUser() == null
                ^ this.getAssumedRoleUser() == null)
            return false;
        if (other.getAssumedRoleUser() != null
                && other.getAssumedRoleUser().equals(this.getAssumedRoleUser()) == false)
            return false;
        if (other.getPackedPolicySize() == null
                ^ this.getPackedPolicySize() == null)
            return false;
        if (other.getPackedPolicySize() != null
                && other.getPackedPolicySize().equals(
                        this.getPackedPolicySize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCredentials() == null) ? 0 : getCredentials().hashCode());
        hashCode = prime
                * hashCode
                + ((getAssumedRoleUser() == null) ? 0 : getAssumedRoleUser()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getPackedPolicySize() == null) ? 0 : getPackedPolicySize()
                        .hashCode());
        return hashCode;
    }

    @Override
    public AssumeRoleResult clone() {
        try {
            return (AssumeRoleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

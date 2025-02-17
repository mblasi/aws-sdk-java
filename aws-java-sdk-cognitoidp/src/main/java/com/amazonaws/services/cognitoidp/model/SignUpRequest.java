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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the request to register a user.
 * </p>
 */
public class SignUpRequest extends com.amazonaws.AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the client associated with the user pool.
     * </p>
     */
    private String clientId;
    /**
     * <p>
     * A keyed-hash message authentication code (HMAC) calculated using the
     * secret key of a user pool client and username plus the client ID in the
     * message.
     * </p>
     */
    private String secretHash;
    /**
     * <p>
     * The user name of the user you wish to register.
     * </p>
     */
    private String username;
    /**
     * <p>
     * The password of the user you wish to register.
     * </p>
     */
    private String password;
    /**
     * <p>
     * An array of name-value pairs representing user attributes.
     * </p>
     */
    private java.util.List<AttributeType> userAttributes;
    /**
     * <p>
     * The validation data in the request to register a user.
     * </p>
     */
    private java.util.List<AttributeType> validationData;

    /**
     * <p>
     * The ID of the client associated with the user pool.
     * </p>
     * 
     * @param clientId
     *        The ID of the client associated with the user pool.
     */

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * The ID of the client associated with the user pool.
     * </p>
     * 
     * @return The ID of the client associated with the user pool.
     */

    public String getClientId() {
        return this.clientId;
    }

    /**
     * <p>
     * The ID of the client associated with the user pool.
     * </p>
     * 
     * @param clientId
     *        The ID of the client associated with the user pool.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public SignUpRequest withClientId(String clientId) {
        setClientId(clientId);
        return this;
    }

    /**
     * <p>
     * A keyed-hash message authentication code (HMAC) calculated using the
     * secret key of a user pool client and username plus the client ID in the
     * message.
     * </p>
     * 
     * @param secretHash
     *        A keyed-hash message authentication code (HMAC) calculated using
     *        the secret key of a user pool client and username plus the client
     *        ID in the message.
     */

    public void setSecretHash(String secretHash) {
        this.secretHash = secretHash;
    }

    /**
     * <p>
     * A keyed-hash message authentication code (HMAC) calculated using the
     * secret key of a user pool client and username plus the client ID in the
     * message.
     * </p>
     * 
     * @return A keyed-hash message authentication code (HMAC) calculated using
     *         the secret key of a user pool client and username plus the client
     *         ID in the message.
     */

    public String getSecretHash() {
        return this.secretHash;
    }

    /**
     * <p>
     * A keyed-hash message authentication code (HMAC) calculated using the
     * secret key of a user pool client and username plus the client ID in the
     * message.
     * </p>
     * 
     * @param secretHash
     *        A keyed-hash message authentication code (HMAC) calculated using
     *        the secret key of a user pool client and username plus the client
     *        ID in the message.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public SignUpRequest withSecretHash(String secretHash) {
        setSecretHash(secretHash);
        return this;
    }

    /**
     * <p>
     * The user name of the user you wish to register.
     * </p>
     * 
     * @param username
     *        The user name of the user you wish to register.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The user name of the user you wish to register.
     * </p>
     * 
     * @return The user name of the user you wish to register.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The user name of the user you wish to register.
     * </p>
     * 
     * @param username
     *        The user name of the user you wish to register.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public SignUpRequest withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * <p>
     * The password of the user you wish to register.
     * </p>
     * 
     * @param password
     *        The password of the user you wish to register.
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * The password of the user you wish to register.
     * </p>
     * 
     * @return The password of the user you wish to register.
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * <p>
     * The password of the user you wish to register.
     * </p>
     * 
     * @param password
     *        The password of the user you wish to register.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public SignUpRequest withPassword(String password) {
        setPassword(password);
        return this;
    }

    /**
     * <p>
     * An array of name-value pairs representing user attributes.
     * </p>
     * 
     * @return An array of name-value pairs representing user attributes.
     */

    public java.util.List<AttributeType> getUserAttributes() {
        return userAttributes;
    }

    /**
     * <p>
     * An array of name-value pairs representing user attributes.
     * </p>
     * 
     * @param userAttributes
     *        An array of name-value pairs representing user attributes.
     */

    public void setUserAttributes(
            java.util.Collection<AttributeType> userAttributes) {
        if (userAttributes == null) {
            this.userAttributes = null;
            return;
        }

        this.userAttributes = new java.util.ArrayList<AttributeType>(
                userAttributes);
    }

    /**
     * <p>
     * An array of name-value pairs representing user attributes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setUserAttributes(java.util.Collection)} or
     * {@link #withUserAttributes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param userAttributes
     *        An array of name-value pairs representing user attributes.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public SignUpRequest withUserAttributes(AttributeType... userAttributes) {
        if (this.userAttributes == null) {
            setUserAttributes(new java.util.ArrayList<AttributeType>(
                    userAttributes.length));
        }
        for (AttributeType ele : userAttributes) {
            this.userAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of name-value pairs representing user attributes.
     * </p>
     * 
     * @param userAttributes
     *        An array of name-value pairs representing user attributes.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public SignUpRequest withUserAttributes(
            java.util.Collection<AttributeType> userAttributes) {
        setUserAttributes(userAttributes);
        return this;
    }

    /**
     * <p>
     * The validation data in the request to register a user.
     * </p>
     * 
     * @return The validation data in the request to register a user.
     */

    public java.util.List<AttributeType> getValidationData() {
        return validationData;
    }

    /**
     * <p>
     * The validation data in the request to register a user.
     * </p>
     * 
     * @param validationData
     *        The validation data in the request to register a user.
     */

    public void setValidationData(
            java.util.Collection<AttributeType> validationData) {
        if (validationData == null) {
            this.validationData = null;
            return;
        }

        this.validationData = new java.util.ArrayList<AttributeType>(
                validationData);
    }

    /**
     * <p>
     * The validation data in the request to register a user.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setValidationData(java.util.Collection)} or
     * {@link #withValidationData(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param validationData
     *        The validation data in the request to register a user.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public SignUpRequest withValidationData(AttributeType... validationData) {
        if (this.validationData == null) {
            setValidationData(new java.util.ArrayList<AttributeType>(
                    validationData.length));
        }
        for (AttributeType ele : validationData) {
            this.validationData.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The validation data in the request to register a user.
     * </p>
     * 
     * @param validationData
     *        The validation data in the request to register a user.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public SignUpRequest withValidationData(
            java.util.Collection<AttributeType> validationData) {
        setValidationData(validationData);
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
        if (getClientId() != null)
            sb.append("ClientId: " + getClientId() + ",");
        if (getSecretHash() != null)
            sb.append("SecretHash: " + getSecretHash() + ",");
        if (getUsername() != null)
            sb.append("Username: " + getUsername() + ",");
        if (getPassword() != null)
            sb.append("Password: " + getPassword() + ",");
        if (getUserAttributes() != null)
            sb.append("UserAttributes: " + getUserAttributes() + ",");
        if (getValidationData() != null)
            sb.append("ValidationData: " + getValidationData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SignUpRequest == false)
            return false;
        SignUpRequest other = (SignUpRequest) obj;
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null
                && other.getClientId().equals(this.getClientId()) == false)
            return false;
        if (other.getSecretHash() == null ^ this.getSecretHash() == null)
            return false;
        if (other.getSecretHash() != null
                && other.getSecretHash().equals(this.getSecretHash()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null
                && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null
                && other.getPassword().equals(this.getPassword()) == false)
            return false;
        if (other.getUserAttributes() == null
                ^ this.getUserAttributes() == null)
            return false;
        if (other.getUserAttributes() != null
                && other.getUserAttributes().equals(this.getUserAttributes()) == false)
            return false;
        if (other.getValidationData() == null
                ^ this.getValidationData() == null)
            return false;
        if (other.getValidationData() != null
                && other.getValidationData().equals(this.getValidationData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime * hashCode
                + ((getSecretHash() == null) ? 0 : getSecretHash().hashCode());
        hashCode = prime * hashCode
                + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode
                + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime
                * hashCode
                + ((getUserAttributes() == null) ? 0 : getUserAttributes()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getValidationData() == null) ? 0 : getValidationData()
                        .hashCode());
        return hashCode;
    }

    @Override
    public SignUpRequest clone() {
        return (SignUpRequest) super.clone();
    }
}

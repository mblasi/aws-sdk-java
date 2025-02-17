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

/**
 * <p>
 * Represents the response from the server from the request to get the specified
 * user as an administrator.
 * </p>
 */
public class AdminGetUserResult extends
        com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata>
        implements Serializable, Cloneable {

    /**
     * <p>
     * The user name of the user about whom you are receiving information.
     * </p>
     */
    private String username;
    /**
     * <p>
     * An array of name-value pairs representing user attributes.
     * </p>
     */
    private java.util.List<AttributeType> userAttributes;
    /**
     * <p>
     * The date the user was created.
     * </p>
     */
    private java.util.Date userCreateDate;
    /**
     * <p>
     * The date the user was last modified.
     * </p>
     */
    private java.util.Date userLastModifiedDate;
    /**
     * <p>
     * Indicates that the status is enabled.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The user status. Can be one of the following:
     * </p>
     * <ul>
     * <li>UNCONFIRMED - User has been created but not confirmed.</li>
     * <li>CONFIRMED - User has been confirmed.</li>
     * <li>ARCHIVED - User is no longer active.</li>
     * <li>COMPROMISED - User is disabled due to a potential security threat.</li>
     * <li>UNKNOWN - User status is not known.</li>
     * </ul>
     */
    private String userStatus;
    /**
     * <p>
     * Specifies the options for MFA (e.g., email or phone number).
     * </p>
     */
    private java.util.List<MFAOptionType> mFAOptions;

    /**
     * <p>
     * The user name of the user about whom you are receiving information.
     * </p>
     * 
     * @param username
     *        The user name of the user about whom you are receiving
     *        information.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The user name of the user about whom you are receiving information.
     * </p>
     * 
     * @return The user name of the user about whom you are receiving
     *         information.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The user name of the user about whom you are receiving information.
     * </p>
     * 
     * @param username
     *        The user name of the user about whom you are receiving
     *        information.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public AdminGetUserResult withUsername(String username) {
        setUsername(username);
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

    public AdminGetUserResult withUserAttributes(
            AttributeType... userAttributes) {
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

    public AdminGetUserResult withUserAttributes(
            java.util.Collection<AttributeType> userAttributes) {
        setUserAttributes(userAttributes);
        return this;
    }

    /**
     * <p>
     * The date the user was created.
     * </p>
     * 
     * @param userCreateDate
     *        The date the user was created.
     */

    public void setUserCreateDate(java.util.Date userCreateDate) {
        this.userCreateDate = userCreateDate;
    }

    /**
     * <p>
     * The date the user was created.
     * </p>
     * 
     * @return The date the user was created.
     */

    public java.util.Date getUserCreateDate() {
        return this.userCreateDate;
    }

    /**
     * <p>
     * The date the user was created.
     * </p>
     * 
     * @param userCreateDate
     *        The date the user was created.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public AdminGetUserResult withUserCreateDate(java.util.Date userCreateDate) {
        setUserCreateDate(userCreateDate);
        return this;
    }

    /**
     * <p>
     * The date the user was last modified.
     * </p>
     * 
     * @param userLastModifiedDate
     *        The date the user was last modified.
     */

    public void setUserLastModifiedDate(java.util.Date userLastModifiedDate) {
        this.userLastModifiedDate = userLastModifiedDate;
    }

    /**
     * <p>
     * The date the user was last modified.
     * </p>
     * 
     * @return The date the user was last modified.
     */

    public java.util.Date getUserLastModifiedDate() {
        return this.userLastModifiedDate;
    }

    /**
     * <p>
     * The date the user was last modified.
     * </p>
     * 
     * @param userLastModifiedDate
     *        The date the user was last modified.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public AdminGetUserResult withUserLastModifiedDate(
            java.util.Date userLastModifiedDate) {
        setUserLastModifiedDate(userLastModifiedDate);
        return this;
    }

    /**
     * <p>
     * Indicates that the status is enabled.
     * </p>
     * 
     * @param enabled
     *        Indicates that the status is enabled.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Indicates that the status is enabled.
     * </p>
     * 
     * @return Indicates that the status is enabled.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Indicates that the status is enabled.
     * </p>
     * 
     * @param enabled
     *        Indicates that the status is enabled.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public AdminGetUserResult withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Indicates that the status is enabled.
     * </p>
     * 
     * @return Indicates that the status is enabled.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The user status. Can be one of the following:
     * </p>
     * <ul>
     * <li>UNCONFIRMED - User has been created but not confirmed.</li>
     * <li>CONFIRMED - User has been confirmed.</li>
     * <li>ARCHIVED - User is no longer active.</li>
     * <li>COMPROMISED - User is disabled due to a potential security threat.</li>
     * <li>UNKNOWN - User status is not known.</li>
     * </ul>
     * 
     * @param userStatus
     *        The user status. Can be one of the following:</p>
     *        <ul>
     *        <li>UNCONFIRMED - User has been created but not confirmed.</li>
     *        <li>CONFIRMED - User has been confirmed.</li>
     *        <li>ARCHIVED - User is no longer active.</li>
     *        <li>COMPROMISED - User is disabled due to a potential security
     *        threat.</li>
     *        <li>UNKNOWN - User status is not known.</li>
     * @see UserStatusType
     */

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    /**
     * <p>
     * The user status. Can be one of the following:
     * </p>
     * <ul>
     * <li>UNCONFIRMED - User has been created but not confirmed.</li>
     * <li>CONFIRMED - User has been confirmed.</li>
     * <li>ARCHIVED - User is no longer active.</li>
     * <li>COMPROMISED - User is disabled due to a potential security threat.</li>
     * <li>UNKNOWN - User status is not known.</li>
     * </ul>
     * 
     * @return The user status. Can be one of the following:</p>
     *         <ul>
     *         <li>UNCONFIRMED - User has been created but not confirmed.</li>
     *         <li>CONFIRMED - User has been confirmed.</li>
     *         <li>ARCHIVED - User is no longer active.</li>
     *         <li>COMPROMISED - User is disabled due to a potential security
     *         threat.</li>
     *         <li>UNKNOWN - User status is not known.</li>
     * @see UserStatusType
     */

    public String getUserStatus() {
        return this.userStatus;
    }

    /**
     * <p>
     * The user status. Can be one of the following:
     * </p>
     * <ul>
     * <li>UNCONFIRMED - User has been created but not confirmed.</li>
     * <li>CONFIRMED - User has been confirmed.</li>
     * <li>ARCHIVED - User is no longer active.</li>
     * <li>COMPROMISED - User is disabled due to a potential security threat.</li>
     * <li>UNKNOWN - User status is not known.</li>
     * </ul>
     * 
     * @param userStatus
     *        The user status. Can be one of the following:</p>
     *        <ul>
     *        <li>UNCONFIRMED - User has been created but not confirmed.</li>
     *        <li>CONFIRMED - User has been confirmed.</li>
     *        <li>ARCHIVED - User is no longer active.</li>
     *        <li>COMPROMISED - User is disabled due to a potential security
     *        threat.</li>
     *        <li>UNKNOWN - User status is not known.</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see UserStatusType
     */

    public AdminGetUserResult withUserStatus(String userStatus) {
        setUserStatus(userStatus);
        return this;
    }

    /**
     * <p>
     * The user status. Can be one of the following:
     * </p>
     * <ul>
     * <li>UNCONFIRMED - User has been created but not confirmed.</li>
     * <li>CONFIRMED - User has been confirmed.</li>
     * <li>ARCHIVED - User is no longer active.</li>
     * <li>COMPROMISED - User is disabled due to a potential security threat.</li>
     * <li>UNKNOWN - User status is not known.</li>
     * </ul>
     * 
     * @param userStatus
     *        The user status. Can be one of the following:</p>
     *        <ul>
     *        <li>UNCONFIRMED - User has been created but not confirmed.</li>
     *        <li>CONFIRMED - User has been confirmed.</li>
     *        <li>ARCHIVED - User is no longer active.</li>
     *        <li>COMPROMISED - User is disabled due to a potential security
     *        threat.</li>
     *        <li>UNKNOWN - User status is not known.</li>
     * @see UserStatusType
     */

    public void setUserStatus(UserStatusType userStatus) {
        this.userStatus = userStatus.toString();
    }

    /**
     * <p>
     * The user status. Can be one of the following:
     * </p>
     * <ul>
     * <li>UNCONFIRMED - User has been created but not confirmed.</li>
     * <li>CONFIRMED - User has been confirmed.</li>
     * <li>ARCHIVED - User is no longer active.</li>
     * <li>COMPROMISED - User is disabled due to a potential security threat.</li>
     * <li>UNKNOWN - User status is not known.</li>
     * </ul>
     * 
     * @param userStatus
     *        The user status. Can be one of the following:</p>
     *        <ul>
     *        <li>UNCONFIRMED - User has been created but not confirmed.</li>
     *        <li>CONFIRMED - User has been confirmed.</li>
     *        <li>ARCHIVED - User is no longer active.</li>
     *        <li>COMPROMISED - User is disabled due to a potential security
     *        threat.</li>
     *        <li>UNKNOWN - User status is not known.</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see UserStatusType
     */

    public AdminGetUserResult withUserStatus(UserStatusType userStatus) {
        setUserStatus(userStatus);
        return this;
    }

    /**
     * <p>
     * Specifies the options for MFA (e.g., email or phone number).
     * </p>
     * 
     * @return Specifies the options for MFA (e.g., email or phone number).
     */

    public java.util.List<MFAOptionType> getMFAOptions() {
        return mFAOptions;
    }

    /**
     * <p>
     * Specifies the options for MFA (e.g., email or phone number).
     * </p>
     * 
     * @param mFAOptions
     *        Specifies the options for MFA (e.g., email or phone number).
     */

    public void setMFAOptions(java.util.Collection<MFAOptionType> mFAOptions) {
        if (mFAOptions == null) {
            this.mFAOptions = null;
            return;
        }

        this.mFAOptions = new java.util.ArrayList<MFAOptionType>(mFAOptions);
    }

    /**
     * <p>
     * Specifies the options for MFA (e.g., email or phone number).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setMFAOptions(java.util.Collection)} or
     * {@link #withMFAOptions(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param mFAOptions
     *        Specifies the options for MFA (e.g., email or phone number).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public AdminGetUserResult withMFAOptions(MFAOptionType... mFAOptions) {
        if (this.mFAOptions == null) {
            setMFAOptions(new java.util.ArrayList<MFAOptionType>(
                    mFAOptions.length));
        }
        for (MFAOptionType ele : mFAOptions) {
            this.mFAOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the options for MFA (e.g., email or phone number).
     * </p>
     * 
     * @param mFAOptions
     *        Specifies the options for MFA (e.g., email or phone number).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public AdminGetUserResult withMFAOptions(
            java.util.Collection<MFAOptionType> mFAOptions) {
        setMFAOptions(mFAOptions);
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
        if (getUsername() != null)
            sb.append("Username: " + getUsername() + ",");
        if (getUserAttributes() != null)
            sb.append("UserAttributes: " + getUserAttributes() + ",");
        if (getUserCreateDate() != null)
            sb.append("UserCreateDate: " + getUserCreateDate() + ",");
        if (getUserLastModifiedDate() != null)
            sb.append("UserLastModifiedDate: " + getUserLastModifiedDate()
                    + ",");
        if (getEnabled() != null)
            sb.append("Enabled: " + getEnabled() + ",");
        if (getUserStatus() != null)
            sb.append("UserStatus: " + getUserStatus() + ",");
        if (getMFAOptions() != null)
            sb.append("MFAOptions: " + getMFAOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdminGetUserResult == false)
            return false;
        AdminGetUserResult other = (AdminGetUserResult) obj;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null
                && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getUserAttributes() == null
                ^ this.getUserAttributes() == null)
            return false;
        if (other.getUserAttributes() != null
                && other.getUserAttributes().equals(this.getUserAttributes()) == false)
            return false;
        if (other.getUserCreateDate() == null
                ^ this.getUserCreateDate() == null)
            return false;
        if (other.getUserCreateDate() != null
                && other.getUserCreateDate().equals(this.getUserCreateDate()) == false)
            return false;
        if (other.getUserLastModifiedDate() == null
                ^ this.getUserLastModifiedDate() == null)
            return false;
        if (other.getUserLastModifiedDate() != null
                && other.getUserLastModifiedDate().equals(
                        this.getUserLastModifiedDate()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null
                && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getUserStatus() == null ^ this.getUserStatus() == null)
            return false;
        if (other.getUserStatus() != null
                && other.getUserStatus().equals(this.getUserStatus()) == false)
            return false;
        if (other.getMFAOptions() == null ^ this.getMFAOptions() == null)
            return false;
        if (other.getMFAOptions() != null
                && other.getMFAOptions().equals(this.getMFAOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime
                * hashCode
                + ((getUserAttributes() == null) ? 0 : getUserAttributes()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getUserCreateDate() == null) ? 0 : getUserCreateDate()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getUserLastModifiedDate() == null) ? 0
                        : getUserLastModifiedDate().hashCode());
        hashCode = prime * hashCode
                + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode
                + ((getUserStatus() == null) ? 0 : getUserStatus().hashCode());
        hashCode = prime * hashCode
                + ((getMFAOptions() == null) ? 0 : getMFAOptions().hashCode());
        return hashCode;
    }

    @Override
    public AdminGetUserResult clone() {
        try {
            return (AdminGetUserResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

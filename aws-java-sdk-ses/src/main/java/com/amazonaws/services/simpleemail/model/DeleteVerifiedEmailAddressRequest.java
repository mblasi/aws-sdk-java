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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents a request to delete an email address from the list of email
 * addresses you have attempted to verify under your AWS account.
 * </p>
 */
public class DeleteVerifiedEmailAddressRequest extends
        com.amazonaws.AmazonWebServiceRequest implements Serializable,
        Cloneable {

    /**
     * <p>
     * An email address to be removed from the list of verified addresses.
     * </p>
     */
    private String emailAddress;

    /**
     * <p>
     * An email address to be removed from the list of verified addresses.
     * </p>
     * 
     * @param emailAddress
     *        An email address to be removed from the list of verified
     *        addresses.
     */

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * <p>
     * An email address to be removed from the list of verified addresses.
     * </p>
     * 
     * @return An email address to be removed from the list of verified
     *         addresses.
     */

    public String getEmailAddress() {
        return this.emailAddress;
    }

    /**
     * <p>
     * An email address to be removed from the list of verified addresses.
     * </p>
     * 
     * @param emailAddress
     *        An email address to be removed from the list of verified
     *        addresses.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeleteVerifiedEmailAddressRequest withEmailAddress(
            String emailAddress) {
        setEmailAddress(emailAddress);
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
        if (getEmailAddress() != null)
            sb.append("EmailAddress: " + getEmailAddress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteVerifiedEmailAddressRequest == false)
            return false;
        DeleteVerifiedEmailAddressRequest other = (DeleteVerifiedEmailAddressRequest) obj;
        if (other.getEmailAddress() == null ^ this.getEmailAddress() == null)
            return false;
        if (other.getEmailAddress() != null
                && other.getEmailAddress().equals(this.getEmailAddress()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getEmailAddress() == null) ? 0 : getEmailAddress()
                        .hashCode());
        return hashCode;
    }

    @Override
    public DeleteVerifiedEmailAddressRequest clone() {
        return (DeleteVerifiedEmailAddressRequest) super.clone();
    }
}

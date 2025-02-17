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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the response to a successful <a>ListSAMLProviders</a> request.
 * </p>
 */
public class ListSAMLProvidersResult extends
        com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata>
        implements Serializable, Cloneable {

    /**
     * <p>
     * The list of SAML provider resource objects defined in IAM for this AWS
     * account.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SAMLProviderListEntry> sAMLProviderList;

    /**
     * <p>
     * The list of SAML provider resource objects defined in IAM for this AWS
     * account.
     * </p>
     * 
     * @return The list of SAML provider resource objects defined in IAM for
     *         this AWS account.
     */

    public java.util.List<SAMLProviderListEntry> getSAMLProviderList() {
        if (sAMLProviderList == null) {
            sAMLProviderList = new com.amazonaws.internal.SdkInternalList<SAMLProviderListEntry>();
        }
        return sAMLProviderList;
    }

    /**
     * <p>
     * The list of SAML provider resource objects defined in IAM for this AWS
     * account.
     * </p>
     * 
     * @param sAMLProviderList
     *        The list of SAML provider resource objects defined in IAM for this
     *        AWS account.
     */

    public void setSAMLProviderList(
            java.util.Collection<SAMLProviderListEntry> sAMLProviderList) {
        if (sAMLProviderList == null) {
            this.sAMLProviderList = null;
            return;
        }

        this.sAMLProviderList = new com.amazonaws.internal.SdkInternalList<SAMLProviderListEntry>(
                sAMLProviderList);
    }

    /**
     * <p>
     * The list of SAML provider resource objects defined in IAM for this AWS
     * account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSAMLProviderList(java.util.Collection)} or
     * {@link #withSAMLProviderList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param sAMLProviderList
     *        The list of SAML provider resource objects defined in IAM for this
     *        AWS account.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListSAMLProvidersResult withSAMLProviderList(
            SAMLProviderListEntry... sAMLProviderList) {
        if (this.sAMLProviderList == null) {
            setSAMLProviderList(new com.amazonaws.internal.SdkInternalList<SAMLProviderListEntry>(
                    sAMLProviderList.length));
        }
        for (SAMLProviderListEntry ele : sAMLProviderList) {
            this.sAMLProviderList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of SAML provider resource objects defined in IAM for this AWS
     * account.
     * </p>
     * 
     * @param sAMLProviderList
     *        The list of SAML provider resource objects defined in IAM for this
     *        AWS account.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListSAMLProvidersResult withSAMLProviderList(
            java.util.Collection<SAMLProviderListEntry> sAMLProviderList) {
        setSAMLProviderList(sAMLProviderList);
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
        if (getSAMLProviderList() != null)
            sb.append("SAMLProviderList: " + getSAMLProviderList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSAMLProvidersResult == false)
            return false;
        ListSAMLProvidersResult other = (ListSAMLProvidersResult) obj;
        if (other.getSAMLProviderList() == null
                ^ this.getSAMLProviderList() == null)
            return false;
        if (other.getSAMLProviderList() != null
                && other.getSAMLProviderList().equals(
                        this.getSAMLProviderList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getSAMLProviderList() == null) ? 0 : getSAMLProviderList()
                        .hashCode());
        return hashCode;
    }

    @Override
    public ListSAMLProvidersResult clone() {
        try {
            return (ListSAMLProvidersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

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
package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;

/**
 * An object representing a Cognito identity pool.
 */
public class UpdateIdentityPoolResult extends
        com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata>
        implements Serializable, Cloneable {

    /** An identity pool ID in the format REGION:GUID. */
    private String identityPoolId;
    /**
     * <p>
     * A string that you provide.
     * </p>
     */
    private String identityPoolName;
    /** TRUE if the identity pool supports unauthenticated logins. */
    private Boolean allowUnauthenticatedIdentities;
    /**
     * <p>
     * Optional key:value pairs mapping provider names to provider app IDs.
     * </p>
     */
    private java.util.Map<String, String> supportedLoginProviders;
    /**
     * <p>
     * The "domain" by which Cognito will refer to your users.
     * </p>
     */
    private String developerProviderName;
    /**
     * <p>
     * A list of OpendID Connect provider ARNs.
     * </p>
     */
    private java.util.List<String> openIdConnectProviderARNs;
    /**
     * <p>
     * A list representing an Amazon Cognito Identity User Pool and its client
     * ID.
     * </p>
     */
    private java.util.List<CognitoIdentityProvider> cognitoIdentityProviders;
    /**
     * <p>
     * An array of Amazon Resource Names (ARNs) of the SAML provider for your
     * identity pool.
     * </p>
     */
    private java.util.List<String> samlProviderARNs;

    /**
     * An identity pool ID in the format REGION:GUID.
     * 
     * @param identityPoolId
     *        An identity pool ID in the format REGION:GUID.
     */

    public void setIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
    }

    /**
     * An identity pool ID in the format REGION:GUID.
     * 
     * @return An identity pool ID in the format REGION:GUID.
     */

    public String getIdentityPoolId() {
        return this.identityPoolId;
    }

    /**
     * An identity pool ID in the format REGION:GUID.
     * 
     * @param identityPoolId
     *        An identity pool ID in the format REGION:GUID.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateIdentityPoolResult withIdentityPoolId(String identityPoolId) {
        setIdentityPoolId(identityPoolId);
        return this;
    }

    /**
     * <p>
     * A string that you provide.
     * </p>
     * 
     * @param identityPoolName
     *        A string that you provide.
     */

    public void setIdentityPoolName(String identityPoolName) {
        this.identityPoolName = identityPoolName;
    }

    /**
     * <p>
     * A string that you provide.
     * </p>
     * 
     * @return A string that you provide.
     */

    public String getIdentityPoolName() {
        return this.identityPoolName;
    }

    /**
     * <p>
     * A string that you provide.
     * </p>
     * 
     * @param identityPoolName
     *        A string that you provide.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateIdentityPoolResult withIdentityPoolName(String identityPoolName) {
        setIdentityPoolName(identityPoolName);
        return this;
    }

    /**
     * TRUE if the identity pool supports unauthenticated logins.
     * 
     * @param allowUnauthenticatedIdentities
     *        TRUE if the identity pool supports unauthenticated logins.
     */

    public void setAllowUnauthenticatedIdentities(
            Boolean allowUnauthenticatedIdentities) {
        this.allowUnauthenticatedIdentities = allowUnauthenticatedIdentities;
    }

    /**
     * TRUE if the identity pool supports unauthenticated logins.
     * 
     * @return TRUE if the identity pool supports unauthenticated logins.
     */

    public Boolean getAllowUnauthenticatedIdentities() {
        return this.allowUnauthenticatedIdentities;
    }

    /**
     * TRUE if the identity pool supports unauthenticated logins.
     * 
     * @param allowUnauthenticatedIdentities
     *        TRUE if the identity pool supports unauthenticated logins.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateIdentityPoolResult withAllowUnauthenticatedIdentities(
            Boolean allowUnauthenticatedIdentities) {
        setAllowUnauthenticatedIdentities(allowUnauthenticatedIdentities);
        return this;
    }

    /**
     * TRUE if the identity pool supports unauthenticated logins.
     * 
     * @return TRUE if the identity pool supports unauthenticated logins.
     */

    public Boolean isAllowUnauthenticatedIdentities() {
        return this.allowUnauthenticatedIdentities;
    }

    /**
     * <p>
     * Optional key:value pairs mapping provider names to provider app IDs.
     * </p>
     * 
     * @return Optional key:value pairs mapping provider names to provider app
     *         IDs.
     */

    public java.util.Map<String, String> getSupportedLoginProviders() {
        return supportedLoginProviders;
    }

    /**
     * <p>
     * Optional key:value pairs mapping provider names to provider app IDs.
     * </p>
     * 
     * @param supportedLoginProviders
     *        Optional key:value pairs mapping provider names to provider app
     *        IDs.
     */

    public void setSupportedLoginProviders(
            java.util.Map<String, String> supportedLoginProviders) {
        this.supportedLoginProviders = supportedLoginProviders;
    }

    /**
     * <p>
     * Optional key:value pairs mapping provider names to provider app IDs.
     * </p>
     * 
     * @param supportedLoginProviders
     *        Optional key:value pairs mapping provider names to provider app
     *        IDs.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateIdentityPoolResult withSupportedLoginProviders(
            java.util.Map<String, String> supportedLoginProviders) {
        setSupportedLoginProviders(supportedLoginProviders);
        return this;
    }

    public UpdateIdentityPoolResult addSupportedLoginProvidersEntry(String key,
            String value) {
        if (null == this.supportedLoginProviders) {
            this.supportedLoginProviders = new java.util.HashMap<String, String>();
        }
        if (this.supportedLoginProviders.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys ("
                    + key.toString() + ") are provided.");
        this.supportedLoginProviders.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into SupportedLoginProviders. &lt;p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */

    public UpdateIdentityPoolResult clearSupportedLoginProvidersEntries() {
        this.supportedLoginProviders = null;
        return this;
    }

    /**
     * <p>
     * The "domain" by which Cognito will refer to your users.
     * </p>
     * 
     * @param developerProviderName
     *        The "domain" by which Cognito will refer to your users.
     */

    public void setDeveloperProviderName(String developerProviderName) {
        this.developerProviderName = developerProviderName;
    }

    /**
     * <p>
     * The "domain" by which Cognito will refer to your users.
     * </p>
     * 
     * @return The "domain" by which Cognito will refer to your users.
     */

    public String getDeveloperProviderName() {
        return this.developerProviderName;
    }

    /**
     * <p>
     * The "domain" by which Cognito will refer to your users.
     * </p>
     * 
     * @param developerProviderName
     *        The "domain" by which Cognito will refer to your users.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateIdentityPoolResult withDeveloperProviderName(
            String developerProviderName) {
        setDeveloperProviderName(developerProviderName);
        return this;
    }

    /**
     * <p>
     * A list of OpendID Connect provider ARNs.
     * </p>
     * 
     * @return A list of OpendID Connect provider ARNs.
     */

    public java.util.List<String> getOpenIdConnectProviderARNs() {
        return openIdConnectProviderARNs;
    }

    /**
     * <p>
     * A list of OpendID Connect provider ARNs.
     * </p>
     * 
     * @param openIdConnectProviderARNs
     *        A list of OpendID Connect provider ARNs.
     */

    public void setOpenIdConnectProviderARNs(
            java.util.Collection<String> openIdConnectProviderARNs) {
        if (openIdConnectProviderARNs == null) {
            this.openIdConnectProviderARNs = null;
            return;
        }

        this.openIdConnectProviderARNs = new java.util.ArrayList<String>(
                openIdConnectProviderARNs);
    }

    /**
     * <p>
     * A list of OpendID Connect provider ARNs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setOpenIdConnectProviderARNs(java.util.Collection)} or
     * {@link #withOpenIdConnectProviderARNs(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param openIdConnectProviderARNs
     *        A list of OpendID Connect provider ARNs.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateIdentityPoolResult withOpenIdConnectProviderARNs(
            String... openIdConnectProviderARNs) {
        if (this.openIdConnectProviderARNs == null) {
            setOpenIdConnectProviderARNs(new java.util.ArrayList<String>(
                    openIdConnectProviderARNs.length));
        }
        for (String ele : openIdConnectProviderARNs) {
            this.openIdConnectProviderARNs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of OpendID Connect provider ARNs.
     * </p>
     * 
     * @param openIdConnectProviderARNs
     *        A list of OpendID Connect provider ARNs.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateIdentityPoolResult withOpenIdConnectProviderARNs(
            java.util.Collection<String> openIdConnectProviderARNs) {
        setOpenIdConnectProviderARNs(openIdConnectProviderARNs);
        return this;
    }

    /**
     * <p>
     * A list representing an Amazon Cognito Identity User Pool and its client
     * ID.
     * </p>
     * 
     * @return A list representing an Amazon Cognito Identity User Pool and its
     *         client ID.
     */

    public java.util.List<CognitoIdentityProvider> getCognitoIdentityProviders() {
        return cognitoIdentityProviders;
    }

    /**
     * <p>
     * A list representing an Amazon Cognito Identity User Pool and its client
     * ID.
     * </p>
     * 
     * @param cognitoIdentityProviders
     *        A list representing an Amazon Cognito Identity User Pool and its
     *        client ID.
     */

    public void setCognitoIdentityProviders(
            java.util.Collection<CognitoIdentityProvider> cognitoIdentityProviders) {
        if (cognitoIdentityProviders == null) {
            this.cognitoIdentityProviders = null;
            return;
        }

        this.cognitoIdentityProviders = new java.util.ArrayList<CognitoIdentityProvider>(
                cognitoIdentityProviders);
    }

    /**
     * <p>
     * A list representing an Amazon Cognito Identity User Pool and its client
     * ID.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setCognitoIdentityProviders(java.util.Collection)} or
     * {@link #withCognitoIdentityProviders(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param cognitoIdentityProviders
     *        A list representing an Amazon Cognito Identity User Pool and its
     *        client ID.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateIdentityPoolResult withCognitoIdentityProviders(
            CognitoIdentityProvider... cognitoIdentityProviders) {
        if (this.cognitoIdentityProviders == null) {
            setCognitoIdentityProviders(new java.util.ArrayList<CognitoIdentityProvider>(
                    cognitoIdentityProviders.length));
        }
        for (CognitoIdentityProvider ele : cognitoIdentityProviders) {
            this.cognitoIdentityProviders.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list representing an Amazon Cognito Identity User Pool and its client
     * ID.
     * </p>
     * 
     * @param cognitoIdentityProviders
     *        A list representing an Amazon Cognito Identity User Pool and its
     *        client ID.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateIdentityPoolResult withCognitoIdentityProviders(
            java.util.Collection<CognitoIdentityProvider> cognitoIdentityProviders) {
        setCognitoIdentityProviders(cognitoIdentityProviders);
        return this;
    }

    /**
     * <p>
     * An array of Amazon Resource Names (ARNs) of the SAML provider for your
     * identity pool.
     * </p>
     * 
     * @return An array of Amazon Resource Names (ARNs) of the SAML provider for
     *         your identity pool.
     */

    public java.util.List<String> getSamlProviderARNs() {
        return samlProviderARNs;
    }

    /**
     * <p>
     * An array of Amazon Resource Names (ARNs) of the SAML provider for your
     * identity pool.
     * </p>
     * 
     * @param samlProviderARNs
     *        An array of Amazon Resource Names (ARNs) of the SAML provider for
     *        your identity pool.
     */

    public void setSamlProviderARNs(
            java.util.Collection<String> samlProviderARNs) {
        if (samlProviderARNs == null) {
            this.samlProviderARNs = null;
            return;
        }

        this.samlProviderARNs = new java.util.ArrayList<String>(
                samlProviderARNs);
    }

    /**
     * <p>
     * An array of Amazon Resource Names (ARNs) of the SAML provider for your
     * identity pool.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSamlProviderARNs(java.util.Collection)} or
     * {@link #withSamlProviderARNs(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param samlProviderARNs
     *        An array of Amazon Resource Names (ARNs) of the SAML provider for
     *        your identity pool.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateIdentityPoolResult withSamlProviderARNs(
            String... samlProviderARNs) {
        if (this.samlProviderARNs == null) {
            setSamlProviderARNs(new java.util.ArrayList<String>(
                    samlProviderARNs.length));
        }
        for (String ele : samlProviderARNs) {
            this.samlProviderARNs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of Amazon Resource Names (ARNs) of the SAML provider for your
     * identity pool.
     * </p>
     * 
     * @param samlProviderARNs
     *        An array of Amazon Resource Names (ARNs) of the SAML provider for
     *        your identity pool.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateIdentityPoolResult withSamlProviderARNs(
            java.util.Collection<String> samlProviderARNs) {
        setSamlProviderARNs(samlProviderARNs);
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
        if (getIdentityPoolId() != null)
            sb.append("IdentityPoolId: " + getIdentityPoolId() + ",");
        if (getIdentityPoolName() != null)
            sb.append("IdentityPoolName: " + getIdentityPoolName() + ",");
        if (getAllowUnauthenticatedIdentities() != null)
            sb.append("AllowUnauthenticatedIdentities: "
                    + getAllowUnauthenticatedIdentities() + ",");
        if (getSupportedLoginProviders() != null)
            sb.append("SupportedLoginProviders: "
                    + getSupportedLoginProviders() + ",");
        if (getDeveloperProviderName() != null)
            sb.append("DeveloperProviderName: " + getDeveloperProviderName()
                    + ",");
        if (getOpenIdConnectProviderARNs() != null)
            sb.append("OpenIdConnectProviderARNs: "
                    + getOpenIdConnectProviderARNs() + ",");
        if (getCognitoIdentityProviders() != null)
            sb.append("CognitoIdentityProviders: "
                    + getCognitoIdentityProviders() + ",");
        if (getSamlProviderARNs() != null)
            sb.append("SamlProviderARNs: " + getSamlProviderARNs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateIdentityPoolResult == false)
            return false;
        UpdateIdentityPoolResult other = (UpdateIdentityPoolResult) obj;
        if (other.getIdentityPoolId() == null
                ^ this.getIdentityPoolId() == null)
            return false;
        if (other.getIdentityPoolId() != null
                && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false)
            return false;
        if (other.getIdentityPoolName() == null
                ^ this.getIdentityPoolName() == null)
            return false;
        if (other.getIdentityPoolName() != null
                && other.getIdentityPoolName().equals(
                        this.getIdentityPoolName()) == false)
            return false;
        if (other.getAllowUnauthenticatedIdentities() == null
                ^ this.getAllowUnauthenticatedIdentities() == null)
            return false;
        if (other.getAllowUnauthenticatedIdentities() != null
                && other.getAllowUnauthenticatedIdentities().equals(
                        this.getAllowUnauthenticatedIdentities()) == false)
            return false;
        if (other.getSupportedLoginProviders() == null
                ^ this.getSupportedLoginProviders() == null)
            return false;
        if (other.getSupportedLoginProviders() != null
                && other.getSupportedLoginProviders().equals(
                        this.getSupportedLoginProviders()) == false)
            return false;
        if (other.getDeveloperProviderName() == null
                ^ this.getDeveloperProviderName() == null)
            return false;
        if (other.getDeveloperProviderName() != null
                && other.getDeveloperProviderName().equals(
                        this.getDeveloperProviderName()) == false)
            return false;
        if (other.getOpenIdConnectProviderARNs() == null
                ^ this.getOpenIdConnectProviderARNs() == null)
            return false;
        if (other.getOpenIdConnectProviderARNs() != null
                && other.getOpenIdConnectProviderARNs().equals(
                        this.getOpenIdConnectProviderARNs()) == false)
            return false;
        if (other.getCognitoIdentityProviders() == null
                ^ this.getCognitoIdentityProviders() == null)
            return false;
        if (other.getCognitoIdentityProviders() != null
                && other.getCognitoIdentityProviders().equals(
                        this.getCognitoIdentityProviders()) == false)
            return false;
        if (other.getSamlProviderARNs() == null
                ^ this.getSamlProviderARNs() == null)
            return false;
        if (other.getSamlProviderARNs() != null
                && other.getSamlProviderARNs().equals(
                        this.getSamlProviderARNs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getIdentityPoolId() == null) ? 0 : getIdentityPoolId()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getIdentityPoolName() == null) ? 0 : getIdentityPoolName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getAllowUnauthenticatedIdentities() == null) ? 0
                        : getAllowUnauthenticatedIdentities().hashCode());
        hashCode = prime
                * hashCode
                + ((getSupportedLoginProviders() == null) ? 0
                        : getSupportedLoginProviders().hashCode());
        hashCode = prime
                * hashCode
                + ((getDeveloperProviderName() == null) ? 0
                        : getDeveloperProviderName().hashCode());
        hashCode = prime
                * hashCode
                + ((getOpenIdConnectProviderARNs() == null) ? 0
                        : getOpenIdConnectProviderARNs().hashCode());
        hashCode = prime
                * hashCode
                + ((getCognitoIdentityProviders() == null) ? 0
                        : getCognitoIdentityProviders().hashCode());
        hashCode = prime
                * hashCode
                + ((getSamlProviderARNs() == null) ? 0 : getSamlProviderARNs()
                        .hashCode());
        return hashCode;
    }

    @Override
    public UpdateIdentityPoolResult clone() {
        try {
            return (UpdateIdentityPoolResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

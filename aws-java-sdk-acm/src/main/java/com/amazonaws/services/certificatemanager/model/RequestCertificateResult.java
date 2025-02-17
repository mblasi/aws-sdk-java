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
package com.amazonaws.services.certificatemanager.model;

import java.io.Serializable;

/**
 * 
 */
public class RequestCertificateResult extends
        com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata>
        implements Serializable, Cloneable {

    /**
     * <p>
     * String that contains the ARN of the issued certificate. This must be of
     * the form:
     * </p>
     * <p>
     * <code>arn:aws:acm:us-east-1:123456789012:certificate/12345678-1234-1234-1234-123456789012</code>
     * </p>
     */
    private String certificateArn;

    /**
     * <p>
     * String that contains the ARN of the issued certificate. This must be of
     * the form:
     * </p>
     * <p>
     * <code>arn:aws:acm:us-east-1:123456789012:certificate/12345678-1234-1234-1234-123456789012</code>
     * </p>
     * 
     * @param certificateArn
     *        String that contains the ARN of the issued certificate. This must
     *        be of the form:</p>
     *        <p>
     *        <code>arn:aws:acm:us-east-1:123456789012:certificate/12345678-1234-1234-1234-123456789012</code>
     */

    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * String that contains the ARN of the issued certificate. This must be of
     * the form:
     * </p>
     * <p>
     * <code>arn:aws:acm:us-east-1:123456789012:certificate/12345678-1234-1234-1234-123456789012</code>
     * </p>
     * 
     * @return String that contains the ARN of the issued certificate. This must
     *         be of the form:</p>
     *         <p>
     *         <code>arn:aws:acm:us-east-1:123456789012:certificate/12345678-1234-1234-1234-123456789012</code>
     */

    public String getCertificateArn() {
        return this.certificateArn;
    }

    /**
     * <p>
     * String that contains the ARN of the issued certificate. This must be of
     * the form:
     * </p>
     * <p>
     * <code>arn:aws:acm:us-east-1:123456789012:certificate/12345678-1234-1234-1234-123456789012</code>
     * </p>
     * 
     * @param certificateArn
     *        String that contains the ARN of the issued certificate. This must
     *        be of the form:</p>
     *        <p>
     *        <code>arn:aws:acm:us-east-1:123456789012:certificate/12345678-1234-1234-1234-123456789012</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public RequestCertificateResult withCertificateArn(String certificateArn) {
        setCertificateArn(certificateArn);
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
        if (getCertificateArn() != null)
            sb.append("CertificateArn: " + getCertificateArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RequestCertificateResult == false)
            return false;
        RequestCertificateResult other = (RequestCertificateResult) obj;
        if (other.getCertificateArn() == null
                ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null
                && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCertificateArn() == null) ? 0 : getCertificateArn()
                        .hashCode());
        return hashCode;
    }

    @Override
    public RequestCertificateResult clone() {
        try {
            return (RequestCertificateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

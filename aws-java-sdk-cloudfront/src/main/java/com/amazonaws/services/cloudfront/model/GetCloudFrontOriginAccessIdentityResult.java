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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;

/**
 * The returned result of the corresponding request.
 */
public class GetCloudFrontOriginAccessIdentityResult extends
        com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata>
        implements Serializable, Cloneable {

    /** The origin access identity's information. */
    private CloudFrontOriginAccessIdentity cloudFrontOriginAccessIdentity;
    /**
     * The current version of the origin access identity's information. For
     * example: E2QWRUHAPOMQZL.
     */
    private String eTag;

    /**
     * The origin access identity's information.
     * 
     * @param cloudFrontOriginAccessIdentity
     *        The origin access identity's information.
     */

    public void setCloudFrontOriginAccessIdentity(
            CloudFrontOriginAccessIdentity cloudFrontOriginAccessIdentity) {
        this.cloudFrontOriginAccessIdentity = cloudFrontOriginAccessIdentity;
    }

    /**
     * The origin access identity's information.
     * 
     * @return The origin access identity's information.
     */

    public CloudFrontOriginAccessIdentity getCloudFrontOriginAccessIdentity() {
        return this.cloudFrontOriginAccessIdentity;
    }

    /**
     * The origin access identity's information.
     * 
     * @param cloudFrontOriginAccessIdentity
     *        The origin access identity's information.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetCloudFrontOriginAccessIdentityResult withCloudFrontOriginAccessIdentity(
            CloudFrontOriginAccessIdentity cloudFrontOriginAccessIdentity) {
        setCloudFrontOriginAccessIdentity(cloudFrontOriginAccessIdentity);
        return this;
    }

    /**
     * The current version of the origin access identity's information. For
     * example: E2QWRUHAPOMQZL.
     * 
     * @param eTag
     *        The current version of the origin access identity's information.
     *        For example: E2QWRUHAPOMQZL.
     */

    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * The current version of the origin access identity's information. For
     * example: E2QWRUHAPOMQZL.
     * 
     * @return The current version of the origin access identity's information.
     *         For example: E2QWRUHAPOMQZL.
     */

    public String getETag() {
        return this.eTag;
    }

    /**
     * The current version of the origin access identity's information. For
     * example: E2QWRUHAPOMQZL.
     * 
     * @param eTag
     *        The current version of the origin access identity's information.
     *        For example: E2QWRUHAPOMQZL.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetCloudFrontOriginAccessIdentityResult withETag(String eTag) {
        setETag(eTag);
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
        if (getCloudFrontOriginAccessIdentity() != null)
            sb.append("CloudFrontOriginAccessIdentity: "
                    + getCloudFrontOriginAccessIdentity() + ",");
        if (getETag() != null)
            sb.append("ETag: " + getETag());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCloudFrontOriginAccessIdentityResult == false)
            return false;
        GetCloudFrontOriginAccessIdentityResult other = (GetCloudFrontOriginAccessIdentityResult) obj;
        if (other.getCloudFrontOriginAccessIdentity() == null
                ^ this.getCloudFrontOriginAccessIdentity() == null)
            return false;
        if (other.getCloudFrontOriginAccessIdentity() != null
                && other.getCloudFrontOriginAccessIdentity().equals(
                        this.getCloudFrontOriginAccessIdentity()) == false)
            return false;
        if (other.getETag() == null ^ this.getETag() == null)
            return false;
        if (other.getETag() != null
                && other.getETag().equals(this.getETag()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCloudFrontOriginAccessIdentity() == null) ? 0
                        : getCloudFrontOriginAccessIdentity().hashCode());
        hashCode = prime * hashCode
                + ((getETag() == null) ? 0 : getETag().hashCode());
        return hashCode;
    }

    @Override
    public GetCloudFrontOriginAccessIdentityResult clone() {
        try {
            return (GetCloudFrontOriginAccessIdentityResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

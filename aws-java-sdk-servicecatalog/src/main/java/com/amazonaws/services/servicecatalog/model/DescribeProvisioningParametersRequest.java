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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DescribeProvisioningParametersRequest extends
        com.amazonaws.AmazonWebServiceRequest implements Serializable,
        Cloneable {

    /**
     * <p>
     * The language code to use for this operation. Supported language codes are
     * as follows:
     * </p>
     * <p>
     * "en" (English)
     * </p>
     * <p>
     * "jp" (Japanese)
     * </p>
     * <p>
     * "zh" (Chinese)
     * </p>
     * <p>
     * If no code is specified, "en" is used as the default.
     * </p>
     */
    private String acceptLanguage;
    /**
     * <p>
     * The identifier of the product.
     * </p>
     */
    private String productId;
    /**
     * <p>
     * The provisioning artifact identifier for this product.
     * </p>
     */
    private String provisioningArtifactId;
    /**
     * <p>
     * The identifier of the path for this product's provisioning. This value is
     * optional if the product has a default path, and is required if there is
     * more than one path for the specified product.
     * </p>
     */
    private String pathId;

    /**
     * <p>
     * The language code to use for this operation. Supported language codes are
     * as follows:
     * </p>
     * <p>
     * "en" (English)
     * </p>
     * <p>
     * "jp" (Japanese)
     * </p>
     * <p>
     * "zh" (Chinese)
     * </p>
     * <p>
     * If no code is specified, "en" is used as the default.
     * </p>
     * 
     * @param acceptLanguage
     *        The language code to use for this operation. Supported language
     *        codes are as follows:</p>
     *        <p>
     *        "en" (English)
     *        </p>
     *        <p>
     *        "jp" (Japanese)
     *        </p>
     *        <p>
     *        "zh" (Chinese)
     *        </p>
     *        <p>
     *        If no code is specified, "en" is used as the default.
     */

    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    /**
     * <p>
     * The language code to use for this operation. Supported language codes are
     * as follows:
     * </p>
     * <p>
     * "en" (English)
     * </p>
     * <p>
     * "jp" (Japanese)
     * </p>
     * <p>
     * "zh" (Chinese)
     * </p>
     * <p>
     * If no code is specified, "en" is used as the default.
     * </p>
     * 
     * @return The language code to use for this operation. Supported language
     *         codes are as follows:</p>
     *         <p>
     *         "en" (English)
     *         </p>
     *         <p>
     *         "jp" (Japanese)
     *         </p>
     *         <p>
     *         "zh" (Chinese)
     *         </p>
     *         <p>
     *         If no code is specified, "en" is used as the default.
     */

    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * <p>
     * The language code to use for this operation. Supported language codes are
     * as follows:
     * </p>
     * <p>
     * "en" (English)
     * </p>
     * <p>
     * "jp" (Japanese)
     * </p>
     * <p>
     * "zh" (Chinese)
     * </p>
     * <p>
     * If no code is specified, "en" is used as the default.
     * </p>
     * 
     * @param acceptLanguage
     *        The language code to use for this operation. Supported language
     *        codes are as follows:</p>
     *        <p>
     *        "en" (English)
     *        </p>
     *        <p>
     *        "jp" (Japanese)
     *        </p>
     *        <p>
     *        "zh" (Chinese)
     *        </p>
     *        <p>
     *        If no code is specified, "en" is used as the default.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeProvisioningParametersRequest withAcceptLanguage(
            String acceptLanguage) {
        setAcceptLanguage(acceptLanguage);
        return this;
    }

    /**
     * <p>
     * The identifier of the product.
     * </p>
     * 
     * @param productId
     *        The identifier of the product.
     */

    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * <p>
     * The identifier of the product.
     * </p>
     * 
     * @return The identifier of the product.
     */

    public String getProductId() {
        return this.productId;
    }

    /**
     * <p>
     * The identifier of the product.
     * </p>
     * 
     * @param productId
     *        The identifier of the product.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeProvisioningParametersRequest withProductId(String productId) {
        setProductId(productId);
        return this;
    }

    /**
     * <p>
     * The provisioning artifact identifier for this product.
     * </p>
     * 
     * @param provisioningArtifactId
     *        The provisioning artifact identifier for this product.
     */

    public void setProvisioningArtifactId(String provisioningArtifactId) {
        this.provisioningArtifactId = provisioningArtifactId;
    }

    /**
     * <p>
     * The provisioning artifact identifier for this product.
     * </p>
     * 
     * @return The provisioning artifact identifier for this product.
     */

    public String getProvisioningArtifactId() {
        return this.provisioningArtifactId;
    }

    /**
     * <p>
     * The provisioning artifact identifier for this product.
     * </p>
     * 
     * @param provisioningArtifactId
     *        The provisioning artifact identifier for this product.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeProvisioningParametersRequest withProvisioningArtifactId(
            String provisioningArtifactId) {
        setProvisioningArtifactId(provisioningArtifactId);
        return this;
    }

    /**
     * <p>
     * The identifier of the path for this product's provisioning. This value is
     * optional if the product has a default path, and is required if there is
     * more than one path for the specified product.
     * </p>
     * 
     * @param pathId
     *        The identifier of the path for this product's provisioning. This
     *        value is optional if the product has a default path, and is
     *        required if there is more than one path for the specified product.
     */

    public void setPathId(String pathId) {
        this.pathId = pathId;
    }

    /**
     * <p>
     * The identifier of the path for this product's provisioning. This value is
     * optional if the product has a default path, and is required if there is
     * more than one path for the specified product.
     * </p>
     * 
     * @return The identifier of the path for this product's provisioning. This
     *         value is optional if the product has a default path, and is
     *         required if there is more than one path for the specified
     *         product.
     */

    public String getPathId() {
        return this.pathId;
    }

    /**
     * <p>
     * The identifier of the path for this product's provisioning. This value is
     * optional if the product has a default path, and is required if there is
     * more than one path for the specified product.
     * </p>
     * 
     * @param pathId
     *        The identifier of the path for this product's provisioning. This
     *        value is optional if the product has a default path, and is
     *        required if there is more than one path for the specified product.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeProvisioningParametersRequest withPathId(String pathId) {
        setPathId(pathId);
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
        if (getAcceptLanguage() != null)
            sb.append("AcceptLanguage: " + getAcceptLanguage() + ",");
        if (getProductId() != null)
            sb.append("ProductId: " + getProductId() + ",");
        if (getProvisioningArtifactId() != null)
            sb.append("ProvisioningArtifactId: " + getProvisioningArtifactId()
                    + ",");
        if (getPathId() != null)
            sb.append("PathId: " + getPathId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeProvisioningParametersRequest == false)
            return false;
        DescribeProvisioningParametersRequest other = (DescribeProvisioningParametersRequest) obj;
        if (other.getAcceptLanguage() == null
                ^ this.getAcceptLanguage() == null)
            return false;
        if (other.getAcceptLanguage() != null
                && other.getAcceptLanguage().equals(this.getAcceptLanguage()) == false)
            return false;
        if (other.getProductId() == null ^ this.getProductId() == null)
            return false;
        if (other.getProductId() != null
                && other.getProductId().equals(this.getProductId()) == false)
            return false;
        if (other.getProvisioningArtifactId() == null
                ^ this.getProvisioningArtifactId() == null)
            return false;
        if (other.getProvisioningArtifactId() != null
                && other.getProvisioningArtifactId().equals(
                        this.getProvisioningArtifactId()) == false)
            return false;
        if (other.getPathId() == null ^ this.getPathId() == null)
            return false;
        if (other.getPathId() != null
                && other.getPathId().equals(this.getPathId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAcceptLanguage() == null) ? 0 : getAcceptLanguage()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getProductId() == null) ? 0 : getProductId().hashCode());
        hashCode = prime
                * hashCode
                + ((getProvisioningArtifactId() == null) ? 0
                        : getProvisioningArtifactId().hashCode());
        hashCode = prime * hashCode
                + ((getPathId() == null) ? 0 : getPathId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeProvisioningParametersRequest clone() {
        return (DescribeProvisioningParametersRequest) super.clone();
    }
}

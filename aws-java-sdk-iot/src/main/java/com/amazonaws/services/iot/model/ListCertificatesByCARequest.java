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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input to the ListCertificatesByCA operation.
 * </p>
 */
public class ListCertificatesByCARequest extends
        com.amazonaws.AmazonWebServiceRequest implements Serializable,
        Cloneable {

    /**
     * <p>
     * The ID of the CA certificate. This operation will list all registered
     * device certificate that were signed by this CA certificate.
     * </p>
     */
    private String caCertificateId;
    /**
     * <p>
     * The result page size.
     * </p>
     */
    private Integer pageSize;
    /**
     * <p>
     * The marker for the next set of results.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * Specifies the order for results. If True, the results are returned in
     * ascending order, based on the creation date.
     * </p>
     */
    private Boolean ascendingOrder;

    /**
     * <p>
     * The ID of the CA certificate. This operation will list all registered
     * device certificate that were signed by this CA certificate.
     * </p>
     * 
     * @param caCertificateId
     *        The ID of the CA certificate. This operation will list all
     *        registered device certificate that were signed by this CA
     *        certificate.
     */

    public void setCaCertificateId(String caCertificateId) {
        this.caCertificateId = caCertificateId;
    }

    /**
     * <p>
     * The ID of the CA certificate. This operation will list all registered
     * device certificate that were signed by this CA certificate.
     * </p>
     * 
     * @return The ID of the CA certificate. This operation will list all
     *         registered device certificate that were signed by this CA
     *         certificate.
     */

    public String getCaCertificateId() {
        return this.caCertificateId;
    }

    /**
     * <p>
     * The ID of the CA certificate. This operation will list all registered
     * device certificate that were signed by this CA certificate.
     * </p>
     * 
     * @param caCertificateId
     *        The ID of the CA certificate. This operation will list all
     *        registered device certificate that were signed by this CA
     *        certificate.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListCertificatesByCARequest withCaCertificateId(
            String caCertificateId) {
        setCaCertificateId(caCertificateId);
        return this;
    }

    /**
     * <p>
     * The result page size.
     * </p>
     * 
     * @param pageSize
     *        The result page size.
     */

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * <p>
     * The result page size.
     * </p>
     * 
     * @return The result page size.
     */

    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * <p>
     * The result page size.
     * </p>
     * 
     * @param pageSize
     *        The result page size.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListCertificatesByCARequest withPageSize(Integer pageSize) {
        setPageSize(pageSize);
        return this;
    }

    /**
     * <p>
     * The marker for the next set of results.
     * </p>
     * 
     * @param marker
     *        The marker for the next set of results.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The marker for the next set of results.
     * </p>
     * 
     * @return The marker for the next set of results.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * The marker for the next set of results.
     * </p>
     * 
     * @param marker
     *        The marker for the next set of results.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListCertificatesByCARequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * Specifies the order for results. If True, the results are returned in
     * ascending order, based on the creation date.
     * </p>
     * 
     * @param ascendingOrder
     *        Specifies the order for results. If True, the results are returned
     *        in ascending order, based on the creation date.
     */

    public void setAscendingOrder(Boolean ascendingOrder) {
        this.ascendingOrder = ascendingOrder;
    }

    /**
     * <p>
     * Specifies the order for results. If True, the results are returned in
     * ascending order, based on the creation date.
     * </p>
     * 
     * @return Specifies the order for results. If True, the results are
     *         returned in ascending order, based on the creation date.
     */

    public Boolean getAscendingOrder() {
        return this.ascendingOrder;
    }

    /**
     * <p>
     * Specifies the order for results. If True, the results are returned in
     * ascending order, based on the creation date.
     * </p>
     * 
     * @param ascendingOrder
     *        Specifies the order for results. If True, the results are returned
     *        in ascending order, based on the creation date.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListCertificatesByCARequest withAscendingOrder(Boolean ascendingOrder) {
        setAscendingOrder(ascendingOrder);
        return this;
    }

    /**
     * <p>
     * Specifies the order for results. If True, the results are returned in
     * ascending order, based on the creation date.
     * </p>
     * 
     * @return Specifies the order for results. If True, the results are
     *         returned in ascending order, based on the creation date.
     */

    public Boolean isAscendingOrder() {
        return this.ascendingOrder;
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
        if (getCaCertificateId() != null)
            sb.append("CaCertificateId: " + getCaCertificateId() + ",");
        if (getPageSize() != null)
            sb.append("PageSize: " + getPageSize() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getAscendingOrder() != null)
            sb.append("AscendingOrder: " + getAscendingOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCertificatesByCARequest == false)
            return false;
        ListCertificatesByCARequest other = (ListCertificatesByCARequest) obj;
        if (other.getCaCertificateId() == null
                ^ this.getCaCertificateId() == null)
            return false;
        if (other.getCaCertificateId() != null
                && other.getCaCertificateId().equals(this.getCaCertificateId()) == false)
            return false;
        if (other.getPageSize() == null ^ this.getPageSize() == null)
            return false;
        if (other.getPageSize() != null
                && other.getPageSize().equals(this.getPageSize()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null
                && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getAscendingOrder() == null
                ^ this.getAscendingOrder() == null)
            return false;
        if (other.getAscendingOrder() != null
                && other.getAscendingOrder().equals(this.getAscendingOrder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCaCertificateId() == null) ? 0 : getCaCertificateId()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        hashCode = prime * hashCode
                + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime
                * hashCode
                + ((getAscendingOrder() == null) ? 0 : getAscendingOrder()
                        .hashCode());
        return hashCode;
    }

    @Override
    public ListCertificatesByCARequest clone() {
        return (ListCertificatesByCARequest) super.clone();
    }
}

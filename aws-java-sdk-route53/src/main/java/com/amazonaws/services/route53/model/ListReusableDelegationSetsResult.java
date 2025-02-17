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
package com.amazonaws.services.route53.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that contains information about the reusable delegation sets
 * that are associated with the current AWS account.
 * </p>
 */
public class ListReusableDelegationSetsResult extends
        com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata>
        implements Serializable, Cloneable {

    /**
     * <p>
     * A complex type that contains one <code>DelegationSet</code> element for
     * each reusable delegation set that was created by the current AWS account.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DelegationSet> delegationSets;
    /**
     * <p>
     * For the second and subsequent calls to
     * <code>ListReusableDelegationSets</code>, <code>Marker</code> is the value
     * that you specified for the marker parameter in the request that produced
     * the current response.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * A flag that indicates whether there are more reusable delegation sets to
     * be listed. If the response is truncated, you can get the next group of
     * <code>maxitems</code> reusable delegation sets by calling
     * <code>ListReusableDelegationSets</code> again and specifying the value of
     * the <code>NextMarker</code> element in the <code>marker</code> parameter.
     * </p>
     */
    private Boolean isTruncated;
    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, the value of
     * <code>NextMarker</code> identifies the first reusable delegation set in
     * the next group of <code>maxitems</code> reusable delegation sets. Call
     * <code>ListReusableDelegationSets</code> again and specify the value of
     * <code>NextMarker</code> in the <code>marker</code> parameter.
     * </p>
     */
    private String nextMarker;
    /**
     * <p>
     * The value that you specified for the <code>maxitems</code> parameter in
     * the call to <code>ListReusableDelegationSets</code> that produced the
     * current response.
     * </p>
     */
    private String maxItems;

    /**
     * <p>
     * A complex type that contains one <code>DelegationSet</code> element for
     * each reusable delegation set that was created by the current AWS account.
     * </p>
     * 
     * @return A complex type that contains one <code>DelegationSet</code>
     *         element for each reusable delegation set that was created by the
     *         current AWS account.
     */

    public java.util.List<DelegationSet> getDelegationSets() {
        if (delegationSets == null) {
            delegationSets = new com.amazonaws.internal.SdkInternalList<DelegationSet>();
        }
        return delegationSets;
    }

    /**
     * <p>
     * A complex type that contains one <code>DelegationSet</code> element for
     * each reusable delegation set that was created by the current AWS account.
     * </p>
     * 
     * @param delegationSets
     *        A complex type that contains one <code>DelegationSet</code>
     *        element for each reusable delegation set that was created by the
     *        current AWS account.
     */

    public void setDelegationSets(
            java.util.Collection<DelegationSet> delegationSets) {
        if (delegationSets == null) {
            this.delegationSets = null;
            return;
        }

        this.delegationSets = new com.amazonaws.internal.SdkInternalList<DelegationSet>(
                delegationSets);
    }

    /**
     * <p>
     * A complex type that contains one <code>DelegationSet</code> element for
     * each reusable delegation set that was created by the current AWS account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setDelegationSets(java.util.Collection)} or
     * {@link #withDelegationSets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param delegationSets
     *        A complex type that contains one <code>DelegationSet</code>
     *        element for each reusable delegation set that was created by the
     *        current AWS account.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListReusableDelegationSetsResult withDelegationSets(
            DelegationSet... delegationSets) {
        if (this.delegationSets == null) {
            setDelegationSets(new com.amazonaws.internal.SdkInternalList<DelegationSet>(
                    delegationSets.length));
        }
        for (DelegationSet ele : delegationSets) {
            this.delegationSets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A complex type that contains one <code>DelegationSet</code> element for
     * each reusable delegation set that was created by the current AWS account.
     * </p>
     * 
     * @param delegationSets
     *        A complex type that contains one <code>DelegationSet</code>
     *        element for each reusable delegation set that was created by the
     *        current AWS account.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListReusableDelegationSetsResult withDelegationSets(
            java.util.Collection<DelegationSet> delegationSets) {
        setDelegationSets(delegationSets);
        return this;
    }

    /**
     * <p>
     * For the second and subsequent calls to
     * <code>ListReusableDelegationSets</code>, <code>Marker</code> is the value
     * that you specified for the marker parameter in the request that produced
     * the current response.
     * </p>
     * 
     * @param marker
     *        For the second and subsequent calls to
     *        <code>ListReusableDelegationSets</code>, <code>Marker</code> is
     *        the value that you specified for the marker parameter in the
     *        request that produced the current response.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * For the second and subsequent calls to
     * <code>ListReusableDelegationSets</code>, <code>Marker</code> is the value
     * that you specified for the marker parameter in the request that produced
     * the current response.
     * </p>
     * 
     * @return For the second and subsequent calls to
     *         <code>ListReusableDelegationSets</code>, <code>Marker</code> is
     *         the value that you specified for the marker parameter in the
     *         request that produced the current response.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * For the second and subsequent calls to
     * <code>ListReusableDelegationSets</code>, <code>Marker</code> is the value
     * that you specified for the marker parameter in the request that produced
     * the current response.
     * </p>
     * 
     * @param marker
     *        For the second and subsequent calls to
     *        <code>ListReusableDelegationSets</code>, <code>Marker</code> is
     *        the value that you specified for the marker parameter in the
     *        request that produced the current response.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListReusableDelegationSetsResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether there are more reusable delegation sets to
     * be listed. If the response is truncated, you can get the next group of
     * <code>maxitems</code> reusable delegation sets by calling
     * <code>ListReusableDelegationSets</code> again and specifying the value of
     * the <code>NextMarker</code> element in the <code>marker</code> parameter.
     * </p>
     * 
     * @param isTruncated
     *        A flag that indicates whether there are more reusable delegation
     *        sets to be listed. If the response is truncated, you can get the
     *        next group of <code>maxitems</code> reusable delegation sets by
     *        calling <code>ListReusableDelegationSets</code> again and
     *        specifying the value of the <code>NextMarker</code> element in the
     *        <code>marker</code> parameter.
     */

    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more reusable delegation sets to
     * be listed. If the response is truncated, you can get the next group of
     * <code>maxitems</code> reusable delegation sets by calling
     * <code>ListReusableDelegationSets</code> again and specifying the value of
     * the <code>NextMarker</code> element in the <code>marker</code> parameter.
     * </p>
     * 
     * @return A flag that indicates whether there are more reusable delegation
     *         sets to be listed. If the response is truncated, you can get the
     *         next group of <code>maxitems</code> reusable delegation sets by
     *         calling <code>ListReusableDelegationSets</code> again and
     *         specifying the value of the <code>NextMarker</code> element in
     *         the <code>marker</code> parameter.
     */

    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more reusable delegation sets to
     * be listed. If the response is truncated, you can get the next group of
     * <code>maxitems</code> reusable delegation sets by calling
     * <code>ListReusableDelegationSets</code> again and specifying the value of
     * the <code>NextMarker</code> element in the <code>marker</code> parameter.
     * </p>
     * 
     * @param isTruncated
     *        A flag that indicates whether there are more reusable delegation
     *        sets to be listed. If the response is truncated, you can get the
     *        next group of <code>maxitems</code> reusable delegation sets by
     *        calling <code>ListReusableDelegationSets</code> again and
     *        specifying the value of the <code>NextMarker</code> element in the
     *        <code>marker</code> parameter.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListReusableDelegationSetsResult withIsTruncated(Boolean isTruncated) {
        setIsTruncated(isTruncated);
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether there are more reusable delegation sets to
     * be listed. If the response is truncated, you can get the next group of
     * <code>maxitems</code> reusable delegation sets by calling
     * <code>ListReusableDelegationSets</code> again and specifying the value of
     * the <code>NextMarker</code> element in the <code>marker</code> parameter.
     * </p>
     * 
     * @return A flag that indicates whether there are more reusable delegation
     *         sets to be listed. If the response is truncated, you can get the
     *         next group of <code>maxitems</code> reusable delegation sets by
     *         calling <code>ListReusableDelegationSets</code> again and
     *         specifying the value of the <code>NextMarker</code> element in
     *         the <code>marker</code> parameter.
     */

    public Boolean isTruncated() {
        return this.isTruncated;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, the value of
     * <code>NextMarker</code> identifies the first reusable delegation set in
     * the next group of <code>maxitems</code> reusable delegation sets. Call
     * <code>ListReusableDelegationSets</code> again and specify the value of
     * <code>NextMarker</code> in the <code>marker</code> parameter.
     * </p>
     * 
     * @param nextMarker
     *        If <code>IsTruncated</code> is <code>true</code>, the value of
     *        <code>NextMarker</code> identifies the first reusable delegation
     *        set in the next group of <code>maxitems</code> reusable delegation
     *        sets. Call <code>ListReusableDelegationSets</code> again and
     *        specify the value of <code>NextMarker</code> in the
     *        <code>marker</code> parameter.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, the value of
     * <code>NextMarker</code> identifies the first reusable delegation set in
     * the next group of <code>maxitems</code> reusable delegation sets. Call
     * <code>ListReusableDelegationSets</code> again and specify the value of
     * <code>NextMarker</code> in the <code>marker</code> parameter.
     * </p>
     * 
     * @return If <code>IsTruncated</code> is <code>true</code>, the value of
     *         <code>NextMarker</code> identifies the first reusable delegation
     *         set in the next group of <code>maxitems</code> reusable
     *         delegation sets. Call <code>ListReusableDelegationSets</code>
     *         again and specify the value of <code>NextMarker</code> in the
     *         <code>marker</code> parameter.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, the value of
     * <code>NextMarker</code> identifies the first reusable delegation set in
     * the next group of <code>maxitems</code> reusable delegation sets. Call
     * <code>ListReusableDelegationSets</code> again and specify the value of
     * <code>NextMarker</code> in the <code>marker</code> parameter.
     * </p>
     * 
     * @param nextMarker
     *        If <code>IsTruncated</code> is <code>true</code>, the value of
     *        <code>NextMarker</code> identifies the first reusable delegation
     *        set in the next group of <code>maxitems</code> reusable delegation
     *        sets. Call <code>ListReusableDelegationSets</code> again and
     *        specify the value of <code>NextMarker</code> in the
     *        <code>marker</code> parameter.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListReusableDelegationSetsResult withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
        return this;
    }

    /**
     * <p>
     * The value that you specified for the <code>maxitems</code> parameter in
     * the call to <code>ListReusableDelegationSets</code> that produced the
     * current response.
     * </p>
     * 
     * @param maxItems
     *        The value that you specified for the <code>maxitems</code>
     *        parameter in the call to <code>ListReusableDelegationSets</code>
     *        that produced the current response.
     */

    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The value that you specified for the <code>maxitems</code> parameter in
     * the call to <code>ListReusableDelegationSets</code> that produced the
     * current response.
     * </p>
     * 
     * @return The value that you specified for the <code>maxitems</code>
     *         parameter in the call to <code>ListReusableDelegationSets</code>
     *         that produced the current response.
     */

    public String getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * The value that you specified for the <code>maxitems</code> parameter in
     * the call to <code>ListReusableDelegationSets</code> that produced the
     * current response.
     * </p>
     * 
     * @param maxItems
     *        The value that you specified for the <code>maxitems</code>
     *        parameter in the call to <code>ListReusableDelegationSets</code>
     *        that produced the current response.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListReusableDelegationSetsResult withMaxItems(String maxItems) {
        setMaxItems(maxItems);
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
        if (getDelegationSets() != null)
            sb.append("DelegationSets: " + getDelegationSets() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getIsTruncated() != null)
            sb.append("IsTruncated: " + getIsTruncated() + ",");
        if (getNextMarker() != null)
            sb.append("NextMarker: " + getNextMarker() + ",");
        if (getMaxItems() != null)
            sb.append("MaxItems: " + getMaxItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListReusableDelegationSetsResult == false)
            return false;
        ListReusableDelegationSetsResult other = (ListReusableDelegationSetsResult) obj;
        if (other.getDelegationSets() == null
                ^ this.getDelegationSets() == null)
            return false;
        if (other.getDelegationSets() != null
                && other.getDelegationSets().equals(this.getDelegationSets()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null
                && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getIsTruncated() == null ^ this.getIsTruncated() == null)
            return false;
        if (other.getIsTruncated() != null
                && other.getIsTruncated().equals(this.getIsTruncated()) == false)
            return false;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null
                && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null
                && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDelegationSets() == null) ? 0 : getDelegationSets()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime
                * hashCode
                + ((getIsTruncated() == null) ? 0 : getIsTruncated().hashCode());
        hashCode = prime * hashCode
                + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        hashCode = prime * hashCode
                + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public ListReusableDelegationSetsResult clone() {
        try {
            return (ListReusableDelegationSetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

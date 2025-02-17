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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * </p>
 */
public class DescribeDefaultClusterParametersRequest extends
        com.amazonaws.AmazonWebServiceRequest implements Serializable,
        Cloneable {

    /**
     * <p>
     * The name of the cluster parameter group family.
     * </p>
     */
    private String parameterGroupFamily;
    /**
     * <p>
     * The maximum number of response records to return in each call. If the
     * number of remaining response records exceeds the specified
     * <code>MaxRecords</code> value, a value is returned in a
     * <code>marker</code> field of the response. You can retrieve the next set
     * of records by retrying the command with the returned marker value.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     * <p>
     * Constraints: minimum 20, maximum 100.
     * </p>
     */
    private Integer maxRecords;
    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set
     * of response records. When the results of a
     * <a>DescribeDefaultClusterParameters</a> request exceed the value
     * specified in <code>MaxRecords</code>, AWS returns a value in the
     * <code>Marker</code> field of the response. You can retrieve the next set
     * of response records by providing the returned marker value in the
     * <code>Marker</code> parameter and retrying the request.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The name of the cluster parameter group family.
     * </p>
     * 
     * @param parameterGroupFamily
     *        The name of the cluster parameter group family.
     */

    public void setParameterGroupFamily(String parameterGroupFamily) {
        this.parameterGroupFamily = parameterGroupFamily;
    }

    /**
     * <p>
     * The name of the cluster parameter group family.
     * </p>
     * 
     * @return The name of the cluster parameter group family.
     */

    public String getParameterGroupFamily() {
        return this.parameterGroupFamily;
    }

    /**
     * <p>
     * The name of the cluster parameter group family.
     * </p>
     * 
     * @param parameterGroupFamily
     *        The name of the cluster parameter group family.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeDefaultClusterParametersRequest withParameterGroupFamily(
            String parameterGroupFamily) {
        setParameterGroupFamily(parameterGroupFamily);
        return this;
    }

    /**
     * <p>
     * The maximum number of response records to return in each call. If the
     * number of remaining response records exceeds the specified
     * <code>MaxRecords</code> value, a value is returned in a
     * <code>marker</code> field of the response. You can retrieve the next set
     * of records by retrying the command with the returned marker value.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     * <p>
     * Constraints: minimum 20, maximum 100.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of response records to return in each call. If
     *        the number of remaining response records exceeds the specified
     *        <code>MaxRecords</code> value, a value is returned in a
     *        <code>marker</code> field of the response. You can retrieve the
     *        next set of records by retrying the command with the returned
     *        marker value. </p>
     *        <p>
     *        Default: <code>100</code>
     *        </p>
     *        <p>
     *        Constraints: minimum 20, maximum 100.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of response records to return in each call. If the
     * number of remaining response records exceeds the specified
     * <code>MaxRecords</code> value, a value is returned in a
     * <code>marker</code> field of the response. You can retrieve the next set
     * of records by retrying the command with the returned marker value.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     * <p>
     * Constraints: minimum 20, maximum 100.
     * </p>
     * 
     * @return The maximum number of response records to return in each call. If
     *         the number of remaining response records exceeds the specified
     *         <code>MaxRecords</code> value, a value is returned in a
     *         <code>marker</code> field of the response. You can retrieve the
     *         next set of records by retrying the command with the returned
     *         marker value. </p>
     *         <p>
     *         Default: <code>100</code>
     *         </p>
     *         <p>
     *         Constraints: minimum 20, maximum 100.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * The maximum number of response records to return in each call. If the
     * number of remaining response records exceeds the specified
     * <code>MaxRecords</code> value, a value is returned in a
     * <code>marker</code> field of the response. You can retrieve the next set
     * of records by retrying the command with the returned marker value.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     * <p>
     * Constraints: minimum 20, maximum 100.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of response records to return in each call. If
     *        the number of remaining response records exceeds the specified
     *        <code>MaxRecords</code> value, a value is returned in a
     *        <code>marker</code> field of the response. You can retrieve the
     *        next set of records by retrying the command with the returned
     *        marker value. </p>
     *        <p>
     *        Default: <code>100</code>
     *        </p>
     *        <p>
     *        Constraints: minimum 20, maximum 100.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeDefaultClusterParametersRequest withMaxRecords(
            Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
    }

    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set
     * of response records. When the results of a
     * <a>DescribeDefaultClusterParameters</a> request exceed the value
     * specified in <code>MaxRecords</code>, AWS returns a value in the
     * <code>Marker</code> field of the response. You can retrieve the next set
     * of response records by providing the returned marker value in the
     * <code>Marker</code> parameter and retrying the request.
     * </p>
     * 
     * @param marker
     *        An optional parameter that specifies the starting point to return
     *        a set of response records. When the results of a
     *        <a>DescribeDefaultClusterParameters</a> request exceed the value
     *        specified in <code>MaxRecords</code>, AWS returns a value in the
     *        <code>Marker</code> field of the response. You can retrieve the
     *        next set of response records by providing the returned marker
     *        value in the <code>Marker</code> parameter and retrying the
     *        request.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set
     * of response records. When the results of a
     * <a>DescribeDefaultClusterParameters</a> request exceed the value
     * specified in <code>MaxRecords</code>, AWS returns a value in the
     * <code>Marker</code> field of the response. You can retrieve the next set
     * of response records by providing the returned marker value in the
     * <code>Marker</code> parameter and retrying the request.
     * </p>
     * 
     * @return An optional parameter that specifies the starting point to return
     *         a set of response records. When the results of a
     *         <a>DescribeDefaultClusterParameters</a> request exceed the value
     *         specified in <code>MaxRecords</code>, AWS returns a value in the
     *         <code>Marker</code> field of the response. You can retrieve the
     *         next set of response records by providing the returned marker
     *         value in the <code>Marker</code> parameter and retrying the
     *         request.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set
     * of response records. When the results of a
     * <a>DescribeDefaultClusterParameters</a> request exceed the value
     * specified in <code>MaxRecords</code>, AWS returns a value in the
     * <code>Marker</code> field of the response. You can retrieve the next set
     * of response records by providing the returned marker value in the
     * <code>Marker</code> parameter and retrying the request.
     * </p>
     * 
     * @param marker
     *        An optional parameter that specifies the starting point to return
     *        a set of response records. When the results of a
     *        <a>DescribeDefaultClusterParameters</a> request exceed the value
     *        specified in <code>MaxRecords</code>, AWS returns a value in the
     *        <code>Marker</code> field of the response. You can retrieve the
     *        next set of response records by providing the returned marker
     *        value in the <code>Marker</code> parameter and retrying the
     *        request.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeDefaultClusterParametersRequest withMarker(String marker) {
        setMarker(marker);
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
        if (getParameterGroupFamily() != null)
            sb.append("ParameterGroupFamily: " + getParameterGroupFamily()
                    + ",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDefaultClusterParametersRequest == false)
            return false;
        DescribeDefaultClusterParametersRequest other = (DescribeDefaultClusterParametersRequest) obj;
        if (other.getParameterGroupFamily() == null
                ^ this.getParameterGroupFamily() == null)
            return false;
        if (other.getParameterGroupFamily() != null
                && other.getParameterGroupFamily().equals(
                        this.getParameterGroupFamily()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null
                && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null
                && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getParameterGroupFamily() == null) ? 0
                        : getParameterGroupFamily().hashCode());
        hashCode = prime * hashCode
                + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode
                + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDefaultClusterParametersRequest clone() {
        return (DescribeDefaultClusterParametersRequest) super.clone();
    }
}

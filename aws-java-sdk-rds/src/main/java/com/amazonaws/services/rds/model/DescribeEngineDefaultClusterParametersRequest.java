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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 */
public class DescribeEngineDefaultClusterParametersRequest extends
        com.amazonaws.AmazonWebServiceRequest implements Serializable,
        Cloneable {

    /**
     * <p>
     * The name of the DB cluster parameter group family to return engine
     * parameter information for.
     * </p>
     */
    private String dBParameterGroupFamily;
    /**
     * <p>
     * This parameter is not currently supported.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The maximum number of records to include in the response. If more records
     * exist than the specified <code>MaxRecords</code> value, a pagination
     * token called a marker is included in the response so that the remaining
     * results can be retrieved.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     */
    private Integer maxRecords;
    /**
     * <p>
     * An optional pagination token provided by a previous
     * <code>DescribeEngineDefaultClusterParameters</code> request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The name of the DB cluster parameter group family to return engine
     * parameter information for.
     * </p>
     * 
     * @param dBParameterGroupFamily
     *        The name of the DB cluster parameter group family to return engine
     *        parameter information for.
     */

    public void setDBParameterGroupFamily(String dBParameterGroupFamily) {
        this.dBParameterGroupFamily = dBParameterGroupFamily;
    }

    /**
     * <p>
     * The name of the DB cluster parameter group family to return engine
     * parameter information for.
     * </p>
     * 
     * @return The name of the DB cluster parameter group family to return
     *         engine parameter information for.
     */

    public String getDBParameterGroupFamily() {
        return this.dBParameterGroupFamily;
    }

    /**
     * <p>
     * The name of the DB cluster parameter group family to return engine
     * parameter information for.
     * </p>
     * 
     * @param dBParameterGroupFamily
     *        The name of the DB cluster parameter group family to return engine
     *        parameter information for.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeEngineDefaultClusterParametersRequest withDBParameterGroupFamily(
            String dBParameterGroupFamily) {
        setDBParameterGroupFamily(dBParameterGroupFamily);
        return this;
    }

    /**
     * <p>
     * This parameter is not currently supported.
     * </p>
     * 
     * @return This parameter is not currently supported.
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * This parameter is not currently supported.
     * </p>
     * 
     * @param filters
     *        This parameter is not currently supported.
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<Filter>(
                filters);
    }

    /**
     * <p>
     * This parameter is not currently supported.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setFilters(java.util.Collection)} or
     * {@link #withFilters(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param filters
     *        This parameter is not currently supported.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeEngineDefaultClusterParametersRequest withFilters(
            Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<Filter>(
                    filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * This parameter is not currently supported.
     * </p>
     * 
     * @param filters
     *        This parameter is not currently supported.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeEngineDefaultClusterParametersRequest withFilters(
            java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records
     * exist than the specified <code>MaxRecords</code> value, a pagination
     * token called a marker is included in the response so that the remaining
     * results can be retrieved.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response. If more
     *        records exist than the specified <code>MaxRecords</code> value, a
     *        pagination token called a marker is included in the response so
     *        that the remaining results can be retrieved. </p>
     *        <p>
     *        Default: 100
     *        </p>
     *        <p>
     *        Constraints: Minimum 20, maximum 100.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records
     * exist than the specified <code>MaxRecords</code> value, a pagination
     * token called a marker is included in the response so that the remaining
     * results can be retrieved.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     * 
     * @return The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         pagination token called a marker is included in the response so
     *         that the remaining results can be retrieved. </p>
     *         <p>
     *         Default: 100
     *         </p>
     *         <p>
     *         Constraints: Minimum 20, maximum 100.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records
     * exist than the specified <code>MaxRecords</code> value, a pagination
     * token called a marker is included in the response so that the remaining
     * results can be retrieved.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response. If more
     *        records exist than the specified <code>MaxRecords</code> value, a
     *        pagination token called a marker is included in the response so
     *        that the remaining results can be retrieved. </p>
     *        <p>
     *        Default: 100
     *        </p>
     *        <p>
     *        Constraints: Minimum 20, maximum 100.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeEngineDefaultClusterParametersRequest withMaxRecords(
            Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous
     * <code>DescribeEngineDefaultClusterParameters</code> request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous
     *        <code>DescribeEngineDefaultClusterParameters</code> request. If
     *        this parameter is specified, the response includes only records
     *        beyond the marker, up to the value specified by
     *        <code>MaxRecords</code>.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous
     * <code>DescribeEngineDefaultClusterParameters</code> request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @return An optional pagination token provided by a previous
     *         <code>DescribeEngineDefaultClusterParameters</code> request. If
     *         this parameter is specified, the response includes only records
     *         beyond the marker, up to the value specified by
     *         <code>MaxRecords</code>.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous
     * <code>DescribeEngineDefaultClusterParameters</code> request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous
     *        <code>DescribeEngineDefaultClusterParameters</code> request. If
     *        this parameter is specified, the response includes only records
     *        beyond the marker, up to the value specified by
     *        <code>MaxRecords</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeEngineDefaultClusterParametersRequest withMarker(
            String marker) {
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
        if (getDBParameterGroupFamily() != null)
            sb.append("DBParameterGroupFamily: " + getDBParameterGroupFamily()
                    + ",");
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
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

        if (obj instanceof DescribeEngineDefaultClusterParametersRequest == false)
            return false;
        DescribeEngineDefaultClusterParametersRequest other = (DescribeEngineDefaultClusterParametersRequest) obj;
        if (other.getDBParameterGroupFamily() == null
                ^ this.getDBParameterGroupFamily() == null)
            return false;
        if (other.getDBParameterGroupFamily() != null
                && other.getDBParameterGroupFamily().equals(
                        this.getDBParameterGroupFamily()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null
                && other.getFilters().equals(this.getFilters()) == false)
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
                + ((getDBParameterGroupFamily() == null) ? 0
                        : getDBParameterGroupFamily().hashCode());
        hashCode = prime * hashCode
                + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode
                + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode
                + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEngineDefaultClusterParametersRequest clone() {
        return (DescribeEngineDefaultClusterParametersRequest) super.clone();
    }
}

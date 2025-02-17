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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a <i>DescribeCacheEngineVersions</i> action.
 * </p>
 */
public class DescribeCacheEngineVersionsRequest extends
        com.amazonaws.AmazonWebServiceRequest implements Serializable,
        Cloneable {

    /**
     * <p>
     * The cache engine to return. Valid values: <code>memcached</code> |
     * <code>redis</code>
     * </p>
     */
    private String engine;
    /**
     * <p>
     * The cache engine version to return.
     * </p>
     * <p>
     * Example: <code>1.4.14</code>
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The name of a specific cache parameter group family to return details
     * for.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     */
    private String cacheParameterGroupFamily;
    /**
     * <p>
     * The maximum number of records to include in the response. If more records
     * exist than the specified <code>MaxRecords</code> value, a marker is
     * included in the response so that the remaining results can be retrieved.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: minimum 20; maximum 100.
     * </p>
     */
    private Integer maxRecords;
    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for
     * pagination of results from this action. If this parameter is specified,
     * the response includes only records beyond the marker, up to the value
     * specified by <i>MaxRecords</i>.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * If <i>true</i>, specifies that only the default version of the specified
     * engine or engine and major version combination is to be returned.
     * </p>
     */
    private Boolean defaultOnly;

    /**
     * <p>
     * The cache engine to return. Valid values: <code>memcached</code> |
     * <code>redis</code>
     * </p>
     * 
     * @param engine
     *        The cache engine to return. Valid values: <code>memcached</code> |
     *        <code>redis</code>
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The cache engine to return. Valid values: <code>memcached</code> |
     * <code>redis</code>
     * </p>
     * 
     * @return The cache engine to return. Valid values: <code>memcached</code>
     *         | <code>redis</code>
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The cache engine to return. Valid values: <code>memcached</code> |
     * <code>redis</code>
     * </p>
     * 
     * @param engine
     *        The cache engine to return. Valid values: <code>memcached</code> |
     *        <code>redis</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeCacheEngineVersionsRequest withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The cache engine version to return.
     * </p>
     * <p>
     * Example: <code>1.4.14</code>
     * </p>
     * 
     * @param engineVersion
     *        The cache engine version to return.</p>
     *        <p>
     *        Example: <code>1.4.14</code>
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The cache engine version to return.
     * </p>
     * <p>
     * Example: <code>1.4.14</code>
     * </p>
     * 
     * @return The cache engine version to return.</p>
     *         <p>
     *         Example: <code>1.4.14</code>
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The cache engine version to return.
     * </p>
     * <p>
     * Example: <code>1.4.14</code>
     * </p>
     * 
     * @param engineVersion
     *        The cache engine version to return.</p>
     *        <p>
     *        Example: <code>1.4.14</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeCacheEngineVersionsRequest withEngineVersion(
            String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The name of a specific cache parameter group family to return details
     * for.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * 
     * @param cacheParameterGroupFamily
     *        The name of a specific cache parameter group family to return
     *        details for.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 255 alphanumeric characters
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens
     *        </p>
     *        </li>
     */

    public void setCacheParameterGroupFamily(String cacheParameterGroupFamily) {
        this.cacheParameterGroupFamily = cacheParameterGroupFamily;
    }

    /**
     * <p>
     * The name of a specific cache parameter group family to return details
     * for.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of a specific cache parameter group family to return
     *         details for.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be 1 to 255 alphanumeric characters
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot end with a hyphen or contain two consecutive hyphens
     *         </p>
     *         </li>
     */

    public String getCacheParameterGroupFamily() {
        return this.cacheParameterGroupFamily;
    }

    /**
     * <p>
     * The name of a specific cache parameter group family to return details
     * for.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * 
     * @param cacheParameterGroupFamily
     *        The name of a specific cache parameter group family to return
     *        details for.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 255 alphanumeric characters
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeCacheEngineVersionsRequest withCacheParameterGroupFamily(
            String cacheParameterGroupFamily) {
        setCacheParameterGroupFamily(cacheParameterGroupFamily);
        return this;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records
     * exist than the specified <code>MaxRecords</code> value, a marker is
     * included in the response so that the remaining results can be retrieved.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: minimum 20; maximum 100.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response. If more
     *        records exist than the specified <code>MaxRecords</code> value, a
     *        marker is included in the response so that the remaining results
     *        can be retrieved.</p>
     *        <p>
     *        Default: 100
     *        </p>
     *        <p>
     *        Constraints: minimum 20; maximum 100.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records
     * exist than the specified <code>MaxRecords</code> value, a marker is
     * included in the response so that the remaining results can be retrieved.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: minimum 20; maximum 100.
     * </p>
     * 
     * @return The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         marker is included in the response so that the remaining results
     *         can be retrieved.</p>
     *         <p>
     *         Default: 100
     *         </p>
     *         <p>
     *         Constraints: minimum 20; maximum 100.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records
     * exist than the specified <code>MaxRecords</code> value, a marker is
     * included in the response so that the remaining results can be retrieved.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: minimum 20; maximum 100.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response. If more
     *        records exist than the specified <code>MaxRecords</code> value, a
     *        marker is included in the response so that the remaining results
     *        can be retrieved.</p>
     *        <p>
     *        Default: 100
     *        </p>
     *        <p>
     *        Constraints: minimum 20; maximum 100.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeCacheEngineVersionsRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
    }

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for
     * pagination of results from this action. If this parameter is specified,
     * the response includes only records beyond the marker, up to the value
     * specified by <i>MaxRecords</i>.
     * </p>
     * 
     * @param marker
     *        An optional marker returned from a prior request. Use this marker
     *        for pagination of results from this action. If this parameter is
     *        specified, the response includes only records beyond the marker,
     *        up to the value specified by <i>MaxRecords</i>.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for
     * pagination of results from this action. If this parameter is specified,
     * the response includes only records beyond the marker, up to the value
     * specified by <i>MaxRecords</i>.
     * </p>
     * 
     * @return An optional marker returned from a prior request. Use this marker
     *         for pagination of results from this action. If this parameter is
     *         specified, the response includes only records beyond the marker,
     *         up to the value specified by <i>MaxRecords</i>.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for
     * pagination of results from this action. If this parameter is specified,
     * the response includes only records beyond the marker, up to the value
     * specified by <i>MaxRecords</i>.
     * </p>
     * 
     * @param marker
     *        An optional marker returned from a prior request. Use this marker
     *        for pagination of results from this action. If this parameter is
     *        specified, the response includes only records beyond the marker,
     *        up to the value specified by <i>MaxRecords</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeCacheEngineVersionsRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * If <i>true</i>, specifies that only the default version of the specified
     * engine or engine and major version combination is to be returned.
     * </p>
     * 
     * @param defaultOnly
     *        If <i>true</i>, specifies that only the default version of the
     *        specified engine or engine and major version combination is to be
     *        returned.
     */

    public void setDefaultOnly(Boolean defaultOnly) {
        this.defaultOnly = defaultOnly;
    }

    /**
     * <p>
     * If <i>true</i>, specifies that only the default version of the specified
     * engine or engine and major version combination is to be returned.
     * </p>
     * 
     * @return If <i>true</i>, specifies that only the default version of the
     *         specified engine or engine and major version combination is to be
     *         returned.
     */

    public Boolean getDefaultOnly() {
        return this.defaultOnly;
    }

    /**
     * <p>
     * If <i>true</i>, specifies that only the default version of the specified
     * engine or engine and major version combination is to be returned.
     * </p>
     * 
     * @param defaultOnly
     *        If <i>true</i>, specifies that only the default version of the
     *        specified engine or engine and major version combination is to be
     *        returned.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeCacheEngineVersionsRequest withDefaultOnly(
            Boolean defaultOnly) {
        setDefaultOnly(defaultOnly);
        return this;
    }

    /**
     * <p>
     * If <i>true</i>, specifies that only the default version of the specified
     * engine or engine and major version combination is to be returned.
     * </p>
     * 
     * @return If <i>true</i>, specifies that only the default version of the
     *         specified engine or engine and major version combination is to be
     *         returned.
     */

    public Boolean isDefaultOnly() {
        return this.defaultOnly;
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
        if (getEngine() != null)
            sb.append("Engine: " + getEngine() + ",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getCacheParameterGroupFamily() != null)
            sb.append("CacheParameterGroupFamily: "
                    + getCacheParameterGroupFamily() + ",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getDefaultOnly() != null)
            sb.append("DefaultOnly: " + getDefaultOnly());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCacheEngineVersionsRequest == false)
            return false;
        DescribeCacheEngineVersionsRequest other = (DescribeCacheEngineVersionsRequest) obj;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null
                && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null
                && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getCacheParameterGroupFamily() == null
                ^ this.getCacheParameterGroupFamily() == null)
            return false;
        if (other.getCacheParameterGroupFamily() != null
                && other.getCacheParameterGroupFamily().equals(
                        this.getCacheParameterGroupFamily()) == false)
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
        if (other.getDefaultOnly() == null ^ this.getDefaultOnly() == null)
            return false;
        if (other.getDefaultOnly() != null
                && other.getDefaultOnly().equals(this.getDefaultOnly()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime
                * hashCode
                + ((getEngineVersion() == null) ? 0 : getEngineVersion()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getCacheParameterGroupFamily() == null) ? 0
                        : getCacheParameterGroupFamily().hashCode());
        hashCode = prime * hashCode
                + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode
                + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime
                * hashCode
                + ((getDefaultOnly() == null) ? 0 : getDefaultOnly().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCacheEngineVersionsRequest clone() {
        return (DescribeCacheEngineVersionsRequest) super.clone();
    }
}

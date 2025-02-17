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
 * Represents the input of a <i>DescribeReservedCacheNodesOfferings</i> action.
 * </p>
 */
public class DescribeReservedCacheNodesOfferingsRequest extends
        com.amazonaws.AmazonWebServiceRequest implements Serializable,
        Cloneable {

    /**
     * <p>
     * The offering identifier filter value. Use this parameter to show only the
     * available offering that matches the specified reservation identifier.
     * </p>
     * <p>
     * Example: <code>438012d3-4052-4cc7-b2e3-8d3372e0e706</code>
     * </p>
     */
    private String reservedCacheNodesOfferingId;
    /**
     * <p>
     * The cache node type filter value. Use this parameter to show only the
     * available offerings matching the specified cache node type.
     * </p>
     * <p>
     * Valid node types are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General purpose:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation: <code>cache.t2.micro</code>,
     * <code>cache.t2.small</code>, <code>cache.t2.medium</code>,
     * <code>cache.m3.medium</code>, <code>cache.m3.large</code>,
     * <code>cache.m3.xlarge</code>, <code>cache.m3.2xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: <code>cache.t1.micro</code>,
     * <code>cache.m1.small</code>, <code>cache.m1.medium</code>,
     * <code>cache.m1.large</code>, <code>cache.m1.xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Compute optimized: <code>cache.c1.xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Memory optimized:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation: <code>cache.r3.large</code>,
     * <code>cache.r3.xlarge</code>, <code>cache.r3.2xlarge</code>,
     * <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: <code>cache.m2.xlarge</code>,
     * <code>cache.m2.2xlarge</code>, <code>cache.m2.4xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>Notes:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * All t2 instances are created in an Amazon Virtual Private Cloud (VPC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis backup/restore is not supported for t2 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis Append-only files (AOF) functionality is not supported for t1 or t2
     * instances.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a complete listing of cache node types and specifications, see <a
     * href="http://aws.amazon.com/elasticache/details">Amazon ElastiCache
     * Product Features and Details</a> and <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Memcached.html#CacheParameterGroups.Memcached.NodeSpecific"
     * >Cache Node Type-Specific Parameters for Memcached</a> or <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Redis.html#CacheParameterGroups.Redis.NodeSpecific"
     * >Cache Node Type-Specific Parameters for Redis</a>.
     * </p>
     */
    private String cacheNodeType;
    /**
     * <p>
     * Duration filter value, specified in years or seconds. Use this parameter
     * to show only reservations for a given duration.
     * </p>
     * <p>
     * Valid Values: <code>1 | 3 | 31536000 | 94608000</code>
     * </p>
     */
    private String duration;
    /**
     * <p>
     * The product description filter value. Use this parameter to show only the
     * available offerings matching the specified product description.
     * </p>
     */
    private String productDescription;
    /**
     * <p>
     * The offering type filter value. Use this parameter to show only the
     * available offerings matching the specified offering type.
     * </p>
     * <p>
     * Valid Values:
     * <code>"Light Utilization"|"Medium Utilization"|"Heavy Utilization"</code>
     * </p>
     */
    private String offeringType;
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
     * The offering identifier filter value. Use this parameter to show only the
     * available offering that matches the specified reservation identifier.
     * </p>
     * <p>
     * Example: <code>438012d3-4052-4cc7-b2e3-8d3372e0e706</code>
     * </p>
     * 
     * @param reservedCacheNodesOfferingId
     *        The offering identifier filter value. Use this parameter to show
     *        only the available offering that matches the specified reservation
     *        identifier.</p>
     *        <p>
     *        Example: <code>438012d3-4052-4cc7-b2e3-8d3372e0e706</code>
     */

    public void setReservedCacheNodesOfferingId(
            String reservedCacheNodesOfferingId) {
        this.reservedCacheNodesOfferingId = reservedCacheNodesOfferingId;
    }

    /**
     * <p>
     * The offering identifier filter value. Use this parameter to show only the
     * available offering that matches the specified reservation identifier.
     * </p>
     * <p>
     * Example: <code>438012d3-4052-4cc7-b2e3-8d3372e0e706</code>
     * </p>
     * 
     * @return The offering identifier filter value. Use this parameter to show
     *         only the available offering that matches the specified
     *         reservation identifier.</p>
     *         <p>
     *         Example: <code>438012d3-4052-4cc7-b2e3-8d3372e0e706</code>
     */

    public String getReservedCacheNodesOfferingId() {
        return this.reservedCacheNodesOfferingId;
    }

    /**
     * <p>
     * The offering identifier filter value. Use this parameter to show only the
     * available offering that matches the specified reservation identifier.
     * </p>
     * <p>
     * Example: <code>438012d3-4052-4cc7-b2e3-8d3372e0e706</code>
     * </p>
     * 
     * @param reservedCacheNodesOfferingId
     *        The offering identifier filter value. Use this parameter to show
     *        only the available offering that matches the specified reservation
     *        identifier.</p>
     *        <p>
     *        Example: <code>438012d3-4052-4cc7-b2e3-8d3372e0e706</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeReservedCacheNodesOfferingsRequest withReservedCacheNodesOfferingId(
            String reservedCacheNodesOfferingId) {
        setReservedCacheNodesOfferingId(reservedCacheNodesOfferingId);
        return this;
    }

    /**
     * <p>
     * The cache node type filter value. Use this parameter to show only the
     * available offerings matching the specified cache node type.
     * </p>
     * <p>
     * Valid node types are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General purpose:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation: <code>cache.t2.micro</code>,
     * <code>cache.t2.small</code>, <code>cache.t2.medium</code>,
     * <code>cache.m3.medium</code>, <code>cache.m3.large</code>,
     * <code>cache.m3.xlarge</code>, <code>cache.m3.2xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: <code>cache.t1.micro</code>,
     * <code>cache.m1.small</code>, <code>cache.m1.medium</code>,
     * <code>cache.m1.large</code>, <code>cache.m1.xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Compute optimized: <code>cache.c1.xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Memory optimized:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation: <code>cache.r3.large</code>,
     * <code>cache.r3.xlarge</code>, <code>cache.r3.2xlarge</code>,
     * <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: <code>cache.m2.xlarge</code>,
     * <code>cache.m2.2xlarge</code>, <code>cache.m2.4xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>Notes:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * All t2 instances are created in an Amazon Virtual Private Cloud (VPC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis backup/restore is not supported for t2 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis Append-only files (AOF) functionality is not supported for t1 or t2
     * instances.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a complete listing of cache node types and specifications, see <a
     * href="http://aws.amazon.com/elasticache/details">Amazon ElastiCache
     * Product Features and Details</a> and <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Memcached.html#CacheParameterGroups.Memcached.NodeSpecific"
     * >Cache Node Type-Specific Parameters for Memcached</a> or <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Redis.html#CacheParameterGroups.Redis.NodeSpecific"
     * >Cache Node Type-Specific Parameters for Redis</a>.
     * </p>
     * 
     * @param cacheNodeType
     *        The cache node type filter value. Use this parameter to show only
     *        the available offerings matching the specified cache node
     *        type.</p>
     *        <p>
     *        Valid node types are as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        General purpose:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Current generation: <code>cache.t2.micro</code>,
     *        <code>cache.t2.small</code>, <code>cache.t2.medium</code>,
     *        <code>cache.m3.medium</code>, <code>cache.m3.large</code>,
     *        <code>cache.m3.xlarge</code>, <code>cache.m3.2xlarge</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Previous generation: <code>cache.t1.micro</code>,
     *        <code>cache.m1.small</code>, <code>cache.m1.medium</code>,
     *        <code>cache.m1.large</code>, <code>cache.m1.xlarge</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Compute optimized: <code>cache.c1.xlarge</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Memory optimized:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Current generation: <code>cache.r3.large</code>,
     *        <code>cache.r3.xlarge</code>, <code>cache.r3.2xlarge</code>,
     *        <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Previous generation: <code>cache.m2.xlarge</code>,
     *        <code>cache.m2.2xlarge</code>, <code>cache.m2.4xlarge</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Notes:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        All t2 instances are created in an Amazon Virtual Private Cloud
     *        (VPC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Redis backup/restore is not supported for t2 instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Redis Append-only files (AOF) functionality is not supported for
     *        t1 or t2 instances.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For a complete listing of cache node types and specifications, see
     *        <a href="http://aws.amazon.com/elasticache/details">Amazon
     *        ElastiCache Product Features and Details</a> and <a href=
     *        "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Memcached.html#CacheParameterGroups.Memcached.NodeSpecific"
     *        >Cache Node Type-Specific Parameters for Memcached</a> or <a href=
     *        "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Redis.html#CacheParameterGroups.Redis.NodeSpecific"
     *        >Cache Node Type-Specific Parameters for Redis</a>.
     */

    public void setCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
    }

    /**
     * <p>
     * The cache node type filter value. Use this parameter to show only the
     * available offerings matching the specified cache node type.
     * </p>
     * <p>
     * Valid node types are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General purpose:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation: <code>cache.t2.micro</code>,
     * <code>cache.t2.small</code>, <code>cache.t2.medium</code>,
     * <code>cache.m3.medium</code>, <code>cache.m3.large</code>,
     * <code>cache.m3.xlarge</code>, <code>cache.m3.2xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: <code>cache.t1.micro</code>,
     * <code>cache.m1.small</code>, <code>cache.m1.medium</code>,
     * <code>cache.m1.large</code>, <code>cache.m1.xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Compute optimized: <code>cache.c1.xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Memory optimized:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation: <code>cache.r3.large</code>,
     * <code>cache.r3.xlarge</code>, <code>cache.r3.2xlarge</code>,
     * <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: <code>cache.m2.xlarge</code>,
     * <code>cache.m2.2xlarge</code>, <code>cache.m2.4xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>Notes:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * All t2 instances are created in an Amazon Virtual Private Cloud (VPC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis backup/restore is not supported for t2 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis Append-only files (AOF) functionality is not supported for t1 or t2
     * instances.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a complete listing of cache node types and specifications, see <a
     * href="http://aws.amazon.com/elasticache/details">Amazon ElastiCache
     * Product Features and Details</a> and <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Memcached.html#CacheParameterGroups.Memcached.NodeSpecific"
     * >Cache Node Type-Specific Parameters for Memcached</a> or <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Redis.html#CacheParameterGroups.Redis.NodeSpecific"
     * >Cache Node Type-Specific Parameters for Redis</a>.
     * </p>
     * 
     * @return The cache node type filter value. Use this parameter to show only
     *         the available offerings matching the specified cache node
     *         type.</p>
     *         <p>
     *         Valid node types are as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         General purpose:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Current generation: <code>cache.t2.micro</code>,
     *         <code>cache.t2.small</code>, <code>cache.t2.medium</code>,
     *         <code>cache.m3.medium</code>, <code>cache.m3.large</code>,
     *         <code>cache.m3.xlarge</code>, <code>cache.m3.2xlarge</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Previous generation: <code>cache.t1.micro</code>,
     *         <code>cache.m1.small</code>, <code>cache.m1.medium</code>,
     *         <code>cache.m1.large</code>, <code>cache.m1.xlarge</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         Compute optimized: <code>cache.c1.xlarge</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Memory optimized:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Current generation: <code>cache.r3.large</code>,
     *         <code>cache.r3.xlarge</code>, <code>cache.r3.2xlarge</code>,
     *         <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Previous generation: <code>cache.m2.xlarge</code>,
     *         <code>cache.m2.2xlarge</code>, <code>cache.m2.4xlarge</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>Notes:</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         All t2 instances are created in an Amazon Virtual Private Cloud
     *         (VPC).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Redis backup/restore is not supported for t2 instances.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Redis Append-only files (AOF) functionality is not supported for
     *         t1 or t2 instances.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For a complete listing of cache node types and specifications,
     *         see <a href="http://aws.amazon.com/elasticache/details">Amazon
     *         ElastiCache Product Features and Details</a> and <a href=
     *         "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Memcached.html#CacheParameterGroups.Memcached.NodeSpecific"
     *         >Cache Node Type-Specific Parameters for Memcached</a> or <a
     *         href=
     *         "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Redis.html#CacheParameterGroups.Redis.NodeSpecific"
     *         >Cache Node Type-Specific Parameters for Redis</a>.
     */

    public String getCacheNodeType() {
        return this.cacheNodeType;
    }

    /**
     * <p>
     * The cache node type filter value. Use this parameter to show only the
     * available offerings matching the specified cache node type.
     * </p>
     * <p>
     * Valid node types are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General purpose:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation: <code>cache.t2.micro</code>,
     * <code>cache.t2.small</code>, <code>cache.t2.medium</code>,
     * <code>cache.m3.medium</code>, <code>cache.m3.large</code>,
     * <code>cache.m3.xlarge</code>, <code>cache.m3.2xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: <code>cache.t1.micro</code>,
     * <code>cache.m1.small</code>, <code>cache.m1.medium</code>,
     * <code>cache.m1.large</code>, <code>cache.m1.xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Compute optimized: <code>cache.c1.xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Memory optimized:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation: <code>cache.r3.large</code>,
     * <code>cache.r3.xlarge</code>, <code>cache.r3.2xlarge</code>,
     * <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: <code>cache.m2.xlarge</code>,
     * <code>cache.m2.2xlarge</code>, <code>cache.m2.4xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>Notes:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * All t2 instances are created in an Amazon Virtual Private Cloud (VPC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis backup/restore is not supported for t2 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis Append-only files (AOF) functionality is not supported for t1 or t2
     * instances.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a complete listing of cache node types and specifications, see <a
     * href="http://aws.amazon.com/elasticache/details">Amazon ElastiCache
     * Product Features and Details</a> and <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Memcached.html#CacheParameterGroups.Memcached.NodeSpecific"
     * >Cache Node Type-Specific Parameters for Memcached</a> or <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Redis.html#CacheParameterGroups.Redis.NodeSpecific"
     * >Cache Node Type-Specific Parameters for Redis</a>.
     * </p>
     * 
     * @param cacheNodeType
     *        The cache node type filter value. Use this parameter to show only
     *        the available offerings matching the specified cache node
     *        type.</p>
     *        <p>
     *        Valid node types are as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        General purpose:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Current generation: <code>cache.t2.micro</code>,
     *        <code>cache.t2.small</code>, <code>cache.t2.medium</code>,
     *        <code>cache.m3.medium</code>, <code>cache.m3.large</code>,
     *        <code>cache.m3.xlarge</code>, <code>cache.m3.2xlarge</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Previous generation: <code>cache.t1.micro</code>,
     *        <code>cache.m1.small</code>, <code>cache.m1.medium</code>,
     *        <code>cache.m1.large</code>, <code>cache.m1.xlarge</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Compute optimized: <code>cache.c1.xlarge</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Memory optimized:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Current generation: <code>cache.r3.large</code>,
     *        <code>cache.r3.xlarge</code>, <code>cache.r3.2xlarge</code>,
     *        <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Previous generation: <code>cache.m2.xlarge</code>,
     *        <code>cache.m2.2xlarge</code>, <code>cache.m2.4xlarge</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Notes:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        All t2 instances are created in an Amazon Virtual Private Cloud
     *        (VPC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Redis backup/restore is not supported for t2 instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Redis Append-only files (AOF) functionality is not supported for
     *        t1 or t2 instances.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For a complete listing of cache node types and specifications, see
     *        <a href="http://aws.amazon.com/elasticache/details">Amazon
     *        ElastiCache Product Features and Details</a> and <a href=
     *        "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Memcached.html#CacheParameterGroups.Memcached.NodeSpecific"
     *        >Cache Node Type-Specific Parameters for Memcached</a> or <a href=
     *        "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Redis.html#CacheParameterGroups.Redis.NodeSpecific"
     *        >Cache Node Type-Specific Parameters for Redis</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeReservedCacheNodesOfferingsRequest withCacheNodeType(
            String cacheNodeType) {
        setCacheNodeType(cacheNodeType);
        return this;
    }

    /**
     * <p>
     * Duration filter value, specified in years or seconds. Use this parameter
     * to show only reservations for a given duration.
     * </p>
     * <p>
     * Valid Values: <code>1 | 3 | 31536000 | 94608000</code>
     * </p>
     * 
     * @param duration
     *        Duration filter value, specified in years or seconds. Use this
     *        parameter to show only reservations for a given duration.</p>
     *        <p>
     *        Valid Values: <code>1 | 3 | 31536000 | 94608000</code>
     */

    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * Duration filter value, specified in years or seconds. Use this parameter
     * to show only reservations for a given duration.
     * </p>
     * <p>
     * Valid Values: <code>1 | 3 | 31536000 | 94608000</code>
     * </p>
     * 
     * @return Duration filter value, specified in years or seconds. Use this
     *         parameter to show only reservations for a given duration.</p>
     *         <p>
     *         Valid Values: <code>1 | 3 | 31536000 | 94608000</code>
     */

    public String getDuration() {
        return this.duration;
    }

    /**
     * <p>
     * Duration filter value, specified in years or seconds. Use this parameter
     * to show only reservations for a given duration.
     * </p>
     * <p>
     * Valid Values: <code>1 | 3 | 31536000 | 94608000</code>
     * </p>
     * 
     * @param duration
     *        Duration filter value, specified in years or seconds. Use this
     *        parameter to show only reservations for a given duration.</p>
     *        <p>
     *        Valid Values: <code>1 | 3 | 31536000 | 94608000</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeReservedCacheNodesOfferingsRequest withDuration(
            String duration) {
        setDuration(duration);
        return this;
    }

    /**
     * <p>
     * The product description filter value. Use this parameter to show only the
     * available offerings matching the specified product description.
     * </p>
     * 
     * @param productDescription
     *        The product description filter value. Use this parameter to show
     *        only the available offerings matching the specified product
     *        description.
     */

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    /**
     * <p>
     * The product description filter value. Use this parameter to show only the
     * available offerings matching the specified product description.
     * </p>
     * 
     * @return The product description filter value. Use this parameter to show
     *         only the available offerings matching the specified product
     *         description.
     */

    public String getProductDescription() {
        return this.productDescription;
    }

    /**
     * <p>
     * The product description filter value. Use this parameter to show only the
     * available offerings matching the specified product description.
     * </p>
     * 
     * @param productDescription
     *        The product description filter value. Use this parameter to show
     *        only the available offerings matching the specified product
     *        description.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeReservedCacheNodesOfferingsRequest withProductDescription(
            String productDescription) {
        setProductDescription(productDescription);
        return this;
    }

    /**
     * <p>
     * The offering type filter value. Use this parameter to show only the
     * available offerings matching the specified offering type.
     * </p>
     * <p>
     * Valid Values:
     * <code>"Light Utilization"|"Medium Utilization"|"Heavy Utilization"</code>
     * </p>
     * 
     * @param offeringType
     *        The offering type filter value. Use this parameter to show only
     *        the available offerings matching the specified offering type.</p>
     *        <p>
     *        Valid Values:
     *        <code>"Light Utilization"|"Medium Utilization"|"Heavy Utilization"</code>
     */

    public void setOfferingType(String offeringType) {
        this.offeringType = offeringType;
    }

    /**
     * <p>
     * The offering type filter value. Use this parameter to show only the
     * available offerings matching the specified offering type.
     * </p>
     * <p>
     * Valid Values:
     * <code>"Light Utilization"|"Medium Utilization"|"Heavy Utilization"</code>
     * </p>
     * 
     * @return The offering type filter value. Use this parameter to show only
     *         the available offerings matching the specified offering type.</p>
     *         <p>
     *         Valid Values:
     *         <code>"Light Utilization"|"Medium Utilization"|"Heavy Utilization"</code>
     */

    public String getOfferingType() {
        return this.offeringType;
    }

    /**
     * <p>
     * The offering type filter value. Use this parameter to show only the
     * available offerings matching the specified offering type.
     * </p>
     * <p>
     * Valid Values:
     * <code>"Light Utilization"|"Medium Utilization"|"Heavy Utilization"</code>
     * </p>
     * 
     * @param offeringType
     *        The offering type filter value. Use this parameter to show only
     *        the available offerings matching the specified offering type.</p>
     *        <p>
     *        Valid Values:
     *        <code>"Light Utilization"|"Medium Utilization"|"Heavy Utilization"</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeReservedCacheNodesOfferingsRequest withOfferingType(
            String offeringType) {
        setOfferingType(offeringType);
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

    public DescribeReservedCacheNodesOfferingsRequest withMaxRecords(
            Integer maxRecords) {
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

    public DescribeReservedCacheNodesOfferingsRequest withMarker(String marker) {
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
        if (getReservedCacheNodesOfferingId() != null)
            sb.append("ReservedCacheNodesOfferingId: "
                    + getReservedCacheNodesOfferingId() + ",");
        if (getCacheNodeType() != null)
            sb.append("CacheNodeType: " + getCacheNodeType() + ",");
        if (getDuration() != null)
            sb.append("Duration: " + getDuration() + ",");
        if (getProductDescription() != null)
            sb.append("ProductDescription: " + getProductDescription() + ",");
        if (getOfferingType() != null)
            sb.append("OfferingType: " + getOfferingType() + ",");
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

        if (obj instanceof DescribeReservedCacheNodesOfferingsRequest == false)
            return false;
        DescribeReservedCacheNodesOfferingsRequest other = (DescribeReservedCacheNodesOfferingsRequest) obj;
        if (other.getReservedCacheNodesOfferingId() == null
                ^ this.getReservedCacheNodesOfferingId() == null)
            return false;
        if (other.getReservedCacheNodesOfferingId() != null
                && other.getReservedCacheNodesOfferingId().equals(
                        this.getReservedCacheNodesOfferingId()) == false)
            return false;
        if (other.getCacheNodeType() == null ^ this.getCacheNodeType() == null)
            return false;
        if (other.getCacheNodeType() != null
                && other.getCacheNodeType().equals(this.getCacheNodeType()) == false)
            return false;
        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null
                && other.getDuration().equals(this.getDuration()) == false)
            return false;
        if (other.getProductDescription() == null
                ^ this.getProductDescription() == null)
            return false;
        if (other.getProductDescription() != null
                && other.getProductDescription().equals(
                        this.getProductDescription()) == false)
            return false;
        if (other.getOfferingType() == null ^ this.getOfferingType() == null)
            return false;
        if (other.getOfferingType() != null
                && other.getOfferingType().equals(this.getOfferingType()) == false)
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
                + ((getReservedCacheNodesOfferingId() == null) ? 0
                        : getReservedCacheNodesOfferingId().hashCode());
        hashCode = prime
                * hashCode
                + ((getCacheNodeType() == null) ? 0 : getCacheNodeType()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime
                * hashCode
                + ((getProductDescription() == null) ? 0
                        : getProductDescription().hashCode());
        hashCode = prime
                * hashCode
                + ((getOfferingType() == null) ? 0 : getOfferingType()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode
                + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReservedCacheNodesOfferingsRequest clone() {
        return (DescribeReservedCacheNodesOfferingsRequest) super.clone();
    }
}

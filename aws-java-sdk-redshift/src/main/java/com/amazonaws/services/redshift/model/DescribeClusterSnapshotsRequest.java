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
public class DescribeClusterSnapshotsRequest extends
        com.amazonaws.AmazonWebServiceRequest implements Serializable,
        Cloneable {

    /**
     * <p>
     * The identifier of the cluster for which information about snapshots is
     * requested.
     * </p>
     */
    private String clusterIdentifier;
    /**
     * <p>
     * The snapshot identifier of the snapshot about which to return
     * information.
     * </p>
     */
    private String snapshotIdentifier;
    /**
     * <p>
     * The type of snapshots for which you are requesting information. By
     * default, snapshots of all types are returned.
     * </p>
     * <p>
     * Valid Values: <code>automated</code> | <code>manual</code>
     * </p>
     */
    private String snapshotType;
    /**
     * <p>
     * A value that requests only snapshots created at or after the specified
     * time. The time value is specified in ISO 8601 format. For more
     * information about ISO 8601, go to the <a
     * href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia page.</a>
     * </p>
     * <p>
     * Example: <code>2012-07-16T18:00:00Z</code>
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * A time value that requests only snapshots created at or before the
     * specified time. The time value is specified in ISO 8601 format. For more
     * information about ISO 8601, go to the <a
     * href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia page.</a>
     * </p>
     * <p>
     * Example: <code>2012-07-16T18:00:00Z</code>
     * </p>
     */
    private java.util.Date endTime;
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
     * <a>DescribeClusterSnapshots</a> request exceed the value specified in
     * <code>MaxRecords</code>, AWS returns a value in the <code>Marker</code>
     * field of the response. You can retrieve the next set of response records
     * by providing the returned marker value in the <code>Marker</code>
     * parameter and retrying the request.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * The AWS customer account used to create or copy the snapshot. Use this
     * field to filter the results to snapshots owned by a particular account.
     * To describe snapshots you own, either specify your AWS customer account,
     * or do not specify the parameter.
     * </p>
     */
    private String ownerAccount;
    /**
     * <p>
     * A tag key or keys for which you want to return all matching cluster
     * snapshots that are associated with the specified key or keys. For
     * example, suppose that you have snapshots that are tagged with keys called
     * <code>owner</code> and <code>environment</code>. If you specify both of
     * these tag keys in the request, Amazon Redshift returns a response with
     * the snapshots that have either or both of these tag keys associated with
     * them.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> tagKeys;
    /**
     * <p>
     * A tag value or values for which you want to return all matching cluster
     * snapshots that are associated with the specified tag value or values. For
     * example, suppose that you have snapshots that are tagged with values
     * called <code>admin</code> and <code>test</code>. If you specify both of
     * these tag values in the request, Amazon Redshift returns a response with
     * the snapshots that have either or both of these tag values associated
     * with them.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> tagValues;

    /**
     * <p>
     * The identifier of the cluster for which information about snapshots is
     * requested.
     * </p>
     * 
     * @param clusterIdentifier
     *        The identifier of the cluster for which information about
     *        snapshots is requested.
     */

    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the cluster for which information about snapshots is
     * requested.
     * </p>
     * 
     * @return The identifier of the cluster for which information about
     *         snapshots is requested.
     */

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the cluster for which information about snapshots is
     * requested.
     * </p>
     * 
     * @param clusterIdentifier
     *        The identifier of the cluster for which information about
     *        snapshots is requested.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeClusterSnapshotsRequest withClusterIdentifier(
            String clusterIdentifier) {
        setClusterIdentifier(clusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The snapshot identifier of the snapshot about which to return
     * information.
     * </p>
     * 
     * @param snapshotIdentifier
     *        The snapshot identifier of the snapshot about which to return
     *        information.
     */

    public void setSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
    }

    /**
     * <p>
     * The snapshot identifier of the snapshot about which to return
     * information.
     * </p>
     * 
     * @return The snapshot identifier of the snapshot about which to return
     *         information.
     */

    public String getSnapshotIdentifier() {
        return this.snapshotIdentifier;
    }

    /**
     * <p>
     * The snapshot identifier of the snapshot about which to return
     * information.
     * </p>
     * 
     * @param snapshotIdentifier
     *        The snapshot identifier of the snapshot about which to return
     *        information.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeClusterSnapshotsRequest withSnapshotIdentifier(
            String snapshotIdentifier) {
        setSnapshotIdentifier(snapshotIdentifier);
        return this;
    }

    /**
     * <p>
     * The type of snapshots for which you are requesting information. By
     * default, snapshots of all types are returned.
     * </p>
     * <p>
     * Valid Values: <code>automated</code> | <code>manual</code>
     * </p>
     * 
     * @param snapshotType
     *        The type of snapshots for which you are requesting information. By
     *        default, snapshots of all types are returned. </p>
     *        <p>
     *        Valid Values: <code>automated</code> | <code>manual</code>
     */

    public void setSnapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
    }

    /**
     * <p>
     * The type of snapshots for which you are requesting information. By
     * default, snapshots of all types are returned.
     * </p>
     * <p>
     * Valid Values: <code>automated</code> | <code>manual</code>
     * </p>
     * 
     * @return The type of snapshots for which you are requesting information.
     *         By default, snapshots of all types are returned. </p>
     *         <p>
     *         Valid Values: <code>automated</code> | <code>manual</code>
     */

    public String getSnapshotType() {
        return this.snapshotType;
    }

    /**
     * <p>
     * The type of snapshots for which you are requesting information. By
     * default, snapshots of all types are returned.
     * </p>
     * <p>
     * Valid Values: <code>automated</code> | <code>manual</code>
     * </p>
     * 
     * @param snapshotType
     *        The type of snapshots for which you are requesting information. By
     *        default, snapshots of all types are returned. </p>
     *        <p>
     *        Valid Values: <code>automated</code> | <code>manual</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeClusterSnapshotsRequest withSnapshotType(String snapshotType) {
        setSnapshotType(snapshotType);
        return this;
    }

    /**
     * <p>
     * A value that requests only snapshots created at or after the specified
     * time. The time value is specified in ISO 8601 format. For more
     * information about ISO 8601, go to the <a
     * href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia page.</a>
     * </p>
     * <p>
     * Example: <code>2012-07-16T18:00:00Z</code>
     * </p>
     * 
     * @param startTime
     *        A value that requests only snapshots created at or after the
     *        specified time. The time value is specified in ISO 8601 format.
     *        For more information about ISO 8601, go to the <a
     *        href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     *        page.</a> </p>
     *        <p>
     *        Example: <code>2012-07-16T18:00:00Z</code>
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * A value that requests only snapshots created at or after the specified
     * time. The time value is specified in ISO 8601 format. For more
     * information about ISO 8601, go to the <a
     * href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia page.</a>
     * </p>
     * <p>
     * Example: <code>2012-07-16T18:00:00Z</code>
     * </p>
     * 
     * @return A value that requests only snapshots created at or after the
     *         specified time. The time value is specified in ISO 8601 format.
     *         For more information about ISO 8601, go to the <a
     *         href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     *         page.</a> </p>
     *         <p>
     *         Example: <code>2012-07-16T18:00:00Z</code>
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * A value that requests only snapshots created at or after the specified
     * time. The time value is specified in ISO 8601 format. For more
     * information about ISO 8601, go to the <a
     * href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia page.</a>
     * </p>
     * <p>
     * Example: <code>2012-07-16T18:00:00Z</code>
     * </p>
     * 
     * @param startTime
     *        A value that requests only snapshots created at or after the
     *        specified time. The time value is specified in ISO 8601 format.
     *        For more information about ISO 8601, go to the <a
     *        href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     *        page.</a> </p>
     *        <p>
     *        Example: <code>2012-07-16T18:00:00Z</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeClusterSnapshotsRequest withStartTime(
            java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * A time value that requests only snapshots created at or before the
     * specified time. The time value is specified in ISO 8601 format. For more
     * information about ISO 8601, go to the <a
     * href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia page.</a>
     * </p>
     * <p>
     * Example: <code>2012-07-16T18:00:00Z</code>
     * </p>
     * 
     * @param endTime
     *        A time value that requests only snapshots created at or before the
     *        specified time. The time value is specified in ISO 8601 format.
     *        For more information about ISO 8601, go to the <a
     *        href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     *        page.</a> </p>
     *        <p>
     *        Example: <code>2012-07-16T18:00:00Z</code>
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * A time value that requests only snapshots created at or before the
     * specified time. The time value is specified in ISO 8601 format. For more
     * information about ISO 8601, go to the <a
     * href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia page.</a>
     * </p>
     * <p>
     * Example: <code>2012-07-16T18:00:00Z</code>
     * </p>
     * 
     * @return A time value that requests only snapshots created at or before
     *         the specified time. The time value is specified in ISO 8601
     *         format. For more information about ISO 8601, go to the <a
     *         href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     *         page.</a> </p>
     *         <p>
     *         Example: <code>2012-07-16T18:00:00Z</code>
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * A time value that requests only snapshots created at or before the
     * specified time. The time value is specified in ISO 8601 format. For more
     * information about ISO 8601, go to the <a
     * href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia page.</a>
     * </p>
     * <p>
     * Example: <code>2012-07-16T18:00:00Z</code>
     * </p>
     * 
     * @param endTime
     *        A time value that requests only snapshots created at or before the
     *        specified time. The time value is specified in ISO 8601 format.
     *        For more information about ISO 8601, go to the <a
     *        href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     *        page.</a> </p>
     *        <p>
     *        Example: <code>2012-07-16T18:00:00Z</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeClusterSnapshotsRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
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

    public DescribeClusterSnapshotsRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
    }

    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set
     * of response records. When the results of a
     * <a>DescribeClusterSnapshots</a> request exceed the value specified in
     * <code>MaxRecords</code>, AWS returns a value in the <code>Marker</code>
     * field of the response. You can retrieve the next set of response records
     * by providing the returned marker value in the <code>Marker</code>
     * parameter and retrying the request.
     * </p>
     * 
     * @param marker
     *        An optional parameter that specifies the starting point to return
     *        a set of response records. When the results of a
     *        <a>DescribeClusterSnapshots</a> request exceed the value specified
     *        in <code>MaxRecords</code>, AWS returns a value in the
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
     * <a>DescribeClusterSnapshots</a> request exceed the value specified in
     * <code>MaxRecords</code>, AWS returns a value in the <code>Marker</code>
     * field of the response. You can retrieve the next set of response records
     * by providing the returned marker value in the <code>Marker</code>
     * parameter and retrying the request.
     * </p>
     * 
     * @return An optional parameter that specifies the starting point to return
     *         a set of response records. When the results of a
     *         <a>DescribeClusterSnapshots</a> request exceed the value
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
     * <a>DescribeClusterSnapshots</a> request exceed the value specified in
     * <code>MaxRecords</code>, AWS returns a value in the <code>Marker</code>
     * field of the response. You can retrieve the next set of response records
     * by providing the returned marker value in the <code>Marker</code>
     * parameter and retrying the request.
     * </p>
     * 
     * @param marker
     *        An optional parameter that specifies the starting point to return
     *        a set of response records. When the results of a
     *        <a>DescribeClusterSnapshots</a> request exceed the value specified
     *        in <code>MaxRecords</code>, AWS returns a value in the
     *        <code>Marker</code> field of the response. You can retrieve the
     *        next set of response records by providing the returned marker
     *        value in the <code>Marker</code> parameter and retrying the
     *        request.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeClusterSnapshotsRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * The AWS customer account used to create or copy the snapshot. Use this
     * field to filter the results to snapshots owned by a particular account.
     * To describe snapshots you own, either specify your AWS customer account,
     * or do not specify the parameter.
     * </p>
     * 
     * @param ownerAccount
     *        The AWS customer account used to create or copy the snapshot. Use
     *        this field to filter the results to snapshots owned by a
     *        particular account. To describe snapshots you own, either specify
     *        your AWS customer account, or do not specify the parameter.
     */

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    /**
     * <p>
     * The AWS customer account used to create or copy the snapshot. Use this
     * field to filter the results to snapshots owned by a particular account.
     * To describe snapshots you own, either specify your AWS customer account,
     * or do not specify the parameter.
     * </p>
     * 
     * @return The AWS customer account used to create or copy the snapshot. Use
     *         this field to filter the results to snapshots owned by a
     *         particular account. To describe snapshots you own, either specify
     *         your AWS customer account, or do not specify the parameter.
     */

    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * <p>
     * The AWS customer account used to create or copy the snapshot. Use this
     * field to filter the results to snapshots owned by a particular account.
     * To describe snapshots you own, either specify your AWS customer account,
     * or do not specify the parameter.
     * </p>
     * 
     * @param ownerAccount
     *        The AWS customer account used to create or copy the snapshot. Use
     *        this field to filter the results to snapshots owned by a
     *        particular account. To describe snapshots you own, either specify
     *        your AWS customer account, or do not specify the parameter.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeClusterSnapshotsRequest withOwnerAccount(String ownerAccount) {
        setOwnerAccount(ownerAccount);
        return this;
    }

    /**
     * <p>
     * A tag key or keys for which you want to return all matching cluster
     * snapshots that are associated with the specified key or keys. For
     * example, suppose that you have snapshots that are tagged with keys called
     * <code>owner</code> and <code>environment</code>. If you specify both of
     * these tag keys in the request, Amazon Redshift returns a response with
     * the snapshots that have either or both of these tag keys associated with
     * them.
     * </p>
     * 
     * @return A tag key or keys for which you want to return all matching
     *         cluster snapshots that are associated with the specified key or
     *         keys. For example, suppose that you have snapshots that are
     *         tagged with keys called <code>owner</code> and
     *         <code>environment</code>. If you specify both of these tag keys
     *         in the request, Amazon Redshift returns a response with the
     *         snapshots that have either or both of these tag keys associated
     *         with them.
     */

    public java.util.List<String> getTagKeys() {
        if (tagKeys == null) {
            tagKeys = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return tagKeys;
    }

    /**
     * <p>
     * A tag key or keys for which you want to return all matching cluster
     * snapshots that are associated with the specified key or keys. For
     * example, suppose that you have snapshots that are tagged with keys called
     * <code>owner</code> and <code>environment</code>. If you specify both of
     * these tag keys in the request, Amazon Redshift returns a response with
     * the snapshots that have either or both of these tag keys associated with
     * them.
     * </p>
     * 
     * @param tagKeys
     *        A tag key or keys for which you want to return all matching
     *        cluster snapshots that are associated with the specified key or
     *        keys. For example, suppose that you have snapshots that are tagged
     *        with keys called <code>owner</code> and <code>environment</code>.
     *        If you specify both of these tag keys in the request, Amazon
     *        Redshift returns a response with the snapshots that have either or
     *        both of these tag keys associated with them.
     */

    public void setTagKeys(java.util.Collection<String> tagKeys) {
        if (tagKeys == null) {
            this.tagKeys = null;
            return;
        }

        this.tagKeys = new com.amazonaws.internal.SdkInternalList<String>(
                tagKeys);
    }

    /**
     * <p>
     * A tag key or keys for which you want to return all matching cluster
     * snapshots that are associated with the specified key or keys. For
     * example, suppose that you have snapshots that are tagged with keys called
     * <code>owner</code> and <code>environment</code>. If you specify both of
     * these tag keys in the request, Amazon Redshift returns a response with
     * the snapshots that have either or both of these tag keys associated with
     * them.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTagKeys(java.util.Collection)} or
     * {@link #withTagKeys(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tagKeys
     *        A tag key or keys for which you want to return all matching
     *        cluster snapshots that are associated with the specified key or
     *        keys. For example, suppose that you have snapshots that are tagged
     *        with keys called <code>owner</code> and <code>environment</code>.
     *        If you specify both of these tag keys in the request, Amazon
     *        Redshift returns a response with the snapshots that have either or
     *        both of these tag keys associated with them.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeClusterSnapshotsRequest withTagKeys(String... tagKeys) {
        if (this.tagKeys == null) {
            setTagKeys(new com.amazonaws.internal.SdkInternalList<String>(
                    tagKeys.length));
        }
        for (String ele : tagKeys) {
            this.tagKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A tag key or keys for which you want to return all matching cluster
     * snapshots that are associated with the specified key or keys. For
     * example, suppose that you have snapshots that are tagged with keys called
     * <code>owner</code> and <code>environment</code>. If you specify both of
     * these tag keys in the request, Amazon Redshift returns a response with
     * the snapshots that have either or both of these tag keys associated with
     * them.
     * </p>
     * 
     * @param tagKeys
     *        A tag key or keys for which you want to return all matching
     *        cluster snapshots that are associated with the specified key or
     *        keys. For example, suppose that you have snapshots that are tagged
     *        with keys called <code>owner</code> and <code>environment</code>.
     *        If you specify both of these tag keys in the request, Amazon
     *        Redshift returns a response with the snapshots that have either or
     *        both of these tag keys associated with them.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeClusterSnapshotsRequest withTagKeys(
            java.util.Collection<String> tagKeys) {
        setTagKeys(tagKeys);
        return this;
    }

    /**
     * <p>
     * A tag value or values for which you want to return all matching cluster
     * snapshots that are associated with the specified tag value or values. For
     * example, suppose that you have snapshots that are tagged with values
     * called <code>admin</code> and <code>test</code>. If you specify both of
     * these tag values in the request, Amazon Redshift returns a response with
     * the snapshots that have either or both of these tag values associated
     * with them.
     * </p>
     * 
     * @return A tag value or values for which you want to return all matching
     *         cluster snapshots that are associated with the specified tag
     *         value or values. For example, suppose that you have snapshots
     *         that are tagged with values called <code>admin</code> and
     *         <code>test</code>. If you specify both of these tag values in the
     *         request, Amazon Redshift returns a response with the snapshots
     *         that have either or both of these tag values associated with
     *         them.
     */

    public java.util.List<String> getTagValues() {
        if (tagValues == null) {
            tagValues = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return tagValues;
    }

    /**
     * <p>
     * A tag value or values for which you want to return all matching cluster
     * snapshots that are associated with the specified tag value or values. For
     * example, suppose that you have snapshots that are tagged with values
     * called <code>admin</code> and <code>test</code>. If you specify both of
     * these tag values in the request, Amazon Redshift returns a response with
     * the snapshots that have either or both of these tag values associated
     * with them.
     * </p>
     * 
     * @param tagValues
     *        A tag value or values for which you want to return all matching
     *        cluster snapshots that are associated with the specified tag value
     *        or values. For example, suppose that you have snapshots that are
     *        tagged with values called <code>admin</code> and <code>test</code>
     *        . If you specify both of these tag values in the request, Amazon
     *        Redshift returns a response with the snapshots that have either or
     *        both of these tag values associated with them.
     */

    public void setTagValues(java.util.Collection<String> tagValues) {
        if (tagValues == null) {
            this.tagValues = null;
            return;
        }

        this.tagValues = new com.amazonaws.internal.SdkInternalList<String>(
                tagValues);
    }

    /**
     * <p>
     * A tag value or values for which you want to return all matching cluster
     * snapshots that are associated with the specified tag value or values. For
     * example, suppose that you have snapshots that are tagged with values
     * called <code>admin</code> and <code>test</code>. If you specify both of
     * these tag values in the request, Amazon Redshift returns a response with
     * the snapshots that have either or both of these tag values associated
     * with them.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTagValues(java.util.Collection)} or
     * {@link #withTagValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tagValues
     *        A tag value or values for which you want to return all matching
     *        cluster snapshots that are associated with the specified tag value
     *        or values. For example, suppose that you have snapshots that are
     *        tagged with values called <code>admin</code> and <code>test</code>
     *        . If you specify both of these tag values in the request, Amazon
     *        Redshift returns a response with the snapshots that have either or
     *        both of these tag values associated with them.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeClusterSnapshotsRequest withTagValues(String... tagValues) {
        if (this.tagValues == null) {
            setTagValues(new com.amazonaws.internal.SdkInternalList<String>(
                    tagValues.length));
        }
        for (String ele : tagValues) {
            this.tagValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A tag value or values for which you want to return all matching cluster
     * snapshots that are associated with the specified tag value or values. For
     * example, suppose that you have snapshots that are tagged with values
     * called <code>admin</code> and <code>test</code>. If you specify both of
     * these tag values in the request, Amazon Redshift returns a response with
     * the snapshots that have either or both of these tag values associated
     * with them.
     * </p>
     * 
     * @param tagValues
     *        A tag value or values for which you want to return all matching
     *        cluster snapshots that are associated with the specified tag value
     *        or values. For example, suppose that you have snapshots that are
     *        tagged with values called <code>admin</code> and <code>test</code>
     *        . If you specify both of these tag values in the request, Amazon
     *        Redshift returns a response with the snapshots that have either or
     *        both of these tag values associated with them.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeClusterSnapshotsRequest withTagValues(
            java.util.Collection<String> tagValues) {
        setTagValues(tagValues);
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
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: " + getClusterIdentifier() + ",");
        if (getSnapshotIdentifier() != null)
            sb.append("SnapshotIdentifier: " + getSnapshotIdentifier() + ",");
        if (getSnapshotType() != null)
            sb.append("SnapshotType: " + getSnapshotType() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("EndTime: " + getEndTime() + ",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getOwnerAccount() != null)
            sb.append("OwnerAccount: " + getOwnerAccount() + ",");
        if (getTagKeys() != null)
            sb.append("TagKeys: " + getTagKeys() + ",");
        if (getTagValues() != null)
            sb.append("TagValues: " + getTagValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeClusterSnapshotsRequest == false)
            return false;
        DescribeClusterSnapshotsRequest other = (DescribeClusterSnapshotsRequest) obj;
        if (other.getClusterIdentifier() == null
                ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null
                && other.getClusterIdentifier().equals(
                        this.getClusterIdentifier()) == false)
            return false;
        if (other.getSnapshotIdentifier() == null
                ^ this.getSnapshotIdentifier() == null)
            return false;
        if (other.getSnapshotIdentifier() != null
                && other.getSnapshotIdentifier().equals(
                        this.getSnapshotIdentifier()) == false)
            return false;
        if (other.getSnapshotType() == null ^ this.getSnapshotType() == null)
            return false;
        if (other.getSnapshotType() != null
                && other.getSnapshotType().equals(this.getSnapshotType()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null
                && other.getEndTime().equals(this.getEndTime()) == false)
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
        if (other.getOwnerAccount() == null ^ this.getOwnerAccount() == null)
            return false;
        if (other.getOwnerAccount() != null
                && other.getOwnerAccount().equals(this.getOwnerAccount()) == false)
            return false;
        if (other.getTagKeys() == null ^ this.getTagKeys() == null)
            return false;
        if (other.getTagKeys() != null
                && other.getTagKeys().equals(this.getTagKeys()) == false)
            return false;
        if (other.getTagValues() == null ^ this.getTagValues() == null)
            return false;
        if (other.getTagValues() != null
                && other.getTagValues().equals(this.getTagValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getClusterIdentifier() == null) ? 0
                        : getClusterIdentifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getSnapshotIdentifier() == null) ? 0
                        : getSnapshotIdentifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getSnapshotType() == null) ? 0 : getSnapshotType()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode
                + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode
                + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode
                + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime
                * hashCode
                + ((getOwnerAccount() == null) ? 0 : getOwnerAccount()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getTagKeys() == null) ? 0 : getTagKeys().hashCode());
        hashCode = prime * hashCode
                + ((getTagValues() == null) ? 0 : getTagValues().hashCode());
        return hashCode;
    }

    @Override
    public DescribeClusterSnapshotsRequest clone() {
        return (DescribeClusterSnapshotsRequest) super.clone();
    }
}

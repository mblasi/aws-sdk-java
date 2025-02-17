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

/**
 * <p>
 * Describes the result of a cluster resize operation.
 * </p>
 */
public class DescribeResizeResult extends
        com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata>
        implements Serializable, Cloneable {

    /**
     * <p>
     * The node type that the cluster will have after the resize operation is
     * complete.
     * </p>
     */
    private String targetNodeType;
    /**
     * <p>
     * The number of nodes that the cluster will have after the resize operation
     * is complete.
     * </p>
     */
    private Integer targetNumberOfNodes;
    /**
     * <p>
     * The cluster type after the resize operation is complete.
     * </p>
     * <p>
     * Valid Values: <code>multi-node</code> | <code>single-node</code>
     * </p>
     */
    private String targetClusterType;
    /**
     * <p>
     * The status of the resize operation.
     * </p>
     * <p>
     * Valid Values: <code>NONE</code> | <code>IN_PROGRESS</code> |
     * <code>FAILED</code> | <code>SUCCEEDED</code>
     * </p>
     */
    private String status;
    /**
     * <p>
     * The names of tables that have been completely imported .
     * </p>
     * <p>
     * Valid Values: List of table names.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> importTablesCompleted;
    /**
     * <p>
     * The names of tables that are being currently imported.
     * </p>
     * <p>
     * Valid Values: List of table names.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> importTablesInProgress;
    /**
     * <p>
     * The names of tables that have not been yet imported.
     * </p>
     * <p>
     * Valid Values: List of table names
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> importTablesNotStarted;
    /**
     * <p>
     * The average rate of the resize operation over the last few minutes,
     * measured in megabytes per second. After the resize operation completes,
     * this value shows the average rate of the entire resize operation.
     * </p>
     */
    private Double avgResizeRateInMegaBytesPerSecond;
    /**
     * <p>
     * The estimated total amount of data, in megabytes, on the cluster before
     * the resize operation began.
     * </p>
     */
    private Long totalResizeDataInMegaBytes;
    /**
     * <p>
     * While the resize operation is in progress, this value shows the current
     * amount of data, in megabytes, that has been processed so far. When the
     * resize operation is complete, this value shows the total amount of data,
     * in megabytes, on the cluster, which may be more or less than
     * TotalResizeDataInMegaBytes (the estimated total amount of data before
     * resize).
     * </p>
     */
    private Long progressInMegaBytes;
    /**
     * <p>
     * The amount of seconds that have elapsed since the resize operation began.
     * After the resize operation completes, this value shows the total actual
     * time, in seconds, for the resize operation.
     * </p>
     */
    private Long elapsedTimeInSeconds;
    /**
     * <p>
     * The estimated time remaining, in seconds, until the resize operation is
     * complete. This value is calculated based on the average resize rate and
     * the estimated amount of data remaining to be processed. Once the resize
     * operation is complete, this value will be 0.
     * </p>
     */
    private Long estimatedTimeToCompletionInSeconds;

    /**
     * <p>
     * The node type that the cluster will have after the resize operation is
     * complete.
     * </p>
     * 
     * @param targetNodeType
     *        The node type that the cluster will have after the resize
     *        operation is complete.
     */

    public void setTargetNodeType(String targetNodeType) {
        this.targetNodeType = targetNodeType;
    }

    /**
     * <p>
     * The node type that the cluster will have after the resize operation is
     * complete.
     * </p>
     * 
     * @return The node type that the cluster will have after the resize
     *         operation is complete.
     */

    public String getTargetNodeType() {
        return this.targetNodeType;
    }

    /**
     * <p>
     * The node type that the cluster will have after the resize operation is
     * complete.
     * </p>
     * 
     * @param targetNodeType
     *        The node type that the cluster will have after the resize
     *        operation is complete.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeResizeResult withTargetNodeType(String targetNodeType) {
        setTargetNodeType(targetNodeType);
        return this;
    }

    /**
     * <p>
     * The number of nodes that the cluster will have after the resize operation
     * is complete.
     * </p>
     * 
     * @param targetNumberOfNodes
     *        The number of nodes that the cluster will have after the resize
     *        operation is complete.
     */

    public void setTargetNumberOfNodes(Integer targetNumberOfNodes) {
        this.targetNumberOfNodes = targetNumberOfNodes;
    }

    /**
     * <p>
     * The number of nodes that the cluster will have after the resize operation
     * is complete.
     * </p>
     * 
     * @return The number of nodes that the cluster will have after the resize
     *         operation is complete.
     */

    public Integer getTargetNumberOfNodes() {
        return this.targetNumberOfNodes;
    }

    /**
     * <p>
     * The number of nodes that the cluster will have after the resize operation
     * is complete.
     * </p>
     * 
     * @param targetNumberOfNodes
     *        The number of nodes that the cluster will have after the resize
     *        operation is complete.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeResizeResult withTargetNumberOfNodes(
            Integer targetNumberOfNodes) {
        setTargetNumberOfNodes(targetNumberOfNodes);
        return this;
    }

    /**
     * <p>
     * The cluster type after the resize operation is complete.
     * </p>
     * <p>
     * Valid Values: <code>multi-node</code> | <code>single-node</code>
     * </p>
     * 
     * @param targetClusterType
     *        The cluster type after the resize operation is complete.</p>
     *        <p>
     *        Valid Values: <code>multi-node</code> | <code>single-node</code>
     */

    public void setTargetClusterType(String targetClusterType) {
        this.targetClusterType = targetClusterType;
    }

    /**
     * <p>
     * The cluster type after the resize operation is complete.
     * </p>
     * <p>
     * Valid Values: <code>multi-node</code> | <code>single-node</code>
     * </p>
     * 
     * @return The cluster type after the resize operation is complete.</p>
     *         <p>
     *         Valid Values: <code>multi-node</code> | <code>single-node</code>
     */

    public String getTargetClusterType() {
        return this.targetClusterType;
    }

    /**
     * <p>
     * The cluster type after the resize operation is complete.
     * </p>
     * <p>
     * Valid Values: <code>multi-node</code> | <code>single-node</code>
     * </p>
     * 
     * @param targetClusterType
     *        The cluster type after the resize operation is complete.</p>
     *        <p>
     *        Valid Values: <code>multi-node</code> | <code>single-node</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeResizeResult withTargetClusterType(String targetClusterType) {
        setTargetClusterType(targetClusterType);
        return this;
    }

    /**
     * <p>
     * The status of the resize operation.
     * </p>
     * <p>
     * Valid Values: <code>NONE</code> | <code>IN_PROGRESS</code> |
     * <code>FAILED</code> | <code>SUCCEEDED</code>
     * </p>
     * 
     * @param status
     *        The status of the resize operation.</p>
     *        <p>
     *        Valid Values: <code>NONE</code> | <code>IN_PROGRESS</code> |
     *        <code>FAILED</code> | <code>SUCCEEDED</code>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the resize operation.
     * </p>
     * <p>
     * Valid Values: <code>NONE</code> | <code>IN_PROGRESS</code> |
     * <code>FAILED</code> | <code>SUCCEEDED</code>
     * </p>
     * 
     * @return The status of the resize operation.</p>
     *         <p>
     *         Valid Values: <code>NONE</code> | <code>IN_PROGRESS</code> |
     *         <code>FAILED</code> | <code>SUCCEEDED</code>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the resize operation.
     * </p>
     * <p>
     * Valid Values: <code>NONE</code> | <code>IN_PROGRESS</code> |
     * <code>FAILED</code> | <code>SUCCEEDED</code>
     * </p>
     * 
     * @param status
     *        The status of the resize operation.</p>
     *        <p>
     *        Valid Values: <code>NONE</code> | <code>IN_PROGRESS</code> |
     *        <code>FAILED</code> | <code>SUCCEEDED</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeResizeResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The names of tables that have been completely imported .
     * </p>
     * <p>
     * Valid Values: List of table names.
     * </p>
     * 
     * @return The names of tables that have been completely imported .</p>
     *         <p>
     *         Valid Values: List of table names.
     */

    public java.util.List<String> getImportTablesCompleted() {
        if (importTablesCompleted == null) {
            importTablesCompleted = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return importTablesCompleted;
    }

    /**
     * <p>
     * The names of tables that have been completely imported .
     * </p>
     * <p>
     * Valid Values: List of table names.
     * </p>
     * 
     * @param importTablesCompleted
     *        The names of tables that have been completely imported .</p>
     *        <p>
     *        Valid Values: List of table names.
     */

    public void setImportTablesCompleted(
            java.util.Collection<String> importTablesCompleted) {
        if (importTablesCompleted == null) {
            this.importTablesCompleted = null;
            return;
        }

        this.importTablesCompleted = new com.amazonaws.internal.SdkInternalList<String>(
                importTablesCompleted);
    }

    /**
     * <p>
     * The names of tables that have been completely imported .
     * </p>
     * <p>
     * Valid Values: List of table names.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setImportTablesCompleted(java.util.Collection)} or
     * {@link #withImportTablesCompleted(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param importTablesCompleted
     *        The names of tables that have been completely imported .</p>
     *        <p>
     *        Valid Values: List of table names.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeResizeResult withImportTablesCompleted(
            String... importTablesCompleted) {
        if (this.importTablesCompleted == null) {
            setImportTablesCompleted(new com.amazonaws.internal.SdkInternalList<String>(
                    importTablesCompleted.length));
        }
        for (String ele : importTablesCompleted) {
            this.importTablesCompleted.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of tables that have been completely imported .
     * </p>
     * <p>
     * Valid Values: List of table names.
     * </p>
     * 
     * @param importTablesCompleted
     *        The names of tables that have been completely imported .</p>
     *        <p>
     *        Valid Values: List of table names.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeResizeResult withImportTablesCompleted(
            java.util.Collection<String> importTablesCompleted) {
        setImportTablesCompleted(importTablesCompleted);
        return this;
    }

    /**
     * <p>
     * The names of tables that are being currently imported.
     * </p>
     * <p>
     * Valid Values: List of table names.
     * </p>
     * 
     * @return The names of tables that are being currently imported.</p>
     *         <p>
     *         Valid Values: List of table names.
     */

    public java.util.List<String> getImportTablesInProgress() {
        if (importTablesInProgress == null) {
            importTablesInProgress = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return importTablesInProgress;
    }

    /**
     * <p>
     * The names of tables that are being currently imported.
     * </p>
     * <p>
     * Valid Values: List of table names.
     * </p>
     * 
     * @param importTablesInProgress
     *        The names of tables that are being currently imported.</p>
     *        <p>
     *        Valid Values: List of table names.
     */

    public void setImportTablesInProgress(
            java.util.Collection<String> importTablesInProgress) {
        if (importTablesInProgress == null) {
            this.importTablesInProgress = null;
            return;
        }

        this.importTablesInProgress = new com.amazonaws.internal.SdkInternalList<String>(
                importTablesInProgress);
    }

    /**
     * <p>
     * The names of tables that are being currently imported.
     * </p>
     * <p>
     * Valid Values: List of table names.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setImportTablesInProgress(java.util.Collection)} or
     * {@link #withImportTablesInProgress(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param importTablesInProgress
     *        The names of tables that are being currently imported.</p>
     *        <p>
     *        Valid Values: List of table names.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeResizeResult withImportTablesInProgress(
            String... importTablesInProgress) {
        if (this.importTablesInProgress == null) {
            setImportTablesInProgress(new com.amazonaws.internal.SdkInternalList<String>(
                    importTablesInProgress.length));
        }
        for (String ele : importTablesInProgress) {
            this.importTablesInProgress.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of tables that are being currently imported.
     * </p>
     * <p>
     * Valid Values: List of table names.
     * </p>
     * 
     * @param importTablesInProgress
     *        The names of tables that are being currently imported.</p>
     *        <p>
     *        Valid Values: List of table names.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeResizeResult withImportTablesInProgress(
            java.util.Collection<String> importTablesInProgress) {
        setImportTablesInProgress(importTablesInProgress);
        return this;
    }

    /**
     * <p>
     * The names of tables that have not been yet imported.
     * </p>
     * <p>
     * Valid Values: List of table names
     * </p>
     * 
     * @return The names of tables that have not been yet imported.</p>
     *         <p>
     *         Valid Values: List of table names
     */

    public java.util.List<String> getImportTablesNotStarted() {
        if (importTablesNotStarted == null) {
            importTablesNotStarted = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return importTablesNotStarted;
    }

    /**
     * <p>
     * The names of tables that have not been yet imported.
     * </p>
     * <p>
     * Valid Values: List of table names
     * </p>
     * 
     * @param importTablesNotStarted
     *        The names of tables that have not been yet imported.</p>
     *        <p>
     *        Valid Values: List of table names
     */

    public void setImportTablesNotStarted(
            java.util.Collection<String> importTablesNotStarted) {
        if (importTablesNotStarted == null) {
            this.importTablesNotStarted = null;
            return;
        }

        this.importTablesNotStarted = new com.amazonaws.internal.SdkInternalList<String>(
                importTablesNotStarted);
    }

    /**
     * <p>
     * The names of tables that have not been yet imported.
     * </p>
     * <p>
     * Valid Values: List of table names
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setImportTablesNotStarted(java.util.Collection)} or
     * {@link #withImportTablesNotStarted(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param importTablesNotStarted
     *        The names of tables that have not been yet imported.</p>
     *        <p>
     *        Valid Values: List of table names
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeResizeResult withImportTablesNotStarted(
            String... importTablesNotStarted) {
        if (this.importTablesNotStarted == null) {
            setImportTablesNotStarted(new com.amazonaws.internal.SdkInternalList<String>(
                    importTablesNotStarted.length));
        }
        for (String ele : importTablesNotStarted) {
            this.importTablesNotStarted.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of tables that have not been yet imported.
     * </p>
     * <p>
     * Valid Values: List of table names
     * </p>
     * 
     * @param importTablesNotStarted
     *        The names of tables that have not been yet imported.</p>
     *        <p>
     *        Valid Values: List of table names
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeResizeResult withImportTablesNotStarted(
            java.util.Collection<String> importTablesNotStarted) {
        setImportTablesNotStarted(importTablesNotStarted);
        return this;
    }

    /**
     * <p>
     * The average rate of the resize operation over the last few minutes,
     * measured in megabytes per second. After the resize operation completes,
     * this value shows the average rate of the entire resize operation.
     * </p>
     * 
     * @param avgResizeRateInMegaBytesPerSecond
     *        The average rate of the resize operation over the last few
     *        minutes, measured in megabytes per second. After the resize
     *        operation completes, this value shows the average rate of the
     *        entire resize operation.
     */

    public void setAvgResizeRateInMegaBytesPerSecond(
            Double avgResizeRateInMegaBytesPerSecond) {
        this.avgResizeRateInMegaBytesPerSecond = avgResizeRateInMegaBytesPerSecond;
    }

    /**
     * <p>
     * The average rate of the resize operation over the last few minutes,
     * measured in megabytes per second. After the resize operation completes,
     * this value shows the average rate of the entire resize operation.
     * </p>
     * 
     * @return The average rate of the resize operation over the last few
     *         minutes, measured in megabytes per second. After the resize
     *         operation completes, this value shows the average rate of the
     *         entire resize operation.
     */

    public Double getAvgResizeRateInMegaBytesPerSecond() {
        return this.avgResizeRateInMegaBytesPerSecond;
    }

    /**
     * <p>
     * The average rate of the resize operation over the last few minutes,
     * measured in megabytes per second. After the resize operation completes,
     * this value shows the average rate of the entire resize operation.
     * </p>
     * 
     * @param avgResizeRateInMegaBytesPerSecond
     *        The average rate of the resize operation over the last few
     *        minutes, measured in megabytes per second. After the resize
     *        operation completes, this value shows the average rate of the
     *        entire resize operation.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeResizeResult withAvgResizeRateInMegaBytesPerSecond(
            Double avgResizeRateInMegaBytesPerSecond) {
        setAvgResizeRateInMegaBytesPerSecond(avgResizeRateInMegaBytesPerSecond);
        return this;
    }

    /**
     * <p>
     * The estimated total amount of data, in megabytes, on the cluster before
     * the resize operation began.
     * </p>
     * 
     * @param totalResizeDataInMegaBytes
     *        The estimated total amount of data, in megabytes, on the cluster
     *        before the resize operation began.
     */

    public void setTotalResizeDataInMegaBytes(Long totalResizeDataInMegaBytes) {
        this.totalResizeDataInMegaBytes = totalResizeDataInMegaBytes;
    }

    /**
     * <p>
     * The estimated total amount of data, in megabytes, on the cluster before
     * the resize operation began.
     * </p>
     * 
     * @return The estimated total amount of data, in megabytes, on the cluster
     *         before the resize operation began.
     */

    public Long getTotalResizeDataInMegaBytes() {
        return this.totalResizeDataInMegaBytes;
    }

    /**
     * <p>
     * The estimated total amount of data, in megabytes, on the cluster before
     * the resize operation began.
     * </p>
     * 
     * @param totalResizeDataInMegaBytes
     *        The estimated total amount of data, in megabytes, on the cluster
     *        before the resize operation began.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeResizeResult withTotalResizeDataInMegaBytes(
            Long totalResizeDataInMegaBytes) {
        setTotalResizeDataInMegaBytes(totalResizeDataInMegaBytes);
        return this;
    }

    /**
     * <p>
     * While the resize operation is in progress, this value shows the current
     * amount of data, in megabytes, that has been processed so far. When the
     * resize operation is complete, this value shows the total amount of data,
     * in megabytes, on the cluster, which may be more or less than
     * TotalResizeDataInMegaBytes (the estimated total amount of data before
     * resize).
     * </p>
     * 
     * @param progressInMegaBytes
     *        While the resize operation is in progress, this value shows the
     *        current amount of data, in megabytes, that has been processed so
     *        far. When the resize operation is complete, this value shows the
     *        total amount of data, in megabytes, on the cluster, which may be
     *        more or less than TotalResizeDataInMegaBytes (the estimated total
     *        amount of data before resize).
     */

    public void setProgressInMegaBytes(Long progressInMegaBytes) {
        this.progressInMegaBytes = progressInMegaBytes;
    }

    /**
     * <p>
     * While the resize operation is in progress, this value shows the current
     * amount of data, in megabytes, that has been processed so far. When the
     * resize operation is complete, this value shows the total amount of data,
     * in megabytes, on the cluster, which may be more or less than
     * TotalResizeDataInMegaBytes (the estimated total amount of data before
     * resize).
     * </p>
     * 
     * @return While the resize operation is in progress, this value shows the
     *         current amount of data, in megabytes, that has been processed so
     *         far. When the resize operation is complete, this value shows the
     *         total amount of data, in megabytes, on the cluster, which may be
     *         more or less than TotalResizeDataInMegaBytes (the estimated total
     *         amount of data before resize).
     */

    public Long getProgressInMegaBytes() {
        return this.progressInMegaBytes;
    }

    /**
     * <p>
     * While the resize operation is in progress, this value shows the current
     * amount of data, in megabytes, that has been processed so far. When the
     * resize operation is complete, this value shows the total amount of data,
     * in megabytes, on the cluster, which may be more or less than
     * TotalResizeDataInMegaBytes (the estimated total amount of data before
     * resize).
     * </p>
     * 
     * @param progressInMegaBytes
     *        While the resize operation is in progress, this value shows the
     *        current amount of data, in megabytes, that has been processed so
     *        far. When the resize operation is complete, this value shows the
     *        total amount of data, in megabytes, on the cluster, which may be
     *        more or less than TotalResizeDataInMegaBytes (the estimated total
     *        amount of data before resize).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeResizeResult withProgressInMegaBytes(Long progressInMegaBytes) {
        setProgressInMegaBytes(progressInMegaBytes);
        return this;
    }

    /**
     * <p>
     * The amount of seconds that have elapsed since the resize operation began.
     * After the resize operation completes, this value shows the total actual
     * time, in seconds, for the resize operation.
     * </p>
     * 
     * @param elapsedTimeInSeconds
     *        The amount of seconds that have elapsed since the resize operation
     *        began. After the resize operation completes, this value shows the
     *        total actual time, in seconds, for the resize operation.
     */

    public void setElapsedTimeInSeconds(Long elapsedTimeInSeconds) {
        this.elapsedTimeInSeconds = elapsedTimeInSeconds;
    }

    /**
     * <p>
     * The amount of seconds that have elapsed since the resize operation began.
     * After the resize operation completes, this value shows the total actual
     * time, in seconds, for the resize operation.
     * </p>
     * 
     * @return The amount of seconds that have elapsed since the resize
     *         operation began. After the resize operation completes, this value
     *         shows the total actual time, in seconds, for the resize
     *         operation.
     */

    public Long getElapsedTimeInSeconds() {
        return this.elapsedTimeInSeconds;
    }

    /**
     * <p>
     * The amount of seconds that have elapsed since the resize operation began.
     * After the resize operation completes, this value shows the total actual
     * time, in seconds, for the resize operation.
     * </p>
     * 
     * @param elapsedTimeInSeconds
     *        The amount of seconds that have elapsed since the resize operation
     *        began. After the resize operation completes, this value shows the
     *        total actual time, in seconds, for the resize operation.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeResizeResult withElapsedTimeInSeconds(
            Long elapsedTimeInSeconds) {
        setElapsedTimeInSeconds(elapsedTimeInSeconds);
        return this;
    }

    /**
     * <p>
     * The estimated time remaining, in seconds, until the resize operation is
     * complete. This value is calculated based on the average resize rate and
     * the estimated amount of data remaining to be processed. Once the resize
     * operation is complete, this value will be 0.
     * </p>
     * 
     * @param estimatedTimeToCompletionInSeconds
     *        The estimated time remaining, in seconds, until the resize
     *        operation is complete. This value is calculated based on the
     *        average resize rate and the estimated amount of data remaining to
     *        be processed. Once the resize operation is complete, this value
     *        will be 0.
     */

    public void setEstimatedTimeToCompletionInSeconds(
            Long estimatedTimeToCompletionInSeconds) {
        this.estimatedTimeToCompletionInSeconds = estimatedTimeToCompletionInSeconds;
    }

    /**
     * <p>
     * The estimated time remaining, in seconds, until the resize operation is
     * complete. This value is calculated based on the average resize rate and
     * the estimated amount of data remaining to be processed. Once the resize
     * operation is complete, this value will be 0.
     * </p>
     * 
     * @return The estimated time remaining, in seconds, until the resize
     *         operation is complete. This value is calculated based on the
     *         average resize rate and the estimated amount of data remaining to
     *         be processed. Once the resize operation is complete, this value
     *         will be 0.
     */

    public Long getEstimatedTimeToCompletionInSeconds() {
        return this.estimatedTimeToCompletionInSeconds;
    }

    /**
     * <p>
     * The estimated time remaining, in seconds, until the resize operation is
     * complete. This value is calculated based on the average resize rate and
     * the estimated amount of data remaining to be processed. Once the resize
     * operation is complete, this value will be 0.
     * </p>
     * 
     * @param estimatedTimeToCompletionInSeconds
     *        The estimated time remaining, in seconds, until the resize
     *        operation is complete. This value is calculated based on the
     *        average resize rate and the estimated amount of data remaining to
     *        be processed. Once the resize operation is complete, this value
     *        will be 0.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeResizeResult withEstimatedTimeToCompletionInSeconds(
            Long estimatedTimeToCompletionInSeconds) {
        setEstimatedTimeToCompletionInSeconds(estimatedTimeToCompletionInSeconds);
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
        if (getTargetNodeType() != null)
            sb.append("TargetNodeType: " + getTargetNodeType() + ",");
        if (getTargetNumberOfNodes() != null)
            sb.append("TargetNumberOfNodes: " + getTargetNumberOfNodes() + ",");
        if (getTargetClusterType() != null)
            sb.append("TargetClusterType: " + getTargetClusterType() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getImportTablesCompleted() != null)
            sb.append("ImportTablesCompleted: " + getImportTablesCompleted()
                    + ",");
        if (getImportTablesInProgress() != null)
            sb.append("ImportTablesInProgress: " + getImportTablesInProgress()
                    + ",");
        if (getImportTablesNotStarted() != null)
            sb.append("ImportTablesNotStarted: " + getImportTablesNotStarted()
                    + ",");
        if (getAvgResizeRateInMegaBytesPerSecond() != null)
            sb.append("AvgResizeRateInMegaBytesPerSecond: "
                    + getAvgResizeRateInMegaBytesPerSecond() + ",");
        if (getTotalResizeDataInMegaBytes() != null)
            sb.append("TotalResizeDataInMegaBytes: "
                    + getTotalResizeDataInMegaBytes() + ",");
        if (getProgressInMegaBytes() != null)
            sb.append("ProgressInMegaBytes: " + getProgressInMegaBytes() + ",");
        if (getElapsedTimeInSeconds() != null)
            sb.append("ElapsedTimeInSeconds: " + getElapsedTimeInSeconds()
                    + ",");
        if (getEstimatedTimeToCompletionInSeconds() != null)
            sb.append("EstimatedTimeToCompletionInSeconds: "
                    + getEstimatedTimeToCompletionInSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeResizeResult == false)
            return false;
        DescribeResizeResult other = (DescribeResizeResult) obj;
        if (other.getTargetNodeType() == null
                ^ this.getTargetNodeType() == null)
            return false;
        if (other.getTargetNodeType() != null
                && other.getTargetNodeType().equals(this.getTargetNodeType()) == false)
            return false;
        if (other.getTargetNumberOfNodes() == null
                ^ this.getTargetNumberOfNodes() == null)
            return false;
        if (other.getTargetNumberOfNodes() != null
                && other.getTargetNumberOfNodes().equals(
                        this.getTargetNumberOfNodes()) == false)
            return false;
        if (other.getTargetClusterType() == null
                ^ this.getTargetClusterType() == null)
            return false;
        if (other.getTargetClusterType() != null
                && other.getTargetClusterType().equals(
                        this.getTargetClusterType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null
                && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getImportTablesCompleted() == null
                ^ this.getImportTablesCompleted() == null)
            return false;
        if (other.getImportTablesCompleted() != null
                && other.getImportTablesCompleted().equals(
                        this.getImportTablesCompleted()) == false)
            return false;
        if (other.getImportTablesInProgress() == null
                ^ this.getImportTablesInProgress() == null)
            return false;
        if (other.getImportTablesInProgress() != null
                && other.getImportTablesInProgress().equals(
                        this.getImportTablesInProgress()) == false)
            return false;
        if (other.getImportTablesNotStarted() == null
                ^ this.getImportTablesNotStarted() == null)
            return false;
        if (other.getImportTablesNotStarted() != null
                && other.getImportTablesNotStarted().equals(
                        this.getImportTablesNotStarted()) == false)
            return false;
        if (other.getAvgResizeRateInMegaBytesPerSecond() == null
                ^ this.getAvgResizeRateInMegaBytesPerSecond() == null)
            return false;
        if (other.getAvgResizeRateInMegaBytesPerSecond() != null
                && other.getAvgResizeRateInMegaBytesPerSecond().equals(
                        this.getAvgResizeRateInMegaBytesPerSecond()) == false)
            return false;
        if (other.getTotalResizeDataInMegaBytes() == null
                ^ this.getTotalResizeDataInMegaBytes() == null)
            return false;
        if (other.getTotalResizeDataInMegaBytes() != null
                && other.getTotalResizeDataInMegaBytes().equals(
                        this.getTotalResizeDataInMegaBytes()) == false)
            return false;
        if (other.getProgressInMegaBytes() == null
                ^ this.getProgressInMegaBytes() == null)
            return false;
        if (other.getProgressInMegaBytes() != null
                && other.getProgressInMegaBytes().equals(
                        this.getProgressInMegaBytes()) == false)
            return false;
        if (other.getElapsedTimeInSeconds() == null
                ^ this.getElapsedTimeInSeconds() == null)
            return false;
        if (other.getElapsedTimeInSeconds() != null
                && other.getElapsedTimeInSeconds().equals(
                        this.getElapsedTimeInSeconds()) == false)
            return false;
        if (other.getEstimatedTimeToCompletionInSeconds() == null
                ^ this.getEstimatedTimeToCompletionInSeconds() == null)
            return false;
        if (other.getEstimatedTimeToCompletionInSeconds() != null
                && other.getEstimatedTimeToCompletionInSeconds().equals(
                        this.getEstimatedTimeToCompletionInSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getTargetNodeType() == null) ? 0 : getTargetNodeType()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getTargetNumberOfNodes() == null) ? 0
                        : getTargetNumberOfNodes().hashCode());
        hashCode = prime
                * hashCode
                + ((getTargetClusterType() == null) ? 0
                        : getTargetClusterType().hashCode());
        hashCode = prime * hashCode
                + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getImportTablesCompleted() == null) ? 0
                        : getImportTablesCompleted().hashCode());
        hashCode = prime
                * hashCode
                + ((getImportTablesInProgress() == null) ? 0
                        : getImportTablesInProgress().hashCode());
        hashCode = prime
                * hashCode
                + ((getImportTablesNotStarted() == null) ? 0
                        : getImportTablesNotStarted().hashCode());
        hashCode = prime
                * hashCode
                + ((getAvgResizeRateInMegaBytesPerSecond() == null) ? 0
                        : getAvgResizeRateInMegaBytesPerSecond().hashCode());
        hashCode = prime
                * hashCode
                + ((getTotalResizeDataInMegaBytes() == null) ? 0
                        : getTotalResizeDataInMegaBytes().hashCode());
        hashCode = prime
                * hashCode
                + ((getProgressInMegaBytes() == null) ? 0
                        : getProgressInMegaBytes().hashCode());
        hashCode = prime
                * hashCode
                + ((getElapsedTimeInSeconds() == null) ? 0
                        : getElapsedTimeInSeconds().hashCode());
        hashCode = prime
                * hashCode
                + ((getEstimatedTimeToCompletionInSeconds() == null) ? 0
                        : getEstimatedTimeToCompletionInSeconds().hashCode());
        return hashCode;
    }

    @Override
    public DescribeResizeResult clone() {
        try {
            return (DescribeResizeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

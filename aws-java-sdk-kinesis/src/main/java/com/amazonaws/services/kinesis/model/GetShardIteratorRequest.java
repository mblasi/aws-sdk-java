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
package com.amazonaws.services.kinesis.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input for <code>GetShardIterator</code>.
 * </p>
 */
public class GetShardIteratorRequest extends
        com.amazonaws.AmazonWebServiceRequest implements Serializable,
        Cloneable {

    /**
     * <p>
     * The name of the Amazon Kinesis stream.
     * </p>
     */
    private String streamName;
    /**
     * <p>
     * The shard ID of the Amazon Kinesis shard to get the iterator for.
     * </p>
     */
    private String shardId;
    /**
     * <p>
     * Determines how the shard iterator is used to start reading data records
     * from the shard.
     * </p>
     * <p>
     * The following are the valid Amazon Kinesis shard iterator types:
     * </p>
     * <ul>
     * <li>AT_SEQUENCE_NUMBER - Start reading from the position denoted by a
     * specific sequence number, provided in the value
     * <code>StartingSequenceNumber</code>.</li>
     * <li>AFTER_SEQUENCE_NUMBER - Start reading right after the position
     * denoted by a specific sequence number, provided in the value
     * <code>StartingSequenceNumber</code>.</li>
     * <li>AT_TIMESTAMP - Start reading from the position denoted by a specific
     * timestamp, provided in the value <code>Timestamp</code>.</li>
     * <li>TRIM_HORIZON - Start reading at the last untrimmed record in the
     * shard in the system, which is the oldest data record in the shard.</li>
     * <li>LATEST - Start reading just after the most recent record in the
     * shard, so that you always read the most recent data in the shard.</li>
     * </ul>
     */
    private String shardIteratorType;
    /**
     * <p>
     * The sequence number of the data record in the shard from which to start
     * reading. Used with shard iterator type AT_SEQUENCE_NUMBER and
     * AFTER_SEQUENCE_NUMBER.
     * </p>
     */
    private String startingSequenceNumber;
    /**
     * <p>
     * The timestamp of the data record from which to start reading. Used with
     * shard iterator type AT_TIMESTAMP. A timestamp is the Unix epoch date with
     * precision in milliseconds. For example,
     * <code>2016-04-04T19:58:46.480-00:00</code> or <code>1459799926.480</code>
     * . If a record with this exact timestamp does not exist, the iterator
     * returned is for the next (later) record. If the timestamp is older than
     * the current trim horizon, the iterator returned is for the oldest
     * untrimmed data record (TRIM_HORIZON).
     * </p>
     */
    private java.util.Date timestamp;

    /**
     * <p>
     * The name of the Amazon Kinesis stream.
     * </p>
     * 
     * @param streamName
     *        The name of the Amazon Kinesis stream.
     */

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the Amazon Kinesis stream.
     * </p>
     * 
     * @return The name of the Amazon Kinesis stream.
     */

    public String getStreamName() {
        return this.streamName;
    }

    /**
     * <p>
     * The name of the Amazon Kinesis stream.
     * </p>
     * 
     * @param streamName
     *        The name of the Amazon Kinesis stream.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetShardIteratorRequest withStreamName(String streamName) {
        setStreamName(streamName);
        return this;
    }

    /**
     * <p>
     * The shard ID of the Amazon Kinesis shard to get the iterator for.
     * </p>
     * 
     * @param shardId
     *        The shard ID of the Amazon Kinesis shard to get the iterator for.
     */

    public void setShardId(String shardId) {
        this.shardId = shardId;
    }

    /**
     * <p>
     * The shard ID of the Amazon Kinesis shard to get the iterator for.
     * </p>
     * 
     * @return The shard ID of the Amazon Kinesis shard to get the iterator for.
     */

    public String getShardId() {
        return this.shardId;
    }

    /**
     * <p>
     * The shard ID of the Amazon Kinesis shard to get the iterator for.
     * </p>
     * 
     * @param shardId
     *        The shard ID of the Amazon Kinesis shard to get the iterator for.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetShardIteratorRequest withShardId(String shardId) {
        setShardId(shardId);
        return this;
    }

    /**
     * <p>
     * Determines how the shard iterator is used to start reading data records
     * from the shard.
     * </p>
     * <p>
     * The following are the valid Amazon Kinesis shard iterator types:
     * </p>
     * <ul>
     * <li>AT_SEQUENCE_NUMBER - Start reading from the position denoted by a
     * specific sequence number, provided in the value
     * <code>StartingSequenceNumber</code>.</li>
     * <li>AFTER_SEQUENCE_NUMBER - Start reading right after the position
     * denoted by a specific sequence number, provided in the value
     * <code>StartingSequenceNumber</code>.</li>
     * <li>AT_TIMESTAMP - Start reading from the position denoted by a specific
     * timestamp, provided in the value <code>Timestamp</code>.</li>
     * <li>TRIM_HORIZON - Start reading at the last untrimmed record in the
     * shard in the system, which is the oldest data record in the shard.</li>
     * <li>LATEST - Start reading just after the most recent record in the
     * shard, so that you always read the most recent data in the shard.</li>
     * </ul>
     * 
     * @param shardIteratorType
     *        Determines how the shard iterator is used to start reading data
     *        records from the shard.</p>
     *        <p>
     *        The following are the valid Amazon Kinesis shard iterator types:
     *        </p>
     *        <ul>
     *        <li>AT_SEQUENCE_NUMBER - Start reading from the position denoted
     *        by a specific sequence number, provided in the value
     *        <code>StartingSequenceNumber</code>.</li>
     *        <li>AFTER_SEQUENCE_NUMBER - Start reading right after the position
     *        denoted by a specific sequence number, provided in the value
     *        <code>StartingSequenceNumber</code>.</li>
     *        <li>AT_TIMESTAMP - Start reading from the position denoted by a
     *        specific timestamp, provided in the value <code>Timestamp</code>.</li>
     *        <li>TRIM_HORIZON - Start reading at the last untrimmed record in
     *        the shard in the system, which is the oldest data record in the
     *        shard.</li>
     *        <li>LATEST - Start reading just after the most recent record in
     *        the shard, so that you always read the most recent data in the
     *        shard.</li>
     * @see ShardIteratorType
     */

    public void setShardIteratorType(String shardIteratorType) {
        this.shardIteratorType = shardIteratorType;
    }

    /**
     * <p>
     * Determines how the shard iterator is used to start reading data records
     * from the shard.
     * </p>
     * <p>
     * The following are the valid Amazon Kinesis shard iterator types:
     * </p>
     * <ul>
     * <li>AT_SEQUENCE_NUMBER - Start reading from the position denoted by a
     * specific sequence number, provided in the value
     * <code>StartingSequenceNumber</code>.</li>
     * <li>AFTER_SEQUENCE_NUMBER - Start reading right after the position
     * denoted by a specific sequence number, provided in the value
     * <code>StartingSequenceNumber</code>.</li>
     * <li>AT_TIMESTAMP - Start reading from the position denoted by a specific
     * timestamp, provided in the value <code>Timestamp</code>.</li>
     * <li>TRIM_HORIZON - Start reading at the last untrimmed record in the
     * shard in the system, which is the oldest data record in the shard.</li>
     * <li>LATEST - Start reading just after the most recent record in the
     * shard, so that you always read the most recent data in the shard.</li>
     * </ul>
     * 
     * @return Determines how the shard iterator is used to start reading data
     *         records from the shard.</p>
     *         <p>
     *         The following are the valid Amazon Kinesis shard iterator types:
     *         </p>
     *         <ul>
     *         <li>AT_SEQUENCE_NUMBER - Start reading from the position denoted
     *         by a specific sequence number, provided in the value
     *         <code>StartingSequenceNumber</code>.</li>
     *         <li>AFTER_SEQUENCE_NUMBER - Start reading right after the
     *         position denoted by a specific sequence number, provided in the
     *         value <code>StartingSequenceNumber</code>.</li>
     *         <li>AT_TIMESTAMP - Start reading from the position denoted by a
     *         specific timestamp, provided in the value <code>Timestamp</code>.
     *         </li>
     *         <li>TRIM_HORIZON - Start reading at the last untrimmed record in
     *         the shard in the system, which is the oldest data record in the
     *         shard.</li>
     *         <li>LATEST - Start reading just after the most recent record in
     *         the shard, so that you always read the most recent data in the
     *         shard.</li>
     * @see ShardIteratorType
     */

    public String getShardIteratorType() {
        return this.shardIteratorType;
    }

    /**
     * <p>
     * Determines how the shard iterator is used to start reading data records
     * from the shard.
     * </p>
     * <p>
     * The following are the valid Amazon Kinesis shard iterator types:
     * </p>
     * <ul>
     * <li>AT_SEQUENCE_NUMBER - Start reading from the position denoted by a
     * specific sequence number, provided in the value
     * <code>StartingSequenceNumber</code>.</li>
     * <li>AFTER_SEQUENCE_NUMBER - Start reading right after the position
     * denoted by a specific sequence number, provided in the value
     * <code>StartingSequenceNumber</code>.</li>
     * <li>AT_TIMESTAMP - Start reading from the position denoted by a specific
     * timestamp, provided in the value <code>Timestamp</code>.</li>
     * <li>TRIM_HORIZON - Start reading at the last untrimmed record in the
     * shard in the system, which is the oldest data record in the shard.</li>
     * <li>LATEST - Start reading just after the most recent record in the
     * shard, so that you always read the most recent data in the shard.</li>
     * </ul>
     * 
     * @param shardIteratorType
     *        Determines how the shard iterator is used to start reading data
     *        records from the shard.</p>
     *        <p>
     *        The following are the valid Amazon Kinesis shard iterator types:
     *        </p>
     *        <ul>
     *        <li>AT_SEQUENCE_NUMBER - Start reading from the position denoted
     *        by a specific sequence number, provided in the value
     *        <code>StartingSequenceNumber</code>.</li>
     *        <li>AFTER_SEQUENCE_NUMBER - Start reading right after the position
     *        denoted by a specific sequence number, provided in the value
     *        <code>StartingSequenceNumber</code>.</li>
     *        <li>AT_TIMESTAMP - Start reading from the position denoted by a
     *        specific timestamp, provided in the value <code>Timestamp</code>.</li>
     *        <li>TRIM_HORIZON - Start reading at the last untrimmed record in
     *        the shard in the system, which is the oldest data record in the
     *        shard.</li>
     *        <li>LATEST - Start reading just after the most recent record in
     *        the shard, so that you always read the most recent data in the
     *        shard.</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ShardIteratorType
     */

    public GetShardIteratorRequest withShardIteratorType(
            String shardIteratorType) {
        setShardIteratorType(shardIteratorType);
        return this;
    }

    /**
     * <p>
     * Determines how the shard iterator is used to start reading data records
     * from the shard.
     * </p>
     * <p>
     * The following are the valid Amazon Kinesis shard iterator types:
     * </p>
     * <ul>
     * <li>AT_SEQUENCE_NUMBER - Start reading from the position denoted by a
     * specific sequence number, provided in the value
     * <code>StartingSequenceNumber</code>.</li>
     * <li>AFTER_SEQUENCE_NUMBER - Start reading right after the position
     * denoted by a specific sequence number, provided in the value
     * <code>StartingSequenceNumber</code>.</li>
     * <li>AT_TIMESTAMP - Start reading from the position denoted by a specific
     * timestamp, provided in the value <code>Timestamp</code>.</li>
     * <li>TRIM_HORIZON - Start reading at the last untrimmed record in the
     * shard in the system, which is the oldest data record in the shard.</li>
     * <li>LATEST - Start reading just after the most recent record in the
     * shard, so that you always read the most recent data in the shard.</li>
     * </ul>
     * 
     * @param shardIteratorType
     *        Determines how the shard iterator is used to start reading data
     *        records from the shard.</p>
     *        <p>
     *        The following are the valid Amazon Kinesis shard iterator types:
     *        </p>
     *        <ul>
     *        <li>AT_SEQUENCE_NUMBER - Start reading from the position denoted
     *        by a specific sequence number, provided in the value
     *        <code>StartingSequenceNumber</code>.</li>
     *        <li>AFTER_SEQUENCE_NUMBER - Start reading right after the position
     *        denoted by a specific sequence number, provided in the value
     *        <code>StartingSequenceNumber</code>.</li>
     *        <li>AT_TIMESTAMP - Start reading from the position denoted by a
     *        specific timestamp, provided in the value <code>Timestamp</code>.</li>
     *        <li>TRIM_HORIZON - Start reading at the last untrimmed record in
     *        the shard in the system, which is the oldest data record in the
     *        shard.</li>
     *        <li>LATEST - Start reading just after the most recent record in
     *        the shard, so that you always read the most recent data in the
     *        shard.</li>
     * @see ShardIteratorType
     */

    public void setShardIteratorType(ShardIteratorType shardIteratorType) {
        this.shardIteratorType = shardIteratorType.toString();
    }

    /**
     * <p>
     * Determines how the shard iterator is used to start reading data records
     * from the shard.
     * </p>
     * <p>
     * The following are the valid Amazon Kinesis shard iterator types:
     * </p>
     * <ul>
     * <li>AT_SEQUENCE_NUMBER - Start reading from the position denoted by a
     * specific sequence number, provided in the value
     * <code>StartingSequenceNumber</code>.</li>
     * <li>AFTER_SEQUENCE_NUMBER - Start reading right after the position
     * denoted by a specific sequence number, provided in the value
     * <code>StartingSequenceNumber</code>.</li>
     * <li>AT_TIMESTAMP - Start reading from the position denoted by a specific
     * timestamp, provided in the value <code>Timestamp</code>.</li>
     * <li>TRIM_HORIZON - Start reading at the last untrimmed record in the
     * shard in the system, which is the oldest data record in the shard.</li>
     * <li>LATEST - Start reading just after the most recent record in the
     * shard, so that you always read the most recent data in the shard.</li>
     * </ul>
     * 
     * @param shardIteratorType
     *        Determines how the shard iterator is used to start reading data
     *        records from the shard.</p>
     *        <p>
     *        The following are the valid Amazon Kinesis shard iterator types:
     *        </p>
     *        <ul>
     *        <li>AT_SEQUENCE_NUMBER - Start reading from the position denoted
     *        by a specific sequence number, provided in the value
     *        <code>StartingSequenceNumber</code>.</li>
     *        <li>AFTER_SEQUENCE_NUMBER - Start reading right after the position
     *        denoted by a specific sequence number, provided in the value
     *        <code>StartingSequenceNumber</code>.</li>
     *        <li>AT_TIMESTAMP - Start reading from the position denoted by a
     *        specific timestamp, provided in the value <code>Timestamp</code>.</li>
     *        <li>TRIM_HORIZON - Start reading at the last untrimmed record in
     *        the shard in the system, which is the oldest data record in the
     *        shard.</li>
     *        <li>LATEST - Start reading just after the most recent record in
     *        the shard, so that you always read the most recent data in the
     *        shard.</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ShardIteratorType
     */

    public GetShardIteratorRequest withShardIteratorType(
            ShardIteratorType shardIteratorType) {
        setShardIteratorType(shardIteratorType);
        return this;
    }

    /**
     * <p>
     * The sequence number of the data record in the shard from which to start
     * reading. Used with shard iterator type AT_SEQUENCE_NUMBER and
     * AFTER_SEQUENCE_NUMBER.
     * </p>
     * 
     * @param startingSequenceNumber
     *        The sequence number of the data record in the shard from which to
     *        start reading. Used with shard iterator type AT_SEQUENCE_NUMBER
     *        and AFTER_SEQUENCE_NUMBER.
     */

    public void setStartingSequenceNumber(String startingSequenceNumber) {
        this.startingSequenceNumber = startingSequenceNumber;
    }

    /**
     * <p>
     * The sequence number of the data record in the shard from which to start
     * reading. Used with shard iterator type AT_SEQUENCE_NUMBER and
     * AFTER_SEQUENCE_NUMBER.
     * </p>
     * 
     * @return The sequence number of the data record in the shard from which to
     *         start reading. Used with shard iterator type AT_SEQUENCE_NUMBER
     *         and AFTER_SEQUENCE_NUMBER.
     */

    public String getStartingSequenceNumber() {
        return this.startingSequenceNumber;
    }

    /**
     * <p>
     * The sequence number of the data record in the shard from which to start
     * reading. Used with shard iterator type AT_SEQUENCE_NUMBER and
     * AFTER_SEQUENCE_NUMBER.
     * </p>
     * 
     * @param startingSequenceNumber
     *        The sequence number of the data record in the shard from which to
     *        start reading. Used with shard iterator type AT_SEQUENCE_NUMBER
     *        and AFTER_SEQUENCE_NUMBER.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetShardIteratorRequest withStartingSequenceNumber(
            String startingSequenceNumber) {
        setStartingSequenceNumber(startingSequenceNumber);
        return this;
    }

    /**
     * <p>
     * The timestamp of the data record from which to start reading. Used with
     * shard iterator type AT_TIMESTAMP. A timestamp is the Unix epoch date with
     * precision in milliseconds. For example,
     * <code>2016-04-04T19:58:46.480-00:00</code> or <code>1459799926.480</code>
     * . If a record with this exact timestamp does not exist, the iterator
     * returned is for the next (later) record. If the timestamp is older than
     * the current trim horizon, the iterator returned is for the oldest
     * untrimmed data record (TRIM_HORIZON).
     * </p>
     * 
     * @param timestamp
     *        The timestamp of the data record from which to start reading. Used
     *        with shard iterator type AT_TIMESTAMP. A timestamp is the Unix
     *        epoch date with precision in milliseconds. For example,
     *        <code>2016-04-04T19:58:46.480-00:00</code> or
     *        <code>1459799926.480</code>. If a record with this exact timestamp
     *        does not exist, the iterator returned is for the next (later)
     *        record. If the timestamp is older than the current trim horizon,
     *        the iterator returned is for the oldest untrimmed data record
     *        (TRIM_HORIZON).
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The timestamp of the data record from which to start reading. Used with
     * shard iterator type AT_TIMESTAMP. A timestamp is the Unix epoch date with
     * precision in milliseconds. For example,
     * <code>2016-04-04T19:58:46.480-00:00</code> or <code>1459799926.480</code>
     * . If a record with this exact timestamp does not exist, the iterator
     * returned is for the next (later) record. If the timestamp is older than
     * the current trim horizon, the iterator returned is for the oldest
     * untrimmed data record (TRIM_HORIZON).
     * </p>
     * 
     * @return The timestamp of the data record from which to start reading.
     *         Used with shard iterator type AT_TIMESTAMP. A timestamp is the
     *         Unix epoch date with precision in milliseconds. For example,
     *         <code>2016-04-04T19:58:46.480-00:00</code> or
     *         <code>1459799926.480</code>. If a record with this exact
     *         timestamp does not exist, the iterator returned is for the next
     *         (later) record. If the timestamp is older than the current trim
     *         horizon, the iterator returned is for the oldest untrimmed data
     *         record (TRIM_HORIZON).
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The timestamp of the data record from which to start reading. Used with
     * shard iterator type AT_TIMESTAMP. A timestamp is the Unix epoch date with
     * precision in milliseconds. For example,
     * <code>2016-04-04T19:58:46.480-00:00</code> or <code>1459799926.480</code>
     * . If a record with this exact timestamp does not exist, the iterator
     * returned is for the next (later) record. If the timestamp is older than
     * the current trim horizon, the iterator returned is for the oldest
     * untrimmed data record (TRIM_HORIZON).
     * </p>
     * 
     * @param timestamp
     *        The timestamp of the data record from which to start reading. Used
     *        with shard iterator type AT_TIMESTAMP. A timestamp is the Unix
     *        epoch date with precision in milliseconds. For example,
     *        <code>2016-04-04T19:58:46.480-00:00</code> or
     *        <code>1459799926.480</code>. If a record with this exact timestamp
     *        does not exist, the iterator returned is for the next (later)
     *        record. If the timestamp is older than the current trim horizon,
     *        the iterator returned is for the oldest untrimmed data record
     *        (TRIM_HORIZON).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetShardIteratorRequest withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
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
        if (getStreamName() != null)
            sb.append("StreamName: " + getStreamName() + ",");
        if (getShardId() != null)
            sb.append("ShardId: " + getShardId() + ",");
        if (getShardIteratorType() != null)
            sb.append("ShardIteratorType: " + getShardIteratorType() + ",");
        if (getStartingSequenceNumber() != null)
            sb.append("StartingSequenceNumber: " + getStartingSequenceNumber()
                    + ",");
        if (getTimestamp() != null)
            sb.append("Timestamp: " + getTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetShardIteratorRequest == false)
            return false;
        GetShardIteratorRequest other = (GetShardIteratorRequest) obj;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null
                && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getShardId() == null ^ this.getShardId() == null)
            return false;
        if (other.getShardId() != null
                && other.getShardId().equals(this.getShardId()) == false)
            return false;
        if (other.getShardIteratorType() == null
                ^ this.getShardIteratorType() == null)
            return false;
        if (other.getShardIteratorType() != null
                && other.getShardIteratorType().equals(
                        this.getShardIteratorType()) == false)
            return false;
        if (other.getStartingSequenceNumber() == null
                ^ this.getStartingSequenceNumber() == null)
            return false;
        if (other.getStartingSequenceNumber() != null
                && other.getStartingSequenceNumber().equals(
                        this.getStartingSequenceNumber()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null
                && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode
                + ((getShardId() == null) ? 0 : getShardId().hashCode());
        hashCode = prime
                * hashCode
                + ((getShardIteratorType() == null) ? 0
                        : getShardIteratorType().hashCode());
        hashCode = prime
                * hashCode
                + ((getStartingSequenceNumber() == null) ? 0
                        : getStartingSequenceNumber().hashCode());
        hashCode = prime * hashCode
                + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public GetShardIteratorRequest clone() {
        return (GetShardIteratorRequest) super.clone();
    }
}

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
public class CreateDBClusterRequest extends
        com.amazonaws.AmazonWebServiceRequest implements Serializable,
        Cloneable {

    /**
     * <p>
     * A list of EC2 Availability Zones that instances in the DB cluster can be
     * created in. For information on regions and Availability Zones, see <a
     * href=
     * "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html"
     * >Regions and Availability Zones</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> availabilityZones;
    /**
     * <p>
     * The number of days for which automated backups are retained. You must
     * specify a minimum value of 1.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be a value from 1 to 35
     * </p>
     * </li>
     * </ul>
     */
    private Integer backupRetentionPeriod;
    /**
     * <p>
     * A value that indicates that the DB cluster should be associated with the
     * specified CharacterSet.
     * </p>
     */
    private String characterSetName;
    /**
     * <p>
     * The name for your database of up to 8 alpha-numeric characters. If you do
     * not provide a name, Amazon RDS will not create a database in the DB
     * cluster you are creating.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The DB cluster identifier. This parameter is stored as a lowercase
     * string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster1</code>
     * </p>
     */
    private String dBClusterIdentifier;
    /**
     * <p>
     * The name of the DB cluster parameter group to associate with this DB
     * cluster. If this argument is omitted, <code>default.aurora5.6</code> will
     * be used.
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
    private String dBClusterParameterGroupName;
    /**
     * <p>
     * A list of EC2 VPC security groups to associate with this DB cluster.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> vpcSecurityGroupIds;
    /**
     * <p>
     * A DB subnet group to associate with this DB cluster.
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters,
     * periods, underscores, spaces, or hyphens. Must not be default.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     */
    private String dBSubnetGroupName;
    /**
     * <p>
     * The name of the database engine to be used for this DB cluster.
     * </p>
     * <p>
     * Valid Values: <code>aurora</code>
     * </p>
     */
    private String engine;
    /**
     * <p>
     * The version number of the database engine to use.
     * </p>
     * <p>
     * <b>Aurora</b>
     * </p>
     * <p>
     * Example: <code>5.6.10a</code>
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The port number on which the instances in the DB cluster accept
     * connections.
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The name of the master user for the DB cluster.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 16 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word for the chosen database engine.
     * </p>
     * </li>
     * </ul>
     */
    private String masterUsername;
    /**
     * <p>
     * The password for the master database user. This password can contain any
     * printable ASCII character except "/", """, or "@".
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     */
    private String masterUserPassword;
    /**
     * <p>
     * A value that indicates that the DB cluster should be associated with the
     * specified option group.
     * </p>
     * <p>
     * Permanent options cannot be removed from an option group. The option
     * group cannot be removed from a DB cluster once it is associated with a DB
     * cluster.
     * </p>
     */
    private String optionGroupName;
    /**
     * <p>
     * The daily time range during which automated backups are created if
     * automated backups are enabled using the
     * <code>BackupRetentionPeriod</code> parameter.
     * </p>
     * <p>
     * Default: A 30-minute window selected at random from an 8-hour block of
     * time per region. To see the time blocks available, see <a href=
     * "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html"
     * > Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS
     * User Guide.</i>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the format <code>hh24:mi-hh24:mi</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Times should be in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not conflict with the preferred maintenance window.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes.
     * </p>
     * </li>
     * </ul>
     */
    private String preferredBackupWindow;
    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in
     * Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * Default: A 30-minute window selected at random from an 8-hour block of
     * time per region, occurring on a random day of the week. To see the time
     * blocks available, see <a href=
     * "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html"
     * > Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS
     * User Guide.</i>
     * </p>
     * <p>
     * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     * </p>
     * <p>
     * Constraints: Minimum 30-minute window.
     * </p>
     */
    private String preferredMaintenanceWindow;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source DB cluster if this DB
     * cluster is created as a Read Replica.
     * </p>
     */
    private String replicationSourceIdentifier;

    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * Specifies whether the DB cluster is encrypted.
     * </p>
     */
    private Boolean storageEncrypted;
    /**
     * <p>
     * The KMS key identifier for an encrypted DB cluster.
     * </p>
     * <p>
     * The KMS key identifier is the Amazon Resource Name (ARN) for the KMS
     * encryption key. If you are creating a DB cluster with the same AWS
     * account that owns the KMS encryption key used to encrypt the new DB
     * cluster, then you can use the KMS key alias instead of the ARN for the KM
     * encryption key.
     * </p>
     * <p>
     * If the <code>StorageEncrypted</code> parameter is true, and you do not
     * specify a value for the <code>KmsKeyId</code> parameter, then Amazon RDS
     * will use your default encryption key. AWS KMS creates the default
     * encryption key for your AWS account. Your AWS account has a different
     * default encryption key for each AWS region.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * A list of EC2 Availability Zones that instances in the DB cluster can be
     * created in. For information on regions and Availability Zones, see <a
     * href=
     * "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html"
     * >Regions and Availability Zones</a>.
     * </p>
     * 
     * @return A list of EC2 Availability Zones that instances in the DB cluster
     *         can be created in. For information on regions and Availability
     *         Zones, see <a href=
     *         "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html"
     *         >Regions and Availability Zones</a>.
     */

    public java.util.List<String> getAvailabilityZones() {
        if (availabilityZones == null) {
            availabilityZones = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return availabilityZones;
    }

    /**
     * <p>
     * A list of EC2 Availability Zones that instances in the DB cluster can be
     * created in. For information on regions and Availability Zones, see <a
     * href=
     * "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html"
     * >Regions and Availability Zones</a>.
     * </p>
     * 
     * @param availabilityZones
     *        A list of EC2 Availability Zones that instances in the DB cluster
     *        can be created in. For information on regions and Availability
     *        Zones, see <a href=
     *        "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html"
     *        >Regions and Availability Zones</a>.
     */

    public void setAvailabilityZones(
            java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new com.amazonaws.internal.SdkInternalList<String>(
                availabilityZones);
    }

    /**
     * <p>
     * A list of EC2 Availability Zones that instances in the DB cluster can be
     * created in. For information on regions and Availability Zones, see <a
     * href=
     * "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html"
     * >Regions and Availability Zones</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setAvailabilityZones(java.util.Collection)} or
     * {@link #withAvailabilityZones(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param availabilityZones
     *        A list of EC2 Availability Zones that instances in the DB cluster
     *        can be created in. For information on regions and Availability
     *        Zones, see <a href=
     *        "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html"
     *        >Regions and Availability Zones</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateDBClusterRequest withAvailabilityZones(
            String... availabilityZones) {
        if (this.availabilityZones == null) {
            setAvailabilityZones(new com.amazonaws.internal.SdkInternalList<String>(
                    availabilityZones.length));
        }
        for (String ele : availabilityZones) {
            this.availabilityZones.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of EC2 Availability Zones that instances in the DB cluster can be
     * created in. For information on regions and Availability Zones, see <a
     * href=
     * "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html"
     * >Regions and Availability Zones</a>.
     * </p>
     * 
     * @param availabilityZones
     *        A list of EC2 Availability Zones that instances in the DB cluster
     *        can be created in. For information on regions and Availability
     *        Zones, see <a href=
     *        "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html"
     *        >Regions and Availability Zones</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateDBClusterRequest withAvailabilityZones(
            java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * <p>
     * The number of days for which automated backups are retained. You must
     * specify a minimum value of 1.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be a value from 1 to 35
     * </p>
     * </li>
     * </ul>
     * 
     * @param backupRetentionPeriod
     *        The number of days for which automated backups are retained. You
     *        must specify a minimum value of 1.</p>
     *        <p>
     *        Default: 1
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be a value from 1 to 35
     *        </p>
     *        </li>
     */

    public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
    }

    /**
     * <p>
     * The number of days for which automated backups are retained. You must
     * specify a minimum value of 1.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be a value from 1 to 35
     * </p>
     * </li>
     * </ul>
     * 
     * @return The number of days for which automated backups are retained. You
     *         must specify a minimum value of 1.</p>
     *         <p>
     *         Default: 1
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be a value from 1 to 35
     *         </p>
     *         </li>
     */

    public Integer getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    /**
     * <p>
     * The number of days for which automated backups are retained. You must
     * specify a minimum value of 1.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be a value from 1 to 35
     * </p>
     * </li>
     * </ul>
     * 
     * @param backupRetentionPeriod
     *        The number of days for which automated backups are retained. You
     *        must specify a minimum value of 1.</p>
     *        <p>
     *        Default: 1
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be a value from 1 to 35
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateDBClusterRequest withBackupRetentionPeriod(
            Integer backupRetentionPeriod) {
        setBackupRetentionPeriod(backupRetentionPeriod);
        return this;
    }

    /**
     * <p>
     * A value that indicates that the DB cluster should be associated with the
     * specified CharacterSet.
     * </p>
     * 
     * @param characterSetName
     *        A value that indicates that the DB cluster should be associated
     *        with the specified CharacterSet.
     */

    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    /**
     * <p>
     * A value that indicates that the DB cluster should be associated with the
     * specified CharacterSet.
     * </p>
     * 
     * @return A value that indicates that the DB cluster should be associated
     *         with the specified CharacterSet.
     */

    public String getCharacterSetName() {
        return this.characterSetName;
    }

    /**
     * <p>
     * A value that indicates that the DB cluster should be associated with the
     * specified CharacterSet.
     * </p>
     * 
     * @param characterSetName
     *        A value that indicates that the DB cluster should be associated
     *        with the specified CharacterSet.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateDBClusterRequest withCharacterSetName(String characterSetName) {
        setCharacterSetName(characterSetName);
        return this;
    }

    /**
     * <p>
     * The name for your database of up to 8 alpha-numeric characters. If you do
     * not provide a name, Amazon RDS will not create a database in the DB
     * cluster you are creating.
     * </p>
     * 
     * @param databaseName
     *        The name for your database of up to 8 alpha-numeric characters. If
     *        you do not provide a name, Amazon RDS will not create a database
     *        in the DB cluster you are creating.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name for your database of up to 8 alpha-numeric characters. If you do
     * not provide a name, Amazon RDS will not create a database in the DB
     * cluster you are creating.
     * </p>
     * 
     * @return The name for your database of up to 8 alpha-numeric characters.
     *         If you do not provide a name, Amazon RDS will not create a
     *         database in the DB cluster you are creating.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name for your database of up to 8 alpha-numeric characters. If you do
     * not provide a name, Amazon RDS will not create a database in the DB
     * cluster you are creating.
     * </p>
     * 
     * @param databaseName
     *        The name for your database of up to 8 alpha-numeric characters. If
     *        you do not provide a name, Amazon RDS will not create a database
     *        in the DB cluster you are creating.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateDBClusterRequest withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The DB cluster identifier. This parameter is stored as a lowercase
     * string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster1</code>
     * </p>
     * 
     * @param dBClusterIdentifier
     *        The DB cluster identifier. This parameter is stored as a lowercase
     *        string.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 1 to 63 alphanumeric characters or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>my-cluster1</code>
     */

    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier. This parameter is stored as a lowercase
     * string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster1</code>
     * </p>
     * 
     * @return The DB cluster identifier. This parameter is stored as a
     *         lowercase string.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain from 1 to 63 alphanumeric characters or hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot end with a hyphen or contain two consecutive hyphens.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>my-cluster1</code>
     */

    public String getDBClusterIdentifier() {
        return this.dBClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier. This parameter is stored as a lowercase
     * string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster1</code>
     * </p>
     * 
     * @param dBClusterIdentifier
     *        The DB cluster identifier. This parameter is stored as a lowercase
     *        string.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 1 to 63 alphanumeric characters or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>my-cluster1</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateDBClusterRequest withDBClusterIdentifier(
            String dBClusterIdentifier) {
        setDBClusterIdentifier(dBClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The name of the DB cluster parameter group to associate with this DB
     * cluster. If this argument is omitted, <code>default.aurora5.6</code> will
     * be used.
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
     * @param dBClusterParameterGroupName
     *        The name of the DB cluster parameter group to associate with this
     *        DB cluster. If this argument is omitted,
     *        <code>default.aurora5.6</code> will be used. </p>
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

    public void setDBClusterParameterGroupName(
            String dBClusterParameterGroupName) {
        this.dBClusterParameterGroupName = dBClusterParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB cluster parameter group to associate with this DB
     * cluster. If this argument is omitted, <code>default.aurora5.6</code> will
     * be used.
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
     * @return The name of the DB cluster parameter group to associate with this
     *         DB cluster. If this argument is omitted,
     *         <code>default.aurora5.6</code> will be used. </p>
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

    public String getDBClusterParameterGroupName() {
        return this.dBClusterParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB cluster parameter group to associate with this DB
     * cluster. If this argument is omitted, <code>default.aurora5.6</code> will
     * be used.
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
     * @param dBClusterParameterGroupName
     *        The name of the DB cluster parameter group to associate with this
     *        DB cluster. If this argument is omitted,
     *        <code>default.aurora5.6</code> will be used. </p>
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

    public CreateDBClusterRequest withDBClusterParameterGroupName(
            String dBClusterParameterGroupName) {
        setDBClusterParameterGroupName(dBClusterParameterGroupName);
        return this;
    }

    /**
     * <p>
     * A list of EC2 VPC security groups to associate with this DB cluster.
     * </p>
     * 
     * @return A list of EC2 VPC security groups to associate with this DB
     *         cluster.
     */

    public java.util.List<String> getVpcSecurityGroupIds() {
        if (vpcSecurityGroupIds == null) {
            vpcSecurityGroupIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return vpcSecurityGroupIds;
    }

    /**
     * <p>
     * A list of EC2 VPC security groups to associate with this DB cluster.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of EC2 VPC security groups to associate with this DB
     *        cluster.
     */

    public void setVpcSecurityGroupIds(
            java.util.Collection<String> vpcSecurityGroupIds) {
        if (vpcSecurityGroupIds == null) {
            this.vpcSecurityGroupIds = null;
            return;
        }

        this.vpcSecurityGroupIds = new com.amazonaws.internal.SdkInternalList<String>(
                vpcSecurityGroupIds);
    }

    /**
     * <p>
     * A list of EC2 VPC security groups to associate with this DB cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setVpcSecurityGroupIds(java.util.Collection)} or
     * {@link #withVpcSecurityGroupIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of EC2 VPC security groups to associate with this DB
     *        cluster.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateDBClusterRequest withVpcSecurityGroupIds(
            String... vpcSecurityGroupIds) {
        if (this.vpcSecurityGroupIds == null) {
            setVpcSecurityGroupIds(new com.amazonaws.internal.SdkInternalList<String>(
                    vpcSecurityGroupIds.length));
        }
        for (String ele : vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of EC2 VPC security groups to associate with this DB cluster.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of EC2 VPC security groups to associate with this DB
     *        cluster.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateDBClusterRequest withVpcSecurityGroupIds(
            java.util.Collection<String> vpcSecurityGroupIds) {
        setVpcSecurityGroupIds(vpcSecurityGroupIds);
        return this;
    }

    /**
     * <p>
     * A DB subnet group to associate with this DB cluster.
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters,
     * periods, underscores, spaces, or hyphens. Must not be default.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     * 
     * @param dBSubnetGroupName
     *        A DB subnet group to associate with this DB cluster.</p>
     *        <p>
     *        Constraints: Must contain no more than 255 alphanumeric
     *        characters, periods, underscores, spaces, or hyphens. Must not be
     *        default.
     *        </p>
     *        <p>
     *        Example: <code>mySubnetgroup</code>
     */

    public void setDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
    }

    /**
     * <p>
     * A DB subnet group to associate with this DB cluster.
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters,
     * periods, underscores, spaces, or hyphens. Must not be default.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     * 
     * @return A DB subnet group to associate with this DB cluster.</p>
     *         <p>
     *         Constraints: Must contain no more than 255 alphanumeric
     *         characters, periods, underscores, spaces, or hyphens. Must not be
     *         default.
     *         </p>
     *         <p>
     *         Example: <code>mySubnetgroup</code>
     */

    public String getDBSubnetGroupName() {
        return this.dBSubnetGroupName;
    }

    /**
     * <p>
     * A DB subnet group to associate with this DB cluster.
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters,
     * periods, underscores, spaces, or hyphens. Must not be default.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     * 
     * @param dBSubnetGroupName
     *        A DB subnet group to associate with this DB cluster.</p>
     *        <p>
     *        Constraints: Must contain no more than 255 alphanumeric
     *        characters, periods, underscores, spaces, or hyphens. Must not be
     *        default.
     *        </p>
     *        <p>
     *        Example: <code>mySubnetgroup</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateDBClusterRequest withDBSubnetGroupName(String dBSubnetGroupName) {
        setDBSubnetGroupName(dBSubnetGroupName);
        return this;
    }

    /**
     * <p>
     * The name of the database engine to be used for this DB cluster.
     * </p>
     * <p>
     * Valid Values: <code>aurora</code>
     * </p>
     * 
     * @param engine
     *        The name of the database engine to be used for this DB
     *        cluster.</p>
     *        <p>
     *        Valid Values: <code>aurora</code>
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The name of the database engine to be used for this DB cluster.
     * </p>
     * <p>
     * Valid Values: <code>aurora</code>
     * </p>
     * 
     * @return The name of the database engine to be used for this DB
     *         cluster.</p>
     *         <p>
     *         Valid Values: <code>aurora</code>
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The name of the database engine to be used for this DB cluster.
     * </p>
     * <p>
     * Valid Values: <code>aurora</code>
     * </p>
     * 
     * @param engine
     *        The name of the database engine to be used for this DB
     *        cluster.</p>
     *        <p>
     *        Valid Values: <code>aurora</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateDBClusterRequest withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The version number of the database engine to use.
     * </p>
     * <p>
     * <b>Aurora</b>
     * </p>
     * <p>
     * Example: <code>5.6.10a</code>
     * </p>
     * 
     * @param engineVersion
     *        The version number of the database engine to use.</p>
     *        <p>
     *        <b>Aurora</b>
     *        </p>
     *        <p>
     *        Example: <code>5.6.10a</code>
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The version number of the database engine to use.
     * </p>
     * <p>
     * <b>Aurora</b>
     * </p>
     * <p>
     * Example: <code>5.6.10a</code>
     * </p>
     * 
     * @return The version number of the database engine to use.</p>
     *         <p>
     *         <b>Aurora</b>
     *         </p>
     *         <p>
     *         Example: <code>5.6.10a</code>
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The version number of the database engine to use.
     * </p>
     * <p>
     * <b>Aurora</b>
     * </p>
     * <p>
     * Example: <code>5.6.10a</code>
     * </p>
     * 
     * @param engineVersion
     *        The version number of the database engine to use.</p>
     *        <p>
     *        <b>Aurora</b>
     *        </p>
     *        <p>
     *        Example: <code>5.6.10a</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateDBClusterRequest withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The port number on which the instances in the DB cluster accept
     * connections.
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * 
     * @param port
     *        The port number on which the instances in the DB cluster accept
     *        connections.</p>
     *        <p>
     *        Default: <code>3306</code>
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port number on which the instances in the DB cluster accept
     * connections.
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * 
     * @return The port number on which the instances in the DB cluster accept
     *         connections.</p>
     *         <p>
     *         Default: <code>3306</code>
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port number on which the instances in the DB cluster accept
     * connections.
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * 
     * @param port
     *        The port number on which the instances in the DB cluster accept
     *        connections.</p>
     *        <p>
     *        Default: <code>3306</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateDBClusterRequest withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The name of the master user for the DB cluster.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 16 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word for the chosen database engine.
     * </p>
     * </li>
     * </ul>
     * 
     * @param masterUsername
     *        The name of the master user for the DB cluster.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 16 alphanumeric characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be a reserved word for the chosen database engine.
     *        </p>
     *        </li>
     */

    public void setMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
    }

    /**
     * <p>
     * The name of the master user for the DB cluster.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 16 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word for the chosen database engine.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the master user for the DB cluster.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be 1 to 16 alphanumeric characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot be a reserved word for the chosen database engine.
     *         </p>
     *         </li>
     */

    public String getMasterUsername() {
        return this.masterUsername;
    }

    /**
     * <p>
     * The name of the master user for the DB cluster.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 16 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word for the chosen database engine.
     * </p>
     * </li>
     * </ul>
     * 
     * @param masterUsername
     *        The name of the master user for the DB cluster.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 16 alphanumeric characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be a reserved word for the chosen database engine.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateDBClusterRequest withMasterUsername(String masterUsername) {
        setMasterUsername(masterUsername);
        return this;
    }

    /**
     * <p>
     * The password for the master database user. This password can contain any
     * printable ASCII character except "/", """, or "@".
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * 
     * @param masterUserPassword
     *        The password for the master database user. This password can
     *        contain any printable ASCII character except "/", """, or "@".</p>
     *        <p>
     *        Constraints: Must contain from 8 to 41 characters.
     */

    public void setMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
    }

    /**
     * <p>
     * The password for the master database user. This password can contain any
     * printable ASCII character except "/", """, or "@".
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * 
     * @return The password for the master database user. This password can
     *         contain any printable ASCII character except "/",
     *         """, or "@".</p>
     *         <p>
     *         Constraints: Must contain from 8 to 41 characters.
     */

    public String getMasterUserPassword() {
        return this.masterUserPassword;
    }

    /**
     * <p>
     * The password for the master database user. This password can contain any
     * printable ASCII character except "/", """, or "@".
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * 
     * @param masterUserPassword
     *        The password for the master database user. This password can
     *        contain any printable ASCII character except "/", """, or "@".</p>
     *        <p>
     *        Constraints: Must contain from 8 to 41 characters.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateDBClusterRequest withMasterUserPassword(
            String masterUserPassword) {
        setMasterUserPassword(masterUserPassword);
        return this;
    }

    /**
     * <p>
     * A value that indicates that the DB cluster should be associated with the
     * specified option group.
     * </p>
     * <p>
     * Permanent options cannot be removed from an option group. The option
     * group cannot be removed from a DB cluster once it is associated with a DB
     * cluster.
     * </p>
     * 
     * @param optionGroupName
     *        A value that indicates that the DB cluster should be associated
     *        with the specified option group.</p>
     *        <p>
     *        Permanent options cannot be removed from an option group. The
     *        option group cannot be removed from a DB cluster once it is
     *        associated with a DB cluster.
     */

    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }

    /**
     * <p>
     * A value that indicates that the DB cluster should be associated with the
     * specified option group.
     * </p>
     * <p>
     * Permanent options cannot be removed from an option group. The option
     * group cannot be removed from a DB cluster once it is associated with a DB
     * cluster.
     * </p>
     * 
     * @return A value that indicates that the DB cluster should be associated
     *         with the specified option group.</p>
     *         <p>
     *         Permanent options cannot be removed from an option group. The
     *         option group cannot be removed from a DB cluster once it is
     *         associated with a DB cluster.
     */

    public String getOptionGroupName() {
        return this.optionGroupName;
    }

    /**
     * <p>
     * A value that indicates that the DB cluster should be associated with the
     * specified option group.
     * </p>
     * <p>
     * Permanent options cannot be removed from an option group. The option
     * group cannot be removed from a DB cluster once it is associated with a DB
     * cluster.
     * </p>
     * 
     * @param optionGroupName
     *        A value that indicates that the DB cluster should be associated
     *        with the specified option group.</p>
     *        <p>
     *        Permanent options cannot be removed from an option group. The
     *        option group cannot be removed from a DB cluster once it is
     *        associated with a DB cluster.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateDBClusterRequest withOptionGroupName(String optionGroupName) {
        setOptionGroupName(optionGroupName);
        return this;
    }

    /**
     * <p>
     * The daily time range during which automated backups are created if
     * automated backups are enabled using the
     * <code>BackupRetentionPeriod</code> parameter.
     * </p>
     * <p>
     * Default: A 30-minute window selected at random from an 8-hour block of
     * time per region. To see the time blocks available, see <a href=
     * "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html"
     * > Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS
     * User Guide.</i>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the format <code>hh24:mi-hh24:mi</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Times should be in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not conflict with the preferred maintenance window.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes.
     * </p>
     * </li>
     * </ul>
     * 
     * @param preferredBackupWindow
     *        The daily time range during which automated backups are created if
     *        automated backups are enabled using the
     *        <code>BackupRetentionPeriod</code> parameter. </p>
     *        <p>
     *        Default: A 30-minute window selected at random from an 8-hour
     *        block of time per region. To see the time blocks available, see <a
     *        href=
     *        "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html"
     *        > Adjusting the Preferred Maintenance Window</a> in the <i>Amazon
     *        RDS User Guide.</i>
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be in the format <code>hh24:mi-hh24:mi</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Times should be in Universal Coordinated Time (UTC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must not conflict with the preferred maintenance window.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be at least 30 minutes.
     *        </p>
     *        </li>
     */

    public void setPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
    }

    /**
     * <p>
     * The daily time range during which automated backups are created if
     * automated backups are enabled using the
     * <code>BackupRetentionPeriod</code> parameter.
     * </p>
     * <p>
     * Default: A 30-minute window selected at random from an 8-hour block of
     * time per region. To see the time blocks available, see <a href=
     * "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html"
     * > Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS
     * User Guide.</i>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the format <code>hh24:mi-hh24:mi</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Times should be in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not conflict with the preferred maintenance window.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The daily time range during which automated backups are created
     *         if automated backups are enabled using the
     *         <code>BackupRetentionPeriod</code> parameter. </p>
     *         <p>
     *         Default: A 30-minute window selected at random from an 8-hour
     *         block of time per region. To see the time blocks available, see
     *         <a href=
     *         "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html"
     *         > Adjusting the Preferred Maintenance Window</a> in the <i>Amazon
     *         RDS User Guide.</i>
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be in the format <code>hh24:mi-hh24:mi</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Times should be in Universal Coordinated Time (UTC).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must not conflict with the preferred maintenance window.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be at least 30 minutes.
     *         </p>
     *         </li>
     */

    public String getPreferredBackupWindow() {
        return this.preferredBackupWindow;
    }

    /**
     * <p>
     * The daily time range during which automated backups are created if
     * automated backups are enabled using the
     * <code>BackupRetentionPeriod</code> parameter.
     * </p>
     * <p>
     * Default: A 30-minute window selected at random from an 8-hour block of
     * time per region. To see the time blocks available, see <a href=
     * "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html"
     * > Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS
     * User Guide.</i>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the format <code>hh24:mi-hh24:mi</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Times should be in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not conflict with the preferred maintenance window.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes.
     * </p>
     * </li>
     * </ul>
     * 
     * @param preferredBackupWindow
     *        The daily time range during which automated backups are created if
     *        automated backups are enabled using the
     *        <code>BackupRetentionPeriod</code> parameter. </p>
     *        <p>
     *        Default: A 30-minute window selected at random from an 8-hour
     *        block of time per region. To see the time blocks available, see <a
     *        href=
     *        "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html"
     *        > Adjusting the Preferred Maintenance Window</a> in the <i>Amazon
     *        RDS User Guide.</i>
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be in the format <code>hh24:mi-hh24:mi</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Times should be in Universal Coordinated Time (UTC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must not conflict with the preferred maintenance window.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be at least 30 minutes.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateDBClusterRequest withPreferredBackupWindow(
            String preferredBackupWindow) {
        setPreferredBackupWindow(preferredBackupWindow);
        return this;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in
     * Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * Default: A 30-minute window selected at random from an 8-hour block of
     * time per region, occurring on a random day of the week. To see the time
     * blocks available, see <a href=
     * "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html"
     * > Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS
     * User Guide.</i>
     * </p>
     * <p>
     * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     * </p>
     * <p>
     * Constraints: Minimum 30-minute window.
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The weekly time range during which system maintenance can occur,
     *        in Universal Coordinated Time (UTC).</p>
     *        <p>
     *        Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     *        </p>
     *        <p>
     *        Default: A 30-minute window selected at random from an 8-hour
     *        block of time per region, occurring on a random day of the week.
     *        To see the time blocks available, see <a href=
     *        "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html"
     *        > Adjusting the Preferred Maintenance Window</a> in the <i>Amazon
     *        RDS User Guide.</i>
     *        </p>
     *        <p>
     *        Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     *        </p>
     *        <p>
     *        Constraints: Minimum 30-minute window.
     */

    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in
     * Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * Default: A 30-minute window selected at random from an 8-hour block of
     * time per region, occurring on a random day of the week. To see the time
     * blocks available, see <a href=
     * "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html"
     * > Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS
     * User Guide.</i>
     * </p>
     * <p>
     * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     * </p>
     * <p>
     * Constraints: Minimum 30-minute window.
     * </p>
     * 
     * @return The weekly time range during which system maintenance can occur,
     *         in Universal Coordinated Time (UTC).</p>
     *         <p>
     *         Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     *         </p>
     *         <p>
     *         Default: A 30-minute window selected at random from an 8-hour
     *         block of time per region, occurring on a random day of the week.
     *         To see the time blocks available, see <a href=
     *         "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html"
     *         > Adjusting the Preferred Maintenance Window</a> in the <i>Amazon
     *         RDS User Guide.</i>
     *         </p>
     *         <p>
     *         Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     *         </p>
     *         <p>
     *         Constraints: Minimum 30-minute window.
     */

    public String getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in
     * Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * Default: A 30-minute window selected at random from an 8-hour block of
     * time per region, occurring on a random day of the week. To see the time
     * blocks available, see <a href=
     * "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html"
     * > Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS
     * User Guide.</i>
     * </p>
     * <p>
     * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     * </p>
     * <p>
     * Constraints: Minimum 30-minute window.
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The weekly time range during which system maintenance can occur,
     *        in Universal Coordinated Time (UTC).</p>
     *        <p>
     *        Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     *        </p>
     *        <p>
     *        Default: A 30-minute window selected at random from an 8-hour
     *        block of time per region, occurring on a random day of the week.
     *        To see the time blocks available, see <a href=
     *        "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html"
     *        > Adjusting the Preferred Maintenance Window</a> in the <i>Amazon
     *        RDS User Guide.</i>
     *        </p>
     *        <p>
     *        Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     *        </p>
     *        <p>
     *        Constraints: Minimum 30-minute window.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateDBClusterRequest withPreferredMaintenanceWindow(
            String preferredMaintenanceWindow) {
        setPreferredMaintenanceWindow(preferredMaintenanceWindow);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source DB cluster if this DB
     * cluster is created as a Read Replica.
     * </p>
     * 
     * @param replicationSourceIdentifier
     *        The Amazon Resource Name (ARN) of the source DB cluster if this DB
     *        cluster is created as a Read Replica.
     */

    public void setReplicationSourceIdentifier(
            String replicationSourceIdentifier) {
        this.replicationSourceIdentifier = replicationSourceIdentifier;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source DB cluster if this DB
     * cluster is created as a Read Replica.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the source DB cluster if this
     *         DB cluster is created as a Read Replica.
     */

    public String getReplicationSourceIdentifier() {
        return this.replicationSourceIdentifier;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source DB cluster if this DB
     * cluster is created as a Read Replica.
     * </p>
     * 
     * @param replicationSourceIdentifier
     *        The Amazon Resource Name (ARN) of the source DB cluster if this DB
     *        cluster is created as a Read Replica.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateDBClusterRequest withReplicationSourceIdentifier(
            String replicationSourceIdentifier) {
        setReplicationSourceIdentifier(replicationSourceIdentifier);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * @param tags
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTags(java.util.Collection)} or
     * {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateDBClusterRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * @param tags
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateDBClusterRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Specifies whether the DB cluster is encrypted.
     * </p>
     * 
     * @param storageEncrypted
     *        Specifies whether the DB cluster is encrypted.
     */

    public void setStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
    }

    /**
     * <p>
     * Specifies whether the DB cluster is encrypted.
     * </p>
     * 
     * @return Specifies whether the DB cluster is encrypted.
     */

    public Boolean getStorageEncrypted() {
        return this.storageEncrypted;
    }

    /**
     * <p>
     * Specifies whether the DB cluster is encrypted.
     * </p>
     * 
     * @param storageEncrypted
     *        Specifies whether the DB cluster is encrypted.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateDBClusterRequest withStorageEncrypted(Boolean storageEncrypted) {
        setStorageEncrypted(storageEncrypted);
        return this;
    }

    /**
     * <p>
     * Specifies whether the DB cluster is encrypted.
     * </p>
     * 
     * @return Specifies whether the DB cluster is encrypted.
     */

    public Boolean isStorageEncrypted() {
        return this.storageEncrypted;
    }

    /**
     * <p>
     * The KMS key identifier for an encrypted DB cluster.
     * </p>
     * <p>
     * The KMS key identifier is the Amazon Resource Name (ARN) for the KMS
     * encryption key. If you are creating a DB cluster with the same AWS
     * account that owns the KMS encryption key used to encrypt the new DB
     * cluster, then you can use the KMS key alias instead of the ARN for the KM
     * encryption key.
     * </p>
     * <p>
     * If the <code>StorageEncrypted</code> parameter is true, and you do not
     * specify a value for the <code>KmsKeyId</code> parameter, then Amazon RDS
     * will use your default encryption key. AWS KMS creates the default
     * encryption key for your AWS account. Your AWS account has a different
     * default encryption key for each AWS region.
     * </p>
     * 
     * @param kmsKeyId
     *        The KMS key identifier for an encrypted DB cluster.</p>
     *        <p>
     *        The KMS key identifier is the Amazon Resource Name (ARN) for the
     *        KMS encryption key. If you are creating a DB cluster with the same
     *        AWS account that owns the KMS encryption key used to encrypt the
     *        new DB cluster, then you can use the KMS key alias instead of the
     *        ARN for the KM encryption key.
     *        </p>
     *        <p>
     *        If the <code>StorageEncrypted</code> parameter is true, and you do
     *        not specify a value for the <code>KmsKeyId</code> parameter, then
     *        Amazon RDS will use your default encryption key. AWS KMS creates
     *        the default encryption key for your AWS account. Your AWS account
     *        has a different default encryption key for each AWS region.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The KMS key identifier for an encrypted DB cluster.
     * </p>
     * <p>
     * The KMS key identifier is the Amazon Resource Name (ARN) for the KMS
     * encryption key. If you are creating a DB cluster with the same AWS
     * account that owns the KMS encryption key used to encrypt the new DB
     * cluster, then you can use the KMS key alias instead of the ARN for the KM
     * encryption key.
     * </p>
     * <p>
     * If the <code>StorageEncrypted</code> parameter is true, and you do not
     * specify a value for the <code>KmsKeyId</code> parameter, then Amazon RDS
     * will use your default encryption key. AWS KMS creates the default
     * encryption key for your AWS account. Your AWS account has a different
     * default encryption key for each AWS region.
     * </p>
     * 
     * @return The KMS key identifier for an encrypted DB cluster.</p>
     *         <p>
     *         The KMS key identifier is the Amazon Resource Name (ARN) for the
     *         KMS encryption key. If you are creating a DB cluster with the
     *         same AWS account that owns the KMS encryption key used to encrypt
     *         the new DB cluster, then you can use the KMS key alias instead of
     *         the ARN for the KM encryption key.
     *         </p>
     *         <p>
     *         If the <code>StorageEncrypted</code> parameter is true, and you
     *         do not specify a value for the <code>KmsKeyId</code> parameter,
     *         then Amazon RDS will use your default encryption key. AWS KMS
     *         creates the default encryption key for your AWS account. Your AWS
     *         account has a different default encryption key for each AWS
     *         region.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The KMS key identifier for an encrypted DB cluster.
     * </p>
     * <p>
     * The KMS key identifier is the Amazon Resource Name (ARN) for the KMS
     * encryption key. If you are creating a DB cluster with the same AWS
     * account that owns the KMS encryption key used to encrypt the new DB
     * cluster, then you can use the KMS key alias instead of the ARN for the KM
     * encryption key.
     * </p>
     * <p>
     * If the <code>StorageEncrypted</code> parameter is true, and you do not
     * specify a value for the <code>KmsKeyId</code> parameter, then Amazon RDS
     * will use your default encryption key. AWS KMS creates the default
     * encryption key for your AWS account. Your AWS account has a different
     * default encryption key for each AWS region.
     * </p>
     * 
     * @param kmsKeyId
     *        The KMS key identifier for an encrypted DB cluster.</p>
     *        <p>
     *        The KMS key identifier is the Amazon Resource Name (ARN) for the
     *        KMS encryption key. If you are creating a DB cluster with the same
     *        AWS account that owns the KMS encryption key used to encrypt the
     *        new DB cluster, then you can use the KMS key alias instead of the
     *        ARN for the KM encryption key.
     *        </p>
     *        <p>
     *        If the <code>StorageEncrypted</code> parameter is true, and you do
     *        not specify a value for the <code>KmsKeyId</code> parameter, then
     *        Amazon RDS will use your default encryption key. AWS KMS creates
     *        the default encryption key for your AWS account. Your AWS account
     *        has a different default encryption key for each AWS region.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateDBClusterRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
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
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: " + getAvailabilityZones() + ",");
        if (getBackupRetentionPeriod() != null)
            sb.append("BackupRetentionPeriod: " + getBackupRetentionPeriod()
                    + ",");
        if (getCharacterSetName() != null)
            sb.append("CharacterSetName: " + getCharacterSetName() + ",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: " + getDatabaseName() + ",");
        if (getDBClusterIdentifier() != null)
            sb.append("DBClusterIdentifier: " + getDBClusterIdentifier() + ",");
        if (getDBClusterParameterGroupName() != null)
            sb.append("DBClusterParameterGroupName: "
                    + getDBClusterParameterGroupName() + ",");
        if (getVpcSecurityGroupIds() != null)
            sb.append("VpcSecurityGroupIds: " + getVpcSecurityGroupIds() + ",");
        if (getDBSubnetGroupName() != null)
            sb.append("DBSubnetGroupName: " + getDBSubnetGroupName() + ",");
        if (getEngine() != null)
            sb.append("Engine: " + getEngine() + ",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getPort() != null)
            sb.append("Port: " + getPort() + ",");
        if (getMasterUsername() != null)
            sb.append("MasterUsername: " + getMasterUsername() + ",");
        if (getMasterUserPassword() != null)
            sb.append("MasterUserPassword: " + getMasterUserPassword() + ",");
        if (getOptionGroupName() != null)
            sb.append("OptionGroupName: " + getOptionGroupName() + ",");
        if (getPreferredBackupWindow() != null)
            sb.append("PreferredBackupWindow: " + getPreferredBackupWindow()
                    + ",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: "
                    + getPreferredMaintenanceWindow() + ",");
        if (getReplicationSourceIdentifier() != null)
            sb.append("ReplicationSourceIdentifier: "
                    + getReplicationSourceIdentifier() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getStorageEncrypted() != null)
            sb.append("StorageEncrypted: " + getStorageEncrypted() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDBClusterRequest == false)
            return false;
        CreateDBClusterRequest other = (CreateDBClusterRequest) obj;
        if (other.getAvailabilityZones() == null
                ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null
                && other.getAvailabilityZones().equals(
                        this.getAvailabilityZones()) == false)
            return false;
        if (other.getBackupRetentionPeriod() == null
                ^ this.getBackupRetentionPeriod() == null)
            return false;
        if (other.getBackupRetentionPeriod() != null
                && other.getBackupRetentionPeriod().equals(
                        this.getBackupRetentionPeriod()) == false)
            return false;
        if (other.getCharacterSetName() == null
                ^ this.getCharacterSetName() == null)
            return false;
        if (other.getCharacterSetName() != null
                && other.getCharacterSetName().equals(
                        this.getCharacterSetName()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null
                && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getDBClusterIdentifier() == null
                ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null
                && other.getDBClusterIdentifier().equals(
                        this.getDBClusterIdentifier()) == false)
            return false;
        if (other.getDBClusterParameterGroupName() == null
                ^ this.getDBClusterParameterGroupName() == null)
            return false;
        if (other.getDBClusterParameterGroupName() != null
                && other.getDBClusterParameterGroupName().equals(
                        this.getDBClusterParameterGroupName()) == false)
            return false;
        if (other.getVpcSecurityGroupIds() == null
                ^ this.getVpcSecurityGroupIds() == null)
            return false;
        if (other.getVpcSecurityGroupIds() != null
                && other.getVpcSecurityGroupIds().equals(
                        this.getVpcSecurityGroupIds()) == false)
            return false;
        if (other.getDBSubnetGroupName() == null
                ^ this.getDBSubnetGroupName() == null)
            return false;
        if (other.getDBSubnetGroupName() != null
                && other.getDBSubnetGroupName().equals(
                        this.getDBSubnetGroupName()) == false)
            return false;
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
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null
                && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getMasterUsername() == null
                ^ this.getMasterUsername() == null)
            return false;
        if (other.getMasterUsername() != null
                && other.getMasterUsername().equals(this.getMasterUsername()) == false)
            return false;
        if (other.getMasterUserPassword() == null
                ^ this.getMasterUserPassword() == null)
            return false;
        if (other.getMasterUserPassword() != null
                && other.getMasterUserPassword().equals(
                        this.getMasterUserPassword()) == false)
            return false;
        if (other.getOptionGroupName() == null
                ^ this.getOptionGroupName() == null)
            return false;
        if (other.getOptionGroupName() != null
                && other.getOptionGroupName().equals(this.getOptionGroupName()) == false)
            return false;
        if (other.getPreferredBackupWindow() == null
                ^ this.getPreferredBackupWindow() == null)
            return false;
        if (other.getPreferredBackupWindow() != null
                && other.getPreferredBackupWindow().equals(
                        this.getPreferredBackupWindow()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null
                ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null
                && other.getPreferredMaintenanceWindow().equals(
                        this.getPreferredMaintenanceWindow()) == false)
            return false;
        if (other.getReplicationSourceIdentifier() == null
                ^ this.getReplicationSourceIdentifier() == null)
            return false;
        if (other.getReplicationSourceIdentifier() != null
                && other.getReplicationSourceIdentifier().equals(
                        this.getReplicationSourceIdentifier()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null
                && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getStorageEncrypted() == null
                ^ this.getStorageEncrypted() == null)
            return false;
        if (other.getStorageEncrypted() != null
                && other.getStorageEncrypted().equals(
                        this.getStorageEncrypted()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null
                && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAvailabilityZones() == null) ? 0
                        : getAvailabilityZones().hashCode());
        hashCode = prime
                * hashCode
                + ((getBackupRetentionPeriod() == null) ? 0
                        : getBackupRetentionPeriod().hashCode());
        hashCode = prime
                * hashCode
                + ((getCharacterSetName() == null) ? 0 : getCharacterSetName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDatabaseName() == null) ? 0 : getDatabaseName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDBClusterIdentifier() == null) ? 0
                        : getDBClusterIdentifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getDBClusterParameterGroupName() == null) ? 0
                        : getDBClusterParameterGroupName().hashCode());
        hashCode = prime
                * hashCode
                + ((getVpcSecurityGroupIds() == null) ? 0
                        : getVpcSecurityGroupIds().hashCode());
        hashCode = prime
                * hashCode
                + ((getDBSubnetGroupName() == null) ? 0
                        : getDBSubnetGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime
                * hashCode
                + ((getEngineVersion() == null) ? 0 : getEngineVersion()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime
                * hashCode
                + ((getMasterUsername() == null) ? 0 : getMasterUsername()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getMasterUserPassword() == null) ? 0
                        : getMasterUserPassword().hashCode());
        hashCode = prime
                * hashCode
                + ((getOptionGroupName() == null) ? 0 : getOptionGroupName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getPreferredBackupWindow() == null) ? 0
                        : getPreferredBackupWindow().hashCode());
        hashCode = prime
                * hashCode
                + ((getPreferredMaintenanceWindow() == null) ? 0
                        : getPreferredMaintenanceWindow().hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicationSourceIdentifier() == null) ? 0
                        : getReplicationSourceIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime
                * hashCode
                + ((getStorageEncrypted() == null) ? 0 : getStorageEncrypted()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public CreateDBClusterRequest clone() {
        return (CreateDBClusterRequest) super.clone();
    }
}

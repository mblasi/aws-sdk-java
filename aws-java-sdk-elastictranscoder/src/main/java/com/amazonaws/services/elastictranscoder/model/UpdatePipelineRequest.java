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
package com.amazonaws.services.elastictranscoder.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The <code>UpdatePipelineRequest</code> structure.
 * </p>
 */
public class UpdatePipelineRequest extends
        com.amazonaws.AmazonWebServiceRequest implements Serializable,
        Cloneable {

    /**
     * <p>
     * The ID of the pipeline that you want to update.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the pipeline. We recommend that the name be unique within the
     * AWS account, but uniqueness is not enforced.
     * </p>
     * <p>
     * Constraints: Maximum 40 characters
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon S3 bucket in which you saved the media files that you want to
     * transcode and the graphics that you want to use as watermarks.
     * </p>
     */
    private String inputBucket;
    /**
     * <p>
     * The IAM Amazon Resource Name (ARN) for the role that you want Elastic
     * Transcoder to use to transcode jobs for this pipeline.
     * </p>
     */
    private String role;
    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that you want to use with
     * this pipeline.
     * </p>
     * <p>
     * If you use either <code>S3</code> or <code>S3-AWS-KMS</code> as your
     * <code>Encryption:Mode</code>, you don't need to provide a key with your
     * job because a default key, known as an AWS-KMS key, is created for you
     * automatically. You need to provide an AWS-KMS key only if you want to use
     * a non-default AWS-KMS key, or if you are using an
     * <code>Encryption:Mode</code> of <code>AES-PKCS7</code>,
     * <code>AES-CTR</code>, or <code>AES-GCM</code>.
     * </p>
     */
    private String awsKmsKeyArn;

    private Notifications notifications;
    /**
     * <p>
     * The optional <code>ContentConfig</code> object specifies information
     * about the Amazon S3 bucket in which you want Elastic Transcoder to save
     * transcoded files and playlists: which bucket to use, which users you want
     * to have access to the files, the type of access you want users to have,
     * and the storage class that you want to assign to the files.
     * </p>
     * <p>
     * If you specify values for <code>ContentConfig</code>, you must also
     * specify values for <code>ThumbnailConfig</code>.
     * </p>
     * <p>
     * If you specify values for <code>ContentConfig</code> and
     * <code>ThumbnailConfig</code>, omit the <code>OutputBucket</code> object.
     * </p>
     * <ul>
     * <li><b>Bucket</b>: The Amazon S3 bucket in which you want Elastic
     * Transcoder to save transcoded files and playlists.</li>
     * <li><b>Permissions</b> (Optional): The Permissions object specifies which
     * users you want to have access to transcoded files and the type of access
     * you want them to have. You can grant permissions to a maximum of 30 users
     * and/or predefined Amazon S3 groups.</li>
     * <li><b>Grantee Type</b>: Specify the type of value that appears in the
     * <code>Grantee</code> object:
     * <ul>
     * <li><b>Canonical</b>: The value in the <code>Grantee</code> object is
     * either the canonical user ID for an AWS account or an origin access
     * identity for an Amazon CloudFront distribution. For more information
     * about canonical user IDs, see Access Control List (ACL) Overview in the
     * Amazon Simple Storage Service Developer Guide. For more information about
     * using CloudFront origin access identities to require that users use
     * CloudFront URLs instead of Amazon S3 URLs, see Using an Origin Access
     * Identity to Restrict Access to Your Amazon S3 Content. <important>A
     * canonical user ID is not the same as an AWS account number.</important></li>
     * <li><b>Email</b>: The value in the <code>Grantee</code> object is the
     * registered email address of an AWS account.</li>
     * <li><b>Group</b>: The value in the <code>Grantee</code> object is one of
     * the following predefined Amazon S3 groups: <code>AllUsers</code>,
     * <code>AuthenticatedUsers</code>, or <code>LogDelivery</code>.</li>
     * </ul>
     * </li>
     * <li><b>Grantee</b>: The AWS user or group that you want to have access to
     * transcoded files and playlists. To identify the user or group, you can
     * specify the canonical user ID for an AWS account, an origin access
     * identity for a CloudFront distribution, the registered email address of
     * an AWS account, or a predefined Amazon S3 group</li>
     * <li><b>Access</b>: The permission that you want to give to the AWS user
     * that you specified in <code>Grantee</code>. Permissions are granted on
     * the files that Elastic Transcoder adds to the bucket, including playlists
     * and video files. Valid values include:
     * <ul>
     * <li><code>READ</code>: The grantee can read the objects and metadata for
     * objects that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>READ_ACP</code>: The grantee can read the object ACL for
     * objects that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>WRITE_ACP</code>: The grantee can write the ACL for the objects
     * that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>FULL_CONTROL</code>: The grantee has <code>READ</code>,
     * <code>READ_ACP</code>, and <code>WRITE_ACP</code> permissions for the
     * objects that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * </ul>
     * </li>
     * <li><b>StorageClass</b>: The Amazon S3 storage class,
     * <code>Standard</code> or <code>ReducedRedundancy</code>, that you want
     * Elastic Transcoder to assign to the video files and playlists that it
     * stores in your Amazon S3 bucket.</li>
     * </ul>
     */
    private PipelineOutputConfig contentConfig;
    /**
     * <p>
     * The <code>ThumbnailConfig</code> object specifies several values,
     * including the Amazon S3 bucket in which you want Elastic Transcoder to
     * save thumbnail files, which users you want to have access to the files,
     * the type of access you want users to have, and the storage class that you
     * want to assign to the files.
     * </p>
     * <p>
     * If you specify values for <code>ContentConfig</code>, you must also
     * specify values for <code>ThumbnailConfig</code> even if you don't want to
     * create thumbnails.
     * </p>
     * <p>
     * If you specify values for <code>ContentConfig</code> and
     * <code>ThumbnailConfig</code>, omit the <code>OutputBucket</code> object.
     * </p>
     * <ul>
     * <li><b>Bucket</b>: The Amazon S3 bucket in which you want Elastic
     * Transcoder to save thumbnail files.</li>
     * <li><b>Permissions</b> (Optional): The <code>Permissions</code> object
     * specifies which users and/or predefined Amazon S3 groups you want to have
     * access to thumbnail files, and the type of access you want them to have.
     * You can grant permissions to a maximum of 30 users and/or predefined
     * Amazon S3 groups.</li>
     * <li><b>GranteeType</b>: Specify the type of value that appears in the
     * Grantee object:
     * <ul>
     * <li><b>Canonical</b>: The value in the <code>Grantee</code> object is
     * either the canonical user ID for an AWS account or an origin access
     * identity for an Amazon CloudFront distribution. <important>A canonical
     * user ID is not the same as an AWS account number.</important></li>
     * <li><b>Email</b>: The value in the <code>Grantee</code> object is the
     * registered email address of an AWS account.</li>
     * <li><b>Group</b>: The value in the <code>Grantee</code> object is one of
     * the following predefined Amazon S3 groups: <code>AllUsers</code>,
     * <code>AuthenticatedUsers</code>, or <code>LogDelivery</code>.</li>
     * </ul>
     * </li>
     * <li><b>Grantee</b>: The AWS user or group that you want to have access to
     * thumbnail files. To identify the user or group, you can specify the
     * canonical user ID for an AWS account, an origin access identity for a
     * CloudFront distribution, the registered email address of an AWS account,
     * or a predefined Amazon S3 group.</li>
     * <li><b>Access</b>: The permission that you want to give to the AWS user
     * that you specified in <code>Grantee</code>. Permissions are granted on
     * the thumbnail files that Elastic Transcoder adds to the bucket. Valid
     * values include:
     * <ul>
     * <li><code>READ</code>: The grantee can read the thumbnails and metadata
     * for objects that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>READ_ACP</code>: The grantee can read the object ACL for
     * thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>WRITE_ACP</code>: The grantee can write the ACL for the
     * thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>FULL_CONTROL</code>: The grantee has <code>READ</code>,
     * <code>READ_ACP</code>, and <code>WRITE_ACP</code> permissions for the
     * thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * </ul>
     * </li>
     * <li><b>StorageClass</b>: The Amazon S3 storage class,
     * <code>Standard</code> or <code>ReducedRedundancy</code>, that you want
     * Elastic Transcoder to assign to the thumbnails that it stores in your
     * Amazon S3 bucket.</li>
     * </ul>
     */
    private PipelineOutputConfig thumbnailConfig;

    /**
     * <p>
     * The ID of the pipeline that you want to update.
     * </p>
     * 
     * @param id
     *        The ID of the pipeline that you want to update.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the pipeline that you want to update.
     * </p>
     * 
     * @return The ID of the pipeline that you want to update.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the pipeline that you want to update.
     * </p>
     * 
     * @param id
     *        The ID of the pipeline that you want to update.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdatePipelineRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the pipeline. We recommend that the name be unique within the
     * AWS account, but uniqueness is not enforced.
     * </p>
     * <p>
     * Constraints: Maximum 40 characters
     * </p>
     * 
     * @param name
     *        The name of the pipeline. We recommend that the name be unique
     *        within the AWS account, but uniqueness is not enforced.</p>
     *        <p>
     *        Constraints: Maximum 40 characters
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the pipeline. We recommend that the name be unique within the
     * AWS account, but uniqueness is not enforced.
     * </p>
     * <p>
     * Constraints: Maximum 40 characters
     * </p>
     * 
     * @return The name of the pipeline. We recommend that the name be unique
     *         within the AWS account, but uniqueness is not enforced.</p>
     *         <p>
     *         Constraints: Maximum 40 characters
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the pipeline. We recommend that the name be unique within the
     * AWS account, but uniqueness is not enforced.
     * </p>
     * <p>
     * Constraints: Maximum 40 characters
     * </p>
     * 
     * @param name
     *        The name of the pipeline. We recommend that the name be unique
     *        within the AWS account, but uniqueness is not enforced.</p>
     *        <p>
     *        Constraints: Maximum 40 characters
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdatePipelineRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 bucket in which you saved the media files that you want to
     * transcode and the graphics that you want to use as watermarks.
     * </p>
     * 
     * @param inputBucket
     *        The Amazon S3 bucket in which you saved the media files that you
     *        want to transcode and the graphics that you want to use as
     *        watermarks.
     */

    public void setInputBucket(String inputBucket) {
        this.inputBucket = inputBucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket in which you saved the media files that you want to
     * transcode and the graphics that you want to use as watermarks.
     * </p>
     * 
     * @return The Amazon S3 bucket in which you saved the media files that you
     *         want to transcode and the graphics that you want to use as
     *         watermarks.
     */

    public String getInputBucket() {
        return this.inputBucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket in which you saved the media files that you want to
     * transcode and the graphics that you want to use as watermarks.
     * </p>
     * 
     * @param inputBucket
     *        The Amazon S3 bucket in which you saved the media files that you
     *        want to transcode and the graphics that you want to use as
     *        watermarks.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdatePipelineRequest withInputBucket(String inputBucket) {
        setInputBucket(inputBucket);
        return this;
    }

    /**
     * <p>
     * The IAM Amazon Resource Name (ARN) for the role that you want Elastic
     * Transcoder to use to transcode jobs for this pipeline.
     * </p>
     * 
     * @param role
     *        The IAM Amazon Resource Name (ARN) for the role that you want
     *        Elastic Transcoder to use to transcode jobs for this pipeline.
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The IAM Amazon Resource Name (ARN) for the role that you want Elastic
     * Transcoder to use to transcode jobs for this pipeline.
     * </p>
     * 
     * @return The IAM Amazon Resource Name (ARN) for the role that you want
     *         Elastic Transcoder to use to transcode jobs for this pipeline.
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * The IAM Amazon Resource Name (ARN) for the role that you want Elastic
     * Transcoder to use to transcode jobs for this pipeline.
     * </p>
     * 
     * @param role
     *        The IAM Amazon Resource Name (ARN) for the role that you want
     *        Elastic Transcoder to use to transcode jobs for this pipeline.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdatePipelineRequest withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that you want to use with
     * this pipeline.
     * </p>
     * <p>
     * If you use either <code>S3</code> or <code>S3-AWS-KMS</code> as your
     * <code>Encryption:Mode</code>, you don't need to provide a key with your
     * job because a default key, known as an AWS-KMS key, is created for you
     * automatically. You need to provide an AWS-KMS key only if you want to use
     * a non-default AWS-KMS key, or if you are using an
     * <code>Encryption:Mode</code> of <code>AES-PKCS7</code>,
     * <code>AES-CTR</code>, or <code>AES-GCM</code>.
     * </p>
     * 
     * @param awsKmsKeyArn
     *        The AWS Key Management Service (AWS KMS) key that you want to use
     *        with this pipeline.</p>
     *        <p>
     *        If you use either <code>S3</code> or <code>S3-AWS-KMS</code> as
     *        your <code>Encryption:Mode</code>, you don't need to provide a key
     *        with your job because a default key, known as an AWS-KMS key, is
     *        created for you automatically. You need to provide an AWS-KMS key
     *        only if you want to use a non-default AWS-KMS key, or if you are
     *        using an <code>Encryption:Mode</code> of <code>AES-PKCS7</code>,
     *        <code>AES-CTR</code>, or <code>AES-GCM</code>.
     */

    public void setAwsKmsKeyArn(String awsKmsKeyArn) {
        this.awsKmsKeyArn = awsKmsKeyArn;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that you want to use with
     * this pipeline.
     * </p>
     * <p>
     * If you use either <code>S3</code> or <code>S3-AWS-KMS</code> as your
     * <code>Encryption:Mode</code>, you don't need to provide a key with your
     * job because a default key, known as an AWS-KMS key, is created for you
     * automatically. You need to provide an AWS-KMS key only if you want to use
     * a non-default AWS-KMS key, or if you are using an
     * <code>Encryption:Mode</code> of <code>AES-PKCS7</code>,
     * <code>AES-CTR</code>, or <code>AES-GCM</code>.
     * </p>
     * 
     * @return The AWS Key Management Service (AWS KMS) key that you want to use
     *         with this pipeline.</p>
     *         <p>
     *         If you use either <code>S3</code> or <code>S3-AWS-KMS</code> as
     *         your <code>Encryption:Mode</code>, you don't need to provide a
     *         key with your job because a default key, known as an AWS-KMS key,
     *         is created for you automatically. You need to provide an AWS-KMS
     *         key only if you want to use a non-default AWS-KMS key, or if you
     *         are using an <code>Encryption:Mode</code> of
     *         <code>AES-PKCS7</code>, <code>AES-CTR</code>, or
     *         <code>AES-GCM</code>.
     */

    public String getAwsKmsKeyArn() {
        return this.awsKmsKeyArn;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that you want to use with
     * this pipeline.
     * </p>
     * <p>
     * If you use either <code>S3</code> or <code>S3-AWS-KMS</code> as your
     * <code>Encryption:Mode</code>, you don't need to provide a key with your
     * job because a default key, known as an AWS-KMS key, is created for you
     * automatically. You need to provide an AWS-KMS key only if you want to use
     * a non-default AWS-KMS key, or if you are using an
     * <code>Encryption:Mode</code> of <code>AES-PKCS7</code>,
     * <code>AES-CTR</code>, or <code>AES-GCM</code>.
     * </p>
     * 
     * @param awsKmsKeyArn
     *        The AWS Key Management Service (AWS KMS) key that you want to use
     *        with this pipeline.</p>
     *        <p>
     *        If you use either <code>S3</code> or <code>S3-AWS-KMS</code> as
     *        your <code>Encryption:Mode</code>, you don't need to provide a key
     *        with your job because a default key, known as an AWS-KMS key, is
     *        created for you automatically. You need to provide an AWS-KMS key
     *        only if you want to use a non-default AWS-KMS key, or if you are
     *        using an <code>Encryption:Mode</code> of <code>AES-PKCS7</code>,
     *        <code>AES-CTR</code>, or <code>AES-GCM</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdatePipelineRequest withAwsKmsKeyArn(String awsKmsKeyArn) {
        setAwsKmsKeyArn(awsKmsKeyArn);
        return this;
    }

    /**
     * @param notifications
     */

    public void setNotifications(Notifications notifications) {
        this.notifications = notifications;
    }

    /**
     * @return
     */

    public Notifications getNotifications() {
        return this.notifications;
    }

    /**
     * @param notifications
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdatePipelineRequest withNotifications(Notifications notifications) {
        setNotifications(notifications);
        return this;
    }

    /**
     * <p>
     * The optional <code>ContentConfig</code> object specifies information
     * about the Amazon S3 bucket in which you want Elastic Transcoder to save
     * transcoded files and playlists: which bucket to use, which users you want
     * to have access to the files, the type of access you want users to have,
     * and the storage class that you want to assign to the files.
     * </p>
     * <p>
     * If you specify values for <code>ContentConfig</code>, you must also
     * specify values for <code>ThumbnailConfig</code>.
     * </p>
     * <p>
     * If you specify values for <code>ContentConfig</code> and
     * <code>ThumbnailConfig</code>, omit the <code>OutputBucket</code> object.
     * </p>
     * <ul>
     * <li><b>Bucket</b>: The Amazon S3 bucket in which you want Elastic
     * Transcoder to save transcoded files and playlists.</li>
     * <li><b>Permissions</b> (Optional): The Permissions object specifies which
     * users you want to have access to transcoded files and the type of access
     * you want them to have. You can grant permissions to a maximum of 30 users
     * and/or predefined Amazon S3 groups.</li>
     * <li><b>Grantee Type</b>: Specify the type of value that appears in the
     * <code>Grantee</code> object:
     * <ul>
     * <li><b>Canonical</b>: The value in the <code>Grantee</code> object is
     * either the canonical user ID for an AWS account or an origin access
     * identity for an Amazon CloudFront distribution. For more information
     * about canonical user IDs, see Access Control List (ACL) Overview in the
     * Amazon Simple Storage Service Developer Guide. For more information about
     * using CloudFront origin access identities to require that users use
     * CloudFront URLs instead of Amazon S3 URLs, see Using an Origin Access
     * Identity to Restrict Access to Your Amazon S3 Content. <important>A
     * canonical user ID is not the same as an AWS account number.</important></li>
     * <li><b>Email</b>: The value in the <code>Grantee</code> object is the
     * registered email address of an AWS account.</li>
     * <li><b>Group</b>: The value in the <code>Grantee</code> object is one of
     * the following predefined Amazon S3 groups: <code>AllUsers</code>,
     * <code>AuthenticatedUsers</code>, or <code>LogDelivery</code>.</li>
     * </ul>
     * </li>
     * <li><b>Grantee</b>: The AWS user or group that you want to have access to
     * transcoded files and playlists. To identify the user or group, you can
     * specify the canonical user ID for an AWS account, an origin access
     * identity for a CloudFront distribution, the registered email address of
     * an AWS account, or a predefined Amazon S3 group</li>
     * <li><b>Access</b>: The permission that you want to give to the AWS user
     * that you specified in <code>Grantee</code>. Permissions are granted on
     * the files that Elastic Transcoder adds to the bucket, including playlists
     * and video files. Valid values include:
     * <ul>
     * <li><code>READ</code>: The grantee can read the objects and metadata for
     * objects that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>READ_ACP</code>: The grantee can read the object ACL for
     * objects that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>WRITE_ACP</code>: The grantee can write the ACL for the objects
     * that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>FULL_CONTROL</code>: The grantee has <code>READ</code>,
     * <code>READ_ACP</code>, and <code>WRITE_ACP</code> permissions for the
     * objects that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * </ul>
     * </li>
     * <li><b>StorageClass</b>: The Amazon S3 storage class,
     * <code>Standard</code> or <code>ReducedRedundancy</code>, that you want
     * Elastic Transcoder to assign to the video files and playlists that it
     * stores in your Amazon S3 bucket.</li>
     * </ul>
     * 
     * @param contentConfig
     *        The optional <code>ContentConfig</code> object specifies
     *        information about the Amazon S3 bucket in which you want Elastic
     *        Transcoder to save transcoded files and playlists: which bucket to
     *        use, which users you want to have access to the files, the type of
     *        access you want users to have, and the storage class that you want
     *        to assign to the files.</p>
     *        <p>
     *        If you specify values for <code>ContentConfig</code>, you must
     *        also specify values for <code>ThumbnailConfig</code>.
     *        </p>
     *        <p>
     *        If you specify values for <code>ContentConfig</code> and
     *        <code>ThumbnailConfig</code>, omit the <code>OutputBucket</code>
     *        object.
     *        </p>
     *        <ul>
     *        <li><b>Bucket</b>: The Amazon S3 bucket in which you want Elastic
     *        Transcoder to save transcoded files and playlists.</li>
     *        <li><b>Permissions</b> (Optional): The Permissions object
     *        specifies which users you want to have access to transcoded files
     *        and the type of access you want them to have. You can grant
     *        permissions to a maximum of 30 users and/or predefined Amazon S3
     *        groups.</li>
     *        <li><b>Grantee Type</b>: Specify the type of value that appears in
     *        the <code>Grantee</code> object:
     *        <ul>
     *        <li><b>Canonical</b>: The value in the <code>Grantee</code> object
     *        is either the canonical user ID for an AWS account or an origin
     *        access identity for an Amazon CloudFront distribution. For more
     *        information about canonical user IDs, see Access Control List
     *        (ACL) Overview in the Amazon Simple Storage Service Developer
     *        Guide. For more information about using CloudFront origin access
     *        identities to require that users use CloudFront URLs instead of
     *        Amazon S3 URLs, see Using an Origin Access Identity to Restrict
     *        Access to Your Amazon S3 Content. <important>A canonical user ID
     *        is not the same as an AWS account number.</important></li>
     *        <li><b>Email</b>: The value in the <code>Grantee</code> object is
     *        the registered email address of an AWS account.</li>
     *        <li><b>Group</b>: The value in the <code>Grantee</code> object is
     *        one of the following predefined Amazon S3 groups:
     *        <code>AllUsers</code>, <code>AuthenticatedUsers</code>, or
     *        <code>LogDelivery</code>.</li>
     *        </ul>
     *        </li>
     *        <li><b>Grantee</b>: The AWS user or group that you want to have
     *        access to transcoded files and playlists. To identify the user or
     *        group, you can specify the canonical user ID for an AWS account,
     *        an origin access identity for a CloudFront distribution, the
     *        registered email address of an AWS account, or a predefined Amazon
     *        S3 group</li>
     *        <li><b>Access</b>: The permission that you want to give to the AWS
     *        user that you specified in <code>Grantee</code>. Permissions are
     *        granted on the files that Elastic Transcoder adds to the bucket,
     *        including playlists and video files. Valid values include:
     *        <ul>
     *        <li><code>READ</code>: The grantee can read the objects and
     *        metadata for objects that Elastic Transcoder adds to the Amazon S3
     *        bucket.</li>
     *        <li><code>READ_ACP</code>: The grantee can read the object ACL for
     *        objects that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     *        <li><code>WRITE_ACP</code>: The grantee can write the ACL for the
     *        objects that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     *        <li><code>FULL_CONTROL</code>: The grantee has <code>READ</code>,
     *        <code>READ_ACP</code>, and <code>WRITE_ACP</code> permissions for
     *        the objects that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     *        </ul>
     *        </li>
     *        <li><b>StorageClass</b>: The Amazon S3 storage class,
     *        <code>Standard</code> or <code>ReducedRedundancy</code>, that you
     *        want Elastic Transcoder to assign to the video files and playlists
     *        that it stores in your Amazon S3 bucket.</li>
     */

    public void setContentConfig(PipelineOutputConfig contentConfig) {
        this.contentConfig = contentConfig;
    }

    /**
     * <p>
     * The optional <code>ContentConfig</code> object specifies information
     * about the Amazon S3 bucket in which you want Elastic Transcoder to save
     * transcoded files and playlists: which bucket to use, which users you want
     * to have access to the files, the type of access you want users to have,
     * and the storage class that you want to assign to the files.
     * </p>
     * <p>
     * If you specify values for <code>ContentConfig</code>, you must also
     * specify values for <code>ThumbnailConfig</code>.
     * </p>
     * <p>
     * If you specify values for <code>ContentConfig</code> and
     * <code>ThumbnailConfig</code>, omit the <code>OutputBucket</code> object.
     * </p>
     * <ul>
     * <li><b>Bucket</b>: The Amazon S3 bucket in which you want Elastic
     * Transcoder to save transcoded files and playlists.</li>
     * <li><b>Permissions</b> (Optional): The Permissions object specifies which
     * users you want to have access to transcoded files and the type of access
     * you want them to have. You can grant permissions to a maximum of 30 users
     * and/or predefined Amazon S3 groups.</li>
     * <li><b>Grantee Type</b>: Specify the type of value that appears in the
     * <code>Grantee</code> object:
     * <ul>
     * <li><b>Canonical</b>: The value in the <code>Grantee</code> object is
     * either the canonical user ID for an AWS account or an origin access
     * identity for an Amazon CloudFront distribution. For more information
     * about canonical user IDs, see Access Control List (ACL) Overview in the
     * Amazon Simple Storage Service Developer Guide. For more information about
     * using CloudFront origin access identities to require that users use
     * CloudFront URLs instead of Amazon S3 URLs, see Using an Origin Access
     * Identity to Restrict Access to Your Amazon S3 Content. <important>A
     * canonical user ID is not the same as an AWS account number.</important></li>
     * <li><b>Email</b>: The value in the <code>Grantee</code> object is the
     * registered email address of an AWS account.</li>
     * <li><b>Group</b>: The value in the <code>Grantee</code> object is one of
     * the following predefined Amazon S3 groups: <code>AllUsers</code>,
     * <code>AuthenticatedUsers</code>, or <code>LogDelivery</code>.</li>
     * </ul>
     * </li>
     * <li><b>Grantee</b>: The AWS user or group that you want to have access to
     * transcoded files and playlists. To identify the user or group, you can
     * specify the canonical user ID for an AWS account, an origin access
     * identity for a CloudFront distribution, the registered email address of
     * an AWS account, or a predefined Amazon S3 group</li>
     * <li><b>Access</b>: The permission that you want to give to the AWS user
     * that you specified in <code>Grantee</code>. Permissions are granted on
     * the files that Elastic Transcoder adds to the bucket, including playlists
     * and video files. Valid values include:
     * <ul>
     * <li><code>READ</code>: The grantee can read the objects and metadata for
     * objects that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>READ_ACP</code>: The grantee can read the object ACL for
     * objects that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>WRITE_ACP</code>: The grantee can write the ACL for the objects
     * that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>FULL_CONTROL</code>: The grantee has <code>READ</code>,
     * <code>READ_ACP</code>, and <code>WRITE_ACP</code> permissions for the
     * objects that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * </ul>
     * </li>
     * <li><b>StorageClass</b>: The Amazon S3 storage class,
     * <code>Standard</code> or <code>ReducedRedundancy</code>, that you want
     * Elastic Transcoder to assign to the video files and playlists that it
     * stores in your Amazon S3 bucket.</li>
     * </ul>
     * 
     * @return The optional <code>ContentConfig</code> object specifies
     *         information about the Amazon S3 bucket in which you want Elastic
     *         Transcoder to save transcoded files and playlists: which bucket
     *         to use, which users you want to have access to the files, the
     *         type of access you want users to have, and the storage class that
     *         you want to assign to the files.</p>
     *         <p>
     *         If you specify values for <code>ContentConfig</code>, you must
     *         also specify values for <code>ThumbnailConfig</code>.
     *         </p>
     *         <p>
     *         If you specify values for <code>ContentConfig</code> and
     *         <code>ThumbnailConfig</code>, omit the <code>OutputBucket</code>
     *         object.
     *         </p>
     *         <ul>
     *         <li><b>Bucket</b>: The Amazon S3 bucket in which you want Elastic
     *         Transcoder to save transcoded files and playlists.</li>
     *         <li><b>Permissions</b> (Optional): The Permissions object
     *         specifies which users you want to have access to transcoded files
     *         and the type of access you want them to have. You can grant
     *         permissions to a maximum of 30 users and/or predefined Amazon S3
     *         groups.</li>
     *         <li><b>Grantee Type</b>: Specify the type of value that appears
     *         in the <code>Grantee</code> object:
     *         <ul>
     *         <li><b>Canonical</b>: The value in the <code>Grantee</code>
     *         object is either the canonical user ID for an AWS account or an
     *         origin access identity for an Amazon CloudFront distribution. For
     *         more information about canonical user IDs, see Access Control
     *         List (ACL) Overview in the Amazon Simple Storage Service
     *         Developer Guide. For more information about using CloudFront
     *         origin access identities to require that users use CloudFront
     *         URLs instead of Amazon S3 URLs, see Using an Origin Access
     *         Identity to Restrict Access to Your Amazon S3 Content.
     *         <important>A canonical user ID is not the same as an AWS account
     *         number.</important></li>
     *         <li><b>Email</b>: The value in the <code>Grantee</code> object is
     *         the registered email address of an AWS account.</li>
     *         <li><b>Group</b>: The value in the <code>Grantee</code> object is
     *         one of the following predefined Amazon S3 groups:
     *         <code>AllUsers</code>, <code>AuthenticatedUsers</code>, or
     *         <code>LogDelivery</code>.</li>
     *         </ul>
     *         </li>
     *         <li><b>Grantee</b>: The AWS user or group that you want to have
     *         access to transcoded files and playlists. To identify the user or
     *         group, you can specify the canonical user ID for an AWS account,
     *         an origin access identity for a CloudFront distribution, the
     *         registered email address of an AWS account, or a predefined
     *         Amazon S3 group</li>
     *         <li><b>Access</b>: The permission that you want to give to the
     *         AWS user that you specified in <code>Grantee</code>. Permissions
     *         are granted on the files that Elastic Transcoder adds to the
     *         bucket, including playlists and video files. Valid values
     *         include:
     *         <ul>
     *         <li><code>READ</code>: The grantee can read the objects and
     *         metadata for objects that Elastic Transcoder adds to the Amazon
     *         S3 bucket.</li>
     *         <li><code>READ_ACP</code>: The grantee can read the object ACL
     *         for objects that Elastic Transcoder adds to the Amazon S3 bucket.
     *         </li>
     *         <li><code>WRITE_ACP</code>: The grantee can write the ACL for the
     *         objects that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     *         <li><code>FULL_CONTROL</code>: The grantee has <code>READ</code>,
     *         <code>READ_ACP</code>, and <code>WRITE_ACP</code> permissions for
     *         the objects that Elastic Transcoder adds to the Amazon S3 bucket.
     *         </li>
     *         </ul>
     *         </li>
     *         <li><b>StorageClass</b>: The Amazon S3 storage class,
     *         <code>Standard</code> or <code>ReducedRedundancy</code>, that you
     *         want Elastic Transcoder to assign to the video files and
     *         playlists that it stores in your Amazon S3 bucket.</li>
     */

    public PipelineOutputConfig getContentConfig() {
        return this.contentConfig;
    }

    /**
     * <p>
     * The optional <code>ContentConfig</code> object specifies information
     * about the Amazon S3 bucket in which you want Elastic Transcoder to save
     * transcoded files and playlists: which bucket to use, which users you want
     * to have access to the files, the type of access you want users to have,
     * and the storage class that you want to assign to the files.
     * </p>
     * <p>
     * If you specify values for <code>ContentConfig</code>, you must also
     * specify values for <code>ThumbnailConfig</code>.
     * </p>
     * <p>
     * If you specify values for <code>ContentConfig</code> and
     * <code>ThumbnailConfig</code>, omit the <code>OutputBucket</code> object.
     * </p>
     * <ul>
     * <li><b>Bucket</b>: The Amazon S3 bucket in which you want Elastic
     * Transcoder to save transcoded files and playlists.</li>
     * <li><b>Permissions</b> (Optional): The Permissions object specifies which
     * users you want to have access to transcoded files and the type of access
     * you want them to have. You can grant permissions to a maximum of 30 users
     * and/or predefined Amazon S3 groups.</li>
     * <li><b>Grantee Type</b>: Specify the type of value that appears in the
     * <code>Grantee</code> object:
     * <ul>
     * <li><b>Canonical</b>: The value in the <code>Grantee</code> object is
     * either the canonical user ID for an AWS account or an origin access
     * identity for an Amazon CloudFront distribution. For more information
     * about canonical user IDs, see Access Control List (ACL) Overview in the
     * Amazon Simple Storage Service Developer Guide. For more information about
     * using CloudFront origin access identities to require that users use
     * CloudFront URLs instead of Amazon S3 URLs, see Using an Origin Access
     * Identity to Restrict Access to Your Amazon S3 Content. <important>A
     * canonical user ID is not the same as an AWS account number.</important></li>
     * <li><b>Email</b>: The value in the <code>Grantee</code> object is the
     * registered email address of an AWS account.</li>
     * <li><b>Group</b>: The value in the <code>Grantee</code> object is one of
     * the following predefined Amazon S3 groups: <code>AllUsers</code>,
     * <code>AuthenticatedUsers</code>, or <code>LogDelivery</code>.</li>
     * </ul>
     * </li>
     * <li><b>Grantee</b>: The AWS user or group that you want to have access to
     * transcoded files and playlists. To identify the user or group, you can
     * specify the canonical user ID for an AWS account, an origin access
     * identity for a CloudFront distribution, the registered email address of
     * an AWS account, or a predefined Amazon S3 group</li>
     * <li><b>Access</b>: The permission that you want to give to the AWS user
     * that you specified in <code>Grantee</code>. Permissions are granted on
     * the files that Elastic Transcoder adds to the bucket, including playlists
     * and video files. Valid values include:
     * <ul>
     * <li><code>READ</code>: The grantee can read the objects and metadata for
     * objects that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>READ_ACP</code>: The grantee can read the object ACL for
     * objects that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>WRITE_ACP</code>: The grantee can write the ACL for the objects
     * that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>FULL_CONTROL</code>: The grantee has <code>READ</code>,
     * <code>READ_ACP</code>, and <code>WRITE_ACP</code> permissions for the
     * objects that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * </ul>
     * </li>
     * <li><b>StorageClass</b>: The Amazon S3 storage class,
     * <code>Standard</code> or <code>ReducedRedundancy</code>, that you want
     * Elastic Transcoder to assign to the video files and playlists that it
     * stores in your Amazon S3 bucket.</li>
     * </ul>
     * 
     * @param contentConfig
     *        The optional <code>ContentConfig</code> object specifies
     *        information about the Amazon S3 bucket in which you want Elastic
     *        Transcoder to save transcoded files and playlists: which bucket to
     *        use, which users you want to have access to the files, the type of
     *        access you want users to have, and the storage class that you want
     *        to assign to the files.</p>
     *        <p>
     *        If you specify values for <code>ContentConfig</code>, you must
     *        also specify values for <code>ThumbnailConfig</code>.
     *        </p>
     *        <p>
     *        If you specify values for <code>ContentConfig</code> and
     *        <code>ThumbnailConfig</code>, omit the <code>OutputBucket</code>
     *        object.
     *        </p>
     *        <ul>
     *        <li><b>Bucket</b>: The Amazon S3 bucket in which you want Elastic
     *        Transcoder to save transcoded files and playlists.</li>
     *        <li><b>Permissions</b> (Optional): The Permissions object
     *        specifies which users you want to have access to transcoded files
     *        and the type of access you want them to have. You can grant
     *        permissions to a maximum of 30 users and/or predefined Amazon S3
     *        groups.</li>
     *        <li><b>Grantee Type</b>: Specify the type of value that appears in
     *        the <code>Grantee</code> object:
     *        <ul>
     *        <li><b>Canonical</b>: The value in the <code>Grantee</code> object
     *        is either the canonical user ID for an AWS account or an origin
     *        access identity for an Amazon CloudFront distribution. For more
     *        information about canonical user IDs, see Access Control List
     *        (ACL) Overview in the Amazon Simple Storage Service Developer
     *        Guide. For more information about using CloudFront origin access
     *        identities to require that users use CloudFront URLs instead of
     *        Amazon S3 URLs, see Using an Origin Access Identity to Restrict
     *        Access to Your Amazon S3 Content. <important>A canonical user ID
     *        is not the same as an AWS account number.</important></li>
     *        <li><b>Email</b>: The value in the <code>Grantee</code> object is
     *        the registered email address of an AWS account.</li>
     *        <li><b>Group</b>: The value in the <code>Grantee</code> object is
     *        one of the following predefined Amazon S3 groups:
     *        <code>AllUsers</code>, <code>AuthenticatedUsers</code>, or
     *        <code>LogDelivery</code>.</li>
     *        </ul>
     *        </li>
     *        <li><b>Grantee</b>: The AWS user or group that you want to have
     *        access to transcoded files and playlists. To identify the user or
     *        group, you can specify the canonical user ID for an AWS account,
     *        an origin access identity for a CloudFront distribution, the
     *        registered email address of an AWS account, or a predefined Amazon
     *        S3 group</li>
     *        <li><b>Access</b>: The permission that you want to give to the AWS
     *        user that you specified in <code>Grantee</code>. Permissions are
     *        granted on the files that Elastic Transcoder adds to the bucket,
     *        including playlists and video files. Valid values include:
     *        <ul>
     *        <li><code>READ</code>: The grantee can read the objects and
     *        metadata for objects that Elastic Transcoder adds to the Amazon S3
     *        bucket.</li>
     *        <li><code>READ_ACP</code>: The grantee can read the object ACL for
     *        objects that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     *        <li><code>WRITE_ACP</code>: The grantee can write the ACL for the
     *        objects that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     *        <li><code>FULL_CONTROL</code>: The grantee has <code>READ</code>,
     *        <code>READ_ACP</code>, and <code>WRITE_ACP</code> permissions for
     *        the objects that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     *        </ul>
     *        </li>
     *        <li><b>StorageClass</b>: The Amazon S3 storage class,
     *        <code>Standard</code> or <code>ReducedRedundancy</code>, that you
     *        want Elastic Transcoder to assign to the video files and playlists
     *        that it stores in your Amazon S3 bucket.</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdatePipelineRequest withContentConfig(
            PipelineOutputConfig contentConfig) {
        setContentConfig(contentConfig);
        return this;
    }

    /**
     * <p>
     * The <code>ThumbnailConfig</code> object specifies several values,
     * including the Amazon S3 bucket in which you want Elastic Transcoder to
     * save thumbnail files, which users you want to have access to the files,
     * the type of access you want users to have, and the storage class that you
     * want to assign to the files.
     * </p>
     * <p>
     * If you specify values for <code>ContentConfig</code>, you must also
     * specify values for <code>ThumbnailConfig</code> even if you don't want to
     * create thumbnails.
     * </p>
     * <p>
     * If you specify values for <code>ContentConfig</code> and
     * <code>ThumbnailConfig</code>, omit the <code>OutputBucket</code> object.
     * </p>
     * <ul>
     * <li><b>Bucket</b>: The Amazon S3 bucket in which you want Elastic
     * Transcoder to save thumbnail files.</li>
     * <li><b>Permissions</b> (Optional): The <code>Permissions</code> object
     * specifies which users and/or predefined Amazon S3 groups you want to have
     * access to thumbnail files, and the type of access you want them to have.
     * You can grant permissions to a maximum of 30 users and/or predefined
     * Amazon S3 groups.</li>
     * <li><b>GranteeType</b>: Specify the type of value that appears in the
     * Grantee object:
     * <ul>
     * <li><b>Canonical</b>: The value in the <code>Grantee</code> object is
     * either the canonical user ID for an AWS account or an origin access
     * identity for an Amazon CloudFront distribution. <important>A canonical
     * user ID is not the same as an AWS account number.</important></li>
     * <li><b>Email</b>: The value in the <code>Grantee</code> object is the
     * registered email address of an AWS account.</li>
     * <li><b>Group</b>: The value in the <code>Grantee</code> object is one of
     * the following predefined Amazon S3 groups: <code>AllUsers</code>,
     * <code>AuthenticatedUsers</code>, or <code>LogDelivery</code>.</li>
     * </ul>
     * </li>
     * <li><b>Grantee</b>: The AWS user or group that you want to have access to
     * thumbnail files. To identify the user or group, you can specify the
     * canonical user ID for an AWS account, an origin access identity for a
     * CloudFront distribution, the registered email address of an AWS account,
     * or a predefined Amazon S3 group.</li>
     * <li><b>Access</b>: The permission that you want to give to the AWS user
     * that you specified in <code>Grantee</code>. Permissions are granted on
     * the thumbnail files that Elastic Transcoder adds to the bucket. Valid
     * values include:
     * <ul>
     * <li><code>READ</code>: The grantee can read the thumbnails and metadata
     * for objects that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>READ_ACP</code>: The grantee can read the object ACL for
     * thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>WRITE_ACP</code>: The grantee can write the ACL for the
     * thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>FULL_CONTROL</code>: The grantee has <code>READ</code>,
     * <code>READ_ACP</code>, and <code>WRITE_ACP</code> permissions for the
     * thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * </ul>
     * </li>
     * <li><b>StorageClass</b>: The Amazon S3 storage class,
     * <code>Standard</code> or <code>ReducedRedundancy</code>, that you want
     * Elastic Transcoder to assign to the thumbnails that it stores in your
     * Amazon S3 bucket.</li>
     * </ul>
     * 
     * @param thumbnailConfig
     *        The <code>ThumbnailConfig</code> object specifies several values,
     *        including the Amazon S3 bucket in which you want Elastic
     *        Transcoder to save thumbnail files, which users you want to have
     *        access to the files, the type of access you want users to have,
     *        and the storage class that you want to assign to the files.</p>
     *        <p>
     *        If you specify values for <code>ContentConfig</code>, you must
     *        also specify values for <code>ThumbnailConfig</code> even if you
     *        don't want to create thumbnails.
     *        </p>
     *        <p>
     *        If you specify values for <code>ContentConfig</code> and
     *        <code>ThumbnailConfig</code>, omit the <code>OutputBucket</code>
     *        object.
     *        </p>
     *        <ul>
     *        <li><b>Bucket</b>: The Amazon S3 bucket in which you want Elastic
     *        Transcoder to save thumbnail files.</li>
     *        <li><b>Permissions</b> (Optional): The <code>Permissions</code>
     *        object specifies which users and/or predefined Amazon S3 groups
     *        you want to have access to thumbnail files, and the type of access
     *        you want them to have. You can grant permissions to a maximum of
     *        30 users and/or predefined Amazon S3 groups.</li>
     *        <li><b>GranteeType</b>: Specify the type of value that appears in
     *        the Grantee object:
     *        <ul>
     *        <li><b>Canonical</b>: The value in the <code>Grantee</code> object
     *        is either the canonical user ID for an AWS account or an origin
     *        access identity for an Amazon CloudFront distribution.
     *        <important>A canonical user ID is not the same as an AWS account
     *        number.</important></li>
     *        <li><b>Email</b>: The value in the <code>Grantee</code> object is
     *        the registered email address of an AWS account.</li>
     *        <li><b>Group</b>: The value in the <code>Grantee</code> object is
     *        one of the following predefined Amazon S3 groups:
     *        <code>AllUsers</code>, <code>AuthenticatedUsers</code>, or
     *        <code>LogDelivery</code>.</li>
     *        </ul>
     *        </li>
     *        <li><b>Grantee</b>: The AWS user or group that you want to have
     *        access to thumbnail files. To identify the user or group, you can
     *        specify the canonical user ID for an AWS account, an origin access
     *        identity for a CloudFront distribution, the registered email
     *        address of an AWS account, or a predefined Amazon S3 group.</li>
     *        <li><b>Access</b>: The permission that you want to give to the AWS
     *        user that you specified in <code>Grantee</code>. Permissions are
     *        granted on the thumbnail files that Elastic Transcoder adds to the
     *        bucket. Valid values include:
     *        <ul>
     *        <li><code>READ</code>: The grantee can read the thumbnails and
     *        metadata for objects that Elastic Transcoder adds to the Amazon S3
     *        bucket.</li>
     *        <li><code>READ_ACP</code>: The grantee can read the object ACL for
     *        thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     *        <li><code>WRITE_ACP</code>: The grantee can write the ACL for the
     *        thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     *        <li><code>FULL_CONTROL</code>: The grantee has <code>READ</code>,
     *        <code>READ_ACP</code>, and <code>WRITE_ACP</code> permissions for
     *        the thumbnails that Elastic Transcoder adds to the Amazon S3
     *        bucket.</li>
     *        </ul>
     *        </li>
     *        <li><b>StorageClass</b>: The Amazon S3 storage class,
     *        <code>Standard</code> or <code>ReducedRedundancy</code>, that you
     *        want Elastic Transcoder to assign to the thumbnails that it stores
     *        in your Amazon S3 bucket.</li>
     */

    public void setThumbnailConfig(PipelineOutputConfig thumbnailConfig) {
        this.thumbnailConfig = thumbnailConfig;
    }

    /**
     * <p>
     * The <code>ThumbnailConfig</code> object specifies several values,
     * including the Amazon S3 bucket in which you want Elastic Transcoder to
     * save thumbnail files, which users you want to have access to the files,
     * the type of access you want users to have, and the storage class that you
     * want to assign to the files.
     * </p>
     * <p>
     * If you specify values for <code>ContentConfig</code>, you must also
     * specify values for <code>ThumbnailConfig</code> even if you don't want to
     * create thumbnails.
     * </p>
     * <p>
     * If you specify values for <code>ContentConfig</code> and
     * <code>ThumbnailConfig</code>, omit the <code>OutputBucket</code> object.
     * </p>
     * <ul>
     * <li><b>Bucket</b>: The Amazon S3 bucket in which you want Elastic
     * Transcoder to save thumbnail files.</li>
     * <li><b>Permissions</b> (Optional): The <code>Permissions</code> object
     * specifies which users and/or predefined Amazon S3 groups you want to have
     * access to thumbnail files, and the type of access you want them to have.
     * You can grant permissions to a maximum of 30 users and/or predefined
     * Amazon S3 groups.</li>
     * <li><b>GranteeType</b>: Specify the type of value that appears in the
     * Grantee object:
     * <ul>
     * <li><b>Canonical</b>: The value in the <code>Grantee</code> object is
     * either the canonical user ID for an AWS account or an origin access
     * identity for an Amazon CloudFront distribution. <important>A canonical
     * user ID is not the same as an AWS account number.</important></li>
     * <li><b>Email</b>: The value in the <code>Grantee</code> object is the
     * registered email address of an AWS account.</li>
     * <li><b>Group</b>: The value in the <code>Grantee</code> object is one of
     * the following predefined Amazon S3 groups: <code>AllUsers</code>,
     * <code>AuthenticatedUsers</code>, or <code>LogDelivery</code>.</li>
     * </ul>
     * </li>
     * <li><b>Grantee</b>: The AWS user or group that you want to have access to
     * thumbnail files. To identify the user or group, you can specify the
     * canonical user ID for an AWS account, an origin access identity for a
     * CloudFront distribution, the registered email address of an AWS account,
     * or a predefined Amazon S3 group.</li>
     * <li><b>Access</b>: The permission that you want to give to the AWS user
     * that you specified in <code>Grantee</code>. Permissions are granted on
     * the thumbnail files that Elastic Transcoder adds to the bucket. Valid
     * values include:
     * <ul>
     * <li><code>READ</code>: The grantee can read the thumbnails and metadata
     * for objects that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>READ_ACP</code>: The grantee can read the object ACL for
     * thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>WRITE_ACP</code>: The grantee can write the ACL for the
     * thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>FULL_CONTROL</code>: The grantee has <code>READ</code>,
     * <code>READ_ACP</code>, and <code>WRITE_ACP</code> permissions for the
     * thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * </ul>
     * </li>
     * <li><b>StorageClass</b>: The Amazon S3 storage class,
     * <code>Standard</code> or <code>ReducedRedundancy</code>, that you want
     * Elastic Transcoder to assign to the thumbnails that it stores in your
     * Amazon S3 bucket.</li>
     * </ul>
     * 
     * @return The <code>ThumbnailConfig</code> object specifies several values,
     *         including the Amazon S3 bucket in which you want Elastic
     *         Transcoder to save thumbnail files, which users you want to have
     *         access to the files, the type of access you want users to have,
     *         and the storage class that you want to assign to the files.</p>
     *         <p>
     *         If you specify values for <code>ContentConfig</code>, you must
     *         also specify values for <code>ThumbnailConfig</code> even if you
     *         don't want to create thumbnails.
     *         </p>
     *         <p>
     *         If you specify values for <code>ContentConfig</code> and
     *         <code>ThumbnailConfig</code>, omit the <code>OutputBucket</code>
     *         object.
     *         </p>
     *         <ul>
     *         <li><b>Bucket</b>: The Amazon S3 bucket in which you want Elastic
     *         Transcoder to save thumbnail files.</li>
     *         <li><b>Permissions</b> (Optional): The <code>Permissions</code>
     *         object specifies which users and/or predefined Amazon S3 groups
     *         you want to have access to thumbnail files, and the type of
     *         access you want them to have. You can grant permissions to a
     *         maximum of 30 users and/or predefined Amazon S3 groups.</li>
     *         <li><b>GranteeType</b>: Specify the type of value that appears in
     *         the Grantee object:
     *         <ul>
     *         <li><b>Canonical</b>: The value in the <code>Grantee</code>
     *         object is either the canonical user ID for an AWS account or an
     *         origin access identity for an Amazon CloudFront distribution.
     *         <important>A canonical user ID is not the same as an AWS account
     *         number.</important></li>
     *         <li><b>Email</b>: The value in the <code>Grantee</code> object is
     *         the registered email address of an AWS account.</li>
     *         <li><b>Group</b>: The value in the <code>Grantee</code> object is
     *         one of the following predefined Amazon S3 groups:
     *         <code>AllUsers</code>, <code>AuthenticatedUsers</code>, or
     *         <code>LogDelivery</code>.</li>
     *         </ul>
     *         </li>
     *         <li><b>Grantee</b>: The AWS user or group that you want to have
     *         access to thumbnail files. To identify the user or group, you can
     *         specify the canonical user ID for an AWS account, an origin
     *         access identity for a CloudFront distribution, the registered
     *         email address of an AWS account, or a predefined Amazon S3 group.
     *         </li>
     *         <li><b>Access</b>: The permission that you want to give to the
     *         AWS user that you specified in <code>Grantee</code>. Permissions
     *         are granted on the thumbnail files that Elastic Transcoder adds
     *         to the bucket. Valid values include:
     *         <ul>
     *         <li><code>READ</code>: The grantee can read the thumbnails and
     *         metadata for objects that Elastic Transcoder adds to the Amazon
     *         S3 bucket.</li>
     *         <li><code>READ_ACP</code>: The grantee can read the object ACL
     *         for thumbnails that Elastic Transcoder adds to the Amazon S3
     *         bucket.</li>
     *         <li><code>WRITE_ACP</code>: The grantee can write the ACL for the
     *         thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     *         <li><code>FULL_CONTROL</code>: The grantee has <code>READ</code>,
     *         <code>READ_ACP</code>, and <code>WRITE_ACP</code> permissions for
     *         the thumbnails that Elastic Transcoder adds to the Amazon S3
     *         bucket.</li>
     *         </ul>
     *         </li>
     *         <li><b>StorageClass</b>: The Amazon S3 storage class,
     *         <code>Standard</code> or <code>ReducedRedundancy</code>, that you
     *         want Elastic Transcoder to assign to the thumbnails that it
     *         stores in your Amazon S3 bucket.</li>
     */

    public PipelineOutputConfig getThumbnailConfig() {
        return this.thumbnailConfig;
    }

    /**
     * <p>
     * The <code>ThumbnailConfig</code> object specifies several values,
     * including the Amazon S3 bucket in which you want Elastic Transcoder to
     * save thumbnail files, which users you want to have access to the files,
     * the type of access you want users to have, and the storage class that you
     * want to assign to the files.
     * </p>
     * <p>
     * If you specify values for <code>ContentConfig</code>, you must also
     * specify values for <code>ThumbnailConfig</code> even if you don't want to
     * create thumbnails.
     * </p>
     * <p>
     * If you specify values for <code>ContentConfig</code> and
     * <code>ThumbnailConfig</code>, omit the <code>OutputBucket</code> object.
     * </p>
     * <ul>
     * <li><b>Bucket</b>: The Amazon S3 bucket in which you want Elastic
     * Transcoder to save thumbnail files.</li>
     * <li><b>Permissions</b> (Optional): The <code>Permissions</code> object
     * specifies which users and/or predefined Amazon S3 groups you want to have
     * access to thumbnail files, and the type of access you want them to have.
     * You can grant permissions to a maximum of 30 users and/or predefined
     * Amazon S3 groups.</li>
     * <li><b>GranteeType</b>: Specify the type of value that appears in the
     * Grantee object:
     * <ul>
     * <li><b>Canonical</b>: The value in the <code>Grantee</code> object is
     * either the canonical user ID for an AWS account or an origin access
     * identity for an Amazon CloudFront distribution. <important>A canonical
     * user ID is not the same as an AWS account number.</important></li>
     * <li><b>Email</b>: The value in the <code>Grantee</code> object is the
     * registered email address of an AWS account.</li>
     * <li><b>Group</b>: The value in the <code>Grantee</code> object is one of
     * the following predefined Amazon S3 groups: <code>AllUsers</code>,
     * <code>AuthenticatedUsers</code>, or <code>LogDelivery</code>.</li>
     * </ul>
     * </li>
     * <li><b>Grantee</b>: The AWS user or group that you want to have access to
     * thumbnail files. To identify the user or group, you can specify the
     * canonical user ID for an AWS account, an origin access identity for a
     * CloudFront distribution, the registered email address of an AWS account,
     * or a predefined Amazon S3 group.</li>
     * <li><b>Access</b>: The permission that you want to give to the AWS user
     * that you specified in <code>Grantee</code>. Permissions are granted on
     * the thumbnail files that Elastic Transcoder adds to the bucket. Valid
     * values include:
     * <ul>
     * <li><code>READ</code>: The grantee can read the thumbnails and metadata
     * for objects that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>READ_ACP</code>: The grantee can read the object ACL for
     * thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>WRITE_ACP</code>: The grantee can write the ACL for the
     * thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>FULL_CONTROL</code>: The grantee has <code>READ</code>,
     * <code>READ_ACP</code>, and <code>WRITE_ACP</code> permissions for the
     * thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * </ul>
     * </li>
     * <li><b>StorageClass</b>: The Amazon S3 storage class,
     * <code>Standard</code> or <code>ReducedRedundancy</code>, that you want
     * Elastic Transcoder to assign to the thumbnails that it stores in your
     * Amazon S3 bucket.</li>
     * </ul>
     * 
     * @param thumbnailConfig
     *        The <code>ThumbnailConfig</code> object specifies several values,
     *        including the Amazon S3 bucket in which you want Elastic
     *        Transcoder to save thumbnail files, which users you want to have
     *        access to the files, the type of access you want users to have,
     *        and the storage class that you want to assign to the files.</p>
     *        <p>
     *        If you specify values for <code>ContentConfig</code>, you must
     *        also specify values for <code>ThumbnailConfig</code> even if you
     *        don't want to create thumbnails.
     *        </p>
     *        <p>
     *        If you specify values for <code>ContentConfig</code> and
     *        <code>ThumbnailConfig</code>, omit the <code>OutputBucket</code>
     *        object.
     *        </p>
     *        <ul>
     *        <li><b>Bucket</b>: The Amazon S3 bucket in which you want Elastic
     *        Transcoder to save thumbnail files.</li>
     *        <li><b>Permissions</b> (Optional): The <code>Permissions</code>
     *        object specifies which users and/or predefined Amazon S3 groups
     *        you want to have access to thumbnail files, and the type of access
     *        you want them to have. You can grant permissions to a maximum of
     *        30 users and/or predefined Amazon S3 groups.</li>
     *        <li><b>GranteeType</b>: Specify the type of value that appears in
     *        the Grantee object:
     *        <ul>
     *        <li><b>Canonical</b>: The value in the <code>Grantee</code> object
     *        is either the canonical user ID for an AWS account or an origin
     *        access identity for an Amazon CloudFront distribution.
     *        <important>A canonical user ID is not the same as an AWS account
     *        number.</important></li>
     *        <li><b>Email</b>: The value in the <code>Grantee</code> object is
     *        the registered email address of an AWS account.</li>
     *        <li><b>Group</b>: The value in the <code>Grantee</code> object is
     *        one of the following predefined Amazon S3 groups:
     *        <code>AllUsers</code>, <code>AuthenticatedUsers</code>, or
     *        <code>LogDelivery</code>.</li>
     *        </ul>
     *        </li>
     *        <li><b>Grantee</b>: The AWS user or group that you want to have
     *        access to thumbnail files. To identify the user or group, you can
     *        specify the canonical user ID for an AWS account, an origin access
     *        identity for a CloudFront distribution, the registered email
     *        address of an AWS account, or a predefined Amazon S3 group.</li>
     *        <li><b>Access</b>: The permission that you want to give to the AWS
     *        user that you specified in <code>Grantee</code>. Permissions are
     *        granted on the thumbnail files that Elastic Transcoder adds to the
     *        bucket. Valid values include:
     *        <ul>
     *        <li><code>READ</code>: The grantee can read the thumbnails and
     *        metadata for objects that Elastic Transcoder adds to the Amazon S3
     *        bucket.</li>
     *        <li><code>READ_ACP</code>: The grantee can read the object ACL for
     *        thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     *        <li><code>WRITE_ACP</code>: The grantee can write the ACL for the
     *        thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     *        <li><code>FULL_CONTROL</code>: The grantee has <code>READ</code>,
     *        <code>READ_ACP</code>, and <code>WRITE_ACP</code> permissions for
     *        the thumbnails that Elastic Transcoder adds to the Amazon S3
     *        bucket.</li>
     *        </ul>
     *        </li>
     *        <li><b>StorageClass</b>: The Amazon S3 storage class,
     *        <code>Standard</code> or <code>ReducedRedundancy</code>, that you
     *        want Elastic Transcoder to assign to the thumbnails that it stores
     *        in your Amazon S3 bucket.</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdatePipelineRequest withThumbnailConfig(
            PipelineOutputConfig thumbnailConfig) {
        setThumbnailConfig(thumbnailConfig);
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getInputBucket() != null)
            sb.append("InputBucket: " + getInputBucket() + ",");
        if (getRole() != null)
            sb.append("Role: " + getRole() + ",");
        if (getAwsKmsKeyArn() != null)
            sb.append("AwsKmsKeyArn: " + getAwsKmsKeyArn() + ",");
        if (getNotifications() != null)
            sb.append("Notifications: " + getNotifications() + ",");
        if (getContentConfig() != null)
            sb.append("ContentConfig: " + getContentConfig() + ",");
        if (getThumbnailConfig() != null)
            sb.append("ThumbnailConfig: " + getThumbnailConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePipelineRequest == false)
            return false;
        UpdatePipelineRequest other = (UpdatePipelineRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null
                && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null
                && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getInputBucket() == null ^ this.getInputBucket() == null)
            return false;
        if (other.getInputBucket() != null
                && other.getInputBucket().equals(this.getInputBucket()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null
                && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getAwsKmsKeyArn() == null ^ this.getAwsKmsKeyArn() == null)
            return false;
        if (other.getAwsKmsKeyArn() != null
                && other.getAwsKmsKeyArn().equals(this.getAwsKmsKeyArn()) == false)
            return false;
        if (other.getNotifications() == null ^ this.getNotifications() == null)
            return false;
        if (other.getNotifications() != null
                && other.getNotifications().equals(this.getNotifications()) == false)
            return false;
        if (other.getContentConfig() == null ^ this.getContentConfig() == null)
            return false;
        if (other.getContentConfig() != null
                && other.getContentConfig().equals(this.getContentConfig()) == false)
            return false;
        if (other.getThumbnailConfig() == null
                ^ this.getThumbnailConfig() == null)
            return false;
        if (other.getThumbnailConfig() != null
                && other.getThumbnailConfig().equals(this.getThumbnailConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime
                * hashCode
                + ((getInputBucket() == null) ? 0 : getInputBucket().hashCode());
        hashCode = prime * hashCode
                + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime
                * hashCode
                + ((getAwsKmsKeyArn() == null) ? 0 : getAwsKmsKeyArn()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getNotifications() == null) ? 0 : getNotifications()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getContentConfig() == null) ? 0 : getContentConfig()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getThumbnailConfig() == null) ? 0 : getThumbnailConfig()
                        .hashCode());
        return hashCode;
    }

    @Override
    public UpdatePipelineRequest clone() {
        return (UpdatePipelineRequest) super.clone();
    }
}

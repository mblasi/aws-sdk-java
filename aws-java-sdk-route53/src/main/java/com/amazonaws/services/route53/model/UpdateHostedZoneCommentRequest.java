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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A complex type that contains the hosted zone request information.
 * </p>
 */
public class UpdateHostedZoneCommentRequest extends
        com.amazonaws.AmazonWebServiceRequest implements Serializable,
        Cloneable {

    /**
     * <p>
     * The ID for the hosted zone for which you want to update the comment.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The new comment for the hosted zone. If you don't specify a value for
     * <code>Comment</code>, Amazon Route 53 deletes the existing value of the
     * <code>Comment</code> element, if any.
     * </p>
     */
    private String comment;

    /**
     * <p>
     * The ID for the hosted zone for which you want to update the comment.
     * </p>
     * 
     * @param id
     *        The ID for the hosted zone for which you want to update the
     *        comment.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID for the hosted zone for which you want to update the comment.
     * </p>
     * 
     * @return The ID for the hosted zone for which you want to update the
     *         comment.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID for the hosted zone for which you want to update the comment.
     * </p>
     * 
     * @param id
     *        The ID for the hosted zone for which you want to update the
     *        comment.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateHostedZoneCommentRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The new comment for the hosted zone. If you don't specify a value for
     * <code>Comment</code>, Amazon Route 53 deletes the existing value of the
     * <code>Comment</code> element, if any.
     * </p>
     * 
     * @param comment
     *        The new comment for the hosted zone. If you don't specify a value
     *        for <code>Comment</code>, Amazon Route 53 deletes the existing
     *        value of the <code>Comment</code> element, if any.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * The new comment for the hosted zone. If you don't specify a value for
     * <code>Comment</code>, Amazon Route 53 deletes the existing value of the
     * <code>Comment</code> element, if any.
     * </p>
     * 
     * @return The new comment for the hosted zone. If you don't specify a value
     *         for <code>Comment</code>, Amazon Route 53 deletes the existing
     *         value of the <code>Comment</code> element, if any.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * The new comment for the hosted zone. If you don't specify a value for
     * <code>Comment</code>, Amazon Route 53 deletes the existing value of the
     * <code>Comment</code> element, if any.
     * </p>
     * 
     * @param comment
     *        The new comment for the hosted zone. If you don't specify a value
     *        for <code>Comment</code>, Amazon Route 53 deletes the existing
     *        value of the <code>Comment</code> element, if any.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateHostedZoneCommentRequest withComment(String comment) {
        setComment(comment);
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
        if (getComment() != null)
            sb.append("Comment: " + getComment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateHostedZoneCommentRequest == false)
            return false;
        UpdateHostedZoneCommentRequest other = (UpdateHostedZoneCommentRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null
                && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null
                && other.getComment().equals(this.getComment()) == false)
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
                + ((getComment() == null) ? 0 : getComment().hashCode());
        return hashCode;
    }

    @Override
    public UpdateHostedZoneCommentRequest clone() {
        return (UpdateHostedZoneCommentRequest) super.clone();
    }
}

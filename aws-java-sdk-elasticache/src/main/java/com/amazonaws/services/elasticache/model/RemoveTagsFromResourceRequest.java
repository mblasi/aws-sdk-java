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
 * Represents the input of a <i>RemoveTagsFromResource</i> action.
 * </p>
 */
public class RemoveTagsFromResourceRequest extends
        com.amazonaws.AmazonWebServiceRequest implements Serializable,
        Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource from which you want the
     * tags removed, for example
     * <code>arn:aws:elasticache:us-west-2:0123456789:cluster:myCluster</code>
     * or
     * <code>arn:aws:elasticache:us-west-2:0123456789:snapshot:mySnapshot</code>
     * .
     * </p>
     * <p>
     * For more information on ARNs, go to <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     * </p>
     */
    private String resourceName;
    /**
     * <p>
     * A list of <code>TagKeys</code> identifying the tags you want removed from
     * the named resource. For example, <code>TagKeys.member.1=Region</code>
     * removes the cost allocation tag with the key name <code>Region</code>
     * from the resource named by the <i>ResourceName</i> parameter.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> tagKeys;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource from which you want the
     * tags removed, for example
     * <code>arn:aws:elasticache:us-west-2:0123456789:cluster:myCluster</code>
     * or
     * <code>arn:aws:elasticache:us-west-2:0123456789:snapshot:mySnapshot</code>
     * .
     * </p>
     * <p>
     * For more information on ARNs, go to <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     * </p>
     * 
     * @param resourceName
     *        The Amazon Resource Name (ARN) of the resource from which you want
     *        the tags removed, for example
     *        <code>arn:aws:elasticache:us-west-2:0123456789:cluster:myCluster</code>
     *        or
     *        <code>arn:aws:elasticache:us-west-2:0123456789:snapshot:mySnapshot</code>
     *        .</p>
     *        <p>
     *        For more information on ARNs, go to <a href=
     *        "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *        >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     */

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource from which you want the
     * tags removed, for example
     * <code>arn:aws:elasticache:us-west-2:0123456789:cluster:myCluster</code>
     * or
     * <code>arn:aws:elasticache:us-west-2:0123456789:snapshot:mySnapshot</code>
     * .
     * </p>
     * <p>
     * For more information on ARNs, go to <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the resource from which you
     *         want the tags removed, for example
     *         <code>arn:aws:elasticache:us-west-2:0123456789:cluster:myCluster</code>
     *         or
     *         <code>arn:aws:elasticache:us-west-2:0123456789:snapshot:mySnapshot</code>
     *         .</p>
     *         <p>
     *         For more information on ARNs, go to <a href=
     *         "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *         >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     */

    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource from which you want the
     * tags removed, for example
     * <code>arn:aws:elasticache:us-west-2:0123456789:cluster:myCluster</code>
     * or
     * <code>arn:aws:elasticache:us-west-2:0123456789:snapshot:mySnapshot</code>
     * .
     * </p>
     * <p>
     * For more information on ARNs, go to <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     * </p>
     * 
     * @param resourceName
     *        The Amazon Resource Name (ARN) of the resource from which you want
     *        the tags removed, for example
     *        <code>arn:aws:elasticache:us-west-2:0123456789:cluster:myCluster</code>
     *        or
     *        <code>arn:aws:elasticache:us-west-2:0123456789:snapshot:mySnapshot</code>
     *        .</p>
     *        <p>
     *        For more information on ARNs, go to <a href=
     *        "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *        >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public RemoveTagsFromResourceRequest withResourceName(String resourceName) {
        setResourceName(resourceName);
        return this;
    }

    /**
     * <p>
     * A list of <code>TagKeys</code> identifying the tags you want removed from
     * the named resource. For example, <code>TagKeys.member.1=Region</code>
     * removes the cost allocation tag with the key name <code>Region</code>
     * from the resource named by the <i>ResourceName</i> parameter.
     * </p>
     * 
     * @return A list of <code>TagKeys</code> identifying the tags you want
     *         removed from the named resource. For example,
     *         <code>TagKeys.member.1=Region</code> removes the cost allocation
     *         tag with the key name <code>Region</code> from the resource named
     *         by the <i>ResourceName</i> parameter.
     */

    public java.util.List<String> getTagKeys() {
        if (tagKeys == null) {
            tagKeys = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return tagKeys;
    }

    /**
     * <p>
     * A list of <code>TagKeys</code> identifying the tags you want removed from
     * the named resource. For example, <code>TagKeys.member.1=Region</code>
     * removes the cost allocation tag with the key name <code>Region</code>
     * from the resource named by the <i>ResourceName</i> parameter.
     * </p>
     * 
     * @param tagKeys
     *        A list of <code>TagKeys</code> identifying the tags you want
     *        removed from the named resource. For example,
     *        <code>TagKeys.member.1=Region</code> removes the cost allocation
     *        tag with the key name <code>Region</code> from the resource named
     *        by the <i>ResourceName</i> parameter.
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
     * A list of <code>TagKeys</code> identifying the tags you want removed from
     * the named resource. For example, <code>TagKeys.member.1=Region</code>
     * removes the cost allocation tag with the key name <code>Region</code>
     * from the resource named by the <i>ResourceName</i> parameter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTagKeys(java.util.Collection)} or
     * {@link #withTagKeys(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tagKeys
     *        A list of <code>TagKeys</code> identifying the tags you want
     *        removed from the named resource. For example,
     *        <code>TagKeys.member.1=Region</code> removes the cost allocation
     *        tag with the key name <code>Region</code> from the resource named
     *        by the <i>ResourceName</i> parameter.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public RemoveTagsFromResourceRequest withTagKeys(String... tagKeys) {
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
     * A list of <code>TagKeys</code> identifying the tags you want removed from
     * the named resource. For example, <code>TagKeys.member.1=Region</code>
     * removes the cost allocation tag with the key name <code>Region</code>
     * from the resource named by the <i>ResourceName</i> parameter.
     * </p>
     * 
     * @param tagKeys
     *        A list of <code>TagKeys</code> identifying the tags you want
     *        removed from the named resource. For example,
     *        <code>TagKeys.member.1=Region</code> removes the cost allocation
     *        tag with the key name <code>Region</code> from the resource named
     *        by the <i>ResourceName</i> parameter.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public RemoveTagsFromResourceRequest withTagKeys(
            java.util.Collection<String> tagKeys) {
        setTagKeys(tagKeys);
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
        if (getResourceName() != null)
            sb.append("ResourceName: " + getResourceName() + ",");
        if (getTagKeys() != null)
            sb.append("TagKeys: " + getTagKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoveTagsFromResourceRequest == false)
            return false;
        RemoveTagsFromResourceRequest other = (RemoveTagsFromResourceRequest) obj;
        if (other.getResourceName() == null ^ this.getResourceName() == null)
            return false;
        if (other.getResourceName() != null
                && other.getResourceName().equals(this.getResourceName()) == false)
            return false;
        if (other.getTagKeys() == null ^ this.getTagKeys() == null)
            return false;
        if (other.getTagKeys() != null
                && other.getTagKeys().equals(this.getTagKeys()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getResourceName() == null) ? 0 : getResourceName()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getTagKeys() == null) ? 0 : getTagKeys().hashCode());
        return hashCode;
    }

    @Override
    public RemoveTagsFromResourceRequest clone() {
        return (RemoveTagsFromResourceRequest) super.clone();
    }
}

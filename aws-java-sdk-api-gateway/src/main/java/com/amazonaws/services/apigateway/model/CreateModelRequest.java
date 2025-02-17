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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Request to add a new <a>Model</a> to an existing <a>RestApi</a> resource.
 * </p>
 */
public class CreateModelRequest extends com.amazonaws.AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The <a>RestApi</a> identifier under which the <a>Model</a> will be
     * created.
     * </p>
     */
    private String restApiId;
    /**
     * <p>
     * The name of the model.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the model.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The schema for the model. For <code>application/json</code> models, this
     * should be <a href="http://json-schema.org/documentation.html"
     * target="_blank">JSON-schema draft v4</a> model.
     * </p>
     */
    private String schema;
    /**
     * <p>
     * The content-type for the model.
     * </p>
     */
    private String contentType;

    /**
     * <p>
     * The <a>RestApi</a> identifier under which the <a>Model</a> will be
     * created.
     * </p>
     * 
     * @param restApiId
     *        The <a>RestApi</a> identifier under which the <a>Model</a> will be
     *        created.
     */

    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * The <a>RestApi</a> identifier under which the <a>Model</a> will be
     * created.
     * </p>
     * 
     * @return The <a>RestApi</a> identifier under which the <a>Model</a> will
     *         be created.
     */

    public String getRestApiId() {
        return this.restApiId;
    }

    /**
     * <p>
     * The <a>RestApi</a> identifier under which the <a>Model</a> will be
     * created.
     * </p>
     * 
     * @param restApiId
     *        The <a>RestApi</a> identifier under which the <a>Model</a> will be
     *        created.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateModelRequest withRestApiId(String restApiId) {
        setRestApiId(restApiId);
        return this;
    }

    /**
     * <p>
     * The name of the model.
     * </p>
     * 
     * @param name
     *        The name of the model.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the model.
     * </p>
     * 
     * @return The name of the model.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the model.
     * </p>
     * 
     * @param name
     *        The name of the model.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateModelRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the model.
     * </p>
     * 
     * @param description
     *        The description of the model.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the model.
     * </p>
     * 
     * @return The description of the model.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the model.
     * </p>
     * 
     * @param description
     *        The description of the model.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateModelRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The schema for the model. For <code>application/json</code> models, this
     * should be <a href="http://json-schema.org/documentation.html"
     * target="_blank">JSON-schema draft v4</a> model.
     * </p>
     * 
     * @param schema
     *        The schema for the model. For <code>application/json</code>
     *        models, this should be <a
     *        href="http://json-schema.org/documentation.html"
     *        target="_blank">JSON-schema draft v4</a> model.
     */

    public void setSchema(String schema) {
        this.schema = schema;
    }

    /**
     * <p>
     * The schema for the model. For <code>application/json</code> models, this
     * should be <a href="http://json-schema.org/documentation.html"
     * target="_blank">JSON-schema draft v4</a> model.
     * </p>
     * 
     * @return The schema for the model. For <code>application/json</code>
     *         models, this should be <a
     *         href="http://json-schema.org/documentation.html"
     *         target="_blank">JSON-schema draft v4</a> model.
     */

    public String getSchema() {
        return this.schema;
    }

    /**
     * <p>
     * The schema for the model. For <code>application/json</code> models, this
     * should be <a href="http://json-schema.org/documentation.html"
     * target="_blank">JSON-schema draft v4</a> model.
     * </p>
     * 
     * @param schema
     *        The schema for the model. For <code>application/json</code>
     *        models, this should be <a
     *        href="http://json-schema.org/documentation.html"
     *        target="_blank">JSON-schema draft v4</a> model.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateModelRequest withSchema(String schema) {
        setSchema(schema);
        return this;
    }

    /**
     * <p>
     * The content-type for the model.
     * </p>
     * 
     * @param contentType
     *        The content-type for the model.
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The content-type for the model.
     * </p>
     * 
     * @return The content-type for the model.
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The content-type for the model.
     * </p>
     * 
     * @param contentType
     *        The content-type for the model.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateModelRequest withContentType(String contentType) {
        setContentType(contentType);
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
        if (getRestApiId() != null)
            sb.append("RestApiId: " + getRestApiId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getSchema() != null)
            sb.append("Schema: " + getSchema() + ",");
        if (getContentType() != null)
            sb.append("ContentType: " + getContentType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateModelRequest == false)
            return false;
        CreateModelRequest other = (CreateModelRequest) obj;
        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null
                && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null
                && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSchema() == null ^ this.getSchema() == null)
            return false;
        if (other.getSchema() != null
                && other.getSchema().equals(this.getSchema()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null
                && other.getContentType().equals(this.getContentType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode
                + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime
                * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getSchema() == null) ? 0 : getSchema().hashCode());
        hashCode = prime
                * hashCode
                + ((getContentType() == null) ? 0 : getContentType().hashCode());
        return hashCode;
    }

    @Override
    public CreateModelRequest clone() {
        return (CreateModelRequest) super.clone();
    }
}

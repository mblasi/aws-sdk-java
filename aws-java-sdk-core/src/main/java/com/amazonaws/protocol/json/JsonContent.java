/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.protocol.json;

import com.amazonaws.http.HttpResponse;
import com.amazonaws.util.IOUtils;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Simple struct like class to hold both the raw json string content and it's parsed JsonNode
 */
public class JsonContent {

    private static final Log LOG = LogFactory.getLog(JsonContent.class);

    private final byte[] rawContent;
    private final JsonNode jsonNode;

    /**
     * Static factory method to create a JsonContent object from the contents of the HttpResponse
     * provided
     */
    public static JsonContent createJsonContent(HttpResponse httpResponse,
                                                JsonFactory jsonFactory) {
        byte[] rawJsonContent = null;
        try {
            if (httpResponse.getContent() != null) {
                rawJsonContent = IOUtils.toByteArray(httpResponse.getContent());
            }
        } catch (Exception e) {
            LOG.info("Unable to read HTTP response content", e);
        }
        return new JsonContent(rawJsonContent, new ObjectMapper(jsonFactory)
                .configure(JsonParser.Feature.ALLOW_COMMENTS, true));
    }

    private JsonContent(byte[] rawJsonContent, ObjectMapper mapper) {
        this.rawContent = rawJsonContent;
        this.jsonNode = parseJsonContent(rawJsonContent, mapper);
    }

    private static JsonNode parseJsonContent(byte[] rawJsonContent, ObjectMapper mapper) {
        if (rawJsonContent == null) {
            return null;
        }
        try {
            return mapper.readTree(rawJsonContent);
        } catch (Exception e) {
            LOG.info("Unable to parse HTTP response content", e);
            return mapper.createObjectNode();
        }
    }

    public byte[] getRawContent() {
        return rawContent;
    }

    public JsonNode getJsonNode() {
        return jsonNode;
    }
}

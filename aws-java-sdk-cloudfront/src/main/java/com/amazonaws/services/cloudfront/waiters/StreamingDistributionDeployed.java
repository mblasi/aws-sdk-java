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

package com.amazonaws.services.cloudfront.waiters;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.waiters.WaiterAcceptor;
import com.amazonaws.waiters.WaiterState;
import com.amazonaws.waiters.AcceptorPathMatcher;
import com.amazonaws.services.cloudfront.model.*;

import com.fasterxml.jackson.databind.JsonNode;

import com.amazonaws.jmespath.*;

import java.io.IOException;

@SdkInternalApi
class StreamingDistributionDeployed {

    static class IsDeployedMatcher extends
            WaiterAcceptor<GetStreamingDistributionResult> {
        private static final JsonNode expectedResult;

        static {
            try {
                expectedResult = ObjectMapperSingleton.getObjectMapper()
                        .readTree("\"Deployed\"");
            } catch (IOException ioe) {
                throw new RuntimeException(ioe);
            }
        }

        private static final JmesPathExpression ast = new JmesPathSubExpression(
                new JmesPathField("StreamingDistribution"), new JmesPathField(
                        "Status"));

        /**
         * Takes the result and determines whether the state of the resource
         * matches the expected state. To determine the current state of the
         * resource, JmesPath expression is evaluated and compared against the
         * expected result.
         * 
         * @param result
         *        Corresponding result of the operation
         * @return True if current state of the resource matches the expected
         *         state, False otherwise
         */
        @Override
        public boolean matches(GetStreamingDistributionResult result) {
            JsonNode queryNode = ObjectMapperSingleton.getObjectMapper()
                    .valueToTree(result);
            JsonNode finalResult = ast.accept(new JmesPathEvaluationVisitor(),
                    queryNode);
            return AcceptorPathMatcher.path(expectedResult, finalResult);
        }

        /**
         * Represents the current waiter state in the case where resource state
         * matches the expected state
         * 
         * @return Corresponding state of the waiter
         */
        @Override
        public WaiterState getState() {
            return WaiterState.SUCCESS;
        }
    }
}

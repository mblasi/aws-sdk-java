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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents a request to return the details of a receipt rule set. You use
 * receipt rule sets to receive email with Amazon SES. For more information, see
 * the <a href=
 * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
 * >Amazon SES Developer Guide</a>.
 * </p>
 */
public class DescribeReceiptRuleSetRequest extends
        com.amazonaws.AmazonWebServiceRequest implements Serializable,
        Cloneable {

    /**
     * <p>
     * The name of the receipt rule set to describe.
     * </p>
     */
    private String ruleSetName;

    /**
     * <p>
     * The name of the receipt rule set to describe.
     * </p>
     * 
     * @param ruleSetName
     *        The name of the receipt rule set to describe.
     */

    public void setRuleSetName(String ruleSetName) {
        this.ruleSetName = ruleSetName;
    }

    /**
     * <p>
     * The name of the receipt rule set to describe.
     * </p>
     * 
     * @return The name of the receipt rule set to describe.
     */

    public String getRuleSetName() {
        return this.ruleSetName;
    }

    /**
     * <p>
     * The name of the receipt rule set to describe.
     * </p>
     * 
     * @param ruleSetName
     *        The name of the receipt rule set to describe.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeReceiptRuleSetRequest withRuleSetName(String ruleSetName) {
        setRuleSetName(ruleSetName);
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
        if (getRuleSetName() != null)
            sb.append("RuleSetName: " + getRuleSetName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReceiptRuleSetRequest == false)
            return false;
        DescribeReceiptRuleSetRequest other = (DescribeReceiptRuleSetRequest) obj;
        if (other.getRuleSetName() == null ^ this.getRuleSetName() == null)
            return false;
        if (other.getRuleSetName() != null
                && other.getRuleSetName().equals(this.getRuleSetName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getRuleSetName() == null) ? 0 : getRuleSetName().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReceiptRuleSetRequest clone() {
        return (DescribeReceiptRuleSetRequest) super.clone();
    }
}

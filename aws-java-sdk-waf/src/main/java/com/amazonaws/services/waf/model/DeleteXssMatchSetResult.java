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
package com.amazonaws.services.waf.model;

import java.io.Serializable;

/**
 * <p>
 * The response to a request to delete an <a>XssMatchSet</a> from AWS WAF.
 * </p>
 */
public class DeleteXssMatchSetResult extends
        com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata>
        implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>ChangeToken</code> that you used to submit the
     * <code>DeleteXssMatchSet</code> request. You can also use this value to
     * query the status of the request. For more information, see
     * <a>GetChangeTokenStatus</a>.
     * </p>
     */
    private String changeToken;

    /**
     * <p>
     * The <code>ChangeToken</code> that you used to submit the
     * <code>DeleteXssMatchSet</code> request. You can also use this value to
     * query the status of the request. For more information, see
     * <a>GetChangeTokenStatus</a>.
     * </p>
     * 
     * @param changeToken
     *        The <code>ChangeToken</code> that you used to submit the
     *        <code>DeleteXssMatchSet</code> request. You can also use this
     *        value to query the status of the request. For more information,
     *        see <a>GetChangeTokenStatus</a>.
     */

    public void setChangeToken(String changeToken) {
        this.changeToken = changeToken;
    }

    /**
     * <p>
     * The <code>ChangeToken</code> that you used to submit the
     * <code>DeleteXssMatchSet</code> request. You can also use this value to
     * query the status of the request. For more information, see
     * <a>GetChangeTokenStatus</a>.
     * </p>
     * 
     * @return The <code>ChangeToken</code> that you used to submit the
     *         <code>DeleteXssMatchSet</code> request. You can also use this
     *         value to query the status of the request. For more information,
     *         see <a>GetChangeTokenStatus</a>.
     */

    public String getChangeToken() {
        return this.changeToken;
    }

    /**
     * <p>
     * The <code>ChangeToken</code> that you used to submit the
     * <code>DeleteXssMatchSet</code> request. You can also use this value to
     * query the status of the request. For more information, see
     * <a>GetChangeTokenStatus</a>.
     * </p>
     * 
     * @param changeToken
     *        The <code>ChangeToken</code> that you used to submit the
     *        <code>DeleteXssMatchSet</code> request. You can also use this
     *        value to query the status of the request. For more information,
     *        see <a>GetChangeTokenStatus</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeleteXssMatchSetResult withChangeToken(String changeToken) {
        setChangeToken(changeToken);
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
        if (getChangeToken() != null)
            sb.append("ChangeToken: " + getChangeToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteXssMatchSetResult == false)
            return false;
        DeleteXssMatchSetResult other = (DeleteXssMatchSetResult) obj;
        if (other.getChangeToken() == null ^ this.getChangeToken() == null)
            return false;
        if (other.getChangeToken() != null
                && other.getChangeToken().equals(this.getChangeToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getChangeToken() == null) ? 0 : getChangeToken().hashCode());
        return hashCode;
    }

    @Override
    public DeleteXssMatchSetResult clone() {
        try {
            return (DeleteXssMatchSetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

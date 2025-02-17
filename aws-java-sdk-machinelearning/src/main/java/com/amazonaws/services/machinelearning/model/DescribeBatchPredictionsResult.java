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
package com.amazonaws.services.machinelearning.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the output of a <code>DescribeBatchPredictions</code> operation.
 * The content is essentially a list of <code>BatchPrediction</code>s.
 * </p>
 */
public class DescribeBatchPredictionsResult extends
        com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata>
        implements Serializable, Cloneable {

    /**
     * <p>
     * A list of <code>BatchPrediction</code> objects that meet the search
     * criteria.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<BatchPrediction> results;
    /**
     * <p>
     * The ID of the next page in the paginated results that indicates at least
     * one more page follows.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of <code>BatchPrediction</code> objects that meet the search
     * criteria.
     * </p>
     * 
     * @return A list of <code>BatchPrediction</code> objects that meet the
     *         search criteria.
     */

    public java.util.List<BatchPrediction> getResults() {
        if (results == null) {
            results = new com.amazonaws.internal.SdkInternalList<BatchPrediction>();
        }
        return results;
    }

    /**
     * <p>
     * A list of <code>BatchPrediction</code> objects that meet the search
     * criteria.
     * </p>
     * 
     * @param results
     *        A list of <code>BatchPrediction</code> objects that meet the
     *        search criteria.
     */

    public void setResults(java.util.Collection<BatchPrediction> results) {
        if (results == null) {
            this.results = null;
            return;
        }

        this.results = new com.amazonaws.internal.SdkInternalList<BatchPrediction>(
                results);
    }

    /**
     * <p>
     * A list of <code>BatchPrediction</code> objects that meet the search
     * criteria.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setResults(java.util.Collection)} or
     * {@link #withResults(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param results
     *        A list of <code>BatchPrediction</code> objects that meet the
     *        search criteria.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeBatchPredictionsResult withResults(
            BatchPrediction... results) {
        if (this.results == null) {
            setResults(new com.amazonaws.internal.SdkInternalList<BatchPrediction>(
                    results.length));
        }
        for (BatchPrediction ele : results) {
            this.results.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>BatchPrediction</code> objects that meet the search
     * criteria.
     * </p>
     * 
     * @param results
     *        A list of <code>BatchPrediction</code> objects that meet the
     *        search criteria.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeBatchPredictionsResult withResults(
            java.util.Collection<BatchPrediction> results) {
        setResults(results);
        return this;
    }

    /**
     * <p>
     * The ID of the next page in the paginated results that indicates at least
     * one more page follows.
     * </p>
     * 
     * @param nextToken
     *        The ID of the next page in the paginated results that indicates at
     *        least one more page follows.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The ID of the next page in the paginated results that indicates at least
     * one more page follows.
     * </p>
     * 
     * @return The ID of the next page in the paginated results that indicates
     *         at least one more page follows.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The ID of the next page in the paginated results that indicates at least
     * one more page follows.
     * </p>
     * 
     * @param nextToken
     *        The ID of the next page in the paginated results that indicates at
     *        least one more page follows.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeBatchPredictionsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getResults() != null)
            sb.append("Results: " + getResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeBatchPredictionsResult == false)
            return false;
        DescribeBatchPredictionsResult other = (DescribeBatchPredictionsResult) obj;
        if (other.getResults() == null ^ this.getResults() == null)
            return false;
        if (other.getResults() != null
                && other.getResults().equals(this.getResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResults() == null) ? 0 : getResults().hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeBatchPredictionsResult clone() {
        try {
            return (DescribeBatchPredictionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceResult;

/**
 * <p>
 * Contains the output of CreateSpotDatafeedSubscription.
 * </p>
 */
public class CreateSpotDatafeedSubscriptionResult extends
        com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata>
        implements Serializable, Cloneable {

    /**
     * <p>
     * The Spot instance data feed subscription.
     * </p>
     */
    private SpotDatafeedSubscription spotDatafeedSubscription;

    /**
     * <p>
     * The Spot instance data feed subscription.
     * </p>
     * 
     * @param spotDatafeedSubscription
     *        The Spot instance data feed subscription.
     */

    public void setSpotDatafeedSubscription(
            SpotDatafeedSubscription spotDatafeedSubscription) {
        this.spotDatafeedSubscription = spotDatafeedSubscription;
    }

    /**
     * <p>
     * The Spot instance data feed subscription.
     * </p>
     * 
     * @return The Spot instance data feed subscription.
     */

    public SpotDatafeedSubscription getSpotDatafeedSubscription() {
        return this.spotDatafeedSubscription;
    }

    /**
     * <p>
     * The Spot instance data feed subscription.
     * </p>
     * 
     * @param spotDatafeedSubscription
     *        The Spot instance data feed subscription.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateSpotDatafeedSubscriptionResult withSpotDatafeedSubscription(
            SpotDatafeedSubscription spotDatafeedSubscription) {
        setSpotDatafeedSubscription(spotDatafeedSubscription);
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
        if (getSpotDatafeedSubscription() != null)
            sb.append("SpotDatafeedSubscription: "
                    + getSpotDatafeedSubscription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSpotDatafeedSubscriptionResult == false)
            return false;
        CreateSpotDatafeedSubscriptionResult other = (CreateSpotDatafeedSubscriptionResult) obj;
        if (other.getSpotDatafeedSubscription() == null
                ^ this.getSpotDatafeedSubscription() == null)
            return false;
        if (other.getSpotDatafeedSubscription() != null
                && other.getSpotDatafeedSubscription().equals(
                        this.getSpotDatafeedSubscription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getSpotDatafeedSubscription() == null) ? 0
                        : getSpotDatafeedSubscription().hashCode());
        return hashCode;
    }

    @Override
    public CreateSpotDatafeedSubscriptionResult clone() {
        try {
            return (CreateSpotDatafeedSubscriptionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

/**
 * <p>
 * Indicates if the specified CNAME is available.
 * </p>
 */
public class CheckDNSAvailabilityResult extends
        com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata>
        implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates if the specified CNAME is available:
     * </p>
     * <ul>
     * <li> <code>true</code> : The CNAME is available.</li>
     * <li> <code>false</code> : The CNAME is not available.</li>
     * </ul>
     */
    private Boolean available;
    /**
     * <p>
     * The fully qualified CNAME to reserve when <a>CreateEnvironment</a> is
     * called with the provided prefix.
     * </p>
     */
    private String fullyQualifiedCNAME;

    /**
     * <p>
     * Indicates if the specified CNAME is available:
     * </p>
     * <ul>
     * <li> <code>true</code> : The CNAME is available.</li>
     * <li> <code>false</code> : The CNAME is not available.</li>
     * </ul>
     * 
     * @param available
     *        Indicates if the specified CNAME is available: </p>
     *        <ul>
     *        <li> <code>true</code> : The CNAME is available.</li>
     *        <li> <code>false</code> : The CNAME is not available.</li>
     */

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    /**
     * <p>
     * Indicates if the specified CNAME is available:
     * </p>
     * <ul>
     * <li> <code>true</code> : The CNAME is available.</li>
     * <li> <code>false</code> : The CNAME is not available.</li>
     * </ul>
     * 
     * @return Indicates if the specified CNAME is available: </p>
     *         <ul>
     *         <li> <code>true</code> : The CNAME is available.</li>
     *         <li> <code>false</code> : The CNAME is not available.</li>
     */

    public Boolean getAvailable() {
        return this.available;
    }

    /**
     * <p>
     * Indicates if the specified CNAME is available:
     * </p>
     * <ul>
     * <li> <code>true</code> : The CNAME is available.</li>
     * <li> <code>false</code> : The CNAME is not available.</li>
     * </ul>
     * 
     * @param available
     *        Indicates if the specified CNAME is available: </p>
     *        <ul>
     *        <li> <code>true</code> : The CNAME is available.</li>
     *        <li> <code>false</code> : The CNAME is not available.</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CheckDNSAvailabilityResult withAvailable(Boolean available) {
        setAvailable(available);
        return this;
    }

    /**
     * <p>
     * Indicates if the specified CNAME is available:
     * </p>
     * <ul>
     * <li> <code>true</code> : The CNAME is available.</li>
     * <li> <code>false</code> : The CNAME is not available.</li>
     * </ul>
     * 
     * @return Indicates if the specified CNAME is available: </p>
     *         <ul>
     *         <li> <code>true</code> : The CNAME is available.</li>
     *         <li> <code>false</code> : The CNAME is not available.</li>
     */

    public Boolean isAvailable() {
        return this.available;
    }

    /**
     * <p>
     * The fully qualified CNAME to reserve when <a>CreateEnvironment</a> is
     * called with the provided prefix.
     * </p>
     * 
     * @param fullyQualifiedCNAME
     *        The fully qualified CNAME to reserve when <a>CreateEnvironment</a>
     *        is called with the provided prefix.
     */

    public void setFullyQualifiedCNAME(String fullyQualifiedCNAME) {
        this.fullyQualifiedCNAME = fullyQualifiedCNAME;
    }

    /**
     * <p>
     * The fully qualified CNAME to reserve when <a>CreateEnvironment</a> is
     * called with the provided prefix.
     * </p>
     * 
     * @return The fully qualified CNAME to reserve when
     *         <a>CreateEnvironment</a> is called with the provided prefix.
     */

    public String getFullyQualifiedCNAME() {
        return this.fullyQualifiedCNAME;
    }

    /**
     * <p>
     * The fully qualified CNAME to reserve when <a>CreateEnvironment</a> is
     * called with the provided prefix.
     * </p>
     * 
     * @param fullyQualifiedCNAME
     *        The fully qualified CNAME to reserve when <a>CreateEnvironment</a>
     *        is called with the provided prefix.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CheckDNSAvailabilityResult withFullyQualifiedCNAME(
            String fullyQualifiedCNAME) {
        setFullyQualifiedCNAME(fullyQualifiedCNAME);
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
        if (getAvailable() != null)
            sb.append("Available: " + getAvailable() + ",");
        if (getFullyQualifiedCNAME() != null)
            sb.append("FullyQualifiedCNAME: " + getFullyQualifiedCNAME());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CheckDNSAvailabilityResult == false)
            return false;
        CheckDNSAvailabilityResult other = (CheckDNSAvailabilityResult) obj;
        if (other.getAvailable() == null ^ this.getAvailable() == null)
            return false;
        if (other.getAvailable() != null
                && other.getAvailable().equals(this.getAvailable()) == false)
            return false;
        if (other.getFullyQualifiedCNAME() == null
                ^ this.getFullyQualifiedCNAME() == null)
            return false;
        if (other.getFullyQualifiedCNAME() != null
                && other.getFullyQualifiedCNAME().equals(
                        this.getFullyQualifiedCNAME()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAvailable() == null) ? 0 : getAvailable().hashCode());
        hashCode = prime
                * hashCode
                + ((getFullyQualifiedCNAME() == null) ? 0
                        : getFullyQualifiedCNAME().hashCode());
        return hashCode;
    }

    @Override
    public CheckDNSAvailabilityResult clone() {
        try {
            return (CheckDNSAvailabilityResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

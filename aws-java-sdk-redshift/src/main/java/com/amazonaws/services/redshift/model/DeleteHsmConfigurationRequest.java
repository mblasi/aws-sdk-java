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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 */
public class DeleteHsmConfigurationRequest extends
        com.amazonaws.AmazonWebServiceRequest implements Serializable,
        Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Redshift HSM configuration to be deleted.
     * </p>
     */
    private String hsmConfigurationIdentifier;

    /**
     * <p>
     * The identifier of the Amazon Redshift HSM configuration to be deleted.
     * </p>
     * 
     * @param hsmConfigurationIdentifier
     *        The identifier of the Amazon Redshift HSM configuration to be
     *        deleted.
     */

    public void setHsmConfigurationIdentifier(String hsmConfigurationIdentifier) {
        this.hsmConfigurationIdentifier = hsmConfigurationIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon Redshift HSM configuration to be deleted.
     * </p>
     * 
     * @return The identifier of the Amazon Redshift HSM configuration to be
     *         deleted.
     */

    public String getHsmConfigurationIdentifier() {
        return this.hsmConfigurationIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon Redshift HSM configuration to be deleted.
     * </p>
     * 
     * @param hsmConfigurationIdentifier
     *        The identifier of the Amazon Redshift HSM configuration to be
     *        deleted.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeleteHsmConfigurationRequest withHsmConfigurationIdentifier(
            String hsmConfigurationIdentifier) {
        setHsmConfigurationIdentifier(hsmConfigurationIdentifier);
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
        if (getHsmConfigurationIdentifier() != null)
            sb.append("HsmConfigurationIdentifier: "
                    + getHsmConfigurationIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteHsmConfigurationRequest == false)
            return false;
        DeleteHsmConfigurationRequest other = (DeleteHsmConfigurationRequest) obj;
        if (other.getHsmConfigurationIdentifier() == null
                ^ this.getHsmConfigurationIdentifier() == null)
            return false;
        if (other.getHsmConfigurationIdentifier() != null
                && other.getHsmConfigurationIdentifier().equals(
                        this.getHsmConfigurationIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getHsmConfigurationIdentifier() == null) ? 0
                        : getHsmConfigurationIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public DeleteHsmConfigurationRequest clone() {
        return (DeleteHsmConfigurationRequest) super.clone();
    }
}

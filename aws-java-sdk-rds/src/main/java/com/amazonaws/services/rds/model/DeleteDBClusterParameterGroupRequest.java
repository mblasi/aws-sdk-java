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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 */
public class DeleteDBClusterParameterGroupRequest extends
        com.amazonaws.AmazonWebServiceRequest implements Serializable,
        Cloneable {

    /**
     * <p>
     * The name of the DB cluster parameter group.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be the name of an existing DB cluster parameter group.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot delete a default DB cluster parameter group.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be associated with any DB clusters.
     * </p>
     * </li>
     * </ul>
     */
    private String dBClusterParameterGroupName;

    /**
     * <p>
     * The name of the DB cluster parameter group.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be the name of an existing DB cluster parameter group.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot delete a default DB cluster parameter group.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be associated with any DB clusters.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBClusterParameterGroupName
     *        The name of the DB cluster parameter group.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be the name of an existing DB cluster parameter group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You cannot delete a default DB cluster parameter group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be associated with any DB clusters.
     *        </p>
     *        </li>
     */

    public void setDBClusterParameterGroupName(
            String dBClusterParameterGroupName) {
        this.dBClusterParameterGroupName = dBClusterParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB cluster parameter group.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be the name of an existing DB cluster parameter group.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot delete a default DB cluster parameter group.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be associated with any DB clusters.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the DB cluster parameter group.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be the name of an existing DB cluster parameter group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You cannot delete a default DB cluster parameter group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot be associated with any DB clusters.
     *         </p>
     *         </li>
     */

    public String getDBClusterParameterGroupName() {
        return this.dBClusterParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB cluster parameter group.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be the name of an existing DB cluster parameter group.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot delete a default DB cluster parameter group.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be associated with any DB clusters.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBClusterParameterGroupName
     *        The name of the DB cluster parameter group.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be the name of an existing DB cluster parameter group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You cannot delete a default DB cluster parameter group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be associated with any DB clusters.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeleteDBClusterParameterGroupRequest withDBClusterParameterGroupName(
            String dBClusterParameterGroupName) {
        setDBClusterParameterGroupName(dBClusterParameterGroupName);
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
        if (getDBClusterParameterGroupName() != null)
            sb.append("DBClusterParameterGroupName: "
                    + getDBClusterParameterGroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDBClusterParameterGroupRequest == false)
            return false;
        DeleteDBClusterParameterGroupRequest other = (DeleteDBClusterParameterGroupRequest) obj;
        if (other.getDBClusterParameterGroupName() == null
                ^ this.getDBClusterParameterGroupName() == null)
            return false;
        if (other.getDBClusterParameterGroupName() != null
                && other.getDBClusterParameterGroupName().equals(
                        this.getDBClusterParameterGroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDBClusterParameterGroupName() == null) ? 0
                        : getDBClusterParameterGroupName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteDBClusterParameterGroupRequest clone() {
        return (DeleteDBClusterParameterGroupRequest) super.clone();
    }
}

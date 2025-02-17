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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the server response from a request to create a remote access
 * session.
 * </p>
 */
public class CreateRemoteAccessSessionResult extends
        com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata>
        implements Serializable, Cloneable {

    /**
     * <p>
     * A container that describes the remote access session when the request to
     * create a remote access session is sent.
     * </p>
     */
    private RemoteAccessSession remoteAccessSession;

    /**
     * <p>
     * A container that describes the remote access session when the request to
     * create a remote access session is sent.
     * </p>
     * 
     * @param remoteAccessSession
     *        A container that describes the remote access session when the
     *        request to create a remote access session is sent.
     */

    public void setRemoteAccessSession(RemoteAccessSession remoteAccessSession) {
        this.remoteAccessSession = remoteAccessSession;
    }

    /**
     * <p>
     * A container that describes the remote access session when the request to
     * create a remote access session is sent.
     * </p>
     * 
     * @return A container that describes the remote access session when the
     *         request to create a remote access session is sent.
     */

    public RemoteAccessSession getRemoteAccessSession() {
        return this.remoteAccessSession;
    }

    /**
     * <p>
     * A container that describes the remote access session when the request to
     * create a remote access session is sent.
     * </p>
     * 
     * @param remoteAccessSession
     *        A container that describes the remote access session when the
     *        request to create a remote access session is sent.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateRemoteAccessSessionResult withRemoteAccessSession(
            RemoteAccessSession remoteAccessSession) {
        setRemoteAccessSession(remoteAccessSession);
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
        if (getRemoteAccessSession() != null)
            sb.append("RemoteAccessSession: " + getRemoteAccessSession());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRemoteAccessSessionResult == false)
            return false;
        CreateRemoteAccessSessionResult other = (CreateRemoteAccessSessionResult) obj;
        if (other.getRemoteAccessSession() == null
                ^ this.getRemoteAccessSession() == null)
            return false;
        if (other.getRemoteAccessSession() != null
                && other.getRemoteAccessSession().equals(
                        this.getRemoteAccessSession()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getRemoteAccessSession() == null) ? 0
                        : getRemoteAccessSession().hashCode());
        return hashCode;
    }

    @Override
    public CreateRemoteAccessSessionResult clone() {
        try {
            return (CreateRemoteAccessSessionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

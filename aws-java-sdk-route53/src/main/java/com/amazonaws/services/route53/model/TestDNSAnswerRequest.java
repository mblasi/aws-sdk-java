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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets the value that Amazon Route 53 returns in response to a DNS request for
 * a specified record name and type. You can optionally specify the IP address
 * of a DNS resolver, an EDNS0 client subnet IP address, and a subnet mask.
 * </p>
 * <p>
 * <b>Parameters</b>
 * </p>
 * <dl>
 * <dt>hostedzoneid</dt>
 * <dd>
 * <p>
 * The ID of the hosted zone that you want Amazon Route 53 to simulate a query
 * for.
 * </p>
 * </dd>
 * <dt>recordname</dt>
 * <dd>
 * <p>
 * The name of the resource record set that you want Amazon Route 53 to simulate
 * a query for.
 * </p>
 * </dd>
 * <dt>recordtype</dt>
 * <dd>
 * <p>
 * The type of the resource record set.
 * </p>
 * </dd>
 * <dt>resolverip (optional)</dt>
 * <dd>
 * <p>
 * If you want to simulate a request from a specific DNS resolver, specify the
 * IP address for that resolver. If you omit this value,
 * <code>TestDNSAnswer</code> uses the IP address of a DNS resolver in the AWS
 * US East region.
 * </p>
 * </dd>
 * <dt>edns0clientsubnetip (optional)</dt>
 * <dd>
 * <p>
 * If the resolver that you specified for <code>resolverip</code> supports
 * EDNS0, specify the IP address of a client in the applicable location.
 * </p>
 * </dd>
 * <dt>edns0clientsubnetmask (optional)</dt>
 * <dd>
 * <p>
 * If you specify an IP address for <code>edns0clientsubnetip</code>, you can
 * optionally specify the number of bits of the IP address that you want the
 * checking tool to include in the DNS query. For example, if you specify
 * <code>192.0.2.44</code> for <code>edns0clientsubnetip</code> and
 * <code>24</code> for <code>edns0clientsubnetmask</code>, the checking tool
 * will simulate a request from <code>192.0.2.0/24</code>. The default value is
 * 24 bits.
 * </p>
 * </dd>
 * </dl>
 */
public class TestDNSAnswerRequest extends com.amazonaws.AmazonWebServiceRequest
        implements Serializable, Cloneable {

    private String hostedZoneId;

    private String recordName;

    private String recordType;

    private String resolverIP;

    private String eDNS0ClientSubnetIP;

    private String eDNS0ClientSubnetMask;

    /**
     * @param hostedZoneId
     */

    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    /**
     * @return
     */

    public String getHostedZoneId() {
        return this.hostedZoneId;
    }

    /**
     * @param hostedZoneId
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public TestDNSAnswerRequest withHostedZoneId(String hostedZoneId) {
        setHostedZoneId(hostedZoneId);
        return this;
    }

    /**
     * @param recordName
     */

    public void setRecordName(String recordName) {
        this.recordName = recordName;
    }

    /**
     * @return
     */

    public String getRecordName() {
        return this.recordName;
    }

    /**
     * @param recordName
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public TestDNSAnswerRequest withRecordName(String recordName) {
        setRecordName(recordName);
        return this;
    }

    /**
     * @param recordType
     * @see RRType
     */

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    /**
     * @return
     * @see RRType
     */

    public String getRecordType() {
        return this.recordType;
    }

    /**
     * @param recordType
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see RRType
     */

    public TestDNSAnswerRequest withRecordType(String recordType) {
        setRecordType(recordType);
        return this;
    }

    /**
     * @param recordType
     * @see RRType
     */

    public void setRecordType(RRType recordType) {
        this.recordType = recordType.toString();
    }

    /**
     * @param recordType
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see RRType
     */

    public TestDNSAnswerRequest withRecordType(RRType recordType) {
        setRecordType(recordType);
        return this;
    }

    /**
     * @param resolverIP
     */

    public void setResolverIP(String resolverIP) {
        this.resolverIP = resolverIP;
    }

    /**
     * @return
     */

    public String getResolverIP() {
        return this.resolverIP;
    }

    /**
     * @param resolverIP
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public TestDNSAnswerRequest withResolverIP(String resolverIP) {
        setResolverIP(resolverIP);
        return this;
    }

    /**
     * @param eDNS0ClientSubnetIP
     */

    public void setEDNS0ClientSubnetIP(String eDNS0ClientSubnetIP) {
        this.eDNS0ClientSubnetIP = eDNS0ClientSubnetIP;
    }

    /**
     * @return
     */

    public String getEDNS0ClientSubnetIP() {
        return this.eDNS0ClientSubnetIP;
    }

    /**
     * @param eDNS0ClientSubnetIP
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public TestDNSAnswerRequest withEDNS0ClientSubnetIP(
            String eDNS0ClientSubnetIP) {
        setEDNS0ClientSubnetIP(eDNS0ClientSubnetIP);
        return this;
    }

    /**
     * @param eDNS0ClientSubnetMask
     */

    public void setEDNS0ClientSubnetMask(String eDNS0ClientSubnetMask) {
        this.eDNS0ClientSubnetMask = eDNS0ClientSubnetMask;
    }

    /**
     * @return
     */

    public String getEDNS0ClientSubnetMask() {
        return this.eDNS0ClientSubnetMask;
    }

    /**
     * @param eDNS0ClientSubnetMask
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public TestDNSAnswerRequest withEDNS0ClientSubnetMask(
            String eDNS0ClientSubnetMask) {
        setEDNS0ClientSubnetMask(eDNS0ClientSubnetMask);
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
        if (getHostedZoneId() != null)
            sb.append("HostedZoneId: " + getHostedZoneId() + ",");
        if (getRecordName() != null)
            sb.append("RecordName: " + getRecordName() + ",");
        if (getRecordType() != null)
            sb.append("RecordType: " + getRecordType() + ",");
        if (getResolverIP() != null)
            sb.append("ResolverIP: " + getResolverIP() + ",");
        if (getEDNS0ClientSubnetIP() != null)
            sb.append("EDNS0ClientSubnetIP: " + getEDNS0ClientSubnetIP() + ",");
        if (getEDNS0ClientSubnetMask() != null)
            sb.append("EDNS0ClientSubnetMask: " + getEDNS0ClientSubnetMask());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestDNSAnswerRequest == false)
            return false;
        TestDNSAnswerRequest other = (TestDNSAnswerRequest) obj;
        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null)
            return false;
        if (other.getHostedZoneId() != null
                && other.getHostedZoneId().equals(this.getHostedZoneId()) == false)
            return false;
        if (other.getRecordName() == null ^ this.getRecordName() == null)
            return false;
        if (other.getRecordName() != null
                && other.getRecordName().equals(this.getRecordName()) == false)
            return false;
        if (other.getRecordType() == null ^ this.getRecordType() == null)
            return false;
        if (other.getRecordType() != null
                && other.getRecordType().equals(this.getRecordType()) == false)
            return false;
        if (other.getResolverIP() == null ^ this.getResolverIP() == null)
            return false;
        if (other.getResolverIP() != null
                && other.getResolverIP().equals(this.getResolverIP()) == false)
            return false;
        if (other.getEDNS0ClientSubnetIP() == null
                ^ this.getEDNS0ClientSubnetIP() == null)
            return false;
        if (other.getEDNS0ClientSubnetIP() != null
                && other.getEDNS0ClientSubnetIP().equals(
                        this.getEDNS0ClientSubnetIP()) == false)
            return false;
        if (other.getEDNS0ClientSubnetMask() == null
                ^ this.getEDNS0ClientSubnetMask() == null)
            return false;
        if (other.getEDNS0ClientSubnetMask() != null
                && other.getEDNS0ClientSubnetMask().equals(
                        this.getEDNS0ClientSubnetMask()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getHostedZoneId() == null) ? 0 : getHostedZoneId()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getRecordName() == null) ? 0 : getRecordName().hashCode());
        hashCode = prime * hashCode
                + ((getRecordType() == null) ? 0 : getRecordType().hashCode());
        hashCode = prime * hashCode
                + ((getResolverIP() == null) ? 0 : getResolverIP().hashCode());
        hashCode = prime
                * hashCode
                + ((getEDNS0ClientSubnetIP() == null) ? 0
                        : getEDNS0ClientSubnetIP().hashCode());
        hashCode = prime
                * hashCode
                + ((getEDNS0ClientSubnetMask() == null) ? 0
                        : getEDNS0ClientSubnetMask().hashCode());
        return hashCode;
    }

    @Override
    public TestDNSAnswerRequest clone() {
        return (TestDNSAnswerRequest) super.clone();
    }
}

/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.activemq.transport.tcp;

import java.math.BigInteger;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Set;

public class StubX509Certificate extends X509Certificate {

    private final Principal id;

    public StubX509Certificate(Principal id) {
        this.id = id;
    }

    public Principal getSubjectDN() {
        return this.id;
    }

    // --- Stubbed Methods ---
    public void checkValidity() {
    }

    public void checkValidity(Date arg0) {
    }

    public int getVersion() {
        return 0;
    }

    public BigInteger getSerialNumber() {
        return null;
    }

    public Principal getIssuerDN() {
        return null;
    }

    public Date getNotBefore() {
        return null;
    }

    public Date getNotAfter() {
        return null;
    }

    public byte[] getTBSCertificate() {
        return null;
    }

    public byte[] getSignature() {
        return null;
    }

    public String getSigAlgName() {
        return null;
    }

    public String getSigAlgOID() {
        return null;
    }

    public byte[] getSigAlgParams() {
        return null;
    }

    public boolean[] getIssuerUniqueID() {
        return null;
    }

    public boolean[] getSubjectUniqueID() {
        return null;
    }

    public boolean[] getKeyUsage() {
        return null;
    }

    public int getBasicConstraints() {
        return 0;
    }

    public byte[] getEncoded() {
        return null;
    }

    public void verify(PublicKey arg0) {
    }

    public void verify(PublicKey arg0, String arg1) {
    }

    public String toString() {
        return null;
    }

    public PublicKey getPublicKey() {
        return null;
    }

    public boolean hasUnsupportedCriticalExtension() {
        return false;
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public Set getCriticalExtensionOIDs() {
        return null;
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public Set getNonCriticalExtensionOIDs() {
        return null;
    }

    public byte[] getExtensionValue(String arg0) {
        return null;
    }

}

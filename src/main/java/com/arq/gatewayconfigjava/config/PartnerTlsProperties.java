package com.arq.gatewayconfigjava.config;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public class PartnerTlsProperties {
    public HostnameVerifier hostnameVerifier() {
        return new HostnameVerifier() {
            @Override
            public boolean verify(String hostname, SSLSession session) {
                return true;
            }
        };
    }
}

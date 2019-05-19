package pl.allegro.tech.hermes.common.ssl;

import javax.net.ssl.SSLContext;
import javax.net.ssl.X509TrustManager;

public final class WrappedSSLContext {

    private final SSLContext sslContext;
    private final X509TrustManager trustManager;

    WrappedSSLContext(SSLContext sslContext, X509TrustManager trustManager) {
        this.sslContext = sslContext;
        this.trustManager = trustManager;
    }

    public SSLContext getSslContext() {
        return sslContext;
    }

    public X509TrustManager getTrustManager() {
        return trustManager;
    }
}

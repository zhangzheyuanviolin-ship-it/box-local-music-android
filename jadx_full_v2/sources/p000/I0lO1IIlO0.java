            package p000;

            import android.net.http.X509TrustManagerExtensions;
            import java.security.cert.CertificateException;
            import java.security.cert.X509Certificate;
            import java.util.List;
            import javax.net.ssl.SSLPeerUnverifiedException;
            import javax.net.ssl.X509TrustManager;
            
            public final class I0lO1IIlO0 extends iOl11OooolI0 {
                public X509TrustManager I00000oIO;
                public X509TrustManagerExtensions I00000oOI;

                @Override
                public final List I00000oIO(String str, List list) throws SSLPeerUnverifiedException {
                    try {
/* 16 */                return this.I00000oOI.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
                    } catch (CertificateException e) {
/* 28 */                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
/* 31 */                sSLPeerUnverifiedException.initCause(e);
/* 89 */                throw sSLPeerUnverifiedException;
                    }
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof I0lO1IIlO0) && ((I0lO1IIlO0) obj).I00000oIO == this.I00000oIO;
                }

                public final int hashCode() {
/* 3 */             return System.identityHashCode(this.I00000oIO);
                }
            }

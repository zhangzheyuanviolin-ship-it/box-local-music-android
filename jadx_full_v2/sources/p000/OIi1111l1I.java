            package p000;

            import java.security.KeyStore;
            import java.security.KeyStoreException;
            import java.security.NoSuchAlgorithmException;
            import java.security.Provider;
            import java.util.Arrays;
            import java.util.List;
            import javax.net.ssl.SSLContext;
            import javax.net.ssl.SSLSocket;
            import javax.net.ssl.TrustManager;
            import javax.net.ssl.TrustManagerFactory;
            import javax.net.ssl.X509TrustManager;
            import org.openjsse.net.ssl.OpenJSSE;
            
/* 213 */   public final class OIi1111l1I extends OO1I1IllO {
                public static final boolean I0000O;
                public final Provider I0000Il00O = new OpenJSSE();

                static {
/* 1 */             boolean z = false;
                    try {
/* 10 */                Class.forName("org.openjsse.net.ssl.OpenJSSE", false, OIi10iI0Iiii.class.getClassLoader());
/* 13 */                z = true;
                    } catch (ClassNotFoundException unused) {
                    }
/* 14 */            I0000O = z;
                }

                @Override
                public final String I0000O(SSLSocket sSLSocket) {
/* 1 */             return null;
                }

                @Override
                public final SSLContext I000II() {
/* 5 */             return SSLContext.getInstance("TLSv1.3", this.I0000Il00O);
                }

                @Override
                public final X509TrustManager I000OOo1O() throws NoSuchAlgorithmException, KeyStoreException {
/* 7 */             TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.I0000Il00O);
/* 12 */            trustManagerFactory.init((KeyStore) null);
/* 15 */            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
/* 21 */            if (trustManagers.length == 1) {
/* 24 */                TrustManager trustManager = trustManagers[0];
/* 28 */                if (trustManager instanceof X509TrustManager) {
/* 30 */                    return (X509TrustManager) trustManager;
                        }
                    }
/* 43 */            IOOlIIilOl0.I0000oI00("Unexpected default trust managers: ".concat(Arrays.toString(trustManagers)));
/* 11 */            return null;
                }

                @Override
/* 214 */       public final void I0000Il00O(SSLSocket sSLSocket, String str, List list) {
                }
            }

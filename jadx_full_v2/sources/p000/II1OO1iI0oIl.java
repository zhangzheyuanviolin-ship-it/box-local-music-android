            package p000;

            import java.security.KeyStore;
            import java.security.KeyStoreException;
            import java.security.NoSuchAlgorithmException;
            import java.security.NoSuchProviderException;
            import java.security.Provider;
            import java.util.Arrays;
            import java.util.List;
            import javax.net.ssl.SSLContext;
            import javax.net.ssl.SSLSocket;
            import javax.net.ssl.TrustManager;
            import javax.net.ssl.TrustManagerFactory;
            import javax.net.ssl.X509TrustManager;
            import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;
            
/* 213 */   public final class II1OO1iI0oIl extends OO1I1IllO {
                public static final boolean I0000O;
                public final Provider I0000Il00O = new BouncyCastleJsseProvider();

                static {
/* 1 */             boolean z = false;
                    try {
/* 10 */                Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, II1OO0Iii.class.getClassLoader());
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
/* 5 */             return SSLContext.getInstance("TLS", this.I0000Il00O);
                }

                @Override
                public final X509TrustManager I000OOo1O() throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException {
/* 5 */             TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
/* 10 */            trustManagerFactory.init((KeyStore) null);
/* 13 */            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
/* 19 */            if (trustManagers.length == 1) {
/* 22 */                TrustManager trustManager = trustManagers[0];
/* 26 */                if (trustManager instanceof X509TrustManager) {
/* 28 */                    return (X509TrustManager) trustManager;
                        }
                    }
/* 41 */            IOOlIIilOl0.I0000oI00("Unexpected default trust managers: ".concat(Arrays.toString(trustManagers)));
/* 9 */             return null;
                }

                @Override
/* 214 */       public final void I0000Il00O(SSLSocket sSLSocket, String str, List list) {
                }
            }

            package p000;

            import java.security.KeyManagementException;
            import java.security.KeyStore;
            import java.security.KeyStoreException;
            import java.security.NoSuchAlgorithmException;
            import java.security.Provider;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.List;
            import javax.net.ssl.SSLContext;
            import javax.net.ssl.SSLSocket;
            import javax.net.ssl.SSLSocketFactory;
            import javax.net.ssl.TrustManager;
            import javax.net.ssl.TrustManagerFactory;
            import javax.net.ssl.X509TrustManager;
            import org.conscrypt.Conscrypt;
            
            public final class IOo0O1l0 extends OO1I1IllO {
                public static final boolean I0000O;
                public final Provider I0000Il00O = Conscrypt.newProvider();

                static {
/* 1 */             boolean z = false;
                    try {
/* 10 */                Class.forName("org.conscrypt.Conscrypt$Version", false, IOo00I1IO.class.getClassLoader());
/* 17 */                if (Conscrypt.isAvailable()) {
/* 23 */                    if (IOo00I1IO.I00000oIO()) {
/* 25 */                        z = true;
                            }
                        }
                    } catch (ClassNotFoundException | NoClassDefFoundError unused) {
                    }
/* 26 */            I0000O = z;
                }

                @Override
                public final void I0000Il00O(SSLSocket sSLSocket, String str, List list) {
/* 5 */             if (Conscrypt.isConscrypt(sSLSocket)) {
/* 8 */                 Conscrypt.setUseSessionTickets(sSLSocket, true);
/* 15 */                ArrayList arrayList = new ArrayList();
/* 26 */                for (Object obj : list) {
/* 37 */                    if (((OOiIO0oi) obj) != OOiIO0oi.HTTP_1_0) {
/* 39 */                        arrayList.add(obj);
                            }
                        }
/* 51 */                ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(arrayList, 10));
/* 54 */                Iterator it = arrayList.iterator();
/* 62 */                while (it.hasNext()) {
/* 72 */                    arrayList2.add(((OOiIO0oi) it.next()).I00iOIl);
                        }
/* 85 */                Conscrypt.setApplicationProtocols(sSLSocket, (String[]) arrayList2.toArray(new String[0]));
                    }
                }

                @Override
                public final String I0000O(SSLSocket sSLSocket) {
/* 5 */             if (Conscrypt.isConscrypt(sSLSocket)) {
/* 7 */                 return Conscrypt.getApplicationProtocol(sSLSocket);
                    }
/* 12 */            return null;
                }

                @Override
                public final SSLContext I000II() {
/* 5 */             return SSLContext.getInstance("TLS", this.I0000Il00O);
                }

                @Override
                public final SSLSocketFactory I000O01llI0(X509TrustManager x509TrustManager) throws KeyManagementException {
/* 1 */             SSLContext sSLContextI000II = I000II();
/* 12 */            sSLContextI000II.init(null, new TrustManager[]{x509TrustManager}, null);
/* 15 */            return sSLContextI000II.getSocketFactory();
                }

                @Override
                public final X509TrustManager I000OOo1O() throws NoSuchAlgorithmException, KeyStoreException {
/* 5 */             TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
/* 10 */            trustManagerFactory.init((KeyStore) null);
/* 13 */            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
/* 19 */            if (trustManagers.length == 1) {
/* 22 */                TrustManager trustManager = trustManagers[0];
/* 26 */                if (trustManager instanceof X509TrustManager) {
/* 28 */                    X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
/* 34 */                    Conscrypt.setHostnameVerifier(x509TrustManager, IOo0IilIO.I00000oIO);
/* 37 */                    return x509TrustManager;
                        }
                    }
/* 48 */            IOOlIIilOl0.I0000oI00("Unexpected default trust managers: ".concat(Arrays.toString(trustManagers)));
/* 9 */             return null;
                }
            }

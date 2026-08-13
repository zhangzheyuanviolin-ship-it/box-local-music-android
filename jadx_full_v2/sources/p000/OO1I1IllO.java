            package p000;

            import android.util.Log;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Method;
            import java.security.GeneralSecurityException;
            import java.security.KeyStore;
            import java.security.Security;
            import java.security.cert.X509Certificate;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            import javax.net.ssl.SSLContext;
            import javax.net.ssl.SSLSocket;
            import javax.net.ssl.SSLSocketFactory;
            import javax.net.ssl.TrustManager;
            import javax.net.ssl.TrustManagerFactory;
            import javax.net.ssl.X509TrustManager;
            import javax.security.auth.x500.X500Principal;
            
/* 47 */    public class OO1I1IllO {
                public static volatile OO1I1IllO I00000oIO;
                public static final Logger I00000oOI;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:33:0x00c0 A[PHI: r0
                  0x00c0: PHI (r0v36 ??) = (r0v15 ??), (r0v18 ??), (r0v26 ??), (r0v30 ??), (r0v34 ??), (r0v45 ??) binds: [B:62:0x012e, B:74:0x0190, B:56:0x0120, B:48:0x0100, B:40:0x00e0, B:31:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:42:0x00e3  */
                /* JADX WARN: Removed duplicated region for block: B:50:0x0103  */
                /* JADX WARN: Removed duplicated region for block: B:58:0x0123  */
                /* JADX WARN: Type inference failed for: r0v14 */
                /* JADX WARN: Type inference failed for: r0v15 */
                /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r0v25 */
                /* JADX WARN: Type inference failed for: r0v26 */
                /* JADX WARN: Type inference failed for: r0v29 */
                /* JADX WARN: Type inference failed for: r0v30 */
                /* JADX WARN: Type inference failed for: r0v33 */
                /* JADX WARN: Type inference failed for: r0v34 */
                /* JADX WARN: Type inference failed for: r0v36 */
                /* JADX WARN: Type inference failed for: r0v44 */
                /* JADX WARN: Type inference failed for: r0v45 */
                /* JADX WARN: Type inference failed for: r0v48 */
                /* JADX WARN: Type inference failed for: r0v49 */
                /* JADX WARN: Type inference failed for: r0v50 */
                /* JADX WARN: Type inference failed for: r0v51 */
                /* JADX WARN: Type inference failed for: r0v52 */
                static {
                    ?? o010oi1;
/* 7 */             O010OI o010oi = null;
/* 8 */             if (lI0lo10I01i1.I0000Il00O()) {
/* 26 */                for (Map.Entry entry : I0oOl1II.I00000oOI.entrySet()) {
/* 38 */                    String str = (String) entry.getKey();
/* 44 */                    String str2 = (String) entry.getValue();
/* 46 */                    Logger logger = Logger.getLogger(str);
/* 56 */                    if (I0oOl1II.I00000oIO.add(logger)) {
/* 58 */                        logger.setUseParentHandlers(false);
/* 81 */                        logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
/* 86 */                        logger.addHandler(I0oOll1o.I00000oIO);
                            }
                        }
/* 92 */                if (I0l1loloo.I0000O) {
/* 96 */                    I0l1loloo i0l1loloo = new I0l1loloo();
/* 144 */                   ArrayList arrayListI001IIilI0O = I1IoiO1l.I001IIilI0O(new Ol1olOoi[]{lI0lo10I01i1.I0000Il00O() ? new I0l1o1I0iOo() : null, new IiIOl1iI00(I1001I.I0001Ioi1lo), new IiIOl1iI00(IOo0Ol1O0IiO.I00000oIO), new IiIOl1iI00(II1Olilliloi.I00000oIO)});
/* 150 */                   ArrayList arrayList = new ArrayList();
/* 153 */                   Iterator it = arrayListI001IIilI0O.iterator();
/* 161 */                   while (it.hasNext()) {
/* 163 */                       Object next = it.next();
/* 174 */                       if (((Ol1olOoi) next).I00000oIO()) {
/* 176 */                           arrayList.add(next);
                                }
                            }
/* 180 */                   i0l1loloo.I0000Il00O = arrayList;
/* 182 */                   VarHandle.storeStoreFence();
                            o010oi1 = i0l1loloo;
                        } else {
/* 186 */                   o010oi1 = 0;
                        }
/* 187 */               if (o010oi1 == 0) {
/* 189 */                   int i = I0olIlOIl1.I0000Il00O;
                        } else {
/* 193 */                   o010oi = o010oi1;
                        }
                    } else if ("Conscrypt".equals(Security.getProviders()[0].getName())) {
/* 224 */               o010oi1 = IOo0O1l0.I0000O ? new IOo0O1l0() : 0;
/* 225 */               if (o010oi1 != 0) {
                        }
                    } else if ("BC".equals(Security.getProviders()[0].getName())) {
/* 256 */               o010oi1 = II1OO1iI0oIl.I0000O ? new II1OO1iI0oIl() : 0;
/* 257 */               if (o010oi1 != 0) {
                        }
                    } else if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
/* 288 */               o010oi1 = OIi1111l1I.I0000O ? new OIi1111l1I() : 0;
/* 289 */               if (o010oi1 != 0) {
                        }
                    } else {
/* 302 */               o010oi1 = O010OI1.I0000Il00O ? new O010OI1() : 0;
/* 303 */               if (o010oi1 == 0) {
/* 320 */                   if (Integer.parseInt(System.getProperty("java.specification.version", "unknown")) < 9) {
                                try {
/* 325 */                           Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
/* 331 */                           Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
/* 337 */                           Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
/* 343 */                           Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
/* 355 */                           Method method = cls.getMethod("put", SSLSocket.class, cls2);
/* 365 */                           Method method2 = cls.getMethod("get", SSLSocket.class);
/* 375 */                           Method method3 = cls.getMethod("remove", SSLSocket.class);
/* 381 */                           O010OI o010oi2 = new O010OI();
/* 384 */                           o010oi2.I0000Il00O = method;
/* 386 */                           o010oi2.I0000O = method2;
/* 388 */                           o010oi2.I0000oI00 = method3;
/* 390 */                           o010oi2.I0001Ioi1lo = cls3;
/* 392 */                           o010oi2.I000II = cls4;
/* 394 */                           VarHandle.storeStoreFence();
/* 397 */                           o010oi = o010oi2;
                                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                                }
                            }
/* 398 */                   if (o010oi == null) {
/* 403 */                       o010oi1 = new OO1I1IllO();
/* 193 */                       o010oi = o010oi1;
                            }
                        }
                    }
/* 408 */           I00000oIO = o010oi;
/* 420 */           I00000oOI = Logger.getLogger(OIOlo0OloOi.class.getName());
                }

                public static void I0001Ioi1lo(String str, Throwable th, int i) {
/* 11 */            I00000oOI.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
                }

                public iOl11OooolI0 I00000oOI(X509TrustManager x509TrustManager) {
/* 5 */             X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
/* 14 */            X509Certificate[] x509CertificateArr = (X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length);
/* 16 */            I1ooiIoI i1ooiIoI = new I1ooiIoI();
/* 21 */            LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 26 */            for (X509Certificate x509Certificate : x509CertificateArr) {
/* 30 */                X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
/* 34 */                Object linkedHashSet = linkedHashMap.get(subjectX500Principal);
/* 38 */                if (linkedHashSet == null) {
/* 42 */                    linkedHashSet = new LinkedHashSet();
/* 45 */                    linkedHashMap.put(subjectX500Principal, linkedHashSet);
                        }
/* 50 */                ((Set) linkedHashSet).add(x509Certificate);
                    }
/* 56 */            i1ooiIoI.I00000oIO = linkedHashMap;
/* 58 */            VarHandle.storeStoreFence();
/* 61 */            I1oi1O010i i1oi1O010i = new I1oi1O010i();
/* 64 */            i1oi1O010i.I00000oIO = i1ooiIoI;
/* 66 */            VarHandle.storeStoreFence();
/* 186 */           return i1oi1O010i;
                }

                public String I0000O(SSLSocket sSLSocket) {
/* 1 */             return null;
                }

                public boolean I0000oI00(String str) {
/* 1 */             return true;
                }

                public SSLContext I000II() {
/* 3 */             return SSLContext.getInstance("TLS");
                }

                public SSLSocketFactory I000O01llI0(X509TrustManager x509TrustManager) {
                    try {
/* 1 */                 SSLContext sSLContextI000II = I000II();
/* 12 */                sSLContextI000II.init(null, new TrustManager[]{x509TrustManager}, null);
/* 15 */                return sSLContextI000II.getSocketFactory();
                    } catch (GeneralSecurityException e) {
/* 49 */                throw new AssertionError("No System TLS: " + e, e);
                    }
                }

                public X509TrustManager I000OOo1O() {
/* 5 */             TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
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

                public final String toString() {
/* 5 */             return getClass().getSimpleName();
                }

/* 48 */        public void I00000oIO(SSLSocket sSLSocket) {
                }

/* 214 */       public void I0000Il00O(SSLSocket sSLSocket, String str, List list) {
                }
            }

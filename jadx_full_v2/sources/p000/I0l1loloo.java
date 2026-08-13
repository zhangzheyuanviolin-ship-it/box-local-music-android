            package p000;

            import android.net.http.X509TrustManagerExtensions;
            import android.security.NetworkSecurityPolicy;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import javax.net.ssl.SSLSocket;
            import javax.net.ssl.X509TrustManager;
            
            public final class I0l1loloo extends OO1I1IllO {
                public static final boolean I0000O = lI0lo10I01i1.I0000Il00O();
                public ArrayList I0000Il00O;

                @Override
                public final iOl11OooolI0 I00000oOI(X509TrustManager x509TrustManager) {
                    X509TrustManagerExtensions x509TrustManagerExtensions;
/* 1 */             I0lO1IIlO0 i0lO1IIlO0 = null;
                    try {
/* 4 */                 x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
                    } catch (IllegalArgumentException unused) {
/* 8 */                 x509TrustManagerExtensions = null;
                    }
/* 9 */             if (x509TrustManagerExtensions != null) {
/* 13 */                i0lO1IIlO0 = new I0lO1IIlO0();
/* 16 */                i0lO1IIlO0.I00000oIO = x509TrustManager;
/* 18 */                i0lO1IIlO0.I00000oOI = x509TrustManagerExtensions;
/* 20 */                VarHandle.storeStoreFence();
                    }
                    return i0lO1IIlO0 != null ? i0lO1IIlO0 : super.I00000oOI(x509TrustManager);
                }

                @Override
                public final void I0000Il00O(SSLSocket sSLSocket, String str, List list) {
                    Object next;
/* 3 */             Iterator it = this.I0000Il00O.iterator();
                    while (true) {
/* 11 */                if (!it.hasNext()) {
/* 27 */                    next = null;
                            break;
                        } else {
/* 13 */                    next = it.next();
/* 24 */                    if (((Ol1olOoi) next).I0000Il00O(sSLSocket)) {
                                break;
                            }
                        }
                    }
/* 28 */            Ol1olOoi ol1olOoi = (Ol1olOoi) next;
/* 30 */            if (ol1olOoi != null) {
/* 32 */                ol1olOoi.I0000O(sSLSocket, str, list);
                    }
                }

                @Override
                public final String I0000O(SSLSocket sSLSocket) {
                    Object next;
/* 3 */             Iterator it = this.I0000Il00O.iterator();
                    while (true) {
/* 12 */                if (!it.hasNext()) {
/* 28 */                    next = null;
                            break;
                        }
/* 14 */                next = it.next();
/* 25 */                if (((Ol1olOoi) next).I0000Il00O(sSLSocket)) {
                            break;
                        }
                    }
/* 29 */            Ol1olOoi ol1olOoi = (Ol1olOoi) next;
/* 31 */            if (ol1olOoi != null) {
/* 33 */                return ol1olOoi.I00000oOI(sSLSocket);
                    }
/* 11 */            return null;
                }

                @Override
                public final boolean I0000oI00(String str) {
/* 5 */             return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
                }
            }

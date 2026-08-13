            package p000;

            import java.lang.invoke.VarHandle;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.util.List;
            import javax.net.ssl.SSLSocket;
            
            public class I1001I implements Ol1olOoi {
                public static final loIOiIO1O1 I0001Ioi1lo;
                public Class I00000oIO;
                public Method I00000oOI;
                public Method I0000Il00O;
                public Method I0000O;
                public Method I0000oI00;

                static {
/* 5 */             loIOiIO1O1 loioiio1o1 = new loIOiIO1O1(8);
/* 8 */             VarHandle.storeStoreFence();
/* 11 */            I0001Ioi1lo = loioiio1o1;
                }

                @Override
                public final boolean I00000oIO() {
/* 1 */             int i = I0olIlOIl1.I0000Il00O;
/* 3 */             return false;
                }

                @Override
                public final String I00000oOI(SSLSocket sSLSocket) {
/* 8 */             if (this.I00000oIO.isInstance(sSLSocket)) {
                        try {
/* 17 */                    byte[] bArr = (byte[]) this.I0000O.invoke(sSLSocket, null);
/* 19 */                    if (bArr != null) {
/* 25 */                        return new String(bArr, IO1IOI.I00000oIO);
                            }
                        } catch (IllegalAccessException e) {
/* 60 */                    I000II.I000O01llI0(e);
/* 7 */                     return null;
                        } catch (InvocationTargetException e2) {
/* 33 */                    Throwable cause = e2.getCause();
/* 39 */                    if (!(cause instanceof NullPointerException) || !O0000Ioio00.I0000O(((NullPointerException) cause).getMessage(), "ssl == null")) {
/* 56 */                        I000II.I000O01llI0(e2);
/* 7 */                         return null;
                            }
                        }
                    }
/* 7 */             return null;
                }

                @Override
                public final boolean I0000Il00O(SSLSocket sSLSocket) {
/* 3 */             return this.I00000oIO.isInstance(sSLSocket);
                }

                @Override
                public final void I0000O(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
/* 7 */             if (this.I00000oIO.isInstance(sSLSocket)) {
                        try {
/* 17 */                    this.I00000oOI.invoke(sSLSocket, Boolean.TRUE);
/* 20 */                    if (str != null) {
/* 28 */                        this.I0000Il00O.invoke(sSLSocket, str);
                            }
/* 31 */                    Method method = this.I0000oI00;
/* 33 */                    OO1I1IllO oO1I1IllO = OO1I1IllO.I00000oIO;
/* 43 */                    method.invoke(sSLSocket, lI0lo10I01i1.I00000oOI(list));
                        } catch (IllegalAccessException e) {
/* 53 */                    I000II.I000O01llI0(e);
                        } catch (InvocationTargetException e2) {
/* 48 */                    I000II.I000O01llI0(e2);
                        }
                    }
                }
            }

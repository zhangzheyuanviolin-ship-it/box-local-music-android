            package p000;

            import java.util.List;
            import javax.net.ssl.SSLSocket;
            
            public final class IiIOl1iI00 implements Ol1olOoi {
                public final IiIOiO1 I00000oIO;
                public Ol1olOoi I00000oOI;

                public IiIOl1iI00(IiIOiO1 iiIOiO1) {
/* 4 */             this.I00000oIO = iiIOiO1;
                }

                @Override
                public final boolean I00000oIO() {
/* 1 */             return true;
                }

                @Override
                public final String I00000oOI(SSLSocket sSLSocket) {
/* 1 */             Ol1olOoi ol1olOoiI0000oI00 = I0000oI00(sSLSocket);
/* 5 */             if (ol1olOoiI0000oI00 != null) {
/* 7 */                 return ol1olOoiI0000oI00.I00000oOI(sSLSocket);
                    }
/* 12 */            return null;
                }

                @Override
                public final boolean I0000Il00O(SSLSocket sSLSocket) {
/* 3 */             return this.I00000oIO.I0000Il00O(sSLSocket);
                }

                @Override
                public final void I0000O(SSLSocket sSLSocket, String str, List list) {
/* 1 */             Ol1olOoi ol1olOoiI0000oI00 = I0000oI00(sSLSocket);
/* 5 */             if (ol1olOoiI0000oI00 != null) {
/* 7 */                 ol1olOoiI0000oI00.I0000O(sSLSocket, str, list);
                    }
                }

                public final synchronized Ol1olOoi I0000oI00(SSLSocket sSLSocket) {
                    try {
/* 4 */                 if (this.I00000oOI == null && this.I00000oIO.I0000Il00O(sSLSocket)) {
/* 20 */                    this.I00000oOI = this.I00000oIO.I000O01llI0(sSLSocket);
                        }
                    } catch (Throwable th) {
/* 49 */                throw th;
                    }
/* 25 */            return this.I00000oOI;
                }
            }

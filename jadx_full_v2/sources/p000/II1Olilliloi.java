            package p000;

            import java.util.List;
            import javax.net.ssl.SSLSocket;
            import org.bouncycastle.jsse.BCSSLParameters;
            import org.bouncycastle.jsse.BCSSLSocket;
            
            public final class II1Olilliloi implements Ol1olOoi {
                public static final II1OliIoIo I00000oIO = new II1OliIoIo();

                @Override
                public final boolean I00000oIO() {
/* 1 */             boolean z = II1OO1iI0oIl.I0000O;
/* 3 */             return II1OO1iI0oIl.I0000O;
                }

                @Override
                public final String I00000oOI(SSLSocket sSLSocket) {
/* 3 */             String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
/* 17 */            if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
/* 19 */                return null;
                    }
/* 49 */            return applicationProtocol;
                }

                @Override
                public final boolean I0000Il00O(SSLSocket sSLSocket) {
/* 1 */             return false;
                }

                @Override
                public final void I0000O(SSLSocket sSLSocket, String str, List list) {
/* 5 */             if (I0000Il00O(sSLSocket)) {
/* 7 */                 BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
/* 9 */                 BCSSLParameters parameters = bCSSLSocket.getParameters();
/* 13 */                OO1I1IllO oO1I1IllO = OO1I1IllO.I00000oIO;
/* 28 */                parameters.setApplicationProtocols((String[]) lI0lo10I01i1.I00000oIO(list).toArray(new String[0]));
/* 31 */                bCSSLSocket.setParameters(parameters);
                    }
                }
            }

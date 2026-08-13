            package p000;

            import android.net.ssl.SSLSockets;
            import java.io.IOException;
            import java.util.List;
            import javax.net.ssl.SSLParameters;
            import javax.net.ssl.SSLSocket;
            
            public final class I0l1o1I0iOo implements Ol1olOoi {
                @Override
                public final boolean I00000oIO() {
/* 1 */             OO1I1IllO oO1I1IllO = OO1I1IllO.I00000oIO;
/* 3 */             return lI0lo10I01i1.I0000Il00O();
                }

                @Override
                public final String I00000oOI(SSLSocket sSLSocket) {
/* 1 */             String applicationProtocol = sSLSocket.getApplicationProtocol();
/* 15 */            if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
/* 17 */                return null;
                    }
/* 49 */            return applicationProtocol;
                }

                @Override
                public final boolean I0000Il00O(SSLSocket sSLSocket) {
/* 1 */             return SSLSockets.isSupportedSocket(sSLSocket);
                }

                @Override
                public final void I0000O(SSLSocket sSLSocket, String str, List list) throws IOException {
                    try {
/* 2 */                 SSLSockets.setUseSessionTickets(sSLSocket, true);
/* 5 */                 SSLParameters sSLParameters = sSLSocket.getSSLParameters();
/* 9 */                 OO1I1IllO oO1I1IllO = OO1I1IllO.I00000oIO;
/* 24 */                sSLParameters.setApplicationProtocols((String[]) lI0lo10I01i1.I00000oIO(list).toArray(new String[0]));
/* 27 */                sSLSocket.setSSLParameters(sSLParameters);
                    } catch (IllegalArgumentException e) {
/* 215 */               throw new IOException("Android internal error", e);
                    }
                }
            }

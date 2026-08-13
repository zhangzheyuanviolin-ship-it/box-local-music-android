            package p000;

            import java.util.List;
            import javax.net.ssl.SSLSocket;
            import org.conscrypt.Conscrypt;
            
            public final class IOo0Ol1O0IiO implements Ol1olOoi {
                public static final IOo0OOiOO0 I00000oIO = new IOo0OOiOO0();

                @Override
                public final boolean I00000oIO() {
/* 1 */             boolean z = IOo0O1l0.I0000O;
/* 3 */             return IOo0O1l0.I0000O;
                }

                @Override
                public final String I00000oOI(SSLSocket sSLSocket) {
/* 5 */             if (I0000Il00O(sSLSocket)) {
/* 7 */                 return Conscrypt.getApplicationProtocol(sSLSocket);
                    }
/* 12 */            return null;
                }

                @Override
                public final boolean I0000Il00O(SSLSocket sSLSocket) {
/* 1 */             return Conscrypt.isConscrypt(sSLSocket);
                }

                @Override
                public final void I0000O(SSLSocket sSLSocket, String str, List list) {
/* 5 */             if (I0000Il00O(sSLSocket)) {
/* 8 */                 Conscrypt.setUseSessionTickets(sSLSocket, true);
/* 11 */                OO1I1IllO oO1I1IllO = OO1I1IllO.I00000oIO;
/* 26 */                Conscrypt.setApplicationProtocols(sSLSocket, (String[]) lI0lo10I01i1.I00000oIO(list).toArray(new String[0]));
                    }
                }
            }

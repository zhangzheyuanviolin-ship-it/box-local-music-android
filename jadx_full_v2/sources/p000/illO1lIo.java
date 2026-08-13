            package p000;

            import java.io.IOException;
            import java.security.cert.Certificate;
            import java.util.Arrays;
            import java.util.List;
            import javax.net.ssl.SSLPeerUnverifiedException;
            import javax.net.ssl.SSLSession;
            
            public abstract class illO1lIo {
                public static Io11ol I00000oIO(SSLSession sSLSession) throws IOException {
                    Certificate[] peerCertificates;
/* 1 */             List listI000iOII = Il01100l.I00iOIl;
/* 3 */             String cipherSuite = sSLSession.getCipherSuite();
/* 8 */             if (cipherSuite == null) {
/* 120 */               I000II.I001IO000("cipherSuite == null");
/* 7 */                 return null;
                    }
/* 26 */            if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
/* 114 */               IioIoO10iOiI.I000OOo1O("cipherSuite == ".concat(cipherSuite));
/* 7 */                 return null;
                    }
/* 30 */            IOIIo1OIOi1 iOIIo1OIOi1I000iOII = IOIIo1OIOi1.I00000oOI.I000iOII(cipherSuite);
/* 34 */            String protocol = sSLSession.getProtocol();
/* 38 */            if (protocol == null) {
/* 104 */               I000II.I001IO000("tlsVersion == null");
/* 7 */                 return null;
                    }
/* 46 */            if ("NONE".equals(protocol)) {
/* 98 */                IioIoO10iOiI.I000OOo1O("tlsVersion == NONE");
/* 7 */                 return null;
                    }
/* 48 */            Oo1II0I1llO oo1II0I1llOI00000oIO = lOloIoil00.I00000oIO(protocol);
                    try {
/* 52 */                peerCertificates = sSLSession.getPeerCertificates();
                    } catch (SSLPeerUnverifiedException unused) {
                    }
/* 68 */            List listI000iOII2 = peerCertificates != null ? OollIoI001lo.I000iOII(Arrays.copyOf(peerCertificates, peerCertificates.length)) : listI000iOII;
/* 71 */            Certificate[] localCertificates = sSLSession.getLocalCertificates();
/* 75 */            if (localCertificates != null) {
/* 82 */                listI000iOII = OollIoI001lo.I000iOII(Arrays.copyOf(localCertificates, localCertificates.length));
                    }
/* 92 */            return new Io11ol(oo1II0I1llOI00000oIO, iOIIo1OIOi1I000iOII, listI000iOII, new I10oIiiliil(listI000iOII2, 4));
                }
            }

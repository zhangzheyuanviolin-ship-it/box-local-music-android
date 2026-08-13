            package p000;

            import java.security.cert.Certificate;
            import java.security.cert.X509Certificate;
            import java.util.ArrayList;
            import java.util.List;
            
            public final class Io11ol {
                public final Oo1II0I1llO I00000oIO;
                public final IOIIo1OIOi1 I00000oOI;
                public final List I0000Il00O;
                public final OllO00oiil I0000O;

                public Io11ol(Oo1II0I1llO oo1II0I1llO, IOIIo1OIOi1 iOIIo1OIOi1, List list, IllOOo00lI illOOo00lI) {
/* 4 */             this.I00000oIO = oo1II0I1llO;
/* 6 */             this.I00000oOI = iOIIo1OIOi1;
/* 8 */             this.I0000Il00O = list;
/* 21 */            this.I0000O = new OllO00oiil(new I10oIiiliil(illOOo00lI, 5));
                }

                public final List I00000oIO() {
/* 7 */             return (List) this.I0000O.getValue();
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof Io11ol)) {
/* 46 */                return false;
                    }
/* 5 */             Io11ol io11ol = (Io11ol) obj;
                    return io11ol.I00000oIO == this.I00000oIO && io11ol.I00000oOI == this.I00000oOI && O0000Ioio00.I0000O(io11ol.I00000oIO(), I00000oIO()) && io11ol.I0000Il00O.equals(this.I0000Il00O);
                }

                public final int hashCode() {
/* 37 */            return this.I0000Il00O.hashCode() + ((I00000oIO().hashCode() + ((this.I00000oOI.hashCode() + ((this.I00000oIO.hashCode() + 527) * 31)) * 31)) * 31);
                }

                public final String toString() {
/* 1 */             List<Certificate> listI00000oIO = I00000oIO();
/* 15 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(listI00000oIO, 10));
/* 26 */            for (Certificate certificate : listI00000oIO) {
/* 53 */                arrayList.add(certificate instanceof X509Certificate ? ((X509Certificate) certificate).getSubjectDN().toString() : certificate.getType());
                    }
/* 57 */            String string = arrayList.toString();
/* 65 */            StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
/* 70 */            sb.append(this.I00000oIO);
/* 75 */            sb.append(" cipherSuite=");
/* 80 */            sb.append(this.I00000oOI);
/* 85 */            sb.append(" peerCertificates=");
/* 88 */            sb.append(string);
/* 93 */            sb.append(" localCertificates=");
/* 96 */            List<Certificate> list = this.I0000Il00O;
/* 106 */           ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(list, 10));
/* 117 */           for (Certificate certificate2 : list) {
/* 144 */               arrayList2.add(certificate2 instanceof X509Certificate ? ((X509Certificate) certificate2).getSubjectDN().toString() : certificate2.getType());
                    }
/* 148 */           sb.append(arrayList2);
/* 153 */           sb.append('}');
/* 156 */           return sb.toString();
                }
            }

            package p000;
            
            public abstract class iOiiOiOliIO {
                public static Io1Io0OOi011 I00000oIO(Io1Io0OOi011 io1Io0OOi011, Io1Io0OOi011 io1Io0OOi0112) {
/* 3 */             Io1IlO1I1i io1IlO1I1i = new Io1IlO1I1i();
/* 6 */             int size = io1Io0OOi011.size();
/* 18 */            for (int i = 0; i < size; i++) {
/* 20 */                String strI0000O = io1Io0OOi011.I0000O(i);
/* 24 */                String strI000OiO = io1Io0OOi011.I000OiO(i);
/* 34 */                if ((!"Warning".equalsIgnoreCase(strI0000O) || !OlOolloIIOl0.I000l1(strI000OiO, "1", false)) && ("Content-Length".equalsIgnoreCase(strI0000O) || "Content-Encoding".equalsIgnoreCase(strI0000O) || "Content-Type".equalsIgnoreCase(strI0000O) || !I00000oOI(strI0000O) || io1Io0OOi0112.I00000oOI(strI0000O) == null)) {
/* 76 */                    io1IlO1I1i.I00000oOI(strI0000O, strI000OiO);
                        }
                    }
/* 82 */            int size2 = io1Io0OOi0112.size();
/* 86 */            for (int i2 = 0; i2 < size2; i2++) {
/* 88 */                String strI0000O2 = io1Io0OOi0112.I0000O(i2);
/* 96 */                if (!"Content-Length".equalsIgnoreCase(strI0000O2) && !"Content-Encoding".equalsIgnoreCase(strI0000O2) && !"Content-Type".equalsIgnoreCase(strI0000O2) && I00000oOI(strI0000O2)) {
/* 121 */                   io1IlO1I1i.I00000oOI(strI0000O2, io1Io0OOi0112.I000OiO(i2));
                        }
                    }
/* 127 */           return io1IlO1I1i.I0000Il00O();
                }

                public static boolean I00000oOI(String str) {
                    return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
                }
            }

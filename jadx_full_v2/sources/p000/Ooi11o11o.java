            package p000;

            import java.io.Serializable;
            import java.util.LinkedHashMap;
            import java.util.List;
            
            public final class Ooi11o11o implements Serializable {
                public static final Ooi11o11o I00iiO;
                public static final LinkedHashMap I00iio;
                public final String I00iOIl;
                public final int I00iiI;

                static {
/* 7 */             Ooi11o11o ooi11o11o = new Ooi11o11o("http", 80);
/* 10 */            I00iiO = ooi11o11o;
/* 48 */            List listI000O01llI0 = IOOi1I.I000O01llI0(ooi11o11o, new Ooi11o11o("https", 443), new Ooi11o11o("ws", 80), new Ooi11o11o("wss", 443), new Ooi11o11o("socks", 1080));
/* 60 */            int iI00000oIO = O1Oii0o0Oi.I00000oIO(IOOi1I.I0000O(listI000O01llI0, 10));
/* 66 */            if (iI00000oIO < 16) {
/* 68 */                iI00000oIO = 16;
                    }
/* 71 */            LinkedHashMap linkedHashMap = new LinkedHashMap(iI00000oIO);
/* 82 */            for (Object obj : listI000O01llI0) {
/* 93 */                linkedHashMap.put(((Ooi11o11o) obj).I00iOIl, obj);
                    }
/* 97 */            I00iio = linkedHashMap;
                }

                public Ooi11o11o(String str, int i) {
/* 4 */             this.I00iOIl = str;
/* 6 */             this.I00iiI = i;
/* 13 */            for (int i2 = 0; i2 < str.length(); i2++) {
/* 15 */                char cCharAt = str.charAt(i2);
/* 23 */                if (Character.toLowerCase(cCharAt) != cCharAt) {
/* 30 */                    I000II.I000iOII("All characters should be lower case");
/* 34 */                    throw null;
                        }
                    }
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 30 */                return true;
                    }
/* 6 */             if (!(obj instanceof Ooi11o11o)) {
/* 28 */                return false;
                    }
/* 9 */             Ooi11o11o ooi11o11o = (Ooi11o11o) obj;
                    return this.I00iOIl.equals(ooi11o11o.I00iOIl) && this.I00iiI == ooi11o11o.I00iiI;
                }

                public final int hashCode() {
/* 15 */            return Integer.hashCode(this.I00iiI) + (this.I00iOIl.hashCode() * 31);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("URLProtocol(name=");
/* 10 */            sb.append(this.I00iOIl);
/* 15 */            sb.append(", defaultPort=");
/* 22 */            return Oi010OO0.I001i1lo1io(sb, this.I00iiI, ')');
                }
            }

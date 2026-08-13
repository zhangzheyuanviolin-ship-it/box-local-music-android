            package p000;
            
            public final class o0IiIio1Ii1i {
                public String I00000oIO;
                public int I00000oOI;

                public static o0IIlIO I00000oIO(String str) {
/* 3 */             o0IIlIO o0iilio = new o0IIlIO();
/* 6 */             o0iilio.I00000oIO = str;
/* 12 */            byte b = (byte) (o0iilio.I0000Il00O | 1);
/* 13 */            o0iilio.I00000oOI = 1;
/* 18 */            o0iilio.I0000Il00O = (byte) (b | 2);
/* 29 */            return o0iilio;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 26 */                return true;
                    }
/* 6 */             if (!(obj instanceof o0IiIio1Ii1i)) {
/* 28 */                return false;
                    }
/* 8 */             o0IiIio1Ii1i o0iiiio1ii1i = (o0IiIio1Ii1i) obj;
                    return this.I00000oIO.equals(o0iiiio1ii1i.I00000oIO) && this.I00000oOI == o0iiiio1ii1i.I00000oOI;
                }

                public final int hashCode() {
/* 17 */            return this.I00000oOI ^ ((((this.I00000oIO.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("MLKitLoggingOptions{libraryName=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", enableFirelog=true, firelogEventType=");
/* 22 */            return IIl001iO0Io.I000lI(this.I00000oOI, "}", sb);
                }
            }

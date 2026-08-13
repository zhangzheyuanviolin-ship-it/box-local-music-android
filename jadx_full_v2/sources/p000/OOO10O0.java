            package p000;
            
            @Oili0O
            public final class OOO10O0 implements OIO1iOO1iiOI {
                public static final OOO10I Companion = new OOO10I();
                public Oi0IO1ii011 I00000oIO;
                public double I00000oOI;
                public Double I0000Il00O;
                public String I0000O;
                public O01ioO1o0i11 I0000oI00;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OOO10O0)) {
/* 7 */                 return false;
                    }
/* 11 */            OOO10O0 ooo10o0 = (OOO10O0) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, ooo10o0.I00000oIO) && Double.compare(this.I00000oOI, ooo10o0.I00000oOI) == 0 && O0000Ioio00.I0000O(this.I0000Il00O, ooo10o0.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, ooo10o0.I0000O) && O0000Ioio00.I0000O(this.I0000oI00, ooo10o0.I0000oI00);
                }

                public final int hashCode() {
/* 16 */            int iHashCode = (Double.hashCode(this.I00000oOI) + (this.I00000oIO.hashCode() * 31)) * 31;
/* 18 */            Double d = this.I0000Il00O;
/* 30 */            int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
/* 32 */            String str = this.I0000O;
/* 43 */            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
/* 45 */            O01ioO1o0i11 o01ioO1o0i11 = this.I0000oI00;
/* 56 */            return iHashCode3 + (o01ioO1o0i11 != null ? o01ioO1o0i11.I00iOIl.hashCode() : 0);
                }

                public final String toString() {
/* 58 */            return "ProgressNotificationParams(progressToken=" + this.I00000oIO + ", progress=" + this.I00000oOI + ", total=" + this.I0000Il00O + ", message=" + this.I0000O + ", meta=" + this.I0000oI00 + ")";
                }
            }

            package p000;
            
            @Oili0O
            public final class OillO0l {
                public static final OililII1lO Companion = new OililII1lO();
                public OillIl0 I00000oIO;
                public Oill0iOO0I I00000oOI;
                public OililillIio I0000Il00O;
                public O01ioO1o0i11 I0000O;
                public O01ioO1o0i11 I0000oI00;
                public O01ioO1o0i11 I0001Ioi1lo;

                static {
/* 8 */             OllO00oiil ollO00oiil = O01oO1I1O.I00000oIO;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OillO0l)) {
/* 7 */                 return false;
                    }
/* 11 */            OillO0l oillO0l = (OillO0l) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, oillO0l.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, oillO0l.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, oillO0l.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, oillO0l.I0000O) && O0000Ioio00.I0000O(this.I0000oI00, oillO0l.I0000oI00) && O0000Ioio00.I0000O(this.I0001Ioi1lo, oillO0l.I0001Ioi1lo);
                }

                public final int hashCode() {
/* 1 */             OillIl0 oillIl0 = this.I00000oIO;
/* 12 */            int iHashCode = (oillIl0 == null ? 0 : oillIl0.hashCode()) * 31;
/* 14 */            Oill0iOO0I oill0iOO0I = this.I00000oOI;
/* 25 */            int iHashCode2 = (iHashCode + (oill0iOO0I == null ? 0 : oill0iOO0I.hashCode())) * 31;
/* 27 */            OililillIio oililillIio = this.I0000Il00O;
/* 38 */            int iHashCode3 = (iHashCode2 + (oililillIio == null ? 0 : oililillIio.hashCode())) * 31;
/* 40 */            O01ioO1o0i11 o01ioO1o0i11 = this.I0000O;
/* 53 */            int iHashCode4 = (iHashCode3 + (o01ioO1o0i11 == null ? 0 : o01ioO1o0i11.I00iOIl.hashCode())) * 31;
/* 55 */            O01ioO1o0i11 o01ioO1o0i112 = this.I0000oI00;
/* 68 */            int iHashCode5 = (iHashCode4 + (o01ioO1o0i112 == null ? 0 : o01ioO1o0i112.I00iOIl.hashCode())) * 31;
/* 70 */            O01ioO1o0i11 o01ioO1o0i113 = this.I0001Ioi1lo;
/* 81 */            return iHashCode5 + (o01ioO1o0i113 != null ? o01ioO1o0i113.I00iOIl.hashCode() : 0);
                }

                public final String toString() {
/* 68 */            return "ServerCapabilities(tools=" + this.I00000oIO + ", resources=" + this.I00000oOI + ", prompts=" + this.I0000Il00O + ", logging=" + this.I0000O + ", completions=" + this.I0000oI00 + ", experimental=" + this.I0001Ioi1lo + ")";
                }
            }

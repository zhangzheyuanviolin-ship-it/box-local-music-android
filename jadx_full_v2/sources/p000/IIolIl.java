            package p000;
            
            @Oili0O
            public final class IIolIl implements OIO1iOO1iiOI {
                public static final IIolII0I110I Companion = new IIolII0I110I();
                public Oi0IO1ii011 I00000oIO;
                public String I00000oOI;
                public O01ioO1o0i11 I0000Il00O;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof IIolIl)) {
/* 7 */                 return false;
                    }
/* 11 */            IIolIl iIolIl = (IIolIl) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, iIolIl.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, iIolIl.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, iIolIl.I0000Il00O);
                }

                public final int hashCode() {
/* 7 */             int iHashCode = this.I00000oIO.hashCode() * 31;
/* 9 */             String str = this.I00000oOI;
/* 21 */            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
/* 23 */            O01ioO1o0i11 o01ioO1o0i11 = this.I0000Il00O;
/* 34 */            return iHashCode2 + (o01ioO1o0i11 != null ? o01ioO1o0i11.I00iOIl.hashCode() : 0);
                }

                public final String toString() {
/* 38 */            return "CancelledNotificationParams(requestId=" + this.I00000oIO + ", reason=" + this.I00000oOI + ", meta=" + this.I0000Il00O + ")";
                }
            }

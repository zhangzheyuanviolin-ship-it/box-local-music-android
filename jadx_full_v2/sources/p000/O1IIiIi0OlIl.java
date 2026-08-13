            package p000;
            
            @Oili0O
            public final class O1IIiIi0OlIl implements OIO1iOO1iiOI {
                public static final O1IIOolIOl Companion = new O1IIOolIOl();
                public static final O0ioIllo0i1[] I0000oI00 = {l0oi0lOi11i.I00000oIO(O0oI01I0oo.I00iOIl, new O0o0Ol0(19)), null, null, null};
                public O1II0olio0l1 I00000oIO;
                public O01O0o1iI I00000oOI;
                public String I0000Il00O;
                public O01ioO1o0i11 I0000O;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof O1IIiIi0OlIl)) {
/* 7 */                 return false;
                    }
/* 11 */            O1IIiIi0OlIl o1IIiIi0OlIl = (O1IIiIi0OlIl) obj;
                    return this.I00000oIO == o1IIiIi0OlIl.I00000oIO && O0000Ioio00.I0000O(this.I00000oOI, o1IIiIi0OlIl.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, o1IIiIi0OlIl.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, o1IIiIi0OlIl.I0000O);
                }

                public final int hashCode() {
/* 16 */            int iHashCode = (this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31)) * 31;
/* 18 */            String str = this.I0000Il00O;
/* 30 */            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
/* 32 */            O01ioO1o0i11 o01ioO1o0i11 = this.I0000O;
/* 43 */            return iHashCode2 + (o01ioO1o0i11 != null ? o01ioO1o0i11.I00iOIl.hashCode() : 0);
                }

                public final String toString() {
/* 48 */            return "LoggingMessageNotificationParams(level=" + this.I00000oIO + ", data=" + this.I00000oOI + ", logger=" + this.I0000Il00O + ", meta=" + this.I0000O + ")";
                }
            }

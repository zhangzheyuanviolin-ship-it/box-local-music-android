            package p000;
            
            @Oili0O
            public final class Oi0ol00 implements OIO1iOO1iiOI {
                public static final Oi0oiiO0 Companion = new Oi0oiiO0();
                public String I00000oIO;
                public O01ioO1o0i11 I00000oOI;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Oi0ol00)) {
/* 7 */                 return false;
                    }
/* 11 */            Oi0ol00 oi0ol00 = (Oi0ol00) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, oi0ol00.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, oi0ol00.I00000oOI);
                }

                public final int hashCode() {
/* 7 */             int iHashCode = this.I00000oIO.hashCode() * 31;
/* 9 */             O01ioO1o0i11 o01ioO1o0i11 = this.I00000oOI;
/* 21 */            return iHashCode + (o01ioO1o0i11 == null ? 0 : o01ioO1o0i11.I00iOIl.hashCode());
                }

                public final String toString() {
/* 28 */            return "ResourceUpdatedNotificationParams(uri=" + this.I00000oIO + ", meta=" + this.I00000oOI + ")";
                }
            }

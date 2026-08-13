            package p000;
            
            @Oili0O
            public final class Oill0iOO0I {
                public static final Oill0IO Companion = new Oill0IO();
                public Boolean I00000oIO;
                public Boolean I00000oOI;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Oill0iOO0I)) {
/* 7 */                 return false;
                    }
/* 11 */            Oill0iOO0I oill0iOO0I = (Oill0iOO0I) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, oill0iOO0I.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, oill0iOO0I.I00000oOI);
                }

                public final int hashCode() {
/* 1 */             Boolean bool = this.I00000oIO;
/* 12 */            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
/* 14 */            Boolean bool2 = this.I00000oOI;
/* 23 */            return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
                }

                public final String toString() {
/* 28 */            return "Resources(listChanged=" + this.I00000oIO + ", subscribe=" + this.I00000oOI + ")";
                }
            }

            package p000;
            
            public final class Oo0l0I {
                public static final Oo0l0I I0000Il00O = new Oo0l0I(2, false);
                public static final Oo0l0I I0000O = new Oo0l0I(1, true);
                public final int I00000oIO;
                public final boolean I00000oOI;

                public Oo0l0I(int i, boolean z) {
/* 4 */             this.I00000oIO = i;
/* 6 */             this.I00000oOI = z;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Oo0l0I)) {
/* 7 */                 return false;
                    }
/* 11 */            Oo0l0I oo0l0I = (Oo0l0I) obj;
                    return this.I00000oIO == oo0l0I.I00000oIO && this.I00000oOI == oo0l0I.I00000oOI;
                }

                public final int hashCode() {
/* 15 */            return Boolean.hashCode(this.I00000oOI) + (Integer.hashCode(this.I00000oIO) * 31);
                }

                public final String toString() {
                    return equals(I0000Il00O) ? "TextMotion.Static" : equals(I0000O) ? "TextMotion.Animated" : "Invalid";
                }
            }

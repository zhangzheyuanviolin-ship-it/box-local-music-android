            package p000;
            
            public final class Ol0i11lo1l1I {
                public static final Ol0i11lo1l1I I0000Il00O;
                public final il1OioiO I00000oIO;
                public final il1OioiO I00000oOI;

                static {
/* 3 */             Iii10OOOI iii10OOOI = Iii10OOOI.I00000oIO;
/* 8 */             I0000Il00O = new Ol0i11lo1l1I(iii10OOOI, iii10OOOI);
                }

                public Ol0i11lo1l1I(il1OioiO il1oioio, il1OioiO il1oioio2) {
/* 4 */             this.I00000oIO = il1oioio;
/* 6 */             this.I00000oOI = il1oioio2;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 34 */                return true;
                    }
/* 6 */             if (!(obj instanceof Ol0i11lo1l1I)) {
/* 32 */                return false;
                    }
/* 9 */             Ol0i11lo1l1I ol0i11lo1l1I = (Ol0i11lo1l1I) obj;
                    return this.I00000oIO.equals(ol0i11lo1l1I.I00000oIO) && this.I00000oOI.equals(ol0i11lo1l1I.I00000oOI);
                }

                public final int hashCode() {
/* 15 */            return this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "Size(width=" + this.I00000oIO + ", height=" + this.I00000oOI + ')';
                }
            }

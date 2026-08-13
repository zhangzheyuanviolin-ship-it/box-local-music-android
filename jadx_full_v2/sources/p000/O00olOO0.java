            package p000;
            
/* 11 */    public final class O00olOO0 {
                public static final O00olOO0 I0000oI00 = new O00olOO0(null, false);
                public final OIOOOO I00000oIO;
                public final OI0io10lI I00000oOI;
                public final boolean I0000Il00O;
                public final boolean I0000O;

                public O00olOO0(OIOOOO oioooo, OI0io10lI oI0io10lI, boolean z, boolean z2) {
/* 4 */             this.I00000oIO = oioooo;
/* 6 */             this.I00000oOI = oI0io10lI;
/* 8 */             this.I0000Il00O = z;
/* 10 */            this.I0000O = z2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof O00olOO0)) {
/* 7 */                 return false;
                    }
/* 11 */            O00olOO0 o00olOO0 = (O00olOO0) obj;
                    return this.I00000oIO == o00olOO0.I00000oIO && this.I00000oOI == o00olOO0.I00000oOI && this.I0000Il00O == o00olOO0.I0000Il00O && this.I0000O == o00olOO0.I0000O;
                }

                public final int hashCode() {
/* 2 */             OIOOOO oioooo = this.I00000oIO;
/* 14 */            int iHashCode = (oioooo == null ? 0 : oioooo.hashCode()) * 31;
/* 15 */            OI0io10lI oI0io10lI = this.I00000oOI;
/* 38 */            return Boolean.hashCode(this.I0000O) + Oi010OO0.I000OOo1O((iHashCode + (oI0io10lI != null ? oI0io10lI.hashCode() : 0)) * 31, 31, this.I0000Il00O);
                }

                public final String toString() {
/* 48 */            return "JavaTypeQualifiers(nullability=" + this.I00000oIO + ", mutability=" + this.I00000oOI + ", definitelyNotNull=" + this.I0000Il00O + ", isNullabilityQualifierForWarning=" + this.I0000O + ')';
                }

/* 12 */        public O00olOO0(OIOOOO oioooo, boolean z) {
/* 13 */            this(oioooo, null, z, false);
                }
            }

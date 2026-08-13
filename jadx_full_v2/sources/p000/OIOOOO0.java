            package p000;
            
            public final class OIOOOO0 {
                public final OIOOOO I00000oIO;
                public final boolean I00000oOI;

                public OIOOOO0(OIOOOO oioooo, boolean z) {
/* 4 */             this.I00000oIO = oioooo;
/* 6 */             this.I00000oOI = z;
                }

                public static OIOOOO0 I00000oIO(OIOOOO0 oioooo0, OIOOOO oioooo, boolean z, int i) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 oioooo = oioooo0.I00000oIO;
                    }
/* 9 */             if ((i & 2) != 0) {
/* 11 */                z = oioooo0.I00000oOI;
                    }
/* 13 */            oioooo0.getClass();
/* 18 */            return new OIOOOO0(oioooo, z);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OIOOOO0)) {
/* 7 */                 return false;
                    }
/* 11 */            OIOOOO0 oioooo0 = (OIOOOO0) obj;
                    return this.I00000oIO == oioooo0.I00000oIO && this.I00000oOI == oioooo0.I00000oOI;
                }

                public final int hashCode() {
/* 15 */            return Boolean.hashCode(this.I00000oOI) + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "NullabilityQualifierWithMigrationStatus(qualifier=" + this.I00000oIO + ", isForWarningOnly=" + this.I00000oOI + ')';
                }
            }

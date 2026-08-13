            package p000;
            
            public abstract class lOlilO1lOIO {
                public static final void I00000oIO(long j) {
/* 1 */             Oo0o1iioOiO[] oo0o1iioOiOArr = Oo0o1OiIo.I00000oOI;
/* 18 */            if ((j & 1095216660480L) == 0) {
/* 22 */                Ioliol1Ii.I00000oIO("Cannot perform operation for Unspecified type.");
                    }
                }

                public static final void I00000oOI(long j, long j2) {
/* 1 */             Oo0o1iioOiO[] oo0o1iioOiOArr = Oo0o1OiIo.I00000oOI;
/* 14 */            if ((j & 1095216660480L) == 0 || (1095216660480L & j2) == 0) {
/* 24 */                Ioliol1Ii.I00000oIO("Cannot perform operation for Unspecified type.");
                    }
/* 39 */            if (Oo0o1iioOiO.I00000oOI(Oo0o1OiIo.I0000Il00O(j), Oo0o1OiIo.I0000Il00O(j2))) {
/* 106 */               return;
                    }
/* 79 */            Ioliol1Ii.I00000oIO("Cannot perform operation for " + Oo0o1iioOiO.I0000Il00O(Oo0o1OiIo.I0000Il00O(j)) + " and " + Oo0o1iioOiO.I0000Il00O(Oo0o1OiIo.I0000Il00O(j2)));
                }

                public static final long I0000Il00O(double d) {
/* 7 */             return I0000oI00((float) d, 4294967296L);
                }

                public static final long I0000O(int i) {
/* 7 */             return I0000oI00(i, 4294967296L);
                }

                public static final long I0000oI00(float f, long j) {
/* 12 */            long jFloatToRawIntBits = j | (Float.floatToRawIntBits(f) & 4294967295L);
/* 14 */            Oo0o1iioOiO[] oo0o1iioOiOArr = Oo0o1OiIo.I00000oOI;
/* 37 */            return jFloatToRawIntBits;
                }
            }

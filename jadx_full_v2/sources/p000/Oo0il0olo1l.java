            package p000;
            
            public final class Oo0il0olo1l {
                public Oo0iil0o0oI I00000oIO;
                public O0iOOo0Ii I00000oOI;
                public O0iOOo0Ii I0000Il00O;

                public final long I00000oIO(long j) {
                    OOo0IO oOo0IOI00IoiI;
/* 1 */             O0iOOo0Ii o0iOOo0Ii = this.I00000oOI;
/* 3 */             OOo0IO oOo0IO = OOo0IO.I0000oI00;
/* 5 */             if (o0iOOo0Ii != null) {
/* 11 */                if (o0iOOo0Ii.I0010o()) {
/* 13 */                    O0iOOo0Ii o0iOOo0Ii2 = this.I0000Il00O;
/* 23 */                    oOo0IOI00IoiI = o0iOOo0Ii2 != null ? o0iOOo0Ii2.I00IoiI(o0iOOo0Ii, true) : null;
                        } else {
/* 25 */                    oOo0IOI00IoiI = oOo0IO;
                        }
/* 26 */                if (oOo0IOI00IoiI != null) {
/* 29 */                    oOo0IO = oOo0IOI00IoiI;
                        }
                    }
/* 34 */            int i = (int) (j >> 32);
/* 35 */            float fIntBitsToFloat = Float.intBitsToFloat(i);
/* 39 */            float fIntBitsToFloat2 = oOo0IO.I00000oIO;
/* 43 */            if (fIntBitsToFloat >= fIntBitsToFloat2) {
/* 46 */                float fIntBitsToFloat3 = Float.intBitsToFloat(i);
/* 50 */                fIntBitsToFloat2 = oOo0IO.I0000Il00O;
/* 54 */                if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
/* 57 */                    fIntBitsToFloat2 = Float.intBitsToFloat(i);
                        }
                    }
/* 67 */            int i2 = (int) (j & 4294967295L);
/* 68 */            float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
/* 72 */            float fIntBitsToFloat5 = oOo0IO.I00000oOI;
/* 76 */            if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
/* 79 */                float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
/* 83 */                fIntBitsToFloat5 = oOo0IO.I0000O;
/* 87 */                if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
/* 90 */                    fIntBitsToFloat5 = Float.intBitsToFloat(i2);
                        }
                    }
/* 107 */           return (Float.floatToRawIntBits(fIntBitsToFloat2) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat5) & 4294967295L);
                }

                public final int I00000oOI(long j, boolean z) {
/* 1 */             if (z) {
/* 3 */                 j = I00000oIO(j);
                    }
/* 15 */            return this.I00000oIO.I00000oOI.I000II(I0000O(j));
                }

                public final boolean I0000Il00O(long j) {
/* 5 */             long jI0000O = I0000O(I00000oIO(j));
/* 9 */             Oo0iil0o0oI oo0iil0o0oI = this.I00000oIO;
/* 24 */            int iI0000oI00 = oo0iil0o0oI.I00000oOI.I0000oI00(Float.intBitsToFloat((int) (4294967295L & jI0000O)));
/* 31 */            int i = (int) (jI0000O >> 32);
                    return Float.intBitsToFloat(i) >= oo0iil0o0oI.I0001Ioi1lo(iI0000oI00) && Float.intBitsToFloat(i) <= oo0iil0o0oI.I000II(iI0000oI00);
                }

                public final long I0000O(long j) {
                    O0iOOo0Ii o0iOOo0Ii;
/* 1 */             O0iOOo0Ii o0iOOo0Ii2 = this.I00000oOI;
/* 3 */             if (o0iOOo0Ii2 != null) {
/* 10 */                if (!o0iOOo0Ii2.I0010o()) {
/* 13 */                    o0iOOo0Ii2 = null;
                        }
/* 14 */                if (o0iOOo0Ii2 != null && (o0iOOo0Ii = this.I0000Il00O) != null) {
/* 25 */                    O0iOOo0Ii o0iOOo0Ii3 = o0iOOo0Ii.I0010o() ? o0iOOo0Ii : null;
/* 28 */                    if (o0iOOo0Ii3 != null) {
/* 31 */                        return o0iOOo0Ii2.I00IoIO0lI(o0iOOo0Ii3, j);
                            }
                        }
                    }
/* 77 */            return j;
                }

                public final long I0000oI00(long j) {
                    O0iOOo0Ii o0iOOo0Ii;
/* 1 */             O0iOOo0Ii o0iOOo0Ii2 = this.I00000oOI;
/* 3 */             if (o0iOOo0Ii2 != null) {
/* 10 */                if (!o0iOOo0Ii2.I0010o()) {
/* 13 */                    o0iOOo0Ii2 = null;
                        }
/* 14 */                if (o0iOOo0Ii2 != null && (o0iOOo0Ii = this.I0000Il00O) != null) {
/* 25 */                    O0iOOo0Ii o0iOOo0Ii3 = o0iOOo0Ii.I0010o() ? o0iOOo0Ii : null;
/* 28 */                    if (o0iOOo0Ii3 != null) {
/* 31 */                        return o0iOOo0Ii3.I00IoIO0lI(o0iOOo0Ii2, j);
                            }
                        }
                    }
/* 77 */            return j;
                }
            }

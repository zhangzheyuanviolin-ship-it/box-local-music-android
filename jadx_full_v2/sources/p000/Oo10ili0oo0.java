            package p000;
            
            public final class Oo10ili0oo0 {
                public OI0l1oli1I I00000oIO;
                public Oo10Oioll0 I00000oOI;
                public long I0000Il00O;
                public long I0000O;
                public long I0000oI00;
                public long I0001Ioi1lo;
                public float[] I000II;

                public final void I00000oIO(Oo10Oioll0 oo10Oioll0, long j, long j2, float[] fArr, long j3) {
/* 3 */             long j4 = oo10Oioll0.I000II;
/* 23 */            if (j3 - j4 > 0 || j4 == Long.MIN_VALUE) {
/* 25 */                oo10Oioll0.I000II = j3;
/* 36 */                oo10Oioll0.I00000oIO(oo10Oioll0.I0000oI00, oo10Oioll0.I0001Ioi1lo, j, j2, fArr);
                    }
                }

                public final boolean I00000oOI(long j, long j2, float[] fArr, int i, int i2) {
                    boolean z;
/* 8 */             if (IooO0O.I0000Il00O(j2, this.I0000O)) {
/* 14 */                z = false;
                    } else {
/* 10 */                this.I0000O = j2;
/* 12 */                z = true;
                    }
/* 21 */            if (!IooO0O.I0000Il00O(j, this.I0000oI00)) {
/* 23 */                this.I0000oI00 = j;
/* 25 */                z = true;
                    }
/* 26 */            if (fArr != null) {
/* 28 */                this.I000II = fArr;
/* 30 */                z = true;
                    }
/* 42 */            long j3 = (i << 32) | (i2 & 4294967295L);
/* 47 */            if (j3 == this.I0001Ioi1lo) {
/* 399 */               return z;
                    }
/* 49 */            this.I0001Ioi1lo = j3;
/* 7 */             return true;
                }
            }

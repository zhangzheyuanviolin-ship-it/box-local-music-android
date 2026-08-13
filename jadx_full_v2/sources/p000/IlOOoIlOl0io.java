            package p000;
            
            public final class IlOOoIlOl0io implements IlOO1o00IOi {
                public int I00000oIO;
                public IioIllI11l0I I00000oOI;
                public long I0000Il00O;
                public long I0000O;

                @Override
                public final float I00000oOI(long j, float f, float f2, float f3) {
/* 3 */             long j2 = j - this.I0000O;
/* 5 */             long j3 = this.I0000Il00O;
/* 11 */            if (j2 < 0) {
/* 13 */                j2 = 0;
                    }
/* 20 */            long j4 = j2 > j3 ? j3 : j2;
/* 23 */            if (j4 == 0) {
/* 25 */                return f3;
                    }
/* 47 */            return (I0000oI00(j4, f, f2, f3) - I0000oI00(j4 - 1000000, f, f2, f3)) * 1000.0f;
                }

                @Override
                public final long I0000Il00O(float f, float f2, float f3) {
/* 5 */             return this.I0000O + this.I0000Il00O;
                }

                @Override
                public final float I0000oI00(long j, float f, float f2, float f3) {
/* 3 */             long j2 = j - this.I0000O;
/* 4 */             long j3 = this.I0000Il00O;
/* 10 */            if (j2 < 0) {
/* 12 */                j2 = 0;
                    }
/* 15 */            if (j2 > j3) {
/* 17 */                j2 = j3;
                    }
/* 31 */            float fI00000oIO = this.I00000oOI.I00000oIO(this.I00000oIO == 0 ? 1.0f : j2 / j3);
/* 38 */            return (f2 * fI00000oIO) + ((1.0f - fI00000oIO) * f);
                }
            }

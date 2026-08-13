            package p000;
            
            public final class I1ili10li {
                public int I00000oIO;
                public int I00000oOI;
                public float I0000Il00O;
                public float I0000O;
                public long I0000oI00;
                public long I0001Ioi1lo;
                public long I000II;
                public float I000O01llI0;
                public int I000OOo1O;

                public final float I00000oIO(long j) {
/* 6 */             if (j < this.I0000oI00) {
/* 5 */                 return 0.0f;
                    }
/* 9 */             long j2 = this.I000II;
/* 17 */            if (j2 < 0 || j < j2) {
/* 53 */                return O10lo00.I00000oOI((j - r0) / this.I00000oIO, 0.0f, 1.0f) * 0.5f;
                    }
/* 25 */            float f = this.I000O01llI0;
/* 39 */            return (O10lo00.I00000oOI((j - j2) / this.I000OOo1O, 0.0f, 1.0f) * f) + (1.0f - f);
                }
            }

            package p000;
            
            public abstract class IO1OO01i0 {
                public final IO1iIoo I00000oIO;
                public final IO1loo I00000oOI;
                public final float I0000Il00O;
                public final String I0000O;
                public final boolean I0000oI00;
                public final boolean I0001Ioi1lo;

                public IO1OO01i0(IO1iIoo iO1iIoo, IO1loo iO1loo, float f, String str, boolean z, int i) {
/* 3 */             f = (i & 4) != 0 ? -1.0f : f;
/* 11 */            str = (i & 8) != 0 ? "" : str;
/* 16 */            z = (i & 16) != 0 ? false : z;
/* 21 */            boolean z2 = (i & 32) == 0;
/* 28 */            this.I00000oIO = iO1iIoo;
/* 30 */            this.I00000oOI = iO1loo;
/* 32 */            this.I0000Il00O = f;
/* 34 */            this.I0000O = str;
/* 36 */            this.I0000oI00 = z;
/* 38 */            this.I0001Ioi1lo = z2;
                }

                public String I00000oIO() {
/* 1 */             return this.I0000O;
                }

                public boolean I00000oOI() {
/* 1 */             return this.I0000oI00;
                }

                public float I0000Il00O() {
/* 1 */             return this.I0000Il00O;
                }

                public IO1loo I0000O() {
/* 1 */             return this.I00000oOI;
                }
            }

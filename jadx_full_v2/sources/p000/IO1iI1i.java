            package p000;
            
/* 27 */    public final class IO1iI1i extends IO1OO01i0 {
                public final String I000II;
                public final IO1loo I000O01llI0;
                public final float I000OOo1O;
                public final boolean I000OiO;
                public IO1Oii I000iOII;
                public final String I000l1;
                public final boolean I000lI;

                public IO1iI1i(String str, IO1loo iO1loo, float f, String str2, boolean z, int i) {
/* 25 */            this(str, iO1loo, (i & 4) != 0 ? 0.0f : f, true, null, (i & 32) != 0 ? "" : str2, (i & 64) != 0 ? false : z);
                }

                @Override
                public final String I00000oIO() {
/* 1 */             return this.I000l1;
                }

                @Override
                public final boolean I00000oOI() {
/* 1 */             return this.I000lI;
                }

                @Override
                public final float I0000Il00O() {
/* 1 */             return this.I000OOo1O;
                }

                @Override
                public final IO1loo I0000O() {
/* 1 */             return this.I000O01llI0;
                }

/* 28 */        public IO1iI1i(String str, IO1loo iO1loo, float f, boolean z, IO1Oii iO1Oii, String str2, boolean z2) {
/* 30 */            super(IO1iIoo.I00iio, iO1loo, f, str2, z2, 32);
/* 31 */            this.I000II = str;
/* 32 */            this.I000O01llI0 = iO1loo;
/* 33 */            this.I000OOo1O = f;
/* 34 */            this.I000OiO = z;
/* 35 */            this.I000iOII = iO1Oii;
/* 36 */            this.I000l1 = str2;
/* 37 */            this.I000lI = z2;
                }
            }

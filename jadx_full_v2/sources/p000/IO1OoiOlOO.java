            package p000;

            import java.util.List;
            
            public final class IO1OoiOlOO extends IO1OO01i0 {
                public final List I000II;
                public final List I000O01llI0;
                public final int I000OOo1O;
                public final IO1loo I000OiO;
                public final float I000iOII;
                public final String I000l1;
                public final boolean I000lI;

                /* JADX WARN: Illegal instructions before constructor call */
                public IO1OoiOlOO(List list, List list2, int i, IO1loo iO1loo, int i2) {
/* 3 */             i = (i2 & 4) != 0 ? 200 : i;
/* 14 */            float f = (i2 & 16) != 0 ? 0.0f : -1.0f;
/* 24 */            boolean z = (i2 & 64) == 0;
/* 34 */            super(IO1iIoo.I00ilI0I1, iO1loo, f, "", z, 32);
/* 37 */            this.I000II = list;
/* 39 */            this.I000O01llI0 = list2;
/* 41 */            this.I000OOo1O = i;
/* 43 */            this.I000OiO = iO1loo;
/* 45 */            this.I000iOII = f;
/* 47 */            this.I000l1 = "";
/* 49 */            this.I000lI = z;
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
/* 1 */             return this.I000iOII;
                }

                @Override
                public final IO1loo I0000O() {
/* 1 */             return this.I000OiO;
                }
            }

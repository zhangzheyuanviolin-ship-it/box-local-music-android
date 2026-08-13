            package p000;

            import java.util.List;
            
/* 47 */    public final class O01o1IoI1 extends O01o0Oi1iO {
                public O01ioO1o0i11 I000OiO;
                public List I000iOII;
                public int I000l1;
                public int I000lI;

                @Override
                public final int I000II(OilOloI oilOloI) {
/* 1 */             int i = this.I000lI;
/* 7 */             if (i >= this.I000l1 - 1) {
/* 14 */                return -1;
                    }
/* 9 */             int i2 = i + 1;
/* 11 */            this.I000lI = i2;
/* 13 */            return i2;
                }

                @Override
                public final O01O0o1iI I00IO1(String str) {
                    return this.I000lI % 2 == 0 ? O01O1110.I00000oOI(str) : (O01O0o1iI) O1Oii0O0loo.I00000oOI(str, this.I000OiO);
                }

                @Override
                public final String I00O0o1oo(OilOloI oilOloI, int i) {
/* 9 */             return (String) this.I000iOII.get(i / 2);
                }

                @Override
                public final O01O0o1iI I00OI1() {
/* 1 */             return this.I000OiO;
                }

                @Override
                public final O01ioO1o0i11 I00OI1() {
/* 1 */             return this.I000OiO;
                }

                @Override
/* 48 */        public final void I000oI1ioi(OilOloI oilOloI) {
                }
            }

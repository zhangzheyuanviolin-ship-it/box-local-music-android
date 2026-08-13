            package p000;
            
            public final class O01liO extends I011lO1liO1O {
                public final O01O0o1iI I0001Ioi1lo;

                public O01liO(O011OoiO1 o011OoiO1, O01O0o1iI o01O0o1iI, String str) {
/* 1 */             super(o011OoiO1, str);
/* 4 */             this.I0001Ioi1lo = o01O0o1iI;
/* 10 */            this.I00000oIO.add("primitive");
                }

                @Override
                public final int I000II(OilOloI oilOloI) {
/* 1 */             return 0;
                }

                @Override
                public final O01O0o1iI I00IO1(String str) {
/* 3 */             if (str == "primitive") {
/* 5 */                 return this.I0001Ioi1lo;
                    }
/* 10 */            I000II.I000iOII("This input can only handle primitives with 'primitive' tag");
/* 13 */            return null;
                }

                @Override
                public final O01O0o1iI I00OI1() {
/* 1 */             return this.I0001Ioi1lo;
                }
            }

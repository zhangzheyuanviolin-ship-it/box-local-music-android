            package p000;
            
            public final class O01o0OlOo1o extends I011lO1liO1O {
                public final O011oi0l1O I0001Ioi1lo;
                public final int I000II;
                public int I000O01llI0;

                public O01o0OlOo1o(O011OoiO1 o011OoiO1, O011oi0l1O o011oi0l1O) {
/* 2 */             super(o011OoiO1, null);
/* 5 */             this.I0001Ioi1lo = o011oi0l1O;
/* 13 */            this.I000II = o011oi0l1O.I00iOIl.size();
/* 16 */            this.I000O01llI0 = -1;
                }

                @Override
                public final int I000II(OilOloI oilOloI) {
/* 1 */             int i = this.I000O01llI0;
/* 7 */             if (i >= this.I000II - 1) {
/* 14 */                return -1;
                    }
/* 9 */             int i2 = i + 1;
/* 11 */            this.I000O01llI0 = i2;
/* 13 */            return i2;
                }

                @Override
                public final O01O0o1iI I00IO1(String str) throws NumberFormatException {
/* 13 */            return (O01O0o1iI) this.I0001Ioi1lo.I00iOIl.get(Integer.parseInt(str));
                }

                @Override
                public final String I00O0o1oo(OilOloI oilOloI, int i) {
/* 1 */             return String.valueOf(i);
                }

                @Override
                public final O01O0o1iI I00OI1() {
/* 1 */             return this.I0001Ioi1lo;
                }
            }

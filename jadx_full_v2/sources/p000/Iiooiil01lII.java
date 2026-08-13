            package p000;
            
/* 18 */    public final class Iiooiil01lII implements IiooiiI01Olo {
                public final int I00iOIl;
                public int I00iiI = -1;
                public int I00iiO = -1;

                public Iiooiil01lII(int i) {
/* 9 */             this.I00iOIl = i;
                }

                @Override
                public final boolean I000o00OoI0I(CharSequence charSequence, int i, int i2, OoOl1ol1l ooOl1ol1l) {
/* 2 */             int i3 = this.I00iOIl;
/* 4 */             if (i > i3 || i3 >= i2) {
                        return i2 <= i3;
                    }
/* 8 */             this.I00iiI = i;
/* 10 */            this.I00iiO = i2;
/* 1 */             return false;
                }

                @Override
/* 19 */        public final Object I000l1() {
/* 20 */            return this;
                }
            }

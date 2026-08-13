            package p000;

            import java.util.Arrays;
            
            public final class Iolii1loo1 extends OO1Ol1i {
                public final boolean I000l1;

                public Iolii1loo1(String str, Io00l010I io00l010I) {
/* 2 */             super(str, io00l010I, 1);
/* 5 */             this.I000l1 = true;
                }

                @Override
                public final boolean I00100o1O0lo() {
/* 1 */             return this.I000l1;
                }

                @Override
                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 117 */               return true;
                    }
/* 8 */             if (obj instanceof Iolii1loo1) {
/* 13 */                OilOloI oilOloI = (OilOloI) obj;
/* 25 */                if (this.I00000oIO.equals(oilOloI.I00000oIO())) {
/* 28 */                    Iolii1loo1 iolii1loo1 = (Iolii1loo1) obj;
/* 32 */                    if (iolii1loo1.I000l1 && Arrays.equals((OilOloI[]) this.I000OiO.getValue(), (OilOloI[]) iolii1loo1.I000OiO.getValue())) {
/* 56 */                        int iI0000oI00 = oilOloI.I0000oI00();
/* 60 */                        int i = this.I0000Il00O;
/* 62 */                        if (i == iI0000oI00) {
/* 66 */                            for (int i2 = 0; i2 < i; i2++) {
/* 88 */                                if (O0000Ioio00.I0000O(I000O01llI0(i2).I00000oIO(), oilOloI.I000O01llI0(i2).I00000oIO()) && O0000Ioio00.I0000O(I000O01llI0(i2).I000oI1ioi(), oilOloI.I000O01llI0(i2).I000oI1ioi())) {
                                        }
                                    }
/* 117 */                           return true;
                                }
                            }
                        }
                    }
/* 7 */             return false;
                }

                @Override
                public final int hashCode() {
/* 5 */             return super.hashCode() * 31;
                }
            }

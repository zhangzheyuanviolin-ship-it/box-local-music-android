            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Ooi0o1iliIOI extends OOIOil00IIo {
                public static final Ooi0o1iliIOI I0000Il00O = new Ooi0o1iliIOI(Ooi10IOl1.I00000oIO);

                @Override
                public final int I000O01llI0(Object obj) {
/* 5 */             return ((Ooi0l101o) obj).I00iOIl.length;
                }

                @Override
                public final void I000OiO(IOl1ii1loO iOl1ii1loO, int i, Object obj) {
/* 1 */             Ooi0l11io0oI ooi0l11io0oI = (Ooi0l11io0oI) obj;
/* 9 */             long jI001IIilI0O = iOl1ii1loO.I0000Il00O(this.I00000oOI, i).I001IIilI0O();
/* 7 */             ooi0l11io0oI.I00000oOI(ooi0l11io0oI.I0000O() + 1);
/* 16 */            long[] jArr = ooi0l11io0oI.I00000oIO;
/* 18 */            int i2 = ooi0l11io0oI.I00000oOI;
/* 22 */            ooi0l11io0oI.I00000oOI = i2 + 1;
/* 24 */            jArr[i2] = jI001IIilI0O;
                }

                @Override
                public final Object I000iOII(Object obj) {
/* 3 */             long[] jArr = ((Ooi0l101o) obj).I00iOIl;
/* 7 */             Ooi0l11io0oI ooi0l11io0oI = new Ooi0l11io0oI();
/* 10 */            ooi0l11io0oI.I00000oIO = jArr;
/* 13 */            ooi0l11io0oI.I00000oOI = jArr.length;
/* 17 */            ooi0l11io0oI.I00000oOI(10);
/* 49 */            return ooi0l11io0oI;
                }

                @Override
                public final Object I000o00OoI0I() {
/* 6 */             Ooi0l101o ooi0l101o = new Ooi0l101o();
/* 9 */             ooi0l101o.I00iOIl = new long[0];
/* 11 */            VarHandle.storeStoreFence();
/* 29 */            return ooi0l101o;
                }

                @Override
                public final void I000oI1ioi(IOl1l0o0i1I0 iOl1l0o0i1I0, Object obj, int i) {
/* 3 */             long[] jArr = ((Ooi0l101o) obj).I00iOIl;
/* 6 */             for (int i2 = 0; i2 < i; i2++) {
/* 16 */                iOl1l0o0i1I0.I001lllioOl(this.I00000oOI, i2).I001l0I00(jArr[i2]);
                    }
                }
            }

            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Ooi1iI1I0I0I extends OOIOil00IIo {
                public static final Ooi1iI1I0I0I I0000Il00O = new Ooi1iI1I0I0I(Ooi1l0.I00000oIO);

                @Override
                public final int I000O01llI0(Object obj) {
/* 5 */             return ((Ooi1Ioi10) obj).I00iOIl.length;
                }

                @Override
                public final void I000OiO(IOl1ii1loO iOl1ii1loO, int i, Object obj) {
/* 1 */             Ooi1OOiii ooi1OOiii = (Ooi1OOiii) obj;
/* 9 */             short sI001lllioOl = iOl1ii1loO.I0000Il00O(this.I00000oOI, i).I001lllioOl();
/* 7 */             ooi1OOiii.I00000oOI(ooi1OOiii.I0000O() + 1);
/* 16 */            short[] sArr = ooi1OOiii.I00000oIO;
/* 18 */            int i2 = ooi1OOiii.I00000oOI;
/* 22 */            ooi1OOiii.I00000oOI = i2 + 1;
/* 24 */            sArr[i2] = sI001lllioOl;
                }

                @Override
                public final Object I000iOII(Object obj) {
/* 3 */             short[] sArr = ((Ooi1Ioi10) obj).I00iOIl;
/* 7 */             Ooi1OOiii ooi1OOiii = new Ooi1OOiii();
/* 10 */            ooi1OOiii.I00000oIO = sArr;
/* 13 */            ooi1OOiii.I00000oOI = sArr.length;
/* 17 */            ooi1OOiii.I00000oOI(10);
/* 49 */            return ooi1OOiii;
                }

                @Override
                public final Object I000o00OoI0I() {
/* 6 */             Ooi1Ioi10 ooi1Ioi10 = new Ooi1Ioi10();
/* 9 */             ooi1Ioi10.I00iOIl = new short[0];
/* 11 */            VarHandle.storeStoreFence();
/* 29 */            return ooi1Ioi10;
                }

                @Override
                public final void I000oI1ioi(IOl1l0o0i1I0 iOl1l0o0i1I0, Object obj, int i) {
/* 3 */             short[] sArr = ((Ooi1Ioi10) obj).I00iOIl;
/* 6 */             for (int i2 = 0; i2 < i; i2++) {
/* 16 */                iOl1l0o0i1I0.I001lllioOl(this.I00000oOI, i2).I000II(sArr[i2]);
                    }
                }
            }

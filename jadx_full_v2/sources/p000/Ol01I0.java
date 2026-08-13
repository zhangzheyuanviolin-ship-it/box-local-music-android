            package p000;
            
            public final class Ol01I0 extends OOIOil00IIo {
                public static final Ol01I0 I0000Il00O = new Ol01I0(Ol01I1i.I00000oIO);

                @Override
                public final int I000O01llI0(Object obj) {
/* 3 */             return ((short[]) obj).length;
                }

                @Override
                public final void I000OiO(IOl1ii1loO iOl1ii1loO, int i, Object obj) {
/* 1 */             Ol011I ol011I = (Ol011I) obj;
/* 5 */             short sI000o00OoI0I = iOl1ii1loO.I000o00OoI0I(this.I00000oOI, i);
/* 7 */             ol011I.I00000oOI(ol011I.I0000O() + 1);
/* 12 */            short[] sArr = ol011I.I00000oIO;
/* 14 */            int i2 = ol011I.I00000oOI;
/* 18 */            ol011I.I00000oOI = i2 + 1;
/* 20 */            sArr[i2] = sI000o00OoI0I;
                }

                @Override
                public final Object I000iOII(Object obj) {
/* 1 */             short[] sArr = (short[]) obj;
/* 5 */             Ol011I ol011I = new Ol011I();
/* 8 */             ol011I.I00000oIO = sArr;
/* 11 */            ol011I.I00000oOI = sArr.length;
/* 15 */            ol011I.I00000oOI(10);
/* 49 */            return ol011I;
                }

                @Override
                public final Object I000o00OoI0I() {
/* 2 */             return new short[0];
                }

                @Override
                public final void I000oI1ioi(IOl1l0o0i1I0 iOl1l0o0i1I0, Object obj, int i) {
/* 1 */             short[] sArr = (short[]) obj;
/* 4 */             for (int i2 = 0; i2 < i; i2++) {
/* 10 */                iOl1l0o0i1I0.I0010o(this.I00000oOI, i2, sArr[i2]);
                    }
                }
            }

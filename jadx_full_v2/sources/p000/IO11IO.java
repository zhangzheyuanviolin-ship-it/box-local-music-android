            package p000;
            
            public final class IO11IO extends OOIOil00IIo {
                public static final IO11IO I0000Il00O = new IO11IO(IO11oIIII.I00000oIO);

                @Override
                public final int I000O01llI0(Object obj) {
/* 3 */             return ((char[]) obj).length;
                }

                @Override
                public final void I000OiO(IOl1ii1loO iOl1ii1loO, int i, Object obj) {
/* 1 */             IO10olo1l11 iO10olo1l11 = (IO10olo1l11) obj;
/* 5 */             char cI000O01llI0 = iOl1ii1loO.I000O01llI0(this.I00000oOI, i);
/* 7 */             iO10olo1l11.I00000oOI(iO10olo1l11.I0000O() + 1);
/* 12 */            char[] cArr = iO10olo1l11.I00000oIO;
/* 14 */            int i2 = iO10olo1l11.I00000oOI;
/* 18 */            iO10olo1l11.I00000oOI = i2 + 1;
/* 20 */            cArr[i2] = cI000O01llI0;
                }

                @Override
                public final Object I000iOII(Object obj) {
/* 1 */             char[] cArr = (char[]) obj;
/* 5 */             IO10olo1l11 iO10olo1l11 = new IO10olo1l11();
/* 8 */             iO10olo1l11.I00000oIO = cArr;
/* 11 */            iO10olo1l11.I00000oOI = cArr.length;
/* 15 */            iO10olo1l11.I00000oOI(10);
/* 49 */            return iO10olo1l11;
                }

                @Override
                public final Object I000o00OoI0I() {
/* 2 */             return new char[0];
                }

                @Override
                public final void I000oI1ioi(IOl1l0o0i1I0 iOl1l0o0i1I0, Object obj, int i) {
/* 1 */             char[] cArr = (char[]) obj;
/* 4 */             for (int i2 = 0; i2 < i; i2++) {
/* 10 */                iOl1l0o0i1I0.I001i1O0Ol(this.I00000oOI, i2, cArr[i2]);
                    }
                }
            }

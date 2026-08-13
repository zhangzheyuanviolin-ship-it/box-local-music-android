            package p000;
            
            public final class II11O1o0 extends OOIOil00IIo {
                public static final II11O1o0 I0000Il00O = new II11O1o0(II11OOi.I00000oIO);

                @Override
                public final int I000O01llI0(Object obj) {
/* 3 */             return ((boolean[]) obj).length;
                }

                @Override
                public final void I000OiO(IOl1ii1loO iOl1ii1loO, int i, Object obj) {
/* 1 */             II111l iI111l = (II111l) obj;
/* 5 */             boolean zI001iOo1i0O = iOl1ii1loO.I001iOo1i0O(this.I00000oOI, i);
/* 7 */             iI111l.I00000oOI(iI111l.I0000O() + 1);
/* 12 */            boolean[] zArr = iI111l.I00000oIO;
/* 14 */            int i2 = iI111l.I00000oOI;
/* 18 */            iI111l.I00000oOI = i2 + 1;
/* 20 */            zArr[i2] = zI001iOo1i0O;
                }

                @Override
                public final Object I000iOII(Object obj) {
/* 1 */             boolean[] zArr = (boolean[]) obj;
/* 5 */             II111l iI111l = new II111l();
/* 8 */             iI111l.I00000oIO = zArr;
/* 11 */            iI111l.I00000oOI = zArr.length;
/* 15 */            iI111l.I00000oOI(10);
/* 49 */            return iI111l;
                }

                @Override
                public final Object I000o00OoI0I() {
/* 2 */             return new boolean[0];
                }

                @Override
                public final void I000oI1ioi(IOl1l0o0i1I0 iOl1l0o0i1I0, Object obj, int i) {
/* 1 */             boolean[] zArr = (boolean[]) obj;
/* 4 */             for (int i2 = 0; i2 < i; i2++) {
/* 10 */                iOl1l0o0i1I0.I001IIilI0O(this.I00000oOI, i2, zArr[i2]);
                    }
                }
            }

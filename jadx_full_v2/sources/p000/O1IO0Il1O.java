            package p000;
            
            public final class O1IO0Il1O extends OOIOil00IIo {
                public static final O1IO0Il1O I0000Il00O = new O1IO0Il1O(O1IOi1i.I00000oIO);

                @Override
                public final int I000O01llI0(Object obj) {
/* 3 */             return ((long[]) obj).length;
                }

                @Override
                public final void I000OiO(IOl1ii1loO iOl1ii1loO, int i, Object obj) {
/* 1 */             O1IIioo10i o1IIioo10i = (O1IIioo10i) obj;
/* 5 */             long jI00II0Ol1O0l = iOl1ii1loO.I00II0Ol1O0l(this.I00000oOI, i);
/* 7 */             o1IIioo10i.I00000oOI(o1IIioo10i.I0000O() + 1);
/* 12 */            long[] jArr = o1IIioo10i.I00000oIO;
/* 14 */            int i2 = o1IIioo10i.I00000oOI;
/* 18 */            o1IIioo10i.I00000oOI = i2 + 1;
/* 20 */            jArr[i2] = jI00II0Ol1O0l;
                }

                @Override
                public final Object I000iOII(Object obj) {
/* 1 */             long[] jArr = (long[]) obj;
/* 5 */             O1IIioo10i o1IIioo10i = new O1IIioo10i();
/* 8 */             o1IIioo10i.I00000oIO = jArr;
/* 11 */            o1IIioo10i.I00000oOI = jArr.length;
/* 15 */            o1IIioo10i.I00000oOI(10);
/* 49 */            return o1IIioo10i;
                }

                @Override
                public final Object I000o00OoI0I() {
/* 2 */             return new long[0];
                }

                @Override
                public final void I000oI1ioi(IOl1l0o0i1I0 iOl1l0o0i1I0, Object obj, int i) {
/* 1 */             long[] jArr = (long[]) obj;
/* 4 */             for (int i2 = 0; i2 < i; i2++) {
/* 10 */                iOl1l0o0i1I0.I000O01llI0(this.I00000oOI, i2, jArr[i2]);
                    }
                }
            }

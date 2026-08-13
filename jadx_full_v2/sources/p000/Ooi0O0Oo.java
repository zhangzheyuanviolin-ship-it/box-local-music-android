            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Ooi0O0Oo extends OOIOil00IIo {
                public static final Ooi0O0Oo I0000Il00O = new Ooi0O0Oo(Ooi0OlO.I00000oIO);

                @Override
                public final int I000O01llI0(Object obj) {
/* 5 */             return ((Ooi0IOoioOOl) obj).I00iOIl.length;
                }

                @Override
                public final void I000OiO(IOl1ii1loO iOl1ii1loO, int i, Object obj) {
/* 1 */             Ooi0IiO0oIol ooi0IiO0oIol = (Ooi0IiO0oIol) obj;
/* 9 */             int iI000lI = iOl1ii1loO.I0000Il00O(this.I00000oOI, i).I000lI();
/* 7 */             ooi0IiO0oIol.I00000oOI(ooi0IiO0oIol.I0000O() + 1);
/* 16 */            int[] iArr = ooi0IiO0oIol.I00000oIO;
/* 18 */            int i2 = ooi0IiO0oIol.I00000oOI;
/* 22 */            ooi0IiO0oIol.I00000oOI = i2 + 1;
/* 24 */            iArr[i2] = iI000lI;
                }

                @Override
                public final Object I000iOII(Object obj) {
/* 3 */             int[] iArr = ((Ooi0IOoioOOl) obj).I00iOIl;
/* 7 */             Ooi0IiO0oIol ooi0IiO0oIol = new Ooi0IiO0oIol();
/* 10 */            ooi0IiO0oIol.I00000oIO = iArr;
/* 13 */            ooi0IiO0oIol.I00000oOI = iArr.length;
/* 17 */            ooi0IiO0oIol.I00000oOI(10);
/* 49 */            return ooi0IiO0oIol;
                }

                @Override
                public final Object I000o00OoI0I() {
/* 6 */             Ooi0IOoioOOl ooi0IOoioOOl = new Ooi0IOoioOOl();
/* 9 */             ooi0IOoioOOl.I00iOIl = new int[0];
/* 11 */            VarHandle.storeStoreFence();
/* 29 */            return ooi0IOoioOOl;
                }

                @Override
                public final void I000oI1ioi(IOl1l0o0i1I0 iOl1l0o0i1I0, Object obj, int i) {
/* 3 */             int[] iArr = ((Ooi0IOoioOOl) obj).I00iOIl;
/* 6 */             for (int i2 = 0; i2 < i; i2++) {
/* 16 */                iOl1l0o0i1I0.I001lllioOl(this.I00000oOI, i2).I001i1lo1io(iArr[i2]);
                    }
                }
            }

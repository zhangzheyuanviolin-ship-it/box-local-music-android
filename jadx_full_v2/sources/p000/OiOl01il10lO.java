            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OiOl01il10lO implements OiOoi0I0o0i {
                public static final IoloOio0I I000iOII = OiIoloOl0.I00000oIO(new OiO01i(7), new OiIoloo(23));
                public final OIooi1iOiOol I00000oIO;
                public final OIooi1iOiOol I00000oOI = new OIooi1iOiOol(0);
                public final OIooi1iOiOol I0000Il00O = new OIooi1iOiOol(0);
                public final OIooliIO0 I0000O = lOO00IiI0li.I00000oIO(Boolean.FALSE);
                public final OI0lOIiOIOOo I0000oI00 = l001l0.I00000oIO();
                public final OIooi1iOiOol I0001Ioi1lo = new OIooi1iOiOol(Integer.MAX_VALUE);
                public float I000II;
                public final IiI11iIOlOo1 I000O01llI0;
                public final IiO0o1I I000OOo1O;
                public final IiO0o1I I000OiO;

                public OiOl01il10lO(int i) {
/* 9 */             this.I00000oIO = new OIooi1iOiOol(i);
/* 54 */            OIoO1Ol oIoO1Ol = new OIoO1Ol(21);
/* 57 */            oIoO1Ol.I00iiI = this;
/* 59 */            VarHandle.storeStoreFence();
/* 66 */            this.I000O01llI0 = lO10O1ol0OO0.I00000oIO(oIoO1Ol);
/* 70 */            OiOilll1o0Ii oiOilll1o0Ii = new OiOilll1o0Ii(0);
/* 73 */            oiOilll1o0Ii.I00iiI = this;
/* 75 */            VarHandle.storeStoreFence();
/* 82 */            this.I000OOo1O = Ol1llolil.I00000oOI(oiOilll1o0Ii);
/* 87 */            OiOilll1o0Ii oiOilll1o0Ii2 = new OiOilll1o0Ii(1);
/* 90 */            oiOilll1o0Ii2.I00iiI = this;
/* 92 */            VarHandle.storeStoreFence();
/* 99 */            this.I000OiO = Ol1llolil.I00000oOI(oiOilll1o0Ii2);
                }

                @Override
                public final boolean I00000oIO() {
/* 3 */             return this.I000O01llI0.I00000oIO();
                }

                @Override
                public final boolean I00000oOI() {
/* 9 */             return ((Boolean) this.I000OiO.getValue()).booleanValue();
                }

                @Override
                public final Object I0000Il00O(OI110lo oI110lo, IlliIl1l11O illiIl1l11O, IOoilo iOoilo) {
/* 3 */             Object objI0000Il00O = this.I000O01llI0.I0000Il00O(oI110lo, illiIl1l11O, iOoilo);
                    return objI0000Il00O == Ii0111o.I00iOIl ? objI0000Il00O : OoiIlOl1iI.I00000oIO;
                }

                @Override
                public final boolean I0000O() {
/* 9 */             return ((Boolean) this.I000OOo1O.getValue()).booleanValue();
                }

                @Override
                public final float I0000oI00(float f) {
/* 3 */             return this.I000O01llI0.I0000oI00(f);
                }
            }

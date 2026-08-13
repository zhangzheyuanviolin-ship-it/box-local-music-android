            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Ii0iio implements Io00l010I {
                public static final Ii0iio I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             Ii0iio ii0iio = new Ii0iio();
/* 6 */             I00000oIO = ii0iio;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.CustomRequest", ii0iio, 2);
/* 19 */            oO1Ol1i.I000OiO("method", false);
/* 24 */            oO1Ol1i.I000OiO("params", false);
/* 27 */            descriptor = oO1Ol1i;
                }

                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 8 */             return new O0O01001OOII[]{O1lll1OOooOI.I00000oIO, iOi1iol.I00000oIO(I1oOOi1OI10o.I00000oIO)};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 10 */            boolean z = true;
/* 11 */            int i = 0;
/* 12 */            O1llOlOo o1llOlOo = null;
/* 13 */            I1oOoOi1O i1oOoOi1O = null;
/* 14 */            while (z) {
/* 16 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
/* 21 */                if (iI000II == -1) {
/* 53 */                    z = false;
                        } else if (iI000II == 0) {
/* 48 */                    o1llOlOo = (O1llOlOo) iOl1ii1loOI00000oOI.I00100o1O0lo(oilOloI, 0, O1lll1OOooOI.I00000oIO, o1llOlOo);
/* 50 */                    i |= 1;
                        } else {
/* 25 */                    if (iI000II != 1) {
/* 38 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 9 */                         return null;
                            }
/* 33 */                    i1oOoOi1O = (I1oOoOi1O) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 1, I1oOOi1OI10o.I00000oIO, i1oOoOi1O);
/* 35 */                    i |= 2;
                        }
                    }
/* 55 */            iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 63 */            if (3 != (i & 3)) {
/* 78 */                lI1IIO.I00000oIO(i, 3, descriptor);
/* 186 */               throw null;
                    }
/* 65 */            Ii0io0Ooi1I1 ii0io0Ooi1I1 = new Ii0io0Ooi1I1();
/* 68 */            ii0io0Ooi1I1.I00000oIO = o1llOlOo;
/* 70 */            ii0io0Ooi1I1.I00000oOI = i1oOoOi1O;
/* 72 */            VarHandle.storeStoreFence();
/* 75 */            return ii0io0Ooi1I1;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             Ii0io0Ooi1I1 ii0io0Ooi1I1 = (Ii0io0Ooi1I1) obj;
/* 3 */             OilOloI oilOloI = descriptor;
/* 5 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 14 */            iOl1l0o0i1I0I00000oOI.I000l1(oilOloI, 0, O1lll1OOooOI.I00000oIO, ii0io0Ooi1I1.I00000oIO);
/* 22 */            iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 1, I1oOOi1OI10o.I00000oIO, ii0io0Ooi1I1.I00000oOI);
/* 25 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OOilil1iI0l implements Io00l010I {
                public static final OOilil1iI0l I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             OOilil1iI0l oOilil1iI0l = new OOilil1iI0l();
/* 6 */             I00000oIO = oOilil1iI0l;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.RPCError", oOilil1iI0l, 3);
/* 19 */            oO1Ol1i.I000OiO("code", false);
/* 24 */            oO1Ol1i.I000OiO("message", false);
/* 30 */            oO1Ol1i.I000OiO("data", true);
/* 33 */            descriptor = oO1Ol1i;
                }

                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 8 */             return new O0O01001OOII[]{IooOIlOIIO.I00000oIO, OlOlllO.I00000oIO, iOi1iol.I00000oIO(O01O1i1i.I00000oIO)};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 10 */            boolean z = true;
/* 11 */            int i = 0;
/* 12 */            int iI0010I0i = 0;
/* 13 */            String strI000l1 = null;
/* 14 */            O01O0o1iI o01O0o1iI = null;
/* 15 */            while (z) {
/* 17 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
/* 22 */                if (iI000II == -1) {
/* 60 */                    z = false;
                        } else if (iI000II == 0) {
/* 53 */                    iI0010I0i = iOl1ii1loOI00000oOI.I0010I0i(oilOloI, 0);
/* 57 */                    i |= 1;
                        } else if (iI000II == 1) {
/* 46 */                    strI000l1 = iOl1ii1loOI00000oOI.I000l1(oilOloI, 1);
/* 50 */                    i |= 2;
                        } else {
/* 29 */                    if (iI000II != 2) {
/* 42 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 9 */                         return null;
                            }
/* 37 */                    o01O0o1iI = (O01O0o1iI) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 2, O01O1i1i.I00000oIO, o01O0o1iI);
/* 39 */                    i |= 4;
                        }
                    }
/* 62 */            iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 70 */            if (3 != (i & 3)) {
/* 94 */                lI1IIO.I00000oIO(i, 3, descriptor);
/* 186 */               throw null;
                    }
/* 72 */            OOillOoli oOillOoli = new OOillOoli();
/* 75 */            oOillOoli.I00000oIO = iI0010I0i;
/* 77 */            oOillOoli.I00000oOI = strI000l1;
/* 81 */            if ((i & 4) == 0) {
/* 83 */                oOillOoli.I0000Il00O = null;
                    } else {
/* 89 */                oOillOoli.I0000Il00O = o01O0o1iI;
                    }
/* 85 */            VarHandle.storeStoreFence();
/* 88 */            return oOillOoli;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             OOillOoli oOillOoli = (OOillOoli) obj;
/* 3 */             OilOloI oilOloI = descriptor;
/* 5 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 9 */             int i = oOillOoli.I00000oIO;
/* 11 */            O01O0o1iI o01O0o1iI = oOillOoli.I0000Il00O;
/* 14 */            iOl1l0o0i1I0I00000oOI.I00111O(0, i, oilOloI);
/* 20 */            iOl1l0o0i1I0I00000oOI.I001IO000(oilOloI, 1, oOillOoli.I00000oOI);
/* 27 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || o01O0o1iI != null) {
/* 35 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 2, O01O1i1i.I00000oIO, o01O0o1iI);
                    }
/* 38 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

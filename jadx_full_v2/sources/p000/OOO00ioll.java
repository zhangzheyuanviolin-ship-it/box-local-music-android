            package p000;
            
            public final class OOO00ioll implements Io00l010I {
                public static final OOO00ioll I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             OOO00ioll oOO00ioll = new OOO00ioll();
/* 6 */             I00000oIO = oOO00ioll;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.Progress", oOO00ioll, 3);
/* 19 */            oO1Ol1i.I000OiO("progress", false);
/* 25 */            oO1Ol1i.I000OiO("total", true);
/* 30 */            oO1Ol1i.I000OiO("message", true);
/* 33 */            descriptor = oO1Ol1i;
                }

                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 1 */             IiioO01 iiioO01 = IiioO01.I00000oIO;
/* 14 */            return new O0O01001OOII[]{iiioO01, iOi1iol.I00000oIO(iiioO01), iOi1iol.I00000oIO(OlOlllO.I00000oIO)};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 9 */             double dI001lIiIIo1O = 0.0d;
/* 12 */            boolean z = true;
/* 13 */            int i = 0;
/* 14 */            Double d = null;
/* 15 */            String str = null;
/* 16 */            while (z) {
/* 18 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
/* 23 */                if (iI000II == -1) {
/* 65 */                    z = false;
                        } else if (iI000II == 0) {
/* 58 */                    dI001lIiIIo1O = iOl1ii1loOI00000oOI.I001lIiIIo1O(oilOloI, 0);
/* 62 */                    i |= 1;
                        } else if (iI000II == 1) {
/* 53 */                    d = (Double) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 1, IiioO01.I00000oIO, d);
/* 55 */                    i |= 2;
                        } else {
/* 30 */                    if (iI000II != 2) {
/* 43 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 11 */                        return null;
                            }
/* 38 */                    str = (String) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 2, OlOlllO.I00000oIO, str);
/* 40 */                    i |= 4;
                        }
                    }
/* 67 */            iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 74 */            if (1 != (i & 1)) {
/* 102 */               lI1IIO.I00000oIO(i, 1, descriptor);
/* 186 */               throw null;
                    }
/* 76 */            OOO01I11Iol oOO01I11Iol = new OOO01I11Iol();
/* 79 */            oOO01I11Iol.I00000oIO = dI001lIiIIo1O;
/* 83 */            if ((i & 2) == 0) {
/* 85 */                oOO01I11Iol.I00000oOI = null;
                    } else {
/* 88 */                oOO01I11Iol.I00000oOI = d;
                    }
/* 92 */            if ((i & 4) == 0) {
/* 94 */                oOO01I11Iol.I0000Il00O = null;
/* 96 */                return oOO01I11Iol;
                    }
/* 97 */            oOO01I11Iol.I0000Il00O = str;
/* 99 */            return oOO01I11Iol;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             OOO01I11Iol oOO01I11Iol = (OOO01I11Iol) obj;
/* 3 */             OilOloI oilOloI = descriptor;
/* 5 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 9 */             double d = oOO01I11Iol.I00000oIO;
/* 11 */            String str = oOO01I11Iol.I0000Il00O;
/* 13 */            Double d2 = oOO01I11Iol.I00000oOI;
/* 16 */            iOl1l0o0i1I0I00000oOI.I000o00OoI0I(oilOloI, 0, d);
/* 23 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || d2 != null) {
/* 31 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 1, IiioO01.I00000oIO, d2);
                    }
/* 38 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || str != null) {
/* 46 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 2, OlOlllO.I00000oIO, str);
                    }
/* 49 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

            package p000;
            
            public final class O00i0iOol0 implements Io00l010I {
                public static final O00i0iOol0 I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             O00i0iOol0 o00i0iOol0 = new O00i0iOol0();
/* 6 */             I00000oIO = o00i0iOol0;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.JSONRPCNotification", o00i0iOol0, 3);
/* 19 */            oO1Ol1i.I000OiO("method", false);
/* 25 */            oO1Ol1i.I000OiO("params", true);
/* 30 */            oO1Ol1i.I000OiO("jsonrpc", true);
/* 33 */            descriptor = oO1Ol1i;
                }

                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 3 */             O0O01001OOII o0o01001ooiiI00000oIO = iOi1iol.I00000oIO(O01O1i1i.I00000oIO);
/* 10 */            OlOlllO olOlllO = OlOlllO.I00000oIO;
/* 8 */             return new O0O01001OOII[]{olOlllO, o0o01001ooiiI00000oIO, olOlllO};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 10 */            boolean z = true;
/* 11 */            int i = 0;
/* 12 */            String strI000l1 = null;
/* 13 */            O01O0o1iI o01O0o1iI = null;
/* 14 */            String strI000l12 = null;
/* 15 */            while (z) {
/* 17 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
/* 22 */                if (iI000II == -1) {
/* 60 */                    z = false;
                        } else if (iI000II == 0) {
/* 53 */                    strI000l1 = iOl1ii1loOI00000oOI.I000l1(oilOloI, 0);
/* 57 */                    i |= 1;
                        } else if (iI000II == 1) {
/* 48 */                    o01O0o1iI = (O01O0o1iI) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 1, O01O1i1i.I00000oIO, o01O0o1iI);
/* 50 */                    i |= 2;
                        } else {
/* 29 */                    if (iI000II != 2) {
/* 38 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 9 */                         return null;
                            }
/* 31 */                    strI000l12 = iOl1ii1loOI00000oOI.I000l1(oilOloI, 2);
/* 35 */                    i |= 4;
                        }
                    }
/* 62 */            iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 69 */            if (1 != (i & 1)) {
/* 99 */                lI1IIO.I00000oIO(i, 1, descriptor);
/* 186 */               throw null;
                    }
/* 71 */            O00i1OoOll1I o00i1OoOll1I = new O00i1OoOll1I();
/* 74 */            o00i1OoOll1I.I00000oIO = strI000l1;
/* 78 */            if ((i & 2) == 0) {
/* 80 */                o00i1OoOll1I.I00000oOI = null;
                    } else {
/* 83 */                o00i1OoOll1I.I00000oOI = o01O0o1iI;
                    }
/* 87 */            if ((i & 4) == 0) {
/* 91 */                o00i1OoOll1I.I0000Il00O = "2.0";
/* 93 */                return o00i1OoOll1I;
                    }
/* 94 */            o00i1OoOll1I.I0000Il00O = strI000l12;
/* 96 */            return o00i1OoOll1I;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             O00i1OoOll1I o00i1OoOll1I = (O00i1OoOll1I) obj;
/* 3 */             OilOloI oilOloI = descriptor;
/* 5 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 9 */             String str = o00i1OoOll1I.I00000oIO;
/* 11 */            O01O0o1iI o01O0o1iI = o00i1OoOll1I.I00000oOI;
/* 14 */            iOl1l0o0i1I0I00000oOI.I001IO000(oilOloI, 0, str);
/* 21 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || o01O0o1iI != null) {
/* 29 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 1, O01O1i1i.I00000oIO, o01O0o1iI);
                    }
/* 35 */            iOl1l0o0i1I0I00000oOI.I001IO000(oilOloI, 2, o00i1OoOll1I.I0000Il00O);
/* 38 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

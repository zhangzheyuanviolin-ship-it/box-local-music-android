            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class O00iIOI0iiI implements Io00l010I {
                public static final O00iIOI0iiI I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             O00iIOI0iiI o00iIOI0iiI = new O00iIOI0iiI();
/* 6 */             I00000oIO = o00iIOI0iiI;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.JSONRPCRequest", o00iIOI0iiI, 4);
/* 19 */            oO1Ol1i.I000OiO("id", true);
/* 25 */            oO1Ol1i.I000OiO("method", false);
/* 30 */            oO1Ol1i.I000OiO("params", true);
/* 35 */            oO1Ol1i.I000OiO("jsonrpc", true);
/* 38 */            descriptor = oO1Ol1i;
                }

                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 3 */             O0O01001OOII o0o01001ooiiI00000oIO = iOi1iol.I00000oIO(O01O1i1i.I00000oIO);
/* 15 */            OlOlllO olOlllO = OlOlllO.I00000oIO;
/* 8 */             return new O0O01001OOII[]{Oi0IOl.I0000Il00O, olOlllO, o0o01001ooiiI00000oIO, olOlllO};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 10 */            boolean z = true;
/* 11 */            int i = 0;
/* 12 */            Oi0IO1ii011 oi0IO1ii011 = null;
/* 13 */            String strI000l1 = null;
/* 14 */            O01O0o1iI o01O0o1iI = null;
/* 15 */            String strI000l12 = null;
/* 17 */            while (z) {
/* 19 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
/* 24 */                if (iI000II == -1) {
/* 75 */                    z = false;
                        } else if (iI000II == 0) {
/* 70 */                    oi0IO1ii011 = (Oi0IO1ii011) iOl1ii1loOI00000oOI.I00100o1O0lo(oilOloI, 0, Oi0IOl.I0000Il00O, oi0IO1ii011);
/* 72 */                    i |= 1;
                        } else if (iI000II == 1) {
/* 57 */                    strI000l1 = iOl1ii1loOI00000oOI.I000l1(oilOloI, 1);
/* 61 */                    i |= 2;
                        } else if (iI000II == 2) {
/* 52 */                    o01O0o1iI = (O01O0o1iI) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 2, O01O1i1i.I00000oIO, o01O0o1iI);
/* 54 */                    i |= 4;
                        } else {
/* 33 */                    if (iI000II != 3) {
/* 42 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 9 */                         return null;
                            }
/* 35 */                    strI000l12 = iOl1ii1loOI00000oOI.I000l1(oilOloI, 3);
/* 39 */                    i |= 8;
                        }
                    }
/* 77 */            iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 84 */            if (2 != (i & 2)) {
/* 138 */               lI1IIO.I00000oIO(i, 2, descriptor);
/* 186 */               throw null;
                    }
/* 86 */            O00iOil o00iOil = new O00iOil();
/* 91 */            if ((i & 1) == 0) {
/* 105 */               o00iOil.I00000oIO = Oi0IO111o10.I00000oIO(li1O0IIOo.I0000Il00O().I00000oIO());
                    } else {
/* 108 */               o00iOil.I00000oIO = oi0IO1ii011;
                    }
/* 110 */           o00iOil.I00000oOI = strI000l1;
/* 114 */           if ((i & 4) == 0) {
/* 116 */               o00iOil.I0000Il00O = null;
                    } else {
/* 119 */               o00iOil.I0000Il00O = o01O0o1iI;
                    }
/* 123 */           if ((i & 8) == 0) {
/* 127 */               o00iOil.I0000O = "2.0";
                    } else {
/* 133 */               o00iOil.I0000O = strI000l12;
                    }
/* 129 */           VarHandle.storeStoreFence();
/* 132 */           return o00iOil;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             O00iOil o00iOil = (O00iOil) obj;
/* 3 */             Oi0IO1ii011 oi0IO1ii011 = o00iOil.I00000oIO;
/* 5 */             OilOloI oilOloI = descriptor;
/* 7 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 15 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || !O0000Ioio00.I0000O(oi0IO1ii011, Oi0IO111o10.I00000oIO(li1O0IIOo.I0000Il00O().I00000oIO()))) {
/* 39 */                iOl1l0o0i1I0I00000oOI.I000l1(oilOloI, 0, Oi0IOl.I0000Il00O, oi0IO1ii011);
                    }
/* 42 */            String str = o00iOil.I00000oOI;
/* 44 */            O01O0o1iI o01O0o1iI = o00iOil.I0000Il00O;
/* 47 */            iOl1l0o0i1I0I00000oOI.I001IO000(oilOloI, 1, str);
/* 54 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || o01O0o1iI != null) {
/* 62 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 2, O01O1i1i.I00000oIO, o01O0o1iI);
                    }
/* 68 */            iOl1l0o0i1I0I00000oOI.I001IO000(oilOloI, 3, o00iOil.I0000O);
/* 71 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

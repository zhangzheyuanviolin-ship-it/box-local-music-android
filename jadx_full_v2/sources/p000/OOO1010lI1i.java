            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OOO1010lI1i implements Io00l010I {
                public static final OOO1010lI1i I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             OOO1010lI1i oOO1010lI1i = new OOO1010lI1i();
/* 6 */             I00000oIO = oOO1010lI1i;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.ProgressNotificationParams", oOO1010lI1i, 5);
/* 19 */            oO1Ol1i.I000OiO("progressToken", false);
/* 24 */            oO1Ol1i.I000OiO("progress", false);
/* 30 */            oO1Ol1i.I000OiO("total", true);
/* 35 */            oO1Ol1i.I000OiO("message", true);
/* 40 */            oO1Ol1i.I000OiO("_meta", true);
/* 43 */            descriptor = oO1Ol1i;
                }

                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 1 */             IiioO01 iiioO01 = IiioO01.I00000oIO;
/* 20 */            return new O0O01001OOII[]{Oi0IOl.I0000Il00O, iiioO01, iOi1iol.I00000oIO(iiioO01), iOi1iol.I00000oIO(OlOlllO.I00000oIO), iOi1iol.I00000oIO(O01l1I.I00000oIO)};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 10 */            double dI001lIiIIo1O = 0.0d;
/* 12 */            boolean z = true;
/* 13 */            int i = 0;
/* 14 */            Oi0IO1ii011 oi0IO1ii011 = null;
/* 15 */            Double d = null;
/* 16 */            String str = null;
/* 17 */            O01ioO1o0i11 o01ioO1o0i11 = null;
/* 19 */            while (z) {
/* 21 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
/* 26 */                if (iI000II == -1) {
/* 95 */                    z = false;
                        } else if (iI000II == 0) {
/* 90 */                    oi0IO1ii011 = (Oi0IO1ii011) iOl1ii1loOI00000oOI.I00100o1O0lo(oilOloI, 0, Oi0IOl.I0000Il00O, oi0IO1ii011);
/* 92 */                    i |= 1;
                        } else if (iI000II == 1) {
/* 77 */                    dI001lIiIIo1O = iOl1ii1loOI00000oOI.I001lIiIIo1O(oilOloI, 1);
/* 81 */                    i |= 2;
                        } else if (iI000II == 2) {
/* 72 */                    d = (Double) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 2, IiioO01.I00000oIO, d);
/* 74 */                    i |= 4;
                        } else if (iI000II == 3) {
/* 61 */                    str = (String) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 3, OlOlllO.I00000oIO, str);
/* 63 */                    i |= 8;
                        } else {
/* 38 */                    if (iI000II != 4) {
/* 51 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 9 */                         return null;
                            }
/* 46 */                    o01ioO1o0i11 = (O01ioO1o0i11) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 4, O01l1I.I00000oIO, o01ioO1o0i11);
/* 48 */                    i |= 16;
                        }
                    }
/* 97 */            iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 104 */           if (3 != (i & 3)) {
/* 146 */               lI1IIO.I00000oIO(i, 3, descriptor);
/* 186 */               throw null;
                    }
/* 106 */           OOO10O0 ooo10o0 = new OOO10O0();
/* 109 */           ooo10o0.I00000oIO = oi0IO1ii011;
/* 111 */           ooo10o0.I00000oOI = dI001lIiIIo1O;
/* 115 */           if ((i & 4) == 0) {
/* 117 */               ooo10o0.I0000Il00O = null;
                    } else {
/* 120 */               ooo10o0.I0000Il00O = d;
                    }
/* 124 */           if ((i & 8) == 0) {
/* 126 */               ooo10o0.I0000O = null;
                    } else {
/* 129 */               ooo10o0.I0000O = str;
                    }
/* 133 */           if ((i & 16) == 0) {
/* 135 */               ooo10o0.I0000oI00 = null;
                    } else {
/* 141 */               ooo10o0.I0000oI00 = o01ioO1o0i11;
                    }
/* 137 */           VarHandle.storeStoreFence();
/* 140 */           return ooo10o0;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             OOO10O0 ooo10o0 = (OOO10O0) obj;
/* 3 */             OilOloI oilOloI = descriptor;
/* 5 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 9 */             Oi0IOl oi0IOl = Oi0IOl.I0000Il00O;
/* 11 */            Oi0IO1ii011 oi0IO1ii011 = ooo10o0.I00000oIO;
/* 13 */            O01ioO1o0i11 o01ioO1o0i11 = ooo10o0.I0000oI00;
/* 15 */            String str = ooo10o0.I0000O;
/* 17 */            Double d = ooo10o0.I0000Il00O;
/* 20 */            iOl1l0o0i1I0I00000oOI.I000l1(oilOloI, 0, oi0IOl, oi0IO1ii011);
/* 26 */            iOl1l0o0i1I0I00000oOI.I000o00OoI0I(oilOloI, 1, ooo10o0.I00000oOI);
/* 33 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || d != null) {
/* 41 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 2, IiioO01.I00000oIO, d);
                    }
/* 48 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || str != null) {
/* 56 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 3, OlOlllO.I00000oIO, str);
                    }
/* 63 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || o01ioO1o0i11 != null) {
/* 71 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 4, O01l1I.I00000oIO, o01ioO1o0i11);
                    }
/* 74 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class O00OO0loio00 implements Io00l010I {
                public static final O00OO0loio00 I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             O00OO0loio00 o00OO0loio00 = new O00OO0loio00();
/* 6 */             I00000oIO = o00OO0loio00;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.JSONRPCError", o00OO0loio00, 3);
/* 19 */            oO1Ol1i.I000OiO("id", false);
/* 24 */            oO1Ol1i.I000OiO("error", false);
/* 30 */            oO1Ol1i.I000OiO("jsonrpc", true);
/* 33 */            descriptor = oO1Ol1i;
                }

                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 2 */             return new O0O01001OOII[]{Oi0IOl.I0000Il00O, OOilil1iI0l.I00000oIO, OlOlllO.I00000oIO};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 10 */            boolean z = true;
/* 11 */            int i = 0;
/* 12 */            Oi0IO1ii011 oi0IO1ii011 = null;
/* 13 */            OOillOoli oOillOoli = null;
/* 14 */            String strI000l1 = null;
/* 15 */            while (z) {
/* 17 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
/* 22 */                if (iI000II == -1) {
/* 64 */                    z = false;
                        } else if (iI000II == 0) {
/* 59 */                    oi0IO1ii011 = (Oi0IO1ii011) iOl1ii1loOI00000oOI.I00100o1O0lo(oilOloI, 0, Oi0IOl.I0000Il00O, oi0IO1ii011);
/* 61 */                    i |= 1;
                        } else if (iI000II == 1) {
/* 48 */                    oOillOoli = (OOillOoli) iOl1ii1loOI00000oOI.I00100o1O0lo(oilOloI, 1, OOilil1iI0l.I00000oIO, oOillOoli);
/* 50 */                    i |= 2;
                        } else {
/* 29 */                    if (iI000II != 2) {
/* 38 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 9 */                         return null;
                            }
/* 31 */                    strI000l1 = iOl1ii1loOI00000oOI.I000l1(oilOloI, 2);
/* 35 */                    i |= 4;
                        }
                    }
/* 66 */            iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 74 */            if (3 != (i & 3)) {
/* 100 */               lI1IIO.I00000oIO(i, 3, descriptor);
/* 186 */               throw null;
                    }
/* 76 */            O00Ol10IiOoi o00Ol10IiOoi = new O00Ol10IiOoi();
/* 79 */            o00Ol10IiOoi.I00000oIO = oi0IO1ii011;
/* 81 */            o00Ol10IiOoi.I00000oOI = oOillOoli;
/* 85 */            if ((i & 4) == 0) {
/* 89 */                o00Ol10IiOoi.I0000Il00O = "2.0";
                    } else {
/* 95 */                o00Ol10IiOoi.I0000Il00O = strI000l1;
                    }
/* 91 */            VarHandle.storeStoreFence();
/* 94 */            return o00Ol10IiOoi;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             O00Ol10IiOoi o00Ol10IiOoi = (O00Ol10IiOoi) obj;
/* 3 */             OilOloI oilOloI = descriptor;
/* 5 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 14 */            iOl1l0o0i1I0I00000oOI.I000l1(oilOloI, 0, Oi0IOl.I0000Il00O, o00Ol10IiOoi.I00000oIO);
/* 22 */            iOl1l0o0i1I0I00000oOI.I000l1(oilOloI, 1, OOilil1iI0l.I00000oIO, o00Ol10IiOoi.I00000oOI);
/* 28 */            iOl1l0o0i1I0I00000oOI.I001IO000(oilOloI, 2, o00Ol10IiOoi.I0000Il00O);
/* 31 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

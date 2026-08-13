            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Map;
            
            public final class Io01i1 implements Io00l010I {
                public static final Io01i1 I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             Io01i1 io01i1 = new Io01i1();
/* 6 */             I00000oIO = io01i1;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.GetPromptRequestParams", io01i1, 3);
/* 19 */            oO1Ol1i.I000OiO("name", false);
/* 25 */            oO1Ol1i.I000OiO("arguments", true);
/* 30 */            oO1Ol1i.I000OiO("_meta", true);
/* 33 */            descriptor = oO1Ol1i;
                }

                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 23 */            return new O0O01001OOII[]{OlOlllO.I00000oIO, iOi1iol.I00000oIO((O0O01001OOII) Io01l0ol10.I0000O[1].getValue()), iOi1iol.I00000oIO(Oi0IOo.I00000oIO)};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 7 */             O0ioIllo0i1[] o0ioIllo0i1Arr = Io01l0ol10.I0000O;
/* 12 */            boolean z = true;
/* 13 */            int i = 0;
/* 14 */            Map map = null;
/* 15 */            O01ioO1o0i11 o01ioO1o0i11 = null;
/* 16 */            String strI000l1 = null;
/* 17 */            while (z) {
/* 19 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
/* 24 */                if (iI000II == -1) {
/* 86 */                    z = false;
                        } else if (iI000II == 0) {
/* 79 */                    strI000l1 = iOl1ii1loOI00000oOI.I000l1(oilOloI, 0);
/* 83 */                    i |= 1;
                        } else if (iI000II == 1) {
/* 74 */                    map = (Map) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 1, (O0O01001OOII) o0ioIllo0i1Arr[1].getValue(), map);
/* 76 */                    i |= 2;
                        } else {
/* 31 */                    if (iI000II != 2) {
/* 58 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 11 */                        return null;
                            }
/* 47 */                    Oi0IiIoo oi0IiIoo = (Oi0IiIoo) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 2, Oi0IOo.I00000oIO, o01ioO1o0i11 != null ? Oi0IiIoo.I00000oIO(o01ioO1o0i11) : null);
/* 54 */                    o01ioO1o0i11 = oi0IiIoo != null ? oi0IiIoo.I00000oIO : null;
/* 55 */                    i |= 4;
                        }
                    }
/* 88 */            iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 95 */            if (1 != (i & 1)) {
/* 126 */               lI1IIO.I00000oIO(i, 1, descriptor);
/* 186 */               throw null;
                    }
/* 97 */            Io01l0ol10 io01l0ol10 = new Io01l0ol10();
/* 100 */           io01l0ol10.I00000oIO = strI000l1;
/* 104 */           if ((i & 2) == 0) {
/* 106 */               io01l0ol10.I00000oOI = null;
                    } else {
/* 109 */               io01l0ol10.I00000oOI = map;
                    }
/* 113 */           if ((i & 4) == 0) {
/* 115 */               io01l0ol10.I0000Il00O = null;
                    } else {
/* 121 */               io01l0ol10.I0000Il00O = o01ioO1o0i11;
                    }
/* 117 */           VarHandle.storeStoreFence();
/* 120 */           return io01l0ol10;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             Io01l0ol10 io01l0ol10 = (Io01l0ol10) obj;
/* 3 */             OilOloI oilOloI = descriptor;
/* 5 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 9 */             O0ioIllo0i1[] o0ioIllo0i1Arr = Io01l0ol10.I0000O;
/* 11 */            String str = io01l0ol10.I00000oIO;
/* 13 */            O01ioO1o0i11 o01ioO1o0i11 = io01l0ol10.I0000Il00O;
/* 15 */            Map map = io01l0ol10.I00000oOI;
/* 18 */            iOl1l0o0i1I0I00000oOI.I001IO000(oilOloI, 0, str);
/* 25 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || map != null) {
/* 39 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 1, (O0O01001OOII) o0ioIllo0i1Arr[1].getValue(), map);
                    }
/* 46 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || o01ioO1o0i11 != null) {
/* 62 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 2, Oi0IOo.I00000oIO, o01ioO1o0i11 != null ? Oi0IiIoo.I00000oIO(o01ioO1o0i11) : null);
                    }
/* 65 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

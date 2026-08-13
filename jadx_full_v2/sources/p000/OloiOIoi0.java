            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OloiOIoi0 implements Io00l010I {
                public static final OloiOIoi0 I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             OloiOIoi0 oloiOIoi0 = new OloiOIoi0();
/* 6 */             I00000oIO = oloiOIoi0;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.TextContent", oloiOIoi0, 4);
/* 19 */            oO1Ol1i.I000OiO("text", false);
/* 25 */            oO1Ol1i.I000OiO("annotations", true);
/* 30 */            oO1Ol1i.I000OiO("_meta", true);
/* 35 */            oO1Ol1i.I000OiO("type", true);
/* 38 */            descriptor = oO1Ol1i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 4 */             return new O0O01001OOII[]{OlOlllO.I00000oIO, iOi1iol.I00000oIO(I11IOlOI0ll.I00000oIO), iOi1iol.I00000oIO(O01l1I.I00000oIO), OloiioiOI1.I0000oI00[3].getValue()};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 7 */             O0ioIllo0i1[] o0ioIllo0i1Arr = OloiioiOI1.I0000oI00;
/* 12 */            boolean z = true;
/* 13 */            int i = 0;
/* 14 */            String strI000l1 = null;
/* 15 */            I11Illil0iIl i11Illil0iIl = null;
/* 16 */            O01ioO1o0i11 o01ioO1o0i11 = null;
/* 17 */            IOoOoo0 iOoOoo0 = null;
/* 18 */            while (z) {
/* 20 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
/* 25 */                if (iI000II == -1) {
/* 87 */                    z = false;
                        } else if (iI000II == 0) {
/* 80 */                    strI000l1 = iOl1ii1loOI00000oOI.I000l1(oilOloI, 0);
/* 84 */                    i |= 1;
                        } else if (iI000II == 1) {
/* 75 */                    i11Illil0iIl = (I11Illil0iIl) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 1, I11IOlOI0ll.I00000oIO, i11Illil0iIl);
/* 77 */                    i |= 2;
                        } else if (iI000II == 2) {
/* 64 */                    o01ioO1o0i11 = (O01ioO1o0i11) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 2, O01l1I.I00000oIO, o01ioO1o0i11);
/* 66 */                    i |= 4;
                        } else {
/* 35 */                    if (iI000II != 3) {
/* 54 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 11 */                        return null;
                            }
/* 49 */                    iOoOoo0 = (IOoOoo0) iOl1ii1loOI00000oOI.I00100o1O0lo(oilOloI, 3, (O0O01001OOII) o0ioIllo0i1Arr[3].getValue(), iOoOoo0);
/* 51 */                    i |= 8;
                        }
                    }
/* 89 */            iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 96 */            if (1 != (i & 1)) {
/* 138 */               lI1IIO.I00000oIO(i, 1, descriptor);
/* 186 */               throw null;
                    }
/* 98 */            OloiioiOI1 oloiioiOI1 = new OloiioiOI1();
/* 101 */           oloiioiOI1.I00000oIO = strI000l1;
/* 105 */           if ((i & 2) == 0) {
/* 107 */               oloiioiOI1.I00000oOI = null;
                    } else {
/* 110 */               oloiioiOI1.I00000oOI = i11Illil0iIl;
                    }
/* 114 */           if ((i & 4) == 0) {
/* 116 */               oloiioiOI1.I0000Il00O = null;
                    } else {
/* 119 */               oloiioiOI1.I0000Il00O = o01ioO1o0i11;
                    }
/* 123 */           if ((i & 8) == 0) {
/* 127 */               oloiioiOI1.I0000O = IOoOoo0.I00iiI;
                    } else {
/* 133 */               oloiioiOI1.I0000O = iOoOoo0;
                    }
/* 129 */           VarHandle.storeStoreFence();
/* 132 */           return oloiioiOI1;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             OloiioiOI1 oloiioiOI1 = (OloiioiOI1) obj;
/* 3 */             OilOloI oilOloI = descriptor;
/* 5 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 9 */             O0ioIllo0i1[] o0ioIllo0i1Arr = OloiioiOI1.I0000oI00;
/* 11 */            String str = oloiioiOI1.I00000oIO;
/* 13 */            O01ioO1o0i11 o01ioO1o0i11 = oloiioiOI1.I0000Il00O;
/* 15 */            I11Illil0iIl i11Illil0iIl = oloiioiOI1.I00000oOI;
/* 18 */            iOl1l0o0i1I0I00000oOI.I001IO000(oilOloI, 0, str);
/* 25 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || i11Illil0iIl != null) {
/* 33 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 1, I11IOlOI0ll.I00000oIO, i11Illil0iIl);
                    }
/* 40 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || o01ioO1o0i11 != null) {
/* 48 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 2, O01l1I.I00000oIO, o01ioO1o0i11);
                    }
/* 62 */            iOl1l0o0i1I0I00000oOI.I000l1(oilOloI, 3, (O0O01001OOII) o0ioIllo0i1Arr[3].getValue(), oloiioiOI1.I0000O);
/* 65 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

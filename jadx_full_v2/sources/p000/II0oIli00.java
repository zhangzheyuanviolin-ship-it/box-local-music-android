            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class II0oIli00 implements Io00l010I {
                public static final II0oIli00 I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             II0oIli00 iI0oIli00 = new II0oIli00();
/* 6 */             I00000oIO = iI0oIli00;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.BlobResourceContents", iI0oIli00, 4);
/* 19 */            oO1Ol1i.I000OiO("blob", false);
/* 24 */            oO1Ol1i.I000OiO("uri", false);
/* 30 */            oO1Ol1i.I000OiO("mimeType", true);
/* 35 */            oO1Ol1i.I000OiO("_meta", true);
/* 38 */            descriptor = oO1Ol1i;
                }

                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 1 */             OlOlllO olOlllO = OlOlllO.I00000oIO;
/* 14 */            return new O0O01001OOII[]{olOlllO, olOlllO, iOi1iol.I00000oIO(olOlllO), iOi1iol.I00000oIO(O01l1I.I00000oIO)};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 10 */            boolean z = true;
/* 11 */            int i = 0;
/* 12 */            String strI000l1 = null;
/* 13 */            String strI000l12 = null;
/* 14 */            String str = null;
/* 15 */            O01ioO1o0i11 o01ioO1o0i11 = null;
/* 17 */            while (z) {
/* 19 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
/* 24 */                if (iI000II == -1) {
/* 75 */                    z = false;
                        } else if (iI000II == 0) {
/* 68 */                    strI000l1 = iOl1ii1loOI00000oOI.I000l1(oilOloI, 0);
/* 72 */                    i |= 1;
                        } else if (iI000II == 1) {
/* 61 */                    strI000l12 = iOl1ii1loOI00000oOI.I000l1(oilOloI, 1);
/* 65 */                    i |= 2;
                        } else if (iI000II == 2) {
/* 56 */                    str = (String) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 2, OlOlllO.I00000oIO, str);
/* 58 */                    i |= 4;
                        } else {
/* 33 */                    if (iI000II != 3) {
/* 46 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 9 */                         return null;
                            }
/* 41 */                    o01ioO1o0i11 = (O01ioO1o0i11) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 3, O01l1I.I00000oIO, o01ioO1o0i11);
/* 43 */                    i |= 8;
                        }
                    }
/* 77 */            iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 84 */            if (3 != (i & 3)) {
/* 117 */               lI1IIO.I00000oIO(i, 3, descriptor);
/* 186 */               throw null;
                    }
/* 86 */            II0oOI iI0oOI = new II0oOI();
/* 89 */            iI0oOI.I00000oIO = strI000l1;
/* 91 */            iI0oOI.I00000oOI = strI000l12;
/* 95 */            if ((i & 4) == 0) {
/* 97 */                iI0oOI.I0000Il00O = null;
                    } else {
/* 100 */               iI0oOI.I0000Il00O = str;
                    }
/* 104 */           if ((i & 8) == 0) {
/* 106 */               iI0oOI.I0000O = null;
                    } else {
/* 112 */               iI0oOI.I0000O = o01ioO1o0i11;
                    }
/* 108 */           VarHandle.storeStoreFence();
/* 111 */           return iI0oOI;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             II0oOI iI0oOI = (II0oOI) obj;
/* 3 */             OilOloI oilOloI = descriptor;
/* 5 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 9 */             String str = iI0oOI.I00000oIO;
/* 11 */            O01ioO1o0i11 o01ioO1o0i11 = iI0oOI.I0000O;
/* 13 */            String str2 = iI0oOI.I0000Il00O;
/* 16 */            iOl1l0o0i1I0I00000oOI.I001IO000(oilOloI, 0, str);
/* 22 */            iOl1l0o0i1I0I00000oOI.I001IO000(oilOloI, 1, iI0oOI.I00000oOI);
/* 29 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || str2 != null) {
/* 37 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 2, OlOlllO.I00000oIO, str2);
                    }
/* 44 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || o01ioO1o0i11 != null) {
/* 52 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 3, O01l1I.I00000oIO, o01ioO1o0i11);
                    }
/* 55 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

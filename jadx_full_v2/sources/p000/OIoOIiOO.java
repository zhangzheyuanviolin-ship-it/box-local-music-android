            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OIoOIiOO implements Io00l010I {
                public static final OIoOIiOO I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             OIoOIiOO oIoOIiOO = new OIoOIiOO();
/* 6 */             I00000oIO = oIoOIiOO;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.PaginatedRequestParams", oIoOIiOO, 2);
/* 19 */            oO1Ol1i.I000OiO("cursor", true);
/* 24 */            oO1Ol1i.I000OiO("_meta", true);
/* 27 */            descriptor = oO1Ol1i;
                }

                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 14 */            return new O0O01001OOII[]{iOi1iol.I00000oIO(OlOlllO.I00000oIO), iOi1iol.I00000oIO(Oi0IOo.I00000oIO)};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 10 */            boolean z = true;
/* 11 */            int i = 0;
/* 12 */            String str = null;
/* 13 */            O01ioO1o0i11 o01ioO1o0i11 = null;
/* 14 */            while (z) {
/* 16 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
/* 21 */                if (iI000II == -1) {
/* 67 */                    z = false;
                        } else if (iI000II == 0) {
/* 62 */                    str = (String) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 0, OlOlllO.I00000oIO, str);
/* 64 */                    i |= 1;
                        } else {
/* 25 */                    if (iI000II != 1) {
/* 52 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 9 */                         return null;
                            }
/* 41 */                    Oi0IiIoo oi0IiIoo = (Oi0IiIoo) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 1, Oi0IOo.I00000oIO, o01ioO1o0i11 != null ? Oi0IiIoo.I00000oIO(o01ioO1o0i11) : null);
/* 48 */                    o01ioO1o0i11 = oi0IiIoo != null ? oi0IiIoo.I00000oIO : null;
/* 49 */                    i |= 2;
                        }
                    }
/* 69 */            iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 74 */            OIoOilIo0l1 oIoOilIo0l1 = new OIoOilIo0l1();
/* 79 */            if ((i & 1) == 0) {
/* 81 */                oIoOilIo0l1.I00000oIO = null;
                    } else {
/* 84 */                oIoOilIo0l1.I00000oIO = str;
                    }
/* 88 */            if ((i & 2) == 0) {
/* 90 */                oIoOilIo0l1.I00000oOI = null;
                    } else {
/* 96 */                oIoOilIo0l1.I00000oOI = o01ioO1o0i11;
                    }
/* 92 */            VarHandle.storeStoreFence();
/* 95 */            return oIoOilIo0l1;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             OIoOilIo0l1 oIoOilIo0l1 = (OIoOilIo0l1) obj;
/* 3 */             O01ioO1o0i11 o01ioO1o0i11 = oIoOilIo0l1.I00000oOI;
/* 5 */             String str = oIoOilIo0l1.I00000oIO;
/* 7 */             OilOloI oilOloI = descriptor;
/* 9 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 17 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || str != null) {
/* 25 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 0, OlOlllO.I00000oIO, str);
                    }
/* 32 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || o01ioO1o0i11 != null) {
/* 48 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 1, Oi0IOo.I00000oIO, o01ioO1o0i11 != null ? Oi0IiIoo.I00000oIO(o01ioO1o0i11) : null);
                    }
/* 51 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

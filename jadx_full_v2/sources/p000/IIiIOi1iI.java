            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class IIiIOi1iI implements Io00l010I {
                public static final IIiIOi1iI I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             IIiIOi1iI iIiIOi1iI = new IIiIOi1iI();
/* 6 */             I00000oIO = iIiIOi1iI;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.CallToolRequestParams", iIiIOi1iI, 3);
/* 19 */            oO1Ol1i.I000OiO("name", false);
/* 25 */            oO1Ol1i.I000OiO("arguments", true);
/* 30 */            oO1Ol1i.I000OiO("_meta", true);
/* 33 */            descriptor = oO1Ol1i;
                }

                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 14 */            return new O0O01001OOII[]{OlOlllO.I00000oIO, iOi1iol.I00000oIO(O01l1I.I00000oIO), iOi1iol.I00000oIO(Oi0IOo.I00000oIO)};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 10 */            boolean z = true;
/* 11 */            int i = 0;
/* 12 */            O01ioO1o0i11 o01ioO1o0i11 = null;
/* 13 */            O01ioO1o0i11 o01ioO1o0i112 = null;
/* 14 */            String strI000l1 = null;
/* 15 */            while (z) {
/* 17 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
/* 22 */                if (iI000II == -1) {
/* 78 */                    z = false;
                        } else if (iI000II == 0) {
/* 71 */                    strI000l1 = iOl1ii1loOI00000oOI.I000l1(oilOloI, 0);
/* 75 */                    i |= 1;
                        } else if (iI000II == 1) {
/* 66 */                    o01ioO1o0i11 = (O01ioO1o0i11) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 1, O01l1I.I00000oIO, o01ioO1o0i11);
/* 68 */                    i |= 2;
                        } else {
/* 29 */                    if (iI000II != 2) {
/* 56 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 9 */                         return null;
                            }
/* 45 */                    Oi0IiIoo oi0IiIoo = (Oi0IiIoo) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 2, Oi0IOo.I00000oIO, o01ioO1o0i112 != null ? Oi0IiIoo.I00000oIO(o01ioO1o0i112) : null);
/* 52 */                    o01ioO1o0i112 = oi0IiIoo != null ? oi0IiIoo.I00000oIO : null;
/* 53 */                    i |= 4;
                        }
                    }
/* 80 */            iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 87 */            if (1 != (i & 1)) {
/* 118 */               lI1IIO.I00000oIO(i, 1, descriptor);
/* 186 */               throw null;
                    }
/* 89 */            IIiIi10iloI iIiIi10iloI = new IIiIi10iloI();
/* 92 */            iIiIi10iloI.I00000oIO = strI000l1;
/* 96 */            if ((i & 2) == 0) {
/* 98 */                iIiIi10iloI.I00000oOI = null;
                    } else {
/* 101 */               iIiIi10iloI.I00000oOI = o01ioO1o0i11;
                    }
/* 105 */           if ((i & 4) == 0) {
/* 107 */               iIiIi10iloI.I0000Il00O = null;
                    } else {
/* 113 */               iIiIi10iloI.I0000Il00O = o01ioO1o0i112;
                    }
/* 109 */           VarHandle.storeStoreFence();
/* 112 */           return iIiIi10iloI;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             IIiIi10iloI iIiIi10iloI = (IIiIi10iloI) obj;
/* 3 */             OilOloI oilOloI = descriptor;
/* 5 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 9 */             String str = iIiIi10iloI.I00000oIO;
/* 11 */            O01ioO1o0i11 o01ioO1o0i11 = iIiIi10iloI.I0000Il00O;
/* 13 */            O01ioO1o0i11 o01ioO1o0i112 = iIiIi10iloI.I00000oOI;
/* 16 */            iOl1l0o0i1I0I00000oOI.I001IO000(oilOloI, 0, str);
/* 23 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || o01ioO1o0i112 != null) {
/* 31 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 1, O01l1I.I00000oIO, o01ioO1o0i112);
                    }
/* 38 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || o01ioO1o0i11 != null) {
/* 54 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 2, Oi0IOo.I00000oIO, o01ioO1o0i11 != null ? Oi0IiIoo.I00000oIO(o01ioO1o0i11) : null);
                    }
/* 57 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

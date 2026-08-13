            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OoiO10oIi implements Io00l010I {
                public static final OoiO10oIi I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             OoiO10oIi ooiO10oIi = new OoiO10oIi();
/* 6 */             I00000oIO = ooiO10oIi;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.UnknownResourceContents", ooiO10oIi, 3);
/* 19 */            oO1Ol1i.I000OiO("uri", false);
/* 25 */            oO1Ol1i.I000OiO("mimeType", true);
/* 30 */            oO1Ol1i.I000OiO("_meta", true);
/* 33 */            descriptor = oO1Ol1i;
                }

                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 1 */             OlOlllO olOlllO = OlOlllO.I00000oIO;
/* 14 */            return new O0O01001OOII[]{olOlllO, iOi1iol.I00000oIO(olOlllO), iOi1iol.I00000oIO(O01l1I.I00000oIO)};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 10 */            boolean z = true;
/* 11 */            int i = 0;
/* 12 */            String strI000l1 = null;
/* 13 */            String str = null;
/* 14 */            O01ioO1o0i11 o01ioO1o0i11 = null;
/* 15 */            while (z) {
/* 17 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
/* 22 */                if (iI000II == -1) {
/* 64 */                    z = false;
                        } else if (iI000II == 0) {
/* 57 */                    strI000l1 = iOl1ii1loOI00000oOI.I000l1(oilOloI, 0);
/* 61 */                    i |= 1;
                        } else if (iI000II == 1) {
/* 52 */                    str = (String) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 1, OlOlllO.I00000oIO, str);
/* 54 */                    i |= 2;
                        } else {
/* 29 */                    if (iI000II != 2) {
/* 42 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 9 */                         return null;
                            }
/* 37 */                    o01ioO1o0i11 = (O01ioO1o0i11) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 2, O01l1I.I00000oIO, o01ioO1o0i11);
/* 39 */                    i |= 4;
                        }
                    }
/* 66 */            iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 73 */            if (1 != (i & 1)) {
/* 104 */               lI1IIO.I00000oIO(i, 1, descriptor);
/* 186 */               throw null;
                    }
/* 75 */            OoiOIlIII ooiOIlIII = new OoiOIlIII();
/* 78 */            ooiOIlIII.I00000oIO = strI000l1;
/* 82 */            if ((i & 2) == 0) {
/* 84 */                ooiOIlIII.I00000oOI = null;
                    } else {
/* 87 */                ooiOIlIII.I00000oOI = str;
                    }
/* 91 */            if ((i & 4) == 0) {
/* 93 */                ooiOIlIII.I0000Il00O = null;
                    } else {
/* 99 */                ooiOIlIII.I0000Il00O = o01ioO1o0i11;
                    }
/* 95 */            VarHandle.storeStoreFence();
/* 98 */            return ooiOIlIII;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             OoiOIlIII ooiOIlIII = (OoiOIlIII) obj;
/* 3 */             OilOloI oilOloI = descriptor;
/* 5 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 9 */             String str = ooiOIlIII.I00000oIO;
/* 11 */            O01ioO1o0i11 o01ioO1o0i11 = ooiOIlIII.I0000Il00O;
/* 13 */            String str2 = ooiOIlIII.I00000oOI;
/* 16 */            iOl1l0o0i1I0I00000oOI.I001IO000(oilOloI, 0, str);
/* 23 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || str2 != null) {
/* 31 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 1, OlOlllO.I00000oIO, str2);
                    }
/* 38 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || o01ioO1o0i11 != null) {
/* 46 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 2, O01l1I.I00000oIO, o01ioO1o0i11);
                    }
/* 49 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

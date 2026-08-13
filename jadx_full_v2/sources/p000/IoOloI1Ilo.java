            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public final class IoOloI1Ilo implements Io00l010I {
                public static final IoOloI1Ilo I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             IoOloI1Ilo ioOloI1Ilo = new IoOloI1Ilo();
/* 6 */             I00000oIO = ioOloI1Ilo;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.Icon", ioOloI1Ilo, 4);
/* 19 */            oO1Ol1i.I000OiO("src", false);
/* 25 */            oO1Ol1i.I000OiO("mimeType", true);
/* 30 */            oO1Ol1i.I000OiO("sizes", true);
/* 35 */            oO1Ol1i.I000OiO("theme", true);
/* 38 */            descriptor = oO1Ol1i;
                }

                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 1 */             O0ioIllo0i1[] o0ioIllo0i1Arr = IoOo0iOi.I0000oI00;
/* 3 */             OlOlllO olOlllO = OlOlllO.I00000oIO;
/* 36 */            return new O0O01001OOII[]{olOlllO, iOi1iol.I00000oIO(olOlllO), iOi1iol.I00000oIO((O0O01001OOII) o0ioIllo0i1Arr[2].getValue()), iOi1iol.I00000oIO((O0O01001OOII) o0ioIllo0i1Arr[3].getValue())};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 7 */             O0ioIllo0i1[] o0ioIllo0i1Arr = IoOo0iOi.I0000oI00;
/* 12 */            boolean z = true;
/* 13 */            int i = 0;
/* 14 */            String strI000l1 = null;
/* 15 */            String str = null;
/* 16 */            List list = null;
/* 17 */            IoOlolIIi ioOlolIIi = null;
/* 18 */            while (z) {
/* 20 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
/* 25 */                if (iI000II == -1) {
/* 93 */                    z = false;
                        } else if (iI000II == 0) {
/* 86 */                    strI000l1 = iOl1ii1loOI00000oOI.I000l1(oilOloI, 0);
/* 90 */                    i |= 1;
                        } else if (iI000II == 1) {
/* 81 */                    str = (String) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 1, OlOlllO.I00000oIO, str);
/* 83 */                    i |= 2;
                        } else if (iI000II == 2) {
/* 70 */                    list = (List) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 2, (O0O01001OOII) o0ioIllo0i1Arr[2].getValue(), list);
/* 72 */                    i |= 4;
                        } else {
/* 35 */                    if (iI000II != 3) {
/* 54 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 11 */                        return null;
                            }
/* 49 */                    ioOlolIIi = (IoOlolIIi) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 3, (O0O01001OOII) o0ioIllo0i1Arr[3].getValue(), ioOlolIIi);
/* 51 */                    i |= 8;
                        }
                    }
/* 95 */            iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 102 */           if (1 != (i & 1)) {
/* 142 */               lI1IIO.I00000oIO(i, 1, descriptor);
/* 186 */               throw null;
                    }
/* 104 */           IoOo0iOi ioOo0iOi = new IoOo0iOi();
/* 107 */           ioOo0iOi.I00000oIO = strI000l1;
/* 111 */           if ((i & 2) == 0) {
/* 113 */               ioOo0iOi.I00000oOI = null;
                    } else {
/* 116 */               ioOo0iOi.I00000oOI = str;
                    }
/* 120 */           if ((i & 4) == 0) {
/* 122 */               ioOo0iOi.I0000Il00O = null;
                    } else {
/* 125 */               ioOo0iOi.I0000Il00O = list;
                    }
/* 129 */           if ((i & 8) == 0) {
/* 131 */               ioOo0iOi.I0000O = null;
                    } else {
/* 137 */               ioOo0iOi.I0000O = ioOlolIIi;
                    }
/* 133 */           VarHandle.storeStoreFence();
/* 136 */           return ioOo0iOi;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             IoOo0iOi ioOo0iOi = (IoOo0iOi) obj;
/* 3 */             OilOloI oilOloI = descriptor;
/* 5 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 9 */             O0ioIllo0i1[] o0ioIllo0i1Arr = IoOo0iOi.I0000oI00;
/* 11 */            String str = ioOo0iOi.I00000oIO;
/* 13 */            IoOlolIIi ioOlolIIi = ioOo0iOi.I0000O;
/* 15 */            List list = ioOo0iOi.I0000Il00O;
/* 17 */            String str2 = ioOo0iOi.I00000oOI;
/* 20 */            iOl1l0o0i1I0I00000oOI.I001IO000(oilOloI, 0, str);
/* 27 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || str2 != null) {
/* 35 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 1, OlOlllO.I00000oIO, str2);
                    }
/* 42 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || list != null) {
/* 56 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 2, (O0O01001OOII) o0ioIllo0i1Arr[2].getValue(), list);
                    }
/* 63 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || ioOlolIIi != null) {
/* 77 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 3, (O0O01001OOII) o0ioIllo0i1Arr[3].getValue(), ioOlolIIi);
                    }
/* 80 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

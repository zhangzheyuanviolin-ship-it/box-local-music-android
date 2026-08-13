            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OOO1O0I implements Io00l010I {
                public static final OOO1O0I I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             OOO1O0I ooo1o0i = new OOO1O0I();
/* 6 */             I00000oIO = ooo1o0i;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.PromptArgument", ooo1o0i, 4);
/* 19 */            oO1Ol1i.I000OiO("name", false);
/* 25 */            oO1Ol1i.I000OiO("description", true);
/* 30 */            oO1Ol1i.I000OiO("required", true);
/* 35 */            oO1Ol1i.I000OiO("title", true);
/* 38 */            descriptor = oO1Ol1i;
                }

                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 1 */             OlOlllO olOlllO = OlOlllO.I00000oIO;
/* 18 */            return new O0O01001OOII[]{olOlllO, iOi1iol.I00000oIO(olOlllO), iOi1iol.I00000oIO(II11OOi.I00000oIO), iOi1iol.I00000oIO(olOlllO)};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 10 */            boolean z = true;
/* 11 */            int i = 0;
/* 12 */            String strI000l1 = null;
/* 13 */            String str = null;
/* 14 */            Boolean bool = null;
/* 15 */            String str2 = null;
/* 16 */            while (z) {
/* 18 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
/* 23 */                if (iI000II == -1) {
/* 79 */                    z = false;
                        } else if (iI000II == 0) {
/* 72 */                    strI000l1 = iOl1ii1loOI00000oOI.I000l1(oilOloI, 0);
/* 76 */                    i |= 1;
                        } else if (iI000II == 1) {
/* 67 */                    str = (String) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 1, OlOlllO.I00000oIO, str);
/* 69 */                    i |= 2;
                        } else if (iI000II == 2) {
/* 56 */                    bool = (Boolean) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 2, II11OOi.I00000oIO, bool);
/* 58 */                    i |= 4;
                        } else {
/* 33 */                    if (iI000II != 3) {
/* 46 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 9 */                         return null;
                            }
/* 41 */                    str2 = (String) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 3, OlOlllO.I00000oIO, str2);
/* 43 */                    i |= 8;
                        }
                    }
/* 81 */            iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 88 */            if (1 != (i & 1)) {
/* 128 */               lI1IIO.I00000oIO(i, 1, descriptor);
/* 186 */               throw null;
                    }
/* 90 */            OOO1i1I oOO1i1I = new OOO1i1I();
/* 93 */            oOO1i1I.I00000oIO = strI000l1;
/* 97 */            if ((i & 2) == 0) {
/* 99 */                oOO1i1I.I00000oOI = null;
                    } else {
/* 102 */               oOO1i1I.I00000oOI = str;
                    }
/* 106 */           if ((i & 4) == 0) {
/* 108 */               oOO1i1I.I0000Il00O = null;
                    } else {
/* 111 */               oOO1i1I.I0000Il00O = bool;
                    }
/* 115 */           if ((i & 8) == 0) {
/* 117 */               oOO1i1I.I0000O = null;
                    } else {
/* 123 */               oOO1i1I.I0000O = str2;
                    }
/* 119 */           VarHandle.storeStoreFence();
/* 122 */           return oOO1i1I;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             OOO1i1I oOO1i1I = (OOO1i1I) obj;
/* 3 */             OilOloI oilOloI = descriptor;
/* 5 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 9 */             String str = oOO1i1I.I00000oIO;
/* 11 */            String str2 = oOO1i1I.I0000O;
/* 13 */            Boolean bool = oOO1i1I.I0000Il00O;
/* 15 */            String str3 = oOO1i1I.I00000oOI;
/* 18 */            iOl1l0o0i1I0I00000oOI.I001IO000(oilOloI, 0, str);
/* 25 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || str3 != null) {
/* 33 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 1, OlOlllO.I00000oIO, str3);
                    }
/* 40 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || bool != null) {
/* 48 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 2, II11OOi.I00000oIO, bool);
                    }
/* 55 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || str2 != null) {
/* 63 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 3, OlOlllO.I00000oIO, str2);
                    }
/* 66 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

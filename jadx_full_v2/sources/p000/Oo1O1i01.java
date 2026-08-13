            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Oo1O1i01 implements Io00l010I {
                public static final Oo1O1i01 I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             Oo1O1i01 oo1O1i01 = new Oo1O1i01();
/* 6 */             I00000oIO = oo1O1i01;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.ToolAnnotations", oo1O1i01, 5);
/* 19 */            oO1Ol1i.I000OiO("title", true);
/* 24 */            oO1Ol1i.I000OiO("readOnlyHint", true);
/* 29 */            oO1Ol1i.I000OiO("destructiveHint", true);
/* 34 */            oO1Ol1i.I000OiO("idempotentHint", true);
/* 39 */            oO1Ol1i.I000OiO("openWorldHint", true);
/* 42 */            descriptor = oO1Ol1i;
                }

                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 3 */             O0O01001OOII o0o01001ooiiI00000oIO = iOi1iol.I00000oIO(OlOlllO.I00000oIO);
/* 7 */             II11OOi iI11OOi = II11OOi.I00000oIO;
/* 26 */            return new O0O01001OOII[]{o0o01001ooiiI00000oIO, iOi1iol.I00000oIO(iI11OOi), iOi1iol.I00000oIO(iI11OOi), iOi1iol.I00000oIO(iI11OOi), iOi1iol.I00000oIO(iI11OOi)};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 10 */            boolean z = true;
/* 11 */            int i = 0;
/* 12 */            String str = null;
/* 13 */            Boolean bool = null;
/* 14 */            Boolean bool2 = null;
/* 15 */            Boolean bool3 = null;
/* 16 */            Boolean bool4 = null;
/* 17 */            while (z) {
/* 19 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
/* 24 */                if (iI000II == -1) {
/* 98 */                    z = false;
                        } else if (iI000II == 0) {
/* 93 */                    str = (String) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 0, OlOlllO.I00000oIO, str);
/* 95 */                    i |= 1;
                        } else if (iI000II == 1) {
/* 82 */                    bool = (Boolean) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 1, II11OOi.I00000oIO, bool);
/* 84 */                    i |= 2;
                        } else if (iI000II == 2) {
/* 71 */                    bool2 = (Boolean) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 2, II11OOi.I00000oIO, bool2);
/* 73 */                    i |= 4;
                        } else if (iI000II == 3) {
/* 60 */                    bool3 = (Boolean) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 3, II11OOi.I00000oIO, bool3);
/* 62 */                    i |= 8;
                        } else {
/* 37 */                    if (iI000II != 4) {
/* 50 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 9 */                         return null;
                            }
/* 45 */                    bool4 = (Boolean) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 4, II11OOi.I00000oIO, bool4);
/* 47 */                    i |= 16;
                        }
                    }
/* 100 */           iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 105 */           Oo1O1iOII oo1O1iOII = new Oo1O1iOII();
/* 110 */           if ((i & 1) == 0) {
/* 112 */               oo1O1iOII.I00000oIO = null;
                    } else {
/* 115 */               oo1O1iOII.I00000oIO = str;
                    }
/* 119 */           if ((i & 2) == 0) {
/* 121 */               oo1O1iOII.I00000oOI = null;
                    } else {
/* 124 */               oo1O1iOII.I00000oOI = bool;
                    }
/* 128 */           if ((i & 4) == 0) {
/* 130 */               oo1O1iOII.I0000Il00O = null;
                    } else {
/* 133 */               oo1O1iOII.I0000Il00O = bool2;
                    }
/* 137 */           if ((i & 8) == 0) {
/* 139 */               oo1O1iOII.I0000O = null;
                    } else {
/* 142 */               oo1O1iOII.I0000O = bool3;
                    }
/* 146 */           if ((i & 16) == 0) {
/* 148 */               oo1O1iOII.I0000oI00 = null;
                    } else {
/* 154 */               oo1O1iOII.I0000oI00 = bool4;
                    }
/* 150 */           VarHandle.storeStoreFence();
/* 153 */           return oo1O1iOII;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             Oo1O1iOII oo1O1iOII = (Oo1O1iOII) obj;
/* 3 */             Boolean bool = oo1O1iOII.I0000oI00;
/* 5 */             Boolean bool2 = oo1O1iOII.I0000O;
/* 7 */             Boolean bool3 = oo1O1iOII.I0000Il00O;
/* 9 */             Boolean bool4 = oo1O1iOII.I00000oOI;
/* 11 */            String str = oo1O1iOII.I00000oIO;
/* 13 */            OilOloI oilOloI = descriptor;
/* 15 */            IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 23 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || str != null) {
/* 31 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 0, OlOlllO.I00000oIO, str);
                    }
/* 38 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || bool4 != null) {
/* 46 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 1, II11OOi.I00000oIO, bool4);
                    }
/* 53 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || bool3 != null) {
/* 61 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 2, II11OOi.I00000oIO, bool3);
                    }
/* 68 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || bool2 != null) {
/* 76 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 3, II11OOi.I00000oIO, bool2);
                    }
/* 83 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || bool != null) {
/* 91 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 4, II11OOi.I00000oIO, bool);
                    }
/* 94 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public final class O1oloIliIoi implements Io00l010I {
                public static final O1oloIliIoi I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             O1oloIliIoi o1oloIliIoi = new O1oloIliIoi();
/* 6 */             I00000oIO = o1oloIliIoi;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.ModelPreferences", o1oloIliIoi, 4);
/* 19 */            oO1Ol1i.I000OiO("hints", true);
/* 24 */            oO1Ol1i.I000OiO("costPriority", true);
/* 29 */            oO1Ol1i.I000OiO("speedPriority", true);
/* 34 */            oO1Ol1i.I000OiO("intelligencePriority", true);
/* 37 */            descriptor = oO1Ol1i;
                }

                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 12 */            O0O01001OOII o0o01001ooiiI00000oIO = iOi1iol.I00000oIO((O0O01001OOII) O1oo01I1.I0000oI00[0].getValue());
/* 16 */            IiioO01 iiioO01 = IiioO01.I00000oIO;
/* 31 */            return new O0O01001OOII[]{o0o01001ooiiI00000oIO, iOi1iol.I00000oIO(iiioO01), iOi1iol.I00000oIO(iiioO01), iOi1iol.I00000oIO(iiioO01)};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 7 */             O0ioIllo0i1[] o0ioIllo0i1Arr = O1oo01I1.I0000oI00;
/* 12 */            boolean z = true;
/* 13 */            int i = 0;
/* 14 */            List list = null;
/* 15 */            Double d = null;
/* 16 */            Double d2 = null;
/* 17 */            Double d3 = null;
/* 18 */            while (z) {
/* 20 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
/* 25 */                if (iI000II == -1) {
/* 91 */                    z = false;
                        } else if (iI000II == 0) {
/* 86 */                    list = (List) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 0, (O0O01001OOII) o0ioIllo0i1Arr[0].getValue(), list);
/* 88 */                    i |= 1;
                        } else if (iI000II == 1) {
/* 69 */                    d = (Double) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 1, IiioO01.I00000oIO, d);
/* 71 */                    i |= 2;
                        } else if (iI000II == 2) {
/* 58 */                    d2 = (Double) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 2, IiioO01.I00000oIO, d2);
/* 60 */                    i |= 4;
                        } else {
/* 35 */                    if (iI000II != 3) {
/* 48 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 11 */                        return null;
                            }
/* 43 */                    d3 = (Double) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 3, IiioO01.I00000oIO, d3);
/* 45 */                    i |= 8;
                        }
                    }
/* 93 */            iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 98 */            O1oo01I1 o1oo01I1 = new O1oo01I1();
/* 103 */           if ((i & 1) == 0) {
/* 105 */               o1oo01I1.I00000oIO = null;
                    } else {
/* 108 */               o1oo01I1.I00000oIO = list;
                    }
/* 112 */           if ((i & 2) == 0) {
/* 114 */               o1oo01I1.I00000oOI = null;
/* 116 */               d = null;
                    } else {
/* 118 */               o1oo01I1.I00000oOI = d;
                    }
/* 122 */           if ((i & 4) == 0) {
/* 124 */               o1oo01I1.I0000Il00O = null;
/* 126 */               d2 = null;
                    } else {
/* 128 */               o1oo01I1.I0000Il00O = d2;
                    }
/* 132 */           if ((i & 8) == 0) {
/* 134 */               o1oo01I1.I0000O = null;
/* 136 */               d3 = null;
                    } else {
/* 138 */               o1oo01I1.I0000O = d3;
                    }
/* 146 */           if (d != null) {
/* 148 */               double dDoubleValue = d.doubleValue();
/* 154 */               if (0.0d > dDoubleValue || dDoubleValue > 1.0d) {
/* 161 */                   I000II.I000iOII("costPriority must be in 0.0 <= x <= 1.0 value range");
/* 11 */                    return null;
                        }
                    }
/* 165 */           if (d2 != null) {
/* 167 */               double dDoubleValue2 = d2.doubleValue();
/* 173 */               if (0.0d > dDoubleValue2 || dDoubleValue2 > 1.0d) {
/* 180 */                   I000II.I000iOII("costPriority must be in 0.0 <= x <= 1.0 value range");
/* 11 */                    return null;
                        }
                    }
/* 184 */           if (d3 != null) {
/* 186 */               double dDoubleValue3 = d3.doubleValue();
/* 192 */               if (0.0d > dDoubleValue3 || dDoubleValue3 > 1.0d) {
/* 201 */                   I000II.I000iOII("intelligencePriority must be in 0.0 <= x <= 1.0 value range");
/* 11 */                    return null;
                        }
                    }
/* 205 */           VarHandle.storeStoreFence();
/* 966 */           return o1oo01I1;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             O1oo01I1 o1oo01I1 = (O1oo01I1) obj;
/* 3 */             Double d = o1oo01I1.I0000O;
/* 5 */             Double d2 = o1oo01I1.I0000Il00O;
/* 7 */             Double d3 = o1oo01I1.I00000oOI;
/* 9 */             List list = o1oo01I1.I00000oIO;
/* 11 */            OilOloI oilOloI = descriptor;
/* 13 */            IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 17 */            O0ioIllo0i1[] o0ioIllo0i1Arr = O1oo01I1.I0000oI00;
/* 23 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || list != null) {
/* 37 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 0, (O0O01001OOII) o0ioIllo0i1Arr[0].getValue(), list);
                    }
/* 44 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || d3 != null) {
/* 52 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 1, IiioO01.I00000oIO, d3);
                    }
/* 59 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || d2 != null) {
/* 67 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 2, IiioO01.I00000oIO, d2);
                    }
/* 74 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || d != null) {
/* 82 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 3, IiioO01.I00000oIO, d);
                    }
/* 85 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

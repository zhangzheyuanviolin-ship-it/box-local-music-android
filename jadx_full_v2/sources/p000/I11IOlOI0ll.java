            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public final class I11IOlOI0ll implements Io00l010I {
                public static final I11IOlOI0ll I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             I11IOlOI0ll i11IOlOI0ll = new I11IOlOI0ll();
/* 6 */             I00000oIO = i11IOlOI0ll;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.Annotations", i11IOlOI0ll, 3);
/* 19 */            oO1Ol1i.I000OiO("audience", true);
/* 24 */            oO1Ol1i.I000OiO("priority", true);
/* 29 */            oO1Ol1i.I000OiO("lastModified", true);
/* 32 */            descriptor = oO1Ol1i;
                }

                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 29 */            return new O0O01001OOII[]{iOi1iol.I00000oIO((O0O01001OOII) I11Illil0iIl.I0000O[0].getValue()), iOi1iol.I00000oIO(IiioO01.I00000oIO), iOi1iol.I00000oIO(OlOlllO.I00000oIO)};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 7 */             O0ioIllo0i1[] o0ioIllo0i1Arr = I11Illil0iIl.I0000O;
/* 12 */            boolean z = true;
/* 13 */            int i = 0;
/* 14 */            List list = null;
/* 15 */            Double d = null;
/* 16 */            String str = null;
/* 17 */            while (z) {
/* 19 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
/* 24 */                if (iI000II == -1) {
/* 76 */                    z = false;
                        } else if (iI000II == 0) {
/* 71 */                    list = (List) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 0, (O0O01001OOII) o0ioIllo0i1Arr[0].getValue(), list);
/* 73 */                    i |= 1;
                        } else if (iI000II == 1) {
/* 54 */                    d = (Double) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 1, IiioO01.I00000oIO, d);
/* 56 */                    i |= 2;
                        } else {
/* 31 */                    if (iI000II != 2) {
/* 44 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 11 */                        return null;
                            }
/* 39 */                    str = (String) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 2, OlOlllO.I00000oIO, str);
/* 41 */                    i |= 4;
                        }
                    }
/* 78 */            iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 83 */            I11Illil0iIl i11Illil0iIl = new I11Illil0iIl();
/* 88 */            if ((i & 1) == 0) {
/* 90 */                i11Illil0iIl.I00000oIO = null;
                    } else {
/* 93 */                i11Illil0iIl.I00000oIO = list;
                    }
/* 97 */            if ((i & 2) == 0) {
/* 99 */                i11Illil0iIl.I00000oOI = null;
/* 101 */               d = null;
                    } else {
/* 103 */               i11Illil0iIl.I00000oOI = d;
                    }
/* 107 */           if ((i & 4) == 0) {
/* 109 */               i11Illil0iIl.I0000Il00O = null;
                    } else {
/* 112 */               i11Illil0iIl.I0000Il00O = str;
                    }
/* 114 */           if (d != null) {
/* 116 */               double dDoubleValue = d.doubleValue();
/* 124 */               if (0.0d > dDoubleValue || dDoubleValue > 1.0d) {
/* 135 */                   I000II.I000iOII("Priority must be between 0.0 and 1.0");
/* 11 */                    return null;
                        }
                    }
/* 139 */           VarHandle.storeStoreFence();
/* 186 */           return i11Illil0iIl;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             I11Illil0iIl i11Illil0iIl = (I11Illil0iIl) obj;
/* 3 */             String str = i11Illil0iIl.I0000Il00O;
/* 5 */             Double d = i11Illil0iIl.I00000oOI;
/* 7 */             List list = i11Illil0iIl.I00000oIO;
/* 9 */             OilOloI oilOloI = descriptor;
/* 11 */            IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 15 */            O0ioIllo0i1[] o0ioIllo0i1Arr = I11Illil0iIl.I0000O;
/* 21 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || list != null) {
/* 35 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 0, (O0O01001OOII) o0ioIllo0i1Arr[0].getValue(), list);
                    }
/* 42 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || d != null) {
/* 50 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 1, IiioO01.I00000oIO, d);
                    }
/* 57 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || str != null) {
/* 65 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 2, OlOlllO.I00000oIO, str);
                    }
/* 68 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

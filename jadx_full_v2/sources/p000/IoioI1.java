            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public final class IoioI1 implements Io00l010I {
                public static final IoioI1 I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             IoioI1 ioioI1 = new IoioI1();
/* 6 */             I00000oIO = ioioI1;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.Implementation", ioioI1, 5);
/* 19 */            oO1Ol1i.I000OiO("name", false);
/* 24 */            oO1Ol1i.I000OiO("version", false);
/* 30 */            oO1Ol1i.I000OiO("title", true);
/* 35 */            oO1Ol1i.I000OiO("websiteUrl", true);
/* 40 */            oO1Ol1i.I000OiO("icons", true);
/* 43 */            descriptor = oO1Ol1i;
                }

                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 1 */             O0ioIllo0i1[] o0ioIllo0i1Arr = IoioIli11o.I0001Ioi1lo;
/* 3 */             OlOlllO olOlllO = OlOlllO.I00000oIO;
/* 27 */            return new O0O01001OOII[]{olOlllO, olOlllO, iOi1iol.I00000oIO(olOlllO), iOi1iol.I00000oIO(olOlllO), iOi1iol.I00000oIO((O0O01001OOII) o0ioIllo0i1Arr[4].getValue())};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 7 */             O0ioIllo0i1[] o0ioIllo0i1Arr = IoioIli11o.I0001Ioi1lo;
/* 12 */            boolean z = true;
/* 13 */            int i = 0;
/* 14 */            String strI000l1 = null;
/* 15 */            String strI000l12 = null;
/* 16 */            String str = null;
/* 17 */            String str2 = null;
/* 18 */            List list = null;
/* 20 */            while (z) {
/* 22 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
/* 27 */                if (iI000II == -1) {
/* 98 */                    z = false;
                        } else if (iI000II == 0) {
/* 91 */                    strI000l1 = iOl1ii1loOI00000oOI.I000l1(oilOloI, 0);
/* 95 */                    i |= 1;
                        } else if (iI000II == 1) {
/* 84 */                    strI000l12 = iOl1ii1loOI00000oOI.I000l1(oilOloI, 1);
/* 88 */                    i |= 2;
                        } else if (iI000II == 2) {
/* 79 */                    str = (String) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 2, OlOlllO.I00000oIO, str);
/* 81 */                    i |= 4;
                        } else if (iI000II == 3) {
/* 68 */                    str2 = (String) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 3, OlOlllO.I00000oIO, str2);
/* 70 */                    i |= 8;
                        } else {
/* 39 */                    if (iI000II != 4) {
/* 58 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 11 */                        return null;
                            }
/* 53 */                    list = (List) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 4, (O0O01001OOII) o0ioIllo0i1Arr[4].getValue(), list);
/* 55 */                    i |= 16;
                        }
                    }
/* 100 */           iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 107 */           if (3 != (i & 3)) {
/* 149 */               lI1IIO.I00000oIO(i, 3, descriptor);
/* 186 */               throw null;
                    }
/* 109 */           IoioIli11o ioioIli11o = new IoioIli11o();
/* 112 */           ioioIli11o.I00000oIO = strI000l1;
/* 114 */           ioioIli11o.I00000oOI = strI000l12;
/* 118 */           if ((i & 4) == 0) {
/* 120 */               ioioIli11o.I0000Il00O = null;
                    } else {
/* 123 */               ioioIli11o.I0000Il00O = str;
                    }
/* 127 */           if ((i & 8) == 0) {
/* 129 */               ioioIli11o.I0000O = null;
                    } else {
/* 132 */               ioioIli11o.I0000O = str2;
                    }
/* 136 */           if ((i & 16) == 0) {
/* 138 */               ioioIli11o.I0000oI00 = null;
                    } else {
/* 144 */               ioioIli11o.I0000oI00 = list;
                    }
/* 140 */           VarHandle.storeStoreFence();
/* 143 */           return ioioIli11o;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             IoioIli11o ioioIli11o = (IoioIli11o) obj;
/* 3 */             OilOloI oilOloI = descriptor;
/* 5 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 9 */             O0ioIllo0i1[] o0ioIllo0i1Arr = IoioIli11o.I0001Ioi1lo;
/* 11 */            String str = ioioIli11o.I00000oIO;
/* 13 */            List list = ioioIli11o.I0000oI00;
/* 15 */            String str2 = ioioIli11o.I0000O;
/* 17 */            String str3 = ioioIli11o.I0000Il00O;
/* 20 */            iOl1l0o0i1I0I00000oOI.I001IO000(oilOloI, 0, str);
/* 26 */            iOl1l0o0i1I0I00000oOI.I001IO000(oilOloI, 1, ioioIli11o.I00000oOI);
/* 33 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || str3 != null) {
/* 41 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 2, OlOlllO.I00000oIO, str3);
                    }
/* 48 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || str2 != null) {
/* 56 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 3, OlOlllO.I00000oIO, str2);
                    }
/* 63 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || list != null) {
/* 77 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 4, (O0O01001OOII) o0ioIllo0i1Arr[4].getValue(), list);
                    }
/* 80 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

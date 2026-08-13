            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public final class OOO1I10Oo implements Io00l010I {
                public static final OOO1I10Oo I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             OOO1I10Oo oOO1I10Oo = new OOO1I10Oo();
/* 6 */             I00000oIO = oOO1I10Oo;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.Prompt", oOO1I10Oo, 6);
/* 19 */            oO1Ol1i.I000OiO("name", false);
/* 25 */            oO1Ol1i.I000OiO("description", true);
/* 30 */            oO1Ol1i.I000OiO("arguments", true);
/* 35 */            oO1Ol1i.I000OiO("title", true);
/* 40 */            oO1Ol1i.I000OiO("icons", true);
/* 45 */            oO1Ol1i.I000OiO("_meta", true);
/* 48 */            descriptor = oO1Ol1i;
                }

                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 1 */             O0ioIllo0i1[] o0ioIllo0i1Arr = OOO1Ii1.I000II;
/* 3 */             OlOlllO olOlllO = OlOlllO.I00000oIO;
/* 46 */            return new O0O01001OOII[]{olOlllO, iOi1iol.I00000oIO(olOlllO), iOi1iol.I00000oIO((O0O01001OOII) o0ioIllo0i1Arr[2].getValue()), iOi1iol.I00000oIO(olOlllO), iOi1iol.I00000oIO((O0O01001OOII) o0ioIllo0i1Arr[4].getValue()), iOi1iol.I00000oIO(O01l1I.I00000oIO)};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 7 */             O0ioIllo0i1[] o0ioIllo0i1Arr = OOO1Ii1.I000II;
/* 12 */            boolean z = true;
/* 13 */            int i = 0;
/* 14 */            String strI000l1 = null;
/* 15 */            String str = null;
/* 16 */            List list = null;
/* 17 */            String str2 = null;
/* 18 */            List list2 = null;
/* 19 */            O01ioO1o0i11 o01ioO1o0i11 = null;
/* 20 */            while (z) {
/* 22 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
                        switch (iI000II) {
                            case -1:
/* 111 */                       z = false;
                                break;
                            case 0:
/* 104 */                       strI000l1 = iOl1ii1loOI00000oOI.I000l1(oilOloI, 0);
/* 108 */                       i |= 1;
                                break;
                            case 1:
/* 99 */                        str = (String) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 1, OlOlllO.I00000oIO, str);
/* 101 */                       i |= 2;
                                break;
                            case 2:
/* 88 */                        list = (List) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 2, (O0O01001OOII) o0ioIllo0i1Arr[2].getValue(), list);
/* 90 */                        i |= 4;
                                break;
                            case 3:
/* 70 */                        str2 = (String) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 3, OlOlllO.I00000oIO, str2);
/* 72 */                        i |= 8;
                                break;
                            case 4:
/* 58 */                        list2 = (List) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 4, (O0O01001OOII) o0ioIllo0i1Arr[4].getValue(), list2);
/* 60 */                        i |= 16;
                                break;
                            case 5:
/* 40 */                        o01ioO1o0i11 = (O01ioO1o0i11) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 5, O01l1I.I00000oIO, o01ioO1o0i11);
/* 42 */                        i |= 32;
                                break;
                            default:
/* 29 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 11 */                        return null;
                        }
                    }
/* 113 */           iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 120 */           if (1 != (i & 1)) {
/* 178 */               lI1IIO.I00000oIO(i, 1, descriptor);
/* 181 */               throw null;
                    }
/* 122 */           OOO1Ii1 oOO1Ii1 = new OOO1Ii1();
/* 125 */           oOO1Ii1.I00000oIO = strI000l1;
/* 129 */           if ((i & 2) == 0) {
/* 131 */               oOO1Ii1.I00000oOI = null;
                    } else {
/* 134 */               oOO1Ii1.I00000oOI = str;
                    }
/* 138 */           if ((i & 4) == 0) {
/* 140 */               oOO1Ii1.I0000Il00O = null;
                    } else {
/* 143 */               oOO1Ii1.I0000Il00O = list;
                    }
/* 147 */           if ((i & 8) == 0) {
/* 149 */               oOO1Ii1.I0000O = null;
                    } else {
/* 152 */               oOO1Ii1.I0000O = str2;
                    }
/* 156 */           if ((i & 16) == 0) {
/* 158 */               oOO1Ii1.I0000oI00 = null;
                    } else {
/* 161 */               oOO1Ii1.I0000oI00 = list2;
                    }
/* 165 */           if ((i & 32) == 0) {
/* 167 */               oOO1Ii1.I0001Ioi1lo = null;
                    } else {
/* 173 */               oOO1Ii1.I0001Ioi1lo = o01ioO1o0i11;
                    }
/* 169 */           VarHandle.storeStoreFence();
/* 172 */           return oOO1Ii1;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             OOO1Ii1 oOO1Ii1 = (OOO1Ii1) obj;
/* 3 */             OilOloI oilOloI = descriptor;
/* 5 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 9 */             O0ioIllo0i1[] o0ioIllo0i1Arr = OOO1Ii1.I000II;
/* 11 */            String str = oOO1Ii1.I00000oIO;
/* 13 */            O01ioO1o0i11 o01ioO1o0i11 = oOO1Ii1.I0001Ioi1lo;
/* 15 */            List list = oOO1Ii1.I0000oI00;
/* 17 */            String str2 = oOO1Ii1.I0000O;
/* 19 */            List list2 = oOO1Ii1.I0000Il00O;
/* 21 */            String str3 = oOO1Ii1.I00000oOI;
/* 24 */            iOl1l0o0i1I0I00000oOI.I001IO000(oilOloI, 0, str);
/* 31 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || str3 != null) {
/* 39 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 1, OlOlllO.I00000oIO, str3);
                    }
/* 46 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || list2 != null) {
/* 60 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 2, (O0O01001OOII) o0ioIllo0i1Arr[2].getValue(), list2);
                    }
/* 67 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || str2 != null) {
/* 75 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 3, OlOlllO.I00000oIO, str2);
                    }
/* 82 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || list != null) {
/* 96 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 4, (O0O01001OOII) o0ioIllo0i1Arr[4].getValue(), list);
                    }
/* 103 */           if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || o01ioO1o0i11 != null) {
/* 111 */               iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 5, O01l1I.I00000oIO, o01ioO1o0i11);
                    }
/* 114 */           iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

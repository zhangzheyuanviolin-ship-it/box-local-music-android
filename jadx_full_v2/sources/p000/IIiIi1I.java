            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public final class IIiIi1I implements Io00l010I {
                public static final IIiIi1I I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             IIiIi1I iIiIi1I = new IIiIi1I();
/* 6 */             I00000oIO = iIiIi1I;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.CallToolResult", iIiIi1I, 4);
/* 19 */            oO1Ol1i.I000OiO("content", false);
/* 25 */            oO1Ol1i.I000OiO("isError", true);
/* 30 */            oO1Ol1i.I000OiO("structuredContent", true);
/* 35 */            oO1Ol1i.I000OiO("_meta", true);
/* 38 */            descriptor = oO1Ol1i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 24 */            O01l1I o01l1I = O01l1I.I00000oIO;
/* 4 */             return new O0O01001OOII[]{IIiIoI1ii1.I0000oI00[0].getValue(), iOi1iol.I00000oIO(II11OOi.I00000oIO), iOi1iol.I00000oIO(o01l1I), iOi1iol.I00000oIO(o01l1I)};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 7 */             O0ioIllo0i1[] o0ioIllo0i1Arr = IIiIoI1ii1.I0000oI00;
/* 12 */            boolean z = true;
/* 13 */            int i = 0;
/* 14 */            List list = null;
/* 15 */            Boolean bool = null;
/* 16 */            O01ioO1o0i11 o01ioO1o0i11 = null;
/* 17 */            O01ioO1o0i11 o01ioO1o0i112 = null;
/* 18 */            while (z) {
/* 20 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
/* 25 */                if (iI000II == -1) {
/* 91 */                    z = false;
                        } else if (iI000II == 0) {
/* 86 */                    list = (List) iOl1ii1loOI00000oOI.I00100o1O0lo(oilOloI, 0, (O0O01001OOII) o0ioIllo0i1Arr[0].getValue(), list);
/* 88 */                    i |= 1;
                        } else if (iI000II == 1) {
/* 69 */                    bool = (Boolean) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 1, II11OOi.I00000oIO, bool);
/* 71 */                    i |= 2;
                        } else if (iI000II == 2) {
/* 58 */                    o01ioO1o0i11 = (O01ioO1o0i11) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 2, O01l1I.I00000oIO, o01ioO1o0i11);
/* 60 */                    i |= 4;
                        } else {
/* 35 */                    if (iI000II != 3) {
/* 48 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 11 */                        return null;
                            }
/* 43 */                    o01ioO1o0i112 = (O01ioO1o0i11) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 3, O01l1I.I00000oIO, o01ioO1o0i112);
/* 45 */                    i |= 8;
                        }
                    }
/* 93 */            iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 100 */           if (1 != (i & 1)) {
/* 140 */               lI1IIO.I00000oIO(i, 1, descriptor);
/* 186 */               throw null;
                    }
/* 102 */           IIiIoI1ii1 iIiIoI1ii1 = new IIiIoI1ii1();
/* 105 */           iIiIoI1ii1.I00000oIO = list;
/* 109 */           if ((i & 2) == 0) {
/* 111 */               iIiIoI1ii1.I00000oOI = null;
                    } else {
/* 114 */               iIiIoI1ii1.I00000oOI = bool;
                    }
/* 118 */           if ((i & 4) == 0) {
/* 120 */               iIiIoI1ii1.I0000Il00O = null;
                    } else {
/* 123 */               iIiIoI1ii1.I0000Il00O = o01ioO1o0i11;
                    }
/* 127 */           if ((i & 8) == 0) {
/* 129 */               iIiIoI1ii1.I0000O = null;
                    } else {
/* 135 */               iIiIoI1ii1.I0000O = o01ioO1o0i112;
                    }
/* 131 */           VarHandle.storeStoreFence();
/* 134 */           return iIiIoI1ii1;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             IIiIoI1ii1 iIiIoI1ii1 = (IIiIoI1ii1) obj;
/* 3 */             OilOloI oilOloI = descriptor;
/* 5 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 18 */            O0O01001OOII o0o01001ooii = (O0O01001OOII) IIiIoI1ii1.I0000oI00[0].getValue();
/* 20 */            List list = iIiIoI1ii1.I00000oIO;
/* 22 */            O01ioO1o0i11 o01ioO1o0i11 = iIiIoI1ii1.I0000O;
/* 24 */            O01ioO1o0i11 o01ioO1o0i112 = iIiIoI1ii1.I0000Il00O;
/* 26 */            Boolean bool = iIiIoI1ii1.I00000oOI;
/* 28 */            iOl1l0o0i1I0I00000oOI.I000l1(oilOloI, 0, o0o01001ooii, list);
/* 35 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || bool != null) {
/* 43 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 1, II11OOi.I00000oIO, bool);
                    }
/* 50 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || o01ioO1o0i112 != null) {
/* 58 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 2, O01l1I.I00000oIO, o01ioO1o0i112);
                    }
/* 65 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || o01ioO1o0i11 != null) {
/* 73 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 3, O01l1I.I00000oIO, o01ioO1o0i11);
                    }
/* 76 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

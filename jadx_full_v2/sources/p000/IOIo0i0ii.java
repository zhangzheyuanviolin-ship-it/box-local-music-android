            package p000;
            
            public final class IOIo0i0ii implements Io00l010I {
                public static final IOIo0i0ii I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             IOIo0i0ii iOIo0i0ii = new IOIo0i0ii();
/* 6 */             I00000oIO = iOIo0i0ii;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.ClientCapabilities", iOIo0i0ii, 4);
/* 19 */            oO1Ol1i.I000OiO("sampling", true);
/* 24 */            oO1Ol1i.I000OiO("roots", true);
/* 29 */            oO1Ol1i.I000OiO("elicitation", true);
/* 34 */            oO1Ol1i.I000OiO("experimental", true);
/* 37 */            descriptor = oO1Ol1i;
                }

                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 1 */             O01l1I o01l1I = O01l1I.I00000oIO;
/* 22 */            return new O0O01001OOII[]{iOi1iol.I00000oIO(o01l1I), iOi1iol.I00000oIO(IOIo1l1l1i.I00000oIO), iOi1iol.I00000oIO(o01l1I), iOi1iol.I00000oIO(o01l1I)};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 10 */            boolean z = true;
/* 11 */            int i = 0;
/* 12 */            O01ioO1o0i11 o01ioO1o0i11 = null;
/* 13 */            IOIoIIO iOIoIIO = null;
/* 14 */            O01ioO1o0i11 o01ioO1o0i112 = null;
/* 15 */            O01ioO1o0i11 o01ioO1o0i113 = null;
/* 16 */            while (z) {
/* 18 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
/* 23 */                if (iI000II == -1) {
/* 83 */                    z = false;
                        } else if (iI000II == 0) {
/* 78 */                    o01ioO1o0i11 = (O01ioO1o0i11) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 0, O01l1I.I00000oIO, o01ioO1o0i11);
/* 80 */                    i |= 1;
                        } else if (iI000II == 1) {
/* 67 */                    iOIoIIO = (IOIoIIO) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 1, IOIo1l1l1i.I00000oIO, iOIoIIO);
/* 69 */                    i |= 2;
                        } else if (iI000II == 2) {
/* 56 */                    o01ioO1o0i112 = (O01ioO1o0i11) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 2, O01l1I.I00000oIO, o01ioO1o0i112);
/* 58 */                    i |= 4;
                        } else {
/* 33 */                    if (iI000II != 3) {
/* 46 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 9 */                         return null;
                            }
/* 41 */                    o01ioO1o0i113 = (O01ioO1o0i11) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 3, O01l1I.I00000oIO, o01ioO1o0i113);
/* 43 */                    i |= 8;
                        }
                    }
/* 85 */            iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 90 */            IOIoIi11i0ll iOIoIi11i0ll = new IOIoIi11i0ll();
/* 95 */            if ((i & 1) == 0) {
/* 97 */                iOIoIi11i0ll.I00000oIO = null;
                    } else {
/* 100 */               iOIoIi11i0ll.I00000oIO = o01ioO1o0i11;
                    }
/* 104 */           if ((i & 2) == 0) {
/* 106 */               iOIoIi11i0ll.I00000oOI = null;
                    } else {
/* 109 */               iOIoIi11i0ll.I00000oOI = iOIoIIO;
                    }
/* 113 */           if ((i & 4) == 0) {
/* 115 */               iOIoIi11i0ll.I0000Il00O = null;
                    } else {
/* 118 */               iOIoIi11i0ll.I0000Il00O = o01ioO1o0i112;
                    }
/* 122 */           if ((i & 8) == 0) {
/* 124 */               iOIoIi11i0ll.I0000O = null;
/* 126 */               return iOIoIi11i0ll;
                    }
/* 127 */           iOIoIi11i0ll.I0000O = o01ioO1o0i113;
/* 186 */           return iOIoIi11i0ll;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             IOIoIi11i0ll iOIoIi11i0ll = (IOIoIi11i0ll) obj;
/* 3 */             O01ioO1o0i11 o01ioO1o0i11 = iOIoIi11i0ll.I0000O;
/* 5 */             O01ioO1o0i11 o01ioO1o0i112 = iOIoIi11i0ll.I0000Il00O;
/* 7 */             IOIoIIO iOIoIIO = iOIoIi11i0ll.I00000oOI;
/* 9 */             O01ioO1o0i11 o01ioO1o0i113 = iOIoIi11i0ll.I00000oIO;
/* 11 */            OilOloI oilOloI = descriptor;
/* 13 */            IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 17 */            IOIo10oi11 iOIo10oi11 = IOIoIi11i0ll.Companion;
/* 23 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || o01ioO1o0i113 != null) {
/* 31 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 0, O01l1I.I00000oIO, o01ioO1o0i113);
                    }
/* 38 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || iOIoIIO != null) {
/* 46 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 1, IOIo1l1l1i.I00000oIO, iOIoIIO);
                    }
/* 53 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || o01ioO1o0i112 != null) {
/* 61 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 2, O01l1I.I00000oIO, o01ioO1o0i112);
                    }
/* 68 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || o01ioO1o0i11 != null) {
/* 76 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 3, O01l1I.I00000oIO, o01ioO1o0i11);
                    }
/* 79 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

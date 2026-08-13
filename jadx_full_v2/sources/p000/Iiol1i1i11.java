            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Iiol1i1i11 implements Io00l010I {
                public static final Iiol1i1i11 I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             Iiol1i1i11 iiol1i1i11 = new Iiol1i1i11();
/* 6 */             I00000oIO = iiol1i1i11;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.EmbeddedResource", iiol1i1i11, 4);
/* 19 */            oO1Ol1i.I000OiO("resource", false);
/* 25 */            oO1Ol1i.I000OiO("annotations", true);
/* 30 */            oO1Ol1i.I000OiO("_meta", true);
/* 35 */            oO1Ol1i.I000OiO("type", true);
/* 38 */            descriptor = oO1Ol1i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 4 */             return new O0O01001OOII[]{Oi0iolIl.I0000Il00O, iOi1iol.I00000oIO(I11IOlOI0ll.I00000oIO), iOi1iol.I00000oIO(O01l1I.I00000oIO), IiolIiOioiOO.I0000oI00[3].getValue()};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 7 */             O0ioIllo0i1[] o0ioIllo0i1Arr = IiolIiOioiOO.I0000oI00;
/* 12 */            boolean z = true;
/* 13 */            int i = 0;
/* 14 */            Oi0iol0 oi0iol0 = null;
/* 15 */            I11Illil0iIl i11Illil0iIl = null;
/* 16 */            O01ioO1o0i11 o01ioO1o0i11 = null;
/* 17 */            IOoOoo0 iOoOoo0 = null;
/* 18 */            while (z) {
/* 20 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
/* 25 */                if (iI000II == -1) {
/* 91 */                    z = false;
                        } else if (iI000II == 0) {
/* 86 */                    oi0iol0 = (Oi0iol0) iOl1ii1loOI00000oOI.I00100o1O0lo(oilOloI, 0, Oi0iolIl.I0000Il00O, oi0iol0);
/* 88 */                    i |= 1;
                        } else if (iI000II == 1) {
/* 75 */                    i11Illil0iIl = (I11Illil0iIl) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 1, I11IOlOI0ll.I00000oIO, i11Illil0iIl);
/* 77 */                    i |= 2;
                        } else if (iI000II == 2) {
/* 64 */                    o01ioO1o0i11 = (O01ioO1o0i11) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 2, O01l1I.I00000oIO, o01ioO1o0i11);
/* 66 */                    i |= 4;
                        } else {
/* 35 */                    if (iI000II != 3) {
/* 54 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 11 */                        return null;
                            }
/* 49 */                    iOoOoo0 = (IOoOoo0) iOl1ii1loOI00000oOI.I00100o1O0lo(oilOloI, 3, (O0O01001OOII) o0ioIllo0i1Arr[3].getValue(), iOoOoo0);
/* 51 */                    i |= 8;
                        }
                    }
/* 93 */            iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 100 */           if (1 != (i & 1)) {
/* 142 */               lI1IIO.I00000oIO(i, 1, descriptor);
/* 186 */               throw null;
                    }
/* 102 */           IiolIiOioiOO iiolIiOioiOO = new IiolIiOioiOO();
/* 105 */           iiolIiOioiOO.I00000oIO = oi0iol0;
/* 109 */           if ((i & 2) == 0) {
/* 111 */               iiolIiOioiOO.I00000oOI = null;
                    } else {
/* 114 */               iiolIiOioiOO.I00000oOI = i11Illil0iIl;
                    }
/* 118 */           if ((i & 4) == 0) {
/* 120 */               iiolIiOioiOO.I0000Il00O = null;
                    } else {
/* 123 */               iiolIiOioiOO.I0000Il00O = o01ioO1o0i11;
                    }
/* 127 */           if ((i & 8) == 0) {
/* 131 */               iiolIiOioiOO.I0000O = IOoOoo0.I00ilO0;
                    } else {
/* 137 */               iiolIiOioiOO.I0000O = iOoOoo0;
                    }
/* 133 */           VarHandle.storeStoreFence();
/* 136 */           return iiolIiOioiOO;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             IiolIiOioiOO iiolIiOioiOO = (IiolIiOioiOO) obj;
/* 3 */             OilOloI oilOloI = descriptor;
/* 5 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 9 */             O0ioIllo0i1[] o0ioIllo0i1Arr = IiolIiOioiOO.I0000oI00;
/* 11 */            Oi0iolIl oi0iolIl = Oi0iolIl.I0000Il00O;
/* 13 */            Oi0iol0 oi0iol0 = iiolIiOioiOO.I00000oIO;
/* 15 */            O01ioO1o0i11 o01ioO1o0i11 = iiolIiOioiOO.I0000Il00O;
/* 17 */            I11Illil0iIl i11Illil0iIl = iiolIiOioiOO.I00000oOI;
/* 20 */            iOl1l0o0i1I0I00000oOI.I000l1(oilOloI, 0, oi0iolIl, oi0iol0);
/* 27 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || i11Illil0iIl != null) {
/* 35 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 1, I11IOlOI0ll.I00000oIO, i11Illil0iIl);
                    }
/* 42 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || o01ioO1o0i11 != null) {
/* 50 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 2, O01l1I.I00000oIO, o01ioO1o0i11);
                    }
/* 64 */            iOl1l0o0i1I0I00000oOI.I000l1(oilOloI, 3, (O0O01001OOII) o0ioIllo0i1Arr[3].getValue(), iiolIiOioiOO.I0000O);
/* 67 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

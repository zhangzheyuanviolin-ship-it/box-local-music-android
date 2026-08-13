            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Ioi1loO1I implements Io00l010I {
                public static final Ioi1loO1I I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             Ioi1loO1I ioi1loO1I = new Ioi1loO1I();
/* 6 */             I00000oIO = ioi1loO1I;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.ImageContent", ioi1loO1I, 5);
/* 19 */            oO1Ol1i.I000OiO("data", false);
/* 24 */            oO1Ol1i.I000OiO("mimeType", false);
/* 30 */            oO1Ol1i.I000OiO("annotations", true);
/* 35 */            oO1Ol1i.I000OiO("_meta", true);
/* 40 */            oO1Ol1i.I000OiO("type", true);
/* 43 */            descriptor = oO1Ol1i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 1 */             O0ioIllo0i1[] o0ioIllo0i1Arr = IoiI00.I0001Ioi1lo;
/* 6 */             OlOlllO olOlllO = OlOlllO.I00000oIO;
/* 4 */             return new O0O01001OOII[]{olOlllO, olOlllO, iOi1iol.I00000oIO(I11IOlOI0ll.I00000oIO), iOi1iol.I00000oIO(O01l1I.I00000oIO), o0ioIllo0i1Arr[4].getValue()};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 7 */             O0ioIllo0i1[] o0ioIllo0i1Arr = IoiI00.I0001Ioi1lo;
/* 12 */            boolean z = true;
/* 13 */            int i = 0;
/* 14 */            String strI000l1 = null;
/* 15 */            String strI000l12 = null;
/* 16 */            I11Illil0iIl i11Illil0iIl = null;
/* 17 */            O01ioO1o0i11 o01ioO1o0i11 = null;
/* 18 */            IOoOoo0 iOoOoo0 = null;
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
/* 79 */                    i11Illil0iIl = (I11Illil0iIl) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 2, I11IOlOI0ll.I00000oIO, i11Illil0iIl);
/* 81 */                    i |= 4;
                        } else if (iI000II == 3) {
/* 68 */                    o01ioO1o0i11 = (O01ioO1o0i11) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 3, O01l1I.I00000oIO, o01ioO1o0i11);
/* 70 */                    i |= 8;
                        } else {
/* 39 */                    if (iI000II != 4) {
/* 58 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 11 */                        return null;
                            }
/* 53 */                    iOoOoo0 = (IOoOoo0) iOl1ii1loOI00000oOI.I00100o1O0lo(oilOloI, 4, (O0O01001OOII) o0ioIllo0i1Arr[4].getValue(), iOoOoo0);
/* 55 */                    i |= 16;
                        }
                    }
/* 100 */           iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 107 */           if (3 != (i & 3)) {
/* 151 */               lI1IIO.I00000oIO(i, 3, descriptor);
/* 186 */               throw null;
                    }
/* 109 */           IoiI00 ioiI00 = new IoiI00();
/* 112 */           ioiI00.I00000oIO = strI000l1;
/* 114 */           ioiI00.I00000oOI = strI000l12;
/* 118 */           if ((i & 4) == 0) {
/* 120 */               ioiI00.I0000Il00O = null;
                    } else {
/* 123 */               ioiI00.I0000Il00O = i11Illil0iIl;
                    }
/* 127 */           if ((i & 8) == 0) {
/* 129 */               ioiI00.I0000O = null;
                    } else {
/* 132 */               ioiI00.I0000O = o01ioO1o0i11;
                    }
/* 136 */           if ((i & 16) == 0) {
/* 140 */               ioiI00.I0000oI00 = IOoOoo0.I00iiO;
                    } else {
/* 146 */               ioiI00.I0000oI00 = iOoOoo0;
                    }
/* 142 */           VarHandle.storeStoreFence();
/* 145 */           return ioiI00;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             IoiI00 ioiI00 = (IoiI00) obj;
/* 3 */             OilOloI oilOloI = descriptor;
/* 5 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 9 */             O0ioIllo0i1[] o0ioIllo0i1Arr = IoiI00.I0001Ioi1lo;
/* 11 */            String str = ioiI00.I00000oIO;
/* 13 */            O01ioO1o0i11 o01ioO1o0i11 = ioiI00.I0000O;
/* 15 */            I11Illil0iIl i11Illil0iIl = ioiI00.I0000Il00O;
/* 18 */            iOl1l0o0i1I0I00000oOI.I001IO000(oilOloI, 0, str);
/* 24 */            iOl1l0o0i1I0I00000oOI.I001IO000(oilOloI, 1, ioiI00.I00000oOI);
/* 31 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || i11Illil0iIl != null) {
/* 39 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 2, I11IOlOI0ll.I00000oIO, i11Illil0iIl);
                    }
/* 46 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || o01ioO1o0i11 != null) {
/* 54 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 3, O01l1I.I00000oIO, o01ioO1o0i11);
                    }
/* 68 */            iOl1l0o0i1I0I00000oOI.I000l1(oilOloI, 4, (O0O01001OOII) o0ioIllo0i1Arr[4].getValue(), ioiI00.I0000oI00);
/* 71 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

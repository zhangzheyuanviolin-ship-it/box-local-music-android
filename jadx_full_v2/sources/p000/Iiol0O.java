            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Iiol0O implements Io00l010I {
                public static final Iiol0O I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             Iiol0O iiol0O = new Iiol0O();
/* 6 */             I00000oIO = iiol0O;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.ElicitResult", iiol0O, 3);
/* 19 */            oO1Ol1i.I000OiO("action", false);
/* 25 */            oO1Ol1i.I000OiO("content", true);
/* 30 */            oO1Ol1i.I000OiO("_meta", true);
/* 33 */            descriptor = oO1Ol1i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 15 */            O01l1I o01l1I = O01l1I.I00000oIO;
/* 4 */             return new O0O01001OOII[]{Iiol1i01oo.I0000O[0].getValue(), iOi1iol.I00000oIO(o01l1I), iOi1iol.I00000oIO(o01l1I)};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 7 */             O0ioIllo0i1[] o0ioIllo0i1Arr = Iiol1i01oo.I0000O;
/* 12 */            boolean z = true;
/* 13 */            int i = 0;
/* 14 */            Iiol0ol0oI iiol0ol0oI = null;
/* 15 */            O01ioO1o0i11 o01ioO1o0i11 = null;
/* 16 */            O01ioO1o0i11 o01ioO1o0i112 = null;
/* 17 */            while (z) {
/* 19 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
/* 24 */                if (iI000II == -1) {
/* 76 */                    z = false;
                        } else if (iI000II == 0) {
/* 71 */                    iiol0ol0oI = (Iiol0ol0oI) iOl1ii1loOI00000oOI.I00100o1O0lo(oilOloI, 0, (O0O01001OOII) o0ioIllo0i1Arr[0].getValue(), iiol0ol0oI);
/* 73 */                    i |= 1;
                        } else if (iI000II == 1) {
/* 54 */                    o01ioO1o0i11 = (O01ioO1o0i11) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 1, O01l1I.I00000oIO, o01ioO1o0i11);
/* 56 */                    i |= 2;
                        } else {
/* 31 */                    if (iI000II != 2) {
/* 44 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 11 */                        return null;
                            }
/* 39 */                    o01ioO1o0i112 = (O01ioO1o0i11) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 2, O01l1I.I00000oIO, o01ioO1o0i112);
/* 41 */                    i |= 4;
                        }
                    }
/* 78 */            iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 85 */            if (1 != (i & 1)) {
/* 132 */               lI1IIO.I00000oIO(i, 1, descriptor);
/* 186 */               throw null;
                    }
/* 87 */            Iiol1i01oo iiol1i01oo = new Iiol1i01oo();
/* 90 */            iiol1i01oo.I00000oIO = iiol0ol0oI;
/* 94 */            if ((i & 2) == 0) {
/* 96 */                iiol1i01oo.I00000oOI = null;
/* 98 */                o01ioO1o0i11 = null;
                    } else {
/* 100 */               iiol1i01oo.I00000oOI = o01ioO1o0i11;
                    }
/* 104 */           if ((i & 4) == 0) {
/* 106 */               iiol1i01oo.I0000Il00O = null;
                    } else {
/* 109 */               iiol1i01oo.I0000Il00O = o01ioO1o0i112;
                    }
/* 113 */           if (iiol0ol0oI == Iiol0ol0oI.I00iiI || o01ioO1o0i11 == null) {
/* 126 */               VarHandle.storeStoreFence();
/* 129 */               return iiol1i01oo;
                    }
/* 122 */           OIiilo1Ool0o.I0010o(iiol0ol0oI, "Content can only be provided when action is 'accept', got action=", " with content");
/* 11 */            return null;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             Iiol1i01oo iiol1i01oo = (Iiol1i01oo) obj;
/* 3 */             OilOloI oilOloI = descriptor;
/* 5 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 18 */            O0O01001OOII o0o01001ooii = (O0O01001OOII) Iiol1i01oo.I0000O[0].getValue();
/* 20 */            Iiol0ol0oI iiol0ol0oI = iiol1i01oo.I00000oIO;
/* 22 */            O01ioO1o0i11 o01ioO1o0i11 = iiol1i01oo.I0000Il00O;
/* 24 */            O01ioO1o0i11 o01ioO1o0i112 = iiol1i01oo.I00000oOI;
/* 26 */            iOl1l0o0i1I0I00000oOI.I000l1(oilOloI, 0, o0o01001ooii, iiol0ol0oI);
/* 33 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || o01ioO1o0i112 != null) {
/* 41 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 1, O01l1I.I00000oIO, o01ioO1o0i112);
                    }
/* 48 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || o01ioO1o0i11 != null) {
/* 56 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 2, O01l1I.I00000oIO, o01ioO1o0i11);
                    }
/* 59 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

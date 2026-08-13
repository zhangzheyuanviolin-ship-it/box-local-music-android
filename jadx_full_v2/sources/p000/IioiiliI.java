            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class IioiiliI implements Io00l010I {
                public static final IioiiliI I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             IioiiliI iioiiliI = new IioiiliI();
/* 6 */             I00000oIO = iioiiliI;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.ElicitRequestParams", iioiiliI, 3);
/* 19 */            oO1Ol1i.I000OiO("message", false);
/* 24 */            oO1Ol1i.I000OiO("requestedSchema", false);
/* 30 */            oO1Ol1i.I000OiO("_meta", true);
/* 33 */            descriptor = oO1Ol1i;
                }

                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 8 */             return new O0O01001OOII[]{OlOlllO.I00000oIO, Iioil1oOO.I00000oIO, iOi1iol.I00000oIO(Oi0IOo.I00000oIO)};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 10 */            boolean z = true;
/* 11 */            int i = 0;
/* 12 */            IioioOiI iioioOiI = null;
/* 13 */            O01ioO1o0i11 o01ioO1o0i11 = null;
/* 14 */            String strI000l1 = null;
/* 15 */            while (z) {
/* 17 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
/* 22 */                if (iI000II == -1) {
/* 78 */                    z = false;
                        } else if (iI000II == 0) {
/* 71 */                    strI000l1 = iOl1ii1loOI00000oOI.I000l1(oilOloI, 0);
/* 75 */                    i |= 1;
                        } else if (iI000II == 1) {
/* 66 */                    iioioOiI = (IioioOiI) iOl1ii1loOI00000oOI.I00100o1O0lo(oilOloI, 1, Iioil1oOO.I00000oIO, iioioOiI);
/* 68 */                    i |= 2;
                        } else {
/* 29 */                    if (iI000II != 2) {
/* 56 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 9 */                         return null;
                            }
/* 45 */                    Oi0IiIoo oi0IiIoo = (Oi0IiIoo) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 2, Oi0IOo.I00000oIO, o01ioO1o0i11 != null ? Oi0IiIoo.I00000oIO(o01ioO1o0i11) : null);
/* 52 */                    o01ioO1o0i11 = oi0IiIoo != null ? oi0IiIoo.I00000oIO : null;
/* 53 */                    i |= 4;
                        }
                    }
/* 80 */            iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 88 */            if (3 != (i & 3)) {
/* 112 */               lI1IIO.I00000oIO(i, 3, descriptor);
/* 186 */               throw null;
                    }
/* 90 */            Iiol0IOiiO0O iiol0IOiiO0O = new Iiol0IOiiO0O();
/* 93 */            iiol0IOiiO0O.I00000oIO = strI000l1;
/* 95 */            iiol0IOiiO0O.I00000oOI = iioioOiI;
/* 99 */            if ((i & 4) == 0) {
/* 101 */               iiol0IOiiO0O.I0000Il00O = null;
                    } else {
/* 107 */               iiol0IOiiO0O.I0000Il00O = o01ioO1o0i11;
                    }
/* 103 */           VarHandle.storeStoreFence();
/* 106 */           return iiol0IOiiO0O;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             Iiol0IOiiO0O iiol0IOiiO0O = (Iiol0IOiiO0O) obj;
/* 3 */             OilOloI oilOloI = descriptor;
/* 5 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 9 */             String str = iiol0IOiiO0O.I00000oIO;
/* 11 */            O01ioO1o0i11 o01ioO1o0i11 = iiol0IOiiO0O.I0000Il00O;
/* 14 */            iOl1l0o0i1I0I00000oOI.I001IO000(oilOloI, 0, str);
/* 22 */            iOl1l0o0i1I0I00000oOI.I000l1(oilOloI, 1, Iioil1oOO.I00000oIO, iiol0IOiiO0O.I00000oOI);
/* 29 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || o01ioO1o0i11 != null) {
/* 45 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 2, Oi0IOo.I00000oIO, o01ioO1o0i11 != null ? Oi0IiIoo.I00000oIO(o01ioO1o0i11) : null);
                    }
/* 48 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

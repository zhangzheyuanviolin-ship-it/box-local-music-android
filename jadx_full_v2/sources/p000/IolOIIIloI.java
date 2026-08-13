            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class IolOIIIloI implements Io00l010I {
                public static final IolOIIIloI I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             IolOIIIloI iolOIIIloI = new IolOIIIloI();
/* 6 */             I00000oIO = iolOIIIloI;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.InitializeRequestParams", iolOIIIloI, 4);
/* 19 */            oO1Ol1i.I000OiO("protocolVersion", false);
/* 24 */            oO1Ol1i.I000OiO("capabilities", false);
/* 29 */            oO1Ol1i.I000OiO("clientInfo", false);
/* 35 */            oO1Ol1i.I000OiO("_meta", true);
/* 38 */            descriptor = oO1Ol1i;
                }

                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 8 */             return new O0O01001OOII[]{OlOlllO.I00000oIO, IOIo0i0ii.I00000oIO, IoioI1.I00000oIO, iOi1iol.I00000oIO(Oi0IOo.I00000oIO)};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 10 */            boolean z = true;
/* 11 */            int i = 0;
/* 12 */            IOIoIi11i0ll iOIoIi11i0ll = null;
/* 13 */            IoioIli11o ioioIli11o = null;
/* 14 */            O01ioO1o0i11 o01ioO1o0i11 = null;
/* 15 */            String strI000l1 = null;
/* 16 */            while (z) {
/* 18 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
/* 23 */                if (iI000II == -1) {
/* 93 */                    z = false;
                        } else if (iI000II == 0) {
/* 86 */                    strI000l1 = iOl1ii1loOI00000oOI.I000l1(oilOloI, 0);
/* 90 */                    i |= 1;
                        } else if (iI000II == 1) {
/* 81 */                    iOIoIi11i0ll = (IOIoIi11i0ll) iOl1ii1loOI00000oOI.I00100o1O0lo(oilOloI, 1, IOIo0i0ii.I00000oIO, iOIoIi11i0ll);
/* 83 */                    i |= 2;
                        } else if (iI000II == 2) {
/* 70 */                    ioioIli11o = (IoioIli11o) iOl1ii1loOI00000oOI.I00100o1O0lo(oilOloI, 2, IoioI1.I00000oIO, ioioIli11o);
/* 72 */                    i |= 4;
                        } else {
/* 33 */                    if (iI000II != 3) {
/* 60 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 9 */                         return null;
                            }
/* 49 */                    Oi0IiIoo oi0IiIoo = (Oi0IiIoo) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 3, Oi0IOo.I00000oIO, o01ioO1o0i11 != null ? Oi0IiIoo.I00000oIO(o01ioO1o0i11) : null);
/* 56 */                    o01ioO1o0i11 = oi0IiIoo != null ? oi0IiIoo.I00000oIO : null;
/* 57 */                    i |= 8;
                        }
                    }
/* 95 */            iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 103 */           if (7 != (i & 7)) {
/* 129 */               lI1IIO.I00000oIO(i, 7, descriptor);
/* 186 */               throw null;
                    }
/* 105 */           IolOlli iolOlli = new IolOlli();
/* 108 */           iolOlli.I00000oIO = strI000l1;
/* 110 */           iolOlli.I00000oOI = iOIoIi11i0ll;
/* 112 */           iolOlli.I0000Il00O = ioioIli11o;
/* 116 */           if ((i & 8) == 0) {
/* 118 */               iolOlli.I0000O = null;
                    } else {
/* 124 */               iolOlli.I0000O = o01ioO1o0i11;
                    }
/* 120 */           VarHandle.storeStoreFence();
/* 123 */           return iolOlli;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             IolOlli iolOlli = (IolOlli) obj;
/* 3 */             OilOloI oilOloI = descriptor;
/* 5 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 9 */             String str = iolOlli.I00000oIO;
/* 11 */            O01ioO1o0i11 o01ioO1o0i11 = iolOlli.I0000O;
/* 14 */            iOl1l0o0i1I0I00000oOI.I001IO000(oilOloI, 0, str);
/* 22 */            iOl1l0o0i1I0I00000oOI.I000l1(oilOloI, 1, IOIo0i0ii.I00000oIO, iolOlli.I00000oOI);
/* 30 */            iOl1l0o0i1I0I00000oOI.I000l1(oilOloI, 2, IoioI1.I00000oIO, iolOlli.I0000Il00O);
/* 37 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || o01ioO1o0i11 != null) {
/* 53 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 3, Oi0IOo.I00000oIO, o01ioO1o0i11 != null ? Oi0IiIoo.I00000oIO(o01ioO1o0i11) : null);
                    }
/* 56 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

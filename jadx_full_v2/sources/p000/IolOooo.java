            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class IolOooo implements Io00l010I {
                public static final IolOooo I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             IolOooo iolOooo = new IolOooo();
/* 6 */             I00000oIO = iolOooo;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.InitializeResult", iolOooo, 5);
/* 19 */            oO1Ol1i.I000OiO("protocolVersion", true);
/* 25 */            oO1Ol1i.I000OiO("capabilities", false);
/* 30 */            oO1Ol1i.I000OiO("serverInfo", false);
/* 35 */            oO1Ol1i.I000OiO("instructions", true);
/* 40 */            oO1Ol1i.I000OiO("_meta", true);
/* 43 */            descriptor = oO1Ol1i;
                }

                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 1 */             OlOlllO olOlllO = OlOlllO.I00000oIO;
/* 14 */            return new O0O01001OOII[]{olOlllO, OiliiOol0Io.I00000oIO, IoioI1.I00000oIO, iOi1iol.I00000oIO(olOlllO), iOi1iol.I00000oIO(O01l1I.I00000oIO)};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 10 */            boolean z = true;
/* 11 */            int i = 0;
/* 12 */            String strI000l1 = null;
/* 13 */            OillO0l oillO0l = null;
/* 14 */            IoioIli11o ioioIli11o = null;
/* 15 */            String str = null;
/* 16 */            O01ioO1o0i11 o01ioO1o0i11 = null;
/* 17 */            while (z) {
/* 19 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
/* 24 */                if (iI000II == -1) {
/* 94 */                    z = false;
                        } else if (iI000II == 0) {
/* 87 */                    strI000l1 = iOl1ii1loOI00000oOI.I000l1(oilOloI, 0);
/* 91 */                    i |= 1;
                        } else if (iI000II == 1) {
/* 82 */                    oillO0l = (OillO0l) iOl1ii1loOI00000oOI.I00100o1O0lo(oilOloI, 1, OiliiOol0Io.I00000oIO, oillO0l);
/* 84 */                    i |= 2;
                        } else if (iI000II == 2) {
/* 71 */                    ioioIli11o = (IoioIli11o) iOl1ii1loOI00000oOI.I00100o1O0lo(oilOloI, 2, IoioI1.I00000oIO, ioioIli11o);
/* 73 */                    i |= 4;
                        } else if (iI000II == 3) {
/* 60 */                    str = (String) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 3, OlOlllO.I00000oIO, str);
/* 62 */                    i |= 8;
                        } else {
/* 37 */                    if (iI000II != 4) {
/* 50 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 9 */                         return null;
                            }
/* 45 */                    o01ioO1o0i11 = (O01ioO1o0i11) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 4, O01l1I.I00000oIO, o01ioO1o0i11);
/* 47 */                    i |= 16;
                        }
                    }
/* 96 */            iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 104 */           if (6 != (i & 6)) {
/* 148 */               lI1IIO.I00000oIO(i, 6, descriptor);
/* 186 */               throw null;
                    }
/* 106 */           Ioli0o ioli0o = new Ioli0o();
/* 111 */           if ((i & 1) == 0) {
/* 115 */               ioli0o.I00000oIO = "2025-06-18";
                    } else {
/* 118 */               ioli0o.I00000oIO = strI000l1;
                    }
/* 120 */           ioli0o.I00000oOI = oillO0l;
/* 122 */           ioli0o.I0000Il00O = ioioIli11o;
/* 126 */           if ((i & 8) == 0) {
/* 128 */               ioli0o.I0000O = null;
                    } else {
/* 131 */               ioli0o.I0000O = str;
                    }
/* 135 */           if ((i & 16) == 0) {
/* 137 */               ioli0o.I0000oI00 = null;
                    } else {
/* 143 */               ioli0o.I0000oI00 = o01ioO1o0i11;
                    }
/* 139 */           VarHandle.storeStoreFence();
/* 142 */           return ioli0o;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             Ioli0o ioli0o = (Ioli0o) obj;
/* 3 */             String str = ioli0o.I00000oIO;
/* 5 */             OilOloI oilOloI = descriptor;
/* 7 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 15 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || !O0000Ioio00.I0000O(str, "2025-06-18")) {
/* 27 */                iOl1l0o0i1I0I00000oOI.I001IO000(oilOloI, 0, str);
                    }
/* 30 */            OiliiOol0Io oiliiOol0Io = OiliiOol0Io.I00000oIO;
/* 32 */            OillO0l oillO0l = ioli0o.I00000oOI;
/* 34 */            O01ioO1o0i11 o01ioO1o0i11 = ioli0o.I0000oI00;
/* 36 */            String str2 = ioli0o.I0000O;
/* 39 */            iOl1l0o0i1I0I00000oOI.I000l1(oilOloI, 1, oiliiOol0Io, oillO0l);
/* 47 */            iOl1l0o0i1I0I00000oOI.I000l1(oilOloI, 2, IoioI1.I00000oIO, ioli0o.I0000Il00O);
/* 54 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || str2 != null) {
/* 62 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 3, OlOlllO.I00000oIO, str2);
                    }
/* 69 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || o01ioO1o0i11 != null) {
/* 77 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 4, O01l1I.I00000oIO, o01ioO1o0i11);
                    }
/* 80 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

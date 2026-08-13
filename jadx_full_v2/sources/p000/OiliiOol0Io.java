            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OiliiOol0Io implements Io00l010I {
                public static final OiliiOol0Io I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             OiliiOol0Io oiliiOol0Io = new OiliiOol0Io();
/* 6 */             I00000oIO = oiliiOol0Io;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.ServerCapabilities", oiliiOol0Io, 6);
/* 19 */            oO1Ol1i.I000OiO("tools", true);
/* 24 */            oO1Ol1i.I000OiO("resources", true);
/* 29 */            oO1Ol1i.I000OiO("prompts", true);
/* 34 */            oO1Ol1i.I000OiO("logging", true);
/* 39 */            oO1Ol1i.I000OiO("completions", true);
/* 44 */            oO1Ol1i.I000OiO("experimental", true);
/* 47 */            descriptor = oO1Ol1i;
                }

                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 3 */             O0O01001OOII o0o01001ooiiI00000oIO = iOi1iol.I00000oIO(Oill1il1i1O.I00000oIO);
/* 9 */             O0O01001OOII o0o01001ooiiI00000oIO2 = iOi1iol.I00000oIO(OilioOII.I00000oIO);
/* 15 */            O0O01001OOII o0o01001ooiiI00000oIO3 = iOi1iol.I00000oIO(OililIo.I00000oIO);
/* 19 */            O01l1I o01l1I = O01l1I.I00000oIO;
/* 34 */            return new O0O01001OOII[]{o0o01001ooiiI00000oIO, o0o01001ooiiI00000oIO2, o0o01001ooiiI00000oIO3, iOi1iol.I00000oIO(o01l1I), iOi1iol.I00000oIO(o01l1I), iOi1iol.I00000oIO(o01l1I)};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 10 */            boolean z = true;
/* 11 */            int i = 0;
/* 12 */            OillIl0 oillIl0 = null;
/* 13 */            Oill0iOO0I oill0iOO0I = null;
/* 14 */            OililillIio oililillIio = null;
/* 15 */            O01ioO1o0i11 o01ioO1o0i11 = null;
/* 16 */            O01ioO1o0i11 o01ioO1o0i112 = null;
/* 17 */            O01ioO1o0i11 o01ioO1o0i113 = null;
/* 18 */            while (z) {
/* 20 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
                        switch (iI000II) {
                            case -1:
/* 101 */                       z = false;
                                break;
                            case 0:
/* 96 */                        oillIl0 = (OillIl0) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 0, Oill1il1i1O.I00000oIO, oillIl0);
/* 98 */                        i |= 1;
                                break;
                            case 1:
/* 85 */                        oill0iOO0I = (Oill0iOO0I) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 1, OilioOII.I00000oIO, oill0iOO0I);
/* 87 */                        i |= 2;
                                break;
                            case 2:
/* 74 */                        oililillIio = (OililillIio) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 2, OililIo.I00000oIO, oililillIio);
/* 76 */                        i |= 4;
                                break;
                            case 3:
/* 62 */                        o01ioO1o0i11 = (O01ioO1o0i11) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 3, O01l1I.I00000oIO, o01ioO1o0i11);
/* 64 */                        i |= 8;
                                break;
                            case 4:
/* 50 */                        o01ioO1o0i112 = (O01ioO1o0i11) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 4, O01l1I.I00000oIO, o01ioO1o0i112);
/* 52 */                        i |= 16;
                                break;
                            case 5:
/* 38 */                        o01ioO1o0i113 = (O01ioO1o0i11) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 5, O01l1I.I00000oIO, o01ioO1o0i113);
/* 40 */                        i |= 32;
                                break;
                            default:
/* 27 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 9 */                         return null;
                        }
                    }
/* 103 */           iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 108 */           OillO0l oillO0l = new OillO0l();
/* 113 */           if ((i & 1) == 0) {
/* 115 */               oillO0l.I00000oIO = null;
                    } else {
/* 118 */               oillO0l.I00000oIO = oillIl0;
                    }
/* 122 */           if ((i & 2) == 0) {
/* 124 */               oillO0l.I00000oOI = null;
                    } else {
/* 127 */               oillO0l.I00000oOI = oill0iOO0I;
                    }
/* 131 */           if ((i & 4) == 0) {
/* 133 */               oillO0l.I0000Il00O = null;
                    } else {
/* 136 */               oillO0l.I0000Il00O = oililillIio;
                    }
/* 140 */           if ((i & 8) == 0) {
/* 142 */               oillO0l.I0000O = null;
                    } else {
/* 145 */               oillO0l.I0000O = o01ioO1o0i11;
                    }
/* 149 */           if ((i & 16) == 0) {
/* 151 */               oillO0l.I0000oI00 = null;
                    } else {
/* 154 */               oillO0l.I0000oI00 = o01ioO1o0i112;
                    }
/* 158 */           if ((i & 32) == 0) {
/* 160 */               oillO0l.I0001Ioi1lo = null;
                    } else {
/* 166 */               oillO0l.I0001Ioi1lo = o01ioO1o0i113;
                    }
/* 162 */           VarHandle.storeStoreFence();
/* 165 */           return oillO0l;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             OillO0l oillO0l = (OillO0l) obj;
/* 3 */             O01ioO1o0i11 o01ioO1o0i11 = oillO0l.I0001Ioi1lo;
/* 5 */             O01ioO1o0i11 o01ioO1o0i112 = oillO0l.I0000oI00;
/* 7 */             O01ioO1o0i11 o01ioO1o0i113 = oillO0l.I0000O;
/* 9 */             OililillIio oililillIio = oillO0l.I0000Il00O;
/* 11 */            Oill0iOO0I oill0iOO0I = oillO0l.I00000oOI;
/* 13 */            OillIl0 oillIl0 = oillO0l.I00000oIO;
/* 15 */            OilOloI oilOloI = descriptor;
/* 17 */            IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 21 */            OililII1lO oililII1lO = OillO0l.Companion;
/* 27 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || oillIl0 != null) {
/* 35 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 0, Oill1il1i1O.I00000oIO, oillIl0);
                    }
/* 42 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || oill0iOO0I != null) {
/* 50 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 1, OilioOII.I00000oIO, oill0iOO0I);
                    }
/* 57 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || oililillIio != null) {
/* 65 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 2, OililIo.I00000oIO, oililillIio);
                    }
/* 72 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || o01ioO1o0i113 != null) {
/* 80 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 3, O01l1I.I00000oIO, o01ioO1o0i113);
                    }
/* 87 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || o01ioO1o0i112 != null) {
/* 95 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 4, O01l1I.I00000oIO, o01ioO1o0i112);
                    }
/* 102 */           if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || o01ioO1o0i11 != null) {
/* 110 */               iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 5, O01l1I.I00000oIO, o01ioO1o0i11);
                    }
/* 113 */           iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

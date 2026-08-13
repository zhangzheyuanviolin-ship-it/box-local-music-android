            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Ii0Io1iio01 implements Io00l010I {
                public static final Ii0Io1iio01 I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             Ii0Io1iio01 ii0Io1iio01 = new Ii0Io1iio01();
/* 6 */             I00000oIO = ii0Io1iio01;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.CreateMessageResult", ii0Io1iio01, 5);
/* 19 */            oO1Ol1i.I000OiO("role", false);
/* 24 */            oO1Ol1i.I000OiO("content", false);
/* 29 */            oO1Ol1i.I000OiO("model", false);
/* 35 */            oO1Ol1i.I000OiO("stopReason", true);
/* 40 */            oO1Ol1i.I000OiO("_meta", true);
/* 43 */            descriptor = oO1Ol1i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 4 */             return new O0O01001OOII[]{Ii0O0IoI100o.I0001Ioi1lo[0].getValue(), O1iOolOI1I.I0000Il00O, OlOlllO.I00000oIO, iOi1iol.I00000oIO(OlOI1iioO1I.I00000oIO), iOi1iol.I00000oIO(O01l1I.I00000oIO)};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
                    OlOII1OOo1O1 olOII1OOo1O1;
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 7 */             O0ioIllo0i1[] o0ioIllo0i1Arr = Ii0O0IoI100o.I0001Ioi1lo;
/* 12 */            boolean z = true;
/* 13 */            int i = 0;
/* 14 */            Oi1lo0illIO oi1lo0illIO = null;
/* 15 */            O1iOol1 o1iOol1 = null;
/* 16 */            String str = null;
/* 17 */            O01ioO1o0i11 o01ioO1o0i11 = null;
/* 18 */            String strI000l1 = null;
/* 19 */            while (z) {
/* 21 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
/* 26 */                if (iI000II == -1) {
/* 122 */                   z = false;
                        } else if (iI000II == 0) {
/* 117 */                   oi1lo0illIO = (Oi1lo0illIO) iOl1ii1loOI00000oOI.I00100o1O0lo(oilOloI, 0, (O0O01001OOII) o0ioIllo0i1Arr[0].getValue(), oi1lo0illIO);
/* 119 */                   i |= 1;
                        } else if (iI000II == 1) {
/* 100 */                   o1iOol1 = (O1iOol1) iOl1ii1loOI00000oOI.I00100o1O0lo(oilOloI, 1, O1iOolOI1I.I0000Il00O, o1iOol1);
/* 102 */                   i |= 2;
                        } else if (iI000II == 2) {
/* 87 */                    strI000l1 = iOl1ii1loOI00000oOI.I000l1(oilOloI, 2);
/* 91 */                    i |= 4;
                        } else if (iI000II == 3) {
/* 56 */                    OlOI1iioO1I olOI1iioO1I = OlOI1iioO1I.I00000oIO;
/* 58 */                    if (str != null) {
/* 62 */                        olOII1OOo1O1 = new OlOII1OOo1O1();
/* 65 */                        olOII1OOo1O1.I00000oIO = str;
/* 67 */                        VarHandle.storeStoreFence();
                            } else {
/* 71 */                        olOII1OOo1O1 = null;
                            }
/* 76 */                    OlOII1OOo1O1 olOII1OOo1O12 = (OlOII1OOo1O1) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 3, olOI1iioO1I, olOII1OOo1O1);
/* 83 */                    str = olOII1OOo1O12 != null ? olOII1OOo1O12.I00000oIO : null;
/* 84 */                    i |= 8;
                        } else {
/* 39 */                    if (iI000II != 4) {
/* 52 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 11 */                        return null;
                            }
/* 47 */                    o01ioO1o0i11 = (O01ioO1o0i11) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 4, O01l1I.I00000oIO, o01ioO1o0i11);
/* 49 */                    i |= 16;
                        }
                    }
/* 124 */           iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 132 */           if (7 != (i & 7)) {
/* 167 */               lI1IIO.I00000oIO(i, 7, descriptor);
/* 186 */               throw null;
                    }
/* 134 */           Ii0O0IoI100o ii0O0IoI100o = new Ii0O0IoI100o();
/* 137 */           ii0O0IoI100o.I00000oIO = oi1lo0illIO;
/* 139 */           ii0O0IoI100o.I00000oOI = o1iOol1;
/* 141 */           ii0O0IoI100o.I0000Il00O = strI000l1;
/* 145 */           if ((i & 8) == 0) {
/* 147 */               ii0O0IoI100o.I0000O = null;
                    } else {
/* 150 */               ii0O0IoI100o.I0000O = str;
                    }
/* 154 */           if ((i & 16) == 0) {
/* 156 */               ii0O0IoI100o.I0000oI00 = null;
                    } else {
/* 162 */               ii0O0IoI100o.I0000oI00 = o01ioO1o0i11;
                    }
/* 158 */           VarHandle.storeStoreFence();
/* 161 */           return ii0O0IoI100o;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
                    OlOII1OOo1O1 olOII1OOo1O1;
/* 1 */             Ii0O0IoI100o ii0O0IoI100o = (Ii0O0IoI100o) obj;
/* 3 */             OilOloI oilOloI = descriptor;
/* 5 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 18 */            O0O01001OOII o0o01001ooii = (O0O01001OOII) Ii0O0IoI100o.I0001Ioi1lo[0].getValue();
/* 20 */            Oi1lo0illIO oi1lo0illIO = ii0O0IoI100o.I00000oIO;
/* 22 */            O01ioO1o0i11 o01ioO1o0i11 = ii0O0IoI100o.I0000oI00;
/* 24 */            String str = ii0O0IoI100o.I0000O;
/* 26 */            iOl1l0o0i1I0I00000oOI.I000l1(oilOloI, 0, o0o01001ooii, oi1lo0illIO);
/* 34 */            iOl1l0o0i1I0I00000oOI.I000l1(oilOloI, 1, O1iOolOI1I.I0000Il00O, ii0O0IoI100o.I00000oOI);
/* 40 */            iOl1l0o0i1I0I00000oOI.I001IO000(oilOloI, 2, ii0O0IoI100o.I0000Il00O);
/* 47 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || str != null) {
/* 52 */                OlOI1iioO1I olOI1iioO1I = OlOI1iioO1I.I00000oIO;
/* 54 */                if (str != null) {
/* 58 */                    olOII1OOo1O1 = new OlOII1OOo1O1();
/* 61 */                    olOII1OOo1O1.I00000oIO = str;
/* 63 */                    VarHandle.storeStoreFence();
                        } else {
/* 67 */                    olOII1OOo1O1 = null;
                        }
/* 69 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 3, olOI1iioO1I, olOII1OOo1O1);
                    }
/* 76 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || o01ioO1o0i11 != null) {
/* 84 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 4, O01l1I.I00000oIO, o01ioO1o0i11);
                    }
/* 87 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

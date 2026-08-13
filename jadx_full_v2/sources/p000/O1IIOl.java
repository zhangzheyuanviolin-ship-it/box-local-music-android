            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class O1IIOl implements Io00l010I {
                public static final O1IIOl I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             O1IIOl o1IIOl = new O1IIOl();
/* 6 */             I00000oIO = o1IIOl;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.LoggingMessageNotificationParams", o1IIOl, 4);
/* 19 */            oO1Ol1i.I000OiO("level", false);
/* 24 */            oO1Ol1i.I000OiO("data", false);
/* 30 */            oO1Ol1i.I000OiO("logger", true);
/* 35 */            oO1Ol1i.I000OiO("_meta", true);
/* 38 */            descriptor = oO1Ol1i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 4 */             return new O0O01001OOII[]{O1IIiIi0OlIl.I0000oI00[0].getValue(), O01O1i1i.I00000oIO, iOi1iol.I00000oIO(OlOlllO.I00000oIO), iOi1iol.I00000oIO(O01l1I.I00000oIO)};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 7 */             O0ioIllo0i1[] o0ioIllo0i1Arr = O1IIiIi0OlIl.I0000oI00;
/* 12 */            boolean z = true;
/* 13 */            int i = 0;
/* 14 */            O1II0olio0l1 o1II0olio0l1 = null;
/* 15 */            O01O0o1iI o01O0o1iI = null;
/* 16 */            String str = null;
/* 17 */            O01ioO1o0i11 o01ioO1o0i11 = null;
/* 19 */            while (z) {
/* 21 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
/* 26 */                if (iI000II == -1) {
/* 91 */                    z = false;
                        } else if (iI000II == 0) {
/* 86 */                    o1II0olio0l1 = (O1II0olio0l1) iOl1ii1loOI00000oOI.I00100o1O0lo(oilOloI, 0, (O0O01001OOII) o0ioIllo0i1Arr[0].getValue(), o1II0olio0l1);
/* 88 */                    i |= 1;
                        } else if (iI000II == 1) {
/* 69 */                    o01O0o1iI = (O01O0o1iI) iOl1ii1loOI00000oOI.I00100o1O0lo(oilOloI, 1, O01O1i1i.I00000oIO, o01O0o1iI);
/* 71 */                    i |= 2;
                        } else if (iI000II == 2) {
/* 58 */                    str = (String) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 2, OlOlllO.I00000oIO, str);
/* 60 */                    i |= 4;
                        } else {
/* 35 */                    if (iI000II != 3) {
/* 48 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 11 */                        return null;
                            }
/* 43 */                    o01ioO1o0i11 = (O01ioO1o0i11) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 3, O01l1I.I00000oIO, o01ioO1o0i11);
/* 45 */                    i |= 8;
                        }
                    }
/* 93 */            iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 100 */           if (3 != (i & 3)) {
/* 133 */               lI1IIO.I00000oIO(i, 3, descriptor);
/* 186 */               throw null;
                    }
/* 102 */           O1IIiIi0OlIl o1IIiIi0OlIl = new O1IIiIi0OlIl();
/* 105 */           o1IIiIi0OlIl.I00000oIO = o1II0olio0l1;
/* 107 */           o1IIiIi0OlIl.I00000oOI = o01O0o1iI;
/* 111 */           if ((i & 4) == 0) {
/* 113 */               o1IIiIi0OlIl.I0000Il00O = null;
                    } else {
/* 116 */               o1IIiIi0OlIl.I0000Il00O = str;
                    }
/* 120 */           if ((i & 8) == 0) {
/* 122 */               o1IIiIi0OlIl.I0000O = null;
                    } else {
/* 128 */               o1IIiIi0OlIl.I0000O = o01ioO1o0i11;
                    }
/* 124 */           VarHandle.storeStoreFence();
/* 127 */           return o1IIiIi0OlIl;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             O1IIiIi0OlIl o1IIiIi0OlIl = (O1IIiIi0OlIl) obj;
/* 3 */             OilOloI oilOloI = descriptor;
/* 5 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 18 */            O0O01001OOII o0o01001ooii = (O0O01001OOII) O1IIiIi0OlIl.I0000oI00[0].getValue();
/* 20 */            O1II0olio0l1 o1II0olio0l1 = o1IIiIi0OlIl.I00000oIO;
/* 22 */            O01ioO1o0i11 o01ioO1o0i11 = o1IIiIi0OlIl.I0000O;
/* 24 */            String str = o1IIiIi0OlIl.I0000Il00O;
/* 26 */            iOl1l0o0i1I0I00000oOI.I000l1(oilOloI, 0, o0o01001ooii, o1II0olio0l1);
/* 34 */            iOl1l0o0i1I0I00000oOI.I000l1(oilOloI, 1, O01O1i1i.I00000oIO, o1IIiIi0OlIl.I00000oOI);
/* 41 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || str != null) {
/* 49 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 2, OlOlllO.I00000oIO, str);
                    }
/* 56 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || o01ioO1o0i11 != null) {
/* 64 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 3, O01l1I.I00000oIO, o01ioO1o0i11);
                    }
/* 67 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

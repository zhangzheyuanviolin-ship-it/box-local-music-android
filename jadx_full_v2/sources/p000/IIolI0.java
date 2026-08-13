            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class IIolI0 implements Io00l010I {
                public static final IIolI0 I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             IIolI0 iIolI0 = new IIolI0();
/* 6 */             I00000oIO = iIolI0;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.CancelledNotificationParams", iIolI0, 3);
/* 19 */            oO1Ol1i.I000OiO("requestId", false);
/* 25 */            oO1Ol1i.I000OiO("reason", true);
/* 30 */            oO1Ol1i.I000OiO("_meta", true);
/* 33 */            descriptor = oO1Ol1i;
                }

                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 14 */            return new O0O01001OOII[]{Oi0IOl.I0000Il00O, iOi1iol.I00000oIO(OlOlllO.I00000oIO), iOi1iol.I00000oIO(O01l1I.I00000oIO)};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 10 */            boolean z = true;
/* 11 */            int i = 0;
/* 12 */            Oi0IO1ii011 oi0IO1ii011 = null;
/* 13 */            String str = null;
/* 14 */            O01ioO1o0i11 o01ioO1o0i11 = null;
/* 15 */            while (z) {
/* 17 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
/* 22 */                if (iI000II == -1) {
/* 68 */                    z = false;
                        } else if (iI000II == 0) {
/* 63 */                    oi0IO1ii011 = (Oi0IO1ii011) iOl1ii1loOI00000oOI.I00100o1O0lo(oilOloI, 0, Oi0IOl.I0000Il00O, oi0IO1ii011);
/* 65 */                    i |= 1;
                        } else if (iI000II == 1) {
/* 52 */                    str = (String) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 1, OlOlllO.I00000oIO, str);
/* 54 */                    i |= 2;
                        } else {
/* 29 */                    if (iI000II != 2) {
/* 42 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 9 */                         return null;
                            }
/* 37 */                    o01ioO1o0i11 = (O01ioO1o0i11) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 2, O01l1I.I00000oIO, o01ioO1o0i11);
/* 39 */                    i |= 4;
                        }
                    }
/* 70 */            iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 77 */            if (1 != (i & 1)) {
/* 108 */               lI1IIO.I00000oIO(i, 1, descriptor);
/* 186 */               throw null;
                    }
/* 79 */            IIolIl iIolIl = new IIolIl();
/* 82 */            iIolIl.I00000oIO = oi0IO1ii011;
/* 86 */            if ((i & 2) == 0) {
/* 88 */                iIolIl.I00000oOI = null;
                    } else {
/* 91 */                iIolIl.I00000oOI = str;
                    }
/* 95 */            if ((i & 4) == 0) {
/* 97 */                iIolIl.I0000Il00O = null;
                    } else {
/* 103 */               iIolIl.I0000Il00O = o01ioO1o0i11;
                    }
/* 99 */            VarHandle.storeStoreFence();
/* 102 */           return iIolIl;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             IIolIl iIolIl = (IIolIl) obj;
/* 3 */             OilOloI oilOloI = descriptor;
/* 5 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 9 */             Oi0IOl oi0IOl = Oi0IOl.I0000Il00O;
/* 11 */            Oi0IO1ii011 oi0IO1ii011 = iIolIl.I00000oIO;
/* 13 */            O01ioO1o0i11 o01ioO1o0i11 = iIolIl.I0000Il00O;
/* 15 */            String str = iIolIl.I00000oOI;
/* 18 */            iOl1l0o0i1I0I00000oOI.I000l1(oilOloI, 0, oi0IOl, oi0IO1ii011);
/* 25 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || str != null) {
/* 33 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 1, OlOlllO.I00000oIO, str);
                    }
/* 40 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || o01ioO1o0i11 != null) {
/* 48 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 2, O01l1I.I00000oIO, o01ioO1o0i11);
                    }
/* 51 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

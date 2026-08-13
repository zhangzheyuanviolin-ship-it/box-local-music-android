            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public final class Io01l1oIl implements Io00l010I {
                public static final Io01l1oIl I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             Io01l1oIl io01l1oIl = new Io01l1oIl();
/* 6 */             I00000oIO = io01l1oIl;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.GetPromptResult", io01l1oIl, 3);
/* 19 */            oO1Ol1i.I000OiO("messages", false);
/* 25 */            oO1Ol1i.I000OiO("description", true);
/* 30 */            oO1Ol1i.I000OiO("_meta", true);
/* 33 */            descriptor = oO1Ol1i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 4 */             return new O0O01001OOII[]{Io01oo0oO01.I0000O[0].getValue(), iOi1iol.I00000oIO(OlOlllO.I00000oIO), iOi1iol.I00000oIO(O01l1I.I00000oIO)};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 7 */             O0ioIllo0i1[] o0ioIllo0i1Arr = Io01oo0oO01.I0000O;
/* 12 */            boolean z = true;
/* 13 */            int i = 0;
/* 14 */            List list = null;
/* 15 */            String str = null;
/* 16 */            O01ioO1o0i11 o01ioO1o0i11 = null;
/* 17 */            while (z) {
/* 19 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
/* 24 */                if (iI000II == -1) {
/* 76 */                    z = false;
                        } else if (iI000II == 0) {
/* 71 */                    list = (List) iOl1ii1loOI00000oOI.I00100o1O0lo(oilOloI, 0, (O0O01001OOII) o0ioIllo0i1Arr[0].getValue(), list);
/* 73 */                    i |= 1;
                        } else if (iI000II == 1) {
/* 54 */                    str = (String) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 1, OlOlllO.I00000oIO, str);
/* 56 */                    i |= 2;
                        } else {
/* 31 */                    if (iI000II != 2) {
/* 44 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 11 */                        return null;
                            }
/* 39 */                    o01ioO1o0i11 = (O01ioO1o0i11) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 2, O01l1I.I00000oIO, o01ioO1o0i11);
/* 41 */                    i |= 4;
                        }
                    }
/* 78 */            iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 85 */            if (1 != (i & 1)) {
/* 116 */               lI1IIO.I00000oIO(i, 1, descriptor);
/* 186 */               throw null;
                    }
/* 87 */            Io01oo0oO01 io01oo0oO01 = new Io01oo0oO01();
/* 90 */            io01oo0oO01.I00000oIO = list;
/* 94 */            if ((i & 2) == 0) {
/* 96 */                io01oo0oO01.I00000oOI = null;
                    } else {
/* 99 */                io01oo0oO01.I00000oOI = str;
                    }
/* 103 */           if ((i & 4) == 0) {
/* 105 */               io01oo0oO01.I0000Il00O = null;
                    } else {
/* 111 */               io01oo0oO01.I0000Il00O = o01ioO1o0i11;
                    }
/* 107 */           VarHandle.storeStoreFence();
/* 110 */           return io01oo0oO01;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             Io01oo0oO01 io01oo0oO01 = (Io01oo0oO01) obj;
/* 3 */             OilOloI oilOloI = descriptor;
/* 5 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 18 */            O0O01001OOII o0o01001ooii = (O0O01001OOII) Io01oo0oO01.I0000O[0].getValue();
/* 20 */            List list = io01oo0oO01.I00000oIO;
/* 22 */            O01ioO1o0i11 o01ioO1o0i11 = io01oo0oO01.I0000Il00O;
/* 24 */            String str = io01oo0oO01.I00000oOI;
/* 26 */            iOl1l0o0i1I0I00000oOI.I000l1(oilOloI, 0, o0o01001ooii, list);
/* 33 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || str != null) {
/* 41 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 1, OlOlllO.I00000oIO, str);
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

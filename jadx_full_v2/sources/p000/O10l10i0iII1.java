            package p000;

            import java.util.List;
            
            public final class O10l10i0iII1 implements Io00l010I {
                public static final O10l10i0iII1 I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             O10l10i0iII1 o10l10i0iII1 = new O10l10i0iII1();
/* 6 */             I00000oIO = o10l10i0iII1;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.ListRootsResult", o10l10i0iII1, 2);
/* 19 */            oO1Ol1i.I000OiO("roots", false);
/* 25 */            oO1Ol1i.I000OiO("_meta", true);
/* 28 */            descriptor = oO1Ol1i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 4 */             return new O0O01001OOII[]{O10l1101.I0000Il00O[0].getValue(), iOi1iol.I00000oIO(O01l1I.I00000oIO)};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 7 */             O0ioIllo0i1[] o0ioIllo0i1Arr = O10l1101.I0000Il00O;
/* 12 */            boolean z = true;
/* 13 */            int i = 0;
/* 14 */            List list = null;
/* 15 */            O01ioO1o0i11 o01ioO1o0i11 = null;
/* 16 */            while (z) {
/* 18 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
/* 23 */                if (iI000II == -1) {
/* 61 */                    z = false;
                        } else if (iI000II == 0) {
/* 56 */                    list = (List) iOl1ii1loOI00000oOI.I00100o1O0lo(oilOloI, 0, (O0O01001OOII) o0ioIllo0i1Arr[0].getValue(), list);
/* 58 */                    i |= 1;
                        } else {
/* 27 */                    if (iI000II != 1) {
/* 40 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 11 */                        return null;
                            }
/* 35 */                    o01ioO1o0i11 = (O01ioO1o0i11) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 1, O01l1I.I00000oIO, o01ioO1o0i11);
/* 37 */                    i |= 2;
                        }
                    }
/* 63 */            iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 70 */            if (1 != (i & 1)) {
/* 89 */                lI1IIO.I00000oIO(i, 1, descriptor);
/* 186 */               throw null;
                    }
/* 72 */            O10l1101 o10l1101 = new O10l1101();
/* 75 */            o10l1101.I00000oIO = list;
/* 79 */            if ((i & 2) == 0) {
/* 81 */                o10l1101.I00000oOI = null;
/* 83 */                return o10l1101;
                    }
/* 84 */            o10l1101.I00000oOI = o01ioO1o0i11;
/* 86 */            return o10l1101;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             O10l1101 o10l1101 = (O10l1101) obj;
/* 3 */             OilOloI oilOloI = descriptor;
/* 5 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 18 */            O0O01001OOII o0o01001ooii = (O0O01001OOII) O10l1101.I0000Il00O[0].getValue();
/* 20 */            List list = o10l1101.I00000oIO;
/* 22 */            O01ioO1o0i11 o01ioO1o0i11 = o10l1101.I00000oOI;
/* 24 */            iOl1l0o0i1I0I00000oOI.I000l1(oilOloI, 0, o0o01001ooii, list);
/* 31 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || o01ioO1o0i11 != null) {
/* 39 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 1, O01l1I.I00000oIO, o01ioO1o0i11);
                    }
/* 42 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

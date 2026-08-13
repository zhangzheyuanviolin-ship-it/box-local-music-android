            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public final class IOiI0i implements Io00l010I {
                public static final IOiI0i I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             IOiI0i iOiI0i = new IOiI0i();
/* 6 */             I00000oIO = iOiI0i;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.CompleteResult.Completion", iOiI0i, 3);
/* 19 */            oO1Ol1i.I000OiO("values", false);
/* 25 */            oO1Ol1i.I000OiO("total", true);
/* 30 */            oO1Ol1i.I000OiO("hasMore", true);
/* 33 */            descriptor = oO1Ol1i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 4 */             return new O0O01001OOII[]{IOiI1O.I0000O[0].getValue(), iOi1iol.I00000oIO(IooOIlOIIO.I00000oIO), iOi1iol.I00000oIO(II11OOi.I00000oIO)};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 7 */             O0ioIllo0i1[] o0ioIllo0i1Arr = IOiI1O.I0000O;
/* 12 */            boolean z = true;
/* 13 */            int i = 0;
/* 14 */            List list = null;
/* 15 */            Integer num = null;
/* 16 */            Boolean bool = null;
/* 17 */            while (z) {
/* 19 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
/* 24 */                if (iI000II == -1) {
/* 76 */                    z = false;
                        } else if (iI000II == 0) {
/* 71 */                    list = (List) iOl1ii1loOI00000oOI.I00100o1O0lo(oilOloI, 0, (O0O01001OOII) o0ioIllo0i1Arr[0].getValue(), list);
/* 73 */                    i |= 1;
                        } else if (iI000II == 1) {
/* 54 */                    num = (Integer) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 1, IooOIlOIIO.I00000oIO, num);
/* 56 */                    i |= 2;
                        } else {
/* 31 */                    if (iI000II != 2) {
/* 44 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 11 */                        return null;
                            }
/* 39 */                    bool = (Boolean) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 2, II11OOi.I00000oIO, bool);
/* 41 */                    i |= 4;
                        }
                    }
/* 78 */            iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 85 */            if (1 != (i & 1)) {
/* 138 */               lI1IIO.I00000oIO(i, 1, descriptor);
/* 186 */               throw null;
                    }
/* 87 */            IOiI1O iOiI1O = new IOiI1O();
/* 90 */            iOiI1O.I00000oIO = list;
/* 94 */            if ((i & 2) == 0) {
/* 96 */                iOiI1O.I00000oOI = null;
                    } else {
/* 99 */                iOiI1O.I00000oOI = num;
                    }
/* 103 */           if ((i & 4) == 0) {
/* 105 */               iOiI1O.I0000Il00O = null;
                    } else {
/* 108 */               iOiI1O.I0000Il00O = bool;
                    }
/* 116 */           if (list.size() <= 100) {
/* 118 */               VarHandle.storeStoreFence();
/* 121 */               return iOiI1O;
                    }
/* 132 */           I000II.I0010I0i(Oi010OO0.I000oI1ioi(list.size(), "Completion 'values' must not exceed 100 items, got "));
/* 11 */            return null;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             IOiI1O iOiI1O = (IOiI1O) obj;
/* 3 */             OilOloI oilOloI = descriptor;
/* 5 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 18 */            O0O01001OOII o0o01001ooii = (O0O01001OOII) IOiI1O.I0000O[0].getValue();
/* 20 */            List list = iOiI1O.I00000oIO;
/* 22 */            Boolean bool = iOiI1O.I0000Il00O;
/* 24 */            Integer num = iOiI1O.I00000oOI;
/* 26 */            iOl1l0o0i1I0I00000oOI.I000l1(oilOloI, 0, o0o01001ooii, list);
/* 33 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || num != null) {
/* 41 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 1, IooOIlOIIO.I00000oIO, num);
                    }
/* 48 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || bool != null) {
/* 56 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 2, II11OOi.I00000oIO, bool);
                    }
/* 59 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

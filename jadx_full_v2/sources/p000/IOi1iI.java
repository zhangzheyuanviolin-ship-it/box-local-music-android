            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class IOi1iI implements Io00l010I {
                public static final IOi1iI I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             IOi1iI iOi1iI = new IOi1iI();
/* 6 */             I00000oIO = iOi1iI;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.CompleteRequestParams.Argument", iOi1iI, 2);
/* 19 */            oO1Ol1i.I000OiO("name", false);
/* 24 */            oO1Ol1i.I000OiO("value", false);
/* 27 */            descriptor = oO1Ol1i;
                }

                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 4 */             OlOlllO olOlllO = OlOlllO.I00000oIO;
/* 2 */             return new O0O01001OOII[]{olOlllO, olOlllO};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 10 */            boolean z = true;
/* 11 */            int i = 0;
/* 12 */            String strI000l1 = null;
/* 13 */            String strI000l12 = null;
/* 14 */            while (z) {
/* 16 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
/* 21 */                if (iI000II == -1) {
/* 45 */                    z = false;
                        } else if (iI000II == 0) {
/* 38 */                    strI000l1 = iOl1ii1loOI00000oOI.I000l1(oilOloI, 0);
/* 42 */                    i |= 1;
                        } else {
/* 25 */                    if (iI000II != 1) {
/* 34 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 9 */                         return null;
                            }
/* 27 */                    strI000l12 = iOl1ii1loOI00000oOI.I000l1(oilOloI, 1);
/* 31 */                    i |= 2;
                        }
                    }
/* 47 */            iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 55 */            if (3 != (i & 3)) {
/* 70 */                lI1IIO.I00000oIO(i, 3, descriptor);
/* 186 */               throw null;
                    }
/* 57 */            IOi1liol0 iOi1liol0 = new IOi1liol0();
/* 60 */            iOi1liol0.I00000oIO = strI000l1;
/* 62 */            iOi1liol0.I00000oOI = strI000l12;
/* 64 */            VarHandle.storeStoreFence();
/* 67 */            return iOi1liol0;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             IOi1liol0 iOi1liol0 = (IOi1liol0) obj;
/* 3 */             OilOloI oilOloI = descriptor;
/* 5 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 12 */            iOl1l0o0i1I0I00000oOI.I001IO000(oilOloI, 0, iOi1liol0.I00000oIO);
/* 18 */            iOl1l0o0i1I0I00000oOI.I001IO000(oilOloI, 1, iOi1liol0.I00000oOI);
/* 21 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

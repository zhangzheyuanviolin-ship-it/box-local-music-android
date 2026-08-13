            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Map;
            
            public final class IOi1oI00 implements Io00l010I {
                public static final IOi1oI00 I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             IOi1oI00 iOi1oI00 = new IOi1oI00();
/* 6 */             I00000oIO = iOi1oI00;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.CompleteRequestParams.Context", iOi1oI00, 1);
/* 18 */            oO1Ol1i.I000OiO("arguments", true);
/* 21 */            descriptor = oO1Ol1i;
                }

                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 17 */            return new O0O01001OOII[]{iOi1iol.I00000oIO((O0O01001OOII) IOi1oO0o0.I00000oOI[0].getValue())};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 7 */             O0ioIllo0i1[] o0ioIllo0i1Arr = IOi1oO0o0.I00000oOI;
/* 12 */            boolean z = true;
/* 13 */            boolean z2 = false;
/* 14 */            Map map = null;
/* 15 */            while (z) {
/* 17 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
/* 22 */                if (iI000II == -1) {
/* 47 */                    z = false;
                        } else {
/* 24 */                    if (iI000II != 0) {
/* 43 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 11 */                        return null;
                            }
/* 39 */                    map = (Map) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 0, (O0O01001OOII) o0ioIllo0i1Arr[0].getValue(), map);
/* 41 */                    z2 = true;
                        }
                    }
/* 49 */            iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 54 */            IOi1oO0o0 iOi1oO0o0 = new IOi1oO0o0();
/* 57 */            if (z2) {
/* 65 */                iOi1oO0o0.I00000oIO = map;
                    } else {
/* 59 */                iOi1oO0o0.I00000oIO = null;
                    }
/* 61 */            VarHandle.storeStoreFence();
/* 64 */            return iOi1oO0o0;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 3 */             Map map = ((IOi1oO0o0) obj).I00000oIO;
/* 5 */             OilOloI oilOloI = descriptor;
/* 7 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 11 */            O0ioIllo0i1[] o0ioIllo0i1Arr = IOi1oO0o0.I00000oOI;
/* 17 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || map != null) {
/* 31 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 0, (O0O01001OOII) o0ioIllo0i1Arr[0].getValue(), map);
                    }
/* 34 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

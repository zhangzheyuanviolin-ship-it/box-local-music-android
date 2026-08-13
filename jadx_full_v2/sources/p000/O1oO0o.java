            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class O1oO0o implements Io00l010I {
                public static final O1oO0o I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             O1oO0o o1oO0o = new O1oO0o();
/* 6 */             I00000oIO = o1oO0o;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.ModelHint", o1oO0o, 1);
/* 19 */            oO1Ol1i.I000OiO("name", false);
/* 22 */            descriptor = oO1Ol1i;
                }

                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 8 */             return new O0O01001OOII[]{iOi1iol.I00000oIO(OlOlllO.I00000oIO)};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 10 */            boolean z = true;
/* 11 */            int i = 0;
/* 12 */            String str = null;
/* 13 */            while (z) {
/* 15 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
/* 20 */                if (iI000II == -1) {
/* 39 */                    z = false;
                        } else {
/* 22 */                    if (iI000II != 0) {
/* 35 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 9 */                         return null;
                            }
/* 31 */                    str = (String) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 0, OlOlllO.I00000oIO, str);
/* 33 */                    i = 1;
                        }
                    }
/* 41 */            iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 46 */            if (1 != i) {
/* 59 */                lI1IIO.I00000oIO(i, 1, descriptor);
/* 186 */               throw null;
                    }
/* 48 */            O1oO1loi o1oO1loi = new O1oO1loi();
/* 51 */            o1oO1loi.I00000oIO = str;
/* 53 */            VarHandle.storeStoreFence();
/* 56 */            return o1oO1loi;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 3 */             OilOloI oilOloI = descriptor;
/* 5 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 14 */            iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 0, OlOlllO.I00000oIO, ((O1oO1loi) obj).I00000oIO);
/* 17 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Ii0I01l1I1 implements Io00l010I {
                public static final Ii0I01l1I1 I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             Ii0I01l1I1 ii0I01l1I1 = new Ii0I01l1I1();
/* 6 */             I00000oIO = ii0I01l1I1;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.CreateMessageRequest", ii0I01l1I1, 2);
/* 19 */            oO1Ol1i.I000OiO("params", false);
/* 25 */            oO1Ol1i.I000OiO("method", true);
/* 28 */            descriptor = oO1Ol1i;
                }

                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 2 */             return new O0O01001OOII[]{Ii0I1loo0li1.I00000oIO, O1lll1OOooOI.I00000oIO};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 10 */            boolean z = true;
/* 11 */            int i = 0;
/* 12 */            Ii0Ilioo ii0Ilioo = null;
/* 13 */            O1llOlOo o1llOlOo = null;
/* 14 */            while (z) {
/* 16 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
/* 21 */                if (iI000II == -1) {
/* 53 */                    z = false;
                        } else if (iI000II == 0) {
/* 48 */                    ii0Ilioo = (Ii0Ilioo) iOl1ii1loOI00000oOI.I00100o1O0lo(oilOloI, 0, Ii0I1loo0li1.I00000oIO, ii0Ilioo);
/* 50 */                    i |= 1;
                        } else {
/* 25 */                    if (iI000II != 1) {
/* 38 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 9 */                         return null;
                            }
/* 33 */                    o1llOlOo = (O1llOlOo) iOl1ii1loOI00000oOI.I00100o1O0lo(oilOloI, 1, O1lll1OOooOI.I00000oIO, o1llOlOo);
/* 35 */                    i |= 2;
                        }
                    }
/* 55 */            iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 62 */            if (1 != (i & 1)) {
/* 86 */                lI1IIO.I00000oIO(i, 1, descriptor);
/* 186 */               throw null;
                    }
/* 64 */            Ii0I1l1iIi ii0I1l1iIi = new Ii0I1l1iIi();
/* 67 */            ii0I1l1iIi.I00000oIO = ii0Ilioo;
/* 71 */            if ((i & 2) == 0) {
/* 75 */                ii0I1l1iIi.I00000oOI = O1llOIO.I00olI;
                    } else {
/* 81 */                ii0I1l1iIi.I00000oOI = o1llOlOo;
                    }
/* 77 */            VarHandle.storeStoreFence();
/* 80 */            return ii0I1l1iIi;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             Ii0I1l1iIi ii0I1l1iIi = (Ii0I1l1iIi) obj;
/* 3 */             OilOloI oilOloI = descriptor;
/* 5 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 14 */            iOl1l0o0i1I0I00000oOI.I000l1(oilOloI, 0, Ii0I1loo0li1.I00000oIO, ii0I1l1iIi.I00000oIO);
/* 22 */            iOl1l0o0i1I0I00000oOI.I000l1(oilOloI, 1, O1lll1OOooOI.I00000oIO, ii0I1l1iIi.I00000oOI);
/* 25 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

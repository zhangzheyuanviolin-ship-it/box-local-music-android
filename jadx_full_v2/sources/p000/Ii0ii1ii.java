            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Ii0ii1ii implements Io00l010I {
                public static final Ii0ii1ii I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             Ii0ii1ii ii0ii1ii = new Ii0ii1ii();
/* 6 */             I00000oIO = ii0ii1ii;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.CustomNotification", ii0ii1ii, 2);
/* 19 */            oO1Ol1i.I000OiO("method", false);
/* 25 */            oO1Ol1i.I000OiO("params", true);
/* 28 */            descriptor = oO1Ol1i;
                }

                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 8 */             return new O0O01001OOII[]{O1lll1OOooOI.I00000oIO, iOi1iol.I00000oIO(I1oO11l10o.I00000oIO)};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 10 */            boolean z = true;
/* 11 */            int i = 0;
/* 12 */            O1llOlOo o1llOlOo = null;
/* 13 */            I1oO1o1111o i1oO1o1111o = null;
/* 14 */            while (z) {
/* 16 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
/* 21 */                if (iI000II == -1) {
/* 53 */                    z = false;
                        } else if (iI000II == 0) {
/* 48 */                    o1llOlOo = (O1llOlOo) iOl1ii1loOI00000oOI.I00100o1O0lo(oilOloI, 0, O1lll1OOooOI.I00000oIO, o1llOlOo);
/* 50 */                    i |= 1;
                        } else {
/* 25 */                    if (iI000II != 1) {
/* 38 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 9 */                         return null;
                            }
/* 33 */                    i1oO1o1111o = (I1oO1o1111o) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 1, I1oO11l10o.I00000oIO, i1oO1o1111o);
/* 35 */                    i |= 2;
                        }
                    }
/* 55 */            iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 62 */            if (1 != (i & 1)) {
/* 84 */                lI1IIO.I00000oIO(i, 1, descriptor);
/* 186 */               throw null;
                    }
/* 64 */            Ii0iiilio1 ii0iiilio1 = new Ii0iiilio1();
/* 67 */            ii0iiilio1.I00000oIO = o1llOlOo;
/* 71 */            if ((i & 2) == 0) {
/* 73 */                ii0iiilio1.I00000oOI = null;
                    } else {
/* 79 */                ii0iiilio1.I00000oOI = i1oO1o1111o;
                    }
/* 75 */            VarHandle.storeStoreFence();
/* 78 */            return ii0iiilio1;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             Ii0iiilio1 ii0iiilio1 = (Ii0iiilio1) obj;
/* 3 */             OilOloI oilOloI = descriptor;
/* 5 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 9 */             O1lll1OOooOI o1lll1OOooOI = O1lll1OOooOI.I00000oIO;
/* 11 */            O1llOlOo o1llOlOo = ii0iiilio1.I00000oIO;
/* 13 */            I1oO1o1111o i1oO1o1111o = ii0iiilio1.I00000oOI;
/* 16 */            iOl1l0o0i1I0I00000oOI.I000l1(oilOloI, 0, o1lll1OOooOI, o1llOlOo);
/* 23 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || i1oO1o1111o != null) {
/* 31 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 1, I1oO11l10o.I00000oIO, i1oO1o1111o);
                    }
/* 34 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

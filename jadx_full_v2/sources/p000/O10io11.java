            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class O10io11 implements Io00l010I {
                public static final O10io11 I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             O10io11 o10io11 = new O10io11();
/* 6 */             I00000oIO = o10io11;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.ListRootsRequest", o10io11, 2);
/* 19 */            oO1Ol1i.I000OiO("params", true);
/* 24 */            oO1Ol1i.I000OiO("method", true);
/* 27 */            descriptor = oO1Ol1i;
                }

                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 8 */             return new O0O01001OOII[]{iOi1iol.I00000oIO(I1oOOi1OI10o.I00000oIO), O1lll1OOooOI.I00000oIO};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 10 */            boolean z = true;
/* 11 */            int i = 0;
/* 12 */            I1oOoOi1O i1oOoOi1O = null;
/* 13 */            O1llOlOo o1llOlOo = null;
/* 14 */            while (z) {
/* 16 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
/* 21 */                if (iI000II == -1) {
/* 53 */                    z = false;
                        } else if (iI000II == 0) {
/* 48 */                    i1oOoOi1O = (I1oOoOi1O) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 0, I1oOOi1OI10o.I00000oIO, i1oOoOi1O);
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
/* 60 */            O10l00o1il o10l00o1il = new O10l00o1il();
/* 65 */            if ((i & 1) == 0) {
/* 67 */                o10l00o1il.I00000oIO = null;
                    } else {
/* 70 */                o10l00o1il.I00000oIO = i1oOoOi1O;
                    }
/* 74 */            if ((i & 2) == 0) {
/* 78 */                o10l00o1il.I00000oOI = O1llOIO.I00oliIiO01i;
                    } else {
/* 84 */                o10l00o1il.I00000oOI = o1llOlOo;
                    }
/* 80 */            VarHandle.storeStoreFence();
/* 83 */            return o10l00o1il;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             O10l00o1il o10l00o1il = (O10l00o1il) obj;
/* 3 */             I1oOoOi1O i1oOoOi1O = o10l00o1il.I00000oIO;
/* 5 */             OilOloI oilOloI = descriptor;
/* 7 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 15 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || i1oOoOi1O != null) {
/* 23 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 0, I1oOOi1OI10o.I00000oIO, i1oOoOi1O);
                    }
/* 31 */            iOl1l0o0i1I0I00000oOI.I000l1(oilOloI, 1, O1lll1OOooOI.I00000oIO, o10l00o1il.I00000oOI);
/* 34 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

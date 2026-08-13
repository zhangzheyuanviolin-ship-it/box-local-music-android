            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OilioOII implements Io00l010I {
                public static final OilioOII I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             OilioOII oilioOII = new OilioOII();
/* 6 */             I00000oIO = oilioOII;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.ServerCapabilities.Resources", oilioOII, 2);
/* 19 */            oO1Ol1i.I000OiO("listChanged", true);
/* 24 */            oO1Ol1i.I000OiO("subscribe", true);
/* 27 */            descriptor = oO1Ol1i;
                }

                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 1 */             II11OOi iI11OOi = II11OOi.I00000oIO;
/* 12 */            return new O0O01001OOII[]{iOi1iol.I00000oIO(iI11OOi), iOi1iol.I00000oIO(iI11OOi)};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 10 */            boolean z = true;
/* 11 */            int i = 0;
/* 12 */            Boolean bool = null;
/* 13 */            Boolean bool2 = null;
/* 14 */            while (z) {
/* 16 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
/* 21 */                if (iI000II == -1) {
/* 53 */                    z = false;
                        } else if (iI000II == 0) {
/* 48 */                    bool = (Boolean) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 0, II11OOi.I00000oIO, bool);
/* 50 */                    i |= 1;
                        } else {
/* 25 */                    if (iI000II != 1) {
/* 38 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 9 */                         return null;
                            }
/* 33 */                    bool2 = (Boolean) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 1, II11OOi.I00000oIO, bool2);
/* 35 */                    i |= 2;
                        }
                    }
/* 55 */            iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 60 */            Oill0iOO0I oill0iOO0I = new Oill0iOO0I();
/* 65 */            if ((i & 1) == 0) {
/* 67 */                oill0iOO0I.I00000oIO = null;
                    } else {
/* 70 */                oill0iOO0I.I00000oIO = bool;
                    }
/* 74 */            if ((i & 2) == 0) {
/* 76 */                oill0iOO0I.I00000oOI = null;
                    } else {
/* 82 */                oill0iOO0I.I00000oOI = bool2;
                    }
/* 78 */            VarHandle.storeStoreFence();
/* 81 */            return oill0iOO0I;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             Oill0iOO0I oill0iOO0I = (Oill0iOO0I) obj;
/* 3 */             Boolean bool = oill0iOO0I.I00000oOI;
/* 5 */             Boolean bool2 = oill0iOO0I.I00000oIO;
/* 7 */             OilOloI oilOloI = descriptor;
/* 9 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 17 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || bool2 != null) {
/* 25 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 0, II11OOi.I00000oIO, bool2);
                    }
/* 32 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || bool != null) {
/* 40 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 1, II11OOi.I00000oIO, bool);
                    }
/* 43 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

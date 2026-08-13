            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Oi1ooi implements Io00l010I {
                public static final Oi1ooi I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             Oi1ooi oi1ooi = new Oi1ooi();
/* 6 */             I00000oIO = oi1ooi;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.RootsListChangedNotification", oi1ooi, 2);
/* 19 */            oO1Ol1i.I000OiO("params", true);
/* 24 */            oO1Ol1i.I000OiO("method", true);
/* 27 */            descriptor = oO1Ol1i;
                }

                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 8 */             return new O0O01001OOII[]{iOi1iol.I00000oIO(I1oO11l10o.I00000oIO), O1lll1OOooOI.I00000oIO};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 10 */            boolean z = true;
/* 11 */            int i = 0;
/* 12 */            I1oO1o1111o i1oO1o1111o = null;
/* 13 */            O1llOlOo o1llOlOo = null;
/* 14 */            while (z) {
/* 16 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
/* 21 */                if (iI000II == -1) {
/* 53 */                    z = false;
                        } else if (iI000II == 0) {
/* 48 */                    i1oO1o1111o = (I1oO1o1111o) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 0, I1oO11l10o.I00000oIO, i1oO1o1111o);
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
/* 60 */            OiI00i oiI00i = new OiI00i();
/* 65 */            if ((i & 1) == 0) {
/* 67 */                oiI00i.I00000oIO = null;
                    } else {
/* 70 */                oiI00i.I00000oIO = i1oO1o1111o;
                    }
/* 74 */            if ((i & 2) == 0) {
/* 78 */                oiI00i.I00000oOI = O1llOIO.I00oII;
                    } else {
/* 84 */                oiI00i.I00000oOI = o1llOlOo;
                    }
/* 80 */            VarHandle.storeStoreFence();
/* 83 */            return oiI00i;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             OiI00i oiI00i = (OiI00i) obj;
/* 3 */             I1oO1o1111o i1oO1o1111o = oiI00i.I00000oIO;
/* 5 */             OilOloI oilOloI = descriptor;
/* 7 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 15 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || i1oO1o1111o != null) {
/* 23 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 0, I1oO11l10o.I00000oIO, i1oO1o1111o);
                    }
/* 31 */            iOl1l0o0i1I0I00000oOI.I000l1(oilOloI, 1, O1lll1OOooOI.I00000oIO, oiI00i.I00000oOI);
/* 34 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

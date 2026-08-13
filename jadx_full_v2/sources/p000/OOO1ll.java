            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OOO1ll implements Io00l010I {
                public static final OOO1ll I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             OOO1ll oOO1ll = new OOO1ll();
/* 6 */             I00000oIO = oOO1ll;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.PromptMessage", oOO1ll, 2);
/* 19 */            oO1Ol1i.I000OiO("role", false);
/* 24 */            oO1Ol1i.I000OiO("content", false);
/* 27 */            descriptor = oO1Ol1i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 4 */             return new O0O01001OOII[]{OOO1oIloo01.I0000Il00O[0].getValue(), IOoIIoIooo01.I0000Il00O};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 7 */             O0ioIllo0i1[] o0ioIllo0i1Arr = OOO1oIloo01.I0000Il00O;
/* 12 */            boolean z = true;
/* 13 */            int i = 0;
/* 14 */            Oi1lo0illIO oi1lo0illIO = null;
/* 15 */            IOoI1l1oi0 iOoI1l1oi0 = null;
/* 16 */            while (z) {
/* 18 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
/* 23 */                if (iI000II == -1) {
/* 61 */                    z = false;
                        } else if (iI000II == 0) {
/* 56 */                    oi1lo0illIO = (Oi1lo0illIO) iOl1ii1loOI00000oOI.I00100o1O0lo(oilOloI, 0, (O0O01001OOII) o0ioIllo0i1Arr[0].getValue(), oi1lo0illIO);
/* 58 */                    i |= 1;
                        } else {
/* 27 */                    if (iI000II != 1) {
/* 40 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 11 */                        return null;
                            }
/* 35 */                    iOoI1l1oi0 = (IOoI1l1oi0) iOl1ii1loOI00000oOI.I00100o1O0lo(oilOloI, 1, IOoIIoIooo01.I0000Il00O, iOoI1l1oi0);
/* 37 */                    i |= 2;
                        }
                    }
/* 63 */            iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 71 */            if (3 != (i & 3)) {
/* 86 */                lI1IIO.I00000oIO(i, 3, descriptor);
/* 186 */               throw null;
                    }
/* 73 */            OOO1oIloo01 oOO1oIloo01 = new OOO1oIloo01();
/* 76 */            oOO1oIloo01.I00000oIO = oi1lo0illIO;
/* 78 */            oOO1oIloo01.I00000oOI = iOoI1l1oi0;
/* 80 */            VarHandle.storeStoreFence();
/* 83 */            return oOO1oIloo01;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             OOO1oIloo01 oOO1oIloo01 = (OOO1oIloo01) obj;
/* 3 */             OilOloI oilOloI = descriptor;
/* 5 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 22 */            iOl1l0o0i1I0I00000oOI.I000l1(oilOloI, 0, (O0O01001OOII) OOO1oIloo01.I0000Il00O[0].getValue(), oOO1oIloo01.I00000oIO);
/* 30 */            iOl1l0o0i1I0I00000oOI.I000l1(oilOloI, 1, IOoIIoIooo01.I0000Il00O, oOO1oIloo01.I00000oOI);
/* 33 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

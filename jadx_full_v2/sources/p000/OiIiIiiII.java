            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OiIiIiiII implements Io00l010I {
                public static final OiIiIiiII I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             OiIiIiiII oiIiIiiII = new OiIiIiiII();
/* 6 */             I00000oIO = oiIiIiiII;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.SamplingMessage", oiIiIiiII, 2);
/* 19 */            oO1Ol1i.I000OiO("role", false);
/* 24 */            oO1Ol1i.I000OiO("content", false);
/* 27 */            descriptor = oO1Ol1i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 4 */             return new O0O01001OOII[]{OiIiIl0o101.I0000Il00O[0].getValue(), O1iOolOI1I.I0000Il00O};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 7 */             O0ioIllo0i1[] o0ioIllo0i1Arr = OiIiIl0o101.I0000Il00O;
/* 12 */            boolean z = true;
/* 13 */            int i = 0;
/* 14 */            Oi1lo0illIO oi1lo0illIO = null;
/* 15 */            O1iOol1 o1iOol1 = null;
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
/* 35 */                    o1iOol1 = (O1iOol1) iOl1ii1loOI00000oOI.I00100o1O0lo(oilOloI, 1, O1iOolOI1I.I0000Il00O, o1iOol1);
/* 37 */                    i |= 2;
                        }
                    }
/* 63 */            iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 71 */            if (3 != (i & 3)) {
/* 86 */                lI1IIO.I00000oIO(i, 3, descriptor);
/* 186 */               throw null;
                    }
/* 73 */            OiIiIl0o101 oiIiIl0o101 = new OiIiIl0o101();
/* 76 */            oiIiIl0o101.I00000oIO = oi1lo0illIO;
/* 78 */            oiIiIl0o101.I00000oOI = o1iOol1;
/* 80 */            VarHandle.storeStoreFence();
/* 83 */            return oiIiIl0o101;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             OiIiIl0o101 oiIiIl0o101 = (OiIiIl0o101) obj;
/* 3 */             OilOloI oilOloI = descriptor;
/* 5 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 22 */            iOl1l0o0i1I0I00000oOI.I000l1(oilOloI, 0, (O0O01001OOII) OiIiIl0o101.I0000Il00O[0].getValue(), oiIiIl0o101.I00000oIO);
/* 30 */            iOl1l0o0i1I0I00000oOI.I000l1(oilOloI, 1, O1iOolOI1I.I0000Il00O, oiIiIl0o101.I00000oOI);
/* 33 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

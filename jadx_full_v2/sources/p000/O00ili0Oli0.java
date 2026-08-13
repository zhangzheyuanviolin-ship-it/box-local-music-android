            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class O00ili0Oli0 implements Io00l010I {
                public static final O00ili0Oli0 I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             O00ili0Oli0 o00ili0Oli0 = new O00ili0Oli0();
/* 6 */             I00000oIO = o00ili0Oli0;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.JSONRPCResponse", o00ili0Oli0, 3);
/* 19 */            oO1Ol1i.I000OiO("id", false);
/* 25 */            oO1Ol1i.I000OiO("result", true);
/* 30 */            oO1Ol1i.I000OiO("jsonrpc", true);
/* 33 */            descriptor = oO1Ol1i;
                }

                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 2 */             return new O0O01001OOII[]{Oi0IOl.I0000Il00O, Oi0OO0ollO.I0000Il00O, OlOlllO.I00000oIO};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 10 */            boolean z = true;
/* 11 */            int i = 0;
/* 12 */            Oi0IO1ii011 oi0IO1ii011 = null;
/* 13 */            Oi0OO01oi oi0OO01oi = null;
/* 14 */            String strI000l1 = null;
/* 15 */            while (z) {
/* 17 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
/* 22 */                if (iI000II == -1) {
/* 64 */                    z = false;
                        } else if (iI000II == 0) {
/* 59 */                    oi0IO1ii011 = (Oi0IO1ii011) iOl1ii1loOI00000oOI.I00100o1O0lo(oilOloI, 0, Oi0IOl.I0000Il00O, oi0IO1ii011);
/* 61 */                    i |= 1;
                        } else if (iI000II == 1) {
/* 48 */                    oi0OO01oi = (Oi0OO01oi) iOl1ii1loOI00000oOI.I00100o1O0lo(oilOloI, 1, Oi0OO0ollO.I0000Il00O, oi0OO01oi);
/* 50 */                    i |= 2;
                        } else {
/* 29 */                    if (iI000II != 2) {
/* 38 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 9 */                         return null;
                            }
/* 31 */                    strI000l1 = iOl1ii1loOI00000oOI.I000l1(oilOloI, 2);
/* 35 */                    i |= 4;
                        }
                    }
/* 66 */            iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 73 */            if (1 != (i & 1)) {
/* 111 */               lI1IIO.I00000oIO(i, 1, descriptor);
/* 186 */               throw null;
                    }
/* 75 */            O00illI0o000 o00illI0o000 = new O00illI0o000();
/* 78 */            o00illI0o000.I00000oIO = oi0IO1ii011;
/* 82 */            if ((i & 2) == 0) {
/* 89 */                o00illI0o000.I00000oOI = new Il01l1iIl();
                    } else {
/* 92 */                o00illI0o000.I00000oOI = oi0OO01oi;
                    }
/* 96 */            if ((i & 4) == 0) {
/* 100 */               o00illI0o000.I0000Il00O = "2.0";
                    } else {
/* 106 */               o00illI0o000.I0000Il00O = strI000l1;
                    }
/* 102 */           VarHandle.storeStoreFence();
/* 105 */           return o00illI0o000;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             O00illI0o000 o00illI0o000 = (O00illI0o000) obj;
/* 3 */             OilOloI oilOloI = descriptor;
/* 5 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 9 */             Oi0IOl oi0IOl = Oi0IOl.I0000Il00O;
/* 11 */            Oi0IO1ii011 oi0IO1ii011 = o00illI0o000.I00000oIO;
/* 13 */            Oi0OO01oi oi0OO01oi = o00illI0o000.I00000oOI;
/* 16 */            iOl1l0o0i1I0I00000oOI.I000l1(oilOloI, 0, oi0IOl, oi0IO1ii011);
/* 23 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || !O0000Ioio00.I0000O(oi0OO01oi, new Il01l1iIl())) {
/* 40 */                iOl1l0o0i1I0I00000oOI.I000l1(oilOloI, 1, Oi0OO0ollO.I0000Il00O, oi0OO01oi);
                    }
/* 46 */            iOl1l0o0i1I0I00000oOI.I001IO000(oilOloI, 2, o00illI0o000.I0000Il00O);
/* 49 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

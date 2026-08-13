            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OOO1oOoo0OO implements Io00l010I {
                public static final OOO1oOoo0OO I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             OOO1oOoo0OO oOO1oOoo0OO = new OOO1oOoo0OO();
/* 6 */             I00000oIO = oOO1oOoo0OO;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.PromptReference", oOO1oOoo0OO, 3);
/* 19 */            oO1Ol1i.I000OiO("name", false);
/* 25 */            oO1Ol1i.I000OiO("title", true);
/* 30 */            oO1Ol1i.I000OiO("type", true);
/* 33 */            descriptor = oO1Ol1i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 1 */             O0ioIllo0i1[] o0ioIllo0i1Arr = OOOI0l.I0000O;
/* 6 */             OlOlllO olOlllO = OlOlllO.I00000oIO;
/* 4 */             return new O0O01001OOII[]{olOlllO, iOi1iol.I00000oIO(olOlllO), o0ioIllo0i1Arr[2].getValue()};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 7 */             O0ioIllo0i1[] o0ioIllo0i1Arr = OOOI0l.I0000O;
/* 12 */            boolean z = true;
/* 13 */            int i = 0;
/* 14 */            String strI000l1 = null;
/* 15 */            String str = null;
/* 16 */            OOo1IiIOoo1 oOo1IiIOoo1 = null;
/* 17 */            while (z) {
/* 19 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
/* 24 */                if (iI000II == -1) {
/* 72 */                    z = false;
                        } else if (iI000II == 0) {
/* 65 */                    strI000l1 = iOl1ii1loOI00000oOI.I000l1(oilOloI, 0);
/* 69 */                    i |= 1;
                        } else if (iI000II == 1) {
/* 60 */                    str = (String) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 1, OlOlllO.I00000oIO, str);
/* 62 */                    i |= 2;
                        } else {
/* 31 */                    if (iI000II != 2) {
/* 50 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 11 */                        return null;
                            }
/* 45 */                    oOo1IiIOoo1 = (OOo1IiIOoo1) iOl1ii1loOI00000oOI.I00100o1O0lo(oilOloI, 2, (O0O01001OOII) o0ioIllo0i1Arr[2].getValue(), oOo1IiIOoo1);
/* 47 */                    i |= 4;
                        }
                    }
/* 74 */            iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 81 */            if (1 != (i & 1)) {
/* 114 */               lI1IIO.I00000oIO(i, 1, descriptor);
/* 186 */               throw null;
                    }
/* 83 */            OOOI0l oOOI0l = new OOOI0l();
/* 86 */            oOOI0l.I00000oIO = strI000l1;
/* 90 */            if ((i & 2) == 0) {
/* 92 */                oOOI0l.I00000oOI = null;
                    } else {
/* 95 */                oOOI0l.I00000oOI = str;
                    }
/* 99 */            if ((i & 4) == 0) {
/* 103 */               oOOI0l.I0000Il00O = OOo1IiIOoo1.I00iiI;
                    } else {
/* 109 */               oOOI0l.I0000Il00O = oOo1IiIOoo1;
                    }
/* 105 */           VarHandle.storeStoreFence();
/* 108 */           return oOOI0l;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             OOOI0l oOOI0l = (OOOI0l) obj;
/* 3 */             OilOloI oilOloI = descriptor;
/* 5 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 9 */             O0ioIllo0i1[] o0ioIllo0i1Arr = OOOI0l.I0000O;
/* 11 */            String str = oOOI0l.I00000oIO;
/* 13 */            String str2 = oOOI0l.I00000oOI;
/* 16 */            iOl1l0o0i1I0I00000oOI.I001IO000(oilOloI, 0, str);
/* 23 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || str2 != null) {
/* 31 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 1, OlOlllO.I00000oIO, str2);
                    }
/* 45 */            iOl1l0o0i1I0I00000oOI.I000l1(oilOloI, 2, (O0O01001OOII) o0ioIllo0i1Arr[2].getValue(), oOOI0l.I0000Il00O);
/* 48 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Oi0o0iOl00i implements Io00l010I {
                public static final Oi0o0iOl00i I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             Oi0o0iOl00i oi0o0iOl00i = new Oi0o0iOl00i();
/* 6 */             I00000oIO = oi0o0iOl00i;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.ResourceTemplateReference", oi0o0iOl00i, 2);
/* 19 */            oO1Ol1i.I000OiO("uri", false);
/* 25 */            oO1Ol1i.I000OiO("type", true);
/* 28 */            descriptor = oO1Ol1i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 4 */             return new O0O01001OOII[]{OlOlllO.I00000oIO, Oi0o1OOlIO.I0000Il00O[1].getValue()};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 7 */             O0ioIllo0i1[] o0ioIllo0i1Arr = Oi0o1OOlIO.I0000Il00O;
/* 12 */            boolean z = true;
/* 13 */            int i = 0;
/* 14 */            String strI000l1 = null;
/* 15 */            OOo1IiIOoo1 oOo1IiIOoo1 = null;
/* 16 */            while (z) {
/* 18 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
/* 23 */                if (iI000II == -1) {
/* 57 */                    z = false;
                        } else if (iI000II == 0) {
/* 50 */                    strI000l1 = iOl1ii1loOI00000oOI.I000l1(oilOloI, 0);
/* 54 */                    i |= 1;
                        } else {
/* 27 */                    if (iI000II != 1) {
/* 46 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 11 */                        return null;
                            }
/* 41 */                    oOo1IiIOoo1 = (OOo1IiIOoo1) iOl1ii1loOI00000oOI.I00100o1O0lo(oilOloI, 1, (O0O01001OOII) o0ioIllo0i1Arr[1].getValue(), oOo1IiIOoo1);
/* 43 */                    i |= 2;
                        }
                    }
/* 59 */            iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 66 */            if (1 != (i & 1)) {
/* 90 */                lI1IIO.I00000oIO(i, 1, descriptor);
/* 186 */               throw null;
                    }
/* 68 */            Oi0o1OOlIO oi0o1OOlIO = new Oi0o1OOlIO();
/* 71 */            oi0o1OOlIO.I00000oIO = strI000l1;
/* 75 */            if ((i & 2) == 0) {
/* 79 */                oi0o1OOlIO.I00000oOI = OOo1IiIOoo1.I00iiO;
                    } else {
/* 85 */                oi0o1OOlIO.I00000oOI = oOo1IiIOoo1;
                    }
/* 81 */            VarHandle.storeStoreFence();
/* 84 */            return oi0o1OOlIO;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             Oi0o1OOlIO oi0o1OOlIO = (Oi0o1OOlIO) obj;
/* 3 */             OilOloI oilOloI = descriptor;
/* 5 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 9 */             O0ioIllo0i1[] o0ioIllo0i1Arr = Oi0o1OOlIO.I0000Il00O;
/* 14 */            iOl1l0o0i1I0I00000oOI.I001IO000(oilOloI, 0, oi0o1OOlIO.I00000oIO);
/* 28 */            iOl1l0o0i1I0I00000oOI.I000l1(oilOloI, 1, (O0O01001OOII) o0ioIllo0i1Arr[1].getValue(), oi0o1OOlIO.I00000oOI);
/* 31 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

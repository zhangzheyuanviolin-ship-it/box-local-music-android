            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Oio00oo implements Io00l010I {
                public static final Oio00oo I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             Oio00oo oio00oo = new Oio00oo();
/* 6 */             I00000oIO = oio00oo;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.SetLevelRequestParams", oio00oo, 2);
/* 19 */            oO1Ol1i.I000OiO("level", false);
/* 25 */            oO1Ol1i.I000OiO("_meta", true);
/* 28 */            descriptor = oO1Ol1i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 4 */             return new O0O01001OOII[]{Oio0OO1i.I0000Il00O[0].getValue(), iOi1iol.I00000oIO(Oi0IOo.I00000oIO)};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 7 */             O0ioIllo0i1[] o0ioIllo0i1Arr = Oio0OO1i.I0000Il00O;
/* 12 */            boolean z = true;
/* 13 */            int i = 0;
/* 14 */            O1II0olio0l1 o1II0olio0l1 = null;
/* 15 */            O01ioO1o0i11 o01ioO1o0i11 = null;
/* 16 */            while (z) {
/* 18 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
/* 23 */                if (iI000II == -1) {
/* 75 */                    z = false;
                        } else if (iI000II == 0) {
/* 70 */                    o1II0olio0l1 = (O1II0olio0l1) iOl1ii1loOI00000oOI.I00100o1O0lo(oilOloI, 0, (O0O01001OOII) o0ioIllo0i1Arr[0].getValue(), o1II0olio0l1);
/* 72 */                    i |= 1;
                        } else {
/* 27 */                    if (iI000II != 1) {
/* 54 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 11 */                        return null;
                            }
/* 43 */                    Oi0IiIoo oi0IiIoo = (Oi0IiIoo) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 1, Oi0IOo.I00000oIO, o01ioO1o0i11 != null ? Oi0IiIoo.I00000oIO(o01ioO1o0i11) : null);
/* 50 */                    o01ioO1o0i11 = oi0IiIoo != null ? oi0IiIoo.I00000oIO : null;
/* 51 */                    i |= 2;
                        }
                    }
/* 77 */            iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 84 */            if (1 != (i & 1)) {
/* 106 */               lI1IIO.I00000oIO(i, 1, descriptor);
/* 186 */               throw null;
                    }
/* 86 */            Oio0OO1i oio0OO1i = new Oio0OO1i();
/* 89 */            oio0OO1i.I00000oIO = o1II0olio0l1;
/* 93 */            if ((i & 2) == 0) {
/* 95 */                oio0OO1i.I00000oOI = null;
                    } else {
/* 101 */               oio0OO1i.I00000oOI = o01ioO1o0i11;
                    }
/* 97 */            VarHandle.storeStoreFence();
/* 100 */           return oio0OO1i;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             Oio0OO1i oio0OO1i = (Oio0OO1i) obj;
/* 3 */             OilOloI oilOloI = descriptor;
/* 5 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 18 */            O0O01001OOII o0o01001ooii = (O0O01001OOII) Oio0OO1i.I0000Il00O[0].getValue();
/* 20 */            O1II0olio0l1 o1II0olio0l1 = oio0OO1i.I00000oIO;
/* 22 */            O01ioO1o0i11 o01ioO1o0i11 = oio0OO1i.I00000oOI;
/* 24 */            iOl1l0o0i1I0I00000oOI.I000l1(oilOloI, 0, o0o01001ooii, o1II0olio0l1);
/* 31 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || o01ioO1o0i11 != null) {
/* 47 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 1, Oi0IOo.I00000oIO, o01ioO1o0i11 != null ? Oi0IiIoo.I00000oIO(o01ioO1o0i11) : null);
                    }
/* 50 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

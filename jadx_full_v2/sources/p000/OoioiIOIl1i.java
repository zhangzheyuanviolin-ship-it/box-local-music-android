            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OoioiIOIl1i implements Io00l010I {
                public static final OoioiIOIl1i I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             OoioiIOIl1i ooioiIOIl1i = new OoioiIOIl1i();
/* 6 */             I00000oIO = ooioiIOIl1i;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.UnsubscribeRequestParams", ooioiIOIl1i, 2);
/* 19 */            oO1Ol1i.I000OiO("uri", false);
/* 25 */            oO1Ol1i.I000OiO("_meta", true);
/* 28 */            descriptor = oO1Ol1i;
                }

                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 8 */             return new O0O01001OOII[]{OlOlllO.I00000oIO, iOi1iol.I00000oIO(Oi0IOo.I00000oIO)};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 10 */            boolean z = true;
/* 11 */            int i = 0;
/* 12 */            O01ioO1o0i11 o01ioO1o0i11 = null;
/* 13 */            String strI000l1 = null;
/* 14 */            while (z) {
/* 16 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
/* 21 */                if (iI000II == -1) {
/* 63 */                    z = false;
                        } else if (iI000II == 0) {
/* 56 */                    strI000l1 = iOl1ii1loOI00000oOI.I000l1(oilOloI, 0);
/* 60 */                    i |= 1;
                        } else {
/* 25 */                    if (iI000II != 1) {
/* 52 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 9 */                         return null;
                            }
/* 41 */                    Oi0IiIoo oi0IiIoo = (Oi0IiIoo) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 1, Oi0IOo.I00000oIO, o01ioO1o0i11 != null ? Oi0IiIoo.I00000oIO(o01ioO1o0i11) : null);
/* 48 */                    o01ioO1o0i11 = oi0IiIoo != null ? oi0IiIoo.I00000oIO : null;
/* 49 */                    i |= 2;
                        }
                    }
/* 65 */            iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 72 */            if (1 != (i & 1)) {
/* 94 */                lI1IIO.I00000oIO(i, 1, descriptor);
/* 186 */               throw null;
                    }
/* 74 */            Ooiol00oIl0 ooiol00oIl0 = new Ooiol00oIl0();
/* 77 */            ooiol00oIl0.I00000oIO = strI000l1;
/* 81 */            if ((i & 2) == 0) {
/* 83 */                ooiol00oIl0.I00000oOI = null;
                    } else {
/* 89 */                ooiol00oIl0.I00000oOI = o01ioO1o0i11;
                    }
/* 85 */            VarHandle.storeStoreFence();
/* 88 */            return ooiol00oIl0;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             Ooiol00oIl0 ooiol00oIl0 = (Ooiol00oIl0) obj;
/* 3 */             OilOloI oilOloI = descriptor;
/* 5 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 9 */             String str = ooiol00oIl0.I00000oIO;
/* 11 */            O01ioO1o0i11 o01ioO1o0i11 = ooiol00oIl0.I00000oOI;
/* 14 */            iOl1l0o0i1I0I00000oOI.I001IO000(oilOloI, 0, str);
/* 21 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || o01ioO1o0i11 != null) {
/* 37 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 1, Oi0IOo.I00000oIO, o01ioO1o0i11 != null ? Oi0IiIoo.I00000oIO(o01ioO1o0i11) : null);
                    }
/* 40 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

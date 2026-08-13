            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class IOi1ol1O implements Io00l010I {
                public static final IOi1ol1O I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             IOi1ol1O iOi1ol1O = new IOi1ol1O();
/* 6 */             I00000oIO = iOi1ol1O;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.CompleteResult", iOi1ol1O, 2);
/* 19 */            oO1Ol1i.I000OiO("completion", false);
/* 25 */            oO1Ol1i.I000OiO("_meta", true);
/* 28 */            descriptor = oO1Ol1i;
                }

                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 8 */             return new O0O01001OOII[]{IOiI0i.I00000oIO, iOi1iol.I00000oIO(O01l1I.I00000oIO)};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 10 */            boolean z = true;
/* 11 */            int i = 0;
/* 12 */            IOiI1O iOiI1O = null;
/* 13 */            O01ioO1o0i11 o01ioO1o0i11 = null;
/* 14 */            while (z) {
/* 16 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
/* 21 */                if (iI000II == -1) {
/* 53 */                    z = false;
                        } else if (iI000II == 0) {
/* 48 */                    iOiI1O = (IOiI1O) iOl1ii1loOI00000oOI.I00100o1O0lo(oilOloI, 0, IOiI0i.I00000oIO, iOiI1O);
/* 50 */                    i |= 1;
                        } else {
/* 25 */                    if (iI000II != 1) {
/* 38 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 9 */                         return null;
                            }
/* 33 */                    o01ioO1o0i11 = (O01ioO1o0i11) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 1, O01l1I.I00000oIO, o01ioO1o0i11);
/* 35 */                    i |= 2;
                        }
                    }
/* 55 */            iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 62 */            if (1 != (i & 1)) {
/* 84 */                lI1IIO.I00000oIO(i, 1, descriptor);
/* 186 */               throw null;
                    }
/* 64 */            IOiI1i01111i iOiI1i01111i = new IOiI1i01111i();
/* 67 */            iOiI1i01111i.I00000oIO = iOiI1O;
/* 71 */            if ((i & 2) == 0) {
/* 73 */                iOiI1i01111i.I00000oOI = null;
                    } else {
/* 79 */                iOiI1i01111i.I00000oOI = o01ioO1o0i11;
                    }
/* 75 */            VarHandle.storeStoreFence();
/* 78 */            return iOiI1i01111i;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             IOiI1i01111i iOiI1i01111i = (IOiI1i01111i) obj;
/* 3 */             OilOloI oilOloI = descriptor;
/* 5 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 9 */             IOiI0i iOiI0i = IOiI0i.I00000oIO;
/* 11 */            IOiI1O iOiI1O = iOiI1i01111i.I00000oIO;
/* 13 */            O01ioO1o0i11 o01ioO1o0i11 = iOiI1i01111i.I00000oOI;
/* 16 */            iOl1l0o0i1I0I00000oOI.I000l1(oilOloI, 0, iOiI0i, iOiI1O);
/* 23 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || o01ioO1o0i11 != null) {
/* 31 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 1, O01l1I.I00000oIO, o01ioO1o0i11);
                    }
/* 34 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

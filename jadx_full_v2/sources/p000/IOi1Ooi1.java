            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class IOi1Ooi1 implements Io00l010I {
                public static final IOi1Ooi1 I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             IOi1Ooi1 iOi1Ooi1 = new IOi1Ooi1();
/* 6 */             I00000oIO = iOi1Ooi1;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.CompleteRequestParams", iOi1Ooi1, 4);
/* 19 */            oO1Ol1i.I000OiO("argument", false);
/* 24 */            oO1Ol1i.I000OiO("ref", false);
/* 30 */            oO1Ol1i.I000OiO("context", true);
/* 35 */            oO1Ol1i.I000OiO("_meta", true);
/* 38 */            descriptor = oO1Ol1i;
                }

                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 14 */            return new O0O01001OOII[]{IOi1iI.I00000oIO, OOo1I1o.I0000Il00O, iOi1iol.I00000oIO(IOi1oI00.I00000oIO), iOi1iol.I00000oIO(Oi0IOo.I00000oIO)};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 10 */            boolean z = true;
/* 11 */            int i = 0;
/* 12 */            IOi1liol0 iOi1liol0 = null;
/* 13 */            OOo11oi0ilIO oOo11oi0ilIO = null;
/* 14 */            IOi1oO0o0 iOi1oO0o0 = null;
/* 15 */            O01ioO1o0i11 o01ioO1o0i11 = null;
/* 17 */            while (z) {
/* 19 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
/* 24 */                if (iI000II == -1) {
/* 97 */                    z = false;
                        } else if (iI000II == 0) {
/* 92 */                    iOi1liol0 = (IOi1liol0) iOl1ii1loOI00000oOI.I00100o1O0lo(oilOloI, 0, IOi1iI.I00000oIO, iOi1liol0);
/* 94 */                    i |= 1;
                        } else if (iI000II == 1) {
/* 81 */                    oOo11oi0ilIO = (OOo11oi0ilIO) iOl1ii1loOI00000oOI.I00100o1O0lo(oilOloI, 1, OOo1I1o.I0000Il00O, oOo11oi0ilIO);
/* 83 */                    i |= 2;
                        } else if (iI000II == 2) {
/* 70 */                    iOi1oO0o0 = (IOi1oO0o0) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 2, IOi1oI00.I00000oIO, iOi1oO0o0);
/* 72 */                    i |= 4;
                        } else {
/* 33 */                    if (iI000II != 3) {
/* 60 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 9 */                         return null;
                            }
/* 49 */                    Oi0IiIoo oi0IiIoo = (Oi0IiIoo) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 3, Oi0IOo.I00000oIO, o01ioO1o0i11 != null ? Oi0IiIoo.I00000oIO(o01ioO1o0i11) : null);
/* 56 */                    o01ioO1o0i11 = oi0IiIoo != null ? oi0IiIoo.I00000oIO : null;
/* 57 */                    i |= 8;
                        }
                    }
/* 99 */            iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 106 */           if (3 != (i & 3)) {
/* 139 */               lI1IIO.I00000oIO(i, 3, descriptor);
/* 186 */               throw null;
                    }
/* 108 */           IOi1oi0 iOi1oi0 = new IOi1oi0();
/* 111 */           iOi1oi0.I00000oIO = iOi1liol0;
/* 113 */           iOi1oi0.I00000oOI = oOo11oi0ilIO;
/* 117 */           if ((i & 4) == 0) {
/* 119 */               iOi1oi0.I0000Il00O = null;
                    } else {
/* 122 */               iOi1oi0.I0000Il00O = iOi1oO0o0;
                    }
/* 126 */           if ((i & 8) == 0) {
/* 128 */               iOi1oi0.I0000O = null;
                    } else {
/* 134 */               iOi1oi0.I0000O = o01ioO1o0i11;
                    }
/* 130 */           VarHandle.storeStoreFence();
/* 133 */           return iOi1oi0;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             IOi1oi0 iOi1oi0 = (IOi1oi0) obj;
/* 3 */             OilOloI oilOloI = descriptor;
/* 5 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 9 */             IOi1iI iOi1iI = IOi1iI.I00000oIO;
/* 11 */            IOi1liol0 iOi1liol0 = iOi1oi0.I00000oIO;
/* 13 */            O01ioO1o0i11 o01ioO1o0i11 = iOi1oi0.I0000O;
/* 15 */            IOi1oO0o0 iOi1oO0o0 = iOi1oi0.I0000Il00O;
/* 18 */            iOl1l0o0i1I0I00000oOI.I000l1(oilOloI, 0, iOi1iI, iOi1liol0);
/* 26 */            iOl1l0o0i1I0I00000oOI.I000l1(oilOloI, 1, OOo1I1o.I0000Il00O, iOi1oi0.I00000oOI);
/* 33 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || iOi1oO0o0 != null) {
/* 41 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 2, IOi1oI00.I00000oIO, iOi1oO0o0);
                    }
/* 48 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || o01ioO1o0i11 != null) {
/* 64 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 3, Oi0IOo.I00000oIO, o01ioO1o0i11 != null ? Oi0IiIoo.I00000oIO(o01ioO1o0i11) : null);
                    }
/* 67 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

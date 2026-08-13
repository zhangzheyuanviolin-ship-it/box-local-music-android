            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class I1oO11l10o implements Io00l010I {
                public static final I1oO11l10o I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             I1oO11l10o i1oO11l10o = new I1oO11l10o();
/* 6 */             I00000oIO = i1oO11l10o;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.BaseNotificationParams", i1oO11l10o, 1);
/* 18 */            oO1Ol1i.I000OiO("_meta", true);
/* 21 */            descriptor = oO1Ol1i;
                }

                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 8 */             return new O0O01001OOII[]{iOi1iol.I00000oIO(O01l1I.I00000oIO)};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 10 */            boolean z = true;
/* 11 */            boolean z2 = false;
/* 12 */            O01ioO1o0i11 o01ioO1o0i11 = null;
/* 13 */            while (z) {
/* 15 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
/* 20 */                if (iI000II == -1) {
/* 39 */                    z = false;
                        } else {
/* 22 */                    if (iI000II != 0) {
/* 35 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 9 */                         return null;
                            }
/* 31 */                    o01ioO1o0i11 = (O01ioO1o0i11) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 0, O01l1I.I00000oIO, o01ioO1o0i11);
/* 33 */                    z2 = true;
                        }
                    }
/* 41 */            iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 46 */            I1oO1o1111o i1oO1o1111o = new I1oO1o1111o();
/* 49 */            if (z2) {
/* 57 */                i1oO1o1111o.I00000oIO = o01ioO1o0i11;
                    } else {
/* 51 */                i1oO1o1111o.I00000oIO = null;
                    }
/* 53 */            VarHandle.storeStoreFence();
/* 56 */            return i1oO1o1111o;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 3 */             O01ioO1o0i11 o01ioO1o0i11 = ((I1oO1o1111o) obj).I00000oIO;
/* 5 */             OilOloI oilOloI = descriptor;
/* 7 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 15 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || o01ioO1o0i11 != null) {
/* 23 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 0, O01l1I.I00000oIO, o01ioO1o0i11);
                    }
/* 26 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

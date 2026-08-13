            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public final class Iioil1oOO implements Io00l010I {
                public static final Iioil1oOO I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             Iioil1oOO iioil1oOO = new Iioil1oOO();
/* 6 */             I00000oIO = iioil1oOO;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.ElicitRequestParams.RequestedSchema", iioil1oOO, 3);
/* 19 */            oO1Ol1i.I000OiO("properties", false);
/* 25 */            oO1Ol1i.I000OiO("required", true);
/* 30 */            oO1Ol1i.I000OiO("type", true);
/* 33 */            descriptor = oO1Ol1i;
                }

                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 17 */            return new O0O01001OOII[]{O01l1I.I00000oIO, iOi1iol.I00000oIO((O0O01001OOII) IioioOiI.I0000O[1].getValue()), OlOlllO.I00000oIO};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 7 */             O0ioIllo0i1[] o0ioIllo0i1Arr = IioioOiI.I0000O;
/* 12 */            boolean z = true;
/* 13 */            int i = 0;
/* 14 */            O01ioO1o0i11 o01ioO1o0i11 = null;
/* 15 */            List list = null;
/* 16 */            String strI000l1 = null;
/* 17 */            while (z) {
/* 19 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
/* 24 */                if (iI000II == -1) {
/* 72 */                    z = false;
                        } else if (iI000II == 0) {
/* 67 */                    o01ioO1o0i11 = (O01ioO1o0i11) iOl1ii1loOI00000oOI.I00100o1O0lo(oilOloI, 0, O01l1I.I00000oIO, o01ioO1o0i11);
/* 69 */                    i |= 1;
                        } else if (iI000II == 1) {
/* 56 */                    list = (List) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 1, (O0O01001OOII) o0ioIllo0i1Arr[1].getValue(), list);
/* 58 */                    i |= 2;
                        } else {
/* 31 */                    if (iI000II != 2) {
/* 40 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 11 */                        return null;
                            }
/* 33 */                    strI000l1 = iOl1ii1loOI00000oOI.I000l1(oilOloI, 2);
/* 37 */                    i |= 4;
                        }
                    }
/* 74 */            iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 81 */            if (1 != (i & 1)) {
/* 114 */               lI1IIO.I00000oIO(i, 1, descriptor);
/* 186 */               throw null;
                    }
/* 83 */            IioioOiI iioioOiI = new IioioOiI();
/* 86 */            iioioOiI.I00000oIO = o01ioO1o0i11;
/* 90 */            if ((i & 2) == 0) {
/* 92 */                iioioOiI.I00000oOI = null;
                    } else {
/* 95 */                iioioOiI.I00000oOI = list;
                    }
/* 99 */            if ((i & 4) == 0) {
/* 103 */               iioioOiI.I0000Il00O = "object";
                    } else {
/* 109 */               iioioOiI.I0000Il00O = strI000l1;
                    }
/* 105 */           VarHandle.storeStoreFence();
/* 108 */           return iioioOiI;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             IioioOiI iioioOiI = (IioioOiI) obj;
/* 3 */             OilOloI oilOloI = descriptor;
/* 5 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 9 */             O0ioIllo0i1[] o0ioIllo0i1Arr = IioioOiI.I0000O;
/* 11 */            O01l1I o01l1I = O01l1I.I00000oIO;
/* 13 */            O01ioO1o0i11 o01ioO1o0i11 = iioioOiI.I00000oIO;
/* 15 */            List list = iioioOiI.I00000oOI;
/* 18 */            iOl1l0o0i1I0I00000oOI.I000l1(oilOloI, 0, o01l1I, o01ioO1o0i11);
/* 25 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || list != null) {
/* 39 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 1, (O0O01001OOII) o0ioIllo0i1Arr[1].getValue(), list);
                    }
/* 45 */            iOl1l0o0i1I0I00000oOI.I001IO000(oilOloI, 2, iioioOiI.I0000Il00O);
/* 48 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public final class Oo1OOooi1 implements Io00l010I {
                public static final Oo1OOooi1 I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             Oo1OOooi1 oo1OOooi1 = new Oo1OOooi1();
/* 6 */             I00000oIO = oo1OOooi1;
/* 13 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.ToolSchema", oo1OOooi1, 3);
/* 19 */            oO1Ol1i.I000OiO("properties", true);
/* 24 */            oO1Ol1i.I000OiO("required", true);
/* 29 */            oO1Ol1i.I000OiO("type", true);
/* 32 */            descriptor = oO1Ol1i;
                }

                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 23 */            return new O0O01001OOII[]{iOi1iol.I00000oIO(O01l1I.I00000oIO), iOi1iol.I00000oIO((O0O01001OOII) Oo1Oioo.I0000O[1].getValue()), OlOlllO.I00000oIO};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloI = descriptor;
/* 3 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 7 */             O0ioIllo0i1[] o0ioIllo0i1Arr = Oo1Oioo.I0000O;
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
/* 67 */                    o01ioO1o0i11 = (O01ioO1o0i11) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 0, O01l1I.I00000oIO, o01ioO1o0i11);
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
/* 79 */            Oo1Oioo oo1Oioo = new Oo1Oioo();
/* 84 */            if ((i & 1) == 0) {
/* 86 */                oo1Oioo.I00000oIO = null;
                    } else {
/* 89 */                oo1Oioo.I00000oIO = o01ioO1o0i11;
                    }
/* 93 */            if ((i & 2) == 0) {
/* 95 */                oo1Oioo.I00000oOI = null;
                    } else {
/* 98 */                oo1Oioo.I00000oOI = list;
                    }
/* 102 */           if ((i & 4) == 0) {
/* 106 */               oo1Oioo.I0000Il00O = "object";
                    } else {
/* 112 */               oo1Oioo.I0000Il00O = strI000l1;
                    }
/* 108 */           VarHandle.storeStoreFence();
/* 111 */           return oo1Oioo;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             Oo1Oioo oo1Oioo = (Oo1Oioo) obj;
/* 3 */             List list = oo1Oioo.I00000oOI;
/* 5 */             O01ioO1o0i11 o01ioO1o0i11 = oo1Oioo.I00000oIO;
/* 7 */             OilOloI oilOloI = descriptor;
/* 9 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 13 */            O0ioIllo0i1[] o0ioIllo0i1Arr = Oo1Oioo.I0000O;
/* 19 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || o01ioO1o0i11 != null) {
/* 27 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 0, O01l1I.I00000oIO, o01ioO1o0i11);
                    }
/* 34 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || list != null) {
/* 48 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 1, (O0O01001OOII) o0ioIllo0i1Arr[1].getValue(), list);
                    }
/* 54 */            iOl1l0o0i1I0I00000oOI.I001IO000(oilOloI, 2, oo1Oioo.I0000Il00O);
/* 57 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

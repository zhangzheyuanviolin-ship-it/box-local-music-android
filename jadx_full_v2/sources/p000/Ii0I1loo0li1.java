            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public final class Ii0I1loo0li1 implements Io00l010I {
                public static final Ii0I1loo0li1 I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             Ii0I1loo0li1 ii0I1loo0li1 = new Ii0I1loo0li1();
/* 6 */             I00000oIO = ii0I1loo0li1;
/* 14 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.CreateMessageRequestParams", ii0I1loo0li1, 9);
/* 20 */            oO1Ol1i.I000OiO("maxTokens", false);
/* 25 */            oO1Ol1i.I000OiO("messages", false);
/* 31 */            oO1Ol1i.I000OiO("modelPreferences", true);
/* 36 */            oO1Ol1i.I000OiO("systemPrompt", true);
/* 41 */            oO1Ol1i.I000OiO("includeContext", true);
/* 46 */            oO1Ol1i.I000OiO("temperature", true);
/* 51 */            oO1Ol1i.I000OiO("stopSequences", true);
/* 56 */            oO1Ol1i.I000OiO("metadata", true);
/* 61 */            oO1Ol1i.I000OiO("_meta", true);
/* 64 */            descriptor = oO1Ol1i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 1 */             O0ioIllo0i1[] o0ioIllo0i1Arr = Ii0Ilioo.I000OiO;
/* 5 */             return new O0O01001OOII[]{IooOIlOIIO.I00000oIO, o0ioIllo0i1Arr[1].getValue(), iOi1iol.I00000oIO(O1oloIliIoi.I00000oIO), iOi1iol.I00000oIO(OlOlllO.I00000oIO), iOi1iol.I00000oIO((O0O01001OOII) o0ioIllo0i1Arr[4].getValue()), iOi1iol.I00000oIO(IiioO01.I00000oIO), iOi1iol.I00000oIO((O0O01001OOII) o0ioIllo0i1Arr[6].getValue()), iOi1iol.I00000oIO(O01l1I.I00000oIO), iOi1iol.I00000oIO(Oi0IOo.I00000oIO)};
                }

                /* JADX WARN: Type inference failed for: r1v5 */
                /* JADX WARN: Type inference failed for: r1v6, types: [Iol01oi1o, O01ioO1o0i11, java.lang.Double, java.lang.String, java.util.List] */
                /* JADX WARN: Type inference failed for: r1v7 */
                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
                    ?? r1;
/* 1 */             OilOloI oilOloI = descriptor;
/* 5 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 9 */             O0ioIllo0i1[] o0ioIllo0i1Arr = Ii0Ilioo.I000OiO;
/* 13 */            int iI0010I0i = 0;
/* 14 */            boolean z = true;
/* 15 */            int i = 0;
/* 16 */            List list = null;
/* 17 */            O1oo01I1 o1oo01I1 = null;
/* 18 */            String str = null;
/* 19 */            Iol01oi1o iol01oi1o = null;
/* 20 */            Double d = null;
/* 21 */            List list2 = null;
/* 22 */            O01ioO1o0i11 o01ioO1o0i11 = null;
/* 23 */            O01ioO1o0i11 o01ioO1o0i112 = null;
/* 25 */            while (z) {
/* 27 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
                        switch (iI000II) {
                            case -1:
/* 209 */                       z = false;
                                break;
                            case 0:
/* 199 */                       iI0010I0i = iOl1ii1loOI00000oOI.I0010I0i(oilOloI, 0);
/* 203 */                       i |= 1;
                                break;
                            case 1:
/* 191 */                       list = (List) iOl1ii1loOI00000oOI.I00100o1O0lo(oilOloI, 1, (O0O01001OOII) o0ioIllo0i1Arr[1].getValue(), list);
/* 193 */                       i |= 2;
                                break;
                            case 2:
/* 168 */                       o1oo01I1 = (O1oo01I1) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 2, O1oloIliIoi.I00000oIO, o1oo01I1);
/* 170 */                       i |= 4;
                                break;
                            case 3:
/* 152 */                       str = (String) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 3, OlOlllO.I00000oIO, str);
/* 154 */                       i |= 8;
                                break;
                            case 4:
/* 138 */                       iol01oi1o = (Iol01oi1o) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 4, (O0O01001OOII) o0ioIllo0i1Arr[4].getValue(), iol01oi1o);
/* 140 */                       i |= 16;
                                break;
                            case 5:
/* 117 */                       d = (Double) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 5, IiioO01.I00000oIO, d);
/* 119 */                       i |= 32;
                                break;
                            case 6:
/* 102 */                       list2 = (List) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 6, (O0O01001OOII) o0ioIllo0i1Arr[6].getValue(), list2);
/* 104 */                       i |= 64;
                                break;
                            case 7:
/* 81 */                        o01ioO1o0i11 = (O01ioO1o0i11) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 7, O01l1I.I00000oIO, o01ioO1o0i11);
/* 83 */                        i |= Barcode.FORMAT_ITF;
                                break;
                            case 8:
/* 58 */                        Oi0IiIoo oi0IiIoo = (Oi0IiIoo) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 8, Oi0IOo.I00000oIO, o01ioO1o0i112 != null ? Oi0IiIoo.I00000oIO(o01ioO1o0i112) : null);
/* 66 */                        o01ioO1o0i112 = oi0IiIoo != null ? oi0IiIoo.I00000oIO : null;
/* 68 */                        i |= Barcode.FORMAT_QR_CODE;
                                break;
                            default:
/* 34 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 11 */                        return null;
                        }
                    }
/* 212 */           iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 219 */           if (3 != (i & 3)) {
/* 303 */               lI1IIO.I00000oIO(i, 3, descriptor);
/* 306 */               throw null;
                    }
/* 221 */           Ii0Ilioo ii0Ilioo = new Ii0Ilioo();
/* 224 */           ii0Ilioo.I00000oIO = iI0010I0i;
/* 226 */           ii0Ilioo.I00000oOI = list;
/* 230 */           if ((i & 4) == 0) {
/* 232 */               r1 = 0;
/* 234 */               ii0Ilioo.I0000Il00O = null;
                    } else {
/* 237 */               r1 = 0;
/* 239 */               ii0Ilioo.I0000Il00O = o1oo01I1;
                    }
/* 243 */           if ((i & 8) == 0) {
/* 245 */               ii0Ilioo.I0000O = r1;
                    } else {
/* 248 */               ii0Ilioo.I0000O = str;
                    }
/* 252 */           if ((i & 16) == 0) {
/* 254 */               ii0Ilioo.I0000oI00 = r1;
                    } else {
/* 257 */               ii0Ilioo.I0000oI00 = iol01oi1o;
                    }
/* 261 */           if ((i & 32) == 0) {
/* 263 */               ii0Ilioo.I0001Ioi1lo = r1;
                    } else {
/* 266 */               ii0Ilioo.I0001Ioi1lo = d;
                    }
/* 270 */           if ((i & 64) == 0) {
/* 272 */               ii0Ilioo.I000II = r1;
                    } else {
/* 275 */               ii0Ilioo.I000II = list2;
                    }
/* 279 */           if ((i & Barcode.FORMAT_ITF) == 0) {
/* 281 */               ii0Ilioo.I000O01llI0 = r1;
                    } else {
/* 284 */               ii0Ilioo.I000O01llI0 = o01ioO1o0i11;
                    }
/* 288 */           if ((i & Barcode.FORMAT_QR_CODE) == 0) {
/* 290 */               ii0Ilioo.I000OOo1O = r1;
                    } else {
/* 296 */               ii0Ilioo.I000OOo1O = o01ioO1o0i112;
                    }
/* 292 */           VarHandle.storeStoreFence();
/* 295 */           return ii0Ilioo;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             Ii0Ilioo ii0Ilioo = (Ii0Ilioo) obj;
/* 3 */             OilOloI oilOloI = descriptor;
/* 5 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 9 */             O0ioIllo0i1[] o0ioIllo0i1Arr = Ii0Ilioo.I000OiO;
/* 11 */            int i = ii0Ilioo.I00000oIO;
/* 13 */            O01ioO1o0i11 o01ioO1o0i11 = ii0Ilioo.I000OOo1O;
/* 15 */            O01ioO1o0i11 o01ioO1o0i112 = ii0Ilioo.I000O01llI0;
/* 17 */            List list = ii0Ilioo.I000II;
/* 19 */            Double d = ii0Ilioo.I0001Ioi1lo;
/* 21 */            Iol01oi1o iol01oi1o = ii0Ilioo.I0000oI00;
/* 23 */            String str = ii0Ilioo.I0000O;
/* 25 */            O1oo01I1 o1oo01I1 = ii0Ilioo.I0000Il00O;
/* 28 */            iOl1l0o0i1I0I00000oOI.I00111O(0, i, oilOloI);
/* 42 */            iOl1l0o0i1I0I00000oOI.I000l1(oilOloI, 1, (O0O01001OOII) o0ioIllo0i1Arr[1].getValue(), ii0Ilioo.I00000oOI);
/* 49 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || o1oo01I1 != null) {
/* 57 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 2, O1oloIliIoi.I00000oIO, o1oo01I1);
                    }
/* 64 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || str != null) {
/* 72 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 3, OlOlllO.I00000oIO, str);
                    }
/* 79 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || iol01oi1o != null) {
/* 93 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 4, (O0O01001OOII) o0ioIllo0i1Arr[4].getValue(), iol01oi1o);
                    }
/* 100 */           if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || d != null) {
/* 108 */               iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 5, IiioO01.I00000oIO, d);
                    }
/* 115 */           if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || list != null) {
/* 129 */               iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 6, (O0O01001OOII) o0ioIllo0i1Arr[6].getValue(), list);
                    }
/* 136 */           if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || o01ioO1o0i112 != null) {
/* 144 */               iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 7, O01l1I.I00000oIO, o01ioO1o0i112);
                    }
/* 151 */           if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || o01ioO1o0i11 != null) {
/* 168 */               iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 8, Oi0IOo.I00000oIO, o01ioO1o0i11 != null ? Oi0IiIoo.I00000oIO(o01ioO1o0i11) : null);
                    }
/* 171 */           iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

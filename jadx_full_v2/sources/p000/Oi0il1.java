            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public final class Oi0il1 implements Io00l010I {
                public static final Oi0il1 I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             Oi0il1 oi0il1 = new Oi0il1();
/* 6 */             I00000oIO = oi0il1;
/* 14 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.Resource", oi0il1, 9);
/* 20 */            oO1Ol1i.I000OiO("uri", false);
/* 25 */            oO1Ol1i.I000OiO("name", false);
/* 31 */            oO1Ol1i.I000OiO("description", true);
/* 36 */            oO1Ol1i.I000OiO("mimeType", true);
/* 41 */            oO1Ol1i.I000OiO("size", true);
/* 46 */            oO1Ol1i.I000OiO("title", true);
/* 51 */            oO1Ol1i.I000OiO("annotations", true);
/* 56 */            oO1Ol1i.I000OiO("icons", true);
/* 61 */            oO1Ol1i.I000OiO("_meta", true);
/* 64 */            descriptor = oO1Ol1i;
                }

                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 1 */             O0ioIllo0i1[] o0ioIllo0i1Arr = Oi0ilo0.I000OiO;
/* 3 */             OlOlllO olOlllO = OlOlllO.I00000oIO;
/* 50 */            return new O0O01001OOII[]{olOlllO, olOlllO, iOi1iol.I00000oIO(olOlllO), iOi1iol.I00000oIO(olOlllO), iOi1iol.I00000oIO(O1IOi1i.I00000oIO), iOi1iol.I00000oIO(olOlllO), iOi1iol.I00000oIO(I11IOlOI0ll.I00000oIO), iOi1iol.I00000oIO((O0O01001OOII) o0ioIllo0i1Arr[7].getValue()), iOi1iol.I00000oIO(O01l1I.I00000oIO)};
                }

                /* JADX WARN: Type inference failed for: r1v5 */
                /* JADX WARN: Type inference failed for: r1v6, types: [I11Illil0iIl, O01ioO1o0i11, java.lang.Long, java.lang.String, java.util.List] */
                /* JADX WARN: Type inference failed for: r1v7 */
                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
                    ?? r1;
/* 1 */             OilOloI oilOloI = descriptor;
/* 5 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 9 */             O0ioIllo0i1[] o0ioIllo0i1Arr = Oi0ilo0.I000OiO;
/* 13 */            O01ioO1o0i11 o01ioO1o0i11 = null;
/* 14 */            boolean z = true;
/* 15 */            int i = 0;
/* 16 */            String strI000l1 = null;
/* 17 */            String strI000l12 = null;
/* 18 */            String str = null;
/* 19 */            String str2 = null;
/* 20 */            Long l = null;
/* 21 */            String str3 = null;
/* 22 */            I11Illil0iIl i11Illil0iIl = null;
/* 23 */            List list = null;
/* 25 */            while (z) {
/* 27 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
                        switch (iI000II) {
                            case -1:
/* 154 */                       z = false;
                                break;
                            case 0:
/* 145 */                       strI000l1 = iOl1ii1loOI00000oOI.I000l1(oilOloI, 0);
/* 149 */                       i |= 1;
                                break;
                            case 1:
/* 136 */                       strI000l12 = iOl1ii1loOI00000oOI.I000l1(oilOloI, 1);
/* 140 */                       i |= 2;
                                break;
                            case 2:
/* 130 */                       str = (String) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 2, OlOlllO.I00000oIO, str);
/* 132 */                       i |= 4;
                                break;
                            case 3:
/* 117 */                       str2 = (String) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 3, OlOlllO.I00000oIO, str2);
/* 119 */                       i |= 8;
                                break;
                            case 4:
/* 105 */                       l = (Long) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 4, O1IOi1i.I00000oIO, l);
/* 107 */                       i |= 16;
                                break;
                            case 5:
/* 92 */                        str3 = (String) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 5, OlOlllO.I00000oIO, str3);
/* 94 */                        i |= 32;
                                break;
                            case 6:
/* 79 */                        i11Illil0iIl = (I11Illil0iIl) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 6, I11IOlOI0ll.I00000oIO, i11Illil0iIl);
/* 81 */                        i |= 64;
                                break;
                            case 7:
/* 66 */                        list = (List) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 7, (O0O01001OOII) o0ioIllo0i1Arr[7].getValue(), list);
/* 68 */                        i |= Barcode.FORMAT_ITF;
                                break;
                            case 8:
/* 47 */                        o01ioO1o0i11 = (O01ioO1o0i11) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 8, O01l1I.I00000oIO, o01ioO1o0i11);
/* 49 */                        i |= Barcode.FORMAT_QR_CODE;
                                break;
                            default:
/* 34 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 11 */                        return null;
                        }
                    }
/* 157 */           iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 164 */           if (3 != (i & 3)) {
/* 248 */               lI1IIO.I00000oIO(i, 3, descriptor);
/* 251 */               throw null;
                    }
/* 166 */           Oi0ilo0 oi0ilo0 = new Oi0ilo0();
/* 169 */           oi0ilo0.I00000oIO = strI000l1;
/* 171 */           oi0ilo0.I00000oOI = strI000l12;
/* 175 */           if ((i & 4) == 0) {
/* 177 */               r1 = 0;
/* 179 */               oi0ilo0.I0000Il00O = null;
                    } else {
/* 182 */               r1 = 0;
/* 184 */               oi0ilo0.I0000Il00O = str;
                    }
/* 188 */           if ((i & 8) == 0) {
/* 190 */               oi0ilo0.I0000O = r1;
                    } else {
/* 193 */               oi0ilo0.I0000O = str2;
                    }
/* 197 */           if ((i & 16) == 0) {
/* 199 */               oi0ilo0.I0000oI00 = r1;
                    } else {
/* 202 */               oi0ilo0.I0000oI00 = l;
                    }
/* 206 */           if ((i & 32) == 0) {
/* 208 */               oi0ilo0.I0001Ioi1lo = r1;
                    } else {
/* 211 */               oi0ilo0.I0001Ioi1lo = str3;
                    }
/* 215 */           if ((i & 64) == 0) {
/* 217 */               oi0ilo0.I000II = r1;
                    } else {
/* 220 */               oi0ilo0.I000II = i11Illil0iIl;
                    }
/* 224 */           if ((i & Barcode.FORMAT_ITF) == 0) {
/* 226 */               oi0ilo0.I000O01llI0 = r1;
                    } else {
/* 229 */               oi0ilo0.I000O01llI0 = list;
                    }
/* 233 */           if ((i & Barcode.FORMAT_QR_CODE) == 0) {
/* 235 */               oi0ilo0.I000OOo1O = r1;
                    } else {
/* 241 */               oi0ilo0.I000OOo1O = o01ioO1o0i11;
                    }
/* 237 */           VarHandle.storeStoreFence();
/* 240 */           return oi0ilo0;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             Oi0ilo0 oi0ilo0 = (Oi0ilo0) obj;
/* 3 */             OilOloI oilOloI = descriptor;
/* 5 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 9 */             O0ioIllo0i1[] o0ioIllo0i1Arr = Oi0ilo0.I000OiO;
/* 11 */            String str = oi0ilo0.I00000oIO;
/* 13 */            O01ioO1o0i11 o01ioO1o0i11 = oi0ilo0.I000OOo1O;
/* 15 */            List list = oi0ilo0.I000O01llI0;
/* 17 */            I11Illil0iIl i11Illil0iIl = oi0ilo0.I000II;
/* 19 */            String str2 = oi0ilo0.I0001Ioi1lo;
/* 21 */            Long l = oi0ilo0.I0000oI00;
/* 23 */            String str3 = oi0ilo0.I0000O;
/* 25 */            String str4 = oi0ilo0.I0000Il00O;
/* 28 */            iOl1l0o0i1I0I00000oOI.I001IO000(oilOloI, 0, str);
/* 34 */            iOl1l0o0i1I0I00000oOI.I001IO000(oilOloI, 1, oi0ilo0.I00000oOI);
/* 41 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || str4 != null) {
/* 49 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 2, OlOlllO.I00000oIO, str4);
                    }
/* 56 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || str3 != null) {
/* 64 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 3, OlOlllO.I00000oIO, str3);
                    }
/* 71 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || l != null) {
/* 79 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 4, O1IOi1i.I00000oIO, l);
                    }
/* 86 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || str2 != null) {
/* 94 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 5, OlOlllO.I00000oIO, str2);
                    }
/* 101 */           if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || i11Illil0iIl != null) {
/* 109 */               iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 6, I11IOlOI0ll.I00000oIO, i11Illil0iIl);
                    }
/* 116 */           if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || list != null) {
/* 130 */               iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 7, (O0O01001OOII) o0ioIllo0i1Arr[7].getValue(), list);
                    }
/* 137 */           if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || o01ioO1o0i11 != null) {
/* 146 */               iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 8, O01l1I.I00000oIO, o01ioO1o0i11);
                    }
/* 149 */           iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

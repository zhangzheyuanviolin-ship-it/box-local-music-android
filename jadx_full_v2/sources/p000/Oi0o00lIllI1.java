            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public final class Oi0o00lIllI1 implements Io00l010I {
                public static final Oi0o00lIllI1 I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             Oi0o00lIllI1 oi0o00lIllI1 = new Oi0o00lIllI1();
/* 6 */             I00000oIO = oi0o00lIllI1;
/* 14 */            OO1Ol1i oO1Ol1i = new OO1Ol1i("io.modelcontextprotocol.kotlin.sdk.types.ResourceTemplate", oi0o00lIllI1, 8);
/* 20 */            oO1Ol1i.I000OiO("uriTemplate", false);
/* 25 */            oO1Ol1i.I000OiO("name", false);
/* 31 */            oO1Ol1i.I000OiO("description", true);
/* 36 */            oO1Ol1i.I000OiO("mimeType", true);
/* 41 */            oO1Ol1i.I000OiO("title", true);
/* 46 */            oO1Ol1i.I000OiO("annotations", true);
/* 51 */            oO1Ol1i.I000OiO("icons", true);
/* 56 */            oO1Ol1i.I000OiO("_meta", true);
/* 59 */            descriptor = oO1Ol1i;
                }

                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 1 */             O0ioIllo0i1[] o0ioIllo0i1Arr = Oi0o0O00ol.I000OOo1O;
/* 3 */             OlOlllO olOlllO = OlOlllO.I00000oIO;
/* 44 */            return new O0O01001OOII[]{olOlllO, olOlllO, iOi1iol.I00000oIO(olOlllO), iOi1iol.I00000oIO(olOlllO), iOi1iol.I00000oIO(olOlllO), iOi1iol.I00000oIO(I11IOlOI0ll.I00000oIO), iOi1iol.I00000oIO((O0O01001OOII) o0ioIllo0i1Arr[6].getValue()), iOi1iol.I00000oIO(O01l1I.I00000oIO)};
                }

                /* JADX WARN: Type inference failed for: r1v5 */
                /* JADX WARN: Type inference failed for: r1v6, types: [I11Illil0iIl, O01ioO1o0i11, java.lang.String, java.util.List] */
                /* JADX WARN: Type inference failed for: r1v7 */
                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
                    ?? r1;
/* 1 */             OilOloI oilOloI = descriptor;
/* 5 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloI);
/* 9 */             O0ioIllo0i1[] o0ioIllo0i1Arr = Oi0o0O00ol.I000OOo1O;
/* 12 */            boolean z = true;
/* 15 */            int i = 0;
/* 16 */            String strI000l1 = null;
/* 17 */            String strI000l12 = null;
/* 18 */            String str = null;
/* 19 */            String str2 = null;
/* 20 */            String str3 = null;
/* 21 */            I11Illil0iIl i11Illil0iIl = null;
/* 22 */            List list = null;
/* 23 */            O01ioO1o0i11 o01ioO1o0i11 = null;
/* 25 */            while (z) {
/* 27 */                int iI000II = iOl1ii1loOI00000oOI.I000II(oilOloI);
                        switch (iI000II) {
                            case -1:
/* 137 */                       z = false;
                                break;
                            case 0:
/* 129 */                       strI000l1 = iOl1ii1loOI00000oOI.I000l1(oilOloI, 0);
/* 133 */                       i |= 1;
                                break;
                            case 1:
/* 121 */                       strI000l12 = iOl1ii1loOI00000oOI.I000l1(oilOloI, 1);
/* 125 */                       i |= 2;
                                break;
                            case 2:
/* 116 */                       str = (String) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 2, OlOlllO.I00000oIO, str);
/* 118 */                       i |= 4;
                                break;
                            case 3:
/* 103 */                       str2 = (String) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 3, OlOlllO.I00000oIO, str2);
/* 105 */                       i |= 8;
                                break;
                            case 4:
/* 91 */                        str3 = (String) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 4, OlOlllO.I00000oIO, str3);
/* 93 */                        i |= 16;
                                break;
                            case 5:
/* 78 */                        i11Illil0iIl = (I11Illil0iIl) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 5, I11IOlOI0ll.I00000oIO, i11Illil0iIl);
/* 80 */                        i |= 32;
                                break;
                            case 6:
/* 65 */                        list = (List) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 6, (O0O01001OOII) o0ioIllo0i1Arr[6].getValue(), list);
/* 67 */                        i |= 64;
                                break;
                            case 7:
/* 46 */                        o01ioO1o0i11 = (O01ioO1o0i11) iOl1ii1loOI00000oOI.I001i1O0Ol(oilOloI, 7, O01l1I.I00000oIO, o01ioO1o0i11);
/* 48 */                        i |= Barcode.FORMAT_ITF;
                                break;
                            default:
/* 34 */                        IioIoO10iOiI.I0000oI00(iI000II);
/* 13 */                        return null;
                        }
                    }
/* 139 */           iOl1ii1loOI00000oOI.I000oI1ioi(oilOloI);
/* 146 */           if (3 != (i & 3)) {
/* 221 */               lI1IIO.I00000oIO(i, 3, descriptor);
/* 224 */               throw null;
                    }
/* 148 */           Oi0o0O00ol oi0o0O00ol = new Oi0o0O00ol();
/* 151 */           oi0o0O00ol.I00000oIO = strI000l1;
/* 153 */           oi0o0O00ol.I00000oOI = strI000l12;
/* 157 */           if ((i & 4) == 0) {
/* 159 */               r1 = 0;
/* 161 */               oi0o0O00ol.I0000Il00O = null;
                    } else {
/* 164 */               r1 = 0;
/* 166 */               oi0o0O00ol.I0000Il00O = str;
                    }
/* 170 */           if ((i & 8) == 0) {
/* 172 */               oi0o0O00ol.I0000O = r1;
                    } else {
/* 175 */               oi0o0O00ol.I0000O = str2;
                    }
/* 179 */           if ((i & 16) == 0) {
/* 181 */               oi0o0O00ol.I0000oI00 = r1;
                    } else {
/* 184 */               oi0o0O00ol.I0000oI00 = str3;
                    }
/* 188 */           if ((i & 32) == 0) {
/* 190 */               oi0o0O00ol.I0001Ioi1lo = r1;
                    } else {
/* 193 */               oi0o0O00ol.I0001Ioi1lo = i11Illil0iIl;
                    }
/* 197 */           if ((i & 64) == 0) {
/* 199 */               oi0o0O00ol.I000II = r1;
                    } else {
/* 202 */               oi0o0O00ol.I000II = list;
                    }
/* 206 */           if ((i & Barcode.FORMAT_ITF) == 0) {
/* 208 */               oi0o0O00ol.I000O01llI0 = r1;
                    } else {
/* 214 */               oi0o0O00ol.I000O01llI0 = o01ioO1o0i11;
                    }
/* 210 */           VarHandle.storeStoreFence();
/* 213 */           return oi0o0O00ol;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             Oi0o0O00ol oi0o0O00ol = (Oi0o0O00ol) obj;
/* 3 */             OilOloI oilOloI = descriptor;
/* 5 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(oilOloI);
/* 9 */             O0ioIllo0i1[] o0ioIllo0i1Arr = Oi0o0O00ol.I000OOo1O;
/* 11 */            String str = oi0o0O00ol.I00000oIO;
/* 13 */            O01ioO1o0i11 o01ioO1o0i11 = oi0o0O00ol.I000O01llI0;
/* 15 */            List list = oi0o0O00ol.I000II;
/* 17 */            I11Illil0iIl i11Illil0iIl = oi0o0O00ol.I0001Ioi1lo;
/* 19 */            String str2 = oi0o0O00ol.I0000oI00;
/* 21 */            String str3 = oi0o0O00ol.I0000O;
/* 23 */            String str4 = oi0o0O00ol.I0000Il00O;
/* 26 */            iOl1l0o0i1I0I00000oOI.I001IO000(oilOloI, 0, str);
/* 32 */            iOl1l0o0i1I0I00000oOI.I001IO000(oilOloI, 1, oi0o0O00ol.I00000oOI);
/* 39 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || str4 != null) {
/* 47 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 2, OlOlllO.I00000oIO, str4);
                    }
/* 54 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || str3 != null) {
/* 62 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 3, OlOlllO.I00000oIO, str3);
                    }
/* 69 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || str2 != null) {
/* 77 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 4, OlOlllO.I00000oIO, str2);
                    }
/* 84 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || i11Illil0iIl != null) {
/* 92 */                iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 5, I11IOlOI0ll.I00000oIO, i11Illil0iIl);
                    }
/* 99 */            if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || list != null) {
/* 113 */               iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 6, (O0O01001OOII) o0ioIllo0i1Arr[6].getValue(), list);
                    }
/* 120 */           if (iOl1l0o0i1I0I00000oOI.I001lIiIIo1O() || o01ioO1o0i11 != null) {
/* 128 */               iOl1l0o0i1I0I00000oOI.I001iOo1i0O(oilOloI, 7, O01l1I.I00000oIO, o01ioO1o0i11);
                    }
/* 131 */           iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }

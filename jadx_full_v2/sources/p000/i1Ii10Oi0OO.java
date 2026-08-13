            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.UUID;
            
            public abstract class i1Ii10Oi0OO {
                public static final void I00000oIO(Oi1O00I1 oi1O00I1, I1Oi1Oi0O i1Oi1Oi0O, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
/* 4 */             iloI0lOlll1.I00i0O(-928065917);
/* 9 */             if ((i & 6) == 0) {
/* 20 */                i2 = (iloI0lOlll1.I000II(oi1O00I1) ? 4 : 2) | i;
                    } else {
/* 22 */                i2 = i;
                    }
/* 25 */            if ((i & 48) == 0) {
/* 38 */                i2 |= iloI0lOlll1.I000II(i1Oi1Oi0O) ? 32 : 16;
                    }
/* 41 */            if ((i & 384) == 0) {
/* 64 */                i2 |= (i & Barcode.FORMAT_UPC_A) == 0 ? iloI0lOlll1.I000II(null) : iloI0lOlll1.I000OOo1O(null) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 69 */            if ((i2 & 147) == 146 && iloI0lOlll1.I00IO1()) {
/* 78 */                iloI0lOlll1.I00OilO00Il();
                    } else {
/* 84 */                I00000oOI(oi1O00I1, i1Oi1Oi0O, iloI0lOlll1, i2 & 1022);
                    }
/* 87 */            OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 91 */            if (oOloioIlI001IO000 != null) {
/* 96 */                I1oiOo i1oiOo = new I1oiOo(0);
/* 99 */                i1oiOo.I00iiI = oi1O00I1;
/* 101 */               i1oiOo.I00iiO = i1Oi1Oi0O;
/* 103 */               i1oiOo.I00iio = i;
/* 105 */               VarHandle.storeStoreFence();
/* 108 */               oOloioIlI001IO000.I0000O = i1oiOo;
                    }
                }

                public static final void I00000oOI(Oi1O00I1 oi1O00I1, I1Oi1Oi0O i1Oi1Oi0O, IloI0lOlll1 iloI0lOlll1, int i) {
/* 1 */             Oi1O00I1 oi1O00I12 = oi1O00I1;
/* 5 */             IloI0lOlll1 iloI0lOlll12 = iloI0lOlll1;
/* 12 */            iloI0lOlll12.I00i0O(366594227);
/* 30 */            int i2 = (i & 6) == 0 ? (iloI0lOlll12.I000II(oi1O00I12) ? 4 : 2) | i : i;
/* 35 */            if ((i & 48) == 0) {
/* 47 */                i2 |= iloI0lOlll12.I000II(i1Oi1Oi0O) ? 32 : 16;
                    }
/* 51 */            if ((i & 384) == 0) {
/* 73 */                i2 |= (i & Barcode.FORMAT_UPC_A) == 0 ? iloI0lOlll12.I000II(null) : iloI0lOlll12.I000OOo1O(null) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 78 */            if ((i2 & 147) == 146 && iloI0lOlll12.I00IO1()) {
/* 87 */                iloI0lOlll12.I00OilO00Il();
                    } else {
/* 92 */                int i3 = 1;
/* 93 */                if (i1Oi1Oi0O == null) {
/* 95 */                    OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 99 */                    if (oOloioIlI001IO000 != null) {
/* 103 */                       I1oiOo i1oiOo = new I1oiOo(1);
/* 106 */                       i1oiOo.I00iiI = oi1O00I12;
/* 108 */                       i1oiOo.I00iiO = i1Oi1Oi0O;
/* 110 */                       i1oiOo.I00iio = i;
/* 112 */                       VarHandle.storeStoreFence();
/* 115 */                       oOloioIlI001IO000.I0000O = i1oiOo;
/* 117 */                       return;
                            }
/* 958 */                   return;
                        }
/* 121 */               iloI0lOlll12.I00i01iIIliI(-1973284790);
/* 126 */               IO1O01l iO1O01l = new IO1O01l(i3);
/* 129 */               iO1O01l.I00iiI = oi1O00I12;
/* 131 */               VarHandle.storeStoreFence();
/* 137 */               IOii1l iOii1lI00000oOI = iiioOl1O.I00000oOI(1712110702, iO1O01l, iloI0lOlll12);
/* 147 */               int i4 = (i2 & 112) | (i2 & 14) | 384;
/* 151 */               iloI0lOlll12.I00i01iIIliI(-1256053540);
/* 154 */               iOOO0ooiIo iooo0ooiio = i1Oi1Oi0O.I00000oIO;
/* 158 */               int i5 = 0;
/* 160 */               if (iooo0ooiio instanceof I1OIi0lOo) {
/* 165 */                   iloI0lOlll12.I00i01iIIliI(2144216659);
/* 175 */                   iOii1lI00000oOI.invoke(i1Oi1Oi0O, iloI0lOlll12, Integer.valueOf((i4 >> 3) & 126));
/* 178 */                   iloI0lOlll12.I0010I0i(false);
                        } else if (iooo0ooiio instanceof I1OII0i11o) {
/* 190 */                   iloI0lOlll12.I00i01iIIliI(2046257180);
/* 195 */                   I1oii000Ooi i1oii000Ooi = new I1oii000Ooi(i5);
/* 198 */                   i1oii000Ooi.I00iiI = iOii1lI00000oOI;
/* 200 */                   i1oii000Ooi.I00iiO = i1Oi1Oi0O;
/* 202 */                   VarHandle.storeStoreFence();
/* 216 */                   II0ooo1Il.I00000oIO(oi1O00I12, iiioOl1O.I00000oOI(301482436, i1oii000Ooi, iloI0lOlll12), iloI0lOlll12, (i4 & 14) | 48);
/* 219 */                   iloI0lOlll12.I0010I0i(false);
                        } else {
/* 226 */                   if (iooo0ooiio instanceof I1OlIi) {
/* 231 */                       iloI0lOlll12.I00i01iIIliI(2046370857);
/* 235 */                       O10lioiO o10lioiO = O10lioiO.I00iiI;
/* 243 */                       List listI000lI = OilO1oiooiII.I000lI(lOo1ilOiIio1.I00000oOI(i1Oi1Oi0O, I0ollliOo0.I00iio));
/* 249 */                       I1oiiOOli1I i1oiiOOli1I = new I1oiiOOli1I(0);
/* 252 */                       i1oiiOOli1I.I00iiI = iOii1lI00000oOI;
/* 254 */                       VarHandle.storeStoreFence();
/* 270 */                       IlioO0oO.I00000oIO(oi1O00I12, o10lioiO, listI000lI, 0, iiioOl1O.I00000oOI(-996206079, i1oiiOOli1I, iloI0lOlll12), iloI0lOlll12, (i4 & 14) | 24624, 4);
/* 273 */                       iloI0lOlll12.I0010I0i(false);
                            } else if (iooo0ooiio instanceof I1OiIO1OO) {
/* 288 */                       iloI0lOlll12.I00i01iIIliI(2046809445);
/* 291 */                       O10lioiO o10lioiO2 = O10lioiO.I00iOIl;
/* 297 */                       List listI000lI2 = OilO1oiooiII.I000lI(lOo1ilOiIio1.I00000oIO(i1Oi1Oi0O, false));
/* 305 */                       int i6 = ((I1OiIO1OO) iooo0ooiio).I00000oIO - 1;
/* 308 */                       I1oiiOOli1I i1oiiOOli1I2 = new I1oiiOOli1I(1);
/* 311 */                       i1oiiOOli1I2.I00iiI = iOii1lI00000oOI;
/* 313 */                       VarHandle.storeStoreFence();
/* 329 */                       oi1O00I12 = oi1O00I1;
/* 331 */                       IlioO0oO.I00000oIO(oi1O00I12, o10lioiO2, listI000lI2, i6, iiioOl1O.I00000oOI(-1232823904, i1oiiOOli1I2, iloI0lOlll12), iloI0lOlll12, (i4 & 14) | 24624, 0);
/* 334 */                       iloI0lOlll12.I0010I0i(false);
                            } else {
/* 339 */                       oi1O00I12 = oi1O00I1;
/* 343 */                       if (iooo0ooiio instanceof I1Ol1ioOi01) {
/* 348 */                           iloI0lOlll12.I00i01iIIliI(2047271779);
/* 353 */                           ilolI1I.I00000oIO(oi1O00I12, iloI0lOlll12, i4 & 14);
/* 356 */                           iloI0lOlll12.I0010I0i(false);
                                } else if (iooo0ooiio instanceof I1OIoO11) {
/* 368 */                           iloI0lOlll12.I00i01iIIliI(2047333407);
/* 373 */                           int i7 = ((I1OIoO11) iooo0ooiio).I00000oIO;
/* 377 */                           I1oiiilOo i1oiiilOo = new I1oiiilOo(0);
/* 380 */                           i1oiiilOo.I00iiI = i1Oi1Oi0O;
/* 382 */                           VarHandle.storeStoreFence();
/* 396 */                           iIloOoO.I00000oIO(oi1O00I12, i7, iiioOl1O.I00000oOI(727548192, i1oiiilOo, iloI0lOlll12), iloI0lOlll12, (i4 & 14) | 384);
/* 399 */                           iloI0lOlll12.I0010I0i(false);
                                } else if (iooo0ooiio instanceof I1OOI11oIiiO) {
/* 411 */                           iloI0lOlll12.I00i01iIIliI(2047498823);
/* 428 */                           IOOIi1iO.I00000oOI(oi1O00I12, OlOoOIi0o.I00OIo(((I1OOI11oIiiO) iooo0ooiio).I00000oIO).toString(), iloI0lOlll12, i4 & 14);
/* 431 */                           iloI0lOlll12.I0010I0i(false);
                                } else if (iooo0ooiio instanceof I1OIilooO) {
/* 443 */                           iloI0lOlll12.I00i01iIIliI(2047593063);
/* 460 */                           IOOIi1iO.I00000oOI(oi1O00I12, OlOoOIi0o.I00OIo(((I1OIilooO) iooo0ooiio).I0000oI00).toString(), iloI0lOlll12, i4 & 14);
/* 463 */                           iloI0lOlll12.I0010I0i(false);
                                } else if (iooo0ooiio instanceof I1OIoo1) {
/* 475 */                           iloI0lOlll12.I00i01iIIliI(2047684668);
/* 481 */                           iloI0lOlll12.I00i01iIIliI(2144264999);
/* 486 */                           I11110OIl i11110OIl = new I11110OIl(16);
/* 491 */                           LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 498 */                           I1oil1O1Oiio i1oil1O1Oiio = new I1oil1O1Oiio(0);
/* 501 */                           i1oil1O1Oiio.I00iiI = oi1O00I12;
/* 503 */                           i1oil1O1Oiio.I00iiO = iooo0ooiio;
/* 505 */                           VarHandle.storeStoreFence();
/* 515 */                           Ioll0ll0 ioll0ll0 = new Ioll0ll0(null, iiioOl1O.I00000oOI(-1003319804, i1oil1O1Oiio, iloI0lOlll12), 3);
/* 522 */                           String string = UUID.randomUUID().toString();
/* 532 */                           linkedHashMap.put("inline:".concat(string), ioll0ll0);
/* 537 */                           ioo10l.I00000oIO(i11110OIl, string, "�");
/* 543 */                           I1111OO10i i1111OO10iI000OiO = i11110OIl.I000OiO();
/* 547 */                           Map mapI000iOII = O1Oii0O0loo.I000iOII(linkedHashMap);
/* 551 */                           Oi1Oi0 oi1Oi0 = new Oi1Oi0();
/* 554 */                           oi1Oi0.I00000oIO = i1111OO10iI000OiO;
/* 556 */                           oi1Oi0.I00000oOI = mapI000iOII;
/* 558 */                           VarHandle.storeStoreFence();
/* 561 */                           iloI0lOlll12.I0010I0i(false);
/* 575 */                           lOlOlI.I00000oIO(oi1O00I12, oi1Oi0, null, null, false, 0, 0, iloI0lOlll1, i4 & 14, 62);
/* 578 */                           iloI0lOlll12 = iloI0lOlll1;
/* 579 */                           iloI0lOlll12.I0010I0i(false);
                                } else if (iooo0ooiio instanceof I1OOooOO) {
/* 591 */                           iloI0lOlll12.I00i01iIIliI(2047889578);
/* 594 */                           iloI0lOlll12.I0010I0i(false);
                                } else if (iooo0ooiio instanceof I1OiOI0I1i) {
/* 606 */                           iloI0lOlll12.I00i01iIIliI(2047974394);
/* 613 */                           oi1O00I12 = oi1O00I1;
/* 618 */                           l1I0I1l00.I00000oIO(oi1O00I12, i1Oi1Oi0O, null, iloI0lOlll1, i4 & 126, 2);
/* 621 */                           iloI0lOlll12 = iloI0lOlll1;
/* 622 */                           iloI0lOlll12.I0010I0i(false);
                                } else {
/* 627 */                           oi1O00I12 = oi1O00I1;
/* 631 */                           if (iooo0ooiio instanceof I1Ol0ii0I1Oo) {
/* 636 */                               iloI0lOlll12.I00i01iIIliI(2048043679);
/* 641 */                               lIoIooOO.I00000oIO(oi1O00I12, i1Oi1Oi0O, iloI0lOlll12, i4 & 126);
/* 644 */                               iloI0lOlll12.I0010I0i(false);
                                    } else if (iooo0ooiio instanceof I1Ol1OO10Oo) {
/* 656 */                               iloI0lOlll12.I00i01iIIliI(2048339171);
/* 663 */                               System.out.println((Object) "Unexpected raw text while traversing the Abstract Syntax Tree.");
/* 668 */                               StringBuilder sb = new StringBuilder(16);
/* 673 */                               new ArrayList();
/* 678 */                               ArrayList arrayList = new ArrayList();
/* 683 */                               new ArrayList();
/* 688 */                               LinkedHashMap linkedHashMap2 = new LinkedHashMap();
/* 695 */                               sb.append(((I1Ol1OO10Oo) iooo0ooiio).I00000oIO);
/* 701 */                               String string2 = sb.toString();
/* 711 */                               ArrayList arrayList2 = new ArrayList(arrayList.size());
/* 714 */                               int size = arrayList.size();
/* 719 */                               for (int i8 = 0; i8 < size; i8++) {
/* 735 */                                   arrayList2.add(((I111101Olo00) arrayList.get(i8)).I00000oIO(sb.length()));
                                        }
/* 743 */                               I1111OO10i i1111OO10i = new I1111OO10i(string2, arrayList2);
/* 746 */                               Map mapI000iOII2 = O1Oii0O0loo.I000iOII(linkedHashMap2);
/* 750 */                               Oi1Oi0 oi1Oi02 = new Oi1Oi0();
/* 753 */                               oi1Oi02.I00000oIO = i1111OO10i;
/* 755 */                               oi1Oi02.I00000oOI = mapI000iOII2;
/* 757 */                               VarHandle.storeStoreFence();
/* 771 */                               lOlOlI.I00000oIO(oi1O00I12, oi1Oi02, null, null, false, 0, 0, iloI0lOlll1, i4 & 14, 62);
/* 774 */                               iloI0lOlll12 = iloI0lOlll1;
/* 775 */                               iloI0lOlll12.I0010I0i(false);
                                    } else if (iooo0ooiio instanceof I1Oi0O1I) {
/* 787 */                               iloI0lOlll12.I00i01iIIliI(2048585621);
/* 790 */                               iloI0lOlll12.I0010I0i(false);
/* 797 */                               System.out.println((Object) "MarkdownRichText: Unexpected AstListItem while traversing the Abstract Syntax Tree.");
                                    } else if (iooo0ooiio instanceof I1OOiOlIl) {
/* 808 */                               iloI0lOlll12.I00i01iIIliI(2048729616);
/* 811 */                               iloI0lOlll12.I0010I0i(false);
/* 835 */                               System.out.println((Object) ("MarkdownRichText: Unexpected AstInlineNodeType " + iooo0ooiio + " while traversing the Abstract Syntax Tree."));
                                    } else if (!iooo0ooiio.equals(I1OioOI01OOi.I00000oIO) && !iooo0ooiio.equals(I1Ol0i1iiO.I00000oIO) && !iooo0ooiio.equals(I1Ol0o.I00000oIO) && !(iooo0ooiio instanceof I1Oioi)) {
/* 871 */                               iloI0lOlll12.I00i01iIIliI(2144217546);
/* 874 */                               iloI0lOlll12.I0010I0i(false);
/* 877 */                               I000II.I00000oIO();
/* 880 */                               return;
                                    } else {
/* 884 */                               iloI0lOlll12.I00i01iIIliI(2048963542);
/* 887 */                               iloI0lOlll12.I0010I0i(false);
/* 894 */                               System.out.println((Object) "MarkdownRichText: Unexpected Table node while traversing the Abstract Syntax Tree.");
                                    }
                                }
                            }
/* 276 */                   oi1O00I12 = oi1O00I1;
                        }
/* 897 */               iloI0lOlll12.I0010I0i(false);
/* 900 */               iloI0lOlll12.I0010I0i(false);
                    }
/* 903 */           OOloioIl oOloioIlI001IO0002 = iloI0lOlll12.I001IO000();
/* 907 */           if (oOloioIlI001IO0002 != null) {
/* 912 */               I1oiOo i1oiOo2 = new I1oiOo(2);
/* 915 */               i1oiOo2.I00iiI = oi1O00I12;
/* 917 */               i1oiOo2.I00iiO = i1Oi1Oi0O;
/* 919 */               i1oiOo2.I00iio = i;
/* 921 */               VarHandle.storeStoreFence();
/* 924 */               oOloioIlI001IO0002.I0000O = i1oiOo2;
                    }
                }

                public static final void I0000Il00O(Oi1O00I1 oi1O00I1, I1Oi1Oi0O i1Oi1Oi0O, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
/* 4 */             iloI0lOlll1.I00i0O(1194519785);
/* 9 */             if ((i & 6) == 0) {
/* 20 */                i2 = (iloI0lOlll1.I000II(oi1O00I1) ? 4 : 2) | i;
                    } else {
/* 22 */                i2 = i;
                    }
/* 25 */            if ((i & 48) == 0) {
/* 38 */                i2 |= iloI0lOlll1.I000II(i1Oi1Oi0O) ? 32 : 16;
                    }
/* 41 */            if ((i & 384) == 0) {
/* 64 */                i2 |= (i & Barcode.FORMAT_UPC_A) == 0 ? iloI0lOlll1.I000II(null) : iloI0lOlll1.I000OOo1O(null) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 69 */            if ((i2 & 147) == 146 && iloI0lOlll1.I00IO1()) {
/* 78 */                iloI0lOlll1.I00OilO00Il();
                    } else {
/* 87 */                Iterator it = lOo1ilOiIio1.I00000oIO(i1Oi1Oi0O, false).iterator();
/* 95 */                while (it.hasNext()) {
/* 105 */                   I00000oOI(oi1O00I1, (I1Oi1Oi0O) it.next(), iloI0lOlll1, i2 & 910);
                        }
                    }
/* 109 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 113 */           if (oOloioIlI001IO000 != null) {
/* 118 */               I1oiOo i1oiOo = new I1oiOo(3);
/* 121 */               i1oiOo.I00iiI = oi1O00I1;
/* 123 */               i1oiOo.I00iiO = i1Oi1Oi0O;
/* 125 */               i1oiOo.I00iio = i;
/* 127 */               VarHandle.storeStoreFence();
/* 130 */               oOloioIlI001IO000.I0000O = i1oiOo;
                    }
                }
            }

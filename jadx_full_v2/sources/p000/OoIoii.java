            package p000;

            import android.graphics.Path;
            import android.graphics.PointF;
            import android.util.Log;
            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            
            public final class OoIoii {
                public final int I00000oIO;
                public OoIoiillI1 I00000oOI;

                public OoIoii(int i) {
/* 1 */             this.I00000oIO = i;
                }

                /* JADX WARN: Can't wrap try/catch for region: R(11:230|(1:233)|(3:323|234|235)|(7:325|236|237|319|238|(1:240)|241)|246|(1:248)|321|249|(1:251)|252|(1:254)(5:255|(1:257)|258|(1:260)|261)) */
                /* JADX WARN: Code restructure failed: missing block: B:263:0x0817, code lost:
                
                    android.util.Log.w("PdfBox-Android", "invalid seac character in glyph " + r15 + " of font " + r2);
                 */
                /* JADX WARN: Removed duplicated region for block: B:248:0x07b4  */
                /* JADX WARN: Removed duplicated region for block: B:251:0x07bf A[Catch: IOException -> 0x0817, TryCatch #1 {IOException -> 0x0817, blocks: (B:249:0x07b5, B:251:0x07bf, B:252:0x07c2, B:254:0x07c6, B:255:0x07e4, B:258:0x0805, B:260:0x080b, B:261:0x080e), top: B:321:0x07b5 }] */
                /* JADX WARN: Removed duplicated region for block: B:254:0x07c6 A[Catch: IOException -> 0x0817, TryCatch #1 {IOException -> 0x0817, blocks: (B:249:0x07b5, B:251:0x07bf, B:252:0x07c2, B:254:0x07c6, B:255:0x07e4, B:258:0x0805, B:260:0x080b, B:261:0x080e), top: B:321:0x07b5 }] */
                /* JADX WARN: Removed duplicated region for block: B:255:0x07e4 A[Catch: IOException -> 0x0817, TryCatch #1 {IOException -> 0x0817, blocks: (B:249:0x07b5, B:251:0x07bf, B:252:0x07c2, B:254:0x07c6, B:255:0x07e4, B:258:0x0805, B:260:0x080b, B:261:0x080e), top: B:321:0x07b5 }] */
                /* JADX WARN: Removed duplicated region for block: B:313:0x0a2e  */
                /* JADX WARN: Removed duplicated region for block: B:329:0x0a39 A[SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void I00000oIO(List list) {
                    Iterator it;
                    Number number;
                    Number number2;
                    OoIoiillI1 ooIoiillI1I000l1;
                    Path path;
                    OoIoiillI1 ooIoiillI1I000l12;
                    ArrayList arrayList;
/* 1 */             OoIoii ooIoii = this;
/* 5 */             ArrayList arrayList2 = new ArrayList();
/* 8 */             Iterator it2 = list.iterator();
/* 16 */            while (it2.hasNext()) {
/* 18 */                Object next = it2.next();
/* 24 */                if (next instanceof IO1I000) {
/* 26 */                    IO1I000 io1i000 = (IO1I000) next;
/* 52 */                    it = it2;
/* 58 */                    ArrayList arrayList3 = null;
                            switch (ooIoii.I00000oIO) {
                                case 0:
/* 1146 */                          OoIoiillI1 ooIoiillI1 = ooIoii.I00000oOI;
/* 1148 */                          ArrayList arrayList4 = ooIoiillI1.I000OOo1O;
/* 1152 */                          PointF pointF = ooIoiillI1.I000II;
/* 1156 */                          String str = ooIoiillI1.I0000Il00O;
/* 1160 */                          String str2 = ooIoiillI1.I00000oOI;
                                    ooIoiillI1.I000iOII++;
/* 1190 */                          String str3 = (String) IO1I000.I00000oOI.get(io1i000.I00000oIO);
/* 1196 */                          if ("rmoveto".equals(str3)) {
/* 1203 */                              if (arrayList2.size() >= 2) {
/* 1207 */                                  if (ooIoiillI1.I000O01llI0) {
/* 1236 */                                      arrayList4.add(new PointF(((Number) arrayList2.get(0)).floatValue(), ((Number) arrayList2.get(1)).floatValue()));
                                            } else {
/* 1254 */                                      ooIoiillI1.I0000Il00O((Number) arrayList2.get(0), (Number) arrayList2.get(1));
                                            }
                                        }
                                    } else if ("vmoveto".equals(str3)) {
/* 1269 */                              if (!arrayList2.isEmpty()) {
/* 1273 */                                  if (ooIoiillI1.I000O01llI0) {
/* 1291 */                                      arrayList4.add(new PointF(0.0f, ((Number) arrayList2.get(0)).floatValue()));
                                            } else {
/* 1303 */                                      ooIoiillI1.I0000Il00O(0, (Number) arrayList2.get(0));
                                            }
                                        }
                                    } else if ("hmoveto".equals(str3)) {
/* 1318 */                              if (!arrayList2.isEmpty()) {
/* 1322 */                                  if (ooIoiillI1.I000O01llI0) {
/* 1340 */                                      arrayList4.add(new PointF(((Number) arrayList2.get(0)).floatValue(), 0.0f));
                                            } else {
/* 1352 */                                      ooIoiillI1.I0000Il00O((Number) arrayList2.get(0), 0);
                                            }
                                        }
                                    } else if ("rlineto".equals(str3)) {
/* 1369 */                              if (arrayList2.size() >= 2) {
/* 1384 */                                  ooIoiillI1.I00000oOI((Number) arrayList2.get(0), (Number) arrayList2.get(1));
                                        }
                                    } else if ("hlineto".equals(str3)) {
/* 1399 */                              if (!arrayList2.isEmpty()) {
/* 1407 */                                  ooIoiillI1.I00000oOI((Number) arrayList2.get(0), 0);
                                        }
                                    } else if ("vlineto".equals(str3)) {
/* 1422 */                              if (!arrayList2.isEmpty()) {
/* 1430 */                                  ooIoiillI1.I00000oOI(0, (Number) arrayList2.get(0));
                                        }
                                    } else if ("rrcurveto".equals(str3)) {
/* 1446 */                              if (arrayList2.size() >= 6) {
/* 1503 */                                  ooIoiillI1.I0000O((Number) arrayList2.get(0), (Number) arrayList2.get(1), (Number) arrayList2.get(2), (Number) arrayList2.get(3), (Number) arrayList2.get(4), (Number) arrayList2.get(5));
                                        }
                                    } else if ("closepath".equals(str3)) {
/* 1526 */                              if (ooIoiillI1.I0000O.isEmpty()) {
/* 1548 */                                  Log.w("PdfBox-Android", "closepath without initial moveTo in font " + str2 + ", glyph " + str);
                                        } else {
/* 1554 */                                  ooIoiillI1.I0000O.close();
                                        }
/* 1565 */                              ooIoiillI1.I0000O.moveTo(pointF.x, pointF.y);
                                    } else if ("sbw".equals(str3)) {
/* 1585 */                              if (arrayList2.size() >= 3) {
/* 1614 */                                  ooIoiillI1.I0001Ioi1lo = new PointF(((Number) arrayList2.get(0)).floatValue(), ((Number) arrayList2.get(1)).floatValue());
/* 1627 */                                  ooIoiillI1.I0000oI00 = ((Number) arrayList2.get(2)).intValue();
/* 1631 */                                  pointF.set(ooIoiillI1.I0001Ioi1lo);
                                        }
                                    } else if ("hsbw".equals(str3)) {
/* 1649 */                              if (arrayList2.size() >= 2) {
/* 1667 */                                  ooIoiillI1.I0001Ioi1lo = new PointF(((Number) arrayList2.get(0)).floatValue(), 0.0f);
/* 1680 */                                  ooIoiillI1.I0000oI00 = ((Number) arrayList2.get(1)).intValue();
/* 1684 */                                  pointF.set(ooIoiillI1.I0001Ioi1lo);
                                        }
                                    } else if ("vhcurveto".equals(str3)) {
/* 1702 */                              if (arrayList2.size() >= 4) {
/* 1746 */                                  ooIoiillI1.I0000O(0, (Number) arrayList2.get(0), (Number) arrayList2.get(1), (Number) arrayList2.get(2), (Number) arrayList2.get(3), 0);
                                        }
                                    } else if ("hvcurveto".equals(str3)) {
/* 1768 */                              if (arrayList2.size() >= 4) {
/* 1810 */                                  ooIoiillI1.I0000O((Number) arrayList2.get(0), 0, (Number) arrayList2.get(1), (Number) arrayList2.get(2), 0, (Number) arrayList2.get(3));
                                        }
                                    } else if ("seac".equals(str3)) {
/* 1830 */                              if (arrayList2.size() >= 5) {
/* 1837 */                                  Number number3 = (Number) arrayList2.get(0);
/* 1844 */                                  Number number4 = (Number) arrayList2.get(1);
/* 1851 */                                  Number number5 = (Number) arrayList2.get(2);
/* 1858 */                                  Number number6 = (Number) arrayList2.get(3);
/* 1865 */                                  Number number7 = (Number) arrayList2.get(4);
/* 1869 */                                  OoIoiillo ooIoiillo = ooIoiillI1.I00000oIO;
/* 1891 */                                  String str4 = (String) ((HashMap) OlIlI1ooOO.I0000O.I00000oIO).get(Integer.valueOf(number6.intValue()));
/* 1895 */                                  if (str4 == null) {
/* 1893 */                                      str4 = ".notdef";
                                            }
                                            try {
/* 1899 */                                      ooIoiillI1I000l12 = ooIoiillo.I000l1(str4);
/* 1903 */                                      number = number3;
                                            } catch (IOException unused) {
/* 1927 */                                      number = number3;
                                            }
                                            try {
/* 1905 */                                      Path path2 = ooIoiillI1.I0000O;
/* 1907 */                                      number2 = number4;
                                                try {
/* 1911 */                                          if (ooIoiillI1I000l12.I0000O == null) {
/* 1913 */                                              ooIoiillI1I000l12.I00000oIO();
                                                    }
/* 1920 */                                          path2.op(ooIoiillI1I000l12.I0000O, Path.Op.UNION);
                                                } catch (IOException unused2) {
/* 1948 */                                          Log.w("PdfBox-Android", "invalid seac character in glyph " + str + " of font " + str2);
/* 1969 */                                          String str5 = (String) ((HashMap) OlIlI1ooOO.I0000O.I00000oIO).get(Integer.valueOf(number7.intValue()));
/* 1893 */                                          if (str5 != null) {
                                                    }
/* 1974 */                                          ooIoiillI1I000l1 = ooIoiillo.I000l1(str);
/* 1978 */                                          path = ooIoiillI1.I0000O;
/* 1982 */                                          if (ooIoiillI1I000l1.I0000O == null) {
                                                    }
/* 1989 */                                          if (path == ooIoiillI1I000l1.I0000O) {
                                                    }
/* 1140 */                                          arrayList = arrayList3;
/* 2602 */                                          arrayList2.clear();
/* 2605 */                                          if (arrayList != null) {
                                                    }
/* 2618 */                                          ooIoii = this;
/* 2620 */                                          it2 = it;
                                                }
                                            } catch (IOException unused3) {
/* 1924 */                                      number2 = number4;
/* 1948 */                                      Log.w("PdfBox-Android", "invalid seac character in glyph " + str + " of font " + str2);
/* 1969 */                                      String str52 = (String) ((HashMap) OlIlI1ooOO.I0000O.I00000oIO).get(Integer.valueOf(number7.intValue()));
/* 1893 */                                      if (str52 != null) {
                                                }
/* 1974 */                                      ooIoiillI1I000l1 = ooIoiillo.I000l1(str);
/* 1978 */                                      path = ooIoiillI1.I0000O;
/* 1982 */                                      if (ooIoiillI1I000l1.I0000O == null) {
                                                }
/* 1989 */                                      if (path == ooIoiillI1I000l1.I0000O) {
                                                }
/* 1140 */                                      arrayList = arrayList3;
/* 2602 */                                      arrayList2.clear();
/* 2605 */                                      if (arrayList != null) {
                                                }
/* 2618 */                                      ooIoii = this;
/* 2620 */                                      it2 = it;
                                            }
/* 1969 */                                  String str522 = (String) ((HashMap) OlIlI1ooOO.I0000O.I00000oIO).get(Integer.valueOf(number7.intValue()));
/* 1893 */                                  String str6 = str522 != null ? str522 : ".notdef";
/* 1974 */                                  ooIoiillI1I000l1 = ooIoiillo.I000l1(str6);
/* 1978 */                                  path = ooIoiillI1.I0000O;
/* 1982 */                                  if (ooIoiillI1I000l1.I0000O == null) {
/* 1984 */                                      ooIoiillI1I000l1.I00000oIO();
                                            }
/* 1989 */                                  if (path == ooIoiillI1I000l1.I0000O) {
/* 2016 */                                      Log.w("PdfBox-Android", "Path for " + str4 + " and for accent " + str6 + " are same, ignored");
                                            } else {
/* 2034 */                                      double dFloatValue = (ooIoiillI1.I0001Ioi1lo.x + number2.floatValue()) - number.floatValue();
/* 2044 */                                      double dFloatValue2 = ooIoiillI1.I0001Ioi1lo.y + number5.floatValue();
/* 2050 */                                      if (dFloatValue == 0.0d) {
/* 2052 */                                          int i = (dFloatValue2 > 0.0d ? 1 : (dFloatValue2 == 0.0d ? 0 : -1));
                                                }
/* 2054 */                                      Path path3 = ooIoiillI1.I0000O;
/* 2058 */                                      if (ooIoiillI1I000l1.I0000O == null) {
/* 2060 */                                          ooIoiillI1I000l1.I00000oIO();
                                                }
/* 2067 */                                      path3.op(ooIoiillI1I000l1.I0000O, Path.Op.UNION);
                                            }
                                        }
                                    } else if ("setcurrentpoint".equals(str3)) {
/* 2108 */                              if (arrayList2.size() >= 2) {
/* 2132 */                                  pointF.set(((Number) arrayList2.get(0)).floatValue(), ((Number) arrayList2.get(1)).floatValue());
                                        }
                                    } else if ("callothersubr".equals(str3)) {
/* 2149 */                              if (!arrayList2.isEmpty()) {
/* 2158 */                                  int iIntValue = ((Number) arrayList2.get(0)).intValue();
/* 2162 */                                  if (iIntValue == 0) {
/* 2164 */                                      ooIoiillI1.I000O01llI0 = false;
/* 2171 */                                      if (arrayList4.size() < 7) {
/* 2177 */                                          StringBuilder sbI00111O = IIl001iO0Io.I00111O("flex without moveTo in font ", str2, ", glyph ", str, ", command ");
/* 2183 */                                          sbI00111O.append(ooIoiillI1.I000iOII);
/* 2190 */                                          Log.w("PdfBox-Android", sbI00111O.toString());
                                                } else {
/* 2199 */                                          PointF pointF2 = (PointF) arrayList4.get(0);
/* 2211 */                                          pointF2.set(pointF.x + pointF2.x, pointF.y + pointF2.y);
/* 2219 */                                          PointF pointF3 = (PointF) arrayList4.get(1);
/* 2231 */                                          pointF3.set(pointF2.x + pointF3.x, pointF2.y + pointF3.y);
/* 2244 */                                          pointF3.set(pointF3.x - pointF.x, pointF3.y - pointF.y);
/* 2252 */                                          PointF pointF4 = (PointF) arrayList4.get(1);
/* 2259 */                                          PointF pointF5 = (PointF) arrayList4.get(2);
/* 2266 */                                          PointF pointF6 = (PointF) arrayList4.get(3);
/* 2306 */                                          ooIoiillI1.I0000O(Float.valueOf(pointF4.x), Float.valueOf(pointF4.y), Float.valueOf(pointF5.x), Float.valueOf(pointF5.y), Float.valueOf(pointF6.x), Float.valueOf(pointF6.y));
/* 2314 */                                          PointF pointF7 = (PointF) arrayList4.get(4);
/* 2321 */                                          PointF pointF8 = (PointF) arrayList4.get(5);
/* 2328 */                                          PointF pointF9 = (PointF) arrayList4.get(6);
/* 2366 */                                          ooIoiillI1.I0000O(Float.valueOf(pointF7.x), Float.valueOf(pointF7.y), Float.valueOf(pointF8.x), Float.valueOf(pointF8.y), Float.valueOf(pointF9.x), Float.valueOf(pointF9.y));
/* 2369 */                                          arrayList4.clear();
                                                }
                                            } else if (iIntValue == 1) {
/* 2377 */                                      ooIoiillI1.I000O01llI0 = true;
                                            } else {
/* 2395 */                                      Log.w("PdfBox-Android", "Invalid callothersubr parameter: " + iIntValue);
                                            }
                                        }
                                    } else if ("div".equals(str3)) {
/* 2413 */                              if (arrayList2.size() >= 2) {
/* 2436 */                                  float fFloatValue = ((Number) IIl001iO0Io.I000OiO(2, arrayList2)).floatValue() / ((Number) IIl001iO0Io.I000OiO(1, arrayList2)).floatValue();
/* 2439 */                                  ArrayList arrayList5 = new ArrayList(arrayList2);
/* 2447 */                                  arrayList5.remove(arrayList5.size() - 1);
/* 2455 */                                  arrayList5.remove(arrayList5.size() - 1);
/* 2462 */                                  arrayList5.add(Float.valueOf(fFloatValue));
/* 2465 */                                  arrayList3 = arrayList5;
                                        }
                                    } else if (!"hstem".equals(str3) && !"vstem".equals(str3) && !"hstem3".equals(str3) && !"vstem3".equals(str3) && !"dotsection".equals(str3) && !"endchar".equals(str3)) {
/* 2527 */                              if ("return".equals(str3) || "callsubr".equals(str3)) {
/* 2586 */                                  StringBuilder sbI00111O2 = IIl001iO0Io.I00111O("Unexpected charstring command: ", str3, " in glyph ", str, " of font ");
/* 2590 */                                  sbI00111O2.append(str2);
/* 2597 */                                  Log.w("PdfBox-Android", sbI00111O2.toString());
                                        } else if (str3 == null) {
/* 2568 */                                  Log.w("PdfBox-Android", "Unknown charstring command: " + io1i000.I00000oIO + " in glyph " + str + " of font " + str2);
                                        } else {
/* 2579 */                                  I000II.I000iOII("Unhandled command: ".concat(str3));
                                        }
                                    }
                                    break;
                                default:
/* 71 */                            OoIolOO1 ooIolOO1 = (OoIolOO1) ooIoii.I00000oOI;
                                    ooIolOO1.I000iOII++;
/* 95 */                            String str7 = (String) IO1I000.I0000Il00O.get(io1i000.I00000oIO);
/* 101 */                           if ("hstem".equals(str7)) {
/* 116 */                               ooIolOO1.I000II(arrayList2, arrayList2.size() % 2 != 0);
                                        break;
                                    } else if ("vstem".equals(str7)) {
/* 140 */                               ooIolOO1.I000II(arrayList2, arrayList2.size() % 2 != 0);
                                        break;
                                    } else if ("vmoveto".equals(str7)) {
/* 163 */                               List listI000II = ooIolOO1.I000II(arrayList2, arrayList2.size() > 1);
/* 169 */                               if (ooIolOO1.I000o00OoI0I > 0) {
/* 171 */                                   ooIolOO1.I000O01llI0();
                                        }
                                        ooIolOO1.I000o00OoI0I++;
/* 179 */                               ooIolOO1.I0000oI00(listI000II, io1i000);
                                        break;
                                    } else if ("rlineto".equals(str7)) {
/* 198 */                               ooIolOO1.I0001Ioi1lo(OoIolOO1.I000l1(2, arrayList2), io1i000);
                                        break;
                                    } else if ("hlineto".equals(str7)) {
/* 209 */                               ooIolOO1.I000OiO(arrayList2, true);
                                        break;
                                    } else if ("vlineto".equals(str7)) {
/* 222 */                               ooIolOO1.I000OiO(arrayList2, false);
                                        break;
                                    } else if ("rrcurveto".equals(str7)) {
/* 238 */                               ooIolOO1.I0001Ioi1lo(OoIolOO1.I000l1(6, arrayList2), io1i000);
                                        break;
                                    } else if ("endchar".equals(str7)) {
/* 269 */                               List listI000II2 = ooIolOO1.I000II(arrayList2, arrayList2.size() == 5 || arrayList2.size() == 1);
/* 273 */                               ooIolOO1.I000O01llI0();
/* 281 */                               if (listI000II2.size() == 4) {
/* 284 */                                   listI000II2.add(0, 0);
/* 293 */                                   ooIolOO1.I0000oI00(listI000II2, new IO1I000(12, 6));
                                            break;
                                        } else {
/* 298 */                                   ooIolOO1.I0000oI00(listI000II2, io1i000);
                                            break;
                                        }
                                    } else if ("rmoveto".equals(str7)) {
/* 319 */                               List listI000II3 = ooIolOO1.I000II(arrayList2, arrayList2.size() > 2);
/* 325 */                               if (ooIolOO1.I000o00OoI0I > 0) {
/* 327 */                                   ooIolOO1.I000O01llI0();
                                        }
                                        ooIolOO1.I000o00OoI0I++;
/* 336 */                               ooIolOO1.I0000oI00(listI000II3, io1i000);
                                        break;
                                    } else if ("hmoveto".equals(str7)) {
/* 357 */                               List listI000II4 = ooIolOO1.I000II(arrayList2, arrayList2.size() > 1);
/* 363 */                               if (ooIolOO1.I000o00OoI0I > 0) {
/* 365 */                                   ooIolOO1.I000O01llI0();
                                        }
                                        ooIolOO1.I000o00OoI0I++;
/* 373 */                               ooIolOO1.I0000oI00(listI000II4, io1i000);
                                        break;
                                    } else if ("vhcurveto".equals(str7)) {
/* 387 */                               ooIolOO1.I000OOo1O(arrayList2, false);
                                        break;
                                    } else if ("hvcurveto".equals(str7)) {
/* 400 */                               ooIolOO1.I000OOo1O(arrayList2, true);
                                        break;
                                    } else if ("hflex".equals(str7)) {
/* 420 */                               if (arrayList2.size() >= 7) {
/* 546 */                                   ooIolOO1.I0001Ioi1lo(Arrays.asList(Arrays.asList((Number) arrayList2.get(0), 0, (Number) arrayList2.get(1), (Number) arrayList2.get(2), (Number) arrayList2.get(3), 0), Arrays.asList((Number) arrayList2.get(4), 0, (Number) arrayList2.get(5), Float.valueOf(-((Number) arrayList2.get(2)).floatValue()), (Number) arrayList2.get(6), 0)), new IO1I000(8));
                                            break;
                                        }
                                    } else if ("flex".equals(str7)) {
/* 587 */                               ooIolOO1.I0001Ioi1lo(Arrays.asList(arrayList2.subList(0, 6), arrayList2.subList(6, 12)), new IO1I000(8));
                                        break;
                                    } else if ("hflex1".equals(str7)) {
/* 606 */                               if (arrayList2.size() >= 9) {
/* 732 */                                   ooIolOO1.I0001Ioi1lo(Arrays.asList(Arrays.asList((Number) arrayList2.get(0), (Number) arrayList2.get(1), (Number) arrayList2.get(2), (Number) arrayList2.get(3), (Number) arrayList2.get(4), 0), Arrays.asList((Number) arrayList2.get(5), 0, (Number) arrayList2.get(6), (Number) arrayList2.get(7), (Number) arrayList2.get(8), 0)), new IO1I000(8));
                                            break;
                                        }
                                    } else if ("flex1".equals(str7)) {
/* 746 */                               int iIntValue2 = 0;
/* 747 */                               int iIntValue3 = 0;
/* 749 */                               for (int i2 = 0; i2 < 5; i2++) {
/* 751 */                                   int i3 = i2 * 2;
/* 763 */                                   iIntValue2 += ((Number) arrayList2.get(i3)).intValue();
/* 778 */                                   iIntValue3 += ((Number) arrayList2.get(i3 + 1)).intValue();
                                        }
/* 894 */                               ooIolOO1.I0001Ioi1lo(Arrays.asList(arrayList2.subList(0, 6), Arrays.asList((Number) arrayList2.get(6), (Number) arrayList2.get(7), (Number) arrayList2.get(8), (Number) arrayList2.get(9), Math.abs(iIntValue2) > Math.abs(iIntValue3) ? (Number) arrayList2.get(10) : Integer.valueOf(-iIntValue2), Math.abs(iIntValue2) > Math.abs(iIntValue3) ? Integer.valueOf(-iIntValue3) : (Number) arrayList2.get(10))), new IO1I000(8));
                                        break;
                                    } else if ("hstemhm".equals(str7)) {
/* 920 */                               ooIolOO1.I000II(arrayList2, arrayList2.size() % 2 != 0);
                                        break;
                                    } else if (!"hintmask".equals(str7) && !"cntrmask".equals(str7)) {
/* 949 */                               if ("vstemhm".equals(str7)) {
/* 962 */                                   ooIolOO1.I000II(arrayList2, arrayList2.size() % 2 != 0);
                                            break;
                                        } else if ("rcurveline".equals(str7)) {
/* 980 */                                   if (arrayList2.size() >= 2) {
/* 1002 */                                      ooIolOO1.I0001Ioi1lo(OoIolOO1.I000l1(6, arrayList2.subList(0, arrayList2.size() - 2)), new IO1I000(8));
/* 1024 */                                      ooIolOO1.I0000oI00(arrayList2.subList(arrayList2.size() - 2, arrayList2.size()), new IO1I000(5));
                                                break;
                                            }
                                        } else if ("rlinecurve".equals(str7)) {
/* 1042 */                                  if (arrayList2.size() >= 6) {
/* 1065 */                                      ooIolOO1.I0001Ioi1lo(OoIolOO1.I000l1(2, arrayList2.subList(0, arrayList2.size() - 6)), new IO1I000(5));
/* 1086 */                                      ooIolOO1.I0000oI00(arrayList2.subList(arrayList2.size() - 6, arrayList2.size()), new IO1I000(8));
                                                break;
                                            }
                                        } else if ("vvcurveto".equals(str7)) {
/* 1099 */                                  ooIolOO1.I000iOII(arrayList2, false);
                                            break;
                                        } else if ("hhcurveto".equals(str7)) {
/* 1112 */                                  ooIolOO1.I000iOII(arrayList2, true);
                                            break;
                                        } else {
/* 1116 */                                  ooIolOO1.I0000oI00(arrayList2, io1i000);
                                            break;
                                        }
                                    } else {
/* 1137 */                              ooIolOO1.I000II(arrayList2, arrayList2.size() % 2 != 0).isEmpty();
                                        break;
                                    }
                                    break;
                            }
/* 1140 */                  arrayList = arrayList3;
/* 2602 */                  arrayList2.clear();
/* 2605 */                  if (arrayList != null) {
/* 2607 */                      arrayList2.addAll(arrayList);
                            }
                        } else {
/* 2611 */                  it = it2;
/* 2615 */                  arrayList2.add((Number) next);
                        }
/* 2618 */              ooIoii = this;
/* 2620 */              it2 = it;
                    }
                }
            }

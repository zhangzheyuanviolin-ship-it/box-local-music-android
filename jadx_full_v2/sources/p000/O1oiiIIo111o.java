            package p000;

            import android.graphics.drawable.Drawable;
            import com.google.ai.edge.gallery.data.ModelDownloadStatusType;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function3;
            
            public final class O1oiiIIo111o implements IlliIl1l11O {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;

                public O1oiiIIo111o(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r12v4, types: [IOlioIoOO1, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r12v5 */
                /* JADX WARN: Type inference failed for: r3v59, types: [IloI0lOlll1] */
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    CharSequence charSequenceSubSequence;
/* 3 */             int i = this.I00iOIl;
/* 5 */             IOO0o0I1l iOO0o0I1l = IOl11li.I00000oIO;
/* 11 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 1329 */                  ((IlliIl1l11O) this.I00iiI).invoke((O1oIOiI11o0) this.I00iiO, new O1oIo0iI00(ModelDownloadStatusType.IN_PROGRESS, ((Long) obj2).longValue(), ((Long) obj).longValue(), null, 0L, 0L, 56));
/* 1332 */                  return ooiIlOl1iI;
                        case 1:
/* 1280 */                  ((Integer) obj2).getClass();
/* 1287 */                  l1iIi10.I00000oOI((OiIii0) this.I00iiI, (IOii1l) this.I00iiO, (IloI0lOlll1) obj, lIill1iOoIO.I00000oIO(1));
/* 1290 */                  return ooiIlOl1iI;
                        case 2:
/* 1215 */                  OIIlIII0Ili oIIlIII0Ili = (OIIlIII0Ili) this.I00iiI;
/* 1219 */                  OIIl1io oIIl1io = (OIIl1io) this.I00iiO;
/* 1223 */                  IIolOo iIolOo = (IIolOo) obj;
/* 1227 */                  Io10IOI io10IOI = (Io10IOI) obj2;
/* 1229 */                  O0iiOioolIi o0iiOioolIi = oIIlIII0Ili.I00oO101o;
/* 1235 */                  if (o0iiOioolIi.I00Io1o110i()) {
/* 1237 */                      oIIlIII0Ili.I010lI0oi = iIolOo;
/* 1239 */                      oIIlIII0Ili.I010l1ol111 = io10IOI;
/* 1255 */                      ((I0lio1O01i01) O0iillo1ol0.I00000oIO(o0iiOioolIi)).getSnapshotObserver().I00000oIO.I0000oI00(oIIlIII0Ili, OIIlIII0Ili.I0111i, oIIl1io);
/* 1258 */                      oIIlIII0Ili.I01101IOlO = false;
                            } else {
/* 1261 */                      oIIlIII0Ili.I01101IOlO = true;
                            }
/* 1263 */                  return ooiIlOl1iI;
                        case 3:
/* 1177 */                  OOo0lO oOo0lO = (OOo0lO) this.I00iiI;
/* 1181 */                  O0o0101i o0o0101i = (O0o0101i) this.I00iiO;
/* 1187 */                  float fFloatValue = ((Float) obj).floatValue();
/* 1195 */                  ((Float) obj2).getClass();
                            oOo0lO.I00iOIl += o0o0101i.I00000oOI.I00000oIO(fFloatValue - oOo0lO.I00iOIl);
/* 1212 */                  return ooiIlOl1iI;
                        case 4:
/* 1150 */                  Ii0l0Olio10 ii0l0Olio10 = (Ii0l0Olio10) this.I00iiI;
/* 1154 */                  OOl1OlI0 oOl1OlI0 = (OOl1OlI0) this.I00iiO;
/* 1164 */                  ((Integer) obj2).getClass();
/* 1171 */                  iO0iil1loOI0.I000O01llI0(lIill1iOoIO.I00000oIO(1), ii0l0Olio10, (IloI0lOlll1) obj, oOl1OlI0);
/* 1174 */                  return ooiIlOl1iI;
                        case 5:
/* 1137 */                  ((Integer) obj2).getClass();
/* 1144 */                  iO0iil1loOI0.I0000Il00O((OOl0llI) this.I00iiI, (IllOOo00lI) this.I00iiO, (IloI0lOlll1) obj, lIill1iOoIO.I00000oIO(1));
/* 1147 */                  return ooiIlOl1iI;
                        case 6:
/* 976 */                   String str = (String) this.I00iiI;
/* 980 */                   Oi10ooi oi10ooi = (Oi10ooi) this.I00iiO;
/* 984 */                   IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj;
/* 990 */                   int iIntValue = ((Integer) obj2).intValue();
/* 1006 */                  if (iloI0lOlll1.I00OIl(iIntValue & 1, (iIntValue & 3) != 2)) {
/* 1012 */                      String strI00OIl = OlOoOIi0o.I00OIl(40, oi10ooi.I00000oIO);
                                int length = strI00OIl.length() - 1;
/* 1022 */                      if (length >= 0) {
                                    while (true) {
                                        int i2 = length - 1;
/* 1034 */                              if (!iOlI1lIi0.I0000Il00O(strI00OIl.charAt(length))) {
/* 1037 */                                  charSequenceSubSequence = strI00OIl.subSequence(0, length + 1);
                                        } else if (i2 >= 0) {
/* 1045 */                                  length = i2;
                                        }
                                    }
/* 1047 */                          charSequenceSubSequence = "";
/* 1111 */                          Oo0i1oIIoOO.I00000oOI(IIl001iO0Io.I000oI1ioi(str, " · ", charSequenceSubSequence.toString(), "…"), null, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(O1OoilIO.I00000oOI)).I00000oOI.I000oI1ioi, iloI0lOlll1, 0, 24960, 110590);
                                } else {
/* 1047 */                          charSequenceSubSequence = "";
/* 1111 */                          Oo0i1oIIoOO.I00000oOI(IIl001iO0Io.I000oI1ioi(str, " · ", charSequenceSubSequence.toString(), "…"), null, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(O1OoilIO.I00000oOI)).I00000oOI.I000oI1ioi, iloI0lOlll1, 0, 24960, 110590);
                                }
                            } else {
/* 1117 */                      iloI0lOlll1.I00OilO00Il();
                            }
/* 1120 */                  return ooiIlOl1iI;
                        case 7:
/* 893 */                   OOl1OlI0 oOl1OlI02 = (OOl1OlI0) this.I00iiI;
/* 897 */                   OI10i0Il oI10i0Il = (OI10i0Il) this.I00iiO;
/* 901 */                   IloI0lOlll1 iloI0lOlll12 = (IloI0lOlll1) obj;
/* 907 */                   int iIntValue2 = ((Integer) obj2).intValue();
/* 921 */                   if (iloI0lOlll12.I00OIl(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
/* 923 */                       boolean zI000OOo1O = iloI0lOlll12.I000OOo1O(oOl1OlI02);
/* 927 */                       Object objI00O0i0ii = iloI0lOlll12.I00O0i0ii();
                                Object obj3 = objI00O0i0ii;
/* 931 */                       if (zI000OOo1O || objI00O0i0ii == iOO0o0I1l) {
/* 939 */                           O1l110o o1l110o = new O1l110o(12);
/* 942 */                           o1l110o.I00iiI = oOl1OlI02;
/* 944 */                           o1l110o.I00iiO = oI10i0Il;
/* 946 */                           VarHandle.storeStoreFence();
/* 949 */                           iloI0lOlll12.I00iio(o1l110o);
                                    obj3 = o1l110o;
                                }
/* 966 */                       iOiO0o0oi.I0000O((IllOOo00lI) obj3, null, false, null, null, null, i1oIli1o0ilo.I00000oOI, iloI0lOlll12, 805306368, 510);
                            } else {
/* 970 */                       iloI0lOlll12.I00OilO00Il();
                            }
/* 973 */                   return ooiIlOl1iI;
                        case 8:
/* 880 */                   ((Integer) obj2).getClass();
/* 887 */                   ((I1iO1OOoOiOO) this.I00iiI).I00000oIO(this.I00iiO, (IloI0lOlll1) obj, lIill1iOoIO.I00000oIO(1));
/* 890 */                   return ooiIlOl1iI;
                        case 9:
/* 853 */                   ((Integer) obj2).getClass();
/* 862 */                   Oi1i0Oi.I00000oIO((Oi1Oo0Il0) this.I00iiI, (IOii1l) this.I00iiO, (IloI0lOlll1) obj, lIill1iOoIO.I00000oIO(385));
/* 865 */                   return ooiIlOl1iI;
                        case 10:
/* 794 */                   IOii1l iOii1l = (IOii1l) this.I00iiI;
/* 798 */                   OiO0illOoOI oiO0illOoOI = (OiO0illOoOI) this.I00iiO;
/* 802 */                   IloI0lOlll1 iloI0lOlll13 = (IloI0lOlll1) obj;
/* 808 */                   int iIntValue3 = ((Integer) obj2).intValue();
/* 823 */                   if (iloI0lOlll13.I00OIl(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
/* 829 */                       iOii1l.invoke(oiO0illOoOI, iloI0lOlll13, 6);
                            } else {
/* 833 */                       iloI0lOlll13.I00OilO00Il();
                            }
/* 836 */                   return ooiIlOl1iI;
                        case 11:
/* 760 */                   OOo0lO oOo0lO2 = (OOo0lO) this.I00iiI;
/* 764 */                   OiOiliiO oiOiliiO = (OiOiliiO) this.I00iiO;
/* 770 */                   float fFloatValue2 = ((Float) obj).floatValue();
/* 778 */                   ((Float) obj2).getClass();
/* 781 */                   float f = oOo0lO2.I00iOIl;
/* 789 */                   oOo0lO2.I00iOIl = oiOiliiO.I00000oIO(fFloatValue2 - f) + f;
/* 791 */                   return ooiIlOl1iI;
                        case 12:
/* 713 */                   IoiOolO1iOo ioiOolO1iOo = (IoiOolO1iOo) this.I00iiI;
/* 718 */                   String str2 = (String) this.I00iiO;
/* 722 */                   IloI0lOlll1 iloI0lOlll14 = (IloI0lOlll1) obj;
/* 728 */                   int iIntValue4 = ((Integer) obj2).intValue();
/* 742 */                   if (iloI0lOlll14.I00OIl(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
/* 750 */                       IoOoiI1II00i.I00000oIO(ioiOolO1iOo, str2, null, 0L, iloI0lOlll14, 0, 12);
                            } else {
/* 754 */                       iloI0lOlll14.I00OilO00Il();
                            }
/* 757 */                   return ooiIlOl1iI;
                        case 13:
/* 699 */                   ((Integer) obj2).getClass();
/* 706 */                   iO0oI1oIoli0.I00000oOI((O1ol100o0O) this.I00iiI, (OilIlo) this.I00iiO, (IloI0lOlll1) obj, lIill1iOoIO.I00000oIO(1));
/* 709 */                   return ooiIlOl1iI;
                        case 14:
/* 672 */                   ((Integer) obj2).getClass();
/* 679 */                   ((I1iO1OOoOiOO) this.I00iiI).I00000oIO(this.I00iiO, (IloI0lOlll1) obj, lIill1iOoIO.I00000oIO(1));
/* 682 */                   return ooiIlOl1iI;
                        case 15:
/* 647 */                   ((Integer) obj2).getClass();
/* 654 */                   lOIOlliO10l.I00000oIO((OOOIIIIl) this.I00iiI, (Function1) this.I00iiO, (IloI0lOlll1) obj, lIill1iOoIO.I00000oIO(1));
/* 657 */                   return ooiIlOl1iI;
                        case 16:
/* 619 */                   ((Integer) obj2).getClass();
/* 627 */                   Ol0lllilO0Ol.I00000oIO((IllOOo00lI) this.I00iiI, (Function1) this.I00iiO, (IloI0lOlll1) obj, lIill1iOoIO.I00000oIO(7));
/* 630 */                   return ooiIlOl1iI;
                        case 17:
/* 459 */                   List list = (List) this.I00iiI;
/* 463 */                   OIooi1iOiOol oIooi1iOiOol = (OIooi1iOiOol) this.I00iiO;
/* 467 */                   ?? r3 = (IloI0lOlll1) obj;
/* 473 */                   int iIntValue5 = ((Integer) obj2).intValue();
/* 489 */                   if (r3.I00OIl(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
/* 497 */                       int i3 = 0;
/* 502 */                       for (Object obj4 : list) {
/* 508 */                           int i4 = i3 + 1;
/* 510 */                           if (i3 < 0) {
/* 592 */                               IOOi1I.I000lI();
/* 596 */                               throw null;
                                    }
/* 512 */                           String str3 = (String) obj4;
/* 522 */                           boolean z = oIooi1iOiOol.I000II() == i3;
/* 523 */                           boolean zI0000oI00 = r3.I0000oI00(i3);
/* 527 */                           ?? I00O0i0ii = r3.I00O0i0ii();
/* 531 */                           if (zI0000oI00 || I00O0i0ii == iOO0o0I1l) {
/* 537 */                               I00O0i0ii = new IOlioIoOO1(2);
/* 540 */                               I00O0i0ii.I00iiI = i3;
/* 542 */                               I00O0i0ii.I00iiO = oIooi1iOiOol;
/* 544 */                               VarHandle.storeStoreFence();
/* 547 */                               r3.I00iio(I00O0i0ii);
                                    }
/* 556 */                           I0Iooi0i1l0l i0Iooi0i1l0l = new I0Iooi0i1l0l(17);
/* 559 */                           i0Iooi0i1l0l.I00iiI = str3;
/* 561 */                           VarHandle.storeStoreFence();
/* 586 */                           lOiOoOi.I00000oOI(z, (IllOOo00lI) I00O0i0ii, null, false, iiioOl1O.I00000oOI(616743318, i0Iooi0i1l0l, r3), 0L, 0L, r3, 24576, 492);
/* 589 */                           i3 = i4;
                                }
                            } else {
/* 599 */                       r3.I00OilO00Il();
                            }
/* 602 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_PINKY:
/* 364 */                   Ol1OiolO0 ol1OiolO0 = (Ol1OiolO0) this.I00iiI;
/* 368 */                   String str4 = (String) this.I00iiO;
/* 372 */                   IloI0lOlll1 iloI0lOlll15 = (IloI0lOlll1) obj;
/* 378 */                   int iIntValue6 = ((Integer) obj2).intValue();
/* 392 */                   if (iloI0lOlll15.I00OIl(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
/* 394 */                       boolean zI000II = iloI0lOlll15.I000II(ol1OiolO0);
/* 398 */                       Object objI00O0i0ii2 = iloI0lOlll15.I00O0i0ii();
                                Object obj5 = objI00O0i0ii2;
/* 402 */                       if (zI000II || objI00O0i0ii2 == iOO0o0I1l) {
/* 408 */                           Ol1OOi0o ol1OOi0o = new Ol1OOi0o(1);
/* 411 */                           ol1OOi0o.I00iiI = ol1OiolO0;
/* 413 */                           VarHandle.storeStoreFence();
/* 416 */                           iloI0lOlll15.I00iio(ol1OOi0o);
                                    obj5 = ol1OOi0o;
                                }
/* 426 */                       I0Iooi0i1l0l i0Iooi0i1l0l2 = new I0Iooi0i1l0l(18);
/* 429 */                       i0Iooi0i1l0l2.I00iiI = str4;
/* 431 */                       VarHandle.storeStoreFence();
/* 449 */                       iIo1101O.I00000oIO((IllOOo00lI) obj5, null, false, null, null, iiioOl1O.I00000oOI(1306131274, i0Iooi0i1l0l2, iloI0lOlll15), iloI0lOlll15, 1572864, 62);
                            } else {
/* 453 */                       iloI0lOlll15.I00OilO00Il();
                            }
/* 456 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_INDEX:
/* 351 */                   ((Integer) obj2).getClass();
/* 358 */                   ((I1iO1OOoOiOO) this.I00iiI).I00000oIO(this.I00iiO, (IloI0lOlll1) obj, lIill1iOoIO.I00000oIO(1));
/* 361 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_INDEX:
/* 326 */                   ((Integer) obj2).getClass();
/* 333 */                   iO10II1oIll0.I00000oIO((O1ol100o0O) this.I00iiI, (OlI1IliO0I) this.I00iiO, (IloI0lOlll1) obj, lIill1iOoIO.I00000oIO(1));
/* 336 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_THUMB:
/* 299 */                   ((Integer) obj2).getClass();
/* 306 */                   ((I1iO1OOoOiOO) this.I00iiI).I00000oIO(this.I00iiO, (IloI0lOlll1) obj, lIill1iOoIO.I00000oIO(1));
/* 309 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_THUMB:
/* 274 */                   ((Integer) obj2).getClass();
/* 281 */                   iO10OIiI0i.I00000oIO((O1ol100o0O) this.I00iiI, (OlI1i0) this.I00iiO, (IloI0lOlll1) obj, lIill1iOoIO.I00000oIO(1));
/* 284 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_HIP:
/* 247 */                   ((Integer) obj2).getClass();
/* 254 */                   ((I1iO1OOoOiOO) this.I00iiI).I00000oIO(this.I00iiO, (IloI0lOlll1) obj, lIill1iOoIO.I00000oIO(1));
/* 257 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_HIP:
/* 222 */                   ((Integer) obj2).getClass();
/* 229 */                   iO11I0o0i.I00000oIO((O1ol100o0O) this.I00iiI, (Oliii00iliIi) this.I00iiO, (IloI0lOlll1) obj, lIill1iOoIO.I00000oIO(1));
/* 232 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_KNEE:
/* 195 */                   ((Integer) obj2).getClass();
/* 202 */                   ((I1iO1OOoOiOO) this.I00iiI).I00000oIO(this.I00iiO, (IloI0lOlll1) obj, lIill1iOoIO.I00000oIO(1));
/* 205 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_KNEE:
/* 138 */                   Function3 function3 = (Function3) this.I00iiI;
/* 142 */                   Olllo10O olllo10O = (Olllo10O) this.I00iiO;
/* 146 */                   IloI0lOlll1 iloI0lOlll16 = (IloI0lOlll1) obj;
/* 152 */                   int iIntValue7 = ((Integer) obj2).intValue();
/* 167 */                   if (iloI0lOlll16.I00OIl(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
/* 173 */                       function3.invoke(olllo10O, iloI0lOlll16, 6);
                            } else {
/* 177 */                       iloI0lOlll16.I00OilO00Il();
                            }
/* 180 */                   return ooiIlOl1iI;
                        case 27:
/* 92 */                    Function3 function32 = (Function3) this.I00iiI;
/* 96 */                    ArrayList arrayList = (ArrayList) this.I00iiO;
/* 100 */                   IloI0lOlll1 iloI0lOlll17 = (IloI0lOlll1) obj;
/* 106 */                   int iIntValue8 = ((Integer) obj2).intValue();
/* 122 */                   if (iloI0lOlll17.I00OIl(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
/* 128 */                       function32.invoke(arrayList, iloI0lOlll17, 0);
                            } else {
/* 132 */                       iloI0lOlll17.I00OilO00Il();
                            }
/* 135 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_ANKLE:
/* 47 */                    Function3 function33 = (Function3) this.I00iiI;
/* 51 */                    Ollo10o1IO ollo10o1IO = (Ollo10o1IO) this.I00iiO;
/* 55 */                    IloI0lOlll1 iloI0lOlll18 = (IloI0lOlll1) obj;
/* 61 */                    int iIntValue9 = ((Integer) obj2).intValue();
/* 76 */                    if (iloI0lOlll18.I00OIl(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
/* 82 */                        function33.invoke(ollo10o1IO, iloI0lOlll18, 6);
                            } else {
/* 86 */                        iloI0lOlll18.I00OilO00Il();
                            }
/* 89 */                    return ooiIlOl1iI;
                        default:
/* 32 */                    ((Integer) obj2).getClass();
/* 41 */                    ((iOl0lOIi11) this.I00iiI).I000II((Drawable) this.I00iiO, (IloI0lOlll1) obj, lIill1iOoIO.I00000oIO(49));
/* 44 */                    return ooiIlOl1iI;
                    }
                }
            }

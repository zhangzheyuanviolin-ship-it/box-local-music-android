            package p000;

            import com.google.ai.edge.gallery.data.ModelDownloadStatusType;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            
            public abstract class l1Oo00Olio {
                public static final void I00000oIO(O1oIOiI11o0 o1oIOiI11o0, OloIl1l1oOii oloIl1l1oOii, O1ol100o0O o1ol100o0O, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
                    int i3;
                    boolean z;
                    int i4;
                    String str;
                    String str2;
                    String strI00IlilI0i0i;
/* 1 */             O1oIOiI11o0 o1oIOiI11o02 = o1oIOiI11o0;
/* 5 */             IloI0lOlll1 iloI0lOlll12 = iloI0lOlll1;
/* 7 */             IOioOOi0I iOioOOi0I = lolOiIoiillI.I00ilI0I1;
/* 9 */             IOioOOi0I iOioOOi0I2 = lolOiIoiillI.I00ioIO;
/* 11 */            IOioOOi0I iOioOOi0I3 = lolOiIoiillI.I00ilO0;
/* 13 */            IOioOOi0I iOioOOi0I4 = lolOiIoiillI.I00io1l;
/* 18 */            iloI0lOlll12.I00i0O(-432898476);
/* 43 */            int i5 = i | (iloI0lOlll12.I000OOo1O(o1oIOiI11o02) ? 4 : 2) | (iloI0lOlll12.I000OOo1O(o1ol100o0O) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF);
/* 60 */            if (iloI0lOlll12.I00OIl(i5 & 1, (i5 & 131) != 130)) {
/* 64 */                OI10i0Il oI10i0IlI00000oOI = lOIoiooI1i01.I00000oOI(o1ol100o0O.I000OOo1O, iloI0lOlll12);
/* 68 */                Object objI00O0i0ii = iloI0lOlll12.I00O0i0ii();
/* 74 */                if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 78 */                    O1oO0l o1oO0l = new O1oO0l(0);
/* 81 */                    o1oO0l.I00iiI = o1oIOiI11o02;
/* 83 */                    o1oO0l.I00iiO = oI10i0IlI00000oOI;
/* 85 */                    VarHandle.storeStoreFence();
/* 88 */                    objI00O0i0ii = Ol1llolil.I00000oOI(o1oO0l);
/* 92 */                    iloI0lOlll12.I00iio(objI00O0i0ii);
                        }
/* 95 */                OlO01l1oOil olO01l1oOil = (OlO01l1oOil) objI00O0i0ii;
/* 101 */               O1oIo0iI00 o1oIo0iI00 = (O1oIo0iI00) olO01l1oOil.getValue();
/* 116 */               boolean z2 = (o1oIo0iI00 != null ? o1oIo0iI00.I00000oIO : null) == ModelDownloadStatusType.IN_PROGRESS;
/* 121 */               O1oIo0iI00 o1oIo0iI002 = (O1oIo0iI00) olO01l1oOil.getValue();
/* 133 */               boolean z3 = (o1oIo0iI002 != null ? o1oIo0iI002.I00000oIO : null) == ModelDownloadStatusType.PARTIALLY_DOWNLOADED;
/* 138 */               O1oIo0iI00 o1oIo0iI003 = (O1oIo0iI00) olO01l1oOil.getValue();
/* 140 */               O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 142 */               Iloi111 iloi111 = O0iiOioolIi.I01101IOlO;
/* 146 */               if (o1oIo0iI003 == null) {
/* 298 */                   i3 = 1;
                        } else if (o1oIo0iI003.I00000oIO == ModelDownloadStatusType.FAILED) {
/* 157 */                   iloI0lOlll12.I00i01iIIliI(1308968848);
/* 164 */                   OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO = OiI1iOo.I00000oIO(I1IiooiI1IlO.I00000oIO, i1O01oOIoI0I.I00lli11, iloI0lOlll12, 48);
/* 170 */                   int iHashCode = Long.hashCode(iloI0lOlll12.I00OI1);
/* 174 */                   OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll12.I000lI();
/* 178 */                   O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll12, o1ooIo101ll);
/* 184 */                   IOl0oi0lOl1.I000lI.getClass();
/* 187 */                   iloI0lOlll12.I00i0oil();
/* 192 */                   if (iloI0lOlll12.I00O10llo) {
/* 194 */                       iloI0lOlll12.I000l1(iloi111);
                            } else {
/* 198 */                       iloI0lOlll12.I00io1l();
                            }
/* 201 */                   li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll12, oiI1iiIl1Oi0I00000oIO);
/* 204 */                   li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll12, oO0lO0l0I000lI);
/* 207 */                   IIl001iO0Io.I001IIilI0O(iHashCode, iloI0lOlll12, iOioOOi0I2, iloI0lOlll12);
/* 210 */                   li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll12, o1ooiI111iI0000Il00O);
/* 277 */                   i2 = 1;
/* 280 */                   Oo0i1oIIoOO.I00000oOI(o1oIo0iI003.I0000O, null, ((O1OoiOIi1ooi) iloI0lOlll12.I000iOII(O1OoilIO.I00000oOI)).I00000oIO.I001i1O0Ol, null, 0L, null, null, null, 0L, null, 0L, 2, false, 0, 0, null, OoOOIOo00OoI.I00100l0, iloI0lOlll1, 0, 12583296, 126970);
/* 283 */                   iloI0lOlll12 = iloI0lOlll1;
/* 285 */                   iloI0lOlll12.I0010I0i(true);
/* 288 */                   iloI0lOlll12.I0010I0i(false);
/* 291 */                   o1oIOiI11o02 = o1oIOiI11o0;
                        } else {
/* 295 */                   i3 = 1;
                        }
/* 303 */               iloI0lOlll12.I00i01iIIliI(1309303307);
/* 306 */               II0IlloOiO0i iI0IlloOiO0i = i1O01oOIoI0I.I00o0l1o1o0;
/* 322 */               O1ooiI111i o1ooiI111iI000OiO = iO01II.I000OiO(o1ooIo101ll, 0.0f, 32.0f, 0.0f, 0.0f, 13);
/* 328 */               IOOlo1O01O iOOlo1O01OI00000oIO = IOOlio0Io0.I00000oIO(I1IiooiI1IlO.I0000Il00O, iI0IlloOiO0i, iloI0lOlll12, 48);
/* 334 */               int iHashCode2 = Long.hashCode(iloI0lOlll12.I00OI1);
/* 338 */               OO0lO0l0 oO0lO0l0I000lI2 = iloI0lOlll12.I000lI();
/* 342 */               O1ooiI111i o1ooiI111iI0000Il00O2 = iilOllOlO1.I0000Il00O(iloI0lOlll12, o1ooiI111iI000OiO);
/* 348 */               IOl0oi0lOl1.I000lI.getClass();
/* 351 */               iloI0lOlll12.I00i0oil();
/* 356 */               if (iloI0lOlll12.I00O10llo) {
/* 358 */                   iloI0lOlll12.I000l1(iloi111);
                        } else {
/* 362 */                   iloI0lOlll12.I00io1l();
                        }
/* 365 */               li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll12, iOOlo1O01OI00000oIO);
/* 368 */               li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll12, oO0lO0l0I000lI2);
/* 371 */               IIl001iO0Io.I001IIilI0O(iHashCode2, iloI0lOlll12, iOioOOi0I2, iloI0lOlll12);
/* 374 */               li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll12, o1ooiI111iI0000Il00O2);
/* 380 */               lIollilI1O.I00000oIO(160.0f, iloI0lOlll12, 6);
/* 389 */               lOO1OIO00.I00000oIO(iloI0lOlll12, Ol0iOOO0.I000II(o1ooIo101ll, 32.0f));
/* 392 */               o1oIOiI11o02 = o1oIOiI11o0;
/* 397 */               String strI00000oOI = OollloolI.I00000oOI(3, o1oIOiI11o02.I00IoiI);
/* 401 */               if (o1oIo0iI003 != null) {
/* 403 */                   long j = o1oIo0iI003.I0000Il00O;
/* 405 */                   long j2 = o1oIo0iI003.I00000oOI;
/* 410 */                   iloI0lOlll12.I00i01iIIliI(1134555890);
/* 413 */                   if (z2 || z3) {
/* 451 */                       String strI000lI = IlIi0I0.I000lI(OollloolI.I00000oOI(i3, j), " of ", OollloolI.I00000oOI(3, j2 == 0 ? o1oIOiI11o02.I00IoiI : j2));
/* 456 */                       long j3 = o1oIo0iI003.I0000oI00;
/* 460 */                       if (j3 > 0) {
/* 470 */                           strI000lI = IIl001iO0Io.I000oI1ioi(strI000lI, " · ", OollloolI.I00000oOI(3, j3), " / s");
/* 474 */                           long j4 = o1oIo0iI003.I0001Ioi1lo;
/* 478 */                           if (j4 >= 0) {
/* 480 */                               if (j4 < 0) {
/* 482 */                                   strI00IlilI0i0i = "-";
/* 484 */                                   i4 = 3;
/* 486 */                                   str2 = strI000lI;
                                        } else {
/* 492 */                                   long j5 = j4 / 1000;
/* 496 */                                   long j6 = j5 / 3600;
/* 503 */                                   str2 = strI000lI;
/* 505 */                                   long j7 = (j5 % 3600) / 60;
/* 507 */                                   long j8 = j5 % 60;
/* 509 */                                   i4 = 3;
/* 513 */                                   ArrayList arrayList = new ArrayList();
/* 520 */                                   if (j6 > 0) {
/* 539 */                                       arrayList.add(j6 + " h");
                                            }
/* 544 */                                   if (j7 > 0) {
/* 563 */                                       arrayList.add(j7 + " min");
                                            }
/* 568 */                                   if (j8 > 0 || (j6 == 0 && j7 == 0)) {
/* 591 */                                       arrayList.add(j8 + " sec");
                                            }
/* 606 */                                   strI00IlilI0i0i = IOOi0Ool1i.I00IlilI0i0i(arrayList, " ", null, null, null, 62);
                                        }
/* 614 */                               strI000lI = IIl001iO0Io.I000oI1ioi(str2, " · ", strI00IlilI0i0i, " left");
                                    } else {
/* 619 */                               i4 = 3;
                                    }
                                } else {
/* 623 */                           i4 = 3;
                                }
/* 635 */                       String strConcat = z3 ? strI000lI.concat(" (resuming...)") : strI000lI;
/* 639 */                       Float.isNaN(j / j2);
/* 642 */                       str = strConcat;
                            } else {
/* 422 */                       if (o1oIo0iI003.I00000oIO == ModelDownloadStatusType.UNZIPPING) {
/* 424 */                           strI00000oOI = "Unzipping...";
                                }
/* 426 */                       str = strI00000oOI;
/* 427 */                       i4 = 3;
                            }
/* 643 */                   OlO1iIi1ol0 olO1iIi1ol0 = O1OoilIO.I00000oOI;
/* 714 */                   Oo0i1oIIoOO.I00000oOI(str, iO01II.I000OiO(o1ooIo101ll, 0.0f, 0.0f, 0.0f, 4.0f, 7), ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(olO1iIi1ol0)).I00000oIO.I0010o, null, 0L, null, null, null, 0L, OloOOIoO1ii1.I00000oIO(i4), 0L, 3, false, 0, 0, null, ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(olO1iIi1ol0)).I00000oOI.I000o00OoI0I, iloI0lOlll1, 48, 384, 125944);
/* 717 */                   iloI0lOlll12 = iloI0lOlll1;
/* 719 */                   z = false;
/* 720 */                   iloI0lOlll12.I0010I0i(false);
                        } else {
/* 725 */                   z = false;
/* 729 */                   iloI0lOlll12.I00i01iIIliI(1136095412);
/* 732 */                   iloI0lOlll12.I0010I0i(false);
                        }
/* 723 */               i2 = 1;
/* 736 */               iloI0lOlll12.I0010I0i(true);
/* 739 */               iloI0lOlll12.I0010I0i(z);
                    } else {
/* 743 */               i2 = 1;
/* 744 */               iloI0lOlll12.I00OilO00Il();
                    }
/* 747 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 751 */           if (oOloioIlI001IO000 != null) {
/* 755 */               O1oO01o01o1I o1oO01o01o1I = new O1oO01o01o1I(i2);
/* 758 */               o1oO01o01o1I.I00iiI = o1oIOiI11o02;
/* 762 */               o1oO01o01o1I.I00iiO = oloIl1l1oOii;
/* 766 */               o1oO01o01o1I.I00iio = o1ol100o0O;
/* 768 */               VarHandle.storeStoreFence();
/* 771 */               oOloioIlI001IO000.I0000O = o1oO01o01o1I;
                    }
                }
            }

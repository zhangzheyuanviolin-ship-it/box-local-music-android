            package p000;

            import com.box.gallery.R;
            import com.google.ai.edge.gallery.data.ModelDownloadStatusType;
            import com.google.ai.edge.gallery.data.RuntimeType;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            
            public abstract class l1OoiOII1Oi {
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r15v0 */
                /* JADX WARN: Type inference failed for: r15v1, types: [int] */
                /* JADX WARN: Type inference failed for: r15v25 */
                public static final void I00000oIO(O1oIOiI11o0 o1oIOiI11o0, OloIl1l1oOii oloIl1l1oOii, O1oIo0iI00 o1oIo0iI00, boolean z, O1ooiI111i o1ooiI111i, IloI0lOlll1 iloI0lOlll1, int i) {
                    ?? r15;
                    IloI0lOlll1 iloI0lOlll12;
                    String str;
                    II0IlloOiO0i iI0IlloOiO0i;
                    Iloi111 iloi111;
                    IOioOOi0I iOioOOi0I;
                    IOioOOi0I iOioOOi0I2;
                    IOioOOi0I iOioOOi0I3;
                    I1IiOIiOli i1IiOIiOli;
                    O1ooIo101ll o1ooIo101ll;
                    boolean z2;
                    boolean z3;
                    IloI0lOlll1 iloI0lOlll13;
                    boolean z4;
                    IloI0lOlll1 iloI0lOlll14;
                    Iloi111 iloi1112;
                    IOioOOi0I iOioOOi0I4;
                    boolean z5;
                    boolean z6;
                    long j;
                    int i2;
                    long j2;
                    IloI0lOlll1 iloI0lOlll15;
                    Iloi111 iloi1113;
                    boolean z7;
/* 3 */             OloIl1l1oOii oloIl1l1oOii2 = oloIl1l1oOii;
/* 5 */             O1oIo0iI00 o1oIo0iI002 = o1oIo0iI00;
/* 11 */            IloI0lOlll1 iloI0lOlll16 = iloI0lOlll1;
/* 15 */            II0O000iIl iI0O000iIl = i1O01oOIoI0I.I00lli11;
/* 17 */            String str2 = o1oIOiI11o0.I00100o1O0lo;
/* 22 */            iloI0lOlll16.I00i0O(-564080426);
/* 40 */            int i3 = (i & 6) == 0 ? (iloI0lOlll16.I000OOo1O(o1oIOiI11o0) ? 4 : 2) | i : i;
/* 43 */            if ((i & 48) == 0) {
/* 56 */                i3 |= iloI0lOlll16.I000OOo1O(oloIl1l1oOii2) ? 32 : 16;
                    }
/* 59 */            if ((i & 384) == 0) {
/* 72 */                i3 |= iloI0lOlll16.I000II(o1oIo0iI002) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 75 */            if ((i & 3072) == 0) {
/* 88 */                i3 |= iloI0lOlll16.I000O01llI0(z) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                    }
/* 91 */            if ((i & 24576) == 0) {
/* 104 */               i3 |= iloI0lOlll16.I000II(o1ooiI111i) ? 16384 : 8192;
                    }
/* 121 */           if (iloI0lOlll16.I00OIl(i3 & 1, (i3 & 9363) != 9362)) {
/* 137 */               boolean z8 = (o1oIo0iI002 != null ? o1oIo0iI002.I00000oIO : null) == ModelDownloadStatusType.IN_PROGRESS;
/* 150 */               boolean z9 = (o1oIo0iI002 != null ? o1oIo0iI002.I00000oIO : null) == ModelDownloadStatusType.PARTIALLY_DOWNLOADED;
/* 152 */               II0IlloOiO0i iI0IlloOiO0i2 = i1O01oOIoI0I.I00o0iI0io1;
/* 154 */               I1IiOIiOli i1IiOIiOli2 = I1IiooiI1IlO.I0000Il00O;
/* 156 */               IOOlo1O01O iOOlo1O01OI00000oIO = IOOlio0Io0.I00000oIO(i1IiOIiOli2, iI0IlloOiO0i2, iloI0lOlll16, 0);
/* 162 */               int iHashCode = Long.hashCode(iloI0lOlll16.I00OI1);
/* 166 */               OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll16.I000lI();
/* 170 */               O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll16, o1ooiI111i);
/* 176 */               IOl0oi0lOl1.I000lI.getClass();
/* 179 */               iloI0lOlll16.I00i0oil();
/* 182 */               boolean z10 = iloI0lOlll16.I00O10llo;
/* 186 */               Iloi111 iloi1114 = O0iiOioolIi.I01101IOlO;
/* 188 */               if (z10) {
/* 190 */                   iloI0lOlll16.I000l1(iloi1114);
                        } else {
/* 194 */                   iloI0lOlll16.I00io1l();
                        }
/* 197 */               IOioOOi0I iOioOOi0I5 = lolOiIoiillI.I00io1l;
/* 199 */               li01Ooiio01.I0000Il00O(iOioOOi0I5, iloI0lOlll16, iOOlo1O01OI00000oIO);
/* 202 */               IOioOOi0I iOioOOi0I6 = lolOiIoiillI.I00ilO0;
/* 204 */               li01Ooiio01.I0000Il00O(iOioOOi0I6, iloI0lOlll16, oO0lO0l0I000lI);
/* 207 */               Integer numValueOf = Integer.valueOf(iHashCode);
/* 211 */               IOioOOi0I iOioOOi0I7 = lolOiIoiillI.I00ioIO;
/* 213 */               li01Ooiio01.I0000Il00O(iOioOOi0I7, iloI0lOlll16, numValueOf);
/* 216 */               li01Ooiio01.I00000oOI(iloI0lOlll16);
/* 219 */               IOioOOi0I iOioOOi0I8 = lolOiIoiillI.I00ilI0I1;
/* 221 */               li01Ooiio01.I0000Il00O(iOioOOi0I8, iloI0lOlll16, o1ooiI111iI0000Il00O);
/* 224 */               O1ooIo101ll o1ooIo101ll2 = O1ooIo101ll.I00000oIO;
/* 226 */               if (oloIl1l1oOii2 != null && o1oIOiI11o0.I0001Ioi1lo.contains(oloIl1l1oOii2.I00000oIO) && O0000Ioio00.I0000O(oloIl1l1oOii2.I000OiO.get(0), o1oIOiI11o0)) {
/* 254 */                   iloI0lOlll16.I00i01iIIliI(-112863771);
/* 259 */                   I1IioI i1IioII0000oI00 = I1IiooiI1IlO.I0000oI00(8.0f);
/* 273 */                   O1ooiI111i o1ooiI111iI000OiO = iO01II.I000OiO(o1ooIo101ll2, 0.0f, 0.0f, 0.0f, 6.0f, 7);
/* 277 */                   str = str2;
/* 279 */                   o1ooIo101ll = o1ooIo101ll2;
/* 283 */                   OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO = OiI1iOo.I00000oIO(i1IioII0000oI00, iI0O000iIl, iloI0lOlll16, 54);
/* 290 */                   int iHashCode2 = Long.hashCode(iloI0lOlll16.I00OI1);
/* 294 */                   OO0lO0l0 oO0lO0l0I000lI2 = iloI0lOlll16.I000lI();
/* 298 */                   O1ooiI111i o1ooiI111iI0000Il00O2 = iilOllOlO1.I0000Il00O(iloI0lOlll16, o1ooiI111iI000OiO);
/* 302 */                   iloI0lOlll16.I00i0oil();
/* 309 */                   if (iloI0lOlll16.I00O10llo) {
/* 311 */                       iloI0lOlll16.I000l1(iloi1114);
                            } else {
/* 315 */                       iloI0lOlll16.I00io1l();
                            }
/* 318 */                   li01Ooiio01.I0000Il00O(iOioOOi0I5, iloI0lOlll16, oiI1iiIl1Oi0I00000oIO);
/* 321 */                   li01Ooiio01.I0000Il00O(iOioOOi0I6, iloI0lOlll16, oO0lO0l0I000lI2);
/* 324 */                   IIl001iO0Io.I001IIilI0O(iHashCode2, iloI0lOlll16, iOioOOi0I7, iloI0lOlll16);
/* 327 */                   li01Ooiio01.I0000Il00O(iOioOOi0I8, iloI0lOlll16, o1ooiI111iI0000Il00O2);
/* 330 */                   IoiOolO1iOo ioiOolO1iOoI0000O = lOOOO1I1o0.I00000oIO;
/* 332 */                   if (ioiOolO1iOoI0000O != null) {
/* 334 */                       iloi1113 = iloi1114;
/* 336 */                       z7 = false;
                            } else {
/* 360 */                       IoiOo1iI ioiOo1iI = new IoiOo1iI("Filled.Star", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
/* 365 */                       int i4 = Ooo1iOO.I00000oIO;
/* 371 */                       OlI00IIlOO olI00IIlOO = new OlI00IIlOO(IOOiio0i.I00000oOI);
/* 382 */                       iloi1113 = iloi1114;
/* 386 */                       OO0Ii1 oO0Ii1I000iOII = IIlIOloOOO.I000iOII(12.0f, 17.27f, 18.18f, 21.0f);
/* 396 */                       oO0Ii1I000iOII.I000OOo1O(-1.64f, -7.03f);
/* 404 */                       oO0Ii1I000iOII.I000O01llI0(22.0f, 9.24f);
/* 413 */                       oO0Ii1I000iOII.I000OOo1O(-7.19f, -0.61f);
/* 418 */                       oO0Ii1I000iOII.I000O01llI0(12.0f, 2.0f);
/* 427 */                       oO0Ii1I000iOII.I000O01llI0(9.19f, 8.63f);
/* 433 */                       oO0Ii1I000iOII.I000O01llI0(2.0f, 9.24f);
/* 442 */                       oO0Ii1I000iOII.I000OOo1O(5.46f, 4.73f);
/* 450 */                       oO0Ii1I000iOII.I000O01llI0(5.82f, 21.0f);
/* 453 */                       oO0Ii1I000iOII.I0000Il00O();
/* 458 */                       z7 = false;
/* 459 */                       IoiOo1iI.I00000oOI(ioiOo1iI, oO0Ii1I000iOII.I00000oIO, 0, olI00IIlOO);
/* 462 */                       ioiOolO1iOoI0000O = ioiOo1iI.I0000O();
/* 466 */                       lOOOO1I1o0.I00000oIO = ioiOolO1iOoI0000O;
                            }
/* 337 */                   IoiOolO1iOo ioiOolO1iOo = ioiOolO1iOoI0000O;
/* 494 */                   iOioOOi0I = iOioOOi0I8;
/* 496 */                   iOioOOi0I2 = iOioOOi0I7;
/* 498 */                   iOioOOi0I3 = iOioOOi0I6;
/* 499 */                   i1IiOIiOli = i1IiOIiOli2;
/* 501 */                   iI0IlloOiO0i = iI0IlloOiO0i2;
/* 503 */                   iloi111 = iloi1113;
/* 508 */                   z2 = true;
/* 509 */                   IoOoiI1II00i.I00000oIO(ioiOolO1iOo, null, Ol0iOOO0.I000lI(o1ooIo101ll, 18.0f), iiO01ll11o1l.I0000Il00O(4294756660L), iloI0lOlll16, 3504, 0);
/* 515 */                   String strI00000oOI = lOOoli.I00000oOI(R.string.best_overall, iloI0lOlll16);
/* 519 */                   OlO1iIi1ol0 olO1iIi1ol0 = O1OoilIO.I00000oOI;
/* 585 */                   Oo0i1oIIoOO.I00000oOI(strI00000oOI, iOIiO1OII1.I00000oIO(o1ooIo101ll, 0.6f), ((O1OoiOIi1ooi) iloI0lOlll16.I000iOII(olO1iIi1ol0)).I00000oIO.I0010o, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((O1OoiOIi1ooi) iloI0lOlll16.I000iOII(olO1iIi1ol0)).I00000oOI.I000o00OoI0I, iloI0lOlll1, 48, 0, 131064);
/* 588 */                   IloI0lOlll1 iloI0lOlll17 = iloI0lOlll1;
/* 590 */                   iloI0lOlll17.I0010I0i(true);
/* 593 */                   z3 = false;
/* 594 */                   iloI0lOlll17.I0010I0i(false);
                            iloI0lOlll13 = iloI0lOlll17;
                        } else {
/* 598 */                   str = str2;
/* 600 */                   iI0IlloOiO0i = iI0IlloOiO0i2;
/* 601 */                   iloi111 = iloi1114;
/* 603 */                   iOioOOi0I = iOioOOi0I8;
/* 605 */                   iOioOOi0I2 = iOioOOi0I7;
/* 607 */                   iOioOOi0I3 = iOioOOi0I6;
/* 608 */                   i1IiOIiOli = i1IiOIiOli2;
/* 610 */                   o1ooIo101ll = o1ooIo101ll2;
/* 612 */                   z2 = true;
/* 613 */                   z3 = false;
/* 617 */                   iloI0lOlll16.I00i01iIIliI(-112287946);
/* 620 */                   iloI0lOlll16.I0010I0i(false);
                            iloI0lOlll13 = iloI0lOlll16;
                        }
/* 623 */               String str3 = o1oIOiI11o0.I00000oOI;
/* 629 */               if (str3.length() == 0) {
/* 631 */                   str3 = o1oIOiI11o0.I00000oIO;
                        }
/* 633 */               OlO1iIi1ol0 olO1iIi1ol02 = O1OoilIO.I00000oOI;
/* 655 */               O1ooIo101ll o1ooIo101ll3 = o1ooIo101ll;
/* 725 */               boolean z11 = z3;
/* 733 */               Oo0i1oIIoOO.I00000oOI(str3, iO01II.I000OiO(o1ooIo101ll3, 0.0f, 0.0f, 64.0f, 0.0f, 11), 0L, null, 0L, null, null, null, 0L, null, 0L, 5, false, 1, 0, null, ((O1OoiOIi1ooi) iloI0lOlll13.I000iOII(olO1iIi1ol02)).I00000oOI.I000O01llI0, iloI0lOlll1, 48, 24960, 110588);
/* 736 */               IloI0lOlll1 iloI0lOlll18 = iloI0lOlll1;
/* 742 */               if (o1oIOiI11o0.I00100l0 != RuntimeType.AICORE) {
/* 747 */                   iloI0lOlll18.I00i01iIIliI(-111807601);
/* 762 */                   O1ooiI111i o1ooiI111iI000OiO2 = iO01II.I000OiO(o1ooIo101ll3, 0.0f, 4.0f, 0.0f, 0.0f, 13);
/* 766 */                   I1IiOI0 i1IiOI0 = I1IiooiI1IlO.I00000oIO;
/* 770 */                   OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO2 = OiI1iOo.I00000oIO(i1IiOI0, iI0O000iIl, iloI0lOlll18, 48);
/* 777 */                   int iHashCode3 = Long.hashCode(iloI0lOlll18.I00OI1);
/* 781 */                   OO0lO0l0 oO0lO0l0I000lI3 = iloI0lOlll18.I000lI();
/* 785 */                   O1ooiI111i o1ooiI111iI0000Il00O3 = iilOllOlO1.I0000Il00O(iloI0lOlll18, o1ooiI111iI000OiO2);
/* 789 */                   iloI0lOlll18.I00i0oil();
/* 794 */                   if (iloI0lOlll18.I00O10llo) {
/* 796 */                       iloi1112 = iloi111;
/* 798 */                       iloI0lOlll18.I000l1(iloi1112);
                            } else {
/* 802 */                       iloi1112 = iloi111;
/* 804 */                       iloI0lOlll18.I00io1l();
                            }
/* 807 */                   li01Ooiio01.I0000Il00O(iOioOOi0I5, iloI0lOlll18, oiI1iiIl1Oi0I00000oIO2);
/* 810 */                   li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll18, oO0lO0l0I000lI3);
/* 813 */                   IOioOOi0I iOioOOi0I9 = iOioOOi0I2;
/* 815 */                   IIl001iO0Io.I001IIilI0O(iHashCode3, iloI0lOlll18, iOioOOi0I9, iloI0lOlll18);
/* 818 */                   IOioOOi0I iOioOOi0I10 = iOioOOi0I;
/* 820 */                   li01Ooiio01.I0000Il00O(iOioOOi0I10, iloI0lOlll18, o1ooiI111iI0000Il00O3);
/* 837 */                   O1ooIo101ll o1ooIo101ll4 = o1ooIo101ll3;
/* 854 */                   IOioOOi0I iOioOOi0I11 = iOioOOi0I3;
/* 859 */                   II0IlloOiO0i iI0IlloOiO0i3 = iI0IlloOiO0i;
/* 862 */                   IloI0lOlll1 iloI0lOlll19 = iloI0lOlll18;
/* 865 */                   oloIl1l1oOii2 = oloIl1l1oOii;
/* 867 */                   o1oIo0iI002 = o1oIo0iI00;
/* 869 */                   lOOiIi110l.I00000oIO(oloIl1l1oOii2, o1oIOiI11o0, o1oIo0iI002, iO01II.I000OiO(o1ooIo101ll3, 0.0f, 0.0f, 4.0f, 0.0f, 11), iloI0lOlll19, (i3 & 896) | ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112), 0);
/* 872 */                   if (o1oIo0iI002 == null || o1oIo0iI002.I00000oIO != ModelDownloadStatusType.FAILED) {
/* 1003 */                      iloI0lOlll19.I00i01iIIliI(1916743256);
/* 1009 */                      String strI00000oOI2 = OollloolI.I00000oOI(3, o1oIOiI11o0.I00IoiI);
/* 1017 */                      if (str.length() > 0) {
/* 1023 */                          strI00000oOI2 = "{ext_files_dir}/".concat(str);
                                }
/* 1029 */                      if (o1oIo0iI002 != null) {
/* 1031 */                          long j3 = o1oIo0iI002.I0000Il00O;
/* 1034 */                          long j4 = o1oIo0iI002.I00000oOI;
/* 1036 */                          if (z8 || z9) {
/* 1056 */                              if (j4 == 0) {
/* 1060 */                                  j2 = o1oIOiI11o0.I00IoiI;
/* 1064 */                                  iOioOOi0I4 = iOioOOi0I5;
/* 1066 */                                  j = j3;
/* 1068 */                                  i2 = 1;
                                        } else {
/* 1070 */                                  iOioOOi0I4 = iOioOOi0I5;
/* 1072 */                                  j = j3;
/* 1073 */                                  i2 = 1;
/* 1074 */                                  j2 = j4;
                                        }
/* 1086 */                              String strI000lI = IlIi0I0.I000lI(OollloolI.I00000oOI(i2, j), " of ", OollloolI.I00000oOI(3, j2));
/* 1090 */                              long j5 = o1oIo0iI002.I0000oI00;
/* 1094 */                              if (j5 > 0) {
/* 1121 */                                  strI000lI = ((Object) strI000lI) + " · " + OollloolI.I00000oOI(3, j5) + " / s";
                                        }
/* 1125 */                              if (z9) {
/* 1140 */                                  strI000lI = ((Object) strI000lI) + " (paused)";
                                        }
/* 1147 */                              Float.isNaN(j / j4);
/* 1150 */                              strI00000oOI2 = strI000lI;
                                    } else {
/* 1045 */                              if (o1oIo0iI002.I00000oIO == ModelDownloadStatusType.UNZIPPING) {
/* 1047 */                                  strI00000oOI2 = "Unzipping...";
                                        }
/* 1049 */                              iOioOOi0I4 = iOioOOi0I5;
                                    }
                                } else {
/* 1152 */                          iOioOOi0I4 = iOioOOi0I5;
                                }
/* 1165 */                      IOOlo1O01O iOOlo1O01OI00000oIO2 = IOOlio0Io0.I00000oIO(i1IiOIiOli, z ? i1O01oOIoI0I.I00o0l1o1o0 : iI0IlloOiO0i3, iloI0lOlll19, 0);
/* 1171 */                      int iHashCode4 = Long.hashCode(iloI0lOlll19.I00OI1);
/* 1175 */                      OO0lO0l0 oO0lO0l0I000lI4 = iloI0lOlll19.I000lI();
/* 1179 */                      O1ooiI111i o1ooiI111iI0000Il00O4 = iilOllOlO1.I0000Il00O(iloI0lOlll19, o1ooIo101ll4);
/* 1183 */                      iloI0lOlll19.I00i0oil();
/* 1188 */                      if (iloI0lOlll19.I00O10llo) {
/* 1190 */                          iloI0lOlll19.I000l1(iloi1112);
                                } else {
/* 1196 */                          iloI0lOlll19.I00io1l();
                                }
/* 1200 */                      li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll19, iOOlo1O01OI00000oIO2);
/* 1203 */                      li01Ooiio01.I0000Il00O(iOioOOi0I11, iloI0lOlll19, oO0lO0l0I000lI4);
/* 1206 */                      IIl001iO0Io.I001IIilI0O(iHashCode4, iloI0lOlll19, iOioOOi0I9, iloI0lOlll19);
/* 1211 */                      li01Ooiio01.I0000Il00O(iOioOOi0I10, iloI0lOlll19, o1ooiI111iI0000Il00O4);
/* 1217 */                      iloI0lOlll19.I00i01iIIliI(-1976786894);
/* 1237 */                      int i5 = 0;
/* 1242 */                      for (String str4 : OlOoOIi0o.I00IoIO0lI(strI00000oOI2, new String[]{"\n"}, 6)) {
/* 1244 */                          int i6 = i5 + 1;
/* 1252 */                          OlO1iIi1ol0 olO1iIi1ol03 = O1OoilIO.I00000oOI;
/* 1340 */                          IloI0lOlll1 iloI0lOlll110 = iloI0lOlll19;
/* 1346 */                          Oo0i1oIIoOO.I00000oOI(str4, iO0100loIol.I0000Il00O(o1ooIo101ll4, 0.0f, i5 == 0 ? 0.0f : -1.0f, 1), ((O1OoiOIi1ooi) iloI0lOlll19.I000iOII(olO1iIi1ol03)).I00000oIO.I0010o, null, 0L, null, null, null, 0L, null, 0L, 3, false, 1, 0, null, Oo0lloOiiIOI.I00000oOI(((O1OoiOIi1ooi) iloI0lOlll19.I000iOII(olO1iIi1ol03)).I00000oOI.I000iOII, 0L, 0L, null, null, 0L, 0L, null, 16777151), iloI0lOlll110, 0, 24960, 110584);
/* 1349 */                          o1ooIo101ll4 = o1ooIo101ll4;
/* 1350 */                          i5 = i6;
/* 1351 */                          iloI0lOlll19 = iloI0lOlll110;
                                }
/* 1354 */                      IloI0lOlll1 iloI0lOlll111 = iloI0lOlll19;
/* 1355 */                      z5 = false;
/* 1356 */                      z6 = true;
/* 1357 */                      Oi010OO0.I001l0I00(iloI0lOlll111, false, true, false);
                                iloI0lOlll15 = iloI0lOlll111;
                            } else {
/* 883 */                       iloI0lOlll19.I00i01iIIliI(1916334831);
/* 888 */                       OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO3 = OiI1iOo.I00000oIO(i1IiOI0, iI0O000iIl, iloI0lOlll19, 48);
/* 894 */                       int iHashCode5 = Long.hashCode(iloI0lOlll19.I00OI1);
/* 898 */                       OO0lO0l0 oO0lO0l0I000lI5 = iloI0lOlll19.I000lI();
/* 902 */                       O1ooiI111i o1ooiI111iI0000Il00O5 = iilOllOlO1.I0000Il00O(iloI0lOlll19, o1ooIo101ll4);
/* 906 */                       iloI0lOlll19.I00i0oil();
/* 911 */                       if (iloI0lOlll19.I00O10llo) {
/* 913 */                           iloI0lOlll19.I000l1(iloi1112);
                                } else {
/* 917 */                           iloI0lOlll19.I00io1l();
                                }
/* 920 */                       li01Ooiio01.I0000Il00O(iOioOOi0I5, iloI0lOlll19, oiI1iiIl1Oi0I00000oIO3);
/* 923 */                       li01Ooiio01.I0000Il00O(iOioOOi0I11, iloI0lOlll19, oO0lO0l0I000lI5);
/* 926 */                       IIl001iO0Io.I001IIilI0O(iHashCode5, iloI0lOlll19, iOioOOi0I9, iloI0lOlll19);
/* 929 */                       li01Ooiio01.I0000Il00O(iOioOOi0I10, iloI0lOlll19, o1ooiI111iI0000Il00O5);
/* 982 */                       Oo0i1oIIoOO.I00000oOI(o1oIo0iI002.I0000O, null, ((O1OoiOIi1ooi) iloI0lOlll19.I000iOII(olO1iIi1ol02)).I00000oIO.I001i1O0Ol, null, 0L, null, null, null, 0L, null, 0L, 2, false, 0, 0, null, OoOOIOo00OoI.I00100l0, iloI0lOlll19, 0, 12583296, 126970);
/* 986 */                       iloI0lOlll19.I0010I0i(true);
/* 990 */                       iloI0lOlll19.I0010I0i(false);
/* 993 */                       iloI0lOlll15 = iloI0lOlll19;
/* 994 */                       z6 = true;
/* 995 */                       z5 = false;
                            }
/* 1360 */                  iloI0lOlll15.I0010I0i(z6);
/* 1363 */                  iloI0lOlll15.I0010I0i(z5);
                            iloI0lOlll14 = iloI0lOlll15;
                            z4 = z6;
                        } else {
/* 1367 */                  oloIl1l1oOii2 = oloIl1l1oOii;
/* 1369 */                  o1oIo0iI002 = o1oIo0iI00;
/* 1371 */                  z4 = z2;
/* 1377 */                  iloI0lOlll18.I00i01iIIliI(-108688970);
/* 1380 */                  iloI0lOlll18.I0010I0i(z11);
                            iloI0lOlll14 = iloI0lOlll18;
                        }
/* 1383 */              iloI0lOlll14.I0010I0i(z4);
                        iloI0lOlll12 = iloI0lOlll14;
                        r15 = z4;
                    } else {
/* 1387 */              r15 = 1;
/* 1388 */              iloI0lOlll16.I00OilO00Il();
                        iloI0lOlll12 = iloI0lOlll16;
                    }
/* 1391 */          OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 1395 */          if (oOloioIlI001IO000 != null) {
/* 1399 */              IiIo0oO010ol iiIo0oO010ol = new IiIo0oO010ol(r15);
/* 1402 */              iiIo0oO010ol.I00iiI = o1oIOiI11o0;
/* 1404 */              iiIo0oO010ol.I00io1l = oloIl1l1oOii2;
/* 1406 */              iiIo0oO010ol.I00iiO = o1oIo0iI002;
/* 1410 */              iiIo0oO010ol.I00iio = z;
/* 1414 */              iiIo0oO010ol.I00ilI0I1 = o1ooiI111i;
/* 1418 */              iiIo0oO010ol.I00ilO0 = i;
/* 1420 */              VarHandle.storeStoreFence();
/* 1423 */              oOloioIlI001IO000.I0000O = iiIo0oO010ol;
                    }
                }
            }

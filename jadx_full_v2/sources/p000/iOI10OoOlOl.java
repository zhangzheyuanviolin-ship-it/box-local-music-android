            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import kotlin.jvm.functions.Function1;
            
            public abstract class iOI10OoOlOl {
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:100:0x01b5  */
                /* JADX WARN: Removed duplicated region for block: B:101:0x01b7  */
                /* JADX WARN: Removed duplicated region for block: B:104:0x01c0  */
                /* JADX WARN: Removed duplicated region for block: B:105:0x01c2  */
                /* JADX WARN: Removed duplicated region for block: B:108:0x01cd  */
                /* JADX WARN: Removed duplicated region for block: B:112:0x01d6  */
                /* JADX WARN: Removed duplicated region for block: B:116:0x0214  */
                /* JADX WARN: Removed duplicated region for block: B:117:0x0218  */
                /* JADX WARN: Removed duplicated region for block: B:120:0x0229  */
                /* JADX WARN: Removed duplicated region for block: B:122:0x0231  */
                /* JADX WARN: Removed duplicated region for block: B:129:0x0314  */
                /* JADX WARN: Removed duplicated region for block: B:132:0x0322  */
                /* JADX WARN: Removed duplicated region for block: B:135:0x0341  */
                /* JADX WARN: Removed duplicated region for block: B:136:0x0345  */
                /* JADX WARN: Removed duplicated region for block: B:139:0x0362  */
                /* JADX WARN: Removed duplicated region for block: B:141:0x0366  */
                /* JADX WARN: Removed duplicated region for block: B:144:0x03c8  */
                /* JADX WARN: Removed duplicated region for block: B:146:0x0414  */
                /* JADX WARN: Removed duplicated region for block: B:149:0x0429  */
                /* JADX WARN: Removed duplicated region for block: B:150:0x045d  */
                /* JADX WARN: Removed duplicated region for block: B:152:0x04a7  */
                /* JADX WARN: Removed duplicated region for block: B:155:0x04b7  */
                /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:46:0x008e  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x0093  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x00ac  */
                /* JADX WARN: Removed duplicated region for block: B:57:0x00b1  */
                /* JADX WARN: Removed duplicated region for block: B:66:0x00d1  */
                /* JADX WARN: Removed duplicated region for block: B:67:0x00d3  */
                /* JADX WARN: Removed duplicated region for block: B:70:0x00dc  */
                /* JADX WARN: Removed duplicated region for block: B:96:0x0177  */
                /* JADX WARN: Removed duplicated region for block: B:97:0x017b  */
                /* JADX WARN: Type inference failed for: r12v12 */
                /* JADX WARN: Type inference failed for: r12v8 */
                /* JADX WARN: Type inference failed for: r12v9, types: [boolean, int] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(String str, boolean z, Function1 function1, O1ooiI111i o1ooiI111i, String str2, boolean z2, long j, IlliIl1l11O illiIl1l11O, boolean z3, IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
                    String str3;
                    int i3;
                    boolean z4;
                    int i4;
                    int i5;
                    IlliIl1l11O illiIl1l11O2;
                    int i6;
                    int i7;
                    IOii1l iOii1l2;
                    boolean z5;
                    long j2;
                    boolean z6;
                    IloI0lOlll1 iloI0lOlll12;
                    OOloioIl oOloioIlI001IO000;
                    long j3;
                    boolean z7;
                    long j4;
                    IlliIl1l11O illiIl1l11O3;
                    String str4;
                    boolean z8;
                    int i8;
                    boolean z9;
                    boolean z10;
                    int i9;
                    boolean z11;
                    Object obj;
                    IoiOolO1iOo ioiOolO1iOoI0000O;
                    ?? r12;
                    IloI0lOlll1 iloI0lOlll13;
                    IlliIl1l11O illiIl1l11O4;
/* 9 */             IloI0lOlll1 iloI0lOlll14 = iloI0lOlll1;
/* 16 */            iloI0lOlll14.I00i0O(158431297);
/* 65 */            int i10 = i | (iloI0lOlll14.I000II(str) ? 4 : 2) | (iloI0lOlll14.I000O01llI0(z) ? 32 : 16) | (iloI0lOlll14.I000OOo1O(function1) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF) | (iloI0lOlll14.I000II(o1ooiI111i) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E);
/* 66 */            int i11 = i2 & 16;
/* 68 */            if (i11 != 0) {
/* 70 */                i3 = i10 | 24576;
/* 72 */                str3 = str2;
                    } else {
/* 75 */                str3 = str2;
/* 88 */                i3 = i10 | (iloI0lOlll14.I000II(str3) ? 16384 : 8192);
                    }
/* 89 */            int i12 = i2 & 32;
/* 93 */            if (i12 == 0) {
/* 101 */               if ((i & 196608) == 0) {
/* 103 */                   z4 = z2;
/* 116 */                   i3 |= iloI0lOlll14.I000O01llI0(z4) ? 131072 : 65536;
                        }
/* 136 */               i4 = i3 | (((i2 & 64) == 0 || !iloI0lOlll14.I0001Ioi1lo(j)) ? 524288 : 1048576);
/* 137 */               i5 = i2 & Barcode.FORMAT_ITF;
/* 141 */               if (i5 == 0) {
/* 143 */                   i4 |= 12582912;
/* 145 */                   illiIl1l11O2 = illiIl1l11O;
                        } else {
/* 150 */                   illiIl1l11O2 = illiIl1l11O;
/* 152 */                   if ((i & 12582912) == 0) {
/* 165 */                       i4 |= iloI0lOlll14.I000OOo1O(illiIl1l11O2) ? 8388608 : 4194304;
                            }
                        }
/* 167 */               i6 = i2 & Barcode.FORMAT_QR_CODE;
/* 171 */               if (i6 == 0) {
/* 173 */                   i4 |= 100663296;
                        } else if ((i & 100663296) == 0) {
/* 195 */                   i4 |= iloI0lOlll14.I000O01llI0(z3) ? 67108864 : 33554432;
                        }
/* 202 */               i7 = i4;
/* 219 */               if (iloI0lOlll14.I00OIl(i7 & 1, (i4 & 306783379) == 306783378)) {
/* 1192 */                  iOii1l2 = iOii1l;
/* 1194 */                  z5 = z;
/* 1195 */                  iloI0lOlll14.I00OilO00Il();
/* 1198 */                  j2 = j;
/* 1200 */                  z6 = z3;
                            iloI0lOlll12 = iloI0lOlll14;
                        } else {
/* 221 */                   iloI0lOlll14.I00Ol00();
/* 229 */                   if ((i & 1) == 0 || iloI0lOlll14.I001lloI()) {
/* 269 */                       if (i11 != 0) {
/* 271 */                           str3 = "";
                                }
/* 274 */                       if (i12 != 0) {
/* 276 */                           z4 = false;
                                }
/* 279 */                       if ((i2 & 64) != 0) {
/* 292 */                           j3 = ((O1OoiOIi1ooi) iloI0lOlll14.I000iOII(O1OoilIO.I00000oOI)).I00000oIO.I00100l0;
/* 294 */                           i7 &= -3670017;
                                } else {
/* 299 */                           j3 = j;
                                }
/* 301 */                       if (i5 != 0) {
/* 303 */                           illiIl1l11O2 = i1O0l00.I00000oOI;
                                }
/* 306 */                       if (i6 != 0) {
/* 308 */                           j4 = j3;
/* 309 */                           illiIl1l11O3 = illiIl1l11O2;
/* 310 */                           str4 = str3;
/* 312 */                           z8 = z4;
/* 314 */                           z7 = false;
/* 266 */                           i8 = i7;
/* 321 */                           iloI0lOlll14.I0010o();
/* 332 */                           O1ooiI111i o1ooiI111iI0001Ioi1lo = iO01II.I0001Ioi1lo(i0I1I0.I00000oOI(o1ooiI111i, j4, iO0ioilo.I00000oIO), 8.0f);
/* 336 */                           II0IlloOiO0i iI0IlloOiO0i = i1O01oOIoI0I.I00o0iI0io1;
/* 338 */                           I1IiOIiOli i1IiOIiOli = I1IiooiI1IlO.I0000Il00O;
/* 340 */                           IOOlo1O01O iOOlo1O01OI00000oIO = IOOlio0Io0.I00000oIO(i1IiOIiOli, iI0IlloOiO0i, iloI0lOlll14, 0);
/* 350 */                           int iHashCode = Long.hashCode(iloI0lOlll14.I00OI1);
/* 354 */                           OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll14.I000lI();
/* 358 */                           O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll14, o1ooiI111iI0001Ioi1lo);
/* 364 */                           IOl0oi0lOl1.I000lI.getClass();
/* 367 */                           iloI0lOlll14.I00i0oil();
/* 370 */                           z9 = iloI0lOlll14.I00O10llo;
/* 372 */                           Iloi111 iloi111 = O0iiOioolIi.I01101IOlO;
/* 374 */                           if (z9) {
/* 376 */                               iloI0lOlll14.I000l1(iloi111);
                                    } else {
/* 380 */                               iloI0lOlll14.I00io1l();
                                    }
/* 383 */                           IOioOOi0I iOioOOi0I = lolOiIoiillI.I00io1l;
/* 385 */                           li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll14, iOOlo1O01OI00000oIO);
/* 388 */                           IOioOOi0I iOioOOi0I2 = lolOiIoiillI.I00ilO0;
/* 390 */                           li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll14, oO0lO0l0I000lI);
/* 393 */                           Integer numValueOf = Integer.valueOf(iHashCode);
/* 397 */                           IOioOOi0I iOioOOi0I3 = lolOiIoiillI.I00ioIO;
/* 399 */                           li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll14, numValueOf);
/* 402 */                           li01Ooiio01.I00000oOI(iloI0lOlll14);
/* 405 */                           IOioOOi0I iOioOOi0I4 = lolOiIoiillI.I00ilI0I1;
/* 407 */                           li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll14, o1ooiI111iI0000Il00O);
/* 410 */                           II0O000iIl iI0O000iIl = i1O01oOIoI0I.I00lli11;
/* 414 */                           I1IioI i1IioII0000oI00 = I1IiooiI1IlO.I0000oI00(6.0f);
/* 418 */                           IlliIl1l11O illiIl1l11O5 = illiIl1l11O3;
/* 426 */                           O1ooiI111i o1ooiI111iI00000oIO = ii0OOOOo0i.I00000oIO(O1ooIo101ll.I00000oIO, OiI11O1i1.I00000oOI(8.0f));
/* 432 */                           int i13 = i8;
/* 440 */                           boolean z12 = (i8 & 896) == 256;
/* 441 */                           int i14 = i13 & 112;
/* 452 */                           z10 = z12 | (i14 == 32);
/* 456 */                           Object objI00O0i0ii = iloI0lOlll14.I00O0i0ii();
/* 460 */                           if (z10) {
/* 471 */                               i9 = i14;
                                    } else {
/* 462 */                               i9 = i14;
/* 466 */                               if (objI00O0i0ii != IOl11li.I00000oIO) {
/* 469 */                                   z11 = false;
                                            obj = objI00O0i0ii;
                                        }
/* 493 */                               long j5 = j4;
/* 502 */                               O1ooiI111i o1ooiI111iI0000oI00 = Ol0iOOO0.I0000oI00(i1Ioo1o0.I00000oOI(o1ooiI111iI00000oIO, z11, null, (IllOOo00lI) obj, 15), 1.0f);
/* 508 */                               OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO = OiI1iOo.I00000oIO(i1IioII0000oI00, iI0O000iIl, iloI0lOlll14, 54);
/* 514 */                               int iHashCode2 = Long.hashCode(iloI0lOlll14.I00OI1);
/* 518 */                               OO0lO0l0 oO0lO0l0I000lI2 = iloI0lOlll14.I000lI();
/* 522 */                               O1ooiI111i o1ooiI111iI0000Il00O2 = iilOllOlO1.I0000Il00O(iloI0lOlll14, o1ooiI111iI0000oI00);
/* 526 */                               iloI0lOlll14.I00i0oil();
/* 531 */                               if (iloI0lOlll14.I00O10llo) {
/* 537 */                                   iloI0lOlll14.I00io1l();
                                        } else {
/* 533 */                                   iloI0lOlll14.I000l1(iloi111);
                                        }
/* 540 */                               li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll14, oiI1iiIl1Oi0I00000oIO);
/* 543 */                               li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll14, oO0lO0l0I000lI2);
/* 546 */                               IIl001iO0Io.I001IIilI0O(iHashCode2, iloI0lOlll14, iOioOOi0I3, iloI0lOlll14);
/* 549 */                               li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll14, o1ooiI111iI0000Il00O2);
/* 552 */                               if (z) {
/* 562 */                                   ioiOolO1iOoI0000O = iOOIOl1i0OO.I00000oIO;
/* 564 */                                   if (ioiOolO1iOoI0000O == null) {
/* 587 */                                       IoiOo1iI ioiOo1iI = new IoiOo1iI("AutoMirrored.Rounded.ArrowRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
/* 592 */                                       int i15 = Ooo1iOO.I00000oIO;
/* 598 */                                       OlI00IIlOO olI00IIlOO = new OlI00IIlOO(IOOiio0i.I00000oOI);
/* 605 */                                       ArrayList arrayList = new ArrayList(32);
/* 619 */                                       arrayList.add(new OO0OIl1l10O(11.71f, 15.29f));
/* 633 */                                       arrayList.add(new OO0Oo0lIiIl(2.59f, -2.59f));
/* 660 */                                       arrayList.add(new OO0Oi1loOoi0(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f));
/* 671 */                                       arrayList.add(new OO0OIioIIl(11.71f, 8.7f));
/* 699 */                                       arrayList.add(new OO0Oi1loOoi0(-0.63f, -0.62f, -1.71f, -0.18f, -1.71f, 0.71f));
/* 710 */                                       arrayList.add(new OO0iIOIioOI(5.17f));
/* 734 */                                       arrayList.add(new OO0Oi1loOoi0(0.0f, 0.9f, 1.08f, 1.34f, 1.71f, 0.71f));
/* 739 */                                       arrayList.add(OO0IooOI.I0000Il00O);
/* 743 */                                       IoiOo1iI.I00000oOI(ioiOo1iI, arrayList, 0, olI00IIlOO);
/* 746 */                                       ioiOolO1iOoI0000O = ioiOo1iI.I0000O();
/* 750 */                                       iOOIOl1i0OO.I00000oIO = ioiOolO1iOoI0000O;
                                            }
                                        } else {
/* 554 */                                   ioiOolO1iOoI0000O = iOOI0ol111Ol.I00000oIO();
                                        }
/* 765 */                               int i16 = i9;
/* 777 */                               IoOoiI1II00i.I00000oIO(ioiOolO1iOoI0000O, null, null, 0L, iloI0lOlll1, 48, 12);
/* 786 */                               if (1.0f <= 0.0d) {
/* 791 */                                   IoliiIlI0O.I00000oIO("invalid weight; must be greater than zero");
                                        }
/* 805 */                               O0io1O o0io1O = new O0io1O(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
/* 809 */                               IOOlo1O01O iOOlo1O01OI00000oIO2 = IOOlio0Io0.I00000oIO(i1IiOIiOli, iI0IlloOiO0i, iloI0lOlll1, 0);
/* 815 */                               int iHashCode3 = Long.hashCode(iloI0lOlll1.I00OI1);
/* 819 */                               OO0lO0l0 oO0lO0l0I000lI3 = iloI0lOlll1.I000lI();
/* 823 */                               O1ooiI111i o1ooiI111iI0000Il00O3 = iilOllOlO1.I0000Il00O(iloI0lOlll1, o0io1O);
/* 827 */                               iloI0lOlll1.I00i0oil();
/* 832 */                               if (iloI0lOlll1.I00O10llo) {
/* 838 */                                   iloI0lOlll1.I00io1l();
                                        } else {
/* 834 */                                   iloI0lOlll1.I000l1(iloi111);
                                        }
/* 841 */                               li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll1, iOOlo1O01OI00000oIO2);
/* 844 */                               li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, oO0lO0l0I000lI3);
/* 847 */                               IIl001iO0Io.I001IIilI0O(iHashCode3, iloI0lOlll1, iOioOOi0I3, iloI0lOlll1);
/* 850 */                               li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll1, o1ooiI111iI0000Il00O3);
/* 853 */                               OlO1iIi1ol0 olO1iIi1ol0 = O1OoilIO.I00000oOI;
/* 958 */                               Oo0i1oIIoOO.I00000oOI(str, null, ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(olO1iIi1ol0)).I00000oIO.I00100o1O0lo, null, 0L, null, null, null, 0L, null, 0L, 5, false, 1, 0, null, Oo0lloOiiIOI.I00000oOI(((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(olO1iIi1ol0)).I00000oOI.I000iOII, 0L, 0L, !z8 ? IlilIIiIiO.I00l0OO0IO : IlilIIiIiO.I00ioIO, null, 0L, 0L, null, 16777211), iloI0lOlll1, i13 & 14, 24960, 110586);
/* 961 */                               IloI0lOlll1 iloI0lOlll15 = iloI0lOlll1;
/* 967 */                               if (str4.length() <= 0) {
/* 972 */                                   iloI0lOlll15.I00i01iIIliI(447690322);
/* 985 */                                   Oo0lloOiiIOI oo0lloOiiIOI = ((O1OoiOIi1ooi) iloI0lOlll15.I000iOII(olO1iIi1ol0)).I00000oOI.I000l1;
/* 1031 */                                  String str5 = str4;
/* 1033 */                                  Oo0i1oIIoOO.I00000oOI(str5, null, ((O1OoiOIi1ooi) iloI0lOlll15.I000iOII(olO1iIi1ol0)).I00000oIO.I0010o, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, oo0lloOiiIOI, iloI0lOlll1, (i13 >> 12) & 14, 0, 131066);
/* 1036 */                                  str3 = str5;
/* 1037 */                                  IloI0lOlll1 iloI0lOlll16 = iloI0lOlll1;
/* 1039 */                                  r12 = 0;
/* 1040 */                                  iloI0lOlll16.I0010I0i(false);
                                            iloI0lOlll13 = iloI0lOlll16;
                                        } else {
/* 1045 */                                  str3 = str4;
/* 1047 */                                  r12 = 0;
/* 1051 */                                  iloI0lOlll15.I00i01iIIliI(447853041);
/* 1054 */                                  iloI0lOlll15.I0010I0i(false);
                                            iloI0lOlll13 = iloI0lOlll15;
                                        }
/* 1058 */                              iloI0lOlll13.I0010I0i(true);
/* 1064 */                              if (z7) {
/* 1118 */                                  IlliIl1l11O illiIl1l11O6 = illiIl1l11O5;
/* 1123 */                                  iloI0lOlll13.I00i01iIIliI(-1957232999);
/* 1134 */                                  illiIl1l11O6.invoke(iloI0lOlll13, Integer.valueOf((i13 >> 21) & 14));
/* 1137 */                                  iloI0lOlll13.I0010I0i(r12);
                                            illiIl1l11O4 = illiIl1l11O6;
                                        } else {
/* 1069 */                                  iloI0lOlll13.I00i01iIIliI(-1957394726);
/* 1074 */                                  Il0l0iooI il0l0iooII0000oI00 = Il0iiiII11.I0000oI00(null, 3);
/* 1078 */                                  Il1OOloOIl1 il1OOloOIl1I0001Ioi1lo = Il0iiiII11.I0001Ioi1lo(null, 3);
/* 1084 */                                  I0I0O1O001oi i0I0O1O001oi = new I0I0O1O001oi(r12);
/* 1089 */                                  i0I0O1O001oi.I00iiI = z;
/* 1091 */                                  IlliIl1l11O illiIl1l11O7 = illiIl1l11O5;
/* 1093 */                                  i0I0O1O001oi.I00iiO = illiIl1l11O7;
/* 1095 */                                  VarHandle.storeStoreFence();
/* 1111 */                                  O1OooO0IlOo.I00000oOI(z, null, il0l0iooII0000oI00, il1OOloOIl1I0001Ioi1lo, null, iiioOl1O.I00000oOI(-1954326892, i0I0O1O001oi, iloI0lOlll13), iloI0lOlll13, 1600518 | i16);
/* 1114 */                                  iloI0lOlll13.I0010I0i(r12);
                                            illiIl1l11O4 = illiIl1l11O7;
                                        }
/* 1140 */                              iloI0lOlll13.I0010I0i(true);
/* 1143 */                              Il0l0iooI il0l0iooII0000O = Il0iiiII11.I0000O();
/* 1147 */                              Il1OOloOIl1 il1OOloOIl1I000iOII = Il0iiiII11.I000iOII();
/* 1153 */                              I0I0Oi i0I0Oi = new I0I0Oi(r12);
/* 1156 */                              iOii1l2 = iOii1l;
/* 1158 */                              i0I0Oi.I00iiI = iOii1l2;
/* 1160 */                              VarHandle.storeStoreFence();
/* 1176 */                              z5 = z;
/* 1178 */                              O1OooO0IlOo.I0000O(z5, null, il0l0iooII0000O, il1OOloOIl1I000iOII, null, iiioOl1O.I00000oOI(-1772664653, i0I0Oi, iloI0lOlll13), iloI0lOlll13, 1600518 | i16, 18);
/* 1181 */                              iloI0lOlll13.I0010I0i(true);
/* 1184 */                              illiIl1l11O2 = illiIl1l11O4;
/* 1185 */                              z4 = z8;
/* 1187 */                              z6 = z7;
/* 1189 */                              j2 = j5;
                                        iloI0lOlll12 = iloI0lOlll13;
                                    }
/* 475 */                           z11 = false;
/* 476 */                           I0I0O00 i0i0o00 = new I0I0O00(0);
/* 479 */                           i0i0o00.I00iiI = function1;
/* 481 */                           i0i0o00.I00iiO = z;
/* 483 */                           VarHandle.storeStoreFence();
/* 486 */                           iloI0lOlll14.I00iio(i0i0o00);
                                    obj = i0i0o00;
/* 493 */                           long j52 = j4;
/* 502 */                           O1ooiI111i o1ooiI111iI0000oI002 = Ol0iOOO0.I0000oI00(i1Ioo1o0.I00000oOI(o1ooiI111iI00000oIO, z11, null, (IllOOo00lI) obj, 15), 1.0f);
/* 508 */                           OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO2 = OiI1iOo.I00000oIO(i1IioII0000oI00, iI0O000iIl, iloI0lOlll14, 54);
/* 514 */                           int iHashCode22 = Long.hashCode(iloI0lOlll14.I00OI1);
/* 518 */                           OO0lO0l0 oO0lO0l0I000lI22 = iloI0lOlll14.I000lI();
/* 522 */                           O1ooiI111i o1ooiI111iI0000Il00O22 = iilOllOlO1.I0000Il00O(iloI0lOlll14, o1ooiI111iI0000oI002);
/* 526 */                           iloI0lOlll14.I00i0oil();
/* 531 */                           if (iloI0lOlll14.I00O10llo) {
                                    }
/* 540 */                           li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll14, oiI1iiIl1Oi0I00000oIO2);
/* 543 */                           li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll14, oO0lO0l0I000lI22);
/* 546 */                           IIl001iO0Io.I001IIilI0O(iHashCode22, iloI0lOlll14, iOioOOi0I3, iloI0lOlll14);
/* 549 */                           li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll14, o1ooiI111iI0000Il00O22);
/* 552 */                           if (z) {
                                    }
/* 765 */                           int i162 = i9;
/* 777 */                           IoOoiI1II00i.I00000oIO(ioiOolO1iOoI0000O, null, null, 0L, iloI0lOlll1, 48, 12);
/* 786 */                           if (1.0f <= 0.0d) {
                                    }
/* 805 */                           O0io1O o0io1O2 = new O0io1O(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
/* 809 */                           IOOlo1O01O iOOlo1O01OI00000oIO22 = IOOlio0Io0.I00000oIO(i1IiOIiOli, iI0IlloOiO0i, iloI0lOlll1, 0);
/* 815 */                           int iHashCode32 = Long.hashCode(iloI0lOlll1.I00OI1);
/* 819 */                           OO0lO0l0 oO0lO0l0I000lI32 = iloI0lOlll1.I000lI();
/* 823 */                           O1ooiI111i o1ooiI111iI0000Il00O32 = iilOllOlO1.I0000Il00O(iloI0lOlll1, o0io1O2);
/* 827 */                           iloI0lOlll1.I00i0oil();
/* 832 */                           if (iloI0lOlll1.I00O10llo) {
                                    }
/* 841 */                           li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll1, iOOlo1O01OI00000oIO22);
/* 844 */                           li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, oO0lO0l0I000lI32);
/* 847 */                           IIl001iO0Io.I001IIilI0O(iHashCode32, iloI0lOlll1, iOioOOi0I3, iloI0lOlll1);
/* 850 */                           li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll1, o1ooiI111iI0000Il00O32);
/* 853 */                           OlO1iIi1ol0 olO1iIi1ol02 = O1OoilIO.I00000oOI;
/* 958 */                           Oo0i1oIIoOO.I00000oOI(str, null, ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(olO1iIi1ol02)).I00000oIO.I00100o1O0lo, null, 0L, null, null, null, 0L, null, 0L, 5, false, 1, 0, null, Oo0lloOiiIOI.I00000oOI(((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(olO1iIi1ol02)).I00000oOI.I000iOII, 0L, 0L, !z8 ? IlilIIiIiO.I00l0OO0IO : IlilIIiIiO.I00ioIO, null, 0L, 0L, null, 16777211), iloI0lOlll1, i13 & 14, 24960, 110586);
/* 961 */                           IloI0lOlll1 iloI0lOlll152 = iloI0lOlll1;
/* 967 */                           if (str4.length() <= 0) {
                                    }
/* 1058 */                          iloI0lOlll13.I0010I0i(true);
/* 1064 */                          if (z7) {
                                    }
/* 1140 */                          iloI0lOlll13.I0010I0i(true);
/* 1143 */                          Il0l0iooI il0l0iooII0000O2 = Il0iiiII11.I0000O();
/* 1147 */                          Il1OOloOIl1 il1OOloOIl1I000iOII2 = Il0iiiII11.I000iOII();
/* 1153 */                          I0I0Oi i0I0Oi2 = new I0I0Oi(r12);
/* 1156 */                          iOii1l2 = iOii1l;
/* 1158 */                          i0I0Oi2.I00iiI = iOii1l2;
/* 1160 */                          VarHandle.storeStoreFence();
/* 1176 */                          z5 = z;
/* 1178 */                          O1OooO0IlOo.I0000O(z5, null, il0l0iooII0000O2, il1OOloOIl1I000iOII2, null, iiioOl1O.I00000oOI(-1772664653, i0I0Oi2, iloI0lOlll13), iloI0lOlll13, 1600518 | i162, 18);
/* 1181 */                          iloI0lOlll13.I0010I0i(true);
/* 1184 */                          illiIl1l11O2 = illiIl1l11O4;
/* 1185 */                          z4 = z8;
/* 1187 */                          z6 = z7;
/* 1189 */                          j2 = j52;
                                    iloI0lOlll12 = iloI0lOlll13;
                                } else {
/* 317 */                           z7 = z3;
/* 319 */                           j4 = j3;
                                }
                            } else {
/* 238 */                       iloI0lOlll14.I00OilO00Il();
/* 243 */                       if ((i2 & 64) != 0) {
/* 245 */                           i8 = i7 & (-3670017);
/* 247 */                           j4 = j;
/* 249 */                           z7 = z3;
/* 251 */                           illiIl1l11O3 = illiIl1l11O2;
/* 252 */                           str4 = str3;
/* 254 */                           z8 = z4;
/* 321 */                           iloI0lOlll14.I0010o();
/* 332 */                           O1ooiI111i o1ooiI111iI0001Ioi1lo2 = iO01II.I0001Ioi1lo(i0I1I0.I00000oOI(o1ooiI111i, j4, iO0ioilo.I00000oIO), 8.0f);
/* 336 */                           II0IlloOiO0i iI0IlloOiO0i2 = i1O01oOIoI0I.I00o0iI0io1;
/* 338 */                           I1IiOIiOli i1IiOIiOli2 = I1IiooiI1IlO.I0000Il00O;
/* 340 */                           IOOlo1O01O iOOlo1O01OI00000oIO3 = IOOlio0Io0.I00000oIO(i1IiOIiOli2, iI0IlloOiO0i2, iloI0lOlll14, 0);
/* 350 */                           int iHashCode4 = Long.hashCode(iloI0lOlll14.I00OI1);
/* 354 */                           OO0lO0l0 oO0lO0l0I000lI4 = iloI0lOlll14.I000lI();
/* 358 */                           O1ooiI111i o1ooiI111iI0000Il00O4 = iilOllOlO1.I0000Il00O(iloI0lOlll14, o1ooiI111iI0001Ioi1lo2);
/* 364 */                           IOl0oi0lOl1.I000lI.getClass();
/* 367 */                           iloI0lOlll14.I00i0oil();
/* 370 */                           z9 = iloI0lOlll14.I00O10llo;
/* 372 */                           Iloi111 iloi1112 = O0iiOioolIi.I01101IOlO;
/* 374 */                           if (z9) {
                                    }
/* 383 */                           IOioOOi0I iOioOOi0I5 = lolOiIoiillI.I00io1l;
/* 385 */                           li01Ooiio01.I0000Il00O(iOioOOi0I5, iloI0lOlll14, iOOlo1O01OI00000oIO3);
/* 388 */                           IOioOOi0I iOioOOi0I22 = lolOiIoiillI.I00ilO0;
/* 390 */                           li01Ooiio01.I0000Il00O(iOioOOi0I22, iloI0lOlll14, oO0lO0l0I000lI4);
/* 393 */                           Integer numValueOf2 = Integer.valueOf(iHashCode4);
/* 397 */                           IOioOOi0I iOioOOi0I32 = lolOiIoiillI.I00ioIO;
/* 399 */                           li01Ooiio01.I0000Il00O(iOioOOi0I32, iloI0lOlll14, numValueOf2);
/* 402 */                           li01Ooiio01.I00000oOI(iloI0lOlll14);
/* 405 */                           IOioOOi0I iOioOOi0I42 = lolOiIoiillI.I00ilI0I1;
/* 407 */                           li01Ooiio01.I0000Il00O(iOioOOi0I42, iloI0lOlll14, o1ooiI111iI0000Il00O4);
/* 410 */                           II0O000iIl iI0O000iIl2 = i1O01oOIoI0I.I00lli11;
/* 414 */                           I1IioI i1IioII0000oI002 = I1IiooiI1IlO.I0000oI00(6.0f);
/* 418 */                           IlliIl1l11O illiIl1l11O52 = illiIl1l11O3;
/* 426 */                           O1ooiI111i o1ooiI111iI00000oIO2 = ii0OOOOo0i.I00000oIO(O1ooIo101ll.I00000oIO, OiI11O1i1.I00000oOI(8.0f));
/* 432 */                           int i132 = i8;
/* 440 */                           if ((i8 & 896) == 256) {
                                    }
/* 441 */                           int i142 = i132 & 112;
/* 452 */                           z10 = z12 | (i142 == 32);
/* 456 */                           Object objI00O0i0ii2 = iloI0lOlll14.I00O0i0ii();
/* 460 */                           if (z10) {
                                    }
/* 475 */                           z11 = false;
/* 476 */                           I0I0O00 i0i0o002 = new I0I0O00(0);
/* 479 */                           i0i0o002.I00iiI = function1;
/* 481 */                           i0i0o002.I00iiO = z;
/* 483 */                           VarHandle.storeStoreFence();
/* 486 */                           iloI0lOlll14.I00iio(i0i0o002);
                                    obj = i0i0o002;
/* 493 */                           long j522 = j4;
/* 502 */                           O1ooiI111i o1ooiI111iI0000oI0022 = Ol0iOOO0.I0000oI00(i1Ioo1o0.I00000oOI(o1ooiI111iI00000oIO2, z11, null, (IllOOo00lI) obj, 15), 1.0f);
/* 508 */                           OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO22 = OiI1iOo.I00000oIO(i1IioII0000oI002, iI0O000iIl2, iloI0lOlll14, 54);
/* 514 */                           int iHashCode222 = Long.hashCode(iloI0lOlll14.I00OI1);
/* 518 */                           OO0lO0l0 oO0lO0l0I000lI222 = iloI0lOlll14.I000lI();
/* 522 */                           O1ooiI111i o1ooiI111iI0000Il00O222 = iilOllOlO1.I0000Il00O(iloI0lOlll14, o1ooiI111iI0000oI0022);
/* 526 */                           iloI0lOlll14.I00i0oil();
/* 531 */                           if (iloI0lOlll14.I00O10llo) {
                                    }
/* 540 */                           li01Ooiio01.I0000Il00O(iOioOOi0I5, iloI0lOlll14, oiI1iiIl1Oi0I00000oIO22);
/* 543 */                           li01Ooiio01.I0000Il00O(iOioOOi0I22, iloI0lOlll14, oO0lO0l0I000lI222);
/* 546 */                           IIl001iO0Io.I001IIilI0O(iHashCode222, iloI0lOlll14, iOioOOi0I32, iloI0lOlll14);
/* 549 */                           li01Ooiio01.I0000Il00O(iOioOOi0I42, iloI0lOlll14, o1ooiI111iI0000Il00O222);
/* 552 */                           if (z) {
                                    }
/* 765 */                           int i1622 = i9;
/* 777 */                           IoOoiI1II00i.I00000oIO(ioiOolO1iOoI0000O, null, null, 0L, iloI0lOlll1, 48, 12);
/* 786 */                           if (1.0f <= 0.0d) {
                                    }
/* 805 */                           O0io1O o0io1O22 = new O0io1O(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
/* 809 */                           IOOlo1O01O iOOlo1O01OI00000oIO222 = IOOlio0Io0.I00000oIO(i1IiOIiOli2, iI0IlloOiO0i2, iloI0lOlll1, 0);
/* 815 */                           int iHashCode322 = Long.hashCode(iloI0lOlll1.I00OI1);
/* 819 */                           OO0lO0l0 oO0lO0l0I000lI322 = iloI0lOlll1.I000lI();
/* 823 */                           O1ooiI111i o1ooiI111iI0000Il00O322 = iilOllOlO1.I0000Il00O(iloI0lOlll1, o0io1O22);
/* 827 */                           iloI0lOlll1.I00i0oil();
/* 832 */                           if (iloI0lOlll1.I00O10llo) {
                                    }
/* 841 */                           li01Ooiio01.I0000Il00O(iOioOOi0I5, iloI0lOlll1, iOOlo1O01OI00000oIO222);
/* 844 */                           li01Ooiio01.I0000Il00O(iOioOOi0I22, iloI0lOlll1, oO0lO0l0I000lI322);
/* 847 */                           IIl001iO0Io.I001IIilI0O(iHashCode322, iloI0lOlll1, iOioOOi0I32, iloI0lOlll1);
/* 850 */                           li01Ooiio01.I0000Il00O(iOioOOi0I42, iloI0lOlll1, o1ooiI111iI0000Il00O322);
/* 853 */                           OlO1iIi1ol0 olO1iIi1ol022 = O1OoilIO.I00000oOI;
/* 958 */                           Oo0i1oIIoOO.I00000oOI(str, null, ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(olO1iIi1ol022)).I00000oIO.I00100o1O0lo, null, 0L, null, null, null, 0L, null, 0L, 5, false, 1, 0, null, Oo0lloOiiIOI.I00000oOI(((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(olO1iIi1ol022)).I00000oOI.I000iOII, 0L, 0L, !z8 ? IlilIIiIiO.I00l0OO0IO : IlilIIiIiO.I00ioIO, null, 0L, 0L, null, 16777211), iloI0lOlll1, i132 & 14, 24960, 110586);
/* 961 */                           IloI0lOlll1 iloI0lOlll1522 = iloI0lOlll1;
/* 967 */                           if (str4.length() <= 0) {
                                    }
/* 1058 */                          iloI0lOlll13.I0010I0i(true);
/* 1064 */                          if (z7) {
                                    }
/* 1140 */                          iloI0lOlll13.I0010I0i(true);
/* 1143 */                          Il0l0iooI il0l0iooII0000O22 = Il0iiiII11.I0000O();
/* 1147 */                          Il1OOloOIl1 il1OOloOIl1I000iOII22 = Il0iiiII11.I000iOII();
/* 1153 */                          I0I0Oi i0I0Oi22 = new I0I0Oi(r12);
/* 1156 */                          iOii1l2 = iOii1l;
/* 1158 */                          i0I0Oi22.I00iiI = iOii1l2;
/* 1160 */                          VarHandle.storeStoreFence();
/* 1176 */                          z5 = z;
/* 1178 */                          O1OooO0IlOo.I0000O(z5, null, il0l0iooII0000O22, il1OOloOIl1I000iOII22, null, iiioOl1O.I00000oOI(-1772664653, i0I0Oi22, iloI0lOlll13), iloI0lOlll13, 1600518 | i1622, 18);
/* 1181 */                          iloI0lOlll13.I0010I0i(true);
/* 1184 */                          illiIl1l11O2 = illiIl1l11O4;
/* 1185 */                          z4 = z8;
/* 1187 */                          z6 = z7;
/* 1189 */                          j2 = j522;
                                    iloI0lOlll12 = iloI0lOlll13;
                                } else {
/* 257 */                           j4 = j;
/* 259 */                           z7 = z3;
                                }
                            }
/* 261 */                   illiIl1l11O3 = illiIl1l11O2;
/* 262 */                   str4 = str3;
/* 264 */                   z8 = z4;
/* 266 */                   i8 = i7;
/* 321 */                   iloI0lOlll14.I0010o();
/* 332 */                   O1ooiI111i o1ooiI111iI0001Ioi1lo22 = iO01II.I0001Ioi1lo(i0I1I0.I00000oOI(o1ooiI111i, j4, iO0ioilo.I00000oIO), 8.0f);
/* 336 */                   II0IlloOiO0i iI0IlloOiO0i22 = i1O01oOIoI0I.I00o0iI0io1;
/* 338 */                   I1IiOIiOli i1IiOIiOli22 = I1IiooiI1IlO.I0000Il00O;
/* 340 */                   IOOlo1O01O iOOlo1O01OI00000oIO32 = IOOlio0Io0.I00000oIO(i1IiOIiOli22, iI0IlloOiO0i22, iloI0lOlll14, 0);
/* 350 */                   int iHashCode42 = Long.hashCode(iloI0lOlll14.I00OI1);
/* 354 */                   OO0lO0l0 oO0lO0l0I000lI42 = iloI0lOlll14.I000lI();
/* 358 */                   O1ooiI111i o1ooiI111iI0000Il00O42 = iilOllOlO1.I0000Il00O(iloI0lOlll14, o1ooiI111iI0001Ioi1lo22);
/* 364 */                   IOl0oi0lOl1.I000lI.getClass();
/* 367 */                   iloI0lOlll14.I00i0oil();
/* 370 */                   z9 = iloI0lOlll14.I00O10llo;
/* 372 */                   Iloi111 iloi11122 = O0iiOioolIi.I01101IOlO;
/* 374 */                   if (z9) {
                            }
/* 383 */                   IOioOOi0I iOioOOi0I52 = lolOiIoiillI.I00io1l;
/* 385 */                   li01Ooiio01.I0000Il00O(iOioOOi0I52, iloI0lOlll14, iOOlo1O01OI00000oIO32);
/* 388 */                   IOioOOi0I iOioOOi0I222 = lolOiIoiillI.I00ilO0;
/* 390 */                   li01Ooiio01.I0000Il00O(iOioOOi0I222, iloI0lOlll14, oO0lO0l0I000lI42);
/* 393 */                   Integer numValueOf22 = Integer.valueOf(iHashCode42);
/* 397 */                   IOioOOi0I iOioOOi0I322 = lolOiIoiillI.I00ioIO;
/* 399 */                   li01Ooiio01.I0000Il00O(iOioOOi0I322, iloI0lOlll14, numValueOf22);
/* 402 */                   li01Ooiio01.I00000oOI(iloI0lOlll14);
/* 405 */                   IOioOOi0I iOioOOi0I422 = lolOiIoiillI.I00ilI0I1;
/* 407 */                   li01Ooiio01.I0000Il00O(iOioOOi0I422, iloI0lOlll14, o1ooiI111iI0000Il00O42);
/* 410 */                   II0O000iIl iI0O000iIl22 = i1O01oOIoI0I.I00lli11;
/* 414 */                   I1IioI i1IioII0000oI0022 = I1IiooiI1IlO.I0000oI00(6.0f);
/* 418 */                   IlliIl1l11O illiIl1l11O522 = illiIl1l11O3;
/* 426 */                   O1ooiI111i o1ooiI111iI00000oIO22 = ii0OOOOo0i.I00000oIO(O1ooIo101ll.I00000oIO, OiI11O1i1.I00000oOI(8.0f));
/* 432 */                   int i1322 = i8;
/* 440 */                   if ((i8 & 896) == 256) {
                            }
/* 441 */                   int i1422 = i1322 & 112;
/* 452 */                   z10 = z12 | (i1422 == 32);
/* 456 */                   Object objI00O0i0ii22 = iloI0lOlll14.I00O0i0ii();
/* 460 */                   if (z10) {
                            }
/* 475 */                   z11 = false;
/* 476 */                   I0I0O00 i0i0o0022 = new I0I0O00(0);
/* 479 */                   i0i0o0022.I00iiI = function1;
/* 481 */                   i0i0o0022.I00iiO = z;
/* 483 */                   VarHandle.storeStoreFence();
/* 486 */                   iloI0lOlll14.I00iio(i0i0o0022);
                            obj = i0i0o0022;
/* 493 */                   long j5222 = j4;
/* 502 */                   O1ooiI111i o1ooiI111iI0000oI00222 = Ol0iOOO0.I0000oI00(i1Ioo1o0.I00000oOI(o1ooiI111iI00000oIO22, z11, null, (IllOOo00lI) obj, 15), 1.0f);
/* 508 */                   OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO222 = OiI1iOo.I00000oIO(i1IioII0000oI0022, iI0O000iIl22, iloI0lOlll14, 54);
/* 514 */                   int iHashCode2222 = Long.hashCode(iloI0lOlll14.I00OI1);
/* 518 */                   OO0lO0l0 oO0lO0l0I000lI2222 = iloI0lOlll14.I000lI();
/* 522 */                   O1ooiI111i o1ooiI111iI0000Il00O2222 = iilOllOlO1.I0000Il00O(iloI0lOlll14, o1ooiI111iI0000oI00222);
/* 526 */                   iloI0lOlll14.I00i0oil();
/* 531 */                   if (iloI0lOlll14.I00O10llo) {
                            }
/* 540 */                   li01Ooiio01.I0000Il00O(iOioOOi0I52, iloI0lOlll14, oiI1iiIl1Oi0I00000oIO222);
/* 543 */                   li01Ooiio01.I0000Il00O(iOioOOi0I222, iloI0lOlll14, oO0lO0l0I000lI2222);
/* 546 */                   IIl001iO0Io.I001IIilI0O(iHashCode2222, iloI0lOlll14, iOioOOi0I322, iloI0lOlll14);
/* 549 */                   li01Ooiio01.I0000Il00O(iOioOOi0I422, iloI0lOlll14, o1ooiI111iI0000Il00O2222);
/* 552 */                   if (z) {
                            }
/* 765 */                   int i16222 = i9;
/* 777 */                   IoOoiI1II00i.I00000oIO(ioiOolO1iOoI0000O, null, null, 0L, iloI0lOlll1, 48, 12);
/* 786 */                   if (1.0f <= 0.0d) {
                            }
/* 805 */                   O0io1O o0io1O222 = new O0io1O(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
/* 809 */                   IOOlo1O01O iOOlo1O01OI00000oIO2222 = IOOlio0Io0.I00000oIO(i1IiOIiOli22, iI0IlloOiO0i22, iloI0lOlll1, 0);
/* 815 */                   int iHashCode3222 = Long.hashCode(iloI0lOlll1.I00OI1);
/* 819 */                   OO0lO0l0 oO0lO0l0I000lI3222 = iloI0lOlll1.I000lI();
/* 823 */                   O1ooiI111i o1ooiI111iI0000Il00O3222 = iilOllOlO1.I0000Il00O(iloI0lOlll1, o0io1O222);
/* 827 */                   iloI0lOlll1.I00i0oil();
/* 832 */                   if (iloI0lOlll1.I00O10llo) {
                            }
/* 841 */                   li01Ooiio01.I0000Il00O(iOioOOi0I52, iloI0lOlll1, iOOlo1O01OI00000oIO2222);
/* 844 */                   li01Ooiio01.I0000Il00O(iOioOOi0I222, iloI0lOlll1, oO0lO0l0I000lI3222);
/* 847 */                   IIl001iO0Io.I001IIilI0O(iHashCode3222, iloI0lOlll1, iOioOOi0I322, iloI0lOlll1);
/* 850 */                   li01Ooiio01.I0000Il00O(iOioOOi0I422, iloI0lOlll1, o1ooiI111iI0000Il00O3222);
/* 853 */                   OlO1iIi1ol0 olO1iIi1ol0222 = O1OoilIO.I00000oOI;
/* 958 */                   Oo0i1oIIoOO.I00000oOI(str, null, ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(olO1iIi1ol0222)).I00000oIO.I00100o1O0lo, null, 0L, null, null, null, 0L, null, 0L, 5, false, 1, 0, null, Oo0lloOiiIOI.I00000oOI(((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(olO1iIi1ol0222)).I00000oOI.I000iOII, 0L, 0L, !z8 ? IlilIIiIiO.I00l0OO0IO : IlilIIiIiO.I00ioIO, null, 0L, 0L, null, 16777211), iloI0lOlll1, i1322 & 14, 24960, 110586);
/* 961 */                   IloI0lOlll1 iloI0lOlll15222 = iloI0lOlll1;
/* 967 */                   if (str4.length() <= 0) {
                            }
/* 1058 */                  iloI0lOlll13.I0010I0i(true);
/* 1064 */                  if (z7) {
                            }
/* 1140 */                  iloI0lOlll13.I0010I0i(true);
/* 1143 */                  Il0l0iooI il0l0iooII0000O222 = Il0iiiII11.I0000O();
/* 1147 */                  Il1OOloOIl1 il1OOloOIl1I000iOII222 = Il0iiiII11.I000iOII();
/* 1153 */                  I0I0Oi i0I0Oi222 = new I0I0Oi(r12);
/* 1156 */                  iOii1l2 = iOii1l;
/* 1158 */                  i0I0Oi222.I00iiI = iOii1l2;
/* 1160 */                  VarHandle.storeStoreFence();
/* 1176 */                  z5 = z;
/* 1178 */                  O1OooO0IlOo.I0000O(z5, null, il0l0iooII0000O222, il1OOloOIl1I000iOII222, null, iiioOl1O.I00000oOI(-1772664653, i0I0Oi222, iloI0lOlll13), iloI0lOlll13, 1600518 | i16222, 18);
/* 1181 */                  iloI0lOlll13.I0010I0i(true);
/* 1184 */                  illiIl1l11O2 = illiIl1l11O4;
/* 1185 */                  z4 = z8;
/* 1187 */                  z6 = z7;
/* 1189 */                  j2 = j5222;
                            iloI0lOlll12 = iloI0lOlll13;
                        }
/* 1202 */              oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 1206 */              if (oOloioIlI001IO000 == null) {
/* 1210 */                  I0I0Oi10oI i0I0Oi10oI = new I0I0Oi10oI();
/* 1215 */                  i0I0Oi10oI.I00iOIl = str;
/* 1217 */                  i0I0Oi10oI.I00iiI = z5;
/* 1221 */                  i0I0Oi10oI.I00iiO = function1;
/* 1225 */                  i0I0Oi10oI.I00iio = o1ooiI111i;
/* 1227 */                  i0I0Oi10oI.I00ilI0I1 = str3;
/* 1229 */                  i0I0Oi10oI.I00ilO0 = z4;
/* 1231 */                  i0I0Oi10oI.I00io1l = j2;
/* 1233 */                  i0I0Oi10oI.I00ioIO = illiIl1l11O2;
/* 1235 */                  i0I0Oi10oI.I00l0I0l0lO1 = z6;
/* 1237 */                  i0I0Oi10oI.I00l0OO0IO = iOii1l2;
/* 1241 */                  i0I0Oi10oI.I00li1OI = i;
/* 1245 */                  i0I0Oi10oI.I00ll1 = i2;
/* 1247 */                  VarHandle.storeStoreFence();
/* 1250 */                  oOloioIlI001IO000.I0000O = i0I0Oi10oI;
/* 1578 */                  return;
                        }
/* 1578 */              return;
                    }
/* 95 */            i3 |= 196608;
/* 96 */            z4 = z2;
/* 136 */           i4 = i3 | (((i2 & 64) == 0 || !iloI0lOlll14.I0001Ioi1lo(j)) ? 524288 : 1048576);
/* 137 */           i5 = i2 & Barcode.FORMAT_ITF;
/* 141 */           if (i5 == 0) {
                    }
/* 167 */           i6 = i2 & Barcode.FORMAT_QR_CODE;
/* 171 */           if (i6 == 0) {
                    }
/* 202 */           i7 = i4;
/* 219 */           if (iloI0lOlll14.I00OIl(i7 & 1, (i4 & 306783379) == 306783378)) {
                    }
/* 1202 */          oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 1206 */          if (oOloioIlI001IO000 == null) {
                    }
                }
            }

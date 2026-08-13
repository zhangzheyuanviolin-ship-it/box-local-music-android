            package p000;

            import android.util.Log;
            import java.io.IOException;
            import java.util.HashMap;
            import java.util.LinkedHashMap;
            
            public final class Io0OiI0l0Iio extends OlliIl0 {
                public LinkedHashMap I0001Ioi1lo;
                public Io0OIllo0o0[] I000II;
                public IOOOi1[] I000O01llI0;
                public HashMap I000OOo1O;
                public HashMap I000OiO;
                public String I000iOII;

                public static IO0i1l1Io I00000oOI(IoiOloi ioiOloi, long j) throws IOException {
/* 1 */             ioiOloi.I00Ol00(j);
/* 4 */             int iI00OIl = ioiOloi.I00OIl();
/* 8 */             int i = 0;
/* 10 */            if (iI00OIl == 1) {
/* 78 */                Io0O1i io0O1i = new Io0O1i(0);
/* 81 */                io0O1i.I00iOIl = iI00OIl;
/* 83 */                int iI00OIl2 = ioiOloi.I00OIl();
/* 89 */                io0O1i.I00iiO = new int[iI00OIl2];
/* 91 */                while (i < iI00OIl2) {
/* 101 */                   ((int[]) io0O1i.I00iiO)[i] = ioiOloi.I00OIl();
/* 103 */                   i++;
                        }
/* 551 */               return io0O1i;
                    }
/* 13 */            if (iI00OIl != 2) {
/* 71 */                IioIoO10iOiI.I000OOo1O(Oi010OO0.I000oI1ioi(iI00OIl, "Unknown coverage format: "));
/* 74 */                return null;
                    }
/* 17 */            Io0O1i io0O1i2 = new Io0O1i(1);
/* 20 */            io0O1i2.I00iOIl = iI00OIl;
/* 22 */            int iI00OIl3 = ioiOloi.I00OIl();
/* 28 */            io0O1i2.I00iiO = new IioIO1i[iI00OIl3];
/* 30 */            while (i < iI00OIl3) {
/* 34 */                IioIO1i[] iioIO1iArr = (IioIO1i[]) io0O1i2.I00iiO;
/* 38 */                IioIO1i iioIO1i = new IioIO1i(1);
/* 45 */                iioIO1i.I00000oOI = ioiOloi.I00OIl();
/* 51 */                iioIO1i.I0000Il00O = ioiOloi.I00OIl();
/* 57 */                iioIO1i.I0000O = ioiOloi.I00OIl();
/* 59 */                iioIO1iArr[i] = iioIO1i;
/* 61 */                i++;
                    }
/* 64 */            return io0O1i2;
                }

                public static Io0OO1lo1 I0000Il00O(IoiOloi ioiOloi, long j) {
/* 1 */             ioiOloi.I00Ol00(j);
/* 6 */             Io0OO1lo1 io0OO1lo1 = new Io0OO1lo1();
/* 9 */             ioiOloi.I00OIl();
/* 16 */            io0OO1lo1.I00000oIO = ioiOloi.I00OIl();
/* 18 */            int iI00OIl = ioiOloi.I00OIl();
/* 24 */            io0OO1lo1.I00000oOI = new int[iI00OIl];
/* 27 */            for (int i = 0; i < iI00OIl; i++) {
/* 35 */                io0OO1lo1.I00000oOI[i] = ioiOloi.I00OIl();
                    }
/* 89 */            return io0OO1lo1;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r12v8, types: [IOOOI0[]] */
                /* JADX WARN: Type inference failed for: r3v2, types: [IOOOI0, Io0OOIO0o1, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r3v3 */
                /* JADX WARN: Type inference failed for: r3v5, types: [IOOOI0, Io0Oi1o1OOI, java.lang.Object] */
                @Override
                public final void I00000oIO(OoIllIioi1l ooIllIioi1l, IoiOloi ioiOloi) throws IOException {
                    int i;
                    int i2;
                    int[] iArr;
                    ?? io0OOIO0o1;
/* 5 */             long jI000II = ioiOloi.I000II();
/* 9 */             ioiOloi.I00OIl();
/* 12 */            int iI00OIl = ioiOloi.I00OIl();
/* 16 */            int iI00OIl2 = ioiOloi.I00OIl();
/* 20 */            int iI00OIl3 = ioiOloi.I00OIl();
/* 24 */            int iI00OIl4 = ioiOloi.I00OIl();
/* 33 */            if (iI00OIl == 1) {
/* 35 */                ioiOloi.I00IoiI();
                    }
/* 39 */            long j = iI00OIl2 + jI000II;
/* 40 */            ioiOloi.I00Ol00(j);
/* 43 */            int iI00OIl5 = ioiOloi.I00OIl();
/* 47 */            IIlio101Io[] iIlio101IoArr = new IIlio101Io[iI00OIl5];
/* 49 */            int[] iArr2 = new int[iI00OIl5];
/* 53 */            for (int i3 = 0; i3 < iI00OIl5; i3++) {
/* 59 */                IIlio101Io iIlio101Io = new IIlio101Io(14);
/* 68 */                iIlio101Io.I00iiI = ioiOloi.I00Io1lO(4, IO1IOO01oiO.I00000oIO);
/* 74 */                iArr2[i3] = ioiOloi.I00OIl();
/* 76 */                iIlio101IoArr[i3] = iIlio101Io;
                    }
/* 81 */            int i4 = 0;
/* 84 */            while (i4 < iI00OIl5) {
/* 86 */                IIlio101Io iIlio101Io2 = iIlio101IoArr[i4];
/* 93 */                long j2 = iArr2[i4] + j;
/* 94 */                ioiOloi.I00Ol00(j2);
/* 99 */                Io0OiI01l1io io0OiI01l1io = new Io0OiI01l1io();
/* 102 */               long j3 = jI000II;
/* 104 */               int iI00OIl6 = ioiOloi.I00OIl();
/* 108 */               int iI00OIl7 = ioiOloi.I00OIl();
/* 112 */               long j4 = j;
/* 114 */               I1I0i0Ilo1Oi[] i1I0i0Ilo1OiArr = new I1I0i0Ilo1Oi[iI00OIl7];
/* 116 */               int[] iArr3 = new int[iI00OIl7];
/* 82 */                String str = "";
/* 124 */               int i5 = 0;
/* 125 */               while (i5 < iI00OIl7) {
/* 127 */                   int i6 = i5;
/* 131 */                   IIlio101Io[] iIlio101IoArr2 = iIlio101IoArr;
/* 135 */                   I1I0i0Ilo1Oi i1I0i0Ilo1Oi = new I1I0i0Ilo1Oi(13);
/* 140 */                   int[] iArr4 = iArr2;
/* 143 */                   String strI00Io1lO = ioiOloi.I00Io1lO(4, IO1IOO01oiO.I00000oIO);
/* 147 */                   i1I0i0Ilo1Oi.I00iiI = strI00Io1lO;
/* 149 */                   if (i6 > 0 && strI00Io1lO.compareTo(str) <= 0) {
/* 175 */                       IioIoO10iOiI.I000OOo1O(IIlIOloOOO.I0010I0i(new StringBuilder("LangSysRecords not alphabetically sorted by LangSys tag: "), (String) i1I0i0Ilo1Oi.I00iiI, " <= ", str));
/* 178 */                       return;
                            }
/* 183 */                   iArr3[i6] = ioiOloi.I00OIl();
/* 185 */                   i1I0i0Ilo1OiArr[i6] = i1I0i0Ilo1Oi;
/* 189 */                   str = (String) i1I0i0Ilo1Oi.I00iiI;
/* 191 */                   i5 = i6 + 1;
/* 193 */                   iIlio101IoArr = iIlio101IoArr2;
/* 195 */                   iArr2 = iArr4;
                        }
/* 198 */               IIlio101Io[] iIlio101IoArr3 = iIlio101IoArr;
/* 200 */               int[] iArr5 = iArr2;
/* 202 */               if (iI00OIl6 != 0) {
/* 210 */                   io0OiI01l1io.I00000oIO = I0000Il00O(ioiOloi, iI00OIl6 + j2);
                        }
/* 213 */               for (int i7 = 0; i7 < iI00OIl7; i7++) {
/* 225 */                   i1I0i0Ilo1OiArr[i7].I00iiO = I0000Il00O(ioiOloi, iArr3[i7] + j2);
                        }
/* 235 */               io0OiI01l1io.I00000oOI = new LinkedHashMap(iI00OIl7);
/* 238 */               for (int i8 = 0; i8 < iI00OIl7; i8++) {
/* 240 */                   I1I0i0Ilo1Oi i1I0i0Ilo1Oi2 = i1I0i0Ilo1OiArr[i8];
/* 252 */                   io0OiI01l1io.I00000oOI.put((String) i1I0i0Ilo1Oi2.I00iiI, (Io0OO1lo1) i1I0i0Ilo1Oi2.I00iiO);
                        }
/* 258 */               iIlio101Io2.I00iiO = io0OiI01l1io;
/* 260 */               i4++;
/* 262 */               jI000II = j3;
/* 264 */               j = j4;
/* 266 */               iIlio101IoArr = iIlio101IoArr3;
/* 268 */               iArr2 = iArr5;
                    }
/* 273 */           long j5 = jI000II;
/* 275 */           IIlio101Io[] iIlio101IoArr4 = iIlio101IoArr;
/* 281 */           LinkedHashMap linkedHashMap = new LinkedHashMap(iI00OIl5);
/* 285 */           for (int i9 = 0; i9 < iI00OIl5; i9++) {
/* 287 */               IIlio101Io iIlio101Io3 = iIlio101IoArr4[i9];
/* 297 */               linkedHashMap.put((String) iIlio101Io3.I00iiI, (Io0OiI01l1io) iIlio101Io3.I00iiO);
                    }
/* 303 */           this.I0001Ioi1lo = linkedHashMap;
/* 306 */           long j6 = j5 + iI00OIl3;
/* 308 */           ioiOloi.I00Ol00(j6);
/* 311 */           int iI00OIl8 = ioiOloi.I00OIl();
/* 315 */           Io0OIllo0o0[] io0OIllo0o0Arr = new Io0OIllo0o0[iI00OIl8];
/* 317 */           int[] iArr6 = new int[iI00OIl8];
/* 82 */            String str2 = "";
/* 322 */           for (int i10 = 0; i10 < iI00OIl8; i10++) {
/* 326 */               Io0OIllo0o0 io0OIllo0o0 = new Io0OIllo0o0();
/* 332 */               String strI00Io1lO2 = ioiOloi.I00Io1lO(4, IO1IOO01oiO.I00000oIO);
/* 336 */               io0OIllo0o0.I00000oIO = strI00Io1lO2;
/* 338 */               if (i10 > 0 && strI00Io1lO2.compareTo(str2) < 0 && (!io0OIllo0o0.I00000oIO.matches("\\w{4}") || !str2.matches("\\w{4}"))) {
/* 390 */                   Log.w("PdfBox-Android", "FeatureRecord array not alphabetically sorted by FeatureTag: " + io0OIllo0o0.I00000oIO + " < " + str2);
/* 393 */                   i = 0;
/* 394 */                   io0OIllo0o0Arr = new Io0OIllo0o0[0];
                            break;
                        }
/* 401 */               iArr6[i10] = ioiOloi.I00OIl();
/* 403 */               io0OIllo0o0Arr[i10] = io0OIllo0o0;
/* 405 */               str2 = io0OIllo0o0.I00000oIO;
                    }
/* 410 */           i = 0;
/* 412 */           for (int i11 = 0; i11 < iI00OIl8; i11++) {
/* 414 */               Io0OIllo0o0 io0OIllo0o02 = io0OIllo0o0Arr[i11];
/* 420 */               ioiOloi.I00Ol00(iArr6[i11] + j6);
/* 427 */               IIOOoll iIOOoll = new IIOOoll(15);
/* 430 */               ioiOloi.I00OIl();
/* 433 */               int iI00OIl9 = ioiOloi.I00OIl();
/* 439 */               iIOOoll.I00iiI = new int[iI00OIl9];
/* 442 */               for (int i12 = 0; i12 < iI00OIl9; i12++) {
/* 452 */                   ((int[]) iIOOoll.I00iiI)[i12] = ioiOloi.I00OIl();
                        }
/* 457 */               io0OIllo0o02.I00000oOI = iIOOoll;
                    }
/* 462 */           this.I000II = io0OIllo0o0Arr;
/* 465 */           long j7 = j5 + iI00OIl4;
/* 467 */           ioiOloi.I00Ol00(j7);
/* 470 */           int iI00OIl10 = ioiOloi.I00OIl();
/* 474 */           int[] iArr7 = new int[iI00OIl10];
/* 477 */           for (int i13 = i; i13 < iI00OIl10; i13++) {
/* 483 */               iArr7[i13] = ioiOloi.I00OIl();
                    }
/* 488 */           IOOOi1[] iOOOi1Arr = new IOOOi1[iI00OIl10];
/* 490 */           int i14 = i;
/* 491 */           while (i14 < iI00OIl10) {
/* 496 */               long j8 = iArr7[i14] + j7;
/* 497 */               ioiOloi.I00Ol00(j8);
/* 503 */               IOOOi1 iOOOi1 = new IOOOi1(4);
/* 510 */               iOOOi1.I00000oOI = ioiOloi.I00OIl();
/* 516 */               iOOOi1.I0000Il00O = ioiOloi.I00OIl();
/* 518 */               int iI00OIl11 = ioiOloi.I00OIl();
/* 522 */               int[] iArr8 = new int[iI00OIl11];
/* 525 */               for (int i15 = i; i15 < iI00OIl11; i15++) {
/* 531 */                   iArr8[i15] = ioiOloi.I00OIl();
                        }
/* 540 */               if ((iOOOi1.I0000Il00O & 16) != 0) {
/* 546 */                   iOOOi1.I0000O = ioiOloi.I00OIl();
                        }
/* 550 */               iOOOi1.I0000oI00 = new IOOOI0[iI00OIl11];
/* 555 */               if (iOOOi1.I00000oOI == 1) {
/* 564 */                   int i16 = 0;
/* 565 */                   while (i16 < iI00OIl11) {
/* 569 */                       ?? r12 = (IOOOI0[]) iOOOi1.I0000oI00;
/* 573 */                       long j9 = j7;
/* 576 */                       long j10 = iArr8[i16] + j8;
/* 577 */                       ioiOloi.I00Ol00(j10);
/* 580 */                       int iI00OIl12 = ioiOloi.I00OIl();
/* 587 */                       if (iI00OIl12 == 1) {
/* 652 */                           i2 = iI00OIl10;
/* 654 */                           iArr = iArr7;
/* 657 */                           io0OOIO0o1 = new Io0OOIO0o1();
/* 660 */                           io0OOIO0o1.I00000oIO = iI00OIl12;
/* 662 */                           int iI00OIl13 = ioiOloi.I00OIl();
/* 670 */                           io0OOIO0o1.I0000Il00O = ioiOloi.I00IioO0OiOi();
/* 679 */                           io0OOIO0o1.I00000oOI = I00000oOI(ioiOloi, j10 + iI00OIl13);
                                } else {
/* 590 */                           if (iI00OIl12 != 2) {
/* 648 */                               IioIoO10iOiI.I000OOo1O(Oi010OO0.I000oI1ioi(iI00OIl12, "Unknown substFormat: "));
/* 651 */                               return;
                                    }
/* 594 */                           io0OOIO0o1 = new Io0Oi1o1OOI();
/* 597 */                           io0OOIO0o1.I00000oIO = iI00OIl12;
/* 599 */                           int iI00OIl14 = ioiOloi.I00OIl();
/* 603 */                           int iI00OIl15 = ioiOloi.I00OIl();
/* 607 */                           i2 = iI00OIl10;
/* 611 */                           io0OOIO0o1.I0000Il00O = new int[iI00OIl15];
/* 613 */                           int i17 = 0;
/* 614 */                           while (i17 < iI00OIl15) {
/* 624 */                               io0OOIO0o1.I0000Il00O[i17] = ioiOloi.I00OIl();
/* 626 */                               i17++;
/* 628 */                               iI00OIl15 = iI00OIl15;
                                    }
/* 631 */                           iArr = iArr7;
/* 639 */                           io0OOIO0o1.I00000oOI = I00000oOI(ioiOloi, j10 + iI00OIl14);
                                }
/* 681 */                       r12[i16] = io0OOIO0o1;
/* 683 */                       i16++;
/* 685 */                       iArr7 = iArr;
/* 686 */                       j7 = j9;
/* 688 */                       iI00OIl10 = i2;
                            }
                        }
/* 557 */               long j11 = j7;
/* 559 */               int i18 = iI00OIl10;
/* 561 */               int[] iArr9 = iArr7;
/* 693 */               iOOOi1Arr[i14] = iOOOi1;
/* 695 */               i14++;
/* 697 */               iArr7 = iArr9;
/* 698 */               j7 = j11;
/* 700 */               iI00OIl10 = i18;
/* 702 */               i = 0;
                    }
/* 705 */           this.I000O01llI0 = iOOOi1Arr;
                }
            }

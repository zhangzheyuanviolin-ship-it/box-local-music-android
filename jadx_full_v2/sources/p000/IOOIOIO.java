            package p000;

            import android.util.Log;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.HashMap;
            
            public final class IOOIOIO extends OlliIl0 {
                public IOOIO1lI1ll[] I0001Ioi1lo;

                /* JADX WARN: Code restructure failed: missing block: B:110:0x020a, code lost:
                
                    p000.IioIoO10iOiI.I000OOo1O("Invalid character code ".concat(java.lang.String.format("0x%X", java.lang.Long.valueOf(r26))));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:112:0x021e, code lost:
                
                    p000.IioIoO10iOiI.I000OOo1O("Invalid character code ".concat(java.lang.String.format("0x%X", java.lang.Long.valueOf(r14))));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:128:0x0261, code lost:
                
                    p000.IioIoO10iOiI.I000OOo1O("Invalid character codes, ".concat(java.lang.String.format("startCode: 0x%X, numChars: %d", java.lang.Long.valueOf(r2), java.lang.Long.valueOf(r5))));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:174:0x036a, code lost:
                
                    p000.IioIoO10iOiI.I000OOo1O("Range invalid");
                 */
                /* JADX WARN: Code restructure failed: missing block: B:70:0x014b, code lost:
                
                    p000.IioIoO10iOiI.I000OOo1O("Invalid character code ".concat(java.lang.String.format("0x%X", java.lang.Long.valueOf(r30))));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:72:0x015f, code lost:
                
                    p000.IioIoO10iOiI.I000OOo1O("Invalid character code ".concat(java.lang.String.format("0x%X", java.lang.Long.valueOf(r28))));
                 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00000oIO(OoIllIioi1l ooIllIioi1l, IoiOloi ioiOloi) throws IOException {
                    int i;
                    int i2;
                    int i3;
                    int i4;
                    int i5;
                    int i6;
                    int i7;
                    long j;
                    int[] iArr;
                    int i8;
                    long j2;
                    long j3;
/* 5 */             ioiOloi.I00OIl();
/* 8 */             int iI00OIl = ioiOloi.I00OIl();
/* 14 */            this.I0001Ioi1lo = new IOOIO1lI1ll[iI00OIl];
/* 17 */            for (int i9 = 0; i9 < iI00OIl; i9++) {
/* 21 */                IOOIO1lI1ll iOOIO1lI1ll = new IOOIO1lI1ll();
/* 29 */                iOOIO1lI1ll.I00ilI0I1 = new HashMap();
/* 36 */                iOOIO1lI1ll.I00ilO0 = new HashMap();
/* 38 */                VarHandle.storeStoreFence();
/* 45 */                iOOIO1lI1ll.I00iOIl = ioiOloi.I00OIl();
/* 51 */                iOOIO1lI1ll.I00iiI = ioiOloi.I00OIl();
/* 57 */                iOOIO1lI1ll.I00iiO = ioiOloi.I00IoiI();
/* 61 */                this.I0001Ioi1lo[i9] = iOOIO1lI1ll;
                    }
/* 66 */            int iI001l0I00 = ooIllIioi1l.I001l0I00();
/* 70 */            int i10 = 0;
                    while (true) {
/* 71 */                int i11 = 1;
/* 72 */                if (i10 >= iI00OIl) {
/* 1425 */                  this.I0000O = true;
/* 1427 */                  return;
                        }
/* 76 */                IOOIO1lI1ll iOOIO1lI1ll2 = this.I0001Ioi1lo[i10];
/* 78 */                iOOIO1lI1ll2.getClass();
/* 86 */                ioiOloi.I00Ol00(this.I00000oOI + iOOIO1lI1ll2.I00iiO);
/* 89 */                int iI00OIl2 = ioiOloi.I00OIl();
/* 95 */                if (iI00OIl2 < 8) {
/* 97 */                    ioiOloi.I00OIl();
/* 100 */                   ioiOloi.I00OIl();
                        } else {
/* 104 */                   ioiOloi.I00OIl();
/* 107 */                   ioiOloi.I00IoiI();
/* 110 */                   ioiOloi.I00IoiI();
                        }
/* 115 */               if (iI00OIl2 == 0) {
/* 1370 */                  i = iI00OIl;
/* 1371 */                  i2 = i10;
/* 1373 */                  byte[] bArrI00100l0 = ioiOloi.I00100l0(Barcode.FORMAT_QR_CODE);
/* 1381 */                  iOOIO1lI1ll2.I00iio = IOOIO1lI1ll.I00000oOI(Barcode.FORMAT_QR_CODE);
/* 1389 */                  iOOIO1lI1ll2.I00ilO0 = new HashMap(bArrI00100l0.length);
/* 1393 */                  for (int i12 = 0; i12 < bArrI00100l0.length; i12++) {
/* 1397 */                      int i13 = bArrI00100l0[i12] & 255;
/* 1401 */                      iOOIO1lI1ll2.I00iio[i13] = i12;
/* 1413 */                      iOOIO1lI1ll2.I00ilO0.put(Integer.valueOf(i12), Integer.valueOf(i13));
                            }
                        } else if (iI00OIl2 == 2) {
/* 1155 */                  i = iI00OIl;
/* 1156 */                  i2 = i10;
/* 1160 */                  int[] iArr2 = new int[Barcode.FORMAT_QR_CODE];
/* 1163 */                  int iMax = 0;
/* 1164 */                  for (int i14 = 0; i14 < 256; i14++) {
/* 1166 */                      int iI00OIl3 = ioiOloi.I00OIl();
/* 1170 */                      iArr2[i14] = iI00OIl3;
/* 1173 */                      iMax = Math.max(iMax, iI00OIl3 / 8);
                            }
/* 1182 */                  IOOI1iII1oi[] iOOI1iII1oiArr = new IOOI1iII1oi[iMax + 1];
/* 1185 */                  for (int i15 = 0; i15 <= iMax; i15++) {
/* 1187 */                      int iI00OIl4 = ioiOloi.I00OIl();
/* 1191 */                      int iI00OIl5 = ioiOloi.I00OIl();
/* 1195 */                      short sI00IioO0OiOi = ioiOloi.I00IioO0OiOi();
                                int iI00OIl6 = (ioiOloi.I00OIl() - (((r2 - i15) - 1) * 8)) - 2;
/* 1215 */                      IOOI1iII1oi iOOI1iII1oi = new IOOI1iII1oi();
/* 1218 */                      iOOI1iII1oi.I00000oIO = iI00OIl4;
/* 1220 */                      iOOI1iII1oi.I00000oOI = iI00OIl5;
/* 1222 */                      iOOI1iII1oi.I0000Il00O = sI00IioO0OiOi;
/* 1224 */                      iOOI1iII1oi.I0000O = iI00OIl6;
/* 1226 */                      VarHandle.storeStoreFence();
/* 1229 */                      iOOI1iII1oiArr[i15] = iOOI1iII1oi;
                            }
/* 1237 */                  long jI000II = ioiOloi.I000II();
/* 1245 */                  iOOIO1lI1ll2.I00iio = IOOIO1lI1ll.I00000oOI(iI001l0I00);
/* 1252 */                  iOOIO1lI1ll2.I00ilO0 = new HashMap(iI001l0I00);
/* 1254 */                  if (iI001l0I00 == 0) {
/* 1256 */                      Log.w("PdfBox-Android", "subtable has no glyphs");
                            } else {
/* 1261 */                      int i16 = 0;
/* 1262 */                      while (i16 <= iMax) {
/* 1264 */                          IOOI1iII1oi iOOI1iII1oi2 = iOOI1iII1oiArr[i16];
/* 1266 */                          int i17 = iOOI1iII1oi2.I00000oIO;
/* 1268 */                          int i18 = iOOI1iII1oi2.I0000O;
/* 1270 */                          short s = iOOI1iII1oi2.I0000Il00O;
/* 1272 */                          int i19 = iOOI1iII1oi2.I00000oOI;
/* 1274 */                          int i20 = i16;
/* 1276 */                          IOOI1iII1oi[] iOOI1iII1oiArr2 = iOOI1iII1oiArr;
/* 1279 */                          ioiOloi.I00Ol00(i18 + jI000II);
/* 1282 */                          int i21 = 0;
/* 1283 */                          while (i21 < i19) {
/* 1289 */                              int i22 = i17 + i21 + (i20 << 8);
/* 1290 */                              int iI00OIl7 = ioiOloi.I00OIl();
/* 1294 */                              if (iI00OIl7 > 0 && (iI00OIl7 = (iI00OIl7 + s) % 65536) < 0) {
/* 1303 */                                  iI00OIl7 += 65536;
                                        }
/* 1305 */                              if (iI00OIl7 >= iI001l0I00) {
/* 1307 */                                  i3 = i21;
/* 1311 */                                  i4 = iMax;
/* 1315 */                                  i5 = i19;
/* 1319 */                                  StringBuilder sbI0010I0i = IIl001iO0Io.I0010I0i("glyphId ", iI00OIl7, " for charcode ", i22, " ignored, numGlyphs is ");
/* 1323 */                                  sbI0010I0i.append(iI001l0I00);
/* 1330 */                                  Log.w("PdfBox-Android", sbI0010I0i.toString());
                                        } else {
/* 1334 */                                  i3 = i21;
/* 1336 */                                  i4 = iMax;
/* 1338 */                                  i5 = i19;
/* 1342 */                                  iOOIO1lI1ll2.I00iio[iI00OIl7] = i22;
/* 1354 */                                  iOOIO1lI1ll2.I00ilO0.put(Integer.valueOf(i22), Integer.valueOf(iI00OIl7));
                                        }
/* 1357 */                              i21 = i3 + 1;
/* 1359 */                              iMax = i4;
/* 1361 */                              i19 = i5;
                                    }
/* 1366 */                          i16 = i20 + 1;
/* 1368 */                          iOOI1iII1oiArr = iOOI1iII1oiArr2;
                                }
                            }
                        } else if (iI00OIl2 == 4) {
/* 948 */                   i = iI00OIl;
/* 949 */                   i2 = i10;
/* 955 */                   int iI00OIl8 = ioiOloi.I00OIl() / 2;
/* 956 */                   ioiOloi.I00OIl();
/* 959 */                   ioiOloi.I00OIl();
/* 962 */                   ioiOloi.I00OIl();
/* 965 */                   int[] iArrI00OOll1 = ioiOloi.I00OOll1(iI00OIl8);
/* 969 */                   ioiOloi.I00OIl();
/* 972 */                   int[] iArrI00OOll12 = ioiOloi.I00OOll1(iI00OIl8);
/* 976 */                   int[] iArrI00OOll13 = ioiOloi.I00OOll1(iI00OIl8);
/* 980 */                   long jI000II2 = ioiOloi.I000II();
/* 984 */                   int[] iArrI00OOll14 = ioiOloi.I00OOll1(iI00OIl8);
/* 993 */                   iOOIO1lI1ll2.I00ilO0 = new HashMap(iI001l0I00);
/* 995 */                   int i23 = 0;
/* 996 */                   int iMax2 = 0;
/* 997 */                   while (i23 < iI00OIl8) {
/* 999 */                       int i24 = iArrI00OOll12[i23];
/* 1001 */                      int i25 = iI00OIl8;
/* 1003 */                      int i26 = iArrI00OOll1[i23];
/* 1005 */                      int i27 = iArrI00OOll13[i23];
/* 1007 */                      int[] iArr3 = iArrI00OOll1;
/* 1009 */                      int i28 = iArrI00OOll14[i23];
/* 1011 */                      int[] iArr4 = iArrI00OOll12;
/* 1013 */                      int[] iArr5 = iArrI00OOll13;
/* 1024 */                      long j4 = (i23 * 2) + jI000II2 + i28;
/* 1031 */                      if (i24 != 65535 && i26 != 65535) {
/* 1037 */                          int i29 = i24;
/* 1038 */                          while (i29 <= i26) {
/* 1040 */                              if (i28 == 0) {
/* 1044 */                                  i6 = i26;
/* 1046 */                                  int i30 = (i29 + i27) & 65535;
/* 1048 */                                  iMax2 = Math.max(i30, iMax2);
/* 1056 */                                  i7 = i29;
/* 1062 */                                  j = j4;
/* 1068 */                                  iOOIO1lI1ll2.I00ilO0.put(Integer.valueOf(i7), Integer.valueOf(i30));
                                        } else {
/* 1072 */                                  i6 = i26;
/* 1074 */                                  i7 = i29;
/* 1076 */                                  j = j4;
/* 1085 */                                  ioiOloi.I00Ol00(((i7 - i24) * 2) + j);
/* 1088 */                                  int iI00OIl9 = ioiOloi.I00OIl();
/* 1092 */                                  if (iI00OIl9 != 0) {
/* 1096 */                                      int i31 = (iI00OIl9 + i27) & 65535;
/* 1098 */                                      int iMax3 = Math.max(i31, iMax2);
/* 1112 */                                      iOOIO1lI1ll2.I00ilO0.put(Integer.valueOf(i7), Integer.valueOf(i31));
/* 1115 */                                      iMax2 = iMax3;
                                            }
                                        }
/* 1116 */                              i29 = i7 + 1;
/* 1118 */                              i26 = i6;
/* 1120 */                              j4 = j;
                                    }
                                }
/* 1123 */                      i23++;
/* 1125 */                      iI00OIl8 = i25;
/* 1127 */                      iArrI00OOll1 = iArr3;
/* 1129 */                      iArrI00OOll12 = iArr4;
/* 1131 */                      iArrI00OOll13 = iArr5;
                            }
/* 1141 */                  if (iOOIO1lI1ll2.I00ilO0.isEmpty()) {
/* 1145 */                      Log.w("PdfBox-Android", "cmap format 4 subtable is empty");
                            } else {
/* 1150 */                      iOOIO1lI1ll2.I00000oIO(iMax2);
                            }
                        } else if (iI00OIl2 != 6) {
/* 130 */                   char c = '\n';
/* 136 */                   if (iI00OIl2 == 8) {
/* 644 */                       i = iI00OIl;
/* 645 */                       i2 = i10;
/* 650 */                       int i32 = 8192;
/* 652 */                       int[] iArr6 = new int[8192];
/* 655 */                       for (int i33 = 0; i33 < 8192; i33++) {
/* 661 */                           iArr6[i33] = ioiOloi.read();
                                }
/* 666 */                       long jI00IoiI = ioiOloi.I00IoiI();
/* 675 */                       if (jI00IoiI > 65536) {
/* 883 */                           IioIoO10iOiI.I000OOo1O("CMap ( Subtype8 ) is invalid");
/* 886 */                           return;
                                }
/* 681 */                       iOOIO1lI1ll2.I00iio = IOOIO1lI1ll.I00000oOI(iI001l0I00);
/* 688 */                       iOOIO1lI1ll2.I00ilO0 = new HashMap(iI001l0I00);
/* 690 */                       if (iI001l0I00 == 0) {
/* 692 */                           Log.w("PdfBox-Android", "subtable has no glyphs");
                                } else {
/* 697 */                           long j5 = 0;
/* 701 */                           while (j5 < jI00IoiI) {
/* 703 */                               long jI00IoiI2 = ioiOloi.I00IoiI();
/* 707 */                               long jI00IoiI3 = ioiOloi.I00IoiI();
/* 711 */                               long jI00IoiI4 = ioiOloi.I00IoiI();
/* 717 */                               if (jI00IoiI2 <= jI00IoiI3 && 0 <= jI00IoiI2) {
/* 723 */                                   char c2 = c;
/* 724 */                                   long j6 = j5;
/* 726 */                                   long j7 = jI00IoiI2;
/* 730 */                                   while (j7 <= jI00IoiI3) {
/* 736 */                                       if (j7 > 2147483647L) {
/* 859 */                                           IioIoO10iOiI.I000OOo1O(IlIi0I0.I000iOII(j7, "[Sub Format 8] Invalid character code "));
/* 862 */                                           return;
                                                }
/* 738 */                                       int i34 = (int) j7;
/* 739 */                                       int i35 = i34 / 8;
/* 741 */                                       if (i35 >= i32) {
/* 851 */                                           IioIoO10iOiI.I000OOo1O(IlIi0I0.I000iOII(j7, "[Sub Format 8] Invalid character code "));
/* 854 */                                           return;
                                                }
/* 751 */                                       if ((iArr6[i35] & (i11 << (i34 % 8))) == 0) {
/* 753 */                                           iArr = iArr6;
/* 755 */                                           i8 = i34;
                                                } else {
/* 780 */                                           iArr = iArr6;
                                                    long j8 = ((((j7 >> c2) + 55232) << c2) + ((j7 & 1023) + 56320)) - 56613888;
/* 786 */                                           if (j8 > 2147483647L) {
/* 843 */                                               IioIoO10iOiI.I000OOo1O(IlIi0I0.I000iOII(j8, "[Sub Format 8] Invalid character code "));
/* 846 */                                               return;
                                                    }
/* 788 */                                           i8 = (int) j8;
                                                }
/* 791 */                                       long j9 = (j7 - jI00IoiI2) + jI00IoiI4;
/* 793 */                                       int i36 = i11;
/* 798 */                                       if (j9 <= iI001l0I00 && j9 <= 2147483647L) {
/* 806 */                                           int i37 = (int) j9;
/* 807 */                                           iOOIO1lI1ll2.I00iio[i37] = i8;
/* 819 */                                           iOOIO1lI1ll2.I00ilO0.put(Integer.valueOf(i8), Integer.valueOf(i37));
/* 822 */                                           j7++;
/* 824 */                                           i11 = i36;
/* 826 */                                           iArr6 = iArr;
/* 828 */                                           i32 = 8192;
/* 830 */                                           c2 = '\n';
                                                }
                                            }
/* 867 */                                   j5 = j6 + 1;
/* 869 */                                   i32 = 8192;
/* 871 */                                   c = '\n';
                                        }
                                    }
                                }
                            } else {
/* 147 */                       if (iI00OIl2 != 10) {
                                    switch (iI00OIl2) {
                                        case 12:
/* 372 */                                   i = iI00OIl;
/* 373 */                                   i2 = i10;
/* 375 */                                   long jI00IoiI5 = ioiOloi.I00IoiI();
/* 383 */                                   iOOIO1lI1ll2.I00iio = IOOIO1lI1ll.I00000oOI(iI001l0I00);
/* 390 */                                   iOOIO1lI1ll2.I00ilO0 = new HashMap(iI001l0I00);
/* 392 */                                   if (iI001l0I00 == 0) {
/* 394 */                                       Log.w("PdfBox-Android", "subtable has no glyphs");
                                                break;
                                            } else {
/* 399 */                                       long j10 = 0;
/* 401 */                                       int iMax4 = 0;
/* 404 */                                       while (j10 < jI00IoiI5) {
/* 406 */                                           long jI00IoiI6 = ioiOloi.I00IoiI();
/* 410 */                                           long jI00IoiI7 = ioiOloi.I00IoiI();
/* 414 */                                           long jI00IoiI8 = ioiOloi.I00IoiI();
/* 420 */                                           if (jI00IoiI6 < 0 || jI00IoiI6 > 1114111 || (jI00IoiI6 >= 55296 && jI00IoiI6 <= 57343)) {
                                                        break;
                                                    } else if ((jI00IoiI7 > 0 && jI00IoiI7 < jI00IoiI6) || jI00IoiI7 > 1114111 || (jI00IoiI7 >= 55296 && jI00IoiI7 <= 57343)) {
                                                        break;
                                                    } else {
/* 454 */                                               long j11 = 0;
                                                        while (true) {
/* 460 */                                                   j2 = jI00IoiI5;
/* 462 */                                                   if (j11 <= jI00IoiI7 - jI00IoiI6) {
/* 464 */                                                       long j12 = jI00IoiI8 + j11;
/* 466 */                                                       j3 = j10;
/* 471 */                                                       if (j12 >= iI001l0I00) {
/* 475 */                                                           Log.w("PdfBox-Android", "Format 12 cmap contains an invalid glyph index");
                                                                } else {
/* 479 */                                                           long j13 = jI00IoiI6 + j11;
/* 483 */                                                           if (j13 > 1114111) {
/* 487 */                                                               Log.w("PdfBox-Android", "Format 12 cmap contains character beyond UCS-4");
                                                                    }
/* 490 */                                                           int i38 = (int) j12;
/* 491 */                                                           iMax4 = Math.max(iMax4, i38);
/* 506 */                                                           iOOIO1lI1ll2.I00ilO0.put(Integer.valueOf((int) j13), Integer.valueOf(i38));
/* 509 */                                                           j11++;
/* 511 */                                                           jI00IoiI5 = j2;
/* 513 */                                                           j10 = j3;
                                                                }
                                                            } else {
/* 516 */                                                       j3 = j10;
                                                            }
                                                        }
/* 518 */                                               j10 = j3 + 1;
/* 520 */                                               jI00IoiI5 = j2;
                                                    }
                                                }
/* 563 */                                       iOOIO1lI1ll2.I00000oIO(iMax4);
                                                break;
                                            }
                                        case 13:
/* 176 */                                   long jI00IoiI9 = ioiOloi.I00IoiI();
/* 184 */                                   iOOIO1lI1ll2.I00iio = IOOIO1lI1ll.I00000oOI(iI001l0I00);
/* 191 */                                   iOOIO1lI1ll2.I00ilO0 = new HashMap(iI001l0I00);
/* 193 */                                   if (iI001l0I00 != 0) {
/* 199 */                                       long j14 = 0;
/* 203 */                                       while (j14 < jI00IoiI9) {
/* 205 */                                           long jI00IoiI10 = ioiOloi.I00IoiI();
/* 209 */                                           long jI00IoiI11 = ioiOloi.I00IoiI();
/* 216 */                                           long jI00IoiI12 = ioiOloi.I00IoiI();
/* 220 */                                           i = iI00OIl;
/* 224 */                                           if (jI00IoiI12 > iI001l0I00) {
/* 228 */                                               Log.w("PdfBox-Android", "Format 13 cmap contains an invalid glyph index");
/* 172 */                                               i2 = i10;
                                                        break;
                                                    } else if (jI00IoiI10 < 0 || jI00IoiI10 > 1114111 || (jI00IoiI10 >= 55296 && jI00IoiI10 <= 57343)) {
                                                        break;
                                                    } else if ((jI00IoiI11 > 0 && jI00IoiI11 < jI00IoiI10) || jI00IoiI11 > 1114111 || (jI00IoiI11 >= 55296 && jI00IoiI11 <= 57343)) {
                                                        break;
                                                    } else {
/* 268 */                                               long j15 = 0;
/* 274 */                                               while (j15 <= jI00IoiI11 - jI00IoiI10) {
/* 276 */                                                   long j16 = j15;
/* 278 */                                                   long j17 = jI00IoiI10 + j16;
/* 282 */                                                   if (j17 > 2147483647L) {
/* 321 */                                                       IioIoO10iOiI.I000OOo1O("Character Code greater than Integer.MAX_VALUE");
                                                                break;
                                                            } else {
/* 286 */                                                       if (j17 > 1114111) {
/* 290 */                                                           Log.w("PdfBox-Android", "Format 13 cmap contains character beyond UCS-4");
                                                                }
/* 295 */                                                       int i39 = i10;
/* 297 */                                                       int i40 = (int) jI00IoiI12;
/* 298 */                                                       int i41 = (int) j17;
/* 299 */                                                       iOOIO1lI1ll2.I00iio[i40] = i41;
/* 311 */                                                       iOOIO1lI1ll2.I00ilO0.put(Integer.valueOf(i41), Integer.valueOf(i40));
/* 314 */                                                       j15 = j16 + 1;
/* 316 */                                                       i10 = i39;
                                                            }
                                                        }
/* 327 */                                               j14++;
/* 329 */                                               iI00OIl = i;
                                                    }
                                                }
                                            } else {
/* 195 */                                       Log.w("PdfBox-Android", "subtable has no glyphs");
                                            }
/* 171 */                                   i = iI00OIl;
/* 172 */                                   i2 = i10;
                                            break;
                                        case 14:
/* 168 */                                   Log.w("PdfBox-Android", "Format 14 cmap table is not supported and will be ignored");
/* 171 */                                   i = iI00OIl;
/* 172 */                                   i2 = i10;
                                            break;
                                        default:
/* 162 */                                   IioIoO10iOiI.I000OOo1O(Oi010OO0.I000oI1ioi(iI00OIl2, "Unknown cmap format:"));
                                            break;
                                    }
/* 165 */                           return;
                                }
/* 568 */                       i = iI00OIl;
/* 569 */                       i2 = i10;
/* 574 */                       long jI00IoiI13 = ioiOloi.I00IoiI();
/* 578 */                       long jI00IoiI14 = ioiOloi.I00IoiI();
/* 584 */                       if (jI00IoiI14 > 2147483647L) {
/* 640 */                           IioIoO10iOiI.I000OOo1O("Invalid number of Characters");
/* 643 */                           return;
                                } else if (jI00IoiI13 >= 0 && jI00IoiI13 <= 1114111) {
/* 594 */                           long j18 = jI00IoiI13 + jI00IoiI14;
/* 598 */                           if (j18 > 1114111 || (j18 >= 55296 && j18 <= 57343)) {
                                    }
                                }
                            }
                        } else {
/* 887 */                   i = iI00OIl;
/* 888 */                   i2 = i10;
/* 890 */                   int iI00OIl10 = ioiOloi.I00OIl();
/* 894 */                   int iI00OIl11 = ioiOloi.I00OIl();
/* 898 */                   if (iI00OIl11 != 0) {
/* 907 */                       iOOIO1lI1ll2.I00ilO0 = new HashMap(iI001l0I00);
/* 909 */                       int[] iArrI00OOll15 = ioiOloi.I00OOll1(iI00OIl11);
/* 914 */                       int iMax5 = 0;
/* 915 */                       for (int i42 = 0; i42 < iI00OIl11; i42++) {
/* 919 */                           iMax5 = Math.max(iMax5, iArrI00OOll15[i42]);
/* 937 */                           iOOIO1lI1ll2.I00ilO0.put(Integer.valueOf(iI00OIl10 + i42), Integer.valueOf(iArrI00OOll15[i42]));
                                }
/* 943 */                       iOOIO1lI1ll2.I00000oIO(iMax5);
                            }
                        }
/* 1419 */              i10 = i2 + 1;
/* 1421 */              iI00OIl = i;
                    }
/* 835 */           IioIoO10iOiI.I000OOo1O("CMap contains an invalid glyph index");
                }

                public final IOOIO1lI1ll I00000oOI(int i, int i2) {
/* 5 */             for (IOOIO1lI1ll iOOIO1lI1ll : this.I0001Ioi1lo) {
/* 11 */                if (iOOIO1lI1ll.I00iOIl == i && iOOIO1lI1ll.I00iiI == i2) {
/* 17 */                    return iOOIO1lI1ll;
                        }
                    }
/* 21 */            return null;
                }
            }

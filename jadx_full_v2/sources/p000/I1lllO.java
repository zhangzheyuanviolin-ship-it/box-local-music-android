            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.FileInputStream;
            import java.io.IOException;
            import java.io.InputStream;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Array;
            import java.nio.ByteOrder;
            import java.util.Arrays;
            
/* 85 */    public final class I1lllO extends InputStream {
                public int I00iOIl;
                public int I00iiI;
                public int I00iiO;
                public boolean I00iio;
                public final IIi0oIl I00ilI0I1;
                public int I00ilO0;
                public II0lIOii I00io1l;
                public int I00ioIO;
                public int I00l0I0l0lO1;
                public int I00l0OO0IO;
                public int I00li1OI;
                public int I00ll1;
                public int I00lli11;
                public int I00lll10;
                public int I00o0iI0io1;
                public int I00o0l1o1o0;
                public int I00o101lO;
                public int I00oI0i;
                public int I00oII;
                public char I00oIiI10;
                public I1lllIlll1 I00oO101o;

                public I1lllO(FileInputStream fileInputStream) throws IOException {
/* 6 */             IIi0oIl iIi0oIl = new IIi0oIl();
/* 10 */            iIi0oIl.I00iOIl = -1;
/* 12 */            this.I00ilI0I1 = iIi0oIl;
/* 15 */            this.I00ioIO = 1;
/* 23 */            InputStream inputStreamI0000Il00O = fileInputStream == System.in ? IOO0o0i1io.I0000Il00O(fileInputStream) : fileInputStream;
/* 27 */            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
/* 29 */            II0lIOii iI0lIOii = new II0lIOii();
/* 37 */            iI0lIOii.I00iOIl = new IOO0o0i1io(inputStreamI0000Il00O);
/* 39 */            iI0lIOii.I00iiI = byteOrder;
/* 41 */            VarHandle.storeStoreFence();
/* 44 */            this.I00io1l = iI0lIOii;
/* 46 */            II0lIOii iI0lIOii2 = this.I00io1l;
/* 48 */            if (iI0lIOii2 != null) {
/* 56 */                int iI00000oIO = (int) iI0lIOii2.I00000oIO(8);
/* 63 */                int iI00000oIO2 = (int) this.I00io1l.I00000oIO(8);
/* 70 */                int iI00000oIO3 = (int) this.I00io1l.I00000oIO(8);
/* 73 */                if (iI00000oIO != 66 || iI00000oIO2 != 90 || iI00000oIO3 != 104) {
/* 119 */                   throw new IOException("Stream is not in the BZip2 format");
                        }
/* 89 */                int iI00000oIO4 = (int) this.I00io1l.I00000oIO(8);
/* 92 */                if (iI00000oIO4 < 49 || iI00000oIO4 > 57) {
/* 108 */                   IioIoO10iOiI.I000OOo1O("BZip2 block size is invalid");
                        } else {
/* 100 */                   this.I00iiO = iI00000oIO4 - 48;
/* 103 */                   this.I00li1OI = 0;
                        }
                    } else {
/* 122 */               IioIoO10iOiI.I000OOo1O("No InputStream");
                    }
/* 125 */           I000O01llI0();
                }

                public static int I00000oIO(II0lIOii iI0lIOii, int i) throws IOException {
/* 1 */             long jI00000oIO = iI0lIOii.I00000oIO(i);
/* 9 */             if (jI00000oIO >= 0) {
/* 11 */                return (int) jI00000oIO;
                    }
/* 15 */            IioIoO10iOiI.I000OOo1O("Unexpected end of stream");
/* 18 */            return 0;
                }

                public static void I0000Il00O(int i, int i2, String str) throws IOException {
/* 3 */             if (i < 0) {
/* 24 */                IioIoO10iOiI.I000OOo1O(IlIi0I0.I000lI("Corrupted input, ", str, " value negative"));
                    } else {
/* 5 */                 if (i < i2) {
/* 7 */                     return;
                        }
/* 14 */                IioIoO10iOiI.I000OOo1O(IlIi0I0.I000lI("Corrupted input, ", str, " value too big"));
                    }
                }

                public final void I000II() throws IOException {
/* 5 */             int i = ~this.I00ilI0I1.I00iOIl;
/* 6 */             int i2 = this.I00l0I0l0lO1;
/* 8 */             if (i2 == i) {
/* 10 */                int i3 = this.I00li1OI;
/* 18 */                this.I00li1OI = i ^ ((i3 >>> 31) | (i3 << 1));
                    } else {
/* 21 */                int i4 = this.I00l0OO0IO;
/* 29 */                this.I00li1OI = ((i4 >>> 31) | (i4 << 1)) ^ i2;
/* 33 */                IioIoO10iOiI.I000OOo1O("BZip2 CRC error");
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r10v29, types: [int] */
                /* JADX WARN: Type inference failed for: r21v1, types: [int] */
                /* JADX WARN: Type inference failed for: r26v2, types: [int] */
                /* JADX WARN: Type inference failed for: r2v51, types: [int] */
                /* JADX WARN: Type inference failed for: r5v23, types: [int] */
                /* JADX WARN: Type inference failed for: r5v29, types: [int] */
                public final void I000O01llI0() throws IOException {
                    int i;
                    int i2;
                    char[] cArr;
                    char c;
                    int i3;
                    char c2;
/* 3 */             II0lIOii iI0lIOii = this.I00io1l;
/* 11 */            char cI00000oIO = (char) I00000oIO(iI0lIOii, 8);
/* 16 */            char cI00000oIO2 = (char) I00000oIO(iI0lIOii, 8);
/* 21 */            char cI00000oIO3 = (char) I00000oIO(iI0lIOii, 8);
/* 26 */            char cI00000oIO4 = (char) I00000oIO(iI0lIOii, 8);
/* 31 */            char cI00000oIO5 = (char) I00000oIO(iI0lIOii, 8);
/* 36 */            char cI00000oIO6 = (char) I00000oIO(iI0lIOii, 8);
/* 41 */            char c3 = 0;
/* 42 */            if (cI00000oIO == 23 && cI00000oIO2 == 'r' && cI00000oIO3 == 'E' && cI00000oIO4 == '8' && cI00000oIO5 == 'P' && cI00000oIO6 == 144) {
/* 67 */                int iI00000oIO = I00000oIO(this.I00io1l, 32);
/* 71 */                this.I00l0OO0IO = iI00000oIO;
/* 73 */                this.I00ioIO = 0;
/* 76 */                this.I00oO101o = null;
/* 80 */                if (iI00000oIO == this.I00li1OI) {
/* 82 */                    return;
                        }
/* 85 */                IioIoO10iOiI.I000OOo1O("BZip2 CRC error");
/* 88 */                return;
                    }
/* 91 */            if (cI00000oIO != '1' || cI00000oIO2 != 'A' || cI00000oIO3 != 'Y' || cI00000oIO4 != '&' || cI00000oIO5 != 'S' || cI00000oIO6 != 'Y') {
/* 1290 */              this.I00ioIO = 0;
/* 1294 */              IioIoO10iOiI.I000OOo1O("Bad block header");
/* 2840 */              return;
                    }
/* 115 */           this.I00l0I0l0lO1 = I00000oIO(iI0lIOii, 32);
/* 117 */           int i4 = 1;
/* 127 */           this.I00iio = I00000oIO(iI0lIOii, 1) == 1;
/* 129 */           I1lllIlll1 i1lllIlll1 = this.I00oO101o;
/* 141 */           if (i1lllIlll1 == null) {
/* 145 */               int i5 = this.I00iiO;
/* 147 */               I1lllIlll1 i1lllIlll12 = new I1lllIlll1();
/* 152 */               i1lllIlll12.I00000oIO = new boolean[Barcode.FORMAT_QR_CODE];
/* 156 */               i1lllIlll12.I00000oOI = new byte[Barcode.FORMAT_QR_CODE];
/* 160 */               i1lllIlll12.I0000Il00O = new byte[18002];
/* 164 */               i1lllIlll12.I0000O = new byte[18002];
/* 168 */               i1lllIlll12.I0000oI00 = new int[Barcode.FORMAT_QR_CODE];
/* 176 */               i = 100000;
/* 179 */               Class cls = Integer.TYPE;
/* 187 */               i1lllIlll12.I0001Ioi1lo = (int[][]) Array.newInstance((Class<?>) cls, 6, 258);
/* 201 */               i1lllIlll12.I000II = (int[][]) Array.newInstance((Class<?>) cls, 6, 258);
/* 215 */               i1lllIlll12.I000O01llI0 = (int[][]) Array.newInstance((Class<?>) cls, 6, 258);
/* 219 */               i1lllIlll12.I000OOo1O = new int[6];
/* 223 */               i1lllIlll12.I000OiO = new int[257];
/* 227 */               i1lllIlll12.I000iOII = new char[Barcode.FORMAT_QR_CODE];
/* 243 */               i1lllIlll12.I000l1 = (char[][]) Array.newInstance((Class<?>) Character.TYPE, 6, 258);
/* 247 */               i1lllIlll12.I000lI = new byte[6];
/* 253 */               i1lllIlll12.I000oI1ioi = new byte[i5 * 100000];
/* 255 */               VarHandle.storeStoreFence();
/* 258 */               this.I00oO101o = i1lllIlll12;
                    } else {
/* 261 */               i = 100000;
                    }
/* 264 */           II0lIOii iI0lIOii2 = this.I00io1l;
/* 272 */           this.I00iiI = I00000oIO(iI0lIOii2, 24);
/* 274 */           II0lIOii iI0lIOii3 = this.I00io1l;
/* 276 */           I1lllIlll1 i1lllIlll13 = this.I00oO101o;
/* 278 */           boolean[] zArr = i1lllIlll13.I00000oIO;
/* 282 */           byte[] bArr = i1lllIlll13.I000lI;
/* 284 */           byte[] bArr2 = i1lllIlll13.I0000Il00O;
/* 286 */           byte[] bArr3 = i1lllIlll13.I0000O;
/* 289 */           int i6 = 0;
/* 293 */           for (int i7 = 0; i7 < 16; i7++) {
/* 299 */               if (I00000oIO(iI0lIOii3, 1) != 0) {
/* 303 */                   i6 |= 1 << i7;
                        }
                    }
/* 308 */           Arrays.fill(zArr, false);
/* 311 */           int i8 = 0;
/* 312 */           while (i8 < 16) {
/* 318 */               if ((i6 & (1 << i8)) != 0) {
/* 320 */                   int i9 = i8 << 4;
/* 322 */                   c2 = c3;
/* 324 */                   for (char c4 = c3; c4 < 16; c4++) {
/* 330 */                       if (I00000oIO(iI0lIOii3, 1) != 0) {
/* 334 */                           zArr[i9 + c4] = true;
                                }
                            }
                        } else {
/* 339 */                   c2 = c3;
                        }
/* 341 */               i8++;
/* 343 */               c3 = c2;
                    }
/* 346 */           char c5 = c3;
/* 348 */           I1lllIlll1 i1lllIlll14 = this.I00oO101o;
/* 350 */           boolean[] zArr2 = i1lllIlll14.I00000oIO;
/* 352 */           byte[] bArr4 = i1lllIlll14.I00000oOI;
/* 354 */           char c6 = c5;
/* 356 */           int i10 = c6;
/* 357 */           for (int i11 = Barcode.FORMAT_QR_CODE; i10 < i11; i11 = Barcode.FORMAT_QR_CODE) {
/* 361 */               if (zArr2[i10]) {
/* 366 */                   bArr4[c6] = (byte) i10;
/* 363 */                   c6++;
                        }
/* 370 */               i10++;
                    }
/* 375 */           this.I00ilO0 = c6;
/* 377 */           int i12 = c6 + 2;
/* 380 */           int iI00000oIO2 = I00000oIO(iI0lIOii3, 3);
/* 386 */           int iI00000oIO3 = I00000oIO(iI0lIOii3, 15);
/* 390 */           if (iI00000oIO3 < 0) {
/* 1285 */              IioIoO10iOiI.I000OOo1O("Corrupted input, nSelectors value negative");
/* 1288 */              return;
                    }
/* 396 */           I0000Il00O(i12, 259, "alphaSize");
/* 402 */           I0000Il00O(iI00000oIO2, 7, "nGroups");
/* 407 */           for (int i13 = c5; i13 < iI00000oIO3; i13++) {
/* 409 */               int i14 = c5;
/* 415 */               while (I00000oIO(iI0lIOii3, 1) != 0) {
/* 417 */                   i14++;
                        }
/* 420 */               if (i13 < 18002) {
/* 423 */                   bArr3[i13] = (byte) i14;
                        }
                    }
/* 428 */           int iMin = Math.min(iI00000oIO3, 18002);
/* 432 */           int i15 = iI00000oIO2;
                    while (true) {
/* 433 */               i2 = -1;
                        i15--;
/* 435 */               if (i15 < 0) {
                            break;
                        } else {
/* 438 */                   bArr[i15] = (byte) i15;
                        }
                    }
/* 441 */           int i16 = c5;
/* 443 */           while (i16 < iMin) {
/* 445 */               int i17 = i2;
/* 449 */               int i18 = bArr3[i16] & 255;
/* 453 */               I0000Il00O(i18, 6, "selectorMtf");
/* 456 */               byte b = bArr[i18];
/* 458 */               while (i18 > 0) {
/* 464 */                   bArr[i18] = bArr[i18 - 1];
                            i18--;
                        }
/* 469 */               bArr[c5] = b;
/* 471 */               bArr2[i16] = b;
/* 473 */               i16++;
/* 475 */               i2 = i17;
                    }
/* 480 */           int i19 = i2;
/* 482 */           char[][] cArr2 = i1lllIlll13.I000l1;
/* 486 */           for (int i20 = c5; i20 < iI00000oIO2; i20++) {
/* 489 */               int iI00000oIO4 = I00000oIO(iI0lIOii3, 5);
/* 493 */               char[] cArr3 = cArr2[i20];
/* 497 */               for (int i21 = c5; i21 < i12; i21++) {
/* 503 */                   while (I00000oIO(iI0lIOii3, 1) != 0) {
/* 515 */                       iI00000oIO4 += I00000oIO(iI0lIOii3, 1) != 0 ? i19 : 1;
                            }
/* 518 */                   cArr3[i21] = (char) iI00000oIO4;
                        }
                    }
/* 526 */           I1lllIlll1 i1lllIlll15 = this.I00oO101o;
/* 528 */           char[][] cArr4 = i1lllIlll15.I000l1;
/* 530 */           int[] iArr = i1lllIlll15.I000OOo1O;
/* 532 */           int[][] iArr2 = i1lllIlll15.I0001Ioi1lo;
/* 534 */           int[][] iArr3 = i1lllIlll15.I000II;
/* 536 */           int[][] iArr4 = i1lllIlll15.I000O01llI0;
/* 538 */           int i22 = c5;
/* 540 */           while (i22 < iI00000oIO2) {
/* 542 */               char[] cArr5 = cArr4[i22];
/* 544 */               int i23 = i4;
/* 546 */               int i24 = i12;
/* 547 */               char c7 = c5;
/* 549 */               char c8 = ' ';
                        while (true) {
                            i24--;
/* 553 */                   if (i24 < 0) {
                                break;
                            }
/* 555 */                   char c9 = cArr5[i24];
/* 557 */                   if (c9 > c7) {
/* 559 */                       c7 = c9;
                            }
/* 560 */                   if (c9 < c8) {
/* 562 */                       c8 = c9;
                            }
                        }
/* 565 */               int[] iArr5 = iArr2[i22];
/* 567 */               int[] iArr6 = iArr3[i22];
/* 569 */               int[] iArr7 = iArr4[i22];
/* 571 */               char[] cArr6 = cArr4[i22];
/* 573 */               int i25 = c8;
/* 574 */               char c10 = c5;
/* 576 */               while (i25 <= c7) {
/* 578 */                   char c11 = c8;
/* 580 */                   int i26 = c5;
/* 582 */                   while (i26 < i12) {
/* 584 */                       int i27 = i26;
/* 588 */                       if (cArr6[i27] == i25) {
/* 592 */                           iArr7[c10] = i27;
/* 590 */                           c10++;
                                }
/* 596 */                       i26 = i27 + 1;
                            }
/* 599 */                   i25++;
/* 601 */                   c8 = c11;
                        }
/* 604 */               char c12 = c8;
/* 606 */               int i28 = 23;
                        while (true) {
                            i28--;
/* 610 */                   if (i28 <= 0) {
                                break;
                            }
/* 612 */                   iArr6[i28] = c5;
/* 614 */                   iArr5[i28] = c5;
                        }
/* 619 */               for (int i29 = c5; i29 < i12; i29++) {
/* 621 */                   char c13 = cArr6[i29];
/* 629 */                   I0000Il00O(c13, 258, "length");
/* 632 */                   int i30 = c13 + 1;
/* 638 */                   iArr6[i30] = iArr6[i30] + 1;
                        }
/* 643 */               int i31 = iArr6[c5];
/* 649 */               for (int i32 = i23; i32 < 23; i32++) {
/* 653 */                   i31 += iArr6[i32];
/* 655 */                   iArr6[i32] = i31;
                        }
/* 660 */               int i33 = iArr6[c12];
/* 662 */               int i34 = c5;
/* 664 */               char c14 = c12;
/* 666 */               while (c14 <= c7) {
/* 668 */                   ?? r26 = c14 + 1;
/* 670 */                   int i35 = iArr6[r26];
/* 674 */                   int i36 = (i35 - i33) + i34;
/* 677 */                   iArr5[c14] = i36 - 1;
/* 679 */                   i34 = i36 << 1;
/* 681 */                   c14 = r26;
/* 683 */                   i33 = i35;
                        }
/* 688 */               for (int i37 = c12 + 1; i37 <= c7; i37++) {
/* 701 */                   iArr6[i37] = ((iArr5[i37 - 1] + 1) << 1) - iArr6[i37];
                        }
/* 706 */               iArr[i22] = c12;
/* 708 */               i22++;
/* 710 */               i4 = i23;
                    }
/* 717 */           int i38 = i4;
/* 719 */           I1lllIlll1 i1lllIlll16 = this.I00oO101o;
/* 721 */           byte[] bArr5 = i1lllIlll16.I000oI1ioi;
/* 723 */           int[] iArr8 = i1lllIlll16.I0000oI00;
/* 725 */           byte[] bArr6 = i1lllIlll16.I0000Il00O;
/* 727 */           byte[] bArr7 = i1lllIlll16.I00000oOI;
/* 729 */           char[] cArr7 = i1lllIlll16.I000iOII;
/* 731 */           int[] iArr9 = i1lllIlll16.I000OOo1O;
/* 733 */           int[][] iArr10 = i1lllIlll16.I0001Ioi1lo;
/* 735 */           int[][] iArr11 = i1lllIlll16.I000II;
/* 737 */           int[][] iArr12 = i1lllIlll16.I000O01llI0;
/* 741 */           int i39 = this.I00iiO * i;
/* 743 */           int i40 = Barcode.FORMAT_QR_CODE;
                    while (true) {
                        i40--;
/* 747 */               if (i40 < 0) {
                            break;
                        }
/* 750 */               cArr7[i40] = (char) i40;
/* 752 */               iArr8[i40] = c5;
                    }
/* 757 */           int i41 = this.I00ilO0 + 1;
/* 759 */           I1lllIlll1 i1lllIlll17 = this.I00oO101o;
/* 765 */           int i42 = i1lllIlll17.I0000Il00O[c5] & 255;
/* 772 */           I0000Il00O(i42, 6, "zt");
/* 777 */           int[] iArr13 = i1lllIlll17.I0001Ioi1lo[i42];
/* 783 */           int i43 = i1lllIlll17.I000OOo1O[i42];
/* 793 */           I0000Il00O(i43, 258, "zn");
/* 798 */           int iI00000oIO5 = I00000oIO(this.I00io1l, i43);
/* 802 */           int i44 = i43;
/* 806 */           while (iI00000oIO5 > iArr13[i44]) {
/* 808 */               int i45 = i44 + 1;
/* 814 */               I0000Il00O(i45, 258, "zn");
/* 819 */               i44 = i45;
/* 831 */               iI00000oIO5 = (iI00000oIO5 << 1) | I00000oIO(this.I00io1l, i38);
/* 833 */               i38 = 1;
                    }
/* 844 */           int i46 = iI00000oIO5 - i1lllIlll17.I000II[i42][i44];
/* 852 */           I0000Il00O(i46, 258, "zvec");
/* 859 */           int i47 = i1lllIlll17.I000O01llI0[i42][i46];
/* 863 */           int i48 = bArr6[c5] & 255;
/* 866 */           I0000Il00O(i48, 6, "zt");
/* 869 */           int[] iArr14 = iArr11[i48];
/* 871 */           int[] iArr15 = iArr10[i48];
/* 873 */           int[] iArr16 = iArr12[i48];
/* 875 */           int i49 = iArr9[i48];
/* 879 */           int i50 = i19;
/* 881 */           int[] iArr17 = iArr16;
/* 883 */           int i51 = 49;
/* 885 */           char c15 = c5;
/* 887 */           while (i47 != i41) {
/* 889 */               int[] iArr18 = iArr9;
/* 893 */               int[][] iArr19 = iArr10;
/* 897 */               int[][] iArr20 = iArr11;
/* 901 */               int i52 = i41;
/* 903 */               if (i47 == 0 || i47 == 1) {
/* 908 */                   int[] iArr21 = iArr14;
/* 1078 */                  int i53 = i19;
/* 1080 */                  int i54 = 1;
                            while (true) {
/* 1081 */                      if (i47 != 0) {
/* 1087 */                          cArr = cArr7;
/* 1090 */                          if (i47 != 1) {
                                        break;
                                    } else {
/* 1094 */                              i53 += i54 << 1;
                                    }
                                } else {
/* 1083 */                          i53 += i54;
/* 1084 */                          cArr = cArr7;
                                }
/* 1095 */                      if (i51 == 0) {
/* 1097 */                          ?? r5 = c15 + 1;
/* 1101 */                          I0000Il00O(r5, 18002, "groupNo");
/* 1106 */                          int i55 = bArr6[r5] & 255;
/* 1109 */                          I0000Il00O(i55, 6, "zt");
/* 1112 */                          iArr21 = iArr20[i55];
/* 1114 */                          int[] iArr22 = iArr19[i55];
/* 1116 */                          iArr17 = iArr12[i55];
/* 1118 */                          i49 = iArr18[i55];
/* 1120 */                          c15 = r5;
/* 1122 */                          iArr15 = iArr22;
/* 1124 */                          i51 = 49;
                                } else {
                                    i51--;
                                }
/* 1126 */                      int i56 = i49;
/* 1135 */                      I0000Il00O(i56, 258, "zn");
/* 1142 */                      i49 = i56;
/* 1138 */                      int iI00000oIO6 = I00000oIO(iI0lIOii2, i56);
/* 1146 */                      int i57 = i49;
/* 1150 */                      while (iI00000oIO6 > iArr15[i57]) {
/* 1152 */                          int i58 = i57 + 1;
/* 1158 */                          I0000Il00O(i58, 258, "zn");
/* 1168 */                          iI00000oIO6 = (iI00000oIO6 << 1) | I00000oIO(iI0lIOii2, 1);
/* 1170 */                          i57 = i58;
                                }
/* 1177 */                      int i59 = iI00000oIO6 - iArr21[i57];
/* 1181 */                      I0000Il00O(i59, 258, "zvec");
/* 1186 */                      i54 <<= 1;
/* 1184 */                      i47 = iArr17[i59];
/* 1189 */                      cArr7 = cArr;
                            }
/* 1201 */                  I0000Il00O(i53, this.I00oO101o.I000oI1ioi.length, "s");
/* 1206 */                  char c16 = cArr[0];
/* 1210 */                  I0000Il00O(c16, Barcode.FORMAT_QR_CODE, "yy");
/* 1213 */                  byte b2 = bArr7[c16];
/* 1215 */                  int i60 = b2 & 255;
/* 1223 */                  iArr8[i60] = i53 + 1 + iArr8[i60];
/* 1225 */                  int i61 = i50 + 1;
/* 1227 */                  int i62 = i61 + i53;
/* 1236 */                  I0000Il00O(i62, this.I00oO101o.I000oI1ioi.length, "lastShadow");
/* 1241 */                  Arrays.fill(bArr5, i61, i62 + 1, b2);
/* 1244 */                  if (i62 >= i39) {
/* 1267 */                      IioIoO10iOiI.I000OOo1O(IIl001iO0Io.I000l1(i62, i39, "Block overrun while expanding RLE in MTF, ", " exceeds "));
/* 1270 */                      return;
                            }
/* 1246 */                  i50 = i62;
/* 1247 */                  iArr9 = iArr18;
/* 1249 */                  iArr10 = iArr19;
/* 1251 */                  iArr11 = iArr20;
/* 1253 */                  i41 = i52;
/* 1255 */                  iArr14 = iArr21;
/* 1257 */                  cArr7 = cArr;
                        } else {
/* 914 */                   i50++;
/* 916 */                   if (i50 >= i39) {
/* 1074 */                      IioIoO10iOiI.I000OOo1O(IIl001iO0Io.I000l1(i50, i39, "Block overrun in MTF, ", " exceeds "));
/* 1077 */                      return;
                            }
/* 922 */                   I0000Il00O(i47, 257, "nextSym");
                            int i63 = i47 - 1;
/* 927 */                   char c17 = cArr7[i63];
/* 929 */                   int[] iArr23 = iArr14;
/* 933 */                   I0000Il00O(c17, Barcode.FORMAT_QR_CODE, "yy");
/* 936 */                   byte b3 = bArr7[c17];
/* 938 */                   int i64 = b3 & 255;
/* 946 */                   iArr8[i64] = iArr8[i64] + 1;
/* 948 */                   bArr5[i50] = b3;
/* 952 */                   if (i47 <= 16) {
/* 954 */                       while (i63 > 0) {
                                    int i65 = i63 - 1;
/* 960 */                           cArr7[i63] = cArr7[i65];
/* 962 */                           i63 = i65;
                                }
/* 964 */                       c = c5;
                            } else {
/* 967 */                       c = c5;
/* 970 */                       System.arraycopy(cArr7, c, cArr7, 1, i63);
                            }
/* 973 */                   cArr7[c] = c17;
/* 975 */                   if (i51 == 0) {
/* 977 */                       ?? r52 = c15 + 1;
/* 981 */                       I0000Il00O(r52, 18002, "groupNo");
/* 986 */                       int i66 = bArr6[r52] & 255;
/* 989 */                       I0000Il00O(i66, 6, "zt");
/* 992 */                       int[] iArr24 = iArr20[i66];
/* 994 */                       int[] iArr25 = iArr19[i66];
/* 996 */                       int[] iArr26 = iArr12[i66];
/* 998 */                       i3 = iArr18[i66];
/* 1000 */                      c15 = r52;
/* 1002 */                      iArr23 = iArr24;
/* 1004 */                      iArr15 = iArr25;
/* 1005 */                      iArr17 = iArr26;
/* 1007 */                      i51 = 49;
                            } else {
                                i51--;
/* 1014 */                      i3 = i49;
                            }
/* 1017 */                  I0000Il00O(i3, 258, "zn");
/* 1020 */                  int iI00000oIO7 = I00000oIO(iI0lIOii2, i3);
/* 1024 */                  int i67 = i3;
/* 1027 */                  while (iI00000oIO7 > iArr15[i67]) {
/* 1029 */                      i67++;
/* 1031 */                      I0000Il00O(i67, 258, "zn");
/* 1041 */                      iI00000oIO7 = (iI00000oIO7 << 1) | I00000oIO(iI0lIOii2, 1);
                            }
/* 1046 */                  int i68 = iI00000oIO7 - iArr23[i67];
/* 1047 */                  I0000Il00O(i68, 258, "zvec");
/* 1050 */                  i47 = iArr17[i68];
/* 1052 */                  i49 = i3;
/* 1054 */                  iArr9 = iArr18;
/* 1056 */                  iArr10 = iArr19;
/* 1058 */                  iArr11 = iArr20;
/* 1060 */                  i41 = i52;
/* 1062 */                  iArr14 = iArr23;
                        }
/* 1064 */              c5 = 0;
                    }
/* 1271 */          this.I00iOIl = i50;
/* 1277 */          this.I00ilI0I1.I00iOIl = i19;
/* 1280 */          this.I00ioIO = 1;
                }

                public final int I000l1() throws IOException {
                    int i;
                    switch (this.I00ioIO) {
                        case 0:
/* 202 */                   return -1;
                        case 1:
/* 197 */                   return I00100l0();
                        case 2:
/* 193 */                   IOOlIIilOl0.I000iOII();
/* 3 */                     return 0;
                        case 3:
/* 95 */                    if (this.I00lli11 != this.I00lll10) {
/* 97 */                        this.I00ioIO = 2;
/* 99 */                        this.I00ll1 = 1;
/* 101 */                       return I00IOO();
                            }
/* 108 */                   int i2 = this.I00ll1 + 1;
/* 109 */                   this.I00ll1 = i2;
/* 111 */                   if (i2 < 4) {
/* 113 */                       this.I00ioIO = 2;
/* 115 */                       return I00IOO();
                            }
/* 120 */                   I1lllIlll1 i1lllIlll1 = this.I00oO101o;
/* 122 */                   byte[] bArr = i1lllIlll1.I000oI1ioi;
/* 124 */                   int i3 = this.I00oII;
/* 131 */                   this.I00oIiI10 = (char) (bArr[i3] & 255);
/* 136 */                   I0000Il00O(i3, i1lllIlll1.I000o00OoI0I.length, "su_tPos");
/* 147 */                   this.I00oII = this.I00oO101o.I000o00OoI0I[this.I00oII];
/* 149 */                   int i4 = this.I00o101lO;
/* 151 */                   if (i4 == 0) {
/* 153 */                       int i5 = this.I00oI0i;
/* 159 */                       i = iO0ilIl.I00000oIO[i5] - 1;
/* 160 */                       this.I00o101lO = i;
/* 162 */                       int i6 = i5 + 1;
/* 163 */                       this.I00oI0i = i6;
/* 167 */                       if (i6 == 512) {
/* 169 */                           this.I00oI0i = 0;
                                }
                            } else {
                                i = i4 - 1;
/* 174 */                       this.I00o101lO = i;
                            }
/* 176 */                   this.I00o0l1o1o0 = 0;
/* 178 */                   this.I00ioIO = 4;
/* 180 */                   if (i == 1) {
/* 186 */                       this.I00oIiI10 = (char) (this.I00oIiI10 ^ 1);
                            }
/* 188 */                   return I00IioO0OiOi();
                        case 4:
/* 85 */                    return I00IioO0OiOi();
                        case 5:
/* 81 */                    IOOlIIilOl0.I000iOII();
/* 3 */                     return 0;
                        case 6:
/* 24 */                    if (this.I00lli11 != this.I00lll10) {
/* 26 */                        this.I00ll1 = 1;
/* 28 */                        return I001i1lo1io();
                            }
/* 35 */                    int i7 = this.I00ll1 + 1;
/* 36 */                    this.I00ll1 = i7;
/* 38 */                    if (i7 < 4) {
/* 76 */                        return I001i1lo1io();
                            }
/* 47 */                    I0000Il00O(this.I00oII, this.I00oO101o.I000oI1ioi.length, "su_tPos");
/* 50 */                    I1lllIlll1 i1lllIlll12 = this.I00oO101o;
/* 52 */                    byte[] bArr2 = i1lllIlll12.I000oI1ioi;
/* 54 */                    int i8 = this.I00oII;
/* 61 */                    this.I00oIiI10 = (char) (bArr2[i8] & 255);
/* 67 */                    this.I00oII = i1lllIlll12.I000o00OoI0I[i8];
/* 69 */                    this.I00o0l1o1o0 = 0;
/* 71 */                    return I001l0I00();
                        case 7:
/* 15 */                    return I001l0I00();
                        default:
/* 11 */                    IOOlIIilOl0.I000iOII();
/* 3 */                     return 0;
                    }
                }

                public final int I00100l0() throws IOException {
                    I1lllIlll1 i1lllIlll1;
/* 3 */             if (this.I00ioIO == 0 || (i1lllIlll1 = this.I00oO101o) == null) {
/* 117 */               return -1;
                    }
/* 10 */            int[] iArr = i1lllIlll1.I000OiO;
/* 15 */            int i = this.I00iOIl + 1;
/* 16 */            int[] iArr2 = i1lllIlll1.I000o00OoI0I;
/* 18 */            if (iArr2 == null || iArr2.length < i) {
/* 23 */                iArr2 = new int[i];
/* 25 */                i1lllIlll1.I000o00OoI0I = iArr2;
                    }
/* 27 */            byte[] bArr = i1lllIlll1.I000oI1ioi;
/* 30 */            iArr[0] = 0;
/* 36 */            System.arraycopy(i1lllIlll1.I0000oI00, 0, iArr, 1, Barcode.FORMAT_QR_CODE);
/* 39 */            int i2 = iArr[0];
/* 41 */            for (int i3 = 1; i3 <= 256; i3++) {
/* 45 */                i2 += iArr[i3];
/* 46 */                iArr[i3] = i2;
                    }
/* 51 */            int i4 = this.I00iOIl;
/* 54 */            for (int i5 = 0; i5 <= i4; i5++) {
/* 58 */                int i6 = bArr[i5] & 255;
/* 60 */                int i7 = iArr[i6];
/* 64 */                iArr[i6] = i7 + 1;
/* 68 */                I0000Il00O(i7, i, "tt index");
/* 71 */                iArr2[i7] = i5;
                    }
/* 76 */            int i8 = this.I00iiI;
/* 78 */            if (i8 < 0 || i8 >= iArr2.length) {
/* 113 */               IioIoO10iOiI.I000OOo1O("Stream corrupted");
/* 29 */                return 0;
                    }
/* 85 */            this.I00oII = iArr2[i8];
/* 87 */            this.I00ll1 = 0;
/* 89 */            this.I00o0iI0io1 = 0;
/* 91 */            this.I00lli11 = Barcode.FORMAT_QR_CODE;
/* 95 */            if (!this.I00iio) {
/* 106 */               return I001i1lo1io();
                    }
/* 97 */            this.I00o101lO = 0;
/* 99 */            this.I00oI0i = 0;
/* 101 */           return I00IOO();
                }

                public final int I001i1lo1io() throws IOException {
/* 5 */             if (this.I00o0iI0io1 > this.I00iOIl) {
/* 57 */                this.I00ioIO = 5;
/* 59 */                I000II();
/* 62 */                I000O01llI0();
/* 65 */                return I00100l0();
                    }
/* 9 */             this.I00lll10 = this.I00lli11;
/* 11 */            I1lllIlll1 i1lllIlll1 = this.I00oO101o;
/* 13 */            byte[] bArr = i1lllIlll1.I000oI1ioi;
/* 15 */            int i = this.I00oII;
/* 19 */            int i2 = bArr[i] & 255;
/* 21 */            this.I00lli11 = i2;
/* 28 */            I0000Il00O(i, i1lllIlll1.I000o00OoI0I.length, "su_tPos");
/* 39 */            this.I00oII = this.I00oO101o.I000o00OoI0I[this.I00oII];
                    this.I00o0iI0io1++;
/* 48 */            this.I00ioIO = 6;
/* 52 */            this.I00ilI0I1.I000iOII(i2);
/* 55 */            return i2;
                }

                public final int I001l0I00() {
/* 5 */             if (this.I00o0l1o1o0 >= this.I00oIiI10) {
                        this.I00o0iI0io1++;
/* 31 */                this.I00ll1 = 0;
/* 33 */                return I001i1lo1io();
                    }
/* 7 */             int i = this.I00lli11;
/* 11 */            this.I00ilI0I1.I000iOII(i);
                    this.I00o0l1o1o0++;
/* 21 */            this.I00ioIO = 7;
/* 23 */            return i;
                }

                public final int I00IOO() throws IOException {
                    int i;
/* 5 */             if (this.I00o0iI0io1 > this.I00iOIl) {
/* 89 */                I000II();
/* 92 */                I000O01llI0();
/* 95 */                return I00100l0();
                    }
/* 9 */             this.I00lll10 = this.I00lli11;
/* 11 */            I1lllIlll1 i1lllIlll1 = this.I00oO101o;
/* 13 */            byte[] bArr = i1lllIlll1.I000oI1ioi;
/* 15 */            int i2 = this.I00oII;
/* 19 */            int i3 = bArr[i2] & 255;
/* 26 */            I0000Il00O(i2, i1lllIlll1.I000o00OoI0I.length, "su_tPos");
/* 37 */            this.I00oII = this.I00oO101o.I000o00OoI0I[this.I00oII];
/* 39 */            int i4 = this.I00o101lO;
/* 43 */            if (i4 == 0) {
/* 45 */                int i5 = this.I00oI0i;
/* 51 */                i = iO0ilIl.I00000oIO[i5] - 1;
/* 52 */                this.I00o101lO = i;
/* 54 */                int i6 = i5 + 1;
/* 55 */                this.I00oI0i = i6;
/* 59 */                if (i6 == 512) {
/* 61 */                    this.I00oI0i = 0;
                        }
                    } else {
                        i = i4 - 1;
/* 66 */                this.I00o101lO = i;
                    }
/* 71 */            int i7 = i3 ^ (i == 1 ? 1 : 0);
/* 73 */            this.I00lli11 = i7;
                    this.I00o0iI0io1++;
/* 81 */            this.I00ioIO = 3;
/* 85 */            this.I00ilI0I1.I000iOII(i7);
/* 88 */            return i7;
                }

                public final int I00IioO0OiOi() {
/* 5 */             if (this.I00o0l1o1o0 < this.I00oIiI10) {
/* 11 */                this.I00ilI0I1.I000iOII(this.I00lli11);
                        this.I00o0l1o1o0++;
/* 20 */                return this.I00lli11;
                    }
/* 24 */            this.I00ioIO = 2;
                    this.I00o0iI0io1++;
/* 33 */            this.I00ll1 = 0;
/* 35 */            return I00IOO();
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final void close() {
/* 1 */             II0lIOii iI0lIOii = this.I00io1l;
/* 3 */             if (iI0lIOii != null) {
                        try {
/* 6 */                     iI0lIOii.close();
                        } finally {
/* 15 */                    this.I00oO101o = null;
/* 17 */                    this.I00io1l = null;
                        }
                    }
                }

                @Override
                public final int read(byte[] bArr, int i, int i2) throws IOException {
/* 6 */             if (i < 0) {
/* 83 */                I000II.I0010o(IIlIOloOOO.I00100l0("offs(", i, ") < 0."));
/* 1 */                 return 0;
                    }
/* 8 */             if (i2 < 0) {
/* 75 */                I000II.I0010o(IIlIOloOOO.I00100l0("len(", i2, ") < 0."));
/* 1 */                 return 0;
                    }
/* 10 */            int i3 = i + i2;
/* 13 */            if (i3 > bArr.length) {
/* 65 */                I000II.I0010o(IIl001iO0Io.I000lI(bArr.length, ").", IIl001iO0Io.I0010I0i("offs(", i, ") + len(", i2, ") > dest.length(")));
/* 1 */                 return 0;
                    }
/* 17 */            if (this.I00io1l == null) {
/* 46 */                IioIoO10iOiI.I000OOo1O("Stream closed");
/* 1 */                 return 0;
                    }
/* 19 */            if (i2 == 0) {
/* 1 */                 return 0;
                    }
/* 22 */            int i4 = i;
/* 23 */            while (i4 < i3) {
/* 25 */                int iI000l1 = I000l1();
/* 29 */                if (iI000l1 < 0) {
                            break;
                        }
/* 34 */                bArr[i4] = (byte) iI000l1;
/* 31 */                i4++;
                    }
/* 38 */            if (i4 == i) {
/* 40 */                return -1;
                    }
/* 42 */            return i4 - i;
                }

                @Override
/* 86 */        public final int read() throws IOException {
/* 87 */            if (this.I00io1l != null) {
/* 88 */                return I000l1();
                    }
/* 89 */            IioIoO10iOiI.I000OOo1O("Stream closed");
                    return 0;
                }
            }

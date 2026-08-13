            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Field;
            import java.util.concurrent.ConcurrentHashMap;
            import sun.misc.Unsafe;
            
            public final class iI10O00O {
                public static final iI10O00O I0000Il00O;
                public iI0O1IoilI01 I00000oIO;
                public ConcurrentHashMap I00000oOI;

                static {
/* 3 */             iI10O00O ii10o00o = new iI10O00O();
/* 11 */            ii10o00o.I00000oOI = new ConcurrentHashMap();
/* 17 */            int i = i1ioiooIiOol.I00000oIO;
/* 20 */            iI0lOI0[] ii0loi0Arr = {Io1Oioii1111.I00io1l, iI0O1IoilI01.I00000oOI};
/* 32 */            i1IoOl i1iool = new i1IoOl();
/* 35 */            i1iool.I00iOIl = ii0loi0Arr;
/* 37 */            VarHandle.storeStoreFence();
/* 40 */            iI0O1IoilI01 ii0o1ioili01 = new iI0O1IoilI01();
/* 43 */            ii0o1ioili01.I00000oIO = i1iool;
/* 45 */            VarHandle.storeStoreFence();
/* 48 */            ii10o00o.I00000oIO = ii0o1ioili01;
/* 50 */            VarHandle.storeStoreFence();
/* 53 */            I0000Il00O = ii10o00o;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final iI110OIoiOl I00000oIO(Class cls) {
                    ConcurrentHashMap concurrentHashMap;
                    iI0oil0Ol ii0oil0ol;
                    int i;
                    int iCharAt;
                    int iCharAt2;
                    int iCharAt3;
                    int i2;
                    int i3;
                    int iCharAt4;
                    int i4;
                    int[] iArr;
                    int i5;
                    int i6;
                    char cCharAt;
                    int i7;
                    int i8;
                    char cCharAt2;
                    int i9;
                    char cCharAt3;
                    int i10;
                    char cCharAt4;
                    int i11;
                    char cCharAt5;
                    int i12;
                    char cCharAt6;
                    int i13;
                    char cCharAt7;
                    int i14;
                    int i15;
                    int i16;
                    int[] iArr2;
                    int i17;
                    int iObjectFieldOffset;
                    int i18;
                    int i19;
                    int i20;
                    int i21;
                    int i22;
                    Field fieldI001i1lo1io;
                    int i23;
                    char cCharAt8;
                    int i24;
                    int i25;
                    int i26;
                    int i27;
                    int i28;
                    int i29;
                    Field fieldI001i1lo1io2;
                    Field fieldI001i1lo1io3;
                    int i30;
                    char cCharAt9;
                    int i31;
                    int i32;
                    char cCharAt10;
                    int i33;
                    int i34;
                    char cCharAt11;
                    int i35;
                    int i36;
                    char cCharAt12;
/* 5 */             ConcurrentHashMap concurrentHashMap2 = this.I00000oOI;
/* 7 */             Object obj = concurrentHashMap2.get(cls);
/* 11 */            if (obj != null) {
/* 1219 */              return (iI110OIoiOl) obj;
                    }
/* 13 */            iI0O1IoilI01 ii0o1ioili01 = this.I00000oIO;
/* 15 */            ii0o1ioili01.getClass();
/* 18 */            O1oO0lOoI1 o1oO0lOoI1 = iI111lOOO.I00000oIO;
/* 26 */            if (!i1oi01OllI.class.isAssignableFrom(cls)) {
/* 28 */                int i37 = i1ioiooIiOol.I00000oIO;
                    }
/* 32 */            iI10oo00io ii10oo00ioZzc = ii0o1ioili01.I00000oIO.zzc(cls);
/* 40 */            int iCharAt5 = 0;
/* 47 */            if ((ii10oo00ioZzc.I0000O & 2) == 2) {
/* 1183 */              concurrentHashMap = concurrentHashMap2;
/* 1185 */              int i38 = i1ioiooIiOol.I00000oIO;
/* 1187 */              O1oO0lOoI1 o1oO0lOoI12 = iI111lOOO.I00000oIO;
/* 1189 */              int i39 = i1o1lO0.I00000oIO;
/* 1193 */              i1ilO0II i1ilo0ii = ii10oo00ioZzc.I00000oIO;
/* 1197 */              iI0oil0Ol ii0oil0ol2 = new iI0oil0Ol();
/* 1200 */              ii0oil0ol2.I00000oOI = o1oO0lOoI12;
/* 1202 */              ii0oil0ol2.I00000oIO = i1ilo0ii;
/* 1204 */              VarHandle.storeStoreFence();
/* 1207 */              ii0oil0ol = ii0oil0ol2;
                    } else {
/* 49 */                int i40 = i1ioiooIiOol.I00000oIO;
/* 51 */                int i41 = iI0ol0l1Ili.I00000oIO;
/* 53 */                int i42 = iI0IilII.I00000oIO;
/* 55 */                O1oO0lOoI1 o1oO0lOoI13 = iI111lOOO.I00000oIO;
/* 63 */                if (ii10oo00ioZzc.I00000oIO() - 1 != 1) {
/* 65 */                    int i43 = i1o1lO0.I00000oIO;
                        }
/* 67 */                int i44 = iI0i1I1l0ilo.I00000oIO;
/* 69 */                int[] iArr3 = iI0oOI1oolI1.I000iOII;
/* 73 */                if (!(ii10oo00ioZzc instanceof iI10oo00io)) {
/* 1176 */                  OIiilo1Ool0o.I00000oIO();
/* 1179 */                  return null;
                        }
/* 75 */                i1ilO0II i1ilo0ii2 = ii10oo00ioZzc.I00000oIO;
/* 77 */                String str = ii10oo00ioZzc.I00000oOI;
/* 79 */                int length = str.length();
/* 90 */                if (str.charAt(0) >= 55296) {
/* 92 */                    int i45 = 1;
                            while (true) {
/* 93 */                        i = i45 + 1;
/* 99 */                        if (str.charAt(i45) < 55296) {
                                    break;
                                }
/* 101 */                       i45 = i;
                            }
                        } else {
/* 103 */                   i = 1;
                        }
/* 104 */               int i46 = i + 1;
/* 106 */               int iCharAt6 = str.charAt(i);
/* 110 */               if (iCharAt6 >= 55296) {
/* 112 */                   int i47 = iCharAt6 & 8191;
/* 114 */                   int i48 = 13;
                            while (true) {
/* 116 */                       i36 = i46 + 1;
/* 118 */                       cCharAt12 = str.charAt(i46);
/* 122 */                       if (cCharAt12 < 55296) {
                                    break;
                                }
/* 127 */                       i47 |= (cCharAt12 & 8191) << i48;
/* 128 */                       i48 += 13;
/* 130 */                       i46 = i36;
                            }
/* 133 */                   iCharAt6 = i47 | (cCharAt12 << i48);
/* 134 */                   i46 = i36;
                        }
/* 135 */               if (iCharAt6 == 0) {
/* 137 */                   iArr = iI0oOI1oolI1.I000iOII;
/* 139 */                   i5 = 0;
/* 140 */                   iCharAt4 = 0;
/* 141 */                   iCharAt = 0;
/* 142 */                   iCharAt2 = 0;
/* 143 */                   iCharAt3 = 0;
/* 144 */                   i4 = 0;
                        } else {
/* 148 */                   int i49 = i46 + 1;
/* 150 */                   int iCharAt7 = str.charAt(i46);
/* 154 */                   if (iCharAt7 >= 55296) {
/* 156 */                       int i50 = iCharAt7 & 8191;
/* 158 */                       int i51 = 13;
                                while (true) {
/* 160 */                           i13 = i49 + 1;
/* 162 */                           cCharAt7 = str.charAt(i49);
/* 166 */                           if (cCharAt7 < 55296) {
                                        break;
                                    }
/* 171 */                           i50 |= (cCharAt7 & 8191) << i51;
/* 172 */                           i51 += 13;
/* 174 */                           i49 = i13;
                                }
/* 177 */                       iCharAt7 = i50 | (cCharAt7 << i51);
/* 178 */                       i49 = i13;
                            }
/* 179 */                   int i52 = i49 + 1;
/* 181 */                   int iCharAt8 = str.charAt(i49);
/* 185 */                   if (iCharAt8 >= 55296) {
/* 187 */                       int i53 = iCharAt8 & 8191;
/* 189 */                       int i54 = 13;
                                while (true) {
/* 191 */                           i12 = i52 + 1;
/* 193 */                           cCharAt6 = str.charAt(i52);
/* 197 */                           if (cCharAt6 < 55296) {
                                        break;
                                    }
/* 202 */                           i53 |= (cCharAt6 & 8191) << i54;
/* 203 */                           i54 += 13;
/* 205 */                           i52 = i12;
                                }
/* 208 */                       iCharAt8 = i53 | (cCharAt6 << i54);
/* 209 */                       i52 = i12;
                            }
/* 210 */                   int i55 = i52 + 1;
/* 212 */                   iCharAt = str.charAt(i52);
/* 216 */                   if (iCharAt >= 55296) {
/* 218 */                       int i56 = iCharAt & 8191;
/* 220 */                       int i57 = 13;
                                while (true) {
/* 222 */                           i11 = i55 + 1;
/* 224 */                           cCharAt5 = str.charAt(i55);
/* 228 */                           if (cCharAt5 < 55296) {
                                        break;
                                    }
/* 233 */                           i56 |= (cCharAt5 & 8191) << i57;
/* 234 */                           i57 += 13;
/* 236 */                           i55 = i11;
                                }
/* 240 */                       iCharAt = i56 | (cCharAt5 << i57);
/* 241 */                       i55 = i11;
                            }
/* 243 */                   int i58 = i55 + 1;
/* 245 */                   iCharAt2 = str.charAt(i55);
/* 249 */                   if (iCharAt2 >= 55296) {
/* 251 */                       int i59 = iCharAt2 & 8191;
/* 253 */                       int i60 = 13;
                                while (true) {
/* 255 */                           i10 = i58 + 1;
/* 257 */                           cCharAt4 = str.charAt(i58);
/* 261 */                           if (cCharAt4 < 55296) {
                                        break;
                                    }
/* 267 */                           i59 |= (cCharAt4 & 8191) << i60;
/* 268 */                           i60 += 13;
/* 270 */                           i58 = i10;
                                }
/* 275 */                       iCharAt2 = i59 | (cCharAt4 << i60);
/* 276 */                       i58 = i10;
                            }
/* 278 */                   int i61 = i58 + 1;
/* 280 */                   iCharAt3 = str.charAt(i58);
/* 284 */                   if (iCharAt3 >= 55296) {
/* 286 */                       int i62 = iCharAt3 & 8191;
/* 288 */                       int i63 = i61;
/* 290 */                       int i64 = 13;
                                while (true) {
/* 292 */                           i9 = i63 + 1;
/* 294 */                           cCharAt3 = str.charAt(i63);
/* 298 */                           if (cCharAt3 < 55296) {
                                        break;
                                    }
/* 304 */                           i62 |= (cCharAt3 & 8191) << i64;
/* 305 */                           i64 += 13;
/* 307 */                           i63 = i9;
                                }
/* 312 */                       iCharAt3 = i62 | (cCharAt3 << i64);
/* 313 */                       i2 = i9;
                            } else {
/* 316 */                       i2 = i61;
                            }
/* 318 */                   int i65 = i2 + 1;
/* 320 */                   iCharAt5 = str.charAt(i2);
/* 324 */                   if (iCharAt5 >= 55296) {
/* 326 */                       int i66 = iCharAt5 & 8191;
/* 328 */                       int i67 = i65;
/* 330 */                       int i68 = 13;
                                while (true) {
/* 332 */                           i8 = i67 + 1;
/* 334 */                           cCharAt2 = str.charAt(i67);
/* 338 */                           if (cCharAt2 < 55296) {
                                        break;
                                    }
/* 344 */                           i66 |= (cCharAt2 & 8191) << i68;
/* 345 */                           i68 += 13;
/* 347 */                           i67 = i8;
                                }
/* 352 */                       iCharAt5 = i66 | (cCharAt2 << i68);
/* 353 */                       i3 = i8;
                            } else {
/* 356 */                       i3 = i65;
                            }
/* 358 */                   int i69 = i3 + 1;
/* 364 */                   if (str.charAt(i3) >= 55296) {
/* 374 */                       do {
/* 366 */                           i7 = i69;
/* 368 */                           i69 = i7 + 1;
/* 374 */                       } while (str.charAt(i7) >= 55296);
                            }
/* 377 */                   int i70 = i69;
/* 379 */                   int i71 = i70 + 1;
/* 381 */                   iCharAt4 = str.charAt(i70);
/* 385 */                   if (iCharAt4 >= 55296) {
/* 387 */                       int i72 = iCharAt4 & 8191;
/* 389 */                       int i73 = i71;
/* 391 */                       int i74 = 13;
                                while (true) {
/* 393 */                           i6 = i73 + 1;
/* 395 */                           cCharAt = str.charAt(i73);
/* 399 */                           if (cCharAt < 55296) {
                                        break;
                                    }
/* 405 */                           i72 |= (cCharAt & 8191) << i74;
/* 406 */                           i74 += 13;
/* 408 */                           i73 = i6;
                                }
/* 413 */                       iCharAt4 = i72 | (cCharAt << i74);
/* 414 */                       i71 = i6;
                            }
/* 421 */                   i4 = iCharAt7 + iCharAt7 + iCharAt8;
/* 423 */                   iArr = new int[iCharAt4 + iCharAt5 + iCharAt7];
/* 425 */                   i5 = iCharAt7;
/* 426 */                   i46 = i71;
                        }
/* 428 */               Unsafe unsafe = iI0oOI1oolI1.I000l1;
/* 430 */               int i75 = iCharAt5;
/* 432 */               Object[] objArr = ii10oo00ioZzc.I0000Il00O;
/* 436 */               Class<?> cls2 = i1ilo0ii2.getClass();
/* 440 */               int i76 = i5;
/* 442 */               int i77 = iCharAt4 + i75;
/* 444 */               int i78 = i46;
/* 446 */               int i79 = iCharAt3 + iCharAt3;
/* 450 */               int i80 = 3;
/* 454 */               int[] iArr4 = new int[iCharAt3 * 3];
/* 456 */               Object[] objArr2 = new Object[i79];
/* 458 */               concurrentHashMap = concurrentHashMap2;
/* 460 */               int i81 = i77;
/* 462 */               int i82 = iCharAt4;
/* 464 */               int i83 = i78;
/* 466 */               int i84 = 0;
/* 467 */               int i85 = 0;
/* 469 */               while (i83 < length) {
/* 471 */                   int i86 = i83 + 1;
/* 473 */                   int iCharAt9 = str.charAt(i83);
/* 477 */                   int i87 = length;
/* 482 */                   if (iCharAt9 >= 55296) {
/* 484 */                       int i88 = iCharAt9 & 8191;
/* 486 */                       int i89 = i86;
/* 488 */                       int i90 = 13;
                                while (true) {
/* 490 */                           i34 = i89 + 1;
/* 492 */                           cCharAt11 = str.charAt(i89);
/* 496 */                           i35 = i88;
/* 501 */                           if (cCharAt11 < 55296) {
                                        break;
                                    }
/* 507 */                           i88 = i35 | ((cCharAt11 & 8191) << i90);
/* 509 */                           i90 += 13;
/* 511 */                           i89 = i34;
                                }
/* 516 */                       iCharAt9 = i35 | (cCharAt11 << i90);
/* 518 */                       i14 = i34;
                            } else {
/* 521 */                       i14 = i86;
                            }
/* 523 */                   int i91 = i14 + 1;
/* 525 */                   int iCharAt10 = str.charAt(i14);
/* 529 */                   int i92 = iCharAt9;
/* 534 */                   if (iCharAt10 >= 55296) {
/* 536 */                       int i93 = iCharAt10 & 8191;
/* 538 */                       int i94 = i91;
/* 540 */                       int i95 = 13;
                                while (true) {
/* 542 */                           i32 = i94 + 1;
/* 544 */                           cCharAt10 = str.charAt(i94);
/* 548 */                           i33 = i93;
/* 553 */                           if (cCharAt10 < 55296) {
                                        break;
                                    }
/* 559 */                           i93 = i33 | ((cCharAt10 & 8191) << i95);
/* 561 */                           i95 += 13;
/* 563 */                           i94 = i32;
                                }
/* 568 */                       iCharAt10 = i33 | (cCharAt10 << i95);
/* 570 */                       i15 = i32;
                            } else {
/* 573 */                       i15 = i91;
                            }
/* 575 */                   iI10oo00io ii10oo00io = ii10oo00ioZzc;
/* 579 */                   if ((iCharAt10 & Barcode.FORMAT_UPC_E) != 0) {
/* 583 */                       iArr[i85] = i84;
/* 581 */                       i85++;
                            }
/* 587 */                   int i96 = iCharAt10 & 255;
/* 589 */                   O1oO0lOoI1 o1oO0lOoI14 = o1oO0lOoI13;
/* 591 */                   int i97 = iCharAt10 & Barcode.FORMAT_PDF417;
/* 597 */                   if (i96 >= 51) {
/* 599 */                       int i98 = i15 + 1;
/* 601 */                       int iCharAt11 = str.charAt(i15);
/* 610 */                       if (iCharAt11 >= 55296) {
/* 612 */                           int i99 = iCharAt11 & 8191;
/* 614 */                           int i100 = i98;
/* 616 */                           int i101 = 13;
                                    while (true) {
/* 618 */                               i30 = i100 + 1;
/* 620 */                               cCharAt9 = str.charAt(i100);
/* 624 */                               i31 = i99;
/* 629 */                               if (cCharAt9 < 55296) {
                                            break;
                                        }
/* 635 */                               i99 = i31 | ((cCharAt9 & 8191) << i101);
/* 637 */                               i101 += 13;
/* 639 */                               i100 = i30;
                                    }
/* 644 */                           iCharAt11 = i31 | (cCharAt9 << i101);
/* 646 */                           i28 = i30;
                                } else {
/* 649 */                           i28 = i98;
                                }
/* 651 */                       int i102 = iCharAt11;
                                int i103 = i96 - 51;
/* 655 */                       i19 = i28;
/* 659 */                       if (i103 == 9 || i103 == 17) {
/* 712 */                           objArr2[OooioIOo1.I001i1lo1io(i84, i80, 1)] = objArr[i4];
/* 714 */                           i29 = i97;
/* 704 */                           i4++;
                                } else if (i103 != 12) {
/* 701 */                           i29 = i97;
                                } else if (ii10oo00io.I00000oIO() == 1 || i97 != 0) {
/* 697 */                           objArr2[OooioIOo1.I001i1lo1io(i84, i80, 1)] = objArr[i4];
/* 685 */                           i4++;
/* 701 */                           i29 = i97;
                                } else {
/* 683 */                           i29 = 0;
                                }
/* 718 */                       int i104 = i102 + i102;
/* 722 */                       Object obj2 = objArr[i104];
/* 724 */                       int i105 = i29;
/* 728 */                       if (obj2 instanceof Field) {
/* 730 */                           fieldI001i1lo1io2 = (Field) obj2;
                                } else {
/* 738 */                           fieldI001i1lo1io2 = iI0oOI1oolI1.I001i1lo1io(cls2, (String) obj2);
/* 742 */                           objArr[i104] = fieldI001i1lo1io2;
/* 746 */                           iArr[i81] = i84;
/* 744 */                           i81++;
                                }
/* 732 */                       int[] iArr5 = iArr;
/* 733 */                       i16 = iCharAt4;
/* 755 */                       int iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldI001i1lo1io2);
/* 756 */                       int i106 = i104 + 1;
/* 758 */                       Object obj3 = objArr[i106];
/* 764 */                       if (obj3 instanceof Field) {
/* 766 */                           fieldI001i1lo1io3 = (Field) obj3;
                                } else {
/* 771 */                           fieldI001i1lo1io3 = iI0oOI1oolI1.I001i1lo1io(cls2, (String) obj3);
/* 775 */                           objArr[i106] = fieldI001i1lo1io3;
                                }
/* 784 */                       iArr2 = iArr5;
/* 786 */                       i21 = i105;
/* 788 */                       i18 = i96;
/* 790 */                       i17 = i4;
/* 792 */                       i22 = 0;
/* 781 */                       iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldI001i1lo1io3);
/* 795 */                       i20 = iObjectFieldOffset2;
                            } else {
/* 799 */                       int[] iArr6 = iArr;
/* 800 */                       i16 = iCharAt4;
/* 802 */                       int i107 = i4 + 1;
/* 808 */                       Field fieldI001i1lo1io4 = iI0oOI1oolI1.I001i1lo1io(cls2, (String) objArr[i4]);
/* 812 */                       iArr2 = iArr6;
/* 816 */                       if (i96 == 9 || i96 == 17) {
/* 822 */                           i17 = i107;
/* 957 */                           objArr2[OooioIOo1.I001i1lo1io(i84, 3, 1)] = fieldI001i1lo1io4.getType();
                                } else {
/* 830 */                           if (i96 == 27) {
/* 934 */                               i24 = i107;
/* 936 */                               i25 = 3;
/* 937 */                               i26 = 1;
/* 938 */                               i27 = i4 + 2;
                                    } else if (i96 == 49) {
/* 836 */                               i27 = i4 + 2;
/* 838 */                               i24 = i107;
/* 840 */                               i25 = 3;
/* 841 */                               i26 = 1;
                                    } else if (i96 == 12 || i96 == 30 || i96 == 44) {
/* 908 */                               i17 = i107;
/* 911 */                               if (ii10oo00io.I00000oIO() == 1 || i97 != 0) {
/* 920 */                                   i27 = i4 + 2;
/* 929 */                                   objArr2[OooioIOo1.I001i1lo1io(i84, 3, 1)] = objArr[i17];
/* 931 */                                   i17 = i27;
                                        } else {
/* 917 */                                   i97 = 0;
                                        }
                                    } else if (i96 == 50) {
/* 861 */                               int i108 = i4 + 2;
/* 863 */                               int i109 = i82 + 1;
/* 865 */                               iArr2[i82] = i84;
/* 867 */                               int i110 = i84 / 3;
/* 871 */                               int i111 = i110 + i110;
/* 873 */                               objArr2[i111] = objArr[i107];
/* 875 */                               if (i97 != 0) {
/* 883 */                                   objArr2[i111 + 1] = objArr[i108];
/* 885 */                                   i82 = i109;
/* 879 */                                   i17 = i4 + 3;
                                        } else {
/* 891 */                                   i82 = i109;
/* 893 */                                   i97 = 0;
/* 895 */                                   i17 = i108;
                                        }
                                    } else {
/* 899 */                               i17 = i107;
                                    }
/* 946 */                           objArr2[OooioIOo1.I001i1lo1io(i84, i25, i26)] = objArr[i24];
/* 931 */                           i17 = i27;
                                }
/* 963 */                       int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldI001i1lo1io4);
/* 966 */                       iObjectFieldOffset = 1048575;
/* 969 */                       if ((iCharAt10 & Barcode.FORMAT_AZTEC) == 0 || i96 > 17) {
/* 1056 */                          i18 = i96;
/* 1058 */                          i19 = i15;
/* 1060 */                          i20 = iObjectFieldOffset3;
/* 1061 */                          i21 = i97;
/* 1063 */                          i22 = 0;
                                } else {
/* 975 */                           int i112 = i15 + 1;
/* 977 */                           int iCharAt12 = str.charAt(i15);
/* 984 */                           if (iCharAt12 >= 55296) {
/* 986 */                               int i113 = iCharAt12 & 8191;
/* 988 */                               int i114 = 13;
                                        while (true) {
/* 990 */                                   i23 = i112 + 1;
/* 992 */                                   cCharAt8 = str.charAt(i112);
/* 996 */                                   if (cCharAt8 < 55296) {
                                                break;
                                            }
/* 1002 */                                  i113 |= (cCharAt8 & 8191) << i114;
/* 1003 */                                  i114 += 13;
/* 1005 */                                  i112 = i23;
                                        }
/* 1010 */                              iCharAt12 = i113 | (cCharAt8 << i114);
/* 1011 */                              i112 = i23;
                                    }
/* 1017 */                          int i115 = (iCharAt12 / 32) + i76 + i76;
/* 1019 */                          Object obj4 = objArr[i115];
/* 1021 */                          i18 = i96;
/* 1025 */                          if (obj4 instanceof Field) {
/* 1027 */                              fieldI001i1lo1io = (Field) obj4;
                                    } else {
/* 1034 */                              fieldI001i1lo1io = iI0oOI1oolI1.I001i1lo1io(cls2, (String) obj4);
/* 1038 */                              objArr[i115] = fieldI001i1lo1io;
                                    }
/* 1046 */                          i22 = iCharAt12 % 32;
/* 1045 */                          iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldI001i1lo1io);
/* 1050 */                          i20 = iObjectFieldOffset3;
/* 1051 */                          i19 = i112;
/* 1053 */                          i21 = i97;
                                }
                            }
/* 1064 */                  int i116 = i84 + 1;
/* 1066 */                  iArr4[i84] = i92;
/* 1068 */                  int i117 = i84 + 2;
/* 1070 */                  int i118 = i22;
/* 1101 */                  iArr4[i116] = ((iCharAt10 & Barcode.FORMAT_UPC_A) != 0 ? 536870912 : 0) | ((iCharAt10 & Barcode.FORMAT_QR_CODE) != 0 ? 268435456 : 0) | (i21 != 0 ? Integer.MIN_VALUE : 0) | (i18 << 20) | i20;
/* 1103 */                  i84 += 3;
/* 1109 */                  iArr4[i117] = (i118 << 20) | iObjectFieldOffset;
/* 1111 */                  ii10oo00ioZzc = ii10oo00io;
/* 1113 */                  length = i87;
/* 1115 */                  o1oO0lOoI13 = o1oO0lOoI14;
/* 1117 */                  iArr = iArr2;
/* 1119 */                  i4 = i17;
/* 1121 */                  i83 = i19;
/* 1123 */                  iCharAt4 = i16;
/* 1125 */                  i80 = 3;
                        }
/* 1137 */              iI0oOI1oolI1 ii0ooi1ooli1 = new iI0oOI1oolI1();
/* 1140 */              ii0ooi1ooli1.I00000oIO = iArr4;
/* 1142 */              ii0ooi1ooli1.I00000oOI = objArr2;
/* 1144 */              ii0ooi1ooli1.I0000Il00O = iCharAt;
/* 1146 */              ii0ooi1ooli1.I0000O = iCharAt2;
/* 1150 */              ii0ooi1ooli1.I0001Ioi1lo = i1ilo0ii2 instanceof i1oi01OllI;
/* 1154 */              ii0ooi1ooli1.I000II = iArr;
/* 1158 */              ii0ooi1ooli1.I000O01llI0 = iCharAt4;
/* 1160 */              ii0ooi1ooli1.I000OOo1O = i77;
/* 1164 */              ii0ooi1ooli1.I000OiO = o1oO0lOoI13;
/* 1166 */              ii0ooi1ooli1.I0000oI00 = i1ilo0ii2;
/* 1168 */              VarHandle.storeStoreFence();
                        ii0oil0ol = ii0ooi1ooli1;
                    }
/* 1213 */          iI110OIoiOl ii110oioiol = (iI110OIoiOl) concurrentHashMap.putIfAbsent(cls, ii0oil0ol);
                    return ii110oioiol != null ? ii110oioiol : ii0oil0ol;
                }
            }

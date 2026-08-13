            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Field;
            import java.util.concurrent.ConcurrentHashMap;
            import sun.misc.Unsafe;
            
            public final class iOloOOOIOII {
                public static final iOloOOOIOII I00000oOI;
                public ConcurrentHashMap I00000oIO;

                static {
/* 3 */             iOloOOOIOII iolooooioii = new iOloOOOIOII();
/* 11 */            iolooooioii.I00000oIO = new ConcurrentHashMap();
/* 13 */            VarHandle.storeStoreFence();
/* 16 */            I00000oOI = iolooooioii;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:187:0x03e3  */
                /* JADX WARN: Removed duplicated region for block: B:201:0x0441  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final iOloi11 I00000oIO(Class cls) {
                    int i;
                    int iCharAt;
                    int iCharAt2;
                    int i2;
                    int i3;
                    int iCharAt3;
                    int i4;
                    int i5;
                    int iCharAt4;
                    int i6;
                    int[] iArr;
                    int i7;
                    int i8;
                    char cCharAt;
                    int i9;
                    int i10;
                    char cCharAt2;
                    int i11;
                    char cCharAt3;
                    int i12;
                    char cCharAt4;
                    int i13;
                    char cCharAt5;
                    int i14;
                    char cCharAt6;
                    int i15;
                    char cCharAt7;
                    int i16;
                    int i17;
                    iOl10IOiOi0 iol10ioioi0;
                    int i18;
                    Class<?> cls2;
                    int iObjectFieldOffset;
                    int i19;
                    Class<?> cls3;
                    int i20;
                    int iObjectFieldOffset2;
                    int i21;
                    int i22;
                    Class<?> cls4;
                    Field fieldI000iOII;
                    int i23;
                    char cCharAt8;
                    int i24;
                    int i25;
                    int i26;
                    int i27;
                    int i28;
                    int i29;
                    Field fieldI000iOII2;
                    Field fieldI000iOII3;
                    int i30;
                    char cCharAt9;
                    int i31;
                    char cCharAt10;
                    int i32;
                    int i33;
                    char cCharAt11;
                    int i34;
                    int i35;
                    char cCharAt12;
                    iOllOIi iolloii;
/* 3 */             Class cls5 = cls;
/* 5 */             ConcurrentHashMap concurrentHashMap = this.I00000oIO;
/* 7 */             Object obj = concurrentHashMap.get(cls5);
/* 11 */            if (obj != null) {
/* 1259 */              return (iOloi11) obj;
                    }
/* 13 */            i1i0olI i1i0oli = iOloiOio.I00000oIO;
/* 21 */            if (!iOlOoOlI0li1.class.isAssignableFrom(cls5)) {
/* 23 */                int i36 = iOl10iIiIiOi.I00000oIO;
                    }
/* 25 */            int i37 = iOl10iIiIiOi.I00000oIO;
/* 32 */            if (!iOlOoOlI0li1.class.isAssignableFrom(cls5)) {
/* 1255 */              I000II.I000iOII("Unsupported message type: ".concat(cls5.getName()));
/* 31 */                return null;
                    }
                    try {
/* 47 */                iOloi0ll0o ioloi0ll0o = (iOloi0ll0o) iOlOoOlI0li1.I0000O(cls5.asSubclass(iOlOoOlI0li1.class)).I000O01llI0(3);
/* 53 */                int iCharAt5 = 0;
/* 59 */                if ((ioloi0ll0o.I0000O & 2) == 2) {
/* 61 */                    i1i0olI i1i0oli2 = iOloiOio.I00000oIO;
/* 63 */                    iOl10IOiOi0 iol10ioioi02 = ioloi0ll0o.I00000oIO;
/* 67 */                    iOloO1I0IO0i ioloo1i0io0i = new iOloO1I0IO0i();
/* 70 */                    ioloo1i0io0i.I00000oIO = iol10ioioi02;
/* 72 */                    VarHandle.storeStoreFence();
                            iolloii = ioloo1i0io0i;
                        } else {
/* 77 */                    i1i0olI i1i0oli3 = iOloiOio.I00000oIO;
/* 79 */                    Unsafe unsafe = iOllOIi.I000OiO;
/* 81 */                    if (unsafe == null) {
/* 1229 */                      throw new RuntimeException("Lite gencode is primarily intended for Android use and uses sun.misc.Unsafe which is not available in the current environment. To run in this environment, you may need to switch to standard gencode.");
                            }
/* 85 */                    if (!(ioloi0ll0o instanceof iOloi0ll0o)) {
/* 1218 */                      OIiilo1Ool0o.I00000oIO();
/* 31 */                        return null;
                            }
/* 87 */                    iOl10IOiOi0 iol10ioioi03 = ioloi0ll0o.I00000oIO;
/* 89 */                    String str = ioloi0ll0o.I00000oOI;
/* 91 */                    int length = str.length();
/* 102 */                   if (str.charAt(0) >= 55296) {
/* 104 */                       int i38 = 1;
                                while (true) {
/* 105 */                           i = i38 + 1;
/* 111 */                           if (str.charAt(i38) < 55296) {
                                        break;
                                    }
/* 113 */                           i38 = i;
                                }
                            } else {
/* 115 */                       i = 1;
                            }
/* 116 */                   int i39 = i + 1;
/* 118 */                   int iCharAt6 = str.charAt(i);
/* 122 */                   if (iCharAt6 >= 55296) {
/* 124 */                       int i40 = iCharAt6 & 8191;
/* 126 */                       int i41 = 13;
                                while (true) {
/* 128 */                           i35 = i39 + 1;
/* 130 */                           cCharAt12 = str.charAt(i39);
/* 134 */                           if (cCharAt12 < 55296) {
                                        break;
                                    }
/* 139 */                           i40 |= (cCharAt12 & 8191) << i41;
/* 140 */                           i41 += 13;
/* 142 */                           i39 = i35;
                                }
/* 145 */                       iCharAt6 = i40 | (cCharAt12 << i41);
/* 146 */                       i39 = i35;
                            }
/* 147 */                   if (iCharAt6 == 0) {
/* 149 */                       iArr = iOllOIi.I000OOo1O;
/* 151 */                       i4 = 3;
/* 153 */                       iCharAt4 = 0;
/* 154 */                       i7 = 0;
/* 155 */                       iCharAt3 = 0;
/* 156 */                       iCharAt = 0;
/* 157 */                       iCharAt2 = 0;
/* 158 */                       i6 = 0;
                            } else {
/* 162 */                       int i42 = i39 + 1;
/* 164 */                       int iCharAt7 = str.charAt(i39);
/* 168 */                       if (iCharAt7 >= 55296) {
/* 170 */                           int i43 = iCharAt7 & 8191;
/* 172 */                           int i44 = 13;
                                    while (true) {
/* 174 */                               i15 = i42 + 1;
/* 176 */                               cCharAt7 = str.charAt(i42);
/* 180 */                               if (cCharAt7 < 55296) {
                                            break;
                                        }
/* 185 */                               i43 |= (cCharAt7 & 8191) << i44;
/* 186 */                               i44 += 13;
/* 188 */                               i42 = i15;
                                    }
/* 191 */                           iCharAt7 = i43 | (cCharAt7 << i44);
/* 192 */                           i42 = i15;
                                }
/* 193 */                       int i45 = i42 + 1;
/* 195 */                       int iCharAt8 = str.charAt(i42);
/* 199 */                       if (iCharAt8 >= 55296) {
/* 201 */                           int i46 = iCharAt8 & 8191;
/* 203 */                           int i47 = 13;
                                    while (true) {
/* 205 */                               i14 = i45 + 1;
/* 207 */                               cCharAt6 = str.charAt(i45);
/* 211 */                               if (cCharAt6 < 55296) {
                                            break;
                                        }
/* 216 */                               i46 |= (cCharAt6 & 8191) << i47;
/* 217 */                               i47 += 13;
/* 219 */                               i45 = i14;
                                    }
/* 223 */                           iCharAt8 = i46 | (cCharAt6 << i47);
/* 224 */                           i45 = i14;
                                }
/* 226 */                       int i48 = i45 + 1;
/* 228 */                       iCharAt = str.charAt(i45);
/* 232 */                       if (iCharAt >= 55296) {
/* 234 */                           int i49 = iCharAt & 8191;
/* 236 */                           int i50 = 13;
                                    while (true) {
/* 238 */                               i13 = i48 + 1;
/* 240 */                               cCharAt5 = str.charAt(i48);
/* 244 */                               if (cCharAt5 < 55296) {
                                            break;
                                        }
/* 250 */                               i49 |= (cCharAt5 & 8191) << i50;
/* 251 */                               i50 += 13;
/* 253 */                               i48 = i13;
                                    }
/* 258 */                           iCharAt = i49 | (cCharAt5 << i50);
/* 259 */                           i48 = i13;
                                }
/* 261 */                       int i51 = i48 + 1;
/* 263 */                       iCharAt2 = str.charAt(i48);
/* 267 */                       if (iCharAt2 >= 55296) {
/* 269 */                           int i52 = iCharAt2 & 8191;
/* 271 */                           int i53 = i51;
/* 273 */                           int i54 = 13;
                                    while (true) {
/* 275 */                               i12 = i53 + 1;
/* 277 */                               cCharAt4 = str.charAt(i53);
/* 281 */                               if (cCharAt4 < 55296) {
                                            break;
                                        }
/* 287 */                               i52 |= (cCharAt4 & 8191) << i54;
/* 288 */                               i54 += 13;
/* 290 */                               i53 = i12;
                                    }
/* 295 */                           iCharAt2 = i52 | (cCharAt4 << i54);
/* 296 */                           i2 = i12;
                                } else {
/* 299 */                           i2 = i51;
                                }
/* 301 */                       int i55 = i2 + 1;
/* 303 */                       iCharAt5 = str.charAt(i2);
/* 307 */                       if (iCharAt5 >= 55296) {
/* 309 */                           int i56 = iCharAt5 & 8191;
/* 311 */                           int i57 = i55;
/* 313 */                           int i58 = 13;
                                    while (true) {
/* 315 */                               i11 = i57 + 1;
/* 317 */                               cCharAt3 = str.charAt(i57);
/* 321 */                               if (cCharAt3 < 55296) {
                                            break;
                                        }
/* 327 */                               i56 |= (cCharAt3 & 8191) << i58;
/* 328 */                               i58 += 13;
/* 330 */                               i57 = i11;
                                    }
/* 335 */                           iCharAt5 = i56 | (cCharAt3 << i58);
/* 336 */                           i3 = i11;
                                } else {
/* 339 */                           i3 = i55;
                                }
/* 341 */                       int i59 = i3 + 1;
/* 343 */                       iCharAt3 = str.charAt(i3);
/* 347 */                       if (iCharAt3 >= 55296) {
/* 349 */                           int i60 = iCharAt3 & 8191;
/* 351 */                           i4 = 3;
/* 353 */                           int i61 = i59;
/* 355 */                           int i62 = 13;
                                    while (true) {
/* 357 */                               i10 = i61 + 1;
/* 359 */                               cCharAt2 = str.charAt(i61);
/* 363 */                               if (cCharAt2 < 55296) {
                                            break;
                                        }
/* 369 */                               i60 |= (cCharAt2 & 8191) << i62;
/* 370 */                               i62 += 13;
/* 372 */                               i61 = i10;
                                    }
/* 377 */                           iCharAt3 = i60 | (cCharAt2 << i62);
/* 378 */                           i5 = i10;
                                } else {
/* 381 */                           i4 = 3;
/* 383 */                           i5 = i59;
                                }
/* 385 */                       int i63 = i5 + 1;
/* 391 */                       if (str.charAt(i5) >= 55296) {
/* 401 */                           do {
/* 393 */                               i9 = i63;
/* 395 */                               i63 = i9 + 1;
/* 401 */                           } while (str.charAt(i9) >= 55296);
                                }
/* 404 */                       int i64 = i63;
/* 406 */                       int i65 = i64 + 1;
/* 408 */                       iCharAt4 = str.charAt(i64);
/* 412 */                       if (iCharAt4 >= 55296) {
/* 414 */                           int i66 = iCharAt4 & 8191;
/* 416 */                           int i67 = i65;
/* 418 */                           int i68 = 13;
                                    while (true) {
/* 420 */                               i8 = i67 + 1;
/* 422 */                               cCharAt = str.charAt(i67);
/* 426 */                               if (cCharAt < 55296) {
                                            break;
                                        }
/* 432 */                               i66 |= (cCharAt & 8191) << i68;
/* 433 */                               i68 += 13;
/* 435 */                               i67 = i8;
                                    }
/* 440 */                           iCharAt4 = i66 | (cCharAt << i68);
/* 441 */                           i65 = i8;
                                }
/* 448 */                       i6 = iCharAt7 + iCharAt7 + iCharAt8;
/* 450 */                       iArr = new int[iCharAt4 + iCharAt3 + iCharAt7];
/* 452 */                       i7 = iCharAt7;
/* 453 */                       i39 = i65;
                            }
/* 455 */                   Object[] objArr = ioloi0ll0o.I0000Il00O;
/* 459 */                   Class<?> cls6 = iol10ioioi03.getClass();
/* 463 */                   int i69 = iCharAt3 + iCharAt4;
/* 464 */                   int i70 = iCharAt5;
/* 468 */                   int i71 = i7;
/* 472 */                   int[] iArr2 = new int[i70 * 3];
/* 474 */                   Object[] objArr2 = new Object[i70 + i70];
/* 476 */                   int i72 = iCharAt4;
/* 480 */                   int i73 = i69;
/* 482 */                   int i74 = 0;
/* 483 */                   int i75 = 0;
/* 485 */                   while (i39 < length) {
/* 487 */                       int i76 = i39 + 1;
/* 489 */                       int iCharAt9 = str.charAt(i39);
/* 493 */                       int i77 = length;
/* 498 */                       if (iCharAt9 >= 55296) {
/* 500 */                           int i78 = iCharAt9 & 8191;
/* 502 */                           int i79 = i76;
/* 504 */                           int i80 = 13;
                                    while (true) {
/* 506 */                               i33 = i79 + 1;
/* 508 */                               cCharAt11 = str.charAt(i79);
/* 512 */                               i34 = i78;
/* 517 */                               if (cCharAt11 < 55296) {
                                            break;
                                        }
/* 523 */                               i78 = i34 | ((cCharAt11 & 8191) << i80);
/* 525 */                               i80 += 13;
/* 527 */                               i79 = i33;
                                    }
/* 532 */                           iCharAt9 = i34 | (cCharAt11 << i80);
/* 534 */                           i16 = i33;
                                } else {
/* 537 */                           i16 = i76;
                                }
/* 539 */                       int i81 = i16 + 1;
/* 541 */                       int iCharAt10 = str.charAt(i16);
/* 545 */                       int i82 = iCharAt9;
/* 550 */                       if (iCharAt10 >= 55296) {
/* 552 */                           int i83 = iCharAt10 & 8191;
/* 554 */                           int i84 = i81;
/* 556 */                           int i85 = 13;
                                    while (true) {
/* 558 */                               i31 = i84 + 1;
/* 560 */                               cCharAt10 = str.charAt(i84);
/* 564 */                               i32 = i83;
/* 569 */                               if (cCharAt10 < 55296) {
                                            break;
                                        }
/* 575 */                               i83 = i32 | ((cCharAt10 & 8191) << i85);
/* 577 */                               i85 += 13;
/* 579 */                               i84 = i31;
                                    }
/* 584 */                           iCharAt10 = i32 | (cCharAt10 << i85);
/* 586 */                           i39 = i31;
                                } else {
/* 589 */                           i39 = i81;
                                }
/* 591 */                       ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
/* 595 */                       if ((iCharAt10 & Barcode.FORMAT_UPC_E) != 0) {
/* 599 */                           iArr[i75] = i74;
/* 597 */                           i75++;
                                }
/* 603 */                       int i86 = iCharAt10 & 255;
/* 605 */                       int i87 = iCharAt10 & Barcode.FORMAT_PDF417;
/* 611 */                       if (i86 >= 51) {
/* 613 */                           int i88 = i39 + 1;
/* 615 */                           int iCharAt11 = str.charAt(i39);
/* 621 */                           char c = 55296;
/* 624 */                           if (iCharAt11 >= 55296) {
/* 626 */                               int i89 = iCharAt11 & 8191;
/* 632 */                               int i90 = i88;
/* 634 */                               int i91 = 13;
                                        while (true) {
/* 636 */                                   i30 = i90 + 1;
/* 638 */                                   cCharAt9 = str.charAt(i90);
/* 642 */                                   if (cCharAt9 < c) {
                                                break;
                                            }
/* 648 */                                   i89 |= (cCharAt9 & 8191) << i91;
/* 650 */                                   i91 += 13;
/* 652 */                                   i90 = i30;
/* 654 */                                   c = 55296;
                                        }
/* 660 */                               iCharAt11 = i89 | (cCharAt9 << i91);
/* 662 */                               i28 = i30;
                                    } else {
/* 665 */                               i28 = i88;
                                    }
/* 667 */                           int i92 = i28;
                                    int i93 = i86 - 51;
/* 671 */                           int i94 = iCharAt11;
/* 675 */                           if (i93 == 9 || i93 == 17) {
/* 728 */                               objArr2[OooioIOo1.I001i1lo1io(i74, i4, 1)] = objArr[i6];
/* 730 */                               i29 = i87;
/* 720 */                               i6++;
                                    } else if (i93 != 12) {
/* 717 */                               i29 = i87;
                                    } else if (ioloi0ll0o.I00000oIO() == 1 || i87 != 0) {
/* 713 */                               objArr2[OooioIOo1.I001i1lo1io(i74, i4, 1)] = objArr[i6];
/* 701 */                               i6++;
/* 717 */                               i29 = i87;
                                    } else {
/* 699 */                               i29 = 0;
                                    }
/* 734 */                           int i95 = i94 + i94;
/* 736 */                           int i96 = i29;
/* 738 */                           Object obj2 = objArr[i95];
/* 744 */                           if (obj2 instanceof Field) {
/* 746 */                               fieldI000iOII2 = (Field) obj2;
                                    } else {
/* 755 */                               fieldI000iOII2 = iOllOIi.I000iOII(cls6, (String) obj2);
/* 759 */                               objArr[i95] = fieldI000iOII2;
/* 763 */                               iArr[i73] = i74;
/* 761 */                               i73++;
                                    }
/* 748 */                           i17 = iCharAt4;
/* 750 */                           iol10ioioi0 = iol10ioioi03;
/* 772 */                           int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldI000iOII2);
/* 773 */                           int i97 = i95 + 1;
/* 775 */                           Object obj3 = objArr[i97];
/* 779 */                           if (obj3 instanceof Field) {
/* 781 */                               fieldI000iOII3 = (Field) obj3;
                                    } else {
/* 786 */                               fieldI000iOII3 = iOllOIi.I000iOII(cls6, (String) obj3);
/* 790 */                               objArr[i97] = fieldI000iOII3;
                                    }
/* 797 */                           i19 = i86;
/* 799 */                           cls3 = cls6;
/* 796 */                           iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldI000iOII3);
/* 801 */                           i39 = i92;
/* 803 */                           i22 = 0;
/* 807 */                           i18 = i6;
/* 809 */                           i20 = iObjectFieldOffset3;
/* 811 */                           i21 = i96;
                                } else {
/* 815 */                           i17 = iCharAt4;
/* 817 */                           iol10ioioi0 = iol10ioioi03;
/* 819 */                           int i98 = i6 + 1;
/* 825 */                           Field fieldI000iOII4 = iOllOIi.I000iOII(cls6, (String) objArr[i6]);
/* 831 */                           if (i86 == 9 || i86 == 17) {
/* 837 */                               i18 = i98;
/* 980 */                               objArr2[OooioIOo1.I001i1lo1io(i74, 3, 1)] = fieldI000iOII4.getType();
                                    } else {
/* 845 */                               if (i86 == 27) {
/* 957 */                                   i24 = i98;
/* 959 */                                   i25 = 1;
/* 960 */                                   i26 = 3;
/* 961 */                                   i27 = i6 + 2;
                                        } else if (i86 == 49) {
/* 851 */                                   i27 = i6 + 2;
/* 853 */                                   i24 = i98;
/* 855 */                                   i25 = 1;
/* 856 */                                   i26 = 3;
                                        } else {
/* 861 */                                   if (i86 == 12 || i86 == 30 || i86 == 44) {
/* 927 */                                       i18 = i98;
/* 930 */                                       if (ioloi0ll0o.I00000oIO() == 1 || i87 != 0) {
/* 941 */                                           i27 = i6 + 2;
/* 950 */                                           objArr2[OooioIOo1.I001i1lo1io(i74, 3, 1)] = objArr[i18];
/* 952 */                                           cls2 = cls6;
/* 954 */                                           i18 = i27;
                                                } else {
/* 935 */                                           cls2 = cls6;
/* 938 */                                           i87 = 0;
                                                }
                                            } else if (i86 == 50) {
/* 876 */                                       int i99 = i6 + 2;
/* 878 */                                       int i100 = i72 + 1;
/* 880 */                                       iArr[i72] = i74;
/* 882 */                                       int i101 = i74 / 3;
/* 886 */                                       int i102 = i101 + i101;
/* 888 */                                       objArr2[i102] = objArr[i98];
/* 890 */                                       if (i87 != 0) {
/* 898 */                                           objArr2[i102 + 1] = objArr[i99];
/* 900 */                                           cls2 = cls6;
/* 902 */                                           i72 = i100;
/* 894 */                                           i18 = i6 + 3;
                                                } else {
/* 908 */                                           cls2 = cls6;
/* 910 */                                           i72 = i100;
/* 912 */                                           i87 = 0;
/* 914 */                                           i18 = i99;
                                                }
                                            } else {
/* 918 */                                       i18 = i98;
                                            }
/* 988 */                                   iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldI000iOII4);
/* 994 */                                   if ((iCharAt10 & Barcode.FORMAT_AZTEC) == 0 || i86 > 17) {
/* 1090 */                                      Class<?> cls7 = cls2;
/* 1092 */                                      i19 = i86;
/* 1094 */                                      cls3 = cls7;
/* 1096 */                                      i20 = iObjectFieldOffset;
/* 1101 */                                      iObjectFieldOffset2 = 1048575;
/* 1102 */                                      i21 = i87;
/* 1104 */                                      i22 = 0;
                                            } else {
/* 1000 */                                      int i103 = i39 + 1;
/* 1002 */                                      int iCharAt12 = str.charAt(i39);
/* 1009 */                                      if (iCharAt12 >= 55296) {
/* 1011 */                                          int i104 = iCharAt12 & 8191;
/* 1013 */                                          int i105 = 13;
                                                    while (true) {
/* 1015 */                                              i23 = i103 + 1;
/* 1017 */                                              cCharAt8 = str.charAt(i103);
/* 1021 */                                              if (cCharAt8 < 55296) {
                                                            break;
                                                        }
/* 1027 */                                              i104 |= (cCharAt8 & 8191) << i105;
/* 1028 */                                              i105 += 13;
/* 1030 */                                              i103 = i23;
                                                    }
/* 1035 */                                          iCharAt12 = i104 | (cCharAt8 << i105);
/* 1036 */                                          i103 = i23;
                                                }
/* 1042 */                                      int i106 = (iCharAt12 / 32) + i71 + i71;
/* 1044 */                                      Object obj4 = objArr[i106];
/* 1048 */                                      if (obj4 instanceof Field) {
/* 1050 */                                          fieldI000iOII = (Field) obj4;
/* 1052 */                                          cls4 = cls2;
/* 1054 */                                          i20 = iObjectFieldOffset;
/* 1056 */                                          i19 = i86;
                                                } else {
/* 1061 */                                          cls4 = cls2;
/* 1063 */                                          fieldI000iOII = iOllOIi.I000iOII(cls4, (String) obj4);
/* 1067 */                                          objArr[i106] = fieldI000iOII;
/* 1069 */                                          i19 = i86;
/* 1071 */                                          i20 = iObjectFieldOffset;
                                                }
/* 1078 */                                      i22 = iCharAt12 % 32;
/* 1080 */                                      int i107 = i103;
/* 1077 */                                      iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldI000iOII);
/* 1082 */                                      cls3 = cls4;
/* 1083 */                                      i39 = i107;
/* 1084 */                                      i21 = i87;
                                            }
                                        }
/* 969 */                               objArr2[OooioIOo1.I001i1lo1io(i74, i26, i25)] = objArr[i24];
/* 952 */                               cls2 = cls6;
/* 954 */                               i18 = i27;
/* 988 */                               iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldI000iOII4);
/* 994 */                               if ((iCharAt10 & Barcode.FORMAT_AZTEC) == 0) {
/* 1090 */                                  Class<?> cls72 = cls2;
/* 1092 */                                  i19 = i86;
/* 1094 */                                  cls3 = cls72;
/* 1096 */                                  i20 = iObjectFieldOffset;
/* 1101 */                                  iObjectFieldOffset2 = 1048575;
/* 1102 */                                  i21 = i87;
/* 1104 */                                  i22 = 0;
                                        }
                                    }
/* 982 */                           cls2 = cls6;
/* 988 */                           iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldI000iOII4);
/* 994 */                           if ((iCharAt10 & Barcode.FORMAT_AZTEC) == 0) {
                                    }
                                }
/* 1105 */                      int i108 = i74 + 1;
/* 1107 */                      iArr2[i74] = i82;
/* 1109 */                      int i109 = i74 + 2;
/* 1111 */                      Class<?> cls8 = cls3;
/* 1143 */                      iArr2[i108] = ((iCharAt10 & Barcode.FORMAT_UPC_A) != 0 ? 536870912 : 0) | ((iCharAt10 & Barcode.FORMAT_QR_CODE) != 0 ? 268435456 : 0) | (i21 != 0 ? Integer.MIN_VALUE : 0) | (i19 << 20) | i20;
/* 1145 */                      i74 += 3;
/* 1150 */                      iArr2[i109] = (i22 << 20) | iObjectFieldOffset2;
/* 1154 */                      concurrentHashMap = concurrentHashMap2;
/* 1156 */                      length = i77;
/* 1158 */                      cls6 = cls8;
/* 1160 */                      i6 = i18;
/* 1162 */                      iol10ioioi03 = iol10ioioi0;
/* 1164 */                      iCharAt4 = i17;
/* 1166 */                      i4 = 3;
                            }
/* 1172 */                  int i110 = iCharAt4;
/* 1178 */                  iOllOIi iolloii2 = new iOllOIi();
/* 1181 */                  iolloii2.I00000oIO = iArr2;
/* 1183 */                  iolloii2.I00000oOI = objArr2;
/* 1185 */                  iolloii2.I0000Il00O = iCharAt;
/* 1187 */                  iolloii2.I0000O = iCharAt2;
/* 1189 */                  iolloii2.I0001Ioi1lo = iArr;
/* 1193 */                  iolloii2.I000II = i110;
/* 1195 */                  iolloii2.I000O01llI0 = i69;
/* 1199 */                  iolloii2.I0000oI00 = iol10ioioi03;
/* 1201 */                  VarHandle.storeStoreFence();
/* 1204 */                  cls5 = cls;
/* 1206 */                  concurrentHashMap = concurrentHashMap;
                            iolloii = iolloii2;
                        }
/* 1212 */              iOloi11 ioloi11 = (iOloi11) concurrentHashMap.putIfAbsent(cls5, iolloii);
                        return ioloi11 != null ? ioloi11 : iolloii;
                    } catch (Exception e) {
/* 1241 */              OIiilo1Ool0o.I000iOII("Unable to get message info for ".concat(cls5.getName()), e);
/* 31 */                return null;
                    }
                }
            }

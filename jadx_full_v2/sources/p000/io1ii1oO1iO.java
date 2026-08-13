            package p000;

            import com.google.ai.edge.gallery.BuildConfig;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import com.google.mlkit.vision.common.InputImage;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Field;
            import java.nio.charset.Charset;
            import java.security.AccessController;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import sun.misc.Unsafe;
            
            public final class io1ii1oO1iO implements ioO0I1oi1lio {
                public static final int[] I000l1 = new int[0];
                public static final Unsafe I000lI;
                public int[] I00000oIO;
                public Object[] I00000oOI;
                public int I0000Il00O;
                public int I0000O;
                public iilO1O I0000oI00;
                public boolean I0001Ioi1lo;
                public int[] I000II;
                public int I000O01llI0;
                public int I000OOo1O;
                public iloOil0O1 I000OiO;
                public iooO1IiiOoOo I000iOII;

                static {
                    Unsafe unsafe;
                    try {
/* 17 */                unsafe = (Unsafe) AccessController.doPrivileged(new OoiioO0o(17));
                    } catch (Throwable unused) {
/* 20 */                unsafe = null;
                    }
/* 21 */            I000lI = unsafe;
                }

                public static Field I000l1(Class cls, String str) {
                    try {
/* 1 */                 return cls.getDeclaredField(str);
                    } catch (NoSuchFieldException unused) {
/* 6 */                 Field[] declaredFields = cls.getDeclaredFields();
/* 12 */                for (Field field : declaredFields) {
/* 24 */                    if (str.equals(field.getName())) {
/* 26 */                        return field;
                            }
                        }
/* 48 */                IoOOl0iOl1io.I0001Ioi1lo(Arrays.toString(declaredFields), IIl001iO0Io.I00111O("Field ", str, " for ", cls.getName(), " not found. Known fields are "));
/* 51 */                return null;
                    }
                }

                public static void I000lI(Object obj) {
/* 5 */             if (I001i1lo1io(obj)) {
/* 7 */                 return;
                    }
/* 18 */            I000II.I000iOII("Mutating immutable message: ".concat(String.valueOf(obj)));
                }

                public static boolean I001i1lo1io(Object obj) {
/* 1 */             if (obj == null) {
/* 3 */                 return false;
                    }
/* 7 */             if (obj instanceof ilOl10) {
/* 11 */                return ((ilOl10) obj).I000l1();
                    }
/* 16 */            return true;
                }

                public static io1ii1oO1iO I001lIiIIo1O(ioIloOilIii ioilooiliii, iloOil0O1 ilooil0o1, iooO1IiiOoOo iooo1iiioooo, ilIIl0iIloiI iliil0iiloii) {
                    int i;
                    int iCharAt;
                    int iCharAt2;
                    int iCharAt3;
                    int iCharAt4;
                    int iCharAt5;
                    int i2;
                    int[] iArr;
                    int i3;
                    char cCharAt;
                    int i4;
                    char cCharAt2;
                    int i5;
                    char cCharAt3;
                    int i6;
                    char cCharAt4;
                    int i7;
                    char cCharAt5;
                    int i8;
                    char cCharAt6;
                    int i9;
                    char cCharAt7;
                    int i10;
                    char cCharAt8;
                    int i11;
                    int i12;
                    int i13;
                    int i14;
                    int i15;
                    int iObjectFieldOffset;
                    int i16;
                    int i17;
                    int i18;
                    int i19;
                    Field fieldI000l1;
                    char cCharAt9;
                    int i20;
                    int i21;
                    int i22;
                    int i23;
                    int i24;
                    Field fieldI000l12;
                    Field fieldI000l13;
                    int i25;
                    char cCharAt10;
                    int i26;
                    int i27;
                    char cCharAt11;
                    int i28;
                    int i29;
                    char cCharAt12;
                    int i30;
                    char cCharAt13;
/* 5 */             if (!(ioilooiliii instanceof ioIloOilIii)) {
/* 1083 */              OIiilo1Ool0o.I00000oIO();
/* 1086 */              return null;
                    }
/* 7 */             iilO1O iilo1o = ioilooiliii.I00000oIO;
/* 9 */             String str = ioilooiliii.I00000oOI;
/* 11 */            int length = str.length();
/* 15 */            int i31 = 0;
/* 23 */            if (str.charAt(0) >= 55296) {
/* 25 */                int i32 = 1;
                        while (true) {
/* 26 */                    i = i32 + 1;
/* 32 */                    if (str.charAt(i32) < 55296) {
                                break;
                            }
/* 34 */                    i32 = i;
                        }
                    } else {
/* 36 */                i = 1;
                    }
/* 37 */            int i33 = i + 1;
/* 39 */            int iCharAt6 = str.charAt(i);
/* 43 */            if (iCharAt6 >= 55296) {
/* 45 */                int i34 = iCharAt6 & 8191;
/* 47 */                int i35 = 13;
                        while (true) {
/* 49 */                    i30 = i33 + 1;
/* 51 */                    cCharAt13 = str.charAt(i33);
/* 55 */                    if (cCharAt13 < 55296) {
                                break;
                            }
/* 60 */                    i34 |= (cCharAt13 & 8191) << i35;
/* 61 */                    i35 += 13;
/* 63 */                    i33 = i30;
                        }
/* 66 */                iCharAt6 = i34 | (cCharAt13 << i35);
/* 67 */                i33 = i30;
                    }
/* 68 */            if (iCharAt6 == 0) {
/* 70 */                iArr = I000l1;
/* 72 */                iCharAt = 0;
/* 73 */                iCharAt2 = 0;
/* 74 */                iCharAt3 = 0;
/* 75 */                iCharAt4 = 0;
/* 76 */                i2 = 0;
/* 77 */                iCharAt5 = 0;
                    } else {
/* 80 */                int i36 = i33 + 1;
/* 82 */                int iCharAt7 = str.charAt(i33);
/* 86 */                if (iCharAt7 >= 55296) {
/* 88 */                    int i37 = iCharAt7 & 8191;
/* 90 */                    int i38 = 13;
                            while (true) {
/* 92 */                        i10 = i36 + 1;
/* 94 */                        cCharAt8 = str.charAt(i36);
/* 98 */                        if (cCharAt8 < 55296) {
                                    break;
                                }
/* 103 */                       i37 |= (cCharAt8 & 8191) << i38;
/* 104 */                       i38 += 13;
/* 106 */                       i36 = i10;
                            }
/* 109 */                   iCharAt7 = i37 | (cCharAt8 << i38);
/* 110 */                   i36 = i10;
                        }
/* 111 */               int i39 = i36 + 1;
/* 113 */               int iCharAt8 = str.charAt(i36);
/* 117 */               if (iCharAt8 >= 55296) {
/* 119 */                   int i40 = iCharAt8 & 8191;
/* 121 */                   int i41 = 13;
                            while (true) {
/* 123 */                       i9 = i39 + 1;
/* 125 */                       cCharAt7 = str.charAt(i39);
/* 129 */                       if (cCharAt7 < 55296) {
                                    break;
                                }
/* 134 */                       i40 |= (cCharAt7 & 8191) << i41;
/* 135 */                       i41 += 13;
/* 137 */                       i39 = i9;
                            }
/* 140 */                   iCharAt8 = i40 | (cCharAt7 << i41);
/* 141 */                   i39 = i9;
                        }
/* 142 */               int i42 = i39 + 1;
/* 144 */               iCharAt = str.charAt(i39);
/* 148 */               if (iCharAt >= 55296) {
/* 150 */                   int i43 = iCharAt & 8191;
/* 152 */                   int i44 = 13;
                            while (true) {
/* 154 */                       i8 = i42 + 1;
/* 156 */                       cCharAt6 = str.charAt(i42);
/* 160 */                       if (cCharAt6 < 55296) {
                                    break;
                                }
/* 165 */                       i43 |= (cCharAt6 & 8191) << i44;
/* 166 */                       i44 += 13;
/* 168 */                       i42 = i8;
                            }
/* 171 */                   iCharAt = i43 | (cCharAt6 << i44);
/* 172 */                   i42 = i8;
                        }
/* 173 */               int i45 = i42 + 1;
/* 175 */               iCharAt2 = str.charAt(i42);
/* 179 */               if (iCharAt2 >= 55296) {
/* 181 */                   int i46 = iCharAt2 & 8191;
/* 183 */                   int i47 = 13;
                            while (true) {
/* 185 */                       i7 = i45 + 1;
/* 187 */                       cCharAt5 = str.charAt(i45);
/* 191 */                       if (cCharAt5 < 55296) {
                                    break;
                                }
/* 196 */                       i46 |= (cCharAt5 & 8191) << i47;
/* 197 */                       i47 += 13;
/* 199 */                       i45 = i7;
                            }
/* 202 */                   iCharAt2 = i46 | (cCharAt5 << i47);
/* 203 */                   i45 = i7;
                        }
/* 204 */               int i48 = i45 + 1;
/* 206 */               iCharAt3 = str.charAt(i45);
/* 210 */               if (iCharAt3 >= 55296) {
/* 212 */                   int i49 = iCharAt3 & 8191;
/* 214 */                   int i50 = 13;
                            while (true) {
/* 216 */                       i6 = i48 + 1;
/* 218 */                       cCharAt4 = str.charAt(i48);
/* 222 */                       if (cCharAt4 < 55296) {
                                    break;
                                }
/* 227 */                       i49 |= (cCharAt4 & 8191) << i50;
/* 228 */                       i50 += 13;
/* 230 */                       i48 = i6;
                            }
/* 233 */                   iCharAt3 = i49 | (cCharAt4 << i50);
/* 234 */                   i48 = i6;
                        }
/* 235 */               int i51 = i48 + 1;
/* 237 */               iCharAt4 = str.charAt(i48);
/* 241 */               if (iCharAt4 >= 55296) {
/* 243 */                   int i52 = iCharAt4 & 8191;
/* 245 */                   int i53 = 13;
                            while (true) {
/* 247 */                       i5 = i51 + 1;
/* 249 */                       cCharAt3 = str.charAt(i51);
/* 253 */                       if (cCharAt3 < 55296) {
                                    break;
                                }
/* 258 */                       i52 |= (cCharAt3 & 8191) << i53;
/* 259 */                       i53 += 13;
/* 261 */                       i51 = i5;
                            }
/* 265 */                   iCharAt4 = i52 | (cCharAt3 << i53);
/* 266 */                   i51 = i5;
                        }
/* 268 */               int i54 = i51 + 1;
/* 270 */               int iCharAt9 = str.charAt(i51);
/* 274 */               if (iCharAt9 >= 55296) {
/* 276 */                   int i55 = iCharAt9 & 8191;
/* 278 */                   int i56 = 13;
                            while (true) {
/* 280 */                       i4 = i54 + 1;
/* 282 */                       cCharAt2 = str.charAt(i54);
/* 286 */                       if (cCharAt2 < 55296) {
                                    break;
                                }
/* 292 */                       i55 |= (cCharAt2 & 8191) << i56;
/* 293 */                       i56 += 13;
/* 295 */                       i54 = i4;
                            }
/* 300 */                   iCharAt9 = i55 | (cCharAt2 << i56);
/* 301 */                   i54 = i4;
                        }
/* 303 */               int i57 = i54 + 1;
/* 305 */               iCharAt5 = str.charAt(i54);
/* 309 */               if (iCharAt5 >= 55296) {
/* 311 */                   int i58 = iCharAt5 & 8191;
/* 313 */                   int i59 = i57;
/* 315 */                   int i60 = 13;
                            while (true) {
/* 317 */                       i3 = i59 + 1;
/* 319 */                       cCharAt = str.charAt(i59);
/* 323 */                       if (cCharAt < 55296) {
                                    break;
                                }
/* 329 */                       i58 |= (cCharAt & 8191) << i60;
/* 330 */                       i60 += 13;
/* 332 */                       i59 = i3;
                            }
/* 337 */                   iCharAt5 = i58 | (cCharAt << i60);
/* 338 */                   i57 = i3;
                        }
/* 342 */               int i61 = iCharAt5 + iCharAt4 + iCharAt9;
/* 345 */               i2 = iCharAt7 + iCharAt7 + iCharAt8;
/* 346 */               iArr = new int[i61];
/* 348 */               i31 = iCharAt7;
/* 349 */               i33 = i57;
                    }
/* 351 */           Object[] objArr = ioilooiliii.I0000Il00O;
/* 353 */           Class<?> cls = iilo1o.getClass();
/* 357 */           int i62 = iCharAt4 + iCharAt5;
/* 358 */           int i63 = iCharAt3 + iCharAt3;
/* 362 */           int[] iArr2 = new int[iCharAt3 * 3];
/* 364 */           Object[] objArr2 = new Object[i63];
/* 366 */           int i64 = i62;
/* 368 */           int i65 = iCharAt5;
/* 370 */           int i66 = 0;
/* 371 */           int i67 = 0;
/* 373 */           while (i33 < length) {
/* 375 */               int i68 = i33 + 1;
/* 377 */               int iCharAt10 = str.charAt(i33);
/* 381 */               int i69 = length;
/* 386 */               if (iCharAt10 >= 55296) {
/* 388 */                   int i70 = iCharAt10 & 8191;
/* 390 */                   int i71 = i68;
/* 392 */                   int i72 = 13;
                            while (true) {
/* 394 */                       i29 = i71 + 1;
/* 396 */                       cCharAt12 = str.charAt(i71);
/* 400 */                       i11 = i31;
/* 405 */                       if (cCharAt12 < 55296) {
                                    break;
                                }
/* 411 */                       i70 |= (cCharAt12 & 8191) << i72;
/* 412 */                       i72 += 13;
/* 414 */                       i71 = i29;
/* 416 */                       i31 = i11;
                            }
/* 421 */                   iCharAt10 = i70 | (cCharAt12 << i72);
/* 422 */                   i12 = i29;
                        } else {
/* 425 */                   i11 = i31;
/* 427 */                   i12 = i68;
                        }
/* 429 */               int i73 = i12 + 1;
/* 431 */               int iCharAt11 = str.charAt(i12);
/* 440 */               if (iCharAt11 >= 55296) {
/* 442 */                   int i74 = iCharAt11 & 8191;
/* 444 */                   int i75 = i73;
/* 446 */                   int i76 = 13;
                            while (true) {
/* 448 */                       i27 = i75 + 1;
/* 450 */                       cCharAt11 = str.charAt(i75);
/* 454 */                       i28 = i74;
/* 459 */                       if (cCharAt11 < 55296) {
                                    break;
                                }
/* 465 */                       i74 = i28 | ((cCharAt11 & 8191) << i76);
/* 467 */                       i76 += 13;
/* 469 */                       i75 = i27;
                            }
/* 474 */                   iCharAt11 = i28 | (cCharAt11 << i76);
/* 476 */                   i13 = i27;
                        } else {
/* 479 */                   i13 = i73;
                        }
/* 481 */               int i77 = iCharAt10;
/* 485 */               if ((iCharAt11 & Barcode.FORMAT_UPC_E) != 0) {
/* 489 */                   iArr[i67] = i66;
/* 487 */                   i67++;
                        }
/* 493 */               int i78 = iCharAt11 & 255;
/* 495 */               Object[] objArr3 = objArr;
/* 497 */               int i79 = iCharAt11 & Barcode.FORMAT_PDF417;
/* 501 */               Unsafe unsafe = I000lI;
/* 503 */               int i80 = i2;
/* 507 */               if (i78 >= 51) {
/* 509 */                   int i81 = i13 + 1;
/* 511 */                   int iCharAt12 = str.charAt(i13);
/* 520 */                   if (iCharAt12 >= 55296) {
/* 522 */                       int i82 = iCharAt12 & 8191;
/* 524 */                       int i83 = i81;
/* 526 */                       int i84 = 13;
                                while (true) {
/* 528 */                           i25 = i83 + 1;
/* 530 */                           cCharAt10 = str.charAt(i83);
/* 534 */                           i26 = i82;
/* 539 */                           if (cCharAt10 < 55296) {
                                        break;
                                    }
/* 545 */                           i82 = i26 | ((cCharAt10 & 8191) << i84);
/* 547 */                           i84 += 13;
/* 549 */                           i83 = i25;
                                }
/* 554 */                       iCharAt12 = i26 | (cCharAt10 << i84);
/* 556 */                       i23 = i25;
                            } else {
/* 559 */                       i23 = i81;
                            }
/* 561 */                   int i85 = iCharAt12;
                            int i86 = i78 - 51;
/* 565 */                   int i87 = i23;
/* 569 */                   if (i86 == 9 || i86 == 17) {
/* 624 */                       objArr2[OooioIOo1.I001i1lo1io(i66, 3, 1)] = objArr3[i80];
/* 616 */                       i24 = i80 + 1;
                            } else if (i86 != 12) {
/* 613 */                       i24 = i80;
                            } else if (ioilooiliii.I00000oIO() == 1 || i79 != 0) {
/* 608 */                       objArr2[OooioIOo1.I001i1lo1io(i66, 3, 1)] = objArr3[i80];
/* 597 */                       i24 = i80 + 1;
                            } else {
/* 592 */                       i24 = i80;
/* 594 */                       i79 = 0;
                            }
/* 628 */                   int i88 = i85 + i85;
/* 632 */                   Object obj = objArr3[i88];
/* 634 */                   int i89 = i24;
/* 638 */                   if (obj instanceof Field) {
/* 640 */                       fieldI000l12 = (Field) obj;
                            } else {
/* 647 */                       fieldI000l12 = I000l1(cls, (String) obj);
/* 651 */                       objArr3[i88] = fieldI000l12;
                            }
/* 642 */                   i14 = i62;
/* 658 */                   int iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldI000l12);
/* 659 */                   int i90 = i88 + 1;
/* 661 */                   Object obj2 = objArr3[i90];
/* 667 */                   if (obj2 instanceof Field) {
/* 669 */                       fieldI000l13 = (Field) obj2;
                            } else {
/* 674 */                       fieldI000l13 = I000l1(cls, (String) obj2);
/* 678 */                       objArr3[i90] = fieldI000l13;
                            }
/* 684 */                   int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldI000l13);
/* 685 */                   i2 = i89;
/* 687 */                   i16 = i87;
/* 689 */                   i18 = 0;
/* 693 */                   i15 = iCharAt5;
/* 695 */                   iObjectFieldOffset = iObjectFieldOffset3;
/* 696 */                   i19 = iObjectFieldOffset2;
                        } else {
/* 700 */                   i14 = i62;
/* 708 */                   Field fieldI000l14 = I000l1(cls, (String) objArr3[i80]);
/* 702 */                   int i91 = i80 + 1;
/* 716 */                   if (i78 == 9 || i78 == 17) {
/* 722 */                       i15 = iCharAt5;
/* 858 */                       objArr2[OooioIOo1.I001i1lo1io(i66, 3, 1)] = fieldI000l14.getType();
                            } else {
/* 730 */                       if (i78 == 27) {
/* 835 */                           i15 = iCharAt5;
/* 837 */                           i20 = 3;
/* 838 */                           i21 = 1;
/* 839 */                           i22 = i80 + 2;
                                } else if (i78 == 49) {
/* 736 */                           i22 = i80 + 2;
/* 740 */                           i15 = iCharAt5;
/* 742 */                           i20 = 3;
/* 743 */                           i21 = 1;
                                } else if (i78 == 12 || i78 == 30 || i78 == 44) {
/* 808 */                           i15 = iCharAt5;
/* 811 */                           if (ioilooiliii.I00000oIO() == 1 || i79 != 0) {
/* 819 */                               i22 = i80 + 2;
/* 830 */                               objArr2[OooioIOo1.I001i1lo1io(i66, 3, 1)] = objArr3[i91];
/* 832 */                               i91 = i22;
                                    } else {
/* 816 */                               i79 = 0;
                                    }
                                } else if (i78 == 50) {
/* 763 */                           int i92 = i80 + 2;
/* 765 */                           int i93 = i65 + 1;
/* 767 */                           iArr[i65] = i66;
/* 769 */                           int i94 = i66 / 3;
/* 773 */                           int i95 = i94 + i94;
/* 775 */                           objArr2[i95] = objArr3[i91];
/* 777 */                           if (i79 != 0) {
/* 781 */                               i91 = i80 + 3;
/* 785 */                               objArr2[i95 + 1] = objArr3[i92];
/* 787 */                               i65 = i93;
                                    } else {
/* 792 */                               i91 = i92;
/* 794 */                               i65 = i93;
/* 796 */                               i79 = 0;
                                    }
/* 789 */                           i15 = iCharAt5;
                                } else {
/* 799 */                           i15 = iCharAt5;
                                }
/* 847 */                       objArr2[OooioIOo1.I001i1lo1io(i66, i20, i21)] = objArr3[i91];
/* 832 */                       i91 = i22;
                            }
/* 864 */                   int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldI000l14);
/* 867 */                   iObjectFieldOffset = 1048575;
/* 870 */                   if ((iCharAt11 & Barcode.FORMAT_AZTEC) == 0 || i78 > 17) {
/* 953 */                       i16 = i13;
/* 955 */                       i17 = 0;
                            } else {
/* 876 */                       int i96 = i13 + 1;
/* 878 */                       int iCharAt13 = str.charAt(i13);
/* 885 */                       if (iCharAt13 >= 55296) {
/* 887 */                           int i97 = iCharAt13 & 8191;
/* 889 */                           int i98 = 13;
                                    while (true) {
/* 891 */                               i16 = i96 + 1;
/* 893 */                               cCharAt9 = str.charAt(i96);
/* 897 */                               if (cCharAt9 < 55296) {
                                            break;
                                        }
/* 903 */                               i97 |= (cCharAt9 & 8191) << i98;
/* 904 */                               i98 += 13;
/* 906 */                               i96 = i16;
                                    }
/* 911 */                           iCharAt13 = i97 | (cCharAt9 << i98);
                                } else {
/* 913 */                           i16 = i96;
                                }
/* 919 */                       int i99 = (iCharAt13 / 32) + i11 + i11;
/* 921 */                       Object obj3 = objArr3[i99];
/* 925 */                       if (obj3 instanceof Field) {
/* 927 */                           fieldI000l1 = (Field) obj3;
                                } else {
/* 932 */                           fieldI000l1 = I000l1(cls, (String) obj3);
/* 936 */                           objArr3[i99] = fieldI000l1;
                                }
/* 943 */                       i17 = iCharAt13 % 32;
/* 942 */                       iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldI000l1);
                            }
/* 958 */                   if (i78 < 18 || i78 > 49) {
/* 975 */                       i18 = i17;
/* 976 */                       i19 = iObjectFieldOffset4;
/* 977 */                       i2 = i91;
                            } else {
/* 966 */                       iArr[i64] = iObjectFieldOffset4;
/* 964 */                       i64++;
/* 970 */                       i2 = i91;
/* 972 */                       i18 = i17;
/* 973 */                       i19 = iObjectFieldOffset4;
                            }
                        }
/* 979 */               int i100 = i66 + 1;
/* 981 */               iArr2[i66] = i77;
/* 983 */               int i101 = i66 + 2;
/* 985 */               int i102 = i66;
/* 1017 */              iArr2[i100] = ((iCharAt11 & Barcode.FORMAT_UPC_A) != 0 ? 536870912 : 0) | ((iCharAt11 & Barcode.FORMAT_QR_CODE) != 0 ? 268435456 : 0) | (i79 != 0 ? Integer.MIN_VALUE : 0) | (i78 << 20) | i19;
/* 1019 */              i66 = i102 + 3;
/* 1024 */              iArr2[i101] = (i18 << 20) | iObjectFieldOffset;
/* 1026 */              length = i69;
/* 1028 */              objArr = objArr3;
/* 1030 */              i31 = i11;
/* 1032 */              iCharAt5 = i15;
/* 1034 */              i33 = i16;
/* 1036 */              i62 = i14;
                    }
/* 1046 */          io1ii1oO1iO io1ii1oo1io = new io1ii1oO1iO();
/* 1049 */          io1ii1oo1io.I00000oIO = iArr2;
/* 1051 */          io1ii1oo1io.I00000oOI = objArr2;
/* 1053 */          io1ii1oo1io.I0000Il00O = iCharAt;
/* 1055 */          io1ii1oo1io.I0000O = iCharAt2;
/* 1059 */          io1ii1oo1io.I0001Ioi1lo = iilo1o instanceof ilOl10;
/* 1061 */          io1ii1oo1io.I000II = iArr;
/* 1063 */          io1ii1oo1io.I000O01llI0 = iCharAt5;
/* 1067 */          io1ii1oo1io.I000OOo1O = i62;
/* 1071 */          io1ii1oo1io.I000OiO = ilooil0o1;
/* 1075 */          io1ii1oo1io.I000iOII = iooo1iiioooo;
/* 1077 */          io1ii1oo1io.I0000oI00 = iilo1o;
/* 1079 */          VarHandle.storeStoreFence();
/* 1082 */          return io1ii1oo1io;
                }

                public static int I001lllioOl(long j, Object obj) {
/* 7 */             return ((Integer) l00iIli.I000II(obj, j)).intValue();
                }

                public static int I00II0Ol1O0l(int i) {
/* 3 */             return (i >>> 20) & 255;
                }

                public static long I00IO1(long j, Object obj) {
/* 7 */             return ((Long) l00iIli.I000II(obj, j)).longValue();
                }

                /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00000oIO(Object obj) {
/* 1 */             int[] iArr = this.I00000oIO;
/* 7 */             if (I001i1lo1io(obj)) {
/* 14 */                if (obj instanceof ilOl10) {
/* 17 */                    ilOl10 ilol10 = (ilOl10) obj;
/* 19 */                    ilol10.I000OiO();
/* 22 */                    ilol10.zza = 0;
/* 24 */                    ilol10.I000O01llI0();
                        }
/* 29 */                for (int i = 0; i < iArr.length; i += 3) {
/* 31 */                    int iI00II0oii1o = I00II0oii1o(i);
/* 38 */                    int i2 = 1048575 & iI00II0oii1o;
/* 39 */                    int iI00II0Ol1O0l = I00II0Ol1O0l(iI00II0oii1o);
                            long j = i2;
/* 46 */                    Unsafe unsafe = I000lI;
/* 48 */                    if (iI00II0Ol1O0l != 9) {
/* 52 */                        if (iI00II0Ol1O0l != 60 && iI00II0Ol1O0l != 68) {
                                    switch (iI00II0Ol1O0l) {
                                        case PoseLandmark.RIGHT_PINKY:
                                        case PoseLandmark.LEFT_INDEX:
                                        case PoseLandmark.RIGHT_INDEX:
                                        case PoseLandmark.LEFT_THUMB:
                                        case PoseLandmark.RIGHT_THUMB:
                                        case PoseLandmark.LEFT_HIP:
                                        case PoseLandmark.RIGHT_HIP:
                                        case PoseLandmark.LEFT_KNEE:
                                        case PoseLandmark.RIGHT_KNEE:
                                        case 27:
                                        case PoseLandmark.RIGHT_ANKLE:
                                        case PoseLandmark.LEFT_HEEL:
                                        case 30:
                                        case PoseLandmark.LEFT_FOOT_INDEX:
                                        case 32:
                                        case 33:
                                        case 34:
                                        case InputImage.IMAGE_FORMAT_YUV_420_888:
                                        case 36:
                                        case 37:
                                        case 38:
                                        case 39:
                                        case 40:
                                        case 41:
                                        case 42:
                                        case 43:
                                        case 44:
                                        case BuildConfig.VERSION_CODE:
                                        case 46:
                                        case 47:
                                        case 48:
                                        case 49:
/* 79 */                                    this.I000OiO.I00000oOI(j, obj);
                                            break;
                                        case 50:
/* 62 */                                    Object object = unsafe.getObject(obj, j);
/* 66 */                                    if (object != null) {
/* 71 */                                        ((io001Oio) object).I00iOIl = false;
/* 73 */                                        unsafe.putObject(obj, j, object);
                                                break;
                                            } else {
                                                break;
                                            }
                                    }
                                } else if (I001iOo1i0O(obj, iArr[i], i)) {
/* 99 */                            I00IOO(i).I00000oIO(unsafe.getObject(obj, j));
                                }
                            } else if (I001IO000(i, obj)) {
/* 117 */                       I00IOO(i).I00000oIO(unsafe.getObject(obj, j));
                            }
                        }
/* 125 */               this.I000iOII.getClass();
/* 130 */               iooIiiOli iooiiioli = ((ilOl10) obj).zzc;
/* 134 */               if (iooiiioli.I0000oI00) {
/* 136 */                   iooiiioli.I0000oI00 = false;
                        }
                    }
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00000oOI(Object obj, Object obj2) {
                    Object obj3;
/* 1 */             int[] iArr = this.I00000oIO;
/* 3 */             I000lI(obj);
/* 6 */             obj2.getClass();
/* 9 */             int i = 0;
/* 11 */            while (i < iArr.length) {
/* 13 */                int iI00II0oii1o = I00II0oii1o(i);
/* 20 */                int i2 = 1048575 & iI00II0oii1o;
/* 21 */                int iI00II0Ol1O0l = I00II0Ol1O0l(iI00II0oii1o);
/* 25 */                int i3 = iArr[i];
                        long j = i2;
                        switch (iI00II0Ol1O0l) {
                            case 0:
/* 384 */                       if (!I001IO000(i, obj2)) {
/* 31 */                            obj3 = obj;
                                    break;
                                } else {
/* 386 */                           Ooil0oIOI0l0 ooil0oIOI0l0 = l00iIli.I0000Il00O;
/* 392 */                           obj3 = obj;
/* 393 */                           ooil0oIOI0l0.I00II0oii1o(obj3, j, ooil0oIOI0l0.I0010I0i(obj2, j));
/* 396 */                           I00100o1O0lo(i, obj3);
                                    break;
                                }
                            case 1:
/* 364 */                       if (I001IO000(i, obj2)) {
/* 366 */                           Ooil0oIOI0l0 ooil0oIOI0l02 = l00iIli.I0000Il00O;
/* 372 */                           ooil0oIOI0l02.I00IioO0OiOi(obj, j, ooil0oIOI0l02.I001IIilI0O(obj2, j));
/* 375 */                           I00100o1O0lo(i, obj);
                                }
/* 31 */                        obj3 = obj;
                                break;
                            case 2:
/* 346 */                       if (I001IO000(i, obj2)) {
/* 352 */                           l00iIli.I000OOo1O(obj, j, l00iIli.I0001Ioi1lo(obj2, j));
/* 355 */                           I00100o1O0lo(i, obj);
                                }
/* 31 */                        obj3 = obj;
                                break;
                            case 3:
/* 328 */                       if (I001IO000(i, obj2)) {
/* 334 */                           l00iIli.I000OOo1O(obj, j, l00iIli.I0001Ioi1lo(obj2, j));
/* 337 */                           I00100o1O0lo(i, obj);
                                }
/* 31 */                        obj3 = obj;
                                break;
                            case 4:
/* 310 */                       if (I001IO000(i, obj2)) {
/* 316 */                           l00iIli.I000O01llI0(obj, j, l00iIli.I0000oI00(obj2, j));
/* 319 */                           I00100o1O0lo(i, obj);
                                }
/* 31 */                        obj3 = obj;
                                break;
                            case 5:
/* 292 */                       if (I001IO000(i, obj2)) {
/* 298 */                           l00iIli.I000OOo1O(obj, j, l00iIli.I0001Ioi1lo(obj2, j));
/* 301 */                           I00100o1O0lo(i, obj);
                                }
/* 31 */                        obj3 = obj;
                                break;
                            case 6:
/* 274 */                       if (I001IO000(i, obj2)) {
/* 280 */                           l00iIli.I000O01llI0(obj, j, l00iIli.I0000oI00(obj2, j));
/* 283 */                           I00100o1O0lo(i, obj);
                                }
/* 31 */                        obj3 = obj;
                                break;
                            case 7:
/* 254 */                       if (I001IO000(i, obj2)) {
/* 256 */                           Ooil0oIOI0l0 ooil0oIOI0l03 = l00iIli.I0000Il00O;
/* 262 */                           ooil0oIOI0l03.I001iOo1i0O(obj, j, ooil0oIOI0l03.I00Io1o110i(obj2, j));
/* 265 */                           I00100o1O0lo(i, obj);
                                }
/* 31 */                        obj3 = obj;
                                break;
                            case 8:
/* 236 */                       if (I001IO000(i, obj2)) {
/* 242 */                           l00iIli.I000OiO(obj, j, l00iIli.I000II(obj2, j));
/* 245 */                           I00100o1O0lo(i, obj);
                                }
/* 31 */                        obj3 = obj;
                                break;
                            case 9:
/* 227 */                       I000o00OoI0I(i, obj, obj2);
/* 31 */                        obj3 = obj;
                                break;
                            case 10:
/* 213 */                       if (I001IO000(i, obj2)) {
/* 219 */                           l00iIli.I000OiO(obj, j, l00iIli.I000II(obj2, j));
/* 222 */                           I00100o1O0lo(i, obj);
                                }
/* 31 */                        obj3 = obj;
                                break;
                            case 11:
/* 195 */                       if (I001IO000(i, obj2)) {
/* 201 */                           l00iIli.I000O01llI0(obj, j, l00iIli.I0000oI00(obj2, j));
/* 204 */                           I00100o1O0lo(i, obj);
                                }
/* 31 */                        obj3 = obj;
                                break;
                            case 12:
/* 177 */                       if (I001IO000(i, obj2)) {
/* 183 */                           l00iIli.I000O01llI0(obj, j, l00iIli.I0000oI00(obj2, j));
/* 186 */                           I00100o1O0lo(i, obj);
                                }
/* 31 */                        obj3 = obj;
                                break;
                            case 13:
/* 159 */                       if (I001IO000(i, obj2)) {
/* 165 */                           l00iIli.I000O01llI0(obj, j, l00iIli.I0000oI00(obj2, j));
/* 168 */                           I00100o1O0lo(i, obj);
                                }
/* 31 */                        obj3 = obj;
                                break;
                            case 14:
/* 142 */                       if (I001IO000(i, obj2)) {
/* 148 */                           l00iIli.I000OOo1O(obj, j, l00iIli.I0001Ioi1lo(obj2, j));
/* 151 */                           I00100o1O0lo(i, obj);
                                }
/* 31 */                        obj3 = obj;
                                break;
                            case 15:
/* 125 */                       if (I001IO000(i, obj2)) {
/* 131 */                           l00iIli.I000O01llI0(obj, j, l00iIli.I0000oI00(obj2, j));
/* 134 */                           I00100o1O0lo(i, obj);
                                }
/* 31 */                        obj3 = obj;
                                break;
                            case 16:
/* 108 */                       if (I001IO000(i, obj2)) {
/* 114 */                           l00iIli.I000OOo1O(obj, j, l00iIli.I0001Ioi1lo(obj2, j));
/* 117 */                           I00100o1O0lo(i, obj);
                                }
/* 31 */                        obj3 = obj;
                                break;
                            case 17:
/* 100 */                       I000o00OoI0I(i, obj, obj2);
/* 31 */                        obj3 = obj;
                                break;
                            case PoseLandmark.RIGHT_PINKY:
                            case PoseLandmark.LEFT_INDEX:
                            case PoseLandmark.RIGHT_INDEX:
                            case PoseLandmark.LEFT_THUMB:
                            case PoseLandmark.RIGHT_THUMB:
                            case PoseLandmark.LEFT_HIP:
                            case PoseLandmark.RIGHT_HIP:
                            case PoseLandmark.LEFT_KNEE:
                            case PoseLandmark.RIGHT_KNEE:
                            case 27:
                            case PoseLandmark.RIGHT_ANKLE:
                            case PoseLandmark.LEFT_HEEL:
                            case 30:
                            case PoseLandmark.LEFT_FOOT_INDEX:
                            case 32:
                            case 33:
                            case 34:
                            case InputImage.IMAGE_FORMAT_YUV_420_888:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case BuildConfig.VERSION_CODE:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
/* 96 */                        this.I000OiO.I0000Il00O(obj, j, obj2);
/* 31 */                        obj3 = obj;
                                break;
                            case 50:
/* 76 */                        Class cls = ioOi0IO.I00000oIO;
/* 90 */                        l00iIli.I000OiO(obj, j, io01il0i0.I00000oIO(l00iIli.I000II(obj, j), l00iIli.I000II(obj2, j)));
/* 31 */                        obj3 = obj;
                                break;
                            case 51:
                            case 52:
                            case 53:
                            case 54:
                            case 55:
                            case 56:
                            case 57:
                            case 58:
                            case 59:
/* 63 */                        if (I001iOo1i0O(obj2, i3, i)) {
/* 69 */                            l00iIli.I000OiO(obj, j, l00iIli.I000II(obj2, j));
/* 72 */                            I0010I0i(obj, i3, i);
                                }
/* 31 */                        obj3 = obj;
                                break;
                            case 60:
/* 55 */                        I000oI1ioi(i, obj, obj2);
/* 31 */                        obj3 = obj;
                                break;
                            case 61:
                            case 62:
                            case 63:
                            case Barcode.FORMAT_EAN_8:
                            case 65:
                            case 66:
                            case 67:
/* 42 */                        if (I001iOo1i0O(obj2, i3, i)) {
/* 48 */                            l00iIli.I000OiO(obj, j, l00iIli.I000II(obj2, j));
/* 51 */                            I0010I0i(obj, i3, i);
                                }
/* 31 */                        obj3 = obj;
                                break;
                            case 68:
/* 34 */                        I000oI1ioi(i, obj, obj2);
/* 31 */                        obj3 = obj;
                                break;
                        }
/* 399 */               i += 3;
/* 401 */               obj = obj3;
                    }
/* 407 */           ioOi0IO.I0010I0i(this.I000iOII, obj, obj2);
                }

                /* JADX WARN: Removed duplicated region for block: B:44:0x00db A[PHI: r2
                  0x00db: PHI (r2v34 int) = (r2v10 int), (r2v35 int) binds: [B:85:0x01ea, B:43:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int I0000Il00O(ilOl10 ilol10) {
                    int i;
                    long jDoubleToLongBits;
                    int i2;
                    int iFloatToIntBits;
                    int i3;
                    int i4;
/* 1 */             int[] iArr = this.I00000oIO;
/* 4 */             int i5 = 0;
/* 6 */             for (int i6 = 0; i6 < iArr.length; i6 += 3) {
/* 8 */                 int iI00II0oii1o = I00II0oii1o(i6);
/* 15 */                int i7 = 1048575 & iI00II0oii1o;
/* 16 */                int iI00II0Ol1O0l = I00II0Ol1O0l(iI00II0oii1o);
/* 20 */                int i8 = iArr[i6];
                        long j = i7;
/* 23 */                int i9 = 1237;
/* 27 */                int iHashCode = 37;
                        switch (iI00II0Ol1O0l) {
                            case 0:
/* 555 */                       i = i5 * 53;
/* 563 */                       jDoubleToLongBits = Double.doubleToLongBits(l00iIli.I0000Il00O.I0010I0i(ilol10, j));
/* 567 */                       Charset charset = ililOO0.I00000oIO;
/* 74 */                        i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                break;
                            case 1:
/* 541 */                       i2 = i5 * 53;
/* 549 */                       iFloatToIntBits = Float.floatToIntBits(l00iIli.I0000Il00O.I001IIilI0O(ilol10, j));
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 2:
/* 531 */                       i = i5 * 53;
/* 533 */                       jDoubleToLongBits = l00iIli.I0001Ioi1lo(ilol10, j);
/* 537 */                       Charset charset2 = ililOO0.I00000oIO;
/* 74 */                        i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                break;
                            case 3:
/* 521 */                       i = i5 * 53;
/* 523 */                       jDoubleToLongBits = l00iIli.I0001Ioi1lo(ilol10, j);
/* 527 */                       Charset charset3 = ililOO0.I00000oIO;
/* 74 */                        i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                break;
                            case 4:
/* 513 */                       i2 = i5 * 53;
/* 515 */                       iFloatToIntBits = l00iIli.I0000oI00(ilol10, j);
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 5:
/* 503 */                       i = i5 * 53;
/* 505 */                       jDoubleToLongBits = l00iIli.I0001Ioi1lo(ilol10, j);
/* 509 */                       Charset charset4 = ililOO0.I00000oIO;
/* 74 */                        i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                break;
                            case 6:
/* 495 */                       i2 = i5 * 53;
/* 497 */                       iFloatToIntBits = l00iIli.I0000oI00(ilol10, j);
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 7:
/* 481 */                       i3 = i5 * 53;
/* 485 */                       boolean zI00Io1o110i = l00iIli.I0000Il00O.I00Io1o110i(ilol10, j);
/* 489 */                       Charset charset5 = ililOO0.I00000oIO;
/* 491 */                       if (zI00Io1o110i) {
/* 220 */                           i9 = 1231;
                                }
/* 221 */                       i5 = i9 + i3;
                                break;
                            case 8:
/* 467 */                       i2 = i5 * 53;
/* 475 */                       iFloatToIntBits = ((String) l00iIli.I000II(ilol10, j)).hashCode();
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 9:
/* 454 */                       i4 = i5 * 53;
/* 456 */                       Object objI000II = l00iIli.I000II(ilol10, j);
/* 460 */                       if (objI000II != null) {
/* 462 */                           iHashCode = objI000II.hashCode();
                                }
/* 387 */                       i5 = i4 + iHashCode;
                                break;
                            case 10:
/* 442 */                       i2 = i5 * 53;
/* 448 */                       iFloatToIntBits = l00iIli.I000II(ilol10, j).hashCode();
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 11:
/* 434 */                       i2 = i5 * 53;
/* 436 */                       iFloatToIntBits = l00iIli.I0000oI00(ilol10, j);
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 12:
/* 426 */                       i2 = i5 * 53;
/* 428 */                       iFloatToIntBits = l00iIli.I0000oI00(ilol10, j);
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 13:
/* 418 */                       i2 = i5 * 53;
/* 420 */                       iFloatToIntBits = l00iIli.I0000oI00(ilol10, j);
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 14:
/* 408 */                       i = i5 * 53;
/* 410 */                       jDoubleToLongBits = l00iIli.I0001Ioi1lo(ilol10, j);
/* 414 */                       Charset charset6 = ililOO0.I00000oIO;
/* 74 */                        i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                break;
                            case 15:
/* 400 */                       i2 = i5 * 53;
/* 402 */                       iFloatToIntBits = l00iIli.I0000oI00(ilol10, j);
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 16:
/* 390 */                       i = i5 * 53;
/* 392 */                       jDoubleToLongBits = l00iIli.I0001Ioi1lo(ilol10, j);
/* 396 */                       Charset charset7 = ililOO0.I00000oIO;
/* 74 */                        i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                break;
                            case 17:
/* 375 */                       i4 = i5 * 53;
/* 377 */                       Object objI000II2 = l00iIli.I000II(ilol10, j);
/* 381 */                       if (objI000II2 != null) {
/* 383 */                           iHashCode = objI000II2.hashCode();
                                }
/* 387 */                       i5 = i4 + iHashCode;
                                break;
                            case PoseLandmark.RIGHT_PINKY:
                            case PoseLandmark.LEFT_INDEX:
                            case PoseLandmark.RIGHT_INDEX:
                            case PoseLandmark.LEFT_THUMB:
                            case PoseLandmark.RIGHT_THUMB:
                            case PoseLandmark.LEFT_HIP:
                            case PoseLandmark.RIGHT_HIP:
                            case PoseLandmark.LEFT_KNEE:
                            case PoseLandmark.RIGHT_KNEE:
                            case 27:
                            case PoseLandmark.RIGHT_ANKLE:
                            case PoseLandmark.LEFT_HEEL:
                            case 30:
                            case PoseLandmark.LEFT_FOOT_INDEX:
                            case 32:
                            case 33:
                            case 34:
                            case InputImage.IMAGE_FORMAT_YUV_420_888:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case BuildConfig.VERSION_CODE:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
/* 363 */                       i2 = i5 * 53;
/* 369 */                       iFloatToIntBits = l00iIli.I000II(ilol10, j).hashCode();
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 50:
/* 351 */                       i2 = i5 * 53;
/* 357 */                       iFloatToIntBits = l00iIli.I000II(ilol10, j).hashCode();
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 51:
/* 329 */                       if (I001iOo1i0O(ilol10, i8, i6)) {
/* 331 */                           i = i5 * 53;
/* 343 */                           jDoubleToLongBits = Double.doubleToLongBits(((Double) l00iIli.I000II(ilol10, j)).doubleValue());
/* 347 */                           Charset charset8 = ililOO0.I00000oIO;
/* 74 */                            i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                    break;
                                } else {
                                    break;
                                }
                            case 52:
/* 305 */                       if (I001iOo1i0O(ilol10, i8, i6)) {
/* 307 */                           i2 = i5 * 53;
/* 319 */                           iFloatToIntBits = Float.floatToIntBits(((Float) l00iIli.I000II(ilol10, j)).floatValue());
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
/* 289 */                       if (I001iOo1i0O(ilol10, i8, i6)) {
/* 291 */                           i = i5 * 53;
/* 293 */                           jDoubleToLongBits = I00IO1(j, ilol10);
/* 297 */                           Charset charset9 = ililOO0.I00000oIO;
/* 74 */                            i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
/* 273 */                       if (I001iOo1i0O(ilol10, i8, i6)) {
/* 275 */                           i = i5 * 53;
/* 277 */                           jDoubleToLongBits = I00IO1(j, ilol10);
/* 281 */                           Charset charset10 = ililOO0.I00000oIO;
/* 74 */                            i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                    break;
                                } else {
                                    break;
                                }
                            case 55:
/* 259 */                       if (I001iOo1i0O(ilol10, i8, i6)) {
/* 261 */                           i2 = i5 * 53;
/* 263 */                           iFloatToIntBits = I001lllioOl(j, ilol10);
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
/* 243 */                       if (I001iOo1i0O(ilol10, i8, i6)) {
/* 245 */                           i = i5 * 53;
/* 247 */                           jDoubleToLongBits = I00IO1(j, ilol10);
/* 251 */                           Charset charset11 = ililOO0.I00000oIO;
/* 74 */                            i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                    break;
                                } else {
                                    break;
                                }
                            case 57:
/* 229 */                       if (I001iOo1i0O(ilol10, i8, i6)) {
/* 231 */                           i2 = i5 * 53;
/* 233 */                           iFloatToIntBits = I001lllioOl(j, ilol10);
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 58:
/* 202 */                       if (I001iOo1i0O(ilol10, i8, i6)) {
/* 204 */                           i3 = i5 * 53;
/* 212 */                           boolean zBooleanValue = ((Boolean) l00iIli.I000II(ilol10, j)).booleanValue();
/* 216 */                           Charset charset12 = ililOO0.I00000oIO;
/* 218 */                           if (zBooleanValue) {
                                    }
/* 221 */                           i5 = i9 + i3;
                                    break;
                                } else {
                                    break;
                                }
                                break;
                            case 59:
/* 182 */                       if (I001iOo1i0O(ilol10, i8, i6)) {
/* 184 */                           i2 = i5 * 53;
/* 192 */                           iFloatToIntBits = ((String) l00iIli.I000II(ilol10, j)).hashCode();
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 60:
/* 165 */                       if (I001iOo1i0O(ilol10, i8, i6)) {
/* 167 */                           i2 = i5 * 53;
/* 173 */                           iFloatToIntBits = l00iIli.I000II(ilol10, j).hashCode();
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 61:
/* 148 */                       if (I001iOo1i0O(ilol10, i8, i6)) {
/* 150 */                           i2 = i5 * 53;
/* 156 */                           iFloatToIntBits = l00iIli.I000II(ilol10, j).hashCode();
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 62:
/* 135 */                       if (I001iOo1i0O(ilol10, i8, i6)) {
/* 137 */                           i2 = i5 * 53;
/* 139 */                           iFloatToIntBits = I001lllioOl(j, ilol10);
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 63:
/* 122 */                       if (I001iOo1i0O(ilol10, i8, i6)) {
/* 124 */                           i2 = i5 * 53;
/* 126 */                           iFloatToIntBits = I001lllioOl(j, ilol10);
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case Barcode.FORMAT_EAN_8:
/* 109 */                       if (I001iOo1i0O(ilol10, i8, i6)) {
/* 111 */                           i2 = i5 * 53;
/* 113 */                           iFloatToIntBits = I001lllioOl(j, ilol10);
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 65:
/* 94 */                        if (I001iOo1i0O(ilol10, i8, i6)) {
/* 96 */                            i = i5 * 53;
/* 98 */                            jDoubleToLongBits = I00IO1(j, ilol10);
/* 102 */                           Charset charset13 = ililOO0.I00000oIO;
/* 74 */                            i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                    break;
                                } else {
                                    break;
                                }
                            case 66:
/* 81 */                        if (I001iOo1i0O(ilol10, i8, i6)) {
/* 83 */                            i2 = i5 * 53;
/* 85 */                            iFloatToIntBits = I001lllioOl(j, ilol10);
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 67:
/* 60 */                        if (I001iOo1i0O(ilol10, i8, i6)) {
/* 62 */                            i = i5 * 53;
/* 64 */                            jDoubleToLongBits = I00IO1(j, ilol10);
/* 68 */                            Charset charset14 = ililOO0.I00000oIO;
/* 74 */                            i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                    break;
                                } else {
                                    break;
                                }
                            case 68:
/* 40 */                        if (I001iOo1i0O(ilol10, i8, i6)) {
/* 42 */                            i2 = i5 * 53;
/* 48 */                            iFloatToIntBits = l00iIli.I000II(ilol10, j).hashCode();
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
/* 579 */           this.I000iOII.getClass();
/* 588 */           return ilol10.zzc.hashCode() + (i5 * 53);
                }

                @Override
                public final boolean I0000O(Object obj) {
                    int i;
                    int i2;
                    int i3;
/* 3 */             int[] iArr = this.I00000oIO;
/* 9 */             int i4 = 0;
/* 10 */            int i5 = 0;
/* 11 */            int i6 = 1048575;
/* 15 */            while (i5 < this.I000O01llI0) {
/* 19 */                int i7 = this.I000II[i5];
/* 21 */                int i8 = iArr[i7];
/* 23 */                int iI00II0oii1o = I00II0oii1o(i7);
/* 29 */                int i9 = iArr[i7 + 2];
/* 31 */                int i10 = i9 & 1048575;
/* 35 */                int i11 = 1 << (i9 >>> 20);
/* 37 */                if (i10 != i6) {
/* 39 */                    if (i10 != 1048575) {
/* 44 */                        i4 = I000lI.getInt(obj, i10);
                            }
/* 48 */                    i = i4;
/* 49 */                    i6 = i10;
                        } else {
/* 51 */                    i = i4;
                        }
/* 55 */                if ((268435456 & iI00II0oii1o) != 0) {
/* 57 */                    i2 = i7;
/* 58 */                    i3 = i6;
/* 64 */                    if (I001i1O0Ol(obj, i2, i3, i, i11)) {
                            }
/* 5 */                     return false;
                        }
/* 67 */                i2 = i7;
/* 68 */                i3 = i6;
/* 69 */                int iI00II0Ol1O0l = I00II0Ol1O0l(iI00II0oii1o);
/* 75 */                if (iI00II0Ol1O0l == 9 || iI00II0Ol1O0l == 17) {
/* 199 */                   if (I001i1O0Ol(obj, i2, i3, i, i11) && !I00IOO(i2).I0000O(l00iIli.I000II(obj, iI00II0oii1o & 1048575))) {
/* 5 */                         return false;
                            }
/* 219 */                   i5++;
/* 221 */                   i6 = i3;
/* 222 */                   i4 = i;
                        } else {
/* 83 */                    if (iI00II0Ol1O0l != 27) {
/* 87 */                        if (iI00II0Ol1O0l == 60 || iI00II0Ol1O0l == 68) {
/* 134 */                           if (I001iOo1i0O(obj, i8, i2) && !I00IOO(i2).I0000O(l00iIli.I000II(obj, iI00II0oii1o & 1048575))) {
/* 5 */                                 return false;
                                    }
                                } else if (iI00II0Ol1O0l != 49) {
/* 99 */                            if (iI00II0Ol1O0l == 50 && !((io001Oio) l00iIli.I000II(obj, iI00II0oii1o & 1048575)).isEmpty()) {
/* 123 */                               I00IlilI0i0i(i2).getClass();
/* 126 */                               OIiilo1Ool0o.I00000oIO();
/* 5 */                                 return false;
                                    }
                                }
/* 219 */                       i5++;
/* 221 */                       i6 = i3;
/* 222 */                       i4 = i;
                            }
/* 161 */                   List list = (List) l00iIli.I000II(obj, iI00II0oii1o & 1048575);
/* 167 */                   if (list.isEmpty()) {
                                continue;
                            } else {
/* 169 */                       ioO0I1oi1lio ioo0i1oi1lioI00IOO = I00IOO(i2);
/* 178 */                       for (int i12 = 0; i12 < list.size(); i12++) {
/* 188 */                           if (!ioo0i1oi1lioI00IOO.I0000O(list.get(i12))) {
/* 5 */                                 return false;
                                    }
                                }
                            }
/* 219 */                   i5++;
/* 221 */                   i6 = i3;
/* 222 */                   i4 = i;
                        }
                    }
/* 14 */            return true;
                }

                /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
                
                    r16 = r7;
                 */
                /* JADX WARN: Removed duplicated region for block: B:177:0x06c8 A[Catch: all -> 0x06ce, TryCatch #4 {all -> 0x06ce, blocks: (B:175:0x06c3, B:177:0x06c8, B:180:0x06d0), top: B:198:0x06c3 }] */
                /* JADX WARN: Removed duplicated region for block: B:185:0x06e2  */
                /* JADX WARN: Removed duplicated region for block: B:189:0x06f1 A[LOOP:2: B:188:0x06ef->B:189:0x06f1, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:191:0x06fb  */
                /* JADX WARN: Removed duplicated region for block: B:292:0x06d6 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:309:? A[RETURN, SYNTHETIC] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I0000oI00(Object obj, IOOOi1 iOOOi1, ilI1iIO0oiIo ili1iio0oiio) throws Throwable {
                    Object obj2;
                    iooO1IiiOoOo iooo1iiioooo;
/* 3 */             Object obj3 = obj;
/* 12 */            IOOOI0 ioooi0 = (IOOOI0) iOOOi1.I0000oI00;
/* 14 */            int[] iArr = this.I000II;
/* 16 */            int i = this.I000OOo1O;
/* 18 */            int i2 = this.I000O01llI0;
/* 20 */            iloOil0O1 ilooil0o1 = this.I000OiO;
/* 22 */            ili1iio0oiio.getClass();
/* 25 */            I000lI(obj3);
/* 28 */            iooO1IiiOoOo iooo1iiioooo2 = this.I000iOII;
/* 30 */            Object objI00000oIO = null;
                    while (true) {
                        try {
/* 31 */                    int iI01Iol = iOOOi1.I01Iol();
/* 50 */                    int iI001lloI = (iI01Iol < this.I0000Il00O || iI01Iol > this.I0000O) ? -1 : I001lloI(iI01Iol, 0);
/* 52 */                    if (iI001lloI >= 0) {
/* 112 */                       int iI00II0oii1o = I00II0oii1o(iI001lloI);
                                try {
                                } catch (ill0OI0oO1 unused) {
/* 1724 */                          obj2 = objI00000oIO;
/* 1726 */                          iooo1iiioooo = iooo1iiioooo2;
                                }
                                switch (I00II0Ol1O0l(iI00II0oii1o)) {
                                    case 0:
/* 1681 */                              obj2 = objI00000oIO;
/* 1683 */                              iooo1iiioooo = iooo1iiioooo2;
/* 1685 */                              int i3 = iI00II0oii1o & 1048575;
/* 1687 */                              iOOOi1.I01I1Oo0oll(1);
                                        try {
                                            try {
/* 1699 */                                      l00iIli.I0000Il00O.I00II0oii1o(obj, i3, ioooi0.I00O0i0ii());
/* 1702 */                                      obj3 = obj;
/* 1703 */                                      I00100o1O0lo(iI001lloI, obj3);
/* 1706 */                                      iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                                      objI00000oIO = obj2;
                                            } catch (ill0OI0oO1 unused2) {
/* 1715 */                                      obj3 = obj;
/* 1730 */                                      objI00000oIO = obj2;
                                                try {
/* 1732 */                                          iooo1iiioooo.getClass();
/* 1735 */                                          if (objI00000oIO == null) {
                                                    }
/* 1749 */                                          if (!iooO1IiiOoOo.I00000oOI(objI00000oIO, iOOOi1)) {
                                                    }
/* 361 */                                           iooo1iiioooo2 = iooo1iiioooo;
                                                } catch (Throwable th) {
/* 1743 */                                          th = th;
/* 1776 */                                          while (i2 < i) {
                                                    }
/* 1786 */                                          if (objI00000oIO != null) {
                                                    }
/* 1798 */                                          throw th;
                                                }
                                            } catch (Throwable th2) {
/* 1712 */                                      th = th2;
/* 1713 */                                      obj3 = obj;
/* 1774 */                                      objI00000oIO = obj2;
/* 1776 */                                      while (i2 < i) {
                                                }
/* 1786 */                                      if (objI00000oIO != null) {
                                                }
/* 1798 */                                      throw th;
                                            }
                                        } catch (ill0OI0oO1 unused3) {
/* 1721 */                                  obj3 = obj;
                                        } catch (Throwable th3) {
/* 1717 */                                  th = th3;
/* 1718 */                                  obj3 = obj;
                                        }
                                        break;
                                    case 1:
/* 1657 */                              obj2 = objI00000oIO;
/* 1659 */                              iooo1iiioooo = iooo1iiioooo2;
/* 1664 */                              iOOOi1.I01I1Oo0oll(5);
/* 1674 */                              l00iIli.I0000Il00O.I00IioO0OiOi(obj3, iI00II0oii1o & 1048575, ioooi0.I00OI1());
/* 1677 */                              I00100o1O0lo(iI001lloI, obj3);
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case 2:
/* 1635 */                              obj2 = objI00000oIO;
/* 1637 */                              iooo1iiioooo = iooo1iiioooo2;
/* 1642 */                              iOOOi1.I01I1Oo0oll(0);
/* 1650 */                              l00iIli.I000OOo1O(obj3, iI00II0oii1o & 1048575, ioooi0.I00i01iIIliI());
/* 1653 */                              I00100o1O0lo(iI001lloI, obj3);
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case 3:
/* 1613 */                              obj2 = objI00000oIO;
/* 1615 */                              iooo1iiioooo = iooo1iiioooo2;
/* 1620 */                              iOOOi1.I01I1Oo0oll(0);
/* 1628 */                              l00iIli.I000OOo1O(obj3, iI00II0oii1o & 1048575, ioooi0.I00i0oil());
/* 1631 */                              I00100o1O0lo(iI001lloI, obj3);
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case 4:
/* 1591 */                              obj2 = objI00000oIO;
/* 1593 */                              iooo1iiioooo = iooo1iiioooo2;
/* 1598 */                              iOOOi1.I01I1Oo0oll(0);
/* 1606 */                              l00iIli.I000O01llI0(obj3, iI00II0oii1o & 1048575, ioooi0.I00OilO00Il());
/* 1609 */                              I00100o1O0lo(iI001lloI, obj3);
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case 5:
/* 1569 */                              obj2 = objI00000oIO;
/* 1571 */                              iooo1iiioooo = iooo1iiioooo2;
/* 1575 */                              iOOOi1.I01I1Oo0oll(1);
/* 1583 */                              l00iIli.I000OOo1O(obj3, iI00II0oii1o & 1048575, ioooi0.I00OloOo());
/* 1586 */                              I00100o1O0lo(iI001lloI, obj3);
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case 6:
/* 1546 */                              obj2 = objI00000oIO;
/* 1548 */                              iooo1iiioooo = iooo1iiioooo2;
/* 1553 */                              iOOOi1.I01I1Oo0oll(5);
/* 1561 */                              l00iIli.I000O01llI0(obj3, iI00II0oii1o & 1048575, ioooi0.I00OOll1());
/* 1564 */                              I00100o1O0lo(iI001lloI, obj3);
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case 7:
/* 1521 */                              obj2 = objI00000oIO;
/* 1523 */                              iooo1iiioooo = iooo1iiioooo2;
/* 1528 */                              iOOOi1.I01I1Oo0oll(0);
/* 1538 */                              l00iIli.I0000Il00O.I001iOo1i0O(obj3, iI00II0oii1o & 1048575, ioooi0.I00Io1lO());
/* 1541 */                              I00100o1O0lo(iI001lloI, obj3);
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case 8:
/* 1509 */                              obj2 = objI00000oIO;
/* 1511 */                              iooo1iiioooo = iooo1iiioooo2;
/* 1513 */                              I00100l0(iI00II0oii1o, iOOOi1, obj3);
/* 1516 */                              I00100o1O0lo(iI001lloI, obj3);
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case 9:
/* 1483 */                              obj2 = objI00000oIO;
/* 1485 */                              iooo1iiioooo = iooo1iiioooo2;
/* 1491 */                              iilO1O iilo1o = (iilO1O) I000OiO(iI001lloI, obj3);
/* 1493 */                              ioO0I1oi1lio ioo0i1oi1lioI00IOO = I00IOO(iI001lloI);
/* 1498 */                              iOOOi1.I01I1Oo0oll(2);
/* 1501 */                              iOOOi1.I011lO1liO1O(iilo1o, ioo0i1oi1lioI00IOO, ili1iio0oiio);
/* 1504 */                              I0010o(iI001lloI, obj3, iilo1o);
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case 10:
/* 1464 */                              obj2 = objI00000oIO;
/* 1466 */                              iooo1iiioooo = iooo1iiioooo2;
/* 1475 */                              l00iIli.I000OiO(obj3, iI00II0oii1o & 1048575, iOOOi1.I01O1I1());
/* 1478 */                              I00100o1O0lo(iI001lloI, obj3);
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case 11:
/* 1441 */                              obj2 = objI00000oIO;
/* 1443 */                              iooo1iiioooo = iooo1iiioooo2;
/* 1448 */                              iOOOi1.I01I1Oo0oll(0);
/* 1456 */                              l00iIli.I000O01llI0(obj3, iI00II0oii1o & 1048575, ioooi0.I00Ol1ll1());
/* 1459 */                              I00100o1O0lo(iI001lloI, obj3);
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case 12:
/* 1372 */                              obj2 = objI00000oIO;
/* 1374 */                              iooo1iiioooo = iooo1iiioooo2;
/* 1377 */                              iOOOi1.I01I1Oo0oll(0);
/* 1380 */                              int iI00OIo = ioooi0.I00OIo();
/* 1384 */                              l0IioO1i0lO1 l0iioo1i0lo1I00IO1oi11O = I00IO1oi11O(iI001lloI);
/* 1388 */                              if (l0iioo1i0lo1I00IO1oi11O != null && !l0iioo1i0lo1I00IO1oi11O.I00000oIO(iI00OIo)) {
/* 1397 */                                  Class cls = ioOi0IO.I00000oIO;
/* 1399 */                                  if (obj2 == null) {
/* 1401 */                                      iooo1iiioooo.getClass();
/* 1404 */                                      objI00000oIO = iooO1IiiOoOo.I00000oIO(obj3);
                                            } else {
/* 1410 */                                      objI00000oIO = obj2;
                                            }
/* 1413 */                                  iooo1iiioooo.getClass();
/* 1425 */                                  ((iooIiiOli) objI00000oIO).I0000Il00O(iI01Iol << 3, Long.valueOf(iI00OIo));
/* 361 */                                   iooo1iiioooo2 = iooo1iiioooo;
                                        }
/* 1433 */                              l00iIli.I000O01llI0(obj3, iI00II0oii1o & 1048575, iI00OIo);
/* 1436 */                              I00100o1O0lo(iI001lloI, obj3);
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                        break;
                                    case 13:
/* 1349 */                              obj2 = objI00000oIO;
/* 1351 */                              iooo1iiioooo = iooo1iiioooo2;
/* 1356 */                              iOOOi1.I01I1Oo0oll(5);
/* 1364 */                              l00iIli.I000O01llI0(obj3, iI00II0oii1o & 1048575, ioooi0.I00Oio());
/* 1367 */                              I00100o1O0lo(iI001lloI, obj3);
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case 14:
/* 1327 */                              obj2 = objI00000oIO;
/* 1329 */                              iooo1iiioooo = iooo1iiioooo2;
/* 1333 */                              iOOOi1.I01I1Oo0oll(1);
/* 1341 */                              l00iIli.I000OOo1O(obj3, iI00II0oii1o & 1048575, ioooi0.I00i0O());
/* 1344 */                              I00100o1O0lo(iI001lloI, obj3);
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case 15:
/* 1304 */                              obj2 = objI00000oIO;
/* 1306 */                              iooo1iiioooo = iooo1iiioooo2;
/* 1311 */                              iOOOi1.I01I1Oo0oll(0);
/* 1319 */                              l00iIli.I000O01llI0(obj3, iI00II0oii1o & 1048575, ioooi0.I00Ol00());
/* 1322 */                              I00100o1O0lo(iI001lloI, obj3);
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case 16:
/* 1281 */                              obj2 = objI00000oIO;
/* 1283 */                              iooo1iiioooo = iooo1iiioooo2;
/* 1288 */                              iOOOi1.I01I1Oo0oll(0);
/* 1296 */                              l00iIli.I000OOo1O(obj3, iI00II0oii1o & 1048575, ioooi0.I00i0ilIl0i());
/* 1299 */                              I00100o1O0lo(iI001lloI, obj3);
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case 17:
/* 1256 */                              obj2 = objI00000oIO;
/* 1258 */                              iooo1iiioooo = iooo1iiioooo2;
/* 1264 */                              iilO1O iilo1o2 = (iilO1O) I000OiO(iI001lloI, obj3);
/* 1266 */                              ioO0I1oi1lio ioo0i1oi1lioI00IOO2 = I00IOO(iI001lloI);
/* 1270 */                              iOOOi1.I01I1Oo0oll(3);
/* 1273 */                              iOOOi1.I011iIOio(iilo1o2, ioo0i1oi1lioI00IOO2, ili1iio0oiio);
/* 1276 */                              I0010o(iI001lloI, obj3, iilo1o2);
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case PoseLandmark.RIGHT_PINKY:
/* 1240 */                              obj2 = objI00000oIO;
/* 1242 */                              iooo1iiioooo = iooo1iiioooo2;
/* 1251 */                              iOOOi1.I01OOiI1o(ilooil0o1.I00000oIO(obj3, iI00II0oii1o & 1048575));
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case PoseLandmark.LEFT_INDEX:
/* 1224 */                              obj2 = objI00000oIO;
/* 1226 */                              iooo1iiioooo = iooo1iiioooo2;
/* 1235 */                              iOOOi1.I00o0l1o1o0(ilooil0o1.I00000oIO(obj3, iI00II0oii1o & 1048575));
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case PoseLandmark.RIGHT_INDEX:
/* 1208 */                              obj2 = objI00000oIO;
/* 1210 */                              iooo1iiioooo = iooo1iiioooo2;
/* 1219 */                              iOOOi1.I00oli(ilooil0o1.I00000oIO(obj3, iI00II0oii1o & 1048575));
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case PoseLandmark.LEFT_THUMB:
/* 1192 */                              obj2 = objI00000oIO;
/* 1194 */                              iooo1iiioooo = iooo1iiioooo2;
/* 1203 */                              iOOOi1.I0110o(ilooil0o1.I00000oIO(obj3, iI00II0oii1o & 1048575));
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case PoseLandmark.RIGHT_THUMB:
/* 1176 */                              obj2 = objI00000oIO;
/* 1178 */                              iooo1iiioooo = iooo1iiioooo2;
/* 1187 */                              iOOOi1.I00oOio10iI1(ilooil0o1.I00000oIO(obj3, iI00II0oii1o & 1048575));
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case PoseLandmark.LEFT_HIP:
/* 1160 */                              obj2 = objI00000oIO;
/* 1162 */                              iooo1iiioooo = iooo1iiioooo2;
/* 1171 */                              iOOOi1.I00lli11(ilooil0o1.I00000oIO(obj3, iI00II0oii1o & 1048575));
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case PoseLandmark.RIGHT_HIP:
/* 1144 */                              obj2 = objI00000oIO;
/* 1146 */                              iooo1iiioooo = iooo1iiioooo2;
/* 1155 */                              iOOOi1.I01Olioli(ilooil0o1.I00000oIO(obj3, iI00II0oii1o & 1048575));
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case PoseLandmark.LEFT_KNEE:
/* 1128 */                              obj2 = objI00000oIO;
/* 1130 */                              iooo1iiioooo = iooo1iiioooo2;
/* 1139 */                              iOOOi1.I01OO1I(ilooil0o1.I00000oIO(obj3, iI00II0oii1o & 1048575));
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case PoseLandmark.RIGHT_KNEE:
/* 1089 */                              obj2 = objI00000oIO;
/* 1091 */                              iooo1iiioooo = iooo1iiioooo2;
/* 1101 */                              if ((536870912 & iI00II0oii1o) != 0) {
/* 1110 */                                  iOOOi1.I010lI0oi(ilooil0o1.I00000oIO(obj3, iI00II0oii1o & 1048575), true);
                                        } else {
/* 1123 */                                  iOOOi1.I010lI0oi(ilooil0o1.I00000oIO(obj3, iI00II0oii1o & 1048575), false);
                                        }
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case 27:
/* 1069 */                              obj2 = objI00000oIO;
/* 1071 */                              iooo1iiioooo = iooo1iiioooo2;
/* 1084 */                              iOOOi1.I00ooIo0(ilooil0o1.I00000oIO(obj3, iI00II0oii1o & 1048575), I00IOO(iI001lloI), ili1iio0oiio);
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case PoseLandmark.RIGHT_ANKLE:
/* 1053 */                              obj2 = objI00000oIO;
/* 1055 */                              iooo1iiioooo = iooo1iiioooo2;
/* 1064 */                              iOOOi1.I01OOIlI(ilooil0o1.I00000oIO(obj3, iI00II0oii1o & 1048575));
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case PoseLandmark.LEFT_HEEL:
/* 1037 */                              obj2 = objI00000oIO;
/* 1039 */                              iooo1iiioooo = iooo1iiioooo2;
/* 1048 */                              iOOOi1.I01101IOlO(ilooil0o1.I00000oIO(obj3, iI00II0oii1o & 1048575));
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case 30:
/* 1018 */                              List listI00000oIO = ilooil0o1.I00000oIO(obj3, iI00II0oii1o & 1048575);
/* 1022 */                              iOOOi1.I01Ol1o0(listI00000oIO);
/* 1029 */                              objI00000oIO = ioOi0IO.I00100o1O0lo(obj3, iI01Iol, listI00000oIO, I00IO1oi11O(iI001lloI), objI00000oIO, iooo1iiioooo2);
/* 1033 */                              iooo1iiioooo = iooo1iiioooo2;
/* 361 */                               iooo1iiioooo2 = iooo1iiioooo;
                                    case PoseLandmark.LEFT_FOOT_INDEX:
/* 1010 */                              iOOOi1.I0100i(ilooil0o1.I00000oIO(obj3, iI00II0oii1o & 1048575));
/* 189 */                               obj2 = objI00000oIO;
/* 191 */                               iooo1iiioooo = iooo1iiioooo2;
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case 32:
/* 998 */                               iOOOi1.I010I0(ilooil0o1.I00000oIO(obj3, iI00II0oii1o & 1048575));
/* 189 */                               obj2 = objI00000oIO;
/* 191 */                               iooo1iiioooo = iooo1iiioooo2;
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case 33:
/* 986 */                               iOOOi1.I010i10l(ilooil0o1.I00000oIO(obj3, iI00II0oii1o & 1048575));
/* 189 */                               obj2 = objI00000oIO;
/* 191 */                               iooo1iiioooo = iooo1iiioooo2;
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case 34:
/* 974 */                               iOOOi1.I010l10O(ilooil0o1.I00000oIO(obj3, iI00II0oii1o & 1048575));
/* 189 */                               obj2 = objI00000oIO;
/* 191 */                               iooo1iiioooo = iooo1iiioooo2;
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case InputImage.IMAGE_FORMAT_YUV_420_888:
/* 962 */                               iOOOi1.I01OOiI1o(ilooil0o1.I00000oIO(obj3, iI00II0oii1o & 1048575));
/* 189 */                               obj2 = objI00000oIO;
/* 191 */                               iooo1iiioooo = iooo1iiioooo2;
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case 36:
/* 950 */                               iOOOi1.I00o0l1o1o0(ilooil0o1.I00000oIO(obj3, iI00II0oii1o & 1048575));
/* 189 */                               obj2 = objI00000oIO;
/* 191 */                               iooo1iiioooo = iooo1iiioooo2;
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case 37:
/* 938 */                               iOOOi1.I00oli(ilooil0o1.I00000oIO(obj3, iI00II0oii1o & 1048575));
/* 189 */                               obj2 = objI00000oIO;
/* 191 */                               iooo1iiioooo = iooo1iiioooo2;
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case 38:
/* 926 */                               iOOOi1.I0110o(ilooil0o1.I00000oIO(obj3, iI00II0oii1o & 1048575));
/* 189 */                               obj2 = objI00000oIO;
/* 191 */                               iooo1iiioooo = iooo1iiioooo2;
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case 39:
/* 914 */                               iOOOi1.I00oOio10iI1(ilooil0o1.I00000oIO(obj3, iI00II0oii1o & 1048575));
/* 189 */                               obj2 = objI00000oIO;
/* 191 */                               iooo1iiioooo = iooo1iiioooo2;
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case 40:
/* 902 */                               iOOOi1.I00lli11(ilooil0o1.I00000oIO(obj3, iI00II0oii1o & 1048575));
/* 189 */                               obj2 = objI00000oIO;
/* 191 */                               iooo1iiioooo = iooo1iiioooo2;
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case 41:
/* 890 */                               iOOOi1.I01Olioli(ilooil0o1.I00000oIO(obj3, iI00II0oii1o & 1048575));
/* 189 */                               obj2 = objI00000oIO;
/* 191 */                               iooo1iiioooo = iooo1iiioooo2;
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case 42:
/* 878 */                               iOOOi1.I01OO1I(ilooil0o1.I00000oIO(obj3, iI00II0oii1o & 1048575));
/* 189 */                               obj2 = objI00000oIO;
/* 191 */                               iooo1iiioooo = iooo1iiioooo2;
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case 43:
/* 866 */                               iOOOi1.I01101IOlO(ilooil0o1.I00000oIO(obj3, iI00II0oii1o & 1048575));
/* 189 */                               obj2 = objI00000oIO;
/* 191 */                               iooo1iiioooo = iooo1iiioooo2;
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case 44:
/* 824 */                               obj2 = objI00000oIO;
/* 826 */                               iooo1iiioooo = iooo1iiioooo2;
                                        try {
/* 831 */                                   List listI00000oIO2 = ilooil0o1.I00000oIO(obj3, iI00II0oii1o & 1048575);
/* 835 */                                   iOOOi1.I01Ol1o0(listI00000oIO2);
/* 842 */                                   iooo1iiioooo2 = iooo1iiioooo;
/* 846 */                                   objI00000oIO = ioOi0IO.I00100o1O0lo(obj3, iI01Iol, listI00000oIO2, I00IO1oi11O(iI001lloI), obj2, iooo1iiioooo2);
                                        } catch (Throwable th4) {
/* 852 */                                   th = th4;
/* 1774 */                                  objI00000oIO = obj2;
/* 1776 */                                  while (i2 < i) {
                                            }
/* 1786 */                                  if (objI00000oIO != null) {
                                            }
/* 1798 */                                  throw th;
                                        }
                                        break;
                                    case BuildConfig.VERSION_CODE:
/* 808 */                               obj2 = objI00000oIO;
/* 810 */                               iooo1iiioooo = iooo1iiioooo2;
/* 819 */                               iOOOi1.I0100i(ilooil0o1.I00000oIO(obj3, iI00II0oii1o & 1048575));
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case 46:
/* 792 */                               obj2 = objI00000oIO;
/* 794 */                               iooo1iiioooo = iooo1iiioooo2;
/* 803 */                               iOOOi1.I010I0(ilooil0o1.I00000oIO(obj3, iI00II0oii1o & 1048575));
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case 47:
/* 776 */                               obj2 = objI00000oIO;
/* 778 */                               iooo1iiioooo = iooo1iiioooo2;
/* 787 */                               iOOOi1.I010i10l(ilooil0o1.I00000oIO(obj3, iI00II0oii1o & 1048575));
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case 48:
/* 760 */                               obj2 = objI00000oIO;
/* 762 */                               iooo1iiioooo = iooo1iiioooo2;
/* 771 */                               iOOOi1.I010l10O(ilooil0o1.I00000oIO(obj3, iI00II0oii1o & 1048575));
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case 49:
/* 740 */                               obj2 = objI00000oIO;
/* 742 */                               iooo1iiioooo = iooo1iiioooo2;
/* 755 */                               iOOOi1.I00oII(ilooil0o1.I00000oIO(obj3, iI00II0oii1o & 1048575), I00IOO(iI001lloI), ili1iio0oiio);
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case 50:
/* 682 */                               Object objI00IlilI0i0i = I00IlilI0i0i(iI001lloI);
/* 690 */                               long jI00II0oii1o = I00II0oii1o(iI001lloI) & 1048575;
/* 693 */                               Object objI000II = l00iIli.I000II(obj3, jI00II0oii1o);
/* 697 */                               if (objI000II == null) {
/* 722 */                                   objI000II = io001Oio.I00iiI.I00000oIO();
/* 726 */                                   l00iIli.I000OiO(obj3, jI00II0oii1o, objI000II);
                                        } else if (!((io001Oio) objI000II).I00iOIl) {
/* 708 */                                   Object objI00000oIO2 = io001Oio.I00iiI.I00000oIO();
/* 712 */                                   io01il0i0.I00000oIO(objI00000oIO2, objI000II);
/* 715 */                                   l00iIli.I000OiO(obj3, jI00II0oii1o, objI00000oIO2);
/* 718 */                                   objI000II = objI00000oIO2;
                                        }
/* 731 */                               if (objI00IlilI0i0i != null) {
/* 739 */                                   throw new ClassCastException();
                                        }
/* 733 */                               throw null;
                                    case 51:
/* 652 */                               obj2 = objI00000oIO;
/* 654 */                               iooo1iiioooo = iooo1iiioooo2;
/* 658 */                               iOOOi1.I01I1Oo0oll(1);
/* 670 */                               l00iIli.I000OiO(obj3, iI00II0oii1o & 1048575, Double.valueOf(ioooi0.I00O0i0ii()));
/* 673 */                               I0010I0i(obj3, iI01Iol, iI001lloI);
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case 52:
/* 625 */                               obj2 = objI00000oIO;
/* 627 */                               iooo1iiioooo = iooo1iiioooo2;
/* 632 */                               iOOOi1.I01I1Oo0oll(5);
/* 644 */                               l00iIli.I000OiO(obj3, iI00II0oii1o & 1048575, Float.valueOf(ioooi0.I00OI1()));
/* 647 */                               I0010I0i(obj3, iI01Iol, iI001lloI);
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case 53:
/* 598 */                               obj2 = objI00000oIO;
/* 600 */                               iooo1iiioooo = iooo1iiioooo2;
/* 605 */                               iOOOi1.I01I1Oo0oll(0);
/* 617 */                               l00iIli.I000OiO(obj3, iI00II0oii1o & 1048575, Long.valueOf(ioooi0.I00i01iIIliI()));
/* 620 */                               I0010I0i(obj3, iI01Iol, iI001lloI);
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case 54:
/* 571 */                               obj2 = objI00000oIO;
/* 573 */                               iooo1iiioooo = iooo1iiioooo2;
/* 578 */                               iOOOi1.I01I1Oo0oll(0);
/* 590 */                               l00iIli.I000OiO(obj3, iI00II0oii1o & 1048575, Long.valueOf(ioooi0.I00i0oil()));
/* 593 */                               I0010I0i(obj3, iI01Iol, iI001lloI);
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case 55:
/* 544 */                               obj2 = objI00000oIO;
/* 546 */                               iooo1iiioooo = iooo1iiioooo2;
/* 551 */                               iOOOi1.I01I1Oo0oll(0);
/* 563 */                               l00iIli.I000OiO(obj3, iI00II0oii1o & 1048575, Integer.valueOf(ioooi0.I00OilO00Il()));
/* 566 */                               I0010I0i(obj3, iI01Iol, iI001lloI);
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case 56:
/* 518 */                               obj2 = objI00000oIO;
/* 520 */                               iooo1iiioooo = iooo1iiioooo2;
/* 524 */                               iOOOi1.I01I1Oo0oll(1);
/* 536 */                               l00iIli.I000OiO(obj3, iI00II0oii1o & 1048575, Long.valueOf(ioooi0.I00OloOo()));
/* 539 */                               I0010I0i(obj3, iI01Iol, iI001lloI);
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case 57:
/* 491 */                               obj2 = objI00000oIO;
/* 493 */                               iooo1iiioooo = iooo1iiioooo2;
/* 498 */                               iOOOi1.I01I1Oo0oll(5);
/* 510 */                               l00iIli.I000OiO(obj3, iI00II0oii1o & 1048575, Integer.valueOf(ioooi0.I00OOll1()));
/* 513 */                               I0010I0i(obj3, iI01Iol, iI001lloI);
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case 58:
/* 464 */                               obj2 = objI00000oIO;
/* 466 */                               iooo1iiioooo = iooo1iiioooo2;
/* 471 */                               iOOOi1.I01I1Oo0oll(0);
/* 483 */                               l00iIli.I000OiO(obj3, iI00II0oii1o & 1048575, Boolean.valueOf(ioooi0.I00Io1lO()));
/* 486 */                               I0010I0i(obj3, iI01Iol, iI001lloI);
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case 59:
/* 452 */                               obj2 = objI00000oIO;
/* 454 */                               iooo1iiioooo = iooo1iiioooo2;
/* 456 */                               I00100l0(iI00II0oii1o, iOOOi1, obj3);
/* 459 */                               I0010I0i(obj3, iI01Iol, iI001lloI);
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case 60:
/* 426 */                               obj2 = objI00000oIO;
/* 428 */                               iooo1iiioooo = iooo1iiioooo2;
/* 434 */                               iilO1O iilo1o3 = (iilO1O) I000iOII(obj3, iI01Iol, iI001lloI);
/* 436 */                               ioO0I1oi1lio ioo0i1oi1lioI00IOO3 = I00IOO(iI001lloI);
/* 441 */                               iOOOi1.I01I1Oo0oll(2);
/* 444 */                               iOOOi1.I011lO1liO1O(iilo1o3, ioo0i1oi1lioI00IOO3, ili1iio0oiio);
/* 447 */                               I00111O(obj3, iI01Iol, iI001lloI, iilo1o3);
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case 61:
/* 407 */                               obj2 = objI00000oIO;
/* 409 */                               iooo1iiioooo = iooo1iiioooo2;
/* 418 */                               l00iIli.I000OiO(obj3, iI00II0oii1o & 1048575, iOOOi1.I01O1I1());
/* 421 */                               I0010I0i(obj3, iI01Iol, iI001lloI);
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case 62:
/* 380 */                               obj2 = objI00000oIO;
/* 382 */                               iooo1iiioooo = iooo1iiioooo2;
/* 387 */                               iOOOi1.I01I1Oo0oll(0);
/* 399 */                               l00iIli.I000OiO(obj3, iI00II0oii1o & 1048575, Integer.valueOf(ioooi0.I00Ol1ll1()));
/* 402 */                               I0010I0i(obj3, iI01Iol, iI001lloI);
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case 63:
/* 305 */                               obj2 = objI00000oIO;
/* 307 */                               iooo1iiioooo = iooo1iiioooo2;
/* 310 */                               iOOOi1.I01I1Oo0oll(0);
/* 313 */                               int iI00OIo2 = ioooi0.I00OIo();
/* 317 */                               l0IioO1i0lO1 l0iioo1i0lo1I00IO1oi11O2 = I00IO1oi11O(iI001lloI);
/* 321 */                               if (l0iioo1i0lo1I00IO1oi11O2 != null && !l0iioo1i0lo1I00IO1oi11O2.I00000oIO(iI00OIo2)) {
/* 330 */                                   Class cls2 = ioOi0IO.I00000oIO;
/* 332 */                                   if (obj2 == null) {
/* 334 */                                       iooo1iiioooo.getClass();
/* 337 */                                       objI00000oIO = iooO1IiiOoOo.I00000oIO(obj3);
                                            } else {
/* 343 */                                       objI00000oIO = obj2;
                                            }
/* 346 */                                   iooo1iiioooo.getClass();
/* 358 */                                   ((iooIiiOli) objI00000oIO).I0000Il00O(iI01Iol << 3, Long.valueOf(iI00OIo2));
/* 361 */                                   iooo1iiioooo2 = iooo1iiioooo;
                                        }
/* 372 */                               l00iIli.I000OiO(obj3, iI00II0oii1o & 1048575, Integer.valueOf(iI00OIo2));
/* 375 */                               I0010I0i(obj3, iI01Iol, iI001lloI);
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                        break;
                                    case Barcode.FORMAT_EAN_8:
/* 278 */                               obj2 = objI00000oIO;
/* 280 */                               iooo1iiioooo = iooo1iiioooo2;
/* 285 */                               iOOOi1.I01I1Oo0oll(5);
/* 297 */                               l00iIli.I000OiO(obj3, iI00II0oii1o & 1048575, Integer.valueOf(ioooi0.I00Oio()));
/* 300 */                               I0010I0i(obj3, iI01Iol, iI001lloI);
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case 65:
/* 252 */                               obj2 = objI00000oIO;
/* 254 */                               iooo1iiioooo = iooo1iiioooo2;
/* 258 */                               iOOOi1.I01I1Oo0oll(1);
/* 270 */                               l00iIli.I000OiO(obj3, iI00II0oii1o & 1048575, Long.valueOf(ioooi0.I00i0O()));
/* 273 */                               I0010I0i(obj3, iI01Iol, iI001lloI);
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case 66:
/* 225 */                               obj2 = objI00000oIO;
/* 227 */                               iooo1iiioooo = iooo1iiioooo2;
/* 232 */                               iOOOi1.I01I1Oo0oll(0);
/* 244 */                               l00iIli.I000OiO(obj3, iI00II0oii1o & 1048575, Integer.valueOf(ioooi0.I00Ol00()));
/* 247 */                               I0010I0i(obj3, iI01Iol, iI001lloI);
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    case 67:
/* 195 */                               int i4 = iI00II0oii1o & 1048575;
/* 198 */                               iOOOi1.I01I1Oo0oll(0);
/* 209 */                               obj2 = objI00000oIO;
/* 211 */                               iooo1iiioooo = iooo1iiioooo2;
                                        try {
                                            try {
/* 214 */                                       l00iIli.I000OiO(obj3, i4, Long.valueOf(ioooi0.I00i0ilIl0i()));
/* 217 */                                       I0010I0i(obj3, iI01Iol, iI001lloI);
/* 1706 */                                      iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                                      objI00000oIO = obj2;
                                            } catch (ill0OI0oO1 unused4) {
/* 1730 */                                      objI00000oIO = obj2;
/* 1732 */                                      iooo1iiioooo.getClass();
/* 1735 */                                      if (objI00000oIO == null) {
                                                }
/* 1749 */                                      if (!iooO1IiiOoOo.I00000oOI(objI00000oIO, iOOOi1)) {
                                                }
/* 361 */                                       iooo1iiioooo2 = iooo1iiioooo;
                                            }
                                        } catch (Throwable th5) {
/* 222 */                                   th = th5;
/* 1774 */                                  objI00000oIO = obj2;
/* 1776 */                                  while (i2 < i) {
                                            }
/* 1786 */                                  if (objI00000oIO != null) {
                                            }
/* 1798 */                                  throw th;
                                        }
                                        break;
                                    case 68:
/* 174 */                               iilO1O iilo1o4 = (iilO1O) I000iOII(obj3, iI01Iol, iI001lloI);
/* 176 */                               ioO0I1oi1lio ioo0i1oi1lioI00IOO4 = I00IOO(iI001lloI);
/* 180 */                               iOOOi1.I01I1Oo0oll(3);
/* 183 */                               iOOOi1.I011iIOio(iilo1o4, ioo0i1oi1lioI00IOO4, ili1iio0oiio);
/* 186 */                               I00111O(obj3, iI01Iol, iI001lloI, iilo1o4);
/* 189 */                               obj2 = objI00000oIO;
/* 191 */                               iooo1iiioooo = iooo1iiioooo2;
/* 1706 */                              iooo1iiioooo2 = iooo1iiioooo;
/* 1708 */                              objI00000oIO = obj2;
                                    default:
/* 130 */                               if (objI00000oIO == null) {
                                            try {
/* 132 */                                       iooo1iiioooo2.getClass();
/* 135 */                                       objI00000oIO = iooO1IiiOoOo.I00000oIO(obj3);
                                            } catch (ill0OI0oO1 unused5) {
/* 141 */                                       obj2 = objI00000oIO;
/* 143 */                                       iooo1iiioooo = iooo1iiioooo2;
/* 1730 */                                      objI00000oIO = obj2;
/* 1732 */                                      iooo1iiioooo.getClass();
/* 1735 */                                      if (objI00000oIO == null) {
                                                }
/* 1749 */                                      if (!iooO1IiiOoOo.I00000oOI(objI00000oIO, iOOOi1)) {
                                                }
/* 361 */                                       iooo1iiioooo2 = iooo1iiioooo;
                                            }
                                        }
                                        try {
/* 147 */                                   iooo1iiioooo2.getClass();
                                        } catch (ill0OI0oO1 unused6) {
/* 166 */                                   iooo1iiioooo = iooo1iiioooo2;
/* 1732 */                                  iooo1iiioooo.getClass();
/* 1735 */                                  if (objI00000oIO == null) {
/* 1737 */                                      objI00000oIO = iooO1IiiOoOo.I00000oIO(obj3);
                                            }
/* 1749 */                                  if (!iooO1IiiOoOo.I00000oOI(objI00000oIO, iOOOi1)) {
/* 1751 */                                      while (i2 < i) {
/* 1755 */                                          I00IioO0OiOi(iArr[i2], obj3, objI00000oIO);
/* 1758 */                                          i2++;
                                                }
/* 1761 */                                      if (objI00000oIO == null) {
                                                }
                                            }
/* 361 */                                   iooo1iiioooo2 = iooo1iiioooo;
                                        }
/* 154 */                               if (!iooO1IiiOoOo.I00000oOI(objI00000oIO, iOOOi1)) {
/* 156 */                                   while (i2 < i) {
/* 160 */                                       I00IioO0OiOi(iArr[i2], obj3, objI00000oIO);
/* 163 */                                       i2++;
                                            }
                                            break;
                                        }
                                        break;
                                }
                            } else if (iI01Iol == Integer.MAX_VALUE) {
/* 59 */                        while (i2 < i) {
/* 63 */                            I00IioO0OiOi(iArr[i2], obj3, objI00000oIO);
/* 66 */                            i2++;
                                }
                            } else {
/* 73 */                        iooo1iiioooo2.getClass();
/* 76 */                        if (objI00000oIO == null) {
/* 78 */                            objI00000oIO = iooO1IiiOoOo.I00000oIO(obj3);
                                }
                                try {
/* 95 */                            if (!iooO1IiiOoOo.I00000oOI(objI00000oIO, iOOOi1)) {
/* 97 */                                while (i2 < i) {
/* 101 */                                   I00IioO0OiOi(iArr[i2], obj3, objI00000oIO);
/* 104 */                                   i2++;
                                        }
                                    }
                                } catch (Throwable th6) {
/* 107 */                           th = th6;
/* 108 */                           iooo1iiioooo = iooo1iiioooo2;
/* 1776 */                          while (i2 < i) {
/* 1780 */                              I00IioO0OiOi(iArr[i2], obj3, objI00000oIO);
/* 1783 */                              i2++;
                                    }
/* 1786 */                          if (objI00000oIO != null) {
/* 1788 */                              iooo1iiioooo.getClass();
/* 1796 */                              ((ilOl10) obj3).zzc = (iooIiiOli) objI00000oIO;
                                    }
/* 1798 */                          throw th;
                                }
                            }
                        } catch (Throwable th7) {
/* 84 */                    th = th7;
/* 85 */                    obj2 = objI00000oIO;
/* 87 */                    iooo1iiioooo = iooo1iiioooo2;
                        }
                    }
/* 1761 */          if (objI00000oIO == null) {
/* 1763 */              iooo1iiioooo.getClass();
/* 1771 */              ((ilOl10) obj3).zzc = (iooIiiOli) objI00000oIO;
                    }
                }

                @Override
                public final void I0001Ioi1lo(Object obj, i11I1Ili i11i1ili) throws IOO1IOl1O10 {
                    int i;
/* 1 */             io1ii1oO1iO io1ii1oo1io = this;
/* 7 */             int[] iArr = io1ii1oo1io.I00000oIO;
/* 10 */            int i2 = 1048575;
/* 13 */            int i3 = 0;
/* 14 */            int i4 = 0;
/* 15 */            int i5 = 1048575;
/* 17 */            while (i3 < iArr.length) {
/* 19 */                int iI00II0oii1o = io1ii1oo1io.I00II0oii1o(i3);
/* 23 */                int iI00II0Ol1O0l = I00II0Ol1O0l(iI00II0oii1o);
/* 27 */                int i6 = iArr[i3];
/* 32 */                Unsafe unsafe = I000lI;
/* 34 */                if (iI00II0Ol1O0l <= 17) {
/* 38 */                    int i7 = iArr[i3 + 2];
/* 40 */                    int i8 = i7 & i2;
/* 42 */                    if (i8 != i5) {
/* 49 */                        i4 = i8 == i2 ? 0 : unsafe.getInt(obj, i8);
/* 54 */                        i5 = i8;
                            }
/* 57 */                    i = 1 << (i7 >>> 20);
                        } else {
/* 60 */                    i = 0;
                        }
/* 61 */                long j = iI00II0oii1o & i2;
                        switch (iI00II0Ol1O0l) {
                            case 0:
/* 1511 */                      if (io1ii1oo1io.I001i1O0Ol(obj, i3, i5, i4, i)) {
/* 1527 */                          ((il1O00loO1) i11i1ili.I00iiI).I0001Ioi1lo(i6, Double.doubleToRawLongBits(l00iIli.I0000Il00O.I0010I0i(obj, j)));
                                    continue;
                                }
/* 1530 */                      i3 += 3;
/* 1532 */                      i2 = 1048575;
                            case 1:
/* 1485 */                      if (io1ii1oo1io.I001i1O0Ol(obj, i3, i5, i4, i)) {
/* 1501 */                          ((il1O00loO1) i11i1ili.I00iiI).I0000O(i6, Float.floatToRawIntBits(l00iIli.I0000Il00O.I001IIilI0O(obj, j)));
                                    break;
                                }
                                break;
                            case 2:
/* 1465 */                      if (io1ii1oo1io.I001i1O0Ol(obj, i3, i5, i4, i)) {
/* 1475 */                          ((il1O00loO1) i11i1ili.I00iiI).I000iOII(i6, unsafe.getLong(obj, j));
                                    break;
                                }
                                break;
                            case 3:
/* 1445 */                      if (io1ii1oo1io.I001i1O0Ol(obj, i3, i5, i4, i)) {
/* 1455 */                          ((il1O00loO1) i11i1ili.I00iiI).I000iOII(i6, unsafe.getLong(obj, j));
                                    break;
                                }
                                break;
                            case 4:
/* 1412 */                      if (io1ii1oo1io.I001i1O0Ol(obj, i3, i5, i4, i)) {
/* 1414 */                          int i9 = unsafe.getInt(obj, j);
/* 1420 */                          il1O00loO1 il1o00loo1 = (il1O00loO1) i11i1ili.I00iiI;
/* 1424 */                          il1o00loo1.I000OiO(i6 << 3);
/* 1427 */                          if (i9 >= 0) {
/* 1429 */                              il1o00loo1.I000OiO(i9);
                                        break;
                                    } else {
/* 1435 */                              il1o00loo1.I000l1(i9);
                                        break;
                                    }
                                }
                                break;
                            case 5:
/* 1392 */                      if (io1ii1oo1io.I001i1O0Ol(obj, i3, i5, i4, i)) {
/* 1402 */                          ((il1O00loO1) i11i1ili.I00iiI).I0001Ioi1lo(i6, unsafe.getLong(obj, j));
                                    break;
                                }
                                break;
                            case 6:
/* 1372 */                      if (io1ii1oo1io.I001i1O0Ol(obj, i3, i5, i4, i)) {
/* 1382 */                          ((il1O00loO1) i11i1ili.I00iiI).I0000O(i6, unsafe.getInt(obj, j));
                                    break;
                                }
                                break;
                            case 7:
/* 1345 */                      if (io1ii1oo1io.I001i1O0Ol(obj, i3, i5, i4, i)) {
/* 1349 */                          boolean zI00Io1o110i = l00iIli.I0000Il00O.I00Io1o110i(obj, j);
/* 1355 */                          il1O00loO1 il1o00loo12 = (il1O00loO1) i11i1ili.I00iiI;
/* 1359 */                          il1o00loo12.I000OiO(i6 << 3);
/* 1362 */                          il1o00loo12.I00000oIO(zI00Io1o110i ? (byte) 1 : (byte) 0);
                                    break;
                                }
                                break;
                            case 8:
/* 1308 */                      if (io1ii1oo1io.I001i1O0Ol(obj, i3, i5, i4, i)) {
/* 1310 */                          Object object = unsafe.getObject(obj, j);
/* 1316 */                          if (object instanceof String) {
/* 1324 */                              ((il1O00loO1) i11i1ili.I00iiI).I000O01llI0(i6, (String) object);
                                        break;
                                    } else {
/* 1335 */                              ((il1O00loO1) i11i1ili.I00iiI).I0000Il00O(i6, (iiooOi11li) object);
                                        break;
                                    }
                                }
                                break;
                            case 9:
/* 1288 */                      if (io1ii1oo1io.I001i1O0Ol(obj, i3, i5, i4, i)) {
/* 1298 */                          i11i1ili.I000O01llI0(i6, unsafe.getObject(obj, j), io1ii1oo1io.I00IOO(i3));
                                } else {
                                    continue;
                                }
/* 1530 */                      i3 += 3;
/* 1532 */                      i2 = 1048575;
                            case 10:
/* 1266 */                      if (io1ii1oo1io.I001i1O0Ol(obj, i3, i5, i4, i)) {
/* 1278 */                          ((il1O00loO1) i11i1ili.I00iiI).I0000Il00O(i6, (iiooOi11li) unsafe.getObject(obj, j));
                                    break;
                                }
                                break;
                            case 11:
/* 1242 */                      if (io1ii1oo1io.I001i1O0Ol(obj, i3, i5, i4, i)) {
/* 1244 */                          int i10 = unsafe.getInt(obj, j);
/* 1250 */                          il1O00loO1 il1o00loo13 = (il1O00loO1) i11i1ili.I00iiI;
/* 1254 */                          il1o00loo13.I000OiO(i6 << 3);
/* 1257 */                          il1o00loo13.I000OiO(i10);
                                    break;
                                }
                                break;
                            case 12:
/* 1211 */                      if (io1ii1oo1io.I001i1O0Ol(obj, i3, i5, i4, i)) {
/* 1213 */                          int i11 = unsafe.getInt(obj, j);
/* 1219 */                          il1O00loO1 il1o00loo14 = (il1O00loO1) i11i1ili.I00iiI;
/* 1223 */                          il1o00loo14.I000OiO(i6 << 3);
/* 1226 */                          if (i11 >= 0) {
/* 1228 */                              il1o00loo14.I000OiO(i11);
                                        break;
                                    } else {
/* 1233 */                              il1o00loo14.I000l1(i11);
                                        break;
                                    }
                                }
                                break;
                            case 13:
/* 1192 */                      if (io1ii1oo1io.I001i1O0Ol(obj, i3, i5, i4, i)) {
/* 1202 */                          ((il1O00loO1) i11i1ili.I00iiI).I0000O(i6, unsafe.getInt(obj, j));
                                    break;
                                }
                                break;
                            case 14:
/* 1173 */                      if (io1ii1oo1io.I001i1O0Ol(obj, i3, i5, i4, i)) {
/* 1183 */                          ((il1O00loO1) i11i1ili.I00iiI).I0001Ioi1lo(i6, unsafe.getLong(obj, j));
                                    break;
                                }
                                break;
                            case 15:
/* 1144 */                      if (io1ii1oo1io.I001i1O0Ol(obj, i3, i5, i4, i)) {
/* 1146 */                          int i12 = unsafe.getInt(obj, j);
/* 1157 */                          il1O00loO1 il1o00loo15 = (il1O00loO1) i11i1ili.I00iiI;
/* 1161 */                          il1o00loo15.I000OiO(i6 << 3);
/* 1164 */                          il1o00loo15.I000OiO((i12 >> 31) ^ (i12 + i12));
                                    break;
                                }
                                break;
                            case 16:
/* 1117 */                      if (io1ii1oo1io.I001i1O0Ol(obj, i3, i5, i4, i)) {
/* 1119 */                          long j2 = unsafe.getLong(obj, j);
/* 1132 */                          ((il1O00loO1) i11i1ili.I00iiI).I000iOII(i6, (j2 >> 63) ^ (j2 + j2));
                                    break;
                                }
                                break;
                            case 17:
/* 1097 */                      if (io1ii1oo1io.I001i1O0Ol(obj, i3, i5, i4, i)) {
/* 1107 */                          i11i1ili.I0001Ioi1lo(i6, unsafe.getObject(obj, j), io1ii1oo1io.I00IOO(i3));
                                } else {
                                    continue;
                                }
/* 1530 */                      i3 += 3;
/* 1532 */                      i2 = 1048575;
                            case PoseLandmark.RIGHT_PINKY:
/* 1087 */                      ioOi0IO.I00111O(iArr[i3], (List) unsafe.getObject(obj, j), i11i1ili, false);
                                continue;
/* 1530 */                      i3 += 3;
/* 1532 */                      i2 = 1048575;
                            case PoseLandmark.LEFT_INDEX:
/* 1074 */                      ioOi0IO.I001i1lo1io(iArr[i3], (List) unsafe.getObject(obj, j), i11i1ili, false);
                                continue;
/* 1530 */                      i3 += 3;
/* 1532 */                      i2 = 1048575;
                            case PoseLandmark.RIGHT_INDEX:
/* 1061 */                      ioOi0IO.I001l0I00(iArr[i3], (List) unsafe.getObject(obj, j), i11i1ili, false);
                                continue;
/* 1530 */                      i3 += 3;
/* 1532 */                      i2 = 1048575;
                            case PoseLandmark.LEFT_THUMB:
/* 1048 */                      ioOi0IO.I0001Ioi1lo(iArr[i3], (List) unsafe.getObject(obj, j), i11i1ili, false);
                                continue;
/* 1530 */                      i3 += 3;
/* 1532 */                      i2 = 1048575;
                            case PoseLandmark.RIGHT_THUMB:
/* 1035 */                      ioOi0IO.I001iOo1i0O(iArr[i3], (List) unsafe.getObject(obj, j), i11i1ili, false);
                                continue;
/* 1530 */                      i3 += 3;
/* 1532 */                      i2 = 1048575;
                            case PoseLandmark.LEFT_HIP:
/* 1022 */                      ioOi0IO.I001i1O0Ol(iArr[i3], (List) unsafe.getObject(obj, j), i11i1ili, false);
                                continue;
/* 1530 */                      i3 += 3;
/* 1532 */                      i2 = 1048575;
                            case PoseLandmark.RIGHT_HIP:
/* 1009 */                      ioOi0IO.I001IO000(iArr[i3], (List) unsafe.getObject(obj, j), i11i1ili, false);
                                continue;
/* 1530 */                      i3 += 3;
/* 1532 */                      i2 = 1048575;
                            case PoseLandmark.LEFT_KNEE:
/* 996 */                       ioOi0IO.I0010o(iArr[i3], (List) unsafe.getObject(obj, j), i11i1ili, false);
                                continue;
/* 1530 */                      i3 += 3;
/* 1532 */                      i2 = 1048575;
                            case PoseLandmark.RIGHT_KNEE:
/* 911 */                       int i13 = iArr[i3];
/* 917 */                       List list = (List) unsafe.getObject(obj, j);
/* 919 */                       Class cls = ioOi0IO.I00000oIO;
/* 921 */                       if (list == null) {
                                    continue;
                                } else if (!list.isEmpty()) {
/* 931 */                           il1O00loO1 il1o00loo16 = (il1O00loO1) i11i1ili.I00iiI;
/* 935 */                           if (list instanceof illlOI) {
/* 938 */                               illlOI illloi = (illlOI) list;
/* 945 */                               for (int i14 = 0; i14 < list.size(); i14++) {
/* 947 */                                   Object objZzf = illloi.zzf(i14);
/* 953 */                                   if (objZzf instanceof String) {
/* 957 */                                       il1o00loo16.I000O01llI0(i13, (String) objZzf);
                                            } else {
/* 963 */                                       il1o00loo16.I0000Il00O(i13, (iiooOi11li) objZzf);
                                            }
                                        }
                                    } else {
/* 974 */                               for (int i15 = 0; i15 < list.size(); i15++) {
/* 982 */                                   il1o00loo16.I000O01llI0(i13, (String) list.get(i15));
                                        }
                                    }
                                }
/* 1530 */                      i3 += 3;
/* 1532 */                      i2 = 1048575;
                            case 27:
/* 872 */                       int i16 = iArr[i3];
/* 878 */                       List list2 = (List) unsafe.getObject(obj, j);
/* 880 */                       ioO0I1oi1lio ioo0i1oi1lioI00IOO = io1ii1oo1io.I00IOO(i3);
/* 884 */                       Class cls2 = ioOi0IO.I00000oIO;
/* 886 */                       if (list2 == null) {
                                    continue;
                                } else if (!list2.isEmpty()) {
/* 899 */                           for (int i17 = 0; i17 < list2.size(); i17++) {
/* 905 */                               i11i1ili.I000O01llI0(i16, list2.get(i17), ioo0i1oi1lioI00IOO);
                                    }
                                }
/* 1530 */                      i3 += 3;
/* 1532 */                      i2 = 1048575;
                            case PoseLandmark.RIGHT_ANKLE:
/* 828 */                       int i18 = iArr[i3];
/* 834 */                       List list3 = (List) unsafe.getObject(obj, j);
/* 836 */                       Class cls3 = ioOi0IO.I00000oIO;
/* 838 */                       if (list3 == null) {
                                    continue;
                                } else if (!list3.isEmpty()) {
/* 846 */                           i11i1ili.getClass();
/* 854 */                           for (int i19 = 0; i19 < list3.size(); i19++) {
/* 866 */                               ((il1O00loO1) i11i1ili.I00iiI).I0000Il00O(i18, (iiooOi11li) list3.get(i19));
                                    }
                                }
/* 1530 */                      i3 += 3;
/* 1532 */                      i2 = 1048575;
                            case PoseLandmark.LEFT_HEEL:
/* 823 */                       ioOi0IO.I0000oI00(iArr[i3], (List) unsafe.getObject(obj, j), i11i1ili, false);
                                continue;
/* 1530 */                      i3 += 3;
/* 1532 */                      i2 = 1048575;
                            case 30:
/* 810 */                       ioOi0IO.I001IIilI0O(iArr[i3], (List) unsafe.getObject(obj, j), i11i1ili, false);
                                continue;
/* 1530 */                      i3 += 3;
/* 1532 */                      i2 = 1048575;
                            case PoseLandmark.LEFT_FOOT_INDEX:
/* 797 */                       ioOi0IO.I00000oIO(iArr[i3], (List) unsafe.getObject(obj, j), i11i1ili, false);
                                continue;
/* 1530 */                      i3 += 3;
/* 1532 */                      i2 = 1048575;
                            case 32:
/* 784 */                       ioOi0IO.I00000oOI(iArr[i3], (List) unsafe.getObject(obj, j), i11i1ili, false);
                                continue;
/* 1530 */                      i3 += 3;
/* 1532 */                      i2 = 1048575;
                            case 33:
/* 771 */                       ioOi0IO.I0000Il00O(iArr[i3], (List) unsafe.getObject(obj, j), i11i1ili, false);
                                continue;
/* 1530 */                      i3 += 3;
/* 1532 */                      i2 = 1048575;
                            case 34:
/* 758 */                       ioOi0IO.I0000O(iArr[i3], (List) unsafe.getObject(obj, j), i11i1ili, false);
                                continue;
/* 1530 */                      i3 += 3;
/* 1532 */                      i2 = 1048575;
                            case InputImage.IMAGE_FORMAT_YUV_420_888:
/* 745 */                       ioOi0IO.I00111O(iArr[i3], (List) unsafe.getObject(obj, j), i11i1ili, true);
                                continue;
/* 1530 */                      i3 += 3;
/* 1532 */                      i2 = 1048575;
                            case 36:
/* 732 */                       ioOi0IO.I001i1lo1io(iArr[i3], (List) unsafe.getObject(obj, j), i11i1ili, true);
                                continue;
/* 1530 */                      i3 += 3;
/* 1532 */                      i2 = 1048575;
                            case 37:
/* 719 */                       ioOi0IO.I001l0I00(iArr[i3], (List) unsafe.getObject(obj, j), i11i1ili, true);
                                continue;
/* 1530 */                      i3 += 3;
/* 1532 */                      i2 = 1048575;
                            case 38:
/* 706 */                       ioOi0IO.I0001Ioi1lo(iArr[i3], (List) unsafe.getObject(obj, j), i11i1ili, true);
                                continue;
/* 1530 */                      i3 += 3;
/* 1532 */                      i2 = 1048575;
                            case 39:
/* 693 */                       ioOi0IO.I001iOo1i0O(iArr[i3], (List) unsafe.getObject(obj, j), i11i1ili, true);
                                continue;
/* 1530 */                      i3 += 3;
/* 1532 */                      i2 = 1048575;
                            case 40:
/* 680 */                       ioOi0IO.I001i1O0Ol(iArr[i3], (List) unsafe.getObject(obj, j), i11i1ili, true);
                                continue;
/* 1530 */                      i3 += 3;
/* 1532 */                      i2 = 1048575;
                            case 41:
/* 667 */                       ioOi0IO.I001IO000(iArr[i3], (List) unsafe.getObject(obj, j), i11i1ili, true);
                                continue;
/* 1530 */                      i3 += 3;
/* 1532 */                      i2 = 1048575;
                            case 42:
/* 654 */                       ioOi0IO.I0010o(iArr[i3], (List) unsafe.getObject(obj, j), i11i1ili, true);
                                continue;
/* 1530 */                      i3 += 3;
/* 1532 */                      i2 = 1048575;
                            case 43:
/* 641 */                       ioOi0IO.I0000oI00(iArr[i3], (List) unsafe.getObject(obj, j), i11i1ili, true);
                                continue;
/* 1530 */                      i3 += 3;
/* 1532 */                      i2 = 1048575;
                            case 44:
/* 628 */                       ioOi0IO.I001IIilI0O(iArr[i3], (List) unsafe.getObject(obj, j), i11i1ili, true);
                                continue;
/* 1530 */                      i3 += 3;
/* 1532 */                      i2 = 1048575;
                            case BuildConfig.VERSION_CODE:
/* 615 */                       ioOi0IO.I00000oIO(iArr[i3], (List) unsafe.getObject(obj, j), i11i1ili, true);
                                continue;
/* 1530 */                      i3 += 3;
/* 1532 */                      i2 = 1048575;
                            case 46:
/* 602 */                       ioOi0IO.I00000oOI(iArr[i3], (List) unsafe.getObject(obj, j), i11i1ili, true);
                                continue;
/* 1530 */                      i3 += 3;
/* 1532 */                      i2 = 1048575;
                            case 47:
/* 589 */                       ioOi0IO.I0000Il00O(iArr[i3], (List) unsafe.getObject(obj, j), i11i1ili, true);
                                continue;
/* 1530 */                      i3 += 3;
/* 1532 */                      i2 = 1048575;
                            case 48:
/* 576 */                       ioOi0IO.I0000O(iArr[i3], (List) unsafe.getObject(obj, j), i11i1ili, true);
                                continue;
/* 1530 */                      i3 += 3;
/* 1532 */                      i2 = 1048575;
                            case 49:
/* 529 */                       int i20 = iArr[i3];
/* 535 */                       List list4 = (List) unsafe.getObject(obj, j);
/* 537 */                       ioO0I1oi1lio ioo0i1oi1lioI00IOO2 = io1ii1oo1io.I00IOO(i3);
/* 541 */                       Class cls4 = ioOi0IO.I00000oIO;
/* 543 */                       if (list4 == null) {
                                    continue;
                                } else if (!list4.isEmpty()) {
/* 556 */                           for (int i21 = 0; i21 < list4.size(); i21++) {
/* 562 */                               i11i1ili.I0001Ioi1lo(i20, list4.get(i21), ioo0i1oi1lioI00IOO2);
                                    }
                                }
/* 1530 */                      i3 += 3;
/* 1532 */                      i2 = 1048575;
                            case 50:
/* 514 */                       if (unsafe.getObject(obj, j) != null) {
/* 522 */                           io1ii1oo1io.I00IlilI0i0i(i3).getClass();
/* 525 */                           OIiilo1Ool0o.I00000oIO();
/* 528 */                           return;
                                } else {
                                    continue;
/* 1530 */                          i3 += 3;
/* 1532 */                          i2 = 1048575;
                                }
                            case 51:
/* 485 */                       if (io1ii1oo1io.I001iOo1i0O(obj, i6, i3)) {
/* 505 */                           ((il1O00loO1) i11i1ili.I00iiI).I0001Ioi1lo(i6, Double.doubleToRawLongBits(((Double) l00iIli.I000II(obj, j)).doubleValue()));
                                } else {
                                    continue;
                                }
/* 1530 */                      i3 += 3;
/* 1532 */                      i2 = 1048575;
                            case 52:
/* 456 */                       if (io1ii1oo1io.I001iOo1i0O(obj, i6, i3)) {
/* 476 */                           ((il1O00loO1) i11i1ili.I00iiI).I0000O(i6, Float.floatToRawIntBits(((Float) l00iIli.I000II(obj, j)).floatValue()));
                                } else {
                                    continue;
                                }
/* 1530 */                      i3 += 3;
/* 1532 */                      i2 = 1048575;
                            case 53:
/* 437 */                       if (io1ii1oo1io.I001iOo1i0O(obj, i6, i3)) {
/* 447 */                           ((il1O00loO1) i11i1ili.I00iiI).I000iOII(i6, I00IO1(j, obj));
                                } else {
                                    continue;
                                }
/* 1530 */                      i3 += 3;
/* 1532 */                      i2 = 1048575;
                            case 54:
/* 418 */                       if (io1ii1oo1io.I001iOo1i0O(obj, i6, i3)) {
/* 428 */                           ((il1O00loO1) i11i1ili.I00iiI).I000iOII(i6, I00IO1(j, obj));
                                } else {
                                    continue;
                                }
/* 1530 */                      i3 += 3;
/* 1532 */                      i2 = 1048575;
                            case 55:
/* 386 */                       if (io1ii1oo1io.I001iOo1i0O(obj, i6, i3)) {
/* 388 */                           int iI001lllioOl = I001lllioOl(j, obj);
/* 394 */                           il1O00loO1 il1o00loo17 = (il1O00loO1) i11i1ili.I00iiI;
/* 398 */                           il1o00loo17.I000OiO(i6 << 3);
/* 401 */                           if (iI001lllioOl >= 0) {
/* 403 */                               il1o00loo17.I000OiO(iI001lllioOl);
                                    } else {
/* 409 */                               il1o00loo17.I000l1(iI001lllioOl);
                                    }
                                } else {
                                    continue;
                                }
/* 1530 */                      i3 += 3;
/* 1532 */                      i2 = 1048575;
                            case 56:
/* 367 */                       if (io1ii1oo1io.I001iOo1i0O(obj, i6, i3)) {
/* 377 */                           ((il1O00loO1) i11i1ili.I00iiI).I0001Ioi1lo(i6, I00IO1(j, obj));
                                } else {
                                    continue;
                                }
/* 1530 */                      i3 += 3;
/* 1532 */                      i2 = 1048575;
                            case 57:
/* 348 */                       if (io1ii1oo1io.I001iOo1i0O(obj, i6, i3)) {
/* 358 */                           ((il1O00loO1) i11i1ili.I00iiI).I0000O(i6, I001lllioOl(j, obj));
                                } else {
                                    continue;
                                }
/* 1530 */                      i3 += 3;
/* 1532 */                      i2 = 1048575;
                            case 58:
/* 318 */                       if (io1ii1oo1io.I001iOo1i0O(obj, i6, i3)) {
/* 326 */                           boolean zBooleanValue = ((Boolean) l00iIli.I000II(obj, j)).booleanValue();
/* 332 */                           il1O00loO1 il1o00loo18 = (il1O00loO1) i11i1ili.I00iiI;
/* 336 */                           il1o00loo18.I000OiO(i6 << 3);
/* 339 */                           il1o00loo18.I00000oIO(zBooleanValue ? (byte) 1 : (byte) 0);
                                } else {
                                    continue;
                                }
/* 1530 */                      i3 += 3;
/* 1532 */                      i2 = 1048575;
                            case 59:
/* 282 */                       if (io1ii1oo1io.I001iOo1i0O(obj, i6, i3)) {
/* 284 */                           Object object2 = unsafe.getObject(obj, j);
/* 290 */                           if (object2 instanceof String) {
/* 298 */                               ((il1O00loO1) i11i1ili.I00iiI).I000O01llI0(i6, (String) object2);
                                    } else {
/* 309 */                               ((il1O00loO1) i11i1ili.I00iiI).I0000Il00O(i6, (iiooOi11li) object2);
                                    }
                                } else {
                                    continue;
                                }
/* 1530 */                      i3 += 3;
/* 1532 */                      i2 = 1048575;
                            case 60:
/* 263 */                       if (io1ii1oo1io.I001iOo1i0O(obj, i6, i3)) {
/* 273 */                           i11i1ili.I000O01llI0(i6, unsafe.getObject(obj, j), io1ii1oo1io.I00IOO(i3));
                                } else {
                                    continue;
                                }
/* 1530 */                      i3 += 3;
/* 1532 */                      i2 = 1048575;
                            case 61:
/* 242 */                       if (io1ii1oo1io.I001iOo1i0O(obj, i6, i3)) {
/* 254 */                           ((il1O00loO1) i11i1ili.I00iiI).I0000Il00O(i6, (iiooOi11li) unsafe.getObject(obj, j));
                                } else {
                                    continue;
                                }
/* 1530 */                      i3 += 3;
/* 1532 */                      i2 = 1048575;
                            case 62:
/* 218 */                       if (io1ii1oo1io.I001iOo1i0O(obj, i6, i3)) {
/* 220 */                           int iI001lllioOl2 = I001lllioOl(j, obj);
/* 226 */                           il1O00loO1 il1o00loo19 = (il1O00loO1) i11i1ili.I00iiI;
/* 230 */                           il1o00loo19.I000OiO(i6 << 3);
/* 233 */                           il1o00loo19.I000OiO(iI001lllioOl2);
                                } else {
                                    continue;
                                }
/* 1530 */                      i3 += 3;
/* 1532 */                      i2 = 1048575;
                            case 63:
/* 186 */                       if (io1ii1oo1io.I001iOo1i0O(obj, i6, i3)) {
/* 188 */                           int iI001lllioOl3 = I001lllioOl(j, obj);
/* 194 */                           il1O00loO1 il1o00loo110 = (il1O00loO1) i11i1ili.I00iiI;
/* 198 */                           il1o00loo110.I000OiO(i6 << 3);
/* 201 */                           if (iI001lllioOl3 >= 0) {
/* 203 */                               il1o00loo110.I000OiO(iI001lllioOl3);
                                    } else {
/* 209 */                               il1o00loo110.I000l1(iI001lllioOl3);
                                    }
                                } else {
                                    continue;
                                }
/* 1530 */                      i3 += 3;
/* 1532 */                      i2 = 1048575;
                            case Barcode.FORMAT_EAN_8:
/* 167 */                       if (io1ii1oo1io.I001iOo1i0O(obj, i6, i3)) {
/* 177 */                           ((il1O00loO1) i11i1ili.I00iiI).I0000O(i6, I001lllioOl(j, obj));
                                } else {
                                    continue;
                                }
/* 1530 */                      i3 += 3;
/* 1532 */                      i2 = 1048575;
                            case 65:
/* 148 */                       if (io1ii1oo1io.I001iOo1i0O(obj, i6, i3)) {
/* 158 */                           ((il1O00loO1) i11i1ili.I00iiI).I0001Ioi1lo(i6, I00IO1(j, obj));
                                } else {
                                    continue;
                                }
/* 1530 */                      i3 += 3;
/* 1532 */                      i2 = 1048575;
                            case 66:
/* 119 */                       if (io1ii1oo1io.I001iOo1i0O(obj, i6, i3)) {
/* 121 */                           int iI001lllioOl4 = I001lllioOl(j, obj);
/* 132 */                           il1O00loO1 il1o00loo111 = (il1O00loO1) i11i1ili.I00iiI;
/* 136 */                           il1o00loo111.I000OiO(i6 << 3);
/* 139 */                           il1o00loo111.I000OiO((iI001lllioOl4 >> 31) ^ (iI001lllioOl4 + iI001lllioOl4));
                                } else {
                                    continue;
                                }
/* 1530 */                      i3 += 3;
/* 1532 */                      i2 = 1048575;
                            case 67:
/* 95 */                        if (io1ii1oo1io.I001iOo1i0O(obj, i6, i3)) {
/* 97 */                            long jI00IO1 = I00IO1(j, obj);
/* 110 */                           ((il1O00loO1) i11i1ili.I00iiI).I000iOII(i6, (jI00IO1 >> 63) ^ (jI00IO1 + jI00IO1));
                                } else {
                                    continue;
                                }
/* 1530 */                      i3 += 3;
/* 1532 */                      i2 = 1048575;
                            case 68:
/* 76 */                        if (io1ii1oo1io.I001iOo1i0O(obj, i6, i3)) {
/* 86 */                            i11i1ili.I0001Ioi1lo(i6, unsafe.getObject(obj, j), io1ii1oo1io.I00IOO(i3));
                                } else {
                                    continue;
                                }
/* 1530 */                      i3 += 3;
/* 1532 */                      i2 = 1048575;
                            default:
/* 1530 */                      i3 += 3;
/* 1532 */                      i2 = 1048575;
                        }
/* 1135 */              io1ii1oo1io = this;
/* 1530 */              i3 += 3;
/* 1532 */              i2 = 1048575;
                    }
/* 1539 */          io1ii1oo1io.I000iOII.getClass();
/* 1547 */          ((ilOl10) obj).zzc.I0000O(i11i1ili);
                }

                /* JADX WARN: Removed duplicated region for block: B:147:0x0363  */
                /* JADX WARN: Removed duplicated region for block: B:200:0x04ae  */
                /* JADX WARN: Removed duplicated region for block: B:233:0x05a4  */
                /* JADX WARN: Removed duplicated region for block: B:236:0x05b3 A[PHI: r7
                  0x05b3: PHI (r7v9 int) = (r7v1 int), (r7v5 int), (r7v10 int) binds: [B:275:0x06b5, B:260:0x065c, B:235:0x05b1] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:35:0x00b1  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int I000II(iilO1O iilo1o) {
                    int i;
                    int i2;
                    int iI000o00OoI0I;
                    int iI000oI1ioi;
                    int iI000o00OoI0I2;
                    int iI0000oI00;
                    int iI000o00OoI0I3;
                    int iI00000oIO;
                    int i3;
                    int iI000o00OoI0I4;
                    int i4;
                    int iI00000oIO2;
                    int iI000OiO;
                    int size;
                    int iI00100l0;
                    int iI000o00OoI0I5;
                    int iI000o00OoI0I6;
                    int iI000o00OoI0I7;
                    int iI000o00OoI0I8;
                    int size2;
                    int iI000o00OoI0I9;
                    int size3;
                    int iI000o00OoI0I10;
                    int iI00000oIO3;
                    int iI000o00OoI0I11;
                    int iI000oI1ioi2;
                    int iI000o00OoI0I12;
                    int iI0000oI002;
                    int iI001lllioOl;
/* 1 */             io1ii1oO1iO io1ii1oo1io = this;
/* 3 */             iilO1O iilo1o2 = iilo1o;
/* 5 */             int[] iArr = io1ii1oo1io.I00000oIO;
/* 7 */             int i5 = 1048575;
/* 10 */            int i6 = 1048575;
/* 11 */            int i7 = 0;
/* 12 */            int i8 = 0;
/* 13 */            int iI0000O = 0;
/* 15 */            while (i7 < iArr.length) {
/* 17 */                int iI00II0oii1o = io1ii1oo1io.I00II0oii1o(i7);
/* 21 */                int iI00II0Ol1O0l = I00II0Ol1O0l(iI00II0oii1o);
/* 27 */                int i9 = iArr[i7];
/* 29 */                int i10 = iArr[i7 + 2];
/* 31 */                int i11 = i10 & i5;
/* 38 */                Unsafe unsafe = I000lI;
/* 40 */                if (iI00II0Ol1O0l <= 17) {
/* 42 */                    if (i11 != i6) {
/* 50 */                        i8 = i11 == i5 ? 0 : unsafe.getInt(iilo1o2, i11);
/* 55 */                        i6 = i11;
                            }
/* 58 */                    i = 1 << (i10 >>> 20);
                        } else {
/* 61 */                    i = 0;
                        }
/* 63 */                int i12 = iI00II0oii1o & i5;
/* 68 */                if (iI00II0Ol1O0l >= ilIooi1Ii.I00iiI.I00iOIl) {
/* 72 */                    int i13 = ilIooi1Ii.I00iiO.I00iOIl;
                        }
                        long j = i12;
/* 77 */                int iI000o00OoI0I13 = 4;
                        switch (iI00II0Ol1O0l) {
                            case 0:
/* 1727 */                      if (io1ii1oo1io.I001i1O0Ol(iilo1o2, i7, i6, i8, i)) {
/* 1731 */                          iI0000O = io1OllI.I0000O(i9 << 3, 8, iI0000O);
                                }
/* 1735 */                      i7 += 3;
/* 1737 */                      iilo1o2 = iilo1o;
/* 1739 */                      i5 = 1048575;
                            case 1:
/* 1712 */                      i2 = 4;
/* 1718 */                      if (io1ii1oo1io.I001i1O0Ol(iilo1o2, i7, i6, i8, i)) {
/* 1462 */                          iI0000O = io1OllI.I0000O(i9 << 3, i2, iI0000O);
                                }
/* 1407 */                      io1ii1oo1io = this;
/* 1735 */                      i7 += 3;
/* 1737 */                      iilo1o2 = iilo1o;
/* 1739 */                      i5 = 1048575;
                            case 2:
/* 1694 */                      if (io1ii1oo1io.I001i1O0Ol(iilo1o2, i7, i6, i8, i)) {
/* 1698 */                          long j2 = unsafe.getLong(iilo1o2, j);
/* 1702 */                          iI000o00OoI0I = il1O00loO1.I000o00OoI0I(i9 << 3);
/* 1706 */                          iI000oI1ioi = il1O00loO1.I000oI1ioi(j2);
/* 1406 */                          iI0000O += iI000oI1ioi + iI000o00OoI0I;
                                }
/* 1407 */                      io1ii1oo1io = this;
/* 1735 */                      i7 += 3;
/* 1737 */                      iilo1o2 = iilo1o;
/* 1739 */                      i5 = 1048575;
                            case 3:
/* 1671 */                      if (io1ii1oo1io.I001i1O0Ol(iilo1o2, i7, i6, i8, i)) {
/* 1675 */                          long j3 = unsafe.getLong(iilo1o2, j);
/* 1679 */                          iI000o00OoI0I = il1O00loO1.I000o00OoI0I(i9 << 3);
/* 1683 */                          iI000oI1ioi = il1O00loO1.I000oI1ioi(j3);
/* 1406 */                          iI0000O += iI000oI1ioi + iI000o00OoI0I;
                                }
/* 1407 */                      io1ii1oo1io = this;
/* 1735 */                      i7 += 3;
/* 1737 */                      iilo1o2 = iilo1o;
/* 1739 */                      i5 = 1048575;
                            case 4:
/* 1647 */                      if (io1ii1oo1io.I001i1O0Ol(iilo1o2, i7, i6, i8, i)) {
/* 1651 */                          long j4 = unsafe.getInt(iilo1o2, j);
/* 1656 */                          iI000o00OoI0I = il1O00loO1.I000o00OoI0I(i9 << 3);
/* 1660 */                          iI000oI1ioi = il1O00loO1.I000oI1ioi(j4);
/* 1406 */                          iI0000O += iI000oI1ioi + iI000o00OoI0I;
                                }
/* 1407 */                      io1ii1oo1io = this;
/* 1735 */                      i7 += 3;
/* 1737 */                      iilo1o2 = iilo1o;
/* 1739 */                      i5 = 1048575;
                            case 5:
/* 1638 */                      if (io1ii1oo1io.I001i1O0Ol(iilo1o2, i7, i6, i8, i)) {
/* 1447 */                          iI0000O = io1OllI.I0000O(i9 << 3, 8, iI0000O);
                                }
/* 1407 */                      io1ii1oo1io = this;
/* 1735 */                      i7 += 3;
/* 1737 */                      iilo1o2 = iilo1o;
/* 1739 */                      i5 = 1048575;
                            case 6:
/* 1623 */                      i2 = 4;
/* 1629 */                      if (io1ii1oo1io.I001i1O0Ol(iilo1o2, i7, i6, i8, i)) {
                                }
/* 1407 */                      io1ii1oo1io = this;
/* 1735 */                      i7 += 3;
/* 1737 */                      iilo1o2 = iilo1o;
/* 1739 */                      i5 = 1048575;
                                break;
                            case 7:
/* 1613 */                      if (io1ii1oo1io.I001i1O0Ol(iilo1o2, i7, i6, i8, i)) {
/* 1617 */                          iI0000O = io1OllI.I0000O(i9 << 3, 1, iI0000O);
                                }
/* 1407 */                      io1ii1oo1io = this;
/* 1735 */                      i7 += 3;
/* 1737 */                      iilo1o2 = iilo1o;
/* 1739 */                      i5 = 1048575;
                            case 8:
/* 1573 */                      if (io1ii1oo1io.I001i1O0Ol(iilo1o2, i7, i6, i8, i)) {
/* 1575 */                          int i14 = i9 << 3;
/* 1577 */                          Object object = unsafe.getObject(iilo1o2, j);
/* 1583 */                          if (object instanceof iiooOi11li) {
/* 1587 */                              iI000o00OoI0I2 = il1O00loO1.I000o00OoI0I(i14);
/* 1591 */                              iI0000oI00 = ((iiooOi11li) object).I0000oI00();
/* 1531 */                              iI0000O = io1OllI.I0000oI00(iI0000oI00, iI0000oI00, iI000o00OoI0I2, iI0000O);
                                    } else {
/* 1598 */                              iI000o00OoI0I = il1O00loO1.I000o00OoI0I(i14);
/* 1602 */                              iI000oI1ioi = il1O00loO1.I000lI((String) object);
/* 1406 */                              iI0000O += iI000oI1ioi + iI000o00OoI0I;
                                    }
                                }
/* 1407 */                      io1ii1oo1io = this;
/* 1735 */                      i7 += 3;
/* 1737 */                      iilo1o2 = iilo1o;
/* 1739 */                      i5 = 1048575;
                            case 9:
/* 1542 */                      if (io1ii1oo1io.I001i1O0Ol(iilo1o2, i7, i6, i8, i)) {
/* 1544 */                          Object object2 = unsafe.getObject(iilo1o2, j);
/* 1548 */                          ioO0I1oi1lio ioo0i1oi1lioI00IOO = io1ii1oo1io.I00IOO(i7);
/* 1552 */                          Class cls = ioOi0IO.I00000oIO;
/* 1558 */                          iI000o00OoI0I3 = il1O00loO1.I000o00OoI0I(i9 << 3);
/* 1562 */                          iI00000oIO = ((iilO1O) object2).I00000oIO(ioo0i1oi1lioI00IOO);
/* 290 */                           iI0000O = io1OllI.I0000oI00(iI00000oIO, iI00000oIO, iI000o00OoI0I3, iI0000O);
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                } else {
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                }
                            case 10:
/* 1513 */                      if (io1ii1oo1io.I001i1O0Ol(iilo1o2, i7, i6, i8, i)) {
/* 1521 */                          iiooOi11li iioooi11li = (iiooOi11li) unsafe.getObject(iilo1o2, j);
/* 1523 */                          iI000o00OoI0I2 = il1O00loO1.I000o00OoI0I(i9 << 3);
/* 1527 */                          iI0000oI00 = iioooi11li.I0000oI00();
/* 1531 */                          iI0000O = io1OllI.I0000oI00(iI0000oI00, iI0000oI00, iI000o00OoI0I2, iI0000O);
                                }
/* 1407 */                      io1ii1oo1io = this;
/* 1735 */                      i7 += 3;
/* 1737 */                      iilo1o2 = iilo1o;
/* 1739 */                      i5 = 1048575;
                            case 11:
/* 1495 */                      if (io1ii1oo1io.I001i1O0Ol(iilo1o2, i7, i6, i8, i)) {
/* 1499 */                          i3 = unsafe.getInt(iilo1o2, j);
/* 1503 */                          iI000o00OoI0I4 = il1O00loO1.I000o00OoI0I(i9 << 3);
/* 1433 */                          iI0000O = io1OllI.I0000O(i3, iI000o00OoI0I4, iI0000O);
                                }
/* 1407 */                      io1ii1oo1io = this;
/* 1735 */                      i7 += 3;
/* 1737 */                      iilo1o2 = iilo1o;
/* 1739 */                      i5 = 1048575;
                            case 12:
/* 1472 */                      if (io1ii1oo1io.I001i1O0Ol(iilo1o2, i7, i6, i8, i)) {
/* 1476 */                          long j5 = unsafe.getInt(iilo1o2, j);
/* 1481 */                          iI000o00OoI0I = il1O00loO1.I000o00OoI0I(i9 << 3);
/* 1485 */                          iI000oI1ioi = il1O00loO1.I000oI1ioi(j5);
/* 1406 */                          iI0000O += iI000oI1ioi + iI000o00OoI0I;
                                }
/* 1407 */                      io1ii1oo1io = this;
/* 1735 */                      i7 += 3;
/* 1737 */                      iilo1o2 = iilo1o;
/* 1739 */                      i5 = 1048575;
                            case 13:
/* 1452 */                      i2 = 4;
/* 1458 */                      if (io1ii1oo1io.I001i1O0Ol(iilo1o2, i7, i6, i8, i)) {
                                }
/* 1407 */                      io1ii1oo1io = this;
/* 1735 */                      i7 += 3;
/* 1737 */                      iilo1o2 = iilo1o;
/* 1739 */                      i5 = 1048575;
                                break;
                            case 14:
/* 1443 */                      if (io1ii1oo1io.I001i1O0Ol(iilo1o2, i7, i6, i8, i)) {
                                }
/* 1407 */                      io1ii1oo1io = this;
/* 1735 */                      i7 += 3;
/* 1737 */                      iilo1o2 = iilo1o;
/* 1739 */                      i5 = 1048575;
                                break;
                            case 15:
/* 1416 */                      if (io1ii1oo1io.I001i1O0Ol(iilo1o2, i7, i6, i8, i)) {
/* 1420 */                          int i15 = unsafe.getInt(iilo1o2, j);
/* 1428 */                          iI000o00OoI0I4 = il1O00loO1.I000o00OoI0I(i9 << 3);
/* 1432 */                          i3 = (i15 >> 31) ^ (i15 + i15);
/* 1433 */                          iI0000O = io1OllI.I0000O(i3, iI000o00OoI0I4, iI0000O);
                                }
/* 1407 */                      io1ii1oo1io = this;
/* 1735 */                      i7 += 3;
/* 1737 */                      iilo1o2 = iilo1o;
/* 1739 */                      i5 = 1048575;
                            case 16:
/* 1384 */                      if (io1ii1oo1io.I001i1O0Ol(iilo1o2, i7, i6, i8, i)) {
/* 1388 */                          long j6 = unsafe.getLong(iilo1o2, j);
/* 1396 */                          iI000o00OoI0I = il1O00loO1.I000o00OoI0I(i9 << 3);
/* 1401 */                          iI000oI1ioi = il1O00loO1.I000oI1ioi((j6 >> 63) ^ (j6 + j6));
/* 1406 */                          iI0000O += iI000oI1ioi + iI000o00OoI0I;
                                }
/* 1407 */                      io1ii1oo1io = this;
/* 1735 */                      i7 += 3;
/* 1737 */                      iilo1o2 = iilo1o;
/* 1739 */                      i5 = 1048575;
                            case 17:
/* 1354 */                      if (io1ii1oo1io.I001i1O0Ol(iilo1o2, i7, i6, i8, i)) {
/* 1360 */                          iilO1O iilo1o3 = (iilO1O) unsafe.getObject(iilo1o2, j);
/* 1362 */                          ioO0I1oi1lio ioo0i1oi1lioI00IOO2 = io1ii1oo1io.I00IOO(i7);
/* 1368 */                          int iI000o00OoI0I14 = il1O00loO1.I000o00OoI0I(i9 << 3);
/* 1372 */                          i4 = iI000o00OoI0I14 + iI000o00OoI0I14;
/* 1373 */                          iI00000oIO2 = iilo1o3.I00000oIO(ioo0i1oi1lioI00IOO2);
/* 112 */                           iI000OiO = iI00000oIO2 + i4;
/* 113 */                           iI0000O += iI000OiO;
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                } else {
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                }
                            case PoseLandmark.RIGHT_PINKY:
/* 1343 */                      iI000OiO = ioOi0IO.I000OiO(i9, (List) unsafe.getObject(iilo1o2, j));
/* 113 */                       iI0000O += iI000OiO;
/* 1735 */                      i7 += 3;
/* 1737 */                      iilo1o2 = iilo1o;
/* 1739 */                      i5 = 1048575;
                            case PoseLandmark.LEFT_INDEX:
/* 1331 */                      iI000OiO = ioOi0IO.I000OOo1O(i9, (List) unsafe.getObject(iilo1o2, j));
/* 113 */                       iI0000O += iI000OiO;
/* 1735 */                      i7 += 3;
/* 1737 */                      iilo1o2 = iilo1o;
/* 1739 */                      i5 = 1048575;
                            case PoseLandmark.RIGHT_INDEX:
/* 1297 */                      List list = (List) unsafe.getObject(iilo1o2, j);
/* 1299 */                      Class cls2 = ioOi0IO.I00000oIO;
/* 1323 */                      iI000o00OoI0I6 = list.size() == 0 ? 0 : (il1O00loO1.I000o00OoI0I(i9 << 3) * list.size()) + ioOi0IO.I000l1(list);
/* 1210 */                      iI0000O += iI000o00OoI0I6;
/* 1735 */                      i7 += 3;
/* 1737 */                      iilo1o2 = iilo1o;
/* 1739 */                      i5 = 1048575;
                            case PoseLandmark.LEFT_THUMB:
/* 1269 */                      List list2 = (List) unsafe.getObject(iilo1o2, j);
/* 1271 */                      Class cls3 = ioOi0IO.I00000oIO;
/* 1273 */                      size = list2.size();
/* 1277 */                      if (size != 0) {
/* 1283 */                          iI00100l0 = ioOi0IO.I00100l0(list2);
/* 1287 */                          iI000o00OoI0I5 = il1O00loO1.I000o00OoI0I(i9 << 3);
/* 882 */                           iI000o00OoI0I7 = (iI000o00OoI0I5 * size) + iI00100l0;
/* 883 */                           iI0000O += iI000o00OoI0I7;
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                }
/* 868 */                       iI000o00OoI0I7 = 0;
/* 883 */                       iI0000O += iI000o00OoI0I7;
/* 1735 */                      i7 += 3;
/* 1737 */                      iilo1o2 = iilo1o;
/* 1739 */                      i5 = 1048575;
                            case PoseLandmark.RIGHT_THUMB:
/* 1241 */                      List list3 = (List) unsafe.getObject(iilo1o2, j);
/* 1243 */                      Class cls4 = ioOi0IO.I00000oIO;
/* 1245 */                      size = list3.size();
/* 1249 */                      if (size != 0) {
/* 1255 */                          iI00100l0 = ioOi0IO.I000iOII(list3);
/* 1259 */                          iI000o00OoI0I5 = il1O00loO1.I000o00OoI0I(i9 << 3);
/* 882 */                           iI000o00OoI0I7 = (iI000o00OoI0I5 * size) + iI00100l0;
/* 883 */                           iI0000O += iI000o00OoI0I7;
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                }
/* 868 */                       iI000o00OoI0I7 = 0;
/* 883 */                       iI0000O += iI000o00OoI0I7;
/* 1735 */                      i7 += 3;
/* 1737 */                      iilo1o2 = iilo1o;
/* 1739 */                      i5 = 1048575;
                            case PoseLandmark.LEFT_HIP:
/* 1231 */                      iI000OiO = ioOi0IO.I000OiO(i9, (List) unsafe.getObject(iilo1o2, j));
/* 113 */                       iI0000O += iI000OiO;
/* 1735 */                      i7 += 3;
/* 1737 */                      iilo1o2 = iilo1o;
/* 1739 */                      i5 = 1048575;
                            case PoseLandmark.RIGHT_HIP:
/* 1219 */                      iI000OiO = ioOi0IO.I000OOo1O(i9, (List) unsafe.getObject(iilo1o2, j));
/* 113 */                       iI0000O += iI000OiO;
/* 1735 */                      i7 += 3;
/* 1737 */                      iilo1o2 = iilo1o;
/* 1739 */                      i5 = 1048575;
                            case PoseLandmark.LEFT_KNEE:
/* 1189 */                      List list4 = (List) unsafe.getObject(iilo1o2, j);
/* 1191 */                      Class cls5 = ioOi0IO.I00000oIO;
/* 1193 */                      int size4 = list4.size();
/* 1197 */                      if (size4 != 0) {
/* 1209 */                          iI000o00OoI0I6 = (il1O00loO1.I000o00OoI0I(i9 << 3) + 1) * size4;
                                }
/* 1210 */                      iI0000O += iI000o00OoI0I6;
/* 1735 */                      i7 += 3;
/* 1737 */                      iilo1o2 = iilo1o;
/* 1739 */                      i5 = 1048575;
                                break;
                            case PoseLandmark.RIGHT_KNEE:
/* 1092 */                      List list5 = (List) unsafe.getObject(iilo1o2, j);
/* 1094 */                      Class cls6 = ioOi0IO.I00000oIO;
/* 1096 */                      int size5 = list5.size();
/* 1100 */                      if (size5 == 0) {
/* 868 */                           iI000o00OoI0I7 = 0;
                                } else {
/* 1110 */                          iI000o00OoI0I7 = il1O00loO1.I000o00OoI0I(i9 << 3) * size5;
/* 1113 */                          if (list5 instanceof illlOI) {
/* 1115 */                              illlOI illloi = (illlOI) list5;
/* 1119 */                              for (int i16 = 0; i16 < size5; i16++) {
/* 1121 */                                  Object objZzf = illloi.zzf(i16);
/* 1127 */                                  if (objZzf instanceof iiooOi11li) {
/* 1131 */                                      int iI0000oI003 = ((iiooOi11li) objZzf).I0000oI00();
/* 1135 */                                      iI000o00OoI0I7 = io1OllI.I0000O(iI0000oI003, iI0000oI003, iI000o00OoI0I7);
                                            } else {
/* 1146 */                                      iI000o00OoI0I7 = il1O00loO1.I000lI((String) objZzf) + iI000o00OoI0I7;
                                            }
                                        }
                                    } else {
/* 1153 */                              for (int i17 = 0; i17 < size5; i17++) {
/* 1155 */                                  Object obj = list5.get(i17);
/* 1161 */                                  if (obj instanceof iiooOi11li) {
/* 1165 */                                      int iI0000oI004 = ((iiooOi11li) obj).I0000oI00();
/* 1169 */                                      iI000o00OoI0I7 = io1OllI.I0000O(iI0000oI004, iI0000oI004, iI000o00OoI0I7);
                                            } else {
/* 1180 */                                      iI000o00OoI0I7 = il1O00loO1.I000lI((String) obj) + iI000o00OoI0I7;
                                            }
                                        }
                                    }
                                }
/* 883 */                       iI0000O += iI000o00OoI0I7;
/* 1735 */                      i7 += 3;
/* 1737 */                      iilo1o2 = iilo1o;
/* 1739 */                      i5 = 1048575;
                            case 27:
/* 1040 */                      List list6 = (List) unsafe.getObject(iilo1o2, j);
/* 1042 */                      ioO0I1oi1lio ioo0i1oi1lioI00IOO3 = io1ii1oo1io.I00IOO(i7);
/* 1046 */                      Class cls7 = ioOi0IO.I00000oIO;
/* 1048 */                      int size6 = list6.size();
/* 1052 */                      if (size6 == 0) {
/* 1054 */                          iI000o00OoI0I8 = 0;
                                } else {
/* 1063 */                          iI000o00OoI0I8 = il1O00loO1.I000o00OoI0I(i9 << 3) * size6;
/* 1066 */                          for (int i18 = 0; i18 < size6; i18++) {
/* 1074 */                              int iI00000oIO4 = ((iilO1O) list6.get(i18)).I00000oIO(ioo0i1oi1lioI00IOO3);
/* 1078 */                              iI000o00OoI0I8 = io1OllI.I0000O(iI00000oIO4, iI00000oIO4, iI000o00OoI0I8);
                                    }
                                }
/* 1085 */                      iI0000O += iI000o00OoI0I8;
/* 1735 */                      i7 += 3;
/* 1737 */                      iilo1o2 = iilo1o;
/* 1739 */                      i5 = 1048575;
                            case PoseLandmark.RIGHT_ANKLE:
/* 992 */                       List list7 = (List) unsafe.getObject(iilo1o2, j);
/* 994 */                       Class cls8 = ioOi0IO.I00000oIO;
/* 996 */                       int size7 = list7.size();
/* 1000 */                      if (size7 != 0) {
/* 1010 */                          iI000o00OoI0I7 = il1O00loO1.I000o00OoI0I(i9 << 3) * size7;
/* 1017 */                          for (int i19 = 0; i19 < list7.size(); i19++) {
/* 1025 */                              int iI0000oI005 = ((iiooOi11li) list7.get(i19)).I0000oI00();
/* 1029 */                              iI000o00OoI0I7 = io1OllI.I0000O(iI0000oI005, iI0000oI005, iI000o00OoI0I7);
                                    }
                                }
/* 883 */                       iI0000O += iI000o00OoI0I7;
/* 1735 */                      i7 += 3;
/* 1737 */                      iilo1o2 = iilo1o;
/* 1739 */                      i5 = 1048575;
                                break;
                            case PoseLandmark.LEFT_HEEL:
/* 966 */                       List list8 = (List) unsafe.getObject(iilo1o2, j);
/* 968 */                       Class cls9 = ioOi0IO.I00000oIO;
/* 970 */                       size = list8.size();
/* 974 */                       if (size != 0) {
/* 979 */                           iI00100l0 = ioOi0IO.I000oI1ioi(list8);
/* 983 */                           iI000o00OoI0I5 = il1O00loO1.I000o00OoI0I(i9 << 3);
/* 882 */                           iI000o00OoI0I7 = (iI000o00OoI0I5 * size) + iI00100l0;
/* 883 */                           iI0000O += iI000o00OoI0I7;
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                }
/* 868 */                       iI000o00OoI0I7 = 0;
/* 883 */                       iI0000O += iI000o00OoI0I7;
/* 1735 */                      i7 += 3;
/* 1737 */                      iilo1o2 = iilo1o;
/* 1739 */                      i5 = 1048575;
                            case 30:
/* 940 */                       List list9 = (List) unsafe.getObject(iilo1o2, j);
/* 942 */                       Class cls10 = ioOi0IO.I00000oIO;
/* 944 */                       size = list9.size();
/* 948 */                       if (size != 0) {
/* 953 */                           iI00100l0 = ioOi0IO.I000O01llI0(list9);
/* 957 */                           iI000o00OoI0I5 = il1O00loO1.I000o00OoI0I(i9 << 3);
/* 882 */                           iI000o00OoI0I7 = (iI000o00OoI0I5 * size) + iI00100l0;
/* 883 */                           iI0000O += iI000o00OoI0I7;
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                }
/* 868 */                       iI000o00OoI0I7 = 0;
/* 883 */                       iI0000O += iI000o00OoI0I7;
/* 1735 */                      i7 += 3;
/* 1737 */                      iilo1o2 = iilo1o;
/* 1739 */                      i5 = 1048575;
                            case PoseLandmark.LEFT_FOOT_INDEX:
/* 930 */                       iI000OiO = ioOi0IO.I000OOo1O(i9, (List) unsafe.getObject(iilo1o2, j));
/* 113 */                       iI0000O += iI000OiO;
/* 1735 */                      i7 += 3;
/* 1737 */                      iilo1o2 = iilo1o;
/* 1739 */                      i5 = 1048575;
                            case 32:
/* 918 */                       iI000OiO = ioOi0IO.I000OiO(i9, (List) unsafe.getObject(iilo1o2, j));
/* 113 */                       iI0000O += iI000OiO;
/* 1735 */                      i7 += 3;
/* 1737 */                      iilo1o2 = iilo1o;
/* 1739 */                      i5 = 1048575;
                            case 33:
/* 890 */                       List list10 = (List) unsafe.getObject(iilo1o2, j);
/* 892 */                       Class cls11 = ioOi0IO.I00000oIO;
/* 894 */                       size = list10.size();
/* 898 */                       if (size != 0) {
/* 903 */                           iI00100l0 = ioOi0IO.I000lI(list10);
/* 907 */                           iI000o00OoI0I5 = il1O00loO1.I000o00OoI0I(i9 << 3);
/* 882 */                           iI000o00OoI0I7 = (iI000o00OoI0I5 * size) + iI00100l0;
/* 883 */                           iI0000O += iI000o00OoI0I7;
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                }
/* 868 */                       iI000o00OoI0I7 = 0;
/* 883 */                       iI0000O += iI000o00OoI0I7;
/* 1735 */                      i7 += 3;
/* 1737 */                      iilo1o2 = iilo1o;
/* 1739 */                      i5 = 1048575;
                            case 34:
/* 858 */                       List list11 = (List) unsafe.getObject(iilo1o2, j);
/* 860 */                       Class cls12 = ioOi0IO.I00000oIO;
/* 862 */                       size = list11.size();
/* 866 */                       if (size != 0) {
/* 873 */                           iI00100l0 = ioOi0IO.I000o00OoI0I(list11);
/* 877 */                           iI000o00OoI0I5 = il1O00loO1.I000o00OoI0I(i9 << 3);
/* 882 */                           iI000o00OoI0I7 = (iI000o00OoI0I5 * size) + iI00100l0;
/* 883 */                           iI0000O += iI000o00OoI0I7;
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                }
/* 868 */                       iI000o00OoI0I7 = 0;
/* 883 */                       iI0000O += iI000o00OoI0I7;
/* 1735 */                      i7 += 3;
/* 1737 */                      iilo1o2 = iilo1o;
/* 1739 */                      i5 = 1048575;
                            case InputImage.IMAGE_FORMAT_YUV_420_888:
/* 835 */                       List list12 = (List) unsafe.getObject(iilo1o2, j);
/* 837 */                       Class cls13 = ioOi0IO.I00000oIO;
/* 843 */                       size2 = list12.size() * 8;
/* 844 */                       if (size2 > 0) {
/* 848 */                           iI000o00OoI0I9 = il1O00loO1.I000o00OoI0I(i9 << 3);
/* 569 */                           iI0000O = io1OllI.I0000oI00(size2, iI000o00OoI0I9, size2, iI0000O);
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                } else {
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                }
                            case 36:
/* 812 */                       List list13 = (List) unsafe.getObject(iilo1o2, j);
/* 814 */                       Class cls14 = ioOi0IO.I00000oIO;
/* 820 */                       size3 = list13.size() * 4;
/* 821 */                       if (size3 > 0) {
/* 825 */                           iI000o00OoI0I10 = il1O00loO1.I000o00OoI0I(i9 << 3);
/* 637 */                           iI0000O = io1OllI.I0000oI00(size3, iI000o00OoI0I10, size3, iI0000O);
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                } else {
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                }
                            case 37:
/* 794 */                       size2 = ioOi0IO.I000l1((List) unsafe.getObject(iilo1o2, j));
/* 798 */                       if (size2 > 0) {
/* 802 */                           iI000o00OoI0I9 = il1O00loO1.I000o00OoI0I(i9 << 3);
/* 569 */                           iI0000O = io1OllI.I0000oI00(size2, iI000o00OoI0I9, size2, iI0000O);
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                } else {
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                }
                            case 38:
/* 774 */                       size2 = ioOi0IO.I00100l0((List) unsafe.getObject(iilo1o2, j));
/* 778 */                       if (size2 > 0) {
/* 782 */                           iI000o00OoI0I9 = il1O00loO1.I000o00OoI0I(i9 << 3);
/* 569 */                           iI0000O = io1OllI.I0000oI00(size2, iI000o00OoI0I9, size2, iI0000O);
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                } else {
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                }
                            case 39:
/* 754 */                       size2 = ioOi0IO.I000iOII((List) unsafe.getObject(iilo1o2, j));
/* 758 */                       if (size2 > 0) {
/* 762 */                           iI000o00OoI0I9 = il1O00loO1.I000o00OoI0I(i9 << 3);
/* 569 */                           iI0000O = io1OllI.I0000oI00(size2, iI000o00OoI0I9, size2, iI0000O);
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                } else {
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                }
                            case 40:
/* 729 */                       List list14 = (List) unsafe.getObject(iilo1o2, j);
/* 731 */                       Class cls15 = ioOi0IO.I00000oIO;
/* 737 */                       size2 = list14.size() * 8;
/* 738 */                       if (size2 > 0) {
/* 742 */                           iI000o00OoI0I9 = il1O00loO1.I000o00OoI0I(i9 << 3);
/* 569 */                           iI0000O = io1OllI.I0000oI00(size2, iI000o00OoI0I9, size2, iI0000O);
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                } else {
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                }
                            case 41:
/* 707 */                       List list15 = (List) unsafe.getObject(iilo1o2, j);
/* 709 */                       Class cls16 = ioOi0IO.I00000oIO;
/* 715 */                       size3 = list15.size() * 4;
/* 716 */                       if (size3 > 0) {
/* 720 */                           iI000o00OoI0I10 = il1O00loO1.I000o00OoI0I(i9 << 3);
/* 637 */                           iI0000O = io1OllI.I0000oI00(size3, iI000o00OoI0I10, size3, iI0000O);
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                } else {
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                }
                            case 42:
/* 685 */                       List list16 = (List) unsafe.getObject(iilo1o2, j);
/* 687 */                       Class cls17 = ioOi0IO.I00000oIO;
/* 689 */                       size2 = list16.size();
/* 693 */                       if (size2 > 0) {
/* 697 */                           iI000o00OoI0I9 = il1O00loO1.I000o00OoI0I(i9 << 3);
/* 569 */                           iI0000O = io1OllI.I0000oI00(size2, iI000o00OoI0I9, size2, iI0000O);
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                } else {
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                }
                            case 43:
/* 668 */                       size2 = ioOi0IO.I000oI1ioi((List) unsafe.getObject(iilo1o2, j));
/* 672 */                       if (size2 > 0) {
/* 676 */                           iI000o00OoI0I9 = il1O00loO1.I000o00OoI0I(i9 << 3);
/* 569 */                           iI0000O = io1OllI.I0000oI00(size2, iI000o00OoI0I9, size2, iI0000O);
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                } else {
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                }
                            case 44:
/* 649 */                       size2 = ioOi0IO.I000O01llI0((List) unsafe.getObject(iilo1o2, j));
/* 653 */                       if (size2 > 0) {
/* 657 */                           iI000o00OoI0I9 = il1O00loO1.I000o00OoI0I(i9 << 3);
/* 569 */                           iI0000O = io1OllI.I0000oI00(size2, iI000o00OoI0I9, size2, iI0000O);
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                } else {
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                }
                            case BuildConfig.VERSION_CODE:
/* 620 */                       List list17 = (List) unsafe.getObject(iilo1o2, j);
/* 622 */                       Class cls18 = ioOi0IO.I00000oIO;
/* 628 */                       size3 = list17.size() * 4;
/* 629 */                       if (size3 > 0) {
/* 633 */                           iI000o00OoI0I10 = il1O00loO1.I000o00OoI0I(i9 << 3);
/* 637 */                           iI0000O = io1OllI.I0000oI00(size3, iI000o00OoI0I10, size3, iI0000O);
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                } else {
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                }
                            case 46:
/* 598 */                       List list18 = (List) unsafe.getObject(iilo1o2, j);
/* 600 */                       Class cls19 = ioOi0IO.I00000oIO;
/* 606 */                       size2 = list18.size() * 8;
/* 607 */                       if (size2 > 0) {
/* 611 */                           iI000o00OoI0I9 = il1O00loO1.I000o00OoI0I(i9 << 3);
/* 569 */                           iI0000O = io1OllI.I0000oI00(size2, iI000o00OoI0I9, size2, iI0000O);
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                } else {
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                }
                            case 47:
/* 581 */                       size2 = ioOi0IO.I000lI((List) unsafe.getObject(iilo1o2, j));
/* 585 */                       if (size2 > 0) {
/* 589 */                           iI000o00OoI0I9 = il1O00loO1.I000o00OoI0I(i9 << 3);
/* 569 */                           iI0000O = io1OllI.I0000oI00(size2, iI000o00OoI0I9, size2, iI0000O);
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                } else {
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                }
                            case 48:
/* 557 */                       size2 = ioOi0IO.I000o00OoI0I((List) unsafe.getObject(iilo1o2, j));
/* 561 */                       if (size2 > 0) {
/* 565 */                           iI000o00OoI0I9 = il1O00loO1.I000o00OoI0I(i9 << 3);
/* 569 */                           iI0000O = io1OllI.I0000oI00(size2, iI000o00OoI0I9, size2, iI0000O);
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                } else {
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                }
                            case 49:
/* 504 */                       List list19 = (List) unsafe.getObject(iilo1o2, j);
/* 506 */                       ioO0I1oi1lio ioo0i1oi1lioI00IOO4 = io1ii1oo1io.I00IOO(i7);
/* 510 */                       Class cls20 = ioOi0IO.I00000oIO;
/* 512 */                       int size8 = list19.size();
/* 516 */                       if (size8 == 0) {
/* 518 */                           iI00000oIO3 = 0;
                                } else {
/* 523 */                           iI00000oIO3 = 0;
/* 524 */                           for (int i20 = 0; i20 < size8; i20++) {
/* 530 */                               iilO1O iilo1o4 = (iilO1O) list19.get(i20);
/* 534 */                               int iI000o00OoI0I15 = il1O00loO1.I000o00OoI0I(i9 << 3);
/* 544 */                               iI00000oIO3 += iilo1o4.I00000oIO(ioo0i1oi1lioI00IOO4) + iI000o00OoI0I15 + iI000o00OoI0I15;
                                    }
                                }
/* 548 */                       iI0000O += iI00000oIO3;
/* 1735 */                      i7 += 3;
/* 1737 */                      iilo1o2 = iilo1o;
/* 1739 */                      i5 = 1048575;
                            case 50:
/* 456 */                       io001Oio io001oio = (io001Oio) unsafe.getObject(iilo1o2, j);
/* 458 */                       if (io1ii1oo1io.I00IlilI0i0i(i7) != null) {
/* 496 */                           OIiilo1Ool0o.I00000oIO();
/* 36 */                            return 0;
                                }
/* 464 */                       if (io001oio.isEmpty()) {
                                    continue;
                                } else {
/* 470 */                           Iterator it = io001oio.entrySet().iterator();
/* 478 */                           if (it.hasNext()) {
/* 486 */                               Map.Entry entry = (Map.Entry) it.next();
/* 488 */                               entry.getKey();
/* 491 */                               entry.getValue();
/* 495 */                               throw null;
                                    }
                                }
/* 1735 */                      i7 += 3;
/* 1737 */                      iilo1o2 = iilo1o;
/* 1739 */                      i5 = 1048575;
                            case 51:
/* 444 */                       if (io1ii1oo1io.I001iOo1i0O(iilo1o2, i9, i7)) {
/* 180 */                           iI0000O = io1OllI.I0000O(i9 << 3, 8, iI0000O);
                                }
/* 1735 */                      i7 += 3;
/* 1737 */                      iilo1o2 = iilo1o;
/* 1739 */                      i5 = 1048575;
                            case 52:
/* 436 */                       if (!io1ii1oo1io.I001iOo1i0O(iilo1o2, i9, i7)) {
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                }
/* 192 */                       iI001lllioOl = i9 << 3;
/* 166 */                       iI0000O = io1OllI.I0000O(iI001lllioOl, iI000o00OoI0I13, iI0000O);
/* 1735 */                      i7 += 3;
/* 1737 */                      iilo1o2 = iilo1o;
/* 1739 */                      i5 = 1048575;
                            case 53:
/* 414 */                       if (io1ii1oo1io.I001iOo1i0O(iilo1o2, i9, i7)) {
/* 418 */                           long jI00IO1 = I00IO1(j, iilo1o2);
/* 422 */                           iI000o00OoI0I11 = il1O00loO1.I000o00OoI0I(i9 << 3);
/* 426 */                           iI000oI1ioi2 = il1O00loO1.I000oI1ioi(jI00IO1);
/* 142 */                           iI0000O += iI000oI1ioi2 + iI000o00OoI0I11;
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                } else {
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                }
                            case 54:
/* 392 */                       if (io1ii1oo1io.I001iOo1i0O(iilo1o2, i9, i7)) {
/* 396 */                           long jI00IO12 = I00IO1(j, iilo1o2);
/* 400 */                           iI000o00OoI0I11 = il1O00loO1.I000o00OoI0I(i9 << 3);
/* 404 */                           iI000oI1ioi2 = il1O00loO1.I000oI1ioi(jI00IO12);
/* 142 */                           iI0000O += iI000oI1ioi2 + iI000o00OoI0I11;
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                } else {
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                }
                            case 55:
/* 369 */                       if (io1ii1oo1io.I001iOo1i0O(iilo1o2, i9, i7)) {
/* 373 */                           long jI001lllioOl = I001lllioOl(j, iilo1o2);
/* 378 */                           iI000o00OoI0I11 = il1O00loO1.I000o00OoI0I(i9 << 3);
/* 382 */                           iI000oI1ioi2 = il1O00loO1.I000oI1ioi(jI001lllioOl);
/* 142 */                           iI0000O += iI000oI1ioi2 + iI000o00OoI0I11;
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                } else {
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                }
                            case 56:
/* 361 */                       if (io1ii1oo1io.I001iOo1i0O(iilo1o2, i9, i7)) {
                                }
/* 1735 */                      i7 += 3;
/* 1737 */                      iilo1o2 = iilo1o;
/* 1739 */                      i5 = 1048575;
                                break;
                            case 57:
/* 353 */                       if (!io1ii1oo1io.I001iOo1i0O(iilo1o2, i9, i7)) {
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                }
/* 192 */                       iI001lllioOl = i9 << 3;
/* 166 */                       iI0000O = io1OllI.I0000O(iI001lllioOl, iI000o00OoI0I13, iI0000O);
/* 1735 */                      i7 += 3;
/* 1737 */                      iilo1o2 = iilo1o;
/* 1739 */                      i5 = 1048575;
                            case 58:
/* 339 */                       if (io1ii1oo1io.I001iOo1i0O(iilo1o2, i9, i7)) {
/* 343 */                           iI0000O = io1OllI.I0000O(i9 << 3, 1, iI0000O);
                                }
/* 1735 */                      i7 += 3;
/* 1737 */                      iilo1o2 = iilo1o;
/* 1739 */                      i5 = 1048575;
                            case 59:
/* 300 */                       if (io1ii1oo1io.I001iOo1i0O(iilo1o2, i9, i7)) {
/* 302 */                           int i21 = i9 << 3;
/* 304 */                           Object object3 = unsafe.getObject(iilo1o2, j);
/* 310 */                           if (object3 instanceof iiooOi11li) {
/* 314 */                               iI000o00OoI0I12 = il1O00loO1.I000o00OoI0I(i21);
/* 318 */                               iI0000oI002 = ((iiooOi11li) object3).I0000oI00();
/* 256 */                               iI0000O = io1OllI.I0000oI00(iI0000oI002, iI0000oI002, iI000o00OoI0I12, iI0000O);
/* 1735 */                              i7 += 3;
/* 1737 */                              iilo1o2 = iilo1o;
/* 1739 */                              i5 = 1048575;
                                    } else {
/* 325 */                               iI000o00OoI0I11 = il1O00loO1.I000o00OoI0I(i21);
/* 329 */                               iI000oI1ioi2 = il1O00loO1.I000lI((String) object3);
/* 142 */                               iI0000O += iI000oI1ioi2 + iI000o00OoI0I11;
/* 1735 */                              i7 += 3;
/* 1737 */                              iilo1o2 = iilo1o;
/* 1739 */                              i5 = 1048575;
                                    }
                                } else {
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                }
                            case 60:
/* 266 */                       if (io1ii1oo1io.I001iOo1i0O(iilo1o2, i9, i7)) {
/* 268 */                           Object object4 = unsafe.getObject(iilo1o2, j);
/* 272 */                           ioO0I1oi1lio ioo0i1oi1lioI00IOO5 = io1ii1oo1io.I00IOO(i7);
/* 276 */                           Class cls21 = ioOi0IO.I00000oIO;
/* 282 */                           iI000o00OoI0I3 = il1O00loO1.I000o00OoI0I(i9 << 3);
/* 286 */                           iI00000oIO = ((iilO1O) object4).I00000oIO(ioo0i1oi1lioI00IOO5);
/* 290 */                           iI0000O = io1OllI.I0000oI00(iI00000oIO, iI00000oIO, iI000o00OoI0I3, iI0000O);
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                } else {
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                }
                            case 61:
/* 238 */                       if (io1ii1oo1io.I001iOo1i0O(iilo1o2, i9, i7)) {
/* 246 */                           iiooOi11li iioooi11li2 = (iiooOi11li) unsafe.getObject(iilo1o2, j);
/* 248 */                           iI000o00OoI0I12 = il1O00loO1.I000o00OoI0I(i9 << 3);
/* 252 */                           iI0000oI002 = iioooi11li2.I0000oI00();
/* 256 */                           iI0000O = io1OllI.I0000oI00(iI0000oI002, iI0000oI002, iI000o00OoI0I12, iI0000O);
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                } else {
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                }
                            case 62:
/* 221 */                       if (io1ii1oo1io.I001iOo1i0O(iilo1o2, i9, i7)) {
/* 225 */                           iI001lllioOl = I001lllioOl(j, iilo1o2);
/* 229 */                           iI000o00OoI0I13 = il1O00loO1.I000o00OoI0I(i9 << 3);
/* 166 */                           iI0000O = io1OllI.I0000O(iI001lllioOl, iI000o00OoI0I13, iI0000O);
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                } else {
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                }
                            case 63:
/* 199 */                       if (io1ii1oo1io.I001iOo1i0O(iilo1o2, i9, i7)) {
/* 203 */                           long jI001lllioOl2 = I001lllioOl(j, iilo1o2);
/* 208 */                           iI000o00OoI0I11 = il1O00loO1.I000o00OoI0I(i9 << 3);
/* 212 */                           iI000oI1ioi2 = il1O00loO1.I000oI1ioi(jI001lllioOl2);
/* 142 */                           iI0000O += iI000oI1ioi2 + iI000o00OoI0I11;
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                } else {
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                }
                            case Barcode.FORMAT_EAN_8:
/* 190 */                       if (!io1ii1oo1io.I001iOo1i0O(iilo1o2, i9, i7)) {
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                }
/* 192 */                       iI001lllioOl = i9 << 3;
/* 166 */                       iI0000O = io1OllI.I0000O(iI001lllioOl, iI000o00OoI0I13, iI0000O);
/* 1735 */                      i7 += 3;
/* 1737 */                      iilo1o2 = iilo1o;
/* 1739 */                      i5 = 1048575;
                            case 65:
/* 176 */                       if (io1ii1oo1io.I001iOo1i0O(iilo1o2, i9, i7)) {
                                }
/* 1735 */                      i7 += 3;
/* 1737 */                      iilo1o2 = iilo1o;
/* 1739 */                      i5 = 1048575;
                                break;
                            case 66:
/* 149 */                       if (io1ii1oo1io.I001iOo1i0O(iilo1o2, i9, i7)) {
/* 153 */                           int iI001lllioOl2 = I001lllioOl(j, iilo1o2);
/* 161 */                           iI000o00OoI0I13 = il1O00loO1.I000o00OoI0I(i9 << 3);
/* 165 */                           iI001lllioOl = (iI001lllioOl2 >> 31) ^ (iI001lllioOl2 + iI001lllioOl2);
/* 166 */                           iI0000O = io1OllI.I0000O(iI001lllioOl, iI000o00OoI0I13, iI0000O);
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                } else {
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                }
                            case 67:
/* 120 */                       if (io1ii1oo1io.I001iOo1i0O(iilo1o2, i9, i7)) {
/* 124 */                           long jI00IO13 = I00IO1(j, iilo1o2);
/* 132 */                           iI000o00OoI0I11 = il1O00loO1.I000o00OoI0I(i9 << 3);
/* 137 */                           iI000oI1ioi2 = il1O00loO1.I000oI1ioi((jI00IO13 >> 63) ^ (jI00IO13 + jI00IO13));
/* 142 */                           iI0000O += iI000oI1ioi2 + iI000o00OoI0I11;
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                } else {
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                }
                            case 68:
/* 89 */                        if (io1ii1oo1io.I001iOo1i0O(iilo1o2, i9, i7)) {
/* 95 */                            iilO1O iilo1o5 = (iilO1O) unsafe.getObject(iilo1o2, j);
/* 97 */                            ioO0I1oi1lio ioo0i1oi1lioI00IOO6 = io1ii1oo1io.I00IOO(i7);
/* 103 */                           int iI000o00OoI0I16 = il1O00loO1.I000o00OoI0I(i9 << 3);
/* 107 */                           i4 = iI000o00OoI0I16 + iI000o00OoI0I16;
/* 108 */                           iI00000oIO2 = iilo1o5.I00000oIO(ioo0i1oi1lioI00IOO6);
/* 112 */                           iI000OiO = iI00000oIO2 + i4;
/* 113 */                           iI0000O += iI000OiO;
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                } else {
/* 1735 */                          i7 += 3;
/* 1737 */                          iilo1o2 = iilo1o;
/* 1739 */                          i5 = 1048575;
                                }
                            default:
/* 1735 */                      i7 += 3;
/* 1737 */                      iilo1o2 = iilo1o;
/* 1739 */                      i5 = 1048575;
                        }
                    }
/* 1746 */          io1ii1oo1io.I000iOII.getClass();
/* 1759 */          return ((ilOl10) iilo1o).zzc.I00000oIO() + iI0000O;
                }

                @Override
                public final boolean I000O01llI0(ilOl10 ilol10, ilOl10 ilol102) {
                    boolean zI000II;
/* 1 */             int[] iArr = this.I00000oIO;
/* 3 */             iooO1IiiOoOo iooo1iiioooo = this.I000iOII;
/* 6 */             int i = 0;
                    while (true) {
/* 8 */                 if (i < iArr.length) {
/* 10 */                    int iI00II0oii1o = I00II0oii1o(i);
/* 17 */                    long j = iI00II0oii1o & 1048575;
                            switch (I00II0Ol1O0l(iI00II0oii1o)) {
                                case 0:
/* 434 */                           if (!I001IIilI0O(ilol10, ilol102, i)) {
                                        break;
                                    } else {
/* 436 */                               Ooil0oIOI0l0 ooil0oIOI0l0 = l00iIli.I0000Il00O;
/* 456 */                               if (Double.doubleToLongBits(ooil0oIOI0l0.I0010I0i(ilol10, j)) != Double.doubleToLongBits(ooil0oIOI0l0.I0010I0i(ilol102, j))) {
                                            break;
                                        } else {
                                            continue;
/* 458 */                                   i += 3;
                                        }
                                    }
                                case 1:
/* 407 */                           if (!I001IIilI0O(ilol10, ilol102, i)) {
                                        break;
                                    } else {
/* 409 */                               Ooil0oIOI0l0 ooil0oIOI0l02 = l00iIli.I0000Il00O;
/* 427 */                               if (Float.floatToIntBits(ooil0oIOI0l02.I001IIilI0O(ilol10, j)) != Float.floatToIntBits(ooil0oIOI0l02.I001IIilI0O(ilol102, j))) {
                                            break;
                                        } else {
                                            continue;
/* 458 */                                   i += 3;
                                        }
                                    }
                                case 2:
/* 388 */                           if (!I001IIilI0O(ilol10, ilol102, i) || l00iIli.I0001Ioi1lo(ilol10, j) != l00iIli.I0001Ioi1lo(ilol102, j)) {
                                        break;
                                    } else {
                                        continue;
/* 458 */                               i += 3;
                                    }
                                    break;
                                case 3:
/* 369 */                           if (!I001IIilI0O(ilol10, ilol102, i) || l00iIli.I0001Ioi1lo(ilol10, j) != l00iIli.I0001Ioi1lo(ilol102, j)) {
                                        break;
                                    } else {
                                        continue;
/* 458 */                               i += 3;
                                    }
                                    break;
                                case 4:
/* 352 */                           if (!I001IIilI0O(ilol10, ilol102, i) || l00iIli.I0000oI00(ilol10, j) != l00iIli.I0000oI00(ilol102, j)) {
                                        break;
                                    } else {
                                        continue;
/* 458 */                               i += 3;
                                    }
                                    break;
                                case 5:
/* 332 */                           if (!I001IIilI0O(ilol10, ilol102, i) || l00iIli.I0001Ioi1lo(ilol10, j) != l00iIli.I0001Ioi1lo(ilol102, j)) {
                                        break;
                                    } else {
                                        continue;
/* 458 */                               i += 3;
                                    }
                                    break;
                                case 6:
/* 314 */                           if (!I001IIilI0O(ilol10, ilol102, i) || l00iIli.I0000oI00(ilol10, j) != l00iIli.I0000oI00(ilol102, j)) {
                                        break;
                                    } else {
                                        continue;
/* 458 */                               i += 3;
                                    }
                                    break;
                                case 7:
/* 294 */                           if (!I001IIilI0O(ilol10, ilol102, i)) {
                                        break;
                                    } else {
/* 296 */                               Ooil0oIOI0l0 ooil0oIOI0l03 = l00iIli.I0000Il00O;
/* 306 */                               if (ooil0oIOI0l03.I00Io1o110i(ilol10, j) != ooil0oIOI0l03.I00Io1o110i(ilol102, j)) {
                                            break;
                                        } else {
                                            continue;
/* 458 */                                   i += 3;
                                        }
                                    }
                                case 8:
/* 272 */                           if (!I001IIilI0O(ilol10, ilol102, i) || !ioOi0IO.I000II(l00iIli.I000II(ilol10, j), l00iIli.I000II(ilol102, j))) {
                                        break;
                                    } else {
                                        continue;
/* 458 */                               i += 3;
                                    }
                                    break;
                                case 9:
/* 250 */                           if (!I001IIilI0O(ilol10, ilol102, i) || !ioOi0IO.I000II(l00iIli.I000II(ilol10, j), l00iIli.I000II(ilol102, j))) {
                                        break;
                                    } else {
                                        continue;
/* 458 */                               i += 3;
                                    }
                                    break;
                                case 10:
/* 228 */                           if (!I001IIilI0O(ilol10, ilol102, i) || !ioOi0IO.I000II(l00iIli.I000II(ilol10, j), l00iIli.I000II(ilol102, j))) {
                                        break;
                                    } else {
                                        continue;
/* 458 */                               i += 3;
                                    }
                                    break;
                                case 11:
/* 210 */                           if (!I001IIilI0O(ilol10, ilol102, i) || l00iIli.I0000oI00(ilol10, j) != l00iIli.I0000oI00(ilol102, j)) {
                                        break;
                                    } else {
                                        continue;
/* 458 */                               i += 3;
                                    }
                                    break;
                                case 12:
/* 192 */                           if (!I001IIilI0O(ilol10, ilol102, i) || l00iIli.I0000oI00(ilol10, j) != l00iIli.I0000oI00(ilol102, j)) {
                                        break;
                                    } else {
                                        continue;
/* 458 */                               i += 3;
                                    }
                                    break;
                                case 13:
/* 174 */                           if (!I001IIilI0O(ilol10, ilol102, i) || l00iIli.I0000oI00(ilol10, j) != l00iIli.I0000oI00(ilol102, j)) {
                                        break;
                                    } else {
                                        continue;
/* 458 */                               i += 3;
                                    }
                                    break;
                                case 14:
/* 154 */                           if (!I001IIilI0O(ilol10, ilol102, i) || l00iIli.I0001Ioi1lo(ilol10, j) != l00iIli.I0001Ioi1lo(ilol102, j)) {
                                        break;
                                    } else {
                                        continue;
/* 458 */                               i += 3;
                                    }
                                    break;
                                case 15:
/* 136 */                           if (!I001IIilI0O(ilol10, ilol102, i) || l00iIli.I0000oI00(ilol10, j) != l00iIli.I0000oI00(ilol102, j)) {
                                        break;
                                    } else {
                                        continue;
/* 458 */                               i += 3;
                                    }
                                    break;
                                case 16:
/* 116 */                           if (!I001IIilI0O(ilol10, ilol102, i) || l00iIli.I0001Ioi1lo(ilol10, j) != l00iIli.I0001Ioi1lo(ilol102, j)) {
                                        break;
                                    } else {
                                        continue;
/* 458 */                               i += 3;
                                    }
                                    break;
                                case 17:
/* 94 */                            if (!I001IIilI0O(ilol10, ilol102, i) || !ioOi0IO.I000II(l00iIli.I000II(ilol10, j), l00iIli.I000II(ilol102, j))) {
                                        break;
                                    } else {
                                        continue;
/* 458 */                               i += 3;
                                    }
                                    break;
                                case PoseLandmark.RIGHT_PINKY:
                                case PoseLandmark.LEFT_INDEX:
                                case PoseLandmark.RIGHT_INDEX:
                                case PoseLandmark.LEFT_THUMB:
                                case PoseLandmark.RIGHT_THUMB:
                                case PoseLandmark.LEFT_HIP:
                                case PoseLandmark.RIGHT_HIP:
                                case PoseLandmark.LEFT_KNEE:
                                case PoseLandmark.RIGHT_KNEE:
                                case 27:
                                case PoseLandmark.RIGHT_ANKLE:
                                case PoseLandmark.LEFT_HEEL:
                                case 30:
                                case PoseLandmark.LEFT_FOOT_INDEX:
                                case 32:
                                case 33:
                                case 34:
                                case InputImage.IMAGE_FORMAT_YUV_420_888:
                                case 36:
                                case 37:
                                case 38:
                                case 39:
                                case 40:
                                case 41:
                                case 42:
                                case 43:
                                case 44:
                                case BuildConfig.VERSION_CODE:
                                case 46:
                                case 47:
                                case 48:
                                case 49:
/* 82 */                            zI000II = ioOi0IO.I000II(l00iIli.I000II(ilol10, j), l00iIli.I000II(ilol102, j));
                                    break;
                                case 50:
/* 69 */                            zI000II = ioOi0IO.I000II(l00iIli.I000II(ilol10, j), l00iIli.I000II(ilol102, j));
                                    break;
                                case 51:
                                case 52:
                                case 53:
                                case 54:
                                case 55:
                                case 56:
                                case 57:
                                case 58:
                                case 59:
                                case 60:
                                case 61:
                                case 62:
                                case 63:
                                case Barcode.FORMAT_EAN_8:
                                case 65:
                                case 66:
                                case 67:
                                case 68:
/* 33 */                            long j2 = iArr[i + 2] & 1048575;
/* 43 */                            if (l00iIli.I0000oI00(ilol10, j2) != l00iIli.I0000oI00(ilol102, j2) || !ioOi0IO.I000II(l00iIli.I000II(ilol10, j), l00iIli.I000II(ilol102, j))) {
                                        break;
                                    } else {
                                        continue;
/* 458 */                               i += 3;
                                    }
                                    break;
                                default:
/* 458 */                           i += 3;
                            }
/* 86 */                    if (zI000II) {
/* 458 */                       i += 3;
                            }
                        } else {
/* 462 */                   iooo1iiioooo.getClass();
/* 473 */                   if (ilol10.zzc.equals(ilol102.zzc)) {
/* 476 */                       return true;
                            }
                        }
                    }
/* 5 */             return false;
                }

                @Override
                public final void I000OOo1O(Object obj, byte[] bArr, int i, int i2, I1Il011OO i1Il011OO) {
/* 8 */             I001l0I00(obj, bArr, i, i2, 0, i1Il011OO);
                }

                public final Object I000OiO(int i, Object obj) {
/* 1 */             ioO0I1oi1lio ioo0i1oi1lioI00IOO = I00IOO(i);
/* 12 */            int iI00II0oii1o = I00II0oii1o(i) & 1048575;
/* 17 */            if (!I001IO000(i, obj)) {
/* 19 */                return ioo0i1oi1lioI00IOO.zze();
                    }
/* 27 */            Object object = I000lI.getObject(obj, iI00II0oii1o);
/* 35 */            if (I001i1lo1io(object)) {
/* 37 */                return object;
                    }
/* 38 */            ilOl10 ilol10Zze = ioo0i1oi1lioI00IOO.zze();
/* 42 */            if (object != null) {
/* 44 */                ioo0i1oi1lioI00IOO.I00000oOI(ilol10Zze, object);
                    }
/* 106 */           return ilol10Zze;
                }

                public final Object I000iOII(Object obj, int i, int i2) {
/* 1 */             ioO0I1oi1lio ioo0i1oi1lioI00IOO = I00IOO(i2);
/* 9 */             if (!I001iOo1i0O(obj, i, i2)) {
/* 11 */                return ioo0i1oi1lioI00IOO.zze();
                    }
/* 27 */            Object object = I000lI.getObject(obj, I00II0oii1o(i2) & 1048575);
/* 35 */            if (I001i1lo1io(object)) {
/* 37 */                return object;
                    }
/* 38 */            ilOl10 ilol10Zze = ioo0i1oi1lioI00IOO.zze();
/* 42 */            if (object != null) {
/* 44 */                ioo0i1oi1lioI00IOO.I00000oOI(ilol10Zze, object);
                    }
/* 98 */            return ilol10Zze;
                }

                public final void I000o00OoI0I(int i, Object obj, Object obj2) {
/* 5 */             if (I001IO000(i, obj2)) {
/* 15 */                long jI00II0oii1o = I00II0oii1o(i) & 1048575;
/* 17 */                Unsafe unsafe = I000lI;
/* 19 */                Object object = unsafe.getObject(obj2, jI00II0oii1o);
/* 23 */                if (object == null) {
/* 100 */                   I000II.I001IO000(IlIi0I0.I000OiO(this.I00000oIO[i], "Source subfield ", " is present but null: ", obj2.toString()));
/* 408 */                   return;
                        }
/* 25 */                ioO0I1oi1lio ioo0i1oi1lioI00IOO = I00IOO(i);
/* 33 */                if (!I001IO000(i, obj)) {
/* 39 */                    if (I001i1lo1io(object)) {
/* 45 */                        ilOl10 ilol10Zze = ioo0i1oi1lioI00IOO.zze();
/* 49 */                        ioo0i1oi1lioI00IOO.I00000oOI(ilol10Zze, object);
/* 52 */                        unsafe.putObject(obj, jI00II0oii1o, ilol10Zze);
                            } else {
/* 41 */                        unsafe.putObject(obj, jI00II0oii1o, object);
                            }
/* 55 */                    I00100o1O0lo(i, obj);
/* 58 */                    return;
                        }
/* 59 */                Object object2 = unsafe.getObject(obj, jI00II0oii1o);
/* 67 */                if (!I001i1lo1io(object2)) {
/* 69 */                    ilOl10 ilol10Zze2 = ioo0i1oi1lioI00IOO.zze();
/* 73 */                    ioo0i1oi1lioI00IOO.I00000oOI(ilol10Zze2, object2);
/* 76 */                    unsafe.putObject(obj, jI00II0oii1o, ilol10Zze2);
/* 79 */                    object2 = ilol10Zze2;
                        }
/* 80 */                ioo0i1oi1lioI00IOO.I00000oOI(object2, object);
                    }
                }

                public final void I000oI1ioi(int i, Object obj, Object obj2) {
/* 1 */             int[] iArr = this.I00000oIO;
/* 3 */             int i2 = iArr[i];
/* 9 */             if (I001iOo1i0O(obj2, i2, i)) {
/* 19 */                long jI00II0oii1o = I00II0oii1o(i) & 1048575;
/* 21 */                Unsafe unsafe = I000lI;
/* 23 */                Object object = unsafe.getObject(obj2, jI00II0oii1o);
/* 27 */                if (object == null) {
/* 102 */                   I000II.I001IO000(IlIi0I0.I000OiO(iArr[i], "Source subfield ", " is present but null: ", obj2.toString()));
/* 408 */                   return;
                        }
/* 29 */                ioO0I1oi1lio ioo0i1oi1lioI00IOO = I00IOO(i);
/* 37 */                if (!I001iOo1i0O(obj, i2, i)) {
/* 43 */                    if (I001i1lo1io(object)) {
/* 49 */                        ilOl10 ilol10Zze = ioo0i1oi1lioI00IOO.zze();
/* 53 */                        ioo0i1oi1lioI00IOO.I00000oOI(ilol10Zze, object);
/* 56 */                        unsafe.putObject(obj, jI00II0oii1o, ilol10Zze);
                            } else {
/* 45 */                        unsafe.putObject(obj, jI00II0oii1o, object);
                            }
/* 59 */                    I0010I0i(obj, i2, i);
/* 62 */                    return;
                        }
/* 63 */                Object object2 = unsafe.getObject(obj, jI00II0oii1o);
/* 71 */                if (!I001i1lo1io(object2)) {
/* 73 */                    ilOl10 ilol10Zze2 = ioo0i1oi1lioI00IOO.zze();
/* 77 */                    ioo0i1oi1lioI00IOO.I00000oOI(ilol10Zze2, object2);
/* 80 */                    unsafe.putObject(obj, jI00II0oii1o, ilol10Zze2);
/* 83 */                    object2 = ilol10Zze2;
                        }
/* 84 */                ioo0i1oi1lioI00IOO.I00000oOI(object2, object);
                    }
                }

                public final void I00100l0(int i, IOOOi1 iOOOi1, Object obj) throws ill0OI0oO1 {
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) iOOOi1.I0000oI00;
/* 16 */            long j = i & 1048575;
/* 19 */            if ((536870912 & i) != 0) {
/* 21 */                iOOOi1.I01I1Oo0oll(2);
/* 28 */                l00iIli.I000OiO(obj, j, ioooi0.I00iiI());
                    } else if (!this.I0001Ioi1lo) {
/* 51 */                l00iIli.I000OiO(obj, j, iOOOi1.I01O1I1());
                    } else {
/* 36 */                iOOOi1.I01I1Oo0oll(2);
/* 43 */                l00iIli.I000OiO(obj, j, ioooi0.I00iOIl());
                    }
                }

                public final void I00100o1O0lo(int i, Object obj) {
/* 5 */             int i2 = this.I00000oIO[i + 2];
/* 10 */            long j = 1048575 & i2;
/* 17 */            if (j == 1048575) {
/* 19 */                return;
                    }
/* 30 */            l00iIli.I000O01llI0(obj, j, (1 << (i2 >>> 20)) | l00iIli.I0000oI00(obj, j));
                }

                public final void I0010I0i(Object obj, int i, int i2) {
/* 12 */            l00iIli.I000O01llI0(obj, this.I00000oIO[i2 + 2] & 1048575, i);
                }

                public final void I0010o(int i, Object obj, Object obj2) {
/* 12 */            I000lI.putObject(obj, I00II0oii1o(i) & 1048575, obj2);
/* 15 */            I00100o1O0lo(i, obj);
                }

                public final void I00111O(Object obj, int i, int i2, Object obj2) {
/* 12 */            I000lI.putObject(obj, I00II0oii1o(i2) & 1048575, obj2);
/* 15 */            I0010I0i(obj, i, i2);
                }

                public final boolean I001IIilI0O(ilOl10 ilol10, ilOl10 ilol102, int i) {
                    return I001IO000(i, ilol10) == I001IO000(i, ilol102);
                }

                public final boolean I001IO000(int i, Object obj) {
/* 5 */             int i2 = this.I00000oIO[i + 2];
/* 10 */            long j = i2 & 1048575;
/* 20 */            if (j != 1048575) {
                        return ((1 << (i2 >>> 20)) & l00iIli.I0000oI00(obj, j)) != 0;
                    }
/* 22 */            int iI00II0oii1o = I00II0oii1o(i);
/* 26 */            long j2 = iI00II0oii1o & 1048575;
                    switch (I00II0Ol1O0l(iI00II0oii1o)) {
                        case 0:
/* 232 */                   if (Double.doubleToRawLongBits(l00iIli.I0000Il00O.I0010I0i(obj, j2)) != 0) {
                            }
                            break;
                        case 1:
/* 217 */                   if (Float.floatToRawIntBits(l00iIli.I0000Il00O.I001IIilI0O(obj, j2)) != 0) {
                            }
                            break;
                        case 2:
/* 204 */                   if (l00iIli.I0001Ioi1lo(obj, j2) != 0) {
                            }
                            break;
                        case 3:
/* 195 */                   if (l00iIli.I0001Ioi1lo(obj, j2) != 0) {
                            }
                            break;
                        case 4:
/* 186 */                   if (l00iIli.I0000oI00(obj, j2) != 0) {
                            }
                            break;
                        case 5:
/* 179 */                   if (l00iIli.I0001Ioi1lo(obj, j2) != 0) {
                            }
                            break;
                        case 6:
/* 170 */                   if (l00iIli.I0000oI00(obj, j2) != 0) {
                            }
                            break;
                        case 7:
                            break;
                        case 8:
/* 124 */                   Object objI000II = l00iIli.I000II(obj, j2);
/* 130 */                   if (!(objI000II instanceof String)) {
/* 144 */                       if (!(objI000II instanceof iiooOi11li)) {
/* 155 */                           OIiilo1Ool0o.I00100o1O0lo();
                                    break;
                                } else if (!iiooOi11li.I00iiO.equals(objI000II)) {
                                }
                            } else if (!((String) objI000II).isEmpty()) {
                            }
                            break;
                        case 9:
/* 120 */                   if (l00iIli.I000II(obj, j2) != null) {
                            }
                            break;
                        case 10:
/* 112 */                   if (!iiooOi11li.I00iiO.equals(l00iIli.I000II(obj, j2))) {
                            }
                            break;
                        case 11:
/* 98 */                    if (l00iIli.I0000oI00(obj, j2) != 0) {
                            }
                            break;
                        case 12:
/* 90 */                    if (l00iIli.I0000oI00(obj, j2) != 0) {
                            }
                            break;
                        case 13:
/* 82 */                    if (l00iIli.I0000oI00(obj, j2) != 0) {
                            }
                            break;
                        case 14:
/* 74 */                    if (l00iIli.I0001Ioi1lo(obj, j2) != 0) {
                            }
                            break;
                        case 15:
/* 64 */                    if (l00iIli.I0000oI00(obj, j2) != 0) {
                            }
                            break;
                        case 16:
/* 56 */                    if (l00iIli.I0001Ioi1lo(obj, j2) != 0) {
                            }
                            break;
                        case 17:
/* 46 */                    if (l00iIli.I000II(obj, j2) != null) {
                            }
                            break;
                        default:
/* 38 */                    OIiilo1Ool0o.I00100o1O0lo();
                            break;
                    }
/* 18 */            return false;
                }

                public final boolean I001i1O0Ol(Object obj, int i, int i2, int i3, int i4) {
                    return i2 == 1048575 ? I001IO000(i, obj) : (i3 & i4) != 0;
                }

                public final boolean I001iOo1i0O(Object obj, int i, int i2) {
                    return l00iIli.I0000oI00(obj, (long) (this.I00000oIO[i2 + 2] & 1048575)) == i;
                }

                /*  JADX ERROR: Type inference failed
                    jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
                    */
                public final int I001l0I00(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, p000.I1Il011OO r39) {
                    /*  JADX ERROR: Method code generation error
                        java.lang.NullPointerException
                        */
                    /*  JADX ERROR: Type inference failed
                        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        */
                    /*
                        Method dump skipped, instructions count: 2842
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.io1ii1oO1iO.I001l0I00(java.lang.Object, byte[], int, int, int, I1Il011OO):int");
                }

                public final int I001lloI(int i, int i2) {
/* 1 */             int[] iArr = this.I00000oIO;
                    int length = (iArr.length / 3) - 1;
/* 8 */             while (i2 <= length) {
/* 12 */                int i3 = (length + i2) >>> 1;
/* 14 */                int i4 = i3 * 3;
/* 16 */                int i5 = iArr[i4];
/* 18 */                if (i == i5) {
/* 20 */                    return i4;
                        }
/* 21 */                if (i < i5) {
                            length = i3 - 1;
                        } else {
/* 26 */                    i2 = i3 + 1;
                        }
                    }
/* 6 */             return -1;
                }

                public final int I00II0oii1o(int i) {
/* 5 */             return this.I00000oIO[i + 1];
                }

                public final l0IioO1i0lO1 I00IO1oi11O(int i) {
/* 1 */             int i2 = i / 3;
/* 10 */            return (l0IioO1i0lO1) this.I00000oOI[i2 + i2 + 1];
                }

                public final ioO0I1oi1lio I00IOO(int i) {
/* 1 */             Object[] objArr = this.I00000oOI;
/* 3 */             int i2 = i / 3;
/* 5 */             int i3 = i2 + i2;
/* 8 */             ioO0I1oi1lio ioo0i1oi1lio = (ioO0I1oi1lio) objArr[i3];
/* 10 */            if (ioo0i1oi1lio != null) {
/* 12 */                return ioo0i1oi1lio;
                    }
/* 21 */            ioO0I1oi1lio ioo0i1oi1lioI00000oIO = ioIOiiiiO0.I0000Il00O.I00000oIO((Class) objArr[i3 + 1]);
/* 25 */            objArr[i3] = ioo0i1oi1lioI00000oIO;
/* 29 */            return ioo0i1oi1lioI00000oIO;
                }

                public final void I00IioO0OiOi(int i, Object obj, Object obj2) {
/* 3 */             int i2 = this.I00000oIO[i];
/* 14 */            Object objI000II = l00iIli.I000II(obj, I00II0oii1o(i) & 1048575);
/* 18 */            if (objI000II == null || I00IO1oi11O(i) == null) {
/* 27 */                return;
                    }
/* 34 */            I00IlilI0i0i(i).getClass();
/* 37 */            OIiilo1Ool0o.I00000oIO();
                }

                public final Object I00IlilI0i0i(int i) {
/* 1 */             int i2 = i / 3;
/* 6 */             return this.I00000oOI[i2 + i2];
                }

                @Override
                public final ilOl10 zze() {
/* 5 */             return ((ilOl10) this.I0000oI00).I0000oI00();
                }
            }

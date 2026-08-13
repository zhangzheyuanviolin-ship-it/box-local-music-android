            package p000;

            import com.google.ai.edge.gallery.BuildConfig;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import com.google.mlkit.vision.common.InputImage;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Field;
            import java.nio.charset.Charset;
            import java.security.AccessController;
            import java.util.Arrays;
            import java.util.List;
            import java.util.Map;
            import sun.misc.Unsafe;
            
            public final class O1lIoOI implements OiOIlIo {
                public static final int[] I000o00OoI0I = new int[0];
                public static final Unsafe I000oI1ioi;
                public int[] I00000oIO;
                public Object[] I00000oOI;
                public int I0000Il00O;
                public int I0000O;
                public I01Ilo0i I0000oI00;
                public boolean I0001Ioi1lo;
                public int[] I000II;
                public int I000O01llI0;
                public int I000OOo1O;
                public OIIi0ol I000OiO;
                public O10I0o I000iOII;
                public OoiO0oloIiI I000l1;
                public O1Oi11o I000lI;

                static {
                    Unsafe unsafe;
                    try {
/* 16 */                unsafe = (Unsafe) AccessController.doPrivileged(new OoiioO0o(2));
                    } catch (Throwable unused) {
/* 19 */                unsafe = null;
                    }
/* 20 */            I000oI1ioi = unsafe;
                }

                public static boolean I00100l0(Object obj) {
/* 1 */             if (obj == null) {
/* 3 */                 return false;
                    }
/* 7 */             if (obj instanceof Io00l0) {
/* 11 */                return ((Io00l0) obj).I000II();
                    }
/* 16 */            return true;
                }

                /* JADX WARN: Removed duplicated region for block: B:124:0x0274  */
                /* JADX WARN: Removed duplicated region for block: B:126:0x027a  */
                /* JADX WARN: Removed duplicated region for block: B:129:0x0292  */
                /* JADX WARN: Removed duplicated region for block: B:130:0x0295  */
                /* JADX WARN: Removed duplicated region for block: B:168:0x034b  */
                /* JADX WARN: Removed duplicated region for block: B:183:0x0395  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static O1lIoOI I001i1O0Ol(OOlI0Ol oOlI0Ol, OIIi0ol oIIi0ol, O10I0o o10I0o, OoiO0oloIiI ooiO0oloIiI, Il1o0O il1o0O, O1Oi11o o1Oi11o) {
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
                    int i16;
                    int iObjectFieldOffset;
                    int iObjectFieldOffset2;
                    int i17;
                    int i18;
                    int iObjectFieldOffset3;
                    Field fieldI00IO1;
                    char cCharAt9;
                    int i19;
                    int i20;
                    int i21;
                    Object obj;
                    Field fieldI00IO12;
                    Object obj2;
                    Field fieldI00IO13;
                    int i22;
                    char cCharAt10;
                    int i23;
                    int i24;
                    char cCharAt11;
                    int i25;
                    int i26;
                    char cCharAt12;
                    int i27;
                    char cCharAt13;
/* 5 */             if (!(oOlI0Ol instanceof OOlI0Ol)) {
/* 1059 */              OIiilo1Ool0o.I00000oIO();
/* 1062 */              return null;
                    }
/* 7 */             I01Ilo0i i01Ilo0i = oOlI0Ol.I00000oIO;
/* 9 */             String str = oOlI0Ol.I00000oOI;
/* 11 */            int length = str.length();
/* 15 */            int i28 = 0;
/* 23 */            if (str.charAt(0) >= 55296) {
/* 25 */                int i29 = 1;
                        while (true) {
/* 26 */                    i = i29 + 1;
/* 32 */                    if (str.charAt(i29) < 55296) {
                                break;
                            }
/* 34 */                    i29 = i;
                        }
                    } else {
/* 36 */                i = 1;
                    }
/* 37 */            int i30 = i + 1;
/* 39 */            int iCharAt6 = str.charAt(i);
/* 43 */            if (iCharAt6 >= 55296) {
/* 45 */                int i31 = iCharAt6 & 8191;
/* 47 */                int i32 = 13;
                        while (true) {
/* 49 */                    i27 = i30 + 1;
/* 51 */                    cCharAt13 = str.charAt(i30);
/* 55 */                    if (cCharAt13 < 55296) {
                                break;
                            }
/* 60 */                    i31 |= (cCharAt13 & 8191) << i32;
/* 61 */                    i32 += 13;
/* 63 */                    i30 = i27;
                        }
/* 66 */                iCharAt6 = i31 | (cCharAt13 << i32);
/* 67 */                i30 = i27;
                    }
/* 68 */            if (iCharAt6 == 0) {
/* 70 */                iArr = I000o00OoI0I;
/* 72 */                iCharAt = 0;
/* 73 */                iCharAt2 = 0;
/* 74 */                iCharAt3 = 0;
/* 75 */                iCharAt4 = 0;
/* 76 */                i2 = 0;
/* 77 */                iCharAt5 = 0;
                    } else {
/* 80 */                int i33 = i30 + 1;
/* 82 */                int iCharAt7 = str.charAt(i30);
/* 86 */                if (iCharAt7 >= 55296) {
/* 88 */                    int i34 = iCharAt7 & 8191;
/* 90 */                    int i35 = 13;
                            while (true) {
/* 92 */                        i10 = i33 + 1;
/* 94 */                        cCharAt8 = str.charAt(i33);
/* 98 */                        if (cCharAt8 < 55296) {
                                    break;
                                }
/* 103 */                       i34 |= (cCharAt8 & 8191) << i35;
/* 104 */                       i35 += 13;
/* 106 */                       i33 = i10;
                            }
/* 109 */                   iCharAt7 = i34 | (cCharAt8 << i35);
/* 110 */                   i33 = i10;
                        }
/* 111 */               int i36 = i33 + 1;
/* 113 */               int iCharAt8 = str.charAt(i33);
/* 117 */               if (iCharAt8 >= 55296) {
/* 119 */                   int i37 = iCharAt8 & 8191;
/* 121 */                   int i38 = 13;
                            while (true) {
/* 123 */                       i9 = i36 + 1;
/* 125 */                       cCharAt7 = str.charAt(i36);
/* 129 */                       if (cCharAt7 < 55296) {
                                    break;
                                }
/* 134 */                       i37 |= (cCharAt7 & 8191) << i38;
/* 135 */                       i38 += 13;
/* 137 */                       i36 = i9;
                            }
/* 140 */                   iCharAt8 = i37 | (cCharAt7 << i38);
/* 141 */                   i36 = i9;
                        }
/* 142 */               int i39 = i36 + 1;
/* 144 */               iCharAt = str.charAt(i36);
/* 148 */               if (iCharAt >= 55296) {
/* 150 */                   int i40 = iCharAt & 8191;
/* 152 */                   int i41 = 13;
                            while (true) {
/* 154 */                       i8 = i39 + 1;
/* 156 */                       cCharAt6 = str.charAt(i39);
/* 160 */                       if (cCharAt6 < 55296) {
                                    break;
                                }
/* 165 */                       i40 |= (cCharAt6 & 8191) << i41;
/* 166 */                       i41 += 13;
/* 168 */                       i39 = i8;
                            }
/* 171 */                   iCharAt = i40 | (cCharAt6 << i41);
/* 172 */                   i39 = i8;
                        }
/* 173 */               int i42 = i39 + 1;
/* 175 */               iCharAt2 = str.charAt(i39);
/* 179 */               if (iCharAt2 >= 55296) {
/* 181 */                   int i43 = iCharAt2 & 8191;
/* 183 */                   int i44 = 13;
                            while (true) {
/* 185 */                       i7 = i42 + 1;
/* 187 */                       cCharAt5 = str.charAt(i42);
/* 191 */                       if (cCharAt5 < 55296) {
                                    break;
                                }
/* 196 */                       i43 |= (cCharAt5 & 8191) << i44;
/* 197 */                       i44 += 13;
/* 199 */                       i42 = i7;
                            }
/* 202 */                   iCharAt2 = i43 | (cCharAt5 << i44);
/* 203 */                   i42 = i7;
                        }
/* 204 */               int i45 = i42 + 1;
/* 206 */               iCharAt3 = str.charAt(i42);
/* 210 */               if (iCharAt3 >= 55296) {
/* 212 */                   int i46 = iCharAt3 & 8191;
/* 214 */                   int i47 = 13;
                            while (true) {
/* 216 */                       i6 = i45 + 1;
/* 218 */                       cCharAt4 = str.charAt(i45);
/* 222 */                       if (cCharAt4 < 55296) {
                                    break;
                                }
/* 227 */                       i46 |= (cCharAt4 & 8191) << i47;
/* 228 */                       i47 += 13;
/* 230 */                       i45 = i6;
                            }
/* 233 */                   iCharAt3 = i46 | (cCharAt4 << i47);
/* 234 */                   i45 = i6;
                        }
/* 235 */               int i48 = i45 + 1;
/* 237 */               iCharAt4 = str.charAt(i45);
/* 241 */               if (iCharAt4 >= 55296) {
/* 243 */                   int i49 = iCharAt4 & 8191;
/* 245 */                   int i50 = 13;
                            while (true) {
/* 247 */                       i5 = i48 + 1;
/* 249 */                       cCharAt3 = str.charAt(i48);
/* 253 */                       if (cCharAt3 < 55296) {
                                    break;
                                }
/* 258 */                       i49 |= (cCharAt3 & 8191) << i50;
/* 259 */                       i50 += 13;
/* 261 */                       i48 = i5;
                            }
/* 265 */                   iCharAt4 = i49 | (cCharAt3 << i50);
/* 266 */                   i48 = i5;
                        }
/* 268 */               int i51 = i48 + 1;
/* 270 */               int iCharAt9 = str.charAt(i48);
/* 274 */               if (iCharAt9 >= 55296) {
/* 276 */                   int i52 = iCharAt9 & 8191;
/* 278 */                   int i53 = 13;
                            while (true) {
/* 280 */                       i4 = i51 + 1;
/* 282 */                       cCharAt2 = str.charAt(i51);
/* 286 */                       if (cCharAt2 < 55296) {
                                    break;
                                }
/* 292 */                       i52 |= (cCharAt2 & 8191) << i53;
/* 293 */                       i53 += 13;
/* 295 */                       i51 = i4;
                            }
/* 300 */                   iCharAt9 = i52 | (cCharAt2 << i53);
/* 301 */                   i51 = i4;
                        }
/* 303 */               int i54 = i51 + 1;
/* 305 */               iCharAt5 = str.charAt(i51);
/* 309 */               if (iCharAt5 >= 55296) {
/* 311 */                   int i55 = iCharAt5 & 8191;
/* 313 */                   int i56 = i54;
/* 315 */                   int i57 = 13;
                            while (true) {
/* 317 */                       i3 = i56 + 1;
/* 319 */                       cCharAt = str.charAt(i56);
/* 323 */                       if (cCharAt < 55296) {
                                    break;
                                }
/* 329 */                       i55 |= (cCharAt & 8191) << i57;
/* 330 */                       i57 += 13;
/* 332 */                       i56 = i3;
                            }
/* 337 */                   iCharAt5 = i55 | (cCharAt << i57);
/* 338 */                   i54 = i3;
                        }
/* 343 */               int[] iArr2 = new int[iCharAt5 + iCharAt4 + iCharAt9];
/* 347 */               i2 = (iCharAt7 * 2) + iCharAt8;
/* 348 */               iArr = iArr2;
/* 349 */               i28 = iCharAt7;
/* 350 */               i30 = i54;
                    }
/* 352 */           Object[] objArr = oOlI0Ol.I0000Il00O;
/* 354 */           Class<?> cls = i01Ilo0i.getClass();
/* 360 */           int[] iArr3 = new int[iCharAt3 * 3];
/* 364 */           Object[] objArr2 = new Object[iCharAt3 * 2];
/* 366 */           int i58 = iCharAt4 + iCharAt5;
/* 367 */           int i59 = i58;
/* 369 */           int i60 = iCharAt5;
/* 371 */           int i61 = 0;
/* 373 */           int i62 = 0;
/* 375 */           while (i30 < length) {
/* 377 */               int i63 = i30 + 1;
/* 379 */               int iCharAt10 = str.charAt(i30);
/* 386 */               if (iCharAt10 >= 55296) {
/* 388 */                   int i64 = iCharAt10 & 8191;
/* 390 */                   int i65 = i63;
/* 392 */                   int i66 = 13;
                            while (true) {
/* 394 */                       i26 = i65 + 1;
/* 396 */                       cCharAt12 = str.charAt(i65);
/* 400 */                       i11 = length;
/* 405 */                       if (cCharAt12 < 55296) {
                                    break;
                                }
/* 411 */                       i64 |= (cCharAt12 & 8191) << i66;
/* 412 */                       i66 += 13;
/* 414 */                       i65 = i26;
/* 416 */                       length = i11;
                            }
/* 421 */                   iCharAt10 = i64 | (cCharAt12 << i66);
/* 422 */                   i12 = i26;
                        } else {
/* 425 */                   i11 = length;
/* 427 */                   i12 = i63;
                        }
/* 429 */               int i67 = i12 + 1;
/* 431 */               int iCharAt11 = str.charAt(i12);
/* 440 */               if (iCharAt11 >= 55296) {
/* 442 */                   int i68 = iCharAt11 & 8191;
/* 444 */                   int i69 = i67;
/* 446 */                   int i70 = 13;
                            while (true) {
/* 448 */                       i24 = i69 + 1;
/* 450 */                       cCharAt11 = str.charAt(i69);
/* 454 */                       i25 = i68;
/* 459 */                       if (cCharAt11 < 55296) {
                                    break;
                                }
/* 465 */                       i68 = i25 | ((cCharAt11 & 8191) << i70);
/* 467 */                       i70 += 13;
/* 469 */                       i69 = i24;
                            }
/* 474 */                   iCharAt11 = i25 | (cCharAt11 << i70);
/* 476 */                   i13 = i24;
                        } else {
/* 479 */                   i13 = i67;
                        }
/* 481 */               int i71 = i28;
/* 483 */               int i72 = iCharAt11 & 255;
/* 485 */               int i73 = iCharAt10;
/* 489 */               if ((iCharAt11 & Barcode.FORMAT_UPC_E) != 0) {
/* 493 */                   iArr[i61] = i62;
/* 491 */                   i61++;
                        }
/* 499 */               Object[] objArr3 = objArr;
/* 501 */               Unsafe unsafe = I000oI1ioi;
/* 503 */               if (i72 >= 51) {
/* 505 */                   int i74 = i13 + 1;
/* 507 */                   int iCharAt12 = str.charAt(i13);
/* 516 */                   if (iCharAt12 >= 55296) {
/* 518 */                       int i75 = iCharAt12 & 8191;
/* 520 */                       int i76 = i74;
/* 522 */                       int i77 = 13;
                                while (true) {
/* 524 */                           i22 = i76 + 1;
/* 526 */                           cCharAt10 = str.charAt(i76);
/* 530 */                           i23 = i75;
/* 535 */                           if (cCharAt10 < 55296) {
                                        break;
                                    }
/* 541 */                           i75 = i23 | ((cCharAt10 & 8191) << i77);
/* 543 */                           i77 += 13;
/* 545 */                           i76 = i22;
                                }
/* 550 */                       iCharAt12 = i23 | (cCharAt10 << i77);
/* 552 */                       i20 = i22;
                            } else {
/* 555 */                       i20 = i74;
                            }
/* 557 */                   int i78 = iCharAt12;
                            int i79 = i72 - 51;
/* 561 */                   int i80 = i20;
/* 565 */                   if (i79 == 9 || i79 == 17) {
/* 612 */                       i21 = i2 + 1;
/* 616 */                       objArr2[((i62 / 3) * 2) + 1] = objArr3[i2];
                            } else {
/* 574 */                       if (i79 == 12 && (IIlIOloOOO.I00000oOI(oOlI0Ol.I00000oIO(), 1) || (iCharAt11 & Barcode.FORMAT_PDF417) != 0)) {
/* 596 */                           i21 = i2 + 1;
/* 600 */                           objArr2[((i62 / 3) * 2) + 1] = objArr3[i2];
                                }
/* 619 */                       int i81 = i78 * 2;
/* 621 */                       obj = objArr3[i81];
/* 627 */                       if (obj instanceof Field) {
/* 637 */                           fieldI00IO12 = I00IO1(cls, (String) obj);
/* 641 */                           objArr3[i81] = fieldI00IO12;
                                } else {
/* 629 */                           fieldI00IO12 = (Field) obj;
                                }
/* 631 */                       i14 = i58;
/* 633 */                       int i82 = i2;
/* 648 */                       iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldI00IO12);
/* 649 */                       int i83 = i81 + 1;
/* 651 */                       obj2 = objArr3[i83];
/* 657 */                       if (obj2 instanceof Field) {
/* 664 */                           fieldI00IO13 = I00IO1(cls, (String) obj2);
/* 668 */                           objArr3[i83] = fieldI00IO13;
                                } else {
/* 659 */                           fieldI00IO13 = (Field) obj2;
                                }
/* 674 */                       iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldI00IO13);
/* 676 */                       i15 = iCharAt5;
/* 678 */                       i2 = i82;
/* 680 */                       i17 = i80;
/* 682 */                       i18 = 0;
                            }
/* 602 */                   i2 = i21;
/* 619 */                   int i812 = i78 * 2;
/* 621 */                   obj = objArr3[i812];
/* 627 */                   if (obj instanceof Field) {
                            }
/* 631 */                   i14 = i58;
/* 633 */                   int i822 = i2;
/* 648 */                   iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldI00IO12);
/* 649 */                   int i832 = i812 + 1;
/* 651 */                   obj2 = objArr3[i832];
/* 657 */                   if (obj2 instanceof Field) {
                            }
/* 674 */                   iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldI00IO13);
/* 676 */                   i15 = iCharAt5;
/* 678 */                   i2 = i822;
/* 680 */                   i17 = i80;
/* 682 */                   i18 = 0;
                        } else {
/* 685 */                   i14 = i58;
/* 687 */                   int i84 = i2 + 1;
/* 693 */                   Field fieldI00IO14 = I00IO1(cls, (String) objArr3[i2]);
/* 701 */                   if (i72 == 9 || i72 == 17) {
/* 829 */                       objArr2[((i62 / 3) * 2) + 1] = fieldI00IO14.getType();
                            } else {
/* 712 */                       if (i72 == 27 || i72 == 49) {
/* 813 */                           i19 = i2 + 2;
/* 817 */                           objArr2[((i62 / 3) * 2) + 1] = objArr3[i84];
                                } else if (i72 == 12 || i72 == 30 || i72 == 44) {
/* 783 */                           int i85 = i2;
/* 786 */                           if (oOlI0Ol.I00000oIO() == 1 || (iCharAt11 & Barcode.FORMAT_PDF417) != 0) {
/* 797 */                               i19 = i85 + 2;
/* 801 */                               objArr2[((i62 / 3) * 2) + 1] = objArr3[i84];
                                    }
                                } else if (i72 == 50) {
/* 739 */                           int i86 = i60 + 1;
/* 741 */                           iArr[i60] = i62;
/* 745 */                           int i87 = (i62 / 3) * 2;
/* 747 */                           int i88 = i2 + 2;
/* 751 */                           objArr2[i87] = objArr3[i84];
/* 757 */                           if ((iCharAt11 & Barcode.FORMAT_PDF417) != 0) {
/* 761 */                               i16 = i2 + 3;
/* 765 */                               objArr2[i87 + 1] = objArr3[i88];
/* 767 */                               i15 = iCharAt5;
                                    } else {
/* 772 */                               i15 = iCharAt5;
/* 774 */                               i16 = i88;
                                    }
/* 769 */                           i60 = i86;
/* 839 */                           iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldI00IO14);
/* 842 */                           if ((iCharAt11 & Barcode.FORMAT_AZTEC) == 0 || i72 > 17) {
/* 918 */                               iObjectFieldOffset2 = 1048575;
/* 921 */                               i17 = i13;
/* 923 */                               i18 = 0;
                                    } else {
/* 848 */                               int i89 = i13 + 1;
/* 850 */                               int iCharAt13 = str.charAt(i13);
/* 857 */                               if (iCharAt13 >= 55296) {
/* 859 */                                   int i90 = iCharAt13 & 8191;
/* 861 */                                   int i91 = 13;
                                            while (true) {
/* 863 */                                       i17 = i89 + 1;
/* 865 */                                       cCharAt9 = str.charAt(i89);
/* 869 */                                       if (cCharAt9 < 55296) {
                                                    break;
                                                }
/* 875 */                                       i90 |= (cCharAt9 & 8191) << i91;
/* 876 */                                       i91 += 13;
/* 878 */                                       i89 = i17;
                                            }
/* 883 */                                   iCharAt13 = i90 | (cCharAt9 << i91);
                                        } else {
/* 885 */                                   i17 = i89;
                                        }
/* 891 */                               int i92 = (iCharAt13 / 32) + (i71 * 2);
/* 893 */                               Object obj3 = objArr3[i92];
/* 897 */                               if (obj3 instanceof Field) {
/* 899 */                                   fieldI00IO1 = (Field) obj3;
                                        } else {
/* 904 */                                   fieldI00IO1 = I00IO1(cls, (String) obj3);
/* 908 */                                   objArr3[i92] = fieldI00IO1;
                                        }
/* 914 */                               iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldI00IO1);
/* 915 */                               i18 = iCharAt13 % 32;
                                    }
/* 926 */                           if (i72 >= 18 && i72 <= 49) {
/* 934 */                               iArr[i59] = iObjectFieldOffset;
/* 932 */                               i59++;
                                    }
/* 938 */                           i2 = i16;
/* 939 */                           iObjectFieldOffset3 = iObjectFieldOffset;
                                }
/* 803 */                       i16 = i19;
/* 805 */                       i15 = iCharAt5;
/* 839 */                       iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldI00IO14);
/* 842 */                       if ((iCharAt11 & Barcode.FORMAT_AZTEC) == 0) {
/* 918 */                           iObjectFieldOffset2 = 1048575;
/* 921 */                           i17 = i13;
/* 923 */                           i18 = 0;
/* 926 */                           if (i72 >= 18) {
/* 934 */                               iArr[i59] = iObjectFieldOffset;
/* 932 */                               i59++;
                                    }
/* 938 */                           i2 = i16;
/* 939 */                           iObjectFieldOffset3 = iObjectFieldOffset;
                                }
                            }
/* 831 */                   i15 = iCharAt5;
/* 833 */                   i16 = i84;
/* 839 */                   iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldI00IO14);
/* 842 */                   if ((iCharAt11 & Barcode.FORMAT_AZTEC) == 0) {
                            }
                        }
/* 940 */               int i93 = i62 + 1;
/* 942 */               iArr3[i62] = i73;
/* 944 */               int i94 = i62 + 2;
/* 946 */               String str2 = str;
/* 981 */               iArr3[i93] = ((iCharAt11 & Barcode.FORMAT_PDF417) != 0 ? Integer.MIN_VALUE : 0) | ((iCharAt11 & Barcode.FORMAT_UPC_A) != 0 ? 536870912 : 0) | ((iCharAt11 & Barcode.FORMAT_QR_CODE) != 0 ? 268435456 : 0) | (i72 << 20) | iObjectFieldOffset3;
/* 983 */               i62 += 3;
/* 988 */               iArr3[i94] = (i18 << 20) | iObjectFieldOffset2;
/* 992 */               iCharAt5 = i15;
/* 994 */               str = str2;
/* 996 */               i28 = i71;
/* 998 */               length = i11;
/* 1000 */              i30 = i17;
/* 1002 */              objArr = objArr3;
/* 1004 */              i58 = i14;
                    }
/* 1014 */          O1lIoOI o1lIoOI = new O1lIoOI();
/* 1017 */          o1lIoOI.I00000oIO = iArr3;
/* 1019 */          o1lIoOI.I00000oOI = objArr2;
/* 1021 */          o1lIoOI.I0000Il00O = iCharAt;
/* 1023 */          o1lIoOI.I0000O = iCharAt2;
/* 1027 */          o1lIoOI.I0001Ioi1lo = i01Ilo0i instanceof Io00l0;
/* 1029 */          o1lIoOI.I000II = iArr;
/* 1031 */          o1lIoOI.I000O01llI0 = iCharAt5;
/* 1035 */          o1lIoOI.I000OOo1O = i58;
/* 1039 */          o1lIoOI.I000OiO = oIIi0ol;
/* 1043 */          o1lIoOI.I000iOII = o10I0o;
/* 1047 */          o1lIoOI.I000l1 = ooiO0oloIiI;
/* 1049 */          o1lIoOI.I0000oI00 = i01Ilo0i;
/* 1053 */          o1lIoOI.I000lI = o1Oi11o;
/* 1055 */          VarHandle.storeStoreFence();
/* 1058 */          return o1lIoOI;
                }

                public static long I001i1lo1io(int i) {
/* 5 */             return i & 1048575;
                }

                public static int I001iOo1i0O(long j, Object obj) {
/* 7 */             return ((Integer) OoilIIl.I000O01llI0(j, obj)).intValue();
                }

                public static long I001l0I00(long j, Object obj) {
/* 7 */             return ((Long) OoilIIl.I000O01llI0(j, obj)).longValue();
                }

                public static Field I00IO1(Class cls, String str) {
                    try {
/* 1 */                 return cls.getDeclaredField(str);
                    } catch (NoSuchFieldException unused) {
/* 6 */                 Field[] declaredFields = cls.getDeclaredFields();
/* 12 */                for (Field field : declaredFields) {
/* 24 */                    if (str.equals(field.getName())) {
/* 26 */                        return field;
                            }
                        }
/* 34 */                StringBuilder sbI001IIilI0O = IIlIOloOOO.I001IIilI0O("Field ", str, " for ");
/* 42 */                sbI001IIilI0O.append(cls.getName());
/* 47 */                sbI001IIilI0O.append(" not found. Known fields are ");
/* 54 */                IoOOl0iOl1io.I0001Ioi1lo(Arrays.toString(declaredFields), sbI001IIilI0O);
/* 57 */                return null;
                    }
                }

                public static int I00IioO0OiOi(int i) {
/* 4 */             return (i & 267386880) >>> 20;
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00000oIO(Object obj, Object obj2) {
                    Object obj3;
/* 1 */             int[] iArr = this.I00000oIO;
/* 7 */             if (!I00100l0(obj)) {
/* 472 */               IioIoO10iOiI.I000OiO("Mutating immutable message: ", obj);
/* 475 */               return;
                    }
/* 9 */             obj2.getClass();
/* 12 */            int i = 0;
/* 14 */            while (i < iArr.length) {
/* 16 */                int iI00IlilI0i0i = I00IlilI0i0i(i);
/* 23 */                long j = 1048575 & iI00IlilI0i0i;
/* 25 */                int i2 = iArr[i];
                        switch (I00IioO0OiOi(iI00IlilI0i0i)) {
                            case 0:
/* 442 */                       if (!I000o00OoI0I(i, obj2)) {
/* 38 */                            obj3 = obj;
                                    break;
                                } else {
/* 444 */                           Ooil0oIOI0l0 ooil0oIOI0l0 = OoilIIl.I0000Il00O;
/* 450 */                           obj3 = obj;
/* 451 */                           ooil0oIOI0l0.I000II(obj3, j, ooil0oIOI0l0.I0000Il00O(j, obj2));
/* 454 */                           I00IO1oi11O(i, obj3);
                                    break;
                                }
                            case 1:
/* 422 */                       if (I000o00OoI0I(i, obj2)) {
/* 424 */                           Ooil0oIOI0l0 ooil0oIOI0l02 = OoilIIl.I0000Il00O;
/* 430 */                           ooil0oIOI0l02.I000O01llI0(obj, j, ooil0oIOI0l02.I0000O(j, obj2));
/* 433 */                           I00IO1oi11O(i, obj);
                                }
/* 38 */                        obj3 = obj;
                                break;
                            case 2:
/* 404 */                       if (I000o00OoI0I(i, obj2)) {
/* 410 */                           OoilIIl.I000o00OoI0I(obj, j, OoilIIl.I000II(j, obj2));
/* 413 */                           I00IO1oi11O(i, obj);
                                }
/* 38 */                        obj3 = obj;
                                break;
                            case 3:
/* 386 */                       if (I000o00OoI0I(i, obj2)) {
/* 392 */                           OoilIIl.I000o00OoI0I(obj, j, OoilIIl.I000II(j, obj2));
/* 395 */                           I00IO1oi11O(i, obj);
                                }
/* 38 */                        obj3 = obj;
                                break;
                            case 4:
/* 368 */                       if (I000o00OoI0I(i, obj2)) {
/* 374 */                           OoilIIl.I000lI(obj, OoilIIl.I0001Ioi1lo(j, obj2), j);
/* 377 */                           I00IO1oi11O(i, obj);
                                }
/* 38 */                        obj3 = obj;
                                break;
                            case 5:
/* 350 */                       if (I000o00OoI0I(i, obj2)) {
/* 356 */                           OoilIIl.I000o00OoI0I(obj, j, OoilIIl.I000II(j, obj2));
/* 359 */                           I00IO1oi11O(i, obj);
                                }
/* 38 */                        obj3 = obj;
                                break;
                            case 6:
/* 332 */                       if (I000o00OoI0I(i, obj2)) {
/* 338 */                           OoilIIl.I000lI(obj, OoilIIl.I0001Ioi1lo(j, obj2), j);
/* 341 */                           I00IO1oi11O(i, obj);
                                }
/* 38 */                        obj3 = obj;
                                break;
                            case 7:
/* 312 */                       if (I000o00OoI0I(i, obj2)) {
/* 314 */                           Ooil0oIOI0l0 ooil0oIOI0l03 = OoilIIl.I0000Il00O;
/* 320 */                           ooil0oIOI0l03.I0000oI00(obj, j, ooil0oIOI0l03.I00000oIO(j, obj2));
/* 323 */                           I00IO1oi11O(i, obj);
                                }
/* 38 */                        obj3 = obj;
                                break;
                            case 8:
/* 294 */                       if (I000o00OoI0I(i, obj2)) {
/* 300 */                           OoilIIl.I000oI1ioi(obj, j, OoilIIl.I000O01llI0(j, obj2));
/* 303 */                           I00IO1oi11O(i, obj);
                                }
/* 38 */                        obj3 = obj;
                                break;
                            case 9:
/* 285 */                       I0010o(i, obj, obj2);
/* 38 */                        obj3 = obj;
                                break;
                            case 10:
/* 271 */                       if (I000o00OoI0I(i, obj2)) {
/* 277 */                           OoilIIl.I000oI1ioi(obj, j, OoilIIl.I000O01llI0(j, obj2));
/* 280 */                           I00IO1oi11O(i, obj);
                                }
/* 38 */                        obj3 = obj;
                                break;
                            case 11:
/* 253 */                       if (I000o00OoI0I(i, obj2)) {
/* 259 */                           OoilIIl.I000lI(obj, OoilIIl.I0001Ioi1lo(j, obj2), j);
/* 262 */                           I00IO1oi11O(i, obj);
                                }
/* 38 */                        obj3 = obj;
                                break;
                            case 12:
/* 235 */                       if (I000o00OoI0I(i, obj2)) {
/* 241 */                           OoilIIl.I000lI(obj, OoilIIl.I0001Ioi1lo(j, obj2), j);
/* 244 */                           I00IO1oi11O(i, obj);
                                }
/* 38 */                        obj3 = obj;
                                break;
                            case 13:
/* 217 */                       if (I000o00OoI0I(i, obj2)) {
/* 223 */                           OoilIIl.I000lI(obj, OoilIIl.I0001Ioi1lo(j, obj2), j);
/* 226 */                           I00IO1oi11O(i, obj);
                                }
/* 38 */                        obj3 = obj;
                                break;
                            case 14:
/* 199 */                       if (I000o00OoI0I(i, obj2)) {
/* 205 */                           OoilIIl.I000o00OoI0I(obj, j, OoilIIl.I000II(j, obj2));
/* 208 */                           I00IO1oi11O(i, obj);
                                }
/* 38 */                        obj3 = obj;
                                break;
                            case 15:
/* 181 */                       if (I000o00OoI0I(i, obj2)) {
/* 187 */                           OoilIIl.I000lI(obj, OoilIIl.I0001Ioi1lo(j, obj2), j);
/* 190 */                           I00IO1oi11O(i, obj);
                                }
/* 38 */                        obj3 = obj;
                                break;
                            case 16:
/* 163 */                       if (I000o00OoI0I(i, obj2)) {
/* 169 */                           OoilIIl.I000o00OoI0I(obj, j, OoilIIl.I000II(j, obj2));
/* 172 */                           I00IO1oi11O(i, obj);
                                }
/* 38 */                        obj3 = obj;
                                break;
                            case 17:
/* 155 */                       I0010o(i, obj, obj2);
/* 38 */                        obj3 = obj;
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
/* 104 */                       this.I000iOII.getClass();
/* 111 */                       Iool1O1Ol1i iool1O1Ol1iI0000oI00 = (Iool1O1Ol1i) OoilIIl.I000O01llI0(j, obj);
/* 117 */                       Iool1O1Ol1i iool1O1Ol1i = (Iool1O1Ol1i) OoilIIl.I000O01llI0(j, obj2);
/* 119 */                       int size = iool1O1Ol1iI0000oI00.size();
/* 123 */                       int size2 = iool1O1Ol1i.size();
/* 127 */                       if (size > 0 && size2 > 0) {
/* 136 */                           if (!((I01O1I1) iool1O1Ol1iI0000oI00).I00iOIl) {
/* 141 */                               iool1O1Ol1iI0000oI00 = ((OOiI0Oo) iool1O1Ol1iI0000oI00).I0000oI00(size2 + size);
                                    }
/* 145 */                           iool1O1Ol1iI0000oI00.addAll(iool1O1Ol1i);
                                }
/* 148 */                       if (size > 0) {
/* 150 */                           iool1O1Ol1i = iool1O1Ol1iI0000oI00;
                                }
/* 151 */                       OoilIIl.I000oI1ioi(obj, j, iool1O1Ol1i);
/* 38 */                        obj3 = obj;
                                break;
                            case 50:
/* 79 */                        O1Oi11o o1Oi11o = this.I000lI;
/* 81 */                        Class cls = OiOO1Ioo.I00000oIO;
/* 83 */                        Object objI000O01llI0 = OoilIIl.I000O01llI0(j, obj);
/* 87 */                        Object objI000O01llI02 = OoilIIl.I000O01llI0(j, obj2);
/* 91 */                        o1Oi11o.getClass();
/* 98 */                        OoilIIl.I000oI1ioi(obj, j, O1Oi11o.I00000oIO(objI000O01llI0, objI000O01llI02));
/* 38 */                        obj3 = obj;
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
/* 66 */                        if (I00100o1O0lo(obj2, i2, i)) {
/* 72 */                            OoilIIl.I000oI1ioi(obj, j, OoilIIl.I000O01llI0(j, obj2));
/* 75 */                            I00IOO(obj, i2, i);
                                }
/* 38 */                        obj3 = obj;
                                break;
                            case 60:
/* 58 */                        I00111O(i, obj, obj2);
/* 38 */                        obj3 = obj;
                                break;
                            case 61:
                            case 62:
                            case 63:
                            case Barcode.FORMAT_EAN_8:
                            case 65:
                            case 66:
                            case 67:
/* 45 */                        if (I00100o1O0lo(obj2, i2, i)) {
/* 51 */                            OoilIIl.I000oI1ioi(obj, j, OoilIIl.I000O01llI0(j, obj2));
/* 54 */                            I00IOO(obj, i2, i);
                                }
/* 38 */                        obj3 = obj;
                                break;
                            case 68:
/* 35 */                        I00111O(i, obj, obj2);
/* 38 */                        obj3 = obj;
                                break;
                        }
/* 457 */               i += 3;
/* 459 */               obj = obj3;
                    }
/* 465 */           OiOO1Ioo.I000iOII(this.I000l1, obj, obj2);
                }

                /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00000oOI(Object obj) {
/* 1 */             int[] iArr = this.I00000oIO;
/* 7 */             if (I00100l0(obj)) {
/* 14 */                if (obj instanceof Io00l0) {
/* 17 */                    Io00l0 io00l0 = (Io00l0) obj;
/* 22 */                    io00l0.I000l1(Integer.MAX_VALUE);
/* 25 */                    io00l0.memoizedHashCode = 0;
/* 27 */                    io00l0.I000O01llI0();
                        }
/* 30 */                int length = iArr.length;
/* 32 */                for (int i = 0; i < length; i += 3) {
/* 34 */                    int iI00IlilI0i0i = I00IlilI0i0i(i);
/* 41 */                    long j = 1048575 & iI00IlilI0i0i;
/* 43 */                    int iI00IioO0OiOi = I00IioO0OiOi(iI00IlilI0i0i);
/* 49 */                    Unsafe unsafe = I000oI1ioi;
/* 51 */                    if (iI00IioO0OiOi != 9) {
/* 55 */                        if (iI00IioO0OiOi != 60 && iI00IioO0OiOi != 68) {
                                    switch (iI00IioO0OiOi) {
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
/* 87 */                                    this.I000iOII.getClass();
/* 96 */                                    I01O1I1 i01o1i1 = (I01O1I1) ((Iool1O1Ol1i) OoilIIl.I000O01llI0(j, obj));
/* 100 */                                   if (i01o1i1.I00iOIl) {
/* 102 */                                       i01o1i1.I00iOIl = false;
                                                break;
                                            } else {
                                                break;
                                            }
                                        case 50:
/* 65 */                                    Object object = unsafe.getObject(obj, j);
/* 69 */                                    if (object != null) {
/* 73 */                                        this.I000lI.getClass();
/* 79 */                                        ((O1Oi011o) object).I00iOIl = false;
/* 81 */                                        unsafe.putObject(obj, j, object);
                                                break;
                                            } else {
                                                break;
                                            }
                                    }
                                } else if (I00100o1O0lo(obj, iArr[i], i)) {
/* 121 */                           I000lI(i).I00000oOI(unsafe.getObject(obj, j));
                                }
                            } else if (I000o00OoI0I(i, obj)) {
/* 139 */                       I000lI(i).I00000oOI(unsafe.getObject(obj, j));
                            }
                        }
/* 147 */               this.I000l1.getClass();
/* 152 */               OoiO0l ooiO0l = ((Io00l0) obj).unknownFields;
/* 156 */               if (ooiO0l.I0000oI00) {
/* 158 */                   ooiO0l.I0000oI00 = false;
                        }
                    }
                }

                @Override
                public final boolean I0000Il00O(Object obj) {
                    int i;
                    int i2;
                    int i3;
/* 5 */             int[] iArr = this.I00000oIO;
/* 11 */            int i4 = 1048575;
/* 12 */            int i5 = 0;
/* 13 */            int i6 = 0;
/* 17 */            while (i6 < this.I000O01llI0) {
/* 21 */                int i7 = this.I000II[i6];
/* 23 */                int i8 = iArr[i7];
/* 25 */                int iI00IlilI0i0i = I00IlilI0i0i(i7);
/* 31 */                int i9 = iArr[i7 + 2];
/* 33 */                int i10 = i9 & 1048575;
/* 37 */                int i11 = 1 << (i9 >>> 20);
/* 38 */                if (i10 != i4) {
/* 40 */                    if (i10 != 1048575) {
/* 45 */                        i5 = I000oI1ioi.getInt(obj, i10);
                            }
/* 49 */                    i2 = i7;
/* 50 */                    i3 = i5;
/* 51 */                    i = i10;
                        } else {
/* 53 */                    int i12 = i5;
/* 55 */                    i = i4;
/* 56 */                    i2 = i7;
/* 57 */                    i3 = i12;
                        }
/* 62 */                if ((268435456 & iI00IlilI0i0i) == 0 || I000oI1ioi(obj, i2, i, i3, i11)) {
/* 72 */                    int iI00IioO0OiOi = I00IioO0OiOi(iI00IlilI0i0i);
/* 78 */                    if (iI00IioO0OiOi != 9 && iI00IioO0OiOi != 17) {
/* 86 */                        if (iI00IioO0OiOi != 27) {
/* 90 */                            if (iI00IioO0OiOi == 60 || iI00IioO0OiOi == 68) {
/* 194 */                               if (!I00100o1O0lo(obj, i8, i2) || I000lI(i2).I0000Il00O(OoilIIl.I000O01llI0(iI00IlilI0i0i & 1048575, obj))) {
/* 279 */                                   i6++;
/* 281 */                                   i4 = i;
/* 282 */                                   i5 = i3;
                                        }
                                    } else if (iI00IioO0OiOi != 49) {
/* 102 */                               if (iI00IioO0OiOi != 50) {
                                            continue;
                                        } else {
/* 106 */                                   O1Oi11o o1Oi11o = this.I000lI;
/* 111 */                                   Object objI000O01llI0 = OoilIIl.I000O01llI0(iI00IlilI0i0i & 1048575, obj);
/* 115 */                                   o1Oi11o.getClass();
/* 118 */                                   O1Oi011o o1Oi011o = (O1Oi011o) objI000O01llI0;
/* 124 */                                   if (!o1Oi011o.isEmpty() && ((i011lOoO) ((O1OOilo1l) this.I00000oOI[(i2 / 3) * 2]).I00000oIO.I00iiO).I00iOIl == i011o0I1Io.I00l0I0l0lO1) {
/* 160 */                                       OiOIlIo oiOIlIoI00000oIO = null;
/* 165 */                                       for (Object obj2 : o1Oi011o.values()) {
/* 171 */                                           if (oiOIlIoI00000oIO == null) {
/* 179 */                                               oiOIlIoI00000oIO = OOi1oI.I0000Il00O.I00000oIO(obj2.getClass());
                                                    }
/* 187 */                                           if (!oiOIlIoI00000oIO.I0000Il00O(obj2)) {
                                                    }
                                                }
                                            }
                                        }
/* 279 */                               i6++;
/* 281 */                               i4 = i;
/* 282 */                               i5 = i3;
                                    }
                                }
/* 221 */                       List list = (List) OoilIIl.I000O01llI0(iI00IlilI0i0i & 1048575, obj);
/* 227 */                       if (list.isEmpty()) {
                                    continue;
                                } else {
/* 230 */                           OiOIlIo oiOIlIoI000lI = I000lI(i2);
/* 239 */                           for (int i13 = 0; i13 < list.size(); i13++) {
/* 249 */                               if (oiOIlIoI000lI.I0000Il00O(list.get(i13))) {
                                        }
                                    }
                                }
/* 279 */                       i6++;
/* 281 */                       i4 = i;
/* 282 */                       i5 = i3;
                            } else if (!I000oI1ioi(obj, i2, i, i3, i11) || I000lI(i2).I0000Il00O(OoilIIl.I000O01llI0(iI00IlilI0i0i & 1048575, obj))) {
/* 279 */                       i6++;
/* 281 */                       i4 = i;
/* 282 */                       i5 = i3;
                            }
                        }
/* 10 */                return false;
                    }
/* 16 */            return true;
                }

                @Override
                public final Io00l0 I0000O() {
/* 1 */             OIIi0ol oIIi0ol = this.I000OiO;
/* 3 */             I01Ilo0i i01Ilo0i = this.I0000oI00;
/* 5 */             oIIi0ol.getClass();
/* 10 */            return ((Io00l0) i01Ilo0i).I000OiO();
                }

                /* JADX WARN: Removed duplicated region for block: B:157:0x082a A[Catch: all -> 0x0507, TryCatch #0 {all -> 0x0507, blocks: (B:155:0x0825, B:157:0x082a, B:158:0x082f, B:113:0x0502, B:116:0x050a, B:117:0x0522, B:118:0x053a, B:119:0x0552, B:120:0x056a, B:121:0x0582, B:122:0x059a, B:123:0x05b2, B:124:0x05ca, B:125:0x05f2, B:126:0x0613, B:127:0x0634, B:128:0x0654, B:129:0x0675, B:130:0x0699, B:131:0x06ba, B:132:0x06d3, B:133:0x06fb, B:134:0x070c, B:135:0x072f, B:136:0x0750, B:137:0x0770, B:138:0x0791, B:139:0x07b2, B:140:0x07d3, B:141:0x07f5, B:147:0x0816), top: B:177:0x0825 }] */
                /* JADX WARN: Removed duplicated region for block: B:169:0x0854 A[LOOP:3: B:168:0x0852->B:169:0x0854, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:171:0x085e  */
                /* JADX WARN: Removed duplicated region for block: B:206:0x0836 A[SYNTHETIC] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I0000oI00(Object obj, IOOOi1 iOOOi1, Il1llli0O1 il1llli0O1) throws Throwable {
                    O1lIoOI o1lIoOI;
                    int i;
                    int i2;
                    O10I0o o10I0o;
                    IOOOi1 iOOOi12;
                    Il1llli0O1 il1llli0O12;
                    int iI00IioO0OiOi;
                    Unsafe unsafe;
/* 1 */             O1lIoOI o1lIoOI2 = this;
/* 3 */             Object obj2 = obj;
/* 5 */             IOOOi1 iOOOi13 = iOOOi1;
/* 7 */             Il1llli0O1 il1llli0O13 = il1llli0O1;
/* 9 */             il1llli0O13.getClass();
/* 16 */            if (!I00100l0(obj2)) {
/* 2154 */              IioIoO10iOiI.I000OiO("Mutating immutable message: ", obj2);
/* 2157 */              return;
                    }
/* 18 */            OoiO0oloIiI ooiO0oloIiI = o1lIoOI2.I000l1;
/* 20 */            int[] iArr = o1lIoOI2.I000II;
/* 22 */            int i3 = o1lIoOI2.I000OOo1O;
/* 24 */            int i4 = o1lIoOI2.I000O01llI0;
/* 26 */            O10I0o o10I0o2 = o1lIoOI2.I000iOII;
/* 29 */            OoiO0l ooiO0lI00000oIO = null;
                    while (true) {
                        try {
/* 30 */                    int iI0000O = iOOOi13.I0000O();
/* 34 */                    int iI001lIiIIo1O = o1lIoOI2.I001lIiIIo1O(iI0000O);
/* 39 */                    if (iI001lIiIIo1O >= 0) {
/* 105 */                       int iI00IlilI0i0i = o1lIoOI2.I00IlilI0i0i(iI001lIiIIo1O);
                                try {
/* 109 */                           iI00IioO0OiOi = I00IioO0OiOi(iI00IlilI0i0i);
/* 116 */                           unsafe = I000oI1ioi;
                                } catch (O000o1i unused) {
/* 133 */                           o1lIoOI = o1lIoOI2;
/* 134 */                           i = i4;
/* 136 */                           o10I0o = o10I0o2;
                                }
                                switch (iI00IioO0OiOi) {
                                    case 0:
/* 2040 */                              i = i4;
/* 2042 */                              o10I0o = o10I0o2;
/* 2044 */                              o1lIoOI = o1lIoOI2;
/* 2045 */                              iOOOi12 = iOOOi13;
/* 2046 */                              il1llli0O12 = il1llli0O13;
/* 2047 */                              long jI001i1lo1io = I001i1lo1io(iI00IlilI0i0i);
/* 2051 */                              iOOOi12.I00ilI0I1(1);
                                        try {
                                            try {
/* 2067 */                                      OoilIIl.I0000Il00O.I000II(obj, jI001i1lo1io, ((IOOOI0) iOOOi12.I0000oI00).I00100o1O0lo());
/* 2070 */                                      obj2 = obj;
/* 2071 */                                      o1lIoOI.I00IO1oi11O(iI001lIiIIo1O, obj2);
                                            } catch (O000o1i unused2) {
/* 2078 */                                      obj2 = obj;
                                                try {
/* 2086 */                                          ooiO0oloIiI.getClass();
/* 2089 */                                          if (ooiO0lI00000oIO == null) {
                                                    }
/* 2101 */                                          if (!OoiO0oloIiI.I00000oOI(0, iOOOi12, ooiO0lI00000oIO)) {
                                                    }
/* 2120 */                                          o1lIoOI2 = o1lIoOI;
/* 2121 */                                          iOOOi13 = iOOOi12;
/* 2122 */                                          il1llli0O13 = il1llli0O12;
/* 2123 */                                          i4 = i;
/* 2125 */                                          o10I0o2 = o10I0o;
                                                } catch (Throwable th) {
/* 1288 */                                          th = th;
/* 2131 */                                          for (i2 = i; i2 < i3; i2++) {
/* 2135 */                                              o1lIoOI.I000iOII(iArr[i2], obj2, ooiO0lI00000oIO);
                                                    }
/* 2141 */                                          if (ooiO0lI00000oIO != null) {
/* 2143 */                                              ooiO0oloIiI.getClass();
/* 2149 */                                              ((Io00l0) obj2).unknownFields = ooiO0lI00000oIO;
                                                    }
/* 2151 */                                          throw th;
                                                }
                                            } catch (Throwable th2) {
/* 2075 */                                      th = th2;
/* 2076 */                                      obj2 = obj;
/* 2131 */                                      while (i2 < i3) {
                                                }
/* 2141 */                                      if (ooiO0lI00000oIO != null) {
                                                }
/* 2151 */                                      throw th;
                                            }
                                        } catch (O000o1i unused3) {
/* 2084 */                                  obj2 = obj;
                                        } catch (Throwable th3) {
/* 2080 */                                  th = th3;
/* 2081 */                                  obj2 = obj;
                                        }
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                        break;
                                    case 1:
/* 2006 */                              i = i4;
/* 2008 */                              o10I0o = o10I0o2;
/* 2010 */                              o1lIoOI = o1lIoOI2;
/* 2011 */                              iOOOi12 = iOOOi13;
/* 2012 */                              il1llli0O12 = il1llli0O13;
/* 2013 */                              long jI001i1lo1io2 = I001i1lo1io(iI00IlilI0i0i);
/* 2018 */                              iOOOi12.I00ilI0I1(5);
/* 2031 */                              OoilIIl.I0000Il00O.I000O01llI0(obj2, jI001i1lo1io2, ((IOOOI0) iOOOi12.I0000oI00).I001IIilI0O());
/* 2034 */                              o1lIoOI.I00IO1oi11O(iI001lIiIIo1O, obj2);
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case 2:
/* 1973 */                              i = i4;
/* 1975 */                              o10I0o = o10I0o2;
/* 1977 */                              o1lIoOI = o1lIoOI2;
/* 1978 */                              iOOOi12 = iOOOi13;
/* 1979 */                              il1llli0O12 = il1llli0O13;
/* 1980 */                              long jI001i1lo1io3 = I001i1lo1io(iI00IlilI0i0i);
/* 1985 */                              iOOOi12.I00ilI0I1(0);
/* 1996 */                              OoilIIl.I000o00OoI0I(obj2, jI001i1lo1io3, ((IOOOI0) iOOOi12.I0000oI00).I001i1O0Ol());
/* 1999 */                              o1lIoOI.I00IO1oi11O(iI001lIiIIo1O, obj2);
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case 3:
/* 1940 */                              i = i4;
/* 1942 */                              o10I0o = o10I0o2;
/* 1944 */                              o1lIoOI = o1lIoOI2;
/* 1945 */                              iOOOi12 = iOOOi13;
/* 1946 */                              il1llli0O12 = il1llli0O13;
/* 1947 */                              long jI001i1lo1io4 = I001i1lo1io(iI00IlilI0i0i);
/* 1952 */                              iOOOi12.I00ilI0I1(0);
/* 1963 */                              OoilIIl.I000o00OoI0I(obj2, jI001i1lo1io4, ((IOOOI0) iOOOi12.I0000oI00).I00IO1());
/* 1966 */                              o1lIoOI.I00IO1oi11O(iI001lIiIIo1O, obj2);
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case 4:
/* 1907 */                              i = i4;
/* 1909 */                              o10I0o = o10I0o2;
/* 1911 */                              o1lIoOI = o1lIoOI2;
/* 1912 */                              iOOOi12 = iOOOi13;
/* 1913 */                              il1llli0O12 = il1llli0O13;
/* 1914 */                              long jI001i1lo1io5 = I001i1lo1io(iI00IlilI0i0i);
/* 1919 */                              iOOOi12.I00ilI0I1(0);
/* 1930 */                              OoilIIl.I000lI(obj2, ((IOOOI0) iOOOi12.I0000oI00).I001IO000(), jI001i1lo1io5);
/* 1933 */                              o1lIoOI.I00IO1oi11O(iI001lIiIIo1O, obj2);
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case 5:
/* 1875 */                              i = i4;
/* 1877 */                              o10I0o = o10I0o2;
/* 1879 */                              o1lIoOI = o1lIoOI2;
/* 1880 */                              iOOOi12 = iOOOi13;
/* 1881 */                              il1llli0O12 = il1llli0O13;
/* 1882 */                              long jI001i1lo1io6 = I001i1lo1io(iI00IlilI0i0i);
/* 1886 */                              iOOOi12.I00ilI0I1(1);
/* 1897 */                              OoilIIl.I000o00OoI0I(obj2, jI001i1lo1io6, ((IOOOI0) iOOOi12.I0000oI00).I00111O());
/* 1900 */                              o1lIoOI.I00IO1oi11O(iI001lIiIIo1O, obj2);
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case 6:
/* 1842 */                              i = i4;
/* 1844 */                              o10I0o = o10I0o2;
/* 1846 */                              o1lIoOI = o1lIoOI2;
/* 1847 */                              iOOOi12 = iOOOi13;
/* 1848 */                              il1llli0O12 = il1llli0O13;
/* 1849 */                              long jI001i1lo1io7 = I001i1lo1io(iI00IlilI0i0i);
/* 1854 */                              iOOOi12.I00ilI0I1(5);
/* 1865 */                              OoilIIl.I000lI(obj2, ((IOOOI0) iOOOi12.I0000oI00).I0010o(), jI001i1lo1io7);
/* 1868 */                              o1lIoOI.I00IO1oi11O(iI001lIiIIo1O, obj2);
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case 7:
/* 1807 */                              i = i4;
/* 1809 */                              o10I0o = o10I0o2;
/* 1811 */                              o1lIoOI = o1lIoOI2;
/* 1812 */                              iOOOi12 = iOOOi13;
/* 1813 */                              il1llli0O12 = il1llli0O13;
/* 1814 */                              long jI001i1lo1io8 = I001i1lo1io(iI00IlilI0i0i);
/* 1819 */                              iOOOi12.I00ilI0I1(0);
/* 1832 */                              OoilIIl.I0000Il00O.I0000oI00(obj2, jI001i1lo1io8, ((IOOOI0) iOOOi12.I0000oI00).I000o00OoI0I());
/* 1835 */                              o1lIoOI.I00IO1oi11O(iI001lIiIIo1O, obj2);
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case 8:
/* 1790 */                              i = i4;
/* 1792 */                              o10I0o = o10I0o2;
/* 1794 */                              o1lIoOI = o1lIoOI2;
/* 1795 */                              iOOOi12 = iOOOi13;
/* 1796 */                              il1llli0O12 = il1llli0O13;
/* 1797 */                              o1lIoOI.I00II0Ol1O0l(iI00IlilI0i0i, iOOOi12, obj2);
/* 1800 */                              o1lIoOI.I00IO1oi11O(iI001lIiIIo1O, obj2);
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case 9:
/* 1748 */                              o1lIoOI = o1lIoOI2;
/* 1750 */                              i = i4;
/* 1752 */                              o10I0o = o10I0o2;
/* 1754 */                              iOOOi12 = iOOOi13;
/* 1755 */                              il1llli0O12 = il1llli0O13;
/* 1760 */                              I01Ilo0i i01Ilo0i = (I01Ilo0i) o1lIoOI.I001IIilI0O(iI001lIiIIo1O, obj2);
/* 1762 */                              OiOIlIo oiOIlIoI000lI = o1lIoOI.I000lI(iI001lIiIIo1O);
/* 1767 */                              iOOOi12.I00ilI0I1(2);
/* 1770 */                              iOOOi12.I000l1(i01Ilo0i, oiOIlIoI000lI, il1llli0O12);
/* 1780 */                              unsafe.putObject(obj2, o1lIoOI.I00IlilI0i0i(iI001lIiIIo1O) & 1048575, i01Ilo0i);
/* 1783 */                              o1lIoOI.I00IO1oi11O(iI001lIiIIo1O, obj2);
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case 10:
/* 1725 */                              i = i4;
/* 1727 */                              o10I0o = o10I0o2;
/* 1729 */                              o1lIoOI = o1lIoOI2;
/* 1730 */                              iOOOi12 = iOOOi13;
/* 1731 */                              il1llli0O12 = il1llli0O13;
/* 1740 */                              OoilIIl.I000oI1ioi(obj2, I001i1lo1io(iI00IlilI0i0i), iOOOi12.I00100o1O0lo());
/* 1743 */                              o1lIoOI.I00IO1oi11O(iI001lIiIIo1O, obj2);
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case 11:
/* 1692 */                              i = i4;
/* 1694 */                              o10I0o = o10I0o2;
/* 1696 */                              o1lIoOI = o1lIoOI2;
/* 1697 */                              iOOOi12 = iOOOi13;
/* 1698 */                              il1llli0O12 = il1llli0O13;
/* 1699 */                              long jI001i1lo1io9 = I001i1lo1io(iI00IlilI0i0i);
/* 1704 */                              iOOOi12.I00ilI0I1(0);
/* 1715 */                              OoilIIl.I000lI(obj2, ((IOOOI0) iOOOi12.I0000oI00).I00II0oii1o(), jI001i1lo1io9);
/* 1718 */                              o1lIoOI.I00IO1oi11O(iI001lIiIIo1O, obj2);
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case 12:
/* 1656 */                              i = i4;
/* 1658 */                              o10I0o = o10I0o2;
/* 1661 */                              o1lIoOI = o1lIoOI2;
/* 1662 */                              iOOOi12 = iOOOi13;
/* 1663 */                              il1llli0O12 = il1llli0O13;
/* 1664 */                              iOOOi12.I00ilI0I1(0);
/* 1671 */                              int iI0010I0i = ((IOOOI0) iOOOi12.I0000oI00).I0010I0i();
/* 1675 */                              o1lIoOI.I000l1(iI001lIiIIo1O);
/* 1682 */                              OoilIIl.I000lI(obj2, iI0010I0i, I001i1lo1io(iI00IlilI0i0i));
/* 1685 */                              o1lIoOI.I00IO1oi11O(iI001lIiIIo1O, obj2);
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case 13:
/* 1623 */                              i = i4;
/* 1625 */                              o10I0o = o10I0o2;
/* 1627 */                              o1lIoOI = o1lIoOI2;
/* 1628 */                              iOOOi12 = iOOOi13;
/* 1629 */                              il1llli0O12 = il1llli0O13;
/* 1630 */                              long jI001i1lo1io10 = I001i1lo1io(iI00IlilI0i0i);
/* 1635 */                              iOOOi12.I00ilI0I1(5);
/* 1646 */                              OoilIIl.I000lI(obj2, ((IOOOI0) iOOOi12.I0000oI00).I001i1lo1io(), jI001i1lo1io10);
/* 1649 */                              o1lIoOI.I00IO1oi11O(iI001lIiIIo1O, obj2);
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case 14:
/* 1591 */                              i = i4;
/* 1593 */                              o10I0o = o10I0o2;
/* 1595 */                              o1lIoOI = o1lIoOI2;
/* 1596 */                              iOOOi12 = iOOOi13;
/* 1597 */                              il1llli0O12 = il1llli0O13;
/* 1598 */                              long jI001i1lo1io11 = I001i1lo1io(iI00IlilI0i0i);
/* 1602 */                              iOOOi12.I00ilI0I1(1);
/* 1613 */                              OoilIIl.I000o00OoI0I(obj2, jI001i1lo1io11, ((IOOOI0) iOOOi12.I0000oI00).I001iOo1i0O());
/* 1616 */                              o1lIoOI.I00IO1oi11O(iI001lIiIIo1O, obj2);
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case 15:
/* 1558 */                              i = i4;
/* 1560 */                              o10I0o = o10I0o2;
/* 1562 */                              o1lIoOI = o1lIoOI2;
/* 1563 */                              iOOOi12 = iOOOi13;
/* 1564 */                              il1llli0O12 = il1llli0O13;
/* 1565 */                              long jI001i1lo1io12 = I001i1lo1io(iI00IlilI0i0i);
/* 1570 */                              iOOOi12.I00ilI0I1(0);
/* 1581 */                              OoilIIl.I000lI(obj2, ((IOOOI0) iOOOi12.I0000oI00).I001l0I00(), jI001i1lo1io12);
/* 1584 */                              o1lIoOI.I00IO1oi11O(iI001lIiIIo1O, obj2);
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case 16:
/* 1525 */                              i = i4;
/* 1527 */                              o10I0o = o10I0o2;
/* 1529 */                              o1lIoOI = o1lIoOI2;
/* 1530 */                              iOOOi12 = iOOOi13;
/* 1531 */                              il1llli0O12 = il1llli0O13;
/* 1532 */                              long jI001i1lo1io13 = I001i1lo1io(iI00IlilI0i0i);
/* 1537 */                              iOOOi12.I00ilI0I1(0);
/* 1548 */                              OoilIIl.I000o00OoI0I(obj2, jI001i1lo1io13, ((IOOOI0) iOOOi12.I0000oI00).I001lIiIIo1O());
/* 1551 */                              o1lIoOI.I00IO1oi11O(iI001lIiIIo1O, obj2);
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case 17:
/* 1483 */                              o1lIoOI = o1lIoOI2;
/* 1485 */                              i = i4;
/* 1487 */                              o10I0o = o10I0o2;
/* 1489 */                              iOOOi12 = iOOOi13;
/* 1490 */                              il1llli0O12 = il1llli0O13;
/* 1495 */                              I01Ilo0i i01Ilo0i2 = (I01Ilo0i) o1lIoOI.I001IIilI0O(iI001lIiIIo1O, obj2);
/* 1497 */                              OiOIlIo oiOIlIoI000lI2 = o1lIoOI.I000lI(iI001lIiIIo1O);
/* 1502 */                              iOOOi12.I00ilI0I1(3);
/* 1505 */                              iOOOi12.I000OOo1O(i01Ilo0i2, oiOIlIoI000lI2, il1llli0O12);
/* 1515 */                              unsafe.putObject(obj2, o1lIoOI.I00IlilI0i0i(iI001lIiIIo1O) & 1048575, i01Ilo0i2);
/* 1518 */                              o1lIoOI.I00IO1oi11O(iI001lIiIIo1O, obj2);
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case PoseLandmark.RIGHT_PINKY:
/* 1460 */                              i = i4;
/* 1462 */                              o10I0o = o10I0o2;
/* 1464 */                              o1lIoOI = o1lIoOI2;
/* 1465 */                              iOOOi12 = iOOOi13;
/* 1466 */                              il1llli0O12 = il1llli0O13;
/* 1467 */                              long jI001i1lo1io14 = I001i1lo1io(iI00IlilI0i0i);
/* 1471 */                              o10I0o.getClass();
/* 1478 */                              iOOOi12.I001i1O0Ol(O10I0o.I00000oIO(jI001i1lo1io14, obj2));
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case PoseLandmark.LEFT_INDEX:
/* 1436 */                              i = i4;
/* 1438 */                              o10I0o = o10I0o2;
/* 1440 */                              o1lIoOI = o1lIoOI2;
/* 1441 */                              iOOOi12 = iOOOi13;
/* 1442 */                              il1llli0O12 = il1llli0O13;
/* 1443 */                              long jI001i1lo1io15 = I001i1lo1io(iI00IlilI0i0i);
/* 1447 */                              o10I0o.getClass();
/* 1454 */                              iOOOi12.I00Io1lO(O10I0o.I00000oIO(jI001i1lo1io15, obj2));
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case PoseLandmark.RIGHT_INDEX:
/* 1412 */                              i = i4;
/* 1414 */                              o10I0o = o10I0o2;
/* 1416 */                              o1lIoOI = o1lIoOI2;
/* 1417 */                              iOOOi12 = iOOOi13;
/* 1418 */                              il1llli0O12 = il1llli0O13;
/* 1419 */                              long jI001i1lo1io16 = I001i1lo1io(iI00IlilI0i0i);
/* 1423 */                              o10I0o.getClass();
/* 1430 */                              iOOOi12.I00O0i0ii(O10I0o.I00000oIO(jI001i1lo1io16, obj2));
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case PoseLandmark.LEFT_THUMB:
/* 1388 */                              i = i4;
/* 1390 */                              o10I0o = o10I0o2;
/* 1392 */                              o1lIoOI = o1lIoOI2;
/* 1393 */                              iOOOi12 = iOOOi13;
/* 1394 */                              il1llli0O12 = il1llli0O13;
/* 1395 */                              long jI001i1lo1io17 = I001i1lo1io(iI00IlilI0i0i);
/* 1399 */                              o10I0o.getClass();
/* 1406 */                              iOOOi12.I00iiI(O10I0o.I00000oIO(jI001i1lo1io17, obj2));
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case PoseLandmark.RIGHT_THUMB:
/* 1364 */                              i = i4;
/* 1366 */                              o10I0o = o10I0o2;
/* 1368 */                              o1lIoOI = o1lIoOI2;
/* 1369 */                              iOOOi12 = iOOOi13;
/* 1370 */                              il1llli0O12 = il1llli0O13;
/* 1371 */                              long jI001i1lo1io18 = I001i1lo1io(iI00IlilI0i0i);
/* 1375 */                              o10I0o.getClass();
/* 1382 */                              iOOOi12.I00IoO0(O10I0o.I00000oIO(jI001i1lo1io18, obj2));
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case PoseLandmark.LEFT_HIP:
/* 1340 */                              i = i4;
/* 1342 */                              o10I0o = o10I0o2;
/* 1344 */                              o1lIoOI = o1lIoOI2;
/* 1345 */                              iOOOi12 = iOOOi13;
/* 1346 */                              il1llli0O12 = il1llli0O13;
/* 1347 */                              long jI001i1lo1io19 = I001i1lo1io(iI00IlilI0i0i);
/* 1351 */                              o10I0o.getClass();
/* 1358 */                              iOOOi12.I00IOO(O10I0o.I00000oIO(jI001i1lo1io19, obj2));
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case PoseLandmark.RIGHT_HIP:
/* 1316 */                              i = i4;
/* 1318 */                              o10I0o = o10I0o2;
/* 1320 */                              o1lIoOI = o1lIoOI2;
/* 1321 */                              iOOOi12 = iOOOi13;
/* 1322 */                              il1llli0O12 = il1llli0O13;
/* 1323 */                              long jI001i1lo1io20 = I001i1lo1io(iI00IlilI0i0i);
/* 1327 */                              o10I0o.getClass();
/* 1334 */                              iOOOi12.I00II0oii1o(O10I0o.I00000oIO(jI001i1lo1io20, obj2));
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case PoseLandmark.LEFT_KNEE:
/* 1292 */                              i = i4;
/* 1294 */                              o10I0o = o10I0o2;
/* 1296 */                              o1lIoOI = o1lIoOI2;
/* 1297 */                              iOOOi12 = iOOOi13;
/* 1298 */                              il1llli0O12 = il1llli0O13;
/* 1299 */                              long jI001i1lo1io21 = I001i1lo1io(iI00IlilI0i0i);
/* 1303 */                              o10I0o.getClass();
/* 1310 */                              iOOOi12.I000o00OoI0I(O10I0o.I00000oIO(jI001i1lo1io21, obj2));
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case PoseLandmark.RIGHT_KNEE:
/* 1276 */                              i = i4;
/* 1278 */                              o10I0o = o10I0o2;
/* 1280 */                              o1lIoOI = o1lIoOI2;
/* 1281 */                              iOOOi12 = iOOOi13;
/* 1282 */                              il1llli0O12 = il1llli0O13;
                                        try {
/* 1283 */                                  o1lIoOI.I00II0oii1o(iI00IlilI0i0i, iOOOi12, obj2);
                                        } catch (O000o1i unused4) {
/* 2086 */                                  ooiO0oloIiI.getClass();
/* 2089 */                                  if (ooiO0lI00000oIO == null) {
/* 2091 */                                      ooiO0lI00000oIO = OoiO0oloIiI.I00000oIO(obj2);
                                            }
/* 2101 */                                  if (!OoiO0oloIiI.I00000oOI(0, iOOOi12, ooiO0lI00000oIO)) {
/* 2105 */                                      for (int i5 = i; i5 < i3; i5++) {
/* 2109 */                                          o1lIoOI.I000iOII(iArr[i5], obj2, ooiO0lI00000oIO);
                                                }
/* 2115 */                                      if (ooiO0lI00000oIO == null) {
/* 2119 */                                          return;
                                                }
/* 64 */                                        ((Io00l0) obj2).unknownFields = ooiO0lI00000oIO;
/* 2119 */                                      return;
                                            }
/* 2120 */                                  o1lIoOI2 = o1lIoOI;
/* 2121 */                                  iOOOi13 = iOOOi12;
/* 2122 */                                  il1llli0O13 = il1llli0O12;
/* 2123 */                                  i4 = i;
/* 2125 */                                  o10I0o2 = o10I0o;
                                        }
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case 27:
/* 1252 */                              i = i4;
/* 1254 */                              o10I0o = o10I0o2;
                                        try {
/* 1263 */                                  o1lIoOI2.I001lloI(obj2, iI00IlilI0i0i, iOOOi13, o1lIoOI2.I000lI(iI001lIiIIo1O), il1llli0O1);
/* 1266 */                                  iOOOi12 = iOOOi13;
/* 1267 */                                  il1llli0O12 = il1llli0O1;
/* 1268 */                                  o1lIoOI = o1lIoOI2;
                                        } catch (O000o1i unused5) {
/* 1271 */                                  iOOOi12 = iOOOi13;
/* 1272 */                                  il1llli0O12 = il1llli0O1;
/* 778 */                                   o1lIoOI = o1lIoOI2;
/* 2086 */                                  ooiO0oloIiI.getClass();
/* 2089 */                                  if (ooiO0lI00000oIO == null) {
                                            }
/* 2101 */                                  if (!OoiO0oloIiI.I00000oOI(0, iOOOi12, ooiO0lI00000oIO)) {
                                            }
/* 2120 */                                  o1lIoOI2 = o1lIoOI;
/* 2121 */                                  iOOOi13 = iOOOi12;
/* 2122 */                                  il1llli0O13 = il1llli0O12;
/* 2123 */                                  i4 = i;
/* 2125 */                                  o10I0o2 = o10I0o;
                                        }
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                        break;
                                    case PoseLandmark.RIGHT_ANKLE:
/* 1231 */                              i = i4;
/* 1233 */                              o10I0o = o10I0o2;
/* 1235 */                              long jI001i1lo1io22 = I001i1lo1io(iI00IlilI0i0i);
/* 1239 */                              o10I0o.getClass();
/* 1246 */                              iOOOi13.I00111O(O10I0o.I00000oIO(jI001i1lo1io22, obj2));
/* 804 */                               il1llli0O12 = il1llli0O1;
/* 806 */                               o1lIoOI = o1lIoOI2;
/* 807 */                               iOOOi12 = iOOOi13;
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case PoseLandmark.LEFT_HEEL:
/* 1211 */                              i = i4;
/* 1213 */                              o10I0o = o10I0o2;
/* 1215 */                              long jI001i1lo1io23 = I001i1lo1io(iI00IlilI0i0i);
/* 1219 */                              o10I0o.getClass();
/* 1226 */                              iOOOi13.I00iIO(O10I0o.I00000oIO(jI001i1lo1io23, obj2));
/* 804 */                               il1llli0O12 = il1llli0O1;
/* 806 */                               o1lIoOI = o1lIoOI2;
/* 807 */                               iOOOi12 = iOOOi13;
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case 30:
/* 1185 */                              i = i4;
/* 1187 */                              o10I0o = o10I0o2;
/* 1189 */                              long jI001i1lo1io24 = I001i1lo1io(iI00IlilI0i0i);
/* 1193 */                              o10I0o.getClass();
/* 1196 */                              Iool1O1Ol1i iool1O1Ol1iI00000oIO = O10I0o.I00000oIO(jI001i1lo1io24, obj2);
/* 1200 */                              iOOOi13.I001l0I00(iool1O1Ol1iI00000oIO);
/* 1203 */                              o1lIoOI2.I000l1(iI001lIiIIo1O);
/* 1206 */                              OiOO1Ioo.I000OiO(obj2, iI0000O, iool1O1Ol1iI00000oIO, ooiO0lI00000oIO, ooiO0oloIiI);
/* 804 */                               il1llli0O12 = il1llli0O1;
/* 806 */                               o1lIoOI = o1lIoOI2;
/* 807 */                               iOOOi12 = iOOOi13;
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case PoseLandmark.LEFT_FOOT_INDEX:
/* 1164 */                              i = i4;
/* 1166 */                              o10I0o = o10I0o2;
/* 1168 */                              long jI001i1lo1io25 = I001i1lo1io(iI00IlilI0i0i);
/* 1172 */                              o10I0o.getClass();
/* 1179 */                              iOOOi13.I00OI1(O10I0o.I00000oIO(jI001i1lo1io25, obj2));
/* 804 */                               il1llli0O12 = il1llli0O1;
/* 806 */                               o1lIoOI = o1lIoOI2;
/* 807 */                               iOOOi12 = iOOOi13;
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case 32:
/* 1144 */                              i = i4;
/* 1146 */                              o10I0o = o10I0o2;
/* 1148 */                              long jI001i1lo1io26 = I001i1lo1io(iI00IlilI0i0i);
/* 1152 */                              o10I0o.getClass();
/* 1159 */                              iOOOi13.I00OIo(O10I0o.I00000oIO(jI001i1lo1io26, obj2));
/* 804 */                               il1llli0O12 = il1llli0O1;
/* 806 */                               o1lIoOI = o1lIoOI2;
/* 807 */                               iOOOi12 = iOOOi13;
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case 33:
/* 1124 */                              i = i4;
/* 1126 */                              o10I0o = o10I0o2;
/* 1128 */                              long jI001i1lo1io27 = I001i1lo1io(iI00IlilI0i0i);
/* 1132 */                              o10I0o.getClass();
/* 1139 */                              iOOOi13.I00Oio(O10I0o.I00000oIO(jI001i1lo1io27, obj2));
/* 804 */                               il1llli0O12 = il1llli0O1;
/* 806 */                               o1lIoOI = o1lIoOI2;
/* 807 */                               iOOOi12 = iOOOi13;
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case 34:
/* 1104 */                              i = i4;
/* 1106 */                              o10I0o = o10I0o2;
/* 1108 */                              long jI001i1lo1io28 = I001i1lo1io(iI00IlilI0i0i);
/* 1112 */                              o10I0o.getClass();
/* 1119 */                              iOOOi13.I00Ol1ll1(O10I0o.I00000oIO(jI001i1lo1io28, obj2));
/* 804 */                               il1llli0O12 = il1llli0O1;
/* 806 */                               o1lIoOI = o1lIoOI2;
/* 807 */                               iOOOi12 = iOOOi13;
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case InputImage.IMAGE_FORMAT_YUV_420_888:
/* 1084 */                              i = i4;
/* 1086 */                              o10I0o = o10I0o2;
/* 1088 */                              long jI001i1lo1io29 = I001i1lo1io(iI00IlilI0i0i);
/* 1092 */                              o10I0o.getClass();
/* 1099 */                              iOOOi13.I001i1O0Ol(O10I0o.I00000oIO(jI001i1lo1io29, obj2));
/* 804 */                               il1llli0O12 = il1llli0O1;
/* 806 */                               o1lIoOI = o1lIoOI2;
/* 807 */                               iOOOi12 = iOOOi13;
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case 36:
/* 1064 */                              i = i4;
/* 1066 */                              o10I0o = o10I0o2;
/* 1068 */                              long jI001i1lo1io30 = I001i1lo1io(iI00IlilI0i0i);
/* 1072 */                              o10I0o.getClass();
/* 1079 */                              iOOOi13.I00Io1lO(O10I0o.I00000oIO(jI001i1lo1io30, obj2));
/* 804 */                               il1llli0O12 = il1llli0O1;
/* 806 */                               o1lIoOI = o1lIoOI2;
/* 807 */                               iOOOi12 = iOOOi13;
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case 37:
/* 1044 */                              i = i4;
/* 1046 */                              o10I0o = o10I0o2;
/* 1048 */                              long jI001i1lo1io31 = I001i1lo1io(iI00IlilI0i0i);
/* 1052 */                              o10I0o.getClass();
/* 1059 */                              iOOOi13.I00O0i0ii(O10I0o.I00000oIO(jI001i1lo1io31, obj2));
/* 804 */                               il1llli0O12 = il1llli0O1;
/* 806 */                               o1lIoOI = o1lIoOI2;
/* 807 */                               iOOOi12 = iOOOi13;
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case 38:
/* 1024 */                              i = i4;
/* 1026 */                              o10I0o = o10I0o2;
/* 1028 */                              long jI001i1lo1io32 = I001i1lo1io(iI00IlilI0i0i);
/* 1032 */                              o10I0o.getClass();
/* 1039 */                              iOOOi13.I00iiI(O10I0o.I00000oIO(jI001i1lo1io32, obj2));
/* 804 */                               il1llli0O12 = il1llli0O1;
/* 806 */                               o1lIoOI = o1lIoOI2;
/* 807 */                               iOOOi12 = iOOOi13;
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case 39:
/* 1004 */                              i = i4;
/* 1006 */                              o10I0o = o10I0o2;
/* 1008 */                              long jI001i1lo1io33 = I001i1lo1io(iI00IlilI0i0i);
/* 1012 */                              o10I0o.getClass();
/* 1019 */                              iOOOi13.I00IoO0(O10I0o.I00000oIO(jI001i1lo1io33, obj2));
/* 804 */                               il1llli0O12 = il1llli0O1;
/* 806 */                               o1lIoOI = o1lIoOI2;
/* 807 */                               iOOOi12 = iOOOi13;
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case 40:
/* 984 */                               i = i4;
/* 986 */                               o10I0o = o10I0o2;
/* 988 */                               long jI001i1lo1io34 = I001i1lo1io(iI00IlilI0i0i);
/* 992 */                               o10I0o.getClass();
/* 999 */                               iOOOi13.I00IOO(O10I0o.I00000oIO(jI001i1lo1io34, obj2));
/* 804 */                               il1llli0O12 = il1llli0O1;
/* 806 */                               o1lIoOI = o1lIoOI2;
/* 807 */                               iOOOi12 = iOOOi13;
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case 41:
/* 964 */                               i = i4;
/* 966 */                               o10I0o = o10I0o2;
/* 968 */                               long jI001i1lo1io35 = I001i1lo1io(iI00IlilI0i0i);
/* 972 */                               o10I0o.getClass();
/* 979 */                               iOOOi13.I00II0oii1o(O10I0o.I00000oIO(jI001i1lo1io35, obj2));
/* 804 */                               il1llli0O12 = il1llli0O1;
/* 806 */                               o1lIoOI = o1lIoOI2;
/* 807 */                               iOOOi12 = iOOOi13;
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case 42:
/* 944 */                               i = i4;
/* 946 */                               o10I0o = o10I0o2;
/* 948 */                               long jI001i1lo1io36 = I001i1lo1io(iI00IlilI0i0i);
/* 952 */                               o10I0o.getClass();
/* 959 */                               iOOOi13.I000o00OoI0I(O10I0o.I00000oIO(jI001i1lo1io36, obj2));
/* 804 */                               il1llli0O12 = il1llli0O1;
/* 806 */                               o1lIoOI = o1lIoOI2;
/* 807 */                               iOOOi12 = iOOOi13;
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case 43:
/* 924 */                               i = i4;
/* 926 */                               o10I0o = o10I0o2;
/* 928 */                               long jI001i1lo1io37 = I001i1lo1io(iI00IlilI0i0i);
/* 932 */                               o10I0o.getClass();
/* 939 */                               iOOOi13.I00iIO(O10I0o.I00000oIO(jI001i1lo1io37, obj2));
/* 804 */                               il1llli0O12 = il1llli0O1;
/* 806 */                               o1lIoOI = o1lIoOI2;
/* 807 */                               iOOOi12 = iOOOi13;
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case 44:
/* 899 */                               i = i4;
/* 901 */                               o10I0o = o10I0o2;
/* 903 */                               long jI001i1lo1io38 = I001i1lo1io(iI00IlilI0i0i);
/* 907 */                               o10I0o.getClass();
/* 910 */                               Iool1O1Ol1i iool1O1Ol1iI00000oIO2 = O10I0o.I00000oIO(jI001i1lo1io38, obj2);
/* 914 */                               iOOOi13.I001l0I00(iool1O1Ol1iI00000oIO2);
/* 917 */                               o1lIoOI2.I000l1(iI001lIiIIo1O);
/* 920 */                               OiOO1Ioo.I000OiO(obj2, iI0000O, iool1O1Ol1iI00000oIO2, ooiO0lI00000oIO, ooiO0oloIiI);
/* 804 */                               il1llli0O12 = il1llli0O1;
/* 806 */                               o1lIoOI = o1lIoOI2;
/* 807 */                               iOOOi12 = iOOOi13;
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case BuildConfig.VERSION_CODE:
/* 879 */                               i = i4;
/* 881 */                               o10I0o = o10I0o2;
/* 883 */                               long jI001i1lo1io39 = I001i1lo1io(iI00IlilI0i0i);
/* 887 */                               o10I0o.getClass();
/* 894 */                               iOOOi13.I00OI1(O10I0o.I00000oIO(jI001i1lo1io39, obj2));
/* 804 */                               il1llli0O12 = il1llli0O1;
/* 806 */                               o1lIoOI = o1lIoOI2;
/* 807 */                               iOOOi12 = iOOOi13;
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case 46:
/* 860 */                               i = i4;
/* 862 */                               o10I0o = o10I0o2;
/* 864 */                               long jI001i1lo1io40 = I001i1lo1io(iI00IlilI0i0i);
/* 868 */                               o10I0o.getClass();
/* 875 */                               iOOOi13.I00OIo(O10I0o.I00000oIO(jI001i1lo1io40, obj2));
/* 804 */                               il1llli0O12 = il1llli0O1;
/* 806 */                               o1lIoOI = o1lIoOI2;
/* 807 */                               iOOOi12 = iOOOi13;
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case 47:
/* 841 */                               i = i4;
/* 843 */                               o10I0o = o10I0o2;
/* 845 */                               long jI001i1lo1io41 = I001i1lo1io(iI00IlilI0i0i);
/* 849 */                               o10I0o.getClass();
/* 856 */                               iOOOi13.I00Oio(O10I0o.I00000oIO(jI001i1lo1io41, obj2));
/* 804 */                               il1llli0O12 = il1llli0O1;
/* 806 */                               o1lIoOI = o1lIoOI2;
/* 807 */                               iOOOi12 = iOOOi13;
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case 48:
/* 816 */                               i = i4;
/* 818 */                               o10I0o = o10I0o2;
                                        try {
/* 820 */                                   long jI001i1lo1io42 = I001i1lo1io(iI00IlilI0i0i);
/* 824 */                                   o10I0o.getClass();
/* 831 */                                   iOOOi13.I00Ol1ll1(O10I0o.I00000oIO(jI001i1lo1io42, obj2));
/* 804 */                                   il1llli0O12 = il1llli0O1;
/* 806 */                                   o1lIoOI = o1lIoOI2;
/* 807 */                                   iOOOi12 = iOOOi13;
                                        } catch (O000o1i unused6) {
/* 835 */                                   il1llli0O12 = il1llli0O1;
/* 837 */                                   o1lIoOI = o1lIoOI2;
/* 838 */                                   iOOOi12 = iOOOi13;
/* 2086 */                                  ooiO0oloIiI.getClass();
/* 2089 */                                  if (ooiO0lI00000oIO == null) {
                                            }
/* 2101 */                                  if (!OoiO0oloIiI.I00000oOI(0, iOOOi12, ooiO0lI00000oIO)) {
                                            }
/* 2120 */                                  o1lIoOI2 = o1lIoOI;
/* 2121 */                                  iOOOi13 = iOOOi12;
/* 2122 */                                  il1llli0O13 = il1llli0O12;
/* 2123 */                                  i4 = i;
/* 2125 */                                  o10I0o2 = o10I0o;
                                        }
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                        break;
                                    case 49:
/* 782 */                               i = i4;
/* 784 */                               o10I0o = o10I0o2;
/* 794 */                               obj2 = obj;
                                        try {
/* 800 */                                   o1lIoOI2.I001lllioOl(obj2, I001i1lo1io(iI00IlilI0i0i), iOOOi1, o1lIoOI2.I000lI(iI001lIiIIo1O), il1llli0O1);
/* 803 */                                   iOOOi13 = iOOOi1;
/* 804 */                                   il1llli0O12 = il1llli0O1;
/* 806 */                                   o1lIoOI = o1lIoOI2;
/* 807 */                                   iOOOi12 = iOOOi13;
                                        } catch (O000o1i unused7) {
/* 810 */                                   il1llli0O12 = il1llli0O1;
/* 812 */                                   o1lIoOI = o1lIoOI2;
/* 813 */                                   iOOOi12 = iOOOi1;
/* 2086 */                                  ooiO0oloIiI.getClass();
/* 2089 */                                  if (ooiO0lI00000oIO == null) {
                                            }
/* 2101 */                                  if (!OoiO0oloIiI.I00000oOI(0, iOOOi12, ooiO0lI00000oIO)) {
                                            }
/* 2120 */                                  o1lIoOI2 = o1lIoOI;
/* 2121 */                                  iOOOi13 = iOOOi12;
/* 2122 */                                  il1llli0O13 = il1llli0O12;
/* 2123 */                                  i4 = i;
/* 2125 */                                  o10I0o2 = o10I0o;
                                        }
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                        break;
                                    case 50:
/* 739 */                               i = i4;
/* 741 */                               o10I0o = o10I0o2;
                                        try {
/* 755 */                                   o1lIoOI2.I0010I0i(obj2, iI001lIiIIo1O, o1lIoOI2.I00000oOI[(iI001lIiIIo1O / 3) * 2], il1llli0O13, iOOOi13);
/* 758 */                                   obj2 = obj;
/* 760 */                                   iOOOi12 = iOOOi1;
/* 762 */                                   il1llli0O12 = il1llli0O1;
/* 764 */                                   o1lIoOI = o1lIoOI2;
                                        } catch (O000o1i unused8) {
/* 772 */                                   obj2 = obj;
/* 774 */                                   iOOOi12 = iOOOi1;
/* 776 */                                   il1llli0O12 = il1llli0O1;
/* 778 */                                   o1lIoOI = o1lIoOI2;
/* 2086 */                                  ooiO0oloIiI.getClass();
/* 2089 */                                  if (ooiO0lI00000oIO == null) {
                                            }
/* 2101 */                                  if (!OoiO0oloIiI.I00000oOI(0, iOOOi12, ooiO0lI00000oIO)) {
                                            }
/* 2120 */                                  o1lIoOI2 = o1lIoOI;
/* 2121 */                                  iOOOi13 = iOOOi12;
/* 2122 */                                  il1llli0O13 = il1llli0O12;
/* 2123 */                                  i4 = i;
/* 2125 */                                  o10I0o2 = o10I0o;
                                        } catch (Throwable th4) {
/* 767 */                                   th = th4;
/* 768 */                                   obj2 = obj;
/* 210 */                                   o1lIoOI = o1lIoOI2;
/* 2131 */                                  while (i2 < i3) {
                                            }
/* 2141 */                                  if (ooiO0lI00000oIO != null) {
                                            }
/* 2151 */                                  throw th;
                                        }
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                        break;
                                    case 51:
/* 708 */                               i = i4;
/* 710 */                               o10I0o = o10I0o2;
/* 712 */                               long jI001i1lo1io43 = I001i1lo1io(iI00IlilI0i0i);
/* 716 */                               iOOOi13.I00ilI0I1(1);
/* 731 */                               OoilIIl.I000oI1ioi(obj2, jI001i1lo1io43, Double.valueOf(((IOOOI0) iOOOi13.I0000oI00).I00100o1O0lo()));
/* 734 */                               o1lIoOI2.I00IOO(obj2, iI0000O, iI001lIiIIo1O);
/* 205 */                               o1lIoOI = o1lIoOI2;
/* 206 */                               iOOOi12 = iOOOi13;
/* 207 */                               il1llli0O12 = il1llli0O13;
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case 52:
/* 676 */                               i = i4;
/* 678 */                               o10I0o = o10I0o2;
/* 680 */                               long jI001i1lo1io44 = I001i1lo1io(iI00IlilI0i0i);
/* 685 */                               iOOOi13.I00ilI0I1(5);
/* 700 */                               OoilIIl.I000oI1ioi(obj2, jI001i1lo1io44, Float.valueOf(((IOOOI0) iOOOi13.I0000oI00).I001IIilI0O()));
/* 703 */                               o1lIoOI2.I00IOO(obj2, iI0000O, iI001lIiIIo1O);
/* 205 */                               o1lIoOI = o1lIoOI2;
/* 206 */                               iOOOi12 = iOOOi13;
/* 207 */                               il1llli0O12 = il1llli0O13;
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case 53:
/* 644 */                               i = i4;
/* 646 */                               o10I0o = o10I0o2;
/* 648 */                               long jI001i1lo1io45 = I001i1lo1io(iI00IlilI0i0i);
/* 653 */                               iOOOi13.I00ilI0I1(0);
/* 668 */                               OoilIIl.I000oI1ioi(obj2, jI001i1lo1io45, Long.valueOf(((IOOOI0) iOOOi13.I0000oI00).I001i1O0Ol()));
/* 671 */                               o1lIoOI2.I00IOO(obj2, iI0000O, iI001lIiIIo1O);
/* 205 */                               o1lIoOI = o1lIoOI2;
/* 206 */                               iOOOi12 = iOOOi13;
/* 207 */                               il1llli0O12 = il1llli0O13;
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case 54:
/* 612 */                               i = i4;
/* 614 */                               o10I0o = o10I0o2;
/* 616 */                               long jI001i1lo1io46 = I001i1lo1io(iI00IlilI0i0i);
/* 621 */                               iOOOi13.I00ilI0I1(0);
/* 636 */                               OoilIIl.I000oI1ioi(obj2, jI001i1lo1io46, Long.valueOf(((IOOOI0) iOOOi13.I0000oI00).I00IO1()));
/* 639 */                               o1lIoOI2.I00IOO(obj2, iI0000O, iI001lIiIIo1O);
/* 205 */                               o1lIoOI = o1lIoOI2;
/* 206 */                               iOOOi12 = iOOOi13;
/* 207 */                               il1llli0O12 = il1llli0O13;
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case 55:
/* 580 */                               i = i4;
/* 582 */                               o10I0o = o10I0o2;
/* 584 */                               long jI001i1lo1io47 = I001i1lo1io(iI00IlilI0i0i);
/* 589 */                               iOOOi13.I00ilI0I1(0);
/* 604 */                               OoilIIl.I000oI1ioi(obj2, jI001i1lo1io47, Integer.valueOf(((IOOOI0) iOOOi13.I0000oI00).I001IO000()));
/* 607 */                               o1lIoOI2.I00IOO(obj2, iI0000O, iI001lIiIIo1O);
/* 205 */                               o1lIoOI = o1lIoOI2;
/* 206 */                               iOOOi12 = iOOOi13;
/* 207 */                               il1llli0O12 = il1llli0O13;
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case 56:
/* 549 */                               i = i4;
/* 551 */                               o10I0o = o10I0o2;
/* 553 */                               long jI001i1lo1io48 = I001i1lo1io(iI00IlilI0i0i);
/* 557 */                               iOOOi13.I00ilI0I1(1);
/* 572 */                               OoilIIl.I000oI1ioi(obj2, jI001i1lo1io48, Long.valueOf(((IOOOI0) iOOOi13.I0000oI00).I00111O()));
/* 575 */                               o1lIoOI2.I00IOO(obj2, iI0000O, iI001lIiIIo1O);
/* 205 */                               o1lIoOI = o1lIoOI2;
/* 206 */                               iOOOi12 = iOOOi13;
/* 207 */                               il1llli0O12 = il1llli0O13;
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case 57:
/* 517 */                               i = i4;
/* 519 */                               o10I0o = o10I0o2;
/* 521 */                               long jI001i1lo1io49 = I001i1lo1io(iI00IlilI0i0i);
/* 526 */                               iOOOi13.I00ilI0I1(5);
/* 541 */                               OoilIIl.I000oI1ioi(obj2, jI001i1lo1io49, Integer.valueOf(((IOOOI0) iOOOi13.I0000oI00).I0010o()));
/* 544 */                               o1lIoOI2.I00IOO(obj2, iI0000O, iI001lIiIIo1O);
/* 205 */                               o1lIoOI = o1lIoOI2;
/* 206 */                               iOOOi12 = iOOOi13;
/* 207 */                               il1llli0O12 = il1llli0O13;
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case 58:
/* 485 */                               i = i4;
/* 487 */                               o10I0o = o10I0o2;
/* 489 */                               long jI001i1lo1io50 = I001i1lo1io(iI00IlilI0i0i);
/* 494 */                               iOOOi13.I00ilI0I1(0);
/* 509 */                               OoilIIl.I000oI1ioi(obj2, jI001i1lo1io50, Boolean.valueOf(((IOOOI0) iOOOi13.I0000oI00).I000o00OoI0I()));
/* 512 */                               o1lIoOI2.I00IOO(obj2, iI0000O, iI001lIiIIo1O);
/* 205 */                               o1lIoOI = o1lIoOI2;
/* 206 */                               iOOOi12 = iOOOi13;
/* 207 */                               il1llli0O12 = il1llli0O13;
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case 59:
/* 473 */                               i = i4;
/* 475 */                               o10I0o = o10I0o2;
/* 477 */                               o1lIoOI2.I00II0Ol1O0l(iI00IlilI0i0i, iOOOi13, obj2);
/* 480 */                               o1lIoOI2.I00IOO(obj2, iI0000O, iI001lIiIIo1O);
/* 205 */                               o1lIoOI = o1lIoOI2;
/* 206 */                               iOOOi12 = iOOOi13;
/* 207 */                               il1llli0O12 = il1llli0O13;
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case 60:
/* 437 */                               i = i4;
/* 439 */                               o10I0o = o10I0o2;
/* 445 */                               I01Ilo0i i01Ilo0i3 = (I01Ilo0i) o1lIoOI2.I001IO000(obj2, iI0000O, iI001lIiIIo1O);
/* 447 */                               OiOIlIo oiOIlIoI000lI3 = o1lIoOI2.I000lI(iI001lIiIIo1O);
/* 452 */                               iOOOi13.I00ilI0I1(2);
/* 455 */                               iOOOi13.I000l1(i01Ilo0i3, oiOIlIoI000lI3, il1llli0O13);
/* 465 */                               unsafe.putObject(obj2, o1lIoOI2.I00IlilI0i0i(iI001lIiIIo1O) & 1048575, i01Ilo0i3);
/* 468 */                               o1lIoOI2.I00IOO(obj2, iI0000O, iI001lIiIIo1O);
/* 205 */                               o1lIoOI = o1lIoOI2;
/* 206 */                               iOOOi12 = iOOOi13;
/* 207 */                               il1llli0O12 = il1llli0O13;
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case 61:
/* 417 */                               i = i4;
/* 419 */                               o10I0o = o10I0o2;
/* 429 */                               OoilIIl.I000oI1ioi(obj2, I001i1lo1io(iI00IlilI0i0i), iOOOi13.I00100o1O0lo());
/* 432 */                               o1lIoOI2.I00IOO(obj2, iI0000O, iI001lIiIIo1O);
/* 205 */                               o1lIoOI = o1lIoOI2;
/* 206 */                               iOOOi12 = iOOOi13;
/* 207 */                               il1llli0O12 = il1llli0O13;
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case 62:
/* 385 */                               i = i4;
/* 387 */                               o10I0o = o10I0o2;
/* 389 */                               long jI001i1lo1io51 = I001i1lo1io(iI00IlilI0i0i);
/* 394 */                               iOOOi13.I00ilI0I1(0);
/* 409 */                               OoilIIl.I000oI1ioi(obj2, jI001i1lo1io51, Integer.valueOf(((IOOOI0) iOOOi13.I0000oI00).I00II0oii1o()));
/* 412 */                               o1lIoOI2.I00IOO(obj2, iI0000O, iI001lIiIIo1O);
/* 205 */                               o1lIoOI = o1lIoOI2;
/* 206 */                               iOOOi12 = iOOOi13;
/* 207 */                               il1llli0O12 = il1llli0O13;
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case 63:
/* 350 */                               i = i4;
/* 352 */                               o10I0o = o10I0o2;
/* 355 */                               iOOOi13.I00ilI0I1(0);
/* 362 */                               int iI0010I0i2 = ((IOOOI0) iOOOi13.I0000oI00).I0010I0i();
/* 366 */                               o1lIoOI2.I000l1(iI001lIiIIo1O);
/* 377 */                               OoilIIl.I000oI1ioi(obj2, I001i1lo1io(iI00IlilI0i0i), Integer.valueOf(iI0010I0i2));
/* 380 */                               o1lIoOI2.I00IOO(obj2, iI0000O, iI001lIiIIo1O);
/* 205 */                               o1lIoOI = o1lIoOI2;
/* 206 */                               iOOOi12 = iOOOi13;
/* 207 */                               il1llli0O12 = il1llli0O13;
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case Barcode.FORMAT_EAN_8:
/* 318 */                               i = i4;
/* 320 */                               o10I0o = o10I0o2;
/* 322 */                               long jI001i1lo1io52 = I001i1lo1io(iI00IlilI0i0i);
/* 327 */                               iOOOi13.I00ilI0I1(5);
/* 342 */                               OoilIIl.I000oI1ioi(obj2, jI001i1lo1io52, Integer.valueOf(((IOOOI0) iOOOi13.I0000oI00).I001i1lo1io()));
/* 345 */                               o1lIoOI2.I00IOO(obj2, iI0000O, iI001lIiIIo1O);
/* 205 */                               o1lIoOI = o1lIoOI2;
/* 206 */                               iOOOi12 = iOOOi13;
/* 207 */                               il1llli0O12 = il1llli0O13;
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case 65:
/* 288 */                               i = i4;
/* 290 */                               o10I0o = o10I0o2;
/* 292 */                               long jI001i1lo1io53 = I001i1lo1io(iI00IlilI0i0i);
/* 296 */                               iOOOi13.I00ilI0I1(1);
/* 311 */                               OoilIIl.I000oI1ioi(obj2, jI001i1lo1io53, Long.valueOf(((IOOOI0) iOOOi13.I0000oI00).I001iOo1i0O()));
/* 314 */                               o1lIoOI2.I00IOO(obj2, iI0000O, iI001lIiIIo1O);
/* 205 */                               o1lIoOI = o1lIoOI2;
/* 206 */                               iOOOi12 = iOOOi13;
/* 207 */                               il1llli0O12 = il1llli0O13;
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case 66:
/* 257 */                               i = i4;
/* 259 */                               o10I0o = o10I0o2;
/* 261 */                               long jI001i1lo1io54 = I001i1lo1io(iI00IlilI0i0i);
/* 266 */                               iOOOi13.I00ilI0I1(0);
/* 281 */                               OoilIIl.I000oI1ioi(obj2, jI001i1lo1io54, Integer.valueOf(((IOOOI0) iOOOi13.I0000oI00).I001l0I00()));
/* 284 */                               o1lIoOI2.I00IOO(obj2, iI0000O, iI001lIiIIo1O);
/* 205 */                               o1lIoOI = o1lIoOI2;
/* 206 */                               iOOOi12 = iOOOi13;
/* 207 */                               il1llli0O12 = il1llli0O13;
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case 67:
/* 224 */                               i = i4;
/* 226 */                               o10I0o = o10I0o2;
/* 228 */                               long jI001i1lo1io55 = I001i1lo1io(iI00IlilI0i0i);
/* 233 */                               iOOOi13.I00ilI0I1(0);
/* 248 */                               OoilIIl.I000oI1ioi(obj2, jI001i1lo1io55, Long.valueOf(((IOOOI0) iOOOi13.I0000oI00).I001lIiIIo1O()));
/* 251 */                               o1lIoOI2.I00IOO(obj2, iI0000O, iI001lIiIIo1O);
/* 205 */                               o1lIoOI = o1lIoOI2;
/* 206 */                               iOOOi12 = iOOOi13;
/* 207 */                               il1llli0O12 = il1llli0O13;
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                    case 68:
                                        try {
/* 175 */                                   I01Ilo0i i01Ilo0i4 = (I01Ilo0i) o1lIoOI2.I001IO000(obj2, iI0000O, iI001lIiIIo1O);
/* 177 */                                   OiOIlIo oiOIlIoI000lI4 = o1lIoOI2.I000lI(iI001lIiIIo1O);
/* 182 */                                   iOOOi13.I00ilI0I1(3);
/* 185 */                                   iOOOi13.I000OOo1O(i01Ilo0i4, oiOIlIoI000lI4, il1llli0O13);
/* 194 */                                   i = i4;
/* 196 */                                   o10I0o = o10I0o2;
                                            try {
                                                try {
/* 199 */                                           unsafe.putObject(obj2, o1lIoOI2.I00IlilI0i0i(iI001lIiIIo1O) & 1048575, i01Ilo0i4);
/* 202 */                                           o1lIoOI2.I00IOO(obj2, iI0000O, iI001lIiIIo1O);
/* 205 */                                           o1lIoOI = o1lIoOI2;
/* 206 */                                           iOOOi12 = iOOOi13;
/* 207 */                                           il1llli0O12 = il1llli0O13;
                                                } catch (O000o1i unused9) {
/* 213 */                                           o1lIoOI = o1lIoOI2;
/* 138 */                                           iOOOi12 = iOOOi13;
/* 139 */                                           il1llli0O12 = il1llli0O13;
/* 2086 */                                          ooiO0oloIiI.getClass();
/* 2089 */                                          if (ooiO0lI00000oIO == null) {
                                                    }
/* 2101 */                                          if (!OoiO0oloIiI.I00000oOI(0, iOOOi12, ooiO0lI00000oIO)) {
                                                    }
/* 2120 */                                          o1lIoOI2 = o1lIoOI;
/* 2121 */                                          iOOOi13 = iOOOi12;
/* 2122 */                                          il1llli0O13 = il1llli0O12;
/* 2123 */                                          i4 = i;
/* 2125 */                                          o10I0o2 = o10I0o;
                                                }
                                            } catch (Throwable th5) {
/* 255 */                                       th = th5;
/* 210 */                                       o1lIoOI = o1lIoOI2;
/* 2131 */                                      while (i2 < i3) {
                                                }
/* 2141 */                                      if (ooiO0lI00000oIO != null) {
                                                }
/* 2151 */                                      throw th;
                                            }
                                        } catch (O000o1i unused10) {
/* 219 */                                   i = i4;
/* 221 */                                   o10I0o = o10I0o2;
                                        } catch (Throwable th6) {
/* 215 */                                   th = th6;
/* 216 */                                   i = i4;
                                        }
/* 2120 */                              o1lIoOI2 = o1lIoOI;
/* 2121 */                              iOOOi13 = iOOOi12;
/* 2122 */                              il1llli0O13 = il1llli0O12;
/* 2123 */                              i4 = i;
/* 2125 */                              o10I0o2 = o10I0o;
                                        break;
                                    default:
/* 122 */                               if (ooiO0lI00000oIO == null) {
/* 124 */                                   ooiO0oloIiI.getClass();
/* 127 */                                   ooiO0lI00000oIO = OoiO0oloIiI.I00000oIO(obj2);
                                        }
/* 142 */                               ooiO0oloIiI.getClass();
/* 150 */                               if (OoiO0oloIiI.I00000oOI(0, iOOOi13, ooiO0lI00000oIO)) {
/* 165 */                                   o1lIoOI = o1lIoOI2;
/* 166 */                                   i = i4;
/* 168 */                                   o10I0o = o10I0o2;
/* 206 */                                   iOOOi12 = iOOOi13;
/* 207 */                                   il1llli0O12 = il1llli0O13;
/* 2120 */                                  o1lIoOI2 = o1lIoOI;
/* 2121 */                                  iOOOi13 = iOOOi12;
/* 2122 */                                  il1llli0O13 = il1llli0O12;
/* 2123 */                                  i4 = i;
/* 2125 */                                  o10I0o2 = o10I0o;
                                        } else {
/* 152 */                                   while (i4 < i3) {
/* 156 */                                       o1lIoOI2.I000iOII(iArr[i4], obj2, ooiO0lI00000oIO);
/* 159 */                                       i4++;
                                            }
/* 162 */                                   if (ooiO0lI00000oIO == null) {
/* 2119 */                                      return;
                                            }
                                        }
                                        break;
                                }
                            } else if (iI0000O == Integer.MAX_VALUE) {
/* 46 */                        while (i4 < i3) {
/* 50 */                            o1lIoOI2.I000iOII(iArr[i4], obj2, ooiO0lI00000oIO);
/* 53 */                            i4++;
                                }
/* 56 */                        if (ooiO0lI00000oIO == null) {
/* 2119 */                          return;
                                } else {
/* 58 */                            ooiO0oloIiI.getClass();
                                }
                            } else {
/* 68 */                        ooiO0oloIiI.getClass();
/* 71 */                        if (ooiO0lI00000oIO == null) {
/* 73 */                            ooiO0lI00000oIO = OoiO0oloIiI.I00000oIO(obj2);
                                }
/* 89 */                        if (!OoiO0oloIiI.I00000oOI(0, iOOOi13, ooiO0lI00000oIO)) {
/* 92 */                            while (i4 < i3) {
/* 96 */                                o1lIoOI2.I000iOII(iArr[i4], obj2, ooiO0lI00000oIO);
/* 99 */                                i4++;
                                    }
/* 102 */                           if (ooiO0lI00000oIO == null) {
/* 2119 */                              return;
                                    }
                                }
                            }
                        } catch (Throwable th7) {
/* 79 */                    th = th7;
/* 80 */                    o1lIoOI = o1lIoOI2;
/* 81 */                    i = i4;
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I0001Ioi1lo(Io00l0 io00l0, Io00l0 io00l02) {
/* 1 */             OoiO0oloIiI ooiO0oloIiI = this.I000l1;
/* 3 */             int[] iArr = this.I00000oIO;
/* 5 */             int length = iArr.length;
/* 7 */             int i = 0;
                    while (true) {
/* 8 */                 boolean zI000l1 = true;
/* 9 */                 if (i < length) {
/* 11 */                    int iI00IlilI0i0i = I00IlilI0i0i(i);
/* 18 */                    long j = iI00IlilI0i0i & 1048575;
                            switch (I00IioO0OiOi(iI00IlilI0i0i)) {
                                case 0:
/* 437 */                           if (I000OiO(io00l0, io00l02, i)) {
/* 439 */                               Ooil0oIOI0l0 ooil0oIOI0l0 = OoilIIl.I0000Il00O;
/* 459 */                               if (Double.doubleToLongBits(ooil0oIOI0l0.I0000Il00O(j, io00l0)) != Double.doubleToLongBits(ooil0oIOI0l0.I0000Il00O(j, io00l02))) {
/* 62 */                                    zI000l1 = false;
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
/* 410 */                           if (I000OiO(io00l0, io00l02, i)) {
/* 412 */                               Ooil0oIOI0l0 ooil0oIOI0l02 = OoilIIl.I0000Il00O;
/* 430 */                               if (Float.floatToIntBits(ooil0oIOI0l02.I0000O(j, io00l0)) != Float.floatToIntBits(ooil0oIOI0l02.I0000O(j, io00l02))) {
                                        }
                                    }
                                    break;
                                case 2:
/* 391 */                           if (!I000OiO(io00l0, io00l02, i) || OoilIIl.I000II(j, io00l0) != OoilIIl.I000II(j, io00l02)) {
                                    }
                                    break;
                                case 3:
/* 372 */                           if (!I000OiO(io00l0, io00l02, i) || OoilIIl.I000II(j, io00l0) != OoilIIl.I000II(j, io00l02)) {
                                    }
                                    break;
                                case 4:
/* 355 */                           if (!I000OiO(io00l0, io00l02, i) || OoilIIl.I0001Ioi1lo(j, io00l0) != OoilIIl.I0001Ioi1lo(j, io00l02)) {
                                    }
                                    break;
                                case 5:
/* 335 */                           if (!I000OiO(io00l0, io00l02, i) || OoilIIl.I000II(j, io00l0) != OoilIIl.I000II(j, io00l02)) {
                                    }
                                    break;
                                case 6:
/* 317 */                           if (!I000OiO(io00l0, io00l02, i) || OoilIIl.I0001Ioi1lo(j, io00l0) != OoilIIl.I0001Ioi1lo(j, io00l02)) {
                                    }
                                    break;
                                case 7:
/* 297 */                           if (I000OiO(io00l0, io00l02, i)) {
/* 299 */                               Ooil0oIOI0l0 ooil0oIOI0l03 = OoilIIl.I0000Il00O;
/* 309 */                               if (ooil0oIOI0l03.I00000oIO(j, io00l0) != ooil0oIOI0l03.I00000oIO(j, io00l02)) {
                                        }
                                    }
                                    break;
                                case 8:
/* 275 */                           if (!I000OiO(io00l0, io00l02, i) || !OiOO1Ioo.I000l1(OoilIIl.I000O01llI0(j, io00l0), OoilIIl.I000O01llI0(j, io00l02))) {
                                    }
                                    break;
                                case 9:
/* 253 */                           if (!I000OiO(io00l0, io00l02, i) || !OiOO1Ioo.I000l1(OoilIIl.I000O01llI0(j, io00l0), OoilIIl.I000O01llI0(j, io00l02))) {
                                    }
                                    break;
                                case 10:
/* 231 */                           if (!I000OiO(io00l0, io00l02, i) || !OiOO1Ioo.I000l1(OoilIIl.I000O01llI0(j, io00l0), OoilIIl.I000O01llI0(j, io00l02))) {
                                    }
                                    break;
                                case 11:
/* 213 */                           if (!I000OiO(io00l0, io00l02, i) || OoilIIl.I0001Ioi1lo(j, io00l0) != OoilIIl.I0001Ioi1lo(j, io00l02)) {
                                    }
                                    break;
                                case 12:
/* 195 */                           if (!I000OiO(io00l0, io00l02, i) || OoilIIl.I0001Ioi1lo(j, io00l0) != OoilIIl.I0001Ioi1lo(j, io00l02)) {
                                    }
                                    break;
                                case 13:
/* 177 */                           if (!I000OiO(io00l0, io00l02, i) || OoilIIl.I0001Ioi1lo(j, io00l0) != OoilIIl.I0001Ioi1lo(j, io00l02)) {
                                    }
                                    break;
                                case 14:
/* 157 */                           if (!I000OiO(io00l0, io00l02, i) || OoilIIl.I000II(j, io00l0) != OoilIIl.I000II(j, io00l02)) {
                                    }
                                    break;
                                case 15:
/* 139 */                           if (!I000OiO(io00l0, io00l02, i) || OoilIIl.I0001Ioi1lo(j, io00l0) != OoilIIl.I0001Ioi1lo(j, io00l02)) {
                                    }
                                    break;
                                case 16:
/* 119 */                           if (!I000OiO(io00l0, io00l02, i) || OoilIIl.I000II(j, io00l0) != OoilIIl.I000II(j, io00l02)) {
                                    }
                                    break;
                                case 17:
/* 97 */                            if (!I000OiO(io00l0, io00l02, i) || !OiOO1Ioo.I000l1(OoilIIl.I000O01llI0(j, io00l0), OoilIIl.I000O01llI0(j, io00l02))) {
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
/* 87 */                            zI000l1 = OiOO1Ioo.I000l1(OoilIIl.I000O01llI0(j, io00l0), OoilIIl.I000O01llI0(j, io00l02));
                                    break;
                                case 50:
/* 73 */                            zI000l1 = OiOO1Ioo.I000l1(OoilIIl.I000O01llI0(j, io00l0), OoilIIl.I000O01llI0(j, io00l02));
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
/* 34 */                            long j2 = iArr[i + 2] & 1048575;
/* 44 */                            if (OoilIIl.I0001Ioi1lo(j2, io00l0) != OoilIIl.I0001Ioi1lo(j2, io00l02) || !OiOO1Ioo.I000l1(OoilIIl.I000O01llI0(j, io00l0), OoilIIl.I000O01llI0(j, io00l02))) {
                                    }
                                    break;
                            }
/* 461 */                   if (zI000l1) {
/* 464 */                       i += 3;
                            }
                        } else {
/* 468 */                   ooiO0oloIiI.getClass();
/* 479 */                   if (io00l0.unknownFields.equals(io00l02.unknownFields)) {
/* 8 */                         return true;
                            }
                        }
                    }
/* 6 */             return false;
                }

                /* JADX WARN: Removed duplicated region for block: B:42:0x00d7 A[PHI: r3
                  0x00d7: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x01f0, B:41:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int I000II(Io00l0 io00l0) {
                    int i;
                    int iI00000oOI;
                    int i2;
/* 1 */             int[] iArr = this.I00000oIO;
/* 3 */             int length = iArr.length;
/* 5 */             int i3 = 0;
/* 6 */             for (int i4 = 0; i4 < length; i4 += 3) {
/* 8 */                 int iI00IlilI0i0i = I00IlilI0i0i(i4);
/* 12 */                int i5 = iArr[i4];
/* 17 */                long j = 1048575 & iI00IlilI0i0i;
/* 23 */                int i6 = 1237;
/* 27 */                int iHashCode = 37;
                        switch (I00IioO0OiOi(iI00IlilI0i0i)) {
                            case 0:
/* 567 */                       i = i3 * 53;
/* 579 */                       iI00000oOI = IoolIIolo1lI.I00000oOI(Double.doubleToLongBits(OoilIIl.I0000Il00O.I0000Il00O(j, io00l0)));
/* 50 */                        i3 = iI00000oOI + i;
                                break;
                            case 1:
/* 553 */                       i = i3 * 53;
/* 561 */                       iI00000oOI = Float.floatToIntBits(OoilIIl.I0000Il00O.I0000O(j, io00l0));
/* 50 */                        i3 = iI00000oOI + i;
                                break;
                            case 2:
/* 541 */                       i = i3 * 53;
/* 547 */                       iI00000oOI = IoolIIolo1lI.I00000oOI(OoilIIl.I000II(j, io00l0));
/* 50 */                        i3 = iI00000oOI + i;
                                break;
                            case 3:
/* 529 */                       i = i3 * 53;
/* 535 */                       iI00000oOI = IoolIIolo1lI.I00000oOI(OoilIIl.I000II(j, io00l0));
/* 50 */                        i3 = iI00000oOI + i;
                                break;
                            case 4:
/* 521 */                       i = i3 * 53;
/* 523 */                       iI00000oOI = OoilIIl.I0001Ioi1lo(j, io00l0);
/* 50 */                        i3 = iI00000oOI + i;
                                break;
                            case 5:
/* 509 */                       i = i3 * 53;
/* 515 */                       iI00000oOI = IoolIIolo1lI.I00000oOI(OoilIIl.I000II(j, io00l0));
/* 50 */                        i3 = iI00000oOI + i;
                                break;
                            case 6:
/* 501 */                       i = i3 * 53;
/* 503 */                       iI00000oOI = OoilIIl.I0001Ioi1lo(j, io00l0);
/* 50 */                        i3 = iI00000oOI + i;
                                break;
                            case 7:
/* 487 */                       i2 = i3 * 53;
/* 491 */                       boolean zI00000oIO = OoilIIl.I0000Il00O.I00000oIO(j, io00l0);
/* 495 */                       Charset charset = IoolIIolo1lI.I00000oIO;
/* 497 */                       if (zI00000oIO) {
/* 216 */                           i6 = 1231;
                                }
/* 217 */                       i3 = i6 + i2;
                                break;
                            case 8:
/* 473 */                       i = i3 * 53;
/* 481 */                       iI00000oOI = ((String) OoilIIl.I000O01llI0(j, io00l0)).hashCode();
/* 50 */                        i3 = iI00000oOI + i;
                                break;
                            case 9:
/* 462 */                       Object objI000O01llI0 = OoilIIl.I000O01llI0(j, io00l0);
/* 466 */                       if (objI000O01llI0 != null) {
/* 468 */                           iHashCode = objI000O01llI0.hashCode();
                                }
/* 391 */                       i3 = (i3 * 53) + iHashCode;
                                break;
                            case 10:
/* 450 */                       i = i3 * 53;
/* 456 */                       iI00000oOI = OoilIIl.I000O01llI0(j, io00l0).hashCode();
/* 50 */                        i3 = iI00000oOI + i;
                                break;
                            case 11:
/* 442 */                       i = i3 * 53;
/* 444 */                       iI00000oOI = OoilIIl.I0001Ioi1lo(j, io00l0);
/* 50 */                        i3 = iI00000oOI + i;
                                break;
                            case 12:
/* 434 */                       i = i3 * 53;
/* 436 */                       iI00000oOI = OoilIIl.I0001Ioi1lo(j, io00l0);
/* 50 */                        i3 = iI00000oOI + i;
                                break;
                            case 13:
/* 426 */                       i = i3 * 53;
/* 428 */                       iI00000oOI = OoilIIl.I0001Ioi1lo(j, io00l0);
/* 50 */                        i3 = iI00000oOI + i;
                                break;
                            case 14:
/* 414 */                       i = i3 * 53;
/* 420 */                       iI00000oOI = IoolIIolo1lI.I00000oOI(OoilIIl.I000II(j, io00l0));
/* 50 */                        i3 = iI00000oOI + i;
                                break;
                            case 15:
/* 406 */                       i = i3 * 53;
/* 408 */                       iI00000oOI = OoilIIl.I0001Ioi1lo(j, io00l0);
/* 50 */                        i3 = iI00000oOI + i;
                                break;
                            case 16:
/* 394 */                       i = i3 * 53;
/* 400 */                       iI00000oOI = IoolIIolo1lI.I00000oOI(OoilIIl.I000II(j, io00l0));
/* 50 */                        i3 = iI00000oOI + i;
                                break;
                            case 17:
/* 379 */                       Object objI000O01llI02 = OoilIIl.I000O01llI0(j, io00l0);
/* 383 */                       if (objI000O01llI02 != null) {
/* 385 */                           iHashCode = objI000O01llI02.hashCode();
                                }
/* 391 */                       i3 = (i3 * 53) + iHashCode;
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
/* 367 */                       i = i3 * 53;
/* 373 */                       iI00000oOI = OoilIIl.I000O01llI0(j, io00l0).hashCode();
/* 50 */                        i3 = iI00000oOI + i;
                                break;
                            case 50:
/* 355 */                       i = i3 * 53;
/* 361 */                       iI00000oOI = OoilIIl.I000O01llI0(j, io00l0).hashCode();
/* 50 */                        i3 = iI00000oOI + i;
                                break;
                            case 51:
/* 331 */                       if (I00100o1O0lo(io00l0, i5, i4)) {
/* 333 */                           i = i3 * 53;
/* 349 */                           iI00000oOI = IoolIIolo1lI.I00000oOI(Double.doubleToLongBits(((Double) OoilIIl.I000O01llI0(j, io00l0)).doubleValue()));
/* 50 */                            i3 = iI00000oOI + i;
                                    break;
                                } else {
                                    break;
                                }
                            case 52:
/* 307 */                       if (I00100o1O0lo(io00l0, i5, i4)) {
/* 309 */                           i = i3 * 53;
/* 321 */                           iI00000oOI = Float.floatToIntBits(((Float) OoilIIl.I000O01llI0(j, io00l0)).floatValue());
/* 50 */                            i3 = iI00000oOI + i;
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
/* 289 */                       if (I00100o1O0lo(io00l0, i5, i4)) {
/* 291 */                           i = i3 * 53;
/* 297 */                           iI00000oOI = IoolIIolo1lI.I00000oOI(I001l0I00(j, io00l0));
/* 50 */                            i3 = iI00000oOI + i;
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
/* 271 */                       if (I00100o1O0lo(io00l0, i5, i4)) {
/* 273 */                           i = i3 * 53;
/* 279 */                           iI00000oOI = IoolIIolo1lI.I00000oOI(I001l0I00(j, io00l0));
/* 50 */                            i3 = iI00000oOI + i;
                                    break;
                                } else {
                                    break;
                                }
                            case 55:
/* 257 */                       if (I00100o1O0lo(io00l0, i5, i4)) {
/* 259 */                           i = i3 * 53;
/* 261 */                           iI00000oOI = I001iOo1i0O(j, io00l0);
/* 50 */                            i3 = iI00000oOI + i;
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
/* 239 */                       if (I00100o1O0lo(io00l0, i5, i4)) {
/* 241 */                           i = i3 * 53;
/* 247 */                           iI00000oOI = IoolIIolo1lI.I00000oOI(I001l0I00(j, io00l0));
/* 50 */                            i3 = iI00000oOI + i;
                                    break;
                                } else {
                                    break;
                                }
                            case 57:
/* 225 */                       if (I00100o1O0lo(io00l0, i5, i4)) {
/* 227 */                           i = i3 * 53;
/* 229 */                           iI00000oOI = I001iOo1i0O(j, io00l0);
/* 50 */                            i3 = iI00000oOI + i;
                                    break;
                                } else {
                                    break;
                                }
                            case 58:
/* 198 */                       if (I00100o1O0lo(io00l0, i5, i4)) {
/* 200 */                           i2 = i3 * 53;
/* 208 */                           boolean zBooleanValue = ((Boolean) OoilIIl.I000O01llI0(j, io00l0)).booleanValue();
/* 212 */                           Charset charset2 = IoolIIolo1lI.I00000oIO;
/* 214 */                           if (zBooleanValue) {
                                    }
/* 217 */                           i3 = i6 + i2;
                                    break;
                                } else {
                                    break;
                                }
                                break;
                            case 59:
/* 178 */                       if (I00100o1O0lo(io00l0, i5, i4)) {
/* 180 */                           i = i3 * 53;
/* 188 */                           iI00000oOI = ((String) OoilIIl.I000O01llI0(j, io00l0)).hashCode();
/* 50 */                            i3 = iI00000oOI + i;
                                    break;
                                } else {
                                    break;
                                }
                            case 60:
/* 161 */                       if (I00100o1O0lo(io00l0, i5, i4)) {
/* 167 */                           i = i3 * 53;
/* 169 */                           iI00000oOI = OoilIIl.I000O01llI0(j, io00l0).hashCode();
/* 50 */                            i3 = iI00000oOI + i;
                                    break;
                                } else {
                                    break;
                                }
                            case 61:
/* 144 */                       if (I00100o1O0lo(io00l0, i5, i4)) {
/* 146 */                           i = i3 * 53;
/* 152 */                           iI00000oOI = OoilIIl.I000O01llI0(j, io00l0).hashCode();
/* 50 */                            i3 = iI00000oOI + i;
                                    break;
                                } else {
                                    break;
                                }
                            case 62:
/* 131 */                       if (I00100o1O0lo(io00l0, i5, i4)) {
/* 133 */                           i = i3 * 53;
/* 135 */                           iI00000oOI = I001iOo1i0O(j, io00l0);
/* 50 */                            i3 = iI00000oOI + i;
                                    break;
                                } else {
                                    break;
                                }
                            case 63:
/* 118 */                       if (I00100o1O0lo(io00l0, i5, i4)) {
/* 120 */                           i = i3 * 53;
/* 122 */                           iI00000oOI = I001iOo1i0O(j, io00l0);
/* 50 */                            i3 = iI00000oOI + i;
                                    break;
                                } else {
                                    break;
                                }
                            case Barcode.FORMAT_EAN_8:
/* 105 */                       if (I00100o1O0lo(io00l0, i5, i4)) {
/* 107 */                           i = i3 * 53;
/* 109 */                           iI00000oOI = I001iOo1i0O(j, io00l0);
/* 50 */                            i3 = iI00000oOI + i;
                                    break;
                                } else {
                                    break;
                                }
                            case 65:
/* 88 */                        if (I00100o1O0lo(io00l0, i5, i4)) {
/* 90 */                            i = i3 * 53;
/* 96 */                            iI00000oOI = IoolIIolo1lI.I00000oOI(I001l0I00(j, io00l0));
/* 50 */                            i3 = iI00000oOI + i;
                                    break;
                                } else {
                                    break;
                                }
                            case 66:
/* 75 */                        if (I00100o1O0lo(io00l0, i5, i4)) {
/* 77 */                            i = i3 * 53;
/* 79 */                            iI00000oOI = I001iOo1i0O(j, io00l0);
/* 50 */                            i3 = iI00000oOI + i;
                                    break;
                                } else {
                                    break;
                                }
                            case 67:
/* 58 */                        if (I00100o1O0lo(io00l0, i5, i4)) {
/* 60 */                            i = i3 * 53;
/* 66 */                            iI00000oOI = IoolIIolo1lI.I00000oOI(I001l0I00(j, io00l0));
/* 50 */                            i3 = iI00000oOI + i;
                                    break;
                                } else {
                                    break;
                                }
                            case 68:
/* 38 */                        if (I00100o1O0lo(io00l0, i5, i4)) {
/* 44 */                            i = i3 * 53;
/* 46 */                            iI00000oOI = OoilIIl.I000O01llI0(j, io00l0).hashCode();
/* 50 */                            i3 = iI00000oOI + i;
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
/* 593 */           this.I000l1.getClass();
/* 602 */           return io00l0.unknownFields.hashCode() + (i3 * 53);
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                @Override
                public final void I000O01llI0(Object obj, IIOOoll iIOOoll) throws IOException {
                    int i;
                    int i2;
                    int i3;
                    boolean z;
/* 1 */             O1lIoOI o1lIoOI = this;
/* 7 */             iIOOoll.getClass();
/* 13 */            IOOOio0o iOOOio0o = (IOOOio0o) iIOOoll.I00iiI;
/* 15 */            int[] iArr = o1lIoOI.I00000oIO;
/* 17 */            int length = iArr.length;
/* 18 */            int i4 = 1048575;
/* 21 */            int i5 = 1048575;
/* 22 */            int i6 = 0;
/* 23 */            int i7 = 0;
/* 24 */            while (i6 < length) {
/* 26 */                int iI00IlilI0i0i = o1lIoOI.I00IlilI0i0i(i6);
/* 30 */                int i8 = iArr[i6];
/* 32 */                int iI00IioO0OiOi = I00IioO0OiOi(iI00IlilI0i0i);
/* 38 */                Unsafe unsafe = I000oI1ioi;
/* 40 */                if (iI00IioO0OiOi <= 17) {
/* 44 */                    int i9 = iArr[i6 + 2];
/* 46 */                    i = 1;
/* 48 */                    int i10 = i9 & i4;
/* 50 */                    if (i10 != i5) {
/* 57 */                        i7 = i10 == i4 ? 0 : unsafe.getInt(obj, i10);
/* 62 */                        i5 = i10;
                            }
/* 65 */                    int i11 = 1 << (i9 >>> 20);
/* 69 */                    i2 = iI00IlilI0i0i;
/* 70 */                    i3 = i11;
                        } else {
/* 73 */                    i = 1;
/* 75 */                    i2 = iI00IlilI0i0i;
/* 76 */                    i3 = 0;
                        }
/* 77 */                long j = i2 & i4;
                        switch (iI00IioO0OiOi) {
                            case 0:
/* 1416 */                      if (o1lIoOI.I000oI1ioi(obj, i6, i5, i7, i3)) {
/* 1428 */                          iOOOio0o.I00111O(i8, Double.doubleToRawLongBits(OoilIIl.I0000Il00O.I0000Il00O(j, obj)));
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
/* 1394 */                      if (o1lIoOI.I000oI1ioi(obj, i6, i5, i7, i3)) {
/* 1406 */                          iOOOio0o.I0010I0i(i8, Float.floatToRawIntBits(OoilIIl.I0000Il00O.I0000O(j, obj)));
                                }
/* 1139 */                      o1lIoOI = this;
                                break;
                            case 2:
/* 1378 */                      if (o1lIoOI.I000oI1ioi(obj, i6, i5, i7, i3)) {
/* 1384 */                          iOOOio0o.I00II0oii1o(i8, unsafe.getLong(obj, j));
                                }
/* 1139 */                      o1lIoOI = this;
                                break;
                            case 3:
/* 1362 */                      if (o1lIoOI.I000oI1ioi(obj, i6, i5, i7, i3)) {
/* 1368 */                          iOOOio0o.I00II0oii1o(i8, unsafe.getLong(obj, j));
                                }
/* 1139 */                      o1lIoOI = this;
                                break;
                            case 4:
/* 1346 */                      if (o1lIoOI.I000oI1ioi(obj, i6, i5, i7, i3)) {
/* 1352 */                          iOOOio0o.I001IO000(i8, unsafe.getInt(obj, j));
                                }
/* 1139 */                      o1lIoOI = this;
                                break;
                            case 5:
/* 1330 */                      if (o1lIoOI.I000oI1ioi(obj, i6, i5, i7, i3)) {
/* 1336 */                          iOOOio0o.I00111O(i8, unsafe.getLong(obj, j));
                                }
/* 1139 */                      o1lIoOI = this;
                                break;
                            case 6:
/* 1314 */                      if (o1lIoOI.I000oI1ioi(obj, i6, i5, i7, i3)) {
/* 1320 */                          iOOOio0o.I0010I0i(i8, unsafe.getInt(obj, j));
                                }
/* 1139 */                      o1lIoOI = this;
                                break;
                            case 7:
/* 1296 */                      if (o1lIoOI.I000oI1ioi(obj, i6, i5, i7, i3)) {
/* 1304 */                          iOOOio0o.I000oI1ioi(i8, OoilIIl.I0000Il00O.I00000oIO(j, obj));
                                }
/* 1139 */                      o1lIoOI = this;
                                break;
                            case 8:
/* 1267 */                      if (o1lIoOI.I000oI1ioi(obj, i6, i5, i7, i3)) {
/* 1269 */                          Object object = unsafe.getObject(obj, j);
/* 1275 */                          if (object instanceof String) {
/* 1279 */                              iOOOio0o.I001l0I00(i8, (String) object);
                                    } else {
/* 1286 */                              iOOOio0o.I00100l0(i8, (IIO1ooI) object);
                                    }
                                }
/* 1139 */                      o1lIoOI = this;
                                break;
                            case 9:
/* 1245 */                      if (o1lIoOI.I000oI1ioi(obj, i6, i5, i7, i3)) {
/* 1257 */                          iOOOio0o.I001iOo1i0O(i8, (I01Ilo0i) unsafe.getObject(obj, j), o1lIoOI.I000lI(i6));
                                    break;
                                } else {
                                    break;
                                }
                            case 10:
/* 1228 */                      if (o1lIoOI.I000oI1ioi(obj, i6, i5, i7, i3)) {
/* 1236 */                          iOOOio0o.I00100l0(i8, (IIO1ooI) unsafe.getObject(obj, j));
                                }
/* 1139 */                      o1lIoOI = this;
                                break;
                            case 11:
/* 1213 */                      if (o1lIoOI.I000oI1ioi(obj, i6, i5, i7, i3)) {
/* 1219 */                          iOOOio0o.I001lloI(i8, unsafe.getInt(obj, j));
                                }
/* 1139 */                      o1lIoOI = this;
                                break;
                            case 12:
/* 1198 */                      if (o1lIoOI.I000oI1ioi(obj, i6, i5, i7, i3)) {
/* 1204 */                          iOOOio0o.I001IO000(i8, unsafe.getInt(obj, j));
                                }
/* 1139 */                      o1lIoOI = this;
                                break;
                            case 13:
/* 1183 */                      if (o1lIoOI.I000oI1ioi(obj, i6, i5, i7, i3)) {
/* 1189 */                          iOOOio0o.I0010I0i(i8, unsafe.getInt(obj, j));
                                }
/* 1139 */                      o1lIoOI = this;
                                break;
                            case 14:
/* 1168 */                      if (o1lIoOI.I000oI1ioi(obj, i6, i5, i7, i3)) {
/* 1174 */                          iOOOio0o.I00111O(i8, unsafe.getLong(obj, j));
                                }
/* 1139 */                      o1lIoOI = this;
                                break;
                            case 15:
/* 1148 */                      if (o1lIoOI.I000oI1ioi(obj, i6, i5, i7, i3)) {
/* 1150 */                          int i12 = unsafe.getInt(obj, j);
/* 1159 */                          iOOOio0o.I001lloI(i8, (i12 >> 31) ^ (i12 << 1));
                                }
/* 1139 */                      o1lIoOI = this;
                                break;
                            case 16:
/* 1123 */                      if (o1lIoOI.I000oI1ioi(obj, i6, i5, i7, i3)) {
/* 1125 */                          long j2 = unsafe.getLong(obj, j);
/* 1136 */                          iOOOio0o.I00II0oii1o(i8, (j2 >> 63) ^ (j2 << 1));
                                }
/* 1139 */                      o1lIoOI = this;
                                break;
                            case 17:
/* 1103 */                      if (o1lIoOI.I000oI1ioi(obj, i6, i5, i7, i3)) {
/* 1113 */                          iIOOoll.I00iiO(i8, unsafe.getObject(obj, j), o1lIoOI.I000lI(i6));
                                    break;
                                } else {
                                    break;
                                }
                            case PoseLandmark.RIGHT_PINKY:
/* 1093 */                      OiOO1Ioo.I000o00OoI0I(iArr[i6], (List) unsafe.getObject(obj, j), iIOOoll, false);
                                break;
                            case PoseLandmark.LEFT_INDEX:
/* 1079 */                      OiOO1Ioo.I0010I0i(iArr[i6], (List) unsafe.getObject(obj, j), iIOOoll, false);
                                break;
                            case PoseLandmark.RIGHT_INDEX:
/* 1065 */                      OiOO1Ioo.I00111O(iArr[i6], (List) unsafe.getObject(obj, j), iIOOoll, false);
                                break;
                            case PoseLandmark.LEFT_THUMB:
/* 1051 */                      OiOO1Ioo.I001l0I00(iArr[i6], (List) unsafe.getObject(obj, j), iIOOoll, false);
                                break;
                            case PoseLandmark.RIGHT_THUMB:
/* 1037 */                      OiOO1Ioo.I0010o(iArr[i6], (List) unsafe.getObject(obj, j), iIOOoll, false);
                                break;
                            case PoseLandmark.LEFT_HIP:
/* 1023 */                      OiOO1Ioo.I00100o1O0lo(iArr[i6], (List) unsafe.getObject(obj, j), iIOOoll, false);
                                break;
                            case PoseLandmark.RIGHT_HIP:
/* 1009 */                      OiOO1Ioo.I00100l0(iArr[i6], (List) unsafe.getObject(obj, j), iIOOoll, false);
                                break;
                            case PoseLandmark.LEFT_KNEE:
/* 995 */                       OiOO1Ioo.I000lI(iArr[i6], (List) unsafe.getObject(obj, j), iIOOoll, false);
                                break;
                            case PoseLandmark.RIGHT_KNEE:
/* 913 */                       int i13 = iArr[i6];
/* 919 */                       List list = (List) unsafe.getObject(obj, j);
/* 921 */                       Class cls = OiOO1Ioo.I00000oIO;
/* 923 */                       if (list != null && !list.isEmpty()) {
/* 933 */                           if (list instanceof O0o1oOII) {
/* 936 */                               O0o1oOII o0o1oOII = (O0o1oOII) list;
/* 943 */                               for (int i14 = 0; i14 < list.size(); i14++) {
/* 945 */                                   Object objI000II = o0o1oOII.I000II();
/* 951 */                                   if (objI000II instanceof String) {
/* 955 */                                       iOOOio0o.I001l0I00(i13, (String) objI000II);
                                            } else {
/* 961 */                                       iOOOio0o.I00100l0(i13, (IIO1ooI) objI000II);
                                            }
                                        }
                                    } else {
/* 972 */                               for (int i15 = 0; i15 < list.size(); i15++) {
/* 980 */                                   iOOOio0o.I001l0I00(i13, (String) list.get(i15));
                                        }
                                    }
                                }
                                break;
                            case 27:
/* 872 */                       int i16 = iArr[i6];
/* 878 */                       List list2 = (List) unsafe.getObject(obj, j);
/* 880 */                       OiOIlIo oiOIlIoI000lI = o1lIoOI.I000lI(i6);
/* 884 */                       Class cls2 = OiOO1Ioo.I00000oIO;
/* 886 */                       if (list2 != null && !list2.isEmpty()) {
/* 899 */                           for (int i17 = 0; i17 < list2.size(); i17++) {
/* 907 */                               iOOOio0o.I001iOo1i0O(i16, (I01Ilo0i) list2.get(i17), oiOIlIoI000lI);
                                    }
                                }
                                break;
                            case PoseLandmark.RIGHT_ANKLE:
/* 835 */                       int i18 = iArr[i6];
/* 841 */                       List list3 = (List) unsafe.getObject(obj, j);
/* 843 */                       Class cls3 = OiOO1Ioo.I00000oIO;
/* 845 */                       if (list3 != null && !list3.isEmpty()) {
/* 858 */                           for (int i19 = 0; i19 < list3.size(); i19++) {
/* 866 */                               iOOOio0o.I00100l0(i18, (IIO1ooI) list3.get(i19));
                                    }
                                }
                                break;
                            case PoseLandmark.LEFT_HEEL:
/* 822 */                       z = false;
/* 831 */                       OiOO1Ioo.I001iOo1i0O(iArr[i6], (List) unsafe.getObject(obj, j), iIOOoll, false);
                                break;
                            case 30:
/* 809 */                       z = false;
/* 818 */                       OiOO1Ioo.I000oI1ioi(iArr[i6], (List) unsafe.getObject(obj, j), iIOOoll, false);
                                break;
                            case PoseLandmark.LEFT_FOOT_INDEX:
/* 796 */                       z = false;
/* 805 */                       OiOO1Ioo.I001IIilI0O(iArr[i6], (List) unsafe.getObject(obj, j), iIOOoll, false);
                                break;
                            case 32:
/* 783 */                       z = false;
/* 792 */                       OiOO1Ioo.I001IO000(iArr[i6], (List) unsafe.getObject(obj, j), iIOOoll, false);
                                break;
                            case 33:
/* 770 */                       z = false;
/* 779 */                       OiOO1Ioo.I001i1O0Ol(iArr[i6], (List) unsafe.getObject(obj, j), iIOOoll, false);
                                break;
                            case 34:
/* 763 */                       z = false;
/* 764 */                       OiOO1Ioo.I001i1lo1io(iArr[i6], (List) unsafe.getObject(obj, j), iIOOoll, false);
                                break;
                            case InputImage.IMAGE_FORMAT_YUV_420_888:
/* 750 */                       OiOO1Ioo.I000o00OoI0I(iArr[i6], (List) unsafe.getObject(obj, j), iIOOoll, i == true ? 1 : 0);
                                break;
                            case 36:
/* 735 */                       OiOO1Ioo.I0010I0i(iArr[i6], (List) unsafe.getObject(obj, j), iIOOoll, i == true ? 1 : 0);
                                break;
                            case 37:
/* 720 */                       OiOO1Ioo.I00111O(iArr[i6], (List) unsafe.getObject(obj, j), iIOOoll, i == true ? 1 : 0);
                                break;
                            case 38:
/* 705 */                       OiOO1Ioo.I001l0I00(iArr[i6], (List) unsafe.getObject(obj, j), iIOOoll, i == true ? 1 : 0);
                                break;
                            case 39:
/* 690 */                       OiOO1Ioo.I0010o(iArr[i6], (List) unsafe.getObject(obj, j), iIOOoll, i == true ? 1 : 0);
                                break;
                            case 40:
/* 675 */                       OiOO1Ioo.I00100o1O0lo(iArr[i6], (List) unsafe.getObject(obj, j), iIOOoll, i == true ? 1 : 0);
                                break;
                            case 41:
/* 660 */                       OiOO1Ioo.I00100l0(iArr[i6], (List) unsafe.getObject(obj, j), iIOOoll, i == true ? 1 : 0);
                                break;
                            case 42:
/* 645 */                       OiOO1Ioo.I000lI(iArr[i6], (List) unsafe.getObject(obj, j), iIOOoll, i == true ? 1 : 0);
                                break;
                            case 43:
/* 630 */                       OiOO1Ioo.I001iOo1i0O(iArr[i6], (List) unsafe.getObject(obj, j), iIOOoll, i == true ? 1 : 0);
                                break;
                            case 44:
/* 615 */                       OiOO1Ioo.I000oI1ioi(iArr[i6], (List) unsafe.getObject(obj, j), iIOOoll, i == true ? 1 : 0);
                                break;
                            case BuildConfig.VERSION_CODE:
/* 600 */                       OiOO1Ioo.I001IIilI0O(iArr[i6], (List) unsafe.getObject(obj, j), iIOOoll, i == true ? 1 : 0);
                                break;
                            case 46:
/* 585 */                       OiOO1Ioo.I001IO000(iArr[i6], (List) unsafe.getObject(obj, j), iIOOoll, i == true ? 1 : 0);
                                break;
                            case 47:
/* 570 */                       OiOO1Ioo.I001i1O0Ol(iArr[i6], (List) unsafe.getObject(obj, j), iIOOoll, i == true ? 1 : 0);
                                break;
                            case 48:
/* 555 */                       OiOO1Ioo.I001i1lo1io(iArr[i6], (List) unsafe.getObject(obj, j), iIOOoll, true);
                                break;
                            case 49:
/* 507 */                       int i20 = iArr[i6];
/* 513 */                       List list4 = (List) unsafe.getObject(obj, j);
/* 515 */                       OiOIlIo oiOIlIoI000lI2 = o1lIoOI.I000lI(i6);
/* 519 */                       Class cls4 = OiOO1Ioo.I00000oIO;
/* 521 */                       if (list4 != null && !list4.isEmpty()) {
/* 534 */                           for (int i21 = 0; i21 < list4.size(); i21++) {
/* 540 */                               iIOOoll.I00iiO(i20, list4.get(i21), oiOIlIoI000lI2);
                                    }
                                }
                                break;
                            case 50:
/* 412 */                       Object object2 = unsafe.getObject(obj, j);
/* 416 */                       O1Oi11o o1Oi11o = o1lIoOI.I000lI;
/* 418 */                       if (object2 != null) {
/* 424 */                           int i22 = 2;
/* 426 */                           Object obj2 = o1lIoOI.I00000oOI[(i6 / 3) * 2];
/* 428 */                           o1Oi11o.getClass();
/* 433 */                           IoIlOo1o0IIl ioIlOo1o0IIl = ((O1OOilo1l) obj2).I00000oIO;
/* 449 */                           for (Map.Entry entry : ((O1Oi011o) object2).entrySet()) {
/* 457 */                               iOOOio0o.I001lllioOl(i8, i22);
/* 472 */                               iOOOio0o.I00II0Ol1O0l(O1OOilo1l.I00000oIO(ioIlOo1o0IIl, entry.getKey(), entry.getValue()));
/* 475 */                               Object key = entry.getKey();
/* 479 */                               Object value = entry.getValue();
/* 489 */                               IlIO0l0OIlol.I00000oOI(iOOOio0o, (i011lOoO) ioIlOo1o0IIl.I00iiI, i, key);
/* 497 */                               IlIO0l0OIlol.I00000oOI(iOOOio0o, (i011lOoO) ioIlOo1o0IIl.I00iiO, 2, value);
/* 500 */                               i22 = 2;
/* 504 */                               i = 1;
                                    }
                                }
                                break;
                            case 51:
/* 391 */                       if (o1lIoOI.I00100o1O0lo(obj, i8, i6)) {
/* 407 */                           iOOOio0o.I00111O(i8, Double.doubleToRawLongBits(((Double) OoilIIl.I000O01llI0(j, obj)).doubleValue()));
                                }
                                break;
                            case 52:
/* 366 */                       if (o1lIoOI.I00100o1O0lo(obj, i8, i6)) {
/* 382 */                           iOOOio0o.I0010I0i(i8, Float.floatToRawIntBits(((Float) OoilIIl.I000O01llI0(j, obj)).floatValue()));
                                }
                                break;
                            case 53:
/* 351 */                       if (o1lIoOI.I00100o1O0lo(obj, i8, i6)) {
/* 357 */                           iOOOio0o.I00II0oii1o(i8, I001l0I00(j, obj));
                                }
                                break;
                            case 54:
/* 336 */                       if (o1lIoOI.I00100o1O0lo(obj, i8, i6)) {
/* 342 */                           iOOOio0o.I00II0oii1o(i8, I001l0I00(j, obj));
                                }
                                break;
                            case 55:
/* 321 */                       if (o1lIoOI.I00100o1O0lo(obj, i8, i6)) {
/* 327 */                           iOOOio0o.I001IO000(i8, I001iOo1i0O(j, obj));
                                }
                                break;
                            case 56:
/* 306 */                       if (o1lIoOI.I00100o1O0lo(obj, i8, i6)) {
/* 312 */                           iOOOio0o.I00111O(i8, I001l0I00(j, obj));
                                }
                                break;
                            case 57:
/* 291 */                       if (o1lIoOI.I00100o1O0lo(obj, i8, i6)) {
/* 297 */                           iOOOio0o.I0010I0i(i8, I001iOo1i0O(j, obj));
                                }
                                break;
                            case 58:
/* 270 */                       if (o1lIoOI.I00100o1O0lo(obj, i8, i6)) {
/* 282 */                           iOOOio0o.I000oI1ioi(i8, ((Boolean) OoilIIl.I000O01llI0(j, obj)).booleanValue());
                                }
                                break;
                            case 59:
/* 242 */                       if (o1lIoOI.I00100o1O0lo(obj, i8, i6)) {
/* 244 */                           Object object3 = unsafe.getObject(obj, j);
/* 250 */                           if (object3 instanceof String) {
/* 254 */                               iOOOio0o.I001l0I00(i8, (String) object3);
                                    } else {
/* 261 */                               iOOOio0o.I00100l0(i8, (IIO1ooI) object3);
                                    }
                                }
                                break;
                            case 60:
/* 221 */                       if (o1lIoOI.I00100o1O0lo(obj, i8, i6)) {
/* 233 */                           iOOOio0o.I001iOo1i0O(i8, (I01Ilo0i) unsafe.getObject(obj, j), o1lIoOI.I000lI(i6));
                                }
                                break;
                            case 61:
/* 204 */                       if (o1lIoOI.I00100o1O0lo(obj, i8, i6)) {
/* 212 */                           iOOOio0o.I00100l0(i8, (IIO1ooI) unsafe.getObject(obj, j));
                                }
                                break;
                            case 62:
/* 190 */                       if (o1lIoOI.I00100o1O0lo(obj, i8, i6)) {
/* 196 */                           iOOOio0o.I001lloI(i8, I001iOo1i0O(j, obj));
                                }
                                break;
                            case 63:
/* 176 */                       if (o1lIoOI.I00100o1O0lo(obj, i8, i6)) {
/* 182 */                           iOOOio0o.I001IO000(i8, I001iOo1i0O(j, obj));
                                }
                                break;
                            case Barcode.FORMAT_EAN_8:
/* 162 */                       if (o1lIoOI.I00100o1O0lo(obj, i8, i6)) {
/* 168 */                           iOOOio0o.I0010I0i(i8, I001iOo1i0O(j, obj));
                                }
                                break;
                            case 65:
/* 148 */                       if (o1lIoOI.I00100o1O0lo(obj, i8, i6)) {
/* 154 */                           iOOOio0o.I00111O(i8, I001l0I00(j, obj));
                                }
                                break;
                            case 66:
/* 129 */                       if (o1lIoOI.I00100o1O0lo(obj, i8, i6)) {
/* 131 */                           int iI001iOo1i0O = I001iOo1i0O(j, obj);
/* 140 */                           iOOOio0o.I001lloI(i8, (iI001iOo1i0O >> 31) ^ (iI001iOo1i0O << 1));
                                }
                                break;
                            case 67:
/* 109 */                       if (o1lIoOI.I00100o1O0lo(obj, i8, i6)) {
/* 111 */                           long jI001l0I00 = I001l0I00(j, obj);
/* 121 */                           iOOOio0o.I00II0oii1o(i8, (jI001l0I00 << (i == true ? 1L : 0L)) ^ (jI001l0I00 >> 63));
                                }
                                break;
                            case 68:
/* 91 */                        if (o1lIoOI.I00100o1O0lo(obj, i8, i6)) {
/* 101 */                           iIOOoll.I00iiO(i8, unsafe.getObject(obj, j), o1lIoOI.I000lI(i6));
                                }
                                break;
                        }
/* 1431 */              i6 += 3;
/* 1433 */              i4 = 1048575;
                    }
/* 1440 */          o1lIoOI.I000l1.getClass();
/* 1448 */          ((Io00l0) obj).unknownFields.I0000O(iIOOoll);
                }

                /* JADX WARN: Removed duplicated region for block: B:146:0x038e  */
                /* JADX WARN: Removed duplicated region for block: B:88:0x01cd  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int I000OOo1O(Io00l0 io00l0) {
                    int i;
                    int iI000O01llI0;
                    int iI000O01llI02;
                    int iI000O01llI03;
                    int iI000OiO;
                    int iI000O01llI04;
                    int iI000OiO2;
                    int iI000O01llI05;
                    int iI000O01llI06;
                    int iI000O01llI07;
                    int iI00000oIO;
                    int iI000OOo1O;
                    int iI0001Ioi1lo;
                    int iI000O01llI08;
                    int iI00000oIO2;
                    int iI0000Il00O;
                    int size;
                    int iI000OOo1O2;
                    int iI000O01llI09;
                    int iI000O01llI010;
                    int iI000O01llI011;
                    int size2;
                    int iI000O01llI012;
                    int iI000OOo1O3;
                    int iI00000oIO3;
                    int iI000O01llI013;
                    int iI000O01llI014;
                    int iI000O01llI015;
                    int iI000OiO3;
                    int iI000O01llI016;
                    int iI000OiO4;
                    int i2;
/* 1 */             O1lIoOI o1lIoOI = this;
/* 3 */             Io00l0 io00l02 = io00l0;
/* 5 */             int[] iArr = o1lIoOI.I00000oIO;
/* 10 */            int i3 = 1048575;
/* 12 */            int i4 = 0;
/* 13 */            int iI0001Ioi1lo2 = 0;
/* 15 */            for (int i5 = 0; i5 < iArr.length; i5 += 3) {
/* 17 */                int iI00IlilI0i0i = o1lIoOI.I00IlilI0i0i(i5);
/* 21 */                int iI00IioO0OiOi = I00IioO0OiOi(iI00IlilI0i0i);
/* 25 */                int i6 = iArr[i5];
/* 29 */                int i7 = iArr[i5 + 2];
/* 31 */                int i8 = i7 & 1048575;
/* 36 */                Unsafe unsafe = I000oI1ioi;
/* 38 */                if (iI00IioO0OiOi <= 17) {
/* 40 */                    if (i8 != i3) {
/* 47 */                        i4 = i8 == 1048575 ? 0 : unsafe.getInt(io00l02, i8);
/* 52 */                        i3 = i8;
                            }
/* 55 */                    i = 1 << (i7 >>> 20);
                        } else {
/* 58 */                    i = 0;
                        }
/* 59 */                long j = iI00IlilI0i0i & 1048575;
/* 65 */                if (iI00IioO0OiOi >= IlIOlI1iOi0O.I00iiI.I00iOIl) {
/* 69 */                    int i9 = IlIOlI1iOi0O.I00iiO.I00iOIl;
                        }
                        switch (iI00IioO0OiOi) {
                            case 0:
/* 1744 */                      if (o1lIoOI.I000oI1ioi(io00l02, i5, i3, i4, i)) {
/* 1746 */                          iI000O01llI0 = IOOOio0o.I000O01llI0(i6);
/* 170 */                           iI0000Il00O = iI000O01llI0 + 8;
/* 105 */                           iI0001Ioi1lo2 += iI0000Il00O;
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
/* 1731 */                      if (o1lIoOI.I000oI1ioi(io00l02, i5, i3, i4, i)) {
/* 1733 */                          iI000O01llI02 = IOOOio0o.I000O01llI0(i6);
/* 1490 */                          iI000O01llI06 = iI000O01llI02 + 4;
/* 1472 */                          iI0001Ioi1lo2 += iI000O01llI06;
                                }
/* 1473 */                      o1lIoOI = this;
/* 1475 */                      io00l02 = io00l0;
                                break;
                            case 2:
/* 1710 */                      if (o1lIoOI.I000oI1ioi(io00l02, i5, i3, i4, i)) {
/* 1712 */                          long j2 = unsafe.getLong(io00l02, j);
/* 1716 */                          iI000O01llI03 = IOOOio0o.I000O01llI0(i6);
/* 1720 */                          iI000OiO = IOOOio0o.I000OiO(j2);
/* 1427 */                          iI0001Ioi1lo2 += iI000OiO + iI000O01llI03;
                                }
/* 1428 */                      o1lIoOI = this;
                                break;
                            case 3:
/* 1689 */                      if (o1lIoOI.I000oI1ioi(io00l02, i5, i3, i4, i)) {
/* 1691 */                          long j3 = unsafe.getLong(io00l02, j);
/* 1695 */                          iI000O01llI03 = IOOOio0o.I000O01llI0(i6);
/* 1699 */                          iI000OiO = IOOOio0o.I000OiO(j3);
/* 1427 */                          iI0001Ioi1lo2 += iI000OiO + iI000O01llI03;
                                }
/* 1428 */                      o1lIoOI = this;
                                break;
                            case 4:
/* 1667 */                      if (o1lIoOI.I000oI1ioi(io00l02, i5, i3, i4, i)) {
/* 1669 */                          int i10 = unsafe.getInt(io00l02, j);
/* 1673 */                          iI000O01llI04 = IOOOio0o.I000O01llI0(i6);
/* 1678 */                          iI000OiO2 = IOOOio0o.I000OiO(i10);
/* 1456 */                          iI0001Ioi1lo = iI000OiO2 + iI000O01llI04;
/* 1457 */                          iI0001Ioi1lo2 += iI0001Ioi1lo;
                                }
/* 1428 */                      o1lIoOI = this;
                                break;
                            case 5:
/* 1654 */                      if (o1lIoOI.I000oI1ioi(io00l02, i5, i3, i4, i)) {
/* 1656 */                          iI000O01llI05 = IOOOio0o.I000O01llI0(i6);
/* 1470 */                          iI000O01llI06 = iI000O01llI05 + 8;
/* 1472 */                          iI0001Ioi1lo2 += iI000O01llI06;
                                }
/* 1473 */                      o1lIoOI = this;
/* 1475 */                      io00l02 = io00l0;
                                break;
                            case 6:
/* 1641 */                      if (o1lIoOI.I000oI1ioi(io00l02, i5, i3, i4, i)) {
/* 1643 */                          iI000O01llI02 = IOOOio0o.I000O01llI0(i6);
/* 1490 */                          iI000O01llI06 = iI000O01llI02 + 4;
/* 1472 */                          iI0001Ioi1lo2 += iI000O01llI06;
                                }
/* 1473 */                      o1lIoOI = this;
/* 1475 */                      io00l02 = io00l0;
                                break;
                            case 7:
/* 1627 */                      if (o1lIoOI.I000oI1ioi(io00l02, i5, i3, i4, i)) {
/* 1633 */                          iI000O01llI06 = IOOOio0o.I000O01llI0(i6) + 1;
/* 1472 */                          iI0001Ioi1lo2 += iI000O01llI06;
                                }
/* 1473 */                      o1lIoOI = this;
/* 1475 */                      io00l02 = io00l0;
                                break;
                            case 8:
/* 1590 */                      if (o1lIoOI.I000oI1ioi(io00l02, i5, i3, i4, i)) {
/* 1592 */                          Object object = unsafe.getObject(io00l02, j);
/* 1606 */                          iI0001Ioi1lo2 = (object instanceof IIO1ooI ? IOOOio0o.I0001Ioi1lo(i6, (IIO1ooI) object) : IOOOio0o.I000II((String) object) + IOOOio0o.I000O01llI0(i6)) + iI0001Ioi1lo2;
                                }
/* 1428 */                      o1lIoOI = this;
                                break;
                            case 9:
/* 1557 */                      if (o1lIoOI.I000oI1ioi(io00l02, i5, i3, i4, i)) {
/* 1559 */                          Object object2 = unsafe.getObject(io00l02, j);
/* 1563 */                          OiOIlIo oiOIlIoI000lI = o1lIoOI.I000lI(i5);
/* 1567 */                          Class cls = OiOO1Ioo.I00000oIO;
/* 1571 */                          iI000O01llI07 = IOOOio0o.I000O01llI0(i6);
/* 1575 */                          iI00000oIO = ((I01Ilo0i) object2).I00000oIO(oiOIlIoI000lI);
/* 1579 */                          iI000OOo1O = IOOOio0o.I000OOo1O(iI00000oIO);
/* 274 */                           i2 = iI000OOo1O + iI00000oIO + iI000O01llI07;
/* 132 */                           iI0001Ioi1lo2 += i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 10:
/* 1539 */                      if (o1lIoOI.I000oI1ioi(io00l02, i5, i3, i4, i)) {
/* 1547 */                          iI0001Ioi1lo = IOOOio0o.I0001Ioi1lo(i6, (IIO1ooI) unsafe.getObject(io00l02, j));
/* 1457 */                          iI0001Ioi1lo2 += iI0001Ioi1lo;
                                }
/* 1428 */                      o1lIoOI = this;
                                break;
                            case 11:
/* 1519 */                      if (o1lIoOI.I000oI1ioi(io00l02, i5, i3, i4, i)) {
/* 1521 */                          int i11 = unsafe.getInt(io00l02, j);
/* 1525 */                          iI000O01llI04 = IOOOio0o.I000O01llI0(i6);
/* 1529 */                          iI000OiO2 = IOOOio0o.I000OOo1O(i11);
/* 1456 */                          iI0001Ioi1lo = iI000OiO2 + iI000O01llI04;
/* 1457 */                          iI0001Ioi1lo2 += iI0001Ioi1lo;
                                }
/* 1428 */                      o1lIoOI = this;
                                break;
                            case 12:
/* 1498 */                      if (o1lIoOI.I000oI1ioi(io00l02, i5, i3, i4, i)) {
/* 1500 */                          int i12 = unsafe.getInt(io00l02, j);
/* 1504 */                          iI000O01llI04 = IOOOio0o.I000O01llI0(i6);
/* 1509 */                          iI000OiO2 = IOOOio0o.I000OiO(i12);
/* 1456 */                          iI0001Ioi1lo = iI000OiO2 + iI000O01llI04;
/* 1457 */                          iI0001Ioi1lo2 += iI0001Ioi1lo;
                                }
/* 1428 */                      o1lIoOI = this;
                                break;
                            case 13:
/* 1484 */                      if (o1lIoOI.I000oI1ioi(io00l02, i5, i3, i4, i)) {
/* 1486 */                          iI000O01llI02 = IOOOio0o.I000O01llI0(i6);
/* 1490 */                          iI000O01llI06 = iI000O01llI02 + 4;
/* 1472 */                          iI0001Ioi1lo2 += iI000O01llI06;
                                }
/* 1473 */                      o1lIoOI = this;
/* 1475 */                      io00l02 = io00l0;
                                break;
                            case 14:
/* 1464 */                      if (o1lIoOI.I000oI1ioi(io00l02, i5, i3, i4, i)) {
/* 1466 */                          iI000O01llI05 = IOOOio0o.I000O01llI0(i6);
/* 1470 */                          iI000O01llI06 = iI000O01llI05 + 8;
/* 1472 */                          iI0001Ioi1lo2 += iI000O01llI06;
                                }
/* 1473 */                      o1lIoOI = this;
/* 1475 */                      io00l02 = io00l0;
                                break;
                            case 15:
/* 1437 */                      if (o1lIoOI.I000oI1ioi(io00l02, i5, i3, i4, i)) {
/* 1439 */                          int i13 = unsafe.getInt(io00l02, j);
/* 1443 */                          iI000O01llI04 = IOOOio0o.I000O01llI0(i6);
/* 1452 */                          iI000OiO2 = IOOOio0o.I000OOo1O((i13 >> 31) ^ (i13 << 1));
/* 1456 */                          iI0001Ioi1lo = iI000OiO2 + iI000O01llI04;
/* 1457 */                          iI0001Ioi1lo2 += iI0001Ioi1lo;
                                }
/* 1428 */                      o1lIoOI = this;
                                break;
                            case 16:
/* 1407 */                      if (o1lIoOI.I000oI1ioi(io00l02, i5, i3, i4, i)) {
/* 1409 */                          long j4 = unsafe.getLong(io00l02, j);
/* 1413 */                          iI000O01llI03 = IOOOio0o.I000O01llI0(i6);
/* 1422 */                          iI000OiO = IOOOio0o.I000OiO((j4 << 1) ^ (j4 >> 63));
/* 1427 */                          iI0001Ioi1lo2 += iI000OiO + iI000O01llI03;
                                }
/* 1428 */                      o1lIoOI = this;
                                break;
                            case 17:
/* 1378 */                      if (o1lIoOI.I000oI1ioi(io00l02, i5, i3, i4, i)) {
/* 1384 */                          I01Ilo0i i01Ilo0i = (I01Ilo0i) unsafe.getObject(io00l02, j);
/* 1386 */                          OiOIlIo oiOIlIoI000lI2 = o1lIoOI.I000lI(i5);
/* 1394 */                          iI000O01llI08 = IOOOio0o.I000O01llI0(i6) * 2;
/* 1396 */                          iI00000oIO2 = i01Ilo0i.I00000oIO(oiOIlIoI000lI2);
/* 104 */                           iI0000Il00O = iI00000oIO2 + iI000O01llI08;
/* 105 */                           iI0001Ioi1lo2 += iI0000Il00O;
                                    break;
                                } else {
                                    break;
                                }
                            case PoseLandmark.RIGHT_PINKY:
/* 1367 */                      iI0000Il00O = OiOO1Ioo.I0000Il00O(i6, (List) unsafe.getObject(io00l02, j));
/* 105 */                       iI0001Ioi1lo2 += iI0000Il00O;
                                break;
                            case PoseLandmark.LEFT_INDEX:
/* 1355 */                      iI0000Il00O = OiOO1Ioo.I00000oOI(i6, (List) unsafe.getObject(io00l02, j));
/* 105 */                       iI0001Ioi1lo2 += iI0000Il00O;
                                break;
                            case PoseLandmark.RIGHT_INDEX:
/* 1321 */                      List list = (List) unsafe.getObject(io00l02, j);
/* 1323 */                      Class cls2 = OiOO1Ioo.I00000oIO;
/* 1346 */                      iI000O01llI010 = list.size() == 0 ? 0 : (IOOOio0o.I000O01llI0(i6) * list.size()) + OiOO1Ioo.I0000oI00(list);
/* 923 */                       iI0001Ioi1lo2 += iI000O01llI010;
                                break;
                            case PoseLandmark.LEFT_THUMB:
/* 1295 */                      List list2 = (List) unsafe.getObject(io00l02, j);
/* 1297 */                      Class cls3 = OiOO1Ioo.I00000oIO;
/* 1299 */                      size = list2.size();
/* 1303 */                      if (size != 0) {
/* 1307 */                          iI000OOo1O2 = OiOO1Ioo.I000OOo1O(list2);
/* 1311 */                          iI000O01llI09 = IOOOio0o.I000O01llI0(i6);
/* 922 */                           iI000O01llI010 = (iI000O01llI09 * size) + iI000OOo1O2;
/* 923 */                           iI0001Ioi1lo2 += iI000O01llI010;
                                    break;
                                }
/* 923 */                       iI0001Ioi1lo2 += iI000O01llI010;
                            case PoseLandmark.RIGHT_THUMB:
/* 1269 */                      List list3 = (List) unsafe.getObject(io00l02, j);
/* 1271 */                      Class cls4 = OiOO1Ioo.I00000oIO;
/* 1273 */                      size = list3.size();
/* 1277 */                      if (size != 0) {
/* 1281 */                          iI000OOo1O2 = OiOO1Ioo.I0000O(list3);
/* 1285 */                          iI000O01llI09 = IOOOio0o.I000O01llI0(i6);
/* 922 */                           iI000O01llI010 = (iI000O01llI09 * size) + iI000OOo1O2;
/* 923 */                           iI0001Ioi1lo2 += iI000O01llI010;
                                    break;
                                }
/* 923 */                       iI0001Ioi1lo2 += iI000O01llI010;
                            case PoseLandmark.LEFT_HIP:
/* 1259 */                      iI0000Il00O = OiOO1Ioo.I0000Il00O(i6, (List) unsafe.getObject(io00l02, j));
/* 105 */                       iI0001Ioi1lo2 += iI0000Il00O;
                                break;
                            case PoseLandmark.RIGHT_HIP:
/* 1247 */                      iI0000Il00O = OiOO1Ioo.I00000oOI(i6, (List) unsafe.getObject(io00l02, j));
/* 105 */                       iI0001Ioi1lo2 += iI0000Il00O;
                                break;
                            case PoseLandmark.LEFT_KNEE:
/* 1221 */                      List list4 = (List) unsafe.getObject(io00l02, j);
/* 1223 */                      Class cls5 = OiOO1Ioo.I00000oIO;
/* 1225 */                      int size3 = list4.size();
/* 1238 */                      iI000O01llI013 = size3 == 0 ? 0 : (IOOOio0o.I000O01llI0(i6) + 1) * size3;
/* 514 */                       iI0001Ioi1lo2 += iI000O01llI013;
                                break;
                            case PoseLandmark.RIGHT_KNEE:
/* 1122 */                      List list5 = (List) unsafe.getObject(io00l02, j);
/* 1124 */                      Class cls6 = OiOO1Ioo.I00000oIO;
/* 1126 */                      int size4 = list5.size();
/* 1130 */                      if (size4 != 0) {
/* 1138 */                          iI000O01llI010 = IOOOio0o.I000O01llI0(i6) * size4;
/* 1141 */                          if (list5 instanceof O0o1oOII) {
/* 1143 */                              O0o1oOII o0o1oOII = (O0o1oOII) list5;
/* 1146 */                              for (int i14 = 0; i14 < size4; i14++) {
/* 1148 */                                  Object objI000II = o0o1oOII.I000II();
/* 1154 */                                  if (objI000II instanceof IIO1ooI) {
/* 1158 */                                      int size5 = ((IIO1ooI) objI000II).size();
/* 1167 */                                      iI000O01llI010 = IOOOio0o.I000OOo1O(size5) + size5 + iI000O01llI010;
                                            } else {
/* 1176 */                                      iI000O01llI010 = IOOOio0o.I000II((String) objI000II) + iI000O01llI010;
                                            }
                                        }
                                    } else {
/* 1182 */                              for (int i15 = 0; i15 < size4; i15++) {
/* 1184 */                                  Object obj = list5.get(i15);
/* 1190 */                                  if (obj instanceof IIO1ooI) {
/* 1194 */                                      int size6 = ((IIO1ooI) obj).size();
/* 1203 */                                      iI000O01llI010 = IOOOio0o.I000OOo1O(size6) + size6 + iI000O01llI010;
                                            } else {
/* 1212 */                                      iI000O01llI010 = IOOOio0o.I000II((String) obj) + iI000O01llI010;
                                            }
                                        }
                                    }
                                }
/* 923 */                       iI0001Ioi1lo2 += iI000O01llI010;
                                break;
                            case 27:
/* 1072 */                      List list6 = (List) unsafe.getObject(io00l02, j);
/* 1074 */                      OiOIlIo oiOIlIoI000lI3 = o1lIoOI.I000lI(i5);
/* 1078 */                      Class cls7 = OiOO1Ioo.I00000oIO;
/* 1080 */                      int size7 = list6.size();
/* 1084 */                      if (size7 == 0) {
/* 1086 */                          iI000O01llI011 = 0;
                                } else {
/* 1092 */                          iI000O01llI011 = IOOOio0o.I000O01llI0(i6) * size7;
/* 1094 */                          for (int i16 = 0; i16 < size7; i16++) {
/* 1102 */                              int iI00000oIO4 = ((I01Ilo0i) list6.get(i16)).I00000oIO(oiOIlIoI000lI3);
/* 1111 */                              iI000O01llI011 += IOOOio0o.I000OOo1O(iI00000oIO4) + iI00000oIO4;
                                    }
                                }
/* 1115 */                      iI0001Ioi1lo2 += iI000O01llI011;
                                break;
                            case PoseLandmark.RIGHT_ANKLE:
/* 1026 */                      List list7 = (List) unsafe.getObject(io00l02, j);
/* 1028 */                      Class cls8 = OiOO1Ioo.I00000oIO;
/* 1030 */                      int size8 = list7.size();
/* 1034 */                      if (size8 != 0) {
/* 1041 */                          iI000O01llI010 = IOOOio0o.I000O01llI0(i6) * size8;
/* 1047 */                          for (int i17 = 0; i17 < list7.size(); i17++) {
/* 1055 */                              int size9 = ((IIO1ooI) list7.get(i17)).size();
/* 1064 */                              iI000O01llI010 += IOOOio0o.I000OOo1O(size9) + size9;
                                    }
                                }
/* 923 */                       iI0001Ioi1lo2 += iI000O01llI010;
                                break;
                            case PoseLandmark.LEFT_HEEL:
/* 1002 */                      List list8 = (List) unsafe.getObject(io00l02, j);
/* 1004 */                      Class cls9 = OiOO1Ioo.I00000oIO;
/* 1006 */                      size = list8.size();
/* 1010 */                      if (size != 0) {
/* 1013 */                          iI000OOo1O2 = OiOO1Ioo.I000O01llI0(list8);
/* 1017 */                          iI000O01llI09 = IOOOio0o.I000O01llI0(i6);
/* 922 */                           iI000O01llI010 = (iI000O01llI09 * size) + iI000OOo1O2;
/* 923 */                           iI0001Ioi1lo2 += iI000O01llI010;
                                    break;
                                }
/* 923 */                       iI0001Ioi1lo2 += iI000O01llI010;
                            case 30:
/* 978 */                       List list9 = (List) unsafe.getObject(io00l02, j);
/* 980 */                       Class cls10 = OiOO1Ioo.I00000oIO;
/* 982 */                       size = list9.size();
/* 986 */                       if (size != 0) {
/* 989 */                           iI000OOo1O2 = OiOO1Ioo.I00000oIO(list9);
/* 993 */                           iI000O01llI09 = IOOOio0o.I000O01llI0(i6);
/* 922 */                           iI000O01llI010 = (iI000O01llI09 * size) + iI000OOo1O2;
/* 923 */                           iI0001Ioi1lo2 += iI000O01llI010;
                                    break;
                                }
/* 923 */                       iI0001Ioi1lo2 += iI000O01llI010;
                            case PoseLandmark.LEFT_FOOT_INDEX:
/* 968 */                       iI0000Il00O = OiOO1Ioo.I00000oOI(i6, (List) unsafe.getObject(io00l02, j));
/* 105 */                       iI0001Ioi1lo2 += iI0000Il00O;
                                break;
                            case 32:
/* 956 */                       iI0000Il00O = OiOO1Ioo.I0000Il00O(i6, (List) unsafe.getObject(io00l02, j));
/* 105 */                       iI0001Ioi1lo2 += iI0000Il00O;
                                break;
                            case 33:
/* 930 */                       List list10 = (List) unsafe.getObject(io00l02, j);
/* 932 */                       Class cls11 = OiOO1Ioo.I00000oIO;
/* 934 */                       size = list10.size();
/* 938 */                       if (size != 0) {
/* 941 */                           iI000OOo1O2 = OiOO1Ioo.I0001Ioi1lo(list10);
/* 945 */                           iI000O01llI09 = IOOOio0o.I000O01llI0(i6);
/* 922 */                           iI000O01llI010 = (iI000O01llI09 * size) + iI000OOo1O2;
/* 923 */                           iI0001Ioi1lo2 += iI000O01llI010;
                                    break;
                                }
/* 923 */                       iI0001Ioi1lo2 += iI000O01llI010;
                            case 34:
/* 901 */                       List list11 = (List) unsafe.getObject(io00l02, j);
/* 903 */                       Class cls12 = OiOO1Ioo.I00000oIO;
/* 905 */                       size = list11.size();
/* 909 */                       if (size != 0) {
/* 913 */                           iI000OOo1O2 = OiOO1Ioo.I000II(list11);
/* 917 */                           iI000O01llI09 = IOOOio0o.I000O01llI0(i6);
/* 922 */                           iI000O01llI010 = (iI000O01llI09 * size) + iI000OOo1O2;
/* 923 */                           iI0001Ioi1lo2 += iI000O01llI010;
                                    break;
                                }
/* 923 */                       iI0001Ioi1lo2 += iI000O01llI010;
                            case InputImage.IMAGE_FORMAT_YUV_420_888:
/* 875 */                       List list12 = (List) unsafe.getObject(io00l02, j);
/* 877 */                       Class cls13 = OiOO1Ioo.I00000oIO;
/* 883 */                       size2 = list12.size() * 8;
/* 885 */                       if (size2 > 0) {
/* 887 */                           iI000O01llI012 = IOOOio0o.I000O01llI0(i6);
/* 891 */                           iI000OOo1O3 = IOOOio0o.I000OOo1O(size2);
/* 587 */                           iI0001Ioi1lo2 += iI000OOo1O3 + iI000O01llI012 + size2;
                                    break;
                                } else {
                                    break;
                                }
                            case 36:
/* 849 */                       List list13 = (List) unsafe.getObject(io00l02, j);
/* 851 */                       Class cls14 = OiOO1Ioo.I00000oIO;
/* 857 */                       size2 = list13.size() * 4;
/* 859 */                       if (size2 > 0) {
/* 861 */                           iI000O01llI012 = IOOOio0o.I000O01llI0(i6);
/* 865 */                           iI000OOo1O3 = IOOOio0o.I000OOo1O(size2);
/* 587 */                           iI0001Ioi1lo2 += iI000OOo1O3 + iI000O01llI012 + size2;
                                    break;
                                } else {
                                    break;
                                }
                            case 37:
/* 829 */                       size2 = OiOO1Ioo.I0000oI00((List) unsafe.getObject(io00l02, j));
/* 833 */                       if (size2 > 0) {
/* 835 */                           iI000O01llI012 = IOOOio0o.I000O01llI0(i6);
/* 839 */                           iI000OOo1O3 = IOOOio0o.I000OOo1O(size2);
/* 587 */                           iI0001Ioi1lo2 += iI000OOo1O3 + iI000O01llI012 + size2;
                                    break;
                                } else {
                                    break;
                                }
                            case 38:
/* 807 */                       size2 = OiOO1Ioo.I000OOo1O((List) unsafe.getObject(io00l02, j));
/* 811 */                       if (size2 > 0) {
/* 813 */                           iI000O01llI012 = IOOOio0o.I000O01llI0(i6);
/* 817 */                           iI000OOo1O3 = IOOOio0o.I000OOo1O(size2);
/* 587 */                           iI0001Ioi1lo2 += iI000OOo1O3 + iI000O01llI012 + size2;
                                    break;
                                } else {
                                    break;
                                }
                            case 39:
/* 785 */                       size2 = OiOO1Ioo.I0000O((List) unsafe.getObject(io00l02, j));
/* 789 */                       if (size2 > 0) {
/* 791 */                           iI000O01llI012 = IOOOio0o.I000O01llI0(i6);
/* 795 */                           iI000OOo1O3 = IOOOio0o.I000OOo1O(size2);
/* 587 */                           iI0001Ioi1lo2 += iI000OOo1O3 + iI000O01llI012 + size2;
                                    break;
                                } else {
                                    break;
                                }
                            case 40:
/* 757 */                       List list14 = (List) unsafe.getObject(io00l02, j);
/* 759 */                       Class cls15 = OiOO1Ioo.I00000oIO;
/* 765 */                       size2 = list14.size() * 8;
/* 767 */                       if (size2 > 0) {
/* 769 */                           iI000O01llI012 = IOOOio0o.I000O01llI0(i6);
/* 773 */                           iI000OOo1O3 = IOOOio0o.I000OOo1O(size2);
/* 587 */                           iI0001Ioi1lo2 += iI000OOo1O3 + iI000O01llI012 + size2;
                                    break;
                                } else {
                                    break;
                                }
                            case 41:
/* 731 */                       List list15 = (List) unsafe.getObject(io00l02, j);
/* 733 */                       Class cls16 = OiOO1Ioo.I00000oIO;
/* 739 */                       size2 = list15.size() * 4;
/* 741 */                       if (size2 > 0) {
/* 743 */                           iI000O01llI012 = IOOOio0o.I000O01llI0(i6);
/* 747 */                           iI000OOo1O3 = IOOOio0o.I000OOo1O(size2);
/* 587 */                           iI0001Ioi1lo2 += iI000OOo1O3 + iI000O01llI012 + size2;
                                    break;
                                } else {
                                    break;
                                }
                            case 42:
/* 707 */                       List list16 = (List) unsafe.getObject(io00l02, j);
/* 709 */                       Class cls17 = OiOO1Ioo.I00000oIO;
/* 711 */                       size2 = list16.size();
/* 715 */                       if (size2 > 0) {
/* 717 */                           iI000O01llI012 = IOOOio0o.I000O01llI0(i6);
/* 721 */                           iI000OOo1O3 = IOOOio0o.I000OOo1O(size2);
/* 587 */                           iI0001Ioi1lo2 += iI000OOo1O3 + iI000O01llI012 + size2;
                                    break;
                                } else {
                                    break;
                                }
                            case 43:
/* 688 */                       size2 = OiOO1Ioo.I000O01llI0((List) unsafe.getObject(io00l02, j));
/* 692 */                       if (size2 > 0) {
/* 694 */                           iI000O01llI012 = IOOOio0o.I000O01llI0(i6);
/* 698 */                           iI000OOo1O3 = IOOOio0o.I000OOo1O(size2);
/* 587 */                           iI0001Ioi1lo2 += iI000OOo1O3 + iI000O01llI012 + size2;
                                    break;
                                } else {
                                    break;
                                }
                            case 44:
/* 667 */                       size2 = OiOO1Ioo.I00000oIO((List) unsafe.getObject(io00l02, j));
/* 671 */                       if (size2 > 0) {
/* 673 */                           iI000O01llI012 = IOOOio0o.I000O01llI0(i6);
/* 677 */                           iI000OOo1O3 = IOOOio0o.I000OOo1O(size2);
/* 587 */                           iI0001Ioi1lo2 += iI000OOo1O3 + iI000O01llI012 + size2;
                                    break;
                                } else {
                                    break;
                                }
                            case BuildConfig.VERSION_CODE:
/* 640 */                       List list17 = (List) unsafe.getObject(io00l02, j);
/* 642 */                       Class cls18 = OiOO1Ioo.I00000oIO;
/* 648 */                       size2 = list17.size() * 4;
/* 650 */                       if (size2 > 0) {
/* 652 */                           iI000O01llI012 = IOOOio0o.I000O01llI0(i6);
/* 656 */                           iI000OOo1O3 = IOOOio0o.I000OOo1O(size2);
/* 587 */                           iI0001Ioi1lo2 += iI000OOo1O3 + iI000O01llI012 + size2;
                                    break;
                                } else {
                                    break;
                                }
                            case 46:
/* 615 */                       List list18 = (List) unsafe.getObject(io00l02, j);
/* 617 */                       Class cls19 = OiOO1Ioo.I00000oIO;
/* 623 */                       size2 = list18.size() * 8;
/* 625 */                       if (size2 > 0) {
/* 627 */                           iI000O01llI012 = IOOOio0o.I000O01llI0(i6);
/* 631 */                           iI000OOo1O3 = IOOOio0o.I000OOo1O(size2);
/* 587 */                           iI0001Ioi1lo2 += iI000OOo1O3 + iI000O01llI012 + size2;
                                    break;
                                } else {
                                    break;
                                }
                            case 47:
/* 596 */                       size2 = OiOO1Ioo.I0001Ioi1lo((List) unsafe.getObject(io00l02, j));
/* 600 */                       if (size2 > 0) {
/* 602 */                           iI000O01llI012 = IOOOio0o.I000O01llI0(i6);
/* 606 */                           iI000OOo1O3 = IOOOio0o.I000OOo1O(size2);
/* 587 */                           iI0001Ioi1lo2 += iI000OOo1O3 + iI000O01llI012 + size2;
                                    break;
                                } else {
                                    break;
                                }
                            case 48:
/* 571 */                       size2 = OiOO1Ioo.I000II((List) unsafe.getObject(io00l02, j));
/* 575 */                       if (size2 > 0) {
/* 577 */                           iI000O01llI012 = IOOOio0o.I000O01llI0(i6);
/* 581 */                           iI000OOo1O3 = IOOOio0o.I000OOo1O(size2);
/* 587 */                           iI0001Ioi1lo2 += iI000OOo1O3 + iI000O01llI012 + size2;
                                    break;
                                } else {
                                    break;
                                }
                            case 49:
/* 521 */                       List list19 = (List) unsafe.getObject(io00l02, j);
/* 523 */                       OiOIlIo oiOIlIoI000lI4 = o1lIoOI.I000lI(i5);
/* 527 */                       Class cls20 = OiOO1Ioo.I00000oIO;
/* 529 */                       int size10 = list19.size();
/* 533 */                       if (size10 == 0) {
/* 535 */                           iI00000oIO3 = 0;
                                } else {
/* 538 */                           iI00000oIO3 = 0;
/* 539 */                           for (int i18 = 0; i18 < size10; i18++) {
/* 558 */                               iI00000oIO3 += ((I01Ilo0i) list19.get(i18)).I00000oIO(oiOIlIoI000lI4) + (IOOOio0o.I000O01llI0(i6) * 2);
                                    }
                                }
/* 562 */                       iI0001Ioi1lo2 += iI00000oIO3;
                                break;
                            case 50:
/* 435 */                       O1Oi11o o1Oi11o = o1lIoOI.I000lI;
/* 437 */                       Object object3 = unsafe.getObject(io00l02, j);
/* 447 */                       Object obj2 = o1lIoOI.I00000oOI[(i5 / 3) * 2];
/* 449 */                       o1Oi11o.getClass();
/* 452 */                       O1Oi011o o1Oi011o = (O1Oi011o) object3;
/* 454 */                       O1OOilo1l o1OOilo1l = (O1OOilo1l) obj2;
/* 460 */                       if (!o1Oi011o.isEmpty()) {
/* 472 */                           iI000O01llI013 = 0;
/* 477 */                           for (Map.Entry entry : o1Oi011o.entrySet()) {
/* 485 */                               Object key = entry.getKey();
/* 489 */                               Object value = entry.getValue();
/* 493 */                               o1OOilo1l.getClass();
/* 496 */                               int iI000O01llI017 = IOOOio0o.I000O01llI0(i6);
/* 502 */                               int iI00000oIO5 = O1OOilo1l.I00000oIO(o1OOilo1l.I00000oIO, key, value);
/* 512 */                               iI000O01llI013 += IOOOio0o.I000OOo1O(iI00000oIO5) + iI00000oIO5 + iI000O01llI017;
                                    }
                                }
/* 514 */                       iI0001Ioi1lo2 += iI000O01llI013;
                                break;
                            case 51:
/* 427 */                       if (o1lIoOI.I00100o1O0lo(io00l02, i6, i5)) {
/* 429 */                           iI000O01llI0 = IOOOio0o.I000O01llI0(i6);
/* 170 */                           iI0000Il00O = iI000O01llI0 + 8;
/* 105 */                           iI0001Ioi1lo2 += iI0000Il00O;
                                    break;
                                } else {
                                    break;
                                }
                            case 52:
/* 415 */                       if (o1lIoOI.I00100o1O0lo(io00l02, i6, i5)) {
/* 417 */                           iI000O01llI014 = IOOOio0o.I000O01llI0(i6);
/* 183 */                           iI0000Il00O = iI000O01llI014 + 4;
/* 105 */                           iI0001Ioi1lo2 += iI0000Il00O;
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
/* 395 */                       if (o1lIoOI.I00100o1O0lo(io00l02, i6, i5)) {
/* 397 */                           long jI001l0I00 = I001l0I00(j, io00l02);
/* 401 */                           iI000O01llI015 = IOOOio0o.I000O01llI0(i6);
/* 405 */                           iI000OiO3 = IOOOio0o.I000OiO(jI001l0I00);
/* 131 */                           i2 = iI000OiO3 + iI000O01llI015;
/* 132 */                           iI0001Ioi1lo2 += i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
/* 375 */                       if (o1lIoOI.I00100o1O0lo(io00l02, i6, i5)) {
/* 377 */                           long jI001l0I002 = I001l0I00(j, io00l02);
/* 381 */                           iI000O01llI015 = IOOOio0o.I000O01llI0(i6);
/* 385 */                           iI000OiO3 = IOOOio0o.I000OiO(jI001l0I002);
/* 131 */                           i2 = iI000OiO3 + iI000O01llI015;
/* 132 */                           iI0001Ioi1lo2 += i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 55:
/* 354 */                       if (o1lIoOI.I00100o1O0lo(io00l02, i6, i5)) {
/* 356 */                           int iI001iOo1i0O = I001iOo1i0O(j, io00l02);
/* 360 */                           iI000O01llI016 = IOOOio0o.I000O01llI0(i6);
/* 365 */                           iI000OiO4 = IOOOio0o.I000OiO(iI001iOo1i0O);
/* 158 */                           iI0000Il00O = iI000OiO4 + iI000O01llI016;
/* 105 */                           iI0001Ioi1lo2 += iI0000Il00O;
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
/* 342 */                       if (o1lIoOI.I00100o1O0lo(io00l02, i6, i5)) {
/* 344 */                           iI000O01llI0 = IOOOio0o.I000O01llI0(i6);
/* 170 */                           iI0000Il00O = iI000O01llI0 + 8;
/* 105 */                           iI0001Ioi1lo2 += iI0000Il00O;
                                    break;
                                } else {
                                    break;
                                }
                            case 57:
/* 330 */                       if (o1lIoOI.I00100o1O0lo(io00l02, i6, i5)) {
/* 332 */                           iI000O01llI014 = IOOOio0o.I000O01llI0(i6);
/* 183 */                           iI0000Il00O = iI000O01llI014 + 4;
/* 105 */                           iI0001Ioi1lo2 += iI0000Il00O;
                                    break;
                                } else {
                                    break;
                                }
                            case 58:
/* 317 */                       if (o1lIoOI.I00100o1O0lo(io00l02, i6, i5)) {
/* 323 */                           iI0000Il00O = IOOOio0o.I000O01llI0(i6) + 1;
/* 105 */                           iI0001Ioi1lo2 += iI0000Il00O;
                                    break;
                                } else {
                                    break;
                                }
                            case 59:
/* 281 */                       if (o1lIoOI.I00100o1O0lo(io00l02, i6, i5)) {
/* 283 */                           Object object4 = unsafe.getObject(io00l02, j);
/* 297 */                           iI0001Ioi1lo2 = (object4 instanceof IIO1ooI ? IOOOio0o.I0001Ioi1lo(i6, (IIO1ooI) object4) : IOOOio0o.I000II((String) object4) + IOOOio0o.I000O01llI0(i6)) + iI0001Ioi1lo2;
                                    break;
                                } else {
                                    break;
                                }
                            case 60:
/* 247 */                       if (o1lIoOI.I00100o1O0lo(io00l02, i6, i5)) {
/* 249 */                           Object object5 = unsafe.getObject(io00l02, j);
/* 253 */                           OiOIlIo oiOIlIoI000lI5 = o1lIoOI.I000lI(i5);
/* 257 */                           Class cls21 = OiOO1Ioo.I00000oIO;
/* 261 */                           iI000O01llI07 = IOOOio0o.I000O01llI0(i6);
/* 265 */                           iI00000oIO = ((I01Ilo0i) object5).I00000oIO(oiOIlIoI000lI5);
/* 269 */                           iI000OOo1O = IOOOio0o.I000OOo1O(iI00000oIO);
/* 274 */                           i2 = iI000OOo1O + iI00000oIO + iI000O01llI07;
/* 132 */                           iI0001Ioi1lo2 += i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 61:
/* 229 */                       if (o1lIoOI.I00100o1O0lo(io00l02, i6, i5)) {
/* 237 */                           iI0000Il00O = IOOOio0o.I0001Ioi1lo(i6, (IIO1ooI) unsafe.getObject(io00l02, j));
/* 105 */                           iI0001Ioi1lo2 += iI0000Il00O;
                                    break;
                                } else {
                                    break;
                                }
                            case 62:
/* 210 */                       if (o1lIoOI.I00100o1O0lo(io00l02, i6, i5)) {
/* 212 */                           int iI001iOo1i0O2 = I001iOo1i0O(j, io00l02);
/* 216 */                           iI000O01llI016 = IOOOio0o.I000O01llI0(i6);
/* 220 */                           iI000OiO4 = IOOOio0o.I000OOo1O(iI001iOo1i0O2);
/* 158 */                           iI0000Il00O = iI000OiO4 + iI000O01llI016;
/* 105 */                           iI0001Ioi1lo2 += iI0000Il00O;
                                    break;
                                } else {
                                    break;
                                }
                            case 63:
/* 190 */                       if (o1lIoOI.I00100o1O0lo(io00l02, i6, i5)) {
/* 192 */                           int iI001iOo1i0O3 = I001iOo1i0O(j, io00l02);
/* 196 */                           iI000O01llI016 = IOOOio0o.I000O01llI0(i6);
/* 201 */                           iI000OiO4 = IOOOio0o.I000OiO(iI001iOo1i0O3);
/* 158 */                           iI0000Il00O = iI000OiO4 + iI000O01llI016;
/* 105 */                           iI0001Ioi1lo2 += iI0000Il00O;
                                    break;
                                } else {
                                    break;
                                }
                            case Barcode.FORMAT_EAN_8:
/* 177 */                       if (o1lIoOI.I00100o1O0lo(io00l02, i6, i5)) {
/* 179 */                           iI000O01llI014 = IOOOio0o.I000O01llI0(i6);
/* 183 */                           iI0000Il00O = iI000O01llI014 + 4;
/* 105 */                           iI0001Ioi1lo2 += iI0000Il00O;
                                    break;
                                } else {
                                    break;
                                }
                            case 65:
/* 164 */                       if (o1lIoOI.I00100o1O0lo(io00l02, i6, i5)) {
/* 166 */                           iI000O01llI0 = IOOOio0o.I000O01llI0(i6);
/* 170 */                           iI0000Il00O = iI000O01llI0 + 8;
/* 105 */                           iI0001Ioi1lo2 += iI0000Il00O;
                                    break;
                                } else {
                                    break;
                                }
                            case 66:
/* 139 */                       if (o1lIoOI.I00100o1O0lo(io00l02, i6, i5)) {
/* 141 */                           int iI001iOo1i0O4 = I001iOo1i0O(j, io00l02);
/* 145 */                           iI000O01llI016 = IOOOio0o.I000O01llI0(i6);
/* 154 */                           iI000OiO4 = IOOOio0o.I000OOo1O((iI001iOo1i0O4 >> 31) ^ (iI001iOo1i0O4 << 1));
/* 158 */                           iI0000Il00O = iI000OiO4 + iI000O01llI016;
/* 105 */                           iI0001Ioi1lo2 += iI0000Il00O;
                                    break;
                                } else {
                                    break;
                                }
                            case 67:
/* 112 */                       if (o1lIoOI.I00100o1O0lo(io00l02, i6, i5)) {
/* 114 */                           long jI001l0I003 = I001l0I00(j, io00l02);
/* 118 */                           iI000O01llI015 = IOOOio0o.I000O01llI0(i6);
/* 127 */                           iI000OiO3 = IOOOio0o.I000OiO((jI001l0I003 << 1) ^ (jI001l0I003 >> 63));
/* 131 */                           i2 = iI000OiO3 + iI000O01llI015;
/* 132 */                           iI0001Ioi1lo2 += i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 68:
/* 82 */                        if (o1lIoOI.I00100o1O0lo(io00l02, i6, i5)) {
/* 88 */                            I01Ilo0i i01Ilo0i2 = (I01Ilo0i) unsafe.getObject(io00l02, j);
/* 90 */                            OiOIlIo oiOIlIoI000lI6 = o1lIoOI.I000lI(i5);
/* 98 */                            iI000O01llI08 = IOOOio0o.I000O01llI0(i6) * 2;
/* 100 */                           iI00000oIO2 = i01Ilo0i2.I00000oIO(oiOIlIoI000lI6);
/* 104 */                           iI0000Il00O = iI00000oIO2 + iI000O01llI08;
/* 105 */                           iI0001Ioi1lo2 += iI0000Il00O;
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
/* 1758 */          o1lIoOI.I000l1.getClass();
/* 1767 */          return io00l02.unknownFields.I00000oOI() + iI0001Ioi1lo2;
                }

                public final boolean I000OiO(Io00l0 io00l0, Io00l0 io00l02, int i) {
                    return I000o00OoI0I(i, io00l0) == I000o00OoI0I(i, io00l02);
                }

                public final void I000iOII(int i, Object obj, Object obj2) {
/* 3 */             int i2 = this.I00000oIO[i];
/* 18 */            if (OoilIIl.I000O01llI0(I00IlilI0i0i(i) & 1048575, obj) == null) {
/* 20 */                return;
                    }
/* 21 */            I000l1(i);
                }

                public final void I000l1(int i) {
/* 11 */            if (this.I00000oOI[((i / 3) * 2) + 1] == null) {
/* 13 */                return;
                    }
/* 14 */            OIiilo1Ool0o.I00000oIO();
                }

                public final OiOIlIo I000lI(int i) {
/* 3 */             int i2 = (i / 3) * 2;
/* 5 */             Object[] objArr = this.I00000oOI;
/* 9 */             OiOIlIo oiOIlIo = (OiOIlIo) objArr[i2];
/* 11 */            if (oiOIlIo != null) {
/* 13 */                return oiOIlIo;
                    }
/* 22 */            OiOIlIo oiOIlIoI00000oIO = OOi1oI.I0000Il00O.I00000oIO((Class) objArr[i2 + 1]);
/* 26 */            objArr[i2] = oiOIlIoI00000oIO;
/* 29 */            return oiOIlIoI00000oIO;
                }

                /* JADX WARN: Removed duplicated region for block: B:69:0x00f0 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:70:0x00f1 A[RETURN] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I000o00OoI0I(int i, Object obj) {
/* 5 */             int i2 = this.I00000oIO[i + 2];
/* 10 */            long j = i2 & 1048575;
/* 20 */            if (j == 1048575) {
/* 22 */                int iI00IlilI0i0i = I00IlilI0i0i(i);
/* 26 */                long j2 = iI00IlilI0i0i & 1048575;
                        switch (I00IioO0OiOi(iI00IlilI0i0i)) {
                            case 0:
                                return Double.doubleToRawLongBits(OoilIIl.I0000Il00O.I0000Il00O(j2, obj)) != 0;
                            case 1:
/* 212 */                       if (Float.floatToRawIntBits(OoilIIl.I0000Il00O.I0000O(j2, obj)) != 0) {
                                }
                                break;
                            case 2:
/* 199 */                       if (OoilIIl.I000II(j2, obj) != 0) {
                                }
                                break;
                            case 3:
/* 190 */                       if (OoilIIl.I000II(j2, obj) != 0) {
                                }
                                break;
                            case 4:
/* 181 */                       if (OoilIIl.I0001Ioi1lo(j2, obj) != 0) {
                                }
                                break;
                            case 5:
/* 174 */                       if (OoilIIl.I000II(j2, obj) != 0) {
                                }
                                break;
                            case 6:
/* 165 */                       if (OoilIIl.I0001Ioi1lo(j2, obj) != 0) {
                                }
                                break;
                            case 7:
/* 156 */                       return OoilIIl.I0000Il00O.I00000oIO(j2, obj);
                            case 8:
/* 122 */                       Object objI000O01llI0 = OoilIIl.I000O01llI0(j2, obj);
/* 128 */                       if (objI000O01llI0 instanceof String) {
/* 136 */                           return !((String) objI000O01llI0).isEmpty();
                                }
/* 140 */                       if (objI000O01llI0 instanceof IIO1ooI) {
/* 148 */                           return !IIO1ooI.I00iiO.equals(objI000O01llI0);
                                }
/* 150 */                       OIiilo1Ool0o.I00100o1O0lo();
/* 18 */                        return false;
                            case 9:
/* 118 */                       if (OoilIIl.I000O01llI0(j2, obj) != null) {
                                }
                                break;
                            case 10:
/* 112 */                       return !IIO1ooI.I00iiO.equals(OoilIIl.I000O01llI0(j2, obj));
                            case 11:
/* 98 */                        if (OoilIIl.I0001Ioi1lo(j2, obj) != 0) {
                                }
                                break;
                            case 12:
/* 90 */                        if (OoilIIl.I0001Ioi1lo(j2, obj) != 0) {
                                }
                                break;
                            case 13:
/* 82 */                        if (OoilIIl.I0001Ioi1lo(j2, obj) != 0) {
                                }
                                break;
                            case 14:
/* 74 */                        if (OoilIIl.I000II(j2, obj) != 0) {
                                }
                                break;
                            case 15:
/* 64 */                        if (OoilIIl.I0001Ioi1lo(j2, obj) != 0) {
                                }
                                break;
                            case 16:
/* 56 */                        if (OoilIIl.I000II(j2, obj) != 0) {
                                }
                                break;
                            case 17:
/* 46 */                        if (OoilIIl.I000O01llI0(j2, obj) != null) {
                                }
                                break;
                            default:
/* 38 */                        OIiilo1Ool0o.I00100o1O0lo();
/* 18 */                        return false;
                        }
                    } else if (((1 << (i2 >>> 20)) & OoilIIl.I0001Ioi1lo(j, obj)) != 0) {
                    }
                }

                public final boolean I000oI1ioi(Object obj, int i, int i2, int i3, int i4) {
                    return i2 == 1048575 ? I000o00OoI0I(i, obj) : (i3 & i4) != 0;
                }

                public final boolean I00100o1O0lo(Object obj, int i, int i2) {
                    return OoilIIl.I0001Ioi1lo((long) (this.I00000oIO[i2 + 2] & 1048575), obj) == i;
                }

                /* JADX WARN: Code restructure failed: missing block: B:32:0x00a2, code lost:
                
                    r9.put(r2, r3);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:33:0x00a5, code lost:
                
                    r10.I000iOII(r0);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:34:0x00a8, code lost:
                
                    return;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I0010I0i(Object obj, int i, Object obj2, Il1llli0O1 il1llli0O1, IOOOi1 iOOOi1) throws O000illO, O000lI0, O000o1i {
/* 8 */             long jI00IlilI0i0i = I00IlilI0i0i(i) & 1048575;
/* 10 */            Object objI000O01llI0 = OoilIIl.I000O01llI0(jI00IlilI0i0i, obj);
/* 14 */            O1Oi11o o1Oi11o = this.I000lI;
/* 16 */            if (objI000O01llI0 == null) {
/* 18 */                o1Oi11o.getClass();
/* 23 */                objI000O01llI0 = O1Oi011o.I00iiI.I00000oOI();
/* 27 */                OoilIIl.I000oI1ioi(obj, jI00IlilI0i0i, objI000O01llI0);
                    } else {
/* 31 */                o1Oi11o.getClass();
/* 39 */                if (!((O1Oi011o) objI000O01llI0).I00iOIl) {
/* 43 */                    Object objI00000oOI = O1Oi011o.I00iiI.I00000oOI();
/* 47 */                    O1Oi11o.I00000oIO(objI00000oOI, objI000O01llI0);
/* 50 */                    OoilIIl.I000oI1ioi(obj, jI00IlilI0i0i, objI00000oOI);
/* 53 */                    objI000O01llI0 = objI00000oOI;
                        }
                    }
/* 54 */            o1Oi11o.getClass();
/* 57 */            O1Oi011o o1Oi011o = (O1Oi011o) objI000O01llI0;
/* 61 */            IoIlOo1o0IIl ioIlOo1o0IIl = ((O1OOilo1l) obj2).I00000oIO;
/* 64 */            iOOOi1.I00ilI0I1(2);
/* 69 */            IOOOI0 ioooi0 = (IOOOI0) iOOOi1.I0000oI00;
/* 75 */            int iI000lI = ioooi0.I000lI(ioooi0.I00II0oii1o());
/* 79 */            ioIlOo1o0IIl.getClass();
/* 84 */            OOI1O1iIoi0 oOI1O1iIoi0 = (OOI1O1iIoi0) ioIlOo1o0IIl.I00iio;
/* 86 */            Object objI001lloI = "";
/* 88 */            Object objI001lloI2 = oOI1O1iIoi0;
                    while (true) {
                        try {
/* 89 */                    int iI0000O = iOOOi1.I0000O();
/* 96 */                    if (iI0000O == Integer.MAX_VALUE || ioooi0.I000O01llI0()) {
                                break;
                            }
/* 108 */                   if (iI0000O == 1) {
/* 145 */                       objI001lloI = iOOOi1.I001lloI((i011lOoO) ioIlOo1o0IIl.I00iiI, null, null);
                            } else if (iI0000O != 2) {
                                try {
/* 116 */                           if (!iOOOi1.I00ilO0()) {
/* 124 */                               throw new O0011oo("Unable to parse map entry.");
                                    }
                                } catch (O000o1i unused) {
/* 154 */                           if (!iOOOi1.I00ilO0()) {
/* 162 */                               throw new O0011oo("Unable to parse map entry.");
                                    }
                                }
                            } else {
/* 135 */                       objI001lloI2 = iOOOi1.I001lloI((i011lOoO) ioIlOo1o0IIl.I00iiO, oOI1O1iIoi0.getClass(), il1llli0O1);
                            }
                        } catch (Throwable th) {
/* 170 */                   ioooi0.I000iOII(iI000lI);
/* 399 */                   throw th;
                        }
                    }
                }

                public final void I0010o(int i, Object obj, Object obj2) {
/* 5 */             if (I000o00OoI0I(i, obj2)) {
/* 15 */                long jI00IlilI0i0i = I00IlilI0i0i(i) & 1048575;
/* 17 */                Unsafe unsafe = I000oI1ioi;
/* 19 */                Object object = unsafe.getObject(obj2, jI00IlilI0i0i);
/* 23 */                if (object == null) {
/* 88 */                    IoOOl0iOl1io.I0000Il00O(this.I00000oIO[i], obj2);
/* 98 */                    return;
                        }
/* 25 */                OiOIlIo oiOIlIoI000lI = I000lI(i);
/* 33 */                if (!I000o00OoI0I(i, obj)) {
/* 39 */                    if (I00100l0(object)) {
/* 45 */                        Io00l0 io00l0I0000O = oiOIlIoI000lI.I0000O();
/* 49 */                        oiOIlIoI000lI.I00000oIO(io00l0I0000O, object);
/* 52 */                        unsafe.putObject(obj, jI00IlilI0i0i, io00l0I0000O);
                            } else {
/* 41 */                        unsafe.putObject(obj, jI00IlilI0i0i, object);
                            }
/* 55 */                    I00IO1oi11O(i, obj);
/* 58 */                    return;
                        }
/* 59 */                Object object2 = unsafe.getObject(obj, jI00IlilI0i0i);
/* 67 */                if (!I00100l0(object2)) {
/* 69 */                    Io00l0 io00l0I0000O2 = oiOIlIoI000lI.I0000O();
/* 73 */                    oiOIlIoI000lI.I00000oIO(io00l0I0000O2, object2);
/* 76 */                    unsafe.putObject(obj, jI00IlilI0i0i, io00l0I0000O2);
/* 79 */                    object2 = io00l0I0000O2;
                        }
/* 80 */                oiOIlIoI000lI.I00000oIO(object2, object);
                    }
                }

                public final void I00111O(int i, Object obj, Object obj2) {
/* 1 */             int[] iArr = this.I00000oIO;
/* 3 */             int i2 = iArr[i];
/* 9 */             if (I00100o1O0lo(obj2, i2, i)) {
/* 19 */                long jI00IlilI0i0i = I00IlilI0i0i(i) & 1048575;
/* 21 */                Unsafe unsafe = I000oI1ioi;
/* 23 */                Object object = unsafe.getObject(obj2, jI00IlilI0i0i);
/* 27 */                if (object == null) {
/* 90 */                    IoOOl0iOl1io.I0000Il00O(iArr[i], obj2);
/* 98 */                    return;
                        }
/* 29 */                OiOIlIo oiOIlIoI000lI = I000lI(i);
/* 37 */                if (!I00100o1O0lo(obj, i2, i)) {
/* 43 */                    if (I00100l0(object)) {
/* 49 */                        Io00l0 io00l0I0000O = oiOIlIoI000lI.I0000O();
/* 53 */                        oiOIlIoI000lI.I00000oIO(io00l0I0000O, object);
/* 56 */                        unsafe.putObject(obj, jI00IlilI0i0i, io00l0I0000O);
                            } else {
/* 45 */                        unsafe.putObject(obj, jI00IlilI0i0i, object);
                            }
/* 59 */                    I00IOO(obj, i2, i);
/* 62 */                    return;
                        }
/* 63 */                Object object2 = unsafe.getObject(obj, jI00IlilI0i0i);
/* 71 */                if (!I00100l0(object2)) {
/* 73 */                    Io00l0 io00l0I0000O2 = oiOIlIoI000lI.I0000O();
/* 77 */                    oiOIlIoI000lI.I00000oIO(io00l0I0000O2, object2);
/* 80 */                    unsafe.putObject(obj, jI00IlilI0i0i, io00l0I0000O2);
/* 83 */                    object2 = io00l0I0000O2;
                        }
/* 84 */                oiOIlIoI000lI.I00000oIO(object2, object);
                    }
                }

                public final Object I001IIilI0O(int i, Object obj) {
/* 1 */             OiOIlIo oiOIlIoI000lI = I000lI(i);
/* 12 */            long jI00IlilI0i0i = I00IlilI0i0i(i) & 1048575;
/* 18 */            if (!I000o00OoI0I(i, obj)) {
/* 20 */                return oiOIlIoI000lI.I0000O();
                    }
/* 27 */            Object object = I000oI1ioi.getObject(obj, jI00IlilI0i0i);
/* 35 */            if (I00100l0(object)) {
/* 37 */                return object;
                    }
/* 38 */            Io00l0 io00l0I0000O = oiOIlIoI000lI.I0000O();
/* 42 */            if (object != null) {
/* 44 */                oiOIlIoI000lI.I00000oIO(io00l0I0000O, object);
                    }
/* 106 */           return io00l0I0000O;
                }

                public final Object I001IO000(Object obj, int i, int i2) {
/* 1 */             OiOIlIo oiOIlIoI000lI = I000lI(i2);
/* 9 */             if (!I00100o1O0lo(obj, i, i2)) {
/* 11 */                return oiOIlIoI000lI.I0000O();
                    }
/* 27 */            Object object = I000oI1ioi.getObject(obj, I00IlilI0i0i(i2) & 1048575);
/* 35 */            if (I00100l0(object)) {
/* 37 */                return object;
                    }
/* 38 */            Io00l0 io00l0I0000O = oiOIlIoI000lI.I0000O();
/* 42 */            if (object != null) {
/* 44 */                oiOIlIoI000lI.I00000oIO(io00l0I0000O, object);
                    }
/* 98 */            return io00l0I0000O;
                }

                public final int I001lIiIIo1O(int i) {
/* 3 */             if (i < this.I0000Il00O || i > this.I0000O) {
/* 40 */                return -1;
                    }
/* 9 */             int[] iArr = this.I00000oIO;
                    int length = (iArr.length / 3) - 1;
/* 16 */            int i2 = 0;
/* 17 */            while (i2 <= length) {
/* 21 */                int i3 = (length + i2) >>> 1;
/* 23 */                int i4 = i3 * 3;
/* 25 */                int i5 = iArr[i4];
/* 27 */                if (i == i5) {
/* 29 */                    return i4;
                        }
/* 30 */                if (i < i5) {
                            length = i3 - 1;
                        } else {
/* 36 */                    i2 = i3 + 1;
                        }
                    }
/* 40 */            return -1;
                }

                public final void I001lllioOl(Object obj, long j, IOOOi1 iOOOi1, OiOIlIo oiOIlIo, Il1llli0O1 il1llli0O1) throws O000o1i {
                    int iI00II0Ol1O0l;
/* 3 */             this.I000iOII.getClass();
/* 6 */             Iool1O1Ol1i iool1O1Ol1iI00000oIO = O10I0o.I00000oIO(j, obj);
/* 12 */            IOOOI0 ioooi0 = (IOOOI0) iOOOi1.I0000oI00;
/* 14 */            int i = iOOOi1.I00000oOI;
/* 19 */            if ((i & 7) != 3) {
/* 399 */               throw O0011oo.I00000oOI();
                    }
/* 49 */            do {
/* 21 */                Io00l0 io00l0I0000O = oiOIlIo.I0000O();
/* 25 */                iOOOi1.I000OOo1O(io00l0I0000O, oiOIlIo, il1llli0O1);
/* 28 */                oiOIlIo.I00000oOI(io00l0I0000O);
/* 31 */                iool1O1Ol1iI00000oIO.add(io00l0I0000O);
/* 38 */                if (ioooi0.I000O01llI0() || iOOOi1.I0000O != 0) {
/* 53 */                    return;
                        } else {
/* 45 */                    iI00II0Ol1O0l = ioooi0.I00II0Ol1O0l();
                        }
/* 49 */            } while (iI00II0Ol1O0l == i);
/* 51 */            iOOOi1.I0000O = iI00II0Ol1O0l;
                }

                public final void I001lloI(Object obj, int i, IOOOi1 iOOOi1, OiOIlIo oiOIlIo, Il1llli0O1 il1llli0O1) throws O0011oo {
                    int iI00II0Ol1O0l;
/* 8 */             this.I000iOII.getClass();
/* 11 */            Iool1O1Ol1i iool1O1Ol1iI00000oIO = O10I0o.I00000oIO(i & 1048575, obj);
/* 17 */            IOOOI0 ioooi0 = (IOOOI0) iOOOi1.I0000oI00;
/* 19 */            int i2 = iOOOi1.I00000oOI;
/* 24 */            if ((i2 & 7) != 2) {
/* 399 */               throw O0011oo.I00000oOI();
                    }
/* 54 */            do {
/* 26 */                Io00l0 io00l0I0000O = oiOIlIo.I0000O();
/* 30 */                iOOOi1.I000l1(io00l0I0000O, oiOIlIo, il1llli0O1);
/* 33 */                oiOIlIo.I00000oOI(io00l0I0000O);
/* 36 */                iool1O1Ol1iI00000oIO.add(io00l0I0000O);
/* 43 */                if (ioooi0.I000O01llI0() || iOOOi1.I0000O != 0) {
/* 58 */                    return;
                        } else {
/* 50 */                    iI00II0Ol1O0l = ioooi0.I00II0Ol1O0l();
                        }
/* 54 */            } while (iI00II0Ol1O0l == i2);
/* 56 */            iOOOi1.I0000O = iI00II0Ol1O0l;
                }

                public final void I00II0Ol1O0l(int i, IOOOi1 iOOOi1, Object obj) throws O000illO, O000lI0, O000o1i {
/* 8 */             if ((536870912 & i) != 0) {
/* 13 */                iOOOi1.I00ilI0I1(2);
/* 24 */                OoilIIl.I000oI1ioi(obj, i & 1048575, ((IOOOI0) iOOOi1.I0000oI00).I001lloI());
                    } else if (!this.I0001Ioi1lo) {
/* 57 */                OoilIIl.I000oI1ioi(obj, i & 1048575, iOOOi1.I00100o1O0lo());
                    } else {
/* 35 */                iOOOi1.I00ilI0I1(2);
/* 46 */                OoilIIl.I000oI1ioi(obj, i & 1048575, ((IOOOI0) iOOOi1.I0000oI00).I001lllioOl());
                    }
                }

                public final void I00II0oii1o(int i, IOOOi1 iOOOi1, Object obj) throws O000illO, O000lI0, O000o1i {
/* 10 */            boolean z = (536870912 & i) != 0;
/* 11 */            O10I0o o10I0o = this.I000iOII;
/* 16 */            if (z) {
/* 20 */                o10I0o.getClass();
/* 27 */                iOOOi1.I00i0O(O10I0o.I00000oIO(i & 1048575, obj), true);
                    } else {
/* 33 */                o10I0o.getClass();
/* 40 */                iOOOi1.I00i0O(O10I0o.I00000oIO(i & 1048575, obj), false);
                    }
                }

                public final void I00IO1oi11O(int i, Object obj) {
/* 5 */             int i2 = this.I00000oIO[i + 2];
/* 10 */            long j = 1048575 & i2;
/* 17 */            if (j == 1048575) {
/* 19 */                return;
                    }
/* 30 */            OoilIIl.I000lI(obj, (1 << (i2 >>> 20)) | OoilIIl.I0001Ioi1lo(j, obj), j);
                }

                public final void I00IOO(Object obj, int i, int i2) {
/* 12 */            OoilIIl.I000lI(obj, i, this.I00000oIO[i2 + 2] & 1048575);
                }

                public final int I00IlilI0i0i(int i) {
/* 5 */             return this.I00000oIO[i + 1];
                }
            }

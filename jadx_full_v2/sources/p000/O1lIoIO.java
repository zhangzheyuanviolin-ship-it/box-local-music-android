            package p000;

            import com.google.ai.edge.gallery.BuildConfig;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import com.google.mlkit.vision.common.InputImage;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Field;
            import java.util.Arrays;
            import java.util.List;
            import java.util.Map;
            import sun.misc.Unsafe;
            
            public final class O1lIoIO implements OiOIl0 {
                public static final int[] I000o00OoI0I = new int[0];
                public static final Unsafe I000oI1ioi = Ooil1O.I000OiO();
                public int[] I00000oIO;
                public Object[] I00000oOI;
                public int I0000Il00O;
                public int I0000O;
                public I01IlIoOI I0000oI00;
                public boolean I0001Ioi1lo;
                public int[] I000II;
                public int I000O01llI0;
                public int I000OOo1O;
                public OIIOooO I000OiO;
                public O10I0l0OO I000iOII;
                public OoiO0oOll0oO I000l1;
                public O1Oi111oiiI I000lI;

                public static boolean I00100l0(Object obj) {
/* 1 */             if (obj == null) {
/* 3 */                 return false;
                    }
/* 7 */             if (obj instanceof Io00Ol1o10O) {
/* 11 */                return ((Io00Ol1o10O) obj).I000OOo1O();
                    }
/* 16 */            return true;
                }

                /* JADX WARN: Removed duplicated region for block: B:122:0x0255  */
                /* JADX WARN: Removed duplicated region for block: B:124:0x025c  */
                /* JADX WARN: Removed duplicated region for block: B:127:0x0278  */
                /* JADX WARN: Removed duplicated region for block: B:128:0x027b  */
                /* JADX WARN: Removed duplicated region for block: B:183:0x0387  */
                /* JADX WARN: Removed duplicated region for block: B:184:0x038a  */
                /* JADX WARN: Removed duplicated region for block: B:187:0x0391  */
                /* JADX WARN: Removed duplicated region for block: B:188:0x0394  */
                /* JADX WARN: Removed duplicated region for block: B:191:0x039a  */
                /* JADX WARN: Removed duplicated region for block: B:192:0x039d  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static O1lIoIO I001i1O0Ol(OOlI00I oOlI00I, OIIOooO oIIOooO, O10I0l0OO o10I0l0OO, OoiO0oOll0oO ooiO0oOll0oO, Il1o0Io il1o0Io, O1Oi111oiiI o1Oi111oiiI) {
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
                    int i5;
                    char cCharAt2;
                    int i6;
                    char cCharAt3;
                    int i7;
                    char cCharAt4;
                    int i8;
                    char cCharAt5;
                    int i9;
                    char cCharAt6;
                    int i10;
                    char cCharAt7;
                    int i11;
                    int i12;
                    Object[] objArr;
                    int i13;
                    String str;
                    int iObjectFieldOffset;
                    int i14;
                    int iObjectFieldOffset2;
                    Field fieldI00IO1;
                    int i15;
                    int i16;
                    char cCharAt8;
                    int i17;
                    int i18;
                    int i19;
                    Object obj;
                    Field fieldI00IO12;
                    Object obj2;
                    Field fieldI00IO13;
                    int i20;
                    char cCharAt9;
                    int i21;
                    char cCharAt10;
                    int i22;
                    char cCharAt11;
                    int i23;
                    char cCharAt12;
/* 5 */             if (!(oOlI00I instanceof OOlI00I)) {
/* 1011 */              OIiilo1Ool0o.I00000oIO();
/* 1014 */              return null;
                    }
/* 7 */             I01IlIoOI i01IlIoOI = oOlI00I.I00000oIO;
/* 9 */             String str2 = oOlI00I.I00000oOI;
/* 11 */            int length = str2.length();
/* 15 */            int i24 = 0;
/* 20 */            int i25 = 55296;
/* 23 */            if (str2.charAt(0) >= 55296) {
/* 25 */                int i26 = 1;
                        while (true) {
/* 26 */                    i = i26 + 1;
/* 32 */                    if (str2.charAt(i26) < 55296) {
                                break;
                            }
/* 34 */                    i26 = i;
                        }
                    } else {
/* 36 */                i = 1;
                    }
/* 37 */            int i27 = i + 1;
/* 39 */            int iCharAt6 = str2.charAt(i);
/* 43 */            if (iCharAt6 >= 55296) {
/* 45 */                int i28 = iCharAt6 & 8191;
/* 47 */                int i29 = 13;
                        while (true) {
/* 49 */                    i23 = i27 + 1;
/* 51 */                    cCharAt12 = str2.charAt(i27);
/* 55 */                    if (cCharAt12 < 55296) {
                                break;
                            }
/* 60 */                    i28 |= (cCharAt12 & 8191) << i29;
/* 61 */                    i29 += 13;
/* 63 */                    i27 = i23;
                        }
/* 66 */                iCharAt6 = i28 | (cCharAt12 << i29);
/* 67 */                i27 = i23;
                    }
/* 68 */            if (iCharAt6 == 0) {
/* 70 */                iArr = I000o00OoI0I;
/* 72 */                iCharAt = 0;
/* 73 */                iCharAt2 = 0;
/* 74 */                iCharAt3 = 0;
/* 75 */                iCharAt4 = 0;
/* 76 */                iCharAt5 = 0;
/* 77 */                i2 = 0;
                    } else {
/* 81 */                int i30 = i27 + 1;
/* 83 */                int iCharAt7 = str2.charAt(i27);
/* 87 */                if (iCharAt7 >= 55296) {
/* 89 */                    int i31 = iCharAt7 & 8191;
/* 91 */                    int i32 = 13;
                            while (true) {
/* 93 */                        i10 = i30 + 1;
/* 95 */                        cCharAt7 = str2.charAt(i30);
/* 99 */                        if (cCharAt7 < 55296) {
                                    break;
                                }
/* 104 */                       i31 |= (cCharAt7 & 8191) << i32;
/* 105 */                       i32 += 13;
/* 107 */                       i30 = i10;
                            }
/* 110 */                   iCharAt7 = i31 | (cCharAt7 << i32);
/* 111 */                   i30 = i10;
                        }
/* 112 */               int i33 = i30 + 1;
/* 114 */               int iCharAt8 = str2.charAt(i30);
/* 118 */               if (iCharAt8 >= 55296) {
/* 120 */                   int i34 = iCharAt8 & 8191;
/* 122 */                   int i35 = 13;
                            while (true) {
/* 124 */                       i9 = i33 + 1;
/* 126 */                       cCharAt6 = str2.charAt(i33);
/* 130 */                       if (cCharAt6 < 55296) {
                                    break;
                                }
/* 135 */                       i34 |= (cCharAt6 & 8191) << i35;
/* 136 */                       i35 += 13;
/* 138 */                       i33 = i9;
                            }
/* 141 */                   iCharAt8 = i34 | (cCharAt6 << i35);
/* 142 */                   i33 = i9;
                        }
/* 143 */               int i36 = i33 + 1;
/* 145 */               iCharAt = str2.charAt(i33);
/* 149 */               if (iCharAt >= 55296) {
/* 151 */                   int i37 = iCharAt & 8191;
/* 153 */                   int i38 = 13;
                            while (true) {
/* 155 */                       i8 = i36 + 1;
/* 157 */                       cCharAt5 = str2.charAt(i36);
/* 161 */                       if (cCharAt5 < 55296) {
                                    break;
                                }
/* 166 */                       i37 |= (cCharAt5 & 8191) << i38;
/* 167 */                       i38 += 13;
/* 169 */                       i36 = i8;
                            }
/* 172 */                   iCharAt = i37 | (cCharAt5 << i38);
/* 173 */                   i36 = i8;
                        }
/* 174 */               int i39 = i36 + 1;
/* 176 */               iCharAt2 = str2.charAt(i36);
/* 180 */               if (iCharAt2 >= 55296) {
/* 182 */                   int i40 = iCharAt2 & 8191;
/* 184 */                   int i41 = 13;
                            while (true) {
/* 186 */                       i7 = i39 + 1;
/* 188 */                       cCharAt4 = str2.charAt(i39);
/* 192 */                       if (cCharAt4 < 55296) {
                                    break;
                                }
/* 197 */                       i40 |= (cCharAt4 & 8191) << i41;
/* 198 */                       i41 += 13;
/* 200 */                       i39 = i7;
                            }
/* 203 */                   iCharAt2 = i40 | (cCharAt4 << i41);
/* 204 */                   i39 = i7;
                        }
/* 205 */               int i42 = i39 + 1;
/* 207 */               iCharAt3 = str2.charAt(i39);
/* 211 */               if (iCharAt3 >= 55296) {
/* 213 */                   int i43 = iCharAt3 & 8191;
/* 215 */                   int i44 = 13;
                            while (true) {
/* 217 */                       i6 = i42 + 1;
/* 219 */                       cCharAt3 = str2.charAt(i42);
/* 223 */                       if (cCharAt3 < 55296) {
                                    break;
                                }
/* 228 */                       i43 |= (cCharAt3 & 8191) << i44;
/* 229 */                       i44 += 13;
/* 231 */                       i42 = i6;
                            }
/* 234 */                   iCharAt3 = i43 | (cCharAt3 << i44);
/* 235 */                   i42 = i6;
                        }
/* 236 */               int i45 = i42 + 1;
/* 238 */               iCharAt4 = str2.charAt(i42);
/* 242 */               if (iCharAt4 >= 55296) {
/* 244 */                   int i46 = iCharAt4 & 8191;
/* 246 */                   int i47 = 13;
                            while (true) {
/* 248 */                       i5 = i45 + 1;
/* 250 */                       cCharAt2 = str2.charAt(i45);
/* 254 */                       if (cCharAt2 < 55296) {
                                    break;
                                }
/* 259 */                       i46 |= (cCharAt2 & 8191) << i47;
/* 260 */                       i47 += 13;
/* 262 */                       i45 = i5;
                            }
/* 266 */                   iCharAt4 = i46 | (cCharAt2 << i47);
/* 267 */                   i45 = i5;
                        }
/* 269 */               int i48 = i45 + 1;
/* 275 */               if (str2.charAt(i45) >= 55296) {
                            while (true) {
/* 277 */                       i4 = i48 + 1;
/* 283 */                       if (str2.charAt(i48) < 55296) {
                                    break;
                                }
/* 285 */                       i48 = i4;
                            }
/* 287 */                   i48 = i4;
                        }
/* 288 */               int i49 = i48 + 1;
/* 290 */               iCharAt5 = str2.charAt(i48);
/* 294 */               if (iCharAt5 >= 55296) {
/* 296 */                   int i50 = iCharAt5 & 8191;
/* 298 */                   int i51 = 13;
                            while (true) {
/* 300 */                       i3 = i49 + 1;
/* 302 */                       cCharAt = str2.charAt(i49);
/* 306 */                       if (cCharAt < 55296) {
                                    break;
                                }
/* 312 */                       i50 |= (cCharAt & 8191) << i51;
/* 313 */                       i51 += 13;
/* 315 */                       i49 = i3;
                            }
/* 320 */                   iCharAt5 = i50 | (cCharAt << i51);
/* 321 */                   i49 = i3;
                        }
/* 331 */               i2 = (iCharAt7 * 2) + iCharAt8;
/* 327 */               iArr = new int[iCharAt5 + iCharAt4 + iCharAt7];
/* 334 */               i24 = iCharAt7;
/* 335 */               i27 = i49;
                    }
/* 336 */           Object[] objArr2 = oOlI00I.I0000Il00O;
/* 338 */           Class<?> cls = i01IlIoOI.getClass();
/* 344 */           int[] iArr2 = new int[iCharAt3 * 3];
/* 348 */           Object[] objArr3 = new Object[iCharAt3 * 2];
/* 350 */           int i52 = iCharAt4 + iCharAt5;
/* 351 */           int i53 = i52;
/* 353 */           int i54 = iCharAt5;
/* 355 */           int i55 = 0;
/* 357 */           int i56 = 0;
/* 359 */           while (i27 < length) {
/* 361 */               int i57 = i27 + 1;
/* 363 */               int iCharAt9 = str2.charAt(i27);
/* 367 */               if (iCharAt9 >= i25) {
/* 369 */                   int i58 = iCharAt9 & 8191;
/* 371 */                   int i59 = i57;
/* 373 */                   int i60 = 13;
                            while (true) {
/* 375 */                       i22 = i59 + 1;
/* 377 */                       cCharAt11 = str2.charAt(i59);
/* 384 */                       if (cCharAt11 < 55296) {
                                    break;
                                }
/* 390 */                       i58 |= (cCharAt11 & 8191) << i60;
/* 391 */                       i60 += 13;
/* 395 */                       i59 = i22;
                            }
/* 400 */                   iCharAt9 = i58 | (cCharAt11 << i60);
/* 401 */                   i11 = i22;
                        } else {
/* 404 */                   i11 = i57;
                        }
/* 406 */               int i61 = i11 + 1;
/* 408 */               int iCharAt10 = str2.charAt(i11);
/* 412 */               int i62 = length;
/* 414 */               char c = 55296;
/* 417 */               if (iCharAt10 >= 55296) {
/* 419 */                   int i63 = iCharAt10 & 8191;
/* 421 */                   int i64 = 13;
                            while (true) {
/* 423 */                       i21 = i61 + 1;
/* 425 */                       cCharAt10 = str2.charAt(i61);
/* 429 */                       if (cCharAt10 < c) {
                                    break;
                                }
/* 435 */                       i63 |= (cCharAt10 & 8191) << i64;
/* 436 */                       i64 += 13;
/* 438 */                       i61 = i21;
/* 440 */                       c = 55296;
                            }
/* 446 */                   iCharAt10 = i63 | (cCharAt10 << i64);
/* 447 */                   i61 = i21;
                        }
/* 449 */               int i65 = iCharAt10 & 255;
/* 451 */               int i66 = i24;
/* 455 */               if ((iCharAt10 & Barcode.FORMAT_UPC_E) != 0) {
/* 459 */                   iArr[i55] = i56;
/* 457 */                   i55++;
                        }
/* 465 */               int i67 = iCharAt9;
/* 467 */               Unsafe unsafe = I000oI1ioi;
/* 469 */               if (i65 >= 51) {
/* 471 */                   int i68 = i61 + 1;
/* 473 */                   int iCharAt11 = str2.charAt(i61);
/* 479 */                   char c2 = 55296;
/* 482 */                   if (iCharAt11 >= 55296) {
/* 484 */                       int i69 = iCharAt11 & 8191;
/* 490 */                       int i70 = i68;
/* 492 */                       int i71 = 13;
                                while (true) {
/* 494 */                           i20 = i70 + 1;
/* 496 */                           cCharAt9 = str2.charAt(i70);
/* 500 */                           if (cCharAt9 < c2) {
                                        break;
                                    }
/* 506 */                           i69 |= (cCharAt9 & 8191) << i71;
/* 508 */                           i71 += 13;
/* 510 */                           i70 = i20;
/* 512 */                           c2 = 55296;
                                }
/* 518 */                       iCharAt11 = i69 | (cCharAt9 << i71);
/* 520 */                       i18 = i20;
                            } else {
/* 523 */                       i18 = i68;
                            }
/* 525 */                   i14 = i18;
                            int i72 = i65 - 51;
/* 529 */                   int i73 = iCharAt11;
/* 533 */                   if (i72 == 9 || i72 == 17) {
/* 581 */                       i19 = i2 + 1;
/* 585 */                       objArr3[((i56 / 3) * 2) + 1] = objArr2[i2];
                            } else {
/* 542 */                       if (i72 == 12 && (IIlIOloOOO.I00000oOI(oOlI00I.I00000oIO(), 1) || (iCharAt10 & Barcode.FORMAT_PDF417) != 0)) {
/* 564 */                           i19 = i2 + 1;
/* 568 */                           objArr3[((i56 / 3) * 2) + 1] = objArr2[i2];
                                }
/* 588 */                       int i74 = i73 * 2;
/* 590 */                       obj = objArr2[i74];
/* 596 */                       if (obj instanceof Field) {
/* 607 */                           fieldI00IO12 = I00IO1(cls, (String) obj);
/* 611 */                           objArr2[i74] = fieldI00IO12;
/* 615 */                           iArr[i53] = i56;
/* 613 */                           i53++;
                                } else {
/* 598 */                           fieldI00IO12 = (Field) obj;
                                }
/* 600 */                       i12 = i52;
/* 602 */                       objArr = objArr2;
/* 624 */                       iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldI00IO12);
/* 625 */                       int i75 = i74 + 1;
/* 627 */                       obj2 = objArr[i75];
/* 631 */                       if (obj2 instanceof Field) {
/* 638 */                           fieldI00IO13 = I00IO1(cls, (String) obj2);
/* 642 */                           objArr[i75] = fieldI00IO13;
                                } else {
/* 633 */                           fieldI00IO13 = (Field) obj2;
                                }
/* 648 */                       iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldI00IO13);
/* 649 */                       str = str2;
/* 651 */                       i13 = i2;
                            }
/* 570 */                   i2 = i19;
/* 588 */                   int i742 = i73 * 2;
/* 590 */                   obj = objArr2[i742];
/* 596 */                   if (obj instanceof Field) {
                            }
/* 600 */                   i12 = i52;
/* 602 */                   objArr = objArr2;
/* 624 */                   iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldI00IO12);
/* 625 */                   int i752 = i742 + 1;
/* 627 */                   obj2 = objArr[i752];
/* 631 */                   if (obj2 instanceof Field) {
                            }
/* 648 */                   iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldI00IO13);
/* 649 */                   str = str2;
/* 651 */                   i13 = i2;
                        } else {
/* 656 */                   i12 = i52;
/* 658 */                   objArr = objArr2;
/* 660 */                   int i76 = i2 + 1;
/* 666 */                   Field fieldI00IO14 = I00IO1(cls, (String) objArr[i2]);
/* 672 */                   if (i65 == 9 || i65 == 17) {
/* 678 */                       i13 = i76;
/* 795 */                       objArr3[((i56 / 3) * 2) + 1] = fieldI00IO14.getType();
                            } else {
/* 685 */                       if (i65 == 27 || i65 == 49) {
/* 779 */                           i17 = i2 + 2;
/* 783 */                           objArr3[((i56 / 3) * 2) + 1] = objArr[i76];
                                } else if (i65 == 12 || i65 == 30 || i65 == 44) {
/* 751 */                           i13 = i76;
/* 754 */                           if (oOlI00I.I00000oIO() == 1 || (iCharAt10 & Barcode.FORMAT_PDF417) != 0) {
/* 765 */                               i17 = i2 + 2;
/* 769 */                               objArr3[((i56 / 3) * 2) + 1] = objArr[i13];
                                    }
                                } else if (i65 == 50) {
/* 712 */                           int i77 = i54 + 1;
/* 714 */                           iArr[i54] = i56;
/* 718 */                           int i78 = (i56 / 3) * 2;
/* 720 */                           i13 = i2 + 2;
/* 724 */                           objArr3[i78] = objArr[i76];
/* 728 */                           if ((iCharAt10 & Barcode.FORMAT_PDF417) != 0) {
/* 736 */                               objArr3[i78 + 1] = objArr[i13];
/* 732 */                               i13 = i2 + 3;
                                    }
/* 740 */                           i54 = i77;
                                } else {
/* 744 */                           i13 = i76;
                                }
/* 771 */                       i13 = i17;
                            }
/* 801 */                   int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldI00IO14);
/* 804 */                   if ((iCharAt10 & Barcode.FORMAT_AZTEC) == 0 || i65 > 17) {
/* 884 */                       str = str2;
/* 886 */                       iObjectFieldOffset = 1048575;
/* 889 */                       i14 = i61;
/* 891 */                       iObjectFieldOffset2 = iObjectFieldOffset3;
                            } else {
/* 810 */                       int i79 = i61 + 1;
/* 812 */                       int iCharAt12 = str2.charAt(i61);
/* 819 */                       if (iCharAt12 >= 55296) {
/* 821 */                           int i80 = iCharAt12 & 8191;
/* 823 */                           int i81 = 13;
                                    while (true) {
/* 825 */                               i16 = i79 + 1;
/* 827 */                               cCharAt8 = str2.charAt(i79);
/* 831 */                               if (cCharAt8 < 55296) {
                                            break;
                                        }
/* 837 */                               i80 |= (cCharAt8 & 8191) << i81;
/* 838 */                               i81 += 13;
/* 840 */                               i79 = i16;
                                    }
/* 845 */                           iCharAt12 = i80 | (cCharAt8 << i81);
/* 846 */                           i79 = i16;
                                }
/* 852 */                       int i82 = (iCharAt12 / 32) + (i66 * 2);
/* 854 */                       Object obj3 = objArr[i82];
/* 856 */                       str = str2;
/* 860 */                       if (obj3 instanceof Field) {
/* 862 */                           fieldI00IO1 = (Field) obj3;
                                } else {
/* 867 */                           fieldI00IO1 = I00IO1(cls, (String) obj3);
/* 871 */                           objArr[i82] = fieldI00IO1;
                                }
/* 877 */                       iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldI00IO1);
/* 878 */                       i15 = iCharAt12 % 32;
/* 880 */                       iObjectFieldOffset2 = iObjectFieldOffset3;
/* 881 */                       i14 = i79;
/* 894 */                       int i83 = i56 + 1;
/* 896 */                       iArr2[i56] = i67;
/* 898 */                       int i84 = i56 + 2;
/* 932 */                       iArr2[i83] = ((iCharAt10 & Barcode.FORMAT_PDF417) == 0 ? Integer.MIN_VALUE : 0) | ((iCharAt10 & Barcode.FORMAT_QR_CODE) == 0 ? 268435456 : 0) | ((iCharAt10 & Barcode.FORMAT_UPC_A) == 0 ? 536870912 : 0) | (i65 << 20) | iObjectFieldOffset2;
/* 934 */                       i56 += 3;
/* 939 */                       iArr2[i84] = (i15 << 20) | iObjectFieldOffset;
/* 943 */                       length = i62;
/* 945 */                       i24 = i66;
/* 947 */                       i2 = i13;
/* 949 */                       str2 = str;
/* 951 */                       i27 = i14;
/* 953 */                       objArr2 = objArr;
/* 955 */                       i52 = i12;
/* 957 */                       i25 = 55296;
                            }
                        }
/* 653 */               i15 = 0;
/* 894 */               int i832 = i56 + 1;
/* 896 */               iArr2[i56] = i67;
/* 898 */               int i842 = i56 + 2;
                        if ((iCharAt10 & Barcode.FORMAT_UPC_A) == 0) {
                        }
/* 932 */               iArr2[i832] = ((iCharAt10 & Barcode.FORMAT_PDF417) == 0 ? Integer.MIN_VALUE : 0) | ((iCharAt10 & Barcode.FORMAT_QR_CODE) == 0 ? 268435456 : 0) | ((iCharAt10 & Barcode.FORMAT_UPC_A) == 0 ? 536870912 : 0) | (i65 << 20) | iObjectFieldOffset2;
/* 934 */               i56 += 3;
/* 939 */               iArr2[i842] = (i15 << 20) | iObjectFieldOffset;
/* 943 */               length = i62;
/* 945 */               i24 = i66;
/* 947 */               i2 = i13;
/* 949 */               str2 = str;
/* 951 */               i27 = i14;
/* 953 */               objArr2 = objArr;
/* 955 */               i52 = i12;
/* 957 */               i25 = 55296;
                    }
/* 966 */           O1lIoIO o1lIoIO = new O1lIoIO();
/* 969 */           o1lIoIO.I00000oIO = iArr2;
/* 971 */           o1lIoIO.I00000oOI = objArr3;
/* 973 */           o1lIoIO.I0000Il00O = iCharAt;
/* 975 */           o1lIoIO.I0000O = iCharAt2;
/* 979 */           o1lIoIO.I0001Ioi1lo = i01IlIoOI instanceof Io00Ol1o10O;
/* 981 */           o1lIoIO.I000II = iArr;
/* 983 */           o1lIoIO.I000O01llI0 = iCharAt5;
/* 987 */           o1lIoIO.I000OOo1O = i52;
/* 991 */           o1lIoIO.I000OiO = oIIOooO;
/* 995 */           o1lIoIO.I000iOII = o10I0l0OO;
/* 999 */           o1lIoIO.I000l1 = ooiO0oOll0oO;
/* 1001 */          o1lIoIO.I0000oI00 = i01IlIoOI;
/* 1005 */          o1lIoIO.I000lI = o1Oi111oiiI;
/* 1007 */          VarHandle.storeStoreFence();
/* 1010 */          return o1lIoIO;
                }

                public static long I001i1lo1io(int i) {
/* 5 */             return i & 1048575;
                }

                public static int I001iOo1i0O(long j, Object obj) {
/* 7 */             return ((Integer) Ooil1O.I000OOo1O(j, obj)).intValue();
                }

                public static long I001l0I00(long j, Object obj) {
/* 7 */             return ((Long) Ooil1O.I000OOo1O(j, obj)).longValue();
                }

                public static Field I00IO1(Class cls, String str) {
                    try {
/* 1 */                 return cls.getDeclaredField(str);
                    } catch (NoSuchFieldException e) {
/* 7 */                 Field[] declaredFields = cls.getDeclaredFields();
/* 13 */                for (Field field : declaredFields) {
/* 25 */                    if (str.equals(field.getName())) {
/* 27 */                        return field;
                            }
                        }
/* 37 */                StringBuilder sbI001IIilI0O = IIlIOloOOO.I001IIilI0O("Field ", str, " for ");
/* 45 */                sbI001IIilI0O.append(cls.getName());
/* 50 */                sbI001IIilI0O.append(" not found. Known fields are ");
/* 57 */                sbI001IIilI0O.append(Arrays.toString(declaredFields));
/* 89 */                throw new RuntimeException(sbI001IIilI0O.toString(), e);
                    }
                }

                public static int I00IioO0OiOi(int i) {
/* 4 */             return (i & 267386880) >>> 20;
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
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
/* 9 */             byte[] bArr = Iool1iioooil.I00000oIO;
/* 11 */            obj2.getClass();
/* 14 */            int i = 0;
/* 16 */            while (i < iArr.length) {
/* 18 */                int iI00IlilI0i0i = I00IlilI0i0i(i);
/* 25 */                long j = 1048575 & iI00IlilI0i0i;
/* 27 */                int i2 = iArr[i];
                        switch (I00IioO0OiOi(iI00IlilI0i0i)) {
                            case 0:
/* 442 */                       if (!I000o00OoI0I(i, obj2)) {
/* 40 */                            obj3 = obj;
                                    break;
                                } else {
/* 444 */                           Ooil0oIOI0l0 ooil0oIOI0l0 = Ooil1O.I0000Il00O;
/* 450 */                           obj3 = obj;
/* 451 */                           ooil0oIOI0l0.I000II(obj3, j, ooil0oIOI0l0.I0000Il00O(j, obj2));
/* 454 */                           I00IO1oi11O(i, obj3);
                                    break;
                                }
                            case 1:
/* 422 */                       if (I000o00OoI0I(i, obj2)) {
/* 424 */                           Ooil0oIOI0l0 ooil0oIOI0l02 = Ooil1O.I0000Il00O;
/* 430 */                           ooil0oIOI0l02.I000O01llI0(obj, j, ooil0oIOI0l02.I0000O(j, obj2));
/* 433 */                           I00IO1oi11O(i, obj);
                                }
/* 40 */                        obj3 = obj;
                                break;
                            case 2:
/* 404 */                       if (I000o00OoI0I(i, obj2)) {
/* 410 */                           Ooil1O.I00100l0(obj, j, Ooil1O.I000O01llI0(j, obj2));
/* 413 */                           I00IO1oi11O(i, obj);
                                }
/* 40 */                        obj3 = obj;
                                break;
                            case 3:
/* 386 */                       if (I000o00OoI0I(i, obj2)) {
/* 392 */                           Ooil1O.I00100l0(obj, j, Ooil1O.I000O01llI0(j, obj2));
/* 395 */                           I00IO1oi11O(i, obj);
                                }
/* 40 */                        obj3 = obj;
                                break;
                            case 4:
/* 368 */                       if (I000o00OoI0I(i, obj2)) {
/* 374 */                           Ooil1O.I000oI1ioi(obj, Ooil1O.I000II(j, obj2), j);
/* 377 */                           I00IO1oi11O(i, obj);
                                }
/* 40 */                        obj3 = obj;
                                break;
                            case 5:
/* 350 */                       if (I000o00OoI0I(i, obj2)) {
/* 356 */                           Ooil1O.I00100l0(obj, j, Ooil1O.I000O01llI0(j, obj2));
/* 359 */                           I00IO1oi11O(i, obj);
                                }
/* 40 */                        obj3 = obj;
                                break;
                            case 6:
/* 332 */                       if (I000o00OoI0I(i, obj2)) {
/* 338 */                           Ooil1O.I000oI1ioi(obj, Ooil1O.I000II(j, obj2), j);
/* 341 */                           I00IO1oi11O(i, obj);
                                }
/* 40 */                        obj3 = obj;
                                break;
                            case 7:
/* 312 */                       if (I000o00OoI0I(i, obj2)) {
/* 314 */                           Ooil0oIOI0l0 ooil0oIOI0l03 = Ooil1O.I0000Il00O;
/* 320 */                           ooil0oIOI0l03.I0000oI00(obj, j, ooil0oIOI0l03.I00000oIO(j, obj2));
/* 323 */                           I00IO1oi11O(i, obj);
                                }
/* 40 */                        obj3 = obj;
                                break;
                            case 8:
/* 294 */                       if (I000o00OoI0I(i, obj2)) {
/* 300 */                           Ooil1O.I00100o1O0lo(obj, j, Ooil1O.I000OOo1O(j, obj2));
/* 303 */                           I00IO1oi11O(i, obj);
                                }
/* 40 */                        obj3 = obj;
                                break;
                            case 9:
/* 285 */                       I0010o(i, obj, obj2);
/* 40 */                        obj3 = obj;
                                break;
                            case 10:
/* 271 */                       if (I000o00OoI0I(i, obj2)) {
/* 277 */                           Ooil1O.I00100o1O0lo(obj, j, Ooil1O.I000OOo1O(j, obj2));
/* 280 */                           I00IO1oi11O(i, obj);
                                }
/* 40 */                        obj3 = obj;
                                break;
                            case 11:
/* 253 */                       if (I000o00OoI0I(i, obj2)) {
/* 259 */                           Ooil1O.I000oI1ioi(obj, Ooil1O.I000II(j, obj2), j);
/* 262 */                           I00IO1oi11O(i, obj);
                                }
/* 40 */                        obj3 = obj;
                                break;
                            case 12:
/* 235 */                       if (I000o00OoI0I(i, obj2)) {
/* 241 */                           Ooil1O.I000oI1ioi(obj, Ooil1O.I000II(j, obj2), j);
/* 244 */                           I00IO1oi11O(i, obj);
                                }
/* 40 */                        obj3 = obj;
                                break;
                            case 13:
/* 217 */                       if (I000o00OoI0I(i, obj2)) {
/* 223 */                           Ooil1O.I000oI1ioi(obj, Ooil1O.I000II(j, obj2), j);
/* 226 */                           I00IO1oi11O(i, obj);
                                }
/* 40 */                        obj3 = obj;
                                break;
                            case 14:
/* 199 */                       if (I000o00OoI0I(i, obj2)) {
/* 205 */                           Ooil1O.I00100l0(obj, j, Ooil1O.I000O01llI0(j, obj2));
/* 208 */                           I00IO1oi11O(i, obj);
                                }
/* 40 */                        obj3 = obj;
                                break;
                            case 15:
/* 181 */                       if (I000o00OoI0I(i, obj2)) {
/* 187 */                           Ooil1O.I000oI1ioi(obj, Ooil1O.I000II(j, obj2), j);
/* 190 */                           I00IO1oi11O(i, obj);
                                }
/* 40 */                        obj3 = obj;
                                break;
                            case 16:
/* 163 */                       if (I000o00OoI0I(i, obj2)) {
/* 169 */                           Ooil1O.I00100l0(obj, j, Ooil1O.I000O01llI0(j, obj2));
/* 172 */                           I00IO1oi11O(i, obj);
                                }
/* 40 */                        obj3 = obj;
                                break;
                            case 17:
/* 155 */                       I0010o(i, obj, obj2);
/* 40 */                        obj3 = obj;
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
/* 106 */                       this.I000iOII.getClass();
/* 113 */                       Iool1IOO1o0i iool1IOO1o0iI000O01llI0 = (Iool1IOO1o0i) Ooil1O.I000OOo1O(j, obj);
/* 119 */                       Iool1IOO1o0i iool1IOO1o0i = (Iool1IOO1o0i) Ooil1O.I000OOo1O(j, obj2);
/* 121 */                       int size = iool1IOO1o0iI000O01llI0.size();
/* 125 */                       int size2 = iool1IOO1o0i.size();
/* 129 */                       if (size > 0 && size2 > 0) {
/* 138 */                           if (!((I01O10iIoo1O) iool1IOO1o0iI000O01llI0).I00iOIl) {
/* 141 */                               iool1IOO1o0iI000O01llI0 = iool1IOO1o0iI000O01llI0.I000O01llI0(size2 + size);
                                    }
/* 145 */                           iool1IOO1o0iI000O01llI0.addAll(iool1IOO1o0i);
                                }
/* 148 */                       if (size > 0) {
/* 150 */                           iool1IOO1o0i = iool1IOO1o0iI000O01llI0;
                                }
/* 151 */                       Ooil1O.I00100o1O0lo(obj, j, iool1IOO1o0i);
/* 40 */                        obj3 = obj;
                                break;
                            case 50:
/* 81 */                        O1Oi111oiiI o1Oi111oiiI = this.I000lI;
/* 83 */                        Class cls = OiOO0oO1Io.I00000oIO;
/* 85 */                        Object objI000OOo1O = Ooil1O.I000OOo1O(j, obj);
/* 89 */                        Object objI000OOo1O2 = Ooil1O.I000OOo1O(j, obj2);
/* 93 */                        o1Oi111oiiI.getClass();
/* 100 */                       Ooil1O.I00100o1O0lo(obj, j, O1Oi111oiiI.I00000oIO(objI000OOo1O, objI000OOo1O2));
/* 40 */                        obj3 = obj;
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
/* 68 */                        if (I00100o1O0lo(obj2, i2, i)) {
/* 74 */                            Ooil1O.I00100o1O0lo(obj, j, Ooil1O.I000OOo1O(j, obj2));
/* 77 */                            I00IOO(obj, i2, i);
                                }
/* 40 */                        obj3 = obj;
                                break;
                            case 60:
/* 60 */                        I00111O(i, obj, obj2);
/* 40 */                        obj3 = obj;
                                break;
                            case 61:
                            case 62:
                            case 63:
                            case Barcode.FORMAT_EAN_8:
                            case 65:
                            case 66:
                            case 67:
/* 47 */                        if (I00100o1O0lo(obj2, i2, i)) {
/* 53 */                            Ooil1O.I00100o1O0lo(obj, j, Ooil1O.I000OOo1O(j, obj2));
/* 56 */                            I00IOO(obj, i2, i);
                                }
/* 40 */                        obj3 = obj;
                                break;
                            case 68:
/* 37 */                        I00111O(i, obj, obj2);
/* 40 */                        obj3 = obj;
                                break;
                        }
/* 457 */               i += 3;
/* 459 */               obj = obj3;
                    }
/* 465 */           OiOO0oO1Io.I000iOII(this.I000l1, obj, obj2);
                }

                /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00000oOI(Object obj) {
/* 1 */             int[] iArr = this.I00000oIO;
/* 7 */             if (I00100l0(obj)) {
/* 14 */                if (obj instanceof Io00Ol1o10O) {
/* 17 */                    Io00Ol1o10O io00Ol1o10O = (Io00Ol1o10O) obj;
/* 22 */                    io00Ol1o10O.I00100l0(Integer.MAX_VALUE);
/* 25 */                    io00Ol1o10O.memoizedHashCode = 0;
/* 27 */                    io00Ol1o10O.I000iOII();
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
/* 96 */                                    I01O10iIoo1O i01O10iIoo1O = (I01O10iIoo1O) ((Iool1IOO1o0i) Ooil1O.I000OOo1O(j, obj));
/* 100 */                                   if (i01O10iIoo1O.I00iOIl) {
/* 102 */                                       i01O10iIoo1O.I00iOIl = false;
                                                break;
                                            } else {
                                                break;
                                            }
                                        case 50:
/* 65 */                                    Object object = unsafe.getObject(obj, j);
/* 69 */                                    if (object != null) {
/* 73 */                                        this.I000lI.getClass();
/* 79 */                                        ((O1OOo11I1O1) object).I00iOIl = false;
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
/* 152 */               OoiO0IO0il ooiO0IO0il = ((Io00Ol1o10O) obj).unknownFields;
/* 156 */               if (ooiO0IO0il.I0000oI00) {
/* 158 */                   ooiO0IO0il.I0000oI00 = false;
                        }
                    }
                }

                @Override
                public final boolean I0000Il00O(Object obj) {
                    int i;
                    int i2;
                    O1lIoIO o1lIoIO;
                    Object obj2;
/* 1 */             int[] iArr = this.I00000oIO;
/* 7 */             int i3 = 1048575;
/* 8 */             int i4 = 0;
/* 9 */             int i5 = 0;
/* 13 */            while (i4 < this.I000O01llI0) {
/* 17 */                int i6 = this.I000II[i4];
/* 19 */                int iI00IlilI0i0i = this.I00IlilI0i0i(i6);
/* 25 */                int i7 = iArr[i6 + 2];
/* 27 */                int i8 = i7 & 1048575;
/* 31 */                int i9 = 1 << (i7 >>> 20);
/* 33 */                if (i8 != i3) {
/* 35 */                    if (i8 != 1048575) {
/* 40 */                        i5 = I000oI1ioi.getInt(obj, i8);
                            }
/* 44 */                    i2 = i5;
/* 45 */                    i = i8;
                        } else {
/* 47 */                    i = i3;
/* 48 */                    i2 = i5;
                        }
/* 52 */                if ((268435456 & iI00IlilI0i0i) != 0) {
/* 54 */                    o1lIoIO = this;
/* 55 */                    obj2 = obj;
/* 60 */                    if (!o1lIoIO.I000oI1ioi(obj2, i6, i, i2, i9)) {
                            }
/* 6 */                     return false;
                        }
/* 64 */                o1lIoIO = this;
/* 65 */                obj2 = obj;
/* 66 */                int iI00IioO0OiOi = I00IioO0OiOi(iI00IlilI0i0i);
/* 72 */                if (iI00IioO0OiOi == 9 || iI00IioO0OiOi == 17) {
/* 255 */                   if (o1lIoIO.I000oI1ioi(obj2, i6, i, i2, i9) && !o1lIoIO.I000lI(i6).I0000Il00O(Ooil1O.I000OOo1O(iI00IlilI0i0i & 1048575, obj2))) {
/* 6 */                         return false;
                            }
/* 275 */                   i4++;
/* 277 */                   this = o1lIoIO;
/* 278 */                   obj = obj2;
/* 279 */                   i3 = i;
/* 280 */                   i5 = i2;
                        } else {
/* 80 */                    if (iI00IioO0OiOi != 27) {
/* 84 */                        if (iI00IioO0OiOi == 60 || iI00IioO0OiOi == 68) {
/* 190 */                           if (o1lIoIO.I00100o1O0lo(obj2, iArr[i6], i6) && !o1lIoIO.I000lI(i6).I0000Il00O(Ooil1O.I000OOo1O(iI00IlilI0i0i & 1048575, obj2))) {
/* 6 */                                 return false;
                                    }
/* 275 */                           i4++;
/* 277 */                           this = o1lIoIO;
/* 278 */                           obj = obj2;
/* 279 */                           i3 = i;
/* 280 */                           i5 = i2;
                                } else if (iI00IioO0OiOi != 49) {
/* 96 */                            if (iI00IioO0OiOi != 50) {
                                        continue;
                                    } else {
/* 100 */                               O1Oi111oiiI o1Oi111oiiI = o1lIoIO.I000lI;
/* 105 */                               Object objI000OOo1O = Ooil1O.I000OOo1O(iI00IlilI0i0i & 1048575, obj2);
/* 109 */                               o1Oi111oiiI.getClass();
/* 112 */                               O1OOo11I1O1 o1OOo11I1O1 = (O1OOo11I1O1) objI000OOo1O;
/* 118 */                               if (!o1OOo11I1O1.isEmpty() && ((i011I10o1IlI) ((O1OOiOlO0) o1lIoIO.I00000oOI[(i6 / 3) * 2]).I00000oIO.I00iiO).I00iOIl == i011lil01.I00l0I0l0lO1) {
/* 154 */                                   OiOIl0 oiOIl0I00000oIO = null;
/* 159 */                                   for (Object obj3 : o1OOo11I1O1.values()) {
/* 165 */                                       if (oiOIl0I00000oIO == null) {
/* 173 */                                           oiOIl0I00000oIO = OOi1o101lI.I0000Il00O.I00000oIO(obj3.getClass());
                                                }
/* 181 */                                       if (!oiOIl0I00000oIO.I0000Il00O(obj3)) {
/* 6 */                                             return false;
                                                }
                                            }
                                        }
                                    }
/* 275 */                           i4++;
/* 277 */                           this = o1lIoIO;
/* 278 */                           obj = obj2;
/* 279 */                           i3 = i;
/* 280 */                           i5 = i2;
                                }
                            }
/* 217 */                   List list = (List) Ooil1O.I000OOo1O(iI00IlilI0i0i & 1048575, obj2);
/* 223 */                   if (list.isEmpty()) {
                                continue;
                            } else {
/* 226 */                       OiOIl0 oiOIl0I000lI = o1lIoIO.I000lI(i6);
/* 235 */                       for (int i10 = 0; i10 < list.size(); i10++) {
/* 245 */                           if (!oiOIl0I000lI.I0000Il00O(list.get(i10))) {
/* 6 */                                 return false;
                                    }
                                }
                            }
/* 275 */                   i4++;
/* 277 */                   this = o1lIoIO;
/* 278 */                   obj = obj2;
/* 279 */                   i3 = i;
/* 280 */                   i5 = i2;
                        }
                    }
/* 12 */            return true;
                }

                @Override
                public final Io00Ol1o10O I0000O() {
/* 1 */             OIIOooO oIIOooO = this.I000OiO;
/* 3 */             I01IlIoOI i01IlIoOI = this.I0000oI00;
/* 5 */             oIIOooO.getClass();
/* 10 */            return ((Io00Ol1o10O) i01IlIoOI).I000lI();
                }

                /* JADX WARN: Removed duplicated region for block: B:145:0x0398  */
                /* JADX WARN: Removed duplicated region for block: B:87:0x01d7  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int I0000oI00(Io00Ol1o10O io00Ol1o10O) throws Oolio0o0olIO {
                    int i;
                    int iI000II;
                    int iI000II2;
                    int iI000II3;
                    int iI000OOo1O;
                    int iI000II4;
                    int iI000OOo1O2;
                    int iI000II5;
                    int iI000II6;
                    int iI000II7;
                    int iI00000oIO;
                    int iI000O01llI0;
                    int iI0001Ioi1lo;
                    int iI000II8;
                    int iI00000oIO2;
                    int iI0000Il00O;
                    int size;
                    int iI000OOo1O3;
                    int iI000II9;
                    int iI000II10;
                    int iI00000oIO3;
                    int iI000O01llI02;
                    int iI00000oIO4;
                    int iI000O01llI03;
                    int iI000II11;
                    int size2;
                    int iI000II12;
                    int iI000O01llI04;
                    int iI00000oIO5;
                    int iI000II13;
                    int iI000II14;
                    int iI000II15;
                    int iI000OOo1O4;
                    int iI000II16;
                    int iI000OOo1O5;
                    int i2;
/* 1 */             O1lIoIO o1lIoIO = this;
/* 3 */             Io00Ol1o10O io00Ol1o10O2 = io00Ol1o10O;
/* 5 */             int[] iArr = o1lIoIO.I00000oIO;
/* 10 */            int i3 = 1048575;
/* 12 */            int i4 = 0;
/* 13 */            int iI000O01llI05 = 0;
/* 15 */            for (int i5 = 0; i5 < iArr.length; i5 += 3) {
/* 17 */                int iI00IlilI0i0i = o1lIoIO.I00IlilI0i0i(i5);
/* 21 */                int iI00IioO0OiOi = I00IioO0OiOi(iI00IlilI0i0i);
/* 25 */                int i6 = iArr[i5];
/* 29 */                int i7 = iArr[i5 + 2];
/* 31 */                int i8 = i7 & 1048575;
/* 36 */                Unsafe unsafe = I000oI1ioi;
/* 38 */                if (iI00IioO0OiOi <= 17) {
/* 40 */                    if (i8 != i3) {
/* 47 */                        i4 = i8 == 1048575 ? 0 : unsafe.getInt(io00Ol1o10O2, i8);
/* 52 */                        i3 = i8;
                            }
/* 55 */                    i = 1 << (i7 >>> 20);
                        } else {
/* 58 */                    i = 0;
                        }
/* 59 */                long j = iI00IlilI0i0i & 1048575;
/* 65 */                if (iI00IioO0OiOi >= IlIOio.I00iiI.I00iOIl) {
/* 69 */                    int i9 = IlIOio.I00iiO.I00iOIl;
                        }
                        switch (iI00IioO0OiOi) {
                            case 0:
/* 1770 */                      if (o1lIoIO.I000oI1ioi(io00Ol1o10O2, i5, i3, i4, i)) {
/* 1772 */                          iI000II = IOOOiI0.I000II(i6);
/* 172 */                           iI0000Il00O = iI000II + 8;
/* 107 */                           iI000O01llI05 += iI0000Il00O;
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
/* 1757 */                      if (o1lIoIO.I000oI1ioi(io00Ol1o10O2, i5, i3, i4, i)) {
/* 1759 */                          iI000II2 = IOOOiI0.I000II(i6);
/* 1508 */                          iI000II6 = iI000II2 + 4;
/* 1490 */                          iI000O01llI05 += iI000II6;
                                }
/* 1491 */                      o1lIoIO = this;
/* 1493 */                      io00Ol1o10O2 = io00Ol1o10O;
                                break;
                            case 2:
/* 1736 */                      if (o1lIoIO.I000oI1ioi(io00Ol1o10O2, i5, i3, i4, i)) {
/* 1738 */                          long j2 = unsafe.getLong(io00Ol1o10O2, j);
/* 1742 */                          iI000II3 = IOOOiI0.I000II(i6);
/* 1746 */                          iI000OOo1O = IOOOiI0.I000OOo1O(j2);
/* 1445 */                          iI000O01llI05 += iI000OOo1O + iI000II3;
                                }
/* 1446 */                      o1lIoIO = this;
                                break;
                            case 3:
/* 1715 */                      if (o1lIoIO.I000oI1ioi(io00Ol1o10O2, i5, i3, i4, i)) {
/* 1717 */                          long j3 = unsafe.getLong(io00Ol1o10O2, j);
/* 1721 */                          iI000II3 = IOOOiI0.I000II(i6);
/* 1725 */                          iI000OOo1O = IOOOiI0.I000OOo1O(j3);
/* 1445 */                          iI000O01llI05 += iI000OOo1O + iI000II3;
                                }
/* 1446 */                      o1lIoIO = this;
                                break;
                            case 4:
/* 1693 */                      if (o1lIoIO.I000oI1ioi(io00Ol1o10O2, i5, i3, i4, i)) {
/* 1695 */                          int i10 = unsafe.getInt(io00Ol1o10O2, j);
/* 1699 */                          iI000II4 = IOOOiI0.I000II(i6);
/* 1704 */                          iI000OOo1O2 = IOOOiI0.I000OOo1O(i10);
/* 1474 */                          iI0001Ioi1lo = iI000OOo1O2 + iI000II4;
/* 1475 */                          iI000O01llI05 += iI0001Ioi1lo;
                                }
/* 1446 */                      o1lIoIO = this;
                                break;
                            case 5:
/* 1680 */                      if (o1lIoIO.I000oI1ioi(io00Ol1o10O2, i5, i3, i4, i)) {
/* 1682 */                          iI000II5 = IOOOiI0.I000II(i6);
/* 1488 */                          iI000II6 = iI000II5 + 8;
/* 1490 */                          iI000O01llI05 += iI000II6;
                                }
/* 1491 */                      o1lIoIO = this;
/* 1493 */                      io00Ol1o10O2 = io00Ol1o10O;
                                break;
                            case 6:
/* 1667 */                      if (o1lIoIO.I000oI1ioi(io00Ol1o10O2, i5, i3, i4, i)) {
/* 1669 */                          iI000II2 = IOOOiI0.I000II(i6);
/* 1508 */                          iI000II6 = iI000II2 + 4;
/* 1490 */                          iI000O01llI05 += iI000II6;
                                }
/* 1491 */                      o1lIoIO = this;
/* 1493 */                      io00Ol1o10O2 = io00Ol1o10O;
                                break;
                            case 7:
/* 1653 */                      if (o1lIoIO.I000oI1ioi(io00Ol1o10O2, i5, i3, i4, i)) {
/* 1659 */                          iI000II6 = IOOOiI0.I000II(i6) + 1;
/* 1490 */                          iI000O01llI05 += iI000II6;
                                }
/* 1491 */                      o1lIoIO = this;
/* 1493 */                      io00Ol1o10O2 = io00Ol1o10O;
                                break;
                            case 8:
/* 1608 */                      if (o1lIoIO.I000oI1ioi(io00Ol1o10O2, i5, i3, i4, i)) {
/* 1610 */                          Object object = unsafe.getObject(io00Ol1o10O2, j);
/* 1616 */                          if (object instanceof IIO1i00loOo) {
/* 1624 */                              iI000O01llI05 = IOOOiI0.I0001Ioi1lo(i6, (IIO1i00loOo) object) + iI000O01llI05;
                                    } else {
/* 1630 */                              int iI000II17 = IOOOiI0.I000II(i6);
/* 1634 */                              int iI00000oIO6 = Ooll0110oo.I00000oIO((String) object);
/* 1644 */                              iI000O01llI05 = IOOOiI0.I000O01llI0(iI00000oIO6) + iI00000oIO6 + iI000II17 + iI000O01llI05;
                                    }
                                }
/* 1446 */                      o1lIoIO = this;
                                break;
                            case 9:
/* 1575 */                      if (o1lIoIO.I000oI1ioi(io00Ol1o10O2, i5, i3, i4, i)) {
/* 1577 */                          Object object2 = unsafe.getObject(io00Ol1o10O2, j);
/* 1581 */                          OiOIl0 oiOIl0I000lI = o1lIoIO.I000lI(i5);
/* 1585 */                          Class cls = OiOO0oO1Io.I00000oIO;
/* 1589 */                          iI000II7 = IOOOiI0.I000II(i6);
/* 1593 */                          iI00000oIO = ((I01IlIoOI) object2).I00000oIO(oiOIl0I000lI);
/* 1597 */                          iI000O01llI0 = IOOOiI0.I000O01llI0(iI00000oIO);
/* 276 */                           i2 = iI000O01llI0 + iI00000oIO + iI000II7;
/* 134 */                           iI000O01llI05 += i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 10:
/* 1557 */                      if (o1lIoIO.I000oI1ioi(io00Ol1o10O2, i5, i3, i4, i)) {
/* 1565 */                          iI0001Ioi1lo = IOOOiI0.I0001Ioi1lo(i6, (IIO1i00loOo) unsafe.getObject(io00Ol1o10O2, j));
/* 1475 */                          iI000O01llI05 += iI0001Ioi1lo;
                                }
/* 1446 */                      o1lIoIO = this;
                                break;
                            case 11:
/* 1537 */                      if (o1lIoIO.I000oI1ioi(io00Ol1o10O2, i5, i3, i4, i)) {
/* 1539 */                          int i11 = unsafe.getInt(io00Ol1o10O2, j);
/* 1543 */                          iI000II4 = IOOOiI0.I000II(i6);
/* 1547 */                          iI000OOo1O2 = IOOOiI0.I000O01llI0(i11);
/* 1474 */                          iI0001Ioi1lo = iI000OOo1O2 + iI000II4;
/* 1475 */                          iI000O01llI05 += iI0001Ioi1lo;
                                }
/* 1446 */                      o1lIoIO = this;
                                break;
                            case 12:
/* 1516 */                      if (o1lIoIO.I000oI1ioi(io00Ol1o10O2, i5, i3, i4, i)) {
/* 1518 */                          int i12 = unsafe.getInt(io00Ol1o10O2, j);
/* 1522 */                          iI000II4 = IOOOiI0.I000II(i6);
/* 1527 */                          iI000OOo1O2 = IOOOiI0.I000OOo1O(i12);
/* 1474 */                          iI0001Ioi1lo = iI000OOo1O2 + iI000II4;
/* 1475 */                          iI000O01llI05 += iI0001Ioi1lo;
                                }
/* 1446 */                      o1lIoIO = this;
                                break;
                            case 13:
/* 1502 */                      if (o1lIoIO.I000oI1ioi(io00Ol1o10O2, i5, i3, i4, i)) {
/* 1504 */                          iI000II2 = IOOOiI0.I000II(i6);
/* 1508 */                          iI000II6 = iI000II2 + 4;
/* 1490 */                          iI000O01llI05 += iI000II6;
                                }
/* 1491 */                      o1lIoIO = this;
/* 1493 */                      io00Ol1o10O2 = io00Ol1o10O;
                                break;
                            case 14:
/* 1482 */                      if (o1lIoIO.I000oI1ioi(io00Ol1o10O2, i5, i3, i4, i)) {
/* 1484 */                          iI000II5 = IOOOiI0.I000II(i6);
/* 1488 */                          iI000II6 = iI000II5 + 8;
/* 1490 */                          iI000O01llI05 += iI000II6;
                                }
/* 1491 */                      o1lIoIO = this;
/* 1493 */                      io00Ol1o10O2 = io00Ol1o10O;
                                break;
                            case 15:
/* 1455 */                      if (o1lIoIO.I000oI1ioi(io00Ol1o10O2, i5, i3, i4, i)) {
/* 1457 */                          int i13 = unsafe.getInt(io00Ol1o10O2, j);
/* 1461 */                          iI000II4 = IOOOiI0.I000II(i6);
/* 1470 */                          iI000OOo1O2 = IOOOiI0.I000O01llI0((i13 >> 31) ^ (i13 << 1));
/* 1474 */                          iI0001Ioi1lo = iI000OOo1O2 + iI000II4;
/* 1475 */                          iI000O01llI05 += iI0001Ioi1lo;
                                }
/* 1446 */                      o1lIoIO = this;
                                break;
                            case 16:
/* 1425 */                      if (o1lIoIO.I000oI1ioi(io00Ol1o10O2, i5, i3, i4, i)) {
/* 1427 */                          long j4 = unsafe.getLong(io00Ol1o10O2, j);
/* 1431 */                          iI000II3 = IOOOiI0.I000II(i6);
/* 1440 */                          iI000OOo1O = IOOOiI0.I000OOo1O((j4 << 1) ^ (j4 >> 63));
/* 1445 */                          iI000O01llI05 += iI000OOo1O + iI000II3;
                                }
/* 1446 */                      o1lIoIO = this;
                                break;
                            case 17:
/* 1394 */                      if (o1lIoIO.I000oI1ioi(io00Ol1o10O2, i5, i3, i4, i)) {
/* 1400 */                          I01IlIoOI i01IlIoOI = (I01IlIoOI) unsafe.getObject(io00Ol1o10O2, j);
/* 1402 */                          OiOIl0 oiOIl0I000lI2 = o1lIoIO.I000lI(i5);
/* 1406 */                          Class cls2 = OiOO0oO1Io.I00000oIO;
/* 1412 */                          iI000II8 = IOOOiI0.I000II(i6) * 2;
/* 1414 */                          iI00000oIO2 = i01IlIoOI.I00000oIO(oiOIl0I000lI2);
/* 106 */                           iI0000Il00O = iI00000oIO2 + iI000II8;
/* 107 */                           iI000O01llI05 += iI0000Il00O;
                                    break;
                                } else {
                                    break;
                                }
                            case PoseLandmark.RIGHT_PINKY:
/* 1383 */                      iI0000Il00O = OiOO0oO1Io.I0000Il00O(i6, (List) unsafe.getObject(io00Ol1o10O2, j));
/* 107 */                       iI000O01llI05 += iI0000Il00O;
                                break;
                            case PoseLandmark.LEFT_INDEX:
/* 1371 */                      iI0000Il00O = OiOO0oO1Io.I00000oOI(i6, (List) unsafe.getObject(io00Ol1o10O2, j));
/* 107 */                       iI000O01llI05 += iI0000Il00O;
                                break;
                            case PoseLandmark.RIGHT_INDEX:
/* 1337 */                      List list = (List) unsafe.getObject(io00Ol1o10O2, j);
/* 1339 */                      Class cls3 = OiOO0oO1Io.I00000oIO;
/* 1362 */                      iI000II10 = list.size() == 0 ? 0 : (IOOOiI0.I000II(i6) * list.size()) + OiOO0oO1Io.I0000oI00(list);
/* 933 */                       iI000O01llI05 += iI000II10;
                                break;
                            case PoseLandmark.LEFT_THUMB:
/* 1311 */                      List list2 = (List) unsafe.getObject(io00Ol1o10O2, j);
/* 1313 */                      Class cls4 = OiOO0oO1Io.I00000oIO;
/* 1315 */                      size = list2.size();
/* 1319 */                      if (size != 0) {
/* 1323 */                          iI000OOo1O3 = OiOO0oO1Io.I000OOo1O(list2);
/* 1327 */                          iI000II9 = IOOOiI0.I000II(i6);
/* 932 */                           iI000II10 = (iI000II9 * size) + iI000OOo1O3;
/* 933 */                           iI000O01llI05 += iI000II10;
                                    break;
                                }
/* 933 */                       iI000O01llI05 += iI000II10;
                            case PoseLandmark.RIGHT_THUMB:
/* 1285 */                      List list3 = (List) unsafe.getObject(io00Ol1o10O2, j);
/* 1287 */                      Class cls5 = OiOO0oO1Io.I00000oIO;
/* 1289 */                      size = list3.size();
/* 1293 */                      if (size != 0) {
/* 1297 */                          iI000OOo1O3 = OiOO0oO1Io.I0000O(list3);
/* 1301 */                          iI000II9 = IOOOiI0.I000II(i6);
/* 932 */                           iI000II10 = (iI000II9 * size) + iI000OOo1O3;
/* 933 */                           iI000O01llI05 += iI000II10;
                                    break;
                                }
/* 933 */                       iI000O01llI05 += iI000II10;
                            case PoseLandmark.LEFT_HIP:
/* 1275 */                      iI0000Il00O = OiOO0oO1Io.I0000Il00O(i6, (List) unsafe.getObject(io00Ol1o10O2, j));
/* 107 */                       iI000O01llI05 += iI0000Il00O;
                                break;
                            case PoseLandmark.RIGHT_HIP:
/* 1263 */                      iI0000Il00O = OiOO0oO1Io.I00000oOI(i6, (List) unsafe.getObject(io00Ol1o10O2, j));
/* 107 */                       iI000O01llI05 += iI0000Il00O;
                                break;
                            case PoseLandmark.LEFT_KNEE:
/* 1237 */                      List list4 = (List) unsafe.getObject(io00Ol1o10O2, j);
/* 1239 */                      Class cls6 = OiOO0oO1Io.I00000oIO;
/* 1241 */                      int size3 = list4.size();
/* 1254 */                      iI000II13 = size3 == 0 ? 0 : (IOOOiI0.I000II(i6) + 1) * size3;
/* 524 */                       iI000O01llI05 += iI000II13;
                                break;
                            case PoseLandmark.RIGHT_KNEE:
/* 1132 */                      List list5 = (List) unsafe.getObject(io00Ol1o10O2, j);
/* 1134 */                      Class cls7 = OiOO0oO1Io.I00000oIO;
/* 1136 */                      int size4 = list5.size();
/* 1140 */                      if (size4 != 0) {
/* 1148 */                          iI000II10 = IOOOiI0.I000II(i6) * size4;
/* 1151 */                          if (list5 instanceof O0o1l10iOII) {
/* 1153 */                              O0o1l10iOII o0o1l10iOII = (O0o1l10iOII) list5;
/* 1156 */                              for (int i14 = 0; i14 < size4; i14++) {
/* 1158 */                                  Object objI000II = o0o1l10iOII.I000II();
/* 1164 */                                  if (objI000II instanceof IIO1i00loOo) {
/* 1168 */                                      iI00000oIO4 = ((IIO1i00loOo) objI000II).size();
/* 1172 */                                      iI000O01llI03 = IOOOiI0.I000O01llI0(iI00000oIO4);
                                            } else {
/* 1182 */                                      iI00000oIO4 = Ooll0110oo.I00000oIO((String) objI000II);
/* 1186 */                                      iI000O01llI03 = IOOOiI0.I000O01llI0(iI00000oIO4);
                                            }
/* 1177 */                                  iI000II10 = iI000O01llI03 + iI00000oIO4 + iI000II10;
                                        }
                                    } else {
/* 1195 */                              for (int i15 = 0; i15 < size4; i15++) {
/* 1197 */                                  Object obj = list5.get(i15);
/* 1203 */                                  if (obj instanceof IIO1i00loOo) {
/* 1207 */                                      iI00000oIO3 = ((IIO1i00loOo) obj).size();
/* 1211 */                                      iI000O01llI02 = IOOOiI0.I000O01llI0(iI00000oIO3);
                                            } else {
/* 1221 */                                      iI00000oIO3 = Ooll0110oo.I00000oIO((String) obj);
/* 1225 */                                      iI000O01llI02 = IOOOiI0.I000O01llI0(iI00000oIO3);
                                            }
/* 1216 */                                  iI000II10 = iI000O01llI02 + iI00000oIO3 + iI000II10;
                                        }
                                    }
                                }
/* 933 */                       iI000O01llI05 += iI000II10;
                                break;
                            case 27:
/* 1082 */                      List list6 = (List) unsafe.getObject(io00Ol1o10O2, j);
/* 1084 */                      OiOIl0 oiOIl0I000lI3 = o1lIoIO.I000lI(i5);
/* 1088 */                      Class cls8 = OiOO0oO1Io.I00000oIO;
/* 1090 */                      int size5 = list6.size();
/* 1094 */                      if (size5 == 0) {
/* 1096 */                          iI000II11 = 0;
                                } else {
/* 1102 */                          iI000II11 = IOOOiI0.I000II(i6) * size5;
/* 1104 */                          for (int i16 = 0; i16 < size5; i16++) {
/* 1112 */                              int iI00000oIO7 = ((I01IlIoOI) list6.get(i16)).I00000oIO(oiOIl0I000lI3);
/* 1121 */                              iI000II11 += IOOOiI0.I000O01llI0(iI00000oIO7) + iI00000oIO7;
                                    }
                                }
/* 1125 */                      iI000O01llI05 += iI000II11;
                                break;
                            case PoseLandmark.RIGHT_ANKLE:
/* 1036 */                      List list7 = (List) unsafe.getObject(io00Ol1o10O2, j);
/* 1038 */                      Class cls9 = OiOO0oO1Io.I00000oIO;
/* 1040 */                      int size6 = list7.size();
/* 1044 */                      if (size6 != 0) {
/* 1051 */                          iI000II10 = IOOOiI0.I000II(i6) * size6;
/* 1057 */                          for (int i17 = 0; i17 < list7.size(); i17++) {
/* 1065 */                              int size7 = ((IIO1i00loOo) list7.get(i17)).size();
/* 1074 */                              iI000II10 += IOOOiI0.I000O01llI0(size7) + size7;
                                    }
                                }
/* 933 */                       iI000O01llI05 += iI000II10;
                                break;
                            case PoseLandmark.LEFT_HEEL:
/* 1012 */                      List list8 = (List) unsafe.getObject(io00Ol1o10O2, j);
/* 1014 */                      Class cls10 = OiOO0oO1Io.I00000oIO;
/* 1016 */                      size = list8.size();
/* 1020 */                      if (size != 0) {
/* 1023 */                          iI000OOo1O3 = OiOO0oO1Io.I000O01llI0(list8);
/* 1027 */                          iI000II9 = IOOOiI0.I000II(i6);
/* 932 */                           iI000II10 = (iI000II9 * size) + iI000OOo1O3;
/* 933 */                           iI000O01llI05 += iI000II10;
                                    break;
                                }
/* 933 */                       iI000O01llI05 += iI000II10;
                            case 30:
/* 988 */                       List list9 = (List) unsafe.getObject(io00Ol1o10O2, j);
/* 990 */                       Class cls11 = OiOO0oO1Io.I00000oIO;
/* 992 */                       size = list9.size();
/* 996 */                       if (size != 0) {
/* 999 */                           iI000OOo1O3 = OiOO0oO1Io.I00000oIO(list9);
/* 1003 */                          iI000II9 = IOOOiI0.I000II(i6);
/* 932 */                           iI000II10 = (iI000II9 * size) + iI000OOo1O3;
/* 933 */                           iI000O01llI05 += iI000II10;
                                    break;
                                }
/* 933 */                       iI000O01llI05 += iI000II10;
                            case PoseLandmark.LEFT_FOOT_INDEX:
/* 978 */                       iI0000Il00O = OiOO0oO1Io.I00000oOI(i6, (List) unsafe.getObject(io00Ol1o10O2, j));
/* 107 */                       iI000O01llI05 += iI0000Il00O;
                                break;
                            case 32:
/* 966 */                       iI0000Il00O = OiOO0oO1Io.I0000Il00O(i6, (List) unsafe.getObject(io00Ol1o10O2, j));
/* 107 */                       iI000O01llI05 += iI0000Il00O;
                                break;
                            case 33:
/* 940 */                       List list10 = (List) unsafe.getObject(io00Ol1o10O2, j);
/* 942 */                       Class cls12 = OiOO0oO1Io.I00000oIO;
/* 944 */                       size = list10.size();
/* 948 */                       if (size != 0) {
/* 951 */                           iI000OOo1O3 = OiOO0oO1Io.I0001Ioi1lo(list10);
/* 955 */                           iI000II9 = IOOOiI0.I000II(i6);
/* 932 */                           iI000II10 = (iI000II9 * size) + iI000OOo1O3;
/* 933 */                           iI000O01llI05 += iI000II10;
                                    break;
                                }
/* 933 */                       iI000O01llI05 += iI000II10;
                            case 34:
/* 911 */                       List list11 = (List) unsafe.getObject(io00Ol1o10O2, j);
/* 913 */                       Class cls13 = OiOO0oO1Io.I00000oIO;
/* 915 */                       size = list11.size();
/* 919 */                       if (size != 0) {
/* 923 */                           iI000OOo1O3 = OiOO0oO1Io.I000II(list11);
/* 927 */                           iI000II9 = IOOOiI0.I000II(i6);
/* 932 */                           iI000II10 = (iI000II9 * size) + iI000OOo1O3;
/* 933 */                           iI000O01llI05 += iI000II10;
                                    break;
                                }
/* 933 */                       iI000O01llI05 += iI000II10;
                            case InputImage.IMAGE_FORMAT_YUV_420_888:
/* 885 */                       List list12 = (List) unsafe.getObject(io00Ol1o10O2, j);
/* 887 */                       Class cls14 = OiOO0oO1Io.I00000oIO;
/* 893 */                       size2 = list12.size() * 8;
/* 895 */                       if (size2 > 0) {
/* 897 */                           iI000II12 = IOOOiI0.I000II(i6);
/* 901 */                           iI000O01llI04 = IOOOiI0.I000O01llI0(size2);
/* 597 */                           iI000O01llI05 += iI000O01llI04 + iI000II12 + size2;
                                    break;
                                } else {
                                    break;
                                }
                            case 36:
/* 859 */                       List list13 = (List) unsafe.getObject(io00Ol1o10O2, j);
/* 861 */                       Class cls15 = OiOO0oO1Io.I00000oIO;
/* 867 */                       size2 = list13.size() * 4;
/* 869 */                       if (size2 > 0) {
/* 871 */                           iI000II12 = IOOOiI0.I000II(i6);
/* 875 */                           iI000O01llI04 = IOOOiI0.I000O01llI0(size2);
/* 597 */                           iI000O01llI05 += iI000O01llI04 + iI000II12 + size2;
                                    break;
                                } else {
                                    break;
                                }
                            case 37:
/* 839 */                       size2 = OiOO0oO1Io.I0000oI00((List) unsafe.getObject(io00Ol1o10O2, j));
/* 843 */                       if (size2 > 0) {
/* 845 */                           iI000II12 = IOOOiI0.I000II(i6);
/* 849 */                           iI000O01llI04 = IOOOiI0.I000O01llI0(size2);
/* 597 */                           iI000O01llI05 += iI000O01llI04 + iI000II12 + size2;
                                    break;
                                } else {
                                    break;
                                }
                            case 38:
/* 817 */                       size2 = OiOO0oO1Io.I000OOo1O((List) unsafe.getObject(io00Ol1o10O2, j));
/* 821 */                       if (size2 > 0) {
/* 823 */                           iI000II12 = IOOOiI0.I000II(i6);
/* 827 */                           iI000O01llI04 = IOOOiI0.I000O01llI0(size2);
/* 597 */                           iI000O01llI05 += iI000O01llI04 + iI000II12 + size2;
                                    break;
                                } else {
                                    break;
                                }
                            case 39:
/* 795 */                       size2 = OiOO0oO1Io.I0000O((List) unsafe.getObject(io00Ol1o10O2, j));
/* 799 */                       if (size2 > 0) {
/* 801 */                           iI000II12 = IOOOiI0.I000II(i6);
/* 805 */                           iI000O01llI04 = IOOOiI0.I000O01llI0(size2);
/* 597 */                           iI000O01llI05 += iI000O01llI04 + iI000II12 + size2;
                                    break;
                                } else {
                                    break;
                                }
                            case 40:
/* 767 */                       List list14 = (List) unsafe.getObject(io00Ol1o10O2, j);
/* 769 */                       Class cls16 = OiOO0oO1Io.I00000oIO;
/* 775 */                       size2 = list14.size() * 8;
/* 777 */                       if (size2 > 0) {
/* 779 */                           iI000II12 = IOOOiI0.I000II(i6);
/* 783 */                           iI000O01llI04 = IOOOiI0.I000O01llI0(size2);
/* 597 */                           iI000O01llI05 += iI000O01llI04 + iI000II12 + size2;
                                    break;
                                } else {
                                    break;
                                }
                            case 41:
/* 741 */                       List list15 = (List) unsafe.getObject(io00Ol1o10O2, j);
/* 743 */                       Class cls17 = OiOO0oO1Io.I00000oIO;
/* 749 */                       size2 = list15.size() * 4;
/* 751 */                       if (size2 > 0) {
/* 753 */                           iI000II12 = IOOOiI0.I000II(i6);
/* 757 */                           iI000O01llI04 = IOOOiI0.I000O01llI0(size2);
/* 597 */                           iI000O01llI05 += iI000O01llI04 + iI000II12 + size2;
                                    break;
                                } else {
                                    break;
                                }
                            case 42:
/* 717 */                       List list16 = (List) unsafe.getObject(io00Ol1o10O2, j);
/* 719 */                       Class cls18 = OiOO0oO1Io.I00000oIO;
/* 721 */                       size2 = list16.size();
/* 725 */                       if (size2 > 0) {
/* 727 */                           iI000II12 = IOOOiI0.I000II(i6);
/* 731 */                           iI000O01llI04 = IOOOiI0.I000O01llI0(size2);
/* 597 */                           iI000O01llI05 += iI000O01llI04 + iI000II12 + size2;
                                    break;
                                } else {
                                    break;
                                }
                            case 43:
/* 698 */                       size2 = OiOO0oO1Io.I000O01llI0((List) unsafe.getObject(io00Ol1o10O2, j));
/* 702 */                       if (size2 > 0) {
/* 704 */                           iI000II12 = IOOOiI0.I000II(i6);
/* 708 */                           iI000O01llI04 = IOOOiI0.I000O01llI0(size2);
/* 597 */                           iI000O01llI05 += iI000O01llI04 + iI000II12 + size2;
                                    break;
                                } else {
                                    break;
                                }
                            case 44:
/* 677 */                       size2 = OiOO0oO1Io.I00000oIO((List) unsafe.getObject(io00Ol1o10O2, j));
/* 681 */                       if (size2 > 0) {
/* 683 */                           iI000II12 = IOOOiI0.I000II(i6);
/* 687 */                           iI000O01llI04 = IOOOiI0.I000O01llI0(size2);
/* 597 */                           iI000O01llI05 += iI000O01llI04 + iI000II12 + size2;
                                    break;
                                } else {
                                    break;
                                }
                            case BuildConfig.VERSION_CODE:
/* 650 */                       List list17 = (List) unsafe.getObject(io00Ol1o10O2, j);
/* 652 */                       Class cls19 = OiOO0oO1Io.I00000oIO;
/* 658 */                       size2 = list17.size() * 4;
/* 660 */                       if (size2 > 0) {
/* 662 */                           iI000II12 = IOOOiI0.I000II(i6);
/* 666 */                           iI000O01llI04 = IOOOiI0.I000O01llI0(size2);
/* 597 */                           iI000O01llI05 += iI000O01llI04 + iI000II12 + size2;
                                    break;
                                } else {
                                    break;
                                }
                            case 46:
/* 625 */                       List list18 = (List) unsafe.getObject(io00Ol1o10O2, j);
/* 627 */                       Class cls20 = OiOO0oO1Io.I00000oIO;
/* 633 */                       size2 = list18.size() * 8;
/* 635 */                       if (size2 > 0) {
/* 637 */                           iI000II12 = IOOOiI0.I000II(i6);
/* 641 */                           iI000O01llI04 = IOOOiI0.I000O01llI0(size2);
/* 597 */                           iI000O01llI05 += iI000O01llI04 + iI000II12 + size2;
                                    break;
                                } else {
                                    break;
                                }
                            case 47:
/* 606 */                       size2 = OiOO0oO1Io.I0001Ioi1lo((List) unsafe.getObject(io00Ol1o10O2, j));
/* 610 */                       if (size2 > 0) {
/* 612 */                           iI000II12 = IOOOiI0.I000II(i6);
/* 616 */                           iI000O01llI04 = IOOOiI0.I000O01llI0(size2);
/* 597 */                           iI000O01llI05 += iI000O01llI04 + iI000II12 + size2;
                                    break;
                                } else {
                                    break;
                                }
                            case 48:
/* 581 */                       size2 = OiOO0oO1Io.I000II((List) unsafe.getObject(io00Ol1o10O2, j));
/* 585 */                       if (size2 > 0) {
/* 587 */                           iI000II12 = IOOOiI0.I000II(i6);
/* 591 */                           iI000O01llI04 = IOOOiI0.I000O01llI0(size2);
/* 597 */                           iI000O01llI05 += iI000O01llI04 + iI000II12 + size2;
                                    break;
                                } else {
                                    break;
                                }
                            case 49:
/* 531 */                       List list19 = (List) unsafe.getObject(io00Ol1o10O2, j);
/* 533 */                       OiOIl0 oiOIl0I000lI4 = o1lIoIO.I000lI(i5);
/* 537 */                       Class cls21 = OiOO0oO1Io.I00000oIO;
/* 539 */                       int size8 = list19.size();
/* 543 */                       if (size8 == 0) {
/* 545 */                           iI00000oIO5 = 0;
                                } else {
/* 548 */                           iI00000oIO5 = 0;
/* 549 */                           for (int i18 = 0; i18 < size8; i18++) {
/* 568 */                               iI00000oIO5 += ((I01IlIoOI) list19.get(i18)).I00000oIO(oiOIl0I000lI4) + (IOOOiI0.I000II(i6) * 2);
                                    }
                                }
/* 572 */                       iI000O01llI05 += iI00000oIO5;
                                break;
                            case 50:
/* 445 */                       O1Oi111oiiI o1Oi111oiiI = o1lIoIO.I000lI;
/* 447 */                       Object object3 = unsafe.getObject(io00Ol1o10O2, j);
/* 457 */                       Object obj2 = o1lIoIO.I00000oOI[(i5 / 3) * 2];
/* 459 */                       o1Oi111oiiI.getClass();
/* 462 */                       O1OOo11I1O1 o1OOo11I1O1 = (O1OOo11I1O1) object3;
/* 464 */                       O1OOiOlO0 o1OOiOlO0 = (O1OOiOlO0) obj2;
/* 470 */                       if (!o1OOo11I1O1.isEmpty()) {
/* 482 */                           iI000II13 = 0;
/* 487 */                           for (Map.Entry entry : o1OOo11I1O1.entrySet()) {
/* 495 */                               Object key = entry.getKey();
/* 499 */                               Object value = entry.getValue();
/* 503 */                               o1OOiOlO0.getClass();
/* 506 */                               int iI000II18 = IOOOiI0.I000II(i6);
/* 512 */                               int iI00000oIO8 = O1OOiOlO0.I00000oIO(o1OOiOlO0.I00000oIO, key, value);
/* 522 */                               iI000II13 += IOOOiI0.I000O01llI0(iI00000oIO8) + iI00000oIO8 + iI000II18;
                                    }
                                }
/* 524 */                       iI000O01llI05 += iI000II13;
                                break;
                            case 51:
/* 437 */                       if (o1lIoIO.I00100o1O0lo(io00Ol1o10O2, i6, i5)) {
/* 439 */                           iI000II = IOOOiI0.I000II(i6);
/* 172 */                           iI0000Il00O = iI000II + 8;
/* 107 */                           iI000O01llI05 += iI0000Il00O;
                                    break;
                                } else {
                                    break;
                                }
                            case 52:
/* 425 */                       if (o1lIoIO.I00100o1O0lo(io00Ol1o10O2, i6, i5)) {
/* 427 */                           iI000II14 = IOOOiI0.I000II(i6);
/* 185 */                           iI0000Il00O = iI000II14 + 4;
/* 107 */                           iI000O01llI05 += iI0000Il00O;
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
/* 405 */                       if (o1lIoIO.I00100o1O0lo(io00Ol1o10O2, i6, i5)) {
/* 407 */                           long jI001l0I00 = I001l0I00(j, io00Ol1o10O2);
/* 411 */                           iI000II15 = IOOOiI0.I000II(i6);
/* 415 */                           iI000OOo1O4 = IOOOiI0.I000OOo1O(jI001l0I00);
/* 133 */                           i2 = iI000OOo1O4 + iI000II15;
/* 134 */                           iI000O01llI05 += i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
/* 385 */                       if (o1lIoIO.I00100o1O0lo(io00Ol1o10O2, i6, i5)) {
/* 387 */                           long jI001l0I002 = I001l0I00(j, io00Ol1o10O2);
/* 391 */                           iI000II15 = IOOOiI0.I000II(i6);
/* 395 */                           iI000OOo1O4 = IOOOiI0.I000OOo1O(jI001l0I002);
/* 133 */                           i2 = iI000OOo1O4 + iI000II15;
/* 134 */                           iI000O01llI05 += i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 55:
/* 364 */                       if (o1lIoIO.I00100o1O0lo(io00Ol1o10O2, i6, i5)) {
/* 366 */                           int iI001iOo1i0O = I001iOo1i0O(j, io00Ol1o10O2);
/* 370 */                           iI000II16 = IOOOiI0.I000II(i6);
/* 375 */                           iI000OOo1O5 = IOOOiI0.I000OOo1O(iI001iOo1i0O);
/* 160 */                           iI0000Il00O = iI000OOo1O5 + iI000II16;
/* 107 */                           iI000O01llI05 += iI0000Il00O;
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
/* 352 */                       if (o1lIoIO.I00100o1O0lo(io00Ol1o10O2, i6, i5)) {
/* 354 */                           iI000II = IOOOiI0.I000II(i6);
/* 172 */                           iI0000Il00O = iI000II + 8;
/* 107 */                           iI000O01llI05 += iI0000Il00O;
                                    break;
                                } else {
                                    break;
                                }
                            case 57:
/* 340 */                       if (o1lIoIO.I00100o1O0lo(io00Ol1o10O2, i6, i5)) {
/* 342 */                           iI000II14 = IOOOiI0.I000II(i6);
/* 185 */                           iI0000Il00O = iI000II14 + 4;
/* 107 */                           iI000O01llI05 += iI0000Il00O;
                                    break;
                                } else {
                                    break;
                                }
                            case 58:
/* 327 */                       if (o1lIoIO.I00100o1O0lo(io00Ol1o10O2, i6, i5)) {
/* 333 */                           iI0000Il00O = IOOOiI0.I000II(i6) + 1;
/* 107 */                           iI000O01llI05 += iI0000Il00O;
                                    break;
                                } else {
                                    break;
                                }
                            case 59:
/* 283 */                       if (o1lIoIO.I00100o1O0lo(io00Ol1o10O2, i6, i5)) {
/* 285 */                           Object object4 = unsafe.getObject(io00Ol1o10O2, j);
/* 291 */                           if (object4 instanceof IIO1i00loOo) {
/* 299 */                               iI000O01llI05 = IOOOiI0.I0001Ioi1lo(i6, (IIO1i00loOo) object4) + iI000O01llI05;
                                        break;
                                    } else {
/* 305 */                               int iI000II19 = IOOOiI0.I000II(i6);
/* 309 */                               int iI00000oIO9 = Ooll0110oo.I00000oIO((String) object4);
/* 319 */                               iI000O01llI05 = IOOOiI0.I000O01llI0(iI00000oIO9) + iI00000oIO9 + iI000II19 + iI000O01llI05;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            case 60:
/* 249 */                       if (o1lIoIO.I00100o1O0lo(io00Ol1o10O2, i6, i5)) {
/* 251 */                           Object object5 = unsafe.getObject(io00Ol1o10O2, j);
/* 255 */                           OiOIl0 oiOIl0I000lI5 = o1lIoIO.I000lI(i5);
/* 259 */                           Class cls22 = OiOO0oO1Io.I00000oIO;
/* 263 */                           iI000II7 = IOOOiI0.I000II(i6);
/* 267 */                           iI00000oIO = ((I01IlIoOI) object5).I00000oIO(oiOIl0I000lI5);
/* 271 */                           iI000O01llI0 = IOOOiI0.I000O01llI0(iI00000oIO);
/* 276 */                           i2 = iI000O01llI0 + iI00000oIO + iI000II7;
/* 134 */                           iI000O01llI05 += i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 61:
/* 231 */                       if (o1lIoIO.I00100o1O0lo(io00Ol1o10O2, i6, i5)) {
/* 239 */                           iI0000Il00O = IOOOiI0.I0001Ioi1lo(i6, (IIO1i00loOo) unsafe.getObject(io00Ol1o10O2, j));
/* 107 */                           iI000O01llI05 += iI0000Il00O;
                                    break;
                                } else {
                                    break;
                                }
                            case 62:
/* 212 */                       if (o1lIoIO.I00100o1O0lo(io00Ol1o10O2, i6, i5)) {
/* 214 */                           int iI001iOo1i0O2 = I001iOo1i0O(j, io00Ol1o10O2);
/* 218 */                           iI000II16 = IOOOiI0.I000II(i6);
/* 222 */                           iI000OOo1O5 = IOOOiI0.I000O01llI0(iI001iOo1i0O2);
/* 160 */                           iI0000Il00O = iI000OOo1O5 + iI000II16;
/* 107 */                           iI000O01llI05 += iI0000Il00O;
                                    break;
                                } else {
                                    break;
                                }
                            case 63:
/* 192 */                       if (o1lIoIO.I00100o1O0lo(io00Ol1o10O2, i6, i5)) {
/* 194 */                           int iI001iOo1i0O3 = I001iOo1i0O(j, io00Ol1o10O2);
/* 198 */                           iI000II16 = IOOOiI0.I000II(i6);
/* 203 */                           iI000OOo1O5 = IOOOiI0.I000OOo1O(iI001iOo1i0O3);
/* 160 */                           iI0000Il00O = iI000OOo1O5 + iI000II16;
/* 107 */                           iI000O01llI05 += iI0000Il00O;
                                    break;
                                } else {
                                    break;
                                }
                            case Barcode.FORMAT_EAN_8:
/* 179 */                       if (o1lIoIO.I00100o1O0lo(io00Ol1o10O2, i6, i5)) {
/* 181 */                           iI000II14 = IOOOiI0.I000II(i6);
/* 185 */                           iI0000Il00O = iI000II14 + 4;
/* 107 */                           iI000O01llI05 += iI0000Il00O;
                                    break;
                                } else {
                                    break;
                                }
                            case 65:
/* 166 */                       if (o1lIoIO.I00100o1O0lo(io00Ol1o10O2, i6, i5)) {
/* 168 */                           iI000II = IOOOiI0.I000II(i6);
/* 172 */                           iI0000Il00O = iI000II + 8;
/* 107 */                           iI000O01llI05 += iI0000Il00O;
                                    break;
                                } else {
                                    break;
                                }
                            case 66:
/* 141 */                       if (o1lIoIO.I00100o1O0lo(io00Ol1o10O2, i6, i5)) {
/* 143 */                           int iI001iOo1i0O4 = I001iOo1i0O(j, io00Ol1o10O2);
/* 147 */                           iI000II16 = IOOOiI0.I000II(i6);
/* 156 */                           iI000OOo1O5 = IOOOiI0.I000O01llI0((iI001iOo1i0O4 >> 31) ^ (iI001iOo1i0O4 << 1));
/* 160 */                           iI0000Il00O = iI000OOo1O5 + iI000II16;
/* 107 */                           iI000O01llI05 += iI0000Il00O;
                                    break;
                                } else {
                                    break;
                                }
                            case 67:
/* 114 */                       if (o1lIoIO.I00100o1O0lo(io00Ol1o10O2, i6, i5)) {
/* 116 */                           long jI001l0I003 = I001l0I00(j, io00Ol1o10O2);
/* 120 */                           iI000II15 = IOOOiI0.I000II(i6);
/* 129 */                           iI000OOo1O4 = IOOOiI0.I000OOo1O((jI001l0I003 << 1) ^ (jI001l0I003 >> 63));
/* 133 */                           i2 = iI000OOo1O4 + iI000II15;
/* 134 */                           iI000O01llI05 += i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 68:
/* 82 */                        if (o1lIoIO.I00100o1O0lo(io00Ol1o10O2, i6, i5)) {
/* 88 */                            I01IlIoOI i01IlIoOI2 = (I01IlIoOI) unsafe.getObject(io00Ol1o10O2, j);
/* 90 */                            OiOIl0 oiOIl0I000lI6 = o1lIoIO.I000lI(i5);
/* 94 */                            Class cls23 = OiOO0oO1Io.I00000oIO;
/* 100 */                           iI000II8 = IOOOiI0.I000II(i6) * 2;
/* 102 */                           iI00000oIO2 = i01IlIoOI2.I00000oIO(oiOIl0I000lI6);
/* 106 */                           iI0000Il00O = iI00000oIO2 + iI000II8;
/* 107 */                           iI000O01llI05 += iI0000Il00O;
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
/* 1784 */          o1lIoIO.I000l1.getClass();
/* 1793 */          return io00Ol1o10O2.unknownFields.I00000oOI() + iI000O01llI05;
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                @Override
                public final void I0001Ioi1lo(Object obj, Oi1ol0llI oi1ol0llI) throws IOException, Oolio0o0olIO {
                    int i;
                    int i2;
                    int i3;
                    boolean z;
/* 1 */             O1lIoIO o1lIoIO = this;
/* 10 */            IOOOiI0 iOOOiI0 = (IOOOiI0) oi1ol0llI.I00iiI;
/* 12 */            int[] iArr = o1lIoIO.I00000oIO;
/* 14 */            int length = iArr.length;
/* 15 */            int i4 = 1048575;
/* 18 */            int i5 = 1048575;
/* 19 */            int i6 = 0;
/* 20 */            int i7 = 0;
/* 21 */            while (i6 < length) {
/* 23 */                int iI00IlilI0i0i = o1lIoIO.I00IlilI0i0i(i6);
/* 27 */                int i8 = iArr[i6];
/* 29 */                int iI00IioO0OiOi = I00IioO0OiOi(iI00IlilI0i0i);
/* 35 */                Unsafe unsafe = I000oI1ioi;
/* 37 */                if (iI00IioO0OiOi <= 17) {
/* 41 */                    int i9 = iArr[i6 + 2];
/* 43 */                    i = 1;
/* 45 */                    int i10 = i9 & i4;
/* 47 */                    if (i10 != i5) {
/* 54 */                        i7 = i10 == i4 ? 0 : unsafe.getInt(obj, i10);
/* 59 */                        i5 = i10;
                            }
/* 62 */                    int i11 = 1 << (i9 >>> 20);
/* 66 */                    i2 = iI00IlilI0i0i;
/* 67 */                    i3 = i11;
                        } else {
/* 70 */                    i = 1;
/* 72 */                    i2 = iI00IlilI0i0i;
/* 73 */                    i3 = 0;
                        }
/* 74 */                long j = i2 & i4;
                        switch (iI00IioO0OiOi) {
                            case 0:
/* 1442 */                      if (o1lIoIO.I000oI1ioi(obj, i6, i5, i7, i3)) {
/* 1446 */                          double dI0000Il00O = Ooil1O.I0000Il00O.I0000Il00O(j, obj);
/* 1450 */                          iOOOiI0.getClass();
/* 1457 */                          iOOOiI0.I0010o(i8, Double.doubleToRawLongBits(dI0000Il00O));
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
/* 1417 */                      if (o1lIoIO.I000oI1ioi(obj, i6, i5, i7, i3)) {
/* 1421 */                          float fI0000O = Ooil1O.I0000Il00O.I0000O(j, obj);
/* 1425 */                          iOOOiI0.getClass();
/* 1432 */                          iOOOiI0.I00100o1O0lo(i8, Float.floatToRawIntBits(fI0000O));
                                }
/* 1164 */                      o1lIoIO = this;
                                break;
                            case 2:
/* 1401 */                      if (o1lIoIO.I000oI1ioi(obj, i6, i5, i7, i3)) {
/* 1407 */                          iOOOiI0.I001lloI(i8, unsafe.getLong(obj, j));
                                }
/* 1164 */                      o1lIoIO = this;
                                break;
                            case 3:
/* 1385 */                      if (o1lIoIO.I000oI1ioi(obj, i6, i5, i7, i3)) {
/* 1391 */                          iOOOiI0.I001lloI(i8, unsafe.getLong(obj, j));
                                }
/* 1164 */                      o1lIoIO = this;
                                break;
                            case 4:
/* 1369 */                      if (o1lIoIO.I000oI1ioi(obj, i6, i5, i7, i3)) {
/* 1375 */                          iOOOiI0.I001IIilI0O(i8, unsafe.getInt(obj, j));
                                }
/* 1164 */                      o1lIoIO = this;
                                break;
                            case 5:
/* 1353 */                      if (o1lIoIO.I000oI1ioi(obj, i6, i5, i7, i3)) {
/* 1359 */                          iOOOiI0.I0010o(i8, unsafe.getLong(obj, j));
                                }
/* 1164 */                      o1lIoIO = this;
                                break;
                            case 6:
/* 1337 */                      if (o1lIoIO.I000oI1ioi(obj, i6, i5, i7, i3)) {
/* 1343 */                          iOOOiI0.I00100o1O0lo(i8, unsafe.getInt(obj, j));
                                }
/* 1164 */                      o1lIoIO = this;
                                break;
                            case 7:
/* 1319 */                      if (o1lIoIO.I000oI1ioi(obj, i6, i5, i7, i3)) {
/* 1327 */                          iOOOiI0.I000o00OoI0I(i8, Ooil1O.I0000Il00O.I00000oIO(j, obj));
                                }
/* 1164 */                      o1lIoIO = this;
                                break;
                            case 8:
/* 1290 */                      if (o1lIoIO.I000oI1ioi(obj, i6, i5, i7, i3)) {
/* 1292 */                          Object object = unsafe.getObject(obj, j);
/* 1298 */                          if (object instanceof String) {
/* 1302 */                              iOOOiI0.I001i1lo1io(i8, (String) object);
                                    } else {
/* 1309 */                              iOOOiI0.I000oI1ioi(i8, (IIO1i00loOo) object);
                                    }
                                }
/* 1164 */                      o1lIoIO = this;
                                break;
                            case 9:
/* 1270 */                      if (o1lIoIO.I000oI1ioi(obj, i6, i5, i7, i3)) {
/* 1280 */                          oi1ol0llI.I000oI1ioi(i8, unsafe.getObject(obj, j), o1lIoIO.I000lI(i6));
                                    break;
                                } else {
                                    break;
                                }
                            case 10:
/* 1253 */                      if (o1lIoIO.I000oI1ioi(obj, i6, i5, i7, i3)) {
/* 1261 */                          iOOOiI0.I000oI1ioi(i8, (IIO1i00loOo) unsafe.getObject(obj, j));
                                }
/* 1164 */                      o1lIoIO = this;
                                break;
                            case 11:
/* 1238 */                      if (o1lIoIO.I000oI1ioi(obj, i6, i5, i7, i3)) {
/* 1244 */                          iOOOiI0.I001lIiIIo1O(i8, unsafe.getInt(obj, j));
                                }
/* 1164 */                      o1lIoIO = this;
                                break;
                            case 12:
/* 1223 */                      if (o1lIoIO.I000oI1ioi(obj, i6, i5, i7, i3)) {
/* 1229 */                          iOOOiI0.I001IIilI0O(i8, unsafe.getInt(obj, j));
                                }
/* 1164 */                      o1lIoIO = this;
                                break;
                            case 13:
/* 1208 */                      if (o1lIoIO.I000oI1ioi(obj, i6, i5, i7, i3)) {
/* 1214 */                          iOOOiI0.I00100o1O0lo(i8, unsafe.getInt(obj, j));
                                }
/* 1164 */                      o1lIoIO = this;
                                break;
                            case 14:
/* 1193 */                      if (o1lIoIO.I000oI1ioi(obj, i6, i5, i7, i3)) {
/* 1199 */                          iOOOiI0.I0010o(i8, unsafe.getLong(obj, j));
                                }
/* 1164 */                      o1lIoIO = this;
                                break;
                            case 15:
/* 1173 */                      if (o1lIoIO.I000oI1ioi(obj, i6, i5, i7, i3)) {
/* 1175 */                          int i12 = unsafe.getInt(obj, j);
/* 1184 */                          iOOOiI0.I001lIiIIo1O(i8, (i12 >> 31) ^ (i12 << 1));
                                }
/* 1164 */                      o1lIoIO = this;
                                break;
                            case 16:
/* 1148 */                      if (o1lIoIO.I000oI1ioi(obj, i6, i5, i7, i3)) {
/* 1150 */                          long j2 = unsafe.getLong(obj, j);
/* 1161 */                          iOOOiI0.I001lloI(i8, (j2 >> 63) ^ (j2 << 1));
                                }
/* 1164 */                      o1lIoIO = this;
                                break;
                            case 17:
/* 1119 */                      if (o1lIoIO.I000oI1ioi(obj, i6, i5, i7, i3)) {
/* 1121 */                          Object object2 = unsafe.getObject(obj, j);
/* 1131 */                          iOOOiI0.I001l0I00(i8, 3);
/* 1134 */                          o1lIoIO.I000lI(i6).I0001Ioi1lo((I01IlIoOI) object2, oi1ol0llI);
/* 1138 */                          iOOOiI0.I001l0I00(i8, 4);
                                    break;
                                } else {
                                    break;
                                }
                            case PoseLandmark.RIGHT_PINKY:
/* 1109 */                      OiOO0oO1Io.I000o00OoI0I(iArr[i6], (List) unsafe.getObject(obj, j), oi1ol0llI, false);
                                break;
                            case PoseLandmark.LEFT_INDEX:
/* 1095 */                      OiOO0oO1Io.I0010I0i(iArr[i6], (List) unsafe.getObject(obj, j), oi1ol0llI, false);
                                break;
                            case PoseLandmark.RIGHT_INDEX:
/* 1081 */                      OiOO0oO1Io.I00111O(iArr[i6], (List) unsafe.getObject(obj, j), oi1ol0llI, false);
                                break;
                            case PoseLandmark.LEFT_THUMB:
/* 1067 */                      OiOO0oO1Io.I001l0I00(iArr[i6], (List) unsafe.getObject(obj, j), oi1ol0llI, false);
                                break;
                            case PoseLandmark.RIGHT_THUMB:
/* 1053 */                      OiOO0oO1Io.I0010o(iArr[i6], (List) unsafe.getObject(obj, j), oi1ol0llI, false);
                                break;
                            case PoseLandmark.LEFT_HIP:
/* 1039 */                      OiOO0oO1Io.I00100o1O0lo(iArr[i6], (List) unsafe.getObject(obj, j), oi1ol0llI, false);
                                break;
                            case PoseLandmark.RIGHT_HIP:
/* 1025 */                      OiOO0oO1Io.I00100l0(iArr[i6], (List) unsafe.getObject(obj, j), oi1ol0llI, false);
                                break;
                            case PoseLandmark.LEFT_KNEE:
/* 1011 */                      OiOO0oO1Io.I000lI(iArr[i6], (List) unsafe.getObject(obj, j), oi1ol0llI, false);
                                break;
                            case PoseLandmark.RIGHT_KNEE:
/* 929 */                       int i13 = iArr[i6];
/* 935 */                       List list = (List) unsafe.getObject(obj, j);
/* 937 */                       Class cls = OiOO0oO1Io.I00000oIO;
/* 939 */                       if (list != null && !list.isEmpty()) {
/* 949 */                           if (list instanceof O0o1l10iOII) {
/* 952 */                               O0o1l10iOII o0o1l10iOII = (O0o1l10iOII) list;
/* 959 */                               for (int i14 = 0; i14 < list.size(); i14++) {
/* 961 */                                   Object objI000II = o0o1l10iOII.I000II();
/* 967 */                                   if (objI000II instanceof String) {
/* 971 */                                       iOOOiI0.I001i1lo1io(i13, (String) objI000II);
                                            } else {
/* 977 */                                       iOOOiI0.I000oI1ioi(i13, (IIO1i00loOo) objI000II);
                                            }
                                        }
                                    } else {
/* 988 */                               for (int i15 = 0; i15 < list.size(); i15++) {
/* 996 */                                   iOOOiI0.I001i1lo1io(i13, (String) list.get(i15));
                                        }
                                    }
                                }
                                break;
                            case 27:
/* 890 */                       int i16 = iArr[i6];
/* 896 */                       List list2 = (List) unsafe.getObject(obj, j);
/* 898 */                       OiOIl0 oiOIl0I000lI = o1lIoIO.I000lI(i6);
/* 902 */                       Class cls2 = OiOO0oO1Io.I00000oIO;
/* 904 */                       if (list2 != null && !list2.isEmpty()) {
/* 917 */                           for (int i17 = 0; i17 < list2.size(); i17++) {
/* 923 */                               oi1ol0llI.I000oI1ioi(i16, list2.get(i17), oiOIl0I000lI);
                                    }
                                }
                                break;
                            case PoseLandmark.RIGHT_ANKLE:
/* 853 */                       int i18 = iArr[i6];
/* 859 */                       List list3 = (List) unsafe.getObject(obj, j);
/* 861 */                       Class cls3 = OiOO0oO1Io.I00000oIO;
/* 863 */                       if (list3 != null && !list3.isEmpty()) {
/* 876 */                           for (int i19 = 0; i19 < list3.size(); i19++) {
/* 884 */                               iOOOiI0.I000oI1ioi(i18, (IIO1i00loOo) list3.get(i19));
                                    }
                                }
                                break;
                            case PoseLandmark.LEFT_HEEL:
/* 840 */                       z = false;
/* 849 */                       OiOO0oO1Io.I001iOo1i0O(iArr[i6], (List) unsafe.getObject(obj, j), oi1ol0llI, false);
                                break;
                            case 30:
/* 827 */                       z = false;
/* 836 */                       OiOO0oO1Io.I000oI1ioi(iArr[i6], (List) unsafe.getObject(obj, j), oi1ol0llI, false);
                                break;
                            case PoseLandmark.LEFT_FOOT_INDEX:
/* 814 */                       z = false;
/* 823 */                       OiOO0oO1Io.I001IIilI0O(iArr[i6], (List) unsafe.getObject(obj, j), oi1ol0llI, false);
                                break;
                            case 32:
/* 801 */                       z = false;
/* 810 */                       OiOO0oO1Io.I001IO000(iArr[i6], (List) unsafe.getObject(obj, j), oi1ol0llI, false);
                                break;
                            case 33:
/* 788 */                       z = false;
/* 797 */                       OiOO0oO1Io.I001i1O0Ol(iArr[i6], (List) unsafe.getObject(obj, j), oi1ol0llI, false);
                                break;
                            case 34:
/* 781 */                       z = false;
/* 782 */                       OiOO0oO1Io.I001i1lo1io(iArr[i6], (List) unsafe.getObject(obj, j), oi1ol0llI, false);
                                break;
                            case InputImage.IMAGE_FORMAT_YUV_420_888:
/* 768 */                       OiOO0oO1Io.I000o00OoI0I(iArr[i6], (List) unsafe.getObject(obj, j), oi1ol0llI, i == true ? 1 : 0);
                                break;
                            case 36:
/* 753 */                       OiOO0oO1Io.I0010I0i(iArr[i6], (List) unsafe.getObject(obj, j), oi1ol0llI, i == true ? 1 : 0);
                                break;
                            case 37:
/* 738 */                       OiOO0oO1Io.I00111O(iArr[i6], (List) unsafe.getObject(obj, j), oi1ol0llI, i == true ? 1 : 0);
                                break;
                            case 38:
/* 723 */                       OiOO0oO1Io.I001l0I00(iArr[i6], (List) unsafe.getObject(obj, j), oi1ol0llI, i == true ? 1 : 0);
                                break;
                            case 39:
/* 708 */                       OiOO0oO1Io.I0010o(iArr[i6], (List) unsafe.getObject(obj, j), oi1ol0llI, i == true ? 1 : 0);
                                break;
                            case 40:
/* 693 */                       OiOO0oO1Io.I00100o1O0lo(iArr[i6], (List) unsafe.getObject(obj, j), oi1ol0llI, i == true ? 1 : 0);
                                break;
                            case 41:
/* 678 */                       OiOO0oO1Io.I00100l0(iArr[i6], (List) unsafe.getObject(obj, j), oi1ol0llI, i == true ? 1 : 0);
                                break;
                            case 42:
/* 663 */                       OiOO0oO1Io.I000lI(iArr[i6], (List) unsafe.getObject(obj, j), oi1ol0llI, i == true ? 1 : 0);
                                break;
                            case 43:
/* 648 */                       OiOO0oO1Io.I001iOo1i0O(iArr[i6], (List) unsafe.getObject(obj, j), oi1ol0llI, i == true ? 1 : 0);
                                break;
                            case 44:
/* 633 */                       OiOO0oO1Io.I000oI1ioi(iArr[i6], (List) unsafe.getObject(obj, j), oi1ol0llI, i == true ? 1 : 0);
                                break;
                            case BuildConfig.VERSION_CODE:
/* 618 */                       OiOO0oO1Io.I001IIilI0O(iArr[i6], (List) unsafe.getObject(obj, j), oi1ol0llI, i == true ? 1 : 0);
                                break;
                            case 46:
/* 603 */                       OiOO0oO1Io.I001IO000(iArr[i6], (List) unsafe.getObject(obj, j), oi1ol0llI, i == true ? 1 : 0);
                                break;
                            case 47:
/* 588 */                       OiOO0oO1Io.I001i1O0Ol(iArr[i6], (List) unsafe.getObject(obj, j), oi1ol0llI, i == true ? 1 : 0);
                                break;
                            case 48:
/* 573 */                       OiOO0oO1Io.I001i1lo1io(iArr[i6], (List) unsafe.getObject(obj, j), oi1ol0llI, true);
                                break;
                            case 49:
/* 516 */                       int i20 = iArr[i6];
/* 522 */                       List list4 = (List) unsafe.getObject(obj, j);
/* 524 */                       OiOIl0 oiOIl0I000lI2 = o1lIoIO.I000lI(i6);
/* 528 */                       Class cls4 = OiOO0oO1Io.I00000oIO;
/* 530 */                       if (list4 != null && !list4.isEmpty()) {
/* 543 */                           for (int i21 = 0; i21 < list4.size(); i21++) {
/* 549 */                               I01IlIoOI i01IlIoOI = (I01IlIoOI) list4.get(i21);
/* 551 */                               iOOOiI0.I001l0I00(i20, 3);
/* 554 */                               oiOIl0I000lI2.I0001Ioi1lo(i01IlIoOI, oi1ol0llI);
/* 558 */                               iOOOiI0.I001l0I00(i20, 4);
                                    }
                                }
                                break;
                            case 50:
/* 422 */                       Object object3 = unsafe.getObject(obj, j);
/* 426 */                       O1Oi111oiiI o1Oi111oiiI = o1lIoIO.I000lI;
/* 428 */                       if (object3 != null) {
/* 434 */                           int i22 = 2;
/* 436 */                           Object obj2 = o1lIoIO.I00000oOI[(i6 / 3) * 2];
/* 438 */                           o1Oi111oiiI.getClass();
/* 443 */                           IOO000ilo iOO000ilo = ((O1OOiOlO0) obj2).I00000oIO;
/* 447 */                           iOOOiI0.getClass();
/* 462 */                           for (Map.Entry entry : ((O1OOo11I1O1) object3).entrySet()) {
/* 470 */                               iOOOiI0.I001l0I00(i8, i22);
/* 485 */                               iOOOiI0.I001lllioOl(O1OOiOlO0.I00000oIO(iOO000ilo, entry.getKey(), entry.getValue()));
/* 488 */                               Object key = entry.getKey();
/* 492 */                               Object value = entry.getValue();
/* 502 */                               IlIO0OIoo.I00000oOI(iOOOiI0, (i011I10o1IlI) iOO000ilo.I00iiI, i, key);
/* 509 */                               i22 = 2;
/* 510 */                               IlIO0OIoo.I00000oOI(iOOOiI0, (i011I10o1IlI) iOO000ilo.I00iiO, 2, value);
/* 513 */                               i = 1;
                                    }
                                }
                                break;
                            case 51:
/* 398 */                       if (o1lIoIO.I00100o1O0lo(obj, i8, i6)) {
/* 406 */                           double dDoubleValue = ((Double) Ooil1O.I000OOo1O(j, obj)).doubleValue();
/* 410 */                           iOOOiI0.getClass();
/* 417 */                           iOOOiI0.I0010o(i8, Double.doubleToRawLongBits(dDoubleValue));
                                }
                                break;
                            case 52:
/* 370 */                       if (o1lIoIO.I00100o1O0lo(obj, i8, i6)) {
/* 378 */                           float fFloatValue = ((Float) Ooil1O.I000OOo1O(j, obj)).floatValue();
/* 382 */                           iOOOiI0.getClass();
/* 389 */                           iOOOiI0.I00100o1O0lo(i8, Float.floatToRawIntBits(fFloatValue));
                                }
                                break;
                            case 53:
/* 355 */                       if (o1lIoIO.I00100o1O0lo(obj, i8, i6)) {
/* 361 */                           iOOOiI0.I001lloI(i8, I001l0I00(j, obj));
                                }
                                break;
                            case 54:
/* 340 */                       if (o1lIoIO.I00100o1O0lo(obj, i8, i6)) {
/* 346 */                           iOOOiI0.I001lloI(i8, I001l0I00(j, obj));
                                }
                                break;
                            case 55:
/* 325 */                       if (o1lIoIO.I00100o1O0lo(obj, i8, i6)) {
/* 331 */                           iOOOiI0.I001IIilI0O(i8, I001iOo1i0O(j, obj));
                                }
                                break;
                            case 56:
/* 310 */                       if (o1lIoIO.I00100o1O0lo(obj, i8, i6)) {
/* 316 */                           iOOOiI0.I0010o(i8, I001l0I00(j, obj));
                                }
                                break;
                            case 57:
/* 295 */                       if (o1lIoIO.I00100o1O0lo(obj, i8, i6)) {
/* 301 */                           iOOOiI0.I00100o1O0lo(i8, I001iOo1i0O(j, obj));
                                }
                                break;
                            case 58:
/* 274 */                       if (o1lIoIO.I00100o1O0lo(obj, i8, i6)) {
/* 286 */                           iOOOiI0.I000o00OoI0I(i8, ((Boolean) Ooil1O.I000OOo1O(j, obj)).booleanValue());
                                }
                                break;
                            case 59:
/* 246 */                       if (o1lIoIO.I00100o1O0lo(obj, i8, i6)) {
/* 248 */                           Object object4 = unsafe.getObject(obj, j);
/* 254 */                           if (object4 instanceof String) {
/* 258 */                               iOOOiI0.I001i1lo1io(i8, (String) object4);
                                    } else {
/* 265 */                               iOOOiI0.I000oI1ioi(i8, (IIO1i00loOo) object4);
                                    }
                                }
                                break;
                            case 60:
/* 227 */                       if (o1lIoIO.I00100o1O0lo(obj, i8, i6)) {
/* 237 */                           oi1ol0llI.I000oI1ioi(i8, unsafe.getObject(obj, j), o1lIoIO.I000lI(i6));
                                }
                                break;
                            case 61:
/* 210 */                       if (o1lIoIO.I00100o1O0lo(obj, i8, i6)) {
/* 218 */                           iOOOiI0.I000oI1ioi(i8, (IIO1i00loOo) unsafe.getObject(obj, j));
                                }
                                break;
                            case 62:
/* 196 */                       if (o1lIoIO.I00100o1O0lo(obj, i8, i6)) {
/* 202 */                           iOOOiI0.I001lIiIIo1O(i8, I001iOo1i0O(j, obj));
                                }
                                break;
                            case 63:
/* 182 */                       if (o1lIoIO.I00100o1O0lo(obj, i8, i6)) {
/* 188 */                           iOOOiI0.I001IIilI0O(i8, I001iOo1i0O(j, obj));
                                }
                                break;
                            case Barcode.FORMAT_EAN_8:
/* 168 */                       if (o1lIoIO.I00100o1O0lo(obj, i8, i6)) {
/* 174 */                           iOOOiI0.I00100o1O0lo(i8, I001iOo1i0O(j, obj));
                                }
                                break;
                            case 65:
/* 154 */                       if (o1lIoIO.I00100o1O0lo(obj, i8, i6)) {
/* 160 */                           iOOOiI0.I0010o(i8, I001l0I00(j, obj));
                                }
                                break;
                            case 66:
/* 135 */                       if (o1lIoIO.I00100o1O0lo(obj, i8, i6)) {
/* 137 */                           int iI001iOo1i0O = I001iOo1i0O(j, obj);
/* 146 */                           iOOOiI0.I001lIiIIo1O(i8, (iI001iOo1i0O >> 31) ^ (iI001iOo1i0O << 1));
                                }
                                break;
                            case 67:
/* 116 */                       if (o1lIoIO.I00100o1O0lo(obj, i8, i6)) {
/* 118 */                           long jI001l0I00 = I001l0I00(j, obj);
/* 127 */                           iOOOiI0.I001lloI(i8, (jI001l0I00 >> 63) ^ (jI001l0I00 << (i == true ? 1L : 0L)));
                                }
                                break;
                            case 68:
/* 89 */                        if (o1lIoIO.I00100o1O0lo(obj, i8, i6)) {
/* 91 */                            Object object5 = unsafe.getObject(obj, j);
/* 101 */                           iOOOiI0.I001l0I00(i8, 3);
/* 104 */                           o1lIoIO.I000lI(i6).I0001Ioi1lo((I01IlIoOI) object5, oi1ol0llI);
/* 108 */                           iOOOiI0.I001l0I00(i8, 4);
                                }
                                break;
                        }
/* 1460 */              i6 += 3;
/* 1462 */              i4 = 1048575;
                    }
/* 1469 */          o1lIoIO.I000l1.getClass();
/* 1477 */          ((Io00Ol1o10O) obj).unknownFields.I0000O(oi1ol0llI);
                }

                /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I000II(Io00Ol1o10O io00Ol1o10O, Io00Ol1o10O io00Ol1o10O2) {
/* 1 */             OoiO0oOll0oO ooiO0oOll0oO = this.I000l1;
/* 3 */             int[] iArr = this.I00000oIO;
/* 5 */             int length = iArr.length;
/* 7 */             int i = 0;
                    while (true) {
/* 11 */                boolean zI000l1 = true;
/* 12 */                if (i < length) {
/* 14 */                    int iI00IlilI0i0i = I00IlilI0i0i(i);
/* 18 */                    int iI00IioO0OiOi = I00IioO0OiOi(iI00IlilI0i0i);
/* 24 */                    if (iI00IioO0OiOi <= 50 || iI00IioO0OiOi >= 69) {
/* 32 */                        long j = iI00IlilI0i0i & 1048575;
                                switch (iI00IioO0OiOi) {
                                    case 0:
/* 446 */                               if (I000OiO(io00Ol1o10O, io00Ol1o10O2, i)) {
/* 448 */                                   Ooil0oIOI0l0 ooil0oIOI0l0 = Ooil1O.I0000Il00O;
/* 468 */                                   if (Double.doubleToLongBits(ooil0oIOI0l0.I0000Il00O(j, io00Ol1o10O)) != Double.doubleToLongBits(ooil0oIOI0l0.I0000Il00O(j, io00Ol1o10O2))) {
                                            }
                                        }
/* 71 */                                zI000l1 = false;
                                        break;
                                    case 1:
/* 419 */                               if (I000OiO(io00Ol1o10O, io00Ol1o10O2, i)) {
/* 421 */                                   Ooil0oIOI0l0 ooil0oIOI0l02 = Ooil1O.I0000Il00O;
/* 439 */                                   if (Float.floatToIntBits(ooil0oIOI0l02.I0000O(j, io00Ol1o10O)) != Float.floatToIntBits(ooil0oIOI0l02.I0000O(j, io00Ol1o10O2))) {
                                            }
                                        }
/* 71 */                                zI000l1 = false;
                                        break;
                                    case 2:
/* 400 */                               if (!I000OiO(io00Ol1o10O, io00Ol1o10O2, i) || Ooil1O.I000O01llI0(j, io00Ol1o10O) != Ooil1O.I000O01llI0(j, io00Ol1o10O2)) {
/* 71 */                                    zI000l1 = false;
                                            break;
                                        }
                                        break;
                                    case 3:
/* 381 */                               if (!I000OiO(io00Ol1o10O, io00Ol1o10O2, i) || Ooil1O.I000O01llI0(j, io00Ol1o10O) != Ooil1O.I000O01llI0(j, io00Ol1o10O2)) {
                                        }
                                        break;
                                    case 4:
/* 364 */                               if (!I000OiO(io00Ol1o10O, io00Ol1o10O2, i) || Ooil1O.I000II(j, io00Ol1o10O) != Ooil1O.I000II(j, io00Ol1o10O2)) {
                                        }
                                        break;
                                    case 5:
/* 344 */                               if (!I000OiO(io00Ol1o10O, io00Ol1o10O2, i) || Ooil1O.I000O01llI0(j, io00Ol1o10O) != Ooil1O.I000O01llI0(j, io00Ol1o10O2)) {
                                        }
                                        break;
                                    case 6:
/* 326 */                               if (!I000OiO(io00Ol1o10O, io00Ol1o10O2, i) || Ooil1O.I000II(j, io00Ol1o10O) != Ooil1O.I000II(j, io00Ol1o10O2)) {
                                        }
                                        break;
                                    case 7:
/* 306 */                               if (I000OiO(io00Ol1o10O, io00Ol1o10O2, i)) {
/* 308 */                                   Ooil0oIOI0l0 ooil0oIOI0l03 = Ooil1O.I0000Il00O;
/* 318 */                                   if (ooil0oIOI0l03.I00000oIO(j, io00Ol1o10O) != ooil0oIOI0l03.I00000oIO(j, io00Ol1o10O2)) {
                                            }
                                        }
/* 71 */                                zI000l1 = false;
                                        break;
                                    case 8:
/* 284 */                               if (!I000OiO(io00Ol1o10O, io00Ol1o10O2, i) || !OiOO0oO1Io.I000l1(Ooil1O.I000OOo1O(j, io00Ol1o10O), Ooil1O.I000OOo1O(j, io00Ol1o10O2))) {
                                        }
                                        break;
                                    case 9:
/* 262 */                               if (!I000OiO(io00Ol1o10O, io00Ol1o10O2, i) || !OiOO0oO1Io.I000l1(Ooil1O.I000OOo1O(j, io00Ol1o10O), Ooil1O.I000OOo1O(j, io00Ol1o10O2))) {
                                        }
                                        break;
                                    case 10:
/* 240 */                               if (!I000OiO(io00Ol1o10O, io00Ol1o10O2, i) || !OiOO0oO1Io.I000l1(Ooil1O.I000OOo1O(j, io00Ol1o10O), Ooil1O.I000OOo1O(j, io00Ol1o10O2))) {
                                        }
                                        break;
                                    case 11:
/* 222 */                               if (!I000OiO(io00Ol1o10O, io00Ol1o10O2, i) || Ooil1O.I000II(j, io00Ol1o10O) != Ooil1O.I000II(j, io00Ol1o10O2)) {
                                        }
                                        break;
                                    case 12:
/* 204 */                               if (!I000OiO(io00Ol1o10O, io00Ol1o10O2, i) || Ooil1O.I000II(j, io00Ol1o10O) != Ooil1O.I000II(j, io00Ol1o10O2)) {
                                        }
                                        break;
                                    case 13:
/* 186 */                               if (!I000OiO(io00Ol1o10O, io00Ol1o10O2, i) || Ooil1O.I000II(j, io00Ol1o10O) != Ooil1O.I000II(j, io00Ol1o10O2)) {
                                        }
                                        break;
                                    case 14:
/* 166 */                               if (!I000OiO(io00Ol1o10O, io00Ol1o10O2, i) || Ooil1O.I000O01llI0(j, io00Ol1o10O) != Ooil1O.I000O01llI0(j, io00Ol1o10O2)) {
                                        }
                                        break;
                                    case 15:
/* 148 */                               if (!I000OiO(io00Ol1o10O, io00Ol1o10O2, i) || Ooil1O.I000II(j, io00Ol1o10O) != Ooil1O.I000II(j, io00Ol1o10O2)) {
                                        }
                                        break;
                                    case 16:
/* 128 */                               if (!I000OiO(io00Ol1o10O, io00Ol1o10O2, i) || Ooil1O.I000O01llI0(j, io00Ol1o10O) != Ooil1O.I000O01llI0(j, io00Ol1o10O2)) {
                                        }
                                        break;
                                    case 17:
/* 106 */                               if (!I000OiO(io00Ol1o10O, io00Ol1o10O2, i) || !OiOO0oO1Io.I000l1(Ooil1O.I000OOo1O(j, io00Ol1o10O), Ooil1O.I000OOo1O(j, io00Ol1o10O2))) {
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
/* 96 */                                zI000l1 = OiOO0oO1Io.I000l1(Ooil1O.I000OOo1O(j, io00Ol1o10O), Ooil1O.I000OOo1O(j, io00Ol1o10O2));
                                        break;
                                    case 50:
/* 82 */                                zI000l1 = OiOO0oO1Io.I000l1(Ooil1O.I000OOo1O(j, io00Ol1o10O), Ooil1O.I000OOo1O(j, io00Ol1o10O2));
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
/* 43 */                                long j2 = 1048575 & iArr[i + 2];
/* 53 */                                if (Ooil1O.I000II(j2, io00Ol1o10O) != Ooil1O.I000II(j2, io00Ol1o10O2) || !OiOO0oO1Io.I000l1(Ooil1O.I000OOo1O(j, io00Ol1o10O), Ooil1O.I000OOo1O(j, io00Ol1o10O2))) {
                                        }
                                        break;
                                }
/* 470 */                       if (!zI000l1) {
                                }
                            }
/* 473 */                   i += 3;
                        } else {
/* 477 */                   int i2 = this.I000OOo1O;
                            while (true) {
/* 479 */                       int[] iArr2 = this.I000II;
/* 482 */                       if (i2 < iArr2.length) {
/* 484 */                           int i3 = iArr2[i2];
/* 490 */                           long j3 = iArr[i3 + 2] & 1048575;
/* 500 */                           if (Ooil1O.I000II(j3, io00Ol1o10O) != Ooil1O.I000II(j3, io00Ol1o10O2)) {
/* 6 */                                 return false;
                                    }
/* 506 */                           if (!I00100o1O0lo(io00Ol1o10O, 0, i3)) {
/* 513 */                               long jI00IlilI0i0i = I00IlilI0i0i(i3) & 1048575;
/* 527 */                               if (!OiOO0oO1Io.I000l1(Ooil1O.I000OOo1O(jI00IlilI0i0i, io00Ol1o10O), Ooil1O.I000OOo1O(jI00IlilI0i0i, io00Ol1o10O2))) {
                                        }
                                    }
/* 530 */                           i2++;
                                } else {
/* 534 */                           ooiO0oOll0oO.getClass();
/* 545 */                           if (io00Ol1o10O.unknownFields.equals(io00Ol1o10O2.unknownFields)) {
/* 11 */                                return true;
                                    }
                                }
                            }
                        }
                    }
/* 6 */             return false;
                }

                @Override
                public final int I000O01llI0(Io00Ol1o10O io00Ol1o10O) {
                    int i;
                    int iI00000oIO;
/* 3 */             int length = this.I00000oIO.length;
/* 6 */             int iHashCode = 0;
/* 10 */            for (int i2 = 0; i2 < length; i2 += 3) {
/* 12 */                int iI00IlilI0i0i = I00IlilI0i0i(i2);
/* 16 */                int iI00IioO0OiOi = I00IioO0OiOi(iI00IlilI0i0i);
/* 22 */                if (iI00IioO0OiOi <= 50 || iI00IioO0OiOi >= 69) {
/* 30 */                    long j = 1048575 & iI00IlilI0i0i;
/* 32 */                    int iHashCode2 = 37;
                            switch (iI00IioO0OiOi) {
                                case 0:
/* 248 */                           i = iHashCode * 53;
/* 260 */                           iI00000oIO = Iool1iioooil.I00000oIO(Double.doubleToLongBits(Ooil1O.I0000Il00O.I0000Il00O(j, io00Ol1o10O)));
/* 49 */                            iHashCode = i + iI00000oIO;
                                    break;
                                case 1:
/* 234 */                           i = iHashCode * 53;
/* 242 */                           iI00000oIO = Float.floatToIntBits(Ooil1O.I0000Il00O.I0000O(j, io00Ol1o10O));
/* 49 */                            iHashCode = i + iI00000oIO;
                                    break;
                                case 2:
/* 222 */                           i = iHashCode * 53;
/* 228 */                           iI00000oIO = Iool1iioooil.I00000oIO(Ooil1O.I000O01llI0(j, io00Ol1o10O));
/* 49 */                            iHashCode = i + iI00000oIO;
                                    break;
                                case 3:
/* 210 */                           i = iHashCode * 53;
/* 216 */                           iI00000oIO = Iool1iioooil.I00000oIO(Ooil1O.I000O01llI0(j, io00Ol1o10O));
/* 49 */                            iHashCode = i + iI00000oIO;
                                    break;
                                case 4:
/* 202 */                           i = iHashCode * 53;
/* 204 */                           iI00000oIO = Ooil1O.I000II(j, io00Ol1o10O);
/* 49 */                            iHashCode = i + iI00000oIO;
                                    break;
                                case 5:
/* 190 */                           i = iHashCode * 53;
/* 196 */                           iI00000oIO = Iool1iioooil.I00000oIO(Ooil1O.I000O01llI0(j, io00Ol1o10O));
/* 49 */                            iHashCode = i + iI00000oIO;
                                    break;
                                case 6:
/* 182 */                           i = iHashCode * 53;
/* 184 */                           iI00000oIO = Ooil1O.I000II(j, io00Ol1o10O);
/* 49 */                            iHashCode = i + iI00000oIO;
                                    break;
                                case 7:
/* 163 */                           int i3 = iHashCode * 53;
/* 167 */                           boolean zI00000oIO = Ooil1O.I0000Il00O.I00000oIO(j, io00Ol1o10O);
/* 171 */                           byte[] bArr = Iool1iioooil.I00000oIO;
/* 180 */                           iHashCode = i3 + (zI00000oIO ? 1231 : 1237);
                                    break;
                                case 8:
/* 150 */                           i = iHashCode * 53;
/* 158 */                           iI00000oIO = ((String) Ooil1O.I000OOo1O(j, io00Ol1o10O)).hashCode();
/* 49 */                            iHashCode = i + iI00000oIO;
                                    break;
                                case 9:
/* 139 */                           Object objI000OOo1O = Ooil1O.I000OOo1O(j, io00Ol1o10O);
/* 143 */                           if (objI000OOo1O != null) {
/* 145 */                               iHashCode2 = objI000OOo1O.hashCode();
                                    }
/* 75 */                            iHashCode = (iHashCode * 53) + iHashCode2;
                                    break;
                                case 10:
/* 128 */                           i = iHashCode * 53;
/* 134 */                           iI00000oIO = Ooil1O.I000OOo1O(j, io00Ol1o10O).hashCode();
/* 49 */                            iHashCode = i + iI00000oIO;
                                    break;
                                case 11:
/* 121 */                           i = iHashCode * 53;
/* 123 */                           iI00000oIO = Ooil1O.I000II(j, io00Ol1o10O);
/* 49 */                            iHashCode = i + iI00000oIO;
                                    break;
                                case 12:
/* 114 */                           i = iHashCode * 53;
/* 116 */                           iI00000oIO = Ooil1O.I000II(j, io00Ol1o10O);
/* 49 */                            iHashCode = i + iI00000oIO;
                                    break;
                                case 13:
/* 107 */                           i = iHashCode * 53;
/* 109 */                           iI00000oIO = Ooil1O.I000II(j, io00Ol1o10O);
/* 49 */                            iHashCode = i + iI00000oIO;
                                    break;
                                case 14:
/* 96 */                            i = iHashCode * 53;
/* 102 */                           iI00000oIO = Iool1iioooil.I00000oIO(Ooil1O.I000O01llI0(j, io00Ol1o10O));
/* 49 */                            iHashCode = i + iI00000oIO;
                                    break;
                                case 15:
/* 89 */                            i = iHashCode * 53;
/* 91 */                            iI00000oIO = Ooil1O.I000II(j, io00Ol1o10O);
/* 49 */                            iHashCode = i + iI00000oIO;
                                    break;
                                case 16:
/* 78 */                            i = iHashCode * 53;
/* 84 */                            iI00000oIO = Iool1iioooil.I00000oIO(Ooil1O.I000O01llI0(j, io00Ol1o10O));
/* 49 */                            iHashCode = i + iI00000oIO;
                                    break;
                                case 17:
/* 63 */                            Object objI000OOo1O2 = Ooil1O.I000OOo1O(j, io00Ol1o10O);
/* 67 */                            if (objI000OOo1O2 != null) {
/* 69 */                                iHashCode2 = objI000OOo1O2.hashCode();
                                    }
/* 75 */                            iHashCode = (iHashCode * 53) + iHashCode2;
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
/* 52 */                            i = iHashCode * 53;
/* 58 */                            iI00000oIO = Ooil1O.I000OOo1O(j, io00Ol1o10O).hashCode();
/* 49 */                            iHashCode = i + iI00000oIO;
                                    break;
                                case 50:
/* 39 */                            i = iHashCode * 53;
/* 45 */                            iI00000oIO = Ooil1O.I000OOo1O(j, io00Ol1o10O).hashCode();
/* 49 */                            iHashCode = i + iI00000oIO;
                                    break;
                            }
                        }
                    }
/* 270 */           int i4 = this.I000OOo1O;
                    while (true) {
/* 272 */               int[] iArr = this.I000II;
/* 275 */               if (i4 >= iArr.length) {
/* 311 */                   this.I000l1.getClass();
/* 320 */                   return io00Ol1o10O.unknownFields.hashCode() + (iHashCode * 53);
                        }
/* 283 */               if (!I00100o1O0lo(io00Ol1o10O, 0, iArr[i4])) {
/* 302 */                   iHashCode = Ooil1O.I000OOo1O(I00IlilI0i0i(r2) & 1048575, io00Ol1o10O).hashCode() + (iHashCode * 53);
                        }
/* 304 */               i4++;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:157:0x082c A[Catch: all -> 0x0509, TryCatch #5 {all -> 0x0509, blocks: (B:155:0x0827, B:157:0x082c, B:158:0x0831, B:113:0x0504, B:116:0x050c, B:117:0x0524, B:118:0x053c, B:119:0x0554, B:120:0x056c, B:121:0x0584, B:122:0x059c, B:123:0x05b4, B:124:0x05cc, B:125:0x05f4, B:126:0x0615, B:127:0x0636, B:128:0x0656, B:129:0x0677, B:130:0x069b, B:131:0x06bc, B:132:0x06d5, B:133:0x06fd, B:134:0x070e, B:135:0x0731, B:136:0x0752, B:137:0x0772, B:138:0x0793, B:139:0x07b4, B:140:0x07d5, B:141:0x07f7, B:147:0x0818), top: B:179:0x0827 }] */
                /* JADX WARN: Removed duplicated region for block: B:169:0x0856 A[LOOP:3: B:168:0x0854->B:169:0x0856, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:171:0x0860  */
                /* JADX WARN: Removed duplicated region for block: B:206:0x0838 A[SYNTHETIC] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I000OOo1O(Object obj, IOOOi1 iOOOi1, Il1llOool il1llOool) throws Throwable {
                    O1lIoIO o1lIoIO;
                    int i;
                    int i2;
                    O10I0l0OO o10I0l0OO;
                    IOOOi1 iOOOi12;
                    Il1llOool il1llOool2;
                    int iI00IioO0OiOi;
                    Unsafe unsafe;
/* 1 */             O1lIoIO o1lIoIO2 = this;
/* 3 */             Object obj2 = obj;
/* 5 */             IOOOi1 iOOOi13 = iOOOi1;
/* 7 */             Il1llOool il1llOool3 = il1llOool;
/* 9 */             byte[] bArr = Iool1iioooil.I00000oIO;
/* 11 */            il1llOool3.getClass();
/* 18 */            if (!I00100l0(obj2)) {
/* 2156 */              IioIoO10iOiI.I000OiO("Mutating immutable message: ", obj2);
/* 2159 */              return;
                    }
/* 20 */            OoiO0oOll0oO ooiO0oOll0oO = o1lIoIO2.I000l1;
/* 22 */            int[] iArr = o1lIoIO2.I000II;
/* 24 */            int i3 = o1lIoIO2.I000OOo1O;
/* 26 */            int i4 = o1lIoIO2.I000O01llI0;
/* 28 */            O10I0l0OO o10I0l0OO2 = o1lIoIO2.I000iOII;
/* 31 */            OoiO0IO0il ooiO0IO0ilI00000oIO = null;
                    while (true) {
                        try {
/* 32 */                    int iI0000O = iOOOi13.I0000O();
/* 36 */                    int iI001lIiIIo1O = o1lIoIO2.I001lIiIIo1O(iI0000O);
/* 41 */                    if (iI001lIiIIo1O >= 0) {
/* 107 */                       int iI00IlilI0i0i = o1lIoIO2.I00IlilI0i0i(iI001lIiIIo1O);
                                try {
/* 111 */                           iI00IioO0OiOi = I00IioO0OiOi(iI00IlilI0i0i);
/* 118 */                           unsafe = I000oI1ioi;
                                } catch (O000lI0 unused) {
/* 135 */                           o1lIoIO = o1lIoIO2;
/* 136 */                           i = i4;
/* 138 */                           o10I0l0OO = o10I0l0OO2;
                                }
                                switch (iI00IioO0OiOi) {
                                    case 0:
/* 2042 */                              i = i4;
/* 2044 */                              o10I0l0OO = o10I0l0OO2;
/* 2046 */                              o1lIoIO = o1lIoIO2;
/* 2047 */                              iOOOi12 = iOOOi13;
/* 2048 */                              il1llOool2 = il1llOool3;
/* 2049 */                              long jI001i1lo1io = I001i1lo1io(iI00IlilI0i0i);
/* 2053 */                              iOOOi12.I00ilI0I1(1);
                                        try {
                                        } catch (O000lI0 unused2) {
/* 2086 */                                  obj2 = obj;
                                        } catch (Throwable th) {
/* 2082 */                                  th = th;
/* 2083 */                                  obj2 = obj;
                                        }
                                        try {
/* 2069 */                                  Ooil1O.I0000Il00O.I000II(obj, jI001i1lo1io, ((IOOOIO1O) iOOOi12.I0000oI00).I000O01llI0());
/* 2072 */                                  obj2 = obj;
/* 2073 */                                  o1lIoIO.I00IO1oi11O(iI001lIiIIo1O, obj2);
                                        } catch (O000lI0 unused3) {
/* 2080 */                                  obj2 = obj;
                                            try {
/* 2088 */                                      ooiO0oOll0oO.getClass();
/* 2091 */                                      if (ooiO0IO0ilI00000oIO == null) {
                                                }
/* 2103 */                                      if (!OoiO0oOll0oO.I00000oOI(0, iOOOi12, ooiO0IO0ilI00000oIO)) {
                                                }
/* 2122 */                                      o1lIoIO2 = o1lIoIO;
/* 2123 */                                      iOOOi13 = iOOOi12;
/* 2124 */                                      il1llOool3 = il1llOool2;
/* 2125 */                                      i4 = i;
/* 2127 */                                      o10I0l0OO2 = o10I0l0OO;
                                            } catch (Throwable th2) {
/* 1290 */                                      th = th2;
/* 2133 */                                      while (i2 < i3) {
                                                }
/* 2143 */                                      if (ooiO0IO0ilI00000oIO != null) {
                                                }
/* 2153 */                                      throw th;
                                            }
                                        } catch (Throwable th3) {
/* 2077 */                                  th = th3;
/* 2078 */                                  obj2 = obj;
/* 2133 */                                  while (i2 < i3) {
                                            }
/* 2143 */                                  if (ooiO0IO0ilI00000oIO != null) {
                                            }
/* 2153 */                                  throw th;
                                        }
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                        break;
                                    case 1:
/* 2008 */                              i = i4;
/* 2010 */                              o10I0l0OO = o10I0l0OO2;
/* 2012 */                              o1lIoIO = o1lIoIO2;
/* 2013 */                              iOOOi12 = iOOOi13;
/* 2014 */                              il1llOool2 = il1llOool3;
/* 2015 */                              long jI001i1lo1io2 = I001i1lo1io(iI00IlilI0i0i);
/* 2020 */                              iOOOi12.I00ilI0I1(5);
/* 2033 */                              Ooil1O.I0000Il00O.I000O01llI0(obj2, jI001i1lo1io2, ((IOOOIO1O) iOOOi12.I0000oI00).I000l1());
/* 2036 */                              o1lIoIO.I00IO1oi11O(iI001lIiIIo1O, obj2);
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case 2:
/* 1975 */                              i = i4;
/* 1977 */                              o10I0l0OO = o10I0l0OO2;
/* 1979 */                              o1lIoIO = o1lIoIO2;
/* 1980 */                              iOOOi12 = iOOOi13;
/* 1981 */                              il1llOool2 = il1llOool3;
/* 1982 */                              long jI001i1lo1io3 = I001i1lo1io(iI00IlilI0i0i);
/* 1987 */                              iOOOi12.I00ilI0I1(0);
/* 1998 */                              Ooil1O.I00100l0(obj2, jI001i1lo1io3, ((IOOOIO1O) iOOOi12.I0000oI00).I000o00OoI0I());
/* 2001 */                              o1lIoIO.I00IO1oi11O(iI001lIiIIo1O, obj2);
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case 3:
/* 1942 */                              i = i4;
/* 1944 */                              o10I0l0OO = o10I0l0OO2;
/* 1946 */                              o1lIoIO = o1lIoIO2;
/* 1947 */                              iOOOi12 = iOOOi13;
/* 1948 */                              il1llOool2 = il1llOool3;
/* 1949 */                              long jI001i1lo1io4 = I001i1lo1io(iI00IlilI0i0i);
/* 1954 */                              iOOOi12.I00ilI0I1(0);
/* 1965 */                              Ooil1O.I00100l0(obj2, jI001i1lo1io4, ((IOOOIO1O) iOOOi12.I0000oI00).I001i1O0Ol());
/* 1968 */                              o1lIoIO.I00IO1oi11O(iI001lIiIIo1O, obj2);
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case 4:
/* 1909 */                              i = i4;
/* 1911 */                              o10I0l0OO = o10I0l0OO2;
/* 1913 */                              o1lIoIO = o1lIoIO2;
/* 1914 */                              iOOOi12 = iOOOi13;
/* 1915 */                              il1llOool2 = il1llOool3;
/* 1916 */                              long jI001i1lo1io5 = I001i1lo1io(iI00IlilI0i0i);
/* 1921 */                              iOOOi12.I00ilI0I1(0);
/* 1932 */                              Ooil1O.I000oI1ioi(obj2, ((IOOOIO1O) iOOOi12.I0000oI00).I000lI(), jI001i1lo1io5);
/* 1935 */                              o1lIoIO.I00IO1oi11O(iI001lIiIIo1O, obj2);
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case 5:
/* 1877 */                              i = i4;
/* 1879 */                              o10I0l0OO = o10I0l0OO2;
/* 1881 */                              o1lIoIO = o1lIoIO2;
/* 1882 */                              iOOOi12 = iOOOi13;
/* 1883 */                              il1llOool2 = il1llOool3;
/* 1884 */                              long jI001i1lo1io6 = I001i1lo1io(iI00IlilI0i0i);
/* 1888 */                              iOOOi12.I00ilI0I1(1);
/* 1899 */                              Ooil1O.I00100l0(obj2, jI001i1lo1io6, ((IOOOIO1O) iOOOi12.I0000oI00).I000iOII());
/* 1902 */                              o1lIoIO.I00IO1oi11O(iI001lIiIIo1O, obj2);
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case 6:
/* 1844 */                              i = i4;
/* 1846 */                              o10I0l0OO = o10I0l0OO2;
/* 1848 */                              o1lIoIO = o1lIoIO2;
/* 1849 */                              iOOOi12 = iOOOi13;
/* 1850 */                              il1llOool2 = il1llOool3;
/* 1851 */                              long jI001i1lo1io7 = I001i1lo1io(iI00IlilI0i0i);
/* 1856 */                              iOOOi12.I00ilI0I1(5);
/* 1867 */                              Ooil1O.I000oI1ioi(obj2, ((IOOOIO1O) iOOOi12.I0000oI00).I000OiO(), jI001i1lo1io7);
/* 1870 */                              o1lIoIO.I00IO1oi11O(iI001lIiIIo1O, obj2);
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case 7:
/* 1809 */                              i = i4;
/* 1811 */                              o10I0l0OO = o10I0l0OO2;
/* 1813 */                              o1lIoIO = o1lIoIO2;
/* 1814 */                              iOOOi12 = iOOOi13;
/* 1815 */                              il1llOool2 = il1llOool3;
/* 1816 */                              long jI001i1lo1io8 = I001i1lo1io(iI00IlilI0i0i);
/* 1821 */                              iOOOi12.I00ilI0I1(0);
/* 1834 */                              Ooil1O.I0000Il00O.I0000oI00(obj2, jI001i1lo1io8, ((IOOOIO1O) iOOOi12.I0000oI00).I0001Ioi1lo());
/* 1837 */                              o1lIoIO.I00IO1oi11O(iI001lIiIIo1O, obj2);
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case 8:
/* 1792 */                              i = i4;
/* 1794 */                              o10I0l0OO = o10I0l0OO2;
/* 1796 */                              o1lIoIO = o1lIoIO2;
/* 1797 */                              iOOOi12 = iOOOi13;
/* 1798 */                              il1llOool2 = il1llOool3;
/* 1799 */                              o1lIoIO.I00II0Ol1O0l(iI00IlilI0i0i, iOOOi12, obj2);
/* 1802 */                              o1lIoIO.I00IO1oi11O(iI001lIiIIo1O, obj2);
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case 9:
/* 1750 */                              o1lIoIO = o1lIoIO2;
/* 1752 */                              i = i4;
/* 1754 */                              o10I0l0OO = o10I0l0OO2;
/* 1756 */                              iOOOi12 = iOOOi13;
/* 1757 */                              il1llOool2 = il1llOool3;
/* 1762 */                              I01IlIoOI i01IlIoOI = (I01IlIoOI) o1lIoIO.I001IIilI0O(iI001lIiIIo1O, obj2);
/* 1764 */                              OiOIl0 oiOIl0I000lI = o1lIoIO.I000lI(iI001lIiIIo1O);
/* 1769 */                              iOOOi12.I00ilI0I1(2);
/* 1772 */                              iOOOi12.I000iOII(i01IlIoOI, oiOIl0I000lI, il1llOool2);
/* 1782 */                              unsafe.putObject(obj2, o1lIoIO.I00IlilI0i0i(iI001lIiIIo1O) & 1048575, i01IlIoOI);
/* 1785 */                              o1lIoIO.I00IO1oi11O(iI001lIiIIo1O, obj2);
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case 10:
/* 1727 */                              i = i4;
/* 1729 */                              o10I0l0OO = o10I0l0OO2;
/* 1731 */                              o1lIoIO = o1lIoIO2;
/* 1732 */                              iOOOi12 = iOOOi13;
/* 1733 */                              il1llOool2 = il1llOool3;
/* 1742 */                              Ooil1O.I00100o1O0lo(obj2, I001i1lo1io(iI00IlilI0i0i), iOOOi12.I00100l0());
/* 1745 */                              o1lIoIO.I00IO1oi11O(iI001lIiIIo1O, obj2);
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case 11:
/* 1694 */                              i = i4;
/* 1696 */                              o10I0l0OO = o10I0l0OO2;
/* 1698 */                              o1lIoIO = o1lIoIO2;
/* 1699 */                              iOOOi12 = iOOOi13;
/* 1700 */                              il1llOool2 = il1llOool3;
/* 1701 */                              long jI001i1lo1io9 = I001i1lo1io(iI00IlilI0i0i);
/* 1706 */                              iOOOi12.I00ilI0I1(0);
/* 1717 */                              Ooil1O.I000oI1ioi(obj2, ((IOOOIO1O) iOOOi12.I0000oI00).I001IO000(), jI001i1lo1io9);
/* 1720 */                              o1lIoIO.I00IO1oi11O(iI001lIiIIo1O, obj2);
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case 12:
/* 1658 */                              i = i4;
/* 1660 */                              o10I0l0OO = o10I0l0OO2;
/* 1663 */                              o1lIoIO = o1lIoIO2;
/* 1664 */                              iOOOi12 = iOOOi13;
/* 1665 */                              il1llOool2 = il1llOool3;
/* 1666 */                              iOOOi12.I00ilI0I1(0);
/* 1673 */                              int iI000OOo1O = ((IOOOIO1O) iOOOi12.I0000oI00).I000OOo1O();
/* 1677 */                              o1lIoIO.I000l1(iI001lIiIIo1O);
/* 1684 */                              Ooil1O.I000oI1ioi(obj2, iI000OOo1O, I001i1lo1io(iI00IlilI0i0i));
/* 1687 */                              o1lIoIO.I00IO1oi11O(iI001lIiIIo1O, obj2);
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case 13:
/* 1625 */                              i = i4;
/* 1627 */                              o10I0l0OO = o10I0l0OO2;
/* 1629 */                              o1lIoIO = o1lIoIO2;
/* 1630 */                              iOOOi12 = iOOOi13;
/* 1631 */                              il1llOool2 = il1llOool3;
/* 1632 */                              long jI001i1lo1io10 = I001i1lo1io(iI00IlilI0i0i);
/* 1637 */                              iOOOi12.I00ilI0I1(5);
/* 1648 */                              Ooil1O.I000oI1ioi(obj2, ((IOOOIO1O) iOOOi12.I0000oI00).I000oI1ioi(), jI001i1lo1io10);
/* 1651 */                              o1lIoIO.I00IO1oi11O(iI001lIiIIo1O, obj2);
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case 14:
/* 1593 */                              i = i4;
/* 1595 */                              o10I0l0OO = o10I0l0OO2;
/* 1597 */                              o1lIoIO = o1lIoIO2;
/* 1598 */                              iOOOi12 = iOOOi13;
/* 1599 */                              il1llOool2 = il1llOool3;
/* 1600 */                              long jI001i1lo1io11 = I001i1lo1io(iI00IlilI0i0i);
/* 1604 */                              iOOOi12.I00ilI0I1(1);
/* 1615 */                              Ooil1O.I00100l0(obj2, jI001i1lo1io11, ((IOOOIO1O) iOOOi12.I0000oI00).I00100l0());
/* 1618 */                              o1lIoIO.I00IO1oi11O(iI001lIiIIo1O, obj2);
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case 15:
/* 1560 */                              i = i4;
/* 1562 */                              o10I0l0OO = o10I0l0OO2;
/* 1564 */                              o1lIoIO = o1lIoIO2;
/* 1565 */                              iOOOi12 = iOOOi13;
/* 1566 */                              il1llOool2 = il1llOool3;
/* 1567 */                              long jI001i1lo1io12 = I001i1lo1io(iI00IlilI0i0i);
/* 1572 */                              iOOOi12.I00ilI0I1(0);
/* 1583 */                              Ooil1O.I000oI1ioi(obj2, ((IOOOIO1O) iOOOi12.I0000oI00).I00100o1O0lo(), jI001i1lo1io12);
/* 1586 */                              o1lIoIO.I00IO1oi11O(iI001lIiIIo1O, obj2);
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case 16:
/* 1527 */                              i = i4;
/* 1529 */                              o10I0l0OO = o10I0l0OO2;
/* 1531 */                              o1lIoIO = o1lIoIO2;
/* 1532 */                              iOOOi12 = iOOOi13;
/* 1533 */                              il1llOool2 = il1llOool3;
/* 1534 */                              long jI001i1lo1io13 = I001i1lo1io(iI00IlilI0i0i);
/* 1539 */                              iOOOi12.I00ilI0I1(0);
/* 1550 */                              Ooil1O.I00100l0(obj2, jI001i1lo1io13, ((IOOOIO1O) iOOOi12.I0000oI00).I0010I0i());
/* 1553 */                              o1lIoIO.I00IO1oi11O(iI001lIiIIo1O, obj2);
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case 17:
/* 1485 */                              o1lIoIO = o1lIoIO2;
/* 1487 */                              i = i4;
/* 1489 */                              o10I0l0OO = o10I0l0OO2;
/* 1491 */                              iOOOi12 = iOOOi13;
/* 1492 */                              il1llOool2 = il1llOool3;
/* 1497 */                              I01IlIoOI i01IlIoOI2 = (I01IlIoOI) o1lIoIO.I001IIilI0O(iI001lIiIIo1O, obj2);
/* 1499 */                              OiOIl0 oiOIl0I000lI2 = o1lIoIO.I000lI(iI001lIiIIo1O);
/* 1504 */                              iOOOi12.I00ilI0I1(3);
/* 1507 */                              iOOOi12.I000O01llI0(i01IlIoOI2, oiOIl0I000lI2, il1llOool2);
/* 1517 */                              unsafe.putObject(obj2, o1lIoIO.I00IlilI0i0i(iI001lIiIIo1O) & 1048575, i01IlIoOI2);
/* 1520 */                              o1lIoIO.I00IO1oi11O(iI001lIiIIo1O, obj2);
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case PoseLandmark.RIGHT_PINKY:
/* 1462 */                              i = i4;
/* 1464 */                              o10I0l0OO = o10I0l0OO2;
/* 1466 */                              o1lIoIO = o1lIoIO2;
/* 1467 */                              iOOOi12 = iOOOi13;
/* 1468 */                              il1llOool2 = il1llOool3;
/* 1469 */                              long jI001i1lo1io14 = I001i1lo1io(iI00IlilI0i0i);
/* 1473 */                              o10I0l0OO.getClass();
/* 1480 */                              iOOOi12.I001IO000(O10I0l0OO.I00000oIO(jI001i1lo1io14, obj2));
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case PoseLandmark.LEFT_INDEX:
/* 1438 */                              i = i4;
/* 1440 */                              o10I0l0OO = o10I0l0OO2;
/* 1442 */                              o1lIoIO = o1lIoIO2;
/* 1443 */                              iOOOi12 = iOOOi13;
/* 1444 */                              il1llOool2 = il1llOool3;
/* 1445 */                              long jI001i1lo1io15 = I001i1lo1io(iI00IlilI0i0i);
/* 1449 */                              o10I0l0OO.getClass();
/* 1456 */                              iOOOi12.I00IlilI0i0i(O10I0l0OO.I00000oIO(jI001i1lo1io15, obj2));
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case PoseLandmark.RIGHT_INDEX:
/* 1414 */                              i = i4;
/* 1416 */                              o10I0l0OO = o10I0l0OO2;
/* 1418 */                              o1lIoIO = o1lIoIO2;
/* 1419 */                              iOOOi12 = iOOOi13;
/* 1420 */                              il1llOool2 = il1llOool3;
/* 1421 */                              long jI001i1lo1io16 = I001i1lo1io(iI00IlilI0i0i);
/* 1425 */                              o10I0l0OO.getClass();
/* 1432 */                              iOOOi12.I00Iooi00oi(O10I0l0OO.I00000oIO(jI001i1lo1io16, obj2));
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case PoseLandmark.LEFT_THUMB:
/* 1390 */                              i = i4;
/* 1392 */                              o10I0l0OO = o10I0l0OO2;
/* 1394 */                              o1lIoIO = o1lIoIO2;
/* 1395 */                              iOOOi12 = iOOOi13;
/* 1396 */                              il1llOool2 = il1llOool3;
/* 1397 */                              long jI001i1lo1io17 = I001i1lo1io(iI00IlilI0i0i);
/* 1401 */                              o10I0l0OO.getClass();
/* 1408 */                              iOOOi12.I00iOIl(O10I0l0OO.I00000oIO(jI001i1lo1io17, obj2));
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case PoseLandmark.RIGHT_THUMB:
/* 1366 */                              i = i4;
/* 1368 */                              o10I0l0OO = o10I0l0OO2;
/* 1370 */                              o1lIoIO = o1lIoIO2;
/* 1371 */                              iOOOi12 = iOOOi13;
/* 1372 */                              il1llOool2 = il1llOool3;
/* 1373 */                              long jI001i1lo1io18 = I001i1lo1io(iI00IlilI0i0i);
/* 1377 */                              o10I0l0OO.getClass();
/* 1384 */                              iOOOi12.I00IoIO0lI(O10I0l0OO.I00000oIO(jI001i1lo1io18, obj2));
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case PoseLandmark.LEFT_HIP:
/* 1342 */                              i = i4;
/* 1344 */                              o10I0l0OO = o10I0l0OO2;
/* 1346 */                              o1lIoIO = o1lIoIO2;
/* 1347 */                              iOOOi12 = iOOOi13;
/* 1348 */                              il1llOool2 = il1llOool3;
/* 1349 */                              long jI001i1lo1io19 = I001i1lo1io(iI00IlilI0i0i);
/* 1353 */                              o10I0l0OO.getClass();
/* 1360 */                              iOOOi12.I00IO1oi11O(O10I0l0OO.I00000oIO(jI001i1lo1io19, obj2));
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case PoseLandmark.RIGHT_HIP:
/* 1318 */                              i = i4;
/* 1320 */                              o10I0l0OO = o10I0l0OO2;
/* 1322 */                              o1lIoIO = o1lIoIO2;
/* 1323 */                              iOOOi12 = iOOOi13;
/* 1324 */                              il1llOool2 = il1llOool3;
/* 1325 */                              long jI001i1lo1io20 = I001i1lo1io(iI00IlilI0i0i);
/* 1329 */                              o10I0l0OO.getClass();
/* 1336 */                              iOOOi12.I00II0Ol1O0l(O10I0l0OO.I00000oIO(jI001i1lo1io20, obj2));
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case PoseLandmark.LEFT_KNEE:
/* 1294 */                              i = i4;
/* 1296 */                              o10I0l0OO = o10I0l0OO2;
/* 1298 */                              o1lIoIO = o1lIoIO2;
/* 1299 */                              iOOOi12 = iOOOi13;
/* 1300 */                              il1llOool2 = il1llOool3;
/* 1301 */                              long jI001i1lo1io21 = I001i1lo1io(iI00IlilI0i0i);
/* 1305 */                              o10I0l0OO.getClass();
/* 1312 */                              iOOOi12.I000lI(O10I0l0OO.I00000oIO(jI001i1lo1io21, obj2));
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case PoseLandmark.RIGHT_KNEE:
/* 1278 */                              i = i4;
/* 1280 */                              o10I0l0OO = o10I0l0OO2;
/* 1282 */                              o1lIoIO = o1lIoIO2;
/* 1283 */                              iOOOi12 = iOOOi13;
/* 1284 */                              il1llOool2 = il1llOool3;
                                        try {
/* 1285 */                                  o1lIoIO.I00II0oii1o(iI00IlilI0i0i, iOOOi12, obj2);
                                        } catch (O000lI0 unused4) {
/* 2088 */                                  ooiO0oOll0oO.getClass();
/* 2091 */                                  if (ooiO0IO0ilI00000oIO == null) {
                                            }
/* 2103 */                                  if (!OoiO0oOll0oO.I00000oOI(0, iOOOi12, ooiO0IO0ilI00000oIO)) {
                                            }
/* 2122 */                                  o1lIoIO2 = o1lIoIO;
/* 2123 */                                  iOOOi13 = iOOOi12;
/* 2124 */                                  il1llOool3 = il1llOool2;
/* 2125 */                                  i4 = i;
/* 2127 */                                  o10I0l0OO2 = o10I0l0OO;
                                        }
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                        break;
                                    case 27:
/* 1254 */                              i = i4;
/* 1256 */                              o10I0l0OO = o10I0l0OO2;
                                        try {
/* 1265 */                                  o1lIoIO2.I001lloI(obj2, iI00IlilI0i0i, iOOOi13, o1lIoIO2.I000lI(iI001lIiIIo1O), il1llOool);
/* 1268 */                                  iOOOi12 = iOOOi13;
/* 1269 */                                  il1llOool2 = il1llOool;
/* 1270 */                                  o1lIoIO = o1lIoIO2;
                                        } catch (O000lI0 unused5) {
/* 1273 */                                  iOOOi12 = iOOOi13;
/* 1274 */                                  il1llOool2 = il1llOool;
/* 780 */                                   o1lIoIO = o1lIoIO2;
/* 2088 */                                  ooiO0oOll0oO.getClass();
/* 2091 */                                  if (ooiO0IO0ilI00000oIO == null) {
                                            }
/* 2103 */                                  if (!OoiO0oOll0oO.I00000oOI(0, iOOOi12, ooiO0IO0ilI00000oIO)) {
                                            }
/* 2122 */                                  o1lIoIO2 = o1lIoIO;
/* 2123 */                                  iOOOi13 = iOOOi12;
/* 2124 */                                  il1llOool3 = il1llOool2;
/* 2125 */                                  i4 = i;
/* 2127 */                                  o10I0l0OO2 = o10I0l0OO;
                                        }
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                        break;
                                    case PoseLandmark.RIGHT_ANKLE:
/* 1233 */                              i = i4;
/* 1235 */                              o10I0l0OO = o10I0l0OO2;
/* 1237 */                              long jI001i1lo1io22 = I001i1lo1io(iI00IlilI0i0i);
/* 1241 */                              o10I0l0OO.getClass();
/* 1248 */                              iOOOi13.I0010o(O10I0l0OO.I00000oIO(jI001i1lo1io22, obj2));
/* 806 */                               il1llOool2 = il1llOool;
/* 808 */                               o1lIoIO = o1lIoIO2;
/* 809 */                               iOOOi12 = iOOOi13;
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case PoseLandmark.LEFT_HEEL:
/* 1213 */                              i = i4;
/* 1215 */                              o10I0l0OO = o10I0l0OO2;
/* 1217 */                              long jI001i1lo1io23 = I001i1lo1io(iI00IlilI0i0i);
/* 1221 */                              o10I0l0OO.getClass();
/* 1228 */                              iOOOi13.I00i0oil(O10I0l0OO.I00000oIO(jI001i1lo1io23, obj2));
/* 806 */                               il1llOool2 = il1llOool;
/* 808 */                               o1lIoIO = o1lIoIO2;
/* 809 */                               iOOOi12 = iOOOi13;
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case 30:
/* 1187 */                              i = i4;
/* 1189 */                              o10I0l0OO = o10I0l0OO2;
/* 1191 */                              long jI001i1lo1io24 = I001i1lo1io(iI00IlilI0i0i);
/* 1195 */                              o10I0l0OO.getClass();
/* 1198 */                              Iool1IOO1o0i iool1IOO1o0iI00000oIO = O10I0l0OO.I00000oIO(jI001i1lo1io24, obj2);
/* 1202 */                              iOOOi13.I001iOo1i0O(iool1IOO1o0iI00000oIO);
/* 1205 */                              o1lIoIO2.I000l1(iI001lIiIIo1O);
/* 1208 */                              OiOO0oO1Io.I000OiO(obj2, iI0000O, iool1IOO1o0iI00000oIO, ooiO0IO0ilI00000oIO, ooiO0oOll0oO);
/* 806 */                               il1llOool2 = il1llOool;
/* 808 */                               o1lIoIO = o1lIoIO2;
/* 809 */                               iOOOi12 = iOOOi13;
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case PoseLandmark.LEFT_FOOT_INDEX:
/* 1166 */                              i = i4;
/* 1168 */                              o10I0l0OO = o10I0l0OO2;
/* 1170 */                              long jI001i1lo1io25 = I001i1lo1io(iI00IlilI0i0i);
/* 1174 */                              o10I0l0OO.getClass();
/* 1181 */                              iOOOi13.I00O10llo(O10I0l0OO.I00000oIO(jI001i1lo1io25, obj2));
/* 806 */                               il1llOool2 = il1llOool;
/* 808 */                               o1lIoIO = o1lIoIO2;
/* 809 */                               iOOOi12 = iOOOi13;
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case 32:
/* 1146 */                              i = i4;
/* 1148 */                              o10I0l0OO = o10I0l0OO2;
/* 1150 */                              long jI001i1lo1io26 = I001i1lo1io(iI00IlilI0i0i);
/* 1154 */                              o10I0l0OO.getClass();
/* 1161 */                              iOOOi13.I00OIl(O10I0l0OO.I00000oIO(jI001i1lo1io26, obj2));
/* 806 */                               il1llOool2 = il1llOool;
/* 808 */                               o1lIoIO = o1lIoIO2;
/* 809 */                               iOOOi12 = iOOOi13;
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case 33:
/* 1126 */                              i = i4;
/* 1128 */                              o10I0l0OO = o10I0l0OO2;
/* 1130 */                              long jI001i1lo1io27 = I001i1lo1io(iI00IlilI0i0i);
/* 1134 */                              o10I0l0OO.getClass();
/* 1141 */                              iOOOi13.I00OilO00Il(O10I0l0OO.I00000oIO(jI001i1lo1io27, obj2));
/* 806 */                               il1llOool2 = il1llOool;
/* 808 */                               o1lIoIO = o1lIoIO2;
/* 809 */                               iOOOi12 = iOOOi13;
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case 34:
/* 1106 */                              i = i4;
/* 1108 */                              o10I0l0OO = o10I0l0OO2;
/* 1110 */                              long jI001i1lo1io28 = I001i1lo1io(iI00IlilI0i0i);
/* 1114 */                              o10I0l0OO.getClass();
/* 1121 */                              iOOOi13.I00Ol10(O10I0l0OO.I00000oIO(jI001i1lo1io28, obj2));
/* 806 */                               il1llOool2 = il1llOool;
/* 808 */                               o1lIoIO = o1lIoIO2;
/* 809 */                               iOOOi12 = iOOOi13;
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case InputImage.IMAGE_FORMAT_YUV_420_888:
/* 1086 */                              i = i4;
/* 1088 */                              o10I0l0OO = o10I0l0OO2;
/* 1090 */                              long jI001i1lo1io29 = I001i1lo1io(iI00IlilI0i0i);
/* 1094 */                              o10I0l0OO.getClass();
/* 1101 */                              iOOOi13.I001IO000(O10I0l0OO.I00000oIO(jI001i1lo1io29, obj2));
/* 806 */                               il1llOool2 = il1llOool;
/* 808 */                               o1lIoIO = o1lIoIO2;
/* 809 */                               iOOOi12 = iOOOi13;
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case 36:
/* 1066 */                              i = i4;
/* 1068 */                              o10I0l0OO = o10I0l0OO2;
/* 1070 */                              long jI001i1lo1io30 = I001i1lo1io(iI00IlilI0i0i);
/* 1074 */                              o10I0l0OO.getClass();
/* 1081 */                              iOOOi13.I00IlilI0i0i(O10I0l0OO.I00000oIO(jI001i1lo1io30, obj2));
/* 806 */                               il1llOool2 = il1llOool;
/* 808 */                               o1lIoIO = o1lIoIO2;
/* 809 */                               iOOOi12 = iOOOi13;
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case 37:
/* 1046 */                              i = i4;
/* 1048 */                              o10I0l0OO = o10I0l0OO2;
/* 1050 */                              long jI001i1lo1io31 = I001i1lo1io(iI00IlilI0i0i);
/* 1054 */                              o10I0l0OO.getClass();
/* 1061 */                              iOOOi13.I00Iooi00oi(O10I0l0OO.I00000oIO(jI001i1lo1io31, obj2));
/* 806 */                               il1llOool2 = il1llOool;
/* 808 */                               o1lIoIO = o1lIoIO2;
/* 809 */                               iOOOi12 = iOOOi13;
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case 38:
/* 1026 */                              i = i4;
/* 1028 */                              o10I0l0OO = o10I0l0OO2;
/* 1030 */                              long jI001i1lo1io32 = I001i1lo1io(iI00IlilI0i0i);
/* 1034 */                              o10I0l0OO.getClass();
/* 1041 */                              iOOOi13.I00iOIl(O10I0l0OO.I00000oIO(jI001i1lo1io32, obj2));
/* 806 */                               il1llOool2 = il1llOool;
/* 808 */                               o1lIoIO = o1lIoIO2;
/* 809 */                               iOOOi12 = iOOOi13;
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case 39:
/* 1006 */                              i = i4;
/* 1008 */                              o10I0l0OO = o10I0l0OO2;
/* 1010 */                              long jI001i1lo1io33 = I001i1lo1io(iI00IlilI0i0i);
/* 1014 */                              o10I0l0OO.getClass();
/* 1021 */                              iOOOi13.I00IoIO0lI(O10I0l0OO.I00000oIO(jI001i1lo1io33, obj2));
/* 806 */                               il1llOool2 = il1llOool;
/* 808 */                               o1lIoIO = o1lIoIO2;
/* 809 */                               iOOOi12 = iOOOi13;
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case 40:
/* 986 */                               i = i4;
/* 988 */                               o10I0l0OO = o10I0l0OO2;
/* 990 */                               long jI001i1lo1io34 = I001i1lo1io(iI00IlilI0i0i);
/* 994 */                               o10I0l0OO.getClass();
/* 1001 */                              iOOOi13.I00IO1oi11O(O10I0l0OO.I00000oIO(jI001i1lo1io34, obj2));
/* 806 */                               il1llOool2 = il1llOool;
/* 808 */                               o1lIoIO = o1lIoIO2;
/* 809 */                               iOOOi12 = iOOOi13;
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case 41:
/* 966 */                               i = i4;
/* 968 */                               o10I0l0OO = o10I0l0OO2;
/* 970 */                               long jI001i1lo1io35 = I001i1lo1io(iI00IlilI0i0i);
/* 974 */                               o10I0l0OO.getClass();
/* 981 */                               iOOOi13.I00II0Ol1O0l(O10I0l0OO.I00000oIO(jI001i1lo1io35, obj2));
/* 806 */                               il1llOool2 = il1llOool;
/* 808 */                               o1lIoIO = o1lIoIO2;
/* 809 */                               iOOOi12 = iOOOi13;
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case 42:
/* 946 */                               i = i4;
/* 948 */                               o10I0l0OO = o10I0l0OO2;
/* 950 */                               long jI001i1lo1io36 = I001i1lo1io(iI00IlilI0i0i);
/* 954 */                               o10I0l0OO.getClass();
/* 961 */                               iOOOi13.I000lI(O10I0l0OO.I00000oIO(jI001i1lo1io36, obj2));
/* 806 */                               il1llOool2 = il1llOool;
/* 808 */                               o1lIoIO = o1lIoIO2;
/* 809 */                               iOOOi12 = iOOOi13;
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case 43:
/* 926 */                               i = i4;
/* 928 */                               o10I0l0OO = o10I0l0OO2;
/* 930 */                               long jI001i1lo1io37 = I001i1lo1io(iI00IlilI0i0i);
/* 934 */                               o10I0l0OO.getClass();
/* 941 */                               iOOOi13.I00i0oil(O10I0l0OO.I00000oIO(jI001i1lo1io37, obj2));
/* 806 */                               il1llOool2 = il1llOool;
/* 808 */                               o1lIoIO = o1lIoIO2;
/* 809 */                               iOOOi12 = iOOOi13;
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case 44:
/* 901 */                               i = i4;
/* 903 */                               o10I0l0OO = o10I0l0OO2;
/* 905 */                               long jI001i1lo1io38 = I001i1lo1io(iI00IlilI0i0i);
/* 909 */                               o10I0l0OO.getClass();
/* 912 */                               Iool1IOO1o0i iool1IOO1o0iI00000oIO2 = O10I0l0OO.I00000oIO(jI001i1lo1io38, obj2);
/* 916 */                               iOOOi13.I001iOo1i0O(iool1IOO1o0iI00000oIO2);
/* 919 */                               o1lIoIO2.I000l1(iI001lIiIIo1O);
/* 922 */                               OiOO0oO1Io.I000OiO(obj2, iI0000O, iool1IOO1o0iI00000oIO2, ooiO0IO0ilI00000oIO, ooiO0oOll0oO);
/* 806 */                               il1llOool2 = il1llOool;
/* 808 */                               o1lIoIO = o1lIoIO2;
/* 809 */                               iOOOi12 = iOOOi13;
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case BuildConfig.VERSION_CODE:
/* 881 */                               i = i4;
/* 883 */                               o10I0l0OO = o10I0l0OO2;
/* 885 */                               long jI001i1lo1io39 = I001i1lo1io(iI00IlilI0i0i);
/* 889 */                               o10I0l0OO.getClass();
/* 896 */                               iOOOi13.I00O10llo(O10I0l0OO.I00000oIO(jI001i1lo1io39, obj2));
/* 806 */                               il1llOool2 = il1llOool;
/* 808 */                               o1lIoIO = o1lIoIO2;
/* 809 */                               iOOOi12 = iOOOi13;
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case 46:
/* 862 */                               i = i4;
/* 864 */                               o10I0l0OO = o10I0l0OO2;
/* 866 */                               long jI001i1lo1io40 = I001i1lo1io(iI00IlilI0i0i);
/* 870 */                               o10I0l0OO.getClass();
/* 877 */                               iOOOi13.I00OIl(O10I0l0OO.I00000oIO(jI001i1lo1io40, obj2));
/* 806 */                               il1llOool2 = il1llOool;
/* 808 */                               o1lIoIO = o1lIoIO2;
/* 809 */                               iOOOi12 = iOOOi13;
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case 47:
/* 843 */                               i = i4;
/* 845 */                               o10I0l0OO = o10I0l0OO2;
/* 847 */                               long jI001i1lo1io41 = I001i1lo1io(iI00IlilI0i0i);
/* 851 */                               o10I0l0OO.getClass();
/* 858 */                               iOOOi13.I00OilO00Il(O10I0l0OO.I00000oIO(jI001i1lo1io41, obj2));
/* 806 */                               il1llOool2 = il1llOool;
/* 808 */                               o1lIoIO = o1lIoIO2;
/* 809 */                               iOOOi12 = iOOOi13;
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case 48:
/* 818 */                               i = i4;
/* 820 */                               o10I0l0OO = o10I0l0OO2;
                                        try {
/* 822 */                                   long jI001i1lo1io42 = I001i1lo1io(iI00IlilI0i0i);
/* 826 */                                   o10I0l0OO.getClass();
/* 833 */                                   iOOOi13.I00Ol10(O10I0l0OO.I00000oIO(jI001i1lo1io42, obj2));
/* 806 */                                   il1llOool2 = il1llOool;
/* 808 */                                   o1lIoIO = o1lIoIO2;
/* 809 */                                   iOOOi12 = iOOOi13;
                                        } catch (O000lI0 unused6) {
/* 837 */                                   il1llOool2 = il1llOool;
/* 839 */                                   o1lIoIO = o1lIoIO2;
/* 840 */                                   iOOOi12 = iOOOi13;
/* 2088 */                                  ooiO0oOll0oO.getClass();
/* 2091 */                                  if (ooiO0IO0ilI00000oIO == null) {
                                            }
/* 2103 */                                  if (!OoiO0oOll0oO.I00000oOI(0, iOOOi12, ooiO0IO0ilI00000oIO)) {
                                            }
/* 2122 */                                  o1lIoIO2 = o1lIoIO;
/* 2123 */                                  iOOOi13 = iOOOi12;
/* 2124 */                                  il1llOool3 = il1llOool2;
/* 2125 */                                  i4 = i;
/* 2127 */                                  o10I0l0OO2 = o10I0l0OO;
                                        }
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                        break;
                                    case 49:
/* 784 */                               i = i4;
/* 786 */                               o10I0l0OO = o10I0l0OO2;
/* 796 */                               obj2 = obj;
                                        try {
/* 802 */                                   o1lIoIO2.I001lllioOl(obj2, I001i1lo1io(iI00IlilI0i0i), iOOOi1, o1lIoIO2.I000lI(iI001lIiIIo1O), il1llOool);
/* 805 */                                   iOOOi13 = iOOOi1;
/* 806 */                                   il1llOool2 = il1llOool;
/* 808 */                                   o1lIoIO = o1lIoIO2;
/* 809 */                                   iOOOi12 = iOOOi13;
                                        } catch (O000lI0 unused7) {
/* 812 */                                   il1llOool2 = il1llOool;
/* 814 */                                   o1lIoIO = o1lIoIO2;
/* 815 */                                   iOOOi12 = iOOOi1;
/* 2088 */                                  ooiO0oOll0oO.getClass();
/* 2091 */                                  if (ooiO0IO0ilI00000oIO == null) {
                                            }
/* 2103 */                                  if (!OoiO0oOll0oO.I00000oOI(0, iOOOi12, ooiO0IO0ilI00000oIO)) {
                                            }
/* 2122 */                                  o1lIoIO2 = o1lIoIO;
/* 2123 */                                  iOOOi13 = iOOOi12;
/* 2124 */                                  il1llOool3 = il1llOool2;
/* 2125 */                                  i4 = i;
/* 2127 */                                  o10I0l0OO2 = o10I0l0OO;
                                        }
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                        break;
                                    case 50:
/* 741 */                               i = i4;
/* 743 */                               o10I0l0OO = o10I0l0OO2;
                                        try {
/* 757 */                                   o1lIoIO2.I0010I0i(obj2, iI001lIiIIo1O, o1lIoIO2.I00000oOI[(iI001lIiIIo1O / 3) * 2], il1llOool3, iOOOi13);
/* 760 */                                   obj2 = obj;
/* 762 */                                   iOOOi12 = iOOOi1;
/* 764 */                                   il1llOool2 = il1llOool;
/* 766 */                                   o1lIoIO = o1lIoIO2;
                                        } catch (O000lI0 unused8) {
/* 774 */                                   obj2 = obj;
/* 776 */                                   iOOOi12 = iOOOi1;
/* 778 */                                   il1llOool2 = il1llOool;
/* 780 */                                   o1lIoIO = o1lIoIO2;
/* 2088 */                                  ooiO0oOll0oO.getClass();
/* 2091 */                                  if (ooiO0IO0ilI00000oIO == null) {
                                            }
/* 2103 */                                  if (!OoiO0oOll0oO.I00000oOI(0, iOOOi12, ooiO0IO0ilI00000oIO)) {
                                            }
/* 2122 */                                  o1lIoIO2 = o1lIoIO;
/* 2123 */                                  iOOOi13 = iOOOi12;
/* 2124 */                                  il1llOool3 = il1llOool2;
/* 2125 */                                  i4 = i;
/* 2127 */                                  o10I0l0OO2 = o10I0l0OO;
                                        } catch (Throwable th4) {
/* 769 */                                   th = th4;
/* 770 */                                   obj2 = obj;
/* 212 */                                   o1lIoIO = o1lIoIO2;
/* 2133 */                                  while (i2 < i3) {
                                            }
/* 2143 */                                  if (ooiO0IO0ilI00000oIO != null) {
                                            }
/* 2153 */                                  throw th;
                                        }
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                        break;
                                    case 51:
/* 710 */                               i = i4;
/* 712 */                               o10I0l0OO = o10I0l0OO2;
/* 714 */                               long jI001i1lo1io43 = I001i1lo1io(iI00IlilI0i0i);
/* 718 */                               iOOOi13.I00ilI0I1(1);
/* 733 */                               Ooil1O.I00100o1O0lo(obj2, jI001i1lo1io43, Double.valueOf(((IOOOIO1O) iOOOi13.I0000oI00).I000O01llI0()));
/* 736 */                               o1lIoIO2.I00IOO(obj2, iI0000O, iI001lIiIIo1O);
/* 207 */                               o1lIoIO = o1lIoIO2;
/* 208 */                               iOOOi12 = iOOOi13;
/* 209 */                               il1llOool2 = il1llOool3;
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case 52:
/* 678 */                               i = i4;
/* 680 */                               o10I0l0OO = o10I0l0OO2;
/* 682 */                               long jI001i1lo1io44 = I001i1lo1io(iI00IlilI0i0i);
/* 687 */                               iOOOi13.I00ilI0I1(5);
/* 702 */                               Ooil1O.I00100o1O0lo(obj2, jI001i1lo1io44, Float.valueOf(((IOOOIO1O) iOOOi13.I0000oI00).I000l1()));
/* 705 */                               o1lIoIO2.I00IOO(obj2, iI0000O, iI001lIiIIo1O);
/* 207 */                               o1lIoIO = o1lIoIO2;
/* 208 */                               iOOOi12 = iOOOi13;
/* 209 */                               il1llOool2 = il1llOool3;
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case 53:
/* 646 */                               i = i4;
/* 648 */                               o10I0l0OO = o10I0l0OO2;
/* 650 */                               long jI001i1lo1io45 = I001i1lo1io(iI00IlilI0i0i);
/* 655 */                               iOOOi13.I00ilI0I1(0);
/* 670 */                               Ooil1O.I00100o1O0lo(obj2, jI001i1lo1io45, Long.valueOf(((IOOOIO1O) iOOOi13.I0000oI00).I000o00OoI0I()));
/* 673 */                               o1lIoIO2.I00IOO(obj2, iI0000O, iI001lIiIIo1O);
/* 207 */                               o1lIoIO = o1lIoIO2;
/* 208 */                               iOOOi12 = iOOOi13;
/* 209 */                               il1llOool2 = il1llOool3;
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case 54:
/* 614 */                               i = i4;
/* 616 */                               o10I0l0OO = o10I0l0OO2;
/* 618 */                               long jI001i1lo1io46 = I001i1lo1io(iI00IlilI0i0i);
/* 623 */                               iOOOi13.I00ilI0I1(0);
/* 638 */                               Ooil1O.I00100o1O0lo(obj2, jI001i1lo1io46, Long.valueOf(((IOOOIO1O) iOOOi13.I0000oI00).I001i1O0Ol()));
/* 641 */                               o1lIoIO2.I00IOO(obj2, iI0000O, iI001lIiIIo1O);
/* 207 */                               o1lIoIO = o1lIoIO2;
/* 208 */                               iOOOi12 = iOOOi13;
/* 209 */                               il1llOool2 = il1llOool3;
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case 55:
/* 582 */                               i = i4;
/* 584 */                               o10I0l0OO = o10I0l0OO2;
/* 586 */                               long jI001i1lo1io47 = I001i1lo1io(iI00IlilI0i0i);
/* 591 */                               iOOOi13.I00ilI0I1(0);
/* 606 */                               Ooil1O.I00100o1O0lo(obj2, jI001i1lo1io47, Integer.valueOf(((IOOOIO1O) iOOOi13.I0000oI00).I000lI()));
/* 609 */                               o1lIoIO2.I00IOO(obj2, iI0000O, iI001lIiIIo1O);
/* 207 */                               o1lIoIO = o1lIoIO2;
/* 208 */                               iOOOi12 = iOOOi13;
/* 209 */                               il1llOool2 = il1llOool3;
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case 56:
/* 551 */                               i = i4;
/* 553 */                               o10I0l0OO = o10I0l0OO2;
/* 555 */                               long jI001i1lo1io48 = I001i1lo1io(iI00IlilI0i0i);
/* 559 */                               iOOOi13.I00ilI0I1(1);
/* 574 */                               Ooil1O.I00100o1O0lo(obj2, jI001i1lo1io48, Long.valueOf(((IOOOIO1O) iOOOi13.I0000oI00).I000iOII()));
/* 577 */                               o1lIoIO2.I00IOO(obj2, iI0000O, iI001lIiIIo1O);
/* 207 */                               o1lIoIO = o1lIoIO2;
/* 208 */                               iOOOi12 = iOOOi13;
/* 209 */                               il1llOool2 = il1llOool3;
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case 57:
/* 519 */                               i = i4;
/* 521 */                               o10I0l0OO = o10I0l0OO2;
/* 523 */                               long jI001i1lo1io49 = I001i1lo1io(iI00IlilI0i0i);
/* 528 */                               iOOOi13.I00ilI0I1(5);
/* 543 */                               Ooil1O.I00100o1O0lo(obj2, jI001i1lo1io49, Integer.valueOf(((IOOOIO1O) iOOOi13.I0000oI00).I000OiO()));
/* 546 */                               o1lIoIO2.I00IOO(obj2, iI0000O, iI001lIiIIo1O);
/* 207 */                               o1lIoIO = o1lIoIO2;
/* 208 */                               iOOOi12 = iOOOi13;
/* 209 */                               il1llOool2 = il1llOool3;
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case 58:
/* 487 */                               i = i4;
/* 489 */                               o10I0l0OO = o10I0l0OO2;
/* 491 */                               long jI001i1lo1io50 = I001i1lo1io(iI00IlilI0i0i);
/* 496 */                               iOOOi13.I00ilI0I1(0);
/* 511 */                               Ooil1O.I00100o1O0lo(obj2, jI001i1lo1io50, Boolean.valueOf(((IOOOIO1O) iOOOi13.I0000oI00).I0001Ioi1lo()));
/* 514 */                               o1lIoIO2.I00IOO(obj2, iI0000O, iI001lIiIIo1O);
/* 207 */                               o1lIoIO = o1lIoIO2;
/* 208 */                               iOOOi12 = iOOOi13;
/* 209 */                               il1llOool2 = il1llOool3;
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case 59:
/* 475 */                               i = i4;
/* 477 */                               o10I0l0OO = o10I0l0OO2;
/* 479 */                               o1lIoIO2.I00II0Ol1O0l(iI00IlilI0i0i, iOOOi13, obj2);
/* 482 */                               o1lIoIO2.I00IOO(obj2, iI0000O, iI001lIiIIo1O);
/* 207 */                               o1lIoIO = o1lIoIO2;
/* 208 */                               iOOOi12 = iOOOi13;
/* 209 */                               il1llOool2 = il1llOool3;
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case 60:
/* 439 */                               i = i4;
/* 441 */                               o10I0l0OO = o10I0l0OO2;
/* 447 */                               I01IlIoOI i01IlIoOI3 = (I01IlIoOI) o1lIoIO2.I001IO000(obj2, iI0000O, iI001lIiIIo1O);
/* 449 */                               OiOIl0 oiOIl0I000lI3 = o1lIoIO2.I000lI(iI001lIiIIo1O);
/* 454 */                               iOOOi13.I00ilI0I1(2);
/* 457 */                               iOOOi13.I000iOII(i01IlIoOI3, oiOIl0I000lI3, il1llOool3);
/* 467 */                               unsafe.putObject(obj2, o1lIoIO2.I00IlilI0i0i(iI001lIiIIo1O) & 1048575, i01IlIoOI3);
/* 470 */                               o1lIoIO2.I00IOO(obj2, iI0000O, iI001lIiIIo1O);
/* 207 */                               o1lIoIO = o1lIoIO2;
/* 208 */                               iOOOi12 = iOOOi13;
/* 209 */                               il1llOool2 = il1llOool3;
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case 61:
/* 419 */                               i = i4;
/* 421 */                               o10I0l0OO = o10I0l0OO2;
/* 431 */                               Ooil1O.I00100o1O0lo(obj2, I001i1lo1io(iI00IlilI0i0i), iOOOi13.I00100l0());
/* 434 */                               o1lIoIO2.I00IOO(obj2, iI0000O, iI001lIiIIo1O);
/* 207 */                               o1lIoIO = o1lIoIO2;
/* 208 */                               iOOOi12 = iOOOi13;
/* 209 */                               il1llOool2 = il1llOool3;
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case 62:
/* 387 */                               i = i4;
/* 389 */                               o10I0l0OO = o10I0l0OO2;
/* 391 */                               long jI001i1lo1io51 = I001i1lo1io(iI00IlilI0i0i);
/* 396 */                               iOOOi13.I00ilI0I1(0);
/* 411 */                               Ooil1O.I00100o1O0lo(obj2, jI001i1lo1io51, Integer.valueOf(((IOOOIO1O) iOOOi13.I0000oI00).I001IO000()));
/* 414 */                               o1lIoIO2.I00IOO(obj2, iI0000O, iI001lIiIIo1O);
/* 207 */                               o1lIoIO = o1lIoIO2;
/* 208 */                               iOOOi12 = iOOOi13;
/* 209 */                               il1llOool2 = il1llOool3;
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case 63:
/* 352 */                               i = i4;
/* 354 */                               o10I0l0OO = o10I0l0OO2;
/* 357 */                               iOOOi13.I00ilI0I1(0);
/* 364 */                               int iI000OOo1O2 = ((IOOOIO1O) iOOOi13.I0000oI00).I000OOo1O();
/* 368 */                               o1lIoIO2.I000l1(iI001lIiIIo1O);
/* 379 */                               Ooil1O.I00100o1O0lo(obj2, I001i1lo1io(iI00IlilI0i0i), Integer.valueOf(iI000OOo1O2));
/* 382 */                               o1lIoIO2.I00IOO(obj2, iI0000O, iI001lIiIIo1O);
/* 207 */                               o1lIoIO = o1lIoIO2;
/* 208 */                               iOOOi12 = iOOOi13;
/* 209 */                               il1llOool2 = il1llOool3;
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case Barcode.FORMAT_EAN_8:
/* 320 */                               i = i4;
/* 322 */                               o10I0l0OO = o10I0l0OO2;
/* 324 */                               long jI001i1lo1io52 = I001i1lo1io(iI00IlilI0i0i);
/* 329 */                               iOOOi13.I00ilI0I1(5);
/* 344 */                               Ooil1O.I00100o1O0lo(obj2, jI001i1lo1io52, Integer.valueOf(((IOOOIO1O) iOOOi13.I0000oI00).I000oI1ioi()));
/* 347 */                               o1lIoIO2.I00IOO(obj2, iI0000O, iI001lIiIIo1O);
/* 207 */                               o1lIoIO = o1lIoIO2;
/* 208 */                               iOOOi12 = iOOOi13;
/* 209 */                               il1llOool2 = il1llOool3;
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case 65:
/* 290 */                               i = i4;
/* 292 */                               o10I0l0OO = o10I0l0OO2;
/* 294 */                               long jI001i1lo1io53 = I001i1lo1io(iI00IlilI0i0i);
/* 298 */                               iOOOi13.I00ilI0I1(1);
/* 313 */                               Ooil1O.I00100o1O0lo(obj2, jI001i1lo1io53, Long.valueOf(((IOOOIO1O) iOOOi13.I0000oI00).I00100l0()));
/* 316 */                               o1lIoIO2.I00IOO(obj2, iI0000O, iI001lIiIIo1O);
/* 207 */                               o1lIoIO = o1lIoIO2;
/* 208 */                               iOOOi12 = iOOOi13;
/* 209 */                               il1llOool2 = il1llOool3;
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case 66:
/* 259 */                               i = i4;
/* 261 */                               o10I0l0OO = o10I0l0OO2;
/* 263 */                               long jI001i1lo1io54 = I001i1lo1io(iI00IlilI0i0i);
/* 268 */                               iOOOi13.I00ilI0I1(0);
/* 283 */                               Ooil1O.I00100o1O0lo(obj2, jI001i1lo1io54, Integer.valueOf(((IOOOIO1O) iOOOi13.I0000oI00).I00100o1O0lo()));
/* 286 */                               o1lIoIO2.I00IOO(obj2, iI0000O, iI001lIiIIo1O);
/* 207 */                               o1lIoIO = o1lIoIO2;
/* 208 */                               iOOOi12 = iOOOi13;
/* 209 */                               il1llOool2 = il1llOool3;
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case 67:
/* 226 */                               i = i4;
/* 228 */                               o10I0l0OO = o10I0l0OO2;
/* 230 */                               long jI001i1lo1io55 = I001i1lo1io(iI00IlilI0i0i);
/* 235 */                               iOOOi13.I00ilI0I1(0);
/* 250 */                               Ooil1O.I00100o1O0lo(obj2, jI001i1lo1io55, Long.valueOf(((IOOOIO1O) iOOOi13.I0000oI00).I0010I0i()));
/* 253 */                               o1lIoIO2.I00IOO(obj2, iI0000O, iI001lIiIIo1O);
/* 207 */                               o1lIoIO = o1lIoIO2;
/* 208 */                               iOOOi12 = iOOOi13;
/* 209 */                               il1llOool2 = il1llOool3;
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    case 68:
                                        try {
/* 177 */                                   I01IlIoOI i01IlIoOI4 = (I01IlIoOI) o1lIoIO2.I001IO000(obj2, iI0000O, iI001lIiIIo1O);
/* 179 */                                   OiOIl0 oiOIl0I000lI4 = o1lIoIO2.I000lI(iI001lIiIIo1O);
/* 184 */                                   iOOOi13.I00ilI0I1(3);
/* 187 */                                   iOOOi13.I000O01llI0(i01IlIoOI4, oiOIl0I000lI4, il1llOool3);
/* 196 */                                   i = i4;
/* 198 */                                   o10I0l0OO = o10I0l0OO2;
                                            try {
                                                try {
/* 201 */                                           unsafe.putObject(obj2, o1lIoIO2.I00IlilI0i0i(iI001lIiIIo1O) & 1048575, i01IlIoOI4);
/* 204 */                                           o1lIoIO2.I00IOO(obj2, iI0000O, iI001lIiIIo1O);
/* 207 */                                           o1lIoIO = o1lIoIO2;
/* 208 */                                           iOOOi12 = iOOOi13;
/* 209 */                                           il1llOool2 = il1llOool3;
                                                } catch (Throwable th5) {
/* 257 */                                           th = th5;
/* 212 */                                           o1lIoIO = o1lIoIO2;
/* 2133 */                                          for (i2 = i; i2 < i3; i2++) {
/* 2137 */                                              o1lIoIO.I000iOII(iArr[i2], obj2, ooiO0IO0ilI00000oIO);
                                                    }
/* 2143 */                                          if (ooiO0IO0ilI00000oIO != null) {
/* 2145 */                                              ooiO0oOll0oO.getClass();
/* 2151 */                                              ((Io00Ol1o10O) obj2).unknownFields = ooiO0IO0ilI00000oIO;
                                                    }
/* 2153 */                                          throw th;
                                                }
                                            } catch (O000lI0 unused9) {
/* 215 */                                       o1lIoIO = o1lIoIO2;
/* 140 */                                       iOOOi12 = iOOOi13;
/* 141 */                                       il1llOool2 = il1llOool3;
/* 2088 */                                      ooiO0oOll0oO.getClass();
/* 2091 */                                      if (ooiO0IO0ilI00000oIO == null) {
/* 2093 */                                          ooiO0IO0ilI00000oIO = OoiO0oOll0oO.I00000oIO(obj2);
                                                }
/* 2103 */                                      if (!OoiO0oOll0oO.I00000oOI(0, iOOOi12, ooiO0IO0ilI00000oIO)) {
/* 2107 */                                          for (int i5 = i; i5 < i3; i5++) {
/* 2111 */                                              o1lIoIO.I000iOII(iArr[i5], obj2, ooiO0IO0ilI00000oIO);
                                                    }
/* 2117 */                                          if (ooiO0IO0ilI00000oIO == null) {
/* 2121 */                                              return;
                                                    }
/* 66 */                                            ((Io00Ol1o10O) obj2).unknownFields = ooiO0IO0ilI00000oIO;
/* 2121 */                                          return;
                                                }
/* 2122 */                                      o1lIoIO2 = o1lIoIO;
/* 2123 */                                      iOOOi13 = iOOOi12;
/* 2124 */                                      il1llOool3 = il1llOool2;
/* 2125 */                                      i4 = i;
/* 2127 */                                      o10I0l0OO2 = o10I0l0OO;
                                            }
                                        } catch (O000lI0 unused10) {
/* 221 */                                   i = i4;
/* 223 */                                   o10I0l0OO = o10I0l0OO2;
                                        } catch (Throwable th6) {
/* 217 */                                   th = th6;
/* 218 */                                   i = i4;
                                        }
/* 2122 */                              o1lIoIO2 = o1lIoIO;
/* 2123 */                              iOOOi13 = iOOOi12;
/* 2124 */                              il1llOool3 = il1llOool2;
/* 2125 */                              i4 = i;
/* 2127 */                              o10I0l0OO2 = o10I0l0OO;
                                    default:
/* 124 */                               if (ooiO0IO0ilI00000oIO == null) {
/* 126 */                                   ooiO0oOll0oO.getClass();
/* 129 */                                   ooiO0IO0ilI00000oIO = OoiO0oOll0oO.I00000oIO(obj2);
                                        }
/* 144 */                               ooiO0oOll0oO.getClass();
/* 152 */                               if (OoiO0oOll0oO.I00000oOI(0, iOOOi13, ooiO0IO0ilI00000oIO)) {
/* 167 */                                   o1lIoIO = o1lIoIO2;
/* 168 */                                   i = i4;
/* 170 */                                   o10I0l0OO = o10I0l0OO2;
/* 208 */                                   iOOOi12 = iOOOi13;
/* 209 */                                   il1llOool2 = il1llOool3;
/* 2122 */                                  o1lIoIO2 = o1lIoIO;
/* 2123 */                                  iOOOi13 = iOOOi12;
/* 2124 */                                  il1llOool3 = il1llOool2;
/* 2125 */                                  i4 = i;
/* 2127 */                                  o10I0l0OO2 = o10I0l0OO;
                                        } else {
/* 154 */                                   while (i4 < i3) {
/* 158 */                                       o1lIoIO2.I000iOII(iArr[i4], obj2, ooiO0IO0ilI00000oIO);
/* 161 */                                       i4++;
                                            }
/* 164 */                                   if (ooiO0IO0ilI00000oIO == null) {
/* 2121 */                                      return;
                                            }
                                        }
                                        break;
                                }
                            } else if (iI0000O == Integer.MAX_VALUE) {
/* 48 */                        while (i4 < i3) {
/* 52 */                            o1lIoIO2.I000iOII(iArr[i4], obj2, ooiO0IO0ilI00000oIO);
/* 55 */                            i4++;
                                }
/* 58 */                        if (ooiO0IO0ilI00000oIO == null) {
/* 2121 */                          return;
                                } else {
/* 60 */                            ooiO0oOll0oO.getClass();
                                }
                            } else {
/* 70 */                        ooiO0oOll0oO.getClass();
/* 73 */                        if (ooiO0IO0ilI00000oIO == null) {
/* 75 */                            ooiO0IO0ilI00000oIO = OoiO0oOll0oO.I00000oIO(obj2);
                                }
/* 91 */                        if (!OoiO0oOll0oO.I00000oOI(0, iOOOi13, ooiO0IO0ilI00000oIO)) {
/* 94 */                            while (i4 < i3) {
/* 98 */                                o1lIoIO2.I000iOII(iArr[i4], obj2, ooiO0IO0ilI00000oIO);
/* 101 */                               i4++;
                                    }
/* 104 */                           if (ooiO0IO0ilI00000oIO == null) {
/* 2121 */                              return;
                                    }
                                }
                            }
                        } catch (Throwable th7) {
/* 81 */                    th = th7;
/* 82 */                    o1lIoIO = o1lIoIO2;
/* 83 */                    i = i4;
                        }
                    }
                }

                public final boolean I000OiO(Io00Ol1o10O io00Ol1o10O, Io00Ol1o10O io00Ol1o10O2, int i) {
                    return I000o00OoI0I(i, io00Ol1o10O) == I000o00OoI0I(i, io00Ol1o10O2);
                }

                public final void I000iOII(int i, Object obj, Object obj2) {
/* 3 */             int i2 = this.I00000oIO[i];
/* 18 */            if (Ooil1O.I000OOo1O(I00IlilI0i0i(i) & 1048575, obj) == null) {
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

                public final OiOIl0 I000lI(int i) {
/* 3 */             int i2 = (i / 3) * 2;
/* 5 */             Object[] objArr = this.I00000oOI;
/* 9 */             OiOIl0 oiOIl0 = (OiOIl0) objArr[i2];
/* 11 */            if (oiOIl0 != null) {
/* 13 */                return oiOIl0;
                    }
/* 22 */            OiOIl0 oiOIl0I00000oIO = OOi1o101lI.I0000Il00O.I00000oIO((Class) objArr[i2 + 1]);
/* 26 */            objArr[i2] = oiOIl0I00000oIO;
/* 49 */            return oiOIl0I00000oIO;
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
                                return Double.doubleToRawLongBits(Ooil1O.I0000Il00O.I0000Il00O(j2, obj)) != 0;
                            case 1:
/* 212 */                       if (Float.floatToRawIntBits(Ooil1O.I0000Il00O.I0000O(j2, obj)) != 0) {
                                }
                                break;
                            case 2:
/* 199 */                       if (Ooil1O.I000O01llI0(j2, obj) != 0) {
                                }
                                break;
                            case 3:
/* 190 */                       if (Ooil1O.I000O01llI0(j2, obj) != 0) {
                                }
                                break;
                            case 4:
/* 181 */                       if (Ooil1O.I000II(j2, obj) != 0) {
                                }
                                break;
                            case 5:
/* 174 */                       if (Ooil1O.I000O01llI0(j2, obj) != 0) {
                                }
                                break;
                            case 6:
/* 165 */                       if (Ooil1O.I000II(j2, obj) != 0) {
                                }
                                break;
                            case 7:
/* 156 */                       return Ooil1O.I0000Il00O.I00000oIO(j2, obj);
                            case 8:
/* 122 */                       Object objI000OOo1O = Ooil1O.I000OOo1O(j2, obj);
/* 128 */                       if (objI000OOo1O instanceof String) {
/* 136 */                           return !((String) objI000OOo1O).isEmpty();
                                }
/* 140 */                       if (objI000OOo1O instanceof IIO1i00loOo) {
/* 148 */                           return !IIO1i00loOo.I00iiI.equals(objI000OOo1O);
                                }
/* 150 */                       OIiilo1Ool0o.I00100o1O0lo();
/* 18 */                        return false;
                            case 9:
/* 118 */                       if (Ooil1O.I000OOo1O(j2, obj) != null) {
                                }
                                break;
                            case 10:
/* 112 */                       return !IIO1i00loOo.I00iiI.equals(Ooil1O.I000OOo1O(j2, obj));
                            case 11:
/* 98 */                        if (Ooil1O.I000II(j2, obj) != 0) {
                                }
                                break;
                            case 12:
/* 90 */                        if (Ooil1O.I000II(j2, obj) != 0) {
                                }
                                break;
                            case 13:
/* 82 */                        if (Ooil1O.I000II(j2, obj) != 0) {
                                }
                                break;
                            case 14:
/* 74 */                        if (Ooil1O.I000O01llI0(j2, obj) != 0) {
                                }
                                break;
                            case 15:
/* 64 */                        if (Ooil1O.I000II(j2, obj) != 0) {
                                }
                                break;
                            case 16:
/* 56 */                        if (Ooil1O.I000O01llI0(j2, obj) != 0) {
                                }
                                break;
                            case 17:
/* 46 */                        if (Ooil1O.I000OOo1O(j2, obj) != null) {
                                }
                                break;
                            default:
/* 38 */                        OIiilo1Ool0o.I00100o1O0lo();
/* 18 */                        return false;
                        }
                    } else if (((1 << (i2 >>> 20)) & Ooil1O.I000II(j, obj)) != 0) {
                    }
                }

                public final boolean I000oI1ioi(Object obj, int i, int i2, int i3, int i4) {
                    return i2 == 1048575 ? I000o00OoI0I(i, obj) : (i3 & i4) != 0;
                }

                public final boolean I00100o1O0lo(Object obj, int i, int i2) {
                    return Ooil1O.I000II((long) (this.I00000oIO[i2 + 2] & 1048575), obj) == i;
                }

                /* JADX WARN: Code restructure failed: missing block: B:34:0x00a2, code lost:
                
                    r9.put(r2, r3);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:35:0x00a5, code lost:
                
                    r10.I0000O(r0);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:36:0x00a8, code lost:
                
                    return;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I0010I0i(Object obj, int i, Object obj2, Il1llOool il1llOool, IOOOi1 iOOOi1) throws O000illO, O000lI0, O000o1i {
/* 8 */             long jI00IlilI0i0i = I00IlilI0i0i(i) & 1048575;
/* 10 */            Object objI000OOo1O = Ooil1O.I000OOo1O(jI00IlilI0i0i, obj);
/* 14 */            O1Oi111oiiI o1Oi111oiiI = this.I000lI;
/* 16 */            if (objI000OOo1O == null) {
/* 18 */                o1Oi111oiiI.getClass();
/* 23 */                objI000OOo1O = O1OOo11I1O1.I00iiI.I0000Il00O();
/* 27 */                Ooil1O.I00100o1O0lo(obj, jI00IlilI0i0i, objI000OOo1O);
                    } else {
/* 31 */                o1Oi111oiiI.getClass();
/* 39 */                if (!((O1OOo11I1O1) objI000OOo1O).I00iOIl) {
/* 43 */                    Object objI0000Il00O = O1OOo11I1O1.I00iiI.I0000Il00O();
/* 47 */                    O1Oi111oiiI.I00000oIO(objI0000Il00O, objI000OOo1O);
/* 50 */                    Ooil1O.I00100o1O0lo(obj, jI00IlilI0i0i, objI0000Il00O);
/* 53 */                    objI000OOo1O = objI0000Il00O;
                        }
                    }
/* 54 */            o1Oi111oiiI.getClass();
/* 57 */            O1OOo11I1O1 o1OOo11I1O1 = (O1OOo11I1O1) objI000OOo1O;
/* 61 */            IOO000ilo iOO000ilo = ((O1OOiOlO0) obj2).I00000oIO;
/* 64 */            iOOOi1.I00ilI0I1(2);
/* 69 */            IOOOIO1O ioooio1o = (IOOOIO1O) iOOOi1.I0000oI00;
/* 75 */            int iI0000oI00 = ioooio1o.I0000oI00(ioooio1o.I001IO000());
/* 79 */            iOO000ilo.getClass();
/* 82 */            Object obj3 = iOO000ilo.I00iio;
/* 84 */            Object objI001lllioOl = "";
/* 86 */            Object objI001lllioOl2 = obj3;
                    while (true) {
                        try {
/* 87 */                    int iI0000O = iOOOi1.I0000O();
/* 94 */                    if (iI0000O == Integer.MAX_VALUE || ioooio1o.I0000Il00O()) {
                                break;
                            }
/* 106 */                   if (iI0000O == 1) {
/* 145 */                       objI001lllioOl = iOOOi1.I001lllioOl((i011I10o1IlI) iOO000ilo.I00iiI, null, null);
                            } else if (iI0000O != 2) {
                                try {
/* 114 */                           if (!iOOOi1.I00ilO0()) {
/* 122 */                               throw new O0010I0o("Unable to parse map entry.");
                                    }
                                } catch (O000lI0 e) {
/* 154 */                           if (!iOOOi1.I00ilO0()) {
/* 162 */                               throw new O0010I0o("Unable to parse map entry.", e);
                                    }
                                }
                            } else {
/* 135 */                       objI001lllioOl2 = iOOOi1.I001lllioOl((i011I10o1IlI) iOO000ilo.I00iiO, obj3.getClass(), il1llOool);
                            }
                        } catch (Throwable th) {
/* 170 */                   ioooio1o.I0000O(iI0000oI00);
/* 966 */                   throw th;
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
/* 215 */                   return;
                        }
/* 25 */                OiOIl0 oiOIl0I000lI = I000lI(i);
/* 33 */                if (!I000o00OoI0I(i, obj)) {
/* 39 */                    if (I00100l0(object)) {
/* 45 */                        Io00Ol1o10O io00Ol1o10OI0000O = oiOIl0I000lI.I0000O();
/* 49 */                        oiOIl0I000lI.I00000oIO(io00Ol1o10OI0000O, object);
/* 52 */                        unsafe.putObject(obj, jI00IlilI0i0i, io00Ol1o10OI0000O);
                            } else {
/* 41 */                        unsafe.putObject(obj, jI00IlilI0i0i, object);
                            }
/* 55 */                    I00IO1oi11O(i, obj);
/* 58 */                    return;
                        }
/* 59 */                Object object2 = unsafe.getObject(obj, jI00IlilI0i0i);
/* 67 */                if (!I00100l0(object2)) {
/* 69 */                    Io00Ol1o10O io00Ol1o10OI0000O2 = oiOIl0I000lI.I0000O();
/* 73 */                    oiOIl0I000lI.I00000oIO(io00Ol1o10OI0000O2, object2);
/* 76 */                    unsafe.putObject(obj, jI00IlilI0i0i, io00Ol1o10OI0000O2);
/* 79 */                    object2 = io00Ol1o10OI0000O2;
                        }
/* 80 */                oiOIl0I000lI.I00000oIO(object2, object);
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
/* 215 */                   return;
                        }
/* 29 */                OiOIl0 oiOIl0I000lI = I000lI(i);
/* 37 */                if (!I00100o1O0lo(obj, i2, i)) {
/* 43 */                    if (I00100l0(object)) {
/* 49 */                        Io00Ol1o10O io00Ol1o10OI0000O = oiOIl0I000lI.I0000O();
/* 53 */                        oiOIl0I000lI.I00000oIO(io00Ol1o10OI0000O, object);
/* 56 */                        unsafe.putObject(obj, jI00IlilI0i0i, io00Ol1o10OI0000O);
                            } else {
/* 45 */                        unsafe.putObject(obj, jI00IlilI0i0i, object);
                            }
/* 59 */                    I00IOO(obj, i2, i);
/* 62 */                    return;
                        }
/* 63 */                Object object2 = unsafe.getObject(obj, jI00IlilI0i0i);
/* 71 */                if (!I00100l0(object2)) {
/* 73 */                    Io00Ol1o10O io00Ol1o10OI0000O2 = oiOIl0I000lI.I0000O();
/* 77 */                    oiOIl0I000lI.I00000oIO(io00Ol1o10OI0000O2, object2);
/* 80 */                    unsafe.putObject(obj, jI00IlilI0i0i, io00Ol1o10OI0000O2);
/* 83 */                    object2 = io00Ol1o10OI0000O2;
                        }
/* 84 */                oiOIl0I000lI.I00000oIO(object2, object);
                    }
                }

                public final Object I001IIilI0O(int i, Object obj) {
/* 1 */             OiOIl0 oiOIl0I000lI = I000lI(i);
/* 12 */            long jI00IlilI0i0i = I00IlilI0i0i(i) & 1048575;
/* 18 */            if (!I000o00OoI0I(i, obj)) {
/* 20 */                return oiOIl0I000lI.I0000O();
                    }
/* 27 */            Object object = I000oI1ioi.getObject(obj, jI00IlilI0i0i);
/* 35 */            if (I00100l0(object)) {
/* 37 */                return object;
                    }
/* 38 */            Io00Ol1o10O io00Ol1o10OI0000O = oiOIl0I000lI.I0000O();
/* 42 */            if (object != null) {
/* 44 */                oiOIl0I000lI.I00000oIO(io00Ol1o10OI0000O, object);
                    }
/* 89 */            return io00Ol1o10OI0000O;
                }

                public final Object I001IO000(Object obj, int i, int i2) {
/* 1 */             OiOIl0 oiOIl0I000lI = I000lI(i2);
/* 9 */             if (!I00100o1O0lo(obj, i, i2)) {
/* 11 */                return oiOIl0I000lI.I0000O();
                    }
/* 27 */            Object object = I000oI1ioi.getObject(obj, I00IlilI0i0i(i2) & 1048575);
/* 35 */            if (I00100l0(object)) {
/* 37 */                return object;
                    }
/* 38 */            Io00Ol1o10O io00Ol1o10OI0000O = oiOIl0I000lI.I0000O();
/* 42 */            if (object != null) {
/* 44 */                oiOIl0I000lI.I00000oIO(io00Ol1o10OI0000O, object);
                    }
/* 215 */           return io00Ol1o10OI0000O;
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

                public final void I001lllioOl(Object obj, long j, IOOOi1 iOOOi1, OiOIl0 oiOIl0, Il1llOool il1llOool) throws O000lI0 {
                    int iI001IIilI0O;
/* 3 */             this.I000iOII.getClass();
/* 6 */             Iool1IOO1o0i iool1IOO1o0iI00000oIO = O10I0l0OO.I00000oIO(j, obj);
/* 12 */            IOOOIO1O ioooio1o = (IOOOIO1O) iOOOi1.I0000oI00;
/* 14 */            int i = iOOOi1.I00000oOI;
/* 19 */            if ((i & 7) != 3) {
/* 966 */               throw O0010I0o.I00000oOI();
                    }
/* 49 */            do {
/* 21 */                Io00Ol1o10O io00Ol1o10OI0000O = oiOIl0.I0000O();
/* 25 */                iOOOi1.I000O01llI0(io00Ol1o10OI0000O, oiOIl0, il1llOool);
/* 28 */                oiOIl0.I00000oOI(io00Ol1o10OI0000O);
/* 31 */                iool1IOO1o0iI00000oIO.add(io00Ol1o10OI0000O);
/* 38 */                if (ioooio1o.I0000Il00O() || iOOOi1.I0000O != 0) {
/* 53 */                    return;
                        } else {
/* 45 */                    iI001IIilI0O = ioooio1o.I001IIilI0O();
                        }
/* 49 */            } while (iI001IIilI0O == i);
/* 51 */            iOOOi1.I0000O = iI001IIilI0O;
                }

                public final void I001lloI(Object obj, int i, IOOOi1 iOOOi1, OiOIl0 oiOIl0, Il1llOool il1llOool) throws O0010I0o {
                    int iI001IIilI0O;
/* 8 */             this.I000iOII.getClass();
/* 11 */            Iool1IOO1o0i iool1IOO1o0iI00000oIO = O10I0l0OO.I00000oIO(i & 1048575, obj);
/* 17 */            IOOOIO1O ioooio1o = (IOOOIO1O) iOOOi1.I0000oI00;
/* 19 */            int i2 = iOOOi1.I00000oOI;
/* 24 */            if ((i2 & 7) != 2) {
/* 966 */               throw O0010I0o.I00000oOI();
                    }
/* 54 */            do {
/* 26 */                Io00Ol1o10O io00Ol1o10OI0000O = oiOIl0.I0000O();
/* 30 */                iOOOi1.I000iOII(io00Ol1o10OI0000O, oiOIl0, il1llOool);
/* 33 */                oiOIl0.I00000oOI(io00Ol1o10OI0000O);
/* 36 */                iool1IOO1o0iI00000oIO.add(io00Ol1o10OI0000O);
/* 43 */                if (ioooio1o.I0000Il00O() || iOOOi1.I0000O != 0) {
/* 58 */                    return;
                        } else {
/* 50 */                    iI001IIilI0O = ioooio1o.I001IIilI0O();
                        }
/* 54 */            } while (iI001IIilI0O == i2);
/* 56 */            iOOOi1.I0000O = iI001IIilI0O;
                }

                public final void I00II0Ol1O0l(int i, IOOOi1 iOOOi1, Object obj) throws O000illO, O000lI0, O000o1i {
/* 3 */             IOOOIO1O ioooio1o = (IOOOIO1O) iOOOi1.I0000oI00;
/* 12 */            if ((536870912 & i) != 0) {
/* 17 */                iOOOi1.I00ilI0I1(2);
/* 24 */                Ooil1O.I00100o1O0lo(obj, i & 1048575, ioooio1o.I00111O());
                    } else if (!this.I0001Ioi1lo) {
/* 53 */                Ooil1O.I00100o1O0lo(obj, i & 1048575, iOOOi1.I00100l0());
                    } else {
/* 35 */                iOOOi1.I00ilI0I1(2);
/* 42 */                Ooil1O.I00100o1O0lo(obj, i & 1048575, ioooio1o.I0010o());
                    }
                }

                public final void I00II0oii1o(int i, IOOOi1 iOOOi1, Object obj) throws O000illO, O000lI0, O000o1i {
/* 10 */            boolean z = (536870912 & i) != 0;
/* 11 */            O10I0l0OO o10I0l0OO = this.I000iOII;
/* 16 */            if (z) {
/* 20 */                o10I0l0OO.getClass();
/* 27 */                iOOOi1.I00i01iIIliI(O10I0l0OO.I00000oIO(i & 1048575, obj), true);
                    } else {
/* 33 */                o10I0l0OO.getClass();
/* 40 */                iOOOi1.I00i01iIIliI(O10I0l0OO.I00000oIO(i & 1048575, obj), false);
                    }
                }

                public final void I00IO1oi11O(int i, Object obj) {
/* 5 */             int i2 = this.I00000oIO[i + 2];
/* 10 */            long j = 1048575 & i2;
/* 17 */            if (j == 1048575) {
/* 19 */                return;
                    }
/* 30 */            Ooil1O.I000oI1ioi(obj, (1 << (i2 >>> 20)) | Ooil1O.I000II(j, obj), j);
                }

                public final void I00IOO(Object obj, int i, int i2) {
/* 12 */            Ooil1O.I000oI1ioi(obj, i, this.I00000oIO[i2 + 2] & 1048575);
                }

                public final int I00IlilI0i0i(int i) {
/* 5 */             return this.I00000oIO[i + 1];
                }
            }

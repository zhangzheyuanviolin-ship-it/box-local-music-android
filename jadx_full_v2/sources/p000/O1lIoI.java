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
            import java.util.List;
            import java.util.logging.Level;
            import sun.misc.Unsafe;
            
            public final class O1lIoI implements OiOIiIO0 {
                public static final int[] I000oI1ioi = new int[0];
                public static final Unsafe I00100l0;
                public int[] I00000oIO;
                public Object[] I00000oOI;
                public int I0000Il00O;
                public int I0000O;
                public I01Iio10lo I0000oI00;
                public boolean I0001Ioi1lo;
                public boolean I000II;
                public int[] I000O01llI0;
                public int I000OOo1O;
                public int I000OiO;
                public OIIOo1oii I000iOII;
                public O101ol1lilo0 I000l1;
                public OoiO0li I000lI;
                public O1Oi10 I000o00OoI0I;

                static {
                    Unsafe unsafe;
                    try {
/* 16 */                unsafe = (Unsafe) AccessController.doPrivileged(new OoiioO0o(0));
                    } catch (Throwable unused) {
/* 19 */                unsafe = null;
                    }
/* 20 */            I00100l0 = unsafe;
                }

                public static void I000l1(Object obj) {
/* 5 */             if (I0010I0i(obj)) {
/* 7 */                 return;
                    }
/* 10 */            IioIoO10iOiI.I000OiO("Mutating immutable message: ", obj);
                }

                public static boolean I0010I0i(Object obj) {
/* 1 */             if (obj == null) {
/* 3 */                 return false;
                    }
/* 7 */             if (obj instanceof Io00Io0IO11) {
/* 11 */                return ((Io00Io0IO11) obj).I000o00OoI0I();
                    }
/* 16 */            return true;
                }

                /* JADX WARN: Removed duplicated region for block: B:165:0x0351  */
                /* JADX WARN: Removed duplicated region for block: B:181:0x03a2  */
                /* JADX WARN: Removed duplicated region for block: B:188:0x03c0  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static O1lIoI I001iOo1i0O(OOl1oi1OO oOl1oi1OO, OIIOo1oii oIIOo1oii, O101ol1lilo0 o101ol1lilo0, OoiO0li ooiO0li, Il1o000oI0o il1o000oI0o, O1Oi10 o1Oi10) {
                    int i;
                    int iCharAt;
                    int iCharAt2;
                    int iCharAt3;
                    int iCharAt4;
                    int i2;
                    int iCharAt5;
                    int i3;
                    int[] iArr;
                    int i4;
                    char cCharAt;
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
                    char cCharAt8;
                    int i12;
                    int i13;
                    int i14;
                    int i15;
                    boolean z;
                    int i16;
                    int iObjectFieldOffset;
                    int i17;
                    int i18;
                    int iObjectFieldOffset2;
                    int i19;
                    int i20;
                    int i21;
                    Field fieldI00IlilI0i0i;
                    char cCharAt9;
                    int i22;
                    int i23;
                    Field fieldI00IlilI0i0i2;
                    Field fieldI00IlilI0i0i3;
                    int i24;
                    char cCharAt10;
                    int i25;
                    int i26;
                    char cCharAt11;
                    int i27;
                    int i28;
                    char cCharAt12;
                    int i29;
                    char cCharAt13;
/* 5 */             if (!(oOl1oi1OO instanceof OOl1oi1OO)) {
/* 1067 */              OIiilo1Ool0o.I00000oIO();
/* 1070 */              return null;
                    }
/* 7 */             I01Iio10lo i01Iio10lo = oOl1oi1OO.I00000oIO;
/* 13 */            int i30 = 0;
/* 18 */            boolean z2 = (oOl1oi1OO.I0000O & 1) != 1;
/* 19 */            String str = oOl1oi1OO.I00000oOI;
/* 21 */            int length = str.length();
/* 32 */            if (str.charAt(0) >= 55296) {
/* 34 */                int i31 = 1;
                        while (true) {
/* 35 */                    i = i31 + 1;
/* 41 */                    if (str.charAt(i31) < 55296) {
                                break;
                            }
/* 43 */                    i31 = i;
                        }
                    } else {
/* 45 */                i = 1;
                    }
/* 46 */            int i32 = i + 1;
/* 48 */            int iCharAt6 = str.charAt(i);
/* 52 */            if (iCharAt6 >= 55296) {
/* 54 */                int i33 = iCharAt6 & 8191;
/* 56 */                int i34 = 13;
                        while (true) {
/* 58 */                    i29 = i32 + 1;
/* 60 */                    cCharAt13 = str.charAt(i32);
/* 64 */                    if (cCharAt13 < 55296) {
                                break;
                            }
/* 69 */                    i33 |= (cCharAt13 & 8191) << i34;
/* 70 */                    i34 += 13;
/* 72 */                    i32 = i29;
                        }
/* 75 */                iCharAt6 = i33 | (cCharAt13 << i34);
/* 76 */                i32 = i29;
                    }
/* 77 */            if (iCharAt6 == 0) {
/* 79 */                iArr = I000oI1ioi;
/* 83 */                iCharAt5 = 0;
/* 84 */                iCharAt = 0;
/* 85 */                iCharAt2 = 0;
/* 86 */                iCharAt3 = 0;
/* 87 */                iCharAt4 = 0;
/* 88 */                i3 = 0;
                    } else {
/* 91 */                int i35 = i32 + 1;
/* 93 */                int iCharAt7 = str.charAt(i32);
/* 97 */                if (iCharAt7 >= 55296) {
/* 99 */                    int i36 = iCharAt7 & 8191;
/* 101 */                   int i37 = 13;
                            while (true) {
/* 103 */                       i11 = i35 + 1;
/* 105 */                       cCharAt8 = str.charAt(i35);
/* 109 */                       if (cCharAt8 < 55296) {
                                    break;
                                }
/* 114 */                       i36 |= (cCharAt8 & 8191) << i37;
/* 115 */                       i37 += 13;
/* 117 */                       i35 = i11;
                            }
/* 120 */                   iCharAt7 = i36 | (cCharAt8 << i37);
/* 121 */                   i35 = i11;
                        }
/* 122 */               int i38 = i35 + 1;
/* 124 */               int iCharAt8 = str.charAt(i35);
/* 128 */               if (iCharAt8 >= 55296) {
/* 130 */                   int i39 = iCharAt8 & 8191;
/* 132 */                   int i40 = 13;
                            while (true) {
/* 134 */                       i10 = i38 + 1;
/* 136 */                       cCharAt7 = str.charAt(i38);
/* 140 */                       if (cCharAt7 < 55296) {
                                    break;
                                }
/* 145 */                       i39 |= (cCharAt7 & 8191) << i40;
/* 146 */                       i40 += 13;
/* 148 */                       i38 = i10;
                            }
/* 151 */                   iCharAt8 = i39 | (cCharAt7 << i40);
/* 152 */                   i38 = i10;
                        }
/* 153 */               int i41 = i38 + 1;
/* 155 */               iCharAt = str.charAt(i38);
/* 159 */               if (iCharAt >= 55296) {
/* 161 */                   int i42 = iCharAt & 8191;
/* 163 */                   int i43 = 13;
                            while (true) {
/* 165 */                       i9 = i41 + 1;
/* 167 */                       cCharAt6 = str.charAt(i41);
/* 171 */                       if (cCharAt6 < 55296) {
                                    break;
                                }
/* 176 */                       i42 |= (cCharAt6 & 8191) << i43;
/* 177 */                       i43 += 13;
/* 179 */                       i41 = i9;
                            }
/* 182 */                   iCharAt = i42 | (cCharAt6 << i43);
/* 183 */                   i41 = i9;
                        }
/* 184 */               int i44 = i41 + 1;
/* 186 */               iCharAt2 = str.charAt(i41);
/* 190 */               if (iCharAt2 >= 55296) {
/* 192 */                   int i45 = iCharAt2 & 8191;
/* 194 */                   int i46 = 13;
                            while (true) {
/* 196 */                       i8 = i44 + 1;
/* 198 */                       cCharAt5 = str.charAt(i44);
/* 202 */                       if (cCharAt5 < 55296) {
                                    break;
                                }
/* 207 */                       i45 |= (cCharAt5 & 8191) << i46;
/* 208 */                       i46 += 13;
/* 210 */                       i44 = i8;
                            }
/* 213 */                   iCharAt2 = i45 | (cCharAt5 << i46);
/* 214 */                   i44 = i8;
                        }
/* 215 */               int i47 = i44 + 1;
/* 217 */               iCharAt3 = str.charAt(i44);
/* 221 */               if (iCharAt3 >= 55296) {
/* 223 */                   int i48 = iCharAt3 & 8191;
/* 225 */                   int i49 = 13;
                            while (true) {
/* 227 */                       i7 = i47 + 1;
/* 229 */                       cCharAt4 = str.charAt(i47);
/* 233 */                       if (cCharAt4 < 55296) {
                                    break;
                                }
/* 238 */                       i48 |= (cCharAt4 & 8191) << i49;
/* 239 */                       i49 += 13;
/* 241 */                       i47 = i7;
                            }
/* 245 */                   iCharAt3 = i48 | (cCharAt4 << i49);
/* 246 */                   i47 = i7;
                        }
/* 248 */               int i50 = i47 + 1;
/* 250 */               iCharAt4 = str.charAt(i47);
/* 254 */               if (iCharAt4 >= 55296) {
/* 256 */                   int i51 = iCharAt4 & 8191;
/* 258 */                   int i52 = 13;
                            while (true) {
/* 260 */                       i6 = i50 + 1;
/* 262 */                       cCharAt3 = str.charAt(i50);
/* 266 */                       if (cCharAt3 < 55296) {
                                    break;
                                }
/* 272 */                       i51 |= (cCharAt3 & 8191) << i52;
/* 273 */                       i52 += 13;
/* 275 */                       i50 = i6;
                            }
/* 280 */                   iCharAt4 = i51 | (cCharAt3 << i52);
/* 281 */                   i50 = i6;
                        }
/* 283 */               int i53 = i50 + 1;
/* 285 */               int iCharAt9 = str.charAt(i50);
/* 289 */               if (iCharAt9 >= 55296) {
/* 291 */                   int i54 = iCharAt9 & 8191;
/* 295 */                   int i55 = i53;
/* 297 */                   int i56 = 13;
                            while (true) {
/* 299 */                       i5 = i55 + 1;
/* 301 */                       cCharAt2 = str.charAt(i55);
/* 305 */                       if (cCharAt2 < 55296) {
                                    break;
                                }
/* 311 */                       i54 |= (cCharAt2 & 8191) << i56;
/* 312 */                       i56 += 13;
/* 314 */                       i55 = i5;
                            }
/* 319 */                   iCharAt9 = i54 | (cCharAt2 << i56);
/* 320 */                   i2 = i5;
                        } else {
/* 325 */                   i2 = i53;
                        }
/* 327 */               int i57 = i2 + 1;
/* 329 */               iCharAt5 = str.charAt(i2);
/* 333 */               if (iCharAt5 >= 55296) {
/* 335 */                   int i58 = iCharAt5 & 8191;
/* 337 */                   int i59 = i57;
/* 339 */                   int i60 = 13;
                            while (true) {
/* 341 */                       i4 = i59 + 1;
/* 343 */                       cCharAt = str.charAt(i59);
/* 347 */                       if (cCharAt < 55296) {
                                    break;
                                }
/* 353 */                       i58 |= (cCharAt & 8191) << i60;
/* 354 */                       i60 += 13;
/* 356 */                       i59 = i4;
                            }
/* 361 */                   iCharAt5 = i58 | (cCharAt << i60);
/* 362 */                   i57 = i4;
                        }
/* 367 */               int[] iArr2 = new int[iCharAt5 + iCharAt4 + iCharAt9];
/* 371 */               i3 = (iCharAt7 * 2) + iCharAt8;
/* 372 */               iArr = iArr2;
/* 373 */               i30 = iCharAt7;
/* 374 */               i32 = i57;
                    }
/* 376 */           Object[] objArr = oOl1oi1OO.I0000Il00O;
/* 378 */           Class<?> cls = i01Iio10lo.getClass();
/* 384 */           int[] iArr3 = new int[iCharAt3 * 3];
/* 388 */           Object[] objArr2 = new Object[iCharAt3 * 2];
/* 390 */           int i61 = iCharAt4 + iCharAt5;
/* 391 */           int i62 = iCharAt5;
/* 393 */           int i63 = i61;
/* 395 */           int i64 = 0;
/* 397 */           int i65 = 0;
/* 399 */           while (i32 < length) {
/* 401 */               int i66 = i32 + 1;
/* 403 */               int iCharAt10 = str.charAt(i32);
/* 407 */               Object[] objArr3 = objArr;
/* 412 */               if (iCharAt10 >= 55296) {
/* 414 */                   int i67 = iCharAt10 & 8191;
/* 416 */                   int i68 = i66;
/* 418 */                   int i69 = 13;
                            while (true) {
/* 420 */                       i28 = i68 + 1;
/* 422 */                       cCharAt12 = str.charAt(i68);
/* 426 */                       i12 = i30;
/* 431 */                       if (cCharAt12 < 55296) {
                                    break;
                                }
/* 437 */                       i67 |= (cCharAt12 & 8191) << i69;
/* 438 */                       i69 += 13;
/* 440 */                       i68 = i28;
/* 442 */                       i30 = i12;
                            }
/* 447 */                   iCharAt10 = i67 | (cCharAt12 << i69);
/* 448 */                   i13 = i28;
                        } else {
/* 451 */                   i12 = i30;
/* 453 */                   i13 = i66;
                        }
/* 455 */               int i70 = i13 + 1;
/* 457 */               int iCharAt11 = str.charAt(i13);
/* 466 */               if (iCharAt11 >= 55296) {
/* 468 */                   int i71 = iCharAt11 & 8191;
/* 470 */                   int i72 = i70;
/* 472 */                   int i73 = 13;
                            while (true) {
/* 474 */                       i26 = i72 + 1;
/* 476 */                       cCharAt11 = str.charAt(i72);
/* 480 */                       i27 = i71;
/* 485 */                       if (cCharAt11 < 55296) {
                                    break;
                                }
/* 491 */                       i71 = i27 | ((cCharAt11 & 8191) << i73);
/* 493 */                       i73 += 13;
/* 495 */                       i72 = i26;
                            }
/* 500 */                   iCharAt11 = i27 | (cCharAt11 << i73);
/* 502 */                   i14 = i26;
                        } else {
/* 505 */                   i14 = i70;
                        }
/* 507 */               int i74 = length;
/* 509 */               int i75 = iCharAt11 & 255;
/* 511 */               int i76 = iCharAt10;
/* 515 */               if ((iCharAt11 & Barcode.FORMAT_UPC_E) != 0) {
/* 519 */                   iArr[i64] = i65;
/* 517 */                   i64++;
                        }
/* 525 */               int i77 = i3;
/* 527 */               Unsafe unsafe = I00100l0;
/* 529 */               if (i75 >= 51) {
/* 531 */                   int i78 = i14 + 1;
/* 533 */                   int iCharAt12 = str.charAt(i14);
/* 542 */                   if (iCharAt12 >= 55296) {
/* 544 */                       int i79 = iCharAt12 & 8191;
/* 546 */                       int i80 = i78;
/* 548 */                       int i81 = 13;
                                while (true) {
/* 550 */                           i24 = i80 + 1;
/* 552 */                           cCharAt10 = str.charAt(i80);
/* 556 */                           i25 = i79;
/* 561 */                           if (cCharAt10 < 55296) {
                                        break;
                                    }
/* 567 */                           i79 = i25 | ((cCharAt10 & 8191) << i81);
/* 569 */                           i81 += 13;
/* 571 */                           i80 = i24;
                                }
/* 576 */                       iCharAt12 = i25 | (cCharAt10 << i81);
/* 578 */                       i22 = i24;
                            } else {
/* 581 */                       i22 = i78;
                            }
/* 583 */                   int i82 = iCharAt12;
                            int i83 = i75 - 51;
/* 587 */                   i18 = i22;
/* 591 */                   if (i83 == 9 || i83 == 17) {
/* 626 */                       i23 = i77 + 1;
/* 630 */                       objArr2[((i65 / 3) * 2) + 1] = objArr3[i77];
                            } else if (i83 != 12 || z2) {
/* 617 */                       i23 = i77;
                            } else {
/* 610 */                       i23 = i77 + 1;
/* 614 */                       objArr2[((i65 / 3) * 2) + 1] = objArr3[i77];
                            }
/* 632 */                   int i84 = i82 * 2;
/* 636 */                   Object obj = objArr3[i84];
/* 638 */                   int i85 = i23;
/* 642 */                   if (obj instanceof Field) {
/* 644 */                       fieldI00IlilI0i0i2 = (Field) obj;
                            } else {
/* 650 */                       fieldI00IlilI0i0i2 = I00IlilI0i0i(cls, (String) obj);
/* 654 */                       objArr3[i84] = fieldI00IlilI0i0i2;
                            }
/* 646 */                   int i86 = iCharAt5;
/* 661 */                   int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldI00IlilI0i0i2);
/* 662 */                   int i87 = i84 + 1;
/* 666 */                   Object obj2 = objArr3[i87];
/* 672 */                   if (obj2 instanceof Field) {
/* 674 */                       fieldI00IlilI0i0i3 = (Field) obj2;
                            } else {
/* 679 */                       fieldI00IlilI0i0i3 = I00IlilI0i0i(cls, (String) obj2);
/* 683 */                       objArr3[i87] = fieldI00IlilI0i0i3;
                            }
/* 689 */                   iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldI00IlilI0i0i3);
/* 691 */                   i15 = i86;
/* 693 */                   i20 = iObjectFieldOffset3;
/* 695 */                   i3 = i85;
/* 700 */                   z = z2;
/* 701 */                   i19 = 0;
                        } else {
/* 704 */                   int i88 = iCharAt5;
/* 705 */                   int i89 = i77 + 1;
/* 715 */                   Field fieldI00IlilI0i0i4 = I00IlilI0i0i(cls, (String) objArr3[i77]);
/* 719 */                   i15 = i88;
/* 723 */                   if (i75 == 9 || i75 == 17) {
/* 832 */                       objArr2[((i65 / 3) * 2) + 1] = fieldI00IlilI0i0i4.getType();
                            } else {
/* 732 */                       if (i75 == 27 || i75 == 49) {
/* 815 */                           i16 = i77 + 2;
/* 819 */                           objArr2[((i65 / 3) * 2) + 1] = objArr3[i89];
                                } else {
/* 741 */                           if (i75 == 12 || i75 == 30 || i75 == 44) {
/* 794 */                               if (!z2) {
/* 802 */                                   i16 = i77 + 2;
/* 806 */                                   objArr2[((i65 / 3) * 2) + 1] = objArr3[i89];
                                        }
                                    } else if (i75 == 50) {
/* 756 */                               int i90 = i62 + 1;
/* 758 */                               iArr[i62] = i65;
/* 762 */                               int i91 = (i65 / 3) * 2;
/* 764 */                               i16 = i77 + 2;
/* 768 */                               objArr2[i91] = objArr3[i89];
/* 774 */                               if ((iCharAt11 & Barcode.FORMAT_PDF417) != 0) {
/* 782 */                                   objArr2[i91 + 1] = objArr3[i16];
/* 778 */                                   i16 = i77 + 3;
/* 786 */                                   i62 = i90;
                                        } else {
/* 790 */                                   z = z2;
/* 791 */                                   i62 = i90;
                                        }
                                    }
/* 841 */                           int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldI00IlilI0i0i4);
/* 848 */                           if ((iCharAt11 & Barcode.FORMAT_AZTEC) != 4096 || i75 > 17) {
/* 934 */                               iObjectFieldOffset = 1048575;
/* 937 */                               i17 = 0;
                                    } else {
/* 854 */                               int i92 = i14 + 1;
/* 856 */                               int iCharAt13 = str.charAt(i14);
/* 863 */                               if (iCharAt13 >= 55296) {
/* 865 */                                   int i93 = iCharAt13 & 8191;
/* 867 */                                   int i94 = 13;
                                            while (true) {
/* 869 */                                       i21 = i92 + 1;
/* 871 */                                       cCharAt9 = str.charAt(i92);
/* 875 */                                       if (cCharAt9 < 55296) {
                                                    break;
                                                }
/* 881 */                                       i93 |= (cCharAt9 & 8191) << i94;
/* 882 */                                       i94 += 13;
/* 884 */                                       i92 = i21;
                                            }
/* 889 */                                   iCharAt13 = i93 | (cCharAt9 << i94);
                                        } else {
/* 891 */                                   i21 = i92;
                                        }
/* 897 */                               int i95 = (iCharAt13 / 32) + (i12 * 2);
/* 899 */                               Object obj3 = objArr3[i95];
/* 903 */                               if (obj3 instanceof Field) {
/* 905 */                                   fieldI00IlilI0i0i = (Field) obj3;
                                        } else {
/* 911 */                                   fieldI00IlilI0i0i = I00IlilI0i0i(cls, (String) obj3);
/* 915 */                                   objArr3[i95] = fieldI00IlilI0i0i;
                                        }
/* 907 */                               int i96 = iCharAt13;
/* 922 */                               iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldI00IlilI0i0i);
/* 923 */                               i17 = i96 % 32;
/* 925 */                               i14 = i21;
                                    }
/* 940 */                           if (i75 >= 18 || i75 > 49) {
/* 961 */                               i18 = i14;
                                    } else {
/* 948 */                               iArr[i63] = iObjectFieldOffset4;
/* 950 */                               i18 = i14;
/* 946 */                               i63++;
                                    }
/* 954 */                           i3 = i16;
/* 956 */                           iObjectFieldOffset2 = iObjectFieldOffset;
/* 957 */                           i19 = i17;
/* 958 */                           i20 = iObjectFieldOffset4;
                                }
/* 788 */                       z = z2;
/* 841 */                       int iObjectFieldOffset42 = (int) unsafe.objectFieldOffset(fieldI00IlilI0i0i4);
/* 848 */                       if ((iCharAt11 & Barcode.FORMAT_AZTEC) != 4096) {
/* 934 */                           iObjectFieldOffset = 1048575;
/* 937 */                           i17 = 0;
/* 940 */                           if (i75 >= 18) {
/* 961 */                               i18 = i14;
/* 954 */                               i3 = i16;
/* 956 */                               iObjectFieldOffset2 = iObjectFieldOffset;
/* 957 */                               i19 = i17;
/* 958 */                               i20 = iObjectFieldOffset42;
                                    }
                                }
                            }
/* 834 */                   z = z2;
/* 835 */                   i16 = i89;
/* 841 */                   int iObjectFieldOffset422 = (int) unsafe.objectFieldOffset(fieldI00IlilI0i0i4);
/* 848 */                   if ((iCharAt11 & Barcode.FORMAT_AZTEC) != 4096) {
                            }
                        }
/* 964 */               int i97 = i65 + 1;
/* 966 */               iArr3[i65] = i76;
/* 968 */               int i98 = i65 + 2;
/* 970 */               int i99 = i19;
/* 993 */               iArr3[i97] = ((iCharAt11 & Barcode.FORMAT_QR_CODE) != 0 ? 268435456 : 0) | ((iCharAt11 & Barcode.FORMAT_UPC_A) != 0 ? 536870912 : 0) | (i75 << 20) | i20;
/* 995 */               i65 += 3;
/* 1000 */              iArr3[i98] = (i99 << 20) | iObjectFieldOffset2;
/* 1002 */              objArr = objArr3;
/* 1004 */              z2 = z;
/* 1005 */              length = i74;
/* 1007 */              i30 = i12;
/* 1009 */              iCharAt5 = i15;
/* 1011 */              i32 = i18;
                    }
/* 1020 */          O1lIoI o1lIoI = new O1lIoI();
/* 1023 */          o1lIoI.I00000oIO = iArr3;
/* 1025 */          o1lIoI.I00000oOI = objArr2;
/* 1027 */          o1lIoI.I0000Il00O = iCharAt;
/* 1029 */          o1lIoI.I0000O = iCharAt2;
/* 1033 */          o1lIoI.I0001Ioi1lo = i01Iio10lo instanceof Io00Io0IO11;
/* 1035 */          o1lIoI.I000II = z2;
/* 1037 */          o1lIoI.I000O01llI0 = iArr;
/* 1041 */          o1lIoI.I000OOo1O = iCharAt5;
/* 1043 */          o1lIoI.I000OiO = i61;
/* 1047 */          o1lIoI.I000iOII = oIIOo1oii;
/* 1051 */          o1lIoI.I000l1 = o101ol1lilo0;
/* 1055 */          o1lIoI.I000lI = ooiO0li;
/* 1057 */          o1lIoI.I0000oI00 = i01Iio10lo;
/* 1061 */          o1lIoI.I000o00OoI0I = o1Oi10;
/* 1063 */          VarHandle.storeStoreFence();
/* 1066 */          return o1lIoI;
                }

                public static long I001l0I00(int i) {
/* 5 */             return i & 1048575;
                }

                public static int I001lIiIIo1O(long j, Object obj) {
/* 7 */             return ((Integer) Ooil11Oi.I000OiO(j, obj)).intValue();
                }

                public static long I001lllioOl(long j, Object obj) {
/* 7 */             return ((Long) Ooil11Oi.I000OiO(j, obj)).longValue();
                }

                public static Field I00IlilI0i0i(Class cls, String str) {
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

                public static int I00Iooi00oi(int i) {
/* 4 */             return (i & 267386880) >>> 20;
                }

                public static void I00O0o1oo(int i, Object obj, iiOlilo0IIIl iiolilo0iiil) throws IOO1IOl1O10 {
/* 3 */             if (!(obj instanceof String)) {
/* 127 */               iiolilo0iiil.I00IoiI(i, (IIOI1Ii1I) obj);
/* 215 */               return;
                    }
/* 5 */             String str = (String) obj;
/* 9 */             IOOOi1I1I1 iOOOi1I1I1 = (IOOOi1I1I1) iiolilo0iiil.I00iOIl;
/* 12 */            iOOOi1I1I1.I00100o1O0lo(i, 2);
/* 15 */            int i2 = iOOOi1I1I1.I0000Il00O;
/* 17 */            byte[] bArr = iOOOi1I1I1.I00000oOI;
/* 19 */            int i3 = iOOOi1I1I1.I0000O;
                    try {
/* 27 */                int iI000OOo1O = IOOOi1I1I1.I000OOo1O(str.length() * 3);
/* 35 */                int iI000OOo1O2 = IOOOi1I1I1.I000OOo1O(str.length());
/* 39 */                if (iI000OOo1O2 != iI000OOo1O) {
/* 69 */                    iOOOi1I1I1.I0010I0i(Oolio1l.I00000oIO(str));
/* 72 */                    int i4 = iOOOi1I1I1.I0000O;
/* 81 */                    iOOOi1I1I1.I0000O = Oolio1l.I00000oIO.I00000oOI(str, bArr, i4, i2 - i4);
/* 83 */                    return;
                        }
/* 41 */                int i5 = i3 + iI000OOo1O2;
/* 43 */                iOOOi1I1I1.I0000O = i5;
/* 48 */                int iI00000oOI = Oolio1l.I00000oIO.I00000oOI(str, bArr, i5, i2 - i5);
/* 52 */                iOOOi1I1I1.I0000O = i3;
/* 57 */                iOOOi1I1I1.I0010I0i((iI00000oOI - i3) - iI000OOo1O2);
/* 60 */                iOOOi1I1I1.I0000O = iI00000oOI;
                    } catch (Oolii1 e) {
/* 91 */                iOOOi1I1I1.I0000O = i3;
/* 99 */                IOOOi1I1I1.I0000oI00.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
/* 104 */               byte[] bytes = str.getBytes(Iool1iOO11.I00000oIO);
                        try {
/* 109 */                   iOOOi1I1I1.I0010I0i(bytes.length);
/* 114 */                   iOOOi1I1I1.I000lI(bytes, 0, bytes.length);
                        } catch (IndexOutOfBoundsException e2) {
/* 124 */                   throw new IOO1IOl1O10(e2);
                        }
                    } catch (IndexOutOfBoundsException e3) {
/* 90 */                throw new IOO1IOl1O10(e3);
                    }
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00000oIO(Object obj, Object obj2) {
                    Object obj3;
/* 1 */             int[] iArr = this.I00000oIO;
/* 3 */             I000l1(obj);
/* 6 */             obj2.getClass();
/* 9 */             int i = 0;
/* 11 */            while (i < iArr.length) {
/* 13 */                int iI00O0i0ii = I00O0i0ii(i);
/* 20 */                long j = 1048575 & iI00O0i0ii;
/* 22 */                int i2 = iArr[i];
                        switch (I00Iooi00oi(iI00O0i0ii)) {
                            case 0:
/* 389 */                       if (!I00100o1O0lo(i, obj2)) {
/* 35 */                            obj3 = obj;
                                    break;
                                } else {
/* 391 */                           Ooil0oIOI0l0 ooil0oIOI0l0 = Ooil11Oi.I0000Il00O;
/* 397 */                           obj3 = obj;
/* 398 */                           ooil0oIOI0l0.I000II(obj3, j, ooil0oIOI0l0.I0000Il00O(j, obj2));
/* 401 */                           I00Io1lO(i, obj3);
                                    break;
                                }
                            case 1:
/* 369 */                       if (I00100o1O0lo(i, obj2)) {
/* 371 */                           Ooil0oIOI0l0 ooil0oIOI0l02 = Ooil11Oi.I0000Il00O;
/* 377 */                           ooil0oIOI0l02.I000O01llI0(obj, j, ooil0oIOI0l02.I0000O(j, obj2));
/* 380 */                           I00Io1lO(i, obj);
                                }
/* 35 */                        obj3 = obj;
                                break;
                            case 2:
/* 351 */                       if (I00100o1O0lo(i, obj2)) {
/* 357 */                           Ooil11Oi.I00100l0(obj, j, Ooil11Oi.I000OOo1O(j, obj2));
/* 360 */                           I00Io1lO(i, obj);
                                }
/* 35 */                        obj3 = obj;
                                break;
                            case 3:
/* 333 */                       if (I00100o1O0lo(i, obj2)) {
/* 339 */                           Ooil11Oi.I00100l0(obj, j, Ooil11Oi.I000OOo1O(j, obj2));
/* 342 */                           I00Io1lO(i, obj);
                                }
/* 35 */                        obj3 = obj;
                                break;
                            case 4:
/* 315 */                       if (I00100o1O0lo(i, obj2)) {
/* 321 */                           Ooil11Oi.I000oI1ioi(obj, Ooil11Oi.I000O01llI0(j, obj2), j);
/* 324 */                           I00Io1lO(i, obj);
                                }
/* 35 */                        obj3 = obj;
                                break;
                            case 5:
/* 297 */                       if (I00100o1O0lo(i, obj2)) {
/* 303 */                           Ooil11Oi.I00100l0(obj, j, Ooil11Oi.I000OOo1O(j, obj2));
/* 306 */                           I00Io1lO(i, obj);
                                }
/* 35 */                        obj3 = obj;
                                break;
                            case 6:
/* 279 */                       if (I00100o1O0lo(i, obj2)) {
/* 285 */                           Ooil11Oi.I000oI1ioi(obj, Ooil11Oi.I000O01llI0(j, obj2), j);
/* 288 */                           I00Io1lO(i, obj);
                                }
/* 35 */                        obj3 = obj;
                                break;
                            case 7:
/* 259 */                       if (I00100o1O0lo(i, obj2)) {
/* 261 */                           Ooil0oIOI0l0 ooil0oIOI0l03 = Ooil11Oi.I0000Il00O;
/* 267 */                           ooil0oIOI0l03.I0000oI00(obj, j, ooil0oIOI0l03.I00000oIO(j, obj2));
/* 270 */                           I00Io1lO(i, obj);
                                }
/* 35 */                        obj3 = obj;
                                break;
                            case 8:
/* 241 */                       if (I00100o1O0lo(i, obj2)) {
/* 247 */                           Ooil11Oi.I00100o1O0lo(obj, j, Ooil11Oi.I000OiO(j, obj2));
/* 250 */                           I00Io1lO(i, obj);
                                }
/* 35 */                        obj3 = obj;
                                break;
                            case 9:
/* 232 */                       I001IIilI0O(i, obj, obj2);
/* 35 */                        obj3 = obj;
                                break;
                            case 10:
/* 218 */                       if (I00100o1O0lo(i, obj2)) {
/* 224 */                           Ooil11Oi.I00100o1O0lo(obj, j, Ooil11Oi.I000OiO(j, obj2));
/* 227 */                           I00Io1lO(i, obj);
                                }
/* 35 */                        obj3 = obj;
                                break;
                            case 11:
/* 200 */                       if (I00100o1O0lo(i, obj2)) {
/* 206 */                           Ooil11Oi.I000oI1ioi(obj, Ooil11Oi.I000O01llI0(j, obj2), j);
/* 209 */                           I00Io1lO(i, obj);
                                }
/* 35 */                        obj3 = obj;
                                break;
                            case 12:
/* 182 */                       if (I00100o1O0lo(i, obj2)) {
/* 188 */                           Ooil11Oi.I000oI1ioi(obj, Ooil11Oi.I000O01llI0(j, obj2), j);
/* 191 */                           I00Io1lO(i, obj);
                                }
/* 35 */                        obj3 = obj;
                                break;
                            case 13:
/* 164 */                       if (I00100o1O0lo(i, obj2)) {
/* 170 */                           Ooil11Oi.I000oI1ioi(obj, Ooil11Oi.I000O01llI0(j, obj2), j);
/* 173 */                           I00Io1lO(i, obj);
                                }
/* 35 */                        obj3 = obj;
                                break;
                            case 14:
/* 147 */                       if (I00100o1O0lo(i, obj2)) {
/* 153 */                           Ooil11Oi.I00100l0(obj, j, Ooil11Oi.I000OOo1O(j, obj2));
/* 156 */                           I00Io1lO(i, obj);
                                }
/* 35 */                        obj3 = obj;
                                break;
                            case 15:
/* 130 */                       if (I00100o1O0lo(i, obj2)) {
/* 136 */                           Ooil11Oi.I000oI1ioi(obj, Ooil11Oi.I000O01llI0(j, obj2), j);
/* 139 */                           I00Io1lO(i, obj);
                                }
/* 35 */                        obj3 = obj;
                                break;
                            case 16:
/* 113 */                       if (I00100o1O0lo(i, obj2)) {
/* 119 */                           Ooil11Oi.I00100l0(obj, j, Ooil11Oi.I000OOo1O(j, obj2));
/* 122 */                           I00Io1lO(i, obj);
                                }
/* 35 */                        obj3 = obj;
                                break;
                            case 17:
/* 105 */                       I001IIilI0O(i, obj, obj2);
/* 35 */                        obj3 = obj;
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
/* 101 */                       this.I000l1.I00000oOI(obj, j, obj2);
/* 35 */                        obj3 = obj;
                                break;
                            case 50:
/* 76 */                        O1Oi10 o1Oi10 = this.I000o00OoI0I;
/* 78 */                        Class cls = OiOO0o1I0.I00000oIO;
/* 80 */                        Object objI000OiO = Ooil11Oi.I000OiO(j, obj);
/* 84 */                        Object objI000OiO2 = Ooil11Oi.I000OiO(j, obj2);
/* 88 */                        o1Oi10.getClass();
/* 95 */                        Ooil11Oi.I00100o1O0lo(obj, j, O1Oi10.I00000oOI(objI000OiO, objI000OiO2));
/* 35 */                        obj3 = obj;
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
/* 63 */                        if (I0010o(obj2, i2, i)) {
/* 69 */                            Ooil11Oi.I00100o1O0lo(obj, j, Ooil11Oi.I000OiO(j, obj2));
/* 72 */                            I00Io1o110i(obj, i2, i);
                                }
/* 35 */                        obj3 = obj;
                                break;
                            case 60:
/* 55 */                        I001IO000(i, obj, obj2);
/* 35 */                        obj3 = obj;
                                break;
                            case 61:
                            case 62:
                            case 63:
                            case Barcode.FORMAT_EAN_8:
                            case 65:
                            case 66:
                            case 67:
/* 42 */                        if (I0010o(obj2, i2, i)) {
/* 48 */                            Ooil11Oi.I00100o1O0lo(obj, j, Ooil11Oi.I000OiO(j, obj2));
/* 51 */                            I00Io1o110i(obj, i2, i);
                                }
/* 35 */                        obj3 = obj;
                                break;
                            case 68:
/* 32 */                        I001IO000(i, obj, obj2);
/* 35 */                        obj3 = obj;
                                break;
                        }
/* 404 */               i += 3;
/* 406 */               obj = obj3;
                    }
/* 412 */           OiOO0o1I0.I001i1O0Ol(this.I000lI, obj, obj2);
                }

                /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00000oOI(Object obj) {
/* 5 */             if (I0010I0i(obj)) {
/* 11 */                if (obj instanceof Io00Io0IO11) {
/* 14 */                    Io00Io0IO11 io00Io0IO11 = (Io00Io0IO11) obj;
/* 19 */                    io00Io0IO11.I001i1O0Ol(Integer.MAX_VALUE);
/* 22 */                    io00Io0IO11.memoizedHashCode = 0;
/* 24 */                    io00Io0IO11.I000oI1ioi();
                        }
/* 29 */                int length = this.I00000oIO.length;
/* 31 */                for (int i = 0; i < length; i += 3) {
/* 33 */                    int iI00O0i0ii = I00O0i0ii(i);
/* 40 */                    long j = 1048575 & iI00O0i0ii;
/* 42 */                    int iI00Iooi00oi = I00Iooi00oi(iI00O0i0ii);
/* 48 */                    Unsafe unsafe = I00100l0;
/* 50 */                    if (iI00Iooi00oi != 9) {
                                switch (iI00Iooi00oi) {
                                    case 17:
/* 86 */                                if (I00100o1O0lo(i, obj)) {
/* 96 */                                    I00100l0(i).I00000oOI(unsafe.getObject(obj, j));
                                            break;
                                        } else {
                                            break;
                                        }
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
/* 78 */                                this.I000l1.I00000oIO(j, obj);
                                        break;
                                    case 50:
/* 56 */                                Object object = unsafe.getObject(obj, j);
/* 60 */                                if (object != null) {
/* 64 */                                    this.I000o00OoI0I.getClass();
/* 70 */                                    ((O1OOlii0) object).I00iOIl = false;
/* 72 */                                    unsafe.putObject(obj, j, object);
                                            break;
                                        } else {
                                            break;
                                        }
                                }
                            }
                        }
/* 104 */               this.I000lI.getClass();
/* 111 */               ((Io00Io0IO11) obj).unknownFields.I0000oI00 = false;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I0000Il00O(Object obj) {
/* 1 */             int[] iArr = this.I00000oIO;
/* 7 */             int i = 1048575;
/* 8 */             int i2 = 0;
/* 9 */             int i3 = 0;
                    loop0: while (true) {
/* 12 */                boolean zI00100o1O0lo = true;
/* 13 */                if (i2 >= this.I000OOo1O) {
/* 12 */                    return true;
                        }
/* 17 */                int i4 = this.I000O01llI0[i2];
/* 19 */                int i5 = iArr[i4];
/* 21 */                int iI00O0i0ii = I00O0i0ii(i4);
/* 27 */                int i6 = iArr[i4 + 2];
/* 29 */                int i7 = i6 & 1048575;
/* 33 */                int i8 = 1 << (i6 >>> 20);
/* 35 */                if (i7 != i) {
/* 37 */                    if (i7 != 1048575) {
/* 42 */                        i3 = I00100l0.getInt(obj, i7);
                            }
/* 46 */                    i = i7;
                        }
/* 50 */                if ((268435456 & iI00O0i0ii) != 0) {
/* 66 */                    if (!(i == 1048575 ? I00100o1O0lo(i4, obj) : (i3 & i8) != 0)) {
                                break;
                            }
                        } else {
/* 70 */                    int iI00Iooi00oi = I00Iooi00oi(iI00O0i0ii);
/* 76 */                    if (iI00Iooi00oi == 9 || iI00Iooi00oi == 17) {
/* 200 */                       if (i == 1048575) {
/* 202 */                           zI00100o1O0lo = I00100o1O0lo(i4, obj);
                                } else if ((i3 & i8) == 0) {
/* 212 */                           zI00100o1O0lo = false;
                                }
/* 213 */                       if (zI00100o1O0lo && !I00100l0(i4).I0000Il00O(Ooil11Oi.I000OiO(iI00O0i0ii & 1048575, obj))) {
                                    break;
                                }
/* 233 */                       i2++;
                            } else {
/* 84 */                        if (iI00Iooi00oi != 27) {
/* 88 */                            if (iI00Iooi00oi == 60 || iI00Iooi00oi == 68) {
/* 139 */                               if (I0010o(obj, i5, i4) && !I00100l0(i4).I0000Il00O(Ooil11Oi.I000OiO(iI00O0i0ii & 1048575, obj))) {
                                            break;
                                        }
                                    } else if (iI00Iooi00oi != 49) {
/* 100 */                               if (iI00Iooi00oi != 50) {
                                            continue;
                                        } else {
/* 104 */                                   O1Oi10 o1Oi10 = this.I000o00OoI0I;
/* 109 */                                   Object objI000OiO = Ooil11Oi.I000OiO(iI00O0i0ii & 1048575, obj);
/* 113 */                                   o1Oi10.getClass();
/* 122 */                                   if (!((O1OOlii0) objI000OiO).isEmpty()) {
/* 130 */                                       IIlIOloOOO.I001i1lo1io(I000oI1ioi(i4));
/* 134 */                                       throw null;
                                            }
                                        }
                                    }
/* 233 */                           i2++;
                                }
/* 166 */                       List list = (List) Ooil11Oi.I000OiO(iI00O0i0ii & 1048575, obj);
/* 172 */                       if (list.isEmpty()) {
                                    continue;
                                } else {
/* 175 */                           OiOIiIO0 oiOIiIO0I00100l0 = I00100l0(i4);
/* 184 */                           for (int i9 = 0; i9 < list.size(); i9++) {
/* 194 */                               if (!oiOIiIO0I00100l0.I0000Il00O(list.get(i9))) {
                                            break loop0;
                                        }
                                    }
                                }
/* 233 */                       i2++;
                            }
                        }
                    }
/* 6 */             return false;
                }

                @Override
                public final Object I0000O() {
/* 1 */             OIIOo1oii oIIOo1oii = this.I000iOII;
/* 3 */             I01Iio10lo i01Iio10lo = this.I0000oI00;
/* 5 */             oIIOo1oii.getClass();
/* 10 */            return ((Io00Io0IO11) i01Iio10lo).I0010I0i();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Code restructure failed: missing block: B:239:0x05fa, code lost:
                
                    if (I0010o(r23, r13, r4) != false) goto L240;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:240:0x05fc, code lost:
                
                    r6 = p000.IlIi0I0.I00000oOI(r13, 4, r6);
                    r8 = 4;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:281:0x06ef, code lost:
                
                    if (I0010o(r23, r13, r4) != false) goto L240;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:371:0x095d, code lost:
                
                    if ((r10 & r15) != 0) goto L240;
                 */
                /* JADX WARN: Removed duplicated region for block: B:224:0x05af A[PHI: r6
                  0x05af: PHI (r6v2 int) = 
                  (r6v1 int)
                  (r6v1 int)
                  (r6v1 int)
                  (r6v1 int)
                  (r6v1 int)
                  (r6v1 int)
                  (r6v1 int)
                  (r6v1 int)
                  (r6v1 int)
                  (r6v1 int)
                  (r6v1 int)
                  (r6v1 int)
                  (r6v7 int)
                  (r6v1 int)
                  (r6v1 int)
                  (r6v1 int)
                  (r6v1 int)
                  (r6v1 int)
                  (r6v1 int)
                  (r6v1 int)
                  (r6v1 int)
                  (r6v1 int)
                  (r6v1 int)
                  (r6v1 int)
                  (r6v1 int)
                  (r6v1 int)
                  (r6v8 int)
                  (r6v1 int)
                  (r6v9 int)
                  (r6v1 int)
                  (r6v1 int)
                  (r6v1 int)
                  (r6v1 int)
                  (r6v1 int)
                  (r6v1 int)
                  (r6v1 int)
                  (r6v1 int)
                  (r6v1 int)
                  (r6v12 int)
                  (r6v13 int)
                  (r6v1 int)
                  (r6v14 int)
                  (r6v1 int)
                  (r6v1 int)
                  (r6v1 int)
                  (r6v1 int)
                  (r6v1 int)
                  (r6v18 int)
                  (r6v1 int)
                  (r6v1 int)
                  (r6v1 int)
                  (r6v19 int)
                  (r6v1 int)
                 binds: [B:218:0x0596, B:392:0x09d5, B:386:0x09b1, B:383:0x0997, B:380:0x0987, B:377:0x0975, B:374:0x0963, B:371:0x095d, B:368:0x0957, B:365:0x0940, B:362:0x0927, B:359:0x0913, B:350:0x08ba, B:335:0x0829, B:332:0x0817, B:329:0x0805, B:326:0x07f3, B:323:0x07e1, B:320:0x07cf, B:317:0x07be, B:314:0x07ad, B:311:0x079a, B:308:0x0789, B:305:0x0778, B:302:0x0767, B:299:0x0756, B:297:0x0746, B:295:0x0740, B:293:0x0733, B:286:0x06fb, B:284:0x06f7, B:281:0x06ef, B:278:0x06db, B:275:0x06c7, B:272:0x06b3, B:269:0x06a7, B:266:0x069b, B:263:0x068d, B:261:0x0684, B:259:0x0674, B:255:0x0660, B:253:0x0656, B:251:0x0640, B:248:0x062e, B:245:0x061b, B:242:0x0608, B:239:0x05fa, B:237:0x05ef, B:236:0x05ed, B:232:0x05d4, B:228:0x05b9, B:223:0x05ae, B:221:0x059e] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:237:0x05ef  */
                /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int I0000oI00(Io00Io0IO11 io00Io0IO11) {
                    int i;
                    char c;
                    char c2;
                    int iI000O01llI0;
                    int iI000OiO;
                    int iI0001Ioi1lo;
                    int iI000O01llI02;
                    int iI000II;
                    int iI000O01llI03;
                    int size;
                    int iI000O01llI04;
                    int iI00000oOI;
                    int iI00000oIO;
                    int iI000O01llI05;
                    int iI000OOo1O;
                    int iI000O01llI06;
                    int iI000OiO2;
                    int iI000II2;
                    int iI000O01llI07;
                    int iI0000oI00;
                    int iI000O01llI08;
                    int iI000OiO3;
                    int iI0000O;
                    int iI000O01llI09;
                    int iI000II3;
                    int iI000O01llI010;
                    int size2;
                    int iI000O01llI011;
                    int iI00000oOI2;
                    int iI000II4;
                    int iI000O01llI012;
                    int iI0000oI002;
/* 5 */             OoiO0li ooiO0li = this.I000lI;
/* 7 */             O1Oi10 o1Oi10 = this.I000o00OoI0I;
/* 9 */             boolean z = this.I000II;
/* 11 */            int[] iArr = this.I00000oIO;
/* 16 */            int i2 = 1048575;
/* 19 */            Unsafe unsafe = I00100l0;
/* 21 */            int i3 = 1;
/* 22 */            if (z) {
/* 24 */                int i4 = 0;
/* 25 */                int iI00000oOI3 = 0;
/* 27 */                while (i4 < iArr.length) {
/* 29 */                    int iI00O0i0ii = I00O0i0ii(i4);
/* 33 */                    int iI00Iooi00oi = I00Iooi00oi(iI00O0i0ii);
/* 39 */                    int i5 = iArr[i4];
/* 42 */                    int i6 = i2;
/* 41 */                    long j = iI00O0i0ii & i2;
/* 49 */                    if (iI00Iooi00oi >= IlIOOlOo1lIi.I00iiI.I00iOIl && iI00Iooi00oi <= IlIOOlOo1lIi.I00iiO.I00iOIl) {
/* 59 */                        int i7 = iArr[i4 + 2];
                            }
                            switch (iI00Iooi00oi) {
                                case 0:
/* 1358 */                          if (I00100o1O0lo(i4, io00Io0IO11)) {
/* 146 */                               iI00000oOI3 = IlIi0I0.I00000oOI(i5, 8, iI00000oOI3);
                                        break;
                                    } else {
                                        break;
                                    }
                                case 1:
/* 1350 */                          if (I00100o1O0lo(i4, io00Io0IO11)) {
/* 158 */                               iI00000oOI3 = IlIi0I0.I00000oOI(i5, 4, iI00000oOI3);
                                        break;
                                    } else {
                                        break;
                                    }
                                case 2:
/* 1330 */                          if (I00100o1O0lo(i4, io00Io0IO11)) {
/* 1332 */                              long jI000OOo1O = Ooil11Oi.I000OOo1O(j, io00Io0IO11);
/* 1336 */                              iI000O01llI08 = IOOOi1I1I1.I000O01llI0(i5);
/* 1340 */                              iI000OiO3 = IOOOi1I1I1.I000OiO(jI000OOo1O);
/* 113 */                               iI00000oOI3 += iI000OiO3 + iI000O01llI08;
                                        break;
                                    } else {
                                        break;
                                    }
                                case 3:
/* 1310 */                          if (I00100o1O0lo(i4, io00Io0IO11)) {
/* 1312 */                              long jI000OOo1O2 = Ooil11Oi.I000OOo1O(j, io00Io0IO11);
/* 1316 */                              iI000O01llI08 = IOOOi1I1I1.I000O01llI0(i5);
/* 1320 */                              iI000OiO3 = IOOOi1I1I1.I000OiO(jI000OOo1O2);
/* 113 */                               iI00000oOI3 += iI000OiO3 + iI000O01llI08;
                                        break;
                                    } else {
                                        break;
                                    }
                                case 4:
/* 1290 */                          if (I00100o1O0lo(i4, io00Io0IO11)) {
/* 1292 */                              int iI000O01llI013 = Ooil11Oi.I000O01llI0(j, io00Io0IO11);
/* 1296 */                              iI000O01llI08 = IOOOi1I1I1.I000O01llI0(i5);
/* 1300 */                              iI000OiO3 = IOOOi1I1I1.I0001Ioi1lo(iI000O01llI013);
/* 113 */                               iI00000oOI3 += iI000OiO3 + iI000O01llI08;
                                        break;
                                    } else {
                                        break;
                                    }
                                case 5:
/* 1278 */                          if (I00100o1O0lo(i4, io00Io0IO11)) {
/* 1280 */                              iI0000O = IOOOi1I1I1.I0000O(i5);
/* 86 */                                iI00000oOI3 += iI0000O;
                                        break;
                                    } else {
                                        break;
                                    }
                                case 6:
/* 1266 */                          if (I00100o1O0lo(i4, io00Io0IO11)) {
/* 1268 */                              iI0000O = IOOOi1I1I1.I0000Il00O(i5);
/* 86 */                                iI00000oOI3 += iI0000O;
                                        break;
                                    } else {
                                        break;
                                    }
                                case 7:
/* 1247 */                          int i8 = i3;
/* 1253 */                          if (I00100o1O0lo(i4, io00Io0IO11)) {
/* 1257 */                              iI00000oOI3 = IlIi0I0.I00000oOI(i5, i8, iI00000oOI3);
                                        break;
                                    } else {
                                        break;
                                    }
                                case 8:
/* 1213 */                          if (I00100o1O0lo(i4, io00Io0IO11)) {
/* 1215 */                              Object objI000OiO = Ooil11Oi.I000OiO(j, io00Io0IO11);
/* 1221 */                              if (objI000OiO instanceof IIOI1Ii1I) {
/* 1225 */                                  iI000O01llI010 = IOOOi1I1I1.I000O01llI0(i5);
/* 1229 */                                  size2 = ((IIOI1Ii1I) objI000OiO).size();
/* 276 */                                   iI00000oOI3 = IlIi0I0.I0000Il00O(size2, size2, iI000O01llI010, iI00000oOI3);
                                            break;
                                        } else {
/* 1237 */                                  iI000O01llI09 = IOOOi1I1I1.I000O01llI0(i5);
/* 1241 */                                  iI000II3 = IOOOi1I1I1.I000II((String) objI000OiO);
/* 294 */                                   iI00000oOI3 = iI000II3 + iI000O01llI09 + iI00000oOI3;
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                case 9:
/* 1183 */                          if (I00100o1O0lo(i4, io00Io0IO11)) {
/* 1185 */                              Object objI000OiO2 = Ooil11Oi.I000OiO(j, io00Io0IO11);
/* 1189 */                              OiOIiIO0 oiOIiIO0I00100l0 = I00100l0(i4);
/* 1193 */                              Class cls = OiOO0o1I0.I00000oIO;
/* 1197 */                              iI000O01llI011 = IOOOi1I1I1.I000O01llI0(i5);
/* 1201 */                              iI00000oOI2 = ((I01Iio10lo) objI000OiO2).I00000oOI(oiOIiIO0I00100l0);
/* 246 */                               iI00000oOI3 = IlIi0I0.I0000Il00O(iI00000oOI2, iI00000oOI2, iI000O01llI011, iI00000oOI3);
                                        break;
                                    } else {
                                        break;
                                    }
                                case 10:
/* 1163 */                          if (I00100o1O0lo(i4, io00Io0IO11)) {
/* 1171 */                              iI0000O = IOOOi1I1I1.I00000oIO(i5, (IIOI1Ii1I) Ooil11Oi.I000OiO(j, io00Io0IO11));
/* 86 */                                iI00000oOI3 += iI0000O;
                                        break;
                                    } else {
                                        break;
                                    }
                                case 11:
/* 1141 */                          if (I00100o1O0lo(i4, io00Io0IO11)) {
/* 1143 */                              int iI000O01llI014 = Ooil11Oi.I000O01llI0(j, io00Io0IO11);
/* 1147 */                              iI000O01llI08 = IOOOi1I1I1.I000O01llI0(i5);
/* 1151 */                              iI000OiO3 = IOOOi1I1I1.I000OOo1O(iI000O01llI014);
/* 113 */                               iI00000oOI3 += iI000OiO3 + iI000O01llI08;
                                        break;
                                    } else {
                                        break;
                                    }
                                case 12:
/* 1119 */                          if (I00100o1O0lo(i4, io00Io0IO11)) {
/* 1121 */                              int iI000O01llI015 = Ooil11Oi.I000O01llI0(j, io00Io0IO11);
/* 1125 */                              iI000O01llI08 = IOOOi1I1I1.I000O01llI0(i5);
/* 1129 */                              iI000OiO3 = IOOOi1I1I1.I0001Ioi1lo(iI000O01llI015);
/* 113 */                               iI00000oOI3 += iI000OiO3 + iI000O01llI08;
                                        break;
                                    } else {
                                        break;
                                    }
                                case 13:
/* 1109 */                          if (!I00100o1O0lo(i4, io00Io0IO11)) {
                                        break;
                                    }
                                    break;
                                case 14:
/* 1099 */                          if (!I00100o1O0lo(i4, io00Io0IO11)) {
                                        break;
                                    }
                                    break;
                                case 15:
/* 1072 */                          if (I00100o1O0lo(i4, io00Io0IO11)) {
/* 1074 */                              int iI000O01llI016 = Ooil11Oi.I000O01llI0(j, io00Io0IO11);
/* 1078 */                              iI000O01llI08 = IOOOi1I1I1.I000O01llI0(i5);
/* 1087 */                              iI000OiO3 = IOOOi1I1I1.I000OOo1O((iI000O01llI016 >> 31) ^ (iI000O01llI016 << 1));
/* 113 */                               iI00000oOI3 += iI000OiO3 + iI000O01llI08;
                                        break;
                                    } else {
                                        break;
                                    }
                                case 16:
/* 1039 */                          int i9 = i3;
/* 1045 */                          if (I00100o1O0lo(i4, io00Io0IO11)) {
/* 1047 */                              long jI000OOo1O3 = Ooil11Oi.I000OOo1O(j, io00Io0IO11);
/* 1051 */                              iI000O01llI08 = IOOOi1I1I1.I000O01llI0(i5);
/* 1060 */                              iI000OiO3 = IOOOi1I1I1.I000OiO((jI000OOo1O3 >> 63) ^ (jI000OOo1O3 << i9));
/* 113 */                               iI00000oOI3 += iI000OiO3 + iI000O01llI08;
                                        break;
                                    } else {
                                        break;
                                    }
                                case 17:
/* 1021 */                          if (I00100o1O0lo(i4, io00Io0IO11)) {
/* 1033 */                              iI0000O = IOOOi1I1I1.I0000oI00(i5, (I01Iio10lo) Ooil11Oi.I000OiO(j, io00Io0IO11), I00100l0(i4));
/* 86 */                                iI00000oOI3 += iI0000O;
                                        break;
                                    } else {
                                        break;
                                    }
                                case PoseLandmark.RIGHT_PINKY:
/* 1009 */                          iI0000O = OiOO0o1I0.I0001Ioi1lo(i5, (List) Ooil11Oi.I000OiO(j, io00Io0IO11));
/* 86 */                            iI00000oOI3 += iI0000O;
                                    break;
                                case PoseLandmark.LEFT_INDEX:
/* 995 */                           iI0000O = OiOO0o1I0.I0000O(i5, (List) Ooil11Oi.I000OiO(j, io00Io0IO11));
/* 86 */                            iI00000oOI3 += iI0000O;
                                    break;
                                case PoseLandmark.RIGHT_INDEX:
/* 981 */                           iI0000O = OiOO0o1I0.I000OiO(i5, (List) Ooil11Oi.I000OiO(j, io00Io0IO11));
/* 86 */                            iI00000oOI3 += iI0000O;
                                    break;
                                case PoseLandmark.LEFT_THUMB:
/* 967 */                           iI0000O = OiOO0o1I0.I00111O(i5, (List) Ooil11Oi.I000OiO(j, io00Io0IO11));
/* 86 */                            iI00000oOI3 += iI0000O;
                                    break;
                                case PoseLandmark.RIGHT_THUMB:
/* 953 */                           iI0000O = OiOO0o1I0.I000O01llI0(i5, (List) Ooil11Oi.I000OiO(j, io00Io0IO11));
/* 86 */                            iI00000oOI3 += iI0000O;
                                    break;
                                case PoseLandmark.LEFT_HIP:
/* 939 */                           iI0000O = OiOO0o1I0.I0001Ioi1lo(i5, (List) Ooil11Oi.I000OiO(j, io00Io0IO11));
/* 86 */                            iI00000oOI3 += iI0000O;
                                    break;
                                case PoseLandmark.RIGHT_HIP:
/* 925 */                           iI0000O = OiOO0o1I0.I0000O(i5, (List) Ooil11Oi.I000OiO(j, io00Io0IO11));
/* 86 */                            iI00000oOI3 += iI0000O;
                                    break;
                                case PoseLandmark.LEFT_KNEE:
/* 895 */                           List list = (List) Ooil11Oi.I000OiO(j, io00Io0IO11);
/* 897 */                           Class cls2 = OiOO0o1I0.I00000oIO;
/* 899 */                           int size3 = list.size();
/* 914 */                           iI0000O = size3 == 0 ? 0 : (IOOOi1I1I1.I000O01llI0(i5) + 1) * size3;
/* 86 */                            iI00000oOI3 += iI0000O;
                                    break;
                                case PoseLandmark.RIGHT_KNEE:
/* 883 */                           iI0000O = OiOO0o1I0.I00100o1O0lo(i5, (List) Ooil11Oi.I000OiO(j, io00Io0IO11));
/* 86 */                            iI00000oOI3 += iI0000O;
                                    break;
                                case 27:
/* 869 */                           iI0000O = OiOO0o1I0.I000l1(i5, (List) Ooil11Oi.I000OiO(j, io00Io0IO11), I00100l0(i4));
/* 86 */                            iI00000oOI3 += iI0000O;
                                    break;
                                case PoseLandmark.RIGHT_ANKLE:
/* 851 */                           iI0000O = OiOO0o1I0.I00000oIO(i5, (List) Ooil11Oi.I000OiO(j, io00Io0IO11));
/* 86 */                            iI00000oOI3 += iI0000O;
                                    break;
                                case PoseLandmark.LEFT_HEEL:
/* 837 */                           iI0000O = OiOO0o1I0.I0010I0i(i5, (List) Ooil11Oi.I000OiO(j, io00Io0IO11));
/* 86 */                            iI00000oOI3 += iI0000O;
                                    break;
                                case 30:
/* 823 */                           iI0000O = OiOO0o1I0.I00000oOI(i5, (List) Ooil11Oi.I000OiO(j, io00Io0IO11));
/* 86 */                            iI00000oOI3 += iI0000O;
                                    break;
                                case PoseLandmark.LEFT_FOOT_INDEX:
/* 809 */                           iI0000O = OiOO0o1I0.I0000O(i5, (List) Ooil11Oi.I000OiO(j, io00Io0IO11));
/* 86 */                            iI00000oOI3 += iI0000O;
                                    break;
                                case 32:
/* 795 */                           iI0000O = OiOO0o1I0.I0001Ioi1lo(i5, (List) Ooil11Oi.I000OiO(j, io00Io0IO11));
/* 86 */                            iI00000oOI3 += iI0000O;
                                    break;
                                case 33:
/* 781 */                           iI0000O = OiOO0o1I0.I000lI(i5, (List) Ooil11Oi.I000OiO(j, io00Io0IO11));
/* 86 */                            iI00000oOI3 += iI0000O;
                                    break;
                                case 34:
/* 767 */                           iI0000O = OiOO0o1I0.I000oI1ioi(i5, (List) Ooil11Oi.I000OiO(j, io00Io0IO11));
/* 86 */                            iI00000oOI3 += iI0000O;
                                    break;
                                case InputImage.IMAGE_FORMAT_YUV_420_888:
/* 747 */                           iI000II4 = OiOO0o1I0.I000II((List) unsafe.getObject(io00Io0IO11, j));
/* 751 */                           if (iI000II4 > 0) {
/* 753 */                               iI000O01llI012 = IOOOi1I1I1.I000O01llI0(i5);
/* 497 */                               iI00000oOI3 = IlIi0I0.I0000Il00O(iI000II4, iI000O01llI012, iI000II4, iI00000oOI3);
                                        break;
                                    } else {
                                        break;
                                    }
                                case 36:
/* 727 */                           iI000II4 = OiOO0o1I0.I0000oI00((List) unsafe.getObject(io00Io0IO11, j));
/* 731 */                           if (iI000II4 > 0) {
/* 733 */                               iI000O01llI012 = IOOOi1I1I1.I000O01llI0(i5);
/* 497 */                               iI00000oOI3 = IlIi0I0.I0000Il00O(iI000II4, iI000O01llI012, iI000II4, iI00000oOI3);
                                        break;
                                    } else {
                                        break;
                                    }
                                case 37:
/* 707 */                           iI000II4 = OiOO0o1I0.I000iOII((List) unsafe.getObject(io00Io0IO11, j));
/* 711 */                           if (iI000II4 > 0) {
/* 713 */                               iI000O01llI012 = IOOOi1I1I1.I000O01llI0(i5);
/* 497 */                               iI00000oOI3 = IlIi0I0.I0000Il00O(iI000II4, iI000O01llI012, iI000II4, iI00000oOI3);
                                        break;
                                    } else {
                                        break;
                                    }
                                case 38:
/* 687 */                           iI000II4 = OiOO0o1I0.I001IIilI0O((List) unsafe.getObject(io00Io0IO11, j));
/* 691 */                           if (iI000II4 > 0) {
/* 693 */                               iI000O01llI012 = IOOOi1I1I1.I000O01llI0(i5);
/* 497 */                               iI00000oOI3 = IlIi0I0.I0000Il00O(iI000II4, iI000O01llI012, iI000II4, iI00000oOI3);
                                        break;
                                    } else {
                                        break;
                                    }
                                case 39:
/* 667 */                           iI000II4 = OiOO0o1I0.I000OOo1O((List) unsafe.getObject(io00Io0IO11, j));
/* 671 */                           if (iI000II4 > 0) {
/* 673 */                               iI000O01llI012 = IOOOi1I1I1.I000O01llI0(i5);
/* 497 */                               iI00000oOI3 = IlIi0I0.I0000Il00O(iI000II4, iI000O01llI012, iI000II4, iI00000oOI3);
                                        break;
                                    } else {
                                        break;
                                    }
                                case 40:
/* 647 */                           iI000II4 = OiOO0o1I0.I000II((List) unsafe.getObject(io00Io0IO11, j));
/* 651 */                           if (iI000II4 > 0) {
/* 653 */                               iI000O01llI012 = IOOOi1I1I1.I000O01llI0(i5);
/* 497 */                               iI00000oOI3 = IlIi0I0.I0000Il00O(iI000II4, iI000O01llI012, iI000II4, iI00000oOI3);
                                        break;
                                    } else {
                                        break;
                                    }
                                case 41:
/* 627 */                           iI000II4 = OiOO0o1I0.I0000oI00((List) unsafe.getObject(io00Io0IO11, j));
/* 631 */                           if (iI000II4 > 0) {
/* 633 */                               iI000O01llI012 = IOOOi1I1I1.I000O01llI0(i5);
/* 497 */                               iI00000oOI3 = IlIi0I0.I0000Il00O(iI000II4, iI000O01llI012, iI000II4, iI00000oOI3);
                                        break;
                                    } else {
                                        break;
                                    }
                                case 42:
/* 604 */                           List list2 = (List) unsafe.getObject(io00Io0IO11, j);
/* 606 */                           Class cls3 = OiOO0o1I0.I00000oIO;
/* 608 */                           iI000II4 = list2.size();
/* 612 */                           if (iI000II4 > 0) {
/* 614 */                               iI000O01llI012 = IOOOi1I1I1.I000O01llI0(i5);
/* 497 */                               iI00000oOI3 = IlIi0I0.I0000Il00O(iI000II4, iI000O01llI012, iI000II4, iI00000oOI3);
                                        break;
                                    } else {
                                        break;
                                    }
                                case 43:
/* 587 */                           iI000II4 = OiOO0o1I0.I0010o((List) unsafe.getObject(io00Io0IO11, j));
/* 591 */                           if (iI000II4 > 0) {
/* 593 */                               iI000O01llI012 = IOOOi1I1I1.I000O01llI0(i5);
/* 497 */                               iI00000oOI3 = IlIi0I0.I0000Il00O(iI000II4, iI000O01llI012, iI000II4, iI00000oOI3);
                                        break;
                                    } else {
                                        break;
                                    }
                                case 44:
/* 568 */                           iI000II4 = OiOO0o1I0.I0000Il00O((List) unsafe.getObject(io00Io0IO11, j));
/* 572 */                           if (iI000II4 > 0) {
/* 574 */                               iI000O01llI012 = IOOOi1I1I1.I000O01llI0(i5);
/* 497 */                               iI00000oOI3 = IlIi0I0.I0000Il00O(iI000II4, iI000O01llI012, iI000II4, iI00000oOI3);
                                        break;
                                    } else {
                                        break;
                                    }
                                case BuildConfig.VERSION_CODE:
/* 549 */                           iI000II4 = OiOO0o1I0.I0000oI00((List) unsafe.getObject(io00Io0IO11, j));
/* 553 */                           if (iI000II4 > 0) {
/* 555 */                               iI000O01llI012 = IOOOi1I1I1.I000O01llI0(i5);
/* 497 */                               iI00000oOI3 = IlIi0I0.I0000Il00O(iI000II4, iI000O01llI012, iI000II4, iI00000oOI3);
                                        break;
                                    } else {
                                        break;
                                    }
                                case 46:
/* 530 */                           iI000II4 = OiOO0o1I0.I000II((List) unsafe.getObject(io00Io0IO11, j));
/* 534 */                           if (iI000II4 > 0) {
/* 536 */                               iI000O01llI012 = IOOOi1I1I1.I000O01llI0(i5);
/* 497 */                               iI00000oOI3 = IlIi0I0.I0000Il00O(iI000II4, iI000O01llI012, iI000II4, iI00000oOI3);
                                        break;
                                    } else {
                                        break;
                                    }
                                case 47:
/* 511 */                           iI000II4 = OiOO0o1I0.I000o00OoI0I((List) unsafe.getObject(io00Io0IO11, j));
/* 515 */                           if (iI000II4 > 0) {
/* 517 */                               iI000O01llI012 = IOOOi1I1I1.I000O01llI0(i5);
/* 497 */                               iI00000oOI3 = IlIi0I0.I0000Il00O(iI000II4, iI000O01llI012, iI000II4, iI00000oOI3);
                                        break;
                                    } else {
                                        break;
                                    }
                                case 48:
/* 487 */                           iI000II4 = OiOO0o1I0.I00100l0((List) unsafe.getObject(io00Io0IO11, j));
/* 491 */                           if (iI000II4 > 0) {
/* 493 */                               iI000O01llI012 = IOOOi1I1I1.I000O01llI0(i5);
/* 497 */                               iI00000oOI3 = IlIi0I0.I0000Il00O(iI000II4, iI000O01llI012, iI000II4, iI00000oOI3);
                                        break;
                                    } else {
                                        break;
                                    }
                                case 49:
/* 430 */                           List list3 = (List) Ooil11Oi.I000OiO(j, io00Io0IO11);
/* 432 */                           OiOIiIO0 oiOIiIO0I00100l02 = I00100l0(i4);
/* 436 */                           Class cls4 = OiOO0o1I0.I00000oIO;
/* 438 */                           int size4 = list3.size();
/* 442 */                           if (size4 == 0) {
/* 444 */                               iI0000oI002 = 0;
                                    } else {
/* 449 */                               int i10 = 0;
/* 450 */                               iI0000oI002 = 0;
/* 452 */                               while (i10 < size4) {
/* 468 */                                   iI0000oI002 = IOOOi1I1I1.I0000oI00(i5, (I01Iio10lo) list3.get(i10), oiOIiIO0I00100l02) + iI0000oI002;
/* 470 */                                   i10++;
/* 472 */                                   i3 = i3;
                                        }
                                    }
/* 475 */                           iI00000oOI3 = iI0000oI002 + iI00000oOI3;
                                    break;
                                case 50:
/* 410 */                           Object objI000OiO3 = Ooil11Oi.I000OiO(j, io00Io0IO11);
/* 414 */                           Object objI000oI1ioi = I000oI1ioi(i4);
/* 418 */                           o1Oi10.getClass();
/* 421 */                           O1Oi10.I00000oIO(objI000OiO3, objI000oI1ioi);
                                    break;
                                case 51:
/* 406 */                           if (!I0010o(io00Io0IO11, i5, i4)) {
                                        break;
                                    }
                                    break;
                                case 52:
/* 398 */                           if (!I0010o(io00Io0IO11, i5, i4)) {
                                        break;
                                    }
                                    break;
                                case 53:
/* 378 */                           if (I0010o(io00Io0IO11, i5, i4)) {
/* 380 */                               long jI001lllioOl = I001lllioOl(j, io00Io0IO11);
/* 384 */                               iI000O01llI08 = IOOOi1I1I1.I000O01llI0(i5);
/* 388 */                               iI000OiO3 = IOOOi1I1I1.I000OiO(jI001lllioOl);
/* 113 */                               iI00000oOI3 += iI000OiO3 + iI000O01llI08;
                                        break;
                                    } else {
                                        break;
                                    }
                                case 54:
/* 358 */                           if (I0010o(io00Io0IO11, i5, i4)) {
/* 360 */                               long jI001lllioOl2 = I001lllioOl(j, io00Io0IO11);
/* 364 */                               iI000O01llI08 = IOOOi1I1I1.I000O01llI0(i5);
/* 368 */                               iI000OiO3 = IOOOi1I1I1.I000OiO(jI001lllioOl2);
/* 113 */                               iI00000oOI3 += iI000OiO3 + iI000O01llI08;
                                        break;
                                    } else {
                                        break;
                                    }
                                case 55:
/* 338 */                           if (I0010o(io00Io0IO11, i5, i4)) {
/* 340 */                               int iI001lIiIIo1O = I001lIiIIo1O(j, io00Io0IO11);
/* 344 */                               iI000O01llI08 = IOOOi1I1I1.I000O01llI0(i5);
/* 348 */                               iI000OiO3 = IOOOi1I1I1.I0001Ioi1lo(iI001lIiIIo1O);
/* 113 */                               iI00000oOI3 += iI000OiO3 + iI000O01llI08;
                                        break;
                                    } else {
                                        break;
                                    }
                                case 56:
/* 326 */                           if (I0010o(io00Io0IO11, i5, i4)) {
/* 328 */                               iI0000O = IOOOi1I1I1.I0000O(i5);
/* 86 */                                iI00000oOI3 += iI0000O;
                                        break;
                                    } else {
                                        break;
                                    }
                                case 57:
/* 314 */                           if (I0010o(io00Io0IO11, i5, i4)) {
/* 316 */                               iI0000O = IOOOi1I1I1.I0000Il00O(i5);
/* 86 */                                iI00000oOI3 += iI0000O;
                                        break;
                                    } else {
                                        break;
                                    }
                                case 58:
/* 302 */                           if (I0010o(io00Io0IO11, i5, i4)) {
/* 304 */                               iI00000oOI3 = IlIi0I0.I00000oOI(i5, i3, iI00000oOI3);
                                        break;
                                    } else {
                                        break;
                                    }
                                case 59:
/* 256 */                           if (I0010o(io00Io0IO11, i5, i4)) {
/* 258 */                               Object objI000OiO4 = Ooil11Oi.I000OiO(j, io00Io0IO11);
/* 264 */                               if (objI000OiO4 instanceof IIOI1Ii1I) {
/* 268 */                                   iI000O01llI010 = IOOOi1I1I1.I000O01llI0(i5);
/* 272 */                                   size2 = ((IIOI1Ii1I) objI000OiO4).size();
/* 276 */                                   iI00000oOI3 = IlIi0I0.I0000Il00O(size2, size2, iI000O01llI010, iI00000oOI3);
                                            break;
                                        } else {
/* 285 */                                   iI000O01llI09 = IOOOi1I1I1.I000O01llI0(i5);
/* 289 */                                   iI000II3 = IOOOi1I1I1.I000II((String) objI000OiO4);
/* 294 */                                   iI00000oOI3 = iI000II3 + iI000O01llI09 + iI00000oOI3;
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                case 60:
/* 224 */                           if (I0010o(io00Io0IO11, i5, i4)) {
/* 226 */                               Object objI000OiO5 = Ooil11Oi.I000OiO(j, io00Io0IO11);
/* 230 */                               OiOIiIO0 oiOIiIO0I00100l03 = I00100l0(i4);
/* 234 */                               Class cls5 = OiOO0o1I0.I00000oIO;
/* 238 */                               iI000O01llI011 = IOOOi1I1I1.I000O01llI0(i5);
/* 242 */                               iI00000oOI2 = ((I01Iio10lo) objI000OiO5).I00000oOI(oiOIiIO0I00100l03);
/* 246 */                               iI00000oOI3 = IlIi0I0.I0000Il00O(iI00000oOI2, iI00000oOI2, iI000O01llI011, iI00000oOI3);
                                        break;
                                    } else {
                                        break;
                                    }
                                case 61:
/* 206 */                           if (I0010o(io00Io0IO11, i5, i4)) {
/* 214 */                               iI0000O = IOOOi1I1I1.I00000oIO(i5, (IIOI1Ii1I) Ooil11Oi.I000OiO(j, io00Io0IO11));
/* 86 */                                iI00000oOI3 += iI0000O;
                                        break;
                                    } else {
                                        break;
                                    }
                                case 62:
/* 187 */                           if (I0010o(io00Io0IO11, i5, i4)) {
/* 189 */                               int iI001lIiIIo1O2 = I001lIiIIo1O(j, io00Io0IO11);
/* 193 */                               iI000O01llI08 = IOOOi1I1I1.I000O01llI0(i5);
/* 197 */                               iI000OiO3 = IOOOi1I1I1.I000OOo1O(iI001lIiIIo1O2);
/* 113 */                               iI00000oOI3 += iI000OiO3 + iI000O01llI08;
                                        break;
                                    } else {
                                        break;
                                    }
                                case 63:
/* 168 */                           if (I0010o(io00Io0IO11, i5, i4)) {
/* 170 */                               int iI001lIiIIo1O3 = I001lIiIIo1O(j, io00Io0IO11);
/* 174 */                               iI000O01llI08 = IOOOi1I1I1.I000O01llI0(i5);
/* 178 */                               iI000OiO3 = IOOOi1I1I1.I0001Ioi1lo(iI001lIiIIo1O3);
/* 113 */                               iI00000oOI3 += iI000OiO3 + iI000O01llI08;
                                        break;
                                    } else {
                                        break;
                                    }
                                case Barcode.FORMAT_EAN_8:
/* 156 */                           if (!I0010o(io00Io0IO11, i5, i4)) {
                                        break;
                                    }
                                    break;
                                case 65:
/* 144 */                           if (!I0010o(io00Io0IO11, i5, i4)) {
                                        break;
                                    }
                                    break;
                                case 66:
/* 120 */                           if (I0010o(io00Io0IO11, i5, i4)) {
/* 122 */                               int iI001lIiIIo1O4 = I001lIiIIo1O(j, io00Io0IO11);
/* 126 */                               iI000O01llI08 = IOOOi1I1I1.I000O01llI0(i5);
/* 135 */                               iI000OiO3 = IOOOi1I1I1.I000OOo1O((iI001lIiIIo1O4 >> 31) ^ (iI001lIiIIo1O4 << 1));
/* 113 */                               iI00000oOI3 += iI000OiO3 + iI000O01llI08;
                                        break;
                                    } else {
                                        break;
                                    }
                                case 67:
/* 93 */                            if (I0010o(io00Io0IO11, i5, i4)) {
/* 95 */                                long jI001lllioOl3 = I001lllioOl(j, io00Io0IO11);
/* 99 */                                iI000O01llI08 = IOOOi1I1I1.I000O01llI0(i5);
/* 108 */                               iI000OiO3 = IOOOi1I1I1.I000OiO((jI001lllioOl3 >> 63) ^ (jI001lllioOl3 << i3));
/* 113 */                               iI00000oOI3 += iI000OiO3 + iI000O01llI08;
                                        break;
                                    } else {
                                        break;
                                    }
                                case 68:
/* 70 */                            if (I0010o(io00Io0IO11, i5, i4)) {
/* 82 */                                iI0000O = IOOOi1I1I1.I0000oI00(i5, (I01Iio10lo) Ooil11Oi.I000OiO(j, io00Io0IO11), I00100l0(i4));
/* 86 */                                iI00000oOI3 += iI0000O;
                                        break;
                                    } else {
                                        break;
                                    }
                            }
/* 1362 */                  i4 += 3;
/* 1364 */                  i2 = i6;
/* 1366 */                  i3 = 1;
                        }
/* 1369 */              ooiO0li.getClass();
/* 1378 */              return io00Io0IO11.unknownFields.I00000oOI() + iI00000oOI3;
                    }
/* 1384 */          int i11 = 0;
/* 1385 */          int iI00000oOI4 = 0;
/* 1386 */          int i12 = 0;
/* 1388 */          while (i11 < iArr.length) {
/* 1390 */              int iI00O0i0ii2 = I00O0i0ii(i11);
/* 1394 */              int i13 = iArr[i11];
/* 1396 */              int iI00Iooi00oi2 = I00Iooi00oi(iI00O0i0ii2);
/* 1402 */              if (iI00Iooi00oi2 <= 17) {
/* 1406 */                  int i14 = iArr[i11 + 2];
/* 1408 */                  int i15 = i14 & 1048575;
/* 1414 */                  i = 1 << (i14 >>> 20);
/* 1416 */                  if (i15 != i2) {
/* 1419 */                      i12 = unsafe.getInt(io00Io0IO11, i15);
/* 1423 */                      i2 = i15;
                            }
                        } else {
/* 1425 */                  i = 0;
                        }
/* 1428 */              int i16 = i2;
/* 1426 */              long j2 = iI00O0i0ii2 & 1048575;
                        switch (iI00Iooi00oi2) {
                            case 0:
/* 2618 */                      c = 4;
/* 2621 */                      c2 = '\b';
/* 2623 */                      if ((i12 & i) != 0) {
/* 2625 */                          iI00000oOI4 = IlIi0I0.I00000oOI(i13, 8, iI00000oOI4);
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
/* 2608 */                      if ((i12 & i) != 0) {
/* 2610 */                          c = 4;
/* 2611 */                          iI00000oOI4 = IlIi0I0.I00000oOI(i13, 4, iI00000oOI4);
                                } else {
/* 1457 */                          c = 4;
                                }
/* 1458 */                      c2 = '\b';
                                break;
                            case 2:
/* 2590 */                      if ((i12 & i) != 0) {
/* 2592 */                          long j3 = unsafe.getLong(io00Io0IO11, j2);
/* 2596 */                          iI000O01llI0 = IOOOi1I1I1.I000O01llI0(i13);
/* 2600 */                          iI000OiO = IOOOi1I1I1.I000OiO(j3);
/* 2585 */                          iI0001Ioi1lo = iI000OiO + iI000O01llI0;
/* 2536 */                          iI00000oOI4 += iI0001Ioi1lo;
                                }
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case 3:
/* 2571 */                      if ((i12 & i) != 0) {
/* 2573 */                          long j4 = unsafe.getLong(io00Io0IO11, j2);
/* 2577 */                          iI000O01llI0 = IOOOi1I1I1.I000O01llI0(i13);
/* 2581 */                          iI000OiO = IOOOi1I1I1.I000OiO(j4);
/* 2585 */                          iI0001Ioi1lo = iI000OiO + iI000O01llI0;
/* 2536 */                          iI00000oOI4 += iI0001Ioi1lo;
                                }
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case 4:
/* 2552 */                      if ((i12 & i) != 0) {
/* 2566 */                          iI0001Ioi1lo = IOOOi1I1I1.I0001Ioi1lo(unsafe.getInt(io00Io0IO11, j2)) + IOOOi1I1I1.I000O01llI0(i13);
/* 2536 */                          iI00000oOI4 += iI0001Ioi1lo;
                                }
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case 5:
/* 2542 */                      if ((i12 & i) != 0) {
/* 2544 */                          iI0001Ioi1lo = IOOOi1I1I1.I0000O(i13);
/* 2536 */                          iI00000oOI4 += iI0001Ioi1lo;
                                }
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case 6:
/* 2530 */                      if ((i12 & i) != 0) {
/* 2532 */                          iI0001Ioi1lo = IOOOi1I1I1.I0000Il00O(i13);
/* 2536 */                          iI00000oOI4 += iI0001Ioi1lo;
                                }
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case 7:
/* 2518 */                      if ((i12 & i) != 0) {
/* 2521 */                          iI00000oOI4 = IlIi0I0.I00000oOI(i13, 1, iI00000oOI4);
                                }
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case 8:
/* 2482 */                      if ((i12 & i) != 0) {
/* 2484 */                          Object object = unsafe.getObject(io00Io0IO11, j2);
/* 2490 */                          if (object instanceof IIOI1Ii1I) {
/* 2494 */                              iI000O01llI03 = IOOOi1I1I1.I000O01llI0(i13);
/* 2498 */                              size = ((IIOI1Ii1I) object).size();
/* 1653 */                              iI00000oOI4 = IlIi0I0.I0000Il00O(size, size, iI000O01llI03, iI00000oOI4);
                                    } else {
/* 2506 */                              iI000O01llI02 = IOOOi1I1I1.I000O01llI0(i13);
/* 2510 */                              iI000II = IOOOi1I1I1.I000II((String) object);
/* 1670 */                              iI00000oOI4 = iI000II + iI000O01llI02 + iI00000oOI4;
                                    }
                                }
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case 9:
/* 2456 */                      if ((i12 & i) != 0) {
/* 2458 */                          Object object2 = unsafe.getObject(io00Io0IO11, j2);
/* 2462 */                          OiOIiIO0 oiOIiIO0I00100l04 = I00100l0(i11);
/* 2466 */                          Class cls6 = OiOO0o1I0.I00000oIO;
/* 2470 */                          iI000O01llI04 = IOOOi1I1I1.I000O01llI0(i13);
/* 2474 */                          iI00000oOI = ((I01Iio10lo) object2).I00000oOI(oiOIiIO0I00100l04);
/* 1623 */                          iI00000oOI4 = IlIi0I0.I0000Il00O(iI00000oOI, iI00000oOI, iI000O01llI04, iI00000oOI4);
                                }
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case 10:
/* 2440 */                      if ((i12 & i) != 0) {
/* 2448 */                          iI00000oIO = IOOOi1I1I1.I00000oIO(i13, (IIOI1Ii1I) unsafe.getObject(io00Io0IO11, j2));
/* 1455 */                          iI00000oOI4 += iI00000oIO;
                                }
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case 11:
/* 2422 */                      if ((i12 & i) != 0) {
/* 2424 */                          int i17 = unsafe.getInt(io00Io0IO11, j2);
/* 2428 */                          iI000O01llI05 = IOOOi1I1I1.I000O01llI0(i13);
/* 2432 */                          iI000OOo1O = IOOOi1I1I1.I000OOo1O(i17);
/* 1512 */                          iI00000oIO = iI000OOo1O + iI000O01llI05;
/* 1455 */                          iI00000oOI4 += iI00000oIO;
                                }
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case 12:
/* 2404 */                      if ((i12 & i) != 0) {
/* 2406 */                          int i18 = unsafe.getInt(io00Io0IO11, j2);
/* 2410 */                          iI000O01llI05 = IOOOi1I1I1.I000O01llI0(i13);
/* 2414 */                          iI000OOo1O = IOOOi1I1I1.I0001Ioi1lo(i18);
/* 1512 */                          iI00000oIO = iI000OOo1O + iI000O01llI05;
/* 1455 */                          iI00000oOI4 += iI00000oIO;
                                }
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case 14:
/* 2392 */                      if ((i12 & i) != 0) {
/* 1522 */                          iI00000oOI4 = IlIi0I0.I00000oOI(i13, 8, iI00000oOI4);
                                }
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case 15:
/* 2369 */                      if ((i12 & i) != 0) {
/* 2371 */                          int i19 = unsafe.getInt(io00Io0IO11, j2);
/* 2375 */                          iI000O01llI05 = IOOOi1I1I1.I000O01llI0(i13);
/* 2384 */                          iI000OOo1O = IOOOi1I1I1.I000OOo1O((i19 >> 31) ^ (i19 << 1));
/* 1512 */                          iI00000oIO = iI000OOo1O + iI000O01llI05;
/* 1455 */                          iI00000oOI4 += iI00000oIO;
                                }
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case 16:
/* 2344 */                      if ((i12 & i) != 0) {
/* 2346 */                          long j5 = unsafe.getLong(io00Io0IO11, j2);
/* 2350 */                          iI000O01llI06 = IOOOi1I1I1.I000O01llI0(i13);
/* 2361 */                          iI000OiO2 = IOOOi1I1I1.I000OiO((j5 >> 63) ^ (j5 << 1));
/* 1487 */                          iI00000oIO = iI000OiO2 + iI000O01llI06;
/* 1455 */                          iI00000oOI4 += iI00000oIO;
                                }
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case 17:
/* 2324 */                      if ((i12 & i) != 0) {
/* 2336 */                          iI00000oIO = IOOOi1I1I1.I0000oI00(i13, (I01Iio10lo) unsafe.getObject(io00Io0IO11, j2), I00100l0(i11));
/* 1455 */                          iI00000oOI4 += iI00000oIO;
                                }
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case PoseLandmark.RIGHT_PINKY:
/* 2316 */                      iI00000oIO = OiOO0o1I0.I0001Ioi1lo(i13, (List) unsafe.getObject(io00Io0IO11, j2));
/* 1455 */                      iI00000oOI4 += iI00000oIO;
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case PoseLandmark.LEFT_INDEX:
/* 2304 */                      iI00000oIO = OiOO0o1I0.I0000O(i13, (List) unsafe.getObject(io00Io0IO11, j2));
/* 1455 */                      iI00000oOI4 += iI00000oIO;
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case PoseLandmark.RIGHT_INDEX:
/* 2292 */                      iI00000oIO = OiOO0o1I0.I000OiO(i13, (List) unsafe.getObject(io00Io0IO11, j2));
/* 1455 */                      iI00000oOI4 += iI00000oIO;
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case PoseLandmark.LEFT_THUMB:
/* 2280 */                      iI00000oIO = OiOO0o1I0.I00111O(i13, (List) unsafe.getObject(io00Io0IO11, j2));
/* 1455 */                      iI00000oOI4 += iI00000oIO;
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case PoseLandmark.RIGHT_THUMB:
/* 2268 */                      iI00000oIO = OiOO0o1I0.I000O01llI0(i13, (List) unsafe.getObject(io00Io0IO11, j2));
/* 1455 */                      iI00000oOI4 += iI00000oIO;
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case PoseLandmark.LEFT_HIP:
/* 2256 */                      iI00000oIO = OiOO0o1I0.I0001Ioi1lo(i13, (List) unsafe.getObject(io00Io0IO11, j2));
/* 1455 */                      iI00000oOI4 += iI00000oIO;
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case PoseLandmark.RIGHT_HIP:
/* 2244 */                      iI00000oIO = OiOO0o1I0.I0000O(i13, (List) unsafe.getObject(io00Io0IO11, j2));
/* 1455 */                      iI00000oOI4 += iI00000oIO;
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case PoseLandmark.LEFT_KNEE:
/* 2214 */                      List list4 = (List) unsafe.getObject(io00Io0IO11, j2);
/* 2216 */                      Class cls7 = OiOO0o1I0.I00000oIO;
/* 2218 */                      int size5 = list4.size();
/* 2235 */                      iI00000oOI4 += size5 == 0 ? 0 : (IOOOi1I1I1.I000O01llI0(i13) + 1) * size5;
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case PoseLandmark.RIGHT_KNEE:
/* 2204 */                      iI00000oIO = OiOO0o1I0.I00100o1O0lo(i13, (List) unsafe.getObject(io00Io0IO11, j2));
/* 1455 */                      iI00000oOI4 += iI00000oIO;
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case 27:
/* 2192 */                      iI00000oIO = OiOO0o1I0.I000l1(i13, (List) unsafe.getObject(io00Io0IO11, j2), I00100l0(i11));
/* 1455 */                      iI00000oOI4 += iI00000oIO;
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case PoseLandmark.RIGHT_ANKLE:
/* 2176 */                      iI00000oIO = OiOO0o1I0.I00000oIO(i13, (List) unsafe.getObject(io00Io0IO11, j2));
/* 1455 */                      iI00000oOI4 += iI00000oIO;
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case PoseLandmark.LEFT_HEEL:
/* 2164 */                      iI00000oIO = OiOO0o1I0.I0010I0i(i13, (List) unsafe.getObject(io00Io0IO11, j2));
/* 1455 */                      iI00000oOI4 += iI00000oIO;
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case 30:
/* 2152 */                      iI00000oIO = OiOO0o1I0.I00000oOI(i13, (List) unsafe.getObject(io00Io0IO11, j2));
/* 1455 */                      iI00000oOI4 += iI00000oIO;
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case PoseLandmark.LEFT_FOOT_INDEX:
/* 2140 */                      iI00000oIO = OiOO0o1I0.I0000O(i13, (List) unsafe.getObject(io00Io0IO11, j2));
/* 1455 */                      iI00000oOI4 += iI00000oIO;
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case 32:
/* 2128 */                      iI00000oIO = OiOO0o1I0.I0001Ioi1lo(i13, (List) unsafe.getObject(io00Io0IO11, j2));
/* 1455 */                      iI00000oOI4 += iI00000oIO;
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case 33:
/* 2116 */                      iI00000oIO = OiOO0o1I0.I000lI(i13, (List) unsafe.getObject(io00Io0IO11, j2));
/* 1455 */                      iI00000oOI4 += iI00000oIO;
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case 34:
/* 2104 */                      iI00000oIO = OiOO0o1I0.I000oI1ioi(i13, (List) unsafe.getObject(io00Io0IO11, j2));
/* 1455 */                      iI00000oOI4 += iI00000oIO;
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case InputImage.IMAGE_FORMAT_YUV_420_888:
/* 2086 */                      iI000II2 = OiOO0o1I0.I000II((List) unsafe.getObject(io00Io0IO11, j2));
/* 2090 */                      if (iI000II2 > 0) {
/* 2092 */                          iI000O01llI07 = IOOOi1I1I1.I000O01llI0(i13);
/* 1863 */                          iI00000oOI4 = IlIi0I0.I0000Il00O(iI000II2, iI000O01llI07, iI000II2, iI00000oOI4);
                                }
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case 36:
/* 2068 */                      iI000II2 = OiOO0o1I0.I0000oI00((List) unsafe.getObject(io00Io0IO11, j2));
/* 2072 */                      if (iI000II2 > 0) {
/* 2074 */                          iI000O01llI07 = IOOOi1I1I1.I000O01llI0(i13);
/* 1863 */                          iI00000oOI4 = IlIi0I0.I0000Il00O(iI000II2, iI000O01llI07, iI000II2, iI00000oOI4);
                                }
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case 37:
/* 2050 */                      iI000II2 = OiOO0o1I0.I000iOII((List) unsafe.getObject(io00Io0IO11, j2));
/* 2054 */                      if (iI000II2 > 0) {
/* 2056 */                          iI000O01llI07 = IOOOi1I1I1.I000O01llI0(i13);
/* 1863 */                          iI00000oOI4 = IlIi0I0.I0000Il00O(iI000II2, iI000O01llI07, iI000II2, iI00000oOI4);
                                }
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case 38:
/* 2032 */                      iI000II2 = OiOO0o1I0.I001IIilI0O((List) unsafe.getObject(io00Io0IO11, j2));
/* 2036 */                      if (iI000II2 > 0) {
/* 2038 */                          iI000O01llI07 = IOOOi1I1I1.I000O01llI0(i13);
/* 1863 */                          iI00000oOI4 = IlIi0I0.I0000Il00O(iI000II2, iI000O01llI07, iI000II2, iI00000oOI4);
                                }
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case 39:
/* 2014 */                      iI000II2 = OiOO0o1I0.I000OOo1O((List) unsafe.getObject(io00Io0IO11, j2));
/* 2018 */                      if (iI000II2 > 0) {
/* 2020 */                          iI000O01llI07 = IOOOi1I1I1.I000O01llI0(i13);
/* 1863 */                          iI00000oOI4 = IlIi0I0.I0000Il00O(iI000II2, iI000O01llI07, iI000II2, iI00000oOI4);
                                }
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case 40:
/* 1996 */                      iI000II2 = OiOO0o1I0.I000II((List) unsafe.getObject(io00Io0IO11, j2));
/* 2000 */                      if (iI000II2 > 0) {
/* 2002 */                          iI000O01llI07 = IOOOi1I1I1.I000O01llI0(i13);
/* 1863 */                          iI00000oOI4 = IlIi0I0.I0000Il00O(iI000II2, iI000O01llI07, iI000II2, iI00000oOI4);
                                }
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case 41:
/* 1979 */                      iI000II2 = OiOO0o1I0.I0000oI00((List) unsafe.getObject(io00Io0IO11, j2));
/* 1983 */                      if (iI000II2 > 0) {
/* 1985 */                          iI000O01llI07 = IOOOi1I1I1.I000O01llI0(i13);
/* 1863 */                          iI00000oOI4 = IlIi0I0.I0000Il00O(iI000II2, iI000O01llI07, iI000II2, iI00000oOI4);
                                }
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case 42:
/* 1958 */                      List list5 = (List) unsafe.getObject(io00Io0IO11, j2);
/* 1960 */                      Class cls8 = OiOO0o1I0.I00000oIO;
/* 1962 */                      iI000II2 = list5.size();
/* 1966 */                      if (iI000II2 > 0) {
/* 1968 */                          iI000O01llI07 = IOOOi1I1I1.I000O01llI0(i13);
/* 1863 */                          iI00000oOI4 = IlIi0I0.I0000Il00O(iI000II2, iI000O01llI07, iI000II2, iI00000oOI4);
                                }
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case 43:
/* 1943 */                      iI000II2 = OiOO0o1I0.I0010o((List) unsafe.getObject(io00Io0IO11, j2));
/* 1947 */                      if (iI000II2 > 0) {
/* 1949 */                          iI000O01llI07 = IOOOi1I1I1.I000O01llI0(i13);
/* 1863 */                          iI00000oOI4 = IlIi0I0.I0000Il00O(iI000II2, iI000O01llI07, iI000II2, iI00000oOI4);
                                }
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case 44:
/* 1926 */                      iI000II2 = OiOO0o1I0.I0000Il00O((List) unsafe.getObject(io00Io0IO11, j2));
/* 1930 */                      if (iI000II2 > 0) {
/* 1932 */                          iI000O01llI07 = IOOOi1I1I1.I000O01llI0(i13);
/* 1863 */                          iI00000oOI4 = IlIi0I0.I0000Il00O(iI000II2, iI000O01llI07, iI000II2, iI00000oOI4);
                                }
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case BuildConfig.VERSION_CODE:
/* 1909 */                      iI000II2 = OiOO0o1I0.I0000oI00((List) unsafe.getObject(io00Io0IO11, j2));
/* 1913 */                      if (iI000II2 > 0) {
/* 1915 */                          iI000O01llI07 = IOOOi1I1I1.I000O01llI0(i13);
/* 1863 */                          iI00000oOI4 = IlIi0I0.I0000Il00O(iI000II2, iI000O01llI07, iI000II2, iI00000oOI4);
                                }
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case 46:
/* 1892 */                      iI000II2 = OiOO0o1I0.I000II((List) unsafe.getObject(io00Io0IO11, j2));
/* 1896 */                      if (iI000II2 > 0) {
/* 1898 */                          iI000O01llI07 = IOOOi1I1I1.I000O01llI0(i13);
/* 1863 */                          iI00000oOI4 = IlIi0I0.I0000Il00O(iI000II2, iI000O01llI07, iI000II2, iI00000oOI4);
                                }
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case 47:
/* 1875 */                      iI000II2 = OiOO0o1I0.I000o00OoI0I((List) unsafe.getObject(io00Io0IO11, j2));
/* 1879 */                      if (iI000II2 > 0) {
/* 1881 */                          iI000O01llI07 = IOOOi1I1I1.I000O01llI0(i13);
/* 1863 */                          iI00000oOI4 = IlIi0I0.I0000Il00O(iI000II2, iI000O01llI07, iI000II2, iI00000oOI4);
                                }
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case 48:
/* 1853 */                      iI000II2 = OiOO0o1I0.I00100l0((List) unsafe.getObject(io00Io0IO11, j2));
/* 1857 */                      if (iI000II2 > 0) {
/* 1859 */                          iI000O01llI07 = IOOOi1I1I1.I000O01llI0(i13);
/* 1863 */                          iI00000oOI4 = IlIi0I0.I0000Il00O(iI000II2, iI000O01llI07, iI000II2, iI00000oOI4);
                                }
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case 49:
/* 1808 */                      List list6 = (List) unsafe.getObject(io00Io0IO11, j2);
/* 1810 */                      OiOIiIO0 oiOIiIO0I00100l05 = I00100l0(i11);
/* 1814 */                      Class cls9 = OiOO0o1I0.I00000oIO;
/* 1816 */                      int size6 = list6.size();
/* 1820 */                      if (size6 == 0) {
/* 1822 */                          iI0000oI00 = 0;
                                } else {
/* 1825 */                          iI0000oI00 = 0;
/* 1826 */                          for (int i20 = 0; i20 < size6; i20++) {
/* 1840 */                              iI0000oI00 += IOOOi1I1I1.I0000oI00(i13, (I01Iio10lo) list6.get(i20), oiOIiIO0I00100l05);
                                    }
                                }
/* 1844 */                      iI00000oOI4 += iI0000oI00;
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case 50:
/* 1788 */                      Object object3 = unsafe.getObject(io00Io0IO11, j2);
/* 1792 */                      Object objI000oI1ioi2 = I000oI1ioi(i11);
/* 1796 */                      o1Oi10.getClass();
/* 1799 */                      O1Oi10.I00000oIO(object3, objI000oI1ioi2);
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case 51:
/* 1784 */                      if (I0010o(io00Io0IO11, i13, i11)) {
                                }
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case 53:
/* 1756 */                      if (I0010o(io00Io0IO11, i13, i11)) {
/* 1758 */                          long jI001lllioOl4 = I001lllioOl(j2, io00Io0IO11);
/* 1762 */                          iI000O01llI06 = IOOOi1I1I1.I000O01llI0(i13);
/* 1766 */                          iI000OiO2 = IOOOi1I1I1.I000OiO(jI001lllioOl4);
/* 1487 */                          iI00000oIO = iI000OiO2 + iI000O01llI06;
/* 1455 */                          iI00000oOI4 += iI00000oIO;
                                }
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case 54:
/* 1736 */                      if (I0010o(io00Io0IO11, i13, i11)) {
/* 1738 */                          long jI001lllioOl5 = I001lllioOl(j2, io00Io0IO11);
/* 1742 */                          iI000O01llI06 = IOOOi1I1I1.I000O01llI0(i13);
/* 1746 */                          iI000OiO2 = IOOOi1I1I1.I000OiO(jI001lllioOl5);
/* 1487 */                          iI00000oIO = iI000OiO2 + iI000O01llI06;
/* 1455 */                          iI00000oOI4 += iI00000oIO;
                                }
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case 55:
/* 1716 */                      if (I0010o(io00Io0IO11, i13, i11)) {
/* 1718 */                          int iI001lIiIIo1O5 = I001lIiIIo1O(j2, io00Io0IO11);
/* 1722 */                          iI000O01llI05 = IOOOi1I1I1.I000O01llI0(i13);
/* 1726 */                          iI000OOo1O = IOOOi1I1I1.I0001Ioi1lo(iI001lIiIIo1O5);
/* 1512 */                          iI00000oIO = iI000OOo1O + iI000O01llI05;
/* 1455 */                          iI00000oOI4 += iI00000oIO;
                                }
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case 56:
/* 1704 */                      if (I0010o(io00Io0IO11, i13, i11)) {
/* 1706 */                          iI00000oIO = IOOOi1I1I1.I0000O(i13);
/* 1455 */                          iI00000oOI4 += iI00000oIO;
                                }
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case 57:
/* 1692 */                      if (I0010o(io00Io0IO11, i13, i11)) {
/* 1694 */                          iI00000oIO = IOOOi1I1I1.I0000Il00O(i13);
/* 1455 */                          iI00000oOI4 += iI00000oIO;
                                }
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case 58:
/* 1678 */                      if (I0010o(io00Io0IO11, i13, i11)) {
/* 1681 */                          iI00000oOI4 = IlIi0I0.I00000oOI(i13, 1, iI00000oOI4);
                                }
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case 59:
/* 1633 */                      if (I0010o(io00Io0IO11, i13, i11)) {
/* 1635 */                          Object object4 = unsafe.getObject(io00Io0IO11, j2);
/* 1641 */                          if (object4 instanceof IIOI1Ii1I) {
/* 1645 */                              iI000O01llI03 = IOOOi1I1I1.I000O01llI0(i13);
/* 1649 */                              size = ((IIOI1Ii1I) object4).size();
/* 1653 */                              iI00000oOI4 = IlIi0I0.I0000Il00O(size, size, iI000O01llI03, iI00000oOI4);
                                    } else {
/* 1661 */                              iI000O01llI02 = IOOOi1I1I1.I000O01llI0(i13);
/* 1665 */                              iI000II = IOOOi1I1I1.I000II((String) object4);
/* 1670 */                              iI00000oOI4 = iI000II + iI000O01llI02 + iI00000oOI4;
                                    }
                                }
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case 60:
/* 1601 */                      if (I0010o(io00Io0IO11, i13, i11)) {
/* 1603 */                          Object object5 = unsafe.getObject(io00Io0IO11, j2);
/* 1607 */                          OiOIiIO0 oiOIiIO0I00100l06 = I00100l0(i11);
/* 1611 */                          Class cls10 = OiOO0o1I0.I00000oIO;
/* 1615 */                          iI000O01llI04 = IOOOi1I1I1.I000O01llI0(i13);
/* 1619 */                          iI00000oOI = ((I01Iio10lo) object5).I00000oOI(oiOIiIO0I00100l06);
/* 1623 */                          iI00000oOI4 = IlIi0I0.I0000Il00O(iI00000oOI, iI00000oOI, iI000O01llI04, iI00000oOI4);
                                }
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case 61:
/* 1583 */                      if (I0010o(io00Io0IO11, i13, i11)) {
/* 1591 */                          iI00000oIO = IOOOi1I1I1.I00000oIO(i13, (IIOI1Ii1I) unsafe.getObject(io00Io0IO11, j2));
/* 1455 */                          iI00000oOI4 += iI00000oIO;
                                }
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case 62:
/* 1564 */                      if (I0010o(io00Io0IO11, i13, i11)) {
/* 1566 */                          int iI001lIiIIo1O6 = I001lIiIIo1O(j2, io00Io0IO11);
/* 1570 */                          iI000O01llI05 = IOOOi1I1I1.I000O01llI0(i13);
/* 1574 */                          iI000OOo1O = IOOOi1I1I1.I000OOo1O(iI001lIiIIo1O6);
/* 1512 */                          iI00000oIO = iI000OOo1O + iI000O01llI05;
/* 1455 */                          iI00000oOI4 += iI00000oIO;
                                }
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case 63:
/* 1545 */                      if (I0010o(io00Io0IO11, i13, i11)) {
/* 1547 */                          int iI001lIiIIo1O7 = I001lIiIIo1O(j2, io00Io0IO11);
/* 1551 */                          iI000O01llI05 = IOOOi1I1I1.I000O01llI0(i13);
/* 1555 */                          iI000OOo1O = IOOOi1I1I1.I0001Ioi1lo(iI001lIiIIo1O7);
/* 1512 */                          iI00000oIO = iI000OOo1O + iI000O01llI05;
/* 1455 */                          iI00000oOI4 += iI00000oIO;
                                }
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case 65:
/* 1518 */                      if (I0010o(io00Io0IO11, i13, i11)) {
                                }
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case 66:
/* 1493 */                      if (I0010o(io00Io0IO11, i13, i11)) {
/* 1495 */                          int iI001lIiIIo1O8 = I001lIiIIo1O(j2, io00Io0IO11);
/* 1499 */                          iI000O01llI05 = IOOOi1I1I1.I000O01llI0(i13);
/* 1508 */                          iI000OOo1O = IOOOi1I1I1.I000OOo1O((iI001lIiIIo1O8 >> 31) ^ (iI001lIiIIo1O8 << 1));
/* 1512 */                          iI00000oIO = iI000OOo1O + iI000O01llI05;
/* 1455 */                          iI00000oOI4 += iI00000oIO;
                                }
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case 67:
/* 1466 */                      if (I0010o(io00Io0IO11, i13, i11)) {
/* 1468 */                          long jI001lllioOl6 = I001lllioOl(j2, io00Io0IO11);
/* 1472 */                          iI000O01llI06 = IOOOi1I1I1.I000O01llI0(i13);
/* 1483 */                          iI000OiO2 = IOOOi1I1I1.I000OiO((jI001lllioOl6 >> 63) ^ (jI001lllioOl6 << 1));
/* 1487 */                          iI00000oIO = iI000OiO2 + iI000O01llI06;
/* 1455 */                          iI00000oOI4 += iI00000oIO;
                                }
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                            case 68:
/* 1439 */                      if (I0010o(io00Io0IO11, i13, i11)) {
/* 1451 */                          iI00000oIO = IOOOi1I1I1.I0000oI00(i13, (I01Iio10lo) unsafe.getObject(io00Io0IO11, j2), I00100l0(i11));
/* 1455 */                          iI00000oOI4 += iI00000oIO;
                                }
/* 1457 */                      c = 4;
/* 1458 */                      c2 = '\b';
                                break;
                        }
/* 2629 */              i11 += 3;
/* 2633 */              i2 = i16;
                    }
/* 2637 */          ooiO0li.getClass();
/* 2646 */          return io00Io0IO11.unknownFields.I00000oOI() + iI00000oOI4;
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:184:0x0748  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I0001Ioi1lo(Object obj, iiOlilo0IIIl iiolilo0iiil) throws IOO1IOl1O10 {
                    OoiO0li ooiO0li;
                    int i;
                    boolean z;
                    char c;
                    int i2;
                    boolean z2;
                    int i3;
                    int i4;
/* 7 */             OoiO0li ooiO0li2 = this.I000lI;
/* 9 */             O1Oi10 o1Oi10 = this.I000o00OoI0I;
/* 11 */            iiolilo0iiil.getClass();
/* 16 */            IOOOi1I1I1 iOOOi1I1I1 = (IOOOi1I1I1) iiolilo0iiil.I00iOIl;
/* 18 */            boolean z3 = this.I000II;
/* 20 */            int[] iArr = this.I00000oIO;
/* 22 */            int i5 = 1048575;
/* 26 */            int i6 = 1;
/* 28 */            if (z3) {
/* 30 */                int length = iArr.length;
/* 31 */                int i7 = 0;
/* 32 */                while (i7 < length) {
/* 34 */                    int iI00O0i0ii = I00O0i0ii(i7);
/* 40 */                    int i8 = iArr[i7];
                            switch (I00Iooi00oi(iI00O0i0ii)) {
                                case 0:
/* 1663 */                          i4 = i5;
/* 1671 */                          if (I00100o1O0lo(i7, obj)) {
/* 1678 */                              double dI0000Il00O = Ooil11Oi.I0000Il00O.I0000Il00O(iI00O0i0ii & i4, obj);
/* 1682 */                              iOOOi1I1I1.getClass();
/* 1685 */                              long jDoubleToRawLongBits = Double.doubleToRawLongBits(dI0000Il00O);
/* 1689 */                              iOOOi1I1I1.I00100o1O0lo(i8, 1);
/* 1692 */                              iOOOi1I1I1.I000oI1ioi(jDoubleToRawLongBits);
                                        continue;
                                    }
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case 1:
/* 1630 */                          i4 = i5;
/* 1638 */                          if (I00100o1O0lo(i7, obj)) {
/* 1645 */                              float fI0000O = Ooil11Oi.I0000Il00O.I0000O(iI00O0i0ii & i4, obj);
/* 1649 */                              iOOOi1I1I1.getClass();
/* 1652 */                              int iFloatToRawIntBits = Float.floatToRawIntBits(fI0000O);
/* 1656 */                              iOOOi1I1I1.I00100o1O0lo(i8, 5);
/* 1659 */                              iOOOi1I1I1.I000o00OoI0I(iFloatToRawIntBits);
                                    } else {
                                        continue;
                                    }
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case 2:
/* 1606 */                          i4 = i5;
/* 1614 */                          if (I00100o1O0lo(i7, obj)) {
/* 1619 */                              long jI000OOo1O = Ooil11Oi.I000OOo1O(iI00O0i0ii & i4, obj);
/* 1623 */                              iOOOi1I1I1.I00100o1O0lo(i8, 0);
/* 1626 */                              iOOOi1I1I1.I0010o(jI000OOo1O);
                                    } else {
                                        continue;
                                    }
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case 3:
/* 1582 */                          i4 = i5;
/* 1590 */                          if (I00100o1O0lo(i7, obj)) {
/* 1595 */                              long jI000OOo1O2 = Ooil11Oi.I000OOo1O(iI00O0i0ii & i4, obj);
/* 1599 */                              iOOOi1I1I1.I00100o1O0lo(i8, 0);
/* 1602 */                              iOOOi1I1I1.I0010o(jI000OOo1O2);
                                    } else {
                                        continue;
                                    }
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case 4:
/* 1557 */                          i4 = i5;
/* 1565 */                          if (I00100o1O0lo(i7, obj)) {
/* 1570 */                              int iI000O01llI0 = Ooil11Oi.I000O01llI0(iI00O0i0ii & i4, obj);
/* 1574 */                              iOOOi1I1I1.I00100o1O0lo(i8, 0);
/* 1577 */                              iOOOi1I1I1.I00100l0(iI000O01llI0);
                                    } else {
                                        continue;
                                    }
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case 5:
/* 1532 */                          i4 = i5;
/* 1540 */                          if (I00100o1O0lo(i7, obj)) {
/* 1545 */                              long jI000OOo1O3 = Ooil11Oi.I000OOo1O(iI00O0i0ii & i4, obj);
/* 1549 */                              iOOOi1I1I1.I00100o1O0lo(i8, 1);
/* 1552 */                              iOOOi1I1I1.I000oI1ioi(jI000OOo1O3);
                                    } else {
                                        continue;
                                    }
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case 6:
/* 1507 */                          i4 = i5;
/* 1515 */                          if (I00100o1O0lo(i7, obj)) {
/* 1520 */                              int iI000O01llI02 = Ooil11Oi.I000O01llI0(iI00O0i0ii & i4, obj);
/* 1524 */                              iOOOi1I1I1.I00100o1O0lo(i8, 5);
/* 1527 */                              iOOOi1I1I1.I000o00OoI0I(iI000O01llI02);
                                    } else {
                                        continue;
                                    }
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case 7:
/* 1479 */                          i4 = i5;
/* 1487 */                          if (I00100o1O0lo(i7, obj)) {
/* 1494 */                              boolean zI00000oIO = Ooil11Oi.I0000Il00O.I00000oIO(iI00O0i0ii & i4, obj);
/* 1498 */                              iOOOi1I1I1.I00100o1O0lo(i8, 0);
/* 1502 */                              iOOOi1I1I1.I000l1(zI00000oIO ? (byte) 1 : (byte) 0);
                                    } else {
                                        continue;
                                    }
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case 8:
/* 1457 */                          i4 = i5;
/* 1465 */                          if (I00100o1O0lo(i7, obj)) {
/* 1474 */                              I00O0o1oo(i8, Ooil11Oi.I000OiO(iI00O0i0ii & i4, obj), iiolilo0iiil);
                                    } else {
                                        continue;
                                    }
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case 9:
/* 1431 */                          i4 = i5;
/* 1439 */                          if (I00100o1O0lo(i7, obj)) {
/* 1452 */                              iiolilo0iiil.I00O0i0ii(i8, Ooil11Oi.I000OiO(iI00O0i0ii & i4, obj), I00100l0(i7));
                                    } else {
                                        continue;
                                    }
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case 10:
/* 1407 */                          i4 = i5;
/* 1415 */                          if (I00100o1O0lo(i7, obj)) {
/* 1426 */                              iiolilo0iiil.I00IoiI(i8, (IIOI1Ii1I) Ooil11Oi.I000OiO(iI00O0i0ii & i4, obj));
                                    } else {
                                        continue;
                                    }
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case 11:
/* 1382 */                          i4 = i5;
/* 1390 */                          if (I00100o1O0lo(i7, obj)) {
/* 1395 */                              int iI000O01llI03 = Ooil11Oi.I000O01llI0(iI00O0i0ii & i4, obj);
/* 1399 */                              iOOOi1I1I1.I00100o1O0lo(i8, 0);
/* 1402 */                              iOOOi1I1I1.I0010I0i(iI000O01llI03);
                                    } else {
                                        continue;
                                    }
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case 12:
/* 1357 */                          i4 = i5;
/* 1365 */                          if (I00100o1O0lo(i7, obj)) {
/* 1370 */                              int iI000O01llI04 = Ooil11Oi.I000O01llI0(iI00O0i0ii & i4, obj);
/* 1374 */                              iOOOi1I1I1.I00100o1O0lo(i8, 0);
/* 1377 */                              iOOOi1I1I1.I00100l0(iI000O01llI04);
                                    } else {
                                        continue;
                                    }
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case 13:
/* 1332 */                          i4 = i5;
/* 1340 */                          if (I00100o1O0lo(i7, obj)) {
/* 1345 */                              int iI000O01llI05 = Ooil11Oi.I000O01llI0(iI00O0i0ii & i4, obj);
/* 1349 */                              iOOOi1I1I1.I00100o1O0lo(i8, 5);
/* 1352 */                              iOOOi1I1I1.I000o00OoI0I(iI000O01llI05);
                                    } else {
                                        continue;
                                    }
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case 14:
/* 1307 */                          i4 = i5;
/* 1315 */                          if (I00100o1O0lo(i7, obj)) {
/* 1320 */                              long jI000OOo1O4 = Ooil11Oi.I000OOo1O(iI00O0i0ii & i4, obj);
/* 1324 */                              iOOOi1I1I1.I00100o1O0lo(i8, 1);
/* 1327 */                              iOOOi1I1I1.I000oI1ioi(jI000OOo1O4);
                                    } else {
                                        continue;
                                    }
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case 15:
/* 1277 */                          i4 = i5;
/* 1285 */                          if (I00100o1O0lo(i7, obj)) {
/* 1290 */                              int iI000O01llI06 = Ooil11Oi.I000O01llI0(iI00O0i0ii & i4, obj);
/* 1299 */                              iOOOi1I1I1.I00100o1O0lo(i8, 0);
/* 1302 */                              iOOOi1I1I1.I0010I0i((iI000O01llI06 >> 31) ^ (iI000O01llI06 << 1));
                                    } else {
                                        continue;
                                    }
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case 16:
/* 1246 */                          i4 = i5;
/* 1254 */                          if (I00100o1O0lo(i7, obj)) {
/* 1259 */                              long jI000OOo1O5 = Ooil11Oi.I000OOo1O(iI00O0i0ii & i4, obj);
/* 1269 */                              iOOOi1I1I1.I00100o1O0lo(i8, 0);
/* 1272 */                              iOOOi1I1I1.I0010o((jI000OOo1O5 << 1) ^ (jI000OOo1O5 >> 63));
                                    } else {
                                        continue;
                                    }
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case 17:
/* 1220 */                          i4 = i5;
/* 1228 */                          if (I00100o1O0lo(i7, obj)) {
/* 1241 */                              iiolilo0iiil.I00Iooi00oi(i8, Ooil11Oi.I000OiO(iI00O0i0ii & i4, obj), I00100l0(i7));
                                    } else {
                                        continue;
                                    }
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case PoseLandmark.RIGHT_PINKY:
/* 1200 */                          i4 = i5;
/* 1215 */                          OiOO0o1I0.I001lIiIIo1O(iArr[i7], (List) Ooil11Oi.I000OiO(iI00O0i0ii & i4, obj), iiolilo0iiil, false);
                                    continue;
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case PoseLandmark.LEFT_INDEX:
/* 1180 */                          i4 = i5;
/* 1195 */                          OiOO0o1I0.I00II0oii1o(iArr[i7], (List) Ooil11Oi.I000OiO(iI00O0i0ii & i4, obj), iiolilo0iiil, false);
                                    continue;
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case PoseLandmark.RIGHT_INDEX:
/* 1160 */                          i4 = i5;
/* 1175 */                          OiOO0o1I0.I00IOO(iArr[i7], (List) Ooil11Oi.I000OiO(iI00O0i0ii & i4, obj), iiolilo0iiil, false);
                                    continue;
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case PoseLandmark.LEFT_THUMB:
/* 1140 */                          i4 = i5;
/* 1155 */                          OiOO0o1I0.I00Iooi00oi(iArr[i7], (List) Ooil11Oi.I000OiO(iI00O0i0ii & i4, obj), iiolilo0iiil, false);
                                    continue;
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case PoseLandmark.RIGHT_THUMB:
/* 1120 */                          i4 = i5;
/* 1135 */                          OiOO0o1I0.I00IO1oi11O(iArr[i7], (List) Ooil11Oi.I000OiO(iI00O0i0ii & i4, obj), iiolilo0iiil, false);
                                    continue;
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case PoseLandmark.LEFT_HIP:
/* 1100 */                          i4 = i5;
/* 1115 */                          OiOO0o1I0.I00II0Ol1O0l(iArr[i7], (List) Ooil11Oi.I000OiO(iI00O0i0ii & i4, obj), iiolilo0iiil, false);
                                    continue;
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case PoseLandmark.RIGHT_HIP:
/* 1080 */                          i4 = i5;
/* 1095 */                          OiOO0o1I0.I001lloI(iArr[i7], (List) Ooil11Oi.I000OiO(iI00O0i0ii & i4, obj), iiolilo0iiil, false);
                                    continue;
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case PoseLandmark.LEFT_KNEE:
/* 1060 */                          i4 = i5;
/* 1075 */                          OiOO0o1I0.I001iOo1i0O(iArr[i7], (List) Ooil11Oi.I000OiO(iI00O0i0ii & i4, obj), iiolilo0iiil, false);
                                    continue;
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case PoseLandmark.RIGHT_KNEE:
/* 1040 */                          i4 = i5;
/* 1055 */                          OiOO0o1I0.I00IoO0(iArr[i7], (List) Ooil11Oi.I000OiO(iI00O0i0ii & i4, obj), iiolilo0iiil);
                                    continue;
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case 27:
/* 1016 */                          i4 = i5;
/* 1035 */                          OiOO0o1I0.I00IioO0OiOi(iArr[i7], (List) Ooil11Oi.I000OiO(iI00O0i0ii & i4, obj), iiolilo0iiil, I00100l0(i7));
                                    continue;
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case PoseLandmark.RIGHT_ANKLE:
/* 996 */                           i4 = i5;
/* 1011 */                          OiOO0o1I0.I001l0I00(iArr[i7], (List) Ooil11Oi.I000OiO(iI00O0i0ii & i4, obj), iiolilo0iiil);
                                    continue;
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case PoseLandmark.LEFT_HEEL:
/* 976 */                           i4 = i5;
/* 991 */                           OiOO0o1I0.I00IoiI(iArr[i7], (List) Ooil11Oi.I000OiO(iI00O0i0ii & i4, obj), iiolilo0iiil, false);
                                    continue;
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case 30:
/* 956 */                           i4 = i5;
/* 971 */                           OiOO0o1I0.I001lllioOl(iArr[i7], (List) Ooil11Oi.I000OiO(iI00O0i0ii & i4, obj), iiolilo0iiil, false);
                                    continue;
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case PoseLandmark.LEFT_FOOT_INDEX:
/* 936 */                           i4 = i5;
/* 951 */                           OiOO0o1I0.I00IlilI0i0i(iArr[i7], (List) Ooil11Oi.I000OiO(iI00O0i0ii & i4, obj), iiolilo0iiil, false);
                                    continue;
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case 32:
/* 916 */                           i4 = i5;
/* 931 */                           OiOO0o1I0.I00Io1lO(iArr[i7], (List) Ooil11Oi.I000OiO(iI00O0i0ii & i4, obj), iiolilo0iiil, false);
                                    continue;
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case 33:
/* 896 */                           i4 = i5;
/* 911 */                           OiOO0o1I0.I00Io1o110i(iArr[i7], (List) Ooil11Oi.I000OiO(iI00O0i0ii & i4, obj), iiolilo0iiil, false);
                                    continue;
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case 34:
/* 876 */                           i4 = i5;
/* 891 */                           OiOO0o1I0.I00IoIO0lI(iArr[i7], (List) Ooil11Oi.I000OiO(iI00O0i0ii & i4, obj), iiolilo0iiil, false);
                                    continue;
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case InputImage.IMAGE_FORMAT_YUV_420_888:
/* 856 */                           i4 = i5;
/* 871 */                           OiOO0o1I0.I001lIiIIo1O(iArr[i7], (List) Ooil11Oi.I000OiO(iI00O0i0ii & i4, obj), iiolilo0iiil, true);
                                    continue;
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case 36:
/* 836 */                           i4 = i5;
/* 851 */                           OiOO0o1I0.I00II0oii1o(iArr[i7], (List) Ooil11Oi.I000OiO(iI00O0i0ii & i4, obj), iiolilo0iiil, true);
                                    continue;
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case 37:
/* 816 */                           i4 = i5;
/* 831 */                           OiOO0o1I0.I00IOO(iArr[i7], (List) Ooil11Oi.I000OiO(iI00O0i0ii & i4, obj), iiolilo0iiil, true);
                                    continue;
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case 38:
/* 796 */                           i4 = i5;
/* 811 */                           OiOO0o1I0.I00Iooi00oi(iArr[i7], (List) Ooil11Oi.I000OiO(iI00O0i0ii & i4, obj), iiolilo0iiil, true);
                                    continue;
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case 39:
/* 776 */                           i4 = i5;
/* 791 */                           OiOO0o1I0.I00IO1oi11O(iArr[i7], (List) Ooil11Oi.I000OiO(iI00O0i0ii & i4, obj), iiolilo0iiil, true);
                                    continue;
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case 40:
/* 756 */                           i4 = i5;
/* 771 */                           OiOO0o1I0.I00II0Ol1O0l(iArr[i7], (List) Ooil11Oi.I000OiO(iI00O0i0ii & i4, obj), iiolilo0iiil, true);
                                    continue;
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case 41:
/* 736 */                           i4 = i5;
/* 751 */                           OiOO0o1I0.I001lloI(iArr[i7], (List) Ooil11Oi.I000OiO(iI00O0i0ii & i4, obj), iiolilo0iiil, true);
                                    continue;
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case 42:
/* 716 */                           i4 = i5;
/* 731 */                           OiOO0o1I0.I001iOo1i0O(iArr[i7], (List) Ooil11Oi.I000OiO(iI00O0i0ii & i4, obj), iiolilo0iiil, true);
                                    continue;
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case 43:
/* 696 */                           i4 = i5;
/* 711 */                           OiOO0o1I0.I00IoiI(iArr[i7], (List) Ooil11Oi.I000OiO(iI00O0i0ii & i4, obj), iiolilo0iiil, true);
                                    continue;
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case 44:
/* 676 */                           i4 = i5;
/* 691 */                           OiOO0o1I0.I001lllioOl(iArr[i7], (List) Ooil11Oi.I000OiO(iI00O0i0ii & i4, obj), iiolilo0iiil, true);
                                    continue;
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case BuildConfig.VERSION_CODE:
/* 656 */                           i4 = i5;
/* 671 */                           OiOO0o1I0.I00IlilI0i0i(iArr[i7], (List) Ooil11Oi.I000OiO(iI00O0i0ii & i4, obj), iiolilo0iiil, true);
                                    continue;
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case 46:
/* 636 */                           i4 = i5;
/* 651 */                           OiOO0o1I0.I00Io1lO(iArr[i7], (List) Ooil11Oi.I000OiO(iI00O0i0ii & i4, obj), iiolilo0iiil, true);
                                    continue;
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case 47:
/* 616 */                           i4 = i5;
/* 631 */                           OiOO0o1I0.I00Io1o110i(iArr[i7], (List) Ooil11Oi.I000OiO(iI00O0i0ii & i4, obj), iiolilo0iiil, true);
                                    continue;
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case 48:
/* 596 */                           i4 = i5;
/* 611 */                           OiOO0o1I0.I00IoIO0lI(iArr[i7], (List) Ooil11Oi.I000OiO(iI00O0i0ii & i4, obj), iiolilo0iiil, true);
                                    continue;
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case 49:
/* 572 */                           i4 = i5;
/* 591 */                           OiOO0o1I0.I00IO1(iArr[i7], (List) Ooil11Oi.I000OiO(iI00O0i0ii & i4, obj), iiolilo0iiil, I00100l0(i7));
                                    continue;
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case 50:
/* 546 */                           i4 = i5;
/* 557 */                           if (Ooil11Oi.I000OiO(iI00O0i0ii & i4, obj) != null) {
/* 561 */                               Object objI000oI1ioi = I000oI1ioi(i7);
/* 565 */                               o1Oi10.getClass();
/* 568 */                               IIlIOloOOO.I001i1lo1io(objI000oI1ioi);
/* 571 */                               throw null;
                                    }
                                    continue;
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case 51:
/* 508 */                           i4 = i5;
/* 516 */                           if (I0010o(obj, i8, i7)) {
/* 527 */                               double dDoubleValue = ((Double) Ooil11Oi.I000OiO(iI00O0i0ii & i4, obj)).doubleValue();
/* 531 */                               iOOOi1I1I1.getClass();
/* 534 */                               long jDoubleToRawLongBits2 = Double.doubleToRawLongBits(dDoubleValue);
/* 538 */                               iOOOi1I1I1.I00100o1O0lo(i8, 1);
/* 541 */                               iOOOi1I1I1.I000oI1ioi(jDoubleToRawLongBits2);
                                    } else {
                                        continue;
                                    }
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case 52:
/* 470 */                           i4 = i5;
/* 478 */                           if (I0010o(obj, i8, i7)) {
/* 489 */                               float fFloatValue = ((Float) Ooil11Oi.I000OiO(iI00O0i0ii & i4, obj)).floatValue();
/* 493 */                               iOOOi1I1I1.getClass();
/* 496 */                               int iFloatToRawIntBits2 = Float.floatToRawIntBits(fFloatValue);
/* 500 */                               iOOOi1I1I1.I00100o1O0lo(i8, 5);
/* 503 */                               iOOOi1I1I1.I000o00OoI0I(iFloatToRawIntBits2);
                                    } else {
                                        continue;
                                    }
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case 53:
/* 445 */                           i4 = i5;
/* 453 */                           if (I0010o(obj, i8, i7)) {
/* 458 */                               long jI001lllioOl = I001lllioOl(iI00O0i0ii & i4, obj);
/* 462 */                               iOOOi1I1I1.I00100o1O0lo(i8, 0);
/* 465 */                               iOOOi1I1I1.I0010o(jI001lllioOl);
                                    } else {
                                        continue;
                                    }
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case 54:
/* 420 */                           i4 = i5;
/* 428 */                           if (I0010o(obj, i8, i7)) {
/* 433 */                               long jI001lllioOl2 = I001lllioOl(iI00O0i0ii & i4, obj);
/* 437 */                               iOOOi1I1I1.I00100o1O0lo(i8, 0);
/* 440 */                               iOOOi1I1I1.I0010o(jI001lllioOl2);
                                    } else {
                                        continue;
                                    }
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case 55:
/* 395 */                           i4 = i5;
/* 403 */                           if (I0010o(obj, i8, i7)) {
/* 408 */                               int iI001lIiIIo1O = I001lIiIIo1O(iI00O0i0ii & i4, obj);
/* 412 */                               iOOOi1I1I1.I00100o1O0lo(i8, 0);
/* 415 */                               iOOOi1I1I1.I00100l0(iI001lIiIIo1O);
                                    } else {
                                        continue;
                                    }
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case 56:
/* 370 */                           i4 = i5;
/* 378 */                           if (I0010o(obj, i8, i7)) {
/* 383 */                               long jI001lllioOl3 = I001lllioOl(iI00O0i0ii & i4, obj);
/* 387 */                               iOOOi1I1I1.I00100o1O0lo(i8, 1);
/* 390 */                               iOOOi1I1I1.I000oI1ioi(jI001lllioOl3);
                                    } else {
                                        continue;
                                    }
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case 57:
/* 345 */                           i4 = i5;
/* 353 */                           if (I0010o(obj, i8, i7)) {
/* 358 */                               int iI001lIiIIo1O2 = I001lIiIIo1O(iI00O0i0ii & i4, obj);
/* 362 */                               iOOOi1I1I1.I00100o1O0lo(i8, 5);
/* 365 */                               iOOOi1I1I1.I000o00OoI0I(iI001lIiIIo1O2);
                                    } else {
                                        continue;
                                    }
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case 58:
/* 313 */                           i4 = i5;
/* 321 */                           if (I0010o(obj, i8, i7)) {
/* 332 */                               boolean zBooleanValue = ((Boolean) Ooil11Oi.I000OiO(iI00O0i0ii & i4, obj)).booleanValue();
/* 336 */                               iOOOi1I1I1.I00100o1O0lo(i8, 0);
/* 340 */                               iOOOi1I1I1.I000l1(zBooleanValue ? (byte) 1 : (byte) 0);
                                    } else {
                                        continue;
                                    }
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case 59:
/* 291 */                           i4 = i5;
/* 299 */                           if (I0010o(obj, i8, i7)) {
/* 308 */                               I00O0o1oo(i8, Ooil11Oi.I000OiO(iI00O0i0ii & i4, obj), iiolilo0iiil);
                                    } else {
                                        continue;
                                    }
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case 60:
/* 265 */                           i4 = i5;
/* 273 */                           if (I0010o(obj, i8, i7)) {
/* 286 */                               iiolilo0iiil.I00O0i0ii(i8, Ooil11Oi.I000OiO(iI00O0i0ii & i4, obj), I00100l0(i7));
                                    } else {
                                        continue;
                                    }
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case 61:
/* 241 */                           i4 = i5;
/* 249 */                           if (I0010o(obj, i8, i7)) {
/* 260 */                               iiolilo0iiil.I00IoiI(i8, (IIOI1Ii1I) Ooil11Oi.I000OiO(iI00O0i0ii & i4, obj));
                                    } else {
                                        continue;
                                    }
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case 62:
/* 216 */                           i4 = i5;
/* 224 */                           if (I0010o(obj, i8, i7)) {
/* 229 */                               int iI001lIiIIo1O3 = I001lIiIIo1O(iI00O0i0ii & i4, obj);
/* 233 */                               iOOOi1I1I1.I00100o1O0lo(i8, 0);
/* 236 */                               iOOOi1I1I1.I0010I0i(iI001lIiIIo1O3);
                                    } else {
                                        continue;
                                    }
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case 63:
/* 191 */                           i4 = i5;
/* 199 */                           if (I0010o(obj, i8, i7)) {
/* 204 */                               int iI001lIiIIo1O4 = I001lIiIIo1O(iI00O0i0ii & i4, obj);
/* 208 */                               iOOOi1I1I1.I00100o1O0lo(i8, 0);
/* 211 */                               iOOOi1I1I1.I00100l0(iI001lIiIIo1O4);
                                    } else {
                                        continue;
                                    }
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case Barcode.FORMAT_EAN_8:
/* 166 */                           i4 = i5;
/* 174 */                           if (I0010o(obj, i8, i7)) {
/* 179 */                               int iI001lIiIIo1O5 = I001lIiIIo1O(iI00O0i0ii & i4, obj);
/* 183 */                               iOOOi1I1I1.I00100o1O0lo(i8, 5);
/* 186 */                               iOOOi1I1I1.I000o00OoI0I(iI001lIiIIo1O5);
                                    } else {
                                        continue;
                                    }
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case 65:
/* 141 */                           i4 = i5;
/* 149 */                           if (I0010o(obj, i8, i7)) {
/* 154 */                               long jI001lllioOl4 = I001lllioOl(iI00O0i0ii & i4, obj);
/* 158 */                               iOOOi1I1I1.I00100o1O0lo(i8, 1);
/* 161 */                               iOOOi1I1I1.I000oI1ioi(jI001lllioOl4);
                                    } else {
                                        continue;
                                    }
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case 66:
/* 111 */                           i4 = i5;
/* 119 */                           if (I0010o(obj, i8, i7)) {
/* 124 */                               int iI001lIiIIo1O6 = I001lIiIIo1O(iI00O0i0ii & i4, obj);
/* 133 */                               iOOOi1I1I1.I00100o1O0lo(i8, 0);
/* 136 */                               iOOOi1I1I1.I0010I0i((iI001lIiIIo1O6 >> 31) ^ (iI001lIiIIo1O6 << 1));
                                    } else {
                                        continue;
                                    }
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case 67:
/* 80 */                            i4 = i5;
/* 88 */                            if (I0010o(obj, i8, i7)) {
/* 93 */                                long jI001lllioOl5 = I001lllioOl(iI00O0i0ii & i4, obj);
/* 103 */                               iOOOi1I1I1.I00100o1O0lo(i8, 0);
/* 106 */                               iOOOi1I1I1.I0010o((jI001lllioOl5 << 1) ^ (jI001lllioOl5 >> 63));
                                    } else {
                                        continue;
                                    }
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                case 68:
/* 59 */                            if (I0010o(obj, i8, i7)) {
/* 62 */                                i4 = i5;
/* 75 */                                iiolilo0iiil.I00Iooi00oi(i8, Ooil11Oi.I000OiO(iI00O0i0ii & i5, obj), I00100l0(i7));
                                    }
/* 1695 */                          i7 += 3;
/* 1697 */                          i5 = i4;
                                    break;
                            }
/* 49 */                    i4 = i5;
/* 1695 */                  i7 += 3;
/* 1697 */                  i5 = i4;
                        }
/* 1701 */              ooiO0li2.getClass();
/* 1709 */              ((Io00Io0IO11) obj).unknownFields.I0000oI00(iiolilo0iiil);
/* 1712 */              return;
                    }
/* 1719 */          int length2 = iArr.length;
/* 1720 */          int i9 = 0;
/* 1721 */          int i10 = 0;
/* 1722 */          while (i9 < length2) {
/* 1724 */              int iI00O0i0ii2 = I00O0i0ii(i9);
/* 1728 */              int i11 = iArr[i9];
/* 1730 */              int iI00Iooi00oi = I00Iooi00oi(iI00O0i0ii2);
/* 1734 */              int i12 = i6;
/* 1738 */              Unsafe unsafe = I00100l0;
/* 1740 */              if (iI00Iooi00oi <= 17) {
/* 1744 */                  int i13 = iArr[i9 + 2];
/* 1746 */                  ooiO0li = ooiO0li2;
/* 1748 */                  int i14 = i13 & 1048575;
/* 1750 */                  if (i14 != i5) {
/* 1753 */                      i10 = unsafe.getInt(obj, i14);
/* 1757 */                      i5 = i14;
                            }
/* 1760 */                  i = i12 << (i13 >>> 20);
                        } else {
/* 1763 */                  ooiO0li = ooiO0li2;
/* 1765 */                  i = 0;
                        }
/* 1766 */              int i15 = iI00O0i0ii2 & 1048575;
/* 1768 */              int i16 = i;
/* 1770 */              O1Oi10 o1Oi102 = o1Oi10;
                        long j = i15;
                        switch (iI00Iooi00oi) {
                            case 0:
/* 2937 */                      z = false;
/* 2938 */                      c = 5;
/* 2941 */                      if ((i10 & i16) != 0) {
/* 2945 */                          double dI0000Il00O2 = Ooil11Oi.I0000Il00O.I0000Il00O(j, obj);
/* 2949 */                          iOOOi1I1I1.getClass();
/* 2952 */                          long jDoubleToRawLongBits3 = Double.doubleToRawLongBits(dI0000Il00O2);
/* 2956 */                          i2 = 1;
/* 2957 */                          iOOOi1I1I1.I00100o1O0lo(i11, 1);
/* 2960 */                          iOOOi1I1I1.I000oI1ioi(jDoubleToRawLongBits3);
                                } else {
/* 1867 */                          i2 = 1;
                                }
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case 1:
/* 2910 */                      z = false;
/* 2913 */                      if ((i10 & i16) != 0) {
/* 2917 */                          float fI0000O2 = Ooil11Oi.I0000Il00O.I0000O(j, obj);
/* 2921 */                          iOOOi1I1I1.getClass();
/* 2924 */                          int iFloatToRawIntBits3 = Float.floatToRawIntBits(fI0000O2);
/* 2928 */                          c = 5;
/* 2929 */                          iOOOi1I1I1.I00100o1O0lo(i11, 5);
/* 2932 */                          iOOOi1I1I1.I000o00OoI0I(iFloatToRawIntBits3);
                                } else {
/* 1866 */                          c = 5;
                                }
/* 1867 */                      i2 = 1;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case 2:
/* 2893 */                      z = false;
/* 2896 */                      if ((i10 & i16) != 0) {
/* 2898 */                          long j2 = unsafe.getLong(obj, j);
/* 2902 */                          iOOOi1I1I1.I00100o1O0lo(i11, 0);
/* 2905 */                          iOOOi1I1I1.I0010o(j2);
                                }
/* 1866 */                      c = 5;
/* 1867 */                      i2 = 1;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case 3:
/* 2876 */                      z = false;
/* 2879 */                      if ((i10 & i16) != 0) {
/* 2881 */                          long j3 = unsafe.getLong(obj, j);
/* 2885 */                          iOOOi1I1I1.I00100o1O0lo(i11, 0);
/* 2888 */                          iOOOi1I1I1.I0010o(j3);
                                }
/* 1866 */                      c = 5;
/* 1867 */                      i2 = 1;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case 4:
/* 2861 */                      if ((i10 & i16) != 0) {
/* 2863 */                          int i17 = unsafe.getInt(obj, j);
/* 2867 */                          z = false;
/* 2868 */                          iOOOi1I1I1.I00100o1O0lo(i11, 0);
/* 2871 */                          iOOOi1I1I1.I00100l0(i17);
                                } else {
/* 1865 */                          z = false;
                                }
/* 1866 */                      c = 5;
/* 1867 */                      i2 = 1;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case 5:
/* 2844 */                      if ((i10 & i16) != 0) {
/* 2846 */                          long j4 = unsafe.getLong(obj, j);
/* 2851 */                          iOOOi1I1I1.I00100o1O0lo(i11, 1);
/* 2854 */                          iOOOi1I1I1.I000oI1ioi(j4);
                                }
/* 1865 */                      z = false;
/* 1866 */                      c = 5;
/* 1867 */                      i2 = 1;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case 6:
/* 2827 */                      if ((i10 & i16) != 0) {
/* 2829 */                          int i18 = unsafe.getInt(obj, j);
/* 2834 */                          iOOOi1I1I1.I00100o1O0lo(i11, 5);
/* 2837 */                          iOOOi1I1I1.I000o00OoI0I(i18);
                                }
/* 1865 */                      z = false;
/* 1866 */                      c = 5;
/* 1867 */                      i2 = 1;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case 7:
/* 2807 */                      if ((i10 & i16) != 0) {
/* 2811 */                          boolean zI00000oIO2 = Ooil11Oi.I0000Il00O.I00000oIO(j, obj);
/* 2816 */                          iOOOi1I1I1.I00100o1O0lo(i11, 0);
/* 2820 */                          iOOOi1I1I1.I000l1(zI00000oIO2 ? (byte) 1 : (byte) 0);
                                }
/* 1865 */                      z = false;
/* 1866 */                      c = 5;
/* 1867 */                      i2 = 1;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case 8:
/* 2794 */                      if ((i10 & i16) != 0) {
/* 2800 */                          I00O0o1oo(i11, unsafe.getObject(obj, j), iiolilo0iiil);
                                }
/* 1865 */                      z = false;
/* 1866 */                      c = 5;
/* 1867 */                      i2 = 1;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case 9:
/* 2777 */                      if ((i10 & i16) != 0) {
/* 2787 */                          iiolilo0iiil.I00O0i0ii(i11, unsafe.getObject(obj, j), I00100l0(i9));
                                }
/* 1865 */                      z = false;
/* 1866 */                      c = 5;
/* 1867 */                      i2 = 1;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case 10:
/* 2762 */                      if ((i10 & i16) != 0) {
/* 2770 */                          iiolilo0iiil.I00IoiI(i11, (IIOI1Ii1I) unsafe.getObject(obj, j));
                                }
/* 1865 */                      z = false;
/* 1866 */                      c = 5;
/* 1867 */                      i2 = 1;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case 11:
/* 2743 */                      z = false;
/* 2746 */                      if ((i10 & i16) != 0) {
/* 2748 */                          int i19 = unsafe.getInt(obj, j);
/* 2752 */                          iOOOi1I1I1.I00100o1O0lo(i11, 0);
/* 2755 */                          iOOOi1I1I1.I0010I0i(i19);
/* 1865 */                          z = false;
                                }
/* 1866 */                      c = 5;
/* 1867 */                      i2 = 1;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case 12:
/* 2728 */                      if ((i10 & i16) != 0) {
/* 2730 */                          int i20 = unsafe.getInt(obj, j);
/* 2734 */                          z = false;
/* 2735 */                          iOOOi1I1I1.I00100o1O0lo(i11, 0);
/* 2738 */                          iOOOi1I1I1.I00100l0(i20);
                                }
/* 1866 */                      c = 5;
/* 1867 */                      i2 = 1;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                                break;
                            case 13:
/* 2711 */                      if ((i10 & i16) != 0) {
/* 2713 */                          int i21 = unsafe.getInt(obj, j);
/* 2718 */                          iOOOi1I1I1.I00100o1O0lo(i11, 5);
/* 2721 */                          iOOOi1I1I1.I000o00OoI0I(i21);
                                }
/* 1865 */                      z = false;
/* 1866 */                      c = 5;
/* 1867 */                      i2 = 1;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case 14:
/* 2694 */                      if ((i10 & i16) != 0) {
/* 2696 */                          long j5 = unsafe.getLong(obj, j);
/* 2701 */                          iOOOi1I1I1.I00100o1O0lo(i11, 1);
/* 2704 */                          iOOOi1I1I1.I000oI1ioi(j5);
                                }
/* 1865 */                      z = false;
/* 1866 */                      c = 5;
/* 1867 */                      i2 = 1;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case 15:
/* 2670 */                      z = false;
/* 2673 */                      if ((i10 & i16) != 0) {
/* 2675 */                          int i22 = unsafe.getInt(obj, j);
/* 2684 */                          iOOOi1I1I1.I00100o1O0lo(i11, 0);
/* 2687 */                          iOOOi1I1I1.I0010I0i((i22 >> 31) ^ (i22 << 1));
/* 1865 */                          z = false;
                                }
/* 1866 */                      c = 5;
/* 1867 */                      i2 = 1;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case 16:
/* 2648 */                      if ((i10 & i16) != 0) {
/* 2650 */                          long j6 = unsafe.getLong(obj, j);
/* 2661 */                          z = false;
/* 2662 */                          iOOOi1I1I1.I00100o1O0lo(i11, 0);
/* 2665 */                          iOOOi1I1I1.I0010o((j6 >> 63) ^ (j6 << 1));
                                }
/* 1866 */                      c = 5;
/* 1867 */                      i2 = 1;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                                break;
                            case 17:
/* 2631 */                      if ((i10 & i16) != 0) {
/* 2641 */                          iiolilo0iiil.I00Iooi00oi(i11, unsafe.getObject(obj, j), I00100l0(i9));
                                }
/* 1865 */                      z = false;
/* 1866 */                      c = 5;
/* 1867 */                      i2 = 1;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case PoseLandmark.RIGHT_PINKY:
/* 2615 */                      z2 = false;
/* 2624 */                      OiOO0o1I0.I001lIiIIo1O(iArr[i9], (List) unsafe.getObject(obj, j), iiolilo0iiil, false);
/* 2407 */                      z = z2;
/* 1866 */                      c = 5;
/* 1867 */                      i2 = 1;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case PoseLandmark.LEFT_INDEX:
/* 2601 */                      z2 = false;
/* 2610 */                      OiOO0o1I0.I00II0oii1o(iArr[i9], (List) unsafe.getObject(obj, j), iiolilo0iiil, false);
/* 2407 */                      z = z2;
/* 1866 */                      c = 5;
/* 1867 */                      i2 = 1;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case PoseLandmark.RIGHT_INDEX:
/* 2587 */                      z2 = false;
/* 2596 */                      OiOO0o1I0.I00IOO(iArr[i9], (List) unsafe.getObject(obj, j), iiolilo0iiil, false);
/* 2407 */                      z = z2;
/* 1866 */                      c = 5;
/* 1867 */                      i2 = 1;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case PoseLandmark.LEFT_THUMB:
/* 2573 */                      z2 = false;
/* 2582 */                      OiOO0o1I0.I00Iooi00oi(iArr[i9], (List) unsafe.getObject(obj, j), iiolilo0iiil, false);
/* 2407 */                      z = z2;
/* 1866 */                      c = 5;
/* 1867 */                      i2 = 1;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case PoseLandmark.RIGHT_THUMB:
/* 2559 */                      z2 = false;
/* 2568 */                      OiOO0o1I0.I00IO1oi11O(iArr[i9], (List) unsafe.getObject(obj, j), iiolilo0iiil, false);
/* 2407 */                      z = z2;
/* 1866 */                      c = 5;
/* 1867 */                      i2 = 1;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case PoseLandmark.LEFT_HIP:
/* 2545 */                      z2 = false;
/* 2554 */                      OiOO0o1I0.I00II0Ol1O0l(iArr[i9], (List) unsafe.getObject(obj, j), iiolilo0iiil, false);
/* 2407 */                      z = z2;
/* 1866 */                      c = 5;
/* 1867 */                      i2 = 1;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case PoseLandmark.RIGHT_HIP:
/* 2531 */                      z2 = false;
/* 2540 */                      OiOO0o1I0.I001lloI(iArr[i9], (List) unsafe.getObject(obj, j), iiolilo0iiil, false);
/* 2407 */                      z = z2;
/* 1866 */                      c = 5;
/* 1867 */                      i2 = 1;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case PoseLandmark.LEFT_KNEE:
/* 2526 */                      z2 = false;
/* 2527 */                      OiOO0o1I0.I001iOo1i0O(iArr[i9], (List) unsafe.getObject(obj, j), iiolilo0iiil, false);
/* 2407 */                      z = z2;
/* 1866 */                      c = 5;
/* 1867 */                      i2 = 1;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case PoseLandmark.RIGHT_KNEE:
/* 2513 */                      OiOO0o1I0.I00IoO0(iArr[i9], (List) unsafe.getObject(obj, j), iiolilo0iiil);
/* 1865 */                      z = false;
/* 1866 */                      c = 5;
/* 1867 */                      i2 = 1;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case 27:
/* 2500 */                      OiOO0o1I0.I00IioO0OiOi(iArr[i9], (List) unsafe.getObject(obj, j), iiolilo0iiil, I00100l0(i9));
/* 1865 */                      z = false;
/* 1866 */                      c = 5;
/* 1867 */                      i2 = 1;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case PoseLandmark.RIGHT_ANKLE:
/* 2483 */                      OiOO0o1I0.I001l0I00(iArr[i9], (List) unsafe.getObject(obj, j), iiolilo0iiil);
/* 1865 */                      z = false;
/* 1866 */                      c = 5;
/* 1867 */                      i2 = 1;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case PoseLandmark.LEFT_HEEL:
/* 2462 */                      z2 = false;
/* 2471 */                      OiOO0o1I0.I00IoiI(iArr[i9], (List) unsafe.getObject(obj, j), iiolilo0iiil, false);
/* 2407 */                      z = z2;
/* 1866 */                      c = 5;
/* 1867 */                      i2 = 1;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case 30:
/* 2449 */                      z2 = false;
/* 2458 */                      OiOO0o1I0.I001lllioOl(iArr[i9], (List) unsafe.getObject(obj, j), iiolilo0iiil, false);
/* 2407 */                      z = z2;
/* 1866 */                      c = 5;
/* 1867 */                      i2 = 1;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case PoseLandmark.LEFT_FOOT_INDEX:
/* 2436 */                      z2 = false;
/* 2445 */                      OiOO0o1I0.I00IlilI0i0i(iArr[i9], (List) unsafe.getObject(obj, j), iiolilo0iiil, false);
/* 2407 */                      z = z2;
/* 1866 */                      c = 5;
/* 1867 */                      i2 = 1;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case 32:
/* 2423 */                      z2 = false;
/* 2432 */                      OiOO0o1I0.I00Io1lO(iArr[i9], (List) unsafe.getObject(obj, j), iiolilo0iiil, false);
/* 2407 */                      z = z2;
/* 1866 */                      c = 5;
/* 1867 */                      i2 = 1;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case 33:
/* 2410 */                      z2 = false;
/* 2419 */                      OiOO0o1I0.I00Io1o110i(iArr[i9], (List) unsafe.getObject(obj, j), iiolilo0iiil, false);
/* 2407 */                      z = z2;
/* 1866 */                      c = 5;
/* 1867 */                      i2 = 1;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case 34:
/* 2403 */                      z2 = false;
/* 2404 */                      OiOO0o1I0.I00IoIO0lI(iArr[i9], (List) unsafe.getObject(obj, j), iiolilo0iiil, false);
/* 2407 */                      z = z2;
/* 1866 */                      c = 5;
/* 1867 */                      i2 = 1;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case InputImage.IMAGE_FORMAT_YUV_420_888:
/* 2380 */                      boolean z4 = i12;
/* 2390 */                      OiOO0o1I0.I001lIiIIo1O(iArr[i9], (List) unsafe.getObject(obj, j), iiolilo0iiil, z4);
                                i3 = z4;
/* 2205 */                      i2 = i3;
/* 1777 */                      z = false;
/* 1778 */                      c = 5;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case 36:
/* 2365 */                      boolean z5 = i12;
/* 2375 */                      OiOO0o1I0.I00II0oii1o(iArr[i9], (List) unsafe.getObject(obj, j), iiolilo0iiil, z5);
                                i3 = z5;
/* 2205 */                      i2 = i3;
/* 1777 */                      z = false;
/* 1778 */                      c = 5;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case 37:
/* 2350 */                      boolean z6 = i12;
/* 2360 */                      OiOO0o1I0.I00IOO(iArr[i9], (List) unsafe.getObject(obj, j), iiolilo0iiil, z6);
                                i3 = z6;
/* 2205 */                      i2 = i3;
/* 1777 */                      z = false;
/* 1778 */                      c = 5;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case 38:
/* 2335 */                      boolean z7 = i12;
/* 2345 */                      OiOO0o1I0.I00Iooi00oi(iArr[i9], (List) unsafe.getObject(obj, j), iiolilo0iiil, z7);
                                i3 = z7;
/* 2205 */                      i2 = i3;
/* 1777 */                      z = false;
/* 1778 */                      c = 5;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case 39:
/* 2320 */                      boolean z8 = i12;
/* 2330 */                      OiOO0o1I0.I00IO1oi11O(iArr[i9], (List) unsafe.getObject(obj, j), iiolilo0iiil, z8);
                                i3 = z8;
/* 2205 */                      i2 = i3;
/* 1777 */                      z = false;
/* 1778 */                      c = 5;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case 40:
/* 2306 */                      boolean z9 = i12;
/* 2316 */                      OiOO0o1I0.I00II0Ol1O0l(iArr[i9], (List) unsafe.getObject(obj, j), iiolilo0iiil, z9);
                                i3 = z9;
/* 2205 */                      i2 = i3;
/* 1777 */                      z = false;
/* 1778 */                      c = 5;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case 41:
/* 2292 */                      boolean z10 = i12;
/* 2302 */                      OiOO0o1I0.I001lloI(iArr[i9], (List) unsafe.getObject(obj, j), iiolilo0iiil, z10);
                                i3 = z10;
/* 2205 */                      i2 = i3;
/* 1777 */                      z = false;
/* 1778 */                      c = 5;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case 42:
/* 2278 */                      boolean z11 = i12;
/* 2288 */                      OiOO0o1I0.I001iOo1i0O(iArr[i9], (List) unsafe.getObject(obj, j), iiolilo0iiil, z11);
                                i3 = z11;
/* 2205 */                      i2 = i3;
/* 1777 */                      z = false;
/* 1778 */                      c = 5;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case 43:
/* 2264 */                      boolean z12 = i12;
/* 2274 */                      OiOO0o1I0.I00IoiI(iArr[i9], (List) unsafe.getObject(obj, j), iiolilo0iiil, z12);
                                i3 = z12;
/* 2205 */                      i2 = i3;
/* 1777 */                      z = false;
/* 1778 */                      c = 5;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case 44:
/* 2250 */                      boolean z13 = i12;
/* 2260 */                      OiOO0o1I0.I001lllioOl(iArr[i9], (List) unsafe.getObject(obj, j), iiolilo0iiil, z13);
                                i3 = z13;
/* 2205 */                      i2 = i3;
/* 1777 */                      z = false;
/* 1778 */                      c = 5;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case BuildConfig.VERSION_CODE:
/* 2236 */                      boolean z14 = i12;
/* 2246 */                      OiOO0o1I0.I00IlilI0i0i(iArr[i9], (List) unsafe.getObject(obj, j), iiolilo0iiil, z14);
                                i3 = z14;
/* 2205 */                      i2 = i3;
/* 1777 */                      z = false;
/* 1778 */                      c = 5;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case 46:
/* 2222 */                      boolean z15 = i12;
/* 2232 */                      OiOO0o1I0.I00Io1lO(iArr[i9], (List) unsafe.getObject(obj, j), iiolilo0iiil, z15);
                                i3 = z15;
/* 2205 */                      i2 = i3;
/* 1777 */                      z = false;
/* 1778 */                      c = 5;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case 47:
/* 2208 */                      boolean z16 = i12;
/* 2218 */                      OiOO0o1I0.I00Io1o110i(iArr[i9], (List) unsafe.getObject(obj, j), iiolilo0iiil, z16);
                                i3 = z16;
/* 2205 */                      i2 = i3;
/* 1777 */                      z = false;
/* 1778 */                      c = 5;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case 48:
/* 2201 */                      i3 = 1;
/* 2202 */                      OiOO0o1I0.I00IoIO0lI(iArr[i9], (List) unsafe.getObject(obj, j), iiolilo0iiil, true);
/* 2205 */                      i2 = i3;
/* 1777 */                      z = false;
/* 1778 */                      c = 5;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case 49:
/* 2188 */                      OiOO0o1I0.I00IO1(iArr[i9], (List) unsafe.getObject(obj, j), iiolilo0iiil, I00100l0(i9));
/* 1865 */                      z = false;
/* 1866 */                      c = 5;
/* 1867 */                      i2 = 1;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case 50:
/* 2161 */                      if (unsafe.getObject(obj, j) != null) {
/* 2165 */                          Object objI000oI1ioi2 = I000oI1ioi(i9);
/* 2169 */                          o1Oi102.getClass();
/* 2172 */                          IIlIOloOOO.I001i1lo1io(objI000oI1ioi2);
/* 2175 */                          throw null;
                                }
/* 1865 */                      z = false;
/* 1866 */                      c = 5;
/* 1867 */                      i2 = 1;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case 51:
/* 2129 */                      if (I0010o(obj, i11, i9)) {
/* 2137 */                          double dDoubleValue2 = ((Double) Ooil11Oi.I000OiO(j, obj)).doubleValue();
/* 2141 */                          iOOOi1I1I1.getClass();
/* 2144 */                          long jDoubleToRawLongBits4 = Double.doubleToRawLongBits(dDoubleValue2);
/* 2149 */                          iOOOi1I1I1.I00100o1O0lo(i11, 1);
/* 2152 */                          iOOOi1I1I1.I000oI1ioi(jDoubleToRawLongBits4);
                                }
/* 1865 */                      z = false;
/* 1866 */                      c = 5;
/* 1867 */                      i2 = 1;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case 52:
/* 2097 */                      if (I0010o(obj, i11, i9)) {
/* 2105 */                          float fFloatValue2 = ((Float) Ooil11Oi.I000OiO(j, obj)).floatValue();
/* 2109 */                          iOOOi1I1I1.getClass();
/* 2112 */                          int iFloatToRawIntBits4 = Float.floatToRawIntBits(fFloatValue2);
/* 2117 */                          iOOOi1I1I1.I00100o1O0lo(i11, 5);
/* 2120 */                          iOOOi1I1I1.I000o00OoI0I(iFloatToRawIntBits4);
                                }
/* 1865 */                      z = false;
/* 1866 */                      c = 5;
/* 1867 */                      i2 = 1;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case 53:
/* 2074 */                      z = false;
/* 2079 */                      if (I0010o(obj, i11, i9)) {
/* 2081 */                          long jI001lllioOl6 = I001lllioOl(j, obj);
/* 2085 */                          iOOOi1I1I1.I00100o1O0lo(i11, 0);
/* 2088 */                          iOOOi1I1I1.I0010o(jI001lllioOl6);
/* 1865 */                          z = false;
                                }
/* 1866 */                      c = 5;
/* 1867 */                      i2 = 1;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case 54:
/* 2055 */                      z = false;
/* 2060 */                      if (I0010o(obj, i11, i9)) {
/* 2062 */                          long jI001lllioOl7 = I001lllioOl(j, obj);
/* 2066 */                          iOOOi1I1I1.I00100o1O0lo(i11, 0);
/* 2069 */                          iOOOi1I1I1.I0010o(jI001lllioOl7);
                                }
/* 1866 */                      c = 5;
/* 1867 */                      i2 = 1;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case 55:
/* 2040 */                      if (I0010o(obj, i11, i9)) {
/* 2042 */                          int iI001lIiIIo1O7 = I001lIiIIo1O(j, obj);
/* 2046 */                          z = false;
/* 2047 */                          iOOOi1I1I1.I00100o1O0lo(i11, 0);
/* 2050 */                          iOOOi1I1I1.I00100l0(iI001lIiIIo1O7);
                                }
/* 1866 */                      c = 5;
/* 1867 */                      i2 = 1;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                                break;
                            case 56:
/* 2021 */                      if (I0010o(obj, i11, i9)) {
/* 2023 */                          long jI001lllioOl8 = I001lllioOl(j, obj);
/* 2028 */                          iOOOi1I1I1.I00100o1O0lo(i11, 1);
/* 2031 */                          iOOOi1I1I1.I000oI1ioi(jI001lllioOl8);
                                }
/* 1865 */                      z = false;
/* 1866 */                      c = 5;
/* 1867 */                      i2 = 1;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case 57:
/* 2002 */                      if (I0010o(obj, i11, i9)) {
/* 2004 */                          int iI001lIiIIo1O8 = I001lIiIIo1O(j, obj);
/* 2009 */                          iOOOi1I1I1.I00100o1O0lo(i11, 5);
/* 2012 */                          iOOOi1I1I1.I000o00OoI0I(iI001lIiIIo1O8);
                                }
/* 1865 */                      z = false;
/* 1866 */                      c = 5;
/* 1867 */                      i2 = 1;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case 58:
/* 1976 */                      if (I0010o(obj, i11, i9)) {
/* 1984 */                          boolean zBooleanValue2 = ((Boolean) Ooil11Oi.I000OiO(j, obj)).booleanValue();
/* 1989 */                          iOOOi1I1I1.I00100o1O0lo(i11, 0);
/* 1993 */                          iOOOi1I1I1.I000l1(zBooleanValue2 ? (byte) 1 : (byte) 0);
                                }
/* 1865 */                      z = false;
/* 1866 */                      c = 5;
/* 1867 */                      i2 = 1;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case 59:
/* 1962 */                      if (I0010o(obj, i11, i9)) {
/* 1968 */                          I00O0o1oo(i11, unsafe.getObject(obj, j), iiolilo0iiil);
                                }
/* 1865 */                      z = false;
/* 1866 */                      c = 5;
/* 1867 */                      i2 = 1;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case 60:
/* 1944 */                      if (I0010o(obj, i11, i9)) {
/* 1954 */                          iiolilo0iiil.I00O0i0ii(i11, unsafe.getObject(obj, j), I00100l0(i9));
                                }
/* 1865 */                      z = false;
/* 1866 */                      c = 5;
/* 1867 */                      i2 = 1;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case 61:
/* 1928 */                      if (I0010o(obj, i11, i9)) {
/* 1936 */                          iiolilo0iiil.I00IoiI(i11, (IIOI1Ii1I) unsafe.getObject(obj, j));
                                }
/* 1865 */                      z = false;
/* 1866 */                      c = 5;
/* 1867 */                      i2 = 1;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case 62:
/* 1906 */                      z = false;
/* 1911 */                      if (I0010o(obj, i11, i9)) {
/* 1913 */                          int iI001lIiIIo1O9 = I001lIiIIo1O(j, obj);
/* 1917 */                          iOOOi1I1I1.I00100o1O0lo(i11, 0);
/* 1920 */                          iOOOi1I1I1.I0010I0i(iI001lIiIIo1O9);
/* 1865 */                          z = false;
                                }
/* 1866 */                      c = 5;
/* 1867 */                      i2 = 1;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case 63:
/* 1892 */                      if (I0010o(obj, i11, i9)) {
/* 1894 */                          int iI001lIiIIo1O10 = I001lIiIIo1O(j, obj);
/* 1898 */                          z = false;
/* 1899 */                          iOOOi1I1I1.I00100o1O0lo(i11, 0);
/* 1902 */                          iOOOi1I1I1.I00100l0(iI001lIiIIo1O10);
                                }
/* 1866 */                      c = 5;
/* 1867 */                      i2 = 1;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                                break;
                            case Barcode.FORMAT_EAN_8:
/* 1874 */                      if (I0010o(obj, i11, i9)) {
/* 1876 */                          int iI001lIiIIo1O11 = I001lIiIIo1O(j, obj);
/* 1881 */                          iOOOi1I1I1.I00100o1O0lo(i11, 5);
/* 1884 */                          iOOOi1I1I1.I000o00OoI0I(iI001lIiIIo1O11);
                                }
/* 1865 */                      z = false;
/* 1866 */                      c = 5;
/* 1867 */                      i2 = 1;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case 65:
/* 1851 */                      if (I0010o(obj, i11, i9)) {
/* 1853 */                          long jI001lllioOl9 = I001lllioOl(j, obj);
/* 1859 */                          iOOOi1I1I1.I00100o1O0lo(i11, i12);
/* 1862 */                          iOOOi1I1I1.I000oI1ioi(jI001lllioOl9);
                                }
/* 1865 */                      z = false;
/* 1866 */                      c = 5;
/* 1867 */                      i2 = 1;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case 66:
/* 1824 */                      z = false;
/* 1829 */                      if (I0010o(obj, i11, i9)) {
/* 1831 */                          int iI001lIiIIo1O12 = I001lIiIIo1O(j, obj);
/* 1840 */                          iOOOi1I1I1.I00100o1O0lo(i11, 0);
/* 1843 */                          iOOOi1I1I1.I0010I0i((iI001lIiIIo1O12 >> 31) ^ (iI001lIiIIo1O12 << 1));
/* 1775 */                          i2 = i12;
/* 1777 */                          z = false;
/* 1778 */                          c = 5;
/* 2963 */                          i9 += 3;
/* 2968 */                          i6 = i2;
/* 2969 */                          o1Oi10 = o1Oi102;
/* 2970 */                          ooiO0li2 = ooiO0li;
                                }
/* 1821 */                      i2 = i12;
/* 1778 */                      c = 5;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case 67:
/* 1803 */                      if (I0010o(obj, i11, i9)) {
/* 1805 */                          long jI001lllioOl10 = I001lllioOl(j, obj);
/* 1814 */                          z = false;
/* 1815 */                          iOOOi1I1I1.I00100o1O0lo(i11, 0);
/* 1818 */                          iOOOi1I1I1.I0010o((jI001lllioOl10 >> 63) ^ (jI001lllioOl10 << i12));
/* 1821 */                          i2 = i12;
/* 1778 */                          c = 5;
/* 2963 */                          i9 += 3;
/* 2968 */                          i6 = i2;
/* 2969 */                          o1Oi10 = o1Oi102;
/* 2970 */                          ooiO0li2 = ooiO0li;
                                }
/* 1775 */                      i2 = i12;
/* 1777 */                      z = false;
/* 1778 */                      c = 5;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            case 68:
/* 1785 */                      if (I0010o(obj, i11, i9)) {
/* 1795 */                          iiolilo0iiil.I00Iooi00oi(i11, unsafe.getObject(obj, j), I00100l0(i9));
                                }
/* 1775 */                      i2 = i12;
/* 1777 */                      z = false;
/* 1778 */                      c = 5;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                            default:
/* 1775 */                      i2 = i12;
/* 1777 */                      z = false;
/* 1778 */                      c = 5;
/* 2963 */                      i9 += 3;
/* 2968 */                      i6 = i2;
/* 2969 */                      o1Oi10 = o1Oi102;
/* 2970 */                      ooiO0li2 = ooiO0li;
                        }
                    }
/* 2976 */          ooiO0li2.getClass();
/* 2984 */          ((Io00Io0IO11) obj).unknownFields.I0000oI00(iiolilo0iiil);
                }

                /* JADX WARN: Removed duplicated region for block: B:42:0x00d7 A[PHI: r3
                  0x00d7: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x01f0, B:41:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int I000II(Io00Io0IO11 io00Io0IO11) {
                    int i;
                    int iI00000oOI;
                    int i2;
/* 1 */             int[] iArr = this.I00000oIO;
/* 3 */             int length = iArr.length;
/* 5 */             int i3 = 0;
/* 6 */             for (int i4 = 0; i4 < length; i4 += 3) {
/* 8 */                 int iI00O0i0ii = I00O0i0ii(i4);
/* 12 */                int i5 = iArr[i4];
/* 17 */                long j = 1048575 & iI00O0i0ii;
/* 23 */                int i6 = 1237;
/* 27 */                int iHashCode = 37;
                        switch (I00Iooi00oi(iI00O0i0ii)) {
                            case 0:
/* 567 */                       i = i3 * 53;
/* 579 */                       iI00000oOI = Iool1iOO11.I00000oOI(Double.doubleToLongBits(Ooil11Oi.I0000Il00O.I0000Il00O(j, io00Io0IO11)));
/* 50 */                        i3 = iI00000oOI + i;
                                break;
                            case 1:
/* 553 */                       i = i3 * 53;
/* 561 */                       iI00000oOI = Float.floatToIntBits(Ooil11Oi.I0000Il00O.I0000O(j, io00Io0IO11));
/* 50 */                        i3 = iI00000oOI + i;
                                break;
                            case 2:
/* 541 */                       i = i3 * 53;
/* 547 */                       iI00000oOI = Iool1iOO11.I00000oOI(Ooil11Oi.I000OOo1O(j, io00Io0IO11));
/* 50 */                        i3 = iI00000oOI + i;
                                break;
                            case 3:
/* 529 */                       i = i3 * 53;
/* 535 */                       iI00000oOI = Iool1iOO11.I00000oOI(Ooil11Oi.I000OOo1O(j, io00Io0IO11));
/* 50 */                        i3 = iI00000oOI + i;
                                break;
                            case 4:
/* 521 */                       i = i3 * 53;
/* 523 */                       iI00000oOI = Ooil11Oi.I000O01llI0(j, io00Io0IO11);
/* 50 */                        i3 = iI00000oOI + i;
                                break;
                            case 5:
/* 509 */                       i = i3 * 53;
/* 515 */                       iI00000oOI = Iool1iOO11.I00000oOI(Ooil11Oi.I000OOo1O(j, io00Io0IO11));
/* 50 */                        i3 = iI00000oOI + i;
                                break;
                            case 6:
/* 501 */                       i = i3 * 53;
/* 503 */                       iI00000oOI = Ooil11Oi.I000O01llI0(j, io00Io0IO11);
/* 50 */                        i3 = iI00000oOI + i;
                                break;
                            case 7:
/* 487 */                       i2 = i3 * 53;
/* 491 */                       boolean zI00000oIO = Ooil11Oi.I0000Il00O.I00000oIO(j, io00Io0IO11);
/* 495 */                       Charset charset = Iool1iOO11.I00000oIO;
/* 497 */                       if (zI00000oIO) {
/* 216 */                           i6 = 1231;
                                }
/* 217 */                       i3 = i6 + i2;
                                break;
                            case 8:
/* 473 */                       i = i3 * 53;
/* 481 */                       iI00000oOI = ((String) Ooil11Oi.I000OiO(j, io00Io0IO11)).hashCode();
/* 50 */                        i3 = iI00000oOI + i;
                                break;
                            case 9:
/* 462 */                       Object objI000OiO = Ooil11Oi.I000OiO(j, io00Io0IO11);
/* 466 */                       if (objI000OiO != null) {
/* 468 */                           iHashCode = objI000OiO.hashCode();
                                }
/* 391 */                       i3 = (i3 * 53) + iHashCode;
                                break;
                            case 10:
/* 450 */                       i = i3 * 53;
/* 456 */                       iI00000oOI = Ooil11Oi.I000OiO(j, io00Io0IO11).hashCode();
/* 50 */                        i3 = iI00000oOI + i;
                                break;
                            case 11:
/* 442 */                       i = i3 * 53;
/* 444 */                       iI00000oOI = Ooil11Oi.I000O01llI0(j, io00Io0IO11);
/* 50 */                        i3 = iI00000oOI + i;
                                break;
                            case 12:
/* 434 */                       i = i3 * 53;
/* 436 */                       iI00000oOI = Ooil11Oi.I000O01llI0(j, io00Io0IO11);
/* 50 */                        i3 = iI00000oOI + i;
                                break;
                            case 13:
/* 426 */                       i = i3 * 53;
/* 428 */                       iI00000oOI = Ooil11Oi.I000O01llI0(j, io00Io0IO11);
/* 50 */                        i3 = iI00000oOI + i;
                                break;
                            case 14:
/* 414 */                       i = i3 * 53;
/* 420 */                       iI00000oOI = Iool1iOO11.I00000oOI(Ooil11Oi.I000OOo1O(j, io00Io0IO11));
/* 50 */                        i3 = iI00000oOI + i;
                                break;
                            case 15:
/* 406 */                       i = i3 * 53;
/* 408 */                       iI00000oOI = Ooil11Oi.I000O01llI0(j, io00Io0IO11);
/* 50 */                        i3 = iI00000oOI + i;
                                break;
                            case 16:
/* 394 */                       i = i3 * 53;
/* 400 */                       iI00000oOI = Iool1iOO11.I00000oOI(Ooil11Oi.I000OOo1O(j, io00Io0IO11));
/* 50 */                        i3 = iI00000oOI + i;
                                break;
                            case 17:
/* 379 */                       Object objI000OiO2 = Ooil11Oi.I000OiO(j, io00Io0IO11);
/* 383 */                       if (objI000OiO2 != null) {
/* 385 */                           iHashCode = objI000OiO2.hashCode();
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
/* 373 */                       iI00000oOI = Ooil11Oi.I000OiO(j, io00Io0IO11).hashCode();
/* 50 */                        i3 = iI00000oOI + i;
                                break;
                            case 50:
/* 355 */                       i = i3 * 53;
/* 361 */                       iI00000oOI = Ooil11Oi.I000OiO(j, io00Io0IO11).hashCode();
/* 50 */                        i3 = iI00000oOI + i;
                                break;
                            case 51:
/* 331 */                       if (I0010o(io00Io0IO11, i5, i4)) {
/* 333 */                           i = i3 * 53;
/* 349 */                           iI00000oOI = Iool1iOO11.I00000oOI(Double.doubleToLongBits(((Double) Ooil11Oi.I000OiO(j, io00Io0IO11)).doubleValue()));
/* 50 */                            i3 = iI00000oOI + i;
                                    break;
                                } else {
                                    break;
                                }
                            case 52:
/* 307 */                       if (I0010o(io00Io0IO11, i5, i4)) {
/* 309 */                           i = i3 * 53;
/* 321 */                           iI00000oOI = Float.floatToIntBits(((Float) Ooil11Oi.I000OiO(j, io00Io0IO11)).floatValue());
/* 50 */                            i3 = iI00000oOI + i;
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
/* 289 */                       if (I0010o(io00Io0IO11, i5, i4)) {
/* 291 */                           i = i3 * 53;
/* 297 */                           iI00000oOI = Iool1iOO11.I00000oOI(I001lllioOl(j, io00Io0IO11));
/* 50 */                            i3 = iI00000oOI + i;
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
/* 271 */                       if (I0010o(io00Io0IO11, i5, i4)) {
/* 273 */                           i = i3 * 53;
/* 279 */                           iI00000oOI = Iool1iOO11.I00000oOI(I001lllioOl(j, io00Io0IO11));
/* 50 */                            i3 = iI00000oOI + i;
                                    break;
                                } else {
                                    break;
                                }
                            case 55:
/* 257 */                       if (I0010o(io00Io0IO11, i5, i4)) {
/* 259 */                           i = i3 * 53;
/* 261 */                           iI00000oOI = I001lIiIIo1O(j, io00Io0IO11);
/* 50 */                            i3 = iI00000oOI + i;
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
/* 239 */                       if (I0010o(io00Io0IO11, i5, i4)) {
/* 241 */                           i = i3 * 53;
/* 247 */                           iI00000oOI = Iool1iOO11.I00000oOI(I001lllioOl(j, io00Io0IO11));
/* 50 */                            i3 = iI00000oOI + i;
                                    break;
                                } else {
                                    break;
                                }
                            case 57:
/* 225 */                       if (I0010o(io00Io0IO11, i5, i4)) {
/* 227 */                           i = i3 * 53;
/* 229 */                           iI00000oOI = I001lIiIIo1O(j, io00Io0IO11);
/* 50 */                            i3 = iI00000oOI + i;
                                    break;
                                } else {
                                    break;
                                }
                            case 58:
/* 198 */                       if (I0010o(io00Io0IO11, i5, i4)) {
/* 200 */                           i2 = i3 * 53;
/* 208 */                           boolean zBooleanValue = ((Boolean) Ooil11Oi.I000OiO(j, io00Io0IO11)).booleanValue();
/* 212 */                           Charset charset2 = Iool1iOO11.I00000oIO;
/* 214 */                           if (zBooleanValue) {
                                    }
/* 217 */                           i3 = i6 + i2;
                                    break;
                                } else {
                                    break;
                                }
                                break;
                            case 59:
/* 178 */                       if (I0010o(io00Io0IO11, i5, i4)) {
/* 180 */                           i = i3 * 53;
/* 188 */                           iI00000oOI = ((String) Ooil11Oi.I000OiO(j, io00Io0IO11)).hashCode();
/* 50 */                            i3 = iI00000oOI + i;
                                    break;
                                } else {
                                    break;
                                }
                            case 60:
/* 161 */                       if (I0010o(io00Io0IO11, i5, i4)) {
/* 167 */                           i = i3 * 53;
/* 169 */                           iI00000oOI = Ooil11Oi.I000OiO(j, io00Io0IO11).hashCode();
/* 50 */                            i3 = iI00000oOI + i;
                                    break;
                                } else {
                                    break;
                                }
                            case 61:
/* 144 */                       if (I0010o(io00Io0IO11, i5, i4)) {
/* 146 */                           i = i3 * 53;
/* 152 */                           iI00000oOI = Ooil11Oi.I000OiO(j, io00Io0IO11).hashCode();
/* 50 */                            i3 = iI00000oOI + i;
                                    break;
                                } else {
                                    break;
                                }
                            case 62:
/* 131 */                       if (I0010o(io00Io0IO11, i5, i4)) {
/* 133 */                           i = i3 * 53;
/* 135 */                           iI00000oOI = I001lIiIIo1O(j, io00Io0IO11);
/* 50 */                            i3 = iI00000oOI + i;
                                    break;
                                } else {
                                    break;
                                }
                            case 63:
/* 118 */                       if (I0010o(io00Io0IO11, i5, i4)) {
/* 120 */                           i = i3 * 53;
/* 122 */                           iI00000oOI = I001lIiIIo1O(j, io00Io0IO11);
/* 50 */                            i3 = iI00000oOI + i;
                                    break;
                                } else {
                                    break;
                                }
                            case Barcode.FORMAT_EAN_8:
/* 105 */                       if (I0010o(io00Io0IO11, i5, i4)) {
/* 107 */                           i = i3 * 53;
/* 109 */                           iI00000oOI = I001lIiIIo1O(j, io00Io0IO11);
/* 50 */                            i3 = iI00000oOI + i;
                                    break;
                                } else {
                                    break;
                                }
                            case 65:
/* 88 */                        if (I0010o(io00Io0IO11, i5, i4)) {
/* 90 */                            i = i3 * 53;
/* 96 */                            iI00000oOI = Iool1iOO11.I00000oOI(I001lllioOl(j, io00Io0IO11));
/* 50 */                            i3 = iI00000oOI + i;
                                    break;
                                } else {
                                    break;
                                }
                            case 66:
/* 75 */                        if (I0010o(io00Io0IO11, i5, i4)) {
/* 77 */                            i = i3 * 53;
/* 79 */                            iI00000oOI = I001lIiIIo1O(j, io00Io0IO11);
/* 50 */                            i3 = iI00000oOI + i;
                                    break;
                                } else {
                                    break;
                                }
                            case 67:
/* 58 */                        if (I0010o(io00Io0IO11, i5, i4)) {
/* 60 */                            i = i3 * 53;
/* 66 */                            iI00000oOI = Iool1iOO11.I00000oOI(I001lllioOl(j, io00Io0IO11));
/* 50 */                            i3 = iI00000oOI + i;
                                    break;
                                } else {
                                    break;
                                }
                            case 68:
/* 38 */                        if (I0010o(io00Io0IO11, i5, i4)) {
/* 44 */                            i = i3 * 53;
/* 46 */                            iI00000oOI = Ooil11Oi.I000OiO(j, io00Io0IO11).hashCode();
/* 50 */                            i3 = iI00000oOI + i;
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
/* 593 */           this.I000lI.getClass();
/* 602 */           return io00Io0IO11.unknownFields.hashCode() + (i3 * 53);
                }

                /* JADX WARN: Removed duplicated region for block: B:154:0x06fc A[Catch: all -> 0x0446, TryCatch #4 {all -> 0x0446, blocks: (B:152:0x06f7, B:154:0x06fc, B:155:0x0701, B:108:0x0430, B:109:0x0439, B:112:0x0449, B:113:0x045b, B:114:0x046d, B:115:0x047f, B:116:0x0491, B:117:0x04a3, B:118:0x04b6, B:119:0x04c9, B:120:0x04dc, B:121:0x04f7, B:122:0x0515, B:123:0x0533, B:124:0x0550, B:125:0x056e, B:126:0x058f, B:127:0x05ad, B:128:0x05c3, B:129:0x05df, B:130:0x05ed, B:131:0x060d, B:132:0x062b, B:133:0x0648, B:134:0x0666, B:135:0x0684, B:136:0x06a2, B:137:0x06c2, B:143:0x06e0), top: B:176:0x06f7 }] */
                /* JADX WARN: Removed duplicated region for block: B:166:0x0723 A[LOOP:3: B:165:0x0721->B:166:0x0723, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:168:0x072d  */
                /* JADX WARN: Removed duplicated region for block: B:198:0x0707 A[SYNTHETIC] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I000O01llI0(Object obj, IOOOi1 iOOOi1, Il1llO11O il1llO11O) throws Throwable {
                    O1lIoI o1lIoI;
                    OoiO0li ooiO0li;
                    int[] iArr;
                    Il1llO11O il1llO11O2;
                    IOOOi1 iOOOi12;
                    IOOOi1 iOOOi13;
/* 1 */             O1lIoI o1lIoI2 = this;
/* 3 */             Object obj2 = obj;
/* 5 */             IOOOi1 iOOOi14 = iOOOi1;
/* 7 */             Il1llO11O il1llO11O3 = il1llO11O;
/* 9 */             il1llO11O3.getClass();
/* 12 */            I000l1(obj2);
/* 15 */            OoiO0li ooiO0li2 = o1lIoI2.I000lI;
/* 17 */            int[] iArr2 = o1lIoI2.I000O01llI0;
/* 19 */            int i = o1lIoI2.I000OiO;
/* 21 */            int i2 = o1lIoI2.I000OOo1O;
/* 23 */            O101ol1lilo0 o101ol1lilo0 = o1lIoI2.I000l1;
/* 25 */            OoiO0I1O1II ooiO0I1O1III00000oIO = null;
                    while (true) {
                        try {
/* 26 */                    int iI0000O = iOOOi14.I0000O();
/* 51 */                    int iI00IoIO0lI = (iI0000O < o1lIoI2.I0000Il00O || iI0000O > o1lIoI2.I0000O) ? -1 : o1lIoI2.I00IoIO0lI(iI0000O, 0);
/* 53 */                    if (iI00IoIO0lI >= 0) {
/* 112 */                       int iI00O0i0ii = o1lIoI2.I00O0i0ii(iI00IoIO0lI);
                                try {
                                } catch (O000illO unused) {
/* 1777 */                          ooiO0li = ooiO0li2;
/* 1778 */                          iArr = iArr2;
                                }
                                switch (I00Iooi00oi(iI00O0i0ii)) {
                                    case 0:
/* 1731 */                              ooiO0li = ooiO0li2;
/* 1732 */                              iArr = iArr2;
/* 1734 */                              iOOOi12 = iOOOi14;
/* 1735 */                              il1llO11O2 = il1llO11O3;
/* 1736 */                              o1lIoI = o1lIoI2;
/* 1737 */                              long jI001l0I00 = I001l0I00(iI00O0i0ii);
/* 1741 */                              iOOOi12.I00ilI0I1(1);
                                        try {
                                            try {
/* 1757 */                                      Ooil11Oi.I0000Il00O.I000II(obj, jI001l0I00, ((IOOOI0) iOOOi12.I0000oI00).I00100o1O0lo());
/* 1760 */                                      obj2 = obj;
/* 1761 */                                      o1lIoI.I00Io1lO(iI00IoIO0lI, obj2);
                                            } catch (O000illO unused2) {
/* 1768 */                                      obj2 = obj;
                                                try {
/* 1784 */                                          ooiO0li.getClass();
/* 1787 */                                          if (ooiO0I1O1III00000oIO == null) {
                                                    }
/* 1798 */                                          if (!OoiO0li.I00000oOI(ooiO0I1O1III00000oIO, iOOOi12)) {
                                                    }
/* 1815 */                                          o1lIoI2 = o1lIoI;
/* 1816 */                                          iOOOi14 = iOOOi12;
/* 1817 */                                          il1llO11O3 = il1llO11O2;
/* 1818 */                                          ooiO0li2 = ooiO0li;
/* 1819 */                                          iArr2 = iArr;
                                                } catch (Throwable th) {
/* 1095 */                                          th = th;
/* 1826 */                                          while (i2 < i) {
                                                    }
/* 1836 */                                          if (ooiO0I1O1III00000oIO != null) {
                                                    }
/* 1846 */                                          throw th;
                                                }
                                            } catch (Throwable th2) {
/* 1765 */                                      th = th2;
/* 1766 */                                      obj2 = obj;
/* 1826 */                                      while (i2 < i) {
                                                }
/* 1836 */                                      if (ooiO0I1O1III00000oIO != null) {
                                                }
/* 1846 */                                      throw th;
                                            }
                                        } catch (O000illO unused3) {
/* 1774 */                                  obj2 = obj;
                                        } catch (Throwable th3) {
/* 1770 */                                  th = th3;
/* 1771 */                                  obj2 = obj;
                                        }
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                        break;
                                    case 1:
/* 1699 */                              ooiO0li = ooiO0li2;
/* 1700 */                              iArr = iArr2;
/* 1702 */                              iOOOi12 = iOOOi14;
/* 1703 */                              il1llO11O2 = il1llO11O3;
/* 1704 */                              o1lIoI = o1lIoI2;
/* 1705 */                              long jI001l0I002 = I001l0I00(iI00O0i0ii);
/* 1710 */                              iOOOi12.I00ilI0I1(5);
/* 1723 */                              Ooil11Oi.I0000Il00O.I000O01llI0(obj2, jI001l0I002, ((IOOOI0) iOOOi12.I0000oI00).I001IIilI0O());
/* 1726 */                              o1lIoI.I00Io1lO(iI00IoIO0lI, obj2);
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case 2:
/* 1669 */                              ooiO0li = ooiO0li2;
/* 1670 */                              iArr = iArr2;
/* 1672 */                              iOOOi12 = iOOOi14;
/* 1673 */                              il1llO11O2 = il1llO11O3;
/* 1674 */                              o1lIoI = o1lIoI2;
/* 1675 */                              long jI001l0I003 = I001l0I00(iI00O0i0ii);
/* 1680 */                              iOOOi12.I00ilI0I1(0);
/* 1691 */                              Ooil11Oi.I00100l0(obj2, jI001l0I003, ((IOOOI0) iOOOi12.I0000oI00).I001i1O0Ol());
/* 1694 */                              o1lIoI.I00Io1lO(iI00IoIO0lI, obj2);
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case 3:
/* 1639 */                              ooiO0li = ooiO0li2;
/* 1640 */                              iArr = iArr2;
/* 1642 */                              iOOOi12 = iOOOi14;
/* 1643 */                              il1llO11O2 = il1llO11O3;
/* 1644 */                              o1lIoI = o1lIoI2;
/* 1645 */                              long jI001l0I004 = I001l0I00(iI00O0i0ii);
/* 1650 */                              iOOOi12.I00ilI0I1(0);
/* 1661 */                              Ooil11Oi.I00100l0(obj2, jI001l0I004, ((IOOOI0) iOOOi12.I0000oI00).I00IO1());
/* 1664 */                              o1lIoI.I00Io1lO(iI00IoIO0lI, obj2);
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case 4:
/* 1609 */                              ooiO0li = ooiO0li2;
/* 1610 */                              iArr = iArr2;
/* 1612 */                              iOOOi12 = iOOOi14;
/* 1613 */                              il1llO11O2 = il1llO11O3;
/* 1614 */                              o1lIoI = o1lIoI2;
/* 1615 */                              long jI001l0I005 = I001l0I00(iI00O0i0ii);
/* 1620 */                              iOOOi12.I00ilI0I1(0);
/* 1631 */                              Ooil11Oi.I000oI1ioi(obj2, ((IOOOI0) iOOOi12.I0000oI00).I001IO000(), jI001l0I005);
/* 1634 */                              o1lIoI.I00Io1lO(iI00IoIO0lI, obj2);
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case 5:
/* 1580 */                              ooiO0li = ooiO0li2;
/* 1581 */                              iArr = iArr2;
/* 1583 */                              iOOOi12 = iOOOi14;
/* 1584 */                              il1llO11O2 = il1llO11O3;
/* 1585 */                              o1lIoI = o1lIoI2;
/* 1586 */                              long jI001l0I006 = I001l0I00(iI00O0i0ii);
/* 1590 */                              iOOOi12.I00ilI0I1(1);
/* 1601 */                              Ooil11Oi.I00100l0(obj2, jI001l0I006, ((IOOOI0) iOOOi12.I0000oI00).I00111O());
/* 1604 */                              o1lIoI.I00Io1lO(iI00IoIO0lI, obj2);
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case 6:
/* 1550 */                              ooiO0li = ooiO0li2;
/* 1551 */                              iArr = iArr2;
/* 1553 */                              iOOOi12 = iOOOi14;
/* 1554 */                              il1llO11O2 = il1llO11O3;
/* 1555 */                              o1lIoI = o1lIoI2;
/* 1556 */                              long jI001l0I007 = I001l0I00(iI00O0i0ii);
/* 1561 */                              iOOOi12.I00ilI0I1(5);
/* 1572 */                              Ooil11Oi.I000oI1ioi(obj2, ((IOOOI0) iOOOi12.I0000oI00).I0010o(), jI001l0I007);
/* 1575 */                              o1lIoI.I00Io1lO(iI00IoIO0lI, obj2);
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case 7:
/* 1518 */                              ooiO0li = ooiO0li2;
/* 1519 */                              iArr = iArr2;
/* 1521 */                              iOOOi12 = iOOOi14;
/* 1522 */                              il1llO11O2 = il1llO11O3;
/* 1523 */                              o1lIoI = o1lIoI2;
/* 1524 */                              long jI001l0I008 = I001l0I00(iI00O0i0ii);
/* 1529 */                              iOOOi12.I00ilI0I1(0);
/* 1542 */                              Ooil11Oi.I0000Il00O.I0000oI00(obj2, jI001l0I008, ((IOOOI0) iOOOi12.I0000oI00).I000o00OoI0I());
/* 1545 */                              o1lIoI.I00Io1lO(iI00IoIO0lI, obj2);
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case 8:
/* 1504 */                              ooiO0li = ooiO0li2;
/* 1505 */                              iArr = iArr2;
/* 1507 */                              iOOOi12 = iOOOi14;
/* 1508 */                              il1llO11O2 = il1llO11O3;
/* 1509 */                              o1lIoI = o1lIoI2;
/* 1510 */                              o1lIoI.I00IioO0OiOi(iI00O0i0ii, iOOOi12, obj2);
/* 1513 */                              o1lIoI.I00Io1lO(iI00IoIO0lI, obj2);
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case 9:
/* 1476 */                              ooiO0li = ooiO0li2;
/* 1477 */                              iArr = iArr2;
/* 1479 */                              iOOOi12 = iOOOi14;
/* 1480 */                              il1llO11O2 = il1llO11O3;
/* 1481 */                              o1lIoI = o1lIoI2;
/* 1486 */                              I01Iio10lo i01Iio10lo = (I01Iio10lo) o1lIoI.I001i1O0Ol(iI00IoIO0lI, obj2);
/* 1488 */                              OiOIiIO0 oiOIiIO0I00100l0 = o1lIoI.I00100l0(iI00IoIO0lI);
/* 1493 */                              iOOOi12.I00ilI0I1(2);
/* 1496 */                              iOOOi12.I000OiO(i01Iio10lo, oiOIiIO0I00100l0, il1llO11O2);
/* 1499 */                              o1lIoI.I00IoO0(iI00IoIO0lI, obj2, i01Iio10lo);
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case 10:
/* 1454 */                              ooiO0li = ooiO0li2;
/* 1455 */                              iArr = iArr2;
/* 1457 */                              iOOOi12 = iOOOi14;
/* 1458 */                              il1llO11O2 = il1llO11O3;
/* 1459 */                              o1lIoI = o1lIoI2;
/* 1468 */                              Ooil11Oi.I00100o1O0lo(obj2, I001l0I00(iI00O0i0ii), iOOOi12.I0010I0i());
/* 1471 */                              o1lIoI.I00Io1lO(iI00IoIO0lI, obj2);
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case 11:
/* 1424 */                              ooiO0li = ooiO0li2;
/* 1425 */                              iArr = iArr2;
/* 1427 */                              iOOOi12 = iOOOi14;
/* 1428 */                              il1llO11O2 = il1llO11O3;
/* 1429 */                              o1lIoI = o1lIoI2;
/* 1430 */                              long jI001l0I009 = I001l0I00(iI00O0i0ii);
/* 1435 */                              iOOOi12.I00ilI0I1(0);
/* 1446 */                              Ooil11Oi.I000oI1ioi(obj2, ((IOOOI0) iOOOi12.I0000oI00).I00II0oii1o(), jI001l0I009);
/* 1449 */                              o1lIoI.I00Io1lO(iI00IoIO0lI, obj2);
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case 12:
/* 1391 */                              ooiO0li = ooiO0li2;
/* 1392 */                              iArr = iArr2;
/* 1395 */                              iOOOi12 = iOOOi14;
/* 1396 */                              il1llO11O2 = il1llO11O3;
/* 1397 */                              o1lIoI = o1lIoI2;
/* 1398 */                              iOOOi12.I00ilI0I1(0);
/* 1405 */                              int iI0010I0i = ((IOOOI0) iOOOi12.I0000oI00).I0010I0i();
/* 1409 */                              o1lIoI.I000o00OoI0I(iI00IoIO0lI);
/* 1416 */                              Ooil11Oi.I000oI1ioi(obj2, iI0010I0i, I001l0I00(iI00O0i0ii));
/* 1419 */                              o1lIoI.I00Io1lO(iI00IoIO0lI, obj2);
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case 13:
/* 1361 */                              ooiO0li = ooiO0li2;
/* 1362 */                              iArr = iArr2;
/* 1364 */                              iOOOi12 = iOOOi14;
/* 1365 */                              il1llO11O2 = il1llO11O3;
/* 1366 */                              o1lIoI = o1lIoI2;
/* 1367 */                              long jI001l0I0010 = I001l0I00(iI00O0i0ii);
/* 1372 */                              iOOOi12.I00ilI0I1(5);
/* 1383 */                              Ooil11Oi.I000oI1ioi(obj2, ((IOOOI0) iOOOi12.I0000oI00).I001i1lo1io(), jI001l0I0010);
/* 1386 */                              o1lIoI.I00Io1lO(iI00IoIO0lI, obj2);
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case 14:
/* 1332 */                              ooiO0li = ooiO0li2;
/* 1333 */                              iArr = iArr2;
/* 1335 */                              iOOOi12 = iOOOi14;
/* 1336 */                              il1llO11O2 = il1llO11O3;
/* 1337 */                              o1lIoI = o1lIoI2;
/* 1338 */                              long jI001l0I0011 = I001l0I00(iI00O0i0ii);
/* 1342 */                              iOOOi12.I00ilI0I1(1);
/* 1353 */                              Ooil11Oi.I00100l0(obj2, jI001l0I0011, ((IOOOI0) iOOOi12.I0000oI00).I001iOo1i0O());
/* 1356 */                              o1lIoI.I00Io1lO(iI00IoIO0lI, obj2);
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case 15:
/* 1302 */                              ooiO0li = ooiO0li2;
/* 1303 */                              iArr = iArr2;
/* 1305 */                              iOOOi12 = iOOOi14;
/* 1306 */                              il1llO11O2 = il1llO11O3;
/* 1307 */                              o1lIoI = o1lIoI2;
/* 1308 */                              long jI001l0I0012 = I001l0I00(iI00O0i0ii);
/* 1313 */                              iOOOi12.I00ilI0I1(0);
/* 1324 */                              Ooil11Oi.I000oI1ioi(obj2, ((IOOOI0) iOOOi12.I0000oI00).I001l0I00(), jI001l0I0012);
/* 1327 */                              o1lIoI.I00Io1lO(iI00IoIO0lI, obj2);
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case 16:
/* 1272 */                              ooiO0li = ooiO0li2;
/* 1273 */                              iArr = iArr2;
/* 1275 */                              iOOOi12 = iOOOi14;
/* 1276 */                              il1llO11O2 = il1llO11O3;
/* 1277 */                              o1lIoI = o1lIoI2;
/* 1278 */                              long jI001l0I0013 = I001l0I00(iI00O0i0ii);
/* 1283 */                              iOOOi12.I00ilI0I1(0);
/* 1294 */                              Ooil11Oi.I00100l0(obj2, jI001l0I0013, ((IOOOI0) iOOOi12.I0000oI00).I001lIiIIo1O());
/* 1297 */                              o1lIoI.I00Io1lO(iI00IoIO0lI, obj2);
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case 17:
/* 1245 */                              ooiO0li = ooiO0li2;
/* 1246 */                              iArr = iArr2;
/* 1248 */                              iOOOi12 = iOOOi14;
/* 1249 */                              il1llO11O2 = il1llO11O3;
/* 1250 */                              o1lIoI = o1lIoI2;
/* 1255 */                              I01Iio10lo i01Iio10lo2 = (I01Iio10lo) o1lIoI.I001i1O0Ol(iI00IoIO0lI, obj2);
/* 1257 */                              OiOIiIO0 oiOIiIO0I00100l02 = o1lIoI.I00100l0(iI00IoIO0lI);
/* 1261 */                              iOOOi12.I00ilI0I1(3);
/* 1264 */                              iOOOi12.I000II(i01Iio10lo2, oiOIiIO0I00100l02, il1llO11O2);
/* 1267 */                              o1lIoI.I00IoO0(iI00IoIO0lI, obj2, i01Iio10lo2);
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case PoseLandmark.RIGHT_PINKY:
/* 1226 */                              ooiO0li = ooiO0li2;
/* 1227 */                              iArr = iArr2;
/* 1229 */                              iOOOi12 = iOOOi14;
/* 1230 */                              il1llO11O2 = il1llO11O3;
/* 1231 */                              o1lIoI = o1lIoI2;
/* 1240 */                              iOOOi12.I001i1lo1io(o101ol1lilo0.I0000Il00O(I001l0I00(iI00O0i0ii), obj2));
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case PoseLandmark.LEFT_INDEX:
/* 1207 */                              ooiO0li = ooiO0li2;
/* 1208 */                              iArr = iArr2;
/* 1210 */                              iOOOi12 = iOOOi14;
/* 1211 */                              il1llO11O2 = il1llO11O3;
/* 1212 */                              o1lIoI = o1lIoI2;
/* 1221 */                              iOOOi12.I00Io1o110i(o101ol1lilo0.I0000Il00O(I001l0I00(iI00O0i0ii), obj2));
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case PoseLandmark.RIGHT_INDEX:
/* 1188 */                              ooiO0li = ooiO0li2;
/* 1189 */                              iArr = iArr2;
/* 1191 */                              iOOOi12 = iOOOi14;
/* 1192 */                              il1llO11O2 = il1llO11O3;
/* 1193 */                              o1lIoI = o1lIoI2;
/* 1202 */                              iOOOi12.I00O0o1oo(o101ol1lilo0.I0000Il00O(I001l0I00(iI00O0i0ii), obj2));
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case PoseLandmark.LEFT_THUMB:
/* 1170 */                              ooiO0li = ooiO0li2;
/* 1171 */                              iArr = iArr2;
/* 1173 */                              iOOOi12 = iOOOi14;
/* 1174 */                              il1llO11O2 = il1llO11O3;
/* 1175 */                              o1lIoI = o1lIoI2;
/* 1183 */                              iOOOi12.I00iiO(o101ol1lilo0.I0000Il00O(iI00O0i0ii & 1048575, obj2));
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case PoseLandmark.RIGHT_THUMB:
/* 1152 */                              ooiO0li = ooiO0li2;
/* 1153 */                              iArr = iArr2;
/* 1155 */                              iOOOi12 = iOOOi14;
/* 1156 */                              il1llO11O2 = il1llO11O3;
/* 1157 */                              o1lIoI = o1lIoI2;
/* 1165 */                              iOOOi12.I00IoiI(o101ol1lilo0.I0000Il00O(iI00O0i0ii & 1048575, obj2));
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case PoseLandmark.LEFT_HIP:
/* 1134 */                              ooiO0li = ooiO0li2;
/* 1135 */                              iArr = iArr2;
/* 1137 */                              iOOOi12 = iOOOi14;
/* 1138 */                              il1llO11O2 = il1llO11O3;
/* 1139 */                              o1lIoI = o1lIoI2;
/* 1147 */                              iOOOi12.I00IioO0OiOi(o101ol1lilo0.I0000Il00O(iI00O0i0ii & 1048575, obj2));
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case PoseLandmark.RIGHT_HIP:
/* 1116 */                              ooiO0li = ooiO0li2;
/* 1117 */                              iArr = iArr2;
/* 1119 */                              iOOOi12 = iOOOi14;
/* 1120 */                              il1llO11O2 = il1llO11O3;
/* 1121 */                              o1lIoI = o1lIoI2;
/* 1129 */                              iOOOi12.I00IO1(o101ol1lilo0.I0000Il00O(iI00O0i0ii & 1048575, obj2));
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case PoseLandmark.LEFT_KNEE:
/* 1098 */                              ooiO0li = ooiO0li2;
/* 1099 */                              iArr = iArr2;
/* 1101 */                              iOOOi12 = iOOOi14;
/* 1102 */                              il1llO11O2 = il1llO11O3;
/* 1103 */                              o1lIoI = o1lIoI2;
/* 1111 */                              iOOOi12.I000oI1ioi(o101ol1lilo0.I0000Il00O(iI00O0i0ii & 1048575, obj2));
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case PoseLandmark.RIGHT_KNEE:
/* 1054 */                              ooiO0li = ooiO0li2;
/* 1055 */                              iArr = iArr2;
/* 1057 */                              iOOOi12 = iOOOi14;
/* 1058 */                              il1llO11O2 = il1llO11O3;
/* 1059 */                              o1lIoI = o1lIoI2;
/* 1068 */                              if ((536870912 & iI00O0i0ii) != 0) {
                                            try {
/* 1077 */                                      iOOOi12.I00i0ilIl0i(o101ol1lilo0.I0000Il00O(iI00O0i0ii & 1048575, obj2), true);
                                            } catch (O000illO unused4) {
/* 1784 */                                      ooiO0li.getClass();
/* 1787 */                                      if (ooiO0I1O1III00000oIO == null) {
                                                }
/* 1798 */                                      if (!OoiO0li.I00000oOI(ooiO0I1O1III00000oIO, iOOOi12)) {
                                                }
/* 1815 */                                      o1lIoI2 = o1lIoI;
/* 1816 */                                      iOOOi14 = iOOOi12;
/* 1817 */                                      il1llO11O3 = il1llO11O2;
/* 1818 */                                      ooiO0li2 = ooiO0li;
/* 1819 */                                      iArr2 = iArr;
                                            }
                                        } else {
/* 1090 */                                  iOOOi12.I00i0ilIl0i(o101ol1lilo0.I0000Il00O(iI00O0i0ii & 1048575, obj2), false);
                                        }
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                        break;
                                    case 27:
/* 1037 */                              ooiO0li = ooiO0li2;
/* 1038 */                              iArr = iArr2;
/* 1046 */                              o1lIoI2.I00IOO(obj2, iI00O0i0ii, iOOOi14, o1lIoI2.I00100l0(iI00IoIO0lI), il1llO11O);
/* 1049 */                              iOOOi12 = iOOOi14;
/* 1050 */                              il1llO11O2 = il1llO11O;
/* 1051 */                              o1lIoI = o1lIoI2;
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case PoseLandmark.RIGHT_ANKLE:
/* 1022 */                              ooiO0li = ooiO0li2;
/* 1023 */                              iArr = iArr2;
/* 1032 */                              iOOOi14.I001IIilI0O(o101ol1lilo0.I0000Il00O(iI00O0i0ii & 1048575, obj2));
/* 701 */                               il1llO11O2 = il1llO11O;
/* 703 */                               o1lIoI = o1lIoI2;
/* 704 */                               iOOOi12 = iOOOi14;
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case PoseLandmark.LEFT_HEEL:
/* 1007 */                              ooiO0li = ooiO0li2;
/* 1008 */                              iArr = iArr2;
/* 1017 */                              iOOOi14.I00iIi0i1o(o101ol1lilo0.I0000Il00O(iI00O0i0ii & 1048575, obj2));
/* 701 */                               il1llO11O2 = il1llO11O;
/* 703 */                               o1lIoI = o1lIoI2;
/* 704 */                               iOOOi12 = iOOOi14;
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case 30:
/* 987 */                               ooiO0li = ooiO0li2;
/* 988 */                               iArr = iArr2;
/* 997 */                               iOOOi14.I001lIiIIo1O(o101ol1lilo0.I0000Il00O(iI00O0i0ii & 1048575, obj2));
/* 1000 */                              o1lIoI2.I000o00OoI0I(iI00IoIO0lI);
/* 1003 */                              Class cls = OiOO0o1I0.I00000oIO;
/* 701 */                               il1llO11O2 = il1llO11O;
/* 703 */                               o1lIoI = o1lIoI2;
/* 704 */                               iOOOi12 = iOOOi14;
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case PoseLandmark.LEFT_FOOT_INDEX:
/* 972 */                               ooiO0li = ooiO0li2;
/* 973 */                               iArr = iArr2;
/* 982 */                               iOOOi14.I00OIO1(o101ol1lilo0.I0000Il00O(iI00O0i0ii & 1048575, obj2));
/* 701 */                               il1llO11O2 = il1llO11O;
/* 703 */                               o1lIoI = o1lIoI2;
/* 704 */                               iOOOi12 = iOOOi14;
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case 32:
/* 957 */                               ooiO0li = ooiO0li2;
/* 958 */                               iArr = iArr2;
/* 967 */                               iOOOi14.I00OOll1(o101ol1lilo0.I0000Il00O(iI00O0i0ii & 1048575, obj2));
/* 701 */                               il1llO11O2 = il1llO11O;
/* 703 */                               o1lIoI = o1lIoI2;
/* 704 */                               iOOOi12 = iOOOi14;
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case 33:
/* 942 */                               ooiO0li = ooiO0li2;
/* 943 */                               iArr = iArr2;
/* 952 */                               iOOOi14.I00Ol00(o101ol1lilo0.I0000Il00O(iI00O0i0ii & 1048575, obj2));
/* 701 */                               il1llO11O2 = il1llO11O;
/* 703 */                               o1lIoI = o1lIoI2;
/* 704 */                               iOOOi12 = iOOOi14;
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case 34:
/* 927 */                               ooiO0li = ooiO0li2;
/* 928 */                               iArr = iArr2;
/* 937 */                               iOOOi14.I00OloOo(o101ol1lilo0.I0000Il00O(iI00O0i0ii & 1048575, obj2));
/* 701 */                               il1llO11O2 = il1llO11O;
/* 703 */                               o1lIoI = o1lIoI2;
/* 704 */                               iOOOi12 = iOOOi14;
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case InputImage.IMAGE_FORMAT_YUV_420_888:
/* 912 */                               ooiO0li = ooiO0li2;
/* 913 */                               iArr = iArr2;
/* 922 */                               iOOOi14.I001i1lo1io(o101ol1lilo0.I0000Il00O(iI00O0i0ii & 1048575, obj2));
/* 701 */                               il1llO11O2 = il1llO11O;
/* 703 */                               o1lIoI = o1lIoI2;
/* 704 */                               iOOOi12 = iOOOi14;
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case 36:
/* 897 */                               ooiO0li = ooiO0li2;
/* 898 */                               iArr = iArr2;
/* 907 */                               iOOOi14.I00Io1o110i(o101ol1lilo0.I0000Il00O(iI00O0i0ii & 1048575, obj2));
/* 701 */                               il1llO11O2 = il1llO11O;
/* 703 */                               o1lIoI = o1lIoI2;
/* 704 */                               iOOOi12 = iOOOi14;
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case 37:
/* 882 */                               ooiO0li = ooiO0li2;
/* 883 */                               iArr = iArr2;
/* 892 */                               iOOOi14.I00O0o1oo(o101ol1lilo0.I0000Il00O(iI00O0i0ii & 1048575, obj2));
/* 701 */                               il1llO11O2 = il1llO11O;
/* 703 */                               o1lIoI = o1lIoI2;
/* 704 */                               iOOOi12 = iOOOi14;
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case 38:
/* 867 */                               ooiO0li = ooiO0li2;
/* 868 */                               iArr = iArr2;
/* 877 */                               iOOOi14.I00iiO(o101ol1lilo0.I0000Il00O(iI00O0i0ii & 1048575, obj2));
/* 701 */                               il1llO11O2 = il1llO11O;
/* 703 */                               o1lIoI = o1lIoI2;
/* 704 */                               iOOOi12 = iOOOi14;
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case 39:
/* 852 */                               ooiO0li = ooiO0li2;
/* 853 */                               iArr = iArr2;
/* 862 */                               iOOOi14.I00IoiI(o101ol1lilo0.I0000Il00O(iI00O0i0ii & 1048575, obj2));
/* 701 */                               il1llO11O2 = il1llO11O;
/* 703 */                               o1lIoI = o1lIoI2;
/* 704 */                               iOOOi12 = iOOOi14;
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case 40:
/* 837 */                               ooiO0li = ooiO0li2;
/* 838 */                               iArr = iArr2;
/* 847 */                               iOOOi14.I00IioO0OiOi(o101ol1lilo0.I0000Il00O(iI00O0i0ii & 1048575, obj2));
/* 701 */                               il1llO11O2 = il1llO11O;
/* 703 */                               o1lIoI = o1lIoI2;
/* 704 */                               iOOOi12 = iOOOi14;
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case 41:
/* 822 */                               ooiO0li = ooiO0li2;
/* 823 */                               iArr = iArr2;
/* 832 */                               iOOOi14.I00IO1(o101ol1lilo0.I0000Il00O(iI00O0i0ii & 1048575, obj2));
/* 701 */                               il1llO11O2 = il1llO11O;
/* 703 */                               o1lIoI = o1lIoI2;
/* 704 */                               iOOOi12 = iOOOi14;
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case 42:
/* 808 */                               ooiO0li = ooiO0li2;
/* 809 */                               iArr = iArr2;
/* 818 */                               iOOOi14.I000oI1ioi(o101ol1lilo0.I0000Il00O(iI00O0i0ii & 1048575, obj2));
/* 701 */                               il1llO11O2 = il1llO11O;
/* 703 */                               o1lIoI = o1lIoI2;
/* 704 */                               iOOOi12 = iOOOi14;
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case 43:
/* 794 */                               ooiO0li = ooiO0li2;
/* 795 */                               iArr = iArr2;
/* 804 */                               iOOOi14.I00iIi0i1o(o101ol1lilo0.I0000Il00O(iI00O0i0ii & 1048575, obj2));
/* 701 */                               il1llO11O2 = il1llO11O;
/* 703 */                               o1lIoI = o1lIoI2;
/* 704 */                               iOOOi12 = iOOOi14;
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case 44:
/* 775 */                               ooiO0li = ooiO0li2;
/* 776 */                               iArr = iArr2;
/* 785 */                               iOOOi14.I001lIiIIo1O(o101ol1lilo0.I0000Il00O(iI00O0i0ii & 1048575, obj2));
/* 788 */                               o1lIoI2.I000o00OoI0I(iI00IoIO0lI);
/* 791 */                               Class cls2 = OiOO0o1I0.I00000oIO;
/* 701 */                               il1llO11O2 = il1llO11O;
/* 703 */                               o1lIoI = o1lIoI2;
/* 704 */                               iOOOi12 = iOOOi14;
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case BuildConfig.VERSION_CODE:
/* 761 */                               ooiO0li = ooiO0li2;
/* 762 */                               iArr = iArr2;
/* 771 */                               iOOOi14.I00OIO1(o101ol1lilo0.I0000Il00O(iI00O0i0ii & 1048575, obj2));
/* 701 */                               il1llO11O2 = il1llO11O;
/* 703 */                               o1lIoI = o1lIoI2;
/* 704 */                               iOOOi12 = iOOOi14;
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case 46:
/* 747 */                               ooiO0li = ooiO0li2;
/* 748 */                               iArr = iArr2;
/* 757 */                               iOOOi14.I00OOll1(o101ol1lilo0.I0000Il00O(iI00O0i0ii & 1048575, obj2));
/* 701 */                               il1llO11O2 = il1llO11O;
/* 703 */                               o1lIoI = o1lIoI2;
/* 704 */                               iOOOi12 = iOOOi14;
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case 47:
/* 733 */                               ooiO0li = ooiO0li2;
/* 734 */                               iArr = iArr2;
/* 743 */                               iOOOi14.I00Ol00(o101ol1lilo0.I0000Il00O(iI00O0i0ii & 1048575, obj2));
/* 701 */                               il1llO11O2 = il1llO11O;
/* 703 */                               o1lIoI = o1lIoI2;
/* 704 */                               iOOOi12 = iOOOi14;
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case 48:
/* 719 */                               ooiO0li = ooiO0li2;
/* 720 */                               iArr = iArr2;
/* 729 */                               iOOOi14.I00OloOo(o101ol1lilo0.I0000Il00O(iI00O0i0ii & 1048575, obj2));
/* 701 */                               il1llO11O2 = il1llO11O;
/* 703 */                               o1lIoI = o1lIoI2;
/* 704 */                               iOOOi12 = iOOOi14;
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case 49:
/* 683 */                               ooiO0li = ooiO0li2;
/* 684 */                               iArr = iArr2;
                                        try {
/* 695 */                                   iOOOi13 = iOOOi14;
                                        } catch (O000illO unused5) {
/* 713 */                                   il1llO11O2 = il1llO11O;
/* 715 */                                   o1lIoI = o1lIoI2;
/* 716 */                                   iOOOi12 = iOOOi14;
                                        }
                                        try {
/* 697 */                                   o1lIoI2.I00IO1oi11O(obj2, iI00O0i0ii & 1048575, iOOOi13, o1lIoI2.I00100l0(iI00IoIO0lI), il1llO11O);
/* 700 */                                   iOOOi14 = iOOOi13;
/* 701 */                                   il1llO11O2 = il1llO11O;
/* 703 */                                   o1lIoI = o1lIoI2;
/* 704 */                                   iOOOi12 = iOOOi14;
                                        } catch (O000illO unused6) {
/* 707 */                                   il1llO11O2 = il1llO11O;
/* 709 */                                   o1lIoI = o1lIoI2;
/* 710 */                                   iOOOi12 = iOOOi13;
/* 1784 */                                  ooiO0li.getClass();
/* 1787 */                                  if (ooiO0I1O1III00000oIO == null) {
                                            }
/* 1798 */                                  if (!OoiO0li.I00000oOI(ooiO0I1O1III00000oIO, iOOOi12)) {
                                            }
/* 1815 */                                  o1lIoI2 = o1lIoI;
/* 1816 */                                  iOOOi14 = iOOOi12;
/* 1817 */                                  il1llO11O3 = il1llO11O2;
/* 1818 */                                  ooiO0li2 = ooiO0li;
/* 1819 */                                  iArr2 = iArr;
                                        }
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                        break;
                                    case 50:
/* 672 */                               ooiO0li = ooiO0li2;
/* 673 */                               iArr = iArr2;
/* 679 */                               o1lIoI2.I00111O(iI00IoIO0lI, obj2, o1lIoI2.I000oI1ioi(iI00IoIO0lI));
/* 682 */                               throw null;
                                        break;
                                    case 51:
/* 643 */                               ooiO0li = ooiO0li2;
/* 644 */                               iArr = iArr2;
/* 649 */                               iOOOi14.I00ilI0I1(1);
/* 664 */                               Ooil11Oi.I00100o1O0lo(obj2, iI00O0i0ii & 1048575, Double.valueOf(((IOOOI0) iOOOi14.I0000oI00).I00100o1O0lo()));
/* 667 */                               o1lIoI2.I00Io1o110i(obj2, iI0000O, iI00IoIO0lI);
/* 193 */                               iOOOi12 = iOOOi14;
/* 194 */                               il1llO11O2 = il1llO11O3;
/* 195 */                               o1lIoI = o1lIoI2;
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case 52:
/* 613 */                               ooiO0li = ooiO0li2;
/* 614 */                               iArr = iArr2;
/* 620 */                               iOOOi14.I00ilI0I1(5);
/* 635 */                               Ooil11Oi.I00100o1O0lo(obj2, iI00O0i0ii & 1048575, Float.valueOf(((IOOOI0) iOOOi14.I0000oI00).I001IIilI0O()));
/* 638 */                               o1lIoI2.I00Io1o110i(obj2, iI0000O, iI00IoIO0lI);
/* 193 */                               iOOOi12 = iOOOi14;
/* 194 */                               il1llO11O2 = il1llO11O3;
/* 195 */                               o1lIoI = o1lIoI2;
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case 53:
/* 583 */                               ooiO0li = ooiO0li2;
/* 584 */                               iArr = iArr2;
/* 590 */                               iOOOi14.I00ilI0I1(0);
/* 605 */                               Ooil11Oi.I00100o1O0lo(obj2, iI00O0i0ii & 1048575, Long.valueOf(((IOOOI0) iOOOi14.I0000oI00).I001i1O0Ol()));
/* 608 */                               o1lIoI2.I00Io1o110i(obj2, iI0000O, iI00IoIO0lI);
/* 193 */                               iOOOi12 = iOOOi14;
/* 194 */                               il1llO11O2 = il1llO11O3;
/* 195 */                               o1lIoI = o1lIoI2;
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case 54:
/* 553 */                               ooiO0li = ooiO0li2;
/* 554 */                               iArr = iArr2;
/* 560 */                               iOOOi14.I00ilI0I1(0);
/* 575 */                               Ooil11Oi.I00100o1O0lo(obj2, iI00O0i0ii & 1048575, Long.valueOf(((IOOOI0) iOOOi14.I0000oI00).I00IO1()));
/* 578 */                               o1lIoI2.I00Io1o110i(obj2, iI0000O, iI00IoIO0lI);
/* 193 */                               iOOOi12 = iOOOi14;
/* 194 */                               il1llO11O2 = il1llO11O3;
/* 195 */                               o1lIoI = o1lIoI2;
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case 55:
/* 523 */                               ooiO0li = ooiO0li2;
/* 524 */                               iArr = iArr2;
/* 530 */                               iOOOi14.I00ilI0I1(0);
/* 545 */                               Ooil11Oi.I00100o1O0lo(obj2, iI00O0i0ii & 1048575, Integer.valueOf(((IOOOI0) iOOOi14.I0000oI00).I001IO000()));
/* 548 */                               o1lIoI2.I00Io1o110i(obj2, iI0000O, iI00IoIO0lI);
/* 193 */                               iOOOi12 = iOOOi14;
/* 194 */                               il1llO11O2 = il1llO11O3;
/* 195 */                               o1lIoI = o1lIoI2;
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case 56:
/* 494 */                               ooiO0li = ooiO0li2;
/* 495 */                               iArr = iArr2;
/* 500 */                               iOOOi14.I00ilI0I1(1);
/* 515 */                               Ooil11Oi.I00100o1O0lo(obj2, iI00O0i0ii & 1048575, Long.valueOf(((IOOOI0) iOOOi14.I0000oI00).I00111O()));
/* 518 */                               o1lIoI2.I00Io1o110i(obj2, iI0000O, iI00IoIO0lI);
/* 193 */                               iOOOi12 = iOOOi14;
/* 194 */                               il1llO11O2 = il1llO11O3;
/* 195 */                               o1lIoI = o1lIoI2;
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case 57:
/* 464 */                               ooiO0li = ooiO0li2;
/* 465 */                               iArr = iArr2;
/* 471 */                               iOOOi14.I00ilI0I1(5);
/* 486 */                               Ooil11Oi.I00100o1O0lo(obj2, iI00O0i0ii & 1048575, Integer.valueOf(((IOOOI0) iOOOi14.I0000oI00).I0010o()));
/* 489 */                               o1lIoI2.I00Io1o110i(obj2, iI0000O, iI00IoIO0lI);
/* 193 */                               iOOOi12 = iOOOi14;
/* 194 */                               il1llO11O2 = il1llO11O3;
/* 195 */                               o1lIoI = o1lIoI2;
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case 58:
/* 434 */                               ooiO0li = ooiO0li2;
/* 435 */                               iArr = iArr2;
/* 441 */                               iOOOi14.I00ilI0I1(0);
/* 456 */                               Ooil11Oi.I00100o1O0lo(obj2, iI00O0i0ii & 1048575, Boolean.valueOf(((IOOOI0) iOOOi14.I0000oI00).I000o00OoI0I()));
/* 459 */                               o1lIoI2.I00Io1o110i(obj2, iI0000O, iI00IoIO0lI);
/* 193 */                               iOOOi12 = iOOOi14;
/* 194 */                               il1llO11O2 = il1llO11O3;
/* 195 */                               o1lIoI = o1lIoI2;
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case 59:
/* 423 */                               ooiO0li = ooiO0li2;
/* 424 */                               iArr = iArr2;
/* 426 */                               o1lIoI2.I00IioO0OiOi(iI00O0i0ii, iOOOi14, obj2);
/* 429 */                               o1lIoI2.I00Io1o110i(obj2, iI0000O, iI00IoIO0lI);
/* 193 */                               iOOOi12 = iOOOi14;
/* 194 */                               il1llO11O2 = il1llO11O3;
/* 195 */                               o1lIoI = o1lIoI2;
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case 60:
/* 398 */                               ooiO0li = ooiO0li2;
/* 399 */                               iArr = iArr2;
/* 405 */                               I01Iio10lo i01Iio10lo3 = (I01Iio10lo) o1lIoI2.I001i1lo1io(obj2, iI0000O, iI00IoIO0lI);
/* 407 */                               OiOIiIO0 oiOIiIO0I00100l03 = o1lIoI2.I00100l0(iI00IoIO0lI);
/* 412 */                               iOOOi14.I00ilI0I1(2);
/* 415 */                               iOOOi14.I000OiO(i01Iio10lo3, oiOIiIO0I00100l03, il1llO11O3);
/* 418 */                               o1lIoI2.I00IoiI(obj2, iI0000O, iI00IoIO0lI, i01Iio10lo3);
/* 193 */                               iOOOi12 = iOOOi14;
/* 194 */                               il1llO11O2 = il1llO11O3;
/* 195 */                               o1lIoI = o1lIoI2;
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case 61:
/* 380 */                               ooiO0li = ooiO0li2;
/* 381 */                               iArr = iArr2;
/* 390 */                               Ooil11Oi.I00100o1O0lo(obj2, iI00O0i0ii & 1048575, iOOOi14.I0010I0i());
/* 393 */                               o1lIoI2.I00Io1o110i(obj2, iI0000O, iI00IoIO0lI);
/* 193 */                               iOOOi12 = iOOOi14;
/* 194 */                               il1llO11O2 = il1llO11O3;
/* 195 */                               o1lIoI = o1lIoI2;
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case 62:
/* 350 */                               ooiO0li = ooiO0li2;
/* 351 */                               iArr = iArr2;
/* 357 */                               iOOOi14.I00ilI0I1(0);
/* 372 */                               Ooil11Oi.I00100o1O0lo(obj2, iI00O0i0ii & 1048575, Integer.valueOf(((IOOOI0) iOOOi14.I0000oI00).I00II0oii1o()));
/* 375 */                               o1lIoI2.I00Io1o110i(obj2, iI0000O, iI00IoIO0lI);
/* 193 */                               iOOOi12 = iOOOi14;
/* 194 */                               il1llO11O2 = il1llO11O3;
/* 195 */                               o1lIoI = o1lIoI2;
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case 63:
/* 317 */                               ooiO0li = ooiO0li2;
/* 318 */                               iArr = iArr2;
/* 321 */                               iOOOi14.I00ilI0I1(0);
/* 328 */                               int iI0010I0i2 = ((IOOOI0) iOOOi14.I0000oI00).I0010I0i();
/* 332 */                               o1lIoI2.I000o00OoI0I(iI00IoIO0lI);
/* 342 */                               Ooil11Oi.I00100o1O0lo(obj2, iI00O0i0ii & 1048575, Integer.valueOf(iI0010I0i2));
/* 345 */                               o1lIoI2.I00Io1o110i(obj2, iI0000O, iI00IoIO0lI);
/* 193 */                               iOOOi12 = iOOOi14;
/* 194 */                               il1llO11O2 = il1llO11O3;
/* 195 */                               o1lIoI = o1lIoI2;
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case Barcode.FORMAT_EAN_8:
/* 288 */                               ooiO0li = ooiO0li2;
/* 289 */                               iArr = iArr2;
/* 295 */                               iOOOi14.I00ilI0I1(5);
/* 310 */                               Ooil11Oi.I00100o1O0lo(obj2, iI00O0i0ii & 1048575, Integer.valueOf(((IOOOI0) iOOOi14.I0000oI00).I001i1lo1io()));
/* 313 */                               o1lIoI2.I00Io1o110i(obj2, iI0000O, iI00IoIO0lI);
/* 193 */                               iOOOi12 = iOOOi14;
/* 194 */                               il1llO11O2 = il1llO11O3;
/* 195 */                               o1lIoI = o1lIoI2;
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case 65:
/* 260 */                               ooiO0li = ooiO0li2;
/* 261 */                               iArr = iArr2;
/* 266 */                               iOOOi14.I00ilI0I1(1);
/* 281 */                               Ooil11Oi.I00100o1O0lo(obj2, iI00O0i0ii & 1048575, Long.valueOf(((IOOOI0) iOOOi14.I0000oI00).I001iOo1i0O()));
/* 284 */                               o1lIoI2.I00Io1o110i(obj2, iI0000O, iI00IoIO0lI);
/* 193 */                               iOOOi12 = iOOOi14;
/* 194 */                               il1llO11O2 = il1llO11O3;
/* 195 */                               o1lIoI = o1lIoI2;
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case 66:
/* 231 */                               ooiO0li = ooiO0li2;
/* 232 */                               iArr = iArr2;
/* 238 */                               iOOOi14.I00ilI0I1(0);
/* 253 */                               Ooil11Oi.I00100o1O0lo(obj2, iI00O0i0ii & 1048575, Integer.valueOf(((IOOOI0) iOOOi14.I0000oI00).I001l0I00()));
/* 256 */                               o1lIoI2.I00Io1o110i(obj2, iI0000O, iI00IoIO0lI);
/* 193 */                               iOOOi12 = iOOOi14;
/* 194 */                               il1llO11O2 = il1llO11O3;
/* 195 */                               o1lIoI = o1lIoI2;
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    case 67:
/* 200 */                               ooiO0li = ooiO0li2;
/* 201 */                               iArr = iArr2;
/* 198 */                               long j = iI00O0i0ii & 1048575;
                                        try {
                                            try {
/* 205 */                                       iOOOi14.I00ilI0I1(0);
/* 220 */                                       Ooil11Oi.I00100o1O0lo(obj2, j, Long.valueOf(((IOOOI0) iOOOi14.I0000oI00).I001lIiIIo1O()));
/* 223 */                                       o1lIoI2.I00Io1o110i(obj2, iI0000O, iI00IoIO0lI);
/* 193 */                                       iOOOi12 = iOOOi14;
/* 194 */                                       il1llO11O2 = il1llO11O3;
/* 195 */                                       o1lIoI = o1lIoI2;
                                            } catch (Throwable th4) {
/* 227 */                                       th = th4;
/* 228 */                                       o1lIoI = o1lIoI2;
/* 1826 */                                      while (i2 < i) {
/* 1830 */                                          o1lIoI.I000lI(iArr[i2], obj2, ooiO0I1O1III00000oIO);
/* 1833 */                                          i2++;
                                                }
/* 1836 */                                      if (ooiO0I1O1III00000oIO != null) {
/* 1838 */                                          ooiO0li.getClass();
/* 1844 */                                          ((Io00Io0IO11) obj2).unknownFields = ooiO0I1O1III00000oIO;
                                                }
/* 1846 */                                      throw th;
                                            }
                                        } catch (O000illO unused7) {
/* 144 */                                   iOOOi12 = iOOOi14;
/* 145 */                                   il1llO11O2 = il1llO11O3;
/* 146 */                                   o1lIoI = o1lIoI2;
/* 1784 */                                  ooiO0li.getClass();
/* 1787 */                                  if (ooiO0I1O1III00000oIO == null) {
                                            }
/* 1798 */                                  if (!OoiO0li.I00000oOI(ooiO0I1O1III00000oIO, iOOOi12)) {
                                            }
/* 1815 */                                  o1lIoI2 = o1lIoI;
/* 1816 */                                  iOOOi14 = iOOOi12;
/* 1817 */                                  il1llO11O3 = il1llO11O2;
/* 1818 */                                  ooiO0li2 = ooiO0li;
/* 1819 */                                  iArr2 = iArr;
                                        }
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                        break;
                                    case 68:
/* 175 */                               I01Iio10lo i01Iio10lo4 = (I01Iio10lo) o1lIoI2.I001i1lo1io(obj2, iI0000O, iI00IoIO0lI);
/* 177 */                               OiOIiIO0 oiOIiIO0I00100l04 = o1lIoI2.I00100l0(iI00IoIO0lI);
/* 181 */                               iOOOi14.I00ilI0I1(3);
/* 184 */                               iOOOi14.I000II(i01Iio10lo4, oiOIiIO0I00100l04, il1llO11O3);
/* 187 */                               o1lIoI2.I00IoiI(obj2, iI0000O, iI00IoIO0lI, i01Iio10lo4);
/* 190 */                               ooiO0li = ooiO0li2;
/* 191 */                               iArr = iArr2;
/* 193 */                               iOOOi12 = iOOOi14;
/* 194 */                               il1llO11O2 = il1llO11O3;
/* 195 */                               o1lIoI = o1lIoI2;
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                    default:
/* 130 */                               if (ooiO0I1O1III00000oIO == null) {
                                            try {
/* 132 */                                       ooiO0li2.getClass();
/* 135 */                                       ooiO0I1O1III00000oIO = OoiO0li.I00000oIO(obj2);
                                            } catch (O000illO unused8) {
/* 141 */                                       ooiO0li = ooiO0li2;
/* 142 */                                       iArr = iArr2;
/* 144 */                                       iOOOi12 = iOOOi14;
/* 145 */                                       il1llO11O2 = il1llO11O3;
/* 146 */                                       o1lIoI = o1lIoI2;
/* 1784 */                                      ooiO0li.getClass();
/* 1787 */                                      if (ooiO0I1O1III00000oIO == null) {
/* 1789 */                                          ooiO0I1O1III00000oIO = OoiO0li.I00000oIO(obj2);
                                                }
/* 1798 */                                      if (!OoiO0li.I00000oOI(ooiO0I1O1III00000oIO, iOOOi12)) {
/* 1800 */                                          while (i2 < i) {
/* 1804 */                                              o1lIoI.I000lI(iArr[i2], obj2, ooiO0I1O1III00000oIO);
/* 1807 */                                              i2++;
                                                    }
/* 1810 */                                          if (ooiO0I1O1III00000oIO == null) {
/* 1814 */                                              return;
                                                    }
/* 78 */                                            ((Io00Io0IO11) obj2).unknownFields = ooiO0I1O1III00000oIO;
/* 1814 */                                          return;
                                                }
/* 1815 */                                      o1lIoI2 = o1lIoI;
/* 1816 */                                      iOOOi14 = iOOOi12;
/* 1817 */                                      il1llO11O3 = il1llO11O2;
/* 1818 */                                      ooiO0li2 = ooiO0li;
/* 1819 */                                      iArr2 = iArr;
                                            }
                                        }
/* 149 */                               ooiO0li2.getClass();
/* 156 */                               if (!OoiO0li.I00000oOI(ooiO0I1O1III00000oIO, iOOOi14)) {
/* 158 */                                   while (i2 < i) {
/* 162 */                                       o1lIoI2.I000lI(iArr2[i2], obj2, ooiO0I1O1III00000oIO);
/* 165 */                                       i2++;
                                            }
/* 168 */                                   if (ooiO0I1O1III00000oIO == null) {
/* 1814 */                                      return;
                                            }
                                        }
/* 190 */                               ooiO0li = ooiO0li2;
/* 191 */                               iArr = iArr2;
/* 193 */                               iOOOi12 = iOOOi14;
/* 194 */                               il1llO11O2 = il1llO11O3;
/* 195 */                               o1lIoI = o1lIoI2;
/* 1815 */                              o1lIoI2 = o1lIoI;
/* 1816 */                              iOOOi14 = iOOOi12;
/* 1817 */                              il1llO11O3 = il1llO11O2;
/* 1818 */                              ooiO0li2 = ooiO0li;
/* 1819 */                              iArr2 = iArr;
                                }
                            } else if (iI0000O == Integer.MAX_VALUE) {
/* 60 */                        while (i2 < i) {
/* 64 */                            o1lIoI2.I000lI(iArr2[i2], obj2, ooiO0I1O1III00000oIO);
/* 67 */                            i2++;
                                }
/* 70 */                        if (ooiO0I1O1III00000oIO == null) {
/* 1814 */                          return;
                                } else {
/* 72 */                            ooiO0li2.getClass();
                                }
                            } else {
/* 82 */                        ooiO0li2.getClass();
/* 85 */                        if (ooiO0I1O1III00000oIO == null) {
/* 87 */                            ooiO0I1O1III00000oIO = OoiO0li.I00000oIO(obj2);
                                }
/* 96 */                        if (!OoiO0li.I00000oOI(ooiO0I1O1III00000oIO, iOOOi14)) {
/* 99 */                            while (i2 < i) {
/* 103 */                               o1lIoI2.I000lI(iArr2[i2], obj2, ooiO0I1O1III00000oIO);
/* 106 */                               i2++;
                                    }
/* 109 */                           if (ooiO0I1O1III00000oIO == null) {
/* 1814 */                              return;
                                    }
                                }
                            }
                        } catch (Throwable th5) {
/* 1823 */                  th = th5;
/* 45 */                    o1lIoI = o1lIoI2;
/* 46 */                    ooiO0li = ooiO0li2;
/* 47 */                    iArr = iArr2;
                        }
                    }
                }

                /* JADX WARN: Failed to find 'out' block for switch in B:38:0x00ad. Please report as an issue. */
                @Override
                public final void I000OOo1O(Object obj, byte[] bArr, int i, int i2, I1Il011OO i1Il011OO) throws O000oiiiOI0 {
                    int i3;
                    int iI00IoIO0lI;
                    int[] iArr;
                    Object obj2;
                    int i4;
                    int i5;
                    int i6;
                    int i7;
                    int i8;
                    int i9;
                    int i10;
                    byte[] bArr2;
                    Object obj3;
                    Object obj4;
                    int iI00000oIO;
                    Object obj5;
                    int i11;
                    int i12;
/* 1 */             O1lIoI o1lIoI = this;
/* 3 */             Object obj6 = obj;
/* 5 */             byte[] bArr3 = bArr;
/* 7 */             int i13 = i2;
/* 9 */             I1Il011OO i1Il011OO2 = i1Il011OO;
/* 11 */            int i14 = o1lIoI.I0000O;
/* 15 */            if (!o1lIoI.I000II) {
/* 963 */               I00II0oii1o(obj6, bArr, i, i13, 0, i1Il011OO);
/* 966 */               return;
                    }
/* 17 */            int[] iArr2 = o1lIoI.I00000oIO;
/* 19 */            I000l1(obj6);
/* 22 */            int iI000II = i;
/* 24 */            int i15 = 0;
/* 25 */            int i16 = -1;
/* 26 */            int i17 = 0;
/* 27 */            int i18 = 1048575;
                    while (true) {
/* 30 */                Unsafe unsafe = I00100l0;
/* 32 */                if (iI000II >= i13) {
/* 926 */                   int i19 = i15;
/* 929 */                   int i20 = i13;
/* 930 */                   int i21 = i18;
/* 934 */                   Object obj7 = obj6;
/* 935 */                   if (i21 != 1048575) {
/* 940 */                       unsafe.putInt(obj7, i21, i19);
                            }
/* 943 */                   if (iI000II != i20) {
/* 950 */                       throw O000oiiiOI0.I0001Ioi1lo();
                            }
/* 945 */                   return;
                        }
/* 37 */                int iI000O01llI0 = iI000II + 1;
/* 39 */                int i22 = bArr3[iI000II];
/* 41 */                if (i22 < 0) {
/* 43 */                    iI000O01llI0 = iOO1IIO0.I000O01llI0(i22, bArr3, iI000O01llI0, i1Il011OO2);
/* 47 */                    i22 = i1Il011OO2.I00000oIO;
                        }
/* 49 */                int i23 = i22 >>> 3;
/* 51 */                int i24 = i22 & 7;
/* 53 */                int i25 = i22;
/* 55 */                int i26 = o1lIoI.I0000Il00O;
/* 57 */                if (i23 > i16) {
/* 70 */                    iI00IoIO0lI = (i23 < i26 || i23 > i14) ? -1 : o1lIoI.I00IoIO0lI(i23, i17 / 3);
/* 72 */                    i3 = 0;
                        } else if (i23 < i26 || i23 > i14) {
/* 85 */                    i3 = 0;
/* 86 */                    iI00IoIO0lI = -1;
                        } else {
/* 79 */                    i3 = 0;
/* 80 */                    iI00IoIO0lI = o1lIoI.I00IoIO0lI(i23, 0);
                        }
/* 88 */                if (iI00IoIO0lI == -1) {
/* 92 */                    iArr = iArr2;
/* 97 */                    obj2 = obj6;
/* 98 */                    i4 = i15;
/* 102 */                   i5 = i23;
/* 104 */                   i6 = iI000O01llI0;
/* 105 */                   i7 = i14;
/* 107 */                   i8 = i25;
/* 109 */                   i9 = i3;
                        } else {
/* 115 */                   int i27 = iArr2[iI00IoIO0lI + 1];
/* 117 */                   i5 = i23;
/* 119 */                   int iI00Iooi00oi = I00Iooi00oi(i27);
/* 125 */                   int i28 = iI00IoIO0lI;
/* 123 */                   long j = i27 & 1048575;
/* 132 */                   if (iI00Iooi00oi <= 17) {
/* 136 */                       int i29 = iArr2[i28 + 2];
/* 141 */                       int i30 = 1 << (i29 >>> 20);
/* 143 */                       int i31 = i29 & 1048575;
/* 145 */                       if (i31 != i18) {
/* 147 */                           int i32 = 1048575;
/* 149 */                           i10 = i24;
/* 151 */                           if (i18 != 1048575) {
/* 154 */                               unsafe.putInt(obj6, i18, i15);
/* 157 */                               i32 = 1048575;
                                    }
/* 160 */                           if (i31 != i32) {
/* 163 */                               i15 = unsafe.getInt(obj6, i31);
                                    }
/* 167 */                           i18 = i31;
                                } else {
/* 170 */                           i10 = i24;
                                }
/* 168 */                       int i33 = i15;
                                switch (iI00Iooi00oi) {
                                    case 0:
/* 592 */                               bArr2 = bArr3;
/* 595 */                               i9 = i28;
/* 603 */                               if (i10 != 1) {
/* 621 */                                   i8 = i25;
/* 623 */                                   obj2 = obj6;
/* 624 */                                   i4 = i33;
/* 626 */                                   i6 = iI000O01llI0;
/* 627 */                                   i7 = i14;
/* 629 */                                   iArr = iArr2;
                                            break;
                                        } else {
/* 617 */                                   Ooil11Oi.I0000Il00O.I000II(obj6, j, Double.longBitsToDouble(iOO1IIO0.I0000Il00O(iI000O01llI0, bArr2)));
/* 494 */                                   iI000II = iI000O01llI0 + 8;
/* 496 */                                   i15 = i33 | i30;
/* 498 */                                   i13 = i2;
/* 354 */                                   bArr3 = bArr2;
/* 217 */                                   i17 = i9;
/* 218 */                                   i16 = i5;
                                            break;
                                        }
                                    case 1:
/* 562 */                               bArr2 = bArr3;
/* 565 */                               i9 = i28;
/* 573 */                               if (i10 != 5) {
/* 621 */                                   i8 = i25;
/* 623 */                                   obj2 = obj6;
/* 624 */                                   i4 = i33;
/* 626 */                                   i6 = iI000O01llI0;
/* 627 */                                   i7 = i14;
/* 629 */                                   iArr = iArr2;
                                            break;
                                        } else {
/* 585 */                                   Ooil11Oi.I0000Il00O.I000O01llI0(obj6, j, Float.intBitsToFloat(iOO1IIO0.I00000oOI(iI000O01llI0, bArr2)));
/* 588 */                                   iI000II = iI000O01llI0 + 4;
/* 496 */                                   i15 = i33 | i30;
/* 498 */                                   i13 = i2;
/* 354 */                                   bArr3 = bArr2;
/* 217 */                                   i17 = i9;
/* 218 */                                   i16 = i5;
                                            break;
                                        }
                                    case 2:
                                    case 3:
/* 533 */                               bArr2 = bArr3;
/* 536 */                               i9 = i28;
/* 544 */                               if (i10 != 0) {
/* 621 */                                   i8 = i25;
/* 623 */                                   obj2 = obj6;
/* 624 */                                   i4 = i33;
/* 626 */                                   i6 = iI000O01llI0;
/* 627 */                                   i7 = i14;
/* 629 */                                   iArr = iArr2;
                                            break;
                                        } else {
/* 546 */                                   int iI000iOII = iOO1IIO0.I000iOII(bArr2, iI000O01llI0, i1Il011OO2);
/* 552 */                                   unsafe.putLong(obj6, j, i1Il011OO2.I00000oOI);
/* 555 */                                   i15 = i33 | i30;
/* 557 */                                   i13 = i2;
/* 559 */                                   iI000II = iI000iOII;
/* 354 */                                   bArr3 = bArr2;
/* 217 */                                   i17 = i9;
/* 218 */                                   i16 = i5;
                                            break;
                                        }
                                    case 4:
                                    case 11:
/* 503 */                               bArr2 = bArr3;
/* 506 */                               i9 = i28;
/* 514 */                               if (i10 != 0) {
/* 621 */                                   i8 = i25;
/* 623 */                                   obj2 = obj6;
/* 624 */                                   i4 = i33;
/* 626 */                                   i6 = iI000O01llI0;
/* 627 */                                   i7 = i14;
/* 629 */                                   iArr = iArr2;
                                            break;
                                        } else {
/* 516 */                                   int iI000OOo1O = iOO1IIO0.I000OOo1O(bArr2, iI000O01llI0, i1Il011OO2);
/* 522 */                                   unsafe.putInt(obj6, j, i1Il011OO2.I00000oIO);
/* 525 */                                   i15 = i33 | i30;
/* 527 */                                   i13 = i2;
/* 529 */                                   iI000II = iI000OOo1O;
/* 354 */                                   bArr3 = bArr2;
/* 217 */                                   i17 = i9;
/* 218 */                                   i16 = i5;
                                            break;
                                        }
                                    case 5:
                                    case 14:
/* 467 */                               bArr2 = bArr3;
/* 470 */                               i9 = i28;
/* 476 */                               obj3 = obj6;
/* 479 */                               if (i10 != 1) {
/* 401 */                                   obj6 = obj3;
/* 621 */                                   i8 = i25;
/* 623 */                                   obj2 = obj6;
/* 624 */                                   i4 = i33;
/* 626 */                                   i6 = iI000O01llI0;
/* 627 */                                   i7 = i14;
/* 629 */                                   iArr = iArr2;
                                            break;
                                        } else {
/* 490 */                                   obj6 = obj3;
/* 491 */                                   unsafe.putLong(obj6, j, iOO1IIO0.I0000Il00O(iI000O01llI0, bArr2));
/* 494 */                                   iI000II = iI000O01llI0 + 8;
/* 496 */                                   i15 = i33 | i30;
/* 498 */                                   i13 = i2;
/* 354 */                                   bArr3 = bArr2;
/* 217 */                                   i17 = i9;
/* 218 */                                   i16 = i5;
                                            break;
                                        }
                                    case 6:
                                    case 13:
/* 441 */                               bArr2 = bArr3;
/* 444 */                               i9 = i28;
/* 450 */                               obj3 = obj6;
/* 453 */                               if (i10 != 5) {
/* 401 */                                   obj6 = obj3;
/* 621 */                                   i8 = i25;
/* 623 */                                   obj2 = obj6;
/* 624 */                                   i4 = i33;
/* 626 */                                   i6 = iI000O01llI0;
/* 627 */                                   i7 = i14;
/* 629 */                                   iArr = iArr2;
                                            break;
                                        } else {
/* 459 */                                   unsafe.putInt(obj3, j, iOO1IIO0.I00000oOI(iI000O01llI0, bArr2));
/* 462 */                                   iI000II = iI000O01llI0 + 4;
/* 396 */                                   i15 = i33 | i30;
/* 398 */                                   i13 = i2;
/* 353 */                                   obj6 = obj3;
/* 354 */                                   bArr3 = bArr2;
/* 217 */                                   i17 = i9;
/* 218 */                                   i16 = i5;
                                            break;
                                        }
                                    case 7:
/* 404 */                               bArr2 = bArr3;
/* 407 */                               i9 = i28;
/* 413 */                               obj3 = obj6;
/* 416 */                               if (i10 != 0) {
/* 401 */                                   obj6 = obj3;
/* 621 */                                   i8 = i25;
/* 623 */                                   obj2 = obj6;
/* 624 */                                   i4 = i33;
/* 626 */                                   i6 = iI000O01llI0;
/* 627 */                                   i7 = i14;
/* 629 */                                   iArr = iArr2;
                                            break;
                                        } else {
/* 418 */                                   iI000II = iOO1IIO0.I000iOII(bArr2, iI000O01llI0, i1Il011OO2);
/* 436 */                                   Ooil11Oi.I0000Il00O.I0000oI00(obj3, j, i1Il011OO2.I00000oOI != 0);
/* 396 */                                   i15 = i33 | i30;
/* 398 */                                   i13 = i2;
/* 353 */                                   obj6 = obj3;
/* 354 */                                   bArr3 = bArr2;
/* 217 */                                   i17 = i9;
/* 218 */                                   i16 = i5;
                                            break;
                                        }
                                    case 8:
/* 362 */                               bArr2 = bArr3;
/* 365 */                               i9 = i28;
/* 372 */                               obj3 = obj6;
/* 375 */                               if (i10 != 2) {
/* 401 */                                   obj6 = obj3;
/* 621 */                                   i8 = i25;
/* 623 */                                   obj2 = obj6;
/* 624 */                                   i4 = i33;
/* 626 */                                   i6 = iI000O01llI0;
/* 627 */                                   i7 = i14;
/* 629 */                                   iArr = iArr2;
                                            break;
                                        } else {
/* 387 */                                   iI000II = (i27 & 536870912) == 0 ? iOO1IIO0.I0000oI00(bArr2, iI000O01llI0, i1Il011OO2) : iOO1IIO0.I0001Ioi1lo(bArr2, iI000O01llI0, i1Il011OO2);
/* 393 */                                   unsafe.putObject(obj3, j, i1Il011OO2.I0000Il00O);
/* 396 */                                   i15 = i33 | i30;
/* 398 */                                   i13 = i2;
/* 353 */                                   obj6 = obj3;
/* 354 */                                   bArr3 = bArr2;
/* 217 */                                   i17 = i9;
/* 218 */                                   i16 = i5;
                                            break;
                                        }
                                    case 9:
/* 312 */                               Object obj8 = obj6;
/* 315 */                               i9 = i28;
/* 322 */                               if (i10 != 2) {
/* 358 */                                   obj6 = obj8;
/* 621 */                                   i8 = i25;
/* 623 */                                   obj2 = obj6;
/* 624 */                                   i4 = i33;
/* 626 */                                   i6 = iI000O01llI0;
/* 627 */                                   i7 = i14;
/* 629 */                                   iArr = iArr2;
                                            break;
                                        } else {
/* 325 */                                   Object objI001i1O0Ol = o1lIoI.I001i1O0Ol(i9, obj8);
/* 335 */                                   byte[] bArr4 = bArr3;
/* 338 */                                   obj3 = obj;
/* 340 */                                   int iI000l1 = iOO1IIO0.I000l1(objI001i1O0Ol, o1lIoI.I00100l0(i9), bArr4, iI000O01llI0, i2, i1Il011OO2);
/* 344 */                                   bArr2 = bArr4;
/* 345 */                                   o1lIoI.I00IoO0(i9, obj3, objI001i1O0Ol);
/* 348 */                                   i15 = i33 | i30;
/* 350 */                                   i13 = i2;
/* 352 */                                   iI000II = iI000l1;
/* 353 */                                   obj6 = obj3;
/* 354 */                                   bArr3 = bArr2;
/* 217 */                                   i17 = i9;
/* 218 */                                   i16 = i5;
                                            break;
                                        }
                                    case 10:
/* 287 */                               obj4 = obj6;
/* 291 */                               i9 = i28;
/* 300 */                               if (i10 != 2) {
/* 263 */                                   obj6 = obj4;
/* 621 */                                   i8 = i25;
/* 623 */                                   obj2 = obj6;
/* 624 */                                   i4 = i33;
/* 626 */                                   i6 = iI000O01llI0;
/* 627 */                                   i7 = i14;
/* 629 */                                   iArr = iArr2;
                                            break;
                                        } else {
/* 302 */                                   iI00000oIO = iOO1IIO0.I00000oIO(bArr3, iI000O01llI0, i1Il011OO2);
/* 308 */                                   unsafe.putObject(obj4, j, i1Il011OO2.I0000Il00O);
/* 256 */                                   i15 = i33 | i30;
/* 258 */                                   i13 = i2;
/* 260 */                                   obj6 = obj4;
/* 261 */                                   iI000II = iI00000oIO;
/* 217 */                                   i17 = i9;
/* 218 */                                   i16 = i5;
                                            break;
                                        }
                                    case 12:
/* 265 */                               obj4 = obj6;
/* 267 */                               i9 = i28;
/* 275 */                               if (i10 != 0) {
/* 263 */                                   obj6 = obj4;
/* 621 */                                   i8 = i25;
/* 623 */                                   obj2 = obj6;
/* 624 */                                   i4 = i33;
/* 626 */                                   i6 = iI000O01llI0;
/* 627 */                                   i7 = i14;
/* 629 */                                   iArr = iArr2;
                                            break;
                                        } else {
/* 277 */                                   iI00000oIO = iOO1IIO0.I000OOo1O(bArr3, iI000O01llI0, i1Il011OO2);
/* 283 */                                   unsafe.putInt(obj4, j, i1Il011OO2.I00000oIO);
/* 256 */                                   i15 = i33 | i30;
/* 258 */                                   i13 = i2;
/* 260 */                                   obj6 = obj4;
/* 261 */                                   iI000II = iI00000oIO;
/* 217 */                                   i17 = i9;
/* 218 */                                   i16 = i5;
                                            break;
                                        }
                                    case 15:
/* 231 */                               obj4 = obj6;
/* 233 */                               i9 = i28;
/* 241 */                               if (i10 != 0) {
/* 263 */                                   obj6 = obj4;
/* 621 */                                   i8 = i25;
/* 623 */                                   obj2 = obj6;
/* 624 */                                   i4 = i33;
/* 626 */                                   i6 = iI000O01llI0;
/* 627 */                                   i7 = i14;
/* 629 */                                   iArr = iArr2;
                                            break;
                                        } else {
/* 243 */                                   iI00000oIO = iOO1IIO0.I000OOo1O(bArr3, iI000O01llI0, i1Il011OO2);
/* 253 */                                   unsafe.putInt(obj4, j, IOOOI0.I0000O(i1Il011OO2.I00000oIO));
/* 256 */                                   i15 = i33 | i30;
/* 258 */                                   i13 = i2;
/* 260 */                                   obj6 = obj4;
/* 261 */                                   iI000II = iI00000oIO;
/* 217 */                                   i17 = i9;
/* 218 */                                   i16 = i5;
                                            break;
                                        }
                                    case 16:
/* 186 */                               if (i10 != 0) {
/* 222 */                                   i9 = i28;
/* 621 */                                   i8 = i25;
/* 623 */                                   obj2 = obj6;
/* 624 */                                   i4 = i33;
/* 626 */                                   i6 = iI000O01llI0;
/* 627 */                                   i7 = i14;
/* 629 */                                   iArr = iArr2;
                                            break;
                                        } else {
/* 188 */                                   int iI000iOII2 = iOO1IIO0.I000iOII(bArr3, iI000O01llI0, i1Il011OO2);
/* 199 */                                   i9 = i28;
/* 208 */                                   unsafe.putLong(obj6, j, IOOOI0.I0000oI00(i1Il011OO2.I00000oOI));
/* 212 */                                   i15 = i33 | i30;
/* 214 */                                   i13 = i2;
/* 216 */                                   iI000II = iI000iOII2;
/* 217 */                                   i17 = i9;
/* 218 */                                   i16 = i5;
                                            break;
                                        }
                                    default:
/* 178 */                               i9 = i28;
/* 621 */                               i8 = i25;
/* 623 */                               obj2 = obj6;
/* 624 */                               i4 = i33;
/* 626 */                               i6 = iI000O01llI0;
/* 627 */                               i7 = i14;
/* 629 */                               iArr = iArr2;
                                        break;
                                }
                            } else {
/* 636 */                       byte[] bArr5 = bArr3;
/* 640 */                       int i34 = i15;
/* 652 */                       if (iI00Iooi00oi != 27) {
/* 739 */                           i11 = iI000O01llI0;
/* 742 */                           if (iI00Iooi00oi <= 49) {
/* 751 */                               i7 = i14;
/* 755 */                               i12 = i18;
/* 756 */                               i4 = i34;
/* 759 */                               iArr = iArr2;
/* 766 */                               i8 = i25;
/* 769 */                               int iI00IO1 = o1lIoI.I00IO1(obj, bArr, i11, i2, i8, i24, i28, i27, iI00Iooi00oi, j, i1Il011OO);
/* 773 */                               obj6 = obj;
/* 774 */                               i9 = i28;
/* 775 */                               if (iI00IO1 != i11) {
/* 777 */                                   bArr3 = bArr;
/* 779 */                                   i13 = i2;
/* 781 */                                   i1Il011OO2 = i1Il011OO;
/* 783 */                                   iI000II = iI00IO1;
/* 784 */                                   i17 = i9;
/* 785 */                                   i18 = i12;
/* 786 */                                   iArr2 = iArr;
/* 788 */                                   i16 = i5;
/* 790 */                                   i15 = i4;
/* 792 */                                   i14 = i7;
                                        } else {
/* 797 */                                   obj2 = obj6;
/* 798 */                                   i6 = iI00IO1;
                                        }
                                    } else {
/* 803 */                               i7 = i14;
/* 805 */                               i4 = i34;
/* 807 */                               i9 = i28;
/* 808 */                               i12 = i18;
/* 809 */                               iArr = iArr2;
/* 815 */                               i8 = i25;
/* 816 */                               obj5 = obj;
/* 820 */                               if (iI00Iooi00oi == 50) {
/* 823 */                                   if (i24 == 2) {
/* 828 */                                       o1lIoI.I001lloI(obj5, i9, j);
/* 832 */                                       throw null;
                                            }
/* 825 */                                   obj2 = obj5;
/* 826 */                                   i6 = i11;
                                        } else {
/* 847 */                                   int iI00II0Ol1O0l = o1lIoI.I00II0Ol1O0l(obj5, bArr, i11, i2, i8, i5, i24, i27, iI00Iooi00oi, j, i9, i1Il011OO);
/* 851 */                                   i9 = i9;
/* 852 */                                   obj2 = obj5;
/* 853 */                                   if (iI00II0Ol1O0l != i11) {
/* 855 */                                       o1lIoI = this;
/* 857 */                                       i13 = i2;
/* 859 */                                       i1Il011OO2 = i1Il011OO;
/* 861 */                                       obj6 = obj2;
/* 862 */                                       iI000II = iI00II0Ol1O0l;
/* 863 */                                       i17 = i9;
/* 864 */                                       i18 = i12;
/* 865 */                                       iArr2 = iArr;
/* 867 */                                       i16 = i5;
/* 869 */                                       i15 = i4;
/* 871 */                                       i14 = i7;
/* 873 */                                       bArr3 = bArr;
                                            } else {
/* 877 */                                       i6 = iI00II0Ol1O0l;
                                            }
                                        }
                                    }
                                } else if (i24 == 2) {
/* 661 */                           Iool0o0iOI iool0o0iOII000O01llI0 = (Iool0o0iOI) unsafe.getObject(obj6, j);
/* 668 */                           if (!((I01Iol) iool0o0iOII000O01llI0).I00iOIl) {
/* 670 */                               int size = iool0o0iOII000O01llI0.size();
/* 681 */                               iool0o0iOII000O01llI0 = iool0o0iOII000O01llI0.I000O01llI0(size == 0 ? 10 : size * 2);
/* 685 */                               unsafe.putObject(obj6, j, iool0o0iOII000O01llI0);
                                    }
/* 700 */                           iI000II = iOO1IIO0.I0000O(o1lIoI.I00100l0(i28), i25, bArr5, iI000O01llI0, i2, iool0o0iOII000O01llI0, i1Il011OO2);
/* 704 */                           obj6 = obj;
/* 706 */                           bArr3 = bArr;
/* 708 */                           i1Il011OO2 = i1Il011OO;
/* 710 */                           i17 = i28;
/* 711 */                           i15 = i34;
/* 713 */                           i16 = i5;
/* 715 */                           i13 = i2;
                                } else {
/* 719 */                           obj5 = obj;
/* 721 */                           i8 = i25;
/* 723 */                           i9 = i28;
/* 724 */                           i11 = iI000O01llI0;
/* 725 */                           i7 = i14;
/* 727 */                           i4 = i34;
/* 729 */                           i12 = i18;
/* 730 */                           iArr = iArr2;
/* 825 */                           obj2 = obj5;
/* 826 */                           i6 = i11;
                                }
/* 799 */                       i18 = i12;
                            }
                        }
/* 880 */               Io00Io0IO11 io00Io0IO11 = (Io00Io0IO11) obj2;
/* 882 */               OoiO0I1O1II ooiO0I1O1III0000Il00O = io00Io0IO11.unknownFields;
/* 886 */               if (ooiO0I1O1III0000Il00O == OoiO0I1O1II.I0001Ioi1lo) {
/* 888 */                   ooiO0I1O1III0000Il00O = OoiO0I1O1II.I0000Il00O();
/* 892 */                   io00Io0IO11.unknownFields = ooiO0I1O1III0000Il00O;
                        }
/* 906 */               bArr3 = bArr;
/* 908 */               i1Il011OO2 = i1Il011OO;
/* 902 */               iI000II = iOO1IIO0.I000II(i8, bArr, i6, i2, ooiO0I1O1III0000Il00O, i1Il011OO);
/* 911 */               i13 = i2;
/* 912 */               obj6 = obj2;
/* 913 */               i17 = i9;
/* 914 */               iArr2 = iArr;
/* 916 */               i16 = i5;
/* 918 */               i15 = i4;
/* 920 */               i14 = i7;
/* 922 */               o1lIoI = this;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I000OiO(Io00Io0IO11 io00Io0IO11, Io00Io0IO11 io00Io0IO112) {
/* 1 */             OoiO0li ooiO0li = this.I000lI;
/* 3 */             int[] iArr = this.I00000oIO;
/* 5 */             int length = iArr.length;
/* 7 */             int i = 0;
                    while (true) {
/* 8 */                 boolean zI001i1lo1io = true;
/* 9 */                 if (i < length) {
/* 11 */                    int iI00O0i0ii = I00O0i0ii(i);
/* 18 */                    long j = iI00O0i0ii & 1048575;
                            switch (I00Iooi00oi(iI00O0i0ii)) {
                                case 0:
/* 437 */                           if (I000iOII(io00Io0IO11, io00Io0IO112, i)) {
/* 439 */                               Ooil0oIOI0l0 ooil0oIOI0l0 = Ooil11Oi.I0000Il00O;
/* 459 */                               if (Double.doubleToLongBits(ooil0oIOI0l0.I0000Il00O(j, io00Io0IO11)) != Double.doubleToLongBits(ooil0oIOI0l0.I0000Il00O(j, io00Io0IO112))) {
/* 62 */                                    zI001i1lo1io = false;
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
/* 410 */                           if (I000iOII(io00Io0IO11, io00Io0IO112, i)) {
/* 412 */                               Ooil0oIOI0l0 ooil0oIOI0l02 = Ooil11Oi.I0000Il00O;
/* 430 */                               if (Float.floatToIntBits(ooil0oIOI0l02.I0000O(j, io00Io0IO11)) != Float.floatToIntBits(ooil0oIOI0l02.I0000O(j, io00Io0IO112))) {
                                        }
                                    }
                                    break;
                                case 2:
/* 391 */                           if (!I000iOII(io00Io0IO11, io00Io0IO112, i) || Ooil11Oi.I000OOo1O(j, io00Io0IO11) != Ooil11Oi.I000OOo1O(j, io00Io0IO112)) {
                                    }
                                    break;
                                case 3:
/* 372 */                           if (!I000iOII(io00Io0IO11, io00Io0IO112, i) || Ooil11Oi.I000OOo1O(j, io00Io0IO11) != Ooil11Oi.I000OOo1O(j, io00Io0IO112)) {
                                    }
                                    break;
                                case 4:
/* 355 */                           if (!I000iOII(io00Io0IO11, io00Io0IO112, i) || Ooil11Oi.I000O01llI0(j, io00Io0IO11) != Ooil11Oi.I000O01llI0(j, io00Io0IO112)) {
                                    }
                                    break;
                                case 5:
/* 335 */                           if (!I000iOII(io00Io0IO11, io00Io0IO112, i) || Ooil11Oi.I000OOo1O(j, io00Io0IO11) != Ooil11Oi.I000OOo1O(j, io00Io0IO112)) {
                                    }
                                    break;
                                case 6:
/* 317 */                           if (!I000iOII(io00Io0IO11, io00Io0IO112, i) || Ooil11Oi.I000O01llI0(j, io00Io0IO11) != Ooil11Oi.I000O01llI0(j, io00Io0IO112)) {
                                    }
                                    break;
                                case 7:
/* 297 */                           if (I000iOII(io00Io0IO11, io00Io0IO112, i)) {
/* 299 */                               Ooil0oIOI0l0 ooil0oIOI0l03 = Ooil11Oi.I0000Il00O;
/* 309 */                               if (ooil0oIOI0l03.I00000oIO(j, io00Io0IO11) != ooil0oIOI0l03.I00000oIO(j, io00Io0IO112)) {
                                        }
                                    }
                                    break;
                                case 8:
/* 275 */                           if (!I000iOII(io00Io0IO11, io00Io0IO112, i) || !OiOO0o1I0.I001i1lo1io(Ooil11Oi.I000OiO(j, io00Io0IO11), Ooil11Oi.I000OiO(j, io00Io0IO112))) {
                                    }
                                    break;
                                case 9:
/* 253 */                           if (!I000iOII(io00Io0IO11, io00Io0IO112, i) || !OiOO0o1I0.I001i1lo1io(Ooil11Oi.I000OiO(j, io00Io0IO11), Ooil11Oi.I000OiO(j, io00Io0IO112))) {
                                    }
                                    break;
                                case 10:
/* 231 */                           if (!I000iOII(io00Io0IO11, io00Io0IO112, i) || !OiOO0o1I0.I001i1lo1io(Ooil11Oi.I000OiO(j, io00Io0IO11), Ooil11Oi.I000OiO(j, io00Io0IO112))) {
                                    }
                                    break;
                                case 11:
/* 213 */                           if (!I000iOII(io00Io0IO11, io00Io0IO112, i) || Ooil11Oi.I000O01llI0(j, io00Io0IO11) != Ooil11Oi.I000O01llI0(j, io00Io0IO112)) {
                                    }
                                    break;
                                case 12:
/* 195 */                           if (!I000iOII(io00Io0IO11, io00Io0IO112, i) || Ooil11Oi.I000O01llI0(j, io00Io0IO11) != Ooil11Oi.I000O01llI0(j, io00Io0IO112)) {
                                    }
                                    break;
                                case 13:
/* 177 */                           if (!I000iOII(io00Io0IO11, io00Io0IO112, i) || Ooil11Oi.I000O01llI0(j, io00Io0IO11) != Ooil11Oi.I000O01llI0(j, io00Io0IO112)) {
                                    }
                                    break;
                                case 14:
/* 157 */                           if (!I000iOII(io00Io0IO11, io00Io0IO112, i) || Ooil11Oi.I000OOo1O(j, io00Io0IO11) != Ooil11Oi.I000OOo1O(j, io00Io0IO112)) {
                                    }
                                    break;
                                case 15:
/* 139 */                           if (!I000iOII(io00Io0IO11, io00Io0IO112, i) || Ooil11Oi.I000O01llI0(j, io00Io0IO11) != Ooil11Oi.I000O01llI0(j, io00Io0IO112)) {
                                    }
                                    break;
                                case 16:
/* 119 */                           if (!I000iOII(io00Io0IO11, io00Io0IO112, i) || Ooil11Oi.I000OOo1O(j, io00Io0IO11) != Ooil11Oi.I000OOo1O(j, io00Io0IO112)) {
                                    }
                                    break;
                                case 17:
/* 97 */                            if (!I000iOII(io00Io0IO11, io00Io0IO112, i) || !OiOO0o1I0.I001i1lo1io(Ooil11Oi.I000OiO(j, io00Io0IO11), Ooil11Oi.I000OiO(j, io00Io0IO112))) {
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
/* 87 */                            zI001i1lo1io = OiOO0o1I0.I001i1lo1io(Ooil11Oi.I000OiO(j, io00Io0IO11), Ooil11Oi.I000OiO(j, io00Io0IO112));
                                    break;
                                case 50:
/* 73 */                            zI001i1lo1io = OiOO0o1I0.I001i1lo1io(Ooil11Oi.I000OiO(j, io00Io0IO11), Ooil11Oi.I000OiO(j, io00Io0IO112));
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
/* 44 */                            if (Ooil11Oi.I000O01llI0(j2, io00Io0IO11) != Ooil11Oi.I000O01llI0(j2, io00Io0IO112) || !OiOO0o1I0.I001i1lo1io(Ooil11Oi.I000OiO(j, io00Io0IO11), Ooil11Oi.I000OiO(j, io00Io0IO112))) {
                                    }
                                    break;
                            }
/* 461 */                   if (zI001i1lo1io) {
/* 464 */                       i += 3;
                            }
                        } else {
/* 468 */                   ooiO0li.getClass();
/* 479 */                   if (io00Io0IO11.unknownFields.equals(io00Io0IO112.unknownFields)) {
/* 8 */                         return true;
                            }
                        }
                    }
/* 6 */             return false;
                }

                public final boolean I000iOII(Io00Io0IO11 io00Io0IO11, Io00Io0IO11 io00Io0IO112, int i) {
                    return I00100o1O0lo(i, io00Io0IO11) == I00100o1O0lo(i, io00Io0IO112);
                }

                public final void I000lI(int i, Object obj, Object obj2) {
/* 3 */             int i2 = this.I00000oIO[i];
/* 18 */            if (Ooil11Oi.I000OiO(I00O0i0ii(i) & 1048575, obj) == null) {
/* 20 */                return;
                    }
/* 21 */            I000o00OoI0I(i);
                }

                public final void I000o00OoI0I(int i) {
/* 11 */            if (this.I00000oOI[((i / 3) * 2) + 1] == null) {
/* 13 */                return;
                    }
/* 14 */            OIiilo1Ool0o.I00000oIO();
                }

                public final Object I000oI1ioi(int i) {
/* 7 */             return this.I00000oOI[(i / 3) * 2];
                }

                public final OiOIiIO0 I00100l0(int i) {
/* 3 */             int i2 = (i / 3) * 2;
/* 5 */             Object[] objArr = this.I00000oOI;
/* 9 */             OiOIiIO0 oiOIiIO0 = (OiOIiIO0) objArr[i2];
/* 11 */            if (oiOIiIO0 != null) {
/* 13 */                return oiOIiIO0;
                    }
/* 22 */            OiOIiIO0 oiOIiIO0I00000oIO = OOi1lIO1Oi.I0000Il00O.I00000oIO((Class) objArr[i2 + 1]);
/* 26 */            objArr[i2] = oiOIiIO0I00000oIO;
/* 49 */            return oiOIiIO0I00000oIO;
                }

                /* JADX WARN: Removed duplicated region for block: B:69:0x00f0 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:70:0x00f1 A[RETURN] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I00100o1O0lo(int i, Object obj) {
/* 5 */             int i2 = this.I00000oIO[i + 2];
/* 10 */            long j = i2 & 1048575;
/* 20 */            if (j == 1048575) {
/* 22 */                int iI00O0i0ii = I00O0i0ii(i);
/* 26 */                long j2 = iI00O0i0ii & 1048575;
                        switch (I00Iooi00oi(iI00O0i0ii)) {
                            case 0:
                                return Double.doubleToRawLongBits(Ooil11Oi.I0000Il00O.I0000Il00O(j2, obj)) != 0;
                            case 1:
/* 212 */                       if (Float.floatToRawIntBits(Ooil11Oi.I0000Il00O.I0000O(j2, obj)) != 0) {
                                }
                                break;
                            case 2:
/* 199 */                       if (Ooil11Oi.I000OOo1O(j2, obj) != 0) {
                                }
                                break;
                            case 3:
/* 190 */                       if (Ooil11Oi.I000OOo1O(j2, obj) != 0) {
                                }
                                break;
                            case 4:
/* 181 */                       if (Ooil11Oi.I000O01llI0(j2, obj) != 0) {
                                }
                                break;
                            case 5:
/* 174 */                       if (Ooil11Oi.I000OOo1O(j2, obj) != 0) {
                                }
                                break;
                            case 6:
/* 165 */                       if (Ooil11Oi.I000O01llI0(j2, obj) != 0) {
                                }
                                break;
                            case 7:
/* 156 */                       return Ooil11Oi.I0000Il00O.I00000oIO(j2, obj);
                            case 8:
/* 122 */                       Object objI000OiO = Ooil11Oi.I000OiO(j2, obj);
/* 128 */                       if (objI000OiO instanceof String) {
/* 136 */                           return !((String) objI000OiO).isEmpty();
                                }
/* 140 */                       if (objI000OiO instanceof IIOI1Ii1I) {
/* 148 */                           return !IIOI1Ii1I.I00iiI.equals(objI000OiO);
                                }
/* 150 */                       OIiilo1Ool0o.I00100o1O0lo();
/* 18 */                        return false;
                            case 9:
/* 118 */                       if (Ooil11Oi.I000OiO(j2, obj) != null) {
                                }
                                break;
                            case 10:
/* 112 */                       return !IIOI1Ii1I.I00iiI.equals(Ooil11Oi.I000OiO(j2, obj));
                            case 11:
/* 98 */                        if (Ooil11Oi.I000O01llI0(j2, obj) != 0) {
                                }
                                break;
                            case 12:
/* 90 */                        if (Ooil11Oi.I000O01llI0(j2, obj) != 0) {
                                }
                                break;
                            case 13:
/* 82 */                        if (Ooil11Oi.I000O01llI0(j2, obj) != 0) {
                                }
                                break;
                            case 14:
/* 74 */                        if (Ooil11Oi.I000OOo1O(j2, obj) != 0) {
                                }
                                break;
                            case 15:
/* 64 */                        if (Ooil11Oi.I000O01llI0(j2, obj) != 0) {
                                }
                                break;
                            case 16:
/* 56 */                        if (Ooil11Oi.I000OOo1O(j2, obj) != 0) {
                                }
                                break;
                            case 17:
/* 46 */                        if (Ooil11Oi.I000OiO(j2, obj) != null) {
                                }
                                break;
                            default:
/* 38 */                        OIiilo1Ool0o.I00100o1O0lo();
/* 18 */                        return false;
                        }
                    } else if (((1 << (i2 >>> 20)) & Ooil11Oi.I000O01llI0(j, obj)) != 0) {
                    }
                }

                public final boolean I0010o(Object obj, int i, int i2) {
                    return Ooil11Oi.I000O01llI0((long) (this.I00000oIO[i2 + 2] & 1048575), obj) == i;
                }

                public final void I00111O(int i, Object obj, Object obj2) {
/* 8 */             long jI00O0i0ii = I00O0i0ii(i) & 1048575;
/* 10 */            Object objI000OiO = Ooil11Oi.I000OiO(jI00O0i0ii, obj);
/* 14 */            O1Oi10 o1Oi10 = this.I000o00OoI0I;
/* 16 */            if (objI000OiO != null) {
/* 18 */                o1Oi10.getClass();
/* 26 */                if (!((O1OOlii0) objI000OiO).I00iOIl) {
/* 30 */                    Object objI0000Il00O = O1OOlii0.I00iiI.I0000Il00O();
/* 34 */                    O1Oi10.I00000oOI(objI0000Il00O, objI000OiO);
/* 37 */                    Ooil11Oi.I00100o1O0lo(obj, jI00O0i0ii, objI0000Il00O);
/* 40 */                    objI000OiO = objI0000Il00O;
                        }
                    } else {
/* 42 */                o1Oi10.getClass();
/* 47 */                objI000OiO = O1OOlii0.I00iiI.I0000Il00O();
/* 51 */                Ooil11Oi.I00100o1O0lo(obj, jI00O0i0ii, objI000OiO);
                    }
/* 54 */            o1Oi10.getClass();
/* 59 */            IIlIOloOOO.I001i1lo1io(obj2);
/* 215 */           throw null;
                }

                public final void I001IIilI0O(int i, Object obj, Object obj2) {
/* 5 */             if (I00100o1O0lo(i, obj2)) {
/* 15 */                long jI00O0i0ii = I00O0i0ii(i) & 1048575;
/* 17 */                Unsafe unsafe = I00100l0;
/* 19 */                Object object = unsafe.getObject(obj2, jI00O0i0ii);
/* 23 */                if (object == null) {
/* 88 */                    IoOOl0iOl1io.I0000Il00O(this.I00000oIO[i], obj2);
/* 215 */                   return;
                        }
/* 25 */                OiOIiIO0 oiOIiIO0I00100l0 = I00100l0(i);
/* 33 */                if (!I00100o1O0lo(i, obj)) {
/* 39 */                    if (I0010I0i(object)) {
/* 45 */                        Object objI0000O = oiOIiIO0I00100l0.I0000O();
/* 49 */                        oiOIiIO0I00100l0.I00000oIO(objI0000O, object);
/* 52 */                        unsafe.putObject(obj, jI00O0i0ii, objI0000O);
                            } else {
/* 41 */                        unsafe.putObject(obj, jI00O0i0ii, object);
                            }
/* 55 */                    I00Io1lO(i, obj);
/* 58 */                    return;
                        }
/* 59 */                Object object2 = unsafe.getObject(obj, jI00O0i0ii);
/* 67 */                if (!I0010I0i(object2)) {
/* 69 */                    Object objI0000O2 = oiOIiIO0I00100l0.I0000O();
/* 73 */                    oiOIiIO0I00100l0.I00000oIO(objI0000O2, object2);
/* 76 */                    unsafe.putObject(obj, jI00O0i0ii, objI0000O2);
/* 79 */                    object2 = objI0000O2;
                        }
/* 80 */                oiOIiIO0I00100l0.I00000oIO(object2, object);
                    }
                }

                public final void I001IO000(int i, Object obj, Object obj2) {
/* 1 */             int[] iArr = this.I00000oIO;
/* 3 */             int i2 = iArr[i];
/* 9 */             if (I0010o(obj2, i2, i)) {
/* 19 */                long jI00O0i0ii = I00O0i0ii(i) & 1048575;
/* 21 */                Unsafe unsafe = I00100l0;
/* 23 */                Object object = unsafe.getObject(obj2, jI00O0i0ii);
/* 27 */                if (object == null) {
/* 90 */                    IoOOl0iOl1io.I0000Il00O(iArr[i], obj2);
/* 215 */                   return;
                        }
/* 29 */                OiOIiIO0 oiOIiIO0I00100l0 = I00100l0(i);
/* 37 */                if (!I0010o(obj, i2, i)) {
/* 43 */                    if (I0010I0i(object)) {
/* 49 */                        Object objI0000O = oiOIiIO0I00100l0.I0000O();
/* 53 */                        oiOIiIO0I00100l0.I00000oIO(objI0000O, object);
/* 56 */                        unsafe.putObject(obj, jI00O0i0ii, objI0000O);
                            } else {
/* 45 */                        unsafe.putObject(obj, jI00O0i0ii, object);
                            }
/* 59 */                    I00Io1o110i(obj, i2, i);
/* 62 */                    return;
                        }
/* 63 */                Object object2 = unsafe.getObject(obj, jI00O0i0ii);
/* 71 */                if (!I0010I0i(object2)) {
/* 73 */                    Object objI0000O2 = oiOIiIO0I00100l0.I0000O();
/* 77 */                    oiOIiIO0I00100l0.I00000oIO(objI0000O2, object2);
/* 80 */                    unsafe.putObject(obj, jI00O0i0ii, objI0000O2);
/* 83 */                    object2 = objI0000O2;
                        }
/* 84 */                oiOIiIO0I00100l0.I00000oIO(object2, object);
                    }
                }

                public final Object I001i1O0Ol(int i, Object obj) {
/* 1 */             OiOIiIO0 oiOIiIO0I00100l0 = I00100l0(i);
/* 12 */            long jI00O0i0ii = I00O0i0ii(i) & 1048575;
/* 18 */            if (!I00100o1O0lo(i, obj)) {
/* 20 */                return oiOIiIO0I00100l0.I0000O();
                    }
/* 27 */            Object object = I00100l0.getObject(obj, jI00O0i0ii);
/* 35 */            if (I0010I0i(object)) {
/* 37 */                return object;
                    }
/* 38 */            Object objI0000O = oiOIiIO0I00100l0.I0000O();
/* 42 */            if (object != null) {
/* 44 */                oiOIiIO0I00100l0.I00000oIO(objI0000O, object);
                    }
/* 89 */            return objI0000O;
                }

                public final Object I001i1lo1io(Object obj, int i, int i2) {
/* 1 */             OiOIiIO0 oiOIiIO0I00100l0 = I00100l0(i2);
/* 9 */             if (!I0010o(obj, i, i2)) {
/* 11 */                return oiOIiIO0I00100l0.I0000O();
                    }
/* 27 */            Object object = I00100l0.getObject(obj, I00O0i0ii(i2) & 1048575);
/* 35 */            if (I0010I0i(object)) {
/* 37 */                return object;
                    }
/* 38 */            Object objI0000O = oiOIiIO0I00100l0.I0000O();
/* 42 */            if (object != null) {
/* 44 */                oiOIiIO0I00100l0.I00000oIO(objI0000O, object);
                    }
/* 215 */           return objI0000O;
                }

                public final void I001lloI(Object obj, int i, long j) {
/* 1 */             Object objI000oI1ioi = I000oI1ioi(i);
/* 5 */             Unsafe unsafe = I00100l0;
/* 7 */             Object object = unsafe.getObject(obj, j);
/* 13 */            this.I000o00OoI0I.getClass();
/* 21 */            if (!((O1OOlii0) object).I00iOIl) {
/* 25 */                O1OOlii0 o1OOlii0I0000Il00O = O1OOlii0.I00iiI.I0000Il00O();
/* 29 */                O1Oi10.I00000oOI(o1OOlii0I0000Il00O, object);
/* 32 */                unsafe.putObject(obj, j, o1OOlii0I0000Il00O);
                    }
/* 35 */            IIlIOloOOO.I001i1lo1io(objI000oI1ioi);
/* 215 */           throw null;
                }

                public final int I00II0Ol1O0l(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, I1Il011OO i1Il011OO) throws O000oiiiOI0 {
                    int i9;
/* 1 */             long j2 = this.I00000oIO[i8 + 2] & 1048575;
/* 2 */             Unsafe unsafe = I00100l0;
                    switch (i7) {
                        case 51:
                            if (i5 != 1) {
                                return i;
                            }
/* 52 */                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(iOO1IIO0.I0000Il00O(i, bArr))));
                            int i10 = i + 8;
/* 53 */                    unsafe.putInt(obj, j2, i4);
                            return i10;
                        case 52:
                            if (i5 != 5) {
                                return i;
                            }
/* 49 */                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(iOO1IIO0.I00000oOI(i, bArr))));
                            int i11 = i + 4;
/* 50 */                    unsafe.putInt(obj, j2, i4);
                            return i11;
                        case 53:
                        case 54:
                            if (i5 != 0) {
                                return i;
                            }
/* 45 */                    int iI000iOII = iOO1IIO0.I000iOII(bArr, i, i1Il011OO);
/* 46 */                    unsafe.putObject(obj, j, Long.valueOf(i1Il011OO.I00000oOI));
/* 47 */                    unsafe.putInt(obj, j2, i4);
                            return iI000iOII;
                        case 55:
                        case 62:
                            if (i5 != 0) {
                                return i;
                            }
/* 42 */                    int iI000OOo1O = iOO1IIO0.I000OOo1O(bArr, i, i1Il011OO);
/* 43 */                    unsafe.putObject(obj, j, Integer.valueOf(i1Il011OO.I00000oIO));
/* 44 */                    unsafe.putInt(obj, j2, i4);
                            return iI000OOo1O;
                        case 56:
                        case 65:
                            if (i5 != 1) {
                                return i;
                            }
/* 40 */                    unsafe.putObject(obj, j, Long.valueOf(iOO1IIO0.I0000Il00O(i, bArr)));
                            int i12 = i + 8;
/* 41 */                    unsafe.putInt(obj, j2, i4);
                            return i12;
                        case 57:
                        case Barcode.FORMAT_EAN_8:
                            if (i5 != 5) {
                                return i;
                            }
/* 38 */                    unsafe.putObject(obj, j, Integer.valueOf(iOO1IIO0.I00000oOI(i, bArr)));
                            int i13 = i + 4;
/* 39 */                    unsafe.putInt(obj, j2, i4);
                            return i13;
                        case 58:
                            if (i5 != 0) {
                                return i;
                            }
/* 35 */                    int iI000iOII2 = iOO1IIO0.I000iOII(bArr, i, i1Il011OO);
                            unsafe.putObject(obj, j, Boolean.valueOf(i1Il011OO.I00000oOI != 0));
/* 37 */                    unsafe.putInt(obj, j2, i4);
                            return iI000iOII2;
                        case 59:
                            if (i5 != 2) {
                                return i;
                            }
/* 27 */                    int iI000OOo1O2 = iOO1IIO0.I000OOo1O(bArr, i, i1Il011OO);
/* 28 */                    int i14 = i1Il011OO.I00000oIO;
                            if (i14 == 0) {
/* 29 */                        unsafe.putObject(obj, j, "");
                            } else {
                                if ((i6 & 536870912) != 0) {
                                    if (!Oolio1l.I00000oIO.I0000Il00O(bArr, iI000OOo1O2, iI000OOo1O2 + i14)) {
/* 31 */                                throw O000oiiiOI0.I00000oOI();
                                    }
                                }
/* 33 */                        unsafe.putObject(obj, j, new String(bArr, iI000OOo1O2, i14, Iool1iOO11.I00000oIO));
                                iI000OOo1O2 += i14;
                            }
/* 34 */                    unsafe.putInt(obj, j2, i4);
                            return iI000OOo1O2;
                        case 60:
                            i9 = i;
                            if (i5 == 2) {
/* 23 */                        Object objI001i1lo1io = I001i1lo1io(obj, i4, i8);
/* 25 */                        int iI000l1 = iOO1IIO0.I000l1(objI001i1lo1io, I00100l0(i8), bArr, i9, i2, i1Il011OO);
/* 26 */                        I00IoiI(obj, i4, i8, objI001i1lo1io);
                                return iI000l1;
                            }
                            return i9;
                        case 61:
                            i9 = i;
                            if (i5 == 2) {
/* 20 */                        int iI00000oIO = iOO1IIO0.I00000oIO(bArr, i9, i1Il011OO);
/* 21 */                        unsafe.putObject(obj, j, i1Il011OO.I0000Il00O);
/* 22 */                        unsafe.putInt(obj, j2, i4);
                                return iI00000oIO;
                            }
                            return i9;
                        case 63:
                            i9 = i;
                            if (i5 == 0) {
/* 15 */                        int iI000OOo1O3 = iOO1IIO0.I000OOo1O(bArr, i9, i1Il011OO);
/* 16 */                        int i15 = i1Il011OO.I00000oIO;
/* 17 */                        I000o00OoI0I(i8);
/* 18 */                        unsafe.putObject(obj, j, Integer.valueOf(i15));
/* 19 */                        unsafe.putInt(obj, j2, i4);
                                return iI000OOo1O3;
                            }
                            return i9;
                        case 66:
                            i9 = i;
                            if (i5 == 0) {
/* 12 */                        int iI000OOo1O4 = iOO1IIO0.I000OOo1O(bArr, i9, i1Il011OO);
/* 13 */                        unsafe.putObject(obj, j, Integer.valueOf(IOOOI0.I0000O(i1Il011OO.I00000oIO)));
/* 14 */                        unsafe.putInt(obj, j2, i4);
                                return iI000OOo1O4;
                            }
                            return i9;
                        case 67:
                            i9 = i;
                            if (i5 == 0) {
/* 9 */                         int iI000iOII3 = iOO1IIO0.I000iOII(bArr, i9, i1Il011OO);
/* 10 */                        unsafe.putObject(obj, j, Long.valueOf(IOOOI0.I0000oI00(i1Il011OO.I00000oOI)));
/* 11 */                        unsafe.putInt(obj, j2, i4);
                                return iI000iOII3;
                            }
                            return i9;
                        case 68:
                            if (i5 == 3) {
/* 3 */                         Object objI001i1lo1io2 = I001i1lo1io(obj, i4, i8);
/* 6 */                         int iI00II0oii1o = ((O1lIoI) I00100l0(i8)).I00II0oii1o(objI001i1lo1io2, bArr, i, i2, (i3 & (-8)) | 4, i1Il011OO);
/* 7 */                         i1Il011OO.I0000Il00O = objI001i1lo1io2;
/* 8 */                         I00IoiI(obj, i4, i8, objI001i1lo1io2);
                                return iI00II0oii1o;
                            }
                        default:
                            return i;
                    }
                }

                public final int I00II0oii1o(Object obj, byte[] bArr, int i, int i2, int i3, I1Il011OO i1Il011OO) throws O000oiiiOI0 {
                    O1lIoI o1lIoI;
                    Object obj2;
                    Unsafe unsafe;
                    int i4;
                    Object obj3;
                    int i5;
                    int i6;
                    int iI00IoIO0lI;
                    int i7;
                    int i8;
                    int[] iArr;
                    int i9;
                    I1Il011OO i1Il011OO2;
                    int i10;
                    int i11;
                    int i12;
                    Unsafe unsafe2;
                    boolean z;
                    byte[] bArr2;
                    I1Il011OO i1Il011OO3;
                    Unsafe unsafe3;
                    Object obj4;
                    Unsafe unsafe4;
                    byte[] bArr3;
                    int iI000iOII;
                    byte[] bArr4;
                    Unsafe unsafe5;
                    I1Il011OO i1Il011OO4;
                    int i13;
                    int iI00000oIO;
                    int i14;
                    Object obj5;
                    int i15;
                    int i16;
                    int i17;
/* 1 */             O1lIoI o1lIoI2 = this;
/* 3 */             Object obj6 = obj;
/* 5 */             byte[] bArr5 = bArr;
/* 7 */             int i18 = i2;
/* 11 */            I1Il011OO i1Il011OO5 = i1Il011OO;
/* 13 */            int i19 = o1lIoI2.I0000O;
/* 15 */            int[] iArr2 = o1lIoI2.I00000oIO;
/* 17 */            I000l1(obj6);
/* 20 */            int iI000OOo1O = i;
/* 22 */            int i20 = -1;
/* 23 */            int i21 = 0;
/* 24 */            int i22 = 1048575;
/* 27 */            int i23 = 0;
/* 28 */            int i24 = 0;
/* 30 */            int i25 = 1048575;
                    while (true) {
/* 33 */                Unsafe unsafe6 = I00100l0;
/* 35 */                if (iI000OOo1O < i18) {
/* 37 */                    int iI000O01llI0 = iI000OOo1O + 1;
/* 39 */                    int i26 = bArr5[iI000OOo1O];
/* 41 */                    if (i26 < 0) {
/* 43 */                        iI000O01llI0 = iOO1IIO0.I000O01llI0(i26, bArr5, iI000O01llI0, i1Il011OO5);
/* 47 */                        i26 = i1Il011OO5.I00000oIO;
                            }
/* 49 */                    i24 = i26;
/* 51 */                    int i27 = i24 >>> 3;
/* 53 */                    int i28 = i24 & 7;
/* 55 */                    int i29 = iI000O01llI0;
/* 57 */                    int i30 = o1lIoI2.I0000Il00O;
/* 60 */                    if (i27 > i20) {
/* 72 */                        iI00IoIO0lI = (i27 < i30 || i27 > i19) ? -1 : o1lIoI2.I00IoIO0lI(i27, i21 / 3);
/* 74 */                        i6 = 0;
                            } else if (i27 < i30 || i27 > i19) {
/* 87 */                        i6 = 0;
/* 88 */                        iI00IoIO0lI = -1;
                            } else {
/* 81 */                        i6 = 0;
/* 82 */                        iI00IoIO0lI = o1lIoI2.I00IoIO0lI(i27, 0);
                            }
/* 90 */                    if (iI00IoIO0lI == -1) {
/* 92 */                        int i31 = i25;
/* 94 */                        i7 = i27;
/* 96 */                        iI000OOo1O = i29;
/* 98 */                        i8 = i19;
/* 100 */                       i4 = i31;
/* 102 */                       o1lIoI = o1lIoI2;
/* 107 */                       iArr = iArr2;
/* 109 */                       unsafe = unsafe6;
/* 111 */                       obj3 = null;
/* 113 */                       i21 = i6;
/* 115 */                       obj2 = obj6;
/* 116 */                       i5 = i24;
                            } else {
/* 122 */                       int i32 = iArr2[iI00IoIO0lI + 1];
/* 124 */                       int[] iArr3 = iArr2;
/* 126 */                       int iI00Iooi00oi = I00Iooi00oi(i32);
/* 130 */                       long j = i32 & i25;
/* 137 */                       if (iI00Iooi00oi <= 17) {
/* 141 */                           int i33 = iArr3[iI00IoIO0lI + 2];
/* 146 */                           int i34 = 1 << (i33 >>> 20);
/* 148 */                           int i35 = i33 & i25;
/* 150 */                           if (i35 != i22) {
/* 154 */                               if (i22 != i25) {
/* 157 */                                   unsafe6.putInt(obj6, i22, i23);
                                        }
/* 161 */                               i23 = unsafe6.getInt(obj6, i35);
/* 165 */                               i9 = i35;
                                    } else {
/* 170 */                               i9 = i22;
                                    }
/* 167 */                           int i36 = i23;
                                    switch (iI00Iooi00oi) {
                                        case 0:
/* 798 */                                   bArr2 = bArr;
/* 800 */                                   i7 = i27;
/* 802 */                                   unsafe2 = unsafe6;
/* 803 */                                   i1Il011OO3 = i1Il011OO5;
/* 804 */                                   i12 = i29;
/* 808 */                                   z = false;
/* 810 */                                   i10 = 1048575;
/* 815 */                                   i11 = iI00IoIO0lI;
/* 816 */                                   if (i28 == 1) {
/* 829 */                                       Ooil11Oi.I0000Il00O.I000II(obj6, j, Double.longBitsToDouble(iOO1IIO0.I0000Il00O(i12, bArr2)));
/* 683 */                                       iI000OOo1O = i12 + 8;
/* 685 */                                       i23 = i36 | i34;
/* 687 */                                       i18 = i2;
/* 689 */                                       bArr5 = bArr2;
/* 510 */                                       i21 = i11;
/* 511 */                                       i20 = i7;
/* 513 */                                       iArr2 = iArr3;
/* 515 */                                       i25 = i10;
/* 517 */                                       i22 = i9;
/* 519 */                                       i1Il011OO5 = i1Il011OO3;
                                                break;
                                            } else {
/* 834 */                                       int i37 = i10;
/* 836 */                                       i8 = i19;
/* 838 */                                       i4 = i37;
/* 840 */                                       o1lIoI = o1lIoI2;
/* 841 */                                       obj2 = obj6;
/* 842 */                                       unsafe = unsafe2;
/* 844 */                                       iI000OOo1O = i12;
/* 845 */                                       i21 = i11;
/* 846 */                                       i5 = i24;
/* 850 */                                       i22 = i9;
/* 852 */                                       i23 = i36;
/* 854 */                                       obj3 = null;
/* 856 */                                       iArr = iArr3;
                                                break;
                                            }
                                        case 1:
/* 762 */                                   bArr2 = bArr;
/* 764 */                                   i7 = i27;
/* 766 */                                   unsafe2 = unsafe6;
/* 767 */                                   i1Il011OO3 = i1Il011OO5;
/* 768 */                                   i12 = i29;
/* 772 */                                   z = false;
/* 774 */                                   i10 = 1048575;
/* 779 */                                   i11 = iI00IoIO0lI;
/* 780 */                                   if (i28 == 5) {
/* 792 */                                       Ooil11Oi.I0000Il00O.I000O01llI0(obj6, j, Float.intBitsToFloat(iOO1IIO0.I00000oOI(i12, bArr2)));
/* 795 */                                       iI000OOo1O = i12 + 4;
/* 685 */                                       i23 = i36 | i34;
/* 687 */                                       i18 = i2;
/* 689 */                                       bArr5 = bArr2;
/* 510 */                                       i21 = i11;
/* 511 */                                       i20 = i7;
/* 513 */                                       iArr2 = iArr3;
/* 515 */                                       i25 = i10;
/* 517 */                                       i22 = i9;
/* 519 */                                       i1Il011OO5 = i1Il011OO3;
                                                break;
                                            } else {
/* 834 */                                       int i372 = i10;
/* 836 */                                       i8 = i19;
/* 838 */                                       i4 = i372;
/* 840 */                                       o1lIoI = o1lIoI2;
/* 841 */                                       obj2 = obj6;
/* 842 */                                       unsafe = unsafe2;
/* 844 */                                       iI000OOo1O = i12;
/* 845 */                                       i21 = i11;
/* 846 */                                       i5 = i24;
/* 850 */                                       i22 = i9;
/* 852 */                                       i23 = i36;
/* 854 */                                       obj3 = null;
/* 856 */                                       iArr = iArr3;
                                                break;
                                            }
                                        case 2:
                                        case 3:
/* 727 */                                   i7 = i27;
/* 729 */                                   unsafe3 = unsafe6;
/* 730 */                                   i1Il011OO3 = i1Il011OO5;
/* 731 */                                   i12 = i29;
/* 735 */                                   z = false;
/* 737 */                                   i10 = 1048575;
/* 742 */                                   i11 = iI00IoIO0lI;
/* 743 */                                   if (i28 == 0) {
/* 745 */                                       int iI000iOII2 = iOO1IIO0.I000iOII(bArr, i12, i1Il011OO3);
/* 751 */                                       unsafe3.putLong(obj6, j, i1Il011OO3.I00000oOI);
/* 754 */                                       i23 = i36 | i34;
/* 756 */                                       i18 = i2;
/* 758 */                                       bArr5 = bArr;
/* 759 */                                       iI000OOo1O = iI000iOII2;
/* 510 */                                       i21 = i11;
/* 511 */                                       i20 = i7;
/* 513 */                                       iArr2 = iArr3;
/* 515 */                                       i25 = i10;
/* 517 */                                       i22 = i9;
/* 519 */                                       i1Il011OO5 = i1Il011OO3;
                                                break;
                                            } else {
/* 722 */                                       unsafe2 = unsafe3;
/* 834 */                                       int i3722 = i10;
/* 836 */                                       i8 = i19;
/* 838 */                                       i4 = i3722;
/* 840 */                                       o1lIoI = o1lIoI2;
/* 841 */                                       obj2 = obj6;
/* 842 */                                       unsafe = unsafe2;
/* 844 */                                       iI000OOo1O = i12;
/* 845 */                                       i21 = i11;
/* 846 */                                       i5 = i24;
/* 850 */                                       i22 = i9;
/* 852 */                                       i23 = i36;
/* 854 */                                       obj3 = null;
/* 856 */                                       iArr = iArr3;
                                                break;
                                            }
                                        case 4:
                                        case 11:
/* 692 */                                   bArr2 = bArr;
/* 694 */                                   i7 = i27;
/* 696 */                                   unsafe3 = unsafe6;
/* 697 */                                   i1Il011OO3 = i1Il011OO5;
/* 698 */                                   i12 = i29;
/* 702 */                                   z = false;
/* 704 */                                   i10 = 1048575;
/* 709 */                                   i11 = iI00IoIO0lI;
/* 710 */                                   if (i28 == 0) {
/* 712 */                                       iI000OOo1O = iOO1IIO0.I000OOo1O(bArr2, i12, i1Il011OO3);
/* 718 */                                       unsafe3.putInt(obj6, j, i1Il011OO3.I00000oIO);
/* 685 */                                       i23 = i36 | i34;
/* 687 */                                       i18 = i2;
/* 689 */                                       bArr5 = bArr2;
/* 510 */                                       i21 = i11;
/* 511 */                                       i20 = i7;
/* 513 */                                       iArr2 = iArr3;
/* 515 */                                       i25 = i10;
/* 517 */                                       i22 = i9;
/* 519 */                                       i1Il011OO5 = i1Il011OO3;
                                                break;
                                            } else {
/* 722 */                                       unsafe2 = unsafe3;
/* 834 */                                       int i37222 = i10;
/* 836 */                                       i8 = i19;
/* 838 */                                       i4 = i37222;
/* 840 */                                       o1lIoI = o1lIoI2;
/* 841 */                                       obj2 = obj6;
/* 842 */                                       unsafe = unsafe2;
/* 844 */                                       iI000OOo1O = i12;
/* 845 */                                       i21 = i11;
/* 846 */                                       i5 = i24;
/* 850 */                                       i22 = i9;
/* 852 */                                       i23 = i36;
/* 854 */                                       obj3 = null;
/* 856 */                                       iArr = iArr3;
                                                break;
                                            }
                                        case 5:
                                        case 14:
/* 652 */                                   bArr2 = bArr;
/* 654 */                                   obj4 = obj6;
/* 655 */                                   i7 = i27;
/* 657 */                                   unsafe4 = unsafe6;
/* 658 */                                   i1Il011OO3 = i1Il011OO5;
/* 659 */                                   i12 = i29;
/* 661 */                                   z = false;
/* 663 */                                   i10 = 1048575;
/* 668 */                                   i11 = iI00IoIO0lI;
/* 671 */                                   if (i28 == 1) {
/* 679 */                                       obj6 = obj4;
/* 680 */                                       unsafe4.putLong(obj6, j, iOO1IIO0.I0000Il00O(i12, bArr2));
/* 683 */                                       iI000OOo1O = i12 + 8;
/* 685 */                                       i23 = i36 | i34;
/* 687 */                                       i18 = i2;
/* 689 */                                       bArr5 = bArr2;
/* 510 */                                       i21 = i11;
/* 511 */                                       i20 = i7;
/* 513 */                                       iArr2 = iArr3;
/* 515 */                                       i25 = i10;
/* 517 */                                       i22 = i9;
/* 519 */                                       i1Il011OO5 = i1Il011OO3;
                                                break;
                                            } else {
/* 524 */                                       unsafe2 = unsafe4;
/* 394 */                                       obj6 = obj4;
/* 834 */                                       int i372222 = i10;
/* 836 */                                       i8 = i19;
/* 838 */                                       i4 = i372222;
/* 840 */                                       o1lIoI = o1lIoI2;
/* 841 */                                       obj2 = obj6;
/* 842 */                                       unsafe = unsafe2;
/* 844 */                                       iI000OOo1O = i12;
/* 845 */                                       i21 = i11;
/* 846 */                                       i5 = i24;
/* 850 */                                       i22 = i9;
/* 852 */                                       i23 = i36;
/* 854 */                                       obj3 = null;
/* 856 */                                       iArr = iArr3;
                                                break;
                                            }
                                        case 6:
                                        case 13:
/* 617 */                                   bArr3 = bArr;
/* 619 */                                   obj4 = obj6;
/* 620 */                                   i7 = i27;
/* 622 */                                   unsafe4 = unsafe6;
/* 623 */                                   i1Il011OO3 = i1Il011OO5;
/* 624 */                                   i12 = i29;
/* 626 */                                   z = false;
/* 628 */                                   i10 = 1048575;
/* 633 */                                   i11 = iI00IoIO0lI;
/* 636 */                                   if (i28 == 5) {
/* 642 */                                       unsafe4.putInt(obj4, j, iOO1IIO0.I00000oOI(i12, bArr3));
/* 645 */                                       iI000OOo1O = i12 + 4;
/* 647 */                                       i23 = i36 | i34;
/* 649 */                                       i18 = i2;
/* 573 */                                       bArr5 = bArr3;
/* 509 */                                       obj6 = obj4;
/* 510 */                                       i21 = i11;
/* 511 */                                       i20 = i7;
/* 513 */                                       iArr2 = iArr3;
/* 515 */                                       i25 = i10;
/* 517 */                                       i22 = i9;
/* 519 */                                       i1Il011OO5 = i1Il011OO3;
                                                break;
                                            } else {
/* 524 */                                       unsafe2 = unsafe4;
/* 394 */                                       obj6 = obj4;
/* 834 */                                       int i3722222 = i10;
/* 836 */                                       i8 = i19;
/* 838 */                                       i4 = i3722222;
/* 840 */                                       o1lIoI = o1lIoI2;
/* 841 */                                       obj2 = obj6;
/* 842 */                                       unsafe = unsafe2;
/* 844 */                                       iI000OOo1O = i12;
/* 845 */                                       i21 = i11;
/* 846 */                                       i5 = i24;
/* 850 */                                       i22 = i9;
/* 852 */                                       i23 = i36;
/* 854 */                                       obj3 = null;
/* 856 */                                       iArr = iArr3;
                                                break;
                                            }
                                        case 7:
/* 575 */                                   bArr3 = bArr;
/* 577 */                                   obj4 = obj6;
/* 578 */                                   i7 = i27;
/* 580 */                                   unsafe4 = unsafe6;
/* 581 */                                   i1Il011OO3 = i1Il011OO5;
/* 582 */                                   i12 = i29;
/* 584 */                                   z = false;
/* 586 */                                   i10 = 1048575;
/* 591 */                                   i11 = iI00IoIO0lI;
/* 594 */                                   if (i28 == 0) {
/* 596 */                                       iI000iOII = iOO1IIO0.I000iOII(bArr3, i12, i1Il011OO3);
/* 613 */                                       Ooil11Oi.I0000Il00O.I0000oI00(obj4, j, i1Il011OO3.I00000oOI != 0);
/* 568 */                                       i23 = i36 | i34;
/* 570 */                                       i18 = i2;
/* 572 */                                       iI000OOo1O = iI000iOII;
/* 573 */                                       bArr5 = bArr3;
/* 509 */                                       obj6 = obj4;
/* 510 */                                       i21 = i11;
/* 511 */                                       i20 = i7;
/* 513 */                                       iArr2 = iArr3;
/* 515 */                                       i25 = i10;
/* 517 */                                       i22 = i9;
/* 519 */                                       i1Il011OO5 = i1Il011OO3;
                                                break;
                                            } else {
/* 524 */                                       unsafe2 = unsafe4;
/* 394 */                                       obj6 = obj4;
/* 834 */                                       int i37222222 = i10;
/* 836 */                                       i8 = i19;
/* 838 */                                       i4 = i37222222;
/* 840 */                                       o1lIoI = o1lIoI2;
/* 841 */                                       obj2 = obj6;
/* 842 */                                       unsafe = unsafe2;
/* 844 */                                       iI000OOo1O = i12;
/* 845 */                                       i21 = i11;
/* 846 */                                       i5 = i24;
/* 850 */                                       i22 = i9;
/* 852 */                                       i23 = i36;
/* 854 */                                       obj3 = null;
/* 856 */                                       iArr = iArr3;
                                                break;
                                            }
                                        case 8:
/* 527 */                                   bArr3 = bArr;
/* 529 */                                   obj4 = obj6;
/* 530 */                                   i7 = i27;
/* 532 */                                   unsafe4 = unsafe6;
/* 533 */                                   i1Il011OO3 = i1Il011OO5;
/* 534 */                                   i12 = i29;
/* 537 */                                   z = false;
/* 539 */                                   i10 = 1048575;
/* 544 */                                   i11 = iI00IoIO0lI;
/* 547 */                                   if (i28 == 2) {
/* 559 */                                       iI000iOII = (i32 & 536870912) == 0 ? iOO1IIO0.I0000oI00(bArr3, i12, i1Il011OO3) : iOO1IIO0.I0001Ioi1lo(bArr3, i12, i1Il011OO3);
/* 565 */                                       unsafe4.putObject(obj4, j, i1Il011OO3.I0000Il00O);
/* 568 */                                       i23 = i36 | i34;
/* 570 */                                       i18 = i2;
/* 572 */                                       iI000OOo1O = iI000iOII;
/* 573 */                                       bArr5 = bArr3;
/* 509 */                                       obj6 = obj4;
/* 510 */                                       i21 = i11;
/* 511 */                                       i20 = i7;
/* 513 */                                       iArr2 = iArr3;
/* 515 */                                       i25 = i10;
/* 517 */                                       i22 = i9;
/* 519 */                                       i1Il011OO5 = i1Il011OO3;
                                                break;
                                            } else {
/* 524 */                                       unsafe2 = unsafe4;
/* 394 */                                       obj6 = obj4;
/* 834 */                                       int i372222222 = i10;
/* 836 */                                       i8 = i19;
/* 838 */                                       i4 = i372222222;
/* 840 */                                       o1lIoI = o1lIoI2;
/* 841 */                                       obj2 = obj6;
/* 842 */                                       unsafe = unsafe2;
/* 844 */                                       iI000OOo1O = i12;
/* 845 */                                       i21 = i11;
/* 846 */                                       i5 = i24;
/* 850 */                                       i22 = i9;
/* 852 */                                       i23 = i36;
/* 854 */                                       obj3 = null;
/* 856 */                                       iArr = iArr3;
                                                break;
                                            }
                                        case 9:
/* 465 */                                   obj4 = obj6;
/* 466 */                                   i7 = i27;
/* 468 */                                   unsafe4 = unsafe6;
/* 469 */                                   I1Il011OO i1Il011OO6 = i1Il011OO5;
/* 473 */                                   z = false;
/* 475 */                                   i10 = 1048575;
/* 480 */                                   i11 = iI00IoIO0lI;
/* 481 */                                   if (i28 == 2) {
/* 483 */                                       Object objI001i1O0Ol = o1lIoI2.I001i1O0Ol(i11, obj4);
/* 494 */                                       bArr5 = bArr;
/* 496 */                                       int iI000l1 = iOO1IIO0.I000l1(objI001i1O0Ol, o1lIoI2.I00100l0(i11), bArr5, i29, i2, i1Il011OO6);
/* 500 */                                       i1Il011OO3 = i1Il011OO6;
/* 501 */                                       o1lIoI2.I00IoO0(i11, obj4, objI001i1O0Ol);
/* 504 */                                       i23 = i36 | i34;
/* 506 */                                       i18 = i2;
/* 508 */                                       iI000OOo1O = iI000l1;
/* 509 */                                       obj6 = obj4;
/* 510 */                                       i21 = i11;
/* 511 */                                       i20 = i7;
/* 513 */                                       iArr2 = iArr3;
/* 515 */                                       i25 = i10;
/* 517 */                                       i22 = i9;
/* 519 */                                       i1Il011OO5 = i1Il011OO3;
                                                break;
                                            } else {
/* 522 */                                       i12 = i29;
/* 524 */                                       unsafe2 = unsafe4;
/* 394 */                                       obj6 = obj4;
/* 834 */                                       int i3722222222 = i10;
/* 836 */                                       i8 = i19;
/* 838 */                                       i4 = i3722222222;
/* 840 */                                       o1lIoI = o1lIoI2;
/* 841 */                                       obj2 = obj6;
/* 842 */                                       unsafe = unsafe2;
/* 844 */                                       iI000OOo1O = i12;
/* 845 */                                       i21 = i11;
/* 846 */                                       i5 = i24;
/* 850 */                                       i22 = i9;
/* 852 */                                       i23 = i36;
/* 854 */                                       obj3 = null;
/* 856 */                                       iArr = iArr3;
                                                break;
                                            }
                                        case 10:
/* 431 */                                   bArr4 = bArr;
/* 433 */                                   obj4 = obj6;
/* 434 */                                   i7 = i27;
/* 436 */                                   unsafe5 = unsafe6;
/* 437 */                                   i1Il011OO4 = i1Il011OO5;
/* 438 */                                   i13 = i29;
/* 441 */                                   z = false;
/* 443 */                                   i10 = 1048575;
/* 448 */                                   i11 = iI00IoIO0lI;
/* 451 */                                   if (i28 == 2) {
/* 453 */                                       iI00000oIO = iOO1IIO0.I00000oIO(bArr4, i13, i1Il011OO4);
/* 459 */                                       unsafe5.putObject(obj4, j, i1Il011OO4.I0000Il00O);
/* 373 */                                       i18 = i2;
/* 375 */                                       iI000OOo1O = iI00000oIO;
/* 376 */                                       bArr5 = bArr4;
/* 377 */                                       i21 = i11;
/* 378 */                                       i20 = i7;
/* 380 */                                       i25 = i10;
/* 382 */                                       i22 = i9;
/* 384 */                                       i1Il011OO5 = i1Il011OO4;
/* 371 */                                       i23 = i36 | i34;
/* 386 */                                       obj6 = obj4;
/* 387 */                                       iArr2 = iArr3;
                                                break;
                                            } else {
/* 391 */                                       unsafe2 = unsafe5;
/* 392 */                                       i12 = i13;
/* 394 */                                       obj6 = obj4;
/* 834 */                                       int i37222222222 = i10;
/* 836 */                                       i8 = i19;
/* 838 */                                       i4 = i37222222222;
/* 840 */                                       o1lIoI = o1lIoI2;
/* 841 */                                       obj2 = obj6;
/* 842 */                                       unsafe = unsafe2;
/* 844 */                                       iI000OOo1O = i12;
/* 845 */                                       i21 = i11;
/* 846 */                                       i5 = i24;
/* 850 */                                       i22 = i9;
/* 852 */                                       i23 = i36;
/* 854 */                                       obj3 = null;
/* 856 */                                       iArr = iArr3;
                                                break;
                                            }
                                        case 12:
/* 397 */                                   bArr4 = bArr;
/* 399 */                                   obj4 = obj6;
/* 400 */                                   i7 = i27;
/* 402 */                                   unsafe5 = unsafe6;
/* 403 */                                   i1Il011OO4 = i1Il011OO5;
/* 404 */                                   i13 = i29;
/* 406 */                                   z = false;
/* 408 */                                   i10 = 1048575;
/* 413 */                                   i11 = iI00IoIO0lI;
/* 416 */                                   if (i28 == 0) {
/* 418 */                                       iI00000oIO = iOO1IIO0.I000OOo1O(bArr4, i13, i1Il011OO4);
/* 422 */                                       int i38 = i1Il011OO4.I00000oIO;
/* 424 */                                       o1lIoI2.I000o00OoI0I(i11);
/* 427 */                                       unsafe5.putInt(obj4, j, i38);
/* 373 */                                       i18 = i2;
/* 375 */                                       iI000OOo1O = iI00000oIO;
/* 376 */                                       bArr5 = bArr4;
/* 377 */                                       i21 = i11;
/* 378 */                                       i20 = i7;
/* 380 */                                       i25 = i10;
/* 382 */                                       i22 = i9;
/* 384 */                                       i1Il011OO5 = i1Il011OO4;
/* 371 */                                       i23 = i36 | i34;
/* 386 */                                       obj6 = obj4;
/* 387 */                                       iArr2 = iArr3;
                                                break;
                                            } else {
/* 391 */                                       unsafe2 = unsafe5;
/* 392 */                                       i12 = i13;
/* 394 */                                       obj6 = obj4;
/* 834 */                                       int i372222222222 = i10;
/* 836 */                                       i8 = i19;
/* 838 */                                       i4 = i372222222222;
/* 840 */                                       o1lIoI = o1lIoI2;
/* 841 */                                       obj2 = obj6;
/* 842 */                                       unsafe = unsafe2;
/* 844 */                                       iI000OOo1O = i12;
/* 845 */                                       i21 = i11;
/* 846 */                                       i5 = i24;
/* 850 */                                       i22 = i9;
/* 852 */                                       i23 = i36;
/* 854 */                                       obj3 = null;
/* 856 */                                       iArr = iArr3;
                                                break;
                                            }
                                        case 15:
/* 337 */                                   bArr4 = bArr;
/* 339 */                                   obj4 = obj6;
/* 340 */                                   i7 = i27;
/* 342 */                                   unsafe5 = unsafe6;
/* 343 */                                   i1Il011OO4 = i1Il011OO5;
/* 344 */                                   i13 = i29;
/* 346 */                                   z = false;
/* 348 */                                   i10 = 1048575;
/* 353 */                                   i11 = iI00IoIO0lI;
/* 356 */                                   if (i28 == 0) {
/* 358 */                                       iI00000oIO = iOO1IIO0.I000OOo1O(bArr4, i13, i1Il011OO4);
/* 368 */                                       unsafe5.putInt(obj4, j, IOOOI0.I0000O(i1Il011OO4.I00000oIO));
/* 373 */                                       i18 = i2;
/* 375 */                                       iI000OOo1O = iI00000oIO;
/* 376 */                                       bArr5 = bArr4;
/* 377 */                                       i21 = i11;
/* 378 */                                       i20 = i7;
/* 380 */                                       i25 = i10;
/* 382 */                                       i22 = i9;
/* 384 */                                       i1Il011OO5 = i1Il011OO4;
/* 371 */                                       i23 = i36 | i34;
/* 386 */                                       obj6 = obj4;
/* 387 */                                       iArr2 = iArr3;
                                                break;
                                            } else {
/* 391 */                                       unsafe2 = unsafe5;
/* 392 */                                       i12 = i13;
/* 394 */                                       obj6 = obj4;
/* 834 */                                       int i3722222222222 = i10;
/* 836 */                                       i8 = i19;
/* 838 */                                       i4 = i3722222222222;
/* 840 */                                       o1lIoI = o1lIoI2;
/* 841 */                                       obj2 = obj6;
/* 842 */                                       unsafe = unsafe2;
/* 844 */                                       iI000OOo1O = i12;
/* 845 */                                       i21 = i11;
/* 846 */                                       i5 = i24;
/* 850 */                                       i22 = i9;
/* 852 */                                       i23 = i36;
/* 854 */                                       obj3 = null;
/* 856 */                                       iArr = iArr3;
                                                break;
                                            }
                                        case 16:
/* 280 */                                   i7 = i27;
/* 282 */                                   i1Il011OO2 = i1Il011OO5;
/* 285 */                                   i10 = 1048575;
/* 290 */                                   i11 = iI00IoIO0lI;
/* 291 */                                   if (i28 == 0) {
/* 293 */                                       int iI000iOII3 = iOO1IIO0.I000iOII(bArr, i29, i1Il011OO2);
/* 308 */                                       unsafe6.putLong(obj6, j, IOOOI0.I0000oI00(i1Il011OO2.I00000oOI));
/* 314 */                                       i18 = i2;
/* 316 */                                       bArr5 = bArr;
/* 317 */                                       iI000OOo1O = iI000iOII3;
/* 318 */                                       i21 = i11;
/* 319 */                                       i20 = i7;
/* 321 */                                       iArr2 = iArr3;
/* 323 */                                       i25 = 1048575;
/* 325 */                                       i22 = i9;
/* 327 */                                       i1Il011OO5 = i1Il011OO2;
/* 312 */                                       i23 = i36 | i34;
                                                break;
                                            } else {
/* 332 */                                       z = false;
/* 334 */                                       i12 = i29;
/* 335 */                                       unsafe2 = unsafe6;
/* 834 */                                       int i37222222222222 = i10;
/* 836 */                                       i8 = i19;
/* 838 */                                       i4 = i37222222222222;
/* 840 */                                       o1lIoI = o1lIoI2;
/* 841 */                                       obj2 = obj6;
/* 842 */                                       unsafe = unsafe2;
/* 844 */                                       iI000OOo1O = i12;
/* 845 */                                       i21 = i11;
/* 846 */                                       i5 = i24;
/* 850 */                                       i22 = i9;
/* 852 */                                       i23 = i36;
/* 854 */                                       obj3 = null;
/* 856 */                                       iArr = iArr3;
                                                break;
                                            }
                                        case 17:
/* 196 */                                   if (i28 == 3) {
/* 198 */                                       Object objI001i1O0Ol2 = o1lIoI2.I001i1O0Ol(iI00IoIO0lI, obj6);
/* 217 */                                       I1Il011OO i1Il011OO7 = i1Il011OO5;
/* 222 */                                       int i39 = iI00IoIO0lI;
/* 228 */                                       int iI00II0oii1o = ((O1lIoI) o1lIoI2.I00100l0(iI00IoIO0lI)).I00II0oii1o(objI001i1O0Ol2, bArr, i29, i2, (i27 << 3) | 4, i1Il011OO7);
/* 233 */                                       i1Il011OO7.I0000Il00O = objI001i1O0Ol2;
/* 235 */                                       o1lIoI2.I00IoO0(i39, obj6, objI001i1O0Ol2);
/* 238 */                                       i23 = i36 | i34;
/* 242 */                                       bArr5 = bArr;
/* 243 */                                       i21 = i39;
/* 244 */                                       i1Il011OO5 = i1Il011OO7;
/* 245 */                                       i18 = i2;
/* 247 */                                       iI000OOo1O = iI00II0oii1o;
/* 248 */                                       i20 = i27;
/* 250 */                                       iArr2 = iArr3;
/* 252 */                                       i25 = 1048575;
/* 254 */                                       i22 = i9;
                                                break;
                                            } else {
/* 258 */                                       i7 = i27;
/* 260 */                                       i1Il011OO2 = i1Il011OO5;
/* 263 */                                       i10 = 1048575;
/* 268 */                                       i11 = iI00IoIO0lI;
/* 271 */                                       i12 = i29;
/* 272 */                                       unsafe2 = unsafe6;
/* 273 */                                       z = false;
/* 834 */                                       int i372222222222222 = i10;
/* 836 */                                       i8 = i19;
/* 838 */                                       i4 = i372222222222222;
/* 840 */                                       o1lIoI = o1lIoI2;
/* 841 */                                       obj2 = obj6;
/* 842 */                                       unsafe = unsafe2;
/* 844 */                                       iI000OOo1O = i12;
/* 845 */                                       i21 = i11;
/* 846 */                                       i5 = i24;
/* 850 */                                       i22 = i9;
/* 852 */                                       i23 = i36;
/* 854 */                                       obj3 = null;
/* 856 */                                       iArr = iArr3;
                                                break;
                                            }
                                        default:
/* 179 */                                   i7 = i27;
/* 181 */                                   unsafe2 = unsafe6;
/* 183 */                                   i12 = i29;
/* 185 */                                   z = false;
/* 187 */                                   i10 = 1048575;
/* 192 */                                   i11 = iI00IoIO0lI;
/* 834 */                                   int i3722222222222222 = i10;
/* 836 */                                   i8 = i19;
/* 838 */                                   i4 = i3722222222222222;
/* 840 */                                   o1lIoI = o1lIoI2;
/* 841 */                                   obj2 = obj6;
/* 842 */                                   unsafe = unsafe2;
/* 844 */                                   iI000OOo1O = i12;
/* 845 */                                   i21 = i11;
/* 846 */                                   i5 = i24;
/* 850 */                                   i22 = i9;
/* 852 */                                   i23 = i36;
/* 854 */                                   obj3 = null;
/* 856 */                                   iArr = iArr3;
                                            break;
                                    }
                                } else {
/* 870 */                           int i40 = i25;
/* 872 */                           i7 = i27;
/* 875 */                           I1Il011OO i1Il011OO8 = i1Il011OO5;
/* 876 */                           int i41 = iI00IoIO0lI;
/* 879 */                           if (iI00Iooi00oi != 27) {
/* 977 */                               i5 = i24;
/* 983 */                               if (iI00Iooi00oi <= 49) {
/* 985 */                                   int i42 = i22;
/* 987 */                                   int i43 = i23;
/* 997 */                                   i8 = i19;
/* 999 */                                   i4 = i40;
/* 1005 */                                  unsafe = unsafe6;
/* 1009 */                                  obj3 = null;
/* 1012 */                                  iArr = iArr3;
/* 1021 */                                  int iI00IO1 = o1lIoI2.I00IO1(obj, bArr, i29, i2, i5, i28, i41, i32, iI00Iooi00oi, j, i1Il011OO);
/* 1025 */                                  i5 = i5;
/* 1027 */                                  if (iI00IO1 != i29) {
/* 1029 */                                      bArr5 = bArr;
/* 1031 */                                      i18 = i2;
/* 1033 */                                      i1Il011OO5 = i1Il011OO;
/* 1035 */                                      i24 = i5;
/* 1037 */                                      iI000OOo1O = iI00IO1;
/* 1038 */                                      i21 = i41;
/* 1039 */                                      i20 = i7;
/* 1041 */                                      i23 = i43;
/* 1043 */                                      iArr2 = iArr;
/* 1045 */                                      i22 = i42;
/* 1047 */                                      obj6 = obj;
                                            } else {
/* 1055 */                                      obj2 = obj;
/* 1057 */                                      iI000OOo1O = iI00IO1;
/* 1058 */                                      i21 = i41;
/* 1059 */                                      i23 = i43;
/* 1061 */                                      i22 = i42;
/* 1063 */                                      o1lIoI = o1lIoI2;
                                            }
                                        } else {
/* 1068 */                                  i8 = i19;
/* 1070 */                                  i4 = i40;
/* 1072 */                                  unsafe = unsafe6;
/* 1074 */                                  i14 = i22;
/* 1078 */                                  obj3 = null;
/* 1081 */                                  iArr = iArr3;
/* 1083 */                                  obj5 = obj;
/* 1085 */                                  i15 = i23;
/* 1089 */                                  i16 = i29;
/* 1091 */                                  i17 = i41;
/* 1094 */                                  if (iI00Iooi00oi != 50) {
/* 1122 */                                      int iI00II0Ol1O0l = o1lIoI2.I00II0Ol1O0l(obj5, bArr, i16, i2, i5, i7, i28, i32, iI00Iooi00oi, j, i17, i1Il011OO);
/* 1126 */                                      obj2 = obj5;
/* 1127 */                                      i5 = i5;
/* 1128 */                                      o1lIoI = o1lIoI2;
/* 1129 */                                      if (iI00II0Ol1O0l != i16) {
/* 1131 */                                          bArr5 = bArr;
/* 1133 */                                          i18 = i2;
/* 1135 */                                          i1Il011OO5 = i1Il011OO;
/* 1137 */                                          i24 = i5;
/* 1139 */                                          o1lIoI2 = o1lIoI;
/* 1140 */                                          iI000OOo1O = iI00II0Ol1O0l;
/* 1141 */                                          obj6 = obj2;
/* 1142 */                                          i21 = i17;
/* 1143 */                                          i20 = i7;
/* 1145 */                                          i23 = i15;
/* 1147 */                                          iArr2 = iArr;
/* 1149 */                                          i22 = i14;
                                                } else {
/* 1152 */                                          iI000OOo1O = iI00II0Ol1O0l;
/* 1102 */                                          i21 = i17;
/* 1103 */                                          i23 = i15;
/* 1105 */                                          i22 = i14;
                                                }
                                            } else if (i28 == 2) {
/* 1108 */                                      o1lIoI2.I001lloI(obj5, i17, j);
/* 1111 */                                      throw null;
                                            }
                                        }
/* 1049 */                              i25 = i4;
/* 1051 */                              i19 = i8;
                                    } else if (i28 == 2) {
/* 888 */                               Iool0o0iOI iool0o0iOII000O01llI0 = (Iool0o0iOI) unsafe6.getObject(obj6, j);
/* 895 */                               if (!((I01Iol) iool0o0iOII000O01llI0).I00iOIl) {
/* 897 */                                   int size = iool0o0iOII000O01llI0.size();
/* 908 */                                   iool0o0iOII000O01llI0 = iool0o0iOII000O01llI0.I000O01llI0(size == 0 ? 10 : size * 2);
/* 912 */                                   unsafe6.putObject(obj6, j, iool0o0iOII000O01llI0);
                                        }
/* 932 */                               bArr5 = bArr;
/* 934 */                               i18 = i2;
/* 928 */                               iI000OOo1O = iOO1IIO0.I0000O(o1lIoI2.I00100l0(i41), i24, bArr, i29, i2, iool0o0iOII000O01llI0, i1Il011OO8);
/* 937 */                               i21 = i41;
/* 938 */                               i20 = i7;
/* 940 */                               iArr2 = iArr3;
/* 942 */                               i25 = i40;
/* 944 */                               obj6 = obj;
/* 946 */                               i1Il011OO5 = i1Il011OO;
                                    } else {
/* 952 */                               i8 = i19;
/* 954 */                               i4 = i40;
/* 956 */                               obj5 = obj;
/* 958 */                               i14 = i22;
/* 960 */                               i17 = i41;
/* 961 */                               i5 = i24;
/* 965 */                               i16 = i29;
/* 967 */                               obj3 = null;
/* 969 */                               unsafe = unsafe6;
/* 971 */                               iArr = iArr3;
/* 973 */                               i15 = i23;
                                    }
/* 1099 */                          o1lIoI = o1lIoI2;
/* 1100 */                          obj2 = obj5;
/* 1101 */                          iI000OOo1O = i16;
/* 1102 */                          i21 = i17;
/* 1103 */                          i23 = i15;
/* 1105 */                          i22 = i14;
                                }
                            }
/* 1154 */                  if (i5 != i3 || i3 == 0) {
/* 1162 */                      Io00Io0IO11 io00Io0IO11 = (Io00Io0IO11) obj2;
/* 1164 */                      OoiO0I1O1II ooiO0I1O1III0000Il00O = io00Io0IO11.unknownFields;
/* 1168 */                      if (ooiO0I1O1III0000Il00O == OoiO0I1O1II.I0001Ioi1lo) {
/* 1170 */                          ooiO0I1O1III0000Il00O = OoiO0I1O1II.I0000Il00O();
/* 1174 */                          io00Io0IO11.unknownFields = ooiO0I1O1III0000Il00O;
                                }
/* 1179 */                      int i44 = i5;
/* 1185 */                      int iI000II = iOO1IIO0.I000II(i44, bArr, iI000OOo1O, i2, ooiO0I1O1III0000Il00O, i1Il011OO);
/* 1190 */                      i1Il011OO5 = i1Il011OO;
/* 1192 */                      i18 = i2;
/* 1193 */                      i24 = i44;
/* 1195 */                      o1lIoI2 = o1lIoI;
/* 1196 */                      i20 = i7;
/* 1198 */                      bArr5 = bArr;
/* 1200 */                      iI000OOo1O = iI000II;
/* 1201 */                      obj6 = obj2;
/* 1202 */                      i25 = i4;
/* 1204 */                      iArr2 = iArr;
/* 1051 */                      i19 = i8;
                            } else {
/* 1158 */                      i18 = i2;
                            }
                        } else {
/* 1208 */                  o1lIoI = o1lIoI2;
/* 1209 */                  obj2 = obj6;
/* 1214 */                  unsafe = unsafe6;
/* 1216 */                  i4 = i25;
/* 1218 */                  obj3 = null;
/* 1220 */                  i5 = i24;
                        }
                    }
/* 1222 */          if (i22 != i4) {
/* 1227 */              unsafe.putInt(obj2, i22, i23);
                    }
/* 1234 */          for (int i45 = o1lIoI.I000OOo1O; i45 < o1lIoI.I000OiO; i45++) {
/* 1242 */              o1lIoI.I000lI(o1lIoI.I000O01llI0[i45], obj2, obj3);
                    }
/* 1248 */          if (i3 == 0) {
/* 1250 */              if (iI000OOo1O != i18) {
/* 1257 */                  throw O000oiiiOI0.I0001Ioi1lo();
                        }
                    } else if (iI000OOo1O > i18 || i5 != i3) {
/* 1267 */              throw O000oiiiOI0.I0001Ioi1lo();
                    }
/* 1262 */          return iI000OOo1O;
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                public final int I00IO1(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, long j, int i6, long j2, I1Il011OO i1Il011OO) throws O000oiiiOI0 {
                    int iI000OiO;
/* 1 */             Unsafe unsafe = I00100l0;
                    Iool0o0iOI iool0o0iOII000O01llI0 = (Iool0o0iOI) unsafe.getObject(obj, j2);
/* 3 */             if (!((I01Iol) iool0o0iOII000O01llI0).I00iOIl) {
/* 4 */                 int size = iool0o0iOII000O01llI0.size();
/* 5 */                 iool0o0iOII000O01llI0 = iool0o0iOII000O01llI0.I000O01llI0(size == 0 ? 10 : size * 2);
/* 6 */                 unsafe.putObject(obj, j2, iool0o0iOII000O01llI0);
                    }
                    Iool0o0iOI iool0o0iOI = iool0o0iOII000O01llI0;
                    switch (i6) {
                        case PoseLandmark.RIGHT_PINKY:
                        case InputImage.IMAGE_FORMAT_YUV_420_888:
                            if (i4 == 2) {
/* 175 */                       IiillIl0io iiillIl0io = (IiillIl0io) iool0o0iOI;
/* 176 */                       int iI000OOo1O = iOO1IIO0.I000OOo1O(bArr, i, i1Il011OO);
/* 177 */                       int i7 = i1Il011OO.I00000oIO + iI000OOo1O;
                                while (iI000OOo1O < i7) {
/* 179 */                           iiillIl0io.I0000O(Double.longBitsToDouble(iOO1IIO0.I0000Il00O(iI000OOo1O, bArr)));
                                    iI000OOo1O += 8;
                                }
                                if (iI000OOo1O == i7) {
                                    return iI000OOo1O;
                                }
/* 180 */                       throw O000oiiiOI0.I000II();
                            }
                            if (i4 == 1) {
/* 181 */                       IiillIl0io iiillIl0io2 = (IiillIl0io) iool0o0iOI;
/* 183 */                       iiillIl0io2.I0000O(Double.longBitsToDouble(iOO1IIO0.I0000Il00O(i, bArr)));
                                i += 8;
                                while (i < i2) {
/* 184 */                           int iI000OOo1O2 = iOO1IIO0.I000OOo1O(bArr, i, i1Il011OO);
/* 185 */                           if (i3 == i1Il011OO.I00000oIO) {
/* 187 */                               iiillIl0io2.I0000O(Double.longBitsToDouble(iOO1IIO0.I0000Il00O(iI000OOo1O2, bArr)));
                                        i = iI000OOo1O2 + 8;
                                    }
                                }
                            }
                            return i;
                        case PoseLandmark.LEFT_INDEX:
                        case 36:
                            if (i4 == 2) {
/* 162 */                       IlOOIIIO0 ilOOIIIO0 = (IlOOIIIO0) iool0o0iOI;
/* 163 */                       int iI000OOo1O3 = iOO1IIO0.I000OOo1O(bArr, i, i1Il011OO);
/* 164 */                       int i8 = i1Il011OO.I00000oIO + iI000OOo1O3;
                                while (iI000OOo1O3 < i8) {
/* 166 */                           ilOOIIIO0.I0000O(Float.intBitsToFloat(iOO1IIO0.I00000oOI(iI000OOo1O3, bArr)));
                                    iI000OOo1O3 += 4;
                                }
                                if (iI000OOo1O3 == i8) {
                                    return iI000OOo1O3;
                                }
/* 167 */                       throw O000oiiiOI0.I000II();
                            }
                            if (i4 == 5) {
/* 168 */                       IlOOIIIO0 ilOOIIIO02 = (IlOOIIIO0) iool0o0iOI;
/* 170 */                       ilOOIIIO02.I0000O(Float.intBitsToFloat(iOO1IIO0.I00000oOI(i, bArr)));
                                int i9 = i + 4;
                                while (i9 < i2) {
/* 171 */                           int iI000OOo1O4 = iOO1IIO0.I000OOo1O(bArr, i9, i1Il011OO);
/* 172 */                           if (i3 != i1Il011OO.I00000oIO) {
                                        return i9;
                                    }
/* 174 */                           ilOOIIIO02.I0000O(Float.intBitsToFloat(iOO1IIO0.I00000oOI(iI000OOo1O4, bArr)));
                                    i9 = iI000OOo1O4 + 4;
                                }
                                return i9;
                            }
                            return i;
                        case PoseLandmark.RIGHT_INDEX:
                        case PoseLandmark.LEFT_THUMB:
                        case 37:
                        case 38:
                            if (i4 == 2) {
/* 149 */                       O1IIlI01ol o1IIlI01ol = (O1IIlI01ol) iool0o0iOI;
/* 150 */                       int iI000OOo1O5 = iOO1IIO0.I000OOo1O(bArr, i, i1Il011OO);
/* 151 */                       int i10 = i1Il011OO.I00000oIO + iI000OOo1O5;
                                while (iI000OOo1O5 < i10) {
/* 152 */                           iI000OOo1O5 = iOO1IIO0.I000iOII(bArr, iI000OOo1O5, i1Il011OO);
/* 153 */                           o1IIlI01ol.I0000O(i1Il011OO.I00000oOI);
                                }
                                if (iI000OOo1O5 == i10) {
                                    return iI000OOo1O5;
                                }
/* 154 */                       throw O000oiiiOI0.I000II();
                            }
                            if (i4 == 0) {
/* 155 */                       O1IIlI01ol o1IIlI01ol2 = (O1IIlI01ol) iool0o0iOI;
/* 156 */                       int iI000iOII = iOO1IIO0.I000iOII(bArr, i, i1Il011OO);
/* 157 */                       o1IIlI01ol2.I0000O(i1Il011OO.I00000oOI);
                                while (iI000iOII < i2) {
/* 158 */                           int iI000OOo1O6 = iOO1IIO0.I000OOo1O(bArr, iI000iOII, i1Il011OO);
/* 159 */                           if (i3 != i1Il011OO.I00000oIO) {
                                        return iI000iOII;
                                    }
/* 160 */                           iI000iOII = iOO1IIO0.I000iOII(bArr, iI000OOo1O6, i1Il011OO);
/* 161 */                           o1IIlI01ol2.I0000O(i1Il011OO.I00000oOI);
                                }
                                return iI000iOII;
                            }
                            return i;
                        case PoseLandmark.RIGHT_THUMB:
                        case PoseLandmark.LEFT_HEEL:
                        case 39:
                        case 43:
                            if (i4 != 2) {
                                if (i4 == 0) {
/* 148 */                           return iOO1IIO0.I000OiO(i3, bArr, i, i2, iool0o0iOI, i1Il011OO);
                                }
                                return i;
                            }
/* 142 */                   IooIOOO0I iooIOOO0I = (IooIOOO0I) iool0o0iOI;
/* 143 */                   int iI000OOo1O7 = iOO1IIO0.I000OOo1O(bArr, i, i1Il011OO);
/* 144 */                   int i11 = i1Il011OO.I00000oIO + iI000OOo1O7;
                            while (iI000OOo1O7 < i11) {
/* 145 */                       iI000OOo1O7 = iOO1IIO0.I000OOo1O(bArr, iI000OOo1O7, i1Il011OO);
/* 146 */                       iooIOOO0I.I0000O(i1Il011OO.I00000oIO);
                            }
                            if (iI000OOo1O7 == i11) {
                                return iI000OOo1O7;
                            }
/* 147 */                   throw O000oiiiOI0.I000II();
                        case PoseLandmark.LEFT_HIP:
                        case 32:
                        case 40:
                        case 46:
                            if (i4 == 2) {
/* 132 */                       O1IIlI01ol o1IIlI01ol3 = (O1IIlI01ol) iool0o0iOI;
/* 133 */                       int iI000OOo1O8 = iOO1IIO0.I000OOo1O(bArr, i, i1Il011OO);
/* 134 */                       int i12 = i1Il011OO.I00000oIO + iI000OOo1O8;
                                while (iI000OOo1O8 < i12) {
/* 135 */                           o1IIlI01ol3.I0000O(iOO1IIO0.I0000Il00O(iI000OOo1O8, bArr));
                                    iI000OOo1O8 += 8;
                                }
                                if (iI000OOo1O8 == i12) {
                                    return iI000OOo1O8;
                                }
/* 136 */                       throw O000oiiiOI0.I000II();
                            }
                            if (i4 == 1) {
/* 137 */                       O1IIlI01ol o1IIlI01ol4 = (O1IIlI01ol) iool0o0iOI;
/* 138 */                       o1IIlI01ol4.I0000O(iOO1IIO0.I0000Il00O(i, bArr));
                                int i13 = i + 8;
                                while (i13 < i2) {
/* 139 */                           int iI000OOo1O9 = iOO1IIO0.I000OOo1O(bArr, i13, i1Il011OO);
/* 140 */                           if (i3 != i1Il011OO.I00000oIO) {
                                        return i13;
                                    }
/* 141 */                           o1IIlI01ol4.I0000O(iOO1IIO0.I0000Il00O(iI000OOo1O9, bArr));
                                    i13 = iI000OOo1O9 + 8;
                                }
                                return i13;
                            }
                            return i;
                        case PoseLandmark.RIGHT_HIP:
                        case PoseLandmark.LEFT_FOOT_INDEX:
                        case 41:
                        case BuildConfig.VERSION_CODE:
                            if (i4 == 2) {
/* 122 */                       IooIOOO0I iooIOOO0I2 = (IooIOOO0I) iool0o0iOI;
/* 123 */                       int iI000OOo1O10 = iOO1IIO0.I000OOo1O(bArr, i, i1Il011OO);
/* 124 */                       int i14 = i1Il011OO.I00000oIO + iI000OOo1O10;
                                while (iI000OOo1O10 < i14) {
/* 125 */                           iooIOOO0I2.I0000O(iOO1IIO0.I00000oOI(iI000OOo1O10, bArr));
                                    iI000OOo1O10 += 4;
                                }
                                if (iI000OOo1O10 == i14) {
                                    return iI000OOo1O10;
                                }
/* 126 */                       throw O000oiiiOI0.I000II();
                            }
                            if (i4 == 5) {
/* 127 */                       IooIOOO0I iooIOOO0I3 = (IooIOOO0I) iool0o0iOI;
/* 128 */                       iooIOOO0I3.I0000O(iOO1IIO0.I00000oOI(i, bArr));
                                int i15 = i + 4;
                                while (i15 < i2) {
/* 129 */                           int iI000OOo1O11 = iOO1IIO0.I000OOo1O(bArr, i15, i1Il011OO);
/* 130 */                           if (i3 != i1Il011OO.I00000oIO) {
                                        return i15;
                                    }
/* 131 */                           iooIOOO0I3.I0000O(iOO1IIO0.I00000oOI(iI000OOo1O11, bArr));
                                    i15 = iI000OOo1O11 + 4;
                                }
                                return i15;
                            }
                            return i;
                        case PoseLandmark.LEFT_KNEE:
                        case 42:
                            if (i4 == 2) {
/* 109 */                       II11I0 ii11i0 = (II11I0) iool0o0iOI;
/* 110 */                       int iI000OOo1O12 = iOO1IIO0.I000OOo1O(bArr, i, i1Il011OO);
/* 111 */                       int i16 = i1Il011OO.I00000oIO + iI000OOo1O12;
                                while (iI000OOo1O12 < i16) {
/* 112 */                           iI000OOo1O12 = iOO1IIO0.I000iOII(bArr, iI000OOo1O12, i1Il011OO);
                                    ii11i0.I0000O(i1Il011OO.I00000oOI != 0);
                                }
                                if (iI000OOo1O12 == i16) {
                                    return iI000OOo1O12;
                                }
/* 114 */                       throw O000oiiiOI0.I000II();
                            }
                            if (i4 == 0) {
/* 115 */                       II11I0 ii11i02 = (II11I0) iool0o0iOI;
/* 116 */                       int iI000iOII2 = iOO1IIO0.I000iOII(bArr, i, i1Il011OO);
                                ii11i02.I0000O(i1Il011OO.I00000oOI != 0);
                                while (iI000iOII2 < i2) {
/* 118 */                           int iI000OOo1O13 = iOO1IIO0.I000OOo1O(bArr, iI000iOII2, i1Il011OO);
/* 119 */                           if (i3 != i1Il011OO.I00000oIO) {
                                        return iI000iOII2;
                                    }
/* 120 */                           iI000iOII2 = iOO1IIO0.I000iOII(bArr, iI000OOo1O13, i1Il011OO);
                                    ii11i02.I0000O(i1Il011OO.I00000oOI != 0);
                                }
                                return iI000iOII2;
                            }
                            return i;
                        case PoseLandmark.RIGHT_KNEE:
                            if (i4 == 2) {
                                if ((j & 536870912) == 0) {
/* 77 */                            int iI000OOo1O14 = iOO1IIO0.I000OOo1O(bArr, i, i1Il011OO);
/* 78 */                            int i17 = i1Il011OO.I00000oIO;
                                    if (i17 < 0) {
/* 90 */                                throw O000oiiiOI0.I0000oI00();
                                    }
                                    if (i17 == 0) {
/* 79 */                                iool0o0iOI.add("");
                                    } else {
/* 81 */                                iool0o0iOI.add(new String(bArr, iI000OOo1O14, i17, Iool1iOO11.I00000oIO));
                                        iI000OOo1O14 += i17;
                                    }
                                    while (iI000OOo1O14 < i2) {
/* 82 */                                int iI000OOo1O15 = iOO1IIO0.I000OOo1O(bArr, iI000OOo1O14, i1Il011OO);
/* 83 */                                if (i3 != i1Il011OO.I00000oIO) {
                                            return iI000OOo1O14;
                                        }
/* 84 */                                iI000OOo1O14 = iOO1IIO0.I000OOo1O(bArr, iI000OOo1O15, i1Il011OO);
/* 85 */                                int i18 = i1Il011OO.I00000oIO;
                                        if (i18 < 0) {
/* 89 */                                    throw O000oiiiOI0.I0000oI00();
                                        }
                                        if (i18 == 0) {
/* 86 */                                    iool0o0iOI.add("");
                                        } else {
/* 88 */                                    iool0o0iOI.add(new String(bArr, iI000OOo1O14, i18, Iool1iOO11.I00000oIO));
                                            iI000OOo1O14 += i18;
                                        }
                                    }
                                    return iI000OOo1O14;
                                }
/* 91 */                        int iI000OOo1O16 = iOO1IIO0.I000OOo1O(bArr, i, i1Il011OO);
/* 92 */                        int i19 = i1Il011OO.I00000oIO;
                                if (i19 < 0) {
/* 108 */                           throw O000oiiiOI0.I0000oI00();
                                }
                                if (i19 == 0) {
/* 93 */                            iool0o0iOI.add("");
                                } else {
                                    int i20 = iI000OOo1O16 + i19;
/* 94 */                            if (!Oolio1l.I00000oIO.I0000Il00O(bArr, iI000OOo1O16, i20)) {
/* 107 */                               throw O000oiiiOI0.I00000oOI();
                                    }
/* 96 */                            iool0o0iOI.add(new String(bArr, iI000OOo1O16, i19, Iool1iOO11.I00000oIO));
                                    iI000OOo1O16 = i20;
                                }
                                while (iI000OOo1O16 < i2) {
/* 97 */                            int iI000OOo1O17 = iOO1IIO0.I000OOo1O(bArr, iI000OOo1O16, i1Il011OO);
/* 98 */                            if (i3 != i1Il011OO.I00000oIO) {
                                        return iI000OOo1O16;
                                    }
/* 99 */                            iI000OOo1O16 = iOO1IIO0.I000OOo1O(bArr, iI000OOo1O17, i1Il011OO);
/* 100 */                           int i21 = i1Il011OO.I00000oIO;
                                    if (i21 < 0) {
/* 106 */                               throw O000oiiiOI0.I0000oI00();
                                    }
                                    if (i21 == 0) {
/* 101 */                               iool0o0iOI.add("");
                                    } else {
                                        int i22 = iI000OOo1O16 + i21;
/* 102 */                               if (!Oolio1l.I00000oIO.I0000Il00O(bArr, iI000OOo1O16, i22)) {
/* 105 */                                   throw O000oiiiOI0.I00000oOI();
                                        }
/* 104 */                               iool0o0iOI.add(new String(bArr, iI000OOo1O16, i21, Iool1iOO11.I00000oIO));
                                        iI000OOo1O16 = i22;
                                    }
                                }
                                return iI000OOo1O16;
                            }
                            return i;
                        case 27:
                            if (i4 == 2) {
/* 75 */                        return iOO1IIO0.I0000O(I00100l0(i5), i3, bArr, i, i2, iool0o0iOI, i1Il011OO);
                            }
                            return i;
                        case PoseLandmark.RIGHT_ANKLE:
                            if (i4 == 2) {
/* 58 */                        int iI000OOo1O18 = iOO1IIO0.I000OOo1O(bArr, i, i1Il011OO);
/* 59 */                        int i23 = i1Il011OO.I00000oIO;
                                if (i23 < 0) {
/* 73 */                            throw O000oiiiOI0.I0000oI00();
                                }
/* 60 */                        if (i23 > bArr.length - iI000OOo1O18) {
/* 72 */                            throw O000oiiiOI0.I000II();
                                }
                                if (i23 == 0) {
/* 61 */                            iool0o0iOI.add(IIOI1Ii1I.I00iiI);
                                } else {
/* 62 */                            iool0o0iOI.add(IIOI1Ii1I.I0000oI00(bArr, iI000OOo1O18, i23));
                                    iI000OOo1O18 += i23;
                                }
                                while (iI000OOo1O18 < i2) {
/* 63 */                            int iI000OOo1O19 = iOO1IIO0.I000OOo1O(bArr, iI000OOo1O18, i1Il011OO);
/* 64 */                            if (i3 != i1Il011OO.I00000oIO) {
                                        return iI000OOo1O18;
                                    }
/* 65 */                            iI000OOo1O18 = iOO1IIO0.I000OOo1O(bArr, iI000OOo1O19, i1Il011OO);
/* 66 */                            int i24 = i1Il011OO.I00000oIO;
                                    if (i24 < 0) {
/* 71 */                                throw O000oiiiOI0.I0000oI00();
                                    }
/* 67 */                            if (i24 > bArr.length - iI000OOo1O18) {
/* 70 */                                throw O000oiiiOI0.I000II();
                                    }
                                    if (i24 == 0) {
/* 68 */                                iool0o0iOI.add(IIOI1Ii1I.I00iiI);
                                    } else {
/* 69 */                                iool0o0iOI.add(IIOI1Ii1I.I0000oI00(bArr, iI000OOo1O18, i24));
                                        iI000OOo1O18 += i24;
                                    }
                                }
                                return iI000OOo1O18;
                            }
                            return i;
                        case 30:
                        case 44:
                            if (i4 != 2) {
                                if (i4 == 0) {
/* 55 */                            iI000OiO = iOO1IIO0.I000OiO(i3, bArr, i, i2, iool0o0iOI, i1Il011OO);
                                }
                                return i;
                            }
/* 49 */                    IooIOOO0I iooIOOO0I4 = (IooIOOO0I) iool0o0iOI;
/* 50 */                    iI000OiO = iOO1IIO0.I000OOo1O(bArr, i, i1Il011OO);
/* 51 */                    int i25 = i1Il011OO.I00000oIO + iI000OiO;
                            while (iI000OiO < i25) {
/* 52 */                        iI000OiO = iOO1IIO0.I000OOo1O(bArr, iI000OiO, i1Il011OO);
/* 53 */                        iooIOOO0I4.I0000O(i1Il011OO.I00000oIO);
                            }
                            if (iI000OiO != i25) {
/* 54 */                        throw O000oiiiOI0.I000II();
                            }
/* 56 */                    I000o00OoI0I(i5);
/* 57 */                    Class cls = OiOO0o1I0.I00000oIO;
                            return iI000OiO;
                        case 33:
                        case 47:
                            if (i4 == 2) {
/* 36 */                        IooIOOO0I iooIOOO0I5 = (IooIOOO0I) iool0o0iOI;
/* 37 */                        int iI000OOo1O20 = iOO1IIO0.I000OOo1O(bArr, i, i1Il011OO);
/* 38 */                        int i26 = i1Il011OO.I00000oIO + iI000OOo1O20;
                                while (iI000OOo1O20 < i26) {
/* 39 */                            iI000OOo1O20 = iOO1IIO0.I000OOo1O(bArr, iI000OOo1O20, i1Il011OO);
/* 40 */                            iooIOOO0I5.I0000O(IOOOI0.I0000O(i1Il011OO.I00000oIO));
                                }
                                if (iI000OOo1O20 == i26) {
                                    return iI000OOo1O20;
                                }
/* 41 */                        throw O000oiiiOI0.I000II();
                            }
                            if (i4 == 0) {
/* 42 */                        IooIOOO0I iooIOOO0I6 = (IooIOOO0I) iool0o0iOI;
/* 43 */                        int iI000OOo1O21 = iOO1IIO0.I000OOo1O(bArr, i, i1Il011OO);
/* 44 */                        iooIOOO0I6.I0000O(IOOOI0.I0000O(i1Il011OO.I00000oIO));
                                while (iI000OOo1O21 < i2) {
/* 45 */                            int iI000OOo1O22 = iOO1IIO0.I000OOo1O(bArr, iI000OOo1O21, i1Il011OO);
/* 46 */                            if (i3 != i1Il011OO.I00000oIO) {
                                        return iI000OOo1O21;
                                    }
/* 47 */                            iI000OOo1O21 = iOO1IIO0.I000OOo1O(bArr, iI000OOo1O22, i1Il011OO);
/* 48 */                            iooIOOO0I6.I0000O(IOOOI0.I0000O(i1Il011OO.I00000oIO));
                                }
                                return iI000OOo1O21;
                            }
                            return i;
                        case 34:
                        case 48:
                            if (i4 == 2) {
/* 23 */                        O1IIlI01ol o1IIlI01ol5 = (O1IIlI01ol) iool0o0iOI;
/* 24 */                        int iI000OOo1O23 = iOO1IIO0.I000OOo1O(bArr, i, i1Il011OO);
/* 25 */                        int i27 = i1Il011OO.I00000oIO + iI000OOo1O23;
                                while (iI000OOo1O23 < i27) {
/* 26 */                            iI000OOo1O23 = iOO1IIO0.I000iOII(bArr, iI000OOo1O23, i1Il011OO);
/* 27 */                            o1IIlI01ol5.I0000O(IOOOI0.I0000oI00(i1Il011OO.I00000oOI));
                                }
                                if (iI000OOo1O23 == i27) {
                                    return iI000OOo1O23;
                                }
/* 28 */                        throw O000oiiiOI0.I000II();
                            }
                            if (i4 == 0) {
/* 29 */                        O1IIlI01ol o1IIlI01ol6 = (O1IIlI01ol) iool0o0iOI;
/* 30 */                        int iI000iOII3 = iOO1IIO0.I000iOII(bArr, i, i1Il011OO);
/* 31 */                        o1IIlI01ol6.I0000O(IOOOI0.I0000oI00(i1Il011OO.I00000oOI));
                                while (iI000iOII3 < i2) {
/* 32 */                            int iI000OOo1O24 = iOO1IIO0.I000OOo1O(bArr, iI000iOII3, i1Il011OO);
/* 33 */                            if (i3 != i1Il011OO.I00000oIO) {
                                        return iI000iOII3;
                                    }
/* 34 */                            iI000iOII3 = iOO1IIO0.I000iOII(bArr, iI000OOo1O24, i1Il011OO);
/* 35 */                            o1IIlI01ol6.I0000O(IOOOI0.I0000oI00(i1Il011OO.I00000oOI));
                                }
                                return iI000iOII3;
                            }
                            return i;
                        case 49:
                            if (i4 == 3) {
/* 7 */                         OiOIiIO0 oiOIiIO0I00100l0 = I00100l0(i5);
                                int i28 = (i3 & (-8)) | 4;
/* 8 */                         Object objI0000O = oiOIiIO0I00100l0.I0000O();
/* 9 */                         O1lIoI o1lIoI = (O1lIoI) oiOIiIO0I00100l0;
/* 10 */                        int iI00II0oii1o = o1lIoI.I00II0oii1o(objI0000O, bArr, i, i2, i28, i1Il011OO);
/* 11 */                        i1Il011OO.I0000Il00O = objI0000O;
/* 12 */                        oiOIiIO0I00100l0.I00000oOI(objI0000O);
/* 13 */                        i1Il011OO.I0000Il00O = objI0000O;
/* 14 */                        iool0o0iOI.add(objI0000O);
                                while (iI00II0oii1o < i2) {
/* 15 */                            int iI000OOo1O25 = iOO1IIO0.I000OOo1O(bArr, iI00II0oii1o, i1Il011OO);
/* 16 */                            if (i3 != i1Il011OO.I00000oIO) {
                                        return iI00II0oii1o;
                                    }
/* 17 */                            Object objI0000O2 = oiOIiIO0I00100l0.I0000O();
/* 18 */                            iI00II0oii1o = o1lIoI.I00II0oii1o(objI0000O2, bArr, iI000OOo1O25, i2, i28, i1Il011OO);
/* 19 */                            i1Il011OO.I0000Il00O = objI0000O2;
/* 20 */                            oiOIiIO0I00100l0.I00000oOI(objI0000O2);
/* 21 */                            i1Il011OO.I0000Il00O = objI0000O2;
/* 22 */                            iool0o0iOI.add(objI0000O2);
                                }
                                return iI00II0oii1o;
                            }
                            return i;
                        default:
                            return i;
                    }
                }

                public final void I00IO1oi11O(Object obj, long j, IOOOi1 iOOOi1, OiOIiIO0 oiOIiIO0, Il1llO11O il1llO11O) throws O000illO {
                    int iI00II0Ol1O0l;
/* 3 */             List listI0000Il00O = this.I000l1.I0000Il00O(j, obj);
/* 9 */             IOOOI0 ioooi0 = (IOOOI0) iOOOi1.I0000oI00;
/* 11 */            int i = iOOOi1.I00000oOI;
/* 16 */            if ((i & 7) != 3) {
/* 966 */               throw O000oiiiOI0.I0000Il00O();
                    }
/* 46 */            do {
/* 18 */                Object objI0000O = oiOIiIO0.I0000O();
/* 22 */                iOOOi1.I000II(objI0000O, oiOIiIO0, il1llO11O);
/* 25 */                oiOIiIO0.I00000oOI(objI0000O);
/* 28 */                listI0000Il00O.add(objI0000O);
/* 35 */                if (ioooi0.I000O01llI0() || iOOOi1.I0000O != 0) {
/* 50 */                    return;
                        } else {
/* 42 */                    iI00II0Ol1O0l = ioooi0.I00II0Ol1O0l();
                        }
/* 46 */            } while (iI00II0Ol1O0l == i);
/* 48 */            iOOOi1.I0000O = iI00II0Ol1O0l;
                }

                public final void I00IOO(Object obj, int i, IOOOi1 iOOOi1, OiOIiIO0 oiOIiIO0, Il1llO11O il1llO11O) throws O000oiiiOI0 {
                    int iI00II0Ol1O0l;
/* 8 */             List listI0000Il00O = this.I000l1.I0000Il00O(i & 1048575, obj);
/* 14 */            IOOOI0 ioooi0 = (IOOOI0) iOOOi1.I0000oI00;
/* 16 */            int i2 = iOOOi1.I00000oOI;
/* 21 */            if ((i2 & 7) != 2) {
/* 966 */               throw O000oiiiOI0.I0000Il00O();
                    }
/* 51 */            do {
/* 23 */                Object objI0000O = oiOIiIO0.I0000O();
/* 27 */                iOOOi1.I000OiO(objI0000O, oiOIiIO0, il1llO11O);
/* 30 */                oiOIiIO0.I00000oOI(objI0000O);
/* 33 */                listI0000Il00O.add(objI0000O);
/* 40 */                if (ioooi0.I000O01llI0() || iOOOi1.I0000O != 0) {
/* 55 */                    return;
                        } else {
/* 47 */                    iI00II0Ol1O0l = ioooi0.I00II0Ol1O0l();
                        }
/* 51 */            } while (iI00II0Ol1O0l == i2);
/* 53 */            iOOOi1.I0000O = iI00II0Ol1O0l;
                }

                public final void I00IioO0OiOi(int i, IOOOi1 iOOOi1, Object obj) throws O000illO, O000lI0, O000o1i {
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) iOOOi1.I0000oI00;
/* 12 */            if ((536870912 & i) != 0) {
/* 17 */                iOOOi1.I00ilI0I1(2);
/* 24 */                Ooil11Oi.I00100o1O0lo(obj, i & 1048575, ioooi0.I001lloI());
                    } else if (!this.I0001Ioi1lo) {
/* 53 */                Ooil11Oi.I00100o1O0lo(obj, i & 1048575, iOOOi1.I0010I0i());
                    } else {
/* 35 */                iOOOi1.I00ilI0I1(2);
/* 42 */                Ooil11Oi.I00100o1O0lo(obj, i & 1048575, ioooi0.I001lllioOl());
                    }
                }

                public final void I00Io1lO(int i, Object obj) {
/* 5 */             int i2 = this.I00000oIO[i + 2];
/* 10 */            long j = 1048575 & i2;
/* 17 */            if (j == 1048575) {
/* 19 */                return;
                    }
/* 30 */            Ooil11Oi.I000oI1ioi(obj, (1 << (i2 >>> 20)) | Ooil11Oi.I000O01llI0(j, obj), j);
                }

                public final void I00Io1o110i(Object obj, int i, int i2) {
/* 12 */            Ooil11Oi.I000oI1ioi(obj, i, this.I00000oIO[i2 + 2] & 1048575);
                }

                public final int I00IoIO0lI(int i, int i2) {
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
/* 27 */                    i2 = i3 + 1;
                        }
                    }
/* 31 */            return -1;
                }

                public final void I00IoO0(int i, Object obj, Object obj2) {
/* 12 */            I00100l0.putObject(obj, I00O0i0ii(i) & 1048575, obj2);
/* 15 */            I00Io1lO(i, obj);
                }

                public final void I00IoiI(Object obj, int i, int i2, Object obj2) {
/* 12 */            I00100l0.putObject(obj, I00O0i0ii(i2) & 1048575, obj2);
/* 15 */            I00Io1o110i(obj, i, i2);
                }

                public final int I00O0i0ii(int i) {
/* 5 */             return this.I00000oIO[i + 1];
                }
            }

            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Field;
            import java.nio.charset.Charset;
            import java.util.concurrent.ConcurrentHashMap;
            import sun.misc.Unsafe;
            
            public final class i1o1i00IlOiO {
                public static final i1o1i00IlOiO I0000Il00O;
                public i1lIlIiI1IiO I00000oIO;
                public ConcurrentHashMap I00000oOI;

                static {
/* 3 */             i1o1i00IlOiO i1o1i00iloio = new i1o1i00IlOiO();
/* 11 */            i1o1i00iloio.I00000oOI = new ConcurrentHashMap();
/* 18 */            i1li10loi[] i1li10loiVarArr = {IOO0o0I1l.I00io1l, i1lIlIiI1IiO.I00000oOI};
/* 30 */            i1Il01 i1il01 = new i1Il01(1);
/* 33 */            i1il01.I00iiI = i1li10loiVarArr;
/* 35 */            VarHandle.storeStoreFence();
/* 38 */            i1lIlIiI1IiO i1liliii1iio = new i1lIlIiI1IiO();
/* 41 */            Charset charset = i1l0I01.I00000oIO;
/* 43 */            i1liliii1iio.I00000oIO = i1il01;
/* 45 */            VarHandle.storeStoreFence();
/* 48 */            i1o1i00iloio.I00000oIO = i1liliii1iio;
/* 50 */            VarHandle.storeStoreFence();
/* 53 */            I0000Il00O = i1o1i00iloio;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:186:0x03f5  */
                /* JADX WARN: Removed duplicated region for block: B:202:0x0445  */
                /* JADX WARN: Removed duplicated region for block: B:208:0x0460  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final i1oIIli1lo1O I00000oIO(Class cls) {
                    ConcurrentHashMap concurrentHashMap;
                    i1o0iOI i1o0ioi;
                    int i;
                    int iCharAt;
                    int iCharAt2;
                    int iCharAt3;
                    int i2;
                    int i3;
                    int i4;
                    int iCharAt4;
                    int i5;
                    int[] iArr;
                    int i6;
                    int i7;
                    int i8;
                    int i9;
                    char cCharAt;
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
                    char cCharAt8;
                    int i17;
                    int i18;
                    lolIo0 lolio0;
                    int i19;
                    Object[] objArr;
                    int iObjectFieldOffset;
                    int iObjectFieldOffset2;
                    int[] iArr2;
                    int i20;
                    int i21;
                    int i22;
                    int i23;
                    Field fieldI0010I0i;
                    char cCharAt9;
                    int i24;
                    int i25;
                    int i26;
                    int i27;
                    Field fieldI0010I0i2;
                    Field fieldI0010I0i3;
                    int i28;
                    char cCharAt10;
                    int i29;
                    int i30;
                    char cCharAt11;
                    int i31;
                    int i32;
                    char cCharAt12;
                    int i33;
                    int i34;
                    char cCharAt13;
/* 5 */             Charset charset = i1l0I01.I00000oIO;
/* 8 */             if (cls == null) {
/* 1285 */              IOOlIIilOl0.I000II("messageType");
/* 7 */                 return null;
                    }
/* 10 */            ConcurrentHashMap concurrentHashMap2 = this.I00000oOI;
/* 16 */            i1oIIli1lo1O i1oiili1lo1o = (i1oIIli1lo1O) concurrentHashMap2.get(cls);
/* 18 */            if (i1oiili1lo1o != null) {
/* 1282 */              return i1oiili1lo1o;
                    }
/* 20 */            i1lIlIiI1IiO i1liliii1iio = this.I00000oIO;
/* 22 */            i1liliii1iio.getClass();
/* 25 */            lolIo0 lolio02 = i1oIlOiO.I00000oIO;
/* 29 */            i1ilOol.class.isAssignableFrom(cls);
/* 34 */            i1oI1I00i0 i1oi1i00i0Zzb = i1liliii1iio.I00000oIO.zzb(cls);
/* 49 */            if ((i1oi1i00i0Zzb.I0000O & 2) == 2) {
/* 1243 */              concurrentHashMap = concurrentHashMap2;
/* 1245 */              lolIo0 lolio03 = i1oIlOiO.I00000oIO;
/* 1247 */              int i35 = i1iI00.I00000oIO;
/* 1251 */              i1O1lollIOO i1o1lollioo = i1oi1i00i0Zzb.I00000oIO;
/* 1255 */              i1o0iOI i1o0ioi2 = new i1o0iOI();
/* 1258 */              i1o0ioi2.I00000oOI = lolio03;
/* 1260 */              i1o0ioi2.I00000oIO = i1o1lollioo;
/* 1262 */              VarHandle.storeStoreFence();
/* 1265 */              i1o0ioi = i1o0ioi2;
                    } else {
/* 51 */                int i36 = i1o1O1l.I00000oIO;
/* 53 */                int i37 = i1l1oOO0.I00000oIO;
/* 55 */                lolIo0 lolio04 = i1oIlOiO.I00000oIO;
/* 63 */                if (i1oi1i00i0Zzb.I00000oIO() - 1 != 1) {
/* 65 */                    int i38 = i1iI00.I00000oIO;
                        }
/* 67 */                int i39 = i1lOlo.I00000oIO;
/* 69 */                int[] iArr3 = i1o0I00.I000OiO;
/* 73 */                if (!(i1oi1i00i0Zzb instanceof i1oI1I00i0)) {
/* 1237 */                  OIiilo1Ool0o.I00000oIO();
/* 7 */                     return null;
                        }
/* 75 */                i1O1lollIOO i1o1lollioo2 = i1oi1i00i0Zzb.I00000oIO;
/* 77 */                String str = i1oi1i00i0Zzb.I00000oOI;
/* 79 */                int length = str.length();
/* 90 */                if (str.charAt(0) >= 55296) {
/* 92 */                    int i40 = 1;
                            while (true) {
/* 93 */                        i = i40 + 1;
/* 99 */                        if (str.charAt(i40) < 55296) {
                                    break;
                                }
/* 101 */                       i40 = i;
                            }
                        } else {
/* 103 */                   i = 1;
                        }
/* 104 */               int i41 = i + 1;
/* 106 */               int iCharAt5 = str.charAt(i);
/* 110 */               if (iCharAt5 >= 55296) {
/* 112 */                   int i42 = iCharAt5 & 8191;
/* 114 */                   int i43 = 13;
                            while (true) {
/* 116 */                       i34 = i41 + 1;
/* 118 */                       cCharAt13 = str.charAt(i41);
/* 122 */                       if (cCharAt13 < 55296) {
                                    break;
                                }
/* 127 */                       i42 |= (cCharAt13 & 8191) << i43;
/* 128 */                       i43 += 13;
/* 130 */                       i41 = i34;
                            }
/* 133 */                   iCharAt5 = i42 | (cCharAt13 << i43);
/* 134 */                   i41 = i34;
                        }
/* 135 */               if (iCharAt5 == 0) {
/* 139 */                   iCharAt4 = 0;
/* 140 */                   i7 = 0;
/* 141 */                   iCharAt = 0;
/* 142 */                   iCharAt2 = 0;
/* 143 */                   iCharAt3 = 0;
/* 144 */                   i8 = 0;
/* 137 */                   iArr = i1o0I00.I000OiO;
/* 147 */                   i6 = 0;
                        } else {
/* 151 */                   int i44 = i41 + 1;
/* 153 */                   int iCharAt6 = str.charAt(i41);
/* 157 */                   if (iCharAt6 >= 55296) {
/* 159 */                       int i45 = iCharAt6 & 8191;
/* 161 */                       int i46 = 13;
                                while (true) {
/* 163 */                           i16 = i44 + 1;
/* 165 */                           cCharAt8 = str.charAt(i44);
/* 169 */                           if (cCharAt8 < 55296) {
                                        break;
                                    }
/* 174 */                           i45 |= (cCharAt8 & 8191) << i46;
/* 175 */                           i46 += 13;
/* 177 */                           i44 = i16;
                                }
/* 180 */                       iCharAt6 = i45 | (cCharAt8 << i46);
/* 181 */                       i44 = i16;
                            }
/* 182 */                   int i47 = i44 + 1;
/* 184 */                   int iCharAt7 = str.charAt(i44);
/* 188 */                   if (iCharAt7 >= 55296) {
/* 190 */                       int i48 = iCharAt7 & 8191;
/* 192 */                       int i49 = 13;
                                while (true) {
/* 194 */                           i15 = i47 + 1;
/* 196 */                           cCharAt7 = str.charAt(i47);
/* 200 */                           if (cCharAt7 < 55296) {
                                        break;
                                    }
/* 205 */                           i48 |= (cCharAt7 & 8191) << i49;
/* 206 */                           i49 += 13;
/* 208 */                           i47 = i15;
                                }
/* 211 */                       iCharAt7 = i48 | (cCharAt7 << i49);
/* 212 */                       i47 = i15;
                            }
/* 213 */                   int i50 = i47 + 1;
/* 215 */                   iCharAt = str.charAt(i47);
/* 219 */                   if (iCharAt >= 55296) {
/* 221 */                       int i51 = iCharAt & 8191;
/* 223 */                       int i52 = 13;
                                while (true) {
/* 225 */                           i14 = i50 + 1;
/* 227 */                           cCharAt6 = str.charAt(i50);
/* 231 */                           if (cCharAt6 < 55296) {
                                        break;
                                    }
/* 236 */                           i51 |= (cCharAt6 & 8191) << i52;
/* 237 */                           i52 += 13;
/* 239 */                           i50 = i14;
                                }
/* 243 */                       iCharAt = i51 | (cCharAt6 << i52);
/* 244 */                       i50 = i14;
                            }
/* 246 */                   int i53 = i50 + 1;
/* 248 */                   iCharAt2 = str.charAt(i50);
/* 252 */                   if (iCharAt2 >= 55296) {
/* 254 */                       int i54 = iCharAt2 & 8191;
/* 256 */                       int i55 = 13;
                                while (true) {
/* 258 */                           i13 = i53 + 1;
/* 260 */                           cCharAt5 = str.charAt(i53);
/* 264 */                           if (cCharAt5 < 55296) {
                                        break;
                                    }
/* 270 */                           i54 |= (cCharAt5 & 8191) << i55;
/* 271 */                           i55 += 13;
/* 273 */                           i53 = i13;
                                }
/* 278 */                       iCharAt2 = i54 | (cCharAt5 << i55);
/* 279 */                       i53 = i13;
                            }
/* 281 */                   int i56 = i53 + 1;
/* 283 */                   iCharAt3 = str.charAt(i53);
/* 287 */                   if (iCharAt3 >= 55296) {
/* 289 */                       int i57 = iCharAt3 & 8191;
/* 291 */                       int i58 = i56;
/* 293 */                       int i59 = 13;
                                while (true) {
/* 295 */                           i12 = i58 + 1;
/* 297 */                           cCharAt4 = str.charAt(i58);
/* 301 */                           if (cCharAt4 < 55296) {
                                        break;
                                    }
/* 307 */                           i57 |= (cCharAt4 & 8191) << i59;
/* 308 */                           i59 += 13;
/* 310 */                           i58 = i12;
                                }
/* 315 */                       iCharAt3 = i57 | (cCharAt4 << i59);
/* 316 */                       i2 = i12;
                            } else {
/* 319 */                       i2 = i56;
                            }
/* 321 */                   int i60 = i2 + 1;
/* 323 */                   int iCharAt8 = str.charAt(i2);
/* 327 */                   if (iCharAt8 >= 55296) {
/* 329 */                       int i61 = iCharAt8 & 8191;
/* 331 */                       int i62 = i60;
/* 333 */                       int i63 = 13;
                                while (true) {
/* 335 */                           i11 = i62 + 1;
/* 337 */                           cCharAt3 = str.charAt(i62);
/* 341 */                           if (cCharAt3 < 55296) {
                                        break;
                                    }
/* 347 */                           i61 |= (cCharAt3 & 8191) << i63;
/* 348 */                           i63 += 13;
/* 350 */                           i62 = i11;
                                }
/* 355 */                       iCharAt8 = i61 | (cCharAt3 << i63);
/* 356 */                       i3 = i11;
                            } else {
/* 359 */                       i3 = i60;
                            }
/* 361 */                   int i64 = i3 + 1;
/* 363 */                   int iCharAt9 = str.charAt(i3);
/* 367 */                   if (iCharAt9 >= 55296) {
/* 369 */                       int i65 = iCharAt9 & 8191;
/* 371 */                       int i66 = i64;
/* 373 */                       int i67 = 13;
                                while (true) {
/* 375 */                           i10 = i66 + 1;
/* 377 */                           cCharAt2 = str.charAt(i66);
/* 381 */                           if (cCharAt2 < 55296) {
                                        break;
                                    }
/* 387 */                           i65 |= (cCharAt2 & 8191) << i67;
/* 388 */                           i67 += 13;
/* 390 */                           i66 = i10;
                                }
/* 395 */                       iCharAt9 = i65 | (cCharAt2 << i67);
/* 396 */                       i4 = i10;
                            } else {
/* 399 */                       i4 = i64;
                            }
/* 401 */                   int i68 = i4 + 1;
/* 403 */                   iCharAt4 = str.charAt(i4);
/* 407 */                   if (iCharAt4 >= 55296) {
/* 409 */                       int i69 = iCharAt4 & 8191;
/* 411 */                       int i70 = i68;
/* 413 */                       int i71 = 13;
                                while (true) {
/* 415 */                           i9 = i70 + 1;
/* 417 */                           cCharAt = str.charAt(i70);
/* 421 */                           i5 = iCharAt8;
/* 426 */                           if (cCharAt < 55296) {
                                        break;
                                    }
/* 432 */                           i69 |= (cCharAt & 8191) << i71;
/* 433 */                           i71 += 13;
/* 435 */                           i70 = i9;
/* 437 */                           iCharAt8 = i5;
                                }
/* 442 */                       iCharAt4 = i69 | (cCharAt << i71);
/* 443 */                       i68 = i9;
                            } else {
/* 446 */                       i5 = iCharAt8;
                            }
/* 454 */                   iArr = new int[iCharAt4 + i5 + iCharAt9];
/* 453 */                   i6 = iCharAt6 + iCharAt6 + iCharAt7;
/* 458 */                   i7 = iCharAt6;
/* 459 */                   i41 = i68;
/* 461 */                   i8 = i5;
                        }
/* 463 */               Unsafe unsafe = i1o0I00.I000iOII;
/* 465 */               int i72 = i41;
/* 467 */               Object[] objArr2 = i1oi1i00i0Zzb.I0000Il00O;
/* 471 */               Class<?> cls2 = i1o1lollioo2.getClass();
/* 475 */               int i73 = i7;
/* 477 */               int i74 = iCharAt4 + i8;
/* 479 */               int i75 = i6;
/* 481 */               int i76 = iCharAt3 + iCharAt3;
/* 485 */               int i77 = 3;
/* 489 */               int[] iArr4 = new int[iCharAt3 * 3];
/* 491 */               Object[] objArr3 = new Object[i76];
/* 493 */               concurrentHashMap = concurrentHashMap2;
/* 495 */               int i78 = iCharAt4;
/* 497 */               int i79 = i74;
/* 499 */               int i80 = i72;
/* 501 */               int i81 = 0;
/* 502 */               int i82 = 0;
/* 504 */               while (i80 < length) {
/* 506 */                   int i83 = i80 + 1;
/* 508 */                   int iCharAt10 = str.charAt(i80);
/* 512 */                   int i84 = length;
/* 517 */                   if (iCharAt10 >= 55296) {
/* 519 */                       int i85 = iCharAt10 & 8191;
/* 521 */                       int i86 = i83;
/* 523 */                       int i87 = 13;
                                while (true) {
/* 525 */                           i32 = i86 + 1;
/* 527 */                           cCharAt12 = str.charAt(i86);
/* 531 */                           i33 = i85;
/* 536 */                           if (cCharAt12 < 55296) {
                                        break;
                                    }
/* 542 */                           i85 = i33 | ((cCharAt12 & 8191) << i87);
/* 544 */                           i87 += 13;
/* 546 */                           i86 = i32;
                                }
/* 551 */                       iCharAt10 = i33 | (cCharAt12 << i87);
/* 553 */                       i17 = i32;
                            } else {
/* 556 */                       i17 = i83;
                            }
/* 558 */                   int i88 = i17 + 1;
/* 560 */                   int iCharAt11 = str.charAt(i17);
/* 564 */                   int i89 = iCharAt10;
/* 569 */                   if (iCharAt11 >= 55296) {
/* 571 */                       int i90 = iCharAt11 & 8191;
/* 573 */                       int i91 = i88;
/* 575 */                       int i92 = 13;
                                while (true) {
/* 577 */                           i30 = i91 + 1;
/* 579 */                           cCharAt11 = str.charAt(i91);
/* 583 */                           i31 = i90;
/* 588 */                           if (cCharAt11 < 55296) {
                                        break;
                                    }
/* 594 */                           i90 = i31 | ((cCharAt11 & 8191) << i92);
/* 596 */                           i92 += 13;
/* 598 */                           i91 = i30;
                                }
/* 603 */                       iCharAt11 = i31 | (cCharAt11 << i92);
/* 605 */                       i18 = i30;
                            } else {
/* 608 */                       i18 = i88;
                            }
/* 610 */                   i1oI1I00i0 i1oi1i00i0 = i1oi1i00i0Zzb;
/* 614 */                   if ((iCharAt11 & Barcode.FORMAT_UPC_E) != 0) {
/* 618 */                       iArr[i82] = i81;
/* 616 */                       i82++;
                            }
/* 622 */                   int i93 = iCharAt11 & 255;
/* 624 */                   i1O1lollIOO i1o1lollioo3 = i1o1lollioo2;
/* 626 */                   int i94 = iCharAt11 & Barcode.FORMAT_PDF417;
/* 632 */                   if (i93 >= 51) {
/* 634 */                       int i95 = i18 + 1;
/* 636 */                       int iCharAt12 = str.charAt(i18);
/* 645 */                       if (iCharAt12 >= 55296) {
/* 647 */                           int i96 = iCharAt12 & 8191;
/* 649 */                           int i97 = i95;
/* 651 */                           int i98 = 13;
                                    while (true) {
/* 653 */                               i28 = i97 + 1;
/* 655 */                               cCharAt10 = str.charAt(i97);
/* 659 */                               i29 = i96;
/* 664 */                               if (cCharAt10 < 55296) {
                                            break;
                                        }
/* 670 */                               i96 = i29 | ((cCharAt10 & 8191) << i98);
/* 672 */                               i98 += 13;
/* 674 */                               i97 = i28;
                                    }
/* 679 */                           iCharAt12 = i29 | (cCharAt10 << i98);
/* 681 */                           i26 = i28;
                                } else {
/* 684 */                           i26 = i95;
                                }
/* 686 */                       int i99 = iCharAt12;
                                int i100 = i93 - 51;
/* 690 */                       int i101 = i26;
/* 694 */                       if (i100 == 9 || i100 == 17) {
/* 747 */                           objArr3[OooioIOo1.I001i1lo1io(i81, i77, 1)] = objArr2[i75];
/* 749 */                           i27 = i94;
/* 739 */                           i75++;
                                } else if (i100 != 12) {
/* 736 */                           i27 = i94;
                                } else if (i1oi1i00i0.I00000oIO() == 1 || i94 != 0) {
/* 732 */                           objArr3[OooioIOo1.I001i1lo1io(i81, i77, 1)] = objArr2[i75];
/* 720 */                           i75++;
/* 736 */                           i27 = i94;
                                } else {
/* 718 */                           i27 = 0;
                                }
/* 753 */                       int i102 = i99 + i99;
/* 757 */                       Object obj = objArr2[i102];
/* 759 */                       int i103 = i27;
/* 763 */                       if (obj instanceof Field) {
/* 765 */                           fieldI0010I0i2 = (Field) obj;
                                } else {
/* 770 */                           fieldI0010I0i2 = i1o0I00.I0010I0i(cls2, (String) obj);
/* 774 */                           objArr2[i102] = fieldI0010I0i2;
                                }
/* 780 */                       int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldI0010I0i2);
/* 781 */                       int i104 = i102 + 1;
/* 785 */                       Object obj2 = objArr2[i104];
/* 791 */                       if (obj2 instanceof Field) {
/* 793 */                           fieldI0010I0i3 = (Field) obj2;
                                } else {
/* 798 */                           fieldI0010I0i3 = i1o0I00.I0010I0i(cls2, (String) obj2);
/* 802 */                           objArr2[i104] = fieldI0010I0i3;
                                }
/* 809 */                       i19 = i74;
/* 811 */                       objArr = objArr3;
/* 813 */                       i20 = i101;
/* 815 */                       i22 = 0;
/* 808 */                       iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldI0010I0i3);
/* 820 */                       i23 = iObjectFieldOffset3;
/* 822 */                       i94 = i103;
/* 824 */                       lolio0 = lolio04;
/* 826 */                       iArr2 = iArr;
                            } else {
/* 829 */                       int i105 = i75 + 1;
/* 839 */                       Field fieldI0010I0i4 = i1o0I00.I0010I0i(cls2, (String) objArr2[i75]);
/* 843 */                       lolio0 = lolio04;
/* 847 */                       if (i93 == 9 || i93 == 17) {
/* 853 */                           i19 = i74;
/* 996 */                           objArr3[OooioIOo1.I001i1lo1io(i81, 3, 1)] = fieldI0010I0i4.getType();
                                } else {
/* 861 */                           if (i93 == 27) {
/* 973 */                               i19 = i74;
/* 975 */                               i24 = 3;
/* 976 */                               i25 = 1;
/* 977 */                               i75 += 2;
                                    } else if (i93 == 49) {
/* 867 */                               i75 += 2;
/* 869 */                               i19 = i74;
/* 871 */                               i24 = 3;
/* 872 */                               i25 = 1;
                                    } else {
/* 877 */                               if (i93 == 12 || i93 == 30 || i93 == 44) {
/* 943 */                                   i19 = i74;
/* 946 */                                   if (i1oi1i00i0.I00000oIO() == 1 || i94 != 0) {
/* 959 */                                       i75 += 2;
/* 968 */                                       objArr3[OooioIOo1.I001i1lo1io(i81, 3, 1)] = objArr2[i105];
/* 970 */                                       objArr = objArr3;
                                            } else {
/* 951 */                                       objArr = objArr3;
/* 953 */                                       i75 = i105;
/* 956 */                                       i94 = 0;
                                            }
                                        } else if (i93 == 50) {
/* 892 */                                   int i106 = i75 + 2;
/* 894 */                                   int i107 = i78 + 1;
/* 896 */                                   iArr[i78] = i81;
/* 898 */                                   int i108 = i81 / 3;
/* 902 */                                   int i109 = i108 + i108;
/* 904 */                                   objArr3[i109] = objArr2[i105];
/* 906 */                                   if (i94 != 0) {
/* 910 */                                       i75 += 3;
/* 914 */                                       objArr3[i109 + 1] = objArr2[i106];
/* 916 */                                       objArr = objArr3;
/* 918 */                                       i78 = i107;
                                            } else {
/* 924 */                                       i75 = i106;
/* 926 */                                       objArr = objArr3;
/* 928 */                                       i78 = i107;
/* 931 */                                       i94 = 0;
                                            }
/* 921 */                                   i19 = i74;
                                        } else {
/* 934 */                                   i19 = i74;
                                        }
/* 1006 */                              iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldI0010I0i4);
/* 1009 */                              iObjectFieldOffset2 = 1048575;
/* 1012 */                              if ((iCharAt11 & Barcode.FORMAT_AZTEC) == 0 || i93 > 17) {
/* 1094 */                                  iArr2 = iArr;
/* 1098 */                                  i20 = i18;
/* 1100 */                                  i21 = 0;
                                        } else {
/* 1018 */                                  int i110 = i18 + 1;
/* 1020 */                                  int iCharAt13 = str.charAt(i18);
/* 1027 */                                  if (iCharAt13 >= 55296) {
/* 1029 */                                      int i111 = iCharAt13 & 8191;
/* 1031 */                                      int i112 = 13;
                                                while (true) {
/* 1033 */                                          i20 = i110 + 1;
/* 1035 */                                          cCharAt9 = str.charAt(i110);
/* 1039 */                                          if (cCharAt9 < 55296) {
                                                        break;
                                                    }
/* 1045 */                                          i111 |= (cCharAt9 & 8191) << i112;
/* 1046 */                                          i112 += 13;
/* 1048 */                                          i110 = i20;
                                                }
/* 1053 */                                      iCharAt13 = i111 | (cCharAt9 << i112);
                                            } else {
/* 1055 */                                      i20 = i110;
                                            }
/* 1061 */                                  int i113 = (iCharAt13 / 32) + i73 + i73;
/* 1063 */                                  Object obj3 = objArr2[i113];
/* 1067 */                                  if (obj3 instanceof Field) {
/* 1069 */                                      fieldI0010I0i = (Field) obj3;
                                            } else {
/* 1075 */                                      fieldI0010I0i = i1o0I00.I0010I0i(cls2, (String) obj3);
/* 1079 */                                      objArr2[i113] = fieldI0010I0i;
                                            }
/* 1071 */                                  iArr2 = iArr;
/* 1087 */                                  i21 = iCharAt13 % 32;
/* 1086 */                                  iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldI0010I0i);
                                        }
/* 1103 */                              if (i93 >= 18 || i93 > 49) {
/* 1123 */                                  i22 = i21;
/* 1124 */                                  i23 = iObjectFieldOffset;
                                        } else {
/* 1111 */                                  iArr2[i79] = iObjectFieldOffset;
/* 1115 */                                  i22 = i21;
/* 1116 */                                  i23 = iObjectFieldOffset;
/* 1109 */                                  i79++;
                                        }
                                    }
/* 985 */                           objArr3[OooioIOo1.I001i1lo1io(i81, i24, i25)] = objArr2[i105];
/* 970 */                           objArr = objArr3;
/* 1006 */                          iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldI0010I0i4);
/* 1009 */                          iObjectFieldOffset2 = 1048575;
/* 1012 */                          if ((iCharAt11 & Barcode.FORMAT_AZTEC) == 0) {
/* 1094 */                              iArr2 = iArr;
/* 1098 */                              i20 = i18;
/* 1100 */                              i21 = 0;
/* 1103 */                              if (i93 >= 18) {
/* 1123 */                                  i22 = i21;
/* 1124 */                                  i23 = iObjectFieldOffset;
                                        }
                                    }
                                }
/* 998 */                       objArr = objArr3;
/* 1000 */                      i75 = i105;
/* 1006 */                      iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldI0010I0i4);
/* 1009 */                      iObjectFieldOffset2 = 1048575;
/* 1012 */                      if ((iCharAt11 & Barcode.FORMAT_AZTEC) == 0) {
                                }
                            }
/* 1126 */                  int i114 = i81 + 1;
/* 1128 */                  iArr4[i81] = i89;
/* 1130 */                  int i115 = i81 + 2;
/* 1165 */                  iArr4[i114] = ((iCharAt11 & Barcode.FORMAT_UPC_A) != 0 ? 536870912 : 0) | ((iCharAt11 & Barcode.FORMAT_QR_CODE) != 0 ? 268435456 : 0) | (i94 != 0 ? Integer.MIN_VALUE : 0) | (i93 << 20) | i23;
/* 1167 */                  i81 += 3;
/* 1172 */                  iArr4[i115] = (i22 << 20) | iObjectFieldOffset2;
/* 1174 */                  iArr = iArr2;
/* 1175 */                  objArr3 = objArr;
/* 1177 */                  i1oi1i00i0Zzb = i1oi1i00i0;
/* 1179 */                  length = i84;
/* 1181 */                  i1o1lollioo2 = i1o1lollioo3;
/* 1183 */                  lolio04 = lolio0;
/* 1185 */                  i74 = i19;
/* 1187 */                  i80 = i20;
/* 1189 */                  i77 = 3;
                        }
/* 1204 */              i1o0I00 i1o0i00 = new i1o0I00();
/* 1207 */              i1o0i00.I00000oIO = iArr4;
/* 1211 */              i1o0i00.I00000oOI = objArr3;
/* 1213 */              i1o0i00.I0000Il00O = iCharAt;
/* 1215 */              i1o0i00.I0000O = iCharAt2;
/* 1217 */              i1o0i00.I0001Ioi1lo = iArr;
/* 1219 */              i1o0i00.I000II = iCharAt4;
/* 1223 */              i1o0i00.I000O01llI0 = i74;
/* 1227 */              i1o0i00.I000OOo1O = lolio04;
/* 1231 */              i1o0i00.I0000oI00 = i1o1lollioo2;
/* 1233 */              VarHandle.storeStoreFence();
                        i1o0ioi = i1o0i00;
                    }
/* 1266 */          Charset charset2 = i1l0I01.I00000oIO;
/* 1276 */          i1oIIli1lo1O i1oiili1lo1o2 = (i1oIIli1lo1O) concurrentHashMap.putIfAbsent(cls, i1o0ioi);
                    return i1oiili1lo1o2 != null ? i1oiili1lo1o2 : i1o0ioi;
                }
            }

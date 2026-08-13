            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Field;
            import java.nio.charset.Charset;
            import java.util.concurrent.ConcurrentHashMap;
            import sun.misc.Unsafe;
            
            public final class lO1Ilo0lloiO {
                public static final lO1Ilo0lloiO I0000Il00O;
                public lIlo1lII11 I00000oIO;
                public ConcurrentHashMap I00000oOI;

                static {
/* 3 */             lO1Ilo0lloiO lo1ilo0lloio = new lO1Ilo0lloiO();
/* 11 */            lo1ilo0lloio.I00000oOI = new ConcurrentHashMap();
/* 18 */            lIoio0O1ioo[] lioio0o1iooArr = {l1I0oI.I00lli11, lIlo1lII11.I00000oOI};
/* 32 */            i1Il01 i1il01 = new i1Il01(8);
/* 35 */            i1il01.I00iiI = lioio0o1iooArr;
/* 37 */            VarHandle.storeStoreFence();
/* 40 */            lIlo1lII11 lilo1lii11 = new lIlo1lII11();
/* 43 */            Charset charset = lIOOlo11OOii.I00000oIO;
/* 45 */            lilo1lii11.I00000oIO = i1il01;
/* 47 */            VarHandle.storeStoreFence();
/* 50 */            lo1ilo0lloio.I00000oIO = lilo1lii11;
/* 52 */            VarHandle.storeStoreFence();
/* 55 */            I0000Il00O = lo1ilo0lloio;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:188:0x03fd  */
                /* JADX WARN: Removed duplicated region for block: B:204:0x044d  */
                /* JADX WARN: Removed duplicated region for block: B:210:0x0468  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final lO1liolI0IO I00000oIO(Class cls) {
                    ConcurrentHashMap concurrentHashMap;
                    lO0i0I0Oi1I lo0i0i0oi1i;
                    int i;
                    int iCharAt;
                    int iCharAt2;
                    int i2;
                    int i3;
                    int iCharAt3;
                    int i4;
                    int i5;
                    int i6;
                    int i7;
                    int i8;
                    int[] iArr;
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
                    int i19;
                    int i20;
                    int i21;
                    int iObjectFieldOffset;
                    int iObjectFieldOffset2;
                    int i22;
                    int i23;
                    int i24;
                    int i25;
                    int i26;
                    Field fieldI001lllioOl;
                    char cCharAt9;
                    int i27;
                    int i28;
                    int i29;
                    int i30;
                    Field fieldI001lllioOl2;
                    Field fieldI001lllioOl3;
                    int i31;
                    char cCharAt10;
                    int i32;
                    int i33;
                    char cCharAt11;
                    int i34;
                    int i35;
                    char cCharAt12;
                    int i36;
                    int i37;
                    char cCharAt13;
/* 5 */             Charset charset = lIOOlo11OOii.I00000oIO;
/* 8 */             if (cls == null) {
/* 1313 */              IOOlIIilOl0.I000II("messageType");
/* 7 */                 return null;
                    }
/* 10 */            ConcurrentHashMap concurrentHashMap2 = this.I00000oOI;
/* 16 */            lO1liolI0IO lo1lioli0io = (lO1liolI0IO) concurrentHashMap2.get(cls);
/* 18 */            if (lo1lioli0io != null) {
/* 1310 */              return lo1lioli0io;
                    }
/* 20 */            lIlo1lII11 lilo1lii11 = this.I00000oIO;
/* 22 */            lilo1lii11.getClass();
/* 25 */            o0iOli o0ioli = lOI01O1oI.I00000oIO;
/* 29 */            lIIOO0oi1o.class.isAssignableFrom(cls);
/* 34 */            lO1i1o0O0o lo1i1o0o0oMo39zzb = lilo1lii11.I00000oIO.mo39zzb(cls);
/* 42 */            int iCharAt4 = 0;
/* 49 */            if ((lo1i1o0o0oMo39zzb.I0000O & 2) == 2) {
/* 1265 */              concurrentHashMap = concurrentHashMap2;
/* 1267 */              o0iOli o0ioli2 = lOI01O1oI.I00000oIO;
/* 1269 */              liIoOiiO1Oi liiooiio1oi = lI0Io1iI10OO.I00000oIO;
/* 1273 */              lIoolOoilO lioolooilo = lo1i1o0o0oMo39zzb.I00000oIO;
/* 1277 */              lO0i0I0Oi1I lo0i0i0oi1i2 = new lO0i0I0Oi1I();
/* 1280 */              lo0i0i0oi1i2.I00000oOI = o0ioli2;
/* 1284 */              lo0i0i0oi1i2.I0000Il00O = lioolooilo instanceof lI1oIOl10iIo;
/* 1286 */              lo0i0i0oi1i2.I0000O = liiooiio1oi;
/* 1288 */              lo0i0i0oi1i2.I00000oIO = lioolooilo;
/* 1290 */              VarHandle.storeStoreFence();
/* 1293 */              lo0i0i0oi1i = lo0i0i0oi1i2;
                    } else {
/* 51 */                int i38 = lO10OOii.I00000oIO;
/* 53 */                int i39 = lIl1lii1olil.I00000oIO;
/* 55 */                o0iOli o0ioli3 = lOI01O1oI.I00000oIO;
/* 68 */                liIoOiiO1Oi liiooiio1oi2 = lo1i1o0o0oMo39zzb.I00000oIO() + (-1) != 1 ? lI0Io1iI10OO.I00000oIO : null;
/* 69 */                int i40 = lIoO0il1iIi.I00000oIO;
/* 71 */                int[] iArr2 = lO0Oi0.I000l1;
/* 75 */                if (!(lo1i1o0o0oMo39zzb instanceof lO1i1o0O0o)) {
/* 1259 */                  OIiilo1Ool0o.I00000oIO();
/* 7 */                     return null;
                        }
/* 77 */                lIoolOoilO lioolooilo2 = lo1i1o0o0oMo39zzb.I00000oIO;
/* 79 */                String str = lo1i1o0o0oMo39zzb.I00000oOI;
/* 81 */                int length = str.length();
/* 92 */                if (str.charAt(0) >= 55296) {
/* 94 */                    int i41 = 1;
                            while (true) {
/* 95 */                        i = i41 + 1;
/* 101 */                       if (str.charAt(i41) < 55296) {
                                    break;
                                }
/* 103 */                       i41 = i;
                            }
                        } else {
/* 105 */                   i = 1;
                        }
/* 106 */               int i42 = i + 1;
/* 108 */               int iCharAt5 = str.charAt(i);
/* 112 */               if (iCharAt5 >= 55296) {
/* 114 */                   int i43 = iCharAt5 & 8191;
/* 116 */                   int i44 = 13;
                            while (true) {
/* 118 */                       i37 = i42 + 1;
/* 120 */                       cCharAt13 = str.charAt(i42);
/* 124 */                       if (cCharAt13 < 55296) {
                                    break;
                                }
/* 129 */                       i43 |= (cCharAt13 & 8191) << i44;
/* 130 */                       i44 += 13;
/* 132 */                       i42 = i37;
                            }
/* 135 */                   iCharAt5 = i43 | (cCharAt13 << i44);
/* 136 */                   i42 = i37;
                        }
/* 137 */               if (iCharAt5 == 0) {
/* 139 */                   iArr = lO0Oi0.I000l1;
/* 141 */                   i8 = 0;
/* 142 */                   iCharAt3 = 0;
/* 143 */                   iCharAt = 0;
/* 144 */                   iCharAt2 = 0;
/* 145 */                   i9 = 0;
/* 147 */                   i5 = 0;
                        } else {
/* 151 */                   int i45 = i42 + 1;
/* 153 */                   int iCharAt6 = str.charAt(i42);
/* 157 */                   if (iCharAt6 >= 55296) {
/* 159 */                       int i46 = iCharAt6 & 8191;
/* 161 */                       int i47 = 13;
                                while (true) {
/* 163 */                           i16 = i45 + 1;
/* 165 */                           cCharAt8 = str.charAt(i45);
/* 169 */                           if (cCharAt8 < 55296) {
                                        break;
                                    }
/* 174 */                           i46 |= (cCharAt8 & 8191) << i47;
/* 175 */                           i47 += 13;
/* 177 */                           i45 = i16;
                                }
/* 180 */                       iCharAt6 = i46 | (cCharAt8 << i47);
/* 181 */                       i45 = i16;
                            }
/* 182 */                   int i48 = i45 + 1;
/* 184 */                   int iCharAt7 = str.charAt(i45);
/* 188 */                   if (iCharAt7 >= 55296) {
/* 190 */                       int i49 = iCharAt7 & 8191;
/* 192 */                       int i50 = 13;
                                while (true) {
/* 194 */                           i15 = i48 + 1;
/* 196 */                           cCharAt7 = str.charAt(i48);
/* 200 */                           if (cCharAt7 < 55296) {
                                        break;
                                    }
/* 205 */                           i49 |= (cCharAt7 & 8191) << i50;
/* 206 */                           i50 += 13;
/* 208 */                           i48 = i15;
                                }
/* 212 */                       iCharAt7 = i49 | (cCharAt7 << i50);
/* 213 */                       i48 = i15;
                            }
/* 215 */                   int i51 = i48 + 1;
/* 217 */                   iCharAt = str.charAt(i48);
/* 221 */                   if (iCharAt >= 55296) {
/* 223 */                       int i52 = iCharAt & 8191;
/* 225 */                       int i53 = 13;
                                while (true) {
/* 227 */                           i14 = i51 + 1;
/* 229 */                           cCharAt6 = str.charAt(i51);
/* 233 */                           if (cCharAt6 < 55296) {
                                        break;
                                    }
/* 239 */                           i52 |= (cCharAt6 & 8191) << i53;
/* 240 */                           i53 += 13;
/* 242 */                           i51 = i14;
                                }
/* 247 */                       iCharAt = i52 | (cCharAt6 << i53);
/* 248 */                       i51 = i14;
                            }
/* 250 */                   int i54 = i51 + 1;
/* 252 */                   iCharAt2 = str.charAt(i51);
/* 256 */                   if (iCharAt2 >= 55296) {
/* 258 */                       int i55 = iCharAt2 & 8191;
/* 260 */                       int i56 = i54;
/* 262 */                       int i57 = 13;
                                while (true) {
/* 264 */                           i13 = i56 + 1;
/* 266 */                           cCharAt5 = str.charAt(i56);
/* 270 */                           if (cCharAt5 < 55296) {
                                        break;
                                    }
/* 276 */                           i55 |= (cCharAt5 & 8191) << i57;
/* 277 */                           i57 += 13;
/* 279 */                           i56 = i13;
                                }
/* 284 */                       iCharAt2 = i55 | (cCharAt5 << i57);
/* 285 */                       i2 = i13;
                            } else {
/* 288 */                       i2 = i54;
                            }
/* 290 */                   int i58 = i2 + 1;
/* 292 */                   int iCharAt8 = str.charAt(i2);
/* 296 */                   if (iCharAt8 >= 55296) {
/* 298 */                       int i59 = iCharAt8 & 8191;
/* 300 */                       int i60 = i58;
/* 302 */                       int i61 = 13;
                                while (true) {
/* 304 */                           i12 = i60 + 1;
/* 306 */                           cCharAt4 = str.charAt(i60);
/* 310 */                           if (cCharAt4 < 55296) {
                                        break;
                                    }
/* 316 */                           i59 |= (cCharAt4 & 8191) << i61;
/* 317 */                           i61 += 13;
/* 319 */                           i60 = i12;
                                }
/* 324 */                       iCharAt8 = i59 | (cCharAt4 << i61);
/* 325 */                       i3 = i12;
                            } else {
/* 328 */                       i3 = i58;
                            }
/* 330 */                   int i62 = i3 + 1;
/* 332 */                   iCharAt3 = str.charAt(i3);
/* 336 */                   if (iCharAt3 >= 55296) {
/* 338 */                       int i63 = iCharAt3 & 8191;
/* 340 */                       int i64 = i62;
/* 342 */                       int i65 = 13;
                                while (true) {
/* 344 */                           i11 = i64 + 1;
/* 346 */                           cCharAt3 = str.charAt(i64);
/* 350 */                           if (cCharAt3 < 55296) {
                                        break;
                                    }
/* 356 */                           i63 |= (cCharAt3 & 8191) << i65;
/* 357 */                           i65 += 13;
/* 359 */                           i64 = i11;
                                }
/* 364 */                       iCharAt3 = i63 | (cCharAt3 << i65);
/* 365 */                       i4 = i11;
                            } else {
/* 368 */                       i4 = i62;
                            }
/* 370 */                   int i66 = i4 + 1;
/* 372 */                   int iCharAt9 = str.charAt(i4);
/* 376 */                   if (iCharAt9 >= 55296) {
/* 378 */                       int i67 = iCharAt9 & 8191;
/* 380 */                       int i68 = i66;
/* 382 */                       int i69 = 13;
                                while (true) {
/* 384 */                           i10 = i68 + 1;
/* 386 */                           cCharAt2 = str.charAt(i68);
/* 390 */                           i5 = iCharAt8;
/* 395 */                           if (cCharAt2 < 55296) {
                                        break;
                                    }
/* 401 */                           i67 |= (cCharAt2 & 8191) << i69;
/* 402 */                           i69 += 13;
/* 404 */                           i68 = i10;
/* 406 */                           iCharAt8 = i5;
                                }
/* 411 */                       iCharAt9 = i67 | (cCharAt2 << i69);
/* 412 */                       i6 = i10;
                            } else {
/* 415 */                       i5 = iCharAt8;
/* 417 */                       i6 = i66;
                            }
/* 419 */                   int i70 = i6 + 1;
/* 421 */                   iCharAt4 = str.charAt(i6);
/* 425 */                   int i71 = iCharAt9;
/* 427 */                   char c = 55296;
/* 430 */                   if (iCharAt4 >= 55296) {
/* 432 */                       int i72 = iCharAt4 & 8191;
/* 434 */                       int i73 = 13;
                                while (true) {
/* 436 */                           i7 = i70 + 1;
/* 438 */                           cCharAt = str.charAt(i70);
/* 442 */                           if (cCharAt < c) {
                                        break;
                                    }
/* 448 */                           i72 |= (cCharAt & 8191) << i73;
/* 449 */                           i73 += 13;
/* 451 */                           i70 = i7;
/* 453 */                           c = 55296;
                                }
/* 459 */                       iCharAt4 = i72 | (cCharAt << i73);
                            } else {
/* 461 */                       i7 = i70;
                            }
/* 469 */                   i8 = iCharAt6 + iCharAt6 + iCharAt7;
/* 470 */                   iArr = new int[iCharAt4 + iCharAt3 + i71];
/* 472 */                   i9 = iCharAt6;
/* 474 */                   i42 = i7;
                        }
/* 476 */               Unsafe unsafe = lO0Oi0.I000lI;
/* 478 */               int i74 = i42;
/* 480 */               Object[] objArr = lo1i1o0o0oMo39zzb.I0000Il00O;
/* 484 */               Class<?> cls2 = lioolooilo2.getClass();
/* 488 */               int i75 = iCharAt3 + iCharAt4;
/* 489 */               int i76 = i8;
/* 493 */               int i77 = 3;
/* 497 */               int[] iArr3 = new int[i5 * 3];
/* 499 */               Object[] objArr2 = new Object[i5 + i5];
/* 503 */               concurrentHashMap = concurrentHashMap2;
/* 505 */               int i78 = iCharAt4;
/* 507 */               int i79 = i75;
/* 509 */               int i80 = i74;
/* 511 */               int i81 = 0;
/* 512 */               int i82 = 0;
/* 514 */               while (i80 < length) {
/* 516 */                   int i83 = i80 + 1;
/* 518 */                   int iCharAt10 = str.charAt(i80);
/* 522 */                   int i84 = length;
/* 527 */                   if (iCharAt10 >= 55296) {
/* 529 */                       int i85 = iCharAt10 & 8191;
/* 531 */                       int i86 = i83;
/* 533 */                       int i87 = 13;
                                while (true) {
/* 535 */                           i35 = i86 + 1;
/* 537 */                           cCharAt12 = str.charAt(i86);
/* 541 */                           i36 = i85;
/* 546 */                           if (cCharAt12 < 55296) {
                                        break;
                                    }
/* 552 */                           i85 = i36 | ((cCharAt12 & 8191) << i87);
/* 554 */                           i87 += 13;
/* 556 */                           i86 = i35;
                                }
/* 561 */                       iCharAt10 = i36 | (cCharAt12 << i87);
/* 563 */                       i17 = i35;
                            } else {
/* 566 */                       i17 = i83;
                            }
/* 568 */                   int i88 = i17 + 1;
/* 570 */                   int iCharAt11 = str.charAt(i17);
/* 574 */                   int i89 = iCharAt10;
/* 579 */                   if (iCharAt11 >= 55296) {
/* 581 */                       int i90 = iCharAt11 & 8191;
/* 583 */                       int i91 = i88;
/* 585 */                       int i92 = 13;
                                while (true) {
/* 587 */                           i33 = i91 + 1;
/* 589 */                           cCharAt11 = str.charAt(i91);
/* 593 */                           i34 = i90;
/* 598 */                           if (cCharAt11 < 55296) {
                                        break;
                                    }
/* 604 */                           i90 = i34 | ((cCharAt11 & 8191) << i92);
/* 606 */                           i92 += 13;
/* 608 */                           i91 = i33;
                                }
/* 613 */                       iCharAt11 = i34 | (cCharAt11 << i92);
/* 615 */                       i18 = i33;
                            } else {
/* 618 */                       i18 = i88;
                            }
/* 620 */                   liIoOiiO1Oi liiooiio1oi3 = liiooiio1oi2;
/* 624 */                   if ((iCharAt11 & Barcode.FORMAT_UPC_E) != 0) {
/* 628 */                       iArr[i82] = i81;
/* 626 */                       i82++;
                            }
/* 632 */                   int i93 = iCharAt11 & 255;
/* 634 */                   o0iOli o0ioli4 = o0ioli3;
/* 636 */                   int i94 = iCharAt11 & Barcode.FORMAT_PDF417;
/* 642 */                   if (i93 >= 51) {
/* 644 */                       int i95 = i18 + 1;
/* 646 */                       int iCharAt12 = str.charAt(i18);
/* 655 */                       if (iCharAt12 >= 55296) {
/* 657 */                           int i96 = iCharAt12 & 8191;
/* 659 */                           int i97 = i95;
/* 661 */                           int i98 = 13;
                                    while (true) {
/* 663 */                               i31 = i97 + 1;
/* 665 */                               cCharAt10 = str.charAt(i97);
/* 669 */                               i32 = i96;
/* 674 */                               if (cCharAt10 < 55296) {
                                            break;
                                        }
/* 680 */                               i96 = i32 | ((cCharAt10 & 8191) << i98);
/* 682 */                               i98 += 13;
/* 684 */                               i97 = i31;
                                    }
/* 689 */                           iCharAt12 = i32 | (cCharAt10 << i98);
/* 691 */                           i29 = i31;
                                } else {
/* 694 */                           i29 = i95;
                                }
/* 696 */                       int i99 = iCharAt12;
                                int i100 = i93 - 51;
/* 700 */                       int i101 = i29;
/* 704 */                       if (i100 == 9 || i100 == 17) {
/* 757 */                           objArr2[OooioIOo1.I001i1lo1io(i81, i77, 1)] = objArr[i76];
/* 759 */                           i30 = i94;
/* 749 */                           i76++;
                                } else if (i100 != 12) {
/* 746 */                           i30 = i94;
                                } else if (lo1i1o0o0oMo39zzb.I00000oIO() == 1 || i94 != 0) {
/* 742 */                           objArr2[OooioIOo1.I001i1lo1io(i81, i77, 1)] = objArr[i76];
/* 730 */                           i76++;
/* 746 */                           i30 = i94;
                                } else {
/* 728 */                           i30 = 0;
                                }
/* 763 */                       int i102 = i99 + i99;
/* 767 */                       Object obj = objArr[i102];
/* 769 */                       int i103 = i30;
/* 773 */                       if (obj instanceof Field) {
/* 775 */                           fieldI001lllioOl2 = (Field) obj;
                                } else {
/* 780 */                           fieldI001lllioOl2 = lO0Oi0.I001lllioOl(cls2, (String) obj);
/* 784 */                           objArr[i102] = fieldI001lllioOl2;
                                }
/* 790 */                       int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldI001lllioOl2);
/* 791 */                       int i104 = i102 + 1;
/* 795 */                       Object obj2 = objArr[i104];
/* 801 */                       if (obj2 instanceof Field) {
/* 803 */                           fieldI001lllioOl3 = (Field) obj2;
                                } else {
/* 808 */                           fieldI001lllioOl3 = lO0Oi0.I001lllioOl(cls2, (String) obj2);
/* 812 */                           objArr[i104] = fieldI001lllioOl3;
                                }
/* 819 */                       i20 = iCharAt4;
/* 821 */                       i21 = iCharAt;
/* 823 */                       i22 = iCharAt2;
/* 824 */                       i23 = i101;
/* 826 */                       i25 = 0;
/* 818 */                       iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldI001lllioOl3);
/* 831 */                       i26 = iObjectFieldOffset3;
/* 833 */                       i94 = i103;
/* 835 */                       i19 = i75;
                            } else {
/* 839 */                       int i105 = i76 + 1;
/* 849 */                       Field fieldI001lllioOl4 = lO0Oi0.I001lllioOl(cls2, (String) objArr[i76]);
/* 853 */                       i19 = i75;
/* 857 */                       if (i93 == 9 || i93 == 17) {
/* 863 */                           i20 = iCharAt4;
/* 1004 */                          objArr2[OooioIOo1.I001i1lo1io(i81, 3, 1)] = fieldI001lllioOl4.getType();
                                } else {
/* 871 */                           if (i93 == 27) {
/* 981 */                               i20 = iCharAt4;
/* 983 */                               i27 = 1;
/* 984 */                               i28 = 3;
/* 985 */                               i76 += 2;
                                    } else if (i93 == 49) {
/* 877 */                               i76 += 2;
/* 879 */                               i20 = iCharAt4;
/* 881 */                               i27 = 1;
/* 882 */                               i28 = 3;
                                    } else {
/* 887 */                               if (i93 == 12 || i93 == 30 || i93 == 44) {
/* 952 */                                   i20 = iCharAt4;
/* 955 */                                   if (lo1i1o0o0oMo39zzb.I00000oIO() == 1 || i94 != 0) {
/* 967 */                                       i76 += 2;
/* 976 */                                       objArr2[OooioIOo1.I001i1lo1io(i81, 3, 1)] = objArr[i105];
/* 978 */                                       i21 = iCharAt;
                                            } else {
/* 960 */                                       i21 = iCharAt;
/* 962 */                                       i76 = i105;
/* 964 */                                       i94 = 0;
                                            }
                                        } else if (i93 == 50) {
/* 902 */                                   int i106 = i76 + 2;
/* 904 */                                   int i107 = i78 + 1;
/* 906 */                                   iArr[i78] = i81;
/* 908 */                                   int i108 = i81 / 3;
/* 912 */                                   int i109 = i108 + i108;
/* 914 */                                   objArr2[i109] = objArr[i105];
/* 916 */                                   if (i94 != 0) {
/* 920 */                                       i76 += 3;
/* 924 */                                       objArr2[i109 + 1] = objArr[i106];
/* 926 */                                       i21 = iCharAt;
/* 928 */                                       i78 = i107;
                                            } else {
/* 934 */                                       i76 = i106;
/* 936 */                                       i21 = iCharAt;
/* 938 */                                       i78 = i107;
/* 940 */                                       i94 = 0;
                                            }
/* 930 */                                   i20 = iCharAt4;
                                        } else {
/* 943 */                                   i20 = iCharAt4;
                                        }
/* 1014 */                              iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldI001lllioOl4);
/* 1017 */                              iObjectFieldOffset2 = 1048575;
/* 1020 */                              if ((iCharAt11 & Barcode.FORMAT_AZTEC) == 0 || i93 > 17) {
/* 1102 */                                  i22 = iCharAt2;
/* 1106 */                                  i23 = i18;
/* 1108 */                                  i24 = 0;
                                        } else {
/* 1026 */                                  int i110 = i18 + 1;
/* 1028 */                                  int iCharAt13 = str.charAt(i18);
/* 1035 */                                  if (iCharAt13 >= 55296) {
/* 1037 */                                      int i111 = iCharAt13 & 8191;
/* 1039 */                                      int i112 = 13;
                                                while (true) {
/* 1041 */                                          i23 = i110 + 1;
/* 1043 */                                          cCharAt9 = str.charAt(i110);
/* 1047 */                                          if (cCharAt9 < 55296) {
                                                        break;
                                                    }
/* 1053 */                                          i111 |= (cCharAt9 & 8191) << i112;
/* 1054 */                                          i112 += 13;
/* 1056 */                                          i110 = i23;
                                                }
/* 1061 */                                      iCharAt13 = i111 | (cCharAt9 << i112);
                                            } else {
/* 1063 */                                      i23 = i110;
                                            }
/* 1069 */                                  int i113 = (iCharAt13 / 32) + i9 + i9;
/* 1071 */                                  Object obj3 = objArr[i113];
/* 1075 */                                  if (obj3 instanceof Field) {
/* 1077 */                                      fieldI001lllioOl = (Field) obj3;
                                            } else {
/* 1083 */                                      fieldI001lllioOl = lO0Oi0.I001lllioOl(cls2, (String) obj3);
/* 1087 */                                      objArr[i113] = fieldI001lllioOl;
                                            }
/* 1079 */                                  i22 = iCharAt2;
/* 1095 */                                  i24 = iCharAt13 % 32;
/* 1094 */                                  iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldI001lllioOl);
                                        }
/* 1111 */                              if (i93 >= 18 || i93 > 49) {
/* 1131 */                                  i25 = i24;
/* 1132 */                                  i26 = iObjectFieldOffset;
                                        } else {
/* 1119 */                                  iArr[i79] = iObjectFieldOffset;
/* 1123 */                                  i25 = i24;
/* 1124 */                                  i26 = iObjectFieldOffset;
/* 1117 */                                  i79++;
                                        }
                                    }
/* 993 */                           objArr2[OooioIOo1.I001i1lo1io(i81, i28, i27)] = objArr[i105];
/* 978 */                           i21 = iCharAt;
/* 1014 */                          iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldI001lllioOl4);
/* 1017 */                          iObjectFieldOffset2 = 1048575;
/* 1020 */                          if ((iCharAt11 & Barcode.FORMAT_AZTEC) == 0) {
/* 1102 */                              i22 = iCharAt2;
/* 1106 */                              i23 = i18;
/* 1108 */                              i24 = 0;
/* 1111 */                              if (i93 >= 18) {
/* 1131 */                                  i25 = i24;
/* 1132 */                                  i26 = iObjectFieldOffset;
                                        }
                                    }
                                }
/* 1006 */                      i21 = iCharAt;
/* 1008 */                      i76 = i105;
/* 1014 */                      iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldI001lllioOl4);
/* 1017 */                      iObjectFieldOffset2 = 1048575;
/* 1020 */                      if ((iCharAt11 & Barcode.FORMAT_AZTEC) == 0) {
                                }
                            }
/* 1134 */                  int i114 = i81 + 1;
/* 1136 */                  iArr3[i81] = i89;
/* 1138 */                  int i115 = i81 + 2;
/* 1140 */                  int i116 = i81;
/* 1172 */                  iArr3[i114] = ((iCharAt11 & Barcode.FORMAT_UPC_A) != 0 ? 536870912 : 0) | ((iCharAt11 & Barcode.FORMAT_QR_CODE) != 0 ? 268435456 : 0) | (i94 != 0 ? Integer.MIN_VALUE : 0) | (i93 << 20) | i26;
/* 1174 */                  i81 = i116 + 3;
/* 1179 */                  iArr3[i115] = (i25 << 20) | iObjectFieldOffset2;
/* 1181 */                  iCharAt2 = i22;
/* 1182 */                  iCharAt = i21;
/* 1184 */                  liiooiio1oi2 = liiooiio1oi3;
/* 1186 */                  length = i84;
/* 1188 */                  o0ioli3 = o0ioli4;
/* 1190 */                  i75 = i19;
/* 1192 */                  iCharAt4 = i20;
/* 1194 */                  i80 = i23;
/* 1196 */                  i77 = 3;
                        }
/* 1200 */              o0iOli o0ioli5 = o0ioli3;
/* 1202 */              liIoOiiO1Oi liiooiio1oi4 = liiooiio1oi2;
/* 1204 */              int i117 = iCharAt4;
/* 1206 */              int i118 = i75;
/* 1213 */              lO0Oi0 lo0oi0 = new lO0Oi0();
/* 1216 */              lo0oi0.I00000oIO = iArr3;
/* 1218 */              lo0oi0.I00000oOI = objArr2;
/* 1220 */              lo0oi0.I0000Il00O = iCharAt;
/* 1222 */              lo0oi0.I0000O = iCharAt2;
/* 1233 */              lo0oi0.I0001Ioi1lo = liiooiio1oi4 != null && (lioolooilo2 instanceof lI1oIOl10iIo);
/* 1235 */              lo0oi0.I000II = iArr;
/* 1239 */              lo0oi0.I000O01llI0 = i117;
/* 1243 */              lo0oi0.I000OOo1O = i118;
/* 1247 */              lo0oi0.I000OiO = o0ioli5;
/* 1251 */              lo0oi0.I000iOII = liiooiio1oi4;
/* 1253 */              lo0oi0.I0000oI00 = lioolooilo2;
/* 1255 */              VarHandle.storeStoreFence();
                        lo0i0i0oi1i = lo0oi0;
                    }
/* 1294 */          Charset charset2 = lIOOlo11OOii.I00000oIO;
/* 1304 */          lO1liolI0IO lo1lioli0io2 = (lO1liolI0IO) concurrentHashMap.putIfAbsent(cls, lo0i0i0oi1i);
                    return lo1lioli0io2 == null ? lo0i0i0oi1i : lo1lioli0io2;
                }
            }

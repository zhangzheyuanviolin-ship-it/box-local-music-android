            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            
            public final class O0li0o {
                public final OI10I1IoI0Ol I00000oIO;
                public I00Ol00 I00000oOI;
                public int I0000Il00O;
                public final OI10IIO I0000O;
                public final ArrayList I0000oI00;
                public final ArrayList I0001Ioi1lo;
                public final ArrayList I000II;
                public final ArrayList I000O01llI0;
                public final ArrayList I000OOo1O;
                public IiiO11O I000OiO;

                public O0li0o() {
/* 4 */             long[] jArr = OiO10oio.I00000oIO;
/* 11 */            this.I00000oIO = new OI10I1IoI0Ol();
/* 13 */            OI10IIO oi10iio = OiO11lliO.I00000oIO;
/* 20 */            this.I0000O = new OI10IIO();
/* 27 */            this.I0000oI00 = new ArrayList();
/* 34 */            this.I0001Ioi1lo = new ArrayList();
/* 41 */            this.I000II = new ArrayList();
/* 48 */            this.I000O01llI0 = new ArrayList();
/* 55 */            this.I000OOo1O = new ArrayList();
                }

                public static void I0000Il00O(O0lilO o0lilO, int i, O0lOoio0l11 o0lOoio0l11, boolean z) {
/* 1 */             int i2 = 0;
/* 2 */             long jI000II = o0lilO.I000II(0);
/* 15 */            long jI00000oOI = z ? IooO0O.I00000oOI(0, i, 1, jI000II) : IooO0O.I00000oOI(i, 0, 2, jI000II);
/* 19 */            O0lOll0I0o00[] o0lOll0I0o00Arr = o0lOoio0l11.I00000oIO;
/* 21 */            int length = o0lOll0I0o00Arr.length;
/* 22 */            int i3 = 0;
/* 23 */            while (i2 < length) {
/* 25 */                O0lOll0I0o00 o0lOll0I0o00 = o0lOll0I0o00Arr[i2];
/* 27 */                int i4 = i3 + 1;
/* 29 */                if (o0lOll0I0o00 != null) {
/* 43 */                    o0lOll0I0o00.I000l1 = IooO0O.I0000oI00(jI00000oOI, IooO0O.I0000O(o0lilO.I000II(i3), jI000II));
                        }
/* 45 */                i2++;
/* 47 */                i3 = i4;
                    }
                }

                public static int I000O01llI0(int[] iArr, O0lilO o0lilO, boolean z) {
/* 1 */             int iI000O01llI0 = o0lilO.I000O01llI0();
/* 9 */             int iI00000oOI = o0lilO.I00000oOI() + iI000O01llI0;
/* 10 */            int iMax = 0;
/* 11 */            while (iI000O01llI0 < iI00000oOI) {
/* 19 */                int iI00000oIO = iIoOII.I00000oIO(o0lilO, z) + iArr[iI000O01llI0];
/* 20 */                iArr[iI000O01llI0] = iI00000oIO;
/* 22 */                iMax = Math.max(iMax, iI00000oIO);
/* 26 */                iI000O01llI0++;
                    }
/* 98 */            return iMax;
                }

                public final O0lOll0I0o00 I00000oIO(int i, Object obj) {
                    O0lOll0I0o00[] o0lOll0I0o00Arr;
/* 7 */             O0lOoio0l11 o0lOoio0l11 = (O0lOoio0l11) this.I00000oIO.I000II(obj);
/* 9 */             if (o0lOoio0l11 == null || (o0lOll0I0o00Arr = o0lOoio0l11.I00000oIO) == null) {
/* 18 */                return null;
                    }
/* 15 */            return o0lOll0I0o00Arr[i];
                }

                public final long I00000oOI() {
/* 1 */             ArrayList arrayList = this.I000OOo1O;
/* 3 */             int size = arrayList.size();
/* 7 */             long jMax = 0;
/* 10 */            for (int i = 0; i < size; i++) {
/* 16 */                O0lOll0I0o00 o0lOll0I0o00 = (O0lOll0I0o00) arrayList.get(i);
/* 18 */                Io10IOI io10IOI = o0lOll0I0o00.I000oI1ioi;
/* 20 */                if (io10IOI != null) {
/* 64 */                    jMax = (Math.max((int) (jMax & 4294967295L), ((int) (o0lOll0I0o00.I000l1 & 4294967295L)) + ((int) (io10IOI.I001IIilI0O & 4294967295L))) & 4294967295L) | (Math.max((int) (jMax >> 32), ((int) (o0lOll0I0o00.I000l1 >> 32)) + ((int) (io10IOI.I001IIilI0O >> 32))) << 32);
                        }
                    }
/* 110 */           return jMax;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:175:0x03e8  */
                /* JADX WARN: Removed duplicated region for block: B:209:0x04cd  */
                /* JADX WARN: Removed duplicated region for block: B:46:0x00ce  */
                /* JADX WARN: Type inference failed for: r13v34, types: [Ii00l101O, Ii01I10] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I0000O(int i, int i2, int i3, ArrayList arrayList, I00Ol00 i00Ol00, I01O1lIi i01O1lIi, boolean z, boolean z2, int i4, boolean z3, int i5, int i6, Ii0110 ii0110, Io10IIII io10IIII) {
                    IOoil1iiIilo iOoil1iiIilo;
                    OI10I1IoI0Ol oI10I1IoI0Ol;
                    long j;
                    ArrayList arrayList2;
                    ArrayList arrayList3;
                    ArrayList arrayList4;
                    OI10IIO oi10iio;
                    ArrayList arrayList5;
                    int[] iArr;
                    ArrayList arrayList6;
                    ArrayList arrayList7;
                    ArrayList arrayList8;
                    I00Ol00 i00Ol002;
                    int i7;
                    int i8;
                    boolean z4;
                    int[] iArr2;
                    int i9;
                    int i10;
                    I00Ol00 i00Ol003;
                    ArrayList arrayList9;
                    OI10IIO oi10iio2;
                    ArrayList arrayList10;
                    int[] iArr3;
                    int i11;
                    int i12;
                    ArrayList arrayList11;
                    ArrayList arrayList12;
                    I00Ol00 i00Ol004;
                    ArrayList arrayList13;
                    int i13;
                    O0lilO o0lilO;
                    int i14;
                    int i15;
                    int i16;
                    IOoil1iiIilo iOoil1iiIilo2;
                    int i17;
                    int i18;
                    int i19;
                    OI10I1IoI0Ol oI10I1IoI0Ol2;
                    long j2;
                    int i20;
                    boolean z5;
                    long j3;
                    int i21;
                    int i22;
                    long j4;
                    long j5;
/* 5 */             ArrayList arrayList14 = arrayList;
/* 9 */             int i23 = i4;
/* 11 */            I00Ol00 i00Ol005 = this.I00000oOI;
/* 13 */            this.I00000oOI = i00Ol00;
/* 15 */            int size = arrayList14.size();
/* 19 */            int i24 = 0;
                    loop0: while (true) {
/* 20 */                iOoil1iiIilo = null;
/* 22 */                oI10I1IoI0Ol = this.I00000oIO;
/* 24 */                if (i24 < size) {
/* 30 */                    O0lilO o0lilO2 = (O0lilO) arrayList14.get(i24);
/* 36 */                    int size2 = o0lilO2.I0000oI00().size();
/* 41 */                    for (int i25 = 0; i25 < size2; i25++) {
/* 53 */                        Object objI00II0Ol1O0l = ((OO1I0001000i) o0lilO2.I0000oI00().get(i25)).I00II0Ol1O0l();
/* 66 */                        if ((objI00II0Ol1O0l instanceof O0lO1IooO0I0 ? (O0lO1IooO0I0) objI00II0Ol1O0l : null) != null) {
                                    break loop0;
                                }
                            }
/* 72 */                    i24++;
                        } else if (oI10I1IoI0Ol.I000OOo1O()) {
/* 81 */                    I0000oI00();
/* 84 */                    return;
                        }
                    }
/* 85 */            int i26 = this.I0000Il00O;
/* 91 */            O0lilO o0lilO3 = (O0lilO) IOOi0Ool1i.I00II0Ol1O0l(arrayList14);
/* 101 */           this.I0000Il00O = o0lilO3 != null ? o0lilO3.getIndex() : 0;
/* 117 */           long j6 = z ? i & 4294967295L : i << 32;
/* 127 */           boolean z6 = z2 || !z3;
/* 129 */           Object[] objArr = oI10I1IoI0Ol.I00000oOI;
/* 131 */           long[] jArr = oI10I1IoI0Ol.I00000oIO;
/* 135 */           int length = jArr.length - 2;
/* 142 */           OI10IIO oi10iio3 = this.I0000O;
/* 149 */           if (length >= 0) {
/* 151 */               int i27 = 0;
                        while (true) {
/* 154 */                   long j7 = jArr[i27];
/* 156 */                   j = j6;
/* 166 */                   if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
/* 173 */                       int i28 = 8 - ((~(i27 - length)) >>> 31);
/* 176 */                       for (int i29 = 0; i29 < i28; i29++) {
/* 182 */                           if ((j7 & 255) < 128) {
/* 188 */                               j5 = j7;
/* 192 */                               oi10iio3.I00000oIO(objArr[(i27 << 3) + i29]);
                                    } else {
/* 196 */                               j5 = j7;
                                    }
/* 198 */                           j7 = j5 >> 8;
                                }
/* 205 */                       if (i28 != 8) {
                                    break;
                                }
/* 207 */                       if (i27 == length) {
                                    break;
                                }
/* 209 */                       i27++;
/* 211 */                       j6 = j;
                            }
                        }
                    } else {
/* 214 */               j = j6;
                    }
/* 216 */           int size3 = arrayList14.size();
/* 220 */           int i30 = 0;
                    while (true) {
/* 221 */               arrayList2 = this.I000OOo1O;
/* 223 */               arrayList3 = this.I0001Ioi1lo;
/* 225 */               arrayList4 = this.I0000oI00;
/* 227 */               if (i30 >= size3) {
                            break;
                        }
/* 233 */               O0lilO o0lilO4 = (O0lilO) arrayList14.get(i30);
/* 239 */               oi10iio3.I000l1(o0lilO4.getKey());
/* 246 */               int size4 = o0lilO4.I0000oI00().size();
/* 250 */               int i31 = 0;
                        while (true) {
/* 251 */                   if (i31 >= size4) {
/* 588 */                       i18 = size3;
/* 590 */                       i19 = i30;
/* 592 */                       oI10I1IoI0Ol2 = oI10I1IoI0Ol;
/* 593 */                       j2 = j;
/* 598 */                       i20 = i26;
/* 604 */                       I0001Ioi1lo(o0lilO4.getKey());
                                break;
                            }
/* 253 */                   i18 = size3;
/* 265 */                   Object objI00II0Ol1O0l2 = ((OO1I0001000i) o0lilO4.I0000oI00().get(i31)).I00II0Ol1O0l();
/* 269 */                   i19 = i30;
/* 280 */                   if ((objI00II0Ol1O0l2 instanceof O0lO1IooO0I0 ? (O0lO1IooO0I0) objI00II0Ol1O0l2 : null) != null) {
/* 290 */                       O0lOoio0l11 o0lOoio0l11 = (O0lOoio0l11) oI10I1IoI0Ol.I000II(o0lilO4.getKey());
/* 304 */                       int iI000O01llI0 = i00Ol005 != null ? i00Ol005.I000O01llI0(o0lilO4.getKey()) : -1;
/* 313 */                       boolean z7 = iI000O01llI0 == -1 && i00Ol005 != null;
/* 315 */                       if (o0lOoio0l11 == null) {
/* 319 */                           O0lOoio0l11 o0lOoio0l112 = new O0lOoio0l11();
/* 322 */                           o0lOoio0l112.I000O01llI0 = this;
/* 326 */                           o0lOoio0l112.I00000oIO = iIoO10loI.I00000oIO;
/* 329 */                           o0lOoio0l112.I0000oI00 = 1;
/* 331 */                           VarHandle.storeStoreFence();
/* 334 */                           z5 = z;
/* 336 */                           oI10I1IoI0Ol2 = oI10I1IoI0Ol;
/* 337 */                           ArrayList arrayList15 = arrayList3;
/* 339 */                           ArrayList arrayList16 = arrayList4;
/* 342 */                           j3 = j;
/* 352 */                           O0lOoio0l11.I00000oOI(o0lOoio0l112, o0lilO4, ii0110, io10IIII, i5, i6, z5);
/* 359 */                           oI10I1IoI0Ol2.I000lI(o0lilO4.getKey(), o0lOoio0l112);
/* 366 */                           if (o0lilO4.getIndex() == iI000O01llI0 || iI000O01llI0 == -1) {
/* 392 */                               long jI000II = o0lilO4.I000II(0);
/* 405 */                               I0000Il00O(o0lilO4, (int) (z5 ? jI000II & 4294967295L : jI000II >> 32), o0lOoio0l112, z5);
/* 408 */                               if (z7) {
/* 414 */                                   for (O0lOll0I0o00 o0lOll0I0o00 : o0lOoio0l112.I00000oIO) {
/* 418 */                                       if (o0lOll0I0o00 != null) {
/* 420 */                                           o0lOll0I0o00.I00000oIO();
                                                }
                                            }
                                        }
                                    } else if (iI000O01llI0 < i26) {
/* 375 */                               arrayList16.add(o0lilO4);
                                    } else {
/* 381 */                               arrayList15.add(o0lilO4);
                                    }
                                } else {
/* 426 */                           z5 = z;
/* 429 */                           oI10I1IoI0Ol2 = oI10I1IoI0Ol;
/* 431 */                           j3 = j;
/* 434 */                           if (z6) {
/* 442 */                               i20 = i26;
/* 444 */                               ArrayList arrayList17 = arrayList2;
/* 449 */                               O0lOoio0l11.I00000oOI(o0lOoio0l11, o0lilO4, ii0110, io10IIII, i5, i6, z5);
/* 454 */                               O0lOll0I0o00[] o0lOll0I0o00Arr = o0lOoio0l11.I00000oIO;
/* 456 */                               int length2 = o0lOll0I0o00Arr.length;
/* 457 */                               int i32 = 0;
/* 458 */                               while (i32 < length2) {
/* 460 */                                   O0lOll0I0o00 o0lOll0I0o002 = o0lOll0I0o00Arr[i32];
/* 462 */                                   if (o0lOll0I0o002 != null) {
/* 464 */                                       long j8 = j3;
/* 468 */                                       i22 = length2;
/* 469 */                                       i21 = i32;
/* 480 */                                       if (IooO0O.I0000Il00O(o0lOll0I0o002.I000l1, 9223372034707292159L)) {
/* 493 */                                           j4 = j8;
                                                } else {
/* 484 */                                           j4 = j8;
/* 490 */                                           o0lOll0I0o002.I000l1 = IooO0O.I0000oI00(o0lOll0I0o002.I000l1, j4);
                                                }
                                            } else {
/* 496 */                                       i21 = i32;
/* 500 */                                       i22 = length2;
/* 501 */                                       j4 = j3;
                                            }
/* 505 */                                   long j9 = j4;
/* 507 */                                   length2 = i22;
/* 508 */                                   j3 = j9;
/* 503 */                                   i32 = i21 + 1;
                                        }
/* 513 */                               j2 = j3;
/* 514 */                               if (z7) {
/* 520 */                                   for (O0lOll0I0o00 o0lOll0I0o003 : o0lOoio0l11.I00000oIO) {
/* 524 */                                       if (o0lOll0I0o003 != null) {
/* 530 */                                           if (o0lOll0I0o003.I00000oOI()) {
/* 532 */                                               arrayList17.remove(o0lOll0I0o003);
/* 535 */                                               IiiO11O iiiO11O = this.I000OiO;
/* 537 */                                               if (iiiO11O != null) {
/* 539 */                                                   il1ollIO0I.I00000oIO(iiiO11O);
                                                        }
                                                    }
/* 542 */                                           o0lOll0I0o003.I00000oIO();
                                                }
                                            }
                                        }
/* 549 */                               I000II(o0lilO4, false);
                                    }
                                }
/* 384 */                       j2 = j3;
/* 386 */                       i20 = i26;
                            } else {
/* 567 */                       i31++;
/* 570 */                       arrayList3 = arrayList3;
/* 571 */                       arrayList2 = arrayList2;
/* 572 */                       i26 = i26;
/* 574 */                       j = j;
/* 580 */                       oI10I1IoI0Ol = oI10I1IoI0Ol;
/* 581 */                       arrayList4 = arrayList4;
/* 582 */                       size3 = i18;
/* 584 */                       i30 = i19;
                            }
                        }
/* 607 */               i30 = i19 + 1;
/* 609 */               arrayList14 = arrayList;
/* 613 */               oI10I1IoI0Ol = oI10I1IoI0Ol2;
/* 614 */               i26 = i20;
/* 616 */               size3 = i18;
/* 618 */               j = j2;
                    }
/* 622 */           ArrayList arrayList18 = arrayList2;
/* 623 */           OI10I1IoI0Ol oI10I1IoI0Ol3 = oI10I1IoI0Ol;
/* 625 */           ArrayList arrayList19 = arrayList4;
/* 626 */           int i33 = 2;
/* 629 */           int[] iArr4 = new int[i23];
/* 631 */           if (z6 && i00Ol005 != null) {
/* 639 */               if (arrayList19.isEmpty()) {
/* 705 */                   i17 = 0;
                        } else {
/* 646 */                   if (arrayList19.size() > 1) {
/* 650 */                       O0lOol1 o0lOol1 = new O0lOol1(i33);
/* 653 */                       o0lOol1.I00iiI = i00Ol005;
/* 655 */                       VarHandle.storeStoreFence();
/* 658 */                       IOOiOil.I000oI1ioi(arrayList19, o0lOol1);
                            }
/* 661 */                   int size5 = arrayList19.size();
/* 666 */                   for (int i34 = 0; i34 < size5; i34++) {
/* 672 */                       O0lilO o0lilO5 = (O0lilO) arrayList19.get(i34);
/* 690 */                       I0000Il00O(o0lilO5, i5 - I000O01llI0(iArr4, o0lilO5, z), (O0lOoio0l11) oI10I1IoI0Ol3.I000II(o0lilO5.getKey()), z);
/* 694 */                       I000II(o0lilO5, false);
                            }
/* 700 */                   i17 = 0;
/* 701 */                   Arrays.fill(iArr4, 0, i23, 0);
                        }
/* 710 */               if (!arrayList3.isEmpty()) {
/* 717 */                   if (arrayList3.size() > 1) {
/* 721 */                       O0lOol1 o0lOol12 = new O0lOol1(i17);
/* 724 */                       o0lOol12.I00iiI = i00Ol005;
/* 726 */                       VarHandle.storeStoreFence();
/* 729 */                       IOOiOil.I000oI1ioi(arrayList3, o0lOol12);
                            }
/* 732 */                   int size6 = arrayList3.size();
/* 737 */                   for (int i35 = 0; i35 < size6; i35++) {
/* 743 */                       O0lilO o0lilO6 = (O0lilO) arrayList3.get(i35);
/* 766 */                       I0000Il00O(o0lilO6, (I000O01llI0(iArr4, o0lilO6, z) + i6) - iIoOII.I00000oIO(o0lilO6, z), (O0lOoio0l11) oI10I1IoI0Ol3.I000II(o0lilO6.getKey()), z);
/* 770 */                       I000II(o0lilO6, false);
                            }
/* 777 */                   Arrays.fill(iArr4, 0, i23, 0);
                        }
                    }
/* 780 */           Object[] objArr2 = oi10iio3.I00000oOI;
/* 782 */           long[] jArr2 = oi10iio3.I00000oIO;
                    int length3 = jArr2.length - 2;
/* 787 */           ArrayList arrayList20 = this.I000O01llI0;
/* 789 */           ArrayList arrayList21 = this.I000II;
/* 791 */           if (length3 >= 0) {
/* 793 */               arrayList6 = arrayList3;
/* 797 */               int i36 = 0;
                        while (true) {
/* 798 */                   long j10 = jArr2[i36];
/* 800 */                   long[] jArr3 = jArr2;
/* 810 */                   if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
/* 819 */                       int i37 = 8 - ((~(i36 - length3)) >>> 31);
/* 821 */                       long j11 = j10;
/* 823 */                       int i38 = 0;
/* 824 */                       while (i38 < i37) {
/* 830 */                           if ((j11 & 255) < 128) {
/* 835 */                               Object obj = objArr2[(i36 << 3) + i38];
/* 841 */                               O0lOoio0l11 o0lOoio0l113 = (O0lOoio0l11) oI10I1IoI0Ol3.I000II(obj);
/* 843 */                               if (o0lOoio0l113 == null) {
/* 1230 */                                  oi10iio2 = oi10iio3;
/* 1232 */                                  arrayList10 = arrayList19;
/* 1234 */                                  iArr3 = iArr4;
/* 1236 */                                  i11 = i38;
/* 1238 */                                  i12 = i36;
/* 1239 */                                  arrayList11 = arrayList20;
/* 1240 */                                  arrayList12 = arrayList21;
/* 1241 */                                  i00Ol004 = i00Ol005;
/* 1243 */                                  arrayList13 = arrayList18;
/* 1249 */                                  i13 = i37;
                                        } else {
/* 847 */                                   oi10iio2 = oi10iio3;
/* 849 */                                   arrayList10 = arrayList19;
/* 853 */                                   int iI000O01llI02 = i00Ol00.I000O01llI0(obj);
/* 857 */                                   i11 = i38;
/* 861 */                                   int iMin = Math.min(i23, o0lOoio0l113.I0000oI00);
/* 865 */                                   o0lOoio0l113.I0000oI00 = iMin;
/* 869 */                                   int i39 = i37;
/* 873 */                                   int iMin2 = Math.min(i23 - iMin, o0lOoio0l113.I0000O);
/* 877 */                                   o0lOoio0l113.I0000O = iMin2;
/* 880 */                                   if (iI000O01llI02 == -1) {
/* 882 */                                       O0lOll0I0o00[] o0lOll0I0o00Arr2 = o0lOoio0l113.I00000oIO;
/* 884 */                                       int length4 = o0lOll0I0o00Arr2.length;
/* 885 */                                       int i40 = 0;
/* 886 */                                       boolean z8 = false;
/* 888 */                                       int i41 = 0;
/* 890 */                                       while (i40 < length4) {
/* 892 */                                           O0lOll0I0o00[] o0lOll0I0o00Arr3 = o0lOll0I0o00Arr2;
/* 894 */                                           O0lOll0I0o00 o0lOll0I0o004 = o0lOll0I0o00Arr3[i40];
/* 896 */                                           int i42 = i41 + 1;
/* 898 */                                           if (o0lOll0I0o004 != null) {
/* 904 */                                               if (o0lOll0I0o004.I00000oOI()) {
/* 906 */                                                   i14 = length4;
/* 908 */                                                   i15 = i40;
/* 910 */                                                   i16 = i36;
/* 912 */                                                   iOoil1iiIilo2 = iOoil1iiIilo;
                                                        } else {
/* 917 */                                                   i14 = length4;
/* 931 */                                                   if (((Boolean) o0lOll0I0o004.I000iOII.getValue()).booleanValue()) {
/* 933 */                                                       o0lOll0I0o004.I0000Il00O();
/* 938 */                                                       o0lOoio0l113.I00000oIO[i41] = iOoil1iiIilo;
/* 940 */                                                       arrayList18.remove(o0lOll0I0o004);
/* 943 */                                                       IiiO11O iiiO11O2 = this.I000OiO;
/* 945 */                                                       if (iiiO11O2 != null) {
/* 947 */                                                           il1ollIO0I.I00000oIO(iiiO11O2);
                                                                }
                                                            } else {
/* 951 */                                                       Io10IOI io10IOI = o0lOll0I0o004.I000oI1ioi;
/* 953 */                                                       if (io10IOI != null) {
/* 957 */                                                           IlIoO1ilo1 ilIoO1ilo1 = o0lOll0I0o004.I0001Ioi1lo;
/* 963 */                                                           if (o0lOll0I0o004.I00000oOI() || ilIoO1ilo1 == null) {
/* 1001 */                                                              i15 = i40;
/* 1003 */                                                              i16 = i36;
/* 1005 */                                                              iOoil1iiIilo2 = iOoil1iiIilo;
                                                                    } else {
/* 972 */                                                               i15 = i40;
/* 976 */                                                               o0lOll0I0o004.I000OiO.setValue(Boolean.TRUE);
/* 990 */                                                               i16 = i36;
/* 994 */                                                               ?? r13 = iOoil1iiIilo;
/* 997 */                                                               iOi1II01i0.I0000O(o0lOll0I0o004.I00000oIO, r13, r13, new IiI110i1O(o0lOll0I0o004, ilIoO1ilo1, io10IOI, iOoil1iiIilo, 18), 3);
                                                                        iOoil1iiIilo2 = r13;
                                                                    }
/* 1012 */                                                          if (o0lOll0I0o004.I00000oOI()) {
/* 1014 */                                                              arrayList18.add(o0lOll0I0o004);
/* 1017 */                                                              IiiO11O iiiO11O3 = this.I000OiO;
                                                                        iOoil1iiIilo2 = iOoil1iiIilo2;
/* 1019 */                                                              if (iiiO11O3 != null) {
/* 1021 */                                                                  il1ollIO0I.I00000oIO(iiiO11O3);
                                                                            iOoil1iiIilo2 = iOoil1iiIilo2;
                                                                        }
                                                                    } else {
/* 1027 */                                                              o0lOll0I0o004.I0000Il00O();
/* 1032 */                                                              o0lOoio0l113.I00000oIO[i41] = iOoil1iiIilo2;
                                                                    }
                                                                }
/* 1044 */                                                      i40 = i15 + 1;
/* 1046 */                                                      i36 = i16;
/* 1048 */                                                      iOoil1iiIilo = iOoil1iiIilo2;
/* 1050 */                                                      o0lOll0I0o00Arr2 = o0lOll0I0o00Arr3;
/* 1052 */                                                      i41 = i42;
/* 1054 */                                                      length4 = i14;
                                                            }
                                                        }
/* 1024 */                                              z8 = true;
/* 1044 */                                              i40 = i15 + 1;
/* 1046 */                                              i36 = i16;
/* 1048 */                                              iOoil1iiIilo = iOoil1iiIilo2;
/* 1050 */                                              o0lOll0I0o00Arr2 = o0lOll0I0o00Arr3;
/* 1052 */                                              i41 = i42;
/* 1054 */                                              length4 = i14;
                                                    } else {
/* 1035 */                                              i14 = length4;
                                                    }
/* 1037 */                                          i15 = i40;
/* 1039 */                                          i16 = i36;
/* 1041 */                                          iOoil1iiIilo2 = iOoil1iiIilo;
/* 1044 */                                          i40 = i15 + 1;
/* 1046 */                                          i36 = i16;
/* 1048 */                                          iOoil1iiIilo = iOoil1iiIilo2;
/* 1050 */                                          o0lOll0I0o00Arr2 = o0lOll0I0o00Arr3;
/* 1052 */                                          i41 = i42;
/* 1054 */                                          length4 = i14;
                                                }
/* 1060 */                                      int i43 = i36;
/* 1065 */                                      if (!z8) {
/* 1067 */                                          I0001Ioi1lo(obj);
                                                }
/* 1070 */                                      i12 = i43;
/* 1072 */                                      iArr3 = iArr4;
/* 1074 */                                      arrayList11 = arrayList20;
/* 1075 */                                      arrayList12 = arrayList21;
/* 1076 */                                      i00Ol004 = i00Ol005;
/* 1078 */                                      arrayList13 = arrayList18;
/* 1080 */                                      i13 = i39;
                                            } else {
/* 1086 */                                      int i44 = i36;
/* 1093 */                                      ArrayList arrayList22 = arrayList20;
/* 1109 */                                      O0lilO o0lilOI00oO101o = i01O1lIi.I00oO101o(iI000O01llI02, iMin2, o0lOoio0l113.I0000oI00, o0lOoio0l113.I00000oOI.I00000oIO);
/* 1115 */                                      o0lilOI00oO101o.I000OiO();
/* 1118 */                                      O0lOll0I0o00[] o0lOll0I0o00Arr4 = o0lOoio0l113.I00000oIO;
/* 1120 */                                      int length5 = o0lOll0I0o00Arr4.length;
/* 1121 */                                      int i45 = 0;
                                                while (true) {
/* 1122 */                                          if (i45 >= length5) {
/* 1155 */                                              o0lilO = o0lilOI00oO101o;
/* 1157 */                                              if (i00Ol005 == null || iI000O01llI02 != i00Ol005.I000O01llI0(obj)) {
                                                            break;
                                                        }
/* 1165 */                                              I0001Ioi1lo(obj);
/* 1168 */                                              i12 = i44;
/* 1170 */                                              iArr3 = iArr4;
/* 1172 */                                              arrayList12 = arrayList21;
/* 1173 */                                              arrayList13 = arrayList18;
/* 1175 */                                              arrayList11 = arrayList22;
/* 1179 */                                              i00Ol004 = i00Ol005;
/* 1181 */                                              i13 = i39;
                                                    } else {
/* 1124 */                                              O0lOll0I0o00 o0lOll0I0o005 = o0lOll0I0o00Arr4[i45];
/* 1126 */                                              if (o0lOll0I0o005 != null) {
/* 1140 */                                                  o0lilO = o0lilOI00oO101o;
/* 1143 */                                                  if (((Boolean) o0lOll0I0o005.I000O01llI0.getValue()).booleanValue()) {
                                                                break;
                                                            }
                                                        } else {
/* 1147 */                                                  o0lilO = o0lilOI00oO101o;
                                                        }
/* 1149 */                                              i45++;
/* 1151 */                                              o0lilOI00oO101o = o0lilO;
                                                    }
                                                }
/* 1186 */                                      i12 = i44;
/* 1194 */                                      arrayList13 = arrayList18;
/* 1196 */                                      O0lilO o0lilO7 = o0lilO;
/* 1200 */                                      iArr3 = iArr4;
/* 1206 */                                      arrayList12 = arrayList21;
/* 1207 */                                      arrayList11 = arrayList22;
/* 1209 */                                      i00Ol004 = i00Ol005;
/* 1211 */                                      i13 = i39;
/* 1213 */                                      o0lOoio0l113.I00000oIO(o0lilO7, ii0110, io10IIII, i5, i6, o0lOoio0l113.I0000Il00O);
/* 1218 */                                      if (iI000O01llI02 < this.I0000Il00O) {
/* 1220 */                                          arrayList12.add(o0lilO7);
                                                } else {
/* 1224 */                                          arrayList11.add(o0lilO7);
                                                }
                                            }
                                        }
                                    }
/* 1251 */                          j11 >>= 8;
/* 1255 */                          arrayList20 = arrayList11;
/* 1256 */                          arrayList21 = arrayList12;
/* 1253 */                          i38 = i11 + 1;
/* 1258 */                          i36 = i12;
/* 1259 */                          i37 = i13;
/* 1260 */                          i00Ol005 = i00Ol004;
/* 1262 */                          arrayList18 = arrayList13;
/* 1264 */                          iArr4 = iArr3;
/* 1266 */                          oi10iio3 = oi10iio2;
/* 1268 */                          arrayList19 = arrayList10;
/* 1270 */                          iOoil1iiIilo = null;
/* 1272 */                          i23 = i4;
                                }
/* 1276 */                      oi10iio = oi10iio3;
/* 1278 */                      arrayList5 = arrayList19;
/* 1280 */                      iArr = iArr4;
/* 1282 */                      i10 = i36;
/* 1283 */                      arrayList7 = arrayList20;
/* 1284 */                      arrayList8 = arrayList21;
/* 1285 */                      i00Ol003 = i00Ol005;
/* 1287 */                      arrayList9 = arrayList18;
/* 1293 */                      i00Ol002 = i00Ol00;
/* 1296 */                      if (i37 != 8) {
                                    break;
                                }
                            } else {
/* 1299 */                      oi10iio = oi10iio3;
/* 1301 */                      arrayList5 = arrayList19;
/* 1303 */                      iArr = iArr4;
/* 1305 */                      i10 = i36;
/* 1306 */                      arrayList7 = arrayList20;
/* 1307 */                      arrayList8 = arrayList21;
/* 1308 */                      i00Ol003 = i00Ol005;
/* 1310 */                      arrayList9 = arrayList18;
/* 1316 */                      i00Ol002 = i00Ol00;
                            }
/* 1318 */                  if (i10 == length3) {
                                break;
                            }
/* 1320 */                  i36 = i10 + 1;
/* 1324 */                  i23 = i4;
/* 1326 */                  arrayList20 = arrayList7;
/* 1327 */                  arrayList21 = arrayList8;
/* 1328 */                  i00Ol005 = i00Ol003;
/* 1330 */                  arrayList18 = arrayList9;
/* 1332 */                  iArr4 = iArr;
/* 1334 */                  jArr2 = jArr3;
/* 1336 */                  oi10iio3 = oi10iio;
/* 1338 */                  arrayList19 = arrayList5;
/* 1340 */                  iOoil1iiIilo = null;
                        }
                    } else {
/* 1344 */              oi10iio = oi10iio3;
/* 1346 */              arrayList5 = arrayList19;
/* 1348 */              iArr = iArr4;
/* 1350 */              arrayList6 = arrayList3;
/* 1352 */              arrayList7 = arrayList20;
/* 1353 */              arrayList8 = arrayList21;
/* 1354 */              i00Ol002 = i00Ol00;
                    }
/* 1360 */          if (arrayList8.isEmpty()) {
/* 1474 */              i7 = i2;
/* 1476 */              i8 = i3;
/* 1478 */              z4 = z;
/* 1480 */              iArr2 = iArr;
                    } else {
/* 1367 */              if (arrayList8.size() > 1) {
/* 1372 */                  O0lOol1 o0lOol13 = new O0lOol1(3);
/* 1375 */                  o0lOol13.I00iiI = i00Ol002;
/* 1377 */                  VarHandle.storeStoreFence();
/* 1380 */                  IOOiOil.I000oI1ioi(arrayList8, o0lOol13);
                        }
/* 1383 */              int size7 = arrayList8.size();
/* 1387 */              int i46 = 0;
/* 1388 */              while (i46 < size7) {
/* 1394 */                  O0lilO o0lilO8 = (O0lilO) arrayList8.get(i46);
/* 1404 */                  O0lOoio0l11 o0lOoio0l114 = (O0lOoio0l11) oI10I1IoI0Ol3.I000II(o0lilO8.getKey());
/* 1408 */                  int[] iArr5 = iArr;
/* 1410 */                  int iI000O01llI03 = I000O01llI0(iArr5, o0lilO8, z);
/* 1414 */                  if (z2) {
/* 1423 */                      long jI000II2 = ((O0lilO) IOOi0Ool1i.I001lllioOl(arrayList)).I000II(0);
/* 1431 */                      i9 = (int) (z ? jI000II2 & 4294967295L : jI000II2 >> 32);
                            } else {
/* 1436 */                      i9 = o0lOoio0l114.I0001Ioi1lo;
                            }
/* 1445 */                  o0lilO8.I000iOII(i9 - iI000O01llI03, o0lOoio0l114.I0000Il00O, i2, i3);
/* 1448 */                  if (z6) {
/* 1451 */                      I000II(o0lilO8, true);
                            }
/* 1454 */                  i46++;
/* 1456 */                  iArr = iArr5;
                        }
/* 1459 */              i7 = i2;
/* 1461 */              i8 = i3;
/* 1463 */              z4 = z;
/* 1467 */              iArr2 = iArr;
/* 1470 */              Arrays.fill(iArr2, 0, i4, 0);
                    }
/* 1486 */          if (!arrayList7.isEmpty()) {
/* 1492 */              int i47 = 1;
/* 1493 */              if (arrayList7.size() > 1) {
/* 1497 */                  O0lOol1 o0lOol14 = new O0lOol1(i47);
/* 1500 */                  o0lOol14.I00iiI = i00Ol002;
/* 1502 */                  VarHandle.storeStoreFence();
/* 1505 */                  IOOiOil.I000oI1ioi(arrayList7, o0lOol14);
                        }
/* 1508 */              int size8 = arrayList7.size();
/* 1513 */              for (int i48 = 0; i48 < size8; i48++) {
/* 1519 */                  O0lilO o0lilO9 = (O0lilO) arrayList7.get(i48);
/* 1529 */                  O0lOoio0l11 o0lOoio0l115 = (O0lOoio0l11) oI10I1IoI0Ol3.I000II(o0lilO9.getKey());
/* 1545 */                  o0lilO9.I000iOII((o0lOoio0l115.I000II - iIoOII.I00000oIO(o0lilO9, z4)) + I000O01llI0(iArr2, o0lilO9, z4), o0lOoio0l115.I0000Il00O, i7, i8);
/* 1549 */                  if (z6) {
/* 1551 */                      I000II(o0lilO9, true);
                            }
                        }
                    }
/* 1557 */          Collections.reverse(arrayList8);
/* 1563 */          arrayList.addAll(0, arrayList8);
/* 1566 */          arrayList.addAll(arrayList7);
/* 1569 */          arrayList5.clear();
/* 1572 */          arrayList6.clear();
/* 1575 */          arrayList8.clear();
/* 1578 */          arrayList7.clear();
/* 1581 */          oi10iio.I00000oOI();
                }

                /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I0000oI00() {
/* 1 */             OI10I1IoI0Ol oI10I1IoI0Ol = this.I00000oIO;
/* 7 */             if (oI10I1IoI0Ol.I000OiO()) {
/* 9 */                 Object[] objArr = oI10I1IoI0Ol.I0000Il00O;
/* 11 */                long[] jArr = oI10I1IoI0Ol.I00000oIO;
                        int length = jArr.length - 2;
/* 16 */                if (length >= 0) {
/* 19 */                    int i = 0;
                            while (true) {
/* 20 */                        long j = jArr[i];
/* 34 */                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 43 */                            int i2 = 8 - ((~(i - length)) >>> 31);
/* 46 */                            for (int i3 = 0; i3 < i2; i3++) {
/* 55 */                                if ((255 & j) < 128) {
/* 68 */                                    for (O0lOll0I0o00 o0lOll0I0o00 : ((O0lOoio0l11) objArr[(i << 3) + i3]).I00000oIO) {
/* 72 */                                        if (o0lOll0I0o00 != null) {
/* 74 */                                            o0lOll0I0o00.I0000Il00O();
                                                }
                                            }
                                        }
/* 80 */                                j >>= 8;
                                    }
/* 84 */                            if (i2 != 8) {
                                        break;
                                    } else if (i == length) {
                                        break;
                                    } else {
/* 88 */                                i++;
                                    }
                                }
                            }
                        }
/* 91 */                oI10I1IoI0Ol.I00000oIO();
                    }
                }

                public final void I0001Ioi1lo(Object obj) {
                    O0lOll0I0o00[] o0lOll0I0o00Arr;
/* 7 */             O0lOoio0l11 o0lOoio0l11 = (O0lOoio0l11) this.I00000oIO.I000iOII(obj);
/* 9 */             if (o0lOoio0l11 == null || (o0lOll0I0o00Arr = o0lOoio0l11.I00000oIO) == null) {
/* 29 */                return;
                    }
/* 17 */            for (O0lOll0I0o00 o0lOll0I0o00 : o0lOll0I0o00Arr) {
/* 21 */                if (o0lOll0I0o00 != null) {
/* 23 */                    o0lOll0I0o00.I0000Il00O();
                        }
                    }
                }

                public final void I000II(O0lilO o0lilO, boolean z) {
/* 13 */            O0lOll0I0o00[] o0lOll0I0o00Arr = ((O0lOoio0l11) this.I00000oIO.I000II(o0lilO.getKey())).I00000oIO;
/* 15 */            int length = o0lOll0I0o00Arr.length;
/* 16 */            int i = 0;
/* 17 */            int i2 = 0;
/* 18 */            while (i < length) {
/* 20 */                O0lOll0I0o00 o0lOll0I0o00 = o0lOll0I0o00Arr[i];
/* 22 */                int i3 = i2 + 1;
/* 24 */                if (o0lOll0I0o00 != null) {
/* 26 */                    OIooliIO0 oIooliIO0 = o0lOll0I0o00.I0010I0i;
/* 28 */                    long jI000II = o0lilO.I000II(i2);
/* 32 */                    long j = o0lOll0I0o00.I000l1;
/* 43 */                    if (!IooO0O.I0000Il00O(j, 9223372034707292159L) && !IooO0O.I0000Il00O(j, jI000II)) {
/* 51 */                        long jI0000O = IooO0O.I0000O(jI000II, j);
/* 56 */                        IlIoO1ilo1 ilIoO1ilo1 = o0lOll0I0o00.I0000oI00;
/* 58 */                        if (ilIoO1ilo1 != null) {
/* 69 */                            long jI0000O2 = IooO0O.I0000O(((IooO0O) oIooliIO0.getValue()).I00000oIO, jI0000O);
/* 77 */                            oIooliIO0.setValue(IooO0O.I00000oIO(jI0000O2));
/* 84 */                            o0lOll0I0o00.I000O01llI0.setValue(Boolean.TRUE);
/* 87 */                            o0lOll0I0o00.I000II = z;
/* 100 */                           iOi1II01i0.I0000O(o0lOll0I0o00.I00000oIO, null, null, new I00oO101o(o0lOll0I0o00, ilIoO1ilo1, jI0000O2, (IOoil1iiIilo) null, 3), 3);
                                }
                            }
/* 103 */                   o0lOll0I0o00.I000l1 = jI000II;
                        }
/* 105 */               i++;
/* 107 */               i2 = i3;
                    }
                }
            }

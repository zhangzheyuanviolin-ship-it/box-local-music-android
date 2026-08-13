            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.Map;
            
            public final class I0o0oo1oOOlO implements O1iOIl0o10 {
                public static final I0o0oo1oOOlO I00000oOI = new I0o0oo1oOOlO(0);
                public static final I0o0oo1oOOlO I0000Il00O = new I0o0oo1oOOlO(1);
                public static final I0o0oo1oOOlO I0000O = new I0o0oo1oOOlO(2);
                public static final I0o0oo1oOOlO I0000oI00 = new I0o0oo1oOOlO(3);
                public static final I0o0oo1oOOlO I0001Ioi1lo = new I0o0oo1oOOlO(4);
                public static final I0o0oo1oOOlO I000II = new I0o0oo1oOOlO(5);
                public static final Iil0iiOiI I000O01llI0 = new Iil0iiOiI(4);
                public static final I0o0oo1oOOlO I000OOo1O = new I0o0oo1oOOlO(6);
                public static final I0o0oo1oOOlO I000OiO = new I0o0oo1oOOlO(7);
                public static final I0o0oo1oOOlO I000iOII = new I0o0oo1oOOlO(8);
                public final int I00000oIO;

                public I0o0oo1oOOlO(int i) {
/* 1 */             this.I00000oIO = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:65:0x011d A[PHI: r7 r8
                  0x011d: PHI (r7v19 int) = (r7v18 int), (r7v24 int), (r7v24 int) binds: [B:67:0x0134, B:61:0x0111, B:63:0x0117] A[DONT_GENERATE, DONT_INLINE]
                  0x011d: PHI (r8v18 int) = (r8v17 int), (r8v23 int), (r8v23 int) binds: [B:67:0x0134, B:61:0x0111, B:63:0x0117] A[DONT_GENERATE, DONT_INLINE]] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final O1iOIo0o0 I00000oOI(O1iOIoOiO0 o1iOIoOiO0, List list, long j) {
                    Object obj;
                    Object obj2;
                    int iI00l0OO0IO;
                    int iMax;
                    int i;
                    int iI00OilO00Il;
/* 9 */             int i2 = this.I00000oIO;
/* 11 */            Map map = Il011I1OiO0I.I00iOIl;
                    switch (i2) {
                        case 0:
/* 782 */                   ArrayList arrayList = new ArrayList(list.size());
/* 788 */                   int size = list.size();
/* 792 */                   int iI000l1 = 0;
/* 793 */                   int iI000iOII = 0;
/* 795 */                   for (int i3 = 0; i3 < size; i3++) {
/* 803 */                       OO1I0001000i oO1I0001000iI001lllioOl = ((O1iIo0ll) list.get(i3)).I001lllioOl(j);
/* 809 */                       iI000l1 = Math.max(iI000l1, oO1I0001000iI001lllioOl.I00iOIl);
/* 815 */                       iI000iOII = Math.max(iI000iOII, oO1I0001000iI001lllioOl.I00iiI);
/* 819 */                       arrayList.add(oO1I0001000iI001lllioOl);
                            }
/* 829 */                   if (list.isEmpty()) {
/* 831 */                       iI000l1 = IOo0oO11ll1O.I000l1(j);
/* 835 */                       iI000iOII = IOo0oO11ll1O.I000iOII(j);
                            }
/* 842 */                   I0o0oO111 i0o0oO111 = new I0o0oO111(0);
/* 845 */                   i0o0oO111.I00iiI = arrayList;
/* 847 */                   VarHandle.storeStoreFence();
/* 850 */                   return o1iOIoOiO0.I001i1lo1io(iI000l1, iI000iOII, map, i0o0oO111);
                        case 1:
/* 664 */                   int size2 = list.size();
/* 668 */                   if (size2 == 0) {
/* 771 */                       return o1iOIoOiO0.I001i1lo1io(0, 0, map, I0ollliOo0.I00iiI);
                            }
/* 670 */                   if (size2 == 1) {
/* 744 */                       OO1I0001000i oO1I0001000iI001lllioOl2 = ((O1iIo0ll) list.get(0)).I001lllioOl(j);
/* 748 */                       int i4 = oO1I0001000iI001lllioOl2.I00iOIl;
/* 750 */                       int i5 = oO1I0001000iI001lllioOl2.I00iiI;
/* 755 */                       I00iiI i00iiI = new I00iiI(6);
/* 758 */                       i00iiI.I00iiI = oO1I0001000iI001lllioOl2;
/* 760 */                       VarHandle.storeStoreFence();
/* 763 */                       return o1iOIoOiO0.I001i1lo1io(i4, i5, map, i00iiI);
                            }
/* 678 */                   ArrayList arrayList2 = new ArrayList(list.size());
/* 684 */                   int size3 = list.size();
/* 688 */                   int iMax2 = 0;
/* 689 */                   int iMax3 = 0;
/* 691 */                   for (int i6 = 0; i6 < size3; i6++) {
/* 699 */                       OO1I0001000i oO1I0001000iI001lllioOl3 = ((O1iIo0ll) list.get(i6)).I001lllioOl(j);
/* 705 */                       iMax2 = Math.max(iMax2, oO1I0001000iI001lllioOl3.I00iOIl);
/* 711 */                       iMax3 = Math.max(iMax3, oO1I0001000iI001lllioOl3.I00iiI);
/* 715 */                       arrayList2.add(oO1I0001000iI001lllioOl3);
                            }
/* 724 */                   I00iiI i00iiI2 = new I00iiI(7);
/* 727 */                   i00iiI2.I00iiI = arrayList2;
/* 729 */                   VarHandle.storeStoreFence();
/* 732 */                   return o1iOIoOiO0.I001i1lo1io(iMax2, iMax3, map, i00iiI2);
                        case 2:
/* 610 */                   ArrayList arrayList3 = new ArrayList(list.size());
/* 616 */                   int size4 = list.size();
/* 621 */                   for (int i7 = 0; i7 < size4; i7++) {
/* 633 */                       arrayList3.add(((O1iIo0ll) list.get(i7)).I001lllioOl(j));
                            }
/* 639 */                   int iI000OiO = IOo0oO11ll1O.I000OiO(j);
/* 643 */                   int iI000OOo1O = IOo0oO11ll1O.I000OOo1O(j);
/* 650 */                   I0o0oO111 i0o0oO1112 = new I0o0oO111(1);
/* 653 */                   i0o0oO1112.I00iiI = arrayList3;
/* 655 */                   VarHandle.storeStoreFence();
/* 658 */                   return o1iOIoOiO0.I001i1lo1io(iI000OiO, iI000OOo1O, map, i0o0oO1112);
                        case 3:
/* 537 */                   O1iIo0ll o1iIo0ll = (O1iIo0ll) list.get(0);
/* 544 */                   O1iIo0ll o1iIo0ll2 = (O1iIo0ll) list.get(1);
/* 550 */                   int iI000l12 = o1iIo0ll.I000l1(IOo0oO11ll1O.I000OOo1O(j));
/* 561 */                   OO1I0001000i oO1I0001000iI001lllioOl4 = o1iIo0ll2.I001lllioOl(IOo0olo.I000OiO(-iI000l12, 0, 2, j));
/* 567 */                   int i8 = oO1I0001000iI001lllioOl4.I00iOIl + iI000l12;
/* 569 */                   int i9 = oO1I0001000iI001lllioOl4.I00iiI;
/* 581 */                   OO1I0001000i oO1I0001000iI001lllioOl5 = o1iIo0ll.I001lllioOl(IOo0oO11ll1O.I0000Il00O(j, 0, iI000l12, i9, i9, 1));
/* 587 */                   II0oo1oO1 iI0oo1oO1 = new II0oo1oO1(0);
/* 590 */                   iI0oo1oO1.I00iiO = oO1I0001000iI001lllioOl5;
/* 592 */                   iI0oo1oO1.I00iio = oO1I0001000iI001lllioOl4;
/* 594 */                   iI0oo1oO1.I00iiI = iI000l12;
/* 596 */                   VarHandle.storeStoreFence();
/* 599 */                   return o1iOIoOiO0.I001i1lo1io(i8, i9, map, iI0oo1oO1);
                        case 4:
/* 524 */                   return o1iOIoOiO0.I001i1lo1io(IOo0oO11ll1O.I000l1(j), IOo0oO11ll1O.I000iOII(j), map, new I10I0o1ii10(23));
                        case 5:
/* 504 */                   return o1iOIoOiO0.I001i1lo1io(IOo0oO11ll1O.I000OiO(j), IOo0oO11ll1O.I000OOo1O(j), map, I000O01llI0);
                        case 6:
/* 489 */                   return o1iOIoOiO0.I001i1lo1io(IOo0oO11ll1O.I000l1(j), IOo0oO11ll1O.I000iOII(j), map, new IoI0IiI0(13));
                        case 7:
/* 415 */                   ArrayList arrayList4 = new ArrayList(list.size());
/* 421 */                   int size5 = list.size();
/* 425 */                   int iMax4 = 0;
/* 426 */                   int iMax5 = 0;
/* 428 */                   for (int i10 = 0; i10 < size5; i10++) {
/* 436 */                       OO1I0001000i oO1I0001000iI001lllioOl6 = ((O1iIo0ll) list.get(i10)).I001lllioOl(j);
/* 442 */                       iMax4 = Math.max(iMax4, oO1I0001000iI001lllioOl6.I00iOIl);
/* 448 */                       iMax5 = Math.max(iMax5, oO1I0001000iI001lllioOl6.I00iiI);
/* 452 */                       arrayList4.add(oO1I0001000iI001lllioOl6);
                            }
/* 461 */                   I0o0oO111 i0o0oO1113 = new I0o0oO111(5);
/* 464 */                   i0o0oO1113.I00iiI = arrayList4;
/* 466 */                   VarHandle.storeStoreFence();
/* 469 */                   return o1iOIoOiO0.I001i1lo1io(iMax4, iMax5, map, i0o0oO1113);
                        case 8:
/* 404 */                   return o1iOIoOiO0.I001i1lo1io(IOo0oO11ll1O.I000O01llI0(j) ? IOo0oO11ll1O.I000OiO(j) : 0, IOo0oO11ll1O.I000II(j) ? IOo0oO11ll1O.I000OOo1O(j) : 0, map, new OiioI1Io0o(14));
                        default:
/* 26 */                    int iMin = Math.min(IOo0oO11ll1O.I000OiO(j), o1iOIoOiO0.I00l0OO0IO(600.0f));
/* 31 */                    List list2 = list;
/* 33 */                    int size6 = list2.size();
/* 37 */                    int i11 = 0;
                            while (true) {
/* 38 */                        if (i11 < size6) {
/* 40 */                            obj = list.get(i11);
/* 57 */                            if (!O0000Ioio00.I0000O(iIoIOo00o.I00000oIO((O1iIo0ll) obj), "action")) {
/* 60 */                                i11++;
                                    }
                                } else {
/* 63 */                            obj = null;
                                }
                            }
/* 64 */                    O1iIo0ll o1iIo0ll3 = (O1iIo0ll) obj;
/* 74 */                    OO1I0001000i oO1I0001000iI001lllioOl7 = o1iIo0ll3 != null ? o1iIo0ll3.I001lllioOl(j) : null;
/* 75 */                    int size7 = list2.size();
/* 79 */                    int i12 = 0;
                            while (true) {
/* 80 */                        if (i12 < size7) {
/* 82 */                            obj2 = list.get(i12);
/* 99 */                            if (!O0000Ioio00.I0000O(iIoIOo00o.I00000oIO((O1iIo0ll) obj2), "dismissAction")) {
/* 102 */                               i12++;
                                    }
                                } else {
/* 105 */                           obj2 = null;
                                }
                            }
/* 106 */                   O1iIo0ll o1iIo0ll4 = (O1iIo0ll) obj2;
/* 116 */                   OO1I0001000i oO1I0001000iI001lllioOl8 = o1iIo0ll4 != null ? o1iIo0ll4.I001lllioOl(j) : null;
/* 123 */                   int i13 = oO1I0001000iI001lllioOl7 != null ? oO1I0001000iI001lllioOl7.I00iOIl : 0;
/* 129 */                   int i14 = oO1I0001000iI001lllioOl7 != null ? oO1I0001000iI001lllioOl7.I00iiI : 0;
/* 137 */                   int i15 = oO1I0001000iI001lllioOl8 != null ? oO1I0001000iI001lllioOl8.I00iOIl : 0;
/* 144 */                   int i16 = oO1I0001000iI001lllioOl8 != null ? oO1I0001000iI001lllioOl8.I00iiI : 0;
/* 159 */                   int iI00l0OO0IO2 = ((iMin - i13) - i15) - (i15 == 0 ? o1iOIoOiO0.I00l0OO0IO(8.0f) : 0);
/* 163 */                   int iI000l13 = IOo0oO11ll1O.I000l1(j);
/* 167 */                   if (iI00l0OO0IO2 < iI000l13) {
/* 169 */                       iI00l0OO0IO2 = iI000l13;
                            }
/* 170 */                   int size8 = list2.size();
/* 174 */                   int i17 = 0;
/* 175 */                   while (i17 < size8) {
/* 183 */                       O1iIo0ll o1iIo0ll5 = (O1iIo0ll) list.get(i17);
/* 189 */                       int i18 = size8;
/* 197 */                       if (O0000Ioio00.I0000O(iIoIOo00o.I00000oIO(o1iIo0ll5), "text")) {
/* 199 */                           int i19 = i16;
/* 205 */                           int i20 = i14;
/* 215 */                           OO1I0001000i oO1I0001000iI001lllioOl9 = o1iIo0ll5.I001lllioOl(IOo0oO11ll1O.I0000Il00O(j, 0, iI00l0OO0IO2, 0, 0, 9));
/* 219 */                           IoI110lO0O ioI110lO0O = I0l00ioI.I00000oIO;
/* 221 */                           int iI00OilO00Il2 = oO1I0001000iI001lllioOl9.I00OilO00Il(ioI110lO0O);
/* 227 */                           int iI00OilO00Il3 = oO1I0001000iI001lllioOl9.I00OilO00Il(I0l00ioI.I00000oOI);
/* 247 */                           boolean z = iI00OilO00Il2 == iI00OilO00Il3 || !(iI00OilO00Il2 != Integer.MIN_VALUE && iI00OilO00Il3 != Integer.MIN_VALUE);
/* 248 */                           int i21 = iMin - i15;
/* 250 */                           int i22 = i21 - i13;
/* 252 */                           if (z) {
/* 264 */                               iMax = Math.max(o1iOIoOiO0.I00l0OO0IO(Ol1i0Oo.I000OOo1O), Math.max(i20, i19));
/* 272 */                               iI00l0OO0IO = (iMax - oO1I0001000iI001lllioOl9.I00iiI) / 2;
/* 286 */                               i = (oO1I0001000iI001lllioOl7 == null || (iI00OilO00Il = oO1I0001000iI001lllioOl7.I00OilO00Il(ioI110lO0O)) == Integer.MIN_VALUE) ? 0 : (iI00OilO00Il2 + iI00l0OO0IO) - iI00OilO00Il;
                                    } else {
/* 294 */                               iI00l0OO0IO = o1iOIoOiO0.I00l0OO0IO(30.0f) - iI00OilO00Il2;
/* 305 */                               iMax = Math.max(o1iOIoOiO0.I00l0OO0IO(Ol1i0Oo.I000OiO), oO1I0001000iI001lllioOl9.I00iiI + iI00l0OO0IO);
/* 309 */                               if (oO1I0001000iI001lllioOl7 != null) {
/* 315 */                                   i = (iMax - oO1I0001000iI001lllioOl7.I00iiI) / 2;
                                        }
                                    }
/* 326 */                           int i23 = oO1I0001000iI001lllioOl8 != null ? (iMax - oO1I0001000iI001lllioOl8.I00iiI) / 2 : 0;
/* 329 */                           Ol1Ool0 ol1Ool0 = new Ol1Ool0();
/* 332 */                           ol1Ool0.I00iOIl = oO1I0001000iI001lllioOl9;
/* 334 */                           ol1Ool0.I00iiI = iI00l0OO0IO;
/* 336 */                           ol1Ool0.I00iiO = oO1I0001000iI001lllioOl7;
/* 338 */                           ol1Ool0.I00iio = i22;
/* 340 */                           ol1Ool0.I00ilI0I1 = i;
/* 342 */                           ol1Ool0.I00ilO0 = oO1I0001000iI001lllioOl8;
/* 344 */                           ol1Ool0.I00io1l = i21;
/* 346 */                           ol1Ool0.I00ioIO = i23;
/* 348 */                           VarHandle.storeStoreFence();
/* 351 */                           return o1iOIoOiO0.I001i1lo1io(iMin, iMax, map, ol1Ool0);
                                }
/* 357 */                       i17++;
/* 359 */                       size8 = i18;
                            }
/* 365 */                   O10lllI0o0.I00000oOI("Collection contains no element matching the predicate.");
/* 368 */                   IOOlIIilOl0.I0000Il00O();
/* 371 */                   return null;
                    }
                }
            }

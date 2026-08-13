            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class OIl1IiO implements O1iOIl0o10 {
                public Function1 I00000oIO;
                public boolean I00000oOI;
                public Oo01iOI I0000Il00O;
                public Oo010l1I I0000O;
                public Oo010l1I I0000oI00;
                public Oo010l1I I0001Ioi1lo;
                public OIo1Oi1l1lI I000II;
                public float I000O01llI0;

                public static final int I000OiO(int i, OIl1IiO oIl1IiO, int i2, int i3, OO1I0001000i oO1I0001000i, OO1I0001000i oO1I0001000i2) {
/* 3 */             if (oIl1IiO.I00000oOI) {
/* 15 */                i3 = Math.round(((i2 - oO1I0001000i2.I00iiI) / 2.0f) * 1.0f);
                    }
/* 28 */            return Math.max(i + i3, (oO1I0001000i != null ? oO1I0001000i.I00iiI : 0) / 2);
                }

                @Override
                public final int I00000oIO(IoooOl1001li ioooOl1001li, List list, int i) {
/* 8 */             return I000OOo1O(ioooOl1001li, list, i, new IiI01lI(21));
                }

                @Override
                public final O1iOIo0o0 I00000oOI(O1iOIoOiO0 o1iOIoOiO0, List list, long j) {
                    Object obj;
                    List list2;
                    Object obj2;
                    OO1I0001000i oO1I0001000i;
                    int i;
                    OO1I0001000i oO1I0001000iI001lllioOl;
                    Object obj3;
                    OO1I0001000i oO1I0001000i2;
                    OO1I0001000i oO1I0001000iI001lllioOl2;
                    Object obj4;
                    int i2;
                    OO1I0001000i oO1I0001000iI001lllioOl3;
                    Object obj5;
                    Object obj6;
                    int i3;
                    Object obj7;
                    OO1I0001000i oO1I0001000i3;
                    int i4;
                    OO1I0001000i oO1I0001000i4;
                    int i5;
                    OO1I0001000i oO1I0001000i5;
                    int i6;
                    OO1I0001000i oO1I0001000i6;
                    OOo0ooi oOo0ooi;
                    int i7;
                    OO1I0001000i oO1I0001000i7;
                    OO1I0001000i oO1I0001000i8;
                    O1iIo0ll o1iIo0ll;
                    OO1I0001000i oO1I0001000i9;
                    OIl1IiO oIl1IiO;
                    O1iOIoOiO0 o1iOIoOiO02;
                    OO1I0001000i oO1I0001000i10;
                    OO1I0001000i oO1I0001000i11;
                    int i8;
                    int i9;
                    int i10;
                    OO1I0001000i oO1I0001000i12;
                    int i11;
                    int i12;
                    OIl1IiO oIl1IiO2;
                    OO1I0001000i oO1I0001000i13;
                    OOo0ooi oOo0ooi2;
                    OO1I0001000i oO1I0001000i14;
                    OO1I0001000i oO1I0001000i15;
                    OO1I0001000i oO1I0001000i16;
                    int i13;
                    O1iOIoOiO0 o1iOIoOiO03;
                    OO1I0001000i oO1I0001000i17;
/* 5 */             List list3 = list;
/* 9 */             float fInvoke = this.I0000O.invoke();
/* 13 */            OIo1Oi1l1lI oIo1Oi1l1lI = this.I000II;
/* 19 */            int iI00l0OO0IO = o1iOIoOiO0.I00l0OO0IO(oIo1Oi1l1lI.I00000oIO());
/* 31 */            long jI0000Il00O = IOo0oO11ll1O.I0000Il00O(j, 0, 0, 0, 0, 10);
/* 36 */            List list4 = list3;
/* 38 */            int size = list4.size();
/* 43 */            int i14 = 0;
                    while (true) {
/* 46 */                if (i14 >= size) {
/* 71 */                    obj = null;
                            break;
                        }
/* 48 */                obj = list3.get(i14);
/* 65 */                if (O0000Ioio00.I0000O(iIoIOo00o.I00000oIO((O1iIo0ll) obj), "Leading")) {
                            break;
                        }
/* 68 */                i14++;
                    }
/* 73 */            O1iIo0ll o1iIo0ll2 = (O1iIo0ll) obj;
/* 82 */            OO1I0001000i oO1I0001000iI001lllioOl4 = o1iIo0ll2 != null ? o1iIo0ll2.I001lllioOl(jI0000Il00O) : null;
/* 89 */            int i15 = oO1I0001000iI001lllioOl4 != null ? oO1I0001000iI001lllioOl4.I00iOIl : 0;
/* 96 */            int iMax = Math.max(0, oO1I0001000iI001lllioOl4 != null ? oO1I0001000iI001lllioOl4.I00iiI : 0);
/* 100 */           int size2 = list4.size();
/* 104 */           int i16 = 0;
                    while (true) {
/* 105 */               if (i16 >= size2) {
/* 136 */                   list2 = list4;
/* 138 */                   obj2 = null;
                            break;
                        }
/* 107 */               obj2 = list3.get(i16);
/* 119 */               list2 = list4;
/* 127 */               if (O0000Ioio00.I0000O(iIoIOo00o.I00000oIO((O1iIo0ll) obj2), "Trailing")) {
                            break;
                        }
/* 130 */               i16++;
/* 132 */               list4 = list2;
                    }
/* 140 */           O1iIo0ll o1iIo0ll3 = (O1iIo0ll) obj2;
/* 143 */           if (o1iIo0ll3 != null) {
/* 146 */               oO1I0001000i = oO1I0001000iI001lllioOl4;
/* 147 */               i = i15;
/* 154 */               oO1I0001000iI001lllioOl = o1iIo0ll3.I001lllioOl(IOo0olo.I000OiO(-i15, 0, 2, jI0000Il00O));
                    } else {
/* 159 */               oO1I0001000i = oO1I0001000iI001lllioOl4;
/* 160 */               i = i15;
/* 162 */               oO1I0001000iI001lllioOl = null;
                    }
/* 170 */           int i17 = i + (oO1I0001000iI001lllioOl != null ? oO1I0001000iI001lllioOl.I00iOIl : 0);
/* 178 */           int iMax2 = Math.max(iMax, oO1I0001000iI001lllioOl != null ? oO1I0001000iI001lllioOl.I00iiI : 0);
/* 182 */           int size3 = list2.size();
/* 186 */           int i18 = 0;
                    while (true) {
/* 187 */               if (i18 >= size3) {
/* 218 */                   obj3 = null;
                            break;
                        }
/* 189 */               obj3 = list3.get(i18);
/* 201 */               int i19 = size3;
/* 209 */               if (O0000Ioio00.I0000O(iIoIOo00o.I00000oIO((O1iIo0ll) obj3), "Prefix")) {
                            break;
                        }
/* 212 */               i18++;
/* 214 */               size3 = i19;
                    }
/* 220 */           O1iIo0ll o1iIo0ll4 = (O1iIo0ll) obj3;
/* 222 */           if (o1iIo0ll4 != null) {
/* 225 */               oO1I0001000i2 = oO1I0001000iI001lllioOl;
/* 233 */               oO1I0001000iI001lllioOl2 = o1iIo0ll4.I001lllioOl(IOo0olo.I000OiO(-i17, 0, 2, jI0000Il00O));
                    } else {
/* 238 */               oO1I0001000i2 = oO1I0001000iI001lllioOl;
/* 240 */               oO1I0001000iI001lllioOl2 = null;
                    }
/* 248 */           int i20 = i17 + (oO1I0001000iI001lllioOl2 != null ? oO1I0001000iI001lllioOl2.I00iOIl : 0);
/* 255 */           int iMax3 = Math.max(iMax2, oO1I0001000iI001lllioOl2 != null ? oO1I0001000iI001lllioOl2.I00iiI : 0);
/* 259 */           int size4 = list2.size();
/* 263 */           int i21 = 0;
                    while (true) {
/* 264 */               if (i21 >= size4) {
/* 293 */                   obj4 = null;
                            break;
                        }
/* 266 */               obj4 = list3.get(i21);
/* 277 */               int i22 = size4;
/* 285 */               if (O0000Ioio00.I0000O(iIoIOo00o.I00000oIO((O1iIo0ll) obj4), "Suffix")) {
                            break;
                        }
/* 288 */               i21++;
/* 290 */               size4 = i22;
                    }
/* 295 */           O1iIo0ll o1iIo0ll5 = (O1iIo0ll) obj4;
/* 297 */           if (o1iIo0ll5 != null) {
/* 300 */               i2 = i20;
/* 308 */               oO1I0001000iI001lllioOl3 = o1iIo0ll5.I001lllioOl(IOo0olo.I000OiO(-i20, 0, 2, jI0000Il00O));
                    } else {
/* 313 */               i2 = i20;
/* 315 */               oO1I0001000iI001lllioOl3 = null;
                    }
/* 323 */           int i23 = i2 + (oO1I0001000iI001lllioOl3 != null ? oO1I0001000iI001lllioOl3.I00iOIl : 0);
/* 331 */           int iMax4 = Math.max(iMax3, oO1I0001000iI001lllioOl3 != null ? oO1I0001000iI001lllioOl3.I00iiI : 0);
/* 335 */           int size5 = list2.size();
/* 339 */           int i24 = 0;
                    while (true) {
/* 340 */               if (i24 >= size5) {
/* 372 */                   obj5 = null;
                            break;
                        }
/* 342 */               obj5 = list3.get(i24);
/* 350 */               int i25 = size5;
/* 356 */               int i26 = i24;
/* 364 */               if (O0000Ioio00.I0000O(iIoIOo00o.I00000oIO((O1iIo0ll) obj5), "Label")) {
                            break;
                        }
/* 367 */               i24 = i26 + 1;
/* 369 */               size5 = i25;
                    }
/* 374 */           O1iIo0ll o1iIo0ll6 = (O1iIo0ll) obj5;
/* 378 */           OOo0ooi oOo0ooi3 = new OOo0ooi();
/* 407 */           int iI00l0OO0IO2 = o1iOIoOiO0.I00l0OO0IO(oIo1Oi1l1lI.I0000Il00O(o1iOIoOiO0.getLayoutDirection())) + o1iOIoOiO0.I00l0OO0IO(oIo1Oi1l1lI.I00000oOI(o1iOIoOiO0.getLayoutDirection()));
/* 417 */           int i27 = -l1I1Il.I0000Il00O(i23 + iI00l0OO0IO2, iI00l0OO0IO2, fInvoke);
/* 418 */           int i28 = -iI00l0OO0IO;
/* 432 */           OO1I0001000i oO1I0001000iI001lllioOl5 = o1iIo0ll6 != null ? o1iIo0ll6.I001lllioOl(IOo0olo.I000OOo1O(jI0000Il00O, i27, i28)) : null;
/* 434 */           oOo0ooi3.I00iOIl = oO1I0001000iI001lllioOl5;
/* 479 */           this.I00000oIO.invoke(Ol0i1I.I00000oIO(oO1I0001000iI001lllioOl5 != null ? (Float.floatToRawIntBits(oO1I0001000iI001lllioOl5.I00iOIl) << 32) | (Float.floatToRawIntBits(oO1I0001000iI001lllioOl5.I00iiI) & 4294967295L) : 0L));
/* 482 */           int size6 = list2.size();
/* 486 */           int i29 = 0;
                    while (true) {
/* 487 */               if (i29 >= size6) {
/* 519 */                   obj6 = null;
                            break;
                        }
/* 489 */               obj6 = list3.get(i29);
/* 501 */               int i30 = size6;
/* 509 */               if (O0000Ioio00.I0000O(iIoIOo00o.I00000oIO((O1iIo0ll) obj6), "Supporting")) {
                            break;
                        }
/* 512 */               i29++;
/* 516 */               size6 = i30;
                    }
/* 522 */           O1iIo0ll o1iIo0ll7 = (O1iIo0ll) obj6;
/* 535 */           int iI00OI1 = o1iIo0ll7 != null ? o1iIo0ll7.I00OI1(IOo0oO11ll1O.I000l1(j)) : 0;
/* 538 */           OO1I0001000i oO1I0001000i18 = (OO1I0001000i) oOo0ooi3.I00iOIl;
/* 559 */           int iMax5 = Math.max((oO1I0001000i18 != null ? oO1I0001000i18.I00iiI : 0) / 2, o1iOIoOiO0.I00l0OO0IO(oIo1Oi1l1lI.I0000O()));
/* 565 */           int i31 = (i28 - iMax5) - iI00OI1;
/* 566 */           O1iIo0ll o1iIo0ll8 = o1iIo0ll7;
/* 583 */           long jI0000Il00O2 = IOo0oO11ll1O.I0000Il00O(IOo0olo.I000OOo1O(j, -i23, i31), 0, 0, 0, 0, 11);
/* 587 */           int size7 = list2.size();
/* 591 */           int i32 = 0;
/* 594 */           while (i32 < size7) {
/* 600 */               O1iIo0ll o1iIo0ll9 = (O1iIo0ll) list3.get(i32);
/* 602 */               int i33 = i32;
/* 608 */               O1iIo0ll o1iIo0ll10 = o1iIo0ll8;
/* 616 */               if (O0000Ioio00.I0000O(iIoIOo00o.I00000oIO(o1iIo0ll9), "TextField")) {
/* 618 */                   OO1I0001000i oO1I0001000iI001lllioOl6 = o1iIo0ll9.I001lllioOl(jI0000Il00O2);
/* 634 */                   long jI0000Il00O3 = IOo0oO11ll1O.I0000Il00O(jI0000Il00O2, 0, 0, 0, 0, 14);
/* 640 */                   List list5 = list3;
/* 642 */                   int size8 = list5.size();
/* 646 */                   int i34 = 0;
                            while (true) {
/* 647 */                       if (i34 >= size8) {
/* 681 */                           i3 = iMax5;
/* 683 */                           obj7 = null;
                                    break;
                                }
/* 649 */                       obj7 = list3.get(i34);
/* 657 */                       i3 = iMax5;
/* 663 */                       int i35 = size8;
/* 671 */                       if (O0000Ioio00.I0000O(iIoIOo00o.I00000oIO((O1iIo0ll) obj7), "Hint")) {
                                    break;
                                }
/* 674 */                       i34++;
/* 676 */                       size8 = i35;
/* 678 */                       iMax5 = i3;
                            }
/* 685 */                   O1iIo0ll o1iIo0ll11 = (O1iIo0ll) obj7;
/* 694 */                   OO1I0001000i oO1I0001000iI001lllioOl7 = o1iIo0ll11 != null ? o1iIo0ll11.I001lllioOl(jI0000Il00O3) : null;
/* 712 */                   int iMax6 = Math.max(iMax4, Math.max(oO1I0001000iI001lllioOl6.I00iiI, oO1I0001000iI001lllioOl7 != null ? oO1I0001000iI001lllioOl7.I00iiI : 0) + i3 + iI00l0OO0IO);
/* 721 */                   int i36 = oO1I0001000i != null ? oO1I0001000i.I00iOIl : 0;
/* 722 */                   OO1I0001000i oO1I0001000i19 = oO1I0001000i2;
/* 729 */                   int i37 = oO1I0001000i2 != null ? oO1I0001000i19.I00iOIl : 0;
/* 730 */                   if (oO1I0001000iI001lllioOl2 != null) {
/* 736 */                       oO1I0001000i3 = oO1I0001000iI001lllioOl2;
/* 732 */                       i4 = oO1I0001000iI001lllioOl2.I00iOIl;
                            } else {
/* 740 */                       oO1I0001000i3 = oO1I0001000iI001lllioOl2;
/* 741 */                       i4 = 0;
                            }
/* 742 */                   if (oO1I0001000iI001lllioOl3 != null) {
/* 746 */                       oO1I0001000i4 = oO1I0001000i19;
/* 744 */                       i5 = oO1I0001000iI001lllioOl3.I00iOIl;
                            } else {
/* 751 */                       oO1I0001000i4 = oO1I0001000i19;
/* 753 */                       i5 = 0;
                            }
/* 749 */                   OO1I0001000i oO1I0001000i20 = oO1I0001000iI001lllioOl3;
/* 755 */                   int i38 = oO1I0001000iI001lllioOl6.I00iOIl;
/* 761 */                   OO1I0001000i oO1I0001000i21 = (OO1I0001000i) oOo0ooi3.I00iOIl;
/* 763 */                   if (oO1I0001000i21 != null) {
/* 767 */                       OO1I0001000i oO1I0001000i22 = oO1I0001000i3;
/* 765 */                       i6 = oO1I0001000i21.I00iOIl;
/* 770 */                       oO1I0001000i5 = oO1I0001000i22;
                            } else {
/* 773 */                       oO1I0001000i5 = oO1I0001000i3;
/* 774 */                       i6 = 0;
                            }
/* 775 */                   if (oO1I0001000iI001lllioOl7 != null) {
/* 781 */                       oOo0ooi = oOo0ooi3;
/* 783 */                       oO1I0001000i6 = oO1I0001000i5;
/* 779 */                       i7 = oO1I0001000iI001lllioOl7.I00iOIl;
/* 786 */                       oO1I0001000i7 = oO1I0001000iI001lllioOl7;
/* 788 */                       oO1I0001000i8 = oO1I0001000i20;
/* 790 */                       o1iIo0ll = o1iIo0ll10;
/* 792 */                       oO1I0001000i9 = oO1I0001000iI001lllioOl6;
/* 794 */                       o1iOIoOiO02 = o1iOIoOiO0;
/* 796 */                       oO1I0001000i10 = oO1I0001000i;
/* 798 */                       oIl1IiO = this;
                            } else {
/* 805 */                       oO1I0001000i6 = oO1I0001000i5;
/* 807 */                       oOo0ooi = oOo0ooi3;
/* 809 */                       i7 = 0;
/* 810 */                       oO1I0001000i7 = oO1I0001000iI001lllioOl7;
/* 812 */                       oO1I0001000i8 = oO1I0001000i20;
/* 814 */                       o1iIo0ll = o1iIo0ll10;
/* 816 */                       oO1I0001000i9 = oO1I0001000iI001lllioOl6;
/* 818 */                       oIl1IiO = this;
/* 820 */                       o1iOIoOiO02 = o1iOIoOiO0;
/* 822 */                       oO1I0001000i10 = oO1I0001000i;
                            }
/* 825 */                   int iI000II = oIl1IiO.I000II(o1iOIoOiO02, i36, i37, i4, i5, i38, i6, i7, j, fInvoke);
/* 858 */                   OO1I0001000i oO1I0001000iI001lllioOl8 = o1iIo0ll != null ? o1iIo0ll.I001lllioOl(IOo0oO11ll1O.I0000Il00O(IOo0olo.I000OiO(0, -iMax6, 1, jI0000Il00O), 0, iI000II, 0, 0, 9)) : null;
/* 866 */                   int i39 = oO1I0001000iI001lllioOl8 != null ? oO1I0001000iI001lllioOl8.I00iiI : 0;
/* 867 */                   OO1I0001000i oO1I0001000i23 = oO1I0001000i10;
/* 875 */                   int i40 = oO1I0001000i10 != null ? oO1I0001000i23.I00iiI : 0;
/* 876 */                   OO1I0001000i oO1I0001000i24 = oO1I0001000i4;
/* 886 */                   int i41 = oO1I0001000i4 != null ? oO1I0001000i24.I00iiI : 0;
/* 883 */                   OO1I0001000i oO1I0001000i25 = oO1I0001000i6;
/* 895 */                   int i42 = oO1I0001000i25 != null ? oO1I0001000i25.I00iiI : 0;
/* 892 */                   OO1I0001000i oO1I0001000i26 = oO1I0001000i8;
/* 904 */                   int i43 = oO1I0001000i26 != null ? oO1I0001000i26.I00iiI : 0;
/* 901 */                   OO1I0001000i oO1I0001000i27 = oO1I0001000i9;
/* 906 */                   int i44 = oO1I0001000i27.I00iiI;
/* 908 */                   OOo0ooi oOo0ooi4 = oOo0ooi;
/* 912 */                   OO1I0001000i oO1I0001000i28 = (OO1I0001000i) oOo0ooi4.I00iOIl;
/* 923 */                   int i45 = oO1I0001000i28 != null ? oO1I0001000i28.I00iiI : 0;
/* 918 */                   int i46 = i39;
/* 920 */                   OO1I0001000i oO1I0001000i29 = oO1I0001000i7;
/* 927 */                   if (oO1I0001000i29 != null) {
/* 931 */                       oO1I0001000i11 = oO1I0001000i26;
/* 933 */                       i8 = i43;
/* 934 */                       i9 = i44;
/* 929 */                       i10 = oO1I0001000i29.I00iiI;
                            } else {
/* 937 */                       oO1I0001000i11 = oO1I0001000i26;
/* 939 */                       i8 = i43;
/* 940 */                       i9 = i44;
/* 941 */                       i10 = 0;
                            }
/* 942 */                   if (oO1I0001000iI001lllioOl8 != null) {
/* 946 */                       oO1I0001000i12 = oO1I0001000i27;
/* 948 */                       i11 = i45;
/* 944 */                       i12 = oO1I0001000iI001lllioOl8.I00iiI;
/* 950 */                       oO1I0001000i13 = oO1I0001000i25;
/* 952 */                       oOo0ooi2 = oOo0ooi4;
/* 954 */                       oO1I0001000i14 = oO1I0001000i29;
/* 956 */                       oO1I0001000i15 = oO1I0001000i24;
/* 958 */                       oO1I0001000i16 = oO1I0001000i11;
/* 960 */                       i13 = 0;
/* 962 */                       o1iOIoOiO03 = o1iOIoOiO0;
/* 964 */                       oO1I0001000i17 = oO1I0001000iI001lllioOl8;
/* 966 */                       oIl1IiO2 = this;
                            } else {
/* 973 */                       oO1I0001000i12 = oO1I0001000i27;
/* 975 */                       i11 = i45;
/* 976 */                       i12 = 0;
/* 977 */                       oIl1IiO2 = this;
/* 979 */                       oO1I0001000i13 = oO1I0001000i25;
/* 981 */                       oOo0ooi2 = oOo0ooi4;
/* 983 */                       oO1I0001000i14 = oO1I0001000i29;
/* 985 */                       oO1I0001000i15 = oO1I0001000i24;
/* 987 */                       oO1I0001000i16 = oO1I0001000i11;
/* 989 */                       i13 = 0;
/* 991 */                       o1iOIoOiO03 = o1iOIoOiO0;
/* 993 */                       oO1I0001000i17 = oO1I0001000iI001lllioOl8;
                            }
/* 996 */                   int iI0001Ioi1lo = oIl1IiO2.I0001Ioi1lo(o1iOIoOiO03, i40, i41, i42, i8, i9, i11, i10, i12, j, fInvoke);
/* 1001 */                  int i47 = iI0001Ioi1lo - i46;
/* 1003 */                  int size9 = list5.size();
/* 1009 */                  for (int i48 = i13; i48 < size9; i48++) {
/* 1017 */                      O1iIo0ll o1iIo0ll12 = (O1iIo0ll) list.get(i48);
/* 1029 */                      if (O0000Ioio00.I0000O(iIoIOo00o.I00000oIO(o1iIo0ll12), "Container")) {
/* 1050 */                          OO1I0001000i oO1I0001000iI001lllioOl9 = o1iIo0ll12.I001lllioOl(IOo0olo.I00000oIO(iI000II != Integer.MAX_VALUE ? iI000II : i13, iI000II, i47 != Integer.MAX_VALUE ? i47 : i13, i47));
/* 1056 */                          OIl11ii0 oIl11ii0 = new OIl11ii0();
/* 1059 */                          oIl11ii0.I00iOIl = oIl1IiO2;
/* 1061 */                          oIl11ii0.I00iiI = iI0001Ioi1lo;
/* 1063 */                          oIl11ii0.I00iiO = iI000II;
/* 1065 */                          oIl11ii0.I00iio = oO1I0001000i23;
/* 1067 */                          oIl11ii0.I00ilI0I1 = oO1I0001000i15;
/* 1071 */                          oIl11ii0.I00ilO0 = oO1I0001000i13;
/* 1075 */                          oIl11ii0.I00io1l = oO1I0001000i16;
/* 1079 */                          oIl11ii0.I00ioIO = oO1I0001000i12;
/* 1083 */                          oIl11ii0.I00l0I0l0lO1 = oOo0ooi2;
/* 1087 */                          oIl11ii0.I00l0OO0IO = oO1I0001000i14;
/* 1089 */                          oIl11ii0.I00li1OI = oO1I0001000iI001lllioOl9;
/* 1093 */                          oIl11ii0.I00ll1 = oO1I0001000i17;
/* 1095 */                          oIl11ii0.I00lli11 = o1iOIoOiO03;
/* 1097 */                          oIl11ii0.I00lll10 = fInvoke;
/* 1099 */                          VarHandle.storeStoreFence();
/* 1104 */                          return o1iOIoOiO03.I001i1lo1io(iI000II, iI0001Ioi1lo, Il011I1OiO0I.I00iOIl, oIl11ii0);
                                }
                            }
/* 1122 */                  O10lllI0o0.I00000oOI("Collection contains no element matching the predicate.");
/* 1125 */                  IOOlIIilOl0.I0000Il00O();
/* 44 */                    return null;
                        }
/* 1147 */              i32 = i33 + 1;
/* 1150 */              oO1I0001000iI001lllioOl2 = oO1I0001000iI001lllioOl2;
/* 1151 */              oOo0ooi3 = oOo0ooi3;
/* 1152 */              jI0000Il00O = jI0000Il00O;
/* 1153 */              list3 = list3;
/* 1154 */              oO1I0001000iI001lllioOl3 = oO1I0001000iI001lllioOl3;
/* 1155 */              o1iIo0ll8 = o1iIo0ll10;
/* 1157 */              iMax5 = iMax5;
/* 1159 */              jI0000Il00O2 = jI0000Il00O2;
                    }
/* 1163 */          O10lllI0o0.I00000oOI("Collection contains no element matching the predicate.");
/* 1166 */          IOOlIIilOl0.I0000Il00O();
/* 44 */            return null;
                }

                @Override
                public final int I0000Il00O(IoooOl1001li ioooOl1001li, List list, int i) {
/* 8 */             return I000OOo1O(ioooOl1001li, list, i, new IiI01lI(20));
                }

                @Override
                public final int I0000O(IoooOl1001li ioooOl1001li, List list, int i) {
/* 8 */             return I000O01llI0(ioooOl1001li, list, i, new IiI01lI(23));
                }

                @Override
                public final int I0000oI00(IoooOl1001li ioooOl1001li, List list, int i) {
/* 8 */             return I000O01llI0(ioooOl1001li, list, i, new IiI01lI(22));
                }

                public final int I0001Ioi1lo(IiIooOOOI iiIooOOOI, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, float f) {
/* 1 */             OIo1Oi1l1lI oIo1Oi1l1lI = this.I000II;
/* 8 */             int[] iArr = {i7, i3, i4, l1I1Il.I0000Il00O(i6, 0, f)};
/* 13 */            for (int i9 = 0; i9 < 4; i9++) {
/* 17 */                i5 = Math.max(i5, iArr[i9]);
                    }
/* 28 */            float fI00i0ilIl0i = iiIooOOOI.I00i0ilIl0i(oIo1Oi1l1lI.I0000O());
/* 68 */            return IOo0olo.I0001Ioi1lo(Math.max(i, Math.max(i2, O1OooO0IlOo.I000II(l1I1Il.I00000oOI(fI00i0ilIl0i, Math.max(fI00i0ilIl0i, i6 / 2.0f), f) + i5 + iiIooOOOI.I00i0ilIl0i(oIo1Oi1l1lI.I00000oIO())))) + i8, j);
                }

                public final int I000II(IiIooOOOI iiIooOOOI, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, float f) {
/* 1 */             int i8 = i3 + i4;
/* 18 */            int iMax = Math.max(i5 + i8, Math.max(i7 + i8, l1I1Il.I0000Il00O(i6, 0, f))) + i + i2;
/* 19 */            OIo1Oi1l1lI oIo1Oi1l1lI = this.I000II;
/* 21 */            O0iOOoiioO o0iOOoiioO = O0iOOoiioO.I00iOIl;
/* 47 */            return IOo0olo.I000II(Math.max(iMax, O1OooO0IlOo.I000II((i6 + iiIooOOOI.I00i0ilIl0i(oIo1Oi1l1lI.I0000Il00O(o0iOOoiioO) + oIo1Oi1l1lI.I00000oOI(o0iOOoiioO))) * f)), j);
                }

                public final int I000O01llI0(IoooOl1001li ioooOl1001li, List list, int i, IlliIl1l11O illiIl1l11O) {
                    Object obj;
                    int iI00000oOI;
                    int iIntValue;
                    Object obj2;
                    int iIntValue2;
                    Object obj3;
                    Object obj4;
                    int iIntValue3;
                    Object obj5;
                    int iIntValue4;
                    int i2;
                    Object obj6;
                    Object obj7;
/* 5 */             OIl1IiO oIl1IiO = this;
/* 11 */            float fInvoke = oIl1IiO.I0000O.invoke();
/* 16 */            List list2 = list;
/* 18 */            int size = list2.size();
/* 22 */            int i3 = 0;
                    while (true) {
/* 23 */                if (i3 >= size) {
/* 48 */                    obj = null;
                            break;
                        }
/* 25 */                obj = list.get(i3);
/* 42 */                if (O0000Ioio00.I0000O(l0o1I0.I00000oIO((O1iIo0ll) obj), "Leading")) {
                            break;
                        }
/* 45 */                i3++;
                    }
/* 49 */            O1iIo0ll o1iIo0ll = (O1iIo0ll) obj;
/* 54 */            if (o1iIo0ll != null) {
/* 60 */                iI00000oOI = l0o1I0.I00000oOI(i, o1iIo0ll.I001iOo1i0O(Integer.MAX_VALUE));
/* 74 */                iIntValue = ((Number) illiIl1l11O.invoke(o1iIo0ll, Integer.valueOf(i))).intValue();
                    } else {
/* 79 */                iI00000oOI = i;
/* 80 */                iIntValue = 0;
                    }
/* 81 */            int size2 = list2.size();
/* 85 */            int i4 = 0;
                    while (true) {
/* 86 */                if (i4 >= size2) {
/* 111 */                   obj2 = null;
                            break;
                        }
/* 88 */                obj2 = list.get(i4);
/* 105 */               if (O0000Ioio00.I0000O(l0o1I0.I00000oIO((O1iIo0ll) obj2), "Trailing")) {
                            break;
                        }
/* 108 */               i4++;
                    }
/* 112 */           O1iIo0ll o1iIo0ll2 = (O1iIo0ll) obj2;
/* 114 */           if (o1iIo0ll2 != null) {
/* 120 */               iI00000oOI = l0o1I0.I00000oOI(iI00000oOI, o1iIo0ll2.I001iOo1i0O(Integer.MAX_VALUE));
/* 134 */               iIntValue2 = ((Number) illiIl1l11O.invoke(o1iIo0ll2, Integer.valueOf(i))).intValue();
                    } else {
/* 139 */               iIntValue2 = 0;
                    }
/* 140 */           int size3 = list2.size();
/* 144 */           int i5 = 0;
                    while (true) {
/* 145 */               if (i5 >= size3) {
/* 170 */                   obj3 = null;
                            break;
                        }
/* 147 */               obj3 = list.get(i5);
/* 164 */               if (O0000Ioio00.I0000O(l0o1I0.I00000oIO((O1iIo0ll) obj3), "Label")) {
                            break;
                        }
/* 167 */               i5++;
                    }
/* 171 */           Object obj8 = (O1iIo0ll) obj3;
/* 194 */           int iIntValue5 = obj8 != null ? ((Number) illiIl1l11O.invoke(obj8, Integer.valueOf(l1I1Il.I0000Il00O(iI00000oOI, i, fInvoke)))).intValue() : 0;
/* 195 */           int size4 = list2.size();
/* 199 */           int i6 = 0;
                    while (true) {
/* 200 */               if (i6 >= size4) {
/* 225 */                   obj4 = null;
                            break;
                        }
/* 202 */               obj4 = list.get(i6);
/* 219 */               if (O0000Ioio00.I0000O(l0o1I0.I00000oIO((O1iIo0ll) obj4), "Prefix")) {
                            break;
                        }
/* 222 */               i6++;
                    }
/* 226 */           O1iIo0ll o1iIo0ll3 = (O1iIo0ll) obj4;
/* 228 */           if (o1iIo0ll3 != null) {
/* 240 */               iIntValue3 = ((Number) illiIl1l11O.invoke(o1iIo0ll3, Integer.valueOf(iI00000oOI))).intValue();
/* 248 */               iI00000oOI = l0o1I0.I00000oOI(iI00000oOI, o1iIo0ll3.I001iOo1i0O(Integer.MAX_VALUE));
                    } else {
/* 253 */               iIntValue3 = 0;
                    }
/* 254 */           int size5 = list2.size();
/* 258 */           int i7 = 0;
                    while (true) {
/* 259 */               if (i7 >= size5) {
/* 287 */                   obj5 = null;
                            break;
                        }
/* 261 */               obj5 = list.get(i7);
/* 278 */               if (O0000Ioio00.I0000O(l0o1I0.I00000oIO((O1iIo0ll) obj5), "Suffix")) {
                            break;
                        }
/* 281 */               i7++;
                    }
/* 288 */           O1iIo0ll o1iIo0ll4 = (O1iIo0ll) obj5;
/* 290 */           if (o1iIo0ll4 != null) {
/* 302 */               iIntValue4 = ((Number) illiIl1l11O.invoke(o1iIo0ll4, Integer.valueOf(iI00000oOI))).intValue();
/* 313 */               iI00000oOI = l0o1I0.I00000oOI(iI00000oOI, o1iIo0ll4.I001iOo1i0O(Integer.MAX_VALUE));
                    } else {
/* 318 */               iIntValue4 = 0;
                    }
/* 319 */           int size6 = list2.size();
/* 323 */           int i8 = 0;
/* 324 */           while (i8 < size6) {
/* 326 */               Object obj9 = list.get(i8);
/* 343 */               if (O0000Ioio00.I0000O(l0o1I0.I00000oIO((O1iIo0ll) obj9), "TextField")) {
/* 355 */                   int iIntValue6 = ((Number) illiIl1l11O.invoke(obj9, Integer.valueOf(iI00000oOI))).intValue();
/* 359 */                   int size7 = list2.size();
/* 363 */                   int i9 = 0;
                            while (true) {
/* 364 */                       if (i9 >= size7) {
/* 393 */                           i2 = iIntValue6;
/* 395 */                           obj6 = null;
                                    break;
                                }
/* 366 */                       obj6 = list.get(i9);
/* 377 */                       i2 = iIntValue6;
/* 385 */                       if (O0000Ioio00.I0000O(l0o1I0.I00000oIO((O1iIo0ll) obj6), "Hint")) {
                                    break;
                                }
/* 388 */                       i9++;
/* 390 */                       iIntValue6 = i2;
                            }
/* 396 */                   Object obj10 = (O1iIo0ll) obj6;
/* 415 */                   int iIntValue7 = obj10 != null ? ((Number) illiIl1l11O.invoke(obj10, Integer.valueOf(iI00000oOI))).intValue() : 0;
/* 416 */                   int size8 = list2.size();
/* 420 */                   int i10 = 0;
                            while (true) {
/* 421 */                       if (i10 >= size8) {
/* 446 */                           obj7 = null;
                                    break;
                                }
/* 423 */                       obj7 = list.get(i10);
/* 440 */                       if (O0000Ioio00.I0000O(l0o1I0.I00000oIO((O1iIo0ll) obj7), "Supporting")) {
                                    break;
                                }
/* 443 */                       i10++;
                            }
/* 447 */                   Object obj11 = (O1iIo0ll) obj7;
/* 490 */                   return oIl1IiO.I0001Ioi1lo(ioooOl1001li, iIntValue, iIntValue2, iIntValue3, iIntValue4, i2, iIntValue5, iIntValue7, obj11 != null ? ((Number) illiIl1l11O.invoke(obj11, Integer.valueOf(i))).intValue() : 0, IOo0olo.I00000oOI(0, 0, 0, 0, 15), fInvoke);
                        }
/* 500 */               i8++;
/* 504 */               iIntValue3 = iIntValue3;
/* 506 */               oIl1IiO = this;
                    }
/* 513 */           O10lllI0o0.I00000oOI("Collection contains no element matching the predicate.");
/* 516 */           IOOlIIilOl0.I0000Il00O();
/* 510 */           return 0;
                }

                public final int I000OOo1O(IoooOl1001li ioooOl1001li, List list, int i, IlliIl1l11O illiIl1l11O) {
                    Object obj;
                    Object obj2;
                    Object obj3;
                    Object obj4;
                    Object obj5;
                    Object obj6;
/* 6 */             List list2 = list;
/* 8 */             int size = list2.size();
/* 14 */            for (int i2 = 0; i2 < size; i2++) {
/* 16 */                Object obj7 = list.get(i2);
/* 33 */                if (O0000Ioio00.I0000O(l0o1I0.I00000oIO((O1iIo0ll) obj7), "TextField")) {
/* 45 */                    int iIntValue = ((Number) illiIl1l11O.invoke(obj7, Integer.valueOf(i))).intValue();
/* 49 */                    int size2 = list2.size();
/* 53 */                    int i3 = 0;
                            while (true) {
/* 54 */                        obj = null;
/* 55 */                        if (i3 >= size2) {
/* 80 */                            obj2 = null;
                                    break;
                                }
/* 57 */                        obj2 = list.get(i3);
/* 74 */                        if (O0000Ioio00.I0000O(l0o1I0.I00000oIO((O1iIo0ll) obj2), "Label")) {
                                    break;
                                }
/* 77 */                        i3++;
                            }
/* 81 */                    O1iIo0ll o1iIo0ll = (O1iIo0ll) obj2;
/* 101 */                   int iIntValue2 = o1iIo0ll != null ? ((Number) illiIl1l11O.invoke(o1iIo0ll, Integer.valueOf(i))).intValue() : 0;
/* 102 */                   int size3 = list2.size();
/* 106 */                   int i4 = 0;
                            while (true) {
/* 107 */                       if (i4 >= size3) {
/* 132 */                           obj3 = null;
                                    break;
                                }
/* 109 */                       obj3 = list.get(i4);
/* 126 */                       if (O0000Ioio00.I0000O(l0o1I0.I00000oIO((O1iIo0ll) obj3), "Trailing")) {
                                    break;
                                }
/* 129 */                       i4++;
                            }
/* 133 */                   O1iIo0ll o1iIo0ll2 = (O1iIo0ll) obj3;
/* 153 */                   int iIntValue3 = o1iIo0ll2 != null ? ((Number) illiIl1l11O.invoke(o1iIo0ll2, Integer.valueOf(i))).intValue() : 0;
/* 154 */                   int size4 = list2.size();
/* 158 */                   int i5 = 0;
                            while (true) {
/* 159 */                       if (i5 >= size4) {
/* 184 */                           obj4 = null;
                                    break;
                                }
/* 161 */                       obj4 = list.get(i5);
/* 178 */                       if (O0000Ioio00.I0000O(l0o1I0.I00000oIO((O1iIo0ll) obj4), "Leading")) {
                                    break;
                                }
/* 181 */                       i5++;
                            }
/* 185 */                   O1iIo0ll o1iIo0ll3 = (O1iIo0ll) obj4;
/* 205 */                   int iIntValue4 = o1iIo0ll3 != null ? ((Number) illiIl1l11O.invoke(o1iIo0ll3, Integer.valueOf(i))).intValue() : 0;
/* 206 */                   int size5 = list2.size();
/* 210 */                   int i6 = 0;
                            while (true) {
/* 211 */                       if (i6 >= size5) {
/* 236 */                           obj5 = null;
                                    break;
                                }
/* 213 */                       obj5 = list.get(i6);
/* 230 */                       if (O0000Ioio00.I0000O(l0o1I0.I00000oIO((O1iIo0ll) obj5), "Prefix")) {
                                    break;
                                }
/* 233 */                       i6++;
                            }
/* 237 */                   O1iIo0ll o1iIo0ll4 = (O1iIo0ll) obj5;
/* 257 */                   int iIntValue5 = o1iIo0ll4 != null ? ((Number) illiIl1l11O.invoke(o1iIo0ll4, Integer.valueOf(i))).intValue() : 0;
/* 258 */                   int size6 = list2.size();
/* 262 */                   int i7 = 0;
                            while (true) {
/* 263 */                       if (i7 >= size6) {
/* 288 */                           obj6 = null;
                                    break;
                                }
/* 265 */                       obj6 = list.get(i7);
/* 282 */                       if (O0000Ioio00.I0000O(l0o1I0.I00000oIO((O1iIo0ll) obj6), "Suffix")) {
                                    break;
                                }
/* 285 */                       i7++;
                            }
/* 289 */                   O1iIo0ll o1iIo0ll5 = (O1iIo0ll) obj6;
/* 309 */                   int iIntValue6 = o1iIo0ll5 != null ? ((Number) illiIl1l11O.invoke(o1iIo0ll5, Integer.valueOf(i))).intValue() : 0;
/* 310 */                   int size7 = list2.size();
/* 314 */                   int i8 = 0;
                            while (true) {
/* 315 */                       if (i8 >= size7) {
                                    break;
                                }
/* 317 */                       Object obj8 = list.get(i8);
/* 334 */                       if (O0000Ioio00.I0000O(l0o1I0.I00000oIO((O1iIo0ll) obj8), "Hint")) {
/* 336 */                           obj = obj8;
                                    break;
                                }
/* 338 */                       i8++;
                            }
/* 341 */                   O1iIo0ll o1iIo0ll6 = (O1iIo0ll) obj;
/* 378 */                   return I000II(ioooOl1001li, iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue, iIntValue2, o1iIo0ll6 != null ? ((Number) illiIl1l11O.invoke(o1iIo0ll6, Integer.valueOf(i))).intValue() : 0, IOo0olo.I00000oOI(0, 0, 0, 0, 15), this.I0000O.invoke());
                        }
                    }
/* 389 */           O10lllI0o0.I00000oOI("Collection contains no element matching the predicate.");
/* 392 */           IOOlIIilOl0.I0000Il00O();
/* 12 */            return 0;
                }
            }

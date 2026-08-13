            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.lang.invoke.VarHandle;
            
            public final class o0olIOlOI implements Parcelable.Creator {
                public final int I00000oIO;

                @Override
                public final Object createFromParcel(Parcel parcel) {
/* 9 */             int iI0010I0i = 0;
/* 12 */            o0o0i0ool o0o0i0oolVar = null;
/* 12 */            String strI000II = null;
/* 12 */            String strI000II2 = null;
/* 12 */            String strI000II3 = null;
/* 12 */            String strI000II4 = null;
/* 12 */            String strI000II5 = null;
/* 12 */            String strI000II6 = null;
/* 12 */            String strI000II7 = null;
/* 12 */            String strI000II8 = null;
                    switch (this.I00000oIO) {
                        case 0:
/* 812 */                   int iI001i1O0Ol = lO0Iil10.I001i1O0Ol(parcel);
/* 816 */                   String strI000II9 = null;
/* 817 */                   String strI000II10 = null;
/* 818 */                   o0o0oIo0[] o0o0oio0Arr = null;
/* 819 */                   o0looOOo0[] o0looooo0Arr = null;
/* 820 */                   String[] strArrI000O01llI0 = null;
/* 821 */                   o0liol1[] o0liol1VarArr = null;
/* 826 */                   while (parcel.dataPosition() < iI001i1O0Ol) {
/* 828 */                       int i = parcel.readInt();
                                switch ((char) i) {
                                    case 1:
/* 888 */                               o0o0i0oolVar = (o0o0i0ool) lO0Iil10.I0001Ioi1lo(parcel, i, o0o0i0ool.CREATOR);
                                        break;
                                    case 2:
/* 877 */                               strI000II9 = lO0Iil10.I000II(i, parcel);
                                        break;
                                    case 3:
/* 872 */                               strI000II10 = lO0Iil10.I000II(i, parcel);
                                        break;
                                    case 4:
/* 869 */                               o0o0oio0Arr = (o0o0oIo0[]) lO0Iil10.I000OiO(parcel, i, o0o0oIo0.CREATOR);
                                        break;
                                    case 5:
/* 860 */                               o0looooo0Arr = (o0looOOo0[]) lO0Iil10.I000OiO(parcel, i, o0looOOo0.CREATOR);
                                        break;
                                    case 6:
/* 849 */                               strArrI000O01llI0 = lO0Iil10.I000O01llI0(i, parcel);
                                        break;
                                    case 7:
/* 846 */                               o0liol1VarArr = (o0liol1[]) lO0Iil10.I000OiO(parcel, i, o0liol1.CREATOR);
                                        break;
                                    default:
/* 836 */                               lO0Iil10.I001IO000(i, parcel);
                                        break;
                                }
                            }
/* 891 */                   lO0Iil10.I000l1(iI001i1O0Ol, parcel);
/* 896 */                   o0loI0oo0I o0loi0oo0i = new o0loI0oo0I();
/* 899 */                   o0loi0oo0i.I00iOIl = o0o0i0oolVar;
/* 901 */                   o0loi0oo0i.I00iiI = strI000II9;
/* 903 */                   o0loi0oo0i.I00iiO = strI000II10;
/* 905 */                   o0loi0oo0i.I00iio = o0o0oio0Arr;
/* 907 */                   o0loi0oo0i.I00ilI0I1 = o0looooo0Arr;
/* 909 */                   o0loi0oo0i.I00ilO0 = strArrI000O01llI0;
/* 911 */                   o0loi0oo0i.I00io1l = o0liol1VarArr;
/* 913 */                   VarHandle.storeStoreFence();
/* 916 */                   return o0loi0oo0i;
                        case 1:
/* 658 */                   int iI001i1O0Ol2 = lO0Iil10.I001i1O0Ol(parcel);
/* 662 */                   String strI000II11 = null;
/* 663 */                   String strI000II12 = null;
/* 664 */                   String strI000II13 = null;
/* 665 */                   String strI000II14 = null;
/* 666 */                   String strI000II15 = null;
/* 667 */                   String strI000II16 = null;
/* 668 */                   String strI000II17 = null;
/* 669 */                   String strI000II18 = null;
/* 670 */                   String strI000II19 = null;
/* 671 */                   String strI000II20 = null;
/* 672 */                   String strI000II21 = null;
/* 673 */                   String strI000II22 = null;
/* 674 */                   String strI000II23 = null;
/* 680 */                   while (parcel.dataPosition() < iI001i1O0Ol2) {
/* 682 */                       int i2 = parcel.readInt();
/* 686 */                       String str = strI000II22;
                                switch ((char) i2) {
                                    case 1:
/* 763 */                               strI000II8 = lO0Iil10.I000II(i2, parcel);
                                        break;
                                    case 2:
/* 758 */                               strI000II11 = lO0Iil10.I000II(i2, parcel);
                                        break;
                                    case 3:
/* 753 */                               strI000II12 = lO0Iil10.I000II(i2, parcel);
                                        break;
                                    case 4:
/* 748 */                               strI000II13 = lO0Iil10.I000II(i2, parcel);
                                        break;
                                    case 5:
/* 743 */                               strI000II14 = lO0Iil10.I000II(i2, parcel);
                                        break;
                                    case 6:
/* 738 */                               strI000II15 = lO0Iil10.I000II(i2, parcel);
                                        break;
                                    case 7:
/* 733 */                               strI000II16 = lO0Iil10.I000II(i2, parcel);
                                        break;
                                    case '\b':
/* 728 */                               strI000II17 = lO0Iil10.I000II(i2, parcel);
                                        break;
                                    case '\t':
/* 723 */                               strI000II18 = lO0Iil10.I000II(i2, parcel);
                                        break;
                                    case '\n':
/* 718 */                               strI000II19 = lO0Iil10.I000II(i2, parcel);
                                        break;
                                    case 11:
/* 713 */                               strI000II20 = lO0Iil10.I000II(i2, parcel);
                                        break;
                                    case '\f':
/* 708 */                               strI000II21 = lO0Iil10.I000II(i2, parcel);
                                        break;
                                    case '\r':
/* 703 */                               strI000II22 = lO0Iil10.I000II(i2, parcel);
                                        continue;
                                    case 14:
/* 698 */                               strI000II23 = lO0Iil10.I000II(i2, parcel);
                                        break;
                                    default:
/* 692 */                               lO0Iil10.I001IO000(i2, parcel);
                                        break;
                                }
/* 695 */                       strI000II22 = str;
                            }
/* 770 */                   lO0Iil10.I000l1(iI001i1O0Ol2, parcel);
/* 775 */                   o0loil0O o0loil0o = new o0loil0O();
/* 778 */                   o0loil0o.I00iOIl = strI000II8;
/* 780 */                   o0loil0o.I00iiI = strI000II11;
/* 782 */                   o0loil0o.I00iiO = strI000II12;
/* 784 */                   o0loil0o.I00iio = strI000II13;
/* 786 */                   o0loil0o.I00ilI0I1 = strI000II14;
/* 788 */                   o0loil0o.I00ilO0 = strI000II15;
/* 790 */                   o0loil0o.I00io1l = strI000II16;
/* 792 */                   o0loil0o.I00ioIO = strI000II17;
/* 794 */                   o0loil0o.I00l0I0l0lO1 = strI000II18;
/* 796 */                   o0loil0o.I00l0OO0IO = strI000II19;
/* 798 */                   o0loil0o.I00li1OI = strI000II20;
/* 800 */                   o0loil0o.I00ll1 = strI000II21;
/* 802 */                   o0loil0o.I00lli11 = strI000II22;
/* 806 */                   o0loil0o.I00lll10 = strI000II23;
/* 808 */                   VarHandle.storeStoreFence();
/* 811 */                   return o0loil0o;
                        case 2:
/* 589 */                   int iI001i1O0Ol3 = lO0Iil10.I001i1O0Ol(parcel);
/* 593 */                   String strI000II24 = null;
/* 594 */                   String strI000II25 = null;
/* 599 */                   while (parcel.dataPosition() < iI001i1O0Ol3) {
/* 601 */                       int i3 = parcel.readInt();
/* 605 */                       char c = (char) i3;
/* 606 */                       if (c == 1) {
/* 633 */                           iI0010I0i = lO0Iil10.I0010I0i(i3, parcel);
                                } else if (c == 2) {
/* 628 */                           strI000II7 = lO0Iil10.I000II(i3, parcel);
                                } else if (c == 3) {
/* 623 */                           strI000II24 = lO0Iil10.I000II(i3, parcel);
                                } else if (c != 4) {
/* 614 */                           lO0Iil10.I001IO000(i3, parcel);
                                } else {
/* 618 */                           strI000II25 = lO0Iil10.I000II(i3, parcel);
                                }
                            }
/* 638 */                   lO0Iil10.I000l1(iI001i1O0Ol3, parcel);
/* 643 */                   o0looOOo0 o0looooo0 = new o0looOOo0();
/* 646 */                   o0looooo0.I00iOIl = iI0010I0i;
/* 648 */                   o0looooo0.I00iiI = strI000II7;
/* 650 */                   o0looooo0.I00iiO = strI000II24;
/* 652 */                   o0looooo0.I00iio = strI000II25;
/* 654 */                   VarHandle.storeStoreFence();
/* 657 */                   return o0looooo0;
                        case 3:
/* 537 */                   int iI001i1O0Ol4 = lO0Iil10.I001i1O0Ol(parcel);
/* 541 */                   double dI000o00OoI0I = 0.0d;
/* 543 */                   double dI000o00OoI0I2 = 0.0d;
/* 548 */                   while (parcel.dataPosition() < iI001i1O0Ol4) {
/* 550 */                       int i4 = parcel.readInt();
/* 554 */                       char c2 = (char) i4;
/* 555 */                       if (c2 == 1) {
/* 568 */                           dI000o00OoI0I = lO0Iil10.I000o00OoI0I(i4, parcel);
                                } else if (c2 != 2) {
/* 559 */                           lO0Iil10.I001IO000(i4, parcel);
                                } else {
/* 563 */                           dI000o00OoI0I2 = lO0Iil10.I000o00OoI0I(i4, parcel);
                                }
                            }
/* 573 */                   lO0Iil10.I000l1(iI001i1O0Ol4, parcel);
/* 578 */                   o0o0IiO0IoOo o0o0iio0iooo = new o0o0IiO0IoOo();
/* 581 */                   o0o0iio0iooo.I00iOIl = dI000o00OoI0I;
/* 583 */                   o0o0iio0iooo.I00iiI = dI000o00OoI0I2;
/* 585 */                   VarHandle.storeStoreFence();
/* 588 */                   return o0o0iio0iooo;
                        case 4:
/* 448 */                   int iI001i1O0Ol5 = lO0Iil10.I001i1O0Ol(parcel);
/* 452 */                   String strI000II26 = null;
/* 453 */                   String strI000II27 = null;
/* 454 */                   String strI000II28 = null;
/* 455 */                   String strI000II29 = null;
/* 456 */                   String strI000II30 = null;
/* 457 */                   String strI000II31 = null;
/* 462 */                   while (parcel.dataPosition() < iI001i1O0Ol5) {
/* 464 */                       int i5 = parcel.readInt();
                                switch ((char) i5) {
                                    case 1:
/* 506 */                               strI000II6 = lO0Iil10.I000II(i5, parcel);
                                        break;
                                    case 2:
/* 501 */                               strI000II26 = lO0Iil10.I000II(i5, parcel);
                                        break;
                                    case 3:
/* 496 */                               strI000II27 = lO0Iil10.I000II(i5, parcel);
                                        break;
                                    case 4:
/* 491 */                               strI000II28 = lO0Iil10.I000II(i5, parcel);
                                        break;
                                    case 5:
/* 486 */                               strI000II29 = lO0Iil10.I000II(i5, parcel);
                                        break;
                                    case 6:
/* 481 */                               strI000II30 = lO0Iil10.I000II(i5, parcel);
                                        break;
                                    case 7:
/* 476 */                               strI000II31 = lO0Iil10.I000II(i5, parcel);
                                        break;
                                    default:
/* 472 */                               lO0Iil10.I001IO000(i5, parcel);
                                        break;
                                }
                            }
/* 511 */                   lO0Iil10.I000l1(iI001i1O0Ol5, parcel);
/* 516 */                   o0o0i0ool o0o0i0oolVar2 = new o0o0i0ool();
/* 519 */                   o0o0i0oolVar2.I00iOIl = strI000II6;
/* 521 */                   o0o0i0oolVar2.I00iiI = strI000II26;
/* 523 */                   o0o0i0oolVar2.I00iiO = strI000II27;
/* 525 */                   o0o0i0oolVar2.I00iio = strI000II28;
/* 527 */                   o0o0i0oolVar2.I00ilI0I1 = strI000II29;
/* 529 */                   o0o0i0oolVar2.I00ilO0 = strI000II30;
/* 531 */                   o0o0i0oolVar2.I00io1l = strI000II31;
/* 533 */                   VarHandle.storeStoreFence();
/* 536 */                   return o0o0i0oolVar2;
                        case 5:
/* 399 */                   int iI001i1O0Ol6 = lO0Iil10.I001i1O0Ol(parcel);
/* 407 */                   while (parcel.dataPosition() < iI001i1O0Ol6) {
/* 409 */                       int i6 = parcel.readInt();
/* 413 */                       char c3 = (char) i6;
/* 414 */                       if (c3 == 1) {
/* 427 */                           iI0010I0i = lO0Iil10.I0010I0i(i6, parcel);
                                } else if (c3 != 2) {
/* 418 */                           lO0Iil10.I001IO000(i6, parcel);
                                } else {
/* 422 */                           strI000II5 = lO0Iil10.I000II(i6, parcel);
                                }
                            }
/* 432 */                   lO0Iil10.I000l1(iI001i1O0Ol6, parcel);
/* 437 */                   o0o0oIo0 o0o0oio0 = new o0o0oIo0();
/* 440 */                   o0o0oio0.I00iOIl = iI0010I0i;
/* 442 */                   o0o0oio0.I00iiI = strI000II5;
/* 444 */                   VarHandle.storeStoreFence();
/* 447 */                   return o0o0oio0;
                        case 6:
/* 349 */                   int iI001i1O0Ol7 = lO0Iil10.I001i1O0Ol(parcel);
/* 353 */                   String strI000II32 = null;
/* 358 */                   while (parcel.dataPosition() < iI001i1O0Ol7) {
/* 360 */                       int i7 = parcel.readInt();
/* 364 */                       char c4 = (char) i7;
/* 365 */                       if (c4 == 1) {
/* 378 */                           strI000II4 = lO0Iil10.I000II(i7, parcel);
                                } else if (c4 != 2) {
/* 369 */                           lO0Iil10.I001IO000(i7, parcel);
                                } else {
/* 373 */                           strI000II32 = lO0Iil10.I000II(i7, parcel);
                                }
                            }
/* 383 */                   lO0Iil10.I000l1(iI001i1O0Ol7, parcel);
/* 388 */                   o0o1O00 o0o1o00 = new o0o1O00();
/* 391 */                   o0o1o00.I00iOIl = strI000II4;
/* 393 */                   o0o1o00.I00iiI = strI000II32;
/* 395 */                   VarHandle.storeStoreFence();
/* 398 */                   return o0o1o00;
                        case 7:
/* 299 */                   int iI001i1O0Ol8 = lO0Iil10.I001i1O0Ol(parcel);
/* 303 */                   String strI000II33 = null;
/* 308 */                   while (parcel.dataPosition() < iI001i1O0Ol8) {
/* 310 */                       int i8 = parcel.readInt();
/* 314 */                       char c5 = (char) i8;
/* 315 */                       if (c5 == 1) {
/* 328 */                           strI000II3 = lO0Iil10.I000II(i8, parcel);
                                } else if (c5 != 2) {
/* 319 */                           lO0Iil10.I001IO000(i8, parcel);
                                } else {
/* 323 */                           strI000II33 = lO0Iil10.I000II(i8, parcel);
                                }
                            }
/* 333 */                   lO0Iil10.I000l1(iI001i1O0Ol8, parcel);
/* 338 */                   o0o1o1IOI0 o0o1o1ioi0 = new o0o1o1IOI0();
/* 341 */                   o0o1o1ioi0.I00iOIl = strI000II3;
/* 343 */                   o0o1o1ioi0.I00iiI = strI000II33;
/* 345 */                   VarHandle.storeStoreFence();
/* 348 */                   return o0o1o1ioi0;
                        case 8:
/* 240 */                   int iI001i1O0Ol9 = lO0Iil10.I001i1O0Ol(parcel);
/* 244 */                   String strI000II34 = null;
/* 249 */                   while (parcel.dataPosition() < iI001i1O0Ol9) {
/* 251 */                       int i9 = parcel.readInt();
/* 255 */                       char c6 = (char) i9;
/* 256 */                       if (c6 == 1) {
/* 276 */                           strI000II2 = lO0Iil10.I000II(i9, parcel);
                                } else if (c6 == 2) {
/* 271 */                           strI000II34 = lO0Iil10.I000II(i9, parcel);
                                } else if (c6 != 3) {
/* 262 */                           lO0Iil10.I001IO000(i9, parcel);
                                } else {
/* 266 */                           iI0010I0i = lO0Iil10.I0010I0i(i9, parcel);
                                }
                            }
/* 281 */                   lO0Iil10.I000l1(iI001i1O0Ol9, parcel);
/* 286 */                   o0oIoIIiiIo o0oioiiiiio = new o0oIoIIiiIo();
/* 289 */                   o0oioiiiiio.I00iOIl = strI000II2;
/* 291 */                   o0oioiiiiio.I00iiI = strI000II34;
/* 293 */                   o0oioiiiiio.I00iiO = iI0010I0i;
/* 295 */                   VarHandle.storeStoreFence();
/* 298 */                   return o0oioiiiiio;
                        case 9:
/* 170 */                   int iI001i1O0Ol10 = lO0Iil10.I001i1O0Ol(parcel);
/* 174 */                   String strI000II35 = null;
/* 175 */                   String strI000II36 = null;
/* 176 */                   int iI0010I0i2 = 0;
/* 181 */                   while (parcel.dataPosition() < iI001i1O0Ol10) {
/* 183 */                       int i10 = parcel.readInt();
/* 187 */                       char c7 = (char) i10;
/* 188 */                       if (c7 == 1) {
/* 215 */                           iI0010I0i = lO0Iil10.I0010I0i(i10, parcel);
                                } else if (c7 == 2) {
/* 210 */                           iI0010I0i2 = lO0Iil10.I0010I0i(i10, parcel);
                                } else if (c7 == 3) {
/* 205 */                           strI000II35 = lO0Iil10.I000II(i10, parcel);
                                } else if (c7 != 4) {
/* 196 */                           lO0Iil10.I001IO000(i10, parcel);
                                } else {
/* 200 */                           strI000II36 = lO0Iil10.I000II(i10, parcel);
                                }
                            }
/* 220 */                   lO0Iil10.I000l1(iI001i1O0Ol10, parcel);
/* 225 */                   o0oIIOiOIll1 o0oiioioill1 = new o0oIIOiOIll1();
/* 228 */                   o0oiioioill1.I00iOIl = iI0010I0i;
/* 230 */                   o0oiioioill1.I00iiI = iI0010I0i2;
/* 232 */                   o0oiioioill1.I00iiO = strI000II35;
/* 234 */                   o0oiioioill1.I00iio = strI000II36;
/* 236 */                   VarHandle.storeStoreFence();
/* 239 */                   return o0oiioioill1;
                        default:
/* 16 */                    int iI001i1O0Ol11 = lO0Iil10.I001i1O0Ol(parcel);
/* 20 */                    String strI000II37 = null;
/* 22 */                    String strI000II38 = null;
/* 24 */                    String strI000II39 = null;
/* 25 */                    String strI000II40 = null;
/* 26 */                    String strI000II41 = null;
/* 27 */                    String strI000II42 = null;
/* 28 */                    String strI000II43 = null;
/* 29 */                    String strI000II44 = null;
/* 30 */                    String strI000II45 = null;
/* 31 */                    String strI000II46 = null;
/* 32 */                    String strI000II47 = null;
/* 33 */                    String strI000II48 = null;
/* 34 */                    String strI000II49 = null;
/* 39 */                    while (parcel.dataPosition() < iI001i1O0Ol11) {
/* 41 */                        int i11 = parcel.readInt();
/* 45 */                        String str2 = strI000II49;
                                switch ((char) i11) {
                                    case 2:
/* 124 */                               strI000II = lO0Iil10.I000II(i11, parcel);
                                        break;
                                    case 3:
/* 119 */                               strI000II38 = lO0Iil10.I000II(i11, parcel);
                                        break;
                                    case 4:
/* 114 */                               strI000II39 = lO0Iil10.I000II(i11, parcel);
                                        break;
                                    case 5:
/* 109 */                               strI000II40 = lO0Iil10.I000II(i11, parcel);
                                        break;
                                    case 6:
/* 104 */                               strI000II41 = lO0Iil10.I000II(i11, parcel);
                                        break;
                                    case 7:
/* 99 */                                strI000II42 = lO0Iil10.I000II(i11, parcel);
                                        break;
                                    case '\b':
/* 94 */                                strI000II43 = lO0Iil10.I000II(i11, parcel);
                                        break;
                                    case '\t':
/* 89 */                                strI000II44 = lO0Iil10.I000II(i11, parcel);
                                        break;
                                    case '\n':
/* 84 */                                strI000II45 = lO0Iil10.I000II(i11, parcel);
                                        break;
                                    case 11:
/* 79 */                                strI000II46 = lO0Iil10.I000II(i11, parcel);
                                        break;
                                    case '\f':
/* 74 */                                strI000II47 = lO0Iil10.I000II(i11, parcel);
                                        break;
                                    case '\r':
/* 69 */                                strI000II48 = lO0Iil10.I000II(i11, parcel);
                                        break;
                                    case 14:
/* 64 */                                strI000II49 = lO0Iil10.I000II(i11, parcel);
                                        continue;
                                    case 15:
/* 57 */                                strI000II37 = lO0Iil10.I000II(i11, parcel);
                                        break;
                                    default:
/* 51 */                                lO0Iil10.I001IO000(i11, parcel);
                                        break;
                                }
/* 54 */                        strI000II49 = str2;
                            }
/* 131 */                   lO0Iil10.I000l1(iI001i1O0Ol11, parcel);
/* 136 */                   lO0Ooil lo0ooil = new lO0Ooil();
/* 139 */                   lo0ooil.I00iOIl = strI000II;
/* 141 */                   lo0ooil.I00iiI = strI000II38;
/* 143 */                   lo0ooil.I00iiO = strI000II39;
/* 145 */                   lo0ooil.I00iio = strI000II40;
/* 147 */                   lo0ooil.I00ilI0I1 = strI000II41;
/* 149 */                   lo0ooil.I00ilO0 = strI000II42;
/* 151 */                   lo0ooil.I00io1l = strI000II43;
/* 153 */                   lo0ooil.I00ioIO = strI000II44;
/* 155 */                   lo0ooil.I00l0I0l0lO1 = strI000II45;
/* 157 */                   lo0ooil.I00l0OO0IO = strI000II46;
/* 159 */                   lo0ooil.I00li1OI = strI000II47;
/* 161 */                   lo0ooil.I00ll1 = strI000II48;
/* 163 */                   lo0ooil.I00lli11 = strI000II49;
/* 167 */                   lo0ooil.I00lll10 = strI000II37;
/* 169 */                   return lo0ooil;
                    }
                }

                @Override
                public final Object[] newArray(int i) {
                    switch (this.I00000oIO) {
                        case 0:
/* 36 */                    return new o0loI0oo0I[i];
                        case 1:
/* 33 */                    return new o0loil0O[i];
                        case 2:
/* 30 */                    return new o0looOOo0[i];
                        case 3:
/* 27 */                    return new o0o0IiO0IoOo[i];
                        case 4:
/* 24 */                    return new o0o0i0ool[i];
                        case 5:
/* 21 */                    return new o0o0oIo0[i];
                        case 6:
/* 18 */                    return new o0o1O00[i];
                        case 7:
/* 15 */                    return new o0o1o1IOI0[i];
                        case 8:
/* 12 */                    return new o0oIoIIiiIo[i];
                        case 9:
/* 9 */                     return new o0oIIOiOIll1[i];
                        default:
/* 6 */                     return new lO0Ooil[i];
                    }
                }
            }

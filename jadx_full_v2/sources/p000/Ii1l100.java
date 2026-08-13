            package p000;
            
            public final class Ii1l100 extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final Ii1liIllli0 I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Ii1l100(Ii1liIllli0 ii1liIllli0, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = ii1liIllli0;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Ii1liIllli0 ii1liIllli0 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 132 */                   return new Ii1l100(ii1liIllli0, iOoil1iiIilo, 0);
                        case 1:
/* 125 */                   return new Ii1l100(ii1liIllli0, iOoil1iiIilo, 1);
                        case 2:
/* 118 */                   return new Ii1l100(ii1liIllli0, iOoil1iiIilo, 2);
                        case 3:
/* 111 */                   return new Ii1l100(ii1liIllli0, iOoil1iiIilo, 3);
                        case 4:
/* 104 */                   return new Ii1l100(ii1liIllli0, iOoil1iiIilo, 4);
                        case 5:
/* 97 */                    return new Ii1l100(ii1liIllli0, iOoil1iiIilo, 5);
                        case 6:
/* 90 */                    return new Ii1l100(ii1liIllli0, iOoil1iiIilo, 6);
                        case 7:
/* 83 */                    return new Ii1l100(ii1liIllli0, iOoil1iiIilo, 7);
                        case 8:
/* 76 */                    return new Ii1l100(ii1liIllli0, iOoil1iiIilo, 8);
                        case 9:
/* 68 */                    return new Ii1l100(ii1liIllli0, iOoil1iiIilo, 9);
                        case 10:
/* 60 */                    return new Ii1l100(ii1liIllli0, iOoil1iiIilo, 10);
                        case 11:
/* 52 */                    return new Ii1l100(ii1liIllli0, iOoil1iiIilo, 11);
                        case 12:
/* 44 */                    return new Ii1l100(ii1liIllli0, iOoil1iiIilo, 12);
                        case 13:
/* 36 */                    return new Ii1l100(ii1liIllli0, iOoil1iiIilo, 13);
                        case 14:
/* 28 */                    return new Ii1l100(ii1liIllli0, iOoil1iiIilo, 14);
                        case 15:
/* 20 */                    return new Ii1l100(ii1liIllli0, iOoil1iiIilo, 15);
                        default:
/* 12 */                    return new Ii1l100(ii1liIllli0, iOoil1iiIilo, 16);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Ii0110 ii0110 = (Ii0110) obj;
/* 7 */             IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj2;
                    switch (i) {
                    }
/* 18 */            return ((Ii1l100) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             int i2 = 2;
/* 5 */             Ii1liIllli0 ii1liIllli0 = this.I00iiO;
/* 10 */            IOoil1iiIilo iOoil1iiIilo = null;
                    switch (i) {
                        case 0:
/* 793 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 795 */                   int i3 = this.I00iiI;
/* 797 */                   if (i3 != 0) {
/* 799 */                       if (i3 == 1) {
/* 801 */                           lIoii1l01l0i.I00000oOI(obj);
/* 830 */                           return obj;
                                }
/* 805 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 10 */                        return null;
                            }
/* 810 */                   lIoii1l01l0i.I00000oOI(obj);
/* 813 */                   Ii1I1ooo10O0 ii1I1ooo10O0 = ii1liIllli0.I00000oIO;
/* 818 */                   I0I1oi i0I1oi = new I0I1oi(i2, iOoil1iiIilo, 5);
/* 821 */                   this.I00iiI = 1;
/* 823 */                   Object objI00000oIO = ii1I1ooo10O0.I00000oIO(i0I1oi, this);
                            return objI00000oIO == ii0111o ? ii0111o : objI00000oIO;
                        case 1:
/* 755 */                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 757 */                   int i4 = this.I00iiI;
/* 759 */                   if (i4 != 0) {
/* 761 */                       if (i4 == 1) {
/* 763 */                           lIoii1l01l0i.I00000oOI(obj);
/* 792 */                           return obj;
                                }
/* 767 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 10 */                        return null;
                            }
/* 772 */                   lIoii1l01l0i.I00000oOI(obj);
/* 775 */                   Ii1I1ooo10O0 ii1I1ooo10O02 = ii1liIllli0.I00000oIO;
/* 780 */                   I0I1oi i0I1oi2 = new I0I1oi(i2, iOoil1iiIilo, 6);
/* 783 */                   this.I00iiI = 1;
/* 785 */                   Object objI00000oIO2 = ii1I1ooo10O02.I00000oIO(i0I1oi2, this);
                            return objI00000oIO2 == ii0111o2 ? ii0111o2 : objI00000oIO2;
                        case 2:
/* 713 */                   Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 715 */                   int i5 = this.I00iiI;
/* 717 */                   if (i5 == 0) {
/* 729 */                       lIoii1l01l0i.I00000oOI(obj);
/* 734 */                       IlOil1ii data = ii1liIllli0.I0000Il00O.getData();
/* 738 */                       this.I00iiI = 1;
/* 740 */                       obj = ilOoO00.I00000oIO(data, this);
/* 744 */                       if (obj == ii0111o3) {
/* 746 */                           return ii0111o3;
                                }
                            } else {
/* 719 */                       if (i5 != 1) {
/* 725 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 10 */                            return null;
                                }
/* 721 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 750 */                   return ((II00iIliI0) obj).I00111O();
                        case 3:
/* 671 */                   Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 673 */                   int i6 = this.I00iiI;
/* 675 */                   if (i6 == 0) {
/* 687 */                       lIoii1l01l0i.I00000oOI(obj);
/* 692 */                       IlOil1ii data2 = ii1liIllli0.I0000O.getData();
/* 696 */                       this.I00iiI = 1;
/* 698 */                       obj = ilOoO00.I00000oIO(data2, this);
/* 702 */                       if (obj == ii0111o4) {
/* 704 */                           return ii0111o4;
                                }
                            } else {
/* 677 */                       if (i6 != 1) {
/* 683 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 10 */                            return null;
                                }
/* 679 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 708 */                   return ((Ol0olo0) obj).I001IIilI0O();
                        case 4:
/* 611 */                   Ii0111o ii0111o5 = Ii0111o.I00iOIl;
/* 613 */                   int i7 = this.I00iiI;
/* 615 */                   if (i7 == 0) {
/* 627 */                       lIoii1l01l0i.I00000oOI(obj);
/* 632 */                       IlOil1ii data3 = ii1liIllli0.I00000oIO.getData();
/* 636 */                       this.I00iiI = 1;
/* 638 */                       obj = ilOoO00.I00000oIO(data3, this);
/* 642 */                       if (obj == ii0111o5) {
/* 644 */                           return ii0111o5;
                                }
                            } else {
/* 617 */                       if (i7 != 1) {
/* 623 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 10 */                            return null;
                                }
/* 619 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 658 */                   Boolean bool = (Boolean) ((Oio11o) obj).I001i1O0Ol().get("collapse_thinking");
/* 666 */                   return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                        case 5:
/* 551 */                   Ii0111o ii0111o6 = Ii0111o.I00iOIl;
/* 553 */                   int i8 = this.I00iiI;
/* 555 */                   if (i8 == 0) {
/* 567 */                       lIoii1l01l0i.I00000oOI(obj);
/* 572 */                       IlOil1ii data4 = ii1liIllli0.I00000oIO.getData();
/* 576 */                       this.I00iiI = 1;
/* 578 */                       obj = ilOoO00.I00000oIO(data4, this);
/* 582 */                       if (obj == ii0111o6) {
/* 584 */                           return ii0111o6;
                                }
                            } else {
/* 557 */                       if (i8 != 1) {
/* 563 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 10 */                            return null;
                                }
/* 559 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 598 */                   Boolean bool2 = (Boolean) ((Oio11o) obj).I001i1O0Ol().get("confirm_clear_chat");
/* 606 */                   return Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false);
                        case 6:
/* 491 */                   Ii0111o ii0111o7 = Ii0111o.I00iOIl;
/* 493 */                   int i9 = this.I00iiI;
/* 495 */                   if (i9 == 0) {
/* 507 */                       lIoii1l01l0i.I00000oOI(obj);
/* 512 */                       IlOil1ii data5 = ii1liIllli0.I00000oIO.getData();
/* 516 */                       this.I00iiI = 1;
/* 518 */                       obj = ilOoO00.I00000oIO(data5, this);
/* 522 */                       if (obj == ii0111o7) {
/* 524 */                           return ii0111o7;
                                }
                            } else {
/* 497 */                       if (i9 != 1) {
/* 503 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 10 */                            return null;
                                }
/* 499 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 538 */                   Boolean bool3 = (Boolean) ((Oio11o) obj).I001i1O0Ol().get("haptic_on_send");
/* 546 */                   return Boolean.valueOf(bool3 != null ? bool3.booleanValue() : false);
                        case 7:
/* 445 */                   Ii0111o ii0111o8 = Ii0111o.I00iOIl;
/* 447 */                   int i10 = this.I00iiI;
/* 449 */                   if (i10 == 0) {
/* 461 */                       lIoii1l01l0i.I00000oOI(obj);
/* 466 */                       IlOil1ii data6 = ii1liIllli0.I00000oIO.getData();
/* 470 */                       this.I00iiI = 1;
/* 472 */                       obj = ilOoO00.I00000oIO(data6, this);
/* 476 */                       if (obj == ii0111o8) {
/* 478 */                           return ii0111o8;
                                }
                            } else {
/* 451 */                       if (i10 != 1) {
/* 457 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 10 */                            return null;
                                }
/* 453 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 486 */                   return Boolean.valueOf(((Oio11o) obj).I001i1lo1io());
                        case 8:
/* 385 */                   Ii0111o ii0111o9 = Ii0111o.I00iOIl;
/* 387 */                   int i11 = this.I00iiI;
/* 389 */                   if (i11 == 0) {
/* 401 */                       lIoii1l01l0i.I00000oOI(obj);
/* 406 */                       IlOil1ii data7 = ii1liIllli0.I00000oIO.getData();
/* 410 */                       this.I00iiI = 1;
/* 412 */                       obj = ilOoO00.I00000oIO(data7, this);
/* 416 */                       if (obj == ii0111o9) {
/* 418 */                           return ii0111o9;
                                }
                            } else {
/* 391 */                       if (i11 != 1) {
/* 397 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 10 */                            return null;
                                }
/* 393 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 432 */                   Boolean bool4 = (Boolean) ((Oio11o) obj).I001i1O0Ol().get("keep_screen_on");
/* 440 */                   return Boolean.valueOf(bool4 != null ? bool4.booleanValue() : false);
                        case 9:
/* 325 */                   Ii0111o ii0111o10 = Ii0111o.I00iOIl;
/* 327 */                   int i12 = this.I00iiI;
/* 329 */                   if (i12 == 0) {
/* 341 */                       lIoii1l01l0i.I00000oOI(obj);
/* 346 */                       IlOil1ii data8 = ii1liIllli0.I00000oIO.getData();
/* 350 */                       this.I00iiI = 1;
/* 352 */                       obj = ilOoO00.I00000oIO(data8, this);
/* 356 */                       if (obj == ii0111o10) {
/* 358 */                           return ii0111o10;
                                }
                            } else {
/* 331 */                       if (i12 != 1) {
/* 337 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 10 */                            return null;
                                }
/* 333 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 372 */                   Boolean bool5 = (Boolean) ((Oio11o) obj).I001i1O0Ol().get("realtime_tts");
/* 380 */                   return Boolean.valueOf(bool5 != null ? bool5.booleanValue() : false);
                        case 10:
/* 273 */                   Ii0111o ii0111o11 = Ii0111o.I00iOIl;
/* 275 */                   int i13 = this.I00iiI;
/* 277 */                   if (i13 == 0) {
/* 289 */                       lIoii1l01l0i.I00000oOI(obj);
/* 294 */                       IlOil1ii data9 = ii1liIllli0.I00000oIO.getData();
/* 298 */                       this.I00iiI = 1;
/* 300 */                       obj = ilOoO00.I00000oIO(data9, this);
/* 304 */                       if (obj == ii0111o11) {
/* 306 */                           return ii0111o11;
                                }
                            } else {
/* 279 */                       if (i13 != 1) {
/* 285 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 10 */                            return null;
                                }
/* 281 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 320 */                   return Boolean.valueOf(((Oio11o) obj).I001lloI().contains("gm4_banner"));
                        case 11:
/* 227 */                   Ii0111o ii0111o12 = Ii0111o.I00iOIl;
/* 229 */                   int i14 = this.I00iiI;
/* 231 */                   if (i14 == 0) {
/* 243 */                       lIoii1l01l0i.I00000oOI(obj);
/* 248 */                       IlOil1ii data10 = ii1liIllli0.I00000oIO.getData();
/* 252 */                       this.I00iiI = 1;
/* 254 */                       obj = ilOoO00.I00000oIO(data10, this);
/* 258 */                       if (obj == ii0111o12) {
/* 260 */                           return ii0111o12;
                                }
                            } else {
/* 233 */                       if (i14 != 1) {
/* 239 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 10 */                            return null;
                                }
/* 235 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 268 */                   return Boolean.valueOf(((Oio11o) obj).I001l0I00());
                        case 12:
/* 185 */                   Ii0111o ii0111o13 = Ii0111o.I00iOIl;
/* 187 */                   int i15 = this.I00iiI;
/* 189 */                   if (i15 == 0) {
/* 201 */                       lIoii1l01l0i.I00000oOI(obj);
/* 206 */                       IlOil1ii data11 = ii1liIllli0.I00000oOI.getData();
/* 210 */                       this.I00iiI = 1;
/* 212 */                       obj = ilOoO00.I00000oIO(data11, this);
/* 216 */                       if (obj == ii0111o13) {
/* 218 */                           return ii0111o13;
                                }
                            } else {
/* 191 */                       if (i15 != 1) {
/* 197 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 10 */                            return null;
                                }
/* 193 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 222 */                   return ((Ooli101Iii1) obj).I0010I0i();
                        case 13:
/* 143 */                   Ii0111o ii0111o14 = Ii0111o.I00iOIl;
/* 145 */                   int i16 = this.I00iiI;
/* 147 */                   if (i16 == 0) {
/* 159 */                       lIoii1l01l0i.I00000oOI(obj);
/* 164 */                       IlOil1ii data12 = ii1liIllli0.I00000oIO.getData();
/* 168 */                       this.I00iiI = 1;
/* 170 */                       obj = ilOoO00.I00000oIO(data12, this);
/* 174 */                       if (obj == ii0111o14) {
/* 176 */                           return ii0111o14;
                                }
                            } else {
/* 149 */                       if (i16 != 1) {
/* 155 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 10 */                            return null;
                                }
/* 151 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 180 */                   return ((Oio11o) obj).I001iOo1i0O();
                        case 14:
/* 101 */                   Ii0111o ii0111o15 = Ii0111o.I00iOIl;
/* 103 */                   int i17 = this.I00iiI;
/* 105 */                   if (i17 == 0) {
/* 117 */                       lIoii1l01l0i.I00000oOI(obj);
/* 122 */                       IlOil1ii data13 = ii1liIllli0.I00000oIO.getData();
/* 126 */                       this.I00iiI = 1;
/* 128 */                       obj = ilOoO00.I00000oIO(data13, this);
/* 132 */                       if (obj == ii0111o15) {
/* 134 */                           return ii0111o15;
                                }
                            } else {
/* 107 */                       if (i17 != 1) {
/* 113 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 10 */                            return null;
                                }
/* 109 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 138 */                   return ((Oio11o) obj).I001lIiIIo1O();
                        case 15:
/* 53 */                    Ii0111o ii0111o16 = Ii0111o.I00iOIl;
/* 55 */                    int i18 = this.I00iiI;
/* 57 */                    if (i18 == 0) {
/* 69 */                        lIoii1l01l0i.I00000oOI(obj);
/* 74 */                        IlOil1ii data14 = ii1liIllli0.I00000oIO.getData();
/* 78 */                        this.I00iiI = 1;
/* 80 */                        obj = ilOoO00.I00000oIO(data14, this);
/* 84 */                        if (obj == ii0111o16) {
/* 86 */                            return ii0111o16;
                                }
                            } else {
/* 59 */                        if (i18 != 1) {
/* 65 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 10 */                            return null;
                                }
/* 61 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 90 */                    Oo0oOoIo0ol oo0oOoIo0olI001lllioOl = ((Oio11o) obj).I001lllioOl();
                            return oo0oOoIo0olI001lllioOl == Oo0oOoIo0ol.THEME_UNSPECIFIED ? Oo0oOoIo0ol.THEME_AUTO : oo0oOoIo0olI001lllioOl;
                        default:
/* 14 */                    Ii0111o ii0111o17 = Ii0111o.I00iOIl;
/* 16 */                    int i19 = this.I00iiI;
/* 18 */                    if (i19 != 0) {
/* 20 */                        if (i19 == 1) {
/* 22 */                            lIoii1l01l0i.I00000oOI(obj);
/* 52 */                            return obj;
                                }
/* 26 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 10 */                        return null;
                            }
/* 31 */                    lIoii1l01l0i.I00000oOI(obj);
/* 34 */                    Ii1I1ooo10O0 ii1I1ooo10O03 = ii1liIllli0.I00000oIO;
/* 40 */                    I0I1oi i0I1oi3 = new I0I1oi(i2, iOoil1iiIilo, 8);
/* 43 */                    this.I00iiI = 1;
/* 45 */                    Object objI00000oIO3 = ii1I1ooo10O03.I00000oIO(i0I1oi3, this);
                            return objI00000oIO3 == ii0111o17 ? ii0111o17 : objI00000oIO3;
                    }
                }
            }

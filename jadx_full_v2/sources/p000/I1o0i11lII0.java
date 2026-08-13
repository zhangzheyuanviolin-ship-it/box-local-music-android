            package p000;

            import android.content.Context;
            import android.graphics.Bitmap;
            import android.net.Uri;
            import java.io.BufferedReader;
            import java.io.InputStream;
            import java.io.InputStreamReader;
            import java.util.List;
            
/* 16 */    public final class I1o0i11lII0 extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public OI10i0Il I00iiI;
                public int I00iiO;
                public final Context I00iio;
                public final Uri I00ilI0I1;
                public final OI10i0Il I00ilO0;
                public final OI10i0Il I00io1l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I1o0i11lII0(Context context, Uri uri, OI10i0Il oI10i0Il, OI10i0Il oI10i0Il2, OI10i0Il oI10i0Il3, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 14 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iio = context;
/* 5 */             this.I00ilI0I1 = uri;
/* 7 */             this.I00iiI = oI10i0Il;
/* 9 */             this.I00ilO0 = oI10i0Il2;
/* 11 */            this.I00io1l = oI10i0Il3;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
                    switch (this.I00iOIl) {
                        case 0:
/* 139 */                   return new I1o0i11lII0(this.I00iio, this.I00ilI0I1, this.I00iiI, this.I00ilO0, this.I00io1l, iOoil1iiIilo, 0);
                        case 1:
/* 120 */                   return new I1o0i11lII0(this.I00iio, this.I00ilI0I1, this.I00ilO0, this.I00io1l, iOoil1iiIilo, 1);
                        case 2:
/* 104 */                   return new I1o0i11lII0(this.I00iio, this.I00ilI0I1, this.I00ilO0, this.I00io1l, iOoil1iiIilo, 2);
                        case 3:
/* 88 */                    return new I1o0i11lII0(this.I00iio, this.I00ilI0I1, this.I00ilO0, this.I00io1l, iOoil1iiIilo, 3);
                        case 4:
/* 72 */                    return new I1o0i11lII0(this.I00iio, this.I00ilI0I1, this.I00iiI, this.I00ilO0, this.I00io1l, iOoil1iiIilo, 4);
                        case 5:
/* 53 */                    return new I1o0i11lII0(this.I00iio, this.I00ilI0I1, this.I00iiI, this.I00ilO0, this.I00io1l, iOoil1iiIilo, 5);
                        case 6:
/* 34 */                    return new I1o0i11lII0(this.I00iio, this.I00ilI0I1, this.I00ilO0, this.I00io1l, iOoil1iiIilo, 6);
                        default:
/* 18 */                    return new I1o0i11lII0(this.I00iio, this.I00ilI0I1, this.I00ilO0, this.I00io1l, iOoil1iiIilo, 7);
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
/* 18 */            return ((I1o0i11lII0) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objI0000oI00;
                    Object objI00IioO0OiOi;
                    Object objI00IioO0OiOi2;
                    Object objI00IioO0OiOi3;
                    InputStream inputStreamOpenInputStream;
                    OIliOo11 oIliOo11I0000Il00O;
                    Object objI00IioO0OiOi4;
                    Object objI00IioO0OiOi5;
/* 3 */             int i = this.I00iOIl;
/* 13 */            int i2 = 2;
/* 14 */            OI10i0Il oI10i0Il = this.I00io1l;
/* 16 */            OI10i0Il oI10i0Il2 = this.I00ilO0;
/* 18 */            String strI00000oOI = "";
/* 20 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 22 */            Uri uri = this.I00ilI0I1;
/* 24 */            Context context = this.I00iio;
/* 28 */            int i3 = 1;
/* 29 */            IOoil1iiIilo iOoil1iiIilo = null;
                    switch (i) {
                        case 0:
/* 722 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 724 */                   int i4 = this.I00iiO;
/* 726 */                   if (i4 == 0) {
/* 741 */                       lIoii1l01l0i.I00000oOI(obj);
/* 744 */                       this.I00iiO = 1;
/* 746 */                       IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 756 */                       objI0000oI00 = iOi1II01i0.I0000oI00(Ii1oo1ooill0.I00iiI, new I1o0lo01(context, uri, null, 0), this);
/* 760 */                       if (objI0000oI00 == ii0111o) {
/* 762 */                           return ii0111o;
                                }
                            } else {
/* 728 */                       if (i4 != 1) {
/* 736 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 29 */                            return null;
                                }
/* 730 */                       lIoii1l01l0i.I00000oOI(obj);
/* 733 */                       objI0000oI00 = obj;
                            }
/* 764 */                   Bitmap bitmap = (Bitmap) objI0000oI00;
/* 766 */                   if (bitmap == null) {
/* 779 */                       oI10i0Il.setValue("Failed to load image");
/* 782 */                       return ooiIlOl1iI;
                            }
/* 770 */                   this.I00iiI.setValue(bitmap);
/* 773 */                   oI10i0Il2.setValue(null);
/* 782 */                   return ooiIlOl1iI;
                        case 1:
/* 675 */                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 677 */                   int i5 = this.I00iiO;
/* 679 */                   if (i5 == 0) {
/* 696 */                       lIoii1l01l0i.I00000oOI(obj);
/* 699 */                       this.I00iiI = oI10i0Il2;
/* 701 */                       this.I00iiO = 1;
/* 703 */                       objI00IioO0OiOi = Iloo0ilo.I00IioO0OiOi(context, uri, this);
/* 707 */                       if (objI00IioO0OiOi == ii0111o2) {
/* 709 */                           return ii0111o2;
                                }
                            } else {
/* 681 */                       if (i5 != 1) {
/* 691 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 29 */                            return null;
                                }
/* 683 */                       oI10i0Il2 = this.I00iiI;
/* 685 */                       lIoii1l01l0i.I00000oOI(obj);
/* 688 */                       objI00IioO0OiOi = obj;
                            }
/* 713 */                   List list = Iloo0ilo.I00000oIO;
/* 715 */                   oI10i0Il2.setValue((Bitmap) objI00IioO0OiOi);
/* 718 */                   oI10i0Il.setValue("");
/* 721 */                   return ooiIlOl1iI;
                        case 2:
/* 628 */                   Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 630 */                   int i6 = this.I00iiO;
/* 632 */                   if (i6 == 0) {
/* 649 */                       lIoii1l01l0i.I00000oOI(obj);
/* 652 */                       this.I00iiI = oI10i0Il2;
/* 654 */                       this.I00iiO = 1;
/* 656 */                       objI00IioO0OiOi2 = Iloo0ilo.I00IioO0OiOi(context, uri, this);
/* 660 */                       if (objI00IioO0OiOi2 == ii0111o3) {
/* 662 */                           return ii0111o3;
                                }
                            } else {
/* 634 */                       if (i6 != 1) {
/* 644 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 29 */                            return null;
                                }
/* 636 */                       oI10i0Il2 = this.I00iiI;
/* 638 */                       lIoii1l01l0i.I00000oOI(obj);
/* 641 */                       objI00IioO0OiOi2 = obj;
                            }
/* 666 */                   List list2 = Iloo0ilo.I00000oIO;
/* 668 */                   oI10i0Il2.setValue((Bitmap) objI00IioO0OiOi2);
/* 671 */                   oI10i0Il.setValue("");
/* 674 */                   return ooiIlOl1iI;
                        case 3:
/* 581 */                   Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 583 */                   int i7 = this.I00iiO;
/* 585 */                   if (i7 == 0) {
/* 602 */                       lIoii1l01l0i.I00000oOI(obj);
/* 605 */                       this.I00iiI = oI10i0Il2;
/* 607 */                       this.I00iiO = 1;
/* 609 */                       objI00IioO0OiOi3 = Iloo0ilo.I00IioO0OiOi(context, uri, this);
/* 613 */                       if (objI00IioO0OiOi3 == ii0111o4) {
/* 615 */                           return ii0111o4;
                                }
                            } else {
/* 587 */                       if (i7 != 1) {
/* 597 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 29 */                            return null;
                                }
/* 589 */                       oI10i0Il2 = this.I00iiI;
/* 591 */                       lIoii1l01l0i.I00000oOI(obj);
/* 594 */                       objI00IioO0OiOi3 = obj;
                            }
/* 619 */                   List list3 = Iloo0ilo.I00000oIO;
/* 621 */                   oI10i0Il2.setValue((Bitmap) objI00IioO0OiOi3);
/* 624 */                   oI10i0Il.setValue("");
/* 627 */                   return ooiIlOl1iI;
                        case 4:
/* 354 */                   Ii0111o ii0111o5 = Ii0111o.I00iOIl;
/* 356 */                   int i8 = this.I00iiO;
                            try {
                            } catch (Exception e) {
/* 560 */                       IiI0oillOO10 iiI0oillOO102 = IiiIil1lOIO.I00000oIO;
/* 562 */                       Io11l1li io11l1li = O1OI1l011OO1.I00000oIO;
/* 568 */                       Ilol1I ilol1I = new Ilol1I(e, this.I00iiI, iOoil1iiIilo, i3);
/* 571 */                       this.I00iiO = 2;
/* 577 */                       if (iOi1II01i0.I0000oI00(io11l1li, ilol1I, this) != ii0111o5) {
/* 580 */                           return ooiIlOl1iI;
                                }
                            }
/* 358 */                   if (i8 != 0) {
/* 360 */                       if (i8 == 1) {
/* 375 */                           lIoii1l01l0i.I00000oOI(obj);
/* 580 */                           return ooiIlOl1iI;
                                }
/* 362 */                       if (i8 == 2) {
/* 364 */                           lIoii1l01l0i.I00000oOI(obj);
/* 580 */                           return ooiIlOl1iI;
                                }
/* 369 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 29 */                        return null;
                            }
/* 383 */                   lIoii1l01l0i.I00000oOI(obj);
/* 386 */                   String strI00Io1lO = Iloo0ilo.I00Io1lO(context, uri);
/* 402 */                   if (O0000Ioio00.I0000O(context.getContentResolver().getType(uri), "application/pdf") || OlOolloIIOl0.I000II(strI00Io1lO, ".pdf", true)) {
/* 453 */                       inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
/* 457 */                       if (inputStreamOpenInputStream != null) {
                                    try {
/* 459 */                               oIliOo11I0000Il00O = OIliOo11.I0000Il00O(inputStreamOpenInputStream);
                                        try {
/* 468 */                                   String strI000l1 = new OIll0O().I000l1(oIliOo11I0000Il00O);
/* 472 */                                   oIliOo11I0000Il00O.close();
/* 475 */                                   inputStreamOpenInputStream.close();
/* 478 */                                   if (strI000l1 != null) {
/* 481 */                                       strI00000oOI = strI000l1;
                                            }
                                        } finally {
                                            try {
/* 488 */                                       throw th;
                                            } finally {
                                            }
                                        }
                                    } finally {
                                        try {
/* 494 */                                   throw th;
                                        } finally {
                                        }
                                    }
                                }
                            } else {
/* 415 */                       inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
/* 419 */                       if (inputStreamOpenInputStream != null) {
                                    try {
/* 433 */                               strI00000oOI = lOliOoIi.I00000oOI(new BufferedReader(new InputStreamReader(inputStreamOpenInputStream, IO1IOI.I00000oIO), 8192));
/* 437 */                               inputStreamOpenInputStream.close();
                                    } finally {
                                        try {
/* 443 */                                   throw th;
                                        } finally {
                                        }
                                    }
                                }
                            }
/* 500 */                   String strI00Io1o110i = Iloo0ilo.I00Io1o110i(strI00000oOI);
/* 510 */                   if (strI00Io1o110i.length() > 10000) {
/* 516 */                       strI00Io1o110i = OlOoOIi0o.I00OIl(10000, strI00Io1o110i).concat("\n\n[Truncated]");
                            }
/* 520 */                   String str = strI00Io1o110i;
/* 522 */                   IiI0oillOO10 iiI0oillOO103 = IiiIil1lOIO.I00000oIO;
/* 524 */                   Io11l1li io11l1li2 = O1OI1l011OO1.I00000oIO;
/* 546 */                   Ilol0ooO ilol0ooO = new Ilol0ooO(str, strI00Io1lO, this.I00iiI, this.I00ilO0, this.I00io1l, null, 1);
/* 551 */                   this.I00iiO = 1;
/* 557 */                   if (iOi1II01i0.I0000oI00(io11l1li2, ilol0ooO, this) != ii0111o5) {
/* 580 */                       return ooiIlOl1iI;
                            }
/* 579 */                   return ii0111o5;
                        case 5:
/* 127 */                   Ii0111o ii0111o6 = Ii0111o.I00iOIl;
/* 129 */                   int i9 = this.I00iiO;
                            try {
                            } catch (Exception e2) {
/* 333 */                       IiI0oillOO10 iiI0oillOO104 = IiiIil1lOIO.I00000oIO;
/* 335 */                       Io11l1li io11l1li3 = O1OI1l011OO1.I00000oIO;
/* 341 */                       Ilol1I ilol1I2 = new Ilol1I(e2, this.I00iiI, iOoil1iiIilo, i2);
/* 344 */                       this.I00iiO = 2;
/* 350 */                       if (iOi1II01i0.I0000oI00(io11l1li3, ilol1I2, this) != ii0111o6) {
/* 353 */                           return ooiIlOl1iI;
                                }
                            }
/* 131 */                   if (i9 != 0) {
/* 133 */                       if (i9 == 1) {
/* 148 */                           lIoii1l01l0i.I00000oOI(obj);
/* 353 */                           return ooiIlOl1iI;
                                }
/* 135 */                       if (i9 == 2) {
/* 137 */                           lIoii1l01l0i.I00000oOI(obj);
/* 353 */                           return ooiIlOl1iI;
                                }
/* 142 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 29 */                        return null;
                            }
/* 156 */                   lIoii1l01l0i.I00000oOI(obj);
/* 159 */                   String strI00Io1lO2 = Iloo0ilo.I00Io1lO(context, uri);
/* 175 */                   if (O0000Ioio00.I0000O(context.getContentResolver().getType(uri), "application/pdf") || OlOolloIIOl0.I000II(strI00Io1lO2, ".pdf", true)) {
/* 226 */                       inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
/* 230 */                       if (inputStreamOpenInputStream != null) {
                                    try {
/* 232 */                               oIliOo11I0000Il00O = OIliOo11.I0000Il00O(inputStreamOpenInputStream);
                                        try {
/* 241 */                                   String strI000l12 = new OIll0O().I000l1(oIliOo11I0000Il00O);
/* 245 */                                   oIliOo11I0000Il00O.close();
/* 248 */                                   inputStreamOpenInputStream.close();
/* 251 */                                   if (strI000l12 != null) {
/* 254 */                                       strI00000oOI = strI000l12;
                                            }
                                        } finally {
                                        }
                                    } finally {
                                    }
                                }
                            } else {
/* 188 */                       inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
/* 192 */                       if (inputStreamOpenInputStream != null) {
                                    try {
/* 206 */                               strI00000oOI = lOliOoIi.I00000oOI(new BufferedReader(new InputStreamReader(inputStreamOpenInputStream, IO1IOI.I00000oIO), 8192));
/* 210 */                               inputStreamOpenInputStream.close();
                                    } finally {
                                        try {
/* 216 */                                   throw th;
                                        } finally {
                                        }
                                    }
                                }
                            }
/* 273 */                   String strI00Io1o110i2 = Iloo0ilo.I00Io1o110i(strI00000oOI);
/* 283 */                   if (strI00Io1o110i2.length() > 10000) {
/* 289 */                       strI00Io1o110i2 = OlOoOIi0o.I00OIl(10000, strI00Io1o110i2).concat("\n\n[Truncated]");
                            }
/* 293 */                   String str2 = strI00Io1o110i2;
/* 295 */                   IiI0oillOO10 iiI0oillOO105 = IiiIil1lOIO.I00000oIO;
/* 297 */                   Io11l1li io11l1li4 = O1OI1l011OO1.I00000oIO;
/* 319 */                   Ilol0ooO ilol0ooO2 = new Ilol0ooO(str2, strI00Io1lO2, this.I00iiI, this.I00ilO0, this.I00io1l, null, 2);
/* 324 */                   this.I00iiO = 1;
/* 330 */                   if (iOi1II01i0.I0000oI00(io11l1li4, ilol0ooO2, this) != ii0111o6) {
/* 353 */                       return ooiIlOl1iI;
                            }
/* 352 */                   return ii0111o6;
                        case 6:
/* 80 */                    Ii0111o ii0111o7 = Ii0111o.I00iOIl;
/* 82 */                    int i10 = this.I00iiO;
/* 84 */                    if (i10 == 0) {
/* 101 */                       lIoii1l01l0i.I00000oOI(obj);
/* 104 */                       this.I00iiI = oI10i0Il2;
/* 106 */                       this.I00iiO = 1;
/* 108 */                       objI00IioO0OiOi4 = Iloo0ilo.I00IioO0OiOi(context, uri, this);
/* 112 */                       if (objI00IioO0OiOi4 == ii0111o7) {
/* 114 */                           return ii0111o7;
                                }
                            } else {
/* 86 */                        if (i10 != 1) {
/* 96 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 29 */                            return null;
                                }
/* 88 */                        oI10i0Il2 = this.I00iiI;
/* 90 */                        lIoii1l01l0i.I00000oOI(obj);
/* 93 */                        objI00IioO0OiOi4 = obj;
                            }
/* 118 */                   List list4 = Iloo0ilo.I00000oIO;
/* 120 */                   oI10i0Il2.setValue((Bitmap) objI00IioO0OiOi4);
/* 123 */                   oI10i0Il.setValue("");
/* 126 */                   return ooiIlOl1iI;
                        default:
/* 33 */                    Ii0111o ii0111o8 = Ii0111o.I00iOIl;
/* 35 */                    int i11 = this.I00iiO;
/* 37 */                    if (i11 == 0) {
/* 54 */                        lIoii1l01l0i.I00000oOI(obj);
/* 57 */                        this.I00iiI = oI10i0Il2;
/* 59 */                        this.I00iiO = 1;
/* 61 */                        objI00IioO0OiOi5 = Iloo0ilo.I00IioO0OiOi(context, uri, this);
/* 65 */                        if (objI00IioO0OiOi5 == ii0111o8) {
/* 67 */                            return ii0111o8;
                                }
                            } else {
/* 39 */                        if (i11 != 1) {
/* 49 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 29 */                            return null;
                                }
/* 41 */                        oI10i0Il2 = this.I00iiI;
/* 43 */                        lIoii1l01l0i.I00000oOI(obj);
/* 46 */                        objI00IioO0OiOi5 = obj;
                            }
/* 71 */                    List list5 = Iloo0ilo.I00000oIO;
/* 73 */                    oI10i0Il2.setValue((Bitmap) objI00IioO0OiOi5);
/* 76 */                    oI10i0Il.setValue("");
/* 79 */                    return ooiIlOl1iI;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 17 */        public I1o0i11lII0(Context context, Uri uri, OI10i0Il oI10i0Il, OI10i0Il oI10i0Il2, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(2, iOoil1iiIilo);
/* 18 */            this.I00iOIl = i;
                    this.I00iio = context;
                    this.I00ilI0I1 = uri;
                    this.I00ilO0 = oI10i0Il;
                    this.I00io1l = oI10i0Il2;
                }
            }

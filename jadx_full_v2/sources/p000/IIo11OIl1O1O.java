            package p000;

            import android.content.Context;
            import android.graphics.Bitmap;
            import android.util.Log;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.Locale;
            import java.util.concurrent.CancellationException;
            
/* 22 */    public final class IIo11OIl1O1O extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;
                public Object I00ilO0;
                public Object I00io1l;
                public final Object I00ioIO;
                public final Object I00l0I0l0lO1;
                public final Object I00l0OO0IO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IIo11OIl1O1O(Object obj, Object obj2, OI10i0Il oI10i0Il, OI10i0Il oI10i0Il2, OI10i0Il oI10i0Il3, OI10i0Il oI10i0Il4, Object obj3, OI10i0Il oI10i0Il5, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 20 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = obj;
/* 5 */             this.I00iio = obj2;
/* 7 */             this.I00ilI0I1 = oI10i0Il;
/* 9 */             this.I00ilO0 = oI10i0Il2;
/* 11 */            this.I00io1l = oI10i0Il3;
/* 13 */            this.I00ioIO = oI10i0Il4;
/* 15 */            this.I00l0I0l0lO1 = obj3;
/* 17 */            this.I00l0OO0IO = oI10i0Il5;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 3 */             int i = this.I00iOIl;
/* 5 */             Object obj2 = this.I00l0OO0IO;
/* 7 */             Object obj3 = this.I00l0I0l0lO1;
/* 9 */             Object obj4 = this.I00ioIO;
                    switch (i) {
                        case 0:
/* 148 */                   IIo11OIl1O1O iIo11OIl1O1O = new IIo11OIl1O1O((IIo11l1iO) obj4, (String) obj3, (I0lIllO) obj2, iOoil1iiIilo);
/* 153 */                   iIo11OIl1O1O.I00io1l = obj;
/* 155 */                   return iIo11OIl1O1O;
                        case 1:
/* 134 */                   return new IIo11OIl1O1O((IlooOlI) this.I00iiO, (Ii0110) this.I00iio, (OI10i0Il) this.I00ilI0I1, (OI10i0Il) this.I00ilO0, (OI10i0Il) this.I00io1l, (OI10i0Il) obj4, (Ol1OlloIO) obj3, (OI10i0Il) obj2, iOoil1iiIilo, 1);
                        case 2:
/* 90 */                    return new IIo11OIl1O1O((Context) this.I00iio, (OI10i0Il) this.I00ilI0I1, (O0oiOi) this.I00ilO0, (OOIIOiolI) this.I00io1l, (Ioi1Io1o) obj4, (OIooi1iOiOol) obj3, (OI10i0Il) obj2, iOoil1iiIilo);
                        default:
/* 53 */                    return new IIo11OIl1O1O((O0o0I1i0O) this.I00iiO, (OI10i0Il) this.I00iio, (OI10i0Il) this.I00ilI0I1, (OI10i0Il) this.I00ilO0, (OI10i0Il) this.I00io1l, (OI10i0Il) obj4, (OI10i0Il) obj3, (OI10i0Il) obj2, iOoil1iiIilo, 3);
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
/* 18 */            return ((IIo11OIl1O1O) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                /* JADX WARN: Code restructure failed: missing block: B:133:0x03e6, code lost:
                
                    if (r3 == r0) goto L134;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:159:0x03ea, code lost:
                
                    if (r3 == r0) goto L134;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:82:0x0227, code lost:
                
                    if (r0.I00000oIO(r7, r24) == r14) goto L83;
                 */
                /* JADX WARN: Removed duplicated region for block: B:115:0x0332 A[Catch: all -> 0x02d0, TRY_ENTER, TryCatch #0 {all -> 0x02d0, blocks: (B:107:0x02c6, B:135:0x03ea, B:137:0x03ee, B:139:0x0408, B:140:0x040e, B:142:0x0414, B:143:0x041a, B:145:0x0420, B:147:0x0426, B:149:0x042c, B:115:0x0332, B:117:0x0341, B:118:0x034e, B:120:0x0354, B:121:0x0361, B:124:0x0369, B:125:0x0393, B:127:0x0399, B:129:0x03c4, B:131:0x03dd, B:132:0x03e2), top: B:156:0x02c6 }] */
                /* JADX WARN: Removed duplicated region for block: B:137:0x03ee A[Catch: all -> 0x02d0, TryCatch #0 {all -> 0x02d0, blocks: (B:107:0x02c6, B:135:0x03ea, B:137:0x03ee, B:139:0x0408, B:140:0x040e, B:142:0x0414, B:143:0x041a, B:145:0x0420, B:147:0x0426, B:149:0x042c, B:115:0x0332, B:117:0x0341, B:118:0x034e, B:120:0x0354, B:121:0x0361, B:124:0x0369, B:125:0x0393, B:127:0x0399, B:129:0x03c4, B:131:0x03dd, B:132:0x03e2), top: B:156:0x02c6 }] */
                /* JADX WARN: Removed duplicated region for block: B:151:0x0431  */
                /* JADX WARN: Removed duplicated region for block: B:154:0x043a  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x00b8 A[PHI: r11
                  0x00b8: PHI (r11v17 boolean) = (r11v16 boolean), (r11v20 boolean) binds: [B:21:0x00a8, B:23:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:29:0x00ca  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    OOo0ooi oOo0ooi;
                    I0lIllO i0lIllO;
                    OOo0ooi oOo0ooi2;
                    Ii0110 ii0110;
                    OOo0ooi oOo0ooi3;
                    OOo0ooi oOo0ooi4;
                    CancellationException cancellationException;
                    String message;
                    Object objI0000Il00O;
                    Object objI00000oIO;
                    OI10i0Il oI10i0Il;
                    List list;
/* 3 */             int i = this.I00iOIl;
/* 7 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 9 */             Object obj2 = this.I00l0OO0IO;
/* 13 */            Object obj3 = this.I00ioIO;
/* 15 */            Object obj4 = this.I00l0I0l0lO1;
/* 18 */            boolean z = true;
                    switch (i) {
                        case 0:
/* 672 */                   String str = (String) obj4;
/* 674 */                   IIo11l1iO iIo11l1iO = (IIo11l1iO) obj3;
/* 677 */                   I0lIllO i0lIllO2 = (I0lIllO) obj2;
/* 679 */                   Object oIi0ooOoOOo0 = Ii0111o.I00iOIl;
/* 681 */                   int i2 = this.I00iiI;
/* 685 */                   IOoil1iiIilo iOoil1iiIilo = null;
/* 686 */                   if (i2 == 0) {
/* 730 */                       lIoii1l01l0i.I00000oOI(obj);
/* 735 */                       Ii0110 ii01102 = (Ii0110) this.I00io1l;
/* 739 */                       oOo0ooi = new OOo0ooi();
/* 746 */                       i0lIllO = i0lIllO2;
/* 755 */                       oOo0ooi.I00iOIl = iOi1II01i0.I00000oOI(ii01102, null, new I00oIiI10(iIo11l1iO, str, i0lIllO, iOoil1iiIilo, 20), 3);
/* 759 */                       OOo0ooi oOo0ooi5 = new OOo0ooi();
/* 773 */                       oOo0ooi5.I00iOIl = iOi1II01i0.I00000oOI(ii01102, null, new I0II0OiI(i0lIllO, iOoil1iiIilo, 11), 3);
/* 777 */                       OOo0ooi oOo0ooi6 = new OOo0ooi();
/* 790 */                       oOo0ooi6.I00iOIl = iOi1II01i0.I0000O(ii01102, null, null, new IIo10olO0(2, null, 0), 3);
/* 794 */                       oOo0ooi2 = new OOo0ooi();
/* 808 */                       oOo0ooi2.I00iOIl = iOi1II01i0.I0000O(ii01102, null, null, new I0II0OiI(iIo11l1iO, iOoil1iiIilo, 10), 3);
/* 810 */                       ii0110 = ii01102;
/* 811 */                       oOo0ooi3 = oOo0ooi5;
/* 812 */                       oOo0ooi4 = oOo0ooi6;
/* 817 */                       if (il001oo1.I0000O(ii0110)) {
                                }
/* 1001 */                      return oIi0ooOoOOo0;
                            }
/* 689 */                   if (i2 != 1) {
/* 724 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 671 */                       return null;
                            }
/* 693 */                   oOo0ooi2 = (OOo0ooi) this.I00ilO0;
/* 697 */                   OOo0ooi oOo0ooi7 = (OOo0ooi) this.I00ilI0I1;
/* 701 */                   oOo0ooi3 = (OOo0ooi) this.I00iio;
/* 705 */                   OOo0ooi oOo0ooi8 = (OOo0ooi) this.I00iiO;
/* 709 */                   ii0110 = (Ii0110) this.I00io1l;
                            try {
/* 711 */                       lIoii1l01l0i.I00000oOI(obj);
/* 714 */                       oOo0ooi4 = oOo0ooi7;
/* 715 */                       oOo0ooi = oOo0ooi8;
/* 716 */                       i0lIllO = i0lIllO2;
/* 717 */                       Object objI0000O = obj;
/* 1003 */                      OIi0ooOoOOo0 oIi0ooOoOOo02 = (OIi0ooOoOOo0) objI0000O;
/* 1005 */                      if (oIi0ooOoOOo02 == null) {
/* 1024 */                          Log.i("CXCP", "Camera open completed: " + oIi0ooOoOOo02);
/* 1029 */                          O010OIi o010OIi = (IiIOI1ol0o) oOo0ooi.I00iOIl;
/* 1031 */                          if (o010OIi != null) {
/* 1036 */                              ((O011OOl11) o010OIi).I000II(null);
                                    }
/* 1041 */                          O010OIi o010OIi2 = (IiIOI1ol0o) oOo0ooi3.I00iOIl;
/* 1043 */                          if (o010OIi2 != null) {
/* 1048 */                              ((O011OOl11) o010OIi2).I000II(null);
                                    }
/* 1053 */                          O010OIi o010OIi3 = (O010OIi) oOo0ooi4.I00iOIl;
/* 1055 */                          if (o010OIi3 != null) {
/* 1057 */                              cancellationException = null;
/* 1058 */                              o010OIi3.I000II(null);
                                    } else {
/* 1062 */                              cancellationException = null;
                                    }
/* 1065 */                          O010OIi o010OIi4 = (O010OIi) oOo0ooi2.I00iOIl;
/* 1067 */                          if (o010OIi4 != null) {
/* 1069 */                              o010OIi4.I000II(cancellationException);
                                    }
/* 1072 */                          return oIi0ooOoOOo02;
                                }
/* 1074 */                      iOoil1iiIilo = null;
/* 817 */                       if (il001oo1.I0000O(ii0110)) {
/* 1093 */                          oIi0ooOoOOo0 = new OIi0ooOoOOo0(null, IIlOloloOil.I00000oIO(12), 1);
                                } else {
/* 825 */                           OiiIl0O1I11 oiiIl0O1I11 = new OiiIl0O1I11(getContext());
/* 830 */                           IiIOI1ol0o iiIOI1ol0o = (IiIOI1ol0o) oOo0ooi.I00iOIl;
/* 832 */                           if (iiIOI1ol0o != null) {
/* 844 */                               oiiIl0O1I11.I0001Ioi1lo(iiIOI1ol0o.I00100l0(), new IIo10i(oOo0ooi, str, iOoil1iiIilo, 0));
                                    }
/* 849 */                           IiIOI1ol0o iiIOI1ol0o2 = (IiIOI1ol0o) oOo0ooi3.I00iOIl;
/* 851 */                           if (iiIOI1ol0o2 != null) {
/* 863 */                               oiiIl0O1I11.I0001Ioi1lo(iiIOI1ol0o2.I00100l0(), new IIo10i(oOo0ooi3, str, iOoil1iiIilo, 1));
                                    }
/* 868 */                           O010OIi o010OIi5 = (O010OIi) oOo0ooi4.I00iOIl;
/* 870 */                           I0OooiI1I i0OooiI1I = OiiIo1O.I0000oI00;
/* 872 */                           if (o010OIi5 != null) {
/* 874 */                               OlOO1i11110 olOO1i11110I00l0I0l0lO1 = o010OIi5.I00l0I0l0lO1();
/* 913 */                               oiiIl0O1I11.I000II(new OiiIOiI1oi(oiiIl0O1I11, (O011OOl11) olOO1i11110I00l0I0l0lO1.I00iiI, O011OO.I00ioIO, (IOilI1lIII1) olOO1i11110I00l0I0l0lO1.I00iiO, i0OooiI1I, new IIo10iOO(oOo0ooi4, oOo0ooi, i0lIllO, iOoil1iiIilo, 0), null), false);
                                    }
/* 918 */                           O010OIi o010OIi6 = (O010OIi) oOo0ooi2.I00iOIl;
/* 920 */                           if (o010OIi6 != null) {
/* 922 */                               OlOO1i11110 olOO1i11110I00l0I0l0lO12 = o010OIi6.I00l0I0l0lO1();
/* 960 */                               oiiIl0O1I11.I000II(new OiiIOiI1oi(oiiIl0O1I11, (O011OOl11) olOO1i11110I00l0I0l0lO12.I00iiI, O011OO.I00ioIO, (IOilI1lIII1) olOO1i11110I00l0I0l0lO12.I00iiO, i0OooiI1I, new I10OoO(oOo0ooi2, iOoil1iiIilo, 1), null), false);
                                    }
/* 965 */                           this.I00io1l = ii0110;
/* 967 */                           this.I00iiO = oOo0ooi;
/* 969 */                           this.I00iio = oOo0ooi3;
/* 971 */                           this.I00ilI0I1 = oOo0ooi4;
/* 973 */                           this.I00ilO0 = oOo0ooi2;
/* 976 */                           this.I00iiI = 1;
/* 988 */                           if (I1Ioolli0l0o.I00000oIO.getObjectVolatile(oiiIl0O1I11, OiiIl0O1I11.I00ilO0) instanceof OiiIOiI1oi) {
/* 990 */                               objI0000O = oiiIl0O1I11.I0000Il00O(this);
                                        break;
                                    } else {
/* 995 */                               objI0000O = oiiIl0O1I11.I0000O(this);
                                        break;
                                    }
/* 1003 */                          OIi0ooOoOOo0 oIi0ooOoOOo022 = (OIi0ooOoOOo0) objI0000O;
/* 1005 */                          if (oIi0ooOoOOo022 == null) {
                                    }
                                }
/* 1001 */                      return oIi0ooOoOOo0;
                            } catch (Throwable th) {
/* 1079 */                      Log.e("CXCP", "Unexpected throwable during camera opening!", th);
/* 1082 */                      throw th;
                            }
                        case 1:
/* 402 */                   IlooOlI ilooOlI = (IlooOlI) this.I00iiO;
/* 406 */                   OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00ilI0I1;
/* 410 */                   OI10i0Il oI10i0Il3 = (OI10i0Il) this.I00ilO0;
/* 412 */                   OI10i0Il oI10i0Il4 = (OI10i0Il) obj2;
/* 418 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 420 */                   int i3 = this.I00iiI;
                            try {
                                try {
                                } catch (Exception e) {
/* 567 */                           String message2 = e.getMessage();
/* 571 */                           if ((message2 == null || !OlOoOIi0o.I000oI1ioi(message2, "DOWNLOAD_ERROR", false)) && ((message = e.getMessage()) == null || !OlOoOIi0o.I000oI1ioi(message, "Task was cancelled", false))) {
/* 628 */                               String str2 = "Error: " + e.getMessage();
/* 632 */                               List list2 = Iloo0ilo.I00000oIO;
/* 634 */                               oI10i0Il3.setValue(str2);
                                    } else {
/* 612 */                               iOi1II01i0.I0000O((Ii0110) this.I00iio, null, null, new IO1lI1l0Oi((Ol1OlloIO) obj4, null, 3), 3);
                                    }
/* 655 */                           Log.e("GeminiNanoHub", "prompt generate error: " + e.getMessage());
/* 658 */                           List list3 = Iloo0ilo.I00000oIO;
                                }
/* 422 */                       if (i3 == 0) {
/* 452 */                           lIoii1l01l0i.I00000oOI(obj);
/* 459 */                           IlI0iIl011 ilI0iIl011 = new IlI0iIl011(22);
/* 462 */                           ilI0iIl011.I00iiI = oI10i0Il2;
/* 464 */                           VarHandle.storeStoreFence();
/* 468 */                           this.I00iiI = 1;
/* 470 */                           objI0000Il00O = ilooOlI.I0000Il00O(ilI0iIl011, this);
/* 474 */                           if (objI0000Il00O == ii0111o) {
                                    }
/* 554 */                           return ii0111o;
                                }
/* 425 */                       if (i3 != 1) {
/* 427 */                           if (i3 != 2) {
/* 440 */                               I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 443 */                               return null;
                                    }
/* 429 */                           lIoii1l01l0i.I00000oOI(obj);
/* 558 */                           Integer num = new Integer(3);
/* 561 */                           List list4 = Iloo0ilo.I00000oIO;
/* 563 */                           oI10i0Il2.setValue(num);
/* 494 */                           oI10i0Il4.setValue(Boolean.FALSE);
/* 662 */                           return ooiIlOl1iI;
                                }
/* 446 */                       lIoii1l01l0i.I00000oOI(obj);
/* 449 */                       objI0000Il00O = obj;
/* 483 */                       if (!((Boolean) objI0000Il00O).booleanValue()) {
/* 487 */                           List list5 = Iloo0ilo.I00000oIO;
/* 489 */                           oI10i0Il3.setValue("Feature unavailable on this device.");
/* 494 */                           oI10i0Il4.setValue(Boolean.FALSE);
/* 662 */                           return ooiIlOl1iI;
                                }
/* 501 */                       OOo0ooi oOo0ooi9 = new OOo0ooi();
/* 506 */                       oOo0ooi9.I00iOIl = "";
/* 510 */                       OI10i0Il oI10i0Il5 = (OI10i0Il) this.I00io1l;
/* 512 */                       List list6 = Iloo0ilo.I00000oIO;
/* 529 */                       Ii1Io1loiI ii1Io1loiII0000O = IlooOlI.I0000O(ilooOlI, (String) oI10i0Il5.getValue(), (Bitmap) ((OI10i0Il) obj3).getValue(), 4);
/* 536 */                       IloiOl iloiOl = new IloiOl(1);
/* 539 */                       iloiOl.I00iiI = oOo0ooi9;
/* 541 */                       iloiOl.I00iiO = oI10i0Il3;
/* 543 */                       VarHandle.storeStoreFence();
/* 546 */                       this.I00iiI = 2;
                                break;
                            } catch (Throwable th2) {
/* 663 */                       List list7 = Iloo0ilo.I00000oIO;
/* 667 */                       oI10i0Il4.setValue(Boolean.FALSE);
/* 670 */                       throw th2;
                            }
                        case 2:
/* 312 */                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 314 */                   int i4 = this.I00iiI;
/* 316 */                   if (i4 == 0) {
/* 336 */                       lIoii1l01l0i.I00000oOI(obj);
/* 341 */                       OI10i0Il oI10i0Il6 = (OI10i0Il) this.I00ilI0I1;
/* 343 */                       OOIl1Io0 oOIl1Io0 = OOIl1Io0.I00000oOI;
/* 347 */                       Context context = (Context) this.I00iio;
/* 349 */                       this.I00iiO = oI10i0Il6;
/* 352 */                       this.I00iiI = 1;
/* 358 */                       objI00000oIO = l10oIiO1Il.I00000oIO(lIIOO11.I00000oIO(context), this);
/* 362 */                       if (objI00000oIO == ii0111o2) {
/* 364 */                           return ii0111o2;
                                }
/* 366 */                       oI10i0Il = oI10i0Il6;
                            } else {
/* 319 */                       if (i4 != 1) {
/* 331 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 334 */                           return null;
                                }
/* 323 */                       oI10i0Il = (OI10i0Il) this.I00iiO;
/* 325 */                       lIoii1l01l0i.I00000oOI(obj);
/* 328 */                       objI00000oIO = obj;
                            }
/* 369 */                   oI10i0Il.setValue((OOIl1Io0) objI00000oIO);
/* 396 */                   l1O0o1.I0000O((OI10i0Il) this.I00ilI0I1, (O0oiOi) this.I00ilO0, (OOIIOiolI) this.I00io1l, (Ioi1Io1o) obj3, (OIooi1iOiOol) obj4, (OI10i0Il) obj2);
/* 399 */                   return ooiIlOl1iI;
                        default:
/* 22 */                    OI10i0Il oI10i0Il7 = (OI10i0Il) obj4;
/* 24 */                    OI10i0Il oI10i0Il8 = (OI10i0Il) obj3;
/* 28 */                    OI10i0Il oI10i0Il9 = (OI10i0Il) this.I00ilO0;
/* 32 */                    OI10i0Il oI10i0Il10 = (OI10i0Il) this.I00ilI0I1;
/* 36 */                    OI10i0Il oI10i0Il11 = (OI10i0Il) this.I00iio;
/* 40 */                    OI10i0Il oI10i0Il12 = (OI10i0Il) this.I00io1l;
/* 42 */                    Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 44 */                    int i5 = this.I00iiI;
/* 46 */                    if (i5 == 0) {
/* 61 */                        lIoii1l01l0i.I00000oOI(obj);
/* 64 */                        List list8 = Ol0lllilO0Ol.I00000oIO;
/* 74 */                        if (!((Ol0loOOoo) oI10i0Il11.getValue()).I00000oIO && !((Boolean) oI10i0Il10.getValue()).booleanValue()) {
/* 88 */                            Boolean bool = Boolean.TRUE;
/* 90 */                            oI10i0Il9.setValue(bool);
/* 93 */                            oI10i0Il10.setValue(bool);
                                }
/* 112 */                       String lowerCase = OlOoOIi0o.I00OIo((String) oI10i0Il12.getValue()).toString().toLowerCase(Locale.ROOT);
/* 120 */                       if (OlOoOIi0o.I001l0I00(lowerCase)) {
/* 128 */                           list = ((Ol0loOOoo) oI10i0Il11.getValue()).I00000oOI;
                                } else {
/* 137 */                           List list9 = ((Ol0loOOoo) oI10i0Il11.getValue()).I00000oOI;
/* 143 */                           ArrayList arrayList = new ArrayList();
/* 154 */                           for (Object obj5 : list9) {
/* 163 */                               Ol0ioI1iI ol0ioI1iI = ((Ol0oI1llIloI) obj5).I00000oIO;
/* 165 */                               String strI001i1O0Ol = ol0ioI1iI.I001i1O0Ol();
/* 169 */                               if (strI001i1O0Ol != null) {
/* 181 */                                   z = true;
/* 182 */                                   if (OlOoOIi0o.I000oI1ioi(strI001i1O0Ol.toLowerCase(Locale.ROOT), lowerCase, false)) {
/* 203 */                                       arrayList.add(obj5);
                                            } else {
/* 185 */                                       String strI0010o = ol0ioI1iI.I0010o();
/* 189 */                                       if (strI0010o == null || OlOoOIi0o.I000oI1ioi(strI0010o.toLowerCase(Locale.ROOT), lowerCase, false) != z) {
                                                }
                                            }
                                        }
/* 206 */                               z = true;
                                    }
/* 208 */                           list = arrayList;
                                }
/* 209 */                       oI10i0Il8.setValue(list);
/* 228 */                       if (O0000Ioio00.I0000O((String) oI10i0Il12.getValue(), (String) oI10i0Il7.getValue())) {
/* 311 */                           return ooiIlOl1iI;
                                }
/* 240 */                       if (((String) oI10i0Il12.getValue()).length() > 0) {
/* 242 */                           Boolean bool2 = Boolean.TRUE;
/* 244 */                           oI10i0Il9.setValue(bool2);
/* 249 */                           ((OI10i0Il) obj2).setValue(bool2);
                                }
/* 264 */                       if (!((List) oI10i0Il8.getValue()).isEmpty()) {
/* 268 */                           O0o0I1i0O o0o0I1i0O = (O0o0I1i0O) this.I00iiO;
/* 271 */                           this.I00iiI = 1;
/* 273 */                           IoloOio0I ioloOio0I = O0o0I1i0O.I001iOo1i0O;
/* 275 */                           o0o0I1i0O.getClass();
/* 286 */                           Object objI0000Il00O2 = o0o0I1i0O.I0000Il00O(OI110lo.I00iOIl, new IoI0i1110(o0o0I1i0O, 0, 0, null), this);
/* 292 */                           if (objI0000Il00O2 != Ii0111o.I00iOIl) {
/* 295 */                               objI0000Il00O2 = ooiIlOl1iI;
                                    }
/* 296 */                           if (objI0000Il00O2 == ii0111o3) {
/* 298 */                               return ii0111o3;
                                    }
                                }
                            } else {
/* 48 */                        if (i5 != 1) {
/* 55 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 58 */                            return null;
                                }
/* 50 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 300 */                   List list10 = Ol0lllilO0Ol.I00000oIO;
/* 308 */                   oI10i0Il7.setValue((String) oI10i0Il12.getValue());
/* 311 */                   return ooiIlOl1iI;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 23 */        public IIo11OIl1O1O(Context context, OI10i0Il oI10i0Il, O0oiOi o0oiOi, OOIIOiolI oOIIOiolI, Ioi1Io1o ioi1Io1o, OIooi1iOiOol oIooi1iOiOol, OI10i0Il oI10i0Il2, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
                    this.I00iOIl = 2;
/* 24 */            this.I00iio = context;
                    this.I00ilI0I1 = oI10i0Il;
                    this.I00ilO0 = o0oiOi;
                    this.I00io1l = oOIIOiolI;
                    this.I00ioIO = ioi1Io1o;
                    this.I00l0I0l0lO1 = oIooi1iOiOol;
                    this.I00l0OO0IO = oI10i0Il2;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 24 */        public IIo11OIl1O1O(IIo11l1iO iIo11l1iO, String str, I0lIllO i0lIllO, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
                    this.I00iOIl = 0;
/* 25 */            this.I00ioIO = iIo11l1iO;
                    this.I00l0I0l0lO1 = str;
                    this.I00l0OO0IO = i0lIllO;
                }
            }

            package p000;

            import android.app.Application;
            import android.util.Log;
            import androidx.compose.ui.input.pointer.PointerInputEventHandler;
            import com.box.gallery.R;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.io.EOFException;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Objects;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.ForkJoinPool;
            import java.util.concurrent.TimeUnit;
            
/* 11 */    public final class O1iOlO extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final Object I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public O1iOlO(OOlI10o1ol oOlI10o1ol, int i, IOoil1iiIilo iOoil1iiIilo) {
/* 9 */             super(2, iOoil1iiIilo);
/* 2 */             this.I00iOIl = 5;
/* 4 */             this.I00iiO = oOlI10o1ol;
/* 6 */             this.I00iiI = i;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj2 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 205 */                   return new O1iOlO((O1iOlOIiO) obj2, iOoil1iiIilo, 0);
                        case 1:
/* 196 */                   return new O1iOlO((OI0Iio01O) obj2, iOoil1iiIilo, 1);
                        case 2:
/* 187 */                   return new O1iOlO((OIOI0I) obj2, iOoil1iiIilo, 2);
                        case 3:
/* 178 */                   return new O1iOlO((o01l1ioOo0) obj2, iOoil1iiIilo, 3);
                        case 4:
/* 169 */                   return new O1iOlO((iOliil) obj2, iOoil1iiIilo, 4);
                        case 5:
/* 160 */                   return new O1iOlO((OOlI10o1ol) obj2, this.I00iiI, iOoil1iiIilo);
                        case 6:
/* 150 */                   return new O1iOlO((I0oo10O) obj2, iOoil1iiIilo, 6);
                        case 7:
/* 141 */                   return new O1iOlO((Oii110oOoO) obj2, iOoil1iiIilo, 7);
                        case 8:
/* 132 */                   return new O1iOlO((Oll1OII0o) obj2, iOoil1iiIilo, 8);
                        case 9:
/* 122 */                   return new O1iOlO((Ii0i1Iolo) obj2, iOoil1iiIilo, 9);
                        case 10:
/* 112 */                   return new O1iOlO((O1001o) obj2, iOoil1iiIilo, 10);
                        case 11:
/* 102 */                   return new O1iOlO((IiIOIO1I) obj2, iOoil1iiIilo, 11);
                        case 12:
/* 92 */                    return new O1iOlO((Oo10o0lI00O) obj2, iOoil1iiIilo, 12);
                        case 13:
/* 82 */                    return new O1iOlO((IIl00I) obj2, iOoil1iiIilo, 13);
                        case 14:
/* 72 */                    return new O1iOlO((OoIlIoo1oiOo) obj2, iOoil1iiIilo, 14);
                        case 15:
/* 62 */                    return new O1iOlO(iOoil1iiIilo, (Ool1i0ll) obj2);
                        case 16:
/* 54 */                    return new O1iOlO((List) obj2, iOoil1iiIilo, 16);
                        case 17:
/* 44 */                    return new O1iOlO((OI10llOi) obj2, iOoil1iiIilo, 17);
                        case PoseLandmark.RIGHT_PINKY:
/* 34 */                    return new O1iOlO((ii1iOiO) obj2, iOoil1iiIilo, 18);
                        case PoseLandmark.LEFT_INDEX:
/* 24 */                    return new O1iOlO((lio0IOO101oI) obj2, iOoil1iiIilo, 19);
                        default:
/* 14 */                    return new O1iOlO((o1I0I0O) obj2, iOoil1iiIilo, 20);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Ii0110 ii0110 = (Ii0110) obj;
/* 7 */             IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj2;
                    switch (i) {
                        case 5:
/* 183 */                   ((O1iOlO) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                    }
/* 18 */            return ((O1iOlO) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    IOi10loi iOi10loi;
                    boolean zIsTerminated;
                    OoiIlOl1iI ooiIlOl1iI;
/* 3 */             int i = 2;
/* 4 */             boolean z = false;
/* 5 */             int i2 = 10;
/* 8 */             IOoil1iiIilo iOoil1iiIilo = null;
                    switch (this.I00iOIl) {
                        case 0:
/* 1186 */                  Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 1188 */                  int i3 = this.I00iiI;
/* 1190 */                  if (i3 != 0) {
/* 1192 */                      if (i3 == 1) {
/* 1194 */                          lIoii1l01l0i.I00000oOI(obj);
/* 1223 */                          return obj;
                                }
/* 1200 */                      I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 8 */                         return null;
                            }
/* 1205 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1212 */                  O1iOiio1OI o1iOiio1OI = ((O1iOlOIiO) this.I00iiO).I00000oIO;
/* 1214 */                  this.I00iiI = 1;
/* 1216 */                  Object objI0000Il00O = o1iOiio1OI.I0000Il00O(this);
                            return objI0000Il00O == ii0111o ? ii0111o : objI0000Il00O;
                        case 1:
/* 1141 */                  Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 1143 */                  int i4 = this.I00iiI;
/* 1145 */                  if (i4 != 0) {
/* 1147 */                      if (i4 == 1) {
/* 1149 */                          lIoii1l01l0i.I00000oOI(obj);
/* 1185 */                          return obj;
                                }
/* 1155 */                      I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 8 */                         return null;
                            }
/* 1160 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1167 */                  IIIII1OI1 iiiii1oi1 = ((OI0Iio01O) this.I00iiO).I000II;
/* 1169 */                  this.I00iiI = 1;
/* 1178 */                  Object objI0000Il00O2 = il001oo1.I0000Il00O(new O1iIlllIoo(iiiii1oi1, iOoil1iiIilo, 8), this);
                            return objI0000Il00O2 == ii0111o2 ? ii0111o2 : objI0000Il00O2;
                        case 2:
/* 1094 */                  Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 1096 */                  int i5 = this.I00iiI;
/* 1098 */                  if (i5 == 0) {
/* 1112 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1117 */                      OIOI0I oioi0i = (OIOI0I) this.I00iiO;
/* 1119 */                      Ii1I1ooo10O0 ii1I1ooo10O0 = oioi0i.I00000oOI;
/* 1125 */                      I1iOI0oo i1iOI0oo = new I1iOI0oo(oioi0i, iOoil1iiIilo, 14);
/* 1128 */                      this.I00iiI = 1;
/* 1134 */                      if (ii1I1ooo10O0.I00000oIO(i1iOI0oo, this) == ii0111o3) {
/* 1136 */                          return ii0111o3;
                                }
                            } else {
/* 1100 */                      if (i5 != 1) {
/* 1108 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 8 */                             return null;
                                }
/* 1102 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 1138 */                  return OoiIlOl1iI.I00000oIO;
                        case 3:
/* 1060 */                  Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 1062 */                  int i6 = this.I00iiI;
/* 1064 */                  if (i6 != 0) {
/* 1066 */                      if (i6 == 1) {
/* 1068 */                          lIoii1l01l0i.I00000oOI(obj);
/* 1071 */                          return OoiIlOl1iI.I00000oIO;
                                }
/* 1076 */                      I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 8 */                         return null;
                            }
/* 1080 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1085 */                  o01l1ioOo0 o01l1iooo0 = (o01l1ioOo0) this.I00iiO;
/* 1087 */                  this.I00iiI = 1;
/* 1089 */                  o01l1iooo0.I000o00OoI0I(this);
/* 1092 */                  return ii0111o4;
                        case 4:
/* 1008 */                  Ii0111o ii0111o5 = Ii0111o.I00iOIl;
/* 1010 */                  int i7 = this.I00iiI;
/* 1012 */                  if (i7 == 0) {
/* 1026 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1031 */                      iOliil ioliil = (iOliil) this.I00iiO;
/* 1033 */                      this.I00iiI = 1;
/* 1037 */                      OO11OilO oO11OilO = new OO11OilO(ioliil, iOoil1iiIilo, i);
/* 1046 */                      OliiiIoillI oliiiIoillI = new OliiiIoillI(this, getContext());
/* 1053 */                      if (li0011.I00000oIO(oliiiIoillI, true, oliiiIoillI, oO11OilO) == ii0111o5) {
/* 1055 */                          return ii0111o5;
                                }
                            } else {
/* 1014 */                      if (i7 != 1) {
/* 1022 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 8 */                             return null;
                                }
/* 1016 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 1057 */                  return OoiIlOl1iI.I00000oIO;
                        case 5:
/* 931 */                   OOlI10o1ol oOlI10o1ol = (OOlI10o1ol) this.I00iiO;
/* 933 */                   Ioo00OOI0II ioo00OOI0II = oOlI10o1ol.I00000oOI;
/* 935 */                   Ii0111o ii0111o6 = Ii0111o.I00iOIl;
/* 937 */                   lIoii1l01l0i.I00000oOI(obj);
/* 942 */                   long jI00II0oii1o = 0;
                            while (true) {
/* 943 */                       III1oo00i1li iII1oo00i1li = oOlI10o1ol.I0000O;
/* 954 */                       if (iII1oo00i1li.I00iiO < this.I00iiI && jI00II0oii1o >= 0) {
                                    try {
/* 965 */                               jI00II0oii1o = ioo00OOI0II.I00II0oii1o(iII1oo00i1li, Long.MAX_VALUE);
                                    } catch (EOFException unused) {
/* 979 */                               jI00II0oii1o = -1;
                                    } catch (IOException e) {
/* 971 */                               Throwable thI0000oI00 = oOlI10o1ol.I0000oI00();
/* 975 */                               if (thI0000oI00 == null) {
/* 977 */                                   throw e;
                                        }
/* 978 */                               throw thI0000oI00;
                                    }
                                }
                            }
/* 983 */                   if (jI00II0oii1o == -1) {
/* 985 */                       ioo00OOI0II.close();
/* 990 */                       oOlI10o1ol.I0000oI00.I00iIO();
/* 993 */                       Throwable thI0000oI002 = oOlI10o1ol.I0000oI00();
/* 997 */                       if (thI0000oI002 != null) {
/* 1004 */                          throw thI0000oI002;
                                }
/* 1001 */                      oOlI10o1ol.I0000Il00O = i1O01I0iIiiI.I00000oIO;
                            }
/* 1005 */                  return OoiIlOl1iI.I00000oIO;
                        case 6:
/* 883 */                   Ii0111o ii0111o7 = Ii0111o.I00iOIl;
/* 885 */                   int i8 = this.I00iiI;
/* 887 */                   if (i8 == 0) {
/* 901 */                       lIoii1l01l0i.I00000oOI(obj);
/* 908 */                       I10i01 i10i01 = ((I0oo10O) this.I00iiO).I00oOio10iI1;
/* 913 */                       Float f = new Float(0.0f);
/* 916 */                       this.I00iiI = 1;
/* 922 */                       if (i10i01.I0001Ioi1lo(this, f) == ii0111o7) {
/* 924 */                           return ii0111o7;
                                }
                            } else {
/* 889 */                       if (i8 != 1) {
/* 897 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 8 */                             return null;
                                }
/* 891 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 926 */                   return OoiIlOl1iI.I00000oIO;
                        case 7:
/* 845 */                   Ii0111o ii0111o8 = Ii0111o.I00iOIl;
/* 847 */                   int i9 = this.I00iiI;
/* 849 */                   if (i9 == 0) {
/* 863 */                       lIoii1l01l0i.I00000oOI(obj);
/* 868 */                       Oii110oOoO oii110oOoO = (Oii110oOoO) this.I00iiO;
/* 870 */                       this.I00iiI = 1;
/* 876 */                       if (oii110oOoO.I010l1O(this) == ii0111o8) {
/* 878 */                           return ii0111o8;
                                }
                            } else {
/* 851 */                       if (i9 != 1) {
/* 859 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 8 */                             return null;
                                }
/* 853 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 880 */                   return OoiIlOl1iI.I00000oIO;
                        case 8:
/* 804 */                   Oll1OII0o oll1OII0o = (Oll1OII0o) this.I00iiO;
/* 806 */                   Ii0111o ii0111o9 = Ii0111o.I00iOIl;
/* 808 */                   int i10 = this.I00iiI;
/* 810 */                   if (i10 == 0) {
/* 827 */                       lIoii1l01l0i.I00000oOI(obj);
/* 830 */                       PointerInputEventHandler pointerInputEventHandler = oll1OII0o.I00o101lO;
/* 832 */                       this.I00iiI = 2;
/* 838 */                       if (pointerInputEventHandler.invoke(oll1OII0o, this) == ii0111o9) {
/* 840 */                           return ii0111o9;
                                }
                            } else {
/* 812 */                       if (i10 != 1 && i10 != 2) {
/* 819 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 8 */                             return null;
                                }
/* 823 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 842 */                   return OoiIlOl1iI.I00000oIO;
                        case 9:
/* 752 */                   OoiIlOl1iI ooiIlOl1iI2 = OoiIlOl1iI.I00000oIO;
/* 754 */                   Ii0111o ii0111o10 = Ii0111o.I00iOIl;
/* 756 */                   int i11 = this.I00iiI;
/* 758 */                   if (i11 == 0) {
/* 773 */                       lIoii1l01l0i.I00000oOI(obj);
/* 778 */                       Ii0i1Iolo ii0i1Iolo = (Ii0i1Iolo) this.I00iiO;
/* 780 */                       this.I00iiI = 1;
/* 782 */                       ii0i1Iolo.getClass();
/* 790 */                       Object objI0000Il00O3 = il001oo1.I0000Il00O(new I1iIil1I(ii0i1Iolo, iOoil1iiIilo, i2), this);
/* 794 */                       if (objI0000Il00O3 != ii0111o10) {
/* 797 */                           objI0000Il00O3 = ooiIlOl1iI2;
                                }
/* 798 */                       if (objI0000Il00O3 == ii0111o10) {
/* 800 */                           return ii0111o10;
                                }
                            } else {
/* 760 */                       if (i11 != 1) {
/* 769 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 8 */                             return null;
                                }
/* 762 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 765 */                   return ooiIlOl1iI2;
                        case 10:
/* 690 */                   Ii0111o ii0111o11 = Ii0111o.I00iOIl;
/* 692 */                   int i12 = this.I00iiI;
/* 694 */                   if (i12 != 0) {
/* 696 */                       if (i12 == 1) {
/* 698 */                           lIoii1l01l0i.I00000oOI(obj);
/* 701 */                           return OoiIlOl1iI.I00000oIO;
                                }
/* 706 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 8 */                         return null;
                            }
/* 710 */                   lIoii1l01l0i.I00000oOI(obj);
/* 715 */                   O1001o o1001o = (O1001o) this.I00iiO;
/* 717 */                   this.I00iiI = 1;
/* 719 */                   o1001o.getClass();
/* 724 */                   OI0oiiIO0 oI0oiiIO0 = new OI0oiiIO0();
/* 729 */                   Oiolio oiolio = o1001o.I00000oIO.I00000oIO;
/* 734 */                   IIilO0 iIilO0 = new IIilO0(4);
/* 737 */                   iIilO0.I00iiI = oI0oiiIO0;
/* 739 */                   iIilO0.I00iiO = o1001o;
/* 741 */                   VarHandle.storeStoreFence();
/* 744 */                   oiolio.getClass();
/* 747 */                   Oiolio.I000lI(oiolio, iIilO0, this);
/* 750 */                   return ii0111o11;
                        case 11:
/* 654 */                   Ii0111o ii0111o12 = Ii0111o.I00iOIl;
/* 656 */                   int i13 = this.I00iiI;
/* 658 */                   if (i13 != 0) {
/* 660 */                       if (i13 == 1) {
/* 662 */                           lIoii1l01l0i.I00000oOI(obj);
/* 689 */                           return obj;
                                }
/* 668 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 8 */                         return null;
                            }
/* 673 */                   lIoii1l01l0i.I00000oOI(obj);
/* 678 */                   IiIOIO1I iiIOIO1I = (IiIOIO1I) this.I00iiO;
/* 680 */                   this.I00iiI = 1;
/* 682 */                   Object objI0010o = iiIOIO1I.I0010o(this);
                            return objI0010o == ii0111o12 ? ii0111o12 : objI0010o;
                        case 12:
/* 595 */                   Ii0111o ii0111o13 = Ii0111o.I00iOIl;
/* 597 */                   int i14 = this.I00iiI;
/* 599 */                   if (i14 != 0) {
/* 601 */                       if (i14 == 1) {
/* 603 */                           lIoii1l01l0i.I00000oOI(obj);
/* 606 */                           return OoiIlOl1iI.I00000oIO;
                                }
/* 611 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 8 */                         return null;
                            }
/* 615 */                   lIoii1l01l0i.I00000oOI(obj);
/* 620 */                   OOo0ll111 oOo0ll111 = new OOo0ll111();
/* 625 */                   Oo10o0lI00O oo10o0lI00O = (Oo10o0lI00O) this.I00iiO;
/* 629 */                   Oiolio oiolio2 = oo10o0lI00O.I00o0iI0io1.I00000oIO;
/* 634 */                   IIilO0 iIilO02 = new IIilO0(7);
/* 637 */                   iIilO02.I00iiI = oOo0ll111;
/* 639 */                   iIilO02.I00iiO = oo10o0lI00O;
/* 641 */                   VarHandle.storeStoreFence();
/* 644 */                   this.I00iiI = 1;
/* 646 */                   oiolio2.getClass();
/* 649 */                   Oiolio.I000lI(oiolio2, iIilO02, this);
/* 652 */                   return ii0111o13;
                        case 13:
/* 557 */                   Ii0111o ii0111o14 = Ii0111o.I00iOIl;
/* 559 */                   int i15 = this.I00iiI;
/* 561 */                   if (i15 == 0) {
/* 575 */                       lIoii1l01l0i.I00000oOI(obj);
/* 580 */                       IIl00I iIl00I = (IIl00I) this.I00iiO;
/* 582 */                       this.I00iiI = 1;
/* 588 */                       if (iIl00I.invoke(this) == ii0111o14) {
/* 590 */                           return ii0111o14;
                                }
                            } else {
/* 563 */                       if (i15 != 1) {
/* 571 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 8 */                             return null;
                                }
/* 565 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 592 */                   return OoiIlOl1iI.I00000oIO;
                        case 14:
/* 519 */                   Ii0111o ii0111o15 = Ii0111o.I00iOIl;
/* 521 */                   int i16 = this.I00iiI;
/* 523 */                   if (i16 == 0) {
/* 537 */                       lIoii1l01l0i.I00000oOI(obj);
/* 542 */                       OoIlIoo1oiOo ooIlIoo1oiOo = (OoIlIoo1oiOo) this.I00iiO;
/* 544 */                       this.I00iiI = 1;
/* 550 */                       if (ooIlIoo1oiOo.I000lI(this) == ii0111o15) {
/* 552 */                           return ii0111o15;
                                }
                            } else {
/* 525 */                       if (i16 != 1) {
/* 533 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 8 */                             return null;
                                }
/* 527 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 554 */                   return OoiIlOl1iI.I00000oIO;
                        case 15:
/* 320 */                   Ii0111o ii0111o16 = Ii0111o.I00iOIl;
/* 322 */                   int i17 = this.I00iiI;
/* 324 */                   if (i17 == 0) {
/* 340 */                       lIoii1l01l0i.I00000oOI(obj);
/* 350 */                       if (l11I11lO.I0000O(3, "CXCP")) {
/* 356 */                           Objects.toString((Ool1i0ll) this.I00iiO);
                                }
/* 363 */                       OolO1O oolO1O = ((Ool1i0ll) this.I00iiO).I00000oIO;
/* 371 */                       if (oolO1O.I0000oI00.I00000oOI()) {
/* 373 */                           AutoCloseable autoCloseableI00000oIO = oolO1O.I00000oIO();
/* 379 */                           if (autoCloseableI00000oIO instanceof AutoCloseable) {
/* 381 */                               autoCloseableI00000oIO.close();
                                    } else {
/* 387 */                               if (!(autoCloseableI00000oIO instanceof ExecutorService)) {
/* 435 */                                   OIiilo1Ool0o.I00100o1O0lo();
/* 8 */                                     return null;
                                        }
/* 389 */                               ExecutorService executorService = (ExecutorService) autoCloseableI00000oIO;
/* 395 */                               if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
/* 404 */                                   executorService.shutdown();
/* 407 */                                   while (!zIsTerminated) {
                                                try {
/* 413 */                                           zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                                } catch (InterruptedException unused2) {
/* 418 */                                           if (!z) {
/* 420 */                                               executorService.shutdownNow();
/* 423 */                                               z = true;
                                                    }
                                                }
                                            }
/* 425 */                                   if (z) {
/* 431 */                                       Thread.currentThread().interrupt();
                                            }
                                        }
                                    }
                                }
/* 449 */                       OolOOl0 oolOOl0 = (OolOOl0) ((Ool1i0ll) this.I00iiO).I000OOo1O.getValue();
                                synchronized (oolOOl0.I0000oI00) {
                                    try {
/* 454 */                               iOi10loi = oolOOl0.I000OOo1O;
/* 456 */                               if (iOi10loi == null) {
/* 477 */                                   IiIOIO1I iiIOIO1I2 = oolOOl0.I0001Ioi1lo;
/* 479 */                                   if (iiIOIO1I2 != null) {
/* 481 */                                       iiIOIO1I2.I000II(null);
                                            }
/* 486 */                                   oolOOl0.I0000Il00O.I00000oIO();
/* 489 */                                   oolOOl0.I000O01llI0 = null;
/* 493 */                                   iOi10loi = new IOi10loi();
/* 496 */                                   oolOOl0.I000OOo1O = iOi10loi;
/* 498 */                                   oolOOl0.I0000oI00();
                                        } else if (l11I11lO.I0000O(5, "CXCP")) {
/* 471 */                                   Log.w("CXCP", "UseCaseSurfaceManager is already stopping!");
                                        }
                                    } catch (Throwable th) {
/* 518 */                               throw th;
                                    }
                                }
/* 502 */                       this.I00iiI = 1;
/* 504 */                       Object objI0010o2 = iOi10loi.I0010o(this);
/* 508 */                       Ii0111o ii0111o17 = Ii0111o.I00iOIl;
/* 510 */                       if (objI0010o2 == ii0111o16) {
/* 512 */                           return ii0111o16;
                                }
                            } else {
/* 326 */                       if (i17 != 1) {
/* 335 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 8 */                             return null;
                                }
/* 328 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 514 */                   return OoiIlOl1iI.I00000oIO;
                        case 16:
/* 231 */                   Ii0111o ii0111o18 = Ii0111o.I00iOIl;
/* 233 */                   int i18 = this.I00iiI;
/* 235 */                   if (i18 != 0) {
/* 237 */                       if (i18 == 1) {
/* 239 */                           lIoii1l01l0i.I00000oOI(obj);
/* 319 */                           return obj;
                                }
/* 245 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 8 */                         return null;
                            }
/* 250 */                   lIoii1l01l0i.I00000oOI(obj);
/* 255 */                   List list = (List) this.I00iiO;
/* 265 */                   ArrayList arrayList = new ArrayList(IOOi1I.I0000O(list, 10));
/* 268 */                   Iterator it = list.iterator();
/* 276 */                   while (it.hasNext()) {
/* 292 */                       arrayList.add(iIllIoiiIO.I0000oI00(((IiIO1ol1i1o0) it.next()).I0000Il00O()));
                            }
/* 307 */                   O10IIOOiO o10IIOOiO = new O10IIOOiO(new ArrayList(arrayList), false, Iii11l.I00000oIO());
/* 310 */                   this.I00iiI = 1;
/* 312 */                   Object objI00000oIO = l10oIiO1Il.I00000oIO(o10IIOOiO, this);
                            return objI00000oIO == ii0111o18 ? ii0111o18 : objI00000oIO;
                        case 17:
/* 155 */                   Ii0111o ii0111o19 = Ii0111o.I00iOIl;
/* 157 */                   int i19 = this.I00iiI;
/* 159 */                   if (i19 == 0) {
/* 173 */                       lIoii1l01l0i.I00000oOI(obj);
/* 176 */                       this.I00iiI = 1;
/* 184 */                       if (il0l1o1l.I00000oOI(1000L, this) == ii0111o19) {
/* 186 */                           return ii0111o19;
                                }
                            } else {
/* 161 */                       if (i19 != 1) {
/* 169 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 8 */                             return null;
                                }
/* 163 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 190 */                   OI10llOi oI10llOi = (OI10llOi) this.I00iiO;
                            synchronized (oI10llOi.I00iiO) {
/* 197 */                       if (oI10llOi.I00iiI || oI10llOi.I00iOIl != 0) {
/* 225 */                           ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                                } else {
/* 204 */                           oI10llOi.I00ilO0 = null;
/* 206 */                           oI10llOi.I00iiI = true;
/* 217 */                           ((I01ii1IIl) ((OI10llOi) this.I00iiO).I00ilI0I1).invoke();
/* 220 */                           ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                                }
                            }
/* 228 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_PINKY:
/* 61 */                    ii1iOiO ii1ioio = (ii1iOiO) this.I00iiO;
/* 63 */                    Ii0111o ii0111o20 = Ii0111o.I00iOIl;
                            try {
/* 67 */                        if (this.I00iiI != 0) {
/* 69 */                            lIoii1l01l0i.I00000oOI(obj);
                                } else {
/* 75 */                            lIoii1l01l0i.I00000oOI(obj);
/* 78 */                            Application application = ii1ioio.I00000oOI;
/* 80 */                            Ii00l101O ii00l101O = iolO1iiOolOO.I00000oIO;
/* 86 */                            I1iOI0oo i1iOI0oo2 = new I1iOI0oo(application, iOoil1iiIilo, 28);
/* 89 */                            this.I00iiI = 1;
/* 91 */                            obj = iOi1II01i0.I0000oI00(ii00l101O, i1iOI0oo2, this);
/* 95 */                            if (obj == ii0111o20) {
/* 154 */                               return ii0111o20;
                                    }
                                }
/* 100 */                       OlO0OIIl1 olO0OIIl1 = ii1ioio.I0000Il00O;
/* 104 */                       ii01O1l ii01o1l = new ii01O1l();
/* 107 */                       ii01o1l.I00000oIO = (ArrayList) obj;
/* 109 */                       VarHandle.storeStoreFence();
/* 112 */                       olO0OIIl1.getClass();
/* 115 */                       olO0OIIl1.I000lI(null, ii01o1l);
                            } catch (IOException e2) {
/* 119 */                       OlO0OIIl1 olO0OIIl12 = ii1ioio.I0000Il00O;
/* 123 */                       String message = e2.getMessage();
/* 127 */                       if (message == null) {
/* 134 */                           message = ii1ioio.I00000oOI.getString(R.string.no_licenses_available);
                                }
/* 138 */                       ii000II0i0l0 ii000ii0i0l0 = new ii000II0i0l0();
/* 141 */                       ii000ii0i0l0.I00000oIO = message;
/* 143 */                       VarHandle.storeStoreFence();
/* 146 */                       olO0OIIl12.getClass();
/* 149 */                       olO0OIIl12.I000lI(null, ii000ii0i0l0);
                            }
/* 152 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.LEFT_INDEX:
/* 35 */                    Ii0111o ii0111o21 = Ii0111o.I00iOIl;
/* 37 */                    int i20 = this.I00iiI;
/* 39 */                    lIoii1l01l0i.I00000oOI(obj);
/* 42 */                    if (i20 != 0) {
/* 58 */                        return obj;
                            }
/* 47 */                    lio0IOO101oI lio0ioo101oi = (lio0IOO101oI) this.I00iiO;
/* 49 */                    this.I00iiI = 1;
/* 51 */                    Object objI00000oIO2 = l10o1ollO.I00000oIO(lio0ioo101oi, this);
                            return objI00000oIO2 == ii0111o21 ? ii0111o21 : objI00000oIO2;
                        default:
/* 12 */                    Ii0111o ii0111o22 = Ii0111o.I00iOIl;
/* 14 */                    int i21 = this.I00iiI;
/* 16 */                    lIoii1l01l0i.I00000oOI(obj);
/* 19 */                    if (i21 != 0) {
/* 34 */                        return obj;
                            }
/* 22 */                    this.I00iiI = 1;
/* 28 */                    Integer num = new Integer(8192);
                            return num == ii0111o22 ? ii0111o22 : num;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 12 */        public O1iOlO(IOoil1iiIilo iOoil1iiIilo, Ool1i0ll ool1i0ll) {
                    super(2, iOoil1iiIilo);
                    this.I00iOIl = 15;
/* 13 */            this.I00iiO = ool1i0ll;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 13 */        public O1iOlO(Object obj, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(2, iOoil1iiIilo);
/* 14 */            this.I00iOIl = i;
                    this.I00iiO = obj;
                }
            }

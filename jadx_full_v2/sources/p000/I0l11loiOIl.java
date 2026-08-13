            package p000;

            import android.hardware.camera2.CaptureRequest;
            import android.hardware.camera2.params.MeteringRectangle;
            import android.os.Handler;
            import android.os.Looper;
            import android.view.ActionMode;
            import android.view.View;
            import java.io.Closeable;
            import java.io.File;
            import java.io.FileInputStream;
            import java.io.FileNotFoundException;
            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Objects;
            import java.util.concurrent.CancellationException;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function3;
            
/* 13 */    public final class I0l11loiOIl extends Oll0io implements Function1 {
                public final int I00iOIl;
                public int I00iiI;
                public Object I00iiO;
                public final Object I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I0l11loiOIl(OolI1lo oolI1lo, List list, IOoil1iiIilo iOoil1iiIilo) {
/* 11 */            super(1, iOoil1iiIilo);
/* 2 */             this.I00iOIl = 6;
/* 4 */             Ool1iI0OiI ool1iI0OiI = Ool1iI0OiI.I00iOIl;
/* 6 */             this.I00iiO = oolI1lo;
/* 8 */             this.I00iio = list;
                }

                @Override
                public final IOoil1iiIilo create(IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj = this.I00iio;
                    switch (i) {
                        case 0:
/* 84 */                    return new I0l11loiOIl((I0l1OOl1l10) this.I00iiO, (Function3) obj, iOoil1iiIilo, 0);
                        case 1:
/* 71 */                    return new I0l11loiOIl((I100OOIO0oio) this.I00iiO, (Olol1IOOol0) obj, iOoil1iiIilo, 1);
                        case 2:
/* 58 */                    return new I0l11loiOIl((I1oiliiOol) this.I00iiO, (I1oilii10i) obj, iOoil1iiIilo, 2);
                        case 3:
/* 45 */                    return new I0l11loiOIl((Ii1OIIlOi) obj, iOoil1iiIilo, 3);
                        case 4:
/* 36 */                    return new I0l11loiOIl((IlIi00o) obj, iOoil1iiIilo, 4);
                        case 5:
/* 27 */                    return new I0l11loiOIl((OolI1lo) obj, iOoil1iiIilo, 5);
                        default:
/* 12 */                    OolI1lo oolI1lo = (OolI1lo) this.I00iiO;
/* 14 */                    Ool1iI0OiI ool1iI0OiI = Ool1iI0OiI.I00iOIl;
/* 18 */                    return new I0l11loiOIl(oolI1lo, (List) obj, iOoil1iiIilo);
                    }
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj;
                    switch (i) {
                    }
/* 16 */            return ((I0l11loiOIl) create(iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                /* JADX WARN: Code restructure failed: missing block: B:145:0x0233, code lost:
                
                    if (r1 != r2) goto L147;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:64:0x012d, code lost:
                
                    if (r0 != r7) goto L66;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:97:0x01a5, code lost:
                
                    if (r0 == r2) goto L110;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:63:0x0123 A[Catch: CancellationException -> 0x015b, TRY_ENTER, TryCatch #0 {CancellationException -> 0x015b, blocks: (B:29:0x00b7, B:66:0x0131, B:68:0x014e, B:74:0x0157, B:75:0x015a, B:63:0x0123, B:67:0x0134, B:72:0x0155), top: B:252:0x00ad, inners: #8, #10 }] */
                /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r3v16 */
                /* JADX WARN: Type inference failed for: r3v19, types: [java.io.Closeable] */
                /* JADX WARN: Type inference failed for: r3v24 */
                /* JADX WARN: Type inference failed for: r3v25 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Exception {
                    I100Iil1o1 i100Iil1o1;
                    Handler handler;
                    Object objI00000oIO;
                    OlO00iO01io oOlIilOIlOi1;
                    Object objI000O01llI0;
                    Object objI00000oIO2;
                    FileInputStream fileInputStream;
                    FileInputStream fileInputStream2;
                    Throwable th;
                    IiIOI1ol0o iiIOI1ol0o;
                    Object objI00000oIO3;
                    Object objI0000Il00O;
                    Object objI0000Il00O2;
                    AutoCloseable autoCloseable;
                    Object objI001i1lo1io;
                    AutoCloseable autoCloseable2;
                    Throwable th2;
/* 3 */             int i = this.I00iOIl;
/* 6 */             ?? r3 = "CXCP";
/* 8 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 11 */            int i2 = 4;
/* 15 */            Object obj2 = this.I00iio;
/* 17 */            int i3 = 1;
/* 18 */            Object obj3 = null;
/* 18 */            boolean z = false;
/* 18 */            boolean z2 = false;
/* 18 */            boolean z3 = false;
/* 18 */            boolean z4 = false;
                    switch (i) {
                        case 0:
/* 943 */                   I0l1OOl1l10 i0l1OOl1l10 = (I0l1OOl1l10) this.I00iiO;
/* 945 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 947 */                   int i4 = this.I00iiI;
/* 949 */                   if (i4 == 0) {
/* 962 */                       lIoii1l01l0i.I00000oOI(obj);
/* 967 */                       I0l10lIi i0l10lIi = new I0l10lIi(1);
/* 970 */                       i0l10lIi.I00iiI = i0l1OOl1l10;
/* 972 */                       VarHandle.storeStoreFence();
/* 980 */                       I00oIiI10 i00oIiI10 = new I00oIiI10((Function3) obj2, i0l1OOl1l10, z ? 1 : 0, 6);
/* 983 */                       this.I00iiI = 1;
/* 989 */                       if (I0l0lIoOIoIi.I000OOo1O(i0l10lIi, i00oIiI10, this) == ii0111o) {
/* 991 */                           return ii0111o;
                                }
                            } else {
/* 951 */                       if (i4 != 1) {
/* 957 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 18 */                            return null;
                                }
/* 953 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 993 */                   Ii1loIll001 ii1loIll001I0000Il00O = i0l1OOl1l10.I0000Il00O();
/* 999 */                   OIooO1iiliI oIooO1iiliI = (OIooO1iiliI) i0l1OOl1l10.I000l1;
/* 1005 */                  Object objI00000oIO4 = ii1loIll001I0000Il00O.I00000oIO(oIooO1iiliI.I000II());
/* 1009 */                  if (objI00000oIO4 == null) {
/* 1064 */                      return ooiIlOl1iI;
                            }
/* 1032 */                  if (Math.abs(oIooO1iiliI.I000II() - i0l1OOl1l10.I0000Il00O().I0001Ioi1lo(objI00000oIO4)) >= 0.5f || !((Boolean) ((Function1) i0l1OOl1l10.I00000oIO).invoke(objI00000oIO4)).booleanValue()) {
/* 1064 */                      return ooiIlOl1iI;
                            }
/* 1054 */                  ((OIooliIO0) i0l1OOl1l10.I000O01llI0).setValue(objI00000oIO4);
/* 1061 */                  ((OIooliIO0) i0l1OOl1l10.I000II).setValue(objI00000oIO4);
/* 1064 */                  return ooiIlOl1iI;
                        case 1:
/* 648 */                   I100OOIO0oio i100OOIO0oio = (I100OOIO0oio) this.I00iiO;
/* 650 */                   Ol1olI0o1I01 ol1olI0o1I01 = i100OOIO0oio.I0000oI00;
/* 652 */                   View view = i100OOIO0oio.I00000oIO;
/* 654 */                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 656 */                   int i5 = this.I00iiI;
                            try {
/* 658 */                       if (i5 == 0) {
/* 676 */                           lIoii1l01l0i.I00000oOI(obj);
/* 681 */                           I100OI i100oi = new I100OI();
/* 685 */                           IIIII1OI1 iiiii1oi1I00000oIO = iOl1iOi0I.I00000oIO(0, null, null, 7);
/* 689 */                           i100oi.I00000oIO = iiiii1oi1I00000oIO;
/* 691 */                           VarHandle.storeStoreFence();
/* 694 */                           Olol1IOOol0 olol1IOOol0 = (Olol1IOOol0) obj2;
/* 700 */                           I1001oll i1001oll = new I1001oll(0);
/* 703 */                           i1001oll.I00iiI = i100OOIO0oio;
/* 705 */                           i1001oll.I00iiO = olol1IOOol0;
/* 707 */                           VarHandle.storeStoreFence();
/* 712 */                           I1001oll i1001oll2 = new I1001oll(1);
/* 715 */                           i1001oll2.I00iiI = i100OOIO0oio;
/* 717 */                           i1001oll2.I00iiO = olol1IOOol0;
/* 719 */                           VarHandle.storeStoreFence();
/* 722 */                           I100Iil1o1 i100Iil1o12 = new I100Iil1o1();
/* 725 */                           i100Iil1o12.I00000oIO = i100oi;
/* 727 */                           i100Iil1o12.I00000oOI = i1001oll;
/* 729 */                           i100Iil1o12.I0000Il00O = i1001oll2;
/* 731 */                           i100Iil1o12.I0000O = view;
/* 733 */                           VarHandle.storeStoreFence();
/* 736 */                           Function1 function1 = i100OOIO0oio.I00000oOI;
/* 738 */                           if (function1 != null && (i100Iil1o1 = (I100Iil1o1) function1.invoke(i100Iil1o12)) != null) {
/* 749 */                               i100Iil1o12 = i100Iil1o1;
                                    }
/* 750 */                           Looper looperMyLooper = Looper.myLooper();
/* 754 */                           Handler handler2 = view.getHandler();
/* 766 */                           if (looperMyLooper != (handler2 != null ? handler2.getLooper() : null)) {
/* 768 */                               I00ioIO i00ioIO = i100OOIO0oio.I000OOo1O;
/* 770 */                               if (i00ioIO == null) {
/* 774 */                                   i00ioIO = new I00ioIO(i3);
/* 777 */                                   i00ioIO.I00iiI = i100OOIO0oio;
/* 779 */                                   i00ioIO.I00iiO = i100Iil1o12;
/* 781 */                                   i00ioIO.I00iio = i100oi;
/* 783 */                                   VarHandle.storeStoreFence();
/* 786 */                                   i100OOIO0oio.I000OOo1O = i00ioIO;
                                        }
/* 788 */                               view.post(i00ioIO);
                                    } else {
/* 794 */                               IlOil01I ilOil01I = new IlOil01I();
/* 797 */                               ilOil01I.I00000oIO = i100Iil1o12;
/* 799 */                               VarHandle.storeStoreFence();
/* 802 */                               ActionMode actionModeStartActionMode = view.startActionMode(ilOil01I, 1);
/* 806 */                               if (actionModeStartActionMode == null) {
/* 882 */                                   return ooiIlOl1iI;
                                        }
/* 809 */                               i100OOIO0oio.I000O01llI0 = actionModeStartActionMode;
                                    }
/* 811 */                           this.I00iiI = 1;
/* 813 */                           Object objI000iOII = iiiii1oi1I00000oIO.I000iOII(this);
/* 817 */                           if (objI000iOII != ii0111o2) {
/* 820 */                               objI000iOII = ooiIlOl1iI;
                                    }
/* 821 */                           if (objI000iOII == ii0111o2) {
/* 823 */                               return ii0111o2;
                                    }
                                } else {
/* 660 */                           if (i5 != 1) {
/* 670 */                               I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 18 */                                return null;
                                    }
/* 662 */                           lIoii1l01l0i.I00000oOI(obj);
                                }
/* 844 */                       if (Looper.myLooper() != (handler != null ? handler.getLooper() : null)) {
/* 846 */                           Runnable runnable = i100OOIO0oio.I000OiO;
                                    Runnable runnable2 = runnable;
/* 848 */                           if (runnable == null) {
/* 852 */                               I0100i i0100i = new I0100i(i2);
/* 855 */                               i0100i.I00iiI = i100OOIO0oio;
/* 857 */                               VarHandle.storeStoreFence();
/* 860 */                               i100OOIO0oio.I000OiO = i0100i;
                                        runnable2 = i0100i;
                                    }
/* 862 */                           view.post(runnable2);
                                } else {
/* 866 */                           ActionMode actionMode = i100OOIO0oio.I000O01llI0;
/* 868 */                           if (actionMode != null) {
/* 870 */                               actionMode.finish();
                                    }
                                }
/* 873 */                       I00ioIO i00ioIO2 = i100OOIO0oio.I000OOo1O;
/* 875 */                       if (i00ioIO2 != null) {
/* 877 */                           view.removeCallbacks(i00ioIO2);
                                }
/* 880 */                       i100OOIO0oio.I000O01llI0 = null;
/* 882 */                       return ooiIlOl1iI;
                            } finally {
/* 883 */                       ol1olI0o1I01.I00000oIO();
/* 886 */                       Looper looperMyLooper2 = Looper.myLooper();
/* 890 */                       Handler handler3 = view.getHandler();
/* 902 */                       if (looperMyLooper2 != (handler3 != null ? handler3.getLooper() : null)) {
/* 904 */                           Runnable runnable3 = i100OOIO0oio.I000OiO;
                                    Runnable runnable4 = runnable3;
/* 906 */                           if (runnable3 == null) {
/* 910 */                               I0100i i0100i2 = new I0100i(i2);
/* 913 */                               i0100i2.I00iiI = i100OOIO0oio;
/* 915 */                               VarHandle.storeStoreFence();
/* 918 */                               i100OOIO0oio.I000OiO = i0100i2;
                                        runnable4 = i0100i2;
                                    }
/* 920 */                           view.post(runnable4);
                                } else {
/* 924 */                           ActionMode actionMode2 = i100OOIO0oio.I000O01llI0;
/* 926 */                           if (actionMode2 != null) {
/* 928 */                               actionMode2.finish();
                                    }
                                }
/* 931 */                       I00ioIO i00ioIO3 = i100OOIO0oio.I000OOo1O;
/* 933 */                       if (i00ioIO3 != null) {
/* 935 */                           view.removeCallbacks(i00ioIO3);
                                }
/* 938 */                       i100OOIO0oio.I000O01llI0 = null;
                            }
                        case 2:
/* 588 */                   I1oilii10i i1oilii10i = (I1oilii10i) obj2;
/* 594 */                   OIooliIO0 oIooliIO0 = ((I1oiliiOol) this.I00iiO).I0000Il00O;
/* 596 */                   Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 598 */                   int i6 = this.I00iiI;
                            try {
/* 600 */                       if (i6 == 0) {
/* 615 */                           lIoii1l01l0i.I00000oOI(obj);
/* 618 */                           oIooliIO0.setValue(i1oilii10i);
/* 621 */                           this.I00iiI = 1;
/* 625 */                           Object objI000iOII2 = i1oilii10i.I00000oOI.I000iOII(this);
/* 629 */                           if (objI000iOII2 != ii0111o3) {
/* 632 */                               objI000iOII2 = ooiIlOl1iI;
                                    }
/* 633 */                           if (objI000iOII2 == ii0111o3) {
/* 635 */                               return ii0111o3;
                                    }
                                } else {
/* 602 */                           if (i6 != 1) {
/* 610 */                               I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 18 */                                return null;
                                    }
/* 604 */                           lIoii1l01l0i.I00000oOI(obj);
                                }
/* 640 */                       return ooiIlOl1iI;
                            } finally {
/* 641 */                       oIooliIO0.setValue(null);
                            }
                        case 3:
/* 503 */                   Ii1OIIlOi ii1OIIlOi = (Ii1OIIlOi) obj2;
/* 505 */                   Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 507 */                   int i7 = this.I00iiI;
                            try {
                            } catch (Throwable th3) {
/* 535 */                       th = th3;
/* 552 */                       Ol0Oiooo ol0OioooI0000Il00O = ii1OIIlOi.I0000Il00O();
/* 556 */                       this.I00iiO = th;
/* 558 */                       this.I00iiI = 2;
/* 560 */                       objI00000oIO = ol0OioooI0000Il00O.I00000oIO();
                                break;
                            }
/* 509 */                   if (i7 == 0) {
/* 537 */                       lIoii1l01l0i.I00000oOI(obj);
/* 540 */                       this.I00iiI = 1;
/* 542 */                       objI000O01llI0 = ii1OIIlOi.I000O01llI0(true, this);
/* 546 */                       if (objI000O01llI0 == ii0111o4) {
/* 566 */                           return ii0111o4;
                                }
                            } else {
/* 511 */                       if (i7 != 1) {
/* 513 */                           if (i7 != 2) {
/* 525 */                               I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 18 */                                return null;
                                    }
/* 517 */                           th = (Throwable) this.I00iiO;
/* 519 */                           lIoii1l01l0i.I00000oOI(obj);
/* 522 */                           objI00000oIO = obj;
/* 576 */                           oOlIilOIlOi1 = new OOlIilOIlOi1(th, ((Number) objI00000oIO).intValue());
/* 584 */                           return new OIoi0IIoi(oOlIilOIlOi1, Boolean.TRUE);
                                }
/* 529 */                       lIoii1l01l0i.I00000oOI(obj);
/* 532 */                       objI000O01llI0 = obj;
                            }
/* 549 */                   oOlIilOIlOi1 = (OlO00iO01io) objI000O01llI0;
/* 584 */                   return new OIoi0IIoi(oOlIilOIlOi1, Boolean.TRUE);
                        case 4:
/* 355 */                   IlIi00o ilIi00o = (IlIi00o) obj2;
/* 357 */                   Ii0111o ii0111o5 = Ii0111o.I00iOIl;
/* 359 */                   int i8 = this.I00iiI;
                            try {
                                try {
                                    try {
                                    } catch (Exception e) {
/* 482 */                               if (e instanceof FileNotFoundException) {
/* 496 */                                   throw il1Oll0Ii.I00000oIO(ilIi00o.I00000oIO.getParent(), (FileNotFoundException) e);
                                        }
/* 496 */                               throw e;
                                    }
                                } catch (Throwable th4) {
/* 399 */                           Closeable closeable = r3;
                                    try {
/* 430 */                               throw th4;
                                    } catch (Throwable th5) {
/* 432 */                               ii1OOii.I00000oIO(closeable, th4);
/* 435 */                               throw th5;
                                    }
                                }
                            } catch (FileNotFoundException unused) {
/* 436 */                       File file = ilIi00o.I00000oIO;
/* 438 */                       OiliO1i1iIII oiliO1i1iIII = ilIi00o.I00000oOI;
/* 444 */                       if (file.exists()) {
/* 450 */                           fileInputStream = new FileInputStream(ilIi00o.I00000oIO);
                                    try {
/* 453 */                               this.I00iiO = fileInputStream;
/* 455 */                               this.I00iiI = 2;
/* 457 */                               objI00000oIO2 = oiliO1i1iIII.I00000oOI(fileInputStream);
/* 461 */                               if (objI00000oIO2 != ii0111o5) {
/* 465 */                                   fileInputStream2 = fileInputStream;
                                        }
/* 463 */                               return ii0111o5;
                                    } catch (Throwable th6) {
/* 472 */                               th = th6;
/* 380 */                               th = th;
                                        try {
/* 474 */                                   throw th;
                                        } catch (Throwable th7) {
/* 476 */                                   ii1OOii.I00000oIO(fileInputStream, th);
/* 479 */                                   throw th7;
                                        }
                                    }
                                }
/* 497 */                       objI00000oIO2 = oiliO1i1iIII.I00000oIO();
                            }
/* 361 */                   if (i8 == 0) {
/* 402 */                       lIoii1l01l0i.I00000oOI(obj);
/* 409 */                       FileInputStream fileInputStream3 = new FileInputStream(ilIi00o.I00000oIO);
/* 412 */                       OiliO1i1iIII oiliO1i1iIII2 = ilIi00o.I00000oOI;
/* 414 */                       this.I00iiO = fileInputStream3;
/* 416 */                       this.I00iiI = 1;
/* 418 */                       objI00000oIO2 = oiliO1i1iIII2.I00000oOI(fileInputStream3);
                                r3 = fileInputStream3;
                                break;
                            } else {
/* 363 */                       if (i8 != 1) {
/* 365 */                           if (i8 != 2) {
/* 382 */                               I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 18 */                                return null;
                                    }
/* 370 */                           fileInputStream2 = (FileInputStream) this.I00iiO;
                                    try {
/* 372 */                               lIoii1l01l0i.I00000oOI(obj);
/* 375 */                               objI00000oIO2 = obj;
/* 466 */                               ii1OOii.I00000oIO(fileInputStream2, null);
/* 428 */                               return objI00000oIO2;
                                    } catch (Throwable th8) {
/* 378 */                               th = th8;
/* 379 */                               fileInputStream = fileInputStream2;
/* 380 */                               th = th;
/* 474 */                               throw th;
                                    }
                                }
/* 390 */                       FileInputStream fileInputStream4 = (FileInputStream) this.I00iiO;
/* 392 */                       lIoii1l01l0i.I00000oOI(obj);
/* 395 */                       objI00000oIO2 = obj;
                                r3 = fileInputStream4;
                            }
/* 425 */                   ii1OOii.I00000oIO(r3, null);
/* 428 */                   return objI00000oIO2;
                        case 5:
/* 168 */                   OolO1O oolO1O = ((OolI1lo) obj2).I0000Il00O;
/* 170 */                   Ii0111o ii0111o6 = Ii0111o.I00iOIl;
/* 172 */                   int i9 = this.I00iiI;
                            try {
                                try {
                                } catch (CancellationException unused2) {
/* 348 */                           l11I11lO.I0000O(3, "CXCP");
/* 351 */                           objI00000oIO3 = OolI1lo.I000l1;
                                }
                            } catch (CancellationException unused3) {
/* 276 */                       l11I11lO.I0000O(3, "CXCP");
/* 279 */                       iiIOI1ol0o = OolI1lo.I000l1;
                            }
                            try {
/* 174 */                       if (i9 == 0) {
/* 221 */                           lIoii1l01l0i.I00000oOI(obj);
/* 224 */                           l11I11lO.I0000O(3, "CXCP");
/* 227 */                           IIll0oO iIll0oOI00000oIO = oolO1O.I00000oIO();
/* 231 */                           this.I00iiI = 1;
/* 233 */                           objI0000Il00O2 = iIll0oOI00000oIO.I0000Il00O(this);
/* 237 */                           if (objI0000Il00O2 == ii0111o6) {
                                    }
/* 304 */                           return ii0111o6;
                                }
/* 176 */                       if (i9 == 1) {
/* 215 */                           lIoii1l01l0i.I00000oOI(obj);
/* 218 */                           objI0000Il00O2 = obj;
                                } else {
/* 178 */                           if (i9 == 2) {
/* 203 */                               autoCloseable2 = (AutoCloseable) this.I00iiO;
                                        try {
/* 205 */                                   lIoii1l01l0i.I00000oOI(obj);
/* 208 */                                   objI001i1lo1io = obj;
/* 262 */                                   iiIOI1ol0o = (IiIOI1ol0o) objI001i1lo1io;
/* 264 */                                   iOOl00.I00000oIO(autoCloseable2, null);
/* 281 */                                   this.I00iiO = null;
/* 283 */                                   this.I00iiI = 3;
/* 289 */                                   if (iiIOI1ol0o.I00o0iI0io1(this) != ii0111o6) {
/* 292 */                                       IIll0oO iIll0oOI00000oIO2 = oolO1O.I00000oIO();
/* 296 */                                       this.I00iiI = 4;
/* 298 */                                       objI0000Il00O = iIll0oOI00000oIO2.I0000Il00O(this);
                                            }
/* 304 */                                   return ii0111o6;
                                        } catch (Throwable th9) {
/* 211 */                                   th = th9;
/* 212 */                                   autoCloseable = autoCloseable2;
/* 213 */                                   th2 = th;
                                            try {
/* 270 */                                       throw th2;
                                            } catch (Throwable th10) {
/* 272 */                                       iOOl00.I00000oIO(autoCloseable, th2);
/* 275 */                                       throw th10;
                                            }
                                        }
                                    }
/* 180 */                           if (i9 == 3) {
/* 196 */                               lIoii1l01l0i.I00000oOI(obj);
/* 292 */                               IIll0oO iIll0oOI00000oIO22 = oolO1O.I00000oIO();
/* 296 */                               this.I00iiI = 4;
/* 298 */                               objI0000Il00O = iIll0oOI00000oIO22.I0000Il00O(this);
                                        break;
                                    } else {
/* 182 */                               if (i9 != 4) {
/* 191 */                                   I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 18 */                                    return null;
                                        }
/* 184 */                               lIoii1l01l0i.I00000oOI(obj);
/* 187 */                               objI0000Il00O = obj;
/* 307 */                               AutoCloseable autoCloseable3 = (AutoCloseable) objI0000Il00O;
                                        try {
/* 312 */                                   MeteringRectangle[] meteringRectangleArr = IIliIll10O.I00000oIO;
/* 331 */                                   objI00000oIO3 = IIlOIo0OlliO.I00000oIO((IIll1i) autoCloseable3, null, null, null, Arrays.asList(meteringRectangleArr), Arrays.asList(meteringRectangleArr), Arrays.asList(meteringRectangleArr), 7);
/* 335 */                                   iOOl00.I00000oIO(autoCloseable3, null);
/* 338 */                                   return objI00000oIO3;
                                        } finally {
                                        }
                                    }
                                }
/* 246 */                       this.I00iiO = autoCloseable;
/* 248 */                       this.I00iiI = 2;
/* 254 */                       objI001i1lo1io = IIll1i.I001i1lo1io((IIll1i) autoCloseable, 0L, 56);
/* 258 */                       if (objI001i1lo1io != ii0111o6) {
/* 261 */                           autoCloseable2 = autoCloseable;
/* 262 */                           iiIOI1ol0o = (IiIOI1ol0o) objI001i1lo1io;
/* 264 */                           iOOl00.I00000oIO(autoCloseable2, null);
/* 281 */                           this.I00iiO = null;
/* 283 */                           this.I00iiI = 3;
/* 289 */                           if (iiIOI1ol0o.I00o0iI0io1(this) != ii0111o6) {
                                    }
                                }
/* 304 */                       return ii0111o6;
                            } catch (Throwable th11) {
/* 268 */                       th = th11;
/* 213 */                       th2 = th;
/* 270 */                       throw th2;
                            }
/* 241 */                   autoCloseable = (AutoCloseable) objI0000Il00O2;
                        default:
/* 24 */                    OolI1lo oolI1lo = (OolI1lo) this.I00iiO;
/* 26 */                    LinkedHashMap linkedHashMap = oolI1lo.I000iOII;
/* 28 */                    List list = (List) obj2;
/* 30 */                    Ool1iI0OiI ool1iI0OiI = Ool1iI0OiI.I00iiI;
/* 32 */                    Ii0111o ii0111o7 = Ii0111o.I00iOIl;
/* 34 */                    int i10 = this.I00iiI;
/* 36 */                    if (i10 != 0) {
/* 38 */                        if (i10 == 1) {
/* 40 */                            lIoii1l01l0i.I00000oOI(obj);
/* 43 */                            return obj;
                                }
/* 47 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 18 */                        return null;
                            }
/* 52 */                    lIoii1l01l0i.I00000oOI(obj);
/* 59 */                    if (l11I11lO.I0000O(3, "CXCP")) {
/* 61 */                        Objects.toString(ool1iI0OiI);
/* 64 */                        Objects.toString(list);
                            }
/* 67 */                    Object obj4 = linkedHashMap.get(ool1iI0OiI);
                            Object obj5 = obj4;
/* 71 */                    if (obj4 == null) {
/* 77 */                        Ool1o1l ool1o1l = new Ool1o1l((IIl0lo1oi) (z4 ? 1 : 0), (LinkedHashMap) (z3 ? 1 : 0), (Oi0OO1IIl1) (z2 ? 1 : 0), 15);
/* 80 */                        linkedHashMap.put(ool1iI0OiI, ool1o1l);
                                obj5 = ool1o1l;
                            }
/* 83 */                    Ool1o1l ool1o1l2 = (Ool1o1l) obj5;
/* 87 */                    IIl0lo1oi iIl0lo1oi = new IIl0lo1oi(0);
/* 94 */                    iIl0lo1oi.I0000O(ool1o1l2.I00000oIO.I00iiI);
/* 99 */                    Iterator it = list.iterator();
/* 107 */                   while (it.hasNext()) {
/* 121 */                       iIl0lo1oi.I00iiI.I001IO000(iOil1io0i00.I00000oIO((CaptureRequest.Key) it.next()));
                            }
/* 147 */                   linkedHashMap.put(ool1iI0OiI, new Ool1o1l(iIl0lo1oi, new LinkedHashMap(ool1o1l2.I00000oOI), IOOi0Ool1i.I00iiO(ool1o1l2.I0000Il00O), ool1o1l2.I0000O));
/* 152 */                   Ool1o1l ool1o1lI000oI1ioi = OolI1lo.I000oI1ioi(oolI1lo.I000iOII);
/* 156 */                   this.I00iiI = 1;
/* 158 */                   Object objI0010I0i = oolI1lo.I0010I0i(ool1o1lI000oI1ioi, null, this);
                            return objI0010I0i == ii0111o7 ? ii0111o7 : objI0010I0i;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 14 */        public I0l11loiOIl(Object obj, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(1, iOoil1iiIilo);
/* 15 */            this.I00iOIl = i;
                    this.I00iio = obj;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 15 */        public I0l11loiOIl(Object obj, Object obj2, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(1, iOoil1iiIilo);
/* 16 */            this.I00iOIl = i;
                    this.I00iiO = obj;
                    this.I00iio = obj2;
                }
            }

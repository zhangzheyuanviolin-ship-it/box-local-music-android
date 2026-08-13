            package p000;

            import android.app.Activity;
            import android.content.Context;
            import android.content.Intent;
            import android.net.Uri;
            import android.util.Log;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.Map;
            import kotlin.jvm.functions.Function1;
            
            public abstract class Ilo1IoOo {
                public static final Ii0i0o1lliO1 I00000oIO;
                public static final Ii0i0o1lliO1 I00000oOI;

                static {
/* 14 */            Ii0i0o1lliO1 ii0i0o1lliO1 = new Ii0i0o1lliO1(0.05f, 0.7f, 0.1f, 1.0f);
/* 29 */            Ii0i0o1lliO1 ii0i0o1lliO12 = new Ii0i0o1lliO1(0.3f, 0.0f, 0.8f, 0.15f);
/* 32 */            I00000oIO = ii0i0o1lliO1;
/* 34 */            I00000oOI = ii0i0o1lliO12;
                }

                /* JADX WARN: Removed duplicated region for block: B:104:0x02af  */
                /* JADX WARN: Removed duplicated region for block: B:107:0x02c0  */
                /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
                /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
                /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x0082  */
                /* JADX WARN: Removed duplicated region for block: B:43:0x008b  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(OloIl1l1oOii oloIl1l1oOii, O1ol100o0O o1ol100o0O, boolean z, boolean z2, boolean z3, boolean z4, IllOOo00lI illOOo00lI, IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
                    boolean z5;
                    int i3;
                    IOii1l iOii1l2;
                    int i4;
                    int i5;
                    IllOOo00lI illOOo00lI2;
                    boolean z6;
                    IloI0lOlll1 iloI0lOlll12;
                    OOloioIl oOloioIlI001IO000;
                    OI10i0Il oI10i0Il;
                    OIooi1iOiOol oIooi1iOiOol;
                    Object obj;
                    O1oIo0iI00 o1oIo0iI00;
                    O1oIOiI11o0 o1oIOiI11o0;
                    OI10i0Il oI10i0Il2;
                    boolean z7;
                    Context context;
                    IllOOo00lI illOOo00lI3;
                    int i6;
                    OIooi1iOiOol oIooi1iOiOol2;
                    Ii0110 ii0110;
                    String str;
                    IOO0o0I1l iOO0o0I1l;
                    int i7;
                    boolean z8;
                    String str2;
                    Object obj2;
/* 13 */            IloI0lOlll1 iloI0lOlll13 = iloI0lOlll1;
/* 18 */            iloI0lOlll13.I00i0O(820782859);
/* 79 */            int i8 = i | (iloI0lOlll13.I000OOo1O(oloIl1l1oOii) ? 4 : 2) | (iloI0lOlll13.I000OOo1O(o1ol100o0O) ? 32 : 16) | (iloI0lOlll13.I000O01llI0(z) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF) | (iloI0lOlll13.I000O01llI0(z2) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E) | (iloI0lOlll13.I000O01llI0(z3) ? 16384 : 8192);
/* 80 */            int i9 = i2 & 32;
/* 84 */            if (i9 == 0) {
/* 92 */                if ((i & 196608) == 0) {
/* 94 */                    z5 = z4;
/* 107 */                   i8 |= iloI0lOlll13.I000O01llI0(z5) ? 131072 : 65536;
                        }
/* 119 */               i3 = i8 | (!iloI0lOlll13.I000OOo1O(illOOo00lI) ? 1048576 : 524288);
/* 138 */               if (iloI0lOlll13.I00OIl(i3 & 1, (4793491 & i3) == 4793490)) {
/* 688 */                   iOii1l2 = iOii1l;
/* 690 */                   i4 = i;
/* 692 */                   i5 = i2;
/* 694 */                   illOOo00lI2 = illOOo00lI;
/* 695 */                   iloI0lOlll13.I00OilO00Il();
/* 698 */                   z6 = z5;
                            iloI0lOlll12 = iloI0lOlll13;
                        } else {
/* 140 */                   if (i9 != 0) {
/* 142 */                       z5 = true;
                            }
/* 145 */                   OI10i0Il oI10i0IlI00000oOI = lOIoiooI1i01.I00000oOI(o1ol100o0O.I000OOo1O, iloI0lOlll13);
/* 155 */                   O1oIOiI11o0 o1oIOiI11o02 = ((O1oiOloOo) oI10i0IlI00000oOI.getValue()).I000II;
/* 157 */                   Object objI00O0i0ii = iloI0lOlll13.I00O0i0ii();
/* 161 */                   IOO0o0I1l iOO0o0I1l2 = IOl11li.I00000oIO;
/* 163 */                   if (objI00O0i0ii == iOO0o0I1l2) {
/* 165 */                       objI00O0i0ii = iIO0iiOiOl0l.I000II(iloI0lOlll13);
/* 169 */                       iloI0lOlll13.I00iio(objI00O0i0ii);
                            }
/* 172 */                   Ii0110 ii01102 = (Ii0110) objI00O0i0ii;
/* 180 */                   Context context2 = (Context) iloI0lOlll13.I000iOII(I0lloOI0oio.I00000oOI);
/* 182 */                   Object objI00O0i0ii2 = iloI0lOlll13.I00O0i0ii();
/* 186 */                   if (objI00O0i0ii2 == iOO0o0I1l2) {
/* 190 */                       objI00O0i0ii2 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 194 */                       iloI0lOlll13.I00iio(objI00O0i0ii2);
                            }
/* 197 */                   OI10i0Il oI10i0Il3 = (OI10i0Il) objI00O0i0ii2;
/* 201 */                   Object objI00O0i0ii3 = iloI0lOlll13.I00O0i0ii();
/* 205 */                   if (objI00O0i0ii3 == iOO0o0I1l2) {
/* 209 */                       objI00O0i0ii3 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 213 */                       iloI0lOlll13.I00iio(objI00O0i0ii3);
                            }
/* 216 */                   OI10i0Il oI10i0Il4 = (OI10i0Il) objI00O0i0ii3;
/* 220 */                   Object objI00O0i0ii4 = iloI0lOlll13.I00O0i0ii();
/* 224 */                   if (objI00O0i0ii4 == iOO0o0I1l2) {
/* 228 */                       oI10i0Il = oI10i0IlI00000oOI;
/* 231 */                       objI00O0i0ii4 = new OIooi1iOiOol(0);
/* 234 */                       iloI0lOlll13.I00iio(objI00O0i0ii4);
                            } else {
/* 238 */                       oI10i0Il = oI10i0IlI00000oOI;
                            }
/* 240 */                   OIooi1iOiOol oIooi1iOiOol3 = (OIooi1iOiOol) objI00O0i0ii4;
/* 244 */                   int i10 = i3 & 3670016;
/* 255 */                   boolean z9 = i10 == 1048576;
/* 257 */                   Object objI00O0i0ii5 = iloI0lOlll13.I00O0i0ii();
/* 261 */                   if (z9 || objI00O0i0ii5 == iOO0o0I1l2) {
/* 271 */                       oIooi1iOiOol = oIooi1iOiOol3;
/* 274 */                       II00l001Iooo iI00l001Iooo = new II00l001Iooo(2);
/* 277 */                       iI00l001Iooo.I00iiI = illOOo00lI;
/* 279 */                       iI00l001Iooo.I00iiO = oI10i0Il3;
/* 281 */                       VarHandle.storeStoreFence();
/* 284 */                       iloI0lOlll13.I00iio(iI00l001Iooo);
                                obj = iI00l001Iooo;
                            } else {
/* 266 */                       oIooi1iOiOol = oIooi1iOiOol3;
                                obj = objI00O0i0ii5;
                            }
/* 288 */                   IllOOo00lI illOOo00lI4 = (IllOOo00lI) obj;
/* 290 */                   boolean zI000II = iloI0lOlll13.I000II(illOOo00lI4);
/* 296 */                   Object objI00O0i0ii6 = iloI0lOlll13.I00O0i0ii();
                            Object obj3 = objI00O0i0ii6;
/* 300 */                   if (zI000II || objI00O0i0ii6 == iOO0o0I1l2) {
/* 307 */                       I0O1OI i0o1oi = new I0O1OI(6);
/* 310 */                       i0o1oi.I00iiI = illOOo00lI4;
/* 312 */                       VarHandle.storeStoreFence();
/* 315 */                       iloI0lOlll13.I00iio(i0o1oi);
                                obj3 = i0o1oi;
                            }
/* 324 */                   iOOloIo.I00000oIO(0, 1, (IllOOo00lI) obj3, iloI0lOlll13, false);
/* 333 */                   Map map = ((O1oiOloOo) oI10i0Il.getValue()).I0000Il00O;
/* 335 */                   String str3 = o1oIOiI11o02.I00000oIO;
/* 341 */                   O1oIo0iI00 o1oIo0iI002 = (O1oIo0iI00) map.get(str3);
/* 369 */                   boolean zI000II2 = iloI0lOlll13.I000II(o1oIo0iI002) | iloI0lOlll13.I000OOo1O(o1oIOiI11o02) | iloI0lOlll13.I000OOo1O(o1ol100o0O) | iloI0lOlll13.I000OOo1O(context2) | iloI0lOlll13.I000OOo1O(oloIl1l1oOii);
/* 371 */                   Object objI00O0i0ii7 = iloI0lOlll13.I00O0i0ii();
/* 375 */                   if (zI000II2 || objI00O0i0ii7 == iOO0o0I1l2) {
/* 407 */                       o1oIo0iI00 = o1oIo0iI002;
/* 408 */                       o1oIOiI11o0 = o1oIOiI11o02;
/* 411 */                       oI10i0Il2 = oI10i0Il4;
/* 413 */                       z7 = z5;
/* 415 */                       context = context2;
/* 416 */                       illOOo00lI3 = illOOo00lI4;
/* 418 */                       i6 = i10;
/* 420 */                       oIooi1iOiOol2 = oIooi1iOiOol;
/* 422 */                       ii0110 = ii01102;
/* 424 */                       str = str3;
/* 426 */                       iOO0o0I1l = iOO0o0I1l2;
/* 428 */                       i7 = 1048576;
/* 430 */                       objI00O0i0ii7 = new IO1oOi(o1oIo0iI00, o1oIOiI11o0, o1ol100o0O, context, oloIl1l1oOii, oI10i0Il3, null, 1);
/* 433 */                       iloI0lOlll13.I00iio(objI00O0i0ii7);
                            } else {
/* 380 */                       oI10i0Il2 = oI10i0Il4;
/* 382 */                       iOO0o0I1l = iOO0o0I1l2;
/* 383 */                       o1oIo0iI00 = o1oIo0iI002;
/* 384 */                       z7 = z5;
/* 386 */                       o1oIOiI11o0 = o1oIOiI11o02;
/* 387 */                       context = context2;
/* 388 */                       illOOo00lI3 = illOOo00lI4;
/* 390 */                       i6 = i10;
/* 392 */                       oIooi1iOiOol2 = oIooi1iOiOol;
/* 394 */                       ii0110 = ii01102;
/* 396 */                       i7 = 1048576;
/* 398 */                       str = str3;
                            }
/* 438 */                   iIO0iiOiOl0l.I0000oI00(o1oIo0iI00, str, (IlliIl1l11O) objI00O0i0ii7, iloI0lOlll13);
/* 453 */                   O1oOil o1oOil = (O1oOil) ((O1oiOloOo) oI10i0Il.getValue()).I0000O.get(str);
/* 455 */                   boolean zI000OOo1O = iloI0lOlll13.I000OOo1O(o1oOil);
/* 459 */                   Object objI00O0i0ii8 = iloI0lOlll13.I00O0i0ii();
/* 463 */                   if (zI000OOo1O || objI00O0i0ii8 == iOO0o0I1l) {
/* 473 */                       z8 = true;
/* 474 */                       objI00O0i0ii8 = new IO1l0lIi0O1(o1oOil, oI10i0Il2, null, 1);
/* 477 */                       iloI0lOlll13.I00iio(objI00O0i0ii8);
                            } else {
/* 468 */                       z8 = true;
                            }
/* 482 */                   iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii8, iloI0lOlll13, o1oOil);
/* 487 */                   Ilo11Ill1 ilo11Ill1 = new Ilo11Ill1();
/* 490 */                   ilo11Ill1.I00iOIl = z2;
/* 492 */                   z6 = z7;
/* 494 */                   ilo11Ill1.I00iiI = z6;
/* 496 */                   ilo11Ill1.I00iiO = oloIl1l1oOii;
/* 498 */                   ilo11Ill1.I00iio = o1oIOiI11o0;
/* 500 */                   ilo11Ill1.I00ilI0I1 = o1ol100o0O;
/* 504 */                   ilo11Ill1.I00ilO0 = illOOo00lI3;
/* 508 */                   ilo11Ill1.I00io1l = ii0110;
/* 510 */                   ilo11Ill1.I00ioIO = context;
/* 512 */                   ilo11Ill1.I00l0I0l0lO1 = z;
/* 514 */                   ilo11Ill1.I00l0OO0IO = z3;
/* 516 */                   OIooi1iOiOol oIooi1iOiOol4 = oIooi1iOiOol2;
/* 518 */                   ilo11Ill1.I00li1OI = oIooi1iOiOol4;
/* 520 */                   VarHandle.storeStoreFence();
/* 526 */                   IOii1l iOii1lI00000oOI = iiioOl1O.I00000oOI(1025556687, ilo11Ill1, iloI0lOlll13);
/* 532 */                   Ilo11i0l0O ilo11i0l0O = new Ilo11i0l0O();
/* 535 */                   ilo11i0l0O.I00iOIl = z2;
/* 537 */                   ilo11i0l0O.I00iiI = oIooi1iOiOol4;
/* 539 */                   ilo11i0l0O.I00iiO = o1oIOiI11o0;
/* 541 */                   ilo11i0l0O.I00iio = z6;
/* 543 */                   iOii1l2 = iOii1l;
/* 545 */                   ilo11i0l0O.I00ilI0I1 = iOii1l2;
/* 549 */                   ilo11i0l0O.I00ilO0 = oI10i0Il;
/* 551 */                   ilo11i0l0O.I00io1l = oloIl1l1oOii;
/* 553 */                   ilo11i0l0O.I00ioIO = o1ol100o0O;
/* 555 */                   VarHandle.storeStoreFence();
/* 561 */                   IOii1l iOii1lI00000oOI2 = iiioOl1O.I00000oOI(502839642, ilo11i0l0O, iloI0lOlll13);
/* 581 */                   int i11 = i7;
/* 590 */                   boolean z10 = z8;
/* 591 */                   i4 = i;
/* 593 */                   i5 = i2;
/* 595 */                   lO0l01iI0i.I00000oIO(null, iOii1lI00000oOI, null, null, null, 0, 0L, 0L, null, iOii1lI00000oOI2, iloI0lOlll1, 805306416, 509);
/* 598 */                   IloI0lOlll1 iloI0lOlll14 = iloI0lOlll1;
/* 610 */                   if (((Boolean) oI10i0Il2.getValue()).booleanValue()) {
/* 615 */                       iloI0lOlll14.I00i01iIIliI(698221137);
/* 618 */                       if (o1oOil == null || (str2 = o1oOil.I00000oOI) == null) {
/* 628 */                           str2 = "";
                                }
/* 631 */                       if (i6 != i11) {
/* 634 */                           z10 = false;
                                }
/* 635 */                       Object objI00O0i0ii9 = iloI0lOlll14.I00O0i0ii();
/* 639 */                       if (z10 || objI00O0i0ii9 == iOO0o0I1l) {
/* 650 */                           II00l001Iooo iI00l001Iooo2 = new II00l001Iooo(3);
/* 653 */                           illOOo00lI2 = illOOo00lI;
/* 655 */                           iI00l001Iooo2.I00iiI = illOOo00lI2;
/* 657 */                           iI00l001Iooo2.I00iiO = oI10i0Il2;
/* 659 */                           VarHandle.storeStoreFence();
/* 662 */                           iloI0lOlll14.I00iio(iI00l001Iooo2);
                                    obj2 = iI00l001Iooo2;
                                } else {
/* 644 */                           illOOo00lI2 = illOOo00lI;
                                    obj2 = objI00O0i0ii9;
                                }
/* 668 */                       ilIIill.I00000oIO(str2, (IllOOo00lI) obj2, iloI0lOlll14, 0);
/* 671 */                       iloI0lOlll14.I0010I0i(false);
                                iloI0lOlll12 = iloI0lOlll14;
                            } else {
/* 675 */                       illOOo00lI2 = illOOo00lI;
/* 681 */                       iloI0lOlll14.I00i01iIIliI(698380663);
/* 684 */                       iloI0lOlll14.I0010I0i(false);
                                iloI0lOlll12 = iloI0lOlll14;
                            }
                        }
/* 699 */               oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 703 */               if (oOloioIlI001IO000 == null) {
/* 707 */                   Ilo11oOoI1 ilo11oOoI1 = new Ilo11oOoI1();
/* 710 */                   ilo11oOoI1.I00iOIl = oloIl1l1oOii;
/* 712 */                   ilo11oOoI1.I00iiI = o1ol100o0O;
/* 714 */                   ilo11oOoI1.I00iiO = z;
/* 716 */                   ilo11oOoI1.I00iio = z2;
/* 718 */                   ilo11oOoI1.I00ilI0I1 = z3;
/* 720 */                   ilo11oOoI1.I00ilO0 = z6;
/* 722 */                   ilo11oOoI1.I00io1l = illOOo00lI2;
/* 724 */                   ilo11oOoI1.I00ioIO = iOii1l2;
/* 726 */                   ilo11oOoI1.I00l0I0l0lO1 = i4;
/* 728 */                   ilo11oOoI1.I00l0OO0IO = i5;
/* 730 */                   VarHandle.storeStoreFence();
/* 733 */                   oOloioIlI001IO000.I0000O = ilo11oOoI1;
/* 3539 */                  return;
                        }
/* 3539 */              return;
                    }
/* 86 */            i8 |= 196608;
/* 87 */            z5 = z4;
/* 119 */           i3 = i8 | (!iloI0lOlll13.I000OOo1O(illOOo00lI) ? 1048576 : 524288);
/* 138 */           if (iloI0lOlll13.I00OIl(i3 & 1, (4793491 & i3) == 4793490)) {
                    }
/* 699 */           oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 703 */           if (oOloioIlI001IO000 == null) {
                    }
                }

                public static final void I00000oOI(OI1o1o1iO1l oI1o1o1iO1l, O1ooiI111i o1ooiI111i, O1ol100o0O o1ol100o0O, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
                    O1ol100o0O o1ol100o0O2;
                    O1ooiI111i o1ooiI111i2;
                    Object iI01IloII;
                    OI10i0Il oI10i0Il;
                    OI10i0Il oI10i0Il2;
                    OI1o1o1iO1l oI1o1o1iO1l2;
/* 1 */             OI1o1o1iO1l oI1o1o1iO1l3 = oI1o1o1iO1l;
/* 12 */            iloI0lOlll1.I00i0O(34327023);
/* 17 */            if ((i & 6) == 0) {
/* 28 */                i2 = (iloI0lOlll1.I000OOo1O(oI1o1o1iO1l3) ? 4 : 2) | i;
                    } else {
/* 30 */                i2 = i;
                    }
/* 31 */            int i3 = i2 | 48;
/* 35 */            if ((i & 384) == 0) {
/* 48 */                i3 |= iloI0lOlll1.I000OOo1O(o1ol100o0O) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 49 */            int i4 = i3;
/* 65 */            if (iloI0lOlll1.I00OIl(i4 & 1, (i4 & 147) != 146)) {
/* 74 */                Object obj = (O0oiOi) iloI0lOlll1.I000iOII(O11looOii.I00000oIO);
/* 76 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 80 */                Object obj2 = IOl11li.I00000oIO;
/* 82 */                if (objI00O0i0ii == obj2) {
/* 86 */                    objI00O0i0ii = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 90 */                    iloI0lOlll1.I00iio(objI00O0i0ii);
                        }
/* 95 */                Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 100 */               if (objI00O0i0ii2 == obj2) {
/* 102 */                   objI00O0i0ii2 = lOO00IiI0li.I00000oIO(null);
/* 106 */                   iloI0lOlll1.I00iio(objI00O0i0ii2);
                        }
/* 110 */               OI10i0Il oI10i0Il3 = (OI10i0Il) objI00O0i0ii2;
/* 112 */               Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
/* 116 */               if (objI00O0i0ii3 == obj2) {
/* 120 */                   objI00O0i0ii3 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 124 */                   iloI0lOlll1.I00iio(objI00O0i0ii3);
                        }
/* 127 */               OI10i0Il oI10i0Il4 = (OI10i0Il) objI00O0i0ii3;
/* 129 */               Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
/* 133 */               if (objI00O0i0ii4 == obj2) {
/* 137 */                   objI00O0i0ii4 = lOO00IiI0li.I00000oIO(Boolean.TRUE);
/* 141 */                   iloI0lOlll1.I00iio(objI00O0i0ii4);
                        }
/* 144 */               OI10i0Il oI10i0Il5 = (OI10i0Il) objI00O0i0ii4;
/* 146 */               Object objI00O0i0ii5 = iloI0lOlll1.I00O0i0ii();
/* 150 */               if (objI00O0i0ii5 == obj2) {
/* 154 */                   objI00O0i0ii5 = lOO00IiI0li.I00000oIO("");
/* 158 */                   iloI0lOlll1.I00iio(objI00O0i0ii5);
                        }
/* 161 */               OI10i0Il oI10i0Il6 = (OI10i0Il) objI00O0i0ii5;
/* 165 */               OI10i0Il oI10i0IlI00000oOI = lOIoiooI1i01.I00000oOI(o1ol100o0O.I000OOo1O, iloI0lOlll1);
/* 177 */               String str = ((O1oiOloOo) oI10i0IlI00000oOI.getValue()).I000o00OoI0I;
/* 189 */               Boolean boolValueOf = Boolean.valueOf(((O1oiOloOo) oI10i0IlI00000oOI.getValue()).I0000oI00);
/* 207 */               boolean zI000II = iloI0lOlll1.I000II(oI10i0IlI00000oOI) | iloI0lOlll1.I000OOo1O(o1ol100o0O) | iloI0lOlll1.I000OOo1O(oI1o1o1iO1l3);
/* 209 */               Object objI00O0i0ii6 = iloI0lOlll1.I00O0i0ii();
/* 213 */               if (zI000II || objI00O0i0ii6 == obj2) {
/* 229 */                   oI10i0Il = oI10i0Il5;
/* 230 */                   oI10i0Il2 = oI10i0Il4;
/* 231 */                   oI1o1o1iO1l2 = oI1o1o1iO1l;
/* 233 */                   iI01IloII = new II01IloII(o1ol100o0O, oI1o1o1iO1l2, oI10i0IlI00000oOI, oI10i0Il6, (IOoil1iiIilo) null);
/* 236 */                   iloI0lOlll1.I00iio(iI01IloII);
                        } else {
/* 219 */                   oI1o1o1iO1l2 = oI1o1o1iO1l3;
/* 220 */                   iI01IloII = objI00O0i0ii6;
/* 221 */                   oI10i0Il2 = oI10i0Il4;
/* 222 */                   oI10i0Il = oI10i0Il5;
                        }
/* 241 */               iIO0iiOiOl0l.I0000oI00(str, boolValueOf, (IlliIl1l11O) iI01IloII, iloI0lOlll1);
/* 252 */               boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(o1ol100o0O) | iloI0lOlll1.I000OOo1O(obj);
/* 253 */               Object objI00O0i0ii7 = iloI0lOlll1.I00O0i0ii();
                        Object obj3 = objI00O0i0ii7;
/* 257 */               if (zI000OOo1O || objI00O0i0ii7 == obj2) {
/* 265 */                   IiioilIl1Il iiioilIl1Il = new IiioilIl1Il(8);
/* 268 */                   iiioilIl1Il.I00iiI = obj;
/* 270 */                   iiioilIl1Il.I00iiO = o1ol100o0O;
/* 272 */                   VarHandle.storeStoreFence();
/* 275 */                   iloI0lOlll1.I00iio(iiioilIl1Il);
                            obj3 = iiioilIl1Il;
                        }
/* 280 */               iIO0iiOiOl0l.I00000oOI(obj, (Function1) obj3, iloI0lOlll1);
/* 283 */               Object objI00O0i0ii8 = iloI0lOlll1.I00O0i0ii();
/* 287 */               if (objI00O0i0ii8 == obj2) {
/* 293 */                   objI00O0i0ii8 = new Ilo10O1IlOl(16);
/* 296 */                   iloI0lOlll1.I00iio(objI00O0i0ii8);
                        }
/* 300 */               Function1 function1 = (Function1) objI00O0i0ii8;
/* 302 */               Object objI00O0i0ii9 = iloI0lOlll1.I00O0i0ii();
/* 306 */               if (objI00O0i0ii9 == obj2) {
/* 312 */                   objI00O0i0ii9 = new Iil0iiOiI(23);
/* 315 */                   iloI0lOlll1.I00iio(objI00O0i0ii9);
                        }
/* 318 */               Function1 function12 = (Function1) objI00O0i0ii9;
/* 338 */               boolean zI000OOo1O2 = iloI0lOlll1.I000OOo1O(o1ol100o0O) | ((i4 & 112) == 32) | iloI0lOlll1.I000OOo1O(oI1o1o1iO1l2);
/* 339 */               Object objI00O0i0ii10 = iloI0lOlll1.I00O0i0ii();
                        Object obj4 = objI00O0i0ii10;
/* 343 */               if (zI000OOo1O2 || objI00O0i0ii10 == obj2) {
/* 350 */                   I0O0o00OlIoi i0O0o00OlIoi = new I0O0o00OlIoi(6);
/* 353 */                   i0O0o00OlIoi.I00iiO = o1ol100o0O;
/* 355 */                   i0O0o00OlIoi.I00iio = oI1o1o1iO1l2;
/* 357 */                   i0O0o00OlIoi.I00iiI = oI10i0Il2;
/* 359 */                   i0O0o00OlIoi.I00io1l = oI10i0Il3;
/* 361 */                   i0O0o00OlIoi.I00ilI0I1 = oI10i0Il;
/* 363 */                   i0O0o00OlIoi.I00ilO0 = oI10i0Il6;
/* 365 */                   VarHandle.storeStoreFence();
/* 368 */                   iloI0lOlll1.I00iio(i0O0o00OlIoi);
                            obj4 = i0O0o00OlIoi;
                        }
/* 384 */               o1ol100o0O2 = o1ol100o0O;
/* 387 */               oI1o1o1iO1l3 = oI1o1o1iO1l;
/* 389 */               l1iOI0I1iII.I00000oIO(oI1o1o1iO1l3, null, null, function1, function12, null, null, (Function1) obj4, iloI0lOlll1, (i4 & 14) | 1769520);
/* 398 */               Activity activity = (Activity) iloI0lOlll1.I000iOII(O11lli.I00000oIO);
/* 407 */               Intent intent = activity != null ? activity.getIntent() : null;
/* 415 */               Uri data = intent != null ? intent.getData() : null;
/* 416 */               if (data != null) {
/* 419 */                   intent.setData(null);
/* 422 */                   data.toString();
/* 436 */                   if (OlOolloIIOl0.I000l1(data.toString(), "com.box.gallery://model/", false)) {
/* 447 */                       if (data.getPathSegments().size() >= 2) {
/* 462 */                           String str2 = data.getPathSegments().get(data.getPathSegments().size() - 2);
/* 478 */                           O1oIOiI11o0 o1oIOiI11o0I001IIilI0O = o1ol100o0O2.I001IIilI0O((String) IOOi0Ool1i.I00Io1o110i(data.getPathSegments()));
/* 482 */                           if (o1oIOiI11o0I001IIilI0O != null) {
/* 508 */                               OI1o1o1iO1l.I0000Il00O(oI1o1o1iO1l3, "route_model/" + str2 + "/" + o1oIOiI11o0I001IIilI0O.I00000oIO);
                                    }
                                } else {
/* 528 */                           Log.e("AGGalleryNavGraph", "Malformed deep link URI received: " + data);
                                }
                            } else if (O0000Ioio00.I0000O(data.toString(), "com.box.gallery://global_model_manager")) {
/* 546 */                       OI1o1o1iO1l.I0000Il00O(oI1o1o1iO1l3, "model_manager");
                            }
                        }
/* 549 */               o1ooiI111i2 = O1ooIo101ll.I00000oIO;
                    } else {
/* 552 */               o1ol100o0O2 = o1ol100o0O;
/* 553 */               iloI0lOlll1.I00OilO00Il();
/* 556 */               o1ooiI111i2 = o1ooiI111i;
                    }
/* 558 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 562 */           if (oOloioIlI001IO000 != null) {
/* 568 */               I0IliiililIo i0IliiililIo = new I0IliiililIo(12);
/* 571 */               i0IliiililIo.I00iiO = oI1o1o1iO1l3;
/* 573 */               i0IliiililIo.I00iio = o1ooiI111i2;
/* 575 */               i0IliiililIo.I00ilI0I1 = o1ol100o0O2;
/* 577 */               i0IliiililIo.I00iiI = i;
/* 579 */               VarHandle.storeStoreFence();
/* 582 */               oOloioIlI001IO000.I0000O = i0IliiililIo;
                    }
                }

                public static final Il0l0iooI I0000Il00O(I10l1l11 i10l1l11) {
/* 6 */             Ii0i0o1lliO1 ii0i0o1lliO1 = I00000oIO;
/* 25 */            return i10l1l11.I00000oIO(0, new OoIoO0I0oOI(400, 0, ii0i0o1lliO1)).I00000oIO(Il0iiiII11.I0000oI00(new OoIoO0I0oOI(400, 0, ii0i0o1lliO1), 2));
                }

                public static final Il1OOloOIl1 I0000O(I10l1l11 i10l1l11) {
/* 4 */             Ii0i0o1lliO1 ii0i0o1lliO1 = I00000oOI;
/* 23 */            return i10l1l11.I0000Il00O(1, iOO01lio0.I0000O(200, 2, ii0i0o1lliO1)).I00000oIO(Il0iiiII11.I0001Ioi1lo(iOO01lio0.I0000O(200, 2, ii0i0o1lliO1), 2));
                }
            }

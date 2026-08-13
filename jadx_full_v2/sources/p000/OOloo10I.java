            package p000;

            import android.os.Trace;
            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Set;
            import kotlin.jvm.functions.Function1;
            
            public final class OOloo10I implements Function1 {
                public OOloolilI11i I00iOIl;
                public OI10IIO I00iiI;
                public OI10IIO I00iiO;
                public List I00iio;
                public List I00ilI0I1;
                public OI10IIO I00ilO0;
                public List I00io1l;
                public OI10IIO I00ioIO;
                public Set I00l0I0l0lO1;

                /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
                /* JADX WARN: Removed duplicated region for block: B:95:0x0195  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj) {
                    boolean zI00II0Ol1O0l;
                    OoiIlOl1iI ooiIlOl1iI;
                    Object[] objArr;
                    int i;
                    Ol1il1o1 ooIOOo1;
                    Object[] objArr2;
                    long[] jArr;
                    long j;
                    int length;
                    boolean z;
/* 3 */             OoiIlOl1iI ooiIlOl1iI2 = OoiIlOl1iI.I00000oIO;
/* 5 */             OOloolilI11i oOloolilI11i = this.I00iOIl;
/* 7 */             OI10IIO oi10iio = this.I00iiI;
/* 9 */             OI10IIO oi10iio2 = this.I00iiO;
/* 11 */            List list = this.I00iio;
/* 13 */            List list2 = this.I00ilI0I1;
/* 15 */            OI10IIO oi10iio3 = this.I00ilO0;
/* 17 */            List list3 = this.I00io1l;
/* 19 */            OI10IIO oi10iio4 = this.I00ioIO;
/* 21 */            Set set = this.I00l0I0l0lO1;
/* 27 */            long jLongValue = ((Long) obj).longValue();
/* 31 */            OlO0OIIl1 olO0OIIl1 = OOloolilI11i.I001l0I00;
                    synchronized (oOloolilI11i.I0000Il00O) {
/* 36 */                zI00II0Ol1O0l = oOloolilI11i.I00II0Ol1O0l();
                    }
/* 41 */            char c = 2;
/* 43 */            if (zI00II0Ol1O0l) {
/* 47 */                Trace.beginSection("Recomposer:animation");
                        try {
/* 54 */                    I1ii1o0 i1ii1o0 = (I1ii1o0) oOloolilI11i.I00000oIO.I00iiO;
/* 58 */                    I0o0iioo0IO i0o0iioo0IO = new I0o0iioo0IO(2);
/* 61 */                    i0o0iioo0IO.I00iiI = jLongValue;
/* 63 */                    VarHandle.storeStoreFence();
/* 66 */                    i1ii1o0.I001lloI(i0o0iioo0IO);
                            synchronized (Ol1l1lI1Ili.I0000Il00O) {
/* 74 */                        OI10IIO oi10iio5 = Ol1l1lI1Ili.I000OiO.I000O01llI0;
/* 76 */                        if (oi10iio5 != null) {
/* 86 */                            z = oi10iio5.I000O01llI0();
                                }
                            }
/* 88 */                    if (z) {
/* 90 */                        Ol1l1lI1Ili.I0000Il00O();
                            }
                        } finally {
                        }
                    }
/* 107 */           Trace.beginSection("Recomposer:recompose");
                    try {
/* 110 */               oOloolilI11i.I00IoiI();
                        synchronized (oOloolilI11i.I0000Il00O) {
                            try {
/* 116 */                       OI110O0 oi110o0 = oOloolilI11i.I000OOo1O;
/* 118 */                       Object[] objArr3 = oi110o0.I00iOIl;
/* 120 */                       int i2 = oi110o0.I00iiO;
/* 122 */                       int i3 = 0;
/* 123 */                       while (i3 < i2) {
/* 136 */                           list.add((IOlIOiI0iiI1) objArr3[i3]);
/* 139 */                           i3++;
/* 141 */                           c = c;
                                }
/* 152 */                       oOloolilI11i.I000OOo1O.I000II();
                            } finally {
                            }
                        }
/* 156 */               oi10iio.I00000oOI();
/* 159 */               oi10iio2.I00000oOI();
                        while (true) {
/* 170 */                   if (list.isEmpty() && list2.isEmpty()) {
                                break;
                            }
/* 181 */                   ooiIlOl1iI = ooiIlOl1iI2;
                            try {
/* 621 */                       int size = list.size();
/* 626 */                       for (int i4 = 0; i4 < size; i4++) {
/* 632 */                           IOlIOiI0iiI1 iOlIOiI0iiI1 = (IOlIOiI0iiI1) list.get(i4);
/* 634 */                           IOlIOiI0iiI1 iOlIOiI0iiI1I00IoIO0lI = oOloolilI11i.I00IoIO0lI(iOlIOiI0iiI1, oi10iio);
/* 638 */                           if (iOlIOiI0iiI1I00IoIO0lI != null) {
/* 643 */                               list3.add(iOlIOiI0iiI1I00IoIO0lI);
                                    }
/* 651 */                           oi10iio2.I00000oIO(iOlIOiI0iiI1);
                                }
/* 657 */                       list.clear();
/* 664 */                       if (oi10iio.I000O01llI0() || oOloolilI11i.I000OOo1O.I00iiO != 0) {
                                    synchronized (oOloolilI11i.I0000Il00O) {
                                        try {
/* 675 */                                   List listI00IOO = oOloolilI11i.I00IOO();
/* 682 */                                   int size2 = listI00IOO.size();
/* 687 */                                   for (int i5 = 0; i5 < size2; i5++) {
/* 693 */                                       IOlIOiI0iiI1 iOlIOiI0iiI12 = (IOlIOiI0iiI1) listI00IOO.get(i5);
/* 699 */                                       if (!oi10iio2.I0000Il00O(iOlIOiI0iiI12) && iOlIOiI0iiI12.I001iOo1i0O(set)) {
/* 710 */                                           list.add(iOlIOiI0iiI12);
                                                }
                                            }
/* 720 */                                   OI110O0 oi110o02 = oOloolilI11i.I000OOo1O;
/* 722 */                                   int i6 = oi110o02.I00iiO;
/* 724 */                                   int i7 = 0;
/* 725 */                                   int i8 = 0;
                                            while (true) {
/* 726 */                                       objArr = oi110o02.I00iOIl;
/* 728 */                                       if (i7 >= i6) {
                                                    break;
                                                }
/* 732 */                                       IOlIOiI0iiI1 iOlIOiI0iiI13 = (IOlIOiI0iiI1) objArr[i7];
/* 738 */                                       if (!oi10iio2.I0000Il00O(iOlIOiI0iiI13) && !list.contains(iOlIOiI0iiI13)) {
/* 749 */                                           list.add(iOlIOiI0iiI13);
/* 752 */                                           i8++;
                                                } else if (i8 > 0) {
/* 757 */                                           Object[] objArr4 = oi110o02.I00iOIl;
/* 763 */                                           objArr4[i7 - i8] = objArr4[i7];
                                                }
/* 765 */                                       i7++;
                                            }
/* 769 */                                   int i9 = i6 - i8;
/* 772 */                                   Arrays.fill(objArr, i9, i6, (Object) null);
/* 775 */                                   oi110o02.I00iiO = i9;
                                        } finally {
                                        }
                                    }
                                }
/* 782 */                       if (list.isEmpty()) {
                                    try {
/* 784 */                               OOlooO1oiOlo.I000II(list2, oOloolilI11i);
/* 794 */                               while (!list2.isEmpty()) {
/* 796 */                                   List listI00Io1o110i = oOloolilI11i.I00Io1o110i(list2, oi10iio);
/* 802 */                                   oi10iio3.getClass();
/* 805 */                                   Iterator it = listI00Io1o110i.iterator();
/* 813 */                                   while (it.hasNext()) {
/* 819 */                                       oi10iio3.I000iOII(it.next());
                                            }
/* 823 */                                   OOlooO1oiOlo.I000II(list2, oOloolilI11i);
                                        }
                                    } catch (Throwable th) {
/* 834 */                               oOloolilI11i.I00IoO0(th, null);
/* 837 */                               OOlooO1oiOlo.I00000oIO(oOloolilI11i, list, list2, list3, oi10iio3, oi10iio4, oi10iio, oi10iio2);
                                    }
                                }
/* 830 */                       ooiIlOl1iI2 = ooiIlOl1iI;
                            } catch (Throwable th2) {
                                try {
/* 844 */                           oOloolilI11i.I00IoO0(th2, null);
/* 847 */                           OOlooO1oiOlo.I00000oIO(oOloolilI11i, list, list2, list3, oi10iio3, oi10iio4, oi10iio, oi10iio2);
/* 850 */                           list.clear();
                                } catch (Throwable th3) {
/* 857 */                           list.clear();
/* 860 */                           throw th3;
                                }
                            }
/* 855 */                   return ooiIlOl1iI;
                        }
/* 186 */               Ol1il1o1 ol1il1o1I000O01llI0 = Ol1l1lI1Ili.I000O01llI0();
/* 192 */               if (ol1il1o1I000O01llI0 instanceof OI10OloOOoi) {
/* 208 */                   ooIOOo1 = new OoIOO1001((OI10OloOOoi) ol1il1o1I000O01llI0, null, null, true, false);
/* 211 */                   i = 0;
                        } else {
/* 216 */                   i = 0;
/* 217 */                   ooIOOo1 = new OoIOOo1(ol1il1o1I000O01llI0, null, true, false);
                        }
                        try {
/* 222 */                   Ol1il1o1 ol1il1o1I000OiO = ooIOOo1.I000OiO();
                            try {
/* 233 */                       if (!list3.isEmpty()) {
                                    try {
/* 238 */                               int size3 = list3.size();
/* 243 */                               for (int i10 = i; i10 < size3; i10++) {
/* 251 */                                   oi10iio4.I00000oIO((IOlIOiI0iiI1) list3.get(i10));
                                        }
/* 262 */                               int size4 = list3.size();
/* 267 */                               for (int i11 = i; i11 < size4; i11++) {
/* 275 */                                   ((IOlIOiI0iiI1) list3.get(i11)).I000II();
                                        }
                                    } catch (Throwable th4) {
                                        try {
/* 288 */                                   oOloolilI11i.I00IoO0(th4, null);
/* 291 */                                   OOlooO1oiOlo.I00000oIO(oOloolilI11i, list, list2, list3, oi10iio3, oi10iio4, oi10iio, oi10iio2);
/* 300 */                                   ooIOOo1.I0000Il00O();
/* 303 */                                   Trace.endSection();
/* 306 */                                   return ooiIlOl1iI2;
                                        } finally {
/* 314 */                                   list3.clear();
                                        }
                                    }
                                }
/* 331 */                       if (oi10iio3.I000O01llI0()) {
                                    try {
/* 333 */                               oi10iio4.I000OiO(oi10iio3);
/* 336 */                               objArr2 = oi10iio3.I00000oOI;
/* 338 */                               jArr = oi10iio3.I00000oIO;
/* 340 */                               j = 128;
                                        length = jArr.length - 2;
                                    } catch (Throwable th5) {
/* 415 */                               th = th5;
/* 416 */                               ooiIlOl1iI = ooiIlOl1iI2;
                                    }
/* 345 */                           if (length >= 0) {
/* 347 */                               int i12 = 0;
                                        while (true) {
/* 350 */                                   long j2 = jArr[i12];
/* 352 */                                   Object[] objArr5 = objArr2;
/* 354 */                                   ooiIlOl1iI = ooiIlOl1iI2;
/* 364 */                                   if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
/* 371 */                                       int i13 = 8 - ((~(i12 - length)) >>> 31);
/* 374 */                                       for (int i14 = 0; i14 < i13; i14++) {
/* 380 */                                           if ((j2 & 255) < 128) {
                                                        try {
/* 390 */                                                   ((IOlIOiI0iiI1) objArr5[(i12 << 3) + i14]).I000OOo1O();
                                                        } catch (Throwable th6) {
/* 394 */                                                   th = th6;
                                                            try {
/* 425 */                                                       oOloolilI11i.I00IoO0(th, null);
/* 428 */                                                       OOlooO1oiOlo.I00000oIO(oOloolilI11i, list, list2, list3, oi10iio3, oi10iio4, oi10iio, oi10iio2);
/* 437 */                                                       ooIOOo1.I0000Il00O();
/* 855 */                                                       return ooiIlOl1iI;
                                                            } finally {
/* 446 */                                                       oi10iio3.I00000oOI();
                                                            }
                                                        }
                                                    }
/* 397 */                                           j2 >>= 8;
                                                }
/* 404 */                                       if (i13 != 8) {
                                                    break;
                                                }
/* 406 */                                       if (i12 == length) {
                                                    break;
                                                }
/* 408 */                                       i12++;
/* 410 */                                       ooiIlOl1iI2 = ooiIlOl1iI;
/* 412 */                                       objArr2 = objArr5;
                                            }
/* 855 */                                   return ooiIlOl1iI;
                                        }
                                    }
/* 419 */                           ooiIlOl1iI = ooiIlOl1iI2;
                                } else {
/* 450 */                           ooiIlOl1iI = ooiIlOl1iI2;
/* 452 */                           j = 128;
                                }
/* 458 */                       if (oi10iio4.I000O01llI0()) {
                                    try {
/* 460 */                               Object[] objArr6 = oi10iio4.I00000oOI;
/* 462 */                               long[] jArr2 = oi10iio4.I00000oIO;
                                        int length2 = jArr2.length - 2;
/* 467 */                               if (length2 >= 0) {
/* 469 */                                   int i15 = 0;
                                            while (true) {
/* 470 */                                       long j3 = jArr2[i15];
/* 472 */                                       Object[] objArr7 = objArr6;
/* 473 */                                       long[] jArr3 = jArr2;
/* 483 */                                       if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
/* 492 */                                           int i16 = 8 - ((~(i15 - length2)) >>> 31);
/* 495 */                                           for (int i17 = 0; i17 < i16; i17++) {
/* 501 */                                               if ((j3 & 255) < j) {
/* 511 */                                                   ((IOlIOiI0iiI1) objArr7[(i15 << 3) + i17]).I000OiO();
                                                        }
/* 522 */                                               j3 >>= 8;
                                                    }
/* 530 */                                           if (i16 != 8) {
                                                        break;
                                                    }
                                                }
/* 535 */                                       if (i15 == length2) {
                                                    break;
                                                }
/* 537 */                                       i15++;
/* 539 */                                       objArr6 = objArr7;
/* 540 */                                       jArr2 = jArr3;
                                            }
                                        }
                                    } catch (Throwable th7) {
                                        try {
/* 547 */                                   oOloolilI11i.I00IoO0(th7, null);
/* 550 */                                   OOlooO1oiOlo.I00000oIO(oOloolilI11i, list, list2, list3, oi10iio3, oi10iio4, oi10iio, oi10iio2);
/* 556 */                                   Ol1il1o1.I00100o1O0lo(ol1il1o1I000OiO);
/* 437 */                                   ooIOOo1.I0000Il00O();
/* 855 */                                   return ooiIlOl1iI;
                                        } finally {
/* 561 */                                   oi10iio4.I00000oOI();
                                        }
                                    }
                                }
/* 568 */                       ooIOOo1.I0000Il00O();
                                synchronized (oOloolilI11i.I0000Il00O) {
/* 578 */                           if (oOloolilI11i.I001lloI() != null) {
/* 583 */                               IOl1II00.I00000oIO("unexpected to get continuation here");
                                    }
                                }
/* 591 */                       Ol1l1lI1Ili.I000O01llI0().I000lI();
/* 594 */                       oi10iio2.I00000oOI();
/* 597 */                       oi10iio.I00000oOI();
/* 601 */                       oOloolilI11i.I00100o1O0lo = null;
/* 606 */                       return ooiIlOl1iI;
                            } finally {
/* 610 */                       Ol1il1o1.I00100o1O0lo(ol1il1o1I000OiO);
                            }
                        } catch (Throwable th8) {
/* 614 */                   ooIOOo1.I0000Il00O();
/* 617 */                   throw th8;
                        }
                    } finally {
                    }
                }
            }

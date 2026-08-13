            package p000;

            import android.graphics.Matrix;
            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            import kotlin.jvm.functions.Function1;
            
            public final class I1oO0i1l0101 implements Function1 {
                public final int I00iOIl;
                public IiOoOi1 I00iiI;

                public I1oO0i1l0101(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:39:0x00c0  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj) {
                    OlIl0i olIl0i;
                    IiOoOi1 iiOoOi1;
                    O0iiliOio o0iiliOio;
                    float f;
                    char c;
                    float fMax;
                    float f2;
                    float f3;
                    boolean z;
                    float f4;
                    float f5;
/* 3 */             int i = this.I00iOIl;
/* 5 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 1032 */                  this.I00iiI.I00olI.I000O01llI0(((Number) ((I10i01) obj).I0000O()).floatValue() % 1.0f);
/* 1008 */                  return ooiIlOl1iI;
                        case 1:
/* 857 */                   int i2 = 2;
/* 861 */                   IiOoOi1 iiOoOi12 = this.I00iiI;
/* 865 */                   IIi11Illi1I iIi11Illi1I = (IIi11Illi1I) obj;
/* 875 */                   float fFloatValue = ((Number) iiOoOi12.I00ooiO1I.invoke()).floatValue();
/* 883 */                   if (fFloatValue < 0.0f) {
/* 885 */                       fFloatValue = 0.0f;
                            }
/* 890 */                   if (fFloatValue > 1.0f) {
/* 892 */                       fFloatValue = 1.0f;
                            }
/* 906 */                   float fFloatValue2 = ((Number) iiOoOi12.I00oooO.invoke(Float.valueOf(fFloatValue))).floatValue();
/* 921 */                   float f6 = fFloatValue2 < 0.0f ? 0.0f : fFloatValue2;
/* 930 */                   float f7 = f6 > 1.0f ? 1.0f : f6;
/* 931 */                   I10i01 i10i01I00000oIO = iiOoOi12.I00oliIiO01i;
/* 933 */                   if (i10i01I00000oIO == null) {
/* 935 */                       i10i01I00000oIO = O1OI1ll1Il0i.I00000oIO(f7);
/* 939 */                       iiOoOi12.I00oliIiO01i = i10i01I00000oIO;
                            }
/* 943 */                   if (iiOoOi12.I00lll10 && ((Number) i10i01I00000oIO.I0000oI00.getValue()).floatValue() != f7 && ((olIl0i = iiOoOi12.I00oo1iO0ll) == null || olIl0i.I00oII())) {
/* 989 */                       iiOoOi12.I00oo1iO0ll = iOi1II01i0.I0000O(iiOoOi12.I00ooiO1I(), null, null, new I1oO0Ooo0o0i(i10i01I00000oIO, f7, null), 3);
                            }
/* 995 */                   I1oO0i1l0101 i1oO0i1l0101 = new I1oO0i1l0101(i2);
/* 998 */                   i1oO0i1l0101.I00iiI = iiOoOi12;
/* 1000 */                  VarHandle.storeStoreFence();
/* 1003 */                  return iIi11Illi1I.I00000oOI(i1oO0i1l0101);
                        default:
/* 11 */                    IiOoOi1 iiOoOi13 = this.I00iiI;
/* 15 */                    O0iiliOio o0iiliOio2 = (O0iiliOio) obj;
/* 17 */                    I10i01 i10i01 = iiOoOi13.I00oliIiO01i;
/* 19 */                    O0ooOII o0ooOII = iiOoOi13.I00ooIo0;
/* 34 */                    float fFloatValue3 = i10i01 != null ? ((Number) i10i01.I0000O()).floatValue() : 0.0f;
/* 35 */                    IIolilIo iIolilIo = o0iiliOio2.I00iOIl;
/* 37 */                    IIolilIo iIolilIo2 = o0iiliOio2.I00iOIl;
/* 39 */                    long jI0000oI00 = iIolilIo.I0000oI00();
/* 45 */                    float fI00i0ilIl0i = o0iiliOio2.I00i0ilIl0i(iiOoOi13.I00oOio10iI1);
/* 49 */                    float[] fArrI010o0o0oO = iiOoOi13.I010o0o0oO();
/* 66 */                    float fI000II = fFloatValue3 > 0.0f ? iiOoOi13.I00olI.I000II() : 0.0f;
/* 70 */                    float fI00i0ilIl0i2 = o0iiliOio2.I00i0ilIl0i(iiOoOi13.I00oO101o);
/* 74 */                    OlOooI0l0011 olOooI0l0011 = iiOoOi13.I00oII;
/* 78 */                    OlOooI0l0011 olOooI0l00112 = iiOoOi13.I00oIiI10;
/* 80 */                    float f8 = 1.0f;
/* 82 */                    I0olIil0 i0olIil0 = o0ooOII.I000iOII;
/* 86 */                    I0ol0lI i0ol0lI = o0ooOII.I000l1;
/* 94 */                    if (o0ooOII.I0000O == null) {
/* 99 */                        o0ooOII.I0000O = new float[fArrI010o0o0oO.length];
/* 102 */                       int length = fArrI010o0o0oO.length / 2;
/* 104 */                       o0iiliOio = o0iiliOio2;
/* 106 */                       I0ol0lI[] i0ol0lIArr = new I0ol0lI[length];
/* 108 */                       iiOoOi1 = iiOoOi13;
/* 112 */                       for (int i3 = 0; i3 < length; i3++) {
/* 118 */                           i0ol0lIArr[i3] = I0olIlI11.I00000oIO();
                                }
/* 123 */                       o0ooOII.I000lI = i0ol0lIArr;
                            } else {
/* 126 */                       iiOoOi1 = iiOoOi13;
/* 128 */                       o0iiliOio = o0iiliOio2;
                            }
/* 130 */                   I0ol0lI i0ol0lI2 = o0ooOII.I000OiO;
/* 132 */                   float f9 = fFloatValue3;
/* 145 */                   if (Ol0i1I.I00000oOI(o0ooOII.I0000Il00O, jI0000oI00) && o0ooOII.I00000oIO == fI00i0ilIl0i && O0000Ioio00.I0000O(o0ooOII.I000II, olOooI0l0011) && O0000Ioio00.I0000O(o0ooOII.I000O01llI0, olOooI0l00112) && o0ooOII.I0000oI00 == fI00i0ilIl0i2) {
/* 175 */                       float f10 = o0ooOII.I00000oOI;
/* 179 */                       if ((f10 != 0.0f && f9 != 0.0f) || (f10 == 0.0f && f9 == 0.0f)) {
/* 197 */                           z = false;
/* 199 */                           f = 2.0f;
/* 201 */                           c = ' ';
                                }
                            } else {
/* 193 */                       float f11 = fI00i0ilIl0i2;
/* 194 */                       f = 2.0f;
/* 208 */                       float fIntBitsToFloat = Float.intBitsToFloat((int) (jI0000oI00 & 4294967295L));
/* 219 */                       float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jI0000oI00 >> 32));
/* 223 */                       int i4 = olOooI0l0011.I0000Il00O;
/* 225 */                       float f12 = olOooI0l0011.I00000oIO;
/* 227 */                       if (!(i4 == 0 && olOooI0l00112.I0000Il00O == 0) && fIntBitsToFloat <= fIntBitsToFloat2) {
/* 245 */                           c = ' ';
/* 251 */                           fMax = Math.max(f12 / 2.0f, olOooI0l00112.I00000oIO / 2.0f);
                                } else {
/* 238 */                           c = ' ';
/* 240 */                           fMax = 0.0f;
                                }
/* 255 */                       o0ooOII.I000o00OoI0I = fMax;
/* 257 */                       i0ol0lI2.I000OOo1O();
/* 262 */                       i0ol0lI2.I0001Ioi1lo(0.0f, 0.0f);
/* 267 */                       if (f9 == 0.0f) {
/* 269 */                           i0ol0lI2.I0000oI00(fIntBitsToFloat2, 0.0f);
/* 272 */                           f2 = fIntBitsToFloat;
/* 274 */                           f3 = 0.0f;
                                } else {
/* 278 */                           float f13 = fI00i0ilIl0i / 2.0f;
/* 282 */                           float f14 = fIntBitsToFloat - f12;
/* 286 */                           float f15 = (fI00i0ilIl0i * 2.0f) + fIntBitsToFloat2;
/* 288 */                           float f16 = f13;
/* 280 */                           float f17 = f13 / 2.0f;
/* 293 */                           while (f16 <= f15) {
/* 302 */                               i0ol0lI2.I00000oIO.quadTo(f17, f14, f16, 0.0f);
/* 305 */                               f16 += f13;
/* 306 */                               f17 += f13;
/* 309 */                               f14 *= -1.0f;
/* 310 */                               f11 = f11;
/* 312 */                               fIntBitsToFloat = fIntBitsToFloat;
                                    }
/* 315 */                           f2 = fIntBitsToFloat;
/* 317 */                           f3 = 0.0f;
                                }
/* 275 */                       float f18 = f11;
/* 336 */                       i0ol0lI2.I000OiO((Float.floatToRawIntBits(f3) << c) | (Float.floatToRawIntBits(f2 / 2.0f) & 4294967295L));
/* 339 */                       i0olIil0.I00000oOI(i0ol0lI2);
/* 344 */                       float length2 = i0olIil0.I00000oIO.getLength();
/* 348 */                       OOo0IO oOo0IOI0000O = i0ol0lI2.I0000O();
/* 362 */                       o0ooOII.I000OOo1O = length2 / ((oOo0IOI0000O.I0000Il00O - oOo0IOI0000O.I00000oIO) + 1.0E-8f);
/* 366 */                       o0ooOII.I0000Il00O = jI0000oI00;
/* 368 */                       o0ooOII.I00000oIO = fI00i0ilIl0i;
/* 370 */                       o0ooOII.I000II = olOooI0l0011;
/* 372 */                       o0ooOII.I000O01llI0 = olOooI0l00112;
/* 376 */                       o0ooOII.I0000oI00 = f18;
/* 378 */                       z = true;
                            }
/* 391 */                   if (Ol0i1I.I00000oOI(o0ooOII.I0000Il00O, 9205357640488583168L)) {
/* 852 */                       I000II.I000iOII("updateDrawPaths was called before updateFullPaths");
                            } else {
/* 393 */                       I0ol0lI[] i0ol0lIArr2 = o0ooOII.I000lI;
/* 399 */                       if (i0ol0lIArr2.length == fArrI010o0o0oO.length / 2) {
/* 401 */                           if (z || !Arrays.equals(o0ooOII.I0000O, fArrI010o0o0oO) || o0ooOII.I00000oOI != f9 || o0ooOII.I0001Ioi1lo != fI000II) {
/* 430 */                               float fIntBitsToFloat3 = Float.intBitsToFloat((int) (o0ooOII.I0000Il00O >> c));
/* 443 */                               float fIntBitsToFloat4 = Float.intBitsToFloat((int) (o0ooOII.I0000Il00O & 4294967295L)) / f;
/* 445 */                               float fMin = o0ooOII.I0000oI00;
/* 449 */                               float f19 = fIntBitsToFloat3 - o0ooOII.I000o00OoI0I;
/* 451 */                               i0ol0lI.I000OOo1O();
/* 454 */                               i0ol0lI.I0001Ioi1lo(f19, fIntBitsToFloat4);
/* 459 */                               int length3 = o0ooOII.I000lI.length;
/* 460 */                               int i5 = 0;
/* 462 */                               boolean z2 = false;
/* 463 */                               while (i5 < length3) {
/* 469 */                                   o0ooOII.I000lI[i5].I000OOo1O();
/* 472 */                                   int i6 = i5 * 2;
/* 474 */                                   float f20 = fArrI010o0o0oO[i6];
/* 478 */                                   float f21 = fArrI010o0o0oO[i6 + 1];
/* 480 */                                   float f22 = f20 * fIntBitsToFloat3;
/* 482 */                                   float f23 = f21 * fIntBitsToFloat3;
/* 484 */                                   if (i5 == 0) {
/* 486 */                                       float f24 = o0ooOII.I000o00OoI0I;
/* 498 */                                       fMin = f23 < f24 ? 0.0f : Math.min(f23 - f24, o0ooOII.I0000oI00);
/* 511 */                                       z2 = f23 >= o0ooOII.I000o00OoI0I;
                                            }
/* 513 */                                   float f25 = fIntBitsToFloat3;
/* 515 */                                   float f26 = o0ooOII.I000o00OoI0I;
/* 517 */                                   float f27 = f25 - f26;
/* 526 */                                   float f28 = f23 < f26 ? f26 : f23;
/* 530 */                                   if (f28 > f27) {
/* 532 */                                       f28 = f27;
                                            }
/* 536 */                                   if (f22 >= f26) {
/* 539 */                                       f26 = f22;
                                            }
/* 542 */                                   if (f26 <= f27) {
/* 545 */                                       f27 = f26;
                                            }
/* 556 */                                   if (Math.abs(f21 - f20) > 0.0f) {
/* 566 */                                       float f29 = f9 == 0.0f ? 0.0f : o0ooOII.I00000oIO * fI000II;
/* 569 */                                       float f30 = o0ooOII.I000OOo1O;
/* 576 */                                       f5 = fMin;
/* 582 */                                       i0olIil0.I00000oIO((f27 + f29) * f30, f30 * (f28 + f29), o0ooOII.I000lI[i5]);
/* 587 */                                       I0ol0lI i0ol0lI3 = o0ooOII.I000lI[i5];
/* 589 */                                       float[] fArrI00000oOI = O1i010l1l.I00000oOI();
/* 605 */                                       O1i010l1l.I000O01llI0(fArrI00000oOI, f29 > 0.0f ? -f29 : 0.0f, (f8 - f9) * fIntBitsToFloat4);
/* 610 */                                       if (f9 == f8) {
/* 612 */                                           f4 = f9;
                                                } else {
/* 615 */                                           f4 = f9;
/* 619 */                                           O1i010l1l.I0001Ioi1lo(fArrI00000oOI, f8, f4);
                                                }
/* 622 */                                       Matrix matrix = i0ol0lI3.I0000O;
/* 624 */                                       if (matrix == null) {
/* 628 */                                           matrix = new Matrix();
/* 631 */                                           i0ol0lI3.I0000O = matrix;
                                                }
/* 633 */                                       iOIli10iO0I.I00000oIO(matrix, fArrI00000oOI);
/* 640 */                                       i0ol0lI3.I00000oIO.transform(i0ol0lI3.I0000O);
                                            } else {
/* 644 */                                       f4 = f9;
/* 646 */                                       f5 = fMin;
                                            }
/* 657 */                                   float f31 = z2 ? (o0ooOII.I000o00OoI0I * f) + f5 : f5;
/* 659 */                                   float f32 = f28 + f31;
/* 663 */                                   if (f19 > f32) {
/* 671 */                                       i0ol0lI.I0000oI00(Math.max(o0ooOII.I000o00OoI0I, f32), fIntBitsToFloat4);
                                            }
/* 676 */                                   if (f23 > f22) {
/* 682 */                                       float fMax2 = Math.max(o0ooOII.I000o00OoI0I, f27 - f31);
/* 686 */                                       i0ol0lI.I0001Ioi1lo(fMax2, fIntBitsToFloat4);
/* 689 */                                       f19 = fMax2;
                                            }
/* 690 */                                   i5++;
/* 692 */                                   f9 = f4;
/* 694 */                                   fIntBitsToFloat3 = f25;
/* 696 */                                   fMin = f5;
/* 698 */                                   f8 = 1.0f;
                                        }
/* 702 */                               float f33 = f9;
/* 704 */                               float f34 = o0ooOII.I000o00OoI0I;
/* 708 */                               if (f19 > f34) {
/* 710 */                                   i0ol0lI.I0000oI00(f34, fIntBitsToFloat4);
                                        }
/* 717 */                               I1IoiO1l.I000o00OoI0I(fArrI010o0o0oO, o0ooOII.I0000O, 14);
/* 720 */                               o0ooOII.I00000oOI = f33;
/* 722 */                               o0ooOII.I0001Ioi1lo = fI000II;
                                    }
/* 734 */                           float f35 = o0iiliOio.getLayoutDirection() == O0iOOoiioO.I00iOIl ? 0.0f : 180.0f;
/* 736 */                           long jI00lli11 = iIolilIo2.I00lli11();
/* 740 */                           IOO000ilo iOO000ilo = iIolilIo2.I00iiI;
/* 742 */                           long jI001iOo1i0O = iOO000ilo.I001iOo1i0O();
/* 750 */                           iOO000ilo.I0010o().I000II();
                                    try {
/* 757 */                               ((IIOOoll) iOO000ilo.I00iiI).I00OloOo(f35, jI00lli11);
/* 760 */                               IiOoOi1 iiOoOi14 = iiOoOi1;
/* 768 */                               O0iiliOio o0iiliOio3 = o0iiliOio;
/* 771 */                               IilloIOOO0i.I00Io1lO(o0iiliOio3, i0ol0lI, iiOoOi14.I00oI0i, iiOoOi14.I00oIiI10, 52);
/* 774 */                               I0ol0lI[] i0ol0lIArr3 = o0ooOII.I000lI;
/* 776 */                               if (i0ol0lIArr3 != null) {
/* 781 */                                   for (I0ol0lI i0ol0lI4 : i0ol0lIArr3) {
/* 791 */                                       IilloIOOO0i.I00Io1lO(o0iiliOio3, i0ol0lI4, iiOoOi14.I00o101lO, iiOoOi14.I00oII, 52);
                                            }
                                        }
/* 818 */                               iIoOl1.I00000oIO(o0iiliOio3, iiOoOi14.I010o0o0oO()[1], iIolilIo2.I0000oI00(), iiOoOi14.I0100i, o0ooOII.I000o00OoI0I, iiOoOi14.I00oIiI10, iiOoOi14.I00o101lO);
/* 821 */                               IIlIOloOOO.I001IO000(iOO000ilo, jI001iOo1i0O);
/* 824 */                               return ooiIlOl1iI;
                                    } catch (Throwable th) {
/* 827 */                               IIlIOloOOO.I001IO000(iOO000ilo, jI001iOo1i0O);
/* 830 */                               throw th;
                                    }
                                }
/* 845 */                       I000II.I0010I0i(Oi010OO0.I0010o("the given progress fraction pairs do not match the expected number of progress paths to draw. updateDrawPaths called with ", fArrI010o0o0oO.length / 2, " pairs, while there are ", i0ol0lIArr2.length, " expected progress paths."));
                            }
/* 848 */                   return null;
                    }
                }
            }

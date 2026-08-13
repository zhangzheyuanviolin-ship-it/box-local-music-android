            package p000;

            import android.content.Context;
            import android.graphics.Bitmap;
            import android.os.Bundle;
            import android.speech.tts.TextToSpeech;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.UUID;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function3;
            
/* 9 */     public final class O0l0IlolloIO implements Function1 {
                public final int I00iOIl;
                public Object I00iiI;

                public O0l0IlolloIO(O1ol100o0O o1ol100o0O) {
/* 3 */             this.I00iOIl = 16;
/* 8 */             this.I00iiI = o1ol100o0O;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:201:0x05bb  */
                /* JADX WARN: Removed duplicated region for block: B:202:0x05cc  */
                /* JADX WARN: Removed duplicated region for block: B:245:0x069b  */
                /* JADX WARN: Removed duplicated region for block: B:246:0x06ac  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj) {
                    O0l0i1O o0l0i1O;
                    O0l0i1O o0l0i1O2;
                    O0o00O1Oi00 o0o00O1Oi00;
                    O0o00O1Oi00 o0o00O1Oi002;
                    IilloIOOO0i iilloIOOO0i;
                    float f;
                    char c;
                    int i;
                    int i2;
                    Bundle bundle;
                    Bundle[] bundleArr;
                    Throwable th;
/* 5 */             int i3 = this.I00iOIl;
/* 11 */            float f2 = 0.0f;
/* 12 */            char c2 = ' ';
/* 14 */            int i4 = 0;
/* 14 */            int iI000II = 0;
/* 15 */            Throwable th2 = null;
/* 16 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i3) {
                        case 0:
/* 1764 */                  return Integer.valueOf(((I0oiil10Ili) this.I00iiI).I000iOII(((Integer) obj).intValue()));
                        case 1:
/* 1592 */                  O0l101IIlOI0 o0l101IIlOI0 = (O0l101IIlOI0) this.I00iiI;
/* 1600 */                  float f3 = -((Float) obj).floatValue();
/* 1603 */                  if ((f3 >= 0.0f || o0l101IIlOI0.I0000O()) && (f3 <= 0.0f || o0l101IIlOI0.I00000oOI())) {
/* 1631 */                      if (Math.abs(o0l101IIlOI0.I000II) > 0.5f) {
/* 1634 */                          Ioll0IliO1l.I0000Il00O("entered drag with non-zero pending scroll");
                                }
/* 1639 */                      float f4 = o0l101IIlOI0.I000II + f3;
/* 1640 */                      o0l101IIlOI0.I000II = f4;
/* 1648 */                      if (Math.abs(f4) > 0.5f) {
/* 1650 */                          float f5 = o0l101IIlOI0.I000II;
/* 1652 */                          int iI000II2 = O1OooO0IlOo.I000II(f5);
/* 1668 */                          O0l0i1O o0l0i1OI000O01llI0 = ((O0l0i1O) o0l101IIlOI0.I0000oI00.getValue()).I000O01llI0(iI000II2, !o0l101IIlOI0.I00000oOI);
/* 1672 */                          if (o0l0i1OI000O01llI0 == null || (o0l0i1O2 = o0l101IIlOI0.I0000Il00O) == null) {
/* 1689 */                              o0l0i1O = o0l0i1OI000O01llI0;
/* 1690 */                              if (o0l0i1O != null) {
/* 1694 */                                  o0l101IIlOI0.I0001Ioi1lo(o0l0i1O, o0l101IIlOI0.I00000oOI, true);
/* 1699 */                                  o0l101IIlOI0.I0010I0i.setValue(ooiIlOl1iI);
/* 1705 */                                  o0l101IIlOI0.I000O01llI0(f5 - o0l101IIlOI0.I000II, o0l0i1O);
                                        } else {
/* 1709 */                                  O0iiOioolIi o0iiOioolIi = o0l101IIlOI0.I000OiO;
/* 1711 */                                  if (o0iiOioolIi != null) {
/* 1713 */                                      o0iiOioolIi.I000iOII();
                                            }
/* 1723 */                                  o0l101IIlOI0.I000O01llI0(f5 - o0l101IIlOI0.I000II, o0l101IIlOI0.I000II());
                                        }
                                    } else {
/* 1678 */                              O0l0i1O o0l0i1OI000O01llI02 = o0l0i1O2.I000O01llI0(iI000II2, true);
/* 1682 */                              if (o0l0i1OI000O01llI02 != null) {
/* 1684 */                                  o0l101IIlOI0.I0000Il00O = o0l0i1OI000O01llI02;
/* 1689 */                                  o0l0i1O = o0l0i1OI000O01llI0;
/* 1690 */                                  if (o0l0i1O != null) {
                                            }
                                        } else {
/* 1687 */                                  o0l0i1O = null;
/* 1690 */                                  if (o0l0i1O != null) {
                                            }
                                        }
                                    }
                                }
/* 1734 */                      if (Math.abs(o0l101IIlOI0.I000II) > 0.5f) {
/* 1740 */                          f3 -= o0l101IIlOI0.I000II;
/* 1741 */                          o0l101IIlOI0.I000II = 0.0f;
                                }
/* 1736 */                      f2 = f3;
                            }
/* 1745 */                  return Float.valueOf(-f2);
                        case 2:
/* 1572 */                  O0li1O o0li1O = (O0li1O) this.I00iiI;
/* 1580 */                  I0IOIo0 i0IOIo0 = new I0IOIo0(20);
/* 1583 */                  i0IOIo0.I00000oOI = o0li1O;
/* 1585 */                  VarHandle.storeStoreFence();
/* 1588 */                  return i0IOIo0;
                        case 3:
/* 1553 */                  O0ll1IIi o0ll1IIi = (O0ll1IIi) this.I00iiI;
/* 1561 */                  I0IOIo0 i0IOIo02 = new I0IOIo0(22);
/* 1564 */                  i0IOIo02.I00000oOI = o0ll1IIi;
/* 1566 */                  VarHandle.storeStoreFence();
/* 1569 */                  return i0IOIo02;
                        case 4:
/* 1543 */                  Object obj2 = this.I00iiI;
/* 1547 */                  ((Integer) obj).getClass();
/* 1550 */                  return obj2;
                        case 5:
/* 1528 */                  O0looo o0looo = (O0looo) this.I00iiI;
/* 1538 */                  return o0looo.I010OIo1l(((Integer) obj).intValue(), o0looo.I00iio);
                        case 6:
/* 1364 */                  O0o0I1i0O o0o0I1i0O = (O0o0I1i0O) this.I00iiI;
/* 1372 */                  float f6 = -((Float) obj).floatValue();
/* 1375 */                  if ((f6 >= 0.0f || o0o0I1i0O.I0000O()) && (f6 <= 0.0f || o0o0I1i0O.I00000oOI())) {
/* 1403 */                      if (Math.abs(o0o0I1i0O.I000O01llI0) > 0.5f) {
/* 1407 */                          Ioll0IliO1l.I0000Il00O("entered drag with non-zero pending scroll");
                                }
/* 1411 */                      o0o0I1i0O.I0000O = true;
/* 1415 */                      float f7 = o0o0I1i0O.I000O01llI0 + f6;
/* 1416 */                      o0o0I1i0O.I000O01llI0 = f7;
/* 1424 */                      if (Math.abs(f7) > 0.5f) {
/* 1426 */                          float f8 = o0o0I1i0O.I000O01llI0;
/* 1428 */                          int iRound = Math.round(f8);
/* 1444 */                          O0o00O1Oi00 o0o00O1Oi00I000O01llI0 = ((O0o00O1Oi00) o0o0I1i0O.I0001Ioi1lo.getValue()).I000O01llI0(iRound, !o0o0I1i0O.I00000oOI);
/* 1448 */                          if (o0o00O1Oi00I000O01llI0 == null || (o0o00O1Oi002 = o0o0I1i0O.I0000Il00O) == null) {
/* 1465 */                              o0o00O1Oi00 = o0o00O1Oi00I000O01llI0;
/* 1466 */                              if (o0o00O1Oi00 != null) {
/* 1470 */                                  o0o0I1i0O.I000II(o0o00O1Oi00, o0o0I1i0O.I00000oOI, true);
/* 1475 */                                  o0o0I1i0O.I001i1O0Ol.setValue(ooiIlOl1iI);
/* 1481 */                                  o0o0I1i0O.I000iOII(f8 - o0o0I1i0O.I000O01llI0, o0o00O1Oi00);
                                        } else {
/* 1485 */                                  O0iiOioolIi o0iiOioolIi2 = o0o0I1i0O.I000l1;
/* 1487 */                                  if (o0iiOioolIi2 != null) {
/* 1489 */                                      o0iiOioolIi2.I000iOII();
                                            }
/* 1499 */                                  o0o0I1i0O.I000iOII(f8 - o0o0I1i0O.I000O01llI0, o0o0I1i0O.I000OiO());
                                        }
                                    } else {
/* 1454 */                              O0o00O1Oi00 o0o00O1Oi00I000O01llI02 = o0o00O1Oi002.I000O01llI0(iRound, true);
/* 1458 */                              if (o0o00O1Oi00I000O01llI02 != null) {
/* 1460 */                                  o0o0I1i0O.I0000Il00O = o0o00O1Oi00I000O01llI02;
/* 1465 */                                  o0o00O1Oi00 = o0o00O1Oi00I000O01llI0;
/* 1466 */                                  if (o0o00O1Oi00 != null) {
                                            }
                                        } else {
/* 1463 */                                  o0o00O1Oi00 = null;
/* 1466 */                                  if (o0o00O1Oi00 != null) {
                                            }
                                        }
                                    }
                                }
/* 1510 */                      if (Math.abs(o0o0I1i0O.I000O01llI0) > 0.5f) {
/* 1516 */                          f6 -= o0o0I1i0O.I000O01llI0;
/* 1517 */                          o0o0I1i0O.I000O01llI0 = 0.0f;
                                }
/* 1512 */                      f2 = f6;
                            }
/* 1521 */                  return Float.valueOf(-f2);
                        case 7:
/* 1346 */                  OiIiol10 oiIiol10 = (OiIiol10) this.I00iiI;
/* 1356 */                  return Boolean.valueOf(oiIiol10 != null ? oiIiol10.I0000Il00O(obj) : true);
                        case 8:
/* 1341 */                  return ((IIoIloi0) this.I00iiI).I000lI;
                        case 9:
/* 1124 */                  I0oO00o i0oO00o = (I0oO00o) this.I00iiI;
/* 1128 */                  IilloIOOO0i iilloIOOO0i2 = (IilloIOOO0i) obj;
/* 1130 */                  Bitmap bitmap = i0oO00o.I00000oIO;
/* 1132 */                  float width = bitmap.getWidth();
/* 1137 */                  float height = bitmap.getHeight();
/* 1149 */                  float fIntBitsToFloat = Float.intBitsToFloat((int) (iilloIOOO0i2.I0000oI00() >> 32));
/* 1160 */                  float fIntBitsToFloat2 = Float.intBitsToFloat((int) (iilloIOOO0i2.I0000oI00() & 4294967295L));
/* 1175 */                  float f9 = width / height > fIntBitsToFloat / fIntBitsToFloat2 ? fIntBitsToFloat2 / height : fIntBitsToFloat / width;
/* 1182 */                  float f10 = (width - (fIntBitsToFloat / f9)) / 2.0f;
/* 1186 */                  float f11 = (height - (fIntBitsToFloat2 / f9)) / 2.0f;
/* 1331 */                  IilloIOOO0i.I00Ol1ll1(iilloIOOO0i2, i0oO00o, (((int) Float.intBitsToFloat((int) (((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L)) >> 32))) << 32) | (((int) Float.intBitsToFloat((int) (((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L)) & 4294967295L))) & 4294967295L), (((int) ((r6 + f10) - f10)) << 32) | (((int) ((r5 + f11) - f11)) & 4294967295L), (((int) Float.intBitsToFloat((int) (((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)) >> 32))) << 32) | (((int) Float.intBitsToFloat((int) (((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)) & 4294967295L))) & 4294967295L), (((int) (fIntBitsToFloat - 0.0f)) << 32) | (((int) (fIntBitsToFloat2 - 0.0f)) & 4294967295L), 0.0f, null, 0, 992);
/* 1334 */                  return ooiIlOl1iI;
                        case 10:
/* 1111 */                  ((Function3) this.I00iiI).invoke((String) obj, Boolean.FALSE, null);
/* 1114 */                  return ooiIlOl1iI;
                        case 11:
/* 1085 */                  TextToSpeech textToSpeech = (TextToSpeech) this.I00iiI;
/* 1093 */                  I0IOIo0 i0IOIo03 = new I0IOIo0(23);
/* 1096 */                  i0IOIo03.I00000oOI = textToSpeech;
/* 1098 */                  VarHandle.storeStoreFence();
/* 1101 */                  return i0IOIo03;
                        case 12:
/* 1078 */                  return ((O1OlO1OoolI) this.I00iiI).I0000O(((Integer) obj).intValue());
                        case 13:
/* 1064 */                  Oil0Io.I0000O((Oil0O0I) obj, "Toggle " + ((O1i1OolO) this.I00iiI).I001i1O0Ol());
/* 1067 */                  return ooiIlOl1iI;
                        case 14:
/* 1022 */                  O1i0iliilI o1i0iliilI = (O1i0iliilI) this.I00iiI;
/* 1036 */                  ((IoO10oI0o) obj).I0000Il00O.I00ll1(o1i0iliilI.I0010o(), o1i0iliilI.I00111O());
/* 1039 */                  return ooiIlOl1iI;
                        case 15:
/* 1016 */                  ((Oi11lOiIoi) obj).I0000Il00O(((Number) ((IolIOll) this.I00iiI).I00iio.getValue()).floatValue());
/* 1019 */                  return ooiIlOl1iI;
                        case 16:
/* 869 */                   O1ol100o0O o1ol100o0O = (O1ol100o0O) this.I00iiI;
/* 873 */                   OlO0OIIl1 olO0OIIl1 = o1ol100o0O.I000O01llI0;
/* 875 */                   OOli1O oOli1O = o1ol100o0O.I000OOo1O;
/* 887 */                   int iIndexOf = ((O1oiOloOo) oOli1O.I00iOIl.getValue()).I000O01llI0.indexOf((String) obj);
/* 891 */                   if (iIndexOf >= 0) {
/* 907 */                       ArrayList arrayList = new ArrayList(((O1oiOloOo) oOli1O.I00iOIl.getValue()).I000O01llI0);
/* 910 */                       arrayList.remove(iIndexOf);
                                while (true) {
/* 913 */                           Object value = olO0OIIl1.getValue();
/* 958 */                           ArrayList arrayList2 = arrayList;
/* 968 */                           if (olO0OIIl1.I000iOII(value, O1oiOloOo.I00000oIO((O1oiOloOo) olO0OIIl1.getValue(), null, null, null, null, false, null, null, arrayList2, 0L, 0L, null, 0.0f, null, null, false, 32639))) {
/* 970 */                               Ii1liIllli0 ii1liIllli0 = o1ol100o0O.I0000Il00O;
/* 978 */                               List list = ((O1oiOloOo) olO0OIIl1.getValue()).I000O01llI0;
/* 980 */                               ii1liIllli0.getClass();
/* 990 */                               iOi1IOoIO0l.I00000oOI(new Ii1O001loIoO(ii1liIllli0, list, null, 6));
                                    } else {
/* 994 */                               arrayList = arrayList2;
                                    }
                                }
                            }
/* 997 */                   return ooiIlOl1iI;
                        case 17:
/* 650 */                   Bitmap bitmap2 = (Bitmap) this.I00iiI;
/* 653 */                   IilloIOOO0i iilloIOOO0i3 = (IilloIOOO0i) obj;
/* 667 */                   float fIntBitsToFloat3 = Float.intBitsToFloat((int) (iilloIOOO0i3.I0000oI00() >> 32)) / 512.0f;
/* 670 */                   int[] iArr = new int[262144];
/* 683 */                   bitmap2.getPixels(iArr, 0, Barcode.FORMAT_UPC_A, 0, 0, Barcode.FORMAT_UPC_A, Barcode.FORMAT_UPC_A);
/* 687 */                   int i5 = Barcode.FORMAT_UPC_A;
/* 693 */                   int i6 = 4;
/* 694 */                   IooO0oO00I iooO0oO00II000II = lIiioliIlo.I000II(lIiioliIlo.I000O01llI0(0, Barcode.FORMAT_UPC_A), 4);
/* 698 */                   int i7 = iooO0oO00II000II.I00iOIl;
/* 700 */                   int i8 = iooO0oO00II000II.I00iiI;
/* 702 */                   int i9 = iooO0oO00II000II.I00iiO;
/* 704 */                   if ((i9 > 0 && i7 <= i8) || (i9 < 0 && i8 <= i7)) {
                                while (true) {
/* 716 */                           IooO0oO00I iooO0oO00II000II2 = lIiioliIlo.I000II(lIiioliIlo.I000O01llI0(i4, i5), i6);
/* 720 */                           int i10 = iooO0oO00II000II2.I00iOIl;
/* 722 */                           int i11 = iooO0oO00II000II2.I00iiI;
/* 724 */                           int i12 = iooO0oO00II000II2.I00iiO;
/* 726 */                           if ((i12 <= 0 || i10 > i11) && (i12 >= 0 || i11 > i10)) {
/* 842 */                               iilloIOOO0i = iilloIOOO0i3;
/* 843 */                               f = fIntBitsToFloat3;
/* 845 */                               c = c2;
                                    } else {
                                        while (true) {
/* 750 */                                   if (((iArr[(i7 * Barcode.FORMAT_UPC_A) + i10] >> 16) & 255) < 128) {
/* 767 */                                       c = c2;
/* 774 */                                       IilloIOOO0i iilloIOOO0i4 = iilloIOOO0i3;
/* 775 */                                       f = fIntBitsToFloat3;
/* 782 */                                       long jFloatToRawIntBits = (Float.floatToRawIntBits(i10 * fIntBitsToFloat3) << c) | (Float.floatToRawIntBits(i7 * fIntBitsToFloat3) & 4294967295L);
/* 786 */                                       float f12 = 4.0f * f;
/* 802 */                                       long jFloatToRawIntBits2 = (Float.floatToRawIntBits(f12) << c) | (Float.floatToRawIntBits(f12) & 4294967295L);
/* 812 */                                       i = i10;
/* 813 */                                       i2 = i11;
/* 815 */                                       iilloIOOO0i = iilloIOOO0i4;
/* 816 */                                       IilloIOOO0i.I00ilI0I1(iilloIOOO0i, iiO01ll11o1l.I00000oOI(1728000819), jFloatToRawIntBits, jFloatToRawIntBits2, 0.0f, null, 0, 120);
                                            } else {
/* 820 */                                       f = fIntBitsToFloat3;
/* 822 */                                       c = c2;
/* 824 */                                       i = i10;
/* 825 */                                       iilloIOOO0i = iilloIOOO0i3;
/* 826 */                                       i2 = i11;
                                            }
/* 827 */                                   if (i != i2) {
/* 830 */                                       i11 = i2;
/* 831 */                                       iilloIOOO0i3 = iilloIOOO0i;
/* 832 */                                       c2 = c;
/* 829 */                                       i10 = i + i12;
/* 839 */                                       fIntBitsToFloat3 = f;
                                            }
                                        }
                                    }
/* 852 */                           if (i7 != i8) {
/* 854 */                               i7 += i9;
/* 855 */                               iilloIOOO0i3 = iilloIOOO0i;
/* 856 */                               c2 = c;
/* 858 */                               fIntBitsToFloat3 = f;
/* 860 */                               i5 = Barcode.FORMAT_UPC_A;
/* 862 */                               i6 = 4;
/* 863 */                               i4 = 0;
                                    }
                                }
                            }
/* 866 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_PINKY:
/* 612 */                   O1loIO o1loIO = (O1loIO) this.I00iiI;
/* 616 */                   float fFloatValue = ((Float) obj).floatValue();
/* 620 */                   OlO0OIIl1 olO0OIIl12 = o1loIO.I00000oOI;
/* 643 */                   olO0OIIl12.I000lI(null, O1loIIIOiO.I00000oIO((O1loIIIOiO) olO0OIIl12.getValue(), null, null, 0, null, fFloatValue, false, null, false, 239));
/* 646 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_INDEX:
/* 593 */                   O1o10Iiio o1o10Iiio = (O1o10Iiio) this.I00iiI;
/* 601 */                   I0IOIo0 i0IOIo04 = new I0IOIo0(25);
/* 604 */                   i0IOIo04.I00000oOI = o1o10Iiio;
/* 606 */                   VarHandle.storeStoreFence();
/* 609 */                   return i0IOIo04;
                        case PoseLandmark.RIGHT_INDEX:
/* 587 */                   ((O1o0l0ilo) this.I00iiI).I00000oIO.add((I0I0i1) obj);
/* 590 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_THUMB:
/* 559 */                   O1o1lI0I o1o1lI0I = (O1o1lI0I) this.I00iiI;
/* 563 */                   o1o1lI0I.show();
/* 570 */                   I0IOIo0 i0IOIo05 = new I0IOIo0(26);
/* 573 */                   i0IOIo05.I00000oOI = o1o1lI0I;
/* 575 */                   VarHandle.storeStoreFence();
/* 578 */                   return i0IOIo05;
                        case PoseLandmark.RIGHT_THUMB:
/* 553 */                   Oil0Io.I0000O((Oil0O0I) obj, ((OloIl1l1oOii) this.I00iiI).I00000oOI);
/* 556 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_HIP:
/* 541 */                   ((OI1I0OoOl) this.I00iiI).I00000oOI(null);
/* 544 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_HIP:
/* 194 */                   Bundle bundle2 = (Bundle) obj;
/* 196 */                   OI1o1o1iO1l oI1o1o1iO1lI00000oIO = l1iOI0.I00000oIO((Context) this.I00iiI);
/* 200 */                   if (bundle2 != null) {
/* 208 */                       bundle2.setClassLoader(oI1o1o1iO1lI00000oIO.I00000oIO.getClassLoader());
                            }
/* 211 */                   OI1i0llli oI1i0llli = oI1o1o1iO1lI00000oIO.I00000oOI;
/* 213 */                   LinkedHashMap linkedHashMap = oI1i0llli.I000lI;
/* 215 */                   if (bundle2 == null) {
/* 217 */                       th = null;
                            } else {
/* 227 */                       if (bundle2.containsKey("android-support-nav:controller:navigatorState")) {
/* 229 */                           bundle = bundle2.getBundle("android-support-nav:controller:navigatorState");
/* 233 */                           if (bundle == null) {
/* 236 */                               lO0iIII0.I00000oIO("android-support-nav:controller:navigatorState");
/* 239 */                               throw null;
                                    }
                                } else {
/* 240 */                           bundle = null;
                                }
/* 241 */                       oI1i0llli.I0000O = bundle;
/* 251 */                       if (bundle2.containsKey("android-support-nav:controller:backStack")) {
/* 265 */                           ArrayList parcelableArrayList = bundle2.getParcelableArrayList("android-support-nav:controller:backStack", ((IOIO10iOi1) OOoOl0i.I00000oIO.I00000oOI(Bundle.class)).I001l0I00());
/* 269 */                           if (parcelableArrayList == null) {
/* 280 */                               lO0iIII0.I00000oIO("android-support-nav:controller:backStack");
/* 283 */                               throw null;
                                    }
/* 277 */                           bundleArr = (Bundle[]) parcelableArrayList.toArray(new Bundle[0]);
                                } else {
/* 284 */                           bundleArr = null;
                                }
/* 285 */                       oI1i0llli.I0000oI00 = bundleArr;
/* 287 */                       linkedHashMap.clear();
/* 296 */                       if (bundle2.containsKey("android-support-nav:controller:backStackDestIds") && bundle2.containsKey("android-support-nav:controller:backStackIds")) {
/* 306 */                           int[] intArray = bundle2.getIntArray("android-support-nav:controller:backStackDestIds");
/* 310 */                           if (intArray == null) {
/* 376 */                               lO0iIII0.I00000oIO("android-support-nav:controller:backStackDestIds");
/* 379 */                               throw null;
                                    }
/* 312 */                           ArrayList<String> stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:backStackIds");
/* 316 */                           if (stringArrayList == null) {
/* 370 */                               lO0iIII0.I00000oIO("android-support-nav:controller:backStackIds");
/* 373 */                               throw null;
                                    }
/* 318 */                           int length = intArray.length;
/* 319 */                           int i13 = 0;
/* 320 */                           int i14 = 0;
/* 321 */                           while (i13 < length) {
/* 325 */                               int i15 = i14 + 1;
/* 333 */                               Throwable th3 = th2;
/* 356 */                               oI1i0llli.I000l1.put(Integer.valueOf(intArray[i13]), !O0000Ioio00.I0000O(stringArrayList.get(i14), "") ? (String) stringArrayList.get(i14) : th3);
/* 359 */                               i13++;
/* 361 */                               i14 = i15;
/* 362 */                               th2 = th3;
                                    }
                                }
/* 365 */                       th = th2;
/* 386 */                       if (bundle2.containsKey("android-support-nav:controller:backStackStates")) {
/* 388 */                           ArrayList<String> stringArrayList2 = bundle2.getStringArrayList("android-support-nav:controller:backStackStates");
/* 392 */                           if (stringArrayList2 == null) {
/* 494 */                               lO0iIII0.I00000oIO("android-support-nav:controller:backStackStates");
/* 497 */                               throw th;
                                    }
/* 402 */                           for (String str : stringArrayList2) {
/* 428 */                               if (bundle2.containsKey("android-support-nav:controller:backStackStates:" + str)) {
/* 430 */                                   String strI000o00OoI0I = IIl001iO0Io.I000o00OoI0I("android-support-nav:controller:backStackStates:", str);
/* 446 */                                   ArrayList parcelableArrayList2 = bundle2.getParcelableArrayList(strI000o00OoI0I, ((IOIO10iOi1) OOoOl0i.I00000oIO.I00000oOI(Bundle.class)).I001l0I00());
/* 450 */                                   if (parcelableArrayList2 == null) {
/* 490 */                                       lO0iIII0.I00000oIO(strI000o00OoI0I);
/* 493 */                                       throw th;
                                            }
/* 458 */                                   I1Il0loi i1Il0loi = new I1Il0loi(parcelableArrayList2.size());
/* 461 */                                   Iterator it = parcelableArrayList2.iterator();
/* 469 */                                   while (it.hasNext()) {
/* 482 */                                       i1Il0loi.addLast(new OI1Oo1O((Bundle) it.next()));
                                            }
/* 486 */                                   linkedHashMap.put(str, i1Il0loi);
                                        }
                                    }
                                }
                            }
/* 498 */                   if (bundle2 != null) {
/* 502 */                       boolean z = bundle2.getBoolean("android-support-nav:controller:deepLinkHandled", false);
/* 518 */                       Boolean boolValueOf = (z || !bundle2.getBoolean("android-support-nav:controller:deepLinkHandled", true)) ? Boolean.valueOf(z) : th;
/* 528 */                       oI1o1o1iO1lI00000oIO.I0000oI00 = boolValueOf != 0 ? boolValueOf.booleanValue() : false;
                            }
/* 530 */                   return oI1o1o1iO1lI00000oIO;
                        case PoseLandmark.LEFT_KNEE:
/* 144 */                   IiloOlIoIool iiloOlIoIool = (IiloOlIoIool) this.I00iiI;
/* 146 */                   IiIooOOOI iiIooOOOI = (IiIooOOOI) obj;
/* 154 */                   float fI000II = ((OIooO1iiliI) iiloOlIoIool.I00000oOI.I000l1).I000II();
/* 162 */                   if (!Float.isNaN(fI000II)) {
/* 164 */                       iI000II = O1OooO0IlOo.I000II(fI000II);
                            } else if (!iiloOlIoIool.I0000Il00O()) {
/* 182 */                       iI000II = -iiIooOOOI.I00l0OO0IO(IiloOO1o.I00000oIO);
                            }
/* 185 */                   return IooO0O.I00000oIO(iI000II << 32);
                        case PoseLandmark.RIGHT_KNEE:
/* 138 */                   ((OII11i) this.I00iiI).I00000oIO.setValue((OII1I1oi) obj);
/* 141 */                   return ooiIlOl1iI;
                        case 27:
/* 52 */                    OII1Il1IlOO oII1Il1IlOO = (OII1Il1IlOO) this.I00iiI;
/* 54 */                    OI1OloOIO1O oI1OloOIO1O = (OI1OloOIO1O) obj;
/* 56 */                    OI1Oo1II110 oI1Oo1II110 = oI1OloOIO1O.I00ioIO;
/* 58 */                    OI1ilOI1ioo0 oI1ilOI1ioo0 = oI1OloOIO1O.I00iiI;
/* 60 */                    if (oI1ilOI1ioo0 == null) {
/* 63 */                        oI1ilOI1ioo0 = null;
                            }
/* 64 */                    if (oI1ilOI1ioo0 == null) {
/* 15 */                        return null;
                            }
/* 67 */                    oI1Oo1II110.I00000oIO();
/* 70 */                    OI1ilOI1ioo0 oI1ilOI1ioo0I0000Il00O = oII1Il1IlOO.I0000Il00O(oI1ilOI1ioo0);
/* 74 */                    if (oI1ilOI1ioo0I0000Il00O == null) {
/* 15 */                        return null;
                            }
/* 81 */                    if (oI1ilOI1ioo0I0000Il00O.equals(oI1ilOI1ioo0)) {
/* 83 */                        return oI1OloOIO1O;
                            }
/* 85 */                    OI1Ooo oI1OooI00000oOI = oII1Il1IlOO.I00000oOI();
/* 93 */                    Bundle bundleI00000oOI = oI1ilOI1ioo0I0000Il00O.I00000oOI(oI1Oo1II110.I00000oIO());
/* 99 */                    OI1i0llli oI1i0llli2 = oI1OooI00000oOI.I000O01llI0.I00000oOI;
/* 125 */                   return new OI1OloOIO1O(oI1i0llli2.I00000oIO.I0000Il00O, oI1ilOI1ioo0I0000Il00O, bundleI00000oOI, oI1i0llli2.I000O01llI0(), oI1i0llli2.I000oI1ioi, UUID.randomUUID().toString(), null);
                        case PoseLandmark.RIGHT_ANKLE:
/* 45 */                    return Boolean.valueOf(((OII1OIO) obj).I00000oOI == ((OI0Iol1O) this.I00iiI));
                        default:
/* 27 */                    ((OI0oiiIO0) this.I00iiI).I00000oOI((O1ooIoIolOli) obj);
/* 30 */                    return Boolean.TRUE;
                    }
                }

/* 10 */        public O0l0IlolloIO(int i) {
/* 11 */            this.I00iOIl = i;
                }
            }

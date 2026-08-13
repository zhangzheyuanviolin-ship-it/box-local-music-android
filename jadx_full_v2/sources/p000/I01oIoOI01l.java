            package p000;

            import android.app.RemoteAction;
            import android.content.Context;
            import android.content.Intent;
            import android.graphics.Canvas;
            import android.graphics.drawable.Drawable;
            import android.media.Image;
            import android.net.Uri;
            import android.os.Bundle;
            import android.speech.tts.TextToSpeech;
            import android.view.textclassifier.TextClassification;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.google.mlkit.vision.common.InputImage;
            import com.google.mlkit.vision.facemesh.FaceMeshDetector;
            import com.google.mlkit.vision.pose.PoseDetector;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class I01oIoOI01l implements Function1 {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;
                public Object I00iio;

                public I01oIoOI01l(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final Object invoke(Object obj) throws Exception {
                    Uri data;
                    long j;
                    long jFloatToRawIntBits;
                    float f;
                    IIolOo iIolOo;
                    IOii1l iOii1l;
                    IOii1l iOii1l2;
                    IOii1l iOii1l3;
                    Uri data2;
                    Iillo1il11l iillo1il11l;
/* 3 */             int i = this.I00iOIl;
/* 5 */             Iilloo0IOoIo iilloo0IOoIo = IlIl1I110o0I.I00000oIO;
/* 7 */             int i2 = 17;
/* 9 */             int i3 = 10;
/* 20 */            int i4 = 4;
/* 25 */            int i5 = 2;
/* 28 */            int i6 = 3;
/* 31 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 37 */            int i7 = 1;
/* 38 */            boolean zBooleanValue = false;
/* 38 */            boolean z = false;
/* 38 */            boolean z2 = false;
/* 38 */            boolean z3 = false;
/* 38 */            boolean z4 = false;
/* 38 */            boolean z5 = false;
/* 38 */            boolean z6 = false;
/* 39 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 2810 */                  O0oiOi o0oiOi = (O0oiOi) this.I00iiI;
/* 2814 */                  Function1 function1 = (Function1) this.I00iiO;
/* 2818 */                  IllOOo00lI illOOo00lI = (IllOOo00lI) this.I00iio;
/* 2826 */                  I01oi1lO0O1o i01oi1lO0O1o = new I01oi1lO0O1o(z2 ? 1 : 0);
/* 2829 */                  i01oi1lO0O1o.I00iiI = function1;
/* 2831 */                  VarHandle.storeStoreFence();
/* 2838 */                  o0oiOi.I000iOII().I00li1OI(i01oi1lO0O1o);
/* 2843 */                  I01oiO0OI0 i01oiO0OI0 = new I01oiO0OI0(z ? 1 : 0);
/* 2846 */                  i01oiO0OI0.I00000oOI = illOOo00lI;
/* 2848 */                  i01oiO0OI0.I0000Il00O = o0oiOi;
/* 2850 */                  i01oiO0OI0.I0000O = i01oi1lO0O1o;
/* 2852 */                  VarHandle.storeStoreFence();
/* 2855 */                  return i01oiO0OI0;
                        case 1:
/* 2803 */                  iOi1II01i0.I0000O((Ii0110) this.I00iiI, null, null, new I0O0io1loiOO((Ol1OlloIO) this.I00iiO, (String) this.I00iio, null, 0), 3);
/* 2806 */                  return ooiIlOl1iI;
                        case 2:
/* 2715 */                  Oooio0iiI0 oooio0iiI0 = (Oooio0iiI0) this.I00iiI;
/* 2719 */                  O0iiOioolIi o0iiOioolIi = (O0iiOioolIi) this.I00iiO;
/* 2723 */                  Oooio0iiI0 oooio0iiI02 = (Oooio0iiI0) this.I00iio;
/* 2733 */                  IIolOo iIolOoI0010o = ((IilloIOOO0i) obj).I00iiI().I0010o();
/* 2745 */                  if (oooio0iiI0.I00iiI.getVisibility() != 8) {
/* 2748 */                      oooio0iiI0.I00oli = true;
/* 2750 */                      OIlO000O01 oIlO000O01 = o0iiOioolIi.I00o0iI0io1;
/* 2760 */                      I0lio1O01i01 i0lio1O01i01 = oIlO000O01 instanceof I0lio1O01i01 ? (I0lio1O01i01) oIlO000O01 : null;
/* 2761 */                      if (i0lio1O01i01 != null) {
/* 2763 */                          Canvas canvas = I0lO01i00oi.I00000oIO;
/* 2767 */                          Canvas canvas2 = ((I0lIooIo1) iIolOoI0010o).I00000oIO;
/* 2771 */                          if (i0lio1O01i01.I010ioo != null) {
/* 2773 */                              oooio0iiI02.draw(canvas2);
                                    }
                                }
/* 2777 */                      oooio0iiI0.I00oli = false;
                            }
/* 2779 */                  return ooiIlOl1iI;
                        case 3:
/* 2692 */                  IlliIl1l11O illiIl1l11O = (IlliIl1l11O) this.I00iiI;
/* 2696 */                  String str = (String) this.I00iiO;
/* 2704 */                  String str2 = (String) obj;
/* 2706 */                  ((OI10i0Il) this.I00iio).setValue(str2);
/* 2709 */                  illiIl1l11O.invoke(str, str2);
/* 2712 */                  return ooiIlOl1iI;
                        case 4:
/* 2601 */                  I1iOI11ioi1 i1iOI11ioi1 = (I1iOI11ioi1) this.I00iiI;
/* 2606 */                  Context context = (Context) this.I00iiO;
/* 2611 */                  O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) this.I00iio;
/* 2617 */                  Intent intent = ((I0IIOOO1O) obj).I00iiI;
/* 2619 */                  if (intent != null && (data = intent.getData()) != null) {
/* 2628 */                      OlO0OIIl1 olO0OIIl1 = i1iOI11ioi1.I00000oOI;
/* 2669 */                      olO0OIIl1.I000lI(null, I1iO1loOII1.I00000oIO((I1iO1loOII1) olO0OIIl1.getValue(), I1iIll0i.I00iiO, 0, null, 0, null, null, null, null, null, 0.0f, "Decoding audio…", null, 1022));
/* 2672 */                      IOO11li1OoII iOO11li1OoIII00000oIO = OooiooIOO.I00000oIO(i1iOI11ioi1);
/* 2676 */                      IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 2686 */                      iOi1II01i0.I0000O(iOO11li1OoIII00000oIO, Ii1oo1ooill0.I00iiI, null, new I0iOI0o1i(i1iOI11ioi1, context, data, o1oIOiI11o0, (IOoil1iiIilo) null), 2);
                            }
/* 2689 */                  return ooiIlOl1iI;
                        case 5:
/* 2552 */                  Function1 function12 = (Function1) this.I00iiO;
/* 2556 */                  OI10i0Il oI10i0Il = (OI10i0Il) this.I00iiI;
/* 2560 */                  OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00iio;
/* 2564 */                  Oo0OI01Il oo0OI01Il = (Oo0OI01Il) obj;
/* 2566 */                  oI10i0Il.setValue(oo0OI01Il);
/* 2579 */                  boolean zI0000O = O0000Ioio00.I0000O((String) oI10i0Il2.getValue(), oo0OI01Il.I00000oIO.I00iiI);
/* 2583 */                  I1111OO10i i1111OO10i = oo0OI01Il.I00000oIO;
/* 2587 */                  oI10i0Il2.setValue(i1111OO10i.I00iiI);
/* 2590 */                  if (!zI0000O) {
/* 2594 */                      function12.invoke(i1111OO10i.I00iiI);
                            }
/* 2597 */                  return ooiIlOl1iI;
                        case 6:
/* 2546 */                  iOi1II01i0.I0000O((Ii0110) this.I00iiI, null, null, new I00oIiI10((IliI0101O0Oi) obj, (OI10i0Il) this.I00iiO, (Oo1o1iil) this.I00iio, null, 13), 3);
/* 2549 */                  return ooiIlOl1iI;
                        case 7:
/* 2479 */                  String str3 = (String) this.I00iiI;
/* 2483 */                  Ii0110 ii0110 = (Ii0110) this.I00iiO;
/* 2487 */                  Oo1o1iil oo1o1iil = (Oo1o1iil) this.I00iio;
/* 2497 */                  I01ii1IIl i01ii1IIl = new I01ii1IIl(17);
/* 2500 */                  i01ii1IIl.I00iiI = ii0110;
/* 2502 */                  i01ii1IIl.I00iiO = oo1o1iil;
/* 2504 */                  VarHandle.storeStoreFence();
/* 2507 */                  O0O00I1Ili[] o0O00I1IliArr = Oil0Io.I00000oIO;
/* 2516 */                  ((Oil0O0I) obj).I00000oOI(Oiioi1IoIIli.I0000Il00O, new I01lOOlO0o(str3, i01ii1IIl));
/* 2519 */                  return ooiIlOl1iI;
                        case 8:
/* 2444 */                  Ii0110 ii01102 = (Ii0110) this.I00iiI;
/* 2448 */                  OI10i0Il oI10i0Il3 = (OI10i0Il) this.I00iiO;
/* 2460 */                  oI10i0Il3.setValue(Boolean.TRUE);
/* 2463 */                  ((OI10i0Il) this.I00iio).setValue((String) obj);
/* 2473 */                  iOi1II01i0.I0000O(ii01102, null, null, new II01OoOI1(oI10i0Il3, null, 0), 3);
/* 2476 */                  return ooiIlOl1iI;
                        case 9:
/* 2130 */                  I1ii1o0 i1ii1o0 = (I1ii1o0) this.I00iiI;
/* 2134 */                  OiI101I1oIi oiI101I1oIi = (OiI101I1oIi) this.I00iiO;
/* 2139 */                  III11l1I iII11l1I = (III11l1I) this.I00iio;
/* 2143 */                  IilloIOOO0i iilloIOOO0i = (IilloIOOO0i) obj;
/* 2155 */                  float fFloatValue = Float.valueOf(((Oli0o0o1) i1ii1o0.I00iiO).I00iOIl).floatValue();
/* 2166 */                  float f2 = fFloatValue < 0.0f ? 0.0f : fFloatValue;
/* 2167 */                  float f3 = f2 / 2.0f;
/* 2169 */                  float f4 = f2 * 2.0f;
/* 2187 */                  float fMin = Math.min(Math.abs(oiI101I1oIi.I00000oOI()), Math.abs(oiI101I1oIi.I00000oIO()));
/* 2191 */                  float f5 = oiI101I1oIi.I00000oIO;
/* 2193 */                  float f6 = oiI101I1oIi.I00000oOI;
/* 2202 */                  boolean z7 = f4 > fMin;
/* 2204 */                  long j2 = oiI101I1oIi.I0000oI00;
/* 2214 */                  OlOooI0l0011 olOooI0l0011 = new OlOooI0l0011(f2, 0.0f, 0, 0, null, 30);
/* 2217 */                  if (z7) {
/* 2263 */                      IilloIOOO0i.I00ol1(iilloIOOO0i, iII11l1I, (Float.floatToRawIntBits(f6) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32), (Float.floatToRawIntBits(oiI101I1oIi.I00000oOI()) << 32) | (Float.floatToRawIntBits(oiI101I1oIi.I00000oIO()) & 4294967295L), j2, 0.0f, null, null, 240);
                            } else if (Float.intBitsToFloat((int) (j2 >> 32)) < f3) {
/* 2280 */                      float f7 = f5 + f2;
/* 2282 */                      float f8 = f6 + f2;
/* 2286 */                      float f9 = oiI101I1oIi.I0000Il00O - f2;
/* 2290 */                      float f10 = oiI101I1oIi.I0000O - f2;
/* 2292 */                      IOO000ilo iOO000iloI00iiI = iilloIOOO0i.I00iiI();
/* 2296 */                      long jI001iOo1i0O = iOO000iloI00iiI.I001iOo1i0O();
/* 2304 */                      iOO000iloI00iiI.I0010o().I000II();
                                try {
/* 2315 */                          ((IIOOoll) iOO000iloI00iiI.I00iiI).I00IlilI0i0i(f7, f8, f9, f10, 0);
                                    try {
/* 2366 */                              IilloIOOO0i.I00ol1(iilloIOOO0i, iII11l1I, (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L), (Float.floatToRawIntBits(oiI101I1oIi.I00000oOI()) << 32) | (Float.floatToRawIntBits(oiI101I1oIi.I00000oIO()) & 4294967295L), j2, 0.0f, null, null, 240);
/* 2371 */                              IIlIOloOOO.I001IO000(iOO000iloI00iiI, jI001iOo1i0O);
                                    } catch (Throwable th) {
/* 2375 */                              th = th;
/* 2376 */                              j = jI001iOo1i0O;
/* 2381 */                              IIlIOloOOO.I001IO000(iOO000iloI00iiI, j);
/* 2384 */                              throw th;
                                    }
                                } catch (Throwable th2) {
/* 2379 */                          th = th2;
/* 2380 */                          j = jI001iOo1i0O;
                                }
                            } else {
/* 2438 */                      IilloIOOO0i.I00ol1(iilloIOOO0i, iII11l1I, (Float.floatToRawIntBits(f5 + f3) << 32) | (Float.floatToRawIntBits(f6 + f3) & 4294967295L), (Float.floatToRawIntBits(oiI101I1oIi.I00000oIO() - f2) & 4294967295L) | (Float.floatToRawIntBits(oiI101I1oIi.I00000oOI() - f2) << 32), iOi0i1l1i0IO.I00000oIO(f3, j2), 0.0f, olOooI0l0011, null, 208);
                            }
/* 2441 */                  return ooiIlOl1iI;
                        case 10:
/* 1968 */                  I1ii1o0 i1ii1o02 = (I1ii1o0) this.I00iiI;
/* 1972 */                  OOo0IO oOo0IO = (OOo0IO) this.I00iiO;
/* 1974 */                  float f11 = oOo0IO.I00000oOI;
/* 1976 */                  float f12 = oOo0IO.I0000O;
/* 1978 */                  float f13 = oOo0IO.I00000oIO;
/* 1980 */                  float f14 = oOo0IO.I0000Il00O;
/* 1986 */                  III11l1I iII11l1I2 = (III11l1I) this.I00iio;
/* 1990 */                  IilloIOOO0i iilloIOOO0i2 = (IilloIOOO0i) obj;
/* 2002 */                  float fFloatValue2 = Float.valueOf(((Oli0o0o1) i1ii1o02.I00iiO).I00iOIl).floatValue();
/* 2013 */                  float f15 = fFloatValue2 < 0.0f ? 0.0f : fFloatValue2;
/* 2038 */                  boolean z8 = f15 * 2.0f > Math.min(Math.abs(f14 - f13), Math.abs(f12 - f11));
/* 2039 */                  if (z8) {
/* 2041 */                      jFloatToRawIntBits = oOo0IO.I0000oI00();
                            } else {
/* 2048 */                      float f16 = f15 / 2.0f;
/* 2067 */                      jFloatToRawIntBits = (Float.floatToRawIntBits(f16 + f11) & 4294967295L) | (Float.floatToRawIntBits(f13 + f16) << 32);
                            }
/* 2124 */                  IilloIOOO0i.I00oII(iilloIOOO0i2, iII11l1I2, jFloatToRawIntBits, z8 ? oOo0IO.I0000O() : (Float.floatToRawIntBits((f14 - f13) - f15) << 32) | (Float.floatToRawIntBits((f12 - f11) - f15) & 4294967295L), 0.0f, z8 ? iilloo0IOoIo : new OlOooI0l0011(f15, 0.0f, 0, 0, null, 30), null, 0, 104);
/* 2127 */                  return ooiIlOl1iI;
                        case 11:
/* 1864 */                  IOoO1ol1 iOoO1ol1 = (IOoO1ol1) this.I00iiI;
/* 1868 */                  O010OIi o010OIi = (O010OIi) this.I00iiO;
/* 1872 */                  OiOol0il0il oiOol0il0il = (OiOol0il0il) this.I00iio;
/* 1878 */                  float fFloatValue3 = ((Float) obj).floatValue();
/* 1884 */                  f = iOoO1ol1.I00o101lO ? 1.0f : -1.0f;
/* 1890 */                  Oii00o1ll oii00o1ll = iOoO1ol1.I00o0l1o1o0;
/* 1896 */                  long jI0001Ioi1lo = oii00o1ll.I0001Ioi1lo(oii00o1ll.I000OOo1O(f * fFloatValue3));
/* 1900 */                  Oii00o1ll oii00o1ll2 = oiOol0il0il.I00000oIO;
/* 1917 */                  float fI000O01llI0 = oii00o1ll.I000O01llI0(oii00o1ll.I0001Ioi1lo(oii00o1ll2.I0000O(oii00o1ll2.I000iOII, jI0001Ioi1lo, 1))) * f;
/* 1928 */                  if (Math.abs(fI000O01llI0) < Math.abs(fFloatValue3)) {
/* 1962 */                      o010OIi.I000II(ilIiOIi0I.I00000oIO("Scroll animation cancelled because scroll was not consumed (" + fI000O01llI0 + " < " + fFloatValue3 + ")", null));
                            }
/* 1965 */                  return ooiIlOl1iI;
                        case 12:
/* 1506 */                  O0oIlOolIO o0oIlOolIO = (O0oIlOolIO) this.I00iiI;
/* 1510 */                  Oo0OI01Il oo0OI01Il2 = (Oo0OI01Il) this.I00iiO;
/* 1514 */                  OIOlOI oIOlOI = (OIOlOI) this.I00iio;
/* 1518 */                  IilloIOOO0i iilloIOOO0i3 = (IilloIOOO0i) obj;
/* 1520 */                  Oo0il0olo1l oo0il0olo1lI0000O = o0oIlOolIO.I0000O();
/* 1524 */                  if (oo0il0olo1lI0000O != null) {
/* 1530 */                      IIolOo iIolOoI0010o2 = iilloIOOO0i3.I00iiI().I0010o();
/* 1542 */                      long j3 = ((Oo0lI00l) o0oIlOolIO.I001lIiIIo1O.getValue()).I00000oIO;
/* 1552 */                      long j4 = ((Oo0lI00l) o0oIlOolIO.I001lllioOl.getValue()).I00000oIO;
/* 1554 */                      Oo0iil0o0oI oo0iil0o0oI = oo0il0olo1lI0000O.I00000oIO;
/* 1556 */                      OI0OIIiOi oI0OIIiOi = oo0iil0o0oI.I00000oOI;
/* 1558 */                      Oo0iiO1 oo0iiO1 = oo0iil0o0oI.I00000oIO;
/* 1560 */                      I0oiil10Ili i0oiil10Ili = o0oIlOolIO.I001iOo1i0O;
/* 1562 */                      long j5 = o0oIlOolIO.I001l0I00;
/* 1568 */                      if (!Oo0lI00l.I0000O(j3)) {
/* 1570 */                          i0oiil10Ili.I0010o(j5);
/* 1577 */                          int iI000o00OoI0I = oIOlOI.I000o00OoI0I(Oo0lI00l.I000II(j3));
/* 1585 */                          int iI000o00OoI0I2 = oIOlOI.I000o00OoI0I(Oo0lI00l.I0001Ioi1lo(j3));
/* 1589 */                          if (iI000o00OoI0I != iI000o00OoI0I2) {
/* 1595 */                              iIolOoI0010o2.I0000O(oo0iil0o0oI.I000OiO(iI000o00OoI0I, iI000o00OoI0I2), i0oiil10Ili);
                                    }
                                } else if (!Oo0lI00l.I0000O(j4)) {
/* 1611 */                          IOOiio0i iOOiio0iI00000oIO = IOOiio0i.I00000oIO(oo0iiO1.I00000oOI.I0000O());
/* 1621 */                          if (iOOiio0iI00000oIO.I00000oIO == 16) {
/* 1623 */                              iOOiio0iI00000oIO = null;
                                    }
/* 1629 */                          long j6 = iOOiio0iI00000oIO != null ? iOOiio0iI00000oIO.I00000oIO : IOOiio0i.I00000oOI;
/* 1643 */                          i0oiil10Ili.I0010o(IOOiio0i.I0000Il00O(IOOiio0i.I0000O(j6) * 0.2f, j6));
/* 1650 */                          int iI000o00OoI0I3 = oIOlOI.I000o00OoI0I(Oo0lI00l.I000II(j4));
/* 1658 */                          int iI000o00OoI0I4 = oIOlOI.I000o00OoI0I(Oo0lI00l.I0001Ioi1lo(j4));
/* 1662 */                          if (iI000o00OoI0I3 != iI000o00OoI0I4) {
/* 1668 */                              iIolOoI0010o2.I0000O(oo0iil0o0oI.I000OiO(iI000o00OoI0I3, iI000o00OoI0I4), i0oiil10Ili);
                                    }
                                } else if (!Oo0lI00l.I0000O(oo0OI01Il2.I00000oOI)) {
/* 1680 */                          i0oiil10Ili.I0010o(j5);
/* 1683 */                          long j7 = oo0OI01Il2.I00000oOI;
/* 1689 */                          int iI000o00OoI0I5 = oIOlOI.I000o00OoI0I(Oo0lI00l.I000II(j7));
/* 1697 */                          int iI000o00OoI0I6 = oIOlOI.I000o00OoI0I(Oo0lI00l.I0001Ioi1lo(j7));
/* 1701 */                          if (iI000o00OoI0I5 != iI000o00OoI0I6) {
/* 1707 */                              iIolOoI0010o2.I0000O(oo0iil0o0oI.I000OiO(iI000o00OoI0I5, iI000o00OoI0I6), i0oiil10Ili);
                                    }
                                }
/* 1723 */                      boolean z9 = oo0iil0o0oI.I0000oI00() && oo0iiO1.I0001Ioi1lo != 3;
/* 1724 */                      if (z9) {
/* 1726 */                          long j8 = oo0iil0o0oI.I0000Il00O;
/* 1753 */                          OOo0IO oOo0IOI00000oIO = lIl0looO.I00000oIO(0L, (Float.floatToRawIntBits((int) (j8 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j8 & 4294967295L)) & 4294967295L));
/* 1757 */                          iIolOoI0010o2.I000II();
/* 1760 */                          IIolOo.I00100o1O0lo(iIolOoI0010o2, oOo0IOI00000oIO);
                                }
/* 1765 */                      OlIIi1oIIOlo olIIi1oIIOlo = oo0iiO1.I00000oOI.I00000oIO;
/* 1767 */                      OlooIOI0O olooIOI0O = olIIi1oIIOlo.I000lI;
/* 1769 */                      Oo0OO1I1i oo0OO1I1i = olIIi1oIIOlo.I00000oIO;
/* 1771 */                      if (olooIOI0O == null) {
/* 1773 */                          olooIOI0O = OlooIOI0O.I00000oOI;
                                }
/* 1775 */                      OlooIOI0O olooIOI0O2 = olooIOI0O;
/* 1777 */                      OioOII0oI oioOII0oI = olIIi1oIIOlo.I000o00OoI0I;
/* 1779 */                      if (oioOII0oI == null) {
/* 1781 */                          oioOII0oI = OioOII0oI.I0000O;
                                }
/* 1783 */                      OioOII0oI oioOII0oI2 = oioOII0oI;
/* 1785 */                      Iilloo0IOoIo iilloo0IOoIo2 = olIIi1oIIOlo.I00100l0;
/* 1792 */                      Iilloo0IOoIo iilloo0IOoIo3 = iilloo0IOoIo2 == null ? iilloo0IOoIo : iilloo0IOoIo2;
                                try {
/* 1794 */                          III11l1I iII11l1II00000oOI = oo0OO1I1i.I00000oOI();
/* 1798 */                          Oo0OIIl1i1 oo0OIIl1i1 = Oo0OIIl1i1.I00000oIO;
                                    try {
/* 1800 */                              if (iII11l1II00000oOI != null) {
/* 1810 */                                  iIolOo = iIolOoI0010o2;
/* 1822 */                                  iOIliilOOIIo.I00000oIO(oI0OIIiOi, iIolOo, iII11l1II00000oOI, oo0OO1I1i != oo0OIIl1i1 ? oo0OO1I1i.I0000Il00O() : 1.0f, oioOII0oI2, olooIOI0O2, iilloo0IOoIo3);
                                        } else {
/* 1828 */                                  iIolOo = iIolOoI0010o2;
/* 1846 */                                  OI0OIIiOi.I000OiO(oI0OIIiOi, iIolOo, oo0OO1I1i != oo0OIIl1i1 ? oo0OO1I1i.I00000oIO() : IOOiio0i.I00000oOI, oioOII0oI2, olooIOI0O2, iilloo0IOoIo3, 32);
                                        }
/* 1849 */                              if (z9) {
/* 1851 */                                  iIolOo.I00100l0();
                                        }
                                    } catch (Throwable th3) {
/* 1826 */                              th = th3;
/* 1855 */                              if (z9) {
/* 1857 */                                  iIolOoI0010o2.I00100l0();
                                        }
/* 1860 */                              throw th;
                                    }
                                } catch (Throwable th4) {
/* 1815 */                          th = th4;
                                }
                            }
/* 1861 */                  return ooiIlOl1iI;
                        case 13:
/* 1271 */                  Olol0I1o1IO olol0I1o1IO = (Olol0I1o1IO) this.I00iiI;
/* 1275 */                  Context context2 = (Context) this.I00iiO;
/* 1279 */                  Oloo01 oloo01 = (Oloo01) this.I00iio;
/* 1283 */                  IOoiI000 iOoiI000 = (IOoiI000) obj;
/* 1285 */                  List list = olol0I1o1IO.I00000oIO;
/* 1290 */                  int size = list.size();
/* 1294 */                  int i8 = 0;
/* 1295 */                  while (i8 < size) {
/* 1301 */                      OloilIOlliOi oloilIOlliOi = (OloilIOlliOi) list.get(i8);
/* 1306 */                      if (oloilIOlliOi instanceof OlolOO0oi) {
/* 1310 */                          I00oooO i00oooO = new I00oooO(i2);
/* 1313 */                          OlolOO0oi ololOO0oi = (OlolOO0oi) oloilIOlliOi;
/* 1315 */                          i00oooO.I00iiI = ololOO0oi;
/* 1317 */                          VarHandle.storeStoreFence();
/* 1322 */                          if (ololOO0oi.I0000Il00O == 0) {
/* 1324 */                              iOii1l3 = iOoil1iiIilo;
                                    } else {
/* 1328 */                              IO1O01l iO1O01l = new IO1O01l(i6);
/* 1331 */                              iO1O01l.I00iiI = ololOO0oi;
/* 1333 */                              VarHandle.storeStoreFence();
/* 1341 */                              iOii1l3 = new IOii1l(-1930700965, iO1O01l, true);
                                    }
/* 1346 */                          IO1Io1IOOOIi iO1Io1IOOOIi = new IO1Io1IOOOIi(i4);
/* 1349 */                          iO1Io1IOOOIi.I00iiI = ololOO0oi;
/* 1351 */                          iO1Io1IOOOIi.I00iiO = oloo01;
/* 1353 */                          VarHandle.storeStoreFence();
/* 1356 */                          IOoiI000.I00000oOI(iOoiI000, i00oooO, iOii1l3, iO1Io1IOOOIi, 6);
                                } else if (oloilIOlliOi instanceof Oloo0Oooi) {
/* 1365 */                          Oloo0Oooi oloo0Oooi = (Oloo0Oooi) oloilIOlliOi;
/* 1367 */                          if (context2 != null) {
/* 1371 */                              int i9 = oloo0Oooi.I0000Il00O;
/* 1373 */                              TextClassification textClassification = oloo0Oooi.I00000oOI;
/* 1375 */                              Drawable drawable = oloo0Oooi.I0000O;
/* 1377 */                              if (i9 < 0) {
/* 1381 */                                  Ol0Oo0 ol0Oo0 = new Ol0Oo0(i4);
/* 1384 */                                  ol0Oo0.I00iiI = textClassification;
/* 1386 */                                  VarHandle.storeStoreFence();
/* 1389 */                                  if (drawable != null) {
/* 1393 */                                      OlolIo0O ololIo0O = new OlolIo0O(z4 ? 1 : 0);
/* 1396 */                                      ololIo0O.I00iiI = drawable;
/* 1398 */                                      VarHandle.storeStoreFence();
/* 1406 */                                      iOii1l2 = new IOii1l(-1123224187, ololIo0O, true);
                                            } else {
/* 1410 */                                      iOii1l2 = null;
                                            }
/* 1413 */                                  OlolIi000l ololIi000l = new OlolIi000l(z3 ? 1 : 0);
/* 1416 */                                  ololIi000l.I00iiI = context2;
/* 1418 */                                  ololIi000l.I00iiO = textClassification;
/* 1420 */                                  VarHandle.storeStoreFence();
/* 1423 */                                  IOoiI000.I00000oOI(iOoiI000, ol0Oo0, iOii1l2, ololIi000l, 6);
                                        } else {
/* 1431 */                                  RemoteAction remoteAction = textClassification.getActions().get(i9);
/* 1439 */                                  int i10 = 5;
/* 1440 */                                  Ol0Oo0 ol0Oo02 = new Ol0Oo0(i10);
/* 1443 */                                  ol0Oo02.I00iiI = remoteAction;
/* 1445 */                                  VarHandle.storeStoreFence();
/* 1448 */                                  if (drawable != null) {
/* 1452 */                                      OlolIo0O ololIo0O2 = new OlolIo0O(i7);
/* 1455 */                                      ololIo0O2.I00iiI = drawable;
/* 1457 */                                      VarHandle.storeStoreFence();
/* 1465 */                                      iOii1l = new IOii1l(1106162332, ololIo0O2, true);
                                            } else {
/* 1469 */                                      iOii1l = null;
                                            }
/* 1472 */                                  OlOi0iollo olOi0iollo = new OlOi0iollo(i10);
/* 1475 */                                  olOi0iollo.I00iiI = remoteAction;
/* 1477 */                                  VarHandle.storeStoreFence();
/* 1480 */                                  IOoiI000.I00000oOI(iOoiI000, ol0Oo02, iOii1l, olOi0iollo, 6);
                                        }
                                    }
                                } else if (oloilIOlliOi instanceof Ololoi) {
/* 1492 */                          iOoiI000.I00000oIO.add(i1OliOi0o00o.I00000oOI);
                                }
/* 1495 */                      i8++;
/* 1497 */                      i2 = 17;
/* 1499 */                      i4 = 4;
/* 1500 */                      iOoil1iiIilo = null;
                            }
/* 1503 */                  return ooiIlOl1iI;
                        case 14:
/* 1237 */                  Ol1o0O0O0 ol1o0O0O0 = (Ol1o0O0O0) this.I00iiI;
/* 1241 */                  OI1OloOIO1O oI1OloOIO1O = (OI1OloOIO1O) this.I00iiO;
/* 1245 */                  Iii0iOoIo iii0iOoIo = (Iii0iOoIo) this.I00iio;
/* 1251 */                  ol1o0O0O0.add(oI1OloOIO1O);
/* 1256 */                  I01oiO0OI0 i01oiO0OI02 = new I01oiO0OI0(i5);
/* 1259 */                  i01oiO0OI02.I00000oOI = iii0iOoIo;
/* 1261 */                  i01oiO0OI02.I0000Il00O = oI1OloOIO1O;
/* 1263 */                  i01oiO0OI02.I0000O = ol1o0O0O0;
/* 1265 */                  VarHandle.storeStoreFence();
/* 1268 */                  return i01oiO0OI02;
                        case 15:
/* 1214 */                  O1ol100o0O o1ol100o0O = (O1ol100o0O) this.I00iiI;
/* 1218 */                  OloIl1l1oOii oloIl1l1oOii = (OloIl1l1oOii) this.I00iiO;
/* 1222 */                  O1oIOiI11o0 o1oIOiI11o02 = (O1oIOiI11o0) this.I00iio;
/* 1228 */                  ((Boolean) obj).booleanValue();
/* 1231 */                  o1ol100o0O.I00100o1O0lo(oloIl1l1oOii, o1oIOiI11o02);
/* 1234 */                  return ooiIlOl1iI;
                        case 16:
/* 1034 */                  O1iOIoOiO0 o1iOIoOiO0 = (O1iOIoOiO0) this.I00iiI;
/* 1038 */                  Iill0oiIl0Io iill0oiIl0Io = (Iill0oiIl0Io) this.I00iiO;
/* 1042 */                  OO1I0001000i oO1I0001000i = (OO1I0001000i) this.I00iio;
/* 1046 */                  OO11o0IO oO11o0IO = (OO11o0IO) obj;
/* 1048 */                  boolean zI00OloOo = o1iOIoOiO0.I00OloOo();
/* 1052 */                  I0l1OOl1l10 i0l1OOl1l10 = iill0oiIl0Io.I00o0iI0io1;
/* 1079 */                  float fI0001Ioi1lo = zI00OloOo ? i0l1OOl1l10.I0000Il00O().I0001Ioi1lo(((IiO0o1I) iill0oiIl0Io.I00o0iI0io1.I000iOII).getValue()) : ((OIooO1iiliI) i0l1OOl1l10.I000l1).I000II();
/* 1083 */                  boolean zI00OloOo2 = o1iOIoOiO0.I00OloOo();
/* 1091 */                  if (!Float.isNaN(fI0001Ioi1lo)) {
/* 1101 */                      f = (il0lI1i1olii.I000O01llI0(iill0oiIl0Io).I00oo1iO0ll == O0iOOoiioO.I00iiI && iill0oiIl0Io.I00o101lO == OIilII.I00iiI) ? -1.0f : 1.0f;
/* 1111 */                      OIilII oIilII = iill0oiIl0Io.I00o101lO;
/* 1119 */                      float f17 = oIilII == OIilII.I00iiI ? f * fI0001Ioi1lo : 0.0f;
/* 1127 */                      float f18 = oIilII == OIilII.I00iOIl ? fI0001Ioi1lo : 0.0f;
/* 1129 */                      oO11o0IO.I00iOIl = true;
/* 2 */                         oO11o0IO.I000O01llI0(oO1I0001000i, O1OooO0IlOo.I000II(f17), O1OooO0IlOo.I000II(f18), 0.0f);
/* 1142 */                      oO11o0IO.I00iOIl = false;
/* 1144 */                      return ooiIlOl1iI;
                            }
/* 1147 */                  boolean z10 = iill0oiIl0Io.I00oI0i;
/* 1151 */                  Ii1loIll001 ii1loIll001I0000Il00O = iill0oiIl0Io.I00o0iI0io1.I0000Il00O();
/* 1161 */                  Object value = ((IiO0o1I) iill0oiIl0Io.I00o0iI0io1.I000iOII).getValue();
/* 1165 */                  I0l1i0ioO i0l1i0ioO = new I0l1i0ioO();
/* 1206 */                  i0l1i0ioO.I00iOIl = "AnchoredDraggableState was not initialized correctly. isLookingAhead=" + zI00OloOo2 + ",didLookahead=" + z10 + ",anchors=" + ii1loIll001I0000Il00O + ",targetValue=" + value;
/* 1208 */                  VarHandle.storeStoreFence();
/* 1211 */                  throw i0l1i0ioO;
                        case 17:
/* 980 */                   Ol111O1I ol111O1I = (Ol111O1I) this.I00iiI;
/* 984 */                   IillIill1IO1 iillIill1IO1 = (IillIill1IO1) this.I00iiO;
/* 988 */                   OIilII oIilII2 = (OIilII) this.I00iio;
/* 994 */                   long j9 = ((IilIiOlii) obj).I00000oIO;
/* 1005 */                  long jI000O01llI0 = iillIill1IO1.I010l10O ? OIOlIiiioi.I000O01llI0(-1.0f, j9) : OIOlIiiioi.I000O01llI0(1.0f, j9);
/* 1009 */                  IillI1lo11l0 iillI1lo11l0 = IillIi1.I00000oIO;
/* 1028 */                  ol111O1I.I00000oIO.I00000oIO(Float.intBitsToFloat((int) (oIilII2 == OIilII.I00iOIl ? jI000O01llI0 & 4294967295L : jI000O01llI0 >> 32)));
/* 1031 */                  return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_PINKY:
/* 913 */                   IlI10IO ilI10IO = (IlI10IO) this.I00iiI;
/* 917 */                   OI10i0Il oI10i0Il4 = (OI10i0Il) this.I00iiO;
/* 921 */                   OI10i0Il oI10i0Il5 = (OI10i0Il) this.I00iio;
/* 927 */                   List list2 = ilI10IO.I000II;
/* 929 */                   int size2 = list2.size();
/* 937 */                   I0O11IOOo0OI i0O11IOOo0OI = new I0O11IOOo0OI(9);
/* 940 */                   i0O11IOOo0OI.I00iiI = list2;
/* 942 */                   VarHandle.storeStoreFence();
/* 947 */                   I0O11IOOo0OI i0O11IOOo0OI2 = new I0O11IOOo0OI(i3);
/* 950 */                   i0O11IOOo0OI2.I00iiI = list2;
/* 952 */                   VarHandle.storeStoreFence();
/* 957 */                   IlI0l10lO ilI0l10lO = new IlI0l10lO(z5 ? 1 : 0);
/* 960 */                   ilI0l10lO.I00iiI = list2;
/* 962 */                   ilI0l10lO.I00iiO = oI10i0Il4;
/* 964 */                   ilI0l10lO.I00iio = oI10i0Il5;
/* 966 */                   VarHandle.storeStoreFence();
/* 974 */                   ((O0lolo) obj).I0000oI00(size2, i0O11IOOo0OI, i0O11IOOo0OI2, new IOii1l(802480018, ilI0l10lO, true));
/* 977 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_INDEX:
/* 861 */                   IliIO10oO0 iliIO10oO0 = (IliIO10oO0) this.I00iiI;
/* 865 */                   Ili1ioOlo0oO ili1ioOlo0oO = (Ili1ioOlo0oO) this.I00iio;
/* 869 */                   Function1 function13 = (Function1) this.I00iiO;
/* 873 */                   IliIO10oO0 iliIO10oO02 = (IliIO10oO0) obj;
/* 879 */                   if (!O0000Ioio00.I0000O(iliIO10oO02, iliIO10oO0)) {
/* 888 */                       if (O0000Ioio00.I0000O(iliIO10oO02, ili1ioOlo0oO.I0000Il00O)) {
/* 907 */                           I000II.I001IO000("Focus search landed at the root.");
/* 31 */                            return null;
                                }
/* 896 */                       zBooleanValue = ((Boolean) function13.invoke(iliIO10oO02)).booleanValue();
                            }
/* 900 */                   return Boolean.valueOf(zBooleanValue);
                        case PoseLandmark.RIGHT_INDEX:
/* 777 */                   OI1o1o1iO1l oI1o1o1iO1l = (OI1o1o1iO1l) this.I00iiI;
/* 781 */                   OI10i0Il oI10i0Il6 = (OI10i0Il) this.I00iiO;
/* 785 */                   OI10i0Il oI10i0Il7 = (OI10i0Il) this.I00iio;
/* 789 */                   OloIl1l1oOii oloIl1l1oOii2 = (OloIl1l1oOii) obj;
/* 791 */                   String str4 = oloIl1l1oOii2.I00000oIO;
/* 793 */                   FirebaseAnalytics firebaseAnalyticsI00000oIO = iOIii1ooOi0I.I00000oIO();
/* 797 */                   if (firebaseAnalyticsI00000oIO != null) {
/* 799 */                       Ilo0li0l1[] ilo0li0l1Arr = Ilo0li0l1.I00iOIl;
/* 803 */                       Bundle bundle = new Bundle();
/* 808 */                       bundle.putString("capability_name", str4);
/* 813 */                       firebaseAnalyticsI00000oIO.I00000oIO("capability_select", bundle);
                            }
/* 822 */                   if (oloIl1l1oOii2.I000OiO.isEmpty()) {
/* 824 */                       oI10i0Il6.setValue(oloIl1l1oOii2);
/* 841 */                       OI1o1o1iO1l.I0000Il00O(oI1o1o1iO1l, "route_task_direct/" + str4);
                            } else {
/* 845 */                       oI10i0Il6.setValue(oloIl1l1oOii2);
/* 850 */                       oI10i0Il7.setValue(Boolean.TRUE);
/* 855 */                       OI1o1o1iO1l.I0000Il00O(oI1o1o1iO1l, "model_list");
                            }
/* 858 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_THUMB:
/* 664 */                   Ol1o0O0O0 ol1o0O0O02 = (Ol1o0O0O0) this.I00iiI;
/* 668 */                   OI10i0Il oI10i0Il8 = (OI10i0Il) this.I00iiO;
/* 672 */                   OI10i0Il oI10i0Il9 = (OI10i0Il) this.I00iio;
/* 676 */                   O0lolo o0lolo = (O0lolo) obj;
/* 678 */                   int size3 = ol1o0O0O02.size();
/* 686 */                   I0O11IOOo0OI i0O11IOOo0OI3 = new I0O11IOOo0OI(11);
/* 689 */                   i0O11IOOo0OI3.I00iiI = ol1o0O0O02;
/* 691 */                   VarHandle.storeStoreFence();
/* 696 */                   IO1O0O io1o0o = new IO1O0O(i7);
/* 699 */                   io1o0o.I00iiI = ol1o0O0O02;
/* 701 */                   VarHandle.storeStoreFence();
/* 709 */                   o0lolo.I0000oI00(size3, null, i0O11IOOo0OI3, new IOii1l(802480018, io1o0o, true));
/* 722 */                   if (((String) oI10i0Il8.getValue()).length() > 0) {
/* 726 */                       I0O1IiI i0O1IiI = new I0O1IiI(i3);
/* 729 */                       i0O1IiI.I00iiI = oI10i0Il8;
/* 731 */                       VarHandle.storeStoreFence();
/* 742 */                       O0lolo.I0000O(o0lolo, null, new IOii1l(-1406554939, i0O1IiI, true), 3);
                            }
/* 755 */                   if (((Boolean) oI10i0Il9.getValue()).booleanValue() && ((String) oI10i0Il8.getValue()).length() == 0) {
/* 771 */                       O0lolo.I0000O(o0lolo, null, i1i0IooiOOI.I00IoiI, 3);
                            }
/* 774 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_THUMB:
/* 544 */                   FaceMeshDetector faceMeshDetector = (FaceMeshDetector) this.I00iiI;
/* 548 */                   OI10i0Il oI10i0Il10 = (OI10i0Il) this.I00iiO;
/* 552 */                   OI10i0Il oI10i0Il11 = (OI10i0Il) this.I00iio;
/* 556 */                   IoiO1IO1I1i ioiO1IO1I1i = (IoiO1IO1I1i) obj;
/* 558 */                   Image imageI00ll1 = ioiO1IO1I1i.I00ll1();
/* 562 */                   if (imageI00ll1 != null) {
/* 568 */                       int iI0000Il00O = ioiO1IO1I1i.I00i0oil().I0000Il00O();
/* 581 */                       int iI0000O = (iI0000Il00O == 90 || iI0000Il00O == 270) ? ioiO1IO1I1i.I0000O() : ioiO1IO1I1i.I0001Ioi1lo();
/* 594 */                       int iI0001Ioi1lo = (iI0000Il00O == 90 || iI0000Il00O == 270) ? ioiO1IO1I1i.I0001Ioi1lo() : ioiO1IO1I1i.I0000O();
/* 602 */                       OloIIoII1oo oloIIoII1ooProcess = faceMeshDetector.process(InputImage.fromMediaImage(imageI00ll1, iI0000Il00O));
/* 608 */                       IloIil1iOi iloIil1iOi = new IloIil1iOi(z6 ? 1 : 0);
/* 611 */                       iloIil1iOi.I00iiI = iI0000O;
/* 613 */                       iloIil1iOi.I00iiO = iI0001Ioi1lo;
/* 615 */                       iloIil1iOi.I00iio = oI10i0Il10;
/* 617 */                       iloIil1iOi.I00ilI0I1 = oI10i0Il11;
/* 619 */                       VarHandle.storeStoreFence();
/* 626 */                       I0IOIlIOIII i0IOIlIOIII = new I0IOIlIOIII(12);
/* 629 */                       i0IOIlIOIII.I00iiI = iloIil1iOi;
/* 631 */                       VarHandle.storeStoreFence();
/* 634 */                       o0IiOl o0iiol = (o0IiOl) oloIIoII1ooProcess;
/* 636 */                       o0iiol.getClass();
/* 641 */                       o0iiol.I0000oI00(OloIo0oOIO0.I00000oIO, i0IOIlIOIII);
/* 646 */                       IloIii0l0o iloIii0l0o = new IloIii0l0o(2);
/* 649 */                       iloIii0l0o.I00iiI = ioiO1IO1I1i;
/* 651 */                       VarHandle.storeStoreFence();
/* 654 */                       o0iiol.I000OiO(iloIii0l0o);
                            } else {
/* 658 */                       ioiO1IO1I1i.close();
                            }
/* 661 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_HIP:
/* 424 */                   PoseDetector poseDetector = (PoseDetector) this.I00iiI;
/* 428 */                   OI10i0Il oI10i0Il12 = (OI10i0Il) this.I00iiO;
/* 432 */                   OI10i0Il oI10i0Il13 = (OI10i0Il) this.I00iio;
/* 436 */                   IoiO1IO1I1i ioiO1IO1I1i2 = (IoiO1IO1I1i) obj;
/* 438 */                   Image imageI00ll12 = ioiO1IO1I1i2.I00ll1();
/* 442 */                   if (imageI00ll12 != null) {
/* 448 */                       int iI0000Il00O2 = ioiO1IO1I1i2.I00i0oil().I0000Il00O();
/* 461 */                       int iI0000O2 = (iI0000Il00O2 == 90 || iI0000Il00O2 == 270) ? ioiO1IO1I1i2.I0000O() : ioiO1IO1I1i2.I0001Ioi1lo();
/* 474 */                       int iI0001Ioi1lo2 = (iI0000Il00O2 == 90 || iI0000Il00O2 == 270) ? ioiO1IO1I1i2.I0001Ioi1lo() : ioiO1IO1I1i2.I0000O();
/* 482 */                       OloIIoII1oo oloIIoII1ooProcess2 = poseDetector.process(InputImage.fromMediaImage(imageI00ll12, iI0000Il00O2));
/* 488 */                       IloIil1iOi iloIil1iOi2 = new IloIil1iOi(i7);
/* 491 */                       iloIil1iOi2.I00iiI = iI0000O2;
/* 493 */                       iloIil1iOi2.I00iiO = iI0001Ioi1lo2;
/* 495 */                       iloIil1iOi2.I00iio = oI10i0Il12;
/* 497 */                       iloIil1iOi2.I00ilI0I1 = oI10i0Il13;
/* 499 */                       VarHandle.storeStoreFence();
/* 506 */                       I0IOIlIOIII i0IOIlIOIII2 = new I0IOIlIOIII(13);
/* 509 */                       i0IOIlIOIII2.I00iiI = iloIil1iOi2;
/* 511 */                       VarHandle.storeStoreFence();
/* 514 */                       o0IiOl o0iiol2 = (o0IiOl) oloIIoII1ooProcess2;
/* 516 */                       o0iiol2.getClass();
/* 521 */                       o0iiol2.I0000oI00(OloIo0oOIO0.I00000oIO, i0IOIlIOIII2);
/* 526 */                       IloIii0l0o iloIii0l0o2 = new IloIii0l0o(3);
/* 529 */                       iloIii0l0o2.I00iiI = ioiO1IO1I1i2;
/* 531 */                       VarHandle.storeStoreFence();
/* 534 */                       o0iiol2.I000OiO(iloIii0l0o2);
                            } else {
/* 538 */                       ioiO1IO1I1i2.close();
                            }
/* 541 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_HIP:
/* 392 */                   Ii0110 ii01103 = (Ii0110) this.I00iiI;
/* 396 */                   OIooi1iOiOol oIooi1iOiOol = (OIooi1iOiOol) this.I00iiO;
/* 400 */                   IiI0O1Io iiI0O1Io = (IiI0O1Io) this.I00iio;
/* 406 */                   int iIntValue = ((Integer) obj).intValue();
/* 410 */                   oIooi1iOiOol.I000O01llI0(iIntValue);
/* 418 */                   iOi1II01i0.I0000O(ii01103, null, null, new I1oO0ooi001(iiI0O1Io, iIntValue, iOoil1iiIilo, i4), 3);
/* 421 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_KNEE:
/* 334 */                   IoiIII ioiIII = (IoiIII) this.I00iiI;
/* 339 */                   Context context3 = (Context) this.I00iiO;
/* 343 */                   O1ol100o0O o1ol100o0O2 = (O1ol100o0O) this.I00iio;
/* 349 */                   Intent intent2 = ((I0IIOOO1O) obj).I00iiI;
/* 351 */                   if (intent2 != null && (data2 = intent2.getData()) != null) {
/* 362 */                       IoI011li ioI011li = new IoI011li(i5);
/* 365 */                       ioI011li.I00iiI = o1ol100o0O2;
/* 367 */                       VarHandle.storeStoreFence();
/* 370 */                       IOO11li1OoII iOO11li1OoIII00000oIO2 = OooiooIOO.I00000oIO(ioiIII);
/* 374 */                       IiI0oillOO10 iiI0oillOO102 = IiiIil1lOIO.I00000oIO;
/* 386 */                       iOi1II01i0.I0000O(iOO11li1OoIII00000oIO2, Ii1oo1ooill0.I00iiI, null, new I000oI1ioi(ioiIII, context3, data2, ioI011li, (IOoil1iiIilo) null, 11), 2);
                            }
/* 389 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_KNEE:
/* 161 */                   O0iiliOio o0iiliOio = (O0iiliOio) this.I00iiI;
/* 163 */                   IIolilIo iIolilIo = o0iiliOio.I00iOIl;
/* 167 */                   Iillo1il11l iillo1il11l2 = (Iillo1il11l) this.I00iio;
/* 171 */                   Function1 function14 = (Function1) this.I00iiO;
/* 175 */                   IilloIOOO0i iilloIOOO0i4 = (IilloIOOO0i) obj;
/* 177 */                   Iillo1il11l iillo1il11l3 = o0iiliOio.I00iiI;
/* 179 */                   o0iiliOio.I00iiI = iillo1il11l2;
                            try {
/* 185 */                       IiIooOOOI iiIooOOOII001IIilI0O = iilloIOOO0i4.I00iiI().I001IIilI0O();
/* 193 */                       O0iOOoiioO o0iOOoiioOI001i1O0Ol = iilloIOOO0i4.I00iiI().I001i1O0Ol();
/* 201 */                       IIolOo iIolOoI0010o3 = iilloIOOO0i4.I00iiI().I0010o();
/* 209 */                       long jI001iOo1i0O2 = iilloIOOO0i4.I00iiI().I001iOo1i0O();
/* 219 */                       Io10IOI io10IOI = (Io10IOI) iilloIOOO0i4.I00iiI().I00iiO;
/* 223 */                       IiIooOOOI iiIooOOOII001IIilI0O2 = iIolilIo.I00iiI.I001IIilI0O();
/* 229 */                       O0iOOoiioO o0iOOoiioOI001i1O0Ol2 = iIolilIo.I00iiI.I001i1O0Ol();
/* 235 */                       IIolOo iIolOoI0010o4 = iIolilIo.I00iiI.I0010o();
/* 241 */                       long jI001iOo1i0O3 = iIolilIo.I00iiI.I001iOo1i0O();
/* 245 */                       IOO000ilo iOO000ilo = iIolilIo.I00iiI;
                                try {
/* 251 */                           Io10IOI io10IOI2 = (Io10IOI) iOO000ilo.I00iiO;
/* 253 */                           iOO000ilo.I00IioO0OiOi(iiIooOOOII001IIilI0O);
/* 256 */                           iOO000ilo.I00IlilI0i0i(o0iOOoiioOI001i1O0Ol);
/* 259 */                           iOO000ilo.I00IOO(iIolOoI0010o3);
/* 262 */                           iOO000ilo.I00Io1lO(jI001iOo1i0O2);
/* 265 */                           iOO000ilo.I00iiO = io10IOI;
/* 267 */                           iIolOoI0010o3.I000II();
                                    try {
/* 270 */                               function14.invoke(o0iiliOio);
/* 273 */                               iIolOoI0010o3.I00100l0();
/* 276 */                               IOO000ilo iOO000ilo2 = iIolilIo.I00iiI;
/* 278 */                               iOO000ilo2.I00IioO0OiOi(iiIooOOOII001IIilI0O2);
/* 281 */                               iOO000ilo2.I00IlilI0i0i(o0iOOoiioOI001i1O0Ol2);
/* 284 */                               iOO000ilo2.I00IOO(iIolOoI0010o4);
/* 287 */                               iOO000ilo2.I00Io1lO(jI001iOo1i0O3);
/* 290 */                               iOO000ilo2.I00iiO = io10IOI2;
/* 294 */                               o0iiliOio.I00iiI = iillo1il11l3;
/* 296 */                               return ooiIlOl1iI;
                                    } catch (Throwable th5) {
/* 302 */                               iillo1il11l = iillo1il11l3;
                                        try {
/* 304 */                                   iIolOoI0010o3.I00100l0();
/* 307 */                                   IOO000ilo iOO000ilo3 = iIolilIo.I00iiI;
/* 309 */                                   iOO000ilo3.I00IioO0OiOi(iiIooOOOII001IIilI0O2);
/* 312 */                                   iOO000ilo3.I00IlilI0i0i(o0iOOoiioOI001i1O0Ol2);
/* 315 */                                   iOO000ilo3.I00IOO(iIolOoI0010o4);
/* 318 */                                   iOO000ilo3.I00Io1lO(jI001iOo1i0O3);
/* 321 */                                   iOO000ilo3.I00iiO = io10IOI2;
/* 323 */                                   throw th5;
                                        } catch (Throwable th6) {
/* 324 */                                   th = th6;
/* 328 */                                   o0iiliOio.I00iiI = iillo1il11l;
/* 330 */                                   throw th;
                                        }
                                    }
                                } catch (Throwable th7) {
/* 297 */                           th = th7;
/* 298 */                           iillo1il11l = iillo1il11l3;
                                }
                            } catch (Throwable th8) {
/* 326 */                       th = th8;
/* 327 */                       iillo1il11l = iillo1il11l3;
                            }
                        case 27:
/* 149 */                   Void r3 = (Void) obj;
/* 155 */                   ((IOiOol0) this.I00iiI).I00111O((IIoIloi0) this.I00iiO, IOoiioOI.I00000oIO((Context) this.I00iio));
/* 158 */                   return r3;
                        case PoseLandmark.RIGHT_ANKLE:
/* 80 */                    O0oiOi o0oiOi2 = (O0oiOi) this.I00iiI;
/* 84 */                    O0ol0iIl0 o0ol0iIl0 = (O0ol0iIl0) this.I00iio;
/* 88 */                    Function1 function15 = (Function1) this.I00iiO;
/* 96 */                    OOo0ooi oOo0ooi = new OOo0ooi();
/* 101 */                   O0oi0oIO1i o0oi0oIO1i = new O0oi0oIO1i();
/* 104 */                   o0oi0oIO1i.I00iOIl = o0ol0iIl0;
/* 106 */                   o0oi0oIO1i.I00iiI = oOo0ooi;
/* 108 */                   o0oi0oIO1i.I00iiO = function15;
/* 110 */                   VarHandle.storeStoreFence();
/* 117 */                   o0oiOi2.I000iOII().I00li1OI(o0oi0oIO1i);
/* 122 */                   I01oiO0OI0 i01oiO0OI03 = new I01oiO0OI0(i6);
/* 125 */                   i01oiO0OI03.I0000Il00O = o0oiOi2;
/* 127 */                   i01oiO0OI03.I00000oOI = o0oi0oIO1i;
/* 129 */                   i01oiO0OI03.I0000O = oOo0ooi;
/* 131 */                   VarHandle.storeStoreFence();
/* 134 */                   return i01oiO0OI03;
                        default:
/* 46 */                    TextToSpeech textToSpeech = (TextToSpeech) this.I00iiI;
/* 50 */                    IllOOo00lI illOOo00lI2 = (IllOOo00lI) this.I00iio;
/* 54 */                    OI10i0Il oI10i0Il14 = (OI10i0Il) this.I00iiO;
/* 64 */                    if (((Boolean) obj).booleanValue()) {
/* 68 */                        oI10i0Il14.setValue(Boolean.TRUE);
/* 71 */                        textToSpeech.stop();
/* 74 */                        illOOo00lI2.invoke();
                            }
/* 77 */                    return ooiIlOl1iI;
                    }
                }
            }

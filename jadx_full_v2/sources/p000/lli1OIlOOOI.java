            package p000;

            import android.graphics.Bitmap;
            import android.graphics.Point;
            import android.graphics.PointF;
            import android.graphics.Rect;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.mlkit.vision.common.InputImage;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            
            public final class lli1OIlOOOI implements Parcelable.Creator {
                public final int I00000oIO;

                public lli1OIlOOOI(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final Object createFromParcel(Parcel parcel) {
/* 7 */             long jI0010o = 0;
/* 9 */             float fI00100l0 = 0.0f;
                    switch (this.I00000oIO) {
                        case 0:
/* 3036 */                  int iI001i1O0Ol = lO0Iil10.I001i1O0Ol(parcel);
/* 3040 */                  int iI0010I0i = 0;
/* 3041 */                  il0111IIOlo il0111iiolo = null;
/* 3042 */                  iiO010lI1iO iio010li1io = null;
/* 3043 */                  int iI0010I0i2 = 0;
/* 3044 */                  String strI000II = null;
/* 3049 */                  while (parcel.dataPosition() < iI001i1O0Ol) {
/* 3051 */                      int i = parcel.readInt();
/* 3055 */                      char c = (char) i;
/* 3057 */                      if (c == 1) {
/* 3103 */                          iI0010I0i2 = lO0Iil10.I0010I0i(i, parcel);
                                } else if (c == 2) {
/* 3097 */                          iI0010I0i = lO0Iil10.I0010I0i(i, parcel);
                                } else if (c == 3) {
/* 3091 */                          strI000II = lO0Iil10.I000II(i, parcel);
                                } else if (c == 4) {
/* 3087 */                          il0111iiolo = (il0111IIOlo) lO0Iil10.I0001Ioi1lo(parcel, i, il0111IIOlo.CREATOR);
                                } else if (c != 5) {
/* 3068 */                          lO0Iil10.I001IO000(i, parcel);
                                } else {
/* 3078 */                          iio010li1io = (iiO010lI1iO) lO0Iil10.I0001Ioi1lo(parcel, i, iiO010lI1iO.CREATOR);
                                }
                            }
/* 3108 */                  lO0Iil10.I000l1(iI001i1O0Ol, parcel);
/* 3113 */                  ll0oil ll0oilVar = new ll0oil(strI000II);
/* 3116 */                  ll0oilVar.I00iOIl = iI0010I0i2;
/* 3118 */                  ll0oilVar.I00iiI = iI0010I0i;
/* 3120 */                  ll0oilVar.I00iiO = il0111iiolo;
/* 3122 */                  ll0oilVar.I00iio = iio010li1io;
/* 3124 */                  VarHandle.storeStoreFence();
/* 3127 */                  return ll0oilVar;
                        case 1:
/* 2934 */                  int iI001i1O0Ol2 = lO0Iil10.I001i1O0Ol(parcel);
/* 2938 */                  io0oOoOi0o io0ooooi0o = null;
/* 2939 */                  io0oOoOi0o io0ooooi0o2 = null;
/* 2940 */                  String strI000II2 = null;
/* 2941 */                  String strI000II3 = null;
/* 2942 */                  boolean zI000lI = false;
/* 2943 */                  lOiI01[] loii01Arr = null;
/* 2948 */                  while (parcel.dataPosition() < iI001i1O0Ol2) {
/* 2950 */                      int i2 = parcel.readInt();
                                switch ((char) i2) {
                                    case 2:
/* 3007 */                              loii01Arr = (lOiI01[]) lO0Iil10.I000OiO(parcel, i2, lOiI01.CREATOR);
                                        break;
                                    case 3:
/* 2997 */                              io0ooooi0o = (io0oOoOi0o) lO0Iil10.I0001Ioi1lo(parcel, i2, io0oOoOi0o.CREATOR);
                                        break;
                                    case 4:
/* 2988 */                              io0ooooi0o2 = (io0oOoOi0o) lO0Iil10.I0001Ioi1lo(parcel, i2, io0oOoOi0o.CREATOR);
                                        break;
                                    case 5:
/* 2977 */                              strI000II2 = lO0Iil10.I000II(i2, parcel);
                                        break;
                                    case 6:
/* 2972 */                              fI00100l0 = lO0Iil10.I00100l0(i2, parcel);
                                        break;
                                    case 7:
/* 2967 */                              strI000II3 = lO0Iil10.I000II(i2, parcel);
                                        break;
                                    case '\b':
/* 2962 */                              zI000lI = lO0Iil10.I000lI(i2, parcel);
                                        break;
                                    default:
/* 2958 */                              lO0Iil10.I001IO000(i2, parcel);
                                        break;
                                }
                            }
/* 3010 */                  lO0Iil10.I000l1(iI001i1O0Ol2, parcel);
/* 3015 */                  lli0oio0 lli0oio0Var = new lli0oio0();
/* 3018 */                  lli0oio0Var.I00iOIl = loii01Arr;
/* 3020 */                  lli0oio0Var.I00iiI = io0ooooi0o;
/* 3022 */                  lli0oio0Var.I00iiO = io0ooooi0o2;
/* 3024 */                  lli0oio0Var.I00iio = strI000II2;
/* 3026 */                  lli0oio0Var.I00ilI0I1 = fI00100l0;
/* 3028 */                  lli0oio0Var.I00ilO0 = strI000II3;
/* 3030 */                  lli0oio0Var.I00io1l = zI000lI;
/* 3032 */                  VarHandle.storeStoreFence();
/* 3035 */                  return lli0oio0Var;
                        case 2:
/* 2490 */                  int iI001i1O0Ol3 = lO0Iil10.I001i1O0Ol(parcel);
/* 2501 */                  long jI0010o2 = 0;
/* 2502 */                  long jI0010o3 = 0;
/* 2504 */                  long jI0010o4 = 0;
/* 2506 */                  long jI0010o5 = 0;
/* 2494 */                  String strI000II4 = "";
/* 2509 */                  String strI000II5 = strI000II4;
/* 2510 */                  String strI000II6 = strI000II5;
/* 2511 */                  String strI000II7 = strI000II6;
/* 2513 */                  int iI0010I0i3 = 100;
/* 2515 */                  boolean zI000lI2 = true;
/* 2517 */                  boolean zI000lI3 = true;
/* 2519 */                  long jI0010o6 = -2147483648L;
/* 2521 */                  String strI000II8 = null;
/* 2523 */                  String strI000II9 = null;
/* 2525 */                  String strI000II10 = null;
/* 2527 */                  String strI000II11 = null;
/* 2529 */                  String strI000II12 = null;
/* 2531 */                  boolean zI000lI4 = false;
/* 2533 */                  String strI000II13 = null;
/* 2535 */                  int iI0010I0i4 = 0;
/* 2537 */                  boolean zI000lI5 = false;
/* 2539 */                  Boolean boolValueOf = null;
/* 2541 */                  ArrayList arrayListI000OOo1O = null;
/* 2543 */                  String strI000II14 = null;
/* 2545 */                  boolean zI000lI6 = false;
/* 2547 */                  int iI0010I0i5 = 0;
/* 2549 */                  String strI000II15 = null;
/* 2551 */                  int iI0010I0i6 = 0;
/* 2553 */                  long jI0010o7 = 0;
/* 2555 */                  long jI0010o8 = 0;
/* 2556 */                  long jI0010o9 = 0;
/* 2561 */                  while (parcel.dataPosition() < iI001i1O0Ol3) {
/* 2563 */                      int i3 = parcel.readInt();
/* 2567 */                      String str = strI000II6;
                                switch ((char) i3) {
                                    case 2:
/* 2796 */                              strI000II8 = lO0Iil10.I000II(i3, parcel);
                                        break;
                                    case 3:
/* 2790 */                              strI000II9 = lO0Iil10.I000II(i3, parcel);
                                        break;
                                    case 4:
/* 2784 */                              strI000II10 = lO0Iil10.I000II(i3, parcel);
                                        break;
                                    case 5:
/* 2778 */                              strI000II11 = lO0Iil10.I000II(i3, parcel);
                                        break;
                                    case 6:
/* 2772 */                              jI0010o = lO0Iil10.I0010o(i3, parcel);
                                        break;
                                    case 7:
/* 2766 */                              jI0010o7 = lO0Iil10.I0010o(i3, parcel);
                                        break;
                                    case '\b':
/* 2760 */                              strI000II12 = lO0Iil10.I000II(i3, parcel);
                                        break;
                                    case '\t':
/* 2754 */                              zI000lI2 = lO0Iil10.I000lI(i3, parcel);
                                        break;
                                    case '\n':
/* 2748 */                              zI000lI4 = lO0Iil10.I000lI(i3, parcel);
                                        break;
                                    case 11:
/* 2742 */                              strI000II6 = str;
/* 2738 */                              jI0010o6 = lO0Iil10.I0010o(i3, parcel);
                                        continue;
                                    case '\f':
/* 2732 */                              strI000II13 = lO0Iil10.I000II(i3, parcel);
                                        break;
                                    case '\r':
                                    case 17:
                                    case PoseLandmark.LEFT_INDEX:
                                    case PoseLandmark.RIGHT_INDEX:
                                    case PoseLandmark.RIGHT_HIP:
                                    case '!':
                                    default:
/* 2573 */                              lO0Iil10.I001IO000(i3, parcel);
                                        break;
                                    case 14:
/* 2725 */                              jI0010o9 = lO0Iil10.I0010o(i3, parcel);
                                        break;
                                    case 15:
/* 2719 */                              iI0010I0i4 = lO0Iil10.I0010I0i(i3, parcel);
                                        break;
                                    case 16:
/* 2713 */                              zI000lI3 = lO0Iil10.I000lI(i3, parcel);
                                        break;
                                    case PoseLandmark.RIGHT_PINKY:
/* 2707 */                              zI000lI5 = lO0Iil10.I000lI(i3, parcel);
                                        break;
                                    case PoseLandmark.LEFT_THUMB:
/* 2677 */                              int iI001IIilI0O = lO0Iil10.I001IIilI0O(i3, parcel);
/* 2681 */                              if (iI001IIilI0O == 0) {
/* 2683 */                                  boolValueOf = null;
                                            break;
                                        } else {
/* 2687 */                                  lO0Iil10.I001iOo1i0O(parcel, iI001IIilI0O, 4);
/* 2699 */                                  boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                                            break;
                                        }
                                    case PoseLandmark.RIGHT_THUMB:
/* 2672 */                              jI0010o2 = lO0Iil10.I0010o(i3, parcel);
                                        break;
                                    case PoseLandmark.LEFT_HIP:
/* 2667 */                              arrayListI000OOo1O = lO0Iil10.I000OOo1O(i3, parcel);
                                        break;
                                    case PoseLandmark.LEFT_KNEE:
/* 2662 */                              strI000II4 = lO0Iil10.I000II(i3, parcel);
                                        break;
                                    case PoseLandmark.RIGHT_KNEE:
/* 2656 */                              strI000II5 = lO0Iil10.I000II(i3, parcel);
                                        break;
                                    case 27:
/* 2651 */                              strI000II14 = lO0Iil10.I000II(i3, parcel);
                                        break;
                                    case PoseLandmark.RIGHT_ANKLE:
/* 2646 */                              zI000lI6 = lO0Iil10.I000lI(i3, parcel);
                                        break;
                                    case PoseLandmark.LEFT_HEEL:
/* 2641 */                              jI0010o8 = lO0Iil10.I0010o(i3, parcel);
                                        break;
                                    case 30:
/* 2634 */                              iI0010I0i3 = lO0Iil10.I0010I0i(i3, parcel);
                                        break;
                                    case PoseLandmark.LEFT_FOOT_INDEX:
/* 2628 */                              strI000II6 = lO0Iil10.I000II(i3, parcel);
                                        continue;
                                    case ' ':
/* 2623 */                              iI0010I0i5 = lO0Iil10.I0010I0i(i3, parcel);
                                        break;
                                    case '\"':
/* 2618 */                              strI000II6 = str;
/* 2614 */                              jI0010o3 = lO0Iil10.I0010o(i3, parcel);
                                        continue;
                                    case InputImage.IMAGE_FORMAT_YUV_420_888:
/* 2609 */                              strI000II15 = lO0Iil10.I000II(i3, parcel);
                                        break;
                                    case '$':
/* 2602 */                              strI000II7 = lO0Iil10.I000II(i3, parcel);
                                        break;
                                    case '%':
/* 2597 */                              strI000II6 = str;
/* 2593 */                              jI0010o4 = lO0Iil10.I0010o(i3, parcel);
                                        continue;
                                    case '&':
/* 2588 */                              iI0010I0i6 = lO0Iil10.I0010I0i(i3, parcel);
                                        break;
                                    case '\'':
/* 2583 */                              strI000II6 = str;
/* 2579 */                              jI0010o5 = lO0Iil10.I0010o(i3, parcel);
                                        continue;
                                }
/* 2576 */                      strI000II6 = str;
                            }
/* 2804 */                  lO0Iil10.I000l1(iI001i1O0Ol3, parcel);
/* 2809 */                  lli10iI lli10ii = new lli10iI();
/* 2814 */                  lli10ii.I00iOIl = strI000II8;
/* 2818 */                  lli10ii.I00iiI = strI000II9;
/* 2822 */                  lli10ii.I00iiO = strI000II10;
/* 2828 */                  lli10ii.I00l0OO0IO = jI0010o6;
/* 2832 */                  lli10ii.I00iio = strI000II11;
/* 2834 */                  lli10ii.I00ilI0I1 = jI0010o;
/* 2836 */                  lli10ii.I00ilO0 = jI0010o7;
/* 2840 */                  lli10ii.I00io1l = strI000II12;
/* 2844 */                  lli10ii.I00ioIO = zI000lI2;
/* 2848 */                  lli10ii.I00l0I0l0lO1 = zI000lI4;
/* 2852 */                  lli10ii.I00li1OI = strI000II13;
/* 2854 */                  lli10ii.I00ll1 = jI0010o9;
/* 2858 */                  lli10ii.I00lli11 = iI0010I0i4;
/* 2862 */                  lli10ii.I00lll10 = zI000lI3;
/* 2866 */                  lli10ii.I00o0iI0io1 = zI000lI5;
/* 2870 */                  lli10ii.I00o0l1o1o0 = boolValueOf;
/* 2872 */                  lli10ii.I00o101lO = jI0010o2;
/* 2876 */                  lli10ii.I00oI0i = arrayListI000OOo1O;
/* 2878 */                  lli10ii.I00oII = strI000II4;
/* 2880 */                  lli10ii.I00oIiI10 = strI000II5;
/* 2884 */                  lli10ii.I00oO101o = strI000II14;
/* 2888 */                  lli10ii.I00oOio10iI1 = zI000lI6;
/* 2892 */                  lli10ii.I00ol1 = jI0010o8;
/* 2896 */                  lli10ii.I00olI = iI0010I0i3;
/* 2900 */                  lli10ii.I00oli = strI000II6;
/* 2904 */                  lli10ii.I00oliIiO01i = iI0010I0i5;
/* 2908 */                  lli10ii.I00oo1iO0ll = jI0010o3;
/* 2912 */                  lli10ii.I00ooIo0 = strI000II15;
/* 2916 */                  lli10ii.I00ooiO1I = strI000II7;
/* 2920 */                  lli10ii.I00oooO = jI0010o4;
/* 2924 */                  lli10ii.I0100i = iI0010I0i6;
/* 2928 */                  lli10ii.I0100o111I = jI0010o5;
/* 2930 */                  VarHandle.storeStoreFence();
/* 2933 */                  return lli10ii;
                        case 3:
/* 2396 */                  int iI001i1O0Ol4 = lO0Iil10.I001i1O0Ol(parcel);
/* 2400 */                  long jI0010o10 = -1;
/* 2402 */                  int iI0010I0i7 = 0;
/* 2403 */                  boolean zI000lI7 = false;
/* 2404 */                  int iI0010I0i8 = 0;
/* 2405 */                  String strI000II16 = null;
/* 2410 */                  while (parcel.dataPosition() < iI001i1O0Ol4) {
/* 2412 */                      int i4 = parcel.readInt();
/* 2416 */                      char c2 = (char) i4;
/* 2417 */                      if (c2 == 1) {
/* 2451 */                          zI000lI7 = lO0Iil10.I000lI(i4, parcel);
                                } else if (c2 == 2) {
/* 2446 */                          strI000II16 = lO0Iil10.I000II(i4, parcel);
                                } else if (c2 == 3) {
/* 2441 */                          iI0010I0i7 = lO0Iil10.I0010I0i(i4, parcel);
                                } else if (c2 == 4) {
/* 2436 */                          iI0010I0i8 = lO0Iil10.I0010I0i(i4, parcel);
                                } else if (c2 != 5) {
/* 2427 */                          lO0Iil10.I001IO000(i4, parcel);
                                } else {
/* 2431 */                          jI0010o10 = lO0Iil10.I0010o(i4, parcel);
                                }
                            }
/* 2456 */                  lO0Iil10.I000l1(iI001i1O0Ol4, parcel);
/* 2461 */                  lli1IIiI lli1iiii = new lli1IIiI();
/* 2464 */                  lli1iiii.I00iOIl = zI000lI7;
/* 2466 */                  lli1iiii.I00iiI = strI000II16;
/* 2474 */                  lli1iiii.I00iiO = ll1l1lO0Ioil.I00000oIO(iI0010I0i7) - 1;
/* 2482 */                  lli1iiii.I00iio = lili0I1oo.I00000oIO(iI0010I0i8) - 1;
/* 2484 */                  lli1iiii.I00ilI0I1 = jI0010o10;
/* 2486 */                  VarHandle.storeStoreFence();
/* 2489 */                  return lli1iiii;
                        case 4:
/* 2316 */                  int iI001i1O0Ol5 = lO0Iil10.I001i1O0Ol(parcel);
/* 2320 */                  int iI0010I0i9 = 0;
/* 2321 */                  int iI0010I0i10 = 0;
/* 2322 */                  int iI0010I0i11 = 0;
/* 2323 */                  int iI0010I0i12 = 0;
/* 2328 */                  while (parcel.dataPosition() < iI001i1O0Ol5) {
/* 2330 */                      int i5 = parcel.readInt();
/* 2334 */                      char c3 = (char) i5;
/* 2335 */                      if (c3 == 1) {
/* 2369 */                          iI0010I0i10 = lO0Iil10.I0010I0i(i5, parcel);
                                } else if (c3 == 2) {
/* 2364 */                          iI0010I0i9 = lO0Iil10.I0010I0i(i5, parcel);
                                } else if (c3 == 3) {
/* 2359 */                          iI0010I0i11 = lO0Iil10.I0010I0i(i5, parcel);
                                } else if (c3 == 4) {
/* 2354 */                          iI0010I0i12 = lO0Iil10.I0010I0i(i5, parcel);
                                } else if (c3 != 5) {
/* 2345 */                          lO0Iil10.I001IO000(i5, parcel);
                                } else {
/* 2349 */                          jI0010o = lO0Iil10.I0010o(i5, parcel);
                                }
                            }
/* 2374 */                  lO0Iil10.I000l1(iI001i1O0Ol5, parcel);
/* 2379 */                  lo1oIIiO lo1oiiio = new lo1oIIiO();
/* 2382 */                  lo1oiiio.I00iOIl = iI0010I0i10;
/* 2384 */                  lo1oiiio.I00iiI = iI0010I0i9;
/* 2386 */                  lo1oiiio.I00iiO = iI0010I0i11;
/* 2388 */                  lo1oiiio.I00iio = iI0010I0i12;
/* 2390 */                  lo1oiiio.I00ilI0I1 = jI0010o;
/* 2392 */                  VarHandle.storeStoreFence();
/* 2395 */                  return lo1oiiio;
                        case 5:
/* 2270 */                  int iI001i1O0Ol6 = lO0Iil10.I001i1O0Ol(parcel);
/* 2274 */                  int iI0010I0i13 = 0;
/* 2275 */                  ArrayList arrayListI000iOII = null;
/* 2280 */                  while (parcel.dataPosition() < iI001i1O0Ol6) {
/* 2282 */                      int i6 = parcel.readInt();
/* 2286 */                      char c4 = (char) i6;
/* 2287 */                      if (c4 == 1) {
/* 2302 */                          iI0010I0i13 = lO0Iil10.I0010I0i(i6, parcel);
                                } else if (c4 != 2) {
/* 2291 */                          lO0Iil10.I001IO000(i6, parcel);
                                } else {
/* 2297 */                          arrayListI000iOII = lO0Iil10.I000iOII(parcel, i6, PointF.CREATOR);
                                }
                            }
/* 2307 */                  lO0Iil10.I000l1(iI001i1O0Ol6, parcel);
/* 2312 */                  return new loI0OlIOo(iI0010I0i13, arrayListI000iOII);
                        case 6:
/* 2189 */                  int iI001i1O0Ol7 = lO0Iil10.I001i1O0Ol(parcel);
/* 2193 */                  int iI0010I0i14 = 0;
/* 2194 */                  int iI0010I0i15 = 0;
/* 2195 */                  int iI0010I0i16 = 0;
/* 2196 */                  boolean zI000lI8 = false;
/* 2197 */                  int iI0010I0i17 = 0;
/* 2202 */                  while (parcel.dataPosition() < iI001i1O0Ol7) {
/* 2204 */                      int i7 = parcel.readInt();
                                switch ((char) i7) {
                                    case 1:
/* 2241 */                              iI0010I0i17 = lO0Iil10.I0010I0i(i7, parcel);
                                        break;
                                    case 2:
/* 2236 */                              iI0010I0i14 = lO0Iil10.I0010I0i(i7, parcel);
                                        break;
                                    case 3:
/* 2231 */                              iI0010I0i15 = lO0Iil10.I0010I0i(i7, parcel);
                                        break;
                                    case 4:
/* 2226 */                              iI0010I0i16 = lO0Iil10.I0010I0i(i7, parcel);
                                        break;
                                    case 5:
/* 2221 */                              zI000lI8 = lO0Iil10.I000lI(i7, parcel);
                                        break;
                                    case 6:
/* 2216 */                              fI00100l0 = lO0Iil10.I00100l0(i7, parcel);
                                        break;
                                    default:
/* 2212 */                              lO0Iil10.I001IO000(i7, parcel);
                                        break;
                                }
                            }
/* 2246 */                  lO0Iil10.I000l1(iI001i1O0Ol7, parcel);
/* 2251 */                  loI1oilO loi1oilo = new loI1oilO();
/* 2254 */                  loi1oilo.I00iOIl = iI0010I0i17;
/* 2256 */                  loi1oilo.I00iiI = iI0010I0i14;
/* 2258 */                  loi1oilo.I00iiO = iI0010I0i15;
/* 2260 */                  loi1oilo.I00iio = iI0010I0i16;
/* 2262 */                  loi1oilo.I00ilI0I1 = zI000lI8;
/* 2264 */                  loi1oilo.I00ilO0 = fI00100l0;
/* 2266 */                  VarHandle.storeStoreFence();
/* 2269 */                  return loi1oilo;
                        case 7:
/* 2075 */                  int iI001i1O0Ol8 = lO0Iil10.I001i1O0Ol(parcel);
/* 2079 */                  float fI00100l02 = 0.0f;
/* 2080 */                  float fI00100l03 = 0.0f;
/* 2082 */                  float fI00100l04 = 0.0f;
/* 2084 */                  float fI00100l05 = 0.0f;
/* 2086 */                  float fI00100l06 = 0.0f;
/* 2088 */                  float fI00100l07 = 0.0f;
/* 2090 */                  float fI00100l08 = 0.0f;
/* 2092 */                  int iI0010I0i18 = 0;
/* 2093 */                  Rect rect = null;
/* 2094 */                  ArrayList arrayListI000iOII2 = null;
/* 2096 */                  ArrayList arrayListI000iOII3 = null;
/* 2102 */                  while (parcel.dataPosition() < iI001i1O0Ol8) {
/* 2104 */                      int i8 = parcel.readInt();
                                switch ((char) i8) {
                                    case 1:
/* 2175 */                              iI0010I0i18 = lO0Iil10.I0010I0i(i8, parcel);
                                        break;
                                    case 2:
/* 2172 */                              rect = (Rect) lO0Iil10.I0001Ioi1lo(parcel, i8, Rect.CREATOR);
                                        break;
                                    case 3:
/* 2160 */                              fI00100l02 = lO0Iil10.I00100l0(i8, parcel);
                                        break;
                                    case 4:
/* 2155 */                              fI00100l03 = lO0Iil10.I00100l0(i8, parcel);
                                        break;
                                    case 5:
/* 2150 */                              fI00100l04 = lO0Iil10.I00100l0(i8, parcel);
                                        break;
                                    case 6:
/* 2145 */                              fI00100l05 = lO0Iil10.I00100l0(i8, parcel);
                                        break;
                                    case 7:
/* 2140 */                              fI00100l06 = lO0Iil10.I00100l0(i8, parcel);
                                        break;
                                    case '\b':
/* 2135 */                              fI00100l07 = lO0Iil10.I00100l0(i8, parcel);
                                        break;
                                    case '\t':
/* 2130 */                              fI00100l08 = lO0Iil10.I00100l0(i8, parcel);
                                        break;
                                    case '\n':
/* 2125 */                              arrayListI000iOII2 = lO0Iil10.I000iOII(parcel, i8, loOOlllI0.CREATOR);
                                        break;
                                    case 11:
/* 2118 */                              arrayListI000iOII3 = lO0Iil10.I000iOII(parcel, i8, loI0OlIOo.CREATOR);
                                        break;
                                    default:
/* 2112 */                              lO0Iil10.I001IO000(i8, parcel);
                                        break;
                                }
                            }
/* 2180 */                  lO0Iil10.I000l1(iI001i1O0Ol8, parcel);
/* 2185 */                  return new loIiIliiO(iI0010I0i18, rect, fI00100l02, fI00100l03, fI00100l04, fI00100l05, fI00100l06, fI00100l07, fI00100l08, arrayListI000iOII2, arrayListI000iOII3);
                        case 8:
/* 2026 */                  int iI001i1O0Ol9 = lO0Iil10.I001i1O0Ol(parcel);
/* 2030 */                  int iI0010I0i19 = 0;
/* 2031 */                  PointF pointF = null;
/* 2036 */                  while (parcel.dataPosition() < iI001i1O0Ol9) {
/* 2038 */                      int i9 = parcel.readInt();
/* 2042 */                      char c5 = (char) i9;
/* 2043 */                      if (c5 == 1) {
/* 2061 */                          iI0010I0i19 = lO0Iil10.I0010I0i(i9, parcel);
                                } else if (c5 != 2) {
/* 2047 */                          lO0Iil10.I001IO000(i9, parcel);
                                } else {
/* 2058 */                          pointF = (PointF) lO0Iil10.I0001Ioi1lo(parcel, i9, PointF.CREATOR);
                                }
                            }
/* 2066 */                  lO0Iil10.I000l1(iI001i1O0Ol9, parcel);
/* 2071 */                  return new loOOlllI0(iI0010I0i19, pointF);
                        case 9:
/* 2001 */                  o00i1olooO o00i1olooo = new o00i1olooO();
/* 2008 */                  o00i1olooo.I00iOIl = parcel.readString();
/* 2014 */                  o00i1olooo.I00iiI = parcel.readLong();
/* 2020 */                  o00i1olooo.I00iiO = parcel.readInt();
/* 2022 */                  VarHandle.storeStoreFence();
/* 2025 */                  return o00i1olooo;
                        case 10:
/* 1924 */                  int iI001i1O0Ol10 = lO0Iil10.I001i1O0Ol(parcel);
/* 1928 */                  long jI0010o11 = 0;
/* 1929 */                  int iI0010I0i20 = 0;
/* 1930 */                  int iI0010I0i21 = 0;
/* 1931 */                  int iI0010I0i22 = 0;
/* 1932 */                  int iI0010I0i23 = 0;
/* 1938 */                  while (parcel.dataPosition() < iI001i1O0Ol10) {
/* 1940 */                      int i10 = parcel.readInt();
/* 1944 */                      char c6 = (char) i10;
/* 1945 */                      if (c6 == 1) {
/* 1984 */                          iI0010I0i20 = lO0Iil10.I0010I0i(i10, parcel);
                                } else if (c6 == 2) {
/* 1978 */                          iI0010I0i21 = lO0Iil10.I0010I0i(i10, parcel);
                                } else if (c6 == 3) {
/* 1972 */                          iI0010I0i22 = lO0Iil10.I0010I0i(i10, parcel);
                                } else if (c6 == 4) {
/* 1965 */                          iI0010I0i23 = lO0Iil10.I0010I0i(i10, parcel);
                                } else if (c6 != 5) {
/* 1955 */                          lO0Iil10.I001IO000(i10, parcel);
                                } else {
/* 1959 */                          jI0010o11 = lO0Iil10.I0010o(i10, parcel);
                                }
                            }
/* 1990 */                  lO0Iil10.I000l1(iI001i1O0Ol10, parcel);
/* 1995 */                  return new loliO1I0(iI0010I0i20, iI0010I0i21, iI0010I0i22, jI0010o11, iI0010I0i23);
                        case 11:
/* 1830 */                  int iI001i1O0Ol11 = lO0Iil10.I001i1O0Ol(parcel);
/* 1834 */                  int iI0010I0i24 = 0;
/* 1835 */                  int iI0010I0i25 = 0;
/* 1836 */                  int iI0010I0i26 = 0;
/* 1837 */                  int iI0010I0i27 = 0;
/* 1838 */                  Bitmap bitmap = null;
/* 1839 */                  int iI0010I0i28 = 0;
/* 1840 */                  float[] fArrI0000O = null;
/* 1845 */                  while (parcel.dataPosition() < iI001i1O0Ol11) {
/* 1847 */                      int i11 = parcel.readInt();
                                switch ((char) i11) {
                                    case 1:
/* 1893 */                              fArrI0000O = lO0Iil10.I0000O(i11, parcel);
                                        break;
                                    case 2:
/* 1890 */                              bitmap = (Bitmap) lO0Iil10.I0001Ioi1lo(parcel, i11, Bitmap.CREATOR);
                                        break;
                                    case 3:
/* 1879 */                              iI0010I0i28 = lO0Iil10.I0010I0i(i11, parcel);
                                        break;
                                    case 4:
/* 1874 */                              iI0010I0i24 = lO0Iil10.I0010I0i(i11, parcel);
                                        break;
                                    case 5:
/* 1869 */                              iI0010I0i25 = lO0Iil10.I0010I0i(i11, parcel);
                                        break;
                                    case 6:
/* 1864 */                              iI0010I0i26 = lO0Iil10.I0010I0i(i11, parcel);
                                        break;
                                    case 7:
/* 1859 */                              iI0010I0i27 = lO0Iil10.I0010I0i(i11, parcel);
                                        break;
                                    default:
/* 1855 */                              lO0Iil10.I001IO000(i11, parcel);
                                        break;
                                }
                            }
/* 1898 */                  lO0Iil10.I000l1(iI001i1O0Ol11, parcel);
/* 1903 */                  loo0iOl1l1i loo0iol1l1i = new loo0iOl1l1i();
/* 1906 */                  loo0iol1l1i.I00iOIl = fArrI0000O;
/* 1908 */                  loo0iol1l1i.I00iiI = bitmap;
/* 1910 */                  loo0iol1l1i.I00iiO = iI0010I0i28;
/* 1912 */                  loo0iol1l1i.I00iio = iI0010I0i24;
/* 1914 */                  loo0iol1l1i.I00ilI0I1 = iI0010I0i25;
/* 1916 */                  loo0iol1l1i.I00ilO0 = iI0010I0i26;
/* 1918 */                  loo0iol1l1i.I00io1l = iI0010I0i27;
/* 1920 */                  VarHandle.storeStoreFence();
/* 1923 */                  return loo0iol1l1i;
                        case 12:
/* 1715 */                  int iI001i1O0Ol12 = lO0Iil10.I001i1O0Ol(parcel);
/* 1719 */                  ArrayList arrayListI000iOII4 = null;
/* 1720 */                  float[] fArrI0000O2 = null;
/* 1721 */                  Bitmap bitmap2 = null;
                            while (true) {
/* 1722 */                      ArrayList arrayList = null;
/* 1727 */                      while (parcel.dataPosition() < iI001i1O0Ol12) {
/* 1729 */                          int i12 = parcel.readInt();
/* 1733 */                          char c7 = (char) i12;
/* 1734 */                          if (c7 == 1) {
/* 1805 */                              arrayListI000iOII4 = lO0Iil10.I000iOII(parcel, i12, loo0iOl1l1i.CREATOR);
                                    } else if (c7 == 2) {
/* 1798 */                              fArrI0000O2 = lO0Iil10.I0000O(i12, parcel);
                                    } else if (c7 == 3) {
/* 1795 */                              bitmap2 = (Bitmap) lO0Iil10.I0001Ioi1lo(parcel, i12, Bitmap.CREATOR);
                                    } else if (c7 != 4) {
/* 1742 */                              lO0Iil10.I001IO000(i12, parcel);
                                    } else {
/* 1746 */                              int iI001IIilI0O2 = lO0Iil10.I001IIilI0O(i12, parcel);
/* 1750 */                              int iDataPosition = parcel.dataPosition();
/* 1754 */                              if (iI001IIilI0O2 == 0) {
                                            break;
                                        }
/* 1759 */                              ArrayList arrayList2 = new ArrayList();
/* 1762 */                              int i13 = parcel.readInt();
/* 1767 */                              for (int i14 = 0; i14 < i13; i14++) {
/* 1777 */                                  arrayList2.add(Float.valueOf(parcel.readFloat()));
                                        }
/* 1784 */                              parcel.setDataPosition(iDataPosition + iI001IIilI0O2);
/* 1787 */                              arrayList = arrayList2;
                                    }
                                }
/* 1810 */                      lO0Iil10.I000l1(iI001i1O0Ol12, parcel);
/* 1815 */                      loo11OllO loo11ollo = new loo11OllO();
/* 1818 */                      loo11ollo.I00iOIl = arrayListI000iOII4;
/* 1820 */                      loo11ollo.I00iiI = fArrI0000O2;
/* 1822 */                      loo11ollo.I00iiO = bitmap2;
/* 1824 */                      loo11ollo.I00iio = arrayList;
/* 1826 */                      VarHandle.storeStoreFence();
/* 1829 */                      return loo11ollo;
                                break;
                            }
                        case 13:
/* 1646 */                  int iI001i1O0Ol13 = lO0Iil10.I001i1O0Ol(parcel);
/* 1650 */                  boolean zI000lI9 = false;
/* 1651 */                  boolean zI000lI10 = false;
/* 1652 */                  boolean zI000lI11 = false;
/* 1653 */                  boolean zI000lI12 = false;
/* 1654 */                  boolean zI000lI13 = false;
/* 1660 */                  while (parcel.dataPosition() < iI001i1O0Ol13) {
/* 1662 */                      int i15 = parcel.readInt();
/* 1666 */                      char c8 = (char) i15;
/* 1667 */                      if (c8 == 1) {
/* 1701 */                          zI000lI9 = lO0Iil10.I000lI(i15, parcel);
                                } else if (c8 == 2) {
/* 1696 */                          zI000lI10 = lO0Iil10.I000lI(i15, parcel);
                                } else if (c8 == 3) {
/* 1691 */                          zI000lI11 = lO0Iil10.I000lI(i15, parcel);
                                } else if (c8 == 4) {
/* 1686 */                          zI000lI12 = lO0Iil10.I000lI(i15, parcel);
                                } else if (c8 != 5) {
/* 1677 */                          lO0Iil10.I001IO000(i15, parcel);
                                } else {
/* 1681 */                          zI000lI13 = lO0Iil10.I000lI(i15, parcel);
                                }
                            }
/* 1706 */                  lO0Iil10.I000l1(iI001i1O0Ol13, parcel);
/* 1711 */                  return new looIIoOl(zI000lI9, zI000lI10, zI000lI11, zI000lI12, zI000lI13);
                        case 14:
/* 1401 */                  int iI001i1O0Ol14 = lO0Iil10.I001i1O0Ol(parcel);
/* 1405 */                  double dI000o00OoI0I = 0.0d;
/* 1407 */                  int iI0010I0i29 = 0;
/* 1408 */                  boolean zI000lI14 = false;
/* 1409 */                  String strI000II17 = null;
/* 1410 */                  Point[] pointArr = null;
/* 1411 */                  lOi1lo loi1lo = null;
/* 1412 */                  ll0oilIOo0o ll0oilioo0o = null;
/* 1413 */                  int iI0010I0i30 = 0;
/* 1414 */                  String strI000II18 = null;
/* 1415 */                  lli1OIoi11i lli1oioi11i = null;
/* 1416 */                  loO1OIOlI0O1 loo1oioli0o1 = null;
/* 1417 */                  byte[] bArrI00000oOI = null;
/* 1418 */                  li0l01iIOo li0l01iioo = null;
/* 1420 */                  lo00o1OOI lo00o1ooi = null;
/* 1422 */                  l1ol1ilIlOo0 l1ol1ililoo0 = null;
/* 1424 */                  lIOloiIol lioloiiol = null;
/* 1426 */                  lO0Ooil lo0ooil = null;
/* 1432 */                  while (parcel.dataPosition() < iI001i1O0Ol14) {
/* 1434 */                      int i16 = parcel.readInt();
/* 1438 */                      loO1OIOlI0O1 loo1oioli0o12 = loo1oioli0o1;
                                switch ((char) i16) {
                                    case 2:
/* 1583 */                              iI0010I0i30 = lO0Iil10.I0010I0i(i16, parcel);
                                        break;
                                    case 3:
/* 1577 */                              strI000II18 = lO0Iil10.I000II(i16, parcel);
                                        break;
                                    case 4:
/* 1571 */                              strI000II17 = lO0Iil10.I000II(i16, parcel);
                                        break;
                                    case 5:
/* 1566 */                              iI0010I0i29 = lO0Iil10.I0010I0i(i16, parcel);
                                        break;
                                    case 6:
/* 1563 */                              pointArr = (Point[]) lO0Iil10.I000OiO(parcel, i16, Point.CREATOR);
                                        break;
                                    case 7:
/* 1554 */                              loi1lo = (lOi1lo) lO0Iil10.I0001Ioi1lo(parcel, i16, lOi1lo.CREATOR);
                                        break;
                                    case '\b':
/* 1545 */                              ll0oilioo0o = (ll0oilIOo0o) lO0Iil10.I0001Ioi1lo(parcel, i16, ll0oilIOo0o.CREATOR);
                                        break;
                                    case '\t':
/* 1536 */                              lli1oioi11i = (lli1OIoi11i) lO0Iil10.I0001Ioi1lo(parcel, i16, lli1OIoi11i.CREATOR);
                                        break;
                                    case '\n':
/* 1527 */                              loo1oioli0o1 = (loO1OIOlI0O1) lO0Iil10.I0001Ioi1lo(parcel, i16, loO1OIOlI0O1.CREATOR);
                                        continue;
                                    case 11:
/* 1516 */                              lo00o1ooi = (lo00o1OOI) lO0Iil10.I0001Ioi1lo(parcel, i16, lo00o1OOI.CREATOR);
                                        break;
                                    case '\f':
/* 1505 */                              li0l01iioo = (li0l01iIOo) lO0Iil10.I0001Ioi1lo(parcel, i16, li0l01iIOo.CREATOR);
                                        break;
                                    case '\r':
/* 1494 */                              l1ol1ililoo0 = (l1ol1ilIlOo0) lO0Iil10.I0001Ioi1lo(parcel, i16, l1ol1ilIlOo0.CREATOR);
                                        break;
                                    case 14:
/* 1483 */                              lioloiiol = (lIOloiIol) lO0Iil10.I0001Ioi1lo(parcel, i16, lIOloiIol.CREATOR);
                                        break;
                                    case 15:
/* 1472 */                              lo0ooil = (lO0Ooil) lO0Iil10.I0001Ioi1lo(parcel, i16, lO0Ooil.CREATOR);
                                        break;
                                    case 16:
/* 1460 */                              bArrI00000oOI = lO0Iil10.I00000oOI(i16, parcel);
                                        break;
                                    case 17:
/* 1455 */                              zI000lI14 = lO0Iil10.I000lI(i16, parcel);
                                        break;
                                    case PoseLandmark.RIGHT_PINKY:
/* 1450 */                              dI000o00OoI0I = lO0Iil10.I000o00OoI0I(i16, parcel);
                                        break;
                                    default:
/* 1444 */                              lO0Iil10.I001IO000(i16, parcel);
                                        break;
                                }
/* 1447 */                      loo1oioli0o1 = loo1oioli0o12;
                            }
/* 1591 */                  lO0Iil10.I000l1(iI001i1O0Ol14, parcel);
/* 1596 */                  loliloil loliloilVar = new loliloil();
/* 1599 */                  loliloilVar.I00iOIl = iI0010I0i30;
/* 1601 */                  loliloilVar.I00iiI = strI000II18;
/* 1603 */                  loliloilVar.I00o0iI0io1 = bArrI00000oOI;
/* 1605 */                  loliloilVar.I00iiO = strI000II17;
/* 1607 */                  loliloilVar.I00iio = iI0010I0i29;
/* 1609 */                  loliloilVar.I00ilI0I1 = pointArr;
/* 1611 */                  loliloilVar.I00o0l1o1o0 = zI000lI14;
/* 1613 */                  loliloilVar.I00o101lO = dI000o00OoI0I;
/* 1615 */                  loliloilVar.I00ilO0 = loi1lo;
/* 1617 */                  loliloilVar.I00io1l = ll0oilioo0o;
/* 1619 */                  loliloilVar.I00ioIO = lli1oioi11i;
/* 1623 */                  loliloilVar.I00l0I0l0lO1 = loo1oioli0o1;
/* 1627 */                  loliloilVar.I00l0OO0IO = lo00o1ooi;
/* 1631 */                  loliloilVar.I00li1OI = li0l01iioo;
/* 1635 */                  loliloilVar.I00ll1 = l1ol1ililoo0;
/* 1639 */                  loliloilVar.I00lli11 = lioloiiol;
/* 1643 */                  loliloilVar.I00lll10 = lo0ooil;
/* 1645 */                  return loliloilVar;
                        case 15:
/* 1312 */                  int iI001i1O0Ol15 = lO0Iil10.I001i1O0Ol(parcel);
/* 1316 */                  Rect rect2 = null;
/* 1317 */                  ArrayList arrayListI000iOII5 = null;
/* 1318 */                  String strI000II19 = null;
/* 1319 */                  ArrayList arrayListI000iOII6 = null;
/* 1320 */                  String strI000II20 = null;
/* 1325 */                  while (parcel.dataPosition() < iI001i1O0Ol15) {
/* 1327 */                      int i17 = parcel.readInt();
/* 1331 */                      char c9 = (char) i17;
/* 1332 */                      if (c9 == 1) {
/* 1374 */                          strI000II20 = lO0Iil10.I000II(i17, parcel);
                                } else if (c9 == 2) {
/* 1371 */                          rect2 = (Rect) lO0Iil10.I0001Ioi1lo(parcel, i17, Rect.CREATOR);
                                } else if (c9 == 3) {
/* 1360 */                          arrayListI000iOII5 = lO0Iil10.I000iOII(parcel, i17, Point.CREATOR);
                                } else if (c9 == 4) {
/* 1353 */                          strI000II19 = lO0Iil10.I000II(i17, parcel);
                                } else if (c9 != 5) {
/* 1342 */                          lO0Iil10.I001IO000(i17, parcel);
                                } else {
/* 1348 */                          arrayListI000iOII6 = lO0Iil10.I000iOII(parcel, i17, o00oO1oo.CREATOR);
                                }
                            }
/* 1379 */                  lO0Iil10.I000l1(iI001i1O0Ol15, parcel);
/* 1384 */                  o00Oi1I o00oi1i = new o00Oi1I();
/* 1387 */                  o00oi1i.I00iOIl = strI000II20;
/* 1389 */                  o00oi1i.I00iiI = rect2;
/* 1391 */                  o00oi1i.I00iiO = arrayListI000iOII5;
/* 1393 */                  o00oi1i.I00iio = strI000II19;
/* 1395 */                  o00oi1i.I00ilI0I1 = arrayListI000iOII6;
/* 1397 */                  VarHandle.storeStoreFence();
/* 1400 */                  return o00oi1i;
                        case 16:
/* 1215 */                  int iI001i1O0Ol16 = lO0Iil10.I001i1O0Ol(parcel);
/* 1219 */                  float fI00100l09 = 0.0f;
/* 1220 */                  Rect rect3 = null;
/* 1221 */                  ArrayList arrayListI000iOII7 = null;
/* 1222 */                  String strI000II21 = null;
/* 1223 */                  ArrayList arrayListI000iOII8 = null;
/* 1224 */                  String strI000II22 = null;
/* 1229 */                  while (parcel.dataPosition() < iI001i1O0Ol16) {
/* 1231 */                      int i18 = parcel.readInt();
                                switch ((char) i18) {
                                    case 1:
/* 1281 */                              strI000II22 = lO0Iil10.I000II(i18, parcel);
                                        break;
                                    case 2:
/* 1278 */                              rect3 = (Rect) lO0Iil10.I0001Ioi1lo(parcel, i18, Rect.CREATOR);
                                        break;
                                    case 3:
/* 1267 */                              arrayListI000iOII7 = lO0Iil10.I000iOII(parcel, i18, Point.CREATOR);
                                        break;
                                    case 4:
/* 1260 */                              strI000II21 = lO0Iil10.I000II(i18, parcel);
                                        break;
                                    case 5:
/* 1255 */                              fI00100l0 = lO0Iil10.I00100l0(i18, parcel);
                                        break;
                                    case 6:
/* 1250 */                              fI00100l09 = lO0Iil10.I00100l0(i18, parcel);
                                        break;
                                    case 7:
/* 1245 */                              arrayListI000iOII8 = lO0Iil10.I000iOII(parcel, i18, o01IIOl01.CREATOR);
                                        break;
                                    default:
/* 1239 */                              lO0Iil10.I001IO000(i18, parcel);
                                        break;
                                }
                            }
/* 1286 */                  lO0Iil10.I000l1(iI001i1O0Ol16, parcel);
/* 1291 */                  o00o0iI0 o00o0ii0 = new o00o0iI0();
/* 1294 */                  o00o0ii0.I00iOIl = strI000II22;
/* 1296 */                  o00o0ii0.I00iiI = rect3;
/* 1298 */                  o00o0ii0.I00iiO = arrayListI000iOII7;
/* 1300 */                  o00o0ii0.I00iio = strI000II21;
/* 1302 */                  o00o0ii0.I00ilI0I1 = fI00100l0;
/* 1304 */                  o00o0ii0.I00ilO0 = fI00100l09;
/* 1306 */                  o00o0ii0.I00io1l = arrayListI000iOII8;
/* 1308 */                  VarHandle.storeStoreFence();
/* 1311 */                  return o00o0ii0;
                        case 17:
/* 1118 */                  int iI001i1O0Ol17 = lO0Iil10.I001i1O0Ol(parcel);
/* 1122 */                  float fI00100l010 = 0.0f;
/* 1123 */                  Rect rect4 = null;
/* 1124 */                  ArrayList arrayListI000iOII9 = null;
/* 1125 */                  String strI000II23 = null;
/* 1126 */                  ArrayList arrayListI000iOII10 = null;
/* 1127 */                  String strI000II24 = null;
/* 1132 */                  while (parcel.dataPosition() < iI001i1O0Ol17) {
/* 1134 */                      int i19 = parcel.readInt();
                                switch ((char) i19) {
                                    case 1:
/* 1184 */                              strI000II24 = lO0Iil10.I000II(i19, parcel);
                                        break;
                                    case 2:
/* 1181 */                              rect4 = (Rect) lO0Iil10.I0001Ioi1lo(parcel, i19, Rect.CREATOR);
                                        break;
                                    case 3:
/* 1170 */                              arrayListI000iOII9 = lO0Iil10.I000iOII(parcel, i19, Point.CREATOR);
                                        break;
                                    case 4:
/* 1163 */                              strI000II23 = lO0Iil10.I000II(i19, parcel);
                                        break;
                                    case 5:
/* 1158 */                              arrayListI000iOII10 = lO0Iil10.I000iOII(parcel, i19, o00o0iI0.CREATOR);
                                        break;
                                    case 6:
/* 1151 */                              fI00100l0 = lO0Iil10.I00100l0(i19, parcel);
                                        break;
                                    case 7:
/* 1146 */                              fI00100l010 = lO0Iil10.I00100l0(i19, parcel);
                                        break;
                                    default:
/* 1142 */                              lO0Iil10.I001IO000(i19, parcel);
                                        break;
                                }
                            }
/* 1189 */                  lO0Iil10.I000l1(iI001i1O0Ol17, parcel);
/* 1194 */                  o00oO1oo o00oo1oo = new o00oO1oo();
/* 1197 */                  o00oo1oo.I00iOIl = strI000II24;
/* 1199 */                  o00oo1oo.I00iiI = rect4;
/* 1201 */                  o00oo1oo.I00iiO = arrayListI000iOII9;
/* 1203 */                  o00oo1oo.I00iio = strI000II23;
/* 1205 */                  o00oo1oo.I00ilI0I1 = arrayListI000iOII10;
/* 1207 */                  o00oo1oo.I00ilO0 = fI00100l0;
/* 1209 */                  o00oo1oo.I00io1l = fI00100l010;
/* 1211 */                  VarHandle.storeStoreFence();
/* 1214 */                  return o00oo1oo;
                        case PoseLandmark.RIGHT_PINKY:
/* 1065 */                  int iI001i1O0Ol18 = lO0Iil10.I001i1O0Ol(parcel);
/* 1069 */                  ArrayList arrayListI000iOII11 = null;
/* 1070 */                  String strI000II25 = null;
/* 1075 */                  while (parcel.dataPosition() < iI001i1O0Ol18) {
/* 1077 */                      int i20 = parcel.readInt();
/* 1081 */                      char c10 = (char) i20;
/* 1082 */                      if (c10 == 1) {
/* 1097 */                          strI000II25 = lO0Iil10.I000II(i20, parcel);
                                } else if (c10 != 2) {
/* 1086 */                          lO0Iil10.I001IO000(i20, parcel);
                                } else {
/* 1092 */                          arrayListI000iOII11 = lO0Iil10.I000iOII(parcel, i20, o00Oi1I.CREATOR);
                                }
                            }
/* 1102 */                  lO0Iil10.I000l1(iI001i1O0Ol18, parcel);
/* 1107 */                  o010oI1oOli o010oi1ooli = new o010oI1oOli();
/* 1110 */                  o010oi1ooli.I00iOIl = strI000II25;
/* 1112 */                  o010oi1ooli.I00iiI = arrayListI000iOII11;
/* 1114 */                  VarHandle.storeStoreFence();
/* 1117 */                  return o010oi1ooli;
                        case PoseLandmark.LEFT_INDEX:
/* 992 */                   int iI001i1O0Ol19 = lO0Iil10.I001i1O0Ol(parcel);
/* 996 */                   String strI000II26 = null;
/* 997 */                   String strI000II27 = null;
/* 998 */                   String strI000II28 = null;
/* 999 */                   String strI000II29 = null;
/* 1000 */                  int iI0010I0i31 = 0;
/* 1001 */                  boolean zI000lI15 = false;
/* 1002 */                  boolean zI000lI16 = false;
/* 1007 */                  while (parcel.dataPosition() < iI001i1O0Ol19) {
/* 1009 */                      int i21 = parcel.readInt();
                                switch ((char) i21) {
                                    case 1:
/* 1051 */                              strI000II26 = lO0Iil10.I000II(i21, parcel);
                                        break;
                                    case 2:
/* 1046 */                              strI000II27 = lO0Iil10.I000II(i21, parcel);
                                        break;
                                    case 3:
/* 1041 */                              strI000II28 = lO0Iil10.I000II(i21, parcel);
                                        break;
                                    case 4:
/* 1036 */                              zI000lI15 = lO0Iil10.I000lI(i21, parcel);
                                        break;
                                    case 5:
/* 1031 */                              iI0010I0i31 = lO0Iil10.I0010I0i(i21, parcel);
                                        break;
                                    case 6:
/* 1026 */                              strI000II29 = lO0Iil10.I000II(i21, parcel);
                                        break;
                                    case 7:
/* 1021 */                              zI000lI16 = lO0Iil10.I000lI(i21, parcel);
                                        break;
                                    default:
/* 1017 */                              lO0Iil10.I001IO000(i21, parcel);
                                        break;
                                }
                            }
/* 1056 */                  lO0Iil10.I000l1(iI001i1O0Ol19, parcel);
/* 1061 */                  return new o011OIooio(strI000II26, strI000II27, strI000II28, strI000II29, iI0010I0i31, zI000lI15, zI000lI16);
                        case PoseLandmark.RIGHT_INDEX:
/* 906 */                   int iI001i1O0Ol20 = lO0Iil10.I001i1O0Ol(parcel);
/* 910 */                   float fI00100l011 = 0.0f;
/* 911 */                   Rect rect5 = null;
/* 912 */                   ArrayList arrayListI000iOII12 = null;
/* 913 */                   String strI000II30 = null;
/* 918 */                   while (parcel.dataPosition() < iI001i1O0Ol20) {
/* 920 */                       int i22 = parcel.readInt();
/* 924 */                       char c11 = (char) i22;
/* 925 */                       if (c11 == 1) {
/* 965 */                           strI000II30 = lO0Iil10.I000II(i22, parcel);
                                } else if (c11 == 2) {
/* 962 */                           rect5 = (Rect) lO0Iil10.I0001Ioi1lo(parcel, i22, Rect.CREATOR);
                                } else if (c11 == 3) {
/* 951 */                           arrayListI000iOII12 = lO0Iil10.I000iOII(parcel, i22, Point.CREATOR);
                                } else if (c11 == 4) {
/* 944 */                           fI00100l0 = lO0Iil10.I00100l0(i22, parcel);
                                } else if (c11 != 5) {
/* 935 */                           lO0Iil10.I001IO000(i22, parcel);
                                } else {
/* 939 */                           fI00100l011 = lO0Iil10.I00100l0(i22, parcel);
                                }
                            }
/* 970 */                   lO0Iil10.I000l1(iI001i1O0Ol20, parcel);
/* 975 */                   o01IIOl01 o01iiol01 = new o01IIOl01();
/* 978 */                   o01iiol01.I00iOIl = strI000II30;
/* 980 */                   o01iiol01.I00iiI = rect5;
/* 982 */                   o01iiol01.I00iiO = arrayListI000iOII12;
/* 984 */                   o01iiol01.I00iio = fI00100l0;
/* 986 */                   o01iiol01.I00ilI0I1 = fI00100l011;
/* 988 */                   VarHandle.storeStoreFence();
/* 991 */                   return o01iiol01;
                        case PoseLandmark.LEFT_THUMB:
/* 811 */                   int iI001i1O0Ol21 = lO0Iil10.I001i1O0Ol(parcel);
/* 815 */                   int iI0010I0i32 = 0;
/* 816 */                   int iI0010I0i33 = 0;
/* 817 */                   int iI0010I0i34 = 0;
/* 818 */                   int iI0010I0i35 = 0;
/* 819 */                   int iI0010I0i36 = 0;
/* 820 */                   boolean zI000lI17 = false;
/* 821 */                   int iI0010I0i37 = 0;
/* 822 */                   String strI000II31 = null;
/* 827 */                   while (parcel.dataPosition() < iI001i1O0Ol21) {
/* 829 */                       int i23 = parcel.readInt();
                                switch ((char) i23) {
                                    case 2:
/* 876 */                               iI0010I0i37 = lO0Iil10.I0010I0i(i23, parcel);
                                        break;
                                    case 3:
/* 871 */                               iI0010I0i32 = lO0Iil10.I0010I0i(i23, parcel);
                                        break;
                                    case 4:
/* 866 */                               iI0010I0i33 = lO0Iil10.I0010I0i(i23, parcel);
                                        break;
                                    case 5:
/* 861 */                               iI0010I0i34 = lO0Iil10.I0010I0i(i23, parcel);
                                        break;
                                    case 6:
/* 856 */                               iI0010I0i35 = lO0Iil10.I0010I0i(i23, parcel);
                                        break;
                                    case 7:
/* 851 */                               iI0010I0i36 = lO0Iil10.I0010I0i(i23, parcel);
                                        break;
                                    case '\b':
/* 846 */                               zI000lI17 = lO0Iil10.I000lI(i23, parcel);
                                        break;
                                    case '\t':
/* 841 */                               strI000II31 = lO0Iil10.I000II(i23, parcel);
                                        break;
                                    default:
/* 837 */                               lO0Iil10.I001IO000(i23, parcel);
                                        break;
                                }
                            }
/* 881 */                   lO0Iil10.I000l1(iI001i1O0Ol21, parcel);
/* 886 */                   l1O11O l1o11o = new l1O11O();
/* 889 */                   l1o11o.I00iOIl = iI0010I0i37;
/* 891 */                   l1o11o.I00iiI = iI0010I0i32;
/* 893 */                   l1o11o.I00iiO = iI0010I0i33;
/* 895 */                   l1o11o.I00iio = iI0010I0i34;
/* 897 */                   l1o11o.I00ilI0I1 = iI0010I0i35;
/* 899 */                   l1o11o.I00ilO0 = iI0010I0i36;
/* 901 */                   l1o11o.I00io1l = zI000lI17;
/* 903 */                   l1o11o.I00ioIO = strI000II31;
/* 905 */                   return l1o11o;
                        case PoseLandmark.RIGHT_THUMB:
/* 764 */                   int iI001i1O0Ol22 = lO0Iil10.I001i1O0Ol(parcel);
/* 768 */                   ArrayList arrayListI000iOII13 = null;
/* 773 */                   while (parcel.dataPosition() < iI001i1O0Ol22) {
/* 775 */                       int i24 = parcel.readInt();
/* 780 */                       if (((char) i24) != 1) {
/* 782 */                           lO0Iil10.I001IO000(i24, parcel);
                                } else {
/* 788 */                           arrayListI000iOII13 = lO0Iil10.I000iOII(parcel, i24, o0oIIOiOIll1.CREATOR);
                                }
                            }
/* 793 */                   lO0Iil10.I000l1(iI001i1O0Ol22, parcel);
/* 798 */                   o0Il0Ii1 o0il0ii1 = new o0Il0Ii1();
/* 805 */                   o0il0ii1.I00iOIl = lOI1lll1l10.I000o00OoI0I(arrayListI000iOII13);
/* 807 */                   VarHandle.storeStoreFence();
/* 810 */                   return o0il0ii1;
                        case PoseLandmark.LEFT_HIP:
/* 669 */                   int iI001i1O0Ol23 = lO0Iil10.I001i1O0Ol(parcel);
/* 673 */                   String strI000II32 = null;
/* 674 */                   String strI000II33 = null;
/* 675 */                   String strI000II34 = null;
/* 676 */                   String strI000II35 = null;
/* 677 */                   l1O11O l1o11o2 = null;
/* 678 */                   l1O11O l1o11o3 = null;
/* 679 */                   String strI000II36 = null;
/* 684 */                   while (parcel.dataPosition() < iI001i1O0Ol23) {
/* 686 */                       int i25 = parcel.readInt();
                                switch ((char) i25) {
                                    case 2:
/* 736 */                               strI000II36 = lO0Iil10.I000II(i25, parcel);
                                        break;
                                    case 3:
/* 731 */                               strI000II32 = lO0Iil10.I000II(i25, parcel);
                                        break;
                                    case 4:
/* 726 */                               strI000II33 = lO0Iil10.I000II(i25, parcel);
                                        break;
                                    case 5:
/* 721 */                               strI000II34 = lO0Iil10.I000II(i25, parcel);
                                        break;
                                    case 6:
/* 716 */                               strI000II35 = lO0Iil10.I000II(i25, parcel);
                                        break;
                                    case 7:
/* 713 */                               l1o11o2 = (l1O11O) lO0Iil10.I0001Ioi1lo(parcel, i25, l1O11O.CREATOR);
                                        break;
                                    case '\b':
/* 704 */                               l1o11o3 = (l1O11O) lO0Iil10.I0001Ioi1lo(parcel, i25, l1O11O.CREATOR);
                                        break;
                                    default:
/* 694 */                               lO0Iil10.I001IO000(i25, parcel);
                                        break;
                                }
                            }
/* 741 */                   lO0Iil10.I000l1(iI001i1O0Ol23, parcel);
/* 746 */                   l1ol1ilIlOo0 l1ol1ililoo02 = new l1ol1ilIlOo0();
/* 749 */                   l1ol1ililoo02.I00iOIl = strI000II36;
/* 751 */                   l1ol1ililoo02.I00iiI = strI000II32;
/* 753 */                   l1ol1ililoo02.I00iiO = strI000II33;
/* 755 */                   l1ol1ililoo02.I00iio = strI000II34;
/* 757 */                   l1ol1ililoo02.I00ilI0I1 = strI000II35;
/* 759 */                   l1ol1ililoo02.I00ilO0 = l1o11o2;
/* 761 */                   l1ol1ililoo02.I00io1l = l1o11o3;
/* 763 */                   return l1ol1ililoo02;
                        case PoseLandmark.RIGHT_HIP:
/* 579 */                   int iI001i1O0Ol24 = lO0Iil10.I001i1O0Ol(parcel);
/* 583 */                   String strI000II37 = null;
/* 584 */                   String strI000II38 = null;
/* 585 */                   String strI000II39 = null;
/* 586 */                   String strI000II40 = null;
/* 587 */                   String strI000II41 = null;
/* 588 */                   int iI0010I0i38 = 0;
/* 589 */                   String strI000II42 = null;
/* 594 */                   while (parcel.dataPosition() < iI001i1O0Ol24) {
/* 596 */                       int i26 = parcel.readInt();
                                switch ((char) i26) {
                                    case 1:
/* 638 */                               strI000II42 = lO0Iil10.I000II(i26, parcel);
                                        break;
                                    case 2:
/* 633 */                               strI000II37 = lO0Iil10.I000II(i26, parcel);
                                        break;
                                    case 3:
/* 628 */                               strI000II38 = lO0Iil10.I000II(i26, parcel);
                                        break;
                                    case 4:
/* 623 */                               strI000II39 = lO0Iil10.I000II(i26, parcel);
                                        break;
                                    case 5:
/* 618 */                               strI000II40 = lO0Iil10.I000II(i26, parcel);
                                        break;
                                    case 6:
/* 613 */                               iI0010I0i38 = lO0Iil10.I0010I0i(i26, parcel);
                                        break;
                                    case 7:
/* 608 */                               strI000II41 = lO0Iil10.I000II(i26, parcel);
                                        break;
                                    default:
/* 604 */                               lO0Iil10.I001IO000(i26, parcel);
                                        break;
                                }
                            }
/* 643 */                   lO0Iil10.I000l1(iI001i1O0Ol24, parcel);
/* 648 */                   OOoioIi1IOio oOoioIi1IOio = new OOoioIi1IOio();
/* 651 */                   oOoioIi1IOio.I00iOIl = strI000II42;
/* 653 */                   oOoioIi1IOio.I00iiI = strI000II37;
/* 655 */                   oOoioIi1IOio.I00iiO = strI000II38;
/* 657 */                   oOoioIi1IOio.I00iio = strI000II39;
/* 659 */                   oOoioIi1IOio.I00ilI0I1 = strI000II40;
/* 661 */                   oOoioIi1IOio.I00ilO0 = iI0010I0i38;
/* 663 */                   oOoioIi1IOio.I00io1l = strI000II41;
/* 665 */                   VarHandle.storeStoreFence();
/* 668 */                   return oOoioIi1IOio;
                        case PoseLandmark.LEFT_KNEE:
/* 528 */                   int iI001i1O0Ol25 = lO0Iil10.I001i1O0Ol(parcel);
/* 532 */                   int iI0010I0i39 = 0;
/* 533 */                   String[] strArrI000O01llI0 = null;
/* 538 */                   while (parcel.dataPosition() < iI001i1O0Ol25) {
/* 540 */                       int i27 = parcel.readInt();
/* 544 */                       char c12 = (char) i27;
/* 545 */                       if (c12 == 1) {
/* 558 */                           iI0010I0i39 = lO0Iil10.I0010I0i(i27, parcel);
                                } else if (c12 != 2) {
/* 549 */                           lO0Iil10.I001IO000(i27, parcel);
                                } else {
/* 553 */                           strArrI000O01llI0 = lO0Iil10.I000O01llI0(i27, parcel);
                                }
                            }
/* 563 */                   lO0Iil10.I000l1(iI001i1O0Ol25, parcel);
/* 568 */                   o0liol1 o0liol1Var = new o0liol1();
/* 571 */                   o0liol1Var.I00iOIl = iI0010I0i39;
/* 573 */                   o0liol1Var.I00iiI = strArrI000O01llI0;
/* 575 */                   VarHandle.storeStoreFence();
/* 578 */                   return o0liol1Var;
                        case PoseLandmark.RIGHT_KNEE:
/* 424 */                   int iI001i1O0Ol26 = lO0Iil10.I001i1O0Ol(parcel);
/* 428 */                   String strI000II43 = null;
/* 429 */                   String strI000II44 = null;
/* 430 */                   ll0oilIOo0o[] ll0oilioo0oArr = null;
/* 431 */                   lOi1lo[] loi1loArr = null;
/* 432 */                   String[] strArrI000O01llI02 = null;
/* 433 */                   l0oI0OIiiIio[] l0oi0oiiiiioArr = null;
/* 434 */                   liiii1looii liiii1looiiVar = null;
/* 439 */                   while (parcel.dataPosition() < iI001i1O0Ol26) {
/* 441 */                       int i28 = parcel.readInt();
                                switch ((char) i28) {
                                    case 2:
/* 502 */                               liiii1looiiVar = (liiii1looii) lO0Iil10.I0001Ioi1lo(parcel, i28, liiii1looii.CREATOR);
                                        break;
                                    case 3:
/* 490 */                               strI000II43 = lO0Iil10.I000II(i28, parcel);
                                        break;
                                    case 4:
/* 485 */                               strI000II44 = lO0Iil10.I000II(i28, parcel);
                                        break;
                                    case 5:
/* 482 */                               ll0oilioo0oArr = (ll0oilIOo0o[]) lO0Iil10.I000OiO(parcel, i28, ll0oilIOo0o.CREATOR);
                                        break;
                                    case 6:
/* 473 */                               loi1loArr = (lOi1lo[]) lO0Iil10.I000OiO(parcel, i28, lOi1lo.CREATOR);
                                        break;
                                    case 7:
/* 462 */                               strArrI000O01llI02 = lO0Iil10.I000O01llI0(i28, parcel);
                                        break;
                                    case '\b':
/* 459 */                               l0oi0oiiiiioArr = (l0oI0OIiiIio[]) lO0Iil10.I000OiO(parcel, i28, l0oI0OIiiIio.CREATOR);
                                        break;
                                    default:
/* 449 */                               lO0Iil10.I001IO000(i28, parcel);
                                        break;
                                }
                            }
/* 505 */                   lO0Iil10.I000l1(iI001i1O0Ol26, parcel);
/* 510 */                   lIOloiIol lioloiiol2 = new lIOloiIol();
/* 513 */                   lioloiiol2.I00iOIl = liiii1looiiVar;
/* 515 */                   lioloiiol2.I00iiI = strI000II43;
/* 517 */                   lioloiiol2.I00iiO = strI000II44;
/* 519 */                   lioloiiol2.I00iio = ll0oilioo0oArr;
/* 521 */                   lioloiiol2.I00ilI0I1 = loi1loArr;
/* 523 */                   lioloiiol2.I00ilO0 = strArrI000O01llI02;
/* 525 */                   lioloiiol2.I00io1l = l0oi0oiiiiioArr;
/* 527 */                   return lioloiiol2;
                        case 27:
/* 214 */                   int iI001i1O0Ol27 = lO0Iil10.I001i1O0Ol(parcel);
/* 218 */                   o0loI0oo0I o0loi0oo0i = null;
/* 220 */                   int iI0010I0i40 = 0;
/* 221 */                   String strI000II45 = null;
/* 222 */                   byte[] bArrI00000oOI2 = null;
/* 223 */                   Point[] pointArr2 = null;
/* 224 */                   o0looOOo0 o0looooo0 = null;
/* 225 */                   o0o0oIo0 o0o0oio0 = null;
/* 226 */                   o0o1O00 o0o1o00 = null;
/* 227 */                   o0oIoIIiiIo o0oioiiiiio = null;
/* 228 */                   int iI0010I0i41 = 0;
/* 229 */                   String strI000II46 = null;
/* 230 */                   o0o1o1IOI0 o0o1o1ioi0 = null;
/* 231 */                   o0o0IiO0IoOo o0o0iio0iooo = null;
/* 232 */                   o0llolO1Iol o0llolo1iol = null;
/* 233 */                   o0loil0O o0loil0o = null;
/* 239 */                   while (parcel.dataPosition() < iI001i1O0Ol27) {
/* 241 */                       int i29 = parcel.readInt();
/* 245 */                       o0llolO1Iol o0llolo1iol2 = o0llolo1iol;
                                switch ((char) i29) {
                                    case 1:
/* 371 */                               iI0010I0i41 = lO0Iil10.I0010I0i(i29, parcel);
                                        break;
                                    case 2:
/* 366 */                               strI000II46 = lO0Iil10.I000II(i29, parcel);
                                        break;
                                    case 3:
/* 361 */                               strI000II45 = lO0Iil10.I000II(i29, parcel);
                                        break;
                                    case 4:
/* 356 */                               bArrI00000oOI2 = lO0Iil10.I00000oOI(i29, parcel);
                                        break;
                                    case 5:
/* 353 */                               pointArr2 = (Point[]) lO0Iil10.I000OiO(parcel, i29, Point.CREATOR);
                                        break;
                                    case 6:
/* 342 */                               iI0010I0i40 = lO0Iil10.I0010I0i(i29, parcel);
                                        break;
                                    case 7:
/* 339 */                               o0looooo0 = (o0looOOo0) lO0Iil10.I0001Ioi1lo(parcel, i29, o0looOOo0.CREATOR);
                                        break;
                                    case '\b':
/* 330 */                               o0o0oio0 = (o0o0oIo0) lO0Iil10.I0001Ioi1lo(parcel, i29, o0o0oIo0.CREATOR);
                                        break;
                                    case '\t':
/* 321 */                               o0o1o00 = (o0o1O00) lO0Iil10.I0001Ioi1lo(parcel, i29, o0o1O00.CREATOR);
                                        break;
                                    case '\n':
/* 312 */                               o0oioiiiiio = (o0oIoIIiiIo) lO0Iil10.I0001Ioi1lo(parcel, i29, o0oIoIIiiIo.CREATOR);
                                        break;
                                    case 11:
/* 303 */                               o0o1o1ioi0 = (o0o1o1IOI0) lO0Iil10.I0001Ioi1lo(parcel, i29, o0o1o1IOI0.CREATOR);
                                        break;
                                    case '\f':
/* 294 */                               o0o0iio0iooo = (o0o0IiO0IoOo) lO0Iil10.I0001Ioi1lo(parcel, i29, o0o0IiO0IoOo.CREATOR);
                                        break;
                                    case '\r':
/* 285 */                               o0llolo1iol = (o0llolO1Iol) lO0Iil10.I0001Ioi1lo(parcel, i29, o0llolO1Iol.CREATOR);
                                        continue;
                                    case 14:
/* 274 */                               o0loi0oo0i = (o0loI0oo0I) lO0Iil10.I0001Ioi1lo(parcel, i29, o0loI0oo0I.CREATOR);
                                        break;
                                    case 15:
/* 265 */                               o0loil0o = (o0loil0O) lO0Iil10.I0001Ioi1lo(parcel, i29, o0loil0O.CREATOR);
                                        break;
                                    default:
/* 251 */                               lO0Iil10.I001IO000(i29, parcel);
                                        break;
                                }
/* 254 */                       o0llolo1iol = o0llolo1iol2;
                            }
/* 378 */                   lO0Iil10.I000l1(iI001i1O0Ol27, parcel);
/* 383 */                   o0oOI0O o0ooi0o = new o0oOI0O();
/* 386 */                   o0ooi0o.I00iOIl = iI0010I0i41;
/* 388 */                   o0ooi0o.I00iiI = strI000II46;
/* 390 */                   o0ooi0o.I00iiO = strI000II45;
/* 392 */                   o0ooi0o.I00iio = bArrI00000oOI2;
/* 394 */                   o0ooi0o.I00ilI0I1 = pointArr2;
/* 396 */                   o0ooi0o.I00ilO0 = iI0010I0i40;
/* 398 */                   o0ooi0o.I00io1l = o0looooo0;
/* 400 */                   o0ooi0o.I00ioIO = o0o0oio0;
/* 402 */                   o0ooi0o.I00l0I0l0lO1 = o0o1o00;
/* 404 */                   o0ooi0o.I00l0OO0IO = o0oioiiiiio;
/* 406 */                   o0ooi0o.I00li1OI = o0o1o1ioi0;
/* 408 */                   o0ooi0o.I00ll1 = o0o0iio0iooo;
/* 410 */                   o0ooi0o.I00lli11 = o0llolo1iol;
/* 414 */                   o0ooi0o.I00lll10 = o0loi0oo0i;
/* 418 */                   o0ooi0o.I00o0iI0io1 = o0loil0o;
/* 420 */                   VarHandle.storeStoreFence();
/* 423 */                   return o0ooi0o;
                        case PoseLandmark.RIGHT_ANKLE:
/* 116 */                   int iI001i1O0Ol28 = lO0Iil10.I001i1O0Ol(parcel);
/* 120 */                   int iI0010I0i42 = 0;
/* 121 */                   int iI0010I0i43 = 0;
/* 122 */                   int iI0010I0i44 = 0;
/* 123 */                   int iI0010I0i45 = 0;
/* 124 */                   int iI0010I0i46 = 0;
/* 125 */                   boolean zI000lI18 = false;
/* 126 */                   int iI0010I0i47 = 0;
/* 127 */                   String strI000II47 = null;
/* 132 */                   while (parcel.dataPosition() < iI001i1O0Ol28) {
/* 134 */                       int i30 = parcel.readInt();
                                switch ((char) i30) {
                                    case 1:
/* 181 */                               iI0010I0i47 = lO0Iil10.I0010I0i(i30, parcel);
                                        break;
                                    case 2:
/* 176 */                               iI0010I0i42 = lO0Iil10.I0010I0i(i30, parcel);
                                        break;
                                    case 3:
/* 171 */                               iI0010I0i43 = lO0Iil10.I0010I0i(i30, parcel);
                                        break;
                                    case 4:
/* 166 */                               iI0010I0i44 = lO0Iil10.I0010I0i(i30, parcel);
                                        break;
                                    case 5:
/* 161 */                               iI0010I0i45 = lO0Iil10.I0010I0i(i30, parcel);
                                        break;
                                    case 6:
/* 156 */                               iI0010I0i46 = lO0Iil10.I0010I0i(i30, parcel);
                                        break;
                                    case 7:
/* 151 */                               zI000lI18 = lO0Iil10.I000lI(i30, parcel);
                                        break;
                                    case '\b':
/* 146 */                               strI000II47 = lO0Iil10.I000II(i30, parcel);
                                        break;
                                    default:
/* 142 */                               lO0Iil10.I001IO000(i30, parcel);
                                        break;
                                }
                            }
/* 186 */                   lO0Iil10.I000l1(iI001i1O0Ol28, parcel);
/* 191 */                   o0ll1o0lIoll o0ll1o0lioll = new o0ll1o0lIoll();
/* 194 */                   o0ll1o0lioll.I00iOIl = iI0010I0i47;
/* 196 */                   o0ll1o0lioll.I00iiI = iI0010I0i42;
/* 198 */                   o0ll1o0lioll.I00iiO = iI0010I0i43;
/* 200 */                   o0ll1o0lioll.I00iio = iI0010I0i44;
/* 202 */                   o0ll1o0lioll.I00ilI0I1 = iI0010I0i45;
/* 204 */                   o0ll1o0lioll.I00ilO0 = iI0010I0i46;
/* 206 */                   o0ll1o0lioll.I00io1l = zI000lI18;
/* 208 */                   o0ll1o0lioll.I00ioIO = strI000II47;
/* 210 */                   VarHandle.storeStoreFence();
/* 213 */                   return o0ll1o0lioll;
                        default:
/* 18 */                    int iI001i1O0Ol29 = lO0Iil10.I001i1O0Ol(parcel);
/* 22 */                    String strI000II48 = null;
/* 23 */                    String strI000II49 = null;
/* 24 */                    String strI000II50 = null;
/* 25 */                    String strI000II51 = null;
/* 26 */                    o0ll1o0lIoll o0ll1o0lioll2 = null;
/* 27 */                    o0ll1o0lIoll o0ll1o0lioll3 = null;
/* 28 */                    String strI000II52 = null;
/* 33 */                    while (parcel.dataPosition() < iI001i1O0Ol29) {
/* 35 */                        int i31 = parcel.readInt();
                                switch ((char) i31) {
                                    case 1:
/* 85 */                                strI000II52 = lO0Iil10.I000II(i31, parcel);
                                        break;
                                    case 2:
/* 80 */                                strI000II48 = lO0Iil10.I000II(i31, parcel);
                                        break;
                                    case 3:
/* 75 */                                strI000II49 = lO0Iil10.I000II(i31, parcel);
                                        break;
                                    case 4:
/* 70 */                                strI000II50 = lO0Iil10.I000II(i31, parcel);
                                        break;
                                    case 5:
/* 65 */                                strI000II51 = lO0Iil10.I000II(i31, parcel);
                                        break;
                                    case 6:
/* 62 */                                o0ll1o0lioll2 = (o0ll1o0lIoll) lO0Iil10.I0001Ioi1lo(parcel, i31, o0ll1o0lIoll.CREATOR);
                                        break;
                                    case 7:
/* 53 */                                o0ll1o0lioll3 = (o0ll1o0lIoll) lO0Iil10.I0001Ioi1lo(parcel, i31, o0ll1o0lIoll.CREATOR);
                                        break;
                                    default:
/* 43 */                                lO0Iil10.I001IO000(i31, parcel);
                                        break;
                                }
                            }
/* 90 */                    lO0Iil10.I000l1(iI001i1O0Ol29, parcel);
/* 95 */                    o0llolO1Iol o0llolo1iol3 = new o0llolO1Iol();
/* 98 */                    o0llolo1iol3.I00iOIl = strI000II52;
/* 100 */                   o0llolo1iol3.I00iiI = strI000II48;
/* 102 */                   o0llolo1iol3.I00iiO = strI000II49;
/* 104 */                   o0llolo1iol3.I00iio = strI000II50;
/* 106 */                   o0llolo1iol3.I00ilI0I1 = strI000II51;
/* 108 */                   o0llolo1iol3.I00ilO0 = o0ll1o0lioll2;
/* 110 */                   o0llolo1iol3.I00io1l = o0ll1o0lioll3;
/* 112 */                   VarHandle.storeStoreFence();
/* 115 */                   return o0llolo1iol3;
                    }
                }

                @Override
                public final Object[] newArray(int i) {
                    switch (this.I00000oIO) {
                        case 0:
/* 93 */                    return new ll0oil[i];
                        case 1:
/* 90 */                    return new lli0oio0[i];
                        case 2:
/* 87 */                    return new lli10iI[i];
                        case 3:
/* 84 */                    return new lli1IIiI[i];
                        case 4:
/* 81 */                    return new lo1oIIiO[i];
                        case 5:
/* 78 */                    return new loI0OlIOo[i];
                        case 6:
/* 75 */                    return new loI1oilO[i];
                        case 7:
/* 72 */                    return new loIiIliiO[i];
                        case 8:
/* 69 */                    return new loOOlllI0[i];
                        case 9:
/* 66 */                    return new o00i1olooO[i];
                        case 10:
/* 63 */                    return new loliO1I0[i];
                        case 11:
/* 60 */                    return new loo0iOl1l1i[i];
                        case 12:
/* 57 */                    return new loo11OllO[i];
                        case 13:
/* 54 */                    return new looIIoOl[i];
                        case 14:
/* 51 */                    return new loliloil[i];
                        case 15:
/* 48 */                    return new o00Oi1I[i];
                        case 16:
/* 45 */                    return new o00o0iI0[i];
                        case 17:
/* 42 */                    return new o00oO1oo[i];
                        case PoseLandmark.RIGHT_PINKY:
/* 39 */                    return new o010oI1oOli[i];
                        case PoseLandmark.LEFT_INDEX:
/* 36 */                    return new o011OIooio[i];
                        case PoseLandmark.RIGHT_INDEX:
/* 33 */                    return new o01IIOl01[i];
                        case PoseLandmark.LEFT_THUMB:
/* 30 */                    return new l1O11O[i];
                        case PoseLandmark.RIGHT_THUMB:
/* 27 */                    return new o0Il0Ii1[i];
                        case PoseLandmark.LEFT_HIP:
/* 24 */                    return new l1ol1ilIlOo0[i];
                        case PoseLandmark.RIGHT_HIP:
/* 21 */                    return new OOoioIi1IOio[i];
                        case PoseLandmark.LEFT_KNEE:
/* 18 */                    return new o0liol1[i];
                        case PoseLandmark.RIGHT_KNEE:
/* 15 */                    return new lIOloiIol[i];
                        case 27:
/* 12 */                    return new o0oOI0O[i];
                        case PoseLandmark.RIGHT_ANKLE:
/* 9 */                     return new o0ll1o0lIoll[i];
                        default:
/* 6 */                     return new o0llolO1Iol[i];
                    }
                }
            }

            package p000;

            import android.graphics.Point;
            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.ParcelFileDescriptor;
            import android.os.Parcelable;
            import com.google.ai.edge.gallery.BuildConfig;
            import com.google.mlkit.vision.common.InputImage;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            
            public final class iIlI1lioo0lO implements Parcelable.Creator {
                public final int I00000oIO;

                public iIlI1lioo0lO(int i) {
/* 1 */             this.I00000oIO = i;
                }

                public static void I00000oIO(ii0oooi0IO0l ii0oooi0io0l, Parcel parcel, int i) {
/* 1 */             String str = ii0oooi0io0l.I00iOIl;
/* 5 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000OiO(parcel, 2, str);
/* 16 */            lO0IioIooIl.I000OOo1O(parcel, 3, ii0oooi0io0l.I00iiI, i);
/* 22 */            lO0IioIooIl.I000OiO(parcel, 4, ii0oooi0io0l.I00iiO);
/* 25 */            long j = ii0oooi0io0l.I00iio;
/* 30 */            lO0IioIooIl.I000oI1ioi(parcel, 5, 8);
/* 33 */            parcel.writeLong(j);
/* 36 */            long j2 = ii0oooi0io0l.I00ilI0I1;
/* 39 */            lO0IioIooIl.I000oI1ioi(parcel, 6, 8);
/* 42 */            parcel.writeLong(j2);
/* 45 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }

                @Override
                public final Object createFromParcel(Parcel parcel) {
                    i1Oilo0O1i o10loioiVar;
                    i1il1I i1il1i;
/* 8 */             double dI000o00OoI0I = 0.0d;
/* 10 */            float fI00100l0 = 0.0f;
/* 16 */            int iI0010I0i = 0;
/* 16 */            int iI0010I0i2 = 0;
/* 16 */            boolean zI000lI = false;
/* 16 */            int iI0010I0i3 = 0;
/* 16 */            boolean zI000lI2 = false;
/* 16 */            int iI0010I0i4 = 0;
/* 16 */            int iI0010I0i5 = 0;
/* 16 */            boolean zI000lI3 = false;
/* 16 */            boolean zI000lI4 = false;
                    switch (this.I00000oIO) {
                        case 0:
/* 2746 */                  int iI001i1O0Ol = lO0Iil10.I001i1O0Ol(parcel);
/* 2750 */                  String strI000II = null;
/* 2755 */                  while (parcel.dataPosition() < iI001i1O0Ol) {
/* 2757 */                      int i = parcel.readInt();
/* 2762 */                      if (((char) i) != 1) {
/* 2764 */                          lO0Iil10.I001IO000(i, parcel);
                                } else {
/* 2768 */                          strI000II = lO0Iil10.I000II(i, parcel);
                                }
                            }
/* 2773 */                  lO0Iil10.I000l1(iI001i1O0Ol, parcel);
/* 2778 */                  return new iIiiii0loOl0(strI000II);
                        case 1:
/* 2703 */                  int iI001i1O0Ol2 = lO0Iil10.I001i1O0Ol(parcel);
/* 2707 */                  String[] strArrI000O01llI0 = null;
/* 2712 */                  while (parcel.dataPosition() < iI001i1O0Ol2) {
/* 2714 */                      int i2 = parcel.readInt();
/* 2718 */                      char c = (char) i2;
/* 2719 */                      if (c == 1) {
/* 2732 */                          iI0010I0i = lO0Iil10.I0010I0i(i2, parcel);
                                } else if (c != 2) {
/* 2723 */                          lO0Iil10.I001IO000(i2, parcel);
                                } else {
/* 2727 */                          strArrI000O01llI0 = lO0Iil10.I000O01llI0(i2, parcel);
                                }
                            }
/* 2737 */                  lO0Iil10.I000l1(iI001i1O0Ol2, parcel);
/* 2742 */                  return new iIo00l0loI0l(iI0010I0i, strArrI000O01llI0);
                        case 2:
/* 2668 */                  int iI001i1O0Ol3 = lO0Iil10.I001i1O0Ol(parcel);
/* 2676 */                  while (parcel.dataPosition() < iI001i1O0Ol3) {
/* 2678 */                      int i3 = parcel.readInt();
/* 2683 */                      if (((char) i3) != 1) {
/* 2685 */                          lO0Iil10.I001IO000(i3, parcel);
                                } else {
/* 2689 */                          zI000lI4 = lO0Iil10.I000lI(i3, parcel);
                                }
                            }
/* 2694 */                  lO0Iil10.I000l1(iI001i1O0Ol3, parcel);
/* 2699 */                  return new iIloloioo0(zI000lI4);
                        case 3:
/* 2633 */                  int iI001i1O0Ol4 = lO0Iil10.I001i1O0Ol(parcel);
/* 2641 */                  while (parcel.dataPosition() < iI001i1O0Ol4) {
/* 2643 */                      int i4 = parcel.readInt();
/* 2648 */                      if (((char) i4) != 1) {
/* 2650 */                          lO0Iil10.I001IO000(i4, parcel);
                                } else {
/* 2654 */                          zI000lI3 = lO0Iil10.I000lI(i4, parcel);
                                }
                            }
/* 2659 */                  lO0Iil10.I000l1(iI001i1O0Ol4, parcel);
/* 2664 */                  return new iIloolIi1ii(zI000lI3);
                        case 4:
/* 2448 */                  int iI001i1O0Ol5 = lO0Iil10.I001i1O0Ol(parcel);
/* 2452 */                  int iI0010I0i6 = 0;
/* 2453 */                  int iI0010I0i7 = 0;
/* 2454 */                  int iI0010I0i8 = 0;
/* 2455 */                  int iI0010I0i9 = 0;
/* 2456 */                  int iI0010I0i10 = 0;
/* 2457 */                  int iI0010I0i11 = 0;
/* 2458 */                  ArrayList arrayListI000iOII = null;
/* 2459 */                  IBinder iBinderI00100o1O0lo = null;
/* 2460 */                  IBinder iBinderI00100o1O0lo2 = null;
/* 2461 */                  iIIoIliI0I11 iiioilii0i11 = null;
/* 2466 */                  while (parcel.dataPosition() < iI001i1O0Ol5) {
/* 2468 */                      int i5 = parcel.readInt();
                                switch ((char) i5) {
                                    case 1:
/* 2543 */                              arrayListI000iOII = lO0Iil10.I000iOII(parcel, i5, iIiiii0loOl0.CREATOR);
                                        break;
                                    case 2:
/* 2536 */                              fI00100l0 = lO0Iil10.I00100l0(i5, parcel);
                                        break;
                                    case 3:
/* 2531 */                              iI0010I0i5 = lO0Iil10.I0010I0i(i5, parcel);
                                        break;
                                    case 4:
/* 2526 */                              iI0010I0i6 = lO0Iil10.I0010I0i(i5, parcel);
                                        break;
                                    case 5:
/* 2521 */                              iI0010I0i7 = lO0Iil10.I0010I0i(i5, parcel);
                                        break;
                                    case 6:
/* 2516 */                              iBinderI00100o1O0lo = lO0Iil10.I00100o1O0lo(i5, parcel);
                                        break;
                                    case 7:
/* 2511 */                              iI0010I0i8 = lO0Iil10.I0010I0i(i5, parcel);
                                        break;
                                    case '\b':
/* 2506 */                              iI0010I0i9 = lO0Iil10.I0010I0i(i5, parcel);
                                        break;
                                    case '\t':
/* 2501 */                              iBinderI00100o1O0lo2 = lO0Iil10.I00100o1O0lo(i5, parcel);
                                        break;
                                    case '\n':
/* 2496 */                              iI0010I0i10 = lO0Iil10.I0010I0i(i5, parcel);
                                        break;
                                    case 11:
/* 2493 */                              iiioilii0i11 = (iIIoIliI0I11) lO0Iil10.I0001Ioi1lo(parcel, i5, iIIoIliI0I11.CREATOR);
                                        break;
                                    case '\f':
/* 2481 */                              iI0010I0i11 = lO0Iil10.I0010I0i(i5, parcel);
                                        break;
                                    default:
/* 2476 */                              lO0Iil10.I001IO000(i5, parcel);
                                        break;
                                }
                            }
/* 2548 */                  lO0Iil10.I000l1(iI001i1O0Ol5, parcel);
/* 2553 */                  iIo000iolIl iio000iolil = new iIo000iolIl();
/* 2560 */                  iio000iolil.I00iOIl = io0o00I1ol1o.I000o00OoI0I(arrayListI000iOII);
/* 2562 */                  iio000iolil.I00iiI = fI00100l0;
/* 2564 */                  iio000iolil.I00iiO = iI0010I0i5;
/* 2566 */                  iio000iolil.I00iio = iI0010I0i6;
/* 2568 */                  iio000iolil.I00ilI0I1 = iI0010I0i7;
/* 2570 */                  if (iBinderI00100o1O0lo == null) {
/* 2572 */                      o10loioiVar = null;
                            } else {
/* 2576 */                      IInterface iInterfaceQueryLocalInterface = iBinderI00100o1O0lo.queryLocalInterface("com.google.android.apps.aicore.aidl.ISummarizationStreamingCallback");
/* 2590 */                      o10loioiVar = iInterfaceQueryLocalInterface instanceof i1Oilo0O1i ? (i1Oilo0O1i) iInterfaceQueryLocalInterface : new o10loioi(iBinderI00100o1O0lo, "com.google.android.apps.aicore.aidl.ISummarizationStreamingCallback", 5);
                            }
/* 2593 */                  iio000iolil.I00ilO0 = o10loioiVar;
/* 2595 */                  iio000iolil.I00io1l = iI0010I0i8;
/* 2597 */                  iio000iolil.I00ioIO = iI0010I0i9;
/* 2599 */                  if (iBinderI00100o1O0lo2 == null) {
/* 2601 */                      i1il1i = null;
                            } else {
/* 2605 */                      IInterface iInterfaceQueryLocalInterface2 = iBinderI00100o1O0lo2.queryLocalInterface("com.google.android.apps.aicore.aidl.ITaskStateChangeCallback");
/* 2620 */                      i1il1i = iInterfaceQueryLocalInterface2 instanceof i1il1I ? (i1il1I) iInterfaceQueryLocalInterface2 : new i1il1I(iBinderI00100o1O0lo2, "com.google.android.apps.aicore.aidl.ITaskStateChangeCallback", 5);
                            }
/* 2624 */                  iio000iolil.I00ll1 = i1il1i;
/* 2626 */                  iio000iolil.I00l0I0l0lO1 = iI0010I0i10;
/* 2628 */                  iio000iolil.I00l0OO0IO = iiioilii0i11;
/* 2630 */                  iio000iolil.I00li1OI = iI0010I0i11;
/* 2632 */                  return iio000iolil;
                        case 5:
/* 2369 */                  int iI001i1O0Ol6 = lO0Iil10.I001i1O0Ol(parcel);
/* 2373 */                  long jI0010o = 0;
/* 2375 */                  int iI0010I0i12 = 0;
/* 2376 */                  int iI0010I0i13 = 0;
/* 2377 */                  int iI0010I0i14 = 0;
/* 2379 */                  int iI0010I0i15 = 0;
/* 2385 */                  while (parcel.dataPosition() < iI001i1O0Ol6) {
/* 2387 */                      int i6 = parcel.readInt();
/* 2391 */                      char c2 = (char) i6;
/* 2392 */                      if (c2 == 2) {
/* 2433 */                          iI0010I0i12 = lO0Iil10.I0010I0i(i6, parcel);
                                } else if (c2 == 3) {
/* 2427 */                          iI0010I0i13 = lO0Iil10.I0010I0i(i6, parcel);
                                } else if (c2 == 4) {
/* 2420 */                          iI0010I0i14 = lO0Iil10.I0010I0i(i6, parcel);
                                } else if (c2 == 5) {
/* 2413 */                          jI0010o = lO0Iil10.I0010o(i6, parcel);
                                } else if (c2 != 6) {
/* 2402 */                          lO0Iil10.I001IO000(i6, parcel);
                                } else {
/* 2406 */                          iI0010I0i15 = lO0Iil10.I0010I0i(i6, parcel);
                                }
                            }
/* 2439 */                  lO0Iil10.I000l1(iI001i1O0Ol6, parcel);
/* 2444 */                  return new iIolOl1lo1(iI0010I0i12, iI0010I0i13, iI0010I0i14, jI0010o, iI0010I0i15);
                        case 6:
/* 2333 */                  int iI001i1O0Ol7 = lO0Iil10.I001i1O0Ol(parcel);
/* 2337 */                  Bundle bundleI00000oIO = null;
/* 2342 */                  while (parcel.dataPosition() < iI001i1O0Ol7) {
/* 2344 */                      int i7 = parcel.readInt();
/* 2349 */                      if (((char) i7) != 1) {
/* 2351 */                          lO0Iil10.I001IO000(i7, parcel);
                                } else {
/* 2355 */                          bundleI00000oIO = lO0Iil10.I00000oIO(i7, parcel);
                                }
                            }
/* 2360 */                  lO0Iil10.I000l1(iI001i1O0Ol7, parcel);
/* 2365 */                  return new iO0Ol0ol(bundleI00000oIO);
                        case 7:
/* 2261 */                  int iI001i1O0Ol8 = lO0Iil10.I001i1O0Ol(parcel);
/* 2265 */                  float fI00100l02 = 1.0f;
/* 2267 */                  i1oloIlo0o1o i1oloilo0o1o = null;
/* 2268 */                  ArrayList arrayListI000iOII2 = null;
/* 2273 */                  while (parcel.dataPosition() < iI001i1O0Ol8) {
/* 2275 */                      int i8 = parcel.readInt();
/* 2279 */                      char c3 = (char) i8;
/* 2280 */                      if (c3 == 1) {
/* 2306 */                          arrayListI000iOII2 = lO0Iil10.I000iOII(parcel, i8, iI1IIiI1oo1.CREATOR);
                                } else if (c3 == 2) {
/* 2301 */                          i1oloilo0o1o = (i1oloIlo0o1o) lO0Iil10.I0001Ioi1lo(parcel, i8, i1oloIlo0o1o.CREATOR);
                                } else if (c3 != 3) {
/* 2286 */                          lO0Iil10.I001IO000(i8, parcel);
                                } else {
/* 2290 */                          fI00100l02 = lO0Iil10.I00100l0(i8, parcel);
                                }
                            }
/* 2311 */                  lO0Iil10.I000l1(iI001i1O0Ol8, parcel);
/* 2316 */                  iO0i0o1l1Ii io0i0o1l1ii = new iO0i0o1l1Ii();
/* 2323 */                  io0i0o1l1ii.I00iOIl = io0o00I1ol1o.I000o00OoI0I(arrayListI000iOII2);
/* 2325 */                  io0i0o1l1ii.I00iiI = i1oloilo0o1o;
/* 2327 */                  io0i0o1l1ii.I00iiO = fI00100l02;
/* 2329 */                  VarHandle.storeStoreFence();
/* 2332 */                  return io0i0o1l1ii;
                        case 8:
/* 2063 */                  int iI001i1O0Ol9 = lO0Iil10.I001i1O0Ol(parcel);
/* 2067 */                  int iI0010I0i16 = 0;
/* 2068 */                  int iI0010I0i17 = 0;
/* 2070 */                  String strI000II2 = null;
/* 2071 */                  String strI000II3 = null;
/* 2072 */                  byte[] bArrI00000oOI = null;
/* 2074 */                  Point[] pointArr = null;
/* 2076 */                  iOIIo0i ioiio0i = null;
/* 2078 */                  iOiIOl1lOlI ioiiol1loli = null;
/* 2080 */                  iOioOI0o00 ioiooi0o00 = null;
/* 2082 */                  iOli1io ioli1io = null;
/* 2084 */                  iOlI0l0l1oi0 ioli0l0l1oi0 = null;
/* 2086 */                  iOIoiol1O ioioiol1o = null;
/* 2088 */                  iO0i0ooI io0i0ooi = null;
/* 2090 */                  iO111II io111ii = null;
/* 2092 */                  iO1iIl01Il0l io1iil01il0l = null;
/* 2098 */                  while (parcel.dataPosition() < iI001i1O0Ol9) {
/* 2100 */                      int i9 = parcel.readInt();
                                switch ((char) i9) {
                                    case 1:
/* 2246 */                              iI0010I0i16 = lO0Iil10.I0010I0i(i9, parcel);
                                        break;
                                    case 2:
/* 2240 */                              strI000II2 = lO0Iil10.I000II(i9, parcel);
                                        break;
                                    case 3:
/* 2234 */                              strI000II3 = lO0Iil10.I000II(i9, parcel);
                                        break;
                                    case 4:
/* 2228 */                              bArrI00000oOI = lO0Iil10.I00000oOI(i9, parcel);
                                        break;
                                    case 5:
/* 2224 */                              pointArr = (Point[]) lO0Iil10.I000OiO(parcel, i9, Point.CREATOR);
                                        break;
                                    case 6:
/* 2211 */                              iI0010I0i17 = lO0Iil10.I0010I0i(i9, parcel);
                                        break;
                                    case 7:
/* 2208 */                              ioiio0i = (iOIIo0i) lO0Iil10.I0001Ioi1lo(parcel, i9, iOIIo0i.CREATOR);
                                        break;
                                    case '\b':
/* 2197 */                              ioiiol1loli = (iOiIOl1lOlI) lO0Iil10.I0001Ioi1lo(parcel, i9, iOiIOl1lOlI.CREATOR);
                                        break;
                                    case '\t':
/* 2186 */                              ioiooi0o00 = (iOioOI0o00) lO0Iil10.I0001Ioi1lo(parcel, i9, iOioOI0o00.CREATOR);
                                        break;
                                    case '\n':
/* 2175 */                              ioli1io = (iOli1io) lO0Iil10.I0001Ioi1lo(parcel, i9, iOli1io.CREATOR);
                                        break;
                                    case 11:
/* 2164 */                              ioli0l0l1oi0 = (iOlI0l0l1oi0) lO0Iil10.I0001Ioi1lo(parcel, i9, iOlI0l0l1oi0.CREATOR);
                                        break;
                                    case '\f':
/* 2153 */                              ioioiol1o = (iOIoiol1O) lO0Iil10.I0001Ioi1lo(parcel, i9, iOIoiol1O.CREATOR);
                                        break;
                                    case '\r':
/* 2142 */                              io0i0ooi = (iO0i0ooI) lO0Iil10.I0001Ioi1lo(parcel, i9, iO0i0ooI.CREATOR);
                                        break;
                                    case 14:
/* 2131 */                              io111ii = (iO111II) lO0Iil10.I0001Ioi1lo(parcel, i9, iO111II.CREATOR);
                                        break;
                                    case 15:
/* 2120 */                              io1iil01il0l = (iO1iIl01Il0l) lO0Iil10.I0001Ioi1lo(parcel, i9, iO1iIl01Il0l.CREATOR);
                                        break;
                                    default:
/* 2108 */                              lO0Iil10.I001IO000(i9, parcel);
                                        break;
                                }
                            }
/* 2252 */                  lO0Iil10.I000l1(iI001i1O0Ol9, parcel);
/* 2257 */                  return new iOlo0iOI1i(iI0010I0i16, strI000II2, strI000II3, bArrI00000oOI, pointArr, iI0010I0i17, ioiio0i, ioiiol1loli, ioiooi0o00, ioli1io, ioli0l0l1oi0, ioioiol1o, io0i0ooi, io111ii, io1iil01il0l);
                        case 9:
/* 2059 */                  return new il1IIi0oI(parcel.readStrongBinder());
                        case 10:
/* 1981 */                  int iI001i1O0Ol10 = lO0Iil10.I001i1O0Ol(parcel);
/* 1987 */                  long jI0010o2 = -1;
/* 1989 */                  int iI0010I0i18 = 0;
/* 1991 */                  boolean zI000lI5 = false;
/* 1993 */                  String strI000II4 = null;
/* 1998 */                  while (parcel.dataPosition() < iI001i1O0Ol10) {
/* 2000 */                      int i10 = parcel.readInt();
/* 2004 */                      char c4 = (char) i10;
/* 2005 */                      if (c4 == 1) {
/* 2038 */                          strI000II4 = lO0Iil10.I000II(i10, parcel);
                                } else if (c4 == 2) {
/* 2031 */                          iI0010I0i18 = lO0Iil10.I0010I0i(i10, parcel);
                                } else if (c4 == 3) {
/* 2024 */                          jI0010o2 = lO0Iil10.I0010o(i10, parcel);
                                } else if (c4 != 4) {
/* 2013 */                          lO0Iil10.I001IO000(i10, parcel);
                                } else {
/* 2017 */                          zI000lI5 = lO0Iil10.I000lI(i10, parcel);
                                }
                            }
/* 2044 */                  lO0Iil10.I000l1(iI001i1O0Ol10, parcel);
/* 2049 */                  return new IlIII1l(strI000II4, iI0010I0i18, jI0010o2, zI000lI5);
                        case 11:
/* 1931 */                  int iI001i1O0Ol11 = lO0Iil10.I001i1O0Ol(parcel);
/* 1935 */                  boolean zI000lI6 = false;
/* 1940 */                  while (parcel.dataPosition() < iI001i1O0Ol11) {
/* 1942 */                      int i11 = parcel.readInt();
/* 1946 */                      char c5 = (char) i11;
/* 1947 */                      if (c5 == 1) {
/* 1960 */                          iI0010I0i4 = lO0Iil10.I0010I0i(i11, parcel);
                                } else if (c5 != 2) {
/* 1951 */                          lO0Iil10.I001IO000(i11, parcel);
                                } else {
/* 1955 */                          zI000lI6 = lO0Iil10.I000lI(i11, parcel);
                                }
                            }
/* 1965 */                  lO0Iil10.I000l1(iI001i1O0Ol11, parcel);
/* 1970 */                  iOoOoOOI1 iooooooi1 = new iOoOoOOI1();
/* 1973 */                  iooooooi1.I00iOIl = iI0010I0i4;
/* 1975 */                  iooooooi1.I00iiI = zI000lI6;
/* 1977 */                  VarHandle.storeStoreFence();
/* 1980 */                  return iooooooi1;
                        case 12:
/* 1856 */                  int iI001i1O0Ol12 = lO0Iil10.I001i1O0Ol(parcel);
/* 1860 */                  iiOolIi0 iioolii0 = null;
/* 1861 */                  iiOi1ioO iioi1ioo = null;
/* 1866 */                  while (parcel.dataPosition() < iI001i1O0Ol12) {
/* 1868 */                      int i12 = parcel.readInt();
/* 1872 */                      char c6 = (char) i12;
/* 1873 */                      if (c6 == 1) {
/* 1910 */                          iioi1ioo = (iiOi1ioO) lO0Iil10.I0001Ioi1lo(parcel, i12, iiOi1ioO.CREATOR);
                                } else if (c6 == 2) {
/* 1900 */                          iioolii0 = (iiOolIi0) lO0Iil10.I0001Ioi1lo(parcel, i12, iiOolIi0.CREATOR);
                                } else if (c6 == 3) {
/* 1890 */                          lO0Iil10.I000lI(i12, parcel);
                                } else if (c6 != 4) {
/* 1881 */                          lO0Iil10.I001IO000(i12, parcel);
                                } else {
/* 1885 */                          zI000lI2 = lO0Iil10.I000lI(i12, parcel);
                                }
                            }
/* 1913 */                  lO0Iil10.I000l1(iI001i1O0Ol12, parcel);
/* 1918 */                  ii00i0iiOOOo ii00i0iioooo = new ii00i0iiOOOo();
/* 1921 */                  ii00i0iioooo.I00iOIl = iioi1ioo;
/* 1923 */                  ii00i0iioooo.I00iiI = iioolii0;
/* 1925 */                  ii00i0iioooo.I00iiO = zI000lI2;
/* 1927 */                  VarHandle.storeStoreFence();
/* 1930 */                  return ii00i0iioooo;
                        case 13:
/* 1810 */                  int iI001i1O0Ol13 = lO0Iil10.I001i1O0Ol(parcel);
/* 1814 */                  iiO1OI iio1oi = null;
/* 1819 */                  while (parcel.dataPosition() < iI001i1O0Ol13) {
/* 1821 */                      int i13 = parcel.readInt();
/* 1826 */                      if (((char) i13) != 1) {
/* 1828 */                          lO0Iil10.I001IO000(i13, parcel);
                                } else {
/* 1839 */                          iio1oi = (iiO1OI) lO0Iil10.I0001Ioi1lo(parcel, i13, iiO1OI.CREATOR);
                                }
                            }
/* 1842 */                  lO0Iil10.I000l1(iI001i1O0Ol13, parcel);
/* 1847 */                  ii0IlI0 ii0ili0 = new ii0IlI0();
/* 1850 */                  ii0ili0.I00iOIl = iio1oi;
/* 1852 */                  VarHandle.storeStoreFence();
/* 1855 */                  return ii0ili0;
                        case 14:
/* 1774 */                  int iI001i1O0Ol14 = lO0Iil10.I001i1O0Ol(parcel);
/* 1778 */                  Bundle bundleI00000oIO2 = null;
/* 1783 */                  while (parcel.dataPosition() < iI001i1O0Ol14) {
/* 1785 */                      int i14 = parcel.readInt();
/* 1790 */                      if (((char) i14) != 2) {
/* 1792 */                          lO0Iil10.I001IO000(i14, parcel);
                                } else {
/* 1796 */                          bundleI00000oIO2 = lO0Iil10.I00000oIO(i14, parcel);
                                }
                            }
/* 1801 */                  lO0Iil10.I000l1(iI001i1O0Ol14, parcel);
/* 1806 */                  return new ii0il0lOolIo(bundleI00000oIO2);
                        case 15:
/* 1695 */                  int iI001i1O0Ol15 = lO0Iil10.I001i1O0Ol(parcel);
/* 1699 */                  int iI0010I0i19 = 0;
/* 1700 */                  int iI0010I0i20 = 0;
/* 1701 */                  int iI0010I0i21 = 0;
/* 1702 */                  int iI0010I0i22 = 0;
/* 1703 */                  int iI0010I0i23 = 0;
/* 1704 */                  int iI0010I0i24 = 0;
/* 1705 */                  boolean zI000lI7 = false;
/* 1706 */                  String strI000II5 = null;
/* 1711 */                  while (parcel.dataPosition() < iI001i1O0Ol15) {
/* 1713 */                      int i15 = parcel.readInt();
                                switch ((char) i15) {
                                    case 1:
/* 1760 */                              iI0010I0i19 = lO0Iil10.I0010I0i(i15, parcel);
                                        break;
                                    case 2:
/* 1755 */                              iI0010I0i20 = lO0Iil10.I0010I0i(i15, parcel);
                                        break;
                                    case 3:
/* 1750 */                              iI0010I0i21 = lO0Iil10.I0010I0i(i15, parcel);
                                        break;
                                    case 4:
/* 1745 */                              iI0010I0i22 = lO0Iil10.I0010I0i(i15, parcel);
                                        break;
                                    case 5:
/* 1740 */                              iI0010I0i23 = lO0Iil10.I0010I0i(i15, parcel);
                                        break;
                                    case 6:
/* 1735 */                              iI0010I0i24 = lO0Iil10.I0010I0i(i15, parcel);
                                        break;
                                    case 7:
/* 1730 */                              zI000lI7 = lO0Iil10.I000lI(i15, parcel);
                                        break;
                                    case '\b':
/* 1725 */                              strI000II5 = lO0Iil10.I000II(i15, parcel);
                                        break;
                                    default:
/* 1721 */                              lO0Iil10.I001IO000(i15, parcel);
                                        break;
                                }
                            }
/* 1765 */                  lO0Iil10.I000l1(iI001i1O0Ol15, parcel);
/* 1770 */                  return new iIoliO(iI0010I0i19, iI0010I0i20, iI0010I0i21, iI0010I0i22, iI0010I0i23, iI0010I0i24, zI000lI7, strI000II5);
                        case 16:
/* 1614 */                  int iI001i1O0Ol16 = lO0Iil10.I001i1O0Ol(parcel);
/* 1618 */                  String strI000II6 = null;
/* 1619 */                  String strI000II7 = null;
/* 1620 */                  String strI000II8 = null;
/* 1621 */                  String strI000II9 = null;
/* 1622 */                  String strI000II10 = null;
/* 1623 */                  iIoliO iiolio = null;
/* 1624 */                  iIoliO iiolio2 = null;
/* 1629 */                  while (parcel.dataPosition() < iI001i1O0Ol16) {
/* 1631 */                      int i16 = parcel.readInt();
                                switch ((char) i16) {
                                    case 1:
/* 1681 */                              strI000II6 = lO0Iil10.I000II(i16, parcel);
                                        break;
                                    case 2:
/* 1676 */                              strI000II7 = lO0Iil10.I000II(i16, parcel);
                                        break;
                                    case 3:
/* 1671 */                              strI000II8 = lO0Iil10.I000II(i16, parcel);
                                        break;
                                    case 4:
/* 1666 */                              strI000II9 = lO0Iil10.I000II(i16, parcel);
                                        break;
                                    case 5:
/* 1661 */                              strI000II10 = lO0Iil10.I000II(i16, parcel);
                                        break;
                                    case 6:
/* 1658 */                              iiolio = (iIoliO) lO0Iil10.I0001Ioi1lo(parcel, i16, iIoliO.CREATOR);
                                        break;
                                    case 7:
/* 1649 */                              iiolio2 = (iIoliO) lO0Iil10.I0001Ioi1lo(parcel, i16, iIoliO.CREATOR);
                                        break;
                                    default:
/* 1639 */                              lO0Iil10.I001IO000(i16, parcel);
                                        break;
                                }
                            }
/* 1686 */                  lO0Iil10.I000l1(iI001i1O0Ol16, parcel);
/* 1691 */                  return new iO0i0ooI(strI000II6, strI000II7, strI000II8, strI000II9, strI000II10, iiolio, iiolio2);
                        case 17:
/* 1531 */                  int iI001i1O0Ol17 = lO0Iil10.I001i1O0Ol(parcel);
/* 1535 */                  long jI0010o3 = 0;
/* 1537 */                  long jI0010o4 = 0;
/* 1539 */                  String strI000II11 = null;
/* 1540 */                  ii0il0lOolIo ii0il0loolio = null;
/* 1541 */                  String strI000II12 = null;
/* 1547 */                  while (parcel.dataPosition() < iI001i1O0Ol17) {
/* 1549 */                      int i17 = parcel.readInt();
/* 1553 */                      char c7 = (char) i17;
/* 1554 */                      if (c7 == 2) {
/* 1599 */                          strI000II11 = lO0Iil10.I000II(i17, parcel);
                                } else if (c7 == 3) {
/* 1595 */                          ii0il0loolio = (ii0il0lOolIo) lO0Iil10.I0001Ioi1lo(parcel, i17, ii0il0lOolIo.CREATOR);
                                } else if (c7 == 4) {
/* 1582 */                          strI000II12 = lO0Iil10.I000II(i17, parcel);
                                } else if (c7 == 5) {
/* 1575 */                          jI0010o3 = lO0Iil10.I0010o(i17, parcel);
                                } else if (c7 != 6) {
/* 1564 */                          lO0Iil10.I001IO000(i17, parcel);
                                } else {
/* 1568 */                          jI0010o4 = lO0Iil10.I0010o(i17, parcel);
                                }
                            }
/* 1605 */                  lO0Iil10.I000l1(iI001i1O0Ol17, parcel);
/* 1610 */                  return new ii0oooi0IO0l(strI000II11, ii0il0loolio, strI000II12, jI0010o3, jI0010o4);
                        case PoseLandmark.RIGHT_PINKY:
/* 1442 */                  int iI001i1O0Ol18 = lO0Iil10.I001i1O0Ol(parcel);
/* 1446 */                  iOOioi1O0I1i iooioi1o0i1i = null;
/* 1447 */                  String strI000II13 = null;
/* 1448 */                  String strI000II14 = null;
/* 1449 */                  iOiIOl1lOlI[] ioiiol1loliArr = null;
/* 1450 */                  iOIIo0i[] ioiio0iArr = null;
/* 1451 */                  String[] strArrI000O01llI02 = null;
/* 1452 */                  iIo00l0loI0l[] iio00l0loi0lArr = null;
/* 1457 */                  while (parcel.dataPosition() < iI001i1O0Ol18) {
/* 1459 */                      int i18 = parcel.readInt();
                                switch ((char) i18) {
                                    case 1:
/* 1519 */                              iooioi1o0i1i = (iOOioi1O0I1i) lO0Iil10.I0001Ioi1lo(parcel, i18, iOOioi1O0I1i.CREATOR);
                                        break;
                                    case 2:
/* 1508 */                              strI000II13 = lO0Iil10.I000II(i18, parcel);
                                        break;
                                    case 3:
/* 1503 */                              strI000II14 = lO0Iil10.I000II(i18, parcel);
                                        break;
                                    case 4:
/* 1500 */                              ioiiol1loliArr = (iOiIOl1lOlI[]) lO0Iil10.I000OiO(parcel, i18, iOiIOl1lOlI.CREATOR);
                                        break;
                                    case 5:
/* 1491 */                              ioiio0iArr = (iOIIo0i[]) lO0Iil10.I000OiO(parcel, i18, iOIIo0i.CREATOR);
                                        break;
                                    case 6:
/* 1480 */                              strArrI000O01llI02 = lO0Iil10.I000O01llI0(i18, parcel);
                                        break;
                                    case 7:
/* 1477 */                              iio00l0loi0lArr = (iIo00l0loI0l[]) lO0Iil10.I000OiO(parcel, i18, iIo00l0loI0l.CREATOR);
                                        break;
                                    default:
/* 1467 */                              lO0Iil10.I001IO000(i18, parcel);
                                        break;
                                }
                            }
/* 1522 */                  lO0Iil10.I000l1(iI001i1O0Ol18, parcel);
/* 1527 */                  return new iO111II(iooioi1o0i1i, strI000II13, strI000II14, ioiiol1loliArr, ioiio0iArr, strArrI000O01llI02, iio00l0loi0lArr);
                        case PoseLandmark.LEFT_INDEX:
/* 1316 */                  int iI001i1O0Ol19 = lO0Iil10.I001i1O0Ol(parcel);
/* 1320 */                  String strI000II15 = null;
/* 1322 */                  String strI000II16 = null;
/* 1323 */                  String strI000II17 = null;
/* 1324 */                  String strI000II18 = null;
/* 1325 */                  String strI000II19 = null;
/* 1326 */                  String strI000II20 = null;
/* 1327 */                  String strI000II21 = null;
/* 1328 */                  String strI000II22 = null;
/* 1329 */                  String strI000II23 = null;
/* 1330 */                  String strI000II24 = null;
/* 1331 */                  String strI000II25 = null;
/* 1332 */                  String strI000II26 = null;
/* 1333 */                  String strI000II27 = null;
/* 1334 */                  String strI000II28 = null;
/* 1339 */                  while (parcel.dataPosition() < iI001i1O0Ol19) {
/* 1341 */                      int i19 = parcel.readInt();
/* 1345 */                      String str = strI000II16;
                                switch ((char) i19) {
                                    case 1:
/* 1422 */                              strI000II15 = lO0Iil10.I000II(i19, parcel);
                                        break;
                                    case 2:
/* 1417 */                              strI000II16 = lO0Iil10.I000II(i19, parcel);
                                        continue;
                                    case 3:
/* 1412 */                              strI000II17 = lO0Iil10.I000II(i19, parcel);
                                        break;
                                    case 4:
/* 1407 */                              strI000II18 = lO0Iil10.I000II(i19, parcel);
                                        break;
                                    case 5:
/* 1402 */                              strI000II19 = lO0Iil10.I000II(i19, parcel);
                                        break;
                                    case 6:
/* 1397 */                              strI000II20 = lO0Iil10.I000II(i19, parcel);
                                        break;
                                    case 7:
/* 1392 */                              strI000II21 = lO0Iil10.I000II(i19, parcel);
                                        break;
                                    case '\b':
/* 1387 */                              strI000II22 = lO0Iil10.I000II(i19, parcel);
                                        break;
                                    case '\t':
/* 1382 */                              strI000II23 = lO0Iil10.I000II(i19, parcel);
                                        break;
                                    case '\n':
/* 1377 */                              strI000II24 = lO0Iil10.I000II(i19, parcel);
                                        break;
                                    case 11:
/* 1372 */                              strI000II25 = lO0Iil10.I000II(i19, parcel);
                                        break;
                                    case '\f':
/* 1367 */                              strI000II26 = lO0Iil10.I000II(i19, parcel);
                                        break;
                                    case '\r':
/* 1362 */                              strI000II27 = lO0Iil10.I000II(i19, parcel);
                                        break;
                                    case 14:
/* 1357 */                              strI000II28 = lO0Iil10.I000II(i19, parcel);
                                        break;
                                    default:
/* 1351 */                              lO0Iil10.I001IO000(i19, parcel);
                                        break;
                                }
/* 1354 */                      strI000II16 = str;
                            }
/* 1431 */                  lO0Iil10.I000l1(iI001i1O0Ol19, parcel);
/* 1438 */                  return new iO1iIl01Il0l(strI000II15, strI000II16, strI000II17, strI000II18, strI000II19, strI000II20, strI000II21, strI000II22, strI000II23, strI000II24, strI000II25, strI000II26, strI000II27, strI000II28);
                        case PoseLandmark.RIGHT_INDEX:
/* 1257 */                  int iI001i1O0Ol20 = lO0Iil10.I001i1O0Ol(parcel);
/* 1261 */                  String strI000II29 = null;
/* 1262 */                  String strI000II30 = null;
/* 1263 */                  String strI000II31 = null;
/* 1268 */                  while (parcel.dataPosition() < iI001i1O0Ol20) {
/* 1270 */                      int i20 = parcel.readInt();
/* 1274 */                      char c8 = (char) i20;
/* 1275 */                      if (c8 == 1) {
/* 1302 */                          iI0010I0i3 = lO0Iil10.I0010I0i(i20, parcel);
                                } else if (c8 == 2) {
/* 1297 */                          strI000II31 = lO0Iil10.I000II(i20, parcel);
                                } else if (c8 == 3) {
/* 1292 */                          strI000II29 = lO0Iil10.I000II(i20, parcel);
                                } else if (c8 != 4) {
/* 1283 */                          lO0Iil10.I001IO000(i20, parcel);
                                } else {
/* 1287 */                          strI000II30 = lO0Iil10.I000II(i20, parcel);
                                }
                            }
/* 1307 */                  lO0Iil10.I000l1(iI001i1O0Ol20, parcel);
/* 1312 */                  return new iOIIo0i(iI0010I0i3, strI000II31, strI000II29, strI000II30);
                        case PoseLandmark.LEFT_THUMB:
/* 1213 */                  int iI001i1O0Ol21 = lO0Iil10.I001i1O0Ol(parcel);
/* 1217 */                  double dI000o00OoI0I2 = 0.0d;
/* 1222 */                  while (parcel.dataPosition() < iI001i1O0Ol21) {
/* 1224 */                      int i21 = parcel.readInt();
/* 1228 */                      char c9 = (char) i21;
/* 1229 */                      if (c9 == 1) {
/* 1242 */                          dI000o00OoI0I = lO0Iil10.I000o00OoI0I(i21, parcel);
                                } else if (c9 != 2) {
/* 1233 */                          lO0Iil10.I001IO000(i21, parcel);
                                } else {
/* 1237 */                          dI000o00OoI0I2 = lO0Iil10.I000o00OoI0I(i21, parcel);
                                }
                            }
/* 1248 */                  lO0Iil10.I000l1(iI001i1O0Ol21, parcel);
/* 1253 */                  return new iOIoiol1O(dI000o00OoI0I, dI000o00OoI0I2);
                        case PoseLandmark.RIGHT_THUMB:
/* 1167 */                  int iI001i1O0Ol22 = lO0Iil10.I001i1O0Ol(parcel);
/* 1171 */                  iioOoiIo1 iioooiio1 = null;
/* 1176 */                  while (parcel.dataPosition() < iI001i1O0Ol22) {
/* 1178 */                      int i22 = parcel.readInt();
/* 1183 */                      if (((char) i22) != 1) {
/* 1185 */                          lO0Iil10.I001IO000(i22, parcel);
                                } else {
/* 1196 */                          iioooiio1 = (iioOoiIo1) lO0Iil10.I0001Ioi1lo(parcel, i22, iioOoiIo1.CREATOR);
                                }
                            }
/* 1199 */                  lO0Iil10.I000l1(iI001i1O0Ol22, parcel);
/* 1204 */                  iiO010lI1iO iio010li1io = new iiO010lI1iO();
/* 1207 */                  iio010li1io.I00iOIl = iioooiio1;
/* 1209 */                  VarHandle.storeStoreFence();
/* 1212 */                  return iio010li1io;
                        case PoseLandmark.LEFT_HIP:
/* 1088 */                  int iI001i1O0Ol23 = lO0Iil10.I001i1O0Ol(parcel);
/* 1092 */                  boolean zI000lI8 = false;
/* 1093 */                  boolean zI000lI9 = false;
/* 1094 */                  byte[] bArrI00000oOI2 = null;
/* 1099 */                  while (parcel.dataPosition() < iI001i1O0Ol23) {
/* 1101 */                      int i23 = parcel.readInt();
/* 1105 */                      char c10 = (char) i23;
/* 1106 */                      if (c10 == 1) {
/* 1140 */                          zI000lI = lO0Iil10.I000lI(i23, parcel);
                                } else if (c10 == 2) {
/* 1135 */                          bArrI00000oOI2 = lO0Iil10.I00000oOI(i23, parcel);
                                } else if (c10 == 3) {
/* 1130 */                          zI000lI8 = lO0Iil10.I000lI(i23, parcel);
                                } else if (c10 == 4) {
/* 1125 */                          fI00100l0 = lO0Iil10.I00100l0(i23, parcel);
                                } else if (c10 != 5) {
/* 1116 */                          lO0Iil10.I001IO000(i23, parcel);
                                } else {
/* 1120 */                          zI000lI9 = lO0Iil10.I000lI(i23, parcel);
                                }
                            }
/* 1145 */                  lO0Iil10.I000l1(iI001i1O0Ol23, parcel);
/* 1150 */                  iiO1OI iio1oi2 = new iiO1OI();
/* 1153 */                  iio1oi2.I00iOIl = zI000lI;
/* 1155 */                  iio1oi2.I00iiI = bArrI00000oOI2;
/* 1157 */                  iio1oi2.I00iiO = zI000lI8;
/* 1159 */                  iio1oi2.I00iio = fI00100l0;
/* 1161 */                  iio1oi2.I00ilI0I1 = zI000lI9;
/* 1163 */                  VarHandle.storeStoreFence();
/* 1166 */                  return iio1oi2;
                        case PoseLandmark.RIGHT_HIP:
/* 303 */                   int iI001i1O0Ol24 = lO0Iil10.I001i1O0Ol(parcel);
/* 310 */                   int iI0010I0i25 = -1;
/* 312 */                   int iI0010I0i26 = -1;
/* 314 */                   int iI0010I0i27 = -1;
/* 316 */                   double dI000o00OoI0I3 = 0.0d;
/* 318 */                   double dI000o00OoI0I4 = 0.0d;
/* 320 */                   float fI00100l03 = 0.0f;
/* 322 */                   long jI0010o5 = 0;
/* 323 */                   long jI0010o6 = 0;
/* 325 */                   long jI0010o7 = 0;
/* 327 */                   long jI0010o8 = 0;
/* 329 */                   long jI0010o9 = 0;
/* 331 */                   long jI0010o10 = 0;
/* 333 */                   long jI0010o11 = 0;
/* 335 */                   long jI0010o12 = 0;
/* 337 */                   long jI0010o13 = 0;
/* 339 */                   long jI0010o14 = 0;
/* 341 */                   long jI0010o15 = 0;
/* 343 */                   long jI0010o16 = 0;
/* 345 */                   long jI0010o17 = 0;
/* 347 */                   long jI0010o18 = 0;
/* 349 */                   long jI0010o19 = 0;
/* 308 */                   String strI000II32 = "unknown";
/* 353 */                   int iI0010I0i28 = 0;
/* 354 */                   int iI0010I0i29 = 0;
/* 355 */                   int iI0010I0i30 = 0;
/* 356 */                   int iI0010I0i31 = 0;
/* 357 */                   int iI0010I0i32 = 0;
/* 358 */                   int iI0010I0i33 = 0;
/* 359 */                   int iI0010I0i34 = 0;
/* 361 */                   int iI0010I0i35 = 0;
/* 363 */                   int iI0010I0i36 = 0;
/* 365 */                   boolean zI000lI10 = false;
/* 367 */                   int iI0010I0i37 = 0;
/* 369 */                   int iI0010I0i38 = 0;
/* 371 */                   int iI0010I0i39 = 0;
/* 373 */                   int iI0010I0i40 = 0;
/* 375 */                   int iI0010I0i41 = 0;
/* 377 */                   int iI0010I0i42 = 0;
/* 379 */                   int iI0010I0i43 = 0;
/* 381 */                   int iI0010I0i44 = 0;
/* 383 */                   int iI0010I0i45 = 0;
/* 385 */                   int iI0010I0i46 = 0;
/* 387 */                   int iI0010I0i47 = 0;
/* 389 */                   int iI0010I0i48 = 0;
/* 391 */                   int iI0010I0i49 = 0;
/* 393 */                   int iI0010I0i50 = 0;
/* 395 */                   int iI0010I0i51 = 0;
/* 397 */                   byte[] bArrI00000oOI3 = null;
/* 399 */                   int[] iArrI0000oI00 = null;
/* 401 */                   byte[] bArrI00000oOI4 = null;
/* 403 */                   byte[] bArrI00000oOI5 = null;
/* 405 */                   long[] jArr = null;
/* 407 */                   byte[] bArrI00000oOI6 = null;
/* 409 */                   byte[] bArrI00000oOI7 = null;
/* 411 */                   long jI0010o20 = 0;
/* 413 */                   long jI0010o21 = 0;
/* 414 */                   int iI0010I0i52 = 0;
/* 420 */                   while (parcel.dataPosition() < iI001i1O0Ol24) {
/* 422 */                       int i24 = parcel.readInt();
/* 426 */                       long j = jI0010o5;
                                switch ((char) i24) {
                                    case 1:
/* 858 */                               iI0010I0i28 = lO0Iil10.I0010I0i(i24, parcel);
                                        break;
                                    case 2:
/* 852 */                               iI0010I0i32 = lO0Iil10.I0010I0i(i24, parcel);
                                        break;
                                    case 3:
/* 846 */                               iI0010I0i52 = lO0Iil10.I0010I0i(i24, parcel);
                                        break;
                                    case 4:
/* 840 */                               iI0010I0i31 = lO0Iil10.I0010I0i(i24, parcel);
                                        break;
                                    case 5:
/* 834 */                               jI0010o21 = lO0Iil10.I0010o(i24, parcel);
                                        break;
                                    case 6:
/* 828 */                               iI0010I0i29 = lO0Iil10.I0010I0i(i24, parcel);
                                        break;
                                    case 7:
/* 822 */                               iI0010I0i30 = lO0Iil10.I0010I0i(i24, parcel);
                                        break;
                                    case '\b':
/* 815 */                               iI0010I0i33 = lO0Iil10.I0010I0i(i24, parcel);
                                        break;
                                    case '\t':
/* 809 */                               jI0010o5 = lO0Iil10.I0010o(i24, parcel);
                                        continue;
                                    case '\n':
/* 801 */                               jI0010o19 = lO0Iil10.I0010o(i24, parcel);
                                        break;
                                    case 11:
/* 793 */                               jI0010o18 = lO0Iil10.I0010o(i24, parcel);
                                        break;
                                    case '\f':
/* 785 */                               jI0010o17 = lO0Iil10.I0010o(i24, parcel);
                                        break;
                                    case '\r':
/* 777 */                               jI0010o11 = lO0Iil10.I0010o(i24, parcel);
                                        break;
                                    case 14:
/* 769 */                               jI0010o6 = lO0Iil10.I0010o(i24, parcel);
                                        break;
                                    case 15:
/* 761 */                               iI0010I0i51 = lO0Iil10.I0010I0i(i24, parcel);
                                        break;
                                    case 16:
/* 753 */                               iI0010I0i34 = lO0Iil10.I0010I0i(i24, parcel);
                                        break;
                                    case 17:
/* 745 */                               iI0010I0i35 = lO0Iil10.I0010I0i(i24, parcel);
                                        break;
                                    case PoseLandmark.RIGHT_PINKY:
/* 737 */                               iI0010I0i36 = lO0Iil10.I0010I0i(i24, parcel);
                                        break;
                                    case PoseLandmark.LEFT_INDEX:
/* 729 */                               zI000lI10 = lO0Iil10.I000lI(i24, parcel);
                                        break;
                                    case PoseLandmark.RIGHT_INDEX:
/* 721 */                               iI0010I0i37 = lO0Iil10.I0010I0i(i24, parcel);
                                        break;
                                    case PoseLandmark.LEFT_THUMB:
/* 713 */                               jI0010o7 = lO0Iil10.I0010o(i24, parcel);
                                        break;
                                    case PoseLandmark.RIGHT_THUMB:
/* 705 */                               dI000o00OoI0I4 = lO0Iil10.I000o00OoI0I(i24, parcel);
                                        break;
                                    case PoseLandmark.LEFT_HIP:
/* 697 */                               dI000o00OoI0I3 = lO0Iil10.I000o00OoI0I(i24, parcel);
                                        break;
                                    case PoseLandmark.RIGHT_HIP:
/* 689 */                               iI0010I0i38 = lO0Iil10.I0010I0i(i24, parcel);
                                        break;
                                    case PoseLandmark.LEFT_KNEE:
/* 681 */                               fI00100l03 = lO0Iil10.I00100l0(i24, parcel);
                                        break;
                                    case PoseLandmark.RIGHT_KNEE:
/* 675 */                               bArrI00000oOI3 = lO0Iil10.I00000oOI(i24, parcel);
                                        break;
                                    case 27:
/* 667 */                               iI0010I0i39 = lO0Iil10.I0010I0i(i24, parcel);
                                        break;
                                    case PoseLandmark.RIGHT_ANKLE:
/* 659 */                               iI0010I0i40 = lO0Iil10.I0010I0i(i24, parcel);
                                        break;
                                    case PoseLandmark.LEFT_HEEL:
/* 651 */                               jI0010o8 = lO0Iil10.I0010o(i24, parcel);
                                        break;
                                    case 30:
/* 643 */                               jI0010o9 = lO0Iil10.I0010o(i24, parcel);
                                        break;
                                    case PoseLandmark.LEFT_FOOT_INDEX:
/* 635 */                               iI0010I0i27 = lO0Iil10.I0010I0i(i24, parcel);
                                        break;
                                    case ' ':
/* 627 */                               iI0010I0i41 = lO0Iil10.I0010I0i(i24, parcel);
                                        break;
                                    case '!':
/* 619 */                               iI0010I0i42 = lO0Iil10.I0010I0i(i24, parcel);
                                        break;
                                    case '\"':
/* 611 */                               iI0010I0i43 = lO0Iil10.I0010I0i(i24, parcel);
                                        break;
                                    case InputImage.IMAGE_FORMAT_YUV_420_888:
/* 603 */                               iI0010I0i44 = lO0Iil10.I0010I0i(i24, parcel);
                                        break;
                                    case '$':
/* 595 */                               iI0010I0i45 = lO0Iil10.I0010I0i(i24, parcel);
                                        break;
                                    case '%':
/* 587 */                               iI0010I0i25 = lO0Iil10.I0010I0i(i24, parcel);
                                        break;
                                    case '&':
/* 579 */                               iI0010I0i46 = lO0Iil10.I0010I0i(i24, parcel);
                                        break;
                                    case '\'':
/* 571 */                               jI0010o10 = lO0Iil10.I0010o(i24, parcel);
                                        break;
                                    case '(':
/* 565 */                               jI0010o20 = lO0Iil10.I0010o(i24, parcel);
                                        break;
                                    case ')':
/* 559 */                               iArrI0000oI00 = lO0Iil10.I0000oI00(i24, parcel);
                                        break;
                                    case '*':
/* 552 */                               iI0010I0i47 = lO0Iil10.I0010I0i(i24, parcel);
                                        break;
                                    case '+':
/* 545 */                               strI000II32 = lO0Iil10.I000II(i24, parcel);
                                        break;
                                    case ',':
/* 540 */                               bArrI00000oOI4 = lO0Iil10.I00000oOI(i24, parcel);
                                        break;
                                    case BuildConfig.VERSION_CODE:
/* 533 */                               iI0010I0i26 = lO0Iil10.I0010I0i(i24, parcel);
                                        break;
                                    case '.':
/* 526 */                               jI0010o12 = lO0Iil10.I0010o(i24, parcel);
                                        break;
                                    case '/':
/* 521 */                               bArrI00000oOI5 = lO0Iil10.I00000oOI(i24, parcel);
                                        break;
                                    case '0':
/* 514 */                               iI0010I0i48 = lO0Iil10.I0010I0i(i24, parcel);
                                        break;
                                    case '1':
                                    default:
/* 432 */                               lO0Iil10.I001IO000(i24, parcel);
                                        break;
                                    case '2':
/* 490 */                               int iI001IIilI0O = lO0Iil10.I001IIilI0O(i24, parcel);
/* 494 */                               int iDataPosition = parcel.dataPosition();
/* 498 */                               if (iI001IIilI0O != 0) {
/* 503 */                                   long[] jArrCreateLongArray = parcel.createLongArray();
/* 508 */                                   parcel.setDataPosition(iDataPosition + iI001IIilI0O);
/* 511 */                                   jArr = jArrCreateLongArray;
                                            break;
                                        } else {
/* 500 */                                   jArr = null;
                                            break;
                                        }
                                    case '3':
/* 483 */                               jI0010o13 = lO0Iil10.I0010o(i24, parcel);
                                        break;
                                    case '4':
/* 476 */                               jI0010o14 = lO0Iil10.I0010o(i24, parcel);
                                        break;
                                    case '5':
/* 469 */                               iI0010I0i49 = lO0Iil10.I0010I0i(i24, parcel);
                                        break;
                                    case '6':
/* 462 */                               iI0010I0i50 = lO0Iil10.I0010I0i(i24, parcel);
                                        break;
                                    case '7':
/* 455 */                               jI0010o15 = lO0Iil10.I0010o(i24, parcel);
                                        break;
                                    case '8':
/* 448 */                               jI0010o16 = lO0Iil10.I0010o(i24, parcel);
                                        break;
                                    case '9':
/* 443 */                               bArrI00000oOI6 = lO0Iil10.I00000oOI(i24, parcel);
                                        break;
                                    case ':':
/* 438 */                               bArrI00000oOI7 = lO0Iil10.I00000oOI(i24, parcel);
                                        break;
                                }
/* 435 */                       jI0010o5 = j;
                            }
/* 866 */                   lO0Iil10.I000l1(iI001i1O0Ol24, parcel);
/* 871 */                   iiOi1illIO1o iioi1illio1o = new iiOi1illIO1o();
/* 874 */                   iioi1illio1o.I00iOIl = iI0010I0i28;
/* 876 */                   iioi1illio1o.I00iiI = jI0010o20;
/* 878 */                   iioi1illio1o.I00iiO = iI0010I0i32;
/* 880 */                   iioi1illio1o.I00iio = iI0010I0i52;
/* 882 */                   iioi1illio1o.I00ilI0I1 = iI0010I0i31;
/* 884 */                   iioi1illio1o.I00ilO0 = jI0010o21;
/* 886 */                   iioi1illio1o.I00io1l = iI0010I0i29;
/* 888 */                   iioi1illio1o.I00ioIO = iI0010I0i30;
/* 890 */                   iioi1illio1o.I00l0I0l0lO1 = iI0010I0i33;
/* 894 */                   iioi1illio1o.I00l0OO0IO = jI0010o5;
/* 898 */                   iioi1illio1o.I00li1OI = jI0010o19;
/* 902 */                   iioi1illio1o.I00ll1 = jI0010o18;
/* 906 */                   iioi1illio1o.I00lli11 = jI0010o17;
/* 910 */                   iioi1illio1o.I00lll10 = jI0010o11;
/* 914 */                   iioi1illio1o.I00o0iI0io1 = jI0010o6;
/* 918 */                   iioi1illio1o.I00o0l1o1o0 = iI0010I0i51;
/* 922 */                   iioi1illio1o.I00o101lO = iI0010I0i34;
/* 926 */                   iioi1illio1o.I00oI0i = iI0010I0i35;
/* 930 */                   iioi1illio1o.I00oII = iI0010I0i36;
/* 934 */                   iioi1illio1o.I00oIiI10 = zI000lI10;
/* 938 */                   iioi1illio1o.I00oO101o = iI0010I0i37;
/* 942 */                   iioi1illio1o.I00oOio10iI1 = jI0010o7;
/* 946 */                   iioi1illio1o.I00ol1 = dI000o00OoI0I4;
/* 950 */                   iioi1illio1o.I00olI = dI000o00OoI0I3;
/* 954 */                   iioi1illio1o.I00oli = iI0010I0i38;
/* 958 */                   iioi1illio1o.I00oliIiO01i = fI00100l03;
/* 962 */                   iioi1illio1o.I00oo1iO0ll = bArrI00000oOI3;
/* 966 */                   iioi1illio1o.I00ooIo0 = iI0010I0i39;
/* 970 */                   iioi1illio1o.I00ooiO1I = iI0010I0i40;
/* 974 */                   iioi1illio1o.I00oooO = jI0010o8;
/* 978 */                   iioi1illio1o.I0100i = jI0010o9;
/* 982 */                   iioi1illio1o.I011IO1I11OI = jI0010o14;
/* 986 */                   iioi1illio1o.I0100o111I = iI0010I0i27;
/* 990 */                   iioi1illio1o.I010101Oo1lO = iI0010I0i41;
/* 994 */                   iioi1illio1o.I010I0 = iI0010I0i42;
/* 998 */                   iioi1illio1o.I010II = iI0010I0i43;
/* 1002 */                  iioi1illio1o.I010OIo1l = iI0010I0i44;
/* 1006 */                  iioi1illio1o.I011IOil = iI0010I0i49;
/* 1010 */                  iioi1illio1o.I011Ill = iI0010I0i50;
/* 1014 */                  iioi1illio1o.I010i10l = iI0010I0i45;
/* 1018 */                  iioi1illio1o.I010iIIOlo = iI0010I0i25;
/* 1022 */                  iioi1illio1o.I010ioo = iI0010I0i46;
/* 1026 */                  iioi1illio1o.I010l10O = jI0010o10;
/* 1030 */                  iioi1illio1o.I010l1O = iArrI0000oI00;
/* 1034 */                  iioi1illio1o.I010l1ol111 = iI0010I0i47;
/* 1038 */                  iioi1illio1o.I010lI0oi = strI000II32;
/* 1042 */                  iioi1illio1o.I010o0o0oO = bArrI00000oOI4;
/* 1046 */                  iioi1illio1o.I010oio1OO0 = iI0010I0i26;
/* 1050 */                  iioi1illio1o.I01101IOlO = jI0010o12;
/* 1054 */                  iioi1illio1o.I01101olii = bArrI00000oOI5;
/* 1058 */                  iioi1illio1o.I0110OiO = iI0010I0i48;
/* 1062 */                  iioi1illio1o.I0110o = jArr;
/* 1066 */                  iioi1illio1o.I011Io0I1ioi = jI0010o15;
/* 1070 */                  iioi1illio1o.I011Ol0 = jI0010o16;
/* 1074 */                  iioi1illio1o.I0111i = jI0010o13;
/* 1078 */                  iioi1illio1o.I011iIOio = bArrI00000oOI6;
/* 1082 */                  iioi1illio1o.I011iO = bArrI00000oOI7;
/* 1084 */                  VarHandle.storeStoreFence();
/* 1087 */                  return iioi1illio1o;
                        case PoseLandmark.LEFT_KNEE:
/* 243 */                   int iI001i1O0Ol25 = lO0Iil10.I001i1O0Ol(parcel);
/* 247 */                   boolean zI000lI11 = false;
/* 248 */                   float[] fArrI0000O = null;
/* 253 */                   while (parcel.dataPosition() < iI001i1O0Ol25) {
/* 255 */                       int i25 = parcel.readInt();
/* 259 */                       char c11 = (char) i25;
/* 260 */                       if (c11 == 1) {
/* 280 */                           fArrI0000O = lO0Iil10.I0000O(i25, parcel);
                                } else if (c11 == 2) {
/* 275 */                           iI0010I0i2 = lO0Iil10.I0010I0i(i25, parcel);
                                } else if (c11 != 3) {
/* 266 */                           lO0Iil10.I001IO000(i25, parcel);
                                } else {
/* 270 */                           zI000lI11 = lO0Iil10.I000lI(i25, parcel);
                                }
                            }
/* 285 */                   lO0Iil10.I000l1(iI001i1O0Ol25, parcel);
/* 290 */                   iiOi1ioO iioi1ioo2 = new iiOi1ioO();
/* 293 */                   iioi1ioo2.I00iOIl = fArrI0000O;
/* 295 */                   iioi1ioo2.I00iiI = iI0010I0i2;
/* 297 */                   iioi1ioo2.I00iiO = zI000lI11;
/* 299 */                   VarHandle.storeStoreFence();
/* 302 */                   return iioi1ioo2;
                        case PoseLandmark.RIGHT_KNEE:
/* 187 */                   int iI001i1O0Ol26 = lO0Iil10.I001i1O0Ol(parcel);
/* 191 */                   String strI000II33 = null;
/* 192 */                   ParcelFileDescriptor parcelFileDescriptor = null;
/* 197 */                   while (parcel.dataPosition() < iI001i1O0Ol26) {
/* 199 */                       int i26 = parcel.readInt();
/* 203 */                       char c12 = (char) i26;
/* 204 */                       if (c12 == 1) {
/* 224 */                           parcelFileDescriptor = (ParcelFileDescriptor) lO0Iil10.I0001Ioi1lo(parcel, i26, ParcelFileDescriptor.CREATOR);
                                } else if (c12 != 2) {
/* 208 */                           lO0Iil10.I001IO000(i26, parcel);
                                } else {
/* 212 */                           strI000II33 = lO0Iil10.I000II(i26, parcel);
                                }
                            }
/* 227 */                   lO0Iil10.I000l1(iI001i1O0Ol26, parcel);
/* 232 */                   iiOoiOI1Oo iiooioi1oo = new iiOoiOI1Oo();
/* 235 */                   iiooioi1oo.I00iOIl = parcelFileDescriptor;
/* 237 */                   iiooioi1oo.I00iiI = strI000II33;
/* 239 */                   VarHandle.storeStoreFence();
/* 242 */                   return iiooioi1oo;
                        case 27:
/* 146 */                   int iI001i1O0Ol27 = lO0Iil10.I001i1O0Ol(parcel);
/* 150 */                   float[] fArrI0000O2 = null;
/* 155 */                   while (parcel.dataPosition() < iI001i1O0Ol27) {
/* 157 */                       int i27 = parcel.readInt();
/* 162 */                       if (((char) i27) != 1) {
/* 164 */                           lO0Iil10.I001IO000(i27, parcel);
                                } else {
/* 168 */                           fArrI0000O2 = lO0Iil10.I0000O(i27, parcel);
                                }
                            }
/* 173 */                   lO0Iil10.I000l1(iI001i1O0Ol27, parcel);
/* 178 */                   iiOolIi0 iioolii02 = new iiOolIi0();
/* 181 */                   iioolii02.I00iOIl = fArrI0000O2;
/* 183 */                   VarHandle.storeStoreFence();
/* 186 */                   return iioolii02;
                        case PoseLandmark.RIGHT_ANKLE:
/* 73 */                    int iI001i1O0Ol28 = lO0Iil10.I001i1O0Ol(parcel);
/* 77 */                    String strI000II34 = null;
/* 78 */                    String strI000II35 = null;
/* 79 */                    String strI000II36 = null;
/* 80 */                    String strI000II37 = null;
/* 81 */                    String strI000II38 = null;
/* 82 */                    String strI000II39 = null;
/* 83 */                    String strI000II40 = null;
/* 88 */                    while (parcel.dataPosition() < iI001i1O0Ol28) {
/* 90 */                        int i28 = parcel.readInt();
                                switch ((char) i28) {
                                    case 1:
/* 132 */                               strI000II34 = lO0Iil10.I000II(i28, parcel);
                                        break;
                                    case 2:
/* 127 */                               strI000II35 = lO0Iil10.I000II(i28, parcel);
                                        break;
                                    case 3:
/* 122 */                               strI000II36 = lO0Iil10.I000II(i28, parcel);
                                        break;
                                    case 4:
/* 117 */                               strI000II37 = lO0Iil10.I000II(i28, parcel);
                                        break;
                                    case 5:
/* 112 */                               strI000II38 = lO0Iil10.I000II(i28, parcel);
                                        break;
                                    case 6:
/* 107 */                               strI000II39 = lO0Iil10.I000II(i28, parcel);
                                        break;
                                    case 7:
/* 102 */                               strI000II40 = lO0Iil10.I000II(i28, parcel);
                                        break;
                                    default:
/* 98 */                                lO0Iil10.I001IO000(i28, parcel);
                                        break;
                                }
                            }
/* 137 */                   lO0Iil10.I000l1(iI001i1O0Ol28, parcel);
/* 142 */                   return new iOOioi1O0I1i(strI000II34, strI000II35, strI000II36, strI000II37, strI000II38, strI000II39, strI000II40);
                        default:
/* 22 */                    int iI001i1O0Ol29 = lO0Iil10.I001i1O0Ol(parcel);
/* 26 */                    String strI000II41 = null;
/* 27 */                    byte[] bArrI00000oOI8 = null;
/* 32 */                    while (parcel.dataPosition() < iI001i1O0Ol29) {
/* 34 */                        int i29 = parcel.readInt();
/* 38 */                        char c13 = (char) i29;
/* 39 */                        if (c13 == 1) {
/* 52 */                            bArrI00000oOI8 = lO0Iil10.I00000oOI(i29, parcel);
                                } else if (c13 != 2) {
/* 43 */                            lO0Iil10.I001IO000(i29, parcel);
                                } else {
/* 47 */                            strI000II41 = lO0Iil10.I000II(i29, parcel);
                                }
                            }
/* 57 */                    lO0Iil10.I000l1(iI001i1O0Ol29, parcel);
/* 62 */                    iiiIolO0I iiiiolo0i = new iiiIolO0I();
/* 65 */                    iiiiolo0i.I00iOIl = bArrI00000oOI8;
/* 67 */                    iiiiolo0i.I00iiI = strI000II41;
/* 69 */                    VarHandle.storeStoreFence();
/* 72 */                    return iiiiolo0i;
                    }
                }

                @Override
                public final Object[] newArray(int i) {
                    switch (this.I00000oIO) {
                        case 0:
/* 93 */                    return new iIiiii0loOl0[i];
                        case 1:
/* 90 */                    return new iIo00l0loI0l[i];
                        case 2:
/* 87 */                    return new iIloloioo0[i];
                        case 3:
/* 84 */                    return new iIloolIi1ii[i];
                        case 4:
/* 81 */                    return new iIo000iolIl[i];
                        case 5:
/* 78 */                    return new iIolOl1lo1[i];
                        case 6:
/* 75 */                    return new iO0Ol0ol[i];
                        case 7:
/* 72 */                    return new iO0i0o1l1Ii[i];
                        case 8:
/* 69 */                    return new iOlo0iOI1i[i];
                        case 9:
/* 66 */                    return new il1IIi0oI[i];
                        case 10:
/* 63 */                    return new IlIII1l[i];
                        case 11:
/* 60 */                    return new iOoOoOOI1[i];
                        case 12:
/* 57 */                    return new ii00i0iiOOOo[i];
                        case 13:
/* 54 */                    return new ii0IlI0[i];
                        case 14:
/* 51 */                    return new ii0il0lOolIo[i];
                        case 15:
/* 48 */                    return new iIoliO[i];
                        case 16:
/* 45 */                    return new iO0i0ooI[i];
                        case 17:
/* 42 */                    return new ii0oooi0IO0l[i];
                        case PoseLandmark.RIGHT_PINKY:
/* 39 */                    return new iO111II[i];
                        case PoseLandmark.LEFT_INDEX:
/* 36 */                    return new iO1iIl01Il0l[i];
                        case PoseLandmark.RIGHT_INDEX:
/* 33 */                    return new iOIIo0i[i];
                        case PoseLandmark.LEFT_THUMB:
/* 30 */                    return new iOIoiol1O[i];
                        case PoseLandmark.RIGHT_THUMB:
/* 27 */                    return new iiO010lI1iO[i];
                        case PoseLandmark.LEFT_HIP:
/* 24 */                    return new iiO1OI[i];
                        case PoseLandmark.RIGHT_HIP:
/* 21 */                    return new iiOi1illIO1o[i];
                        case PoseLandmark.LEFT_KNEE:
/* 18 */                    return new iiOi1ioO[i];
                        case PoseLandmark.RIGHT_KNEE:
/* 15 */                    return new iiOoiOI1Oo[i];
                        case 27:
/* 12 */                    return new iiOolIi0[i];
                        case PoseLandmark.RIGHT_ANKLE:
/* 9 */                     return new iOOioi1O0I1i[i];
                        default:
/* 6 */                     return new iiiIolO0I[i];
                    }
                }
            }

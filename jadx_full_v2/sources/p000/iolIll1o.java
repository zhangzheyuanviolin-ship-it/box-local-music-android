            package p000;

            import android.accounts.Account;
            import android.graphics.PointF;
            import android.graphics.Rect;
            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.api.Scope;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.TreeMap;
            
            public final class iolIll1o implements Parcelable.Creator {
                public final int I00000oIO;

                public iolIll1o(int i) {
/* 1 */             this.I00000oIO = i;
                }

                public static void I00000oIO(Io0II1OlIo01 io0II1OlIo01, Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 7 */             int i2 = io0II1OlIo01.I00iOIl;
/* 11 */            lO0IioIooIl.I000oI1ioi(parcel, 1, 4);
/* 14 */            parcel.writeInt(i2);
/* 17 */            int i3 = io0II1OlIo01.I00iiI;
/* 20 */            lO0IioIooIl.I000oI1ioi(parcel, 2, 4);
/* 23 */            parcel.writeInt(i3);
/* 26 */            int i4 = io0II1OlIo01.I00iiO;
/* 29 */            lO0IioIooIl.I000oI1ioi(parcel, 3, 4);
/* 32 */            parcel.writeInt(i4);
/* 37 */            lO0IioIooIl.I000OiO(parcel, 4, io0II1OlIo01.I00iio);
/* 43 */            lO0IioIooIl.I0001Ioi1lo(parcel, 5, io0II1OlIo01.I00ilI0I1);
/* 49 */            lO0IioIooIl.I000lI(parcel, 6, io0II1OlIo01.I00ilO0, i);
/* 55 */            lO0IioIooIl.I00000oIO(parcel, 7, io0II1OlIo01.I00io1l);
/* 62 */            lO0IioIooIl.I000OOo1O(parcel, 8, io0II1OlIo01.I00ioIO, i);
/* 69 */            lO0IioIooIl.I000lI(parcel, 10, io0II1OlIo01.I00l0I0l0lO1, i);
/* 76 */            lO0IioIooIl.I000lI(parcel, 11, io0II1OlIo01.I00l0OO0IO, i);
/* 79 */            boolean z = io0II1OlIo01.I00li1OI;
/* 83 */            lO0IioIooIl.I000oI1ioi(parcel, 12, 4);
/* 86 */            parcel.writeInt(z ? 1 : 0);
/* 89 */            int i5 = io0II1OlIo01.I00ll1;
/* 93 */            lO0IioIooIl.I000oI1ioi(parcel, 13, 4);
/* 96 */            parcel.writeInt(i5);
/* 99 */            boolean z2 = io0II1OlIo01.I00lli11;
/* 103 */           lO0IioIooIl.I000oI1ioi(parcel, 14, 4);
/* 106 */           parcel.writeInt(z2 ? 1 : 0);
/* 113 */           lO0IioIooIl.I000OiO(parcel, 15, io0II1OlIo01.I00lll10);
/* 116 */           lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }

                public static void I00000oOI(lio0llOI0 lio0lloi0, Parcel parcel) {
/* 1 */             int i = lio0lloi0.I00iOIl;
/* 5 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 11 */            lO0IioIooIl.I000oI1ioi(parcel, 1, 4);
/* 14 */            parcel.writeInt(i);
/* 20 */            lO0IioIooIl.I000OiO(parcel, 2, lio0lloi0.I00iiI);
/* 23 */            long j = lio0lloi0.I00iiO;
/* 28 */            lO0IioIooIl.I000oI1ioi(parcel, 3, 8);
/* 31 */            parcel.writeLong(j);
/* 36 */            lO0IioIooIl.I000O01llI0(parcel, 4, lio0lloi0.I00iio);
/* 42 */            lO0IioIooIl.I000OiO(parcel, 6, lio0lloi0.I00ilI0I1);
/* 48 */            lO0IioIooIl.I000OiO(parcel, 7, lio0lloi0.I00ilO0);
/* 53 */            lO0IioIooIl.I0000O(parcel, 8, lio0lloi0.I00io1l);
/* 56 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }

                @Override
                public final Object createFromParcel(Parcel parcel) {
/* 11 */            float fI00100l0 = 0.0f;
/* 12 */            long jI0010o = 0;
/* 18 */            String[] strArrI000O01llI0 = null;
/* 18 */            String strI000II = null;
/* 18 */            Double dValueOf = null;
/* 18 */            PointF pointF = null;
/* 18 */            Rect rect = null;
/* 18 */            ArrayList arrayListI000iOII = null;
/* 18 */            ArrayList arrayListI000iOII2 = null;
/* 18 */            String strI000II2 = null;
/* 18 */            lli0oio0[] lli0oio0VarArr = null;
/* 18 */            Oi1oo0 oi1oo0 = null;
/* 18 */            Bundle bundleI00000oIO = null;
/* 18 */            ArrayList arrayListI000iOII3 = null;
/* 18 */            String strI000II3 = null;
/* 18 */            String strI000II4 = null;
/* 18 */            String strI000II5 = null;
/* 18 */            byte[] bArrI00000oOI = null;
/* 18 */            String strI000II6 = null;
/* 18 */            l1lIII1IiI[] l1liii1iiiArr = null;
/* 19 */            int iI0010I0i = 0;
/* 19 */            int iI0010I0i2 = 0;
/* 19 */            int iI0010I0i3 = 0;
/* 19 */            int iI0010I0i4 = 0;
/* 19 */            int iI0010I0i5 = 0;
/* 19 */            int iI0010I0i6 = 0;
/* 19 */            int iI0010I0i7 = 0;
/* 19 */            int iI0010I0i8 = 0;
/* 19 */            boolean zI000lI = false;
/* 19 */            int iI0010I0i9 = 0;
/* 19 */            int iI0010I0i10 = 0;
/* 19 */            boolean zI000lI2 = false;
/* 19 */            boolean zI000lI3 = false;
/* 19 */            int iI0010I0i11 = 0;
                    switch (this.I00000oIO) {
                        case 0:
/* 2278 */                  int iI001i1O0Ol = lO0Iil10.I001i1O0Ol(parcel);
/* 2282 */                  float fI00100l02 = Float.MAX_VALUE;
/* 2285 */                  float fI00100l03 = -1.0f;
/* 2287 */                  float fI00100l04 = Float.MAX_VALUE;
/* 2288 */                  float fI00100l05 = 0.0f;
/* 2289 */                  float fI00100l06 = 0.0f;
/* 2290 */                  float fI00100l07 = 0.0f;
/* 2291 */                  float fI00100l08 = 0.0f;
/* 2292 */                  float fI00100l09 = 0.0f;
/* 2293 */                  float fI00100l010 = 0.0f;
/* 2294 */                  il11l0O1[] il11l0o1Arr = null;
/* 2296 */                  int iI0010I0i12 = 0;
/* 2297 */                  int iI0010I0i13 = 0;
/* 2298 */                  float fI00100l011 = Float.MAX_VALUE;
/* 2299 */                  float fI00100l012 = 0.0f;
/* 2300 */                  lOi1oIlo0i[] loi1oilo0iArr = null;
/* 2306 */                  while (parcel.dataPosition() < iI001i1O0Ol) {
/* 2308 */                      int i = parcel.readInt();
/* 2312 */                      float f = fI00100l012;
                                switch ((char) i) {
                                    case 1:
/* 2407 */                              iI0010I0i13 = lO0Iil10.I0010I0i(i, parcel);
                                        break;
                                    case 2:
/* 2402 */                              iI0010I0i12 = lO0Iil10.I0010I0i(i, parcel);
                                        break;
                                    case 3:
/* 2397 */                              fI00100l05 = lO0Iil10.I00100l0(i, parcel);
                                        break;
                                    case 4:
/* 2392 */                              fI00100l06 = lO0Iil10.I00100l0(i, parcel);
                                        break;
                                    case 5:
/* 2387 */                              fI00100l07 = lO0Iil10.I00100l0(i, parcel);
                                        break;
                                    case 6:
/* 2382 */                              fI00100l08 = lO0Iil10.I00100l0(i, parcel);
                                        break;
                                    case 7:
/* 2377 */                              fI00100l02 = lO0Iil10.I00100l0(i, parcel);
                                        break;
                                    case '\b':
/* 2372 */                              fI00100l04 = lO0Iil10.I00100l0(i, parcel);
                                        break;
                                    case '\t':
/* 2368 */                              loi1oilo0iArr = (lOi1oIlo0i[]) lO0Iil10.I000OiO(parcel, i, lOi1oIlo0i.CREATOR);
                                        break;
                                    case '\n':
/* 2357 */                              fI00100l09 = lO0Iil10.I00100l0(i, parcel);
                                        break;
                                    case 11:
/* 2352 */                              fI00100l010 = lO0Iil10.I00100l0(i, parcel);
                                        break;
                                    case '\f':
/* 2347 */                              fI00100l012 = lO0Iil10.I00100l0(i, parcel);
                                        continue;
                                    case '\r':
/* 2342 */                              il11l0o1Arr = (il11l0O1[]) lO0Iil10.I000OiO(parcel, i, il11l0O1.CREATOR);
                                        break;
                                    case 14:
/* 2331 */                              fI00100l011 = lO0Iil10.I00100l0(i, parcel);
                                        break;
                                    case 15:
/* 2324 */                              fI00100l03 = lO0Iil10.I00100l0(i, parcel);
                                        break;
                                    default:
/* 2318 */                              lO0Iil10.I001IO000(i, parcel);
                                        break;
                                }
/* 2321 */                      fI00100l012 = f;
                            }
/* 2415 */                  lO0Iil10.I000l1(iI001i1O0Ol, parcel);
/* 2420 */                  io0oIoliO1 io0oiolio1 = new io0oIoliO1();
/* 2423 */                  io0oiolio1.I00iOIl = iI0010I0i13;
/* 2425 */                  io0oiolio1.I00iiI = iI0010I0i12;
/* 2427 */                  io0oiolio1.I00iiO = fI00100l05;
/* 2429 */                  io0oiolio1.I00iio = fI00100l06;
/* 2431 */                  io0oiolio1.I00ilI0I1 = fI00100l07;
/* 2433 */                  io0oiolio1.I00ilO0 = fI00100l08;
/* 2435 */                  io0oiolio1.I00io1l = fI00100l02;
/* 2437 */                  io0oiolio1.I00ioIO = fI00100l04;
/* 2439 */                  io0oiolio1.I00l0I0l0lO1 = fI00100l011;
/* 2441 */                  io0oiolio1.I00l0OO0IO = loi1oilo0iArr;
/* 2443 */                  io0oiolio1.I00li1OI = fI00100l09;
/* 2445 */                  io0oiolio1.I00ll1 = fI00100l010;
/* 2449 */                  io0oiolio1.I00lli11 = fI00100l012;
/* 2453 */                  io0oiolio1.I00lll10 = il11l0o1Arr;
/* 2457 */                  io0oiolio1.I00o0iI0io1 = fI00100l03;
/* 2459 */                  VarHandle.storeStoreFence();
/* 2462 */                  return io0oiolio1;
                        case 1:
/* 2199 */                  int iI001i1O0Ol2 = lO0Iil10.I001i1O0Ol(parcel);
/* 2203 */                  int iI0010I0i14 = 0;
/* 2204 */                  int iI0010I0i15 = 0;
/* 2205 */                  int iI0010I0i16 = 0;
/* 2210 */                  while (parcel.dataPosition() < iI001i1O0Ol2) {
/* 2212 */                      int i2 = parcel.readInt();
/* 2216 */                      char c = (char) i2;
/* 2217 */                      if (c == 2) {
/* 2251 */                          iI0010I0i = lO0Iil10.I0010I0i(i2, parcel);
                                } else if (c == 3) {
/* 2246 */                          iI0010I0i14 = lO0Iil10.I0010I0i(i2, parcel);
                                } else if (c == 4) {
/* 2241 */                          iI0010I0i15 = lO0Iil10.I0010I0i(i2, parcel);
                                } else if (c == 5) {
/* 2236 */                          iI0010I0i16 = lO0Iil10.I0010I0i(i2, parcel);
                                } else if (c != 6) {
/* 2227 */                          lO0Iil10.I001IO000(i2, parcel);
                                } else {
/* 2231 */                          fI00100l0 = lO0Iil10.I00100l0(i2, parcel);
                                }
                            }
/* 2256 */                  lO0Iil10.I000l1(iI001i1O0Ol2, parcel);
/* 2261 */                  io0oOoOi0o io0ooooi0o = new io0oOoOi0o();
/* 2264 */                  io0ooooi0o.I00iOIl = iI0010I0i;
/* 2266 */                  io0ooooi0o.I00iiI = iI0010I0i14;
/* 2268 */                  io0ooooi0o.I00iiO = iI0010I0i15;
/* 2270 */                  io0ooooi0o.I00iio = iI0010I0i16;
/* 2272 */                  io0ooooi0o.I00ilI0I1 = fI00100l0;
/* 2274 */                  VarHandle.storeStoreFence();
/* 2277 */                  return io0ooooi0o;
                        case 2:
/* 2153 */                  int iI001i1O0Ol3 = lO0Iil10.I001i1O0Ol(parcel);
/* 2161 */                  while (parcel.dataPosition() < iI001i1O0Ol3) {
/* 2163 */                      int i3 = parcel.readInt();
/* 2167 */                      char c2 = (char) i3;
/* 2168 */                      if (c2 == 2) {
/* 2181 */                          iI0010I0i11 = lO0Iil10.I0010I0i(i3, parcel);
                                } else if (c2 != 3) {
/* 2172 */                          lO0Iil10.I001IO000(i3, parcel);
                                } else {
/* 2176 */                          strArrI000O01llI0 = lO0Iil10.I000O01llI0(i3, parcel);
                                }
                            }
/* 2186 */                  lO0Iil10.I000l1(iI001i1O0Ol3, parcel);
/* 2191 */                  l0oI0OIiiIio l0oi0oiiiiio = new l0oI0OIiiIio();
/* 2194 */                  l0oi0oiiiiio.I00iOIl = iI0010I0i11;
/* 2196 */                  l0oi0oiiiiio.I00iiI = strArrI000O01llI0;
/* 2198 */                  return l0oi0oiiiiio;
                        case 3:
/* 2080 */                  int iI001i1O0Ol4 = lO0Iil10.I001i1O0Ol(parcel);
/* 2084 */                  float fI00100l013 = -1.0f;
/* 2085 */                  int iI0010I0i17 = 0;
/* 2086 */                  int iI0010I0i18 = 0;
/* 2087 */                  int iI0010I0i19 = 0;
/* 2088 */                  boolean zI000lI4 = false;
/* 2089 */                  boolean zI000lI5 = false;
/* 2094 */                  while (parcel.dataPosition() < iI001i1O0Ol4) {
/* 2096 */                      int i4 = parcel.readInt();
                                switch ((char) i4) {
                                    case 2:
/* 2138 */                              iI0010I0i17 = lO0Iil10.I0010I0i(i4, parcel);
                                        break;
                                    case 3:
/* 2132 */                              iI0010I0i18 = lO0Iil10.I0010I0i(i4, parcel);
                                        break;
                                    case 4:
/* 2126 */                              iI0010I0i19 = lO0Iil10.I0010I0i(i4, parcel);
                                        break;
                                    case 5:
/* 2120 */                              zI000lI4 = lO0Iil10.I000lI(i4, parcel);
                                        break;
                                    case 6:
/* 2114 */                              zI000lI5 = lO0Iil10.I000lI(i4, parcel);
                                        break;
                                    case 7:
/* 2108 */                              fI00100l013 = lO0Iil10.I00100l0(i4, parcel);
                                        break;
                                    default:
/* 2104 */                              lO0Iil10.I001IO000(i4, parcel);
                                        break;
                                }
                            }
/* 2144 */                  lO0Iil10.I000l1(iI001i1O0Ol4, parcel);
/* 2149 */                  return new l0IIOl11l(iI0010I0i17, iI0010I0i18, iI0010I0i19, zI000lI4, zI000lI5, fI00100l013);
                        case 4:
/* 1988 */                  int iI001i1O0Ol5 = lO0Iil10.I001i1O0Ol(parcel);
/* 1992 */                  String[] strArrI000O01llI02 = null;
/* 1993 */                  int iI0010I0i20 = 0;
/* 1998 */                  while (parcel.dataPosition() < iI001i1O0Ol5) {
/* 2000 */                      int i5 = parcel.readInt();
/* 2004 */                      char c3 = (char) i5;
/* 2005 */                      if (c3 == 2) {
/* 2030 */                          iI0010I0i20 = lO0Iil10.I0010I0i(i5, parcel);
                                } else if (c3 == 3) {
/* 2027 */                          l1liii1iiiArr = (l1lIII1IiI[]) lO0Iil10.I000OiO(parcel, i5, l1lIII1IiI.CREATOR);
                                } else if (c3 != 4) {
/* 2011 */                          lO0Iil10.I001IO000(i5, parcel);
                                } else {
/* 2015 */                          strArrI000O01llI02 = lO0Iil10.I000O01llI0(i5, parcel);
                                }
                            }
/* 2035 */                  lO0Iil10.I000l1(iI001i1O0Ol5, parcel);
/* 2040 */                  l1i0oiOO l1i0oioo = new l1i0oiOO();
/* 2043 */                  l1i0oioo.I00iOIl = iI0010I0i20;
/* 2045 */                  l1i0oioo.I00iiI = l1liii1iiiArr;
/* 2052 */                  l1i0oioo.I00iio = new TreeMap();
/* 2055 */                  for (l1lIII1IiI l1liii1iii : l1liii1iiiArr) {
/* 2063 */                      l1i0oioo.I00iio.put(l1liii1iii.I00iOIl, l1liii1iii);
                            }
/* 2069 */                  l1i0oioo.I00iiO = strArrI000O01llI02;
/* 2071 */                  if (strArrI000O01llI02 != null) {
/* 2073 */                      Arrays.sort(strArrI000O01llI02);
                            }
/* 2076 */                  VarHandle.storeStoreFence();
/* 2079 */                  return l1i0oioo;
                        case 5:
/* 1877 */                  int iI001i1O0Ol6 = lO0Iil10.I001i1O0Ol(parcel);
/* 1881 */                  String strI000II7 = null;
/* 1882 */                  l1i0oiOO[] l1i0oiooArr = null;
/* 1883 */                  byte[] bArrI00000oOI2 = null;
/* 1884 */                  boolean zI000lI6 = false;
/* 1889 */                  while (parcel.dataPosition() < iI001i1O0Ol6) {
/* 1891 */                      int i6 = parcel.readInt();
                                switch ((char) i6) {
                                    case 2:
/* 1932 */                              strI000II6 = lO0Iil10.I000II(i6, parcel);
                                        break;
                                    case 3:
/* 1927 */                              strI000II7 = lO0Iil10.I000II(i6, parcel);
                                        break;
                                    case 4:
/* 1924 */                              l1i0oiooArr = (l1i0oiOO[]) lO0Iil10.I000OiO(parcel, i6, l1i0oiOO.CREATOR);
                                        break;
                                    case 5:
/* 1913 */                              zI000lI6 = lO0Iil10.I000lI(i6, parcel);
                                        break;
                                    case 6:
/* 1908 */                              bArrI00000oOI2 = lO0Iil10.I00000oOI(i6, parcel);
                                        break;
                                    case 7:
/* 1903 */                              jI0010o = lO0Iil10.I0010o(i6, parcel);
                                        break;
                                    default:
/* 1899 */                              lO0Iil10.I001IO000(i6, parcel);
                                        break;
                                }
                            }
/* 1938 */                  lO0Iil10.I000l1(iI001i1O0Ol6, parcel);
/* 1943 */                  l1iIl0OO l1iil0oo = new l1iIl0OO();
/* 1946 */                  l1iil0oo.I00iOIl = strI000II6;
/* 1948 */                  l1iil0oo.I00iiO = strI000II7;
/* 1950 */                  l1iil0oo.I00iio = l1i0oiooArr;
/* 1952 */                  l1iil0oo.I00ilO0 = zI000lI6;
/* 1954 */                  l1iil0oo.I00iiI = bArrI00000oOI2;
/* 1956 */                  l1iil0oo.I00io1l = jI0010o;
/* 1963 */                  l1iil0oo.I00ilI0I1 = new TreeMap();
/* 1966 */                  for (l1i0oiOO l1i0oioo2 : l1i0oiooArr) {
/* 1978 */                      l1iil0oo.I00ilI0I1.put(Integer.valueOf(l1i0oioo2.I00iOIl), l1i0oioo2);
                            }
/* 1984 */                  VarHandle.storeStoreFence();
/* 1987 */                  return l1iil0oo;
                        case 6:
/* 1837 */                  int iI001i1O0Ol7 = lO0Iil10.I001i1O0Ol(parcel);
/* 1845 */                  while (parcel.dataPosition() < iI001i1O0Ol7) {
/* 1847 */                      int i7 = parcel.readInt();
/* 1852 */                      if (((char) i7) != 2) {
/* 1854 */                          lO0Iil10.I001IO000(i7, parcel);
                                } else {
/* 1858 */                          bArrI00000oOI = lO0Iil10.I00000oOI(i7, parcel);
                                }
                            }
/* 1863 */                  lO0Iil10.I000l1(iI001i1O0Ol7, parcel);
/* 1868 */                  l1ii1l l1ii1lVar = new l1ii1l();
/* 1871 */                  l1ii1lVar.I00iOIl = bArrI00000oOI;
/* 1873 */                  VarHandle.storeStoreFence();
/* 1876 */                  return l1ii1lVar;
                        case 7:
/* 1724 */                  int iI001i1O0Ol8 = lO0Iil10.I001i1O0Ol(parcel);
/* 1728 */                  byte[] bArrI00000oOI3 = null;
/* 1729 */                  byte[][] bArrI0000Il00O = null;
/* 1730 */                  byte[][] bArrI0000Il00O2 = null;
/* 1731 */                  byte[][] bArrI0000Il00O3 = null;
/* 1732 */                  byte[][] bArrI0000Il00O4 = null;
/* 1733 */                  int[] iArrI0000oI00 = null;
/* 1734 */                  byte[][] bArrI0000Il00O5 = null;
/* 1735 */                  int[] iArrI0000oI002 = null;
/* 1736 */                  byte[][] bArrI0000Il00O6 = null;
/* 1741 */                  while (parcel.dataPosition() < iI001i1O0Ol8) {
/* 1743 */                      int i8 = parcel.readInt();
                                switch ((char) i8) {
                                    case 2:
/* 1800 */                              strI000II5 = lO0Iil10.I000II(i8, parcel);
                                        break;
                                    case 3:
/* 1795 */                              bArrI00000oOI3 = lO0Iil10.I00000oOI(i8, parcel);
                                        break;
                                    case 4:
/* 1790 */                              bArrI0000Il00O = lO0Iil10.I0000Il00O(i8, parcel);
                                        break;
                                    case 5:
/* 1785 */                              bArrI0000Il00O2 = lO0Iil10.I0000Il00O(i8, parcel);
                                        break;
                                    case 6:
/* 1780 */                              bArrI0000Il00O3 = lO0Iil10.I0000Il00O(i8, parcel);
                                        break;
                                    case 7:
/* 1775 */                              bArrI0000Il00O4 = lO0Iil10.I0000Il00O(i8, parcel);
                                        break;
                                    case '\b':
/* 1770 */                              iArrI0000oI00 = lO0Iil10.I0000oI00(i8, parcel);
                                        break;
                                    case '\t':
/* 1765 */                              bArrI0000Il00O5 = lO0Iil10.I0000Il00O(i8, parcel);
                                        break;
                                    case '\n':
/* 1760 */                              iArrI0000oI002 = lO0Iil10.I0000oI00(i8, parcel);
                                        break;
                                    case 11:
/* 1755 */                              bArrI0000Il00O6 = lO0Iil10.I0000Il00O(i8, parcel);
                                        break;
                                    default:
/* 1751 */                              lO0Iil10.I001IO000(i8, parcel);
                                        break;
                                }
                            }
/* 1805 */                  lO0Iil10.I000l1(iI001i1O0Ol8, parcel);
/* 1810 */                  l1ioo00iI l1ioo00ii = new l1ioo00iI();
/* 1813 */                  l1ioo00ii.I00iOIl = strI000II5;
/* 1815 */                  l1ioo00ii.I00iiI = bArrI00000oOI3;
/* 1817 */                  l1ioo00ii.I00iiO = bArrI0000Il00O;
/* 1819 */                  l1ioo00ii.I00iio = bArrI0000Il00O2;
/* 1821 */                  l1ioo00ii.I00ilI0I1 = bArrI0000Il00O3;
/* 1823 */                  l1ioo00ii.I00ilO0 = bArrI0000Il00O4;
/* 1825 */                  l1ioo00ii.I00io1l = iArrI0000oI00;
/* 1827 */                  l1ioo00ii.I00ioIO = bArrI0000Il00O5;
/* 1829 */                  l1ioo00ii.I00l0I0l0lO1 = iArrI0000oI002;
/* 1831 */                  l1ioo00ii.I00l0OO0IO = bArrI0000Il00O6;
/* 1833 */                  VarHandle.storeStoreFence();
/* 1836 */                  return l1ioo00ii;
                        case 8:
/* 1618 */                  int iI001i1O0Ol9 = lO0Iil10.I001i1O0Ol(parcel);
/* 1622 */                  double dI000o00OoI0I = 0.0d;
/* 1624 */                  String strI000II8 = null;
/* 1625 */                  byte[] bArrI00000oOI4 = null;
/* 1626 */                  int iI0010I0i21 = 0;
/* 1627 */                  int iI0010I0i22 = 0;
/* 1628 */                  int iI0010I0i23 = 0;
/* 1633 */                  while (parcel.dataPosition() < iI001i1O0Ol9) {
/* 1635 */                      int i9 = parcel.readInt();
                                switch ((char) i9) {
                                    case 2:
/* 1688 */                              strI000II4 = lO0Iil10.I000II(i9, parcel);
                                        break;
                                    case 3:
/* 1683 */                              jI0010o = lO0Iil10.I0010o(i9, parcel);
                                        break;
                                    case 4:
/* 1677 */                              zI000lI3 = lO0Iil10.I000lI(i9, parcel);
                                        break;
                                    case 5:
/* 1672 */                              dI000o00OoI0I = lO0Iil10.I000o00OoI0I(i9, parcel);
                                        break;
                                    case 6:
/* 1667 */                              strI000II8 = lO0Iil10.I000II(i9, parcel);
                                        break;
                                    case 7:
/* 1662 */                              bArrI00000oOI4 = lO0Iil10.I00000oOI(i9, parcel);
                                        break;
                                    case '\b':
/* 1657 */                              iI0010I0i21 = lO0Iil10.I0010I0i(i9, parcel);
                                        break;
                                    case '\t':
/* 1652 */                              iI0010I0i22 = lO0Iil10.I0010I0i(i9, parcel);
                                        break;
                                    case '\n':
/* 1647 */                              iI0010I0i23 = lO0Iil10.I0010I0i(i9, parcel);
                                        break;
                                    default:
/* 1643 */                              lO0Iil10.I001IO000(i9, parcel);
                                        break;
                                }
                            }
/* 1694 */                  lO0Iil10.I000l1(iI001i1O0Ol9, parcel);
/* 1699 */                  l1lIII1IiI l1liii1iii2 = new l1lIII1IiI();
/* 1702 */                  l1liii1iii2.I00iOIl = strI000II4;
/* 1704 */                  l1liii1iii2.I00iiI = jI0010o;
/* 1706 */                  l1liii1iii2.I00iiO = zI000lI3;
/* 1708 */                  l1liii1iii2.I00iio = dI000o00OoI0I;
/* 1710 */                  l1liii1iii2.I00ilI0I1 = strI000II8;
/* 1712 */                  l1liii1iii2.I00ilO0 = bArrI00000oOI4;
/* 1714 */                  l1liii1iii2.I00io1l = iI0010I0i21;
/* 1716 */                  l1liii1iii2.I00ioIO = iI0010I0i22;
/* 1718 */                  l1liii1iii2.I00l0I0l0lO1 = iI0010I0i23;
/* 1720 */                  VarHandle.storeStoreFence();
/* 1723 */                  return l1liii1iii2;
                        case 9:
/* 1545 */                  int iI001i1O0Ol10 = lO0Iil10.I001i1O0Ol(parcel);
/* 1549 */                  String strI000II9 = null;
/* 1550 */                  l1lIII1IiI l1liii1iii3 = null;
/* 1555 */                  while (parcel.dataPosition() < iI001i1O0Ol10) {
/* 1557 */                      int i10 = parcel.readInt();
/* 1561 */                      char c4 = (char) i10;
/* 1562 */                      if (c4 == 2) {
/* 1593 */                          strI000II3 = lO0Iil10.I000II(i10, parcel);
                                } else if (c4 == 3) {
/* 1588 */                          strI000II9 = lO0Iil10.I000II(i10, parcel);
                                } else if (c4 == 4) {
/* 1585 */                          l1liii1iii3 = (l1lIII1IiI) lO0Iil10.I0001Ioi1lo(parcel, i10, l1lIII1IiI.CREATOR);
                                } else if (c4 != 5) {
/* 1570 */                          lO0Iil10.I001IO000(i10, parcel);
                                } else {
/* 1574 */                          zI000lI2 = lO0Iil10.I000lI(i10, parcel);
                                }
                            }
/* 1598 */                  lO0Iil10.I000l1(iI001i1O0Ol10, parcel);
/* 1603 */                  l1li0i1i l1li0i1iVar = new l1li0i1i();
/* 1606 */                  l1li0i1iVar.I00iOIl = strI000II3;
/* 1608 */                  l1li0i1iVar.I00iiI = strI000II9;
/* 1610 */                  l1li0i1iVar.I00iiO = l1liii1iii3;
/* 1612 */                  l1li0i1iVar.I00iio = zI000lI2;
/* 1614 */                  VarHandle.storeStoreFence();
/* 1617 */                  return l1li0i1iVar;
                        case 10:
/* 1503 */                  int iI001i1O0Ol11 = lO0Iil10.I001i1O0Ol(parcel);
/* 1511 */                  while (parcel.dataPosition() < iI001i1O0Ol11) {
/* 1513 */                      int i11 = parcel.readInt();
/* 1518 */                      if (((char) i11) != 2) {
/* 1520 */                          lO0Iil10.I001IO000(i11, parcel);
                                } else {
/* 1526 */                          arrayListI000iOII3 = lO0Iil10.I000iOII(parcel, i11, l1li0i1i.CREATOR);
                                }
                            }
/* 1531 */                  lO0Iil10.I000l1(iI001i1O0Ol11, parcel);
/* 1536 */                  l1llooo1l10l l1llooo1l10lVar = new l1llooo1l10l();
/* 1539 */                  l1llooo1l10lVar.I00iOIl = arrayListI000iOII3;
/* 1541 */                  VarHandle.storeStoreFence();
/* 1544 */                  return l1llooo1l10lVar;
                        case 11:
/* 1460 */                  int iI001i1O0Ol12 = lO0Iil10.I001i1O0Ol(parcel);
/* 1464 */                  int iI0010I0i24 = 0;
/* 1469 */                  while (parcel.dataPosition() < iI001i1O0Ol12) {
/* 1471 */                      int i12 = parcel.readInt();
/* 1475 */                      char c5 = (char) i12;
/* 1476 */                      if (c5 == 1) {
/* 1489 */                          iI0010I0i10 = lO0Iil10.I0010I0i(i12, parcel);
                                } else if (c5 != 2) {
/* 1480 */                          lO0Iil10.I001IO000(i12, parcel);
                                } else {
/* 1484 */                          iI0010I0i24 = lO0Iil10.I0010I0i(i12, parcel);
                                }
                            }
/* 1494 */                  lO0Iil10.I000l1(iI001i1O0Ol12, parcel);
/* 1499 */                  return new l1o0OO1(iI0010I0i10, iI0010I0i24);
                        case 12:
/* 1386 */                  int iI001i1O0Ol13 = lO0Iil10.I001i1O0Ol(parcel);
/* 1390 */                  IlIII1l[] ilIII1lArr = null;
/* 1391 */                  IOloii1OiOI iOloii1OiOI = null;
/* 1396 */                  while (parcel.dataPosition() < iI001i1O0Ol13) {
/* 1398 */                      int i13 = parcel.readInt();
/* 1402 */                      char c6 = (char) i13;
/* 1403 */                      if (c6 == 1) {
/* 1438 */                          bundleI00000oIO = lO0Iil10.I00000oIO(i13, parcel);
                                } else if (c6 == 2) {
/* 1435 */                          ilIII1lArr = (IlIII1l[]) lO0Iil10.I000OiO(parcel, i13, IlIII1l.CREATOR);
                                } else if (c6 == 3) {
/* 1424 */                          iI0010I0i9 = lO0Iil10.I0010I0i(i13, parcel);
                                } else if (c6 != 4) {
/* 1411 */                          lO0Iil10.I001IO000(i13, parcel);
                                } else {
/* 1421 */                          iOloii1OiOI = (IOloii1OiOI) lO0Iil10.I0001Ioi1lo(parcel, i13, IOloii1OiOI.CREATOR);
                                }
                            }
/* 1443 */                  lO0Iil10.I000l1(iI001i1O0Ol13, parcel);
/* 1448 */                  l1O1o0o10o l1o1o0o10o = new l1O1o0o10o();
/* 1451 */                  l1o1o0o10o.I00iOIl = bundleI00000oIO;
/* 1453 */                  l1o1o0o10o.I00iiI = ilIII1lArr;
/* 1455 */                  l1o1o0o10o.I00iiO = iI0010I0i9;
/* 1457 */                  l1o1o0o10o.I00iio = iOloii1OiOI;
/* 1459 */                  return l1o1o0o10o;
                        case 13:
/* 1301 */                  int iI001i1O0Ol14 = lO0Iil10.I001i1O0Ol(parcel);
/* 1305 */                  int[] iArrI0000oI003 = null;
/* 1306 */                  int[] iArrI0000oI004 = null;
/* 1307 */                  boolean zI000lI7 = false;
/* 1308 */                  int iI0010I0i25 = 0;
/* 1313 */                  while (parcel.dataPosition() < iI001i1O0Ol14) {
/* 1315 */                      int i14 = parcel.readInt();
                                switch ((char) i14) {
                                    case 1:
/* 1359 */                              oi1oo0 = (Oi1oo0) lO0Iil10.I0001Ioi1lo(parcel, i14, Oi1oo0.CREATOR);
                                        break;
                                    case 2:
/* 1347 */                              zI000lI = lO0Iil10.I000lI(i14, parcel);
                                        break;
                                    case 3:
/* 1342 */                              zI000lI7 = lO0Iil10.I000lI(i14, parcel);
                                        break;
                                    case 4:
/* 1337 */                              iArrI0000oI003 = lO0Iil10.I0000oI00(i14, parcel);
                                        break;
                                    case 5:
/* 1332 */                              iI0010I0i25 = lO0Iil10.I0010I0i(i14, parcel);
                                        break;
                                    case 6:
/* 1327 */                              iArrI0000oI004 = lO0Iil10.I0000oI00(i14, parcel);
                                        break;
                                    default:
/* 1323 */                              lO0Iil10.I001IO000(i14, parcel);
                                        break;
                                }
                            }
/* 1362 */                  lO0Iil10.I000l1(iI001i1O0Ol14, parcel);
/* 1367 */                  IOloii1OiOI iOloii1OiOI2 = new IOloii1OiOI();
/* 1370 */                  iOloii1OiOI2.I00iOIl = oi1oo0;
/* 1372 */                  iOloii1OiOI2.I00iiI = zI000lI;
/* 1374 */                  iOloii1OiOI2.I00iiO = zI000lI7;
/* 1376 */                  iOloii1OiOI2.I00iio = iArrI0000oI003;
/* 1378 */                  iOloii1OiOI2.I00ilI0I1 = iI0010I0i25;
/* 1380 */                  iOloii1OiOI2.I00ilO0 = iArrI0000oI004;
/* 1382 */                  VarHandle.storeStoreFence();
/* 1385 */                  return iOloii1OiOI2;
                        case 14:
/* 1165 */                  int iI001i1O0Ol15 = lO0Iil10.I001i1O0Ol(parcel);
/* 1169 */                  io0oOoOi0o io0ooooi0o2 = null;
/* 1170 */                  io0oOoOi0o io0ooooi0o3 = null;
/* 1171 */                  io0oOoOi0o io0ooooi0o4 = null;
/* 1172 */                  String strI000II10 = null;
/* 1173 */                  String strI000II11 = null;
/* 1174 */                  boolean zI000lI8 = false;
/* 1175 */                  int iI0010I0i26 = 0;
/* 1176 */                  int iI0010I0i27 = 0;
/* 1181 */                  while (parcel.dataPosition() < iI001i1O0Ol15) {
/* 1183 */                      int i15 = parcel.readInt();
                                switch ((char) i15) {
                                    case 2:
/* 1264 */                              lli0oio0VarArr = (lli0oio0[]) lO0Iil10.I000OiO(parcel, i15, lli0oio0.CREATOR);
                                        break;
                                    case 3:
/* 1254 */                              io0ooooi0o2 = (io0oOoOi0o) lO0Iil10.I0001Ioi1lo(parcel, i15, io0oOoOi0o.CREATOR);
                                        break;
                                    case 4:
/* 1245 */                              io0ooooi0o3 = (io0oOoOi0o) lO0Iil10.I0001Ioi1lo(parcel, i15, io0oOoOi0o.CREATOR);
                                        break;
                                    case 5:
/* 1236 */                              io0ooooi0o4 = (io0oOoOi0o) lO0Iil10.I0001Ioi1lo(parcel, i15, io0oOoOi0o.CREATOR);
                                        break;
                                    case 6:
/* 1225 */                              strI000II10 = lO0Iil10.I000II(i15, parcel);
                                        break;
                                    case 7:
/* 1220 */                              fI00100l0 = lO0Iil10.I00100l0(i15, parcel);
                                        break;
                                    case '\b':
/* 1215 */                              strI000II11 = lO0Iil10.I000II(i15, parcel);
                                        break;
                                    case '\t':
/* 1210 */                              iI0010I0i8 = lO0Iil10.I0010I0i(i15, parcel);
                                        break;
                                    case '\n':
/* 1205 */                              zI000lI8 = lO0Iil10.I000lI(i15, parcel);
                                        break;
                                    case 11:
/* 1200 */                              iI0010I0i26 = lO0Iil10.I0010I0i(i15, parcel);
                                        break;
                                    case '\f':
/* 1195 */                              iI0010I0i27 = lO0Iil10.I0010I0i(i15, parcel);
                                        break;
                                    default:
/* 1191 */                              lO0Iil10.I001IO000(i15, parcel);
                                        break;
                                }
                            }
/* 1267 */                  lO0Iil10.I000l1(iI001i1O0Ol15, parcel);
/* 1272 */                  lIOl1OOi liol1ooi = new lIOl1OOi();
/* 1275 */                  liol1ooi.I00iOIl = lli0oio0VarArr;
/* 1277 */                  liol1ooi.I00iiI = io0ooooi0o2;
/* 1279 */                  liol1ooi.I00iiO = io0ooooi0o3;
/* 1281 */                  liol1ooi.I00iio = io0ooooi0o4;
/* 1283 */                  liol1ooi.I00ilI0I1 = strI000II10;
/* 1285 */                  liol1ooi.I00ilO0 = fI00100l0;
/* 1287 */                  liol1ooi.I00io1l = strI000II11;
/* 1289 */                  liol1ooi.I00ioIO = iI0010I0i8;
/* 1291 */                  liol1ooi.I00l0I0l0lO1 = zI000lI8;
/* 1293 */                  liol1ooi.I00l0OO0IO = iI0010I0i26;
/* 1295 */                  liol1ooi.I00li1OI = iI0010I0i27;
/* 1297 */                  VarHandle.storeStoreFence();
/* 1300 */                  return liol1ooi;
                        case 15:
/* 1004 */                  int iI001i1O0Ol16 = lO0Iil10.I001i1O0Ol(parcel);
/* 1010 */                  Bundle bundle = new Bundle();
/* 1013 */                  Scope[] scopeArr = Io0II1OlIo01.I00o0iI0io1;
/* 1015 */                  IlIII1l[] ilIII1lArr2 = Io0II1OlIo01.I00o0l1o1o0;
/* 1023 */                  IlIII1l[] ilIII1lArr3 = ilIII1lArr2;
/* 1025 */                  String strI000II12 = null;
/* 1027 */                  IBinder iBinderI00100o1O0lo = null;
/* 1029 */                  Account account = null;
/* 1031 */                  String strI000II13 = null;
/* 1033 */                  int iI0010I0i28 = 0;
/* 1034 */                  int iI0010I0i29 = 0;
/* 1036 */                  int iI0010I0i30 = 0;
/* 1038 */                  boolean zI000lI9 = false;
/* 1040 */                  int iI0010I0i31 = 0;
/* 1042 */                  boolean zI000lI10 = false;
/* 1048 */                  while (parcel.dataPosition() < iI001i1O0Ol16) {
/* 1050 */                      int i16 = parcel.readInt();
                                switch ((char) i16) {
                                    case 1:
/* 1151 */                              iI0010I0i28 = lO0Iil10.I0010I0i(i16, parcel);
                                        break;
                                    case 2:
/* 1146 */                              iI0010I0i29 = lO0Iil10.I0010I0i(i16, parcel);
                                        break;
                                    case 3:
/* 1141 */                              iI0010I0i30 = lO0Iil10.I0010I0i(i16, parcel);
                                        break;
                                    case 4:
/* 1136 */                              strI000II12 = lO0Iil10.I000II(i16, parcel);
                                        break;
                                    case 5:
/* 1131 */                              iBinderI00100o1O0lo = lO0Iil10.I00100o1O0lo(i16, parcel);
                                        break;
                                    case 6:
/* 1128 */                              scopeArr = (Scope[]) lO0Iil10.I000OiO(parcel, i16, Scope.CREATOR);
                                        break;
                                    case 7:
/* 1115 */                              bundle = lO0Iil10.I00000oIO(i16, parcel);
                                        break;
                                    case '\b':
/* 1112 */                              account = (Account) lO0Iil10.I0001Ioi1lo(parcel, i16, Account.CREATOR);
                                        break;
                                    case '\t':
                                    default:
/* 1058 */                              lO0Iil10.I001IO000(i16, parcel);
                                        break;
                                    case '\n':
/* 1101 */                              ilIII1lArr2 = (IlIII1l[]) lO0Iil10.I000OiO(parcel, i16, IlIII1l.CREATOR);
                                        break;
                                    case 11:
/* 1090 */                              ilIII1lArr3 = (IlIII1l[]) lO0Iil10.I000OiO(parcel, i16, IlIII1l.CREATOR);
                                        break;
                                    case '\f':
/* 1077 */                              zI000lI9 = lO0Iil10.I000lI(i16, parcel);
                                        break;
                                    case '\r':
/* 1072 */                              iI0010I0i31 = lO0Iil10.I0010I0i(i16, parcel);
                                        break;
                                    case 14:
/* 1067 */                              zI000lI10 = lO0Iil10.I000lI(i16, parcel);
                                        break;
                                    case 15:
/* 1062 */                              strI000II13 = lO0Iil10.I000II(i16, parcel);
                                        break;
                                }
                            }
/* 1156 */                  lO0Iil10.I000l1(iI001i1O0Ol16, parcel);
/* 1161 */                  return new Io0II1OlIo01(iI0010I0i28, iI0010I0i29, iI0010I0i30, strI000II12, iBinderI00100o1O0lo, scopeArr, bundle, account, ilIII1lArr2, ilIII1lArr3, zI000lI9, iI0010I0i31, zI000lI10, strI000II13);
                        case 16:
/* 977 */                   int iI001i1O0Ol17 = lO0Iil10.I001i1O0Ol(parcel);
/* 985 */                   while (parcel.dataPosition() < iI001i1O0Ol17) {
/* 991 */                       lO0Iil10.I001IO000(parcel.readInt(), parcel);
                            }
/* 995 */                   lO0Iil10.I000l1(iI001i1O0Ol17, parcel);
/* 1000 */                  return new lOiI01();
                        case 17:
/* 898 */                   int iI001i1O0Ol18 = lO0Iil10.I001i1O0Ol(parcel);
/* 902 */                   String strI000II14 = null;
/* 903 */                   String strI000II15 = null;
/* 904 */                   String strI000II16 = null;
/* 905 */                   int iI0010I0i32 = 0;
/* 906 */                   int iI0010I0i33 = 0;
/* 907 */                   int iI0010I0i34 = 0;
/* 908 */                   int iI0010I0i35 = 0;
/* 909 */                   int iI0010I0i36 = 0;
/* 914 */                   while (parcel.dataPosition() < iI001i1O0Ol18) {
/* 916 */                       int i17 = parcel.readInt();
                                switch ((char) i17) {
                                    case 1:
/* 963 */                               strI000II14 = lO0Iil10.I000II(i17, parcel);
                                        break;
                                    case 2:
/* 958 */                               strI000II15 = lO0Iil10.I000II(i17, parcel);
                                        break;
                                    case 3:
/* 953 */                               iI0010I0i32 = lO0Iil10.I0010I0i(i17, parcel);
                                        break;
                                    case 4:
/* 948 */                               iI0010I0i33 = lO0Iil10.I0010I0i(i17, parcel);
                                        break;
                                    case 5:
/* 943 */                               iI0010I0i34 = lO0Iil10.I0010I0i(i17, parcel);
                                        break;
                                    case 6:
/* 938 */                               iI0010I0i35 = lO0Iil10.I0010I0i(i17, parcel);
                                        break;
                                    case 7:
/* 933 */                               iI0010I0i36 = lO0Iil10.I0010I0i(i17, parcel);
                                        break;
                                    case '\b':
/* 928 */                               strI000II16 = lO0Iil10.I000II(i17, parcel);
                                        break;
                                    default:
/* 924 */                               lO0Iil10.I001IO000(i17, parcel);
                                        break;
                                }
                            }
/* 968 */                   lO0Iil10.I000l1(iI001i1O0Ol18, parcel);
/* 973 */                   return new lOiIOoIi11I(strI000II14, strI000II15, iI0010I0i32, iI0010I0i33, iI0010I0i34, iI0010I0i35, iI0010I0i36, strI000II16);
                        case PoseLandmark.RIGHT_PINKY:
/* 827 */                   int iI001i1O0Ol19 = lO0Iil10.I001i1O0Ol(parcel);
/* 831 */                   float fI00100l014 = 0.0f;
/* 832 */                   int iI0010I0i37 = 0;
/* 837 */                   while (parcel.dataPosition() < iI001i1O0Ol19) {
/* 839 */                       int i18 = parcel.readInt();
/* 843 */                       char c7 = (char) i18;
/* 844 */                       if (c7 == 1) {
/* 872 */                           iI0010I0i7 = lO0Iil10.I0010I0i(i18, parcel);
                                } else if (c7 == 2) {
/* 866 */                           fI00100l0 = lO0Iil10.I00100l0(i18, parcel);
                                } else if (c7 == 3) {
/* 861 */                           fI00100l014 = lO0Iil10.I00100l0(i18, parcel);
                                } else if (c7 != 4) {
/* 852 */                           lO0Iil10.I001IO000(i18, parcel);
                                } else {
/* 856 */                           iI0010I0i37 = lO0Iil10.I0010I0i(i18, parcel);
                                }
                            }
/* 878 */                   lO0Iil10.I000l1(iI001i1O0Ol19, parcel);
/* 883 */                   lOi1oIlo0i loi1oilo0i = new lOi1oIlo0i();
/* 886 */                   loi1oilo0i.I00iOIl = iI0010I0i7;
/* 888 */                   loi1oilo0i.I00iiI = fI00100l0;
/* 890 */                   loi1oilo0i.I00iiO = fI00100l014;
/* 892 */                   loi1oilo0i.I00iio = iI0010I0i37;
/* 894 */                   VarHandle.storeStoreFence();
/* 897 */                   return loi1oilo0i;
                        case PoseLandmark.LEFT_INDEX:
/* 775 */                   int iI001i1O0Ol20 = lO0Iil10.I001i1O0Ol(parcel);
/* 783 */                   while (parcel.dataPosition() < iI001i1O0Ol20) {
/* 785 */                       int i19 = parcel.readInt();
/* 789 */                       char c8 = (char) i19;
/* 790 */                       if (c8 == 1) {
/* 812 */                           strI000II2 = lO0Iil10.I000II(i19, parcel);
                                } else if (c8 == 2) {
/* 806 */                           jI0010o = lO0Iil10.I0010o(i19, parcel);
                                } else if (c8 != 3) {
/* 796 */                           lO0Iil10.I001IO000(i19, parcel);
                                } else {
/* 800 */                           iI0010I0i6 = lO0Iil10.I0010I0i(i19, parcel);
                                }
                            }
/* 818 */                   lO0Iil10.I000l1(iI001i1O0Ol20, parcel);
/* 823 */                   return new li1l0Iiiii(iI0010I0i6, jI0010o, strI000II2);
                        case PoseLandmark.RIGHT_INDEX:
/* 683 */                   int iI001i1O0Ol21 = lO0Iil10.I001i1O0Ol(parcel);
/* 687 */                   long jI0010o2 = 0;
/* 688 */                   long jI0010o3 = 0;
/* 690 */                   byte[] bArrI00000oOI5 = null;
/* 692 */                   String strI000II17 = null;
/* 694 */                   Bundle bundleI00000oIO2 = null;
/* 696 */                   String strI000II18 = null;
/* 698 */                   int iI0010I0i38 = 0;
/* 704 */                   while (parcel.dataPosition() < iI001i1O0Ol21) {
/* 706 */                       int i20 = parcel.readInt();
                                switch ((char) i20) {
                                    case 1:
/* 760 */                               jI0010o2 = lO0Iil10.I0010o(i20, parcel);
                                        break;
                                    case 2:
/* 753 */                               bArrI00000oOI5 = lO0Iil10.I00000oOI(i20, parcel);
                                        break;
                                    case 3:
/* 746 */                               strI000II17 = lO0Iil10.I000II(i20, parcel);
                                        break;
                                    case 4:
/* 739 */                               bundleI00000oIO2 = lO0Iil10.I00000oIO(i20, parcel);
                                        break;
                                    case 5:
/* 732 */                               iI0010I0i38 = lO0Iil10.I0010I0i(i20, parcel);
                                        break;
                                    case 6:
/* 725 */                               jI0010o3 = lO0Iil10.I0010o(i20, parcel);
                                        break;
                                    case 7:
/* 718 */                               strI000II18 = lO0Iil10.I000II(i20, parcel);
                                        break;
                                    default:
/* 714 */                               lO0Iil10.I001IO000(i20, parcel);
                                        break;
                                }
                            }
/* 766 */                   lO0Iil10.I000l1(iI001i1O0Ol21, parcel);
/* 771 */                   return new liIOlO1(jI0010o2, bArrI00000oOI5, strI000II17, bundleI00000oIO2, iI0010I0i38, jI0010o3, strI000II18);
                        case PoseLandmark.LEFT_THUMB:
/* 609 */                   int iI001i1O0Ol22 = lO0Iil10.I001i1O0Ol(parcel);
                            while (true) {
/* 613 */                       ArrayList arrayList = null;
/* 618 */                       while (parcel.dataPosition() < iI001i1O0Ol22) {
/* 620 */                           int i21 = parcel.readInt();
/* 625 */                           if (((char) i21) != 1) {
/* 627 */                               lO0Iil10.I001IO000(i21, parcel);
                                    } else {
/* 631 */                               int iI001IIilI0O = lO0Iil10.I001IIilI0O(i21, parcel);
/* 635 */                               int iDataPosition = parcel.dataPosition();
/* 639 */                               if (iI001IIilI0O == 0) {
                                            break;
                                        }
/* 644 */                               ArrayList arrayList2 = new ArrayList();
/* 647 */                               int i22 = parcel.readInt();
/* 652 */                               for (int i23 = 0; i23 < i22; i23++) {
/* 662 */                                   arrayList2.add(Integer.valueOf(parcel.readInt()));
                                        }
/* 669 */                               parcel.setDataPosition(iDataPosition + iI001IIilI0O);
/* 672 */                               arrayList = arrayList2;
                                    }
                                }
/* 674 */                       lO0Iil10.I000l1(iI001i1O0Ol22, parcel);
/* 679 */                       return new liIlli(arrayList);
                                break;
                            }
                        case PoseLandmark.RIGHT_THUMB:
/* 572 */                   int iI001i1O0Ol23 = lO0Iil10.I001i1O0Ol(parcel);
/* 580 */                   while (parcel.dataPosition() < iI001i1O0Ol23) {
/* 582 */                       int i24 = parcel.readInt();
/* 587 */                       if (((char) i24) != 1) {
/* 589 */                           lO0Iil10.I001IO000(i24, parcel);
                                } else {
/* 595 */                           arrayListI000iOII2 = lO0Iil10.I000iOII(parcel, i24, liIOlO1.CREATOR);
                                }
                            }
/* 600 */                   lO0Iil10.I000l1(iI001i1O0Ol23, parcel);
/* 605 */                   return new liO11Oo1loO(arrayListI000iOII2);
                        case PoseLandmark.LEFT_HIP:
/* 519 */                   int iI001i1O0Ol24 = lO0Iil10.I001i1O0Ol(parcel);
/* 527 */                   while (parcel.dataPosition() < iI001i1O0Ol24) {
/* 529 */                       int i25 = parcel.readInt();
/* 533 */                       char c9 = (char) i25;
/* 534 */                       if (c9 == 1) {
/* 550 */                           iI0010I0i5 = lO0Iil10.I0010I0i(i25, parcel);
                                } else if (c9 != 2) {
/* 538 */                           lO0Iil10.I001IO000(i25, parcel);
                                } else {
/* 544 */                           arrayListI000iOII = lO0Iil10.I000iOII(parcel, i25, PointF.CREATOR);
                                }
                            }
/* 556 */                   lO0Iil10.I000l1(iI001i1O0Ol24, parcel);
/* 561 */                   liOOl0OlOol0 liool0olool0 = new liOOl0OlOol0();
/* 564 */                   liool0olool0.I00iOIl = iI0010I0i5;
/* 566 */                   liool0olool0.I00iiI = arrayListI000iOII;
/* 568 */                   VarHandle.storeStoreFence();
/* 571 */                   return liool0olool0;
                        case PoseLandmark.RIGHT_HIP:
/* 446 */                   int iI001i1O0Ol25 = lO0Iil10.I001i1O0Ol(parcel);
/* 450 */                   float fI00100l015 = 0.0f;
/* 451 */                   int iI0010I0i39 = 0;
/* 452 */                   int iI0010I0i40 = 0;
/* 453 */                   int iI0010I0i41 = 0;
/* 454 */                   int iI0010I0i42 = 0;
/* 455 */                   boolean zI000lI11 = false;
/* 460 */                   while (parcel.dataPosition() < iI001i1O0Ol25) {
/* 462 */                       int i26 = parcel.readInt();
                                switch ((char) i26) {
                                    case 1:
/* 504 */                               iI0010I0i39 = lO0Iil10.I0010I0i(i26, parcel);
                                        break;
                                    case 2:
/* 498 */                               iI0010I0i40 = lO0Iil10.I0010I0i(i26, parcel);
                                        break;
                                    case 3:
/* 492 */                               iI0010I0i41 = lO0Iil10.I0010I0i(i26, parcel);
                                        break;
                                    case 4:
/* 486 */                               iI0010I0i42 = lO0Iil10.I0010I0i(i26, parcel);
                                        break;
                                    case 5:
/* 480 */                               zI000lI11 = lO0Iil10.I000lI(i26, parcel);
                                        break;
                                    case 6:
/* 474 */                               fI00100l015 = lO0Iil10.I00100l0(i26, parcel);
                                        break;
                                    default:
/* 470 */                               lO0Iil10.I001IO000(i26, parcel);
                                        break;
                                }
                            }
/* 510 */                   lO0Iil10.I000l1(iI001i1O0Ol25, parcel);
/* 515 */                   return new liOl11Ooi0iI(iI0010I0i39, iI0010I0i40, iI0010I0i41, iI0010I0i42, zI000lI11, fI00100l015);
                        case PoseLandmark.LEFT_KNEE:
/* 317 */                   int iI001i1O0Ol26 = lO0Iil10.I001i1O0Ol(parcel);
/* 321 */                   float fI00100l016 = 0.0f;
/* 322 */                   float fI00100l017 = 0.0f;
/* 323 */                   float fI00100l018 = 0.0f;
/* 324 */                   float fI00100l019 = 0.0f;
/* 325 */                   float fI00100l020 = 0.0f;
/* 326 */                   float fI00100l021 = 0.0f;
/* 327 */                   ArrayList arrayListI000iOII4 = null;
/* 328 */                   ArrayList arrayListI000iOII5 = null;
/* 333 */                   while (parcel.dataPosition() < iI001i1O0Ol26) {
/* 335 */                       int i27 = parcel.readInt();
                                switch ((char) i27) {
                                    case 1:
/* 406 */                               iI0010I0i4 = lO0Iil10.I0010I0i(i27, parcel);
                                        break;
                                    case 2:
/* 402 */                               rect = (Rect) lO0Iil10.I0001Ioi1lo(parcel, i27, Rect.CREATOR);
                                        break;
                                    case 3:
/* 391 */                               fI00100l0 = lO0Iil10.I00100l0(i27, parcel);
                                        break;
                                    case 4:
/* 386 */                               fI00100l016 = lO0Iil10.I00100l0(i27, parcel);
                                        break;
                                    case 5:
/* 381 */                               fI00100l017 = lO0Iil10.I00100l0(i27, parcel);
                                        break;
                                    case 6:
/* 376 */                               fI00100l018 = lO0Iil10.I00100l0(i27, parcel);
                                        break;
                                    case 7:
/* 371 */                               fI00100l019 = lO0Iil10.I00100l0(i27, parcel);
                                        break;
                                    case '\b':
/* 366 */                               fI00100l020 = lO0Iil10.I00100l0(i27, parcel);
                                        break;
                                    case '\t':
/* 361 */                               fI00100l021 = lO0Iil10.I00100l0(i27, parcel);
                                        break;
                                    case '\n':
/* 356 */                               arrayListI000iOII4 = lO0Iil10.I000iOII(parcel, i27, lil0ii1OIO0.CREATOR);
                                        break;
                                    case 11:
/* 349 */                               arrayListI000iOII5 = lO0Iil10.I000iOII(parcel, i27, liOOl0OlOol0.CREATOR);
                                        break;
                                    default:
/* 343 */                               lO0Iil10.I001IO000(i27, parcel);
                                        break;
                                }
                            }
/* 412 */                   lO0Iil10.I000l1(iI001i1O0Ol26, parcel);
/* 417 */                   lii0IOlOO1 lii0ioloo1 = new lii0IOlOO1();
/* 420 */                   lii0ioloo1.I00iOIl = iI0010I0i4;
/* 422 */                   lii0ioloo1.I00iiI = rect;
/* 424 */                   lii0ioloo1.I00iiO = fI00100l0;
/* 426 */                   lii0ioloo1.I00iio = fI00100l016;
/* 428 */                   lii0ioloo1.I00ilI0I1 = fI00100l017;
/* 430 */                   lii0ioloo1.I00ilO0 = fI00100l018;
/* 432 */                   lii0ioloo1.I00io1l = fI00100l019;
/* 434 */                   lii0ioloo1.I00ioIO = fI00100l020;
/* 436 */                   lii0ioloo1.I00l0I0l0lO1 = fI00100l021;
/* 438 */                   lii0ioloo1.I00l0OO0IO = arrayListI000iOII4;
/* 440 */                   lii0ioloo1.I00li1OI = arrayListI000iOII5;
/* 442 */                   VarHandle.storeStoreFence();
/* 445 */                   return lii0ioloo1;
                        case PoseLandmark.RIGHT_KNEE:
/* 262 */                   int iI001i1O0Ol27 = lO0Iil10.I001i1O0Ol(parcel);
/* 270 */                   while (parcel.dataPosition() < iI001i1O0Ol27) {
/* 272 */                       int i28 = parcel.readInt();
/* 276 */                       char c10 = (char) i28;
/* 277 */                       if (c10 == 1) {
/* 295 */                           iI0010I0i3 = lO0Iil10.I0010I0i(i28, parcel);
                                } else if (c10 != 2) {
/* 281 */                           lO0Iil10.I001IO000(i28, parcel);
                                } else {
/* 291 */                           pointF = (PointF) lO0Iil10.I0001Ioi1lo(parcel, i28, PointF.CREATOR);
                                }
                            }
/* 301 */                   lO0Iil10.I000l1(iI001i1O0Ol27, parcel);
/* 306 */                   lil0ii1OIO0 lil0ii1oio0 = new lil0ii1OIO0();
/* 309 */                   lil0ii1oio0.I00iOIl = iI0010I0i3;
/* 311 */                   lil0ii1oio0.I00iiI = pointF;
/* 313 */                   VarHandle.storeStoreFence();
/* 316 */                   return lil0ii1oio0;
                        case 27:
/* 139 */                   int iI001i1O0Ol28 = lO0Iil10.I001i1O0Ol(parcel);
/* 143 */                   String strI000II19 = null;
/* 144 */                   Long lI00111O = null;
/* 145 */                   Float fValueOf = null;
/* 146 */                   String strI000II20 = null;
/* 147 */                   String strI000II21 = null;
/* 148 */                   Double dI000oI1ioi = null;
/* 153 */                   while (parcel.dataPosition() < iI001i1O0Ol28) {
/* 155 */                       int i29 = parcel.readInt();
                                switch ((char) i29) {
                                    case 1:
/* 217 */                               iI0010I0i2 = lO0Iil10.I0010I0i(i29, parcel);
                                        break;
                                    case 2:
/* 212 */                               strI000II19 = lO0Iil10.I000II(i29, parcel);
                                        break;
                                    case 3:
/* 207 */                               jI0010o = lO0Iil10.I0010o(i29, parcel);
                                        break;
                                    case 4:
/* 202 */                               lI00111O = lO0Iil10.I00111O(i29, parcel);
                                        break;
                                    case 5:
/* 182 */                               int iI001IIilI0O2 = lO0Iil10.I001IIilI0O(i29, parcel);
/* 186 */                               if (iI001IIilI0O2 == 0) {
/* 188 */                                   fValueOf = null;
                                            break;
                                        } else {
/* 190 */                                   lO0Iil10.I001iOo1i0O(parcel, iI001IIilI0O2, 4);
/* 197 */                                   fValueOf = Float.valueOf(parcel.readFloat());
                                            break;
                                        }
                                    case 6:
/* 177 */                               strI000II20 = lO0Iil10.I000II(i29, parcel);
                                        break;
                                    case 7:
/* 172 */                               strI000II21 = lO0Iil10.I000II(i29, parcel);
                                        break;
                                    case '\b':
/* 167 */                               dI000oI1ioi = lO0Iil10.I000oI1ioi(i29, parcel);
                                        break;
                                    default:
/* 163 */                               lO0Iil10.I001IO000(i29, parcel);
                                        break;
                                }
                            }
/* 222 */                   lO0Iil10.I000l1(iI001i1O0Ol28, parcel);
/* 227 */                   lio0llOI0 lio0lloi0 = new lio0llOI0();
/* 230 */                   lio0lloi0.I00iOIl = iI0010I0i2;
/* 232 */                   lio0lloi0.I00iiI = strI000II19;
/* 234 */                   lio0lloi0.I00iiO = jI0010o;
/* 236 */                   lio0lloi0.I00iio = lI00111O;
/* 238 */                   if (iI0010I0i2 != 1) {
/* 251 */                       dValueOf = dI000oI1ioi;
                            } else if (fValueOf != null) {
/* 246 */                       dValueOf = Double.valueOf(fValueOf.doubleValue());
                            }
/* 252 */                   lio0lloi0.I00io1l = dValueOf;
/* 254 */                   lio0lloi0.I00ilI0I1 = strI000II20;
/* 256 */                   lio0lloi0.I00ilO0 = strI000II21;
/* 258 */                   VarHandle.storeStoreFence();
/* 261 */                   return lio0lloi0;
                        case PoseLandmark.RIGHT_ANKLE:
/* 104 */                   int iI001i1O0Ol29 = lO0Iil10.I001i1O0Ol(parcel);
/* 112 */                   while (parcel.dataPosition() < iI001i1O0Ol29) {
/* 114 */                       int i30 = parcel.readInt();
/* 119 */                       if (((char) i30) != 2) {
/* 121 */                           lO0Iil10.I001IO000(i30, parcel);
                                } else {
/* 125 */                           strI000II = lO0Iil10.I000II(i30, parcel);
                                }
                            }
/* 130 */                   lO0Iil10.I000l1(iI001i1O0Ol29, parcel);
/* 135 */                   return new liiOo00(strI000II);
                        default:
/* 23 */                    int iI001i1O0Ol30 = lO0Iil10.I001i1O0Ol(parcel);
/* 27 */                    long jI0010o4 = 0;
/* 29 */                    int iI0010I0i43 = 0;
/* 30 */                    int iI0010I0i44 = 0;
/* 32 */                    int iI0010I0i45 = 0;
/* 34 */                    int iI0010I0i46 = 0;
/* 40 */                    while (parcel.dataPosition() < iI001i1O0Ol30) {
/* 42 */                        int i31 = parcel.readInt();
/* 46 */                        char c11 = (char) i31;
/* 47 */                        if (c11 == 2) {
/* 89 */                            iI0010I0i43 = lO0Iil10.I0010I0i(i31, parcel);
                                } else if (c11 == 3) {
/* 82 */                            iI0010I0i44 = lO0Iil10.I0010I0i(i31, parcel);
                                } else if (c11 == 4) {
/* 75 */                            iI0010I0i45 = lO0Iil10.I0010I0i(i31, parcel);
                                } else if (c11 == 5) {
/* 68 */                            jI0010o4 = lO0Iil10.I0010o(i31, parcel);
                                } else if (c11 != 6) {
/* 57 */                            lO0Iil10.I001IO000(i31, parcel);
                                } else {
/* 61 */                            iI0010I0i46 = lO0Iil10.I0010I0i(i31, parcel);
                                }
                            }
/* 95 */                    lO0Iil10.I000l1(iI001i1O0Ol30, parcel);
/* 100 */                   return new liiOlo1O01o(iI0010I0i43, iI0010I0i44, iI0010I0i45, jI0010o4, iI0010I0i46);
                    }
                }

                @Override
                public final Object[] newArray(int i) {
                    switch (this.I00000oIO) {
                        case 0:
/* 93 */                    return new io0oIoliO1[i];
                        case 1:
/* 90 */                    return new io0oOoOi0o[i];
                        case 2:
/* 87 */                    return new l0oI0OIiiIio[i];
                        case 3:
/* 84 */                    return new l0IIOl11l[i];
                        case 4:
/* 81 */                    return new l1i0oiOO[i];
                        case 5:
/* 78 */                    return new l1iIl0OO[i];
                        case 6:
/* 75 */                    return new l1ii1l[i];
                        case 7:
/* 72 */                    return new l1ioo00iI[i];
                        case 8:
/* 69 */                    return new l1lIII1IiI[i];
                        case 9:
/* 66 */                    return new l1li0i1i[i];
                        case 10:
/* 63 */                    return new l1llooo1l10l[i];
                        case 11:
/* 60 */                    return new l1o0OO1[i];
                        case 12:
/* 57 */                    return new l1O1o0o10o[i];
                        case 13:
/* 54 */                    return new IOloii1OiOI[i];
                        case 14:
/* 51 */                    return new lIOl1OOi[i];
                        case 15:
/* 48 */                    return new Io0II1OlIo01[i];
                        case 16:
/* 45 */                    return new lOiI01[i];
                        case 17:
/* 42 */                    return new lOiIOoIi11I[i];
                        case PoseLandmark.RIGHT_PINKY:
/* 39 */                    return new lOi1oIlo0i[i];
                        case PoseLandmark.LEFT_INDEX:
/* 36 */                    return new li1l0Iiiii[i];
                        case PoseLandmark.RIGHT_INDEX:
/* 33 */                    return new liIOlO1[i];
                        case PoseLandmark.LEFT_THUMB:
/* 30 */                    return new liIlli[i];
                        case PoseLandmark.RIGHT_THUMB:
/* 27 */                    return new liO11Oo1loO[i];
                        case PoseLandmark.LEFT_HIP:
/* 24 */                    return new liOOl0OlOol0[i];
                        case PoseLandmark.RIGHT_HIP:
/* 21 */                    return new liOl11Ooi0iI[i];
                        case PoseLandmark.LEFT_KNEE:
/* 18 */                    return new lii0IOlOO1[i];
                        case PoseLandmark.RIGHT_KNEE:
/* 15 */                    return new lil0ii1OIO0[i];
                        case 27:
/* 12 */                    return new lio0llOI0[i];
                        case PoseLandmark.RIGHT_ANKLE:
/* 9 */                     return new liiOo00[i];
                        default:
/* 6 */                     return new liiOlo1O01o[i];
                    }
                }
            }

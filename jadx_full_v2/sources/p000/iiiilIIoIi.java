            package p000;

            import android.app.PendingIntent;
            import android.content.Intent;
            import android.graphics.Bitmap;
            import android.graphics.PointF;
            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.ParcelFileDescriptor;
            import android.os.Parcelable;
            import com.google.android.gms.common.api.Scope;
            import com.google.android.gms.common.api.Status;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            
            public final class iiiilIIoIi implements Parcelable.Creator {
                public final int I00000oIO;

                public iiiilIIoIi(int i) {
/* 1 */             this.I00000oIO = i;
                }

                public static void I00000oIO(iiooOolI1 iiooooli1, Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 7 */             int i2 = iiooooli1.I00iOIl;
/* 11 */            lO0IioIooIl.I000oI1ioi(parcel, 1, 4);
/* 14 */            parcel.writeInt(i2);
/* 20 */            lO0IioIooIl.I000OiO(parcel, 2, iiooooli1.I00iiI);
/* 26 */            lO0IioIooIl.I000OiO(parcel, 3, iiooooli1.I00iiO);
/* 29 */            Boolean bool = iiooooli1.I00iio;
/* 31 */            if (bool != null) {
/* 34 */                lO0IioIooIl.I000oI1ioi(parcel, 4, 4);
/* 41 */                parcel.writeInt(bool.booleanValue() ? 1 : 0);
                    }
/* 47 */            lO0IioIooIl.I000l1(parcel, 5, iiooooli1.I00ilI0I1);
/* 53 */            lO0IioIooIl.I000OOo1O(parcel, 6, iiooooli1.I00ilO0, i);
/* 59 */            lO0IioIooIl.I000O01llI0(parcel, 7, iiooooli1.I00io1l);
/* 66 */            lO0IioIooIl.I000O01llI0(parcel, 8, iiooooli1.I00ioIO);
/* 73 */            lO0IioIooIl.I000l1(parcel, 9, iiooooli1.I00l0I0l0lO1);
/* 80 */            lO0IioIooIl.I000O01llI0(parcel, 10, iiooooli1.I00l0OO0IO);
/* 87 */            lO0IioIooIl.I000O01llI0(parcel, 11, iiooooli1.I00li1OI);
/* 94 */            lO0IioIooIl.I0000O(parcel, 12, iiooooli1.I00ll1);
/* 101 */           lO0IioIooIl.I0000O(parcel, 13, iiooooli1.I00lli11);
/* 108 */           lO0IioIooIl.I000O01llI0(parcel, 14, iiooooli1.I00lll10);
/* 115 */           lO0IioIooIl.I000O01llI0(parcel, 15, iiooooli1.I00o0iI0io1);
/* 122 */           lO0IioIooIl.I000OiO(parcel, 16, iiooooli1.I00o0l1o1o0);
/* 129 */           lO0IioIooIl.I000o00OoI0I(parcel, 17, iiooooli1.I00o101lO);
/* 136 */           lO0IioIooIl.I000l1(parcel, 18, iiooooli1.I00oI0i);
/* 143 */           lO0IioIooIl.I000OiO(parcel, 19, iiooooli1.I00oII);
/* 150 */           lO0IioIooIl.I00000oIO(parcel, 20, iiooooli1.I00oIiI10);
/* 153 */           lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }

                @Override
                public final Object createFromParcel(Parcel parcel) {
                    ii1loioI ii1o1ioiil0i;
                    ii0ilo1o1I ii0ilo1o1i;
/* 7 */             float fI00100l0 = 0.0f;
/* 8 */             long jI0010o = 0;
/* 14 */            int iI0010I0i = 0;
/* 14 */            int iI0010I0i2 = 0;
/* 14 */            int iI0010I0i3 = 0;
/* 14 */            int iI0010I0i4 = 0;
/* 14 */            int iI0010I0i5 = 0;
/* 14 */            int iI0010I0i6 = 0;
/* 14 */            boolean zI000lI = false;
/* 14 */            int iI0010I0i7 = 0;
/* 14 */            int iI0010I0i8 = 0;
/* 14 */            int iI0010I0i9 = 0;
/* 14 */            int iI0010I0i10 = 0;
/* 14 */            int iI0010I0i11 = 0;
/* 14 */            int iI0010I0i12 = 0;
/* 14 */            int iI0010I0i13 = 0;
/* 14 */            int iI0010I0i14 = 0;
/* 15 */            IBinder iBinderI00100o1O0lo = null;
/* 15 */            String strI000II = null;
/* 15 */            PointF[] pointFArr = null;
/* 15 */            ArrayList arrayListI000iOII = null;
/* 15 */            String strI000II2 = null;
/* 15 */            String strI000II3 = null;
/* 15 */            String strI000II4 = null;
/* 15 */            String strI000II5 = null;
/* 15 */            String strI000II6 = null;
/* 15 */            ArrayList arrayListI000iOII2 = null;
                    switch (this.I00000oIO) {
                        case 0:
/* 2242 */                  int iI001i1O0Ol = lO0Iil10.I001i1O0Ol(parcel);
/* 2246 */                  String strI000II7 = null;
/* 2251 */                  while (parcel.dataPosition() < iI001i1O0Ol) {
/* 2253 */                      int i = parcel.readInt();
/* 2257 */                      char c = (char) i;
/* 2258 */                      if (c == 1) {
/* 2271 */                          iI0010I0i = lO0Iil10.I0010I0i(i, parcel);
                                } else if (c != 2) {
/* 2262 */                          lO0Iil10.I001IO000(i, parcel);
                                } else {
/* 2266 */                          strI000II7 = lO0Iil10.I000II(i, parcel);
                                }
                            }
/* 2276 */                  lO0Iil10.I000l1(iI001i1O0Ol, parcel);
/* 2281 */                  return new iOiIOl1lOlI(iI0010I0i, strI000II7);
                        case 1:
/* 2198 */                  int iI001i1O0Ol2 = lO0Iil10.I001i1O0Ol(parcel);
/* 2202 */                  String strI000II8 = null;
/* 2203 */                  String strI000II9 = null;
/* 2208 */                  while (parcel.dataPosition() < iI001i1O0Ol2) {
/* 2210 */                      int i2 = parcel.readInt();
/* 2214 */                      char c2 = (char) i2;
/* 2215 */                      if (c2 == 1) {
/* 2228 */                          strI000II9 = lO0Iil10.I000II(i2, parcel);
                                } else if (c2 != 2) {
/* 2219 */                          lO0Iil10.I001IO000(i2, parcel);
                                } else {
/* 2223 */                          strI000II8 = lO0Iil10.I000II(i2, parcel);
                                }
                            }
/* 2233 */                  lO0Iil10.I000l1(iI001i1O0Ol2, parcel);
/* 2238 */                  return new iOioOI0o00(strI000II9, strI000II8);
                        case 2:
/* 2139 */                  int iI001i1O0Ol3 = lO0Iil10.I001i1O0Ol(parcel);
/* 2143 */                  boolean zI000lI2 = true;
/* 2144 */                  int iI0010I0i15 = 0;
/* 2145 */                  int iI0010I0i16 = 0;
/* 2150 */                  while (parcel.dataPosition() < iI001i1O0Ol3) {
/* 2152 */                      int i3 = parcel.readInt();
/* 2156 */                      char c3 = (char) i3;
/* 2157 */                      if (c3 == 1) {
/* 2184 */                          iI0010I0i14 = lO0Iil10.I0010I0i(i3, parcel);
                                } else if (c3 == 2) {
/* 2179 */                          iI0010I0i15 = lO0Iil10.I0010I0i(i3, parcel);
                                } else if (c3 == 3) {
/* 2174 */                          iI0010I0i16 = lO0Iil10.I0010I0i(i3, parcel);
                                } else if (c3 != 4) {
/* 2165 */                          lO0Iil10.I001IO000(i3, parcel);
                                } else {
/* 2169 */                          zI000lI2 = lO0Iil10.I000lI(i3, parcel);
                                }
                            }
/* 2189 */                  lO0Iil10.I000l1(iI001i1O0Ol3, parcel);
/* 2194 */                  return new IOiIOIII0io(iI0010I0i14, iI0010I0i15, iI0010I0i16, zI000lI2);
                        case 3:
/* 2035 */                  int iI001i1O0Ol4 = lO0Iil10.I001i1O0Ol(parcel);
/* 2039 */                  int iI0010I0i17 = 0;
/* 2040 */                  int iI0010I0i18 = 0;
/* 2041 */                  boolean zI000lI3 = false;
/* 2043 */                  String strI000II10 = null;
/* 2044 */                  Bitmap bitmap = null;
/* 2045 */                  ParcelFileDescriptor parcelFileDescriptor = null;
/* 2046 */                  iiOoiOI1Oo iiooioi1oo = null;
/* 2048 */                  iiiIolO0I iiiiolo0i = null;
/* 2054 */                  while (parcel.dataPosition() < iI001i1O0Ol4) {
/* 2056 */                      int i4 = parcel.readInt();
                                switch ((char) i4) {
                                    case 1:
/* 2125 */                              iI0010I0i17 = lO0Iil10.I0010I0i(i4, parcel);
                                        break;
                                    case 2:
/* 2120 */                              strI000II10 = lO0Iil10.I000II(i4, parcel);
                                        break;
                                    case 3:
/* 2117 */                              bitmap = (Bitmap) lO0Iil10.I0001Ioi1lo(parcel, i4, Bitmap.CREATOR);
                                        break;
                                    case 4:
/* 2105 */                              iI0010I0i18 = lO0Iil10.I0010I0i(i4, parcel);
                                        break;
                                    case 5:
/* 2102 */                              parcelFileDescriptor = (ParcelFileDescriptor) lO0Iil10.I0001Ioi1lo(parcel, i4, ParcelFileDescriptor.CREATOR);
                                        break;
                                    case 6:
/* 2090 */                              zI000lI3 = lO0Iil10.I000lI(i4, parcel);
                                        break;
                                    case 7:
/* 2087 */                              iiooioi1oo = (iiOoiOI1Oo) lO0Iil10.I0001Ioi1lo(parcel, i4, iiOoiOI1Oo.CREATOR);
                                        break;
                                    case '\b':
/* 2076 */                              iiiiolo0i = (iiiIolO0I) lO0Iil10.I0001Ioi1lo(parcel, i4, iiiIolO0I.CREATOR);
                                        break;
                                    default:
/* 2064 */                              lO0Iil10.I001IO000(i4, parcel);
                                        break;
                                }
                            }
/* 2130 */                  lO0Iil10.I000l1(iI001i1O0Ol4, parcel);
/* 2135 */                  return new iiio1OOIi(iI0010I0i17, strI000II10, bitmap, iI0010I0i18, parcelFileDescriptor, zI000lI3, iiooioi1oo, iiiiolo0i);
                        case 4:
/* 1991 */                  int iI001i1O0Ol5 = lO0Iil10.I001i1O0Ol(parcel);
/* 1995 */                  String strI000II11 = null;
/* 1996 */                  String strI000II12 = null;
/* 2001 */                  while (parcel.dataPosition() < iI001i1O0Ol5) {
/* 2003 */                      int i5 = parcel.readInt();
/* 2007 */                      char c4 = (char) i5;
/* 2008 */                      if (c4 == 1) {
/* 2021 */                          strI000II12 = lO0Iil10.I000II(i5, parcel);
                                } else if (c4 != 2) {
/* 2012 */                          lO0Iil10.I001IO000(i5, parcel);
                                } else {
/* 2016 */                          strI000II11 = lO0Iil10.I000II(i5, parcel);
                                }
                            }
/* 2026 */                  lO0Iil10.I000l1(iI001i1O0Ol5, parcel);
/* 2031 */                  return new iOlI0l0l1oi0(strI000II12, strI000II11);
                        case 5:
/* 1940 */                  int iI001i1O0Ol6 = lO0Iil10.I001i1O0Ol(parcel);
/* 1944 */                  String strI000II13 = null;
/* 1945 */                  String strI000II14 = null;
/* 1950 */                  while (parcel.dataPosition() < iI001i1O0Ol6) {
/* 1952 */                      int i6 = parcel.readInt();
/* 1956 */                      char c5 = (char) i6;
/* 1957 */                      if (c5 == 1) {
/* 1977 */                          strI000II14 = lO0Iil10.I000II(i6, parcel);
                                } else if (c5 == 2) {
/* 1972 */                          strI000II13 = lO0Iil10.I000II(i6, parcel);
                                } else if (c5 != 3) {
/* 1963 */                          lO0Iil10.I001IO000(i6, parcel);
                                } else {
/* 1967 */                          iI0010I0i13 = lO0Iil10.I0010I0i(i6, parcel);
                                }
                            }
/* 1982 */                  lO0Iil10.I000l1(iI001i1O0Ol6, parcel);
/* 1987 */                  return new iOli1io(strI000II14, strI000II13, iI0010I0i13);
                        case 6:
/* 1890 */                  int iI001i1O0Ol7 = lO0Iil10.I001i1O0Ol(parcel);
/* 1894 */                  ParcelFileDescriptor parcelFileDescriptor2 = null;
/* 1895 */                  ArrayList arrayListI000iOII3 = null;
/* 1900 */                  while (parcel.dataPosition() < iI001i1O0Ol7) {
/* 1902 */                      int i7 = parcel.readInt();
/* 1906 */                      char c6 = (char) i7;
/* 1907 */                      if (c6 == 1) {
/* 1926 */                          arrayListI000iOII3 = lO0Iil10.I000iOII(parcel, i7, iiio1OOIi.CREATOR);
                                } else if (c6 != 2) {
/* 1911 */                          lO0Iil10.I001IO000(i7, parcel);
                                } else {
/* 1921 */                          parcelFileDescriptor2 = (ParcelFileDescriptor) lO0Iil10.I0001Ioi1lo(parcel, i7, ParcelFileDescriptor.CREATOR);
                                }
                            }
/* 1931 */                  lO0Iil10.I000l1(iI001i1O0Ol7, parcel);
/* 1936 */                  return new iilIIi1(arrayListI000iOII3, parcelFileDescriptor2);
                        case 7:
/* 1810 */                  int iI001i1O0Ol8 = lO0Iil10.I001i1O0Ol(parcel);
/* 1814 */                  int iI0010I0i19 = 0;
/* 1815 */                  int iI0010I0i20 = 0;
/* 1816 */                  int iI0010I0i21 = 0;
/* 1821 */                  while (parcel.dataPosition() < iI001i1O0Ol8) {
/* 1823 */                      int i8 = parcel.readInt();
/* 1827 */                      char c7 = (char) i8;
/* 1828 */                      if (c7 == 1) {
/* 1863 */                          iI0010I0i12 = lO0Iil10.I0010I0i(i8, parcel);
                                } else if (c7 == 2) {
/* 1858 */                          iI0010I0i19 = lO0Iil10.I0010I0i(i8, parcel);
                                } else if (c7 == 3) {
/* 1853 */                          iI0010I0i20 = lO0Iil10.I0010I0i(i8, parcel);
                                } else if (c7 == 4) {
/* 1848 */                          iI0010I0i21 = lO0Iil10.I0010I0i(i8, parcel);
                                } else if (c7 != 5) {
/* 1839 */                          lO0Iil10.I001IO000(i8, parcel);
                                } else {
/* 1843 */                          jI0010o = lO0Iil10.I0010o(i8, parcel);
                                }
                            }
/* 1868 */                  lO0Iil10.I000l1(iI001i1O0Ol8, parcel);
/* 1873 */                  iilO0il1i iilo0il1i = new iilO0il1i();
/* 1876 */                  iilo0il1i.I00iOIl = iI0010I0i12;
/* 1878 */                  iilo0il1i.I00iiI = iI0010I0i19;
/* 1880 */                  iilo0il1i.I00iiO = iI0010I0i20;
/* 1882 */                  iilo0il1i.I00iio = iI0010I0i21;
/* 1884 */                  iilo0il1i.I00ilI0I1 = jI0010o;
/* 1886 */                  VarHandle.storeStoreFence();
/* 1889 */                  return iilo0il1i;
                        case 8:
/* 1716 */                  int iI001i1O0Ol9 = lO0Iil10.I001i1O0Ol(parcel);
/* 1720 */                  float fI00100l02 = 0.0f;
/* 1721 */                  Bundle bundleI00000oIO = null;
/* 1722 */                  o0Il0Ii1 o0il0ii1 = null;
/* 1723 */                  ArrayList arrayListI000iOII4 = null;
/* 1724 */                  String strI000II15 = null;
/* 1729 */                  while (parcel.dataPosition() < iI001i1O0Ol9) {
/* 1731 */                      int i9 = parcel.readInt();
                                switch ((char) i9) {
                                    case 1:
/* 1779 */                              strI000II15 = lO0Iil10.I000II(i9, parcel);
                                        break;
                                    case 2:
/* 1774 */                              fI00100l0 = lO0Iil10.I00100l0(i9, parcel);
                                        break;
                                    case 3:
/* 1769 */                              iI0010I0i11 = lO0Iil10.I0010I0i(i9, parcel);
                                        break;
                                    case 4:
/* 1764 */                              fI00100l02 = lO0Iil10.I00100l0(i9, parcel);
                                        break;
                                    case 5:
/* 1759 */                              bundleI00000oIO = lO0Iil10.I00000oIO(i9, parcel);
                                        break;
                                    case 6:
/* 1756 */                              o0il0ii1 = (o0Il0Ii1) lO0Iil10.I0001Ioi1lo(parcel, i9, o0Il0Ii1.CREATOR);
                                        break;
                                    case 7:
/* 1745 */                              arrayListI000iOII4 = lO0Iil10.I000iOII(parcel, i9, il1O0O01.CREATOR);
                                        break;
                                    default:
/* 1739 */                              lO0Iil10.I001IO000(i9, parcel);
                                        break;
                                }
                            }
/* 1784 */                  lO0Iil10.I000l1(iI001i1O0Ol9, parcel);
/* 1789 */                  iilOIlOio iiloiloio = new iilOIlOio();
/* 1792 */                  iiloiloio.I00iOIl = strI000II15;
/* 1794 */                  iiloiloio.I00iiI = fI00100l0;
/* 1796 */                  iiloiloio.I00iiO = iI0010I0i11;
/* 1798 */                  iiloiloio.I00iio = fI00100l02;
/* 1800 */                  iiloiloio.I00ilI0I1 = bundleI00000oIO;
/* 1802 */                  iiloiloio.I00ilO0 = o0il0ii1;
/* 1804 */                  iiloiloio.I00io1l = arrayListI000iOII4;
/* 1806 */                  VarHandle.storeStoreFence();
/* 1809 */                  return iiloiloio;
                        case 9:
/* 1378 */                  int iI001i1O0Ol10 = lO0Iil10.I001i1O0Ol(parcel);
/* 1382 */                  float fI00100l03 = 1.0f;
/* 1384 */                  int iI0010I0i22 = 0;
/* 1385 */                  int iI0010I0i23 = 0;
/* 1386 */                  boolean zI000lI4 = false;
/* 1387 */                  int iI0010I0i24 = 0;
/* 1388 */                  int iI0010I0i25 = 0;
/* 1389 */                  int iI0010I0i26 = 0;
/* 1390 */                  boolean zI000lI5 = false;
/* 1392 */                  int iI0010I0i27 = 0;
/* 1394 */                  int iI0010I0i28 = 0;
/* 1396 */                  int iI0010I0i29 = 0;
/* 1398 */                  Bundle bundleI00000oIO2 = null;
/* 1399 */                  String strI000II16 = null;
/* 1400 */                  IBinder iBinderI00100o1O0lo2 = null;
/* 1401 */                  ArrayList arrayListI000iOII5 = null;
/* 1403 */                  ArrayList arrayListI000OOo1O = null;
/* 1405 */                  il0llOOOOIO il0llooooio = null;
/* 1407 */                  iilIIi1 iiliii1 = null;
/* 1409 */                  iiooOolI1 iiooooli1 = null;
/* 1411 */                  il1o1o0111Oi il1o1o0111oi = null;
/* 1417 */                  while (parcel.dataPosition() < iI001i1O0Ol10) {
/* 1419 */                      int i10 = parcel.readInt();
/* 1423 */                      Bundle bundle = bundleI00000oIO2;
                                switch ((char) i10) {
                                    case 1:
/* 1573 */                              arrayListI000iOII5 = lO0Iil10.I000iOII(parcel, i10, iiio1OOIi.CREATOR);
                                        break;
                                    case 2:
/* 1565 */                              fI00100l0 = lO0Iil10.I00100l0(i10, parcel);
                                        break;
                                    case 3:
/* 1559 */                              iI0010I0i10 = lO0Iil10.I0010I0i(i10, parcel);
                                        break;
                                    case 4:
/* 1554 */                              arrayListI000OOo1O = lO0Iil10.I000OOo1O(i10, parcel);
                                        break;
                                    case 5:
/* 1549 */                              iI0010I0i22 = lO0Iil10.I0010I0i(i10, parcel);
                                        break;
                                    case 6:
/* 1544 */                              iI0010I0i23 = lO0Iil10.I0010I0i(i10, parcel);
                                        break;
                                    case 7:
/* 1539 */                              iBinderI00100o1O0lo = lO0Iil10.I00100o1O0lo(i10, parcel);
                                        break;
                                    case '\b':
/* 1534 */                              zI000lI4 = lO0Iil10.I000lI(i10, parcel);
                                        break;
                                    case '\t':
/* 1529 */                              iI0010I0i24 = lO0Iil10.I0010I0i(i10, parcel);
                                        break;
                                    case '\n':
/* 1524 */                              iBinderI00100o1O0lo2 = lO0Iil10.I00100o1O0lo(i10, parcel);
                                        break;
                                    case 11:
/* 1519 */                              iI0010I0i25 = lO0Iil10.I0010I0i(i10, parcel);
                                        break;
                                    case '\f':
/* 1514 */                              iI0010I0i26 = lO0Iil10.I0010I0i(i10, parcel);
                                        break;
                                    case '\r':
/* 1509 */                              strI000II16 = lO0Iil10.I000II(i10, parcel);
                                        break;
                                    case 14:
/* 1504 */                              bundleI00000oIO2 = lO0Iil10.I00000oIO(i10, parcel);
                                        continue;
                                    case 15:
/* 1499 */                              iI0010I0i29 = lO0Iil10.I0010I0i(i10, parcel);
                                        break;
                                    case 16:
/* 1496 */                              il0llooooio = (il0llOOOOIO) lO0Iil10.I0001Ioi1lo(parcel, i10, il0llOOOOIO.CREATOR);
                                        break;
                                    case 17:
/* 1483 */                              iI0010I0i28 = lO0Iil10.I0010I0i(i10, parcel);
                                        break;
                                    case PoseLandmark.RIGHT_PINKY:
/* 1480 */                              iiliii1 = (iilIIi1) lO0Iil10.I0001Ioi1lo(parcel, i10, iilIIi1.CREATOR);
                                        break;
                                    case PoseLandmark.LEFT_INDEX:
/* 1467 */                              iI0010I0i27 = lO0Iil10.I0010I0i(i10, parcel);
                                        break;
                                    case PoseLandmark.RIGHT_INDEX:
/* 1462 */                              fI00100l03 = lO0Iil10.I00100l0(i10, parcel);
                                        break;
                                    case PoseLandmark.LEFT_THUMB:
/* 1459 */                              iiooooli1 = (iiooOolI1) lO0Iil10.I0001Ioi1lo(parcel, i10, iiooOolI1.CREATOR);
                                        break;
                                    case PoseLandmark.RIGHT_THUMB:
/* 1446 */                              zI000lI5 = lO0Iil10.I000lI(i10, parcel);
                                        break;
                                    case PoseLandmark.LEFT_HIP:
/* 1443 */                              il1o1o0111oi = (il1o1o0111Oi) lO0Iil10.I0001Ioi1lo(parcel, i10, il1o1o0111Oi.CREATOR);
                                        break;
                                    default:
/* 1429 */                              lO0Iil10.I001IO000(i10, parcel);
                                        break;
                                }
/* 1432 */                      bundleI00000oIO2 = bundle;
                            }
/* 1579 */                  Bundle bundle2 = bundleI00000oIO2;
/* 1581 */                  lO0Iil10.I000l1(iI001i1O0Ol10, parcel);
/* 1586 */                  iiloi0IlI iiloi0ili = new iiloi0IlI();
/* 1593 */                  iiloi0ili.I00iOIl = lOI1lll1l10.I000o00OoI0I(arrayListI000iOII5);
/* 1595 */                  iiloi0ili.I00iiI = fI00100l0;
/* 1597 */                  iiloi0ili.I00iiO = iI0010I0i10;
/* 1599 */                  iiloi0ili.I00lli11 = fI00100l03;
/* 1605 */                  iiloi0ili.I00iio = lOI1lll1l10.I000o00OoI0I(arrayListI000OOo1O);
/* 1607 */                  iiloi0ili.I00ilI0I1 = iI0010I0i22;
/* 1609 */                  iiloi0ili.I00ilO0 = iI0010I0i23;
/* 1613 */                  if (iBinderI00100o1O0lo == null) {
/* 1615 */                      ii1o1ioiil0i = null;
                            } else {
/* 1619 */                      IInterface iInterfaceQueryLocalInterface = iBinderI00100o1O0lo.queryLocalInterface("com.google.android.apps.aicore.aidl.ILLMStreamingCallback");
/* 1632 */                      ii1o1ioiil0i = iInterfaceQueryLocalInterface instanceof ii1loioI ? (ii1loioI) iInterfaceQueryLocalInterface : new ii1O1Ioiil0i(iBinderI00100o1O0lo, "com.google.android.apps.aicore.aidl.ILLMStreamingCallback", 12);
                            }
/* 1635 */                  iiloi0ili.I00io1l = ii1o1ioiil0i;
/* 1637 */                  iiloi0ili.I00ioIO = zI000lI4;
/* 1639 */                  iiloi0ili.I00l0I0l0lO1 = iI0010I0i24;
/* 1641 */                  if (iBinderI00100o1O0lo2 == null) {
/* 1643 */                      ii0ilo1o1i = null;
                            } else {
/* 1647 */                      IInterface iInterfaceQueryLocalInterface2 = iBinderI00100o1O0lo2.queryLocalInterface("com.google.android.apps.aicore.aidl.IImageEmbeddingCallback");
/* 1661 */                      ii0ilo1o1i = iInterfaceQueryLocalInterface2 instanceof ii0ilo1o1I ? (ii0ilo1o1I) iInterfaceQueryLocalInterface2 : new ii0ilo1o1I(iBinderI00100o1O0lo2, "com.google.android.apps.aicore.aidl.IImageEmbeddingCallback", 12);
                            }
/* 1664 */                  iiloi0ili.I00ol1 = ii0ilo1o1i;
/* 1666 */                  iiloi0ili.I00l0OO0IO = iI0010I0i25;
/* 1668 */                  iiloi0ili.I00li1OI = iI0010I0i26;
/* 1670 */                  iiloi0ili.I00lll10 = strI000II16;
/* 1674 */                  iiloi0ili.I00o0iI0io1 = bundle2;
/* 1678 */                  iiloi0ili.I00o0l1o1o0 = iI0010I0i29;
/* 1680 */                  if (il0llooooio == null) {
/* 1682 */                      il0llooooio = il0llOOOOIO.I00iiI;
                            }
/* 1686 */                  iiloi0ili.I00o101lO = il0llooooio;
/* 1690 */                  iiloi0ili.I00oI0i = iI0010I0i28;
/* 1694 */                  iiloi0ili.I00oII = iiliii1;
/* 1698 */                  iiloi0ili.I00ll1 = iI0010I0i27;
/* 1702 */                  iiloi0ili.I00oIiI10 = iiooooli1;
/* 1706 */                  iiloi0ili.I00oO101o = zI000lI5;
/* 1710 */                  iiloi0ili.I00oOio10iI1 = il1o1o0111oi;
/* 1712 */                  VarHandle.storeStoreFence();
/* 1715 */                  return iiloi0ili;
                        case 10:
/* 1283 */                  int iI001i1O0Ol11 = lO0Iil10.I001i1O0Ol(parcel);
/* 1287 */                  iiOi1illIO1o iioi1illio1o = null;
/* 1288 */                  iio1oo0Ioo iio1oo0ioo = null;
/* 1289 */                  ArrayList arrayListI000iOII6 = null;
/* 1294 */                  while (parcel.dataPosition() < iI001i1O0Ol11) {
/* 1296 */                      int i11 = parcel.readInt();
/* 1300 */                      char c8 = (char) i11;
/* 1301 */                      if (c8 == 1) {
/* 1340 */                          arrayListI000iOII2 = lO0Iil10.I000iOII(parcel, i11, iilOIlOio.CREATOR);
                                } else if (c8 == 2) {
/* 1335 */                          iioi1illio1o = (iiOi1illIO1o) lO0Iil10.I0001Ioi1lo(parcel, i11, iiOi1illIO1o.CREATOR);
                                } else if (c8 == 3) {
/* 1326 */                          iio1oo0ioo = (iio1oo0Ioo) lO0Iil10.I0001Ioi1lo(parcel, i11, iio1oo0Ioo.CREATOR);
                                } else if (c8 != 4) {
/* 1309 */                          lO0Iil10.I001IO000(i11, parcel);
                                } else {
/* 1315 */                          arrayListI000iOII6 = lO0Iil10.I000iOII(parcel, i11, iilOIlOio.CREATOR);
                                }
                            }
/* 1345 */                  lO0Iil10.I000l1(iI001i1O0Ol11, parcel);
/* 1350 */                  iio11liiI1I iio11liii1i = new iio11liiI1I();
/* 1357 */                  iio11liii1i.I00iOIl = lOI1lll1l10.I000o00OoI0I(arrayListI000iOII2);
/* 1359 */                  iio11liii1i.I00iiI = iioi1illio1o;
/* 1361 */                  iio11liii1i.I00iiO = iio1oo0ioo;
/* 1372 */                  iio11liii1i.I00iio = arrayListI000iOII6 == null ? lOl10OOloi.I00ilI0I1 : lOI1lll1l10.I000o00OoI0I(arrayListI000iOII6);
/* 1374 */                  VarHandle.storeStoreFence();
/* 1377 */                  return iio11liii1i;
                        case 11:
/* 1243 */                  int iI001i1O0Ol12 = lO0Iil10.I001i1O0Ol(parcel);
/* 1251 */                  while (parcel.dataPosition() < iI001i1O0Ol12) {
/* 1253 */                      int i12 = parcel.readInt();
/* 1258 */                      if (((char) i12) != 1) {
/* 1260 */                          lO0Iil10.I001IO000(i12, parcel);
                                } else {
/* 1264 */                          strI000II6 = lO0Iil10.I000II(i12, parcel);
                                }
                            }
/* 1269 */                  lO0Iil10.I000l1(iI001i1O0Ol12, parcel);
/* 1274 */                  iio1oo0Ioo iio1oo0ioo2 = new iio1oo0Ioo();
/* 1277 */                  iio1oo0ioo2.I00iOIl = strI000II6;
/* 1279 */                  VarHandle.storeStoreFence();
/* 1282 */                  return iio1oo0ioo2;
                        case 12:
/* 1163 */                  int iI001i1O0Ol13 = lO0Iil10.I001i1O0Ol(parcel);
/* 1167 */                  float fI00100l04 = 0.0f;
/* 1168 */                  float fI00100l05 = 0.0f;
/* 1169 */                  int iI0010I0i30 = 0;
/* 1170 */                  int iI0010I0i31 = 0;
/* 1175 */                  while (parcel.dataPosition() < iI001i1O0Ol13) {
/* 1177 */                      int i13 = parcel.readInt();
                                switch ((char) i13) {
                                    case 1:
/* 1214 */                              iI0010I0i9 = lO0Iil10.I0010I0i(i13, parcel);
                                        break;
                                    case 2:
/* 1209 */                              iI0010I0i30 = lO0Iil10.I0010I0i(i13, parcel);
                                        break;
                                    case 3:
/* 1204 */                              iI0010I0i31 = lO0Iil10.I0010I0i(i13, parcel);
                                        break;
                                    case 4:
/* 1199 */                              fI00100l0 = lO0Iil10.I00100l0(i13, parcel);
                                        break;
                                    case 5:
/* 1194 */                              fI00100l04 = lO0Iil10.I00100l0(i13, parcel);
                                        break;
                                    case 6:
/* 1189 */                              fI00100l05 = lO0Iil10.I00100l0(i13, parcel);
                                        break;
                                    default:
/* 1185 */                              lO0Iil10.I001IO000(i13, parcel);
                                        break;
                                }
                            }
/* 1219 */                  lO0Iil10.I000l1(iI001i1O0Ol13, parcel);
/* 1224 */                  iioOoiIo1 iioooiio1 = new iioOoiIo1();
/* 1227 */                  iioooiio1.I00iOIl = iI0010I0i9;
/* 1229 */                  iioooiio1.I00iiI = iI0010I0i30;
/* 1231 */                  iioooiio1.I00iiO = iI0010I0i31;
/* 1233 */                  iioooiio1.I00iio = fI00100l0;
/* 1235 */                  iioooiio1.I00ilI0I1 = fI00100l04;
/* 1237 */                  iioooiio1.I00ilO0 = fI00100l05;
/* 1239 */                  VarHandle.storeStoreFence();
/* 1242 */                  return iioooiio1;
                        case 13:
/* 963 */                   int iI001i1O0Ol14 = lO0Iil10.I001i1O0Ol(parcel);
/* 967 */                   int iI0010I0i32 = 0;
/* 968 */                   String strI000II17 = null;
/* 969 */                   String strI000II18 = null;
/* 970 */                   Boolean boolValueOf = null;
/* 971 */                   ArrayList arrayListI000OOo1O2 = null;
/* 973 */                   iiooOolI1 iiooooli12 = null;
/* 975 */                   Long lI00111O = null;
/* 977 */                   Long lI00111O2 = null;
/* 979 */                   ArrayList arrayListI000OOo1O3 = null;
/* 981 */                   Long lI00111O3 = null;
/* 983 */                   Long lI00111O4 = null;
/* 985 */                   Double dI000oI1ioi = null;
/* 987 */                   Double dI000oI1ioi2 = null;
/* 989 */                   Long lI00111O5 = null;
/* 991 */                   Long lI00111O6 = null;
/* 993 */                   String strI000II19 = null;
/* 995 */                   ArrayList arrayListI000iOII7 = null;
/* 997 */                   ArrayList arrayListI000OOo1O4 = null;
/* 999 */                   String strI000II20 = null;
/* 1001 */                  Bundle bundleI00000oIO3 = null;
/* 1007 */                  while (parcel.dataPosition() < iI001i1O0Ol14) {
/* 1009 */                      int i14 = parcel.readInt();
                                switch ((char) i14) {
                                    case 1:
/* 1148 */                              iI0010I0i32 = lO0Iil10.I0010I0i(i14, parcel);
                                        break;
                                    case 2:
/* 1142 */                              strI000II17 = lO0Iil10.I000II(i14, parcel);
                                        break;
                                    case 3:
/* 1136 */                              strI000II18 = lO0Iil10.I000II(i14, parcel);
                                        break;
                                    case 4:
/* 1109 */                              int iI001IIilI0O = lO0Iil10.I001IIilI0O(i14, parcel);
/* 1113 */                              if (iI001IIilI0O != 0) {
/* 1117 */                                  lO0Iil10.I001iOo1i0O(parcel, iI001IIilI0O, 4);
/* 1129 */                                  boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                                            break;
                                        } else {
/* 1115 */                                  boolValueOf = null;
                                            break;
                                        }
                                    case 5:
/* 1104 */                              arrayListI000OOo1O2 = lO0Iil10.I000OOo1O(i14, parcel);
                                        break;
                                    case 6:
/* 1101 */                              iiooooli12 = (iiooOolI1) lO0Iil10.I0001Ioi1lo(parcel, i14, iiooOolI1.CREATOR);
                                        break;
                                    case 7:
/* 1088 */                              lI00111O = lO0Iil10.I00111O(i14, parcel);
                                        break;
                                    case '\b':
/* 1083 */                              lI00111O2 = lO0Iil10.I00111O(i14, parcel);
                                        break;
                                    case '\t':
/* 1078 */                              arrayListI000OOo1O3 = lO0Iil10.I000OOo1O(i14, parcel);
                                        break;
                                    case '\n':
/* 1073 */                              lI00111O3 = lO0Iil10.I00111O(i14, parcel);
                                        break;
                                    case 11:
/* 1068 */                              lI00111O4 = lO0Iil10.I00111O(i14, parcel);
                                        break;
                                    case '\f':
/* 1063 */                              dI000oI1ioi = lO0Iil10.I000oI1ioi(i14, parcel);
                                        break;
                                    case '\r':
/* 1058 */                              dI000oI1ioi2 = lO0Iil10.I000oI1ioi(i14, parcel);
                                        break;
                                    case 14:
/* 1053 */                              lI00111O5 = lO0Iil10.I00111O(i14, parcel);
                                        break;
                                    case 15:
/* 1048 */                              lI00111O6 = lO0Iil10.I00111O(i14, parcel);
                                        break;
                                    case 16:
/* 1043 */                              strI000II19 = lO0Iil10.I000II(i14, parcel);
                                        break;
                                    case 17:
/* 1038 */                              arrayListI000iOII7 = lO0Iil10.I000iOII(parcel, i14, iiooOolI1.CREATOR);
                                        break;
                                    case PoseLandmark.RIGHT_PINKY:
/* 1031 */                              arrayListI000OOo1O4 = lO0Iil10.I000OOo1O(i14, parcel);
                                        break;
                                    case PoseLandmark.LEFT_INDEX:
/* 1026 */                              strI000II20 = lO0Iil10.I000II(i14, parcel);
                                        break;
                                    case PoseLandmark.RIGHT_INDEX:
/* 1021 */                              bundleI00000oIO3 = lO0Iil10.I00000oIO(i14, parcel);
                                        break;
                                    default:
/* 1017 */                              lO0Iil10.I001IO000(i14, parcel);
                                        break;
                                }
                            }
/* 1154 */                  lO0Iil10.I000l1(iI001i1O0Ol14, parcel);
/* 1159 */                  return new iiooOolI1(iI0010I0i32, strI000II17, strI000II18, boolValueOf, arrayListI000OOo1O2, iiooooli12, lI00111O, lI00111O2, arrayListI000OOo1O3, lI00111O3, lI00111O4, dI000oI1ioi, dI000oI1ioi2, lI00111O5, lI00111O6, strI000II19, arrayListI000iOII7, arrayListI000OOo1O4, strI000II20, bundleI00000oIO3);
                        case 14:
/* 923 */                   int iI001i1O0Ol15 = lO0Iil10.I001i1O0Ol(parcel);
/* 931 */                   while (parcel.dataPosition() < iI001i1O0Ol15) {
/* 933 */                       int i15 = parcel.readInt();
/* 938 */                       if (((char) i15) != 1) {
/* 940 */                           lO0Iil10.I001IO000(i15, parcel);
                                } else {
/* 944 */                           iI0010I0i8 = lO0Iil10.I0010I0i(i15, parcel);
                                }
                            }
/* 949 */                   lO0Iil10.I000l1(iI001i1O0Ol15, parcel);
/* 954 */                   il0111IIOlo il0111iiolo = new il0111IIOlo();
/* 957 */                   il0111iiolo.I00iOIl = iI0010I0i8;
/* 959 */                   VarHandle.storeStoreFence();
/* 962 */                   return il0111iiolo;
                        case 15:
/* 883 */                   int iI001i1O0Ol16 = lO0Iil10.I001i1O0Ol(parcel);
/* 891 */                   while (parcel.dataPosition() < iI001i1O0Ol16) {
/* 893 */                       int i16 = parcel.readInt();
/* 898 */                       if (((char) i16) != 1) {
/* 900 */                           lO0Iil10.I001IO000(i16, parcel);
                                } else {
/* 904 */                           iI0010I0i7 = lO0Iil10.I0010I0i(i16, parcel);
                                }
                            }
/* 909 */                   lO0Iil10.I000l1(iI001i1O0Ol16, parcel);
/* 914 */                   il0OIOlll il0oiolll = new il0OIOlll();
/* 917 */                   il0oiolll.I00iOIl = iI0010I0i7;
/* 919 */                   VarHandle.storeStoreFence();
/* 922 */                   return il0oiolll;
                        case 16:
/* 848 */                   int iI001i1O0Ol17 = lO0Iil10.I001i1O0Ol(parcel);
/* 856 */                   while (parcel.dataPosition() < iI001i1O0Ol17) {
/* 858 */                       int i17 = parcel.readInt();
/* 863 */                       if (((char) i17) != 1) {
/* 865 */                           lO0Iil10.I001IO000(i17, parcel);
                                } else {
/* 869 */                           zI000lI = lO0Iil10.I000lI(i17, parcel);
                                }
                            }
/* 874 */                   lO0Iil10.I000l1(iI001i1O0Ol17, parcel);
/* 879 */                   return new il0llOOOOIO(zI000lI);
                        case 17:
/* 754 */                   int iI001i1O0Ol18 = lO0Iil10.I001i1O0Ol(parcel);
/* 758 */                   double dI000o00OoI0I = 0.0d;
/* 760 */                   boolean zI000lI6 = false;
/* 761 */                   int iI0010I0i33 = 0;
/* 762 */                   ArrayList arrayListI000iOII8 = null;
/* 767 */                   while (parcel.dataPosition() < iI001i1O0Ol18) {
/* 769 */                       int i18 = parcel.readInt();
                                switch ((char) i18) {
                                    case 1:
/* 813 */                               iI0010I0i6 = lO0Iil10.I0010I0i(i18, parcel);
                                        break;
                                    case 2:
/* 808 */                               strI000II5 = lO0Iil10.I000II(i18, parcel);
                                        break;
                                    case 3:
/* 803 */                               zI000lI6 = lO0Iil10.I000lI(i18, parcel);
                                        break;
                                    case 4:
/* 798 */                               iI0010I0i33 = lO0Iil10.I0010I0i(i18, parcel);
                                        break;
                                    case 5:
/* 793 */                               dI000o00OoI0I = lO0Iil10.I000o00OoI0I(i18, parcel);
                                        break;
                                    case 6:
/* 788 */                               arrayListI000iOII8 = lO0Iil10.I000iOII(parcel, i18, il0olIi.CREATOR);
                                        break;
                                    case 7:
/* 781 */                               jI0010o = lO0Iil10.I0010o(i18, parcel);
                                        break;
                                    default:
/* 777 */                               lO0Iil10.I001IO000(i18, parcel);
                                        break;
                                }
                            }
/* 818 */                   lO0Iil10.I000l1(iI001i1O0Ol18, parcel);
/* 823 */                   il0olIi il0olii = new il0olIi();
/* 826 */                   il0olii.I00iOIl = iI0010I0i6;
/* 828 */                   il0olii.I00iiI = strI000II5;
/* 830 */                   il0olii.I00iiO = zI000lI6;
/* 832 */                   il0olii.I00iio = iI0010I0i33;
/* 834 */                   il0olii.I00ilI0I1 = dI000o00OoI0I;
/* 840 */                   il0olii.I00ilO0 = lOI1lll1l10.I000o00OoI0I(arrayListI000iOII8);
/* 842 */                   il0olii.I00io1l = jI0010o;
/* 844 */                   VarHandle.storeStoreFence();
/* 847 */                   return il0olii;
                        case PoseLandmark.RIGHT_PINKY:
/* 712 */                   int iI001i1O0Ol19 = lO0Iil10.I001i1O0Ol(parcel);
/* 720 */                   while (parcel.dataPosition() < iI001i1O0Ol19) {
/* 722 */                       int i19 = parcel.readInt();
/* 726 */                       char c9 = (char) i19;
/* 727 */                       if (c9 == 1) {
/* 740 */                           iI0010I0i5 = lO0Iil10.I0010I0i(i19, parcel);
                                } else if (c9 != 2) {
/* 731 */                           lO0Iil10.I001IO000(i19, parcel);
                                } else {
/* 735 */                           strI000II4 = lO0Iil10.I000II(i19, parcel);
                                }
                            }
/* 745 */                   lO0Iil10.I000l1(iI001i1O0Ol19, parcel);
/* 750 */                   return new Scope(iI0010I0i5, strI000II4);
                        case PoseLandmark.LEFT_INDEX:
/* 659 */                   int iI001i1O0Ol20 = lO0Iil10.I001i1O0Ol(parcel);
/* 663 */                   String strI000II21 = null;
/* 664 */                   Bundle bundleI00000oIO4 = null;
/* 669 */                   while (parcel.dataPosition() < iI001i1O0Ol20) {
/* 671 */                       int i20 = parcel.readInt();
/* 675 */                       char c10 = (char) i20;
/* 676 */                       if (c10 == 1) {
/* 689 */                           strI000II21 = lO0Iil10.I000II(i20, parcel);
                                } else if (c10 != 2) {
/* 680 */                           lO0Iil10.I001IO000(i20, parcel);
                                } else {
/* 684 */                           bundleI00000oIO4 = lO0Iil10.I00000oIO(i20, parcel);
                                }
                            }
/* 694 */                   lO0Iil10.I000l1(iI001i1O0Ol20, parcel);
/* 699 */                   il1O0O01 il1o0o01 = new il1O0O01();
/* 702 */                   il1o0o01.I00iiO = null;
/* 704 */                   il1o0o01.I00iOIl = strI000II21;
/* 706 */                   il1o0o01.I00iiI = bundleI00000oIO4;
/* 708 */                   VarHandle.storeStoreFence();
/* 711 */                   return il1o0o01;
                        case PoseLandmark.RIGHT_INDEX:
/* 577 */                   int iI001i1O0Ol21 = lO0Iil10.I001i1O0Ol(parcel);
/* 581 */                   long jI0010o2 = 0;
/* 582 */                   long jI0010o3 = 0;
/* 583 */                   boolean zI000lI7 = false;
/* 585 */                   Bundle bundleI00000oIO5 = null;
/* 587 */                   String strI000II22 = null;
/* 593 */                   while (parcel.dataPosition() < iI001i1O0Ol21) {
/* 595 */                       int i21 = parcel.readInt();
/* 599 */                       char c11 = (char) i21;
/* 600 */                       if (c11 == 1) {
/* 644 */                           jI0010o2 = lO0Iil10.I0010o(i21, parcel);
                                } else if (c11 == 2) {
/* 638 */                           jI0010o3 = lO0Iil10.I0010o(i21, parcel);
                                } else if (c11 == 3) {
/* 631 */                           zI000lI7 = lO0Iil10.I000lI(i21, parcel);
                                } else if (c11 == 7) {
/* 624 */                           bundleI00000oIO5 = lO0Iil10.I00000oIO(i21, parcel);
                                } else if (c11 != '\b') {
/* 613 */                           lO0Iil10.I001IO000(i21, parcel);
                                } else {
/* 617 */                           strI000II22 = lO0Iil10.I000II(i21, parcel);
                                }
                            }
/* 650 */                   lO0Iil10.I000l1(iI001i1O0Ol21, parcel);
/* 655 */                   return new il1i11oOloil(jI0010o2, jI0010o3, zI000lI7, bundleI00000oIO5, strI000II22);
                        case PoseLandmark.LEFT_THUMB:
/* 499 */                   int iI001i1O0Ol22 = lO0Iil10.I001i1O0Ol(parcel);
/* 503 */                   String strI000II23 = null;
/* 504 */                   iiooOolI1 iiooooli13 = null;
/* 505 */                   iiooOolI1 iiooooli14 = null;
/* 510 */                   while (parcel.dataPosition() < iI001i1O0Ol22) {
/* 512 */                       int i22 = parcel.readInt();
/* 516 */                       char c12 = (char) i22;
/* 517 */                       if (c12 == 1) {
/* 552 */                           strI000II3 = lO0Iil10.I000II(i22, parcel);
                                } else if (c12 == 2) {
/* 547 */                           strI000II23 = lO0Iil10.I000II(i22, parcel);
                                } else if (c12 == 3) {
/* 544 */                           iiooooli13 = (iiooOolI1) lO0Iil10.I0001Ioi1lo(parcel, i22, iiooOolI1.CREATOR);
                                } else if (c12 != 4) {
/* 525 */                           lO0Iil10.I001IO000(i22, parcel);
                                } else {
/* 535 */                           iiooooli14 = (iiooOolI1) lO0Iil10.I0001Ioi1lo(parcel, i22, iiooOolI1.CREATOR);
                                }
                            }
/* 557 */                   lO0Iil10.I000l1(iI001i1O0Ol22, parcel);
/* 562 */                   il1iolOIi1O1 il1ioloii1o1 = new il1iolOIi1O1();
/* 565 */                   il1ioloii1o1.I00iOIl = strI000II3;
/* 567 */                   il1ioloii1o1.I00iiI = strI000II23;
/* 569 */                   il1ioloii1o1.I00iiO = iiooooli13;
/* 571 */                   il1ioloii1o1.I00iio = iiooooli14;
/* 573 */                   VarHandle.storeStoreFence();
/* 576 */                   return il1ioloii1o1;
                        case PoseLandmark.RIGHT_THUMB:
/* 445 */                   int iI001i1O0Ol23 = lO0Iil10.I001i1O0Ol(parcel);
/* 449 */                   Intent intent = null;
/* 454 */                   while (parcel.dataPosition() < iI001i1O0Ol23) {
/* 456 */                       int i23 = parcel.readInt();
/* 460 */                       char c13 = (char) i23;
/* 461 */                       if (c13 == 1) {
/* 485 */                           iI0010I0i4 = lO0Iil10.I0010I0i(i23, parcel);
                                } else if (c13 == 2) {
/* 480 */                           strI000II2 = lO0Iil10.I000II(i23, parcel);
                                } else if (c13 != 3) {
/* 467 */                           lO0Iil10.I001IO000(i23, parcel);
                                } else {
/* 477 */                           intent = (Intent) lO0Iil10.I0001Ioi1lo(parcel, i23, Intent.CREATOR);
                                }
                            }
/* 490 */                   lO0Iil10.I000l1(iI001i1O0Ol23, parcel);
/* 495 */                   return new il1l0io1O(iI0010I0i4, strI000II2, intent);
                        case PoseLandmark.LEFT_HIP:
/* 408 */                   int iI001i1O0Ol24 = lO0Iil10.I001i1O0Ol(parcel);
/* 416 */                   while (parcel.dataPosition() < iI001i1O0Ol24) {
/* 418 */                       int i24 = parcel.readInt();
/* 423 */                       if (((char) i24) != 1) {
/* 425 */                           lO0Iil10.I001IO000(i24, parcel);
                                } else {
/* 431 */                           arrayListI000iOII = lO0Iil10.I000iOII(parcel, i24, il1iolOIi1O1.CREATOR);
                                }
                            }
/* 436 */                   lO0Iil10.I000l1(iI001i1O0Ol24, parcel);
/* 441 */                   return new il1o1o0111Oi(arrayListI000iOII);
                        case PoseLandmark.RIGHT_HIP:
/* 341 */                   int iI001i1O0Ol25 = lO0Iil10.I001i1O0Ol(parcel);
/* 345 */                   int iI0010I0i34 = 0;
/* 346 */                   int iI0010I0i35 = 0;
/* 347 */                   int iI0010I0i36 = 0;
/* 348 */                   int iI0010I0i37 = 0;
/* 349 */                   String strI000II24 = null;
/* 350 */                   String strI000II25 = null;
/* 355 */                   while (parcel.dataPosition() < iI001i1O0Ol25) {
/* 357 */                       int i25 = parcel.readInt();
                                switch ((char) i25) {
                                    case 1:
/* 394 */                               strI000II24 = lO0Iil10.I000II(i25, parcel);
                                        break;
                                    case 2:
/* 389 */                               strI000II25 = lO0Iil10.I000II(i25, parcel);
                                        break;
                                    case 3:
/* 384 */                               iI0010I0i34 = lO0Iil10.I0010I0i(i25, parcel);
                                        break;
                                    case 4:
/* 379 */                               iI0010I0i35 = lO0Iil10.I0010I0i(i25, parcel);
                                        break;
                                    case 5:
/* 374 */                               iI0010I0i36 = lO0Iil10.I0010I0i(i25, parcel);
                                        break;
                                    case 6:
/* 369 */                               iI0010I0i37 = lO0Iil10.I0010I0i(i25, parcel);
                                        break;
                                    default:
/* 365 */                               lO0Iil10.I001IO000(i25, parcel);
                                        break;
                                }
                            }
/* 399 */                   lO0Iil10.I000l1(iI001i1O0Ol25, parcel);
/* 404 */                   return new il11O1OlI(strI000II24, strI000II25, iI0010I0i34, iI0010I0i35, iI0010I0i36, iI0010I0i37);
                        case PoseLandmark.LEFT_KNEE:
/* 274 */                   int iI001i1O0Ol26 = lO0Iil10.I001i1O0Ol(parcel);
/* 278 */                   int iI0010I0i38 = 0;
/* 279 */                   int iI0010I0i39 = 0;
/* 280 */                   int iI0010I0i40 = 0;
/* 281 */                   int iI0010I0i41 = 0;
/* 282 */                   String strI000II26 = null;
/* 283 */                   String strI000II27 = null;
/* 288 */                   while (parcel.dataPosition() < iI001i1O0Ol26) {
/* 290 */                       int i26 = parcel.readInt();
                                switch ((char) i26) {
                                    case 1:
/* 327 */                               strI000II26 = lO0Iil10.I000II(i26, parcel);
                                        break;
                                    case 2:
/* 322 */                               strI000II27 = lO0Iil10.I000II(i26, parcel);
                                        break;
                                    case 3:
/* 317 */                               iI0010I0i38 = lO0Iil10.I0010I0i(i26, parcel);
                                        break;
                                    case 4:
/* 312 */                               iI0010I0i39 = lO0Iil10.I0010I0i(i26, parcel);
                                        break;
                                    case 5:
/* 307 */                               iI0010I0i40 = lO0Iil10.I0010I0i(i26, parcel);
                                        break;
                                    case 6:
/* 302 */                               iI0010I0i41 = lO0Iil10.I0010I0i(i26, parcel);
                                        break;
                                    default:
/* 298 */                               lO0Iil10.I001IO000(i26, parcel);
                                        break;
                                }
                            }
/* 332 */                   lO0Iil10.I000l1(iI001i1O0Ol26, parcel);
/* 337 */                   return new il11i0(strI000II26, strI000II27, iI0010I0i38, iI0010I0i39, iI0010I0i40, iI0010I0i41);
                        case PoseLandmark.RIGHT_KNEE:
/* 207 */                   int iI001i1O0Ol27 = lO0Iil10.I001i1O0Ol(parcel);
/* 211 */                   int iI0010I0i42 = 0;
/* 212 */                   int iI0010I0i43 = 0;
/* 213 */                   int iI0010I0i44 = 0;
/* 214 */                   int iI0010I0i45 = 0;
/* 215 */                   String strI000II28 = null;
/* 216 */                   String strI000II29 = null;
/* 221 */                   while (parcel.dataPosition() < iI001i1O0Ol27) {
/* 223 */                       int i27 = parcel.readInt();
                                switch ((char) i27) {
                                    case 1:
/* 260 */                               strI000II28 = lO0Iil10.I000II(i27, parcel);
                                        break;
                                    case 2:
/* 255 */                               strI000II29 = lO0Iil10.I000II(i27, parcel);
                                        break;
                                    case 3:
/* 250 */                               iI0010I0i42 = lO0Iil10.I0010I0i(i27, parcel);
                                        break;
                                    case 4:
/* 245 */                               iI0010I0i43 = lO0Iil10.I0010I0i(i27, parcel);
                                        break;
                                    case 5:
/* 240 */                               iI0010I0i44 = lO0Iil10.I0010I0i(i27, parcel);
                                        break;
                                    case 6:
/* 235 */                               iI0010I0i45 = lO0Iil10.I0010I0i(i27, parcel);
                                        break;
                                    default:
/* 231 */                               lO0Iil10.I001IO000(i27, parcel);
                                        break;
                                }
                            }
/* 265 */                   lO0Iil10.I000l1(iI001i1O0Ol27, parcel);
/* 270 */                   return new il11il01o(strI000II28, strI000II29, iI0010I0i42, iI0010I0i43, iI0010I0i44, iI0010I0i45);
                        case 27:
/* 152 */                   int iI001i1O0Ol28 = lO0Iil10.I001i1O0Ol(parcel);
/* 160 */                   while (parcel.dataPosition() < iI001i1O0Ol28) {
/* 162 */                       int i28 = parcel.readInt();
/* 166 */                       char c14 = (char) i28;
/* 167 */                       if (c14 == 2) {
/* 187 */                           pointFArr = (PointF[]) lO0Iil10.I000OiO(parcel, i28, PointF.CREATOR);
                                } else if (c14 != 3) {
/* 171 */                           lO0Iil10.I001IO000(i28, parcel);
                                } else {
/* 175 */                           iI0010I0i3 = lO0Iil10.I0010I0i(i28, parcel);
                                }
                            }
/* 191 */                   lO0Iil10.I000l1(iI001i1O0Ol28, parcel);
/* 196 */                   il11l0O1 il11l0o1 = new il11l0O1();
/* 199 */                   il11l0o1.I00iOIl = pointFArr;
/* 201 */                   il11l0o1.I00iiI = iI0010I0i3;
/* 203 */                   VarHandle.storeStoreFence();
/* 206 */                   return il11l0o1;
                        case PoseLandmark.RIGHT_ANKLE:
/* 86 */                    int iI001i1O0Ol29 = lO0Iil10.I001i1O0Ol(parcel);
/* 90 */                    PendingIntent pendingIntent = null;
/* 91 */                    IOlo10lO1iOl iOlo10lO1iOl = null;
/* 96 */                    while (parcel.dataPosition() < iI001i1O0Ol29) {
/* 98 */                        int i29 = parcel.readInt();
/* 102 */                       char c15 = (char) i29;
/* 103 */                       if (c15 == 1) {
/* 138 */                           iI0010I0i2 = lO0Iil10.I0010I0i(i29, parcel);
                                } else if (c15 == 2) {
/* 133 */                           strI000II = lO0Iil10.I000II(i29, parcel);
                                } else if (c15 == 3) {
/* 130 */                           pendingIntent = (PendingIntent) lO0Iil10.I0001Ioi1lo(parcel, i29, PendingIntent.CREATOR);
                                } else if (c15 != 4) {
/* 111 */                           lO0Iil10.I001IO000(i29, parcel);
                                } else {
/* 121 */                           iOlo10lO1iOl = (IOlo10lO1iOl) lO0Iil10.I0001Ioi1lo(parcel, i29, IOlo10lO1iOl.CREATOR);
                                }
                            }
/* 143 */                   lO0Iil10.I000l1(iI001i1O0Ol29, parcel);
/* 148 */                   return new Status(iI0010I0i2, strI000II, pendingIntent, iOlo10lO1iOl);
                        default:
/* 19 */                    int iI001i1O0Ol30 = lO0Iil10.I001i1O0Ol(parcel);
/* 23 */                    int iI0010I0i46 = 0;
/* 24 */                    int iI0010I0i47 = 0;
/* 25 */                    int iI0010I0i48 = 0;
/* 26 */                    int iI0010I0i49 = 0;
/* 27 */                    String strI000II30 = null;
/* 28 */                    String strI000II31 = null;
/* 33 */                    while (parcel.dataPosition() < iI001i1O0Ol30) {
/* 35 */                        int i30 = parcel.readInt();
                                switch ((char) i30) {
                                    case 1:
/* 72 */                                strI000II30 = lO0Iil10.I000II(i30, parcel);
                                        break;
                                    case 2:
/* 67 */                                strI000II31 = lO0Iil10.I000II(i30, parcel);
                                        break;
                                    case 3:
/* 62 */                                iI0010I0i46 = lO0Iil10.I0010I0i(i30, parcel);
                                        break;
                                    case 4:
/* 57 */                                iI0010I0i47 = lO0Iil10.I0010I0i(i30, parcel);
                                        break;
                                    case 5:
/* 52 */                                iI0010I0i48 = lO0Iil10.I0010I0i(i30, parcel);
                                        break;
                                    case 6:
/* 47 */                                iI0010I0i49 = lO0Iil10.I0010I0i(i30, parcel);
                                        break;
                                    default:
/* 43 */                                lO0Iil10.I001IO000(i30, parcel);
                                        break;
                                }
                            }
/* 77 */                    lO0Iil10.I000l1(iI001i1O0Ol30, parcel);
/* 82 */                    return new il1I1O(strI000II30, strI000II31, iI0010I0i46, iI0010I0i47, iI0010I0i48, iI0010I0i49);
                    }
                }

                @Override
                public final Object[] newArray(int i) {
                    switch (this.I00000oIO) {
                        case 0:
/* 93 */                    return new iOiIOl1lOlI[i];
                        case 1:
/* 90 */                    return new iOioOI0o00[i];
                        case 2:
/* 87 */                    return new IOiIOIII0io[i];
                        case 3:
/* 84 */                    return new iiio1OOIi[i];
                        case 4:
/* 81 */                    return new iOlI0l0l1oi0[i];
                        case 5:
/* 78 */                    return new iOli1io[i];
                        case 6:
/* 75 */                    return new iilIIi1[i];
                        case 7:
/* 72 */                    return new iilO0il1i[i];
                        case 8:
/* 69 */                    return new iilOIlOio[i];
                        case 9:
/* 66 */                    return new iiloi0IlI[i];
                        case 10:
/* 63 */                    return new iio11liiI1I[i];
                        case 11:
/* 60 */                    return new iio1oo0Ioo[i];
                        case 12:
/* 57 */                    return new iioOoiIo1[i];
                        case 13:
/* 54 */                    return new iiooOolI1[i];
                        case 14:
/* 51 */                    return new il0111IIOlo[i];
                        case 15:
/* 48 */                    return new il0OIOlll[i];
                        case 16:
/* 45 */                    return new il0llOOOOIO[i];
                        case 17:
/* 42 */                    return new il0olIi[i];
                        case PoseLandmark.RIGHT_PINKY:
/* 39 */                    return new Scope[i];
                        case PoseLandmark.LEFT_INDEX:
/* 36 */                    return new il1O0O01[i];
                        case PoseLandmark.RIGHT_INDEX:
/* 33 */                    return new il1i11oOloil[i];
                        case PoseLandmark.LEFT_THUMB:
/* 30 */                    return new il1iolOIi1O1[i];
                        case PoseLandmark.RIGHT_THUMB:
/* 27 */                    return new il1l0io1O[i];
                        case PoseLandmark.LEFT_HIP:
/* 24 */                    return new il1o1o0111Oi[i];
                        case PoseLandmark.RIGHT_HIP:
/* 21 */                    return new il11O1OlI[i];
                        case PoseLandmark.LEFT_KNEE:
/* 18 */                    return new il11i0[i];
                        case PoseLandmark.RIGHT_KNEE:
/* 15 */                    return new il11il01o[i];
                        case 27:
/* 12 */                    return new il11l0O1[i];
                        case PoseLandmark.RIGHT_ANKLE:
/* 9 */                     return new Status[i];
                        default:
/* 6 */                     return new il1I1O[i];
                    }
                }
            }

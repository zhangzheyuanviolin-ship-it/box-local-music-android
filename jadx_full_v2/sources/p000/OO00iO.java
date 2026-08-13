            package p000;

            import android.accounts.Account;
            import android.app.PendingIntent;
            import android.content.Intent;
            import android.graphics.Point;
            import android.graphics.Rect;
            import android.net.Uri;
            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.Parcel;
            import android.os.Parcelable;
            import androidx.work.impl.model.WorkSpec;
            import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
            import com.google.android.gms.common.api.Scope;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashSet;
            import java.util.UUID;
            
            public final class OO00iO implements Parcelable.Creator {
                public final int I00000oIO;

                public OO00iO(int i) {
/* 1 */             this.I00000oIO = i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:379:0x07ab  */
                /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r2v2 */
                /* JADX WARN: Type inference failed for: r2v9, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r5v2 */
                /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object createFromParcel(Parcel parcel) {
                    Ii11I1OOII1 ii11I1OOII1I00000oIO;
                    Ii11I1OOII1 ii11I1OOII1I00000oIO2;
/* 7 */             long jI0010o = 0;
/* 10 */            float fI00100l0 = 0.0f;
/* 14 */            boolean zI000lI = false;
/* 14 */            int iI0010I0i = 0;
/* 14 */            boolean zI000lI2 = false;
/* 14 */            int iI0010I0i2 = 0;
/* 14 */            int iI0010I0i3 = 0;
/* 14 */            int iI0010I0i4 = 0;
/* 14 */            int iI0010I0i5 = 0;
/* 14 */            int iI0010I0i6 = 0;
/* 14 */            int iI0010I0i7 = 0;
/* 14 */            boolean zI000lI3 = false;
/* 14 */            int iI0010I0i8 = 0;
/* 14 */            int iI0010I0i9 = 0;
/* 14 */            int iI0010I0i10 = 0;
/* 14 */            boolean zI000lI4 = false;
/* 16 */            Bundle bundleI00000oIO = null;
/* 16 */            String strI000II = null;
/* 16 */            String strI000II2 = null;
/* 16 */            i0ooi0O0i0[] i0ooi0o0i0Arr = null;
/* 16 */            i1011IOI[] i1011ioiArr = null;
/* 16 */            IBinder iBinderI00100o1O0lo = null;
/* 16 */            Account account = null;
/* 16 */            IOlo10lO1iOl iOlo10lO1iOl = null;
/* 16 */            i0i0iI0O00 i0i0ii0o00 = null;
/* 16 */            ArrayList arrayListI000OOo1O = null;
/* 16 */            ArrayList arrayListI000iOII = null;
/* 16 */            Intent intent = null;
/* 16 */            PendingIntent pendingIntent = null;
/* 16 */            ArrayList arrayListI000iOII2 = null;
                    switch (this.I00000oIO) {
                        case 0:
/* 2095 */                  OO00ilI oO00ilI = new OO00ilI();
/* 2098 */                  ?? arrayList = Collections.EMPTY_LIST;
/* 2100 */                  int i = parcel.readInt();
/* 2104 */                  if (i > 0) {
/* 2108 */                      arrayList = new ArrayList(i);
/* 2112 */                      for (int i2 = 0; i2 < i; i2++) {
/* 2122 */                          arrayList.add(UUID.fromString(parcel.readString()));
                                }
                            }
/* 2128 */                  ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
/* 2132 */                  ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
/* 2136 */                  ?? arrayList2 = Collections.EMPTY_LIST;
/* 2138 */                  int i3 = parcel.readInt();
/* 2142 */                  if (i3 > 0) {
/* 2146 */                      arrayList2 = new ArrayList(i3);
/* 2149 */                      for (int i4 = 0; i4 < i3; i4++) {
/* 2159 */                          arrayList2.add(liIOOIo0.I000II(parcel.readInt()));
                                }
                            }
/* 2167 */                  ArrayList arrayList3 = new ArrayList();
/* 2172 */                  ArrayList arrayList4 = new ArrayList();
/* 2177 */                  ArrayList arrayList5 = new ArrayList();
/* 2182 */                  ArrayList arrayList6 = new ArrayList();
/* 2187 */                  IOOii0O10Io0.I00100l0(arrayList3, (Iterable) arrayList);
/* 2190 */                  IOOii0O10Io0.I00100l0(arrayList4, arrayListCreateStringArrayList);
/* 2193 */                  IOOii0O10Io0.I00100l0(arrayList5, arrayListCreateStringArrayList2);
/* 2198 */                  IOOii0O10Io0.I00100l0(arrayList6, (Iterable) arrayList2);
/* 2205 */                  if (arrayList3.isEmpty() && arrayList4.isEmpty() && arrayList5.isEmpty() && arrayList6.isEmpty()) {
/* 2228 */                      I000II.I000iOII("Must specify ids, uniqueNames, tags or states when building a WorkQuery");
/* 16 */                        return null;
                            }
/* 2234 */                  O0i0I0 o0i0I0 = new O0i0I0();
/* 2237 */                  o0i0I0.I00000oIO = arrayList3;
/* 2239 */                  o0i0I0.I00000oOI = arrayList4;
/* 2241 */                  o0i0I0.I0000Il00O = arrayList5;
/* 2243 */                  o0i0I0.I0000O = arrayList6;
/* 2245 */                  VarHandle.storeStoreFence();
/* 2248 */                  oO00ilI.I00iOIl = o0i0I0;
/* 2250 */                  VarHandle.storeStoreFence();
/* 2253 */                  return oO00ilI;
                        case 1:
/* 1909 */                  OO00l1Il oO00l1Il = new OO00l1Il();
/* 1912 */                  String string = parcel.readString();
/* 1922 */                  HashSet hashSet = new HashSet(parcel.createStringArrayList());
/* 1931 */                  WorkSpec workSpec = new WorkSpec(string, parcel.readString());
/* 1938 */                  workSpec.inputMergerClassName = parcel.readString();
/* 1948 */                  workSpec.state = liIOOIo0.I000II(parcel.readInt());
/* 1950 */                  byte[] bArrCreateByteArray = parcel.createByteArray();
/* 1954 */                  if (bArrCreateByteArray != null) {
/* 1956 */                      Ii11I1OOII1 ii11I1OOII1 = Ii11I1OOII1.I00000oOI;
/* 1958 */                      ii11I1OOII1I00000oIO = il01ool0o.I00000oIO(bArrCreateByteArray);
/* 1962 */                      if (ii11I1OOII1I00000oIO == null) {
/* 1964 */                          ii11I1OOII1I00000oIO = Ii11I1OOII1.I00000oOI;
                                }
                            }
/* 1966 */                  workSpec.input = ii11I1OOII1I00000oIO;
/* 1968 */                  byte[] bArrCreateByteArray2 = parcel.createByteArray();
/* 1972 */                  if (bArrCreateByteArray2 == null || (ii11I1OOII1I00000oIO2 = il01ool0o.I00000oIO(bArrCreateByteArray2)) == null) {
/* 1980 */                      ii11I1OOII1I00000oIO2 = Ii11I1OOII1.I00000oOI;
                            }
/* 1982 */                  workSpec.output = ii11I1OOII1I00000oIO2;
/* 1988 */                  workSpec.initialDelay = parcel.readLong();
/* 1994 */                  workSpec.intervalDuration = parcel.readLong();
/* 2000 */                  workSpec.flexDuration = parcel.readLong();
/* 2006 */                  workSpec.runAttemptCount = parcel.readInt();
/* 2022 */                  workSpec.constraints = ((OIolIIO) parcel.readParcelable(OO00l1Il.class.getClassLoader())).I00iOIl;
/* 2032 */                  workSpec.backoffPolicy = liIOOIo0.I0000O(parcel.readInt());
/* 2038 */                  workSpec.backoffDelayDuration = parcel.readLong();
/* 2044 */                  workSpec.minimumRetentionDuration = parcel.readLong();
/* 2050 */                  workSpec.scheduleRequestedAt = parcel.readLong();
/* 2059 */                  workSpec.expedited = parcel.readInt() == 1;
/* 2069 */                  workSpec.outOfQuotaPolicy = liIOOIo0.I0001Ioi1lo(parcel.readInt());
/* 2075 */                  workSpec.setTraceTag(parcel.readString());
/* 2087 */                  oO00l1Il.I00iOIl = new i01OOOoo0iO(UUID.fromString(string), workSpec, hashSet);
/* 2089 */                  VarHandle.storeStoreFence();
/* 2092 */                  return oO00l1Il;
                        case 2:
/* 1865 */                  OO00o1 oO00o1 = new OO00o1();
/* 1874 */                  Parcelable[] parcelableArray = parcel.readParcelableArray(OO00o1.class.getClassLoader());
/* 1884 */                  oO00o1.I00iOIl = new ArrayList(parcelableArray.length);
/* 1887 */                  for (Parcelable parcelable : parcelableArray) {
/* 1897 */                      oO00o1.I00iOIl.add(((OO00l1Il) parcelable).I00iOIl);
                            }
/* 1903 */                  VarHandle.storeStoreFence();
/* 1906 */                  return oO00o1;
                        case 3:
/* 1859 */                  return new OO00o1o(parcel);
                        case 4:
/* 1821 */                  int iI001i1O0Ol = lO0Iil10.I001i1O0Ol(parcel);
/* 1829 */                  while (parcel.dataPosition() < iI001i1O0Ol) {
/* 1831 */                      int i5 = parcel.readInt();
/* 1836 */                      if (((char) i5) != 2) {
/* 1838 */                          lO0Iil10.I001IO000(i5, parcel);
                                } else {
/* 1842 */                          bundleI00000oIO = lO0Iil10.I00000oIO(i5, parcel);
                                }
                            }
/* 1848 */                  lO0Iil10.I000l1(iI001i1O0Ol, parcel);
/* 1853 */                  return new Oi000Oo1(bundleI00000oIO);
                        case 5:
/* 1778 */                  int iI001i1O0Ol2 = lO0Iil10.I001i1O0Ol(parcel);
/* 1782 */                  int iI0010I0i11 = 0;
/* 1787 */                  while (parcel.dataPosition() < iI001i1O0Ol2) {
/* 1789 */                      int i6 = parcel.readInt();
/* 1793 */                      char c = (char) i6;
/* 1794 */                      if (c == 1) {
/* 1807 */                          zI000lI4 = lO0Iil10.I000lI(i6, parcel);
                                } else if (c != 2) {
/* 1798 */                          lO0Iil10.I001IO000(i6, parcel);
                                } else {
/* 1802 */                          iI0010I0i11 = lO0Iil10.I0010I0i(i6, parcel);
                                }
                            }
/* 1812 */                  lO0Iil10.I000l1(iI001i1O0Ol2, parcel);
/* 1817 */                  return new OI000Oo(zI000lI4, iI0010I0i11);
                        case 6:
/* 1734 */                  int iI001i1O0Ol3 = lO0Iil10.I001i1O0Ol(parcel);
/* 1742 */                  while (parcel.dataPosition() < iI001i1O0Ol3) {
/* 1744 */                      int i7 = parcel.readInt();
/* 1748 */                      char c2 = (char) i7;
/* 1749 */                      if (c2 == 1) {
/* 1764 */                          iI0010I0i10 = lO0Iil10.I0010I0i(i7, parcel);
                                } else if (c2 != 2) {
/* 1753 */                          lO0Iil10.I001IO000(i7, parcel);
                                } else {
/* 1759 */                          arrayListI000iOII2 = lO0Iil10.I000iOII(parcel, i7, O1lli10oolO.CREATOR);
                                }
                            }
/* 1769 */                  lO0Iil10.I000l1(iI001i1O0Ol3, parcel);
/* 1774 */                  return new OloOI1o(iI0010I0i10, arrayListI000iOII2);
                        case 7:
/* 1689 */                  int iI001i1O0Ol4 = lO0Iil10.I001i1O0Ol(parcel);
/* 1697 */                  while (parcel.dataPosition() < iI001i1O0Ol4) {
/* 1699 */                      int i8 = parcel.readInt();
/* 1704 */                      if (((char) i8) != 1) {
/* 1706 */                          lO0Iil10.I001IO000(i8, parcel);
                                } else {
/* 1717 */                          pendingIntent = (PendingIntent) lO0Iil10.I0001Ioi1lo(parcel, i8, PendingIntent.CREATOR);
                                }
                            }
/* 1720 */                  lO0Iil10.I000l1(iI001i1O0Ol4, parcel);
/* 1725 */                  OI00OoiI1 oI00OoiI1 = new OI00OoiI1();
/* 1728 */                  oI00OoiI1.I00iOIl = pendingIntent;
/* 1730 */                  VarHandle.storeStoreFence();
/* 1733 */                  return oI00OoiI1;
                        case 8:
/* 1625 */                  int iI001i1O0Ol5 = lO0Iil10.I001i1O0Ol(parcel);
/* 1629 */                  int iI0010I0i12 = 0;
/* 1634 */                  while (parcel.dataPosition() < iI001i1O0Ol5) {
/* 1636 */                      int i9 = parcel.readInt();
/* 1640 */                      char c3 = (char) i9;
/* 1641 */                      if (c3 == 1) {
/* 1666 */                          iI0010I0i9 = lO0Iil10.I0010I0i(i9, parcel);
                                } else if (c3 == 2) {
/* 1661 */                          iI0010I0i12 = lO0Iil10.I0010I0i(i9, parcel);
                                } else if (c3 != 3) {
/* 1647 */                          lO0Iil10.I001IO000(i9, parcel);
                                } else {
/* 1658 */                          intent = (Intent) lO0Iil10.I0001Ioi1lo(parcel, i9, Intent.CREATOR);
                                }
                            }
/* 1671 */                  lO0Iil10.I000l1(iI001i1O0Ol5, parcel);
/* 1676 */                  i0OioIil i0oioiil = new i0OioIil();
/* 1679 */                  i0oioiil.I00iOIl = iI0010I0i9;
/* 1681 */                  i0oioiil.I00iiI = iI0010I0i12;
/* 1683 */                  i0oioiil.I00iiO = intent;
/* 1685 */                  VarHandle.storeStoreFence();
/* 1688 */                  return i0oioiil;
                        case 9:
/* 1495 */                  int iI001i1O0Ol6 = lO0Iil10.I001i1O0Ol(parcel);
/* 1499 */                  long jI0010o2 = 0;
/* 1501 */                  String strI000II3 = null;
/* 1502 */                  String strI000II4 = null;
/* 1503 */                  String strI000II5 = null;
/* 1504 */                  String strI000II6 = null;
/* 1506 */                  Uri uri = null;
/* 1508 */                  String strI000II7 = null;
/* 1510 */                  String strI000II8 = null;
/* 1512 */                  ArrayList arrayListI000iOII3 = null;
/* 1514 */                  String strI000II9 = null;
/* 1516 */                  String strI000II10 = null;
/* 1522 */                  while (parcel.dataPosition() < iI001i1O0Ol6) {
/* 1524 */                      int i10 = parcel.readInt();
                                switch ((char) i10) {
                                    case 2:
/* 1610 */                              strI000II3 = lO0Iil10.I000II(i10, parcel);
                                        break;
                                    case 3:
/* 1604 */                              strI000II4 = lO0Iil10.I000II(i10, parcel);
                                        break;
                                    case 4:
/* 1598 */                              strI000II5 = lO0Iil10.I000II(i10, parcel);
                                        break;
                                    case 5:
/* 1591 */                              strI000II6 = lO0Iil10.I000II(i10, parcel);
                                        break;
                                    case 6:
/* 1586 */                              uri = (Uri) lO0Iil10.I0001Ioi1lo(parcel, i10, Uri.CREATOR);
                                        break;
                                    case 7:
/* 1573 */                              strI000II7 = lO0Iil10.I000II(i10, parcel);
                                        break;
                                    case '\b':
/* 1566 */                              jI0010o2 = lO0Iil10.I0010o(i10, parcel);
                                        break;
                                    case '\t':
/* 1559 */                              strI000II8 = lO0Iil10.I000II(i10, parcel);
                                        break;
                                    case '\n':
/* 1552 */                              arrayListI000iOII3 = lO0Iil10.I000iOII(parcel, i10, Scope.CREATOR);
                                        break;
                                    case 11:
/* 1543 */                              strI000II9 = lO0Iil10.I000II(i10, parcel);
                                        break;
                                    case '\f':
/* 1536 */                              strI000II10 = lO0Iil10.I000II(i10, parcel);
                                        break;
                                    default:
/* 1532 */                              lO0Iil10.I001IO000(i10, parcel);
                                        break;
                                }
                            }
/* 1616 */                  lO0Iil10.I000l1(iI001i1O0Ol6, parcel);
/* 1621 */                  return new GoogleSignInAccount(strI000II3, strI000II4, strI000II5, strI000II6, uri, strI000II7, jI0010o2, strI000II8, arrayListI000iOII3, strI000II9, strI000II10);
                        case 10:
/* 1418 */                  int iI001i1O0Ol7 = lO0Iil10.I001i1O0Ol(parcel);
/* 1422 */                  long jI0010o3 = 0;
/* 1423 */                  int iI0010I0i13 = 0;
/* 1424 */                  int iI0010I0i14 = 0;
/* 1426 */                  boolean zI000lI5 = false;
/* 1428 */                  String strI000II11 = null;
/* 1433 */                  while (parcel.dataPosition() < iI001i1O0Ol7) {
/* 1435 */                      int i11 = parcel.readInt();
/* 1439 */                      char c4 = (char) i11;
/* 1440 */                      if (c4 == 1) {
/* 1480 */                          iI0010I0i13 = lO0Iil10.I0010I0i(i11, parcel);
                                } else if (c4 == 2) {
/* 1474 */                          strI000II11 = lO0Iil10.I000II(i11, parcel);
                                } else if (c4 == 3) {
/* 1468 */                          jI0010o3 = lO0Iil10.I0010o(i11, parcel);
                                } else if (c4 == 4) {
/* 1461 */                          iI0010I0i14 = lO0Iil10.I0010I0i(i11, parcel);
                                } else if (c4 != 5) {
/* 1450 */                          lO0Iil10.I001IO000(i11, parcel);
                                } else {
/* 1454 */                          zI000lI5 = lO0Iil10.I000lI(i11, parcel);
                                }
                            }
/* 1486 */                  lO0Iil10.I000l1(iI001i1O0Ol7, parcel);
/* 1491 */                  return new i0Oioli(iI0010I0i13, strI000II11, jI0010o3, iI0010I0i14, zI000lI5);
                        case 11:
/* 1375 */                  int iI001i1O0Ol8 = lO0Iil10.I001i1O0Ol(parcel);
/* 1379 */                  boolean zI000lI6 = false;
/* 1384 */                  while (parcel.dataPosition() < iI001i1O0Ol8) {
/* 1386 */                      int i12 = parcel.readInt();
/* 1390 */                      char c5 = (char) i12;
/* 1391 */                      if (c5 == 1) {
/* 1404 */                          iI0010I0i8 = lO0Iil10.I0010I0i(i12, parcel);
                                } else if (c5 != 2) {
/* 1395 */                          lO0Iil10.I001IO000(i12, parcel);
                                } else {
/* 1399 */                          zI000lI6 = lO0Iil10.I000lI(i12, parcel);
                                }
                            }
/* 1409 */                  lO0Iil10.I000l1(iI001i1O0Ol8, parcel);
/* 1414 */                  return new OI00i0io0i(iI0010I0i8, zI000lI6);
                        case 12:
/* 1315 */                  int iI001i1O0Ol9 = lO0Iil10.I001i1O0Ol(parcel);
/* 1319 */                  String strI000II12 = null;
/* 1320 */                  String strI000II13 = null;
/* 1325 */                  while (parcel.dataPosition() < iI001i1O0Ol9) {
/* 1327 */                      int i13 = parcel.readInt();
/* 1331 */                      char c6 = (char) i13;
/* 1332 */                      if (c6 == 1) {
/* 1361 */                          arrayListI000iOII = lO0Iil10.I000iOII(parcel, i13, IlIII1l.CREATOR);
                                } else if (c6 == 2) {
/* 1354 */                          zI000lI3 = lO0Iil10.I000lI(i13, parcel);
                                } else if (c6 == 3) {
/* 1349 */                          strI000II12 = lO0Iil10.I000II(i13, parcel);
                                } else if (c6 != 4) {
/* 1340 */                          lO0Iil10.I001IO000(i13, parcel);
                                } else {
/* 1344 */                          strI000II13 = lO0Iil10.I000II(i13, parcel);
                                }
                            }
/* 1366 */                  lO0Iil10.I000l1(iI001i1O0Ol9, parcel);
/* 1371 */                  return new I11OiiIO(arrayListI000iOII, zI000lI3, strI000II12, strI000II13);
                        case 13:
/* 1265 */                  int iI001i1O0Ol10 = lO0Iil10.I001i1O0Ol(parcel);
/* 1269 */                  String strI000II14 = null;
/* 1274 */                  while (parcel.dataPosition() < iI001i1O0Ol10) {
/* 1276 */                      int i14 = parcel.readInt();
/* 1280 */                      char c7 = (char) i14;
/* 1281 */                      if (c7 == 1) {
/* 1294 */                          arrayListI000OOo1O = lO0Iil10.I000OOo1O(i14, parcel);
                                } else if (c7 != 2) {
/* 1285 */                          lO0Iil10.I001IO000(i14, parcel);
                                } else {
/* 1289 */                          strI000II14 = lO0Iil10.I000II(i14, parcel);
                                }
                            }
/* 1299 */                  lO0Iil10.I000l1(iI001i1O0Ol10, parcel);
/* 1304 */                  i0OoOlOi i0oooloi = new i0OoOlOi();
/* 1307 */                  i0oooloi.I00iOIl = arrayListI000OOo1O;
/* 1309 */                  i0oooloi.I00iiI = strI000II14;
/* 1311 */                  VarHandle.storeStoreFence();
/* 1314 */                  return i0oooloi;
                        case 14:
/* 1218 */                  int iI001i1O0Ol11 = lO0Iil10.I001i1O0Ol(parcel);
/* 1226 */                  while (parcel.dataPosition() < iI001i1O0Ol11) {
/* 1228 */                      int i15 = parcel.readInt();
/* 1232 */                      char c8 = (char) i15;
/* 1233 */                      if (c8 == 1) {
/* 1251 */                          iI0010I0i7 = lO0Iil10.I0010I0i(i15, parcel);
                                } else if (c8 != 2) {
/* 1237 */                          lO0Iil10.I001IO000(i15, parcel);
                                } else {
/* 1248 */                          i0i0ii0o00 = (i0i0iI0O00) lO0Iil10.I0001Ioi1lo(parcel, i15, i0i0iI0O00.CREATOR);
                                }
                            }
/* 1256 */                  lO0Iil10.I000l1(iI001i1O0Ol11, parcel);
/* 1261 */                  return new i0Ooili1oO1o(iI0010I0i7, i0i0ii0o00);
                        case 15:
/* 1159 */                  int iI001i1O0Ol12 = lO0Iil10.I001i1O0Ol(parcel);
/* 1163 */                  i0i0iO i0i0io = null;
/* 1168 */                  while (parcel.dataPosition() < iI001i1O0Ol12) {
/* 1170 */                      int i16 = parcel.readInt();
/* 1174 */                      char c9 = (char) i16;
/* 1175 */                      if (c9 == 1) {
/* 1204 */                          iI0010I0i6 = lO0Iil10.I0010I0i(i16, parcel);
                                } else if (c9 == 2) {
/* 1201 */                          iOlo10lO1iOl = (IOlo10lO1iOl) lO0Iil10.I0001Ioi1lo(parcel, i16, IOlo10lO1iOl.CREATOR);
                                } else if (c9 != 3) {
/* 1181 */                          lO0Iil10.I001IO000(i16, parcel);
                                } else {
/* 1191 */                          i0i0io = (i0i0iO) lO0Iil10.I0001Ioi1lo(parcel, i16, i0i0iO.CREATOR);
                                }
                            }
/* 1209 */                  lO0Iil10.I000l1(iI001i1O0Ol12, parcel);
/* 1214 */                  return new i0i010Oli(iI0010I0i6, iOlo10lO1iOl, i0i0io);
                        case 16:
/* 1052 */                  int iI001i1O0Ol13 = lO0Iil10.I001i1O0Ol(parcel);
/* 1057 */                  long jI0010o4 = 0;
/* 1059 */                  long jI0010o5 = 0;
/* 1061 */                  int iI0010I0i15 = -1;
/* 1063 */                  int iI0010I0i16 = 0;
/* 1064 */                  int iI0010I0i17 = 0;
/* 1065 */                  int iI0010I0i18 = 0;
/* 1066 */                  int iI0010I0i19 = 0;
/* 1068 */                  String strI000II15 = null;
/* 1070 */                  String strI000II16 = null;
/* 1076 */                  while (parcel.dataPosition() < iI001i1O0Ol13) {
/* 1078 */                      int i17 = parcel.readInt();
                                switch ((char) i17) {
                                    case 1:
/* 1144 */                              iI0010I0i16 = lO0Iil10.I0010I0i(i17, parcel);
                                        break;
                                    case 2:
/* 1138 */                              iI0010I0i17 = lO0Iil10.I0010I0i(i17, parcel);
                                        break;
                                    case 3:
/* 1132 */                              iI0010I0i18 = lO0Iil10.I0010I0i(i17, parcel);
                                        break;
                                    case 4:
/* 1125 */                              jI0010o4 = lO0Iil10.I0010o(i17, parcel);
                                        break;
                                    case 5:
/* 1118 */                              jI0010o5 = lO0Iil10.I0010o(i17, parcel);
                                        break;
                                    case 6:
/* 1111 */                              strI000II15 = lO0Iil10.I000II(i17, parcel);
                                        break;
                                    case 7:
/* 1104 */                              strI000II16 = lO0Iil10.I000II(i17, parcel);
                                        break;
                                    case '\b':
/* 1097 */                              iI0010I0i19 = lO0Iil10.I0010I0i(i17, parcel);
                                        break;
                                    case '\t':
/* 1090 */                              iI0010I0i15 = lO0Iil10.I0010I0i(i17, parcel);
                                        break;
                                    default:
/* 1086 */                              lO0Iil10.I001IO000(i17, parcel);
                                        break;
                                }
                            }
/* 1150 */                  lO0Iil10.I000l1(iI001i1O0Ol13, parcel);
/* 1155 */                  return new O1lli10oolO(iI0010I0i16, iI0010I0i17, iI0010I0i18, jI0010o4, jI0010o5, strI000II15, strI000II16, iI0010I0i19, iI0010I0i15);
                        case 17:
/* 985 */                   int iI001i1O0Ol14 = lO0Iil10.I001i1O0Ol(parcel);
/* 989 */                   int iI0010I0i20 = 0;
/* 990 */                   GoogleSignInAccount googleSignInAccount = null;
/* 995 */                   while (parcel.dataPosition() < iI001i1O0Ol14) {
/* 997 */                       int i18 = parcel.readInt();
/* 1001 */                      char c10 = (char) i18;
/* 1002 */                      if (c10 == 1) {
/* 1038 */                          iI0010I0i5 = lO0Iil10.I0010I0i(i18, parcel);
                                } else if (c10 == 2) {
/* 1035 */                          account = (Account) lO0Iil10.I0001Ioi1lo(parcel, i18, Account.CREATOR);
                                } else if (c10 == 3) {
/* 1023 */                          iI0010I0i20 = lO0Iil10.I0010I0i(i18, parcel);
                                } else if (c10 != 4) {
/* 1010 */                          lO0Iil10.I001IO000(i18, parcel);
                                } else {
/* 1020 */                          googleSignInAccount = (GoogleSignInAccount) lO0Iil10.I0001Ioi1lo(parcel, i18, GoogleSignInAccount.CREATOR);
                                }
                            }
/* 1043 */                  lO0Iil10.I000l1(iI001i1O0Ol14, parcel);
/* 1048 */                  return new i0i0iI0O00(iI0010I0i5, account, iI0010I0i20, googleSignInAccount);
                        case PoseLandmark.RIGHT_PINKY:
/* 902 */                   int iI001i1O0Ol15 = lO0Iil10.I001i1O0Ol(parcel);
/* 906 */                   boolean zI000lI7 = false;
/* 907 */                   boolean zI000lI8 = false;
/* 908 */                   IOlo10lO1iOl iOlo10lO1iOl2 = null;
/* 913 */                   while (parcel.dataPosition() < iI001i1O0Ol15) {
/* 915 */                       int i19 = parcel.readInt();
/* 919 */                       char c11 = (char) i19;
/* 920 */                       if (c11 == 1) {
/* 958 */                           iI0010I0i4 = lO0Iil10.I0010I0i(i19, parcel);
                                } else if (c11 == 2) {
/* 953 */                           iBinderI00100o1O0lo = lO0Iil10.I00100o1O0lo(i19, parcel);
                                } else if (c11 == 3) {
/* 950 */                           iOlo10lO1iOl2 = (IOlo10lO1iOl) lO0Iil10.I0001Ioi1lo(parcel, i19, IOlo10lO1iOl.CREATOR);
                                } else if (c11 == 4) {
/* 939 */                           zI000lI7 = lO0Iil10.I000lI(i19, parcel);
                                } else if (c11 != 5) {
/* 930 */                           lO0Iil10.I001IO000(i19, parcel);
                                } else {
/* 934 */                           zI000lI8 = lO0Iil10.I000lI(i19, parcel);
                                }
                            }
/* 963 */                   lO0Iil10.I000l1(iI001i1O0Ol15, parcel);
/* 968 */                   i0i0iO i0i0io2 = new i0i0iO();
/* 971 */                   i0i0io2.I00iOIl = iI0010I0i4;
/* 973 */                   i0i0io2.I00iiI = iBinderI00100o1O0lo;
/* 975 */                   i0i0io2.I00iiO = iOlo10lO1iOl2;
/* 977 */                   i0i0io2.I00iio = zI000lI7;
/* 979 */                   i0i0io2.I00ilI0I1 = zI000lI8;
/* 981 */                   VarHandle.storeStoreFence();
/* 984 */                   return i0i0io2;
                        case PoseLandmark.LEFT_INDEX:
/* 822 */                   int iI001i1O0Ol16 = lO0Iil10.I001i1O0Ol(parcel);
/* 826 */                   int iI0010I0i21 = 0;
/* 827 */                   int iI0010I0i22 = 0;
/* 828 */                   int iI0010I0i23 = 0;
/* 833 */                   while (parcel.dataPosition() < iI001i1O0Ol16) {
/* 835 */                       int i20 = parcel.readInt();
/* 839 */                       char c12 = (char) i20;
/* 840 */                       if (c12 == 2) {
/* 875 */                           iI0010I0i3 = lO0Iil10.I0010I0i(i20, parcel);
                                } else if (c12 == 3) {
/* 870 */                           iI0010I0i21 = lO0Iil10.I0010I0i(i20, parcel);
                                } else if (c12 == 4) {
/* 865 */                           iI0010I0i22 = lO0Iil10.I0010I0i(i20, parcel);
                                } else if (c12 == 5) {
/* 860 */                           iI0010I0i23 = lO0Iil10.I0010I0i(i20, parcel);
                                } else if (c12 != 6) {
/* 851 */                           lO0Iil10.I001IO000(i20, parcel);
                                } else {
/* 855 */                           fI00100l0 = lO0Iil10.I00100l0(i20, parcel);
                                }
                            }
/* 880 */                   lO0Iil10.I000l1(iI001i1O0Ol16, parcel);
/* 885 */                   i0o1IO00III i0o1io00iii = new i0o1IO00III();
/* 888 */                   i0o1io00iii.I00iOIl = iI0010I0i3;
/* 890 */                   i0o1io00iii.I00iiI = iI0010I0i21;
/* 892 */                   i0o1io00iii.I00iiO = iI0010I0i22;
/* 894 */                   i0o1io00iii.I00iio = iI0010I0i23;
/* 896 */                   i0o1io00iii.I00ilI0I1 = fI00100l0;
/* 898 */                   VarHandle.storeStoreFence();
/* 901 */                   return i0o1io00iii;
                        case PoseLandmark.RIGHT_INDEX:
/* 687 */                   int iI001i1O0Ol17 = lO0Iil10.I001i1O0Ol(parcel);
/* 691 */                   boolean zI000lI9 = false;
/* 692 */                   int iI0010I0i24 = 0;
/* 693 */                   int iI0010I0i25 = 0;
/* 694 */                   i0o1IO00III i0o1io00iii2 = null;
/* 695 */                   i0o1IO00III i0o1io00iii3 = null;
/* 696 */                   i0o1IO00III i0o1io00iii4 = null;
/* 697 */                   String strI000II17 = null;
/* 698 */                   String strI000II18 = null;
/* 703 */                   while (parcel.dataPosition() < iI001i1O0Ol17) {
/* 705 */                       int i21 = parcel.readInt();
                                switch ((char) i21) {
                                    case 2:
/* 785 */                               i1011ioiArr = (i1011IOI[]) lO0Iil10.I000OiO(parcel, i21, i1011IOI.CREATOR);
                                        break;
                                    case 3:
/* 776 */                               i0o1io00iii2 = (i0o1IO00III) lO0Iil10.I0001Ioi1lo(parcel, i21, i0o1IO00III.CREATOR);
                                        break;
                                    case 4:
/* 767 */                               i0o1io00iii3 = (i0o1IO00III) lO0Iil10.I0001Ioi1lo(parcel, i21, i0o1IO00III.CREATOR);
                                        break;
                                    case 5:
/* 758 */                               i0o1io00iii4 = (i0o1IO00III) lO0Iil10.I0001Ioi1lo(parcel, i21, i0o1IO00III.CREATOR);
                                        break;
                                    case 6:
/* 747 */                               strI000II17 = lO0Iil10.I000II(i21, parcel);
                                        break;
                                    case 7:
/* 742 */                               fI00100l0 = lO0Iil10.I00100l0(i21, parcel);
                                        break;
                                    case '\b':
/* 737 */                               strI000II18 = lO0Iil10.I000II(i21, parcel);
                                        break;
                                    case '\t':
/* 732 */                               iI0010I0i2 = lO0Iil10.I0010I0i(i21, parcel);
                                        break;
                                    case '\n':
/* 727 */                               zI000lI9 = lO0Iil10.I000lI(i21, parcel);
                                        break;
                                    case 11:
/* 722 */                               iI0010I0i24 = lO0Iil10.I0010I0i(i21, parcel);
                                        break;
                                    case '\f':
/* 717 */                               iI0010I0i25 = lO0Iil10.I0010I0i(i21, parcel);
                                        break;
                                    default:
/* 713 */                               lO0Iil10.I001IO000(i21, parcel);
                                        break;
                                }
                            }
/* 788 */                   lO0Iil10.I000l1(iI001i1O0Ol17, parcel);
/* 793 */                   i0ol1oOIi1 i0ol1ooii1 = new i0ol1oOIi1();
/* 796 */                   i0ol1ooii1.I00iOIl = i1011ioiArr;
/* 798 */                   i0ol1ooii1.I00iiI = i0o1io00iii2;
/* 800 */                   i0ol1ooii1.I00iiO = i0o1io00iii3;
/* 802 */                   i0ol1ooii1.I00iio = i0o1io00iii4;
/* 804 */                   i0ol1ooii1.I00ilI0I1 = strI000II17;
/* 806 */                   i0ol1ooii1.I00ilO0 = fI00100l0;
/* 808 */                   i0ol1ooii1.I00io1l = strI000II18;
/* 810 */                   i0ol1ooii1.I00ioIO = iI0010I0i2;
/* 812 */                   i0ol1ooii1.I00l0I0l0lO1 = zI000lI9;
/* 814 */                   i0ol1ooii1.I00l0OO0IO = iI0010I0i24;
/* 816 */                   i0ol1ooii1.I00li1OI = iI0010I0i25;
/* 818 */                   VarHandle.storeStoreFence();
/* 821 */                   return i0ol1ooii1;
                        case PoseLandmark.LEFT_THUMB:
/* 660 */                   int iI001i1O0Ol18 = lO0Iil10.I001i1O0Ol(parcel);
/* 668 */                   while (parcel.dataPosition() < iI001i1O0Ol18) {
/* 674 */                       lO0Iil10.I001IO000(parcel.readInt(), parcel);
                            }
/* 678 */                   lO0Iil10.I000l1(iI001i1O0Ol18, parcel);
/* 683 */                   return new i0ooi0O0i0();
                        case PoseLandmark.RIGHT_THUMB:
/* 560 */                   int iI001i1O0Ol19 = lO0Iil10.I001i1O0Ol(parcel);
/* 564 */                   i0o1IO00III i0o1io00iii5 = null;
/* 565 */                   i0o1IO00III i0o1io00iii6 = null;
/* 566 */                   String strI000II19 = null;
/* 567 */                   String strI000II20 = null;
/* 572 */                   while (parcel.dataPosition() < iI001i1O0Ol19) {
/* 574 */                       int i22 = parcel.readInt();
                                switch ((char) i22) {
                                    case 2:
/* 631 */                               i0ooi0o0i0Arr = (i0ooi0O0i0[]) lO0Iil10.I000OiO(parcel, i22, i0ooi0O0i0.CREATOR);
                                        break;
                                    case 3:
/* 621 */                               i0o1io00iii5 = (i0o1IO00III) lO0Iil10.I0001Ioi1lo(parcel, i22, i0o1IO00III.CREATOR);
                                        break;
                                    case 4:
/* 612 */                               i0o1io00iii6 = (i0o1IO00III) lO0Iil10.I0001Ioi1lo(parcel, i22, i0o1IO00III.CREATOR);
                                        break;
                                    case 5:
/* 601 */                               strI000II19 = lO0Iil10.I000II(i22, parcel);
                                        break;
                                    case 6:
/* 596 */                               fI00100l0 = lO0Iil10.I00100l0(i22, parcel);
                                        break;
                                    case 7:
/* 591 */                               strI000II20 = lO0Iil10.I000II(i22, parcel);
                                        break;
                                    case '\b':
/* 586 */                               zI000lI2 = lO0Iil10.I000lI(i22, parcel);
                                        break;
                                    default:
/* 582 */                               lO0Iil10.I001IO000(i22, parcel);
                                        break;
                                }
                            }
/* 634 */                   lO0Iil10.I000l1(iI001i1O0Ol19, parcel);
/* 639 */                   i1011IOI i1011ioi = new i1011IOI();
/* 642 */                   i1011ioi.I00iOIl = i0ooi0o0i0Arr;
/* 644 */                   i1011ioi.I00iiI = i0o1io00iii5;
/* 646 */                   i1011ioi.I00iiO = i0o1io00iii6;
/* 648 */                   i1011ioi.I00iio = strI000II19;
/* 650 */                   i1011ioi.I00ilI0I1 = fI00100l0;
/* 652 */                   i1011ioi.I00ilO0 = strI000II20;
/* 654 */                   i1011ioi.I00io1l = zI000lI2;
/* 656 */                   VarHandle.storeStoreFence();
/* 659 */                   return i1011ioi;
                        case PoseLandmark.LEFT_HIP:
/* 481 */                   int iI001i1O0Ol20 = lO0Iil10.I001i1O0Ol(parcel);
/* 485 */                   int iI0010I0i26 = 0;
/* 486 */                   int iI0010I0i27 = 0;
/* 487 */                   int iI0010I0i28 = 0;
/* 492 */                   while (parcel.dataPosition() < iI001i1O0Ol20) {
/* 494 */                       int i23 = parcel.readInt();
/* 498 */                       char c13 = (char) i23;
/* 499 */                       if (c13 == 1) {
/* 533 */                           iI0010I0i = lO0Iil10.I0010I0i(i23, parcel);
                                } else if (c13 == 2) {
/* 528 */                           iI0010I0i26 = lO0Iil10.I0010I0i(i23, parcel);
                                } else if (c13 == 3) {
/* 523 */                           iI0010I0i27 = lO0Iil10.I0010I0i(i23, parcel);
                                } else if (c13 == 4) {
/* 518 */                           iI0010I0i28 = lO0Iil10.I0010I0i(i23, parcel);
                                } else if (c13 != 5) {
/* 509 */                           lO0Iil10.I001IO000(i23, parcel);
                                } else {
/* 513 */                           jI0010o = lO0Iil10.I0010o(i23, parcel);
                                }
                            }
/* 538 */                   lO0Iil10.I000l1(iI001i1O0Ol20, parcel);
/* 543 */                   i10i11Ili i10i11ili = new i10i11Ili();
/* 546 */                   i10i11ili.I00iOIl = iI0010I0i;
/* 548 */                   i10i11ili.I00iiI = iI0010I0i26;
/* 550 */                   i10i11ili.I00iiO = iI0010I0i27;
/* 552 */                   i10i11ili.I00iio = iI0010I0i28;
/* 554 */                   i10i11ili.I00ilI0I1 = jI0010o;
/* 556 */                   VarHandle.storeStoreFence();
/* 559 */                   return i10i11ili;
                        case PoseLandmark.RIGHT_HIP:
/* 402 */                   int iI001i1O0Ol21 = lO0Iil10.I001i1O0Ol(parcel);
/* 406 */                   String strI000II21 = null;
/* 407 */                   Rect rect = null;
/* 408 */                   ArrayList arrayListI000iOII4 = null;
/* 409 */                   String strI000II22 = null;
/* 411 */                   ArrayList arrayListI000iOII5 = null;
/* 417 */                   while (parcel.dataPosition() < iI001i1O0Ol21) {
/* 419 */                       int i24 = parcel.readInt();
/* 423 */                       char c14 = (char) i24;
/* 424 */                       if (c14 == 1) {
/* 467 */                           strI000II21 = lO0Iil10.I000II(i24, parcel);
                                } else if (c14 == 2) {
/* 464 */                           rect = (Rect) lO0Iil10.I0001Ioi1lo(parcel, i24, Rect.CREATOR);
                                } else if (c14 == 3) {
/* 452 */                           arrayListI000iOII4 = lO0Iil10.I000iOII(parcel, i24, Point.CREATOR);
                                } else if (c14 == 4) {
/* 445 */                           strI000II22 = lO0Iil10.I000II(i24, parcel);
                                } else if (c14 != 5) {
/* 434 */                           lO0Iil10.I001IO000(i24, parcel);
                                } else {
/* 440 */                           arrayListI000iOII5 = lO0Iil10.I000iOII(parcel, i24, i10ioiO.CREATOR);
                                }
                            }
/* 472 */                   lO0Iil10.I000l1(iI001i1O0Ol21, parcel);
/* 477 */                   return new i10ioI(strI000II21, rect, arrayListI000iOII4, strI000II22, arrayListI000iOII5);
                        case PoseLandmark.LEFT_KNEE:
/* 316 */                   int iI001i1O0Ol22 = lO0Iil10.I001i1O0Ol(parcel);
/* 320 */                   float fI00100l02 = 0.0f;
/* 321 */                   float fI00100l03 = 0.0f;
/* 322 */                   Rect rect2 = null;
/* 323 */                   String strI000II23 = null;
/* 325 */                   String strI000II24 = null;
/* 327 */                   ArrayList arrayListI000iOII6 = null;
/* 329 */                   ArrayList arrayListI000iOII7 = null;
/* 335 */                   while (parcel.dataPosition() < iI001i1O0Ol22) {
/* 337 */                       int i25 = parcel.readInt();
                                switch ((char) i25) {
                                    case 1:
/* 388 */                               strI000II23 = lO0Iil10.I000II(i25, parcel);
                                        break;
                                    case 2:
/* 385 */                               rect2 = (Rect) lO0Iil10.I0001Ioi1lo(parcel, i25, Rect.CREATOR);
                                        break;
                                    case 3:
/* 373 */                               arrayListI000iOII6 = lO0Iil10.I000iOII(parcel, i25, Point.CREATOR);
                                        break;
                                    case 4:
/* 366 */                               strI000II24 = lO0Iil10.I000II(i25, parcel);
                                        break;
                                    case 5:
/* 361 */                               fI00100l02 = lO0Iil10.I00100l0(i25, parcel);
                                        break;
                                    case 6:
/* 356 */                               fI00100l03 = lO0Iil10.I00100l0(i25, parcel);
                                        break;
                                    case 7:
/* 351 */                               arrayListI000iOII7 = lO0Iil10.I000iOII(parcel, i25, i10l11OI.CREATOR);
                                        break;
                                    default:
/* 345 */                               lO0Iil10.I001IO000(i25, parcel);
                                        break;
                                }
                            }
/* 393 */                   lO0Iil10.I000l1(iI001i1O0Ol22, parcel);
/* 398 */                   return new i10ioIi(fI00100l02, fI00100l03, rect2, strI000II23, strI000II24, arrayListI000iOII6, arrayListI000iOII7);
                        case PoseLandmark.RIGHT_KNEE:
/* 230 */                   int iI001i1O0Ol23 = lO0Iil10.I001i1O0Ol(parcel);
/* 234 */                   float fI00100l04 = 0.0f;
/* 235 */                   float fI00100l05 = 0.0f;
/* 236 */                   Rect rect3 = null;
/* 237 */                   String strI000II25 = null;
/* 239 */                   String strI000II26 = null;
/* 241 */                   ArrayList arrayListI000iOII8 = null;
/* 243 */                   ArrayList arrayListI000iOII9 = null;
/* 249 */                   while (parcel.dataPosition() < iI001i1O0Ol23) {
/* 251 */                       int i26 = parcel.readInt();
                                switch ((char) i26) {
                                    case 1:
/* 302 */                               strI000II25 = lO0Iil10.I000II(i26, parcel);
                                        break;
                                    case 2:
/* 299 */                               rect3 = (Rect) lO0Iil10.I0001Ioi1lo(parcel, i26, Rect.CREATOR);
                                        break;
                                    case 3:
/* 287 */                               arrayListI000iOII8 = lO0Iil10.I000iOII(parcel, i26, Point.CREATOR);
                                        break;
                                    case 4:
/* 280 */                               strI000II26 = lO0Iil10.I000II(i26, parcel);
                                        break;
                                    case 5:
/* 275 */                               arrayListI000iOII9 = lO0Iil10.I000iOII(parcel, i26, i10ioIi.CREATOR);
                                        break;
                                    case 6:
/* 268 */                               fI00100l04 = lO0Iil10.I00100l0(i26, parcel);
                                        break;
                                    case 7:
/* 263 */                               fI00100l05 = lO0Iil10.I00100l0(i26, parcel);
                                        break;
                                    default:
/* 259 */                               lO0Iil10.I001IO000(i26, parcel);
                                        break;
                                }
                            }
/* 307 */                   lO0Iil10.I000l1(iI001i1O0Ol23, parcel);
/* 312 */                   return new i10ioiO(fI00100l04, fI00100l05, rect3, strI000II25, strI000II26, arrayListI000iOII8, arrayListI000iOII9);
                        case 27:
/* 185 */                   int iI001i1O0Ol24 = lO0Iil10.I001i1O0Ol(parcel);
/* 189 */                   ArrayList arrayListI000iOII10 = null;
/* 194 */                   while (parcel.dataPosition() < iI001i1O0Ol24) {
/* 196 */                       int i27 = parcel.readInt();
/* 200 */                       char c15 = (char) i27;
/* 201 */                       if (c15 == 1) {
/* 216 */                           strI000II2 = lO0Iil10.I000II(i27, parcel);
                                } else if (c15 != 2) {
/* 205 */                           lO0Iil10.I001IO000(i27, parcel);
                                } else {
/* 211 */                           arrayListI000iOII10 = lO0Iil10.I000iOII(parcel, i27, i10ioI.CREATOR);
                                }
                            }
/* 221 */                   lO0Iil10.I000l1(iI001i1O0Ol24, parcel);
/* 226 */                   return new i10iollO00(strI000II2, arrayListI000iOII10);
                        case PoseLandmark.RIGHT_ANKLE:
/* 97 */                    int iI001i1O0Ol25 = lO0Iil10.I001i1O0Ol(parcel);
/* 101 */                   int iI0010I0i29 = 0;
/* 102 */                   boolean zI000lI10 = false;
/* 103 */                   String strI000II27 = null;
/* 104 */                   String strI000II28 = null;
/* 105 */                   String strI000II29 = null;
/* 110 */                   while (parcel.dataPosition() < iI001i1O0Ol25) {
/* 112 */                       int i28 = parcel.readInt();
                                switch ((char) i28) {
                                    case 1:
/* 154 */                               strI000II = lO0Iil10.I000II(i28, parcel);
                                        break;
                                    case 2:
/* 149 */                               strI000II27 = lO0Iil10.I000II(i28, parcel);
                                        break;
                                    case 3:
/* 144 */                               strI000II28 = lO0Iil10.I000II(i28, parcel);
                                        break;
                                    case 4:
/* 139 */                               zI000lI = lO0Iil10.I000lI(i28, parcel);
                                        break;
                                    case 5:
/* 134 */                               iI0010I0i29 = lO0Iil10.I0010I0i(i28, parcel);
                                        break;
                                    case 6:
/* 129 */                               strI000II29 = lO0Iil10.I000II(i28, parcel);
                                        break;
                                    case 7:
/* 124 */                               zI000lI10 = lO0Iil10.I000lI(i28, parcel);
                                        break;
                                    default:
/* 120 */                               lO0Iil10.I001IO000(i28, parcel);
                                        break;
                                }
                            }
/* 159 */                   lO0Iil10.I000l1(iI001i1O0Ol25, parcel);
/* 164 */                   i10l0iOo01i i10l0ioo01i = new i10l0iOo01i();
/* 167 */                   i10l0ioo01i.I00iOIl = strI000II;
/* 169 */                   i10l0ioo01i.I00iiI = strI000II27;
/* 171 */                   i10l0ioo01i.I00iiO = strI000II28;
/* 173 */                   i10l0ioo01i.I00ilO0 = strI000II29;
/* 175 */                   i10l0ioo01i.I00ilI0I1 = iI0010I0i29;
/* 177 */                   i10l0ioo01i.I00iio = zI000lI;
/* 179 */                   i10l0ioo01i.I00io1l = zI000lI10;
/* 181 */                   VarHandle.storeStoreFence();
/* 184 */                   return i10l0ioo01i;
                        default:
/* 20 */                    int iI001i1O0Ol26 = lO0Iil10.I001i1O0Ol(parcel);
/* 24 */                    float fI00100l06 = 0.0f;
/* 26 */                    float fI00100l07 = 0.0f;
/* 28 */                    String strI000II30 = null;
/* 29 */                    Rect rect4 = null;
/* 30 */                    ArrayList arrayListI000iOII11 = null;
/* 35 */                    while (parcel.dataPosition() < iI001i1O0Ol26) {
/* 37 */                        int i29 = parcel.readInt();
/* 41 */                        char c16 = (char) i29;
/* 42 */                        if (c16 == 1) {
/* 83 */                            strI000II30 = lO0Iil10.I000II(i29, parcel);
                                } else if (c16 == 2) {
/* 80 */                            rect4 = (Rect) lO0Iil10.I0001Ioi1lo(parcel, i29, Rect.CREATOR);
                                } else if (c16 == 3) {
/* 68 */                            arrayListI000iOII11 = lO0Iil10.I000iOII(parcel, i29, Point.CREATOR);
                                } else if (c16 == 4) {
/* 61 */                            fI00100l06 = lO0Iil10.I00100l0(i29, parcel);
                                } else if (c16 != 5) {
/* 52 */                            lO0Iil10.I001IO000(i29, parcel);
                                } else {
/* 56 */                            fI00100l07 = lO0Iil10.I00100l0(i29, parcel);
                                }
                            }
/* 88 */                    lO0Iil10.I000l1(iI001i1O0Ol26, parcel);
/* 93 */                    return new i10l11OI(strI000II30, rect4, arrayListI000iOII11, fI00100l06, fI00100l07);
                    }
                }

                @Override
                public final Object[] newArray(int i) {
                    switch (this.I00000oIO) {
                        case 0:
/* 93 */                    return new OO00ilI[i];
                        case 1:
/* 90 */                    return new OO00l1Il[i];
                        case 2:
/* 87 */                    return new OO00o1[i];
                        case 3:
/* 84 */                    return new OO00o1o[i];
                        case 4:
/* 81 */                    return new Oi000Oo1[i];
                        case 5:
/* 78 */                    return new OI000Oo[i];
                        case 6:
/* 75 */                    return new OloOI1o[i];
                        case 7:
/* 72 */                    return new OI00OoiI1[i];
                        case 8:
/* 69 */                    return new i0OioIil[i];
                        case 9:
/* 66 */                    return new GoogleSignInAccount[i];
                        case 10:
/* 63 */                    return new i0Oioli[i];
                        case 11:
/* 60 */                    return new OI00i0io0i[i];
                        case 12:
/* 57 */                    return new I11OiiIO[i];
                        case 13:
/* 54 */                    return new i0OoOlOi[i];
                        case 14:
/* 51 */                    return new i0Ooili1oO1o[i];
                        case 15:
/* 48 */                    return new i0i010Oli[i];
                        case 16:
/* 45 */                    return new O1lli10oolO[i];
                        case 17:
/* 42 */                    return new i0i0iI0O00[i];
                        case PoseLandmark.RIGHT_PINKY:
/* 39 */                    return new i0i0iO[i];
                        case PoseLandmark.LEFT_INDEX:
/* 36 */                    return new i0o1IO00III[i];
                        case PoseLandmark.RIGHT_INDEX:
/* 33 */                    return new i0ol1oOIi1[i];
                        case PoseLandmark.LEFT_THUMB:
/* 30 */                    return new i0ooi0O0i0[i];
                        case PoseLandmark.RIGHT_THUMB:
/* 27 */                    return new i1011IOI[i];
                        case PoseLandmark.LEFT_HIP:
/* 24 */                    return new i10i11Ili[i];
                        case PoseLandmark.RIGHT_HIP:
/* 21 */                    return new i10ioI[i];
                        case PoseLandmark.LEFT_KNEE:
/* 18 */                    return new i10ioIi[i];
                        case PoseLandmark.RIGHT_KNEE:
/* 15 */                    return new i10ioiO[i];
                        case 27:
/* 12 */                    return new i10iollO00[i];
                        case PoseLandmark.RIGHT_ANKLE:
/* 9 */                     return new i10l0iOo01i[i];
                        default:
/* 6 */                     return new i10l11OI[i];
                    }
                }
            }

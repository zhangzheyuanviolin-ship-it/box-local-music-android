            package p000;

            import android.app.Notification;
            import android.content.Intent;
            import android.content.IntentSender;
            import android.net.Network;
            import android.net.NetworkRequest;
            import android.net.Uri;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.text.TextUtils;
            import androidx.versionedparcelable.ParcelImpl;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.HashSet;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.UUID;
            
            public final class i1IIiI1OOo implements Parcelable.Creator {
                public static final i1IIiI1OOo I00000oOI = new i1IIiI1OOo(0);
                public final int I00000oIO;

                public i1IIiI1OOo(int i) {
/* 1 */             this.I00000oIO = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:110:0x028d  */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object createFromParcel(Parcel parcel) {
                    Ii11I1OOII1 ii11I1OOII1I00000oIO;
                    O10oI0l1 o10o0OiIIll;
                    O10oI0l1 o10o0o00;
                    ArrayList arrayList;
                    ArrayList arrayList2;
                    Ii11I1OOII1 ii11I1OOII1I00000oIO2;
                    Ii11I1OOII1 ii11I1OOII1I00000oIO3;
/* 8 */             String str = "NetworkRequests with NetworkSpecifiers set aren't supported.";
                    switch (this.I00000oIO) {
                        case 0:
/* 1523 */                  int iDataPosition = parcel.dataPosition();
/* 1534 */                  if (parcel.readInt() != -204102970) {
/* 1588 */                      parcel.setDataPosition(iDataPosition - 4);
/* 1591 */                      return I11Oioio.I00iio;
                            }
/* 1536 */                  int iI001i1O0Ol = lO0Iil10.I001i1O0Ol(parcel);
/* 1540 */                  IOiIOIII0io iOiIOIII0io = null;
/* 1541 */                  boolean zI000lI = false;
/* 1546 */                  while (parcel.dataPosition() < iI001i1O0Ol) {
/* 1548 */                      int i = parcel.readInt();
/* 1552 */                      char c = (char) i;
/* 1554 */                      if (c == 1) {
/* 1574 */                          iOiIOIII0io = (IOiIOIII0io) lO0Iil10.I0001Ioi1lo(parcel, i, IOiIOIII0io.CREATOR);
                                } else if (c != 2) {
/* 1558 */                          lO0Iil10.I001IO000(i, parcel);
                                } else {
/* 1562 */                          zI000lI = lO0Iil10.I000lI(i, parcel);
                                }
                            }
/* 1577 */                  lO0Iil10.I000l1(iI001i1O0Ol, parcel);
/* 1582 */                  return new I11Oioio(iOiIOIII0io, zI000lI);
                        case 1:
/* 1518 */                  return new I0IIOOO1O(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
                        case 2:
/* 1479 */                  I1I1O000iiI0 i1I1O000iiI0 = new I1I1O000iiI0(parcel);
/* 1491 */                  i1I1O000iiI0.I00iOIl = parcel.readByte() != 0;
/* 1493 */                  return i1I1O000iiI0;
                        case 3:
/* 1375 */                  I1loioi1I0Ii i1loioi1I0Ii = new I1loioi1I0Ii();
/* 1382 */                  i1loioi1I0Ii.I00iOIl = parcel.createIntArray();
/* 1388 */                  i1loioi1I0Ii.I00iiI = parcel.createStringArrayList();
/* 1394 */                  i1loioi1I0Ii.I00iiO = parcel.createIntArray();
/* 1400 */                  i1loioi1I0Ii.I00iio = parcel.createIntArray();
/* 1406 */                  i1loioi1I0Ii.I00ilI0I1 = parcel.readInt();
/* 1412 */                  i1loioi1I0Ii.I00ilO0 = parcel.readString();
/* 1418 */                  i1loioi1I0Ii.I00io1l = parcel.readInt();
/* 1424 */                  i1loioi1I0Ii.I00ioIO = parcel.readInt();
/* 1426 */                  Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
/* 1434 */                  i1loioi1I0Ii.I00l0I0l0lO1 = (CharSequence) creator.createFromParcel(parcel);
/* 1440 */                  i1loioi1I0Ii.I00l0OO0IO = parcel.readInt();
/* 1448 */                  i1loioi1I0Ii.I00li1OI = (CharSequence) creator.createFromParcel(parcel);
/* 1454 */                  i1loioi1I0Ii.I00ll1 = parcel.createStringArrayList();
/* 1460 */                  i1loioi1I0Ii.I00lli11 = parcel.createStringArrayList();
/* 1471 */                  i1loioi1I0Ii.I00lll10 = parcel.readInt() != 0;
/* 1473 */                  VarHandle.storeStoreFence();
/* 1476 */                  return i1loioi1I0Ii;
                        case 4:
/* 1352 */                  I1lolIOl i1lolIOl = new I1lolIOl();
/* 1359 */                  i1lolIOl.I00iOIl = parcel.createStringArrayList();
/* 1367 */                  i1lolIOl.I00iiI = parcel.createTypedArrayList(I1loioi1I0Ii.CREATOR);
/* 1369 */                  VarHandle.storeStoreFence();
/* 1372 */                  return i1lolIOl;
                        case 5:
/* 1346 */                  return new Ii1ooo(parcel.readInt());
                        case 6:
/* 1324 */                  Ill1IIIIO ill1IIIIO = new Ill1IIIIO();
/* 1331 */                  ill1IIIIO.I00iOIl = parcel.readString();
/* 1337 */                  ill1IIIIO.I00iiI = parcel.readInt();
/* 1339 */                  return ill1IIIIO;
                        case 7:
/* 1245 */                  Ill1Oooli01I ill1Oooli01I = new Ill1Oooli01I();
/* 1249 */                  ill1Oooli01I.I00ilI0I1 = null;
/* 1256 */                  ill1Oooli01I.I00ilO0 = new ArrayList();
/* 1263 */                  ill1Oooli01I.I00io1l = new ArrayList();
/* 1269 */                  ill1Oooli01I.I00iOIl = parcel.createStringArrayList();
/* 1275 */                  ill1Oooli01I.I00iiI = parcel.createStringArrayList();
/* 1285 */                  ill1Oooli01I.I00iiO = (I1loioi1I0Ii[]) parcel.createTypedArray(I1loioi1I0Ii.CREATOR);
/* 1291 */                  ill1Oooli01I.I00iio = parcel.readInt();
/* 1297 */                  ill1Oooli01I.I00ilI0I1 = parcel.readString();
/* 1303 */                  ill1Oooli01I.I00ilO0 = parcel.createStringArrayList();
/* 1311 */                  ill1Oooli01I.I00io1l = parcel.createTypedArrayList(I1lolIOl.CREATOR);
/* 1319 */                  ill1Oooli01I.I00ioIO = parcel.createTypedArrayList(Ill1IIIIO.CREATOR);
/* 1321 */                  return ill1Oooli01I;
                        case 8:
/* 1133 */                  Ill1oll1I0 ill1oll1I0 = new Ill1oll1I0();
/* 1140 */                  ill1oll1I0.I00iOIl = parcel.readString();
/* 1146 */                  ill1oll1I0.I00iiI = parcel.readString();
/* 1157 */                  ill1oll1I0.I00iiO = parcel.readInt() != 0;
/* 1163 */                  ill1oll1I0.I00iio = parcel.readInt();
/* 1169 */                  ill1oll1I0.I00ilI0I1 = parcel.readInt();
/* 1175 */                  ill1oll1I0.I00ilO0 = parcel.readString();
/* 1186 */                  ill1oll1I0.I00io1l = parcel.readInt() != 0;
/* 1197 */                  ill1oll1I0.I00ioIO = parcel.readInt() != 0;
/* 1208 */                  ill1oll1I0.I00l0I0l0lO1 = parcel.readInt() != 0;
/* 1214 */                  ill1oll1I0.I00l0OO0IO = parcel.readBundle();
/* 1225 */                  ill1oll1I0.I00li1OI = parcel.readInt() != 0;
/* 1231 */                  ill1oll1I0.I00lli11 = parcel.readBundle();
/* 1237 */                  ill1oll1I0.I00ll1 = parcel.readInt();
/* 1239 */                  VarHandle.storeStoreFence();
/* 1242 */                  return ill1oll1I0;
                        case 9:
/* 1127 */                  return new IooiIli((IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader()), (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
                        case 10:
/* 1071 */                  O1Oo00ii00 o1Oo00ii00 = new O1Oo00ii00(parcel);
/* 1090 */                  o1Oo00ii00.I00iOIl = ((Integer) parcel.readValue(O1Oo00ii00.class.getClassLoader())).intValue();
/* 1092 */                  return o1Oo00ii00;
                        case 11:
/* 1033 */                  String string = parcel.readString();
/* 1037 */                  int i2 = parcel.readInt();
/* 1043 */                  LinkedHashMap linkedHashMap = new LinkedHashMap(i2);
/* 1047 */                  for (int i3 = 0; i3 < i2; i3++) {
/* 1057 */                      linkedHashMap.put(parcel.readString(), parcel.readString());
                            }
/* 1065 */                  return new O1il00oooo(string, linkedHashMap);
                        case 12:
/* 1023 */                  OIIIlI1 oIIIlI1 = new OIIIlI1(parcel);
/* 1030 */                  oIIIlI1.I00iOIl = parcel.readInt();
/* 1032 */                  return oIIIlI1;
                        case 13:
/* 1003 */                  ParcelImpl parcelImpl = new ParcelImpl();
/* 1015 */                  parcelImpl.I00iOIl = new OooOIIIO(parcel).I000II();
/* 1017 */                  VarHandle.storeStoreFence();
/* 1020 */                  return parcelImpl;
                        case 14:
/* 819 */                   OIolIIO oIolIIO = new OIolIIO();
/* 824 */                   OIIOlI oIIOlI = OIIOlI.I00iOIl;
/* 828 */                   LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 835 */                   OIIOlI oIIOlII0000oI00 = liIOOIo0.I0000oI00(parcel.readInt());
/* 842 */                   OIIOOo oIIOOo = new OIIOOo(null);
/* 855 */                   boolean z = parcel.readInt() == 1;
/* 866 */                   boolean z2 = parcel.readInt() == 1;
/* 877 */                   boolean z3 = parcel.readInt() == 1;
/* 888 */                   boolean z4 = parcel.readInt() == 1;
/* 894 */                   if (parcel.readInt() == 1) {
/* 912 */                       for (IOo0iolo iOo0iolo : liIOOIo0.I00000oOI(parcel.createByteArray())) {
/* 929 */                           linkedHashSet.add(new IOo0iolo(iOo0iolo.I00000oOI, iOo0iolo.I00000oIO));
                                }
                            }
/* 933 */                   long j = parcel.readLong();
/* 937 */                   long j2 = parcel.readLong();
/* 946 */                   if (parcel.readInt() == 1) {
/* 956 */                       NetworkRequest networkRequestI00000oIO = l1il0l0IoOO1.I00000oIO(parcel.createIntArray(), parcel.createIntArray());
/* 960 */                       oIIOlII0000oI00 = OIIOlI.I00iOIl;
/* 966 */                       if (networkRequestI00000oIO.getNetworkSpecifier() != null) {
/* 978 */                           I000II.I000iOII("NetworkRequests with NetworkSpecifiers set aren't supported.");
/* 981 */                           return null;
                                }
/* 970 */                       oIIOOo = new OIIOOo(networkRequestI00000oIO);
                            }
/* 994 */                   oIolIIO.I00iOIl = new IOo0o10i1IO(oIIOOo, oIIOlII0000oI00, z2, z4, z, z3, j2, j, IOOi0Ool1i.I00iio(linkedHashSet));
/* 996 */                   VarHandle.storeStoreFence();
/* 999 */                   return oIolIIO;
                        case 15:
/* 811 */                   return new OIolIiIOI1I(parcel);
                        case 16:
/* 805 */                   return new OIolio1l(new IliliOOliOi(parcel.readInt(), (Notification) ((Parcelable) parcel.readParcelable(Notification.class.getClassLoader(), Notification.class)), parcel.readInt()));
                        case 17:
/* 736 */                   OIoloo oIoloo = new OIoloo();
/* 743 */                   oIoloo.I00iOIl = parcel.readString();
/* 770 */                   oIoloo.I00iiI = new IliliOOliOi(parcel.readInt(), (Notification) parcel.readParcelable(OIoloo.class.getClassLoader()), parcel.readInt());
/* 772 */                   VarHandle.storeStoreFence();
/* 775 */                   return oIoloo;
                        case PoseLandmark.RIGHT_PINKY:
/* 730 */                   return new OIoo00(parcel.readString(), parcel.readInt());
                        case PoseLandmark.LEFT_INDEX:
/* 700 */                   OIoo0oi0lIO0 oIoo0oi0lIO0 = new OIoo0oi0lIO0();
/* 707 */                   oIoo0oi0lIO0.I00iOIl = parcel.readString();
/* 714 */                   oIoo0oi0lIO0.I00iiI = new OO00o1o(parcel);
/* 716 */                   VarHandle.storeStoreFence();
/* 719 */                   return oIoo0oi0lIO0;
                        case PoseLandmark.RIGHT_INDEX:
/* 630 */                   OIoo1iiOO1II oIoo1iiOO1II = new OIoo1iiOO1II();
/* 633 */                   int i4 = parcel.readInt();
/* 637 */                   byte[] bArrCreateByteArray = parcel.createByteArray();
/* 641 */                   if (bArrCreateByteArray != null) {
/* 643 */                       Ii11I1OOII1 ii11I1OOII1 = Ii11I1OOII1.I00000oOI;
/* 645 */                       ii11I1OOII1I00000oIO = il01ool0o.I00000oIO(bArrCreateByteArray);
/* 649 */                       if (ii11I1OOII1I00000oIO == null) {
/* 654 */                           ii11I1OOII1I00000oIO = Ii11I1OOII1.I00000oOI;
                                }
                            }
/* 657 */                   if (i4 == 1) {
/* 661 */                       o10o0o00 = new O10o0o00();
                            } else {
/* 665 */                       if (i4 == 2) {
/* 669 */                           o10o0OiIIll = new O10o0oOio1(ii11I1OOII1I00000oIO);
                                } else {
/* 675 */                           if (i4 != 3) {
/* 693 */                               I000II.I001IO000(Oi010OO0.I000oI1ioi(i4, "Unknown result type "));
/* 696 */                               return null;
                                    }
/* 679 */                           o10o0OiIIll = new O10o0OiIIll(ii11I1OOII1I00000oIO);
                                }
/* 672 */                       o10o0o00 = o10o0OiIIll;
                            }
/* 683 */                   oIoo1iiOO1II.I00iOIl = o10o0o00;
/* 685 */                   return oIoo1iiOO1II;
                        case PoseLandmark.LEFT_THUMB:
/* 542 */                   OIooIli10 oIooIli10 = new OIooIli10();
/* 547 */                   ClassLoader classLoader = OIooIli10.class.getClassLoader();
/* 565 */                   Network network = parcel.readInt() == 1 ? (Network) parcel.readParcelable(classLoader) : null;
/* 570 */                   if (parcel.readInt() == 1) {
/* 572 */                       Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
/* 579 */                       arrayList = new ArrayList(parcelableArray.length);
/* 584 */                       for (Parcelable parcelable : parcelableArray) {
/* 590 */                           arrayList.add((Uri) parcelable);
                                }
                            } else {
/* 596 */                       arrayList = null;
                            }
/* 609 */                   ArrayList<String> arrayListCreateStringArrayList = parcel.readInt() == 1 ? parcel.createStringArrayList() : null;
/* 612 */                   OlilOlOiI olilOlOiI = new OlilOlOiI();
/* 615 */                   oIooIli10.I00iOIl = olilOlOiI;
/* 617 */                   olilOlOiI.I00iio = network;
/* 619 */                   if (arrayList != null) {
/* 621 */                       olilOlOiI.I00iiO = arrayList;
                            }
/* 623 */                   if (arrayListCreateStringArrayList != null) {
/* 625 */                       olilOlOiI.I00iiI = arrayListCreateStringArrayList;
                            }
/* 627 */                   return oIooIli10;
                        case PoseLandmark.RIGHT_THUMB:
/* 536 */                   return new OIooO00(parcel.readDouble());
                        case PoseLandmark.LEFT_HIP:
/* 526 */                   return new OIooO1iiliI(parcel.readFloat());
                        case PoseLandmark.RIGHT_HIP:
/* 516 */                   return new OIooi1iOiOol(parcel.readInt());
                        case PoseLandmark.LEFT_KNEE:
/* 506 */                   return new OIool0l11(parcel.readLong());
                        case PoseLandmark.RIGHT_KNEE:
/* 483 */                   OIooloO1 oIooloO1 = new OIooloO1();
/* 490 */                   oIooloO1.I00iOIl = parcel.readString();
/* 497 */                   oIooloO1.I00iiI = new OIolIiIOI1I(parcel);
/* 499 */                   return oIooloO1;
                        case 27:
/* 368 */                   OO000l00O oO000l00O = new OO000l00O();
/* 383 */                   String string2 = parcel.readInt() == 1 ? parcel.readString() : null;
/* 390 */                   Il1OO1ilo0o1 il1OO1ilo0o1 = OO000l00O.I00iiI[parcel.readInt()];
/* 392 */                   int i5 = parcel.readInt();
/* 398 */                   ArrayList arrayList3 = new ArrayList(i5);
/* 403 */                   ClassLoader classLoader2 = OO000l00O.class.getClassLoader();
/* 408 */                   for (int i6 = 0; i6 < i5; i6++) {
/* 420 */                       arrayList3.add((i01OOOoo0iO) ((OO00l1Il) parcel.readParcelable(classLoader2)).I00iOIl);
                            }
/* 431 */                   if (parcel.readInt() == 1) {
/* 433 */                       int i7 = parcel.readInt();
/* 439 */                       ArrayList arrayList4 = new ArrayList(i7);
/* 443 */                       for (int i8 = 0; i8 < i7; i8++) {
/* 453 */                           arrayList4.add(((OO000l00O) parcel.readParcelable(classLoader2)).I00iOIl);
                                }
/* 459 */                       arrayList2 = arrayList4;
                            } else {
/* 461 */                       arrayList2 = null;
                            }
/* 464 */                   OIoooI0i01ol oIoooI0i01ol = new OIoooI0i01ol();
/* 467 */                   oIoooI0i01ol.I00000oIO = string2;
/* 469 */                   oIoooI0i01ol.I00000oOI = il1OO1ilo0o1;
/* 471 */                   oIoooI0i01ol.I0000Il00O = arrayList3;
/* 473 */                   oIoooI0i01ol.I0000O = arrayList2;
/* 475 */                   VarHandle.storeStoreFence();
/* 478 */                   oO000l00O.I00iOIl = oIoooI0i01ol;
/* 480 */                   return oO000l00O;
                        case PoseLandmark.RIGHT_ANKLE:
/* 62 */                    OO00Ii oO00Ii = new OO00Ii();
/* 69 */                    UUID uuidFromString = UUID.fromString(parcel.readString());
/* 77 */                    i01IOiO1lO i01ioio1loI000II = liIOOIo0.I000II(parcel.readInt());
/* 81 */                    byte[] bArrCreateByteArray2 = parcel.createByteArray();
/* 85 */                    if (bArrCreateByteArray2 != null) {
/* 87 */                        Ii11I1OOII1 ii11I1OOII12 = Ii11I1OOII1.I00000oOI;
/* 89 */                        ii11I1OOII1I00000oIO2 = il01ool0o.I00000oIO(bArrCreateByteArray2);
/* 93 */                        if (ii11I1OOII1I00000oIO2 == null) {
/* 98 */                            ii11I1OOII1I00000oIO2 = Ii11I1OOII1.I00000oOI;
                                }
                            }
/* 96 */                    Ii11I1OOII1 ii11I1OOII13 = ii11I1OOII1I00000oIO2;
/* 111 */                   HashSet hashSet = new HashSet(Arrays.asList(parcel.createStringArray()));
/* 114 */                   byte[] bArrCreateByteArray3 = parcel.createByteArray();
/* 118 */                   if (bArrCreateByteArray3 == null || (ii11I1OOII1I00000oIO3 = il01ool0o.I00000oIO(bArrCreateByteArray3)) == null) {
/* 129 */                       ii11I1OOII1I00000oIO3 = Ii11I1OOII1.I00000oOI;
                            }
/* 127 */                   Ii11I1OOII1 ii11I1OOII14 = ii11I1OOII1I00000oIO3;
/* 132 */                   int i9 = parcel.readInt();
/* 136 */                   int i10 = parcel.readInt();
/* 142 */                   OIIOlI oIIOlI2 = OIIOlI.I00iOIl;
/* 146 */                   LinkedHashSet linkedHashSet2 = new LinkedHashSet();
/* 153 */                   OIIOlI oIIOlII0000oI002 = liIOOIo0.I0000oI00(parcel.readInt());
/* 159 */                   OIIOOo oIIOOo2 = new OIIOOo(null);
/* 171 */                   boolean z5 = parcel.readInt() == 1;
/* 182 */                   boolean z6 = parcel.readInt() == 1;
/* 193 */                   boolean z7 = parcel.readInt() == 1;
/* 204 */                   boolean z8 = parcel.readInt() == 1;
/* 210 */                   if (parcel.readInt() == 1) {
/* 228 */                       for (IOo0iolo iOo0iolo2 : liIOOIo0.I00000oOI(parcel.createByteArray())) {
/* 249 */                           linkedHashSet2.add(new IOo0iolo(iOo0iolo2.I00000oOI, iOo0iolo2.I00000oIO));
/* 252 */                           str = str;
                                }
                            }
/* 257 */                   String str2 = str;
/* 259 */                   long j3 = parcel.readLong();
/* 263 */                   long j4 = parcel.readLong();
/* 272 */                   if (parcel.readInt() == 1) {
/* 282 */                       NetworkRequest networkRequestI00000oIO2 = l1il0l0IoOO1.I00000oIO(parcel.createIntArray(), parcel.createIntArray());
/* 286 */                       oIIOlII0000oI002 = OIIOlI.I00iOIl;
/* 292 */                       if (networkRequestI00000oIO2.getNetworkSpecifier() != null) {
/* 304 */                           I000II.I000iOII(str2);
/* 307 */                           return null;
                                }
/* 296 */                       oIIOOo2 = new OIIOOo(networkRequestI00000oIO2);
                            }
/* 362 */                   oO00Ii.I00iOIl = new i01Ii0ooO(uuidFromString, i01ioio1loI000II, hashSet, ii11I1OOII13, ii11I1OOII14, i9, i10, new IOo0o10i1IO(oIIOOo2, oIIOlII0000oI002, z6, z8, z5, z7, j4, j3, IOOi0Ool1i.I00iio(linkedHashSet2)), parcel.readLong(), parcel.readInt() == 1 ? new i01IOOI(parcel.readLong(), parcel.readLong()) : null, parcel.readLong(), parcel.readInt());
/* 364 */                   return oO00Ii;
                        default:
/* 17 */                    OO00i0l oO00i0l = new OO00i0l();
/* 26 */                    Parcelable[] parcelableArray2 = parcel.readParcelableArray(OO00i0l.class.getClassLoader());
/* 36 */                    oO00i0l.I00iOIl = new ArrayList(parcelableArray2.length);
/* 40 */                    for (Parcelable parcelable2 : parcelableArray2) {
/* 50 */                        oO00i0l.I00iOIl.add(((OO00Ii) parcelable2).I00iOIl);
                            }
/* 56 */                    VarHandle.storeStoreFence();
/* 59 */                    return oO00i0l;
                    }
                }

                @Override
                public final Object[] newArray(int i) {
                    switch (this.I00000oIO) {
                        case 0:
/* 93 */                    return new I11Oioio[i];
                        case 1:
/* 90 */                    return new I0IIOOO1O[i];
                        case 2:
/* 87 */                    return new I1I1O000iiI0[i];
                        case 3:
/* 84 */                    return new I1loioi1I0Ii[i];
                        case 4:
/* 81 */                    return new I1lolIOl[i];
                        case 5:
/* 78 */                    return new Ii1ooo[i];
                        case 6:
/* 75 */                    return new Ill1IIIIO[i];
                        case 7:
/* 72 */                    return new Ill1Oooli01I[i];
                        case 8:
/* 69 */                    return new Ill1oll1I0[i];
                        case 9:
/* 66 */                    return new IooiIli[i];
                        case 10:
/* 63 */                    return new O1Oo00ii00[i];
                        case 11:
/* 60 */                    return new O1il00oooo[i];
                        case 12:
/* 57 */                    return new OIIIlI1[i];
                        case 13:
/* 54 */                    return new ParcelImpl[i];
                        case 14:
/* 51 */                    return new OIolIIO[i];
                        case 15:
/* 48 */                    return new OIolIiIOI1I[i];
                        case 16:
/* 45 */                    return new OIolio1l[i];
                        case 17:
/* 42 */                    return new OIoloo[i];
                        case PoseLandmark.RIGHT_PINKY:
/* 39 */                    return new OIoo00[i];
                        case PoseLandmark.LEFT_INDEX:
/* 36 */                    return new OIoo0oi0lIO0[i];
                        case PoseLandmark.RIGHT_INDEX:
/* 33 */                    return new OIoo1iiOO1II[i];
                        case PoseLandmark.LEFT_THUMB:
/* 30 */                    return new OIooIli10[i];
                        case PoseLandmark.RIGHT_THUMB:
/* 27 */                    return new OIooO00[i];
                        case PoseLandmark.LEFT_HIP:
/* 24 */                    return new OIooO1iiliI[i];
                        case PoseLandmark.RIGHT_HIP:
/* 21 */                    return new OIooi1iOiOol[i];
                        case PoseLandmark.LEFT_KNEE:
/* 18 */                    return new OIool0l11[i];
                        case PoseLandmark.RIGHT_KNEE:
/* 15 */                    return new OIooloO1[i];
                        case 27:
/* 12 */                    return new OO000l00O[i];
                        case PoseLandmark.RIGHT_ANKLE:
/* 9 */                     return new OO00Ii[i];
                        default:
/* 6 */                     return new OO00i0l[i];
                    }
                }
            }

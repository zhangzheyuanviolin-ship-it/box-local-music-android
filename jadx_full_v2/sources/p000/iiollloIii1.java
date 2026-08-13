            package p000;

            import android.content.Intent;
            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import com.google.ai.edge.gallery.BuildConfig;
            import com.google.mlkit.vision.common.InputImage;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.util.HashMap;
            
            public abstract class iiollloIii1 extends iiI1l0 implements il000illiO {
                public static il000illiO asInterface(IBinder iBinder) {
/* 1 */             if (iBinder == null) {
/* 3 */                 return null;
                    }
/* 7 */             IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
                    return iInterfaceQueryLocalInterface instanceof il000illiO ? (il000illiO) iInterfaceQueryLocalInterface : new iioioiolo(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService", 11);
                }

                @Override
                public final boolean I00000oOI(int i, Parcel parcel, Parcel parcel2) {
                    boolean z;
/* 6 */             boolean z2 = false;
/* 9 */             il0IOO il00llli = null;
/* 9 */             il0lI0oo1 il0oll10 = null;
/* 9 */             il0IOO il00llli2 = null;
/* 9 */             il0IOO il00llli3 = null;
/* 9 */             il0IOO il00llli4 = null;
/* 9 */             il0IOO il00llli5 = null;
/* 9 */             il10Io00IlII il0o00io = null;
/* 9 */             il10Io00IlII il0o00io2 = null;
/* 9 */             il10Io00IlII il0o00io3 = null;
/* 9 */             il0IOO il00llli6 = null;
/* 9 */             il0IOO il00llli7 = null;
/* 9 */             il0IOO il00llli8 = null;
/* 9 */             il0IOO il00llli9 = null;
/* 9 */             il0IOO il00llli10 = null;
/* 9 */             il0IOO il00llli11 = null;
/* 9 */             il1OIOoloo il11o1io = null;
/* 9 */             il0IOO il00llli12 = null;
/* 9 */             il0IOO il00llli13 = null;
/* 9 */             il0IOO il00llli14 = null;
/* 9 */             il0IOO il00llli15 = null;
/* 9 */             il0IOO il00llli16 = null;
                    switch (i) {
                        case 1:
/* 1606 */                  IoOlilli0ol ioOlilli0olI00O0i0ii = OIOiOlIO01.I00O0i0ii(parcel.readStrongBinder());
/* 1616 */                  il1i11oOloil il1i11ooloil = (il1i11oOloil) iiIIoi1oIO1.I00000oIO(parcel, il1i11oOloil.CREATOR);
/* 1618 */                  long j = parcel.readLong();
/* 1622 */                  iiIIoi1oIO1.I0000O(parcel);
/* 1625 */                  initialize(ioOlilli0olI00O0i0ii, il1i11ooloil, j);
                            break;
                        case 2:
/* 1556 */                  String string = parcel.readString();
/* 1560 */                  String string2 = parcel.readString();
/* 1570 */                  Bundle bundle = (Bundle) iiIIoi1oIO1.I00000oIO(parcel, Bundle.CREATOR);
/* 1580 */                  boolean z3 = parcel.readInt() != 0;
/* 1589 */                  boolean z4 = parcel.readInt() != 0;
/* 1590 */                  long j2 = parcel.readLong();
/* 1594 */                  iiIIoi1oIO1.I0000O(parcel);
/* 1598 */                  logEvent(string, string2, bundle, z3, z4, j2);
                            break;
                        case 3:
/* 1500 */                  String string3 = parcel.readString();
/* 1504 */                  String string4 = parcel.readString();
/* 1515 */                  Bundle bundle2 = (Bundle) iiIIoi1oIO1.I00000oIO(parcel, Bundle.CREATOR);
/* 1517 */                  IBinder strongBinder = parcel.readStrongBinder();
/* 1521 */                  if (strongBinder != null) {
/* 1525 */                      IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
/* 1539 */                      il00llli = iInterfaceQueryLocalInterface instanceof il0IOO ? (il0IOO) iInterfaceQueryLocalInterface : new il00lllI(strongBinder);
                            }
/* 1523 */                  il0IOO il0ioo = il00llli;
/* 1543 */                  long j3 = parcel.readLong();
/* 1547 */                  iiIIoi1oIO1.I0000O(parcel);
/* 1551 */                  logEventAndBundle(string3, string4, bundle2, il0ioo, j3);
                            break;
                        case 4:
/* 1460 */                  String string5 = parcel.readString();
/* 1464 */                  String string6 = parcel.readString();
/* 1472 */                  IoOlilli0ol ioOlilli0olI00O0i0ii2 = OIOiOlIO01.I00O0i0ii(parcel.readStrongBinder());
/* 1476 */                  ClassLoader classLoader = iiIIoi1oIO1.I00000oIO;
/* 1486 */                  boolean z5 = parcel.readInt() != 0;
/* 1487 */                  long j4 = parcel.readLong();
/* 1491 */                  iiIIoi1oIO1.I0000O(parcel);
/* 1495 */                  setUserProperty(string5, string6, ioOlilli0olI00O0i0ii2, z5, j4);
                            break;
                        case 5:
/* 1408 */                  String string7 = parcel.readString();
/* 1412 */                  String string8 = parcel.readString();
/* 1416 */                  ClassLoader classLoader2 = iiIIoi1oIO1.I00000oIO;
/* 1426 */                  boolean z6 = parcel.readInt() != 0;
/* 1427 */                  IBinder strongBinder2 = parcel.readStrongBinder();
/* 1431 */                  if (strongBinder2 != null) {
/* 1434 */                      IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
/* 1448 */                      il00llli16 = iInterfaceQueryLocalInterface2 instanceof il0IOO ? (il0IOO) iInterfaceQueryLocalInterface2 : new il00lllI(strongBinder2);
                            }
/* 1451 */                  iiIIoi1oIO1.I0000O(parcel);
/* 1454 */                  getUserProperties(string7, string8, z6, il00llli16);
                            break;
                        case 6:
/* 1371 */                  String string9 = parcel.readString();
/* 1375 */                  IBinder strongBinder3 = parcel.readStrongBinder();
/* 1379 */                  if (strongBinder3 != null) {
/* 1382 */                      IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
/* 1396 */                      il00llli15 = iInterfaceQueryLocalInterface3 instanceof il0IOO ? (il0IOO) iInterfaceQueryLocalInterface3 : new il00lllI(strongBinder3);
                            }
/* 1399 */                  iiIIoi1oIO1.I0000O(parcel);
/* 1402 */                  getMaxUserProperties(string9, il00llli15);
                            break;
                        case 7:
/* 1355 */                  String string10 = parcel.readString();
/* 1359 */                  long j5 = parcel.readLong();
/* 1363 */                  iiIIoi1oIO1.I0000O(parcel);
/* 1366 */                  setUserId(string10, j5);
                            break;
                        case 8:
/* 1341 */                  Bundle bundle3 = (Bundle) iiIIoi1oIO1.I00000oIO(parcel, Bundle.CREATOR);
/* 1343 */                  long j6 = parcel.readLong();
/* 1347 */                  iiIIoi1oIO1.I0000O(parcel);
/* 1350 */                  setConditionalUserProperty(bundle3, j6);
                            break;
                        case 9:
/* 1311 */                  String string11 = parcel.readString();
/* 1315 */                  String string12 = parcel.readString();
/* 1325 */                  Bundle bundle4 = (Bundle) iiIIoi1oIO1.I00000oIO(parcel, Bundle.CREATOR);
/* 1327 */                  iiIIoi1oIO1.I0000O(parcel);
/* 1330 */                  clearConditionalUserProperty(string11, string12, bundle4);
                            break;
                        case 10:
/* 1271 */                  String string13 = parcel.readString();
/* 1275 */                  String string14 = parcel.readString();
/* 1279 */                  IBinder strongBinder4 = parcel.readStrongBinder();
/* 1283 */                  if (strongBinder4 != null) {
/* 1286 */                      IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
/* 1300 */                      il00llli14 = iInterfaceQueryLocalInterface4 instanceof il0IOO ? (il0IOO) iInterfaceQueryLocalInterface4 : new il00lllI(strongBinder4);
                            }
/* 1303 */                  iiIIoi1oIO1.I0000O(parcel);
/* 1306 */                  getConditionalUserProperties(string13, string14, il00llli14);
                            break;
                        case 11:
/* 1248 */                  ClassLoader classLoader3 = iiIIoi1oIO1.I00000oIO;
/* 1258 */                  boolean z7 = parcel.readInt() != 0;
/* 1259 */                  long j7 = parcel.readLong();
/* 1263 */                  iiIIoi1oIO1.I0000O(parcel);
/* 1266 */                  setMeasurementEnabled(z7, j7);
                            break;
                        case 12:
/* 1235 */                  long j8 = parcel.readLong();
/* 1239 */                  iiIIoi1oIO1.I0000O(parcel);
/* 1242 */                  resetAnalyticsData(j8);
                            break;
                        case 13:
/* 1223 */                  long j9 = parcel.readLong();
/* 1227 */                  iiIIoi1oIO1.I0000O(parcel);
/* 1230 */                  setMinimumSessionDuration(j9);
                            break;
                        case 14:
/* 1211 */                  long j10 = parcel.readLong();
/* 1215 */                  iiIIoi1oIO1.I0000O(parcel);
/* 1218 */                  setSessionTimeoutDuration(j10);
                            break;
                        case 15:
/* 1186 */                  IoOlilli0ol ioOlilli0olI00O0i0ii3 = OIOiOlIO01.I00O0i0ii(parcel.readStrongBinder());
/* 1190 */                  String string15 = parcel.readString();
/* 1194 */                  String string16 = parcel.readString();
/* 1198 */                  long j11 = parcel.readLong();
/* 1202 */                  iiIIoi1oIO1.I0000O(parcel);
/* 1206 */                  setCurrentScreen(ioOlilli0olI00O0i0ii3, string15, string16, j11);
                            break;
                        case 16:
/* 1150 */                  IBinder strongBinder5 = parcel.readStrongBinder();
/* 1154 */                  if (strongBinder5 != null) {
/* 1157 */                      IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
/* 1171 */                      il00llli13 = iInterfaceQueryLocalInterface5 instanceof il0IOO ? (il0IOO) iInterfaceQueryLocalInterface5 : new il00lllI(strongBinder5);
                            }
/* 1174 */                  iiIIoi1oIO1.I0000O(parcel);
/* 1177 */                  getCurrentScreenName(il00llli13);
                            break;
                        case 17:
/* 1118 */                  IBinder strongBinder6 = parcel.readStrongBinder();
/* 1122 */                  if (strongBinder6 != null) {
/* 1125 */                      IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
/* 1139 */                      il00llli12 = iInterfaceQueryLocalInterface6 instanceof il0IOO ? (il0IOO) iInterfaceQueryLocalInterface6 : new il00lllI(strongBinder6);
                            }
/* 1142 */                  iiIIoi1oIO1.I0000O(parcel);
/* 1145 */                  getCurrentScreenClass(il00llli12);
                            break;
                        case PoseLandmark.RIGHT_PINKY:
/* 1084 */                  IBinder strongBinder7 = parcel.readStrongBinder();
/* 1088 */                  if (strongBinder7 != null) {
/* 1093 */                      IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
/* 1107 */                      il11o1io = iInterfaceQueryLocalInterface7 instanceof il1OIOoloo ? (il1OIOoloo) iInterfaceQueryLocalInterface7 : new il11O1IO(strongBinder7, "com.google.android.gms.measurement.api.internal.IStringProvider", 11);
                            }
/* 1110 */                  iiIIoi1oIO1.I0000O(parcel);
/* 1113 */                  setInstanceIdProvider(il11o1io);
                            break;
                        case PoseLandmark.LEFT_INDEX:
/* 1052 */                  IBinder strongBinder8 = parcel.readStrongBinder();
/* 1056 */                  if (strongBinder8 != null) {
/* 1059 */                      IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
/* 1073 */                      il00llli11 = iInterfaceQueryLocalInterface8 instanceof il0IOO ? (il0IOO) iInterfaceQueryLocalInterface8 : new il00lllI(strongBinder8);
                            }
/* 1076 */                  iiIIoi1oIO1.I0000O(parcel);
/* 1079 */                  getCachedAppInstanceId(il00llli11);
                            break;
                        case PoseLandmark.RIGHT_INDEX:
/* 1020 */                  IBinder strongBinder9 = parcel.readStrongBinder();
/* 1024 */                  if (strongBinder9 != null) {
/* 1027 */                      IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
/* 1041 */                      il00llli10 = iInterfaceQueryLocalInterface9 instanceof il0IOO ? (il0IOO) iInterfaceQueryLocalInterface9 : new il00lllI(strongBinder9);
                            }
/* 1044 */                  iiIIoi1oIO1.I0000O(parcel);
/* 1047 */                  getAppInstanceId(il00llli10);
                            break;
                        case PoseLandmark.LEFT_THUMB:
/* 988 */                   IBinder strongBinder10 = parcel.readStrongBinder();
/* 992 */                   if (strongBinder10 != null) {
/* 995 */                       IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
/* 1009 */                      il00llli9 = iInterfaceQueryLocalInterface10 instanceof il0IOO ? (il0IOO) iInterfaceQueryLocalInterface10 : new il00lllI(strongBinder10);
                            }
/* 1012 */                  iiIIoi1oIO1.I0000O(parcel);
/* 1015 */                  getGmpAppId(il00llli9);
                            break;
                        case PoseLandmark.RIGHT_THUMB:
/* 956 */                   IBinder strongBinder11 = parcel.readStrongBinder();
/* 960 */                   if (strongBinder11 != null) {
/* 963 */                       IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
/* 977 */                       il00llli8 = iInterfaceQueryLocalInterface11 instanceof il0IOO ? (il0IOO) iInterfaceQueryLocalInterface11 : new il00lllI(strongBinder11);
                            }
/* 980 */                   iiIIoi1oIO1.I0000O(parcel);
/* 983 */                   generateEventId(il00llli8);
                            break;
                        case PoseLandmark.LEFT_HIP:
/* 940 */                   String string17 = parcel.readString();
/* 944 */                   long j12 = parcel.readLong();
/* 948 */                   iiIIoi1oIO1.I0000O(parcel);
/* 951 */                   beginAdUnitExposure(string17, j12);
                            break;
                        case PoseLandmark.RIGHT_HIP:
/* 924 */                   String string18 = parcel.readString();
/* 928 */                   long j13 = parcel.readLong();
/* 932 */                   iiIIoi1oIO1.I0000O(parcel);
/* 935 */                   endAdUnitExposure(string18, j13);
                            break;
                        case PoseLandmark.LEFT_KNEE:
/* 908 */                   IoOlilli0ol ioOlilli0olI00O0i0ii4 = OIOiOlIO01.I00O0i0ii(parcel.readStrongBinder());
/* 912 */                   long j14 = parcel.readLong();
/* 916 */                   iiIIoi1oIO1.I0000O(parcel);
/* 919 */                   onActivityStarted(ioOlilli0olI00O0i0ii4, j14);
                            break;
                        case PoseLandmark.RIGHT_KNEE:
/* 888 */                   IoOlilli0ol ioOlilli0olI00O0i0ii5 = OIOiOlIO01.I00O0i0ii(parcel.readStrongBinder());
/* 892 */                   long j15 = parcel.readLong();
/* 896 */                   iiIIoi1oIO1.I0000O(parcel);
/* 899 */                   onActivityStopped(ioOlilli0olI00O0i0ii5, j15);
                            break;
                        case 27:
/* 860 */                   IoOlilli0ol ioOlilli0olI00O0i0ii6 = OIOiOlIO01.I00O0i0ii(parcel.readStrongBinder());
/* 870 */                   Bundle bundle5 = (Bundle) iiIIoi1oIO1.I00000oIO(parcel, Bundle.CREATOR);
/* 872 */                   long j16 = parcel.readLong();
/* 876 */                   iiIIoi1oIO1.I0000O(parcel);
/* 879 */                   onActivityCreated(ioOlilli0olI00O0i0ii6, bundle5, j16);
                            break;
                        case PoseLandmark.RIGHT_ANKLE:
/* 840 */                   IoOlilli0ol ioOlilli0olI00O0i0ii7 = OIOiOlIO01.I00O0i0ii(parcel.readStrongBinder());
/* 844 */                   long j17 = parcel.readLong();
/* 848 */                   iiIIoi1oIO1.I0000O(parcel);
/* 851 */                   onActivityDestroyed(ioOlilli0olI00O0i0ii7, j17);
                            break;
                        case PoseLandmark.LEFT_HEEL:
/* 820 */                   IoOlilli0ol ioOlilli0olI00O0i0ii8 = OIOiOlIO01.I00O0i0ii(parcel.readStrongBinder());
/* 824 */                   long j18 = parcel.readLong();
/* 828 */                   iiIIoi1oIO1.I0000O(parcel);
/* 831 */                   onActivityPaused(ioOlilli0olI00O0i0ii8, j18);
                            break;
                        case 30:
/* 800 */                   IoOlilli0ol ioOlilli0olI00O0i0ii9 = OIOiOlIO01.I00O0i0ii(parcel.readStrongBinder());
/* 804 */                   long j19 = parcel.readLong();
/* 808 */                   iiIIoi1oIO1.I0000O(parcel);
/* 811 */                   onActivityResumed(ioOlilli0olI00O0i0ii9, j19);
                            break;
                        case PoseLandmark.LEFT_FOOT_INDEX:
/* 756 */                   IoOlilli0ol ioOlilli0olI00O0i0ii10 = OIOiOlIO01.I00O0i0ii(parcel.readStrongBinder());
/* 760 */                   IBinder strongBinder12 = parcel.readStrongBinder();
/* 764 */                   if (strongBinder12 != null) {
/* 767 */                       IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
/* 781 */                       il00llli7 = iInterfaceQueryLocalInterface12 instanceof il0IOO ? (il0IOO) iInterfaceQueryLocalInterface12 : new il00lllI(strongBinder12);
                            }
/* 784 */                   long j20 = parcel.readLong();
/* 788 */                   iiIIoi1oIO1.I0000O(parcel);
/* 791 */                   onActivitySaveInstanceState(ioOlilli0olI00O0i0ii10, il00llli7, j20);
                            break;
                        case 32:
/* 714 */                   Bundle bundle6 = (Bundle) iiIIoi1oIO1.I00000oIO(parcel, Bundle.CREATOR);
/* 716 */                   IBinder strongBinder13 = parcel.readStrongBinder();
/* 720 */                   if (strongBinder13 != null) {
/* 723 */                       IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
/* 737 */                       il00llli6 = iInterfaceQueryLocalInterface13 instanceof il0IOO ? (il0IOO) iInterfaceQueryLocalInterface13 : new il00lllI(strongBinder13);
                            }
/* 740 */                   long j21 = parcel.readLong();
/* 744 */                   iiIIoi1oIO1.I0000O(parcel);
/* 747 */                   performAction(bundle6, il00llli6, j21);
                            break;
                        case 33:
/* 667 */                   int i2 = parcel.readInt();
/* 671 */                   String string19 = parcel.readString();
/* 679 */                   IoOlilli0ol ioOlilli0olI00O0i0ii11 = OIOiOlIO01.I00O0i0ii(parcel.readStrongBinder());
/* 687 */                   IoOlilli0ol ioOlilli0olI00O0i0ii12 = OIOiOlIO01.I00O0i0ii(parcel.readStrongBinder());
/* 695 */                   IoOlilli0ol ioOlilli0olI00O0i0ii13 = OIOiOlIO01.I00O0i0ii(parcel.readStrongBinder());
/* 699 */                   iiIIoi1oIO1.I0000O(parcel);
/* 703 */                   logHealthData(i2, string19, ioOlilli0olI00O0i0ii11, ioOlilli0olI00O0i0ii12, ioOlilli0olI00O0i0ii13);
                            break;
                        case 34:
/* 635 */                   IBinder strongBinder14 = parcel.readStrongBinder();
/* 639 */                   if (strongBinder14 != null) {
/* 642 */                       IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
/* 656 */                       il0o00io3 = iInterfaceQueryLocalInterface14 instanceof il10Io00IlII ? (il10Io00IlII) iInterfaceQueryLocalInterface14 : new il0o00iO(strongBinder14);
                            }
/* 659 */                   iiIIoi1oIO1.I0000O(parcel);
/* 662 */                   setEventInterceptor(il0o00io3);
                            break;
                        case InputImage.IMAGE_FORMAT_YUV_420_888:
/* 603 */                   IBinder strongBinder15 = parcel.readStrongBinder();
/* 607 */                   if (strongBinder15 != null) {
/* 610 */                       IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
/* 624 */                       il0o00io2 = iInterfaceQueryLocalInterface15 instanceof il10Io00IlII ? (il10Io00IlII) iInterfaceQueryLocalInterface15 : new il0o00iO(strongBinder15);
                            }
/* 627 */                   iiIIoi1oIO1.I0000O(parcel);
/* 630 */                   registerOnMeasurementEventListener(il0o00io2);
                            break;
                        case 36:
/* 571 */                   IBinder strongBinder16 = parcel.readStrongBinder();
/* 575 */                   if (strongBinder16 != null) {
/* 578 */                       IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
/* 592 */                       il0o00io = iInterfaceQueryLocalInterface16 instanceof il10Io00IlII ? (il10Io00IlII) iInterfaceQueryLocalInterface16 : new il0o00iO(strongBinder16);
                            }
/* 595 */                   iiIIoi1oIO1.I0000O(parcel);
/* 598 */                   unregisterOnMeasurementEventListener(il0o00io);
                            break;
                        case 37:
/* 559 */                   HashMap hashMap = parcel.readHashMap(iiIIoi1oIO1.I00000oIO);
/* 563 */                   iiIIoi1oIO1.I0000O(parcel);
/* 566 */                   initForTests(hashMap);
                            break;
                        case 38:
/* 521 */                   IBinder strongBinder17 = parcel.readStrongBinder();
/* 525 */                   if (strongBinder17 != null) {
/* 528 */                       IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
/* 542 */                       il00llli5 = iInterfaceQueryLocalInterface17 instanceof il0IOO ? (il0IOO) iInterfaceQueryLocalInterface17 : new il00lllI(strongBinder17);
                            }
/* 545 */                   int i3 = parcel.readInt();
/* 549 */                   iiIIoi1oIO1.I0000O(parcel);
/* 552 */                   getTestFlag(il00llli5, i3);
                            break;
                        case 39:
/* 502 */                   ClassLoader classLoader4 = iiIIoi1oIO1.I00000oIO;
/* 512 */                   boolean z8 = parcel.readInt() != 0;
/* 513 */                   iiIIoi1oIO1.I0000O(parcel);
/* 516 */                   setDataCollectionEnabled(z8);
                            break;
                        case 40:
/* 469 */                   IBinder strongBinder18 = parcel.readStrongBinder();
/* 473 */                   if (strongBinder18 != null) {
/* 476 */                       IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
/* 490 */                       il00llli4 = iInterfaceQueryLocalInterface18 instanceof il0IOO ? (il0IOO) iInterfaceQueryLocalInterface18 : new il00lllI(strongBinder18);
                            }
/* 493 */                   iiIIoi1oIO1.I0000O(parcel);
/* 496 */                   isDataCollectionEnabled(il00llli4);
                            break;
                        case 41:
                        case 47:
                        case 49:
                        default:
/* 6 */                     return false;
                        case 42:
/* 459 */                   Bundle bundle7 = (Bundle) iiIIoi1oIO1.I00000oIO(parcel, Bundle.CREATOR);
/* 461 */                   iiIIoi1oIO1.I0000O(parcel);
/* 464 */                   setDefaultEventParameters(bundle7);
                            break;
                        case 43:
/* 441 */                   long j22 = parcel.readLong();
/* 445 */                   iiIIoi1oIO1.I0000O(parcel);
/* 448 */                   clearMeasurementEnabled(j22);
                            break;
                        case 44:
/* 427 */                   Bundle bundle8 = (Bundle) iiIIoi1oIO1.I00000oIO(parcel, Bundle.CREATOR);
/* 429 */                   long j23 = parcel.readLong();
/* 433 */                   iiIIoi1oIO1.I0000O(parcel);
/* 436 */                   setConsent(bundle8, j23);
                            break;
                        case BuildConfig.VERSION_CODE:
/* 407 */                   Bundle bundle9 = (Bundle) iiIIoi1oIO1.I00000oIO(parcel, Bundle.CREATOR);
/* 409 */                   long j24 = parcel.readLong();
/* 413 */                   iiIIoi1oIO1.I0000O(parcel);
/* 416 */                   setConsentThirdParty(bundle9, j24);
                            break;
                        case 46:
/* 369 */                   IBinder strongBinder19 = parcel.readStrongBinder();
/* 373 */                   if (strongBinder19 != null) {
/* 376 */                       IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
/* 390 */                       il00llli3 = iInterfaceQueryLocalInterface19 instanceof il0IOO ? (il0IOO) iInterfaceQueryLocalInterface19 : new il00lllI(strongBinder19);
                            }
/* 393 */                   iiIIoi1oIO1.I0000O(parcel);
/* 396 */                   getSessionId(il00llli3);
                            break;
                        case 48:
/* 359 */                   Intent intent = (Intent) iiIIoi1oIO1.I00000oIO(parcel, Intent.CREATOR);
/* 361 */                   iiIIoi1oIO1.I0000O(parcel);
/* 364 */                   setSgtmDebugInfo(intent);
                            break;
                        case 50:
/* 330 */                   il1l0io1O il1l0io1o = (il1l0io1O) iiIIoi1oIO1.I00000oIO(parcel, il1l0io1O.CREATOR);
/* 332 */                   String string20 = parcel.readString();
/* 336 */                   String string21 = parcel.readString();
/* 340 */                   long j25 = parcel.readLong();
/* 344 */                   iiIIoi1oIO1.I0000O(parcel);
/* 348 */                   setCurrentScreenByScionActivityInfo(il1l0io1o, string20, string21, j25);
                            break;
                        case 51:
/* 310 */                   il1l0io1O il1l0io1o2 = (il1l0io1O) iiIIoi1oIO1.I00000oIO(parcel, il1l0io1O.CREATOR);
/* 312 */                   long j26 = parcel.readLong();
/* 316 */                   iiIIoi1oIO1.I0000O(parcel);
/* 319 */                   onActivityStartedByScionActivityInfo(il1l0io1o2, j26);
                            break;
                        case 52:
/* 290 */                   il1l0io1O il1l0io1o3 = (il1l0io1O) iiIIoi1oIO1.I00000oIO(parcel, il1l0io1O.CREATOR);
/* 292 */                   long j27 = parcel.readLong();
/* 296 */                   iiIIoi1oIO1.I0000O(parcel);
/* 299 */                   onActivityStoppedByScionActivityInfo(il1l0io1o3, j27);
                            break;
                        case 53:
/* 262 */                   il1l0io1O il1l0io1o4 = (il1l0io1O) iiIIoi1oIO1.I00000oIO(parcel, il1l0io1O.CREATOR);
/* 270 */                   Bundle bundle10 = (Bundle) iiIIoi1oIO1.I00000oIO(parcel, Bundle.CREATOR);
/* 272 */                   long j28 = parcel.readLong();
/* 276 */                   iiIIoi1oIO1.I0000O(parcel);
/* 279 */                   onActivityCreatedByScionActivityInfo(il1l0io1o4, bundle10, j28);
                            break;
                        case 54:
/* 242 */                   il1l0io1O il1l0io1o5 = (il1l0io1O) iiIIoi1oIO1.I00000oIO(parcel, il1l0io1O.CREATOR);
/* 244 */                   long j29 = parcel.readLong();
/* 248 */                   iiIIoi1oIO1.I0000O(parcel);
/* 251 */                   onActivityDestroyedByScionActivityInfo(il1l0io1o5, j29);
                            break;
                        case 55:
/* 222 */                   il1l0io1O il1l0io1o6 = (il1l0io1O) iiIIoi1oIO1.I00000oIO(parcel, il1l0io1O.CREATOR);
/* 224 */                   long j30 = parcel.readLong();
/* 228 */                   iiIIoi1oIO1.I0000O(parcel);
/* 231 */                   onActivityPausedByScionActivityInfo(il1l0io1o6, j30);
                            break;
                        case 56:
/* 202 */                   il1l0io1O il1l0io1o7 = (il1l0io1O) iiIIoi1oIO1.I00000oIO(parcel, il1l0io1O.CREATOR);
/* 204 */                   long j31 = parcel.readLong();
/* 208 */                   iiIIoi1oIO1.I0000O(parcel);
/* 211 */                   onActivityResumedByScionActivityInfo(il1l0io1o7, j31);
                            break;
                        case 57:
/* 158 */                   il1l0io1O il1l0io1o8 = (il1l0io1O) iiIIoi1oIO1.I00000oIO(parcel, il1l0io1O.CREATOR);
/* 160 */                   IBinder strongBinder20 = parcel.readStrongBinder();
/* 164 */                   if (strongBinder20 != null) {
/* 167 */                       IInterface iInterfaceQueryLocalInterface20 = strongBinder20.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
/* 181 */                       il00llli2 = iInterfaceQueryLocalInterface20 instanceof il0IOO ? (il0IOO) iInterfaceQueryLocalInterface20 : new il00lllI(strongBinder20);
                            }
/* 184 */                   long j32 = parcel.readLong();
/* 188 */                   iiIIoi1oIO1.I0000O(parcel);
/* 191 */                   onActivitySaveInstanceStateByScionActivityInfo(il1l0io1o8, il00llli2, j32);
                            break;
                        case 58:
/* 118 */                   IBinder strongBinder21 = parcel.readStrongBinder();
/* 122 */                   if (strongBinder21 != null) {
/* 127 */                       IInterface iInterfaceQueryLocalInterface21 = strongBinder21.queryLocalInterface("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
/* 141 */                       il0oll10 = iInterfaceQueryLocalInterface21 instanceof il0lI0oo1 ? (il0lI0oo1) iInterfaceQueryLocalInterface21 : new il0Oll10(strongBinder21, "com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback", 11);
                            }
/* 144 */                   iiIIoi1oIO1.I0000O(parcel);
/* 147 */                   retrieveAndUploadBatches(il0oll10);
                            break;
                        case 59:
/* 65 */                    String string22 = parcel.readString();
/* 69 */                    String string23 = parcel.readString();
/* 80 */                    Bundle bundle11 = (Bundle) iiIIoi1oIO1.I00000oIO(parcel, Bundle.CREATOR);
/* 86 */                    if (parcel.readInt() != 0) {
/* 88 */                        z = false;
/* 89 */                        z2 = true;
                            } else {
/* 91 */                        z = false;
                            }
/* 100 */                   boolean z9 = parcel.readInt() != 0 ? true : z;
/* 101 */                   long j33 = parcel.readLong();
/* 105 */                   long j34 = parcel.readLong();
/* 109 */                   iiIIoi1oIO1.I0000O(parcel);
/* 113 */                   logEventWithElapsedTime(string22, string23, bundle11, z2, z9, j33, j34);
                            break;
                        case 60:
/* 34 */                    IoOlilli0ol ioOlilli0olI00O0i0ii14 = OIOiOlIO01.I00O0i0ii(parcel.readStrongBinder());
/* 44 */                    il1i11oOloil il1i11ooloil2 = (il1i11oOloil) iiIIoi1oIO1.I00000oIO(parcel, il1i11oOloil.CREATOR);
/* 48 */                    long j35 = parcel.readLong();
/* 52 */                    long j36 = parcel.readLong();
/* 56 */                    iiIIoi1oIO1.I0000O(parcel);
/* 60 */                    initializeWithElapsedTime(ioOlilli0olI00O0i0ii14, il1i11ooloil2, j35, j36);
                            break;
                        case 61:
/* 14 */                    long j37 = parcel.readLong();
/* 18 */                    long j38 = parcel.readLong();
/* 22 */                    iiIIoi1oIO1.I0000O(parcel);
/* 25 */                    resetAnalyticsDataWithElapsedTime(j37, j38);
                            break;
                    }
/* 1628 */          parcel2.writeNoException();
/* 5 */             return true;
                }
            }

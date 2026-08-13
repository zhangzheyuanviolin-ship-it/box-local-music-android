            package p000;

            import android.app.ActivityManager;
            import android.app.AlarmManager;
            import android.content.Context;
            import android.database.sqlite.SQLiteDatabase;
            import android.os.Process;
            import android.util.Log;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.RandomAccess;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.ScheduledFuture;
            
            public final class lOii1o implements Runnable {
                public final int I00iOIl;
                public Object I00iiI;

                public lOii1o(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:175:0x07be  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void run() {
                    ScheduledFuture scheduledFuture;
/* 5 */             double d = 50.0d;
/* 7 */             double d2 = 75.0d;
/* 12 */            double d3 = 100.0d;
/* 22 */            int i = 3;
/* 23 */            i1liliil11 i1liliil11Var = null;
                    switch (this.I00iOIl) {
                        case 0:
/* 2087 */                  lOliOlO1Io loliolo1io = ((lOl001Iii) ((l0iOoII1Il) this.I00iiI).I00iiO).I00iiO;
/* 2093 */                  l0o10OoO0 l0o10ooo0 = ((l0olllO1i) loliolo1io.I00iOIl).I00io1l;
/* 2095 */                  l0olllO1i.I000II(l0o10ooo0);
/* 2101 */                  lOilIOO loilioo = new lOilIOO(0);
/* 2104 */                  loilioo.I00iiI = loliolo1io;
/* 2106 */                  VarHandle.storeStoreFence();
/* 2109 */                  l0o10ooo0.I010o0o0oO(loilioo);
/* 2112 */                  return;
                        case 1:
/* 1849 */                  li01Ol0i0I li01ol0i0i = (li01Ol0i0I) this.I00iiI;
/* 1855 */                  li10O1l0 li10o1l0 = (li10O1l0) li01ol0i0i.I00iiO.I00iiO;
/* 1857 */                  li10o1l0.I010II();
/* 1862 */                  l0olllO1i l0olllo1i = (l0olllO1i) li10o1l0.I00iOIl;
/* 1864 */                  l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 1866 */                  Context context = l0olllo1i.I00iOIl;
/* 1868 */                  l0olllO1i.I000II(l01o0io1ooo0);
/* 1875 */                  l01o0io1ooo0.I00lli11.I00000oOI("Application going to the background");
/* 1878 */                  l0Oi0o l0oi0o = l0olllo1i.I00ilI0I1;
/* 1880 */                  l0olllO1i.I0000oI00(l0oi0o);
/* 1886 */                  l0oi0o.I00oII.I00000oOI(true);
/* 1889 */                  li10o1l0.I010II();
/* 1892 */                  li10o1l0.I00iio = true;
/* 1894 */                  iIl1iil iil1iil = l0olllo1i.I00iio;
/* 1900 */                  if (!iil1iil.I0111i()) {
/* 1902 */                      long j = li01ol0i0i.I00iiI;
/* 1904 */                      OooI11loO0I oooI11loO0I = li10o1l0.I00ilO0;
/* 1907 */                      oooI11loO0I.I0000oI00(j, false, false);
/* 1914 */                      ((li0O100iO01) oooI11loO0I.I00iiO).I0000Il00O();
                            }
/* 1917 */                  long j2 = li01ol0i0i.I00iOIl;
/* 1919 */                  l0olllO1i.I000II(l01o0io1ooo0);
/* 1930 */                  l01o0io1ooo0.I00ll1.I0000Il00O("Application backgrounded at: timestamp_millis", Long.valueOf(j2));
/* 1933 */                  lIl1O1li lil1o1li = l0olllo1i.I00lli11;
/* 1935 */                  l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 1938 */                  lil1o1li.I010II();
/* 1943 */                  l0olllO1i l0olllo1i2 = (l0olllO1i) lil1o1li.I00iOIl;
/* 1945 */                  lil1o1li.I010OIo1l();
/* 1948 */                  lOliOlO1Io loliolo1ioI000OOo1O = l0olllo1i2.I000OOo1O();
/* 1952 */                  loliolo1ioI000OOo1O.I010II();
/* 1955 */                  loliolo1ioI000OOo1O.I010OIo1l();
/* 1962 */                  if (loliolo1ioI000OOo1O.I010l1ol111()) {
/* 1969 */                      lioil0ilIOi lioil0ilioi = ((l0olllO1i) loliolo1ioI000OOo1O.I00iOIl).I00l0I0l0lO1;
/* 1971 */                      l0olllO1i.I0000oI00(lioil0ilioi);
/* 1981 */                      if (lioil0ilioi.I01IlIoOI() >= 242600) {
                                }
                            } else {
/* 1983 */                      lOliOlO1Io loliolo1ioI000OOo1O2 = l0olllo1i2.I000OOo1O();
/* 1987 */                      loliolo1ioI000OOo1O2.I010II();
/* 1990 */                      loliolo1ioI000OOo1O2.I010OIo1l();
/* 1994 */                      lli10iI lli10iiI011IO1I11OI = loliolo1ioI000OOo1O2.I011IO1I11OI(true);
/* 2002 */                      l0001OI0 l0001oi0 = new l0001OI0(9);
/* 2005 */                      l0001oi0.I00iiI = lli10iiI011IO1I11OI;
/* 2007 */                      l0001oi0.I00iiO = loliolo1ioI000OOo1O2;
/* 2009 */                      VarHandle.storeStoreFence();
/* 2012 */                      loliolo1ioI000OOo1O2.I0110o(l0001oi0);
                            }
/* 2022 */                  if (iil1iil.I01101IOlO(null, iol1II1ii1i.I00oooO)) {
/* 2024 */                      lioil0ilIOi lioil0ilioi2 = l0olllo1i.I00l0I0l0lO1;
/* 2026 */                      l0olllO1i.I0000oI00(lioil0ilioi2);
/* 2050 */                      long jI010lI0oi = lioil0ilioi2.I01II10(context.getPackageName(), iil1iil.I00iiO) ? 1000L : iil1iil.I010lI0oi(context.getPackageName(), iol1II1ii1i.I00II0oii1o);
/* 2054 */                      l0olllO1i.I000II(l01o0io1ooo0);
/* 2065 */                      l01o0io1ooo0.I00lll10.I0000Il00O("[sgtm] Scheduling batch upload with minimum latency in millis", Long.valueOf(jI010lI0oi));
/* 2070 */                      l0olllO1i.I0000O(l0olllo1i.I00oO101o);
/* 2075 */                      l0olllo1i.I00oO101o.I010ioo(jI010lI0oi);
/* 2078 */                      return;
                            }
/* 2078 */                  return;
                        case 2:
/* 1430 */                  lilOOl0 lilool0 = (lilOOl0) this.I00iiI;
/* 1436 */                  lilool0.I00iOIl().I010II();
/* 1443 */                  i0O1lIi1O0IO i0o1lii1o0io = new i0O1lIi1O0IO(8);
/* 1448 */                  i0o1lii1o0io.I00iiI = lilool0.I00ll1;
/* 1450 */                  VarHandle.storeStoreFence();
/* 1453 */                  lilool0.I00li1OI = i0o1lii1o0io;
/* 1457 */                  iOl1lOo1IO iol1loo1io = new iOl1lOo1IO(lilool0);
/* 1464 */                  l0olllO1i l0olllo1i3 = (l0olllO1i) iol1loo1io.I00iOIl;
/* 1471 */                  iol1loo1io.I00ilI0I1 = new li1iIiOi10o(l0olllo1i3.I00li1OI);
/* 1480 */                  iol1loo1io.I00iio = new iOio0o1oi1I(iol1loo1io, l0olllo1i3.I00iOIl);
/* 1482 */                  VarHandle.storeStoreFence();
/* 1485 */                  iol1loo1io.I010i10l();
/* 1488 */                  lilool0.I00iiO = iol1loo1io;
/* 1490 */                  l0l1ol11 l0l1ol11Var = lilool0.I00iOIl;
/* 1492 */                  iIl1iil iil1iilI00Ol1ll1 = lilool0.I00Ol1ll1();
/* 1496 */                  lII0I0I000I.I000II(l0l1ol11Var);
/* 1499 */                  iil1iilI00Ol1ll1.I00iio = l0l1ol11Var;
/* 1503 */                  lOloIl1o001 loloil1o001 = new lOloIl1o001(lilool0);
/* 1511 */                  loloil1o001.I00iio = new HashMap();
/* 1517 */                  l0olllO1i l0olllo1i4 = (l0olllO1i) loloil1o001.I00iOIl;
/* 1519 */                  l0Oi0o l0oi0o2 = l0olllo1i4.I00ilI0I1;
/* 1521 */                  l0olllO1i.I0000oI00(l0oi0o2);
/* 1531 */                  loloil1o001.I00ilI0I1 = new l0O0o010I(l0oi0o2, "last_delete_stale", 0L);
/* 1535 */                  l0Oi0o l0oi0o3 = l0olllo1i4.I00ilI0I1;
/* 1537 */                  l0olllO1i.I0000oI00(l0oi0o3);
/* 1545 */                  loloil1o001.I00ilO0 = new l0O0o010I(l0oi0o3, "last_delete_stale_batch", 0L);
/* 1554 */                  loloil1o001.I00io1l = new l0O0o010I(l0oi0o3, "backoff", 0L);
/* 1563 */                  loloil1o001.I00ioIO = new l0O0o010I(l0oi0o3, "last_upload", 0L);
/* 1572 */                  loloil1o001.I00l0I0l0lO1 = new l0O0o010I(l0oi0o3, "last_upload_attempt", 0L);
/* 1581 */                  loloil1o001.I00l0OO0IO = new l0O0o010I(l0oi0o3, "midnight_offset", 0L);
/* 1583 */                  VarHandle.storeStoreFence();
/* 1586 */                  loloil1o001.I010i10l();
/* 1589 */                  lilool0.I00l0I0l0lO1 = loloil1o001;
/* 1593 */                  i1lioiII i1lioiii = new i1lioiII(lilool0);
/* 1596 */                  i1lioiii.I010i10l();
/* 1599 */                  lilool0.I00ilO0 = i1lioiii;
/* 1604 */                  l0I1IOo l0i1ioo = new l0I1IOo(lilool0, 1);
/* 1607 */                  l0i1ioo.I010i10l();
/* 1610 */                  lilool0.I00ioIO = l0i1ioo;
/* 1614 */                  liI1IolOl lii1iolol = new liI1IolOl(lilool0);
/* 1631 */                  lii1iolol.I00iio = (AlarmManager) ((l0olllO1i) lii1iolol.I00iOIl).I00iOIl.getSystemService("alarm");
/* 1633 */                  VarHandle.storeStoreFence();
/* 1636 */                  lii1iolol.I010i10l();
/* 1639 */                  lilool0.I00ilI0I1 = lii1iolol;
/* 1643 */                  l0IilI01 l0iili01 = new l0IilI01();
/* 1646 */                  l0iili01.I00000oIO = lilool0;
/* 1648 */                  VarHandle.storeStoreFence();
/* 1651 */                  lilool0.I00iio = l0iili01;
/* 1657 */                  if (lilool0.I00oI0i != lilool0.I00oII) {
/* 1679 */                      lilool0.I00II0oii1o().I00ilO0.I0000O(Integer.valueOf(lilool0.I00oI0i), "Not all upload components initialized", Integer.valueOf(lilool0.I00oII));
                            }
/* 1685 */                  lilool0.I00lli11.set(true);
/* 1696 */                  lilool0.I00II0oii1o().I00lll10.I00000oOI("UploadController is now fully initialized");
/* 1703 */                  lilool0.I00iOIl().I010II();
/* 1706 */                  iOl1lOo1IO iol1loo1io2 = lilool0.I00iiO;
/* 1708 */                  lilOOl0.I00O0o1oo(iol1loo1io2);
/* 1711 */                  iol1loo1io2.I010oio1OO0();
/* 1714 */                  iOl1lOo1IO iol1loo1io3 = lilool0.I00iiO;
/* 1716 */                  lilOOl0.I00O0o1oo(iol1loo1io3);
/* 1719 */                  iol1loo1io3.I010II();
/* 1722 */                  iol1loo1io3.I010OIo1l();
/* 1729 */                  if (iol1loo1io3.I01IlIoOI()) {
/* 1731 */                      iol01I0001 iol01i0001 = iol1II1ii1i.I00li1OI;
/* 1748 */                      if (((Long) iol01i0001.I00000oIO(null)).longValue() != 0) {
/* 1751 */                          SQLiteDatabase sQLiteDatabaseI01Io11IiiiO = iol1loo1io3.I01Io11IiiiO();
/* 1757 */                          l0olllO1i l0olllo1i5 = (l0olllO1i) iol1loo1io3.I00iOIl;
/* 1761 */                          l0olllo1i5.I00li1OI.getClass();
/* 1789 */                          int iDelete = sQLiteDatabaseI01Io11IiiiO.delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(iol01i0001.I00000oIO(null))});
/* 1793 */                          if (iDelete > 0) {
/* 1795 */                              l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i5.I00ilO0;
/* 1797 */                              l0olllO1i.I000II(l01o0io1ooo02);
/* 1808 */                              l01o0io1ooo02.I00lll10.I0000Il00O("Deleted stale trigger uris. rowsDeleted", Integer.valueOf(iDelete));
                                    }
                                }
                            }
/* 1823 */                  if (lilool0.I00l0I0l0lO1.I00ioIO.I00000oIO() == 0) {
/* 1827 */                      l0O0o010I l0o0o010i = lilool0.I00l0I0l0lO1.I00ioIO;
/* 1833 */                      lilool0.I00IoO0().getClass();
/* 1840 */                      l0o0o010i.I00000oOI(System.currentTimeMillis());
                            }
/* 1843 */                  lilool0.I00Io1lO();
/* 1846 */                  return;
                        case 3:
/* 1427 */                  throw new RuntimeException(((ExecutionException) this.I00iiI).getCause());
                        case 4:
                            try {
/* 1401 */                      IlloOoiiO.I00000oIO((IlOooOIi1o) this.I00iiI);
/* 1413 */                      return;
                            } catch (Exception e) {
/* 1410 */                      Log.w("PhFlagUpdateRegistry", "Failed to register flag update listener which may lead to stale flags.", e);
/* 1413 */                      return;
                            }
                        case 5:
/* 1307 */                  ((ll1ooI1iI) this.I00iiI).getClass();
/* 1314 */                  ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                            try {
/* 1317 */                      ActivityManager.getMyMemoryState(runningAppProcessInfo);
/* 1320 */                      int i2 = runningAppProcessInfo.importance;
/* 1334 */                      StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 17);
/* 1339 */                      sb.append("Memory state is: ");
/* 1342 */                      sb.append(i2);
/* 1349 */                      Log.i("PhenotypeProcessReaper", sb.toString());
                            } catch (RuntimeException e2) {
/* 1365 */                      Log.w("PhenotypeProcessReaper", "Failed to retrieve memory state, not killing process.", e2);
                            }
/* 1360 */                  boolean z = runningAppProcessInfo.importance >= 400;
/* 1378 */                  if (new Boolean(z).booleanValue()) {
/* 1382 */                      Log.i("PhenotypeProcessReaper", "Killing process to refresh experiment configuration");
/* 1389 */                      Process.killProcess(Process.myPid());
/* 1393 */                      System.exit(0);
/* 1396 */                      return;
                            }
/* 1396 */                  return;
                        case 6:
                            try {
/* 1292 */                      IlloOoiiO.I00000oIO((IlOool) this.I00iiI);
/* 1302 */                      return;
                            } catch (Exception unused) {
/* 1299 */                      Log.isLoggable("StorageInfoHandler", 3);
/* 1302 */                      return;
                            }
                        case 7:
/* 1020 */                  loOiOoIi looiooii = (loOiOoIi) this.I00iiI;
/* 1022 */                  lOoo11 looo11 = lOoo11.AGGREGATED_ON_DEVICE_IMAGE_LABEL_DETECTION;
/* 1024 */                  HashMap map = looiooii.I000OiO;
/* 1030 */                  loO1I0 loo1i0 = (loO1I0) map.get(looo11);
/* 1032 */                  if (loo1i0 != null) {
/* 1035 */                      loO1I0 loo1i02 = loo1i0;
/* 1037 */                      iolO010IO iolo010io = loo1i02.I00iOIl;
/* 1039 */                      if (iolo010io == null) {
/* 1042 */                          loO1I0 loo1i03 = loo1i02;
/* 1048 */                          iolO010IO iolo010io2 = new iolO010IO(loo1i03, loo1i03.I00iiO);
/* 1051 */                          loo1i02.I00iOIl = iolo010io2;
/* 1053 */                          iolo010io = iolo010io2;
                                }
/* 1054 */                      Iterator it = iolo010io.iterator();
/* 1062 */                      while (it.hasNext()) {
/* 1064 */                          Object next = it.next();
/* 1076 */                          Object arrayList = (Collection) loo1i0.I00iiO.get(next);
/* 1078 */                          if (arrayList == null) {
/* 1083 */                              arrayList = new ArrayList(3);
                                    }
/* 1086 */                          List list = (List) arrayList;
/* 1105 */                          ArrayList arrayList2 = new ArrayList(list instanceof RandomAccess ? new lIOl0OIo(loo1i0, next, list, null) : new i1liliil11(loo1i0, next, list, (i1liliil11) null));
/* 1108 */                          Collections.sort(arrayList2);
/* 1111 */                          Iterator it2 = arrayList2.iterator();
/* 1115 */                          long jLongValue = 0;
/* 1121 */                          while (it2.hasNext()) {
/* 1133 */                              jLongValue += ((Long) it2.next()).longValue();
                                    }
/* 1143 */                          Long lValueOf = Long.valueOf((jLongValue / arrayList2.size()) & Long.MAX_VALUE);
/* 1155 */                          Long lValueOf2 = Long.valueOf(loOiOoIi.I00000oIO(arrayList2, 100.0d) & Long.MAX_VALUE);
/* 1170 */                          Long lValueOf3 = Long.valueOf(loOiOoIi.I00000oIO(arrayList2, 75.0d) & Long.MAX_VALUE);
/* 1182 */                          Long lValueOf4 = Long.valueOf(loOiOoIi.I00000oIO(arrayList2, 50.0d) & Long.MAX_VALUE);
/* 1194 */                          Long lValueOf5 = Long.valueOf(loOiOoIi.I00000oIO(arrayList2, 25.0d) & Long.MAX_VALUE);
/* 1206 */                          Long lValueOf6 = Long.valueOf(loOiOoIi.I00000oIO(arrayList2, 0.0d) & Long.MAX_VALUE);
/* 1212 */                          lOOiii looiii = new lOOiii();
/* 1215 */                          looiii.I00000oIO = lValueOf2;
/* 1217 */                          looiii.I00000oOI = lValueOf6;
/* 1219 */                          looiii.I0000Il00O = lValueOf;
/* 1221 */                          looiii.I0000O = lValueOf5;
/* 1223 */                          looiii.I0000oI00 = lValueOf4;
/* 1225 */                          looiii.I0001Ioi1lo = lValueOf3;
/* 1227 */                          VarHandle.storeStoreFence();
/* 1230 */                          int size = arrayList2.size();
/* 1240 */                          I0Oi111ii i0Oi111ii = new I0Oi111ii(16);
/* 1245 */                          i0Oi111ii.I00iio = lOolIoOl0.TYPE_THICK;
/* 1249 */                          Integer numValueOf = Integer.valueOf(size & Integer.MAX_VALUE);
/* 1255 */                          il1l1lo0i00 il1l1lo0i00Var = new il1l1lo0i00();
/* 1258 */                          il1l1lo0i00Var.I00000oIO = (il1ilI1l) next;
/* 1260 */                          il1l1lo0i00Var.I00000oOI = numValueOf;
/* 1262 */                          il1l1lo0i00Var.I0000Il00O = looiii;
/* 1264 */                          VarHandle.storeStoreFence();
/* 1267 */                          i0Oi111ii.I00io1l = il1l1lo0i00Var;
/* 1279 */                          looiooii.I00000oOI(new I00Ol00(i0Oi111ii, 0, (byte) 0), looo11, looiooii.I0000Il00O());
                                }
/* 1284 */                      map.remove(looo11);
/* 1287 */                      return;
                            }
/* 1287 */                  return;
                        case 8:
/* 992 */                   l0olllO1i l0olllo1i6 = (l0olllO1i) ((I11o1li1O00) this.I00iiI).I00000oOI;
/* 996 */                   l0olllO1i.I0000O(l0olllo1i6.I00oO101o);
/* 1014 */                  l0olllo1i6.I00oO101o.I010ioo(((Long) iol1II1ii1i.I00II0Ol1O0l.I00000oIO(null)).longValue());
/* 1017 */                  return;
                        case 9:
/* 718 */                   loi1ool loi1oolVar = (loi1ool) this.I00iiI;
/* 720 */                   li0lloo li0llooVar = li0lloo.AGGREGATED_ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE;
/* 722 */                   HashMap map2 = loi1oolVar.I000OiO;
/* 728 */                   o10liooI o10liooi = (o10liooI) map2.get(li0llooVar);
/* 730 */                   if (o10liooi != null) {
/* 733 */                       o10liooI o10liooi2 = o10liooi;
/* 735 */                       lO0Oi0oI lo0oi0oi = o10liooi2.I00iOIl;
/* 737 */                       if (lo0oi0oi == null) {
/* 740 */                           o10liooI o10liooi3 = o10liooi2;
/* 746 */                           lO0Oi0oI lo0oi0oi2 = new lO0Oi0oI(o10liooi3, o10liooi3.I00iiO);
/* 749 */                           o10liooi2.I00iOIl = lo0oi0oi2;
/* 751 */                           lo0oi0oi = lo0oi0oi2;
                                }
/* 752 */                       Iterator it3 = lo0oi0oi.iterator();
/* 760 */                       while (it3.hasNext()) {
/* 762 */                           Object next2 = it3.next();
/* 774 */                           Object arrayList3 = (Collection) o10liooi.I00iiO.get(next2);
/* 776 */                           if (arrayList3 == null) {
/* 781 */                               arrayList3 = new ArrayList(3);
                                    }
/* 784 */                           List list2 = (List) arrayList3;
/* 803 */                           ArrayList arrayList4 = new ArrayList(list2 instanceof RandomAccess ? new lli0oiIio0(o10liooi, next2, list2, null) : new i1liliil11(o10liooi, next2, list2, (i1liliil11) null));
/* 806 */                           Collections.sort(arrayList4);
/* 809 */                           Iterator it4 = arrayList4.iterator();
/* 813 */                           long jLongValue2 = 0;
/* 819 */                           while (it4.hasNext()) {
/* 831 */                               jLongValue2 += ((Long) it4.next()).longValue();
                                    }
/* 841 */                           Long lValueOf7 = Long.valueOf((jLongValue2 / arrayList4.size()) & Long.MAX_VALUE);
/* 853 */                           Long lValueOf8 = Long.valueOf(loi1ool.I00000oIO(arrayList4, 100.0d) & Long.MAX_VALUE);
/* 868 */                           Long lValueOf9 = Long.valueOf(loi1ool.I00000oIO(arrayList4, 75.0d) & Long.MAX_VALUE);
/* 880 */                           Long lValueOf10 = Long.valueOf(loi1ool.I00000oIO(arrayList4, 50.0d) & Long.MAX_VALUE);
/* 892 */                           Long lValueOf11 = Long.valueOf(loi1ool.I00000oIO(arrayList4, 25.0d) & Long.MAX_VALUE);
/* 904 */                           Long lValueOf12 = Long.valueOf(loi1ool.I00000oIO(arrayList4, 0.0d) & Long.MAX_VALUE);
/* 910 */                           lOii0I1II1o loii0i1ii1o = new lOii0I1II1o();
/* 913 */                           loii0i1ii1o.I00000oIO = lValueOf8;
/* 915 */                           loii0i1ii1o.I00000oOI = lValueOf12;
/* 917 */                           loii0i1ii1o.I0000Il00O = lValueOf7;
/* 919 */                           loii0i1ii1o.I0000O = lValueOf11;
/* 921 */                           loii0i1ii1o.I0000oI00 = lValueOf10;
/* 923 */                           loii0i1ii1o.I0001Ioi1lo = lValueOf9;
/* 925 */                           VarHandle.storeStoreFence();
/* 928 */                           int size2 = arrayList4.size();
/* 938 */                           IOiOol0 iOiOol0 = new IOiOol0(12);
/* 943 */                           iOiOol0.I00iio = li0O0iolIoOi.TYPE_THIN;
/* 947 */                           Integer numValueOf2 = Integer.valueOf(size2 & Integer.MAX_VALUE);
/* 953 */                           ili0Oii10O ili0oii10o = new ili0Oii10O();
/* 956 */                           ili0oii10o.I00000oIO = (ilOlOIiO0) next2;
/* 958 */                           ili0oii10o.I00000oOI = numValueOf2;
/* 960 */                           ili0oii10o.I0000Il00O = loii0i1ii1o;
/* 962 */                           VarHandle.storeStoreFence();
/* 965 */                           iOiOol0.I00ioIO = ili0oii10o;
/* 977 */                           loi1oolVar.I00000oOI(new I00Ol00(iOiOol0, 0), li0llooVar, loi1oolVar.I0000O());
                                }
/* 982 */                       map2.remove(li0llooVar);
/* 985 */                       return;
                            }
/* 985 */                   return;
                        case 10:
/* 445 */                   loiI0oIOO loii0oioo = (loiI0oIOO) this.I00iiI;
/* 447 */                   li10OOoO0loI li10oooo0loi = li10OOoO0loI.AGGREGATED_ON_DEVICE_FACE_MESH_DETECTION;
/* 449 */                   HashMap map3 = loii0oioo.I000OiO;
/* 455 */                   o10lo0 o10lo0Var = (o10lo0) map3.get(li10oooo0loi);
/* 457 */                   if (o10lo0Var != null) {
/* 460 */                       o10lo0 o10lo0Var2 = o10lo0Var;
/* 462 */                       lO0OoO0lIlI lo0ooo0lili = o10lo0Var2.I00iOIl;
/* 464 */                       if (lo0ooo0lili == null) {
/* 467 */                           o10lo0 o10lo0Var3 = o10lo0Var2;
/* 473 */                           lO0OoO0lIlI lo0ooo0lili2 = new lO0OoO0lIlI(o10lo0Var3, o10lo0Var3.I00iiO);
/* 476 */                           o10lo0Var2.I00iOIl = lo0ooo0lili2;
/* 478 */                           lo0ooo0lili = lo0ooo0lili2;
                                }
/* 479 */                       Iterator it5 = lo0ooo0lili.iterator();
/* 487 */                       while (it5.hasNext()) {
/* 489 */                           Object next3 = it5.next();
/* 501 */                           Object arrayList5 = (Collection) o10lo0Var.I00iiO.get(next3);
/* 503 */                           if (arrayList5 == null) {
/* 508 */                               arrayList5 = new ArrayList(3);
                                    }
/* 511 */                           List list3 = (List) arrayList5;
/* 530 */                           ArrayList arrayList6 = new ArrayList(list3 instanceof RandomAccess ? new lli1I1l(o10lo0Var, next3, list3, null) : new i1liliil11(o10lo0Var, next3, list3, (i1liliil11) null));
/* 533 */                           Collections.sort(arrayList6);
/* 536 */                           Iterator it6 = arrayList6.iterator();
/* 540 */                           long jLongValue3 = 0;
/* 546 */                           while (it6.hasNext()) {
/* 558 */                               jLongValue3 += ((Long) it6.next()).longValue();
                                    }
/* 568 */                           Long lValueOf13 = Long.valueOf((jLongValue3 / arrayList6.size()) & Long.MAX_VALUE);
/* 578 */                           Long lValueOf14 = Long.valueOf(loiI0oIOO.I00000oIO(arrayList6, d3) & Long.MAX_VALUE);
/* 593 */                           Long lValueOf15 = Long.valueOf(loiI0oIOO.I00000oIO(arrayList6, 75.0d) & Long.MAX_VALUE);
/* 605 */                           Long lValueOf16 = Long.valueOf(loiI0oIOO.I00000oIO(arrayList6, 50.0d) & Long.MAX_VALUE);
/* 617 */                           Long lValueOf17 = Long.valueOf(loiI0oIOO.I00000oIO(arrayList6, 25.0d) & Long.MAX_VALUE);
/* 621 */                           HashMap map4 = map3;
/* 630 */                           Long lValueOf18 = Long.valueOf(loiI0oIOO.I00000oIO(arrayList6, 0.0d) & Long.MAX_VALUE);
/* 636 */                           lOilIl0 loilil0 = new lOilIl0();
/* 639 */                           loilil0.I00000oIO = lValueOf14;
/* 641 */                           loilil0.I00000oOI = lValueOf18;
/* 643 */                           loilil0.I0000Il00O = lValueOf13;
/* 645 */                           loilil0.I0000O = lValueOf17;
/* 647 */                           loilil0.I0000oI00 = lValueOf16;
/* 649 */                           loilil0.I0001Ioi1lo = lValueOf15;
/* 651 */                           VarHandle.storeStoreFence();
/* 654 */                           int size3 = arrayList6.size();
/* 664 */                           IOiOol0 iOiOol02 = new IOiOol0(13);
/* 669 */                           iOiOol02.I00iio = li0lOl1IO.TYPE_THICK;
/* 673 */                           Integer numValueOf3 = Integer.valueOf(size3 & Integer.MAX_VALUE);
/* 679 */                           ilI0il ili0il = new ilI0il();
/* 682 */                           ili0il.I00000oIO = (il1o0o00O0) next3;
/* 684 */                           ili0il.I00000oOI = numValueOf3;
/* 686 */                           ili0il.I0000Il00O = loilil0;
/* 688 */                           VarHandle.storeStoreFence();
/* 691 */                           iOiOol02.I00ioIO = ili0il;
/* 703 */                           loii0oioo.I00000oOI(new I00Ol00(iOiOol02, 0, (byte) 0), li10oooo0loi, loii0oioo.I0000Il00O());
/* 706 */                           map3 = map4;
/* 707 */                           d3 = 100.0d;
                                }
/* 712 */                       map3.remove(li10oooo0loi);
/* 715 */                       return;
                            }
/* 715 */                   return;
                        case 11:
/* 372 */                   l0olllO1i l0olllo1i7 = (l0olllO1i) this.I00iiI;
/* 374 */                   lioil0ilIOi lioil0ilioi3 = l0olllo1i7.I00l0I0l0lO1;
/* 376 */                   lIl1O1li lil1o1li2 = l0olllo1i7.I00lli11;
/* 378 */                   l0olllO1i.I0000oI00(lioil0ilioi3);
/* 381 */                   lioil0ilioi3.I010II();
/* 392 */                   if (lioil0ilioi3.I011iiii0i() != 1) {
/* 430 */                       l01O0IO1ooO0 l01o0io1ooo03 = l0olllo1i7.I00ilO0;
/* 432 */                       l0olllO1i.I000II(l01o0io1ooo03);
/* 439 */                       l01o0io1ooo03.I00l0I0l0lO1.I00000oOI("registerTrigger called but app not eligible");
/* 442 */                       return;
                            }
/* 394 */                   l0olllO1i.I0001Ioi1lo(lil1o1li2);
/* 397 */                   lil1o1li2.I010II();
/* 400 */                   l1o00OIlII l1o00oilii = lil1o1li2.I00ll1;
/* 402 */                   if (l1o00oilii != null) {
/* 404 */                       l1o00oilii.I0000Il00O();
                            }
/* 409 */                   l0olllO1i.I0001Ioi1lo(lil1o1li2);
/* 415 */                   l1lo100oo0 l1lo100oo0Var = new l1lo100oo0(3);
/* 418 */                   l1lo100oo0Var.I00iiI = lil1o1li2;
/* 420 */                   VarHandle.storeStoreFence();
/* 426 */                   new Thread(l1lo100oo0Var).start();
/* 442 */                   return;
                        case 12:
/* 101 */                   o0OIl1o1i0Oi o0oil1o1i0oi = (o0OIl1o1i0Oi) this.I00iiI;
/* 103 */                   lioiiIOoil lioiiiooil = lioiiIOoil.AGGREGATED_ON_DEVICE_POSE_DETECTION;
/* 105 */                   HashMap map5 = o0oil1o1i0oi.I000OiO;
/* 111 */                   iI1oliOIO ii1olioio = (iI1oliOIO) map5.get(lioiiiooil);
/* 113 */                   if (ii1olioio != null) {
/* 116 */                       iI1oliOIO ii1olioio2 = ii1olioio;
/* 118 */                       loliOI1li lolioi1li = ii1olioio2.I00iOIl;
/* 120 */                       if (lolioi1li == null) {
/* 123 */                           iI1oliOIO ii1olioio3 = ii1olioio2;
/* 129 */                           loliOI1li lolioi1li2 = new loliOI1li(ii1olioio3, ii1olioio3.I00iiO);
/* 132 */                           ii1olioio2.I00iOIl = lolioi1li2;
/* 134 */                           lolioi1li = lolioi1li2;
                                }
/* 135 */                       Iterator it7 = lolioi1li.iterator();
/* 143 */                       while (it7.hasNext()) {
/* 145 */                           Object next4 = it7.next();
/* 157 */                           Object arrayList7 = (Collection) ii1olioio.I00iiO.get(next4);
/* 159 */                           if (arrayList7 == null) {
/* 163 */                               arrayList7 = new ArrayList(i);
                                    }
/* 166 */                           List list4 = (List) arrayList7;
/* 183 */                           ArrayList arrayList8 = new ArrayList(list4 instanceof RandomAccess ? new o10li11li0(ii1olioio, next4, list4, i1liliil11Var) : new i1liliil11(ii1olioio, next4, list4, i1liliil11Var));
/* 186 */                           Collections.sort(arrayList8);
/* 189 */                           Iterator it8 = arrayList8.iterator();
/* 193 */                           long jLongValue4 = 0;
/* 199 */                           while (it8.hasNext()) {
/* 211 */                               jLongValue4 = ((Long) it8.next()).longValue() + jLongValue4;
                                    }
/* 218 */                           iI1oliOIO ii1olioio4 = ii1olioio;
/* 225 */                           Long lValueOf19 = Long.valueOf((jLongValue4 / arrayList8.size()) & Long.MAX_VALUE);
/* 235 */                           Long lValueOf20 = Long.valueOf(o0OIl1o1i0Oi.I00000oIO(arrayList8, 100.0d) & Long.MAX_VALUE);
/* 245 */                           Long lValueOf21 = Long.valueOf(o0OIl1o1i0Oi.I00000oIO(arrayList8, d2) & Long.MAX_VALUE);
/* 255 */                           Long lValueOf22 = Long.valueOf(o0OIl1o1i0Oi.I00000oIO(arrayList8, d) & Long.MAX_VALUE);
/* 267 */                           Long lValueOf23 = Long.valueOf(o0OIl1o1i0Oi.I00000oIO(arrayList8, 25.0d) & Long.MAX_VALUE);
/* 279 */                           Long lValueOf24 = Long.valueOf(o0OIl1o1i0Oi.I00000oIO(arrayList8, 0.0d) & Long.MAX_VALUE);
/* 285 */                           liO0ooiII1 lio0ooiii1 = new liO0ooiII1();
/* 288 */                           lio0ooiii1.I00000oIO = lValueOf20;
/* 290 */                           lio0ooiii1.I00000oOI = lValueOf24;
/* 292 */                           lio0ooiii1.I0000Il00O = lValueOf19;
/* 294 */                           lio0ooiii1.I0000O = lValueOf23;
/* 296 */                           lio0ooiii1.I0000oI00 = lValueOf22;
/* 298 */                           lio0ooiii1.I0001Ioi1lo = lValueOf21;
/* 300 */                           VarHandle.storeStoreFence();
/* 303 */                           int size4 = arrayList8.size();
/* 313 */                           IOiOol0 iOiOol03 = new IOiOol0(14);
/* 318 */                           iOiOol03.I00iio = lioi0il00i.TYPE_THICK;
/* 322 */                           Integer numValueOf4 = Integer.valueOf(size4 & Integer.MAX_VALUE);
/* 328 */                           io1lIIli io1liili = new io1lIIli();
/* 331 */                           io1liili.I00000oIO = (io1IlOiOOo) next4;
/* 333 */                           io1liili.I00000oOI = numValueOf4;
/* 335 */                           io1liili.I0000Il00O = lio0ooiii1;
/* 337 */                           VarHandle.storeStoreFence();
/* 340 */                           iOiOol03.I00ilO0 = io1liili;
/* 350 */                           o0oil1o1i0oi.I00000oOI(o0Oll1li.I00000oOI(iOiOol03), lioiiiooil, o0oil1o1i0oi.I0000Il00O());
/* 353 */                           i = 3;
/* 354 */                           ii1olioio = ii1olioio4;
/* 356 */                           d = 50.0d;
/* 358 */                           d2 = 75.0d;
/* 363 */                           i1liliil11Var = null;
                                }
/* 366 */                       map5.remove(lioiiiooil);
/* 369 */                       return;
                            }
/* 369 */                   return;
                        default:
/* 29 */                    o0l1o1ooIoo o0l1o1ooioo = (o0l1o1ooIoo) this.I00iiI;
                            synchronized (o0l1o1ooioo.I0000Il00O) {
                                try {
/* 37 */                            if (o0l1o1ooioo.I00100o1O0lo == 2 && !o0l1o1ooioo.I00000oOI.get() && (scheduledFuture = o0l1o1ooioo.I000o00OoI0I) != null && !scheduledFuture.isCancelled()) {
/* 64 */                                if (o0l1o1ooioo.I000OiO > 1.0f && o0l1o1ooioo.I00000oIO() >= o0l1o1ooioo.I00000oIO.I000O01llI0) {
/* 82 */                                    o0l1o1ooIoo.I0010o.I0000Il00O("Reset zoom = 1");
/* 87 */                                    o0l1o1ooioo.I00000oOI(1.0f, lliOo1oo.SCANNER_AUTO_ZOOM_AUTO_RESET, null);
                                        }
/* 96 */                                return;
                                    }
/* 96 */                            return;
                                } finally {
                                }
                            }
                    }
                }
            }

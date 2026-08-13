            package p000;

            import android.app.Service;
            import android.app.job.JobParameters;
            import android.content.ContentValues;
            import android.content.Context;
            import android.content.Intent;
            import android.database.Cursor;
            import android.database.sqlite.SQLiteException;
            import android.os.Bundle;
            import android.os.Handler;
            import android.os.RemoteException;
            import android.text.TextUtils;
            import android.util.Log;
            import com.google.android.play.core.assetpacks.bs;
            import com.google.common.util.concurrent.ListenableFuture;
            import com.google.mlkit.vision.face.internal.zzg;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.io.File;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.RandomAccess;
            import java.util.concurrent.CountDownLatch;
            import java.util.concurrent.atomic.AtomicReference;
            
            public final class O10oO1IiI1 implements Runnable {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;
                public Object I00iio;

                public O10oO1IiI1(int i) {
/* 1 */             this.I00iOIl = i;
                }

                private final void I00000oIO() {
                    lioil0ilIOi lioil0ilioi;
                    l0Oi0o l0oi0o;
                    l01O0IO1ooO0 l01o0io1ooo0;
/* 5 */             il0IOO il0ioo = (il0IOO) this.I00iiO;
/* 9 */             lOliOlO1Io loliolo1io = (lOliOlO1Io) this.I00iio;
/* 13 */            l0olllO1i l0olllo1i = (l0olllO1i) loliolo1io.I00iOIl;
/* 15 */            String strI000OiO = null;
                    try {
                        try {
/* 16 */                    l0oi0o = l0olllo1i.I00ilI0I1;
/* 18 */                    l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 20 */                    l0olllO1i.I0000oI00(l0oi0o);
                        } catch (RemoteException e) {
/* 121 */                   l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 123 */                   l0olllO1i.I000II(l01o0io1ooo02);
/* 128 */                   l01o0io1ooo02.I00ilO0.I0000Il00O("Failed to get app instance id", e);
                        }
/* 33 */                if (l0oi0o.I010l1ol111().I000OOo1O(l1iioiool.ANALYTICS_STORAGE)) {
/* 68 */                    iolll0ill1i iolll0ill1iVar = loliolo1io.I00iio;
/* 70 */                    if (iolll0ill1iVar != null) {
/* 93 */                        strI000OiO = iolll0ill1iVar.I000OiO((lli10iI) this.I00iiI);
/* 97 */                        if (strI000OiO != null) {
/* 99 */                            lIl1O1li lil1o1li = l0olllo1i.I00lli11;
/* 101 */                           l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 106 */                           lil1o1li.I00io1l.set(strI000OiO);
/* 109 */                           l0olllO1i.I0000oI00(l0oi0o);
/* 114 */                           l0oi0o.I00io1l.I000O01llI0(strI000OiO);
                                }
/* 117 */                       loliolo1io.I0110OiO();
/* 131 */                       lioil0ilioi = l0olllo1i.I00l0I0l0lO1;
/* 82 */                        l0olllO1i.I0000oI00(lioil0ilioi);
/* 85 */                        lioil0ilioi.I01Ilo0i(strI000OiO, il0ioo);
                            }
/* 72 */                    l0olllO1i.I000II(l01o0io1ooo0);
/* 77 */                    l01o0io1ooo0.I00ilO0.I00000oOI("Failed to get app instance id");
                        } else {
/* 35 */                    l0olllO1i.I000II(l01o0io1ooo0);
/* 42 */                    l01o0io1ooo0.I00li1OI.I00000oOI("Analytics storage consent denied; will not get app instance id");
/* 45 */                    lIl1O1li lil1o1li2 = l0olllo1i.I00lli11;
/* 47 */                    l0olllO1i.I0001Ioi1lo(lil1o1li2);
/* 52 */                    lil1o1li2.I00io1l.set(null);
/* 55 */                    l0olllO1i.I0000oI00(l0oi0o);
/* 60 */                    l0oi0o.I00io1l.I000O01llI0(null);
                        }
/* 80 */                lioil0ilioi = l0olllo1i.I00l0I0l0lO1;
/* 82 */                l0olllO1i.I0000oI00(lioil0ilioi);
/* 85 */                lioil0ilioi.I01Ilo0i(strI000OiO, il0ioo);
                    } catch (Throwable th) {
/* 134 */               lioil0ilIOi lioil0ilioi2 = l0olllo1i.I00l0I0l0lO1;
/* 136 */               l0olllO1i.I0000oI00(lioil0ilioi2);
/* 139 */               lioil0ilioi2.I01Ilo0i(null, il0ioo);
/* 245 */               throw th;
                    }
                }

                private final void I00000oOI() {
/* 7 */             if (((OOo0ooi) this.I00iiI).I00iOIl != null) {
/* 42 */                OIiilo1Ool0o.I00000oIO();
/* 55 */                return;
                    }
/* 11 */            o0OllIoI o0ollioi = (o0OllIoI) this.I00iiO;
/* 15 */            IO0iIlI1li iO0iIlI1li = (IO0iIlI1li) this.I00iio;
/* 21 */            o0OllIoI o0ollioiI00000oOI = o0IOOIili01o.I00000oOI(o0IOOIili01o.I0000Il00O(), o0ollioi);
                    try {
/* 25 */                iO0iIlI1li.run();
                    } finally {
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:116:0x0360  */
                /* JADX WARN: Removed duplicated region for block: B:119:0x0366  */
                /* JADX WARN: Removed duplicated region for block: B:120:0x0377  */
                /* JADX WARN: Removed duplicated region for block: B:147:0x048c  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void run() throws Throwable {
                    Object objCall;
                    int i;
                    o0IiOl o0iiolI000O01llI0;
                    ii0il0lOolIo ii0il0loolio;
                    Cursor cursor;
                    iOl1lOo1IO iol1loo1io;
                    long j;
                    Cursor cursorQuery;
                    liloI0Io liloi0ioI01I0Iioooo0;
                    AtomicReference atomicReference;
                    lOliOlO1Io loliolo1io;
                    l0olllO1i l0olllo1i;
                    l0Oi0o l0oi0o;
/* 5 */             int i2 = 4;
/* 6 */             int i3 = 2;
/* 7 */             int i4 = 3;
/* 9 */             i1liliil11 i1liliil11Var = null;
/* 10 */            int i5 = 1;
                    switch (this.I00iOIl) {
                        case 0:
/* 2173 */                  ListenableFuture foregroundInfoAsync = ((O10oIiIi0OI0) this.I00iiI).getForegroundInfoAsync();
/* 2179 */                  liOO1i1 lioo1i1 = new liOO1i1(i5);
/* 2182 */                  lioo1i1.I00iiO = this;
/* 2184 */                  lioo1i1.I00iiI = foregroundInfoAsync;
/* 2186 */                  VarHandle.storeStoreFence();
/* 2201 */                  foregroundInfoAsync.addListener(lioo1i1, (OilOol) ((OillOo0) ((O10oOIoI0) this.I00iio).I000OiO).I00iiI);
/* 2204 */                  return;
                        case 1:
                            try {
/* 2139 */                      objCall = ((IliiOOi1) this.I00iiI).call();
                            } catch (Exception unused) {
/* 2144 */                      objCall = null;
                            }
/* 2147 */                  IioO0ilo1Ii iioO0ilo1Ii = (IioO0ilo1Ii) this.I00iiO;
/* 2151 */                  Handler handler = (Handler) this.I00iio;
/* 2155 */                  IlloOi1I1OO illoOi1I1OO = new IlloOi1I1OO(i3);
/* 2158 */                  illoOi1I1OO.I00iiI = iioO0ilo1Ii;
/* 2160 */                  illoOi1I1OO.I00iiO = objCall;
/* 2162 */                  VarHandle.storeStoreFence();
/* 2165 */                  handler.post(illoOi1I1OO);
/* 2168 */                  return;
                        case 2:
/* 2094 */                  IIoOoIol0Io0 iIoOoIol0Io0 = (IIoOoIol0Io0) this.I00iiI;
                            try {
/* 2125 */                      iOi1IOoIO0l.I00000oIO(iIoOoIol0Io0.I00ilI0I1.I00OIl(o0iOli.I00iiO), new O1o1iI((Oi1oIiOiIi0) this.I00iiO, iIoOoIol0Io0, (O1iIlllIoo) this.I00iio, (IOoil1iiIilo) null, 7));
/* 2133 */                      return;
                            } catch (Throwable th) {
/* 2130 */                      iIoOoIol0Io0.I0000O(th);
/* 2133 */                      return;
                            }
                        case 3:
/* 2022 */                  i0Iii1o10 i0iii1o10 = (i0Iii1o10) this.I00iiI;
/* 2026 */                  Bundle bundle = (Bundle) this.I00iiO;
/* 2030 */                  bs bsVar = (bs) this.I00iio;
/* 2032 */                  i0O1I1o i0o1i1o = i0iii1o10.I000II;
/* 2034 */                  i0o1i1o.getClass();
/* 2039 */                  OoIOol ooIOol = new OoIOol(i2);
/* 2042 */                  ooIOol.I00iiI = i0o1i1o;
/* 2044 */                  ooIOol.I00iiO = bundle;
/* 2046 */                  VarHandle.storeStoreFence();
/* 2059 */                  if (((Boolean) i0o1i1o.I00000oOI(ooIOol)).booleanValue()) {
/* 2061 */                      Handler handler2 = i0iii1o10.I000l1;
/* 2066 */                      iooili01 iooili01Var = new iooili01(3);
/* 2069 */                      iooili01Var.I00iiI = i0iii1o10;
/* 2071 */                      iooili01Var.I00iiO = bsVar;
/* 2073 */                      VarHandle.storeStoreFence();
/* 2076 */                      handler2.post(iooili01Var);
/* 2087 */                      ((i0OiOI1) i0iii1o10.I000lI.I0000Il00O()).mo17f();
/* 2090 */                      return;
                            }
/* 2090 */                  return;
                        case 4:
/* 1946 */                  i0O0il111 i0o0il111 = (i0O0il111) this.I00iiI;
/* 1950 */                  Bundle bundle2 = (Bundle) this.I00iiO;
/* 1954 */                  bs bsVar2 = (bs) this.I00iio;
/* 1956 */                  i0O1I1o i0o1i1o2 = i0o0il111.I00000oIO;
/* 1958 */                  i0o1i1o2.getClass();
/* 1963 */                  OoIOol ooIOol2 = new OoIOol(i2);
/* 1966 */                  ooIOol2.I00iiI = i0o1i1o2;
/* 1968 */                  ooIOol2.I00iiO = bundle2;
/* 1970 */                  VarHandle.storeStoreFence();
/* 1983 */                  if (((Boolean) i0o1i1o2.I00000oOI(ooIOol2)).booleanValue()) {
/* 1985 */                      i0Iio1OiI i0iio1oii = i0o0il111.I0000oI00;
/* 1987 */                      i0iio1oii.getClass();
/* 1993 */                      l0iOoII1Il l0iooii1il = new l0iOoII1Il(3);
/* 1996 */                      l0iooii1il.I00iiI = i0iio1oii;
/* 1998 */                      l0iooii1il.I00iiO = bsVar2;
/* 2000 */                      VarHandle.storeStoreFence();
/* 2005 */                      i0iio1oii.I00000oOI.post(l0iooii1il);
/* 2016 */                      ((i0OiOI1) i0o0il111.I000II.I0000Il00O()).mo17f();
/* 2019 */                      return;
                            }
/* 2019 */                  return;
                        case 5:
/* 1793 */                  i0O1Oi1Ioll i0o1oi1ioll = (i0O1Oi1Ioll) this.I00iiI;
/* 1797 */                  ArrayList arrayList = (ArrayList) this.I00iiO;
/* 1801 */                  OloIlI0ll oloIlI0ll = (OloIlI0ll) this.I00iio;
/* 1805 */                  HashMap map = new HashMap();
/* 1808 */                  Iterator it = arrayList.iterator();
/* 1812 */                  long j2 = 0;
/* 1818 */                  while (it.hasNext()) {
/* 1824 */                      String str = (String) it.next();
                                try {
/* 1832 */                          long length = 0;
/* 1834 */                          for (File file : i0o1oi1ioll.I000OiO(str)) {
/* 1842 */                              length = file.length() + length;
                                    }
/* 1879 */                          bs bsVarI00000oIO = bs.I00000oIO(str, 1, 0, 0L, length, i0o1oi1ioll.I0000Il00O.I00000oIO(str), 1, String.valueOf(i0o1oi1ioll.I0000O.I00000oIO()), i0o1oi1ioll.I0000oI00.I00000oIO(str));
/* 1887 */                          j2 += bsVarI00000oIO.I0000oI00;
/* 1888 */                          map.put(str, bsVarI00000oIO);
                                } catch (O11oIi e) {
/* 1893 */                          oloIlI0ll.I00000oIO(e);
/* 1943 */                          return;
                                }
                            }
/* 1897 */                  Iterator it2 = arrayList.iterator();
/* 1905 */                  while (it2.hasNext()) {
/* 1911 */                      String str2 = (String) it2.next();
                                try {
/* 1915 */                          int andIncrement = i0O1Oi1Ioll.I000OOo1O.getAndIncrement();
/* 1919 */                          i0o1oi1ioll.I000OOo1O(andIncrement, 1, str2);
/* 1922 */                          i0o1oi1ioll.I000OOo1O(andIncrement, 2, str2);
/* 1926 */                          i0o1oi1ioll.I000OOo1O(andIncrement, 3, str2);
                                } catch (O11oIi e2) {
/* 1931 */                          oloIlI0ll.I00000oIO(e2);
/* 1943 */                          return;
                                }
                            }
/* 1940 */                  oloIlI0ll.I00000oOI(new i0Ilo11Ii(j2, map));
/* 1943 */                  return;
                        case 6:
/* 1785 */                  ((ii01iI1oI1l) this.I00iiI).zzb((iOli1OIoI0o) this.I00iiO, 0, (iOlI0O0iIiO) this.I00iio);
/* 1788 */                  return;
                        case 7:
/* 1769 */                  ((ii0IiOii) this.I00iiI).zzb((iOioIII1i) this.I00iiO, 0, (iOiI1oOo1l) this.I00iio);
/* 1772 */                  return;
                        case 8:
/* 1753 */                  ((ii0IiiI) this.I00iiI).zzb((iOioO0lIOo) this.I00iiO, 0, (iOiIOO1ll) this.I00iio);
/* 1756 */                  return;
                        case 9:
/* 1737 */                  ((iOlloil01Ilo) this.I00iiI).zzb((iOIoil) this.I00iiO, 0, (iOIIOoOoii) this.I00iio);
/* 1740 */                  return;
                        case 10:
/* 1584 */                  IOO1o0 iOO1o0 = (IOO1o0) this.I00iiO;
/* 1586 */                  Intent intent = iOO1o0.I00iOIl;
/* 1590 */                  String stringExtra = intent.getStringExtra("google.message_id");
/* 1594 */                  if (stringExtra == null) {
/* 1598 */                      stringExtra = intent.getStringExtra("message_id");
                            }
/* 1606 */                  if (TextUtils.isEmpty(stringExtra)) {
/* 1609 */                      o0iiolI000O01llI0 = lOio0o.I0000oI00(null);
                            } else {
/* 1617 */                      Bundle bundle3 = new Bundle();
/* 1620 */                      Intent intent2 = iOO1o0.I00iOIl;
/* 1624 */                      String stringExtra2 = intent2.getStringExtra("google.message_id");
/* 1628 */                      if (stringExtra2 == null) {
/* 1632 */                          stringExtra2 = intent2.getStringExtra("message_id");
                                }
/* 1638 */                      bundle3.putString("google.message_id", stringExtra2);
/* 1641 */                      Intent intent3 = iOO1o0.I00iOIl;
/* 1660 */                      Integer numValueOf = intent3.hasExtra("google.product_id") ? Integer.valueOf(intent3.getIntExtra("google.product_id", 0)) : null;
/* 1661 */                      if (numValueOf != null) {
/* 1669 */                          bundle3.putInt("google.product_id", numValueOf.intValue());
                                }
/* 1674 */                      Context context = (Context) this.I00iiI;
/* 1678 */                      bundle3.putBoolean("supports_message_handled", true);
/* 1681 */                      o00io0IiOOo0 o00io0iiooo0I000II = o00io0IiOOo0.I000II(context);
                                synchronized (o00io0iiooo0I000II) {
/* 1688 */                          i = o00io0iiooo0I000II.I00iiI;
/* 1692 */                          o00io0iiooo0I000II.I00iiI = i + 1;
                                }
/* 1698 */                      o0iiolI000O01llI0 = o00io0iiooo0I000II.I000O01llI0(new lli1OiO(i, 2, bundle3, 0));
                            }
/* 1704 */                  CountDownLatch countDownLatch = (CountDownLatch) this.I00iio;
/* 1706 */                  Iii11l iii11l = Iii11l.I00ilO0;
/* 1710 */                  iili011O1 iili011o1 = new iili011O1(i5);
/* 1713 */                  iili011o1.I00iiI = countDownLatch;
/* 1715 */                  VarHandle.storeStoreFence();
/* 1718 */                  o0iiolI000O01llI0.I00000oOI(iii11l, iili011o1);
/* 1721 */                  return;
                        case 11:
/* 1553 */                  lilOOl0 lilool0 = ((l1Oli1l) this.I00iio).I000II;
/* 1555 */                  lilool0.I00OI1();
/* 1560 */                  iII000ol000 iii000ol000 = (iII000ol000) this.I00iiI;
/* 1564 */                  Object objZza = iii000ol000.I00iiO.zza();
/* 1570 */                  lli10iI lli10ii = (lli10iI) this.I00iiO;
/* 1572 */                  if (objZza == null) {
/* 1574 */                      lilool0.I00OilO00Il(iii000ol000, lli10ii);
/* 1581 */                      return;
                            } else {
/* 1578 */                      lilool0.I00OOll1(iii000ol000, lli10ii);
/* 1581 */                      return;
                            }
                        case 12:
/* 1225 */                  ii0oooi0IO0l ii0oooi0io0l = (ii0oooi0IO0l) this.I00iiI;
/* 1229 */                  lli10iI lli10ii2 = (lli10iI) this.I00iiO;
/* 1235 */                  lilOOl0 lilool02 = ((l1Oli1l) this.I00iio).I000II;
/* 1245 */                  if ("_cmp".equals(ii0oooi0io0l.I00iOIl) && (ii0il0loolio = ii0oooi0io0l.I00iiI) != null) {
/* 1251 */                      Bundle bundle4 = ii0il0loolio.I00iOIl;
/* 1257 */                      if (bundle4.size() != 0) {
/* 1262 */                          String string = bundle4.getString("_cis");
/* 1272 */                          if ("referrer broadcast".equals(string) || "referrer API".equals(string)) {
/* 1294 */                              lilool02.I00II0oii1o().I00ll1.I0000Il00O("Event has been filtered ", ii0oooi0io0l.toString());
/* 1315 */                              ii0oooi0io0l = new ii0oooi0IO0l("_cmpx", ii0il0loolio, ii0oooi0io0l.I00iiO, ii0oooi0io0l.I00iio, ii0oooi0io0l.I00ilI0I1);
                                    }
                                }
                            }
/* 1320 */                  String str3 = ii0oooi0io0l.I00iOIl;
/* 1322 */                  l0l1ol11 l0l1ol11Var = lilool02.I00iOIl;
/* 1324 */                  lio010i lio010iVar = lilool02.I00io1l;
/* 1326 */                  lilOOl0.I00O0o1oo(l0l1ol11Var);
/* 1329 */                  String str4 = lli10ii2.I00iOIl;
/* 1346 */                  iil1iIlO iil1iilo = TextUtils.isEmpty(str4) ? null : (iil1iIlO) l0l1ol11Var.I00li1OI.I0000Il00O(str4);
/* 1348 */                  if (iil1iilo == null) {
/* 1539 */                      lilool02.I00II0oii1o().I00lll10.I0000Il00O("EES not loaded for", lli10ii2.I00iOIl);
/* 1542 */                      lilool02.I00OI1();
/* 1545 */                      lilool02.I0000oI00(ii0oooi0io0l, lli10ii2);
/* 1548 */                      return;
                            }
                            try {
/* 1350 */                      OlilOlOiI olilOlOiI = iil1iilo.I0000Il00O;
/* 1352 */                      lilOOl0.I00O0o1oo(lio010iVar);
/* 1361 */                      HashMap mapI01Io000 = lio010i.I01Io000(ii0oooi0io0l.I00iiI.I0001Ioi1lo(), true);
/* 1369 */                      String strI00000oOI = ll0i0l0Ili.I00000oOI(str3, iO1l1II0O0.I0001Ioi1lo, iO1l1II0O0.I00000oIO);
/* 1373 */                      if (strI00000oOI == null) {
/* 1376 */                          strI00000oOI = str3;
                                }
/* 1388 */                      if (iil1iilo.I00000oIO(new i1IO0oi1I(strI00000oOI, ii0oooi0io0l.I00iio, mapI01Io000))) {
/* 1404 */                          if (((i1IO0oi1I) olilOlOiI.I00iiO).equals((i1IO0oi1I) olilOlOiI.I00iiI)) {
/* 1435 */                              lilool02.I00OI1();
/* 1438 */                              lilool02.I0000oI00(ii0oooi0io0l, lli10ii2);
                                    } else {
/* 1414 */                              lilool02.I00II0oii1o().I00lll10.I0000Il00O("EES edited event", str3);
/* 1417 */                              lilOOl0.I00O0o1oo(lio010iVar);
/* 1424 */                              ii0oooi0IO0l ii0oooi0io0lI010ioo = lio010i.I010ioo((i1IO0oi1I) olilOlOiI.I00iiO);
/* 1428 */                              lilool02.I00OI1();
/* 1431 */                              lilool02.I0000oI00(ii0oooi0io0lI010ioo, lli10ii2);
                                    }
/* 1449 */                          if (((ArrayList) olilOlOiI.I00iio).isEmpty()) {
/* 1548 */                              return;
                                    }
/* 1455 */                          Iterator it3 = ((ArrayList) olilOlOiI.I00iio).iterator();
/* 1463 */                          while (it3.hasNext()) {
/* 1469 */                              i1IO0oi1I i1io0oi1i = (i1IO0oi1I) it3.next();
/* 1481 */                              lilool02.I00II0oii1o().I00lll10.I0000Il00O("EES logging created event", i1io0oi1i.I00000oIO);
/* 1484 */                              lilOOl0.I00O0o1oo(lio010iVar);
/* 1487 */                              ii0oooi0IO0l ii0oooi0io0lI010ioo2 = lio010i.I010ioo(i1io0oi1i);
/* 1491 */                              lilool02.I00OI1();
/* 1494 */                              lilool02.I0000oI00(ii0oooi0io0lI010ioo2, lli10ii2);
                                    }
/* 1548 */                          return;
                                }
                            } catch (il1I0oiIi0o unused2) {
/* 1508 */                      lilool02.I00II0oii1o().I00ilO0.I0000O(lli10ii2.I00iiI, "EES error. appId, eventName", str3);
                            }
/* 1519 */                  lilool02.I00II0oii1o().I00lll10.I0000Il00O("EES was not applied to event", str3);
/* 1522 */                  lilool02.I00OI1();
/* 1525 */                  lilool02.I0000oI00(ii0oooi0io0l, lli10ii2);
/* 1548 */                  return;
                        case 13:
/* 1206 */                  lilOOl0 lilool03 = ((l1Oli1l) this.I00iio).I000II;
/* 1208 */                  lilool03.I00OI1();
/* 1219 */                  lilool03.I0000Il00O((String) this.I00iiO, (ii0oooi0IO0l) this.I00iiI);
/* 1222 */                  return;
                        case 14:
/* 1173 */                  lilOOl0 lilool04 = ((l1Oli1l) this.I00iio).I000II;
/* 1175 */                  lilool04.I00OI1();
/* 1180 */                  lio0llOI0 lio0lloi0 = (lio0llOI0) this.I00iiI;
/* 1182 */                  Object objZza2 = lio0lloi0.zza();
/* 1188 */                  lli10iI lli10ii3 = (lli10iI) this.I00iiO;
/* 1190 */                  if (objZza2 == null) {
/* 1194 */                      lilool04.I00OIl(lio0lloi0.I00iiI, lli10ii3);
/* 1201 */                      return;
                            } else {
/* 1198 */                      lilool04.I00OIO1(lio0lloi0, lli10ii3);
/* 1201 */                      return;
                            }
                        case 15:
/* 650 */                   l1Oli1l l1oli1l = (l1Oli1l) this.I00iiI;
/* 654 */                   lli10iI lli10ii4 = (lli10iI) this.I00iiO;
/* 658 */                   iI0iiII1i ii0iiii1i = (iI0iiII1i) this.I00iio;
/* 660 */                   lilOOl0 lilool05 = l1oli1l.I000II;
/* 662 */                   lilool05.I00OI1();
/* 665 */                   String str5 = lli10ii4.I00iOIl;
/* 667 */                   lII0I0I000I.I000II(str5);
/* 670 */                   HashMap map2 = lilool05.I0100i;
/* 676 */                   lilool05.I00iOIl().I010II();
/* 679 */                   lilool05.I00iIi0i1o();
/* 682 */                   iOl1lOo1IO iol1loo1io2 = lilool05.I00iiO;
/* 684 */                   lilOOl0.I00O0o1oo(iol1loo1io2);
/* 687 */                   long j3 = ii0iiii1i.I00iOIl;
/* 689 */                   long j4 = ii0iiii1i.I00iiO;
/* 691 */                   iol1loo1io2.I010II();
/* 694 */                   iol1loo1io2.I010OIo1l();
                            try {
/* 745 */                       cursorQuery = iol1loo1io2.I01Io11IiiiO().query("upload_queue", new String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"}, "rowId=?", new String[]{String.valueOf(j3)}, null, null, null, "1");
                                try {
                                    try {
                                    } catch (SQLiteException e3) {
/* 824 */                               e = e3;
/* 825 */                               iol1loo1io = iol1loo1io2;
/* 826 */                               j = j3;
                                    }
                                } catch (Throwable th2) {
/* 818 */                           th = th2;
/* 829 */                           cursor = cursorQuery;
/* 1163 */                          if (cursor != null) {
/* 1165 */                              cursor.close();
                                    }
/* 1168 */                          throw th;
                                }
                            } catch (SQLiteException e4) {
/* 834 */                       e = e4;
/* 835 */                       iol1loo1io = iol1loo1io2;
/* 836 */                       j = j3;
/* 842 */                       cursorQuery = null;
                            } catch (Throwable th3) {
/* 832 */                       th = th3;
/* 839 */                       cursor = null;
/* 1163 */                      if (cursor != null) {
                                }
/* 1168 */                      throw th;
                            }
/* 753 */                   if (!cursorQuery.moveToFirst()) {
/* 755 */                       j = j3;
/* 863 */                       if (cursorQuery != null) {
/* 865 */                           cursorQuery.close();
                                }
/* 868 */                       liloi0ioI01I0Iioooo0 = null;
/* 869 */                       if (liloi0ioI01I0Iioooo0 == null) {
/* 883 */                           lilool05.I00II0oii1o().I00l0I0l0lO1.I0000O(str5, "[sgtm] Queued batch doesn't exist. appId, rowId", Long.valueOf(j));
/* 1162 */                          return;
                                }
/* 888 */                       String str6 = liloi0ioI01I0Iioooo0.I0000Il00O;
/* 890 */                       int i6 = ii0iiii1i.I00iiI;
/* 892 */                       if (i6 != 1) {
/* 1062 */                          if (i6 == 3) {
/* 1068 */                              lil1io lil1ioVar = (lil1io) map2.get(str6);
/* 1070 */                              if (lil1ioVar == null) {
/* 1074 */                                  lil1ioVar = new lil1io();
/* 1077 */                                  lil1ioVar.I00000oIO = lilool05;
/* 1079 */                                  lil1ioVar.I00000oOI = 1;
/* 1085 */                                  lil1ioVar.I0000Il00O = lil1ioVar.I00000oIO();
/* 1087 */                                  VarHandle.storeStoreFence();
/* 1090 */                                  map2.put(str6, lil1ioVar);
                                        } else {
                                            lil1ioVar.I00000oOI++;
/* 1103 */                                  lil1ioVar.I0000Il00O = lil1ioVar.I00000oIO();
                                        }
/* 1109 */                              lilool05.I00IoO0().getClass();
/* 1134 */                              lilool05.I00II0oii1o().I00lll10.I0000oI00("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str5, str6, Long.valueOf((lil1ioVar.I0000Il00O - System.currentTimeMillis()) / 1000));
                                    }
/* 1137 */                          iOl1lOo1IO iol1loo1io3 = lilool05.I00iiO;
/* 1139 */                          lilOOl0.I00O0o1oo(iol1loo1io3);
/* 1144 */                          Long lValueOf = Long.valueOf(ii0iiii1i.I00iOIl);
/* 1148 */                          iol1loo1io3.I01101olii(lValueOf);
/* 1159 */                          lilool05.I00II0oii1o().I00lll10.I0000O(str5, "[sgtm] increased batch retry count after failed client upload. appId, rowId", lValueOf);
/* 1162 */                          return;
                                }
/* 898 */                       if (map2.containsKey(str6)) {
/* 900 */                           map2.remove(str6);
                                }
/* 903 */                       iOl1lOo1IO iol1loo1io4 = lilool05.I00iiO;
/* 905 */                       lilOOl0.I00O0o1oo(iol1loo1io4);
/* 908 */                       Long lValueOf2 = Long.valueOf(j);
/* 912 */                       iol1loo1io4.I010l1ol111(lValueOf2);
/* 923 */                       lilool05.I00II0oii1o().I00lll10.I0000O(str5, "[sgtm] queued batch deleted after successful client upload. appId, rowId", lValueOf2);
/* 928 */                       if (j4 > 0) {
/* 930 */                           iOl1lOo1IO iol1loo1io5 = lilool05.I00iiO;
/* 932 */                           lilOOl0.I00O0o1oo(iol1loo1io5);
/* 937 */                           l0olllO1i l0olllo1i2 = (l0olllO1i) iol1loo1io5.I00iOIl;
/* 939 */                           iol1loo1io5.I010II();
/* 942 */                           iol1loo1io5.I010OIo1l();
/* 945 */                           Long lValueOf3 = Long.valueOf(j4);
/* 951 */                           ContentValues contentValues = new ContentValues();
/* 960 */                           contentValues.put("upload_type", (Integer) 1);
/* 963 */                           Iioi0lilII iioi0lilII = l0olllo1i2.I00li1OI;
/* 965 */                           l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i2.I00ilO0;
/* 967 */                           iioi0lilII.getClass();
/* 980 */                           contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
                                    try {
/* 1012 */                              if (iol1loo1io5.I01Io11IiiiO().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j4), str5, String.valueOf(4)}) != 1) {
/* 1014 */                                  l0olllO1i.I000II(l01o0io1ooo0);
/* 1021 */                                  l01o0io1ooo0.I00l0I0l0lO1.I0000O(str5, "Google Signal pending batch not updated. appId, rowId", lValueOf3);
                                        }
/* 1039 */                              lilool05.I00II0oii1o().I00lll10.I0000O(str5, "[sgtm] queued Google Signal batch updated. appId, signalRowId", Long.valueOf(j4));
/* 1042 */                              lilool05.I000oI1ioi(str5);
/* 1162 */                              return;
                                    } catch (SQLiteException e5) {
/* 1046 */                              l0olllO1i.I000II(l01o0io1ooo0);
/* 1057 */                              l01o0io1ooo0.I00ilO0.I0000oI00("Failed to update google Signal pending batch. appid, rowId", str5, Long.valueOf(j4), e5);
/* 1060 */                              throw e5;
                                    }
                                }
/* 1162 */                      return;
                            }
/* 759 */                   String string2 = cursorQuery.getString(1);
/* 763 */                   lII0I0I000I.I000II(string2);
/* 808 */                   j = j3;
                            try {
/* 810 */                       liloi0ioI01I0Iioooo0 = iol1loo1io2.I01I0Iioooo0(string2, j, cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
/* 814 */                       cursorQuery.close();
                            } catch (SQLiteException e6) {
/* 820 */                       e = e6;
/* 821 */                       iol1loo1io = iol1loo1io2;
/* 847 */                       l01O0IO1ooO0 l01o0io1ooo02 = ((l0olllO1i) iol1loo1io.I00iOIl).I00ilO0;
/* 849 */                       l0olllO1i.I000II(l01o0io1ooo02);
/* 860 */                       l01o0io1ooo02.I00ilO0.I0000O(Long.valueOf(j), "Error to querying MeasurementBatch from upload_queue. rowId", e);
/* 863 */                       if (cursorQuery != null) {
                                }
/* 868 */                       liloi0ioI01I0Iioooo0 = null;
/* 869 */                       if (liloi0ioI01I0Iioooo0 == null) {
                                }
                            }
/* 869 */                   if (liloi0ioI01I0Iioooo0 == null) {
                            }
                        case 16:
/* 460 */                   AtomicReference atomicReference2 = (AtomicReference) this.I00iiI;
                            synchronized (atomicReference2) {
                                try {
                                    try {
/* 465 */                               loliolo1io = (lOliOlO1Io) this.I00iio;
/* 469 */                               l0olllo1i = (l0olllO1i) loliolo1io.I00iOIl;
/* 471 */                               l0oi0o = l0olllo1i.I00ilI0I1;
/* 473 */                               l0olllO1i.I0000oI00(l0oi0o);
                                    } catch (RemoteException e7) {
/* 615 */                               l01O0IO1ooO0 l01o0io1ooo03 = ((l0olllO1i) ((lOliOlO1Io) this.I00iio).I00iOIl).I00ilO0;
/* 617 */                               l0olllO1i.I000II(l01o0io1ooo03);
/* 624 */                               l01o0io1ooo03.I00ilO0.I0000Il00O("Failed to get app instance id", e7);
/* 629 */                               atomicReference = (AtomicReference) this.I00iiI;
                                    }
/* 486 */                           if (l0oi0o.I010l1ol111().I000OOo1O(l1iioiool.ANALYTICS_STORAGE)) {
/* 539 */                               iolll0ill1i iolll0ill1iVar = loliolo1io.I00iio;
/* 541 */                               if (iolll0ill1iVar != null) {
/* 564 */                                   atomicReference2.set(iolll0ill1iVar.I000OiO((lli10iI) this.I00iiO));
/* 571 */                                   String str7 = (String) atomicReference2.get();
/* 573 */                                   if (str7 != null) {
/* 579 */                                       lIl1O1li lil1o1li = ((l0olllO1i) loliolo1io.I00iOIl).I00lli11;
/* 581 */                                       l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 586 */                                       lil1o1li.I00io1l.set(str7);
/* 589 */                                       l0Oi0o l0oi0o2 = l0olllo1i.I00ilI0I1;
/* 591 */                                       l0olllO1i.I0000oI00(l0oi0o2);
/* 596 */                                       l0oi0o2.I00io1l.I000O01llI0(str7);
                                            }
/* 599 */                                   loliolo1io.I0110OiO();
/* 604 */                                   atomicReference = (AtomicReference) this.I00iiI;
/* 631 */                                   atomicReference.notify();
/* 635 */                                   return;
                                        }
/* 543 */                               l01O0IO1ooO0 l01o0io1ooo04 = l0olllo1i.I00ilO0;
/* 545 */                               l0olllO1i.I000II(l01o0io1ooo04);
/* 552 */                               l01o0io1ooo04.I00ilO0.I00000oOI("Failed to get app instance id");
                                    } else {
/* 488 */                               l01O0IO1ooO0 l01o0io1ooo05 = l0olllo1i.I00ilO0;
/* 490 */                               l0olllO1i.I000II(l01o0io1ooo05);
/* 497 */                               l01o0io1ooo05.I00li1OI.I00000oOI("Analytics storage consent denied; will not get app instance id");
/* 504 */                               lIl1O1li lil1o1li2 = ((l0olllO1i) loliolo1io.I00iOIl).I00lli11;
/* 506 */                               l0olllO1i.I0001Ioi1lo(lil1o1li2);
/* 512 */                               lil1o1li2.I00io1l.set(null);
/* 515 */                               l0Oi0o l0oi0o3 = l0olllo1i.I00ilI0I1;
/* 517 */                               l0olllO1i.I0000oI00(l0oi0o3);
/* 522 */                               l0oi0o3.I00io1l.I000O01llI0(null);
/* 525 */                               atomicReference2.set(null);
                                    }
/* 528 */                           atomicReference2.notify();
/* 635 */                           return;
                                } catch (Throwable th4) {
/* 640 */                           ((AtomicReference) this.I00iiI).notify();
/* 643 */                           throw th4;
                                }
                            }
                        case 17:
/* 453 */                   I00000oIO();
/* 456 */                   return;
                        case PoseLandmark.RIGHT_PINKY:
/* 395 */                   lOliOlO1Io loliolo1io2 = (lOliOlO1Io) this.I00iiI;
/* 399 */                   lli10iI lli10ii5 = (lli10iI) this.I00iiO;
/* 403 */                   iI0iiII1i ii0iiii1i2 = (iI0iiII1i) this.I00iio;
/* 407 */                   l0olllO1i l0olllo1i3 = (l0olllO1i) loliolo1io2.I00iOIl;
/* 409 */                   iolll0ill1i iolll0ill1iVar2 = loliolo1io2.I00iio;
/* 411 */                   if (iolll0ill1iVar2 == null) {
/* 413 */                       l01O0IO1ooO0 l01o0io1ooo06 = l0olllo1i3.I00ilO0;
/* 415 */                       l0olllO1i.I000II(l01o0io1ooo06);
/* 422 */                       l01o0io1ooo06.I00ilO0.I00000oOI("[sgtm] Discarding data. Failed to update batch upload status.");
/* 452 */                       return;
                            }
                            try {
/* 426 */                       iolll0ill1iVar2.I00IioO0OiOi(lli10ii5, ii0iiii1i2);
/* 429 */                       loliolo1io2.I0110OiO();
/* 452 */                       return;
                            } catch (RemoteException e8) {
/* 434 */                       l01O0IO1ooO0 l01o0io1ooo07 = l0olllo1i3.I00ilO0;
/* 436 */                       l0olllO1i.I000II(l01o0io1ooo07);
/* 449 */                       l01o0io1ooo07.I00ilO0.I0000O(Long.valueOf(ii0iiii1i2.I00iOIl), "[sgtm] Failed to update batch upload status, rowId, exception", e8);
/* 452 */                       return;
                            }
                        case PoseLandmark.LEFT_INDEX:
/* 366 */                   i0O1lIi1O0IO i0o1lii1o0io = (i0O1lIi1O0IO) this.I00iiI;
/* 370 */                   l01O0IO1ooO0 l01o0io1ooo08 = (l01O0IO1ooO0) this.I00iiO;
/* 374 */                   JobParameters jobParameters = (JobParameters) this.I00iio;
/* 380 */                   l01o0io1ooo08.I00lll10.I00000oOI("AppMeasurementJobService processed last upload request.");
/* 389 */                   ((lOo0oolIi1) ((Service) i0o1lii1o0io.I00iiI)).I00000oOI(jobParameters);
/* 392 */                   return;
                        case PoseLandmark.RIGHT_INDEX:
/* 119 */                   li10lI1 li10li1 = (li10lI1) this.I00iiI;
/* 123 */                   lIIl0IOioI liil0ioioi = (lIIl0IOioI) this.I00iiO;
/* 127 */                   zzg zzgVar = (zzg) this.I00iio;
/* 129 */                   HashMap map3 = li10li1.I000OiO;
/* 135 */                   iOIoo1lI ioioo1li = (iOIoo1lI) map3.get(liil0ioioi);
/* 137 */                   if (ioioo1li != null) {
/* 139 */                       iI0iIIo ii0iiio = ioioo1li.I00iiO;
/* 141 */                       iIOo111l iioo111l = ioioo1li.I00iOIl;
/* 143 */                       if (iioo111l == null) {
/* 147 */                           iioo111l = new iIOo111l(ioioo1li, ii0iiio);
/* 150 */                           ioioo1li.I00iOIl = iioo111l;
                                }
/* 152 */                       Iterator it4 = iioo111l.iterator();
/* 160 */                       while (it4.hasNext()) {
/* 162 */                           Object next = it4.next();
/* 172 */                           Object arrayList2 = (Collection) ii0iiio.get(next);
/* 174 */                           if (arrayList2 == null) {
/* 178 */                               arrayList2 = new ArrayList(i4);
                                    }
/* 181 */                           List list = (List) arrayList2;
/* 198 */                           ArrayList arrayList3 = new ArrayList(list instanceof RandomAccess ? new iIii0o1OII(ioioo1li, next, list, i1liliil11Var) : new i1liliil11(ioioo1li, next, list, i1liliil11Var));
/* 201 */                           Collections.sort(arrayList3);
/* 204 */                           Iterator it5 = arrayList3.iterator();
/* 208 */                           long jLongValue = 0;
/* 214 */                           while (it5.hasNext()) {
/* 226 */                               jLongValue = ((Long) it5.next()).longValue() + jLongValue;
                                    }
/* 244 */                           Long lValueOf4 = Long.valueOf((jLongValue / arrayList3.size()) & Long.MAX_VALUE);
/* 255 */                           Long lValueOf5 = Long.valueOf(li10lI1.I00000oIO(arrayList3, 100.0d) & Long.MAX_VALUE);
/* 272 */                           Long lValueOf6 = Long.valueOf(li10lI1.I00000oIO(arrayList3, 75.0d) & Long.MAX_VALUE);
/* 276 */                           iOIoo1lI ioioo1li2 = ioioo1li;
/* 286 */                           Long lValueOf7 = Long.valueOf(li10lI1.I00000oIO(arrayList3, 50.0d) & Long.MAX_VALUE);
/* 290 */                           iI0iIIo ii0iiio2 = ii0iiio;
/* 299 */                           Long lValueOf8 = Long.valueOf(li10lI1.I00000oIO(arrayList3, 25.0d) & Long.MAX_VALUE);
/* 303 */                           HashMap map4 = map3;
/* 312 */                           Long lValueOf9 = Long.valueOf(li10lI1.I00000oIO(arrayList3, 0.0d) & Long.MAX_VALUE);
/* 318 */                           l1o1O00 l1o1o00 = new l1o1O00();
/* 321 */                           l1o1o00.I00000oIO = lValueOf5;
/* 323 */                           l1o1o00.I00000oOI = lValueOf9;
/* 325 */                           l1o1o00.I0000Il00O = lValueOf4;
/* 327 */                           l1o1o00.I0000O = lValueOf8;
/* 329 */                           l1o1o00.I0000oI00 = lValueOf7;
/* 331 */                           l1o1o00.I0001Ioi1lo = lValueOf6;
/* 333 */                           VarHandle.storeStoreFence();
/* 348 */                           li10li1.I00000oOI(zzgVar.zza(next, arrayList3.size(), l1o1o00), liil0ioioi, li10li1.I0000O());
/* 351 */                           map3 = map4;
/* 352 */                           i4 = 3;
/* 353 */                           i1liliil11Var = null;
/* 354 */                           ii0iiio = ii0iiio2;
/* 355 */                           ioioo1li = ioioo1li2;
                                }
/* 360 */                       map3.remove(liil0ioioi);
/* 363 */                       return;
                            }
/* 363 */                   return;
                        case PoseLandmark.LEFT_THUMB:
/* 88 */                    I0Oi111ii i0Oi111ii = (I0Oi111ii) this.I00iiI;
/* 92 */                    Oio0llilli oio0llilli = (Oio0llilli) this.I00iiO;
/* 96 */                    o01IliI1I o01ilii1i = (o01IliI1I) this.I00iio;
                            try {
/* 98 */                        Object objI00000oIO = IlloOoiiO.I00000oIO(oio0llilli);
/* 104 */                       Oio0llilli oio0llilli2 = (Oio0llilli) i0Oi111ii.I00io1l;
/* 106 */                       oio0llilli2.I000l1(objI00000oIO);
/* 109 */                       o01ilii1i.I000o00OoI0I(oio0llilli2);
/* 116 */                       return;
                            } catch (Throwable unused3) {
/* 113 */                       o01ilii1i.I000o00OoI0I(oio0llilli);
/* 116 */                       return;
                            }
                        case PoseLandmark.RIGHT_THUMB:
/* 82 */                    I00000oOI();
/* 85 */                    return;
                        default:
/* 16 */                    o0ilO10O o0ilo10o = (o0ilO10O) this.I00iiI;
/* 20 */                    o01oIol1O o01oiol1o = (o01oIol1O) this.I00iiO;
/* 24 */                    OloIlI0ll oloIlI0ll2 = (OloIlI0ll) this.I00iio;
/* 26 */                    o0l101oi1li1 o0l101oi1li1Var = o0ilo10o.I000OOo1O;
                            try {
                                try {
/* 34 */                            if (o0ilo10o.I00000oOI(o01oiol1o, true) == null) {
/* 38 */                                Log.w("MLKit RemoteConfigRestC", "Cached remote config was null!");
                                    }
/* 46 */                            oloIlI0ll2.I00000oOI(null);
                                } finally {
/* 70 */                            o01oiol1o.I00000oOI();
/* 73 */                            o0l101oi1li1Var.getClass();
/* 78 */                            o0l101oi1li1Var.I0001Ioi1lo(lioiiIOoil.REMOTE_CONFIG_LOAD, o01oiol1o);
                                }
                            } catch (RuntimeException e9) {
/* 52 */                        Log.e("MLKit RemoteConfigRestC", "Load failed", e9);
/* 55 */                        oloIlI0ll2.I00000oIO(e9);
                            }
/* 58 */                    o01oiol1o.I00000oOI();
/* 61 */                    o0l101oi1li1Var.getClass();
/* 66 */                    o0l101oi1li1Var.I0001Ioi1lo(lioiiIOoil.REMOTE_CONFIG_LOAD, o01oiol1o);
/* 69 */                    return;
                    }
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case PoseLandmark.RIGHT_THUMB:
/* 13 */                    IO0iIlI1li iO0iIlI1li = (IO0iIlI1li) this.I00iio;
/* 27 */                    StringBuilder sb = new StringBuilder(iO0iIlI1li.toString().length() + 14);
/* 32 */                    sb.append("propagating=[");
/* 35 */                    sb.append(iO0iIlI1li);
/* 40 */                    sb.append("]");
/* 43 */                    return sb.toString();
                        default:
/* 6 */                     return super.toString();
                    }
                }
            }

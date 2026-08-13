            package p000;

            import android.app.admin.DevicePolicyManager;
            import android.content.Context;
            import android.content.pm.PackageManager;
            import android.content.pm.ServiceInfo;
            import android.hardware.camera2.CameraManager;
            import android.os.Build;
            import android.os.Bundle;
            import android.os.Trace;
            import android.util.ArrayMap;
            import com.google.ai.edge.gallery.data.local.BoxChatDatabase;
            import com.google.ai.edge.gallery.data.local.dao.ConversationDao;
            import com.google.ai.edge.gallery.data.local.dao.MessageDao;
            import com.google.ai.edge.gallery.data.local.dao.RagChunkDao;
            import com.google.ai.edge.gallery.data.local.dao.RagDocumentDao;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.Map;
            import java.util.concurrent.CopyOnWriteArrayList;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.ThreadFactory;
            
            public final class Ii10lO01Oi implements OOiIoli {
                public final int I00000oIO;
                public final int I00000oOI;
                public final Object I0000Il00O;

                public Ii10lO01Oi(Object obj, int i, int i2) {
/* 1 */             this.I00000oIO = i2;
/* 3 */             this.I0000Il00O = obj;
/* 5 */             this.I00000oOI = i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r3v21, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r9v0, types: [IOoil1iiIilo] */
                /* JADX WARN: Type inference failed for: r9v18 */
                /* JADX WARN: Type inference failed for: r9v32 */
                /* JADX WARN: Type inference failed for: r9v33 */
                @Override
                public final Object get() {
                    Map mapSingletonMap;
                    IIl10ilil1 iIl10ilil1;
                    String string;
                    IIlOil01ol iIlOil01ol;
/* 3 */             int i = this.I00000oIO;
/* 5 */             int i2 = 4;
/* 6 */             int i3 = 2;
/* 7 */             int i4 = 6;
/* 8 */             int i5 = this.I00000oOI;
/* 10 */            Object obj = this.I0000Il00O;
/* 12 */            int i6 = 3;
/* 13 */            int i7 = 1;
/* 14 */            int i8 = 0;
/* 15 */            IIioOOoI100 iIioOOoI100 = 0;
/* 15 */            iIioOOoI100 = 0;
/* 15 */            iIioOOoI100 = 0;
                    switch (i) {
                        case 0:
/* 594 */                   Ii10oo ii10oo = (Ii10oo) obj;
/* 596 */                   int i9 = 14;
/* 598 */                   int i10 = 9;
/* 600 */                   int i11 = 10;
                            switch (i5) {
                                case 0:
/* 2446 */                          O010OIi o010OIi = (O010OIi) ii10oo.I0000O.get();
/* 2448 */                          IIo000I0ilI iIo000I0ilI = new IIo000I0ilI();
/* 2451 */                          iIo000I0ilI.I00000oIO = o010OIi;
/* 2458 */                          iIo000I0ilI.I00000oOI = new Object();
/* 2465 */                          iIo000I0ilI.I0000Il00O = new ArrayList();
/* 2472 */                          iIo000I0ilI.I0000O = new Object();
/* 2479 */                          iIo000I0ilI.I0000oI00 = new ArrayList();
/* 2486 */                          iIo000I0ilI.I0001Ioi1lo = new Object();
/* 2493 */                          iIo000I0ilI.I000II = new ArrayList();
/* 2495 */                          VarHandle.storeStoreFence();
/* 2498 */                          return iIo000I0ilI;
                                case 1:
/* 2433 */                          return l01oO1iOo.I00000oIO();
                                case 2:
/* 2422 */                          IIl10ilil1 iIl10ilil12 = (IIl10ilil1) ii10oo.I001i1O0Ol.get();
/* 2424 */                          IIlOlol0liO iIlOlol0liO = new IIlOlol0liO();
/* 2427 */                          iIlOlol0liO.I00000oIO = iIl10ilil12;
/* 2429 */                          VarHandle.storeStoreFence();
/* 2498 */                          return iIlOlol0liO;
                                case 3:
/* 2197 */                          IIloIII11 iIloIII11 = (IIloIII11) ii10oo.I00000oIO.I00iiI;
/* 2199 */                          lII11l.I00000oOI(iIloIII11);
/* 2202 */                          Ii10lO01Oi ii10lO01Oi = ii10oo.I001IO000;
/* 2204 */                          ii10oo.I00000oIO();
/* 2221 */                          IIo000I0ilI iIo000I0ilI2 = (IIo000I0ilI) ii10oo.I0000oI00.get();
/* 2227 */                          Map map = (Map) iIloIII11.I0000O.I00iOIl;
                                    try {
/* 2231 */                              Trace.beginSection("Initialize defaultCameraBackend");
/* 2238 */                              IIil1o0olooo iIil1o0olooo = (IIil1o0olooo) ii10lO01Oi.get();
/* 2240 */                              Trace.endSection();
/* 2253 */                              if (map.containsKey(IIl10Ilo.I00000oIO("CXCP-Camera2"))) {
/* 2405 */                                  IOOlIIilOl0.I0001Ioi1lo(IIl10Ilo.I00000oOI("CXCP-Camera2"), "CameraBackendConfig#cameraBackends should not contain a backend with ", ". Use CameraBackendConfig#internalBackend field instead.");
/* 15 */                                    return null;
                                        }
/* 2255 */                              IIl10Ilo iIl10IloI00000oIO = IIl10Ilo.I00000oIO("CXCP-Camera2");
/* 2261 */                              IIo000ll110 iIo000ll110 = new IIo000ll110();
/* 2264 */                              iIo000ll110.I00000oIO = iIil1o0olooo;
/* 2266 */                              VarHandle.storeStoreFence();
/* 2273 */                              if (map.isEmpty()) {
/* 2275 */                                  mapSingletonMap = Collections.singletonMap(iIl10IloI00000oIO, iIo000ll110);
                                        } else {
/* 2282 */                                  LinkedHashMap linkedHashMap = new LinkedHashMap(map);
/* 2285 */                                  linkedHashMap.put(iIl10IloI00000oIO, iIo000ll110);
/* 2288 */                                  mapSingletonMap = linkedHashMap;
                                        }
/* 2297 */                              if (!mapSingletonMap.containsKey(IIl10Ilo.I00000oIO("CXCP-Camera2"))) {
/* 2377 */                                  StringBuilder sb = new StringBuilder("Failed to find ");
/* 2384 */                                  sb.append((Object) IIl10Ilo.I00000oOI("CXCP-Camera2"));
/* 2393 */                                  I000II.I000oI1ioi(sb, " in the list of available CameraPipe backends! Available values are ", mapSingletonMap.keySet());
/* 15 */                                    return null;
                                        }
/* 2301 */                              IIl10ilil1 iIl10ilil13 = new IIl10ilil1();
/* 2304 */                              iIl10ilil13.I00000oIO = mapSingletonMap;
/* 2311 */                              iIl10ilil13.I00000oOI = new Object();
/* 2318 */                              iIl10ilil13.I0000Il00O = new LinkedHashMap();
/* 2320 */                              IIlooO0iI iIlooO0iI = IIlooO0iI.I00iOIl;
/* 2324 */                              I0100i i0100i = new I0100i(i11);
/* 2327 */                              i0100i.I00iiI = iIl10ilil13;
/* 2329 */                              VarHandle.storeStoreFence();
/* 2332 */                              iIo000I0ilI2.I00000oIO(iIlooO0iI, i0100i);
/* 2335 */                              IIil1o0olooo iIil1o0oloooI00000oIO = iIl10ilil13.I00000oIO("CXCP-Camera2");
/* 2339 */                              if (iIil1o0oloooI00000oIO != null) {
/* 2341 */                                  iIl10ilil13.I0000O = iIil1o0oloooI00000oIO;
/* 2343 */                                  VarHandle.storeStoreFence();
                                            iIl10ilil1 = iIl10ilil13;
/* 1825 */                                  return iIl10ilil1;
                                        }
/* 2352 */                              StringBuilder sb2 = new StringBuilder("Failed to load the default backend for ");
/* 2359 */                              sb2.append((Object) IIl10Ilo.I00000oOI("CXCP-Camera2"));
/* 2368 */                              I000II.I000oI1ioi(sb2, "! Available backends are ", mapSingletonMap.keySet());
/* 15 */                                return null;
                                    } catch (Throwable th) {
/* 2410 */                              Trace.endSection();
/* 2413 */                              throw th;
                                    }
                                case 4:
/* 2122 */                          Oo10IliO00O oo10IliO00O = (Oo10IliO00O) ii10oo.I0001Ioi1lo.get();
/* 2130 */                          IIl01i0I iIl01i0I = (IIl01i0I) ii10oo.I000iOII.get();
/* 2138 */                          IIl0oO iIl0oO = (IIl0oO) ii10oo.I000o00OoI0I.get();
/* 2146 */                          OOiOlo1l0I0o oOiOlo1l0I0o = (OOiOlo1l0I0o) ii10oo.I001IIilI0O.get();
/* 2150 */                          Oi00IilOloo0 oi00IilOloo0 = new Oi00IilOloo0();
/* 2153 */                          oi00IilOloo0.I00iOIl = ii10oo;
/* 2155 */                          VarHandle.storeStoreFence();
/* 2158 */                          ii10oo.I00000oIO();
/* 2161 */                          IIil1o0olooo iIil1o0olooo2 = new IIil1o0olooo();
/* 2164 */                          iIil1o0olooo2.I00000oIO = oo10IliO00O;
/* 2166 */                          iIil1o0olooo2.I00000oOI = iIl01i0I;
/* 2168 */                          iIil1o0olooo2.I0000Il00O = iIl0oO;
/* 2170 */                          iIil1o0olooo2.I0000O = oOiOlo1l0I0o;
/* 2172 */                          iIil1o0olooo2.I0000oI00 = oi00IilOloo0;
/* 2179 */                          iIil1o0olooo2.I0001Ioi1lo = new Object();
/* 2186 */                          iIil1o0olooo2.I000II = new LinkedHashSet();
/* 2188 */                          VarHandle.storeStoreFence();
/* 2498 */                          return iIil1o0olooo2;
                                case 5:
/* 1828 */                          Oo0olliOi1 oo0olliOi1 = ii10oo.I00000oOI;
/* 1836 */                          IIo000I0ilI iIo000I0ilI3 = (IIo000I0ilI) ii10oo.I0000oI00.get();
/* 1844 */                          O010OIi o010OIi2 = (O010OIi) ii10oo.I0000O.get();
/* 1846 */                          int i12 = oo0olliOi1.I0000oI00;
/* 1850 */                          ArrayList arrayList = new ArrayList();
/* 1857 */                          ((IIloIo1I0i) oo0olliOi1.I0001Ioi1lo).getClass();
/* 1860 */                          ThreadFactory threadFactory = I1010l011o.I00000oOI;
/* 1874 */                          ScheduledExecutorService scheduledExecutorServiceI00000oIO = I1010l011o.I00000oIO(I1010l011o.I00000oOI(I1010l011o.I0000Il00O(threadFactory, "CXCP-IO-"), i12), 8);
/* 1878 */                          arrayList.add(scheduledExecutorServiceI00000oIO);
/* 1881 */                          Ii00lIOoi ii00lIOoiI00000oIO = ilIl1O1ii0Oo.I00000oIO(scheduledExecutorServiceI00000oIO);
/* 1897 */                          ScheduledExecutorService scheduledExecutorServiceI00000oIO2 = I1010l011o.I00000oIO(I1010l011o.I00000oOI(I1010l011o.I0000Il00O(threadFactory, "CXCP-BG-"), i12), oo0olliOi1.I0000Il00O);
/* 1901 */                          arrayList.add(scheduledExecutorServiceI00000oIO2);
/* 1904 */                          Ii00lIOoi ii00lIOoiI00000oIO2 = ilIl1O1ii0Oo.I00000oIO(scheduledExecutorServiceI00000oIO2);
/* 1922 */                          ScheduledExecutorService scheduledExecutorServiceI00000oIO3 = I1010l011o.I00000oIO(I1010l011o.I00000oOI(I1010l011o.I0000Il00O(threadFactory, "CXCP-"), oo0olliOi1.I0000O), oo0olliOi1.I00000oOI);
/* 1926 */                          arrayList.add(scheduledExecutorServiceI00000oIO3);
/* 1929 */                          Ii00lIOoi ii00lIOoiI00000oIO3 = ilIl1O1ii0Oo.I00000oIO(scheduledExecutorServiceI00000oIO3);
/* 1933 */                          IIlooO0iI iIlooO0iI2 = IIlooO0iI.I00iiO;
/* 1937 */                          OOIl1i1 oOIl1i1 = new OOIl1i1(i9);
/* 1940 */                          oOIl1i1.I00iiI = arrayList;
/* 1942 */                          VarHandle.storeStoreFence();
/* 1945 */                          iIo000I0ilI3.I00000oIO(iIlooO0iI2, oOIl1i1);
/* 1950 */                          Oo0olOi oo0olOi = new Oo0olOi(i8);
/* 1953 */                          oo0olOi.I00iiI = oo0olliOi1;
/* 1955 */                          oo0olOi.I00iiO = iIo000I0ilI3;
/* 1957 */                          VarHandle.storeStoreFence();
/* 1962 */                          Oo0olOi oo0olOi2 = new Oo0olOi(i7);
/* 1965 */                          oo0olOi2.I00iiI = oo0olliOi1;
/* 1967 */                          oo0olOi2.I00iiO = iIo000I0ilI3;
/* 1969 */                          VarHandle.storeStoreFence();
/* 1974 */                          OOo0ooi oOo0ooi = new OOo0ooi();
/* 1979 */                          OOo0ooi oOo0ooi2 = new OOo0ooi();
/* 2006 */                          oOo0ooi.I00iOIl = il001oo1.I00000oIO(iiollilo0IO1.I00000oIO(new Oliiii0(o010OIi2), ii00lIOoiI00000oIO3).I00ioIO(new Ii00oll("CXCP")));
/* 2028 */                          oOo0ooi2.I00iOIl = il001oo1.I00000oIO(iiollilo0IO1.I00000oIO(new Oliiii0(o010OIi2), new Ii00oll("CXCP-Dispatch")));
/* 2030 */                          IIlooO0iI iIlooO0iI3 = IIlooO0iI.I00iiI;
/* 2036 */                          Io11iII11ll io11iII11ll = new Io11iII11ll(22);
/* 2039 */                          io11iII11ll.I00iiI = oOo0ooi;
/* 2041 */                          io11iII11ll.I00iiO = oOo0ooi2;
/* 2043 */                          VarHandle.storeStoreFence();
/* 2046 */                          iIo000I0ilI3.I00000oIO(iIlooO0iI3, io11iII11ll);
/* 2053 */                          Ii0110 ii0110 = (Ii0110) oOo0ooi.I00iOIl;
/* 2057 */                          Ii0110 ii01102 = (Ii0110) oOo0ooi2.I00iOIl;
/* 2059 */                          Oo10IliO00O oo10IliO00O2 = new Oo10IliO00O();
/* 2062 */                          oo10IliO00O2.I00000oIO = ii0110;
/* 2064 */                          oo10IliO00O2.I00000oOI = ii01102;
/* 2066 */                          oo10IliO00O2.I0000Il00O = ii00lIOoiI00000oIO;
/* 2068 */                          oo10IliO00O2.I0000O = ii00lIOoiI00000oIO2;
/* 2070 */                          oo10IliO00O2.I0000oI00 = scheduledExecutorServiceI00000oIO3;
/* 2072 */                          oo10IliO00O2.I0001Ioi1lo = ii00lIOoiI00000oIO3;
/* 2076 */                          I0O1OI i0o1oi = new I0O1OI(22);
/* 2079 */                          i0o1oi.I00iiI = oo0olOi;
/* 2081 */                          VarHandle.storeStoreFence();
/* 2089 */                          oo10IliO00O2.I000II = new OllO00oiil(i0o1oi);
/* 2093 */                          OlOi0iollo olOi0iollo = new OlOi0iollo(i11);
/* 2096 */                          olOi0iollo.I00iiI = oo0olOi2;
/* 2098 */                          VarHandle.storeStoreFence();
/* 2106 */                          oo10IliO00O2.I000O01llI0 = new OllO00oiil(olOi0iollo);
/* 2108 */                          VarHandle.storeStoreFence();
/* 2111 */                          return oo10IliO00O2;
                                case 6:
/* 1589 */                          OOiIoli oOiIoli = ii10oo.I000II;
/* 1597 */                          Oo10IliO00O oo10IliO00O3 = (Oo10IliO00O) ii10oo.I0001Ioi1lo.get();
/* 1599 */                          ii10oo.I00000oIO();
/* 1608 */                          PackageManager packageManager = (PackageManager) ii10oo.I000O01llI0.get();
/* 1616 */                          IIl0l10l iIl0l10l = (IIl0l10l) ii10oo.I000OOo1O.get();
/* 1618 */                          OOiIoli oOiIoli2 = ii10oo.I000OiO;
/* 1626 */                          IIo000I0ilI iIo000I0ilI4 = (IIo000I0ilI) ii10oo.I0000oI00.get();
/* 1634 */                          O010OIi o010OIi3 = (O010OIi) ii10oo.I0000O.get();
/* 1636 */                          IIl01i0I iIl01i0I2 = new IIl01i0I();
/* 1639 */                          iIl01i0I2.I00000oIO = oOiIoli;
/* 1641 */                          iIl01i0I2.I00000oOI = oo10IliO00O3;
/* 1643 */                          iIl01i0I2.I0000Il00O = iIl0l10l;
/* 1645 */                          iIl01i0I2.I0000O = oOiIoli2;
/* 1669 */                          IIOlO1ii iIOlO1iiI00000oIO = il001oo1.I00000oIO(iiollilo0IO1.I00000oIO(new Oliiii0(o010OIi3), oo10IliO00O3.I0001Ioi1lo).I00ioIO(new Ii00oll("Camera2DeviceCache")));
/* 1673 */                          iIl01i0I2.I0000oI00 = iIOlO1iiI00000oIO;
/* 1680 */                          iIl01i0I2.I0001Ioi1lo = new Object();
/* 1687 */                          iIl01i0I2.I000O01llI0 = new LinkedHashMap();
/* 1694 */                          iIl01i0I2.I000OOo1O = new LinkedHashMap();
/* 1698 */                          ?? HasSystemFeature = packageManager.hasSystemFeature("android.hardware.camera");
                                    int i13 = HasSystemFeature;
/* 1708 */                          if (packageManager.hasSystemFeature("android.hardware.camera.front")) {
/* 1710 */                              i13 = HasSystemFeature + 1;
                                    }
/* 1712 */                          iIl01i0I2.I000OiO = i13;
/* 1714 */                          IIlooO0iI iIlooO0iI4 = IIlooO0iI.I00iiI;
/* 1718 */                          I0100i i0100i2 = new I0100i(i10);
/* 1721 */                          i0100i2.I00iiI = iIl01i0I2;
/* 1723 */                          VarHandle.storeStoreFence();
/* 1726 */                          iIo000I0ilI4.I00000oIO(iIlooO0iI4, i0100i2);
/* 1740 */                          IlOil1ii ilOil1iiI00000oIO = iIOIO0IO0l.I00000oIO(ilOl0O00Il0i.I00000oIO(new I00oI0i(iIl01i0I2, (IOoil1iiIilo) iIioOOoI100, 17)));
/* 1744 */                          OlO00IIi olO00IIiI00000oIO = Ol00III.I00000oIO(3);
/* 1748 */                          o00io0IiOOo0 o00io0iiooo0I00000oOI = ilOoiIi101.I00000oOI(ilOil1iiI00000oIO);
/* 1758 */                          Oiolio oiolioI00000oIO = Oiolio0iO1.I00000oIO(1, o00io0iiooo0I00000oOI.I00iiI, (IIII0i) o00io0iiooo0I00000oOI.I00iio);
/* 1803 */                          iIl01i0I2.I000iOII = new OOli00O001(oiolioI00000oIO, iOi1II01i0.I0000Il00O(iIOlO1iiI00000oIO, (Ii00l101O) o00io0iiooo0I00000oOI.I00ilI0I1, olO00IIiI00000oIO.equals(Ol00III.I00000oIO) ? Ii01I10.I00iOIl : Ii01I10.I00iio, new I0iOI0o1i(olO00IIiI00000oIO, (IlOil1ii) o00io0iiooo0I00000oOI.I00iiO, oiolioI00000oIO, Oiolio0iO1.I00000oIO, (IOoil1iiIilo) null, 21)));
/* 1807 */                          I0OIOO00l0O i0OIOO00l0O = new I0OIOO00l0O(i9);
/* 1810 */                          i0OIOO00l0O.I00iiI = iIl01i0I2;
/* 1812 */                          VarHandle.storeStoreFence();
/* 1820 */                          iIl01i0I2.I000l1 = new OllO00oiil(i0OIOO00l0O);
/* 1822 */                          VarHandle.storeStoreFence();
                                    iIl10ilil1 = iIl01i0I2;
/* 1825 */                          return iIl10ilil1;
                                case 7:
/* 1583 */                          return (CameraManager) ii10oo.I00000oIO().getSystemService("camera");
                                case 8:
/* 1566 */                          return ii10oo.I00000oIO().getPackageManager();
                                case 9:
/* 1540 */                          IIl0l10l iIl0l10l2 = new IIl0l10l();
/* 1548 */                          iIl0l10l2.I00000oIO = new Object();
/* 1555 */                          iIl0l10l2.I00000oOI = new LinkedHashMap();
/* 1557 */                          VarHandle.storeStoreFence();
/* 2498 */                          return iIl0l10l2;
                                case 10:
/* 1407 */                          Context contextI00000oIO = ii10oo.I00000oIO();
/* 1413 */                          IIlOil01ol iIlOil01ol2 = new IIlOil01ol();
/* 1420 */                          if (Build.VERSION.SDK_INT >= 35) {
/* 1424 */                              IIioOOoI100 iIioOOoI1002 = new IIioOOoI100();
/* 1435 */                              iIioOOoI1002.I00000oIO = (CameraManager) contextI00000oIO.getSystemService(CameraManager.class);
/* 1437 */                              VarHandle.storeStoreFence();
/* 1440 */                              iIlOil01ol2.I00000oOI = iIioOOoI1002;
                                    }
                                    try {
/* 1456 */                              ServiceInfo[] serviceInfoArr = contextI00000oIO.getPackageManager().getPackageInfo(contextI00000oIO.getPackageName(), 132).services;
/* 1458 */                              if (serviceInfoArr != null) {
/* 1461 */                                  int length = serviceInfoArr.length;
/* 1462 */                                  String str = null;
/* 1463 */                                  while (i8 < length) {
/* 1467 */                                      Bundle bundle = serviceInfoArr[i8].metaData;
/* 1469 */                                      if (bundle != null && (string = bundle.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY")) != null) {
/* 1480 */                                          if (str != null) {
/* 1486 */                                              I000II.I001IO000("Multiple Play Services CameraDeviceSetupCompat implementations found in the manifest.");
/* 15 */                                                return null;
                                                    }
/* 1482 */                                          str = string;
                                                }
/* 1491 */                                      i8++;
                                            }
/* 1494 */                                  if (str != null) {
                                                try {
/* 1519 */                                          iIioOOoI100 = (IIioOOoI100) Class.forName(str).getConstructor(Context.class).newInstance(contextI00000oIO);
                                                } catch (Exception e) {
/* 1526 */                                          IoOOl0iOl1io.I000l1("Failed to instantiate Play Services CameraDeviceSetupCompat implementation", e);
/* 15 */                                            return null;
                                                }
                                            }
                                        }
                                    } catch (PackageManager.NameNotFoundException unused) {
                                    }
/* 1531 */                          iIlOil01ol2.I00000oIO = iIioOOoI100;
/* 1533 */                          VarHandle.storeStoreFence();
                                    iIlOil01ol = iIlOil01ol2;
/* 1130 */                          return iIlOil01ol;
                                case 11:
/* 1331 */                          Context contextI00000oIO2 = ii10oo.I00000oIO();
/* 1341 */                          Oo10IliO00O oo10IliO00O4 = (Oo10IliO00O) ii10oo.I0001Ioi1lo.get();
/* 1349 */                          OO0l1l oO0l1l = (OO0l1l) ii10oo.I000l1.get();
/* 1355 */                          IIloIII11 iIloIII112 = (IIloIII11) ii10oo.I00000oIO.I00iiI;
/* 1357 */                          lII11l.I00000oOI(iIloIII112);
/* 1360 */                          IoloOio0I ioloOio0I = iIloIII112.I0000Il00O;
/* 1370 */                          IIl0oO iIl0oO2 = new IIl0oO();
/* 1373 */                          iIl0oO2.I00000oIO = contextI00000oIO2;
/* 1375 */                          iIl0oO2.I00000oOI = oo10IliO00O4;
/* 1377 */                          iIl0oO2.I0000Il00O = oO0l1l;
/* 1379 */                          iIl0oO2.I0000O = ioloOio0I;
/* 1386 */                          iIl0oO2.I0000oI00 = new ArrayMap();
/* 1393 */                          iIl0oO2.I0001Ioi1lo = new ArrayMap();
/* 1400 */                          iIl0oO2.I000II = new ArrayMap();
/* 1402 */                          VarHandle.storeStoreFence();
/* 2498 */                          return iIl0oO2;
                                case 12:
/* 1315 */                          Context contextI00000oIO3 = ii10oo.I00000oIO();
/* 1319 */                          OO0l1l oO0l1l2 = new OO0l1l();
/* 1322 */                          oO0l1l2.I00000oIO = contextI00000oIO3;
/* 1324 */                          VarHandle.storeStoreFence();
/* 2498 */                          return oO0l1l2;
                                case 13:
/* 1308 */                          return new Olli1lO0o0i0();
                                case 14:
/* 1149 */                          Oi111lO oi111lO = (Oi111lO) ii10oo.I0010o.get();
/* 1157 */                          IIl0O0iioOO iIl0O0iioOO = (IIl0O0iioOO) ii10oo.I00111O.get();
/* 1165 */                          IIl0l10l iIl0l10l3 = (IIl0l10l) ii10oo.I000OOo1O.get();
/* 1173 */                          Oo10IliO00O oo10IliO00O5 = (Oo10IliO00O) ii10oo.I0001Ioi1lo.get();
/* 1175 */                          OOiOlo1l0I0o oOiOlo1l0I0o2 = new OOiOlo1l0I0o();
/* 1178 */                          oOiOlo1l0I0o2.I00000oIO = oi111lO;
/* 1180 */                          oOiOlo1l0I0o2.I00000oOI = iIl0O0iioOO;
/* 1182 */                          oOiOlo1l0I0o2.I0000Il00O = iIl0l10l3;
/* 1184 */                          Ii0110 ii01103 = oo10IliO00O5.I00000oIO;
/* 1186 */                          oOiOlo1l0I0o2.I0000O = ii01103;
/* 1203 */                          I00oII i00oII = new I00oII(1, oOiOlo1l0I0o2, OOiOlo1l0I0o.class, "prune", "prune$camera_camera2_pipe(Ljava/util/List;)V", 0, 13);
/* 1210 */                          O1iIlllIoo o1iIlllIoo = new O1iIlllIoo(oOiOlo1l0I0o2, iIioOOoI100, 13);
/* 1213 */                          iOliil ioliil = new iOliil(i11);
/* 1216 */                          ioliil.I00iiI = i00oII;
/* 1218 */                          ioliil.I00iiO = o1iIlllIoo;
/* 1220 */                          I1Ool1IoO110 i1Ool1IoO110I00000oIO = iOOOIOoiIlII.I00000oIO(false);
/* 1226 */                          OIoO1Ol oIoO1Ol = new OIoO1Ol(i10);
/* 1229 */                          oIoO1Ol.I00iiI = ioliil;
/* 1231 */                          VarHandle.storeStoreFence();
/* 1241 */                          ioliil.I00iio = iOl1iOi0I.I00000oIO(Integer.MAX_VALUE, null, oIoO1Ol, 2);
/* 1248 */                          ioliil.I00ilI0I1 = new I1Il0loi();
/* 1250 */                          VarHandle.storeStoreFence();
/* 1257 */                          if (!i1Ool1IoO110I00000oIO.I00000oIO()) {
/* 1301 */                              I000II.I001IO000("PruningProcessingQueue cannot be re-started!");
/* 15 */                                return null;
                                    }
/* 1272 */                          if (iOi1II01i0.I0000O(ii01103, null, null, new O1iOlO(ioliil, (IOoil1iiIilo) iIioOOoI100, i2), 3).isCancelled()) {
/* 1274 */                              ioliil.I000oI1ioi(null);
                                    }
/* 1277 */                          oOiOlo1l0I0o2.I0000oI00 = ioliil;
/* 1284 */                          oOiOlo1l0I0o2.I0001Ioi1lo = new LinkedHashSet();
/* 1291 */                          oOiOlo1l0I0o2.I000II = new ArrayList();
/* 1293 */                          VarHandle.storeStoreFence();
/* 1296 */                          return oOiOlo1l0I0o2;
                                case 15:
/* 920 */                           OOiIoli oOiIoli3 = ii10oo.I000II;
/* 922 */                           IIloOI iIloOI = ii10oo.I00000oIO;
/* 930 */                           Oo10IliO00O oo10IliO00O6 = (Oo10IliO00O) ii10oo.I0001Ioi1lo.get();
/* 932 */                           OlOO1i11110 olOO1i11110 = new OlOO1i11110(i4);
/* 935 */                           olOO1i11110.I00iiI = oOiIoli3;
/* 937 */                           olOO1i11110.I00iiO = oo10IliO00O6;
/* 939 */                           VarHandle.storeStoreFence();
/* 948 */                           IIl0oO iIl0oO3 = (IIl0oO) ii10oo.I000o00OoI0I.get();
/* 956 */                           IIl0l10l iIl0l10l4 = (IIl0l10l) ii10oo.I000OOo1O.get();
/* 964 */                           IIl10I1 iIl10I1 = (IIl10I1) ii10oo.I00100l0.get();
/* 972 */                           Olli1lO0o0i0 olli1lO0o0i0 = (Olli1lO0o0i0) ii10oo.I000lI.get();
/* 976 */                           IIloIII11 iIloIII113 = (IIloIII11) iIloOI.I00iiI;
/* 978 */                           lII11l.I00000oOI(iIloIII113);
/* 981 */                           IIlo110 iIlo110 = iIloIII113.I0000oI00;
/* 989 */                           Oo10IliO00O oo10IliO00O7 = (Oo10IliO00O) ii10oo.I0001Ioi1lo.get();
/* 991 */                           IIo11l1iO iIo11l1iO = new IIo11l1iO();
/* 994 */                           iIo11l1iO.I00iOIl = olOO1i11110;
/* 996 */                           iIo11l1iO.I00iiI = iIl0oO3;
/* 998 */                           iIo11l1iO.I00iiO = iIl0l10l4;
/* 1000 */                          iIo11l1iO.I00iio = iIl10I1;
/* 1002 */                          iIo11l1iO.I00ilI0I1 = olli1lO0o0i0;
/* 1004 */                          iIo11l1iO.I00ilO0 = iIlo110;
/* 1006 */                          iIo11l1iO.I00io1l = oo10IliO00O7;
/* 1013 */                          iIo11l1iO.I00ioIO = new IOi10loi();
/* 1015 */                          VarHandle.storeStoreFence();
/* 1024 */                          IIl0l10l iIl0l10l5 = (IIl0l10l) ii10oo.I000OOo1O.get();
/* 1028 */                          OOiIoli oOiIoli4 = ii10oo.I000II;
/* 1036 */                          Oo10IliO00O oo10IliO00O8 = (Oo10IliO00O) ii10oo.I0001Ioi1lo.get();
/* 1044 */                          O010OIi o010OIi4 = (O010OIi) ii10oo.I0000O.get();
/* 1046 */                          o01l1ioOo0 o01l1iooo0 = new o01l1ioOo0();
/* 1049 */                          o01l1iooo0.I00iOIl = oOiIoli4;
/* 1051 */                          o01l1iooo0.I00iiI = oo10IliO00O8;
/* 1053 */                          o01l1iooo0.I00iiO = o010OIi4;
/* 1066 */                          o01l1iooo0.I00iio = ilOl0O00Il0i.I00000oIO(new I00oI0i(o01l1iooo0, (IOoil1iiIilo) iIioOOoI100, 15));
/* 1068 */                          VarHandle.storeStoreFence();
/* 1085 */                          I0o0l0loiO i0o0l0loiO = (I0o0l0loiO) ii10oo.I00100o1O0lo.get();
/* 1093 */                          I1iIilO0io01 i1iIilO0io01 = (I1iIilO0io01) ii10oo.I0010I0i.get();
/* 1097 */                          IIloIII11 iIloIII114 = (IIloIII11) iIloOI.I00iiI;
/* 1099 */                          lII11l.I00000oOI(iIloIII114);
/* 1102 */                          IIlo110 iIlo1102 = iIloIII114.I0000oI00;
/* 1112 */                          Oi111lO oi111lO2 = new Oi111lO();
/* 1115 */                          oi111lO2.I00000oIO = iIo11l1iO;
/* 1117 */                          oi111lO2.I00000oOI = iIl0l10l5;
/* 1119 */                          oi111lO2.I0000Il00O = o01l1iooo0;
/* 1121 */                          oi111lO2.I0000O = i0o0l0loiO;
/* 1123 */                          oi111lO2.I0000oI00 = i1iIilO0io01;
/* 1125 */                          oi111lO2.I0001Ioi1lo = iIlo1102;
/* 1127 */                          VarHandle.storeStoreFence();
                                    iIlOil01ol = oi111lO2;
/* 1130 */                          return iIlOil01ol;
                                case 16:
/* 892 */                           IIl0oO iIl0oO4 = (IIl0oO) ii10oo.I000o00OoI0I.get();
/* 900 */                           OlOl1I olOl1I = (OlOl1I) ii10oo.I000oI1ioi.get();
/* 902 */                           IIl10I1 iIl10I12 = new IIl10I1();
/* 905 */                           iIl10I12.I00000oIO = iIl0oO4;
/* 907 */                           iIl10I12.I00000oOI = olOl1I;
/* 909 */                           VarHandle.storeStoreFence();
/* 2498 */                          return iIl10I12;
                                case 17:
/* 872 */                           IIloIil iIloIil = ((IIloIII11) ii10oo.I00000oIO.I00iiI).I0001Ioi1lo;
/* 876 */                           OlOl1I olOl1I2 = new OlOl1I();
/* 879 */                           VarHandle.storeStoreFence();
/* 2498 */                          return olOl1I2;
                                case PoseLandmark.RIGHT_PINKY:
/* 854 */                           DevicePolicyManager devicePolicyManager = (DevicePolicyManager) ii10oo.I00000oIO().getSystemService("device_policy");
/* 856 */                           I0o0l0loiO i0o0l0loiO2 = new I0o0l0loiO();
/* 859 */                           i0o0l0loiO2.I00000oIO = devicePolicyManager;
/* 861 */                           VarHandle.storeStoreFence();
/* 2498 */                          return i0o0l0loiO2;
                                case PoseLandmark.LEFT_INDEX:
/* 734 */                           Oo10IliO00O oo10IliO00O9 = (Oo10IliO00O) ii10oo.I0001Ioi1lo.get();
/* 742 */                           IIo000I0ilI iIo000I0ilI5 = (IIo000I0ilI) ii10oo.I0000oI00.get();
/* 750 */                           O010OIi o010OIi5 = (O010OIi) ii10oo.I0000O.get();
/* 752 */                           I1iIilO0io01 i1iIilO0io012 = new I1iIilO0io01();
/* 781 */                           i1iIilO0io012.I00000oIO = il001oo1.I00000oIO(iiollilo0IO1.I00000oIO(new Oliiii0(o010OIi5), iiollilo0IO1.I00000oIO(oo10IliO00O9.I0001Ioi1lo, new Ii00oll("CXCP-AudioRestrictionControllerImpl"))));
/* 785 */                           IIOOoll iIOOoll = new IIOOoll(i11);
/* 793 */                           iIOOoll.I00iiI = new OI1I0OoOl();
/* 795 */                           VarHandle.storeStoreFence();
/* 798 */                           i1iIilO0io012.I00000oOI = iIOOoll;
/* 805 */                           i1iIilO0io012.I0000Il00O = new Object();
/* 812 */                           i1iIilO0io012.I0000O = new LinkedHashMap();
/* 819 */                           i1iIilO0io012.I0000oI00 = new CopyOnWriteArrayList();
/* 821 */                           IIlooO0iI iIlooO0iI5 = IIlooO0iI.I00iiI;
/* 826 */                           I0100i i0100i3 = new I0100i(7);
/* 829 */                           i0100i3.I00iiI = i1iIilO0io012;
/* 831 */                           VarHandle.storeStoreFence();
/* 834 */                           iIo000I0ilI5.I00000oIO(iIlooO0iI5, i0100i3);
/* 837 */                           VarHandle.storeStoreFence();
/* 2498 */                          return i1iIilO0io012;
                                case PoseLandmark.RIGHT_INDEX:
/* 696 */                           Oo10IliO00O oo10IliO00O10 = (Oo10IliO00O) ii10oo.I0001Ioi1lo.get();
/* 704 */                           IIl10I1 iIl10I13 = (IIl10I1) ii10oo.I00100l0.get();
/* 714 */                           IIl0O0iioOO iIl0O0iioOO2 = new IIl0O0iioOO();
/* 717 */                           iIl0O0iioOO2.I00000oIO = oo10IliO00O10;
/* 719 */                           iIl0O0iioOO2.I00000oOI = iIl10I13;
/* 721 */                           VarHandle.storeStoreFence();
/* 2498 */                          return iIl0O0iioOO2;
                                case PoseLandmark.LEFT_THUMB:
/* 662 */                           ii10oo.I00000oIO();
/* 683 */                           return new IIo00Oi10l();
                                case PoseLandmark.RIGHT_THUMB:
/* 633 */                           IIoI1li1o1l iIoI1li1o1l = new IIoI1li1o1l();
/* 641 */                           iIoI1li1o1l.I00000oIO = new Object();
/* 648 */                           iIoI1li1o1l.I00000oOI = new LinkedHashMap();
/* 655 */                           iIoI1li1o1l.I0000Il00O = new LinkedHashSet();
/* 657 */                           VarHandle.storeStoreFence();
/* 2498 */                          return iIoI1li1o1l;
                                case PoseLandmark.LEFT_HIP:
/* 613 */                           IOlOloooi iOlOloooi = new IOlOloooi();
/* 618 */                           new LinkedHashMap();
/* 623 */                           new LinkedHashSet();
/* 626 */                           VarHandle.storeStoreFence();
/* 2498 */                          return iOlOloooi;
                                default:
/* 610 */                           throw new AssertionError(i5);
                            }
                        default:
/* 19 */                    Ii110ilOil ii110ilOil = (Ii110ilOil) obj;
                            switch (i5) {
                                case 0:
/* 542 */                           Ii1I1ooo10O0 ii1I1ooo10O0 = (Ii1I1ooo10O0) ii110ilOil.I0000O.get();
/* 550 */                           Ii1I1ooo10O0 ii1I1ooo10O02 = (Ii1I1ooo10O0) ii110ilOil.I0001Ioi1lo.get();
/* 566 */                           Ii1I1ooo10O0 ii1I1ooo10O03 = (Ii1I1ooo10O0) ii110ilOil.I000OiO.get();
/* 574 */                           Ii1I1ooo10O0 ii1I1ooo10O04 = (Ii1I1ooo10O0) ii110ilOil.I000l1.get();
/* 578 */                           Ii1liIllli0 ii1liIllli0 = new Ii1liIllli0();
/* 581 */                           ii1liIllli0.I00000oIO = ii1I1ooo10O0;
/* 583 */                           ii1liIllli0.I00000oOI = ii1I1ooo10O02;
/* 585 */                           ii1liIllli0.I0000Il00O = ii1I1ooo10O03;
/* 587 */                           ii1liIllli0.I0000O = ii1I1ooo10O04;
/* 589 */                           VarHandle.storeStoreFence();
/* 592 */                           return ii1liIllli0;
                                case 1:
/* 511 */                           Context context = ii110ilOil.I00000oIO.I00iOIl;
/* 519 */                           OiliO1i1iIII oiliO1i1iIII = (OiliO1i1iIII) ii110ilOil.I0000Il00O.get();
/* 523 */                           I000OOo1O i000OOo1O = new I000OOo1O(i2);
/* 526 */                           i000OOo1O.I00iiI = context;
/* 528 */                           VarHandle.storeStoreFence();
/* 531 */                           return IOO0o0I1l.I0000Il00O(oiliO1i1iIII, i000OOo1O);
                                case 2:
/* 506 */                           return OioIo10ii1l.I00000oIO;
                                case 3:
/* 480 */                           Context context2 = ii110ilOil.I00000oIO.I00iOIl;
/* 488 */                           OiliO1i1iIII oiliO1i1iIII2 = (OiliO1i1iIII) ii110ilOil.I0000oI00.get();
/* 493 */                           I000OOo1O i000OOo1O2 = new I000OOo1O(5);
/* 496 */                           i000OOo1O2.I00iiI = context2;
/* 498 */                           VarHandle.storeStoreFence();
/* 501 */                           return IOO0o0I1l.I0000Il00O(oiliO1i1iIII2, i000OOo1O2);
                                case 4:
/* 475 */                           return Ooli1ll1lI0.I00000oIO;
                                case 5:
/* 449 */                           Context context3 = ii110ilOil.I00000oIO.I00iOIl;
/* 457 */                           OiliO1i1iIII oiliO1i1iIII3 = (OiliO1i1iIII) ii110ilOil.I000II.get();
/* 461 */                           I000OOo1O i000OOo1O3 = new I000OOo1O(i3);
/* 464 */                           i000OOo1O3.I00iiI = context3;
/* 466 */                           VarHandle.storeStoreFence();
/* 469 */                           return IOO0o0I1l.I0000Il00O(oiliO1i1iIII3, i000OOo1O3);
                                case 6:
/* 443 */                           return Ii0lOio.I00000oIO;
                                case 7:
/* 417 */                           Context context4 = ii110ilOil.I00000oIO.I00iOIl;
/* 425 */                           OiliO1i1iIII oiliO1i1iIII4 = (OiliO1i1iIII) ii110ilOil.I000OOo1O.get();
/* 429 */                           I000OOo1O i000OOo1O4 = new I000OOo1O(i4);
/* 432 */                           i000OOo1O4.I00iiI = context4;
/* 434 */                           VarHandle.storeStoreFence();
/* 437 */                           return IOO0o0I1l.I0000Il00O(oiliO1i1iIII4, i000OOo1O4);
                                case 8:
/* 411 */                           return II00iioili0.I00000oIO;
                                case 9:
/* 385 */                           Context context5 = ii110ilOil.I00000oIO.I00iOIl;
/* 393 */                           OiliO1i1iIII oiliO1i1iIII5 = (OiliO1i1iIII) ii110ilOil.I000iOII.get();
/* 397 */                           I000OOo1O i000OOo1O5 = new I000OOo1O(i6);
/* 400 */                           i000OOo1O5.I00iiI = context5;
/* 402 */                           VarHandle.storeStoreFence();
/* 405 */                           return IOO0o0I1l.I0000Il00O(oiliO1i1iIII5, i000OOo1O5);
                                case 10:
/* 379 */                           return Ol0oo1I10lIi.I00000oIO;
                                case 11:
/* 317 */                           Context context6 = ii110ilOil.I00000oIO.I00iOIl;
/* 319 */                           OIOI0I oioi0i = new OIOI0I();
/* 322 */                           oioi0i.I00000oIO = context6;
/* 324 */                           OiOI1ilolii1 oiOI1ilolii1 = OiOI1ilolii1.I00000oIO;
/* 330 */                           IlIi0Il ilIi0Il = new IlIi0Il(28);
/* 333 */                           ilIi0Il.I00iiI = oioi0i;
/* 335 */                           VarHandle.storeStoreFence();
/* 342 */                           oioi0i.I00000oOI = IOO0o0I1l.I0000Il00O(oiOI1ilolii1, ilIi0Il);
/* 346 */                           oioi0i.I0000Il00O = "NotificationScheduleManager";
/* 348 */                           IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 352 */                           IIOlO1ii iIOlO1iiI00000oIO2 = il001oo1.I00000oIO(Ii1oo1ooill0.I00iiI);
/* 356 */                           oioi0i.I0000O = iIOlO1iiI00000oIO2;
/* 364 */                           oioi0i.I0000oI00 = OlO0iOl0il.I00000oIO(Il01100l.I00iOIl);
/* 371 */                           iOi1II01i0.I0000O(iIOlO1iiI00000oIO2, null, null, new OIO1o0(oioi0i, iIioOOoI100, i8), 3);
/* 374 */                           VarHandle.storeStoreFence();
/* 593 */                           return oioi0i;
                                case 12:
/* 279 */                           ConversationDao conversationDaoI001IIilI0O = ((BoxChatDatabase) ii110ilOil.I000oI1ioi.get()).I001IIilI0O();
/* 283 */                           lII11l.I00000oOI(conversationDaoI001IIilI0O);
/* 294 */                           MessageDao messageDaoI001i1O0Ol = ((BoxChatDatabase) ii110ilOil.I000oI1ioi.get()).I001i1O0Ol();
/* 298 */                           lII11l.I00000oOI(messageDaoI001i1O0Ol);
/* 301 */                           IO1loOo1o iO1loOo1o = new IO1loOo1o();
/* 304 */                           iO1loOo1o.I00000oIO = conversationDaoI001IIilI0O;
/* 306 */                           iO1loOo1o.I00000oOI = messageDaoI001i1O0Ol;
/* 308 */                           VarHandle.storeStoreFence();
/* 593 */                           return iO1loOo1o;
                                case 13:
/* 263 */                           return BoxChatDatabase.I000l1.I000OiO(ii110ilOil.I00000oIO.I00iOIl);
                                case 14:
/* 211 */                           Context context7 = ii110ilOil.I00000oIO.I00iOIl;
/* 213 */                           Oo0oIo00ioo oo0oIo00ioo = new Oo0oIo00ioo();
/* 216 */                           oo0oIo00ioo.I00000oIO = context7;
/* 220 */                           Oo0oIIO0li oo0oIIO0li = new Oo0oIIO0li(i8);
/* 223 */                           oo0oIIO0li.I00iiI = oo0oIo00ioo;
/* 225 */                           VarHandle.storeStoreFence();
/* 233 */                           oo0oIo00ioo.I00000oOI = new OllO00oiil(oo0oIIO0li);
/* 237 */                           Oo0oIIO0li oo0oIIO0li2 = new Oo0oIIO0li(i7);
/* 240 */                           oo0oIIO0li2.I00iiI = oo0oIo00ioo;
/* 242 */                           VarHandle.storeStoreFence();
/* 250 */                           oo0oIo00ioo.I0000Il00O = new OllO00oiil(oo0oIIO0li2);
/* 252 */                           VarHandle.storeStoreFence();
/* 593 */                           return oo0oIo00ioo;
                                case 15:
/* 190 */                           RagChunkDao ragChunkDaoI001i1lo1io = ((BoxChatDatabase) ii110ilOil.I000oI1ioi.get()).I001i1lo1io();
/* 194 */                           lII11l.I00000oOI(ragChunkDaoI001i1lo1io);
/* 197 */                           OOl0lo oOl0lo = new OOl0lo();
/* 200 */                           oOl0lo.I00000oIO = ragChunkDaoI001i1lo1io;
/* 202 */                           VarHandle.storeStoreFence();
/* 593 */                           return oOl0lo;
                                case 16:
/* 160 */                           Context context8 = ii110ilOil.I00000oIO.I00iOIl;
/* 162 */                           O1i1ll o1i1ll = O1i1ll.I00000oIO;
/* 166 */                           I000OOo1O i000OOo1O6 = new I000OOo1O(i7);
/* 169 */                           i000OOo1O6.I00iiI = context8;
/* 171 */                           VarHandle.storeStoreFence();
/* 174 */                           return IOO0o0I1l.I0000Il00O(o1i1ll, i000OOo1O6);
                                case 17:
/* 119 */                           Context context9 = ii110ilOil.I00000oIO.I00iOIl;
/* 127 */                           Ilo0lli0o ilo0lli0o = (Ilo0lli0o) ii110ilOil.I00111O.get();
/* 131 */                           Ii1lo00I1 ii1lo00I1 = new Ii1lo00I1();
/* 134 */                           ii1lo00I1.I00000oIO = context9;
/* 136 */                           ii1lo00I1.I00000oOI = ilo0lli0o;
/* 142 */                           ii1lo00I1.I0000Il00O = i01IlOO.I00000oOI(context9);
/* 150 */                           ii1lo00I1.I0000O = context9.getSharedPreferences("download_start_time_ms", 0);
/* 152 */                           VarHandle.storeStoreFence();
/* 155 */                           return ii1lo00I1;
                                case PoseLandmark.RIGHT_PINKY:
/* 112 */                           return new Ilo0lli0o();
                                case PoseLandmark.LEFT_INDEX:
/* 54 */                            OOl0lll0li0 oOl0lll0li0 = (OOl0lll0li0) ii110ilOil.I001IO000.get();
/* 62 */                            Oo0oIo00ioo oo0oIo00ioo2 = (Oo0oIo00ioo) ii110ilOil.I00100o1O0lo.get();
/* 72 */                            RagDocumentDao ragDocumentDaoI001iOo1i0O = ((BoxChatDatabase) ii110ilOil.I000oI1ioi.get()).I001iOo1i0O();
/* 76 */                            lII11l.I00000oOI(ragDocumentDaoI001iOo1i0O);
/* 87 */                            RagChunkDao ragChunkDaoI001i1lo1io2 = ((BoxChatDatabase) ii110ilOil.I000oI1ioi.get()).I001i1lo1io();
/* 91 */                            lII11l.I00000oOI(ragChunkDaoI001i1lo1io2);
/* 94 */                            OOiool1 oOiool1 = new OOiool1();
/* 97 */                            oOiool1.I00000oIO = oOl0lll0li0;
/* 99 */                            oOiool1.I00000oOI = oo0oIo00ioo2;
/* 101 */                           oOiool1.I0000Il00O = ragDocumentDaoI001iOo1i0O;
/* 103 */                           oOiool1.I0000O = ragChunkDaoI001i1lo1io2;
/* 105 */                           VarHandle.storeStoreFence();
/* 593 */                           return oOiool1;
                                case PoseLandmark.RIGHT_INDEX:
/* 34 */                            Context context10 = ii110ilOil.I00000oIO.I00iOIl;
/* 36 */                            OOl0lll0li0 oOl0lll0li02 = new OOl0lll0li0();
/* 39 */                            oOl0lll0li02.I00000oIO = context10;
/* 41 */                            VarHandle.storeStoreFence();
/* 593 */                           return oOl0lll0li02;
                                default:
/* 29 */                            throw new AssertionError(i5);
                            }
                    }
                }
            }

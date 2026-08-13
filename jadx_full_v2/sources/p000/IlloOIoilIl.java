            package p000;

            import android.app.Service;
            import android.app.job.JobParameters;
            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.ParcelFileDescriptor;
            import android.os.RemoteException;
            import android.util.Log;
            import android.util.Pair;
            import android.util.SparseArray;
            import android.view.View;
            import androidx.work.impl.model.WorkSpec;
            import com.google.common.util.concurrent.ListenableFuture;
            import com.google.mlkit.genai.prompt.CreateCachedContextRequest;
            import com.google.mlkit.vision.barcode.internal.zzk;
            import java.io.FileOutputStream;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.RandomAccess;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.atomic.AtomicReference;
            
            public final class IlloOIoilIl implements Runnable {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;

                public IlloOIoilIl(int i) {
/* 1 */             this.I00iOIl = i;
                }

                private final void I00000oIO() {
/* 3 */             AtomicReference atomicReference = (AtomicReference) this.I00iiI;
                    synchronized (atomicReference) {
                        try {
                            try {
/* 12 */                        l0olllO1i l0olllo1i = (l0olllO1i) ((lIl1O1li) this.I00iiO).I00iOIl;
/* 34 */                        atomicReference.set(Double.valueOf(l0olllo1i.I00iio.I010oio1OO0(l0olllo1i.I000iOII().I010l1O(), iol1II1ii1i.I00i01iIIliI)));
                            } finally {
/* 53 */                        ((AtomicReference) this.I00iiI).notify();
                            }
                        } catch (Throwable th) {
/* 110 */                   throw th;
                        }
                    }
                }

                @Override
                public final void run() throws Throwable {
                    Throwable thI00000oOI;
                    O1ilOII o1ilOII;
                    IOoil1iiIilo iOoil1iiIilo;
                    WorkSpec workSpec;
                    FileOutputStream fileOutputStream;
                    ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream;
                    byte[] bArr;
/* 6 */             int i = 3;
/* 7 */             i1liliil11 i1liliil11Var = null;
/* 8 */             boolean z = true;
/* 9 */             int i2 = 0;
                    switch (this.I00iOIl) {
                        case 0:
/* 1037 */                  OoIOol ooIOol = (OoIOol) this.I00iiO;
/* 1041 */                  ListenableFuture listenableFuture = (ListenableFuture) this.I00iiI;
/* 1045 */                  if ((listenableFuture instanceof I011iiii0i) && (thI00000oOI = ((I011iiii0i) listenableFuture).I00000oOI()) != null) {
/* 1056 */                      ooIOol.I000II(thI00000oOI);
/* 1199 */                      return;
                            }
                            try {
/* 1061 */                      IlloOoiiO.I00000oIO(listenableFuture);
/* 1066 */                      lIl1O1li lil1o1li = (lIl1O1li) ooIOol.I00iiO;
/* 1068 */                      lil1o1li.I010II();
/* 1073 */                      l0olllO1i l0olllo1i = (l0olllO1i) lil1o1li.I00iOIl;
/* 1075 */                      l0Oi0o l0oi0o = l0olllo1i.I00ilI0I1;
/* 1077 */                      l0olllO1i.I0000oI00(l0oi0o);
/* 1080 */                      SparseArray sparseArrayI010l1O = l0oi0o.I010l1O();
/* 1086 */                      li1l0Iiiii li1l0iiiii = (li1l0Iiiii) ooIOol.I00iiI;
/* 1096 */                      sparseArrayI010l1O.put(li1l0iiiii.I00iiO, Long.valueOf(li1l0iiiii.I00iiI));
/* 1099 */                      l0Oi0o l0oi0o2 = l0olllo1i.I00ilI0I1;
/* 1101 */                      l0olllO1i.I0000oI00(l0oi0o2);
/* 1108 */                      int[] iArr = new int[sparseArrayI010l1O.size()];
/* 1114 */                      long[] jArr = new long[sparseArrayI010l1O.size()];
/* 1121 */                      for (int i3 = 0; i3 < sparseArrayI010l1O.size(); i3++) {
/* 1127 */                          iArr[i3] = sparseArrayI010l1O.keyAt(i3);
/* 1139 */                          jArr[i3] = ((Long) sparseArrayI010l1O.valueAt(i3)).longValue();
                                }
/* 1146 */                      Bundle bundle = new Bundle();
/* 1151 */                      bundle.putIntArray("uriSources", iArr);
/* 1156 */                      bundle.putLongArray("uriTimestamps", jArr);
/* 1161 */                      l0oi0o2.I00lll10.I001IIilI0O(bundle);
/* 1164 */                      lil1o1li.I00l0I0l0lO1 = false;
/* 1166 */                      lil1o1li.I00l0OO0IO = 1;
/* 1168 */                      l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 1170 */                      l0olllO1i.I000II(l01o0io1ooo0);
/* 1179 */                      l01o0io1ooo0.I00lli11.I0000Il00O("Successfully registered trigger URI", li1l0iiiii.I00iOIl);
/* 1182 */                      lil1o1li.I011olOoO();
/* 1199 */                      return;
                            } catch (ExecutionException e) {
/* 1196 */                      ooIOol.I000II(e.getCause());
/* 1199 */                      return;
                            } catch (Throwable th) {
/* 1187 */                      ooIOol.I000II(th);
/* 1199 */                      return;
                            }
                        case 1:
/* 983 */                   I0I1IlI1 i0I1IlI1 = (I0I1IlI1) this.I00iiI;
/* 987 */                   I0I1ii0i i0I1ii0i = (I0I1ii0i) this.I00iiO;
/* 989 */                   O1illlIiilIl o1illlIiilIl = i0I1ii0i.I00iiO;
/* 991 */                   if (o1illlIiilIl != null && (o1ilOII = o1illlIiilIl.I0000oI00) != null) {
/* 997 */                       o1ilOII.I00IlilI0i0i(o1illlIiilIl);
                            }
/* 1002 */                  View view = (View) i0I1ii0i.I00ioIO;
/* 1004 */                  if (view != null && view.getWindowToken() != null) {
/* 1016 */                      if (i0I1IlI1.I00000oOI()) {
/* 1028 */                          i0I1ii0i.I00oII = i0I1IlI1;
                                } else if (i0I1IlI1.I0000oI00 != null) {
/* 1025 */                          i0I1IlI1.I0000O(0, 0, false, false);
/* 1028 */                          i0I1ii0i.I00oII = i0I1IlI1;
                                }
                            }
/* 1031 */                  i0I1ii0i.I00oO101o = null;
/* 1033 */                  return;
                        case 2:
                            synchronized (((O110oO) this.I00iiO).I00iiO) {
                                try {
/* 934 */                           Object objApply = ((O110oO) this.I00iiO).I00iio.apply(this.I00iiI);
/* 940 */                           O110oO o110oO = (O110oO) this.I00iiO;
/* 942 */                           Object obj = o110oO.I00iOIl;
/* 944 */                           if (obj == null && objApply != null) {
/* 948 */                               o110oO.I00iOIl = objApply;
/* 952 */                               o110oO.I00ilI0I1.I000OOo1O(objApply);
                                    } else if (obj != null && !obj.equals(objApply)) {
/* 968 */                               O110oO o110oO2 = (O110oO) this.I00iiO;
/* 970 */                               o110oO2.I00iOIl = objApply;
/* 974 */                               o110oO2.I00ilI0I1.I000OOo1O(objApply);
                                    }
                                } finally {
                                }
                            }
/* 978 */                   return;
                        case 3:
/* 813 */                   OOIo1i0 oOIo1i0 = ((OllOO1l1) this.I00iiO).I00iOIl.I0001Ioi1lo;
/* 817 */                   String str = (String) this.I00iiI;
                            synchronized (oOIo1i0.I000iOII) {
                                try {
/* 822 */                           i01ilO i01iloI0000Il00O = oOIo1i0.I0000Il00O(str);
/* 826 */                           iOoil1iiIilo = null;
/* 837 */                           workSpec = i01iloI0000Il00O != null ? i01iloI0000Il00O.I00000oIO : null;
                                } finally {
                                }
                            }
/* 838 */                   if (workSpec == null || !workSpec.hasConstraints()) {
/* 916 */                       return;
                            }
                            synchronized (((OllOO1l1) this.I00iiO).I00iiO) {
/* 863 */                       ((OllOO1l1) this.I00iiO).I00ilO0.put(liIOI1iO.I00000oIO(workSpec), workSpec);
/* 869 */                       OllOO1l1 ollOO1l1 = (OllOO1l1) this.I00iiO;
/* 871 */                       OlIOOOoi0IlI olIOOOoi0IlI = ollOO1l1.I00ioIO;
/* 879 */                       Ii00lIOoi ii00lIOoi = (Ii00lIOoi) ((OillOo0) ollOO1l1.I00iiI).I00iiO;
/* 881 */                       int i4 = i01I01lIOo.I00000oIO;
/* 908 */                       ((OllOO1l1) this.I00iiO).I00io1l.put(liIOI1iO.I00000oIO(workSpec), iOi1II01i0.I0000O(il001oo1.I00000oIO(ii00lIOoi), null, null, new i00Iooii0i(olIOOOoi0IlI, workSpec, ollOO1l1, iOoil1iiIilo, 1), 3));
                            }
/* 916 */                   return;
                        case 4:
/* 787 */                   i0O1oI1l0l i0o1oi1l0l = (i0O1oI1l0l) this.I00iiI;
/* 791 */                   i0O1o10oo i0o1o10oo = (i0O1o10oo) this.I00iiO;
/* 803 */                   i0o1oi1l0l.I00000oIO.I00000oIO(i0o1o10oo.I0000Il00O, i0o1o10oo.I0000O, (String) i0o1o10oo.I00000oOI);
/* 806 */                   return;
                        case 5:
/* 781 */                   ((ii01iI1oI1l) this.I00iiI).zza((iOli1OIoI0o) this.I00iiO);
/* 784 */                   return;
                        case 6:
/* 769 */                   ((IIiOOI) this.I00iiI).I0000O(((illlli) this.I00iiO).zza());
/* 772 */                   return;
                        case 7:
/* 646 */                   Pair pair = (Pair) this.I00iiI;
                            try {
/* 650 */                       ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) pair.first;
/* 662 */                       fileOutputStream = new FileOutputStream(((ParcelFileDescriptor) pair.second).getFileDescriptor());
                                try {
/* 667 */                           autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
                                    try {
/* 670 */                               int i5 = lOoolIooO1.I00000oIO;
/* 674 */                               bArr = new byte[8192];
                                    } finally {
                                    }
                                } finally {
                                }
                            } catch (Exception e2) {
/* 723 */                       Log.e("DataTransporter", "Failed to transport the file", e2);
/* 726 */                       z = false;
                            }
                            while (true) {
/* 676 */                       int i6 = autoCloseInputStream.read(bArr);
/* 681 */                       if (i6 == -1) {
/* 683 */                           autoCloseInputStream.close();
/* 686 */                           fileOutputStream.close();
/* 729 */                           OoIol00Ool ooIol00Ool = (OoIol00Ool) this.I00iiO;
/* 745 */                           lio0IOO101oI lio0ioo101oi = (lio0IOO101oI) ((o0OO0i) ooIol00Ool.I00iiI).I00io1l.get((CreateCachedContextRequest) ooIol00Ool.I00iiO);
/* 747 */                           if (lio0ioo101oi != null) {
/* 753 */                               lio0ioo101oi.I000O01llI0(Boolean.valueOf(z));
/* 756 */                               return;
                                    }
/* 756 */                           return;
                                }
/* 695 */                       fileOutputStream.write(bArr, 0, i6);
                            }
                        case 8:
/* 423 */                   lilOOl0 lilool0 = ((l1Oli1l) this.I00iiO).I000II;
/* 425 */                   lilool0.I00OI1();
/* 430 */                   lli10iI lli10ii = (lli10iI) this.I00iiI;
/* 436 */                   lilool0.I00iOIl().I010II();
/* 439 */                   lilool0.I00iIi0i1o();
/* 442 */                   lII0I0I000I.I000II(lli10ii);
/* 445 */                   String str2 = lli10ii.I00iOIl;
/* 447 */                   lII0I0I000I.I0000O(str2);
/* 461 */                   if (lilool0.I00Ol1ll1().I01101IOlO(null, iol1II1ii1i.I00o0iI0io1)) {
/* 467 */                       lilool0.I00IoO0().getClass();
/* 470 */                       long jCurrentTimeMillis = System.currentTimeMillis();
/* 480 */                       int iI010o0o0oO = lilool0.I00Ol1ll1().I010o0o0oO(null, iol1II1ii1i.I00i0oil);
/* 484 */                       lilool0.I00Ol1ll1();
/* 499 */                       long jLongValue = jCurrentTimeMillis - ((Long) iol1II1ii1i.I0000oI00.I00000oIO(null)).longValue();
/* 500 */                       while (i2 < iI010o0o0oO && lilool0.I00IO1(jLongValue, null)) {
/* 508 */                           i2++;
                                }
                            } else {
/* 511 */                       lilool0.I00Ol1ll1();
/* 522 */                       long jIntValue = ((Integer) iol1II1ii1i.I000l1.I00000oIO(null)).intValue();
/* 530 */                       while (i2 < jIntValue && lilool0.I00IO1(0L, str2)) {
/* 540 */                           i2++;
                                }
                            }
/* 554 */                   if (lilool0.I00Ol1ll1().I01101IOlO(null, iol1II1ii1i.I00o0l1o1o0)) {
/* 560 */                       lilool0.I00iOIl().I010II();
/* 563 */                       lilool0.I00II0Ol1O0l();
                            }
/* 566 */                   liOii110IIl lioii110iil = lilool0.I00l0OO0IO;
/* 570 */                   int iI00000oOI = io1OllI.I00000oOI(lli10ii.I0100i);
/* 574 */                   lioii110iil.I010II();
/* 577 */                   if (iI00000oOI != 2 || liOii110IIl.I010iIIOlo(str2)) {
/* 643 */                       return;
                            }
/* 587 */                   l0l1ol11 l0l1ol11Var = lioii110iil.I00iiI.I00iOIl;
/* 589 */                   lilOOl0.I00O0o1oo(l0l1ol11Var);
/* 592 */                   l00O0loO l00o0looI01101olii = l0l1ol11Var.I01101olii(str2);
/* 596 */                   if (l00o0looI01101olii == null || !l00o0looI01101olii.I00IOO() || l00o0looI01101olii.I00IioO0OiOi().I001IIilI0O().isEmpty()) {
/* 643 */                       return;
                            }
/* 626 */                   lilool0.I00II0oii1o().I00lll10.I0000Il00O("[sgtm] Going background, trigger client side upload. appId", str2);
/* 633 */                   lilool0.I00IoO0().getClass();
/* 640 */                   lilool0.I000lI(System.currentTimeMillis(), str2);
/* 643 */                   return;
                        case 9:
/* 358 */                   IBinder iBinder = (IBinder) this.I00iiO;
/* 363 */                   liiilOIIl liiiloiil = (liiilOIIl) this.I00iiI;
                            synchronized (liiiloiil) {
/* 366 */                       if (iBinder == null) {
/* 370 */                           liiiloiil.I00000oOI("Null service connection");
                                } else {
                                    try {
/* 382 */                               liiiloiil.I00iiO = new OoIOol(iBinder);
/* 384 */                               liiiloiil.I00iOIl = 2;
/* 388 */                               l1OIO00ooIOl l1oio00ooiol = new l1OIO00ooIOl(z ? 1 : 0);
/* 391 */                               l1oio00ooiol.I00iiI = liiiloiil;
/* 393 */                               VarHandle.storeStoreFence();
/* 402 */                               ((ScheduledExecutorService) liiiloiil.I00ilO0.I00iio).execute(l1oio00ooiol);
                                    } catch (RemoteException e3) {
/* 412 */                               liiiloiil.I00000oOI(e3.getMessage());
                                    }
                                }
                            }
/* 416 */                   return;
                        case 10:
/* 352 */                   I00000oIO();
/* 355 */                   return;
                        case 11:
/* 318 */                   l0olllO1i l0olllo1i2 = (l0olllO1i) ((lIl1O1li) this.I00iiI).I00iOIl;
/* 320 */                   iooloO1iOil iooloo1ioilI000iOII = l0olllo1i2.I000iOII();
/* 326 */                   String str3 = (String) this.I00iiO;
/* 328 */                   String str4 = iooloo1ioilI000iOII.I00oI0i;
/* 330 */                   boolean z2 = (str4 == null || str4.equals(str3)) ? false : true;
/* 340 */                   iooloo1ioilI000iOII.I00oI0i = str3;
/* 342 */                   if (z2) {
/* 348 */                       l0olllo1i2.I000iOII().I010l10O();
/* 351 */                       return;
                            }
/* 351 */                   return;
                        case 12:
/* 264 */                   lOliOlO1Io loliolo1io = (lOliOlO1Io) this.I00iiO;
/* 266 */                   iolll0ill1i iolll0ill1iVar = loliolo1io.I00iio;
/* 270 */                   l0olllO1i l0olllo1i3 = (l0olllO1i) loliolo1io.I00iOIl;
/* 272 */                   if (iolll0ill1iVar == null) {
/* 274 */                       l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i3.I00ilO0;
/* 276 */                       l0olllO1i.I000II(l01o0io1ooo02);
/* 283 */                       l01o0io1ooo02.I00ilO0.I00000oOI("Failed to send consent settings to service");
/* 311 */                       return;
                            }
                            try {
/* 291 */                       iolll0ill1iVar.I000l1((lli10iI) this.I00iiI);
/* 294 */                       loliolo1io.I0110OiO();
/* 311 */                       return;
                            } catch (RemoteException e4) {
/* 299 */                       l01O0IO1ooO0 l01o0io1ooo03 = l0olllo1i3.I00ilO0;
/* 301 */                       l0olllO1i.I000II(l01o0io1ooo03);
/* 308 */                       l01o0io1ooo03.I00ilO0.I0000Il00O("Failed to send consent settings to the service", e4);
/* 311 */                       return;
                            }
                        case 13:
/* 258 */                   ((lOo0oolIi1) ((Service) ((i0O1lIi1O0IO) this.I00iiI).I00iiI)).I00000oOI((JobParameters) this.I00iiO);
/* 261 */                   return;
                        default:
/* 15 */                    o0OiOio o0oioio = (o0OiOio) this.I00iiI;
/* 17 */                    lliOo1oo llioo1oo = lliOo1oo.AGGREGATED_ON_DEVICE_BARCODE_DETECTION;
/* 21 */                    zzk zzkVar = (zzk) this.I00iiO;
/* 23 */                    HashMap map = o0oioio.I000OiO;
/* 29 */                    iii1IlooII iii1ilooii = (iii1IlooII) map.get(llioo1oo);
/* 31 */                    if (iii1ilooii != null) {
/* 39 */                        Iterator it = ((ii1oIilolI) iii1ilooii.I00000oOI()).iterator();
/* 47 */                        while (it.hasNext()) {
/* 49 */                            Object next = it.next();
/* 61 */                            Collection collection = (Collection) iii1ilooii.I00iio.get(next);
                                    Collection arrayList = collection;
/* 63 */                            if (collection == null) {
/* 67 */                                arrayList = new ArrayList(i);
                                    }
/* 70 */                            List list = (List) arrayList;
/* 87 */                            ArrayList arrayList2 = new ArrayList(list instanceof RandomAccess ? new iiI1Io(iii1ilooii, next, list, i1liliil11Var) : new i1liliil11(iii1ilooii, next, list, i1liliil11Var));
/* 90 */                            Collections.sort(arrayList2);
/* 93 */                            Iterator it2 = arrayList2.iterator();
/* 97 */                            long jLongValue2 = 0;
/* 103 */                           while (it2.hasNext()) {
/* 115 */                               jLongValue2 += ((Long) it2.next()).longValue();
                                    }
/* 130 */                           Long lValueOf = Long.valueOf((jLongValue2 / arrayList2.size()) & Long.MAX_VALUE);
/* 141 */                           Long lValueOf2 = Long.valueOf(o0OiOio.I00000oIO(arrayList2, 100.0d) & Long.MAX_VALUE);
/* 158 */                           Long lValueOf3 = Long.valueOf(o0OiOio.I00000oIO(arrayList2, 75.0d) & Long.MAX_VALUE);
/* 170 */                           Long lValueOf4 = Long.valueOf(o0OiOio.I00000oIO(arrayList2, 50.0d) & Long.MAX_VALUE);
/* 182 */                           Long lValueOf5 = Long.valueOf(o0OiOio.I00000oIO(arrayList2, 25.0d) & Long.MAX_VALUE);
/* 186 */                           HashMap map2 = map;
/* 195 */                           Long lValueOf6 = Long.valueOf(o0OiOio.I00000oIO(arrayList2, 0.0d) & Long.MAX_VALUE);
/* 201 */                           ll1Iloi ll1iloi = new ll1Iloi();
/* 204 */                           ll1iloi.I00000oIO = lValueOf2;
/* 206 */                           ll1iloi.I00000oOI = lValueOf6;
/* 208 */                           ll1iloi.I0000Il00O = lValueOf;
/* 210 */                           ll1iloi.I0000O = lValueOf5;
/* 212 */                           ll1iloi.I0000oI00 = lValueOf4;
/* 214 */                           ll1iloi.I0001Ioi1lo = lValueOf3;
/* 216 */                           VarHandle.storeStoreFence();
/* 231 */                           o0oioio.I00000oOI(zzkVar.zza(next, arrayList2.size(), ll1iloi), llioo1oo, o0oioio.I0000O());
/* 234 */                           map = map2;
/* 235 */                           i = 3;
/* 236 */                           i1liliil11Var = null;
                                }
/* 240 */                       map.remove(llioo1oo);
/* 243 */                       return;
                            }
/* 243 */                   return;
                    }
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case 0:
/* 15 */                    String simpleName = IlloOIoilIl.class.getSimpleName();
/* 19 */                    int i = 19;
/* 21 */                    OlOO1i11110 olOO1i11110 = new OlOO1i11110(i);
/* 26 */                    IoloOio0I ioloOio0I = new IoloOio0I(i);
/* 29 */                    olOO1i11110.I00iiO = ioloOio0I;
/* 31 */                    olOO1i11110.I00iiI = simpleName;
/* 33 */                    VarHandle.storeStoreFence();
/* 38 */                    OoIOol ooIOol = (OoIOol) this.I00iiO;
/* 42 */                    IoloOio0I ioloOio0I2 = new IoloOio0I(i);
/* 45 */                    ioloOio0I.I00iiO = ioloOio0I2;
/* 47 */                    ioloOio0I2.I00iiI = ooIOol;
/* 49 */                    return olOO1i11110.toString();
                        default:
/* 6 */                     return super.toString();
                    }
                }
            }

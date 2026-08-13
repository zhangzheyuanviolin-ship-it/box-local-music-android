            package p000;

            import android.content.Context;
            import android.os.Build;
            import android.util.Log;
            import android.util.Pair;
            import java.io.IOException;
            import java.io.InputStream;
            import java.lang.invoke.VarHandle;
            import java.nio.ByteBuffer;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.Executors;
            
            public abstract class I01l1o0Oii {
                private final i1IIi1oOoIO zza;
                private final lIOlOoIoo zzb;

                public I01l1o0Oii(Context context, OO11il0 oO11il0, I0l011I i0l011I, O1lolIl101 o1lolIl101, I01l1o i01l1o) {
/* 6 */             i1IIi1oOoIO i1iii1oooio = new i1IIi1oOoIO();
/* 9 */             i1iii1oooio.I00000oIO = context;
/* 11 */            i1iii1oooio.I00000oOI = oO11il0;
/* 13 */            i1iii1oooio.I0000Il00O = i0l011I;
/* 15 */            i1iii1oooio.I0000O = i01l1o;
/* 17 */            VarHandle.storeStoreFence();
/* 20 */            this.zza = i1iii1oooio;
/* 26 */            lO0Olllill lo0olllill = new lO0Olllill(context, oO11il0, i01l1o);
/* 29 */            i01IlOO i01ilooI00000oOI = i01IlOO.I00000oOI(context);
/* 33 */            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
/* 37 */            lIOlOoIoo liolooioo = new lIOlOoIoo();
/* 40 */            liolooioo.I00000oIO = context;
/* 42 */            liolooioo.I00000oOI = oO11il0;
/* 44 */            liolooioo.I0000Il00O = lo0olllill;
/* 50 */            liolooioo.I0000oI00 = o1lolIl101.getWorkerClass();
/* 56 */            liolooioo.I0001Ioi1lo = o1lolIl101.getCorrectnessScoreThreshold();
/* 62 */            liolooioo.I000OOo1O = o1lolIl101.requireDeviceIdle();
/* 68 */            liolooioo.I000OiO = o1lolIl101.getMaxRetryCount();
/* 70 */            liolooioo.I000II = i01l1o;
/* 72 */            liolooioo.I0000O = i01ilooI00000oOI;
/* 74 */            liolooioo.I000O01llI0 = executorServiceNewSingleThreadExecutor;
/* 76 */            VarHandle.storeStoreFence();
/* 79 */            this.zzb = liolooioo;
                }

                /* JADX WARN: Finally extract failed */
                public I01l10Oi getBestConfiguredOptions(I01l10Oi i01l10Oi) throws IOException {
                    l0OiII l0oiiiI000oI1ioi;
                    loO1IolO loo1ioloI0001Ioi1lo;
                    lo00l1i1O1O lo00l1i1o1oI0000oI00;
                    boolean z;
                    Object obj;
                    boolean zBooleanValue;
/* 5 */             lIOlOoIoo liolooioo = this.zzb;
/* 7 */             i1IIi1oOoIO i1iii1oooio = this.zza;
/* 9 */             i1iii1oooio.getClass();
/* 12 */            Object obj2 = null;
/* 13 */            lOio0o.I0000oI00(null);
/* 18 */            String bundledAllowlistAssetPath = i1iii1oooio.I0000Il00O.getBundledAllowlistAssetPath();
                    try {
/* 28 */                InputStream inputStreamOpen = i1iii1oooio.I00000oIO.getAssets().open(bundledAllowlistAssetPath);
                        try {
/* 34 */                    l0oiiiI000oI1ioi = l0OiII.I00100l0(inputStreamOpen, ilI1iIO0oiIo.I00000oIO);
/* 38 */                    if (inputStreamOpen != null) {
/* 40 */                        inputStreamOpen.close();
                            }
                        } finally {
                        }
                    } catch (IOException e) {
/* 66 */                if (Log.isLoggable("AllowlistManager", 6)) {
/* 80 */                    Log.e("AllowlistManager", "Failed to load allowlist from ".concat(String.valueOf(bundledAllowlistAssetPath)), e);
                        }
/* 83 */                l0oiiiI000oI1ioi = l0OiII.I000oI1ioi();
                    }
/* 89 */            ArrayList arrayList = new ArrayList();
/* 104 */           for (l0i0OIlo11I0 l0i0oilo11i0 : l0oiiiI000oI1ioi.I00100o1O0lo()) {
/* 137 */               arrayList.add(new Pair(l0i0oilo11i0.I000oI1ioi().I00100l0(), Boolean.valueOf(l0i0oilo11i0.I000oI1ioi().I00100o1O0lo())));
                    }
/* 150 */           arrayList.add(new Pair("default_config", Boolean.FALSE));
/* 155 */           ArrayList arrayList2 = new ArrayList();
/* 158 */           int size = arrayList.size();
/* 162 */           int i = 0;
/* 163 */           while (i < size) {
/* 169 */               Pair pair = (Pair) arrayList.get(i);
/* 173 */               String str = (String) pair.first;
/* 179 */               boolean zBooleanValue2 = ((Boolean) pair.second).booleanValue();
/* 189 */               if (!i1iii1oooio.I0000Il00O.isRunConfigCompatibleWithOptions(str, i01l10Oi)) {
/* 191 */                   obj = obj2;
                        } else if (i1iii1oooio.I0000Il00O.shouldCheckGenericGpuAllowlist(str)) {
                            synchronized (i1IIi1oOoIO.I0000oI00) {
/* 207 */                       if (i1IIi1oOoIO.I0001Ioi1lo == null) {
/* 211 */                           I1l0OOI i1l0OOI = new I1l0OOI();
/* 216 */                           int i2 = Build.VERSION.SDK_INT;
/* 220 */                           StringBuilder sb = new StringBuilder();
/* 223 */                           sb.append(i2);
/* 230 */                           i1l0OOI.I00000oIO = sb.toString();
/* 232 */                           String str2 = Build.MODEL;
/* 234 */                           if (str2 == null) {
/* 454 */                               throw new NullPointerException("Null model");
                                    }
/* 236 */                           i1l0OOI.I00000oOI = str2;
/* 238 */                           String str3 = Build.DEVICE;
/* 240 */                           if (str3 == null) {
/* 446 */                               throw new NullPointerException("Null device");
                                    }
/* 242 */                           i1l0OOI.I0000Il00O = str3;
/* 244 */                           String str4 = Build.MANUFACTURER;
/* 246 */                           if (str4 == null) {
/* 438 */                               throw new NullPointerException("Null manufacturer");
                                    }
/* 248 */                           i1l0OOI.I0000O = str4;
/* 250 */                           iiO01011O iio01011oI00000oIO = i1l0OOI.I00000oIO();
                                    try {
/* 254 */                               il1I111 il1i111I00000oIO = l0IIloIo1i0i.I00000oIO();
/* 260 */                               iiO1O1iOI iio1o1ioi = new iiO1O1iOI();
/* 267 */                               iio1o1ioi.I00000oIO = il1i111I00000oIO.I00000oIO;
/* 271 */                               iio1o1ioi.I00000oOI = il1i111I00000oIO.I0000Il00O;
/* 277 */                               byte b = (byte) (iio1o1ioi.I0000O | 1);
/* 280 */                               iio1o1ioi.I0000Il00O = il1i111I00000oIO.I0000O;
/* 285 */                               iio1o1ioi.I0000O = (byte) (b | 2);
/* 287 */                               iiOiIO0ooI0 iioiio0ooi0I00000oIO = iio1o1ioi.I00000oIO();
                                        try {
/* 299 */                                   InputStream inputStreamOpen2 = i1iii1oooio.I00000oIO.getAssets().open("mobile_acceleration/gpu_compatibility.bin");
                                            try {
/* 307 */                                       byte[] bArr = new byte[inputStreamOpen2.available()];
/* 309 */                                       int i3 = 0;
                                                while (true) {
/* 310 */                                           int length = bArr.length;
/* 315 */                                           int i4 = inputStreamOpen2.read(bArr, i3, length - i3);
/* 319 */                                           if (i4 <= 0) {
                                                        break;
                                                    }
/* 355 */                                           i3 += i4;
/* 356 */                                           int iAvailable = inputStreamOpen2.available();
/* 360 */                                           iiO01011O iio01011o = iio01011oI00000oIO;
/* 364 */                                           if (iAvailable > length - i3) {
/* 367 */                                               byte[] bArr2 = new byte[iAvailable + i3];
/* 370 */                                               System.arraycopy(bArr, 0, bArr2, 0, i3);
/* 373 */                                               bArr = bArr2;
                                                    }
/* 374 */                                           iio01011oI00000oIO = iio01011o;
                                                }
/* 321 */                                       inputStreamOpen2.close();
/* 340 */                                       i1IIi1oOoIO.I0001Ioi1lo = Boolean.valueOf(iiioOliOilI.I00000oIO(iio01011oI00000oIO, iioiio0ooi0I00000oIO, l0lIilo1.I000iOII(ByteBuffer.wrap(bArr))));
/* 345 */                                       Log.isLoggable("AllowlistManager", 3);
                                            } catch (Throwable th) {
/* 379 */                                       if (inputStreamOpen2 != null) {
                                                    try {
/* 381 */                                               inputStreamOpen2.close();
                                                    } catch (Throwable th2) {
/* 386 */                                               th.addSuppressed(th2);
                                                    }
                                                }
/* 389 */                                       throw th;
                                            }
                                        } catch (IOException e2) {
/* 394 */                                   Log.e("AllowlistManager", "Failed to read generic GPU allowlist database", e2);
/* 399 */                                   i1IIi1oOoIO.I0001Ioi1lo = Boolean.FALSE;
                                        }
/* 457 */                               zBooleanValue = i1IIi1oOoIO.I0001Ioi1lo.booleanValue();
                                    } catch (iliiIi1i e3) {
/* 416 */                               ((IoIlOo1o0IIl) i1iii1oooio.I0000O).I00II0oii1o(new I01l1111(2, e3));
/* 421 */                               i1IIi1oOoIO.I0001Ioi1lo = Boolean.FALSE;
/* 425 */                               zBooleanValue = i1IIi1oOoIO.I0001Ioi1lo.booleanValue();
                                    }
                                } else {
/* 457 */                           zBooleanValue = i1IIi1oOoIO.I0001Ioi1lo.booleanValue();
                                }
                            }
/* 462 */                   if (zBooleanValue) {
/* 469 */                       OO11il0 oO11il0 = i1iii1oooio.I00000oOI;
/* 473 */                       OiI1oi1 oiI1oi1 = new OiI1oi1();
/* 476 */                       oiI1oi1.I00000oIO = oO11il0;
/* 478 */                       oiI1oi1.I00000oOI = i01l10Oi;
/* 480 */                       oiI1oi1.I0000Il00O = str;
/* 482 */                       oiI1oi1.I0000O = zBooleanValue2;
/* 484 */                       obj = null;
/* 485 */                       oiI1oi1.I0000oI00 = null;
/* 487 */                       VarHandle.storeStoreFence();
/* 490 */                       arrayList2.add(oiI1oi1);
                            } else {
/* 465 */                       obj = null;
                            }
                        } else {
/* 469 */                   OO11il0 oO11il02 = i1iii1oooio.I00000oOI;
/* 473 */                   OiI1oi1 oiI1oi12 = new OiI1oi1();
/* 476 */                   oiI1oi12.I00000oIO = oO11il02;
/* 478 */                   oiI1oi12.I00000oOI = i01l10Oi;
/* 480 */                   oiI1oi12.I0000Il00O = str;
/* 482 */                   oiI1oi12.I0000O = zBooleanValue2;
/* 484 */                   obj = null;
/* 485 */                   oiI1oi12.I0000oI00 = null;
/* 487 */                   VarHandle.storeStoreFence();
/* 490 */                   arrayList2.add(oiI1oi12);
                        }
/* 493 */               i++;
/* 495 */               obj2 = obj;
                    }
/* 498 */           int i5 = 1;
/* 500 */           lO0Olllill lo0olllill = liolooioo.I0000Il00O;
/* 506 */           if (!arrayList2.isEmpty()) {
/* 510 */               ExecutorService executorService = liolooioo.I000O01llI0;
/* 515 */               illioiliioi illioiliioiVar = new illioiliioi(7);
/* 518 */               illioiliioiVar.I00iiI = liolooioo;
/* 520 */               illioiliioiVar.I00iiO = arrayList2;
/* 522 */               VarHandle.storeStoreFence();
/* 525 */               executorService.execute(illioiliioiVar);
/* 528 */               lO0Olllill.I000O01llI0();
/* 533 */               ArrayList arrayList3 = new ArrayList();
/* 536 */               loO1IolO loo1ioloI0001Ioi1lo2 = lo0olllill.I0001Ioi1lo();
/* 540 */               if (loo1ioloI0001Ioi1lo2 == null) {
/* 542 */                   Iterator it = arrayList2.iterator();
/* 550 */                   while (it.hasNext()) {
/* 556 */                       OiI1oi1 oiI1oi13 = (OiI1oi1) it.next();
/* 558 */                       OO11il0 oO11il03 = oiI1oi13.I00000oIO;
/* 560 */                       I01l10Oi i01l10Oi2 = oiI1oi13.I00000oOI;
/* 562 */                       String str5 = oiI1oi13.I0000Il00O;
/* 564 */                       boolean z2 = oiI1oi13.I0000O;
/* 566 */                       I1l1iI1Io i1l1iI1Io = oiI1oi13.I0000oI00;
/* 570 */                       OiI1oi1 oiI1oi14 = new OiI1oi1();
/* 573 */                       oiI1oi14.I00000oIO = oO11il03;
/* 575 */                       oiI1oi14.I00000oOI = i01l10Oi2;
/* 577 */                       oiI1oi14.I0000Il00O = str5;
/* 579 */                       oiI1oi14.I0000O = z2;
/* 581 */                       oiI1oi14.I0000oI00 = i1l1iI1Io;
/* 583 */                       VarHandle.storeStoreFence();
/* 586 */                       arrayList3.add(oiI1oi14);
                            }
                        } else {
/* 590 */                   HashMap mapI000OOo1O = lO0Olllill.I000OOo1O(loo1ioloI0001Ioi1lo2);
/* 594 */                   Iterator it2 = arrayList2.iterator();
/* 602 */                   while (it2.hasNext()) {
/* 608 */                       OiI1oi1 oiI1oi15 = (OiI1oi1) it2.next();
/* 610 */                       String str6 = oiI1oi15.I0000Il00O;
/* 625 */                       String strI000II = lO0Olllill.I000II(str6, ((I01l10Oi) oiI1oi15.I00000oOI.cloneWithRunConfigAssigned(str6, false)).encode());
/* 629 */                       OO11il0 oO11il04 = oiI1oi15.I00000oIO;
/* 631 */                       I01l10Oi i01l10Oi3 = oiI1oi15.I00000oOI;
/* 633 */                       String str7 = oiI1oi15.I0000Il00O;
/* 635 */                       boolean z3 = oiI1oi15.I0000O;
/* 641 */                       I1l1iI1Io i1l1iI1Io2 = (I1l1iI1Io) mapI000OOo1O.get(strI000II);
/* 645 */                       OiI1oi1 oiI1oi16 = new OiI1oi1();
/* 648 */                       oiI1oi16.I00000oIO = oO11il04;
/* 650 */                       oiI1oi16.I00000oOI = i01l10Oi3;
/* 652 */                       oiI1oi16.I0000Il00O = str7;
/* 654 */                       oiI1oi16.I0000O = z3;
/* 656 */                       oiI1oi16.I0000oI00 = i1l1iI1Io2;
/* 658 */                       VarHandle.storeStoreFence();
/* 661 */                       arrayList3.add(oiI1oi16);
                            }
                        }
/* 665 */               Iterator it3 = arrayList3.iterator();
/* 673 */               while (it3.hasNext()) {
/* 679 */                   OiI1oi1 oiI1oi17 = (OiI1oi1) it3.next();
/* 681 */                   I1l1iI1Io i1l1iI1Io3 = oiI1oi17.I0000oI00;
/* 683 */                   if (i1l1iI1Io3 != null) {
/* 685 */                       int i6 = i1l1iI1Io3.I00000oOI;
/* 689 */                       if (!i1l1iI1Io3.I00000oIO && i6 != 0) {
/* 693 */                           I01l1o i01l1o = liolooioo.I000II;
/* 704 */                           I01l10Oi i01l10Oi4 = (I01l10Oi) oiI1oi17.I00000oOI.cloneWithRunConfigAssigned(oiI1oi17.I0000Il00O, false);
/* 706 */                           IoIlOo1o0IIl ioIlOo1o0IIl = (IoIlOo1o0IIl) i01l1o;
/* 708 */                           ioIlOo1o0IIl.getClass();
/* 711 */                           String.valueOf(i01l10Oi4);
/* 714 */                           String.valueOf(i1l1iI1Io3);
/* 720 */                           Log.isLoggable("MlKitAccLogger", 3);
/* 723 */                           String runConfigName = i01l10Oi4.getRunConfigName();
/* 727 */                           lII0I0I000I.I000II(runConfigName);
/* 730 */                           if (i6 != 0) {
/* 734 */                               IIlOoolol0ll iIlOoolol0llI00IoiI = ioIlOo1o0IIl.I00IoiI();
/* 740 */                               looOio1l loooio1l = new looOio1l();
/* 743 */                               loooio1l.I00000oIO = runConfigName;
/* 745 */                               VarHandle.storeStoreFence();
/* 748 */                               iIlOoolol0llI00IoiI.I00ilI0I1 = loooio1l;
/* 752 */                               if (i6 == i5) {
/* 756 */                                   iIlOoolol0llI00IoiI.I00ilO0 = loooI0l1III1.COMPLETED_EVENT;
/* 760 */                                   iIlOoolol0llI00IoiI.I00ioIO = loolO1Oi1.SUCCESS;
/* 764 */                                   Float fValueOf = Float.valueOf(i1l1iI1Io3.I0000Il00O);
/* 770 */                                   o00OIIOi1I1 o00oiioi1i1 = new o00OIIOi1I1();
/* 773 */                                   o00oiioi1i1.I00000oIO = fValueOf;
/* 775 */                                   VarHandle.storeStoreFence();
/* 778 */                                   iiOOi1OolOlO iiooi1oololoI001lIiIIo1O = ii01IlIiIo.I001lIiIIo1O(o00oiioi1i1);
/* 784 */                                   o00oo1O11i o00oo1o11i = new o00oo1O11i();
/* 787 */                                   o00oo1o11i.I00000oIO = iiooi1oololoI001lIiIIo1O;
/* 789 */                                   VarHandle.storeStoreFence();
/* 792 */                                   iiOOi1OolOlO iiooi1oololoI001lIiIIo1O2 = ii01IlIiIo.I001lIiIIo1O(o00oo1o11i);
/* 798 */                                   o010o1iIl o010o1iil = new o010o1iIl();
/* 801 */                                   o010o1iil.I00000oIO = iiooi1oololoI001lIiIIo1O2;
/* 803 */                                   VarHandle.storeStoreFence();
/* 806 */                                   iIlOoolol0llI00IoiI.I00l0I0l0lO1 = o010o1iil;
/* 816 */                                   iIlOoolol0llI00IoiI.I00li1OI = Integer.valueOf(i1l1iI1Io3.I0000O * 1000);
                                        } else if (i6 == 2) {
/* 825 */                                   iIlOoolol0llI00IoiI.I00ilO0 = loooI0l1III1.MISSING_END_EVENT;
                                        }
/* 835 */                               ioIlOo1o0IIl.I00Iooi00oi(i01l10Oi4, ii01IlIiIo.I001lIiIIo1O(iIlOoolol0llI00IoiI.I001i1O0Ol()));
                                    }
                                }
                            }
/* 838 */                   i5 = 1;
                        }
/* 842 */               io0oo1l1 io0oo1l1Var = lo0olllill.I0000Il00O;
/* 844 */               io0oo1l1Var.I00000oOI();
                        try {
/* 847 */                   lO0Olllill.I000O01llI0();
/* 852 */                   HashSet hashSet = new HashSet();
/* 855 */                   Iterator it4 = arrayList3.iterator();
/* 863 */                   while (it4.hasNext()) {
/* 869 */                       OiI1oi1 oiI1oi18 = (OiI1oi1) it4.next();
/* 871 */                       I1l1iI1Io i1l1iI1Io4 = oiI1oi18.I0000oI00;
/* 873 */                       if (i1l1iI1Io4 != null && !i1l1iI1Io4.I00000oIO) {
/* 879 */                           String str8 = oiI1oi18.I0000Il00O;
/* 898 */                           hashSet.add(lO0Olllill.I000II(str8, ((I01l10Oi) oiI1oi18.I00000oOI.cloneWithRunConfigAssigned(str8, false)).encode()));
                                }
                            }
/* 909 */                   if (!hashSet.isEmpty() && (loo1ioloI0001Ioi1lo = lo0olllill.I0001Ioi1lo()) != null && (lo00l1i1o1oI0000oI00 = lo0olllill.I0000oI00()) != null) {
/* 936 */                       for (ll0oOiiIi ll0ooiiii : loo1ioloI0001Ioi1lo.I001i1lo1io()) {
/* 960 */                           if (hashSet.contains(lO0Olllill.I000II(ll0ooiiii.I00111O(), ll0ooiiii.I0010o()))) {
/* 966 */                               liii11Oi0O liii11oi0o = (liii11Oi0O) ll0ooiiii.I000o00OoI0I();
/* 968 */                               liii11oi0o.I0000Il00O();
/* 976 */                               ll0oOiiIi.I001IIilI0O((ll0oOiiIi) liii11oi0o.I00iiI, true);
/* 979 */                               lo00l1i1o1oI0000oI00.I0000Il00O();
/* 992 */                               loO1IolO.I001lloI((loO1IolO) lo00l1i1o1oI0000oI00.I00iiI, (ll0oOiiIi) liii11oi0o.I00000oIO());
                                    } else {
/* 996 */                               lo00l1i1o1oI0000oI00.I0000O(ll0ooiiii);
                                    }
                                }
/* 1010 */                      io0oo1l1Var.I0000Il00O(((loO1IolO) lo00l1i1o1oI0000oI00.I00000oIO()).I00000oOI());
                            }
/* 1013 */                  io0oo1l1Var.I0000O();
/* 1016 */                  Iterator it5 = arrayList2.iterator();
                            while (true) {
/* 1024 */                      if (!it5.hasNext()) {
/* 1044 */                          z = false;
                                    break;
                                }
/* 1040 */                      if ("default_config".equals(((OiI1oi1) it5.next()).I0000Il00O)) {
/* 1042 */                          z = true;
                                    break;
                                }
                            }
/* 1047 */                  arrayList2 = new ArrayList();
/* 1050 */                  Iterator it6 = arrayList3.iterator();
/* 1058 */                  while (it6.hasNext()) {
/* 1064 */                      OiI1oi1 oiI1oi19 = (OiI1oi1) it6.next();
/* 1072 */                      "Check isApplicableRunConfig: ".concat(String.valueOf(oiI1oi19));
/* 1075 */                      lIOlOoIoo.I00000oOI();
/* 1080 */                      if (oiI1oi19.I0000O) {
/* 1084 */                          I1l1iI1Io i1l1iI1Io5 = oiI1oi19.I0000oI00;
/* 1086 */                          if (i1l1iI1Io5 != null) {
/* 1088 */                              int i7 = i1l1iI1Io5.I0000O;
/* 1093 */                              if (i1l1iI1Io5.I00000oOI != 1 || i1l1iI1Io5.I0000Il00O < liolooioo.I0001Ioi1lo || ((z || i7 >= 100) && i7 >= 40)) {
                                        }
                                    }
                                }
/* 1113 */                      arrayList2.add(oiI1oi19);
                            }
/* 1119 */                  Collections.sort(arrayList2, IliIiio1.I00ioIO);
                        } catch (Throwable th3) {
/* 1188 */                  io0oo1l1Var.I0000O();
/* 6116 */                  throw th3;
                        }
                    }
/* 1126 */          if (arrayList2.isEmpty()) {
/* 1131 */              Log.isLoggable("AccelerationManager", 3);
/* 1141 */              return (I01l10Oi) i01l10Oi.cloneWithRunConfigAssigned("default_config", false);
                    }
/* 1152 */          if (Log.isLoggable("AccelerationManager", 3)) {
/* 1168 */              "getBestConfiguredOptions: ".concat(String.valueOf(((OiI1oi1) arrayList2.get(0)).I0000Il00O));
                    }
/* 1175 */          OiI1oi1 oiI1oi110 = (OiI1oi1) arrayList2.get(0);
/* 1185 */          return (I01l10Oi) oiI1oi110.I00000oOI.cloneWithRunConfigAssigned(oiI1oi110.I0000Il00O, false);
                }
            }

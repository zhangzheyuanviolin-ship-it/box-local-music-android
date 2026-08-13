            package p000;

            import android.content.Context;
            import android.content.Intent;
            import android.util.Size;
            import android.view.ActionMode;
            import android.view.View;
            import androidx.work.impl.WorkDatabase;
            import androidx.work.impl.model.WorkSpec;
            import com.google.firebase.messaging.FirebaseMessagingService;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.Executor;
            import java.util.concurrent.ThreadPoolExecutor;
            import java.util.logging.Logger;
            
            public final class I00ioIO implements Runnable {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;
                public Object I00iio;

                public I00ioIO(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final void run() {
                    O110lI o110lII0000O;
/* 4 */             boolean zBooleanValue = true;
/* 4 */             char c = 1;
/* 4 */             char c2 = 1;
/* 5 */             IOoil1iiIilo iOoil1iiIilo = null;
                    switch (this.I00iOIl) {
                        case 0:
/* 931 */                   Throwable th = (Throwable) this.I00iiI;
/* 935 */                   I00l0I0l0lO1 i00l0I0l0lO1 = (I00l0I0l0lO1) this.I00iiO;
/* 939 */                   List list = (List) this.I00iio;
/* 941 */                   if (th != null) {
/* 945 */                       i00l0I0l0lO1.I00000oOI.onError(th);
/* 954 */                       return;
                            } else {
/* 951 */                       i00l0I0l0lO1.I00000oOI.I00000oIO(list);
/* 954 */                       return;
                            }
                        case 1:
/* 895 */                   I100OOIO0oio i100OOIO0oio = (I100OOIO0oio) this.I00iiI;
/* 899 */                   I100Iil1o1 i100Iil1o1 = (I100Iil1o1) this.I00iiO;
/* 903 */                   I100OI i100oi = (I100OI) this.I00iio;
/* 905 */                   View view = i100OOIO0oio.I00000oIO;
/* 909 */                   IlOil01I ilOil01I = new IlOil01I();
/* 912 */                   ilOil01I.I00000oIO = i100Iil1o1;
/* 914 */                   VarHandle.storeStoreFence();
/* 917 */                   ActionMode actionModeStartActionMode = view.startActionMode(ilOil01I, 1);
/* 921 */                   i100OOIO0oio.I000O01llI0 = actionModeStartActionMode;
/* 923 */                   if (actionModeStartActionMode == null) {
/* 925 */                       i100oi.close();
/* 928 */                       return;
                            }
/* 928 */                   return;
                        case 2:
/* 889 */                   ((IIl1Ol) this.I00iiI).I00000oOI(IIl1Iloio.I0000O((Oi0Iil) this.I00iiO), (IO01oO) this.I00iio);
/* 892 */                   return;
                        case 3:
/* 869 */                   ((IIl1Ol) this.I00iiI).I0000Il00O(IIl1Iloio.I0000O((Oi0Iil) this.I00iiO), (lo1iloiI1) this.I00iio);
/* 872 */                   return;
                        case 4:
/* 801 */                   ArrayList arrayList = (ArrayList) this.I00iiI;
/* 805 */                   OIOilII0IlO oIOilII0IlO = (OIOilII0IlO) this.I00iiO;
/* 809 */                   String str = (String) this.I00iio;
                            try {
/* 811 */                       Iterator it = arrayList.iterator();
                                while (true) {
/* 819 */                           if (it.hasNext()) {
/* 821 */                               Object next = it.next();
/* 836 */                               if (O0000Ioio00.I0000O(((IIllOioOlolI) next).I0001Ioi1lo(), str)) {
/* 838 */                                   iOoil1iiIilo = next;
                                        }
                                    }
                                }
/* 839 */                       IIllOioOlolI iIllOioOlolI = (IIllOioOlolI) iOoil1iiIilo;
/* 841 */                       if (iIllOioOlolI == null || (o110lII0000O = iIllOioOlolI.I0000O()) == null) {
/* 852 */                           return;
                                }
/* 849 */                       o110lII0000O.I000OiO(oIOilII0IlO);
/* 852 */                       return;
                            } catch (IllegalArgumentException unused) {
/* 852 */                       return;
                            }
                        case 5:
/* 696 */                   IiI101Oo iiI101Oo = (IiI101Oo) this.I00iiI;
/* 700 */                   I1lO11 i1lO11 = (I1lO11) this.I00iiO;
/* 702 */                   String str2 = i1lO11.I00000oIO;
/* 706 */                   I1l0Ioi01 i1l0Ioi01 = (I1l0Ioi01) this.I00iio;
/* 708 */                   iiI101Oo.getClass();
/* 711 */                   Logger logger = IiI101Oo.I0001Ioi1lo;
                            try {
/* 717 */                       OoIOiIl10ioo ooIOiIl10iooI00000oIO = iiI101Oo.I0000Il00O.I00000oIO(str2);
/* 721 */                       if (ooIOiIl10iooI00000oIO == null) {
/* 736 */                           String str3 = "Transport backend '" + str2 + "' is not registered";
/* 740 */                           logger.warning(str3);
/* 745 */                           new IllegalArgumentException(str3);
                                } else {
/* 753 */                           I1l0Ioi01 i1l0Ioi01I00000oIO = ((IO0ll11OOI) ooIOiIl10iooI00000oIO).I00000oIO(i1l0Ioi01);
/* 757 */                           OiIIilol0iO oiIIilol0iO = iiI101Oo.I0000oI00;
/* 761 */                           IiI0oIlol0 iiI0oIlol0 = new IiI0oIlol0(i);
/* 764 */                           iiI0oIlol0.I00iiI = iiI101Oo;
/* 766 */                           iiI0oIlol0.I00iiO = i1lO11;
/* 768 */                           iiI0oIlol0.I00iio = i1l0Ioi01I00000oIO;
/* 770 */                           VarHandle.storeStoreFence();
/* 773 */                           oiIIilol0iO.I00100l0(iiI0oIlol0);
                                }
/* 798 */                       return;
                            } catch (Exception e) {
/* 795 */                       logger.warning("Error scheduling event " + e.getMessage());
/* 798 */                       return;
                            }
                        case 6:
/* 672 */                   IiI1oOoo iiI1oOoo = (IiI1oOoo) this.I00iiI;
/* 676 */                   Runnable runnable = (Runnable) this.I00iiO;
/* 680 */                   Runnable runnable2 = (Runnable) this.I00iio;
/* 684 */                   if (iiI1oOoo.I000OiO) {
/* 686 */                       runnable.run();
/* 693 */                       return;
                            } else {
/* 690 */                       runnable2.run();
/* 693 */                       return;
                            }
                        case 7:
/* 644 */                   IiI1oOoo iiI1oOoo2 = (IiI1oOoo) this.I00iiI;
/* 648 */                   Iio1oiI iio1oiI = (Iio1oiI) this.I00iiO;
/* 650 */                   Map map = Collections.EMPTY_MAP;
/* 654 */                   IIiOOI iIiOOI = (IIiOOI) this.I00iio;
                            try {
/* 658 */                       iiI1oOoo2.I00000oIO.I000OOo1O(iio1oiI);
/* 661 */                       iIiOOI.I00000oOI(null);
/* 669 */                       return;
                            } catch (RuntimeException e2) {
/* 666 */                       iIiOOI.I0000O(e2);
/* 669 */                       return;
                            }
                        case 8:
/* 616 */                   Iio1000IOoi1 iio1000IOoi1 = (Iio1000IOoi1) this.I00iiI;
/* 620 */                   Iio1oiI iio1oiI2 = (Iio1oiI) this.I00iiO;
/* 622 */                   Map map2 = Collections.EMPTY_MAP;
/* 626 */                   IIiOOI iIiOOI2 = (IIiOOI) this.I00iio;
                            try {
/* 630 */                       iio1000IOoi1.I00000oIO.I000OOo1O(iio1oiI2);
/* 633 */                       iIiOOI2.I00000oOI(null);
/* 641 */                       return;
                            } catch (RuntimeException e3) {
/* 638 */                       iIiOOI2.I0000O(e3);
/* 641 */                       return;
                            }
                        case 9:
/* 592 */                   Iio1000IOoi1 iio1000IOoi12 = (Iio1000IOoi1) this.I00iiI;
/* 596 */                   Runnable runnable3 = (Runnable) this.I00iiO;
/* 600 */                   Runnable runnable4 = (Runnable) this.I00iio;
/* 604 */                   if (iio1000IOoi12.I0001Ioi1lo) {
/* 606 */                       runnable3.run();
/* 613 */                       return;
                            } else {
/* 610 */                       runnable4.run();
/* 613 */                       return;
                            }
                        case 10:
/* 520 */                   IioloOoI iioloOoI = (IioloOoI) this.I00iiI;
/* 524 */                   ilI1Io1io ili1io1io = (ilI1Io1io) this.I00iiO;
/* 528 */                   ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.I00iio;
                            try {
/* 532 */                       IliiOO1o iliiOO1oI00000oIO = il0iol.I00000oIO(iioloOoI.I00iOIl);
/* 536 */                       if (iliiOO1oI00000oIO == null) {
/* 582 */                           throw new RuntimeException("EmojiCompat font provider not available on this device.");
                                }
/* 542 */                       IliiOIiill iliiOIiill = (IliiOIiill) ((IiollO) iliiOO1oI00000oIO.I00000oOI);
                                synchronized (iliiOIiill.I00iio) {
/* 547 */                           iliiOIiill.I00ilO0 = threadPoolExecutor;
                                }
/* 552 */                       IiollO iiollO = (IiollO) iliiOO1oI00000oIO.I00000oOI;
/* 556 */                       Iiolo0I iiolo0I = new Iiolo0I();
/* 559 */                       iiolo0I.I00000oIO = ili1io1io;
/* 561 */                       iiolo0I.I00000oOI = threadPoolExecutor;
/* 563 */                       VarHandle.storeStoreFence();
/* 566 */                       iiollO.I00000oIO(iiolo0I);
/* 589 */                       return;
                            } catch (Throwable th2) {
/* 583 */                       ili1io1io.I00000oIO(th2);
/* 586 */                       threadPoolExecutor.shutdown();
/* 589 */                       return;
                            }
                        case 11:
/* 496 */                   FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.I00iiI;
/* 500 */                   Intent intent = (Intent) this.I00iiO;
/* 504 */                   OloIlI0ll oloIlI0ll = (OloIlI0ll) this.I00iio;
                            try {
/* 506 */                       firebaseMessagingService.I00000oOI(intent);
/* 512 */                       return;
                            } finally {
/* 514 */                       oloIlI0ll.I00000oOI(null);
                            }
                        case 12:
/* 490 */                   ((Ioi1Io1o) this.I00iiI).I00IlilI0i0i((Executor) this.I00iiO, (ioIOOi0) this.I00iio);
/* 493 */                   return;
                        case 13:
/* 397 */                   OOIo1i0 oOIo1i0 = (OOIo1i0) this.I00iiI;
/* 401 */                   IIiOiI0il iIiOiI0il = (IIiOiI0il) this.I00iiO;
/* 405 */                   i01ilO i01ilo = (i01ilO) this.I00iio;
/* 407 */                   oOIo1i0.getClass();
                            try {
/* 418 */                       zBooleanValue = ((Boolean) iIiOiI0il.I00iiI.get()).booleanValue();
                            } catch (InterruptedException | ExecutionException unused2) {
                            }
                            synchronized (oOIo1i0.I000iOII) {
                                try {
/* 427 */                           i01IIlI i01iiliI00000oIO = liIOI1iO.I00000oIO(i01ilo.I00000oIO);
/* 431 */                           String str4 = i01iiliI00000oIO.I00000oIO;
/* 437 */                           if (oOIo1i0.I0000Il00O(str4) == i01ilo) {
/* 439 */                               oOIo1i0.I00000oOI(str4);
                                    }
/* 449 */                           IIi0oIl.I000II().getClass();
/* 454 */                           Iterator it2 = oOIo1i0.I000OiO.iterator();
/* 462 */                           while (it2.hasNext()) {
/* 470 */                               ((Il11ii) it2.next()).I0000Il00O(i01iiliI00000oIO, zBooleanValue);
                                    }
                                } finally {
                                }
                            }
/* 475 */                   return;
                        case 14:
/* 391 */                   ((IoIlOo1o0IIl) this.I00iiI).I000o00OoI0I((OlioOil) this.I00iiO, (Map.Entry) this.I00iio);
/* 394 */                   return;
                        case 15:
/* 307 */                   Oll0OO0O oll0OO0O = (Oll0OO0O) this.I00iiI;
/* 311 */                   Oll0I0l1i1 oll0I0l1i1 = (Oll0I0l1i1) this.I00iiO;
/* 315 */                   IiI0oIlol0 iiI0oIlol02 = (IiI0oIlol0) this.I00iio;
/* 317 */                   Oll0IoIOoi1 oll0IoIOoi1 = oll0OO0O.I0001Ioi1lo;
/* 319 */                   oll0IoIOoi1.I00000oIO();
/* 324 */                   if (oll0IoIOoi1.I000II) {
/* 326 */                       oll0IoIOoi1.I000II = false;
/* 328 */                       oll0I0l1i1.I0000Il00O();
/* 333 */                       oll0I0l1i1.I000OOo1O.I00000oOI(null);
/* 378 */                       return;
                            }
/* 337 */                   oll0IoIOoi1.I00000oOI = oll0I0l1i1;
/* 339 */                   oll0IoIOoi1.I0000O = iiI0oIlol02;
/* 341 */                   Size size = oll0I0l1i1.I00000oOI;
/* 343 */                   oll0IoIOoi1.I00000oIO = size;
/* 345 */                   oll0IoIOoi1.I0001Ioi1lo = false;
/* 351 */                   if (oll0IoIOoi1.I00000oOI()) {
/* 378 */                       return;
                            }
/* 356 */                   l11I11lO.I0000O(3, "SurfaceViewImpl");
/* 375 */                   oll0IoIOoi1.I000O01llI0.I0000oI00.getHolder().setFixedSize(size.getWidth(), size.getHeight());
/* 378 */                   return;
                        default:
/* 11 */                    i000IO i000io = (i000IO) this.I00iiI;
/* 15 */                    OlO0000lIOII olO0000lIOII = (OlO0000lIOII) this.I00iiO;
/* 19 */                    OlilOlOiI olilOlOiI = (OlilOlOiI) this.I00iio;
/* 23 */                    OOIo1i0 oOIo1i02 = (OOIo1i0) i000io.I00iiI;
/* 25 */                    oOIo1i02.getClass();
/* 28 */                    i01IIlI i01iili = olO0000lIOII.I00000oIO;
/* 30 */                    String str5 = i01iili.I00000oIO;
/* 34 */                    ArrayList arrayList2 = new ArrayList();
/* 37 */                    WorkDatabase workDatabase = oOIo1i02.I0000oI00;
/* 41 */                    IiIl1O1 iiIl1O1 = new IiIl1O1(c2 == true ? 1 : 0);
/* 44 */                    iiIl1O1.I00000oOI = oOIo1i02;
/* 46 */                    iiIl1O1.I0000Il00O = arrayList2;
/* 48 */                    iiIl1O1.I0000O = str5;
/* 50 */                    VarHandle.storeStoreFence();
/* 57 */                    WorkSpec workSpec = (WorkSpec) workDatabase.I00100o1O0lo(iiIl1O1);
/* 59 */                    if (workSpec == null) {
/* 81 */                        IIi0oIl.I000II().I000l1(OOIo1i0.I000l1, "Didn't find WorkSpec for id " + i01iili);
/* 84 */                        oOIo1i02.I0000oI00(i01iili);
/* 299 */                       return;
                            }
                            synchronized (oOIo1i02.I000iOII) {
                                try {
                                    synchronized (oOIo1i02.I000iOII) {
/* 99 */                                i = oOIo1i02.I0000Il00O(str5) != null ? 1 : 0;
                                    }
/* 103 */                           if (i != 0) {
/* 111 */                               Set set = (Set) oOIo1i02.I000O01llI0.get(str5);
/* 129 */                               if (((OlO0000lIOII) set.iterator().next()).I00000oIO.I00000oOI == i01iili.I00000oOI) {
/* 131 */                                   set.add(olO0000lIOII);
/* 134 */                                   IIi0oIl iIi0oIlI000II = IIi0oIl.I000II();
/* 138 */                                   i01iili.toString();
/* 141 */                                   iIi0oIlI000II.getClass();
                                        } else {
/* 148 */                                   oOIo1i02.I0000oI00(i01iili);
                                        }
/* 299 */                               return;
                                    }
/* 160 */                           if (workSpec.getGeneration() != i01iili.I00000oOI) {
/* 162 */                               oOIo1i02.I0000oI00(i01iili);
/* 299 */                               return;
                                    }
/* 170 */                           Context context = oOIo1i02.I00000oOI;
/* 172 */                           IOllii iOllii = oOIo1i02.I0000Il00O;
/* 174 */                           OillOo0 oillOo0 = oOIo1i02.I0000O;
/* 176 */                           WorkDatabase workDatabase2 = oOIo1i02.I0000oI00;
/* 178 */                           IIo11l1iO iIo11l1iO = new IIo11l1iO();
/* 181 */                           iIo11l1iO.I00iOIl = iOllii;
/* 183 */                           iIo11l1iO.I00iiI = oillOo0;
/* 185 */                           iIo11l1iO.I00iiO = oOIo1i02;
/* 187 */                           iIo11l1iO.I00iio = workDatabase2;
/* 189 */                           iIo11l1iO.I00ilI0I1 = workSpec;
/* 191 */                           iIo11l1iO.I00ilO0 = arrayList2;
/* 197 */                           iIo11l1iO.I00io1l = context.getApplicationContext();
/* 204 */                           iIo11l1iO.I00ioIO = new OlilOlOiI();
/* 206 */                           VarHandle.storeStoreFence();
/* 209 */                           if (olilOlOiI != null) {
/* 211 */                               iIo11l1iO.I00ioIO = olilOlOiI;
                                    }
/* 213 */                           i01ilO i01iloI00000oIO = iIo11l1iO.I00000oIO();
/* 221 */                           Ii00lIOoi ii00lIOoi = (Ii00lIOoi) i01iloI00000oIO.I0000oI00.I00iiO;
/* 223 */                           O010loOOi0Oo o010loOOi0OoI00000oIO = l01oO1iOo.I00000oIO();
/* 227 */                           ii00lIOoi.getClass();
/* 239 */                           IIiOiI0il iIiOiI0ilI00000oOI = l10o11O01o1.I00000oOI(iiollilo0IO1.I00000oIO(ii00lIOoi, o010loOOi0OoI00000oIO), new i01iiOO11(i01iloI00000oIO, iOoil1iiIilo, c == true ? 1 : 0));
/* 247 */                           I00ioIO i00ioIO = new I00ioIO(13);
/* 250 */                           i00ioIO.I00iiI = oOIo1i02;
/* 252 */                           i00ioIO.I00iiO = iIiOiI0ilI00000oOI;
/* 254 */                           i00ioIO.I00iio = i01iloI00000oIO;
/* 256 */                           VarHandle.storeStoreFence();
/* 267 */                           iIiOiI0ilI00000oOI.I00iiI.addListener(i00ioIO, (Io1iO1Ooo0l) oOIo1i02.I0000O.I00ilI0I1);
/* 272 */                           oOIo1i02.I000II.put(str5, i01iloI00000oIO);
/* 277 */                           HashSet hashSet = new HashSet();
/* 280 */                           hashSet.add(olO0000lIOII);
/* 285 */                           oOIo1i02.I000O01llI0.put(str5, hashSet);
/* 289 */                           IIi0oIl iIi0oIlI000II2 = IIi0oIl.I000II();
/* 293 */                           i01iili.toString();
/* 296 */                           iIi0oIlI000II2.getClass();
/* 299 */                           return;
                                } finally {
                                }
                            }
                    }
                }
            }

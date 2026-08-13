            package p000;

            import android.content.Context;
            import android.net.Uri;
            import android.util.Pair;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.CopyOnWriteArrayList;
            import java.util.concurrent.Executor;
            import java.util.concurrent.Executors;
            import java.util.concurrent.atomic.AtomicReference;
            
            public final class liO0oo1 implements Runnable {
                public final int I00iOIl;
                public lili0I0IOO0 I00iiI;

                public liO0oo1(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void run() {
                    lIlIo1 lilio1;
                    boolean z;
                    lili0I0IOO0 lili0i0ioo0;
                    String str;
                    iOl0lOIi11 iol0loii11;
                    lOoo0oiii looo0oiii;
                    ListenableFuture listenableFuture;
                    I00l0OO0IO i00l0OO0IOI00000oOI;
/* 3 */             int i = this.I00iOIl;
/* 5 */             int i2 = 4;
/* 7 */             int i3 = 0;
/* 8 */             lili0I0IOO0 lili0i0ioo02 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 1189 */                  lili0i0ioo02.I00000oOI();
/* 1192 */                  return;
                        case 1:
/* 441 */                   lIlIo1 lilio12 = lili0i0ioo02.I00000oOI;
/* 443 */                   String str2 = lili0i0ioo02.I0000Il00O;
/* 445 */                   o00o0o1 o00o0o1Var = ll0I0liIiiI.I00000oIO;
/* 447 */                   iOl0lOIi11 iol0loii112 = iOl0lOIi11.I00l0OO0IO;
/* 451 */                   I0Oi111ii i0Oi111iiI00000oIO = lo01OlOIIoo.I00000oIO(lilio12.I00000oOI);
/* 457 */                   i0Oi111iiI00000oIO.I00O0o1oo("phenotype");
/* 462 */                   i0Oi111iiI00000oIO.I00O10llo("all_accounts.pb");
/* 465 */                   Uri uriI00OI1 = i0Oi111iiI00000oIO.I00OI1();
/* 469 */                   if (uriI00OI1 == null) {
/* 1185 */                      IOOlIIilOl0.I000II("Null uri");
/* 1188 */                      return;
                            }
/* 471 */                   lOoo0oiii looo0oiiiI001IIilI0O = lOoo0oiii.I001IIilI0O();
/* 475 */                   if (looo0oiiiI001IIilI0O == null) {
/* 1179 */                      IOOlIIilOl0.I000II("Null schema");
/* 1188 */                      return;
                            }
/* 479 */                   OOI1o1oII0 oOI1o1oII0I0000Il00O = OIiiIl0iO.I0000Il00O(ll0I0liIiiI.I00000oIO);
/* 483 */                   IoilOOi ioilOOi = IoillO0OOoo.I00iiI;
/* 485 */                   OOol0l1I1 oOol0l1I1 = OOol0l1I1.I00ilI0I1;
/* 489 */                   loOliOIioIo loolioiioio = new loOliOIioIo();
/* 492 */                   loolioiioio.I00000oIO = uriI00OI1;
/* 494 */                   loolioiioio.I00000oOI = looo0oiiiI001IIilI0O;
/* 496 */                   loolioiioio.I0000Il00O = oOI1o1oII0I0000Il00O;
/* 498 */                   loolioiioio.I0000O = oOol0l1I1;
/* 500 */                   VarHandle.storeStoreFence();
/* 503 */                   I1ii1o0 i1ii1o0 = ll0I0liIiiI.I0000Il00O;
/* 505 */                   if (i1ii1o0 == null) {
                                synchronized (ll0I0liIiiI.I00000oOI) {
                                    try {
/* 510 */                               i1ii1o0 = ll0I0liIiiI.I0000Il00O;
/* 512 */                               if (i1ii1o0 == null) {
/* 516 */                                   HashMap map = new HashMap();
/* 519 */                                   OI011o1 oI011o1I00000oIO = lilio12.I00000oIO();
/* 523 */                                   z = true;
/* 531 */                                   lloOo1iol llooo1iol = (lloOo1iol) lilio12.I0001Ioi1lo.get();
/* 533 */                                   lolOl101 lolol101 = lolOl101.I00000oIO;
/* 543 */                                   lilio1 = lilio12;
/* 547 */                                   lII0I0I01I1l.I0000Il00O(!map.containsKey("singleproc"), "There is already a factory registered for the ID %s", "singleproc");
/* 550 */                                   map.put("singleproc", lolol101);
/* 558 */                                   I1ii1o0 i1ii1o02 = new I1ii1o0(23, false);
/* 566 */                                   i1ii1o02.I00iiI = new ConcurrentHashMap();
/* 568 */                                   oI011o1I00000oIO.getClass();
/* 571 */                                   i1ii1o02.I00iiO = oI011o1I00000oIO;
/* 573 */                                   llooo1iol.getClass();
/* 576 */                                   i1ii1o02.I00iio = llooo1iol;
/* 578 */                                   i1ii1o02.I00ilO0 = map;
/* 586 */                                   lII0I0I01I1l.I00000oOI(!map.isEmpty());
/* 591 */                                   i1ii1o02.I00ilI0I1 = lOIII1ol1Ii.I0000Il00O;
/* 593 */                                   VarHandle.storeStoreFence();
/* 596 */                                   ll0I0liIiiI.I0000Il00O = i1ii1o02;
/* 598 */                                   i1ii1o0 = i1ii1o02;
                                        } else {
/* 602 */                                   lilio1 = lilio12;
/* 604 */                                   z = true;
                                        }
                                    } finally {
                                    }
                                }
                            } else {
/* 610 */                       lilio1 = lilio12;
/* 612 */                       z = true;
                            }
/* 618 */                   ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) i1ii1o0.I00iiI;
/* 624 */                   Pair pairCreate = (Pair) concurrentHashMap.get(uriI00OI1);
/* 626 */                   if (pairCreate == null) {
/* 634 */                       lII0I0I01I1l.I0000Il00O(uriI00OI1.isHierarchical(), "Uri must be hierarchical: %s", uriI00OI1);
/* 637 */                       String lastPathSegment = uriI00OI1.getLastPathSegment();
/* 641 */                       if (lastPathSegment == null) {
/* 614 */                           lastPathSegment = "";
                                }
/* 646 */                       int iLastIndexOf = lastPathSegment.lastIndexOf(46);
/* 669 */                       lII0I0I01I1l.I0000Il00O((iLastIndexOf == -1 ? "" : lastPathSegment.substring(iLastIndexOf + 1)).equals(OIloIiI0oI.I00l0OO0IO), "Uri extension must be .pb: %s", uriI00OI1);
/* 682 */                       lolOl101 lolol1012 = (lolOl101) ((HashMap) i1ii1o0.I00ilO0).get("singleproc");
/* 692 */                       lII0I0I01I1l.I0000Il00O(lolol1012 != null ? z : false, "No XDataStoreVariantFactory registered for ID %s", "singleproc");
/* 695 */                       String lastPathSegment2 = uriI00OI1.getLastPathSegment();
/* 614 */                       String strSubstring = lastPathSegment2 != null ? lastPathSegment2 : "";
/* 703 */                       int iLastIndexOf2 = strSubstring.lastIndexOf(46);
/* 708 */                       if (iLastIndexOf2 != -1) {
/* 711 */                           strSubstring = strSubstring.substring(0, iLastIndexOf2);
                                }
/* 725 */                       I01i1oI i01i1oII00100l0 = I01iIIO.I00100l0(IlloOoiiO.I0000Il00O(uriI00OI1), (lOIII1ol1Ii) i1ii1o0.I00ilI0I1, Iii11Ooi.I00iOIl);
/* 731 */                       OI011o1 oI011o1 = (OI011o1) i1ii1o0.I00iiO;
/* 735 */                       lloOo1iol llooo1iol2 = (lloOo1iol) i1ii1o0.I00iio;
/* 737 */                       lolol1012.getClass();
/* 740 */                       i1o0l0i i1o0l0iVarI00000oIO = i1o0l0i.I00000oIO();
/* 746 */                       o00ooO0IO0Oo o00ooo0io0oo = new o00ooO0IO0Oo();
/* 749 */                       o00ooo0io0oo.I00000oIO = looo0oiiiI001IIilI0O;
/* 751 */                       if (i1o0l0iVarI00000oIO == null) {
/* 1018 */                          IOOlIIilOl0.I000II("Null extensionRegistryLite");
/* 1188 */                          return;
                                }
/* 753 */                       o00ooo0io0oo.I00000oOI = i1o0l0iVarI00000oIO;
/* 755 */                       VarHandle.storeStoreFence();
/* 760 */                       Ioil1OOO ioil1OOOI0000Il00O = IlloOoiiO.I0000Il00O(uriI00OI1);
/* 768 */                       iol0loii11 = iol0loii112;
/* 772 */                       Io1Oioii1111 io1Oioii1111 = new Io1Oioii1111(28);
/* 777 */                       IIlOoolol0ll iIlOoolol0ll = new IIlOoolol0ll(13);
/* 785 */                       iIlOoolol0ll.I00l0OO0IO = new Object();
/* 789 */                       looo0oiii = looo0oiiiI001IIilI0O;
/* 793 */                       IoloOio0I ioloOio0I = new IoloOio0I(12);
/* 798 */                       lili0i0ioo0 = lili0i0ioo02;
/* 800 */                       Ioil1OOO ioil1OOO = Ioil1OOO.I00iiI;
/* 805 */                       ioloOio0I.I00iiI = new AtomicReference(ioil1OOO);
/* 809 */                       str = str2;
/* 811 */                       int i4 = 14;
/* 816 */                       ioloOio0I.I00iiO = new IOO000ilo(i4);
/* 818 */                       VarHandle.storeStoreFence();
/* 821 */                       iIlOoolol0ll.I00l0I0l0lO1 = ioloOio0I;
/* 824 */                       iIlOoolol0ll.I00li1OI = null;
/* 826 */                       iIlOoolol0ll.I00iiI = strSubstring;
/* 832 */                       iIlOoolol0ll.I00iiO = IlloOoiiO.I0000O(ioil1OOOI0000Il00O);
/* 834 */                       iIlOoolol0ll.I00iio = o00ooo0io0oo;
/* 840 */                       iIlOoolol0ll.I00ilI0I1 = l1i0oIO0.I00000oIO(oI011o1);
/* 842 */                       iIlOoolol0ll.I00ilO0 = llooo1iol2;
/* 844 */                       iIlOoolol0ll.I00io1l = oOI1o1oII0I0000Il00O;
/* 846 */                       iIlOoolol0ll.I00ioIO = io1Oioii1111;
/* 848 */                       VarHandle.storeStoreFence();
/* 853 */                       loilO0l loilo0l = new loilO0l();
/* 862 */                       OoIOol ooIOol = new OoIOol(17);
/* 865 */                       ooIOol.I00iiO = loilo0l;
/* 867 */                       VarHandle.storeStoreFence();
/* 873 */                       loilo0l.I0001Ioi1lo = new I0Oi111ii(ooIOol);
/* 877 */                       Object obj = new Object();
/* 880 */                       loilo0l.I000II = obj;
/* 887 */                       loilo0l.I000OOo1O = new ArrayList();
/* 889 */                       loilo0l.I0000Il00O = iIlOoolol0ll;
/* 891 */                       loilo0l.I00000oOI = i01i1oII00100l0;
/* 893 */                       loilo0l.I00000oIO = strSubstring;
/* 899 */                       int i5 = 12;
/* 901 */                       i11I1Ili i11i1ili = new i11I1Ili(i5);
/* 904 */                       i11i1ili.I00iiI = iIlOoolol0ll;
/* 906 */                       VarHandle.storeStoreFence();
/* 912 */                       loilo0l.I0000oI00 = new I0Oi111ii(i11i1ili);
/* 916 */                       IoloOio0I ioloOio0I2 = new IoloOio0I(i5);
/* 924 */                       ioloOio0I2.I00iiI = new AtomicReference(ioil1OOO);
/* 931 */                       ioloOio0I2.I00iiO = new IOO000ilo(i4);
/* 933 */                       VarHandle.storeStoreFence();
/* 936 */                       loilo0l.I0000O = ioloOio0I2;
/* 945 */                       loilo0l.I000O01llI0 = new Io1Oioii1111(28);
/* 950 */                       liOOloi0I liooloi0i = new liOOloi0I(4);
/* 953 */                       liooloi0i.I00000oOI = loilo0l;
/* 955 */                       VarHandle.storeStoreFence();
                                synchronized (obj) {
/* 961 */                           loilo0l.I000OOo1O.add(liooloi0i);
                                }
/* 965 */                       VarHandle.storeStoreFence();
/* 972 */                       if (!oOol0l1I1.isEmpty()) {
/* 978 */                           ll10Ii1io1I ll10ii1io1i = new ll10Ii1io1I(z ? 1 : 0);
/* 981 */                           ll10ii1io1i.I00000oOI = oOol0l1I1;
/* 983 */                           ll10ii1io1i.I0000Il00O = oI011o1;
/* 985 */                           VarHandle.storeStoreFence();
                                    synchronized (obj) {
/* 991 */                               loilo0l.I000OOo1O.add(ll10ii1io1i);
                                    }
                                }
/* 999 */                       pairCreate = Pair.create(loilo0l, loolioiioio);
/* 1007 */                      Pair pair = (Pair) concurrentHashMap.putIfAbsent(uriI00OI1, pairCreate);
/* 1009 */                      if (pair != null) {
/* 1011 */                          pairCreate = pair;
                                }
                            } else {
/* 1023 */                      lili0i0ioo0 = lili0i0ioo02;
/* 1025 */                      str = str2;
/* 1027 */                      iol0loii11 = iol0loii112;
/* 1029 */                      looo0oiii = looo0oiiiI001IIilI0O;
                            }
/* 1033 */                  loilO0l loilo0l2 = (loilO0l) pairCreate.first;
/* 1037 */                  loOliOIioIo loolioiioio2 = (loOliOIioIo) pairCreate.second;
/* 1043 */                  if (!loolioiioio.equals(loolioiioio2)) {
/* 1102 */                      String strI00000oIO = lOi0oI00.I00000oIO("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", lOoo0oiii.class.getSimpleName(), uriI00OI1);
/* 1114 */                      lII0I0I01I1l.I0000Il00O(uriI00OI1.equals(loolioiioio2.I00000oIO), strI00000oIO, "uri");
/* 1127 */                      lII0I0I01I1l.I0000Il00O(looo0oiii.equals(loolioiioio2.I00000oOI), strI00000oIO, "schema");
/* 1138 */                      lII0I0I01I1l.I0000Il00O(oOI1o1oII0I0000Il00O.equals(loolioiioio2.I0000Il00O), strI00000oIO, "handler");
/* 1149 */                      lII0I0I01I1l.I0000Il00O(oOol0l1I1.equals(loolioiioio2.I0000O), strI00000oIO, "migrations");
/* 1152 */                      Object obj2 = iol0loii11;
/* 1160 */                      lII0I0I01I1l.I0000Il00O(obj2.equals(obj2), strI00000oIO, "variantConfig");
/* 1173 */                      I000II.I000iOII(lOi0oI00.I00000oIO(strI00000oIO, "unknown"));
/* 1188 */                      return;
                            }
/* 1048 */                  lii0l0 lii0l0Var = new lii0l0(1);
/* 1053 */                  lii0l0Var.I00iiI = str;
/* 1055 */                  VarHandle.storeStoreFence();
/* 1062 */                  I01iI0l00O i01iI0l00OI00000oIO = loilo0l2.I00000oIO(lii0l0Var, lilio1.I00000oIO());
/* 1070 */                  illioiliioi illioiliioiVar = new illioiliioi(13);
/* 1075 */                  illioiliioiVar.I00iiI = lili0i0ioo0;
/* 1077 */                  illioiliioiVar.I00iiO = i01iI0l00OI00000oIO;
/* 1079 */                  VarHandle.storeStoreFence();
/* 1086 */                  i01iI0l00OI00000oIO.addListener(illioiliioiVar, lilio1.I00000oIO());
/* 1188 */                  return;
                        case 2:
/* 276 */                   ll1i0O ll1i0o = lili0i0ioo02.I00000oOI.I000OOo1O;
/* 278 */                   boolean z2 = lili0i0ioo02.I0000oI00;
/* 280 */                   liOlOi lioloi = liOlOi.I00000oIO;
/* 288 */                   llIOoOoIi lliooooii = (llIOoOoIi) ll1i0o.I0000Il00O.get();
/* 290 */                   if (lliooooii == null && !z2) {
/* 294 */                       Ioil1OOO ioil1OOO2 = Ioil1OOO.I00iiI;
/* 440 */                       return;
                            }
/* 302 */                   if ((ll1i0o.I0000oI00 & 64) == 0) {
/* 304 */                       CopyOnWriteArrayList copyOnWriteArrayList = ll1i0o.I0001Ioi1lo;
                                synchronized (copyOnWriteArrayList) {
                                    try {
/* 307 */                               int i6 = ll1i0o.I0000oI00;
/* 311 */                               if ((i6 & 64) == 0) {
/* 313 */                                   copyOnWriteArrayList.add(lioloi);
/* 318 */                                   ll1i0o.I0000oI00 = i6 | 64;
                                        }
                                    } finally {
                                    }
                                }
                            }
/* 329 */                   if (ll1i0o.I000O01llI0 == null) {
                                synchronized (ll1i0o.I000II) {
                                    try {
/* 336 */                               if (ll1i0o.I000O01llI0 == null) {
/* 338 */                                   if (lliooooii == null) {
/* 340 */                                       lliooooii = ll111lolI1.I00000oIO;
                                            }
/* 345 */                                   Context context = ll1i0o.I00000oIO;
/* 351 */                                   if (lIOOli.I000lI(context)) {
/* 409 */                                       I00l0OO0IO i00l0OO0IOI00000oIO = ((lOIiI0) ll1i0o.I0000O.get()).I00000oIO(new ll1IoiliI(ll1i0o, lliooooii));
/* 413 */                                       ll1i0o.I000O01llI0 = i00l0OO0IOI00000oIO;
                                                listenableFuture = i00l0OO0IOI00000oIO;
                                            } else {
/* 353 */                                       Iioo110oI iioo110oI = Iioo110oI.I00iiO;
/* 355 */                                       OliiillO oliiillO = ll1i0o.I00000oOI;
/* 367 */                                       I011IO1I11OI i011io1i11oiI000l1 = lIOOli.I000l1(context, Executors.callable(iioo110oI, null), (Executor) oliiillO.get());
/* 373 */                                       ll10Ii1io1I ll10ii1io1i2 = new ll10Ii1io1I(i3);
/* 376 */                                       ll10ii1io1i2.I00000oOI = ll1i0o;
/* 378 */                                       ll10ii1io1i2.I0000Il00O = lliooooii;
/* 380 */                                       VarHandle.storeStoreFence();
/* 389 */                                       I01i1oI i01i1oII00100l02 = I01iIIO.I00100l0(i011io1i11oiI000l1, ll10ii1io1i2, (Executor) oliiillO.get());
/* 393 */                                       ll1i0o.I000O01llI0 = i01i1oII00100l02;
                                                listenableFuture = i01i1oII00100l02;
                                            }
/* 417 */                                   lOii1o loii1o = new lOii1o(i2);
/* 420 */                                   loii1o.I00iiI = listenableFuture;
/* 422 */                                   VarHandle.storeStoreFence();
/* 433 */                                   listenableFuture.addListener(loii1o, (Executor) ll1i0o.I00000oOI.get());
                                        }
                                    } finally {
                                    }
                                }
/* 440 */                       return;
                            }
/* 440 */                   return;
                        default:
/* 13 */                    IOI0oloi01 iOI0oloi01I00000oIO = lili0i0ioo02.I00000oIO();
/* 19 */                    String str3 = (String) iOI0oloi01I00000oIO.I00000oOI;
/* 21 */                    lIlIo1 lilio13 = lili0i0ioo02.I00000oOI;
/* 23 */                    OliiillO oliiillO2 = lilio13.I0000O;
/* 27 */                    llIii0000O0 lliii0000o0I00000oOI = lilio13.I000II.I00000oOI();
/* 31 */                    boolean z3 = lliii0000o0I00000oOI.I000OOo1O;
/* 35 */                    if (lliii0000o0I00000oOI.I000OiO) {
/* 37 */                        if ((str3 == null || str3.isEmpty()) && !z3) {
/* 47 */                            Ioil1OOO ioil1OOO3 = Ioil1OOO.I00iiI;
/* 273 */                           return;
                                }
/* 51 */                        lO0o0o1O lo0o0o1oI001IIilI0O = lO1Iill100l1.I001IIilI0O();
/* 57 */                        IIOOoI iIOOoI = (IIOOoI) iOI0oloi01I00000oIO.I0000oI00;
/* 59 */                        int i7 = iIOOoI.I00000oOI;
/* 61 */                        lO10IO1OI1O1 lo10io1oi1o1I00111O = lO11Ioi0ilo.I00111O();
/* 65 */                        lo10io1oi1o1I00111O.I0000Il00O();
/* 72 */                        ((lO11Ioi0ilo) lo10io1oi1o1I00111O.I00iiI).I001IIilI0O(i7);
/* 75 */                        int i8 = iIOOoI.I0000Il00O;
/* 77 */                        lo10io1oi1o1I00111O.I0000Il00O();
/* 84 */                        ((lO11Ioi0ilo) lo10io1oi1o1I00111O.I00iiI).I001IO000(i8);
/* 91 */                        lO11Ioi0ilo lo11ioi0ilo = (lO11Ioi0ilo) lo10io1oi1o1I00111O.I0000oI00();
/* 93 */                        lo0o0o1oI001IIilI0O.I0000Il00O();
/* 100 */                       ((lO1Iill100l1) lo0o0o1oI001IIilI0O.I00iiI).I001i1O0Ol(lo11ioi0ilo);
/* 103 */                       if (str3 != null && !str3.isEmpty()) {
/* 112 */                           lo0o0o1oI001IIilI0O.I0000Il00O();
/* 119 */                           ((lO1Iill100l1) lo0o0o1oI001IIilI0O.I00iiI).I001IO000(str3);
                                }
/* 122 */                       if (z3) {
/* 124 */                           String str4 = lili0i0ioo02.I0000Il00O;
/* 126 */                           lo0o0o1oI001IIilI0O.I0000Il00O();
/* 133 */                           ((lO1Iill100l1) lo0o0o1oI001IIilI0O.I00iiI).I001i1lo1io(str4);
                                }
/* 140 */                       lOIiI0 loiii0 = (lOIiI0) oliiillO2.get();
/* 146 */                       lO1Iill100l1 lo1iill100l1 = (lO1Iill100l1) lo0o0o1oI001IIilI0O.I0000oI00();
/* 148 */                       lI1i1OI1O0l li1i1oi1o0l = loiii0.I00000oIO;
/* 150 */                       IolIIo0o0Iio iolIIo0o0IioI0000Il00O = IoilIilo.I0000Il00O();
/* 156 */                       i0OI1l1Oo i0oi1l1oo = new i0OI1l1Oo();
/* 159 */                       i0oi1l1oo.I00iOIl = lo1iill100l1;
/* 161 */                       VarHandle.storeStoreFence();
/* 164 */                       iolIIo0o0IioI0000Il00O.I0000Il00O = i0oi1l1oo;
/* 172 */                       iolIIo0o0IioI0000Il00O.I0000O = new IlIII1l[]{iO1lI0Oi.I00000oIO};
/* 174 */                       iolIIo0o0IioI0000Il00O.I00000oIO = false;
/* 180 */                       o0IiOl o0iiolI00000oOI = li1i1oi1o0l.I00000oOI(0, iolIIo0o0IioI0000Il00O.I00000oIO());
/* 184 */                       Iii11Ooi iii11Ooi = Iii11Ooi.I00iOIl;
/* 190 */                       OoOlO1O0o ooOlO1O0o = new OoOlO1O0o(10);
/* 193 */                       ooOlO1O0o.I00iiI = li1i1oi1o0l;
/* 195 */                       ooOlO1O0o.I00iiO = lo1iill100l1;
/* 197 */                       VarHandle.storeStoreFence();
/* 204 */                       i00l0OO0IOI00000oOI = lOIiI0.I00000oOI(o0iiolI00000oOI.I000l1(iii11Ooi, ooOlO1O0o));
                            } else {
/* 209 */                       if (str3 == null || str3.isEmpty()) {
/* 271 */                           Ioil1OOO ioil1OOO4 = Ioil1OOO.I00iiI;
/* 273 */                           return;
                                }
/* 222 */                       lOIiI0 loiii02 = (lOIiI0) oliiillO2.get();
/* 224 */                       loiii02.getClass();
/* 227 */                       str3.getClass();
/* 236 */                       i00l0OO0IOI00000oOI = lOIiI0.I00000oOI(loiii02.I00000oIO.I0000Il00O(str3));
                            }
/* 242 */                   liOOloi0I liooloi0i2 = new liOOloi0I(i3);
/* 245 */                   liooloi0i2.I00000oOI = lili0i0ioo02;
/* 247 */                   VarHandle.storeStoreFence();
/* 250 */                   OI011o1 oI011o1I00000oIO2 = lilio13.I00000oIO();
/* 256 */                   int i9 = I00ll1.I00ll1;
/* 260 */                   I00l0OO0IO i00l0OO0IO = new I00l0OO0IO(i00l0OO0IOI00000oOI, lOI1111l.class, liooloi0i2);
/* 267 */                   i00l0OO0IOI00000oOI.addListener(i00l0OO0IO, l1i0oIO0.I00000oOI(oI011o1I00000oIO2, i00l0OO0IO));
/* 273 */                   return;
                    }
                }
            }

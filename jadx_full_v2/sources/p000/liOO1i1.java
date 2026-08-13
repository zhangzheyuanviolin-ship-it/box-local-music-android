            package p000;

            import android.content.Intent;
            import android.os.Bundle;
            import android.os.RemoteException;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.TreeSet;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.atomic.AtomicReference;
            
            public final class liOO1i1 implements Runnable {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;

                public liOO1i1(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void run() throws Throwable {
                    Throwable thI00000oOI;
                    switch (this.I00iOIl) {
                        case 0:
/* 655 */                   liOII1010il lioii1010il = (liOII1010il) this.I00iiO;
/* 659 */                   ListenableFuture listenableFuture = (ListenableFuture) this.I00iiI;
/* 663 */                   if ((listenableFuture instanceof li11oiolO) && (thI00000oOI = ((li11oiolO) listenableFuture).I00000oOI()) != null) {
/* 675 */                       lioii1010il.zza(thI00000oOI);
/* 702 */                       return;
                            }
                            try {
/* 683 */                       lioii1010il.zzb(ll0li01oO0li.I0000oI00(listenableFuture));
/* 702 */                       return;
                            } catch (ExecutionException e) {
/* 699 */                       lioii1010il.zza(e.getCause());
/* 702 */                       return;
                            } catch (Throwable th) {
/* 689 */                       lioii1010il.zza(th);
/* 702 */                       return;
                            }
                        case 1:
/* 621 */                   IoOlo1llOO ioOlo1llOO = (IoOlo1llOO) ((O10oO1IiI1) this.I00iiO).I00iiO;
                            try {
/* 642 */                       O10lo0O.I00000oOI(ioOlo1llOO, l1oOOloO0.I00000oIO(new OIolio1l((IliliOOliOi) ((ListenableFuture) this.I00iiI).get())));
/* 651 */                       return;
                            } catch (Throwable th2) {
/* 648 */                       O10lo0O.I00000oIO(ioOlo1llOO, th2);
/* 651 */                       return;
                            }
                        case 2:
/* 597 */                   IiI1i00oi iiI1i00oi = (IiI1i00oi) this.I00iiO;
/* 599 */                   ArrayList arrayList = iiI1i00oi.I00000oOI;
/* 603 */                   OlIIlIO1O olIIlIO1O = (OlIIlIO1O) this.I00iiI;
/* 605 */                   arrayList.remove(olIIlIO1O);
/* 610 */                   iiI1i00oi.I0000Il00O.remove(olIIlIO1O);
/* 613 */                   return;
                        case 3:
/* 591 */                   ((i0O1Oi1Ioll) this.I00iiI).I00000oOI.I00000oOI((Intent) this.I00iiO);
/* 594 */                   return;
                        case 4:
/* 502 */                   OloIIoII1oo oloIIoII1oo = (OloIIoII1oo) this.I00iiI;
/* 507 */                   boolean z = ((o0IiOl) oloIIoII1oo).I0000O;
/* 511 */                   il11loI il11loi = (il11loI) this.I00iiO;
/* 513 */                   if (z) {
/* 517 */                       il11loi.I00iio.I00100l0();
/* 580 */                       return;
                            }
                            try {
/* 533 */                       ((il11loI) this.I00iiO).I00iio.I000lI(il11loi.I00iiO.I0000O(oloIIoII1oo));
/* 580 */                       return;
                            } catch (OiII01 e2) {
/* 555 */                       boolean z2 = e2.getCause() instanceof Exception;
/* 559 */                       il11loI il11loi2 = (il11loI) this.I00iiO;
/* 561 */                       if (z2) {
/* 571 */                           il11loi2.I00iio.I000oI1ioi((Exception) e2.getCause());
/* 580 */                           return;
                                } else {
/* 577 */                           il11loi2.I00iio.I000oI1ioi(e2);
/* 580 */                           return;
                                }
                            } catch (Exception e3) {
/* 547 */                       ((il11loI) this.I00iiO).I00iio.I000oI1ioi(e3);
/* 580 */                       return;
                            }
                        case 5:
/* 496 */                   ((IIiOOI) this.I00iiI).I0000O(((ilo1O0Ii) this.I00iiO).zza());
/* 499 */                   return;
                        case 6:
/* 480 */                   ((ili0l0oo0) this.I00iiI).I000O01llI0((ilIoOl) this.I00iiO);
/* 483 */                   return;
                        case 7:
/* 459 */                   lilOOl0 lilool0 = ((l1Oli1l) this.I00iiO).I000II;
/* 461 */                   lilool0.I00OI1();
/* 468 */                   lilool0.I00OIo((lli10iI) this.I00iiI);
/* 471 */                   return;
                        case 8:
/* 422 */                   l0IIioiIOIo l0iiioiioio = (l0IIioiIOIo) this.I00iiO;
                            synchronized (l0iiioiioio.I00iiO) {
                                try {
/* 429 */                           OIi0011o oIi0011o = (OIi0011o) l0iiioiioio.I00iio;
/* 431 */                           if (oIi0011o != null) {
/* 437 */                               Exception excI0001Ioi1lo = ((OloIIoII1oo) this.I00iiI).I0001Ioi1lo();
/* 441 */                               lII0I0I000I.I000II(excI0001Ioi1lo);
/* 444 */                               oIi0011o.onFailure(excI0001Ioi1lo);
                                    }
                                } finally {
                                }
                            }
/* 452 */                   return;
                        case 9:
/* 363 */                   AtomicReference atomicReference = (AtomicReference) this.I00iiI;
                            synchronized (atomicReference) {
                                try {
                                    try {
/* 372 */                               l0olllO1i l0olllo1i = (l0olllO1i) ((lIl1O1li) this.I00iiO).I00iOIl;
/* 394 */                               atomicReference.set(Integer.valueOf(l0olllo1i.I00iio.I010o0o0oO(l0olllo1i.I000iOII().I010l1O(), iol1II1ii1i.I00OloOo)));
                                    } finally {
/* 414 */                               ((AtomicReference) this.I00iiI).notify();
                                    }
                                } finally {
                                }
                            }
/* 405 */                   return;
                        case 10:
/* 101 */                   lIl1O1li lil1o1li = (lIl1O1li) this.I00iiI;
/* 105 */                   Bundle bundle = (Bundle) this.I00iiO;
/* 107 */                   i1Il01 i1il01 = lil1o1li.I00oOio10iI1;
/* 111 */                   l0olllO1i l0olllo1i2 = (l0olllO1i) lil1o1li.I00iOIl;
/* 117 */                   if (!bundle.isEmpty()) {
/* 121 */                       l0Oi0o l0oi0o = l0olllo1i2.I00ilI0I1;
/* 123 */                       lioil0ilIOi lioil0ilioi = l0olllo1i2.I00l0I0l0lO1;
/* 125 */                       iIl1iil iil1iil = l0olllo1i2.I00iio;
/* 127 */                       l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i2.I00ilO0;
/* 129 */                       l0olllO1i.I0000oI00(l0oi0o);
/* 138 */                       Bundle bundle2 = new Bundle(l0oi0o.I00oli.I0010o());
/* 153 */                       for (String str : bundle.keySet()) {
/* 162 */                           Object obj = bundle.get(str);
/* 166 */                           if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
/* 180 */                               l0olllO1i.I0000oI00(lioil0ilioi);
/* 187 */                               if (lioil0ilIOi.I01i01OoI(obj)) {
/* 195 */                                   lioil0ilIOi.I011Ill(i1il01, null, 27, null, null, 0);
                                        }
/* 198 */                               l0olllO1i.I000II(l01o0io1ooo0);
/* 205 */                               l01o0io1ooo0.I00li1OI.I0000O(str, "Invalid default event parameter type. Name, value", obj);
                                    } else if (lioil0ilIOi.I01I1Oo0oll(str)) {
/* 215 */                               l0olllO1i.I000II(l01o0io1ooo0);
/* 222 */                               l01o0io1ooo0.I00li1OI.I0000Il00O("Invalid default event parameter name. Name", str);
                                    } else if (obj == null) {
/* 228 */                               bundle2.remove(str);
                                    } else {
/* 232 */                               l0olllO1i.I0000oI00(lioil0ilioi);
/* 235 */                               iil1iil.getClass();
/* 246 */                               if (lioil0ilioi.I010ioo("param", str, 500, obj)) {
/* 248 */                                   lioil0ilioi.I011IOil(bundle2, str, obj);
                                        }
                                    }
                                }
/* 252 */                       l0olllO1i.I0000oI00(lioil0ilioi);
/* 259 */                       lioil0ilIOi lioil0ilioi2 = ((l0olllO1i) iil1iil.I00iOIl).I00l0I0l0lO1;
/* 261 */                       l0olllO1i.I0000oI00(lioil0ilioi2);
/* 276 */                       int i = lioil0ilioi2.I01Iio10lo(201500000) ? 100 : 25;
/* 282 */                       if (bundle2.size() > i) {
/* 294 */                           Iterator it = new TreeSet(bundle2.keySet()).iterator();
/* 298 */                           int i2 = 0;
/* 303 */                           while (it.hasNext()) {
/* 309 */                               String str2 = (String) it.next();
/* 311 */                               i2++;
/* 313 */                               if (i2 > i) {
/* 315 */                                   bundle2.remove(str2);
                                        }
                                    }
/* 319 */                           l0olllO1i.I0000oI00(lioil0ilioi);
/* 328 */                           lioil0ilIOi.I011Ill(i1il01, null, 26, null, null, 0);
/* 331 */                           l0olllO1i.I000II(l01o0io1ooo0);
/* 338 */                           l01o0io1ooo0.I00li1OI.I00000oOI("Too many default event parameters set. Discarding beyond event parameter limit");
                                }
/* 341 */                       bundle = bundle2;
                            }
/* 342 */                   l0Oi0o l0oi0o2 = l0olllo1i2.I00ilI0I1;
/* 344 */                   l0olllO1i.I0000oI00(l0oi0o2);
/* 349 */                   l0oi0o2.I00oli.I001IIilI0O(bundle);
/* 356 */                   l0olllo1i2.I000OOo1O().I010l10O(bundle);
/* 359 */                   return;
                        case 11:
/* 50 */                    lOliOlO1Io loliolo1io = (lOliOlO1Io) this.I00iiO;
/* 54 */                    l0olllO1i l0olllo1i3 = (l0olllO1i) loliolo1io.I00iOIl;
/* 56 */                    iolll0ill1i iolll0ill1iVar = loliolo1io.I00iio;
/* 58 */                    if (iolll0ill1iVar == null) {
/* 60 */                        l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i3.I00ilO0;
/* 62 */                        l0olllO1i.I000II(l01o0io1ooo02);
/* 69 */                        l01o0io1ooo02.I00ilO0.I00000oOI("Failed to send measurementEnabled to service");
/* 98 */                        return;
                            }
                            try {
/* 77 */                        iolll0ill1iVar.I001i1O0Ol((lli10iI) this.I00iiI);
/* 80 */                        loliolo1io.I0110OiO();
/* 98 */                        return;
                            } catch (RemoteException e4) {
/* 86 */                        l01O0IO1ooO0 l01o0io1ooo03 = l0olllo1i3.I00ilO0;
/* 88 */                        l0olllO1i.I000II(l01o0io1ooo03);
/* 95 */                        l01o0io1ooo03.I00ilO0.I0000Il00O("Failed to send measurementEnabled to the service", e4);
/* 98 */                        return;
                            }
                        case 12:
/* 14 */                    lilOOl0 lilool02 = (lilOOl0) this.I00iiI;
/* 16 */                    lilool02.I00OI1();
/* 21 */                    Runnable runnable = (Runnable) this.I00iiO;
/* 27 */                    lilool02.I00iOIl().I010II();
/* 30 */                    ArrayList arrayList2 = lilool02.I00o0l1o1o0;
/* 32 */                    if (arrayList2 == null) {
/* 36 */                        arrayList2 = new ArrayList();
/* 39 */                        lilool02.I00o0l1o1o0 = arrayList2;
                            }
/* 41 */                    arrayList2.add(runnable);
/* 44 */                    lilool02.I000l1();
/* 47 */                    return;
                        default:
/* 7 */                     this.I00iiI = null;
/* 9 */                     this.I00iiO = null;
/* 11 */                    return;
                    }
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case 0:
/* 15 */                    String simpleName = liOO1i1.class.getSimpleName();
/* 20 */                    l1IllOOOo1 l1illoooo1 = new l1IllOOOo1(2);
/* 25 */                    l1Il1IliOI1l l1il1ilioi1l = new l1Il1IliOI1l();
/* 28 */                    l1illoooo1.I00iiO = l1il1ilioi1l;
/* 30 */                    l1illoooo1.I00iio = l1il1ilioi1l;
/* 32 */                    l1illoooo1.I00iiI = simpleName;
/* 34 */                    VarHandle.storeStoreFence();
/* 39 */                    liOII1010il lioii1010il = (liOII1010il) this.I00iiO;
/* 43 */                    l1Il1IliOI1l l1il1ilioi1l2 = new l1Il1IliOI1l();
/* 46 */                    l1il1ilioi1l.I00iiO = l1il1ilioi1l2;
/* 48 */                    l1illoooo1.I00iio = l1il1ilioi1l2;
/* 50 */                    l1il1ilioi1l2.I00iiI = lioii1010il;
/* 52 */                    return l1illoooo1.toString();
                        default:
/* 6 */                     return super.toString();
                    }
                }
            }

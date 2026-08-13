            package p000;

            import android.os.Bundle;
            import android.os.RemoteException;
            import android.text.TextUtils;
            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.concurrent.Callable;
            import java.util.concurrent.atomic.AtomicReference;
            
            public final class iOlO1o implements Runnable {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;
                public Object I00ilO0;

                public iOlO1o(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void run() throws Throwable {
                    iOlii1iOOil iolii1iooil;
                    AtomicReference atomicReference;
                    lOliOlO1Io loliolo1io;
                    iolll0ill1i iolll0ill1iVar;
                    lioil0ilIOi lioil0ilioi;
                    iolll0ill1i iolll0ill1iVar2;
/* 3 */             ii10lIloOOii ii10liloooii = null;
                    switch (this.I00iOIl) {
                        case 0:
/* 336 */                   iOlOI0l11 ioloi0l11 = (iOlOI0l11) this.I00iiO;
/* 341 */                   String str = (String) this.I00iiI;
/* 346 */                   String str2 = (String) this.I00iio;
/* 351 */                   iOlOi1iIii ioloi1iiii = (iOlOi1iIii) this.I00ilI0I1;
/* 355 */                   OloIlI0ll oloIlI0ll = (OloIlI0ll) this.I00ilO0;
                            try {
                                try {
/* 361 */                           ii10lIloOOii ii10liloooiiI00000oIO = ioloi0l11.I00000oIO.I00000oIO(str, str2, ioloi1iiii, ioloi0l11.I0001Ioi1lo);
/* 365 */                           if (ii10liloooiiI00000oIO != null) {
/* 367 */                               oloIlI0ll.I00000oOI(ii10liloooiiI00000oIO);
                                    } else {
/* 381 */                               iOlOOO1 iolooo1I00000oIO = liio1lOi0l0.I00000oIO();
                                        synchronized (ioloi0l11.I000II) {
/* 390 */                                   ioloi0l11.I000O01llI0.I00II0Ol1O0l();
/* 393 */                                   iOliil ioliil = ioloi0l11.I000O01llI0;
/* 404 */                                   lII0I0I000I.I000OiO(((IioiI0IIIIO) ioliil.I00ilI0I1) != null);
/* 413 */                                   iolii1iooil = (iOlii1iOOil) ((IioiI0IIIIO) ioliil.I00ilI0I1).I00000oOI;
                                        }
                                        try {
/* 425 */                                   IIo11l1iO iIo11l1iO = new IIo11l1iO(ioloi1iiii, str, str2, iolooo1I00000oIO, iolii1iooil, ioloi0l11.I0000O, ioloi0l11.I0000Il00O);
/* 429 */                                   ioloi1iiii = ioloi1iiii;
/* 436 */                                   if (iOlolo.I00000oIO(iIo11l1iO)) {
/* 451 */                                       ii10liloooii = (ii10lIloOOii) iIo11l1iO.I00iOIl;
/* 455 */                                       ioloi0l11.I00000oIO.I0000Il00O(ii10liloooii, str, str2, ioloi1iiii);
                                            } else {
/* 444 */                                       ((lIO0IIo) ioloi1iiii.I0000O).I000O01llI0(iI1lI0i.RPC_EXPONENTIAL_BACKOFF_FAILED);
                                            }
/* 458 */                                   oloIlI0ll.I00000oOI(ii10liloooii);
                                        } catch (IOException | InterruptedException e) {
/* 465 */                                   e = e;
/* 466 */                                   ioloi1iiii = ioloi1iiii;
/* 477 */                                   ((lIO0IIo) ioloi1iiii.I0000O).I000O01llI0(iI1lI0i.RPC_ERROR);
/* 480 */                                   oloIlI0ll.I00000oIO(e);
/* 483 */                                   ioloi1iiii.I0000Il00O();
/* 486 */                                   i1Il01 i1il01 = ioloi0l11.I0000Il00O;
/* 488 */                                   i1il01.getClass();
/* 493 */                                   i1il01.I0000O(ioloi1iiii, iOIo11i.ACCELERATION_ALLOWLIST_GET);
/* 496 */                                   return;
                                        } catch (Throwable th) {
/* 462 */                                   th = th;
/* 463 */                                   ioloi1iiii = ioloi1iiii;
/* 373 */                                   Throwable th2 = th;
/* 497 */                                   ioloi1iiii.I0000Il00O();
/* 500 */                                   i1Il01 i1il012 = ioloi0l11.I0000Il00O;
/* 502 */                                   i1il012.getClass();
/* 507 */                                   i1il012.I0000O(ioloi1iiii, iOIo11i.ACCELERATION_ALLOWLIST_GET);
/* 510 */                                   throw th2;
                                        }
                                    }
                                } catch (Throwable th3) {
/* 372 */                           th = th3;
                                }
                            } catch (IOException | InterruptedException e2) {
/* 376 */                       e = e2;
                            }
/* 483 */                   ioloi1iiii.I0000Il00O();
/* 486 */                   i1Il01 i1il013 = ioloi0l11.I0000Il00O;
/* 488 */                   i1il013.getClass();
/* 493 */                   i1il013.I0000O(ioloi1iiii, iOIo11i.ACCELERATION_ALLOWLIST_GET);
/* 496 */                   return;
                        case 1:
/* 289 */                   l1Oli1l l1oli1l = (l1Oli1l) this.I00iiO;
/* 293 */                   lli10iI lli10ii = (lli10iI) this.I00iio;
/* 297 */                   Bundle bundle = (Bundle) this.I00ilI0I1;
/* 301 */                   ioo1oIl0i10O ioo1oil0i10o = (ioo1oIl0i10O) this.I00ilO0;
/* 305 */                   String str3 = (String) this.I00iiI;
/* 307 */                   lilOOl0 lilool0 = l1oli1l.I000II;
/* 309 */                   lilool0.I00OI1();
                            try {
/* 316 */                       ioo1oil0i10o.I001lllioOl(lilool0.I00Ol10(bundle, lli10ii));
/* 332 */                       return;
                            } catch (RemoteException e3) {
/* 329 */                       lilool0.I00II0oii1o().I00ilO0.I0000O(str3, "Failed to return trigger URIs for app", e3);
/* 332 */                       return;
                            }
                        case 2:
/* 133 */                   AtomicReference atomicReference2 = (AtomicReference) this.I00iiO;
                            synchronized (atomicReference2) {
                                try {
                                    try {
/* 138 */                               loliolo1io = (lOliOlO1Io) this.I00ilO0;
/* 140 */                               iolll0ill1iVar = loliolo1io.I00iio;
                                    } catch (RemoteException e4) {
/* 245 */                               l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) ((lOliOlO1Io) this.I00ilO0).I00iOIl).I00ilO0;
/* 247 */                               l0olllO1i.I000II(l01o0io1ooo0);
/* 258 */                               l01o0io1ooo0.I00ilO0.I0000oI00("(legacy) Failed to get conditional properties; remote exception", null, (String) this.I00iiI, e4);
/* 267 */                               ((AtomicReference) this.I00iiO).set(Collections.EMPTY_LIST);
/* 272 */                               atomicReference = (AtomicReference) this.I00iiO;
                                    }
/* 142 */                           if (iolll0ill1iVar == null) {
/* 148 */                               l01O0IO1ooO0 l01o0io1ooo02 = ((l0olllO1i) loliolo1io.I00iOIl).I00ilO0;
/* 150 */                               l0olllO1i.I000II(l01o0io1ooo02);
/* 165 */                               l01o0io1ooo02.I00ilO0.I0000oI00("(legacy) Failed to get conditional properties; not connected to service", null, (String) this.I00iiI, (String) this.I00iio);
/* 170 */                               atomicReference2.set(Collections.EMPTY_LIST);
/* 173 */                               atomicReference2.notify();
/* 276 */                               return;
                                    }
/* 189 */                           if (TextUtils.isEmpty(null)) {
/* 207 */                               atomicReference2.set(iolll0ill1iVar.I000iOII((String) this.I00iiI, (String) this.I00iio, (lli10iI) this.I00ilI0I1));
                                    } else {
/* 223 */                               atomicReference2.set(iolll0ill1iVar.I00100l0(null, (String) this.I00iiI, (String) this.I00iio));
                                    }
/* 226 */                           loliolo1io.I0110OiO();
/* 231 */                           atomicReference = (AtomicReference) this.I00iiO;
/* 233 */                           atomicReference.notify();
/* 276 */                           return;
                                } catch (Throwable th4) {
/* 281 */                           ((AtomicReference) this.I00iiO).notify();
/* 284 */                           throw th4;
                                }
                            }
                        case 3:
/* 34 */                    il0IOO il0ioo = (il0IOO) this.I00ilI0I1;
/* 39 */                    String str4 = (String) this.I00iio;
/* 44 */                    String str5 = (String) this.I00iiI;
/* 48 */                    lOliOlO1Io loliolo1io2 = (lOliOlO1Io) this.I00ilO0;
/* 52 */                    l0olllO1i l0olllo1i = (l0olllO1i) loliolo1io2.I00iOIl;
/* 56 */                    ArrayList arrayList = new ArrayList();
                            try {
                                try {
/* 59 */                            iolll0ill1iVar2 = loliolo1io2.I00iio;
                                } catch (Throwable th5) {
/* 121 */                           lioil0ilIOi lioil0ilioi2 = l0olllo1i.I00l0I0l0lO1;
/* 123 */                           l0olllO1i.I0000oI00(lioil0ilioi2);
/* 126 */                           lioil0ilioi2.I01IoO(il0ioo, arrayList);
/* 129 */                           throw th5;
                                }
                            } catch (RemoteException e5) {
/* 105 */                       l01O0IO1ooO0 l01o0io1ooo03 = l0olllo1i.I00ilO0;
/* 107 */                       l0olllO1i.I000II(l01o0io1ooo03);
/* 114 */                       l01o0io1ooo03.I00ilO0.I0000oI00("Failed to get conditional properties; remote exception", str5, str4, e5);
                            }
/* 61 */                    if (iolll0ill1iVar2 != null) {
/* 92 */                        arrayList = lioil0ilIOi.I01Iol(iolll0ill1iVar2.I000iOII(str5, str4, (lli10iI) this.I00iiO));
/* 96 */                        loliolo1io2.I0110OiO();
/* 117 */                       lioil0ilioi = l0olllo1i.I00l0I0l0lO1;
/* 77 */                        l0olllO1i.I0000oI00(lioil0ilioi);
/* 80 */                        lioil0ilioi.I01IoO(il0ioo, arrayList);
/* 120 */                       return;
                            }
/* 63 */                    l01O0IO1ooO0 l01o0io1ooo04 = l0olllo1i.I00ilO0;
/* 65 */                    l0olllO1i.I000II(l01o0io1ooo04);
/* 72 */                    l01o0io1ooo04.I00ilO0.I0000O(str5, "Failed to get conditional properties; not connected to service", str4);
/* 75 */                    lioil0ilioi = l0olllo1i.I00l0I0l0lO1;
/* 77 */                    l0olllO1i.I0000oI00(lioil0ilioi);
/* 80 */                    lioil0ilioi.I01IoO(il0ioo, arrayList);
/* 120 */                   return;
                        default:
/* 27 */                    ((O1oo0i) this.I00iiO).zza((IIoiO1OOl0I) this.I00iiI, (IIoiOO0) this.I00iio, (Callable) this.I00ilI0I1, (OloIlI0ll) this.I00ilO0);
/* 30 */                    return;
                    }
                }
            }

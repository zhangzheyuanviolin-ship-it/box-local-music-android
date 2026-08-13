            package p000;

            import android.graphics.Typeface;
            import android.widget.TextView;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.util.ArrayList;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.atomic.AtomicInteger;
            
            public final class I1I1Oi0iil implements Runnable {
                public final int I00iOIl;
                public int I00iiI;
                public Object I00iiO;
                public Object I00iio;

                public I1I1Oi0iil(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void run() {
                    IIiOOI iIiOOI;
                    ArrayList arrayList;
                    int iDecrementAndGet;
                    lo00l1i1O1O lo00l1i1o1oI0000oI00;
                    switch (this.I00iOIl) {
                        case 0:
/* 456 */                   ((TextView) this.I00iiO).setTypeface((Typeface) this.I00iio, this.I00iiI);
/* 459 */                   return;
                        case 1:
/* 182 */                   O10IIOOiO o10IIOOiO = (O10IIOOiO) this.I00iio;
/* 184 */                   int i = this.I00iiI;
/* 188 */                   ListenableFuture listenableFuture = (ListenableFuture) this.I00iiO;
/* 190 */                   boolean z = o10IIOOiO.I00iiO;
/* 194 */                   AtomicInteger atomicInteger = o10IIOOiO.I00iio;
/* 196 */                   ArrayList arrayList2 = o10IIOOiO.I00iiI;
/* 202 */                   if (o10IIOOiO.isDone() || arrayList2 == null) {
/* 442 */                       lII1OI11o1I.I0000oI00("Future was done before all dependencies completed", z);
/* 445 */                       return;
                            }
                            try {
                                try {
                                    try {
                                        try {
/* 217 */                                   lII1OI11o1I.I0000oI00("Tried to set value from future which is not done", listenableFuture.isDone());
/* 224 */                                   arrayList2.set(i, iIllIoiiIO.I0000Il00O(listenableFuture));
/* 227 */                                   iDecrementAndGet = atomicInteger.decrementAndGet();
/* 235 */                                   lII1OI11o1I.I0000oI00("Less than 0 remaining futures", iDecrementAndGet >= 0);
                                        } catch (ExecutionException e) {
/* 336 */                                   if (z) {
/* 344 */                                       o10IIOOiO.I00ilO0.I0000O(e.getCause());
                                            }
/* 347 */                                   int iDecrementAndGet2 = atomicInteger.decrementAndGet();
/* 355 */                                   lII1OI11o1I.I0000oI00("Less than 0 remaining futures", iDecrementAndGet2 >= 0);
/* 358 */                                   if (iDecrementAndGet2 != 0) {
/* 445 */                                       return;
                                            }
/* 360 */                                   ArrayList arrayList3 = o10IIOOiO.I00iiI;
/* 362 */                                   if (arrayList3 != null) {
/* 364 */                                       iIiOOI = o10IIOOiO.I00ilO0;
/* 368 */                                       arrayList = new ArrayList(arrayList3);
                                            }
                                        }
                                    } catch (CancellationException unused) {
/* 372 */                               if (z) {
/* 374 */                                   o10IIOOiO.cancel(false);
                                        }
/* 414 */                               int iDecrementAndGet3 = atomicInteger.decrementAndGet();
/* 422 */                               lII1OI11o1I.I0000oI00("Less than 0 remaining futures", iDecrementAndGet3 >= 0);
/* 425 */                               if (iDecrementAndGet3 != 0) {
/* 445 */                                   return;
                                        }
/* 427 */                               ArrayList arrayList4 = o10IIOOiO.I00iiI;
/* 429 */                               if (arrayList4 != null) {
/* 431 */                                   iIiOOI = o10IIOOiO.I00ilO0;
/* 435 */                                   arrayList = new ArrayList(arrayList4);
                                        }
                                    }
                                } catch (Error e2) {
/* 276 */                           o10IIOOiO.I00ilO0.I0000O(e2);
/* 279 */                           int iDecrementAndGet4 = atomicInteger.decrementAndGet();
/* 287 */                           lII1OI11o1I.I0000oI00("Less than 0 remaining futures", iDecrementAndGet4 >= 0);
/* 290 */                           if (iDecrementAndGet4 != 0) {
/* 445 */                               return;
                                    }
/* 292 */                           ArrayList arrayList5 = o10IIOOiO.I00iiI;
/* 294 */                           if (arrayList5 != null) {
/* 296 */                               iIiOOI = o10IIOOiO.I00ilO0;
/* 300 */                               arrayList = new ArrayList(arrayList5);
                                    }
                                } catch (RuntimeException e3) {
/* 304 */                           if (z) {
/* 308 */                               o10IIOOiO.I00ilO0.I0000O(e3);
                                    }
/* 311 */                           int iDecrementAndGet5 = atomicInteger.decrementAndGet();
/* 319 */                           lII1OI11o1I.I0000oI00("Less than 0 remaining futures", iDecrementAndGet5 >= 0);
/* 322 */                           if (iDecrementAndGet5 != 0) {
/* 445 */                               return;
                                    }
/* 324 */                           ArrayList arrayList6 = o10IIOOiO.I00iiI;
/* 326 */                           if (arrayList6 != null) {
/* 328 */                               iIiOOI = o10IIOOiO.I00ilO0;
/* 332 */                               arrayList = new ArrayList(arrayList6);
                                    }
                                }
/* 238 */                       if (iDecrementAndGet == 0) {
/* 240 */                           ArrayList arrayList7 = o10IIOOiO.I00iiI;
/* 242 */                           if (arrayList7 != null) {
/* 244 */                               iIiOOI = o10IIOOiO.I00ilO0;
/* 248 */                               arrayList = new ArrayList(arrayList7);
/* 251 */                               iIiOOI.I00000oOI(arrayList);
/* 445 */                               return;
                                    }
/* 260 */                           lII1OI11o1I.I0000oI00(null, o10IIOOiO.isDone());
/* 445 */                           return;
                                }
/* 445 */                       return;
                            } catch (Throwable th) {
/* 378 */                       int iDecrementAndGet6 = atomicInteger.decrementAndGet();
/* 386 */                       lII1OI11o1I.I0000oI00("Less than 0 remaining futures", iDecrementAndGet6 >= 0);
/* 389 */                       if (iDecrementAndGet6 == 0) {
/* 391 */                           ArrayList arrayList8 = o10IIOOiO.I00iiI;
/* 393 */                           if (arrayList8 != null) {
/* 402 */                               o10IIOOiO.I00ilO0.I00000oOI(new ArrayList(arrayList8));
                                    } else {
/* 410 */                               lII1OI11o1I.I0000oI00(null, o10IIOOiO.isDone());
                                    }
                                }
/* 413 */                       throw th;
                            }
                        case 2:
                            try {
/* 163 */                       ((i0O1Oi1Ioll) this.I00iiO).I000OOo1O(this.I00iiI, 4, (String) this.I00iio);
/* 179 */                       return;
                            } catch (O11oIi e4) {
/* 176 */                       i0O1Oi1Ioll.I000O01llI0.I0000oI00("notifyModuleCompleted failed", e4);
/* 179 */                       return;
                            }
                        default:
/* 8 */                     lIOlOoIoo liolooioo = (lIOlOoIoo) this.I00iiO;
/* 10 */                    int i2 = this.I00iiI;
/* 14 */                    ArrayList arrayList9 = (ArrayList) this.I00iio;
/* 16 */                    lO0Olllill lo0olllill = liolooioo.I0000Il00O;
/* 18 */                    io0oo1l1 io0oo1l1Var = lo0olllill.I0000Il00O;
/* 20 */                    io0oo1l1Var.I00000oOI();
                            try {
/* 23 */                        lO0Olllill.I000O01llI0();
/* 26 */                        loO1IolO loo1ioloI0001Ioi1lo = lo0olllill.I0001Ioi1lo();
/* 30 */                        if (loo1ioloI0001Ioi1lo != null && (lo00l1i1o1oI0000oI00 = lo0olllill.I0000oI00()) != null) {
/* 51 */                            for (ll0oOiiIi ll0ooiiii : loo1ioloI0001Ioi1lo.I001i1lo1io()) {
/* 63 */                                if (ll0ooiiii.I00100o1O0lo() == 0) {
/* 69 */                                    liii11Oi0O liii11oi0o = (liii11Oi0O) ll0ooiiii.I000o00OoI0I();
/* 71 */                                    liii11oi0o.I0000Il00O();
/* 79 */                                    ll0oOiiIi.I001l0I00((ll0oOiiIi) liii11oi0o.I00iiI, 2);
/* 82 */                                    lo00l1i1o1oI0000oI00.I0000Il00O();
/* 95 */                                    loO1IolO.I001lloI((loO1IolO) lo00l1i1o1oI0000oI00.I00iiI, (ll0oOiiIi) liii11oi0o.I00000oIO());
/* 108 */                                   "Mark UNKNOWN result as UNSTABLE: ".concat(String.valueOf(ll0ooiiii.I00111O()));
/* 111 */                                   lO0Olllill.I000O01llI0();
                                        } else {
/* 117 */                                   lo00l1i1o1oI0000oI00.I0000O(ll0ooiiii);
                                        }
                                    }
/* 131 */                           io0oo1l1Var.I0000Il00O(((loO1IolO) lo00l1i1o1oI0000oI00.I00000oIO()).I00000oOI());
                                }
/* 137 */                       if (i2 > 0) {
/* 139 */                           lIOlOoIoo.I00000oOI();
/* 144 */                           liolooioo.I00000oIO(i2 - 1, arrayList9);
/* 147 */                           return;
                                }
/* 147 */                       return;
                            } finally {
/* 148 */                       io0oo1l1Var.I0000O();
                            }
                    }
                }
            }

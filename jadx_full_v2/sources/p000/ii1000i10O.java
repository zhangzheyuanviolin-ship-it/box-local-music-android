            package p000;

            import com.google.mlkit.vision.barcode.ZoomSuggestionOptions;
            import com.google.mlkit.vision.barcode.internal.zze;
            import com.google.mlkit.vision.barcode.internal.zzh;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Callable;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.atomic.AtomicReference;
            import java.util.concurrent.locks.LockSupport;
            
/* 13 */    public final class ii1000i10O extends AtomicReference implements Runnable {
                public static final Iioo110oI I00iio = new Iioo110oI(4);
                public static final Iioo110oI I00ilI0I1 = new Iioo110oI(4);
                public static final Iioo110oI I00ilO0 = new Iioo110oI(14);
                public static final Iioo110oI I00io1l = new Iioo110oI(14);
                public static final Iioo110oI I00ioIO = new Iioo110oI(16);
                public static final Iioo110oI I00l0I0l0lO1 = new Iioo110oI(16);
                public static final Iioo110oI I00l0OO0IO = new Iioo110oI(17);
                public static final Iioo110oI I00li1OI = new Iioo110oI(17);
                public static final Iioo110oI I00ll1 = new Iioo110oI(18);
                public static final Iioo110oI I00lli11 = new Iioo110oI(18);
                public static final Iioo110oI I00lll10 = new Iioo110oI(19);
                public static final Iioo110oI I00o0iI0io1 = new Iioo110oI(19);
                public static final Iioo110oI I00o0l1o1o0 = new Iioo110oI(20);
                public static final Iioo110oI I00o101lO = new Iioo110oI(20);
                public final int I00iOIl = 0;
                public final Object I00iiI;
                public final Object I00iiO;

                public ii1000i10O(ii110O0 ii110o0, Callable callable) {
/* 4 */             this.I00iiO = ii110o0;
/* 9 */             callable.getClass();
/* 12 */            this.I00iiI = callable;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v0, types: [ili1I1o00I0, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r2v1, types: [ili1I1o00I0, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r2v2, types: [ili1I1o00I0, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
                public void I00000oIO(ilo1O0Ol ilo1o0ol) {
                    Object ili1i1o00i0;
/* 3 */             iliIlI0o00ii iliili0o00ii = (io0Oi10oi) this.I00iiI;
/* 5 */             ilo1o0ol.getClass();
/* 10 */            if (iliili0o00ii.I00iOIl == null) {
/* 13 */                boolean z = false;
                        while (true) {
                            try {
                                try {
/* 14 */                            ili1i1o00i0 = ilo1o0ol.get();
                                    break;
                                } catch (InterruptedException unused) {
/* 107 */                           z = true;
                                } catch (Throwable th) {
/* 39 */                            if (z) {
/* 46 */                                Thread.currentThread().interrupt();
                                    }
/* 49 */                            throw th;
                                }
                            } catch (Error | Exception e) {
/* 52 */                        ili1i1o00i0 = new ili1I1o00I0();
/* 55 */                        ili1i1o00i0.I00000oIO = e;
                            } catch (CancellationException e2) {
/* 72 */                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(ilo1o0ol)), e2);
/* 75 */                        ili1i1o00i0 = new ili1I1o00I0();
/* 78 */                        ili1i1o00i0.I00000oIO = illegalArgumentException;
                            } catch (ExecutionException e3) {
/* 83 */                        Throwable cause = e3.getCause();
/* 87 */                        ili1i1o00i0 = new ili1I1o00I0();
/* 90 */                        cause.getClass();
/* 93 */                        ili1i1o00i0.I00000oIO = cause;
                            }
                        }
/* 18 */                if (z) {
/* 24 */                    Thread.currentThread().interrupt();
                        }
/* 27 */                if (ili1i1o00i0 == 0) {
/* 29 */                    ili1i1o00i0 = iliIlI0o00ii.I00io1l;
                        }
/* 101 */               if (iliIlI0o00ii.I00ilO0.I0001Ioi1lo(iliili0o00ii, null, ili1i1o00i0)) {
/* 103 */                   iliIlI0o00ii.I0000O(iliili0o00ii);
                        }
                    }
                }

                public final void I00000oOI(Thread thread) {
/* 6 */             Object obj = null;
                    switch (this.I00iOIl) {
                        case 0:
/* 387 */                   Runnable runnable = (Runnable) get();
/* 389 */                   boolean z = false;
/* 390 */                   int i = 0;
                            while (true) {
/* 391 */                       boolean z2 = runnable instanceof iOl1oI0o;
/* 393 */                       Iioo110oI iioo110oI = I00ilI0I1;
/* 395 */                       if (!z2) {
/* 397 */                           if (runnable != iioo110oI) {
/* 400 */                               if (z) {
/* 402 */                                   thread.interrupt();
                                            break;
                                        }
                                    }
                                } else {
/* 407 */                           obj = (iOl1oI0o) runnable;
                                }
/* 409 */                       i++;
/* 410 */                       if (i <= 1000) {
/* 435 */                           Thread.yield();
                                } else if (runnable == iioo110oI || compareAndSet(runnable, iioo110oI)) {
/* 430 */                           z = Thread.interrupted() || z;
/* 431 */                           LockSupport.park(obj);
                                }
/* 442 */                       runnable = (Runnable) get();
                            }
                            break;
                        case 1:
/* 325 */                   Runnable runnable2 = (Runnable) get();
/* 327 */                   boolean z3 = false;
/* 328 */                   int i2 = 0;
                            while (true) {
/* 329 */                       boolean z4 = runnable2 instanceof iloOl0;
/* 331 */                       Iioo110oI iioo110oI2 = I00io1l;
/* 333 */                       if (!z4) {
/* 335 */                           if (runnable2 != iioo110oI2) {
/* 338 */                               if (z3) {
/* 340 */                                   thread.interrupt();
                                            break;
                                        }
                                    }
                                } else {
/* 345 */                           obj = (iloOl0) runnable2;
                                }
/* 347 */                       i2++;
/* 348 */                       if (i2 <= 1000) {
/* 373 */                           Thread.yield();
                                } else if (runnable2 == iioo110oI2 || compareAndSet(runnable2, iioo110oI2)) {
/* 368 */                           z3 = Thread.interrupted() || z3;
/* 369 */                           LockSupport.park(obj);
                                }
/* 380 */                       runnable2 = (Runnable) get();
                            }
                            break;
                        case 2:
/* 263 */                   Runnable runnable3 = (Runnable) get();
/* 265 */                   boolean z5 = false;
/* 266 */                   int i3 = 0;
                            while (true) {
/* 267 */                       boolean z6 = runnable3 instanceof l00OiI;
/* 269 */                       Iioo110oI iioo110oI3 = I00l0I0l0lO1;
/* 271 */                       if (!z6) {
/* 273 */                           if (runnable3 != iioo110oI3) {
/* 276 */                               if (z5) {
/* 278 */                                   thread.interrupt();
                                            break;
                                        }
                                    }
                                } else {
/* 283 */                           obj = (l00OiI) runnable3;
                                }
/* 285 */                       i3++;
/* 286 */                       if (i3 <= 1000) {
/* 311 */                           Thread.yield();
                                } else if (runnable3 == iioo110oI3 || compareAndSet(runnable3, iioo110oI3)) {
/* 306 */                           z5 = Thread.interrupted() || z5;
/* 307 */                           LockSupport.park(obj);
                                }
/* 318 */                       runnable3 = (Runnable) get();
                            }
                            break;
                        case 3:
/* 201 */                   Runnable runnable4 = (Runnable) get();
/* 203 */                   boolean z7 = false;
/* 204 */                   int i4 = 0;
                            while (true) {
/* 205 */                       boolean z8 = runnable4 instanceof l00OiOii0Iil;
/* 207 */                       Iioo110oI iioo110oI4 = I00li1OI;
/* 209 */                       if (!z8) {
/* 211 */                           if (runnable4 != iioo110oI4) {
/* 214 */                               if (z7) {
/* 216 */                                   thread.interrupt();
                                            break;
                                        }
                                    }
                                } else {
/* 221 */                           obj = (l00OiOii0Iil) runnable4;
                                }
/* 223 */                       i4++;
/* 224 */                       if (i4 <= 1000) {
/* 249 */                           Thread.yield();
                                } else if (runnable4 == iioo110oI4 || compareAndSet(runnable4, iioo110oI4)) {
/* 244 */                           z7 = Thread.interrupted() || z7;
/* 245 */                           LockSupport.park(obj);
                                }
/* 256 */                       runnable4 = (Runnable) get();
                            }
                            break;
                        case 4:
/* 139 */                   Runnable runnable5 = (Runnable) get();
/* 141 */                   boolean z9 = false;
/* 142 */                   int i5 = 0;
                            while (true) {
/* 143 */                       boolean z10 = runnable5 instanceof l00loil;
/* 145 */                       Iioo110oI iioo110oI5 = I00lli11;
/* 147 */                       if (!z10) {
/* 149 */                           if (runnable5 != iioo110oI5) {
/* 152 */                               if (z9) {
/* 154 */                                   thread.interrupt();
                                            break;
                                        }
                                    }
                                } else {
/* 159 */                           obj = (l00loil) runnable5;
                                }
/* 161 */                       i5++;
/* 162 */                       if (i5 <= 1000) {
/* 187 */                           Thread.yield();
                                } else if (runnable5 == iioo110oI5 || compareAndSet(runnable5, iioo110oI5)) {
/* 182 */                           z9 = Thread.interrupted() || z9;
/* 183 */                           LockSupport.park(obj);
                                }
/* 194 */                       runnable5 = (Runnable) get();
                            }
                            break;
                        case 5:
/* 77 */                    Runnable runnable6 = (Runnable) get();
/* 79 */                    boolean z11 = false;
/* 80 */                    int i6 = 0;
                            while (true) {
/* 81 */                        boolean z12 = runnable6 instanceof l0lIl10Io1O;
/* 83 */                        Iioo110oI iioo110oI6 = I00o0iI0io1;
/* 85 */                        if (!z12) {
/* 87 */                            if (runnable6 != iioo110oI6) {
/* 90 */                                if (z11) {
/* 92 */                                    thread.interrupt();
                                            break;
                                        }
                                    }
                                } else {
/* 97 */                            obj = (l0lIl10Io1O) runnable6;
                                }
/* 99 */                        i6++;
/* 100 */                       if (i6 <= 1000) {
/* 125 */                           Thread.yield();
                                } else if (runnable6 == iioo110oI6 || compareAndSet(runnable6, iioo110oI6)) {
/* 120 */                           z11 = Thread.interrupted() || z11;
/* 121 */                           LockSupport.park(obj);
                                }
/* 132 */                       runnable6 = (Runnable) get();
                            }
                            break;
                        default:
/* 15 */                    Runnable runnable7 = (Runnable) get();
/* 17 */                    boolean z13 = false;
/* 18 */                    int i7 = 0;
                            while (true) {
/* 19 */                        boolean z14 = runnable7 instanceof liiI1iloloIO;
/* 21 */                        Iioo110oI iioo110oI7 = I00o101lO;
/* 23 */                        if (!z14) {
/* 25 */                            if (runnable7 != iioo110oI7) {
/* 28 */                                if (z13) {
/* 30 */                                    thread.interrupt();
                                            break;
                                        }
                                    }
                                } else {
/* 35 */                            obj = (liiI1iloloIO) runnable7;
                                }
/* 37 */                        i7++;
/* 38 */                        if (i7 <= 1000) {
/* 63 */                            Thread.yield();
                                } else if (runnable7 == iioo110oI7 || compareAndSet(runnable7, iioo110oI7)) {
/* 58 */                            z13 = Thread.interrupted() || z13;
/* 59 */                            LockSupport.park(obj);
                                }
/* 70 */                        runnable7 = (Runnable) get();
                            }
                            break;
                    }
                }

                @Override
                public final void run() {
                    Object objCall;
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj = this.I00iiI;
/* 5 */             ilo1O0Ol ilo1o0ol = null;
/* 5 */             Object objCall2 = null;
/* 5 */             Object objCall3 = null;
/* 5 */             Object objCall4 = null;
/* 5 */             Object objCall5 = null;
/* 5 */             Object objCall6 = null;
/* 6 */             Object obj2 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 578 */                   ii110O0 ii110o0 = (ii110O0) obj2;
/* 580 */                   Thread threadCurrentThread = Thread.currentThread();
/* 588 */                   if (compareAndSet(null, threadCurrentThread)) {
/* 592 */                       boolean zIsDone = ii110o0.isDone();
/* 596 */                       Iioo110oI iioo110oI = I00iio;
/* 598 */                       if (zIsDone) {
/* 674 */                           objCall = null;
                                } else {
                                    try {
/* 602 */                               objCall = ((Callable) obj).call();
                                    } catch (Throwable th) {
                                        try {
/* 610 */                                   if (th instanceof InterruptedException) {
/* 616 */                                       Thread.currentThread().interrupt();
                                            }
/* 626 */                                   if (!compareAndSet(threadCurrentThread, iioo110oI)) {
/* 628 */                                       I00000oOI(threadCurrentThread);
                                            }
/* 633 */                                   iIOlo0O iiolo0o = new iIOlo0O();
/* 636 */                                   iiolo0o.I00000oIO = th;
/* 644 */                                   if (iIOoOi1oli.I00ilO0.I0001Ioi1lo(ii110o0, null, iiolo0o)) {
/* 646 */                                       iIOoOi1oli.I0000oI00(ii110o0);
/* 701 */                                       return;
                                            }
/* 701 */                                   return;
                                        } catch (Throwable th2) {
/* 654 */                                   if (!compareAndSet(threadCurrentThread, iioo110oI)) {
/* 657 */                                       I00000oOI(threadCurrentThread);
                                            }
/* 668 */                                   if (iIOoOi1oli.I00ilO0.I0001Ioi1lo(ii110o0, null, iIOoOi1oli.I00io1l)) {
/* 670 */                                       iIOoOi1oli.I0000oI00(ii110o0);
                                            }
/* 673 */                                   throw th2;
                                        }
                                    }
                                }
/* 679 */                       if (!compareAndSet(threadCurrentThread, iioo110oI)) {
/* 681 */                           I00000oOI(threadCurrentThread);
                                }
/* 684 */                       if (zIsDone) {
/* 701 */                           return;
                                }
/* 686 */                       if (objCall == null) {
/* 688 */                           objCall = iIOoOi1oli.I00io1l;
                                }
/* 696 */                       if (iIOoOi1oli.I00ilO0.I0001Ioi1lo(ii110o0, null, objCall)) {
/* 698 */                           iIOoOi1oli.I0000oI00(ii110o0);
/* 701 */                           return;
                                }
/* 701 */                       return;
                            }
/* 701 */                   return;
                        case 1:
/* 426 */                   io0Oi10oi io0oi10oi = (io0Oi10oi) obj;
/* 428 */                   Thread threadCurrentThread2 = Thread.currentThread();
/* 436 */                   if (compareAndSet(null, threadCurrentThread2)) {
/* 440 */                       boolean zIsDone2 = io0oi10oi.isDone();
/* 444 */                       Iioo110oI iioo110oI2 = I00ilO0;
/* 446 */                       if (!zIsDone2) {
                                    try {
/* 448 */                               o0ioiOl00i o0ioiol00i = (o0ioiOl00i) obj2;
/* 450 */                               o0l1o1ooIoo o0l1o1ooioo = o0ioiol00i.I00000oIO;
/* 452 */                               float f = o0ioiol00i.I00000oOI;
/* 454 */                               zze zzeVar = o0l1o1ooioo.I0010I0i;
/* 460 */                               float f2 = o0l1o1ooioo.I000iOII;
/* 462 */                               if (f < 1.0f) {
/* 464 */                                   f = 1.0f;
                                        }
/* 465 */                               float f3 = 0.0f;
/* 468 */                               if (f2 <= 0.0f || f <= f2) {
/* 475 */                                   f2 = f;
                                        }
/* 476 */                               ZoomSuggestionOptions zoomSuggestionOptions = zzeVar.zza;
/* 478 */                               int i2 = zzh.zzc;
/* 489 */                               if (true == zoomSuggestionOptions.zzb().setZoom(f2)) {
/* 492 */                                   f3 = f2;
                                        }
/* 493 */                               Float fValueOf = Float.valueOf(f3);
/* 499 */                               ilo1O0Ol ilo1o0ol2 = new ilo1O0Ol();
/* 502 */                               ilo1o0ol2.I00iOIl = fValueOf;
/* 504 */                               VarHandle.storeStoreFence();
/* 507 */                               ilo1o0ol = ilo1o0ol2;
                                    } catch (Throwable th3) {
                                        try {
/* 512 */                                   if (th3 instanceof InterruptedException) {
/* 518 */                                       Thread.currentThread().interrupt();
                                            }
/* 525 */                                   if (!compareAndSet(threadCurrentThread2, iioo110oI2)) {
/* 527 */                                       I00000oOI(threadCurrentThread2);
                                            }
/* 532 */                                   ili1I1o00I0 ili1i1o00i0 = new ili1I1o00I0();
/* 535 */                                   ili1i1o00i0.I00000oIO = th3;
/* 543 */                                   if (iliIlI0o00ii.I00ilO0.I0001Ioi1lo(io0oi10oi, null, ili1i1o00i0)) {
/* 545 */                                       iliIlI0o00ii.I0000O(io0oi10oi);
/* 577 */                                       return;
                                            }
/* 577 */                                   return;
                                        } catch (Throwable unused) {
/* 553 */                                   if (!compareAndSet(threadCurrentThread2, iioo110oI2)) {
/* 556 */                                       I00000oOI(threadCurrentThread2);
                                            }
/* 559 */                                   I00000oIO(null);
/* 562 */                                   throw null;
                                        }
                                    }
                                }
/* 567 */                       if (!compareAndSet(threadCurrentThread2, iioo110oI2)) {
/* 569 */                           I00000oOI(threadCurrentThread2);
                                }
/* 572 */                       if (zIsDone2) {
/* 577 */                           return;
                                }
/* 574 */                       I00000oIO(ilo1o0ol);
/* 577 */                       return;
                            }
/* 577 */                   return;
                        case 2:
/* 343 */                   l0Il1lOIo l0il1loio = (l0Il1lOIo) obj2;
/* 345 */                   Thread threadCurrentThread3 = Thread.currentThread();
/* 353 */                   if (compareAndSet(null, threadCurrentThread3)) {
/* 356 */                       boolean zIsDone3 = l0il1loio.isDone();
/* 360 */                       Iioo110oI iioo110oI3 = I00ioIO;
/* 362 */                       if (!zIsDone3) {
                                    try {
/* 366 */                               objCall6 = ((Callable) obj).call();
                                    } catch (Throwable th4) {
                                        try {
/* 374 */                                   if (th4 instanceof InterruptedException) {
/* 380 */                                       Thread.currentThread().interrupt();
                                            }
/* 387 */                                   if (!compareAndSet(threadCurrentThread3, iioo110oI3)) {
/* 389 */                                       I00000oOI(threadCurrentThread3);
                                            }
/* 392 */                                   l0il1loio.I000OOo1O(th4);
/* 425 */                                   return;
                                        } catch (Throwable th5) {
/* 401 */                                   if (!compareAndSet(threadCurrentThread3, iioo110oI3)) {
/* 404 */                                       I00000oOI(threadCurrentThread3);
                                            }
/* 407 */                                   l0il1loio.I000O01llI0(null);
/* 410 */                                   throw th5;
                                        }
                                    }
                                }
/* 415 */                       if (!compareAndSet(threadCurrentThread3, iioo110oI3)) {
/* 417 */                           I00000oOI(threadCurrentThread3);
                                }
/* 420 */                       if (zIsDone3) {
/* 425 */                           return;
                                }
/* 422 */                       l0il1loio.I000O01llI0(objCall6);
/* 425 */                       return;
                            }
/* 425 */                   return;
                        case 3:
/* 260 */                   l0IlIi l0ilii = (l0IlIi) obj2;
/* 262 */                   Thread threadCurrentThread4 = Thread.currentThread();
/* 270 */                   if (compareAndSet(null, threadCurrentThread4)) {
/* 273 */                       boolean zIsDone4 = l0ilii.isDone();
/* 277 */                       Iioo110oI iioo110oI4 = I00l0OO0IO;
/* 279 */                       if (!zIsDone4) {
                                    try {
/* 283 */                               objCall5 = ((Callable) obj).call();
                                    } catch (Throwable th6) {
                                        try {
/* 291 */                                   if (th6 instanceof InterruptedException) {
/* 297 */                                       Thread.currentThread().interrupt();
                                            }
/* 304 */                                   if (!compareAndSet(threadCurrentThread4, iioo110oI4)) {
/* 306 */                                       I00000oOI(threadCurrentThread4);
                                            }
/* 309 */                                   l0ilii.I000OOo1O(th6);
/* 342 */                                   return;
                                        } catch (Throwable th7) {
/* 318 */                                   if (!compareAndSet(threadCurrentThread4, iioo110oI4)) {
/* 321 */                                       I00000oOI(threadCurrentThread4);
                                            }
/* 324 */                                   l0ilii.I000O01llI0(null);
/* 327 */                                   throw th7;
                                        }
                                    }
                                }
/* 332 */                       if (!compareAndSet(threadCurrentThread4, iioo110oI4)) {
/* 334 */                           I00000oOI(threadCurrentThread4);
                                }
/* 337 */                       if (zIsDone4) {
/* 342 */                           return;
                                }
/* 339 */                       l0ilii.I000O01llI0(objCall5);
/* 342 */                       return;
                            }
/* 342 */                   return;
                        case 4:
/* 177 */                   l0O1IIOoi l0o1iiooi = (l0O1IIOoi) obj2;
/* 179 */                   Thread threadCurrentThread5 = Thread.currentThread();
/* 187 */                   if (compareAndSet(null, threadCurrentThread5)) {
/* 190 */                       boolean zIsDone5 = l0o1iiooi.isDone();
/* 194 */                       Iioo110oI iioo110oI5 = I00ll1;
/* 196 */                       if (!zIsDone5) {
                                    try {
/* 200 */                               objCall4 = ((Callable) obj).call();
                                    } catch (Throwable th8) {
                                        try {
/* 208 */                                   if (th8 instanceof InterruptedException) {
/* 214 */                                       Thread.currentThread().interrupt();
                                            }
/* 221 */                                   if (!compareAndSet(threadCurrentThread5, iioo110oI5)) {
/* 223 */                                       I00000oOI(threadCurrentThread5);
                                            }
/* 226 */                                   l0o1iiooi.I000OOo1O(th8);
/* 259 */                                   return;
                                        } catch (Throwable th9) {
/* 235 */                                   if (!compareAndSet(threadCurrentThread5, iioo110oI5)) {
/* 238 */                                       I00000oOI(threadCurrentThread5);
                                            }
/* 241 */                                   l0o1iiooi.I000O01llI0(null);
/* 244 */                                   throw th9;
                                        }
                                    }
                                }
/* 249 */                       if (!compareAndSet(threadCurrentThread5, iioo110oI5)) {
/* 251 */                           I00000oOI(threadCurrentThread5);
                                }
/* 254 */                       if (zIsDone5) {
/* 259 */                           return;
                                }
/* 256 */                       l0o1iiooi.I000O01llI0(objCall4);
/* 259 */                       return;
                            }
/* 259 */                   return;
                        case 5:
/* 94 */                    l10o01O l10o01o = (l10o01O) obj2;
/* 96 */                    Thread threadCurrentThread6 = Thread.currentThread();
/* 104 */                   if (compareAndSet(null, threadCurrentThread6)) {
/* 107 */                       boolean zIsDone6 = l10o01o.isDone();
/* 111 */                       Iioo110oI iioo110oI6 = I00lll10;
/* 113 */                       if (!zIsDone6) {
                                    try {
/* 117 */                               objCall3 = ((Callable) obj).call();
                                    } catch (Throwable th10) {
                                        try {
/* 125 */                                   if (th10 instanceof InterruptedException) {
/* 131 */                                       Thread.currentThread().interrupt();
                                            }
/* 138 */                                   if (!compareAndSet(threadCurrentThread6, iioo110oI6)) {
/* 140 */                                       I00000oOI(threadCurrentThread6);
                                            }
/* 143 */                                   l10o01o.I000OOo1O(th10);
/* 176 */                                   return;
                                        } catch (Throwable th11) {
/* 152 */                                   if (!compareAndSet(threadCurrentThread6, iioo110oI6)) {
/* 155 */                                       I00000oOI(threadCurrentThread6);
                                            }
/* 158 */                                   l10o01o.I000O01llI0(null);
/* 161 */                                   throw th11;
                                        }
                                    }
                                }
/* 166 */                       if (!compareAndSet(threadCurrentThread6, iioo110oI6)) {
/* 168 */                           I00000oOI(threadCurrentThread6);
                                }
/* 171 */                       if (zIsDone6) {
/* 176 */                           return;
                                }
/* 173 */                       l10o01o.I000O01llI0(objCall3);
/* 176 */                       return;
                            }
/* 176 */                   return;
                        default:
/* 11 */                    lio1llilO lio1llilo = (lio1llilO) obj2;
/* 13 */                    Thread threadCurrentThread7 = Thread.currentThread();
/* 21 */                    if (compareAndSet(null, threadCurrentThread7)) {
/* 24 */                        boolean zIsDone7 = lio1llilo.isDone();
/* 28 */                        Iioo110oI iioo110oI7 = I00o0l1o1o0;
/* 30 */                        if (!zIsDone7) {
                                    try {
/* 34 */                                objCall2 = ((Callable) obj).call();
                                    } catch (Throwable th12) {
                                        try {
/* 42 */                                    if (th12 instanceof InterruptedException) {
/* 48 */                                        Thread.currentThread().interrupt();
                                            }
/* 55 */                                    if (!compareAndSet(threadCurrentThread7, iioo110oI7)) {
/* 57 */                                        I00000oOI(threadCurrentThread7);
                                            }
/* 60 */                                    lio1llilo.I000OOo1O(th12);
/* 93 */                                    return;
                                        } catch (Throwable th13) {
/* 69 */                                    if (!compareAndSet(threadCurrentThread7, iioo110oI7)) {
/* 72 */                                        I00000oOI(threadCurrentThread7);
                                            }
/* 75 */                                    lio1llilo.I000O01llI0(null);
/* 78 */                                    throw th13;
                                        }
                                    }
                                }
/* 83 */                        if (!compareAndSet(threadCurrentThread7, iioo110oI7)) {
/* 85 */                            I00000oOI(threadCurrentThread7);
                                }
/* 88 */                        if (zIsDone7) {
/* 93 */                            return;
                                }
/* 90 */                        lio1llilo.I000O01llI0(objCall2);
/* 93 */                        return;
                            }
/* 93 */                    return;
                    }
                }

                @Override
                public final String toString() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj = this.I00iiI;
/* 7 */             String strI000lI = "running=[NOT STARTED YET]";
                    switch (i) {
                        case 0:
/* 319 */                   Runnable runnable = (Runnable) get();
/* 323 */                   if (runnable == I00iio) {
/* 15 */                        strI000lI = "running=[DONE]";
                            } else if (runnable instanceof iOl1oI0o) {
/* 13 */                        strI000lI = "running=[INTERRUPTED]";
                            } else if (runnable instanceof Thread) {
/* 343 */                       strI000lI = IlIi0I0.I000lI("running=[RUNNING ON ", ((Thread) runnable).getName(), "]");
                            }
/* 353 */                   return IlIi0I0.I000lI(strI000lI, ", ", ((Callable) obj).toString());
                        case 1:
/* 274 */                   Runnable runnable2 = (Runnable) get();
/* 278 */                   if (runnable2 == I00ilO0) {
/* 15 */                        strI000lI = "running=[DONE]";
                            } else if (runnable2 instanceof iloOl0) {
/* 13 */                        strI000lI = "running=[INTERRUPTED]";
                            } else if (runnable2 instanceof Thread) {
/* 298 */                       strI000lI = IlIi0I0.I000lI("running=[RUNNING ON ", ((Thread) runnable2).getName(), "]");
                            }
/* 310 */                   return IlIi0I0.I000lI(strI000lI, ", ", ((o0ioiOl00i) this.I00iiO).toString());
                        case 2:
/* 231 */                   Runnable runnable3 = (Runnable) get();
/* 235 */                   if (runnable3 == I00ioIO) {
/* 15 */                        strI000lI = "running=[DONE]";
                            } else if (runnable3 instanceof l00OiI) {
/* 13 */                        strI000lI = "running=[INTERRUPTED]";
                            } else if (runnable3 instanceof Thread) {
/* 255 */                       strI000lI = IlIi0I0.I000lI("running=[RUNNING ON ", ((Thread) runnable3).getName(), "]");
                            }
/* 265 */                   return IlIi0I0.I000lI(strI000lI, ", ", ((Callable) obj).toString());
                        case 3:
/* 188 */                   Runnable runnable4 = (Runnable) get();
/* 192 */                   if (runnable4 == I00l0OO0IO) {
/* 15 */                        strI000lI = "running=[DONE]";
                            } else if (runnable4 instanceof l00OiOii0Iil) {
/* 13 */                        strI000lI = "running=[INTERRUPTED]";
                            } else if (runnable4 instanceof Thread) {
/* 212 */                       strI000lI = IlIi0I0.I000lI("running=[RUNNING ON ", ((Thread) runnable4).getName(), "]");
                            }
/* 222 */                   return IlIi0I0.I000lI(strI000lI, ", ", ((Callable) obj).toString());
                        case 4:
/* 145 */                   Runnable runnable5 = (Runnable) get();
/* 149 */                   if (runnable5 == I00ll1) {
/* 15 */                        strI000lI = "running=[DONE]";
                            } else if (runnable5 instanceof l00loil) {
/* 13 */                        strI000lI = "running=[INTERRUPTED]";
                            } else if (runnable5 instanceof Thread) {
/* 169 */                       strI000lI = IlIi0I0.I000lI("running=[RUNNING ON ", ((Thread) runnable5).getName(), "]");
                            }
/* 179 */                   return IlIi0I0.I000lI(strI000lI, ", ", ((Callable) obj).toString());
                        case 5:
/* 102 */                   Runnable runnable6 = (Runnable) get();
/* 106 */                   if (runnable6 == I00lll10) {
/* 15 */                        strI000lI = "running=[DONE]";
                            } else if (runnable6 instanceof l0lIl10Io1O) {
/* 13 */                        strI000lI = "running=[INTERRUPTED]";
                            } else if (runnable6 instanceof Thread) {
/* 126 */                       strI000lI = IlIi0I0.I000lI("running=[RUNNING ON ", ((Thread) runnable6).getName(), "]");
                            }
/* 136 */                   return IlIi0I0.I000lI(strI000lI, ", ", ((Callable) obj).toString());
                        default:
/* 24 */                    Runnable runnable7 = (Runnable) get();
/* 28 */                    if (runnable7 == I00o0l1o1o0) {
/* 15 */                        strI000lI = "running=[DONE]";
                            } else if (runnable7 instanceof liiI1iloloIO) {
/* 13 */                        strI000lI = "running=[INTERRUPTED]";
                            } else if (runnable7 instanceof Thread) {
/* 44 */                        String name = ((Thread) runnable7).getName();
/* 63 */                        strI000lI = IIlIOloOOO.I0010I0i(new StringBuilder(String.valueOf(name).length() + 21), "running=[RUNNING ON ", name, "]");
                            }
/* 69 */                    String string = ((Callable) obj).toString();
/* 93 */                    return IIlIOloOOO.I0010I0i(new StringBuilder(strI000lI.length() + 2 + String.valueOf(string).length()), strI000lI, ", ", string);
                    }
                }

/* 14 */        public ii1000i10O(io0Oi10oi io0oi10oi, o0ioiOl00i o0ioiol00i) {
/* 15 */            this.I00iiI = io0oi10oi;
/* 17 */            this.I00iiO = o0ioiol00i;
                }

/* 17 */        public ii1000i10O(l0Il1lOIo l0il1loio, Callable callable) {
/* 18 */            this.I00iiO = l0il1loio;
/* 20 */            callable.getClass();
/* 21 */            this.I00iiI = callable;
                }

/* 21 */        public ii1000i10O(l0IlIi l0ilii, Callable callable) {
/* 22 */            this.I00iiO = l0ilii;
/* 24 */            callable.getClass();
/* 25 */            this.I00iiI = callable;
                }

/* 25 */        public ii1000i10O(l0O1IIOoi l0o1iiooi, Callable callable) {
/* 26 */            this.I00iiO = l0o1iiooi;
/* 28 */            callable.getClass();
/* 29 */            this.I00iiI = callable;
                }

/* 29 */        public ii1000i10O(l10o01O l10o01o, Callable callable) {
/* 30 */            this.I00iiO = l10o01o;
/* 32 */            callable.getClass();
/* 33 */            this.I00iiI = callable;
                }

/* 33 */        public ii1000i10O(lio1llilO lio1llilo, Callable callable) {
/* 34 */            this.I00iiO = lio1llilo;
/* 36 */            callable.getClass();
/* 37 */            this.I00iiI = callable;
                }
            }

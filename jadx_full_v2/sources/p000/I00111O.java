            package p000;

            import android.util.Log;
            import com.google.ai.edge.gallery.stablediffusion.StableDiffusion;
            import com.google.mlkit.genai.prompt.GenerativeModel;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            import java.util.concurrent.atomic.AtomicInteger;
            import kotlin.jvm.functions.Function1;
            
/* 14 */    public final class I00111O extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl = 3;
                public int I00iiI;
                public int I00iiO;
                public Object I00iio;
                public final Object I00ilI0I1;
                public Object I00ilO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I00111O(IlOil1ii[] ilOil1iiArr, int i, AtomicInteger atomicInteger, IIIII1OI1 iiiii1oi1, IOoil1iiIilo iOoil1iiIilo) {
/* 12 */            super(2, iOoil1iiIilo);
/* 4 */             this.I00iio = ilOil1iiArr;
/* 6 */             this.I00iiO = i;
/* 8 */             this.I00ilI0I1 = atomicInteger;
/* 10 */            this.I00ilO0 = iiiii1oi1;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj2 = this.I00ilI0I1;
                    switch (i) {
                        case 0:
/* 72 */                    return new I00111O((GenerativeModel) this.I00iio, (O1oIOiI11o0) obj2, (Function1) this.I00ilO0, iOoil1iiIilo);
                        case 1:
/* 55 */                    return new I00111O((List) this.I00iio, iOoil1iiIilo, (IO01o11o0lI0) obj2, this.I00iiO);
                        case 2:
/* 40 */                    return new I00111O((IlOil1ii[]) this.I00iio, this.I00iiO, (AtomicInteger) obj2, (IIIII1OI1) this.I00ilO0, iOoil1iiIilo);
                        default:
/* 16 */                    I00111O i00111o = new I00111O((StableDiffusion) obj2, (OOIoOo0O) this.I00ilO0, iOoil1iiIilo);
/* 19 */                    i00111o.I00iio = obj;
/* 21 */                    return i00111o;
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Ii0110 ii0110 = (Ii0110) obj;
/* 7 */             IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj2;
                    switch (i) {
                    }
/* 18 */            return ((I00111O) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                /* JADX WARN: Path cross not found for [B:13:0x0035, B:20:0x0054], limit reached: 140 */
                /* JADX WARN: Path cross not found for [B:13:0x0035, B:22:0x0058], limit reached: 140 */
                /* JADX WARN: Removed duplicated region for block: B:116:0x01b8  */
                /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
                /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
                /* JADX WARN: Removed duplicated region for block: B:68:0x011f  */
                /* JADX WARN: Removed duplicated region for block: B:69:0x0120  */
                /* JADX WARN: Removed duplicated region for block: B:73:0x012d  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0052 -> B:13:0x0035). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0054 -> B:13:0x0035). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0056 -> B:13:0x0035). Please report as a decompilation issue!!! */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    int i;
                    I001i1O0Ol i001i1O0Ol;
                    AutoCloseable autoCloseable;
                    Throwable th;
                    AutoCloseable autoCloseable2;
                    IIll1i iIll1i;
                    int i2;
                    int progressStep;
                    int progressTotal;
                    OOIoOo0O oOIoOo0O;
                    OlIiOi0Oo olIiOi0Oo;
/* 1 */             int i3 = this.I00iOIl;
/* 5 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 9 */             boolean z = true;
/* 10 */            Object obj2 = this.I00ilI0I1;
                    switch (i3) {
                        case 0:
/* 320 */                   O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) obj2;
/* 324 */                   Function1 function1 = (Function1) this.I00ilO0;
/* 328 */                   GenerativeModel generativeModel = (GenerativeModel) this.I00iio;
/* 332 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 334 */                   int i4 = this.I00iiO;
                            try {
/* 337 */                       if (i4 == 0) {
/* 375 */                           lIoii1l01l0i.I00000oOI(obj);
/* 378 */                           this.I00iiO = 1;
/* 380 */                           obj = generativeModel.checkStatus(this);
/* 384 */                           if (obj == ii0111o) {
                                    }
/* 483 */                           return ii0111o;
                                }
/* 339 */                       if (i4 != 1) {
/* 341 */                           if (i4 != 2) {
/* 343 */                               if (i4 == 3) {
/* 361 */                                   lIoii1l01l0i.I00000oOI(obj);
/* 447 */                                   o1oIOiI11o0.I00IlilI0i0i = new I001i1lo1io(generativeModel);
/* 451 */                                   function1.invoke("Feature is available");
/* 513 */                                   return ooiIlOl1iI;
                                        }
/* 345 */                               if (i4 == 4) {
/* 347 */                                   lIoii1l01l0i.I00000oOI(obj);
/* 513 */                                   return ooiIlOl1iI;
                                        }
/* 355 */                               I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                                return null;
                                    }
/* 365 */                           i = this.I00iiI;
/* 367 */                           lIoii1l01l0i.I00000oOI(obj);
/* 429 */                           i001i1O0Ol = I001i1O0Ol.I00000oIO;
/* 431 */                           this.I00iiI = i;
/* 433 */                           this.I00iiO = 3;
/* 439 */                           if (i001i1O0Ol.I000OiO(o1oIOiI11o0, generativeModel, this) == ii0111o) {
/* 483 */                               return ii0111o;
                                    }
/* 447 */                           o1oIOiI11o0.I00IlilI0i0i = new I001i1lo1io(generativeModel);
/* 451 */                           function1.invoke("Feature is available");
/* 513 */                           return ooiIlOl1iI;
                                }
/* 371 */                       lIoii1l01l0i.I00000oOI(obj);
/* 389 */                       int iIntValue = ((Number) obj).intValue();
/* 393 */                       if (iIntValue == 0) {
/* 487 */                           function1.invoke("Feature is unavailable on this device.");
/* 513 */                           return ooiIlOl1iI;
                                }
/* 395 */                       if (iIntValue == 1 || iIntValue == 2) {
/* 455 */                           IlOil1ii ilOil1iiDownload = generativeModel.download();
/* 461 */                           I0010o i0010o = new I0010o();
/* 464 */                           i0010o.I00iOIl = function1;
/* 466 */                           i0010o.I00iiI = generativeModel;
/* 468 */                           i0010o.I00iiO = o1oIOiI11o0;
/* 470 */                           VarHandle.storeStoreFence();
/* 473 */                           this.I00iiI = iIntValue;
/* 475 */                           this.I00iiO = 4;
/* 481 */                           if (ilOil1iiDownload.I00000oIO(i0010o, this) != ii0111o) {
/* 513 */                               return ooiIlOl1iI;
                                    }
                                } else {
/* 399 */                           if (iIntValue != 3) {
/* 413 */                               function1.invoke("Unknown feature status: " + iIntValue);
/* 513 */                               return ooiIlOl1iI;
                                    }
/* 417 */                           this.I00iiI = iIntValue;
/* 419 */                           this.I00iiO = 2;
/* 425 */                           if (generativeModel.warmup(this) != ii0111o) {
/* 428 */                               i = iIntValue;
/* 429 */                               i001i1O0Ol = I001i1O0Ol.I00000oIO;
/* 431 */                               this.I00iiI = i;
/* 433 */                               this.I00iiO = 3;
/* 439 */                               if (i001i1O0Ol.I000OiO(o1oIOiI11o0, generativeModel, this) == ii0111o) {
                                        }
/* 447 */                               o1oIOiI11o0.I00IlilI0i0i = new I001i1lo1io(generativeModel);
/* 451 */                               function1.invoke("Feature is available");
/* 513 */                               return ooiIlOl1iI;
                                    }
                                }
/* 483 */                       return ii0111o;
                            } catch (Exception e) {
/* 495 */                       Log.e("AICoreModelHelper", "Initialization failed", e);
/* 498 */                       String message = e.getMessage();
/* 502 */                       if (message == null) {
/* 504 */                           message = "Unknown error";
                                }
/* 510 */                       function1.invoke(li10oO000.I00000oIO(message));
/* 513 */                       return ooiIlOl1iI;
                            }
                        case 1:
/* 194 */                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 196 */                   int i5 = this.I00iiI;
/* 200 */                   if (i5 == 0) {
/* 232 */                       lIoii1l01l0i.I00000oOI(obj);
/* 235 */                       l11I11lO.I0000O(3, "CXCP");
/* 240 */                       List list = (List) this.I00iio;
/* 244 */                       this.I00iiI = 1;
/* 250 */                       if (iOOlOiI.I00000oOI(list, this) != ii0111o2) {
                                }
/* 300 */                       return ii0111o2;
                            }
/* 202 */                   if (i5 != 1) {
/* 204 */                       if (i5 != 2) {
/* 206 */                           if (i5 != 3) {
/* 219 */                               I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                                return null;
                                    }
/* 210 */                           autoCloseable2 = (AutoCloseable) this.I00ilO0;
                                    try {
/* 212 */                               lIoii1l01l0i.I00000oOI(obj);
/* 303 */                               l11I11lO.I0000O(3, "CXCP");
/* 306 */                               iOOl00.I00000oIO(autoCloseable2, null);
/* 309 */                               return ooiIlOl1iI;
                                    } catch (Throwable th2) {
/* 216 */                               th = th2;
                                        try {
/* 314 */                                   throw th;
                                        } catch (Throwable th3) {
/* 316 */                                   iOOl00.I00000oIO(autoCloseable2, th);
/* 319 */                                   throw th3;
                                        }
                                    }
                                }
/* 224 */                       lIoii1l01l0i.I00000oOI(obj);
/* 276 */                       autoCloseable = (AutoCloseable) obj;
                                try {
/* 279 */                           iIll1i = (IIll1i) autoCloseable;
/* 281 */                           l11I11lO.I0000O(3, "CXCP");
/* 286 */                           if (this.I00iiO == 0) {
/* 289 */                               z = false;
                                    }
/* 290 */                           this.I00ilO0 = autoCloseable;
/* 292 */                           this.I00iiI = 3;
/* 298 */                           if (iIll1i.I001l0I00(z) != ii0111o2) {
/* 302 */                               autoCloseable2 = autoCloseable;
/* 303 */                               l11I11lO.I0000O(3, "CXCP");
/* 306 */                               iOOl00.I00000oIO(autoCloseable2, null);
/* 309 */                               return ooiIlOl1iI;
                                    }
/* 300 */                           return ii0111o2;
                                } catch (Throwable th4) {
/* 312 */                           th = th4;
/* 313 */                           autoCloseable2 = autoCloseable;
/* 314 */                           throw th;
                                }
                            }
/* 228 */                   lIoii1l01l0i.I00000oOI(obj);
/* 253 */                   l11I11lO.I0000O(3, "CXCP");
/* 256 */                   l11I11lO.I0000O(3, "CXCP");
/* 263 */                   IIll0oO iIll0oOI00000oIO = ((IO01o11o0lI0) obj2).I000OOo1O.I00000oIO();
/* 267 */                   this.I00iiI = 2;
/* 269 */                   obj = iIll0oOI00000oIO.I0000Il00O(this);
/* 273 */                   if (obj != ii0111o2) {
/* 276 */                       autoCloseable = (AutoCloseable) obj;
/* 279 */                       iIll1i = (IIll1i) autoCloseable;
/* 281 */                       l11I11lO.I0000O(3, "CXCP");
/* 286 */                       if (this.I00iiO == 0) {
                                }
/* 290 */                       this.I00ilO0 = autoCloseable;
/* 292 */                       this.I00iiI = 3;
/* 298 */                       if (iIll1i.I001l0I00(z) != ii0111o2) {
                                }
                            }
/* 300 */                   return ii0111o2;
                        case 2:
/* 116 */                   AtomicInteger atomicInteger = (AtomicInteger) obj2;
/* 120 */                   IIIII1OI1 iiiii1oi1 = (IIIII1OI1) this.I00ilO0;
/* 122 */                   Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 124 */                   int i6 = this.I00iiI;
                            try {
/* 126 */                       if (i6 == 0) {
/* 141 */                           lIoii1l01l0i.I00000oOI(obj);
/* 146 */                           IlOil1ii[] ilOil1iiArr = (IlOil1ii[]) this.I00iio;
/* 148 */                           int i7 = this.I00iiO;
/* 150 */                           IlOil1ii ilOil1ii = ilOil1iiArr[i7];
/* 154 */                           IOOo0lil0io0 iOOo0lil0io0 = new IOOo0lil0io0();
/* 157 */                           iOOo0lil0io0.I00iOIl = iiiii1oi1;
/* 159 */                           iOOo0lil0io0.I00iiI = i7;
/* 161 */                           VarHandle.storeStoreFence();
/* 164 */                           this.I00iiI = 1;
/* 170 */                           if (ilOil1ii.I00000oIO(iOOo0lil0io0, this) == ii0111o3) {
/* 172 */                               return ii0111o3;
                                    }
                                } else {
/* 128 */                           if (i6 != 1) {
/* 136 */                               I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                                return null;
                                    }
/* 130 */                           lIoii1l01l0i.I00000oOI(obj);
                                }
/* 178 */                       if (atomicInteger.decrementAndGet() != 0) {
/* 183 */                           return ooiIlOl1iI;
                                }
/* 180 */                       iiiii1oi1.I0001Ioi1lo(null);
/* 183 */                       return ooiIlOl1iI;
                            } finally {
/* 188 */                       if (atomicInteger.decrementAndGet() == 0) {
/* 190 */                           iiiii1oi1.I0001Ioi1lo(null);
                                }
                            }
                        default:
/* 16 */                    StableDiffusion stableDiffusion = (StableDiffusion) obj2;
/* 20 */                    Ii0110 ii0110 = (Ii0110) this.I00iio;
/* 22 */                    Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 24 */                    int i8 = this.I00iiO;
/* 26 */                    if (i8 == 0) {
/* 49 */                        lIoii1l01l0i.I00000oOI(obj);
/* 53 */                        i2 = -1;
                            } else if (i8 == 1) {
/* 43 */                        i2 = this.I00iiI;
/* 45 */                        lIoii1l01l0i.I00000oOI(obj);
/* 1 */                         progressStep = stableDiffusion.getProgressStep();
/* 1 */                         progressTotal = stableDiffusion.getProgressTotal();
/* 83 */                        if (progressStep != i2 && progressTotal > 0 && progressStep > 0) {
/* 91 */                            oOIoOo0O = (OOIoOo0O) this.I00ilO0;
/* 95 */                            olIiOi0Oo = new OlIiOi0Oo(progressStep, progressTotal, null);
/* 98 */                            this.I00iio = ii0110;
/* 100 */                           this.I00iiI = progressStep;
/* 102 */                           this.I00iiO = 2;
/* 112 */                           if (((OOIoO0IIOO0) oOIoOo0O).I00ilI0I1.I00000oOI(this, olIiOi0Oo) != ii0111o4) {
/* 53 */                                i2 = progressStep;
                                    }
/* 114 */                           return ii0111o4;
                                }
                            } else {
/* 30 */                        if (i8 != 2) {
/* 38 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                            return null;
                                }
/* 32 */                        i2 = this.I00iiI;
/* 34 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 58 */                    if (!il001oo1.I0000O(ii0110)) {
/* 60 */                        this.I00iio = ii0110;
/* 62 */                        this.I00iiI = i2;
/* 64 */                        this.I00iiO = 1;
/* 72 */                        if (il0l1o1l.I00000oOI(150L, this) != ii0111o4) {
/* 1 */                             progressStep = stableDiffusion.getProgressStep();
/* 1 */                             progressTotal = stableDiffusion.getProgressTotal();
/* 83 */                            if (progressStep != i2) {
/* 91 */                                oOIoOo0O = (OOIoOo0O) this.I00ilO0;
/* 95 */                                olIiOi0Oo = new OlIiOi0Oo(progressStep, progressTotal, null);
/* 98 */                                this.I00iio = ii0110;
/* 100 */                               this.I00iiI = progressStep;
/* 102 */                               this.I00iiO = 2;
/* 112 */                               if (((OOIoO0IIOO0) oOIoOo0O).I00ilI0I1.I00000oOI(this, olIiOi0Oo) != ii0111o4) {
                                        }
                                    }
/* 58 */                            if (!il001oo1.I0000O(ii0110)) {
/* 115 */                               return ooiIlOl1iI;
                                    }
                                }
/* 114 */                       return ii0111o4;
                            }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 15 */        public I00111O(GenerativeModel generativeModel, O1oIOiI11o0 o1oIOiI11o0, Function1 function1, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
/* 16 */            this.I00iio = generativeModel;
                    this.I00ilI0I1 = o1oIOiI11o0;
                    this.I00ilO0 = function1;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 16 */        public I00111O(List list, IOoil1iiIilo iOoil1iiIilo, IO01o11o0lI0 iO01o11o0lI0, int i) {
                    super(2, iOoil1iiIilo);
/* 17 */            this.I00iio = list;
                    this.I00ilI0I1 = iO01o11o0lI0;
                    this.I00iiO = i;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 17 */        public I00111O(StableDiffusion stableDiffusion, OOIoOo0O oOIoOo0O, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
/* 18 */            this.I00ilI0I1 = stableDiffusion;
                    this.I00ilO0 = oOIoOo0O;
                }
            }

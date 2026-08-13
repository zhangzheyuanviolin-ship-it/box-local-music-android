            package com.google.mlkit.genai.rewriting;

            import android.content.Context;
            import android.os.SystemClock;
            import com.google.common.util.concurrent.ListenableFuture;
            import com.google.mlkit.genai.common.DownloadCallback;
            import com.google.mlkit.genai.common.GenAiException;
            import com.google.mlkit.genai.common.StreamingCallback;
            import com.google.mlkit.genai.common.internal.GenAiUtils;
            import java.lang.invoke.VarHandle;
            import java.time.Duration;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Comparator;
            import java.util.HashSet;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.Executors;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.atomic.AtomicLong;
            import java.util.function.Function;
            import p000.I000II;
            import p000.I1ii1o0;
            import p000.IOOlIIilOl0;
            import p000.Iioi0lilII;
            import p000.Oi010OO0;
            import p000.OoIOol;
            import p000.i1IOoOl;
            import p000.i1IoOioloO1;
            import p000.i1Ioo1o0;
            import p000.i1OII10oOIl;
            import p000.iO10oo0i1o;
            import p000.iO1110010OI;
            import p000.iOIIl1O;
            import p000.iOiIOO1ll;
            import p000.iOioO0lIOo;
            import p000.iOoOoIioii;
            import p000.ii1OOi;
            import p000.ii1iioii;
            import p000.iiioIloi;
            import p000.iilI0l;
            import p000.iili0l1l;
            import p000.il0I1i0Oo1;
            import p000.il1l00IOII;
            import p000.il1li0;
            import p000.ilI1loO01olI;
            import p000.ilIio11;
            import p000.ilIoii01i;
            import p000.iliIOoo;
            import p000.io00III0o0i;
            import p000.io0OO101I;
            import p000.ioIoO1il1;
            import p000.ioiiIi0o11;
            import p000.iol0ioiIO1iI;
            import p000.iol1Iil;
            import p000.iollI1I1i;
            import p000.l01I1l;
            import p000.l01o1OI;
            import p000.l0I1O1ii;
            import p000.l0l1I0Io1;
            import p000.l0lI100I;
            import p000.lioi0o0iii;
            import p000.liolilo;
            import p000.liooiol;
            import p000.lollO1Oio1;
            import p000.lollll0111;
            import p000.lolo101i;
            import p000.o0lOIli0I1oi;
            import p000.o0loi00oo;
            import p000.o0o0I0i01Ii;
            import p000.o0o1Iloio;
            import p000.o0oOI00li;
            import p000.o0oi1iOll1lI;
            import p000.o11l1o0I;
            
/* 5 */     public class Rewriter {
                boolean zza;
                private final RewriterOptions zzb;
                private final iO1110010OI zzc;
                private final int zzd;
                private final l0lI100I zze;
                private ilIoii01i zzf;
                private volatile iOioO0lIOo zzg;

                /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
                /* JADX WARN: Removed duplicated region for block: B:35:0x00b6  */
                /* JADX WARN: Removed duplicated region for block: B:36:0x00b9  */
                /* JADX WARN: Removed duplicated region for block: B:37:0x00bc  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x00bf  */
                /* JADX WARN: Removed duplicated region for block: B:39:0x00c2  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x00c5  */
                /* JADX WARN: Removed duplicated region for block: B:43:0x00ce  */
                /* JADX WARN: Removed duplicated region for block: B:44:0x00d1  */
                /* JADX WARN: Removed duplicated region for block: B:45:0x00d4  */
                /* JADX WARN: Removed duplicated region for block: B:46:0x00d7  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x00da  */
                /* JADX WARN: Removed duplicated region for block: B:48:0x00dd  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x00e0  */
                /* JADX WARN: Removed duplicated region for block: B:50:0x00e3  */
                /* JADX WARN: Removed duplicated region for block: B:51:0x00e6  */
                /* JADX WARN: Removed duplicated region for block: B:52:0x00e9  */
                /* JADX WARN: Removed duplicated region for block: B:55:0x0110  */
                /* JADX WARN: Removed duplicated region for block: B:57:0x011e  */
                /* JADX WARN: Removed duplicated region for block: B:58:0x0121  */
                /* JADX WARN: Removed duplicated region for block: B:59:0x0124  */
                /* JADX WARN: Removed duplicated region for block: B:60:0x0127  */
                /* JADX WARN: Removed duplicated region for block: B:61:0x012a  */
                /* JADX WARN: Removed duplicated region for block: B:62:0x012d  */
                /* JADX WARN: Removed duplicated region for block: B:63:0x0130  */
                /* JADX WARN: Removed duplicated region for block: B:64:0x0133  */
                /* JADX WARN: Removed duplicated region for block: B:65:0x0136  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Rewriter(RewriterOptions rewriterOptions) throws Throwable {
                    l01I1l l01i1l;
                    l01I1l l01i1l2;
                    i1IOoOl i1ioool;
                    o0loi00oo o0loi00ooVar;
                    lolo101i lolo101iVar;
                    int i;
/* 1 */             Context contextZzc = rewriterOptions.zzc();
/* 13 */            ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool(new iO10oo0i1o("AiCoreClientWorker", 2));
/* 24 */            int i2 = 1;
/* 25 */            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new iO10oo0i1o("AiCoreClientScheduler", 2));
/* 30 */            if (contextZzc == null) {
/* 382 */               IOOlIIilOl0.I000II("Null context");
/* 385 */               throw null;
                    }
/* 32 */            iOIIl1O ioiil1o = iOIIl1O.I00iiI;
/* 34 */            if (ioiil1o == null) {
/* 376 */               IOOlIIilOl0.I000II("Null callbackExecutor");
/* 379 */               throw null;
                    }
/* 36 */            if (executorServiceNewCachedThreadPool == null) {
/* 370 */               IOOlIIilOl0.I000II("Null workerExecutor");
/* 373 */               throw null;
                    }
/* 40 */            if (Duration.ZERO == null) {
/* 364 */               IOOlIIilOl0.I000II("Null autoUnbindTimeoutMs");
/* 367 */               throw null;
                    }
/* 42 */            if (scheduledExecutorServiceNewScheduledThreadPool == null) {
/* 358 */               IOOlIIilOl0.I000II("Null autoUnbindScheduledExecutor");
/* 361 */               throw null;
                    }
/* 46 */            Duration durationOfMinutes = Duration.ofMinutes(10L);
/* 50 */            if (durationOfMinutes == null) {
/* 352 */               IOOlIIilOl0.I000II("Null autoUnbindTimeoutMs");
/* 355 */               throw null;
                    }
/* 54 */            il0I1i0Oo1 il0i1i0oo1 = new il0I1i0Oo1();
/* 62 */            il0i1i0oo1.I00ioIO = new Object();
/* 64 */            il0i1i0oo1.I00iiI = contextZzc;
/* 68 */            if (executorServiceNewCachedThreadPool instanceof l01I1l) {
/* 70 */                l01i1l2 = (l01I1l) executorServiceNewCachedThreadPool;
                    } else {
/* 75 */                if (executorServiceNewCachedThreadPool instanceof ScheduledExecutorService) {
/* 79 */                    ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) executorServiceNewCachedThreadPool;
/* 81 */                    l01o1OI l01o1oi = new l01o1OI(scheduledExecutorService);
/* 84 */                    l01o1oi.I00iiI = scheduledExecutorService;
/* 86 */                    VarHandle.storeStoreFence();
                            l01i1l = l01o1oi;
                        } else {
/* 93 */                    l01i1l = new l01I1l(executorServiceNewCachedThreadPool);
                        }
/* 89 */                l01i1l2 = l01i1l;
                    }
/* 97 */            il0i1i0oo1.I00iOIl = l01i1l2;
/* 99 */            il0i1i0oo1.I00iiO = ioiil1o;
/* 101 */           il0i1i0oo1.I00iio = true;
/* 107 */           il0i1i0oo1.I00ilI0I1 = durationOfMinutes.toMillis();
/* 109 */           il0i1i0oo1.I00ilO0 = scheduledExecutorServiceNewScheduledThreadPool;
/* 111 */           il0i1i0oo1.I00io1l = true;
/* 113 */           VarHandle.storeStoreFence();
                    synchronized (i1Ioo1o0.class) {
/* 123 */               i1OII10oOIl i1oii10ooil = new i1OII10oOIl();
/* 128 */               i1oii10ooil.I00000oIO = "genai-rewriting";
/* 130 */               i1oii10ooil.I00000oOI = true;
/* 135 */               byte b = (byte) (i1oii10ooil.I0000O | 1);
/* 136 */               i1oii10ooil.I0000Il00O = 1;
/* 140 */               i1oii10ooil.I0000O = (byte) (2 | b);
/* 142 */               o11l1o0I o11l1o0iI000iOII = i1oii10ooil.I000iOII();
                        synchronized (i1Ioo1o0.class) {
                            try {
/* 147 */                       i1IoOioloO1 i1iooioloo1 = i1Ioo1o0.I00000oIO;
/* 149 */                       if (i1iooioloo1 == null) {
/* 153 */                           i1iooioloo1 = new i1IoOioloO1(i2);
/* 156 */                           i1Ioo1o0.I00000oIO = i1iooioloo1;
                                }
/* 166 */                       i1ioool = (i1IOoOl) i1iooioloo1.get(o11l1o0iI000iOII);
                            } catch (Throwable th) {
/* 346 */                       throw th;
                            }
                        }
/* 170 */               l0lI100I l0li100i = new l0lI100I();
                        switch (rewriterOptions.zzb()) {
                            case 1:
/* 198 */                       o0loi00ooVar = o0loi00oo.OUTPUT_TYPE_ELABORATE;
                                break;
                            case 2:
/* 195 */                       o0loi00ooVar = o0loi00oo.OUTPUT_TYPE_EMOJIFY;
                                break;
                            case 3:
/* 192 */                       o0loi00ooVar = o0loi00oo.OUTPUT_TYPE_SHORTEN;
                                break;
                            case 4:
/* 189 */                       o0loi00ooVar = o0loi00oo.OUTPUT_TYPE_FRIENDLY;
                                break;
                            case 5:
/* 186 */                       o0loi00ooVar = o0loi00oo.OUTPUT_TYPE_PROFESSIONAL;
                                break;
                            case 6:
/* 183 */                       o0loi00ooVar = o0loi00oo.OUTPUT_TYPE_REPHRASE;
                                break;
                            default:
/* 180 */                       o0loi00ooVar = o0loi00oo.OUTPUT_TYPE_UNKNOWN;
                                break;
                        }
                        switch (rewriterOptions.zza()) {
                            case 0:
/* 234 */                       lolo101iVar = lolo101i.SAPI_LANGUAGE_ENGLISH;
                                break;
                            case 1:
/* 231 */                       lolo101iVar = lolo101i.SAPI_LANGUAGE_JAPANESE;
                                break;
                            case 2:
/* 228 */                       lolo101iVar = lolo101i.SAPI_LANGUAGE_KOREAN;
                                break;
                            case 3:
/* 225 */                       lolo101iVar = lolo101i.SAPI_LANGUAGE_GERMAN;
                                break;
                            case 4:
/* 222 */                       lolo101iVar = lolo101i.SAPI_LANGUAGE_FRENCH;
                                break;
                            case 5:
/* 219 */                       lolo101iVar = lolo101i.SAPI_LANGUAGE_ITALIAN;
                                break;
                            case 6:
/* 216 */                       lolo101iVar = lolo101i.SAPI_LANGUAGE_SPANISH;
                                break;
                            case 7:
/* 213 */                       lolo101iVar = lolo101i.SAPI_LANGUAGE_CHINESE;
                                break;
                            case 8:
/* 210 */                       lolo101iVar = lolo101i.SAPI_LANGUAGE_PORTUGUESE;
                                break;
                            default:
/* 207 */                       lolo101iVar = lolo101i.SAPI_LANGUAGE_UNKNOWN;
                                break;
                        }
/* 238 */               o0o0I0i01Ii o0o0i0i01ii = new o0o0I0i01Ii();
/* 241 */               o0o0i0i01ii.I00000oIO = o0loi00ooVar;
/* 243 */               o0o0i0i01ii.I00000oOI = lolo101iVar;
/* 245 */               VarHandle.storeStoreFence();
/* 248 */               l0li100i.I00000oIO = o0o0i0i01ii;
/* 250 */               l0li100i.I00000oOI = i1ioool;
/* 252 */               VarHandle.storeStoreFence();
/* 258 */               this.zza = true;
/* 260 */               this.zzb = rewriterOptions;
/* 262 */               this.zzc = il0i1i0oo1;
/* 264 */               this.zze = l0li100i;
                        switch (rewriterOptions.zza()) {
                            case 0:
/* 311 */                       i = 607;
                                break;
                            case 1:
/* 308 */                       i = 608;
                                break;
                            case 2:
/* 305 */                       i = 609;
                                break;
                            case 3:
/* 302 */                       i = 610;
                                break;
                            case 4:
/* 299 */                       i = 611;
                                break;
                            case 5:
/* 296 */                       i = 612;
                                break;
                            case 6:
/* 293 */                       i = 613;
                                break;
                            case 7:
/* 290 */                       i = 625;
                                break;
                            case 8:
/* 287 */                       i = 639;
                                break;
                            default:
/* 283 */                       I000II.I000iOII(Oi010OO0.I000oI1ioi(rewriterOptions.zza(), "Unsupported language: "));
/* 286 */                       throw null;
                        }
/* 313 */               this.zzd = i;
/* 320 */               I1ii1o0 i1ii1o0 = new I1ii1o0(25, false);
/* 325 */               o0oOI00li o0ooi00li = new o0oOI00li();
/* 328 */               o0ooi00li.I00000oIO = o0o0i0i01ii;
/* 330 */               VarHandle.storeStoreFence();
/* 333 */               i1ii1o0.I00ilI0I1 = o0ooi00li;
/* 341 */               i1ioool.I00000oIO(OoIOol.I000OiO(i1ii1o0), lollll0111.SAPI_REWRITING_CREATE);
                    }
/* 170 */           l0lI100I l0li100i2 = new l0lI100I();
                    switch (rewriterOptions.zzb()) {
                    }
                    switch (rewriterOptions.zza()) {
                    }
/* 238 */           o0o0I0i01Ii o0o0i0i01ii2 = new o0o0I0i01Ii();
/* 241 */           o0o0i0i01ii2.I00000oIO = o0loi00ooVar;
/* 243 */           o0o0i0i01ii2.I00000oOI = lolo101iVar;
/* 245 */           VarHandle.storeStoreFence();
/* 248 */           l0li100i2.I00000oIO = o0o0i0i01ii2;
/* 250 */           l0li100i2.I00000oOI = i1ioool;
/* 252 */           VarHandle.storeStoreFence();
/* 258 */           this.zza = true;
/* 260 */           this.zzb = rewriterOptions;
/* 262 */           this.zzc = il0i1i0oo1;
/* 264 */           this.zze = l0li100i2;
                    switch (rewriterOptions.zza()) {
                    }
/* 313 */           this.zzd = i;
/* 320 */           I1ii1o0 i1ii1o02 = new I1ii1o0(25, false);
/* 325 */           o0oOI00li o0ooi00li2 = new o0oOI00li();
/* 328 */           o0ooi00li2.I00000oIO = o0o0i0i01ii2;
/* 330 */           VarHandle.storeStoreFence();
/* 333 */           i1ii1o02.I00ilI0I1 = o0ooi00li2;
/* 341 */           i1ioool.I00000oIO(OoIOol.I000OiO(i1ii1o02), lollll0111.SAPI_REWRITING_CREATE);
                }

                public static ilIoii01i zzb(Rewriter rewriter, iOioO0lIOo ioioo0lioo) {
/* 1 */             iO1110010OI io1110010oi = rewriter.zzc;
/* 7 */             Iioi0lilII iioi0lilII = new Iioi0lilII(23);
/* 11 */            if (ioioo0lioo == null) {
/* 77 */                IOOlIIilOl0.I000II("Null feature");
/* 10 */                return null;
                    }
/* 13 */            if (io1110010oi == null) {
/* 51 */                StringBuilder sb = new StringBuilder();
/* 54 */                if (io1110010oi == null) {
/* 58 */                    sb.append(" aiCoreClient");
                        }
/* 71 */                I000II.I001IO000("Missing required properties:".concat(sb.toString()));
/* 10 */                return null;
                    }
/* 17 */            ilIoii01i ilioii01i = new ilIoii01i();
/* 25 */            ilioii01i.I0001Ioi1lo = new Object();
/* 27 */            ilioii01i.I00000oIO = io1110010oi;
/* 29 */            ilioii01i.I00000oOI = ioioo0lioo;
/* 31 */            ilioii01i.I0000Il00O = iioi0lilII;
/* 33 */            il0I1i0Oo1 il0i1i0oo1 = (il0I1i0Oo1) io1110010oi;
/* 37 */            ilioii01i.I0000O = il0i1i0oo1.I00iOIl;
/* 41 */            ilioii01i.I0000oI00 = il0i1i0oo1.I00iiO;
/* 43 */            VarHandle.storeStoreFence();
/* 46 */            rewriter.zzf = ilioii01i;
/* 48 */            return ilioii01i;
                }

                public static ListenableFuture zzc(Rewriter rewriter, iOioO0lIOo ioioo0lioo) {
/* 1 */             if (ioioo0lioo == null) {
/* 56 */                return liolilo.I00000oOI(0);
                    }
/* 5 */             il0I1i0Oo1 il0i1i0oo1 = (il0I1i0Oo1) rewriter.zzc;
/* 7 */             il0i1i0oo1.I000II();
/* 29 */            ioiiIi0o11 ioiiii0o11I0000Il00O = liolilo.I0000Il00O(iollI1I1i.I000o00OoI0I(il0i1i0oo1.I00000oIO().I00000oOI()), new iilI0l(), iol1Iil.I00iOIl);
/* 36 */            ii1iioii ii1iioiiVar = new ii1iioii(3);
/* 39 */            ii1iioiiVar.I00000oOI = ioioo0lioo;
/* 41 */            VarHandle.storeStoreFence();
/* 46 */            return liolilo.I0000O(ioiiii0o11I0000Il00O, ii1iioiiVar, il0i1i0oo1.I00iOIl);
                }

                public static ListenableFuture zzd(Rewriter rewriter, lollll0111 lollll0111Var, Throwable th) throws Throwable {
                    GenAiException genAiException;
                    GenAiException genAiException2;
/* 3 */             boolean z = false;
/* 4 */             if (th instanceof GenAiException) {
/* 6 */                 genAiException2 = (GenAiException) th;
                    } else {
/* 11 */                if (th instanceof iOiIOO1ll) {
/* 13 */                    iOiIOO1ll ioiioo1ll = (iOiIOO1ll) th;
/* 19 */                    genAiException = new GenAiException(ioiioo1ll, ioiioo1ll.I00iOIl);
                        } else {
/* 26 */                    String message = th.getMessage();
/* 30 */                    if (message == null) {
/* 32 */                        message = "";
                            }
/* 34 */                    genAiException = new GenAiException(message, th, 0);
                        }
/* 22 */                genAiException2 = genAiException;
                    }
/* 38 */            lollll0111 lollll0111Var2 = lollll0111.SAPI_REWRITING_INFERENCE;
/* 40 */            if (lollll0111Var == lollll0111Var2) {
/* 42 */                l0lI100I l0li100i = rewriter.zze;
/* 46 */                int iZzh = zzh(rewriter.zzg);
/* 50 */                int errorCode = genAiException2.getErrorCode();
/* 58 */                I1ii1o0 i1ii1o0 = new I1ii1o0(25, z);
/* 61 */                o0o0I0i01Ii o0o0i0i01ii = l0li100i.I00000oIO;
/* 63 */                Integer numValueOf = Integer.valueOf(iZzh);
/* 135 */               lollO1Oio1 lollo1oio1 = errorCode != -100 ? errorCode != 4 ? errorCode != 15 ? errorCode != 501 ? errorCode != 604 ? errorCode != 7 ? errorCode != 8 ? errorCode != 9 ? errorCode != 11 ? errorCode != 12 ? lollO1Oio1.UNKNOWN_ERROR : lollO1Oio1.SAPI_REQUEST_TOO_LARGE : lollO1Oio1.SAPI_RESPONSE_PROCESSING_ERROR : lollO1Oio1.SAPI_BUSY : lollO1Oio1.SAPI_NOT_AVAILABLE : lollO1Oio1.SAPI_CANCELLED : lollO1Oio1.SAPI_NEEDS_SYSTEM_UPDATE : lollO1Oio1.SAPI_NOT_ENOUGH_DISK_SPACE : lollO1Oio1.SAPI_RESPONSE_GENERATION_ERROR : lollO1Oio1.SAPI_REQUEST_PROCESSING_ERROR : lollO1Oio1.SAPI_REQUEST_TOO_SMALL;
/* 137 */               i1IOoOl i1ioool = l0li100i.I00000oOI;
/* 141 */               o0lOIli0I1oi o0loili0i1oi = new o0lOIli0I1oi();
/* 144 */               o0loili0i1oi.I00000oIO = numValueOf;
/* 146 */               o0loili0i1oi.I00000oOI = lollo1oio1;
/* 149 */               o0loili0i1oi.I0000Il00O = null;
/* 151 */               o0loili0i1oi.I0000O = null;
/* 153 */               o0loili0i1oi.I0000oI00 = null;
/* 155 */               o0loili0i1oi.I0001Ioi1lo = null;
/* 157 */               o0loili0i1oi.I000II = null;
/* 159 */               VarHandle.storeStoreFence();
/* 164 */               o0oi1iOll1lI o0oi1ioll1li = new o0oi1iOll1lI();
/* 167 */               o0oi1ioll1li.I00000oIO = o0o0i0i01ii;
/* 169 */               o0oi1ioll1li.I00000oOI = o0loili0i1oi;
/* 171 */               VarHandle.storeStoreFence();
/* 174 */               i1ii1o0.I00iio = o0oi1ioll1li;
/* 180 */               i1ioool.I00000oIO(OoIOol.I000OiO(i1ii1o0), lollll0111Var2);
                    }
/* 183 */           return liolilo.I00000oIO(genAiException2);
                }

                public static ListenableFuture zze(Rewriter rewriter, RewritingRequest rewritingRequest, StreamingCallback streamingCallback, AtomicLong atomicLong, long j, ilIoii01i ilioii01i) {
/* 1 */             String strZzb = rewritingRequest.zzb();
/* 6 */             if (strZzb == null) {
/* 70 */                IOOlIIilOl0.I000II("Null message");
/* 5 */                 return null;
                    }
/* 10 */            int iZzb = rewriter.zzb.zzb();
/* 14 */            int overrideRequestKindOrDefault = rewritingRequest.getOverrideRequestKindOrDefault();
/* 18 */            rewritingRequest.zza();
/* 25 */            zzg zzgVar = streamingCallback != null ? new zzg(atomicLong, j, streamingCallback) : null;
/* 30 */            il1l00IOII il1l00ioii = new il1l00IOII();
/* 33 */            il1l00ioii.I00000oIO = strZzb;
/* 35 */            il1l00ioii.I00000oOI = iZzb;
/* 37 */            il1l00ioii.I0000O = zzgVar;
/* 39 */            il1l00ioii.I0000Il00O = overrideRequestKindOrDefault;
/* 41 */            VarHandle.storeStoreFence();
/* 44 */            ListenableFuture listenableFutureI0000O = ilioii01i.I0000O();
/* 51 */            ii1OOi ii1ooi = new ii1OOi(1);
/* 54 */            ii1ooi.I00000oOI = ilioii01i;
/* 56 */            ii1ooi.I0000Il00O = il1l00ioii;
/* 58 */            VarHandle.storeStoreFence();
/* 63 */            return liolilo.I0000O(listenableFutureI0000O, ii1ooi, ilioii01i.I0000O);
                }

                public static ListenableFuture zzf(Rewriter rewriter, DownloadCallback downloadCallback, iOioO0lIOo ioioo0lioo) {
/* 3 */             zzr zzrVar = new zzr(rewriter, downloadCallback);
/* 8 */             il0I1i0Oo1 il0i1i0oo1 = (il0I1i0Oo1) rewriter.zzc;
/* 14 */            l0I1O1ii l0i1o1iiI00000oOI = il0i1i0oo1.I00000oIO().I00000oOI();
/* 20 */            iili0l1l iili0l1lVar = new iili0l1l();
/* 23 */            iili0l1lVar.I00000oIO = il0i1i0oo1;
/* 25 */            iili0l1lVar.I00000oOI = ioioo0lioo;
/* 27 */            iili0l1lVar.I0000Il00O = zzrVar;
/* 29 */            VarHandle.storeStoreFence();
/* 34 */            return liolilo.I0000O(l0i1o1iiI00000oOI, iili0l1lVar, il0i1i0oo1.I00iOIl);
                }

                public static RewritingResult zzg(Rewriter rewriter, RewritingRequest rewritingRequest, AtomicLong atomicLong, long j, ilIio11 iliio11) throws Throwable {
/* 5 */             ArrayList arrayList = new ArrayList();
/* 10 */            HashSet hashSet = new HashSet();
/* 17 */            io0OO101I io0oo101i = ((il1li0) iliio11).I00000oIO;
/* 19 */            int size = io0oo101i.size();
/* 23 */            boolean z = false;
/* 25 */            for (int i = 0; i < size; i++) {
/* 31 */                ilI1loO01olI ili1loo01oli = (ilI1loO01olI) io0oo101i.get(i);
/* 39 */                if (!hashSet.contains(ili1loo01oli.I00000oIO)) {
/* 41 */                    String str = ili1loo01oli.I00000oIO;
/* 43 */                    hashSet.add(str);
/* 66 */                    arrayList.add(new zzf(str, ili1loo01oli.I0000Il00O / str.trim().split(" ").length));
                        }
                    }
/* 81 */            Comparator comparatorReversed = Comparator.comparing(new Function() {
                        @Override
                        public final Object apply(Object obj) {
/* 7 */                     return Float.valueOf(((RewritingSuggestion) obj).zza());
                        }
                    }).reversed();
/* 85 */            io00III0o0i io00iii0o0i = io0OO101I.I00iiI;
/* 87 */            comparatorReversed.getClass();
/* 90 */            Object[] array = arrayList.toArray();
/* 94 */            int length = array.length;
/* 95 */            lioi0o0iii.I00000oIO(length, array);
/* 98 */            Arrays.sort(array, comparatorReversed);
/* 111 */           zze zzeVar = new zze(io0OO101I.I000o00OoI0I(io0OO101I.I000lI(length, array)));
/* 114 */           l0lI100I l0li100i = rewriter.zze;
/* 118 */           int iZzh = zzh(rewriter.zzg);
/* 122 */           long j2 = atomicLong.get();
/* 130 */           long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
/* 132 */           boolean z2 = rewriter.zza;
/* 134 */           l0li100i.getClass();
/* 160 */           int iOrElse = zzeVar.getResults().stream().mapToInt(new l0l1I0Io1(1)).max().orElse(-1);
/* 168 */           I1ii1o0 i1ii1o0 = new I1ii1o0(25, z);
/* 171 */           o0o0I0i01Ii o0o0i0i01ii = l0li100i.I00000oIO;
/* 173 */           Integer numValueOf = Integer.valueOf(iZzh);
/* 177 */           lollO1Oio1 lollo1oio1 = lollO1Oio1.NO_ERROR;
/* 179 */           Boolean boolValueOf = Boolean.valueOf(z2);
/* 191 */           Integer numValueOf2 = Integer.valueOf(rewritingRequest.zzb().length());
/* 195 */           Integer numValueOf3 = Integer.valueOf(iOrElse);
/* 205 */           Long lValueOf = Long.valueOf(j2 & Long.MAX_VALUE);
/* 211 */           Long lValueOf2 = Long.valueOf(jElapsedRealtime & Long.MAX_VALUE);
/* 217 */           o0lOIli0I1oi o0loili0i1oi = new o0lOIli0I1oi();
/* 220 */           o0loili0i1oi.I00000oIO = numValueOf;
/* 222 */           o0loili0i1oi.I00000oOI = lollo1oio1;
/* 224 */           o0loili0i1oi.I0000Il00O = boolValueOf;
/* 226 */           o0loili0i1oi.I0000O = numValueOf2;
/* 228 */           o0loili0i1oi.I0000oI00 = numValueOf3;
/* 230 */           o0loili0i1oi.I0001Ioi1lo = lValueOf2;
/* 232 */           o0loili0i1oi.I000II = lValueOf;
/* 234 */           VarHandle.storeStoreFence();
/* 239 */           o0oi1iOll1lI o0oi1ioll1li = new o0oi1iOll1lI();
/* 242 */           o0oi1ioll1li.I00000oIO = o0o0i0i01ii;
/* 244 */           o0oi1ioll1li.I00000oOI = o0loili0i1oi;
/* 246 */           VarHandle.storeStoreFence();
/* 249 */           i1ii1o0.I00iio = o0oi1ioll1li;
/* 259 */           l0li100i.I00000oOI.I00000oIO(OoIOol.I000OiO(i1ii1o0), lollll0111.SAPI_REWRITING_INFERENCE);
/* 262 */           rewriter.zza = false;
/* 399 */           return zzeVar;
                }

                private static int zzh(iOioO0lIOo ioioo0lioo) {
/* 1 */             if (ioioo0lioo != null) {
/* 5 */                 return ((iOoOoIioii) ioioo0lioo).I0001Ioi1lo;
                    }
/* 8 */             return -1;
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [com.google.mlkit.genai.rewriting.zzh] */
                private final ListenableFuture zzi(ListenableFuture listenableFuture, final lollll0111 lollll0111Var) {
/* 3 */             ?? r0 = new iol0ioiIO1iI() {
                        @Override
                        public final ListenableFuture zza(Object obj) {
/* 7 */                     return Rewriter.zzd(this.zza, lollll0111Var, (Throwable) obj);
                        }
                    };
/* 10 */            l01I1l l01i1l = ((il0I1i0Oo1) this.zzc).I00iOIl;
/* 14 */            ioIoO1il1 ioioo1il1 = new ioIoO1il1();
/* 17 */            ioioo1il1.I00ioIO = listenableFuture;
/* 21 */            ioioo1il1.I00l0I0l0lO1 = Throwable.class;
/* 23 */            ioioo1il1.I00l0OO0IO = r0;
/* 29 */            listenableFuture.addListener(ioioo1il1, liooiol.I00000oIO(l01i1l, ioioo1il1));
/* 37 */            return ioioo1il1;
                }

                private final ListenableFuture zzj() {
/* 1 */             ilIoii01i ilioii01i = this.zzf;
                    return ilioii01i != null ? liolilo.I00000oOI(ilioii01i) : liolilo.I0000Il00O(zzk(), new iliIOoo() {
                        @Override
                        public final Object zza(Object obj) {
/* 5 */                     return Rewriter.zzb(this.zza, (iOioO0lIOo) obj);
                        }
                    }, ((il0I1i0Oo1) this.zzc).I00iOIl);
                }

                private final synchronized ListenableFuture zzk() {
/* 4 */             if (this.zzg != null) {
/* 8 */                 return liolilo.I00000oOI(this.zzg);
                    }
/* 16 */            iO1110010OI io1110010oi = this.zzc;
/* 27 */            if (!GenAiUtils.isAiCoreCompatible(((il0I1i0Oo1) io1110010oi).I00iiI)) {
/* 37 */                return liolilo.I00000oIO(new GenAiException(null, GenAiException.ErrorCode.AICORE_INCOMPATIBLE));
                    }
/* 43 */            int i = this.zzd;
/* 47 */            int targetVersionOrDefault = this.zzb.getTargetVersionOrDefault();
/* 52 */            il0I1i0Oo1 il0i1i0oo1 = (il0I1i0Oo1) io1110010oi;
/* 54 */            il0i1i0oo1.I000II();
/* 76 */            ioiiIi0o11 ioiiii0o11I0000Il00O = liolilo.I0000Il00O(iollI1I1i.I000o00OoI0I(il0i1i0oo1.I00000oIO().I00000oOI()), new iilI0l(), iol1Iil.I00iOIl);
/* 82 */            iiioIloi iiioiloi = new iiioIloi();
/* 85 */            iiioiloi.I00000oIO = i;
/* 87 */            iiioiloi.I00000oOI = targetVersionOrDefault;
/* 89 */            VarHandle.storeStoreFence();
/* 107 */           return liolilo.I0000Il00O(liolilo.I0000O(ioiiii0o11I0000Il00O, iiioiloi, il0i1i0oo1.I00iOIl), new iliIOoo() {
                        @Override
                        public final Object zza(Object obj) {
/* 3 */                     iOioO0lIOo ioioo0lioo = (iOioO0lIOo) obj;
/* 1 */                     this.zza.zzg = ioioo0lioo;
/* 49 */                    return ioioo0lioo;
                        }
                    }, ((il0I1i0Oo1) io1110010oi).I00iOIl);
                }

                private final ListenableFuture zzl(final RewritingRequest rewritingRequest, final StreamingCallback streamingCallback) {
/* 1 */             final long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 7 */             final AtomicLong atomicLong = new AtomicLong();
/* 10 */            ListenableFuture listenableFutureZzj = zzj();
/* 21 */            iol0ioiIO1iI iol0ioiio1ii = new iol0ioiIO1iI() {
                        @Override
                        public final ListenableFuture zza(Object obj) {
/* 14 */                    return Rewriter.zze(this.zza, rewritingRequest, streamingCallback, atomicLong, jElapsedRealtime, (ilIoii01i) obj);
                        }
                    };
/* 26 */            iO1110010OI io1110010oi = this.zzc;
/* 52 */            return zzi(liolilo.I0000Il00O(liolilo.I0000O(listenableFutureZzj, iol0ioiio1ii, ((il0I1i0Oo1) io1110010oi).I00iOIl), new iliIOoo() {
                        @Override
                        public final Object zza(Object obj) {
/* 12 */                    return Rewriter.zzg(this.zza, rewritingRequest, atomicLong, jElapsedRealtime, (ilIio11) obj);
                        }
                    }, ((il0I1i0Oo1) io1110010oi).I00iOIl), lollll0111.SAPI_REWRITING_INFERENCE);
                }

                public ListenableFuture checkFeatureStatus() {
/* 1 */             iO1110010OI io1110010oi = this.zzc;
                    return !GenAiUtils.isAiCoreCompatible(((il0I1i0Oo1) io1110010oi).I00iiI) ? liolilo.I00000oOI(0) : zzi(liolilo.I0000O(zzk(), new iol0ioiIO1iI() {
                        @Override
                        public final ListenableFuture zza(Object obj) {
/* 5 */                     return Rewriter.zzc(this.zza, (iOioO0lIOo) obj);
                        }
                    }, ((il0I1i0Oo1) io1110010oi).I00iOIl), null);
                }

                public void close() throws Throwable {
/* 5 */             ((il0I1i0Oo1) this.zzc).I0000Il00O();
/* 9 */             this.zza = true;
/* 11 */            l0lI100I l0li100i = this.zze;
/* 18 */            I1ii1o0 i1ii1o0 = new I1ii1o0(25, false);
/* 21 */            o0o0I0i01Ii o0o0i0i01ii = l0li100i.I00000oIO;
/* 25 */            o0o1Iloio o0o1iloio = new o0o1Iloio();
/* 28 */            o0o1iloio.I00000oIO = o0o0i0i01ii;
/* 30 */            VarHandle.storeStoreFence();
/* 33 */            i1ii1o0.I00ilO0 = o0o1iloio;
/* 43 */            l0li100i.I00000oOI.I00000oIO(OoIOol.I000OiO(i1ii1o0), lollll0111.SAPI_REWRITING_CLOSE);
                }

                public ListenableFuture downloadFeature(final DownloadCallback downloadCallback) {
/* 21 */            return zzi(liolilo.I0000O(zzk(), new iol0ioiIO1iI() {
                        @Override
                        public final ListenableFuture zza(Object obj) {
/* 7 */                     return Rewriter.zzf(this.zza, downloadCallback, (iOioO0lIOo) obj);
                        }
                    }, ((il0I1i0Oo1) this.zzc).I00iOIl), null);
                }

                public ListenableFuture getBaseModelName() {
/* 21 */            return zzi(liolilo.I0000O(zzk(), new iol0ioiIO1iI() {
                        @Override
                        public final ListenableFuture zza(Object obj) {
/* 1 */                     iOioO0lIOo ioioo0lioo = (iOioO0lIOo) obj;
                            return ioioo0lioo != null ? liolilo.I00000oOI(((iOoOoIioii) ioioo0lioo).I00000oOI) : liolilo.I00000oIO(new IllegalStateException("Failed to get base model name. aiFeature is null."));
                        }
                    }, ((il0I1i0Oo1) this.zzc).I00iOIl), null);
                }

                public ListenableFuture prepareInferenceEngine() {
/* 21 */            return zzi(liolilo.I0000O(zzj(), new iol0ioiIO1iI() {
                        @Override
                        public final ListenableFuture zza(Object obj) {
/* 1 */                     ilIoii01i ilioii01i = (ilIoii01i) obj;
/* 3 */                     ListenableFuture listenableFutureI0000O = ilioii01i.I0000O();
/* 10 */                    ii1iioii ii1iioiiVar = new ii1iioii(2);
/* 13 */                    ii1iioiiVar.I00000oOI = ilioii01i;
/* 15 */                    VarHandle.storeStoreFence();
/* 20 */                    return liolilo.I0000O(listenableFutureI0000O, ii1iioiiVar, ilioii01i.I0000O);
                        }
                    }, ((il0I1i0Oo1) this.zzc).I00iOIl), null);
                }

                public ListenableFuture runInference(RewritingRequest rewritingRequest) {
/* 2 */             return zzl(rewritingRequest, null);
                }

/* 6 */         public ListenableFuture runInference(RewritingRequest rewritingRequest, StreamingCallback streamingCallback) {
/* 7 */             return zzl(rewritingRequest, streamingCallback);
                }
            }

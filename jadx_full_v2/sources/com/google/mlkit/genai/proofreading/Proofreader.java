            package com.google.mlkit.genai.proofreading;

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
            import p000.IOO0o0I1l;
            import p000.IOOlIIilOl0;
            import p000.Oi010OO0;
            import p000.i000IO;
            import p000.i1IOoI;
            import p000.i1IoOioloO1;
            import p000.i1Ioo11OIl;
            import p000.i1OII10oOIl;
            import p000.iO10oo0i1o;
            import p000.iO110O11Ii;
            import p000.iOIIi0OlIOI;
            import p000.iOiI1oOo1l;
            import p000.iOioIII1i;
            import p000.iOoOlIOOi;
            import p000.ii1OO0ilo;
            import p000.ii1iilOI;
            import p000.iiio1li1iIiI;
            import p000.iilI0iIO010;
            import p000.iili0OOio;
            import p000.il0I11I011;
            import p000.il1ioo0oooi;
            import p000.il1lO1IO00I1;
            import p000.ilI1io11i1;
            import p000.ilIio0I;
            import p000.ilIoi0;
            import p000.iliIOo10i10;
            import p000.io00I0oIIIi;
            import p000.io0OIIlOli1;
            import p000.ioIoI0li;
            import p000.ioii1ol1Oool;
            import p000.iol0i0iOol;
            import p000.iol1IOlOo;
            import p000.iollI00lIIil;
            import p000.l01I1iOlI;
            import p000.l01o001OIoo;
            import p000.l0I1O010oooi;
            import p000.l0l1I0Io1;
            import p000.l0lI0iO;
            import p000.lioi0lO;
            import p000.lioli1IO;
            import p000.liooi1Oi1;
            import p000.loll1li1lIO;
            import p000.lolllOIlII;
            import p000.lolo0o1I1;
            import p000.o0lOIi1;
            import p000.o0lio0I0I;
            import p000.o0lll0ioo;
            import p000.o0lolioio;
            import p000.o0o0l0II1;
            import p000.o0oIiOOlo;
            import p000.o11io11I;
            
/* 5 */     public class Proofreader {
                boolean zza;
                private final ProofreaderOptions zzb;
                private final iO110O11Ii zzc;
                private final int zzd;
                private final l0lI0iO zze;
                private ilIoi0 zzf;
                private volatile iOioIII1i zzg;

                /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
                /* JADX WARN: Removed duplicated region for block: B:37:0x00bb  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x00c4  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x00c7  */
                /* JADX WARN: Removed duplicated region for block: B:42:0x00ca  */
                /* JADX WARN: Removed duplicated region for block: B:43:0x00cd  */
                /* JADX WARN: Removed duplicated region for block: B:44:0x00d0  */
                /* JADX WARN: Removed duplicated region for block: B:45:0x00d3  */
                /* JADX WARN: Removed duplicated region for block: B:46:0x00d6  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x00d9  */
                /* JADX WARN: Removed duplicated region for block: B:48:0x00dc  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x00df  */
                /* JADX WARN: Removed duplicated region for block: B:52:0x0106  */
                /* JADX WARN: Removed duplicated region for block: B:54:0x0114  */
                /* JADX WARN: Removed duplicated region for block: B:55:0x0117  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x011a  */
                /* JADX WARN: Removed duplicated region for block: B:57:0x011d  */
                /* JADX WARN: Removed duplicated region for block: B:58:0x0120  */
                /* JADX WARN: Removed duplicated region for block: B:59:0x0123  */
                /* JADX WARN: Removed duplicated region for block: B:60:0x0126  */
                /* JADX WARN: Removed duplicated region for block: B:61:0x0129  */
                /* JADX WARN: Removed duplicated region for block: B:62:0x012c  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Proofreader(ProofreaderOptions proofreaderOptions) throws Throwable {
                    l01I1iOlI l01i1ioli;
                    l01I1iOlI l01i1ioli2;
                    i1IOoI i1iooi;
                    lolo0o1I1 lolo0o1i1;
                    int i;
                    boolean z;
/* 1 */             Context contextZzc = proofreaderOptions.zzc();
/* 13 */            ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool(new iO10oo0i1o("AiCoreClientWorker", 1));
/* 24 */            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new iO10oo0i1o("AiCoreClientScheduler", 1));
/* 29 */            if (contextZzc == null) {
/* 371 */               IOOlIIilOl0.I000II("Null context");
/* 374 */               throw null;
                    }
/* 31 */            iOIIi0OlIOI ioiii0olioi = iOIIi0OlIOI.I00iiI;
/* 33 */            if (ioiii0olioi == null) {
/* 365 */               IOOlIIilOl0.I000II("Null callbackExecutor");
/* 368 */               throw null;
                    }
/* 35 */            if (executorServiceNewCachedThreadPool == null) {
/* 359 */               IOOlIIilOl0.I000II("Null workerExecutor");
/* 362 */               throw null;
                    }
/* 39 */            if (Duration.ZERO == null) {
/* 353 */               IOOlIIilOl0.I000II("Null autoUnbindTimeoutMs");
/* 356 */               throw null;
                    }
/* 41 */            if (scheduledExecutorServiceNewScheduledThreadPool == null) {
/* 347 */               IOOlIIilOl0.I000II("Null autoUnbindScheduledExecutor");
/* 350 */               throw null;
                    }
/* 45 */            Duration durationOfMinutes = Duration.ofMinutes(10L);
/* 49 */            if (durationOfMinutes == null) {
/* 341 */               IOOlIIilOl0.I000II("Null autoUnbindTimeoutMs");
/* 344 */               throw null;
                    }
/* 53 */            il0I11I011 il0i11i011 = new il0I11I011();
/* 61 */            il0i11i011.I00ioIO = new Object();
/* 63 */            il0i11i011.I00iiI = contextZzc;
/* 67 */            if (executorServiceNewCachedThreadPool instanceof l01I1iOlI) {
/* 69 */                l01i1ioli2 = (l01I1iOlI) executorServiceNewCachedThreadPool;
                    } else {
/* 74 */                if (executorServiceNewCachedThreadPool instanceof ScheduledExecutorService) {
/* 78 */                    ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) executorServiceNewCachedThreadPool;
/* 80 */                    l01o001OIoo l01o001oioo = new l01o001OIoo(scheduledExecutorService);
/* 83 */                    l01o001oioo.I00iiI = scheduledExecutorService;
/* 85 */                    VarHandle.storeStoreFence();
                            l01i1ioli = l01o001oioo;
                        } else {
/* 92 */                    l01i1ioli = new l01I1iOlI(executorServiceNewCachedThreadPool);
                        }
/* 88 */                l01i1ioli2 = l01i1ioli;
                    }
/* 96 */            il0i11i011.I00iOIl = l01i1ioli2;
/* 98 */            il0i11i011.I00iiO = ioiii0olioi;
/* 100 */           il0i11i011.I00iio = true;
/* 106 */           il0i11i011.I00ilI0I1 = durationOfMinutes.toMillis();
/* 108 */           il0i11i011.I00ilO0 = scheduledExecutorServiceNewScheduledThreadPool;
/* 110 */           il0i11i011.I00io1l = true;
/* 112 */           VarHandle.storeStoreFence();
                    synchronized (i1Ioo11OIl.class) {
/* 122 */               i1OII10oOIl i1oii10ooil = new i1OII10oOIl();
/* 127 */               i1oii10ooil.I00000oIO = "genai-proofreading";
/* 129 */               i1oii10ooil.I00000oOI = true;
/* 134 */               byte b = (byte) (i1oii10ooil.I0000O | 1);
/* 135 */               i1oii10ooil.I0000Il00O = 1;
/* 140 */               i1oii10ooil.I0000O = (byte) (b | 2);
/* 142 */               o11io11I o11io11iI000OiO = i1oii10ooil.I000OiO();
                        synchronized (i1Ioo11OIl.class) {
                            try {
/* 147 */                       i1IoOioloO1 i1iooioloo1 = i1Ioo11OIl.I00000oIO;
/* 149 */                       int i2 = 0;
/* 149 */                       z = false;
/* 150 */                       if (i1iooioloo1 == null) {
/* 154 */                           i1iooioloo1 = new i1IoOioloO1(i2);
/* 157 */                           i1Ioo11OIl.I00000oIO = i1iooioloo1;
                                }
/* 167 */                       i1iooi = (i1IOoI) i1iooioloo1.get(o11io11iI000OiO);
                            } catch (Throwable th) {
/* 335 */                       throw th;
                            }
                        }
/* 171 */               l0lI0iO l0li0io = new l0lI0iO();
/* 174 */               int iZza = proofreaderOptions.zza();
/* 188 */               o0lio0I0I o0lio0i0i = iZza == 1 ? iZza != 2 ? o0lio0I0I.INPUT_TYPE_UNKNOWN : o0lio0I0I.INPUT_TYPE_VOICE : o0lio0I0I.INPUT_TYPE_KEYBOARD;
                        switch (proofreaderOptions.zzb()) {
                            case 0:
/* 224 */                       lolo0o1i1 = lolo0o1I1.SAPI_LANGUAGE_ENGLISH;
                                break;
                            case 1:
/* 221 */                       lolo0o1i1 = lolo0o1I1.SAPI_LANGUAGE_JAPANESE;
                                break;
                            case 2:
/* 218 */                       lolo0o1i1 = lolo0o1I1.SAPI_LANGUAGE_KOREAN;
                                break;
                            case 3:
/* 215 */                       lolo0o1i1 = lolo0o1I1.SAPI_LANGUAGE_GERMAN;
                                break;
                            case 4:
/* 212 */                       lolo0o1i1 = lolo0o1I1.SAPI_LANGUAGE_FRENCH;
                                break;
                            case 5:
/* 209 */                       lolo0o1i1 = lolo0o1I1.SAPI_LANGUAGE_ITALIAN;
                                break;
                            case 6:
/* 206 */                       lolo0o1i1 = lolo0o1I1.SAPI_LANGUAGE_SPANISH;
                                break;
                            case 7:
/* 203 */                       lolo0o1i1 = lolo0o1I1.SAPI_LANGUAGE_CHINESE;
                                break;
                            case 8:
/* 200 */                       lolo0o1i1 = lolo0o1I1.SAPI_LANGUAGE_PORTUGUESE;
                                break;
                            default:
/* 197 */                       lolo0o1i1 = lolo0o1I1.SAPI_LANGUAGE_UNKNOWN;
                                break;
                        }
/* 228 */               o0lll0ioo o0lll0iooVar = new o0lll0ioo();
/* 231 */               o0lll0iooVar.I00000oIO = o0lio0i0i;
/* 233 */               o0lll0iooVar.I00000oOI = lolo0o1i1;
/* 235 */               VarHandle.storeStoreFence();
/* 238 */               l0li0io.I00000oIO = o0lll0iooVar;
/* 240 */               l0li0io.I00000oOI = i1iooi;
/* 242 */               VarHandle.storeStoreFence();
/* 248 */               this.zza = true;
/* 250 */               this.zzb = proofreaderOptions;
/* 252 */               this.zzc = il0i11i011;
/* 254 */               this.zze = l0li0io;
                        switch (proofreaderOptions.zzb()) {
                            case 0:
/* 301 */                       i = 614;
                                break;
                            case 1:
/* 298 */                       i = 615;
                                break;
                            case 2:
/* 295 */                       i = 616;
                                break;
                            case 3:
/* 292 */                       i = 617;
                                break;
                            case 4:
/* 289 */                       i = 618;
                                break;
                            case 5:
/* 286 */                       i = 619;
                                break;
                            case 6:
/* 283 */                       i = 620;
                                break;
                            case 7:
/* 280 */                       i = 626;
                                break;
                            case 8:
/* 277 */                       i = 640;
                                break;
                            default:
/* 273 */                       I000II.I000iOII(Oi010OO0.I000oI1ioi(proofreaderOptions.zzb(), "Unsupported language: "));
/* 276 */                       throw null;
                        }
/* 303 */               this.zzd = i;
/* 309 */               I1ii1o0 i1ii1o0 = new I1ii1o0(24, z ? 1 : 0);
/* 314 */               o0o0l0II1 o0o0l0ii1 = new o0o0l0II1();
/* 317 */               o0o0l0ii1.I00000oIO = o0lll0iooVar;
/* 319 */               VarHandle.storeStoreFence();
/* 322 */               i1ii1o0.I00ilI0I1 = o0o0l0ii1;
/* 330 */               i1iooi.I00000oIO(i000IO.I000II(i1ii1o0), lolllOIlII.SAPI_PROOFREADING_CREATE);
                    }
/* 171 */           l0lI0iO l0li0io2 = new l0lI0iO();
/* 174 */           int iZza2 = proofreaderOptions.zza();
/* 188 */           if (iZza2 == 1) {
                    }
                    switch (proofreaderOptions.zzb()) {
                    }
/* 228 */           o0lll0ioo o0lll0iooVar2 = new o0lll0ioo();
/* 231 */           o0lll0iooVar2.I00000oIO = o0lio0i0i;
/* 233 */           o0lll0iooVar2.I00000oOI = lolo0o1i1;
/* 235 */           VarHandle.storeStoreFence();
/* 238 */           l0li0io2.I00000oIO = o0lll0iooVar2;
/* 240 */           l0li0io2.I00000oOI = i1iooi;
/* 242 */           VarHandle.storeStoreFence();
/* 248 */           this.zza = true;
/* 250 */           this.zzb = proofreaderOptions;
/* 252 */           this.zzc = il0i11i011;
/* 254 */           this.zze = l0li0io2;
                    switch (proofreaderOptions.zzb()) {
                    }
/* 303 */           this.zzd = i;
/* 309 */           I1ii1o0 i1ii1o02 = new I1ii1o0(24, z ? 1 : 0);
/* 314 */           o0o0l0II1 o0o0l0ii12 = new o0o0l0II1();
/* 317 */           o0o0l0ii12.I00000oIO = o0lll0iooVar2;
/* 319 */           VarHandle.storeStoreFence();
/* 322 */           i1ii1o02.I00ilI0I1 = o0o0l0ii12;
/* 330 */           i1iooi.I00000oIO(i000IO.I000II(i1ii1o02), lolllOIlII.SAPI_PROOFREADING_CREATE);
                }

                public static ilIoi0 zzb(Proofreader proofreader, iOioIII1i ioioiii1i) {
/* 1 */             iO110O11Ii io110o11ii = proofreader.zzc;
/* 7 */             IOO0o0I1l iOO0o0I1l = new IOO0o0I1l(23);
/* 11 */            if (ioioiii1i == null) {
/* 77 */                IOOlIIilOl0.I000II("Null feature");
/* 10 */                return null;
                    }
/* 13 */            if (io110o11ii == null) {
/* 51 */                StringBuilder sb = new StringBuilder();
/* 54 */                if (io110o11ii == null) {
/* 58 */                    sb.append(" aiCoreClient");
                        }
/* 71 */                I000II.I001IO000("Missing required properties:".concat(sb.toString()));
/* 10 */                return null;
                    }
/* 17 */            ilIoi0 ilioi0 = new ilIoi0();
/* 25 */            ilioi0.I0001Ioi1lo = new Object();
/* 27 */            ilioi0.I00000oIO = io110o11ii;
/* 29 */            ilioi0.I00000oOI = ioioiii1i;
/* 31 */            ilioi0.I0000Il00O = iOO0o0I1l;
/* 33 */            il0I11I011 il0i11i011 = (il0I11I011) io110o11ii;
/* 37 */            ilioi0.I0000O = il0i11i011.I00iOIl;
/* 41 */            ilioi0.I0000oI00 = il0i11i011.I00iiO;
/* 43 */            VarHandle.storeStoreFence();
/* 46 */            proofreader.zzf = ilioi0;
/* 48 */            return ilioi0;
                }

                public static ListenableFuture zzc(Proofreader proofreader, lolllOIlII lollloilii, Throwable th) throws Throwable {
                    GenAiException genAiException;
                    GenAiException genAiException2;
/* 3 */             boolean z = false;
/* 4 */             if (th instanceof GenAiException) {
/* 6 */                 genAiException2 = (GenAiException) th;
                    } else {
/* 11 */                if (th instanceof iOiI1oOo1l) {
/* 13 */                    iOiI1oOo1l ioii1ooo1l = (iOiI1oOo1l) th;
/* 19 */                    genAiException = new GenAiException(ioii1ooo1l, ioii1ooo1l.I00iOIl);
                        } else {
/* 26 */                    String message = th.getMessage();
/* 30 */                    if (message == null) {
/* 32 */                        message = "";
                            }
/* 34 */                    genAiException = new GenAiException(message, th, 0);
                        }
/* 22 */                genAiException2 = genAiException;
                    }
/* 38 */            lolllOIlII lollloilii2 = lolllOIlII.SAPI_PROOFREADING_INFERENCE;
/* 40 */            if (lollloilii == lollloilii2) {
/* 42 */                l0lI0iO l0li0io = proofreader.zze;
/* 46 */                int iZzh = zzh(proofreader.zzg);
/* 50 */                int errorCode = genAiException2.getErrorCode();
/* 58 */                I1ii1o0 i1ii1o0 = new I1ii1o0(24, z);
/* 61 */                o0lll0ioo o0lll0iooVar = l0li0io.I00000oIO;
/* 63 */                Integer numValueOf = Integer.valueOf(iZzh);
/* 135 */               loll1li1lIO loll1li1lio = errorCode != -100 ? errorCode != 4 ? errorCode != 15 ? errorCode != 501 ? errorCode != 604 ? errorCode != 7 ? errorCode != 8 ? errorCode != 9 ? errorCode != 11 ? errorCode != 12 ? loll1li1lIO.UNKNOWN_ERROR : loll1li1lIO.SAPI_REQUEST_TOO_LARGE : loll1li1lIO.SAPI_RESPONSE_PROCESSING_ERROR : loll1li1lIO.SAPI_BUSY : loll1li1lIO.SAPI_NOT_AVAILABLE : loll1li1lIO.SAPI_CANCELLED : loll1li1lIO.SAPI_NEEDS_SYSTEM_UPDATE : loll1li1lIO.SAPI_NOT_ENOUGH_DISK_SPACE : loll1li1lIO.SAPI_RESPONSE_GENERATION_ERROR : loll1li1lIO.SAPI_REQUEST_PROCESSING_ERROR : loll1li1lIO.SAPI_REQUEST_TOO_SMALL;
/* 137 */               i1IOoI i1iooi = l0li0io.I00000oOI;
/* 141 */               o0lOIi1 o0loii1 = new o0lOIi1();
/* 144 */               o0loii1.I00000oIO = numValueOf;
/* 146 */               o0loii1.I00000oOI = loll1li1lio;
/* 149 */               o0loii1.I0000Il00O = null;
/* 151 */               o0loii1.I0000O = null;
/* 153 */               o0loii1.I0000oI00 = null;
/* 155 */               o0loii1.I0001Ioi1lo = null;
/* 157 */               o0loii1.I000II = null;
/* 159 */               VarHandle.storeStoreFence();
/* 164 */               o0oIiOOlo o0oiioolo = new o0oIiOOlo();
/* 167 */               o0oiioolo.I00000oIO = o0lll0iooVar;
/* 169 */               o0oiioolo.I00000oOI = o0loii1;
/* 171 */               VarHandle.storeStoreFence();
/* 174 */               i1ii1o0.I00iio = o0oiioolo;
/* 180 */               i1iooi.I00000oIO(i000IO.I000II(i1ii1o0), lollloilii2);
                    }
/* 183 */           return lioli1IO.I00000oIO(genAiException2);
                }

                public static ListenableFuture zzd(Proofreader proofreader, DownloadCallback downloadCallback, iOioIII1i ioioiii1i) {
/* 3 */             zzr zzrVar = new zzr(proofreader, downloadCallback);
/* 8 */             il0I11I011 il0i11i011 = (il0I11I011) proofreader.zzc;
/* 14 */            l0I1O010oooi l0i1o010oooiI00000oIO = il0i11i011.I00000oIO().I00000oIO();
/* 20 */            iili0OOio iili0ooio = new iili0OOio();
/* 23 */            iili0ooio.I00000oIO = il0i11i011;
/* 25 */            iili0ooio.I00000oOI = ioioiii1i;
/* 27 */            iili0ooio.I0000Il00O = zzrVar;
/* 29 */            VarHandle.storeStoreFence();
/* 34 */            return lioli1IO.I0000O(l0i1o010oooiI00000oIO, iili0ooio, il0i11i011.I00iOIl);
                }

                public static ListenableFuture zze(Proofreader proofreader, ProofreadingRequest proofreadingRequest, StreamingCallback streamingCallback, AtomicLong atomicLong, long j, ilIoi0 ilioi0) {
/* 1 */             String strZzb = proofreadingRequest.zzb();
/* 6 */             if (strZzb == null) {
/* 70 */                IOOlIIilOl0.I000II("Null message");
/* 5 */                 return null;
                    }
/* 10 */            int iZza = proofreader.zzb.zza();
/* 14 */            int overrideRequestKindOrDefault = proofreadingRequest.getOverrideRequestKindOrDefault();
/* 18 */            proofreadingRequest.zza();
/* 25 */            zzk zzkVar = streamingCallback != null ? new zzk(atomicLong, j, streamingCallback) : null;
/* 30 */            il1ioo0oooi il1ioo0oooiVar = new il1ioo0oooi();
/* 33 */            il1ioo0oooiVar.I00000oIO = strZzb;
/* 35 */            il1ioo0oooiVar.I00000oOI = iZza;
/* 37 */            il1ioo0oooiVar.I0000O = zzkVar;
/* 39 */            il1ioo0oooiVar.I0000Il00O = overrideRequestKindOrDefault;
/* 41 */            VarHandle.storeStoreFence();
/* 44 */            ListenableFuture listenableFutureI0000O = ilioi0.I0000O();
/* 51 */            ii1OO0ilo ii1oo0ilo = new ii1OO0ilo(1);
/* 54 */            ii1oo0ilo.I00000oOI = ilioi0;
/* 56 */            ii1oo0ilo.I0000Il00O = il1ioo0oooiVar;
/* 58 */            VarHandle.storeStoreFence();
/* 63 */            return lioli1IO.I0000O(listenableFutureI0000O, ii1oo0ilo, ilioi0.I0000O);
                }

                public static ListenableFuture zzf(Proofreader proofreader, iOioIII1i ioioiii1i) {
/* 1 */             if (ioioiii1i == null) {
/* 56 */                return lioli1IO.I00000oOI(0);
                    }
/* 5 */             il0I11I011 il0i11i011 = (il0I11I011) proofreader.zzc;
/* 7 */             il0i11i011.I000II();
/* 29 */            ioii1ol1Oool ioii1ol1ooolI0000Il00O = lioli1IO.I0000Il00O(iollI00lIIil.I000o00OoI0I(il0i11i011.I00000oIO().I00000oIO()), new iilI0iIO010(), iol1IOlOo.I00iOIl);
/* 36 */            ii1iilOI ii1iiloi = new ii1iilOI(3);
/* 39 */            ii1iiloi.I00000oOI = ioioiii1i;
/* 41 */            VarHandle.storeStoreFence();
/* 46 */            return lioli1IO.I0000O(ioii1ol1ooolI0000Il00O, ii1iiloi, il0i11i011.I00iOIl);
                }

                public static ProofreadingResult zzg(Proofreader proofreader, ProofreadingRequest proofreadingRequest, AtomicLong atomicLong, long j, ilIio0I iliio0i) throws Throwable {
/* 5 */             ArrayList arrayList = new ArrayList();
/* 10 */            HashSet hashSet = new HashSet();
/* 17 */            io0OIIlOli1 io0oiiloli1 = ((il1lO1IO00I1) iliio0i).I00000oIO;
/* 19 */            int size = io0oiiloli1.size();
/* 23 */            boolean z = false;
/* 25 */            for (int i = 0; i < size; i++) {
/* 31 */                ilI1io11i1 ili1io11i1 = (ilI1io11i1) io0oiiloli1.get(i);
/* 39 */                if (!hashSet.contains(ili1io11i1.I00000oIO)) {
/* 41 */                    String str = ili1io11i1.I00000oIO;
/* 43 */                    hashSet.add(str);
/* 66 */                    arrayList.add(new zzf(str, ili1io11i1.I0000Il00O / str.trim().split(" ").length));
                        }
                    }
/* 81 */            Comparator comparatorReversed = Comparator.comparing(new Function() {
                        @Override
                        public final Object apply(Object obj) {
/* 7 */                     return Float.valueOf(((ProofreadingSuggestion) obj).zza());
                        }
                    }).reversed();
/* 85 */            io00I0oIIIi io00i0oiiii = io0OIIlOli1.I00iiI;
/* 87 */            comparatorReversed.getClass();
/* 90 */            Object[] array = arrayList.toArray();
/* 94 */            int length = array.length;
/* 95 */            lioi0lO.I00000oIO(length, array);
/* 98 */            Arrays.sort(array, comparatorReversed);
/* 111 */           zze zzeVar = new zze(io0OIIlOli1.I000o00OoI0I(io0OIIlOli1.I000lI(length, array)));
/* 114 */           l0lI0iO l0li0io = proofreader.zze;
/* 118 */           int iZzh = zzh(proofreader.zzg);
/* 122 */           long j2 = atomicLong.get();
/* 130 */           long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
/* 132 */           boolean z2 = proofreader.zza;
/* 134 */           l0li0io.getClass();
/* 159 */           int iOrElse = zzeVar.getResults().stream().mapToInt(new l0l1I0Io1(0)).max().orElse(-1);
/* 167 */           I1ii1o0 i1ii1o0 = new I1ii1o0(24, z);
/* 170 */           o0lll0ioo o0lll0iooVar = l0li0io.I00000oIO;
/* 172 */           Integer numValueOf = Integer.valueOf(iZzh);
/* 176 */           Boolean boolValueOf = Boolean.valueOf(z2);
/* 180 */           loll1li1lIO loll1li1lio = loll1li1lIO.NO_ERROR;
/* 190 */           Integer numValueOf2 = Integer.valueOf(proofreadingRequest.zzb().length());
/* 194 */           Integer numValueOf3 = Integer.valueOf(iOrElse);
/* 204 */           Long lValueOf = Long.valueOf(j2 & Long.MAX_VALUE);
/* 210 */           Long lValueOf2 = Long.valueOf(jElapsedRealtime & Long.MAX_VALUE);
/* 216 */           o0lOIi1 o0loii1 = new o0lOIi1();
/* 219 */           o0loii1.I00000oIO = numValueOf;
/* 221 */           o0loii1.I00000oOI = loll1li1lio;
/* 223 */           o0loii1.I0000Il00O = boolValueOf;
/* 225 */           o0loii1.I0000O = numValueOf2;
/* 227 */           o0loii1.I0000oI00 = numValueOf3;
/* 229 */           o0loii1.I0001Ioi1lo = lValueOf2;
/* 231 */           o0loii1.I000II = lValueOf;
/* 233 */           VarHandle.storeStoreFence();
/* 238 */           o0oIiOOlo o0oiioolo = new o0oIiOOlo();
/* 241 */           o0oiioolo.I00000oIO = o0lll0iooVar;
/* 243 */           o0oiioolo.I00000oOI = o0loii1;
/* 245 */           VarHandle.storeStoreFence();
/* 248 */           i1ii1o0.I00iio = o0oiioolo;
/* 258 */           l0li0io.I00000oOI.I00000oIO(i000IO.I000II(i1ii1o0), lolllOIlII.SAPI_PROOFREADING_INFERENCE);
/* 261 */           proofreader.zza = false;
/* 399 */           return zzeVar;
                }

                private static int zzh(iOioIII1i ioioiii1i) {
/* 1 */             if (ioioiii1i != null) {
/* 5 */                 return ((iOoOlIOOi) ioioiii1i).I0001Ioi1lo;
                    }
/* 8 */             return -1;
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [com.google.mlkit.genai.proofreading.zzi] */
                private final ListenableFuture zzi(ListenableFuture listenableFuture, final lolllOIlII lollloilii) {
/* 3 */             ?? r0 = new iol0i0iOol() {
                        @Override
                        public final ListenableFuture zza(Object obj) {
/* 7 */                     return Proofreader.zzc(this.zza, lollloilii, (Throwable) obj);
                        }
                    };
/* 10 */            l01I1iOlI l01i1ioli = ((il0I11I011) this.zzc).I00iOIl;
/* 14 */            ioIoI0li ioioi0li = new ioIoI0li();
/* 17 */            ioioi0li.I00ioIO = listenableFuture;
/* 21 */            ioioi0li.I00l0I0l0lO1 = Throwable.class;
/* 23 */            ioioi0li.I00l0OO0IO = r0;
/* 29 */            listenableFuture.addListener(ioioi0li, liooi1Oi1.I00000oIO(l01i1ioli, ioioi0li));
/* 37 */            return ioioi0li;
                }

                private final ListenableFuture zzj() {
/* 1 */             ilIoi0 ilioi0 = this.zzf;
                    return ilioi0 != null ? lioli1IO.I00000oOI(ilioi0) : lioli1IO.I0000Il00O(zzk(), new iliIOo10i10() {
                        @Override
                        public final Object zza(Object obj) {
/* 5 */                     return Proofreader.zzb(this.zza, (iOioIII1i) obj);
                        }
                    }, ((il0I11I011) this.zzc).I00iOIl);
                }

                private final synchronized ListenableFuture zzk() {
/* 4 */             if (this.zzg != null) {
/* 8 */                 return lioli1IO.I00000oOI(this.zzg);
                    }
/* 16 */            iO110O11Ii io110o11ii = this.zzc;
/* 27 */            if (!GenAiUtils.isAiCoreCompatible(((il0I11I011) io110o11ii).I00iiI)) {
/* 37 */                return lioli1IO.I00000oIO(new GenAiException(null, GenAiException.ErrorCode.AICORE_INCOMPATIBLE));
                    }
/* 43 */            int i = this.zzd;
/* 47 */            int targetVersionOrDefault = this.zzb.getTargetVersionOrDefault();
/* 52 */            il0I11I011 il0i11i011 = (il0I11I011) io110o11ii;
/* 54 */            il0i11i011.I000II();
/* 76 */            ioii1ol1Oool ioii1ol1ooolI0000Il00O = lioli1IO.I0000Il00O(iollI00lIIil.I000o00OoI0I(il0i11i011.I00000oIO().I00000oIO()), new iilI0iIO010(), iol1IOlOo.I00iOIl);
/* 82 */            iiio1li1iIiI iiio1li1iiii = new iiio1li1iIiI();
/* 85 */            iiio1li1iiii.I00000oIO = i;
/* 87 */            iiio1li1iiii.I00000oOI = targetVersionOrDefault;
/* 89 */            VarHandle.storeStoreFence();
/* 107 */           return lioli1IO.I0000Il00O(lioli1IO.I0000O(ioii1ol1ooolI0000Il00O, iiio1li1iiii, il0i11i011.I00iOIl), new iliIOo10i10() {
                        @Override
                        public final Object zza(Object obj) {
/* 3 */                     iOioIII1i ioioiii1i = (iOioIII1i) obj;
/* 1 */                     this.zza.zzg = ioioiii1i;
/* 49 */                    return ioioiii1i;
                        }
                    }, ((il0I11I011) io110o11ii).I00iOIl);
                }

                private final ListenableFuture zzl(final ProofreadingRequest proofreadingRequest, final StreamingCallback streamingCallback) {
/* 1 */             final long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 7 */             final AtomicLong atomicLong = new AtomicLong();
/* 10 */            ListenableFuture listenableFutureZzj = zzj();
/* 21 */            iol0i0iOol iol0i0iool = new iol0i0iOol() {
                        @Override
                        public final ListenableFuture zza(Object obj) {
/* 14 */                    return Proofreader.zze(this.zza, proofreadingRequest, streamingCallback, atomicLong, jElapsedRealtime, (ilIoi0) obj);
                        }
                    };
/* 26 */            iO110O11Ii io110o11ii = this.zzc;
/* 52 */            return zzi(lioli1IO.I0000Il00O(lioli1IO.I0000O(listenableFutureZzj, iol0i0iool, ((il0I11I011) io110o11ii).I00iOIl), new iliIOo10i10() {
                        @Override
                        public final Object zza(Object obj) {
/* 12 */                    return Proofreader.zzg(this.zza, proofreadingRequest, atomicLong, jElapsedRealtime, (ilIio0I) obj);
                        }
                    }, ((il0I11I011) io110o11ii).I00iOIl), lolllOIlII.SAPI_PROOFREADING_INFERENCE);
                }

                public ListenableFuture checkFeatureStatus() {
/* 1 */             iO110O11Ii io110o11ii = this.zzc;
                    return !GenAiUtils.isAiCoreCompatible(((il0I11I011) io110o11ii).I00iiI) ? lioli1IO.I00000oOI(0) : zzi(lioli1IO.I0000O(zzk(), new iol0i0iOol() {
                        @Override
                        public final ListenableFuture zza(Object obj) {
/* 5 */                     return Proofreader.zzf(this.zza, (iOioIII1i) obj);
                        }
                    }, ((il0I11I011) io110o11ii).I00iOIl), null);
                }

                public void close() throws Throwable {
/* 5 */             ((il0I11I011) this.zzc).I0000Il00O();
/* 9 */             this.zza = true;
/* 11 */            l0lI0iO l0li0io = this.zze;
/* 18 */            I1ii1o0 i1ii1o0 = new I1ii1o0(24, false);
/* 21 */            o0lll0ioo o0lll0iooVar = l0li0io.I00000oIO;
/* 25 */            o0lolioio o0lolioioVar = new o0lolioio();
/* 28 */            o0lolioioVar.I00000oIO = o0lll0iooVar;
/* 30 */            VarHandle.storeStoreFence();
/* 33 */            i1ii1o0.I00ilO0 = o0lolioioVar;
/* 43 */            l0li0io.I00000oOI.I00000oIO(i000IO.I000II(i1ii1o0), lolllOIlII.SAPI_PROOFREADING_CLOSE);
                }

                public ListenableFuture downloadFeature(final DownloadCallback downloadCallback) {
/* 21 */            return zzi(lioli1IO.I0000O(zzk(), new iol0i0iOol() {
                        @Override
                        public final ListenableFuture zza(Object obj) {
/* 7 */                     return Proofreader.zzd(this.zza, downloadCallback, (iOioIII1i) obj);
                        }
                    }, ((il0I11I011) this.zzc).I00iOIl), null);
                }

                public ListenableFuture getBaseModelName() {
/* 21 */            return zzi(lioli1IO.I0000O(zzk(), new iol0i0iOol() {
                        @Override
                        public final ListenableFuture zza(Object obj) {
/* 1 */                     iOioIII1i ioioiii1i = (iOioIII1i) obj;
                            return ioioiii1i != null ? lioli1IO.I00000oOI(((iOoOlIOOi) ioioiii1i).I00000oOI) : lioli1IO.I00000oIO(new IllegalStateException("Failed to get base model name. aiFeature is null."));
                        }
                    }, ((il0I11I011) this.zzc).I00iOIl), null);
                }

                public ListenableFuture prepareInferenceEngine() {
/* 21 */            return zzi(lioli1IO.I0000O(zzj(), new iol0i0iOol() {
                        @Override
                        public final ListenableFuture zza(Object obj) {
/* 1 */                     ilIoi0 ilioi0 = (ilIoi0) obj;
/* 3 */                     ListenableFuture listenableFutureI0000O = ilioi0.I0000O();
/* 10 */                    ii1iilOI ii1iiloi = new ii1iilOI(2);
/* 13 */                    ii1iiloi.I00000oOI = ilioi0;
/* 15 */                    VarHandle.storeStoreFence();
/* 20 */                    return lioli1IO.I0000O(listenableFutureI0000O, ii1iiloi, ilioi0.I0000O);
                        }
                    }, ((il0I11I011) this.zzc).I00iOIl), null);
                }

                public ListenableFuture runInference(ProofreadingRequest proofreadingRequest) {
/* 2 */             return zzl(proofreadingRequest, null);
                }

/* 6 */         public ListenableFuture runInference(ProofreadingRequest proofreadingRequest, StreamingCallback streamingCallback) {
/* 7 */             return zzl(proofreadingRequest, streamingCallback);
                }
            }

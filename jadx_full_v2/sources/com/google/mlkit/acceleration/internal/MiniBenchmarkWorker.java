            package com.google.mlkit.acceleration.internal;

            import android.content.Context;
            import android.os.SystemClock;
            import android.util.Log;
            import android.util.Pair;
            import androidx.work.WorkerParameters;
            import androidx.work.multiprocess.RemoteListenableWorker;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.Executors;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.TimeoutException;
            import p000.I01l10Oi;
            import p000.I01l1o;
            import p000.IIlOoolol0ll;
            import p000.Ii11I1OOII1;
            import p000.Io11llo0i;
            import p000.IoIlOo1o0IIl;
            import p000.IoOOl0iOl1io;
            import p000.O10o0oOio1;
            import p000.O10oI0l1;
            import p000.O1lolIl101;
            import p000.O1o01iO0liI0;
            import p000.OO11il0;
            import p000.OloIIoII1oo;
            import p000.iOoIoO1I;
            import p000.iOolO0lOooo;
            import p000.ii00II01Iii0;
            import p000.ii01IlIiIo;
            import p000.ii0ilo11O;
            import p000.lII0I0I000I;
            import p000.lO0Olllill;
            import p000.lOio0o;
            import p000.loo0iOOI0;
            import p000.loo1ilOi;
            import p000.looOio1l;
            import p000.loolO1Oi1;
            
            public abstract class MiniBenchmarkWorker<OptionsT extends I01l10Oi, InputT, ResultT> extends RemoteListenableWorker {
                private static final iOolO0lOooo zza;
                private final O1lolIl101 zzb;
                private final List zzc;
                private final I01l10Oi zzd;
                private final lO0Olllill zze;
                private final I01l1o zzf;

                static {
                    ii00II01Iii0 ii00ii01iii0;
                    iOolO0lOooo ioolo0loooo;
/* 1 */             ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
/* 7 */             if (executorServiceNewSingleThreadExecutor instanceof iOolO0lOooo) {
/* 9 */                 ioolo0loooo = (iOolO0lOooo) executorServiceNewSingleThreadExecutor;
                    } else {
/* 14 */                if (executorServiceNewSingleThreadExecutor instanceof ScheduledExecutorService) {
/* 18 */                    ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) executorServiceNewSingleThreadExecutor;
/* 20 */                    ii0ilo11O ii0ilo11o = new ii0ilo11O(scheduledExecutorService);
/* 23 */                    ii0ilo11o.I00iiI = scheduledExecutorService;
/* 25 */                    VarHandle.storeStoreFence();
                            ii00ii01iii0 = ii0ilo11o;
                        } else {
/* 32 */                    ii00ii01iii0 = new ii00II01Iii0(executorServiceNewSingleThreadExecutor);
                        }
/* 28 */                ioolo0loooo = ii00ii01iii0;
                    }
/* 36 */            zza = ioolo0loooo;
                }

                public MiniBenchmarkWorker(Context context, WorkerParameters workerParameters, OO11il0 oO11il0, O1lolIl101 o1lolIl101, I01l1o i01l1o) {
/* 3 */             lO0Olllill lo0olllill = new lO0Olllill(context, oO11il0, i01l1o);
/* 6 */             super(context, workerParameters);
/* 9 */             this.zzb = o1lolIl101;
/* 11 */            I01l10Oi defaultOptionsAsDecoder = o1lolIl101.getDefaultOptionsAsDecoder();
/* 15 */            Ii11I1OOII1 ii11I1OOII1 = workerParameters.I00000oOI;
/* 19 */            String strI0000Il00O = ii11I1OOII1.I0000Il00O("mlkit_base_options_key");
/* 23 */            lII0I0I000I.I000II(strI0000Il00O);
/* 32 */            this.zzd = (I01l10Oi) defaultOptionsAsDecoder.decode(strI0000Il00O);
/* 36 */            String[] strArrI0000O = ii11I1OOII1.I0000O("mlkit_run_config_name_array_key");
/* 40 */            lII0I0I000I.I000II(strArrI0000O);
/* 47 */            this.zzc = Arrays.asList(strArrI0000O);
/* 49 */            this.zze = lo0olllill;
/* 51 */            this.zzf = i01l1o;
/* 53 */            I00000oOI();
                }

                public static Object I00000oIO(OloIIoII1oo oloIIoII1oo, String str, int i) {
                    try {
/* 4 */                 return lOio0o.I00000oOI(oloIIoII1oo, i, TimeUnit.SECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e) {
/* 12 */                "waitTask failed: ".concat(str);
/* 15 */                I00000oOI();
/* 24 */                IoOOl0iOl1io.I000l1("MiniBenchmarkWorker failed with error: ".concat(str), e);
/* 27 */                return null;
                    }
                }

                public static void I00000oOI() {
/* 4 */             Log.isLoggable("MiniBenchmarkWorker", 3);
                }

                public static O10oI0l1 zza(MiniBenchmarkWorker miniBenchmarkWorker) throws IOException {
                    int i;
                    int i2;
                    long j;
/* 7 */             miniBenchmarkWorker.zze.I00000oOI();
/* 10 */            I00000oOI();
/* 19 */            ArrayList arrayListI00000oIO = miniBenchmarkWorker.zze.I00000oIO(miniBenchmarkWorker.zzd, miniBenchmarkWorker.zzc);
/* 27 */            if (arrayListI00000oIO.isEmpty()) {
/* 29 */                I00000oOI();
/* 36 */                return new O10o0oOio1(Ii11I1OOII1.I00000oOI);
                    }
/* 44 */            List<Pair> inputsWithExpectedResults = miniBenchmarkWorker.zzb.getInputsWithExpectedResults(miniBenchmarkWorker.zzd);
/* 48 */            Iterator it = arrayListI00000oIO.iterator();
/* 56 */            while (it.hasNext()) {
/* 62 */                String str = (String) it.next();
/* 66 */                int i3 = 1;
/* 71 */                I01l10Oi i01l10Oi = (I01l10Oi) miniBenchmarkWorker.zzd.cloneWithRunConfigAssigned(str, true);
                        try {
/* 73 */                    lII0I0I000I.I000II(str);
/* 76 */                    lII0I0I000I.I000II(i01l10Oi);
/* 81 */                    "Starts benchmarking ".concat(str);
/* 84 */                    I00000oOI();
/* 87 */                    lO0Olllill lo0olllill = miniBenchmarkWorker.zze;
/* 91 */                    iOoIoO1I iooioo1i = new iOoIoO1I();
/* 95 */                    iooioo1i.I00000oIO = false;
/* 100 */                   byte b = (byte) (iooioo1i.I0000oI00 | 1);
/* 101 */                   iooioo1i.I00000oOI = 0;
/* 107 */                   iooioo1i.I0000Il00O = 0.0f;
/* 112 */                   iooioo1i.I0000O = 0;
/* 117 */                   iooioo1i.I0000oI00 = (byte) (((byte) (((byte) (b | 2)) | 4)) | 8);
/* 123 */                   lo0olllill.I0000Il00O(str, i01l10Oi, iooioo1i.I00000oIO());
/* 126 */                   I00000oOI();
/* 143 */                   I00000oIO(miniBenchmarkWorker.zzb.initDetectorForCorrectnessBenchmark(i01l10Oi), "correctness initDetector", miniBenchmarkWorker.zzb.getTaskTimeoutSeconds());
/* 150 */                   float fMin = Float.MAX_VALUE;
/* 157 */                   for (Pair pair : inputsWithExpectedResults) {
/* 165 */                       Object obj = pair.first;
/* 189 */                       float correctnessScore = miniBenchmarkWorker.zzb.getCorrectnessScore(obj, pair.second, I00000oIO(miniBenchmarkWorker.zzb.runDetector(obj), "correctness runDetector", miniBenchmarkWorker.zzb.getTaskTimeoutSeconds()));
/* 193 */                       I00000oOI();
/* 196 */                       fMin = Math.min(fMin, correctnessScore);
                            }
/* 218 */                   I00000oIO(miniBenchmarkWorker.zzb.closeDetector(), "correctness closeDetector", miniBenchmarkWorker.zzb.getTaskTimeoutSeconds());
/* 221 */                   I00000oOI();
/* 230 */                   Object obj2 = ((Pair) inputsWithExpectedResults.get(0)).first;
/* 234 */                   int latencyBenchmarkRepetitionNumber = miniBenchmarkWorker.zzb.getLatencyBenchmarkRepetitionNumber();
/* 238 */                   if (latencyBenchmarkRepetitionNumber > 0) {
/* 249 */                       I00000oIO(miniBenchmarkWorker.zzb.initDetectorForLatencyBenchmark(i01l10Oi), "latency initDetector", 5);
/* 258 */                       I00000oIO(miniBenchmarkWorker.zzb.runDetector(obj2), "latency runDetector", 5);
/* 263 */                       ArrayList arrayList = new ArrayList();
/* 266 */                       int i4 = 0;
/* 267 */                       while (i4 < latencyBenchmarkRepetitionNumber) {
/* 269 */                           long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 281 */                           I00000oIO(miniBenchmarkWorker.zzb.runDetector(obj2), "latency runDetector", 5);
/* 294 */                           arrayList.add(Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
/* 297 */                           i4++;
/* 299 */                           i3 = i3;
                                }
/* 302 */                       i2 = i3;
/* 318 */                       I00000oIO(miniBenchmarkWorker.zzb.closeDetector(), "latency closeDetector", miniBenchmarkWorker.zzb.getTaskTimeoutSeconds());
/* 321 */                       Collections.sort(arrayList);
/* 331 */                       int i5 = (int) (latencyBenchmarkRepetitionNumber * 0.2d);
/* 332 */                       long jLongValue = 0;
/* 337 */                       for (int i6 = i5; i6 < latencyBenchmarkRepetitionNumber - i5; i6++) {
/* 349 */                           jLongValue += ((Long) arrayList.get(i6)).longValue();
                                }
/* 356 */                       j = jLongValue / (latencyBenchmarkRepetitionNumber - (i5 + i5));
                            } else {
/* 358 */                       i2 = 1;
/* 360 */                       I00000oOI();
/* 363 */                       j = -1;
                            }
/* 367 */                   "Mini-benchmark completed successfully for ".concat(str);
/* 370 */                   I00000oOI();
/* 373 */                   I00000oOI();
/* 376 */                   I00000oOI();
/* 381 */                   iOoIoO1I iooioo1i2 = new iOoIoO1I();
/* 384 */                   iooioo1i2.I00000oIO = false;
/* 390 */                   byte b2 = (byte) (iooioo1i2.I0000oI00 | 1);
/* 393 */                   iooioo1i2.I00000oOI = i2;
/* 398 */                   iooioo1i2.I0000Il00O = fMin;
/* 404 */                   iooioo1i2.I0000O = (int) j;
/* 409 */                   iooioo1i2.I0000oI00 = (byte) (((byte) (((byte) (b2 | 2)) | 4)) | 8);
/* 417 */                   miniBenchmarkWorker.zze.I0000Il00O(str, i01l10Oi, iooioo1i2.I00000oIO());
                        } catch (RuntimeException e) {
/* 422 */                   I01l1o i01l1o = miniBenchmarkWorker.zzf;
/* 424 */                   lII0I0I000I.I000II(i01l10Oi);
/* 427 */                   IoIlOo1o0IIl ioIlOo1o0IIl = (IoIlOo1o0IIl) i01l1o;
/* 429 */                   ioIlOo1o0IIl.getClass();
/* 438 */                   "logBenchmarkPipelineError for options: ".concat(String.valueOf(i01l10Oi));
/* 444 */                   Log.isLoggable("MlKitAccLogger", 3);
/* 447 */                   String runConfigName = i01l10Oi.getRunConfigName();
/* 451 */                   lII0I0I000I.I000II(runConfigName);
/* 454 */                   Throwable cause = e;
                            while (true) {
/* 455 */                       if (cause == null) {
/* 477 */                           i = -1;
                                    break;
                                }
/* 459 */                       if (cause instanceof O1o01iO0liI0) {
/* 474 */                           i = ((O1o01iO0liI0) cause).I00iOIl;
                                    break;
                                }
/* 463 */                       if (cause instanceof TimeoutException) {
/* 470 */                           i = -2;
                                    break;
                                }
/* 465 */                       cause = cause.getCause();
                            }
/* 478 */                   IIlOoolol0ll iIlOoolol0llI00IoiI = ioIlOo1o0IIl.I00IoiI();
/* 484 */                   looOio1l loooio1l = new looOio1l();
/* 487 */                   loooio1l.I00000oIO = runConfigName;
/* 489 */                   VarHandle.storeStoreFence();
/* 492 */                   iIlOoolol0llI00IoiI.I00ilI0I1 = loooio1l;
/* 496 */                   iIlOoolol0llI00IoiI.I00ioIO = loolO1Oi1.PIPELINE_ERROR;
/* 498 */                   Integer numValueOf = Integer.valueOf(i);
/* 504 */                   loo1ilOi loo1iloi = new loo1ilOi();
/* 509 */                   loo1iloi.I00000oIO = loo0iOOI0.MLKIT;
/* 511 */                   loo1iloi.I00000oOI = numValueOf;
/* 513 */                   VarHandle.storeStoreFence();
/* 520 */                   iIlOoolol0llI00IoiI.I00io1l = ii01IlIiIo.I001lIiIIo1O(loo1iloi);
/* 530 */                   ioIlOo1o0IIl.I00Iooi00oi(i01l10Oi, ii01IlIiIo.I001lIiIIo1O(iIlOoolol0llI00IoiI.I001i1O0Ol()));
/* 533 */                   throw e;
                        }
                    }
/* 534 */           I00000oOI();
/* 541 */           return new O10o0oOio1(Ii11I1OOII1.I00000oOI);
                }

                @Override
                public final void onStopped() {
/* 1 */             I00000oOI();
/* 6 */             this.zze.I00000oOI();
/* 23 */            I00000oIO(this.zzb.closeDetector(), "onStopped closeDetector", this.zzb.getTaskTimeoutSeconds());
                }

                @Override
                public ListenableFuture startRemoteWork() {
/* 1 */             I00000oOI();
/* 12 */            "runConfigNameList = ".concat(String.valueOf(this.zzc));
/* 15 */            I00000oOI();
/* 18 */            iOolO0lOooo ioolo0loooo = zza;
/* 24 */            Io11llo0i io11llo0i = new Io11llo0i(16);
/* 27 */            io11llo0i.I00000oOI = this;
/* 29 */            VarHandle.storeStoreFence();
/* 34 */            return ((ii00II01Iii0) ioolo0loooo).I00000oIO(io11llo0i);
                }
            }

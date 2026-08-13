            package com.google.mlkit.genai.summarization;

            import android.content.Context;
            import android.os.Build;
            import android.os.SystemClock;
            import com.google.ai.edge.gallery.whisper.WhisperEngine;
            import com.google.common.util.concurrent.ListenableFuture;
            import com.google.mlkit.genai.common.DownloadCallback;
            import com.google.mlkit.genai.common.GenAiException;
            import com.google.mlkit.genai.common.StreamingCallback;
            import com.google.mlkit.genai.common.internal.GenAiUtils;
            import java.lang.invoke.VarHandle;
            import java.time.Duration;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.HashMap;
            import java.util.Locale;
            import java.util.Map;
            import java.util.Optional;
            import java.util.Set;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.Executors;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.atomic.AtomicLong;
            import p000.I000II;
            import p000.I00Ol00;
            import p000.I1ii1o0;
            import p000.IIlIOloOOO;
            import p000.IOOlIIilOl0;
            import p000.OOoli1l;
            import p000.Oi010OO0;
            import p000.OoOlO1O0o;
            import p000.i1Iio0Ol;
            import p000.i1IoOioloO1;
            import p000.i1O01oOIoI0I;
            import p000.i1O0l00;
            import p000.i1OII10oOIl;
            import p000.iO10oo0i1o;
            import p000.iOIIl1Oo;
            import p000.iOOill0O;
            import p000.iOlI0O0iIiO;
            import p000.iOli1OIoI0o;
            import p000.ii00Il000;
            import p000.ii100IIOI1;
            import p000.ii111o0I;
            import p000.iiiO0iI1IOl0;
            import p000.iiiilII0i;
            import p000.iilO0I0l0;
            import p000.il00iIOo1;
            import p000.il111l0o1;
            import p000.il1O0lOli0iO;
            import p000.il1l01I0il;
            import p000.il1liI1l00O;
            import p000.ilI1o0o1o;
            import p000.ilIoilo;
            import p000.ilOI1I0lloOl;
            import p000.iliooIIO0Oi;
            import p000.io0iIOO0;
            import p000.io0o00I1ol1o;
            import p000.io11I0O;
            import p000.ioOi1lil;
            import p000.iol1Io1;
            import p000.iollIi0II1o;
            import p000.iollol1ioIi;
            import p000.ioo10O;
            import p000.l01oII;
            import p000.l0I1iI10l100;
            import p000.l0Io11IiO0l;
            import p000.l0lOli;
            import p000.lioOolIil;
            import p000.lioi0olooo;
            import p000.lioo0lo01i;
            import p000.ll00O010oO;
            import p000.lolo11illoil;
            import p000.lolooOOo11o;
            import p000.loo00o;
            import p000.o0lio1i1I;
            import p000.o0oIlOl11;
            import p000.o0oi101lOlo;
            import p000.o0oiol1;
            import p000.o0ollI;
            import p000.o0ooI10oIl;
            import p000.o0oolIi0l01;
            import p000.o11oO0Oo;
            
/* 5 */     public class Summarizer {
                boolean zza;
                private final SummarizerOptions zzb;
                private final iOIIl1Oo zzc;
                private final int zzd;
                private final int zze;
                private final int zzf;
                private final l0lOli zzg;
                private ilOI1I0lloOl zzh;
                private volatile iOli1OIoI0o zzi;

                /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
                /* JADX WARN: Removed duplicated region for block: B:37:0x00bb  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
                /* JADX WARN: Removed duplicated region for block: B:45:0x00d0  */
                /* JADX WARN: Removed duplicated region for block: B:48:0x00d8  */
                /* JADX WARN: Removed duplicated region for block: B:53:0x00e5  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x010d  */
                /* JADX WARN: Removed duplicated region for block: B:78:0x015d  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Summarizer(SummarizerOptions summarizerOptions) throws Throwable {
                    l01oII l01oii;
                    l01oII l01oii2;
                    i1Iio0Ol i1iio0ol;
                    int iZzb;
/* 1 */             Context contextZzd = summarizerOptions.zzd();
/* 13 */            ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool(new iO10oo0i1o("AiCoreClientWorker", 3));
/* 25 */            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new iO10oo0i1o("AiCoreClientScheduler", 3));
/* 30 */            if (contextZzd == null) {
/* 447 */               IOOlIIilOl0.I000II("Null context");
/* 1261 */              throw null;
                    }
/* 32 */            iOOill0O iooill0o = iOOill0O.I00iiI;
/* 34 */            if (iooill0o == null) {
/* 441 */               IOOlIIilOl0.I000II("Null callbackExecutor");
/* 444 */               throw null;
                    }
/* 36 */            if (executorServiceNewCachedThreadPool == null) {
/* 435 */               IOOlIIilOl0.I000II("Null workerExecutor");
/* 438 */               throw null;
                    }
/* 40 */            if (Duration.ZERO == null) {
/* 429 */               IOOlIIilOl0.I000II("Null autoUnbindTimeoutMs");
/* 432 */               throw null;
                    }
/* 42 */            if (scheduledExecutorServiceNewScheduledThreadPool == null) {
/* 423 */               IOOlIIilOl0.I000II("Null autoUnbindScheduledExecutor");
/* 426 */               throw null;
                    }
/* 46 */            Duration durationOfMinutes = Duration.ofMinutes(10L);
/* 50 */            if (durationOfMinutes == null) {
/* 417 */               IOOlIIilOl0.I000II("Null autoUnbindTimeoutMs");
/* 420 */               throw null;
                    }
/* 54 */            il00iIOo1 il00iioo1 = new il00iIOo1();
/* 62 */            il00iioo1.I00ioIO = new Object();
/* 64 */            il00iioo1.I00iiI = contextZzd;
/* 68 */            if (executorServiceNewCachedThreadPool instanceof l01oII) {
/* 70 */                l01oii2 = (l01oII) executorServiceNewCachedThreadPool;
                    } else {
/* 75 */                if (executorServiceNewCachedThreadPool instanceof ScheduledExecutorService) {
/* 79 */                    ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) executorServiceNewCachedThreadPool;
/* 81 */                    l0I1iI10l100 l0i1ii10l100 = new l0I1iI10l100(scheduledExecutorService);
/* 84 */                    l0i1ii10l100.I00iiI = scheduledExecutorService;
/* 86 */                    VarHandle.storeStoreFence();
                            l01oii = l0i1ii10l100;
                        } else {
/* 93 */                    l01oii = new l01oII(executorServiceNewCachedThreadPool);
                        }
/* 89 */                l01oii2 = l01oii;
                    }
/* 97 */            il00iioo1.I00iOIl = l01oii2;
/* 99 */            il00iioo1.I00iiO = iooill0o;
/* 101 */           il00iioo1.I00iio = true;
/* 107 */           il00iioo1.I00ilI0I1 = durationOfMinutes.toMillis();
/* 109 */           il00iioo1.I00ilO0 = scheduledExecutorServiceNewScheduledThreadPool;
/* 111 */           il00iioo1.I00io1l = true;
/* 113 */           VarHandle.storeStoreFence();
                    synchronized (i1O0l00.class) {
/* 123 */               i1OII10oOIl i1oii10ooil = new i1OII10oOIl();
/* 128 */               i1oii10ooil.I00000oIO = "genai-summarization";
/* 130 */               i1oii10ooil.I00000oOI = true;
/* 135 */               byte b = (byte) (i1oii10ooil.I0000O | 1);
/* 136 */               i1oii10ooil.I0000Il00O = 1;
/* 138 */               int i = 2;
/* 141 */               i1oii10ooil.I0000O = (byte) (b | 2);
/* 143 */               o11oO0Oo o11oo0ooI000l1 = i1oii10ooil.I000l1();
                        synchronized (i1O0l00.class) {
                            try {
/* 148 */                       i1IoOioloO1 i1iooioloo1 = i1O0l00.I00000oIO;
/* 150 */                       if (i1iooioloo1 == null) {
/* 154 */                           i1iooioloo1 = new i1IoOioloO1(i);
/* 157 */                           i1O0l00.I00000oIO = i1iooioloo1;
                                }
/* 167 */                       i1iio0ol = (i1Iio0Ol) i1iooioloo1.get(o11oo0ooI000l1);
                            } catch (Throwable th) {
/* 411 */                       throw th;
                            }
                        }
/* 171 */               l0lOli l0loli = new l0lOli();
/* 174 */               int iZza = summarizerOptions.zza();
/* 188 */               o0ollI o0olli = iZza == 1 ? iZza != 2 ? o0ollI.INPUT_TYPE_UNKNOWN : o0ollI.INPUT_TYPE_CONVERSATION : o0ollI.INPUT_TYPE_ARTICLE;
/* 190 */               int iZzc = summarizerOptions.zzc();
/* 209 */               o0ooI10oIl o0ooi10oil = iZzc == 1 ? iZzc != 2 ? iZzc != 3 ? o0ooI10oIl.OUTPUT_TYPE_UNKNOWN : o0ooI10oIl.OUTPUT_TYPE_THREE_BULLETS : o0ooI10oIl.OUTPUT_TYPE_TWO_BULLETS : o0ooI10oIl.OUTPUT_TYPE_ONE_BULLET;
/* 211 */               int iZzb2 = summarizerOptions.zzb();
/* 230 */               loo00o loo00oVar = iZzb2 == 0 ? iZzb2 != 1 ? iZzb2 != 2 ? loo00o.SAPI_LANGUAGE_UNKNOWN : loo00o.SAPI_LANGUAGE_KOREAN : loo00o.SAPI_LANGUAGE_JAPANESE : loo00o.SAPI_LANGUAGE_ENGLISH;
/* 234 */               o0oolIi0l01 o0oolii0l01 = new o0oolIi0l01();
/* 237 */               o0oolii0l01.I00000oIO = o0olli;
/* 239 */               o0oolii0l01.I00000oOI = o0ooi10oil;
/* 241 */               o0oolii0l01.I0000Il00O = loo00oVar;
/* 243 */               VarHandle.storeStoreFence();
/* 246 */               l0loli.I00000oIO = o0oolii0l01;
/* 248 */               l0loli.I00000oOI = i1iio0ol;
/* 250 */               VarHandle.storeStoreFence();
/* 256 */               this.zza = true;
/* 258 */               this.zzb = summarizerOptions;
/* 260 */               this.zzc = il00iioo1;
/* 262 */               this.zzg = l0loli;
/* 264 */               iZzb = summarizerOptions.zzb();
/* 268 */               if (iZzb != 0) {
/* 361 */                   this.zzd = summarizerOptions.zza() == 1 ? 622 : 621;
/* 365 */                   this.zze = 50;
/* 378 */                   this.zzf = true != zzm() ? 7860 : WhisperEngine.SAMPLE_RATE;
                        } else if (iZzb == 1) {
/* 330 */                   this.zzd = summarizerOptions.zza() == 1 ? 633 : 631;
/* 334 */                   this.zze = 25;
/* 347 */                   this.zzf = true != zzm() ? 4992 : 8000;
                        } else {
/* 272 */                   if (iZzb != 2) {
/* 315 */                       I000II.I000iOII(Oi010OO0.I000oI1ioi(summarizerOptions.zzb(), "Unsupported language: "));
/* 318 */                       throw null;
                            }
/* 285 */                   this.zzd = summarizerOptions.zza() == 1 ? 634 : 632;
/* 289 */                   this.zze = 40;
/* 302 */                   this.zzf = true != zzm() ? 4224 : 6000;
                        }
/* 385 */               I1ii1o0 i1ii1o0 = new I1ii1o0(26, false);
/* 390 */               o0oi101lOlo o0oi101lolo = new o0oi101lOlo();
/* 393 */               o0oi101lolo.I00000oIO = o0oolii0l01;
/* 395 */               VarHandle.storeStoreFence();
/* 398 */               i1ii1o0.I00ilI0I1 = o0oi101lolo;
/* 406 */               i1iio0ol.I00000oIO(OoOlO1O0o.I000l1(i1ii1o0), lolooOOo11o.SAPI_SUMMARIZATION_CREATE);
                    }
/* 171 */           l0lOli l0loli2 = new l0lOli();
/* 174 */           int iZza2 = summarizerOptions.zza();
/* 188 */           if (iZza2 == 1) {
                    }
/* 190 */           int iZzc2 = summarizerOptions.zzc();
/* 209 */           if (iZzc2 == 1) {
                    }
/* 211 */           int iZzb22 = summarizerOptions.zzb();
/* 230 */           if (iZzb22 == 0) {
                    }
/* 234 */           o0oolIi0l01 o0oolii0l012 = new o0oolIi0l01();
/* 237 */           o0oolii0l012.I00000oIO = o0olli;
/* 239 */           o0oolii0l012.I00000oOI = o0ooi10oil;
/* 241 */           o0oolii0l012.I0000Il00O = loo00oVar;
/* 243 */           VarHandle.storeStoreFence();
/* 246 */           l0loli2.I00000oIO = o0oolii0l012;
/* 248 */           l0loli2.I00000oOI = i1iio0ol;
/* 250 */           VarHandle.storeStoreFence();
/* 256 */           this.zza = true;
/* 258 */           this.zzb = summarizerOptions;
/* 260 */           this.zzc = il00iioo1;
/* 262 */           this.zzg = l0loli2;
/* 264 */           iZzb = summarizerOptions.zzb();
/* 268 */           if (iZzb != 0) {
                    }
/* 385 */           I1ii1o0 i1ii1o02 = new I1ii1o0(26, false);
/* 390 */           o0oi101lOlo o0oi101lolo2 = new o0oi101lOlo();
/* 393 */           o0oi101lolo2.I00000oIO = o0oolii0l012;
/* 395 */           VarHandle.storeStoreFence();
/* 398 */           i1ii1o02.I00ilI0I1 = o0oi101lolo2;
/* 406 */           i1iio0ol.I00000oIO(OoOlO1O0o.I000l1(i1ii1o02), lolooOOo11o.SAPI_SUMMARIZATION_CREATE);
                }

                public static ilOI1I0lloOl zzb(Summarizer summarizer, iOli1OIoI0o ioli1oioi0o) {
/* 1 */             iOIIl1Oo ioiil1oo = summarizer.zzc;
/* 7 */             i1O01oOIoI0I i1o01ooioi0i = new i1O01oOIoI0I(23);
/* 11 */            if (ioli1oioi0o == null) {
/* 83 */                IOOlIIilOl0.I000II("Null feature");
/* 10 */                return null;
                    }
/* 13 */            if (ioiil1oo == null) {
/* 57 */                StringBuilder sb = new StringBuilder();
/* 60 */                if (ioiil1oo == null) {
/* 64 */                    sb.append(" aiCoreClient");
                        }
/* 77 */                I000II.I001IO000("Missing required properties:".concat(sb.toString()));
/* 10 */                return null;
                    }
/* 17 */            ilOI1I0lloOl iloi1i0llool = new ilOI1I0lloOl();
/* 25 */            iloi1i0llool.I0001Ioi1lo = new Object();
/* 27 */            iloi1i0llool.I00000oIO = ioiil1oo;
/* 29 */            iloi1i0llool.I00000oOI = ioli1oioi0o;
/* 31 */            iloi1i0llool.I0000Il00O = i1o01ooioi0i;
/* 33 */            il00iIOo1 il00iioo1 = (il00iIOo1) ioiil1oo;
/* 37 */            iloi1i0llool.I0000O = il00iioo1.I00iOIl;
/* 41 */            iloi1i0llool.I0000oI00 = il00iioo1.I00iiO;
/* 47 */            iloi1i0llool.I000OOo1O = Optional.empty();
/* 49 */            VarHandle.storeStoreFence();
/* 52 */            summarizer.zzh = iloi1i0llool;
/* 54 */            return iloi1i0llool;
                }

                /* JADX WARN: Removed duplicated region for block: B:35:0x00ea  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x00f7  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static ListenableFuture zzc(Summarizer summarizer, SummarizationRequest summarizationRequest, StreamingCallback streamingCallback, AtomicLong atomicLong, long j, ilOI1I0lloOl iloi1i0llool) throws GenAiException {
                    int i;
                    int size;
                    Object[] objArr;
                    int length;
                    int size2;
/* 3 */             String strZza = summarizationRequest.zza();
/* 7 */             int length2 = strZza.length();
/* 11 */            int i2 = summarizer.zzf;
/* 14 */            if (length2 > i2) {
/* 22 */                if (!summarizer.zzb.zze()) {
/* 45 */                    throw new GenAiException(IIlIOloOOO.I00100l0("Input text length exceeds the character limit of ", i2, ", please enable auto truncation by calling setLongInputAutoTruncationEnabled(true) when constructing the SummarizerOptions or reduce the input text length."), (Throwable) null, 12);
                        }
/* 25 */                strZza = strZza.substring(0, i2);
                    }
/* 46 */            SummarizerOptions summarizerOptions = summarizer.zzb;
/* 52 */            int i3 = 1;
/* 53 */            if (summarizerOptions.zza() == 1 && strZza.length() < 400) {
/* 73 */                throw new GenAiException("Input text length is smaller than the minimum character limit of 400 for the ARTICLE InputType.", (Throwable) null, -100);
                    }
/* 76 */            il1O0lOli0iO il1o0loli0io = new il1O0lOli0iO();
/* 79 */            il1o0loli0io.I00000oIO = strZza;
/* 81 */            VarHandle.storeStoreFence();
/* 84 */            io0iIOO0 io0iioo0 = io0o00I1ol1o.I00iiI;
/* 86 */            Object[] objArr2 = {il1o0loli0io};
/* 90 */            lioi0olooo.I00000oIO(1, objArr2);
/* 97 */            io0o00I1ol1o io0o00i1ol1oI000o00OoI0I = io0o00I1ol1o.I000o00OoI0I(io0o00I1ol1o.I000lI(1, objArr2));
/* 108 */           Set<Map.Entry> setEntrySet = new HashMap().entrySet();
/* 112 */           boolean z = setEntrySet instanceof Collection;
/* 129 */           I00Ol00 i00Ol00 = new I00Ol00(z ? setEntrySet.size() : 4, 20);
/* 132 */           if (z && (size2 = (size = setEntrySet.size()) + size) > (length = (objArr = (Object[]) i00Ol00.I0000Il00O).length)) {
/* 157 */               i00Ol00.I0000Il00O = Arrays.copyOf(objArr, lioOolIil.I00000oIO(length, size2));
                    }
/* 167 */           for (Map.Entry entry : setEntrySet) {
/* 183 */               i00Ol00.I001iOo1i0O(entry.getKey(), entry.getValue());
                    }
/* 189 */           io11I0O io11i0o = (io11I0O) i00Ol00.I0000O;
/* 191 */           if (io11i0o != null) {
/* 685 */               throw io11i0o.I00000oIO();
                    }
/* 199 */           OOoli1l oOoli1lI000O01llI0 = OOoli1l.I000O01llI0(i00Ol00.I00000oOI, (Object[]) i00Ol00.I0000Il00O, i00Ol00);
/* 205 */           io11I0O io11i0o2 = (io11I0O) i00Ol00.I0000O;
/* 207 */           if (io11i0o2 != null) {
/* 362 */               throw io11i0o2.I00000oIO();
                    }
/* 209 */           il111l0o1 il111l0o1Var = new il111l0o1();
/* 212 */           il111l0o1Var.I00000oIO = oOoli1lI000O01llI0;
/* 214 */           VarHandle.storeStoreFence();
/* 225 */           int length3 = summarizationRequest.zza().trim().length();
/* 229 */           int i4 = summarizer.zze;
/* 233 */           if (length3 < i4 + i4) {
/* 235 */               i = 1;
                    } else {
/* 237 */               i = 3;
/* 240 */               if (length3 >= i4 * 3 || summarizerOptions.zzc() != 3) {
/* 250 */                   int iZzc = summarizerOptions.zzc();
/* 254 */                   if (iZzc != 1) {
/* 256 */                       if (iZzc == 2) {
/* 248 */                           i = 2;
                                } else if (iZzc != 3) {
/* 271 */                           I000II.I000iOII(Oi010OO0.I000oI1ioi(summarizerOptions.zzc(), "Unsupported output type: "));
/* 13 */                            return null;
                                }
                            }
                        }
                    }
/* 275 */           int overrideRequestKindOrDefault = summarizationRequest.getOverrideRequestKindOrDefault();
/* 288 */           zzg zzgVar = streamingCallback != null ? new zzg(atomicLong, j, streamingCallback) : null;
/* 289 */           if (io0o00i1ol1oI000o00OoI0I == null) {
/* 334 */               StringBuilder sb = new StringBuilder();
/* 337 */               if (io0o00i1ol1oI000o00OoI0I == null) {
/* 341 */                   sb.append(" messages");
                        }
/* 354 */               I000II.I001IO000("Missing required properties:".concat(sb.toString()));
/* 13 */                return null;
                    }
/* 293 */           il1l01I0il il1l01i0il = new il1l01I0il();
/* 296 */           il1l01i0il.I00000oIO = io0o00i1ol1oI000o00OoI0I;
/* 298 */           il1l01i0il.I0000oI00 = zzgVar;
/* 300 */           il1l01i0il.I00000oOI = i;
/* 302 */           il1l01i0il.I0000Il00O = il111l0o1Var;
/* 304 */           il1l01i0il.I0000O = overrideRequestKindOrDefault;
/* 306 */           VarHandle.storeStoreFence();
/* 309 */           ListenableFuture listenableFutureI0000O = iloi1i0llool.I0000O();
/* 315 */           ii100IIOI1 ii100iioi1 = new ii100IIOI1(i3);
/* 318 */           ii100iioi1.I00000oOI = iloi1i0llool;
/* 320 */           ii100iioi1.I0000Il00O = il1l01i0il;
/* 322 */           VarHandle.storeStoreFence();
/* 327 */           return lioo0lo01i.I0000O(listenableFutureI0000O, ii100iioi1, iloi1i0llool.I0000O);
                }

                public static ListenableFuture zzd(Summarizer summarizer, iOli1OIoI0o ioli1oioi0o) {
/* 1 */             if (ioli1oioi0o == null) {
/* 56 */                return lioo0lo01i.I00000oOI(0);
                    }
/* 5 */             il00iIOo1 il00iioo1 = (il00iIOo1) summarizer.zzc;
/* 7 */             il00iioo1.I000II();
/* 29 */            iol1Io1 iol1io1I0000Il00O = lioo0lo01i.I0000Il00O(ioo10O.I000o00OoI0I(il00iioo1.I00000oIO().I0000Il00O()), new iiiilII0i(), iollol1ioIi.I00iOIl);
/* 36 */            ii111o0I ii111o0i = new ii111o0I(3);
/* 39 */            ii111o0i.I00000oOI = ioli1oioi0o;
/* 41 */            VarHandle.storeStoreFence();
/* 46 */            return lioo0lo01i.I0000O(iol1io1I0000Il00O, ii111o0i, il00iioo1.I00iOIl);
                }

                public static ListenableFuture zze(Summarizer summarizer, lolooOOo11o lolooooo11o, Throwable th) throws Throwable {
                    GenAiException genAiException;
                    GenAiException genAiException2;
/* 3 */             boolean z = false;
/* 4 */             if (th instanceof GenAiException) {
/* 6 */                 genAiException2 = (GenAiException) th;
                    } else {
/* 11 */                if (th instanceof iOlI0O0iIiO) {
/* 13 */                    iOlI0O0iIiO ioli0o0iiio = (iOlI0O0iIiO) th;
/* 19 */                    genAiException = new GenAiException(ioli0o0iiio, ioli0o0iiio.I00iOIl);
                        } else {
/* 26 */                    String message = th.getMessage();
/* 30 */                    if (message == null) {
/* 32 */                        message = "";
                            }
/* 34 */                    genAiException = new GenAiException(message, th, 0);
                        }
/* 22 */                genAiException2 = genAiException;
                    }
/* 38 */            lolooOOo11o lolooooo11o2 = lolooOOo11o.SAPI_SUMMARIZATION_INFERENCE;
/* 40 */            if (lolooooo11o == lolooooo11o2) {
/* 42 */                l0lOli l0loli = summarizer.zzg;
/* 46 */                int iZzh = zzh(summarizer.zzi);
/* 50 */                int errorCode = genAiException2.getErrorCode();
/* 58 */                I1ii1o0 i1ii1o0 = new I1ii1o0(26, z);
/* 61 */                o0oolIi0l01 o0oolii0l01 = l0loli.I00000oIO;
/* 63 */                Integer numValueOf = Integer.valueOf(iZzh);
/* 135 */               lolo11illoil lolo11illoilVar = errorCode != -100 ? errorCode != 4 ? errorCode != 15 ? errorCode != 501 ? errorCode != 604 ? errorCode != 7 ? errorCode != 8 ? errorCode != 9 ? errorCode != 11 ? errorCode != 12 ? lolo11illoil.UNKNOWN_ERROR : lolo11illoil.SAPI_REQUEST_TOO_LARGE : lolo11illoil.SAPI_RESPONSE_PROCESSING_ERROR : lolo11illoil.SAPI_BUSY : lolo11illoil.SAPI_NOT_AVAILABLE : lolo11illoil.SAPI_CANCELLED : lolo11illoil.SAPI_NEEDS_SYSTEM_UPDATE : lolo11illoil.SAPI_NOT_ENOUGH_DISK_SPACE : lolo11illoil.SAPI_RESPONSE_GENERATION_ERROR : lolo11illoil.SAPI_REQUEST_PROCESSING_ERROR : lolo11illoil.SAPI_REQUEST_TOO_SMALL;
/* 137 */               i1Iio0Ol i1iio0ol = l0loli.I00000oOI;
/* 141 */               o0lio1i1I o0lio1i1i = new o0lio1i1I();
/* 144 */               o0lio1i1i.I00000oIO = numValueOf;
/* 146 */               o0lio1i1i.I00000oOI = lolo11illoilVar;
/* 149 */               o0lio1i1i.I0000Il00O = null;
/* 151 */               o0lio1i1i.I0000O = null;
/* 153 */               o0lio1i1i.I0000oI00 = null;
/* 155 */               o0lio1i1i.I0001Ioi1lo = null;
/* 157 */               o0lio1i1i.I000II = null;
/* 159 */               VarHandle.storeStoreFence();
/* 164 */               o0oiol1 o0oiol1Var = new o0oiol1();
/* 167 */               o0oiol1Var.I00000oIO = o0oolii0l01;
/* 169 */               o0oiol1Var.I00000oOI = o0lio1i1i;
/* 171 */               VarHandle.storeStoreFence();
/* 174 */               i1ii1o0.I00iio = o0oiol1Var;
/* 180 */               i1iio0ol.I00000oIO(OoOlO1O0o.I000l1(i1ii1o0), lolooooo11o2);
                    }
/* 183 */           return lioo0lo01i.I00000oIO(genAiException2);
                }

                public static ListenableFuture zzf(Summarizer summarizer, DownloadCallback downloadCallback, iOli1OIoI0o ioli1oioi0o) {
/* 3 */             zzp zzpVar = new zzp(summarizer, downloadCallback);
/* 8 */             il00iIOo1 il00iioo1 = (il00iIOo1) summarizer.zzc;
/* 14 */            l0Io11IiO0l l0io11iio0lI0000Il00O = il00iioo1.I00000oIO().I0000Il00O();
/* 20 */            iilO0I0l0 iilo0i0l0 = new iilO0I0l0();
/* 23 */            iilo0i0l0.I00000oIO = il00iioo1;
/* 25 */            iilo0i0l0.I00000oOI = ioli1oioi0o;
/* 27 */            iilo0i0l0.I0000Il00O = zzpVar;
/* 29 */            VarHandle.storeStoreFence();
/* 34 */            return lioo0lo01i.I0000O(l0io11iio0lI0000Il00O, iilo0i0l0, il00iioo1.I00iOIl);
                }

                public static SummarizationResult zzg(Summarizer summarizer, SummarizationRequest summarizationRequest, AtomicLong atomicLong, long j, ilIoilo ilioilo) throws Throwable {
/* 14 */            ilI1o0o1o ili1o0o1o = (ilI1o0o1o) ((il1liI1l00O) ilioilo).I00000oIO.get(0);
/* 37 */            zzc zzcVar = new zzc(ili1o0o1o.I00000oIO, ili1o0o1o.I00000oOI / ili1o0o1o.I00000oIO.trim().split(" ").length);
/* 42 */            int iZzh = zzh(summarizer.zzi);
/* 46 */            long j2 = atomicLong.get();
/* 54 */            long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
/* 56 */            l0lOli l0loli = summarizer.zzg;
/* 58 */            boolean z = summarizer.zza;
/* 64 */            I1ii1o0 i1ii1o0 = new I1ii1o0(26, false);
/* 67 */            o0oolIi0l01 o0oolii0l01 = l0loli.I00000oIO;
/* 69 */            Integer numValueOf = Integer.valueOf(iZzh);
/* 73 */            lolo11illoil lolo11illoilVar = lolo11illoil.NO_ERROR;
/* 75 */            Boolean boolValueOf = Boolean.valueOf(z);
/* 87 */            Integer numValueOf2 = Integer.valueOf(summarizationRequest.zza().length());
/* 99 */            Integer numValueOf3 = Integer.valueOf(zzcVar.getSummary().length());
/* 109 */           Long lValueOf = Long.valueOf(j2 & Long.MAX_VALUE);
/* 115 */           Long lValueOf2 = Long.valueOf(jElapsedRealtime & Long.MAX_VALUE);
/* 121 */           o0lio1i1I o0lio1i1i = new o0lio1i1I();
/* 124 */           o0lio1i1i.I00000oIO = numValueOf;
/* 126 */           o0lio1i1i.I00000oOI = lolo11illoilVar;
/* 128 */           o0lio1i1i.I0000Il00O = boolValueOf;
/* 130 */           o0lio1i1i.I0000O = numValueOf2;
/* 132 */           o0lio1i1i.I0000oI00 = numValueOf3;
/* 134 */           o0lio1i1i.I0001Ioi1lo = lValueOf2;
/* 136 */           o0lio1i1i.I000II = lValueOf;
/* 138 */           VarHandle.storeStoreFence();
/* 143 */           o0oiol1 o0oiol1Var = new o0oiol1();
/* 146 */           o0oiol1Var.I00000oIO = o0oolii0l01;
/* 148 */           o0oiol1Var.I00000oOI = o0lio1i1i;
/* 150 */           VarHandle.storeStoreFence();
/* 153 */           i1ii1o0.I00iio = o0oiol1Var;
/* 163 */           l0loli.I00000oOI.I00000oIO(OoOlO1O0o.I000l1(i1ii1o0), lolooOOo11o.SAPI_SUMMARIZATION_INFERENCE);
/* 166 */           summarizer.zza = false;
/* 399 */           return zzcVar;
                }

                private static int zzh(iOli1OIoI0o ioli1oioi0o) {
/* 1 */             if (ioli1oioi0o != null) {
/* 5 */                 return ((ii00Il000) ioli1oioi0o).I0001Ioi1lo;
                    }
/* 8 */             return -1;
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [com.google.mlkit.genai.summarization.zzj] */
                private final ListenableFuture zzi(ListenableFuture listenableFuture, final lolooOOo11o lolooooo11o) {
/* 3 */             ?? r0 = new iollIi0II1o() {
                        @Override
                        public final ListenableFuture zza(Object obj) {
/* 7 */                     return Summarizer.zze(this.zza, lolooooo11o, (Throwable) obj);
                        }
                    };
/* 10 */            l01oII l01oii = ((il00iIOo1) this.zzc).I00iOIl;
/* 14 */            ioOi1lil iooi1lil = new ioOi1lil();
/* 17 */            iooi1lil.I00ioIO = listenableFuture;
/* 21 */            iooi1lil.I00l0I0l0lO1 = Throwable.class;
/* 23 */            iooi1lil.I00l0OO0IO = r0;
/* 29 */            listenableFuture.addListener(iooi1lil, ll00O010oO.I00000oIO(l01oii, iooi1lil));
/* 37 */            return iooi1lil;
                }

                private final ListenableFuture zzj() {
/* 1 */             ilOI1I0lloOl iloi1i0llool = this.zzh;
                    return iloi1i0llool != null ? lioo0lo01i.I00000oOI(iloi1i0llool) : lioo0lo01i.I0000Il00O(zzk(), new iliooIIO0Oi() {
                        @Override
                        public final Object zza(Object obj) {
/* 5 */                     return Summarizer.zzb(this.zza, (iOli1OIoI0o) obj);
                        }
                    }, ((il00iIOo1) this.zzc).I00iOIl);
                }

                private final synchronized ListenableFuture zzk() {
/* 4 */             if (this.zzi != null) {
/* 8 */                 return lioo0lo01i.I00000oOI(this.zzi);
                    }
/* 16 */            iOIIl1Oo ioiil1oo = this.zzc;
/* 27 */            if (!GenAiUtils.isAiCoreCompatible(((il00iIOo1) ioiil1oo).I00iiI)) {
/* 37 */                return lioo0lo01i.I00000oIO(new GenAiException(null, GenAiException.ErrorCode.AICORE_INCOMPATIBLE));
                    }
/* 43 */            int i = this.zzd;
/* 47 */            int targetVersionOrDefault = this.zzb.getTargetVersionOrDefault();
/* 52 */            il00iIOo1 il00iioo1 = (il00iIOo1) ioiil1oo;
/* 54 */            il00iioo1.I000II();
/* 76 */            iol1Io1 iol1io1I0000Il00O = lioo0lo01i.I0000Il00O(ioo10O.I000o00OoI0I(il00iioo1.I00000oIO().I0000Il00O()), new iiiilII0i(), iollol1ioIi.I00iOIl);
/* 82 */            iiiO0iI1IOl0 iiio0ii1iol0 = new iiiO0iI1IOl0();
/* 85 */            iiio0ii1iol0.I00000oIO = i;
/* 87 */            iiio0ii1iol0.I00000oOI = targetVersionOrDefault;
/* 89 */            VarHandle.storeStoreFence();
/* 107 */           return lioo0lo01i.I0000Il00O(lioo0lo01i.I0000O(iol1io1I0000Il00O, iiio0ii1iol0, il00iioo1.I00iOIl), new iliooIIO0Oi() {
                        @Override
                        public final Object zza(Object obj) {
/* 3 */                     iOli1OIoI0o ioli1oioi0o = (iOli1OIoI0o) obj;
/* 1 */                     this.zza.zzi = ioli1oioi0o;
/* 49 */                    return ioli1oioi0o;
                        }
                    }, ((il00iIOo1) ioiil1oo).I00iOIl);
                }

                private final ListenableFuture zzl(final SummarizationRequest summarizationRequest, final StreamingCallback streamingCallback) {
/* 1 */             final long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 7 */             final AtomicLong atomicLong = new AtomicLong();
/* 10 */            ListenableFuture listenableFutureZzj = zzj();
/* 21 */            iollIi0II1o iollii0ii1o = new iollIi0II1o() {
                        @Override
                        public final ListenableFuture zza(Object obj) {
/* 14 */                    return Summarizer.zzc(this.zza, summarizationRequest, streamingCallback, atomicLong, jElapsedRealtime, (ilOI1I0lloOl) obj);
                        }
                    };
/* 26 */            iOIIl1Oo ioiil1oo = this.zzc;
/* 52 */            return zzi(lioo0lo01i.I0000Il00O(lioo0lo01i.I0000O(listenableFutureZzj, iollii0ii1o, ((il00iIOo1) ioiil1oo).I00iOIl), new iliooIIO0Oi() {
                        @Override
                        public final Object zza(Object obj) {
/* 12 */                    return Summarizer.zzg(this.zza, summarizationRequest, atomicLong, jElapsedRealtime, (ilIoilo) obj);
                        }
                    }, ((il00iIOo1) ioiil1oo).I00iOIl), lolooOOo11o.SAPI_SUMMARIZATION_INFERENCE);
                }

                private static boolean zzm() {
/* 1 */             String str = Build.MANUFACTURER;
/* 3 */             Locale locale = Locale.ROOT;
                    return str.toLowerCase(locale).contains("google") && Build.MODEL.toLowerCase(locale).contains("pixel");
                }

                public ListenableFuture checkFeatureStatus() {
/* 1 */             iOIIl1Oo ioiil1oo = this.zzc;
                    return !GenAiUtils.isAiCoreCompatible(((il00iIOo1) ioiil1oo).I00iiI) ? lioo0lo01i.I00000oOI(0) : zzi(lioo0lo01i.I0000O(zzk(), new iollIi0II1o() {
                        @Override
                        public final ListenableFuture zza(Object obj) {
/* 5 */                     return Summarizer.zzd(this.zza, (iOli1OIoI0o) obj);
                        }
                    }, ((il00iIOo1) ioiil1oo).I00iOIl), null);
                }

                public void close() throws Throwable {
/* 5 */             ((il00iIOo1) this.zzc).I0000Il00O();
/* 9 */             this.zza = true;
/* 11 */            l0lOli l0loli = this.zzg;
/* 18 */            I1ii1o0 i1ii1o0 = new I1ii1o0(26, false);
/* 21 */            o0oolIi0l01 o0oolii0l01 = l0loli.I00000oIO;
/* 25 */            o0oIlOl11 o0oilol11 = new o0oIlOl11();
/* 28 */            o0oilol11.I00000oIO = o0oolii0l01;
/* 30 */            VarHandle.storeStoreFence();
/* 33 */            i1ii1o0.I00ilO0 = o0oilol11;
/* 43 */            l0loli.I00000oOI.I00000oIO(OoOlO1O0o.I000l1(i1ii1o0), lolooOOo11o.SAPI_SUMMARIZATION_CLOSE);
                }

                public ListenableFuture downloadFeature(final DownloadCallback downloadCallback) {
/* 21 */            return zzi(lioo0lo01i.I0000O(zzk(), new iollIi0II1o() {
                        @Override
                        public final ListenableFuture zza(Object obj) {
/* 7 */                     return Summarizer.zzf(this.zza, downloadCallback, (iOli1OIoI0o) obj);
                        }
                    }, ((il00iIOo1) this.zzc).I00iOIl), null);
                }

                public ListenableFuture getBaseModelName() {
/* 21 */            return zzi(lioo0lo01i.I0000O(zzk(), new iollIi0II1o() {
                        @Override
                        public final ListenableFuture zza(Object obj) {
/* 1 */                     iOli1OIoI0o ioli1oioi0o = (iOli1OIoI0o) obj;
                            return ioli1oioi0o != null ? lioo0lo01i.I00000oOI(((ii00Il000) ioli1oioi0o).I00000oOI) : lioo0lo01i.I00000oIO(new IllegalStateException("Failed to get base model name. aiFeature is null."));
                        }
                    }, ((il00iIOo1) this.zzc).I00iOIl), null);
                }

                public ListenableFuture prepareInferenceEngine() {
/* 21 */            return zzi(lioo0lo01i.I0000O(zzj(), new iollIi0II1o() {
                        @Override
                        public final ListenableFuture zza(Object obj) {
/* 1 */                     ilOI1I0lloOl iloi1i0llool = (ilOI1I0lloOl) obj;
/* 3 */                     ListenableFuture listenableFutureI0000O = iloi1i0llool.I0000O();
/* 10 */                    ii111o0I ii111o0i = new ii111o0I(2);
/* 13 */                    ii111o0i.I00000oOI = iloi1i0llool;
/* 15 */                    VarHandle.storeStoreFence();
/* 20 */                    return lioo0lo01i.I0000O(listenableFutureI0000O, ii111o0i, iloi1i0llool.I0000O);
                        }
                    }, ((il00iIOo1) this.zzc).I00iOIl), null);
                }

                public ListenableFuture runInference(SummarizationRequest summarizationRequest) {
/* 2 */             return zzl(summarizationRequest, null);
                }

/* 6 */         public ListenableFuture runInference(SummarizationRequest summarizationRequest, StreamingCallback streamingCallback) {
/* 7 */             return zzl(summarizationRequest, streamingCallback);
                }
            }

            package com.google.mlkit.vision.mediapipe;

            import java.util.List;
            import java.util.concurrent.atomic.AtomicBoolean;
            import p000.O1o01iO0liI0;
            import p000.l11ll1Oo;
            import p000.lII0I0I000I;
            
            public class MediaPipeGraphRunner {
                private final MediaPipeGraphRunnerConfig zza;
                private zzg zzb;
                private final AtomicBoolean zzc = new AtomicBoolean(false);

                public MediaPipeGraphRunner(MediaPipeGraphRunnerConfig mediaPipeGraphRunnerConfig) {
/* 4 */             this.zza = mediaPipeGraphRunnerConfig;
                }

                private final void zza() throws O1o01iO0liI0 {
/* 7 */             if (this.zzc.get()) {
/* 29 */                throw new O1o01iO0liI0("close() already called, can't send any more inputs.", 13);
                    }
/* 11 */            if (this.zzb == null) {
/* 13 */                load();
                    }
                }

                public void close() {
/* 4 */             this.zzc.set(true);
/* 7 */             zzg zzgVar = this.zzb;
/* 9 */             if (zzgVar != null) {
/* 11 */                zzgVar.zzc();
/* 15 */                this.zzb = null;
                    }
                }

                public void load() {
/* 7 */             if (this.zzc.get()) {
/* 113 */               throw new O1o01iO0liI0("close() already called, can't call load().", 13);
                    }
/* 11 */            if (this.zzb == null) {
/* 17 */                zzg zzgVar = new zzg(this.zza);
/* 20 */                this.zzb = zzgVar;
/* 22 */                zzgVar.zzd();
/* 27 */                this.zzb.zze();
                    }
                }

                public <ResultT> ResultT run(List<MediaPipeInput> list, Converter<ResultT> converter) throws O1o01iO0liI0 {
/* 1 */             zza();
/* 6 */             l11ll1Oo l11ll1ooI000O01llI0 = l11ll1Oo.I000O01llI0("MediaPipeGraphRunner#run");
/* 10 */            l11ll1ooI000O01llI0.I00000oIO();
                    try {
/* 13 */                zzg zzgVar = this.zzb;
/* 15 */                lII0I0I000I.I000II(zzgVar);
/* 18 */                ResultT resultt = (ResultT) zzgVar.zza(list, converter);
/* 22 */                l11ll1ooI000O01llI0.close();
/* 25 */                return resultt;
                    } catch (Throwable th) {
                        try {
/* 27 */                    l11ll1ooI000O01llI0.close();
                        } catch (Throwable th2) {
/* 32 */                    th.addSuppressed(th2);
                        }
/* 89 */                throw th;
                    }
                }

                public void sendToInputStream(String str, MediaPipeInput mediaPipeInput) throws Throwable {
/* 1 */             zza();
/* 4 */             zzg zzgVar = this.zzb;
/* 6 */             lII0I0I000I.I000II(zzgVar);
/* 9 */             zzgVar.zzf(str, mediaPipeInput);
                }
            }

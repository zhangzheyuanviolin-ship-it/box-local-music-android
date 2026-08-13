            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.concurrent.Executor;
            
            final class zzbih implements Executor {
                private final zzbju zza;
                private Executor zzb;

                public zzbih(zzbju zzbjuVar) {
/* 4 */             this.zza = zzbjuVar;
                }

                @Override
                public final void execute(Runnable runnable) {
/* 5 */             zza().execute(runnable);
                }

                public final synchronized Executor zza() {
                    Executor executor;
/* 2 */             executor = this.zzb;
/* 4 */             if (executor == null) {
/* 12 */                executor = (Executor) this.zza.zza();
/* 18 */                zzgo.zzd(executor, "%s.getObject()", this.zzb);
/* 21 */                this.zzb = executor;
                    }
/* 27 */            return executor;
                }

                public final synchronized void zzb() {
/* 2 */             Executor executor = this.zzb;
/* 4 */             if (executor != null) {
/* 8 */                 this.zza.zzb(executor);
/* 12 */                this.zzb = null;
                    }
                }
            }

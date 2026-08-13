            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            
            final class zzazi implements Runnable {
                final zzazj zza;
                final Runnable zzb;
                final zzazm zzc;

                public zzazi(zzazm zzazmVar, zzazj zzazjVar, Runnable runnable) {
/* 1 */             this.zza = zzazjVar;
/* 3 */             this.zzb = runnable;
/* 5 */             Objects.requireNonNull(zzazmVar);
/* 8 */             this.zzc = zzazmVar;
                }

                @Override
                public final void run() {
/* 1 */             zzazm zzazmVar = this.zzc;
/* 5 */             zzazmVar.zzc(this.zza);
/* 8 */             zzazmVar.zzb();
                }

                public final String toString() {
/* 13 */            return String.valueOf(this.zzb.toString()).concat("(scheduled in SynchronizationContext)");
                }
            }

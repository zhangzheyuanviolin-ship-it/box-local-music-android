            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            
            final class zzbit implements Runnable {
                final Runnable zza;
                final zzbiv zzb;

                public zzbit(zzbiv zzbivVar, Runnable runnable) {
/* 1 */             this.zza = runnable;
/* 3 */             Objects.requireNonNull(zzbivVar);
/* 6 */             this.zzb = zzbivVar;
                }

                @Override
                public final void run() {
/* 3 */             this.zza.run();
/* 8 */             zzbiv zzbivVar = this.zzb;
/* 10 */            zzbiu zzbiuVar = new zzbiu(zzbivVar);
/* 17 */            zzazm zzazmVar = zzbivVar.zzd.zza.zzd;
/* 19 */            zzazmVar.zzc(zzbiuVar);
/* 22 */            zzazmVar.zzb();
                }
            }

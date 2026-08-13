            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            
            final class zzbiu implements Runnable {
                final zzbiv zza;

                public zzbiu(zzbiv zzbivVar) {
/* 1 */             Objects.requireNonNull(zzbivVar);
/* 4 */             this.zza = zzbivVar;
                }

                @Override
                public final void run() {
/* 1 */             zzbiv zzbivVar = this.zza;
/* 5 */             zzbjd zzbjdVar = zzbivVar.zzd.zza;
/* 11 */            if (zzbjdVar.zzH != null) {
/* 17 */                zzbjdVar.zzH.remove(zzbivVar);
/* 28 */                if (zzbjdVar.zzH.isEmpty()) {
/* 37 */                    zzbjdVar.zze.zzc(zzbjdVar.zzI, false);
/* 1 */                     zzbjdVar.zzH = null;
/* 52 */                    if (zzbjdVar.zzM.get()) {
/* 60 */                        zzbjdVar.zzL.zza(zzbjd.zzb);
                            }
                        }
                    }
                }
            }

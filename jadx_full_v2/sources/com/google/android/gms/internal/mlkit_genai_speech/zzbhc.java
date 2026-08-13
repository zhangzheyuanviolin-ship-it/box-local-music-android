            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            
            final class zzbhc implements Runnable {
                final zzbhp zza;

                public zzbhc(zzbhp zzbhpVar) {
/* 1 */             Objects.requireNonNull(zzbhpVar);
/* 4 */             this.zza = zzbhpVar;
                }

                @Override
                public final void run() {
/* 1 */             zzbhp zzbhpVar = this.zza;
/* 10 */            zzbhpVar.zzh.zza(2, "Terminated");
/* 21 */            zzbjd zzbjdVar = ((zzbiy) zzbhpVar.zzc).zzb.zzj;
/* 27 */            zzbjdVar.zzG.remove(zzbhpVar);
/* 34 */            zzbjdVar.zzU.zzg(zzbhpVar);
/* 37 */            zzbjd.zzU(zzbjdVar);
                }
            }

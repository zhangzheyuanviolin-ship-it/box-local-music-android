            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            
            final class zzbip implements Runnable {
                final zzbiw zza;

                public zzbip(zzbiw zzbiwVar) {
/* 1 */             Objects.requireNonNull(zzbiwVar);
/* 4 */             this.zza = zzbiwVar;
                }

                @Override
                public final void run() {
/* 1 */             zzbiw zzbiwVar = this.zza;
/* 3 */             zzbjd zzbjdVar = zzbiwVar.zza;
/* 9 */             if (zzbjdVar.zzH == null) {
/* 23 */                if (zzbiwVar.zzb.get() == zzbjd.zzg) {
/* 30 */                    zzbiwVar.zzb.set(null);
                        }
/* 39 */                zzbjdVar.zzL.zza(zzbjd.zzb);
                    }
                }
            }

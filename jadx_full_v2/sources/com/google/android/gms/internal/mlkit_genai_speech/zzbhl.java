            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            
            final class zzbhl implements Runnable {
                final zzbhm zza;

                public zzbhl(zzbhm zzbhmVar) {
/* 1 */             Objects.requireNonNull(zzbhmVar);
/* 4 */             this.zza = zzbhmVar;
                }

                @Override
                public final void run() {
/* 1 */             zzbhm zzbhmVar = this.zza;
/* 3 */             zzbhp zzbhpVar = zzbhmVar.zzc;
/* 11 */            zzbhpVar.zzr.remove(zzbhmVar.zza);
/* 24 */            if (zzbhpVar.zzv.zza() == zzauv.SHUTDOWN && zzbhpVar.zzr.isEmpty()) {
/* 36 */                zzbhp.zzE(zzbhpVar);
                    }
                }
            }

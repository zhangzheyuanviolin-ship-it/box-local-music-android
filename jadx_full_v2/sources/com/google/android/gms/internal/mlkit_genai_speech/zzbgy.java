            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            
            final class zzbgy implements Runnable {
                final zzbhp zza;

                public zzbgy(zzbhp zzbhpVar) {
/* 1 */             Objects.requireNonNull(zzbhpVar);
/* 4 */             this.zza = zzbhpVar;
                }

                @Override
                public final void run() {
/* 1 */             zzbhp zzbhpVar = this.zza;
/* 13 */            if (zzbhpVar.zzv.zza() == zzauv.IDLE) {
/* 22 */                zzbhpVar.zzh.zza(2, "CONNECTING as requested");
/* 27 */                zzbhp.zzD(zzbhpVar, zzauv.CONNECTING);
/* 30 */                zzbhp.zzH(zzbhpVar);
                    }
                }
            }

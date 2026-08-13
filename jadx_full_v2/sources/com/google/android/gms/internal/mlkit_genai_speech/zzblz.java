            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            
            final class zzblz implements Runnable {
                final zzaxq zza;
                final zzbmg zzb;

                public zzblz(zzbmg zzbmgVar, zzaxq zzaxqVar) {
/* 1 */             this.zza = zzaxqVar;
/* 3 */             Objects.requireNonNull(zzbmgVar);
/* 6 */             this.zzb = zzbmgVar;
                }

                @Override
                public final void run() {
/* 11 */            this.zzb.zzb.zzz.zze(this.zza);
                }
            }

            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            
            final class zzbef implements Runnable {
                final zzaxq zza;
                final zzbej zzb;

                public zzbef(zzbej zzbejVar, zzaxq zzaxqVar) {
/* 1 */             this.zza = zzaxqVar;
/* 3 */             Objects.requireNonNull(zzbejVar);
/* 6 */             this.zzb = zzbejVar;
                }

                @Override
                public final void run() {
/* 9 */             this.zzb.zza.zzb(this.zza);
                }
            }

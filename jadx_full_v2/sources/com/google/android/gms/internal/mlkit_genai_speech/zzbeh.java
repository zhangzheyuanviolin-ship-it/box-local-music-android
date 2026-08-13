            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            
            final class zzbeh implements Runnable {
                final zzazd zza;
                final zzaxq zzb;
                final zzbej zzc;

                public zzbeh(zzbej zzbejVar, zzazd zzazdVar, zzaxq zzaxqVar) {
/* 1 */             this.zza = zzazdVar;
/* 3 */             this.zzb = zzaxqVar;
/* 5 */             Objects.requireNonNull(zzbejVar);
/* 8 */             this.zzc = zzbejVar;
                }

                @Override
                public final void run() {
/* 11 */            this.zzc.zza.zza(this.zza, this.zzb);
                }
            }

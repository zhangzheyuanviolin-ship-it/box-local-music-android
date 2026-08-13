            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            
            final class zzbdz implements Runnable {
                final zzazd zza;
                final zzbek zzb;

                public zzbdz(zzbek zzbekVar, zzazd zzazdVar) {
/* 1 */             this.zza = zzazdVar;
/* 3 */             Objects.requireNonNull(zzbekVar);
/* 6 */             this.zzb = zzbekVar;
                }

                @Override
                public final void run() {
/* 1 */             zzazd zzazdVar = this.zza;
/* 17 */            this.zzb.zzh.zza(zzazdVar.zzg(), zzazdVar.zzh());
                }
            }

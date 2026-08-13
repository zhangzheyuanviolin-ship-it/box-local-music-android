            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            
            final class zzbdg extends zzbdu {
                final zzazd zza;
                final zzaxq zzb;
                final zzbdi zzc;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzbdg(zzbdi zzbdiVar, zzbol zzbolVar, zzazd zzazdVar, zzaxq zzaxqVar) {
/* 16 */            super(zzbdiVar.zza.zzg);
/* 1 */             this.zza = zzazdVar;
/* 3 */             this.zzb = zzaxqVar;
/* 5 */             Objects.requireNonNull(zzbdiVar);
/* 8 */             this.zzc = zzbdiVar;
                }

                @Override
                public final void zza() {
/* 1 */             int i = zzbom.zza;
/* 3 */             zzbdi zzbdiVar = this.zzc;
/* 5 */             zzbdj zzbdjVar = zzbdiVar.zza;
/* 11 */            zzbdjVar.zzh.zzd();
/* 14 */            zzazd zzazdVar = this.zza;
/* 16 */            zzaxq zzaxqVar = this.zzb;
/* 22 */            if (zzbdiVar.zzc != null) {
/* 1 */                 zzazdVar = zzbdiVar.zzc;
/* 30 */                zzaxqVar = new zzaxq();
                    }
                    try {
/* 37 */                zzbdj.zzr(zzbdjVar, zzbdiVar.zzb, zzazdVar, zzaxqVar);
                    } finally {
/* 69 */                this.zzc.zza.zzf.zza(zzazdVar.zzj());
                    }
                }
            }

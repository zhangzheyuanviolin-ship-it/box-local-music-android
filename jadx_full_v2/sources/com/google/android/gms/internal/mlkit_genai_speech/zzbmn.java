            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            
            final class zzbmn extends zzayg {
                final zzbmo zza;
                private final zzayg zzb;

                public zzbmn(zzbmo zzbmoVar, zzayg zzaygVar) {
/* 1 */             Objects.requireNonNull(zzbmoVar);
/* 4 */             this.zza = zzbmoVar;
/* 9 */             this.zzb = zzaygVar;
                }

                @Override
                public final zzazd zza(zzayi zzayiVar) {
/* 3 */             zzazd zzazdVarZza = this.zzb.zza(zzayiVar);
/* 7 */             boolean zZzj = zzazdVarZza.zzj();
/* 11 */            zzbmo zzbmoVar = this.zza;
/* 13 */            if (zZzj) {
/* 19 */                zzbmoVar.zzb.zzb();
/* 22 */                return zzazdVarZza;
                    }
/* 32 */            zzbmoVar.zzb.zzc(new zzbmm(zzbmoVar));
/* 77 */            return zzazdVarZza;
                }
            }

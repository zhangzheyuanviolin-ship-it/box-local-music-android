            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            
            final class zzbiv extends zzbek {
                final zzavb zza;
                final zzaxv zzb;
                final zzatz zzc;
                final zzbiw zzd;
                private final long zze;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzbiv(zzbiw zzbiwVar, zzavb zzavbVar, zzaxv zzaxvVar, zzatz zzatzVar) {
/* 22 */            super(zzbjd.zzM(zzbiwVar.zza, zzatzVar), zzbiwVar.zza.zzq, zzatzVar.zzi());
/* 1 */             Objects.requireNonNull(zzbiwVar);
/* 4 */             this.zzd = zzbiwVar;
/* 25 */            this.zza = zzavbVar;
/* 27 */            this.zzb = zzaxvVar;
/* 29 */            this.zzc = zzatzVar;
/* 35 */            this.zze = System.nanoTime();
                }

                @Override
                public final void zzm() {
/* 3 */             zzbiu zzbiuVar = new zzbiu(this);
/* 10 */            zzazm zzazmVar = this.zzd.zza.zzd;
/* 12 */            zzazmVar.zzc(zzbiuVar);
/* 15 */            zzazmVar.zzb();
                }

                public final void zzn() {
/* 3 */             zzavb zzavbVarZzb = this.zza.zzb();
                    try {
/* 1 */                 zzaue zzaueVarZzh = this.zzd.zzh(this.zzb, this.zzc.zze(zzaum.zza, Long.valueOf(System.nanoTime() - this.zze)));
/* 36 */                this.zza.zzf(zzavbVarZzb);
/* 39 */                Runnable runnableZzi = zzi(zzaueVarZzh);
/* 43 */                zzbiw zzbiwVar = this.zzd;
/* 45 */                if (runnableZzi != null) {
/* 76 */                    zzbjd.zzM(zzbiwVar.zza, this.zzc).execute(new zzbit(this, runnableZzi));
                        } else {
/* 49 */                    zzbiu zzbiuVar = new zzbiu(this);
/* 54 */                    zzazm zzazmVar = zzbiwVar.zza.zzd;
/* 56 */                    zzazmVar.zzc(zzbiuVar);
/* 59 */                    zzazmVar.zzb();
                        }
                    } catch (Throwable th) {
/* 83 */                this.zza.zzf(zzavbVarZzb);
/* 110 */               throw th;
                    }
                }
            }

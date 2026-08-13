            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.concurrent.Executor;
            
            final class zzbif extends zzavm {
                private final zzavz zza;
                private final zzaua zzb;
                private final Executor zzc;
                private final zzaxv zzd;
                private final zzavb zze;
                private zzatz zzf;
                private zzaue zzg;

                public zzbif(zzavz zzavzVar, zzaua zzauaVar, Executor executor, zzaxv zzaxvVar, zzatz zzatzVar) {
/* 4 */             this.zza = zzavzVar;
/* 6 */             this.zzb = zzauaVar;
/* 8 */             this.zzd = zzaxvVar;
/* 16 */            executor = zzatzVar.zzn() != null ? zzatzVar.zzn() : executor;
/* 20 */            this.zzc = executor;
/* 26 */            this.zzf = zzatzVar.zzb(executor);
/* 32 */            this.zze = zzavb.zzc();
                }

                @Override
                public final void zza(String str, Throwable th) {
/* 1 */             zzaue zzaueVar = this.zzg;
/* 3 */             if (zzaueVar != null) {
/* 5 */                 zzaueVar.zza(str, th);
                    }
                }

                @Override
                public final void zze(zzaud zzaudVar, zzaxq zzaxqVar) {
/* 3 */             zzatz zzatzVar = this.zzf;
/* 1 */             zzawo zzawoVar = zzbjd.zzh;
/* 9 */             zzaxv zzaxvVar = this.zzd;
/* 16 */            zzavx zzavxVarZza = this.zza.zza(new zzbkr(zzaxvVar, zzaxqVar, zzatzVar, zzawoVar));
/* 20 */            zzazd zzazdVarZzb = zzavxVarZza.zzb();
/* 28 */            if (!zzazdVarZzb.zzj()) {
/* 41 */                this.zzc.execute(new zzbie(this, zzaudVar, zzbgr.zza(zzazdVarZzb)));
/* 48 */                this.zzg = zzbjd.zzi;
                    } else {
/* 57 */                zzbjm zzbjmVarZzb = ((zzbjp) zzavxVarZza.zzc()).zzb(zzaxvVar);
/* 61 */                if (zzbjmVarZzb != null) {
/* 71 */                    this.zzf = this.zzf.zze(zzbjm.zza, zzbjmVarZzb);
                        }
/* 77 */                zzaue zzaueVarZza = this.zzb.zza(zzaxvVar, this.zzf);
/* 81 */                this.zzg = zzaueVarZza;
/* 83 */                zzaueVarZza.zze(zzaudVar, zzaxqVar);
                    }
                }

                @Override
                public final zzaue zzg() {
/* 1 */             return this.zzg;
                }
            }

            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            
            final class zzbdi implements zzbdm {
                final zzbdj zza;
                private final zzaud zzb;
                private zzazd zzc;

                public zzbdi(zzbdj zzbdjVar, zzaud zzaudVar) {
/* 1 */             Objects.requireNonNull(zzbdjVar);
/* 4 */             this.zza = zzbdjVar;
/* 11 */            zzgo.zzc(zzaudVar, "observer");
/* 14 */            this.zzb = zzaudVar;
                }

                public static void zzc(zzbdi zzbdiVar, zzazd zzazdVar) {
/* 1 */             zzbdiVar.zzc = zzazdVar;
/* 9 */             zzbdiVar.zza.zzk.zzb(zzazdVar);
                }

                @Override
                public final void zzd(zzazd zzazdVar, zzbdl zzbdlVar, zzaxq zzaxqVar) {
/* 1 */             int i = zzbom.zza;
/* 3 */             zzbdj zzbdjVar = this.zza;
/* 1 */             zzavf zzavfVarZzs = zzbdjVar.zzs();
/* 15 */            if (zzazdVar.zza() == zzayz.CANCELLED && zzavfVarZzs != null && zzavfVarZzs.zzd()) {
/* 29 */                zzazdVar = zzbdjVar.zzh.zzb();
/* 35 */                zzaxqVar = new zzaxq();
                    }
/* 51 */            zzbdjVar.zzd.execute(new zzbdg(this, zzbom.zza(), zzazdVar, zzaxqVar));
                }

                @Override
                public final void zze(zzaxq zzaxqVar) {
/* 1 */             int i = zzbom.zza;
/* 18 */            this.zza.zzd.execute(new zzbde(this, zzbom.zza(), zzaxqVar));
                }

                @Override
                public final void zzf(zzbni zzbniVar) {
/* 1 */             int i = zzbom.zza;
/* 18 */            this.zza.zzd.execute(new zzbdf(this, zzbom.zza(), zzbniVar));
                }

                @Override
                public final void zzg() {
/* 1 */             zzbdj zzbdjVar = this.zza;
/* 15 */            if (zzbdjVar.zzc.zzb().zza()) {
/* 17 */                return;
                    }
/* 31 */            zzbdjVar.zzd.execute(new zzbdh(this, zzbom.zza()));
                }
            }

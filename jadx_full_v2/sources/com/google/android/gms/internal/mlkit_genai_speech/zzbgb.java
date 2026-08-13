            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzbgb extends zzbjt {
                private boolean zzb;
                private final zzazd zzc;
                private final zzbdl zzd;
                private final zzaum[] zze;

                public zzbgb(zzazd zzazdVar, zzbdl zzbdlVar, zzaum[] zzaumVarArr) {
/* 12 */            zzgo.zzf(!zzazdVar.zzj(), "error must not be OK");
/* 15 */            this.zzc = zzazdVar;
/* 17 */            this.zzd = zzbdlVar;
/* 19 */            this.zze = zzaumVarArr;
                }

                @Override
                public final void zza(zzbgu zzbguVar) {
/* 5 */             zzbguVar.zzb("error", this.zzc);
/* 12 */            zzbguVar.zzb("progress", this.zzd);
                }

                @Override
                public final void zzl(zzbdm zzbdmVar) {
/* 7 */             zzgo.zzn(!this.zzb, "already started");
/* 10 */            this.zzb = true;
/* 12 */            int i = 0;
                    while (true) {
/* 13 */                zzaum[] zzaumVarArr = this.zze;
/* 16 */                if (i >= zzaumVarArr.length) {
/* 32 */                    zzbdmVar.zzd(this.zzc, this.zzd, new zzaxq());
/* 77 */                    return;
                        } else {
/* 18 */                    zzaum zzaumVar = zzaumVarArr[i];
/* 20 */                    i++;
                        }
                    }
                }
            }

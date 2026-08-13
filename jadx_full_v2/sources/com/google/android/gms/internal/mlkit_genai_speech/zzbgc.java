            package com.google.android.gms.internal.mlkit_genai_speech;
            
            final class zzbgc implements zzbdn {
                final zzazd zza;
                private final zzbdl zzb;

                public zzbgc(zzazd zzazdVar, zzbdl zzbdlVar) {
/* 12 */            zzgo.zzf(!zzazdVar.zzj(), "error must not be OK");
/* 15 */            this.zza = zzazdVar;
/* 17 */            this.zzb = zzbdlVar;
                }

                @Override
                public final zzawd zzc() {
/* 20 */            throw new UnsupportedOperationException("Not a real transport");
                }

                @Override
                public final zzbdk zze(zzaxv zzaxvVar, zzaxq zzaxqVar, zzatz zzatzVar, zzaum[] zzaumVarArr) {
/* 7 */             return new zzbgb(this.zza, this.zzb, zzaumVarArr);
                }
            }

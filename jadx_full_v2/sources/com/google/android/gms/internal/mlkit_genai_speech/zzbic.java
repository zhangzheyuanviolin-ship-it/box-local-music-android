            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.HashSet;
            import java.util.Objects;
            
            final class zzbic extends zzbmj {
                final zzaxv zza;
                final zzatz zzb;
                final zzavb zzc;
                final zzbid zzd;

                /* JADX WARN: Illegal instructions before constructor call */
                public zzbic(zzbid zzbidVar, zzaxv zzaxvVar, zzaxq zzaxqVar, zzatz zzatzVar, zzbmk zzbmkVar, zzbgs zzbgsVar, zzavb zzavbVar) {
/* 3 */             this.zza = zzaxvVar;
/* 5 */             this.zzb = zzatzVar;
/* 9 */             this.zzc = zzavbVar;
/* 11 */            Objects.requireNonNull(zzbidVar);
/* 14 */            this.zzd = zzbidVar;
/* 16 */            zzbjd zzbjdVar = zzbidVar.zzb;
/* 59 */            super(zzaxvVar, zzaxqVar, zzbjdVar.zzZ, zzbjdVar.zzaa, zzbjdVar.zzab, zzbjd.zzM(zzbjdVar, zzatzVar), zzbidVar.zzb.zzp.zzb(), zzbmkVar, zzbgsVar, zzbidVar.zza);
                }

                @Override
                public final zzazd zzo() {
/* 1 */             zzbjb zzbjbVar = this.zzd.zzb.zzL;
                    synchronized (zzbjbVar.zza) {
                        try {
/* 12 */                    zzazd zzazdVar = zzbjbVar.zzc;
/* 14 */                    if (zzazdVar != null) {
/* 17 */                        return zzazdVar;
                            }
/* 22 */                    zzbjbVar.zzb.add(this);
/* 26 */                    return null;
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
                }

                @Override
                public final zzbdk zzp(zzaxq zzaxqVar, zzauj zzaujVar, int i, boolean z, boolean z2) {
/* 3 */             zzatz zzatzVarZzf = this.zzb.zzf(zzaujVar);
/* 7 */             zzaum[] zzaumVarArrZzg = zzbgr.zzg(zzatzVarZzf, zzaxqVar, i, z, z2);
/* 13 */            zzavb zzavbVarZzb = this.zzc.zzb();
                    try {
/* 27 */                return this.zzd.zzb.zzK.zze(this.zza, zzaxqVar, zzatzVarZzf, zzaumVarArrZzg);
                    } finally {
/* 40 */                this.zzc.zzf(zzavbVarZzb);
                    }
                }

                @Override
                public final void zzq() {
                    zzazd zzazdVar;
/* 1 */             zzbjb zzbjbVar = this.zzd.zzb.zzL;
                    synchronized (zzbjbVar.zza) {
                        try {
/* 14 */                    zzbjbVar.zzb.remove(this);
/* 23 */                    if (zzbjbVar.zzb.isEmpty()) {
/* 25 */                        zzazdVar = zzbjbVar.zzc;
/* 32 */                        zzbjbVar.zzb = new HashSet();
                            } else {
/* 37 */                        zzazdVar = null;
                            }
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
/* 39 */            if (zzazdVar != null) {
/* 47 */                zzbjbVar.zzd.zzK.zzr(zzazdVar);
                    }
                }
            }

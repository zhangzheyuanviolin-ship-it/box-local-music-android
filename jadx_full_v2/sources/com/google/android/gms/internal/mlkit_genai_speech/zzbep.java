            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            
            final class zzbep extends zzbfk {
                final zzbes zza;
                private final zzawq zzb;
                private final zzavb zzc;
                private final zzaum[] zzd;
                private volatile zzazd zze;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzbep(zzbes zzbesVar, zzawq zzawqVar, zzaum[] zzaumVarArr, zzber zzberVar) {
/* 8 */             super("connecting_and_lb");
/* 1 */             Objects.requireNonNull(zzbesVar);
/* 4 */             this.zza = zzbesVar;
/* 15 */            this.zzc = zzavb.zzc();
/* 17 */            this.zzb = zzawqVar;
/* 19 */            this.zzd = zzaumVarArr;
                }

                public static Runnable zzp(zzbep zzbepVar, zzbdn zzbdnVar, String str) {
/* 3 */             zzavb zzavbVarZzb = zzbepVar.zzc.zzb();
                    try {
/* 7 */                 zzawq zzawqVar = zzbepVar.zzb;
/* 23 */                zzbdk zzbdkVarZze = zzbdnVar.zze(zzawqVar.zzc(), zzawqVar.zzb(), zzawqVar.zza(), zzbepVar.zzd);
/* 29 */                zzbepVar.zzc.zzf(zzavbVarZzb);
/* 32 */                return zzbepVar.zzt(zzbdkVarZze);
                    } catch (Throwable th) {
/* 40 */                zzbepVar.zzc.zzf(zzavbVarZzb);
/* 98 */                throw th;
                    }
                }

                @Override
                public final void zza(zzbgu zzbguVar) {
/* 11 */            if (this.zzb.zza().zzo()) {
/* 15 */                zzbguVar.zza("wait_for_ready");
/* 18 */                zzazd zzazdVar = this.zze;
/* 20 */                if (zzazdVar != null && !zzazdVar.zzj()) {
/* 30 */                    zzbguVar.zzb("Last Pick Failure", zzazdVar);
                        }
                    }
/* 33 */            super.zza(zzbguVar);
                }

                @Override
                public final void zzb(zzazd zzazdVar) {
/* 1 */             super.zzb(zzazdVar);
/* 4 */             zzbes zzbesVar = this.zza;
                    synchronized (zzbesVar.zzb) {
                        try {
/* 15 */                    if (zzbesVar.zzg != null) {
/* 21 */                        boolean zRemove = zzbesVar.zzi.remove(this);
/* 29 */                        if (!zzbesVar.zzm() && zRemove) {
/* 41 */                            zzbesVar.zzd.zzc(zzbesVar.zzf);
/* 50 */                            if (zzbesVar.zzj.zzb != null) {
/* 60 */                                zzbesVar.zzd.zzc(zzbesVar.zzg);
/* 2 */                                 zzbesVar.zzg = null;
                                    }
                                }
                            }
                        } catch (Throwable th) {
/* 168 */                   throw th;
                        }
                    }
/* 77 */            this.zza.zzd.zzb();
                }

                @Override
                public final void zzr(zzazd zzazdVar) {
/* 1 */             int i = 0;
                    while (true) {
/* 2 */                 zzaum[] zzaumVarArr = this.zzd;
/* 5 */                 if (i >= zzaumVarArr.length) {
/* 29 */                    return;
                        }
/* 7 */                 zzaum zzaumVar = zzaumVarArr[i];
/* 9 */                 i++;
                    }
                }
            }

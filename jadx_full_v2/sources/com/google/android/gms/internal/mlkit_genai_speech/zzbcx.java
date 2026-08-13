            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            import java.util.concurrent.atomic.AtomicInteger;
            
            final class zzbcx extends zzbgg {
                private final zzbdr zza;
                private final AtomicInteger zzb;
                private volatile zzazd zzc;

                public zzbcx(zzbcy zzbcyVar, zzbdr zzbdrVar, String str) {
/* 1 */             Objects.requireNonNull(zzbcyVar);
/* 15 */            this.zzb = new AtomicInteger(-2147483647);
/* 17 */            this.zza = zzbdrVar;
/* 21 */            zzgo.zzc(str, "authority");
                }

                @Override
                public final zzbdr zza() {
/* 1 */             return this.zza;
                }

                @Override
                public final zzbdk zze(zzaxv zzaxvVar, zzaxq zzaxqVar, zzatz zzatzVar, zzaum[] zzaumVarArr) {
                    return this.zzb.get() >= 0 ? new zzbgb(this.zzc, zzbdl.PROCESSED, zzaumVarArr) : this.zza.zze(zzaxvVar, zzaxqVar, zzatzVar, zzaumVarArr);
                }

                @Override
                public final void zzr(zzazd zzazdVar) {
/* 3 */             zzgo.zzc(zzazdVar, "status");
                    synchronized (this) {
                        try {
/* 7 */                     AtomicInteger atomicInteger = this.zzb;
/* 13 */                    if (atomicInteger.get() < 0) {
/* 15 */                        this.zzc = zzazdVar;
/* 20 */                        atomicInteger.addAndGet(Integer.MAX_VALUE);
/* 27 */                        if (atomicInteger.get() != 0) {
/* 30 */                            return;
                                }
/* 34 */                        super.zzr(zzazdVar);
                            }
                        } catch (Throwable th) {
/* 77 */                    throw th;
                        }
                    }
                }
            }

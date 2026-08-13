            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            
            final class zzblr extends zzaum {
                long zzb;
                final zzbmj zzc;
                private final zzbmh zzd;

                public zzblr(zzbmj zzbmjVar, zzbmh zzbmhVar) {
/* 1 */             Objects.requireNonNull(zzbmjVar);
/* 4 */             this.zzc = zzbmjVar;
/* 9 */             this.zzd = zzbmhVar;
                }

                @Override
                public final void zza(long j) {
/* 1 */             zzbmj zzbmjVar = this.zzc;
/* 9 */             if (zzbmjVar.zzt.zzf != null) {
/* 105 */               return;
                    }
                    synchronized (zzbmjVar.zzn) {
                        try {
/* 23 */                    if (zzbmjVar.zzt.zzf == null) {
/* 25 */                        zzbmh zzbmhVar = this.zzd;
/* 29 */                        if (!zzbmhVar.zzb) {
/* 34 */                            long j2 = this.zzb + j;
/* 35 */                            this.zzb = j2;
/* 43 */                            if (j2 <= zzbmjVar.zzy) {
/* 46 */                                return;
                                    }
/* 56 */                            if (j2 > zzbmjVar.zzp) {
/* 58 */                                zzbmhVar.zzc = true;
                                    } else {
/* 70 */                                long jZza = zzbmjVar.zzo.zza(j2 - zzbmjVar.zzy);
/* 1 */                                 zzbmjVar.zzy = this.zzb;
/* 85 */                                if (jZza > zzbmjVar.zzq) {
/* 87 */                                    zzbmhVar.zzc = true;
                                        }
                                    }
/* 98 */                            Runnable runnableZzaf = zzbmhVar.zzc ? zzbmjVar.zzaf(zzbmhVar) : null;
/* 100 */                           if (runnableZzaf != null) {
/* 102 */                               runnableZzaf.run();
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                }
            }

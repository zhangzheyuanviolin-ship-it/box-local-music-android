            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            import java.util.concurrent.TimeUnit;
            
            final class zzblu implements Runnable {
                final zzbmh zza;
                final zzblv zzb;

                public zzblu(zzblv zzblvVar, zzbmh zzbmhVar) {
/* 1 */             this.zza = zzbmhVar;
/* 3 */             Objects.requireNonNull(zzblvVar);
/* 6 */             this.zzb = zzblvVar;
                }

                @Override
                public final void run() {
                    zzblt zzbltVar;
                    boolean z;
/* 1 */             zzblv zzblvVar = this.zzb;
/* 3 */             zzbmj zzbmjVar = zzblvVar.zzb;
                    synchronized (zzbmjVar.zzn) {
                        try {
/* 14 */                    zzbltVar = null;
/* 15 */                    if (zzblvVar.zza.zzc) {
/* 17 */                        z = true;
                            } else {
/* 1 */                         zzbmjVar.zzt = zzbmjVar.zzt.zza(this.zza);
/* 41 */                        if (zzbmjVar.zzak(zzbmjVar.zzt) && (zzbmjVar.zzr == null || zzbmjVar.zzr.zza())) {
/* 68 */                            zzbltVar = new zzblt(zzbmjVar.zzn);
/* 1 */                             zzbmjVar.zzB = zzbltVar;
                                } else {
/* 1 */                             zzbmjVar.zzt = zzbmjVar.zzt.zzb();
/* 1 */                             zzbmjVar.zzB = null;
                                }
/* 74 */                        z = false;
                            }
                        } catch (Throwable th) {
/* 245 */                   throw th;
                        }
                    }
/* 92 */            if (z) {
/* 94 */                zzbmh zzbmhVar = this.zza;
/* 107 */               zzbmhVar.zza.zzl(new zzbmg(this.zzb.zzb, zzbmhVar));
/* 120 */               zzbmhVar.zza.zzb(zzazd.zzb.zze("Unneeded hedging"));
/* 123 */               return;
                    }
/* 124 */           if (zzbltVar != null) {
/* 128 */               zzbmj zzbmjVar2 = this.zzb.zzb;
/* 151 */               zzbltVar.zzb(zzbmjVar2.zzi.schedule(new zzblv(zzbmjVar2, zzbltVar), zzbmjVar2.zzl.zzb, TimeUnit.NANOSECONDS));
                    }
/* 1 */             this.zzb.zzb.zzah(this.zza);
                }
            }

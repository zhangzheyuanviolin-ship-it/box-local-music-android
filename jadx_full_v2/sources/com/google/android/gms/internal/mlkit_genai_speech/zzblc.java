            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Collection;
            import java.util.Objects;
            import java.util.concurrent.Future;
            
            final class zzblc implements Runnable {
                final Collection zza;
                final zzbmh zzb;
                final Future zzc;
                final boolean zzd;
                final Future zze;
                final zzbmj zzf;

                public zzblc(zzbmj zzbmjVar, Collection collection, zzbmh zzbmhVar, Future future, boolean z, Future future2) {
/* 1 */             this.zza = collection;
/* 3 */             this.zzb = zzbmhVar;
/* 5 */             this.zzc = future;
/* 7 */             this.zzd = z;
/* 9 */             this.zze = future2;
/* 11 */            Objects.requireNonNull(zzbmjVar);
/* 14 */            this.zzf = zzbmjVar;
                }

                @Override
                public final void run() {
/* 11 */            for (zzbmh zzbmhVar : this.zza) {
/* 21 */                if (zzbmhVar != this.zzb) {
/* 29 */                    zzbmhVar.zza.zzb(zzbmj.zza);
                        }
                    }
/* 33 */            Future future = this.zzc;
/* 36 */            if (future != null) {
/* 38 */                future.cancel(false);
/* 43 */                if (!this.zzd) {
/* 45 */                    zzbmj zzbmjVar = this.zzf;
/* 57 */                    if (zzbmjVar.zzw.decrementAndGet() == Integer.MIN_VALUE) {
/* 68 */                        zzazm zzazmVar = (zzazm) zzbmjVar.zzh;
/* 70 */                        zzazmVar.zzc(new zzblb(this));
/* 73 */                        zzazmVar.zzb();
                            }
                        }
                    }
/* 76 */            Future future2 = this.zze;
/* 78 */            if (future2 != null) {
/* 80 */                future2.cancel(false);
                    }
/* 85 */            this.zzf.zzq();
                }
            }

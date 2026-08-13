            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.Future;
            
            final class zziz implements Runnable {
                final Future zza;
                final zziy zzb;

                public zziz(Future future, zziy zziyVar) {
/* 4 */             this.zza = future;
/* 6 */             this.zzb = zziyVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final void run() {
                    Object obj;
                    Throwable thZza;
/* 1 */             Future future = this.zza;
/* 5 */             if ((future instanceof zzjs) && (thZza = zzjt.zza((zzjs) future)) != null) {
/* 19 */                this.zzb.zza(thZza);
/* 22 */                return;
                    }
                    try {
/* 29 */                zzgo.zzo(future.isDone(), "Future was expected to be done: %s", future);
/* 32 */                boolean z = false;
                        Future future2 = future;
                        while (true) {
                            try {
/* 33 */                        obj = future2.get();
                                break;
                            } catch (InterruptedException unused) {
/* 69 */                        z = true;
                                future2 = future2;
                            } catch (Throwable th) {
/* 58 */                        if (z) {
/* 65 */                            Thread.currentThread().interrupt();
                                }
/* 68 */                        throw th;
                            }
                        }
/* 37 */                if (z) {
/* 43 */                    Thread.currentThread().interrupt();
                        }
/* 53 */                this.zzb.zzb(obj);
                    } catch (ExecutionException e) {
/* 83 */                this.zzb.zza(e.getCause());
                    } catch (Throwable th2) {
/* 73 */                this.zzb.zza(th2);
                    }
                }

                public final String toString() {
/* 1 */             zzgk zzgkVarZzb = zzgm.zzb(this);
/* 7 */             zzgkVarZzb.zzf(this.zzb);
/* 10 */            return zzgkVarZzb.toString();
                }
            }

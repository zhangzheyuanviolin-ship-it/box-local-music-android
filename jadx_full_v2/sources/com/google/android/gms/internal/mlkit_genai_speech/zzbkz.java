            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.concurrent.Executor;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.ScheduledFuture;
            import java.util.concurrent.TimeUnit;
            
            final class zzbkz {
                private final ScheduledExecutorService zza;
                private final Executor zzb;
                private final Runnable zzc;
                private final zzgs zzd;
                private long zze;
                private boolean zzf;
                private ScheduledFuture zzg;

                public zzbkz(Runnable runnable, Executor executor, ScheduledExecutorService scheduledExecutorService, zzgs zzgsVar) {
/* 4 */             this.zzc = runnable;
/* 6 */             this.zzb = executor;
/* 8 */             this.zza = scheduledExecutorService;
/* 10 */            this.zzd = zzgsVar;
/* 12 */            zzgsVar.zzd();
                }

                private final long zzk() {
/* 5 */             return this.zzd.zza(TimeUnit.NANOSECONDS);
                }

                public final void zzh(boolean z) {
                    ScheduledFuture scheduledFuture;
/* 2 */             this.zzf = false;
/* 4 */             if (!z || (scheduledFuture = this.zzg) == null) {
/* 29 */                return;
                    }
/* 10 */            scheduledFuture.cancel(false);
/* 14 */            this.zzg = null;
                }

                public final void zzi(long j, TimeUnit timeUnit) {
/* 1 */             long nanos = timeUnit.toNanos(j);
/* 9 */             long jZzk = zzk() + nanos;
/* 11 */            this.zzf = true;
/* 21 */            if (jZzk - this.zze < 0 || this.zzg == null) {
/* 27 */                ScheduledFuture scheduledFuture = this.zzg;
/* 29 */                if (scheduledFuture != null) {
/* 32 */                    scheduledFuture.cancel(false);
                        }
/* 49 */                this.zzg = this.zza.schedule(new zzbkx(this, null), nanos, TimeUnit.NANOSECONDS);
                    }
/* 51 */            this.zze = jZzk;
                }
            }

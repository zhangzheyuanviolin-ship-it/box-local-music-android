            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Queue;
            import java.util.concurrent.ConcurrentLinkedQueue;
            import java.util.concurrent.Executor;
            import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            
            public final class zzbmv implements Executor, Runnable {
                private static final Logger zza = Logger.getLogger(zzbmv.class.getName());
                private static final zzbmr zzb;
                private final Executor zzc;
                private final Queue zzd = new ConcurrentLinkedQueue();
                private volatile int zze = 0;

                static {
                    zzbmr zzbmtVar;
/* 13 */            zzbmu zzbmuVar = null;
                    try {
/* 22 */                zzbmtVar = new zzbms(AtomicIntegerFieldUpdater.newUpdater(zzbmv.class, "zze"), zzbmuVar);
                    } catch (Throwable th) {
/* 38 */                zza.logp(Level.SEVERE, "io.grpc.internal.SerializingExecutor", "getAtomicHelper", "FieldUpdaterAtomicHelper failed", th);
/* 43 */                zzbmtVar = new zzbmt(zzbmuVar);
                    }
/* 46 */            zzb = zzbmtVar;
                }

                public zzbmv(Executor executor) {
/* 16 */            zzgo.zzc(executor, "'executor' must not be null.");
/* 19 */            this.zzc = executor;
                }

                private final void zzc(Runnable runnable) {
/* 9 */             if (zzb.zzb(this, 0, -1)) {
                        try {
/* 13 */                    this.zzc.execute(this);
                        } catch (Throwable th) {
/* 18 */                    if (runnable != null) {
/* 23 */                        this.zzd.remove(runnable);
                            }
/* 28 */                    zzb.zza(this, 0);
/* 31 */                    throw th;
                        }
                    }
                }

                @Override
                public final void execute(Runnable runnable) {
/* 3 */             zzgo.zzc(runnable, "'r' must not be null.");
/* 8 */             this.zzd.add(runnable);
/* 11 */            zzc(runnable);
                }

                @Override
                public final void run() {
                    while (true) {
                        try {
/* 9 */                     Runnable runnable = (Runnable) this.zzd.poll();
/* 11 */                    if (runnable == null) {
                                break;
                            }
                            try {
/* 13 */                        runnable.run();
                            } catch (RuntimeException e) {
/* 54 */                        zza.logp(Level.SEVERE, "io.grpc.internal.SerializingExecutor", "run", "Exception while executing runnable " + runnable.toString(), (Throwable) e);
                            }
                        } catch (Throwable th) {
/* 78 */                    zzb.zza(this, 0);
/* 110 */                   throw th;
                        }
                    }
/* 60 */            zzb.zza(this, 0);
/* 69 */            if (this.zzd.isEmpty()) {
/* 75 */                return;
                    }
/* 72 */            zzc(null);
                }
            }

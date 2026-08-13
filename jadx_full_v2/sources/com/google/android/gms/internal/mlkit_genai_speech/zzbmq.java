            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.ArrayDeque;
            import java.util.concurrent.Executor;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            
            final class zzbmq implements Executor {
                private static final Logger zza = Logger.getLogger(zzbmq.class.getName());
                private boolean zzb;
                private ArrayDeque zzc;

                private final void zza() {
                    while (true) {
/* 8 */                 Runnable runnable = (Runnable) this.zzc.poll();
/* 10 */                if (runnable == null) {
/* 55 */                    return;
                        }
                        try {
/* 12 */                    runnable.run();
                        } catch (Throwable th) {
/* 36 */                    zza.logp(Level.SEVERE, "io.grpc.internal.SerializeReentrantCallsDirectExecutor", "completeQueuedTasks", "Exception while executing runnable ".concat(runnable.toString()), th);
                        }
                    }
                }

                @Override
                public final void execute(Runnable runnable) {
/* 5 */             zzgo.zzc(runnable, "'task' must not be null.");
/* 10 */            if (this.zzb) {
/* 73 */                ArrayDeque arrayDeque = this.zzc;
/* 75 */                if (arrayDeque == null) {
/* 80 */                    arrayDeque = new ArrayDeque(4);
/* 83 */                    this.zzc = arrayDeque;
                        }
/* 85 */                arrayDeque.add(runnable);
/* 168 */               return;
                    }
/* 13 */            this.zzb = true;
                    try {
/* 16 */                runnable.run();
/* 21 */                if (this.zzc != null) {
/* 23 */                    zza();
                        }
/* 26 */                this.zzb = false;
                    } catch (Throwable th) {
                        try {
/* 47 */                    zza.logp(Level.SEVERE, "io.grpc.internal.SerializeReentrantCallsDirectExecutor", "execute", "Exception while executing runnable ".concat(String.valueOf(runnable)), th);
/* 52 */                    if (this.zzc != null) {
/* 54 */                        zza();
                            }
/* 57 */                    this.zzb = false;
                        } catch (Throwable th2) {
/* 64 */                    if (this.zzc != null) {
/* 67 */                        zza();
                            }
/* 70 */                    this.zzb = false;
/* 72 */                    throw th2;
                        }
                    }
                }
            }

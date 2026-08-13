            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.lang.Thread;
            import java.util.Queue;
            import java.util.concurrent.ConcurrentLinkedQueue;
            import java.util.concurrent.Executor;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.atomic.AtomicReference;
            
            public final class zzazm implements Executor {
                private final Thread.UncaughtExceptionHandler zza;
                private final Queue zzb = new ConcurrentLinkedQueue();
                private final AtomicReference zzc = new AtomicReference();

                public zzazm(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
/* 18 */            this.zza = uncaughtExceptionHandler;
                }

                @Override
                public final void execute(Runnable runnable) {
/* 1 */             zzc(runnable);
/* 4 */             zzb();
                }

                public final zzazk zza(Runnable runnable, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
/* 3 */             zzazj zzazjVar = new zzazj(runnable);
/* 18 */            return new zzazk(zzazjVar, scheduledExecutorService.schedule(new zzazi(this, zzazjVar, runnable), j, timeUnit), null);
                }

                public final void zzb() {
/* 52 */            do {
/* 1 */                 AtomicReference atomicReference = this.zzc;
/* 3 */                 Thread threadCurrentThread = Thread.currentThread();
/* 12 */                while (!atomicReference.compareAndSet(null, threadCurrentThread)) {
/* 65 */                    if (atomicReference.get() != null) {
/* 110 */                       return;
                            }
                        }
                        while (true) {
                            try {
/* 20 */                        Runnable runnable = (Runnable) this.zzb.poll();
/* 22 */                        if (runnable == null) {
                                    break;
                                }
                                try {
/* 24 */                            runnable.run();
                                } catch (Throwable th) {
/* 35 */                            this.zza.uncaughtException(Thread.currentThread(), th);
                                }
                            } catch (Throwable th2) {
/* 57 */                        this.zzc.set(null);
/* 60 */                        throw th2;
                            }
                        }
/* 43 */                this.zzc.set(null);
/* 52 */            } while (!this.zzb.isEmpty());
                }

                public final void zzc(Runnable runnable) {
/* 3 */             zzgo.zzc(runnable, "runnable is null");
/* 8 */             this.zzb.add(runnable);
                }

                public final void zzd() {
/* 18 */            zzgo.zzn(Thread.currentThread() == this.zzc.get(), "Not called from the SynchronizationContext");
                }
            }

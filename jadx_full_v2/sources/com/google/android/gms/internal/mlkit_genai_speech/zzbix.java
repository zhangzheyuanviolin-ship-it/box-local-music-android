            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Collection;
            import java.util.List;
            import java.util.concurrent.Callable;
            import java.util.concurrent.ForkJoinPool;
            import java.util.concurrent.Future;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.ScheduledFuture;
            import java.util.concurrent.TimeUnit;
            
/* 6 */     final class zzbix implements ScheduledExecutorService, AutoCloseable {
                final ScheduledExecutorService zza;

                public zzbix(ScheduledExecutorService scheduledExecutorService, zzbjc zzbjcVar) {
/* 6 */             zzgo.zzc(scheduledExecutorService, "delegate");
/* 9 */             this.zza = scheduledExecutorService;
                }

                @Override
                public final boolean awaitTermination(long j, TimeUnit timeUnit) {
/* 3 */             return this.zza.awaitTermination(j, timeUnit);
                }

                @Override
                public final void close() throws InterruptedException {
/* 5 */             if (this == ForkJoinPool.commonPool() || isTerminated()) {
/* 55 */                return;
                    }
/* 14 */            shutdown();
/* 17 */            boolean zAwaitTermination = false;
/* 18 */            boolean z = false;
/* 19 */            while (!zAwaitTermination) {
                        try {
/* 25 */                    zAwaitTermination = awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
/* 31 */                    if (!z) {
/* 33 */                        shutdownNow();
                            }
/* 36 */                    z = true;
                        }
                    }
/* 38 */            if (z) {
/* 44 */                Thread.currentThread().interrupt();
                    }
                }

                @Override
                public final void execute(Runnable runnable) {
/* 3 */             this.zza.execute(runnable);
                }

                @Override
                public final List invokeAll(Collection collection) {
/* 3 */             return this.zza.invokeAll(collection);
                }

                @Override
                public final Object invokeAny(Collection collection) {
/* 3 */             return this.zza.invokeAny(collection);
                }

                @Override
                public final boolean isShutdown() {
/* 3 */             return this.zza.isShutdown();
                }

                @Override
                public final boolean isTerminated() {
/* 3 */             return this.zza.isTerminated();
                }

                @Override
                public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
/* 3 */             return this.zza.schedule(runnable, j, timeUnit);
                }

                @Override
                public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
/* 3 */             return this.zza.scheduleAtFixedRate(runnable, j, j2, timeUnit);
                }

                @Override
                public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
/* 3 */             return this.zza.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
                }

                @Override
                public final void shutdown() {
/* 20 */            throw new UnsupportedOperationException("Restricted: shutdown() is not allowed");
                }

                @Override
                public final List shutdownNow() {
/* 20 */            throw new UnsupportedOperationException("Restricted: shutdownNow() is not allowed");
                }

                @Override
                public final Future submit(Runnable runnable) {
/* 3 */             return this.zza.submit(runnable);
                }

                @Override
/* 7 */         public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
/* 8 */             return this.zza.invokeAll(collection, j, timeUnit);
                }

                @Override
/* 7 */         public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
/* 8 */             return this.zza.invokeAny(collection, j, timeUnit);
                }

                @Override
/* 7 */         public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
/* 8 */             return this.zza.schedule(callable, j, timeUnit);
                }

                @Override
/* 7 */         public final Future submit(Runnable runnable, Object obj) {
/* 8 */             return this.zza.submit(runnable, obj);
                }

                @Override
/* 8 */         public final Future submit(Callable callable) {
/* 9 */             return this.zza.submit(callable);
                }
            }

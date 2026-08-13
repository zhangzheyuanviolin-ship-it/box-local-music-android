            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.ArrayDeque;
            import java.util.Deque;
            import java.util.concurrent.Executor;
            import java.util.concurrent.RejectedExecutionException;
            
            final class zzjn implements Executor {
                private static final zzjh zza = new zzjh(zzjn.class);
                private final Executor zzb;
                private final Deque zzc = new ArrayDeque();
                private int zzf = 1;
                private long zzd = 0;
                private final zzjl zze = new zzjl(this, null);

                public zzjn(Executor executor) {
/* 26 */            this.zzb = executor;
                }

                @Override
                public final void execute(Runnable runnable) {
/* 1 */             runnable.getClass();
/* 4 */             Deque deque = this.zzc;
                    synchronized (deque) {
/* 7 */                 int i = this.zzf;
/* 10 */                if (i != 4 && i != 3) {
/* 16 */                    long j = this.zzd;
/* 20 */                    zzjk zzjkVar = new zzjk(this, runnable);
/* 23 */                    deque.add(zzjkVar);
/* 27 */                    this.zzf = 2;
                            try {
/* 34 */                        this.zzb.execute(this.zze);
/* 39 */                        if (this.zzf != 2) {
/* 90 */                            return;
                                }
                                synchronized (this.zzc) {
                                    try {
/* 49 */                                if (this.zzd == j && this.zzf == 2) {
/* 55 */                                    this.zzf = 3;
                                        }
                                    } finally {
                                    }
                                }
/* 61 */                        return;
                            } catch (Throwable th) {
/* 65 */                        Deque deque2 = this.zzc;
                                synchronized (deque2) {
                                    try {
/* 68 */                                int i2 = this.zzf;
/* 70 */                                boolean z = false;
/* 72 */                                if ((i2 == 1 || i2 == 2) && deque2.removeLastOccurrence(zzjkVar)) {
/* 82 */                                    z = true;
                                        }
/* 85 */                                if (!(th instanceof RejectedExecutionException) || z) {
/* 93 */                                    throw th;
                                        }
/* 90 */                                return;
                                    } finally {
                                    }
                                }
                            }
                        }
/* 98 */                deque.add(runnable);
                    }
                }

                public final String toString() {
/* 1 */             Executor executor = this.zzb;
/* 34 */            return "SequentialExecutor@" + System.identityHashCode(this) + "{" + String.valueOf(executor) + "}";
                }
            }

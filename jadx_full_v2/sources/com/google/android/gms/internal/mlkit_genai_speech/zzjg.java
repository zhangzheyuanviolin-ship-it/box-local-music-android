            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.concurrent.atomic.AtomicReference;
            import java.util.concurrent.locks.LockSupport;
            import p000.IlIi0I0;
            
            abstract class zzjg extends AtomicReference implements Runnable {
                private static final Runnable zza = new zzje(null);
                private static final Runnable zzb = new zzje(null);

                private final void zzg(Thread thread) {
/* 5 */             Runnable runnable = (Runnable) get();
/* 7 */             zzjd zzjdVar = null;
/* 9 */             boolean z = false;
/* 10 */            int i = 0;
                    while (true) {
/* 13 */                if (!(runnable instanceof zzjd)) {
/* 17 */                    if (runnable != zzb) {
                                break;
                            }
                        } else {
/* 27 */                    zzjdVar = (zzjd) runnable;
                        }
/* 30 */                i++;
/* 33 */                if (i > 1000) {
/* 35 */                    Runnable runnable2 = zzb;
/* 37 */                    if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
/* 55 */                        z = Thread.interrupted() || z;
/* 56 */                        LockSupport.park(zzjdVar);
                            }
                        } else {
/* 60 */                    Thread.yield();
                        }
/* 67 */                runnable = (Runnable) get();
                    }
/* 20 */            if (z) {
/* 22 */                thread.interrupt();
                    }
                }

                @Override
                public final void run() {
/* 1 */             Thread threadCurrentThread = Thread.currentThread();
/* 5 */             Object objZza = null;
/* 10 */            if (compareAndSet(null, threadCurrentThread)) {
/* 13 */                boolean zZzf = zzf();
/* 17 */                if (!zZzf) {
                            try {
/* 19 */                        objZza = zza();
                            } catch (Throwable th) {
                                try {
/* 27 */                            if (th instanceof InterruptedException) {
/* 33 */                                Thread.currentThread().interrupt();
                                    }
/* 45 */                            if (!compareAndSet(threadCurrentThread, zza)) {
/* 47 */                                zzg(threadCurrentThread);
                                    }
/* 50 */                            zzc(th);
/* 53 */                            return;
                                } catch (Throwable th2) {
/* 60 */                            if (!compareAndSet(threadCurrentThread, zza)) {
/* 63 */                                zzg(threadCurrentThread);
                                    }
/* 66 */                            zzd(null);
/* 69 */                            throw th2;
                                }
                            }
                        }
/* 76 */                if (!compareAndSet(threadCurrentThread, zza)) {
/* 78 */                    zzg(threadCurrentThread);
                        }
/* 81 */                if (zZzf) {
/* 110 */                   return;
                        }
/* 83 */                zzd(objZza);
                    }
                }

                @Override
                public final String toString() {
/* 5 */             Runnable runnable = (Runnable) get();
/* 48 */            return IlIi0I0.I000lI(runnable == zza ? "running=[DONE]" : runnable instanceof zzjd ? "running=[INTERRUPTED]" : runnable instanceof Thread ? IlIi0I0.I000lI("running=[RUNNING ON ", ((Thread) runnable).getName(), "]") : "running=[NOT STARTED YET]", ", ", zzb());
                }

                public abstract Object zza();

                public abstract String zzb();

                public abstract void zzc(Throwable th);

                public abstract void zzd(Object obj);

                public final void zze() {
/* 5 */             Runnable runnable = (Runnable) get();
/* 9 */             if (runnable instanceof Thread) {
/* 14 */                zzjd zzjdVar = new zzjd(this, null);
/* 1 */                 zzjdVar.setExclusiveOwnerThread(Thread.currentThread());
/* 28 */                if (compareAndSet(runnable, zzjdVar)) {
                            try {
/* 31 */                        Thread thread = (Thread) runnable;
/* 33 */                        thread.interrupt();
/* 46 */                        if (((Runnable) getAndSet(zza)) == zzb) {
/* 48 */                            LockSupport.unpark(thread);
                                }
                            } catch (Throwable th) {
/* 63 */                        if (((Runnable) getAndSet(zza)) == zzb) {
/* 68 */                            LockSupport.unpark((Thread) runnable);
                                }
/* 71 */                        throw th;
                            }
                        }
                    }
                }

                public abstract boolean zzf();
            }

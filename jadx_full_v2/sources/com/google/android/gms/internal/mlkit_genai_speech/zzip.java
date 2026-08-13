            package com.google.android.gms.internal.mlkit_genai_speech;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.util.Objects;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.Executor;
            import java.util.concurrent.Future;
            import java.util.concurrent.ScheduledFuture;
            import java.util.concurrent.TimeUnit;
            import java.util.logging.Level;
            import p000.IIl001iO0Io;
            import p000.IlIi0I0;
            
/* 4 */     public abstract class zzip<V> extends zziq<V> {

                final class zza {
                    static final zza zza;
                    static final zza zzb;
                    final boolean zzc;
                    final Throwable zzd;

                    static {
/* 4 */                 if (zziq.zzc) {
/* 6 */                     zzb = null;
/* 8 */                     zza = null;
                        } else {
/* 17 */                    zzb = new zza(false, null);
/* 25 */                    zza = new zza(true, null);
                        }
                    }

                    public zza(boolean z, Throwable th) {
/* 4 */                 this.zzc = z;
/* 6 */                 this.zzd = th;
                    }
                }

                final class zzb<V> implements Runnable {
                    final zzip<V> zza;
                    final ListenableFuture zzb;

                    @Override
                    public final void run() {
/* 20 */                throw null;
                    }
                }

                final class zzc {
                    static final zzc zza = new zzc(new Throwable("Failure occurred while trying to finish a future.") {
                        {
/* 3 */                     super("Failure occurred while trying to finish a future.");
                        }

                        @Override
/* 19 */                public final Throwable fillInStackTrace() {
/* 20 */                    return this;
                        }
                    });
                    final Throwable zzb;

                    public zzc(Throwable th) {
/* 4 */                 th.getClass();
/* 7 */                 this.zzb = th;
                    }
                }

                interface zze<V> extends ListenableFuture {
                    @Override
                    void addListener(Runnable runnable, Executor executor);
                }

                public static Object zza(Object obj) throws ExecutionException {
/* 3 */             if (obj instanceof zza) {
/* 27 */                Throwable th = ((zza) obj).zzd;
/* 33 */                CancellationException cancellationException = new CancellationException("Task was cancelled.");
/* 36 */                cancellationException.initCause(th);
/* 77 */                throw cancellationException;
                    }
/* 7 */             if (obj instanceof zzc) {
/* 24 */                throw new ExecutionException(((zzc) obj).zzb);
                    }
/* 11 */            if (obj == zziq.zza) {
/* 13 */                return null;
                    }
/* 14 */            return obj;
                }

                public static boolean zze(Object obj) {
                    return !(obj instanceof zzb);
                }

                /* JADX WARN: Multi-variable type inference failed */
                private static Object zzo(ListenableFuture listenableFuture) {
                    Throwable thZzc;
/* 6 */             if (listenableFuture instanceof zze) {
/* 10 */                Object zzaVar = ((zzip) listenableFuture).valueField;
/* 14 */                if (zzaVar instanceof zza) {
/* 17 */                    zza zzaVar2 = (zza) zzaVar;
/* 21 */                    if (zzaVar2.zzc) {
/* 23 */                        Throwable th = zzaVar2.zzd;
/* 34 */                        zzaVar = th != null ? new zza(false, th) : zza.zzb;
                            }
                        }
/* 36 */                Objects.requireNonNull(zzaVar);
/* 39 */                return zzaVar;
                    }
/* 42 */            if ((listenableFuture instanceof zzjs) && (thZzc = ((zzjs) listenableFuture).zzc()) != null) {
/* 56 */                return new zzc(thZzc);
                    }
/* 60 */            boolean zIsCancelled = listenableFuture.isCancelled();
/* 69 */            if ((!zziq.zzc) && zIsCancelled) {
/* 71 */                zza zzaVar3 = zza.zzb;
/* 73 */                Objects.requireNonNull(zzaVar3);
/* 76 */                return zzaVar3;
                    }
                    try {
/* 77 */                Object objZzp = zzp(listenableFuture);
                        return zIsCancelled ? new zza(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(listenableFuture)))) : objZzp == null ? zziq.zza : objZzp;
                    } catch (Error | Exception e) {
/* 115 */               return new zzc(e);
                    } catch (CancellationException e2) {
                        return !zIsCancelled ? new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(listenableFuture)), e2)) : new zza(false, e2);
                    } catch (ExecutionException e3) {
                        return zIsCancelled ? new zza(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(listenableFuture)), e3)) : new zzc(e3.getCause());
                    }
                }

                private static Object zzp(Future future) {
                    Object obj;
/* 1 */             boolean z = false;
                    while (true) {
                        try {
/* 2 */                     obj = future.get();
                            break;
                        } catch (InterruptedException unused) {
/* 28 */                    z = true;
                        } catch (Throwable th) {
/* 17 */                    if (z) {
/* 24 */                        Thread.currentThread().interrupt();
                            }
/* 27 */                    throw th;
                        }
                    }
/* 6 */             if (z) {
/* 12 */                Thread.currentThread().interrupt();
                    }
/* 15 */            return obj;
                }

                private final void zzq(StringBuilder sb) {
                    try {
/* 3 */                 Object objZzp = zzp(this);
/* 9 */                 sb.append("SUCCESS, result=[");
/* 12 */                if (objZzp == null) {
/* 16 */                    sb.append("null");
                        } else if (objZzp == this) {
/* 28 */                    sb.append("this future");
                        } else {
/* 40 */                    sb.append(objZzp.getClass().getName());
/* 45 */                    sb.append("@");
/* 56 */                    sb.append(Integer.toHexString(System.identityHashCode(objZzp)));
                        }
/* 59 */                sb.append("]");
                    } catch (CancellationException unused) {
/* 83 */                sb.append("CANCELLED");
                    } catch (ExecutionException e) {
/* 89 */                sb.append("FAILURE, cause=[");
/* 96 */                sb.append(e.getCause());
/* 99 */                sb.append("]");
                    } catch (Exception e2) {
/* 65 */                sb.append("UNKNOWN, cause=[");
/* 72 */                sb.append(e2.getClass());
/* 77 */                sb.append(" thrown from get()]");
                    }
                }

                private static void zzr(zzip zzipVar, boolean z) {
                    zzd zzdVar;
/* 1 */             zzd zzdVar2 = null;
                    while (true) {
/* 2 */                 zzipVar.zzl();
/* 5 */                 zzipVar.zzd();
/* 14 */                zzd zzdVar3 = zzdVar2;
/* 10 */                zzd zzdVarZzh = zzipVar.zzh(zzd.zza);
/* 16 */                zzd zzdVar4 = zzdVar3;
/* 17 */                while (zzdVarZzh != null) {
/* 19 */                    zzd zzdVar5 = zzdVarZzh.next;
/* 21 */                    zzdVarZzh.next = zzdVar4;
/* 23 */                    zzdVar4 = zzdVarZzh;
/* 24 */                    zzdVarZzh = zzdVar5;
                        }
/* 26 */                while (zzdVar4 != null) {
/* 28 */                    Runnable runnable = zzdVar4.zzb;
/* 30 */                    zzdVar = zzdVar4.next;
/* 32 */                    Objects.requireNonNull(runnable);
/* 35 */                    Runnable runnable2 = runnable;
/* 39 */                    if (runnable2 instanceof zzb) {
/* 41 */                        zzb zzbVar = (zzb) runnable2;
/* 43 */                        zzipVar = zzbVar.zza;
/* 47 */                        if (zzipVar.valueField != zzbVar || !zziq.zzn(zzipVar, zzbVar, zzo(zzbVar.zzb))) {
                                }
                            } else {
/* 63 */                        Executor executor = zzdVar4.zzc;
/* 65 */                        Objects.requireNonNull(executor);
/* 70 */                        zzs(runnable2, executor);
                            }
/* 73 */                    zzdVar4 = zzdVar;
                        }
/* 106 */               return;
/* 61 */                zzdVar2 = zzdVar;
                    }
                }

                private static void zzs(Runnable runnable, Executor executor) {
                    try {
/* 1 */                 executor.execute(runnable);
                    } catch (Exception e) {
/* 35 */                zziq.zzb.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", IIl001iO0Io.I000oI1ioi("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
                    }
                }

                @Override
                public final void addListener(Runnable runnable, Executor executor) {
                    zzd zzdVar;
/* 3 */             zzgo.zzc(runnable, "Runnable was null.");
/* 8 */             zzgo.zzc(executor, "Executor was null.");
/* 15 */            if (!isDone() && (zzdVar = this.listenersField) != zzd.zza) {
/* 25 */                zzd zzdVar2 = new zzd(runnable, executor);
/* 40 */                do {
/* 28 */                    zzdVar2.next = zzdVar;
/* 34 */                    if (zzm(zzdVar, zzdVar2)) {
/* 43 */                        return;
                            } else {
/* 36 */                        zzdVar = this.listenersField;
                            }
/* 40 */                } while (zzdVar != zzd.zza);
                    }
/* 44 */            zzs(runnable, executor);
                }

                /* JADX WARN: Code restructure failed: missing block: B:31:0x0053, code lost:
                
                    return true;
                 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean cancel(boolean z) {
                    zza zzaVar;
/* 1 */             Object obj = this.valueField;
/* 13 */            if (!(obj instanceof zzb) && !(obj == null)) {
/* 5 */                 return false;
                    }
/* 17 */            if (zziq.zzc) {
/* 28 */                zzaVar = new zza(z, new CancellationException("Future.cancel() was called."));
                    } else {
/* 37 */                zzaVar = z ? zza.zza : zza.zzb;
/* 39 */                Objects.requireNonNull(zzaVar);
                    }
/* 42 */            boolean z2 = false;
                    while (true) {
/* 47 */                if (zziq.zzn(this, obj, zzaVar)) {
/* 49 */                    zzr(this, z);
/* 54 */                    if (!(obj instanceof zzb)) {
                                break;
                            }
/* 58 */                    ListenableFuture listenableFuture = ((zzb) obj).zzb;
/* 62 */                    if (!(listenableFuture instanceof zze)) {
/* 81 */                        listenableFuture.cancel(z);
                                break;
                            }
/* 64 */                    this = (zzip) listenableFuture;
/* 66 */                    obj = this.valueField;
/* 76 */                    if (!(obj == null) && !(obj instanceof zzb)) {
/* 6 */                         return true;
                            }
/* 78 */                    z2 = true;
                        } else {
/* 85 */                    obj = this.valueField;
/* 91 */                    if (zze(obj)) {
/* 93 */                        return z2;
                            }
                        }
                    }
                }

                @Override
                public final Object get() {
/* 1 */             return zzi();
                }

                @Override
                public final boolean isCancelled() {
/* 3 */             return this.valueField instanceof zza;
                }

                @Override
                public final boolean isDone() {
/* 1 */             Object obj = this.valueField;
/* 12 */            return (obj != null) & zze(obj);
                }

                public final String toString() {
                    String strConcat;
/* 3 */             StringBuilder sb = new StringBuilder();
/* 20 */            if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
/* 30 */                sb.append(getClass().getSimpleName());
                    } else {
/* 42 */                sb.append(getClass().getName());
                    }
/* 47 */            sb.append('@');
/* 58 */            sb.append(Integer.toHexString(System.identityHashCode(this)));
/* 63 */            sb.append("[status=");
/* 72 */            if (this.valueField instanceof zza) {
/* 76 */                sb.append("CANCELLED");
                    } else if (isDone()) {
/* 87 */                zzq(sb);
                    } else {
/* 92 */                int length = sb.length();
/* 98 */                sb.append("PENDING");
/* 101 */               Object obj = this.valueField;
/* 107 */               if (obj instanceof zzb) {
/* 111 */                   sb.append(", setFuture=[");
/* 116 */                   ListenableFuture listenableFuture = ((zzb) obj).zzb;
                            try {
/* 118 */                       if (listenableFuture == this) {
/* 122 */                           sb.append("this future");
                                } else {
/* 128 */                           sb.append(listenableFuture);
                                }
                            } catch (Throwable th) {
/* 132 */                       zzjj.zza(th);
/* 135 */                       sb.append("Exception thrown from implementation: ");
/* 142 */                       sb.append(th.getClass());
                            }
/* 145 */                   sb.append("]");
                        } else {
                            try {
/* 153 */                       strConcat = zzgt.zza(zzb());
                            } catch (Throwable th2) {
/* 159 */                       zzjj.zza(th2);
/* 170 */                       strConcat = "Exception thrown from implementation: ".concat(String.valueOf(th2.getClass()));
                            }
/* 174 */                   if (strConcat != null) {
/* 178 */                       sb.append(", info=[");
/* 181 */                       sb.append(strConcat);
/* 184 */                       sb.append("]");
                            }
                        }
/* 191 */               if (isDone()) {
/* 197 */                   sb.delete(length, sb.length());
/* 200 */                   zzq(sb);
                        }
                    }
/* 203 */           sb.append("]");
/* 206 */           return sb.toString();
                }

                /* JADX WARN: Multi-variable type inference failed */
                public String zzb() {
/* 3 */             if (this instanceof ScheduledFuture) {
/* 17 */                return IlIi0I0.I000l1(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), "remaining delay=[", " ms]");
                    }
/* 22 */            return null;
                }

                @Override
                public final Throwable zzc() {
/* 3 */             if (!(this instanceof zze)) {
/* 16 */                return null;
                    }
/* 5 */             Object obj = this.valueField;
/* 9 */             if (obj instanceof zzc) {
/* 13 */                return ((zzc) obj).zzb;
                    }
/* 16 */            return null;
                }

                public final boolean zzf(Object obj) {
/* 1 */             if (obj == null) {
/* 3 */                 obj = zziq.zza;
                    }
/* 11 */            if (!zziq.zzn(this, null, obj)) {
/* 10 */                return false;
                    }
/* 13 */            zzr(this, false);
/* 16 */            return true;
                }

                public final boolean zzg(Throwable th) {
/* 12 */            if (!zziq.zzn(this, null, new zzc(th))) {
/* 11 */                return false;
                    }
/* 14 */            zzr(this, false);
/* 17 */            return true;
                }

                @Override
/* 5 */         public final Object get(long j, TimeUnit timeUnit) {
/* 6 */             return zzj(j, timeUnit);
                }

/* 8 */         final class zzd {
                    static final zzd zza = new zzd();
                    zzd next;
                    final Runnable zzb;
                    final Executor zzc;

                    public zzd() {
/* 5 */                 this.zzb = null;
/* 7 */                 this.zzc = null;
                    }

/* 9 */             public zzd(Runnable runnable, Executor executor) {
                        this.zzb = runnable;
                        this.zzc = executor;
                    }
                }

/* 19 */        public void zzd() {
                }
            }

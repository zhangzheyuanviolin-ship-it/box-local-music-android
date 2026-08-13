            package com.google.android.gms.internal.mlkit_genai_speech;

            import com.google.android.gms.internal.mlkit_genai_speech.zzip;
            import com.google.android.gms.internal.mlkit_genai_speech.zziq;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.reflect.Field;
            import java.security.AccessController;
            import java.security.PrivilegedActionException;
            import java.security.PrivilegedExceptionAction;
            import java.util.Locale;
            import java.util.Objects;
            import java.util.concurrent.Executor;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.TimeoutException;
            import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
            import java.util.concurrent.locks.LockSupport;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            import p000.I000II;
            import p000.IioIoO10iOiI;
            import p000.IlIi0I0;
            import p000.OIiilo1Ool0o;
            import sun.misc.Unsafe;
            
/* 3 */     abstract class zziq<V> extends zzjs implements ListenableFuture {
                static final Object zza = new Object();
                static final zzjh zzb = new zzjh(zzip.class);
                static final boolean zzc;
                private static final zza zzd;
                volatile zzip.zzd listenersField;
                volatile Object valueField;
                volatile zze waitersField;

                abstract class zza {
                    public zza(zziu zziuVar) {
                    }

                    public abstract zzip.zzd zza(zziq zziqVar, zzip.zzd zzdVar);

                    public abstract zze zzb(zziq zziqVar, zze zzeVar);

                    public abstract void zzc(zze zzeVar, zze zzeVar2);

                    public abstract void zzd(zze zzeVar, Thread thread);

                    public abstract boolean zze(zziq zziqVar, zzip.zzd zzdVar, zzip.zzd zzdVar2);

                    public abstract boolean zzf(zziq zziqVar, Object obj, Object obj2);

                    public abstract boolean zzg(zziq zziqVar, zze zzeVar, zze zzeVar2);
                }

                static {
                    boolean z;
                    Throwable th;
                    Throwable th2;
                    zza zzcVar;
                    try {
/* 25 */                z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
                    } catch (SecurityException unused) {
/* 30 */                z = false;
                    }
/* 31 */            zzc = z;
/* 37 */            String property = System.getProperty("java.runtime.name", "");
/* 41 */            zziu zziuVar = null;
/* 42 */            if (property == null || property.contains("Android")) {
                        try {
/* 69 */                    zzcVar = new zzd(zziuVar);
                        } catch (Error | Exception e) {
                            try {
/* 77 */                        zzcVar = new zzb(zziuVar);
/* 80 */                        th = null;
/* 81 */                        th2 = e;
                            } catch (Error | Exception e2) {
/* 89 */                        th = e2;
/* 90 */                        th2 = e;
/* 86 */                        zzcVar = new zzc(zziuVar);
                            }
                        }
                    } else {
                        try {
/* 55 */                    zzcVar = new zzb(zziuVar);
                        } catch (NoClassDefFoundError unused2) {
/* 63 */                    zzcVar = new zzc(zziuVar);
                        }
                    }
/* 58 */            th = null;
/* 59 */            th2 = null;
/* 92 */            zzd = zzcVar;
/* 94 */            if (th != null) {
/* 96 */                zzjh zzjhVar = zzb;
/* 98 */                Logger loggerZza = zzjhVar.zza();
/* 102 */               Level level = Level.SEVERE;
/* 111 */               loggerZza.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
/* 124 */               zzjhVar.zza().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
                    }
                }

                private final void zza(zze zzeVar) {
/* 2 */             zzeVar.thread = null;
                    while (true) {
/* 4 */                 zze zzeVar2 = this.waitersField;
/* 8 */                 if (zzeVar2 != zze.zza) {
/* 10 */                    zze zzeVar3 = null;
/* 11 */                    while (zzeVar2 != null) {
/* 13 */                        zze zzeVar4 = zzeVar2.next;
/* 17 */                        if (zzeVar2.thread != null) {
/* 19 */                            zzeVar3 = zzeVar2;
                                } else if (zzeVar3 != null) {
/* 23 */                            zzeVar3.next = zzeVar4;
/* 27 */                            if (zzeVar3.thread == null) {
                                        break;
                                    }
                                } else if (!zzd.zzg(this, zzeVar2, zzeVar4)) {
                                    break;
                                }
/* 39 */                        zzeVar2 = zzeVar4;
                            }
/* 77 */                    return;
                        }
/* 77 */                return;
                    }
                }

                public static void zzk(zze zzeVar, Thread thread) {
/* 3 */             zzd.zzd(zzeVar, thread);
                }

                public static boolean zzn(zziq zziqVar, Object obj, Object obj2) {
/* 3 */             return zzd.zzf(zziqVar, obj, obj2);
                }

                public abstract void addListener(Runnable runnable, Executor executor);

                public final zzip.zzd zzh(zzip.zzd zzdVar) {
/* 3 */             return zzd.zza(this, zzdVar);
                }

                public final Object zzi() throws InterruptedException {
                    Object obj;
/* 6 */             if (Thread.interrupted()) {
/* 102 */               I000II.I00100l0();
/* 5 */                 return null;
                    }
/* 8 */             Object obj2 = this.valueField;
/* 22 */            if ((obj2 != null) && zzip.zze(obj2)) {
/* 24 */                return zzip.zza(obj2);
                    }
/* 29 */            zze zzeVar = this.waitersField;
/* 33 */            if (zzeVar != zze.zza) {
/* 37 */                zze zzeVar2 = new zze();
/* 90 */                do {
/* 40 */                    zza zzaVar = zzd;
/* 42 */                    zzaVar.zzc(zzeVar2, zzeVar);
/* 49 */                    if (zzaVar.zzg(this, zzeVar, zzeVar2)) {
/* 72 */                        do {
/* 51 */                            LockSupport.park(this);
/* 58 */                            if (Thread.interrupted()) {
/* 79 */                                zza(zzeVar2);
/* 82 */                                I000II.I00100l0();
/* 5 */                                 return null;
                                    }
/* 60 */                            obj = this.valueField;
/* 72 */                        } while (!((obj != null) & zzip.zze(obj)));
/* 74 */                        return zzip.zza(obj);
                            }
/* 86 */                    zzeVar = this.waitersField;
/* 90 */                } while (zzeVar != zze.zza);
                    }
/* 92 */            Object obj3 = this.valueField;
/* 94 */            Objects.requireNonNull(obj3);
/* 97 */            return zzip.zza(obj3);
                }

                public final Object zzj(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
                    long j2;
                    Object obj;
/* 7 */             long nanos = timeUnit.toNanos(j);
/* 15 */            if (Thread.interrupted()) {
/* 363 */               I000II.I00100l0();
/* 361 */               return null;
                    }
/* 17 */            Object obj2 = this.valueField;
/* 29 */            if ((obj2 != null) && zzip.zze(obj2)) {
/* 31 */                return zzip.zza(obj2);
                    }
/* 36 */            long j3 = 0;
/* 48 */            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
/* 53 */            if (nanos >= 1000) {
/* 55 */                zze zzeVar = this.waitersField;
/* 57 */                obj = null;
/* 61 */                if (zzeVar != zze.zza) {
/* 65 */                    zze zzeVar2 = new zze();
                            while (true) {
/* 68 */                        zza zzaVar = zzd;
/* 70 */                        zzaVar.zzc(zzeVar2, zzeVar);
/* 77 */                        if (zzaVar.zzg(this, zzeVar, zzeVar2)) {
/* 79 */                            j2 = j3;
/* 126 */                           do {
/* 90 */                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
/* 97 */                                if (Thread.interrupted()) {
/* 132 */                                   zza(zzeVar2);
/* 135 */                                   I000II.I00100l0();
/* 57 */                                    return null;
                                        }
/* 99 */                                Object obj3 = this.valueField;
/* 111 */                               if ((obj3 != null) && zzip.zze(obj3)) {
/* 113 */                                   return zzip.zza(obj3);
                                        }
/* 122 */                               nanos = jNanoTime - System.nanoTime();
/* 126 */                           } while (nanos >= 1000);
/* 128 */                           zza(zzeVar2);
                                } else {
/* 139 */                           long j4 = j3;
/* 141 */                           zze zzeVar3 = this.waitersField;
/* 145 */                           if (zzeVar3 == zze.zza) {
                                        break;
                                    }
/* 148 */                           zzeVar = zzeVar3;
/* 149 */                           j3 = j4;
                                }
                            }
                        }
/* 152 */               Object obj4 = this.valueField;
/* 154 */               Objects.requireNonNull(obj4);
/* 157 */               return zzip.zza(obj4);
                    }
/* 162 */           j2 = 0;
/* 164 */           obj = null;
/* 168 */           while (nanos > j2) {
/* 170 */               Object obj5 = this.valueField;
/* 182 */               if ((obj5 != null) && zzip.zze(obj5)) {
/* 184 */                   return zzip.zza(obj5);
                        }
/* 193 */               if (Thread.interrupted()) {
/* 202 */                   I000II.I00100l0();
/* 205 */                   return obj;
                        }
/* 199 */               nanos = jNanoTime - System.nanoTime();
                    }
/* 206 */           String string = toString();
/* 210 */           String string2 = timeUnit.toString();
/* 214 */           Locale locale = Locale.ROOT;
/* 216 */           String lowerCase = string2.toLowerCase(locale);
/* 246 */           String strConcat = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
/* 254 */           if (nanos + 1000 < j2) {
/* 258 */               String strConcat2 = strConcat.concat(" (plus ");
/* 262 */               long j5 = -nanos;
/* 265 */               long jConvert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
/* 273 */               long nanos2 = j5 - timeUnit.toNanos(jConvert);
/* 284 */               boolean z = jConvert == j2 || nanos2 > 1000;
/* 285 */               if (jConvert > j2) {
/* 301 */                   String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
/* 305 */                   if (z) {
/* 309 */                       strConcat3 = strConcat3.concat(",");
                            }
/* 313 */                   strConcat2 = strConcat3.concat(" ");
                        }
/* 317 */               if (z) {
/* 321 */                   strConcat2 = IlIi0I0.I000l1(nanos2, strConcat2, " nanoseconds ");
                        }
/* 327 */               strConcat = strConcat2.concat("delay)");
                    }
/* 335 */           if (isDone()) {
/* 348 */               throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
                    }
/* 360 */           throw new TimeoutException(IlIi0I0.I000lI(strConcat, " for ", string));
                }

                public final void zzl() {
/* 9 */             for (zze zzeVarZzb = zzd.zzb(this, zze.zza); zzeVarZzb != null; zzeVarZzb = zzeVarZzb.next) {
/* 11 */                Thread thread = zzeVarZzb.thread;
/* 13 */                if (thread != null) {
/* 16 */                    zzeVarZzb.thread = null;
/* 18 */                    LockSupport.unpark(thread);
                        }
                    }
                }

                public final boolean zzm(zzip.zzd zzdVar, zzip.zzd zzdVar2) {
/* 3 */             return zzd.zze(this, zzdVar, zzdVar2);
                }

/* 4 */         final class zzb extends zza {
                    private static final AtomicReferenceFieldUpdater<zze, Thread> zza = AtomicReferenceFieldUpdater.newUpdater(zze.class, Thread.class, "thread");
                    private static final AtomicReferenceFieldUpdater<zze, zze> zzb = AtomicReferenceFieldUpdater.newUpdater(zze.class, zze.class, "next");
                    private static final AtomicReferenceFieldUpdater<? super zziq<?>, zze> zzc = AtomicReferenceFieldUpdater.newUpdater(zziq.class, zze.class, "waitersField");
                    private static final AtomicReferenceFieldUpdater<? super zziq<?>, zzip.zzd> zzd = AtomicReferenceFieldUpdater.newUpdater(zziq.class, zzip.zzd.class, "listenersField");
                    private static final AtomicReferenceFieldUpdater<? super zziq<?>, Object> zze = AtomicReferenceFieldUpdater.newUpdater(zziq.class, Object.class, "valueField");

                    public zzb(zziu zziuVar) {
/* 2 */                 super(null);
                    }

                    @Override
                    public final zzip.zzd zza(zziq zziqVar, zzip.zzd zzdVar) {
/* 3 */                 return zzd.getAndSet(zziqVar, zzdVar);
                    }

                    @Override
                    public final zze zzb(zziq zziqVar, zze zzeVar) {
/* 3 */                 return zzc.getAndSet(zziqVar, zzeVar);
                    }

                    @Override
                    public final void zzc(zze zzeVar, zze zzeVar2) {
/* 3 */                 zzb.lazySet(zzeVar, zzeVar2);
                    }

                    @Override
                    public final void zzd(zze zzeVar, Thread thread) {
/* 3 */                 zza.lazySet(zzeVar, thread);
                    }

                    @Override
                    public final boolean zze(zziq zziqVar, zzip.zzd zzdVar, zzip.zzd zzdVar2) {
/* 3 */                 return zzir.zza(zzd, zziqVar, zzdVar, zzdVar2);
                    }

                    @Override
                    public final boolean zzf(zziq zziqVar, Object obj, Object obj2) {
/* 3 */                 return zzir.zza(zze, zziqVar, obj, obj2);
                    }

                    @Override
                    public final boolean zzg(zziq zziqVar, zze zzeVar, zze zzeVar2) {
/* 3 */                 return zzir.zza(zzc, zziqVar, zzeVar, zzeVar2);
                    }

/* 5 */             private zzb() {
/* 6 */                 throw null;
                    }
                }

/* 4 */         final class zzc extends zza {
                    public zzc(zziu zziuVar) {
/* 2 */                 super(null);
                    }

                    @Override
                    public final zzip.zzd zza(zziq zziqVar, zzip.zzd zzdVar) {
                        zzip.zzd zzdVar2;
                        synchronized (zziqVar) {
                            try {
/* 2 */                         zzdVar2 = zziqVar.listenersField;
/* 4 */                         if (zzdVar2 != zzdVar) {
/* 6 */                             zziqVar.listenersField = zzdVar;
                                }
                            } catch (Throwable th) {
/* 37 */                        throw th;
                            }
                        }
/* 12 */                return zzdVar2;
                    }

                    @Override
                    public final zze zzb(zziq zziqVar, zze zzeVar) {
                        zze zzeVar2;
                        synchronized (zziqVar) {
                            try {
/* 2 */                         zzeVar2 = zziqVar.waitersField;
/* 4 */                         if (zzeVar2 != zzeVar) {
/* 6 */                             zziqVar.waitersField = zzeVar;
                                }
                            } catch (Throwable th) {
/* 37 */                        throw th;
                            }
                        }
/* 12 */                return zzeVar2;
                    }

                    @Override
                    public final void zzc(zze zzeVar, zze zzeVar2) {
/* 1 */                 zzeVar.next = zzeVar2;
                    }

                    @Override
                    public final void zzd(zze zzeVar, Thread thread) {
/* 1 */                 zzeVar.thread = thread;
                    }

                    @Override
                    public final boolean zze(zziq zziqVar, zzip.zzd zzdVar, zzip.zzd zzdVar2) {
                        synchronized (zziqVar) {
                            try {
/* 4 */                         if (zziqVar.listenersField != zzdVar) {
/* 14 */                            return false;
                                }
/* 6 */                         zziqVar.listenersField = zzdVar2;
/* 9 */                         return true;
                            } catch (Throwable th) {
/* 98 */                        throw th;
                            }
                        }
                    }

                    @Override
                    public final boolean zzf(zziq zziqVar, Object obj, Object obj2) {
                        synchronized (zziqVar) {
                            try {
/* 4 */                         if (zziqVar.valueField != obj) {
/* 14 */                            return false;
                                }
/* 6 */                         zziqVar.valueField = obj2;
/* 9 */                         return true;
                            } catch (Throwable th) {
/* 98 */                        throw th;
                            }
                        }
                    }

                    @Override
                    public final boolean zzg(zziq zziqVar, zze zzeVar, zze zzeVar2) {
                        synchronized (zziqVar) {
                            try {
/* 4 */                         if (zziqVar.waitersField != zzeVar) {
/* 14 */                            return false;
                                }
/* 6 */                         zziqVar.waitersField = zzeVar2;
/* 9 */                         return true;
                            } catch (Throwable th) {
/* 98 */                        throw th;
                            }
                        }
                    }

/* 5 */             private zzc() {
/* 6 */                 throw null;
                    }
                }

/* 4 */         final class zzd extends zza {
                    static final Unsafe zza;
                    static final long zzb;
                    static final long zzc;
                    static final long zzd;
                    static final long zze;
                    static final long zzf;
                    public static final int zzg = 0;

                    static {
                        Unsafe unsafe;
                        try {
                            try {
/* 1 */                         unsafe = Unsafe.getUnsafe();
                            } catch (SecurityException unused) {
/* 15 */                        unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction() {
                                    @Override
                                    public final Object run() throws IllegalAccessException, SecurityException, IllegalArgumentException {
/* 1 */                                 int i = zziq.zzd.zzg;
/* 11 */                                for (Field field : Unsafe.class.getDeclaredFields()) {
/* 16 */                                    field.setAccessible(true);
/* 20 */                                    Object obj = field.get(null);
/* 28 */                                    if (Unsafe.class.isInstance(obj)) {
/* 34 */                                        return (Unsafe) Unsafe.class.cast(obj);
                                            }
                                        }
/* 55 */                                throw new NoSuchFieldError("the Unsafe");
                                    }
                                });
                            }
                            try {
/* 29 */                        zzc = unsafe.objectFieldOffset(zziq.class.getDeclaredField("waitersField"));
/* 41 */                        zzb = unsafe.objectFieldOffset(zziq.class.getDeclaredField("listenersField"));
/* 53 */                        zzd = unsafe.objectFieldOffset(zziq.class.getDeclaredField("valueField"));
/* 67 */                        zze = unsafe.objectFieldOffset(zze.class.getDeclaredField("thread"));
/* 79 */                        zzf = unsafe.objectFieldOffset(zze.class.getDeclaredField("next"));
/* 81 */                        zza = unsafe;
                            } catch (NoSuchFieldException e) {
/* 85 */                        IioIoO10iOiI.I000lI(e);
                            }
                        } catch (PrivilegedActionException e2) {
/* 96 */                    OIiilo1Ool0o.I000iOII("Could not initialize intrinsics", e2.getCause());
                        }
                    }

                    public zzd(zziu zziuVar) {
/* 2 */                 super(null);
                    }

                    @Override
                    public final zzip.zzd zza(zziq zziqVar, zzip.zzd zzdVar) {
                        zzip.zzd zzdVar2;
/* 10 */                do {
/* 1 */                     zzdVar2 = zziqVar.listenersField;
/* 3 */                     if (zzdVar == zzdVar2) {
                                break;
                            }
/* 10 */                } while (!zze(zziqVar, zzdVar2, zzdVar));
/* 37 */                return zzdVar2;
                    }

                    @Override
                    public final zze zzb(zziq zziqVar, zze zzeVar) {
                        zze zzeVar2;
/* 10 */                do {
/* 1 */                     zzeVar2 = zziqVar.waitersField;
/* 3 */                     if (zzeVar == zzeVar2) {
                                break;
                            }
/* 10 */                } while (!zzg(zziqVar, zzeVar2, zzeVar));
/* 37 */                return zzeVar2;
                    }

                    @Override
                    public final void zzc(zze zzeVar, zze zzeVar2) {
/* 5 */                 zza.putObject(zzeVar, zzf, zzeVar2);
                    }

                    @Override
                    public final void zzd(zze zzeVar, Thread thread) {
/* 5 */                 zza.putObject(zzeVar, zze, thread);
                    }

                    @Override
                    public final boolean zze(zziq zziqVar, zzip.zzd zzdVar, zzip.zzd zzdVar2) {
/* 8 */                 return zzis.zza(zza, zziqVar, zzb, zzdVar, zzdVar2);
                    }

                    @Override
                    public final boolean zzf(zziq zziqVar, Object obj, Object obj2) {
/* 8 */                 return zzis.zza(zza, zziqVar, zzd, obj, obj2);
                    }

                    @Override
                    public final boolean zzg(zziq zziqVar, zze zzeVar, zze zzeVar2) {
/* 8 */                 return zzis.zza(zza, zziqVar, zzc, zzeVar, zzeVar2);
                    }

/* 5 */             private zzd() {
/* 6 */                 throw null;
                    }
                }

/* 10 */        final class zze {
                    static final zze zza = new zze(false);
                    volatile zze next;
                    volatile Thread thread;

                    public zze() {
/* 8 */                 zziq.zzk(this, Thread.currentThread());
                    }

/* 11 */            public zze(boolean z) {
                    }
                }
            }

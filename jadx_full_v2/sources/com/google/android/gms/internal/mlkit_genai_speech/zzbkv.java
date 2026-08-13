            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.lang.reflect.Constructor;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            import p000.IioIoO10iOiI;
            
            public final class zzbkv implements zzbht {
                private static final Logger zza = Logger.getLogger(zzbkv.class.getName());
                private static final Constructor zzb;
                private static final Method zzc;
                private static final RuntimeException zzd;
                private static final Object[] zze;
                private final Object zzf;

                /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
                static {
                    Throwable th;
                    Method method;
                    Method method2;
                    Constructor<?> constructor;
                    Class<?> cls;
                    try {
/* 16 */                cls = Class.forName("java.util.concurrent.atomic.LongAdder");
/* 28 */                method2 = cls.getMethod("add", Long.TYPE);
                    } catch (Throwable th2) {
/* 67 */                th = th2;
/* 68 */                method = null;
                    }
                    try {
/* 34 */                cls.getMethod("sum", null);
/* 37 */                Constructor<?>[] constructors = cls.getConstructors();
/* 41 */                int length = constructors.length;
/* 42 */                int i = 0;
                        while (true) {
/* 43 */                    if (i >= length) {
/* 60 */                        constructor = null;
                                break;
                            }
/* 45 */                    constructor = constructors[i];
/* 52 */                    if (constructor.getParameterTypes().length == 0) {
                                break;
                            } else {
/* 55 */                        i++;
                            }
                        }
/* 61 */                th = null;
                    } catch (Throwable th3) {
/* 63 */                th = th3;
/* 64 */                method = method2;
/* 79 */                zza.logp(Level.FINE, "io.grpc.internal.ReflectionLongAdderCounter", "<clinit>", "LongAdder can not be found via reflection, this is normal for JDK7 and below", th);
/* 82 */                method2 = method;
/* 83 */                constructor = null;
/* 84 */                if (th == null) {
/* 95 */                    zzb = null;
/* 97 */                    zzc = null;
/* 104 */                   zzd = new RuntimeException(th);
                        }
/* 116 */               zze = new Object[]{1L};
                    }
/* 84 */            if (th == null || constructor == null) {
/* 95 */                zzb = null;
/* 97 */                zzc = null;
/* 104 */               zzd = new RuntimeException(th);
                    } else {
/* 88 */                zzb = constructor;
/* 90 */                zzc = method2;
/* 92 */                zzd = null;
                    }
/* 116 */           zze = new Object[]{1L};
                }

                public zzbkv() {
/* 4 */             RuntimeException runtimeException = zzd;
/* 6 */             if (runtimeException != null) {
/* 55 */                throw runtimeException;
                    }
                    try {
/* 15 */                this.zzf = zzb.newInstance(null);
                    } catch (IllegalAccessException e) {
/* 28 */                IioIoO10iOiI.I000lI(e);
/* 31 */                throw null;
                    } catch (InstantiationException e2) {
/* 32 */                IioIoO10iOiI.I000lI(e2);
/* 35 */                throw null;
                    } catch (InvocationTargetException e3) {
/* 24 */                IioIoO10iOiI.I000lI(e3);
/* 27 */                throw null;
                    }
                }

                public static boolean zzb() {
                    return zzd == null;
                }

                @Override
                public final void zza(long j) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                    try {
/* 7 */                 zzc.invoke(this.zzf, zze);
                    } catch (IllegalAccessException e) {
/* 17 */                IioIoO10iOiI.I000lI(e);
                    } catch (InvocationTargetException e2) {
/* 12 */                IioIoO10iOiI.I000lI(e2);
                    }
                }
            }

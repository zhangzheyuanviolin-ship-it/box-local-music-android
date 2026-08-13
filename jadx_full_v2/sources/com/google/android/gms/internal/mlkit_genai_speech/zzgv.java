            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            
            public final class zzgv {
                public static final int zza = 0;
                private static final Object zzb;

                static {
/* 1 */             Object objZza = zza();
/* 5 */             zzb = objZza;
/* 7 */             if (objZza != null) {
/* 19 */                zzb("getStackTraceElement", Throwable.class, Integer.TYPE);
                    }
/* 22 */            if (objZza == null) {
/* 24 */                return;
                    }
/* 25 */            zzc(objZza);
                }

                private static Object zza() {
                    try {
/* 15 */                return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
                    } catch (ThreadDeath e) {
/* 55 */                throw e;
                    } catch (Throwable unused) {
/* 1 */                 return null;
                    }
                }

                private static Method zzb(String str, Class... clsArr) {
                    try {
/* 9 */                 return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
                    } catch (ThreadDeath e) {
/* 37 */                throw e;
                    } catch (Throwable unused) {
/* 1 */                 return null;
                    }
                }

                private static Method zzc(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                    try {
/* 10 */                Method methodZzb = zzb("getStackTraceDepth", Throwable.class);
/* 14 */                if (methodZzb == null) {
/* 1 */                     return null;
                        }
/* 26 */                methodZzb.invoke(obj, new Throwable());
/* 29 */                return methodZzb;
                    } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
/* 1 */                 return null;
                    }
                }
            }

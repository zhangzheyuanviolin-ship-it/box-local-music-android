            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzbom {
                public static final int zza = 0;

                static {
                    Object obj;
                    Class<?> cls;
                    zzbok zzbokVar;
                    try {
/* 4 */                 cls = Class.forName("io.perfmark.impl.SecretPerfMarkImpl$PerfMarkImpl");
/* 8 */                 obj = null;
                    } catch (Throwable th) {
/* 11 */                obj = th;
/* 12 */                cls = null;
                    }
/* 13 */            if (cls != null) {
                        try {
/* 41 */                    zzbokVar = (zzbok) cls.asSubclass(zzbok.class).getConstructor(zzbon.class).newInstance(zzbok.zza);
                        } catch (Throwable th2) {
/* 45 */                    obj = th2;
                        }
                    } else {
/* 46 */                zzbokVar = null;
                    }
/* 47 */            if (zzbokVar == null) {
/* 53 */                new zzbok(zzbok.zza);
                    }
/* 56 */            if (obj != null) {
                        try {
/* 64 */                    if (Boolean.getBoolean("io.perfmark.PerfMark.debug")) {
/* 68 */                        Class<?> cls2 = Class.forName("java.util.logging.Logger");
/* 94 */                        Object objInvoke = cls2.getMethod("getLogger", String.class).invoke(null, zzbom.class.getName());
/* 100 */                       Class<?> cls3 = Class.forName("java.util.logging.Level");
/* 132 */                       cls2.getMethod("log", cls3, String.class, Throwable.class).invoke(objInvoke, cls3.getField("FINE").get(null), "Error during PerfMark.<clinit>", obj);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }

                private zzbom() {
                }

                public static zzbol zza() {
/* 1 */             return zzbok.zzb;
                }
            }

            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.logging.Logger;
            
            final class zzjh {
                private final zzha zza = new zzha();
                private final String zzb;
                private volatile Logger zzc;

                public zzjh(Class cls) {
/* 15 */            this.zzb = cls.getName();
                }

                public final Logger zza() {
/* 1 */             Logger logger = this.zzc;
/* 3 */             if (logger != null) {
/* 5 */                 return logger;
                    }
                    synchronized (this.zza) {
                        try {
/* 9 */                     Logger logger2 = this.zzc;
/* 11 */                    if (logger2 != null) {
/* 14 */                        return logger2;
                            }
/* 19 */                    Logger logger3 = Logger.getLogger(this.zzb);
/* 23 */                    this.zzc = logger3;
/* 26 */                    return logger3;
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
                }
            }

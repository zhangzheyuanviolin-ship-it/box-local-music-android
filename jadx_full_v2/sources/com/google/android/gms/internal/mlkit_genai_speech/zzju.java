            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzju implements zzkh {
                private static final Object zza = new Object();
                private volatile Object zzb = zza;
                private volatile zzkh zzc;

                public zzju(zzkh zzkhVar) {
/* 8 */             this.zzc = zzkhVar;
                }

                @Override
                public final Object zza() {
                    Object objZza;
/* 1 */             Object obj = this.zzb;
/* 3 */             Object obj2 = zza;
/* 5 */             if (obj != obj2) {
/* 55 */                return obj;
                    }
                    synchronized (this) {
                        try {
/* 8 */                     objZza = this.zzb;
/* 10 */                    if (objZza == obj2) {
/* 14 */                        objZza = this.zzc.zza();
/* 18 */                        this.zzb = objZza;
/* 21 */                        this.zzc = null;
                            }
                        } catch (Throwable th) {
/* 29 */                    throw th;
                        }
                    }
/* 27 */            return objZza;
                }
            }

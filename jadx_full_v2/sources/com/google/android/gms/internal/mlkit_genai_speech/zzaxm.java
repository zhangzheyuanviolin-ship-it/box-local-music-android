            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.io.InputStream;
            
            final class zzaxm {
                private final zzaxj zza;
                private final Object zzb;
                private volatile byte[] zzc;

                public zzaxm(zzaxj zzaxjVar, Object obj) {
/* 4 */             this.zza = zzaxjVar;
/* 6 */             this.zzb = obj;
                }

                public final InputStream zza() {
/* 5 */             return this.zza.zza(this.zzb);
                }

                public final byte[] zzb() {
/* 3 */             if (this.zzc == null) {
                        synchronized (this) {
                            try {
/* 8 */                         if (this.zzc == null) {
/* 18 */                            this.zzc = zzaxq.zzg(zza());
                                }
                            } finally {
                            }
                        }
                    }
/* 27 */            return this.zzc;
                }
            }

            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.concurrent.Future;
            
            final class zzblt {
                final Object zza;
                Future zzb;
                boolean zzc;

                public zzblt(Object obj) {
/* 4 */             this.zza = obj;
                }

                public final Future zza() {
/* 2 */             this.zzc = true;
/* 4 */             return this.zzb;
                }

                public final void zzb(Future future) {
                    boolean z;
                    synchronized (this.zza) {
                        try {
/* 4 */                     z = this.zzc;
/* 6 */                     if (!z) {
/* 8 */                         this.zzb = future;
                            }
                        } catch (Throwable th) {
/* 29 */                    throw th;
                        }
                    }
/* 14 */            if (z) {
/* 17 */                future.cancel(false);
                    }
                }
            }

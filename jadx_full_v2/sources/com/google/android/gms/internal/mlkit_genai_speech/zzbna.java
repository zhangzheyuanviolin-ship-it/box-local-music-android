            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.IdentityHashMap;
            import java.util.Objects;
            
            final class zzbna implements Runnable {
                final zzbnb zza;
                final zzbnc zzb;
                final Object zzc;
                final zzbnd zzd;

                public zzbna(zzbnd zzbndVar, zzbnb zzbnbVar, zzbnc zzbncVar, Object obj) {
/* 1 */             this.zza = zzbnbVar;
/* 3 */             this.zzb = zzbncVar;
/* 5 */             this.zzc = obj;
/* 7 */             Objects.requireNonNull(zzbndVar);
/* 10 */            this.zzd = zzbndVar;
                }

                @Override
                public final void run() {
/* 1 */             zzbnd zzbndVar = this.zzd;
                    synchronized (zzbndVar) {
                        try {
/* 8 */                     if (this.zza.zzb == 0) {
/* 1 */                         IdentityHashMap identityHashMap = zzbndVar.zzb;
/* 14 */                        zzbnc zzbncVar = this.zzb;
/* 16 */                        identityHashMap.remove(zzbncVar);
/* 27 */                        if (zzbndVar.zzb.isEmpty()) {
/* 33 */                            zzbndVar.zzc.shutdown();
/* 2 */                             zzbndVar.zzc = null;
                                }
/* 46 */                        zzbncVar.zzb(this.zzc);
                            }
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
                }
            }

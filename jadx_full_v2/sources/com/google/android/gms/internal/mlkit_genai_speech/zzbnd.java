            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.IdentityHashMap;
            import java.util.concurrent.Executors;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.ScheduledFuture;
            import java.util.concurrent.TimeUnit;
            
            public final class zzbnd {
                private static final zzbnd zza = new zzbnd(new zzbmz());
                private final IdentityHashMap zzb = new IdentityHashMap();
                private ScheduledExecutorService zzc;

                public zzbnd(zzbmz zzbmzVar) {
                }

                public static Object zza(zzbnc zzbncVar) {
/* 3 */             return zza.zzb(zzbncVar);
                }

                public static Object zzc(zzbnc zzbncVar, Object obj) {
/* 3 */             zza.zzd(zzbncVar, obj);
/* 6 */             return null;
                }

                public final synchronized Object zzb(zzbnc zzbncVar) {
                    zzbnb zzbnbVar;
                    try {
/* 2 */                 IdentityHashMap identityHashMap = this.zzb;
/* 8 */                 zzbnbVar = (zzbnb) identityHashMap.get(zzbncVar);
/* 10 */                if (zzbnbVar == null) {
/* 18 */                    zzbnbVar = new zzbnb(zzbncVar.zza());
/* 21 */                    identityHashMap.put(zzbncVar, zzbnbVar);
                        }
/* 27 */                ScheduledFuture scheduledFuture = zzbnbVar.zzc;
/* 29 */                if (scheduledFuture != null) {
/* 32 */                    scheduledFuture.cancel(false);
/* 36 */                    zzbnbVar.zzc = null;
                        }
                        zzbnbVar.zzb++;
                    } catch (Throwable th) {
/* 77 */                throw th;
                    }
/* 44 */            return zzbnbVar.zza;
                }

                public final synchronized Object zzd(zzbnc zzbncVar, Object obj) {
                    try {
/* 8 */                 zzbnb zzbnbVar = (zzbnb) this.zzb.get(zzbncVar);
/* 10 */                if (zzbnbVar == null) {
/* 113 */                   throw new IllegalArgumentException("No cached instance found for ".concat(String.valueOf(zzbncVar)));
                        }
/* 23 */                zzgo.zzf(obj == zzbnbVar.zza, "Releasing the wrong instance");
/* 35 */                zzgo.zzn(zzbnbVar.zzb > 0, "Refcount has already reached zero");
                        int i = zzbnbVar.zzb - 1;
/* 42 */                zzbnbVar.zzb = i;
/* 44 */                if (i == 0) {
/* 53 */                    zzgo.zzn(zzbnbVar.zzc == null, "Destroy task already scheduled");
/* 56 */                    ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = this.zzc;
/* 58 */                    if (scheduledExecutorServiceNewSingleThreadScheduledExecutor == null) {
/* 66 */                        scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(zzbgr.zzc("grpc-shared-destroyer-%d", true));
/* 70 */                        this.zzc = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
                            }
/* 93 */                    zzbnbVar.zzc = scheduledExecutorServiceNewSingleThreadScheduledExecutor.schedule(new zzbhs(new zzbna(this, zzbnbVar, zzbncVar, obj)), 1L, TimeUnit.SECONDS);
                        }
                    } catch (Throwable th) {
/* 332 */               throw th;
                    }
/* 96 */            return null;
                }
            }

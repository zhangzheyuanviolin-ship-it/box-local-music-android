            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.lang.ref.ReferenceQueue;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.ConcurrentMap;
            import java.util.logging.Logger;
            
            final class zzbjl extends zzbgh {
                private static final ReferenceQueue zza = new ReferenceQueue();
                private static final ConcurrentMap zzb = new ConcurrentHashMap();
                private static final Logger zzc = Logger.getLogger(zzbjl.class.getName());
                private final zzbjk zzd;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzbjl(zzaxd zzaxdVar) {
/* 5 */             super(zzaxdVar);
/* 1 */             ReferenceQueue referenceQueue = zza;
/* 3 */             ConcurrentMap concurrentMap = zzb;
/* 13 */            this.zzd = new zzbjk(this, zzaxdVar, referenceQueue, concurrentMap);
                }

                @Override
                public final zzaxd zzd() {
/* 3 */             zzbjk.zzb(this.zzd);
/* 6 */             return super.zzd();
                }
            }

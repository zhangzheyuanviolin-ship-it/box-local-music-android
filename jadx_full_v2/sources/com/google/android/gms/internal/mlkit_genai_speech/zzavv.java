            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.ConcurrentMap;
            import java.util.concurrent.ConcurrentNavigableMap;
            import java.util.concurrent.ConcurrentSkipListMap;
            import java.util.logging.Logger;
            
            public final class zzavv {
                private static final zzavv zza;
                private final ConcurrentNavigableMap zzb;
                private final ConcurrentMap zzc;
                private final ConcurrentMap zzd;

                static {
/* 7 */             Logger.getLogger(zzavv.class.getName());
/* 15 */            zza = new zzavv();
                }

                public zzavv() {
/* 6 */             new ConcurrentSkipListMap();
/* 14 */            this.zzb = new ConcurrentSkipListMap();
/* 21 */            this.zzc = new ConcurrentHashMap();
/* 28 */            this.zzd = new ConcurrentHashMap();
/* 32 */            new ConcurrentHashMap();
                }

                public static zzavv zza() {
/* 1 */             return zza;
                }

                private static void zzh(Map map, zzawc zzawcVar) {
                }

                private static void zzi(Map map, zzawc zzawcVar) {
                }

                public final void zzb(zzawc zzawcVar) {
/* 3 */             zzh(this.zzd, zzawcVar);
                }

                public final void zzc(zzawc zzawcVar) {
/* 3 */             zzh(this.zzb, zzawcVar);
                }

                public final void zzd(zzawc zzawcVar) {
/* 3 */             zzh(this.zzc, zzawcVar);
                }

                public final void zze(zzawc zzawcVar) {
/* 3 */             zzi(this.zzd, zzawcVar);
                }

                public final void zzf(zzawc zzawcVar) {
/* 3 */             zzi(this.zzb, zzawcVar);
                }

                public final void zzg(zzawc zzawcVar) {
/* 3 */             zzi(this.zzc, zzawcVar);
                }
            }

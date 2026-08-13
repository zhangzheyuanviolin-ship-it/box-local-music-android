            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.IdentityHashMap;
            import java.util.concurrent.Executor;
            import java.util.concurrent.ScheduledExecutorService;
            import p000.I000II;
            
            public final class zzayd {
                private final int zza;
                private final zzayu zzb;
                private final zzazm zzc;
                private final zzayj zzd;
                private final ScheduledExecutorService zze;
                private final zzauc zzf;
                private final Executor zzg;
                private final zzaxz zzh;
                private final zzayq zzi;
                private final IdentityHashMap zzj;

                public zzayd(zzayb zzaybVar, zzayk zzaykVar) {
/* 1 */             Integer num = zzaybVar.zza;
/* 10 */            zzgo.zzc(num, "defaultPort not set");
/* 17 */            this.zza = num.intValue();
/* 1 */             zzayu zzayuVar = zzaybVar.zzb;
/* 25 */            zzgo.zzc(zzayuVar, "proxyDetector not set");
/* 28 */            this.zzb = zzayuVar;
/* 1 */             zzazm zzazmVar = zzaybVar.zzc;
/* 36 */            zzgo.zzc(zzazmVar, "syncContext not set");
/* 39 */            this.zzc = zzazmVar;
/* 1 */             zzayj zzayjVar = zzaybVar.zzd;
/* 47 */            zzgo.zzc(zzayjVar, "serviceConfigParser not set");
/* 50 */            this.zzd = zzayjVar;
/* 56 */            this.zze = zzaybVar.zze;
/* 62 */            this.zzf = zzaybVar.zzf;
/* 68 */            this.zzg = zzaybVar.zzg;
/* 74 */            this.zzh = zzaybVar.zzh;
/* 80 */            this.zzi = zzaybVar.zzi;
/* 1 */             IdentityHashMap identityHashMap = zzaybVar.zzj;
/* 95 */            this.zzj = identityHashMap != null ? new IdentityHashMap(identityHashMap) : null;
                }

                public static zzayb zzb() {
/* 3 */             return new zzayb();
                }

                public final String toString() {
/* 1 */             zzgk zzgkVarZzb = zzgm.zzb(this);
/* 9 */             zzgkVarZzb.zzb("defaultPort", this.zza);
/* 16 */            zzgkVarZzb.zzd("proxyDetector", this.zzb);
/* 23 */            zzgkVarZzb.zzd("syncContext", this.zzc);
/* 30 */            zzgkVarZzb.zzd("serviceConfigParser", this.zzd);
/* 37 */            zzgkVarZzb.zzd("customArgs", this.zzj);
/* 44 */            zzgkVarZzb.zzd("scheduledExecutorService", this.zze);
/* 51 */            zzgkVarZzb.zzd("channelLogger", this.zzf);
/* 58 */            zzgkVarZzb.zzd("executor", this.zzg);
/* 64 */            zzgkVarZzb.zzd("overrideAuthority", null);
/* 71 */            zzgkVarZzb.zzd("metricRecorder", this.zzh);
/* 78 */            zzgkVarZzb.zzd("nameResolverRegistry", this.zzi);
/* 81 */            return zzgkVarZzb.toString();
                }

                public final int zza() {
/* 1 */             return this.zza;
                }

                public final zzayj zzc() {
/* 1 */             return this.zzd;
                }

                public final zzayu zzd() {
/* 1 */             return this.zzb;
                }

                public final zzazm zze() {
/* 1 */             return this.zzc;
                }

                public final Object zzf(zzayc zzaycVar) {
/* 1 */             IdentityHashMap identityHashMap = this.zzj;
/* 3 */             if (identityHashMap != null) {
/* 5 */                 return identityHashMap.get(zzaycVar);
                    }
/* 10 */            return null;
                }

                public final Executor zzg() {
/* 1 */             return this.zzg;
                }

                public final ScheduledExecutorService zzh() {
/* 1 */             ScheduledExecutorService scheduledExecutorService = this.zze;
/* 3 */             if (scheduledExecutorService != null) {
/* 5 */                 return scheduledExecutorService;
                    }
/* 8 */             I000II.I001IO000("ScheduledExecutorService not set in Builder");
/* 11 */            return null;
                }
            }

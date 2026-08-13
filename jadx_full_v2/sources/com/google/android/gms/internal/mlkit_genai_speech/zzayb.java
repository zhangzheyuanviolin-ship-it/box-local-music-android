            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.IdentityHashMap;
            import java.util.concurrent.Executor;
            import java.util.concurrent.ScheduledExecutorService;
            
            public final class zzayb {
                private Integer zza;
                private zzayu zzb;
                private zzazm zzc;
                private zzayj zzd;
                private ScheduledExecutorService zze;
                private zzauc zzf;
                private Executor zzg;
                private zzaxz zzh;
                private zzayq zzi;
                private IdentityHashMap zzj;

                public final zzayb zzc(zzayc zzaycVar, Object obj) {
/* 3 */             zzgo.zzc(zzaycVar, "key");
/* 8 */             zzgo.zzc(obj, "value");
/* 11 */            IdentityHashMap identityHashMap = this.zzj;
/* 13 */            if (identityHashMap == null) {
/* 17 */                identityHashMap = new IdentityHashMap();
/* 20 */                this.zzj = identityHashMap;
                    }
/* 22 */            identityHashMap.put(zzaycVar, obj);
/* 37 */            return this;
                }

                public final zzayb zzd(zzauc zzaucVar) {
/* 1 */             zzaucVar.getClass();
/* 4 */             this.zzf = zzaucVar;
/* 29 */            return this;
                }

                public final zzayb zze(int i) {
/* 7 */             this.zza = 443;
/* 29 */            return this;
                }

                public final zzayb zzf(zzaxz zzaxzVar) {
/* 1 */             this.zzh = zzaxzVar;
/* 29 */            return this;
                }

                public final zzayb zzg(zzayq zzayqVar) {
/* 1 */             this.zzi = zzayqVar;
/* 29 */            return this;
                }

                public final zzayb zzh(Executor executor) {
/* 1 */             this.zzg = executor;
/* 29 */            return this;
                }

                public final zzayb zzi(zzayu zzayuVar) {
/* 1 */             zzayuVar.getClass();
/* 4 */             this.zzb = zzayuVar;
/* 29 */            return this;
                }

                public final zzayb zzj(ScheduledExecutorService scheduledExecutorService) {
/* 1 */             scheduledExecutorService.getClass();
/* 4 */             this.zze = scheduledExecutorService;
/* 29 */            return this;
                }

                public final zzayb zzk(zzayj zzayjVar) {
/* 1 */             this.zzd = zzayjVar;
/* 29 */            return this;
                }

                public final zzayb zzl(zzazm zzazmVar) {
/* 1 */             zzazmVar.getClass();
/* 4 */             this.zzc = zzazmVar;
/* 29 */            return this;
                }

                public final zzayd zzm() {
/* 4 */             return new zzayd(this, null);
                }
            }

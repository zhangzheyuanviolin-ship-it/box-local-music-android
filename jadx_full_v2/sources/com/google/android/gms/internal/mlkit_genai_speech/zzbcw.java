            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.TimeUnit;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            
            final class zzbcw implements zzbml {
                private static final Logger zza = Logger.getLogger(zzbcw.class.getName());
                private final ScheduledExecutorService zzb;
                private final zzazm zzc;
                private zzazk zzd;
                private zzbga zze;

                public zzbcw(zzbfz zzbfzVar, ScheduledExecutorService scheduledExecutorService, zzazm zzazmVar) {
/* 4 */             this.zzb = scheduledExecutorService;
/* 6 */             this.zzc = zzazmVar;
                }

                public static void zza(zzbcw zzbcwVar) {
/* 1 */             zzazk zzazkVar = zzbcwVar.zzd;
/* 3 */             if (zzazkVar != null && zzazkVar.zzb()) {
/* 11 */                zzazkVar.zza();
                    }
/* 15 */            zzbcwVar.zze = null;
                }

                @Override
                public final void zzb() {
/* 1 */             zzazm zzazmVar = this.zzc;
/* 3 */             zzazmVar.zzd();
/* 11 */            zzazmVar.zzc(new Runnable() {
                        @Override
                        public final void run() {
/* 3 */                     zzbcw.zza(this.zza);
                        }
                    });
/* 14 */            zzazmVar.zzb();
                }

                @Override
                public final void zzc(Runnable runnable) {
/* 1 */             zzazm zzazmVar = this.zzc;
/* 3 */             zzazmVar.zzd();
/* 8 */             if (this.zze == null) {
/* 15 */                this.zze = new zzbga();
                    }
/* 17 */            zzazk zzazkVar = this.zzd;
/* 19 */            if (zzazkVar == null || !zzazkVar.zzb()) {
/* 30 */                long jZza = this.zze.zza();
/* 43 */                this.zzd = zzazmVar.zza(runnable, jZza, TimeUnit.NANOSECONDS, this.zzb);
/* 59 */                zza.logp(Level.FINE, "io.grpc.internal.BackoffPolicyRetryScheduler", "schedule", "Scheduling DNS resolution backoff for {0}ns", Long.valueOf(jZza));
                    }
                }
            }

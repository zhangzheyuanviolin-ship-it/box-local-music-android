            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Locale;
            import java.util.Objects;
            import java.util.concurrent.ScheduledFuture;
            import java.util.concurrent.TimeUnit;
            
            final class zzbdd implements Runnable, zzaux {
                final zzbdj zza;
                private final boolean zzb;
                private final boolean zzc;
                private final long zzd;
                private volatile ScheduledFuture zze;
                private volatile boolean zzf;

                public zzbdd(zzbdj zzbdjVar, zzavf zzavfVar, boolean z) {
/* 1 */             Objects.requireNonNull(zzbdjVar);
/* 4 */             this.zza = zzbdjVar;
/* 9 */             this.zzb = z;
/* 11 */            if (zzavfVar == null) {
/* 14 */                this.zzc = false;
/* 18 */                this.zzd = 0L;
                    } else {
/* 22 */                this.zzc = true;
/* 30 */                this.zzd = zzavfVar.zzb(TimeUnit.NANOSECONDS);
                    }
                }

                @Override
                public final void run() {
/* 11 */            this.zza.zzk.zzb(zzb());
                }

                public final zzazd zzb() {
/* 1 */             long j = this.zzd;
/* 10 */            long jAbs = Math.abs(j) / 1000000000;
/* 15 */            long jAbs2 = Math.abs(j) % 1000000000;
/* 28 */            StringBuilder sb = new StringBuilder(true != this.zzb ? "CallOptions" : "Context");
/* 33 */            sb.append(" deadline exceeded after ");
/* 40 */            if (j < 0) {
/* 44 */                sb.append('-');
                    }
/* 47 */            sb.append(jAbs);
/* 50 */            Locale locale = Locale.US;
/* 66 */            sb.append(String.format(locale, ".%09d", Long.valueOf(jAbs2)));
/* 71 */            sb.append("s. ");
/* 74 */            zzbdj zzbdjVar = this.zza;
/* 117 */           sb.append(String.format(locale, "Name resolution delay %.9f seconds.", Double.valueOf(((Long) zzbdjVar.zzj.zzl(zzaum.zza)) == null ? 0.0d : r1.longValue() / zzbdj.zzb)));
/* 124 */           if (zzbdjVar.zzk != null) {
/* 128 */               zzbgu zzbguVar = new zzbgu();
/* 135 */               zzbdjVar.zzk.zza(zzbguVar);
/* 140 */               sb.append(" ");
/* 143 */               sb.append(zzbguVar);
                    }
/* 152 */           return zzazd.zzd.zze(sb.toString());
                }

                public final void zzc() {
/* 3 */             if (this.zzf) {
/* 110 */               return;
                    }
/* 8 */             if (this.zzc && !this.zzb) {
/* 14 */                zzbdj zzbdjVar = this.zza;
/* 20 */                if (zzbdjVar.zzn != null) {
/* 39 */                    this.zze = zzbdjVar.zzn.schedule(new zzbhs(this), this.zzd, TimeUnit.NANOSECONDS);
                        }
                    }
/* 51 */            this.zza.zzg.zze(this, zzji.zza());
/* 56 */            if (this.zzf) {
/* 58 */                zzd();
                    }
                }

                public final void zzd() {
/* 2 */             this.zzf = true;
/* 4 */             ScheduledFuture scheduledFuture = this.zze;
/* 6 */             if (scheduledFuture != null) {
/* 9 */                 scheduledFuture.cancel(false);
                    }
                }
            }

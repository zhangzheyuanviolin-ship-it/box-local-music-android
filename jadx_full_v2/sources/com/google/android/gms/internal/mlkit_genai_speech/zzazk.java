            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.concurrent.ScheduledFuture;
            
            public final class zzazk {
                private final zzazj zza;
                private final ScheduledFuture zzb;

                public zzazk(zzazj zzazjVar, ScheduledFuture scheduledFuture, zzazl zzazlVar) {
/* 4 */             this.zza = zzazjVar;
/* 8 */             zzgo.zzc(scheduledFuture, "future");
/* 11 */            this.zzb = scheduledFuture;
                }

                public final void zza() {
/* 4 */             this.zza.zzb = true;
/* 9 */             this.zzb.cancel(false);
                }

                public final boolean zzb() {
/* 1 */             zzazj zzazjVar = this.zza;
                    return (zzazjVar.zzc || zzazjVar.zzb) ? false : true;
                }
            }

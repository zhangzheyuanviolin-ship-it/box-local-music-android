            package com.google.android.gms.internal.mlkit_genai_speech;

            import android.content.BroadcastReceiver;
            import android.content.Context;
            import android.content.Intent;
            import java.util.Objects;
            import java.util.concurrent.Executor;
            
            final class zzbbj extends BroadcastReceiver {
                final zzbbk zza;

                public zzbbj(zzbbk zzbbkVar) {
/* 1 */             Objects.requireNonNull(zzbbkVar);
/* 4 */             this.zza = zzbbkVar;
                }

                @Override
                public final void onReceive(Context context, Intent intent) {
/* 1 */             final zzbbk zzbbkVar = this.zza;
/* 1 */             zzazm zzazmVar = zzbbkVar.zzh;
/* 7 */             Objects.requireNonNull(zzbbkVar);
/* 15 */            zzazmVar.zzc(new Runnable() {
                        @Override
                        public final void run() {
/* 1 */                     zzbbkVar.zzm();
                        }
                    });
/* 1 */             Executor executor = zzbbkVar.zzf;
/* 1 */             final zzazm zzazmVar2 = zzbbkVar.zzh;
/* 26 */            Objects.requireNonNull(zzazmVar2);
/* 34 */            executor.execute(new Runnable() {
                        @Override
                        public final void run() {
/* 3 */                     zzazmVar2.zzb();
                        }
                    });
                }
            }

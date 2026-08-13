            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            
            final class zzbeo implements Runnable {
                final zzazd zza;
                final zzbes zzb;

                public zzbeo(zzbes zzbesVar, zzazd zzazdVar) {
/* 1 */             this.zza = zzazdVar;
/* 3 */             Objects.requireNonNull(zzbesVar);
/* 6 */             this.zzb = zzbesVar;
                }

                @Override
                public final void run() {
/* 11 */            this.zzb.zzh.zzf(this.zza, zzbnf.SUBCHANNEL_SHUTDOWN);
                }
            }

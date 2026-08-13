            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            
            final class zzbhy implements Runnable {
                final zzbjd zza;

                public zzbhy(zzbjd zzbjdVar) {
/* 1 */             Objects.requireNonNull(zzbjdVar);
/* 4 */             this.zza = zzbjdVar;
                }

                @Override
                public final void run() {
/* 1 */             zzbjd zzbjdVar = this.zza;
/* 10 */            zzbjdVar.zzT.zza(2, "Entering SHUTDOWN state");
/* 19 */            zzbjdVar.zzz.zza(zzauv.SHUTDOWN);
                }
            }

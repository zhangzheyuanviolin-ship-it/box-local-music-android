            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            
            final class zzbij implements Runnable {
                final zzbjd zza;

                public zzbij(zzbjd zzbjdVar, zzbjc zzbjcVar) {
/* 1 */             Objects.requireNonNull(zzbjdVar);
/* 4 */             this.zza = zzbjdVar;
                }

                @Override
                public final void run() {
/* 1 */             zzbjd zzbjdVar = this.zza;
/* 7 */             if (zzbjdVar.zzE == null) {
/* 9 */                 return;
                    }
/* 10 */            zzbjd.zzT(zzbjdVar);
                }
            }

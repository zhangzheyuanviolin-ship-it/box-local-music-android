            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            
            final class zzbjy implements Runnable {
                final zzbki zza;

                public zzbjy(zzbki zzbkiVar) {
/* 1 */             Objects.requireNonNull(zzbkiVar);
/* 4 */             this.zza = zzbkiVar;
                }

                @Override
                public final void run() {
/* 1 */             zzbki zzbkiVar = this.zza;
/* 2 */             zzbkiVar.zzm = null;
/* 15 */            if (zzbkiVar.zzj.zzg()) {
/* 17 */                zzbkiVar.zzl();
                    }
                }
            }

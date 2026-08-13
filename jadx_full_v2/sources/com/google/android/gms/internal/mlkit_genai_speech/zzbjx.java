            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            
            final class zzbjx implements Runnable {
                final zzbki zza;

                public zzbjx(zzbki zzbkiVar) {
/* 1 */             Objects.requireNonNull(zzbkiVar);
/* 4 */             this.zza = zzbkiVar;
                }

                @Override
                public final void run() {
/* 1 */             zzbki zzbkiVar = this.zza;
/* 2 */             zzbkiVar.zzq = null;
/* 11 */            zzbkiVar.zzj.zze();
/* 14 */            zzbkiVar.zzl();
                }
            }

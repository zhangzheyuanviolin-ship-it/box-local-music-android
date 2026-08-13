            package com.google.android.gms.internal.mlkit_genai_speech;
            
            final class zzazj implements Runnable {
                final Runnable zza;
                boolean zzb;
                boolean zzc;

                public zzazj(Runnable runnable) {
/* 4 */             this.zza = runnable;
                }

                @Override
                public final void run() {
/* 3 */             if (this.zzb) {
/* 20 */                return;
                    }
/* 6 */             this.zzc = true;
/* 10 */            this.zza.run();
                }
            }

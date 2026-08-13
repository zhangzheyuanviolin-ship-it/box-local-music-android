            package com.google.android.gms.internal.mlkit_genai_speech;
            
            abstract class zzbdu implements Runnable {
                private final zzavb zza;

                public zzbdu(zzavb zzavbVar) {
/* 4 */             this.zza = zzavbVar;
                }

                @Override
                public final void run() {
/* 3 */             zzavb zzavbVarZzb = this.zza.zzb();
                    try {
/* 7 */                 zza();
                    } finally {
/* 19 */                this.zza.zzf(zzavbVarZzb);
                    }
                }

                public abstract void zza();
            }

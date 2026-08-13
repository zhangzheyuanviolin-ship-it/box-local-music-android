            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            
            final class zzbmf implements Runnable {
                final zzbmg zza;

                public zzbmf(zzbmg zzbmgVar) {
/* 1 */             Objects.requireNonNull(zzbmgVar);
/* 4 */             this.zza = zzbmgVar;
                }

                @Override
                public final void run() {
/* 3 */             zzbmj zzbmjVar = this.zza.zzb;
/* 9 */             if (zzbmjVar.zzE) {
/* 20 */                return;
                    }
/* 15 */            zzbmjVar.zzz.zzg();
                }
            }

            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            
            final class zzbmb implements Runnable {
                final zzblt zza;
                final zzbmh zzb;
                final zzbmg zzc;

                public zzbmb(zzbmg zzbmgVar, zzblt zzbltVar, zzbmh zzbmhVar) {
/* 1 */             this.zza = zzbltVar;
/* 3 */             this.zzb = zzbmhVar;
/* 5 */             Objects.requireNonNull(zzbmgVar);
/* 8 */             this.zzc = zzbmgVar;
                }

                @Override
                public final void run() {
/* 1 */             zzblt zzbltVar = this.zza;
                    synchronized (zzbltVar.zza) {
/* 8 */                 if (zzbltVar.zzc) {
/* 36 */                    return;
                        }
/* 10 */                zzbltVar.zza();
/* 29 */                this.zzc.zzb.zzg.execute(new zzbma(this, this.zzb));
                    }
                }
            }

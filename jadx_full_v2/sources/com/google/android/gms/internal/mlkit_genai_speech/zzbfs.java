            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            
            final class zzbfs implements Runnable {
                final boolean zza;
                final zzbft zzb;

                public zzbfs(zzbft zzbftVar, boolean z) {
/* 1 */             this.zza = z;
/* 3 */             Objects.requireNonNull(zzbftVar);
/* 6 */             this.zzb = zzbftVar;
                }

                @Override
                public final void run() {
/* 3 */             if (this.zza) {
/* 7 */                 zzbfx zzbfxVar = this.zzb.zza;
/* 10 */                zzbfxVar.zzg = true;
/* 20 */                if (zzbfxVar.zzu > 0) {
/* 1 */                     zzgs zzgsVar = zzbfxVar.zzx;
/* 26 */                    zzgsVar.zzc();
/* 29 */                    zzgsVar.zzd();
                        }
                    }
/* 2 */             this.zzb.zza.zzA = false;
                }
            }

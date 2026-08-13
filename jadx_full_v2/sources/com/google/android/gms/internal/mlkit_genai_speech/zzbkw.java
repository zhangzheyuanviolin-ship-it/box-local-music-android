            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            import java.util.concurrent.TimeUnit;
            
            final class zzbkw implements Runnable {
                final zzbkz zza;

                public zzbkw(zzbkz zzbkzVar, zzbky zzbkyVar) {
/* 1 */             Objects.requireNonNull(zzbkzVar);
/* 4 */             this.zza = zzbkzVar;
                }

                @Override
                public final void run() {
/* 1 */             zzbkz zzbkzVar = this.zza;
/* 7 */             zzbky zzbkyVar = null;
/* 8 */             if (!zzbkzVar.zzf) {
/* 1 */                 zzbkzVar.zzg = null;
/* 13 */                return;
                    }
/* 1 */             long jZzk = zzbkzVar.zzk();
/* 27 */            if (zzbkzVar.zze - jZzk > 0) {
/* 1 */                 zzbkzVar.zzg = zzbkzVar.zza.schedule(new zzbkx(zzbkzVar, zzbkyVar), zzbkzVar.zze - jZzk, TimeUnit.NANOSECONDS);
/* 52 */                return;
                    }
/* 2 */             zzbkzVar.zzf = false;
/* 1 */             zzbkzVar.zzg = null;
/* 64 */            zzbkzVar.zzc.run();
                }
            }

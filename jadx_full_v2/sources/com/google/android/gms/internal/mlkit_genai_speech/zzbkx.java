            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            
            final class zzbkx implements Runnable {
                final zzbkz zza;

                public zzbkx(zzbkz zzbkzVar, zzbky zzbkyVar) {
/* 1 */             Objects.requireNonNull(zzbkzVar);
/* 4 */             this.zza = zzbkzVar;
                }

                @Override
                public final void run() {
/* 1 */             zzbkz zzbkzVar = this.zza;
/* 13 */            zzazm zzazmVar = (zzazm) zzbkzVar.zzb;
/* 15 */            zzazmVar.zzc(new zzbkw(zzbkzVar, null));
/* 18 */            zzazmVar.zzb();
                }
            }

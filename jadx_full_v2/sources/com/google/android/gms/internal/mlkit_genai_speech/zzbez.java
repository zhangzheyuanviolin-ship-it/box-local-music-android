            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            
            final class zzbez implements Runnable {
                final zzavf zza;
                final zzbfk zzb;

                public zzbez(zzbfk zzbfkVar, zzavf zzavfVar) {
/* 1 */             this.zza = zzavfVar;
/* 3 */             Objects.requireNonNull(zzbfkVar);
/* 6 */             this.zzb = zzbfkVar;
                }

                @Override
                public final void run() {
/* 9 */             this.zzb.zzd.zzh(this.zza);
                }
            }

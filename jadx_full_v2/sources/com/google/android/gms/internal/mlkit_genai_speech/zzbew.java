            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            
            final class zzbew implements Runnable {
                final zzavi zza;
                final zzbfk zzb;

                public zzbew(zzbfk zzbfkVar, zzavi zzaviVar) {
/* 1 */             this.zza = zzaviVar;
/* 3 */             Objects.requireNonNull(zzbfkVar);
/* 6 */             this.zzb = zzbfkVar;
                }

                @Override
                public final void run() {
/* 9 */             this.zzb.zzd.zzi(this.zza);
                }
            }

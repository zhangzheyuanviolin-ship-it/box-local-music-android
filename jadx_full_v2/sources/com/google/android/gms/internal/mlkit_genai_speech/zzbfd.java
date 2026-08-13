            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            
            final class zzbfd implements Runnable {
                final zzazd zza;
                final zzbfk zzb;

                public zzbfd(zzbfk zzbfkVar, zzazd zzazdVar) {
/* 1 */             this.zza = zzazdVar;
/* 3 */             Objects.requireNonNull(zzbfkVar);
/* 6 */             this.zzb = zzbfkVar;
                }

                @Override
                public final void run() {
/* 9 */             this.zzb.zzd.zzb(this.zza);
                }
            }

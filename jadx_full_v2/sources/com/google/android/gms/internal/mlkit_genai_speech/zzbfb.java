            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.io.InputStream;
            import java.util.Objects;
            
            final class zzbfb implements Runnable {
                final InputStream zza;
                final zzbfk zzb;

                public zzbfb(zzbfk zzbfkVar, InputStream inputStream) {
/* 1 */             this.zza = inputStream;
/* 3 */             Objects.requireNonNull(zzbfkVar);
/* 6 */             this.zzb = zzbfkVar;
                }

                @Override
                public final void run() {
/* 9 */             this.zzb.zzd.zzm(this.zza);
                }
            }

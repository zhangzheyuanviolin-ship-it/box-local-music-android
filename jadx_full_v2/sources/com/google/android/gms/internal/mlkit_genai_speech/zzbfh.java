            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            
            final class zzbfh implements Runnable {
                final zzaxq zza;
                final zzbfj zzb;

                public zzbfh(zzbfj zzbfjVar, zzaxq zzaxqVar) {
/* 1 */             this.zza = zzaxqVar;
/* 3 */             Objects.requireNonNull(zzbfjVar);
/* 6 */             this.zzb = zzbfjVar;
                }

                @Override
                public final void run() {
/* 9 */             this.zzb.zza.zze(this.zza);
                }
            }

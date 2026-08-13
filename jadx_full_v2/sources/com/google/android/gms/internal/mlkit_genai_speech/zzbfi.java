            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            
            final class zzbfi implements Runnable {
                final zzazd zza;
                final zzbdl zzb;
                final zzaxq zzc;
                final zzbfj zzd;

                public zzbfi(zzbfj zzbfjVar, zzazd zzazdVar, zzbdl zzbdlVar, zzaxq zzaxqVar) {
/* 1 */             this.zza = zzazdVar;
/* 3 */             this.zzb = zzbdlVar;
/* 5 */             this.zzc = zzaxqVar;
/* 7 */             Objects.requireNonNull(zzbfjVar);
/* 10 */            this.zzd = zzbfjVar;
                }

                @Override
                public final void run() {
/* 13 */            this.zzd.zza.zzd(this.zza, this.zzb, this.zzc);
                }
            }

            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            
            final class zzblp implements Runnable {
                final zzazd zza;
                final zzbdl zzb;
                final zzaxq zzc;
                final zzbmj zzd;

                public zzblp(zzbmj zzbmjVar, zzazd zzazdVar, zzbdl zzbdlVar, zzaxq zzaxqVar) {
/* 1 */             this.zza = zzazdVar;
/* 3 */             this.zzb = zzbdlVar;
/* 5 */             this.zzc = zzaxqVar;
/* 7 */             Objects.requireNonNull(zzbmjVar);
/* 10 */            this.zzd = zzbmjVar;
                }

                @Override
                public final void run() {
/* 1 */             zzbmj zzbmjVar = this.zzd;
/* 2 */             zzbmjVar.zzE = true;
/* 17 */            zzbmjVar.zzz.zzd(this.zza, this.zzb, this.zzc);
                }
            }

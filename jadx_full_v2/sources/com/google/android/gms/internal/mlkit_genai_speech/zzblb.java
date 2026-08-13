            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            
            final class zzblb implements Runnable {
                final zzblc zza;

                public zzblb(zzblc zzblcVar) {
/* 1 */             Objects.requireNonNull(zzblcVar);
/* 4 */             this.zza = zzblcVar;
                }

                @Override
                public final void run() {
/* 3 */             zzbmj zzbmjVar = this.zza.zzf;
/* 2 */             zzbmjVar.zzE = true;
/* 37 */            zzbmjVar.zzz.zzd(zzbmjVar.zzx.zza, zzbmjVar.zzx.zzb, zzbmjVar.zzx.zzc);
                }
            }

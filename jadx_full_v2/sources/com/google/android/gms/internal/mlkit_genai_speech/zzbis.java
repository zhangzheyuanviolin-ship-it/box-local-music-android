            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.LinkedHashSet;
            import java.util.Objects;
            
            final class zzbis implements Runnable {
                final zzbiv zza;
                final zzbiw zzb;

                public zzbis(zzbiw zzbiwVar, zzbiv zzbivVar) {
/* 1 */             this.zza = zzbivVar;
/* 3 */             Objects.requireNonNull(zzbiwVar);
/* 6 */             this.zzb = zzbiwVar;
                }

                @Override
                public final void run() {
/* 1 */             zzbiw zzbiwVar = this.zzb;
/* 15 */            if (zzbiwVar.zzb.get() != zzbjd.zzg) {
/* 55 */                this.zza.zzn();
/* 110 */               return;
                    }
/* 17 */            zzbjd zzbjdVar = zzbiwVar.zza;
/* 23 */            if (zzbjdVar.zzH == null) {
/* 1 */                 zzbjdVar.zzH = new LinkedHashSet();
/* 40 */                zzbjdVar.zze.zzc(zzbjdVar.zzI, true);
                    }
/* 49 */            zzbjdVar.zzH.add(this.zza);
                }
            }

            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            
/* 18 */    final class zzbig implements zzbjq {
                final zzbjd zza;

                public zzbig(zzbjd zzbjdVar, zzbjc zzbjcVar) {
/* 1 */             Objects.requireNonNull(zzbjdVar);
/* 4 */             this.zza = zzbjdVar;
                }

                @Override
                public final void zzd(boolean z) {
/* 1 */             zzbjd zzbjdVar = this.zza;
/* 9 */             zzbjdVar.zze.zzc(zzbjdVar.zzK, z);
/* 12 */            if (z) {
/* 14 */                zzbjdVar.zzZ();
                    }
                }

                @Override
                public final void zzf(zzazd zzazdVar, zzbfl zzbflVar) {
/* 13 */            zzgo.zzn(this.zza.zzM.get(), "Channel must have been shut down");
                }

                @Override
                public final void zzg() {
/* 1 */             zzbjd zzbjdVar = this.zza;
/* 13 */            zzgo.zzn(zzbjdVar.zzM.get(), "Channel must have been shut down");
/* 2 */             zzbjdVar.zzN = true;
/* 2 */             zzbjdVar.zzal(false);
/* 24 */            zzbjd.zzU(zzbjdVar);
                }

                @Override
/* 19 */        public final void zze() {
                }

                @Override
/* 28 */        public final zzatu zza(zzatu zzatuVar) {
/* 29 */            return zzatuVar;
                }
            }

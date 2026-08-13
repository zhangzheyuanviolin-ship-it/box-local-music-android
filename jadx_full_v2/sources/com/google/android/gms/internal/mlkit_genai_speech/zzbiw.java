            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Iterator;
            import java.util.Objects;
            import java.util.concurrent.atomic.AtomicReference;
            
            final class zzbiw extends zzaua {
                final zzbjd zza;
                private final AtomicReference zzb;
                private final String zzc;
                private final zzaua zzd;

                public zzbiw(zzbjd zzbjdVar, String str, zzbjc zzbjcVar) {
/* 1 */             Objects.requireNonNull(zzbjdVar);
/* 4 */             this.zza = zzbjdVar;
/* 18 */            this.zzb = new AtomicReference(zzbjd.zzg);
/* 25 */            this.zzd = new zzbio(this);
/* 29 */            zzgo.zzc(str, "authority");
/* 32 */            this.zzc = str;
                }

                private final zzaue zzh(zzaxv zzaxvVar, zzatz zzatzVar) {
/* 8 */             zzavz zzavzVar = (zzavz) this.zzb.get();
/* 10 */            if (zzavzVar == null) {
/* 14 */                return this.zzd.zza(zzaxvVar, zzatzVar);
                    }
/* 21 */            if (!(zzavzVar instanceof zzbjn)) {
/* 58 */                return new zzbif(zzavzVar, this.zzd, this.zza.zzr, zzaxvVar, zzatzVar);
                    }
/* 27 */            zzbjm zzbjmVarZzb = ((zzbjn) zzavzVar).zzb.zzb(zzaxvVar);
/* 31 */            if (zzbjmVarZzb != null) {
/* 35 */                zzatzVar = zzatzVar.zze(zzbjm.zza, zzbjmVarZzb);
                    }
/* 41 */            return this.zzd.zza(zzaxvVar, zzatzVar);
                }

                @Override
                public final zzaue zza(zzaxv zzaxvVar, zzatz zzatzVar) {
/* 1 */             AtomicReference atomicReference = this.zzb;
/* 11 */            if (atomicReference.get() != zzbjd.zzg) {
/* 13 */                return zzh(zzaxvVar, zzatzVar);
                    }
/* 18 */            zzbjd zzbjdVar = this.zza;
/* 22 */            zzbiq zzbiqVar = new zzbiq(this);
/* 25 */            zzazm zzazmVar = zzbjdVar.zzd;
/* 27 */            zzazmVar.zzc(zzbiqVar);
/* 30 */            zzazmVar.zzb();
/* 41 */            if (atomicReference.get() != zzbjd.zzg) {
/* 43 */                return zzh(zzaxvVar, zzatzVar);
                    }
/* 56 */            if (zzbjdVar.zzM.get()) {
/* 60 */                return new zzbir(this);
                    }
/* 70 */            zzbiv zzbivVar = new zzbiv(this, zzavb.zzc(), zzaxvVar, zzatzVar);
/* 78 */            zzazmVar.zzc(new zzbis(this, zzbivVar));
/* 81 */            zzazmVar.zzb();
/* 106 */           return zzbivVar;
                }

                @Override
                public final String zzb() {
/* 1 */             return this.zzc;
                }

                public final void zzf() {
/* 11 */            if (this.zzb.get() == zzbjd.zzg) {
/* 14 */                zzg(null);
                    }
                }

                public final void zzg(zzavz zzavzVar) {
/* 1 */             AtomicReference atomicReference = this.zzb;
/* 7 */             zzavz zzavzVar2 = (zzavz) atomicReference.get();
/* 9 */             atomicReference.set(zzavzVar);
/* 16 */            if (zzavzVar2 == zzbjd.zzg) {
/* 18 */                zzbjd zzbjdVar = this.zza;
/* 24 */                if (zzbjdVar.zzH != null) {
/* 30 */                    Iterator it = zzbjdVar.zzH.iterator();
/* 38 */                    while (it.hasNext()) {
/* 46 */                        ((zzbiv) it.next()).zzn();
                            }
                        }
                    }
                }
            }

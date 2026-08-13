            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            import java.util.concurrent.ScheduledExecutorService;
            
            final class zzbil extends zzawn {
                zzbco zza;
                final zzbjd zzb;

                public zzbil(zzbjd zzbjdVar, zzbjc zzbjcVar) {
/* 1 */             Objects.requireNonNull(zzbjdVar);
/* 4 */             this.zzb = zzbjdVar;
                }

                @Override
                public final zzawt zza(zzawk zzawkVar) {
/* 1 */             zzbjd zzbjdVar = this.zzb;
/* 5 */             zzbjdVar.zzd.zzd();
/* 16 */            zzgo.zzn(!zzbjdVar.zzN, "Channel is being terminated");
/* 21 */            return new zzbja(zzbjdVar, zzawkVar);
                }

                @Override
                public final zzazm zzb() {
/* 3 */             return this.zzb.zzd;
                }

                @Override
                public final ScheduledExecutorService zzc() {
/* 1 */             return this.zzb.zzq;
                }

                @Override
                public final void zzd() {
/* 3 */             zzazm zzazmVar = this.zzb.zzd;
/* 5 */             zzazmVar.zzd();
/* 13 */            zzazmVar.zzc(new zzbik(this));
/* 16 */            zzazmVar.zzb();
                }

                @Override
                public final void zze(zzauv zzauvVar, zzawu zzawuVar) {
/* 1 */             zzbjd zzbjdVar = this.zzb;
/* 5 */             zzbjdVar.zzd.zzd();
/* 10 */            zzgo.zzc(zzauvVar, "newState");
/* 17 */            if (this != zzbjdVar.zzE || zzbjdVar.zzF) {
/* 106 */               return;
                    }
/* 3 */             zzbjdVar.zzK.zzl(zzawuVar);
/* 31 */            if (zzauvVar != zzauv.SHUTDOWN) {
/* 44 */                zzbjdVar.zzT.zzb(2, "Entering {0} state with picker: {1}", zzauvVar, zzawuVar);
/* 51 */                zzbjdVar.zzz.zza(zzauvVar);
                    }
                }
            }

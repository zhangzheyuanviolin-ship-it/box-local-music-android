            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.List;
            import java.util.Objects;
            import java.util.concurrent.TimeUnit;
            
            final class zzbja extends zzbcm {
                final zzawk zza;
                final zzawd zzb;
                final zzbdb zzc;
                final zzbdc zzd;
                List zze;
                zzbhp zzf;
                boolean zzg;
                boolean zzh;
                zzazk zzi;
                final zzbjd zzj;

                public zzbja(zzbjd zzbjdVar, zzawk zzawkVar) {
/* 1 */             Objects.requireNonNull(zzbjdVar);
/* 4 */             this.zzj = zzbjdVar;
/* 13 */            this.zze = zzawkVar.zzd();
/* 15 */            this.zza = zzawkVar;
/* 23 */            zzawd zzawdVarZzc = zzawd.zzc("Subchannel", zzbjdVar.zzb());
/* 27 */            this.zzb = zzawdVarZzc;
/* 54 */            zzbdc zzbdcVar = new zzbdc(zzawdVarZzc, 0, zzbjdVar.zzv.zza(), "Subchannel for ".concat(zzawkVar.zzd().toString()));
/* 57 */            this.zzd = zzbdcVar;
/* 68 */            this.zzc = new zzbdb(zzbdcVar, zzbjdVar.zzv);
                }

                public final String toString() {
/* 3 */             return this.zzb.toString();
                }

                @Override
                public final Object zza() {
/* 5 */             zzgo.zzn(this.zzg, "Subchannel is not started");
/* 8 */             return this.zzf;
                }

                @Override
                public final void zzb() {
/* 5 */             this.zzj.zzd.zzd();
/* 12 */            zzgo.zzn(this.zzg, "not started");
/* 17 */            if (this.zzh) {
/* 19 */                return;
                    }
/* 22 */            this.zzf.zzh();
                }

                @Override
                public final void zzc() {
                    zzazk zzazkVar;
/* 1 */             zzbjd zzbjdVar = this.zzj;
/* 3 */             zzazm zzazmVar = zzbjdVar.zzd;
/* 5 */             zzazmVar.zzd();
/* 11 */            if (this.zzf == null) {
/* 13 */                this.zzh = true;
/* 15 */                return;
                    }
/* 18 */            if (!this.zzh) {
/* 38 */                this.zzh = true;
                    } else {
/* 24 */                if (!zzbjdVar.zzN || (zzazkVar = this.zzi) == null) {
/* 37 */                    return;
                        }
/* 30 */                zzazkVar.zza();
/* 34 */                this.zzi = null;
                    }
/* 44 */            if (zzbjdVar.zzN) {
/* 79 */                this.zzf.zzI(zzbjd.zzb);
                    } else {
/* 72 */                this.zzi = zzazmVar.zza(new zzbhs(new zzbiz(this)), 5L, TimeUnit.SECONDS, zzbjdVar.zzp.zzb());
                    }
                }

                @Override
                public final void zzd(zzawv zzawvVar) {
/* 3 */             zzbjd zzbjdVar = this.zzj;
/* 5 */             zzazm zzazmVar = zzbjdVar.zzd;
/* 7 */             zzazmVar.zzd();
/* 16 */            zzgo.zzn(!this.zzg, "already started");
/* 24 */            zzgo.zzn(!this.zzh, "already shutdown");
/* 34 */            zzgo.zzn(!zzbjdVar.zzN, "Channel is being terminated");
/* 37 */            this.zzg = true;
/* 113 */           zzbhp zzbhpVar = new zzbhp(this.zza, zzbjdVar.zzb(), null, zzbjdVar.zzai, zzbjdVar.zzp, zzbjdVar.zzp.zzb(), zzbjdVar.zzx, zzazmVar, new zzbiy(this, zzawvVar), zzbjdVar.zzU, zzbjdVar.zzQ.zza(), this.zzd, this.zzb, this.zzc, zzbjdVar.zzB, zzbjdVar.zzk, zzbjdVar.zzE.zzb.zzag);
/* 1 */             zzbdc zzbdcVar = zzbjdVar.zzS;
/* 122 */           zzavr zzavrVar = new zzavr();
/* 127 */           zzavrVar.zza("Child Subchannel started");
/* 132 */           zzavrVar.zzb(zzavs.CT_INFO);
/* 143 */           zzavrVar.zzd(zzbjdVar.zzv.zza());
/* 146 */           zzavrVar.zzc(zzbhpVar);
/* 153 */           zzbdcVar.zzc(zzavrVar.zze());
/* 156 */           this.zzf = zzbhpVar;
/* 162 */           zzbjdVar.zzU.zzd(zzbhpVar);
/* 169 */           zzbjdVar.zzG.add(zzbhpVar);
                }

                @Override
                public final void zze(List list) {
/* 5 */             this.zzj.zzd.zzd();
/* 8 */             this.zze = list;
/* 12 */            this.zzf.zzJ(list);
                }
            }

            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            import p000.IlIi0I0;
            
            final class zzbin extends zzayg {
                final zzbil zza;
                final zzayl zzb;
                final zzbjd zzc;

                public zzbin(zzbjd zzbjdVar, zzbil zzbilVar, zzayl zzaylVar) {
/* 1 */             Objects.requireNonNull(zzbjdVar);
/* 4 */             this.zzc = zzbjdVar;
/* 9 */             this.zza = zzbilVar;
/* 13 */            zzgo.zzc(zzaylVar, "resolver");
/* 16 */            this.zzb = zzaylVar;
                }

                private final void zzc(zzazd zzazdVar) {
/* 1 */             Logger logger = zzbjd.zza;
/* 3 */             Level level = Level.WARNING;
/* 5 */             zzbjd zzbjdVar = this.zzc;
/* 21 */            logger.logp(level, "io.grpc.internal.ManagedChannelImpl$NameResolverListener", "handleErrorInSyncContext", "[{0}] Failed to resolve name. status={1}", new Object[]{zzbjdVar.zzc(), zzazdVar});
/* 28 */            zzbjdVar.zzV.zzf();
/* 36 */            if (zzbjdVar.zzah != 3) {
/* 48 */                zzbjdVar.zzT.zzb(3, "Failed to resolve name: {0}", zzazdVar);
/* 1 */                 zzbjdVar.zzah = 3;
                    }
/* 54 */            zzbil zzbilVar = this.zza;
/* 60 */            if (zzbilVar != zzbjdVar.zzE) {
/* 62 */                return;
                    }
/* 69 */            zzbilVar.zza.zza().zzb(zzazdVar);
                }

                @Override
                public final zzazd zza(zzayi zzayiVar) {
                    zzbjp zzbjpVar;
/* 3 */             zzbjd zzbjdVar = this.zzc;
/* 5 */             zzazm zzazmVar = zzbjdVar.zzd;
/* 7 */             zzazmVar.zzd();
/* 16 */            if (zzbjdVar.zzC != this.zzb) {
/* 18 */                return zzazd.zza;
                    }
/* 21 */            zzazf zzazfVarZzd = zzayiVar.zzd();
/* 29 */            if (!zzazfVarZzd.zze()) {
/* 35 */                zzc(zzazfVarZzd.zza());
/* 38 */                return zzazfVarZzd.zza();
                    }
/* 47 */            List list = (List) zzazfVarZzd.zzd();
/* 64 */            zzbjdVar.zzT.zzb(1, "Resolved address: {0}, config={1}", list, zzayiVar.zza());
/* 72 */            if (zzbjdVar.zzah != 2) {
/* 84 */                zzbjdVar.zzT.zzb(2, "Address resolved: {0}", list);
/* 1 */                 zzbjdVar.zzah = 2;
                    }
/* 90 */            zzaye zzayeVarZzb = zzayiVar.zzb();
/* 104 */           zzavz zzavzVar = (zzavz) zzayiVar.zza().zzc(zzavz.zza);
/* 122 */           zzbjp zzbjpVar2 = (zzayeVarZzb == null || zzayeVarZzb.zzd() == null) ? null : (zzbjp) zzayeVarZzb.zzd();
/* 130 */           zzazd zzazdVarZzc = zzayeVarZzb != null ? zzayeVarZzb.zzc() : null;
/* 135 */           if (zzbjdVar.zzY) {
/* 176 */               if (zzbjpVar2 != null) {
/* 178 */                   if (zzavzVar != null) {
/* 184 */                       zzbjdVar.zzV.zzg(zzavzVar);
/* 191 */                       if (zzbjpVar2.zza() != null) {
/* 199 */                           zzbjdVar.zzT.zza(1, "Method configs in service config will be discarded due to presence ofconfig-selector");
                                }
                            } else {
/* 211 */                       zzbjdVar.zzV.zzg(zzbjpVar2.zza());
                            }
                        } else if (zzazdVarZzc == null) {
/* 1 */                     zzbjpVar2 = zzbjd.zzf;
/* 275 */                   zzbjdVar.zzV.zzg(null);
                        } else {
/* 221 */                   if (!zzbjdVar.zzX) {
/* 229 */                       zzbjdVar.zzT.zza(2, "Fallback to error due to invalid first service config without default config");
/* 232 */                       zzazd zzazdVarZzc2 = zzayeVarZzb.zzc();
/* 243 */                       zzgo.zzf(!zzazdVarZzc2.zzj(), "the error status must not be OK");
/* 251 */                       zzazmVar.zzc(new zzbim(this, zzazdVarZzc2));
/* 254 */                       zzazmVar.zzb();
/* 257 */                       return zzayeVarZzb.zzc();
                            }
/* 1 */                     zzbjpVar2 = zzbjdVar.zzW;
                        }
/* 286 */               if (!zzbjpVar2.equals(zzbjdVar.zzW)) {
/* 309 */                   zzbjdVar.zzT.zzb(2, "Service config changed{0}", zzbjpVar2 == zzbjd.zzf ? " to empty" : "");
/* 1 */                     zzbjdVar.zzW = zzbjpVar2;
/* 323 */                   zzbjdVar.zzae.zza = zzbjpVar2.zzc();
                        }
                        try {
/* 2 */                     zzbjdVar.zzX = true;
                        } catch (RuntimeException e) {
/* 357 */                   zzbjd.zza.logp(Level.WARNING, "io.grpc.internal.ManagedChannelImpl$NameResolverListener", "onResult2", IlIi0I0.I000lI("[", String.valueOf(this.zzc.zzc()), "] Unexpected exception from parsing service config"), (Throwable) e);
                        }
/* 360 */               zzbjpVar = zzbjpVar2;
                    } else {
/* 137 */               if (zzbjpVar2 != null) {
/* 145 */                   zzbjdVar.zzT.zza(2, "Service config from name resolver discarded by channel settings");
                        }
/* 1 */                 zzbjpVar = zzbjd.zzf;
/* 152 */               if (zzavzVar != null) {
/* 160 */                   zzbjdVar.zzT.zza(2, "Config selector from name resolver discarded by channel settings");
                        }
/* 171 */               zzbjdVar.zzV.zzg(zzbjpVar.zza());
                    }
/* 361 */           zzatu zzatuVarZza = zzayiVar.zza();
/* 365 */           zzbil zzbilVar = this.zza;
/* 373 */           if (zzbilVar != this.zzc.zzE) {
/* 436 */               return zzazd.zza;
                    }
/* 375 */           zzatr zzatrVarZzb = zzatuVarZza.zzb();
/* 381 */           zzatrVarZzb.zza(zzavz.zza);
/* 384 */           Map mapZze = zzbjpVar.zze();
/* 388 */           if (mapZze != null) {
/* 392 */               zzatrVarZzb.zzb(zzawx.zza, mapZze);
/* 395 */               zzatrVarZzb.zzc();
                    }
/* 398 */           zzatu zzatuVarZzc = zzatrVarZzb.zzc();
/* 402 */           zzawr zzawrVarZzb = zzaws.zzb();
/* 412 */           zzawrVarZzb.zza((List) zzazfVarZzd.zzd());
/* 415 */           zzawrVarZzb.zzb(zzatuVarZzc);
/* 422 */           zzawrVarZzb.zzc(zzbjpVar.zzd());
/* 431 */           return zzbilVar.zza.zzb(zzawrVarZzb.zzd());
                }
            }

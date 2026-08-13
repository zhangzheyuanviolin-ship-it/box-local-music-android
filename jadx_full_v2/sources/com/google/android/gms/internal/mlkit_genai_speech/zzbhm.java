            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Iterator;
            import java.util.Objects;
            import p000.I000II;
            
            final class zzbhm implements zzbjq {
                final zzbdr zza;
                boolean zzb;
                final zzbhp zzc;

                public zzbhm(zzbhp zzbhpVar, zzbdr zzbdrVar) {
/* 1 */             Objects.requireNonNull(zzbhpVar);
/* 4 */             this.zzc = zzbhpVar;
/* 10 */            this.zzb = false;
/* 12 */            this.zza = zzbdrVar;
                }

                public static String zzb(zzbhm zzbhmVar, zzayv zzayvVar) {
                    int iOrdinal;
/* 3 */             if (zzayvVar == null || (iOrdinal = zzayvVar.ordinal()) == 0) {
/* 1 */                 return "none";
                    }
/* 13 */            if (iOrdinal == 1) {
/* 36 */                return "integrity_only";
                    }
/* 16 */            if (iOrdinal == 2) {
/* 18 */                return "privacy_and_integrity";
                    }
/* 31 */            I000II.I000iOII("Unknown SecurityLevel: ".concat(zzayvVar.toString()));
/* 34 */            return null;
                }

                public static String zzc(zzbhm zzbhmVar, zzatu zzatuVar, zzats zzatsVar) {
/* 5 */             String str = (String) zzatuVar.zzc(zzatsVar);
                    return str == null ? "" : str;
                }

                @Override
                public final zzatu zza(zzatu zzatuVar) {
/* 7 */             Iterator it = this.zzc.zzj.iterator();
/* 15 */            if (!it.hasNext()) {
/* 17 */                return zzatuVar;
                    }
/* 29 */            throw null;
                }

                @Override
                public final void zzd(boolean z) {
/* 5 */             zzbhp.zzF(this.zzc, this.zza, z);
                }

                @Override
                public final void zze() {
/* 1 */             zzbhp zzbhpVar = this.zzc;
/* 10 */            zzbhpVar.zzh.zza(2, "READY");
/* 1 */             zzazm zzazmVar = zzbhpVar.zzk;
/* 22 */            zzazmVar.zzc(new zzbhj(this));
/* 25 */            zzazmVar.zzb();
                }

                @Override
                public final void zzf(zzazd zzazdVar, zzbfl zzbflVar) {
/* 1 */             zzbhp zzbhpVar = this.zzc;
/* 24 */            zzbhpVar.zzh.zzb(2, "{0} SHUTDOWN with {1}", this.zza.zzc(), zzbhp.zzN(zzazdVar));
/* 28 */            this.zzb = true;
/* 1 */             zzazm zzazmVar = zzbhpVar.zzk;
/* 39 */            zzazmVar.zzc(new zzbhk(this, zzbflVar, zzazdVar));
/* 42 */            zzazmVar.zzb();
                }

                @Override
                public final void zzg() {
/* 5 */             zzgo.zzn(this.zzb, "transportShutdown() must be called before transportTerminated().");
/* 8 */             zzbhp zzbhpVar = this.zzc;
/* 1 */             zzauc zzaucVar = zzbhpVar.zzh;
/* 14 */            zzbdr zzbdrVar = this.zza;
/* 27 */            zzaucVar.zzb(2, "{0} Terminated", zzbdrVar.zzc());
/* 34 */            zzbhpVar.zzf.zze(zzbdrVar);
/* 38 */            zzbhp.zzF(zzbhpVar, zzbdrVar, false);
/* 45 */            Iterator it = zzbhpVar.zzj.iterator();
/* 53 */            if (it.hasNext()) {
/* 77 */                zzbdrVar.zzt();
/* 110 */               throw null;
                    }
/* 1 */             zzazm zzazmVar = zzbhpVar.zzk;
/* 64 */            zzazmVar.zzc(new zzbhl(this));
/* 67 */            zzazmVar.zzb();
                }
            }

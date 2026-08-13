            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            
            final class zzbhb implements Runnable {
                final zzazd zza;
                final zzbhp zzb;

                public zzbhb(zzbhp zzbhpVar, zzazd zzazdVar) {
/* 1 */             this.zza = zzazdVar;
/* 3 */             Objects.requireNonNull(zzbhpVar);
/* 6 */             this.zzb = zzbhpVar;
                }

                @Override
                public final void run() {
/* 1 */             zzbhp zzbhpVar = this.zzb;
/* 7 */             zzauv zzauvVarZza = zzbhpVar.zzv.zza();
/* 11 */            zzauv zzauvVar = zzauv.SHUTDOWN;
/* 13 */            if (zzauvVarZza == zzauvVar) {
/* 110 */               return;
                    }
/* 16 */            zzazd zzazdVar = this.zza;
/* 1 */             zzbhpVar.zzw = zzazdVar;
/* 1 */             zzbjr zzbjrVar = zzbhpVar.zzu;
/* 1 */             zzbdr zzbdrVar = zzbhpVar.zzt;
/* 1 */             zzbhpVar.zzu = null;
/* 2 */             zzbhpVar.zzt = null;
/* 36 */            zzbhp.zzD(zzbhpVar, zzauvVar);
/* 43 */            zzbhpVar.zzl.zzd();
/* 54 */            if (zzbhpVar.zzr.isEmpty()) {
/* 56 */                zzbhp.zzE(zzbhpVar);
                    }
/* 59 */            zzbhp.zzC(zzbhpVar);
/* 66 */            if (zzbhpVar.zzp != null) {
/* 72 */                zzbhpVar.zzp.zza();
/* 79 */                zzbhpVar.zzq.zzr(zzazdVar);
/* 1 */                 zzbhpVar.zzp = null;
/* 1 */                 zzbhpVar.zzq = null;
                    }
/* 88 */            if (zzbjrVar != null) {
/* 90 */                zzbjrVar.zzr(zzazdVar);
                    }
/* 93 */            if (zzbdrVar != null) {
/* 95 */                zzbdrVar.zzr(zzazdVar);
                    }
                }
            }

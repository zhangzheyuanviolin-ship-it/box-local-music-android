            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.net.SocketAddress;
            import java.util.List;
            import java.util.Objects;
            import java.util.concurrent.TimeUnit;
            
            final class zzbha implements Runnable {
                final List zza;
                final zzbhp zzb;

                public zzbha(zzbhp zzbhpVar, List list) {
/* 1 */             this.zza = list;
/* 3 */             Objects.requireNonNull(zzbhpVar);
/* 6 */             this.zzb = zzbhpVar;
                }

                @Override
                public final void run() {
                    zzbjr zzbjrVar;
/* 1 */             zzbhp zzbhpVar = this.zzb;
/* 7 */             SocketAddress socketAddressZzb = zzbhpVar.zzl.zzb();
/* 1 */             zzbhi zzbhiVar = zzbhpVar.zzl;
/* 15 */            List list = this.zza;
/* 17 */            zzbhiVar.zze(list);
/* 1 */             zzbhpVar.zzm = list;
/* 27 */            zzauv zzauvVarZza = zzbhpVar.zzv.zza();
/* 31 */            zzauv zzauvVar = zzauv.READY;
/* 34 */            if ((zzauvVarZza != zzauvVar && zzbhpVar.zzv.zza() != zzauv.CONNECTING) || zzbhpVar.zzl.zzh(socketAddressZzb)) {
/* 49 */                zzbjrVar = null;
                    } else if (zzbhpVar.zzv.zza() == zzauvVar) {
/* 1 */                 zzbjrVar = zzbhpVar.zzu;
/* 1 */                 zzbhpVar.zzu = null;
/* 82 */                zzbhpVar.zzl.zzd();
/* 87 */                zzbhp.zzD(zzbhpVar, zzauv.IDLE);
                    } else {
/* 103 */               zzbhpVar.zzt.zzr(zzazd.zzj.zze("InternalSubchannel closed pending transport due to address change"));
/* 2 */                 zzbhpVar.zzt = null;
/* 113 */               zzbhpVar.zzl.zzd();
/* 116 */               zzbhp.zzH(zzbhpVar);
/* 49 */                zzbjrVar = null;
                    }
/* 120 */           if (zzbjrVar != null) {
/* 126 */               if (zzbhpVar.zzp != null) {
/* 140 */                   zzbhpVar.zzq.zzr(zzazd.zzj.zze("InternalSubchannel closed transport early due to address change"));
/* 147 */                   zzbhpVar.zzp.zza();
/* 1 */                     zzbhpVar.zzp = null;
/* 1 */                     zzbhpVar.zzq = null;
                        }
/* 1 */                 zzbhpVar.zzq = zzbjrVar;
/* 1 */                 zzbhpVar.zzp = zzbhpVar.zzk.zza(new zzbgz(this), 5L, TimeUnit.SECONDS, zzbhpVar.zze);
                    }
                }
            }

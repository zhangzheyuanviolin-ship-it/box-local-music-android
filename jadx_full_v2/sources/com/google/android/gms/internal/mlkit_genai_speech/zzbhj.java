            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            
            final class zzbhj implements Runnable {
                final zzbhm zza;

                public zzbhj(zzbhm zzbhmVar) {
/* 1 */             Objects.requireNonNull(zzbhmVar);
/* 4 */             this.zza = zzbhmVar;
                }

                @Override
                public final void run() {
/* 1 */             zzbhm zzbhmVar = this.zza;
/* 3 */             zzbhp zzbhpVar = zzbhmVar.zzc;
/* 2 */             zzbhpVar.zzA = null;
/* 13 */            if (zzbhpVar.zzw != null) {
/* 26 */                zzgo.zzn(zzbhpVar.zzu == null, "Unexpected non-null activeTransport");
/* 35 */                zzbhmVar.zza.zzr(zzbhpVar.zzw);
/* 38 */                return;
                    }
/* 39 */            zzbdr zzbdrVar = zzbhmVar.zza;
/* 45 */            if (zzbhpVar.zzt == zzbdrVar) {
/* 1 */                 zzbhpVar.zzu = zzbdrVar;
/* 2 */                 zzbhpVar.zzt = null;
/* 1 */                 zzbhpVar.zzx = zzbhpVar.zzl.zza();
/* 66 */                zzbhp.zzD(zzbhpVar, zzauv.READY);
/* 125 */               zzbhpVar.zzy.zzb(zzbhpVar.zzz, zzbhm.zzc(zzbhmVar, zzbhpVar.zzl.zza(), zzayl.zza), zzbhm.zzc(zzbhmVar, zzbhpVar.zzl.zza(), zzavj.zzb), zzbhm.zzb(zzbhmVar, (zzayv) zzbhpVar.zzl.zza().zzc(zzbgj.zza)));
                    }
                }
            }

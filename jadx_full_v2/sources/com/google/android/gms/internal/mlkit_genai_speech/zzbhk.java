            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            
            final class zzbhk implements Runnable {
                final zzbfl zza;
                final zzazd zzb;
                final zzbhm zzc;

                public zzbhk(zzbhm zzbhmVar, zzbfl zzbflVar, zzazd zzazdVar) {
/* 1 */             this.zza = zzbflVar;
/* 3 */             this.zzb = zzazdVar;
/* 5 */             Objects.requireNonNull(zzbhmVar);
/* 8 */             this.zzc = zzbhmVar;
                }

                @Override
                public final void run() {
/* 1 */             zzbhm zzbhmVar = this.zzc;
/* 3 */             zzbhp zzbhpVar = zzbhmVar.zzc;
/* 15 */            if (zzbhpVar.zzv.zza() == zzauv.SHUTDOWN) {
/* 245 */               return;
                    }
/* 19 */            zzbdr zzbdrVar = zzbhmVar.zza;
/* 26 */            if (zzbhpVar.zzu == zzbdrVar) {
/* 1 */                 zzbhpVar.zzu = null;
/* 35 */                zzbhpVar.zzl.zzd();
/* 40 */                zzbhp.zzD(zzbhpVar, zzauv.IDLE);
/* 105 */               zzbhpVar.zzy.zzc(zzbhpVar.zzz, zzbhm.zzc(zzbhmVar, zzbhpVar.zzl.zza(), zzayl.zza), zzbhm.zzc(zzbhmVar, zzbhpVar.zzl.zza(), zzavj.zzb), this.zza.zza(), zzbhm.zzb(zzbhmVar, (zzayv) zzbhpVar.zzl.zza().zzc(zzbgj.zza)));
/* 108 */               return;
                    }
/* 113 */           if (zzbhpVar.zzt == zzbdrVar) {
/* 151 */               zzbhpVar.zzy.zza(zzbhpVar.zzz, zzbhm.zzc(zzbhmVar, zzbhpVar.zzl.zza(), zzayl.zza), zzbhm.zzc(zzbhmVar, zzbhpVar.zzl.zza(), zzavj.zzb));
/* 179 */               zzgo.zzo(zzbhpVar.zzv.zza() == zzauv.CONNECTING, "Expected state is CONNECTING, actual state is %s", zzbhpVar.zzv.zza());
/* 186 */               zzbhpVar.zzl.zzc();
/* 197 */               if (zzbhpVar.zzl.zzg()) {
/* 215 */                   zzbhp.zzH(zzbhpVar);
/* 245 */                   return;
                        }
/* 2 */                 zzbhpVar.zzt = null;
/* 206 */               zzbhpVar.zzl.zzd();
/* 211 */               zzbhp.zzG(zzbhpVar, this.zzb);
                    }
                }
            }

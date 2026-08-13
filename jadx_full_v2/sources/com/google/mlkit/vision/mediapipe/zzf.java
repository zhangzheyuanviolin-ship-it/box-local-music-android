            package com.google.mlkit.vision.mediapipe;

            import com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv;
            import com.google.android.gms.internal.mlkit_vision_mediapipe.zzhz;
            import java.util.List;
            import java.util.concurrent.ConcurrentHashMap;
            import p000.l11ll1Oo;
            import p000.lII0I0I000I;
            
            final class zzf implements zzhz {
                final zzg zza;

                public zzf(zzg zzgVar) {
/* 1 */             this.zza = zzgVar;
                }

                @Override
                public final void zza(List<zzhv> list) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 186 */               return;
                    }
/* 16 */            long jZzb = list.get(0).zzb();
/* 26 */            l11ll1Oo.I000O01llI0("From creating image packet to getting result packet").I000II(jZzb);
/* 1 */             ConcurrentHashMap concurrentHashMap = this.zza.zzh;
/* 35 */            lII0I0I000I.I000II(concurrentHashMap);
/* 46 */            zze zzeVar = (zze) concurrentHashMap.remove(Long.valueOf(jZzb));
/* 48 */            if (zzeVar != null) {
/* 50 */                zzeVar.zza(list);
                    }
                }
            }

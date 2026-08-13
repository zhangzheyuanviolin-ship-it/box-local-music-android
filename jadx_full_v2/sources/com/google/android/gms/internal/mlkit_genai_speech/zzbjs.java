            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.List;
            
            final class zzbjs implements zzaxz {
                private final List zza;
                private final zzaxx zzb;

                public zzbjs(List list, zzaxx zzaxxVar) {
/* 4 */             this.zza = list;
/* 6 */             this.zzb = zzaxxVar;
                }

                @Override
                public final void zza(zzaxb zzaxbVar, long j, List list, List list2) {
/* 3 */             zzaxy.zza(this, zzaxbVar, 1L, list, list2);
/* 16 */            for (zzaya zzayaVar : this.zza) {
/* 32 */                if (zzayaVar.zza() <= zzaxbVar.zza()) {
/* 36 */                    this.zzb.zzd();
/* 39 */                    zzayaVar.zzd();
                        }
/* 42 */                zzayaVar.zzb();
                    }
                }

                @Override
                public final void zzb(zzaxc zzaxcVar, long j, List list, List list2) {
/* 1 */             zzaxy.zzb(this, zzaxcVar, j, list, list2);
/* 14 */            for (zzaya zzayaVar : this.zza) {
/* 30 */                if (zzayaVar.zza() <= zzaxcVar.zza()) {
/* 34 */                    this.zzb.zzd();
/* 37 */                    zzayaVar.zzd();
                        }
/* 40 */                zzayaVar.zzc();
                    }
                }
            }

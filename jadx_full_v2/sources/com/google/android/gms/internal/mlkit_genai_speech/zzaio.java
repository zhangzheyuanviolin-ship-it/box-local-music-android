            package com.google.android.gms.internal.mlkit_genai_speech;
            
            final class zzaio extends zzaim {
                @Override
                public final Object zza(Object obj) {
/* 1 */             zzagg zzaggVar = (zzagg) obj;
/* 3 */             zzain zzainVar = zzaggVar.zzc;
/* 9 */             if (zzainVar != zzain.zzc()) {
/* 29 */                return zzainVar;
                    }
/* 11 */            zzain zzainVarZzf = zzain.zzf();
/* 15 */            zzaggVar.zzc = zzainVarZzf;
/* 29 */            return zzainVarZzf;
                }

                @Override
                public final Object zzb() {
/* 1 */             return zzain.zzf();
                }

                @Override
                public final Object zzc(Object obj) {
/* 1 */             zzain zzainVar = (zzain) obj;
/* 3 */             zzainVar.zzh();
/* 29 */            return zzainVar;
                }

                @Override
                public final void zzd(Object obj, int i, int i2) {
/* 11 */            ((zzain) obj).zzj((i << 3) | 5, Integer.valueOf(i2));
                }

                @Override
                public final void zze(Object obj, int i, long j) {
/* 11 */            ((zzain) obj).zzj((i << 3) | 1, Long.valueOf(j));
                }

                @Override
                public final void zzf(Object obj, int i, Object obj2) {
/* 9 */             ((zzain) obj).zzj((i << 3) | 3, (zzain) obj2);
                }

                @Override
                public final void zzg(Object obj, int i, zzafd zzafdVar) {
/* 7 */             ((zzain) obj).zzj((i << 3) | 2, zzafdVar);
                }

                @Override
                public final void zzh(Object obj, int i, long j) {
/* 9 */             ((zzain) obj).zzj(i << 3, Long.valueOf(j));
                }

                @Override
                public final void zzi(Object obj) {
/* 5 */             ((zzagg) obj).zzc.zzh();
                }

                @Override
                public final void zzj(Object obj, Object obj2) {
/* 5 */             ((zzagg) obj).zzc = (zzain) obj2;
                }
            }

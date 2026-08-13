            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Comparator;
            
            final class zzayw implements Comparator {
                final zzayx zza;

                public zzayw(zzayx zzayxVar) {
/* 1 */             this.zza = zzayxVar;
                }

                @Override
                public final int compare(Object obj, Object obj2) {
/* 1 */             zzayx zzayxVar = this.zza;
/* 11 */            int iZza = zzayxVar.zza(obj) - zzayxVar.zza(obj2);
                    return iZza != 0 ? iZza : obj.getClass().getName().compareTo(obj2.getClass().getName());
                }
            }

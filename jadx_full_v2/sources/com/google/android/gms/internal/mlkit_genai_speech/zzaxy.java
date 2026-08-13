            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.List;
            
            public final class zzaxy {
                /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0012  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static void zza(zzaxz zzaxzVar, zzaxb zzaxbVar, long j, List list, List list2) {
                    boolean z;
                    boolean z2;
/* 3 */             if (list != null) {
/* 19 */                z = list.size() == zzaxbVar.zzc.size();
                    }
/* 28 */            zzgo.zzh(z, "Incorrect number of required labels provided. Expected: %s", zzaxbVar.zzc.size());
/* 31 */            if (list2 != null) {
/* 43 */                z2 = list2.size() == zzaxbVar.zzd.size();
                    }
/* 55 */            zzgo.zzh(z2, "Incorrect number of optional labels provided. Expected: %s", zzaxbVar.zzd.size());
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0012  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static void zzb(zzaxz zzaxzVar, zzaxc zzaxcVar, long j, List list, List list2) {
                    boolean z;
                    boolean z2;
/* 3 */             if (list != null) {
/* 19 */                z = list.size() == zzaxcVar.zzc.size();
                    }
/* 28 */            zzgo.zzh(z, "Incorrect number of required labels provided. Expected: %s", zzaxcVar.zzc.size());
/* 31 */            if (list2 != null) {
/* 43 */                z2 = list2.size() == zzaxcVar.zzd.size();
                    }
/* 55 */            zzgo.zzh(z2, "Incorrect number of optional labels provided. Expected: %s", zzaxcVar.zzd.size());
                }
            }

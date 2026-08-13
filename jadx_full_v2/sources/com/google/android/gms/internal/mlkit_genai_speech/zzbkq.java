            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Map;
            
            public final class zzbkq extends zzawy {
                static final boolean zza = zzbgr.zzf("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST", false);
                public static final int zzb = 0;

                @Override
                public final zzawx zza(zzawn zzawnVar) {
                    return zza ? new zzbki(zzawnVar) : new zzbkp(zzawnVar);
                }

                @Override
                public final int zzb() {
/* 1 */             return 5;
                }

                @Override
                public final zzaye zzc(Map map) {
                    try {
/* 3 */                 Boolean boolZza = zzbhr.zza(map, "shuffleAddressList");
/* 23 */                return zzaye.zza(zza ? new zzbkc(boolZza, null) : new zzbkk(boolZza, null));
                    } catch (RuntimeException e) {
/* 41 */                return zzaye.zzb(zzazd.zzj.zzd(e).zze("Failed parsing configuration for pick_first"));
                    }
                }

                @Override
                public final String zzd() {
/* 1 */             return "pick_first";
                }

                @Override
                public final boolean zze() {
/* 1 */             return true;
                }
            }

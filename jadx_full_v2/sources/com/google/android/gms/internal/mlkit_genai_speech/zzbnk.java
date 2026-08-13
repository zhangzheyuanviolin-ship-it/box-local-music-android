            package com.google.android.gms.internal.mlkit_genai_speech;
            
            final class zzbnk {
                private static final zzaxb zza;
                private static final zzaxb zzb;
                private static final zzaxb zzc;
                private static final zzaxc zzd;
                private final zzaxz zze;

                static {
/* 1 */             zzaxx zzaxxVarZzc = zzaxx.zzc();
/* 40 */            zza = zzaxxVarZzc.zza("grpc.subchannel.disconnections", "EXPERIMENTAL. Number of times the selected subchannel becomes disconnected", "{disconnection}", zzhq.zza("grpc.target"), zzhq.zza("grpc.lb.backend_service", "grpc.lb.locality", "grpc.disconnect_error"), false);
/* 68 */            zzb = zzaxxVarZzc.zza("grpc.subchannel.connection_attempts_succeeded", "EXPERIMENTAL. Number of successful connection attempts", "{attempt}", zzhq.zza("grpc.target"), zzhq.zza("grpc.lb.backend_service", "grpc.lb.locality"), false);
/* 96 */            zzc = zzaxxVarZzc.zza("grpc.subchannel.connection_attempts_failed", "EXPERIMENTAL. Number of failed connection attempts", "{attempt}", zzhq.zza("grpc.target"), zzhq.zza("grpc.lb.backend_service", "grpc.lb.locality"), false);
/* 126 */           zzd = zzaxxVarZzc.zzb("grpc.subchannel.open_connections", "EXPERIMENTAL. Number of open connections.", "{connection}", zzhq.zza("grpc.target"), zzhq.zza("grpc.security_level", "grpc.lb.backend_service", "grpc.lb.locality"), false);
                }

                public zzbnk(zzaxz zzaxzVar) {
/* 4 */             this.zze = zzaxzVar;
                }

                public final void zza(String str, String str2, String str3) {
/* 15 */            this.zze.zza(zzc, 1L, zzhk.zzk(str), zzhk.zzl(str2, str3));
                }

                public final void zzb(String str, String str2, String str3, String str4) {
/* 1 */             zzaxz zzaxzVar = this.zze;
/* 15 */            zzaxzVar.zza(zzb, 1L, zzhk.zzk(str), zzhk.zzl(str2, str3));
/* 28 */            zzaxzVar.zzb(zzd, 1L, zzhk.zzk(str), zzhk.zzm(str4, str2, str3));
                }

                public final void zzc(String str, String str2, String str3, String str4, String str5) {
/* 1 */             zzaxz zzaxzVar = this.zze;
/* 16 */            zzaxzVar.zza(zza, 1L, zzhk.zzk(str), zzhk.zzm(str2, str3, str4));
/* 32 */            zzaxzVar.zzb(zzd, -1L, zzhk.zzk(str), zzhk.zzm(str5, str2, str3));
                }
            }

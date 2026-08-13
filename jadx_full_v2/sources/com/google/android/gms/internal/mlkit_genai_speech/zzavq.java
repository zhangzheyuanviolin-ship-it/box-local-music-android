            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.net.InetSocketAddress;
            import java.net.SocketAddress;
            import java.util.Map;
            import java.util.Objects;
            
            public final class zzavq extends zzayt {
                private final SocketAddress zza;
                private final InetSocketAddress zzb;
                private final Map zzc;
                private final String zzd;
                private final String zze;

                public zzavq(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, Map map, String str, String str2, zzavp zzavpVar) {
/* 6 */             zzgo.zzc(socketAddress, "proxyAddress");
/* 11 */            zzgo.zzc(inetSocketAddress, "targetAddress");
/* 16 */            if (socketAddress instanceof InetSocketAddress) {
/* 29 */                zzgo.zzo(!((InetSocketAddress) socketAddress).isUnresolved(), "The proxy address %s is not resolved", socketAddress);
                    }
/* 32 */            this.zza = socketAddress;
/* 34 */            this.zzb = inetSocketAddress;
/* 36 */            this.zzc = map;
/* 38 */            this.zzd = str;
/* 40 */            this.zze = str2;
                }

                public static zzavo zza() {
/* 4 */             return new zzavo(null);
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof zzavq)) {
/* 3 */                 return false;
                    }
/* 7 */             zzavq zzavqVar = (zzavq) obj;
                    return Objects.equals(this.zza, zzavqVar.zza) && Objects.equals(this.zzb, zzavqVar.zzb) && Objects.equals(this.zzc, zzavqVar.zzc) && Objects.equals(this.zzd, zzavqVar.zzd) && Objects.equals(this.zze, zzavqVar.zze);
                }

                public final int hashCode() {
/* 15 */            return Objects.hash(this.zza, this.zzb, this.zzd, this.zze, this.zzc);
                }

                public final String toString() {
/* 1 */             zzgk zzgkVarZzb = zzgm.zzb(this);
/* 9 */             zzgkVarZzb.zzd("proxyAddr", this.zza);
/* 16 */            zzgkVarZzb.zzd("targetAddr", this.zzb);
/* 23 */            zzgkVarZzb.zzd("headers", this.zzc);
/* 30 */            zzgkVarZzb.zzd("username", this.zzd);
/* 42 */            zzgkVarZzb.zze("hasPassword", this.zze != null);
/* 45 */            return zzgkVarZzb.toString();
                }

                public final InetSocketAddress zzb() {
/* 1 */             return this.zzb;
                }
            }

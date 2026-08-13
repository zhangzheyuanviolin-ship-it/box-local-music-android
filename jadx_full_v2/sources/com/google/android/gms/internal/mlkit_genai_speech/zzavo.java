            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.net.InetSocketAddress;
            import java.net.SocketAddress;
            import java.util.Collections;
            import java.util.Map;
            
/* 7 */     public final class zzavo {
                private SocketAddress zza;
                private InetSocketAddress zzb;
                private final Map zzc = Collections.EMPTY_MAP;
                private String zzd;
                private String zze;

                private zzavo() {
                }

                public final zzavo zza(String str) {
/* 1 */             this.zze = str;
/* 29 */            return this;
                }

                public final zzavo zzb(SocketAddress socketAddress) {
/* 3 */             zzgo.zzc(socketAddress, "proxyAddress");
/* 6 */             this.zza = socketAddress;
/* 29 */            return this;
                }

                public final zzavo zzc(InetSocketAddress inetSocketAddress) {
/* 3 */             zzgo.zzc(inetSocketAddress, "targetAddress");
/* 6 */             this.zzb = inetSocketAddress;
/* 29 */            return this;
                }

                public final zzavo zzd(String str) {
/* 1 */             this.zzd = str;
/* 29 */            return this;
                }

                public final zzavq zze() {
/* 14 */            return new zzavq(this.zza, this.zzb, this.zzc, this.zzd, this.zze, null);
                }

/* 8 */         public zzavo(zzavp zzavpVar) {
                }
            }

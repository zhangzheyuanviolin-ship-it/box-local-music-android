            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.net.SocketAddress;
            import java.util.Collections;
            
            final class zzbka {
                private final zzatu zza;
                private final SocketAddress zzb;

                public zzbka(zzatu zzatuVar, SocketAddress socketAddress) {
/* 4 */             this.zza = zzatuVar;
/* 6 */             this.zzb = socketAddress;
                }

                public static zzavj zzb(zzbka zzbkaVar) {
/* 3 */             SocketAddress socketAddress = zzbkaVar.zzb;
/* 11 */            return new zzavj(Collections.singletonList(socketAddress), zzbkaVar.zza);
                }
            }

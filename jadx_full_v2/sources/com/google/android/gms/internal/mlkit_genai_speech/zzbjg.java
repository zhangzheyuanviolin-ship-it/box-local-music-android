            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.net.SocketAddress;
            import java.net.URI;
            import java.util.Collection;
            import java.util.Collections;
            
            final class zzbjg extends zzaym {
                final SocketAddress zza;
                final String zzb;
                final Collection zzc;

                public zzbjg(SocketAddress socketAddress, String str) {
/* 4 */             this.zza = socketAddress;
/* 6 */             this.zzb = str;
/* 16 */            this.zzc = Collections.singleton(socketAddress.getClass());
                }

                @Override
                public final zzayl zza(URI uri, zzayd zzaydVar) {
/* 3 */             return new zzbjf(this);
                }

                @Override
                public final String zzb() {
/* 1 */             return "directaddress";
                }

                @Override
                public final int zzc() {
/* 1 */             return 5;
                }

                @Override
                public final Collection zzd() {
/* 1 */             return this.zzc;
                }

                @Override
                public final boolean zze() {
/* 1 */             return true;
                }
            }

            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.net.InetAddress;
            import java.net.InetSocketAddress;
            import java.net.PasswordAuthentication;
            import java.net.Proxy;
            import java.net.ProxySelector;
            import java.net.SocketAddress;
            import java.net.URI;
            import java.net.URISyntaxException;
            import java.util.List;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            
            final class zzbku implements zzayu {
                private final zzgu zzc;
                private static final Logger zza = Logger.getLogger(zzbku.class.getName());
                private static final zzbks zzd = new zzbks();
                private static final zzgu zzb = new zzbkt();

                public zzbku() {
/* 1 */             zzgu zzguVar = zzb;
/* 3 */             zzbks zzbksVar = zzd;
/* 8 */             zzguVar.getClass();
/* 11 */            this.zzc = zzguVar;
/* 13 */            zzbksVar.getClass();
                }

                private final zzayt zzc(InetSocketAddress inetSocketAddress) {
                    try {
/* 18 */                URI uri = new URI("https", null, inetSocketAddress.getHostString(), inetSocketAddress.getPort(), null, null, null);
/* 27 */                ProxySelector proxySelector = (ProxySelector) this.zzc.zza();
/* 33 */                if (proxySelector == null) {
/* 41 */                    zza.logp(Level.FINE, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "proxy selector is null, so continuing without proxy lookup");
/* 5 */                     return null;
                        }
/* 45 */                List<Proxy> listSelect = proxySelector.select(uri);
/* 54 */                if (listSelect.size() > 1) {
/* 62 */                    zza.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "More than 1 proxy detected, gRPC will select the first one");
                        }
/* 66 */                Proxy proxy = listSelect.get(0);
/* 78 */                if (proxy.type() == Proxy.Type.DIRECT) {
/* 5 */                     return null;
                        }
/* 85 */                InetSocketAddress inetSocketAddress2 = (InetSocketAddress) proxy.address();
/* 104 */               PasswordAuthentication passwordAuthenticationZza = zzbks.zza(inetSocketAddress2.getHostString(), inetSocketAddress2.getAddress(), inetSocketAddress2.getPort(), "https", "", null);
/* 112 */               if (inetSocketAddress2.isUnresolved()) {
/* 128 */                   inetSocketAddress2 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress2.getHostName()), inetSocketAddress2.getPort());
                        }
/* 132 */               zzavo zzavoVarZza = zzavq.zza();
/* 136 */               zzavoVarZza.zzc(inetSocketAddress);
/* 139 */               zzavoVarZza.zzb(inetSocketAddress2);
/* 142 */               if (passwordAuthenticationZza == null) {
/* 144 */                   return zzavoVarZza.zze();
                        }
/* 153 */               zzavoVarZza.zzd(passwordAuthenticationZza.getUserName());
/* 172 */               zzavoVarZza.zza(passwordAuthenticationZza.getPassword() != null ? new String(passwordAuthenticationZza.getPassword()) : null);
/* 175 */               return zzavoVarZza.zze();
                    } catch (URISyntaxException e) {
/* 193 */               zza.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "Failed to construct URI for proxy lookup, proceeding without proxy", (Throwable) e);
/* 5 */                 return null;
                    }
                }

                @Override
                public final zzayt zza(SocketAddress socketAddress) {
/* 3 */             if (socketAddress instanceof InetSocketAddress) {
/* 9 */                 return zzc((InetSocketAddress) socketAddress);
                    }
/* 5 */             return null;
                }
            }

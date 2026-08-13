            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.net.InetSocketAddress;
            import java.net.URI;
            import java.util.Collection;
            import java.util.Collections;
            
            public final class zzbfy extends zzaym {
                public static final int I00000oIO = 0;
                private static final boolean zza = zzawg.zza(zzbfy.class.getClassLoader());

                @Override
                public final zzayl zza(URI uri, zzayd zzaydVar) {
/* 11 */            if (!"dns".equals(uri.getScheme())) {
/* 57 */                return null;
                    }
/* 13 */            String path = uri.getPath();
/* 19 */            zzgo.zzc(path, "targetPath");
/* 30 */            zzgo.zzk(path.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", path, uri);
/* 53 */            return new zzbfx(uri.getAuthority(), path.substring(1), zzaydVar, zzbgr.zzi, zzgs.zzb(), zza);
                }

                @Override
                public final String zzb() {
/* 1 */             return "dns";
                }

                @Override
                public final int zzc() {
/* 1 */             return 5;
                }

                @Override
                public final Collection zzd() {
/* 3 */             return Collections.singleton(InetSocketAddress.class);
                }

                @Override
                public final boolean zze() {
/* 1 */             return true;
                }
            }

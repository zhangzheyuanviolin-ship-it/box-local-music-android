            package com.google.android.gms.internal.mlkit_genai_speech;

            import android.content.Intent;
            import java.net.URI;
            import java.net.URISyntaxException;
            import java.util.Collection;
            import java.util.Objects;
            
            public final class zzbbl extends zzaym {
                private static Intent zzf(URI uri) {
                    try {
/* 6 */                 return Intent.parseUri(uri.toString(), 1);
                    } catch (URISyntaxException e) {
/* 29 */                throw new IllegalArgumentException(e);
                    }
                }

                @Override
                public final zzayl zza(URI uri, zzayd zzaydVar) {
/* 11 */            if (Objects.equals(uri.getScheme(), "intent")) {
/* 19 */                return new zzbbk(zzf(uri), zzaydVar);
                    }
/* 23 */            return null;
                }

                @Override
                public final String zzb() {
/* 1 */             return "intent";
                }

                @Override
                public final int zzc() {
/* 1 */             return 3;
                }

                @Override
                public final Collection zzd() {
/* 3 */             return zzho.zzk(zzazq.class);
                }

                @Override
                public final boolean zze() {
/* 1 */             return true;
                }
            }

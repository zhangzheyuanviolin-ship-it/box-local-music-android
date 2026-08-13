            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.io.ByteArrayOutputStream;
            import java.io.IOException;
            import java.util.Map;
            import p000.OIOi0lOI;
            
            public final class zzkf {
                private final Map zza;
                private final Map zzb;
                private final OIOi0lOI zzc;

                public zzkf(Map map, Map map2, OIOi0lOI oIOi0lOI) {
/* 4 */             this.zza = map;
/* 6 */             this.zzb = map2;
/* 8 */             this.zzc = oIOi0lOI;
                }

                public final byte[] zza(Object obj) {
/* 3 */             ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
/* 17 */                new zzkc(byteArrayOutputStream, this.zza, this.zzb, this.zzc).zzf(obj);
                    } catch (IOException unused) {
                    }
/* 20 */            return byteArrayOutputStream.toByteArray();
                }
            }

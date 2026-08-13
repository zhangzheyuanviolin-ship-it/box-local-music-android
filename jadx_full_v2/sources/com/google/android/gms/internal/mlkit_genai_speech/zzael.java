            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzael {
                private static zzael zza;

                private zzael() {
                }

                public static synchronized zzael zza() {
                    zzael zzaelVar;
/* 4 */             zzaelVar = zza;
/* 6 */             if (zzaelVar == null) {
/* 10 */                zzaelVar = new zzael();
/* 13 */                zza = zzaelVar;
                    }
/* 19 */            return zzaelVar;
                }
            }

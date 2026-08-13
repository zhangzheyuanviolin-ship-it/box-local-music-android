            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzaek {
                private static zzaei zza;

                public static synchronized zzaeb zza(zzadw zzadwVar) {
                    zzaei zzaeiVar;
                    try {
/* 4 */                 zzaeiVar = zza;
/* 6 */                 if (zzaeiVar == null) {
/* 11 */                    zzaeiVar = new zzaei(null);
/* 14 */                    zza = zzaeiVar;
                        }
                    } catch (Throwable th) {
/* 29 */                throw th;
                    }
/* 23 */            return (zzaeb) zzaeiVar.get(zzadwVar);
                }

                public static synchronized zzaeb zzb(String str) {
/* 14 */            return zza(zzadw.zzd("genai-speech-recognition").zzd());
                }
            }

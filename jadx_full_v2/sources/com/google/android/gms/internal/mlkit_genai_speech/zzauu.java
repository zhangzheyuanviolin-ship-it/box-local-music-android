            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Collections;
            import java.util.List;
            
            final class zzauu {
                private static zzauu zza;
                private final List zzb = Collections.EMPTY_LIST;
                private int zzc = 0;

                public static synchronized zzauu zza() {
                    zzauu zzauuVar;
/* 4 */             zzauuVar = zza;
/* 6 */             if (zzauuVar == null) {
/* 10 */                zzauuVar = new zzauu();
/* 13 */                zza = zzauuVar;
                    }
/* 19 */            return zzauuVar;
                }

                public final synchronized List zzb() {
                    this.zzc++;
/* 8 */             return this.zzb;
                }

                public final synchronized boolean zzc() {
/* 3 */             return false;
                }
            }

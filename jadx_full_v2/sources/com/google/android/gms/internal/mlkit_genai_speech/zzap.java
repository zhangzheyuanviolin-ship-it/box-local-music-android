            package com.google.android.gms.internal.mlkit_genai_speech;

            import p000.I000II;
            
            public enum zzap implements zzagi {
                UNKNOWN(0),
                DIRECT_API(1),
                MLKIT_SDK(2),
                UNRECOGNIZED(-1);

                private final int zzf;

                zzap(int i) {
/* 4 */             this.zzf = i;
                }

                @Override
                public final String toString() {
/* 3 */             return Integer.toString(this.zzf);
                }

                @Override
                public final int zza() {
/* 3 */             if (this != UNRECOGNIZED) {
/* 5 */                 return this.zzf;
                    }
/* 10 */            I000II.I000iOII("Can't get the number of an unknown enum value.");
/* 13 */            return 0;
                }
            }

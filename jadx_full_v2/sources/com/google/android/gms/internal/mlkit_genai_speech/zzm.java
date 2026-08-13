            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public enum zzm implements zzagi {
                RECOGNIZER_MODE_UNDEFINED(0),
                RECOGNIZER_MODE_ONDEVICE_ONLY(1),
                RECOGNIZER_MODE_ONLINE_PRIMARY(2),
                RECOGNIZER_MODE_ONDEVICE_PRIMARY(3),
                RECOGNIZER_MODE_ONLINE_ONLY(4);

                private final int zzg;

                zzm(int i) {
/* 4 */             this.zzg = i;
                }

                public static zzagk zzb() {
/* 1 */             return zzl.zza;
                }

                @Override
                public final String toString() {
/* 3 */             return Integer.toString(this.zzg);
                }

                @Override
                public final int zza() {
/* 1 */             return this.zzg;
                }
            }

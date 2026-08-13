            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public enum zzakm implements zzagi {
                UNKNOWN(0),
                DEFAULT_ONESHOT(1),
                DEFAULT_CONTINUOUS(2),
                AMBIENT_ONESHOT(3),
                AMBIENT_CONTINUOUS(4),
                AMBIENT_TELEPHONY(7),
                FARFIELD_ONESHOT(5),
                FARFIELD_CONTINUOUS(6),
                NATCON_ONESHOT(9),
                HIGH_QUALITY_CONTINUOUS(10),
                BALANCED_CONTINUOUS(11);

                private final int zzm;

                zzakm(int i) {
/* 4 */             this.zzm = i;
                }

                public static zzagk zzb() {
/* 1 */             return zzakl.zza;
                }

                @Override
                public final String toString() {
/* 3 */             return Integer.toString(this.zzm);
                }

                @Override
                public final int zza() {
/* 1 */             return this.zzm;
                }
            }

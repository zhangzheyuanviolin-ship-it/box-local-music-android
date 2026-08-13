            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.nio.charset.StandardCharsets;
            
            public enum zzayz {
                OK(0),
                CANCELLED(1),
                UNKNOWN(2),
                INVALID_ARGUMENT(3),
                DEADLINE_EXCEEDED(4),
                NOT_FOUND(5),
                ALREADY_EXISTS(6),
                PERMISSION_DENIED(7),
                RESOURCE_EXHAUSTED(8),
                FAILED_PRECONDITION(9),
                ABORTED(10),
                OUT_OF_RANGE(11),
                UNIMPLEMENTED(12),
                INTERNAL(13),
                UNAVAILABLE(14),
                DATA_LOSS(15),
                UNAUTHENTICATED(16);

                private final int zzs;
                private final byte[] zzt;

                zzayz(int i) {
/* 4 */             this.zzs = i;
/* 16 */            this.zzt = Integer.toString(i).getBytes(StandardCharsets.US_ASCII);
                }

                public final int zza() {
/* 1 */             return this.zzs;
                }

                public final zzazd zzb() {
/* 11 */            return (zzazd) zzazd.zzk.get(this.zzs);
                }
            }

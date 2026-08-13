            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public enum zzco implements zzagi {
                END_REASON_UNKNOWN(0),
                END_REASON_COMPLETE(1),
                END_REASON_SCHEDULED(2),
                END_REASON_MODEL_UNAVAILABLE(3),
                END_REASON_DOWNLOAD_ERROR(4),
                END_REASON_NO_INTERNET_CONNECTION(5);

                private final int zzh;

                zzco(int i) {
/* 4 */             this.zzh = i;
                }

                public static zzco zzb(int i) {
/* 1 */             if (i == 0) {
/* 35 */                return END_REASON_UNKNOWN;
                    }
/* 4 */             if (i == 1) {
/* 32 */                return END_REASON_COMPLETE;
                    }
/* 7 */             if (i == 2) {
/* 29 */                return END_REASON_SCHEDULED;
                    }
/* 10 */            if (i == 3) {
/* 26 */                return END_REASON_MODEL_UNAVAILABLE;
                    }
/* 13 */            if (i == 4) {
/* 23 */                return END_REASON_DOWNLOAD_ERROR;
                    }
/* 16 */            if (i != 5) {
/* 18 */                return null;
                    }
/* 20 */            return END_REASON_NO_INTERNET_CONNECTION;
                }

                @Override
                public final String toString() {
/* 3 */             return Integer.toString(this.zzh);
                }

                @Override
                public final int zza() {
/* 1 */             return this.zzh;
                }
            }

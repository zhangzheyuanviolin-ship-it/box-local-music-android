            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.time.Instant;
            import java.util.concurrent.TimeUnit;
            
            final class zzbgv implements zzbnl {
                @Override
                public final long zza() {
/* 1 */             Instant instantNow = Instant.now();
/* 11 */            long nanos = TimeUnit.SECONDS.toNanos(instantNow.getEpochSecond());
/* 15 */            long nano = instantNow.getNano();
/* 20 */            long j = nanos + nano;
                    return (((nano ^ nanos) > 0L ? 1 : ((nano ^ nanos) == 0L ? 0 : -1)) < 0) | ((nanos ^ j) >= 0) ? j : ((j >>> 63) ^ 1) + Long.MAX_VALUE;
                }
            }

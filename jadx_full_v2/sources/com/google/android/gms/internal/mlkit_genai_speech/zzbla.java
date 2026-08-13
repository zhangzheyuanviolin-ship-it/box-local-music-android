            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.lang.Thread;
            import java.util.Objects;
            
            final class zzbla implements Thread.UncaughtExceptionHandler {
                public zzbla(zzbmj zzbmjVar) {
/* 1 */             Objects.requireNonNull(zzbmjVar);
                }

                @Override
                public final void uncaughtException(Thread thread, Throwable th) {
/* 37 */            throw new zzazg(zzazd.zzc(th).zze("Uncaught exception in the SynchronizationContext. Re-thrown."), null);
                }
            }

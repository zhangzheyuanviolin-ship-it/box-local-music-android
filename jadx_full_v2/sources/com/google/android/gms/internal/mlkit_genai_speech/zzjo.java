            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.lang.Thread;
            import java.util.Locale;
            import java.util.Objects;
            import java.util.concurrent.ThreadFactory;
            import java.util.concurrent.atomic.AtomicLong;
            
            final class zzjo implements ThreadFactory {
                final ThreadFactory zza;
                final String zzb;
                final AtomicLong zzc;
                final Boolean zzd;

                public zzjo(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
/* 1 */             this.zza = threadFactory;
/* 3 */             this.zzb = str;
/* 5 */             this.zzc = atomicLong;
/* 7 */             this.zzd = bool;
                }

                @Override
                public final Thread newThread(Runnable runnable) {
/* 3 */             Thread threadNewThread = this.zza.newThread(runnable);
/* 7 */             Objects.requireNonNull(threadNewThread);
/* 10 */            String str = this.zzb;
/* 12 */            if (str != null) {
/* 14 */                AtomicLong atomicLong = this.zzc;
/* 16 */                Objects.requireNonNull(atomicLong);
/* 37 */                threadNewThread.setName(String.format(Locale.ROOT, str, Long.valueOf(atomicLong.getAndIncrement())));
                    }
/* 42 */            if (this.zzd != null) {
/* 45 */                threadNewThread.setDaemon(true);
                    }
/* 77 */            return threadNewThread;
                }
            }

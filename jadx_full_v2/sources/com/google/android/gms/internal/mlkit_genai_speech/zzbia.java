            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.lang.Thread;
            import java.util.Objects;
            import java.util.logging.Level;
            import p000.IlIi0I0;
            
            final class zzbia implements Thread.UncaughtExceptionHandler {
                final zzbjd zza;

                public zzbia(zzbjd zzbjdVar) {
/* 1 */             Objects.requireNonNull(zzbjdVar);
/* 4 */             this.zza = zzbjdVar;
                }

                @Override
                public final void uncaughtException(Thread thread, Throwable th) {
/* 1 */             zzbjd zzbjdVar = this.zza;
/* 28 */            zzbjd.zza.logp(Level.SEVERE, "io.grpc.internal.ManagedChannelImpl$3", "uncaughtException", IlIi0I0.I000lI("[", String.valueOf(zzbjdVar.zzc()), "] Uncaught exception in the SynchronizationContext. Panic!"), th);
                    try {
/* 31 */                zzbjdVar.zzaa(th);
                    } catch (Throwable th2) {
/* 61 */                zzbjd.zza.logp(Level.SEVERE, "io.grpc.internal.ManagedChannelImpl$3", "uncaughtException", IlIi0I0.I000lI("[", String.valueOf(this.zza.zzc()), "] Uncaught exception while panicking"), th2);
                    }
                }
            }

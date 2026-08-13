            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.logging.Level;
            import java.util.logging.Logger;
            import p000.I000II;
            import p000.IlIi0I0;
            
            public final class zzbhs implements Runnable {
                private static final Logger zza = Logger.getLogger(zzbhs.class.getName());
                private final Runnable zzb;

                public zzbhs(Runnable runnable) {
/* 4 */             this.zzb = runnable;
                }

                @Override
                public final void run() {
                    try {
/* 3 */                 this.zzb.run();
                    } catch (Throwable th) {
/* 29 */                zza.logp(Level.SEVERE, "io.grpc.internal.LogExceptionRunnable", "run", "Exception while executing runnable ".concat(this.zzb.toString()), th);
/* 32 */                int i = zzgv.zza;
/* 36 */                if (th instanceof RuntimeException) {
/* 55 */                    throw ((RuntimeException) th);
                        }
/* 40 */                if (th instanceof Error) {
/* 48 */                    throw ((Error) th);
                        }
/* 42 */                I000II.I000O01llI0(th);
                    }
                }

                public final String toString() {
/* 11 */            return IlIi0I0.I000lI("LogExceptionRunnable(", this.zzb.toString(), ")");
                }
            }

            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            
            final class zzjk implements Runnable {
                final Runnable zza;

                public zzjk(zzjn zzjnVar, Runnable runnable) {
/* 1 */             this.zza = runnable;
/* 3 */             Objects.requireNonNull(zzjnVar);
                }

                @Override
                public final void run() {
/* 3 */             this.zza.run();
                }

                public final String toString() {
/* 3 */             return this.zza.toString();
                }
            }

            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            import java.util.concurrent.Callable;
            
            final class zzjq extends zzjg {
                final zzjr zza;
                private final Callable zzb;

                public zzjq(zzjr zzjrVar, Callable callable) {
/* 1 */             Objects.requireNonNull(zzjrVar);
/* 4 */             this.zza = zzjrVar;
/* 9 */             this.zzb = callable;
                }

                @Override
                public final Object zza() {
/* 3 */             return this.zzb.call();
                }

                @Override
                public final String zzb() {
/* 3 */             return this.zzb.toString();
                }

                @Override
                public final void zzc(Throwable th) {
/* 3 */             this.zza.zzg(th);
                }

                @Override
                public final void zzd(Object obj) {
/* 3 */             this.zza.zzf(obj);
                }

                @Override
                public final boolean zzf() {
/* 3 */             return this.zza.isDone();
                }
            }

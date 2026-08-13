            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
            
            final class zzbms extends zzbmr {
                private final AtomicIntegerFieldUpdater zza;

                public zzbms(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, zzbmu zzbmuVar) {
/* 2 */             super(null);
/* 5 */             this.zza = atomicIntegerFieldUpdater;
                }

                @Override
                public final void zza(zzbmv zzbmvVar, int i) {
/* 4 */             this.zza.set(zzbmvVar, 0);
                }

                @Override
                public final boolean zzb(zzbmv zzbmvVar, int i, int i2) {
/* 5 */             return this.zza.compareAndSet(zzbmvVar, 0, -1);
                }
            }

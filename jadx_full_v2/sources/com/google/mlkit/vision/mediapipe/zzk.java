            package com.google.mlkit.vision.mediapipe;

            import com.google.android.gms.internal.mlkit_vision_mediapipe.zzhl;
            import com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv;
            
            final class zzk implements MediaPipeInput {
                private final float zza;
                private final long zzb;

                public zzk(float f, long j) {
/* 4 */             this.zza = f;
/* 6 */             this.zzb = j;
                }

                @Override
                public final long zza() {
/* 1 */             return this.zzb;
                }

                @Override
                public final zzhv zzb(zzhl zzhlVar) {
/* 3 */             return zzhlVar.zzc(this.zza);
                }
            }

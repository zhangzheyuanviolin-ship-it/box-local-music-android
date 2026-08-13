            package com.google.mlkit.vision.mediapipe;

            import com.google.android.gms.internal.mlkit_vision_mediapipe.zzhl;
            import com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv;
            
            final class zzl implements MediaPipeInput {
                private final int zza;
                private final long zzb;

                public zzl(int i, long j) {
/* 4 */             this.zza = i;
/* 6 */             this.zzb = j;
                }

                @Override
                public final long zza() {
/* 1 */             return this.zzb;
                }

                @Override
                public final zzhv zzb(zzhl zzhlVar) {
/* 3 */             return zzhlVar.zzd(this.zza);
                }
            }

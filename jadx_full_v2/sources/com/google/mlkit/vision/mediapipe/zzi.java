            package com.google.mlkit.vision.mediapipe;

            import com.google.android.gms.internal.mlkit_vision_mediapipe.zzhl;
            import com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv;
            
            final class zzi implements MediaPipeInput {
                private final boolean zza;
                private final long zzb;

                public zzi(boolean z, long j) {
/* 4 */             this.zza = z;
/* 6 */             this.zzb = j;
                }

                @Override
                public final long zza() {
/* 1 */             return this.zzb;
                }

                @Override
                public final zzhv zzb(zzhl zzhlVar) {
/* 3 */             return zzhlVar.zzb(this.zza);
                }
            }

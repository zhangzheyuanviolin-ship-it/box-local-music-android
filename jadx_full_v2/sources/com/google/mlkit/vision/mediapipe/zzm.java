            package com.google.mlkit.vision.mediapipe;

            import com.google.android.gms.internal.mlkit_vision_mediapipe.zzhl;
            import com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv;
            
            final class zzm implements MediaPipeInput {
                private final String zza;
                private final long zzb;

                public zzm(String str, long j) {
/* 4 */             this.zza = str;
/* 6 */             this.zzb = j;
                }

                @Override
                public final long zza() {
/* 1 */             return this.zzb;
                }

                @Override
                public final zzhv zzb(zzhl zzhlVar) {
/* 3 */             return zzhlVar.zzg(this.zza);
                }
            }

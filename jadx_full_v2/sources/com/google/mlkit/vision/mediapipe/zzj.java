            package com.google.mlkit.vision.mediapipe;

            import com.google.android.gms.internal.mlkit_vision_mediapipe.zzhl;
            import com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv;
            import java.nio.ByteBuffer;
            
            final class zzj implements MediaPipeInput {
                private final ByteBuffer zza;
                private final int zzb;
                private final int zzc;
                private final long zzd;

                public zzj(ByteBuffer byteBuffer, int i, int i2, long j) {
/* 4 */             this.zza = byteBuffer;
/* 6 */             this.zzb = i;
/* 8 */             this.zzc = i2;
/* 10 */            this.zzd = j;
                }

                @Override
                public final long zza() {
/* 1 */             return this.zzd;
                }

                @Override
                public final zzhv zzb(zzhl zzhlVar) {
/* 7 */             return zzhlVar.zzf(this.zza, this.zzb, this.zzc);
                }
            }

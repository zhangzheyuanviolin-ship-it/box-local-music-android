            package com.google.mlkit.vision.mediapipe;

            import android.graphics.Bitmap;
            import android.util.Log;
            import com.google.android.gms.internal.mlkit_vision_mediapipe.zzhl;
            import com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv;
            
            final class zzh implements MediaPipeInput {
                private final Bitmap zza;
                private final long zzb;

                public zzh(Bitmap bitmap, long j) {
/* 4 */             this.zza = bitmap;
/* 6 */             this.zzb = j;
                }

                @Override
                public final long zza() {
/* 1 */             return this.zzb;
                }

                @Override
                public final zzhv zzb(zzhl zzhlVar) {
/* 3 */             Bitmap.Config config = this.zza.getConfig();
/* 7 */             Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
/* 9 */             if (config == config2) {
/* 52 */                return zzhlVar.zza(this.zza);
                    }
/* 18 */            if (Log.isLoggable("MediaPipeInputBitmap", 3)) {
/* 32 */                "Input bitmap is not ARGB_8888 config. Converting it to ARGB_8888 from ".concat(String.valueOf(this.zza.getConfig()));
                    }
/* 35 */            Bitmap bitmap = this.zza;
/* 45 */            return zzhlVar.zza(bitmap.copy(config2, bitmap.isMutable()));
                }
            }

            package com.google.mlkit.vision.mediapipe;

            import android.graphics.Bitmap;
            import java.nio.ByteBuffer;
            
/* 9 */     public class MediaPipeInputFactory {
                private MediaPipeInputFactory() {
                }

                public static MediaPipeInput getDelegateInputSidePacketGpu(boolean z, boolean z2, String str, String str2) {
/* 3 */             return new zzb(z, z2, str, str2);
                }

                public static MediaPipeInput getDelegateInputSidePacketNnapi(String str, String str2) {
/* 3 */             return new zzc(str, str2);
                }

                public static MediaPipeInput getMediaPipeInput(ByteBuffer byteBuffer, int i, int i2, long j) {
/* 7 */             return new zzj(byteBuffer, i, i2, j);
                }

/* 10 */        public static MediaPipeInput getMediaPipeInput(int i, long j) {
/* 11 */            return new zzl(i, j);
                }

/* 11 */        public static MediaPipeInput getMediaPipeInput(Bitmap bitmap, long j) {
/* 12 */            return new zzh(bitmap, j);
                }

/* 12 */        public static MediaPipeInput getMediaPipeInput(String str, long j) {
/* 13 */            return new zzm(str, j);
                }

/* 13 */        public static MediaPipeInput getMediaPipeInput(float f, long j) {
/* 14 */            return new zzk(f, j);
                }

/* 14 */        public static MediaPipeInput getMediaPipeInput(boolean z, long j) {
/* 15 */            return new zzi(z, j);
                }
            }

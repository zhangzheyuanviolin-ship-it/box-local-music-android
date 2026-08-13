            package com.google.mlkit.vision.mediapipe.utils;

            import android.media.Image;
            import com.google.mlkit.vision.common.InputImage;
            import com.google.mlkit.vision.common.internal.ImageConvertUtils;
            import java.nio.ByteBuffer;
            import p000.l11ll1Oo;
            import p000.lII0I0I000I;
            
            public class ImageConvertNativeUtils {
                private ImageConvertNativeUtils() {
                }

                private static native byte[] byteArrayToRgb(byte[] bArr, int i, int i2, int i3, int i4);

                /* JADX WARN: Removed duplicated region for block: B:21:0x009b  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static byte[] getRgbBuffer(InputImage inputImage) {
                    byte[] bArrYuvPlanesToRgb;
/* 3 */             l11ll1Oo l11ll1ooI000O01llI0 = l11ll1Oo.I000O01llI0("ImageConvertNativeUtils#getRgbBuffer");
/* 7 */             l11ll1ooI000O01llI0.I00000oIO();
                    try {
/* 10 */                ByteBuffer byteBuffer = inputImage.getByteBuffer();
/* 14 */                if (byteBuffer != null && (inputImage.getFormat() == 17 || inputImage.getFormat() == 842094169)) {
/* 62 */                    bArrYuvPlanesToRgb = byteArrayToRgb(ImageConvertUtils.getInstance().byteBufferToByteArray(byteBuffer), inputImage.getWidth(), inputImage.getHeight(), inputImage.getRotationDegrees(), inputImage.getFormat());
                        } else if (inputImage.getFormat() != 35 || inputImage.getPlanes() == null) {
/* 156 */                   bArrYuvPlanesToRgb = null;
                        } else {
/* 82 */                    Image.Plane[] planes = inputImage.getPlanes();
/* 86 */                    lII0I0I000I.I000II(planes);
/* 91 */                    if (planes.length == 3) {
/* 93 */                        Image.Plane[] planes2 = inputImage.getPlanes();
/* 97 */                        lII0I0I000I.I000II(planes2);
/* 151 */                       bArrYuvPlanesToRgb = yuvPlanesToRgb(planes2[0].getBuffer(), planes2[1].getBuffer(), planes2[2].getBuffer(), inputImage.getWidth(), inputImage.getHeight(), planes2[0].getRowStride(), planes2[1].getRowStride(), planes2[1].getPixelStride(), inputImage.getRotationDegrees());
                            }
                        }
/* 157 */               l11ll1ooI000O01llI0.close();
/* 160 */               return bArrYuvPlanesToRgb;
                    } catch (Throwable th) {
                        try {
/* 161 */                   l11ll1ooI000O01llI0.close();
/* 186 */                   throw th;
                        } catch (Throwable th2) {
/* 166 */                   th.addSuppressed(th2);
/* 186 */                   throw th;
                        }
                    }
                }

                private static native byte[] yuvPlanesToRgb(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, int i4, int i5, int i6);
            }

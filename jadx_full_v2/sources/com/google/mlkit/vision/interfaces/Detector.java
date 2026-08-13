            package com.google.mlkit.vision.interfaces;

            import android.graphics.Bitmap;
            import android.graphics.Matrix;
            import android.media.Image;
            import java.io.Closeable;
            import java.lang.annotation.Retention;
            import java.lang.annotation.RetentionPolicy;
            import java.nio.ByteBuffer;
            import p000.O0oiO0ilooli;
            import p000.OloIIoII1oo;
            
            public interface Detector<DetectionResultT> extends Closeable, O0oiO0ilooli {
                public static final int TYPE_BARCODE_SCANNING = 1;
                public static final int TYPE_DOCUMENT_DETECTION = 10;
                public static final int TYPE_FACE_DETECTION = 2;
                public static final int TYPE_IMAGE_CAPTIONING = 9;
                public static final int TYPE_IMAGE_LABELING = 3;
                public static final int TYPE_OBJECT_DETECTION = 5;
                public static final int TYPE_POSE_DETECTION = 6;
                public static final int TYPE_SEGMENTATION = 7;
                public static final int TYPE_SELFIE_FACE_DETECTION = 8;
                public static final int TYPE_SUBJECT_SEGMENTATION = 11;
                public static final int TYPE_TEXT_RECOGNITION = 4;

                @Retention(RetentionPolicy.CLASS)
                public @interface DetectorType {
                }

                int getDetectorType();

                OloIIoII1oo process(Bitmap bitmap, int i);

                OloIIoII1oo process(Image image, int i);

                OloIIoII1oo process(Image image, int i, Matrix matrix);

                OloIIoII1oo process(ByteBuffer byteBuffer, int i, int i2, int i3, int i4);
            }

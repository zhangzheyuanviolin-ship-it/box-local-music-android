            package com.google.mlkit.vision.face.bundled.internal;

            import android.content.Context;
            import com.google.android.gms.vision.face.FaceDetectorV2Jni;
            import p000.IoOlilli0ol;
            import p000.OIOiOlIO01;
            import p000.loI1oilO;
            import p000.loIol0iOiooO;
            import p000.loOI100O;
            
            public class ThickFaceDetectorCreator extends loOI100O {
                static {
/* 3 */             System.loadLibrary("face_detector_v2_jni");
                }

                @Override
                public loIol0iOiooO newFaceDetector(IoOlilli0ol ioOlilli0ol, loI1oilO loi1oilo) {
/* 14 */            return new zza((Context) OIOiOlIO01.I00O0o1oo(ioOlilli0ol), loi1oilo, new FaceDetectorV2Jni());
                }
            }

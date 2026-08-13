            package com.google.mlkit.vision.pose;

            import com.google.mlkit.vision.common.InputImage;
            import com.google.mlkit.vision.interfaces.Detector;
            import p000.O0oOOiI0;
            import p000.O1o00iolI11;
            import p000.OIi011o01;
            import p000.OloIIoII1oo;
            
            public interface PoseDetector extends Detector<Pose> {
                @Override
                @OIi011o01(O0oOOiI0.ON_DESTROY)
                void close();

                OloIIoII1oo closeWithTask();

                OloIIoII1oo getInitTask();

                OloIIoII1oo process(O1o00iolI11 o1o00iolI11);

                OloIIoII1oo process(InputImage inputImage);
            }

            package com.google.mlkit.vision.segmentation.subject;

            import com.google.mlkit.vision.common.InputImage;
            import com.google.mlkit.vision.interfaces.Detector;
            import p000.IlIII1l;
            import p000.O0oOOiI0;
            import p000.O1o00iolI11;
            import p000.OIi011o01;
            import p000.OIiiIllOIo;
            import p000.OloIIoII1oo;
            
            public interface SubjectSegmenter extends Detector<SubjectSegmentationResult>, OIiiIllOIo {
                @Override
                @OIi011o01(O0oOOiI0.ON_DESTROY)
                void close();

                OloIIoII1oo getInitTask();

                @Override
                IlIII1l[] getOptionalFeatures();

                OloIIoII1oo process(O1o00iolI11 o1o00iolI11);

                OloIIoII1oo process(InputImage inputImage);
            }

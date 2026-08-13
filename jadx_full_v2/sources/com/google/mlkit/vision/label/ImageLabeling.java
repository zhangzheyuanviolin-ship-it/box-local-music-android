            package com.google.mlkit.vision.label;

            import com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator;
            import p000.lII0I0I000I;
            
            public class ImageLabeling {
                private ImageLabeling() {
                }

                public static ImageLabeler getClient(ImageLabelerOptionsBase imageLabelerOptionsBase) {
/* 3 */             lII0I0I000I.I000O01llI0("options cannot be null", imageLabelerOptionsBase);
/* 14 */            return (ImageLabeler) MultiFlavorDetectorCreator.getInstance().create(imageLabelerOptionsBase);
                }
            }

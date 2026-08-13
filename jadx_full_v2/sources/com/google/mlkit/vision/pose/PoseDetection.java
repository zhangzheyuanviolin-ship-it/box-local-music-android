            package com.google.mlkit.vision.pose;

            import com.google.mlkit.vision.pose.internal.PoseDetectorImpl;
            import p000.lII0I0I000I;
            
            public class PoseDetection {
                private PoseDetection() {
                }

                public static PoseDetector getClient(PoseDetectorOptionsBase poseDetectorOptionsBase) {
/* 3 */             lII0I0I000I.I000O01llI0("PoseDetectorOptionsBase can not be null.", poseDetectorOptionsBase);
/* 6 */             return PoseDetectorImpl.newInstance(poseDetectorOptionsBase);
                }
            }

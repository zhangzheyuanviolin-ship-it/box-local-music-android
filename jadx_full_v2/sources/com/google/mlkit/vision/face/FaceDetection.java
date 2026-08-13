            package com.google.mlkit.vision.face;

            import com.google.mlkit.vision.face.internal.zzc;
            import p000.O1o0111OI00;
            import p000.lII0I0I000I;
            
/* 21 */    public class FaceDetection {
                private FaceDetection() {
                }

                public static FaceDetector getClient(FaceDetectorOptions faceDetectorOptions) {
/* 3 */             lII0I0I000I.I000O01llI0("You must provide a valid FaceDetectorOptions.", faceDetectorOptions);
/* 18 */            return ((zzc) O1o0111OI00.I0000Il00O().I00000oIO(zzc.class)).zzb(faceDetectorOptions);
                }

/* 22 */        public static FaceDetector getClient() {
/* 23 */            return ((zzc) O1o0111OI00.I0000Il00O().I00000oIO(zzc.class)).zza();
                }
            }

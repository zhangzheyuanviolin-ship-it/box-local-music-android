            package com.google.mlkit.vision.facemesh;

            import p000.O1o0111OI00;
            import p000.lII0I0I000I;
            
/* 21 */    public class FaceMeshDetection {
                private FaceMeshDetection() {
                }

                public static FaceMeshDetector getClient(FaceMeshDetectorOptions faceMeshDetectorOptions) {
/* 3 */             lII0I0I000I.I000O01llI0("You must provide a valid FaceMeshDetectorOptions.", faceMeshDetectorOptions);
/* 18 */            return ((com.google.mlkit.vision.facemesh.internal.zza) O1o0111OI00.I0000Il00O().I00000oIO(com.google.mlkit.vision.facemesh.internal.zza.class)).zzb(faceMeshDetectorOptions);
                }

/* 22 */        public static FaceMeshDetector getClient() {
/* 23 */            return ((com.google.mlkit.vision.facemesh.internal.zza) O1o0111OI00.I0000Il00O().I00000oIO(com.google.mlkit.vision.facemesh.internal.zza.class)).zza();
                }
            }

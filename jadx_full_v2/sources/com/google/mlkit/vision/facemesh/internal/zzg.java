            package com.google.mlkit.vision.facemesh.internal;

            import com.google.mlkit.vision.facemesh.FaceMeshDetectorOptions;
            import java.lang.invoke.VarHandle;
            import p000.ll10Ol;
            import p000.ll1IO0lOO;
            
            public final class zzg {
                public static ll1IO0lOO zza(FaceMeshDetectorOptions faceMeshDetectorOptions) {
/* 1 */             int iZza = faceMeshDetectorOptions.zza();
/* 16 */            ll10Ol ll10ol = iZza != 0 ? iZza != 1 ? ll10Ol.UNKNOWN : ll10Ol.FACE_MESH : ll10Ol.BOUNDING_BOX_ONLY;
/* 20 */            ll1IO0lOO ll1io0loo = new ll1IO0lOO();
/* 23 */            ll1io0loo.I00000oIO = ll10ol;
/* 25 */            VarHandle.storeStoreFence();
/* 49 */            return ll1io0loo;
                }
            }

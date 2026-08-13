            package com.google.mlkit.vision.facemesh.internal;

            import com.google.mlkit.vision.common.InputImage;
            import com.google.mlkit.vision.common.internal.MobileVisionBase;
            import com.google.mlkit.vision.facemesh.FaceMeshDetector;
            import com.google.mlkit.vision.facemesh.FaceMeshDetectorOptions;
            import java.lang.invoke.VarHandle;
            import p000.I00Ol00;
            import p000.IOiOol0;
            import p000.Il1I0i;
            import p000.O1o00iolI11;
            import p000.OloIIoII1oo;
            import p000.li0lOl1IO;
            import p000.li10OOoO0loI;
            import p000.ll00o1ll;
            import p000.ll1IO0lOO;
            import p000.loiI0oIOO;
            
/* 4 */     public final class zzb extends MobileVisionBase implements FaceMeshDetector {
                static final FaceMeshDetectorOptions zzb = new FaceMeshDetectorOptions.Builder().build();

                public zzb(zzf zzfVar, Il1I0i il1I0i, FaceMeshDetectorOptions faceMeshDetectorOptions, loiI0oIOO loii0oioo) {
/* 9 */             super(zzfVar, il1I0i.I00000oIO(faceMeshDetectorOptions.zzb()));
/* 16 */            IOiOol0 iOiOol0 = new IOiOol0(13);
/* 21 */            iOiOol0.I00iio = li0lOl1IO.TYPE_THICK;
/* 23 */            ll1IO0lOO ll1io0looZza = zzg.zza(faceMeshDetectorOptions);
/* 29 */            ll00o1ll ll00o1llVar = new ll00o1ll();
/* 32 */            ll00o1llVar.I00000oIO = ll1io0looZza;
/* 34 */            VarHandle.storeStoreFence();
/* 37 */            iOiOol0.I00ilI0I1 = ll00o1llVar;
/* 52 */            loii0oioo.I00000oOI(new I00Ol00(iOiOol0, 1, (byte) 0), li10OOoO0loI.ON_DEVICE_FACE_MESH_CREATE, loii0oioo.I0000Il00O());
                }

                @Override
                public final int getDetectorType() {
/* 1 */             return 8;
                }

                @Override
                public final OloIIoII1oo process(O1o00iolI11 o1o00iolI11) {
/* 1 */             return super.processBase(o1o00iolI11);
                }

                @Override
/* 5 */         public final OloIIoII1oo process(InputImage inputImage) {
/* 6 */             return super.processBase(inputImage);
                }
            }

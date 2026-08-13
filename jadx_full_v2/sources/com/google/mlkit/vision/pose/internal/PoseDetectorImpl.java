            package com.google.mlkit.vision.pose.internal;

            import com.google.mlkit.vision.common.InputImage;
            import com.google.mlkit.vision.common.internal.MobileVisionBase;
            import com.google.mlkit.vision.pose.Pose;
            import com.google.mlkit.vision.pose.PoseDetector;
            import com.google.mlkit.vision.pose.PoseDetectorOptionsBase;
            import java.lang.invoke.VarHandle;
            import p000.IOiOol0;
            import p000.Il1I0i;
            import p000.O1o00iolI11;
            import p000.O1o0111OI00;
            import p000.OloIIoII1oo;
            import p000.lII0I0I000I;
            import p000.lioi0il00i;
            import p000.lioiiIOoil;
            import p000.lo0O0OO1i;
            import p000.lo1I1l1Oo1I1;
            import p000.o0OIl1o1i0Oi;
            import p000.o0Oll1li;
            import p000.o0i0Ill1olo;
            
/* 4 */     public class PoseDetectorImpl extends MobileVisionBase<Pose> implements PoseDetector {
                private final PoseDetectorOptionsBase zzb;

                private PoseDetectorImpl(O1o0111OI00 o1o0111OI00, PoseDetectorOptionsBase poseDetectorOptionsBase) {
/* 31 */            super((zzh) ((zze) o1o0111OI00.I00000oIO(zze.class)).get(poseDetectorOptionsBase), ((Il1I0i) o1o0111OI00.I00000oIO(Il1I0i.class)).I00000oIO(poseDetectorOptionsBase.getExecutor()));
/* 34 */            this.zzb = poseDetectorOptionsBase;
/* 38 */            zzd(lioiiIOoil.ON_DEVICE_POSE_CREATE, poseDetectorOptionsBase);
                }

                public static PoseDetectorImpl newInstance(PoseDetectorOptionsBase poseDetectorOptionsBase) {
/* 3 */             lII0I0I000I.I000O01llI0("PoseDetectorOptionsBase can not be null.", poseDetectorOptionsBase);
/* 12 */            return new PoseDetectorImpl(O1o0111OI00.I0000Il00O(), poseDetectorOptionsBase);
                }

                private static void zzd(lioiiIOoil lioiiiooil, PoseDetectorOptionsBase poseDetectorOptionsBase) {
/* 5 */             if (poseDetectorOptionsBase.isForBenchmark()) {
/* 7 */                 return;
                    }
/* 10 */            o0OIl1o1i0Oi o0oil1o1i0oiI00000oIO = o0i0Ill1olo.I00000oIO("pose-detection-common");
/* 18 */            IOiOol0 iOiOol0 = new IOiOol0(14);
/* 23 */            iOiOol0.I00iio = lioi0il00i.TYPE_THICK;
/* 25 */            lo1I1l1Oo1I1 lo1i1l1oo1i1Zzb = poseDetectorOptionsBase.zzb();
/* 31 */            lo0O0OO1i lo0o0oo1i = new lo0O0OO1i();
/* 35 */            lo0o0oo1i.I00000oIO = null;
/* 37 */            lo0o0oo1i.I00000oOI = null;
/* 39 */            lo0o0oo1i.I0000Il00O = lo1i1l1oo1i1Zzb;
/* 41 */            lo0o0oo1i.I0000O = null;
/* 43 */            lo0o0oo1i.I0000oI00 = null;
/* 45 */            lo0o0oo1i.I0001Ioi1lo = null;
/* 47 */            VarHandle.storeStoreFence();
/* 50 */            iOiOol0.I00ilI0I1 = lo0o0oo1i;
/* 63 */            o0oil1o1i0oiI00000oIO.I00000oOI(new o0Oll1li(iOiOol0, 1, (byte) 0), lioiiiooil, o0oil1o1i0oiI00000oIO.I0000Il00O());
                }

                @Override
                public final int getDetectorType() {
/* 1 */             return 6;
                }

                @Override
                public final OloIIoII1oo getInitTask() {
/* 5 */             zzd(lioiiIOoil.ON_DEVICE_POSE_PRELOAD, this.zzb);
/* 8 */             return super.getInitTaskBase();
                }

                @Override
                public OloIIoII1oo process(O1o00iolI11 o1o00iolI11) {
/* 1 */             return super.processBase(o1o00iolI11);
                }

                @Override
/* 5 */         public OloIIoII1oo process(InputImage inputImage) {
/* 6 */             return super.processBase(inputImage);
                }
            }

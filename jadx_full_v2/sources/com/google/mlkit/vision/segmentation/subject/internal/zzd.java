            package com.google.mlkit.vision.segmentation.subject.internal;

            import com.google.mlkit.vision.common.InputImage;
            import com.google.mlkit.vision.common.internal.MobileVisionBase;
            import com.google.mlkit.vision.segmentation.subject.SubjectSegmenter;
            import com.google.mlkit.vision.segmentation.subject.SubjectSegmenterOptions;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            import p000.I00Ol00;
            import p000.IOiOol0;
            import p000.IlIII1l;
            import p000.O1o00iolI11;
            import p000.OIiil10iiO;
            import p000.OloIIoII1oo;
            import p000.li0O0iolIoOi;
            import p000.li0lloo;
            import p000.llOoOI00I1o;
            import p000.lloolOoi;
            import p000.loi1ool;
            
/* 4 */     public final class zzd extends MobileVisionBase implements SubjectSegmenter {
                public zzd(SubjectSegmenterOptions subjectSegmenterOptions, zzj zzjVar, Executor executor, loi1ool loi1oolVar) {
/* 1 */             super(zzjVar, executor);
/* 8 */             IOiOol0 iOiOol0 = new IOiOol0(12);
/* 13 */            iOiOol0.I00iio = li0O0iolIoOi.TYPE_THIN;
/* 15 */            lloolOoi lloolooiZza = subjectSegmenterOptions.zza();
/* 21 */            llOoOI00I1o lloooi00i1o = new llOoOI00I1o();
/* 24 */            lloooi00i1o.I00000oIO = lloolooiZza;
/* 26 */            VarHandle.storeStoreFence();
/* 29 */            iOiOol0.I00ilI0I1 = lloooi00i1o;
/* 43 */            loi1oolVar.I00000oOI(new I00Ol00(iOiOol0, 1), li0lloo.ON_DEVICE_SUBJECT_SEGMENTATION_CREATE, loi1oolVar.I0000O());
                }

                @Override
                public final int getDetectorType() {
/* 1 */             return 11;
                }

                @Override
                public final OloIIoII1oo getInitTask() {
/* 1 */             return super.getInitTaskBase();
                }

                @Override
                public final IlIII1l[] getOptionalFeatures() {
/* 3 */             return new IlIII1l[]{OIiil10iiO.I000OiO};
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

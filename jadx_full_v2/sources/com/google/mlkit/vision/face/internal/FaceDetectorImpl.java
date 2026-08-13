            package com.google.mlkit.vision.face.internal;

            import com.google.mlkit.vision.common.InputImage;
            import com.google.mlkit.vision.common.internal.MobileVisionBase;
            import com.google.mlkit.vision.face.Face;
            import com.google.mlkit.vision.face.FaceDetector;
            import com.google.mlkit.vision.face.FaceDetectorOptions;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            import java.util.concurrent.Executor;
            import p000.I00Ol00;
            import p000.I0Oi111ii;
            import p000.Il1I0i;
            import p000.IlIII1l;
            import p000.O1o00iolI11;
            import p000.OIiil10iiO;
            import p000.OloIIoII1oo;
            import p000.lI0IOoI;
            import p000.lIIO1i1Oo01O;
            import p000.lIIl0IOioI;
            import p000.lIli10;
            import p000.li10lI1;
            import p000.liIl1O0ollo;
            
/* 4 */     public class FaceDetectorImpl extends MobileVisionBase<List<Face>> implements FaceDetector {
                static final FaceDetectorOptions zzb = new FaceDetectorOptions.Builder().build();
                private final boolean zzc;

                /* JADX WARN: Illegal instructions before constructor call */
                public FaceDetectorImpl(zzh zzhVar, Il1I0i il1I0i, FaceDetectorOptions faceDetectorOptions, zzd zzdVar) {
/* 5 */             Executor executorI00000oIO = il1I0i.I00000oIO(faceDetectorOptions.zzf());
/* 13 */            li10lI1 li10li1I00000oOI = liIl1O0ollo.I00000oOI(zzj.zzb());
/* 17 */            super(zzhVar, executorI00000oIO);
/* 20 */            boolean zZzd = zzj.zzd();
/* 24 */            this.zzc = zZzd;
/* 30 */            I0Oi111ii i0Oi111ii = new I0Oi111ii(14);
/* 40 */            i0Oi111ii.I00iio = zZzd ? lIIO1i1Oo01O.TYPE_THICK : lIIO1i1Oo01O.TYPE_THIN;
/* 42 */            lI0IOoI li0iooiZza = zzj.zza(faceDetectorOptions);
/* 48 */            lIli10 lili10 = new lIli10();
/* 52 */            lili10.I00000oIO = null;
/* 54 */            lili10.I00000oOI = null;
/* 56 */            lili10.I0000Il00O = li0iooiZza;
/* 58 */            lili10.I0000O = null;
/* 60 */            lili10.I0000oI00 = null;
/* 62 */            VarHandle.storeStoreFence();
/* 65 */            i0Oi111ii.I00ilI0I1 = lili10;
/* 79 */            li10li1I00000oOI.I00000oOI(new I00Ol00(i0Oi111ii, 1), lIIl0IOioI.ON_DEVICE_FACE_CREATE, li10li1I00000oOI.I0000O());
                }

                @Override
                public final int getDetectorType() {
/* 1 */             return 2;
                }

                @Override
                public final IlIII1l[] getOptionalFeatures() {
                    return this.zzc ? OIiil10iiO.I00000oIO : new IlIII1l[]{OIiil10iiO.I0000Il00O};
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

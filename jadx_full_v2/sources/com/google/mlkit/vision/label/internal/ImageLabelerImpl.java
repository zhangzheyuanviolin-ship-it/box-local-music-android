            package com.google.mlkit.vision.label.internal;

            import com.google.mlkit.vision.common.InputImage;
            import com.google.mlkit.vision.common.internal.MobileVisionBase;
            import com.google.mlkit.vision.label.ImageLabel;
            import com.google.mlkit.vision.label.ImageLabeler;
            import java.util.List;
            import java.util.concurrent.Executor;
            import p000.IlIII1l;
            import p000.O1Il0Il;
            import p000.O1o00iolI11;
            import p000.OIiil10iiO;
            import p000.OloIIoII1oo;
            
/* 4 */     public class ImageLabelerImpl extends MobileVisionBase<List<ImageLabel>> implements ImageLabeler {
                private final IlIII1l zzb;

                private ImageLabelerImpl(O1Il0Il o1Il0Il, Executor executor, IlIII1l ilIII1l) {
/* 1 */             super(o1Il0Il, executor);
/* 4 */             this.zzb = ilIII1l;
                }

                public static ImageLabelerImpl newInstance(O1Il0Il o1Il0Il, Executor executor) {
/* 4 */             return new ImageLabelerImpl(o1Il0Il, executor, null);
                }

                @Override
                public final int getDetectorType() {
/* 1 */             return 3;
                }

                @Override
                public final IlIII1l[] getOptionalFeatures() {
/* 1 */             IlIII1l ilIII1l = this.zzb;
                    return ilIII1l != null ? new IlIII1l[]{ilIII1l} : OIiil10iiO.I00000oIO;
                }

                @Override
                public final OloIIoII1oo process(O1o00iolI11 o1o00iolI11) {
/* 1 */             return processBase(o1o00iolI11);
                }

                @Override
/* 5 */         public final OloIIoII1oo process(InputImage inputImage) {
/* 6 */             return processBase(inputImage);
                }

/* 7 */         public static ImageLabelerImpl newInstance(O1Il0Il o1Il0Il, Executor executor, IlIII1l ilIII1l) {
/* 8 */             return new ImageLabelerImpl(o1Il0Il, executor, ilIII1l);
                }
            }

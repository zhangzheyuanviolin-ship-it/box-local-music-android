            package com.google.mlkit.vision.text.internal;

            import com.google.mlkit.vision.common.InputImage;
            import com.google.mlkit.vision.common.internal.MobileVisionBase;
            import com.google.mlkit.vision.text.TextRecognizer;
            import com.google.mlkit.vision.text.TextRecognizerOptionsInterface;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            import p000.I00Ol00;
            import p000.I0Oi111ii;
            import p000.IlIII1l;
            import p000.O1o00iolI11;
            import p000.OloIIoII1oo;
            import p000.liOi0IoI0i;
            import p000.liOll1O;
            import p000.lloolo1;
            import p000.lo0I10I;
            import p000.lo0O11O;
            import p000.loloOlli1l0;
            
/* 4 */     public final class zzn extends MobileVisionBase implements TextRecognizer {
                private final TextRecognizerOptionsInterface zzb;

                public zzn(TextRecognizerTaskWithResource textRecognizerTaskWithResource, Executor executor, loloOlli1l0 loloolli1l0, TextRecognizerOptionsInterface textRecognizerOptionsInterface) {
/* 1 */             super(textRecognizerTaskWithResource, executor);
/* 4 */             this.zzb = textRecognizerOptionsInterface;
/* 10 */            I0Oi111ii i0Oi111ii = new I0Oi111ii(17);
/* 24 */            i0Oi111ii.I00iio = textRecognizerOptionsInterface.getIsThickClient() ? liOi0IoI0i.TYPE_THICK : liOi0IoI0i.TYPE_THIN;
/* 30 */            lo0I10I lo0i10iZza = LoggingUtils.zza(textRecognizerOptionsInterface.getLoggingLanguageOption());
/* 36 */            lo0O11O lo0o11o = new lo0O11O();
/* 39 */            lo0o11o.I00000oIO = lo0i10iZza;
/* 41 */            VarHandle.storeStoreFence();
/* 46 */            lloolo1 lloolo1Var = new lloolo1();
/* 50 */            lloolo1Var.I00000oIO = null;
/* 52 */            lloolo1Var.I00000oOI = null;
/* 54 */            lloolo1Var.I0000Il00O = lo0o11o;
/* 56 */            VarHandle.storeStoreFence();
/* 59 */            i0Oi111ii.I00ilI0I1 = lloolo1Var;
/* 74 */            loloolli1l0.I00000oOI(new I00Ol00(i0Oi111ii, 1, (char) 0), liOll1O.ON_DEVICE_TEXT_CREATE, loloolli1l0.I0000O());
                }

                @Override
                public final int getDetectorType() {
/* 1 */             return 4;
                }

                @Override
                public final IlIII1l[] getOptionalFeatures() {
/* 3 */             return TextOptionalModuleUtils.zza(this.zzb);
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

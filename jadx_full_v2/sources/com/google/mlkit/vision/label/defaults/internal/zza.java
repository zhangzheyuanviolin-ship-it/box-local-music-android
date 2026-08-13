            package com.google.mlkit.vision.label.defaults.internal;

            import com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator;
            import com.google.mlkit.vision.label.defaults.ImageLabelerOptions;
            import com.google.mlkit.vision.label.internal.ImageLabelerImpl;
            import p000.I00Ol00;
            import p000.I0Oi111ii;
            import p000.Il1I0i;
            import p000.O1Il0Il;
            import p000.lOolIoOl0;
            import p000.lOoo11;
            import p000.loOiOoIi;
            import p000.loiio1IIlIil;
            
            final class zza implements MultiFlavorDetectorCreator.DetectorCreator {
                private final zzb zza;
                private final Il1I0i zzb;
                private final loOiOoIi zzc;

                public zza(zzb zzbVar, Il1I0i il1I0i) {
/* 1 */             loOiOoIi looiooiiI00000oIO = loiio1IIlIil.I00000oIO();
/* 8 */             this.zza = zzbVar;
/* 10 */            this.zzb = il1I0i;
/* 12 */            this.zzc = looiooiiI00000oIO;
                }

                @Override
                public final MultiFlavorDetectorCreator.MultiFlavorDetector create(MultiFlavorDetectorCreator.DetectorOptions detectorOptions) {
/* 1 */             ImageLabelerOptions imageLabelerOptions = (ImageLabelerOptions) detectorOptions;
/* 7 */             I0Oi111ii i0Oi111ii = new I0Oi111ii(16);
/* 12 */            i0Oi111ii.I00iio = lOolIoOl0.TYPE_THICK;
/* 18 */            I00Ol00 i00Ol00 = new I00Ol00(i0Oi111ii, 1, (byte) 0);
/* 21 */            loOiOoIi looiooii = this.zzc;
/* 29 */            looiooii.I00000oOI(i00Ol00, lOoo11.ON_DEVICE_IMAGE_LABEL_CREATE, looiooii.I0000Il00O());
/* 50 */            return ImageLabelerImpl.newInstance((O1Il0Il) this.zza.get(imageLabelerOptions), this.zzb.I00000oIO(imageLabelerOptions.getExecutor()));
                }
            }

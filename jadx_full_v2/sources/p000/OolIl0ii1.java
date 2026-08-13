            package p000;

            import android.util.Range;
            import android.util.Size;
            import java.util.Map;
            import java.util.Objects;
            
            public interface OolIl0ii1 extends OloIIlI1o10, IoiIOIliOIi1 {
                public static final I1ioiI I00Io1lO = I1ioiI.I00000oIO("camerax.core.useCase.defaultSessionConfig", OillooOlI.class, null);
                public static final I1ioiI I00Io1o110i = I1ioiI.I00000oIO("camerax.core.useCase.defaultCaptureConfig", IIoo00iOol0.class, null);
                public static final I1ioiI I00IoIO0lI = I1ioiI.I00000oIO("camerax.core.useCase.sessionConfigUnpacker", IIoIO1li.class, null);
                public static final I1ioiI I00IoO0 = I1ioiI.I00000oIO("camerax.core.useCase.captureConfigUnpacker", IIoIO0l1001.class, null);
                public static final I1ioiI I00IoiI;
                public static final I1ioiI I00Iooi00oi;
                public static final I1ioiI I00O0i0ii;
                public static final I1ioiI I00O0o1oo;
                public static final I1ioiI I00O10llo;
                public static final I1ioiI I00OI1;
                public static final I1ioiI I00OIO1;
                public static final I1ioiI I00OIl;
                public static final I1ioiI I00OIo;
                public static final I1ioiI I00OOll1;
                public static final I1ioiI I00OilO00Il;
                public static final I1ioiI I00Oio;
                public static final I1ioiI I00Ol00;

                static {
/* 44 */            Class cls = Integer.TYPE;
/* 50 */            I00IoiI = I1ioiI.I00000oIO("camerax.core.useCase.surfaceOccupancyPriority", cls, null);
/* 58 */            I00Iooi00oi = I1ioiI.I00000oIO("camerax.core.useCase.sessionType", cls, null);
/* 68 */            I00O0i0ii = I1ioiI.I00000oIO("camerax.core.useCase.targetFrameRate", Range.class, null);
/* 78 */            I00O0o1oo = I1ioiI.I00000oIO("camerax.core.useCase.isStrictFrameRateRequired", Boolean.class, null);
/* 88 */            I00O10llo = I1ioiI.I00000oIO("camerax.core.useCase.resolutionToMaxFrameRate", Map.class, null);
/* 92 */            Class cls2 = Boolean.TYPE;
/* 98 */            I00OI1 = I1ioiI.I00000oIO("camerax.core.useCase.zslDisabled", cls2, null);
/* 106 */           I00OIO1 = I1ioiI.I00000oIO("camerax.core.useCase.highResolutionDisabled", cls2, null);
/* 116 */           I00OIl = I1ioiI.I00000oIO("camerax.core.useCase.captureType", OolO01iOo0O.class, null);
/* 124 */           I00OIo = I1ioiI.I00000oIO("camerax.core.useCase.previewStabilizationMode", cls, null);
/* 132 */           I00OOll1 = I1ioiI.I00000oIO("camerax.core.useCase.videoStabilizationMode", cls, null);
/* 140 */           I00OilO00Il = I1ioiI.I00000oIO("camerax.core.useCase.isVideoQualitySelectorDefault", Boolean.class, null);
/* 150 */           I00Oio = I1ioiI.I00000oIO("camerax.core.useCase.takePictureManagerProvider", OolIii.class, null);
/* 160 */           I00Ol00 = I1ioiI.I00000oIO("camerax.core.useCase.streamUseCase", OlOOI001.class, null);
                }

                default OlOOI001 I00100o1O0lo() {
/* 9 */             OlOOI001 olOOI001 = (OlOOI001) I00000oOI(I00Ol00, OlOOI001.I00iiI);
/* 11 */            Objects.requireNonNull(olOOI001);
/* 20 */            return olOOI001;
                }

                default OolO01iOo0O I0010o() {
/* 7 */             return (OolO01iOo0O) I0000O(I00OIl);
                }

                default int I00111O() {
/* 14 */            return ((Integer) I00000oOI(I00OOll1, 0)).intValue();
                }

                default int I001i1O0Ol(Size size) {
/* 8 */             Map map = (Map) I00000oOI(I00O10llo, null);
/* 10 */            if (map == null || !map.containsKey(size)) {
/* 32 */                return Integer.MAX_VALUE;
                    }
/* 22 */            Integer num = (Integer) map.get(size);
/* 24 */            Objects.requireNonNull(num);
/* 27 */            return num.intValue();
                }

                default int I001l0I00() {
/* 14 */            return ((Integer) I00000oOI(I00OIo, 0)).intValue();
                }
            }

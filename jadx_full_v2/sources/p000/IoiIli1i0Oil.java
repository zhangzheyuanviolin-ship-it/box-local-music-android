            package p000;

            import android.util.Size;
            import java.util.List;
            
            public interface IoiIli1i0Oil extends OOlOIoII {
                public static final I1ioiI I00111O = I1ioiI.I00000oIO("camerax.core.imageOutput.targetAspectRatio", I1O0Oo10i0.class, null);
                public static final I1ioiI I001IIilI0O;
                public static final I1ioiI I001IO000;
                public static final I1ioiI I001i1O0Ol;
                public static final I1ioiI I001i1lo1io;
                public static final I1ioiI I001iOo1i0O;
                public static final I1ioiI I001l0I00;
                public static final I1ioiI I001lIiIIo1O;
                public static final I1ioiI I001lllioOl;
                public static final I1ioiI I001lloI;

                static {
/* 14 */            Class cls = Integer.TYPE;
/* 20 */            I001IIilI0O = I1ioiI.I00000oIO("camerax.core.imageOutput.targetRotation", cls, null);
/* 28 */            I001IO000 = I1ioiI.I00000oIO("camerax.core.imageOutput.appTargetRotation", cls, null);
/* 36 */            I001i1O0Ol = I1ioiI.I00000oIO("camerax.core.imageOutput.mirrorMode", cls, null);
/* 46 */            I001i1lo1io = I1ioiI.I00000oIO("camerax.core.imageOutput.targetResolution", Size.class, null);
/* 54 */            I001iOo1i0O = I1ioiI.I00000oIO("camerax.core.imageOutput.defaultResolution", Size.class, null);
/* 62 */            I001l0I00 = I1ioiI.I00000oIO("camerax.core.imageOutput.maxResolution", Size.class, null);
/* 72 */            I001lIiIIo1O = I1ioiI.I00000oIO("camerax.core.imageOutput.supportedResolutions", List.class, null);
/* 82 */            I001lllioOl = I1ioiI.I00000oIO("camerax.core.imageOutput.resolutionSelector", Oi0Oliol.class, null);
/* 90 */            I001lloI = I1ioiI.I00000oIO("camerax.core.imageOutput.customOrderedResolutions", List.class, null);
                }

                static void I001lllioOl(IoiIli1i0Oil ioiIli1i0Oil) {
/* 3 */             boolean zI000O01llI0 = ioiIli1i0Oil.I000O01llI0(I00111O);
/* 20 */            boolean z = ((Size) ioiIli1i0Oil.I00000oOI(I001i1lo1io, null)) != null;
/* 21 */            if (zI000O01llI0 && z) {
/* 28 */                I000II.I000iOII("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
                    } else if (((Oi0Oliol) ioiIli1i0Oil.I00000oOI(I001lllioOl, null)) != null) {
/* 42 */                if (zI000O01llI0 || z) {
/* 49 */                    I000II.I000iOII("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
                        }
                    }
                }

                default int I001lloI(int i) {
/* 13 */            return ((Integer) I00000oOI(I001IIilI0O, Integer.valueOf(i))).intValue();
                }
            }

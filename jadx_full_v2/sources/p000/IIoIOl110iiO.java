            package p000;

            import android.hardware.camera2.CaptureRequest;
            import androidx.camera.camera2.compat.quirk.ImageCapturePixelHDRPlusQuirk;
            
            public final class IIoIOl110iiO extends IIoIO0l1001 {
                public static final IIoIOl110iiO I00000oOI = new IIoIOl110iiO();

                @Override
                public final void I00000oIO(Ioi1iI0IiOl ioi1iI0IiOl, I0oiil10Ili i0oiil10Ili) {
/* 1 */             super.I00000oIO(ioi1iI0IiOl, i0oiil10Ili);
/* 4 */             OI0oiliol10O oI0oiliol10OI000OOo1O = OI0oiliol10O.I000OOo1O();
/* 16 */            if (((ImageCapturePixelHDRPlusQuirk) IiOoli.I00000oIO(ImageCapturePixelHDRPlusQuirk.class)) != null) {
/* 19 */                I1ioiI i1ioiI = Ioi1iI0IiOl.I00iiI;
/* 25 */                if (ioi1iI0IiOl.I000O01llI0(i1ioiI)) {
/* 34 */                    int iIntValue = ((Integer) ioi1iI0IiOl.I0000O(i1ioiI)).intValue();
/* 38 */                    if (iIntValue == 0) {
/* 56 */                        CaptureRequest.Key key = CaptureRequest.CONTROL_ENABLE_ZSL;
/* 64 */                        oI0oiliol10OI000OOo1O.I0010I0i(iOil1io0i00.I00000oIO(key), Boolean.TRUE);
                            } else if (iIntValue == 1) {
/* 44 */                        CaptureRequest.Key key2 = CaptureRequest.CONTROL_ENABLE_ZSL;
/* 52 */                        oI0oiliol10OI000OOo1O.I0010I0i(iOil1io0i00.I00000oIO(key2), Boolean.FALSE);
                            }
                        }
                    }
/* 78 */            i0oiil10Ili.I0000oI00(new IIl0oI(OIil0iio0.I0001Ioi1lo(oI0oiliol10OI000OOo1O), 8));
                }
            }

            package p000;

            import android.hardware.camera2.CameraCaptureSession;
            import android.hardware.camera2.CaptureRequest;
            import android.hardware.camera2.CaptureResult;
            
            public final class IIl1IO0O0li1 implements Runnable {
                public final int I00iOIl;
                public IIoIIOi1O I00iiI;
                public CameraCaptureSession I00iiO;
                public CaptureRequest I00iio;
                public CaptureResult I00ilI0I1;

                @Override
                public final void run() {
                    switch (this.I00iOIl) {
                        case 0:
/* 20 */                    IIoIIOi1O iIoIIOi1O = this.I00iiI;
/* 30 */                    iIoIIOi1O.I00000oIO.onCaptureProgressed(this.I00iiO, this.I00iio, this.I00ilI0I1);
                            break;
                        default:
/* 6 */                     IIoIIOi1O iIoIIOi1O2 = this.I00iiI;
/* 16 */                    iIoIIOi1O2.I00000oIO.onCaptureProgressed(this.I00iiO, this.I00iio, this.I00ilI0I1);
                            break;
                    }
                }
            }

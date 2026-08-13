            package p000;

            import android.hardware.camera2.CameraCaptureSession;
            import android.hardware.camera2.CaptureRequest;
            import android.view.Surface;
            
            public final class IIl1Ii0i implements Runnable {
                public IIoIIOi1O I00iOIl;
                public CameraCaptureSession I00iiI;
                public CaptureRequest I00iiO;
                public Surface I00iio;
                public long I00ilI0I1;

                @Override
                public final void run() {
/* 1 */             IIoIIOi1O iIoIIOi1O = this.I00iOIl;
/* 13 */            iIoIIOi1O.I00000oIO.onCaptureBufferLost(this.I00iiI, this.I00iiO, this.I00iio, this.I00ilI0I1);
                }
            }

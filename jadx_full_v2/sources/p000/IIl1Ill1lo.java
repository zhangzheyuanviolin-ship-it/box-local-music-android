            package p000;

            import android.hardware.camera2.CameraCaptureSession;
            
            public final class IIl1Ill1lo implements Runnable {
                public final int I00iOIl;
                public long I00iiI;
                public Object I00iiO;
                public Object I00iio;

                @Override
                public final void run() {
                    switch (this.I00iOIl) {
                        case 0:
/* 22 */                    IIoIIOi1O iIoIIOi1O = (IIoIIOi1O) this.I00iiO;
/* 33 */                    iIoIIOi1O.I00000oIO.onCaptureSequenceCompleted((CameraCaptureSession) this.I00iio, -1, this.I00iiI);
                            break;
                        default:
/* 16 */                    ((Oi01Ooii1Ol) this.I00iiO).I000l1((Oi0Iil) this.I00iio, this.I00iiI);
                            break;
                    }
                }
            }

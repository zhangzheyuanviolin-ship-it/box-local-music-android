            package p000;

            import android.hardware.camera2.CameraManager;
            
            public final class IIilI0OO extends CameraManager.AvailabilityCallback {
                public final OOIoOo0O I00000oIO;

                public IIilI0OO(OOIoOo0O oOIoOo0O) {
/* 1 */             this.I00000oIO = oOIoOo0O;
                }

                @Override
                public final void onCameraAvailable(String str) {
/* 1 */             IIllI0o.I00000oOI(str);
/* 10 */            iOlI0o0II.I00000oIO(this.I00000oIO, IIllI0o.I00000oIO(str));
                }
            }

            package p000;

            import android.hardware.camera2.CameraDevice;
            import java.util.Iterator;
            import java.util.List;
            
            public final class IIlo0I1io1O0 extends CameraDevice.StateCallback {
                public I1OooIoiIO I00000oIO;

                @Override
                public final void onClosed(CameraDevice cameraDevice) {
/* 7 */             Iterator it = ((List) this.I00000oIO.I00000oIO).iterator();
/* 15 */            while (it.hasNext()) {
/* 23 */                ((CameraDevice.StateCallback) it.next()).onClosed(cameraDevice);
                    }
                }

                @Override
                public final void onDisconnected(CameraDevice cameraDevice) {
/* 7 */             Iterator it = ((List) this.I00000oIO.I00000oIO).iterator();
/* 15 */            while (it.hasNext()) {
/* 23 */                ((CameraDevice.StateCallback) it.next()).onDisconnected(cameraDevice);
                    }
                }

                @Override
                public final void onError(CameraDevice cameraDevice, int i) {
/* 7 */             Iterator it = ((List) this.I00000oIO.I00000oIO).iterator();
/* 15 */            while (it.hasNext()) {
/* 23 */                ((CameraDevice.StateCallback) it.next()).onError(cameraDevice, i);
                    }
                }

                @Override
                public final void onOpened(CameraDevice cameraDevice) {
/* 7 */             Iterator it = ((List) this.I00000oIO.I00000oIO).iterator();
/* 15 */            while (it.hasNext()) {
/* 23 */                ((CameraDevice.StateCallback) it.next()).onOpened(cameraDevice);
                    }
                }
            }

            package p000;

            import android.hardware.camera2.CameraCaptureSession;
            import android.hardware.camera2.CameraDevice;
            import android.hardware.camera2.CaptureRequest;
            import android.os.Handler;
            import android.view.Surface;
            import java.util.List;
            
            public final class OOolliO extends CameraCaptureSession {
                public static String I00000oIO(String str) {
/* 5 */             return IlIi0I0.I000lI("Current capture session is running on extensions mode which isn't allowed to invoke the ", str, " function!");
                }

                @Override
                public final void abortCaptures() {
/* 20 */            throw new IllegalArgumentException(I00000oIO("abortCaptures"));
                }

                @Override
                public final int capture(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback, Handler handler) {
/* 98 */            throw new IllegalArgumentException(I00000oIO("capture"));
                }

                @Override
                public final int captureBurst(List list, CameraCaptureSession.CaptureCallback captureCallback, Handler handler) {
/* 98 */            throw new IllegalArgumentException(I00000oIO("captureBurst"));
                }

                @Override
                public final void close() {
/* 20 */            throw new IllegalArgumentException(I00000oIO("close"));
                }

                @Override
                public final void finalizeOutputConfigurations(List list) {
/* 29 */            throw new IllegalArgumentException(I00000oIO("finalizeOutputConfigurations"));
                }

                @Override
                public final CameraDevice getDevice() {
/* 20 */            throw new IllegalArgumentException(I00000oIO("getDevice"));
                }

                @Override
                public final Surface getInputSurface() {
/* 20 */            throw new IllegalArgumentException(I00000oIO("getInputSurface"));
                }

                @Override
                public final boolean isReprocessable() {
/* 20 */            throw new IllegalArgumentException(I00000oIO("isReprocessable"));
                }

                @Override
                public final void prepare(Surface surface) {
/* 29 */            throw new IllegalArgumentException(I00000oIO("prepare"));
                }

                @Override
                public final int setRepeatingBurst(List list, CameraCaptureSession.CaptureCallback captureCallback, Handler handler) {
/* 98 */            throw new IllegalArgumentException(I00000oIO("setRepeatingBurst"));
                }

                @Override
                public final int setRepeatingRequest(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback, Handler handler) {
/* 98 */            throw new IllegalArgumentException(I00000oIO("setRepeatingRequest"));
                }

                @Override
                public final void stopRepeating() {
/* 20 */            throw new IllegalArgumentException(I00000oIO("stopRepeating"));
                }
            }

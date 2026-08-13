            package p000;

            import android.hardware.camera2.CameraCaptureSession;
            import android.hardware.camera2.CaptureRequest;
            import android.view.Surface;
            import java.util.ArrayList;
            import java.util.List;
            
            public interface IIlIIOi extends OoilIiI0oi, AutoCloseable {
                Integer I00IO1(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);

                boolean I00OIo();

                IIlOl1oOlo1o I00Ol10();

                boolean I00iiO(List list);

                boolean I00ilI0I1();

                Integer I00oI0i(ArrayList arrayList, CameraCaptureSession.CaptureCallback captureCallback);

                Integer I00oO101o(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);

                Integer I00oOio10iI1(ArrayList arrayList, CameraCaptureSession.CaptureCallback captureCallback);

                Surface getInputSurface();
            }

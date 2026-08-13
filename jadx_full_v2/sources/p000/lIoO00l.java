            package p000;

            import android.hardware.camera2.CaptureRequest;
            import android.util.Log;
            import java.util.Map;
            
            public abstract class lIoO00l {
                public static final void I00000oIO(CaptureRequest.Builder builder, Object obj, Object obj2) {
/* 1 */             if (obj == null || !(obj instanceof CaptureRequest.Key)) {
/* 98 */                return;
                    }
                    try {
/* 10 */                builder.set((CaptureRequest.Key) obj, obj2);
                    } catch (IllegalArgumentException e) {
/* 50 */                Log.w("CXCP", "Failed to set [" + ((CaptureRequest.Key) obj).getName() + ": " + obj2 + "] on CaptureRequest.Builder", e);
                    }
                }

                public static final void I00000oOI(CaptureRequest.Builder builder, Map map) {
/* 13 */            for (Map.Entry entry : map.entrySet()) {
/* 29 */                I00000oIO(builder, entry.getKey(), entry.getValue());
                    }
                }
            }

            package p000;

            import android.hardware.camera2.CameraAccessException;
            import android.util.Log;
            
            public abstract class iOilOO1O1o {
                public static int I00000oIO(Exception exc) {
/* 7 */             if (!(exc instanceof CameraAccessException)) {
/* 57 */                if (exc instanceof IllegalArgumentException) {
/* 59 */                    return 7;
                        }
/* 63 */                if (exc instanceof SecurityException) {
/* 65 */                    return 8;
                        }
/* 82 */                Log.w("CXCP", "Unexpected throwable: " + exc);
/* 3 */                 return 11;
                    }
/* 9 */             CameraAccessException cameraAccessException = (CameraAccessException) exc;
/* 11 */            int reason = cameraAccessException.getReason();
/* 17 */            if (reason == 1) {
/* 15 */                return 3;
                    }
/* 20 */            if (reason == 2) {
/* 52 */                return 6;
                    }
/* 22 */            if (reason == 3) {
/* 50 */                return 0;
                    }
/* 25 */            if (reason == 4) {
/* 16 */                return 1;
                    }
/* 28 */            if (reason == 5) {
/* 19 */                return 2;
                    }
/* 44 */            Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
/* 3 */             return 11;
                }
            }

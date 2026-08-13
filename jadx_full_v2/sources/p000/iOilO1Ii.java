            package p000;

            import android.hardware.camera2.CameraAccessException;
            import android.hardware.camera2.CameraCharacteristics;
            import android.os.Build;
            import android.util.Log;
            
            public abstract class iOilO1Ii {
                public static final boolean I00000oIO(String str, IIlOlol0liO iIlOlol0liO) throws IolIoOoi11 {
/* 11 */            if (O0000Ioio00.I0000O(Build.FINGERPRINT, "robolectric")) {
/* 14 */                l11I11lO.I0000O(3, "CXCP");
/* 17 */                return true;
                    }
                    try {
/* 19 */                IIllI0o.I00000oOI(str);
/* 40 */                int[] iArr = (int[]) ((IIioli) iIlOlol0liO.I0000Il00O().I0000Il00O.I00000oIO(str)).I0000O(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
/* 43 */                if (iArr != null) {
/* 45 */                    return I1IoiO1l.I0000oI00(iArr, 0);
                        }
/* 42 */                return false;
                    } catch (CameraAccessException e) {
/* 58 */                if (l11I11lO.I0000O(6, "CXCP")) {
/* 66 */                    Log.e("CXCP", "Error while accessing metadata for cameraID: ".concat(str), e);
                        }
/* 106 */               throw new IolIoOoi11(e);
                    }
                }
            }

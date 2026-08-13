            package p000;

            import android.hardware.camera2.CaptureRequest;
            import java.util.LinkedHashMap;
            
            public abstract class iOil1io0i00 {
                public static final I1ioiI I00000oIO(CaptureRequest.Key key) {
/* 21 */            return I1ioiI.I00000oIO("camera2.captureRequest.option." + key.getName(), Object.class, key);
                }

                public static final LinkedHashMap I00000oOI(IOlOo1ll1l1 iOlOo1ll1l1) {
                    Object objI0000O;
/* 3 */             LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 18 */            for (I1ioiI i1ioiI : iOlOo1ll1l1.I0000Il00O()) {
/* 26 */                Object obj = i1ioiI.I0000Il00O;
/* 35 */                CaptureRequest.Key key = obj instanceof CaptureRequest.Key ? (CaptureRequest.Key) obj : null;
/* 36 */                if (key != null && (objI0000O = iOlOo1ll1l1.I0000O(i1ioiI)) != null) {
/* 46 */                    linkedHashMap.put(key, objI0000O);
                        }
                    }
/* 77 */            return linkedHashMap;
                }
            }

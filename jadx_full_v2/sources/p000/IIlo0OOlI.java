            package p000;

            import android.hardware.camera2.CameraCharacteristics;
            import java.util.HashMap;
            
            public final class IIlo0OOlI {
                public static final IIlo0OOlI I00000oIO = new IIlo0OOlI();
                public static final int[] I00000oOI;

                static {
/* 8 */             HashMap map = O1lOllO.I0000Il00O;
/* 10 */            OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 20 */            l1OO1oIOoll.I00000oIO(oOoOl1001II.I00000oOI(IIo1ooOOOlio.class), "androidx.camera.camera2.pipe.scalar.streamConfigurationMap");
/* 31 */            l1OO1oIOoll.I00000oIO(oOoOl1001II.I00000oOI(IIlo0ili0.class), "androidx.camera.camera2.pipe.scalar.multiResolutionStreamConfigurationMap");
/* 42 */            l1OO1oIOoll.I00000oIO(oOoOl1001II.I00000oOI(IIlIIi00O.class), "androidx.camera.camera2.pipe.request.availableColorSpaceProfilesMap");
/* 48 */            I00000oOI = new int[0];
                }

                public static boolean I00000oIO(IIlo0i0ll iIlo0i0ll) {
/* 3 */             IIioli iIioli = (IIioli) iIlo0i0ll;
/* 9 */             Float f = (Float) iIioli.I0000O(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE);
/* 12 */            if (f == null) {
/* 30 */                int[] iArr = (int[]) iIioli.I0000O(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
/* 32 */                if (iArr == null) {
/* 63 */                    return false;
                        }
/* 39 */                if (!I1IoiO1l.I0000oI00(iArr, 1) && !I1IoiO1l.I0000oI00(iArr, 2) && !I1IoiO1l.I0000oI00(iArr, 4) && !I1IoiO1l.I0000oI00(iArr, 3)) {
/* 63 */                    return false;
                        }
                    } else if (f.floatValue() <= 0.0f) {
/* 63 */                return false;
                    }
/* 11 */            return true;
                }

                public static boolean I00000oOI(IIlo0i0ll iIlo0i0ll) {
/* 9 */             Integer num = (Integer) ((IIioli) iIlo0i0ll).I0000O(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                    return num != null && num.intValue() == 2;
                }
            }

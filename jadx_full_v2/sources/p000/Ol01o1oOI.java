            package p000;

            import androidx.window.sidecar.SidecarDeviceState;
            import androidx.window.sidecar.SidecarWindowLayoutInfo;
            import java.lang.reflect.InvocationTargetException;
            import java.util.List;
            
            public abstract class Ol01o1oOI {
                public static int I00000oIO(SidecarDeviceState sidecarDeviceState) {
                    try {
                        try {
/* 1 */                     return sidecarDeviceState.posture;
                        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
/* 24 */                    return 0;
                        }
                    } catch (NoSuchFieldError unused2) {
/* 19 */                return ((Integer) SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null)).intValue();
                    }
                }

                public static List I00000oOI(SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
                    List list;
/* 1 */             Il01100l il01100l = Il01100l.I00iOIl;
                    try {
                        try {
/* 3 */                     list = sidecarWindowLayoutInfo.displayFeatures;
                        } catch (NoSuchFieldError unused) {
/* 22 */                    return (List) SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                        }
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                    }
                    return list == null ? il01100l : list;
                }

                public static void I0000Il00O(SidecarDeviceState sidecarDeviceState, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                    try {
                        try {
/* 1 */                     sidecarDeviceState.posture = i;
                        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                        }
                    } catch (NoSuchFieldError unused2) {
/* 26 */                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i));
                    }
                }
            }

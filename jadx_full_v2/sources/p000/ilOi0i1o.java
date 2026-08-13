            package p000;

            import android.hardware.camera2.CameraCharacteristics;
            import android.os.Build;
            import android.util.Log;
            import androidx.camera.camera2.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
            import java.nio.BufferUnderflowException;
            
            public abstract class ilOi0i1o {
                public static boolean I00000oIO(IIloIoOOiO0l iIloIoOOiO0l) {
                    Boolean bool;
                    try {
/* 13 */                bool = (Boolean) ((IIioli) iIloIoOOiO0l.I00000oOI).I0000O(CameraCharacteristics.FLASH_INFO_AVAILABLE);
                    } catch (BufferUnderflowException e) {
/* 23 */                if (IiOoli.I00000oIO(FlashAvailabilityBufferUnderflowQuirk.class) != null) {
/* 30 */                    if (l11I11lO.I0000O(3, "CXCP")) {
/* 32 */                        String str = Build.MANUFACTURER;
/* 34 */                        String str2 = Build.MODEL;
                            }
                        } else if (l11I11lO.I0000O(6, "CXCP")) {
/* 85 */                    Log.e("CXCP", "Exception thrown while checking for flash availability on device not known to throw exceptions during this check. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: " + Build.MANUFACTURER + ", Model: " + Build.MODEL + ", API Level: " + Build.VERSION.SDK_INT + "]. Flash is not available.", e);
                        }
/* 88 */                bool = Boolean.FALSE;
                    }
/* 90 */            if (bool == null && l11I11lO.I0000O(5, "CXCP")) {
/* 101 */               Log.w("CXCP", "Characteristics did not contain key FLASH_INFO_AVAILABLE. Flash is not available.");
                    }
/* 104 */           if (bool != null) {
/* 106 */               return bool.booleanValue();
                    }
/* 111 */           return false;
                }
            }

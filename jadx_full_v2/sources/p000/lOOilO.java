            package p000;

            import android.hardware.camera2.CaptureRequest;
            import androidx.camera.camera2.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
            import java.util.ArrayList;
            import java.util.Iterator;
            
            public abstract class lOOilO {
                public static final boolean I00000oIO(ArrayList arrayList) {
/* 10 */            if (((StillCaptureFlashStopRepeatingQuirk) IiOoli.I00000oIO(StillCaptureFlashStopRepeatingQuirk.class)) != null) {
/* 13 */                Iterator it = arrayList.iterator();
/* 17 */                boolean z = false;
/* 18 */                boolean z2 = false;
/* 24 */                while (it.hasNext()) {
/* 30 */                    Oi01iIoI oi01iIoI = (Oi01iIoI) it.next();
/* 32 */                    Oi0OO1IIl1 oi0OO1IIl1 = oi01iIoI.I0000oI00;
/* 35 */                    if (oi0OO1IIl1 != null && oi0OO1IIl1.I00000oIO == 2) {
/* 41 */                        z = true;
                            }
/* 50 */                    Integer num = (Integer) oi01iIoI.I00000oOI.get(CaptureRequest.CONTROL_AE_MODE);
/* 52 */                    if ((num != null && num.intValue() == 2) || (num != null && num.intValue() == 3)) {
/* 71 */                        z2 = true;
                            }
                        }
/* 73 */                if (z && z2) {
/* 23 */                    return true;
                        }
                    }
/* 9 */             return false;
                }
            }

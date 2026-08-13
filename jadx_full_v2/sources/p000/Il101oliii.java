            package p000;

            import android.hardware.camera2.CaptureResult;
            
            public final class Il101oliii implements Oi01Ooii1Ol {
                public IOi10loi I00iOIl;

                @Override
                public final void I00OIl(Oi0Iil oi0Iil, long j, I0oIili1iI i0oIili1iI) {
/* 1 */             IOi10loi iOi10loi = this.I00iOIl;
/* 8 */             I0oIl0101 i0oIl0101 = i0oIili1iI.I00iiI;
/* 18 */            Integer num = (Integer) i0oIl0101.I00iOIl.get(CaptureResult.CONTROL_AE_STATE);
/* 28 */            Integer num2 = (Integer) i0oIl0101.I00iOIl.get(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION);
/* 30 */            if (num == null || num2 == null) {
/* 58 */                if (num2 == null || num2.intValue() != 0) {
/* 98 */                    return;
                        }
/* 66 */                iOi10loi.I00O10llo(0);
/* 98 */                return;
                    }
/* 34 */            int iIntValue = num.intValue();
/* 39 */            if ((iIntValue == 2 || iIntValue == 3 || iIntValue == 4) && num2.intValue() == 0) {
/* 54 */                iOi10loi.I00O10llo(0);
                    }
                }
            }

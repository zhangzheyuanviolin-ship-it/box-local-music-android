            package p000;

            import android.hardware.camera2.CaptureResult;
            import android.os.Build;
            
            public final class O1Iiol1lIl implements Oi01Ooii1Ol {
                public O1Iioo1 I00iOIl;

                @Override
                public final void I00IOO(Oi0Iil oi0Iil, long j, I0oIili1iI i0oIili1iI) {
/* 1 */             O1Iioo1 o1Iioo1 = this.I00iOIl;
/* 7 */             if (Build.VERSION.SDK_INT < 35 || o1Iioo1.I0000Il00O == null || !o1Iioo1.I0000oI00) {
/* 98 */                return;
                    }
/* 29 */            Integer num = (Integer) i0oIili1iI.I00iiI.I00iOIl.get(CaptureResult.CONTROL_LOW_LIGHT_BOOST_STATE);
/* 31 */            if (num != null) {
/* 44 */                o1Iioo1.I0000Il00O(o1Iioo1.I0001Ioi1lo, num.intValue() != 1 ? 0 : 1);
                    }
                }
            }

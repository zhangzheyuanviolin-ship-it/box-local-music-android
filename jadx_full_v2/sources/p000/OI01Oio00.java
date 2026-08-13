            package p000;

            import android.view.MotionEvent;
            
            public final class OI01Oio00 {
                public static final OI01Oio00 I00000oIO = new OI01Oio00();

                public final boolean I00000oIO(MotionEvent motionEvent, int i) {
                    return (Float.floatToRawIntBits(motionEvent.getRawX(i)) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawY(i)) & Integer.MAX_VALUE) < 2139095040;
                }
            }

            package p000;

            import android.view.MotionEvent;
            import kotlin.jvm.functions.Function1;
            
            public abstract class lI1lI10l {
                public static final void I00000oIO(OO1Oooio101 oO1Oooio101, long j, Function1 function1, boolean z) {
/* 1 */             MotionEvent motionEventI00000oIO = oO1Oooio101.I00000oIO();
/* 5 */             if (motionEventI00000oIO == null) {
/* 62 */                I000II.I000iOII("The PointerEvent receiver cannot have a null MotionEvent.");
/* 204 */               return;
                    }
/* 7 */             int action = motionEventI00000oIO.getAction();
/* 11 */            if (z) {
/* 14 */                motionEventI00000oIO.setAction(3);
                    }
/* 21 */            int i = (int) (j >> 32);
/* 33 */            int i2 = (int) (j & 4294967295L);
/* 39 */            motionEventI00000oIO.offsetLocation(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
/* 42 */            function1.invoke(motionEventI00000oIO);
/* 53 */            motionEventI00000oIO.offsetLocation(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
/* 56 */            motionEventI00000oIO.setAction(action);
                }
            }

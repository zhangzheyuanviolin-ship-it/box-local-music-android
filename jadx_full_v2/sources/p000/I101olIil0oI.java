            package p000;

            import android.view.ViewConfiguration;
            
            public final class I101olIil0oI implements Oooii1o1 {
                public ViewConfiguration I00000oIO;

                @Override
                public final long I00000oIO() {
/* 5 */             return ViewConfiguration.getDoubleTapTimeout();
                }

                @Override
                public final long I00000oOI() {
/* 5 */             return ViewConfiguration.getLongPressTimeout();
                }

                @Override
                public final float I0000Il00O() {
/* 7 */             return this.I00000oIO.getScaledHandwritingSlop();
                }

                @Override
                public final float I0000oI00() {
/* 7 */             return this.I00000oIO.getScaledMaximumFlingVelocity();
                }

                @Override
                public final float I0001Ioi1lo() {
/* 7 */             return this.I00000oIO.getScaledTouchSlop();
                }

                @Override
                public final float I000II() {
/* 7 */             return this.I00000oIO.getScaledHandwritingGestureLineMargin();
                }
            }

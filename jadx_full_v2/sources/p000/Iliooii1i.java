            package p000;

            import android.os.SystemClock;
            import android.view.MotionEvent;
            import android.view.View;
            import android.view.ViewParent;
            
            public final class Iliooii1i implements Runnable {
                public final int I00iOIl;
                public Ill00I1oio I00iiI;

                @Override
                public final void run() {
                    switch (this.I00iOIl) {
                        case 0:
/* 67 */                    ViewParent parent = this.I00iiI.I00iio.getParent();
/* 71 */                    if (parent != null) {
/* 73 */                        parent.requestDisallowInterceptTouchEvent(true);
                                break;
                            }
                            break;
                        default:
/* 7 */                     Ill00I1oio ill00I1oio = this.I00iiI;
/* 9 */                     ill00I1oio.I00000oIO();
/* 12 */                    View view = ill00I1oio.I00iio;
/* 18 */                    if (view.isEnabled() && !view.isLongClickable() && ill00I1oio.I0000Il00O()) {
/* 38 */                        view.getParent().requestDisallowInterceptTouchEvent(true);
/* 41 */                        long jUptimeMillis = SystemClock.uptimeMillis();
/* 50 */                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
/* 54 */                        view.onTouchEvent(motionEventObtain);
/* 57 */                        motionEventObtain.recycle();
/* 60 */                        ill00I1oio.I00io1l = true;
                                break;
                            }
                            break;
                    }
                }
            }

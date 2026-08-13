            package p000;

            import android.view.MotionEvent;
            import android.view.View;
            
            public final class Ilo1Oo1I1O1o implements View.OnTouchListener {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
/* 6 */             view.getParent().requestDisallowInterceptTouchEvent(true);
/* 9 */             return false;
                }
            }

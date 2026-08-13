            package p000;

            import android.os.Handler;
            import android.view.MotionEvent;
            import android.view.View;
            
            public final class O10O00 implements View.OnTouchListener {
                public O10O00o I00iOIl;

                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
/* 1 */             O10O00o o10O00o = this.I00iOIl;
/* 3 */             O10Il1o10iI o10Il1o10iI = o10O00o.I00oI0i;
/* 5 */             Handler handler = o10O00o.I00oOio10iI1;
/* 7 */             I1I0OoiI0o i1I0OoiI0o = o10O00o.I00oliIiO01i;
/* 9 */             int action = motionEvent.getAction();
/* 17 */            int x = (int) motionEvent.getX();
/* 22 */            int y = (int) motionEvent.getY();
/* 23 */            if (action == 0 && i1I0OoiI0o != null && i1I0OoiI0o.isShowing() && x >= 0 && x < i1I0OoiI0o.getWidth() && y >= 0 && y < i1I0OoiI0o.getHeight()) {
/* 51 */                handler.postDelayed(o10Il1o10iI, 250L);
/* 61 */                return false;
                    }
/* 56 */            if (action != 1) {
/* 61 */                return false;
                    }
/* 58 */            handler.removeCallbacks(o10Il1o10iI);
/* 61 */            return false;
                }
            }

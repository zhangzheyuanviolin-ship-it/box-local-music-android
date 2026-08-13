            package p000;

            import android.view.KeyEvent;
            import android.view.MotionEvent;
            import androidx.appcompat.widget.ContentFrameLayout;
            
            public final class I11oIo0oIIl1 extends ContentFrameLayout {
                public final I11oi01ll I00l0I0l0lO1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I11oIo0oIIl1(I11oi01ll i11oi01ll, IOoiOIIOOIi iOoiOIIOOIi) {
/* 3 */             super(iOoiOIIOOIi);
/* 1 */             this.I00l0I0l0lO1 = i11oi01ll;
                }

                @Override
                public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
                    return this.I00l0I0l0lO1.I0010I0i(keyEvent) || super.dispatchKeyEvent(keyEvent);
                }

                @Override
                public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
/* 5 */             if (motionEvent.getAction() == 0) {
/* 11 */                int x = (int) motionEvent.getX();
/* 16 */                int y = (int) motionEvent.getY();
/* 18 */                if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
/* 39 */                    I11oi01ll i11oi01ll = this.I00l0I0l0lO1;
/* 46 */                    i11oi01ll.I00100l0(i11oi01ll.I001i1O0Ol(0), true);
/* 45 */                    return true;
                        }
                    }
/* 50 */            return super.onInterceptTouchEvent(motionEvent);
                }

                @Override
                public final void setBackgroundResource(int i) {
/* 9 */             setBackgroundDrawable(iOO0oOI1Ol.I00000oIO(getContext(), i));
                }
            }

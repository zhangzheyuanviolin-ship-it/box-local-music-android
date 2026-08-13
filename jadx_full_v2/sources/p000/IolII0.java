            package p000;

            import android.view.GestureDetector;
            import android.view.MotionEvent;
            
/* 27 */    public final class IolII0 implements GestureDetector.OnGestureListener {
                public IolIIo0o0Iio I00000oIO;

                @Override
                public final boolean onDown(MotionEvent motionEvent) {
/* 1 */             return true;
                }

                @Override
                public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
/* 1 */             IolIIo0o0Iio iolIIo0o0Iio = this.I00000oIO;
/* 5 */             I0lOl1 i0lOl1 = (I0lOl1) iolIIo0o0Iio.I0000Il00O;
/* 10 */            if (!iolIIo0o0Iio.I00000oIO) {
/* 13 */                int i = iolIIo0o0Iio.I00000oOI;
/* 17 */                if (i == 1) {
/* 29 */                    if (Math.abs(f) > Math.abs(f2)) {
/* 40 */                        i0lOl1.invoke(Ili0i1il0l0l.I00000oIO(f > 0.0f ? 1 : 2));
/* 9 */                         return true;
                            }
                        } else if (i == 2 && Math.abs(f2) > Math.abs(f)) {
/* 67 */                    i0lOl1.invoke(Ili0i1il0l0l.I00000oIO(f2 > 0.0f ? 1 : 2));
                        }
                    }
/* 9 */             return true;
                }

                @Override
                public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
/* 1 */             return true;
                }

                @Override
                public final boolean onSingleTapUp(MotionEvent motionEvent) {
/* 1 */             return true;
                }

                @Override
/* 28 */        public final void onLongPress(MotionEvent motionEvent) {
                }

                @Override
/* 28 */        public final void onShowPress(MotionEvent motionEvent) {
                }
            }

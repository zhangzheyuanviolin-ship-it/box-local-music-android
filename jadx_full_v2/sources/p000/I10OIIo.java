            package p000;

            import android.graphics.Canvas;
            import android.graphics.Rect;
            import android.view.MotionEvent;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.ViewParent;
            import java.util.HashMap;
            
/* 27 */    public final class I10OIIo extends ViewGroup {
                public HashMap I00iOIl;
                public HashMap I00iiI;

                @Override
                public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
/* 1 */             return true;
                }

                public final HashMap<I10I1li0, O0iiOioolIi> getHolderToLayoutNode() {
/* 1 */             return this.I00iOIl;
                }

                public final HashMap<O0iiOioolIi, I10I1li0> getLayoutNodeToHolder() {
/* 1 */             return this.I00iiI;
                }

                @Override
                public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
/* 1 */             return null;
                }

                @Override
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
/* 17 */            for (I10I1li0 i10I1li0 : this.I00iOIl.keySet()) {
/* 41 */                i10I1li0.layout(i10I1li0.getLeft(), i10I1li0.getTop(), i10I1li0.getRight(), i10I1li0.getBottom());
                    }
                }

                @Override
                public final void onMeasure(int i, int i2) {
                    int i3;
/* 14 */            if (!(View.MeasureSpec.getMode(i) == 1073741824)) {
/* 18 */                IolioOO1.I00000oIO("widthMeasureSpec should be EXACTLY");
                    }
/* 28 */            if (!(View.MeasureSpec.getMode(i2) == 1073741824)) {
/* 32 */                IolioOO1.I00000oIO("heightMeasureSpec should be EXACTLY");
                    }
/* 43 */            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
/* 62 */            for (I10I1li0 i10I1li0 : this.I00iOIl.keySet()) {
/* 70 */                int i4 = i10I1li0.I00oOio10iI1;
/* 74 */                if (i4 != Integer.MIN_VALUE && (i3 = i10I1li0.I00ol1) != Integer.MIN_VALUE) {
/* 81 */                    i10I1li0.measure(i4, i3);
                        }
                    }
                }

                @Override
                public final void requestLayout() {
/* 1 */             cleanupLayoutState(this);
/* 4 */             int childCount = getChildCount();
/* 10 */            for (int i = 0; i < childCount; i++) {
/* 12 */                View childAt = getChildAt(i);
/* 22 */                O0iiOioolIi o0iiOioolIi = (O0iiOioolIi) this.I00iOIl.get(childAt);
/* 28 */                if (childAt.isLayoutRequested() && o0iiOioolIi != null) {
/* 33 */                    O0iiOioolIi.I00Ol00(o0iiOioolIi, false, 7);
                        }
                    }
                }

                @Override
                public final boolean shouldDelayChildPressedState() {
/* 1 */             return false;
                }

                @Override
/* 28 */        public final void dispatchDraw(Canvas canvas) {
                }

                @Override
/* 36 */        public final void onDescendantInvalidated(View view, View view2) {
                }
            }

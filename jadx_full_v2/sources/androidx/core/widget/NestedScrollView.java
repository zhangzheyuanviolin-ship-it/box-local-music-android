            package androidx.core.widget;

            import android.R;
            import android.content.Context;
            import android.content.res.TypedArray;
            import android.graphics.Canvas;
            import android.graphics.Rect;
            import android.os.Build;
            import android.os.Parcelable;
            import android.util.AttributeSet;
            import android.util.Log;
            import android.util.TypedValue;
            import android.view.FocusFinder;
            import android.view.KeyEvent;
            import android.view.MotionEvent;
            import android.view.VelocityTracker;
            import android.view.View;
            import android.view.ViewConfiguration;
            import android.view.ViewGroup;
            import android.view.ViewParent;
            import android.view.animation.AnimationUtils;
            import android.widget.EdgeEffect;
            import android.widget.FrameLayout;
            import android.widget.OverScroller;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Map;
            import java.util.WeakHashMap;
            import p000.I000II;
            import p000.I0IIiO0iI;
            import p000.IIOiiIi;
            import p000.IOI0oloi01;
            import p000.IOOlIIilOl0;
            import p000.Iii101;
            import p000.IioO0o;
            import p000.Iioi1Oi0ll;
            import p000.OIIIiOoI;
            import p000.OIIIilli0l;
            import p000.OIIIlI1;
            import p000.OIIIll0io;
            import p000.OIIIo0i01lli;
            import p000.OIiilo1Ool0o;
            import p000.OiOiIO0;
            import p000.OiOiIo1;
            import p000.OooIoii1loo;
            import p000.OooiOl0ioo0i;
            import p000.i1O10l1io1iO;
            
/* 15 */    public class NestedScrollView extends FrameLayout implements OIIIo0i01lli {
                public static final float I00ooiO1I = (float) (Math.log(0.78d) / Math.log(0.9d));
                public static final OIIIiOoI I00oooO = new OIIIiOoI();
                public static final int[] I0100i = {R.attr.fillViewport};
                public final float I00iOIl;
                public long I00iiI;
                public final Rect I00iiO;
                public final OverScroller I00iio;
                public final EdgeEffect I00ilI0I1;
                public final EdgeEffect I00ilO0;
                public OiOiIo1 I00io1l;
                public int I00ioIO;
                public boolean I00l0I0l0lO1;
                public boolean I00l0OO0IO;
                public View I00li1OI;
                public boolean I00ll1;
                public VelocityTracker I00lli11;
                public boolean I00lll10;
                public boolean I00o0iI0io1;
                public final int I00o0l1o1o0;
                public final int I00o101lO;
                public final int I00oI0i;
                public int I00oII;
                public final int[] I00oIiI10;
                public final int[] I00oO101o;
                public int I00oOio10iI1;
                public int I00ol1;
                public OIIIlI1 I00olI;
                public final IIOiiIi I00oli;
                public final IOI0oloi01 I00oliIiO01i;
                public float I00oo1iO0ll;
                public final Iii101 I00ooIo0;

                public NestedScrollView(Context context, AttributeSet attributeSet) {
/* 4 */             super(context, attributeSet, com.box.gallery.R.attr.nestedScrollViewStyle);
/* 12 */            this.I00iiO = new Rect();
/* 15 */            this.I00l0I0l0lO1 = true;
/* 18 */            this.I00l0OO0IO = false;
/* 21 */            this.I00li1OI = null;
/* 23 */            this.I00ll1 = false;
/* 25 */            this.I00o0iI0io1 = true;
/* 28 */            this.I00oII = -1;
/* 33 */            this.I00oIiI10 = new int[2];
/* 37 */            this.I00oO101o = new int[2];
/* 43 */            I0IIiO0iI i0IIiO0iI = new I0IIiO0iI(18);
/* 46 */            i0IIiO0iI.I00iiI = this;
/* 48 */            VarHandle.storeStoreFence();
/* 53 */            Context context2 = getContext();
/* 61 */            IOOlIIilOl0 iOOlIIilOl0 = new IOOlIIilOl0(25);
/* 68 */            IOOlIIilOl0 iOOlIIilOl02 = new IOOlIIilOl0(26);
/* 71 */            Iii101 iii101 = new Iii101();
/* 74 */            iii101.I000II = -1;
/* 76 */            iii101.I000O01llI0 = -1;
/* 78 */            iii101.I000OOo1O = -1;
/* 87 */            iii101.I000OiO = new int[]{Integer.MAX_VALUE, 0};
/* 89 */            iii101.I00000oIO = context2;
/* 91 */            iii101.I00000oOI = i0IIiO0iI;
/* 93 */            iii101.I0000Il00O = iOOlIIilOl0;
/* 95 */            iii101.I0000O = iOOlIIilOl02;
/* 97 */            VarHandle.storeStoreFence();
/* 100 */           this.I00ooIo0 = iii101;
/* 106 */           this.I00ilI0I1 = IioO0o.I00000oIO(context, attributeSet);
/* 112 */           this.I00ilO0 = IioO0o.I00000oIO(context, attributeSet);
/* 135 */           this.I00iOIl = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
/* 146 */           this.I00iio = new OverScroller(getContext());
/* 148 */           setFocusable(true);
/* 153 */           setDescendantFocusability(262144);
/* 156 */           setWillNotDraw(false);
/* 163 */           ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
/* 171 */           this.I00o0l1o1o0 = viewConfiguration.getScaledTouchSlop();
/* 177 */           this.I00o101lO = viewConfiguration.getScaledMinimumFlingVelocity();
/* 183 */           this.I00oI0i = viewConfiguration.getScaledMaximumFlingVelocity();
/* 187 */           TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, I0100i, com.box.gallery.R.attr.nestedScrollViewStyle, 0);
/* 195 */           setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
/* 198 */           typedArrayObtainStyledAttributes.recycle();
/* 206 */           this.I00oli = new IIOiiIi(2);
/* 210 */           IOI0oloi01 iOI0oloi01 = new IOI0oloi01();
/* 213 */           iOI0oloi01.I0000O = this;
/* 215 */           VarHandle.storeStoreFence();
/* 218 */           this.I00oliIiO01i = iOI0oloi01;
/* 220 */           setNestedScrollingEnabled(true);
/* 225 */           OooiOl0ioo0i.I00000oOI(this, I00oooO);
                }

                public static boolean I000lI(View view, NestedScrollView nestedScrollView) {
/* 1 */             if (view == nestedScrollView) {
/* 20 */                return true;
                    }
/* 4 */             Object parent = view.getParent();
                    return (parent instanceof ViewGroup) && I000lI((View) parent, nestedScrollView);
                }

                private OiOiIo1 getScrollFeedbackProvider() {
/* 1 */             OiOiIo1 oiOiIo1 = this.I00io1l;
/* 3 */             if (oiOiIo1 == null) {
/* 7 */                 oiOiIo1 = new OiOiIo1();
/* 14 */                if (Build.VERSION.SDK_INT >= 35) {
/* 21 */                    oiOiIo1.I00000oIO = new OiOiIO0(this);
                        } else {
/* 34 */                    oiOiIo1.I00000oIO = new i1O10l1io1iO(15);
                        }
/* 23 */                VarHandle.storeStoreFence();
/* 37 */                this.I00io1l = oiOiIo1;
                    }
/* 55 */            return oiOiIo1;
                }

                @Override
                public final void I00000oIO(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4, int i5) {
/* 2 */             I000oI1ioi(i4, i5, null);
                }

                public final boolean I00000oOI(int i) {
/* 1 */             View viewFindFocus = findFocus();
/* 5 */             if (viewFindFocus == this) {
/* 7 */                 viewFindFocus = null;
                    }
/* 8 */             View view = viewFindFocus;
/* 13 */            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
/* 17 */            int maxScrollAmount = getMaxScrollAmount();
/* 22 */            if (viewFindNextFocus == null || !I000o00OoI0I(viewFindNextFocus, maxScrollAmount, getHeight())) {
/* 63 */                if (i == 33 && getScrollY() < maxScrollAmount) {
/* 71 */                    maxScrollAmount = getScrollY();
                        } else if (i == 130 && getChildCount() > 0) {
/* 84 */                    View childAt = getChildAt(0);
/* 116 */                   maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
                        }
/* 120 */               if (maxScrollAmount == 0) {
/* 21 */                    return false;
                        }
/* 123 */               if (i != 130) {
/* 126 */                   maxScrollAmount = -maxScrollAmount;
                        }
/* 133 */               I00111O(maxScrollAmount, -1, null, 0, 1, true);
                    } else {
/* 34 */                Rect rect = this.I00iiO;
/* 36 */                viewFindNextFocus.getDrawingRect(rect);
/* 39 */                offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
/* 52 */                I00111O(I0000Il00O(rect), -1, null, 0, 1, true);
/* 55 */                viewFindNextFocus.requestFocus(i);
                    }
/* 137 */           if (view != null && view.isFocused() && !I000o00OoI0I(view, 0, getHeight())) {
/* 155 */               int descendantFocusability = getDescendantFocusability();
/* 161 */               setDescendantFocusability(131072);
/* 164 */               requestFocus();
/* 167 */               setDescendantFocusability(descendantFocusability);
                    }
/* 136 */           return true;
                }

                public final int I0000Il00O(Rect rect) {
/* 6 */             if (getChildCount() == 0) {
/* 5 */                 return 0;
                    }
/* 9 */             int height = getHeight();
/* 13 */            int scrollY = getScrollY();
/* 17 */            int i = scrollY + height;
/* 19 */            int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
/* 25 */            if (rect.top > 0) {
/* 27 */                scrollY += verticalFadingEdgeLength;
                    }
/* 28 */            View childAt = getChildAt(0);
/* 36 */            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
/* 55 */            int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
/* 56 */            int i3 = rect.bottom;
/* 58 */            if (i3 > i2 && rect.top > scrollY) {
/* 85 */                return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i2, (childAt.getBottom() + layoutParams.bottomMargin) - i);
                    }
/* 92 */            if (rect.top >= scrollY || i3 >= i2) {
/* 5 */                 return 0;
                    }
/* 116 */           return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
                }

                @Override
                public final boolean I0000O(View view, View view2, int i, int i2) {
                    return (i & 2) != 0;
                }

                @Override
                public final void I0000oI00(View view, View view2, int i, int i2) {
/* 2 */             IIOiiIi iIOiiIi = this.I00oli;
/* 4 */             if (i2 == 1) {
/* 6 */                 iIOiiIi.I0000Il00O = i;
                    } else {
/* 9 */                 iIOiiIi.I00000oOI = i;
                    }
/* 12 */            I001i1O0Ol(2, i2);
                }

                @Override
                public final void I0001Ioi1lo(View view, int i) {
/* 2 */             IIOiiIi iIOiiIi = this.I00oli;
/* 5 */             if (i == 1) {
/* 7 */                 iIOiiIi.I0000Il00O = 0;
                    } else {
/* 10 */                iIOiiIi.I00000oOI = 0;
                    }
/* 12 */            I001iOo1i0O(i);
                }

                @Override
                public final void I000II(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4, int i5, int[] iArr) {
/* 1 */             I000oI1ioi(i4, i5, iArr);
                }

                @Override
                public final void I000O01llI0(int i, int i2, int[] iArr, int i3) {
/* 7 */             I000OOo1O(i, i2, i3, iArr, null);
                }

                public final boolean I000OOo1O(int i, int i2, int i3, int[] iArr, int[] iArr2) {
                    ViewParent viewParentI0000Il00O;
                    int i4;
                    int i5;
/* 1 */             IOI0oloi01 iOI0oloi01 = this.I00oliIiO01i;
/* 5 */             NestedScrollView nestedScrollView = (NestedScrollView) iOI0oloi01.I0000O;
/* 10 */            if (!iOI0oloi01.I00000oIO || (viewParentI0000Il00O = iOI0oloi01.I0000Il00O(i3)) == null) {
/* 9 */                 return false;
                    }
/* 21 */            if (i == 0 && i2 == 0) {
/* 26 */                if (iArr2 == null) {
/* 9 */                     return false;
                        }
/* 28 */                iArr2[0] = 0;
/* 30 */                iArr2[1] = 0;
/* 9 */                 return false;
                    }
/* 33 */            if (iArr2 != null) {
/* 35 */                nestedScrollView.getLocationInWindow(iArr2);
/* 38 */                i4 = iArr2[0];
/* 40 */                i5 = iArr2[1];
                    } else {
/* 43 */                i4 = 0;
/* 44 */                i5 = 0;
                    }
/* 45 */            if (iArr == null && (iArr = (int[]) iOI0oloi01.I0000oI00) == null) {
/* 54 */                iArr = new int[2];
/* 56 */                iOI0oloi01.I0000oI00 = iArr;
                    }
/* 58 */            iArr[0] = 0;
/* 60 */            iArr[1] = 0;
/* 64 */            NestedScrollView nestedScrollView2 = (NestedScrollView) iOI0oloi01.I0000O;
/* 68 */            if (viewParentI0000Il00O instanceof OIIIll0io) {
/* 72 */                ((OIIIll0io) viewParentI0000Il00O).I000O01llI0(i, i2, iArr, i3);
                    } else if (i3 == 0) {
                        try {
/* 78 */                    viewParentI0000Il00O.onNestedPreScroll(nestedScrollView2, i, i2, iArr);
                        } catch (AbstractMethodError e) {
/* 104 */                   Log.e("ViewParentCompat", "ViewParent " + viewParentI0000Il00O + " does not implement interface method onNestedPreScroll", e);
                        }
                    }
/* 107 */           if (iArr2 != null) {
/* 109 */               nestedScrollView.getLocationInWindow(iArr2);
/* 115 */               iArr2[0] = iArr2[0] - i4;
/* 120 */               iArr2[1] = iArr2[1] - i5;
                    }
                    return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
                }

                /* JADX WARN: Removed duplicated region for block: B:48:0x0098  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I000OiO(KeyEvent keyEvent) {
/* 3 */             this.I00iiO.setEmpty();
/* 13 */            if (getChildCount() > 0) {
/* 15 */                View childAt = getChildAt(0);
/* 23 */                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
/* 49 */                if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
/* 55 */                    if (keyEvent.getAction() == 0) {
/* 57 */                        int keyCode = keyEvent.getKeyCode();
/* 65 */                        if (keyCode == 19) {
                                    return keyEvent.isAltPressed() ? I000l1(33) : I00000oOI(33);
                                }
/* 69 */                        if (keyCode == 20) {
                                    return keyEvent.isAltPressed() ? I000l1(130) : I00000oOI(130);
                                }
/* 73 */                        if (keyCode == 62) {
/* 117 */                           I0010I0i(keyEvent.isShiftPressed() ? 33 : 130);
/* 12 */                            return false;
                                }
/* 77 */                        if (keyCode == 92) {
/* 105 */                           return I000l1(33);
                                }
/* 81 */                        if (keyCode == 93) {
/* 100 */                           return I000l1(130);
                                }
/* 85 */                        if (keyCode == 122) {
/* 96 */                            I0010I0i(33);
/* 12 */                            return false;
                                }
/* 89 */                        if (keyCode == 123) {
/* 92 */                            I0010I0i(130);
/* 12 */                            return false;
                                }
                            }
                        } else if (isFocused() && keyEvent.getKeyCode() != 4) {
/* 166 */                   View viewFindFocus = findFocus();
/* 170 */                   if (viewFindFocus == this) {
/* 172 */                       viewFindFocus = null;
                            }
/* 177 */                   View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
/* 181 */                   if (viewFindNextFocus != null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
/* 191 */                       return true;
                            }
                        }
                    }
/* 12 */            return false;
                }

                public final void I000iOII(int i) {
/* 5 */             if (getChildCount() > 0) {
/* 28 */                this.I00iio.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
/* 33 */                I001i1O0Ol(2, 1);
/* 40 */                this.I00ol1 = getScrollY();
/* 42 */                postInvalidateOnAnimation();
/* 49 */                if (Build.VERSION.SDK_INT >= 35) {
/* 61 */                    Iioi1Oi0ll.I00000oIO(this, Math.abs(this.I00iio.getCurrVelocity()));
                        }
                    }
                }

                public final boolean I000l1(int i) {
                    int childCount;
/* 9 */             boolean z = i == 130;
/* 10 */            int height = getHeight();
/* 14 */            Rect rect = this.I00iiO;
/* 16 */            rect.top = 0;
/* 18 */            rect.bottom = height;
/* 20 */            if (z && (childCount = getChildCount()) > 0) {
/* 29 */                View childAt = getChildAt(childCount - 1);
/* 50 */                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
/* 51 */                rect.bottom = paddingBottom;
/* 54 */                rect.top = paddingBottom - height;
                    }
/* 60 */            return I0010o(i, rect.top, rect.bottom);
                }

                public final boolean I000o00OoI0I(View view, int i, int i2) {
/* 1 */             Rect rect = this.I00iiO;
/* 3 */             view.getDrawingRect(rect);
/* 6 */             offsetDescendantRectToMyCoords(view, rect);
                    return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i2;
                }

                public final void I000oI1ioi(int i, int i2, int[] iArr) {
/* 1 */             int scrollY = getScrollY();
/* 6 */             scrollBy(0, i);
/* 13 */            int scrollY2 = getScrollY() - scrollY;
/* 15 */            if (iArr != null) {
/* 21 */                iArr[1] = iArr[1] + scrollY2;
                    }
/* 32 */            this.I00oliIiO01i.I00000oOI(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
                }

                public final void I00100l0(MotionEvent motionEvent) {
/* 1 */             int actionIndex = motionEvent.getActionIndex();
/* 11 */            if (motionEvent.getPointerId(actionIndex) == this.I00oII) {
/* 17 */                int i = actionIndex == 0 ? 1 : 0;
/* 23 */                this.I00ioIO = (int) motionEvent.getY(i);
/* 29 */                this.I00oII = motionEvent.getPointerId(i);
/* 31 */                VelocityTracker velocityTracker = this.I00lli11;
/* 33 */                if (velocityTracker != null) {
/* 35 */                    velocityTracker.clear();
                        }
                    }
                }

                public final boolean I00100o1O0lo(int i, int i2, int i3, int i4) {
                    int i5;
                    boolean z;
                    int i6;
                    boolean z2;
/* 1 */             getOverScrollMode();
/* 5 */             super.computeHorizontalScrollRange();
/* 8 */             super.computeHorizontalScrollExtent();
/* 11 */            computeVerticalScrollRange();
/* 14 */            super.computeVerticalScrollExtent();
/* 18 */            int i7 = i3 + i;
/* 20 */            if (i2 <= 0 && i2 >= 0) {
/* 28 */                i5 = i2;
/* 29 */                z = false;
                    } else {
/* 22 */                i5 = 0;
/* 23 */                z = true;
                    }
/* 30 */            if (i7 > i4) {
/* 32 */                i6 = i4;
                    } else {
/* 35 */                if (i7 >= 0) {
/* 39 */                    i6 = i7;
/* 40 */                    z2 = false;
/* 41 */                    if (z2 && this.I00oliIiO01i.I0000Il00O(1) == null) {
/* 61 */                        this.I00iio.springBack(i5, i6, 0, 0, 0, getScrollRange());
                            }
/* 64 */                    super.scrollTo(i5, i6);
                            return !z || z2;
                        }
/* 37 */                i6 = 0;
                    }
/* 33 */            z2 = true;
/* 41 */            if (z2) {
/* 61 */                this.I00iio.springBack(i5, i6, 0, 0, 0, getScrollRange());
                    }
/* 64 */            super.scrollTo(i5, i6);
                    if (z) {
                    }
                }

                public final void I0010I0i(int i) {
/* 9 */             boolean z = i == 130;
/* 10 */            int height = getHeight();
/* 14 */            Rect rect = this.I00iiO;
/* 16 */            if (z) {
/* 23 */                rect.top = getScrollY() + height;
/* 25 */                int childCount = getChildCount();
/* 29 */                if (childCount > 0) {
/* 32 */                    View childAt = getChildAt(childCount - 1);
/* 53 */                    int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
/* 57 */                    if (rect.top + height > paddingBottom) {
/* 60 */                        rect.top = paddingBottom - height;
                            }
                        }
                    } else {
/* 67 */                int scrollY = getScrollY() - height;
/* 68 */                rect.top = scrollY;
/* 70 */                if (scrollY < 0) {
/* 72 */                    rect.top = 0;
                        }
                    }
/* 74 */            int i2 = rect.top;
/* 76 */            int i3 = height + i2;
/* 77 */            rect.bottom = i3;
/* 79 */            I0010o(i, i2, i3);
                }

                /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I0010o(int i, int i2, int i3) {
                    boolean z;
/* 7 */             int height = getHeight();
/* 11 */            int scrollY = getScrollY();
/* 15 */            int i4 = height + scrollY;
/* 22 */            boolean z2 = i == 33;
/* 26 */            ArrayList<View> focusables = getFocusables(2);
/* 30 */            int size = focusables.size();
/* 34 */            View view = null;
/* 36 */            boolean z3 = false;
/* 37 */            for (int i5 = 0; i5 < size; i5++) {
/* 39 */                View view2 = focusables.get(i5);
/* 45 */                int top = view2.getTop();
/* 49 */                int bottom = view2.getBottom();
/* 53 */                if (i2 < bottom && top < i3) {
/* 64 */                    boolean z4 = i2 < top && bottom < i3;
/* 66 */                    if (view == null) {
/* 68 */                        view = view2;
/* 69 */                        z3 = z4;
                            } else {
/* 90 */                        boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
/* 91 */                        if (z3) {
/* 93 */                            if (z4 && z5) {
/* 105 */                               view = view2;
                                    }
                                } else if (z4) {
/* 100 */                           view = view2;
/* 101 */                           z3 = true;
                                } else if (z5) {
                                }
                            }
                        }
                    }
/* 113 */           View view3 = view == null ? this : view;
/* 114 */           if (i2 < scrollY || i3 > i4) {
/* 134 */               I00111O(z2 ? i2 - scrollY : i3 - i4, -1, null, 0, 1, true);
/* 137 */               z = true;
                    } else {
/* 118 */               z = false;
                    }
/* 143 */           if (view3 != findFocus()) {
/* 145 */               view3.requestFocus(i);
                    }
/* 408 */           return z;
                }

                /* JADX WARN: Removed duplicated region for block: B:53:0x0116  */
                /* JADX WARN: Removed duplicated region for block: B:60:0x0127  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int I00111O(int i, int i2, MotionEvent motionEvent, int i3, int i4, boolean z) {
                    int i5;
                    int i6;
                    boolean z2;
                    boolean z3;
                    VelocityTracker velocityTracker;
/* 10 */            if (i4 == 1) {
/* 13 */                I001i1O0Ol(2, i4);
                    }
/* 24 */            boolean zI000OOo1O = I000OOo1O(0, i, i4, this.I00oO101o, this.I00oIiI10);
/* 28 */            int[] iArr = this.I00oIiI10;
/* 30 */            int[] iArr2 = this.I00oO101o;
/* 33 */            if (zI000OOo1O) {
/* 37 */                i5 = i - iArr2[1];
/* 39 */                i6 = iArr[1];
                    } else {
/* 42 */                i5 = i;
/* 44 */                i6 = 0;
                    }
/* 45 */            int scrollY = getScrollY();
/* 49 */            int scrollRange = getScrollRange();
/* 53 */            int overScrollMode = getOverScrollMode();
/* 72 */            boolean z4 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z;
/* 92 */            boolean z5 = I00100o1O0lo(i5, 0, scrollY, scrollRange) && this.I00oliIiO01i.I0000Il00O(i4) == null;
/* 98 */            int scrollY2 = getScrollY() - scrollY;
/* 99 */            if (motionEvent != null && scrollY2 != 0) {
/* 117 */               getScrollFeedbackProvider().I00000oIO.onScrollProgress(motionEvent.getDeviceId(), motionEvent.getSource(), i2, scrollY2);
                    }
/* 122 */           iArr2[1] = 0;
/* 141 */           this.I00oliIiO01i.I00000oOI(0, scrollY2, 0, i5 - scrollY2, this.I00oIiI10, i4, iArr2);
/* 146 */           int i7 = i6 + iArr[1];
/* 149 */           int i8 = i5 - iArr2[1];
/* 151 */           int i9 = scrollY + i8;
/* 152 */           EdgeEffect edgeEffect = this.I00ilO0;
/* 154 */           EdgeEffect edgeEffect2 = this.I00ilI0I1;
/* 156 */           if (i9 >= 0) {
/* 208 */               if (i9 > scrollRange && z4) {
/* 229 */                   IioO0o.I0000Il00O(edgeEffect, i8 / getHeight(), 1.0f - (i3 / getWidth()));
/* 232 */                   if (motionEvent != null) {
/* 248 */                       z2 = false;
/* 249 */                       getScrollFeedbackProvider().I00000oIO.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i2, false);
                            } else {
/* 253 */                       z2 = false;
                            }
/* 258 */                   if (!edgeEffect2.isFinished()) {
/* 260 */                       edgeEffect2.onRelease();
                            }
                        }
/* 267 */               if (edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
/* 279 */                   postInvalidateOnAnimation();
/* 282 */                   z3 = z2;
                        } else {
/* 276 */                   z3 = z5;
                        }
/* 283 */               if (z3 && i4 == 0 && (velocityTracker = this.I00lli11) != null) {
/* 291 */                   velocityTracker.clear();
                        }
/* 294 */               if (i4 == 1) {
/* 296 */                   I001iOo1i0O(i4);
/* 299 */                   edgeEffect2.onRelease();
/* 302 */                   edgeEffect.onRelease();
                        }
/* 685 */               return i7;
                    }
/* 158 */           if (z4) {
/* 175 */               IioO0o.I0000Il00O(edgeEffect2, (-i8) / getHeight(), i3 / getWidth());
/* 178 */               if (motionEvent != null) {
/* 194 */                   getScrollFeedbackProvider().I00000oIO.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i2, true);
                        }
/* 201 */               if (!edgeEffect.isFinished()) {
/* 203 */                   edgeEffect.onRelease();
                        }
                    }
/* 206 */           z2 = false;
/* 267 */           if (edgeEffect2.isFinished()) {
/* 279 */               postInvalidateOnAnimation();
/* 282 */               z3 = z2;
                    }
/* 283 */           if (z3) {
/* 291 */               velocityTracker.clear();
                    }
/* 294 */           if (i4 == 1) {
                    }
/* 685 */           return i7;
                }

                public final boolean I001IIilI0O(EdgeEffect edgeEffect, int i) {
/* 2 */             if (i > 0) {
/* 1 */                 return true;
                    }
/* 14 */            float fI00000oOI = IioO0o.I00000oOI(edgeEffect) * getHeight();
/* 24 */            float fAbs = Math.abs(-i) * 0.35f;
/* 30 */            float f = this.I00iOIl * 0.015f;
/* 33 */            double dLog = Math.log(fAbs / f);
/* 37 */            double d = I00ooiO1I;
                    return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) f))) < fI00000oOI;
                }

                public final void I001IO000(int i, int i2, boolean z) {
/* 5 */             if (getChildCount() == 0) {
/* 7 */                 return;
                    }
/* 20 */            if (AnimationUtils.currentAnimationTimeMillis() - this.I00iiI > 250) {
/* 23 */                View childAt = getChildAt(0);
/* 31 */                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
/* 42 */                int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
/* 56 */                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
/* 57 */                int scrollY = getScrollY();
/* 75 */                int iMax = Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY;
/* 86 */                this.I00iio.startScroll(getScrollX(), scrollY, 0, iMax, 250);
/* 89 */                if (z) {
/* 92 */                    I001i1O0Ol(2, 1);
                        } else {
/* 96 */                    I001iOo1i0O(1);
                        }
/* 103 */               this.I00ol1 = getScrollY();
/* 105 */               postInvalidateOnAnimation();
                    } else {
/* 109 */               OverScroller overScroller = this.I00iio;
/* 115 */               if (!overScroller.isFinished()) {
/* 117 */                   overScroller.abortAnimation();
/* 120 */                   I001iOo1i0O(1);
                        }
/* 123 */               scrollBy(i, i2);
                    }
/* 130 */           this.I00iiI = AnimationUtils.currentAnimationTimeMillis();
                }

                public final boolean I001i1O0Ol(int i, int i2) {
                    boolean zOnStartNestedScroll;
/* 1 */             IOI0oloi01 iOI0oloi01 = this.I00oliIiO01i;
/* 5 */             View view = (NestedScrollView) iOI0oloi01.I0000O;
/* 12 */            if (iOI0oloi01.I0000Il00O(i2) != null) {
/* 11 */                return true;
                    }
/* 18 */            if (iOI0oloi01.I00000oIO) {
/* 24 */                View view2 = view;
/* 25 */                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
/* 27 */                    boolean z = parent instanceof OIIIll0io;
/* 33 */                    if (z) {
/* 38 */                        zOnStartNestedScroll = ((OIIIll0io) parent).I0000O(view2, view, i, i2);
                            } else if (i2 == 0) {
                                try {
/* 45 */                            zOnStartNestedScroll = parent.onStartNestedScroll(view2, view, i);
                                } catch (AbstractMethodError e) {
/* 68 */                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e);
                                }
                            } else {
/* 71 */                        zOnStartNestedScroll = false;
                            }
/* 72 */                    if (zOnStartNestedScroll) {
/* 74 */                        if (i2 == 0) {
/* 82 */                            iOI0oloi01.I00000oOI = parent;
                                } else if (i2 == 1) {
/* 79 */                            iOI0oloi01.I0000Il00O = parent;
                                }
/* 84 */                        if (z) {
/* 88 */                            ((OIIIll0io) parent).I0000oI00(view2, view, i, i2);
/* 11 */                            return true;
                                }
/* 92 */                        if (i2 != 0) {
/* 11 */                            return true;
                                }
                                try {
/* 94 */                            parent.onNestedScrollAccepted(view2, view, i);
/* 11 */                            return true;
                                } catch (AbstractMethodError e2) {
/* 116 */                           Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e2);
/* 11 */                            return true;
                                }
                            }
/* 122 */                   if (parent instanceof View) {
/* 125 */                       view2 = parent;
                            }
                        }
                    }
/* 17 */            return false;
                }

                public final boolean I001i1lo1io(MotionEvent motionEvent) {
                    boolean z;
/* 1 */             EdgeEffect edgeEffect = this.I00ilI0I1;
/* 11 */            if (IioO0o.I00000oOI(edgeEffect) != 0.0f) {
/* 23 */                IioO0o.I0000Il00O(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
/* 26 */                z = true;
                    } else {
/* 28 */                z = false;
                    }
/* 29 */            EdgeEffect edgeEffect2 = this.I00ilO0;
/* 37 */            if (IioO0o.I00000oOI(edgeEffect2) == 0.0f) {
/* 77 */                return z;
                    }
/* 52 */            IioO0o.I0000Il00O(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
/* 10 */            return true;
                }

                public final void I001iOo1i0O(int i) {
/* 1 */             IOI0oloi01 iOI0oloi01 = this.I00oliIiO01i;
/* 3 */             ViewParent viewParentI0000Il00O = iOI0oloi01.I0000Il00O(i);
/* 7 */             if (viewParentI0000Il00O != null) {
/* 11 */                NestedScrollView nestedScrollView = (NestedScrollView) iOI0oloi01.I0000O;
/* 15 */                if (viewParentI0000Il00O instanceof OIIIll0io) {
/* 19 */                    ((OIIIll0io) viewParentI0000Il00O).I0001Ioi1lo(nestedScrollView, i);
                        } else if (i == 0) {
                            try {
/* 25 */                        viewParentI0000Il00O.onStopNestedScroll(nestedScrollView);
                            } catch (AbstractMethodError e) {
/* 51 */                        Log.e("ViewParentCompat", "ViewParent " + viewParentI0000Il00O + " does not implement interface method onStopNestedScroll", e);
                            }
                        }
/* 55 */                if (i == 0) {
/* 64 */                    iOI0oloi01.I00000oOI = null;
                        } else {
/* 58 */                    if (i != 1) {
/* 77 */                        return;
                            }
/* 61 */                    iOI0oloi01.I0000Il00O = null;
                        }
                    }
                }

                @Override
                public final void addView(View view) {
/* 5 */             if (getChildCount() <= 0) {
/* 7 */                 super.addView(view);
                    } else {
/* 13 */                I000II.I001IO000("ScrollView can host only one direct child");
                    }
                }

                @Override
                public final int computeHorizontalScrollExtent() {
/* 1 */             return super.computeHorizontalScrollExtent();
                }

                @Override
                public final int computeHorizontalScrollOffset() {
/* 1 */             return super.computeHorizontalScrollOffset();
                }

                @Override
                public final int computeHorizontalScrollRange() {
/* 1 */             return super.computeHorizontalScrollRange();
                }

                /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
                /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
                /* JADX WARN: Removed duplicated region for block: B:24:0x00b3  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x00b6  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x00eb  */
                /* JADX WARN: Removed duplicated region for block: B:42:0x00ef  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void computeScroll() {
                    int iRound;
                    int i;
                    int i2;
/* 3 */             OverScroller overScroller = this.I00iio;
/* 9 */             if (overScroller.isFinished()) {
/* 11 */                return;
                    }
/* 12 */            overScroller.computeScrollOffset();
/* 15 */            int currY = overScroller.getCurrY();
/* 21 */            int i3 = currY - this.I00ol1;
/* 23 */            int height = getHeight();
/* 27 */            EdgeEffect edgeEffect = this.I00ilI0I1;
/* 29 */            EdgeEffect edgeEffect2 = this.I00ilO0;
/* 36 */            if (i3 <= 0 || IioO0o.I00000oOI(edgeEffect) == 0.0f) {
/* 70 */                if (i3 < 0 && IioO0o.I00000oOI(edgeEffect2) != 0.0f) {
                            float f = height;
/* 90 */                    iRound = Math.round(IioO0o.I0000Il00O(edgeEffect2, (i3 * 4.0f) / f, 0.5f) * (f / 4.0f));
/* 94 */                    if (iRound != i3) {
/* 96 */                        edgeEffect2.finish();
                            }
                        }
/* 100 */               this.I00ol1 = currY;
/* 102 */               int[] iArr = this.I00oO101o;
/* 106 */               iArr[1] = 0;
/* 111 */               I000OOo1O(0, i3, 1, iArr, null);
/* 118 */               i = i3 - iArr[1];
/* 119 */               int scrollRange = getScrollRange();
/* 127 */               if (Build.VERSION.SDK_INT >= 35) {
/* 137 */                   Iioi1Oi0ll.I00000oIO(this, Math.abs(overScroller.getCurrVelocity()));
                        }
/* 140 */               if (i == 0) {
/* 142 */                   int scrollY = getScrollY();
/* 150 */                   I00100o1O0lo(i, getScrollX(), scrollY, scrollRange);
/* 157 */                   int scrollY2 = getScrollY() - scrollY;
/* 159 */                   int i4 = i - scrollY2;
/* 161 */                   iArr[1] = 0;
/* 171 */                   i2 = 1;
/* 172 */                   this.I00oliIiO01i.I00000oOI(0, scrollY2, 0, i4, this.I00oIiI10, 1, iArr);
/* 177 */                   i = i4 - iArr[1];
                        } else {
/* 180 */                   i2 = 1;
                        }
/* 181 */               if (i != 0) {
/* 183 */                   int overScrollMode = getOverScrollMode();
/* 187 */                   if (overScrollMode == 0 || (overScrollMode == i2 && scrollRange > 0)) {
/* 193 */                       if (i < 0) {
/* 199 */                           if (edgeEffect.isFinished()) {
/* 206 */                               edgeEffect.onAbsorb((int) overScroller.getCurrVelocity());
                                    }
                                } else if (edgeEffect2.isFinished()) {
/* 221 */                           edgeEffect2.onAbsorb((int) overScroller.getCurrVelocity());
                                }
                            }
/* 224 */                   overScroller.abortAnimation();
/* 227 */                   I001iOo1i0O(i2);
                        }
/* 234 */               if (overScroller.isFinished()) {
/* 236 */                   postInvalidateOnAnimation();
/* 239 */                   return;
                        } else {
/* 240 */                   I001iOo1i0O(i2);
/* 245 */                   return;
                        }
                    }
/* 59 */            iRound = Math.round(IioO0o.I0000Il00O(edgeEffect, ((-i3) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
/* 63 */            if (iRound != i3) {
/* 65 */                edgeEffect.finish();
                    }
/* 68 */            i3 -= iRound;
/* 100 */           this.I00ol1 = currY;
/* 102 */           int[] iArr2 = this.I00oO101o;
/* 106 */           iArr2[1] = 0;
/* 111 */           I000OOo1O(0, i3, 1, iArr2, null);
/* 118 */           i = i3 - iArr2[1];
/* 119 */           int scrollRange2 = getScrollRange();
/* 127 */           if (Build.VERSION.SDK_INT >= 35) {
                    }
/* 140 */           if (i == 0) {
                    }
/* 181 */           if (i != 0) {
                    }
/* 234 */           if (overScroller.isFinished()) {
                    }
                }

                @Override
                public final int computeVerticalScrollExtent() {
/* 1 */             return super.computeVerticalScrollExtent();
                }

                @Override
                public final int computeVerticalScrollOffset() {
/* 6 */             return Math.max(0, super.computeVerticalScrollOffset());
                }

                @Override
                public final int computeVerticalScrollRange() {
/* 1 */             int childCount = getChildCount();
/* 18 */            int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
/* 19 */            if (childCount == 0) {
/* 21 */                return height;
                    }
/* 23 */            View childAt = getChildAt(0);
/* 39 */            int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
/* 40 */            int scrollY = getScrollY();
/* 46 */            int iMax = Math.max(0, bottom - height);
                    return scrollY < 0 ? bottom - scrollY : scrollY > iMax ? (scrollY - iMax) + bottom : bottom;
                }

                @Override
                public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
                    return super.dispatchKeyEvent(keyEvent) || I000OiO(keyEvent);
                }

                @Override
                public final boolean dispatchNestedFling(float f, float f2, boolean z) {
                    ViewParent viewParentI0000Il00O;
/* 1 */             IOI0oloi01 iOI0oloi01 = this.I00oliIiO01i;
/* 6 */             if (iOI0oloi01.I00000oIO && (viewParentI0000Il00O = iOI0oloi01.I0000Il00O(0)) != null) {
                        try {
/* 18 */                    return viewParentI0000Il00O.onNestedFling((NestedScrollView) iOI0oloi01.I0000O, f, f2, z);
                        } catch (AbstractMethodError e) {
/* 45 */                    Log.e("ViewParentCompat", "ViewParent " + viewParentI0000Il00O + " does not implement interface method onNestedFling", e);
                        }
                    }
/* 5 */             return false;
                }

                @Override
                public final boolean dispatchNestedPreFling(float f, float f2) {
                    ViewParent viewParentI0000Il00O;
/* 1 */             IOI0oloi01 iOI0oloi01 = this.I00oliIiO01i;
/* 6 */             if (iOI0oloi01.I00000oIO && (viewParentI0000Il00O = iOI0oloi01.I0000Il00O(0)) != null) {
                        try {
/* 18 */                    return viewParentI0000Il00O.onNestedPreFling((NestedScrollView) iOI0oloi01.I0000O, f, f2);
                        } catch (AbstractMethodError e) {
/* 45 */                    Log.e("ViewParentCompat", "ViewParent " + viewParentI0000Il00O + " does not implement interface method onNestedPreFling", e);
                        }
                    }
/* 5 */             return false;
                }

                @Override
                public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
/* 7 */             return I000OOo1O(i, i2, 0, iArr, iArr2);
                }

                @Override
                public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
/* 10 */            return this.I00oliIiO01i.I00000oOI(i, i2, i3, i4, iArr, 0, null);
                }

                @Override
                public final void draw(Canvas canvas) {
                    int paddingLeft;
/* 1 */             super.draw(canvas);
/* 4 */             int scrollY = getScrollY();
/* 8 */             EdgeEffect edgeEffect = this.I00ilI0I1;
/* 14 */            int paddingLeft2 = 0;
/* 15 */            if (!edgeEffect.isFinished()) {
/* 17 */                int iSave = canvas.save();
/* 21 */                int width = getWidth();
/* 25 */                int height = getHeight();
/* 29 */                int iMin = Math.min(0, scrollY);
/* 37 */                if (getClipToPadding()) {
/* 48 */                    width -= getPaddingRight() + getPaddingLeft();
/* 49 */                    paddingLeft = getPaddingLeft();
/* 62 */                    height -= getPaddingBottom() + getPaddingTop();
/* 67 */                    iMin += getPaddingTop();
                        } else {
/* 69 */                    paddingLeft = 0;
                        }
/* 72 */                canvas.translate(paddingLeft, iMin);
/* 75 */                edgeEffect.setSize(width, height);
/* 82 */                if (edgeEffect.draw(canvas)) {
/* 84 */                    postInvalidateOnAnimation();
                        }
/* 87 */                canvas.restoreToCount(iSave);
                    }
/* 90 */            EdgeEffect edgeEffect2 = this.I00ilO0;
/* 96 */            if (edgeEffect2.isFinished()) {
/* 437 */               return;
                    }
/* 98 */            int iSave2 = canvas.save();
/* 102 */           int width2 = getWidth();
/* 106 */           int height2 = getHeight();
/* 118 */           int iMax = Math.max(getScrollRange(), scrollY) + height2;
/* 123 */           if (getClipToPadding()) {
/* 134 */               width2 -= getPaddingRight() + getPaddingLeft();
/* 135 */               paddingLeft2 = getPaddingLeft();
                    }
/* 143 */           if (getClipToPadding()) {
/* 154 */               height2 -= getPaddingBottom() + getPaddingTop();
/* 159 */               iMax -= getPaddingBottom();
                    }
/* 163 */           canvas.translate(paddingLeft2 - width2, iMax);
/* 170 */           canvas.rotate(180.0f, width2, 0.0f);
/* 173 */           edgeEffect2.setSize(width2, height2);
/* 180 */           if (edgeEffect2.draw(canvas)) {
/* 182 */               postInvalidateOnAnimation();
                    }
/* 185 */           canvas.restoreToCount(iSave2);
                }

                @Override
                public float getBottomFadingEdgeStrength() {
/* 5 */             if (getChildCount() == 0) {
/* 7 */                 return 0.0f;
                    }
/* 10 */            View childAt = getChildAt(0);
/* 18 */            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
/* 20 */            int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
/* 45 */            int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
/* 46 */            if (bottom < verticalFadingEdgeLength) {
/* 50 */                return bottom / verticalFadingEdgeLength;
                    }
/* 52 */            return 1.0f;
                }

                public int getMaxScrollAmount() {
/* 9 */             return (int) (getHeight() * 0.5f);
                }

                @Override
                public int getNestedScrollAxes() {
/* 1 */             IIOiiIi iIOiiIi = this.I00oli;
/* 7 */             return iIOiiIi.I0000Il00O | iIOiiIi.I00000oOI;
                }

                public int getScrollRange() {
/* 6 */             if (getChildCount() <= 0) {
/* 5 */                 return 0;
                    }
/* 8 */             View childAt = getChildAt(0);
/* 16 */            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
/* 43 */            return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
                }

                @Override
                public float getTopFadingEdgeStrength() {
/* 5 */             if (getChildCount() == 0) {
/* 7 */                 return 0.0f;
                    }
/* 9 */             int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
/* 13 */            int scrollY = getScrollY();
/* 17 */            if (scrollY < verticalFadingEdgeLength) {
/* 21 */                return scrollY / verticalFadingEdgeLength;
                    }
/* 23 */            return 1.0f;
                }

                public float getVerticalScrollFactorCompat() {
/* 1 */             float f = this.I00oo1iO0ll;
/* 6 */             if (f != 0.0f) {
/* 55 */                return f;
                    }
/* 10 */            TypedValue typedValue = new TypedValue();
/* 13 */            Context context = getContext();
/* 29 */            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
/* 48 */                I000II.I001IO000("Expected theme to define listPreferredItemHeight.");
/* 3 */                 return 0.0f;
                    }
/* 39 */            float dimension = typedValue.getDimension(context.getResources().getDisplayMetrics());
/* 43 */            this.I00oo1iO0ll = dimension;
/* 45 */            return dimension;
                }

                @Override
                public final boolean hasNestedScrollingParent() {
                    return this.I00oliIiO01i.I0000Il00O(0) != null;
                }

                @Override
                public final boolean isNestedScrollingEnabled() {
/* 3 */             return this.I00oliIiO01i.I00000oIO;
                }

                @Override
                public final void measureChild(View view, int i, int i2) {
/* 1 */             ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
/* 25 */            view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
                }

                @Override
                public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
/* 5 */             ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
/* 39 */            view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
                }

                @Override
                public final void onAttachedToWindow() {
/* 1 */             super.onAttachedToWindow();
/* 5 */             this.I00l0OO0IO = false;
                }

                @Override
                public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
                    int i;
                    int width;
                    float axisValue;
                    boolean z;
/* 8 */             if (motionEvent.getAction() == 8 && !this.I00ll1) {
/* 20 */                float f = 0.0f;
/* 21 */                if ((motionEvent.getSource() & 2) == 2) {
/* 25 */                    axisValue = motionEvent.getAxisValue(9);
/* 34 */                    i = 9;
/* 33 */                    width = (int) motionEvent.getX();
                        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
/* 48 */                    float axisValue2 = motionEvent.getAxisValue(26);
/* 58 */                    i = 26;
/* 56 */                    width = getWidth() / 2;
/* 60 */                    axisValue = axisValue2;
                        } else {
/* 62 */                    i = 0;
/* 63 */                    width = 0;
/* 64 */                    axisValue = 0.0f;
                        }
/* 67 */                if (axisValue != 0.0f) {
/* 92 */                    I00111O(-((int) (getVerticalScrollFactorCompat() * axisValue)), i, motionEvent, width, 1, (motionEvent.getSource() & 8194) == 8194);
/* 95 */                    if (i != 0) {
/* 97 */                        Iii101 iii101 = this.I00ooIo0;
/* 99 */                        I0IIiO0iI i0IIiO0iI = iii101.I00000oOI;
/* 101 */                       int[] iArr = iii101.I000OiO;
/* 103 */                       int source = motionEvent.getSource();
/* 107 */                       int deviceId = motionEvent.getDeviceId();
/* 113 */                       if (iii101.I000O01llI0 == source && iii101.I000OOo1O == deviceId && iii101.I000II == i) {
/* 124 */                           z = false;
                                } else {
/* 126 */                           IOOlIIilOl0 iOOlIIilOl0 = iii101.I0000Il00O;
/* 128 */                           Context context = iii101.I00000oIO;
/* 130 */                           iOOlIIilOl0.getClass();
/* 133 */                           ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
/* 149 */                           iArr[0] = viewConfiguration.getScaledMinimumFlingVelocity(motionEvent.getDeviceId(), i, motionEvent.getSource());
/* 163 */                           iArr[1] = viewConfiguration.getScaledMaximumFlingVelocity(motionEvent.getDeviceId(), i, motionEvent.getSource());
/* 165 */                           iii101.I000O01llI0 = source;
/* 167 */                           iii101.I000OOo1O = deviceId;
/* 169 */                           iii101.I000II = i;
/* 171 */                           z = true;
                                }
/* 172 */                       int i2 = iArr[0];
/* 174 */                       VelocityTracker velocityTrackerObtain = iii101.I0000oI00;
/* 179 */                       if (i2 != Integer.MAX_VALUE) {
/* 190 */                           if (velocityTrackerObtain == null) {
/* 192 */                               velocityTrackerObtain = VelocityTracker.obtain();
/* 196 */                               iii101.I0000oI00 = velocityTrackerObtain;
                                    }
/* 200 */                           iii101.I0000O.getClass();
/* 203 */                           Map map = OooIoii1loo.I00000oIO;
/* 205 */                           velocityTrackerObtain.addMovement(motionEvent);
/* 213 */                           velocityTrackerObtain.computeCurrentVelocity(1000, Float.MAX_VALUE);
/* 222 */                           if (OooIoii1loo.I00000oIO.get(velocityTrackerObtain) != null) {
/* 310 */                               OIiilo1Ool0o.I00000oIO();
/* 7 */                                 return false;
                                    }
/* 224 */                           float axisVelocity = velocityTrackerObtain.getAxisVelocity(i);
/* 230 */                           NestedScrollView nestedScrollView = (NestedScrollView) i0IIiO0iI.I00iiI;
/* 234 */                           NestedScrollView nestedScrollView2 = (NestedScrollView) i0IIiO0iI.I00iiI;
/* 241 */                           float f2 = axisVelocity * (-nestedScrollView.getVerticalScrollFactorCompat());
/* 242 */                           float fSignum = Math.signum(f2);
/* 246 */                           if (z || (fSignum != Math.signum(iii101.I0001Ioi1lo) && fSignum != 0.0f)) {
/* 264 */                               nestedScrollView2.I00iio.abortAnimation();
                                    }
/* 276 */                           if (Math.abs(f2) >= iArr[0]) {
/* 288 */                               float fMax = Math.max(-r0, Math.min(f2, iArr[1]));
/* 294 */                               if (fMax != 0.0f) {
/* 299 */                                   nestedScrollView2.I00iio.abortAnimation();
/* 303 */                                   nestedScrollView2.I000iOII((int) fMax);
/* 306 */                                   f = fMax;
                                        }
/* 307 */                               iii101.I0001Ioi1lo = f;
/* 82 */                                return true;
                                    }
                                } else if (velocityTrackerObtain != null) {
/* 183 */                           velocityTrackerObtain.recycle();
/* 187 */                           iii101.I0000oI00 = null;
/* 82 */                            return true;
                                }
                            }
/* 82 */                    return true;
                        }
                    }
/* 7 */             return false;
                }

                /* JADX WARN: Removed duplicated region for block: B:34:0x0081  */
                /* JADX WARN: Removed duplicated region for block: B:62:0x0113  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
/* 1 */             int action = motionEvent.getAction();
/* 5 */             boolean z = true;
/* 7 */             if (action == 2 && this.I00ll1) {
/* 5 */                 return true;
                    }
/* 14 */            int i = action & 255;
/* 18 */            if (i == 0) {
/* 178 */               int y = (int) motionEvent.getY();
/* 183 */               int x = (int) motionEvent.getX();
/* 184 */               int childCount = getChildCount();
/* 188 */               OverScroller overScroller = this.I00iio;
/* 190 */               if (childCount > 0) {
/* 192 */                   int scrollY = getScrollY();
/* 196 */                   View childAt = getChildAt(0);
/* 205 */                   if (y < childAt.getTop() - scrollY || y >= childAt.getBottom() - scrollY || x < childAt.getLeft() || x >= childAt.getRight()) {
/* 280 */                       if (!I001i1lo1io(motionEvent) && overScroller.isFinished()) {
/* 289 */                           z = false;
                                }
/* 290 */                       this.I00ll1 = z;
/* 292 */                       VelocityTracker velocityTracker = this.I00lli11;
/* 294 */                       if (velocityTracker != null) {
/* 296 */                           velocityTracker.recycle();
/* 299 */                           this.I00lli11 = null;
                                }
                            } else {
/* 226 */                       this.I00ioIO = y;
/* 232 */                       this.I00oII = motionEvent.getPointerId(0);
/* 234 */                       VelocityTracker velocityTracker2 = this.I00lli11;
/* 236 */                       if (velocityTracker2 == null) {
/* 242 */                           this.I00lli11 = VelocityTracker.obtain();
                                } else {
/* 245 */                           velocityTracker2.clear();
                                }
/* 250 */                       this.I00lli11.addMovement(motionEvent);
/* 253 */                       overScroller.computeScrollOffset();
/* 260 */                       if (!I001i1lo1io(motionEvent) && overScroller.isFinished()) {
/* 269 */                           z = false;
                                }
/* 270 */                       this.I00ll1 = z;
/* 272 */                       I001i1O0Ol(2, 0);
                            }
                        }
                    } else if (i == 1) {
/* 130 */               this.I00ll1 = false;
/* 132 */               this.I00oII = -1;
/* 134 */               VelocityTracker velocityTracker3 = this.I00lli11;
/* 136 */               if (velocityTracker3 != null) {
/* 138 */                   velocityTracker3.recycle();
/* 141 */                   this.I00lli11 = null;
                        }
/* 164 */               if (this.I00iio.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
/* 166 */                   postInvalidateOnAnimation();
                        }
/* 169 */               I001iOo1i0O(0);
                    } else if (i == 2) {
/* 38 */                int i2 = this.I00oII;
/* 40 */                if (i2 != -1) {
/* 44 */                    int iFindPointerIndex = motionEvent.findPointerIndex(i2);
/* 48 */                    if (iFindPointerIndex == -1) {
/* 71 */                        Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                            } else {
/* 80 */                        int y2 = (int) motionEvent.getY(iFindPointerIndex);
/* 91 */                        if (Math.abs(y2 - this.I00ioIO) > this.I00o0l1o1o0 && (2 & getNestedScrollAxes()) == 0) {
/* 100 */                           this.I00ll1 = true;
/* 102 */                           this.I00ioIO = y2;
/* 104 */                           VelocityTracker velocityTrackerObtain = this.I00lli11;
/* 106 */                           if (velocityTrackerObtain == null) {
/* 108 */                               velocityTrackerObtain = VelocityTracker.obtain();
/* 112 */                               this.I00lli11 = velocityTrackerObtain;
                                    }
/* 114 */                           velocityTrackerObtain.addMovement(motionEvent);
/* 117 */                           this.I00oOio10iI1 = 0;
/* 119 */                           ViewParent parent = getParent();
/* 123 */                           if (parent != null) {
/* 125 */                               parent.requestDisallowInterceptTouchEvent(true);
                                    }
                                }
                            }
                        }
                    } else if (i != 3) {
/* 29 */                if (i == 6) {
/* 33 */                    I00100l0(motionEvent);
                        }
                    }
/* 301 */           return this.I00ll1;
                }

                @Override
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
                    int measuredHeight;
/* 1 */             super.onLayout(z, i, i2, i3, i4);
/* 4 */             int i5 = 0;
/* 5 */             this.I00l0I0l0lO1 = false;
/* 7 */             View view = this.I00li1OI;
/* 9 */             if (view != null && I000lI(view, this)) {
/* 17 */                View view2 = this.I00li1OI;
/* 19 */                Rect rect = this.I00iiO;
/* 21 */                view2.getDrawingRect(rect);
/* 24 */                offsetDescendantRectToMyCoords(view2, rect);
/* 27 */                int iI0000Il00O = I0000Il00O(rect);
/* 31 */                if (iI0000Il00O != 0) {
/* 33 */                    scrollBy(0, iI0000Il00O);
                        }
                    }
/* 37 */            this.I00li1OI = null;
/* 41 */            if (!this.I00l0OO0IO) {
/* 45 */                if (this.I00olI != null) {
/* 55 */                    scrollTo(getScrollX(), this.I00olI.I00iOIl);
/* 58 */                    this.I00olI = null;
                        }
/* 64 */                if (getChildCount() > 0) {
/* 66 */                    View childAt = getChildAt(0);
/* 74 */                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
/* 85 */                    measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                        } else {
/* 87 */                    measuredHeight = 0;
                        }
/* 98 */                int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
/* 99 */                int scrollY = getScrollY();
/* 103 */               if (paddingTop < measuredHeight && scrollY >= 0) {
/* 115 */                   i5 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
                        }
/* 116 */               if (i5 != scrollY) {
/* 122 */                   scrollTo(getScrollX(), i5);
                        }
                    }
/* 133 */           scrollTo(getScrollX(), getScrollY());
/* 137 */           this.I00l0OO0IO = true;
                }

                @Override
                public final void onMeasure(int i, int i2) {
/* 1 */             super.onMeasure(i, i2);
/* 6 */             if (this.I00lll10 && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
/* 23 */                View childAt = getChildAt(0);
/* 31 */                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
/* 33 */                int measuredHeight = childAt.getMeasuredHeight();
/* 56 */                int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
/* 57 */                if (measuredHeight < measuredHeight2) {
/* 86 */                    childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
                        }
                    }
                }

                @Override
                public final boolean onNestedFling(View view, float f, float f2, boolean z) {
/* 1 */             if (z) {
/* 13 */                return false;
                    }
/* 5 */             dispatchNestedFling(0.0f, f2, true);
/* 9 */             I000iOII((int) f2);
/* 4 */             return true;
                }

                @Override
                public final boolean onNestedPreFling(View view, float f, float f2) {
/* 1 */             return dispatchNestedPreFling(f, f2);
                }

                @Override
                public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
/* 7 */             I000OOo1O(i, i2, 0, iArr, null);
                }

                @Override
                public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
/* 3 */             I000oI1ioi(i4, 0, null);
                }

                @Override
                public final void onNestedScrollAccepted(View view, View view2, int i) {
/* 2 */             I0000oI00(view, view2, i, 0);
                }

                @Override
                public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
/* 1 */             super.scrollTo(i, i2);
                }

                @Override
                public final boolean onRequestFocusInDescendants(int i, Rect rect) {
/* 2 */             if (i == 2) {
/* 4 */                 i = 130;
                    } else if (i == 1) {
/* 10 */                i = 33;
                    }
/* 28 */            View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
/* 33 */            if (viewFindNextFocus != null && I000o00OoI0I(viewFindNextFocus, 0, getHeight())) {
/* 47 */                return viewFindNextFocus.requestFocus(i, rect);
                    }
/* 32 */            return false;
                }

                @Override
                public final void onRestoreInstanceState(Parcelable parcelable) {
/* 3 */             if (!(parcelable instanceof OIIIlI1)) {
/* 5 */                 super.onRestoreInstanceState(parcelable);
/* 8 */                 return;
                    }
/* 9 */             OIIIlI1 oIIIlI1 = (OIIIlI1) parcelable;
/* 15 */            super.onRestoreInstanceState(oIIIlI1.getSuperState());
/* 18 */            this.I00olI = oIIIlI1;
/* 20 */            requestLayout();
                }

                @Override
                public final Parcelable onSaveInstanceState() {
/* 7 */             OIIIlI1 oIIIlI1 = new OIIIlI1(super.onSaveInstanceState());
/* 14 */            oIIIlI1.I00iOIl = getScrollY();
/* 20 */            return oIIIlI1;
                }

                @Override
                public final void onScrollChanged(int i, int i2, int i3, int i4) {
/* 1 */             super.onScrollChanged(i, i2, i3, i4);
                }

                @Override
                public final void onSizeChanged(int i, int i2, int i3, int i4) {
/* 1 */             super.onSizeChanged(i, i2, i3, i4);
/* 4 */             View viewFindFocus = findFocus();
/* 8 */             if (viewFindFocus == null || this == viewFindFocus || !I000o00OoI0I(viewFindFocus, 0, i4)) {
/* 204 */               return;
                    }
/* 20 */            Rect rect = this.I00iiO;
/* 22 */            viewFindFocus.getDrawingRect(rect);
/* 25 */            offsetDescendantRectToMyCoords(viewFindFocus, rect);
/* 28 */            int iI0000Il00O = I0000Il00O(rect);
/* 32 */            if (iI0000Il00O != 0) {
/* 36 */                if (this.I00o0iI0io1) {
/* 38 */                    I001IO000(0, iI0000Il00O, false);
                        } else {
/* 42 */                    scrollBy(0, iI0000Il00O);
                        }
                    }
                }

                @Override
                public final boolean onStartNestedScroll(View view, View view2, int i) {
/* 2 */             return I0000O(view, view2, i, 0);
                }

                @Override
                public final void onStopNestedScroll(View view) {
/* 2 */             I0001Ioi1lo(view, 0);
                }

                /* JADX WARN: Removed duplicated region for block: B:49:0x011d  */
                /* JADX WARN: Removed duplicated region for block: B:52:0x0125  */
                /* JADX WARN: Removed duplicated region for block: B:63:0x0141  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean onTouchEvent(MotionEvent motionEvent) {
                    ViewParent parent;
                    float fI0000Il00O;
                    int iRound;
/* 7 */             if (this.I00lli11 == null) {
/* 13 */                this.I00lli11 = VelocityTracker.obtain();
                    }
/* 15 */            int actionMasked = motionEvent.getActionMasked();
/* 20 */            if (actionMasked == 0) {
/* 22 */                this.I00oOio10iI1 = 0;
                    }
/* 24 */            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
/* 31 */            float f = 0.0f;
/* 32 */            motionEventObtain.offsetLocation(0.0f, this.I00oOio10iI1);
/* 37 */            if (actionMasked != 0) {
/* 41 */                EdgeEffect edgeEffect = this.I00ilI0I1;
/* 43 */                EdgeEffect edgeEffect2 = this.I00ilO0;
/* 45 */                if (actionMasked == 1) {
/* 345 */                   VelocityTracker velocityTracker = this.I00lli11;
/* 352 */                   velocityTracker.computeCurrentVelocity(1000, this.I00oI0i);
/* 361 */                   int yVelocity = (int) velocityTracker.getYVelocity(this.I00oII);
/* 368 */                   if (Math.abs(yVelocity) >= this.I00o101lO) {
/* 376 */                       if (IioO0o.I00000oOI(edgeEffect) != 0.0f) {
/* 382 */                           if (I001IIilI0O(edgeEffect, yVelocity)) {
/* 384 */                               edgeEffect.onAbsorb(yVelocity);
                                    } else {
/* 389 */                               I000iOII(-yVelocity);
                                    }
                                } else if (IioO0o.I00000oOI(edgeEffect2) != 0.0f) {
/* 401 */                           int i = -yVelocity;
/* 406 */                           if (I001IIilI0O(edgeEffect2, i)) {
/* 408 */                               edgeEffect2.onAbsorb(i);
                                    } else {
/* 412 */                               I000iOII(i);
                                    }
                                } else {
/* 416 */                           int i2 = -yVelocity;
                                    float f2 = i2;
/* 422 */                           if (!dispatchNestedPreFling(0.0f, f2)) {
/* 424 */                               dispatchNestedFling(0.0f, f2, true);
/* 427 */                               I000iOII(i2);
                                    }
                                }
                            } else if (this.I00iio.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
/* 456 */                       postInvalidateOnAnimation();
                            }
/* 459 */                   this.I00oII = -1;
/* 461 */                   this.I00ll1 = false;
/* 463 */                   VelocityTracker velocityTracker2 = this.I00lli11;
/* 465 */                   if (velocityTracker2 != null) {
/* 467 */                       velocityTracker2.recycle();
/* 470 */                       this.I00lli11 = null;
                            }
/* 472 */                   I001iOo1i0O(0);
/* 475 */                   edgeEffect.onRelease();
/* 478 */                   edgeEffect2.onRelease();
                        } else if (actionMasked == 2) {
/* 161 */                   int iFindPointerIndex = motionEvent.findPointerIndex(this.I00oII);
/* 165 */                   if (iFindPointerIndex == -1) {
/* 190 */                       Log.e("NestedScrollView", "Invalid pointerId=" + this.I00oII + " in onTouchEvent");
                            } else {
/* 199 */                       int y = (int) motionEvent.getY(iFindPointerIndex);
/* 202 */                       int i3 = this.I00ioIO - y;
/* 212 */                       float x = motionEvent.getX(iFindPointerIndex) / getWidth();
/* 219 */                       float height = i3 / getHeight();
/* 226 */                       if (IioO0o.I00000oOI(edgeEffect) != 0.0f) {
/* 233 */                           fI0000Il00O = -IioO0o.I0000Il00O(edgeEffect, -height, x);
/* 240 */                           if (IioO0o.I00000oOI(edgeEffect) == 0.0f) {
/* 242 */                               edgeEffect.onRelease();
                                    }
                                } else {
/* 253 */                           if (IioO0o.I00000oOI(edgeEffect2) != 0.0f) {
/* 258 */                               fI0000Il00O = IioO0o.I0000Il00O(edgeEffect2, height, 1.0f - x);
/* 268 */                               if (IioO0o.I00000oOI(edgeEffect2) == 0.0f) {
/* 270 */                                   edgeEffect2.onRelease();
                                        }
                                    }
/* 280 */                           iRound = Math.round(f * getHeight());
/* 284 */                           if (iRound != 0) {
/* 286 */                               invalidate();
                                    }
/* 289 */                           int i4 = i3 - iRound;
/* 292 */                           if (!this.I00ll1) {
/* 294 */                               int iAbs = Math.abs(i4);
/* 298 */                               int i5 = this.I00o0l1o1o0;
/* 300 */                               if (iAbs > i5) {
/* 302 */                                   ViewParent parent2 = getParent();
/* 306 */                                   if (parent2 != null) {
/* 308 */                                       parent2.requestDisallowInterceptTouchEvent(true);
                                            }
/* 311 */                                   this.I00ll1 = true;
/* 317 */                                   i4 = i4 > 0 ? i4 - i5 : i4 + i5;
                                        }
                                    }
/* 320 */                           if (this.I00ll1) {
/* 331 */                               int iI00111O = I00111O(i4, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
/* 336 */                               this.I00ioIO = y - iI00111O;
                                        this.I00oOio10iI1 += iI00111O;
                                    }
                                }
/* 245 */                       f = fI0000Il00O;
/* 280 */                       iRound = Math.round(f * getHeight());
/* 284 */                       if (iRound != 0) {
                                }
/* 289 */                       int i42 = i3 - iRound;
/* 292 */                       if (!this.I00ll1) {
                                }
/* 320 */                       if (this.I00ll1) {
                                }
                            }
                        } else if (actionMasked == 3) {
/* 99 */                    if (this.I00ll1 && getChildCount() > 0) {
/* 130 */                       if (this.I00iio.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
/* 132 */                           postInvalidateOnAnimation();
                                }
                            }
/* 135 */                   this.I00oII = -1;
/* 137 */                   this.I00ll1 = false;
/* 139 */                   VelocityTracker velocityTracker3 = this.I00lli11;
/* 141 */                   if (velocityTracker3 != null) {
/* 143 */                       velocityTracker3.recycle();
/* 146 */                       this.I00lli11 = null;
                            }
/* 148 */                   I001iOo1i0O(0);
/* 151 */                   edgeEffect.onRelease();
/* 154 */                   edgeEffect2.onRelease();
                        } else if (actionMasked == 5) {
/* 78 */                    int actionIndex = motionEvent.getActionIndex();
/* 87 */                    this.I00ioIO = (int) motionEvent.getY(actionIndex);
/* 93 */                    this.I00oII = motionEvent.getPointerId(actionIndex);
                        } else if (actionMasked == 6) {
/* 60 */                    I00100l0(motionEvent);
/* 74 */                    this.I00ioIO = (int) motionEvent.getY(motionEvent.findPointerIndex(this.I00oII));
                        }
                    } else {
/* 486 */               if (getChildCount() == 0) {
/* 19 */                    return false;
                        }
/* 491 */               if (this.I00ll1 && (parent = getParent()) != null) {
/* 499 */                   parent.requestDisallowInterceptTouchEvent(true);
                        }
/* 502 */               OverScroller overScroller = this.I00iio;
/* 508 */               if (!overScroller.isFinished()) {
/* 510 */                   overScroller.abortAnimation();
/* 513 */                   I001iOo1i0O(1);
                        }
/* 520 */               int y2 = (int) motionEvent.getY();
/* 521 */               int pointerId = motionEvent.getPointerId(0);
/* 525 */               this.I00ioIO = y2;
/* 527 */               this.I00oII = pointerId;
/* 529 */               I001i1O0Ol(2, 0);
                    }
/* 532 */           VelocityTracker velocityTracker4 = this.I00lli11;
/* 534 */           if (velocityTracker4 != null) {
/* 536 */               velocityTracker4.addMovement(motionEventObtain);
                    }
/* 539 */           motionEventObtain.recycle();
/* 36 */            return true;
                }

                @Override
                public final void requestChildFocus(View view, View view2) {
/* 3 */             if (this.I00l0I0l0lO1) {
/* 24 */                this.I00li1OI = view2;
                    } else {
/* 5 */                 Rect rect = this.I00iiO;
/* 7 */                 view2.getDrawingRect(rect);
/* 10 */                offsetDescendantRectToMyCoords(view2, rect);
/* 13 */                int iI0000Il00O = I0000Il00O(rect);
/* 17 */                if (iI0000Il00O != 0) {
/* 20 */                    scrollBy(0, iI0000Il00O);
                        }
                    }
/* 26 */            super.requestChildFocus(view, view2);
                }

                @Override
                public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
/* 19 */            rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
/* 22 */            int iI0000Il00O = I0000Il00O(rect);
/* 31 */            boolean z2 = iI0000Il00O != 0;
/* 32 */            if (z2) {
/* 34 */                if (z) {
/* 36 */                    scrollBy(0, iI0000Il00O);
/* 39 */                    return z2;
                        }
/* 40 */                I001IO000(0, iI0000Il00O, false);
                    }
/* 98 */            return z2;
                }

                @Override
                public final void requestDisallowInterceptTouchEvent(boolean z) {
                    VelocityTracker velocityTracker;
/* 1 */             if (z && (velocityTracker = this.I00lli11) != null) {
/* 7 */                 velocityTracker.recycle();
/* 11 */                this.I00lli11 = null;
                    }
/* 13 */            super.requestDisallowInterceptTouchEvent(z);
                }

                @Override
                public final void requestLayout() {
/* 2 */             this.I00l0I0l0lO1 = true;
/* 4 */             super.requestLayout();
                }

                @Override
                public final void scrollTo(int i, int i2) {
/* 5 */             if (getChildCount() > 0) {
/* 8 */                 View childAt = getChildAt(0);
/* 16 */                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
/* 31 */                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
/* 41 */                int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
/* 55 */                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
/* 65 */                int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
/* 66 */                if (width >= width2 || i < 0) {
/* 78 */                    i = 0;
                        } else if (width + i > width2) {
/* 75 */                    i = width2 - width;
                        }
/* 79 */                if (height >= height2 || i2 < 0) {
/* 91 */                    i2 = 0;
                        } else if (height + i2 > height2) {
/* 88 */                    i2 = height2 - height;
                        }
/* 96 */                if (i == getScrollX() && i2 == getScrollY()) {
/* 332 */                   return;
                        }
/* 104 */               super.scrollTo(i, i2);
                    }
                }

                public void setFillViewport(boolean z) {
/* 3 */             if (z != this.I00lll10) {
/* 5 */                 this.I00lll10 = z;
/* 7 */                 requestLayout();
                    }
                }

                @Override
                public void setNestedScrollingEnabled(boolean z) {
/* 1 */             IOI0oloi01 iOI0oloi01 = this.I00oliIiO01i;
/* 5 */             if (iOI0oloi01.I00000oIO) {
/* 9 */                 NestedScrollView nestedScrollView = (NestedScrollView) iOI0oloi01.I0000O;
/* 11 */                WeakHashMap weakHashMap = OooiOl0ioo0i.I00000oIO;
/* 13 */                nestedScrollView.stopNestedScroll();
                    }
/* 16 */            iOI0oloi01.I00000oIO = z;
                }

                public void setSmoothScrollingEnabled(boolean z) {
/* 1 */             this.I00o0iI0io1 = z;
                }

                @Override
                public final boolean shouldDelayChildPressedState() {
/* 1 */             return true;
                }

                @Override
                public final boolean startNestedScroll(int i) {
/* 2 */             return I001i1O0Ol(i, 0);
                }

                @Override
                public final void stopNestedScroll() {
/* 2 */             I001iOo1i0O(0);
                }

                @Override
/* 16 */        public final void addView(View view, int i) {
/* 17 */            if (getChildCount() <= 0) {
/* 18 */                super.addView(view, i);
                    } else {
/* 19 */                I000II.I001IO000("ScrollView can host only one direct child");
                    }
                }

                @Override
/* 19 */        public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
/* 20 */            if (getChildCount() <= 0) {
/* 21 */                super.addView(view, layoutParams);
                    } else {
/* 22 */                I000II.I001IO000("ScrollView can host only one direct child");
                    }
                }

                @Override
/* 22 */        public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
/* 23 */            if (getChildCount() <= 0) {
/* 24 */                super.addView(view, i, layoutParams);
                    } else {
/* 25 */                I000II.I001IO000("ScrollView can host only one direct child");
                    }
                }

/* 28 */        public void setOnScrollChangeListener(OIIIilli0l oIIIilli0l) {
                }

/* 228 */       public NestedScrollView(Context context) {
/* 229 */           this(context, null);
                }
            }

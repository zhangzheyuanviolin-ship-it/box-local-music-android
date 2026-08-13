            package androidx.appcompat.widget;

            import android.content.Context;
            import android.content.res.Configuration;
            import android.content.res.TypedArray;
            import android.graphics.Canvas;
            import android.graphics.Rect;
            import android.graphics.drawable.Drawable;
            import android.os.Build;
            import android.util.AttributeSet;
            import android.util.Log;
            import android.view.KeyEvent;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.ViewPropertyAnimator;
            import android.view.Window;
            import android.view.WindowInsets;
            import android.widget.OverScroller;
            import androidx.core.widget.NestedScrollView;
            import com.box.gallery.R;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.WeakHashMap;
            import p000.I000II;
            import p000.I0I0oIi0oll;
            import p000.I0I0oll;
            import p000.I0I100oOIO0l;
            import p000.I0I10OI1iI;
            import p000.I0I10lio10;
            import p000.I0I1ii0i;
            import p000.IIOiiIi;
            import p000.Ii1iOIIi;
            import p000.Ioo0l0I;
            import p000.O1illlIiilIl;
            import p000.O1l0OiO10IoI;
            import p000.OIIIll0io;
            import p000.OIIIo0i01lli;
            import p000.Oo1OoiI;
            import p000.Oo1ilOl;
            import p000.OooiIOIoi;
            import p000.OooiOi0I0l;
            import p000.OooiOl0ioo0i;
            import p000.OoolOolooll;
            import p000.i00IOoliil0i;
            import p000.i00OIl1Io1;
            import p000.i00OIoI;
            import p000.i00OOO1lo;
            import p000.i00OOOOi;
            import p000.i00i1I1;
            import p000.i00iooo00li;
            import p000.iOO0oOI1Ol;
            
/* 9 */     public class ActionBarOverlayLayout extends ViewGroup implements OIIIll0io, OIIIo0i01lli {
                public static final int[] I00ooiO1I = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
                public static final i00iooo00li I00oooO;
                public static final Rect I0100i;
                public int I00iOIl;
                public int I00iiI;
                public ContentFrameLayout I00iiO;
                public ActionBarContainer I00iio;
                public Ii1iOIIi I00ilI0I1;
                public Drawable I00ilO0;
                public boolean I00io1l;
                public boolean I00ioIO;
                public boolean I00l0I0l0lO1;
                public boolean I00l0OO0IO;
                public int I00li1OI;
                public int I00ll1;
                public final Rect I00lli11;
                public final Rect I00lll10;
                public final Rect I00o0iI0io1;
                public final Rect I00o0l1o1o0;
                public i00iooo00li I00o101lO;
                public i00iooo00li I00oI0i;
                public i00iooo00li I00oII;
                public i00iooo00li I00oIiI10;
                public I0I100oOIO0l I00oO101o;
                public OverScroller I00oOio10iI1;
                public ViewPropertyAnimator I00ol1;
                public final I0I0oIi0oll I00olI;
                public final I0I0oll I00oli;
                public final I0I0oll I00oliIiO01i;
                public final IIOiiIi I00oo1iO0ll;
                public final I0I10lio10 I00ooIo0;

                static {
/* 13 */            int i = Build.VERSION.SDK_INT;
/* 37 */            i00OOOOi i00ooo1lo = i >= 36 ? new i00OOO1lo() : i >= 35 ? new i00OIoI() : new i00OIl1Io1();
/* 46 */            i00ooo1lo.I0000oI00(Ioo0l0I.I00000oIO(0, 1, 0, 1));
/* 53 */            I00oooO = i00ooo1lo.I00000oOI();
/* 60 */            I0100i = new Rect();
                }

                public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
/* 5 */             this.I00iiI = 0;
/* 12 */            this.I00lli11 = new Rect();
/* 19 */            this.I00lll10 = new Rect();
/* 26 */            this.I00o0iI0io1 = new Rect();
/* 33 */            this.I00o0l1o1o0 = new Rect();
/* 37 */            new Rect();
/* 42 */            new Rect();
/* 47 */            new Rect();
/* 52 */            new Rect();
/* 55 */            i00iooo00li i00iooo00liVar = i00iooo00li.I00000oOI;
/* 57 */            this.I00o101lO = i00iooo00liVar;
/* 59 */            this.I00oI0i = i00iooo00liVar;
/* 61 */            this.I00oII = i00iooo00liVar;
/* 63 */            this.I00oIiI10 = i00iooo00liVar;
/* 70 */            this.I00olI = new I0I0oIi0oll(this, 0);
/* 74 */            I0I0oll i0I0oll = new I0I0oll(0);
/* 77 */            i0I0oll.I00iiI = this;
/* 79 */            VarHandle.storeStoreFence();
/* 82 */            this.I00oli = i0I0oll;
/* 87 */            I0I0oll i0I0oll2 = new I0I0oll(1);
/* 90 */            i0I0oll2.I00iiI = this;
/* 92 */            VarHandle.storeStoreFence();
/* 95 */            this.I00oliIiO01i = i0I0oll2;
/* 97 */            I000OOo1O(context);
/* 106 */           this.I00oo1iO0ll = new IIOiiIi(2);
/* 110 */           I0I10lio10 i0I10lio10 = new I0I10lio10(context);
/* 113 */           i0I10lio10.setWillNotDraw(true);
/* 116 */           this.I00ooIo0 = i0I10lio10;
/* 118 */           addView(i0I10lio10);
                }

                public static boolean I00000oOI(View view, Rect rect, boolean z) {
                    boolean z2;
/* 5 */             I0I10OI1iI i0I10OI1iI = (I0I10OI1iI) view.getLayoutParams();
/* 7 */             int i = ((ViewGroup.MarginLayoutParams) i0I10OI1iI).leftMargin;
/* 9 */             int i2 = rect.left;
/* 12 */            if (i != i2) {
/* 14 */                ((ViewGroup.MarginLayoutParams) i0I10OI1iI).leftMargin = i2;
/* 16 */                z2 = true;
                    } else {
/* 18 */                z2 = false;
                    }
/* 19 */            int i3 = ((ViewGroup.MarginLayoutParams) i0I10OI1iI).topMargin;
/* 21 */            int i4 = rect.top;
/* 23 */            if (i3 != i4) {
/* 25 */                ((ViewGroup.MarginLayoutParams) i0I10OI1iI).topMargin = i4;
/* 27 */                z2 = true;
                    }
/* 28 */            int i5 = ((ViewGroup.MarginLayoutParams) i0I10OI1iI).rightMargin;
/* 30 */            int i6 = rect.right;
/* 32 */            if (i5 != i6) {
/* 34 */                ((ViewGroup.MarginLayoutParams) i0I10OI1iI).rightMargin = i6;
/* 36 */                z2 = true;
                    }
/* 37 */            if (z) {
/* 39 */                int i7 = ((ViewGroup.MarginLayoutParams) i0I10OI1iI).bottomMargin;
/* 41 */                int i8 = rect.bottom;
/* 43 */                if (i7 != i8) {
/* 45 */                    ((ViewGroup.MarginLayoutParams) i0I10OI1iI).bottomMargin = i8;
/* 11 */                    return true;
                        }
                    }
/* 98 */            return z2;
                }

                @Override
                public final void I00000oIO(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4, int i5) {
/* 1 */             if (i5 == 0) {
/* 3 */                 onNestedScroll(nestedScrollView, i, i2, i3, i4);
                    }
                }

                public final void I0000Il00O() {
/* 3 */             removeCallbacks(this.I00oli);
/* 8 */             removeCallbacks(this.I00oliIiO01i);
/* 11 */            ViewPropertyAnimator viewPropertyAnimator = this.I00ol1;
/* 13 */            if (viewPropertyAnimator != null) {
/* 15 */                viewPropertyAnimator.cancel();
                    }
                }

                @Override
                public final boolean I0000O(View view, View view2, int i, int i2) {
                    return i2 == 0 && onStartNestedScroll(view, view2, i);
                }

                @Override
                public final void I0000oI00(View view, View view2, int i, int i2) {
/* 1 */             if (i2 == 0) {
/* 3 */                 onNestedScrollAccepted(view, view2, i);
                    }
                }

                @Override
                public final void I0001Ioi1lo(View view, int i) {
/* 1 */             if (i == 0) {
/* 3 */                 onStopNestedScroll(view);
                    }
                }

                @Override
                public final void I000II(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4, int i5, int[] iArr) {
/* 1 */             I00000oIO(nestedScrollView, i, i2, i3, i4, i5);
                }

                public final void I000OOo1O(Context context) {
/* 11 */            TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(I00ooiO1I);
/* 20 */            this.I00iOIl = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
/* 23 */            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
/* 27 */            this.I00ilO0 = drawable;
/* 32 */            setWillNotDraw(drawable == null);
/* 35 */            typedArrayObtainStyledAttributes.recycle();
/* 43 */            this.I00oOio10iI1 = new OverScroller(context);
                }

                public final void I000OiO(int i) {
/* 1 */             I000iOII();
/* 9 */             if (i == 2) {
/* 39 */                ((Oo1ilOl) this.I00ilI0I1).getClass();
/* 42 */                Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
                    } else if (i == 5) {
/* 28 */                ((Oo1ilOl) this.I00ilI0I1).getClass();
/* 31 */                Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
                    } else {
/* 16 */                if (i != 109) {
/* 18 */                    return;
                        }
/* 20 */                setOverlayMode(true);
                    }
                }

                public final void I000iOII() {
                    Ii1iOIIi wrapper;
/* 3 */             if (this.I00iiO == null) {
/* 14 */                this.I00iiO = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
/* 25 */                this.I00iio = (ActionBarContainer) findViewById(R.id.action_bar_container);
/* 30 */                KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
/* 36 */                if (callbackFindViewById instanceof Ii1iOIIi) {
/* 38 */                    wrapper = (Ii1iOIIi) callbackFindViewById;
                        } else {
/* 43 */                    if (!(callbackFindViewById instanceof Toolbar)) {
/* 68 */                        I000II.I001IO000("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
/* 110 */                       return;
                            }
/* 47 */                    wrapper = ((Toolbar) callbackFindViewById).getWrapper();
                        }
/* 51 */                this.I00ilI0I1 = wrapper;
                    }
                }

                public final void I000l1(O1illlIiilIl o1illlIiilIl, O1l0OiO10IoI o1l0OiO10IoI) {
/* 1 */             I000iOII();
/* 6 */             Oo1ilOl oo1ilOl = (Oo1ilOl) this.I00ilI0I1;
/* 8 */             Toolbar toolbar = oo1ilOl.I00000oIO;
/* 10 */            I0I1ii0i i0I1ii0i = oo1ilOl.I000lI;
/* 12 */            if (i0I1ii0i == null) {
/* 20 */                i0I1ii0i = new I0I1ii0i(toolbar.getContext());
/* 23 */                oo1ilOl.I000lI = i0I1ii0i;
                    }
/* 25 */            i0I1ii0i.I00ilI0I1 = o1l0OiO10IoI;
/* 27 */            if (o1illlIiilIl == null && toolbar.I00iOIl == null) {
/* 43 */                return;
                    }
/* 34 */            toolbar.I0001Ioi1lo();
/* 39 */            O1illlIiilIl o1illlIiilIl2 = toolbar.I00iOIl.I00o0l1o1o0;
/* 41 */            if (o1illlIiilIl2 == o1illlIiilIl) {
/* 43 */                return;
                    }
/* 44 */            if (o1illlIiilIl2 != null) {
/* 48 */                o1illlIiilIl2.I0010I0i(toolbar.I010i10l);
/* 53 */                o1illlIiilIl2.I0010I0i(toolbar.I010iIIOlo);
                    }
/* 58 */            if (toolbar.I010iIIOlo == null) {
/* 65 */                toolbar.I010iIIOlo = new Oo1OoiI(toolbar);
                    }
/* 68 */            i0I1ii0i.I00o101lO = true;
/* 70 */            Context context = toolbar.I00l0OO0IO;
/* 72 */            if (o1illlIiilIl != null) {
/* 74 */                o1illlIiilIl.I00000oOI(i0I1ii0i, context);
/* 81 */                o1illlIiilIl.I00000oOI(toolbar.I010iIIOlo, toolbar.I00l0OO0IO);
                    } else {
/* 86 */                i0I1ii0i.I000iOII(context, null);
/* 93 */                toolbar.I010iIIOlo.I000iOII(toolbar.I00l0OO0IO, null);
/* 96 */                i0I1ii0i.I000OOo1O();
/* 101 */               toolbar.I010iIIOlo.I000OOo1O();
                    }
/* 108 */           toolbar.I00iOIl.setPopupTheme(toolbar.I00li1OI);
/* 113 */           toolbar.I00iOIl.setPresenter(i0I1ii0i);
/* 116 */           toolbar.I010i10l = i0I1ii0i;
/* 118 */           toolbar.I00111O();
                }

                @Override
                public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
/* 1 */             return layoutParams instanceof I0I10OI1iI;
                }

                @Override
                public final void draw(Canvas canvas) {
                    int translationY;
/* 1 */             super.draw(canvas);
/* 6 */             if (this.I00ilO0 != null) {
/* 15 */                if (this.I00iio.getVisibility() == 0) {
/* 34 */                    translationY = (int) (this.I00iio.getTranslationY() + this.I00iio.getBottom() + 0.5f);
                        } else {
/* 36 */                    translationY = 0;
                        }
/* 50 */                this.I00ilO0.setBounds(0, translationY, getWidth(), this.I00ilO0.getIntrinsicHeight() + translationY);
/* 55 */                this.I00ilO0.draw(canvas);
                    }
                }

                @Override
                public final boolean fitSystemWindows(Rect rect) {
/* 1 */             return super.fitSystemWindows(rect);
                }

                @Override
                public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
/* 4 */             return new I0I10OI1iI(-1, -1);
                }

                @Override
                public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
/* 7 */             return new I0I10OI1iI(getContext(), attributeSet);
                }

                public int getActionBarHideOffset() {
/* 1 */             ActionBarContainer actionBarContainer = this.I00iio;
/* 3 */             if (actionBarContainer != null) {
/* 10 */                return -((int) actionBarContainer.getTranslationY());
                    }
/* 12 */            return 0;
                }

                @Override
                public int getNestedScrollAxes() {
/* 1 */             IIOiiIi iIOiiIi = this.I00oo1iO0ll;
/* 7 */             return iIOiiIi.I0000Il00O | iIOiiIi.I00000oOI;
                }

                public CharSequence getTitle() {
/* 1 */             I000iOII();
/* 10 */            return ((Oo1ilOl) this.I00ilI0I1).I00000oIO.getTitle();
                }

                @Override
                public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
/* 1 */             I000iOII();
/* 4 */             i00iooo00li i00iooo00liVarI0000Il00O = i00iooo00li.I0000Il00O(this, windowInsets);
/* 10 */            i00i1I1 i00i1i1 = i00iooo00liVarI0000Il00O.I00000oIO;
/* 42 */            boolean zI00000oOI = I00000oOI(this.I00iio, new Rect(i00i1i1.I000o00OoI0I().I00000oIO, i00i1i1.I000o00OoI0I().I00000oOI, i00i1i1.I000o00OoI0I().I0000Il00O, i00i1i1.I000o00OoI0I().I0000O), false);
/* 46 */            WeakHashMap weakHashMap = OooiOl0ioo0i.I00000oIO;
/* 48 */            Rect rect = this.I00lli11;
/* 50 */            OooiIOIoi.I00000oIO(this, i00iooo00liVarI0000Il00O, rect);
/* 61 */            i00iooo00li i00iooo00liVarI0010I0i = i00i1i1.I0010I0i(rect.left, rect.top, rect.right, rect.bottom);
/* 65 */            this.I00o101lO = i00iooo00liVarI0010I0i;
/* 73 */            boolean z = true;
/* 74 */            if (!this.I00oI0i.equals(i00iooo00liVarI0010I0i)) {
/* 78 */                this.I00oI0i = this.I00o101lO;
/* 80 */                zI00000oOI = true;
                    }
/* 81 */            Rect rect2 = this.I00lll10;
/* 87 */            if (rect2.equals(rect)) {
/* 93 */                z = zI00000oOI;
                    } else {
/* 89 */                rect2.set(rect);
                    }
/* 94 */            if (z) {
/* 96 */                requestLayout();
                    }
/* 115 */           return i00i1i1.I00000oIO().I00000oIO.I0000Il00O().I00000oIO.I00000oOI().I00000oOI();
                }

                @Override
                public final void onConfigurationChanged(Configuration configuration) {
/* 1 */             super.onConfigurationChanged(configuration);
/* 8 */             I000OOo1O(getContext());
/* 11 */            WeakHashMap weakHashMap = OooiOl0ioo0i.I00000oIO;
/* 13 */            requestApplyInsets();
                }

                @Override
                public final void onDetachedFromWindow() {
/* 1 */             super.onDetachedFromWindow();
/* 4 */             I0000Il00O();
                }

                @Override
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
/* 1 */             int childCount = getChildCount();
/* 5 */             int paddingLeft = getPaddingLeft();
/* 9 */             int paddingTop = getPaddingTop();
/* 14 */            for (int i5 = 0; i5 < childCount; i5++) {
/* 16 */                View childAt = getChildAt(i5);
/* 26 */                if (childAt.getVisibility() != 8) {
/* 32 */                    I0I10OI1iI i0I10OI1iI = (I0I10OI1iI) childAt.getLayoutParams();
/* 34 */                    int measuredWidth = childAt.getMeasuredWidth();
/* 38 */                    int measuredHeight = childAt.getMeasuredHeight();
/* 44 */                    int i6 = ((ViewGroup.MarginLayoutParams) i0I10OI1iI).leftMargin + paddingLeft;
/* 47 */                    int i7 = ((ViewGroup.MarginLayoutParams) i0I10OI1iI).topMargin + paddingTop;
/* 50 */                    childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void onMeasure(int i, int i2) {
                    int measuredHeight;
/* 1 */             I000iOII();
/* 11 */            measureChildWithMargins(this.I00iio, i, 0, i2, 0);
/* 20 */            I0I10OI1iI i0I10OI1iI = (I0I10OI1iI) this.I00iio.getLayoutParams();
/* 35 */            int iMax = Math.max(0, this.I00iio.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) i0I10OI1iI).leftMargin + ((ViewGroup.MarginLayoutParams) i0I10OI1iI).rightMargin);
/* 51 */            int iMax2 = Math.max(0, this.I00iio.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) i0I10OI1iI).topMargin + ((ViewGroup.MarginLayoutParams) i0I10OI1iI).bottomMargin);
/* 61 */            int iCombineMeasuredStates = View.combineMeasuredStates(0, this.I00iio.getMeasuredState());
/* 65 */            WeakHashMap weakHashMap = OooiOl0ioo0i.I00000oIO;
/* 78 */            boolean z = (getWindowSystemUiVisibility() & Barcode.FORMAT_QR_CODE) != 0;
/* 79 */            if (z) {
/* 81 */                measuredHeight = this.I00iOIl;
/* 85 */                if (this.I00ioIO && this.I00iio.getTabContainer() != null) {
/* 97 */                    measuredHeight += this.I00iOIl;
                        }
                    } else {
/* 116 */               measuredHeight = this.I00iio.getVisibility() != 8 ? this.I00iio.getMeasuredHeight() : 0;
                    }
/* 117 */           Rect rect = this.I00lli11;
/* 119 */           Rect rect2 = this.I00o0iI0io1;
/* 121 */           rect2.set(rect);
/* 126 */           this.I00oII = this.I00o101lO;
/* 130 */           if (this.I00io1l || z) {
/* 212 */               Ioo0l0I ioo0l0II00000oIO = Ioo0l0I.I00000oIO(this.I00oII.I00000oIO.I000o00OoI0I().I00000oIO, this.I00oII.I00000oIO.I000o00OoI0I().I00000oOI + measuredHeight, this.I00oII.I00000oIO.I000o00OoI0I().I0000Il00O, this.I00oII.I00000oIO.I000o00OoI0I().I0000O);
/* 216 */               i00iooo00li i00iooo00liVar = this.I00oII;
/* 218 */               int i3 = Build.VERSION.SDK_INT;
/* 242 */               i00OOOOi i00ooo1lo = i3 >= 36 ? new i00OOO1lo(i00iooo00liVar) : i3 >= 35 ? new i00OIoI(i00iooo00liVar) : new i00OIl1Io1(i00iooo00liVar);
/* 245 */               i00ooo1lo.I0000oI00(ioo0l0II00000oIO);
/* 252 */               this.I00oII = i00ooo1lo.I00000oOI();
                    } else {
/* 134 */               I0I10lio10 i0I10lio10 = this.I00ooIo0;
/* 136 */               i00iooo00li i00iooo00liVar2 = I00oooO;
/* 138 */               Rect rect3 = this.I00o0l1o1o0;
/* 140 */               OooiIOIoi.I00000oIO(i0I10lio10, i00iooo00liVar2, rect3);
/* 149 */               if (!rect3.equals(I0100i)) {
                            rect2.top += measuredHeight;
/* 158 */                   rect2.bottom = rect2.bottom;
/* 168 */                   this.I00oII = this.I00oII.I00000oIO.I0010I0i(0, measuredHeight, 0, 0);
                        }
                    }
/* 256 */           I00000oOI(this.I00iiO, rect2, true);
/* 267 */           if (!this.I00oIiI10.equals(this.I00oII)) {
/* 269 */               i00iooo00li i00iooo00liVar3 = this.I00oII;
/* 271 */               this.I00oIiI10 = i00iooo00liVar3;
/* 273 */               ContentFrameLayout contentFrameLayout = this.I00iiO;
/* 275 */               WindowInsets windowInsetsI00000oOI = i00iooo00liVar3.I00000oOI();
/* 279 */               if (windowInsetsI00000oOI != null) {
/* 281 */                   WindowInsets windowInsetsI00000oIO = OooiOi0I0l.I00000oIO(contentFrameLayout, windowInsetsI00000oOI);
/* 289 */                   if (!windowInsetsI00000oIO.equals(windowInsetsI00000oOI)) {
/* 291 */                       i00iooo00li.I0000Il00O(contentFrameLayout, windowInsetsI00000oIO);
                            }
                        }
                    }
/* 301 */           measureChildWithMargins(this.I00iiO, i, 0, i2, 0);
/* 310 */           I0I10OI1iI i0I10OI1iI2 = (I0I10OI1iI) this.I00iiO.getLayoutParams();
/* 324 */           int iMax3 = Math.max(iMax, this.I00iiO.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) i0I10OI1iI2).leftMargin + ((ViewGroup.MarginLayoutParams) i0I10OI1iI2).rightMargin);
/* 340 */           int iMax4 = Math.max(iMax2, this.I00iiO.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) i0I10OI1iI2).topMargin + ((ViewGroup.MarginLayoutParams) i0I10OI1iI2).bottomMargin);
/* 350 */           int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.I00iiO.getMeasuredState());
/* 400 */           setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
                }

                @Override
                public final boolean onNestedFling(View view, float f, float f2, boolean z) {
/* 3 */             if (!this.I00l0I0l0lO1 || !z) {
/* 59 */                return false;
                    }
/* 21 */            this.I00oOio10iI1.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
/* 36 */            if (this.I00oOio10iI1.getFinalY() > this.I00iio.getHeight()) {
/* 38 */                I0000Il00O();
/* 43 */                this.I00oliIiO01i.run();
                    } else {
/* 47 */                I0000Il00O();
/* 52 */                this.I00oli.run();
                    }
/* 56 */            this.I00l0OO0IO = true;
/* 55 */            return true;
                }

                @Override
                public final boolean onNestedPreFling(View view, float f, float f2) {
/* 1 */             return false;
                }

                @Override
                public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
/* 3 */             int i5 = this.I00li1OI + i2;
/* 4 */             this.I00li1OI = i5;
/* 6 */             setActionBarHideOffset(i5);
                }

                @Override
                public final void onNestedScrollAccepted(View view, View view2, int i) {
                    i00IOoliil0i i00iooliil0i;
                    OoolOolooll ooolOolooll;
/* 3 */             this.I00oo1iO0ll.I00000oOI = i;
/* 9 */             this.I00li1OI = getActionBarHideOffset();
/* 11 */            I0000Il00O();
/* 14 */            I0I100oOIO0l i0I100oOIO0l = this.I00oO101o;
/* 16 */            if (i0I100oOIO0l == null || (ooolOolooll = (i00iooliil0i = (i00IOoliil0i) i0I100oOIO0l).I00111O) == null) {
/* 98 */                return;
                    }
/* 24 */            ooolOolooll.I00000oIO();
/* 28 */            i00iooliil0i.I00111O = null;
                }

                @Override
                public final boolean onStartNestedScroll(View view, View view2, int i) {
/* 3 */             if ((i & 2) == 0 || this.I00iio.getVisibility() != 0) {
/* 17 */                return false;
                    }
/* 14 */            return this.I00l0I0l0lO1;
                }

                @Override
                public final void onStopNestedScroll(View view) {
/* 3 */             if (!this.I00l0I0l0lO1 || this.I00l0OO0IO) {
/* 77 */                return;
                    }
/* 19 */            if (this.I00li1OI <= this.I00iio.getHeight()) {
/* 21 */                I0000Il00O();
/* 26 */                postDelayed(this.I00oli, 600L);
                    } else {
/* 30 */                I0000Il00O();
/* 35 */                postDelayed(this.I00oliIiO01i, 600L);
                    }
                }

                @Override
                public final void onWindowSystemUiVisibilityChanged(int i) {
/* 1 */             super.onWindowSystemUiVisibilityChanged(i);
/* 4 */             I000iOII();
/* 9 */             int i2 = this.I00ll1 ^ i;
/* 10 */            this.I00ll1 = i;
/* 20 */            boolean z = (i & 4) == 0;
/* 27 */            boolean z2 = (i & Barcode.FORMAT_QR_CODE) != 0;
/* 28 */            I0I100oOIO0l i0I100oOIO0l = this.I00oO101o;
/* 30 */            if (i0I100oOIO0l != null) {
/* 34 */                i00IOoliil0i i00iooliil0i = (i00IOoliil0i) i0I100oOIO0l;
/* 36 */                i00iooliil0i.I000oI1ioi = !z2;
/* 38 */                if (z || !z2) {
/* 55 */                    if (i00iooliil0i.I00100o1O0lo) {
/* 57 */                        i00iooliil0i.I00100o1O0lo = false;
/* 59 */                        i00iooliil0i.I0000oI00(true);
                            }
                        } else if (!i00iooliil0i.I00100o1O0lo) {
/* 47 */                    i00iooliil0i.I00100o1O0lo = true;
/* 49 */                    i00iooliil0i.I0000oI00(true);
                        }
                    }
/* 64 */            if ((i2 & Barcode.FORMAT_QR_CODE) == 0 || this.I00oO101o == null) {
/* 77 */                return;
                    }
/* 70 */            WeakHashMap weakHashMap = OooiOl0ioo0i.I00000oIO;
/* 72 */            requestApplyInsets();
                }

                @Override
                public final void onWindowVisibilityChanged(int i) {
/* 1 */             super.onWindowVisibilityChanged(i);
/* 4 */             this.I00iiI = i;
/* 6 */             I0I100oOIO0l i0I100oOIO0l = this.I00oO101o;
/* 8 */             if (i0I100oOIO0l != null) {
/* 12 */                ((i00IOoliil0i) i0I100oOIO0l).I000o00OoI0I = i;
                    }
                }

                public void setActionBarHideOffset(int i) {
/* 1 */             I0000Il00O();
/* 23 */            this.I00iio.setTranslationY(-Math.max(0, Math.min(i, this.I00iio.getHeight())));
                }

                public void setActionBarVisibilityCallback(I0I100oOIO0l i0I100oOIO0l) {
/* 1 */             this.I00oO101o = i0I100oOIO0l;
/* 7 */             if (getWindowToken() != null) {
/* 15 */                ((i00IOoliil0i) this.I00oO101o).I000o00OoI0I = this.I00iiI;
/* 17 */                int i = this.I00ll1;
/* 19 */                if (i != 0) {
/* 21 */                    onWindowSystemUiVisibilityChanged(i);
/* 24 */                    WeakHashMap weakHashMap = OooiOl0ioo0i.I00000oIO;
/* 26 */                    requestApplyInsets();
                        }
                    }
                }

                public void setHasNonEmbeddedTabs(boolean z) {
/* 1 */             this.I00ioIO = z;
                }

                public void setHideOnContentScrollEnabled(boolean z) {
/* 3 */             if (z != this.I00l0I0l0lO1) {
/* 5 */                 this.I00l0I0l0lO1 = z;
/* 7 */                 if (z) {
/* 29 */                    return;
                        }
/* 9 */                 I0000Il00O();
/* 13 */                setActionBarHideOffset(0);
                    }
                }

                public void setIcon(int i) {
/* 1 */             I000iOII();
/* 6 */             Oo1ilOl oo1ilOl = (Oo1ilOl) this.I00ilI0I1;
/* 22 */            oo1ilOl.I0000O = i != 0 ? iOO0oOI1Ol.I00000oIO(oo1ilOl.I00000oIO.getContext(), i) : null;
/* 24 */            oo1ilOl.I0000O();
                }

                public void setLogo(int i) {
/* 1 */             I000iOII();
/* 6 */             Oo1ilOl oo1ilOl = (Oo1ilOl) this.I00ilI0I1;
/* 22 */            oo1ilOl.I0000oI00 = i != 0 ? iOO0oOI1Ol.I00000oIO(oo1ilOl.I00000oIO.getContext(), i) : null;
/* 24 */            oo1ilOl.I0000O();
                }

                public void setOverlayMode(boolean z) {
/* 1 */             this.I00io1l = z;
                }

                public void setWindowCallback(Window.Callback callback) {
/* 1 */             I000iOII();
/* 8 */             ((Oo1ilOl) this.I00ilI0I1).I000iOII = callback;
                }

                public void setWindowTitle(CharSequence charSequence) {
/* 1 */             I000iOII();
/* 6 */             Oo1ilOl oo1ilOl = (Oo1ilOl) this.I00ilI0I1;
/* 10 */            if (oo1ilOl.I000II) {
/* 77 */                return;
                    }
/* 12 */            Toolbar toolbar = oo1ilOl.I00000oIO;
/* 14 */            oo1ilOl.I000O01llI0 = charSequence;
/* 20 */            if ((oo1ilOl.I00000oOI & 8) != 0) {
/* 22 */                toolbar.setTitle(charSequence);
/* 27 */                if (oo1ilOl.I000II) {
/* 33 */                    OooiOl0ioo0i.I0000Il00O(toolbar.getRootView(), charSequence);
                        }
                    }
                }

                @Override
                public final boolean shouldDelayChildPressedState() {
/* 1 */             return false;
                }

                @Override
/* 10 */        public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
/* 12 */            return new I0I10OI1iI(layoutParams);
                }

/* 27 */        public void setIcon(Drawable drawable) {
/* 28 */            I000iOII();
/* 29 */            Oo1ilOl oo1ilOl = (Oo1ilOl) this.I00ilI0I1;
/* 30 */            oo1ilOl.I0000O = drawable;
/* 31 */            oo1ilOl.I0000O();
                }

/* 28 */        public void setShowingForActionMode(boolean z) {
                }

/* 28 */        public void setUiOptions(int i) {
                }

/* 121 */       public ActionBarOverlayLayout(Context context) {
/* 122 */           this(context, null);
                }

                @Override
/* 203 */       public final void I000O01llI0(int i, int i2, int[] iArr, int i3) {
                }

                @Override
/* 203 */       public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
                }
            }

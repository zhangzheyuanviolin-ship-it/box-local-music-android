            package androidx.appcompat.widget;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.util.AttributeSet;
            import android.view.View;
            import android.widget.LinearLayout;
            import com.box.gallery.R;
            import java.util.WeakHashMap;
            import p000.OOilOli0;
            import p000.OooiO1oOi1;
            import p000.OooiOl0ioo0i;
            
            public class ButtonBarLayout extends LinearLayout {
                public boolean I00iOIl;
                public boolean I00iiI;
                public int I00iiO;

                public ButtonBarLayout(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
/* 5 */             this.I00iiO = -1;
/* 7 */             int[] iArr = OOilOli0.I000iOII;
/* 9 */             TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
/* 13 */            WeakHashMap weakHashMap = OooiOl0ioo0i.I00000oIO;
/* 20 */            OooiO1oOi1.I00000oOI(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
/* 29 */            this.I00iOIl = typedArrayObtainStyledAttributes.getBoolean(0, true);
/* 31 */            typedArrayObtainStyledAttributes.recycle();
/* 38 */            if (getOrientation() == 1) {
/* 42 */                setStacked(this.I00iOIl);
                    }
                }

                private void setStacked(boolean z) {
/* 3 */             if (this.I00iiI != z) {
/* 5 */                 if (!z || this.I00iOIl) {
/* 11 */                    this.I00iiI = z;
/* 13 */                    setOrientation(z ? 1 : 0);
/* 24 */                    setGravity(z ? 8388613 : 80);
/* 30 */                    View viewFindViewById = findViewById(R.id.spacer);
/* 34 */                    if (viewFindViewById != null) {
/* 42 */                        viewFindViewById.setVisibility(z ? 8 : 4);
                            }
/* 51 */                    for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
/* 57 */                        bringChildToFront(getChildAt(childCount));
                            }
                        }
                    }
                }

                @Override
                public final void onMeasure(int i, int i2) {
                    int iMakeMeasureSpec;
                    boolean z;
                    int i3;
/* 1 */             int size = View.MeasureSpec.getSize(i);
/* 7 */             int paddingBottom = 0;
/* 8 */             if (this.I00iOIl) {
/* 12 */                if (size > this.I00iiO && this.I00iiI) {
/* 18 */                    setStacked(false);
                        }
/* 21 */                this.I00iiO = size;
                    }
/* 26 */            if (this.I00iiI || View.MeasureSpec.getMode(i) != 1073741824) {
/* 44 */                iMakeMeasureSpec = i;
/* 45 */                z = false;
                    } else {
/* 38 */                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
/* 42 */                z = true;
                    }
/* 46 */            super.onMeasure(iMakeMeasureSpec, i2);
/* 51 */            if (this.I00iOIl && !this.I00iiI && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
/* 68 */                setStacked(true);
/* 71 */                z = true;
                    }
/* 72 */            if (z) {
/* 74 */                super.onMeasure(i, i2);
                    }
/* 77 */            int childCount = getChildCount();
/* 81 */            int i4 = 0;
                    while (true) {
/* 82 */                i3 = -1;
/* 83 */                if (i4 >= childCount) {
/* 99 */                    i4 = -1;
                            break;
                        } else if (getChildAt(i4).getVisibility() == 0) {
                            break;
                        } else {
/* 96 */                    i4++;
                        }
                    }
/* 100 */           if (i4 >= 0) {
/* 102 */               View childAt = getChildAt(i4);
/* 110 */               LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
/* 126 */               int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
/* 129 */               if (this.I00iiI) {
/* 131 */                   int i5 = i4 + 1;
/* 132 */                   int childCount2 = getChildCount();
                            while (true) {
/* 136 */                       if (i5 >= childCount2) {
                                    break;
                                }
/* 146 */                       if (getChildAt(i5).getVisibility() == 0) {
/* 148 */                           i3 = i5;
                                    break;
                                }
/* 150 */                       i5++;
                            }
/* 181 */                   paddingBottom = i3 >= 0 ? getChildAt(i3).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
                        } else {
/* 187 */                   paddingBottom = getPaddingBottom() + measuredHeight;
                        }
                    }
/* 189 */           WeakHashMap weakHashMap = OooiOl0ioo0i.I00000oIO;
/* 195 */           if (getMinimumHeight() != paddingBottom) {
/* 197 */               setMinimumHeight(paddingBottom);
/* 200 */               if (i2 == 0) {
/* 202 */                   super.onMeasure(i, i2);
                        }
                    }
                }

                public void setAllowStacking(boolean z) {
/* 3 */             if (this.I00iOIl != z) {
/* 5 */                 this.I00iOIl = z;
/* 7 */                 if (!z && this.I00iiI) {
/* 14 */                    setStacked(false);
                        }
/* 17 */                requestLayout();
                    }
                }
            }

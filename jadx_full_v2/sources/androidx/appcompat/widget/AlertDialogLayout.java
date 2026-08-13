            package androidx.appcompat.widget;

            import android.content.Context;
            import android.graphics.drawable.Drawable;
            import android.util.AttributeSet;
            import android.view.Gravity;
            import android.view.View;
            import android.view.ViewGroup;
            import android.widget.LinearLayout;
            import com.box.gallery.R;
            import java.util.WeakHashMap;
            import p000.O0ooII1;
            import p000.O0ooIOIo;
            import p000.OooiOl0ioo0i;
            
/* 4 */     public class AlertDialogLayout extends O0ooIOIo {
                public AlertDialogLayout(Context context) {
/* 2 */             super(context, null);
                }

                public static int I000OOo1O(View view) {
/* 1 */             WeakHashMap weakHashMap = OooiOl0ioo0i.I00000oIO;
/* 3 */             int minimumHeight = view.getMinimumHeight();
/* 7 */             if (minimumHeight > 0) {
/* 9 */                 return minimumHeight;
                    }
/* 13 */            if (view instanceof ViewGroup) {
/* 15 */                ViewGroup viewGroup = (ViewGroup) view;
/* 22 */                if (viewGroup.getChildCount() == 1) {
/* 28 */                    return I000OOo1O(viewGroup.getChildAt(0));
                        }
                    }
/* 12 */            return 0;
                }

                /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
                    int i5;
                    int i6;
                    int i7;
/* 1 */             int paddingLeft = getPaddingLeft();
/* 5 */             int i8 = i3 - i;
/* 10 */            int paddingRight = i8 - getPaddingRight();
/* 17 */            int paddingRight2 = (i8 - paddingLeft) - getPaddingRight();
/* 18 */            int measuredHeight = getMeasuredHeight();
/* 22 */            int childCount = getChildCount();
/* 26 */            int gravity = getGravity();
/* 30 */            int i9 = gravity & 112;
/* 35 */            int i10 = gravity & 8388615;
/* 66 */            int paddingTop = i9 != 16 ? i9 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - measuredHeight : (((i4 - i2) - measuredHeight) / 2) + getPaddingTop();
/* 68 */            Drawable dividerDrawable = getDividerDrawable();
/* 77 */            int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
/* 81 */            for (int i11 = 0; i11 < childCount; i11++) {
/* 83 */                View childAt = getChildAt(i11);
/* 87 */                if (childAt != null && childAt.getVisibility() != 8) {
/* 97 */                    int measuredWidth = childAt.getMeasuredWidth();
/* 101 */                   int measuredHeight2 = childAt.getMeasuredHeight();
/* 109 */                   O0ooII1 o0ooII1 = (O0ooII1) childAt.getLayoutParams();
/* 111 */                   int i12 = ((LinearLayout.LayoutParams) o0ooII1).gravity;
/* 113 */                   if (i12 < 0) {
/* 115 */                       i12 = i10;
                            }
/* 124 */                   int absoluteGravity = Gravity.getAbsoluteGravity(i12, getLayoutDirection()) & 7;
/* 127 */                   if (absoluteGravity == 1) {
/* 149 */                       i5 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) o0ooII1).leftMargin;
/* 150 */                       i6 = ((LinearLayout.LayoutParams) o0ooII1).rightMargin;
                            } else if (absoluteGravity != 5) {
/* 134 */                       i7 = ((LinearLayout.LayoutParams) o0ooII1).leftMargin + paddingLeft;
/* 157 */                       if (I000O01llI0(i11)) {
/* 159 */                           paddingTop += intrinsicHeight;
                                }
/* 162 */                       int i13 = paddingTop + ((LinearLayout.LayoutParams) o0ooII1).topMargin;
/* 166 */                       childAt.layout(i7, i13, measuredWidth + i7, i13 + measuredHeight2);
/* 172 */                       paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) o0ooII1).bottomMargin + i13;
                            } else {
/* 136 */                       i5 = paddingRight - measuredWidth;
/* 138 */                       i6 = ((LinearLayout.LayoutParams) o0ooII1).rightMargin;
                            }
/* 140 */                   i7 = i5 - i6;
/* 157 */                   if (I000O01llI0(i11)) {
                            }
/* 162 */                   int i132 = paddingTop + ((LinearLayout.LayoutParams) o0ooII1).topMargin;
/* 166 */                   childAt.layout(i7, i132, measuredWidth + i7, i132 + measuredHeight2);
/* 172 */                   paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) o0ooII1).bottomMargin + i132;
                        }
                    }
                }

                @Override
                public final void onMeasure(int i, int i2) {
                    int iCombineMeasuredStates;
                    int iI000OOo1O;
                    int measuredHeight;
                    int measuredHeight2;
/* 1 */             AlertDialogLayout alertDialogLayout = this;
/* 5 */             int childCount = alertDialogLayout.getChildCount();
/* 9 */             View view = null;
/* 11 */            View view2 = null;
/* 12 */            View view3 = null;
/* 16 */            for (int i3 = 0; i3 < childCount; i3++) {
/* 18 */                View childAt = alertDialogLayout.getChildAt(i3);
/* 26 */                if (childAt.getVisibility() != 8) {
/* 29 */                    int id = childAt.getId();
/* 36 */                    if (id == R.id.topPanel) {
/* 38 */                        view = childAt;
                            } else if (id == R.id.buttonPanel) {
/* 45 */                        view2 = childAt;
                            } else {
/* 50 */                        if ((id != R.id.contentPanel && id != R.id.customPanel) || view3 != null) {
/* 59 */                            super.onMeasure(i, i2);
/* 62 */                            return;
                                }
/* 63 */                        view3 = childAt;
                            }
                        }
                    }
/* 67 */            int mode = View.MeasureSpec.getMode(i2);
/* 71 */            int size = View.MeasureSpec.getSize(i2);
/* 75 */            int mode2 = View.MeasureSpec.getMode(i);
/* 87 */            int paddingBottom = alertDialogLayout.getPaddingBottom() + alertDialogLayout.getPaddingTop();
/* 88 */            if (view != null) {
/* 90 */                view.measure(i, 0);
/* 97 */                paddingBottom += view.getMeasuredHeight();
/* 102 */               iCombineMeasuredStates = View.combineMeasuredStates(0, view.getMeasuredState());
                    } else {
/* 107 */               iCombineMeasuredStates = 0;
                    }
/* 108 */           if (view2 != null) {
/* 110 */               view2.measure(i, 0);
/* 113 */               iI000OOo1O = I000OOo1O(view2);
/* 121 */               measuredHeight = view2.getMeasuredHeight() - iI000OOo1O;
/* 122 */               paddingBottom += iI000OOo1O;
/* 127 */               iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
                    } else {
/* 132 */               iI000OOo1O = 0;
/* 133 */               measuredHeight = 0;
                    }
/* 134 */           if (view3 != null) {
/* 150 */               view3.measure(i, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));
/* 153 */               measuredHeight2 = view3.getMeasuredHeight();
/* 157 */               paddingBottom += measuredHeight2;
/* 162 */               iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
                    } else {
/* 167 */               measuredHeight2 = 0;
                    }
/* 168 */           int i4 = size - paddingBottom;
/* 171 */           if (view2 != null) {
/* 173 */               int i5 = paddingBottom - iI000OOo1O;
/* 174 */               int iMin = Math.min(i4, measuredHeight);
/* 178 */               if (iMin > 0) {
/* 180 */                   i4 -= iMin;
/* 181 */                   iI000OOo1O += iMin;
                        }
/* 186 */               view2.measure(i, View.MeasureSpec.makeMeasureSpec(iI000OOo1O, 1073741824));
/* 193 */               paddingBottom = i5 + view2.getMeasuredHeight();
/* 198 */               iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
                    }
/* 202 */           if (view3 != null && i4 > 0) {
/* 212 */               view3.measure(i, View.MeasureSpec.makeMeasureSpec(measuredHeight2 + i4, mode));
/* 219 */               paddingBottom = (paddingBottom - measuredHeight2) + view3.getMeasuredHeight();
/* 224 */               iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
                    }
/* 229 */           int iMax = 0;
/* 230 */           for (int i6 = 0; i6 < childCount; i6++) {
/* 232 */               View childAt2 = alertDialogLayout.getChildAt(i6);
/* 240 */               if (childAt2.getVisibility() != 8) {
/* 246 */                   iMax = Math.max(iMax, childAt2.getMeasuredWidth());
                        }
                    }
/* 267 */           int i7 = i2;
/* 273 */           alertDialogLayout.setMeasuredDimension(View.resolveSizeAndState(alertDialogLayout.getPaddingRight() + alertDialogLayout.getPaddingLeft() + iMax, i, iCombineMeasuredStates), View.resolveSizeAndState(paddingBottom, i7, 0));
/* 276 */           if (mode2 != 1073741824) {
/* 282 */               int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(alertDialogLayout.getMeasuredWidth(), 1073741824);
/* 286 */               int i8 = 0;
/* 287 */               while (i8 < childCount) {
/* 289 */                   View childAt3 = alertDialogLayout.getChildAt(i8);
/* 297 */                   if (childAt3.getVisibility() != 8) {
/* 304 */                       O0ooII1 o0ooII1 = (O0ooII1) childAt3.getLayoutParams();
/* 309 */                       if (((LinearLayout.LayoutParams) o0ooII1).width == -1) {
/* 311 */                           int i9 = ((LinearLayout.LayoutParams) o0ooII1).height;
/* 317 */                           ((LinearLayout.LayoutParams) o0ooII1).height = childAt3.getMeasuredHeight();
/* 321 */                           alertDialogLayout.measureChildWithMargins(childAt3, iMakeMeasureSpec, 0, i7, 0);
/* 324 */                           ((LinearLayout.LayoutParams) o0ooII1).height = i9;
                                }
                            }
/* 326 */                   i8++;
/* 328 */                   alertDialogLayout = this;
/* 330 */                   i7 = i2;
                        }
                    }
                }

/* 5 */         public AlertDialogLayout(Context context, AttributeSet attributeSet) {
/* 6 */             super(context, attributeSet);
                }
            }

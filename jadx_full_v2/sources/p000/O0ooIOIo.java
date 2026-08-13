            package p000;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.graphics.Canvas;
            import android.graphics.drawable.Drawable;
            import android.util.AttributeSet;
            import android.view.Gravity;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.accessibility.AccessibilityEvent;
            import android.view.accessibility.AccessibilityNodeInfo;
            import android.widget.LinearLayout;
            import java.util.WeakHashMap;
            
            public abstract class O0ooIOIo extends ViewGroup {
                public boolean I00iOIl;
                public int I00iiI;
                public int I00iiO;
                public int I00iio;
                public int I00ilI0I1;
                public int I00ilO0;
                public float I00io1l;
                public boolean I00ioIO;
                public int[] I00l0I0l0lO1;
                public int[] I00l0OO0IO;
                public Drawable I00li1OI;
                public int I00ll1;
                public int I00lli11;
                public int I00lll10;
                public int I00o0iI0io1;

                public O0ooIOIo(Context context, AttributeSet attributeSet) {
/* 2 */             super(context, attributeSet, 0);
/* 6 */             this.I00iOIl = true;
/* 9 */             this.I00iiI = -1;
/* 12 */            this.I00iiO = 0;
/* 17 */            this.I00ilI0I1 = 8388659;
/* 19 */            int[] iArr = OOilOli0.I000o00OoI0I;
/* 21 */            OlilOlOiI olilOlOiII0010I0i = OlilOlOiI.I0010I0i(context, attributeSet, iArr, 0);
/* 28 */            TypedArray typedArray = (TypedArray) olilOlOiII0010I0i.I00iiO;
/* 30 */            WeakHashMap weakHashMap = OooiOl0ioo0i.I00000oIO;
/* 36 */            OooiO1oOi1.I00000oOI(this, context, iArr, attributeSet, typedArray, 0, 0);
/* 41 */            TypedArray typedArray2 = (TypedArray) olilOlOiII0010I0i.I00iiO;
/* 43 */            int i = typedArray2.getInt(1, -1);
/* 47 */            if (i >= 0) {
/* 49 */                setOrientation(i);
                    }
/* 52 */            int i2 = typedArray2.getInt(0, -1);
/* 56 */            if (i2 >= 0) {
/* 58 */                setGravity(i2);
                    }
/* 62 */            boolean z = typedArray2.getBoolean(2, true);
/* 66 */            if (!z) {
/* 68 */                setBaselineAligned(z);
                    }
/* 78 */            this.I00io1l = typedArray2.getFloat(4, -1.0f);
/* 85 */            this.I00iiI = typedArray2.getInt(3, -1);
/* 92 */            this.I00ioIO = typedArray2.getBoolean(7, false);
/* 99 */            setDividerDrawable(olilOlOiII0010I0i.I000iOII(5));
/* 108 */           this.I00lll10 = typedArray2.getInt(8, 0);
/* 115 */           this.I00o0iI0io1 = typedArray2.getDimensionPixelSize(6, 0);
/* 117 */           olilOlOiII0010I0i.I0010o();
                }

                public final void I0000Il00O(Canvas canvas, int i) {
/* 25 */            this.I00li1OI.setBounds(getPaddingLeft() + this.I00o0iI0io1, i, (getWidth() - getPaddingRight()) - this.I00o0iI0io1, this.I00lli11 + i);
/* 30 */            this.I00li1OI.draw(canvas);
                }

                public final void I0000O(Canvas canvas, int i) {
/* 25 */            this.I00li1OI.setBounds(i, getPaddingTop() + this.I00o0iI0io1, this.I00ll1 + i, (getHeight() - getPaddingBottom()) - this.I00o0iI0io1);
/* 30 */            this.I00li1OI.draw(canvas);
                }

                @Override
                public O0ooII1 generateDefaultLayoutParams() {
/* 1 */             int i = this.I00iio;
/* 4 */             if (i == 0) {
/* 8 */                 return new O0ooII1(-2, -2);
                    }
/* 13 */            if (i == 1) {
/* 18 */                return new O0ooII1(-1, -2);
                    }
/* 22 */            return null;
                }

                @Override
                public O0ooII1 generateLayoutParams(AttributeSet attributeSet) {
/* 7 */             return new O0ooII1(getContext(), attributeSet);
                }

                @Override
                public O0ooII1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
                    return layoutParams instanceof O0ooII1 ? new O0ooII1((O0ooII1) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new O0ooII1((ViewGroup.MarginLayoutParams) layoutParams) : new O0ooII1(layoutParams);
                }

                public final boolean I000O01llI0(int i) {
/* 3 */             if (i == 0) {
                        return (this.I00lll10 & 1) != 0;
                    }
/* 12 */            int childCount = getChildCount();
/* 16 */            int i2 = this.I00lll10;
/* 18 */            if (i == childCount) {
                        return (i2 & 4) != 0;
                    }
/* 28 */            if ((i2 & 2) != 0) {
/* 31 */                for (int i3 = i - 1; i3 >= 0; i3--) {
/* 43 */                    if (getChildAt(i3).getVisibility() != 8) {
/* 2 */                         return true;
                            }
                        }
                    }
/* 1 */             return false;
                }

                @Override
                public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
/* 1 */             return layoutParams instanceof O0ooII1;
                }

                @Override
                public int getBaseline() {
                    int i;
/* 3 */             if (this.I00iiI < 0) {
/* 5 */                 return super.getBaseline();
                    }
/* 10 */            int childCount = getChildCount();
/* 14 */            int i2 = this.I00iiI;
/* 16 */            if (childCount <= i2) {
/* 245 */               throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
                    }
/* 18 */            View childAt = getChildAt(i2);
/* 22 */            int baseline = childAt.getBaseline();
/* 27 */            if (baseline == -1) {
/* 31 */                if (this.I00iiI == 0) {
/* 26 */                    return -1;
                        }
/* 41 */                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
                    }
/* 42 */            int bottom = this.I00iiO;
/* 47 */            if (this.I00iio == 1 && (i = this.I00ilI0I1 & 112) != 48) {
/* 59 */                if (i == 16) {
/* 108 */                   bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.I00ilO0) / 2;
                        } else if (i == 80) {
/* 82 */                    bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.I00ilO0;
                        }
                    }
/* 118 */           return bottom + ((LinearLayout.LayoutParams) ((O0ooII1) childAt.getLayoutParams())).topMargin + baseline;
                }

                public int getBaselineAlignedChildIndex() {
/* 1 */             return this.I00iiI;
                }

                public Drawable getDividerDrawable() {
/* 1 */             return this.I00li1OI;
                }

                public int getDividerPadding() {
/* 1 */             return this.I00o0iI0io1;
                }

                public int getDividerWidth() {
/* 1 */             return this.I00ll1;
                }

                public int getGravity() {
/* 1 */             return this.I00ilI0I1;
                }

                public int getOrientation() {
/* 1 */             return this.I00iio;
                }

                public int getShowDividers() {
/* 1 */             return this.I00lll10;
                }

                public int getVirtualChildCount() {
/* 1 */             return getChildCount();
                }

                public float getWeightSum() {
/* 1 */             return this.I00io1l;
                }

                @Override
                public final void onDraw(Canvas canvas) {
                    int right;
                    int left;
                    int i;
/* 3 */             if (this.I00li1OI == null) {
/* 437 */               return;
                    }
/* 11 */            int i2 = 0;
/* 13 */            if (this.I00iio == 1) {
/* 15 */                int virtualChildCount = getVirtualChildCount();
/* 19 */                while (i2 < virtualChildCount) {
/* 21 */                    View childAt = getChildAt(i2);
/* 25 */                    if (childAt != null && childAt.getVisibility() != 8 && I000O01llI0(i2)) {
/* 55 */                        I0000Il00O(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((O0ooII1) childAt.getLayoutParams())).topMargin) - this.I00lli11);
                            }
/* 58 */                    i2++;
                        }
/* 65 */                if (I000O01llI0(virtualChildCount)) {
/* 68 */                    View childAt2 = getChildAt(virtualChildCount - 1);
/* 100 */                   I0000Il00O(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.I00lli11 : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((O0ooII1) childAt2.getLayoutParams())).bottomMargin);
/* 103 */                   return;
                        }
/* 437 */               return;
                    }
/* 104 */           int virtualChildCount2 = getVirtualChildCount();
/* 116 */           boolean z = getLayoutDirection() == 1;
/* 117 */           while (i2 < virtualChildCount2) {
/* 119 */               View childAt3 = getChildAt(i2);
/* 123 */               if (childAt3 != null && childAt3.getVisibility() != 8 && I000O01llI0(i2)) {
/* 141 */                   O0ooII1 o0ooII1 = (O0ooII1) childAt3.getLayoutParams();
/* 163 */                   I0000O(canvas, z ? childAt3.getRight() + ((LinearLayout.LayoutParams) o0ooII1).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) o0ooII1).leftMargin) - this.I00ll1);
                        }
/* 166 */               i2++;
                    }
/* 173 */           if (I000O01llI0(virtualChildCount2)) {
/* 176 */               View childAt4 = getChildAt(virtualChildCount2 - 1);
/* 180 */               if (childAt4 != null) {
/* 206 */                   O0ooII1 o0ooII12 = (O0ooII1) childAt4.getLayoutParams();
/* 208 */                   if (z) {
/* 216 */                       left = childAt4.getLeft() - ((LinearLayout.LayoutParams) o0ooII12).leftMargin;
/* 217 */                       i = this.I00ll1;
/* 200 */                       right = left - i;
                            } else {
/* 226 */                       right = childAt4.getRight() + ((LinearLayout.LayoutParams) o0ooII12).rightMargin;
                            }
                        } else if (z) {
/* 184 */                   right = getPaddingLeft();
                        } else {
/* 197 */                   left = getWidth() - getPaddingRight();
/* 198 */                   i = this.I00ll1;
/* 200 */                   right = left - i;
                        }
/* 227 */               I0000O(canvas, right);
                    }
                }

                @Override
                public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
/* 1 */             super.onInitializeAccessibilityEvent(accessibilityEvent);
/* 6 */             accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
                }

                @Override
                public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
/* 1 */             super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
/* 6 */             accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
                }

                /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
                /* JADX WARN: Removed duplicated region for block: B:62:0x0158  */
                /* JADX WARN: Removed duplicated region for block: B:65:0x0161  */
                /* JADX WARN: Removed duplicated region for block: B:77:0x018f  */
                /* JADX WARN: Removed duplicated region for block: B:80:0x01a2  */
                /* JADX WARN: Removed duplicated region for block: B:81:0x01a7  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void onLayout(boolean z, int i, int i2, int i3, int i4) {
                    int i5;
                    int i6;
                    int i7;
                    int i8;
                    int i9;
                    int i10;
                    int i11;
                    int measuredHeight;
                    char c;
                    int i12;
                    int i13;
                    int i14;
/* 6 */             int i15 = 8;
/* 15 */            char c2 = 2;
/* 17 */            if (this.I00iio == 1) {
/* 19 */                int paddingLeft = getPaddingLeft();
/* 23 */                int i16 = i3 - i;
/* 29 */                int paddingRight = i16 - getPaddingRight();
/* 36 */                int paddingRight2 = (i16 - paddingLeft) - getPaddingRight();
/* 37 */                int virtualChildCount = getVirtualChildCount();
/* 41 */                int i17 = this.I00ilI0I1;
/* 43 */                int i18 = i17 & 112;
/* 45 */                int i19 = 8388615 & i17;
/* 77 */                int paddingTop = i18 != 16 ? i18 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - this.I00ilO0 : getPaddingTop() + (((i4 - i2) - this.I00ilO0) / 2);
/* 78 */                int i20 = 0;
/* 79 */                while (i20 < virtualChildCount) {
/* 81 */                    View childAt = getChildAt(i20);
/* 85 */                    if (childAt == null || childAt.getVisibility() == i15) {
/* 87 */                        c = c2;
                            } else {
/* 96 */                        int measuredWidth = childAt.getMeasuredWidth();
/* 100 */                       int measuredHeight2 = childAt.getMeasuredHeight();
/* 108 */                       O0ooII1 o0ooII1 = (O0ooII1) childAt.getLayoutParams();
/* 110 */                       c = c2;
/* 112 */                       int i21 = ((LinearLayout.LayoutParams) o0ooII1).gravity;
/* 114 */                       if (i21 < 0) {
/* 116 */                           i21 = i19;
                                }
/* 125 */                       int absoluteGravity = Gravity.getAbsoluteGravity(i21, getLayoutDirection()) & 7;
/* 127 */                       if (absoluteGravity == 1) {
/* 148 */                           i12 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) o0ooII1).leftMargin;
/* 149 */                           i13 = ((LinearLayout.LayoutParams) o0ooII1).rightMargin;
                                } else if (absoluteGravity != 5) {
/* 133 */                           i14 = ((LinearLayout.LayoutParams) o0ooII1).leftMargin + paddingLeft;
/* 156 */                           if (I000O01llI0(i20)) {
/* 160 */                               paddingTop += this.I00lli11;
                                    }
/* 163 */                           int i22 = paddingTop + ((LinearLayout.LayoutParams) o0ooII1).topMargin;
/* 167 */                           childAt.layout(i14, i22, measuredWidth + i14, i22 + measuredHeight2);
/* 173 */                           paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) o0ooII1).bottomMargin + i22;
                                } else {
/* 135 */                           i12 = paddingRight - measuredWidth;
/* 137 */                           i13 = ((LinearLayout.LayoutParams) o0ooII1).rightMargin;
                                }
/* 139 */                       i14 = i12 - i13;
/* 156 */                       if (I000O01llI0(i20)) {
                                }
/* 163 */                       int i222 = paddingTop + ((LinearLayout.LayoutParams) o0ooII1).topMargin;
/* 167 */                       childAt.layout(i14, i222, measuredWidth + i14, i222 + measuredHeight2);
/* 173 */                       paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) o0ooII1).bottomMargin + i222;
                            }
/* 175 */                   i20++;
/* 177 */                   c2 = c;
/* 179 */                   i15 = 8;
                        }
/* 2230 */              return;
                    }
/* 192 */           boolean z2 = getLayoutDirection() == 1;
/* 193 */           int paddingTop2 = getPaddingTop();
/* 197 */           int i23 = i4 - i2;
/* 203 */           int paddingBottom = i23 - getPaddingBottom();
/* 210 */           int paddingBottom2 = (i23 - paddingTop2) - getPaddingBottom();
/* 211 */           int virtualChildCount2 = getVirtualChildCount();
/* 215 */           int i24 = this.I00ilI0I1;
/* 217 */           int i25 = 8388615 & i24;
/* 218 */           int i26 = i24 & 112;
/* 220 */           boolean z3 = this.I00iOIl;
/* 222 */           int[] iArr = this.I00l0I0l0lO1;
/* 224 */           int[] iArr2 = this.I00l0OO0IO;
/* 230 */           int absoluteGravity2 = Gravity.getAbsoluteGravity(i25, getLayoutDirection());
/* 266 */           int paddingLeft2 = absoluteGravity2 != 1 ? absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i3) - i) - this.I00ilO0 : getPaddingLeft() + (((i3 - i) - this.I00ilO0) / 2);
/* 267 */           if (z2) {
                        i6 = virtualChildCount2 - 1;
/* 271 */               i5 = -1;
                    } else {
/* 273 */               i5 = 1;
/* 274 */               i6 = 0;
                    }
/* 277 */           int i27 = 0;
/* 278 */           while (i27 < virtualChildCount2) {
/* 282 */               int i28 = (i5 * i27) + i6;
/* 284 */               View childAt2 = getChildAt(i28);
/* 288 */               if (childAt2 == null) {
/* 290 */                   i7 = i6;
                        } else {
/* 300 */                   i7 = i6;
/* 304 */                   if (childAt2.getVisibility() != 8) {
/* 306 */                       int measuredWidth2 = childAt2.getMeasuredWidth();
/* 310 */                       int measuredHeight3 = childAt2.getMeasuredHeight();
/* 320 */                       O0ooII1 o0ooII12 = (O0ooII1) childAt2.getLayoutParams();
/* 322 */                       int i29 = paddingLeft2;
/* 324 */                       if (z3) {
/* 328 */                           i8 = paddingTop2;
/* 333 */                           int baseline = ((LinearLayout.LayoutParams) o0ooII12).height != -1 ? childAt2.getBaseline() : -1;
/* 341 */                           i9 = ((LinearLayout.LayoutParams) o0ooII12).gravity;
/* 343 */                           if (i9 < 0) {
/* 345 */                               i9 = i26;
                                    }
/* 346 */                           i10 = i9 & 112;
/* 352 */                           if (i10 == 16) {
/* 356 */                               if (i10 == 48) {
/* 389 */                                   i11 = i8 + ((LinearLayout.LayoutParams) o0ooII12).topMargin;
/* 391 */                                   if (baseline != -1) {
/* 397 */                                       i11 = (iArr[1] - baseline) + i11;
                                            }
                                        } else if (i10 != 80) {
/* 362 */                                   i11 = i8;
                                        } else {
/* 370 */                                   i11 = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) o0ooII12).bottomMargin;
/* 372 */                                   if (baseline != -1) {
/* 382 */                                       measuredHeight = iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                                            }
                                        }
/* 428 */                               int i30 = (I000O01llI0(i28) ? i29 + this.I00ll1 : i29) + ((LinearLayout.LayoutParams) o0ooII12).leftMargin;
/* 433 */                               childAt2.layout(i30, i11, i30 + measuredWidth2, i11 + measuredHeight3);
/* 440 */                               paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) o0ooII12).rightMargin + i30;
/* 447 */                               i27++;
/* 449 */                               i6 = i7;
/* 451 */                               paddingTop2 = i8;
                                    } else {
/* 409 */                               i11 = ((paddingBottom2 - measuredHeight3) / 2) + i8 + ((LinearLayout.LayoutParams) o0ooII12).topMargin;
/* 410 */                               measuredHeight = ((LinearLayout.LayoutParams) o0ooII12).bottomMargin;
                                    }
/* 384 */                           i11 -= measuredHeight;
/* 428 */                           int i302 = (I000O01llI0(i28) ? i29 + this.I00ll1 : i29) + ((LinearLayout.LayoutParams) o0ooII12).leftMargin;
/* 433 */                           childAt2.layout(i302, i11, i302 + measuredWidth2, i11 + measuredHeight3);
/* 440 */                           paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) o0ooII12).rightMargin + i302;
/* 447 */                           i27++;
/* 449 */                           i6 = i7;
/* 451 */                           paddingTop2 = i8;
                                } else {
/* 338 */                           i8 = paddingTop2;
                                }
/* 341 */                       i9 = ((LinearLayout.LayoutParams) o0ooII12).gravity;
/* 343 */                       if (i9 < 0) {
                                }
/* 346 */                       i10 = i9 & 112;
/* 352 */                       if (i10 == 16) {
                                }
/* 384 */                       i11 -= measuredHeight;
/* 428 */                       int i3022 = (I000O01llI0(i28) ? i29 + this.I00ll1 : i29) + ((LinearLayout.LayoutParams) o0ooII12).leftMargin;
/* 433 */                       childAt2.layout(i3022, i11, i3022 + measuredWidth2, i11 + measuredHeight3);
/* 440 */                       paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) o0ooII12).rightMargin + i3022;
/* 447 */                       i27++;
/* 449 */                       i6 = i7;
/* 451 */                       paddingTop2 = i8;
                            }
                        }
/* 292 */               i8 = paddingTop2;
/* 447 */               i27++;
/* 449 */               i6 = i7;
/* 451 */               paddingTop2 = i8;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:231:0x04df  */
                /* JADX WARN: Removed duplicated region for block: B:234:0x04f4  */
                /* JADX WARN: Removed duplicated region for block: B:240:0x0522  */
                /* JADX WARN: Removed duplicated region for block: B:246:0x0532  */
                /* JADX WARN: Removed duplicated region for block: B:249:0x0539  */
                /* JADX WARN: Removed duplicated region for block: B:253:0x0543  */
                /* JADX WARN: Removed duplicated region for block: B:370:0x0794  */
                /* JADX WARN: Removed duplicated region for block: B:64:0x013f  */
                /* JADX WARN: Removed duplicated region for block: B:68:0x0148  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void onMeasure(int i, int i2) {
                    int[] iArr;
                    int i3;
                    int i4;
                    int i5;
                    int iMax;
                    int i6;
                    int i7;
                    int baseline;
                    int i8;
                    int i9;
                    int[] iArr2;
                    int i10;
                    int i11;
                    boolean z;
                    boolean z2;
                    O0ooII1 o0ooII1;
                    int i12;
                    int[] iArr3;
                    int i13;
                    View view;
                    int i14;
                    boolean z3;
                    boolean z4;
                    int iMax2;
                    int i15;
                    int i16;
                    int i17;
                    int i18;
                    int i19;
                    int i20;
                    int i21;
                    int i22;
                    boolean z5;
                    int i23;
                    int i24;
                    int i25;
                    View view2;
                    boolean z6;
/* 1 */             O0ooIOIo o0ooIOIo = this;
/* 5 */             int i26 = -2;
/* 6 */             int iMax3 = 0;
/* 7 */             int i27 = 1073741824;
/* 9 */             int i28 = 8;
/* 12 */            if (o0ooIOIo.I00iio == 1) {
/* 14 */                o0ooIOIo.I00ilO0 = 0;
/* 16 */                int virtualChildCount = o0ooIOIo.getVirtualChildCount();
/* 20 */                int mode = View.MeasureSpec.getMode(i);
/* 24 */                int mode2 = View.MeasureSpec.getMode(i2);
/* 28 */                int i29 = o0ooIOIo.I00iiI;
/* 30 */                boolean z7 = o0ooIOIo.I00ioIO;
/* 32 */                int i30 = 0;
/* 33 */                int iMax4 = 0;
/* 34 */                int iMax5 = 0;
/* 35 */                boolean z8 = false;
/* 37 */                int i31 = 0;
/* 39 */                boolean z9 = false;
/* 43 */                boolean z10 = true;
/* 45 */                float f = 0.0f;
/* 52 */                int iMax6 = 0;
/* 54 */                while (i30 < virtualChildCount) {
/* 56 */                    int i32 = mode;
/* 58 */                    View childAt = o0ooIOIo.getChildAt(i30);
/* 62 */                    if (childAt == null) {
/* 66 */                        o0ooIOIo.I00ilO0 = o0ooIOIo.I00ilO0;
                            } else {
/* 86 */                        if (childAt.getVisibility() != i28) {
/* 93 */                            if (o0ooIOIo.I000O01llI0(i30)) {
                                        o0ooIOIo.I00ilO0 += o0ooIOIo.I00lli11;
                                    }
/* 106 */                           O0ooII1 o0ooII12 = (O0ooII1) childAt.getLayoutParams();
/* 108 */                           float f2 = ((LinearLayout.LayoutParams) o0ooII12).weight;
/* 110 */                           f += f2;
/* 112 */                           if (mode2 == i27 && ((LinearLayout.LayoutParams) o0ooII12).height == 0 && f2 > 0.0f) {
/* 122 */                               int i33 = o0ooIOIo.I00ilO0;
/* 134 */                               o0ooIOIo.I00ilO0 = Math.max(i33, ((LinearLayout.LayoutParams) o0ooII12).topMargin + i33 + ((LinearLayout.LayoutParams) o0ooII12).bottomMargin);
/* 136 */                               view2 = childAt;
/* 138 */                               i22 = mode2;
/* 140 */                               i23 = i29;
/* 141 */                               z5 = z7;
/* 143 */                               i24 = i30;
/* 144 */                               z8 = true;
/* 146 */                               i25 = i32;
                                    } else {
/* 155 */                               if (((LinearLayout.LayoutParams) o0ooII12).height != 0 || f2 <= 0.0f) {
/* 165 */                                   i19 = Integer.MIN_VALUE;
                                        } else {
/* 161 */                                   ((LinearLayout.LayoutParams) o0ooII12).height = i26;
/* 163 */                                   i19 = 0;
                                        }
/* 169 */                               if (f == 0.0f) {
/* 174 */                                   i20 = i30;
/* 171 */                                   i21 = o0ooIOIo.I00ilO0;
                                        } else {
/* 178 */                                   i20 = i30;
/* 179 */                                   i21 = 0;
                                        }
/* 182 */                               i22 = mode2;
/* 184 */                               z5 = z7;
/* 186 */                               i23 = i29;
/* 191 */                               i24 = i20;
/* 192 */                               i25 = i32;
/* 194 */                               o0ooIOIo.measureChildWithMargins(childAt, i, 0, i2, i21);
/* 199 */                               if (i19 != Integer.MIN_VALUE) {
/* 201 */                                   ((LinearLayout.LayoutParams) o0ooII12).height = i19;
                                        }
/* 203 */                               int measuredHeight = childAt.getMeasuredHeight();
/* 207 */                               int i34 = o0ooIOIo.I00ilO0;
/* 211 */                               view2 = childAt;
/* 223 */                               o0ooIOIo.I00ilO0 = Math.max(i34, i34 + measuredHeight + ((LinearLayout.LayoutParams) o0ooII12).topMargin + ((LinearLayout.LayoutParams) o0ooII12).bottomMargin);
/* 225 */                               if (z5) {
/* 227 */                                   iMax6 = Math.max(measuredHeight, iMax6);
                                        }
                                    }
/* 231 */                           if (i23 >= 0 && i23 == i24 + 1) {
/* 239 */                               o0ooIOIo.I00iiO = o0ooIOIo.I00ilO0;
                                    }
/* 241 */                           if (i24 < i23 && ((LinearLayout.LayoutParams) o0ooII12).weight > 0.0f) {
/* 259 */                               throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                                    }
/* 260 */                           if (i25 == 1073741824 || ((LinearLayout.LayoutParams) o0ooII12).width != -1) {
/* 272 */                               z6 = false;
                                    } else {
/* 267 */                               z6 = true;
/* 269 */                               z9 = true;
                                    }
/* 277 */                           int i35 = ((LinearLayout.LayoutParams) o0ooII12).leftMargin + ((LinearLayout.LayoutParams) o0ooII12).rightMargin;
/* 282 */                           int measuredWidth = view2.getMeasuredWidth() + i35;
/* 283 */                           iMax3 = Math.max(iMax3, measuredWidth);
/* 287 */                           int measuredState = view2.getMeasuredState();
/* 291 */                           boolean z11 = z6;
/* 295 */                           int iCombineMeasuredStates = View.combineMeasuredStates(i31, measuredState);
/* 299 */                           if (z10) {
/* 303 */                               i31 = iCombineMeasuredStates;
/* 306 */                               boolean z12 = ((LinearLayout.LayoutParams) o0ooII12).width == -1;
/* 318 */                               if (((LinearLayout.LayoutParams) o0ooII12).weight <= 0.0f) {
/* 320 */                                   if (!z11) {
/* 323 */                                       i35 = measuredWidth;
                                            }
/* 324 */                                   iMax5 = Math.max(iMax5, i35);
                                        } else {
/* 329 */                                   if (!z11) {
/* 332 */                                       i35 = measuredWidth;
                                            }
/* 333 */                                   iMax4 = Math.max(iMax4, i35);
                                        }
/* 337 */                               z10 = z12;
                                    } else {
/* 311 */                               i31 = iCombineMeasuredStates;
                                    }
/* 318 */                           if (((LinearLayout.LayoutParams) o0ooII12).weight <= 0.0f) {
                                    }
/* 337 */                           z10 = z12;
                                }
/* 339 */                       i30 = i24 + 1;
/* 341 */                       i29 = i23;
/* 342 */                       mode = i25;
/* 343 */                       z7 = z5;
/* 345 */                       mode2 = i22;
/* 347 */                       i26 = -2;
/* 348 */                       i27 = 1073741824;
/* 350 */                       i28 = 8;
                            }
/* 68 */                    i22 = mode2;
/* 70 */                    i23 = i29;
/* 71 */                    z5 = z7;
/* 73 */                    i24 = i30;
/* 74 */                    i25 = i32;
/* 339 */                   i30 = i24 + 1;
/* 341 */                   i29 = i23;
/* 342 */                   mode = i25;
/* 343 */                   z7 = z5;
/* 345 */                   mode2 = i22;
/* 347 */                   i26 = -2;
/* 348 */                   i27 = 1073741824;
/* 350 */                   i28 = 8;
                        }
/* 354 */               int i36 = mode;
/* 355 */               int i37 = mode2;
/* 357 */               boolean z13 = z7;
/* 359 */               int i38 = i31;
/* 363 */               int i39 = i2;
/* 367 */               if (o0ooIOIo.I00ilO0 > 0 && o0ooIOIo.I000O01llI0(virtualChildCount)) {
                            o0ooIOIo.I00ilO0 += o0ooIOIo.I00lli11;
                        }
/* 384 */               if (z13 && (i37 == Integer.MIN_VALUE || i37 == 0)) {
/* 393 */                   o0ooIOIo.I00ilO0 = 0;
/* 396 */                   for (int i40 = 0; i40 < virtualChildCount; i40++) {
/* 398 */                       View childAt2 = o0ooIOIo.getChildAt(i40);
/* 402 */                       if (childAt2 == null) {
/* 406 */                           o0ooIOIo.I00ilO0 = o0ooIOIo.I00ilO0;
                                } else if (childAt2.getVisibility() != 8) {
/* 422 */                           O0ooII1 o0ooII13 = (O0ooII1) childAt2.getLayoutParams();
/* 424 */                           int i41 = o0ooIOIo.I00ilO0;
/* 438 */                           o0ooIOIo.I00ilO0 = Math.max(i41, i41 + iMax6 + ((LinearLayout.LayoutParams) o0ooII13).topMargin + ((LinearLayout.LayoutParams) o0ooII13).bottomMargin);
                                }
                            }
                        }
/* 454 */               int paddingBottom = o0ooIOIo.getPaddingBottom() + o0ooIOIo.getPaddingTop() + o0ooIOIo.I00ilO0;
/* 455 */               o0ooIOIo.I00ilO0 = paddingBottom;
/* 466 */               int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, o0ooIOIo.getSuggestedMinimumHeight()), i39, 0);
/* 474 */               int i42 = (iResolveSizeAndState & 16777215) - o0ooIOIo.I00ilO0;
/* 475 */               if (z8 || (i42 != 0 && f > 0.0f)) {
/* 544 */                   float f3 = o0ooIOIo.I00io1l;
/* 548 */                   if (f3 > 0.0f) {
/* 550 */                       f = f3;
                            }
/* 553 */                   o0ooIOIo.I00ilO0 = 0;
/* 555 */                   int iCombineMeasuredStates2 = i38;
/* 556 */                   int i43 = 0;
/* 557 */                   while (i43 < virtualChildCount) {
/* 559 */                       View childAt3 = o0ooIOIo.getChildAt(i43);
/* 569 */                       if (childAt3.getVisibility() == 8) {
/* 571 */                           i16 = i43;
                                } else {
/* 579 */                           O0ooII1 o0ooII14 = (O0ooII1) childAt3.getLayoutParams();
/* 581 */                           float f4 = ((LinearLayout.LayoutParams) o0ooII14).weight;
/* 585 */                           if (f4 > 0.0f) {
/* 591 */                               int i44 = (int) ((i42 * f4) / f);
/* 592 */                               f -= f4;
/* 594 */                               i42 -= i44;
/* 613 */                               i16 = i43;
/* 617 */                               int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, o0ooIOIo.getPaddingRight() + o0ooIOIo.getPaddingLeft() + ((LinearLayout.LayoutParams) o0ooII14).leftMargin + ((LinearLayout.LayoutParams) o0ooII14).rightMargin, ((LinearLayout.LayoutParams) o0ooII14).width);
/* 623 */                               if (((LinearLayout.LayoutParams) o0ooII14).height == 0) {
/* 625 */                                   i18 = 1073741824;
/* 627 */                                   if (i37 == 1073741824) {
/* 630 */                                       if (i44 <= 0) {
/* 633 */                                           i44 = 0;
                                                }
/* 638 */                                       childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i44, 1073741824));
                                            }
/* 666 */                                   iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                                        } else {
/* 642 */                                   i18 = 1073741824;
                                        }
/* 648 */                               int measuredHeight2 = childAt3.getMeasuredHeight() + i44;
/* 650 */                               if (measuredHeight2 < 0) {
/* 652 */                                   measuredHeight2 = 0;
                                        }
/* 657 */                               childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i18));
/* 666 */                               iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                                    } else {
/* 671 */                               i16 = i43;
                                    }
/* 677 */                           int i45 = ((LinearLayout.LayoutParams) o0ooII14).leftMargin + ((LinearLayout.LayoutParams) o0ooII14).rightMargin;
/* 682 */                           int measuredWidth2 = childAt3.getMeasuredWidth() + i45;
/* 683 */                           iMax3 = Math.max(iMax3, measuredWidth2);
/* 689 */                           if (i36 != 1073741824) {
/* 695 */                               i17 = -1;
/* 696 */                               if (((LinearLayout.LayoutParams) o0ooII14).width == -1) {
/* 698 */                                   measuredWidth2 = i45;
                                        }
                                    } else {
/* 701 */                               i17 = -1;
                                    }
/* 702 */                           iMax4 = Math.max(iMax4, measuredWidth2);
/* 715 */                           boolean z14 = z10 && ((LinearLayout.LayoutParams) o0ooII14).width == i17;
/* 716 */                           int i46 = o0ooIOIo.I00ilO0;
/* 733 */                           o0ooIOIo.I00ilO0 = Math.max(i46, childAt3.getMeasuredHeight() + i46 + ((LinearLayout.LayoutParams) o0ooII14).topMargin + ((LinearLayout.LayoutParams) o0ooII14).bottomMargin);
/* 735 */                           z10 = z14;
                                }
/* 737 */                       i43 = i16 + 1;
                            }
/* 753 */                   o0ooIOIo.I00ilO0 = o0ooIOIo.getPaddingBottom() + o0ooIOIo.getPaddingTop() + o0ooIOIo.I00ilO0;
/* 755 */                   i38 = iCombineMeasuredStates2;
                        } else {
/* 484 */                   iMax4 = Math.max(iMax4, iMax5);
/* 488 */                   if (z13 && i37 != 1073741824) {
/* 495 */                       for (int i47 = 0; i47 < virtualChildCount; i47++) {
/* 497 */                           View childAt4 = o0ooIOIo.getChildAt(i47);
/* 501 */                           if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((O0ooII1) childAt4.getLayoutParams())).weight > 0.0f) {
/* 538 */                               childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(iMax6, 1073741824));
                                    }
                                }
                            }
                        }
/* 756 */               if (z10 || i36 == 1073741824) {
/* 763 */                   iMax4 = iMax3;
                        }
/* 786 */               o0ooIOIo.setMeasuredDimension(View.resolveSizeAndState(Math.max(o0ooIOIo.getPaddingRight() + o0ooIOIo.getPaddingLeft() + iMax4, o0ooIOIo.getSuggestedMinimumWidth()), i, i38), iResolveSizeAndState);
/* 789 */               if (z9) {
/* 797 */                   int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(o0ooIOIo.getMeasuredWidth(), 1073741824);
/* 801 */                   int i48 = 0;
/* 802 */                   while (i48 < virtualChildCount) {
/* 804 */                       View childAt5 = o0ooIOIo.getChildAt(i48);
/* 814 */                       if (childAt5.getVisibility() != 8) {
/* 821 */                           O0ooII1 o0ooII15 = (O0ooII1) childAt5.getLayoutParams();
/* 826 */                           if (((LinearLayout.LayoutParams) o0ooII15).width == -1) {
/* 828 */                               int i49 = ((LinearLayout.LayoutParams) o0ooII15).height;
/* 834 */                               ((LinearLayout.LayoutParams) o0ooII15).height = childAt5.getMeasuredHeight();
/* 838 */                               o0ooIOIo.measureChildWithMargins(childAt5, iMakeMeasureSpec, 0, i39, 0);
/* 841 */                               ((LinearLayout.LayoutParams) o0ooII15).height = i49;
                                    }
                                }
/* 843 */                       i48++;
/* 845 */                       i39 = i2;
                            }
/* 3380 */                  return;
                        }
/* 3380 */              return;
                    }
/* 848 */           int i50 = i;
/* 858 */           o0ooIOIo.I00ilO0 = 0;
/* 860 */           int virtualChildCount2 = o0ooIOIo.getVirtualChildCount();
/* 864 */           int mode3 = View.MeasureSpec.getMode(i50);
/* 868 */           int mode4 = View.MeasureSpec.getMode(i2);
/* 872 */           int[] iArr4 = o0ooIOIo.I00l0I0l0lO1;
/* 875 */           if (iArr4 == null || (iArr = o0ooIOIo.I00l0OO0IO) == null) {
/* 885 */               iArr4 = new int[4];
/* 887 */               o0ooIOIo.I00l0I0l0lO1 = iArr4;
/* 889 */               iArr = new int[4];
/* 891 */               o0ooIOIo.I00l0OO0IO = iArr;
                    }
/* 882 */           int[] iArr5 = iArr4;
/* 883 */           int[] iArr6 = iArr;
/* 897 */           iArr5[3] = -1;
/* 899 */           char c = 2;
/* 900 */           iArr5[2] = -1;
/* 902 */           iArr5[1] = -1;
/* 906 */           iArr5[0] = -1;
/* 908 */           iArr6[3] = -1;
/* 910 */           iArr6[2] = -1;
/* 912 */           iArr6[1] = -1;
/* 914 */           iArr6[0] = -1;
/* 916 */           boolean z15 = o0ooIOIo.I00iOIl;
/* 918 */           boolean z16 = o0ooIOIo.I00ioIO;
/* 927 */           boolean z17 = mode3 == 1073741824;
/* 933 */           float f5 = 0.0f;
/* 935 */           boolean z18 = true;
/* 937 */           int i51 = 0;
/* 938 */           int i52 = 0;
/* 939 */           int i53 = 0;
/* 940 */           int iMax7 = 0;
/* 941 */           int iMax8 = 0;
/* 942 */           int iCombineMeasuredStates3 = 0;
/* 943 */           boolean z19 = false;
/* 945 */           boolean z20 = false;
/* 947 */           while (i51 < virtualChildCount2) {
/* 949 */               char c2 = c;
/* 951 */               View childAt6 = o0ooIOIo.getChildAt(i51);
/* 955 */               if (childAt6 == null) {
/* 959 */                   o0ooIOIo.I00ilO0 = o0ooIOIo.I00ilO0;
/* 961 */                   i11 = i51;
/* 963 */                   i15 = i53;
/* 964 */                   iArr3 = iArr5;
/* 966 */                   iArr2 = iArr6;
/* 968 */                   z = z15;
/* 970 */                   z2 = z16;
                        } else {
/* 980 */                   int i54 = i52;
/* 984 */                   if (childAt6.getVisibility() == 8) {
/* 986 */                       i50 = i;
/* 988 */                       i11 = i51;
/* 990 */                       i15 = i53;
/* 991 */                       iArr2 = iArr6;
/* 993 */                       z = z15;
/* 995 */                       z2 = z16;
/* 997 */                       i52 = i54;
/* 1001 */                      iArr3 = iArr5;
                            } else {
/* 1009 */                      if (o0ooIOIo.I000O01llI0(i51)) {
                                    o0ooIOIo.I00ilO0 += o0ooIOIo.I00ll1;
                                }
/* 1022 */                      O0ooII1 o0ooII16 = (O0ooII1) childAt6.getLayoutParams();
/* 1024 */                      float f6 = ((LinearLayout.LayoutParams) o0ooII16).weight;
/* 1026 */                      f5 += f6;
/* 1028 */                      int i55 = i51;
/* 1032 */                      if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) o0ooII16).width == 0 && f6 > 0.0f) {
/* 1042 */                          int i56 = o0ooIOIo.I00ilO0;
/* 1044 */                          int i57 = ((LinearLayout.LayoutParams) o0ooII16).leftMargin;
/* 1046 */                          if (z17) {
/* 1055 */                              o0ooIOIo.I00ilO0 = i57 + ((LinearLayout.LayoutParams) o0ooII16).rightMargin + i56;
                                    } else {
/* 1072 */                              o0ooIOIo.I00ilO0 = Math.max(i56, i56 + i57 + ((LinearLayout.LayoutParams) o0ooII16).rightMargin);
                                    }
/* 1074 */                          if (z15) {
/* 1077 */                              int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
/* 1081 */                              childAt6.measure(iMakeMeasureSpec2, iMakeMeasureSpec2);
/* 1084 */                              view = childAt6;
/* 1086 */                              z = z15;
/* 1088 */                              z2 = z16;
/* 1090 */                              i12 = i54;
/* 1092 */                              i11 = i55;
/* 1094 */                              o0ooII1 = o0ooII16;
/* 1095 */                              iArr3 = iArr5;
/* 1097 */                              iArr2 = iArr6;
/* 1099 */                              i50 = i;
/* 1101 */                              i13 = i53;
/* 1102 */                              i10 = iMax7;
                                    } else {
/* 1107 */                              view = childAt6;
/* 1109 */                              z = z15;
/* 1111 */                              z2 = z16;
/* 1113 */                              z20 = true;
/* 1115 */                              i12 = i54;
/* 1117 */                              i11 = i55;
/* 1119 */                              i14 = 1073741824;
/* 1121 */                              o0ooII1 = o0ooII16;
/* 1122 */                              iArr3 = iArr5;
/* 1124 */                              iArr2 = iArr6;
/* 1126 */                              i50 = i;
/* 1128 */                              i13 = i53;
/* 1129 */                              i10 = iMax7;
/* 1236 */                              if (mode4 == i14 && ((LinearLayout.LayoutParams) o0ooII1).height == -1) {
/* 1243 */                                  z3 = true;
/* 1245 */                                  z19 = true;
                                        } else {
/* 1248 */                                  z3 = false;
                                        }
/* 1253 */                              int i58 = ((LinearLayout.LayoutParams) o0ooII1).topMargin + ((LinearLayout.LayoutParams) o0ooII1).bottomMargin;
/* 1258 */                              int measuredHeight3 = view.getMeasuredHeight() + i58;
/* 1263 */                              iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
/* 1267 */                              if (z) {
/* 1315 */                                  z4 = z3;
                                        } else {
/* 1269 */                                  int baseline2 = view.getBaseline();
/* 1273 */                                  z4 = z3;
/* 1276 */                                  if (baseline2 != -1) {
/* 1278 */                                      int i59 = ((LinearLayout.LayoutParams) o0ooII1).gravity;
/* 1280 */                                      if (i59 < 0) {
/* 1282 */                                          i59 = o0ooIOIo.I00ilI0I1;
                                                }
/* 1292 */                                      int i60 = (((i59 & 112) >> 4) & (-2)) >> 1;
/* 1302 */                                      iArr3[i60] = Math.max(iArr3[i60], baseline2);
/* 1312 */                                      iArr2[i60] = Math.max(iArr2[i60], measuredHeight3 - baseline2);
                                            }
                                        }
/* 1317 */                              int iMax9 = Math.max(i12, measuredHeight3);
/* 1331 */                              boolean z21 = !z18 && ((LinearLayout.LayoutParams) o0ooII1).height == -1;
/* 1336 */                              if (((LinearLayout.LayoutParams) o0ooII1).weight <= 0.0f) {
/* 1338 */                                  if (!z4) {
/* 1341 */                                      i58 = measuredHeight3;
                                            }
/* 1342 */                                  iMax7 = Math.max(i10, i58);
/* 1346 */                                  iMax2 = i13;
                                        } else {
/* 1348 */                                  if (!z4) {
/* 1351 */                                      i58 = measuredHeight3;
                                            }
/* 1352 */                                  iMax2 = Math.max(i13, i58);
/* 1356 */                                  iMax7 = i10;
                                        }
/* 1357 */                              int i61 = iMax2;
/* 1359 */                              i52 = iMax9;
/* 1360 */                              i15 = i61;
/* 1362 */                              z18 = z21;
                                    }
                                } else {
/* 1136 */                          if (((LinearLayout.LayoutParams) o0ooII16).width != 0 || f6 <= 0.0f) {
/* 1147 */                              i9 = Integer.MIN_VALUE;
                                    } else {
/* 1143 */                              ((LinearLayout.LayoutParams) o0ooII16).width = -2;
/* 1145 */                              i9 = 0;
                                    }
/* 1163 */                          iArr2 = iArr6;
/* 1165 */                          i10 = iMax7;
/* 1167 */                          i11 = i55;
/* 1169 */                          z = z15;
/* 1171 */                          z2 = z16;
/* 1173 */                          int i62 = i9;
/* 1174 */                          o0ooII1 = o0ooII16;
/* 1176 */                          i12 = i54;
/* 1178 */                          i50 = i;
/* 1180 */                          iArr3 = iArr5;
/* 1182 */                          i13 = i53;
/* 1185 */                          o0ooIOIo.measureChildWithMargins(childAt6, i50, f5 == 0.0f ? o0ooIOIo.I00ilO0 : 0, i2, 0);
/* 1190 */                          if (i62 != Integer.MIN_VALUE) {
/* 1192 */                              ((LinearLayout.LayoutParams) o0ooII1).width = i62;
                                    }
/* 1194 */                          int measuredWidth3 = childAt6.getMeasuredWidth();
/* 1198 */                          int i63 = o0ooIOIo.I00ilO0;
/* 1200 */                          int i64 = ((LinearLayout.LayoutParams) o0ooII1).leftMargin;
/* 1202 */                          if (z17) {
/* 1205 */                              view = childAt6;
/* 1211 */                              o0ooIOIo.I00ilO0 = i64 + measuredWidth3 + ((LinearLayout.LayoutParams) o0ooII1).rightMargin + i63;
                                    } else {
/* 1214 */                              view = childAt6;
/* 1226 */                              o0ooIOIo.I00ilO0 = Math.max(i63, i63 + measuredWidth3 + i64 + ((LinearLayout.LayoutParams) o0ooII1).rightMargin);
                                    }
/* 1228 */                          if (z2) {
/* 1230 */                              iMax8 = Math.max(measuredWidth3, iMax8);
                                    }
                                }
/* 1234 */                      i14 = 1073741824;
/* 1236 */                      if (mode4 == i14) {
/* 1248 */                          z3 = false;
/* 1253 */                          int i582 = ((LinearLayout.LayoutParams) o0ooII1).topMargin + ((LinearLayout.LayoutParams) o0ooII1).bottomMargin;
/* 1258 */                          int measuredHeight32 = view.getMeasuredHeight() + i582;
/* 1263 */                          iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
/* 1267 */                          if (z) {
                                    }
/* 1317 */                          int iMax92 = Math.max(i12, measuredHeight32);
/* 1331 */                          if (z18) {
/* 1336 */                              if (((LinearLayout.LayoutParams) o0ooII1).weight <= 0.0f) {
                                        }
/* 1357 */                              int i612 = iMax2;
/* 1359 */                              i52 = iMax92;
/* 1360 */                              i15 = i612;
/* 1362 */                              z18 = z21;
                                    }
                                }
                            }
                        }
/* 1366 */              i53 = i15;
/* 1364 */              i51 = i11 + 1;
/* 1368 */              c = c2;
/* 1370 */              iArr5 = iArr3;
/* 1372 */              iArr6 = iArr2;
/* 1374 */              z15 = z;
/* 1376 */              z16 = z2;
                    }
/* 1380 */          int[] iArr7 = iArr5;
/* 1382 */          int[] iArr8 = iArr6;
/* 1384 */          char c3 = c;
/* 1386 */          boolean z22 = z15;
/* 1388 */          boolean z23 = z16;
/* 1390 */          int i65 = i52;
/* 1391 */          int i66 = i53;
/* 1392 */          int i67 = iMax7;
/* 1397 */          if (o0ooIOIo.I00ilO0 > 0 && o0ooIOIo.I000O01llI0(virtualChildCount2)) {
                        o0ooIOIo.I00ilO0 += o0ooIOIo.I00ll1;
                    }
/* 1412 */          int i68 = iArr7[1];
/* 1475 */          int iMax10 = (i68 == -1 && iArr7[0] == -1 && iArr7[c3] == -1 && iArr7[3] == -1) ? i65 : Math.max(i65, Math.max(iArr8[3], Math.max(iArr8[0], Math.max(iArr8[1], iArr8[c3]))) + Math.max(iArr7[3], Math.max(iArr7[0], Math.max(i68, iArr7[c3]))));
/* 1479 */          if (z23 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
/* 1488 */              o0ooIOIo.I00ilO0 = 0;
/* 1491 */              for (int i69 = 0; i69 < virtualChildCount2; i69++) {
/* 1493 */                  View childAt7 = o0ooIOIo.getChildAt(i69);
/* 1497 */                  if (childAt7 == null) {
/* 1501 */                      o0ooIOIo.I00ilO0 = o0ooIOIo.I00ilO0;
                            } else if (childAt7.getVisibility() != 8) {
/* 1517 */                      O0ooII1 o0ooII17 = (O0ooII1) childAt7.getLayoutParams();
/* 1519 */                      int i70 = o0ooIOIo.I00ilO0;
/* 1521 */                      if (z17) {
/* 1530 */                          o0ooIOIo.I00ilO0 = ((LinearLayout.LayoutParams) o0ooII17).leftMargin + iMax8 + ((LinearLayout.LayoutParams) o0ooII17).rightMargin + i70;
                                } else {
/* 1545 */                          o0ooIOIo.I00ilO0 = Math.max(i70, i70 + iMax8 + ((LinearLayout.LayoutParams) o0ooII17).leftMargin + ((LinearLayout.LayoutParams) o0ooII17).rightMargin);
                                }
                            }
                        }
                    }
/* 1561 */          int paddingRight = o0ooIOIo.getPaddingRight() + o0ooIOIo.getPaddingLeft() + o0ooIOIo.I00ilO0;
/* 1562 */          o0ooIOIo.I00ilO0 = paddingRight;
/* 1573 */          int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, o0ooIOIo.getSuggestedMinimumWidth()), i50, 0);
/* 1581 */          int i71 = (iResolveSizeAndState2 & 16777215) - o0ooIOIo.I00ilO0;
/* 1582 */          if (z20 || (i71 != 0 && f5 > 0.0f)) {
/* 1659 */              float f7 = o0ooIOIo.I00io1l;
/* 1663 */              if (f7 > 0.0f) {
/* 1665 */                  f5 = f7;
                        }
/* 1669 */              iArr7[3] = -1;
/* 1671 */              iArr7[c3] = -1;
/* 1673 */              iArr7[1] = -1;
/* 1676 */              iArr7[0] = -1;
/* 1678 */              iArr8[3] = -1;
/* 1680 */              iArr8[c3] = -1;
/* 1682 */              iArr8[1] = -1;
/* 1684 */              iArr8[0] = -1;
/* 1686 */              o0ooIOIo.I00ilO0 = 0;
/* 1688 */              iMax10 = -1;
/* 1689 */              int i72 = 0;
/* 1690 */              while (i72 < virtualChildCount2) {
/* 1692 */                  View childAt8 = o0ooIOIo.getChildAt(i72);
/* 1696 */                  if (childAt8 == null || childAt8.getVisibility() == 8) {
/* 1706 */                      i6 = iResolveSizeAndState2;
                            } else {
/* 1718 */                      O0ooII1 o0ooII18 = (O0ooII1) childAt8.getLayoutParams();
/* 1720 */                      float f8 = ((LinearLayout.LayoutParams) o0ooII18).weight;
/* 1724 */                      if (f8 > 0.0f) {
/* 1732 */                          int i73 = (int) ((i71 * f8) / f5);
/* 1733 */                          f5 -= f8;
/* 1735 */                          i71 -= i73;
/* 1754 */                          i6 = iResolveSizeAndState2;
/* 1758 */                          int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, o0ooIOIo.getPaddingBottom() + o0ooIOIo.getPaddingTop() + ((LinearLayout.LayoutParams) o0ooII18).topMargin + ((LinearLayout.LayoutParams) o0ooII18).bottomMargin, ((LinearLayout.LayoutParams) o0ooII18).height);
/* 1764 */                          if (((LinearLayout.LayoutParams) o0ooII18).width == 0) {
/* 1766 */                              i8 = 1073741824;
/* 1768 */                              if (mode3 == 1073741824) {
/* 1771 */                                  if (i73 <= 0) {
/* 1774 */                                      i73 = 0;
                                            }
/* 1779 */                                  childAt8.measure(View.MeasureSpec.makeMeasureSpec(i73, 1073741824), childMeasureSpec2);
                                        }
/* 1807 */                              iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                                    } else {
/* 1783 */                              i8 = 1073741824;
                                    }
/* 1789 */                          int measuredWidth4 = childAt8.getMeasuredWidth() + i73;
/* 1791 */                          if (measuredWidth4 < 0) {
/* 1793 */                              measuredWidth4 = 0;
                                    }
/* 1798 */                          childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i8), childMeasureSpec2);
/* 1807 */                          iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                                } else {
/* 1812 */                          i6 = iResolveSizeAndState2;
                                }
/* 1816 */                      int i74 = o0ooIOIo.I00ilO0;
/* 1818 */                      if (z17) {
/* 1831 */                          o0ooIOIo.I00ilO0 = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) o0ooII18).leftMargin + ((LinearLayout.LayoutParams) o0ooII18).rightMargin + i74;
                                } else {
/* 1851 */                          o0ooIOIo.I00ilO0 = Math.max(i74, childAt8.getMeasuredWidth() + i74 + ((LinearLayout.LayoutParams) o0ooII18).leftMargin + ((LinearLayout.LayoutParams) o0ooII18).rightMargin);
                                }
/* 1864 */                      boolean z24 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) o0ooII18).height == -1;
/* 1869 */                      int i75 = ((LinearLayout.LayoutParams) o0ooII18).topMargin + ((LinearLayout.LayoutParams) o0ooII18).bottomMargin;
/* 1874 */                      int measuredHeight4 = childAt8.getMeasuredHeight() + i75;
/* 1875 */                      iMax10 = Math.max(iMax10, measuredHeight4);
/* 1879 */                      if (!z24) {
/* 1882 */                          i75 = measuredHeight4;
                                }
/* 1883 */                      int iMax11 = Math.max(i66, i75);
/* 1887 */                      if (z18) {
/* 1891 */                          i7 = -1;
/* 1892 */                          boolean z25 = ((LinearLayout.LayoutParams) o0ooII18).height == -1;
/* 1899 */                          if (!z22 && (baseline = childAt8.getBaseline()) != i7) {
/* 1907 */                              int i76 = ((LinearLayout.LayoutParams) o0ooII18).gravity;
/* 1909 */                              if (i76 < 0) {
/* 1911 */                                  i76 = o0ooIOIo.I00ilI0I1;
                                        }
/* 1921 */                              int i77 = (((i76 & 112) >> 4) & (-2)) >> 1;
/* 1929 */                              iArr7[i77] = Math.max(iArr7[i77], baseline);
/* 1938 */                              iArr8[i77] = Math.max(iArr8[i77], measuredHeight4 - baseline);
                                    }
/* 1943 */                          z18 = z25;
/* 1945 */                          i66 = iMax11;
                                } else {
/* 1897 */                          i7 = -1;
                                }
/* 1899 */                      if (!z22) {
/* 1943 */                          z18 = z25;
/* 1945 */                          i66 = iMax11;
                                }
                            }
/* 1946 */                  i72++;
/* 1948 */                  iResolveSizeAndState2 = i6;
                        }
/* 1952 */              i3 = iResolveSizeAndState2;
/* 1954 */              i4 = -16777216;
/* 1968 */              o0ooIOIo.I00ilO0 = o0ooIOIo.getPaddingRight() + o0ooIOIo.getPaddingLeft() + o0ooIOIo.I00ilO0;
/* 1970 */              int i78 = iArr7[1];
/* 1973 */              if (i78 == -1 && iArr7[0] == -1 && iArr7[c3] == -1 && iArr7[3] == -1) {
/* 1990 */                  i5 = 0;
                        } else {
/* 1995 */                  i5 = 0;
/* 2034 */                  iMax10 = Math.max(iMax10, Math.max(iArr8[3], Math.max(iArr8[0], Math.max(iArr8[1], iArr8[c3]))) + Math.max(iArr7[3], Math.max(iArr7[0], Math.max(i78, iArr7[c3]))));
                        }
/* 2039 */              iMax = i66;
                    } else {
/* 1591 */              iMax = Math.max(i66, i67);
/* 1595 */              if (z23 && mode3 != 1073741824) {
/* 1602 */                  for (int i79 = 0; i79 < virtualChildCount2; i79++) {
/* 1604 */                      View childAt9 = o0ooIOIo.getChildAt(i79);
/* 1608 */                      if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((O0ooII1) childAt9.getLayoutParams())).weight > 0.0f) {
/* 1645 */                          childAt9.measure(View.MeasureSpec.makeMeasureSpec(iMax8, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                                }
                            }
                        }
/* 1651 */              i3 = iResolveSizeAndState2;
/* 1653 */              i4 = -16777216;
/* 1655 */              i5 = 0;
                    }
/* 2040 */          if (!z18 && mode4 != 1073741824) {
/* 2046 */              iMax10 = iMax;
                    }
/* 2075 */          o0ooIOIo.setMeasuredDimension(i3 | (iCombineMeasuredStates3 & i4), View.resolveSizeAndState(Math.max(o0ooIOIo.getPaddingBottom() + o0ooIOIo.getPaddingTop() + iMax10, o0ooIOIo.getSuggestedMinimumHeight()), i2, iCombineMeasuredStates3 << 16));
/* 2078 */          if (z19) {
/* 2086 */              int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(o0ooIOIo.getMeasuredHeight(), 1073741824);
/* 2090 */              int i80 = i5;
/* 2092 */              while (i80 < virtualChildCount2) {
/* 2094 */                  View childAt10 = o0ooIOIo.getChildAt(i80);
/* 2104 */                  if (childAt10.getVisibility() != 8) {
/* 2111 */                      O0ooII1 o0ooII19 = (O0ooII1) childAt10.getLayoutParams();
/* 2116 */                      if (((LinearLayout.LayoutParams) o0ooII19).height == -1) {
/* 2118 */                          int i81 = ((LinearLayout.LayoutParams) o0ooII19).width;
/* 2124 */                          ((LinearLayout.LayoutParams) o0ooII19).width = childAt10.getMeasuredWidth();
/* 2128 */                          o0ooIOIo.measureChildWithMargins(childAt10, i50, 0, iMakeMeasureSpec3, 0);
/* 2131 */                          ((LinearLayout.LayoutParams) o0ooII19).width = i81;
                                }
                            }
/* 2135 */                  i80++;
/* 2137 */                  o0ooIOIo = this;
/* 2139 */                  i50 = i;
                        }
                    }
                }

                public void setBaselineAligned(boolean z) {
/* 1 */             this.I00iOIl = z;
                }

                public void setBaselineAlignedChildIndex(int i) {
/* 1 */             if (i >= 0 && i < getChildCount()) {
/* 9 */                 this.I00iiI = i;
/* 11 */                return;
                    }
/* 77 */            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
                }

                public void setDividerDrawable(Drawable drawable) {
/* 3 */             if (drawable == this.I00li1OI) {
/* 5 */                 return;
                    }
/* 6 */             this.I00li1OI = drawable;
/* 9 */             if (drawable != null) {
/* 15 */                this.I00ll1 = drawable.getIntrinsicWidth();
/* 21 */                this.I00lli11 = drawable.getIntrinsicHeight();
                    } else {
/* 24 */                this.I00ll1 = 0;
/* 26 */                this.I00lli11 = 0;
                    }
/* 31 */            setWillNotDraw(drawable == null);
/* 34 */            requestLayout();
                }

                public void setDividerPadding(int i) {
/* 1 */             this.I00o0iI0io1 = i;
                }

                public void setGravity(int i) {
/* 3 */             if (this.I00ilI0I1 != i) {
/* 9 */                 if ((8388615 & i) == 0) {
/* 14 */                    i |= 8388611;
                        }
/* 17 */                if ((i & 112) == 0) {
/* 19 */                    i |= 48;
                        }
/* 21 */                this.I00ilI0I1 = i;
/* 23 */                requestLayout();
                    }
                }

                public void setHorizontalGravity(int i) {
/* 4 */             int i2 = i & 8388615;
/* 5 */             int i3 = this.I00ilI0I1;
/* 8 */             if ((8388615 & i3) != i2) {
/* 15 */                this.I00ilI0I1 = i2 | ((-8388616) & i3);
/* 17 */                requestLayout();
                    }
                }

                public void setMeasureWithLargestChildEnabled(boolean z) {
/* 1 */             this.I00ioIO = z;
                }

                public void setOrientation(int i) {
/* 3 */             if (this.I00iio != i) {
/* 5 */                 this.I00iio = i;
/* 7 */                 requestLayout();
                    }
                }

                public void setShowDividers(int i) {
/* 3 */             if (i != this.I00lll10) {
/* 5 */                 requestLayout();
                    }
/* 8 */             this.I00lll10 = i;
                }

                public void setVerticalGravity(int i) {
/* 1 */             int i2 = i & 112;
/* 3 */             int i3 = this.I00ilI0I1;
/* 7 */             if ((i3 & 112) != i2) {
/* 12 */                this.I00ilI0I1 = i2 | (i3 & (-113));
/* 14 */                requestLayout();
                    }
                }

                public void setWeightSum(float f) {
/* 6 */             this.I00io1l = Math.max(0.0f, f);
                }

                @Override
                public final boolean shouldDelayChildPressedState() {
/* 1 */             return false;
                }
            }

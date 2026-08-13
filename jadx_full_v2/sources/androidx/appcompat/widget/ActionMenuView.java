            package androidx.appcompat.widget;

            import android.content.Context;
            import android.content.res.Configuration;
            import android.graphics.drawable.Drawable;
            import android.text.TextUtils;
            import android.util.AttributeSet;
            import android.view.ContextThemeWrapper;
            import android.view.KeyEvent;
            import android.view.Menu;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.accessibility.AccessibilityEvent;
            import android.widget.LinearLayout;
            import androidx.appcompat.view.menu.ActionMenuItemView;
            import java.lang.invoke.VarHandle;
            import p000.I0I1IlI1;
            import p000.I0I1iI;
            import p000.I0I1ii0i;
            import p000.I0I1ioli;
            import p000.I0I1lII000I;
            import p000.I0I1lIio;
            import p000.IIlIOloOOO;
            import p000.O0ooII1;
            import p000.O0ooIOIo;
            import p000.O1OIll00i;
            import p000.O1ilOO;
            import p000.O1illlIiilIl;
            import p000.O1ioIIl;
            import p000.O1l0lOll00;
            import p000.Oi00IilOloo0;
            import p000.l1I0oI;
            
/* 9 */     public class ActionMenuView extends O0ooIOIo implements O1ilOO, O1l0lOll00 {
                public O1illlIiilIl I00o0l1o1o0;
                public Context I00o101lO;
                public int I00oI0i;
                public boolean I00oII;
                public I0I1ii0i I00oIiI10;
                public O1OIll00i I00oO101o;
                public boolean I00oOio10iI1;
                public int I00ol1;
                public final int I00olI;
                public final int I00oli;
                public I0I1lIio I00oliIiO01i;

                public ActionMenuView(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
/* 5 */             setBaselineAligned(false);
/* 16 */            float f = context.getResources().getDisplayMetrics().density;
/* 22 */            this.I00olI = (int) (56.0f * f);
/* 28 */            this.I00oli = (int) (f * 4.0f);
/* 30 */            this.I00o101lO = context;
/* 32 */            this.I00oI0i = 0;
                }

                public static I0I1lII000I I000OOo1O() {
/* 4 */             I0I1lII000I i0I1lII000I = new I0I1lII000I(-2, -2);
/* 8 */             i0I1lII000I.I00000oIO = false;
/* 12 */            ((LinearLayout.LayoutParams) i0I1lII000I).gravity = 16;
/* 20 */            return i0I1lII000I;
                }

                public static I0I1lII000I I000OiO(ViewGroup.LayoutParams layoutParams) {
                    I0I1lII000I i0I1lII000I;
/* 1 */             if (layoutParams == null) {
/* 33 */                return I000OOo1O();
                    }
/* 5 */             if (layoutParams instanceof I0I1lII000I) {
/* 9 */                 I0I1lII000I i0I1lII000I2 = (I0I1lII000I) layoutParams;
/* 11 */                i0I1lII000I = new I0I1lII000I(i0I1lII000I2);
/* 16 */                i0I1lII000I.I00000oIO = i0I1lII000I2.I00000oIO;
                    } else {
/* 21 */                i0I1lII000I = new I0I1lII000I(layoutParams);
                    }
/* 26 */            if (((LinearLayout.LayoutParams) i0I1lII000I).gravity <= 0) {
/* 30 */                ((LinearLayout.LayoutParams) i0I1lII000I).gravity = 16;
                    }
/* 32 */            return i0I1lII000I;
                }

                @Override
                public final boolean I00000oIO(O1ioIIl o1ioIIl) {
/* 5 */             return this.I00o0l1o1o0.I00100o1O0lo(o1ioIIl, null, 0);
                }

                @Override
                public final void I00000oOI(O1illlIiilIl o1illlIiilIl) {
/* 1 */             this.I00o0l1o1o0 = o1illlIiilIl;
                }

                @Override
                public final O0ooII1 generateDefaultLayoutParams() {
/* 1 */             return I000OOo1O();
                }

                @Override
                public final O0ooII1 generateLayoutParams(AttributeSet attributeSet) {
/* 7 */             return new I0I1lII000I(getContext(), attributeSet);
                }

                @Override
                public final O0ooII1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
/* 1 */             return I000OiO(layoutParams);
                }

                public final boolean I000iOII(int i) {
/* 1 */             boolean zI00000oOI = false;
/* 2 */             if (i == 0) {
/* 1 */                 return false;
                    }
/* 7 */             KeyEvent.Callback childAt = getChildAt(i - 1);
/* 11 */            KeyEvent.Callback childAt2 = getChildAt(i);
/* 19 */            if (i < getChildCount() && (childAt instanceof I0I1ioli)) {
/* 27 */                zI00000oOI = ((I0I1ioli) childAt).I00000oOI();
                    }
                    return (i <= 0 || !(childAt2 instanceof I0I1ioli)) ? zI00000oOI : ((I0I1ioli) childAt2).I0000Il00O() | zI00000oOI;
                }

                @Override
                public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
/* 1 */             return layoutParams instanceof I0I1lII000I;
                }

                @Override
                public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
/* 1 */             return false;
                }

                @Override
                public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
/* 1 */             return I000OOo1O();
                }

                @Override
                public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
/* 7 */             return new I0I1lII000I(getContext(), attributeSet);
                }

                public Menu getMenu() {
/* 1 */             O1illlIiilIl o1illlIiilIl = this.I00o0l1o1o0;
/* 3 */             if (o1illlIiilIl != null) {
/* 110 */               return o1illlIiilIl;
                    }
/* 5 */             Context context = getContext();
/* 11 */            O1illlIiilIl o1illlIiilIl2 = new O1illlIiilIl(context);
/* 14 */            this.I00o0l1o1o0 = o1illlIiilIl2;
/* 18 */            Oi00IilOloo0 oi00IilOloo0 = new Oi00IilOloo0();
/* 21 */            oi00IilOloo0.I00iOIl = this;
/* 23 */            VarHandle.storeStoreFence();
/* 26 */            o1illlIiilIl2.I0000oI00 = oi00IilOloo0;
/* 30 */            I0I1ii0i i0I1ii0i = new I0I1ii0i(context);
/* 33 */            this.I00oIiI10 = i0I1ii0i;
/* 36 */            i0I1ii0i.I00ll1 = true;
/* 38 */            i0I1ii0i.I00lli11 = true;
/* 47 */            i0I1ii0i.I00ilI0I1 = new l1I0oI(8);
/* 53 */            this.I00o0l1o1o0.I00000oOI(i0I1ii0i, this.I00o101lO);
/* 56 */            I0I1ii0i i0I1ii0i2 = this.I00oIiI10;
/* 58 */            i0I1ii0i2.I00ioIO = this;
/* 60 */            O1illlIiilIl o1illlIiilIl3 = i0I1ii0i2.I00iiO;
/* 62 */            this.I00o0l1o1o0 = o1illlIiilIl3;
/* 110 */           return o1illlIiilIl3;
                }

                public Drawable getOverflowIcon() {
/* 1 */             getMenu();
/* 4 */             I0I1ii0i i0I1ii0i = this.I00oIiI10;
/* 6 */             I0I1iI i0I1iI = i0I1ii0i.I00l0I0l0lO1;
/* 8 */             if (i0I1iI != null) {
/* 10 */                return i0I1iI.getDrawable();
                    }
/* 17 */            if (i0I1ii0i.I00li1OI) {
/* 19 */                return i0I1ii0i.I00l0OO0IO;
                    }
/* 22 */            return null;
                }

                public int getPopupTheme() {
/* 1 */             return this.I00oI0i;
                }

                public int getWindowAnimations() {
/* 1 */             return 0;
                }

                @Override
                public final void onConfigurationChanged(Configuration configuration) {
/* 1 */             super.onConfigurationChanged(configuration);
/* 4 */             I0I1ii0i i0I1ii0i = this.I00oIiI10;
/* 6 */             if (i0I1ii0i != null) {
/* 8 */                 i0I1ii0i.I000OOo1O();
/* 17 */                if (this.I00oIiI10.I000OiO()) {
/* 21 */                    this.I00oIiI10.I0001Ioi1lo();
/* 26 */                    this.I00oIiI10.I000l1();
                        }
                    }
                }

                @Override
                public final void onDetachedFromWindow() {
/* 1 */             super.onDetachedFromWindow();
/* 4 */             I0I1ii0i i0I1ii0i = this.I00oIiI10;
/* 6 */             if (i0I1ii0i != null) {
/* 8 */                 i0I1ii0i.I0001Ioi1lo();
/* 11 */                I0I1IlI1 i0I1IlI1 = i0I1ii0i.I00oIiI10;
/* 13 */                if (i0I1IlI1 == null || !i0I1IlI1.I00000oOI()) {
/* 55 */                    return;
                        }
/* 23 */                i0I1IlI1.I000OOo1O.dismiss();
                    }
                }

                @Override
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
                    int width;
                    int paddingLeft;
/* 5 */             if (!this.I00oOio10iI1) {
/* 7 */                 super.onLayout(z, i, i2, i3, i4);
/* 10 */                return;
                    }
/* 11 */            int childCount = getChildCount();
/* 17 */            int i5 = (i4 - i2) / 2;
/* 19 */            int dividerWidth = getDividerWidth();
/* 23 */            int i6 = i3 - i;
/* 35 */            int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
/* 45 */            boolean z2 = getLayoutDirection() == 1;
/* 47 */            int i7 = 0;
/* 48 */            int i8 = 0;
/* 51 */            for (int i9 = 0; i9 < childCount; i9++) {
/* 53 */                View childAt = getChildAt(i9);
/* 61 */                if (childAt.getVisibility() != 8) {
/* 68 */                    I0I1lII000I i0I1lII000I = (I0I1lII000I) childAt.getLayoutParams();
/* 72 */                    if (i0I1lII000I.I00000oIO) {
/* 74 */                        int measuredWidth = childAt.getMeasuredWidth();
/* 82 */                        if (I000iOII(i9)) {
/* 84 */                            measuredWidth += dividerWidth;
                                }
/* 85 */                        int measuredHeight = childAt.getMeasuredHeight();
/* 89 */                        if (z2) {
/* 97 */                            paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) i0I1lII000I).leftMargin;
/* 98 */                            width = paddingLeft + measuredWidth;
                                } else {
/* 113 */                           width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) i0I1lII000I).rightMargin;
/* 115 */                           paddingLeft = width - measuredWidth;
                                }
/* 119 */                       int i10 = i5 - (measuredHeight / 2);
/* 122 */                       childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
/* 125 */                       paddingRight -= measuredWidth;
/* 126 */                       i7 = 1;
                            } else {
/* 138 */                       paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) i0I1lII000I).leftMargin) + ((LinearLayout.LayoutParams) i0I1lII000I).rightMargin;
/* 139 */                       I000iOII(i9);
/* 142 */                       i8++;
                            }
                        }
                    }
/* 147 */           if (childCount == 1 && i7 == 0) {
/* 152 */               View childAt2 = getChildAt(0);
/* 156 */               int measuredWidth2 = childAt2.getMeasuredWidth();
/* 160 */               int measuredHeight2 = childAt2.getMeasuredHeight();
/* 168 */               int i11 = (i6 / 2) - (measuredWidth2 / 2);
/* 171 */               int i12 = i5 - (measuredHeight2 / 2);
/* 174 */               childAt2.layout(i11, i12, measuredWidth2 + i11, measuredHeight2 + i12);
/* 177 */               return;
                    }
/* 180 */           int i13 = i8 - (i7 ^ 1);
/* 189 */           int iMax = Math.max(0, i13 > 0 ? paddingRight / i13 : 0);
/* 193 */           if (z2) {
/* 203 */               int width2 = getWidth() - getPaddingRight();
/* 205 */               for (int i14 = 0; i14 < childCount; i14++) {
/* 207 */                   View childAt3 = getChildAt(i14);
/* 215 */                   I0I1lII000I i0I1lII000I2 = (I0I1lII000I) childAt3.getLayoutParams();
/* 221 */                   if (childAt3.getVisibility() != 8 && !i0I1lII000I2.I00000oIO) {
/* 230 */                       int i15 = width2 - ((LinearLayout.LayoutParams) i0I1lII000I2).rightMargin;
/* 231 */                       int measuredWidth3 = childAt3.getMeasuredWidth();
/* 235 */                       int measuredHeight3 = childAt3.getMeasuredHeight();
/* 241 */                       int i16 = i5 - (measuredHeight3 / 2);
/* 246 */                       childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
/* 253 */                       width2 = i15 - ((measuredWidth3 + ((LinearLayout.LayoutParams) i0I1lII000I2).leftMargin) + iMax);
                            }
                        }
/* 399 */               return;
                    }
/* 257 */           int paddingLeft2 = getPaddingLeft();
/* 262 */           for (int i17 = 0; i17 < childCount; i17++) {
/* 264 */               View childAt4 = getChildAt(i17);
/* 272 */               I0I1lII000I i0I1lII000I3 = (I0I1lII000I) childAt4.getLayoutParams();
/* 278 */               if (childAt4.getVisibility() != 8 && !i0I1lII000I3.I00000oIO) {
/* 287 */                   int i18 = paddingLeft2 + ((LinearLayout.LayoutParams) i0I1lII000I3).leftMargin;
/* 288 */                   int measuredWidth4 = childAt4.getMeasuredWidth();
/* 292 */                   int measuredHeight4 = childAt4.getMeasuredHeight();
/* 298 */                   int i19 = i5 - (measuredHeight4 / 2);
/* 303 */                   childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
/* 308 */                   paddingLeft2 = IIlIOloOOO.I0000Il00O(measuredWidth4, ((LinearLayout.LayoutParams) i0I1lII000I3).rightMargin, iMax, i18);
                        }
                    }
                }

                /* JADX WARN: Type inference failed for: r11v15 */
                /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r11v18 */
                /* JADX WARN: Type inference failed for: r11v41 */
                @Override
                public final void onMeasure(int i, int i2) {
                    int i3;
                    int i4;
                    ?? r11;
                    int i5;
                    int i6;
                    O1illlIiilIl o1illlIiilIl;
/* 3 */             boolean z = this.I00oOio10iI1;
/* 17 */            boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
/* 18 */            this.I00oOio10iI1 = z2;
/* 20 */            if (z != z2) {
/* 22 */                this.I00ol1 = 0;
                    }
/* 24 */            int size = View.MeasureSpec.getSize(i);
/* 30 */            if (this.I00oOio10iI1 && (o1illlIiilIl = this.I00o0l1o1o0) != null && size != this.I00ol1) {
/* 40 */                this.I00ol1 = size;
/* 42 */                o1illlIiilIl.I00100l0(true);
                    }
/* 45 */            int childCount = getChildCount();
/* 51 */            if (!this.I00oOio10iI1 || childCount <= 0) {
/* 767 */               for (int i7 = 0; i7 < childCount; i7++) {
/* 777 */                   I0I1lII000I i0I1lII000I = (I0I1lII000I) getChildAt(i7).getLayoutParams();
/* 780 */                   ((LinearLayout.LayoutParams) i0I1lII000I).rightMargin = 0;
/* 782 */                   ((LinearLayout.LayoutParams) i0I1lII000I).leftMargin = 0;
                        }
/* 787 */               super.onMeasure(i, i2);
/* 900 */               return;
                    }
/* 55 */            int mode = View.MeasureSpec.getMode(i2);
/* 59 */            int size2 = View.MeasureSpec.getSize(i);
/* 63 */            int size3 = View.MeasureSpec.getSize(i2);
/* 75 */            int paddingRight = getPaddingRight() + getPaddingLeft();
/* 84 */            int paddingBottom = getPaddingBottom() + getPaddingTop();
/* 88 */            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
/* 92 */            int i8 = size2 - paddingRight;
/* 93 */            int i9 = this.I00olI;
/* 95 */            int i10 = i8 / i9;
/* 97 */            int i11 = i8 % i9;
/* 99 */            if (i10 == 0) {
/* 101 */               setMeasuredDimension(i8, 0);
/* 104 */               return;
                    }
/* 106 */           int i12 = (i11 / i10) + i9;
/* 107 */           int childCount2 = getChildCount();
/* 111 */           int iMax = 0;
/* 112 */           int i13 = 0;
/* 113 */           int iMax2 = 0;
/* 114 */           int i14 = 0;
/* 115 */           boolean z3 = false;
/* 116 */           int i15 = 0;
/* 120 */           long j = 0;
                    while (true) {
/* 122 */               i3 = this.I00oli;
/* 124 */               if (i14 >= childCount2) {
                            break;
                        }
/* 126 */               View childAt = getChildAt(i14);
/* 130 */               int i16 = size3;
/* 136 */               int i17 = paddingBottom;
/* 140 */               if (childAt.getVisibility() == 8) {
/* 142 */                   i5 = i12;
                        } else {
/* 146 */                   boolean z4 = childAt instanceof ActionMenuItemView;
/* 148 */                   i13++;
/* 151 */                   if (z4) {
/* 153 */                       childAt.setPadding(i3, 0, i3, 0);
                            }
/* 160 */                   I0I1lII000I i0I1lII000I2 = (I0I1lII000I) childAt.getLayoutParams();
/* 162 */                   i0I1lII000I2.I0001Ioi1lo = false;
/* 164 */                   i0I1lII000I2.I0000Il00O = 0;
/* 166 */                   i0I1lII000I2.I00000oOI = 0;
/* 168 */                   i0I1lII000I2.I0000O = false;
/* 170 */                   ((LinearLayout.LayoutParams) i0I1lII000I2).leftMargin = 0;
/* 172 */                   ((LinearLayout.LayoutParams) i0I1lII000I2).rightMargin = 0;
/* 192 */                   i0I1lII000I2.I0000oI00 = z4 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
/* 200 */                   int i18 = i0I1lII000I2.I00000oIO ? 1 : i10;
/* 209 */                   I0I1lII000I i0I1lII000I3 = (I0I1lII000I) childAt.getLayoutParams();
/* 215 */                   int i19 = i10;
/* 219 */                   i5 = i12;
/* 225 */                   int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i17, View.MeasureSpec.getMode(childMeasureSpec));
/* 235 */                   ActionMenuItemView actionMenuItemView = z4 ? (ActionMenuItemView) childAt : null;
/* 250 */                   boolean z5 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
/* 251 */                   boolean z6 = z5;
/* 253 */                   if (i18 <= 0 || (z5 && i18 < 2)) {
/* 290 */                       i6 = 0;
                            } else {
/* 268 */                       childAt.measure(View.MeasureSpec.makeMeasureSpec(i5 * i18, Integer.MIN_VALUE), iMakeMeasureSpec);
/* 271 */                       int measuredWidth = childAt.getMeasuredWidth();
/* 275 */                       i6 = measuredWidth / i5;
/* 279 */                       if (measuredWidth % i5 != 0) {
/* 281 */                           i6++;
                                }
/* 283 */                       if (z6 && i6 < 2) {
/* 288 */                           i6 = 2;
                                }
                            }
/* 300 */                   i0I1lII000I3.I0000O = !i0I1lII000I3.I00000oIO && z6;
/* 302 */                   i0I1lII000I3.I00000oOI = i6;
/* 312 */                   childAt.measure(View.MeasureSpec.makeMeasureSpec(i6 * i5, 1073741824), iMakeMeasureSpec);
/* 315 */                   iMax2 = Math.max(iMax2, i6);
/* 321 */                   if (i0I1lII000I2.I0000O) {
/* 323 */                       i15++;
                            }
/* 327 */                   if (i0I1lII000I2.I00000oIO) {
/* 329 */                       z3 = true;
                            }
/* 330 */                   i10 = i19 - i6;
/* 336 */                   iMax = Math.max(iMax, childAt.getMeasuredHeight());
/* 341 */                   if (i6 == 1) {
/* 346 */                       j |= 1 << i14;
                            }
                        }
/* 348 */               i14++;
/* 350 */               size3 = i16;
/* 352 */               paddingBottom = i17;
/* 354 */               i12 = i5;
                    }
/* 359 */           int i20 = size3;
/* 361 */           int i21 = i10;
/* 363 */           int i22 = i12;
/* 372 */           boolean z7 = z3 && i13 == 2;
/* 373 */           int i23 = i21;
/* 375 */           boolean z8 = false;
/* 378 */           while (i15 > 0 && i23 > 0) {
/* 382 */               int i24 = Integer.MAX_VALUE;
/* 385 */               long j2 = 0;
/* 387 */               int i25 = 0;
/* 388 */               int i26 = 0;
/* 389 */               while (i26 < childCount2) {
/* 399 */                   int i27 = iMax;
/* 403 */                   I0I1lII000I i0I1lII000I4 = (I0I1lII000I) getChildAt(i26).getLayoutParams();
/* 405 */                   boolean z9 = z7;
/* 409 */                   if (i0I1lII000I4.I0000O) {
/* 412 */                       int i28 = i0I1lII000I4.I00000oOI;
/* 414 */                       if (i28 < i24) {
/* 416 */                           j2 = 1 << i26;
/* 418 */                           i24 = i28;
/* 419 */                           i25 = 1;
                                } else if (i28 == i24) {
/* 425 */                           j2 |= 1 << i26;
/* 427 */                           i25++;
                                }
                            }
/* 430 */                   i26++;
/* 432 */                   z7 = z9;
/* 434 */                   iMax = i27;
                        }
/* 437 */               i4 = iMax;
/* 439 */               boolean z10 = z7;
/* 441 */               j |= j2;
/* 443 */               if (i25 > i23) {
                            break;
                        }
/* 448 */               int i29 = i24 + 1;
/* 450 */               int i30 = 0;
/* 451 */               while (i30 < childCount2) {
/* 453 */                   View childAt2 = getChildAt(i30);
/* 461 */                   I0I1lII000I i0I1lII000I5 = (I0I1lII000I) childAt2.getLayoutParams();
/* 467 */                   boolean z11 = z3;
/* 465 */                   long j3 = 1 << i30;
/* 474 */                   if ((j2 & j3) != 0) {
/* 483 */                       if (z10 && i0I1lII000I5.I0000oI00) {
/* 489 */                           r11 = 1;
/* 489 */                           r11 = 1;
/* 490 */                           if (i23 == 1) {
/* 495 */                               childAt2.setPadding(i3 + i22, 0, i3, 0);
                                    }
                                } else {
/* 499 */                           r11 = 1;
                                }
                                i0I1lII000I5.I00000oOI += r11;
/* 505 */                       i0I1lII000I5.I0001Ioi1lo = r11;
                                i23--;
                            } else if (i0I1lII000I5.I00000oOI == i29) {
/* 480 */                       j |= j3;
                            }
/* 509 */                   i30++;
/* 511 */                   z3 = z11;
                        }
/* 514 */               z7 = z10;
/* 516 */               iMax = i4;
/* 518 */               z8 = true;
                    }
/* 521 */           i4 = iMax;
/* 531 */           boolean z12 = !z3 && i13 == 1;
/* 532 */           if (i23 > 0 && j != 0 && (i23 < i13 - 1 || z12 || iMax2 > 1)) {
/* 545 */               float fBitCount = Long.bitCount(j);
/* 550 */               if (!z12) {
/* 558 */                   if ((j & 1) != 0 && !((I0I1lII000I) getChildAt(0).getLayoutParams()).I0000oI00) {
/* 575 */                       fBitCount -= 0.5f;
                            }
                            int i31 = childCount2 - 1;
/* 587 */                   if ((j & (1 << i31)) != 0 && !((I0I1lII000I) getChildAt(i31).getLayoutParams()).I0000oI00) {
/* 603 */                       fBitCount -= 0.5f;
                            }
                        }
/* 615 */               int i32 = fBitCount > 0.0f ? (int) ((i23 * i22) / fBitCount) : 0;
/* 616 */               boolean z13 = z8;
/* 618 */               for (int i33 = 0; i33 < childCount2; i33++) {
/* 629 */                   if ((j & (1 << i33)) != 0) {
/* 635 */                       View childAt3 = getChildAt(i33);
/* 643 */                       I0I1lII000I i0I1lII000I6 = (I0I1lII000I) childAt3.getLayoutParams();
/* 647 */                       if (childAt3 instanceof ActionMenuItemView) {
/* 649 */                           i0I1lII000I6.I0000Il00O = i32;
/* 652 */                           i0I1lII000I6.I0001Ioi1lo = true;
/* 654 */                           if (i33 == 0 && !i0I1lII000I6.I0000oI00) {
/* 665 */                               ((LinearLayout.LayoutParams) i0I1lII000I6).leftMargin = (-i32) / 2;
                                    }
/* 670 */                           z13 = true;
                                } else if (i0I1lII000I6.I00000oIO) {
/* 679 */                           i0I1lII000I6.I0000Il00O = i32;
/* 682 */                           i0I1lII000I6.I0001Ioi1lo = true;
/* 687 */                           ((LinearLayout.LayoutParams) i0I1lII000I6).rightMargin = (-i32) / 2;
/* 689 */                           z13 = true;
                                } else {
/* 692 */                           if (i33 != 0) {
/* 696 */                               ((LinearLayout.LayoutParams) i0I1lII000I6).leftMargin = i32 / 2;
                                    }
/* 700 */                           if (i33 != childCount2 - 1) {
/* 704 */                               ((LinearLayout.LayoutParams) i0I1lII000I6).rightMargin = i32 / 2;
                                    }
                                }
                            }
                        }
/* 709 */               z8 = z13;
                    }
/* 710 */           if (z8) {
/* 713 */               for (int i34 = 0; i34 < childCount2; i34++) {
/* 715 */                   View childAt4 = getChildAt(i34);
/* 723 */                   I0I1lII000I i0I1lII000I7 = (I0I1lII000I) childAt4.getLayoutParams();
/* 727 */                   if (i0I1lII000I7.I0001Ioi1lo) {
/* 745 */                       childAt4.measure(View.MeasureSpec.makeMeasureSpec((i0I1lII000I7.I00000oOI * i22) + i0I1lII000I7.I0000Il00O, 1073741824), childMeasureSpec);
                            }
                        }
                    }
/* 760 */           setMeasuredDimension(i8, mode != 1073741824 ? i4 : i20);
                }

                public void setExpandedActionViewsExclusive(boolean z) {
/* 3 */             this.I00oIiI10.I00o101lO = z;
                }

                public void setOnMenuItemClickListener(I0I1lIio i0I1lIio) {
/* 1 */             this.I00oliIiO01i = i0I1lIio;
                }

                public void setOverflowIcon(Drawable drawable) {
/* 1 */             getMenu();
/* 4 */             I0I1ii0i i0I1ii0i = this.I00oIiI10;
/* 6 */             I0I1iI i0I1iI = i0I1ii0i.I00l0I0l0lO1;
/* 8 */             if (i0I1iI != null) {
/* 10 */                i0I1iI.setImageDrawable(drawable);
                    } else {
/* 15 */                i0I1ii0i.I00li1OI = true;
/* 17 */                i0I1ii0i.I00l0OO0IO = drawable;
                    }
                }

                public void setOverflowReserved(boolean z) {
/* 1 */             this.I00oII = z;
                }

                public void setPopupTheme(int i) {
/* 3 */             if (this.I00oI0i != i) {
/* 5 */                 this.I00oI0i = i;
/* 7 */                 if (i == 0) {
/* 13 */                    this.I00o101lO = getContext();
                        } else {
/* 25 */                    this.I00o101lO = new ContextThemeWrapper(getContext(), i);
                        }
                    }
                }

                public void setPresenter(I0I1ii0i i0I1ii0i) {
/* 1 */             this.I00oIiI10 = i0I1ii0i;
/* 3 */             i0I1ii0i.I00ioIO = this;
/* 7 */             this.I00o0l1o1o0 = i0I1ii0i.I00iiO;
                }

                @Override
/* 10 */        public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
/* 11 */            return I000OiO(layoutParams);
                }

/* 34 */        public ActionMenuView(Context context) {
/* 35 */            this(context, null);
                }
            }

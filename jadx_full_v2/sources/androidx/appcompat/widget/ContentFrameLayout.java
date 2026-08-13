            package androidx.appcompat.widget;

            import android.content.Context;
            import android.graphics.Rect;
            import android.util.AttributeSet;
            import android.util.DisplayMetrics;
            import android.util.TypedValue;
            import android.view.View;
            import android.widget.FrameLayout;
            import p000.I0I1IlI1;
            import p000.I0I1ii0i;
            import p000.I11oi01ll;
            import p000.IOoO01o;
            import p000.O1illlIiilIl;
            import p000.Oi00IilOloo0;
            import p000.Oo1ilOl;
            import p000.OoolOO;
            
/* 11 */    public class ContentFrameLayout extends FrameLayout {
                public TypedValue I00iOIl;
                public TypedValue I00iiI;
                public TypedValue I00iiO;
                public TypedValue I00iio;
                public TypedValue I00ilI0I1;
                public TypedValue I00ilO0;
                public final Rect I00io1l;
                public IOoO01o I00ioIO;

                public ContentFrameLayout(Context context, AttributeSet attributeSet) {
/* 2 */             super(context, attributeSet, 0);
/* 10 */            this.I00io1l = new Rect();
                }

                public TypedValue getFixedHeightMajor() {
/* 1 */             TypedValue typedValue = this.I00ilI0I1;
/* 3 */             if (typedValue != null) {
/* 20 */                return typedValue;
                    }
/* 7 */             TypedValue typedValue2 = new TypedValue();
/* 10 */            this.I00ilI0I1 = typedValue2;
/* 20 */            return typedValue2;
                }

                public TypedValue getFixedHeightMinor() {
/* 1 */             TypedValue typedValue = this.I00ilO0;
/* 3 */             if (typedValue != null) {
/* 20 */                return typedValue;
                    }
/* 7 */             TypedValue typedValue2 = new TypedValue();
/* 10 */            this.I00ilO0 = typedValue2;
/* 20 */            return typedValue2;
                }

                public TypedValue getFixedWidthMajor() {
/* 1 */             TypedValue typedValue = this.I00iiO;
/* 3 */             if (typedValue != null) {
/* 20 */                return typedValue;
                    }
/* 7 */             TypedValue typedValue2 = new TypedValue();
/* 10 */            this.I00iiO = typedValue2;
/* 20 */            return typedValue2;
                }

                public TypedValue getFixedWidthMinor() {
/* 1 */             TypedValue typedValue = this.I00iio;
/* 3 */             if (typedValue != null) {
/* 20 */                return typedValue;
                    }
/* 7 */             TypedValue typedValue2 = new TypedValue();
/* 10 */            this.I00iio = typedValue2;
/* 20 */            return typedValue2;
                }

                public TypedValue getMinWidthMajor() {
/* 1 */             TypedValue typedValue = this.I00iOIl;
/* 3 */             if (typedValue != null) {
/* 20 */                return typedValue;
                    }
/* 7 */             TypedValue typedValue2 = new TypedValue();
/* 10 */            this.I00iOIl = typedValue2;
/* 20 */            return typedValue2;
                }

                public TypedValue getMinWidthMinor() {
/* 1 */             TypedValue typedValue = this.I00iiI;
/* 3 */             if (typedValue != null) {
/* 20 */                return typedValue;
                    }
/* 7 */             TypedValue typedValue2 = new TypedValue();
/* 10 */            this.I00iiI = typedValue2;
/* 20 */            return typedValue2;
                }

                @Override
                public final void onAttachedToWindow() {
/* 1 */             super.onAttachedToWindow();
/* 4 */             IOoO01o iOoO01o = this.I00ioIO;
/* 6 */             if (iOoO01o != null) {
/* 8 */                 iOoO01o.getClass();
                    }
                }

                @Override
                public final void onDetachedFromWindow() {
                    I0I1ii0i i0I1ii0i;
/* 1 */             super.onDetachedFromWindow();
/* 4 */             IOoO01o iOoO01o = this.I00ioIO;
/* 6 */             if (iOoO01o != null) {
/* 12 */                I11oi01ll i11oi01ll = (I11oi01ll) ((Oi00IilOloo0) iOoO01o).I00iOIl;
/* 14 */                ActionBarOverlayLayout actionBarOverlayLayout = i11oi01ll.I00lll10;
/* 16 */                if (actionBarOverlayLayout != null) {
/* 18 */                    actionBarOverlayLayout.I000iOII();
/* 27 */                    ActionMenuView actionMenuView = ((Oo1ilOl) actionBarOverlayLayout.I00ilI0I1).I00000oIO.I00iOIl;
/* 29 */                    if (actionMenuView != null && (i0I1ii0i = actionMenuView.I00oIiI10) != null) {
/* 35 */                        i0I1ii0i.I0001Ioi1lo();
/* 38 */                        I0I1IlI1 i0I1IlI1 = i0I1ii0i.I00oIiI10;
/* 40 */                        if (i0I1IlI1 != null && i0I1IlI1.I00000oOI()) {
/* 50 */                            i0I1IlI1.I000OOo1O.dismiss();
                                }
                            }
                        }
/* 55 */                if (i11oi01ll.I00oII != null) {
/* 65 */                    i11oi01ll.I00l0I0l0lO1.getDecorView().removeCallbacks(i11oi01ll.I00oIiI10);
/* 74 */                    if (i11oi01ll.I00oII.isShowing()) {
                                try {
/* 78 */                            i11oi01ll.I00oII.dismiss();
                                } catch (IllegalArgumentException unused) {
                                }
                            }
/* 82 */                    i11oi01ll.I00oII = null;
                        }
/* 84 */                OoolOO ooolOO = i11oi01ll.I00oO101o;
/* 86 */                if (ooolOO != null) {
/* 88 */                    ooolOO.I00000oOI();
                        }
/* 96 */                O1illlIiilIl o1illlIiilIl = i11oi01ll.I001i1O0Ol(0).I000O01llI0;
/* 98 */                if (o1illlIiilIl != null) {
/* 101 */                   o1illlIiilIl.I0000Il00O(true);
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
                /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
                /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
                /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
                /* JADX WARN: Removed duplicated region for block: B:58:0x00de  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void onMeasure(int i, int i2) {
                    int iMakeMeasureSpec;
                    boolean z;
                    int iMakeMeasureSpec2;
                    int i3;
                    int i4;
                    float fraction;
                    int i5;
                    int i6;
                    float fraction2;
                    int i7;
                    int i8;
                    float fraction3;
/* 11 */            DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
/* 19 */            boolean z2 = true;
/* 25 */            boolean z3 = displayMetrics.widthPixels < displayMetrics.heightPixels;
/* 26 */            int mode = View.MeasureSpec.getMode(i);
/* 30 */            int mode2 = View.MeasureSpec.getMode(i2);
/* 34 */            Rect rect = this.I00io1l;
/* 42 */            if (mode != Integer.MIN_VALUE) {
/* 99 */                iMakeMeasureSpec = i;
/* 101 */               z = false;
                    } else {
/* 49 */                TypedValue typedValue = z3 ? this.I00iio : this.I00iiO;
/* 51 */                if (typedValue != null && (i7 = typedValue.type) != 0) {
/* 57 */                    if (i7 == 5) {
/* 59 */                        fraction3 = typedValue.getDimension(displayMetrics);
                            } else if (i7 == 6) {
/* 67 */                        int i9 = displayMetrics.widthPixels;
/* 71 */                        fraction3 = typedValue.getFraction(i9, i9);
                            } else {
/* 76 */                        i8 = 0;
/* 77 */                        if (i8 <= 0) {
/* 93 */                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i8 - (rect.left + rect.right), View.MeasureSpec.getSize(i)), 1073741824);
/* 97 */                            z = true;
                                }
                            }
/* 63 */                    i8 = (int) fraction3;
/* 77 */                    if (i8 <= 0) {
                            }
                        }
                    }
/* 102 */           if (mode2 != Integer.MIN_VALUE) {
/* 158 */               iMakeMeasureSpec2 = i2;
                    } else {
/* 109 */               TypedValue typedValue2 = z3 ? this.I00ilI0I1 : this.I00ilO0;
/* 111 */               if (typedValue2 != null && (i5 = typedValue2.type) != 0) {
/* 117 */                   if (i5 == 5) {
/* 119 */                       fraction2 = typedValue2.getDimension(displayMetrics);
                            } else if (i5 == 6) {
/* 127 */                       int i10 = displayMetrics.heightPixels;
/* 131 */                       fraction2 = typedValue2.getFraction(i10, i10);
                            } else {
/* 136 */                       i6 = 0;
/* 137 */                       if (i6 <= 0) {
/* 153 */                           iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i6 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i2)), 1073741824);
                                }
                            }
/* 123 */                   i6 = (int) fraction2;
/* 137 */                   if (i6 <= 0) {
                            }
                        }
                    }
/* 160 */           super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec2);
/* 163 */           int measuredWidth = getMeasuredWidth();
/* 167 */           int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
/* 171 */           if (z || mode != Integer.MIN_VALUE) {
/* 223 */               z2 = false;
                    } else {
/* 180 */               TypedValue typedValue3 = z3 ? this.I00iiI : this.I00iOIl;
/* 182 */               if (typedValue3 != null && (i3 = typedValue3.type) != 0) {
/* 188 */                   if (i3 == 5) {
/* 190 */                       fraction = typedValue3.getDimension(displayMetrics);
                            } else if (i3 == 6) {
/* 198 */                       int i11 = displayMetrics.widthPixels;
/* 202 */                       fraction = typedValue3.getFraction(i11, i11);
                            } else {
/* 207 */                       i4 = 0;
/* 208 */                       if (i4 > 0) {
/* 215 */                           i4 -= rect.left + rect.right;
                                }
/* 216 */                       if (measuredWidth >= i4) {
/* 218 */                           iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                                }
                            }
/* 194 */                   i4 = (int) fraction;
/* 208 */                   if (i4 > 0) {
                            }
/* 216 */                   if (measuredWidth >= i4) {
                            }
                        }
                    }
/* 224 */           if (z2) {
/* 226 */               super.onMeasure(iMakeMeasureSpec3, iMakeMeasureSpec2);
                    }
                }

                public void setAttachListener(IOoO01o iOoO01o) {
/* 1 */             this.I00ioIO = iOoO01o;
                }

/* 12 */        public ContentFrameLayout(Context context) {
/* 13 */            this(context, null);
                }
            }

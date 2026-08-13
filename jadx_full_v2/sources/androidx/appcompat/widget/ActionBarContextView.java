            package androidx.appcompat.widget;

            import android.content.Context;
            import android.content.res.Configuration;
            import android.content.res.TypedArray;
            import android.text.TextUtils;
            import android.util.AttributeSet;
            import android.util.TypedValue;
            import android.view.ContextThemeWrapper;
            import android.view.LayoutInflater;
            import android.view.MotionEvent;
            import android.view.View;
            import android.view.ViewGroup;
            import android.widget.LinearLayout;
            import android.widget.TextView;
            import com.box.gallery.R;
            import java.lang.invoke.VarHandle;
            import p000.I000II;
            import p000.I00IOO;
            import p000.I0I0o01l;
            import p000.I0I1IlI1;
            import p000.I0I1ii0i;
            import p000.I0I1liIO0ii;
            import p000.O1illlIiilIl;
            import p000.O1l0lOll00;
            import p000.OOilOli0;
            import p000.OooiOl0ioo0i;
            import p000.OoolOO;
            import p000.iOO0oOI1Ol;
            
/* 120 */   public class ActionBarContextView extends ViewGroup {
                public final I00IOO I00iOIl;
                public final Context I00iiI;
                public ActionMenuView I00iiO;
                public I0I1ii0i I00iio;
                public int I00ilI0I1;
                public OoolOO I00ilO0;
                public boolean I00io1l;
                public boolean I00ioIO;
                public CharSequence I00l0I0l0lO1;
                public CharSequence I00l0OO0IO;
                public View I00li1OI;
                public View I00ll1;
                public View I00lli11;
                public LinearLayout I00lll10;
                public TextView I00o0iI0io1;
                public TextView I00o0l1o1o0;
                public final int I00o101lO;
                public final int I00oI0i;
                public boolean I00oII;
                public final int I00oIiI10;

                public ActionBarContextView(Context context, AttributeSet attributeSet) {
                    int resourceId;
/* 4 */             super(context, attributeSet, R.attr.actionModeStyle);
/* 9 */             I00IOO i00ioo = new I00IOO();
/* 12 */            i00ioo.I0000Il00O = this;
/* 15 */            i00ioo.I00000oIO = false;
/* 17 */            VarHandle.storeStoreFence();
/* 20 */            this.I00iOIl = i00ioo;
/* 24 */            TypedValue typedValue = new TypedValue();
/* 39 */            if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
/* 55 */                this.I00iiI = context;
                    } else {
/* 52 */                this.I00iiI = new ContextThemeWrapper(context, typedValue.resourceId);
                    }
/* 59 */            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OOilOli0.I0000O, R.attr.actionModeStyle, 0);
/* 84 */            setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : iOO0oOI1Ol.I00000oIO(context, resourceId));
/* 92 */            this.I00o101lO = typedArrayObtainStyledAttributes.getResourceId(5, 0);
/* 99 */            this.I00oI0i = typedArrayObtainStyledAttributes.getResourceId(4, 0);
/* 106 */           this.I00ilI0I1 = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
/* 116 */           this.I00oIiI10 = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
/* 118 */           typedArrayObtainStyledAttributes.recycle();
                }

                public static int I0001Ioi1lo(View view, int i, int i2) {
/* 7 */             view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
/* 16 */            return Math.max(0, i - view.getMeasuredWidth());
                }

                public static int I000II(View view, int i, int i2, int i3, boolean z) {
/* 1 */             int measuredWidth = view.getMeasuredWidth();
/* 5 */             int measuredHeight = view.getMeasuredHeight();
/* 12 */            int i4 = ((i3 - measuredHeight) / 2) + i2;
/* 13 */            if (z) {
/* 18 */                view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
                    } else {
/* 25 */                view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
                    }
                    return z ? -measuredWidth : measuredWidth;
                }

                public final void I0000Il00O(I0I1liIO0ii i0I1liIO0ii) {
/* 1 */             View view = this.I00li1OI;
/* 3 */             int i = 0;
/* 4 */             if (view == null) {
/* 16 */                View viewInflate = LayoutInflater.from(getContext()).inflate(this.I00oIiI10, (ViewGroup) this, false);
/* 20 */                this.I00li1OI = viewInflate;
/* 22 */                addView(viewInflate);
                    } else if (view.getParent() == null) {
/* 34 */                addView(this.I00li1OI);
                    }
/* 42 */            View viewFindViewById = this.I00li1OI.findViewById(R.id.action_mode_close_button);
/* 46 */            this.I00ll1 = viewFindViewById;
/* 50 */            I0I0o01l i0I0o01l = new I0I0o01l(i);
/* 53 */            i0I0o01l.I00iiI = i0I1liIO0ii;
/* 55 */            VarHandle.storeStoreFence();
/* 58 */            viewFindViewById.setOnClickListener(i0I0o01l);
/* 61 */            O1illlIiilIl o1illlIiilIlI0001Ioi1lo = i0I1liIO0ii.I0001Ioi1lo();
/* 65 */            I0I1ii0i i0I1ii0i = this.I00iio;
/* 67 */            if (i0I1ii0i != null) {
/* 69 */                i0I1ii0i.I0001Ioi1lo();
/* 72 */                I0I1IlI1 i0I1IlI1 = i0I1ii0i.I00oIiI10;
/* 74 */                if (i0I1IlI1 != null && i0I1IlI1.I00000oOI()) {
/* 84 */                    i0I1IlI1.I000OOo1O.dismiss();
                        }
                    }
/* 93 */            I0I1ii0i i0I1ii0i2 = new I0I1ii0i(getContext());
/* 96 */            this.I00iio = i0I1ii0i2;
/* 99 */            i0I1ii0i2.I00ll1 = true;
/* 101 */           i0I1ii0i2.I00lli11 = true;
/* 107 */           ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
/* 114 */           o1illlIiilIlI0001Ioi1lo.I00000oOI(this.I00iio, this.I00iiI);
/* 117 */           I0I1ii0i i0I1ii0i3 = this.I00iio;
/* 119 */           O1l0lOll00 o1l0lOll00 = i0I1ii0i3.I00ioIO;
/* 121 */           if (o1l0lOll00 == null) {
/* 131 */               O1l0lOll00 o1l0lOll002 = (O1l0lOll00) i0I1ii0i3.I00iio.inflate(i0I1ii0i3.I00ilO0, (ViewGroup) this, false);
/* 133 */               i0I1ii0i3.I00ioIO = o1l0lOll002;
/* 137 */               o1l0lOll002.I00000oOI(i0I1ii0i3.I00iiO);
/* 140 */               i0I1ii0i3.I000OOo1O();
                    }
/* 143 */           O1l0lOll00 o1l0lOll003 = i0I1ii0i3.I00ioIO;
/* 145 */           if (o1l0lOll00 != o1l0lOll003) {
/* 150 */               ((ActionMenuView) o1l0lOll003).setPresenter(i0I1ii0i3);
                    }
/* 153 */           ActionMenuView actionMenuView = (ActionMenuView) o1l0lOll003;
/* 155 */           this.I00iiO = actionMenuView;
/* 158 */           actionMenuView.setBackground(null);
/* 163 */           addView(this.I00iiO, layoutParams);
                }

                public final void I0000O() {
/* 3 */             if (this.I00lll10 == null) {
/* 15 */                LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
/* 28 */                LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
/* 30 */                this.I00lll10 = linearLayout;
/* 41 */                this.I00o0iI0io1 = (TextView) linearLayout.findViewById(R.id.action_bar_title);
/* 54 */                this.I00o0l1o1o0 = (TextView) this.I00lll10.findViewById(R.id.action_bar_subtitle);
/* 56 */                int i = this.I00o101lO;
/* 58 */                if (i != 0) {
/* 66 */                    this.I00o0iI0io1.setTextAppearance(getContext(), i);
                        }
/* 69 */                int i2 = this.I00oI0i;
/* 71 */                if (i2 != 0) {
/* 79 */                    this.I00o0l1o1o0.setTextAppearance(getContext(), i2);
                        }
                    }
/* 86 */            this.I00o0iI0io1.setText(this.I00l0I0l0lO1);
/* 93 */            this.I00o0l1o1o0.setText(this.I00l0OO0IO);
/* 98 */            boolean zIsEmpty = TextUtils.isEmpty(this.I00l0I0l0lO1);
/* 104 */           boolean zIsEmpty2 = TextUtils.isEmpty(this.I00l0OO0IO);
/* 118 */           this.I00o0l1o1o0.setVisibility(!zIsEmpty2 ? 0 : 8);
/* 128 */           this.I00lll10.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
/* 137 */           if (this.I00lll10.getParent() == null) {
/* 141 */               addView(this.I00lll10);
                    }
                }

                public final void I0000oI00() {
/* 1 */             removeAllViews();
/* 5 */             this.I00lli11 = null;
/* 7 */             this.I00iiO = null;
/* 9 */             this.I00iio = null;
/* 11 */            View view = this.I00ll1;
/* 13 */            if (view != null) {
/* 15 */                view.setOnClickListener(null);
                    }
                }

                @Override
                public final void setVisibility(int i) {
/* 5 */             if (i != getVisibility()) {
/* 7 */                 OoolOO ooolOO = this.I00ilO0;
/* 9 */                 if (ooolOO != null) {
/* 11 */                    ooolOO.I00000oOI();
                        }
/* 14 */                super.setVisibility(i);
                    }
                }

                public final OoolOO I000OOo1O(int i, long j) {
/* 1 */             OoolOO ooolOO = this.I00ilO0;
/* 3 */             if (ooolOO != null) {
/* 5 */                 ooolOO.I00000oOI();
                    }
/* 8 */             I00IOO i00ioo = this.I00iOIl;
/* 11 */            if (i != 0) {
/* 46 */                OoolOO ooolOOI00000oIO = OooiOl0ioo0i.I00000oIO(this);
/* 50 */                ooolOOI00000oIO.I00000oIO(0.0f);
/* 53 */                ooolOOI00000oIO.I0000Il00O(j);
/* 60 */                ((ActionBarContextView) i00ioo.I0000Il00O).I00ilO0 = ooolOOI00000oIO;
/* 62 */                i00ioo.I00000oOI = i;
/* 64 */                ooolOOI00000oIO.I0000O(i00ioo);
/* 106 */               return ooolOOI00000oIO;
                    }
/* 17 */            if (getVisibility() != 0) {
/* 19 */                setAlpha(0.0f);
                    }
/* 22 */            OoolOO ooolOOI00000oIO2 = OooiOl0ioo0i.I00000oIO(this);
/* 28 */            ooolOOI00000oIO2.I00000oIO(1.0f);
/* 31 */            ooolOOI00000oIO2.I0000Il00O(j);
/* 38 */            ((ActionBarContextView) i00ioo.I0000Il00O).I00ilO0 = ooolOOI00000oIO2;
/* 40 */            i00ioo.I00000oOI = i;
/* 42 */            ooolOOI00000oIO2.I0000O(i00ioo);
/* 45 */            return ooolOOI00000oIO2;
                }

                @Override
                public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
/* 5 */             return new ViewGroup.MarginLayoutParams(-1, -2);
                }

                @Override
                public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
/* 7 */             return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
                }

                public int getAnimatedVisibility() {
                    return this.I00ilO0 != null ? this.I00iOIl.I00000oOI : getVisibility();
                }

                public int getContentHeight() {
/* 1 */             return this.I00ilI0I1;
                }

                public CharSequence getSubtitle() {
/* 1 */             return this.I00l0OO0IO;
                }

                public CharSequence getTitle() {
/* 1 */             return this.I00l0I0l0lO1;
                }

                @Override
                public final void onConfigurationChanged(Configuration configuration) {
/* 1 */             super.onConfigurationChanged(configuration);
/* 15 */            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, OOilOli0.I00000oIO, R.attr.actionBarStyle, 0);
/* 25 */            setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
/* 28 */            typedArrayObtainStyledAttributes.recycle();
/* 31 */            I0I1ii0i i0I1ii0i = this.I00iio;
/* 33 */            if (i0I1ii0i != null) {
/* 41 */                Configuration configuration2 = i0I1ii0i.I00iiI.getResources().getConfiguration();
/* 45 */                int i = configuration2.screenWidthDp;
/* 47 */                int i2 = configuration2.screenHeightDp;
/* 98 */                i0I1ii0i.I00o0l1o1o0 = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
/* 100 */               O1illlIiilIl o1illlIiilIl = i0I1ii0i.I00iiO;
/* 102 */               if (o1illlIiilIl != null) {
/* 105 */                   o1illlIiilIl.I00100l0(true);
                        }
                    }
                }

                @Override
                public final void onDetachedFromWindow() {
/* 1 */             super.onDetachedFromWindow();
/* 4 */             I0I1ii0i i0I1ii0i = this.I00iio;
/* 6 */             if (i0I1ii0i != null) {
/* 8 */                 i0I1ii0i.I0001Ioi1lo();
/* 13 */                I0I1IlI1 i0I1IlI1 = this.I00iio.I00oIiI10;
/* 15 */                if (i0I1IlI1 == null || !i0I1IlI1.I00000oOI()) {
/* 55 */                    return;
                        }
/* 25 */                i0I1IlI1.I000OOo1O.dismiss();
                    }
                }

                @Override
                public final boolean onHoverEvent(MotionEvent motionEvent) {
/* 1 */             int actionMasked = motionEvent.getActionMasked();
/* 8 */             if (actionMasked == 9) {
/* 10 */                this.I00ioIO = false;
                    }
/* 15 */            if (!this.I00ioIO) {
/* 17 */                boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
/* 21 */                if (actionMasked == 9 && !zOnHoverEvent) {
/* 25 */                    this.I00ioIO = true;
                        }
                    }
/* 29 */            if (actionMasked != 10 && actionMasked != 3) {
/* 14 */                return true;
                    }
/* 36 */            this.I00ioIO = false;
/* 14 */            return true;
                }

                @Override
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
/* 10 */            boolean z2 = getLayoutDirection() == 1;
/* 21 */            int paddingRight = z2 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
/* 25 */            int paddingTop = getPaddingTop();
/* 39 */            int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
/* 40 */            View view = this.I00li1OI;
/* 44 */            if (view != null && view.getVisibility() != 8) {
/* 58 */                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.I00li1OI.getLayoutParams();
/* 65 */                int i5 = z2 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
/* 72 */                int i6 = z2 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
/* 78 */                int i7 = z2 ? paddingRight - i5 : paddingRight + i5;
/* 85 */                int iI000II = I000II(this.I00li1OI, i7, paddingTop, paddingTop2, z2) + i7;
/* 91 */                paddingRight = z2 ? iI000II - i6 : iI000II + i6;
                    }
/* 93 */            LinearLayout linearLayout = this.I00lll10;
/* 95 */            if (linearLayout != null && this.I00lli11 == null && linearLayout.getVisibility() != 8) {
/* 113 */               paddingRight += I000II(this.I00lll10, paddingRight, paddingTop, paddingTop2, z2);
                    }
/* 114 */           View view2 = this.I00lli11;
/* 116 */           if (view2 != null) {
/* 118 */               I000II(view2, paddingRight, paddingTop, paddingTop2, z2);
                    }
/* 133 */           int paddingLeft = z2 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
/* 135 */           ActionMenuView actionMenuView = this.I00iiO;
/* 137 */           if (actionMenuView != null) {
/* 140 */               I000II(actionMenuView, paddingLeft, paddingTop, paddingTop2, !z2);
                    }
                }

                @Override
                public final void onMeasure(int i, int i2) {
/* 7 */             if (View.MeasureSpec.getMode(i) != 1073741824) {
/* 259 */               I000II.I001IO000(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
/* 332 */               return;
                    }
/* 13 */            if (View.MeasureSpec.getMode(i2) == 0) {
/* 241 */               I000II.I001IO000(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
/* 244 */               return;
                    }
/* 15 */            int size = View.MeasureSpec.getSize(i);
/* 19 */            int size2 = this.I00ilI0I1;
/* 21 */            if (size2 <= 0) {
/* 24 */                size2 = View.MeasureSpec.getSize(i2);
                    }
/* 36 */            int paddingBottom = getPaddingBottom() + getPaddingTop();
/* 47 */            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
/* 48 */            int iMin = size2 - paddingBottom;
/* 52 */            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
/* 56 */            View view = this.I00li1OI;
/* 58 */            if (view != null) {
/* 60 */                int iI0001Ioi1lo = I0001Ioi1lo(view, paddingLeft, iMakeMeasureSpec);
/* 70 */                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.I00li1OI.getLayoutParams();
/* 77 */                paddingLeft = iI0001Ioi1lo - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
                    }
/* 78 */            ActionMenuView actionMenuView = this.I00iiO;
/* 80 */            if (actionMenuView != null && actionMenuView.getParent() == this) {
/* 90 */                paddingLeft = I0001Ioi1lo(this.I00iiO, paddingLeft, iMakeMeasureSpec);
                    }
/* 94 */            LinearLayout linearLayout = this.I00lll10;
/* 97 */            if (linearLayout != null && this.I00lli11 == null) {
/* 105 */               if (this.I00oII) {
/* 113 */                   this.I00lll10.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
/* 118 */                   int measuredWidth = this.I00lll10.getMeasuredWidth();
/* 126 */                   boolean z = measuredWidth <= paddingLeft;
/* 127 */                   if (z) {
/* 129 */                       paddingLeft -= measuredWidth;
                            }
/* 138 */                   this.I00lll10.setVisibility(z ? 0 : 8);
                        } else {
/* 142 */                   paddingLeft = I0001Ioi1lo(linearLayout, paddingLeft, iMakeMeasureSpec);
                        }
                    }
/* 146 */           View view2 = this.I00lli11;
/* 148 */           if (view2 != null) {
/* 150 */               ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
/* 154 */               int i3 = layoutParams.width;
/* 161 */               int i4 = i3 != -2 ? 1073741824 : Integer.MIN_VALUE;
/* 162 */               if (i3 >= 0) {
/* 164 */                   paddingLeft = Math.min(i3, paddingLeft);
                        }
/* 168 */               int i5 = layoutParams.height;
/* 170 */               int i6 = i5 == -2 ? Integer.MIN_VALUE : 1073741824;
/* 174 */               if (i5 >= 0) {
/* 176 */                   iMin = Math.min(i5, iMin);
                        }
/* 190 */               this.I00lli11.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
                    }
/* 195 */           if (this.I00ilI0I1 > 0) {
/* 223 */               setMeasuredDimension(size, size2);
/* 226 */               return;
                    }
/* 197 */           int childCount = getChildCount();
/* 201 */           int i7 = 0;
/* 202 */           for (int i8 = 0; i8 < childCount; i8++) {
/* 212 */               int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingBottom;
/* 213 */               if (measuredHeight > i7) {
/* 215 */                   i7 = measuredHeight;
                        }
                    }
/* 219 */           setMeasuredDimension(size, i7);
                }

                @Override
                public final boolean onTouchEvent(MotionEvent motionEvent) {
/* 1 */             int actionMasked = motionEvent.getActionMasked();
/* 6 */             if (actionMasked == 0) {
/* 8 */                 this.I00io1l = false;
                    }
/* 13 */            if (!this.I00io1l) {
/* 15 */                boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
/* 19 */                if (actionMasked == 0 && !zOnTouchEvent) {
/* 23 */                    this.I00io1l = true;
                        }
                    }
/* 25 */            if (actionMasked != 1 && actionMasked != 3) {
/* 12 */                return true;
                    }
/* 32 */            this.I00io1l = false;
/* 12 */            return true;
                }

                public void setContentHeight(int i) {
/* 1 */             this.I00ilI0I1 = i;
                }

                public void setCustomView(View view) {
                    LinearLayout linearLayout;
/* 1 */             View view2 = this.I00lli11;
/* 3 */             if (view2 != null) {
/* 5 */                 removeView(view2);
                    }
/* 8 */             this.I00lli11 = view;
/* 10 */            if (view != null && (linearLayout = this.I00lll10) != null) {
/* 16 */                removeView(linearLayout);
/* 20 */                this.I00lll10 = null;
                    }
/* 22 */            if (view != null) {
/* 24 */                addView(view);
                    }
/* 27 */            requestLayout();
                }

                public void setSubtitle(CharSequence charSequence) {
/* 1 */             this.I00l0OO0IO = charSequence;
/* 3 */             I0000O();
                }

                public void setTitle(CharSequence charSequence) {
/* 1 */             this.I00l0I0l0lO1 = charSequence;
/* 3 */             I0000O();
/* 6 */             OooiOl0ioo0i.I0000Il00O(this, charSequence);
                }

                public void setTitleOptional(boolean z) {
/* 3 */             if (z != this.I00oII) {
/* 5 */                 requestLayout();
                    }
/* 8 */             this.I00oII = z;
                }

                @Override
                public final boolean shouldDelayChildPressedState() {
/* 1 */             return false;
                }

/* 121 */       public ActionBarContextView(Context context) {
/* 122 */           this(context, null);
                }
            }

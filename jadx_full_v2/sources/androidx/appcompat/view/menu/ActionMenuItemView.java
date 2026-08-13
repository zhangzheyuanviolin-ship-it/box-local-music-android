            package androidx.appcompat.view.menu;

            import android.content.Context;
            import android.content.res.Configuration;
            import android.content.res.Resources;
            import android.content.res.TypedArray;
            import android.graphics.drawable.Drawable;
            import android.os.Parcelable;
            import android.text.TextUtils;
            import android.util.AttributeSet;
            import android.view.MotionEvent;
            import android.view.View;
            import android.widget.Button;
            import p000.I0I11O000oO;
            import p000.I0I11i0;
            import p000.I0I1ioli;
            import p000.I1II01I;
            import p000.O1ilOO;
            import p000.O1illlIiilIl;
            import p000.O1ioIIl;
            import p000.O1l0lO0Ioo1;
            import p000.OOilOli0;
            import p000.Oo1l0oIiIllO;
            
/* 27 */    public class ActionMenuItemView extends I1II01I implements O1l0lO0Ioo1, View.OnClickListener, I0I1ioli {
                public O1ioIIl I00io1l;
                public CharSequence I00ioIO;
                public Drawable I00l0I0l0lO1;
                public O1ilOO I00l0OO0IO;
                public I0I11O000oO I00li1OI;
                public I0I11i0 I00ll1;
                public boolean I00lli11;
                public boolean I00lll10;
                public final int I00o0iI0io1;
                public int I00o0l1o1o0;
                public final int I00o101lO;

                public ActionMenuItemView(Context context, AttributeSet attributeSet) {
/* 2 */             super(context, attributeSet, 0);
/* 5 */             Resources resources = context.getResources();
/* 13 */            this.I00lli11 = I0000O();
/* 17 */            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OOilOli0.I0000Il00O, 0, 0);
/* 25 */            this.I00o0iI0io1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
/* 27 */            typedArrayObtainStyledAttributes.recycle();
/* 43 */            this.I00o101lO = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
/* 45 */            setOnClickListener(this);
/* 49 */            this.I00o0l1o1o0 = -1;
/* 51 */            setSaveEnabled(false);
                }

                @Override
                public final void I00000oIO(O1ioIIl o1ioIIl) {
/* 1 */             this.I00io1l = o1ioIIl;
/* 7 */             setIcon(o1ioIIl.getIcon());
/* 14 */            setTitle(o1ioIIl.getTitleCondensed());
/* 19 */            setId(o1ioIIl.I00000oIO);
/* 32 */            setVisibility(o1ioIIl.isVisible() ? 0 : 8);
/* 39 */            setEnabled(o1ioIIl.isEnabled());
/* 46 */            if (o1ioIIl.hasSubMenu() && this.I00li1OI == null) {
/* 57 */                this.I00li1OI = new I0I11O000oO(this);
                    }
                }

                @Override
                public final boolean I00000oOI() {
/* 9 */             return !TextUtils.isEmpty(getText());
                }

                @Override
                public final boolean I0000Il00O() {
                    return !TextUtils.isEmpty(getText()) && this.I00io1l.getIcon() == null;
                }

                public final boolean I0000O() {
/* 9 */             Configuration configuration = getContext().getResources().getConfiguration();
/* 13 */            int i = configuration.screenWidthDp;
/* 15 */            int i2 = configuration.screenHeightDp;
/* 19 */            if (i < 480) {
                        return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
                    }
/* 35 */            return true;
                }

                public final void I0000oI00() {
/* 7 */             boolean z = true;
                    boolean z2 = !TextUtils.isEmpty(this.I00ioIO);
/* 11 */            if (this.I00l0I0l0lO1 != null && ((this.I00io1l.I001iOo1i0O & 4) != 4 || (!this.I00lli11 && !this.I00lll10))) {
/* 30 */                z = false;
                    }
/* 31 */            boolean z3 = z2 & z;
/* 39 */            setText(z3 ? this.I00ioIO : null);
/* 44 */            CharSequence charSequence = this.I00io1l.I00100o1O0lo;
/* 50 */            if (TextUtils.isEmpty(charSequence)) {
/* 60 */                setContentDescription(z3 ? null : this.I00io1l.I0000oI00);
                    } else {
/* 64 */                setContentDescription(charSequence);
                    }
/* 69 */            CharSequence charSequence2 = this.I00io1l.I0010I0i;
/* 75 */            if (TextUtils.isEmpty(charSequence2)) {
/* 84 */                Oo1l0oIiIllO.I00000oIO(this, z3 ? null : this.I00io1l.I0000oI00);
                    } else {
/* 88 */                Oo1l0oIiIllO.I00000oIO(this, charSequence2);
                    }
                }

                @Override
                public CharSequence getAccessibilityClassName() {
/* 3 */             return Button.class.getName();
                }

                @Override
                public O1ioIIl getItemData() {
/* 1 */             return this.I00io1l;
                }

                @Override
                public final void onClick(View view) {
/* 1 */             O1ilOO o1ilOO = this.I00l0OO0IO;
/* 3 */             if (o1ilOO != null) {
/* 7 */                 o1ilOO.I00000oIO(this.I00io1l);
                    }
                }

                @Override
                public final void onConfigurationChanged(Configuration configuration) {
/* 1 */             super.onConfigurationChanged(configuration);
/* 8 */             this.I00lli11 = I0000O();
/* 10 */            I0000oI00();
                }

                @Override
                public final void onMeasure(int i, int i2) {
                    int i3;
/* 5 */             boolean zIsEmpty = TextUtils.isEmpty(getText());
/* 9 */             if (!zIsEmpty && (i3 = this.I00o0l1o1o0) >= 0) {
/* 27 */                super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
                    }
/* 30 */            super.onMeasure(i, i2);
/* 33 */            int mode = View.MeasureSpec.getMode(i);
/* 37 */            int size = View.MeasureSpec.getSize(i);
/* 41 */            int measuredWidth = getMeasuredWidth();
/* 47 */            int i4 = this.I00o0iI0io1;
/* 56 */            int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
/* 59 */            if (mode != 1073741824 && i4 > 0 && measuredWidth < iMin) {
/* 69 */                super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
                    }
/* 72 */            if (!zIsEmpty || this.I00l0I0l0lO1 == null) {
/* 332 */               return;
                    }
/* 107 */           super.setPadding((getMeasuredWidth() - this.I00l0I0l0lO1.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
                }

                @Override
                public final void onRestoreInstanceState(Parcelable parcelable) {
/* 2 */             super.onRestoreInstanceState(null);
                }

                @Override
                public final boolean onTouchEvent(MotionEvent motionEvent) {
                    I0I11O000oO i0I11O000oO;
/* 7 */             if (this.I00io1l.hasSubMenu() && (i0I11O000oO = this.I00li1OI) != null && i0I11O000oO.onTouch(this, motionEvent)) {
/* 19 */                return true;
                    }
/* 21 */            return super.onTouchEvent(motionEvent);
                }

                public void setExpandedFormat(boolean z) {
/* 3 */             if (this.I00lll10 != z) {
/* 5 */                 this.I00lll10 = z;
/* 7 */                 O1ioIIl o1ioIIl = this.I00io1l;
/* 9 */                 if (o1ioIIl != null) {
/* 11 */                    O1illlIiilIl o1illlIiilIl = o1ioIIl.I000o00OoI0I;
/* 14 */                    o1illlIiilIl.I000iOII = true;
/* 16 */                    o1illlIiilIl.I00100l0(true);
                        }
                    }
                }

                public void setIcon(Drawable drawable) {
/* 1 */             this.I00l0I0l0lO1 = drawable;
/* 3 */             if (drawable != null) {
/* 5 */                 int intrinsicWidth = drawable.getIntrinsicWidth();
/* 9 */                 int intrinsicHeight = drawable.getIntrinsicHeight();
/* 13 */                int i = this.I00o101lO;
/* 15 */                if (intrinsicWidth > i) {
/* 22 */                    intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
/* 23 */                    intrinsicWidth = i;
                        }
/* 24 */                if (intrinsicHeight > i) {
/* 31 */                    intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
                        } else {
/* 33 */                    i = intrinsicHeight;
                        }
/* 35 */                drawable.setBounds(0, 0, intrinsicWidth, i);
                    }
/* 39 */            setCompoundDrawables(drawable, null, null, null);
/* 42 */            I0000oI00();
                }

                public void setItemInvoker(O1ilOO o1ilOO) {
/* 1 */             this.I00l0OO0IO = o1ilOO;
                }

                @Override
                public final void setPadding(int i, int i2, int i3, int i4) {
/* 1 */             this.I00o0l1o1o0 = i;
/* 3 */             super.setPadding(i, i2, i3, i4);
                }

                public void setPopupCallback(I0I11i0 i0I11i0) {
/* 1 */             this.I00ll1 = i0I11i0;
                }

                public void setTitle(CharSequence charSequence) {
/* 1 */             this.I00ioIO = charSequence;
/* 3 */             I0000oI00();
                }

/* 28 */        public void setCheckable(boolean z) {
                }

/* 28 */        public void setChecked(boolean z) {
                }

/* 54 */        public ActionMenuItemView(Context context) {
/* 55 */            this(context, null);
                }
            }

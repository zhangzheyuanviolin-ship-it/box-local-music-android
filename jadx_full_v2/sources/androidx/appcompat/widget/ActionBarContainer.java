            package androidx.appcompat.widget;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.graphics.drawable.Drawable;
            import android.util.AttributeSet;
            import android.view.ActionMode;
            import android.view.MotionEvent;
            import android.view.View;
            import android.widget.FrameLayout;
            import com.box.gallery.R;
            import java.lang.invoke.VarHandle;
            import p000.I0I0lO0OIliO;
            import p000.OOilOli0;
            import p000.Oii01O1lO;
            
/* 8 */     public class ActionBarContainer extends FrameLayout {
                public boolean I00iOIl;
                public View I00iiI;
                public View I00iiO;
                public Drawable I00iio;
                public Drawable I00ilI0I1;
                public Drawable I00ilO0;
                public final boolean I00io1l;
                public boolean I00ioIO;
                public final int I00l0I0l0lO1;

                public ActionBarContainer(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
/* 6 */             I0I0lO0OIliO i0I0lO0OIliO = new I0I0lO0OIliO();
/* 9 */             i0I0lO0OIliO.I00000oIO = this;
/* 11 */            VarHandle.storeStoreFence();
/* 14 */            setBackground(i0I0lO0OIliO);
/* 19 */            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OOilOli0.I00000oIO);
/* 23 */            boolean z = false;
/* 28 */            this.I00iio = typedArrayObtainStyledAttributes.getDrawable(0);
/* 35 */            this.I00ilI0I1 = typedArrayObtainStyledAttributes.getDrawable(2);
/* 44 */            this.I00l0I0l0lO1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
/* 54 */            if (getId() == R.id.split_action_bar) {
/* 56 */                this.I00io1l = true;
/* 62 */                this.I00ilO0 = typedArrayObtainStyledAttributes.getDrawable(1);
                    }
/* 64 */            typedArrayObtainStyledAttributes.recycle();
/* 69 */            if (!this.I00io1l ? !(this.I00iio != null || this.I00ilI0I1 != null) : this.I00ilO0 == null) {
/* 75 */                z = true;
                    }
/* 86 */            setWillNotDraw(z);
                }

                @Override
                public final void drawableStateChanged() {
/* 1 */             super.drawableStateChanged();
/* 4 */             Drawable drawable = this.I00iio;
/* 6 */             if (drawable != null && drawable.isStateful()) {
/* 20 */                this.I00iio.setState(getDrawableState());
                    }
/* 23 */            Drawable drawable2 = this.I00ilI0I1;
/* 25 */            if (drawable2 != null && drawable2.isStateful()) {
/* 39 */                this.I00ilI0I1.setState(getDrawableState());
                    }
/* 42 */            Drawable drawable3 = this.I00ilO0;
/* 44 */            if (drawable3 == null || !drawable3.isStateful()) {
/* 110 */               return;
                    }
/* 58 */            this.I00ilO0.setState(getDrawableState());
                }

                public View getTabContainer() {
/* 1 */             return null;
                }

                @Override
                public final void jumpDrawablesToCurrentState() {
/* 1 */             super.jumpDrawablesToCurrentState();
/* 4 */             Drawable drawable = this.I00iio;
/* 6 */             if (drawable != null) {
/* 8 */                 drawable.jumpToCurrentState();
                    }
/* 11 */            Drawable drawable2 = this.I00ilI0I1;
/* 13 */            if (drawable2 != null) {
/* 15 */                drawable2.jumpToCurrentState();
                    }
/* 18 */            Drawable drawable3 = this.I00ilO0;
/* 20 */            if (drawable3 != null) {
/* 22 */                drawable3.jumpToCurrentState();
                    }
                }

                @Override
                public final void onFinishInflate() {
/* 1 */             super.onFinishInflate();
/* 11 */            this.I00iiI = findViewById(R.id.action_bar);
/* 20 */            this.I00iiO = findViewById(R.id.action_context_bar);
                }

                @Override
                public final boolean onHoverEvent(MotionEvent motionEvent) {
/* 1 */             super.onHoverEvent(motionEvent);
/* 4 */             return true;
                }

                @Override
                public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                    return this.I00iOIl || super.onInterceptTouchEvent(motionEvent);
                }

                @Override
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
/* 1 */             super.onLayout(z, i, i2, i3, i4);
/* 6 */             boolean z2 = true;
/* 8 */             if (this.I00io1l) {
/* 10 */                Drawable drawable = this.I00ilO0;
/* 12 */                if (drawable != null) {
/* 22 */                    drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                        } else {
/* 26 */                    z2 = false;
                        }
                    } else {
/* 30 */                if (this.I00iio == null) {
/* 116 */                   z2 = false;
                        } else if (this.I00iiI.getVisibility() == 0) {
/* 66 */                    this.I00iio.setBounds(this.I00iiI.getLeft(), this.I00iiI.getTop(), this.I00iiI.getRight(), this.I00iiI.getBottom());
                        } else {
/* 70 */                    View view = this.I00iiO;
/* 72 */                    if (view == null || view.getVisibility() != 0) {
/* 112 */                       this.I00iio.setBounds(0, 0, 0, 0);
                            } else {
/* 106 */                       this.I00iio.setBounds(this.I00iiO.getLeft(), this.I00iiO.getTop(), this.I00iiO.getRight(), this.I00iiO.getBottom());
                            }
                        }
/* 117 */               this.I00ioIO = false;
                    }
/* 119 */           if (z2) {
/* 121 */               invalidate();
                    }
                }

                @Override
                public final void onMeasure(int i, int i2) {
                    int i3;
/* 3 */             if (this.I00iiI == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.I00l0I0l0lO1) >= 0) {
/* 25 */                i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
                    }
/* 29 */            super.onMeasure(i, i2);
/* 34 */            if (this.I00iiI == null) {
/* 36 */                return;
                    }
/* 37 */            View.MeasureSpec.getMode(i2);
                }

                @Override
                public final boolean onTouchEvent(MotionEvent motionEvent) {
/* 1 */             super.onTouchEvent(motionEvent);
/* 4 */             return true;
                }

                public void setPrimaryBackground(Drawable drawable) {
/* 1 */             Drawable drawable2 = this.I00iio;
/* 3 */             if (drawable2 != null) {
/* 6 */                 drawable2.setCallback(null);
/* 11 */                unscheduleDrawable(this.I00iio);
                    }
/* 14 */            this.I00iio = drawable;
/* 16 */            if (drawable != null) {
/* 18 */                drawable.setCallback(this);
/* 21 */                View view = this.I00iiI;
/* 23 */                if (view != null) {
/* 49 */                    this.I00iio.setBounds(view.getLeft(), this.I00iiI.getTop(), this.I00iiI.getRight(), this.I00iiI.getBottom());
                        }
                    }
/* 54 */            boolean z = false;
/* 56 */            if (!this.I00io1l ? !(this.I00iio != null || this.I00ilI0I1 != null) : this.I00ilO0 == null) {
/* 62 */                z = true;
                    }
/* 73 */            setWillNotDraw(z);
/* 76 */            invalidate();
/* 79 */            invalidateOutline();
                }

                public void setSplitBackground(Drawable drawable) {
                    Drawable drawable2;
/* 1 */             Drawable drawable3 = this.I00ilO0;
/* 3 */             if (drawable3 != null) {
/* 6 */                 drawable3.setCallback(null);
/* 11 */                unscheduleDrawable(this.I00ilO0);
                    }
/* 14 */            this.I00ilO0 = drawable;
/* 16 */            boolean z = this.I00io1l;
/* 18 */            boolean z2 = false;
/* 19 */            if (drawable != null) {
/* 21 */                drawable.setCallback(this);
/* 24 */                if (z && (drawable2 = this.I00ilO0) != null) {
/* 38 */                    drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                        }
                    }
/* 42 */            if (!z ? !(this.I00iio != null || this.I00ilI0I1 != null) : this.I00ilO0 == null) {
/* 48 */                z2 = true;
                    }
/* 59 */            setWillNotDraw(z2);
/* 62 */            invalidate();
/* 65 */            invalidateOutline();
                }

                public void setStackedBackground(Drawable drawable) {
/* 1 */             Drawable drawable2 = this.I00ilI0I1;
/* 4 */             if (drawable2 != null) {
/* 6 */                 drawable2.setCallback(null);
/* 11 */                unscheduleDrawable(this.I00ilI0I1);
                    }
/* 14 */            this.I00ilI0I1 = drawable;
/* 16 */            if (drawable != null) {
/* 18 */                drawable.setCallback(this);
/* 23 */                if (this.I00ioIO && this.I00ilI0I1 != null) {
/* 30 */                    throw null;
                        }
                    }
/* 33 */            boolean z = false;
/* 35 */            if (!this.I00io1l ? !(this.I00iio != null || this.I00ilI0I1 != null) : this.I00ilO0 == null) {
/* 41 */                z = true;
                    }
/* 52 */            setWillNotDraw(z);
/* 55 */            invalidate();
/* 58 */            invalidateOutline();
                }

                public void setTransitioning(boolean z) {
/* 1 */             this.I00iOIl = z;
/* 10 */            setDescendantFocusability(z ? 393216 : 262144);
                }

                @Override
                public void setVisibility(int i) {
/* 1 */             super.setVisibility(i);
/* 9 */             boolean z = i == 0;
/* 10 */            Drawable drawable = this.I00iio;
/* 12 */            if (drawable != null) {
/* 14 */                drawable.setVisible(z, false);
                    }
/* 17 */            Drawable drawable2 = this.I00ilI0I1;
/* 19 */            if (drawable2 != null) {
/* 21 */                drawable2.setVisible(z, false);
                    }
/* 24 */            Drawable drawable3 = this.I00ilO0;
/* 26 */            if (drawable3 != null) {
/* 28 */                drawable3.setVisible(z, false);
                    }
                }

                @Override
                public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
/* 1 */             if (i != 0) {
/* 3 */                 return super.startActionModeForChild(view, callback, i);
                    }
/* 8 */             return null;
                }

                @Override
                public final boolean verifyDrawable(Drawable drawable) {
/* 1 */             Drawable drawable2 = this.I00iio;
/* 3 */             boolean z = this.I00io1l;
/* 5 */             if (drawable == drawable2 && !z) {
/* 29 */                return true;
                    }
/* 11 */            if (drawable == this.I00ilI0I1 && this.I00ioIO) {
/* 29 */                return true;
                    }
                    return (drawable == this.I00ilO0 && z) || super.verifyDrawable(drawable);
                }

                @Override
/* 9 */         public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
/* 10 */            return null;
                }

/* 28 */        public void setTabContainer(Oii01O1lO oii01O1lO) {
                }

/* 89 */        public ActionBarContainer(Context context) {
/* 90 */            this(context, null);
                }
            }

            package androidx.appcompat.widget;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.graphics.Canvas;
            import android.util.AttributeSet;
            import android.view.LayoutInflater;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.ViewParent;
            import java.lang.ref.WeakReference;
            import p000.I000II;
            import p000.OOilOli0;
            import p000.OooliOIoIlO;
            
/* 27 */    public final class ViewStubCompat extends View {
                public int I00iOIl;
                public int I00iiI;
                public WeakReference I00iiO;
                public LayoutInflater I00iio;

                public ViewStubCompat(Context context, AttributeSet attributeSet) {
/* 2 */             super(context, attributeSet, 0);
/* 5 */             this.I00iOIl = 0;
/* 9 */             TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OOilOli0.I001l0I00, 0, 0);
/* 19 */            this.I00iiI = typedArrayObtainStyledAttributes.getResourceId(2, -1);
/* 26 */            this.I00iOIl = typedArrayObtainStyledAttributes.getResourceId(1, 0);
/* 32 */            setId(typedArrayObtainStyledAttributes.getResourceId(0, -1));
/* 35 */            typedArrayObtainStyledAttributes.recycle();
/* 40 */            setVisibility(8);
/* 43 */            setWillNotDraw(true);
                }

                public final View I00000oIO() {
/* 1 */             ViewParent parent = getParent();
/* 8 */             if (!(parent instanceof ViewGroup)) {
/* 80 */                I000II.I001IO000("ViewStub must have a non-null ViewGroup viewParent");
/* 7 */                 return null;
                    }
/* 12 */            if (this.I00iOIl == 0) {
/* 74 */                I000II.I000iOII("ViewStub must have a valid layoutResource");
/* 7 */                 return null;
                    }
/* 14 */            ViewGroup viewGroup = (ViewGroup) parent;
/* 16 */            LayoutInflater layoutInflaterFrom = this.I00iio;
/* 18 */            if (layoutInflaterFrom == null) {
/* 25 */                layoutInflaterFrom = LayoutInflater.from(getContext());
                    }
/* 32 */            View viewInflate = layoutInflaterFrom.inflate(this.I00iOIl, viewGroup, false);
/* 36 */            int i = this.I00iiI;
/* 39 */            if (i != -1) {
/* 41 */                viewInflate.setId(i);
                    }
/* 44 */            int iIndexOfChild = viewGroup.indexOfChild(this);
/* 48 */            viewGroup.removeViewInLayout(this);
/* 51 */            ViewGroup.LayoutParams layoutParams = getLayoutParams();
/* 55 */            if (layoutParams != null) {
/* 57 */                viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
                    } else {
/* 61 */                viewGroup.addView(viewInflate, iIndexOfChild);
                    }
/* 69 */            this.I00iiO = new WeakReference(viewInflate);
/* 71 */            return viewInflate;
                }

                public int getInflatedId() {
/* 1 */             return this.I00iiI;
                }

                public LayoutInflater getLayoutInflater() {
/* 1 */             return this.I00iio;
                }

                public int getLayoutResource() {
/* 1 */             return this.I00iOIl;
                }

                @Override
                public final void onMeasure(int i, int i2) {
/* 2 */             setMeasuredDimension(0, 0);
                }

                public void setInflatedId(int i) {
/* 1 */             this.I00iiI = i;
                }

                public void setLayoutInflater(LayoutInflater layoutInflater) {
/* 1 */             this.I00iio = layoutInflater;
                }

                public void setLayoutResource(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public void setVisibility(int i) {
/* 1 */             WeakReference weakReference = this.I00iiO;
/* 3 */             if (weakReference != null) {
/* 9 */                 View view = (View) weakReference.get();
/* 11 */                if (view != null) {
/* 13 */                    view.setVisibility(i);
/* 16 */                    return;
                        } else {
/* 19 */                    I000II.I001IO000("setVisibility called on un-referenced view");
/* 22 */                    return;
                        }
                    }
/* 23 */            super.setVisibility(i);
/* 26 */            if (i == 0 || i == 4) {
/* 33 */                I00000oIO();
                    }
                }

                @Override
/* 28 */        public final void dispatchDraw(Canvas canvas) {
                }

                @Override
/* 28 */        public final void draw(Canvas canvas) {
                }

/* 28 */        public void setOnInflateListener(OooliOIoIlO oooliOIoIlO) {
                }
            }

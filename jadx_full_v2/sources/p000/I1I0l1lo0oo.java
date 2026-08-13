            package p000;

            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.TypedArray;
            import android.graphics.Canvas;
            import android.graphics.PorterDuff;
            import android.graphics.drawable.Drawable;
            import android.util.AttributeSet;
            import com.box.gallery.R;
            import java.util.WeakHashMap;
            
            public final class I1I0l1lo0oo extends I1I0i0Ilo1Oi {
                public I1I0iilo I00ilI0I1;
                public Drawable I00ilO0;
                public ColorStateList I00io1l;
                public PorterDuff.Mode I00ioIO;
                public boolean I00l0I0l0lO1;
                public boolean I00l0OO0IO;

                @Override
                public final void I00OIl(AttributeSet attributeSet, int i) {
/* 4 */             super.I00OIl(attributeSet, R.attr.seekBarStyle);
/* 7 */             I1I0iilo i1I0iilo = this.I00ilI0I1;
/* 9 */             Context context = i1I0iilo.getContext();
/* 13 */            int[] iArr = OOilOli0.I000II;
/* 15 */            OlilOlOiI olilOlOiII0010I0i = OlilOlOiI.I0010I0i(context, attributeSet, iArr, R.attr.seekBarStyle);
/* 22 */            TypedArray typedArray = (TypedArray) olilOlOiII0010I0i.I00iiO;
/* 24 */            Context context2 = i1I0iilo.getContext();
/* 31 */            TypedArray typedArray2 = (TypedArray) olilOlOiII0010I0i.I00iiO;
/* 33 */            WeakHashMap weakHashMap = OooiOl0ioo0i.I00000oIO;
/* 37 */            OooiO1oOi1.I00000oOI(i1I0iilo, context2, iArr, attributeSet, typedArray2, R.attr.seekBarStyle, 0);
/* 41 */            Drawable drawableI000l1 = olilOlOiII0010I0i.I000l1(0);
/* 45 */            if (drawableI000l1 != null) {
/* 47 */                i1I0iilo.setThumb(drawableI000l1);
                    }
/* 51 */            Drawable drawableI000iOII = olilOlOiII0010I0i.I000iOII(1);
/* 55 */            Drawable drawable = this.I00ilO0;
/* 57 */            if (drawable != null) {
/* 60 */                drawable.setCallback(null);
                    }
/* 63 */            this.I00ilO0 = drawableI000iOII;
/* 65 */            if (drawableI000iOII != null) {
/* 67 */                drawableI000iOII.setCallback(i1I0iilo);
/* 74 */                drawableI000iOII.setLayoutDirection(i1I0iilo.getLayoutDirection());
/* 81 */                if (drawableI000iOII.isStateful()) {
/* 87 */                    drawableI000iOII.setState(i1I0iilo.getDrawableState());
                        }
/* 90 */                I00i0O();
                    }
/* 93 */            i1I0iilo.invalidate();
/* 101 */           if (typedArray.hasValue(3)) {
/* 114 */               this.I00ioIO = IiloO11l.I00000oIO(typedArray.getInt(3, -1), this.I00ioIO);
/* 116 */               this.I00l0OO0IO = true;
                    }
/* 123 */           if (typedArray.hasValue(2)) {
/* 129 */               this.I00io1l = olilOlOiII0010I0i.I000OiO(2);
/* 131 */               this.I00l0I0l0lO1 = true;
                    }
/* 133 */           olilOlOiII0010I0i.I0010o();
/* 136 */           I00i0O();
                }

                public final void I00i0O() {
/* 1 */             Drawable drawable = this.I00ilO0;
/* 3 */             if (drawable != null) {
/* 7 */                 if (this.I00l0I0l0lO1 || this.I00l0OO0IO) {
/* 13 */                    Drawable drawableMutate = drawable.mutate();
/* 17 */                    this.I00ilO0 = drawableMutate;
/* 21 */                    if (this.I00l0I0l0lO1) {
/* 25 */                        drawableMutate.setTintList(this.I00io1l);
                            }
/* 30 */                    if (this.I00l0OO0IO) {
/* 36 */                        this.I00ilO0.setTintMode(this.I00ioIO);
                            }
/* 45 */                    if (this.I00ilO0.isStateful()) {
/* 55 */                        this.I00ilO0.setState(this.I00ilI0I1.getDrawableState());
                            }
                        }
                    }
                }

                public final void I00i0ilIl0i(Canvas canvas) {
/* 1 */             I1I0iilo i1I0iilo = this.I00ilI0I1;
/* 5 */             if (this.I00ilO0 != null) {
/* 7 */                 int max = i1I0iilo.getMax();
/* 12 */                if (max > 1) {
/* 16 */                    int intrinsicWidth = this.I00ilO0.getIntrinsicWidth();
/* 22 */                    int intrinsicHeight = this.I00ilO0.getIntrinsicHeight();
/* 31 */                    int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
/* 34 */                    int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
/* 40 */                    this.I00ilO0.setBounds(-i, -i2, i, i2);
/* 59 */                    float width = ((i1I0iilo.getWidth() - i1I0iilo.getPaddingLeft()) - i1I0iilo.getPaddingRight()) / max;
/* 60 */                    int iSave = canvas.save();
/* 76 */                    canvas.translate(i1I0iilo.getPaddingLeft(), i1I0iilo.getHeight() / 2);
/* 80 */                    for (int i3 = 0; i3 <= max; i3++) {
/* 84 */                        this.I00ilO0.draw(canvas);
/* 88 */                        canvas.translate(width, 0.0f);
                            }
/* 94 */                    canvas.restoreToCount(iSave);
                        }
                    }
                }
            }

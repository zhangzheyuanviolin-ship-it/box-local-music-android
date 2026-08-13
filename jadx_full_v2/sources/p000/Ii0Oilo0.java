            package p000;

            import android.content.res.ColorStateList;
            import android.graphics.BlendMode;
            import android.graphics.Canvas;
            import android.graphics.ColorFilter;
            import android.graphics.PorterDuff;
            import android.graphics.Rect;
            import android.graphics.drawable.Animatable;
            import android.graphics.drawable.Drawable;
            import android.os.SystemClock;
            import java.util.ArrayList;
            
            public final class Ii0Oilo0 extends Drawable implements Drawable.Callback, Animatable {
                public OiO0llO0IO I00iOIl;
                public int I00iiI;
                public boolean I00iiO;
                public ArrayList I00iio;
                public int I00ilI0I1;
                public int I00ilO0;
                public long I00io1l;
                public int I00ioIO;
                public int I00l0I0l0lO1;
                public Drawable I00l0OO0IO;
                public Drawable I00li1OI;

                public final int I00000oIO(Integer num, Integer num2) {
/* 2 */             if (num != null && num.intValue() == -1) {
/* 1 */                 return -1;
                    }
/* 11 */            if (num2 != null && num2.intValue() == -1) {
/* 1 */                 return -1;
                    }
/* 35 */            return Math.max(num != null ? num.intValue() : -1, num2 != null ? num2.intValue() : -1);
                }

                public final void I00000oOI() {
/* 2 */             this.I00l0I0l0lO1 = 2;
/* 5 */             this.I00l0OO0IO = null;
/* 7 */             ArrayList arrayList = this.I00iio;
/* 9 */             int size = arrayList.size();
/* 14 */            for (int i = 0; i < size; i++) {
/* 24 */                ColorStateList colorStateList = ((O1Olool) arrayList.get(i)).I00000oOI.I00o0iI0io1;
/* 26 */                if (colorStateList != null) {
/* 28 */                    setTintList(colorStateList);
                        }
                    }
                }

                public final void I0000Il00O(Drawable drawable, Rect rect) {
/* 1 */             int intrinsicWidth = drawable.getIntrinsicWidth();
/* 5 */             int intrinsicHeight = drawable.getIntrinsicHeight();
/* 9 */             if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
/* 64 */                drawable.setBounds(rect);
/* 106 */               return;
                    }
/* 14 */            int iWidth = rect.width();
/* 18 */            int iHeight = rect.height();
/* 24 */            double dI00000oIO = il0iIill1I.I00000oIO(intrinsicWidth, intrinsicHeight, iWidth, iHeight, this.I00iOIl);
/* 35 */            int iI0001Ioi1lo = O1OooO0IlOo.I0001Ioi1lo((iWidth - (intrinsicWidth * dI00000oIO)) / 2.0d);
/* 44 */            int iI0001Ioi1lo2 = O1OooO0IlOo.I0001Ioi1lo((iHeight - (dI00000oIO * intrinsicHeight)) / 2.0d);
/* 60 */            drawable.setBounds(rect.left + iI0001Ioi1lo, rect.top + iI0001Ioi1lo2, rect.right - iI0001Ioi1lo, rect.bottom - iI0001Ioi1lo2);
                }

                @Override
                public final void draw(Canvas canvas) {
                    int iSave;
                    Drawable drawable;
/* 1 */             Drawable drawable2 = this.I00li1OI;
/* 3 */             int i = this.I00l0I0l0lO1;
/* 5 */             if (i == 0) {
/* 7 */                 Drawable drawable3 = this.I00l0OO0IO;
/* 9 */                 if (drawable3 != null) {
/* 13 */                    drawable3.setAlpha(this.I00ioIO);
/* 16 */                    iSave = canvas.save();
                            try {
/* 20 */                        drawable3.draw(canvas);
/* 26 */                        return;
                            } finally {
                            }
                        }
/* 58 */                return;
                    }
/* 33 */            if (i == 2) {
/* 35 */                if (drawable2 != null) {
/* 39 */                    drawable2.setAlpha(this.I00ioIO);
/* 42 */                    iSave = canvas.save();
                            try {
/* 46 */                        drawable2.draw(canvas);
/* 52 */                        return;
                            } finally {
                            }
                        }
/* 58 */                return;
                    }
/* 70 */            double dUptimeMillis = (SystemClock.uptimeMillis() - this.I00io1l) / this.I00iiI;
/* 76 */            double dI00000oIO = lIiioliIlo.I00000oIO(dUptimeMillis, 0.0d, 1.0d);
/* 80 */            int i2 = this.I00ioIO;
/* 84 */            int i3 = (int) (dI00000oIO * i2);
/* 87 */            if (this.I00iiO) {
/* 89 */                i2 -= i3;
                    }
/* 98 */            boolean z = dUptimeMillis >= 1.0d;
/* 99 */            if (!z && (drawable = this.I00l0OO0IO) != null) {
/* 105 */               drawable.setAlpha(i2);
/* 108 */               iSave = canvas.save();
                        try {
/* 112 */                   drawable.draw(canvas);
                        } finally {
                        }
                    }
/* 125 */           if (drawable2 != null) {
/* 127 */               drawable2.setAlpha(i3);
/* 130 */               iSave = canvas.save();
                        try {
/* 134 */                   drawable2.draw(canvas);
                        } finally {
                        }
                    }
/* 147 */           if (z) {
/* 149 */               I00000oOI();
                    } else {
/* 153 */               invalidateSelf();
                    }
                }

                @Override
                public final int getAlpha() {
/* 1 */             return this.I00ioIO;
                }

                @Override
                public final ColorFilter getColorFilter() {
                    ColorFilter colorFilter;
/* 1 */             Drawable drawable = this.I00li1OI;
/* 3 */             int i = this.I00l0I0l0lO1;
/* 5 */             if (i == 0) {
/* 40 */                Drawable drawable2 = this.I00l0OO0IO;
/* 42 */                if (drawable2 != null) {
/* 44 */                    return drawable2.getColorFilter();
                        }
/* 49 */                return null;
                    }
/* 8 */             if (i != 1) {
/* 11 */                if (i == 2 && drawable != null) {
/* 16 */                    return drawable.getColorFilter();
                        }
/* 49 */                return null;
                    }
/* 21 */            if (drawable != null && (colorFilter = drawable.getColorFilter()) != null) {
/* 30 */                return colorFilter;
                    }
/* 31 */            Drawable drawable3 = this.I00l0OO0IO;
/* 33 */            if (drawable3 != null) {
/* 35 */                return drawable3.getColorFilter();
                    }
/* 49 */            return null;
                }

                @Override
                public final int getIntrinsicHeight() {
/* 1 */             return this.I00ilO0;
                }

                @Override
                public final int getIntrinsicWidth() {
/* 1 */             return this.I00ilI0I1;
                }

                @Override
                public final int getOpacity() {
/* 1 */             Drawable drawable = this.I00l0OO0IO;
/* 3 */             Drawable drawable2 = this.I00li1OI;
/* 5 */             int i = this.I00l0I0l0lO1;
/* 7 */             if (i == 0) {
/* 9 */                 if (drawable != null) {
/* 11 */                    return drawable.getOpacity();
                        }
/* 57 */                return -2;
                    }
/* 17 */            if (i == 2) {
/* 19 */                if (drawable2 != null) {
/* 21 */                    return drawable2.getOpacity();
                        }
/* 57 */                return -2;
                    }
/* 26 */            if (drawable != null && drawable2 != null) {
/* 38 */                return Drawable.resolveOpacity(drawable.getOpacity(), drawable2.getOpacity());
                    }
/* 43 */            if (drawable != null) {
/* 45 */                return drawable.getOpacity();
                    }
/* 50 */            if (drawable2 != null) {
/* 52 */                return drawable2.getOpacity();
                    }
/* 57 */            return -2;
                }

                @Override
                public final void invalidateDrawable(Drawable drawable) {
/* 1 */             invalidateSelf();
                }

                @Override
                public final boolean isRunning() {
                    return this.I00l0I0l0lO1 == 1;
                }

                @Override
                public final void onBoundsChange(Rect rect) {
/* 1 */             Drawable drawable = this.I00l0OO0IO;
/* 3 */             if (drawable != null) {
/* 5 */                 I0000Il00O(drawable, rect);
                    }
/* 8 */             Drawable drawable2 = this.I00li1OI;
/* 10 */            if (drawable2 != null) {
/* 12 */                I0000Il00O(drawable2, rect);
                    }
                }

                @Override
                public final boolean onLevelChange(int i) {
/* 1 */             Drawable drawable = this.I00l0OO0IO;
/* 11 */            boolean level = drawable != null ? drawable.setLevel(i) : false;
/* 12 */            Drawable drawable2 = this.I00li1OI;
                    return level || (drawable2 != null ? drawable2.setLevel(i) : false);
                }

                @Override
                public final boolean onStateChange(int[] iArr) {
/* 1 */             Drawable drawable = this.I00l0OO0IO;
/* 11 */            boolean state = drawable != null ? drawable.setState(iArr) : false;
/* 12 */            Drawable drawable2 = this.I00li1OI;
                    return state || (drawable2 != null ? drawable2.setState(iArr) : false);
                }

                @Override
                public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
/* 1 */             scheduleSelf(runnable, j);
                }

                @Override
                public final void setAlpha(int i) {
/* 1 */             if (i < 0 || i >= 256) {
/* 16 */                I000II.I0010I0i(Oi010OO0.I000oI1ioi(i, "Invalid alpha: "));
                    } else {
/* 7 */                 this.I00ioIO = i;
                    }
                }

                @Override
                public final void setColorFilter(ColorFilter colorFilter) {
/* 1 */             Drawable drawable = this.I00l0OO0IO;
/* 3 */             if (drawable != null) {
/* 6 */                 drawable.setColorFilter(colorFilter);
                    }
/* 9 */             Drawable drawable2 = this.I00li1OI;
/* 11 */            if (drawable2 == null) {
/* 13 */                return;
                    }
/* 14 */            drawable2.setColorFilter(colorFilter);
                }

                @Override
                public final void setTint(int i) {
/* 1 */             Drawable drawable = this.I00l0OO0IO;
/* 3 */             if (drawable != null) {
/* 5 */                 drawable.setTint(i);
                    }
/* 8 */             Drawable drawable2 = this.I00li1OI;
/* 10 */            if (drawable2 != null) {
/* 12 */                drawable2.setTint(i);
                    }
                }

                @Override
                public final void setTintBlendMode(BlendMode blendMode) {
/* 1 */             Drawable drawable = this.I00l0OO0IO;
/* 3 */             if (drawable != null) {
/* 5 */                 drawable.setTintBlendMode(blendMode);
                    }
/* 8 */             Drawable drawable2 = this.I00li1OI;
/* 10 */            if (drawable2 != null) {
/* 12 */                drawable2.setTintBlendMode(blendMode);
                    }
                }

                @Override
                public final void setTintList(ColorStateList colorStateList) {
/* 1 */             Drawable drawable = this.I00l0OO0IO;
/* 3 */             if (drawable != null) {
/* 5 */                 drawable.setTintList(colorStateList);
                    }
/* 8 */             Drawable drawable2 = this.I00li1OI;
/* 10 */            if (drawable2 != null) {
/* 12 */                drawable2.setTintList(colorStateList);
                    }
                }

                @Override
                public final void setTintMode(PorterDuff.Mode mode) {
/* 1 */             Drawable drawable = this.I00l0OO0IO;
/* 3 */             if (drawable != null) {
/* 5 */                 drawable.setTintMode(mode);
                    }
/* 8 */             Drawable drawable2 = this.I00li1OI;
/* 10 */            if (drawable2 != null) {
/* 12 */                drawable2.setTintMode(mode);
                    }
                }

                @Override
                public final void start() {
/* 1 */             Object obj = this.I00l0OO0IO;
/* 11 */            Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
/* 12 */            if (animatable != null) {
/* 14 */                animatable.start();
                    }
/* 17 */            Object obj2 = this.I00li1OI;
/* 24 */            Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
/* 26 */            if (animatable2 != null) {
/* 28 */                animatable2.start();
                    }
/* 33 */            if (this.I00l0I0l0lO1 != 0) {
/* 35 */                return;
                    }
/* 37 */            this.I00l0I0l0lO1 = 1;
/* 43 */            this.I00io1l = SystemClock.uptimeMillis();
/* 45 */            ArrayList arrayList = this.I00iio;
/* 47 */            int size = arrayList.size();
/* 52 */            for (int i = 0; i < size; i++) {
/* 60 */                ((O1Olool) arrayList.get(i)).I00000oIO(this);
                    }
/* 66 */            invalidateSelf();
                }

                @Override
                public final void stop() {
/* 1 */             Object obj = this.I00l0OO0IO;
/* 11 */            Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
/* 12 */            if (animatable != null) {
/* 14 */                animatable.stop();
                    }
/* 17 */            Object obj2 = this.I00li1OI;
/* 24 */            Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
/* 26 */            if (animatable2 != null) {
/* 28 */                animatable2.stop();
                    }
/* 34 */            if (this.I00l0I0l0lO1 != 2) {
/* 36 */                I00000oOI();
                    }
                }

                @Override
                public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
/* 1 */             unscheduleSelf(runnable);
                }
            }

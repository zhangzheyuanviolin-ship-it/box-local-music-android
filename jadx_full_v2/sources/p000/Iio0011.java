            package p000;

            import android.content.res.ColorStateList;
            import android.graphics.Canvas;
            import android.graphics.ColorFilter;
            import android.graphics.PorterDuff;
            import android.graphics.Rect;
            import android.graphics.Region;
            import android.graphics.drawable.Drawable;
            
            public final class Iio0011 extends Drawable implements Drawable.Callback {
                public Drawable I00iOIl;
                public boolean I00iiI;

                public final void I00000oIO(Canvas canvas) {
/* 3 */             this.I00iOIl.draw(canvas);
                }

                public final void I00000oOI(float f, float f2) {
/* 3 */             this.I00iOIl.setHotspot(f, f2);
                }

                public final void I0000Il00O(int i, int i2, int i3, int i4) {
/* 3 */             this.I00iOIl.setHotspotBounds(i, i2, i3, i4);
                }

                public final boolean I0000O(boolean z, boolean z2) {
                    return super.setVisible(z, z2) || this.I00iOIl.setVisible(z, z2);
                }

                @Override
                public final void draw(Canvas canvas) {
/* 3 */             if (this.I00iiI) {
/* 5 */                 I00000oIO(canvas);
                    }
                }

                @Override
                public final int getChangingConfigurations() {
/* 3 */             return this.I00iOIl.getChangingConfigurations();
                }

                @Override
                public final Drawable getCurrent() {
/* 3 */             return this.I00iOIl.getCurrent();
                }

                @Override
                public final int getIntrinsicHeight() {
/* 3 */             return this.I00iOIl.getIntrinsicHeight();
                }

                @Override
                public final int getIntrinsicWidth() {
/* 3 */             return this.I00iOIl.getIntrinsicWidth();
                }

                @Override
                public final int getMinimumHeight() {
/* 3 */             return this.I00iOIl.getMinimumHeight();
                }

                @Override
                public final int getMinimumWidth() {
/* 3 */             return this.I00iOIl.getMinimumWidth();
                }

                @Override
                public final int getOpacity() {
/* 3 */             return this.I00iOIl.getOpacity();
                }

                @Override
                public final boolean getPadding(Rect rect) {
/* 3 */             return this.I00iOIl.getPadding(rect);
                }

                @Override
                public final int[] getState() {
/* 3 */             return this.I00iOIl.getState();
                }

                @Override
                public final Region getTransparentRegion() {
/* 3 */             return this.I00iOIl.getTransparentRegion();
                }

                @Override
                public final void invalidateDrawable(Drawable drawable) {
/* 1 */             invalidateSelf();
                }

                @Override
                public final boolean isAutoMirrored() {
/* 3 */             return this.I00iOIl.isAutoMirrored();
                }

                @Override
                public final boolean isStateful() {
/* 3 */             return this.I00iOIl.isStateful();
                }

                @Override
                public final void jumpToCurrentState() {
/* 3 */             this.I00iOIl.jumpToCurrentState();
                }

                @Override
                public final void onBoundsChange(Rect rect) {
/* 3 */             this.I00iOIl.setBounds(rect);
                }

                @Override
                public final boolean onLevelChange(int i) {
/* 3 */             return this.I00iOIl.setLevel(i);
                }

                @Override
                public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
/* 1 */             scheduleSelf(runnable, j);
                }

                @Override
                public final void setAlpha(int i) {
/* 3 */             this.I00iOIl.setAlpha(i);
                }

                @Override
                public final void setAutoMirrored(boolean z) {
/* 3 */             this.I00iOIl.setAutoMirrored(z);
                }

                @Override
                public final void setChangingConfigurations(int i) {
/* 3 */             this.I00iOIl.setChangingConfigurations(i);
                }

                @Override
                public final void setColorFilter(ColorFilter colorFilter) {
/* 3 */             this.I00iOIl.setColorFilter(colorFilter);
                }

                @Override
                public final void setDither(boolean z) {
/* 3 */             this.I00iOIl.setDither(z);
                }

                @Override
                public final void setFilterBitmap(boolean z) {
/* 3 */             this.I00iOIl.setFilterBitmap(z);
                }

                @Override
                public final void setHotspot(float f, float f2) {
/* 3 */             if (this.I00iiI) {
/* 5 */                 I00000oOI(f, f2);
                    }
                }

                @Override
                public final void setHotspotBounds(int i, int i2, int i3, int i4) {
/* 3 */             if (this.I00iiI) {
/* 5 */                 I0000Il00O(i, i2, i3, i4);
                    }
                }

                @Override
                public final boolean setState(int[] iArr) {
/* 3 */             if (this.I00iiI) {
/* 7 */                 return this.I00iOIl.setState(iArr);
                    }
/* 12 */            return false;
                }

                @Override
                public final void setTint(int i) {
/* 3 */             this.I00iOIl.setTint(i);
                }

                @Override
                public final void setTintList(ColorStateList colorStateList) {
/* 3 */             this.I00iOIl.setTintList(colorStateList);
                }

                @Override
                public final void setTintMode(PorterDuff.Mode mode) {
/* 3 */             this.I00iOIl.setTintMode(mode);
                }

                @Override
                public final boolean setVisible(boolean z, boolean z2) {
/* 3 */             if (this.I00iiI) {
/* 5 */                 return I0000O(z, z2);
                    }
/* 10 */            return false;
                }

                @Override
                public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
/* 1 */             unscheduleSelf(runnable);
                }
            }

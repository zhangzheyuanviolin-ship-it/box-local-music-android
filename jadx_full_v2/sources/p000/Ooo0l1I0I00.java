            package p000;

            import android.content.res.Resources;
            import android.graphics.PorterDuff;
            import android.graphics.Rect;
            import android.graphics.Region;
            import android.graphics.drawable.Drawable;
            
            public abstract class Ooo0l1I0I00 extends Drawable {
                public Drawable I00iOIl;

                @Override
                public void applyTheme(Resources.Theme theme) {
/* 1 */             Drawable drawable = this.I00iOIl;
/* 3 */             if (drawable != null) {
/* 5 */                 drawable.applyTheme(theme);
                    }
                }

                @Override
                public final void clearColorFilter() {
/* 1 */             Drawable drawable = this.I00iOIl;
/* 3 */             if (drawable != null) {
/* 5 */                 drawable.clearColorFilter();
                    } else {
/* 9 */                 super.clearColorFilter();
                    }
                }

                @Override
                public final Drawable getCurrent() {
/* 1 */             Drawable drawable = this.I00iOIl;
                    return drawable != null ? drawable.getCurrent() : super.getCurrent();
                }

                @Override
                public final int getMinimumHeight() {
/* 1 */             Drawable drawable = this.I00iOIl;
                    return drawable != null ? drawable.getMinimumHeight() : super.getMinimumHeight();
                }

                @Override
                public final int getMinimumWidth() {
/* 1 */             Drawable drawable = this.I00iOIl;
                    return drawable != null ? drawable.getMinimumWidth() : super.getMinimumWidth();
                }

                @Override
                public final boolean getPadding(Rect rect) {
/* 1 */             Drawable drawable = this.I00iOIl;
                    return drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
                }

                @Override
                public final int[] getState() {
/* 1 */             Drawable drawable = this.I00iOIl;
                    return drawable != null ? drawable.getState() : super.getState();
                }

                @Override
                public final Region getTransparentRegion() {
/* 1 */             Drawable drawable = this.I00iOIl;
                    return drawable != null ? drawable.getTransparentRegion() : super.getTransparentRegion();
                }

                @Override
                public final void jumpToCurrentState() {
/* 1 */             Drawable drawable = this.I00iOIl;
/* 3 */             if (drawable != null) {
/* 5 */                 drawable.jumpToCurrentState();
                    }
                }

                @Override
                public boolean onLevelChange(int i) {
/* 1 */             Drawable drawable = this.I00iOIl;
                    return drawable != null ? drawable.setLevel(i) : super.onLevelChange(i);
                }

                @Override
                public final void setChangingConfigurations(int i) {
/* 1 */             Drawable drawable = this.I00iOIl;
/* 3 */             if (drawable != null) {
/* 5 */                 drawable.setChangingConfigurations(i);
                    } else {
/* 9 */                 super.setChangingConfigurations(i);
                    }
                }

                @Override
                public final void setColorFilter(int i, PorterDuff.Mode mode) {
/* 1 */             Drawable drawable = this.I00iOIl;
/* 3 */             if (drawable != null) {
/* 5 */                 drawable.setColorFilter(i, mode);
                    } else {
/* 9 */                 super.setColorFilter(i, mode);
                    }
                }

                @Override
                public final void setFilterBitmap(boolean z) {
/* 1 */             Drawable drawable = this.I00iOIl;
/* 3 */             if (drawable != null) {
/* 5 */                 drawable.setFilterBitmap(z);
                    }
                }

                @Override
                public final void setHotspot(float f, float f2) {
/* 1 */             Drawable drawable = this.I00iOIl;
/* 3 */             if (drawable != null) {
/* 5 */                 drawable.setHotspot(f, f2);
                    }
                }

                @Override
                public final void setHotspotBounds(int i, int i2, int i3, int i4) {
/* 1 */             Drawable drawable = this.I00iOIl;
/* 3 */             if (drawable != null) {
/* 5 */                 drawable.setHotspotBounds(i, i2, i3, i4);
                    }
                }

                @Override
                public final boolean setState(int[] iArr) {
/* 1 */             Drawable drawable = this.I00iOIl;
                    return drawable != null ? drawable.setState(iArr) : super.setState(iArr);
                }
            }

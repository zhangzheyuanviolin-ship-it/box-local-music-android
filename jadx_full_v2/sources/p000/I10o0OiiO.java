            package p000;

            import android.content.res.Resources;
            import android.graphics.drawable.Drawable;
            
/* 19 */    public final class I10o0OiiO extends Drawable.ConstantState {
                public final Drawable.ConstantState I00000oIO;

                public I10o0OiiO(Drawable.ConstantState constantState) {
/* 4 */             this.I00000oIO = constantState;
                }

                @Override
                public final boolean canApplyTheme() {
/* 3 */             return this.I00000oIO.canApplyTheme();
                }

                @Override
                public final int getChangingConfigurations() {
/* 3 */             return this.I00000oIO.getChangingConfigurations();
                }

                @Override
                public final Drawable newDrawable() {
/* 4 */             I10o0lIl i10o0lIl = new I10o0lIl(null);
/* 9 */             Drawable drawableNewDrawable = this.I00000oIO.newDrawable();
/* 13 */            i10o0lIl.I00iOIl = drawableNewDrawable;
/* 17 */            drawableNewDrawable.setCallback(i10o0lIl.I00ilO0);
/* 20 */            return i10o0lIl;
                }

                @Override
/* 20 */        public final Drawable newDrawable(Resources resources) {
/* 22 */            I10o0lIl i10o0lIl = new I10o0lIl(null);
/* 23 */            Drawable drawableNewDrawable = this.I00000oIO.newDrawable(resources);
                    i10o0lIl.I00iOIl = drawableNewDrawable;
/* 24 */            drawableNewDrawable.setCallback(i10o0lIl.I00ilO0);
                    return i10o0lIl;
                }

                @Override
/* 24 */        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
/* 26 */            I10o0lIl i10o0lIl = new I10o0lIl(null);
/* 27 */            Drawable drawableNewDrawable = this.I00000oIO.newDrawable(resources, theme);
                    i10o0lIl.I00iOIl = drawableNewDrawable;
/* 28 */            drawableNewDrawable.setCallback(i10o0lIl.I00ilO0);
                    return i10o0lIl;
                }
            }

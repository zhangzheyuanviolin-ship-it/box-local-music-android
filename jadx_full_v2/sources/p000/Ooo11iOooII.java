            package p000;

            import android.content.res.Resources;
            import android.graphics.drawable.Drawable;
            import android.graphics.drawable.VectorDrawable;
            
/* 15 */    public final class Ooo11iOooII extends Drawable.ConstantState {
                public final Drawable.ConstantState I00000oIO;

                public Ooo11iOooII(Drawable.ConstantState constantState) {
/* 4 */             this.I00000oIO = constantState;
                }

                @Override
                public final boolean canApplyTheme() {
/* 3 */             return this.I00000oIO.canApplyTheme();
                }

                @Override
                public int getChangingConfigurations() {
/* 3 */             return this.I00000oIO.getChangingConfigurations();
                }

                @Override
                public final Drawable newDrawable() {
/* 3 */             Ooo1IlOO ooo1IlOO = new Ooo1IlOO();
/* 14 */            ooo1IlOO.I00iOIl = (VectorDrawable) this.I00000oIO.newDrawable();
/* 20 */            return ooo1IlOO;
                }

                @Override
/* 16 */        public final Drawable newDrawable(Resources resources) {
/* 17 */            Ooo1IlOO ooo1IlOO = new Ooo1IlOO();
/* 18 */            ooo1IlOO.I00iOIl = (VectorDrawable) this.I00000oIO.newDrawable(resources);
                    return ooo1IlOO;
                }

                @Override
/* 18 */        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
/* 19 */            Ooo1IlOO ooo1IlOO = new Ooo1IlOO();
/* 21 */            ooo1IlOO.I00iOIl = (VectorDrawable) this.I00000oIO.newDrawable(resources, theme);
                    return ooo1IlOO;
                }
            }

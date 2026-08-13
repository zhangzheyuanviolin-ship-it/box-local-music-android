            package p000;

            import android.content.res.ColorStateList;
            import android.content.res.Resources;
            import android.graphics.Bitmap;
            import android.graphics.Paint;
            import android.graphics.PorterDuff;
            import android.graphics.drawable.Drawable;
            
/* 5 */     public final class Ooo11Ol1li extends Drawable.ConstantState {
                public int I00000oIO;
                public Ooo111OO I00000oOI;
                public ColorStateList I0000Il00O;
                public PorterDuff.Mode I0000O;
                public boolean I0000oI00;
                public Bitmap I0001Ioi1lo;
                public ColorStateList I000II;
                public PorterDuff.Mode I000O01llI0;
                public int I000OOo1O;
                public boolean I000OiO;
                public boolean I000iOII;
                public Paint I000l1;

                @Override
                public int getChangingConfigurations() {
/* 1 */             return this.I00000oIO;
                }

                @Override
                public final Drawable newDrawable() {
/* 3 */             return new Ooo1IlOO(this);
                }

                @Override
/* 6 */         public final Drawable newDrawable(Resources resources) {
/* 7 */             return new Ooo1IlOO(this);
                }
            }

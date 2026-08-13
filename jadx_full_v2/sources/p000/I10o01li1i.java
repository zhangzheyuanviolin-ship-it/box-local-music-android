            package p000;

            import android.animation.AnimatorSet;
            import android.content.res.Resources;
            import android.graphics.drawable.Drawable;
            import java.util.ArrayList;
            
/* 7 */     public final class I10o01li1i extends Drawable.ConstantState {
                public Ooo1IlOO I00000oIO;
                public AnimatorSet I00000oOI;
                public ArrayList I0000Il00O;
                public I1Io0i0II I0000O;

                @Override
                public final int getChangingConfigurations() {
/* 1 */             return 0;
                }

                @Override
                public final Drawable newDrawable() {
/* 20 */            throw new IllegalStateException("No constant state support for SDK < 24.");
                }

                @Override
/* 8 */         public final Drawable newDrawable(Resources resources) {
/* 9 */             throw new IllegalStateException("No constant state support for SDK < 24.");
                }
            }

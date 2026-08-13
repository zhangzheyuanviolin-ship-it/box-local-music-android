            package p000;

            import android.graphics.Outline;
            import android.view.View;
            import android.view.ViewOutlineProvider;
            
            public final class Iii0oIO extends ViewOutlineProvider {
                public final int I00000oIO;

                @Override
                public final void getOutline(View view, Outline outline) {
                    switch (this.I00000oIO) {
                        case 0:
/* 52 */                    outline.setRect(0, 0, view.getWidth(), view.getHeight());
/* 55 */                    outline.setAlpha(0.0f);
/* 58 */                    return;
                        case 1:
/* 37 */                    outline.setRect(0, 0, view.getWidth(), view.getHeight());
/* 40 */                    outline.setAlpha(0.0f);
/* 43 */                    return;
                        case 2:
/* 22 */                    outline.setRect(0, 0, view.getWidth(), view.getHeight());
/* 25 */                    outline.setAlpha(0.0f);
/* 28 */                    return;
                        default:
/* 13 */                    throw new ClassCastException();
                    }
                }
            }

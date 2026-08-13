            package p000;

            import android.content.Context;
            import android.view.PointerIcon;
            import android.view.View;
            
            public final class I0lli1i010 {
                public static final I0lli1i010 I00000oIO = new I0lli1i010();

                public final void I00000oIO(View view, OO1iIiOoO0 oO1iIiOoO0) {
/* 1 */             Context context = view.getContext();
/* 20 */            PointerIcon systemIcon = oO1iIiOoO0 instanceof I0olOlooIO0o ? PointerIcon.getSystemIcon(context, ((I0olOlooIO0o) oO1iIiOoO0).I00000oOI) : PointerIcon.getSystemIcon(context, 1000);
/* 32 */            if (O0000Ioio00.I0000O(view.getPointerIcon(), systemIcon)) {
/* 37 */                return;
                    }
/* 34 */            view.setPointerIcon(systemIcon);
                }
            }

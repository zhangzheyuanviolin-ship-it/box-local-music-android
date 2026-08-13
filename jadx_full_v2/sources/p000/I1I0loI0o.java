            package p000;

            import android.content.res.Resources;
            import android.widget.ThemedSpinnerAdapter;
            import java.util.Objects;
            
            public abstract class I1I0loI0o {
                public static void I00000oIO(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
/* 9 */             if (Objects.equals(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
/* 37 */                return;
                    }
/* 11 */            themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            }

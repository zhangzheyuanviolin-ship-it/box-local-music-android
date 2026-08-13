            package p000;

            import android.graphics.PorterDuff;
            import android.graphics.Rect;
            
            public abstract class IiloO11l {
                public static final int I00000oIO = 0;

                static {
/* 3 */             new Rect();
                }

                public static PorterDuff.Mode I00000oIO(int i, PorterDuff.Mode mode) {
/* 2 */             if (i == 3) {
/* 30 */                return PorterDuff.Mode.SRC_OVER;
                    }
/* 5 */             if (i == 5) {
/* 27 */                return PorterDuff.Mode.SRC_IN;
                    }
/* 9 */             if (i == 9) {
/* 24 */                return PorterDuff.Mode.SRC_ATOP;
                    }
                    switch (i) {
                        case 14:
/* 21 */                    return PorterDuff.Mode.MULTIPLY;
                        case 15:
/* 18 */                    return PorterDuff.Mode.SCREEN;
                        case 16:
/* 15 */                    return PorterDuff.Mode.ADD;
                        default:
/* 14 */                    return mode;
                    }
                }
            }

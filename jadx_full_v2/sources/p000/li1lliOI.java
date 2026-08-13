            package p000;

            import android.graphics.PorterDuff;
            
            public abstract class li1lliOI {
                public static PorterDuff.Mode I00000oIO(int i) {
/* 1 */             PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
/* 4 */             if (i == 3) {
/* 30 */                return PorterDuff.Mode.SRC_OVER;
                    }
/* 7 */             if (i != 5) {
/* 11 */                if (i == 9) {
/* 26 */                    return PorterDuff.Mode.SRC_ATOP;
                        }
                        switch (i) {
                            case 14:
/* 23 */                        return PorterDuff.Mode.MULTIPLY;
                            case 15:
/* 20 */                        return PorterDuff.Mode.SCREEN;
                            case 16:
/* 17 */                        return PorterDuff.Mode.ADD;
                        }
                    }
/* 29 */            return mode;
                }
            }

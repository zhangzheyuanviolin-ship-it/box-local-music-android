            package p000;

            import android.graphics.Bitmap;
            
            public final class I0oO00o {
                public final Bitmap I00000oIO;

                public I0oO00o(Bitmap bitmap) {
/* 4 */             this.I00000oIO = bitmap;
                }

                public final int I00000oIO() {
/* 3 */             Bitmap.Config config = this.I00000oIO.getConfig();
/* 9 */             if (config == Bitmap.Config.ALPHA_8) {
/* 11 */                return 1;
                    }
/* 15 */            if (config == Bitmap.Config.RGB_565) {
/* 17 */                return 2;
                    }
/* 21 */            if (config == Bitmap.Config.ARGB_4444) {
/* 36 */                return 0;
                    }
/* 26 */            if (config == Bitmap.Config.RGBA_F16) {
/* 28 */                return 3;
                    }
                    return config == Bitmap.Config.HARDWARE ? 4 : 0;
                }
            }

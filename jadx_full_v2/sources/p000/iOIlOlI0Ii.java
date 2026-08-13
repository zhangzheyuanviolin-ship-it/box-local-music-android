            package p000;

            import android.graphics.Bitmap;
            
            public abstract class iOIlOlI0Ii {
                public static final Bitmap I00000oIO(I0oO00o i0oO00o) {
/* 3 */             if (i0oO00o instanceof I0oO00o) {
/* 5 */                 return i0oO00o.I00000oIO;
                    }
/* 10 */            OoOil11Ol1o.I000OiO("Unable to obtain android.graphics.Bitmap");
/* 13 */            return null;
                }

                public static final Bitmap.Config I00000oOI(int i) {
                    return i == 0 ? Bitmap.Config.ARGB_8888 : i == 1 ? Bitmap.Config.ALPHA_8 : i == 2 ? Bitmap.Config.RGB_565 : i == 3 ? Bitmap.Config.RGBA_F16 : i == 4 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
                }
            }

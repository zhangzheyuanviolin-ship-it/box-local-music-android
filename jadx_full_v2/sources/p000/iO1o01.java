            package p000;

            import android.graphics.Bitmap;
            
            public abstract class iO1o01 {
                public static final int I00000oIO(Bitmap bitmap) {
/* 5 */             if (!bitmap.isRecycled()) {
                        try {
/* 7 */                     return bitmap.getAllocationByteCount();
                        } catch (Exception unused) {
/* 20 */                    int height = bitmap.getHeight() * bitmap.getWidth();
/* 21 */                    Bitmap.Config config = bitmap.getConfig();
/* 51 */                    return height * (config == Bitmap.Config.ALPHA_8 ? 1 : (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) ? 2 : config == Bitmap.Config.RGBA_F16 ? 8 : 4);
                        }
                    }
/* 57 */            StringBuilder sb = new StringBuilder("Cannot obtain size for recycled bitmap: ");
/* 60 */            sb.append(bitmap);
/* 63 */            int width = bitmap.getWidth();
/* 67 */            int height2 = bitmap.getHeight();
/* 71 */            Bitmap.Config config2 = bitmap.getConfig();
/* 77 */            sb.append(" [");
/* 80 */            sb.append(width);
/* 85 */            sb.append(" x ");
/* 88 */            sb.append(height2);
/* 93 */            sb.append("] + ");
/* 96 */            sb.append(config2);
/* 168 */           throw new IllegalStateException(sb.toString().toString());
                }
            }

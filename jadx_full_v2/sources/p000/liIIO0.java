            package p000;

            import android.os.Build;
            import android.view.View;
            import android.view.Window;
            import com.google.mlkit.vision.barcode.common.Barcode;
            
            public abstract class liIIO0 {
                public static void I00000oIO(Window window, boolean z) {
/* 5 */             if (Build.VERSION.SDK_INT >= 35) {
/* 7 */                 window.setDecorFitsSystemWindows(z);
/* 10 */                return;
                    }
/* 11 */            View decorView = window.getDecorView();
/* 15 */            int systemUiVisibility = decorView.getSystemUiVisibility();
/* 26 */            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-257) : systemUiVisibility | Barcode.FORMAT_QR_CODE);
/* 29 */            window.setDecorFitsSystemWindows(z);
                }
            }

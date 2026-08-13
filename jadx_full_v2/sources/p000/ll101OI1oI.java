            package p000;

            import android.content.Context;
            import android.os.SystemClock;
            import java.io.File;
            
            public abstract class ll101OI1oI {
                public static File I00000oIO(Context context) {
/* 1 */             File filesDir = context.getFilesDir();
/* 5 */             if (filesDir != null) {
/* 29 */                return filesDir;
                    }
/* 9 */             SystemClock.sleep(100L);
/* 12 */            File filesDir2 = context.getFilesDir();
/* 16 */            if (filesDir2 != null) {
/* 18 */                return filesDir2;
                    }
/* 21 */            I000II.I001IO000("getFilesDir returned null twice.");
/* 24 */            return null;
                }
            }

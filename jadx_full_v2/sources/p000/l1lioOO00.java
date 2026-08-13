            package p000;

            import android.content.res.AssetManager;
            import android.util.Log;
            import java.io.InputStream;
            
            public abstract class l1lioOO00 {
                public static AssetManager I00000oIO;

                public static InputStream I00000oIO(String str) {
/* 3 */             if (I00000oIO == null) {
/* 9 */                 Log.e("PdfBox-Android", "PDFBoxResourceLoader is not initialized, call PDFBoxResourceLoader.init() before use");
                    }
/* 14 */            return I00000oIO.open(str);
                }

                public static boolean I00000oOI() {
                    return I00000oIO != null;
                }
            }

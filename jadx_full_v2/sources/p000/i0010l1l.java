            package p000;

            import android.content.Context;
            import java.io.File;
            import java.io.IOException;
            
            public final class i0010l1l {
                public static final String[] I0000Il00O = {"app_webview/", "databases/", "lib/", "shared_prefs/", "code_cache/"};
                public final int I00000oIO;
                public Object I00000oOI;

                public boolean I00000oIO(Context context) throws IOException {
/* 5 */             String strI00000oOI = I1O0ol.I00000oOI((File) this.I00000oOI);
/* 13 */            String strI00000oOI2 = I1O0ol.I00000oOI(context.getCacheDir());
/* 21 */            String strI00000oOI3 = I1O0ol.I00000oOI(context.getDataDir());
/* 30 */            if ((!strI00000oOI.startsWith(strI00000oOI2) && !strI00000oOI.startsWith(strI00000oOI3)) || strI00000oOI.equals(strI00000oOI2) || strI00000oOI.equals(strI00000oOI3)) {
/* 29 */                return false;
                    }
/* 54 */            for (int i = 0; i < 5; i++) {
/* 76 */                if (strI00000oOI.startsWith(strI00000oOI3 + I0000Il00O[i])) {
/* 29 */                    return false;
                        }
                    }
/* 82 */            return true;
                }
            }

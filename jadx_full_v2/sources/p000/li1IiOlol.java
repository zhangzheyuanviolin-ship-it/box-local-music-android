            package p000;

            import android.content.Context;
            import java.io.IOException;
            import java.io.InputStream;
            
            public abstract class li1IiOlol {
                public static Context I00000oIO;

                public static final byte[] I00000oIO(String str) throws IOException {
                    try {
/* 4 */                 String strI00000oIO = lIoi00.I00000oIO(str);
/* 12 */                if (OlOolloIIOl0.I000l1(strI00000oIO, "file:///android_asset/", false)) {
/* 14 */                    strI00000oIO = OlOoOIi0o.I00IOO("file:///android_asset/", strI00000oIO);
                        }
/* 21 */                Context context = I00000oIO;
/* 23 */                if (context == null) {
/* 50 */                    O0000Ioio00.I000OOo1O("appContext");
/* 54 */                    throw null;
                        }
/* 29 */                InputStream inputStreamOpen = context.getAssets().open(strI00000oIO);
                        try {
/* 33 */                    byte[] bArrI00000oOI = iOiOlIoI.I00000oOI(inputStreamOpen);
/* 37 */                    inputStreamOpen.close();
/* 40 */                    return bArrI00000oOI;
                        } finally {
                        }
                    } catch (Exception e) {
/* 55 */                e.printStackTrace();
/* 58 */                return new byte[0];
                    }
                }
            }

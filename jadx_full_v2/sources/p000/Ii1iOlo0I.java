            package p000;

            import android.content.res.AssetManager;
            import java.io.FileNotFoundException;
            import java.io.IOException;
            import java.io.InputStream;
            
            public final class Ii1iOlo0I {
                public static final Ii1iOlo0I I00000oIO = new Ii1iOlo0I();
                public static final OllO00oiil I00000oOI = new OllO00oiil(new IOlIlo1(13));

                public static boolean I00000oIO(AssetManager assetManager, String str) throws IOException {
/* 1 */             if (assetManager == null) {
/* 23 */                throw new FileNotFoundException("Current AssetManager is null.");
                    }
                    try {
/* 3 */                 InputStream inputStreamOpen = assetManager.open(str);
/* 7 */                 if (inputStreamOpen != null) {
/* 9 */                     inputStreamOpen.close();
/* 12 */                    return true;
                        }
/* 23 */                throw new FileNotFoundException("Current AssetManager is null.");
                    } catch (FileNotFoundException unused) {
/* 25 */                return false;
                    }
                }
            }

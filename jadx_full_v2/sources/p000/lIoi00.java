            package p000;

            import android.content.res.AssetManager;
            import android.net.Uri;
            import java.net.URISyntaxException;
            import java.net.URL;
            
            public abstract class lIoi00 {
                /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static String I00000oIO(String str) throws I1o1lOlooI1, URISyntaxException {
                    Object uri;
                    AssetManager assets;
/* 3 */             String strConcat = "composeResources/io.github.darriousliu.katex.core.resources/".concat(str);
/* 9 */             Oi0lolOl010.I00000oIO.getClass();
/* 24 */            if (!Ii1iOlo0I.I00000oIO((AssetManager) Ii1iOlo0I.I00000oOI.getValue(), strConcat)) {
                        try {
/* 31 */                    assets = I0loll0l.I00000oIO().getAssets();
                        } catch (NoClassDefFoundError unused) {
/* 36 */                    assets = null;
                        }
/* 41 */                if (Ii1iOlo0I.I00000oIO(assets, strConcat)) {
/* 88 */                    uri = Uri.parse("file:///android_asset/".concat(strConcat));
                        } else {
/* 46 */                    ClassLoader classLoader = Ii1iOlo0I.class.getClassLoader();
/* 50 */                    if (classLoader == null) {
/* 78 */                        I000II.I001IO000("Cannot find class loader");
/* 26 */                        return null;
                            }
/* 52 */                    URL resource = classLoader.getResource(strConcat);
/* 56 */                    if (resource == null) {
/* 75 */                        throw new I1o1lOlooI1("Missing resource with path: ".concat(strConcat), 6);
                            }
/* 58 */                    uri = resource.toURI();
                        }
                    }
/* 92 */            return uri.toString();
                }
            }

            package p000;

            import android.graphics.Bitmap;
            import android.net.Uri;
            import android.webkit.MimeTypeMap;
            import java.io.Closeable;
            import java.util.ArrayList;
            
            public abstract class I000O01llI0 {
                public static final Bitmap.Config[] I00000oIO = {Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16};
                public static final Bitmap.Config I00000oOI = Bitmap.Config.HARDWARE;
                public static final Io1Io0OOi011 I0000Il00O = new Io1Io0OOi011((String[]) new ArrayList(20).toArray(new String[0]));

                public static final void I00000oIO(Closeable closeable) {
                    try {
/* 1 */                 closeable.close();
                    } catch (RuntimeException e) {
/* 29 */                throw e;
                    } catch (Exception unused) {
                    }
                }

                public static final String I00000oOI(MimeTypeMap mimeTypeMap, String str) {
/* 1 */             if (str == null || OlOoOIi0o.I001l0I00(str)) {
/* 58 */                return null;
                    }
/* 14 */            int iI001lllioOl = OlOoOIi0o.I001lllioOl(str, '#', 0, 6);
/* 19 */            if (iI001lllioOl != -1) {
/* 22 */                str = str.substring(0, iI001lllioOl);
                    }
/* 28 */            int iI001lllioOl2 = OlOoOIi0o.I001lllioOl(str, '?', 0, 6);
/* 32 */            if (iI001lllioOl2 != -1) {
/* 35 */                str = str.substring(0, iI001lllioOl2);
                    }
/* 53 */            return mimeTypeMap.getMimeTypeFromExtension(OlOoOIi0o.I00O0i0ii('.', OlOoOIi0o.I00O0i0ii('/', str, str), ""));
                }

                public static final boolean I0000Il00O(Uri uri) {
                    return O0000Ioio00.I0000O(uri.getScheme(), "file") && O0000Ioio00.I0000O((String) IOOi0Ool1i.I00II0Ol1O0l(uri.getPathSegments()), "android_asset");
                }

                public static final int I0000O(il1OioiO il1oioio, OiO0llO0IO oiO0llO0IO) {
/* 3 */             if (il1oioio instanceof Iii10I11ll0) {
/* 7 */                 return ((Iii10I11ll0) il1oioio).I00000oIO;
                    }
/* 10 */            int iOrdinal = oiO0llO0IO.ordinal();
/* 14 */            if (iOrdinal == 0) {
/* 28 */                return Integer.MIN_VALUE;
                    }
/* 17 */            if (iOrdinal == 1) {
/* 19 */                return Integer.MAX_VALUE;
                    }
/* 23 */            I000II.I00000oIO();
/* 26 */            return 0;
                }
            }

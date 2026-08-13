            package p000;

            import android.content.Context;
            import android.graphics.Bitmap;
            import android.graphics.BitmapFactory;
            import android.graphics.Matrix;
            import android.net.Uri;
            import java.io.FileInputStream;
            import java.io.InputStream;
            
            public abstract class li10oO000 {
                public static final String I00000oIO(String str) {
/* 5 */             int iI001i1lo1io = OlOoOIi0o.I001i1lo1io(str, "=== Source Location Trace", 0, false, 6);
                    return iI001i1lo1io >= 0 ? str.substring(0, iI001i1lo1io) : str;
                }

                public static final Bitmap I00000oOI(Context context, Uri uri) {
                    InputStream fileInputStream;
                    InputStream fileInputStream2;
/* 3 */             BitmapFactory.Options options = new BitmapFactory.Options();
/* 7 */             options.inJustDecodeBounds = true;
/* 17 */            if (uri.getScheme() == null || O0000Ioio00.I0000O(uri.getScheme(), "file")) {
/* 41 */                String path = uri.getPath();
/* 45 */                if (path == null) {
/* 13 */                    path = "";
                        }
/* 48 */                fileInputStream = new FileInputStream(path);
                    } else {
/* 34 */                fileInputStream = context.getContentResolver().openInputStream(uri);
                    }
/* 52 */            if (fileInputStream2 != null) {
                        try {
/* 54 */                    BitmapFactory.decodeStream(fileInputStream2, null, options);
/* 57 */                    fileInputStream2.close();
                        } finally {
                        }
                    }
/* 68 */            int i = options.outHeight;
/* 70 */            int i2 = options.outWidth;
/* 96 */            options.inSampleSize = (i > 1024 || i2 > 1024) ? Math.max(O1OooO0IlOo.I000II(i / 1024.0f), O1OooO0IlOo.I000II(i2 / 1024.0f)) : 1;
/* 99 */            options.inJustDecodeBounds = false;
/* 105 */           if (uri.getScheme() == null || O0000Ioio00.I0000O(uri.getScheme(), "file")) {
/* 129 */               String path2 = uri.getPath();
/* 137 */               fileInputStream2 = new FileInputStream(path2 != null ? path2 : "");
                    } else {
/* 122 */               fileInputStream2 = context.getContentResolver().openInputStream(uri);
                    }
/* 140 */           if (fileInputStream2 == null) {
/* 51 */                return null;
                    }
                    try {
/* 142 */               Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStream2, null, options);
/* 146 */               fileInputStream2.close();
/* 149 */               return bitmapDecodeStream;
                    } finally {
                        try {
/* 151 */                   throw th;
                        } finally {
                        }
                    }
                }

                public static final Bitmap I0000Il00O(Bitmap bitmap, int i) {
/* 3 */             Matrix matrix = new Matrix();
                    switch (i) {
                        case 2:
/* 50 */                    matrix.preScale(-1.0f, 1.0f);
                            break;
                        case 3:
/* 46 */                    matrix.postRotate(180.0f);
                            break;
                        case 4:
/* 40 */                    matrix.preScale(1.0f, -1.0f);
                            break;
                        case 5:
/* 33 */                    matrix.postRotate(90.0f);
/* 36 */                    matrix.preScale(-1.0f, 1.0f);
                            break;
                        case 6:
/* 29 */                    matrix.postRotate(90.0f);
                            break;
                        case 7:
/* 22 */                    matrix.postRotate(270.0f);
/* 25 */                    matrix.preScale(-1.0f, 1.0f);
                            break;
                        case 8:
/* 18 */                    matrix.postRotate(270.0f);
                            break;
                        default:
/* 17 */                    return bitmap;
                    }
/* 65 */            return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                }
            }

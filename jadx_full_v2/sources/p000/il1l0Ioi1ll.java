            package p000;

            import android.content.Context;
            import android.database.Cursor;
            import android.net.Uri;
            import android.util.Log;
            
            public abstract class il1l0Ioi1ll {
                public static void I00000oIO(Cursor cursor) {
/* 1 */             if (cursor != null) {
                        try {
/* 3 */                     IIl001iO0Io.I001i1lo1io(cursor);
                        } catch (RuntimeException e) {
/* 8 */                     throw e;
                        } catch (Exception unused) {
                        }
                    }
                }

                public static String I00000oOI(Context context, Uri uri, String str) throws Throwable {
                    Cursor cursorQuery;
                    Throwable th;
                    Exception exc;
                    try {
/* 16 */                cursorQuery = context.getContentResolver().query(uri, new String[]{str}, null, null, null);
                        try {
                            try {
/* 24 */                        if (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) {
/* 47 */                            I00000oIO(cursorQuery);
/* 7 */                             return null;
                                }
/* 33 */                        String string = cursorQuery.getString(0);
/* 37 */                        I00000oIO(cursorQuery);
/* 40 */                        return string;
                            } catch (Exception e) {
/* 45 */                        exc = e;
/* 74 */                        Log.w("DocumentFile", "Failed query: " + exc);
/* 77 */                        I00000oIO(cursorQuery);
/* 7 */                         return null;
                            }
                        } catch (Throwable th2) {
/* 42 */                    th = th2;
/* 81 */                    I00000oIO(cursorQuery);
/* 98 */                    throw th;
                        }
                    } catch (Exception e2) {
/* 58 */                exc = e2;
/* 59 */                cursorQuery = null;
                    } catch (Throwable th3) {
/* 54 */                cursorQuery = null;
/* 55 */                th = th3;
/* 81 */                I00000oIO(cursorQuery);
/* 98 */                throw th;
                    }
                }
            }

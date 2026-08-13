            package p000;

            import android.content.ContentResolver;
            import android.content.ContentValues;
            import android.content.Context;
            import android.net.Uri;
            import android.os.Environment;
            import android.provider.MediaStore;
            import java.io.OutputStream;
            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIO1OIo01l1;", "LOooioIIoi0O;", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class IO1OIo01l1 extends OooioIIoi0O {
                public IO1loOo1o I00000oOI;
                public OOli1O I0000Il00O;
                public OlO0OIIl1 I0000O;
                public OOli1O I0000oI00;

                public static boolean I0000oI00(Context context, String str, String str2) {
/* 3 */             ContentValues contentValues = new ContentValues();
/* 8 */             contentValues.put("_display_name", str);
/* 15 */            contentValues.put("mime_type", "text/plain");
/* 22 */            contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
/* 32 */            contentValues.put("is_pending", (Integer) 1);
/* 35 */            ContentResolver contentResolver = context.getContentResolver();
/* 41 */            Uri uriInsert = contentResolver.insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues);
/* 46 */            if (uriInsert == null) {
/* 45 */                return false;
                    }
/* 49 */            OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
/* 53 */            if (outputStreamOpenOutputStream != null) {
                        try {
/* 61 */                    outputStreamOpenOutputStream.write(str2.getBytes(IO1IOI.I00000oIO));
/* 64 */                    outputStreamOpenOutputStream.close();
                        } finally {
                        }
                    }
/* 75 */            contentValues.clear();
/* 82 */            contentValues.put("is_pending", (Integer) 0);
/* 86 */            contentResolver.update(uriInsert, contentValues, null, null);
/* 25 */            return true;
                }
            }

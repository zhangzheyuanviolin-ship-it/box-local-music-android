            package androidx.startup;

            import android.content.ComponentName;
            import android.content.ContentProvider;
            import android.content.ContentValues;
            import android.content.Context;
            import android.content.pm.PackageManager;
            import android.database.Cursor;
            import android.net.Uri;
            import android.os.Trace;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import p000.IOO000ilo;
            import p000.IOiIIo1l;
            import p000.lOo0I0iOi11O;
            
            public class InitializationProvider extends ContentProvider {
                @Override
                public final int delete(Uri uri, String str, String[] strArr) {
/* 98 */            throw new IllegalStateException("Not allowed.");
                }

                @Override
                public final String getType(Uri uri) {
/* 29 */            throw new IllegalStateException("Not allowed.");
                }

                @Override
                public final Uri insert(Uri uri, ContentValues contentValues) {
/* 37 */            throw new IllegalStateException("Not allowed.");
                }

                @Override
                public final boolean onCreate() {
/* 1 */             Context context = getContext();
/* 7 */             if (context == null) {
/* 110 */               throw new IOiIIo1l("Context cannot be null", 8);
                    }
/* 13 */            if (context.getApplicationContext() == null) {
/* 68 */                return true;
                    }
/* 15 */            IOO000ilo iOO000iloI001IO000 = IOO000ilo.I001IO000(context);
/* 19 */            Class<?> cls = getClass();
/* 25 */            Context context2 = (Context) iOO000iloI001IO000.I00iio;
                    try {
                        try {
/* 29 */                    lOo0I0iOi11O.I00000oIO("Startup");
/* 49 */                    iOO000iloI001IO000.I00100l0(context2.getPackageManager().getProviderInfo(new ComponentName(context2, cls), Barcode.FORMAT_ITF).metaData);
/* 68 */                    return true;
                        } catch (PackageManager.NameNotFoundException e) {
/* 62 */                    throw new IOiIIo1l(e, 8);
                        }
                    } finally {
/* 64 */                Trace.endSection();
                    }
                }

                @Override
                public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
/* 399 */           throw new IllegalStateException("Not allowed.");
                }

                @Override
                public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
/* 204 */           throw new IllegalStateException("Not allowed.");
                }
            }

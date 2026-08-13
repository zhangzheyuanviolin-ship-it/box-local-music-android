            package com.google.firebase.provider;

            import android.content.ContentProvider;
            import android.content.ContentValues;
            import android.content.Context;
            import android.content.pm.ProviderInfo;
            import android.database.Cursor;
            import android.net.Uri;
            import android.os.SystemClock;
            import android.util.Log;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.atomic.AtomicBoolean;
            import p000.I000II;
            import p000.I1lIll0iI01i;
            import p000.IlIoliIO;
            import p000.lII0I0I000I;
            
            public class FirebaseInitProvider extends ContentProvider {
                public static final I1lIll0iI01i I00iOIl;
                public static final AtomicBoolean I00iiI;

                static {
/* 1 */             long jCurrentTimeMillis = System.currentTimeMillis();
/* 5 */             long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 9 */             long jUptimeMillis = SystemClock.uptimeMillis();
/* 15 */            I1lIll0iI01i i1lIll0iI01i = new I1lIll0iI01i();
/* 18 */            i1lIll0iI01i.I00000oIO = jCurrentTimeMillis;
/* 20 */            i1lIll0iI01i.I00000oOI = jElapsedRealtime;
/* 22 */            i1lIll0iI01i.I0000Il00O = jUptimeMillis;
/* 24 */            VarHandle.storeStoreFence();
/* 27 */            I00iOIl = i1lIll0iI01i;
/* 35 */            I00iiI = new AtomicBoolean(false);
                }

                @Override
                public final void attachInfo(Context context, ProviderInfo providerInfo) {
/* 3 */             lII0I0I000I.I000O01llI0("FirebaseInitProvider ProviderInfo cannot be null.", providerInfo);
/* 14 */            if ("com.google.firebase.firebaseinitprovider".equals(providerInfo.authority)) {
/* 22 */                I000II.I001IO000("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
                    } else {
/* 16 */                super.attachInfo(context, providerInfo);
                    }
                }

                @Override
                public final int delete(Uri uri, String str, String[] strArr) {
/* 1 */             return 0;
                }

                @Override
                public final String getType(Uri uri) {
/* 1 */             return null;
                }

                @Override
                public final Uri insert(Uri uri, ContentValues contentValues) {
/* 1 */             return null;
                }

                @Override
                public final boolean onCreate() {
/* 1 */             AtomicBoolean atomicBoolean = I00iiI;
                    try {
/* 5 */                 atomicBoolean.set(true);
/* 18 */                if (IlIoliIO.I0000oI00(getContext()) == null) {
/* 22 */                    Log.i("FirebaseInitProvider", "FirebaseApp initialization unsuccessful");
                        } else {
/* 30 */                    Log.i("FirebaseInitProvider", "FirebaseApp initialization successful");
                        }
/* 33 */                atomicBoolean.set(false);
/* 4 */                 return false;
                    } catch (Throwable th) {
/* 37 */                atomicBoolean.set(false);
/* 113 */               throw th;
                    }
                }

                @Override
                public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
/* 1 */             return null;
                }

                @Override
                public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
/* 1 */             return 0;
                }
            }

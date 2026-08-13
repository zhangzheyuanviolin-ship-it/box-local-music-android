            package com.google.mlkit.common.internal;

            import android.content.ContentProvider;
            import android.content.ContentValues;
            import android.content.Context;
            import android.content.pm.ProviderInfo;
            import android.database.Cursor;
            import android.net.Uri;
            import android.util.Log;
            import p000.O1o0111OI00;
            import p000.OloIo0oOIO0;
            import p000.lII0I0I000I;
            
            public class MlKitInitProvider extends ContentProvider {
                @Override
                public final void attachInfo(Context context, ProviderInfo providerInfo) {
/* 13 */            lII0I0I000I.I000OOo1O("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.", !providerInfo.authority.equals("com.google.mlkit.common.mlkitinitprovider"));
/* 16 */            super.attachInfo(context, providerInfo);
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
/* 1 */             Context context = getContext();
/* 6 */             if (context == null) {
/* 12 */                Log.i("MlKitInitProvider", "No context available. Manually call MlKit.initialize(), otherwise ML Kit will not be functional.");
/* 5 */                 return false;
                    }
                    synchronized (O1o0111OI00.I00000oOI) {
/* 21 */                O1o0111OI00.I0000O(context, OloIo0oOIO0.I00000oIO);
                    }
/* 5 */             return false;
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

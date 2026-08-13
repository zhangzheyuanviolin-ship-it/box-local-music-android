            package org.jetbrains.compose.resources;

            import android.content.ContentProvider;
            import android.content.ContentValues;
            import android.content.Context;
            import android.content.pm.ProviderInfo;
            import android.database.Cursor;
            import android.net.Uri;
            import p000.I000II;
            import p000.IOOlIIilOl0;
            
            public final class AndroidContextProvider extends ContentProvider {
                public static Context I00iOIl;

                @Override
                public final void attachInfo(Context context, ProviderInfo providerInfo) {
/* 1 */             if (providerInfo == null) {
/* 25 */                IOOlIIilOl0.I000II("AndroidContextProvider ProviderInfo cannot be null.");
                    } else if ("org.jetbrains.compose.components.resources.resources.AndroidContextProvider".equals(providerInfo.authority)) {
/* 19 */                I000II.I001IO000("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable your application's build.gradle.");
                    } else {
/* 13 */                super.attachInfo(context, providerInfo);
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
/* 5 */             I00iOIl = getContext();
/* 7 */             return true;
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

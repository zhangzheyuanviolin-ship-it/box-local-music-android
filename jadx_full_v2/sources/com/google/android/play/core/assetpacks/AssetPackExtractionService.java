            package com.google.android.play.core.assetpacks;

            import android.app.Service;
            import android.content.Intent;
            import android.os.IBinder;
            import p000.i0IOo0i0;
            import p000.i0IiOoOl;
            import p000.i0O0lO1il0;
            
            public class AssetPackExtractionService extends Service {
                public i0IiOoOl I00iOIl;

                @Override
                public final IBinder onBind(Intent intent) {
/* 1 */             return this.I00iOIl;
                }

                @Override
                public final void onCreate() {
/* 1 */             super.onCreate();
/* 22 */            this.I00iOIl = (i0IiOoOl) ((i0IOo0i0) i0O0lO1il0.I0000O(getApplicationContext()).I00iiI).I0000Il00O();
                }
            }

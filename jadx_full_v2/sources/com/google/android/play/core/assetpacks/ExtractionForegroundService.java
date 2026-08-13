            package com.google.android.play.core.assetpacks;

            import android.app.Service;
            import android.content.Intent;
            import android.os.IBinder;
            import p000.i0O0Ooi00;
            
            public class ExtractionForegroundService extends Service {
                public final i0O0Ooi00 I00iOIl = new i0O0Ooi00(this);

                @Override
                public final IBinder onBind(Intent intent) {
/* 1 */             return this.I00iOIl;
                }
            }

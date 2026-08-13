            package com.google.firebase.components;

            import android.app.Service;
            import android.content.Intent;
            import android.os.IBinder;
            
            public class ComponentDiscoveryService extends Service {
                @Override
                public final IBinder onBind(Intent intent) {
/* 1 */             return null;
                }
            }

            package p000;

            import android.app.NotificationManager;
            import android.content.Context;
            import android.content.SharedPreferences;
            import android.os.Binder;
            import android.util.Log;
            
            public final class OOiO0lIIlO0i implements Runnable {
                public Context I00iOIl;
                public boolean I00iiI;
                public OloIlI0ll I00iiO;

                @Override
                public final void run() {
/* 1 */             Context context = this.I00iOIl;
/* 3 */             boolean z = this.I00iiI;
/* 5 */             OloIlI0ll oloIlI0ll = this.I00iiO;
                    try {
/* 26 */                if (!(Binder.getCallingUid() == context.getApplicationInfo().uid)) {
/* 46 */                    Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
/* 52 */                    return;
                        }
/* 59 */                SharedPreferences.Editor editorEdit = lIi0lOOo10.I00000oIO(context).edit();
/* 65 */                editorEdit.putBoolean("proxy_notification_initialized", true);
/* 68 */                editorEdit.apply();
/* 77 */                NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
/* 81 */                if (z) {
/* 83 */                    notificationManager.setNotificationDelegate("com.google.android.gms");
                        } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
/* 97 */                    notificationManager.setNotificationDelegate(null);
                        }
                    } finally {
/* 104 */               oloIlI0ll.I0000O(null);
                    }
                }
            }

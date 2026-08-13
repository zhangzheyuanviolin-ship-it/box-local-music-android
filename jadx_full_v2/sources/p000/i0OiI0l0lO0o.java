            package p000;

            import android.content.ComponentName;
            import android.content.ServiceConnection;
            import android.os.IBinder;
            
            public final class i0OiI0l0lO0o implements ServiceConnection {
                public i0Oii0oo1i I00iOIl;

                @Override
                public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
/* 1 */             i0Oii0oo1i i0oii0oo1i = this.I00iOIl;
/* 11 */            i0oii0oo1i.I00000oOI.I0000O("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
/* 23 */            i0oii0oo1i.I00000oIO().post(new i0IIl10ioI(this, iBinder));
                }

                @Override
                public final void onServiceDisconnected(ComponentName componentName) {
/* 1 */             i0Oii0oo1i i0oii0oo1i = this.I00iOIl;
/* 11 */            i0oii0oo1i.I00000oOI.I0000O("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
/* 24 */            i0oii0oo1i.I00000oIO().post(new i0Oi0IOl(this, 1));
                }
            }

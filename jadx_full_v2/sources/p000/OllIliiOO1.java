            package p000;

            import android.content.BroadcastReceiver;
            import android.content.Context;
            import android.content.Intent;
            import android.content.IntentFilter;
            import android.util.Log;
            import com.google.firebase.messaging.FirebaseMessaging;
            
            public final class OllIliiOO1 extends BroadcastReceiver {
                public OllIllO1O I00000oIO;
                public Context I00000oOI;

                public final void I00000oIO() {
/* 4 */             Log.isLoggable("FirebaseMessaging", 3);
/* 11 */            IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
/* 14 */            OllIllO1O ollIllO1O = this.I00000oIO;
/* 16 */            if (ollIllO1O != null) {
/* 22 */                Context context = ((FirebaseMessaging) ollIllO1O.I00iio).I00000oOI;
/* 24 */                this.I00000oOI = context;
/* 26 */                context.registerReceiver(this, intentFilter);
                    }
                }

                @Override
                public final void onReceive(Context context, Intent intent) {
/* 1 */             OllIllO1O ollIllO1O = this.I00000oIO;
/* 3 */             if (ollIllO1O != null && ollIllO1O.I00000oIO()) {
/* 16 */                Log.isLoggable("FirebaseMessaging", 3);
/* 19 */                OllIllO1O ollIllO1O2 = this.I00000oIO;
/* 21 */                Object obj = ollIllO1O2.I00iio;
/* 25 */                FirebaseMessaging.I00000oOI(ollIllO1O2, 0L);
/* 28 */                Context context2 = this.I00000oOI;
/* 30 */                if (context2 != null) {
/* 32 */                    context2.unregisterReceiver(this);
                        }
/* 36 */                this.I00000oIO = null;
                    }
                }
            }

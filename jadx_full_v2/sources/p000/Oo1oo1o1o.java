            package p000;

            import android.content.BroadcastReceiver;
            import android.content.Context;
            import android.content.Intent;
            import android.util.Log;
            import java.util.concurrent.TimeUnit;
            
            public final class Oo1oo1o1o extends BroadcastReceiver {
                public Oo1ooo0ollI I00000oIO;

                @Override
                public final synchronized void onReceive(Context context, Intent intent) {
/* 2 */             Oo1ooo0ollI oo1ooo0ollI = this.I00000oIO;
/* 4 */             if (oo1ooo0ollI == null) {
/* 7 */                 return;
                    }
/* 12 */            if (oo1ooo0ollI.I0000Il00O()) {
/* 19 */                Log.isLoggable("FirebaseMessaging", 3);
/* 22 */                Oo1ooo0ollI oo1ooo0ollI2 = this.I00000oIO;
/* 34 */                ((Oo1oo01i) oo1ooo0ollI2.I00ilO0).I0000oI00.schedule(oo1ooo0ollI2, 0L, TimeUnit.SECONDS);
/* 37 */                context.unregisterReceiver(this);
/* 41 */                this.I00000oIO = null;
                    }
                }
            }

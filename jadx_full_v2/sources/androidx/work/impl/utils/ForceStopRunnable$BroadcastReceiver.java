            package androidx.work.impl.utils;

            import android.app.AlarmManager;
            import android.app.PendingIntent;
            import android.content.BroadcastReceiver;
            import android.content.ComponentName;
            import android.content.Context;
            import android.content.Intent;
            import p000.IIi0oIl;
            import p000.IliliO1llI;
            
            public class ForceStopRunnable$BroadcastReceiver extends BroadcastReceiver {
                static {
/* 3 */             IIi0oIl.I000OiO("ForceStopRunnable$Rcvr");
                }

                @Override
                public final void onReceive(Context context, Intent intent) {
/* 1 */             if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
/* 106 */               return;
                    }
/* 19 */            IIi0oIl.I000II().getClass();
/* 22 */            String str = IliliO1llI.I00ilI0I1;
/* 30 */            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
/* 34 */            Intent intent2 = new Intent();
/* 44 */            intent2.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
/* 47 */            intent2.setAction("ACTION_FORCE_STOP_RESCHEDULE");
/* 53 */            PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent2, 167772160);
/* 63 */            long jCurrentTimeMillis = System.currentTimeMillis() + IliliO1llI.I00ilO0;
/* 64 */            if (alarmManager != null) {
/* 67 */                alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
                    }
                }
            }

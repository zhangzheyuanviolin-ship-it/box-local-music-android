            package p000;

            import android.content.Context;
            import android.os.PowerManager;
            
            public abstract class Oooooi0o01l {
                static {
/* 3 */             IIi0oIl.I000OiO("WakeLocks");
                }

                public static final PowerManager.WakeLock I00000oIO(Context context) {
/* 13 */            PowerManager powerManager = (PowerManager) context.getApplicationContext().getSystemService("power");
/* 17 */            String strConcat = "WorkManager: ".concat("ProcessorForegroundLck");
/* 22 */            PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, strConcat);
                    synchronized (Oooool0III1.I00000oIO) {
                    }
/* 38 */            return wakeLockNewWakeLock;
                }
            }

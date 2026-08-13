            package p000;

            import android.content.BroadcastReceiver;
            import android.content.Context;
            import android.content.Intent;
            import java.util.Iterator;
            import java.util.concurrent.atomic.AtomicReference;
            
            public final class IlIoioO00loO extends BroadcastReceiver {
                public static final AtomicReference I00000oOI = new AtomicReference();
                public Context I00000oIO;

                @Override
                public final void onReceive(Context context, Intent intent) {
                    synchronized (IlIoliIO.I000OiO) {
                        try {
/* 12 */                    Iterator it = ((I1IloI1ii0) IlIoliIO.I000iOII.values()).iterator();
/* 20 */                    while (it.hasNext()) {
/* 28 */                        ((IlIoliIO) it.next()).I0000O();
                            }
                        } catch (Throwable th) {
/* 89 */                    throw th;
                        }
                    }
/* 37 */            this.I00000oIO.unregisterReceiver(this);
                }
            }

            package androidx.work.impl.background.systemalarm;

            import android.content.BroadcastReceiver;
            import android.content.Context;
            import android.content.Intent;
            import java.util.Objects;
            import p000.IIi0oIl;
            import p000.i01IlOO;
            
            public class RescheduleReceiver extends BroadcastReceiver {
                public static final String I00000oIO = IIi0oIl.I000OiO("RescheduleReceiver");

                @Override
                public final void onReceive(Context context, Intent intent) {
/* 1 */             IIi0oIl iIi0oIlI000II = IIi0oIl.I000II();
/* 5 */             Objects.toString(intent);
/* 8 */             iIi0oIlI000II.getClass();
                    try {
/* 11 */                i01IlOO i01ilooI00000oOI = i01IlOO.I00000oOI(context);
/* 15 */                BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
                        synchronized (i01IlOO.I000o00OoI0I) {
                            try {
/* 22 */                        BroadcastReceiver.PendingResult pendingResult = i01ilooI00000oOI.I000OOo1O;
/* 24 */                        if (pendingResult != null) {
/* 26 */                            pendingResult.finish();
                                }
/* 32 */                        i01ilooI00000oOI.I000OOo1O = pendingResultGoAsync;
/* 36 */                        if (i01ilooI00000oOI.I000O01llI0) {
/* 38 */                            pendingResultGoAsync.finish();
/* 42 */                            i01ilooI00000oOI.I000OOo1O = null;
                                }
                            } catch (Throwable th) {
/* 47 */                        throw th;
                            }
                        }
                    } catch (IllegalStateException e) {
/* 57 */                IIi0oIl.I000II().I0001Ioi1lo(I00000oIO, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
                    }
                }
            }

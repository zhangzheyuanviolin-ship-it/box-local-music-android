            package androidx.work.impl.diagnostics;

            import android.content.BroadcastReceiver;
            import android.content.Context;
            import android.content.Intent;
            import androidx.work.impl.workers.DiagnosticsWorker;
            import java.util.Collections;
            import java.util.List;
            import p000.I1ii1l10IO;
            import p000.IIi0oIl;
            import p000.Il1OO1ilo0o1;
            import p000.i01I0IOOI10;
            import p000.i01IlOO;
            
            public class DiagnosticsReceiver extends BroadcastReceiver {
                public static final String I00000oIO = IIi0oIl.I000OiO("DiagnosticsRcvr");

                @Override
                public final void onReceive(Context context, Intent intent) {
/* 1 */             if (intent == null) {
/* 3 */                 return;
                    }
/* 8 */             IIi0oIl.I000II().getClass();
                    try {
/* 11 */                i01IlOO i01ilooI00000oOI = i01IlOO.I00000oOI(context);
/* 26 */                List listSingletonList = Collections.singletonList(new I1ii1l10IO(DiagnosticsWorker.class).I00000oIO());
/* 34 */                if (listSingletonList.isEmpty()) {
/* 56 */                    throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
                        }
/* 45 */                new i01I0IOOI10(i01ilooI00000oOI, null, Il1OO1ilo0o1.I00iiI, listSingletonList, null).I00000oIO();
                    } catch (IllegalStateException e) {
/* 67 */                IIi0oIl.I000II().I0001Ioi1lo(I00000oIO, "WorkManager is not initialized", e);
                    }
                }
            }

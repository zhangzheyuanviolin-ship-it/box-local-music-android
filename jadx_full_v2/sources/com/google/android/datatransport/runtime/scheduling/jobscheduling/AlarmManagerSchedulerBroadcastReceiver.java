            package com.google.android.datatransport.runtime.scheduling.jobscheduling;

            import android.content.BroadcastReceiver;
            import android.content.Context;
            import android.content.Intent;
            import android.util.Base64;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            import p000.I0il01i00i;
            import p000.I1lO11;
            import p000.IOO000ilo;
            import p000.IiOili0lOO1;
            import p000.OOIioI1;
            import p000.OoIOlo1001I;
            import p000.Ool0I1;
            
            public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
                public static final int I00000oIO = 0;

                @Override
                public final void onReceive(Context context, Intent intent) {
/* 7 */             String queryParameter = intent.getData().getQueryParameter("backendName");
/* 17 */            String queryParameter2 = intent.getData().getQueryParameter("extras");
/* 35 */            int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
/* 45 */            int i = intent.getExtras().getInt("attemptNumber");
/* 49 */            OoIOlo1001I.I00000oOI(context);
/* 52 */            IOO000ilo iOO000iloI00000oIO = I1lO11.I00000oIO();
/* 56 */            iOO000iloI00000oIO.I00IO1oi11O(queryParameter);
/* 63 */            iOO000iloI00000oIO.I00iio = OOIioI1.I00000oOI(iIntValue);
/* 66 */            if (queryParameter2 != null) {
/* 72 */                iOO000iloI00000oIO.I00iiO = Base64.decode(queryParameter2, 0);
                    }
/* 78 */            IiOili0lOO1 iiOili0lOO1 = OoIOlo1001I.I00000oIO().I0000O;
/* 80 */            I1lO11 i1lO11I000OOo1O = iOO000iloI00000oIO.I000OOo1O();
/* 86 */            I0il01i00i i0il01i00i = new I0il01i00i(0);
/* 91 */            Executor executor = (Executor) iiOili0lOO1.I00ilO0;
/* 95 */            Ool0I1 ool0I1 = new Ool0I1();
/* 98 */            ool0I1.I00iOIl = iiOili0lOO1;
/* 100 */           ool0I1.I00iiI = i1lO11I000OOo1O;
/* 102 */           ool0I1.I00iiO = i;
/* 104 */           ool0I1.I00iio = i0il01i00i;
/* 106 */           VarHandle.storeStoreFence();
/* 109 */           executor.execute(ool0I1);
                }
            }

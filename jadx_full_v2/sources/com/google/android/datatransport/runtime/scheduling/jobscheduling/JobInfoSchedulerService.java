            package com.google.android.datatransport.runtime.scheduling.jobscheduling;

            import android.app.job.JobParameters;
            import android.app.job.JobService;
            import android.util.Base64;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            import p000.I1lO11;
            import p000.IOO000ilo;
            import p000.IiOili0lOO1;
            import p000.Io11iII11ll;
            import p000.OOIioI1;
            import p000.OoIOlo1001I;
            import p000.Ool0I1;
            
            public class JobInfoSchedulerService extends JobService {
                public static final int I00iOIl = 0;

                @Override
                public final boolean onStartJob(JobParameters jobParameters) {
/* 7 */             String string = jobParameters.getExtras().getString("backendName");
/* 17 */            String string2 = jobParameters.getExtras().getString("extras");
/* 27 */            int i = jobParameters.getExtras().getInt("priority");
/* 37 */            int i2 = jobParameters.getExtras().getInt("attemptNumber");
/* 45 */            OoIOlo1001I.I00000oOI(getApplicationContext());
/* 48 */            IOO000ilo iOO000iloI00000oIO = I1lO11.I00000oIO();
/* 52 */            iOO000iloI00000oIO.I00IO1oi11O(string);
/* 59 */            iOO000iloI00000oIO.I00iio = OOIioI1.I00000oOI(i);
/* 61 */            if (string2 != null) {
/* 68 */                iOO000iloI00000oIO.I00iiO = Base64.decode(string2, 0);
                    }
/* 74 */            IiOili0lOO1 iiOili0lOO1 = OoIOlo1001I.I00000oIO().I0000O;
/* 76 */            I1lO11 i1lO11I000OOo1O = iOO000iloI00000oIO.I000OOo1O();
/* 83 */            Io11iII11ll io11iII11ll = new Io11iII11ll(3);
/* 86 */            io11iII11ll.I00iiI = this;
/* 88 */            io11iII11ll.I00iiO = jobParameters;
/* 90 */            VarHandle.storeStoreFence();
/* 95 */            Executor executor = (Executor) iiOili0lOO1.I00ilO0;
/* 99 */            Ool0I1 ool0I1 = new Ool0I1();
/* 102 */           ool0I1.I00iOIl = iiOili0lOO1;
/* 104 */           ool0I1.I00iiI = i1lO11I000OOo1O;
/* 106 */           ool0I1.I00iiO = i2;
/* 108 */           ool0I1.I00iio = io11iII11ll;
/* 110 */           VarHandle.storeStoreFence();
/* 113 */           executor.execute(ool0I1);
/* 116 */           return true;
                }

                @Override
                public final boolean onStopJob(JobParameters jobParameters) {
/* 1 */             return true;
                }
            }

            package p000;

            import android.app.job.JobScheduler;
            import android.content.Context;
            
            public abstract class O01110 {
                public static final String I00000oIO = IIi0oIl.I000OiO("SystemJobScheduler");

                public static final JobScheduler I00000oIO(Context context) {
/* 11 */            return ((JobScheduler) context.getSystemService("jobscheduler")).forNamespace("androidx.work.systemjobscheduler");
                }
            }

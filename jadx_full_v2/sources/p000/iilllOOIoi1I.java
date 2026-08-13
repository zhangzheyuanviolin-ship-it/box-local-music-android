            package p000;

            import android.app.job.JobInfo;
            import android.app.job.JobScheduler;
            import android.os.UserHandle;
            import android.util.Log;
            import java.lang.reflect.Method;
            
            public abstract class iilllOOIoi1I {
                public static final Method I00000oIO;
                public static final Method I00000oOI;

                static {
                    Method declaredMethod;
/* 4 */             Method declaredMethod2 = null;
                    try {
/* 30 */                declaredMethod = JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
                    } catch (NoSuchMethodException unused) {
/* 39 */                if (Log.isLoggable("JobSchedulerCompat", 6)) {
/* 43 */                    Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
                        }
/* 46 */                declaredMethod = null;
                    }
/* 47 */            I00000oIO = declaredMethod;
                    try {
/* 53 */                declaredMethod2 = UserHandle.class.getDeclaredMethod("myUserId", null);
                    } catch (NoSuchMethodException unused2) {
/* 62 */                if (Log.isLoggable("JobSchedulerCompat", 6)) {
/* 66 */                    Log.e("JobSchedulerCompat", "No myUserId method available");
                        }
                    }
/* 69 */            I00000oOI = declaredMethod2;
                }
            }

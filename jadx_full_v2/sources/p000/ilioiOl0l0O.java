            package p000;

            import android.app.ActivityManager;
            import java.util.concurrent.Callable;
            
            public final class ilioiOl0l0O implements Callable {
                public int I00000oIO;

                @Override
                public final Object call() {
/* 3 */             ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
/* 6 */             ActivityManager.getMyMemoryState(runningAppProcessInfo);
/* 18 */            return Boolean.valueOf(runningAppProcessInfo.importance <= this.I00000oIO);
                }
            }

            package p000;

            import android.app.Activity;
            import android.app.Application;
            import android.app.Fragment;
            import android.os.Bundle;
            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"LOi011o;", "Landroid/app/Fragment;", "<init>", "()V", "I00000oIO", "Oi011OII", "lifecycle-runtime"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
/* 26 */    public class Oi011o extends Fragment {
                public static final int I00iOIl = 0;

                @Override
                public final void onActivityCreated(Bundle bundle) {
/* 1 */             super.onActivityCreated(bundle);
/* 4 */             O0oOI1Ii1Iii o0oOI1Ii1Iii = O0oOOiI0.Companion;
                }

                @Override
                public final void onDestroy() {
/* 1 */             super.onDestroy();
/* 4 */             O0oOI1Ii1Iii o0oOI1Ii1Iii = O0oOOiI0.Companion;
                }

                @Override
                public final void onPause() {
/* 1 */             super.onPause();
/* 4 */             O0oOI1Ii1Iii o0oOI1Ii1Iii = O0oOOiI0.Companion;
                }

                @Override
                public final void onResume() {
/* 1 */             super.onResume();
/* 4 */             O0oOI1Ii1Iii o0oOI1Ii1Iii = O0oOOiI0.Companion;
                }

                @Override
                public final void onStart() {
/* 1 */             super.onStart();
/* 4 */             O0oOI1Ii1Iii o0oOI1Ii1Iii = O0oOOiI0.Companion;
                }

                @Override
                public final void onStop() {
/* 1 */             super.onStop();
/* 4 */             O0oOI1Ii1Iii o0oOI1Ii1Iii = O0oOOiI0.Companion;
                }

/* 27 */        public static final class I00000oIO implements Application.ActivityLifecycleCallbacks {
                    public static final Oi011lolIlO1 Companion = new Oi011lolIlO1();

                    public static final void registerIn(Activity activity) {
/* 3 */                 Companion.getClass();
/* 11 */                activity.registerActivityLifecycleCallbacks(new I00000oIO());
                    }

                    @Override
                    public void onActivityPostCreated(Activity activity, Bundle bundle) {
/* 1 */                 int i = Oi011o.I00iOIl;
/* 5 */                 Oi011OII.I00000oIO(activity, O0oOOiI0.ON_CREATE);
                    }

                    @Override
                    public void onActivityPostResumed(Activity activity) {
/* 1 */                 int i = Oi011o.I00iOIl;
/* 5 */                 Oi011OII.I00000oIO(activity, O0oOOiI0.ON_RESUME);
                    }

                    @Override
                    public void onActivityPostStarted(Activity activity) {
/* 1 */                 int i = Oi011o.I00iOIl;
/* 5 */                 Oi011OII.I00000oIO(activity, O0oOOiI0.ON_START);
                    }

                    @Override
                    public void onActivityPreDestroyed(Activity activity) {
/* 1 */                 int i = Oi011o.I00iOIl;
/* 5 */                 Oi011OII.I00000oIO(activity, O0oOOiI0.ON_DESTROY);
                    }

                    @Override
                    public void onActivityPrePaused(Activity activity) {
/* 1 */                 int i = Oi011o.I00iOIl;
/* 5 */                 Oi011OII.I00000oIO(activity, O0oOOiI0.ON_PAUSE);
                    }

                    @Override
                    public void onActivityPreStopped(Activity activity) {
/* 1 */                 int i = Oi011o.I00iOIl;
/* 5 */                 Oi011OII.I00000oIO(activity, O0oOOiI0.ON_STOP);
                    }

                    @Override
/* 28 */            public void onActivityDestroyed(Activity activity) {
                    }

                    @Override
/* 28 */            public void onActivityPaused(Activity activity) {
                    }

                    @Override
/* 28 */            public void onActivityResumed(Activity activity) {
                    }

                    @Override
/* 28 */            public void onActivityStarted(Activity activity) {
                    }

                    @Override
/* 28 */            public void onActivityStopped(Activity activity) {
                    }

                    @Override
/* 36 */            public void onActivityCreated(Activity activity, Bundle bundle) {
                    }

                    @Override
/* 36 */            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    }
                }
            }

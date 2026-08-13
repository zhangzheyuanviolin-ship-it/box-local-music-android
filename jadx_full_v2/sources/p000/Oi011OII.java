            package p000;

            import android.app.Activity;
            import android.app.FragmentManager;
            import p000.Oi011o;
            
            public abstract class Oi011OII {
                /* JADX WARN: Multi-variable type inference failed */
                public static void I00000oIO(Activity activity, O0oOOiI0 o0oOOiI0) {
/* 3 */             if (activity instanceof O0oiOi) {
/* 7 */                 I01O1lIi i01O1lIiI000iOII = ((O0oiOi) activity).I000iOII();
/* 13 */                if (i01O1lIiI000iOII instanceof O0oiiOll0O1) {
/* 17 */                    ((O0oiiOll0O1) i01O1lIiI000iOII).I010iIIOlo(o0oOOiI0);
                        }
                    }
                }

                public static void I00000oOI(Activity activity) {
/* 3 */             Oi011o.I00000oIO.Companion.getClass();
/* 11 */            activity.registerActivityLifecycleCallbacks(new Oi011o.I00000oIO());
/* 14 */            FragmentManager fragmentManager = activity.getFragmentManager();
/* 24 */            if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
/* 39 */                fragmentManager.beginTransaction().add(new Oi011o(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
/* 42 */                fragmentManager.executePendingTransactions();
                    }
                }
            }

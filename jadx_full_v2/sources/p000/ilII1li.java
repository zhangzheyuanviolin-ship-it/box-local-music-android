            package p000;

            import android.app.Application;
            import android.content.Context;
            import android.content.ContextWrapper;
            
            public abstract class ilII1li {
                public static final Object I00000oIO(Context context, Class cls) {
                    Application application;
/* 1 */             Context applicationContext = context.getApplicationContext();
/* 7 */             if (!(applicationContext instanceof Application)) {
/* 12 */                Context baseContext = applicationContext;
/* 15 */                while (baseContext instanceof ContextWrapper) {
/* 19 */                    baseContext = ((ContextWrapper) baseContext).getBaseContext();
/* 25 */                    if (baseContext instanceof Application) {
/* 28 */                        application = (Application) baseContext;
                            }
                        }
/* 37 */                IoOOl0iOl1io.I000OOo1O("Could not find an Application in the given context: ", applicationContext);
/* 40 */                return null;
                    }
/* 9 */             application = (Application) applicationContext;
/* 30 */            return ilII1oOi1.I00000oIO(cls, application);
                }
            }

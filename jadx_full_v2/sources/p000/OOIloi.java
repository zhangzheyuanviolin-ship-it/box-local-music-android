            package p000;

            import android.app.Application;
            import android.content.Context;
            
            public abstract class OOIloi {
                static {
/* 3 */             IIi0oIl.I000OiO("ProcessUtils");
                }

                public static final boolean I00000oIO(Context context, IOllii iOllii) {
/* 1 */             String processName = Application.getProcessName();
/* 5 */             String str = iOllii.I000O01llI0;
                    return (str == null || str.length() == 0) ? processName.equals(context.getApplicationInfo().processName) : processName.equals(str);
                }
            }

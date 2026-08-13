            package p000;

            import android.app.Application;
            import android.content.Context;
            import android.util.Log;
            import java.lang.invoke.VarHandle;
            
            public final class IIl00l {
                public static IIoIi0iI I00000oIO(Context context) {
/* 3 */             IIoIi0iI iIoIi0iI = new IIoIi0iI();
/* 12 */            iIoIi0iI.I00000oOI = IiiIlilOO.I000II.I000l1(context);
/* 18 */            if ((context instanceof Application) && l11I11lO.I0000O(4, "CXCP")) {
/* 46 */                Log.i("CXCP", "The provided context (" + context + ") is application scoped and will be used to infer the default display for computing the default preview size, orientation, and default aspect ratio for UseCase outputs.");
                    }
/* 50 */            l11I11lO.I0000O(3, "CXCP");
/* 53 */            VarHandle.storeStoreFence();
/* 77 */            return iIoIi0iI;
                }
            }

            package p000;

            import android.view.View;
            import android.window.OnBackInvokedCallback;
            import android.window.OnBackInvokedDispatcher;
            import java.lang.invoke.VarHandle;
            import java.util.Objects;
            
            public abstract class Oo1Oo1lo1 {
                public static OnBackInvokedDispatcher I00000oIO(View view) {
/* 1 */             return view.findOnBackInvokedDispatcher();
                }

                public static OnBackInvokedCallback I00000oOI(Runnable runnable) {
/* 1 */             Objects.requireNonNull(runnable);
/* 7 */             I11OOio1 i11OOio1 = new I11OOio1(2);
/* 10 */            i11OOio1.I00000oOI = runnable;
/* 12 */            VarHandle.storeStoreFence();
/* 29 */            return i11OOio1;
                }

                public static void I0000Il00O(Object obj, Object obj2) {
/* 8 */             ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
                }

                public static void I0000O(Object obj, Object obj2) {
/* 5 */             ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
                }
            }

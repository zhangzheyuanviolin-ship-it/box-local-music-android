            package p000;

            import android.app.Activity;
            import android.window.OnBackInvokedCallback;
            import android.window.OnBackInvokedDispatcher;
            import java.lang.invoke.VarHandle;
            import java.util.Objects;
            
            public abstract class I11o010IIIi {
                public static OnBackInvokedDispatcher I00000oIO(Activity activity) {
/* 1 */             return activity.getOnBackInvokedDispatcher();
                }

                public static OnBackInvokedCallback I00000oOI(Object obj, I11oi01ll i11oi01ll) {
/* 1 */             Objects.requireNonNull(i11oi01ll);
/* 7 */             I11OOio1 i11OOio1 = new I11OOio1(1);
/* 10 */            i11OOio1.I00000oOI = i11oi01ll;
/* 12 */            VarHandle.storeStoreFence();
/* 20 */            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, i11OOio1);
/* 37 */            return i11OOio1;
                }

                public static void I0000Il00O(Object obj, Object obj2) {
/* 5 */             ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
                }
            }

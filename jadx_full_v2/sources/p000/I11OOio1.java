            package p000;

            import android.window.OnBackInvokedCallback;
            import java.lang.reflect.InvocationTargetException;
            
            public final class I11OOio1 implements OnBackInvokedCallback {
                public final int I00000oIO;
                public Object I00000oOI;

                @Override
                public final void onBackInvoked() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
/* 1 */             int i = this.I00000oIO;
/* 3 */             Object obj = this.I00000oOI;
                    switch (i) {
                        case 0:
/* 20 */                    IllOOo00lI illOOo00lI = (IllOOo00lI) obj;
/* 22 */                    if (illOOo00lI != null) {
/* 24 */                        illOOo00lI.invoke();
                                break;
                            }
                            break;
                        case 1:
/* 16 */                    ((I11oi01ll) obj).I001lIiIIo1O();
                            break;
                        default:
/* 10 */                    ((Runnable) obj).run();
                            break;
                    }
                }
            }

            package p000;

            import android.os.Handler;
            import android.os.Looper;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public final class I0oli1 implements Function1 {
                public final int I00iOIl;
                public OO1lio I00iiI;

                public I0oli1(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             OO1lio oO1lio = this.I00iiI;
                    switch (i) {
                        case 0:
/* 67 */                    oO1lio.m37setPopupContentSizefhxjrPA((IooOl0ol01) obj);
/* 70 */                    oO1lio.I0010o();
                            break;
                        case 1:
/* 61 */                    oO1lio.I0010I0i(((O0iOOo0Ii) obj).I00II0oii1o());
                            break;
                        default:
/* 10 */                    IllOOo00lI illOOo00lI = (IllOOo00lI) obj;
/* 12 */                    Handler handler = oO1lio.getHandler();
/* 28 */                    if ((handler != null ? handler.getLooper() : null) != Looper.myLooper()) {
/* 34 */                        Handler handler2 = oO1lio.getHandler();
/* 38 */                        if (handler2 != null) {
/* 43 */                            I0lOoo0O i0lOoo0O = new I0lOoo0O(3);
/* 46 */                            i0lOoo0O.I00iiI = illOOo00lI;
/* 48 */                            VarHandle.storeStoreFence();
/* 51 */                            handler2.post(i0lOoo0O);
                                    break;
                                }
                            } else {
/* 30 */                        illOOo00lI.invoke();
                                break;
                            }
                            break;
                    }
/* 54 */            return ooiIlOl1iI;
                }
            }

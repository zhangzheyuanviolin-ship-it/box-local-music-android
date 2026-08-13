            package p000;

            import android.os.Handler;
            import android.os.Looper;
            import android.view.ActionMode;
            import android.view.View;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public final class I1001OoI0 implements Function1 {
                public final int I00iOIl;
                public I100OOIO0oio I00iiI;

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             I100OOIO0oio i100OOIO0oio = this.I00iiI;
                    switch (i) {
                        case 0:
/* 45 */                    IllOOo00lI illOOo00lI = (IllOOo00lI) obj;
/* 47 */                    View view = i100OOIO0oio.I00000oIO;
/* 49 */                    Handler handler = view.getHandler();
/* 65 */                    if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
/* 67 */                        illOOo00lI.invoke();
                            } else {
/* 71 */                        Handler handler2 = view.getHandler();
/* 75 */                        if (handler2 != null) {
/* 80 */                            I0lOoo0O i0lOoo0O = new I0lOoo0O(1);
/* 83 */                            i0lOoo0O.I00iiI = illOOo00lI;
/* 85 */                            VarHandle.storeStoreFence();
/* 88 */                            handler2.post(i0lOoo0O);
                                }
                            }
/* 91 */                    return ooiIlOl1iI;
                        case 1:
/* 37 */                    ActionMode actionMode = i100OOIO0oio.I000O01llI0;
/* 39 */                    if (actionMode != null) {
/* 41 */                        actionMode.invalidate();
                            }
/* 44 */                    return ooiIlOl1iI;
                        case 2:
/* 29 */                    ActionMode actionMode2 = i100OOIO0oio.I000O01llI0;
/* 31 */                    if (actionMode2 != null) {
/* 33 */                        actionMode2.invalidateContentRect();
                            }
/* 36 */                    return ooiIlOl1iI;
                        default:
/* 14 */                    i100OOIO0oio.I0000oI00.I0001Ioi1lo();
/* 20 */                    I0IOIo0 i0IOIo0 = new I0IOIo0(3);
/* 23 */                    i0IOIo0.I00000oOI = i100OOIO0oio;
/* 25 */                    VarHandle.storeStoreFence();
/* 28 */                    return i0IOIo0;
                    }
                }
            }

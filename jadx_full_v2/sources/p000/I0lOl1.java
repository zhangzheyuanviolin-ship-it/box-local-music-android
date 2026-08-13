            package p000;

            import android.os.Handler;
            import android.os.Looper;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.atomic.AtomicReference;
            import kotlin.jvm.functions.Function1;
            
            public final class I0lOl1 implements Function1 {
                public final int I00iOIl;
                public I0lio1O01i01 I00iiI;

                public I0lOl1(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 4 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 7 */             I0lio1O01i01 i0lio1O01i01 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 125 */                   Oo0Oo0 textInputService = i0lio1O01i01.getTextInputService();
/* 129 */                   I0olOi00O i0olOi00O = new I0olOi00O();
/* 132 */                   i0olOi00O.I00iOIl = i0lio1O01i01;
/* 134 */                   i0olOi00O.I00iiI = textInputService;
/* 136 */                   i0olOi00O.I00iiO = (Ii0110) obj;
/* 143 */                   i0olOi00O.I00iio = new AtomicReference(null);
/* 145 */                   VarHandle.storeStoreFence();
/* 148 */                   return i0olOi00O;
                        case 1:
/* 79 */                    IllOOo00lI illOOo00lI = (IllOOo00lI) obj;
/* 81 */                    Handler handler = i0lio1O01i01.getHandler();
/* 95 */                    if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
/* 97 */                        illOOo00lI.invoke();
                            } else {
/* 101 */                       Handler handler2 = i0lio1O01i01.getHandler();
/* 105 */                       if (handler2 != null) {
/* 109 */                           I0lOoo0O i0lOoo0O = new I0lOoo0O(0);
/* 112 */                           i0lOoo0O.I00iiI = illOOo00lI;
/* 114 */                           VarHandle.storeStoreFence();
/* 117 */                           handler2.post(i0lOoo0O);
                                }
                            }
/* 120 */                   return ooiIlOl1iI;
                        case 2:
/* 75 */                    ((Ili1ioOlo0oO) i0lio1O01i01.getFocusOwner()).I000O01llI0(((Ili0i1il0l0l) obj).I00000oIO, false);
/* 78 */                    return ooiIlOl1iI;
                        case 3:
/* 60 */                    return i0lio1O01i01.getSavedStateRegistry();
                        case 4:
/* 53 */                    return Boolean.valueOf(i0lio1O01i01.getScrollCaptureInProgress());
                        case 5:
/* 42 */                    return i0lio1O01i01.getInputModeManager();
                        case 6:
/* 35 */                    return i0lio1O01i01.getTextInputService();
                        case 7:
/* 28 */                    return i0lio1O01i01.getSoftwareKeyboardController();
                        case 8:
/* 21 */                    return i0lio1O01i01.getTextToolbar();
                        default:
/* 14 */                    return i0lio1O01i01.getPointerIconService();
                    }
                }
            }

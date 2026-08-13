            package p000;

            import android.view.View;
            import android.view.Window;
            
            public final class IOiIlii implements O0oiIoI0 {
                public final int I00iOIl;
                public Ill0oOi0 I00iiI;

                public IOiIlii(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void I000II(O0oiOi o0oiOi, O0oOOiI0 o0oOOiI0) {
                    Window window;
                    View viewPeekDecorView;
/* 1 */             int i = this.I00iOIl;
/* 3 */             Ill0oOi0 ill0oOi0 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 63 */                    if (o0oOOiI0 == O0oOOiI0.ON_STOP && (window = ill0oOi0.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
/* 77 */                        viewPeekDecorView.cancelPendingInputEvents();
                                break;
                            }
                            break;
                        default:
/* 10 */                    if (o0oOOiI0 == O0oOOiI0.ON_DESTROY) {
/* 15 */                        ill0oOi0.I00iiI.I00000oOI = null;
/* 21 */                        if (!ill0oOi0.isChangingConfigurations()) {
/* 27 */                            ill0oOi0.I000II().I00000oIO();
                                }
/* 30 */                        IOiO11OOiliI iOiO11OOiliI = ill0oOi0.I00ilO0;
/* 32 */                        Ill0oOi0 ill0oOi02 = iOiO11OOiliI.I00iio;
/* 42 */                        ill0oOi02.getWindow().getDecorView().removeCallbacks(iOiO11OOiliI);
/* 57 */                        ill0oOi02.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(iOiO11OOiliI);
                                break;
                            }
                            break;
                    }
                }
            }

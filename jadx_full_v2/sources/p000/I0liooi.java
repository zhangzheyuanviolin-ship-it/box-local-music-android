            package p000;

            import android.view.View;
            import android.view.accessibility.AccessibilityEvent;
            import kotlin.jvm.functions.Function1;
            
            public final class I0liooi implements Function1 {
                public final int I00iOIl;
                public I0ll1oo I00iiI;

                public I0liooi(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             I0ll1oo i0ll1oo = this.I00iiI;
                    switch (i) {
                        case 0:
/* 18 */                    View view = i0ll1oo.I00iio;
/* 28 */                    return Boolean.valueOf(view.getParent().requestSendAccessibilityEvent(view, (AccessibilityEvent) obj));
                        default:
/* 10 */                    i0ll1oo.I001IO000((OiOilOo0io) obj);
/* 13 */                    return OoiIlOl1iI.I00000oIO;
                    }
                }
            }

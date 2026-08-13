            package p000;

            import android.content.Context;
            import android.view.View;
            import android.view.ViewTreeObserver;
            import com.box.gallery.R;
            import java.util.WeakHashMap;
            
/* 27 */    public final class I0oIl0io0II1 implements View.OnAttachStateChangeListener {
                public final int I00iOIl;
                public Object I00iiI;

                public I0oIl0io0II1(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void onViewAttachedToWindow(View view) {
                    switch (this.I00iOIl) {
                        case 0:
/* 22 */                    I0oIoiI0 i0oIoiI0 = (I0oIoiI0) this.I00iiI;
/* 24 */                    Context context = view.getContext();
/* 30 */                    if (!i0oIoiI0.I0000Il00O) {
/* 38 */                        context.getApplicationContext().registerComponentCallbacks(i0oIoiI0.I0000oI00);
/* 42 */                        i0oIoiI0.I0000Il00O = true;
                                break;
                            }
                            break;
                        case 2:
/* 9 */                     View view2 = (View) this.I00iiI;
/* 11 */                    view2.removeOnAttachStateChangeListener(this);
/* 14 */                    WeakHashMap weakHashMap = OooiOl0ioo0i.I00000oIO;
/* 16 */                    view2.requestApplyInsets();
                            break;
                    }
                }

                @Override
                public final void onViewDetachedFromWindow(View view) {
                    switch (this.I00iOIl) {
                        case 0:
/* 149 */                   I0oIoiI0 i0oIoiI0 = (I0oIoiI0) this.I00iiI;
/* 151 */                   Context context = view.getContext();
/* 157 */                   if (i0oIoiI0.I0000Il00O) {
/* 165 */                       context.getApplicationContext().unregisterComponentCallbacks(i0oIoiI0.I0000oI00);
/* 168 */                       i0oIoiI0.I0000Il00O = false;
                            }
/* 170 */                   i0oIoiI0.I0000O();
                            break;
                        case 1:
/* 118 */                   IO0iOlIO1o iO0iOlIO1o = (IO0iOlIO1o) this.I00iiI;
/* 120 */                   ViewTreeObserver viewTreeObserver = iO0iOlIO1o.I00olI;
/* 122 */                   if (viewTreeObserver != null) {
/* 128 */                       if (!viewTreeObserver.isAlive()) {
/* 134 */                           iO0iOlIO1o.I00olI = view.getViewTreeObserver();
                                }
/* 140 */                       iO0iOlIO1o.I00olI.removeGlobalOnLayoutListener(iO0iOlIO1o.I00l0I0l0lO1);
                            }
/* 143 */                   view.removeOnAttachStateChangeListener(this);
                            break;
                        case 2:
                            break;
                        case 3:
/* 87 */                    OlIlil1IO1I olIlil1IO1I = (OlIlil1IO1I) this.I00iiI;
/* 89 */                    ViewTreeObserver viewTreeObserver2 = olIlil1IO1I.I00o0iI0io1;
/* 91 */                    if (viewTreeObserver2 != null) {
/* 97 */                        if (!viewTreeObserver2.isAlive()) {
/* 103 */                           olIlil1IO1I.I00o0iI0io1 = view.getViewTreeObserver();
                                }
/* 109 */                       olIlil1IO1I.I00o0iI0io1.removeGlobalOnLayoutListener(olIlil1IO1I.I00l0I0l0lO1);
                            }
/* 112 */                   view.removeOnAttachStateChangeListener(this);
                            break;
                        case 4:
/* 21 */                    I0100o111I i0100o111I = (I0100o111I) this.I00iiI;
/* 41 */                    for (Object obj : OilO1oiooiII.I000OiO(i0100o111I.getParent(), Oooio1iOii.I00ioIO)) {
/* 51 */                        if (obj instanceof View) {
/* 58 */                            Object tag = ((View) obj).getTag(R.id.is_pooling_container_tag);
/* 69 */                            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
/* 78 */                            if (bool != null ? bool.booleanValue() : false) {
                                        break;
                                    }
                                }
                            }
/* 81 */                    i0100o111I.I0000oI00();
                            break;
                        default:
/* 8 */                     view.removeOnAttachStateChangeListener(this);
/* 15 */                    ((OlIl0i) this.I00iiI).I000II(null);
                            break;
                    }
                }

/* 28 */        private final void I00000oIO(View view) {
                }

/* 28 */        private final void I00000oOI(View view) {
                }

/* 28 */        private final void I0000Il00O(View view) {
                }

/* 28 */        private final void I0000O(View view) {
                }

/* 28 */        private final void I0000oI00(View view) {
                }
            }

            package p000;

            import android.app.Activity;
            import android.os.IBinder;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.Window;
            import android.view.WindowManager;
            import java.lang.ref.WeakReference;
            
/* 27 */    public final class Ill0oo1l1 implements View.OnAttachStateChangeListener {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;

                public Ill0oo1l1(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void onViewAttachedToWindow(View view) {
                    Window window;
                    WindowManager.LayoutParams attributes;
                    switch (this.I00iOIl) {
                        case 0:
/* 54 */                    IllI0O1ol1lo illI0O1ol1lo = (IllI0O1ol1lo) this.I00iiI;
/* 56 */                    Ill0l1 ill0l1 = illI0O1ol1lo.I0000Il00O;
/* 58 */                    illI0O1ol1lo.I000iOII();
/* 83 */                    IiI1i00oi.I0001Ioi1lo((ViewGroup) ill0l1.I0100i.getParent(), ((Ill10I0i10) this.I00iiO).I00iOIl.I00IO1oi11O()).I0000oI00();
                            break;
                        case 1:
/* 7 */                     view.removeOnAttachStateChangeListener(this);
/* 18 */                    Activity activity = (Activity) ((WeakReference) this.I00iiO).get();
/* 37 */                    IBinder iBinder = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
/* 38 */                    if (activity != null && iBinder != null) {
/* 48 */                        ((Ol0I0o1OI1i) this.I00iiI).I0000Il00O(iBinder, activity);
                                break;
                            }
                            break;
                    }
                }

                @Override
                public final void onViewDetachedFromWindow(View view) {
                    switch (this.I00iOIl) {
                        case 0:
                        case 1:
                            break;
                        default:
/* 10 */                    ((View) this.I00iiI).removeOnAttachStateChangeListener(this);
/* 17 */                    ((OOloolilI11i) this.I00iiO).I001lIiIIo1O();
                            break;
                    }
                }

/* 28 */        private final void I00000oIO(View view) {
                }

/* 28 */        private final void I00000oOI(View view) {
                }

/* 28 */        private final void I0000Il00O(View view) {
                }
            }

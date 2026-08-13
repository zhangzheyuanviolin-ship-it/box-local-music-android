            package p000;

            import android.content.DialogInterface;
            import android.view.KeyEvent;
            import android.view.View;
            import android.view.Window;
            
            public final class O1iloOI1l implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, O1l0OiO10IoI {
                public O1illlIiilIl I00iOIl;
                public I0ilIO0oloO1 I00iiI;
                public O10Ii1IIil I00iiO;

                @Override
                public final void I0000O(O1illlIiilIl o1illlIiilIl, boolean z) {
                    I0ilIO0oloO1 i0ilIO0oloO1;
/* 1 */             if ((z || o1illlIiilIl == this.I00iOIl) && (i0ilIO0oloO1 = this.I00iiI) != null) {
/* 11 */                i0ilIO0oloO1.dismiss();
                    }
                }

                @Override
                public final boolean I000lI(O1illlIiilIl o1illlIiilIl) {
/* 1 */             return false;
                }

                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
/* 1 */             O1illlIiilIl o1illlIiilIl = this.I00iOIl;
/* 3 */             O10Ii1IIil o10Ii1IIil = this.I00iiO;
/* 5 */             O10Ii01i0 o10Ii01i0 = o10Ii1IIil.I00ilO0;
/* 7 */             if (o10Ii01i0 == null) {
/* 11 */                o10Ii01i0 = new O10Ii01i0(o10Ii1IIil);
/* 14 */                o10Ii1IIil.I00ilO0 = o10Ii01i0;
                    }
/* 22 */            o1illlIiilIl.I00100o1O0lo(o10Ii01i0.getItem(i), null, 0);
                }

                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
/* 6 */             this.I00iiO.I0000O(this.I00iOIl, true);
                }

                @Override
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    Window window;
                    View decorView;
                    KeyEvent.DispatcherState keyDispatcherState;
                    View decorView2;
                    KeyEvent.DispatcherState keyDispatcherState2;
/* 1 */             O1illlIiilIl o1illlIiilIl = this.I00iOIl;
/* 5 */             if (i == 82 || i == 4) {
/* 15 */                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
/* 25 */                    Window window2 = this.I00iiI.getWindow();
/* 29 */                    if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
/* 43 */                        keyDispatcherState2.startTracking(keyEvent, this);
/* 14 */                        return true;
                            }
                        } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.I00iiI.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
/* 85 */                    o1illlIiilIl.I0000Il00O(true);
/* 88 */                    dialogInterface.dismiss();
/* 14 */                    return true;
                        }
                    }
/* 93 */            return o1illlIiilIl.performShortcut(i, keyEvent, 0);
                }
            }

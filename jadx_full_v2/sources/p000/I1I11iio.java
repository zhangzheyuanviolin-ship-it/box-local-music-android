            package p000;

            import android.view.ViewTreeObserver;
            import android.widget.PopupWindow;
            
            public final class I1I11iio implements PopupWindow.OnDismissListener {
                public I1I0llO0I I00iOIl;
                public I1I1Io I00iiI;

                @Override
                public final void onDismiss() {
/* 5 */             ViewTreeObserver viewTreeObserver = this.I00iiI.I0100i.getViewTreeObserver();
/* 9 */             if (viewTreeObserver != null) {
/* 13 */                viewTreeObserver.removeGlobalOnLayoutListener(this.I00iOIl);
                    }
                }
            }

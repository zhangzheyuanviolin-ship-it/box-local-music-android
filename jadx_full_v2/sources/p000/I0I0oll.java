            package p000;

            import androidx.appcompat.widget.ActionBarOverlayLayout;
            
            public final class I0I0oll implements Runnable {
                public final int I00iOIl;
                public ActionBarOverlayLayout I00iiI;

                @Override
                public final void run() {
                    switch (this.I00iOIl) {
                        case 0:
/* 38 */                    ActionBarOverlayLayout actionBarOverlayLayout = this.I00iiI;
/* 40 */                    actionBarOverlayLayout.I0000Il00O();
/* 60 */                    actionBarOverlayLayout.I00ol1 = actionBarOverlayLayout.I00iio.animate().translationY(0.0f).setListener(actionBarOverlayLayout.I00olI);
                            break;
                        default:
/* 6 */                     ActionBarOverlayLayout actionBarOverlayLayout2 = this.I00iiI;
/* 8 */                     actionBarOverlayLayout2.I0000Il00O();
/* 35 */                    actionBarOverlayLayout2.I00ol1 = actionBarOverlayLayout2.I00iio.animate().translationY(-actionBarOverlayLayout2.I00iio.getHeight()).setListener(actionBarOverlayLayout2.I00olI);
                            break;
                    }
                }
            }

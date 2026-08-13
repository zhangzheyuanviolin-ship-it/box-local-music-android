            package p000;

            import android.view.View;
            import androidx.appcompat.widget.ActionBarOverlayLayout;
            import java.util.WeakHashMap;
            
            public final class i00IO11o1Ili extends li1l0000I0l {
                public final int I00000oIO;
                public final i00IOoliil0i I00000oOI;

                public i00IO11o1Ili(i00IOoliil0i i00iooliil0i, int i) {
/* 1 */             this.I00000oIO = i;
/* 3 */             this.I00000oOI = i00iooliil0i;
                }

                @Override
                public final void I0000Il00O() {
                    View view;
/* 1 */             int i = this.I00000oIO;
/* 4 */             i00IOoliil0i i00iooliil0i = this.I00000oOI;
                    switch (i) {
                        case 0:
/* 19 */                    if (i00iooliil0i.I000oI1ioi && (view = i00iooliil0i.I000II) != null) {
/* 26 */                        view.setTranslationY(0.0f);
/* 31 */                        i00iooliil0i.I0000O.setTranslationY(0.0f);
                            }
/* 38 */                    i00iooliil0i.I0000O.setVisibility(8);
/* 44 */                    i00iooliil0i.I0000O.setTransitioning(false);
/* 47 */                    i00iooliil0i.I00111O = null;
/* 49 */                    I1I0i0Ilo1Oi i1I0i0Ilo1Oi = i00iooliil0i.I000iOII;
/* 51 */                    if (i1I0i0Ilo1Oi != null) {
/* 55 */                        i1I0i0Ilo1Oi.I00OIo(i00iooliil0i.I000OiO);
/* 58 */                        i00iooliil0i.I000OiO = null;
/* 60 */                        i00iooliil0i.I000iOII = null;
                            }
/* 62 */                    ActionBarOverlayLayout actionBarOverlayLayout = i00iooliil0i.I0000Il00O;
/* 64 */                    if (actionBarOverlayLayout != null) {
/* 66 */                        WeakHashMap weakHashMap = OooiOl0ioo0i.I00000oIO;
/* 68 */                        actionBarOverlayLayout.requestApplyInsets();
                                break;
                            }
                            break;
                        default:
/* 9 */                     i00iooliil0i.I00111O = null;
/* 13 */                    i00iooliil0i.I0000O.requestLayout();
                            break;
                    }
                }
            }

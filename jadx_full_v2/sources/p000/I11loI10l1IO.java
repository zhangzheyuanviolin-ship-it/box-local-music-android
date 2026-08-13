            package p000;

            import android.view.View;
            import android.view.ViewGroup;
            import android.widget.PopupWindow;
            import java.util.WeakHashMap;
            
            public final class I11loI10l1IO extends li1l0000I0l {
                public final int I00000oIO;
                public Object I00000oOI;

                public I11loI10l1IO(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public void I00000oOI() {
                    switch (this.I00000oIO) {
                        case 0:
/* 49 */                    ((I11lo00IoiIo) this.I00000oOI).I00iiI.I00oI0i.setVisibility(0);
                            break;
                        case 1:
/* 10 */                    I11oi01ll i11oi01ll = (I11oi01ll) this.I00000oOI;
/* 14 */                    i11oi01ll.I00oI0i.setVisibility(0);
/* 25 */                    if (i11oi01ll.I00oI0i.getParent() instanceof View) {
/* 33 */                        View view = (View) i11oi01ll.I00oI0i.getParent();
/* 35 */                        WeakHashMap weakHashMap = OooiOl0ioo0i.I00000oIO;
/* 37 */                        view.requestApplyInsets();
                                break;
                            }
                            break;
                    }
                }

                @Override
                public final void I0000Il00O() {
                    switch (this.I00000oIO) {
                        case 0:
/* 96 */                    I11oi01ll i11oi01ll = ((I11lo00IoiIo) this.I00000oOI).I00iiI;
/* 100 */                   i11oi01ll.I00oI0i.setAlpha(1.0f);
/* 105 */                   i11oi01ll.I00oO101o.I0000O(null);
/* 108 */                   i11oi01ll.I00oO101o = null;
                            break;
                        case 1:
/* 77 */                    I11oi01ll i11oi01ll2 = (I11oi01ll) this.I00000oOI;
/* 81 */                    i11oi01ll2.I00oI0i.setAlpha(1.0f);
/* 86 */                    i11oi01ll2.I00oO101o.I0000O(null);
/* 89 */                    i11oi01ll2.I00oO101o = null;
                            break;
                        default:
/* 15 */                    I11oi01ll i11oi01ll3 = (I11oi01ll) ((I1I0i0Ilo1Oi) this.I00000oOI).I00iiO;
/* 21 */                    i11oi01ll3.I00oI0i.setVisibility(8);
/* 24 */                    PopupWindow popupWindow = i11oi01ll3.I00oII;
/* 26 */                    if (popupWindow != null) {
/* 28 */                        popupWindow.dismiss();
                            } else if (i11oi01ll3.I00oI0i.getParent() instanceof View) {
/* 48 */                        View view = (View) i11oi01ll3.I00oI0i.getParent();
/* 50 */                        WeakHashMap weakHashMap = OooiOl0ioo0i.I00000oIO;
/* 52 */                        view.requestApplyInsets();
                            }
/* 57 */                    i11oi01ll3.I00oI0i.I0000oI00();
/* 62 */                    i11oi01ll3.I00oO101o.I0000O(null);
/* 65 */                    i11oi01ll3.I00oO101o = null;
/* 67 */                    ViewGroup viewGroup = i11oi01ll3.I00olI;
/* 69 */                    WeakHashMap weakHashMap2 = OooiOl0ioo0i.I00000oIO;
/* 71 */                    viewGroup.requestApplyInsets();
                            break;
                    }
                }
            }

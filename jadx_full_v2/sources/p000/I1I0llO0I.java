            package p000;

            import android.view.View;
            import android.view.ViewTreeObserver;
            import java.util.ArrayList;
            import java.util.Iterator;
            
            public final class I1I0llO0I implements ViewTreeObserver.OnGlobalLayoutListener {
                public final int I00iOIl;
                public Object I00iiI;

                public I1I0llO0I(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void onGlobalLayout() {
                    switch (this.I00iOIl) {
                        case 0:
/* 142 */                   I1I1OI00IOo i1I1OI00IOo = (I1I1OI00IOo) this.I00iiI;
/* 152 */                   if (!i1I1OI00IOo.getInternalPopup().I00000oIO()) {
/* 164 */                       i1I1OI00IOo.I00ilO0.I000o00OoI0I(i1I1OI00IOo.getTextDirection(), i1I1OI00IOo.getTextAlignment());
                            }
/* 167 */                   ViewTreeObserver viewTreeObserver = i1I1OI00IOo.getViewTreeObserver();
/* 171 */                   if (viewTreeObserver != null) {
/* 173 */                       viewTreeObserver.removeOnGlobalLayoutListener(this);
                                break;
                            }
                            break;
                        case 1:
/* 111 */                   I1I1Io i1I1Io = (I1I1Io) this.I00iiI;
/* 113 */                   I1I1OI00IOo i1I1OI00IOo2 = i1I1Io.I0100i;
/* 119 */                   if (!i1I1OI00IOo2.isAttachedToWindow() || !i1I1OI00IOo2.getGlobalVisibleRect(i1I1Io.I00ooiO1I)) {
/* 136 */                       i1I1Io.dismiss();
                                break;
                            } else {
/* 129 */                       i1I1Io.I0010o();
/* 132 */                       i1I1Io.I0001Ioi1lo();
                                break;
                            }
                            break;
                        case 2:
/* 43 */                    IO0iOlIO1o iO0iOlIO1o = (IO0iOlIO1o) this.I00iiI;
/* 45 */                    ArrayList arrayList = iO0iOlIO1o.I00ioIO;
/* 51 */                    if (iO0iOlIO1o.I00000oIO() && arrayList.size() > 0 && !((IO0iO0oo1o01) arrayList.get(0)).I00000oIO.I00oli) {
/* 72 */                        View view = iO0iOlIO1o.I00o0iI0io1;
/* 74 */                        if (view != null && view.isShown()) {
/* 83 */                            Iterator it = arrayList.iterator();
/* 91 */                            while (it.hasNext()) {
/* 101 */                               ((IO0iO0oo1o01) it.next()).I00000oIO.I0001Ioi1lo();
                                    }
                                    break;
                                } else {
/* 105 */                           iO0iOlIO1o.dismiss();
                                    break;
                                }
                            }
                            break;
                        default:
/* 8 */                     OlIlil1IO1I olIlil1IO1I = (OlIlil1IO1I) this.I00iiI;
/* 10 */                    O1l0IO o1l0IO = olIlil1IO1I.I00ioIO;
/* 16 */                    if (olIlil1IO1I.I00000oIO() && !o1l0IO.I00oli) {
/* 22 */                        View view2 = olIlil1IO1I.I00lli11;
/* 24 */                        if (view2 != null && view2.isShown()) {
/* 33 */                            o1l0IO.I0001Ioi1lo();
                                    break;
                                } else {
/* 37 */                            olIlil1IO1I.dismiss();
                                    break;
                                }
                            }
                            break;
                    }
                }
            }

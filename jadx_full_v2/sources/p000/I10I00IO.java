            package p000;

            import android.view.MotionEvent;
            import kotlin.jvm.functions.Function1;
            
            public final class I10I00IO implements Function1 {
                public final int I00iOIl;
                public Oooio0iiI0 I00iiI;

                public I10I00IO(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
                    I10OIIo i10OIIo;
                    boolean zDispatchTouchEvent;
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Oooio0iiI0 oooio0iiI0 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 82 */                    oooio0iiI0.I00o101lO = (Function1) obj;
/* 84 */                    return ooiIlOl1iI;
                        case 1:
/* 33 */                    OIlO000O01 oIlO000O01 = (OIlO000O01) obj;
/* 42 */                    I0lio1O01i01 i0lio1O01i01 = oIlO000O01 instanceof I0lio1O01i01 ? (I0lio1O01i01) oIlO000O01 : null;
/* 43 */                    if (i0lio1O01i01 != null && (i10OIIo = i0lio1O01i01.I010ioo) != null) {
/* 50 */                        i10OIIo.removeViewInLayout(oooio0iiI0);
/* 69 */                        OoOOI1100oI0.I00000oIO(i10OIIo.getLayoutNodeToHolder()).remove(i10OIIo.getHolderToLayoutNode().remove(oooio0iiI0));
/* 73 */                        oooio0iiI0.setImportantForAccessibility(0);
                            }
/* 76 */                    oooio0iiI0.removeAllViewsInLayout();
/* 79 */                    return ooiIlOl1iI;
                        default:
/* 10 */                    MotionEvent motionEvent = (MotionEvent) obj;
                            switch (motionEvent.getActionMasked()) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
/* 24 */                            zDispatchTouchEvent = oooio0iiI0.dispatchTouchEvent(motionEvent);
                                    break;
                                default:
/* 19 */                            zDispatchTouchEvent = oooio0iiI0.dispatchGenericMotionEvent(motionEvent);
                                    break;
                            }
/* 28 */                    return Boolean.valueOf(zDispatchTouchEvent);
                    }
                }
            }

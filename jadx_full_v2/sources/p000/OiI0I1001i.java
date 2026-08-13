            package p000;

            import android.content.Context;
            import android.view.OrientationEventListener;
            import java.util.Iterator;
            import java.util.List;
            
            public final class OiI0I1001i extends OrientationEventListener {
                public final OiI0OoOIi I00000oIO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OiI0I1001i(Context context, OiI0OoOIi oiI0OoOIi) {
/* 3 */             super(context);
/* 1 */             this.I00000oIO = oiI0OoOIi;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
                /* JADX WARN: Removed duplicated region for block: B:18:0x0025  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void onOrientationChanged(int i) {
                    List listI00iIi0i1o;
/* 2 */             if (i == -1) {
/* 168 */               return;
                    }
/* 6 */             OiI0OoOIi oiI0OoOIi = this.I00000oIO;
/* 10 */            int i2 = 1;
/* 14 */            if (oiI0OoOIi.I0000O == -1) {
/* 18 */                if (i < 0 || i >= 45) {
/* 26 */                    if (45 <= i && i < 135) {
/* 30 */                        i2 = 3;
                            } else if (135 <= i && i < 225) {
/* 38 */                        i2 = 2;
                            } else if (225 > i || i >= 315) {
/* 22 */                        i2 = 0;
                            }
                        }
                    } else if ((i < 0 || i >= 40) && (320 > i || i >= 360)) {
/* 65 */                if (50 > i || i >= 130) {
/* 74 */                    if (140 > i || i >= 220) {
/* 83 */                        if (230 > i || i >= 310) {
/* 90 */                            i2 = oiI0OoOIi.I0000O;
                                }
                            }
                        }
                    }
/* 92 */            OiI0OoOIi oiI0OoOIi2 = this.I00000oIO;
/* 96 */            if (oiI0OoOIi2.I0000O != i2) {
/* 98 */                oiI0OoOIi2.I0000O = i2;
                        synchronized (oiI0OoOIi2.I00000oIO) {
/* 111 */                   listI00iIi0i1o = IOOi0Ool1i.I00iIi0i1o(oiI0OoOIi2.I0000Il00O.values());
                        }
/* 118 */               Iterator it = listI00iIi0i1o.iterator();
/* 126 */               while (it.hasNext()) {
/* 134 */                   ((OiI0O1ooi1) it.next()).I00000oIO(i2);
                        }
                    }
                }
            }

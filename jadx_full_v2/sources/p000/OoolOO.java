            package p000;

            import android.view.View;
            import java.lang.invoke.VarHandle;
            import java.lang.ref.WeakReference;
            
            public final class OoolOO {
                public WeakReference I00000oIO;

                public final void I00000oIO(float f) {
/* 7 */             View view = (View) this.I00000oIO.get();
/* 9 */             if (view != null) {
/* 15 */                view.animate().alpha(f);
                    }
                }

                public final void I00000oOI() {
/* 7 */             View view = (View) this.I00000oIO.get();
/* 9 */             if (view != null) {
/* 15 */                view.animate().cancel();
                    }
                }

                public final void I0000Il00O(long j) {
/* 7 */             View view = (View) this.I00000oIO.get();
/* 9 */             if (view != null) {
/* 15 */                view.animate().setDuration(j);
                    }
                }

                public final void I0000O(Oooli0Olo10 oooli0Olo10) {
/* 7 */             View view = (View) this.I00000oIO.get();
/* 9 */             if (view != null) {
/* 11 */                if (oooli0Olo10 != null) {
/* 22 */                    view.animate().setListener(new I0I0oIi0oll(oooli0Olo10, view));
                        } else {
/* 31 */                    view.animate().setListener(null);
                        }
                    }
                }

                public final void I0000oI00(iiOlilo0IIIl iiolilo0iiil) {
                    OiOOl11Oloi oiOOl11Oloi;
/* 7 */             View view = (View) this.I00000oIO.get();
/* 9 */             if (view != null) {
/* 11 */                if (iiolilo0iiil != null) {
/* 16 */                    oiOOl11Oloi = new OiOOl11Oloi(1);
/* 19 */                    oiOOl11Oloi.I00000oOI = iiolilo0iiil;
/* 21 */                    VarHandle.storeStoreFence();
                        } else {
/* 25 */                    oiOOl11Oloi = null;
                        }
/* 30 */                view.animate().setUpdateListener(oiOOl11Oloi);
                    }
                }

                public final void I0001Ioi1lo(float f) {
/* 7 */             View view = (View) this.I00000oIO.get();
/* 9 */             if (view != null) {
/* 15 */                view.animate().translationY(f);
                    }
                }
            }

            package p000;

            import android.view.View;
            import android.view.animation.Interpolator;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            
            public final class OoolOolooll {
                public final ArrayList I00000oIO;
                public long I00000oOI = -1;
                public Interpolator I0000Il00O;
                public Oooli0Olo10 I0000O;
                public boolean I0000oI00;
                public final Oo1ii1o I0001Ioi1lo;

                public OoolOolooll() {
/* 11 */            Oo1ii1o oo1ii1o = new Oo1ii1o(1);
/* 14 */            oo1ii1o.I0000O = this;
/* 17 */            oo1ii1o.I00000oOI = false;
/* 19 */            oo1ii1o.I0000Il00O = 0;
/* 21 */            VarHandle.storeStoreFence();
/* 24 */            this.I0001Ioi1lo = oo1ii1o;
/* 31 */            this.I00000oIO = new ArrayList();
                }

                public final void I00000oIO() {
/* 3 */             if (this.I0000oI00) {
/* 8 */                 Iterator it = this.I00000oIO.iterator();
/* 16 */                while (it.hasNext()) {
/* 24 */                    ((OoolOO) it.next()).I00000oOI();
                        }
/* 29 */                this.I0000oI00 = false;
                    }
                }

                public final void I00000oOI() {
                    View view;
/* 3 */             if (this.I0000oI00) {
/* 5 */                 return;
                    }
/* 8 */             Iterator it = this.I00000oIO.iterator();
/* 16 */            while (it.hasNext()) {
/* 22 */                OoolOO ooolOO = (OoolOO) it.next();
/* 24 */                long j = this.I00000oOI;
/* 30 */                if (j >= 0) {
/* 32 */                    ooolOO.I0000Il00O(j);
                        }
/* 35 */                Interpolator interpolator = this.I0000Il00O;
/* 37 */                if (interpolator != null && (view = (View) ooolOO.I00000oIO.get()) != null) {
/* 53 */                    view.animate().setInterpolator(interpolator);
                        }
/* 58 */                if (this.I0000O != null) {
/* 62 */                    ooolOO.I0000O(this.I0001Ioi1lo);
                        }
/* 71 */                View view2 = (View) ooolOO.I00000oIO.get();
/* 73 */                if (view2 != null) {
/* 79 */                    view2.animate().start();
                        }
                    }
/* 84 */            this.I0000oI00 = true;
                }
            }
